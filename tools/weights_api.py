#!/usr/bin/env python3
"""
Wakfu Assistant — API + Interface web pour les poids d'équipement.

Serveur FastAPI qui expose les données de poids des joueurs via des endpoints
JSON réutilisables, avec une interface HTML intégrée pour la consultation.

Usage :
    python tools/weights_api.py [--port 8042] [--host 0.0.0.0]

Endpoints :
    GET  /                          → Interface web (HTML)
    GET  /api/players               → Liste de tous les joueurs (tri, filtre, pagination)
    GET  /api/players/{name}        → Détail d'un joueur avec son équipement
    GET  /api/guilds                → Classement des guildes
    GET  /api/stats                 → Statistiques globales (résumé)
    GET  /api/classes               → Stats agrégées par classe
    GET  /api/search?q=...          → Recherche joueurs/guildes par nom

Voir GET /api/docs pour la documentation complète des paramètres.
"""

import sys
import argparse
import asyncio
import logging
import threading
from pathlib import Path
from collections import defaultdict

from fastapi.middleware.cors import CORSMiddleware
from fastapi import FastAPI, Query
from fastapi.responses import HTMLResponse, JSONResponse, FileResponse, StreamingResponse
import uvicorn
import socket
import subprocess

# Importer le moteur de calcul
sys.path.insert(0, str(Path(__file__).resolve().parent))
from calculate_weights import (
    charger_items, charger_joueurs, calculer_joueur,
    ITEMS_JSON, PLAYERS_DIR, SLOT_NAMES, POIDS_MAITRISE,
)
import re
import json

logging.basicConfig(
    level=logging.INFO,
    format="%(asctime)s [%(levelname)s] %(message)s",
    datefmt="%H:%M:%S",
)
log = logging.getLogger("weights_api")

# ═══════════════════════════ Données globales ════════════════════════

# Chargées au démarrage, accessibles par tous les endpoints
_players: list[dict] = []
_players_by_name: dict[str, dict] = {}
_player_tranches: dict[str, dict[int, dict]] = {}  # name_lower → {tranche → résultat calculé}
_guilds: list[dict] = []
_stats: dict = {}
_items_db: dict = {}
_spell_names: dict[int, str] = {}

SPELL_NAMES_FILE = Path(__file__).resolve().parent.parent / "rnd" / "data" / "spell_names_fr.json"

# ═══════════════════════════ SSE live-update ══════════════════════════

_sse_clients: list[asyncio.Queue] = []
_sse_lock = threading.Lock()

def _notify_clients(event: str, data: str = "{}"):
    """Envoie un event SSE à tous les clients connectés (thread-safe)."""
    with _sse_lock:
        dead = []
        for q in _sse_clients:
            try:
                q.put_nowait(f"event: {event}\ndata: {data}\n\n")
            except asyncio.QueueFull:
                dead.append(q)
        for q in dead:
            _sse_clients.remove(q)

COMBAT_SPELLS_FILE = Path(__file__).resolve().parent.parent / "agent" / "logs" / "combat_spells.jsonl"

# casterId (int) → set of spellIds observés en combat
_combat_spells: dict[int, set] = {}
_combat_spells_lock = threading.Lock()
_combat_spells_offset = 0  # octets déjà lus dans combat_spells.jsonl


def _load_combat_spells_incremental():
    """Lit les nouvelles lignes de combat_spells.jsonl depuis le dernier offset."""
    global _combat_spells_offset
    if not COMBAT_SPELLS_FILE.exists():
        return False
    changed = False
    with _combat_spells_lock:
        with open(COMBAT_SPELLS_FILE, "r", encoding="utf-8") as f:
            f.seek(_combat_spells_offset)
            for line in f:
                line = line.strip()
                if not line:
                    continue
                try:
                    ev = json.loads(line)
                    cid = int(ev.get("casterId", 0))
                    sid = int(ev.get("spellId", 0))
                    if cid and sid:
                        if cid not in _combat_spells:
                            _combat_spells[cid] = set()
                        if sid not in _combat_spells[cid]:
                            _combat_spells[cid].add(sid)
                            changed = True
                except Exception:
                    pass
            _combat_spells_offset = f.tell()
    return changed


def _start_file_watcher():
    """Thread de surveillance du dossier players/ et de combat_spells.jsonl."""
    try:
        from watchfiles import watch
    except ImportError:
        log.warning("watchfiles non installé — live-update désactivé (pip install watchfiles)")
        return

    # Charger les sorts déjà capturés au démarrage
    _load_combat_spells_incremental()

    watch_paths = [str(PLAYERS_DIR)]
    if COMBAT_SPELLS_FILE.parent.exists():
        watch_paths.append(str(COMBAT_SPELLS_FILE.parent))

    def _run():
        log.info("Watcher démarré sur %s", watch_paths)
        for changes in watch(*watch_paths, debounce=300, yield_on_timeout=False):
            try:
                # Vérifier si combat_spells.jsonl a changé
                combat_changed = any(
                    str(COMBAT_SPELLS_FILE) in str(path)
                    for _, path in changes
                )
                if combat_changed:
                    new_spells = _load_combat_spells_incremental()
                    if new_spells:
                        log.info("Watcher: nouveaux sorts combat détectés")
                        _notify_clients("reload", '{"source":"combat"}')
                    continue

                # Fichier joueur modifié
                charger_donnees()
                log.info("Watcher: données rechargées (fichier modifié)")
                _notify_clients("reload", '{"source":"file"}')
            except Exception as e:
                log.warning("Watcher reload error: %s", e)

    t = threading.Thread(target=_run, name="PlayerWatcher", daemon=True)
    t.start()


# Tranches Wakfu : 0-20, puis par paliers de 15
TRANCHES = [0, 20, 35, 50, 65, 80, 95, 110, 125, 140, 155, 170, 185, 200, 215, 230]

RE_TRANCHE_FILE = re.compile(r"^(.+)_t(\d+)\.json$")


