# H:\Code\Wakfuassistant\src\main.py
# ============================================================================
# WAKFU COMPANION v1.0.0 - L'Immortel Edition
# Compagnon intelligent temps réel pour Wakfu
# Parse wakfu.log, track XP/kamas/drops/pertes/ventes/crafts
# Auto-refresh, zero dépendance externe, SQLite persistant
# ============================================================================
# Date    : 2026-03-15
# Auteur  : Sam (PO) & Claude (Dev) - Autocode Orchestra
# Licence : Usage personnel
# ============================================================================

import re
import os
import sys
import time
import json
import sqlite3
import threading
import msvcrt
from datetime import datetime, timedelta
from collections import defaultdict, OrderedDict
from pathlib import Path

# ============================================================================
# CONFIGURATION GLOBALE
# ============================================================================
PROJECT_PATH = Path(r"H:\Code\Wakfuassistant")
WAKFU_LOG_PATH = Path(r"C:\Users\Smedj\AppData\Roaming\zaap\gamesLogs\wakfu\logs\wakfu.log")
DB_PATH = PROJECT_PATH / "data" / "wakfu_tracker.db"
ANKAMA_CDN_PATH = PROJECT_PATH / "data" / "ankama_cdn"
APP_LOG_PATH = PROJECT_PATH / "logs" / "companion.log"
CONFIG_PATH = PROJECT_PATH / "data" / "config.json"
REFRESH_INTERVAL = 3


# ============================================================================
# COULEURS TERMINAL (ANSI)
# ============================================================================
class C:
    RESET   = "\033[0m"
    BOLD    = "\033[1m"
    DIM     = "\033[90m"
    RED     = "\033[91m"
    GREEN   = "\033[92m"
    YELLOW  = "\033[93m"
    BLUE    = "\033[94m"
    MAGENTA = "\033[95m"
    CYAN    = "\033[96m"
    WHITE   = "\033[97m"
    BG_RED  = "\033[41m"
    BG_GREEN = "\033[42m"


# ============================================================================
# LOGGING INTERNE
# ============================================================================
def app_log(message, level="INFO"):
    ts = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    line = f"[{ts}] [{level}] {message}"
    APP_LOG_PATH.parent.mkdir(parents=True, exist_ok=True)
    try:
        with open(APP_LOG_PATH, "a", encoding="utf-8") as f:
            f.write(line + "\n")
    except Exception:
        pass


# ============================================================================
# BASE DE DONNÉES
# ============================================================================
class Database:
    def __init__(self):
        DB_PATH.parent.mkdir(parents=True, exist_ok=True)
        self.conn = sqlite3.connect(str(DB_PATH), check_same_thread=False)
        self.conn.row_factory = sqlite3.Row
        self.conn.execute("PRAGMA journal_mode=WAL")
        self.lock = threading.Lock()
        self._init_tables()
        app_log(f"Database ouverte : {DB_PATH}")

    def _init_tables(self):
        with self.lock:
            c = self.conn.cursor()
            c.execute("""CREATE TABLE IF NOT EXISTS xp_events (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                timestamp TEXT NOT NULL,
                session_date TEXT NOT NULL,
                metier TEXT NOT NULL,
                xp_gained INTEGER NOT NULL,
                level_up INTEGER DEFAULT 0,
                xp_remaining INTEGER DEFAULT 0
            )""")
            c.execute("""CREATE TABLE IF NOT EXISTS kamas_events (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                timestamp TEXT NOT NULL,
                session_date TEXT NOT NULL,
                amount INTEGER NOT NULL,
                source TEXT DEFAULT 'combat'
            )""")
            c.execute("""CREATE TABLE IF NOT EXISTS drop_events (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                timestamp TEXT NOT NULL,
                session_date TEXT NOT NULL,
                item_name TEXT NOT NULL,
                quantity INTEGER NOT NULL
            )""")
            c.execute("""CREATE TABLE IF NOT EXISTS loss_events (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                timestamp TEXT NOT NULL,
                session_date TEXT NOT NULL,
                item_name TEXT NOT NULL,
                quantity INTEGER NOT NULL,
                reason TEXT DEFAULT 'unknown'
            )""")
            c.execute("""CREATE TABLE IF NOT EXISTS use_events (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                timestamp TEXT NOT NULL,
                session_date TEXT NOT NULL,
                item_name TEXT NOT NULL
            )""")
            c.execute("""CREATE TABLE IF NOT EXISTS sale_events (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                timestamp TEXT NOT NULL,
                session_date TEXT NOT NULL,
                item_name TEXT NOT NULL,
                quantity INTEGER NOT NULL,
                total_price INTEGER NOT NULL,
                price_per_unit INTEGER NOT NULL
            )""")
            c.execute("""CREATE TABLE IF NOT EXISTS craft_events (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                timestamp TEXT NOT NULL,
                session_date TEXT NOT NULL,
                recipe_name TEXT NOT NULL
            )""")
            c.execute("""CREATE TABLE IF NOT EXISTS fight_events (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                timestamp TEXT NOT NULL,
                session_date TEXT NOT NULL,
                fight_id TEXT DEFAULT ''
            )""")
            c.execute("""CREATE TABLE IF NOT EXISTS inventory (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                item_name TEXT NOT NULL,
                quantity INTEGER DEFAULT 0,
                location TEXT DEFAULT 'inventaire',
                last_updated TEXT NOT NULL,
                UNIQUE(item_name, location)
            )""")
            c.execute("""CREATE TABLE IF NOT EXISTS market_prices (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                timestamp TEXT NOT NULL,
                item_name TEXT NOT NULL,
                price_per_unit INTEGER NOT NULL,
                quantity_listed INTEGER DEFAULT 1,
                source TEXT DEFAULT 'manual'
            )""")
            c.execute("""CREATE TABLE IF NOT EXISTS item_movements (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                timestamp TEXT NOT NULL,
                item_name TEXT NOT NULL,
                quantity INTEGER NOT NULL,
                from_location TEXT NOT NULL,
                to_location TEXT NOT NULL,
                kamas_involved INTEGER DEFAULT 0
            )""")
            self.conn.commit()

    def execute(self, query, params=()):
        with self.lock:
            cursor = self.conn.execute(query, params)
            self.conn.commit()
            return cursor

    def fetchone(self, query, params=()):
        with self.lock:
            return self.conn.execute(query, params).fetchone()

    def fetchall(self, query, params=()):
        with self.lock:
            return self.conn.execute(query, params).fetchall()

    def close(self):
        self.conn.close()


