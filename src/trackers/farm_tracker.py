# H:\Code\Wakfuassistant\src\trackers\farm_tracker.py
# Wakfu Farm Tracker - Parse wakfu.log en temps réel
# Version : 1.0.0 | Date : 2026-03-15
# Auteur : Sam & Claude pour Autocode Orchestra

import re
import time
import json
import os
import sqlite3
from datetime import datetime, timedelta
from collections import defaultdict
from pathlib import Path

# --- CONFIGURATION ---
WAKFU_LOG_PATH = r"C:\Users\Smedj\AppData\Roaming\zaap\gamesLogs\wakfu\logs\wakfu.log"
PROJECT_PATH = r"H:\Code\Wakfuassistant"
DB_PATH = os.path.join(PROJECT_PATH, "data", "wakfu_tracker.db")
TRACKER_LOG_PATH = os.path.join(PROJECT_PATH, "logs", "farm_tracker.log")

# --- LOGGING INTERNE ---
def log(message, level="INFO"):
    timestamp = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    line = f"[{timestamp}] [{level}] {message}"
    print(line)
    os.makedirs(os.path.dirname(TRACKER_LOG_PATH), exist_ok=True)
    with open(TRACKER_LOG_PATH, "a", encoding="utf-8") as f:
        f.write(line + "\n")


# --- PATTERNS REGEX ---
# Format de ligne : " INFO 23:17:44,684 [AWT-EventQueue-0] (aPh:174) - [Information (jeu)] ..."
PATTERNS = {
    "xp_metier": re.compile(
        r"(\d{2}:\d{2}:\d{2}),\d+ .+ \[Information \(jeu\)\] (.+?) : \+(\d[\d\s]*\d*) points d'XP\.\s*(.*)"
    ),
    "xp_level_up": re.compile(
        r"(\d{2}:\d{2}:\d{2}),\d+ .+ \[Information \(jeu\)\] (.+?) : \+(\d[\d\s]*\d*) points d'XP\.\s+\+(\d+) niveau"
    ),
    "xp_next_level": re.compile(
        r"Prochain niveau dans : ([\d\s]+)"
    ),
    "kamas_gain": re.compile(
        r"(\d{2}:\d{2}:\d{2}),\d+ .+ \[Information \(jeu\)\] Vous avez gagné (\d[\d\s]*\d*) kamas"
    ),
    "item_drop": re.compile(
        r"(\d{2}:\d{2}:\d{2}),\d+ .+ \[Information \(jeu\)\] Vous avez ramassé (\d+)x (.+?) \."
    ),
    "craft_success": re.compile(
        r"(\d{2}:\d{2}:\d{2}),\d+ .+ \[Information \(jeu\)\] Vous avez réussi votre recette de (.+?)\."
    ),
    "fight_start": re.compile(
        r"(\d{2}:\d{2}:\d{2}),\d+ .+ \[FIGHT\] (?:Start|Begin|start)"
    ),
    "fight_end": re.compile(
        r"(\d{2}:\d{2}:\d{2}),\d+ .+ \[FIGHT\] End fight with id (\d+)"
    ),
    "fight_end_info": re.compile(
        r"(\d{2}:\d{2}:\d{2}),\d+ .+ \[Information \(combat\)\] Combat terminé"
    ),
    "market_start": re.compile(
        r"(\d{2}:\d{2}:\d{2}),\d+ .+ occupation MARKET"
    ),
}


# --- BASE DE DONNEES ---
def init_database():
    os.makedirs(os.path.dirname(DB_PATH), exist_ok=True)
    conn = sqlite3.connect(DB_PATH)
    cursor = conn.cursor()

    cursor.execute("""
        CREATE TABLE IF NOT EXISTS xp_gains (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            timestamp TEXT NOT NULL,
            session_date TEXT NOT NULL,
            metier TEXT NOT NULL,
            xp_gained INTEGER NOT NULL,
            level_up INTEGER DEFAULT 0,
            xp_to_next_level INTEGER DEFAULT 0
        )
    """)

    cursor.execute("""
        CREATE TABLE IF NOT EXISTS kamas_gains (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            timestamp TEXT NOT NULL,
            session_date TEXT NOT NULL,
            amount INTEGER NOT NULL,
            source TEXT DEFAULT 'combat'
        )
    """)

    cursor.execute("""
        CREATE TABLE IF NOT EXISTS item_drops (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            timestamp TEXT NOT NULL,
            session_date TEXT NOT NULL,
            item_name TEXT NOT NULL,
            quantity INTEGER NOT NULL
        )
    """)

    cursor.execute("""
        CREATE TABLE IF NOT EXISTS craft_results (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            timestamp TEXT NOT NULL,
            session_date TEXT NOT NULL,
            recipe_name TEXT NOT NULL
        )
    """)

    cursor.execute("""
        CREATE TABLE IF NOT EXISTS sessions (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            start_time TEXT NOT NULL,
            end_time TEXT,
            total_xp INTEGER DEFAULT 0,
            total_kamas INTEGER DEFAULT 0,
            total_drops INTEGER DEFAULT 0,
            total_crafts INTEGER DEFAULT 0,
            fights_count INTEGER DEFAULT 0
        )
    """)

    cursor.execute("""
        CREATE TABLE IF NOT EXISTS market_prices (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            timestamp TEXT NOT NULL,
            item_name TEXT NOT NULL,
            price INTEGER NOT NULL,
            quantity INTEGER DEFAULT 1,
            price_per_unit INTEGER NOT NULL,
            source TEXT DEFAULT 'manual'
        )
    """)

    conn.commit()
    log(f"Base de données initialisée : {DB_PATH}")
    return conn


