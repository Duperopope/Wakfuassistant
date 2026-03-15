# H:\Code\Wakfuassistant\src\main.py
# ============================================================================
# WAKFU ASSISTANT - Proof of Concept Terminal
# Toutes les mécaniques : log parsing, inventaire, coffre, HDV, craft tracking
# Version : 0.1.0 | Date : 2026-03-15
# Projet : github.com/Kairozadyk/wakfu-assistant
# ============================================================================

import re
import os
import sys
import time
import json
import sqlite3
import threading
from datetime import datetime
from collections import defaultdict
from pathlib import Path

# --- PATHS ---
PROJECT_PATH = Path(r"H:\Code\Wakfuassistant")
WAKFU_LOG_PATH = Path(r"C:\Users\Smedj\AppData\Roaming\zaap\gamesLogs\wakfu\logs\wakfu.log")
DB_PATH = PROJECT_PATH / "data" / "wakfu_tracker.db"
ANKAMA_CDN_PATH = PROJECT_PATH / "data" / "ankama_cdn"
LOG_PATH = PROJECT_PATH / "logs" / "assistant.log"
CONFIG_PATH = PROJECT_PATH / "data" / "user_config.json"


# ============================================================================
# LOGGING
# ============================================================================
def log(message, level="INFO"):
    timestamp = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    line = f"[{timestamp}] [{level}] {message}"
    LOG_PATH.parent.mkdir(parents=True, exist_ok=True)
    with open(LOG_PATH, "a", encoding="utf-8") as f:
        f.write(line + "\n")
    if level == "ERROR":
        print(f"\033[91m{line}\033[0m")


# ============================================================================
# BASE DE DONNEES
# ============================================================================
def get_db():
    DB_PATH.parent.mkdir(parents=True, exist_ok=True)
    conn = sqlite3.connect(str(DB_PATH))
    conn.row_factory = sqlite3.Row
    conn.execute("PRAGMA journal_mode=WAL")
    return conn


def init_database():
    conn = get_db()
    c = conn.cursor()

    c.execute("""CREATE TABLE IF NOT EXISTS xp_gains (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        timestamp TEXT NOT NULL,
        session_date TEXT NOT NULL,
        metier TEXT NOT NULL,
        xp_gained INTEGER NOT NULL,
        level_up INTEGER DEFAULT 0,
        xp_to_next_level INTEGER DEFAULT 0
    )""")

    c.execute("""CREATE TABLE IF NOT EXISTS kamas_gains (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        timestamp TEXT NOT NULL,
        session_date TEXT NOT NULL,
        amount INTEGER NOT NULL,
        source TEXT DEFAULT 'combat'
    )""")

    c.execute("""CREATE TABLE IF NOT EXISTS item_drops (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        timestamp TEXT NOT NULL,
        session_date TEXT NOT NULL,
        item_name TEXT NOT NULL,
        quantity INTEGER NOT NULL
    )""")

    c.execute("""CREATE TABLE IF NOT EXISTS craft_results (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        timestamp TEXT NOT NULL,
        session_date TEXT NOT NULL,
        recipe_name TEXT NOT NULL,
        success INTEGER DEFAULT 1
    )""")

    c.execute("""CREATE TABLE IF NOT EXISTS inventory (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        item_name TEXT UNIQUE NOT NULL,
        quantity INTEGER DEFAULT 0,
        location TEXT DEFAULT 'inventaire',
        last_updated TEXT NOT NULL
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
        kamas_involved INTEGER DEFAULT 0,
        note TEXT DEFAULT ''
    )""")

    c.execute("""CREATE TABLE IF NOT EXISTS sessions (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        start_time TEXT NOT NULL,
        end_time TEXT,
        total_xp INTEGER DEFAULT 0,
        total_kamas INTEGER DEFAULT 0,
        total_drops INTEGER DEFAULT 0,
        fights_count INTEGER DEFAULT 0
    )""")

    conn.commit()
    conn.close()
    log("Database initialisée")