def charger_donnees():
    """Charge et calcule toutes les données au démarrage."""
    global _players, _players_by_name, _player_tranches, _guilds, _stats, _items_db, _spell_names

    _items_db = charger_items(ITEMS_JSON)

    # Charger le dictionnaire de sorts (si disponible)
    # Format: { "spellId": {"name": "...", "gfxId": 123} }
    _spell_names = {}
    if SPELL_NAMES_FILE.exists():
        try:
            with open(SPELL_NAMES_FILE, "r", encoding="utf-8") as f:
                raw = json.load(f)
            for k, v in raw.items():
                if isinstance(v, dict):
                    _spell_names[int(k)] = v
                else:
                    _spell_names[int(k)] = {"name": v, "gfxId": 0}
            log.info("  → %d sorts chargés (noms + gfxId).", len(_spell_names))
        except Exception as e:
            log.warning("Erreur lecture spell_names: %s", e)

    # Charger les fichiers principaux (sans _tXX)
    joueurs_raw = []
    tranche_files: dict[str, list[tuple[int, Path]]] = defaultdict(list)  # safeName → [(tranche, path)]
    for fichier in sorted(PLAYERS_DIR.glob("*.json")):
        m = RE_TRANCHE_FILE.match(fichier.name)
        if m:
            # Fichier tranche : {safeName}_t{tranche}.json
            safe_name = m.group(1)
            tranche = int(m.group(2))
            tranche_files[safe_name].append((tranche, fichier))
        else:
            # Fichier principal (latest)
            try:
                with open(fichier, "r", encoding="utf-8") as f:
                    data = json.load(f)
                joueurs_raw.append((fichier.stem, data))
            except Exception as e:
                log.warning("Erreur lecture %s : %s", fichier.name, e)

    log.info("  → %d joueurs chargés, %d avec snapshots par tranche.",
             len(joueurs_raw), len(tranche_files))

    # Calculer les joueurs principaux
    resultats = []
    for safe_name, j in joueurs_raw:
        r = calculer_joueur(j, _items_db)
        if r is not None:
            r["_safe_name"] = safe_name
            resultats.append(r)

    # Charger et calculer les tranches pour chaque joueur
    _player_tranches = {}
    for safe_name, fichiers_tranche in tranche_files.items():
        tranches_dict = {}
        for tranche, path in fichiers_tranche:
            try:
                with open(path, "r", encoding="utf-8") as f:
                    data = json.load(f)
                # borne haute de la tranche : tranche + 15 (ex: tranche=95 → max=110)
                niveau_max_tranche = tranche + 15
                r = calculer_joueur(data, _items_db, niveau_max=niveau_max_tranche)
                if r is not None:
                    r["score_global"] = round(r["poids_offensif"] + r["poids_defensif"], 1)
                    # Stocker le niveau effectif de cette tranche
                    ds = data.get("downscaleLevel", 0)
                    r["effective_level"] = ds if ds and ds > 0 else data.get("level", 0)
                    r["tranche"] = tranche
                    r["snapshot_timestamp"] = data.get("timestamp", "")
                    tranches_dict[tranche] = r
            except Exception:
                pass
        if tranches_dict:
            _player_tranches[safe_name.lower()] = tranches_dict

    # Score global = offensif + défensif
    for r in resultats:
        r["score_global"] = round(r["poids_offensif"] + r["poids_defensif"], 1)

    # Lier les tranches au nom du joueur (en plus du safe_name)
    # Et remplacer le résultat principal par la tranche la plus haute si elle a un meilleur level
    for r in resultats:
        safe = r.get("_safe_name", "").lower()
        if safe in _player_tranches:
            _player_tranches[r["name"].lower()] = _player_tranches[safe]

    # Pour le classement, utiliser la tranche la plus haute de chaque joueur
    # Le fichier "latest" peut être un snapshot downscalé, pas représentatif
    for i, r in enumerate(resultats):
        safe = r.get("_safe_name", "").lower()
        tranches = _player_tranches.get(safe, {})
        if tranches:
            # Prendre la tranche la plus haute
            best_tranche = max(tranches.keys())
            best = tranches[best_tranche]
            # Si la tranche la plus haute a un meilleur level, l'utiliser comme profil principal
            if best["level"] > r["level"]:
                # Copier les champs calculés dans le résultat principal
                for key in ("poids_offensif", "poids_defensif", "total_pv", "total_res",
                            "pa", "pm", "po", "pw", "tacle", "esquive", "initiative",
                            "coup_crit", "nb_items", "top_item_name", "top_item_poids",
                            "items_detail", "level", "score_global"):
                    if key in best:
                        r[key] = best[key]

    resultats.sort(key=lambda x: x["score_global"], reverse=True)

    # Ajouter le rang (basé sur le score global)
    for i, r in enumerate(resultats, 1):
        r["rank"] = i

    _players = resultats
    _players_by_name = {r["name"].lower(): r for r in resultats}

    # Calculer les guildes
    guildes_map = defaultdict(lambda: {"joueurs": [], "guild_name": "", "guild_id": 0})
    for r in resultats:
        gid = r["guild_id"]
        if gid == 0:
            continue
        guildes_map[gid]["joueurs"].append(r)
        if len(r["guild_name"]) > len(guildes_map[gid]["guild_name"]):
            guildes_map[gid]["guild_name"] = r["guild_name"]
            guildes_map[gid]["guild_id"] = gid

    guild_list = []
    for gid, g in guildes_map.items():
        joueurs = g["joueurs"]
        n = len(joueurs)
        guild_list.append({
            "guild_name": g["guild_name"] or f"Guilde#{gid}",
            "guild_id": gid,
            "nb_members": n,
            "avg_poids_offensif": round(sum(j["poids_offensif"] for j in joueurs) / n, 1),
            "avg_level": round(sum(j["level"] for j in joueurs) / n, 1),
            "avg_poids_defensif": round(sum(j["poids_defensif"] for j in joueurs) / n, 1),
            "top_player": max(joueurs, key=lambda j: j["poids_offensif"])["name"],
            "max_poids_offensif": round(max(j["poids_offensif"] for j in joueurs), 1),
        })
    guild_list.sort(key=lambda x: x["avg_poids_offensif"], reverse=True)
    _guilds = guild_list

    # Stats globales
    classes = defaultdict(list)
    for r in resultats:
        classes[r["breedName"]].append(r)

    classes_stats = []
    for breed, members in sorted(classes.items(), key=lambda x: -len(x[1])):
        n = len(members)
        classes_stats.append({
            "breedName": breed,
            "count": n,
            "avg_poids_offensif": round(sum(m["poids_offensif"] for m in members) / n, 1),
            "avg_level": round(sum(m["level"] for m in members) / n, 1),
            "max_poids_offensif": round(max(m["poids_offensif"] for m in members), 1),
            "top_player": max(members, key=lambda m: m["poids_offensif"])["name"],
        })

    _stats = {
        "total_players": len(resultats),
        "total_raw": len(joueurs_raw),
        "players_sans_stuff": len(joueurs_raw) - len(resultats),
        "total_guilds": len(guild_list),
        "max_poids_offensif": round(resultats[0]["poids_offensif"], 1) if resultats else 0,
        "top_player": resultats[0]["name"] if resultats else "",
        "avg_poids_offensif": round(sum(r["poids_offensif"] for r in resultats) / len(resultats), 1) if resultats else 0,
        "avg_level": round(sum(r["level"] for r in resultats) / len(resultats), 1) if resultats else 0,
        "classes": classes_stats,
        "weight_system": POIDS_MAITRISE,
    }

    log.info("Données prêtes : %d joueurs, %d guildes.", len(resultats), len(guild_list))


# ═══════════════════════════ FastAPI ═════════════════════════════════


# --- Wakfu Command Center: routes unifiees ---
import sys
sys.path.insert(0, r"H:\Code\Wakfuassistant\tools")
from patch_unified_api import register_unified_routes, register_ui_route

app = FastAPI(
    title="Wakfu Weights API",
    description="API de classement des joueurs par poids d'équipement normalisé.",
    version="1.0.0",
)


def serialiser_joueur(r: dict, detail: bool = False) -> dict:
    """Sérialise un joueur pour l'API (sans items_detail sauf si demandé)."""
    out = {
        "rank": r.get("rank", 0),
        "name": r["name"],
        "level": r["level"],
        "breedName": r["breedName"],
        "guild_name": r["guild_name"],
        "guild_id": r["guild_id"],
        "score_global": r.get("score_global", 0),
        "poids_offensif": round(r["poids_offensif"], 1),
        "poids_defensif": round(r["poids_defensif"], 1),
        "total_pv": r["total_pv"],
        "total_res": r["total_res"],
        "pa": r["pa"],
        "pm": r["pm"],
        "po": r["po"],
        "pw": r["pw"],
        "tacle": r["tacle"],
        "esquive": r["esquive"],
        "initiative": r["initiative"],
        "coup_crit": r["coup_crit"],
        "nb_items": r["nb_items"],
        "top_item_name": r["top_item_name"],
        "snapshot_timestamp": r.get("snapshot_timestamp", ""),
    }
    if detail:
        out["equipment"] = sorted(r.get("items_detail", []), key=lambda x: x["slot"])
        spells_raw = r.get("spells_data", {"decks": [], "active_deck": 0, "builds": []})
        # Enrichir les IDs de sorts avec nom + gfxId si disponibles
        if _spell_names and spells_raw.get("decks"):
            for deck in spells_raw["decks"]:
                deck["active_spells"] = [
                    {"id": sid, "name": _spell_names.get(sid, {}).get("name", ""), "gfxId": _spell_names.get(sid, {}).get("gfxId", 0)}
                    for sid in deck.get("active_spells", [])
                ]
                deck["passive_spells"] = [
                    {"id": sid, "name": _spell_names.get(sid, {}).get("name", ""), "gfxId": _spell_names.get(sid, {}).get("gfxId", 0)}
                    for sid in deck.get("passive_spells", [])
                ]
        # Injecter les sorts observés en combat (par entityId)
        entity_id = r.get("entityId", 0)
        with _combat_spells_lock:
            seen_in_combat = sorted(_combat_spells.get(entity_id, set()))
        if seen_in_combat:
            combat_list = [
                {"id": sid,
                 "name": _spell_names.get(sid, {}).get("name", ""),
                 "gfxId": _spell_names.get(sid, {}).get("gfxId", 0)}
                for sid in seen_in_combat
            ]
            spells_raw["combat_observed"] = combat_list
        out["spells"] = spells_raw
    return out


# ─── Endpoints API ───────────────────────────────────────────────────


# Monter les routes unifiees Build + Market + CDN
register_unified_routes(app)
register_ui_route(app)
# --- CORS pour le Command Center ---
app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

