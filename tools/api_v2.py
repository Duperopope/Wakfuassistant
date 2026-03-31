# -*- coding: utf-8 -*-
"""
api_v2.py - Wakfu Assistant API v2
=====================================
Architecture propre: FastAPI + SQLite via db.py
Remplace weights_api.py (monolithe 1136 lignes)

Lancement:
    python tools/api_v2.py --port 8042

Endpoints publics (cle API requise):
    GET /api/v1/players
    GET /api/v1/players/{name}
    GET /api/v1/guilds
    GET /api/v1/classes
    GET /api/v1/recent
    GET /api/v1/stats
    GET /api/v1/armory
    GET /api/v1/search
    GET /api/v1/docs

Endpoints internes (pas de cle):
    GET  /                  -> SPA frontend
    GET  /icons/{cat}/{id}  -> icones items/spells
    GET  /api/events        -> SSE temps reel
    POST /api/reload        -> recharger les donnees
"""
import sys
import os
import argparse
import asyncio
import logging
import threading
import time
import json
import sqlite3
from collections import defaultdict
from hdv_sync import run_sync as hdv_run_sync
import re
from pathlib import Path

from fastapi import FastAPI, Query, Request, Response, Header
from fastapi.middleware.cors import CORSMiddleware
from fastapi.responses import (
    HTMLResponse, JSONResponse, FileResponse, StreamingResponse
)
import uvicorn

# Ajouter le dossier tools au path
sys.path.insert(0, str(Path(__file__).resolve().parent))
from db import WakfuDB

# =====================================================
# CONFIG
# =====================================================
BASE_DIR = Path(__file__).resolve().parent.parent
PLAYERS_DIR = BASE_DIR / "logs" / "players"
DB_PATH = BASE_DIR / "logs" / "wakfu.db"
ICONS_DIR = BASE_DIR / "src-web" / "icons"
WEB_DIR = BASE_DIR / "src-web"
ITEMS_JSON = BASE_DIR / "rnd" / "data" / "cdn_items.json"
COOLDOWN = 5          # secondes entre reloads
HDV_FORCE_INTERVAL = 30  # secondes entre force-sync HDV indépendamment du mtime

VALID_BREEDS = {"Feca","Osamodas","Enutrof","Sram","Xelor","Ecaflip","Eniripsa","Iop","Cra","Sadida","Sacrieur","Pandawa","Roublard","Zobal","Steamer","Eliotrope","Huppermage","Ouginak"}

MANUAL_EQUIP_FILE = BASE_DIR / "logs" / "manual_equip.json"
_manual_equip: dict = {}  # slot_name → {item_id, type_id}

def _load_manual_equip():
    global _manual_equip
    if MANUAL_EQUIP_FILE.exists():
        try:
            with open(MANUAL_EQUIP_FILE, encoding="utf-8") as f:
                _manual_equip = json.load(f)
        except Exception:
            _manual_equip = {}

def _save_manual_equip():
    MANUAL_EQUIP_FILE.parent.mkdir(parents=True, exist_ok=True)
    with open(MANUAL_EQUIP_FILE, "w", encoding="utf-8") as f:
        json.dump(_manual_equip, f, ensure_ascii=False, indent=2)

_load_manual_equip()

ACTIVE_CHAR_FILE = BASE_DIR / "logs" / "active_character.txt"
_active_player: str = ""

def _load_active_player():
    global _active_player
    if ACTIVE_CHAR_FILE.exists():
        _active_player = ACTIVE_CHAR_FILE.read_text(encoding="utf-8").strip()

def _save_active_player(name: str):
    ACTIVE_CHAR_FILE.parent.mkdir(parents=True, exist_ok=True)
    ACTIVE_CHAR_FILE.write_text(name, encoding="utf-8")

def _get_player_file(name: str = "") -> dict | None:
    """Charge players/{name}.json ou le fichier le plus récent avec équipement."""
    player_dir = BASE_DIR / "logs" / "players"
    if name:
        p = player_dir / f"{name}.json"
        if p.exists():
            try:
                with open(p, encoding="utf-8") as f:
                    return json.load(f)
            except Exception:
                pass
    # Fallback: fichier le plus récent avec équipement non vide (hors snapshots _tN)
    best_t, best_data = 0, None
    for p in player_dir.glob("*.json"):
        if "_t" in p.stem:
            continue
        mtime = p.stat().st_mtime
        if mtime <= best_t:
            continue
        try:
            with open(p, encoding="utf-8") as f:
                d = json.load(f)
            if d.get("equipment"):
                best_t, best_data = mtime, d
        except Exception:
            pass
    return best_data

_load_active_player()

logging.basicConfig(
    level=logging.INFO,
    format="%(asctime)s [%(name)s] %(levelname)s: %(message)s",
    datefmt="%H:%M:%S"
)
log = logging.getLogger("wakfu.api")

# =====================================================
# DATABASE
# =====================================================
db = WakfuDB(str(DB_PATH))
log.info("DB: %s (%d joueurs)", DB_PATH, db.get_stats()["total_players"])

# =====================================================
# CALCULATE WEIGHTS (import conditionnel)
# =====================================================
try:
    from calculate_weights import (
        charger_items, calculer_joueur, parser_equipment,
        parser_guild, parser_spells, SLOT_NAMES
    )
    _items_db = charger_items(ITEMS_JSON)
    log.info("Items DB: %d items charges", len(_items_db))
except ImportError:
    log.warning("calculate_weights non trouve, scores indisponibles")
    _items_db = {}
    SLOT_NAMES = {
        0: "Casque", 3: "Épaulettes", 4: "Amulette", 5: "Plastron",
        7: "Bague G", 8: "Bague D", 10: "Ceinture", 12: "Bottes",
        13: "Cape", 15: "Arme", 16: "Seconde main", 17: "Outil",
        22: "Familier", 24: "Monture",
    }
    def calculer_joueur(*a, **kw): return None
    def parser_equipment(s): return {}
    def parser_guild(s): return (0, "")
    def parser_spells(s, b): return {}

# =====================================================
# SSE (Server-Sent Events)
# =====================================================
_sse_clients: list[asyncio.Queue] = []
_sse_lock = threading.Lock()
_event_loop: asyncio.AbstractEventLoop | None = None

def broadcast_sse(event: str, data: dict):
    """Envoyer un evenement a tous les clients SSE (thread-safe)."""
    msg = json.dumps(data, ensure_ascii=False)
    payload = {"event": event, "data": msg}
    loop = _event_loop
    if loop is None or not loop.is_running():
        return
    with _sse_lock:
        for q in list(_sse_clients):
            def _put(q=q, p=payload):
                try:
                    q.put_nowait(p)
                except asyncio.QueueFull:
                    pass
            loop.call_soon_threadsafe(_put)

# =====================================================
# WATCHER: surveille les fichiers joueurs
# =====================================================
_last_reload = 0
_reload_lock = threading.Lock()

def reload_players():
    """Recharger les fichiers joueurs et mettre a jour la DB."""
    global _last_reload
    with _reload_lock:
        now = time.time()
        if now - _last_reload < COOLDOWN:
            return 0
        _last_reload = now

    t0 = time.time()
    count = 0
    errors = 0

    for fpath in sorted(PLAYERS_DIR.glob("*.json")):
        fname = fpath.name
        # Ignorer les snapshots _t (deja migres)
        if "_t" in fname and re.match(r".*_t\d+\.json$", fname):
            continue
        try:
            with open(fpath, "r", encoding="utf-8") as f:
                raw = json.load(f)

            name = raw.get("name", fname.replace(".json", ""))
            breed_name_raw = raw.get("breedName", "")
            if breed_name_raw not in VALID_BREEDS:
                continue
            guild_raw = raw.get("guild", "")
            guild_id, guild_name = parser_guild(guild_raw) if callable(parser_guild) else (0, "")

            # Calculer les poids
            result = calculer_joueur(raw, _items_db) if _items_db else None

            player_data = {
                "name": name,
                "level": raw.get("level", 0),
                "breed_id": raw.get("breedId", 0),
                "breed_name": raw.get("breedName", ""),
                "sex": raw.get("sex", 0),
                "guild_name": guild_name if guild_name else None,
                "guild_id": guild_id if guild_id else None,
                "nation_id": raw.get("nationId", 0),
                "equipment": raw.get("equipment", ""),
                "equipment_level": raw.get("equipmentLevel", 0),
                "spells": raw.get("spells", ""),
                "appearance": raw.get("appearance", ""),
                "active_title": raw.get("activeTitleName", ""),
                "score_global": 0,
                "poids_offensif": 0,
                "poids_defensif": 0,
                "poids_resistance": 0,
                "poids_soin": 0,
                "pa": 0,
                "pm": 0,
            }

            if result:
                off = result.get("poids_offensif", 0) or 0
                deff = result.get("poids_defensif", 0) or 0
                res = result.get("total_res", 0) or 0
                pv = result.get("total_pv", 0) or 0
                score = round(off + deff, 1)
                player_data["score_global"] = score
                player_data["poids_offensif"] = round(off, 1)
                player_data["poids_defensif"] = round(deff, 1)
                player_data["poids_resistance"] = res
                player_data["poids_soin"] = pv
                player_data["pa"] = result.get("pa", 0)
                player_data["pm"] = result.get("pm", 0)

            db.upsert_player(player_data)
            count += 1

        except Exception as e:
            errors += 1
            if errors <= 3:
                log.warning("Erreur %s: %s", fname, str(e)[:80])

    duration = int((time.time() - t0) * 1000)
    db.log_scan("reload", count, duration)
    log.info("Reload: %d joueurs en %d ms (erreurs: %d)", count, duration, errors)
    broadcast_sse("reload", {"players": count, "duration_ms": duration})
    return count