# ============================================================================
# CONFIG UTILISATEUR
# ============================================================================
class Config:
    def __init__(self):
        self.data = {
            "character": "L'Immortel",
            "server": "Ogrest",
            "account": "Kairozadyk",
            "kamas_base": 0,
            "version": "1.0.0",
        }
        self._load()

    def _load(self):
        if CONFIG_PATH.exists():
            try:
                with open(CONFIG_PATH, "r", encoding="utf-8") as f:
                    saved = json.load(f)
                self.data.update(saved)
            except Exception:
                pass

    def save(self):
        CONFIG_PATH.parent.mkdir(parents=True, exist_ok=True)
        with open(CONFIG_PATH, "w", encoding="utf-8") as f:
            json.dump(self.data, f, indent=2, ensure_ascii=False)

    def get(self, key, default=None):
        return self.data.get(key, default)

    def set(self, key, value):
        self.data[key] = value
        self.save()


# ============================================================================
# BASE D'ITEMS ANKAMA (CDN)
# ============================================================================
class ItemDatabase:
    def __init__(self):
        self.by_id = {}
        self.by_name = {}
        self.count = 0
        self._load()

    def _load(self):
        path = ANKAMA_CDN_PATH / "items.json"
        if not path.exists():
            app_log("items.json introuvable", "WARN")
            return
        try:
            with open(path, "r", encoding="utf-8") as f:
                raw = json.load(f)
            for item in raw:
                defn = item.get("definition", {}).get("item", {})
                item_id = defn.get("id")
                title_fr = item.get("title", {}).get("fr", "")
                if item_id and title_fr:
                    entry = {
                        "id": item_id,
                        "name": title_fr,
                        "level": defn.get("level", 0),
                        "icon": f"https://vertylo.github.io/wakassets/items/{item_id}.png",
                    }
                    self.by_id[item_id] = entry
                    self.by_name[title_fr.lower()] = entry
            self.count = len(self.by_id)
            app_log(f"ItemDatabase : {self.count} items chargés")
        except Exception as e:
            app_log(f"Erreur chargement items.json : {e}", "ERROR")

    def search(self, query):
        q = query.lower().strip()
        if q in self.by_name:
            return [self.by_name[q]]
        results = []
        for name, entry in self.by_name.items():
            if q in name:
                results.append(entry)
            if len(results) >= 15:
                break
        return results

    def get_by_name(self, name):
        return self.by_name.get(name.lower().strip())


# ============================================================================
# PATTERNS REGEX DU LOG WAKFU
# ============================================================================
# Tous les patterns sont basés sur l'analyse du vrai wakfu.log de L'Immortel
# Format général : " INFO HH:MM:SS,ms [thread] (class:line) - [canal] message"

RE_XP = re.compile(
    r"(\d{2}:\d{2}:\d{2}),\d+\s+\[.+?\]\s+\(.+?\)\s+-\s+\[Information \(jeu\)\]\s+"
    r"(.+?)\s*:\s+\+(\d[\d\s]*)\s+points d'XP\.\s+(.*)"
)
RE_LEVEL_UP = re.compile(r"\+(\d+)\s+niveau")
RE_XP_REMAINING = re.compile(r"Prochain niveau dans\s*:\s*([\d\s]+)")

RE_KAMAS = re.compile(
    r"(\d{2}:\d{2}:\d{2}),\d+.+\[Information \(jeu\)\]\s+Vous avez gagn\S+ (\d[\d\s]*)\s+kamas"
)

RE_DROP = re.compile(
    r"(\d{2}:\d{2}:\d{2}),\d+.+\[Information \(jeu\)\]\s+Vous avez ramass\S+ (\d+)x\s+(.+?)\s+\."
)

RE_LOSS = re.compile(
    r"(\d{2}:\d{2}:\d{2}),\d+.+\[Information \(jeu\)\]\s+Vous avez perdu (\d+)x\s+(.+?)\s+\."
)

RE_USE = re.compile(
    r"(\d{2}:\d{2}:\d{2}),\d+.+\[Information \(jeu\)\]\s+Vous venez d'utiliser\s*:\s*(.+)"
)

RE_SALE = re.compile(
    r"(\d{2}:\d{2}:\d{2}),\d+.+\[Information \(jeu\)\]\s+Vous venez de vendre (\d+)x\s+(.+?)\s{1,3}pour un prix total de\s+([\d\s]+)\u00a7"
)

