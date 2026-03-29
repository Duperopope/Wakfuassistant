# -*- coding: utf-8 -*-
"""
db.py - Couche d'acces SQLite pour Wakfu Assistant
====================================================
Toutes les requetes SQL sont centralisees ici.
Aucun autre module ne doit ecrire de SQL brut.

Usage:
    from db import WakfuDB
    db = WakfuDB("logs/wakfu.db")
    players = db.get_players(breed="Sram", min_level=200)
    db.upsert_player({...})
    db.close()
"""
import sqlite3
import time
import hashlib
import threading
import logging
import os

log = logging.getLogger("wakfu.db")


class WakfuDB:
    """Interface SQLite thread-safe pour Wakfu Assistant."""

    def __init__(self, db_path: str):
        self.db_path = db_path
        self._local = threading.local()
        # Verifier que la base existe
        if not os.path.exists(db_path):
            raise FileNotFoundError("Base introuvable: %s" % db_path)
        # Test de connexion
        conn = self._conn()
        conn.execute("SELECT 1")
        log.info("DB connectee: %s", db_path)

    def _conn(self) -> sqlite3.Connection:
        """Connexion par thread (SQLite n'est pas thread-safe)."""
        if not hasattr(self._local, "conn") or self._local.conn is None:
            self._local.conn = sqlite3.connect(self.db_path)
            self._local.conn.row_factory = sqlite3.Row
            self._local.conn.execute("PRAGMA journal_mode=WAL")
            self._local.conn.execute("PRAGMA synchronous=NORMAL")
            self._local.conn.execute("PRAGMA foreign_keys=ON")
        return self._local.conn

    def close(self):
        if hasattr(self._local, "conn") and self._local.conn:
            self._local.conn.close()
            self._local.conn = None

    # ==========================================================
    # JOUEURS
    # ==========================================================

    def get_players(self, breed: str = "", guild: str = "",
                    min_level: int = 0, max_level: int = 999,
                    search: str = "", sort: str = "score_global",
                    order: str = "DESC", limit: int = 500,
                    offset: int = 0) -> list[dict]:
        """Liste des joueurs avec filtres, tri et pagination."""
        where = ["1=1"]
        params = []

        if breed:
            where.append("breed_name = ?")
            params.append(breed)
        if guild:
            where.append("guild_name = ?")
            params.append(guild)
        if min_level > 0:
            where.append("level >= ?")
            params.append(min_level)
        if max_level < 999:
            where.append("level <= ?")
            params.append(max_level)
        if search:
            where.append("name LIKE ?")
            params.append("%%%s%%" % search)

        # Securiser le tri (eviter injection SQL)
        allowed_sorts = {
            "score_global", "level", "name", "breed_name",
            "poids_offensif", "poids_defensif", "poids_resistance",
            "pa", "pm", "last_seen"
        }
        if sort not in allowed_sorts:
            sort = "score_global"
        order = order.upper()
        if order not in ("ASC", "DESC"):
            order = "DESC"

        sql = """
            SELECT name, level, breed_id, breed_name, sex, guild_name,
                   equipment, score_global, poids_offensif, poids_defensif,
                   poids_resistance, poids_soin, pa, pm, last_seen
            FROM players
            WHERE %s
            ORDER BY %s %s
            LIMIT ? OFFSET ?
        """ % (" AND ".join(where), sort, order)
        params.extend([limit, offset])

        cur = self._conn().execute(sql, params)
        return [dict(row) for row in cur.fetchall()]

    def count_players(self, breed: str = "", guild: str = "",
                      min_level: int = 0, max_level: int = 999,
                      search: str = "") -> int:
        """Compte total pour pagination."""
        where = ["1=1"]
        params = []
        if breed:
            where.append("breed_name = ?")
            params.append(breed)
        if guild:
            where.append("guild_name = ?")
            params.append(guild)
        if min_level > 0:
            where.append("level >= ?")
            params.append(min_level)
        if max_level < 999:
            where.append("level <= ?")
            params.append(max_level)
        if search:
            where.append("name LIKE ?")
            params.append("%%%s%%" % search)

        sql = "SELECT COUNT(*) FROM players WHERE %s" % " AND ".join(where)
        return self._conn().execute(sql, params).fetchone()[0]

    def get_player(self, name: str) -> dict | None:
        """Fiche complete d'un joueur."""
        cur = self._conn().execute("SELECT * FROM players WHERE name = ?", (name,))
        row = cur.fetchone()
        if not row:
            return None
        player = dict(row)

        # Ajouter l'historique des snapshots
        cur2 = self._conn().execute("""
            SELECT level, equipment, equipment_level, breed_name, captured_at
            FROM equipment_snapshots
            WHERE player_name = ?
            ORDER BY level ASC
        """, (name,))
        player["snapshots"] = [dict(r) for r in cur2.fetchall()]
        return player

    def upsert_player(self, data: dict):
        """Inserer ou mettre a jour un joueur + creer snapshot si niveau change."""
        name = data.get("name")
        if not name:
            return

        now = time.strftime("%Y-%m-%dT%H:%M:%S")

        # Verifier si le joueur existe deja
        existing = self._conn().execute(
            "SELECT level FROM players WHERE name = ?", (name,)
        ).fetchone()

        self._conn().execute("""
            INSERT INTO players
            (name, level, breed_id, breed_name, sex, guild_name, guild_id,
             nation_id, equipment, equipment_level, spells, appearance,
             active_title, score_global, poids_offensif, poids_defensif,
             poids_resistance, poids_soin, pa, pm, first_seen, last_seen, updated_at)
            VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
            ON CONFLICT(name) DO UPDATE SET
                level = excluded.level,
                breed_id = excluded.breed_id,
                breed_name = excluded.breed_name,
                sex = excluded.sex,
                guild_name = excluded.guild_name,
                guild_id = excluded.guild_id,
                nation_id = excluded.nation_id,
                equipment = excluded.equipment,
                equipment_level = excluded.equipment_level,
                spells = excluded.spells,
                appearance = excluded.appearance,
                active_title = excluded.active_title,
                score_global = excluded.score_global,
                poids_offensif = excluded.poids_offensif,
                poids_defensif = excluded.poids_defensif,
                poids_resistance = excluded.poids_resistance,
                poids_soin = excluded.poids_soin,
                pa = excluded.pa,
                pm = excluded.pm,
                last_seen = excluded.last_seen,
                updated_at = excluded.updated_at
        """, (
            name,
            data.get("level", 0),
            data.get("breed_id", 0),
            data.get("breed_name", ""),
            data.get("sex", 0),
            data.get("guild_name"),
            data.get("guild_id"),
            data.get("nation_id", 0),
            data.get("equipment", ""),
            data.get("equipment_level", 0),
            data.get("spells", ""),
            data.get("appearance", ""),
            data.get("active_title", ""),
            data.get("score_global", 0),
            data.get("poids_offensif", 0),
            data.get("poids_defensif", 0),
            data.get("poids_resistance", 0),
            data.get("poids_soin", 0),
            data.get("pa", 0),
            data.get("pm", 0),
            now, now, now
        ))

        # Snapshot equipement si le joueur a de l'equipement
        eq = data.get("equipment", "")
        level = data.get("level", 0)
        if eq and "=" in str(eq):
            self._conn().execute("""
                INSERT OR REPLACE INTO equipment_snapshots
                (player_name, level, equipment, equipment_level, breed_name, captured_at)
                VALUES (?, ?, ?, ?, ?, ?)
            """, (
                name, level, eq,
                data.get("equipment_level", 0),
                data.get("breed_name", ""),
                now
            ))

        self._conn().commit()

    def search_players(self, query: str, limit: int = 20) -> list[dict]:
        """Recherche rapide par nom."""
        cur = self._conn().execute("""
            SELECT name, level, breed_name, guild_name, score_global
            FROM players WHERE name LIKE ? ORDER BY score_global DESC LIMIT ?
        """, ("%%%s%%" % query, limit))
        return [dict(r) for r in cur.fetchall()]

    # ==========================================================
    # GUILDES
    # ==========================================================

    def get_guilds(self) -> list[dict]:
        """Liste des guildes avec stats calculees depuis les joueurs."""
        cur = self._conn().execute("""
            SELECT guild_name,
                   COUNT(*) as member_count,
                   ROUND(AVG(score_global), 1) as avg_score,
                   ROUND(SUM(score_global), 1) as total_score,
                   MAX(score_global) as max_score,
                   ROUND(AVG(level), 1) as avg_level,
                   MIN(level) as min_level,
                   MAX(level) as max_level
            FROM players
            WHERE guild_name IS NOT NULL AND guild_name != ''
            GROUP BY guild_name
            ORDER BY avg_score DESC
        """)
        guilds = []
        for row in cur.fetchall():
            g = dict(row)
            # Trouver le top joueur
            top = self._conn().execute("""
                SELECT name FROM players
                WHERE guild_name = ? ORDER BY score_global DESC LIMIT 1
            """, (g["guild_name"],)).fetchone()
            g["top_player"] = top["name"] if top else ""
            guilds.append(g)
        return guilds

    # ==========================================================
    # CLASSES
    # ==========================================================

    def get_classes(self) -> list[dict]:
        """Stats par classe."""
        cur = self._conn().execute("""
            SELECT breed_name,
                   COUNT(*) as count,
                   ROUND(AVG(score_global), 1) as avg_score,
                   ROUND(AVG(level), 1) as avg_level,
                   MAX(score_global) as max_score
            FROM players
            WHERE breed_name != ''
            GROUP BY breed_name
            ORDER BY count DESC
        """)
        classes = []
        for row in cur.fetchall():
            c = dict(row)
            top = self._conn().execute("""
                SELECT name FROM players
                WHERE breed_name = ? ORDER BY score_global DESC LIMIT 1
            """, (c["breed_name"],)).fetchone()
            c["top_player"] = top["name"] if top else ""
            classes.append(c)
        return classes

    # ==========================================================
    # RECENTS
    # ==========================================================

    def get_recent(self, limit: int = 100) -> list[dict]:
        """Joueurs recemment detectes/mis a jour."""
        cur = self._conn().execute("""
            SELECT name, level, breed_name, guild_name, score_global,
                   poids_offensif, poids_defensif, poids_resistance,
                   pa, pm, last_seen
            FROM players
            ORDER BY last_seen DESC
            LIMIT ?
        """, (limit,))
        return [dict(r) for r in cur.fetchall()]

    # ==========================================================
    # STATS GLOBALES
    # ==========================================================

    def get_stats(self) -> dict:
        """Statistiques globales du serveur."""
        conn = self._conn()
        total = conn.execute("SELECT COUNT(*) FROM players").fetchone()[0]
        guilds = conn.execute(
            "SELECT COUNT(DISTINCT guild_name) FROM players WHERE guild_name IS NOT NULL AND guild_name != ''"
        ).fetchone()[0]
        top = conn.execute(
            "SELECT name, score_global FROM players ORDER BY score_global DESC LIMIT 1"
        ).fetchone()
        avg_off = conn.execute(
            "SELECT ROUND(AVG(poids_offensif), 1) FROM players"
        ).fetchone()[0]
        avg_level = conn.execute(
            "SELECT ROUND(AVG(level), 1) FROM players"
        ).fetchone()[0]
        latest = conn.execute(
            "SELECT last_seen FROM players ORDER BY last_seen DESC LIMIT 1"
        ).fetchone()
        breeds = conn.execute(
            "SELECT COUNT(DISTINCT breed_name) FROM players WHERE breed_name != ''"
        ).fetchone()[0]

        return {
            "total_players": total,
            "total_guilds": guilds,
            "total_breeds": breeds,
            "top_score": round(top["score_global"], 1) if top else 0,
            "top_player": top["name"] if top else "",
            "avg_offensif": avg_off or 0,
            "avg_level": avg_level or 0,
            "last_scan": latest["last_seen"] if latest else "",
        }

    # ==========================================================
    # ARMURERIE (ex-inventaire)
    # ==========================================================

    def get_armory(self, breed: str = "", min_level: int = 0,
                   max_level: int = 999, top: int = 0) -> dict:
        """Items les plus portes par slot, en utilisant les snapshots."""
        import re as _re
        conn = self._conn()

        # 1) Pool de joueurs (filtre breed sur la table players)
        where_p = ["1=1"]
        params_p = []
        if breed:
            where_p.append("p.breed_name = ?")
            params_p.append(breed)

        # 2) Snapshots dans la tranche de niveau
        where_s = []
        params_s = []
        if min_level > 0:
            where_s.append("es.level >= ?")
            params_s.append(min_level)
        if max_level < 999:
            where_s.append("es.level <= ?")
            params_s.append(max_level)

        # Requete: joindre players + snapshots
        sql = """
            SELECT p.name, p.breed_name, p.score_global, es.equipment, es.level as snap_level
            FROM players p
            JOIN equipment_snapshots es ON es.player_name = p.name
            WHERE %s %s
            ORDER BY p.score_global DESC
        """ % (
            " AND ".join(where_p),
            (" AND " + " AND ".join(where_s)) if where_s else ""
        )

        all_params = params_p + params_s
        rows = conn.execute(sql, all_params).fetchall()

        # Si top demande, ne garder que les N meilleurs joueurs uniques
        if top > 0:
            seen_names = set()
            filtered = []
            for r in rows:
                if r["name"] not in seen_names:
                    seen_names.add(r["name"])
                    if len(seen_names) > top:
                        break
                filtered.append(r)
            rows = filtered

        # Parser les equipements
        RARITY_NAMES = {0: "Commun", 1: "Inhabituel", 2: "Rare", 3: "Mythique",
                        4: "Legendaire", 5: "Relique", 6: "Souvenir", 7: "Epique"}
        SLOT_NAMES = {0: "Casque", 3: "Epaulettes", 4: "Amulette", 5: "Plastron",
                      7: "Anneau 1", 8: "Anneau 2", 10: "Bottes", 12: "Ceinture",
                      13: "Cape", 15: "Arme principale", 16: "Seconde main",
                      17: "Accessoire", 22: "Familier", 24: "Embleme"}

        item_data = {}
        scanned = 0
        player_names_seen = set()

        for r in rows:
            eq = r["equipment"]
            if not eq or "=" not in str(eq):
                continue
            scanned += 1
            player_names_seen.add(r["name"])
            score = r["score_global"] or 0
            p_breed = r["breed_name"] or ""

            pairs = _re.findall(r"(\d+)=(\d+)", eq)
            for slot_str, item_str in pairs:
                item_id = int(item_str)
                slot = int(slot_str)
                if item_id not in item_data:
                    item_data[item_id] = {
                        "carriers": 0, "total_score": 0,
                        "breeds": {}, "slot": slot, "carrier_names": []
                    }
                d = item_data[item_id]
                d["carriers"] += 1
                d["total_score"] += score
                d["breeds"][p_breed] = d["breeds"].get(p_breed, 0) + 1
                if len(d["carrier_names"]) < 5:
                    d["carrier_names"].append({"name": r["name"], "score": round(score, 1)})

        # Items a exclure de l armurerie (costumes, invisibles)
        # type_id 582 = familier, 611 = monture -> ne PAS exclure meme si niv 0
        PET_TYPES = {582, 611}
        def _is_excluded(name, level, rarity, type_id=0):
            name_lower = (name or "").lower()
            if "costume" in name_lower:
                return True
            if "invisible" in name_lower:
                return True
            if level == 0 and rarity == 0 and type_id not in PET_TYPES:
                return True
            return False

        # Enrichir avec le CDN
        results = []
        for item_id, d in item_data.items():
            cdn = conn.execute(
                "SELECT name_fr, level, rarity, gfx_id, type_id FROM cdn_items WHERE item_id = ?",
                (item_id,)
            ).fetchone()
            cdn = dict(cdn) if cdn else {}
            rarity = cdn.get("rarity", 0)
            avg_score = round(d["total_score"] / max(d["carriers"], 1), 1)
            top_breed = max(d["breeds"].items(), key=lambda x: x[1])[0] if d["breeds"] else ""

            item_name = cdn.get("name_fr", "Item #%d" % item_id)
            item_level = cdn.get("level", 0)
            item_type = cdn.get("type_id", 0)
            if _is_excluded(item_name, item_level, rarity, item_type):
                continue

            results.append({
                "item_id": item_id,
                "name": item_name,
                "level": item_level,
                "rarity": rarity,
                "rarity_name": RARITY_NAMES.get(rarity, "?"),
                "slot": ("Monture" if (cdn.get("type_id", 0) == 611 and d["slot"] == 24) else SLOT_NAMES.get(d["slot"], "Slot %d" % d["slot"])),
                "slot_id": d["slot"],
                "type_id": cdn.get("type_id", 0),
                "carriers": d["carriers"],
                "avg_score": avg_score,
                "popularity_pct": round(d["carriers"] / max(scanned, 1) * 100, 1),
                "top_breed": top_breed,
                "carrier_names": sorted(d["carrier_names"], key=lambda x: x["score"], reverse=True),
                "gfx_id": cdn.get("gfx_id", 0),
            })

        # Best in slot
        bis = {}
        for r in results:
            s = r["slot"]
            if s not in bis:
                bis[s] = []
            bis[s].append(r)
        for s in bis:
            bis[s].sort(key=lambda x: (x["carriers"], x["avg_score"]), reverse=True)
            bis[s] = bis[s][:10]

        # Breeds disponibles
        breeds_list = [r[0] for r in conn.execute(
            "SELECT DISTINCT breed_name FROM players WHERE breed_name != '' ORDER BY breed_name"
        ).fetchall()]

        return {
            "total_items": len(results),
            "players_scanned": scanned,
            "players_pool": len(player_names_seen),
            "best_in_slot": bis,
            "breeds": breeds_list,
        }

    # ==========================================================
    # CDN ITEMS
    # ==========================================================

    def get_cdn_item(self, item_id: int) -> dict | None:
        """Un item CDN par ID."""
        row = self._conn().execute(
            "SELECT * FROM cdn_items WHERE item_id = ?", (item_id,)
        ).fetchone()
        return dict(row) if row else None

    def search_cdn(self, query: str = "", type_id: int = 0,
                   rarity: int = -1, limit: int = 50,
                   offset: int = 0) -> list[dict]:
        """Recherche dans le CDN."""
        where = ["1=1"]
        params = []
        if query:
            where.append("name_fr LIKE ?")
            params.append("%%%s%%" % query)
        if type_id > 0:
            where.append("type_id = ?")
            params.append(type_id)
        if rarity >= 0:
            where.append("rarity = ?")
            params.append(rarity)

        sql = """
            SELECT item_id, name_fr, level, type_id, rarity, gfx_id
            FROM cdn_items WHERE %s
            ORDER BY level DESC LIMIT ? OFFSET ?
        """ % " AND ".join(where)
        params.extend([limit, offset])

        cur = self._conn().execute(sql, params)
        return [dict(r) for r in cur.fetchall()]

    # ==========================================================
    # AUTH / API KEYS
    # ==========================================================

    def validate_api_key(self, key: str) -> dict | None:
        """Verifie une cle API et met a jour last_used."""
        row = self._conn().execute(
            "SELECT * FROM api_keys WHERE key = ? AND active = 1", (key,)
        ).fetchone()
        if row:
            self._conn().execute(
                "UPDATE api_keys SET last_used = ? WHERE key = ?",
                (time.strftime("%Y-%m-%dT%H:%M:%S"), key)
            )
            self._conn().commit()
            return dict(row)
        return None

    def create_api_key(self, owner: str, permissions: str = "read",
                       rate_limit: int = 100) -> str:
        """Genere une nouvelle cle API."""
        key = "wka_" + hashlib.sha256(
            ("%s_%s" % (owner, time.time())).encode()
        ).hexdigest()[:32]
        self._conn().execute("""
            INSERT INTO api_keys (key, owner, permissions, rate_limit, created_at, active)
            VALUES (?, ?, ?, ?, ?, 1)
        """, (key, owner, permissions, rate_limit, time.strftime("%Y-%m-%dT%H:%M:%S")))
        self._conn().commit()
        return key

    # ==========================================================
    # SCAN LOGS
    # ==========================================================

    def log_scan(self, scan_type: str, players_found: int = 0,
                 duration_ms: int = 0, details: str = ""):
        """Enregistre un log de scan."""
        self._conn().execute("""
            INSERT INTO scan_logs (scan_type, players_found, duration_ms, details, created_at)
            VALUES (?, ?, ?, ?, ?)
        """, (scan_type, players_found, duration_ms, details,
              time.strftime("%Y-%m-%dT%H:%M:%S")))
        self._conn().commit()