@app.get("/api/players")
def api_players(
    sort: str = Query("score_global", description="Champ de tri (score_global, poids_offensif, poids_defensif, level, name, total_pv)"),
    order: str = Query("desc", description="Ordre de tri (asc, desc)"),
    breed: str = Query(None, description="Filtrer par classe (ex: Sram, Iop)"),
    guild: str = Query(None, description="Filtrer par nom de guilde (partiel)"),
    min_level: int = Query(0, description="Niveau minimum"),
    max_level: int = Query(999, description="Niveau maximum"),
    limit: int = Query(100, description="Nombre max de résultats (max 1000)"),
    offset: int = Query(0, description="Offset pour la pagination"),
):
    """Liste des joueurs avec tri, filtres et pagination."""
    data = _players

    # Filtres
    if breed:
        breed_lower = breed.lower()
        data = [p for p in data if p["breedName"].lower() == breed_lower]
    if guild:
        guild_lower = guild.lower()
        data = [p for p in data if guild_lower in p["guild_name"].lower()]
    if min_level > 0:
        data = [p for p in data if p["level"] >= min_level]
    if max_level < 999:
        data = [p for p in data if p["level"] <= max_level]

    # Tri
    sort_key = sort if sort in ("score_global", "poids_offensif", "poids_defensif", "level", "name", "total_pv", "total_res", "pa", "pm", "coup_crit", "tacle", "esquive") else "score_global"
    reverse = order != "asc"
    data = sorted(data, key=lambda x: x.get(sort_key, 0), reverse=reverse)

    total = len(data)
    limit = min(limit, 1000)
    page = data[offset:offset + limit]

    return {
        "total": total,
        "offset": offset,
        "limit": limit,
        "players": [serialiser_joueur(p) for p in page],
    }


def _find_player(name: str) -> tuple[str, dict | None]:
    """Trouve un joueur par nom exact ou partiel. Retourne (key, player)."""
    key = name.lower()
    player = _players_by_name.get(key)
    if player:
        return key, player
    for pname, p in _players_by_name.items():
        if key in pname:
            return pname, p
    return key, None


@app.get("/api/players/{name:path}")
def api_player_detail(name: str, tranche: int = Query(None, description="Tranche de niveau (0, 20, 35, ..., 230)")):
    """Détail complet d'un joueur avec son équipement pièce par pièce.
    Si tranche est spécifié, retourne l'équipement de cette tranche."""
    key, player = _find_player(name)
    if not player:
        return JSONResponse(status_code=404, content={"error": f"Joueur '{name}' non trouvé"})

    # Tranches disponibles pour ce joueur
    tranches = _player_tranches.get(key, {})
    available_tranches = sorted(tranches.keys())

    # Si une tranche est demandée, utiliser ce snapshot
    if tranche is not None and tranche in tranches:
        result = serialiser_joueur(tranches[tranche], detail=True)
        result["viewing_tranche"] = tranche
    else:
        result = serialiser_joueur(player, detail=True)
        result["viewing_tranche"] = None

    result["available_tranches"] = available_tranches
    return result


@app.get("/api/guilds")
def api_guilds(
    sort: str = Query("avg_poids_offensif", description="Champ de tri"),
    order: str = Query("desc", description="Ordre (asc, desc)"),
    min_members: int = Query(1, description="Nombre minimum de membres"),
    limit: int = Query(50, description="Nombre max de résultats"),
):
    """Classement des guildes par stats moyennes."""
    data = _guilds
    if min_members > 1:
        data = [g for g in data if g["nb_members"] >= min_members]

    sort_key = sort if sort in ("avg_poids_offensif", "avg_poids_defensif", "avg_level", "nb_members", "max_poids_offensif") else "avg_poids_offensif"
    reverse = order != "asc"
    data = sorted(data, key=lambda x: x.get(sort_key, 0), reverse=reverse)

    return {
        "total": len(data),
        "guilds": data[:min(limit, 500)],
    }


@app.get("/api/stats")
def api_stats():
    """Statistiques globales : résumé, classes, système de poids."""
    return _stats


@app.get("/api/classes")
def api_classes():
    """Stats agrégées par classe de personnage."""
    return {"classes": _stats.get("classes", [])}


@app.get("/api/search")
def api_search(q: str = Query(..., description="Terme de recherche (min 2 caractères)")):
    """Recherche joueurs et guildes par nom."""
    if len(q) < 2:
        return {"players": [], "guilds": []}

    q_lower = q.lower()
    players = [serialiser_joueur(p) for p in _players if q_lower in p["name"].lower()][:20]
    guilds = [g for g in _guilds if q_lower in g["guild_name"].lower()][:10]

    return {"players": players, "guilds": guilds}


@app.post("/api/reload")
def api_reload():
    """Recharge toutes les données depuis les fichiers (joueurs, items, tranches)."""
    charger_donnees()
    return {
        "status": "ok",
        "total_players": _stats.get("total_players", 0),
        "total_guilds": _stats.get("total_guilds", 0),
    }


@app.get("/api/events")
async def api_events():
    """SSE endpoint — envoie un event 'reload' à chaque mise à jour des données joueurs."""
    loop = asyncio.get_event_loop()
    q: asyncio.Queue = asyncio.Queue(maxsize=20)
    with _sse_lock:
        _sse_clients.append(q)

    async def _stream():
        try:
            # Keepalive initial
            yield ": keepalive\n\n"
            while True:
                try:
                    msg = await asyncio.wait_for(q.get(), timeout=15.0)
                    yield msg
                except asyncio.TimeoutError:
                    yield ": keepalive\n\n"
        except asyncio.CancelledError:
            pass
        finally:
            with _sse_lock:
                try:
                    _sse_clients.remove(q)
                except ValueError:
                    pass

    return StreamingResponse(_stream(), media_type="text/event-stream",
                             headers={"Cache-Control": "no-cache", "X-Accel-Buffering": "no"})


@app.get("/api/docs")
def api_docs_endpoint():
    """Documentation des endpoints de l'API."""
    return {
        "version": "1.0.0",
        "base_url": "/api",
        "endpoints": {
            "GET /api/players": {
                "description": "Liste paginée des joueurs avec tri et filtres",
                "params": {
                    "sort": "Champ de tri : poids_offensif (défaut), poids_defensif, level, name, total_pv, total_res, pa, pm, coup_crit, tacle, esquive",
                    "order": "asc ou desc (défaut: desc)",
                    "breed": "Filtrer par classe (ex: Sram, Iop, Eniripsa)",
                    "guild": "Filtrer par nom de guilde (recherche partielle)",
                    "min_level": "Niveau minimum (défaut: 0)",
                    "max_level": "Niveau maximum (défaut: 999)",
                    "limit": "Nombre de résultats par page (défaut: 100, max: 1000)",
                    "offset": "Décalage pour pagination (défaut: 0)",
                },
            },
            "GET /api/players/{name}": {
                "description": "Détail complet d'un joueur avec équipement pièce par pièce",
                "params": {"name": "Nom du joueur (recherche partielle supportée)"},
            },
            "GET /api/guilds": {
                "description": "Classement des guildes par stats moyennes",
                "params": {
                    "sort": "avg_poids_offensif (défaut), avg_poids_defensif, avg_level, nb_members, max_poids_offensif",
                    "order": "asc ou desc (défaut: desc)",
                    "min_members": "Nombre minimum de membres (défaut: 1)",
                    "limit": "Nombre max (défaut: 50)",
                },
            },
            "GET /api/stats": {"description": "Statistiques globales, résumé par classe, constantes de poids"},
            "GET /api/classes": {"description": "Stats agrégées par classe de personnage"},
            "GET /api/search?q=...": {"description": "Recherche joueurs/guildes par nom (min 2 car.)"},
        },
    }


# ─── Icônes ──────────────────────────────────────────────────────────

ICONS_DIR = Path(__file__).resolve().parent.parent / "rnd" / "data" / "icons"

@app.get("/icons/{category}/{icon_id}.png")
def serve_icon(category: str, icon_id: str):
    """Sert les icônes d'items et sorts depuis les fichiers PNG extraits."""
    if category not in ("items", "spells"):
        return JSONResponse({"error": "Catégorie invalide"}, status_code=404)
    path = ICONS_DIR / category / f"{icon_id}.png"
    if not path.exists():
        return JSONResponse({"error": "Icône introuvable"}, status_code=404)
    return FileResponse(path, media_type="image/png")


