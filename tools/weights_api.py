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

def _fix_mojibake(s):
    """Corrige les doubles encodages UTF-8 (mojibake)."""
    if not isinstance(s, str):
        return s
    try:
        return s.encode("latin-1").decode("utf-8")
    except (UnicodeDecodeError, UnicodeEncodeError):
        return s


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
        import time as _wt
        _last_reload = 0
        COOLDOWN = 10  # secondes minimum entre deux reloads
        log.info("Watcher demarre sur %s (cooldown %ds)", watch_paths, COOLDOWN)
        for changes in watch(*watch_paths, debounce=2000, yield_on_timeout=False):
            try:
                # Vérifier si combat_spells.jsonl a changé
                combat_changed = any(
                    str(COMBAT_SPELLS_FILE) in str(p)
                    for _, p in changes
                )
                if combat_changed:
                    new_spells = _load_combat_spells_incremental()
                    if new_spells:
                        log.info("Watcher: nouveaux sorts combat detectes")
                        _notify_clients("reload", '{"source":"combat"}')
                    continue

                # Cooldown : ignorer si reload trop recent
                now = _wt.time()
                if now - _last_reload < COOLDOWN:
                    log.debug("Watcher: %d changes ignores (cooldown)", len(changes))
                    continue

                nb = len(changes)
                recharger_joueurs()
                _last_reload = _wt.time()
                log.info("Watcher: %d fichiers -> joueurs recharges en fond", nb)
                _notify_clients("reload", '{"source":"file"}')
            except Exception as e:
                log.warning("Watcher reload error: %s", e)

    t = threading.Thread(target=_run, name="PlayerWatcher", daemon=True)
    t.start()


# Tranches Wakfu : 0-20, puis par paliers de 15
TRANCHES = [0, 20, 35, 50, 65, 80, 95, 110, 125, 140, 155, 170, 185, 200, 215, 230]

RE_TRANCHE_FILE = re.compile(r"^(.+)_t(\d+)\.json$")