# ============================================================================
# USER CONFIG (kamas de base, etc.)
# ============================================================================
def load_config():
    if CONFIG_PATH.exists():
        with open(CONFIG_PATH, "r", encoding="utf-8") as f:
            return json.load(f)
    default = {
        "character": "L'Immortel",
        "server": "Ogrest",
        "kamas_base": 0,
        "created": datetime.now().isoformat()
    }
    save_config(default)
    return default


def save_config(config):
    CONFIG_PATH.parent.mkdir(parents=True, exist_ok=True)
    with open(CONFIG_PATH, "w", encoding="utf-8") as f:
        json.dump(config, f, indent=2, ensure_ascii=False)


# ============================================================================
# ANKAMA CDN - Résolution nom/ID items
# ============================================================================
class ItemDatabase:
    def __init__(self):
        self.items = {}
        self.items_by_name = {}
        self.resources = {}
        self._load()

    def _load(self):
        items_path = ANKAMA_CDN_PATH / "items.json"
        if items_path.exists():
            with open(items_path, "r", encoding="utf-8") as f:
                raw = json.load(f)
            for item in raw:
                item_id = item.get("definition", {}).get("item", {}).get("id")
                title = item.get("title", {}).get("fr", "")
                if item_id and title:
                    self.items[item_id] = {
                        "id": item_id,
                        "name": title,
                        "level": item.get("definition", {}).get("item", {}).get("level", 0),
                        "icon_url": f"https://vertylo.github.io/wakassets/items/{item_id}.png"
                    }
                    self.items_by_name[title.lower()] = self.items[item_id]
            log(f"ItemDatabase chargée : {len(self.items)} items")
        else:
            log("items.json non trouvé dans ankama_cdn", "ERROR")

    def find(self, name):
        """Cherche un item par nom (insensible à la casse)."""
        key = name.lower().strip()
        if key in self.items_by_name:
            return self.items_by_name[key]
        # Recherche partielle
        results = []
        for k, v in self.items_by_name.items():
            if key in k:
                results.append(v)
        return results if results else None

    def get_icon_url(self, name):
        item = self.find(name)
        if isinstance(item, dict):
            return item["icon_url"]
        if isinstance(item, list) and len(item) > 0:
            return item[0]["icon_url"]
        return None


# ============================================================================
# LOG PARSER (temps réel)
# ============================================================================
PATTERNS = {
    "xp_metier": re.compile(
        r"(\d{2}:\d{2}:\d{2}),\d+.+\[Information \(jeu\)\] (.+?) : \+(\d[\d\s]*) points d'XP\.\s+(.*)"
    ),
    "xp_level_up": re.compile(
        r"\+(\d+) niveau"
    ),
    "xp_next_level": re.compile(
        r"Prochain niveau dans : ([\d\s]+)"
    ),
    "kamas_gain": re.compile(
        r"(\d{2}:\d{2}:\d{2}),\d+.+\[Information \(jeu\)\] Vous avez gagné (\d[\d\s]*) kamas"
    ),
    "item_drop": re.compile(
        r"(\d{2}:\d{2}:\d{2}),\d+.+\[Information \(jeu\)\] Vous avez ramassé (\d+)x (.+?) \."
    ),
    "craft_success": re.compile(
        r"(\d{2}:\d{2}:\d{2}),\d+.+\[Information \(jeu\)\] Vous avez réussi votre recette de (.+?)\."
    ),
    "fight_end": re.compile(
        r"(\d{2}:\d{2}:\d{2}),\d+.+\[FIGHT\] End fight with id (\d+)"
    ),
    "fight_end_info": re.compile(
        r"(\d{2}:\d{2}:\d{2}),\d+.+\[Information \(combat\)\] Combat terminé"
    ),
}


def parse_number(text):
    return int(text.replace(" ", "").replace("\u202f", "").strip())