def reload_single_player(fpath):
    """Recharger UN seul joueur depuis son fichier JSON."""
    try:
        with open(fpath, "r", encoding="utf-8") as f:
            raw = json.load(f)
        name = raw.get("name", os.path.basename(str(fpath)).replace(".json", ""))
        guild_raw = raw.get("guild", "")
        guild_id, guild_name = parser_guild(guild_raw) if callable(parser_guild) else (0, "")
        result = calculer_joueur(raw, _items_db) if _items_db else None
        player_data = {
            "name": name,
            "level": raw.get("level", 0),
            "breed_id": raw.get("breedId", 0),
            "breed_name": raw.get("breedName", ""),
            "sex": raw.get("sex", 0),
            "guild_name": guild_name if guild_name else None,
            "guild_id": guild_id if guild_id else None,
            "nation_id": raw.get("nationId", 0),
            "equipment": raw.get("equipment", ""),
            "equipment_level": raw.get("equipmentLevel", 0),
            "spells": raw.get("spells", ""),
            "appearance": raw.get("appearance", ""),
            "active_title": raw.get("activeTitleName", ""),
            "score_global": 0, "poids_offensif": 0, "poids_defensif": 0,
            "poids_resistance": 0, "poids_soin": 0, "pa": 0, "pm": 0,
        }
        if result:
            off = result.get("poids_offensif", 0) or 0
            deff = result.get("poids_defensif", 0) or 0
            player_data["score_global"] = round(off + deff, 1)
            player_data["poids_offensif"] = round(off, 1)
            player_data["poids_defensif"] = round(deff, 1)
            player_data["poids_resistance"] = result.get("total_res", 0) or 0
            player_data["poids_soin"] = result.get("total_pv", 0) or 0
            player_data["pa"] = result.get("pa", 0)
            player_data["pm"] = result.get("pm", 0)
        db.upsert_player(player_data)
        return name
    except Exception as e:
        log.warning("Erreur reload %s: %s", str(fpath), str(e)[:80])
        return None


def _start_watcher():
    """Thread de surveillance unifie: joueurs + HDV + coffre + inventaire."""
    def _run():
        log.info("Watcher unifie sur %s (cooldown %ds)", PLAYERS_DIR, COOLDOWN)
        last_mtimes = {}
        for fpath in PLAYERS_DIR.glob("*.json"):
            if "_t" in fpath.name:
                continue
            try:
                last_mtimes[fpath.name] = fpath.stat().st_mtime
            except:
                pass
        log.info("Watcher: %d fichiers joueurs indexes", len(last_mtimes))

        hdv_proto = BASE_DIR / "logs" / "market_v3_proto.log"
        chest_file = BASE_DIR / "logs" / "account_chest_full.json"
        inv_file = BASE_DIR / "logs" / "inventory_bags.json"
        hdv_db = BASE_DIR / "logs" / "hdv_market.db"

        extra_mtimes = {}
        hdv_offset = 0
        last_hdv_force = 0.0  # timestamp du dernier force-sync HDV
        for fp in [hdv_proto, chest_file, inv_file]:
            try:
                extra_mtimes[str(fp)] = fp.stat().st_mtime
            except:
                extra_mtimes[str(fp)] = 0

        if hdv_proto.exists():
            try:
                count, hdv_offset = hdv_run_sync(str(hdv_proto), str(hdv_db))
                last_hdv_force = time.time()
                log.info("Watcher: HDV sync initiale, %d entries, offset=%d", count, hdv_offset)
            except Exception as e:
                log.warning("Watcher: HDV sync initiale error: %s", e)

        while True:
            time.sleep(COOLDOWN)
            try:
                changed = []
                for fpath in PLAYERS_DIR.glob("*.json"):
                    if "_t" in fpath.name:
                        continue
                    try:
                        mtime = fpath.stat().st_mtime
                    except:
                        continue
                    if fpath.name not in last_mtimes or last_mtimes[fpath.name] != mtime:
                        last_mtimes[fpath.name] = mtime
                        changed.append(fpath)
                if changed:
                    t0 = time.time()
                    names = []
                    for fpath in changed:
                        name = reload_single_player(fpath)
                        if name:
                            names.append(name)
                    ms = int((time.time() - t0) * 1000)
                    log.info("Watcher: %d joueur(s) en %d ms (%s)",
                             len(names), ms,
                             ", ".join(names[:5]) + ("..." if len(names) > 5 else ""))
                    if names:
                        db.log_scan("incremental", len(names), ms, ", ".join(names[:20]))
                        broadcast_sse("update", {"players": names[:20], "count": len(names), "duration_ms": ms})

                if hdv_proto.exists():
                    try:
                        mt = hdv_proto.stat().st_mtime
                        now_t = time.time()
                        mtime_changed = mt != extra_mtimes.get(str(hdv_proto), 0)
                        force_due = (now_t - last_hdv_force) >= HDV_FORCE_INTERVAL
                        if mtime_changed or force_due:
                            extra_mtimes[str(hdv_proto)] = mt
                            count, hdv_offset = hdv_run_sync(str(hdv_proto), str(hdv_db), hdv_offset)
                            last_hdv_force = now_t
                            if count > 0:
                                log.info("Watcher: HDV +%d entries (offset=%d)", count, hdv_offset)
                                broadcast_sse("hdv", {"new_entries": count, "offset": hdv_offset})
                            elif force_due:
                                # Force-sync sans nouveaux entries : signaler quand même pour
                                # que le frontend rafraîchisse les dates
                                broadcast_sse("hdv", {"new_entries": 0, "offset": hdv_offset, "heartbeat": True})
                    except Exception as e:
                        log.warning("Watcher HDV error: %s", e)

                if chest_file.exists():
                    try:
                        mt = chest_file.stat().st_mtime
                        if mt != extra_mtimes.get(str(chest_file), 0):
                            extra_mtimes[str(chest_file)] = mt
                            log.info("Watcher: coffre mis a jour")
                            broadcast_sse("chest", {"file": "account_chest_full.json", "updated": True})
                    except Exception as e:
                        log.warning("Watcher chest error: %s", e)

                if inv_file.exists():
                    try:
                        mt = inv_file.stat().st_mtime
                        if mt != extra_mtimes.get(str(inv_file), 0):
                            extra_mtimes[str(inv_file)] = mt
                            log.info("Watcher: inventaire mis a jour")
                            broadcast_sse("inventory", {"file": "inventory_bags.json", "updated": True})
                    except Exception as e:
                        log.warning("Watcher inventory error: %s", e)

            except Exception as e:
                log.warning("Watcher error: %s", e)
    t = threading.Thread(target=_run, name="UnifiedWatcher", daemon=True)
    t.start()



# =====================================================
# FASTAPI APP
# =====================================================
app = FastAPI(
    title="Wakfu Assistant API",
    version="2.0.0",
    description="API pour l'analyse des joueurs Wakfu"
)

@app.on_event("startup")
async def _capture_event_loop():
    global _event_loop
    _event_loop = asyncio.get_running_loop()
    log.info("Event loop SSE capture (thread-safe broadcasts actifs)")

app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],
    allow_methods=["*"],
    allow_headers=["*"],
)