RE_CRAFT = re.compile(
    r"(\d{2}:\d{2}:\d{2}),\d+.+\[Information \(jeu\)\]\s+Vous avez r\S+ussi votre recette de\s+(.+?)\."
)

RE_FIGHT_END = re.compile(
    r"(\d{2}:\d{2}:\d{2}),\d+.+\[FIGHT\]\s+End fight with id\s+(\d+)"
)

RE_FIGHT_END_INFO = re.compile(
    r"(\d{2}:\d{2}:\d{2}),\d+.+\[Information \(combat\)\]\s+Combat termin"
)

RE_PLANT_FAIL = re.compile(
    r"(\d{2}:\d{2}:\d{2}),\d+.+Le plant n'a pas pris"
)


def parse_number(text):
    """Convertit '14 454' ou '261' en int."""
    return int(text.replace(" ", "").replace("\u202f", "").strip())


# ============================================================================
# SESSION TRACKER
# ============================================================================
class Session:
    """Agrège tous les événements de la session en cours, thread-safe."""

    def __init__(self, db):
        self.db = db
        self.lock = threading.Lock()
        self.start_time = datetime.now()
        self.today = datetime.now().strftime("%Y-%m-%d")

        # Compteurs live
        self.xp = defaultdict(int)
        self.xp_remaining = {}
        self.kamas = 0
        self.drops = defaultdict(int)
        self.losses = defaultdict(int)
        self.uses = defaultdict(int)
        self.sales = []
        self.sales_kamas = 0
        self.crafts = []
        self.fights = 0
        self.level_ups = []
        self.plant_fails = 0

        # Fil d'activité (max 20 events)
        self.feed = []

    def _feed(self, icon, text):
        ts = datetime.now().strftime("%H:%M:%S")
        self.feed.append((ts, icon, text))
        if len(self.feed) > 20:
            self.feed.pop(0)

    # --- Event handlers ---

    def on_xp(self, timestamp, metier, xp, level_up, xp_remaining):
        with self.lock:
            self.xp[metier] += xp
            self.xp_remaining[metier] = xp_remaining
            if level_up > 0:
                self.level_ups.append(metier)
                self._feed("UP", f"{metier} LEVEL UP! (+{level_up})")
            self.db.execute(
                "INSERT INTO xp_events (timestamp,session_date,metier,xp_gained,level_up,xp_remaining) VALUES (?,?,?,?,?,?)",
                (timestamp, self.today, metier, xp, level_up, xp_remaining)
            )

    def on_kamas(self, timestamp, amount):
        with self.lock:
            self.kamas += amount
            self._feed("$", f"+{amount:,} kamas")
            self.db.execute(
                "INSERT INTO kamas_events (timestamp,session_date,amount) VALUES (?,?,?)",
                (timestamp, self.today, amount)
            )

    def on_drop(self, timestamp, item, qty):
        with self.lock:
            self.drops[item] += qty
            self._feed("+", f"{qty}x {item}")
            self.db.execute(
                "INSERT INTO drop_events (timestamp,session_date,item_name,quantity) VALUES (?,?,?,?)",
                (timestamp, self.today, item, qty)
            )

    def on_loss(self, timestamp, item, qty, reason="perdu"):
        with self.lock:
            self.losses[item] += qty
            self._feed("X", f"-{qty}x {item} ({reason})")
            self.db.execute(
                "INSERT INTO loss_events (timestamp,session_date,item_name,quantity,reason) VALUES (?,?,?,?,?)",
                (timestamp, self.today, item, qty, reason)
            )

    def on_use(self, timestamp, item):
        with self.lock:
            self.uses[item] += 1
            self._feed("~", f"Utilisé : {item}")
            self.db.execute(
                "INSERT INTO use_events (timestamp,session_date,item_name) VALUES (?,?,?)",
                (timestamp, self.today, item)
            )

    def on_sale(self, timestamp, item, qty, total_price):
        with self.lock:
            ppu = total_price // max(qty, 1)
            self.sales.append({"item": item, "qty": qty, "total": total_price, "ppu": ppu})
            self.sales_kamas += total_price
            self._feed("$$", f"VENDU {qty}x {item} = {total_price:,} kamas ({ppu:,}/u)")
            self.db.execute(
                "INSERT INTO sale_events (timestamp,session_date,item_name,quantity,total_price,price_per_unit) VALUES (?,?,?,?,?,?)",
                (timestamp, self.today, item, qty, total_price, ppu)
            )
            # Auto-enregistrer comme prix de référence
            self.db.execute(
                "INSERT INTO market_prices (timestamp,item_name,price_per_unit,quantity_listed,source) VALUES (?,?,?,?,?)",
                (timestamp, item, ppu, qty, "auto_sale")
            )

    def on_craft(self, timestamp, recipe):
        with self.lock:
            self.crafts.append(recipe)
            self._feed("*", f"Craft : {recipe}")
            self.db.execute(
                "INSERT INTO craft_events (timestamp,session_date,recipe_name) VALUES (?,?,?)",
                (timestamp, self.today, recipe)
            )

    def on_fight_end(self, timestamp, fight_id=""):
        with self.lock:
            self.fights += 1
            self._feed("!", f"Combat #{self.fights} terminé")
            self.db.execute(
                "INSERT INTO fight_events (timestamp,session_date,fight_id) VALUES (?,?,?)",
                (timestamp, self.today, fight_id)
            )

    def on_plant_fail(self, timestamp):
        with self.lock:
            self.plant_fails += 1

    # --- Snapshot pour le renderer ---

    def snapshot(self):
        with self.lock:
            elapsed_sec = (datetime.now() - self.start_time).total_seconds()
            hours = max(elapsed_sec / 3600, 0.0001)
            elapsed_str = str(timedelta(seconds=int(elapsed_sec)))

            total_xp = sum(self.xp.values())
            total_drops = sum(self.drops.values())
            total_losses = sum(self.losses.values())

            # Net items = drops - losses
            net_items = defaultdict(int)
            for item, qty in self.drops.items():
                net_items[item] += qty
            for item, qty in self.losses.items():
                net_items[item] -= qty

            return {
                "elapsed": elapsed_str,
                "elapsed_sec": elapsed_sec,
                "hours": hours,
                "xp": dict(self.xp),
                "xp_total": total_xp,
                "xp_per_hour": int(total_xp / hours),
                "xp_remaining": dict(self.xp_remaining),
                "kamas": self.kamas,
                "kamas_per_hour": int(self.kamas / hours),
                "drops": dict(self.drops),
                "drops_total": total_drops,
                "losses": dict(self.losses),
                "losses_total": total_losses,
                "net_items": dict(net_items),
                "uses": dict(self.uses),
                "sales": list(self.sales),
                "sales_kamas": self.sales_kamas,
                "sales_per_hour": int(self.sales_kamas / hours),
                "crafts": list(self.crafts),
                "fights": self.fights,
                "level_ups": list(self.level_ups),
                "plant_fails": self.plant_fails,
                "feed": list(self.feed),
            }