# ─── Interface web ───────────────────────────────────────────────────

@app.get("/", response_class=HTMLResponse)
def ui():
    """Interface web intégrée."""
    return HTML_PAGE


# ═══════════════════════════ HTML/JS/CSS ═════════════════════════════

HTML_PAGE = r"""<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Wakfu Weights</title>
<style>
:root {
  --bg: #0f1117; --surface: #1a1d27; --surface2: #242836;
  --border: #2e3348; --text: #e0e0e8; --text2: #8890a8;
  --accent: #5b8af5; --accent2: #3d6ce0; --green: #4ade80;
  --red: #f87171; --orange: #fbbf24; --purple: #a78bfa;
}
* { margin: 0; padding: 0; box-sizing: border-box; }
body { font-family: 'Segoe UI', system-ui, sans-serif; background: var(--bg); color: var(--text); }
a { color: var(--accent); text-decoration: none; }

.header {
  background: linear-gradient(135deg, #1a1d27 0%, #242846 100%);
  border-bottom: 1px solid var(--border); padding: 20px 24px;
}
.header h1 { font-size: 22px; font-weight: 700; }
.header h1 span { color: var(--accent); }
.header .subtitle { color: var(--text2); font-size: 13px; margin-top: 4px; }

.stats-bar {
  display: flex; gap: 16px; padding: 16px 24px; flex-wrap: wrap;
  border-bottom: 1px solid var(--border); background: var(--surface);
}
.stat-card {
  background: var(--surface2); border: 1px solid var(--border);
  border-radius: 8px; padding: 12px 18px; min-width: 140px;
}
.stat-card .label { font-size: 11px; color: var(--text2); text-transform: uppercase; letter-spacing: 0.5px; }
.stat-card .value { font-size: 22px; font-weight: 700; margin-top: 4px; }
.stat-card .value.accent { color: var(--accent); }
.stat-card .value.green { color: var(--green); }

.tabs {
  display: flex; gap: 0; border-bottom: 1px solid var(--border);
  background: var(--surface); padding: 0 24px;
}
.tab {
  padding: 12px 20px; cursor: pointer; font-size: 14px; color: var(--text2);
  border-bottom: 2px solid transparent; transition: all 0.15s;
}
.tab:hover { color: var(--text); }
.tab.active { color: var(--accent); border-bottom-color: var(--accent); }

.controls {
  display: flex; gap: 12px; padding: 16px 24px; flex-wrap: wrap;
  align-items: center; background: var(--bg);
}
.controls input, .controls select {
  background: var(--surface2); border: 1px solid var(--border);
  color: var(--text); padding: 8px 12px; border-radius: 6px;
  font-size: 13px; outline: none;
}
.controls input:focus, .controls select:focus { border-color: var(--accent); }
.controls input { width: 240px; }
.controls select { min-width: 110px; }
.controls label { font-size: 12px; color: var(--text2); display: flex; align-items: center; gap: 4px; }
.filter-label { min-width: 24px; }
.reset-btn {
  background: var(--surface2); border: 1px solid var(--border); color: var(--text2);
  padding: 8px 14px; border-radius: 6px; font-size: 12px; cursor: pointer;
}
.reset-btn:hover { border-color: var(--red); color: var(--red); }
.reload-btn {
  background: var(--accent2); border: 1px solid var(--accent); color: #fff;
  padding: 8px 18px; border-radius: 6px; font-size: 13px; font-weight: 600;
  cursor: pointer; transition: all 0.15s;
}
.reload-btn:hover { background: var(--accent); }
.reload-btn:disabled { opacity: 0.5; cursor: wait; }
.active-filters {
  display: flex; gap: 8px; padding: 0 24px 8px; flex-wrap: wrap; min-height: 4px;
}
.filter-tag {
  display: inline-flex; align-items: center; gap: 4px;
  background: var(--accent2); color: #fff; padding: 3px 10px;
  border-radius: 12px; font-size: 11px; font-weight: 600;
}
.filter-tag .remove { cursor: pointer; opacity: 0.7; margin-left: 2px; }
.filter-tag .remove:hover { opacity: 1; }

.content { padding: 0 24px 24px; }

table {
  width: 100%; border-collapse: collapse; font-size: 13px;
}
thead th {
  text-align: left; padding: 10px 12px; font-size: 11px;
  text-transform: uppercase; letter-spacing: 0.5px; color: var(--text2);
  border-bottom: 1px solid var(--border); cursor: pointer;
  user-select: none; white-space: nowrap;
}
thead th:hover { color: var(--accent); }
thead th.sorted { color: var(--accent); }
thead th.sorted::after { content: ' ▼'; font-size: 9px; }
thead th.sorted.asc::after { content: ' ▲'; }
tbody tr { border-bottom: 1px solid var(--border); transition: background 0.1s; }
tbody tr:hover { background: var(--surface2); }
tbody td { padding: 10px 12px; white-space: nowrap; }
.rank { color: var(--text2); font-size: 12px; }
.name-cell { font-weight: 600; cursor: pointer; }
.name-cell:hover { color: var(--accent); text-decoration: underline; }
.breed-badge {
  display: inline-block; padding: 2px 8px; border-radius: 4px;
  font-size: 11px; font-weight: 600; background: var(--surface2);
  border: 1px solid var(--border);
}
.guild-cell { color: var(--text2); font-size: 12px; }
.num { text-align: right; font-variant-numeric: tabular-nums; }
.num.high { color: var(--green); font-weight: 600; }
.num.neg { color: var(--red); }

/* Modal détail joueur */
.modal-overlay {
  display: none; position: fixed; inset: 0; background: rgba(0,0,0,0.7);
  z-index: 100; justify-content: center; align-items: flex-start;
  padding: 40px 20px; overflow-y: auto;
}
.modal-overlay.active { display: flex; }
.modal {
  background: var(--surface); border: 1px solid var(--border);
  border-radius: 12px; max-width: 800px; width: 100%;
  box-shadow: 0 20px 60px rgba(0,0,0,0.5);
}
.modal-header {
  display: flex; justify-content: space-between; align-items: center;
  padding: 20px 24px; border-bottom: 1px solid var(--border);
}
.modal-header h2 { font-size: 18px; }
.modal-close {
  background: none; border: none; color: var(--text2); font-size: 24px;
  cursor: pointer; padding: 4px 8px; border-radius: 4px;
}
.modal-close:hover { color: var(--text); background: var(--surface2); }
.modal-body { padding: 20px 24px; }

.player-stats {
  display: grid; grid-template-columns: repeat(auto-fit, minmax(150px, 1fr));
  gap: 12px; margin-bottom: 20px;
}
.player-stat {
  background: var(--surface2); border: 1px solid var(--border);
  border-radius: 6px; padding: 10px 14px;
}
.player-stat .ps-label { font-size: 11px; color: var(--text2); text-transform: uppercase; }
.player-stat .ps-value { font-size: 20px; font-weight: 700; margin-top: 2px; }

.tranche-tabs {
  display: flex; gap: 6px; flex-wrap: wrap; margin-bottom: 16px;
  padding-bottom: 12px; border-bottom: 1px solid var(--border);
}
.tranche-btn {
  background: var(--surface2); border: 1px solid var(--border); color: var(--text2);
  padding: 5px 12px; border-radius: 6px; font-size: 12px; cursor: pointer;
  font-weight: 600; transition: all 0.15s;
}
.tranche-btn:hover { border-color: var(--accent); color: var(--text); }
.tranche-btn.active { background: var(--accent2); border-color: var(--accent); color: #fff; }

.equip-table { margin-top: 16px; }
.equip-table th { font-size: 11px; }

.pagination {
  display: flex; gap: 8px; align-items: center; justify-content: center;
  padding: 16px; color: var(--text2); font-size: 13px;
}
.pagination button {
  background: var(--surface2); border: 1px solid var(--border);
  color: var(--text); padding: 6px 14px; border-radius: 6px;
  cursor: pointer; font-size: 13px;
}
.pagination button:hover { border-color: var(--accent); }
.pagination button:disabled { opacity: 0.4; cursor: default; }

.rarity-0 { color: #808080; } /* Commun */
.rarity-1 { color: #b0b0b0; } /* Inhabituel */
.rarity-2 { color: #4ade80; } /* Rare */
.rarity-3 { color: #f97316; } /* Mythique */
.rarity-4 { color: #fbbf24; } /* Legendaire */
.rarity-5 { color: #a855f7; } /* Relique */
.rarity-6 { color: #38bdf8; } /* Souvenir */
.rarity-7 { color: #e656ac; } /* Epique */

/* Modal tabs */
.modal-tabs { display: flex; gap: 0; margin: 16px 0 0; border-bottom: 2px solid var(--border); }
.modal-tab { padding: 8px 20px; cursor: pointer; font-size: 13px; font-weight: 600; color: var(--text2); border-bottom: 2px solid transparent; margin-bottom: -2px; transition: color .15s, border-color .15s; }
.modal-tab:hover { color: var(--text); }
.modal-tab.active { color: var(--orange); border-bottom-color: var(--orange); }

/* Spell decks */
.spell-deck { background: var(--card); border: 1px solid var(--border); border-radius: 8px; padding: 12px 16px; margin: 12px 0; }
.spell-deck-active { border-color: var(--green); box-shadow: 0 0 0 1px var(--green); }
.spell-deck-header { display: flex; align-items: center; gap: 10px; margin-bottom: 10px; }
.spell-deck-name { font-weight: 700; font-size: 14px; color: var(--text); }
.spell-deck-level { font-size: 12px; color: var(--text2); }
.spell-deck-badge { font-size: 11px; font-weight: 700; color: var(--green); background: rgba(74,222,128,.12); padding: 2px 8px; border-radius: 4px; }
.spell-section { margin-top: 8px; }
.spell-section-label { font-size: 11px; font-weight: 600; color: var(--text2); text-transform: uppercase; letter-spacing: .5px; margin-bottom: 6px; }
.spell-list { display: flex; flex-wrap: wrap; gap: 6px; }
.spell-id { display: inline-block; background: var(--bg); border: 1px solid var(--border); border-radius: 4px; padding: 3px 8px; font-size: 12px; font-family: monospace; color: var(--text); }
.spell-id.passive { border-color: var(--orange); color: var(--orange); }

/* Item & spell icons */
.item-icon { width: 32px; height: 32px; vertical-align: middle; margin-right: 6px; border-radius: 4px; image-rendering: pixelated; }
.item-id { font-size: 10px; color: var(--text2); font-family: monospace; margin-left: 4px; }
.spell-icon { width: 24px; height: 24px; vertical-align: middle; margin-right: 4px; border-radius: 3px; image-rendering: pixelated; }
</style>
</head>
<body>

<div class="header">
  <div style="display:flex;justify-content:space-between;align-items:center">
    <div>
      <h1><span>Wakfu</span> Weights Explorer</h1>
      <div class="subtitle">Classement des joueurs par poids d'equipement normalise &mdash; API: <a href="/api/docs">/api/docs</a></div>
    </div>
    <button class="reload-btn" onclick="reloadData()" title="Recharger les donnees depuis les fichiers">Recharger les donnees</button>
  </div>
</div>

<div class="stats-bar" id="statsBar"></div>

<div class="tabs">
  <div class="tab active" data-tab="players" onclick="switchTab('players')">Joueurs</div>
  <div class="tab" data-tab="guilds" onclick="switchTab('guilds')">Guildes</div>
  <div class="tab" data-tab="classes" onclick="switchTab('classes')">Classes</div>
</div>

<div id="panel-players">
  <div class="controls">
    <input type="text" id="searchInput" placeholder="Rechercher joueur ou guilde..." oninput="debounceSearch()">
    <select id="breedFilter" onchange="resetAndLoad()">
      <option value="">Toutes les classes</option>
    </select>
    <select id="levelRange" onchange="applyLevelRange()">
      <option value="0-245">Tous les niveaux</option>
      <option value="231-245">Endgame (231-245)</option>
      <option value="245-245">Max (245)</option>
      <option value="216-230">216-230</option>
      <option value="201-215">201-215</option>
      <option value="186-200">186-200</option>
      <option value="171-185">171-185</option>
      <option value="156-170">156-170</option>
      <option value="141-155">141-155</option>
      <option value="126-140">126-140</option>
      <option value="111-125">111-125</option>
      <option value="96-110">96-110</option>
      <option value="81-95">81-95</option>
      <option value="66-80">66-80</option>
      <option value="51-65">51-65</option>
      <option value="36-50">36-50</option>
      <option value="21-35">21-35</option>
      <option value="0-20">0-20</option>
      <option value="custom">Personnalise...</option>
    </select>
    <label>
      <span class="filter-label">Min</span>
      <input type="number" id="minLevel" value="0" min="0" max="245" style="width:60px" onchange="syncLevelPreset();resetAndLoad()">
    </label>
    <label>
      <span class="filter-label">Max</span>
      <input type="number" id="maxLevel" value="245" min="0" max="245" style="width:60px" onchange="syncLevelPreset();resetAndLoad()">
    </label>
    <select id="guildFilter" onchange="resetAndLoad()">
      <option value="">Toutes les guildes</option>
    </select>
    <select id="sortField" onchange="resetAndLoad()">
      <option value="score_global">Score Global</option>
      <option value="poids_offensif">Poids Offensif</option>
      <option value="poids_defensif">Poids Defensif</option>
      <option value="level">Niveau</option>
      <option value="total_pv">PV</option>
      <option value="total_res">Resistance</option>
      <option value="coup_crit">Coup Critique</option>
      <option value="tacle">Tacle</option>
      <option value="esquive">Esquive</option>
      <option value="pa">PA</option>
      <option value="pm">PM</option>
      <option value="nb_items">Nb items</option>
    </select>
    <select id="sortOrder" onchange="resetAndLoad()">
      <option value="desc">Desc</option>
      <option value="asc">Asc</option>
    </select>
    <button class="reset-btn" onclick="resetFilters()">Reset</button>
  </div>
  <div class="active-filters" id="activeFilters"></div>
  <div class="content">
    <table>
      <thead>
        <tr>
          <th>#</th><th>Joueur</th><th>Niv</th><th>Classe</th><th>Guilde</th>
          <th class="num">Score Global</th><th class="num">Poids Off</th><th class="num">Poids Def</th>
          <th class="num">PV</th><th class="num">Res</th>
          <th class="num">PA</th><th class="num">PM</th><th class="num">CC%</th>
        </tr>
      </thead>
      <tbody id="playersBody"></tbody>
    </table>
    <div class="pagination" id="pagination"></div>
  </div>
</div>

<div id="panel-guilds" style="display:none">
  <div class="controls">
    <label>
      Membres min
      <input type="number" id="guildMinMembers" value="2" min="1" style="width:70px" onchange="loadGuilds()">
    </label>
  </div>
  <div class="content">
    <table>
      <thead>
        <tr>
          <th>#</th><th>Guilde</th><th class="num">Membres</th>
          <th class="num">Moy. Poids Off</th><th class="num">Max Poids Off</th>
          <th class="num">Moy. Niveau</th><th class="num">Moy. Poids Def</th>
          <th>Top Joueur</th>
        </tr>
      </thead>
      <tbody id="guildsBody"></tbody>
    </table>
  </div>
</div>

<div id="panel-classes" style="display:none">
  <div class="content" style="padding-top:16px">
    <table>
      <thead>
        <tr>
          <th>Classe</th><th class="num">Joueurs</th>
          <th class="num">Moy. Poids Off</th><th class="num">Max Poids Off</th>
          <th class="num">Moy. Niveau</th><th>Top Joueur</th>
        </tr>
      </thead>
      <tbody id="classesBody"></tbody>
    </table>
  </div>
</div>

<div class="modal-overlay" id="playerModal" onclick="if(event.target===this)closeModal()">
  <div class="modal">
    <div class="modal-header">
      <h2 id="modalTitle"></h2>
      <button class="modal-close" onclick="closeModal()">&times;</button>
    </div>
    <div class="modal-body" id="modalBody"></div>
  </div>
</div>

<script>
const API = '';
let currentOffset = 0;
const PAGE_SIZE = 50;
let searchTimeout = null;

// Chargement initial
async function reloadData() {
  const btn = document.querySelector('.reload-btn');
  btn.disabled = true; btn.textContent = 'Chargement...';
  try {
    const res = await fetch('/api/reload', {method:'POST'});
    const data = await res.json();
    btn.textContent = `${data.total_players} joueurs charges`;

    // Rafraichir les stats globales
    const stats = await fetchJson('/api/stats');
    window._stats = stats;
    renderStats(stats);

    // Rafraichir la liste courante sans reset les filtres
    loadPlayers();
    loadGuilds();

    // Si un modal est ouvert, le re-fetch avec le meme joueur/tranche
    if (document.getElementById('playerModal').classList.contains('active') && _currentModalPlayer) {
      showPlayer(_currentModalPlayer, _currentViewingTranche);
    }

    setTimeout(() => { btn.textContent = 'Recharger les donnees'; btn.disabled = false; }, 2000);
  } catch(e) {
    btn.textContent = 'Erreur!'; btn.disabled = false;
  }
}

// SSE live-update
let _sseReconnectDelay = 1000;
function _connectSSE() {
  const es = new EventSource('/api/events');
  es.addEventListener('reload', () => {
    // Recharge silencieuse (pas de spinner)
    _silentReload();
  });
  es.onopen = () => { _sseReconnectDelay = 1000; };
  es.onerror = () => {
    es.close();
    setTimeout(_connectSSE, _sseReconnectDelay);
    _sseReconnectDelay = Math.min(_sseReconnectDelay * 2, 30000);
  };
}

let _reloading = false;
async function _silentReload() {
  if (_reloading) return;
  _reloading = true;
  try {
    const savedTab = _currentModalTab;
    const stats = await fetchJson('/api/stats');
    window._stats = stats;
    renderStats(stats);
    loadPlayers();
    loadGuilds();
    if (document.getElementById('playerModal').classList.contains('active') && _currentModalPlayer) {
      await showPlayer(_currentModalPlayer, _currentViewingTranche, true);
      switchModalTab(savedTab);
    }
  } catch(e) {}
  finally { _reloading = false; }
}

async function init() {
  const stats = await fetchJson('/api/stats');
  window._stats = stats;
  renderStats(stats);
  populateBreedFilter(stats.classes);
  populateGuildFilter();
  loadPlayers();
  loadGuilds();
  loadClasses(stats.classes);
  _connectSSE();
}

async function fetchJson(url) {
  const res = await fetch(API + url);
  return res.json();
}

function renderStats(s) {
  document.getElementById('statsBar').innerHTML = `
    <div class="stat-card"><div class="label">Joueurs</div><div class="value accent">${s.total_players}</div></div>
    <div class="stat-card"><div class="label">Guildes</div><div class="value">${s.total_guilds}</div></div>
    <div class="stat-card"><div class="label">Niveau moyen</div><div class="value">${s.avg_level}</div></div>
    <div class="stat-card"><div class="label">Top Poids Off</div><div class="value green">${s.max_poids_offensif}</div></div>
    <div class="stat-card"><div class="label">N1</div><div class="value accent">${s.top_player}</div></div>
    <div class="stat-card"><div class="label">Moy. Poids Off</div><div class="value">${s.avg_poids_offensif}</div></div>
  `;
}

function populateBreedFilter(classes) {
  const sel = document.getElementById('breedFilter');
  classes.sort((a,b) => a.breedName.localeCompare(b.breedName));
  classes.forEach(c => {
    const opt = document.createElement('option');
    opt.value = c.breedName; opt.textContent = `${c.breedName} (${c.count})`;
    sel.appendChild(opt);
  });
}

async function populateGuildFilter() {
  const data = await fetchJson('/api/guilds?min_members=2&limit=500');
  const sel = document.getElementById('guildFilter');
  data.guilds.forEach(g => {
    const opt = document.createElement('option');
    opt.value = g.guild_name;
    opt.textContent = `${g.guild_name} (${g.nb_members})`;
    sel.appendChild(opt);
  });
}

function switchTab(tab) {
  document.querySelectorAll('.tab').forEach(t => t.classList.toggle('active', t.dataset.tab === tab));
  ['players','guilds','classes'].forEach(p => {
    document.getElementById('panel-'+p).style.display = p === tab ? '' : 'none';
  });
}

function applyLevelRange() {
  const val = document.getElementById('levelRange').value;
  if (val === 'custom') return;
  const [min, max] = val.split('-').map(Number);
  document.getElementById('minLevel').value = min;
  document.getElementById('maxLevel').value = max;
  resetAndLoad();
}

function syncLevelPreset() {
  const min = parseInt(document.getElementById('minLevel').value) || 0;
  const max = parseInt(document.getElementById('maxLevel').value) || 245;
  const sel = document.getElementById('levelRange');
  const key = `${min}-${max}`;
  // Chercher si un preset correspond
  let found = false;
  for (const opt of sel.options) {
    if (opt.value === key) { sel.value = key; found = true; break; }
  }
  if (!found) sel.value = 'custom';
}

function resetAndLoad() {
  currentOffset = 0;
  loadPlayers();
  updateActiveFilters();
}

function resetFilters() {
  document.getElementById('searchInput').value = '';
  document.getElementById('breedFilter').value = '';
  document.getElementById('levelRange').value = '0-245';
  document.getElementById('minLevel').value = '0';
  document.getElementById('maxLevel').value = '245';
  document.getElementById('guildFilter').value = '';
  document.getElementById('sortField').value = 'score_global';
  document.getElementById('sortOrder').value = 'desc';
  resetAndLoad();
}

function updateActiveFilters() {
  const tags = [];
  const breed = document.getElementById('breedFilter').value;
  const guild = document.getElementById('guildFilter').value;
  const minLvl = parseInt(document.getElementById('minLevel').value) || 0;
  const maxLvl = parseInt(document.getElementById('maxLevel').value) || 245;
  const sort = document.getElementById('sortField').selectedOptions[0].textContent;
  const order = document.getElementById('sortOrder').value === 'asc' ? 'Asc' : 'Desc';

  if (breed) tags.push({label: `Classe: ${breed}`, clear: () => { document.getElementById('breedFilter').value=''; resetAndLoad(); }});
  if (guild) tags.push({label: `Guilde: ${guild}`, clear: () => { document.getElementById('guildFilter').value=''; resetAndLoad(); }});
  if (minLvl > 0 || maxLvl < 245) tags.push({label: `Niv. ${minLvl}-${maxLvl}`, clear: () => { document.getElementById('minLevel').value='0'; document.getElementById('maxLevel').value='245'; document.getElementById('levelRange').value='0-999'; resetAndLoad(); }});

  const el = document.getElementById('activeFilters');
  if (tags.length === 0) { el.innerHTML = ''; return; }
  el.innerHTML = tags.map((t,i) => `<span class="filter-tag">${t.label} <span class="remove" onclick="window._clearFilter(${i})">x</span></span>`).join('');
  window._filterClears = tags.map(t => t.clear);
}
window._clearFilter = (i) => { if(window._filterClears && window._filterClears[i]) window._filterClears[i](); };

// ── Joueurs ─────────────────────────────────────────────────

async function loadPlayers() {
  const breed = document.getElementById('breedFilter').value;
  const sort = document.getElementById('sortField').value;
  const order = document.getElementById('sortOrder').value;
  const minLvl = document.getElementById('minLevel').value;
  const maxLvl = document.getElementById('maxLevel').value;
  const guild = document.getElementById('guildFilter').value;
  const search = document.getElementById('searchInput').value;

  updateActiveFilters();

  let url = `/api/players?sort=${sort}&order=${order}&limit=${PAGE_SIZE}&offset=${currentOffset}&min_level=${minLvl}&max_level=${maxLvl}`;
  if (breed) url += `&breed=${encodeURIComponent(breed)}`;
  if (guild) url += `&guild=${encodeURIComponent(guild)}`;
  if (search.length >= 2) {
    // Recherche combinee via l'API players avec filtre guild en texte
    let searchUrl = `/api/players?sort=${sort}&order=${order}&limit=${PAGE_SIZE}&offset=0&min_level=${minLvl}&max_level=${maxLvl}`;
    if (breed) searchUrl += `&breed=${encodeURIComponent(breed)}`;
    // Tenter comme nom de guilde ET comme nom de joueur
    const [byGuild, byName] = await Promise.all([
      fetchJson(searchUrl + `&guild=${encodeURIComponent(search)}`),
      fetchJson(`/api/search?q=${encodeURIComponent(search)}`)
    ]);
    // Fusionner sans doublons
    const seen = new Set();
    const merged = [];
    for (const p of [...byName.players, ...byGuild.players]) {
      if (!seen.has(p.name)) { seen.add(p.name); merged.push(p); }
    }
    renderPlayerRows(merged, 0);
    document.getElementById('pagination').innerHTML = `<span>${merged.length} resultats</span>`;
    return;
  }

  const data = await fetchJson(url);
  renderPlayerRows(data.players, currentOffset);
  renderPagination(data.total, data.offset, data.limit);
}

function renderPlayerRows(players, startOffset) {
  const tbody = document.getElementById('playersBody');
  tbody.innerHTML = players.map((p, i) => `
    <tr>
      <td class="rank">${startOffset+i+1}</td>
      <td class="name-cell" data-player="${esc(p.name)}">${esc(p.name)}</td>
      <td>${p.level}</td>
      <td><span class="breed-badge">${p.breedName}</span></td>
      <td class="guild-cell">${esc(p.guild_name) || '-'}</td>
      <td class="num" style="color:var(--orange);font-weight:700">${p.score_global.toFixed(1)}</td>
      <td class="num high">${p.poids_offensif.toFixed(1)}</td>
      <td class="num">${p.poids_defensif.toFixed(1)}</td>
      <td class="num">${p.total_pv}</td>
      <td class="num">${p.total_res}</td>
      <td class="num">${p.pa}</td>
      <td class="num">${p.pm}</td>
      <td class="num ${p.coup_crit<0?'neg':''}">${p.coup_crit>0?'+':''}${p.coup_crit}%</td>
    </tr>
  `).join('');
}

function renderPagination(total, offset, limit) {
  const pages = Math.ceil(total / limit);
  const current = Math.floor(offset / limit) + 1;
  document.getElementById('pagination').innerHTML = `
    <button ${offset===0?'disabled':''} onclick="goPage(${offset-limit})">Precedent</button>
    <span>Page ${current} / ${pages} (${total} joueurs)</span>
    <button ${offset+limit>=total?'disabled':''} onclick="goPage(${offset+limit})">Suivant</button>
  `;
}

function goPage(newOffset) {
  currentOffset = Math.max(0, newOffset);
  loadPlayers();
}

function debounceSearch() {
  clearTimeout(searchTimeout);
  currentOffset = 0;
  searchTimeout = setTimeout(loadPlayers, 300);
}

// ── Detail joueur ───────────────────────────────────────────

// Labels des tranches : borne basse → label lisible
const TRANCHE_LABELS = {
  0:'0-20', 20:'21-35', 35:'36-50', 50:'51-65', 65:'66-80', 80:'81-95',
  95:'96-110', 110:'111-125', 125:'126-140', 140:'141-155', 155:'156-170',
  170:'171-185', 185:'186-200', 200:'201-215', 215:'216-230', 230:'231-245'
};

// État du modal joueur (pour reload sans perdre le contexte)
let _currentModalPlayer = '';
let _currentViewingTranche = null;
let _currentModalTab = 'equip';

async function showPlayer(nameEncoded, tranche, keepTab) {
  if (!keepTab) _currentModalTab = 'equip';
  _currentModalPlayer = nameEncoded;
  _currentViewingTranche = tranche !== undefined ? tranche : null;
  let url = `/api/players/${nameEncoded}`;
  if (tranche !== undefined && tranche !== null) url += `?tranche=${tranche}`;
  let data;
  try {
    data = await fetchJson(url);
  } catch(e) { console.error('showPlayer fetch error:', e); return; }
  if (data.error) { console.error('showPlayer API error:', data.error); return; }

  const viewingLabel = data.viewing_tranche !== null
    ? `Tranche ${TRANCHE_LABELS[data.viewing_tranche] || data.viewing_tranche}`
    : 'Niveau actuel';

  document.getElementById('modalTitle').textContent =
    `${data.name} — Niv.${data.level} ${data.breedName}`;

  // Construire les onglets de tranche
  let trancheTabs = '';
  if (data.available_tranches && data.available_tranches.length > 0) {
    const currentBtn = `<button class="tranche-btn ${data.viewing_tranche===null?'active':''}"
      data-tranche-player="${nameEncoded}" data-tranche-id="">Actuel (Niv.${data.level})</button>`;
    const trancheBtns = data.available_tranches.map(t =>
      `<button class="tranche-btn ${data.viewing_tranche===t?'active':''}"
        data-tranche-player="${nameEncoded}" data-tranche-id="${t}">${TRANCHE_LABELS[t]||t}</button>`
    ).join('');
    trancheTabs = `<div class="tranche-tabs">${currentBtn}${trancheBtns}</div>`;
  }

  const rarityNames = {0:'Commun',1:'Inhabituel',2:'Rare',3:'Mythique',4:'Legendaire',5:'Relique',6:'Souvenir',7:'Epique'};

  let equipRows = '';
  if (data.equipment) {
    equipRows = data.equipment.map(e => {
      const iconUrl = e.gfx_id ? `/icons/items/${e.gfx_id}.png` : '';
      const iconImg = iconUrl ? `<img src="${iconUrl}" class="item-icon" onerror="this.style.display='none'" alt="">` : '';
      return `
      <tr>
        <td>${esc(e.slot_name)}</td>
        <td class="rarity-${e.rarity}">${iconImg}${esc(e.name)}</td>
        <td class="num">${e.level}</td>
        <td><span class="rarity-${e.rarity}">${rarityNames[e.rarity]||e.rarity}</span></td>
        <td class="num ${e.poids_off>0?'high':e.poids_off<0?'neg':''}">${e.poids_off.toFixed(1)}</td>
        <td class="num">${e.pv}</td>
        <td class="num">${e.res}</td>
        <td class="num">${e.pa}</td>
        <td class="num">${e.pm}</td>
      </tr>`;
    }).join('');
  }

  // Sorts
  let spellsHtml = '<div style="color:var(--text2);font-style:italic">Aucune donnee de sorts disponible</div>';
  if (data.spells && data.spells.decks && data.spells.decks.length > 0) {
    const activeDeckIdx = data.spells.active_deck || 0;
    const builds = data.spells.builds || [];

    spellsHtml = data.spells.decks.map(deck => {
      const buildInfo = builds.find(b => b.index === deck.index);
      const buildName = buildInfo ? buildInfo.name : `Deck ${deck.index}`;
      const isActive = deck.index === activeDeckIdx;
      const levelLabel = deck.level === -1 ? 'Niv. reel' : `Niv. ${deck.level}`;

      const renderSpell = (s, cls) => {
        const id = typeof s === 'object' ? s.id : s;
        const name = typeof s === 'object' && s.name ? s.name : '';
        const gfxId = typeof s === 'object' && s.gfxId ? s.gfxId : id;
        const label = name || id;
        const tooltip = name ? `${name} (ID: ${id})` : `Sort #${id}`;
        return `<span class="spell-id ${cls}" title="${esc(tooltip)}"><img src="/icons/spells/${gfxId}.png" class="spell-icon" onerror="this.style.display='none'" alt="">${esc(String(label))}</span>`;
      };
      const activeSpells = deck.active_spells.map(s => renderSpell(s, '')).join('');
      const passiveSpells = deck.passive_spells.map(s => renderSpell(s, 'passive')).join('');

      return `
        <div class="spell-deck ${isActive?'spell-deck-active':''}">
          <div class="spell-deck-header">
            <span class="spell-deck-name">${esc(buildName)}</span>
            <span class="spell-deck-level">${levelLabel}</span>
            ${isActive ? '<span class="spell-deck-badge">Actif</span>' : ''}
          </div>
          <div class="spell-section">
            <div class="spell-section-label">Sorts actifs (${deck.active_spells.length})</div>
            <div class="spell-list">${activeSpells || '<span style="color:var(--text2)">-</span>'}</div>
          </div>
          <div class="spell-section">
            <div class="spell-section-label">Sorts passifs (${deck.passive_spells.length})</div>
            <div class="spell-list">${passiveSpells || '<span style="color:var(--text2)">-</span>'}</div>
          </div>
        </div>
      `;
    }).join('');
  }

  // Sorts observés en combat (source: crq hook)
  const combatObs = data.spells && data.spells.combat_observed;
  if (combatObs && combatObs.length > 0) {
    const renderSpellCombat = (s) => {
      const id = s.id, name = s.name || '', gfxId = s.gfxId || id;
      const label = name || `#${id}`;
      const tooltip = name ? `${name} (ID: ${id})` : `Sort #${id}`;
      return `<span class="spell-id" title="${esc(tooltip)}"><img src="/icons/spells/${gfxId}.png" class="spell-icon" onerror="this.style.display='none'" alt="">${esc(label)}</span>`;
    };
    const combatSpellsHtml = combatObs.map(renderSpellCombat).join('');
    spellsHtml = `<div class="spell-deck spell-deck-active">
      <div class="spell-deck-header">
        <span class="spell-deck-name">⚔ Sorts observés en combat</span>
        <span class="spell-deck-level">${combatObs.length} sorts</span>
      </div>
      <div class="spell-section">
        <div class="spell-list">${combatSpellsHtml}</div>
      </div>
    </div>` + (spellsHtml.includes('Aucune') ? '' : spellsHtml);
  }

  document.getElementById('modalBody').innerHTML = `
    ${trancheTabs}
    <div class="player-stats">
      <div class="player-stat"><div class="ps-label">Score Global</div><div class="ps-value" style="color:var(--orange)">${data.score_global.toFixed(1)}</div></div>
      <div class="player-stat"><div class="ps-label">Poids Offensif</div><div class="ps-value" style="color:var(--green)">${data.poids_offensif.toFixed(1)}</div></div>
      <div class="player-stat"><div class="ps-label">Poids Defensif</div><div class="ps-value">${data.poids_defensif.toFixed(1)}</div></div>
      <div class="player-stat"><div class="ps-label">PV</div><div class="ps-value">${data.total_pv}</div></div>
      <div class="player-stat"><div class="ps-label">Resistance</div><div class="ps-value">${data.total_res}</div></div>
      <div class="player-stat"><div class="ps-label">PA / PM / PO</div><div class="ps-value">${data.pa} / ${data.pm} / ${data.po}</div></div>
      <div class="player-stat"><div class="ps-label">Coup Critique</div><div class="ps-value">${data.coup_crit>0?'+':''}${data.coup_crit}%</div></div>
      <div class="player-stat"><div class="ps-label">Tacle / Esquive</div><div class="ps-value">${data.tacle} / ${data.esquive}</div></div>
      <div class="player-stat"><div class="ps-label">Guilde</div><div class="ps-value" style="font-size:14px">${esc(data.guild_name)||'-'}</div></div>
    </div>

    <div class="modal-tabs">
      <div class="modal-tab active" data-mtab="equip" onclick="switchModalTab('equip')">Equipement</div>
      <div class="modal-tab" data-mtab="spells" onclick="switchModalTab('spells')">Sorts</div>
    </div>

    <div id="mtab-equip">
      <h3 style="margin:12px 0;font-size:14px;color:var(--text2)">EQUIPEMENT (${data.nb_items} pieces) — ${viewingLabel}${data.snapshot_timestamp ? `<span style="font-size:11px;color:var(--text2);margin-left:10px;font-weight:normal">snapshot : ${data.snapshot_timestamp.replace('T',' ').substring(0,16)}</span>` : ''}</h3>
      <table class="equip-table">
        <thead><tr>
          <th>Slot</th><th>Item</th><th class="num">Niv</th><th>Rarete</th>
          <th class="num">Poids Off</th><th class="num">PV</th><th class="num">Res</th>
          <th class="num">PA</th><th class="num">PM</th>
        </tr></thead>
        <tbody>${equipRows}</tbody>
      </table>
    </div>

    <div id="mtab-spells" style="display:none">
      <h3 style="margin:12px 0;font-size:14px;color:var(--text2)">SORTS & BUILDS</h3>
      ${spellsHtml}
    </div>
  `;

  document.getElementById('playerModal').classList.add('active');
  switchModalTab(_currentModalTab);
}

function switchModalTab(tab) {
  _currentModalTab = tab;
  document.querySelectorAll('.modal-tab').forEach(t => t.classList.toggle('active', t.dataset.mtab === tab));
  document.getElementById('mtab-equip').style.display = tab === 'equip' ? '' : 'none';
  document.getElementById('mtab-spells').style.display = tab === 'spells' ? '' : 'none';
}

function closeModal() {
  document.getElementById('playerModal').classList.remove('active');
}
document.addEventListener('keydown', e => { if(e.key==='Escape') closeModal(); });

// Event delegation pour les clics sur les noms de joueurs et boutons de tranche
document.addEventListener('click', e => {
  const cell = e.target.closest('.name-cell[data-player]');
  if (cell) { showPlayer(encodeURIComponent(cell.dataset.player)); return; }
  const tbtn = e.target.closest('.tranche-btn[data-tranche-player]');
  if (tbtn) {
    const tid = tbtn.dataset.trancheId;
    showPlayer(tbtn.dataset.tranchePlayer, tid !== '' ? parseInt(tid) : undefined);
  }
});

// ── Guildes ─────────────────────────────────────────────────

async function loadGuilds() {
  const minM = document.getElementById('guildMinMembers').value;
  const data = await fetchJson(`/api/guilds?min_members=${minM}&limit=200`);
  const tbody = document.getElementById('guildsBody');
  tbody.innerHTML = data.guilds.map((g, i) => `
    <tr>
      <td class="rank">${i+1}</td>
      <td style="font-weight:600">${esc(g.guild_name)}</td>
      <td class="num">${g.nb_members}</td>
      <td class="num high">${g.avg_poids_offensif}</td>
      <td class="num">${g.max_poids_offensif}</td>
      <td class="num">${g.avg_level}</td>
      <td class="num">${g.avg_poids_defensif}</td>
      <td class="name-cell" data-player="${esc(g.top_player)}">${esc(g.top_player)}</td>
    </tr>
  `).join('');
}

// ── Classes ─────────────────────────────────────────────────

function loadClasses(classes) {
  const tbody = document.getElementById('classesBody');
  const sorted = [...classes].sort((a,b) => b.avg_poids_offensif - a.avg_poids_offensif);
  tbody.innerHTML = sorted.map(c => `
    <tr>
      <td><span class="breed-badge">${c.breedName}</span></td>
      <td class="num">${c.count}</td>
      <td class="num high">${c.avg_poids_offensif}</td>
      <td class="num">${c.max_poids_offensif}</td>
      <td class="num">${c.avg_level}</td>
      <td class="name-cell" data-player="${esc(c.top_player)}">${esc(c.top_player)}</td>
    </tr>
  `).join('');
}

function esc(s) {
  if (!s) return '';
  const d = document.createElement('div'); d.textContent = s; return d.innerHTML;
}

init();
</script>
</body>
</html>"""


