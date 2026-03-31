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
COOLDOWN = 5  # secondes entre reloads

VALID_BREEDS = {"Feca","Osamodas","Enutrof","Sram","Xelor","Ecaflip","Eniripsa","Iop","Cra","Sadida","Sacrieur","Pandawa","Roublard","Zobal","Steamer","Eliotrope","Huppermage","Ouginak"}

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
        parser_guild, parser_spells
    )
    _items_db = charger_items(ITEMS_JSON)
    log.info("Items DB: %d items charges", len(_items_db))
except ImportError:
    log.warning("calculate_weights non trouve, scores indisponibles")
    _items_db = {}
    def calculer_joueur(*a, **kw): return None
    def parser_equipment(s): return {}
    def parser_guild(s): return (0, "")
    def parser_spells(s, b): return {}

# =====================================================
# SSE (Server-Sent Events)
# =====================================================
_sse_clients: list[asyncio.Queue] = []
_sse_lock = threading.Lock()

def broadcast_sse(event: str, data: dict):
    """Envoyer un evenement a tous les clients SSE."""
    msg = json.dumps(data, ensure_ascii=False)
    with _sse_lock:
        for q in _sse_clients:
            try:
                q.put_nowait({"event": event, "data": msg})
            except asyncio.QueueFull:
                pass

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
        for fp in [hdv_proto, chest_file, inv_file]:
            try:
                extra_mtimes[str(fp)] = fp.stat().st_mtime
            except:
                extra_mtimes[str(fp)] = 0

        if hdv_proto.exists():
            try:
                count, hdv_offset = hdv_run_sync(str(hdv_proto), str(hdv_db))
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
                        if mt != extra_mtimes.get(str(hdv_proto), 0):
                            extra_mtimes[str(hdv_proto)] = mt
                            count, hdv_offset = hdv_run_sync(str(hdv_proto), str(hdv_db), hdv_offset)
                            if count > 0:
                                log.info("Watcher: HDV +%d entries (offset=%d)", count, hdv_offset)
                                broadcast_sse("hdv", {"new_entries": count, "offset": hdv_offset})
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
# SSE
# =====================================================

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
                "capturedAt": r.get("captured_at", ""),
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
        th = conn.execute("SELECT COUNT(*) as c FROM market_history").fetchone()["c"]
        ui = conn.execute("SELECT COUNT(DISTINCT item_ref_id) as c FROM market_latest").fetchone()["c"]
        lu = conn.execute("SELECT MAX(captured_at) as m FROM market_latest").fetchone()["m"]
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

# =====================================================
# HDV MARKET + PATRIMOINE
# =====================================================
import sqlite3 as _market_sqlite3

HDV_DB_PATH = os.path.join(BASE_DIR, "logs", "hdv_market.db")

def _hdv_db():
    if not os.path.isfile(HDV_DB_PATH):
        return None
    conn = _market_sqlite3.connect(HDV_DB_PATH)
    conn.row_factory = _market_sqlite3.Row
    return conn

@app.get("/api/market")
async def api_market(q: str = "", side: str = "", sort: str = "unit_price", order: str = "asc", limit: int = 50, offset: int = 0, min_price: int = None, max_price: int = None):
    conn = _hdv_db()
    if not conn:
        return {"total": 0, "items": [], "error": "hdv_market.db introuvable"}
    try:
        _ensure_cdn_cache()
        conds, params = [], []
        if q:
            matching_ids = []
            for sid, info in _cdn_cache.items():
                if q.lower() in info.get("name", "").lower():
                    matching_ids.append(int(sid))
            for sid, info in _i18n_cache.items():
                nm = info.get("name", "") if isinstance(info, dict) else (info if isinstance(info, str) else "")
                if q.lower() in nm.lower():
                    try: matching_ids.append(int(sid))
                    except: pass
            matching_ids = list(set(matching_ids))
            if not matching_ids:
                conn.close()
                return {"total": 0, "items": []}
            conds.append("item_id IN (%s)" % ",".join("?" * len(matching_ids)))
            params.extend(matching_ids)
        if side:
            conds.append("side = ?"); params.append(side)
        if min_price is not None:
            conds.append("unit_price >= ?"); params.append(min_price)
        if max_price is not None:
            conds.append("unit_price <= ?"); params.append(max_price)
        where = (" WHERE " + " AND ".join(conds)) if conds else ""
        ok_sorts = {"unit_price", "qty", "captured_at", "item_id", "total_price"}
        sc = sort if sort in ok_sorts else "unit_price"
        so = "DESC" if order.lower() == "desc" else "ASC"
        total = conn.execute("SELECT COUNT(*) as c FROM market_latest" + where, params).fetchone()["c"]
        rows = conn.execute("SELECT * FROM market_latest" + where + " ORDER BY %s %s LIMIT ? OFFSET ?" % (sc, so), params + [limit, offset]).fetchall()
        items = []
        for row in rows:
            r = dict(row)
            ci = _cdn_lookup(r.get("item_ref_id", 0))
            items.append({"itemId": r.get("item_id"), "name": ci.get("name", r.get("item_name", "Item#%s" % r.get("item_id"))), "level": ci.get("level", 0), "rarity": ci.get("rarity", 0), "gfxId": ci.get("gfxId", 0), "side": r.get("side", "sell"), "unitPrice": r.get("unit_price", 0), "qty": r.get("qty_remaining", 1), "totalPrice": r.get("total_price", 0), "capturedAt": r.get("captured_at", ""), "slotColors": r.get("slot_colors", ""), "sublimationId": r.get("sublimation_id", 0)})
        conn.close()
        return {"total": total, "limit": limit, "offset": offset, "items": items}
    except Exception as e:
        conn.close()
        return {"total": 0, "items": [], "error": str(e)}