# ==========================================================
# TEST RAPIDE
# ==========================================================
if __name__ == "__main__":
    import sys
    db_path = sys.argv[1] if len(sys.argv) > 1 else "H:/Code/Wakfuassistant/logs/wakfu.db"
    db = WakfuDB(db_path)

    print("=== TEST db.py ===")
    stats = db.get_stats()
    print("Stats: %s" % stats)

    print("\nTop 5 joueurs:")
    for p in db.get_players(limit=5):
        print("  %s (niv %d, %s) score=%.1f" % (p["name"], p["level"], p["breed_name"], p["score_global"]))

    print("\nRecherche 'Sram':")
    for p in db.get_players(breed="Sram", limit=3):
        print("  %s niv %d score=%.1f" % (p["name"], p["level"], p["score_global"]))

    print("\nGuildes (top 3):")
    for g in db.get_guilds()[:3]:
        print("  %s (%d membres, score moy %.1f)" % (g["guild_name"], g["member_count"], g["avg_score"]))

    print("\nClasses:")
    for c in db.get_classes()[:5]:
        print("  %s: %d joueurs, score moy %.1f" % (c["breed_name"], c["count"], c["avg_score"]))

    print("\nArmurerie Sram niv 1-21:")
    arm = db.get_armory(breed="Sram", min_level=1, max_level=21)
    print("  %d items, %d joueurs scannes" % (arm["total_items"], arm["players_scanned"]))
    for slot, items in sorted(arm["best_in_slot"].items()):
        top = items[0]["name"] if items else "vide"
        print("  %s: %s" % (slot, top))

    print("\nRecents (5 derniers):")
    for p in db.get_recent(limit=5):
        print("  %s (%s) vu %s" % (p["name"], p["breed_name"], p["last_seen"]))

    db.close()
    print("\nTous les tests OK!")