class LogWatcher:
    def __init__(self, on_event):
        self.on_event = on_event
        self.running = False
        self.position = 0

    def start(self):
        self.running = True
        if WAKFU_LOG_PATH.exists():
            self.position = WAKFU_LOG_PATH.stat().st_size
            log(f"LogWatcher démarré à position {self.position}")
        else:
            log("wakfu.log non trouvé, en attente...", "WARN")
        self.thread = threading.Thread(target=self._watch, daemon=True)
        self.thread.start()

    def stop(self):
        self.running = False

    def _watch(self):
        while self.running:
            try:
                if not WAKFU_LOG_PATH.exists():
                    time.sleep(2)
                    continue
                current_size = WAKFU_LOG_PATH.stat().st_size
                if current_size < self.position:
                    self.position = 0
                    log("Log reset détecté (nouveau lancement jeu)")
                if current_size > self.position:
                    with open(WAKFU_LOG_PATH, "r", encoding="utf-8", errors="replace") as f:
                        f.seek(self.position)
                        new_lines = f.readlines()
                        self.position = f.tell()
                    for line in new_lines:
                        self._parse(line.strip())
            except Exception as e:
                log(f"LogWatcher erreur : {e}", "ERROR")
            time.sleep(1)

    def _parse(self, line):
        today = datetime.now().strftime("%Y-%m-%d")

        # XP Métier
        m = PATTERNS["xp_metier"].search(line)
        if m:
            ts, metier, xp_raw, extra = m.groups()
            xp = parse_number(xp_raw)
            level_up = 0
            m_lvl = PATTERNS["xp_level_up"].search(extra)
            if m_lvl:
                level_up = int(m_lvl.group(1))
            xp_next = 0
            m_next = PATTERNS["xp_next_level"].search(extra)
            if m_next:
                xp_next = parse_number(m_next.group(1))
            self.on_event("xp", {
                "timestamp": ts, "date": today, "metier": metier,
                "xp": xp, "level_up": level_up, "xp_to_next": xp_next
            })
            return

        # Kamas
        m = PATTERNS["kamas_gain"].search(line)
        if m:
            ts, amount_raw = m.groups()
            self.on_event("kamas", {
                "timestamp": ts, "date": today, "amount": parse_number(amount_raw)
            })
            return

        # Drop
        m = PATTERNS["item_drop"].search(line)
        if m:
            ts, qty, name = m.groups()
            self.on_event("drop", {
                "timestamp": ts, "date": today, "item": name.strip(), "qty": int(qty)
            })
            return

        # Craft
        m = PATTERNS["craft_success"].search(line)
        if m:
            ts, recipe = m.groups()
            self.on_event("craft", {
                "timestamp": ts, "date": today, "recipe": recipe.strip()
            })
            return

        # Combat
        m = PATTERNS["fight_end"].search(line) or PATTERNS["fight_end_info"].search(line)
        if m:
            self.on_event("fight_end", {"timestamp": m.group(1), "date": today})
            return


# ============================================================================
# SESSION TRACKER (agrège les events)
# ============================================================================
class SessionTracker:
    def __init__(self):
        self.start_time = datetime.now()
        self.xp = defaultdict(int)
        self.kamas = 0
        self.drops = defaultdict(int)
        self.crafts = []
        self.fights = 0
        self.level_ups = []
        self.xp_to_next = {}

    def handle_event(self, event_type, data):
        conn = get_db()
        if event_type == "xp":
            self.xp[data["metier"]] += data["xp"]
            self.xp_to_next[data["metier"]] = data["xp_to_next"]
            if data["level_up"]:
                self.level_ups.append(f"{data['metier']} +{data['level_up']}")
            conn.execute(
                "INSERT INTO xp_gains (timestamp,session_date,metier,xp_gained,level_up,xp_to_next_level) VALUES (?,?,?,?,?,?)",
                (data["timestamp"], data["date"], data["metier"], data["xp"], data["level_up"], data["xp_to_next"])
            )
        elif event_type == "kamas":
            self.kamas += data["amount"]
            conn.execute(
                "INSERT INTO kamas_gains (timestamp,session_date,amount) VALUES (?,?,?)",
                (data["timestamp"], data["date"], data["amount"])
            )
        elif event_type == "drop":
            self.drops[data["item"]] += data["qty"]
            conn.execute(
                "INSERT INTO item_drops (timestamp,session_date,item_name,quantity) VALUES (?,?,?,?)",
                (data["timestamp"], data["date"], data["item"], data["qty"])
            )
        elif event_type == "craft":
            self.crafts.append(data["recipe"])
            conn.execute(
                "INSERT INTO craft_results (timestamp,session_date,recipe_name) VALUES (?,?,?)",
                (data["timestamp"], data["date"], data["recipe"])
            )
        elif event_type == "fight_end":
            self.fights += 1
        conn.commit()
        conn.close()

    def get_elapsed_hours(self):
        return max((datetime.now() - self.start_time).total_seconds() / 3600, 0.001)

    def get_summary(self):
        h = self.get_elapsed_hours()
        elapsed = str(datetime.now() - self.start_time).split(".")[0]
        total_xp = sum(self.xp.values())
        return {
            "elapsed": elapsed,
            "hours": h,
            "xp_by_metier": dict(self.xp),
            "xp_total": total_xp,
            "xp_per_hour": int(total_xp / h),
            "xp_to_next": dict(self.xp_to_next),
            "kamas": self.kamas,
            "kamas_per_hour": int(self.kamas / h),
            "drops": dict(self.drops),
            "drops_total": sum(self.drops.values()),
            "crafts": self.crafts,
            "fights": self.fights,
            "level_ups": self.level_ups,
        }