# =====================================================
# AUTH MIDDLEWARE (optionnel pour /api/v1/)
# =====================================================
def check_auth(request: Request) -> dict | None:
    """Verifie la cle API. Retourne None si pas de cle requise."""
    key = request.headers.get("X-API-Key") or request.query_params.get("api_key")
    if not key:
        return None
    return db.validate_api_key(key)


# =====================================================
# ENDPOINTS v1 (publics)
# =====================================================

@app.get("/api/v1/players")
async def api_v1_players(
    request: Request,
    breed: str = "", guild: str = "",
    min_level: int = 0, max_level: int = 999,
    search: str = "", sort: str = "score_global",
    order: str = "DESC", limit: int = 500, offset: int = 0
):
    players = db.get_players(
        breed=breed, guild=guild,
        min_level=min_level, max_level=max_level,
        search=search, sort=sort, order=order,
        limit=limit, offset=offset
    )
    total = db.count_players(
        breed=breed, guild=guild,
        min_level=min_level, max_level=max_level,
        search=search
    )
    return {"total": total, "players": players}


@app.get("/api/v1/players/{name:path}")
async def api_v1_player_detail(name: str):
    player = db.get_player(name)
    if not player:
        return JSONResponse({"error": "Joueur introuvable"}, status_code=404)

    # Enrichir avec les calculs
    if _items_db and player.get("equipment"):
        # Reconstruire le dict brut pour calculer_joueur
        raw = {
            "name": player["name"],
            "level": player["level"],
            "breedId": player["breed_id"],
            "breedName": player["breed_name"],
            "equipment": player["equipment"],
            "equipmentLevel": player["equipment_level"],
            "spells": player.get("spells", ""),
            "builds": "",
        }
        result = calculer_joueur(raw, _items_db)
        if result:
            off = result.get("poids_offensif", 0) or 0
            deff = result.get("poids_defensif", 0) or 0
            player["computed"] = {
                "score_global": round(off + deff, 1),
                "poids_offensif": round(off, 1),
                "poids_defensif": round(deff, 1),
                "poids_resistance": result.get("total_res", 0) or 0,
                "total_pv": result.get("total_pv", 0) or 0,
                "equipment_detail": result.get("items_detail", []),
                "spells_detail": result.get("spells_data", []),
                "pa": result.get("pa", 0),
                "pm": result.get("pm", 0),
                "esquive": result.get("esquive", 0) or 0,
                "tacle": result.get("tacle", 0) or 0,
                "coup_crit": result.get("coup_crit", 0) or 0,
            }

    return player


@app.get("/api/v1/guilds")
async def api_v1_guilds():
    return {"guilds": db.get_guilds()}


@app.get("/api/v1/classes")
async def api_v1_classes():
    return {"classes": db.get_classes()}


@app.get("/api/v1/recent")
async def api_v1_recent(limit: int = 100):
    return {"players": db.get_recent(limit=limit)}


@app.get("/api/v1/stats")
async def api_v1_stats():
    return db.get_stats()


@app.get("/api/v1/armory")
async def api_v1_armory(
    breed: str = "", min_level: int = 0,
    max_level: int = 999, top: int = 0
):
    return db.get_armory(breed=breed, min_level=min_level,
                         max_level=max_level, top=top)


@app.get("/api/v1/search")
async def api_v1_search(q: str = ""):
    if len(q) < 2:
        return {"results": []}
    return {"results": db.search_players(q)}


@app.get("/api/v1/docs")
async def api_v1_docs():
    return {
        "name": "Wakfu Assistant API",
        "version": "2.0.0",
        "endpoints": [
            {"method": "GET", "path": "/api/v1/players", "params": "breed, guild, min_level, max_level, search, sort, order, limit, offset"},
            {"method": "GET", "path": "/api/v1/players/{name}", "params": ""},
            {"method": "GET", "path": "/api/v1/guilds", "params": ""},
            {"method": "GET", "path": "/api/v1/classes", "params": ""},
            {"method": "GET", "path": "/api/v1/recent", "params": "limit"},
            {"method": "GET", "path": "/api/v1/stats", "params": ""},
            {"method": "GET", "path": "/api/v1/armory", "params": "breed, min_level, max_level, top"},
            {"method": "GET", "path": "/api/v1/search", "params": "q"},
        ],
        "auth": "Header X-API-Key ou query param api_key",
    }




# =====================================================
# CDN ITEM DETAIL (pour tooltips)
# =====================================================

@app.get("/api/cdn/{item_id}")
async def api_cdn_item(item_id: int):
    """Retourne les details complets d'un item CDN pour le tooltip."""
    result = {}

    # 1) DB SQLite (nom, level, rarity, gfx_id, type_id)
    cdn_item = db.get_cdn_item(item_id)
    if cdn_item:
        result = dict(cdn_item)

    # 2) items_db en memoire (effects complets + description)
    item = _items_db.get(item_id)
    if item:
        result["item_ref_id"] = item_id
        result["name_fr"] = item.get("name_fr", result.get("name_fr", ""))
        result["level"] = item.get("level", result.get("level", 0))
        result["rarity"] = item.get("rarity", result.get("rarity", 0))
        result["type_id"] = item.get("itemTypeId", result.get("type_id", 0))
        result["gfx_id"] = item.get("gfxId", result.get("gfx_id", 0))
        result["effects"] = item.get("effects", [])
        result["desc_fr"] = item.get("desc_fr", "")

    if not result:
        return JSONResponse({"error": "Item introuvable"}, status_code=404)

    return result

# =====================================================
# ENDPOINTS LEGACY (compatibilite avec le frontend actuel)
# =====================================================

@app.get("/api/players")
async def api_players_legacy(
    breed: str = "", guild: str = "",
    min_level: int = 0, max_level: int = 999,
    search: str = "", sort: str = "score_global",
    order: str = "DESC", limit: int = 500, offset: int = 0
):
    """Compatibilite avec le frontend existant."""
    players = db.get_players(
        breed=breed, guild=guild,
        min_level=min_level, max_level=max_level,
        search=search, sort=sort, order=order,
        limit=limit, offset=offset
    )
    total = db.count_players(
        breed=breed, guild=guild,
        min_level=min_level, max_level=max_level,
        search=search
    )
    # Format legacy: le frontend attend {players:[], total:N}
    ranked = []
    for i, p in enumerate(players):
        p["rank"] = offset + i + 1
        # Ajouter les alias attendus par le frontend
        p["breedName"] = p.get("breed_name", "")
        p["total_pv"] = p.get("poids_soin", 0)
        p["total_res"] = p.get("poids_resistance", 0)
        ranked.append(p)
    return {"players": ranked, "total": total}


@app.get("/api/players/{name:path}")
async def api_player_legacy(name: str):
    player = db.get_player(name)
    if not player:
        return JSONResponse({"error": "Joueur introuvable"}, status_code=404)

    # Calculer les details
    if _items_db and player.get("equipment"):
        raw = {
            "name": player["name"],
            "level": player["level"],
            "breedId": player["breed_id"],
            "breedName": player["breed_name"],
            "equipment": player["equipment"],
            "equipmentLevel": player["equipment_level"],
            "spells": player.get("spells", ""),
            "builds": "",
        }
        result = calculer_joueur(raw, _items_db)
        if result:
            off = result.get("poids_offensif", 0) or 0
            deff = result.get("poids_defensif", 0) or 0
            player.update({
                "score_global": round(off + deff, 1),
                "poids_offensif": round(off, 1),
                "poids_defensif": round(deff, 1),
                "poids_resistance": result.get("total_res", 0) or 0,
                "equipment": result.get("items_detail", []),
                "spells": result.get("spells_data", []),
                "pa": result.get("pa", 0),
                "pm": result.get("pm", 0),
                "total_pv": result.get("total_pv", 0) or 0,
                "total_res": result.get("total_res", 0) or 0,
                "esquive": result.get("esquive", 0) or 0,
                "tacle": result.get("tacle", 0) or 0,
                "coup_crit": result.get("coup_crit", 0) or 0,
            })
    return player


@app.get("/api/guilds")
async def api_guilds_legacy(min_members: int = 0, limit: int = 500):
    guilds = db.get_guilds()
    ranked = []
    for i, g in enumerate(guilds):
        g["rank"] = i + 1
        # Aliases pour le frontend (guilds.js)
        g["nb_members"] = g.get("member_count", 0)
        g["avg_poids_offensif"] = g.get("avg_score", 0) or 0
        g["avg_poids_defensif"] = 0  # pas encore calcule
        g["max_poids_offensif"] = g.get("max_score", 0) or 0
        if min_members > 0 and g["nb_members"] < min_members:
            continue
        ranked.append(g)
    return {"guilds": ranked[:limit]}