# --- PARSEUR TEMPS REEL ---
class WakfuFarmTracker:
    def __init__(self):
        self.conn = init_database()
        self.session_date = datetime.now().strftime("%Y-%m-%d")
        self.session_start = datetime.now()
        self.stats = {
            "xp_total": defaultdict(int),
            "kamas_total": 0,
            "drops": defaultdict(int),
            "crafts": 0,
            "fights": 0,
            "level_ups": [],
        }
        self.last_position = 0
        log("WakfuFarmTracker initialisé")
        log(f"Surveillance de : {WAKFU_LOG_PATH}")

    def parse_number(self, text):
        """Convertit '14 454' ou '261' en entier."""
        return int(text.replace(" ", "").replace("\u202f", "").strip())

    def process_line(self, line):
        """Parse une ligne du log et enregistre les données."""

        # XP Métier (avec détection level up)
        match_lvl = PATTERNS["xp_level_up"].search(line)
        if match_lvl:
            timestamp, metier, xp_raw, levels = match_lvl.groups()
            xp = self.parse_number(xp_raw)
            self.stats["xp_total"][metier] += xp
            self.stats["level_ups"].append(f"{metier} +{levels} niveau(x)")

            xp_to_next = 0
            match_next = PATTERNS["xp_next_level"].search(line)
            if match_next:
                xp_to_next = self.parse_number(match_next.group(1))

            self.conn.execute(
                "INSERT INTO xp_gains (timestamp, session_date, metier, xp_gained, level_up, xp_to_next_level) VALUES (?, ?, ?, ?, ?, ?)",
                (timestamp, self.session_date, metier, xp, int(levels), xp_to_next)
            )
            self.conn.commit()
            log(f"LEVEL UP! {metier} +{xp} XP (+{levels} niveau) | Prochain dans : {xp_to_next:,}")
            return

        match_xp = PATTERNS["xp_metier"].search(line)
        if match_xp:
            timestamp, metier, xp_raw, extra = match_xp.groups()
            xp = self.parse_number(xp_raw)
            self.stats["xp_total"][metier] += xp

            xp_to_next = 0
            match_next = PATTERNS["xp_next_level"].search(extra)
            if match_next:
                xp_to_next = self.parse_number(match_next.group(1))

            self.conn.execute(
                "INSERT INTO xp_gains (timestamp, session_date, metier, xp_gained, level_up, xp_to_next_level) VALUES (?, ?, ?, ?, ?, ?)",
                (timestamp, self.session_date, metier, xp, 0, xp_to_next)
            )
            self.conn.commit()
            return

        # Kamas
        match_kamas = PATTERNS["kamas_gain"].search(line)
        if match_kamas:
            timestamp, amount_raw = match_kamas.groups()
            amount = self.parse_number(amount_raw)
            self.stats["kamas_total"] += amount
            self.conn.execute(
                "INSERT INTO kamas_gains (timestamp, session_date, amount) VALUES (?, ?, ?)",
                (timestamp, self.session_date, amount)
            )
            self.conn.commit()
            log(f"KAMAS +{amount:,} | Total session : {self.stats['kamas_total']:,}")
            return

        # Drops
        match_drop = PATTERNS["item_drop"].search(line)
        if match_drop:
            timestamp, qty_str, item_name = match_drop.groups()
            qty = int(qty_str)
            self.stats["drops"][item_name] += qty
            self.conn.execute(
                "INSERT INTO item_drops (timestamp, session_date, item_name, quantity) VALUES (?, ?, ?, ?)",
                (timestamp, self.session_date, item_name, qty)
            )
            self.conn.commit()
            return

        # Crafts
        match_craft = PATTERNS["craft_success"].search(line)
        if match_craft:
            timestamp, recipe_name = match_craft.groups()
            self.stats["crafts"] += 1
            self.conn.execute(
                "INSERT INTO craft_results (timestamp, session_date, recipe_name) VALUES (?, ?, ?)",
                (timestamp, self.session_date, recipe_name)
            )
            self.conn.commit()
            log(f"CRAFT : {recipe_name} | Total crafts : {self.stats['crafts']}")
            return

        # Fin de combat
        match_fight = PATTERNS["fight_end"].search(line)
        if not match_fight:
            match_fight = PATTERNS["fight_end_info"].search(line)
        if match_fight:
            self.stats["fights"] += 1
            return

    def print_dashboard(self):
        """Affiche le résumé en temps réel."""
        elapsed = datetime.now() - self.session_start
        hours = elapsed.total_seconds() / 3600

        print("\n" + "=" * 60)
        print(f"  WAKFU FARM TRACKER - L'Immortel")
        print(f"  Session du {self.session_date} | Durée : {str(elapsed).split('.')[0]}")
        print("=" * 60)

        # XP par métier
        print("\n  --- XP METIERS ---")
        for metier, total_xp in sorted(self.stats["xp_total"].items(), key=lambda x: x[1], reverse=True):
            xp_per_hour = int(total_xp / hours) if hours > 0 else 0
            print(f"  {metier:20s} : {total_xp:>10,} XP  ({xp_per_hour:>10,} XP/h)")

        total_xp_all = sum(self.stats["xp_total"].values())
        total_xp_h = int(total_xp_all / hours) if hours > 0 else 0
        print(f"  {'TOTAL':20s} : {total_xp_all:>10,} XP  ({total_xp_h:>10,} XP/h)")

        # Level ups
        if self.stats["level_ups"]:
            print(f"\n  LEVEL UPS : {', '.join(self.stats['level_ups'])}")

        # Kamas
        kamas_h = int(self.stats["kamas_total"] / hours) if hours > 0 else 0
        print(f"\n  --- KAMAS ---")
        print(f"  Total : {self.stats['kamas_total']:>10,} kamas  ({kamas_h:>10,} kamas/h)")

        # Drops
        print(f"\n  --- DROPS ({sum(self.stats['drops'].values())} items) ---")
        for item, qty in sorted(self.stats["drops"].items(), key=lambda x: x[1], reverse=True)[:15]:
            print(f"  {item:30s} : x{qty}")

        # Combats & Crafts
        print(f"\n  Combats : {self.stats['fights']}  |  Crafts : {self.stats['crafts']}")
        print("=" * 60)

    def run(self):
        """Boucle principale : surveille le log en temps réel."""
        log("Démarrage du tracker en temps réel...")

        if not os.path.exists(WAKFU_LOG_PATH):
            log(f"ERREUR : Fichier log introuvable : {WAKFU_LOG_PATH}", "ERROR")
            return

        # Se positionner à la fin du fichier pour ne tracker que le nouveau contenu
        with open(WAKFU_LOG_PATH, "r", encoding="utf-8", errors="replace") as f:
            f.seek(0, 2)
            self.last_position = f.tell()
            log(f"Position initiale : {self.last_position} bytes (on ignore l'historique)")

        last_dashboard = time.time()
        dashboard_interval = 30  # Afficher le dashboard toutes les 30 secondes

        try:
            while True:
                with open(WAKFU_LOG_PATH, "r", encoding="utf-8", errors="replace") as f:
                    f.seek(self.last_position)
                    new_lines = f.readlines()
                    self.last_position = f.tell()

                for line in new_lines:
                    self.process_line(line.strip())

                # Afficher le dashboard périodiquement
                if time.time() - last_dashboard > dashboard_interval and sum(self.stats["xp_total"].values()) > 0:
                    self.print_dashboard()
                    last_dashboard = time.time()

                time.sleep(1)

        except KeyboardInterrupt:
            log("Arrêt du tracker (Ctrl+C)")
            self.print_dashboard()
            self.conn.close()
            log("Base de données fermée. Session terminée.")


# --- POINT D'ENTREE ---
if __name__ == "__main__":
    print(r"""
    ╔══════════════════════════════════════════╗
    ║   WAKFU FARM TRACKER v1.0               ║
    ║   Autocode Orchestra x L'Immortel       ║
    ║   Ctrl+C pour arrêter et voir le bilan  ║
    ╚══════════════════════════════════════════╝
    """)
    tracker = WakfuFarmTracker()
    tracker.run()