def recharger_joueurs():
    """Recharge UNIQUEMENT les joueurs (pas le CDN ni les sorts)."""
    global _players, _players_by_name, _player_tranches, _guilds, _stats
    import time as _time
    t0 = _time.time()

    joueurs_raw = []
    tranche_files = defaultdict(list)
    for fichier in sorted(PLAYERS_DIR.glob("*.json")):
        m = RE_TRANCHE_FILE.match(fichier.name)
        if m:
            safe_name = m.group(1)
            tranche = int(m.group(2))
            tranche_files[safe_name].append((tranche, fichier))
        else:
            try:
                with open(fichier, "r", encoding="utf-8") as f:
                    data = json.load(f)
                joueurs_raw.append((fichier.stem, data, fichier))
            except Exception as e:
                log.warning("Reload: erreur lecture %s : %s", fichier.name, e)

    resultats = []
    for safe_name, j, src_file in joueurs_raw:
        r = calculer_joueur(j, _items_db)
        if r is not None:
            r["_safe_name"] = safe_name
            ts = j.get("timestamp", "")
            if not ts:
                try:
                    import os as _os
                    from datetime import datetime as _dt
                    mtime = _os.path.getmtime(str(src_file))
                    ts = _dt.fromtimestamp(mtime).strftime("%Y-%m-%d %H:%M")
                except Exception:
                    pass
            r["snapshot_timestamp"] = ts
            r["score_global"] = round(r["poids_offensif"] + r["poids_defensif"], 1)
            resultats.append(r)

    _player_tranches = {}
    for safe_name, fichiers_tranche in tranche_files.items():
        tranches_dict = {}
        for tranche, fpath in fichiers_tranche:
            try:
                with open(fpath, "r", encoding="utf-8") as f:
                    data = json.load(f)
                niveau_max_tranche = tranche + 15
                r2 = calculer_joueur(data, _items_db, niveau_max=niveau_max_tranche)
                if r2 is not None:
                    r2["score_global"] = round(r2["poids_offensif"] + r2["poids_defensif"], 1)
                    ds = data.get("downscaleLevel", 0)
                    r2["effective_level"] = ds if ds and ds > 0 else data.get("level", 0)
                    r2["tranche"] = tranche
                    r2["snapshot_timestamp"] = data.get("timestamp", "")
                    if not r2["snapshot_timestamp"]:
                        try:
                            import os as _os
                            from datetime import datetime as _dt
                            mtime = _os.path.getmtime(str(fpath))
                            r2["snapshot_timestamp"] = _dt.fromtimestamp(mtime).strftime("%Y-%m-%d %H:%M")
                        except Exception:
                            pass
                    tranches_dict[tranche] = r2
            except Exception:
                pass
        if tranches_dict:
            _player_tranches[safe_name.lower()] = tranches_dict

    resultats.sort(key=lambda x: x.get("poids_offensif", 0), reverse=True)
    for i, r in enumerate(resultats, 1):
        r["rank"] = i

    _players = resultats
    _players_by_name = {r["name"].lower(): r for r in resultats}

    # Tri par score et attribution des rangs
    resultats.sort(key=lambda x: x.get("score_global", 0), reverse=True)
    for i, r in enumerate(resultats, 1):
        r["rank"] = i

    # Construire les guildes avec stats agregees (meme format que charger_donnees)
    guildes_map = defaultdict(lambda: {"joueurs": [], "guild_name": "", "guild_id": 0})
    for r in resultats:
        gid = r.get("guild_id", 0)
        if gid == 0:
            continue
        guildes_map[gid]["joueurs"].append(r)
        if len(r.get("guild_name", "")) > len(guildes_map[gid]["guild_name"]):
            guildes_map[gid]["guild_name"] = r["guild_name"]
            guildes_map[gid]["guild_id"] = gid

    guild_list = []
    for gid, g in guildes_map.items():
        joueurs = g["joueurs"]
        n = len(joueurs)
        guild_list.append({
            "guild_name": g["guild_name"] or "Guilde#" + str(gid),
            "guild_id": gid,
            "nb_members": n,
            "avg_poids_offensif": round(sum(j["poids_offensif"] for j in joueurs) / n, 1),
            "avg_level": round(sum(j["level"] for j in joueurs) / n, 1),
            "avg_poids_defensif": round(sum(j["poids_defensif"] for j in joueurs) / n, 1),
            "top_player": max(joueurs, key=lambda j: j["poids_offensif"])["name"],
            "max_poids_offensif": round(max(j["poids_offensif"] for j in joueurs), 1),
        })
    guild_list = [g for g in guild_list if not g["guild_name"].startswith("Guilde#")]
    guild_list.sort(key=lambda x: x["avg_poids_offensif"], reverse=True)
    _guilds = guild_list

    nb_joueurs = len(resultats)
    off_values = [r["poids_offensif"] for r in resultats if r.get("poids_offensif")]
    lvl_values = [r["level"] for r in resultats if r.get("level")]

    # Calcul des classes
    classes_map = defaultdict(list)
    for r in resultats:
        classes_map[r['breedName']].append(r)
    classes_stats = []
    for breed, members in sorted(classes_map.items(), key=lambda x: -len(x[1])):
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
        "total_players": nb_joueurs,
        "total_raw": len(joueurs_raw),
        "players_sans_stuff": len(joueurs_raw) - nb_joueurs,
        "total_guilds": len(guild_list),
        "last_update": max((r.get("snapshot_timestamp", "") for r in resultats), default="inconnu"),
        "classes": classes_stats,
        "max_poids_offensif": round(max(off_values, default=0), 1),
        "top_player": resultats[0]["name"] if resultats else "-",
        "avg_poids_offensif": round(sum(off_values) / len(off_values), 1) if off_values else 0,
        "avg_level": round(sum(lvl_values) / len(lvl_values), 1) if lvl_values else 0,
    }

    elapsed = round((_time.time() - t0) * 1000)
    log.info("  -> %d joueurs recharges en %d ms (CDN skip)", nb_joueurs, elapsed)

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
                joueurs_raw.append((fichier.stem, data, fichier))
            except Exception as e:
                log.warning("Erreur lecture %s : %s", fichier.name, e)

    log.info("  → %d joueurs chargés, %d avec snapshots par tranche.",
             len(joueurs_raw), len(tranche_files))

    # Calculer les joueurs principaux
    resultats = []
    for safe_name, j, _src_file in joueurs_raw:

        r = calculer_joueur(j, _items_db)
        if r is not None:
            r["_safe_name"] = safe_name
            try:
                _mtime = os.path.getmtime(_src_file)
                from datetime import datetime as _dt
                r["snapshot_timestamp"] = _dt.fromtimestamp(_mtime).strftime("%Y-%m-%d %H:%M")
            except Exception:
                r["snapshot_timestamp"] = ""
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
                    if not r["snapshot_timestamp"]:
                        import os as _os
                        from datetime import datetime as _dt
                        try:
                            mtime = _os.path.getmtime(path)
                            r["snapshot_timestamp"] = _dt.fromtimestamp(mtime).strftime("%Y-%m-%d %H:%M")
                        except Exception:
                            pass
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
    guild_list = [g for g in guild_list if not g["guild_name"].startswith("Guilde#")]
    guild_list = [g for g in guild_list if not g["guild_name"].startswith("Guilde#")]
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
        "last_update": max((r.get("snapshot_timestamp", "") for r in resultats), default="inconnu"),
        "weight_system": POIDS_MAITRISE,
    }

    log.info("Données prêtes : %d joueurs, %d guildes.", len(resultats), len(guild_list))