@app.get("/api/recent")
async def api_recent_legacy(limit: int = 200):
    players = db.get_recent(limit=limit)
    new_players = []
    updated_players = []
    for p in players:
        p["breedName"] = p.get("breed_name", "")
        p["detected_at"] = p.get("last_seen", "")
        p["poids_offensif"] = p.get("poids_offensif", 0) or 0
        fs = p.get("first_seen", "")
        ls = p.get("last_seen", "")
        if fs and ls and fs[:16] != ls[:16]:
            updated_players.append(p)
        else:
            new_players.append(p)
    return {"new_players": new_players, "updated_players": updated_players}


@app.get("/api/stats")
async def api_stats_legacy():
    stats = db.get_stats()
    # Aliases pour le frontend
    stats["max_poids_offensif"] = stats.get("top_score", 0)
    stats["avg_poids_offensif"] = stats.get("avg_offensif", 0)
    stats["last_update"] = stats.get("last_scan", "")
    # Ajouter les classes pour le breed filter (avec aliases)
    raw_classes = db.get_classes()
    for c in raw_classes:
        c["breedName"] = c.get("breed_name", "")
        c["avg_poids_offensif"] = c.get("avg_score", 0) or 0
        c["max_poids_offensif"] = c.get("max_score", 0) or 0
    stats["classes"] = raw_classes
    return stats


@app.get("/api/classes")
async def api_classes_legacy():
    classes = db.get_classes()
    for c in classes:
        c["breedName"] = c.get("breed_name", "")
        c["avg_poids_offensif"] = c.get("avg_score", 0) or 0
        c["max_poids_offensif"] = c.get("max_score", 0) or 0
    return {"classes": classes}


@app.get("/api/search")
async def api_search_legacy(q: str = ""):
    if len(q) < 2:
        return {"players": []}
    results = db.search_players(q)
    # Ajouter aliases pour le frontend
    for p in results:
        p["breedName"] = p.get("breed_name", "")
        p["total_pv"] = 0
        p["total_res"] = 0
        p["poids_offensif"] = p.get("score_global", 0)
        p["poids_defensif"] = 0
        p["pa"] = 0
        p["pm"] = 0
    return {"players": results}


@app.get("/api/inventory")
async def api_inventory_legacy(
    breed: str = "", top: int = 0,
    min_level: int = 0, max_level: int = 999
):
    """Compatibilite avec le frontend Armurerie."""
    return db.get_armory(breed=breed, min_level=min_level,
                         max_level=max_level, top=top)


@app.post("/api/reload")
async def api_reload_legacy():
    count = reload_players()
    return {"reloaded": count}


# =====================================================
# BUILDER SRAM
# =====================================================

def _sram_score(item_data: dict) -> dict:
    """
    Score spécifique Sram burst-mêlée.
    Priorités (doc référence Sram) :
      +PA  > Mêlée > Élém-4 > %CC > Mêlée critique > Maît.dos > Maît.critique > PM > PW
    Terre et Distance sont quasi-inutiles pour le Sram.
    """
    effets = item_data.get("effects", [])
    action_ids = {e["actionId"] for e in effets}
    cumul = (1052 in action_ids) and (1053 in action_ids)  # mêlée ET distance sur le même item

    score = 0.0
    bd = {}  # breakdown lisible

    def add(key, val):
        nonlocal score
        score += val
        bd[key] = round(bd.get(key, 0) + val)

    for eff in effets:
        aid = eff["actionId"]
        p = eff.get("params", [])
        v = float(p[0]) if p else 0.0

        # ── Maîtrises offensives ─────────────────────────────────
        if aid == 1052:   # Mêlée (tous les sorts Sram = mêlée)
            add("mêlée",    v * (125 if cumul else 200))
        elif aid == 1053: # Distance — presque inutile
            add("distance", v * (50 if cumul else 20))
        elif aid == 120:  # Élémentaire 4 élém
            add("élém",     v * 167)
        elif aid == 1068: # Élémentaire variable (N élems)
            nb = int(p[2]) if len(p) > 2 else 1
            add("élém",     v * {1: 100, 2: 130, 3: 155, 4: 167}.get(nb, 167))
        elif aid in (122, 124, 125):  # Feu / Eau / Air mono
            add("élém_mono", v * 100)
        elif aid == 123:  # Terre — Sram n'a aucun sort Terre
            add("terre",    v * 15)
        elif aid == 149:  # Maîtrise critique
            add("critique", v * 135)
        elif aid == 180:  # Maîtrise dos (×1.25 multiplicateur séparé)
            add("dos",      v * 115)
        elif aid == 1055: # Maîtrise berserk (niche)
            add("berserk",  v * 70)
        elif aid == 26:   # Maîtrise soin — inutile DPS
            add("soin",     v * 5)
        # ── % CC — très précieux (target 100 %) ─────────────────
        elif aid == 150:  # +% CC
            add("cc%",      v * 550)
        elif aid == 168:  # -% CC
            add("cc%",     -v * 550)
        # ── Stats majeures ───────────────────────────────────────
        elif aid == 31:   # +PA
            add("PA",       v * 3000)
        elif aid == 56:   # -PA
            add("PA",      -v * 3000)
        elif aid == 41:   # +PM
            add("PM",       v * 700)
        elif aid == 57:   # -PM
            add("PM",      -v * 700)
        elif aid == 191:  # +PW
            add("PW",       v * 400)
        elif aid == 160:  # +Portée
            add("portée",   v * 200)
        # ── Pertes offensives explicites ────────────────────────
        elif aid == 130:  # -Maît.Élém
            add("élém",    -v * 167)
        elif aid == 1059: # -Maît.Mêlée
            add("mêlée",   -v * (125 if cumul else 200))
        elif aid == 1056: # -Maît.Critique
            add("critique",-v * 135)
        elif aid == 181:  # -Maît.Dos
            add("dos",     -v * 115)
        elif aid == 1061: # -Maît.Berserk
            add("berserk", -v * 70)
        # ── Défensif — faible valeur en config DPS ───────────────
        elif aid == 20:   # PV
            add("pv",       v * 0.3)
        elif aid == 80:   # Rés.Élém toutes
            add("rés",      v * 0.5)

    return {"score": round(score), "breakdown": {k: v for k, v in bd.items() if v != 0}}