@app.get("/api/market/stats")
async def api_market_stats():
    conn = _hdv_db()
    if not conn:
        return {"total_offers": 0, "unique_items": 0, "latest_update": None, "error": "hdv_market.db introuvable"}
    try:
        total = conn.execute("SELECT COUNT(*) as c FROM market_latest").fetchone()["c"]
        hist = conn.execute("SELECT COUNT(*) as c FROM market_history").fetchone()["c"]
        unique = conn.execute("SELECT COUNT(DISTINCT item_ref_id) as c FROM market_latest").fetchone()["c"]
        latest = conn.execute("SELECT MAX(captured_at) as m FROM market_latest").fetchone()["m"]
        conn.close()
        return {"total_offers": total, "total_history": hist, "unique_items": unique, "latest_update": latest}
    except Exception as e:
        conn.close()
        return {"total_offers": 0, "unique_items": 0, "latest_update": None, "error": str(e)}

@app.get("/api/patrimoine")
async def api_patrimoine():
    _ensure_cdn_cache()
    hdv_prices = {}
    conn = _hdv_db()
    if conn:
        try:
            for r in conn.execute("SELECT item_ref_id, MIN(unit_price) as min_price, COUNT(*) as offers FROM market_latest WHERE side='sell' AND unit_price > 0 GROUP BY item_ref_id").fetchall():
                hdv_prices[r["item_ref_id"]] = {"min_price": r["min_price"], "offers": r["offers"]}
            conn.close()
        except:
            conn.close()
    chest_items = []
    chest_path = os.path.join(BASE_DIR, "logs", "account_chest_full.json")
    if os.path.isfile(chest_path):
        try:
            with open(chest_path, "r", encoding="utf-8") as f:
                chest = json.load(f)
            for comp in chest.get("compartments", []):
                for item in comp.get("items", []):
                    iid = item.get("itemId", 0)
                    qty = item.get("quantity", 1)
                    ci = _cdn_lookup(iid)
                    pi = hdv_prices.get(iid, {})
                    mp = pi.get("min_price", 0)
                    chest_items.append({"itemId": iid, "name": ci.get("name", item.get("name", "#%s" % iid)), "quantity": qty, "level": ci.get("level", 0), "rarity": ci.get("rarity", 0), "gfxId": ci.get("gfxId", 0), "unitPrice": mp, "totalValue": mp * qty, "hdvOffers": pi.get("offers", 0), "source": "chest"})
        except Exception as e:
            log.warning("Patrimoine chest: %s", e)
    inv_items = []
    for inv_path in [os.path.join(BASE_DIR, "logs", "inventory_bags.json"), os.path.join(BASE_DIR, "logs", "players", "inventory_bags.json")]:
        if not os.path.isfile(inv_path):
            continue
        try:
            with open(inv_path, "r", encoding="utf-8") as f:
                inv = json.load(f)
            for bag in inv.get("bags", []):
                for item in bag.get("items", []):
                    iid = item.get("refId", 0)
                    qty = item.get("quantity", 1)
                    ci = _cdn_lookup(iid)
                    pi = hdv_prices.get(iid, {})
                    mp = pi.get("min_price", 0)
                    inv_items.append({"itemId": iid, "name": ci.get("name", item.get("name", "#%s" % iid)), "quantity": qty, "level": ci.get("level", 0), "rarity": ci.get("rarity", 0), "gfxId": ci.get("gfxId", 0), "unitPrice": mp, "totalValue": mp * qty, "hdvOffers": pi.get("offers", 0), "source": "inventory"})
            break
        except Exception as e:
            log.warning("Patrimoine inv: %s", e)
    all_items = sorted(chest_items + inv_items, key=lambda x: x["totalValue"], reverse=True)
    cv = sum(i["totalValue"] for i in chest_items)
    iv = sum(i["totalValue"] for i in inv_items)
    kamas = 0
    for ip in [os.path.join(BASE_DIR, "logs", "inventory_bags.json")]:
        if os.path.isfile(ip):
            try:
                with open(ip, "r", encoding="utf-8") as f:
                    kamas = json.load(f).get("kamas", 0)
            except:
                pass
    return {"kamas": kamas, "chestValue": cv, "inventoryValue": iv, "totalValue": cv + iv, "totalWithKamas": cv + iv + kamas, "chestItems": len(chest_items), "inventoryItems": len(inv_items), "pricedItems": len([i for i in all_items if i["unitPrice"] > 0]), "unpricedItems": len([i for i in all_items if i["unitPrice"] == 0]), "hdvItemsAvailable": len(hdv_prices), "topItems": all_items[:50], "allItems": all_items}