# ============================================================================
# LOG WATCHER (thread background)
# ============================================================================
class LogWatcher:
    """Surveille wakfu.log et dispatch les events à la Session."""

    def __init__(self, session):
        self.session = session
        self.running = False
        self.position = 0
        self.lines_parsed = 0
        self.events_found = 0

    def start(self):
        self.running = True
        if WAKFU_LOG_PATH.exists():
            self.position = WAKFU_LOG_PATH.stat().st_size
            app_log(f"LogWatcher start, skip {self.position} bytes existants")
        self.thread = threading.Thread(target=self._loop, daemon=True)
        self.thread.start()

    def stop(self):
        self.running = False

    def _loop(self):
        while self.running:
            try:
                if not WAKFU_LOG_PATH.exists():
                    time.sleep(2)
                    continue
                size = WAKFU_LOG_PATH.stat().st_size
                if size < self.position:
                    self.position = 0
                    app_log("Log reset détecté (relance jeu)")
                if size > self.position:
                    with open(WAKFU_LOG_PATH, "r", encoding="utf-8", errors="replace") as f:
                        f.seek(self.position)
                        new_lines = f.readlines()
                        self.position = f.tell()
                    for line in new_lines:
                        self.lines_parsed += 1
                        self._parse(line)
            except Exception as e:
                app_log(f"LogWatcher erreur : {e}", "ERROR")
            time.sleep(0.5)

    def _parse(self, line):
        today = datetime.now().strftime("%Y-%m-%d")

        # --- XP Métier ---
        m = RE_XP.search(line)
        if m:
            ts, metier, xp_raw, extra = m.groups()
            xp = parse_number(xp_raw)
            level_up = 0
            m2 = RE_LEVEL_UP.search(extra)
            if m2:
                level_up = int(m2.group(1))
            xp_rem = 0
            m3 = RE_XP_REMAINING.search(extra)
            if m3:
                xp_rem = parse_number(m3.group(1))
            self.session.on_xp(ts, metier.strip(), xp, level_up, xp_rem)
            self.events_found += 1
            return

        # --- Kamas ---
        m = RE_KAMAS.search(line)
        if m:
            ts, amount = m.groups()
            self.session.on_kamas(ts, parse_number(amount))
            self.events_found += 1
            return

        # --- Drop ---
        m = RE_DROP.search(line)
        if m:
            ts, qty, name = m.groups()
            self.session.on_drop(ts, name.strip(), int(qty))
            self.events_found += 1
            return

        # --- Perte d'objet ---
        m = RE_LOSS.search(line)
        if m:
            ts, qty, name = m.groups()
            self.session.on_loss(ts, name.strip(), int(qty), "perdu")
            self.events_found += 1
            return

        # --- Utilisation d'objet ---
        m = RE_USE.search(line)
        if m:
            ts, name = m.groups()
            self.session.on_use(ts, name.strip())
            self.events_found += 1
            return

        # --- Vente HDV ---
        m = RE_SALE.search(line)
        if m:
            ts, qty, name, price_raw = m.groups()
            self.session.on_sale(ts, name.strip(), int(qty), parse_number(price_raw))
            self.events_found += 1
            return

        # --- Craft ---
        m = RE_CRAFT.search(line)
        if m:
            ts, recipe = m.groups()
            self.session.on_craft(ts, recipe.strip())
            self.events_found += 1
            return

        # --- Fin de combat ---
        m = RE_FIGHT_END.search(line)
        if m:
            ts, fid = m.groups()
            self.session.on_fight_end(ts, fid)
            self.events_found += 1
            return
        m = RE_FIGHT_END_INFO.search(line)
        if m:
            self.session.on_fight_end(m.group(1))
            self.events_found += 1
            return

        # --- Plant raté ---
        m = RE_PLANT_FAIL.search(line)
        if m:
            self.session.on_plant_fail(m.group(1))
            self.events_found += 1
            return