@app.get("/api/builder/sram")
async def api_builder_sram(level: int = 0, budget: int = 0):
    """Optimiseur Sram : compare build actuel / items possédés / HDV par slot.
    level=0 → pas de filtre ; level>0 → ne propose que des items de niveau ≤ level.
    budget=0 → pas de filtre ; budget>0 → ne propose que des offres HDV ≤ budget kamas."""
    # ── 1. Build courant (source : players/{name}.json en priorité) ───
    current_slots = {}  # slot_name → item enrichi
    type_to_slot  = {}  # typeId → slot_name
    player_name   = ""
    player_level  = 0

    player_data = _get_player_file(_active_player)
    if player_data and player_data.get("equipment"):
        equip = parser_equipment(player_data["equipment"])
        player_name  = player_data.get("name", "")
        player_level = player_data.get("level", 0)
        for slot_id, iid in equip.items():
            slot_name = SLOT_NAMES.get(slot_id, f"Slot{slot_id}")
            cdn = _items_db.get(iid, {})
            if not cdn:
                continue
            sc  = _sram_score(cdn)
            tid = cdn.get("itemTypeId", 0)
            if tid:
                type_to_slot[tid] = slot_name
            current_slots[slot_name] = {
                "id": iid, "typeId": tid,
                "name": cdn.get("name_fr", f"Item#{iid}"),
                "level": cdn.get("level", 0),
                "rarity": cdn.get("rarity", 0),
                "gfxId": cdn.get("gfxId", 0),
                "score": sc["score"],
                "breakdown": sc["breakdown"],
                "source": "build",
            }

    # Fallback : build-result.json (build optimizer)
    if not current_slots:
        br_path = Path(BASE_DIR) / "build-generator" / "data" / "build-result.json"
        if br_path.exists():
            try:
                with open(br_path, "rb") as f:
                    raw = f.read()
                if raw[:3] == b"\xef\xbb\xbf":
                    raw = raw[3:]
                br = json.loads(raw)
                for it in br.get("items", []):
                    slot = it.get("slot")
                    tid  = it.get("typeId")
                    iid  = it.get("id")
                    if not (slot and tid and iid):
                        continue
                    type_to_slot[tid] = slot
                    cdn = _items_db.get(iid, {})
                    sc  = _sram_score(cdn)
                    current_slots[slot] = {
                        "id": iid, "typeId": tid,
                        "name": cdn.get("name_fr", f"Item#{iid}"),
                        "level": cdn.get("level", it.get("level", 0)),
                        "rarity": cdn.get("rarity", it.get("rarity", 0)),
                        "gfxId": cdn.get("gfxId", 0),
                        "score": sc["score"],
                        "breakdown": sc["breakdown"],
                        "source": "build",
                    }
            except Exception as e:
                log.warning("Builder: build-result fallback error: %s", e)

    # ── Override manuel (slots configurés manuellement) ──────────────
    for slot_name, manual in _manual_equip.items():
        iid = manual.get("item_id")
        tid = manual.get("type_id")
        if not iid:
            continue
        cdn = _items_db.get(iid, {})
        sc  = _sram_score(cdn)
        if tid is None and slot_name in current_slots:
            tid = current_slots[slot_name].get("typeId")
        if tid:
            type_to_slot[tid] = slot_name
        current_slots[slot_name] = {
            "id": iid, "typeId": tid,
            "name": cdn.get("name_fr", f"Item#{iid}"),
            "level": cdn.get("level", 0),
            "rarity": cdn.get("rarity", 0),
            "gfxId": cdn.get("gfxId", 0),
            "score": sc["score"],
            "breakdown": sc["breakdown"],
            "source": "build",
        }

    if not current_slots:
        return {"error": "Aucun équipement trouvé. Configure ton personnage actif ou lance l'optimiseur.", "slots": []}

    # ── Contrainte épique (rarity=6) / relique (rarity=5) ────────────
    # Un build ne peut avoir qu'1 épique et 1 relique max.
    equipped_rarities = {v["rarity"] for v in current_slots.values()}
    has_epique  = 6 in equipped_rarities
    has_relique = 5 in equipped_rarities

    # ── 2. Items possédés (inventaire + coffre) ───────────────────────
    owned_by_type = defaultdict(list)  # typeId → [candidate]

    def _add_owned(iid, source):
        cdn = _items_db.get(iid)
        if not cdn:
            return
        if level > 0 and cdn.get("level", 0) > level:
            return
        sc = _sram_score(cdn)
        owned_by_type[cdn["itemTypeId"]].append({
            "id": iid, "name": cdn["name_fr"],
            "level": cdn["level"], "rarity": cdn["rarity"],
            "gfxId": cdn["gfxId"], "score": sc["score"],
            "breakdown": sc["breakdown"], "source": source,
        })

    inv_file = BASE_DIR / "logs" / "inventory_bags.json"
    if inv_file.exists():
        try:
            with open(inv_file, encoding="utf-8") as f:
                inv = json.load(f)
            for bag in inv.get("bags", []):
                for it in bag.get("items", []):
                    iid = it.get("refId") or it.get("itemId")
                    if iid:
                        _add_owned(int(iid), "inventaire")
        except Exception as e:
            log.warning("Builder: inv error: %s", e)

    chest_file = BASE_DIR / "logs" / "account_chest_full.json"
    if chest_file.exists():
        try:
            with open(chest_file, encoding="utf-8") as f:
                chest = json.load(f)
            for comp in chest.get("compartments", []):
                for it in comp.get("items", []):
                    iid = it.get("itemId")
                    if iid:
                        _add_owned(int(iid), "coffre")
        except Exception as e:
            log.warning("Builder: chest error: %s", e)

    # ── 3. Items HDV ──────────────────────────────────────────────────
    hdv_by_type = defaultdict(list)
    hdv_db_path = BASE_DIR / "logs" / "hdv_market.db"
    if hdv_db_path.exists():
        try:
            conn = sqlite3.connect(str(hdv_db_path))
            rows = conn.execute(
                "SELECT item_ref_id, MIN(unit_price) as best_price "
                "FROM market_latest WHERE side='sell' AND qty_remaining > 0 "
                "GROUP BY item_ref_id"
            ).fetchall()
            conn.close()
            for iid, price in rows:
                cdn = _items_db.get(iid)
                if not cdn:
                    continue
                if level > 0 and cdn.get("level", 0) > level:
                    continue
                if budget > 0 and price > budget:
                    continue
                sc = _sram_score(cdn)
                hdv_by_type[cdn["itemTypeId"]].append({
                    "id": iid, "name": cdn["name_fr"],
                    "level": cdn["level"], "rarity": cdn["rarity"],
                    "gfxId": cdn["gfxId"], "score": sc["score"],
                    "breakdown": sc["breakdown"],
                    "source": "hdv", "unit_price": price,
                })
        except Exception as e:
            log.warning("Builder: hdv error: %s", e)

    # ── 4. Assemblage par slot ────────────────────────────────────────
    def _rarity_allowed(cand_rarity: int, curr_rarity: int) -> bool:
        """Vérifie que le candidat ne viole pas la contrainte épique/relique."""
        if cand_rarity == 6:  # Épique
            # Autorisé si le slot courant est déjà épique (on le remplace)
            # ou si aucun épique n'est encore équipé
            return curr_rarity == 6 or not has_epique
        if cand_rarity == 5:  # Relique
            return curr_rarity == 5 or not has_relique
        return True  # Autres raretés toujours ok

    slots = []
    for slot_name, curr in current_slots.items():
        tid       = curr["typeId"]
        curr_id   = curr["id"]
        curr_rar  = curr["rarity"]

        seen = {curr_id}
        candidates_owned = []
        for c in owned_by_type.get(tid, []):
            if c["id"] in seen:
                continue
            if not _rarity_allowed(c["rarity"], curr_rar):
                continue
            seen.add(c["id"])
            candidates_owned.append(c)
        candidates_owned.sort(key=lambda x: -x["score"])

        candidates_hdv = []
        for c in hdv_by_type.get(tid, []):
            if c["id"] in seen:
                continue
            if not _rarity_allowed(c["rarity"], curr_rar):
                continue
            seen.add(c["id"])
            candidates_hdv.append(c)
        candidates_hdv.sort(key=lambda x: -x["score"])

        best_owned = candidates_owned[0] if candidates_owned else None
        best_hdv   = candidates_hdv[0]   if candidates_hdv   else None

        slots.append({
            "slot": slot_name,
            "typeId": tid,
            "current": curr,
            "best_owned": best_owned,
            "best_hdv":   best_hdv,
            "gain_owned": (best_owned["score"] - curr["score"]) if best_owned else None,
            "gain_hdv":   (best_hdv["score"]   - curr["score"]) if best_hdv   else None,
        })

    # Trier par gain potentiel (upgrades les plus impactants d'abord)
    slots.sort(key=lambda s: -(max(s.get("gain_hdv") or 0, s.get("gain_owned") or 0)))

    total = sum(s["current"]["score"] for s in slots)
    potential = total + sum(
        max(s.get("gain_owned") or 0, s.get("gain_hdv") or 0, 0) for s in slots
    )

    return {
        "total_score": total,
        "potential_score": potential,
        "player_name": player_name,
        "player_level": player_level,
        "slots": slots,
        "manual_equip": list(_manual_equip.keys()),
    }


@app.post("/api/builder/equip")
async def api_builder_equip_set(request: Request):
    """Définit manuellement l'item équipé dans un slot."""
    body = await request.json()
    slot    = body.get("slot")
    item_id = body.get("item_id")
    type_id = body.get("type_id")
    if not slot or not item_id:
        return JSONResponse({"error": "slot and item_id required"}, status_code=400)
    _manual_equip[slot] = {"item_id": int(item_id), "type_id": type_id}
    _save_manual_equip()
    return {"ok": True, "slot": slot, "item_id": item_id}


@app.delete("/api/builder/equip/{slot}")
async def api_builder_equip_delete(slot: str):
    """Réinitialise un slot (retour à build-result.json)."""
    removed = _manual_equip.pop(slot, None)
    if removed is not None:
        _save_manual_equip()
    return {"ok": True, "removed": removed is not None}


@app.delete("/api/builder/equip")
async def api_builder_equip_reset():
    """Réinitialise tous les slots manuels."""
    _manual_equip.clear()
    _save_manual_equip()
    return {"ok": True}


# ── Joueur actif ──────────────────────────────────────────────────────