# ============================================================================
# INVENTAIRE / COFFRE / HDV MANAGER
# ============================================================================
class InventoryManager:
    def __init__(self):
        self.locations = ["inventaire", "coffre", "hdv", "craft", "perdu"]

    def set_item(self, item_name, quantity, location="inventaire"):
        conn = get_db()
        now = datetime.now().isoformat()
        conn.execute("""
            INSERT INTO inventory (item_name, quantity, location, last_updated)
            VALUES (?, ?, ?, ?)
            ON CONFLICT(item_name) DO UPDATE SET
                quantity=excluded.quantity,
                location=excluded.location,
                last_updated=excluded.last_updated
        """, (item_name, quantity, location, now))
        conn.commit()
        conn.close()

    def move_item(self, item_name, qty, from_loc, to_loc, kamas=0, note=""):
        conn = get_db()
        now = datetime.now().isoformat()
        conn.execute("""
            INSERT INTO item_movements (timestamp, item_name, quantity, from_location, to_location, kamas_involved, note)
            VALUES (?, ?, ?, ?, ?, ?, ?)
        """, (now, item_name, qty, from_loc, to_loc, kamas, note))

        # Mettre à jour la quantité à destination
        existing = conn.execute(
            "SELECT quantity FROM inventory WHERE item_name=? AND location=?",
            (item_name, to_loc)
        ).fetchone()
        if existing:
            conn.execute(
                "UPDATE inventory SET quantity=quantity+?, last_updated=? WHERE item_name=? AND location=?",
                (qty, now, item_name, to_loc)
            )
        else:
            conn.execute(
                "INSERT INTO inventory (item_name, quantity, location, last_updated) VALUES (?,?,?,?)",
                (item_name, qty, to_loc, now)
            )

        # Réduire la quantité à la source
        conn.execute(
            "UPDATE inventory SET quantity=MAX(0, quantity-?), last_updated=? WHERE item_name=? AND location=?",
            (qty, now, item_name, from_loc)
        )
        conn.commit()
        conn.close()
        log(f"MOVE: {qty}x {item_name} [{from_loc}] -> [{to_loc}] ({kamas} kamas)")

    def set_price(self, item_name, price_per_unit, qty_listed=1):
        conn = get_db()
        now = datetime.now().isoformat()
        conn.execute(
            "INSERT INTO market_prices (timestamp, item_name, price_per_unit, quantity_listed) VALUES (?,?,?,?)",
            (now, item_name, price_per_unit, qty_listed)
        )
        conn.commit()
        conn.close()
        log(f"PRIX HDV: {item_name} = {price_per_unit:,} kamas/u (x{qty_listed})")

    def get_all(self, location=None):
        conn = get_db()
        if location:
            rows = conn.execute(
                "SELECT item_name, quantity, location, last_updated FROM inventory WHERE location=? AND quantity>0 ORDER BY item_name",
                (location,)
            ).fetchall()
        else:
            rows = conn.execute(
                "SELECT item_name, quantity, location, last_updated FROM inventory WHERE quantity>0 ORDER BY location, item_name"
            ).fetchall()
        conn.close()
        return [dict(r) for r in rows]

    def get_prices(self, item_name=None):
        conn = get_db()
        if item_name:
            rows = conn.execute(
                "SELECT * FROM market_prices WHERE item_name=? ORDER BY timestamp DESC LIMIT 10",
                (item_name,)
            ).fetchall()
        else:
            rows = conn.execute(
                "SELECT * FROM market_prices ORDER BY timestamp DESC LIMIT 50"
            ).fetchall()
        conn.close()
        return [dict(r) for r in rows]

    def get_movements(self, item_name=None, limit=20):
        conn = get_db()
        if item_name:
            rows = conn.execute(
                "SELECT * FROM item_movements WHERE item_name=? ORDER BY timestamp DESC LIMIT ?",
                (item_name, limit)
            ).fetchall()
        else:
            rows = conn.execute(
                "SELECT * FROM item_movements ORDER BY timestamp DESC LIMIT ?",
                (limit,)
            ).fetchall()
        conn.close()
        return [dict(r) for r in rows]