# ═══════════════════════════ Démarrage ═══════════════════════════════

def kill_port(port_num):
    import socket as _s
    _sock = _s.socket(_s.AF_INET, _s.SOCK_STREAM)
    try:
        _sock.bind(("127.0.0.1", port_num))
        _sock.close()
        return
    except OSError:
        _sock.close()
    try:
        import subprocess as _sp
        _r = _sp.run(["netstat", "-ano", "-p", "TCP"],
                      capture_output=True, timeout=5, encoding="utf-8", errors="replace")
        for _line in _r.stdout.splitlines():
            if f"127.0.0.1:{port_num}" in _line and "LISTENING" in _line:
                _pid = int(_line.split()[-1])
                _sp.run(["taskkill", "/F", "/PID", str(_pid)],
                        capture_output=True, timeout=5, encoding="utf-8", errors="replace")
                log.info("Port %d: processus %d tué.", port_num, _pid)
                import time; time.sleep(1)
                return
    except Exception as e:
        log.warning("kill_port: %s", e)


def main():
    parser = argparse.ArgumentParser(description="Wakfu Weights API")
    parser.add_argument("--host", default="127.0.0.1", help="Adresse d'ecoute")
    parser.add_argument("--port", type=int, default=8042, help="Port (defaut: 8042)")
    args = parser.parse_args()

    charger_donnees()
    kill_port(args.port)
    _start_file_watcher()

    print(f"\n  Wakfu Weights API")
    print(f"  Interface : http://{args.host}:{args.port}/")
    print(f"  API docs  : http://{args.host}:{args.port}/api/docs")
    print(f"  Swagger   : http://{args.host}:{args.port}/docs")
    print()

    uvicorn.run(app, host=args.host, port=args.port, log_level="info")


if __name__ == "__main__":
    main()