@app.get("/api/me")
async def api_me_get():
    """Retourne le joueur actif et ses données (niveau, équipement…)."""
    data = _get_player_file(_active_player)
    players_dir = BASE_DIR / "logs" / "players"
    known = sorted(
        [p.stem for p in players_dir.glob("*.json") if "_t" not in p.stem],
        key=str.lower
    )
    if data:
        return {
            "name": data.get("name", _active_player),
            "level": data.get("level", 0),
            "breed": data.get("breedName", ""),
            "equipment_slots": len(parser_equipment(data.get("equipment", ""))),
            "known_players": known,
        }
    return {"name": "", "level": 0, "breed": "", "equipment_slots": 0, "known_players": known}


@app.post("/api/me")
async def api_me_set(request: Request):
    """Définit le personnage actif."""
    global _active_player
    body = await request.json()
    name = body.get("name", "").strip()
    _active_player = name
    _save_active_player(name)
    data = _get_player_file(name)
    return {
        "ok": True,
        "name": name,
        "level": data.get("level", 0) if data else 0,
        "equipment_slots": len(parser_equipment(data.get("equipment", ""))) if data else 0,
    }


# =====================================================
# SSE
# =====================================================

@app.post("/api/hdv/sync")
async def api_hdv_force_sync():
    """Force un re-sync complet du fichier protobuf HDV → SQLite."""
    hdv_proto = BASE_DIR / "logs" / "market_v3_proto.log"
    hdv_db    = BASE_DIR / "logs" / "hdv_market.db"
    if not hdv_proto.exists():
        return JSONResponse({"error": "market_v3_proto.log introuvable"}, status_code=404)
    try:
        count, offset = hdv_run_sync(str(hdv_proto), str(hdv_db))
        broadcast_sse("hdv", {"new_entries": count, "offset": offset, "forced": True})
        return {"ok": True, "synced": count, "offset": offset}
    except Exception as e:
        return JSONResponse({"error": str(e)}, status_code=500)


@app.get("/api/events")
async def api_events(request: Request):
    queue = asyncio.Queue(maxsize=50)
    with _sse_lock:
        _sse_clients.append(queue)

    async def _stream():
        try:
            yield "data: {\"type\":\"connected\"}\n\n"
            while True:
                if await request.is_disconnected():
                    break
                try:
                    msg = await asyncio.wait_for(queue.get(), timeout=30)
                    yield "event: %s\ndata: %s\n\n" % (msg["event"], msg["data"])
                except asyncio.TimeoutError:
                    yield ": keepalive\n\n"
        finally:
            with _sse_lock:
                if queue in _sse_clients:
                    _sse_clients.remove(queue)

    return StreamingResponse(_stream(), media_type="text/event-stream")


# =====================================================
# ICONES
# =====================================================

@app.get("/icons/{category}/{icon_id}.png")
async def serve_icon(category: str, icon_id: str):
    safe_cat = re.sub(r"[^a-zA-Z0-9_-]", "", category)
    safe_id = re.sub(r"[^a-zA-Z0-9_-]", "", icon_id)
    fpath = ICONS_DIR / safe_cat / ("%s.png" % safe_id)
    if fpath.exists():
        return FileResponse(fpath, media_type="image/png")
    return Response(status_code=404)


# =====================================================
# SPA FRONTEND
# =====================================================

@app.get("/")
async def serve_spa():
    index = WEB_DIR / "index.html"
    if index.exists():
        return FileResponse(index, media_type="text/html")
    return HTMLResponse("<h1>Wakfu Assistant API v2</h1><p><a href='/api/v1/docs'>Documentation</a></p>")



# Icons atlas (single JSON with all base64 icons)
_icons_atlas = None

@app.get("/api/icons-atlas")
async def get_icons_atlas():
    global _icons_atlas
    if _icons_atlas is None:
        import json as _json
        atlas_path = BASE_DIR / "rnd" / "data" / "icons_atlas.json"
        if atlas_path.exists():
            with open(atlas_path, "r", encoding="utf-8") as f:
                _icons_atlas = _json.load(f)
        else:
            _icons_atlas = {}
    return _icons_atlas

# Static files (CSS, JS)
from starlette.staticfiles import StaticFiles
app.mount("/icons", StaticFiles(directory=str(WEB_DIR / "icons")), name="icons")
app.mount("/css", StaticFiles(directory=str(WEB_DIR / "css")), name="css")
app.mount("/js", StaticFiles(directory=str(WEB_DIR / "js")), name="js")


# =====================================================
# STARTUP
# =====================================================

def main():
    parser = argparse.ArgumentParser(description="Wakfu Assistant API v2")
    parser.add_argument("--port", type=int, default=8042)
    parser.add_argument("--host", type=str, default="0.0.0.0")
    parser.add_argument("--reload-on-start", action="store_true", default=True)
    args = parser.parse_args()

    log.info("=" * 50)
    log.info("Wakfu Assistant API v2")
    log.info("DB: %s", DB_PATH)
    log.info("Web: %s", WEB_DIR)
    log.info("Port: %d", args.port)
    log.info("=" * 50)

    # Charger les joueurs au demarrage
    if args.reload_on_start:
        log.info("Chargement initial des joueurs...")
        count = reload_players()
        log.info("Charge: %d joueurs avec scores", count)

    # Demarrer le watcher
    _start_watcher()

    # Lancer le serveur
    log.info("Demarrage du serveur sur %s:%d", args.host, args.port)
    uvicorn.run(app, host=args.host, port=args.port, log_level="warning")


# ─── Endpoints Personnage : Build, Inventaire, Coffre ────────────
import logging as _inv_logging
_inv_logger = _inv_logging.getLogger("personnage")

# ── Cache CDN en mémoire ──
_cdn_cache = None

def _ensure_cdn_cache():
    global _cdn_cache, _i18n_cache
    if _cdn_cache is not None:
        return
    import json as _json
    _cdn_cache = {}
    _i18n_cache = {}
    # CDN items (equipment avec gfxId)
    for cp in [
        os.path.join(BASE_DIR, "rnd", "data", "cdn_items.json"),
        os.path.join(BASE_DIR, "docs", "RND", "data", "cdn_items_full.json"),
    ]:
        if not os.path.isfile(cp):
            continue
        try:
            with open(cp, "r", encoding="utf-8") as f:
                raw = _json.load(f)
            if isinstance(raw, list):
                for it in raw:
                    defn = it.get("definition", {})
                    itm = defn.get("item", {}) if isinstance(defn, dict) else {}
                    iid = str(itm.get("id", it.get("id", 0)))
                    if iid == "0":
                        continue
                    title = it.get("title", {})
                    nm = title.get("fr", "") if isinstance(title, dict) else str(title)
                    gp = itm.get("graphicParameters", {})
                    gfx = gp.get("gfxId", 0) if isinstance(gp, dict) else 0
                    bp = itm.get("baseParameters", {})
                    _cdn_cache[iid] = {
                        "name": nm,
                        "level": itm.get("level", 0),
                        "rarity": bp.get("rarity", 0) if isinstance(bp, dict) else 0,
                        "gfxId": gfx,
                        "typeId": bp.get("itemTypeId", 0) if isinstance(bp, dict) else 0,
                    }
            _inv_logger.info(f"CDN: {len(_cdn_cache)} items depuis {os.path.basename(cp)}")
            break
        except Exception as e:
            _inv_logger.warning(f"CDN err {cp}: {e}")
    # i18n local (20k+ noms + descriptions)
    i18n_p = os.path.join(BASE_DIR, "rnd", "data", "i18n_items_local.json")
    if os.path.isfile(i18n_p):
        try:
            with open(i18n_p, "r", encoding="utf-8") as f:
                _i18n_cache = _json.load(f)
            _inv_logger.info(f"i18n: {len(_i18n_cache)} items")
        except Exception as e:
            _inv_logger.warning(f"i18n err: {e}")
    _inv_logger.info(f"Cache: CDN={len(_cdn_cache)} i18n={len(_i18n_cache)}")

def _cdn_lookup(ref_id):
    """Cherche un item dans CDN + i18n."""
    _ensure_cdn_cache()
    sid = str(ref_id)
    cdn = _cdn_cache.get(sid, {})
    i18n = _i18n_cache.get(sid, {})
    if not cdn and not i18n:
        return {}
    result = {}
    if cdn:
        result.update(cdn)
    if isinstance(i18n, dict):
        if i18n.get("name"):
            result["name"] = i18n["name"]
        if i18n.get("description"):
            result["description"] = i18n["description"]
        for k in ["gfxId", "level", "rarity", "typeId"]:
            if not result.get(k) and i18n.get(k):
                result[k] = i18n[k]
    elif isinstance(i18n, str) and i18n:
        result["name"] = i18n
    if "title" in result and "name" not in result:
        result["name"] = result["title"]
    return result