# ============================================================================
# INVENTORY MANAGER
# ============================================================================
class Inventory:
    def __init__(self, db):
        self.db = db

    def set_item(self, name, qty, location="inventaire"):
        now = datetime.now().isoformat()
        self.db.execute("""
            INSERT INTO inventory (item_name,quantity,location,last_updated) VALUES (?,?,?,?)
            ON CONFLICT(item_name,location) DO UPDATE SET quantity=excluded.quantity, last_updated=excluded.last_updated
        """, (name, qty, location, now))

    def move_item(self, name, qty, from_loc, to_loc, kamas=0):
        now = datetime.now().isoformat()
        self.db.execute(
            "INSERT INTO item_movements (timestamp,item_name,quantity,from_location,to_location,kamas_involved) VALUES (?,?,?,?,?,?)",
            (now, name, qty, from_loc, to_loc, kamas))
        existing = self.db.fetchone("SELECT quantity FROM inventory WHERE item_name=? AND location=?", (name, to_loc))
        if existing:
            self.db.execute("UPDATE inventory SET quantity=quantity+?, last_updated=? WHERE item_name=? AND location=?",
                            (qty, now, name, to_loc))
        else:
            self.db.execute("INSERT INTO inventory (item_name,quantity,location,last_updated) VALUES (?,?,?,?)",
                            (name, qty, to_loc, now))
        self.db.execute("UPDATE inventory SET quantity=MAX(0,quantity-?), last_updated=? WHERE item_name=? AND location=?",
                        (qty, now, name, from_loc))

    def set_price(self, name, price_per_unit, qty=1):
        now = datetime.now().isoformat()
        self.db.execute("INSERT INTO market_prices (timestamp,item_name,price_per_unit,quantity_listed,source) VALUES (?,?,?,?,?)",
                        (now, name, price_per_unit, qty, "manual"))

    def get_all(self, location=None):
        if location:
            return [dict(r) for r in self.db.fetchall(
                "SELECT * FROM inventory WHERE location=? AND quantity>0 ORDER BY item_name", (location,))]
        return [dict(r) for r in self.db.fetchall(
            "SELECT * FROM inventory WHERE quantity>0 ORDER BY location, item_name")]

    def get_last_price(self, item_name):
        row = self.db.fetchone(
            "SELECT price_per_unit FROM market_prices WHERE item_name=? ORDER BY timestamp DESC LIMIT 1", (item_name,))
        return row["price_per_unit"] if row else None

    def get_prices(self, item_name=None):
        if item_name:
            return [dict(r) for r in self.db.fetchall(
                "SELECT * FROM market_prices WHERE item_name=? ORDER BY timestamp DESC LIMIT 20", (item_name,))]
        return [dict(r) for r in self.db.fetchall(
            "SELECT * FROM market_prices ORDER BY timestamp DESC LIMIT 30")]

    def get_movements(self, limit=15):
        return [dict(r) for r in self.db.fetchall(
            "SELECT * FROM item_movements ORDER BY timestamp DESC LIMIT ?", (limit,))]