# ============================================================================
# TERMINAL UI
# ============================================================================
class TerminalUI:
    def __init__(self, session, inventory, item_db, config):
        self.session = session
        self.inv = inventory
        self.item_db = item_db
        self.config = config

    def clear(self):
        os.system("cls" if os.name == "nt" else "clear")

    def header(self, title):
        print(f"\n\033[96m{'═' * 60}\033[0m")
        print(f"\033[96m  {title}\033[0m")
        print(f"\033[96m{'═' * 60}\033[0m")

    def show_dashboard(self):
        self.clear()
        s = self.session.get_summary()
        self.header(f"WAKFU ASSISTANT - {self.config['character']} @ {self.config['server']}")
        print(f"  Session : {s['elapsed']} | Combats : {s['fights']}")
        kamas_base = self.config.get("kamas_base", 0)
        print(f"  Kamas de base : {kamas_base:,} | Gagnés : +{s['kamas']:,} | Total estimé : {kamas_base + s['kamas']:,}")

        print(f"\n\033[93m  --- XP METIERS ---\033[0m")
        for metier, xp in sorted(s["xp_by_metier"].items(), key=lambda x: x[1], reverse=True):
            xp_h = int(xp / s["hours"])
            xp_next = s["xp_to_next"].get(metier, "?")
            bar_pct = ""
            if isinstance(xp_next, int) and xp_next > 0:
                pct = max(0, 100 - (xp_next / (xp_next + xp) * 100))
                filled = int(pct / 5)
                bar_pct = f" [{'█' * filled}{'░' * (20 - filled)}] {pct:.0f}%"
            print(f"  {metier:20s} +{xp:>8,} XP  ({xp_h:>8,}/h)  next:{xp_next:>8}{bar_pct}")

        if s["level_ups"]:
            print(f"\n  \033[92mLEVEL UP : {', '.join(s['level_ups'])}\033[0m")

        print(f"\n\033[93m  --- KAMAS ---\033[0m")
        print(f"  +{s['kamas']:,} kamas  ({s['kamas_per_hour']:,}/h)")

        print(f"\n\033[93m  --- DROPS ({s['drops_total']} items) ---\033[0m")
        for item, qty in sorted(s["drops"].items(), key=lambda x: x[1], reverse=True)[:10]:
            prices = self.inv.get_prices(item)
            price_str = ""
            if prices:
                last_price = prices[0]["price_per_unit"]
                price_str = f"  \033[92m({last_price:,} k/u = {last_price * qty:,} k total)\033[0m"
            print(f"  {item:30s} x{qty:<6}{price_str}")

        if s["crafts"]:
            print(f"\n\033[93m  --- CRAFTS ({len(s['crafts'])}) ---\033[0m")
            for recipe in s["crafts"][-5:]:
                print(f"  {recipe}")

    def show_inventory(self, location=None):
        self.header(f"INVENTAIRE{f' - {location.upper()}' if location else ''}")
        items = self.inv.get_all(location)
        if not items:
            print("  (vide)")
            return
        for it in items:
            prices = self.inv.get_prices(it["item_name"])
            price_str = ""
            if prices:
                p = prices[0]["price_per_unit"]
                price_str = f"  @ {p:,} k/u = {p * it['quantity']:,} k"
            print(f"  [{it['location']:10s}] {it['item_name']:30s} x{it['quantity']:<6}{price_str}")

    def show_price_history(self, item_name=None):
        self.header(f"PRIX HDV{f' - {item_name}' if item_name else ''}")
        prices = self.inv.get_prices(item_name)
        if not prices:
            print("  Aucun prix enregistré")
            return
        for p in prices:
            print(f"  {p['timestamp'][:16]}  {p['item_name']:30s}  {p['price_per_unit']:>10,} k/u  (x{p['quantity_listed']})")

    def show_movements(self, item_name=None):
        self.header(f"MOUVEMENTS{f' - {item_name}' if item_name else ''}")
        moves = self.inv.get_movements(item_name)
        if not moves:
            print("  Aucun mouvement")
            return
        for m in moves:
            kamas_str = f" ({m['kamas_involved']:,} k)" if m["kamas_involved"] else ""
            print(f"  {m['timestamp'][:16]}  {m['quantity']}x {m['item_name']:25s}  {m['from_location']:>10} -> {m['to_location']:<10}{kamas_str}")

    def prompt_set_kamas(self):
        try:
            amount = input("\n  Kamas actuels de L'Immortel : ").strip().replace(" ", "")
            self.config["kamas_base"] = int(amount)
            save_config(self.config)
            print(f"  \033[92mKamas de base mis à jour : {self.config['kamas_base']:,}\033[0m")
        except ValueError:
            print("  \033[91mNombre invalide\033[0m")

    def prompt_set_item(self):
        name = input("  Nom de l'item : ").strip()
        if not name:
            return
        found = self.item_db.find(name)
        if isinstance(found, list) and len(found) > 0 and len(found) <= 10:
            print(f"  Suggestions :")
            for i, f in enumerate(found):
                print(f"    {i+1}. {f['name']} (lvl {f['level']})")
            choice = input("  Numéro (ou Entrée pour garder ta saisie) : ").strip()
            if choice.isdigit() and 1 <= int(choice) <= len(found):
                name = found[int(choice) - 1]["name"]
        try:
            qty = int(input(f"  Quantité de {name} : ").strip().replace(" ", ""))
            loc = input("  Où ? (inventaire/coffre/hdv) [inventaire] : ").strip() or "inventaire"
            self.inv.set_item(name, qty, loc)
            print(f"  \033[92m{qty}x {name} enregistré dans [{loc}]\033[0m")
        except ValueError:
            print("  \033[91mQuantité invalide\033[0m")

    def prompt_move_item(self):
        name = input("  Item à déplacer : ").strip()
        if not name:
            return
        try:
            qty = int(input("  Quantité : ").strip().replace(" ", ""))
            from_loc = input("  Depuis (inventaire/coffre/hdv) : ").strip()
            to_loc = input("  Vers (inventaire/coffre/hdv/craft/perdu) : ").strip()
            kamas = 0
            if to_loc == "hdv":
                k = input("  Prix de vente total (0 si mise en vente) : ").strip().replace(" ", "")
                kamas = int(k) if k else 0
            elif from_loc == "hdv":
                k = input("  Kamas reçus de la vente : ").strip().replace(" ", "")
                kamas = int(k) if k else 0
            self.inv.move_item(name, qty, from_loc, to_loc, kamas)
            print(f"  \033[92m{qty}x {name} : [{from_loc}] -> [{to_loc}]\033[0m")
        except ValueError:
            print("  \033[91mValeur invalide\033[0m")

    def prompt_set_price(self):
        name = input("  Item : ").strip()
        if not name:
            return
        try:
            price = int(input(f"  Prix unitaire de {name} : ").strip().replace(" ", ""))
            qty = input("  Quantité listée à l'HDV [1] : ").strip() or "1"
            self.inv.set_price(name, price, int(qty))
            print(f"  \033[92m{name} = {price:,} kamas/unité enregistré\033[0m")
        except ValueError:
            print("  \033[91mPrix invalide\033[0m")

    def prompt_search_item(self):
        query = input("  Rechercher un item : ").strip()
        if not query:
            return
        results = self.item_db.find(query)
        if isinstance(results, dict):
            results = [results]
        if not results:
            print("  Aucun résultat")
            return
        print(f"  {len(results)} résultat(s) :")
        for r in results[:20]:
            print(f"    [{r['id']}] {r['name']} (lvl {r['level']}) - icône: {r['icon_url']}")

    def main_menu(self):
        print(f"""
\033[96m  ╔══════════════════════════════════════╗
  ║  COMMANDES                           ║
  ╠══════════════════════════════════════╣
  ║  d  = Dashboard (rafraîchir)        ║
  ║  k  = Éditer mes kamas de base      ║
  ║  i  = Ajouter/modifier un item      ║
  ║  m  = Déplacer un item              ║
  ║  p  = Enregistrer un prix HDV       ║
  ║  v  = Voir inventaire               ║
  ║  h  = Historique des prix           ║
  ║  mv = Voir les mouvements           ║
  ║  s  = Rechercher un item Ankama     ║
  ║  q  = Quitter                       ║
  ╚══════════════════════════════════════╝\033[0m""")

    def run(self):
        while True:
            self.show_dashboard()
            self.main_menu()
            cmd = input("\n  > ").strip().lower()
            if cmd == "q":
                break
            elif cmd == "d":
                continue
            elif cmd == "k":
                self.prompt_set_kamas()
                input("\n  Entrée pour continuer...")
            elif cmd == "i":
                self.prompt_set_item()
                input("\n  Entrée pour continuer...")
            elif cmd == "m":
                self.prompt_move_item()
                input("\n  Entrée pour continuer...")
            elif cmd == "p":
                self.prompt_set_price()
                input("\n  Entrée pour continuer...")
            elif cmd == "v":
                loc = input("  Filtrer par lieu ? (inventaire/coffre/hdv ou vide) : ").strip() or None
                self.show_inventory(loc)
                input("\n  Entrée pour continuer...")
            elif cmd == "h":
                name = input("  Item ? (vide = tous) : ").strip() or None
                self.show_price_history(name)
                input("\n  Entrée pour continuer...")
            elif cmd == "mv":
                name = input("  Item ? (vide = tous) : ").strip() or None
                self.show_movements(name)
                input("\n  Entrée pour continuer...")
            elif cmd == "s":
                self.prompt_search_item()
                input("\n  Entrée pour continuer...")


# ============================================================================
# MAIN
# ============================================================================
def main():
    print(r"""
    ╔══════════════════════════════════════════════╗
    ║  WAKFU ASSISTANT v0.1.0 - Proof of Concept  ║
    ║  Autocode Orchestra x L'Immortel            ║
    ╚══════════════════════════════════════════════╝
    """)

    init_database()
    config = load_config()
    item_db = ItemDatabase()
    session = SessionTracker()
    inventory = InventoryManager()

    # Démarrer le log watcher en background
    watcher = LogWatcher(on_event=session.handle_event)
    watcher.start()
    log("Log watcher démarré en arrière-plan")

    # Lancer l'UI terminal
    ui = TerminalUI(session, inventory, item_db, config)
    try:
        ui.run()
    except KeyboardInterrupt:
        pass
    finally:
        watcher.stop()
        print("\n\033[92m  Session terminée. Données sauvegardées dans SQLite.\033[0m")
        log("Session terminée")


if __name__ == "__main__":
    main()