# ── /api/build-data ──
@app.get("/api/build-data")
async def get_build_data():
    """Retourne le build-result.json parsé (avec fix BOM)."""
    br_path = os.path.join(BASE_DIR, "build-generator", "data", "build-result.json")
    if not os.path.exists(br_path):
        return {"error": "build-result.json not found", "items": []}
    try:
        with open(br_path, "rb") as f:
            raw = f.read()
        if raw[:3] == b"\xef\xbb\xbf":
            raw = raw[3:]
        data = json.loads(raw.decode("utf-8"))
        # Enrichir les items avec gfxId depuis le CDN
        items = data.get("items", [])
        for item in items:
            name = item.get("name", "")
            # Chercher dans le CDN par nom si pas de refId
            ref_id = item.get("refId") or item.get("itemId") or item.get("id")
            if ref_id:
                cdn_info = _cdn_lookup(ref_id)
                if cdn_info:
                    item["gfxId"] = cdn_info.get("gfxId", 0)
                    item["rarity"] = cdn_info.get("rarity", item.get("rarity", 0))
                    item["typeId"] = cdn_info.get("typeId", 0)
        return data
    except Exception as e:
        _inv_logger.error(f"[BUILD] Parse error: {e}")
        return {"error": str(e), "items": []}

# ── /api/inventory/local ──
@app.get("/api/inventory/local")
async def get_local_inventory():
    """Retourne l inventaire local enrichi avec le CDN."""
    paths = [
        os.path.join(BASE_DIR, "logs", "inventory_bags.json"),
        os.path.join(BASE_DIR, "logs", "players", "inventory_bags.json"),
    ]
    best_path, best_ts = None, ""
    for p in paths:
        if os.path.exists(p):
            try:
                with open(p, "r", encoding="utf-8") as f:
                    d = json.load(f)
                ts = d.get("timestamp", "")
                if ts > best_ts:
                    best_ts, best_path = ts, p
            except Exception:
                continue
    if not best_path:
        return {"error": "No inventory file found", "bags": [], "player": "Unknown"}
    with open(best_path, "r", encoding="utf-8") as f:
        inv = json.load(f)
    enriched_bags = []
    for bag in inv.get("bags", []):
        enriched_items = []
        for item in bag.get("items", []):
            ref_id = item.get("refId", 0)
            cdn = _cdn_lookup(ref_id)
            name = item.get("name", "")
            if name.startswith("item_") or not name:
                name = cdn.get("name", cdn.get("title", f"#{ref_id}"))
            enriched_items.append({
                "refId": ref_id,
                "name": name,
                "quantity": item.get("quantity", 1),
                "level": cdn.get("level", 0),
                "rarity": cdn.get("rarity", 0),
                "gfxId": cdn.get("gfxId", 0),
                "typeId": cdn.get("typeId", 0),
            })
        bag_name = bag.get("bagName", "Sac")
        if bag_name.startswith("item_"):
            bag_cdn = _cdn_lookup(bag.get("bagRefId", 0))
            bag_name = bag_cdn.get("name", bag_cdn.get("title", bag_name))
        enriched_bags.append({
            "bagId": bag.get("bagId", ""),
            "bagName": bag_name,
            "capacity": bag.get("capacity", 0),
            "itemCount": bag.get("itemCount", 0),
            "items": enriched_items,
        })
    return {
        "player": inv.get("player", "Unknown"),
        "level": inv.get("level", 0),
        "kamas": inv.get("kamas", -1),
        "timestamp": inv.get("timestamp", ""),
        "totalBags": len(enriched_bags),
        "totalItems": sum(b["itemCount"] for b in enriched_bags),
        "bags": enriched_bags,
    }

# ── /api/chest ──
@app.get("/api/chest")
async def get_chest():
    """Retourne le coffre de compte enrichi."""
    chest_path = os.path.join(BASE_DIR, "logs", "account_chest_full.json")
    if not os.path.exists(chest_path):
        return {"error": "No chest file", "compartments": []}
    with open(chest_path, "r", encoding="utf-8") as f:
        chest = json.load(f)
    enriched_comps = []
    for comp in chest.get("compartments", []):
        enriched_items = []
        for item in comp.get("items", []):
            item_id = item.get("itemId", 0)
            cdn = _cdn_lookup(item_id)
            name = item.get("name", "")
            if name.startswith("item_") or not name:
                name = cdn.get("name", cdn.get("title", f"#{item_id}"))
            enriched_items.append({
                "itemId": item_id,
                "name": name,
                "quantity": item.get("quantity", 1),
                "level": cdn.get("level", item.get("level", 0)),
                "rarity": cdn.get("rarity", 0),
                "gfxId": cdn.get("gfxId", 0),
                "typeId": cdn.get("typeId", 0),
                "enchant": item.get("enchant"),
                "maxStack": item.get("maxStack", 1),
            })
        enriched_comps.append({
            "id": comp.get("id", ""),
            "name": comp.get("name", "Compartiment"),
            "capacity": comp.get("capacity", 0),
            "itemCount": comp.get("itemCount", 0),
            "enchantedCount": comp.get("enchantedCount", 0),
            "emptySlots": comp.get("emptySlots", 0),
            "items": enriched_items,
        })
    return {
        "lastUpdate": chest.get("lastUpdate", ""),
        "totalCompartments": chest.get("totalCompartments", 0),
        "totalItems": chest.get("totalItems", 0),
        "totalCapacity": chest.get("totalCapacity", 0),
        "totalEnchanted": chest.get("totalEnchanted", 0),
        "compartments": enriched_comps,
    }



# =====================================================
# HDV MARKET + PATRIMOINE (ajout automatique)
# =====================================================
import sqlite3 as _hdv_sqlite3

HDV_DB = os.path.join(str(BASE_DIR), "logs", "hdv_market.db")

def _hdv_conn():
    if not os.path.isfile(HDV_DB):
        return None
    c = _hdv_sqlite3.connect(HDV_DB)
    c.row_factory = _hdv_sqlite3.Row
    return c

@app.get("/api/market")
async def api_market(q: str = "", side: str = "", sort: str = "unit_price",
                     order: str = "asc", limit: int = 50, offset: int = 0,
                     min_price: int = None, max_price: int = None):
    conn = _hdv_conn()
    if not conn:
        return {"total": 0, "items": [], "error": "hdv_market.db introuvable"}
    try:
        conds, params = [], []
        if q:
            _ensure_cdn_cache()
            ids = [k for k, v in _cdn_cache.items() if q.lower() in v.get("name", "").lower()]
            i18n_ids = [k for k, v in _i18n_cache.items() if isinstance(v, dict) and q.lower() in v.get("name", "").lower()]
            all_ids = list(set(ids + i18n_ids))
            if not all_ids:
                conn.close()
                return {"total": 0, "items": []}
            placeholders = ",".join(["?"] * len(all_ids))
            conds.append("item_ref_id IN (" + placeholders + ")")
            params.extend([int(x) for x in all_ids])
        if side:
            conds.append("side = ?")
            params.append(side)
        if min_price is not None:
            conds.append("unit_price >= ?")
            params.append(min_price)
        if max_price is not None:
            conds.append("unit_price <= ?")
            params.append(max_price)
        where = (" WHERE " + " AND ".join(conds)) if conds else ""
        ok_sorts = {"unit_price", "qty_remaining", "updated_at", "item_ref_id"}
        sc = sort if sort in ok_sorts else "unit_price"
        so = "DESC" if order.lower() == "desc" else "ASC"
        total = conn.execute("SELECT COUNT(*) as c FROM market_latest" + where, params).fetchone()["c"]
        rows = conn.execute("SELECT * FROM market_latest" + where + " ORDER BY " + sc + " " + so + " LIMIT ? OFFSET ?", params + [limit, offset]).fetchall()
        items = []
        for row in rows:
            r = dict(row)
            cdn_info = _cdn_lookup(r.get("item_ref_id", 0))
            items.append({
                "itemId": r.get("item_ref_id", 0),
                "name": cdn_info.get("name", r.get("item_name", "")),
                "level": cdn_info.get("level", 0),
                "rarity": cdn_info.get("rarity", 0),
                "gfxId": cdn_info.get("gfxId", 0),
                "typeId": cdn_info.get("typeId", 0),
                "side": r.get("side", "sell"),
                "unitPrice": r.get("unit_price", 0),
                "qty": r.get("qty_remaining", 1),
                "totalPrice": r.get("total_price", 0),
                "sellerId": r.get("seller_id", 0),
                "capturedAt": r.get("updated_at", ""),
                "slotColors": r.get("slot_colors", ""),
                "sublimationId": r.get("sublimation_id", 0),
            })
        conn.close()
        return {"total": total, "limit": limit, "offset": offset, "items": items}
    except Exception as e:
        conn.close()
        return {"total": 0, "items": [], "error": str(e)}