# ═══════════════════════════ FastAPI ═════════════════════════════════


# --- Wakfu Command Center: routes unifiees ---
import sys, os
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from patch_unified_api import register_unified_routes, register_ui_route
from auth import verify as verify_api_key, register as register_auth_routes

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
        "poids_offensif": round(r["poids_offensif"], 2),
        "poids_defensif": round(r["poids_defensif"], 2),
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
        equip_raw = sorted(r.get("items_detail", []), key=lambda x: x["slot"])
        for eq in equip_raw:
            eq["poids_off"] = round(eq.get("poids_off", 0), 2)
        out["equipment"] = equip_raw
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



@app.get("/api/recent")
def api_recent(limit: int = Query(50, description="Nombre max de resultats")):
    """Derniers joueurs detectes: nouveaux et mis a jour."""
    import os as _ros
    from datetime import datetime as _rdt

    new_players = []
    updated_players = []

    for fichier in sorted(PLAYERS_DIR.glob("*.json"), key=lambda f: f.stat().st_mtime, reverse=True):
        if RE_TRANCHE_FILE.match(fichier.name):
            continue
        try:
            st = fichier.stat()
            ctime = st.st_ctime
            mtime = st.st_mtime
            # Lire le JSON pour avoir nom, classe, niveau
            with open(fichier, "r", encoding="utf-8") as f:
                data = json.load(f)

            name = data.get("name", fichier.stem)

            # Parser la guilde depuis le champ brut ou depuis _players_by_name
            guild_name = ""
            guild_raw = data.get("guild", "")
            if isinstance(guild_raw, str) and "m_name=" in guild_raw:
                import re as _re
                m_name = _re.search(r"m_name='([^']*)'", guild_raw)
                if m_name:
                    guild_name = m_name.group(1)
            # Fallback: prendre depuis le classement si disponible
            key = name.lower()
            if not guild_name and key in _players_by_name:
                guild_name = _players_by_name[key].get("guild_name", "")

            entry = {
                "name": name,
                "level": data.get("level", 0),
                "breedName": data.get("breedName", data.get("breed", "?")),
                "guild_name": guild_name,
                "detected_at": _rdt.fromtimestamp(mtime).strftime("%Y-%m-%d %H:%M:%S"),
                "first_seen": _rdt.fromtimestamp(ctime).strftime("%Y-%m-%d %H:%M:%S"),
            }

            # Joueur dans le classement? Ajouter poids si dispo
            key = name.lower()
            if key in _players_by_name:
                p = _players_by_name[key]
                entry["poids_offensif"] = round(p.get("poids_offensif", 0), 1)
                entry["poids_defensif"] = round(p.get("poids_defensif", 0), 1)
                entry["score_global"] = round(p.get("score_global", 0), 1)
                entry["rank"] = p.get("rank", 0)
            else:
                entry["poids_offensif"] = 0
                entry["poids_defensif"] = 0
                entry["score_global"] = 0
                entry["rank"] = 0

            # Nouveau = cree et modifie dans la meme seconde (tolerance 2s)
            is_new = abs(mtime - ctime) < 2.0
            if is_new:
                new_players.append(entry)
            else:
                updated_players.append(entry)

            if len(new_players) >= limit and len(updated_players) >= limit:
                break
        except Exception:
            continue

    return {
        "new_players": new_players[:limit],
        "updated_players": updated_players[:limit],
        "total_new": len(new_players),
        "total_updated": len(updated_players),
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
    """Sert les icones d'items et sorts depuis les fichiers PNG extraits."""
    if category not in ("items", "spells"):
        return JSONResponse({"error": "Categorie invalide"}, status_code=404)
    icon_path = ICONS_DIR / category / f"{icon_id}.png"
    if not icon_path.exists():
        return JSONResponse({"error": "Icone introuvable"}, status_code=404)
    return FileResponse(icon_path, media_type="image/png")

@app.get("/", response_class=HTMLResponse)
def ui():
    """Interface web intégrée."""
    return _load_html()  # Hot reload: relit public/weights.html a chaque requete


# ═══════════════════════════ HTML/JS/CSS ═════════════════════════════

# HTML servi depuis public/weights.html
_html_path = Path(__file__).resolve().parent.parent / "public" / "weights.html"
def _load_html():
    with open(_html_path, "r", encoding="utf-8") as f:
        return f.read()
# En dev: le HTML est relu a chaque requete (hot reload)
# En prod: mettre en cache avec HTML_PAGE = _load_html()


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



# ============================================================
# Routes Build Optimizer (donnees Sram)
# ---- INVENTORY ENDPOINT v2 ----
@app.get("/api/inventory")
async def api_inventory(breed: str = "", top: int = 0, min_level: int = 0, max_level: int = 999):
    """Meta items: croise equipements joueurs avec CDN et scores."""
    import re as _re
    
    cdn_path = os.path.join(os.path.dirname(__file__), "..", "rnd", "data", "cdn_items.json")
    cdn_map = {}
    try:
        with open(cdn_path, "r", encoding="utf-8") as f:
            cdn_raw = json.load(f)
        for entry in cdn_raw:
            defn = entry.get("definition", {})
            item_def = defn.get("item", {})
            iid = item_def.get("id")
            if not iid: continue
            bp = item_def.get("baseParameters", {})
            title = entry.get("title", {})
            cdn_map[iid] = {
                "id": iid,
                "name_fr": title.get("fr", title.get("en", "Item #" + str(iid))),
                "level": item_def.get("level", 0),
                "typeId": bp.get("itemTypeId", 0),
                "rarity": bp.get("rarity", 0),
                "setId": bp.get("itemSetId", 0),
            }
    except Exception as e:
        return {"error": "CDN: " + str(e)}

    RARITY_NAMES = {0:"Commun",1:"Inhabituel",2:"Rare",3:"Mythique",4:"Legendaire",5:"Relique",6:"Souvenir",7:"Epique"}
    SLOT_NAMES = {0:"Casque",3:"Epaulettes",4:"Amulette",5:"Plastron",7:"Anneau 1",8:"Anneau 2",10:"Bottes",12:"Ceinture",13:"Cape",15:"Arme principale",16:"Seconde main",17:"Accessoire",22:"Familier",24:"Embleme"}

    # Utiliser _players_by_name pour les scores
    players_data = []
    for name, pdata in _players_by_name.items():
        if not isinstance(pdata, dict): continue
        score = pdata.get("score_global", 0) or pdata.get("poids_offensif", 0)
        p_breed = pdata.get("breedName", "")
        p_level = pdata.get("level", 0)
        if breed and p_breed != breed: continue
        if p_level < min_level or p_level > max_level: continue
        players_data.append({"name": name, "breed": p_breed, "level": p_level, "score": score})
    
    # Trier par score et prendre le top si demande
    players_data.sort(key=lambda x: x["score"], reverse=True)
    if top > 0:
        players_data = players_data[:top]
    
    player_names = {p["name"] for p in players_data}
    player_scores = {p["name"]: p["score"] for p in players_data}
    player_breeds = {p["name"]: p["breed"] for p in players_data}

    # Scanner les fichiers pour les equipements
    item_data = {}  # item_id -> {carriers, total_score, breeds, slots}
    players_dir_str = str(PLAYERS_DIR)
    files = [f for f in os.listdir(players_dir_str) if f.endswith('.json') and '_t' not in f]
    scanned = 0
    # Index: nom avec underscores -> nom avec espaces
    name_lookup = {}
    for n in player_names:
        name_lookup[n] = n
        name_lookup[n.lower()] = n
        name_lookup[n.replace(' ', '_')] = n
        name_lookup[n.replace(' ', '_').lower()] = n

    for fname in files:
        pname = fname.replace('.json', '')
        matched_name = name_lookup.get(pname) or name_lookup.get(pname.lower())
        if not matched_name: continue
        fpath = os.path.join(players_dir_str, fname)
        try:
            with open(fpath, "r", encoding="utf-8") as f:
                p = json.load(f)
        except: continue
        eq = p.get("equipment", "")
        if not isinstance(eq, str) or "=" not in eq: continue
        scanned += 1
        score = player_scores.get(matched_name, 0)
        p_breed = player_breeds.get(matched_name, "")
        pairs = _re.findall(r"(\d+)=(\d+)", eq)
        for slot_str, item_str in pairs:
            item_id = int(item_str)
            slot = int(slot_str)
            if item_id not in item_data:
                item_data[item_id] = {"carriers": 0, "total_score": 0, "breeds": {}, "slot": slot, "carrier_names": []}
            d = item_data[item_id]
            d["carriers"] += 1
            d["total_score"] += score
            d["breeds"][p_breed] = d["breeds"].get(p_breed, 0) + 1
            if len(d["carrier_names"]) < 5:
                d["carrier_names"].append({"name": matched_name, "score": round(score, 1)})

    # Construire les resultats
    results = []
    for item_id, d in item_data.items():
        cdn = cdn_map.get(item_id, {})
        rarity = cdn.get("rarity", 0)
        avg_score = round(d["total_score"] / max(d["carriers"], 1), 1)
        top_breed = max(d["breeds"].items(), key=lambda x: x[1])[0] if d["breeds"] else ""
        results.append({
            "item_id": item_id,
            "name": cdn.get("name_fr", "Item #" + str(item_id)),
            "level": cdn.get("level", 0),
            "rarity": rarity,
            "rarity_name": RARITY_NAMES.get(rarity, "?"),
            "slot": SLOT_NAMES.get(d["slot"], "Slot " + str(d["slot"])),
            "slot_id": d["slot"],
            "carriers": d["carriers"],
            "avg_score": avg_score,
            "popularity_pct": round(d["carriers"] / max(scanned, 1) * 100, 1),
            "top_breed": top_breed,
            "carrier_names": sorted(d["carrier_names"], key=lambda x: x["score"], reverse=True),
        })

    # Best in slot (trie par avg_score des porteurs)
    bis = {}
    for r in results:
        s = r["slot"]
        if s not in bis:
            bis[s] = []
        bis[s].append(r)
    for s in bis:
        bis[s].sort(key=lambda x: x["avg_score"], reverse=True)
        bis[s] = bis[s][:10]

    # Stats par rarete
    rarity_stats = {}
    for r in results:
        rn = r["rarity_name"]
        rarity_stats[rn] = rarity_stats.get(rn, 0) + r["carriers"]

    # Breeds disponibles
    all_breeds = sorted(set(p["breed"] for p in players_data if p["breed"]))

    results.sort(key=lambda x: x["avg_score"], reverse=True)

    return {
        "total_items": len(results),
        "players_scanned": scanned,
        "players_pool": len(players_data),
        "items": results[:300],
        "best_in_slot": bis,
        "rarity_stats": rarity_stats,
        "breeds": all_breeds,
    }

if __name__ == "__main__":
    main()