# ============================================================================
# RENDERER TERMINAL
# ============================================================================
class Renderer:
    """Dessine l'interface dans le terminal."""

    WIDTH = 64

    @staticmethod
    def clear():
        os.system("cls")

    @staticmethod
    def line(char="─", color=C.DIM):
        print(f"{color}{char * Renderer.WIDTH}{C.RESET}")

    @staticmethod
    def header(title):
        print(f"{C.CYAN}{'═' * Renderer.WIDTH}{C.RESET}")
        print(f"{C.CYAN}  {title}{C.RESET}")
        print(f"{C.CYAN}{'═' * Renderer.WIDTH}{C.RESET}")

    @staticmethod
    def section(title, color=C.YELLOW):
        print(f"\n{color}  ── {title} ──{C.RESET}")

    @staticmethod
    def format_eta(seconds):
        if seconds < 60:
            return f"~{int(seconds)}s"
        elif seconds < 3600:
            return f"~{int(seconds//60)}m{int(seconds%60):02d}s"
        else:
            return f"~{int(seconds//3600)}h{int((seconds%3600)//60):02d}m"

    @staticmethod
    def progress_bar(pct, width=20):
        filled = int(pct / (100 / width))
        filled = max(0, min(width, filled))
        return f"{C.GREEN}{'█' * filled}{C.DIM}{'░' * (width - filled)}{C.RESET}"

    def draw_dashboard(self, snap, config, inventory):
        self.clear()
        kb = config.get("kamas_base", 0)

        self.header(f"WAKFU COMPANION - {config.get('character')} @ {config.get('server')}")

        # Ligne info session
        total_cash = snap["kamas"] + snap["sales_kamas"]
        print(f"  {C.DIM}Session{C.RESET} {snap['elapsed']}  "
              f"{C.DIM}Combats{C.RESET} {snap['fights']}  "
              f"{C.DIM}Crafts{C.RESET} {len(snap['crafts'])}  "
              f"{C.DIM}Plants ratés{C.RESET} {snap['plant_fails']}")
        print(f"  {C.DIM}Kamas base{C.RESET} {kb:,}  "
              f"{C.DIM}Gagnés{C.RESET} +{total_cash:,}  "
              f"{C.WHITE}Estimé {kb + total_cash:,}{C.RESET}")

        # --- XP ---
        if snap["xp"]:
            self.section("XP METIERS")
            for metier, xp in sorted(snap["xp"].items(), key=lambda x: x[1], reverse=True):
                xp_h = int(xp / snap["hours"])
                xp_rem = snap["xp_remaining"].get(metier, 0)
                bar_str = ""
                eta_str = ""
                if xp_rem > 0:
                    total = xp_rem + xp
                    pct = max(0, min(99, (1 - xp_rem / total) * 100))
                    bar_str = f" {self.progress_bar(pct)} {pct:.0f}%"
                    if xp_h > 0:
                        eta_sec = xp_rem / xp_h * 3600
                        eta_str = f" {C.WHITE}{self.format_eta(eta_sec)}{C.RESET}"
                print(f"  {metier:18s}  +{xp:>8,}  {C.DIM}{xp_h:>8,}/h{C.RESET}  "
                      f"reste:{xp_rem:>7,}{bar_str}{eta_str}")
            print(f"  {'TOTAL':18s}  +{snap['xp_total']:>8,}  {C.DIM}{snap['xp_per_hour']:>8,}/h{C.RESET}")

        # Level ups
        if snap["level_ups"]:
            from collections import Counter
            counts = Counter(snap["level_ups"])
            ups = [f"{m} x{c}" if c > 1 else m for m, c in counts.items()]
            print(f"\n  {C.GREEN}★ LEVEL UPS : {', '.join(ups)}{C.RESET}")

        # --- KAMAS & VENTES ---
        self.section("REVENUS")
        print(f"  Drops kamas   +{snap['kamas']:>10,}  {C.DIM}{snap['kamas_per_hour']:>10,}/h{C.RESET}")
        if snap["sales"]:
            print(f"  Ventes HDV    +{snap['sales_kamas']:>10,}  {C.DIM}{snap['sales_per_hour']:>10,}/h{C.RESET}")
            for s in snap["sales"][-5:]:
                print(f"    {C.GREEN}${C.RESET} {s['qty']}x {s['item']:22s} {s['total']:>8,} kamas {C.DIM}({s['ppu']:,}/u){C.RESET}")
        total_h = int(total_cash / snap["hours"])
        print(f"  {C.WHITE}TOTAL         +{total_cash:>10,}  {total_h:>10,}/h{C.RESET}")

        # --- DROPS NET (drops - pertes) ---
        if snap["drops"] or snap["losses"]:
            drop_value = 0
            loss_value = 0

            self.section(f"RECOLTE  +{snap['drops_total']} ramassés  -{snap['losses_total']} perdus")
            net = snap["net_items"]
            for item, net_qty in sorted(net.items(), key=lambda x: abs(x[1]), reverse=True)[:12]:
                got = snap["drops"].get(item, 0)
                lost = snap["losses"].get(item, 0)
                price = inventory.get_last_price(item)

                # Affichage
                net_str = f"{C.GREEN}+{net_qty}{C.RESET}" if net_qty > 0 else f"{C.RED}{net_qty}{C.RESET}" if net_qty < 0 else f"{C.DIM}0{C.RESET}"
                detail = f"{C.DIM}(+{got} -{lost}){C.RESET}" if lost > 0 else ""
                price_str = ""
                if price and net_qty != 0:
                    val = price * abs(net_qty)
                    if net_qty > 0:
                        drop_value += val
                        price_str = f" {C.GREEN}{val:,}k{C.RESET}"
                    else:
                        loss_value += val
                        price_str = f" {C.RED}-{val:,}k{C.RESET}"
                elif not price:
                    price_str = f" {C.DIM}(?){C.RESET}"

                print(f"  {item:28s} {net_str:>5} {detail:>16} {price_str}")

            if drop_value > 0 or loss_value > 0:
                net_value = drop_value - loss_value
                net_val_h = int(net_value / snap["hours"]) if snap["hours"] > 0 else 0
                print(f"  {C.WHITE}{'VALEUR NETTE':>28s}       = {net_value:>10,} kamas ({net_val_h:,}/h){C.RESET}")

        # --- UTILISATIONS ---
        if snap["uses"]:
            self.section(f"UTILISATIONS ({sum(snap['uses'].values())})")
            for item, count in sorted(snap["uses"].items(), key=lambda x: x[1], reverse=True)[:5]:
                print(f"  {item:28s} x{count}")

        # --- CRAFTS ---
        if snap["crafts"]:
            self.section(f"CRAFTS ({len(snap['crafts'])})")
            from collections import Counter
            for recipe, count in Counter(snap["crafts"]).most_common(5):
                print(f"  {recipe:28s} x{count}")

        # --- FIL D'ACTIVITE ---
        if snap["feed"]:
            self.section("ACTIVITE")
            for ts, icon, text in snap["feed"][-10:]:
                icon_colored = {
                    "+": f"{C.GREEN}+{C.RESET}",
                    "X": f"{C.RED}X{C.RESET}",
                    "$": f"{C.GREEN}${C.RESET}",
                    "$$": f"{C.GREEN}$${C.RESET}",
                    "!": f"{C.YELLOW}!{C.RESET}",
                    "*": f"{C.MAGENTA}*{C.RESET}",
                    "~": f"{C.BLUE}~{C.RESET}",
                    "UP": f"{C.GREEN}{C.BOLD}UP{C.RESET}",
                }.get(icon, icon)
                print(f"  {C.DIM}{ts}{C.RESET} {icon_colored} {text}")

    def draw_inventory(self, inventory):
        self.clear()
        self.header("INVENTAIRE / COFFRE / HDV")
        for loc in ["inventaire", "coffre", "hdv"]:
            items = inventory.get_all(loc)
            total_val = 0
            self.section(f"{loc.upper()} ({len(items)})")
            if not items:
                print(f"  {C.DIM}(vide){C.RESET}")
                continue
            for it in items:
                price = inventory.get_last_price(it["item_name"])
                val_str = ""
                if price:
                    val = price * it["quantity"]
                    total_val += val
                    val_str = f" {C.GREEN}@ {price:,}/u = {val:,} k{C.RESET}"
                print(f"  {it['item_name']:30s} x{it['quantity']:<6}{val_str}")
            if total_val > 0:
                print(f"  {C.WHITE}{'TOTAL':>30s}   = {total_val:>10,} kamas{C.RESET}")

    def draw_prices(self, inventory):
        self.clear()
        self.header("HISTORIQUE PRIX HDV")
        prices = inventory.get_prices()
        if not prices:
            print(f"\n  {C.DIM}(aucun prix){C.RESET}")
            return
        current = ""
        for p in prices:
            if p["item_name"] != current:
                current = p["item_name"]
                self.section(current, C.GREEN)
            src = f" {C.DIM}[{p.get('source', '?')}]{C.RESET}" if p.get("source") else ""
            print(f"  {C.DIM}{p['timestamp'][:16]}{C.RESET}  {p['price_per_unit']:>10,} k/u  (x{p['quantity_listed']}){src}")

    def draw_movements(self, inventory):
        self.clear()
        self.header("MOUVEMENTS D'ITEMS")
        moves = inventory.get_movements()
        if not moves:
            print(f"\n  {C.DIM}(aucun mouvement){C.RESET}")
            return
        for m in moves:
            k_str = f" {C.GREEN}{m['kamas_involved']:,}k{C.RESET}" if m["kamas_involved"] else ""
            print(f"  {C.DIM}{m['timestamp'][:16]}{C.RESET}  {m['quantity']}x {m['item_name']:22s}  "
                  f"{m['from_location']:>10} {C.YELLOW}->{C.RESET} {m['to_location']:<10}{k_str}")

    def draw_help(self):
        print(f"\n{C.DIM}{'─' * self.WIDTH}{C.RESET}")
        print(f"  {C.DIM}D{C.RESET}ashboard  "
              f"{C.DIM}I{C.RESET}nventaire  "
              f"{C.DIM}H{C.RESET}DV prix  "
              f"{C.DIM}M{C.RESET}ouvements  "
              f"{C.DIM}K{C.RESET}amas  "
              f"{C.DIM}A{C.RESET}jout item  "
              f"{C.DIM}V{C.RESET}ente")
        print(f"  {C.DIM}C{C.RESET}raft loss  "
              f"{C.DIM}P{C.RESET}rix HDV  "
              f"{C.DIM}T{C.RESET}ransfert  "
              f"{C.DIM}S{C.RESET}earch  "
              f"{C.DIM}Q{C.RESET}uitter")