@app.get("/api/market/stats")
async def api_market_stats():
    conn = _hdv_conn()
    if not conn:
        return {"total_latest": 0, "total_history": 0, "unique_items": 0, "error": "hdv_market.db introuvable"}
    try:
        tl = conn.execute("SELECT COUNT(*) as c FROM market_latest").fetchone()["c"]
        th = conn.execute("SELECT COUNT(*) as c FROM market_observations").fetchone()["c"]
        ui = conn.execute("SELECT COUNT(DISTINCT item_ref_id) as c FROM market_latest").fetchone()["c"]
        lu = conn.execute("SELECT MAX(updated_at) as m FROM market_latest").fetchone()["m"]
        conn.close()
        return {"total_latest": tl, "total_history": th, "unique_items": ui, "latest_update": lu}
    except Exception as e:
        conn.close()
        return {"total_latest": 0, "total_history": 0, "error": str(e)}


@app.get("/api/market/history/{item_ref_id}")
def api_market_history(item_ref_id: int, days: int = 30, slot_colors: str = None):
    """Historique de prix pour un objet - utilise pour graphe mouseover
    Si slot_colors est fourni (ex: 'Bleu,Rouge,Rouge,Vert'), filtre les offres identiques."""
    import datetime, sqlite3, os
    db_path = os.path.join(str(BASE_DIR), "logs", "hdv_market.db")
    if not os.path.isfile(db_path):
        return {"item_ref_id": item_ref_id, "name": "", "history": [], "count": 0}
    conn = sqlite3.connect(db_path)
    conn.row_factory = sqlite3.Row
    try:
        # Essayer market_observations d abord
        tables = [t[0] for t in conn.execute("SELECT name FROM sqlite_master WHERE type='table'").fetchall()]
        history = []
        if "market_observations" in tables:
            rows = conn.execute(
                "SELECT * FROM market_observations WHERE item_ref_id = ? ORDER BY source_ts DESC LIMIT 500",
                (item_ref_id,)
            ).fetchall()
            history = [dict(r) for r in rows]
        else:
            # Fallback: utiliser market_latest comme seul point
            if slot_colors:
                rows = conn.execute(
                    "SELECT * FROM market_latest WHERE item_ref_id = ? AND slot_colors = ? ORDER BY unit_price ASC",
                    (item_ref_id, slot_colors)
                ).fetchall()
            else:
                rows = conn.execute(
                    "SELECT * FROM market_latest WHERE item_ref_id = ? ORDER BY unit_price ASC",
                    (item_ref_id,)
                ).fetchall()
            history = [dict(r) for r in rows]
        # Nom depuis CDN
        name = ""
        info = _cdn_lookup(item_ref_id)
        if info:
            name = info.get("name", info.get("name_fr", ""))
        # Stats
        prices = [h.get("unit_price", 0) for h in history if h.get("unit_price", 0) > 0]
        return {
            "item_ref_id": item_ref_id,
            "name": name,
            "count": len(history),
            "min_price": min(prices) if prices else 0,
            "max_price": max(prices) if prices else 0,
            "avg_price": int(sum(prices)/len(prices)) if prices else 0,
            "history": history[:200]
        }
    finally:
        conn.close()

@app.get("/api/patrimoine")
async def api_patrimoine():
    _ensure_cdn_cache()
    # 1) Prix min HDV par item
    prices = {}
    last_update = None
    conn = _hdv_conn()
    if conn:
        try:
            rows = conn.execute("SELECT item_ref_id, MIN(unit_price) as min_price FROM market_latest WHERE side='sell' AND unit_price > 0 GROUP BY item_ref_id").fetchall()
            for r in rows:
                prices[int(r["item_ref_id"])] = int(r["min_price"])
            last_update = conn.execute("SELECT MAX(updated_at) FROM market_latest").fetchone()[0]
            conn.close()
        except Exception:
            try: conn.close()
            except: pass
    # 2) Coffre
    chest_items = []
    chest_path = os.path.join(str(BASE_DIR), "logs", "account_chest_full.json")
    if os.path.isfile(chest_path):
        try:
            with open(chest_path, "r", encoding="utf-8") as f:
                chest = json.load(f)
            for comp in chest.get("compartments", []):
                for it in comp.get("items", []):
                    _enc = it.get("enchant", {})
                    _slots = _enc.get("slots", [])
                    _color_map = {1:"Rouge",2:"Vert",3:"Bleu",4:"Blanc"}
                    _sc = ",".join([_color_map.get(s.get("colorId",0),"") for s in _slots]) if _slots else ""
                    _sub = _enc.get("sublimationId", 0)
                    chest_items.append({"itemId": it.get("itemId", 0), "quantity": it.get("quantity", 1), "source": "coffre", "slotColors": _sc, "sublimationId": _sub})
        except Exception:
            pass
    # 3) Inventaire
    inv_items = []
    kamas = 0
    for ip in [os.path.join(str(BASE_DIR), "logs", "inventory_bags.json"), os.path.join(str(BASE_DIR), "logs", "players", "inventory_bags.json")]:
        if os.path.isfile(ip):
            try:
                with open(ip, "r", encoding="utf-8") as f:
                    inv = json.load(f)
                kamas = inv.get("kamas", 0)
                for bag in inv.get("bags", []):
                    for it in bag.get("items", []):
                        inv_items.append({"itemId": it.get("refId", 0), "quantity": it.get("quantity", 1), "source": "inventaire"})
                break
            except Exception:
                pass
    # 3b) Kamas depuis proto log (plus fiable)
    proto_log = os.path.join(str(BASE_DIR), "logs", "market_v3_proto.log")
    if os.path.isfile(proto_log):
        try:
            import re as _re
            with open(proto_log, "r", encoding="utf-8") as f:
                for line in f:
                    m = _re.search(r"kamas=(\d+)", line)
                    if m:
                        kamas = int(m.group(1))
        except Exception:
            pass
    # 4) Calculer valeurs
    chest_value = 0
    inv_value = 0
    chest_priced = 0
    inv_priced = 0
    all_valued = []
    for it in chest_items:
        p = prices.get(it["itemId"], 0)
        if p > 0:
            val = p * it["quantity"]
            chest_value += val
            chest_priced += 1
            cdn_info = _cdn_lookup(it["itemId"])
            all_valued.append({"itemId": it["itemId"], "name": cdn_info.get("name", str(it["itemId"])), "quantity": it["quantity"], "unitPrice": p, "totalValue": val, "rarity": cdn_info.get("rarity", 0), "gfxId": cdn_info.get("gfxId", 0), "source": "coffre", "slotColors": it.get("slotColors", ""), "sublimationId": it.get("sublimationId", 0)})
    for it in inv_items:
        p = prices.get(it["itemId"], 0)
        if p > 0:
            val = p * it["quantity"]
            inv_value += val
            inv_priced += 1
            cdn_info = _cdn_lookup(it["itemId"])
            all_valued.append({"itemId": it["itemId"], "name": cdn_info.get("name", str(it["itemId"])), "quantity": it["quantity"], "unitPrice": p, "totalValue": val, "rarity": cdn_info.get("rarity", 0), "gfxId": cdn_info.get("gfxId", 0), "source": "inventaire"})
    all_valued.sort(key=lambda x: x["totalValue"], reverse=True)
    return {
        "kamas": kamas,
        "chestValue": chest_value,
        "inventoryValue": inv_value,
        "totalValue": kamas + chest_value + inv_value,
        "chestPriced": chest_priced,
        "inventoryPriced": inv_priced,
        "chestTotal": len(chest_items),
        "inventoryTotal": len(inv_items),
        "hdvPrices": len(prices),
        "lastUpdate": last_update,
        "topItems": all_valued[:50],
    }

if __name__ == "__main__":
    main()