# ============================================================================
# APPLICATION PRINCIPALE
# ============================================================================
class App:
    def __init__(self):
        self.db = Database()
        self.config = Config()
        self.items = ItemDatabase()
        self.session = Session(self.db)
        self.inventory = Inventory(self.db)
        self.watcher = LogWatcher(self.session)
        self.renderer = Renderer()

        self.running = True
        self.view = "dashboard"
        self.input_mode = False
        self.input_prompt = ""
        self.input_buffer = ""
        self.input_steps = []
        self.input_step_idx = 0
        self.input_data = {}
        self.input_cmd = ""
        self.status_msg = ""

    def start(self):
        self.watcher.start()
        app_log("Application démarrée")
        try:
            self._main_loop()
        except KeyboardInterrupt:
            pass
        finally:
            self.watcher.stop()
            self.db.close()
            print(f"\n{C.GREEN}  Session sauvegardée. Bon jeu !{C.RESET}")
            app_log("Application fermée")

    def _main_loop(self):
        last_render = 0
        while self.running:
            now = time.time()
            if now - last_render >= REFRESH_INTERVAL:
                self._render()
                last_render = now

            if msvcrt.kbhit():
                key = msvcrt.getch()
                self._handle_key(key)
                self._render()
                last_render = time.time()

            time.sleep(0.05)

    def _render(self):
        if self.input_mode:
            # En mode saisie, on ne refresh pas tout l'écran
            return

        if self.view == "dashboard":
            snap = self.session.snapshot()
            self.renderer.draw_dashboard(snap, self.config, self.inventory)
        elif self.view == "inventory":
            self.renderer.draw_inventory(self.inventory)
        elif self.view == "prices":
            self.renderer.draw_prices(self.inventory)
        elif self.view == "movements":
            self.renderer.draw_movements(self.inventory)

        self.renderer.draw_help()

        if self.status_msg:
            print(f"\n  {C.GREEN}{self.status_msg}{C.RESET}")
            self.status_msg = ""

        # Stats watcher
        print(f"  {C.DIM}Log: {self.watcher.lines_parsed} lignes | {self.watcher.events_found} events{C.RESET}")

    def _handle_key(self, key):
        if self.input_mode:
            if key == b"\r":
                self._finish_input_step()
            elif key == b"\x08":
                self.input_buffer = self.input_buffer[:-1]
                self._redraw_input()
            elif key == b"\x1b":
                self.input_mode = False
                self.status_msg = "Annulé"
            else:
                try:
                    ch = key.decode("utf-8", errors="ignore")
                    if ch.isprintable():
                        self.input_buffer += ch
                        self._redraw_input()
                except Exception:
                    pass
            return

        k = key.lower()
        if k == b"q":
            self.running = False
        elif k == b"d":
            self.view = "dashboard"
        elif k == b"i":
            self.view = "inventory"
        elif k == b"h":
            self.view = "prices"
        elif k == b"m":
            self.view = "movements"
        elif k == b"k":
            self._start_input("kamas", [("Kamas actuels : ", "kamas")])
        elif k == b"a":
            self._start_input("add_item", [
                ("Item : ", "name"),
                ("Quantité : ", "qty"),
                ("Où ? (inventaire/coffre/hdv) [inventaire] : ", "loc"),
            ])
        elif k == b"p":
            self._start_input("set_price", [
                ("Item : ", "name"),
                ("Prix unitaire : ", "price"),
                ("Quantité [1] : ", "qty"),
            ])
        elif k == b"t":
            self._start_input("transfer", [
                ("Item : ", "name"),
                ("Quantité : ", "qty"),
                ("Depuis (inventaire/coffre/hdv) : ", "from"),
                ("Vers (inventaire/coffre/hdv/craft/perdu) : ", "to"),
                ("Kamas [0] : ", "kamas"),
            ])
        elif k == b"c":
            self._start_input("craft_loss", [
                ("Item consommé : ", "name"),
                ("Quantité : ", "qty"),
            ])
        elif k == b"s":
            self._start_input("search", [("Rechercher : ", "query")])
        elif k == b"v":
            self._start_input("sell", [
                ("Item vendu : ", "name"),
                ("Quantité : ", "qty"),
                ("Prix total : ", "price"),
            ])

    def _start_input(self, cmd, steps):
        self.input_mode = True
        self.input_cmd = cmd
        self.input_steps = steps
        self.input_step_idx = 0
        self.input_data = {}
        self.input_buffer = ""
        self.input_prompt = steps[0][0]
        self._redraw_input()

    def _redraw_input(self):
        # Efface la ligne courante et réécrit le prompt
        sys.stdout.write(f"\r  {C.YELLOW}{self.input_prompt}{C.RESET}{self.input_buffer}   ")
        sys.stdout.flush()

    def _finish_input_step(self):
        key = self.input_steps[self.input_step_idx][1]
        self.input_data[key] = self.input_buffer.strip()
        self.input_buffer = ""
        self.input_step_idx += 1
        if self.input_step_idx < len(self.input_steps):
            self.input_prompt = self.input_steps[self.input_step_idx][0]
            print()
            self._redraw_input()
        else:
            self.input_mode = False
            print()
            self._execute_input()

    def _execute_input(self):
        d = self.input_data
        try:
            if self.input_cmd == "kamas":
                val = int(d["kamas"].replace(" ", ""))
                self.config.set("kamas_base", val)
                self.status_msg = f"Kamas de base = {val:,}"

            elif self.input_cmd == "add_item":
                name = d["name"]
                qty = int(d["qty"].replace(" ", ""))
                loc = d.get("loc", "") or "inventaire"
                self.inventory.set_item(name, qty, loc)
                self.status_msg = f"{qty}x {name} dans [{loc}]"

            elif self.input_cmd == "set_price":
                name = d["name"]
                price = int(d["price"].replace(" ", ""))
                qty = int(d.get("qty", "1").replace(" ", "") or "1")
                self.inventory.set_price(name, price, qty)
                self.status_msg = f"Prix {name} = {price:,} kamas/u"

            elif self.input_cmd == "transfer":
                name = d["name"]
                qty = int(d["qty"].replace(" ", ""))
                fr = d["from"]
                to = d["to"]
                kamas = int(d.get("kamas", "0").replace(" ", "") or "0")
                self.inventory.move_item(name, qty, fr, to, kamas)
                self.status_msg = f"{qty}x {name} [{fr}] -> [{to}]"

            elif self.input_cmd == "craft_loss":
                name = d["name"]
                qty = int(d["qty"].replace(" ", ""))
                self.inventory.move_item(name, qty, "inventaire", "craft")
                self.status_msg = f"{qty}x {name} consommé en craft"

            elif self.input_cmd == "sell":
                name = d["name"]
                qty = int(d["qty"].replace(" ", ""))
                price = int(d["price"].replace(" ", ""))
                ppu = price // max(qty, 1)
                self.inventory.set_price(name, ppu, qty)
                self.inventory.move_item(name, qty, "inventaire", "hdv", price)
                self.status_msg = f"Vendu {qty}x {name} = {price:,} kamas ({ppu:,}/u)"

            elif self.input_cmd == "search":
                results = self.items.search(d["query"])
                if results:
                    parts = [f"{r['name']} (lvl{r['level']})" for r in results[:5]]
                    self.status_msg = " | ".join(parts)
                else:
                    self.status_msg = "Aucun résultat"

        except ValueError:
            self.status_msg = "Valeur invalide"
        except Exception as e:
            self.status_msg = f"Erreur : {e}"


# ============================================================================
# POINT D'ENTREE
# ============================================================================
if __name__ == "__main__":
    print(f"""
{C.CYAN}    ╔══════════════════════════════════════════════════╗
    ║  WAKFU COMPANION v1.0.0                          ║
    ║  L'Immortel @ Ogrest                             ║
    ║  Autocode Orchestra                              ║
    ╚══════════════════════════════════════════════════╝{C.RESET}
    """)
    App().start()
