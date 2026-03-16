#!/usr/bin/env python3
"""
WAKFU COMPANION v3.1.0
Dashboard web temps reel + Inventaire intelligent

Auteur  : Sam (architecture) + Claude Opus 4.6 (code)
Date    : 2026-03-16
Projet  : Autocode Orchestra / Wakfu Assistant

Sources :
- Ankama CDN : https://wakfu.cdn.ankama.com/gamedata/
- Vertylo/wakassets : https://github.com/Vertylo/wakassets
- Flask : https://flask.palletsprojects.com/
- SSE : https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events
"""

import os
import sys
import re
import json
import time
import sqlite3
import logging
import threading
import unicodedata
import urllib.request
from datetime import datetime, timedelta
from pathlib import Path
from collections import defaultdict
from flask import Flask, jsonify, request, Response

PROJECT_PATH = Path(r"H:\Code\Wakfuassistant")
WAKFU_LOG = Path(r"C:\Users\Smedj\AppData\Roaming\zaap\gamesLogs\wakfu\logs\wakfu.log")
DB_PATH = PROJECT_PATH / "data" / "wakfu_tracker.db"
CDN_ITEMS = PROJECT_PATH / "data" / "ankama_cdn" / "items.json"
CDN_JOBS_ITEMS = PROJECT_PATH / "data" / "ankama_cdn" / "jobsItems.json"
CDN_RESOURCES = PROJECT_PATH / "data" / "ankama_cdn" / "resources.json"
CDN_ITEM_TYPES = PROJECT_PATH / "data" / "ankama_cdn" / "itemTypes.json"
CONFIG_FILE = PROJECT_PATH / "data" / "config.json"
LOG_FILE = PROJECT_PATH / "logs" / "companion.log"
PARSE_EXISTING_LOG = True
WEB_PORT = 5000
REFRESH_INTERVAL = 2

LOG_FILE.parent.mkdir(parents=True, exist_ok=True)
DB_PATH.parent.mkdir(parents=True, exist_ok=True)
CONFIG_FILE.parent.mkdir(parents=True, exist_ok=True)

logger = logging.getLogger("wakfu_companion")
logger.setLevel(logging.DEBUG)
fh = logging.FileHandler(LOG_FILE, encoding="utf-8")
fh.setLevel(logging.DEBUG)
fh.setFormatter(logging.Formatter("%(asctime)s [%(levelname)s] %(message)s"))
logger.addHandler(fh)
logging.getLogger("werkzeug").setLevel(logging.WARNING)

logger.info("=" * 60)
logger.info("Wakfu Companion v3.1.0")
logger.info("=" * 60)


class Database:
    def __init__(self, path):
        self.conn = sqlite3.connect(str(path), check_same_thread=False)
        self.conn.execute("PRAGMA journal_mode=WAL")
        self.conn.execute("PRAGMA synchronous=NORMAL")
        self._lock = threading.Lock()
        self._create_tables()

    def _create_tables(self):
        with self._lock:
            self.conn.executescript("""
                CREATE TABLE IF NOT EXISTS sessions (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    started_at TEXT, ended_at TEXT, character TEXT, server TEXT);
                CREATE TABLE IF NOT EXISTS xp_events (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    session_id INTEGER, timestamp TEXT, metier TEXT,
                    xp_gained INTEGER, xp_to_next INTEGER, level_up INTEGER DEFAULT 0);
                CREATE TABLE IF NOT EXISTS kamas_events (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    session_id INTEGER, timestamp TEXT, amount INTEGER, source TEXT DEFAULT 'drop');
                CREATE TABLE IF NOT EXISTS drop_events (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    session_id INTEGER, timestamp TEXT, item_name TEXT, quantity INTEGER);
                CREATE TABLE IF NOT EXISTS loss_events (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    session_id INTEGER, timestamp TEXT, item_name TEXT, quantity INTEGER,
                    reason TEXT DEFAULT 'lost');
                CREATE TABLE IF NOT EXISTS use_events (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    session_id INTEGER, timestamp TEXT, item_name TEXT, quantity INTEGER DEFAULT 1);
                CREATE TABLE IF NOT EXISTS sale_events (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    session_id INTEGER, timestamp TEXT, item_name TEXT,
                    quantity INTEGER, total_kamas INTEGER);
                CREATE TABLE IF NOT EXISTS craft_events (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    session_id INTEGER, timestamp TEXT, recipe_name TEXT, success INTEGER DEFAULT 1);
                CREATE TABLE IF NOT EXISTS fight_events (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    session_id INTEGER, timestamp TEXT, fight_id TEXT);
                CREATE TABLE IF NOT EXISTS market_prices (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    item_name TEXT, unit_price REAL, quantity INTEGER,
                    total_price REAL, recorded_at TEXT, source TEXT DEFAULT 'hdv_sale');
                CREATE TABLE IF NOT EXISTS user_items (
                    item_name TEXT PRIMARY KEY,
                    manual_qty INTEGER DEFAULT 0, manual_price REAL DEFAULT 0,
                    craft_cost REAL DEFAULT 0, notes TEXT DEFAULT '', last_updated TEXT);
                CREATE TABLE IF NOT EXISTS hdv_offers (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    item_name TEXT NOT NULL,
                    offer_type TEXT NOT NULL,
                    unit_price REAL DEFAULT 0,
                    quantity INTEGER DEFAULT 0,
                    seller_name TEXT DEFAULT '',
                    gem_slots INTEGER DEFAULT 0,
                    sublimations TEXT DEFAULT '',
                    notes TEXT DEFAULT '',
                    source TEXT DEFAULT 'manual',
                    is_active INTEGER DEFAULT 1,
                    created_at TEXT,
                    updated_at TEXT
                );
                CREATE TABLE IF NOT EXISTS xp_curve_levels (
                    level INTEGER PRIMARY KEY,
                    xp_required REAL NOT NULL,
                    sample_count INTEGER DEFAULT 0,
                    updated_at TEXT,
                    source TEXT DEFAULT 'unknown'
                );
                CREATE TABLE IF NOT EXISTS metier_levels (
                    metier TEXT PRIMARY KEY,
                    current_level INTEGER DEFAULT 0,
                    current_xp INTEGER DEFAULT 0,
                    target_level INTEGER DEFAULT 0,
                    last_updated TEXT
                );
            """)
            self._ensure_user_items_columns()
            self.conn.commit()

    def _ensure_user_items_columns(self):
        cols = {row[1] for row in self.conn.execute("PRAGMA table_info(user_items)").fetchall()}
        required = {
            "manual_qty": "INTEGER DEFAULT 0",
            "manual_price": "REAL DEFAULT 0",
            "notes": "TEXT DEFAULT ''",
            "manual_label": "TEXT DEFAULT ''",
            "manual_icon_url": "TEXT DEFAULT ''",
            "last_updated": "TEXT",
        }
        for name, col_type in required.items():
            if name not in cols:
                self.conn.execute(f"ALTER TABLE user_items ADD COLUMN {name} {col_type}")

    def execute(self, sql, params=None):
        with self._lock:
            try:
                c = self.conn.cursor()
                c.execute(sql, params or ())
                self.conn.commit()
                return c
            except Exception as e:
                logger.error(f"DB error: {e}")
                return None

    def query(self, sql, params=None):
        with self._lock:
            try:
                c = self.conn.cursor()
                c.execute(sql, params or ())
                return c.fetchall()
            except Exception as e:
                logger.error(f"DB query error: {e}")
                return []

    def close(self):
        self.conn.close()


class UserConfig:
    DEFAULTS = {"character": "L'Immortel", "server": "Ogrest",
                "account": "Kairozadyk", "base_kamas": 0, "manual_kamas_delta": 0}

    def __init__(self, path):
        self.path = Path(path)
        self.data = dict(self.DEFAULTS)
        if self.path.exists():
            try:
                with open(self.path, "r", encoding="utf-8") as f:
                    self.data.update(json.load(f))
            except Exception:
                pass
        self.save()

    def save(self):
        with open(self.path, "w", encoding="utf-8") as f:
            json.dump(self.data, f, indent=2, ensure_ascii=False)

    def get(self, k, d=None):
        return self.data.get(k, d)

    def set(self, k, v):
        self.data[k] = v
        self.save()


class ItemDatabase:
    CDN_CONFIG_URL = "https://wakfu.cdn.ankama.com/gamedata/config.json"
    CDN_BASE_URL = "https://wakfu.cdn.ankama.com/gamedata/{version}"
    ICON_URLS = [
        "https://vertylo.github.io/wakassets/items/{gfx}.png",
        "https://s.ankama.com/www/static.ankama.com/wakfu/portal/game/item/115/{gfx}.png",
        "https://s.ankama.com/www/static.ankama.com/wakfu/portal/game/item/64/{gfx}.png",
    ]

    def __init__(self, items_path, jobs_path=None, resources_path=None, item_types_path=None):
        self.items = {}
        self.by_name = {}
        self.item_types = {}
        self._load_local(items_path, jobs_path, resources_path)
        self._load_item_types(item_types_path)
        self._load_from_cdn_if_possible()
        logger.info(f"ItemDB indexe: {len(self.by_name)} noms normalises")

    def _fetch_json(self, url, timeout=4):
        req = urllib.request.Request(url, headers={"User-Agent": "WakfuAssistant/1.0"})
        with urllib.request.urlopen(req, timeout=timeout) as resp:
            return json.loads(resp.read().decode("utf-8"))

    def _load_local(self, items_path, jobs_path=None, resources_path=None):
        self._load_entries_from_file(Path(items_path), kind="items")
        if jobs_path:
            self._load_entries_from_file(Path(jobs_path), kind="jobs")
        if resources_path:
            self._load_entries_from_file(Path(resources_path), kind="resources")

    def _cleanup_type_title(self, raw):
        txt = str(raw or "").strip()
        if not txt:
            return "Autres"
        txt = re.sub(r"\{[^}]*\}", "", txt)
        txt = re.sub(r"\s+", " ", txt).strip()
        return txt or "Autres"

    def _load_item_types(self, path):
        p = Path(path) if path else None
        if not p or not p.exists():
            return
        try:
            rows = json.loads(p.read_text(encoding="utf-8"))
            for row in rows or []:
                tid = row.get("definition", {}).get("id")
                if tid is None:
                    continue
                label = row.get("title", {}).get("fr") or row.get("title", {}).get("en") or "Autres"
                self.item_types[int(tid)] = self._cleanup_type_title(label)
            logger.info(f"ItemDB local: itemTypes charges ({len(self.item_types)})")
        except Exception as e:
            logger.warning(f"ItemDB itemTypes {p}: {e}")

    def _load_entries_from_file(self, path, kind):
        if not path or not path.exists():
            return
        try:
            with open(path, "r", encoding="utf-8") as f:
                raw = json.load(f)
            self._index_entries(raw, kind)
            logger.info(f"ItemDB local: {kind} charge depuis {path.name}")
        except Exception as e:
            logger.warning(f"ItemDB local {path}: {e}")

    def _load_from_cdn_if_possible(self):
        try:
            cfg = self._fetch_json(self.CDN_CONFIG_URL)
            version = cfg.get("version", "").strip()
            if not version:
                return
            base = self.CDN_BASE_URL.format(version=version)
            items = self._fetch_json(f"{base}/items.json")
            jobs = self._fetch_json(f"{base}/jobsItems.json")
            resources = self._fetch_json(f"{base}/resources.json")

            # Le CDN dynamique est la source de verite quand disponible.
            self.items = {}
            self.by_name = {}
            self._index_entries(items, kind="items")
            self._index_entries(jobs, kind="jobs")
            self._index_entries(resources, kind="resources")
            logger.info(f"ItemDB CDN: version={version} chargee")
        except Exception as e:
            logger.warning(f"ItemDB CDN indisponible, fallback local: {e}")

    def _index_entries(self, entries, kind):
        for entry in entries or []:
            if kind == "resources":
                self._index_resource(entry)
            else:
                self._index_item_like(entry)

    def _index_item_like(self, entry):
        item_def = entry.get("definition", {}).get("item")
        if not item_def:
            item_def = entry.get("definition", {})
        iid = item_def.get("id")
        if iid:
            self.items[iid] = entry

        for lang in ("fr", "en", "es", "pt"):
            n = entry.get("title", {}).get(lang, "")
            if not n:
                continue
            nk = normalize_name(n)
            if not nk:
                continue
            prev = self.by_name.get(nk)
            if not prev:
                self.by_name[nk] = entry
                continue
            prev_level = self._entry_level(prev)
            this_level = self._entry_level(entry)
            if this_level >= prev_level:
                self.by_name[nk] = entry

    def _index_resource(self, entry):
        rid = entry.get("definition", {}).get("id")
        if rid:
            self.items[rid] = entry
        for lang in ("fr", "en", "es", "pt"):
            n = entry.get("title", {}).get(lang, "")
            nk = normalize_name(n)
            if nk:
                self.by_name[nk] = entry

    def _entry_level(self, entry):
        d = entry.get("definition", {})
        if "item" in d:
            return d.get("item", {}).get("level", 0)
        return d.get("level", 0)

    def _entry_gfx_id(self, entry):
        d = entry.get("definition", {})
        if "item" in d:
            return d.get("item", {}).get("graphicParameters", {}).get("gfxId")
        if "graphicParameters" in d:
            return d.get("graphicParameters", {}).get("gfxId")
        return d.get("iconGfxId")

    def _entry_item_type_id(self, entry):
        d = entry.get("definition", {})
        if "item" in d:
            return d.get("item", {}).get("baseParameters", {}).get("itemTypeId")
        return d.get("itemTypeId")

    def find(self, name):
        k = normalize_name(name)
        if not k:
            return None
        if k in self.by_name:
            return self.by_name[k]
        # Fallback prudent: startswith seulement, jamais "contains" arbitraire.
        starts = [v for key, v in self.by_name.items() if key.startswith(k)]
        if len(starts) == 1:
            return starts[0]
        return None

    def search(self, q, limit=20):
        q = normalize_name(q)
        return [v for k, v in self.by_name.items() if q and q in k][:limit]

    def get_icon_candidates(self, name):
        item = self.find(name)
        if not item:
            return []
        gfx_id = self._entry_gfx_id(item)
        if not gfx_id or int(gfx_id) < 0:
            return []
        out = []
        for tpl in self.ICON_URLS:
            out.append(tpl.format(gfx=gfx_id))
        return out

    def category_for_name(self, name):
        entry = self.find(name)
        if not entry:
            return "Autres"
        tid = self._entry_item_type_id(entry)
        if tid is None:
            return "Autres"
        return self.item_types.get(int(tid), f"Type {int(tid)}")

    def icon_library(self, query="", limit=120):
        q = normalize_name(query)
        out = []
        seen = set()
        for key, entry in self.by_name.items():
            if q and q not in key:
                continue
            if key in seen:
                continue
            gfx_id = self._entry_gfx_id(entry)
            if not gfx_id or int(gfx_id) < 0:
                continue
            title = entry.get("title", {}).get("fr") or entry.get("title", {}).get("en") or key
            out.append({
                "name": title,
                "gfx_id": int(gfx_id),
                "icons": [tpl.format(gfx=gfx_id) for tpl in self.ICON_URLS],
            })
            seen.add(key)
            if len(out) >= int(limit):
                break
        out.sort(key=lambda x: (x.get("name") or "").lower())
        return out


RE_TIMESTAMP = re.compile(r"(\d{2}:\d{2}:\d{2}),\d{3}")
RE_XP = re.compile(
    r"\[Information \(jeu\)\]\s+"
    r"(.+?)\s*:\s*\+(\d[\d\s]*)\s*points?\s*d['\u2019]XP\.\s+"
    r"Prochain niveau dans\s*:\s*(\d[\d\s]*)\.")
RE_LEVEL_UP = re.compile(
    r"\[Information \(jeu\)\]\s+"
    r"(.+?)\s*:\s*\+(\d[\d\s]*)\s*points?\s*d['\u2019]XP\.\s+\+1\s*niveau")
RE_KAMAS = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez gagn\S?\s+(\d[\d\s]*)\s*kamas")
RE_DROP = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez ramass\S+\s+(\d[\d\s]*)x\s+(.+?)\s*\.")
RE_LOSS = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez perdu\s+(\d[\d\s]*)x\s+(.+?)\s*\.")
RE_USE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous venez d['\u2019]utiliser\s*:\s*(.+?)\s*$")
RE_SALE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous venez de vendre\s+(\d[\d\s]*)x\s+(.+?)\s{1,4}pour un prix total de\s+(\d[\d\s]*)\s*\u00a7")
RE_CRAFT = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez r\S+ussi votre recette de\s+(.+?)\s*\.\s*$")
RE_FIGHT = re.compile(r"\[FIGHT\]\s*End fight with id\s+(\d+)")
RE_FIGHT_START = re.compile(r"\[FIGHT\]\s*Start fight with id\s+(\d+)", re.IGNORECASE)
RE_FIGHT_TURN = re.compile(r"\[FIGHT\].*?(?:turn|tour)\s*[:#]?\s*(\d+)", re.IGNORECASE)
RE_DAMAGE_SKILL = re.compile(
    r"\[Information \(jeu\)\]\s+Vous infligez\s+(\d[\d\s]*)\s+(?:de\s+)?(?:dommages?|degats?).*?(?:avec|via)\s+(.+?)(?:\.|$)",
    re.IGNORECASE,
)
RE_DAMAGE_GENERIC = re.compile(
    r"\[Information \(jeu\)\]\s+Vous infligez\s+(\d[\d\s]*)\s+(?:de\s+)?(?:dommages?|degats?)",
    re.IGNORECASE,
)
RE_PLANT_FAIL = re.compile(
    r"\[Information \(jeu\)\]\s+Conditions d['\u2019]utilisation non respect")


def pnum(raw):
    cleaned = ""
    for ch in str(raw):
        if ch.isdigit():
            cleaned += ch
    if not cleaned:
        return 0
    return int(cleaned)


def normalize_name(text):
    text = str(text or "").strip().lower()
    if not text:
        return ""
    text = unicodedata.normalize("NFKD", text)
    text = "".join(ch for ch in text if not unicodedata.combining(ch))
    text = re.sub(r"[^a-z0-9]+", " ", text)
    return " ".join(text.split())

class XPCurve:
    """Courbe XP des metiers Wakfu.
    
    Sources :
    - wakfu.wiki.gg/wiki/Professions : formule 150*level + 75 par niveau
    - wakfu.fandom.com/wiki/Professions : formule 100*(current+next) par niveau
    
    On utilise la formule wiki.gg (plus recente) : XP pour passer du level L au L+1 = 150*L + 75
    XP total pour atteindre level L = 75 * L^2
    """
    
    @staticmethod
    def xp_for_level(level, learned_curve=None):
        """XP necessaire pour passer de level a level+1."""
        if learned_curve and int(level) in learned_curve:
            return max(1, int(round(learned_curve[int(level)])))
        return 150 * level + 75
    
    @staticmethod
    def total_xp_to_level(level):
        """XP cumule total pour atteindre level (depuis 0)."""
        return 75 * level * level
    
    @staticmethod
    def xp_from_to(current_level, target_level, learned_curve=None):
        """XP necessaire pour aller de current_level a target_level."""
        if target_level <= current_level:
            return 0
        total = 0
        for lvl in range(int(current_level), int(target_level)):
            total += XPCurve.xp_for_level(lvl, learned_curve)
        return total
    
    @staticmethod
    def level_from_total_xp(total_xp):
        """Calcule le niveau atteint avec un total XP donne."""
        import math
        if total_xp <= 0:
            return 0
        return int(math.sqrt(total_xp / 75))
    
    @staticmethod
    def progress_in_level(current_level, xp_into_level, learned_curve=None):
        """Pourcentage de progression dans le niveau actuel."""
        needed = XPCurve.xp_for_level(current_level, learned_curve)
        if needed <= 0:
            return 0
        return min(100, (xp_into_level / needed) * 100)
    
    @staticmethod
    def eta_to_target(current_level, xp_remaining_this_level, target_level, xp_per_hour, learned_curve=None):
        """Temps estime (en secondes) pour atteindre target_level."""
        if xp_per_hour <= 0 or target_level <= current_level:
            return 0
        # XP restant dans le niveau actuel
        xp_needed = xp_remaining_this_level
        # XP pour les niveaux suivants
        if target_level > current_level + 1:
            xp_needed += XPCurve.xp_from_to(current_level + 1, target_level, learned_curve)
        return (xp_needed / xp_per_hour) * 3600




class SmartInventory:
    def __init__(self, db):
        self.db = db
        self._inv = defaultdict(int)
        self._prices = {}
        self._manual_price_items = set()
        self._manual_qty = defaultdict(int)
        self._notes = {}
        self._manual_label = {}
        self._manual_icon_url = {}
        self._total_drops = defaultdict(int)
        self._total_losses = defaultdict(int)
        self._total_uses = defaultdict(int)
        self._total_sales = defaultdict(int)
        self._total_crafts = defaultdict(int)
        self._sale_kamas = defaultdict(int)
        self.lock = threading.Lock()
        rows = db.query("SELECT item_name, manual_qty, manual_price, notes, manual_label, manual_icon_url FROM user_items")
        for name, manual_qty, price, notes, manual_label, manual_icon_url in rows:
            if price and price > 0:
                self._prices[name] = price
                self._manual_price_items.add(name)
            if manual_qty:
                self._manual_qty[name] = int(manual_qty)
            if notes:
                self._notes[name] = notes
            if manual_label:
                self._manual_label[name] = manual_label
            if manual_icon_url:
                self._manual_icon_url[name] = manual_icon_url

    def add_drop(self, item, qty, ts):
        with self.lock:
            self._inv[item] += qty
            self._total_drops[item] += qty

    def add_loss(self, item, qty, ts):
        with self.lock:
            self._inv[item] -= qty
            self._total_losses[item] += qty

    def add_use(self, item, ts):
        with self.lock:
            self._inv[item] -= 1
            self._total_uses[item] += 1

    def add_sale(self, item, qty, total, ts):
        with self.lock:
            self._inv[item] -= qty
            self._total_sales[item] += qty
            self._sale_kamas[item] += total
            if qty > 0:
                self._prices[item] = total / qty
        self.db.execute(
            "INSERT INTO market_prices (item_name, unit_price, quantity, total_price, recorded_at, source) VALUES (?,?,?,?,?,?)",
            (item, total / max(qty, 1), qty, total, ts, "hdv_sale"))

    def add_craft(self, recipe, ts):
        with self.lock:
            self._inv[recipe] += 1
            self._total_crafts[recipe] += 1

    def set_manual_price(self, item, price):
        with self.lock:
            self._prices[item] = price
            if price > 0:
                self._manual_price_items.add(item)
            elif item in self._manual_price_items:
                self._manual_price_items.discard(item)
        self.db.execute(
            """
            INSERT INTO user_items (item_name, manual_price, last_updated)
            VALUES (?,?,?)
            ON CONFLICT(item_name) DO UPDATE SET
                manual_price=excluded.manual_price,
                last_updated=excluded.last_updated
            """,
            (item, price, datetime.now().isoformat()),
        )

    def set_item_meta(self, item, manual_qty=None, notes=None, manual_label=None, manual_icon_url=None):
        with self.lock:
            cur_qty = self._manual_qty.get(item, 0)
            cur_notes = self._notes.get(item, "")
            cur_label = self._manual_label.get(item, "")
            cur_icon = self._manual_icon_url.get(item, "")

            if manual_qty is not None:
                self._manual_qty[item] = int(manual_qty)
                cur_qty = self._manual_qty[item]
            if notes is not None:
                if notes:
                    self._notes[item] = notes
                    cur_notes = notes
                elif item in self._notes:
                    self._notes.pop(item, None)
                    cur_notes = ""
            if manual_label is not None:
                if manual_label:
                    self._manual_label[item] = manual_label
                    cur_label = manual_label
                elif item in self._manual_label:
                    self._manual_label.pop(item, None)
                    cur_label = ""
            if manual_icon_url is not None:
                if manual_icon_url:
                    self._manual_icon_url[item] = manual_icon_url
                    cur_icon = manual_icon_url
                elif item in self._manual_icon_url:
                    self._manual_icon_url.pop(item, None)
                    cur_icon = ""

        self.db.execute(
            """
            INSERT INTO user_items (item_name, manual_qty, notes, manual_label, manual_icon_url, last_updated)
            VALUES (?,?,?,?,?,?)
            ON CONFLICT(item_name) DO UPDATE SET
                manual_qty=excluded.manual_qty,
                notes=excluded.notes,
                manual_label=excluded.manual_label,
                manual_icon_url=excluded.manual_icon_url,
                last_updated=excluded.last_updated
            """,
            (
                item,
                int(cur_qty),
                cur_notes,
                cur_label,
                cur_icon,
                datetime.now().isoformat(),
            ),
        )

    def get_snapshot(self):
        with self.lock:
            all_items = set(self._inv.keys()) | set(self._manual_qty.keys()) | set(self._notes.keys()) | set(self._manual_label.keys()) | set(self._manual_icon_url.keys())
            items = {}
            corrected = {}
            for item in all_items:
                items[item] = self._inv.get(item, 0) + self._manual_qty.get(item, 0)
                corrected[item] = bool(
                    self._manual_qty.get(item, 0)
                    or self._notes.get(item, "")
                    or self._manual_label.get(item, "")
                    or self._manual_icon_url.get(item, "")
                    or (item in self._manual_price_items)
                )
            return {
                "items": items,
                "auto_items": dict(self._inv),
                "manual_qty": dict(self._manual_qty),
                "notes": dict(self._notes),
                "manual_label": dict(self._manual_label),
                "manual_icon_url": dict(self._manual_icon_url),
                "manual_price_items": list(self._manual_price_items),
                "corrected": corrected,
                "drops": dict(self._total_drops),
                "losses": dict(self._total_losses),
                "uses": dict(self._total_uses),
                "sales": dict(self._total_sales),
                "crafts": dict(self._total_crafts),
                "prices": dict(self._prices),
                "sale_kamas": dict(self._sale_kamas),
            }

    def get_estimated_value(self):
        with self.lock:
            total = 0
            all_items = set(self._inv.keys()) | set(self._manual_qty.keys())
            for item in all_items:
                qty = self._inv.get(item, 0) + self._manual_qty.get(item, 0)
                if qty > 0:
                    total += int(qty * self._prices.get(item, 0))
            return total


class Session:
    def __init__(self, db, inventory):
        self.db = db
        self.inventory = inventory
        self.start_time = datetime.now()
        self.lock = threading.Lock()
        self.xp_by_metier = defaultdict(int)
        self.xp_to_next = {}
        self.level_ups = []
        self._level_up_keys = set()
        self.kamas_gained = 0
        self.kamas_from_sales = 0
        self.fights = 0
        self._current_fight_id = "session"
        self._current_turn = 1
        self._combat_stats = {}
        self.crafts_success = 0
        self.plant_fails = 0
        self.recent_events = []
        cur = db.execute("INSERT INTO sessions (started_at, character, server) VALUES (?,?,?)",
                         (self.start_time.isoformat(), "L'Immortel", "Ogrest"))
        self.session_id = cur.lastrowid if cur else 0

    def _curve_map(self):
        rows = self.db.query("SELECT level, xp_required, sample_count FROM xp_curve_levels")
        values = {}
        samples = {}
        for lvl, xp_req, count in rows:
            ilvl = int(lvl or 0)
            if ilvl < 0:
                continue
            values[ilvl] = float(xp_req or 0)
            samples[ilvl] = int(count or 0)
        return values, samples

    def learn_curve_level(self, level, xp_required, source="manual"):
        lvl = int(level or 0)
        xp_req = int(xp_required or 0)
        if lvl < 0 or xp_req <= 0:
            return
        now = datetime.now().isoformat()
        row = self.db.query("SELECT xp_required, sample_count FROM xp_curve_levels WHERE level=?", (lvl,))
        if row:
            prev_xp, prev_count = row[0]
            prev_xp = float(prev_xp or 0)
            prev_count = int(prev_count or 0)
            if prev_count <= 0 or prev_xp <= 0:
                new_xp = float(xp_req)
                new_count = 1
            else:
                new_count = prev_count + 1
                new_xp = ((prev_xp * prev_count) + xp_req) / new_count
            self.db.execute(
                "UPDATE xp_curve_levels SET xp_required=?, sample_count=?, updated_at=?, source=? WHERE level=?",
                (new_xp, new_count, now, source, lvl),
            )
        else:
            self.db.execute(
                "INSERT INTO xp_curve_levels (level, xp_required, sample_count, updated_at, source) VALUES (?,?,?,?,?)",
                (lvl, float(xp_req), 1, now, source),
            )

    def _evt(self, icon, text, ts):
        with self.lock:
            self.recent_events.append({"ts": ts, "icon": icon, "text": text})
            if len(self.recent_events) > 50:
                self.recent_events.pop(0)

    def _ensure_combat(self, fid):
        k = str(fid or "session")
        if k not in self._combat_stats:
            self._combat_stats[k] = {
                "fight_id": k,
                "started_at": "",
                "ended_at": "",
                "total_damage": 0,
                "turns": {},
            }
        return self._combat_stats[k]

    def handle_xp(self, ts, metier, xp, xp_next, leveled):
        with self.lock:
            self.xp_by_metier[metier] += xp
            if xp_next > 0:
                self.xp_to_next[metier] = xp_next
            if leveled:
                lvl_key = f"{metier}|{ts}"
                if lvl_key not in self._level_up_keys:
                    self._level_up_keys.add(lvl_key)
                    self.level_ups.append({"ts": ts, "metier": metier})
        self.db.execute(
            "INSERT INTO xp_events (session_id,timestamp,metier,xp_gained,xp_to_next,level_up) VALUES (?,?,?,?,?,?)",
            (self.session_id, ts, metier, xp, xp_next, 1 if leveled else 0))
        lbl = " LEVEL UP!" if leveled else ""
        self._evt("LVL" if leveled else "XP", f"+{xp:,} XP {metier}{lbl}", ts)

    def handle_kamas(self, ts, amount):
        with self.lock:
            self.kamas_gained += amount
        self.db.execute("INSERT INTO kamas_events (session_id,timestamp,amount,source) VALUES (?,?,?,?)",
                        (self.session_id, ts, amount, "drop"))
        self._evt("$", f"+{amount:,} kamas", ts)

    def handle_drop(self, ts, item, qty):
        self.inventory.add_drop(item, qty, ts)
        self.db.execute("INSERT INTO drop_events (session_id,timestamp,item_name,quantity) VALUES (?,?,?,?)",
                        (self.session_id, ts, item, qty))
        self._evt("+", f"+{qty}x {item}", ts)

    def handle_loss(self, ts, item, qty):
        self.inventory.add_loss(item, qty, ts)
        self.db.execute("INSERT INTO loss_events (session_id,timestamp,item_name,quantity,reason) VALUES (?,?,?,?,?)",
                        (self.session_id, ts, item, qty, "lost"))
        self._evt("-", f"-{qty}x {item}", ts)

    def handle_use(self, ts, item):
        self.inventory.add_use(item, ts)
        self.db.execute("INSERT INTO use_events (session_id,timestamp,item_name,quantity) VALUES (?,?,?,?)",
                        (self.session_id, ts, item, 1))
        self._evt("USE", f"Utilise: {item}", ts)

    def handle_sale(self, ts, item, qty, total):
        self.inventory.add_sale(item, qty, total, ts)
        with self.lock:
            self.kamas_from_sales += total
        self.db.execute("INSERT INTO sale_events (session_id,timestamp,item_name,quantity,total_kamas) VALUES (?,?,?,?,?)",
                        (self.session_id, ts, item, qty, total))
        unit = total // max(qty, 1)
        self._evt("HDV", f"Vendu {qty}x {item} = {total:,} kamas ({unit:,}/u)", ts)

    def handle_craft(self, ts, recipe):
        self.inventory.add_craft(recipe, ts)
        with self.lock:
            self.crafts_success += 1
        self.db.execute("INSERT INTO craft_events (session_id,timestamp,recipe_name,success) VALUES (?,?,?,?)",
                        (self.session_id, ts, recipe, 1))
        self._evt("CRF", f"Craft: {recipe}", ts)

    def handle_fight(self, ts, fid):
        with self.lock:
            self.fights += 1
            combat = self._ensure_combat(fid)
            if not combat["started_at"]:
                combat["started_at"] = ts
            combat["ended_at"] = ts
            self._current_fight_id = str(fid)
            self._current_turn = 1
        self.db.execute("INSERT INTO fight_events (session_id,timestamp,fight_id) VALUES (?,?,?)",
                        (self.session_id, ts, fid))
        self._evt("FGT", f"Combat #{fid}", ts)

    def handle_fight_start(self, ts, fid):
        with self.lock:
            self._current_fight_id = str(fid)
            self._current_turn = 1
            combat = self._ensure_combat(fid)
            if not combat["started_at"]:
                combat["started_at"] = ts

    def handle_fight_turn(self, ts, turn):
        with self.lock:
            self._current_turn = max(1, int(turn or 1))
            combat = self._ensure_combat(self._current_fight_id)
            tk = str(self._current_turn)
            if tk not in combat["turns"]:
                combat["turns"][tk] = {"turn": self._current_turn, "total_damage": 0, "skills": {}}

    def handle_damage(self, ts, amount, skill="(non precise)", turn=None):
        dmg = int(amount or 0)
        if dmg <= 0:
            return
        with self.lock:
            if turn is not None:
                self._current_turn = max(1, int(turn or 1))
            fight_id = self._current_fight_id or "session"
            combat = self._ensure_combat(fight_id)
            tk = str(self._current_turn)
            if tk not in combat["turns"]:
                combat["turns"][tk] = {"turn": self._current_turn, "total_damage": 0, "skills": {}}
            turn_data = combat["turns"][tk]
            turn_data["total_damage"] += dmg
            skill_key = str(skill or "(non precise)").strip() or "(non precise)"
            turn_data["skills"][skill_key] = int(turn_data["skills"].get(skill_key, 0)) + dmg
            combat["total_damage"] += dmg

    def handle_plant_fail(self, ts):
        with self.lock:
            self.plant_fails += 1
        self._evt("!", "Plantation echouee", ts)

    def snapshot(self):
        with self.lock:
            elapsed = (datetime.now() - self.start_time).total_seconds()
            h = max(elapsed / 3600, 0.001)
            xp_total = sum(self.xp_by_metier.values())
            metiers = {}
            curve_values, curve_samples = self._curve_map()
            lvl_rows = self.db.query("SELECT metier, current_level, current_xp, target_level FROM metier_levels")
            lvl_by_metier = {r[0]: (r[1], r[2], r[3]) for r in lvl_rows}
            all_metiers = set(self.xp_by_metier.keys()) | set(lvl_by_metier.keys())

            for m in sorted(all_metiers):
                xp = self.xp_by_metier.get(m, 0)
                xp_h = int(xp / h)
                xp_next = self.xp_to_next.get(m, 0)
                eta_s = (xp_next / xp_h * 3600) if xp_h > 0 and xp_next > 0 else 0
                pct = min(99, max(0, (1 - xp_next / (xp_next + xp)) * 100)) if xp_next > 0 else 0
                base_level, base_xp_input, target_lvl = lvl_by_metier.get(m, (0, 0, 0))
                manual_truth = m in lvl_by_metier
                lvl_ups_count = len([lu for lu in self.level_ups if lu["metier"] == m])
                real_level = base_level if manual_truth else base_level + lvl_ups_count

                xp_for_this_lvl = XPCurve.xp_for_level(real_level, curve_values)
                xp_into_level = max(0, xp_for_this_lvl - xp_next) if xp_next > 0 else max(0, min(xp_for_this_lvl, base_xp_input))
                pct_level = XPCurve.progress_in_level(real_level, xp_into_level, curve_values) if xp_next > 0 else pct

                eta_target = 0
                if target_lvl > real_level and xp_h > 0:
                        eta_target = XPCurve.eta_to_target(real_level, xp_next, target_lvl, xp_h, curve_values)

                xp_to_target = XPCurve.xp_from_to(real_level, target_lvl, curve_values) if target_lvl > real_level else 0
                curve_source = "learned" if int(real_level) in curve_values else "formula"
                curve_sample_count = int(curve_samples.get(int(real_level), 0))

                metiers[m] = {
                        "xp": xp, "xp_h": xp_h, "xp_next": xp_next, "eta_s": eta_s, "pct": pct,
                        "level": real_level, "base_level": base_level, "target_level": target_lvl,
                    "base_xp": int(base_xp_input or 0),
                        "pct_level": round(pct_level, 1),
                        "xp_for_this_lvl": xp_for_this_lvl,
                        "xp_into_level": xp_into_level,
                        "eta_target": eta_target,
                        "xp_to_target": xp_to_target,
                        "curve_source": curve_source,
                        "curve_sample_count": curve_sample_count,
                        "level_ups_session": lvl_ups_count,
                        "manual_truth": manual_truth,
                    }
            combats = []
            for fid, raw in self._combat_stats.items():
                turns = []
                for tk, tr in raw["turns"].items():
                    skills = [{"name": sk, "damage": int(sd)} for sk, sd in tr["skills"].items()]
                    skills.sort(key=lambda x: x["damage"], reverse=True)
                    turns.append({
                        "turn": int(tr["turn"]),
                        "total_damage": int(tr["total_damage"]),
                        "skills": skills,
                    })
                turns.sort(key=lambda x: x["turn"])
                combats.append({
                    "fight_id": raw["fight_id"],
                    "started_at": raw["started_at"],
                    "ended_at": raw["ended_at"],
                    "total_damage": int(raw["total_damage"]),
                    "turns": turns,
                })
            combats.sort(key=lambda x: x["fight_id"], reverse=True)
            return {
                "elapsed": int(elapsed),
                "elapsed_str": str(timedelta(seconds=int(elapsed))),
                "xp_total": xp_total,
                "xp_per_hour": int(xp_total / h),
                "metiers": metiers,
                "level_ups": list(self.level_ups),
                "kamas_gained": self.kamas_gained,
                "kamas_from_sales": self.kamas_from_sales,
                "kamas_per_hour": int(self.kamas_gained / h),
                "fights": self.fights,
                "crafts": self.crafts_success,
                "plant_fails": self.plant_fails,
                "combats": combats,
                "curve_levels": {str(int(k)): int(round(v)) for k, v in curve_values.items()},
                "curve_samples": {str(int(k)): int(v) for k, v in curve_samples.items()},
                "recent_events": list(self.recent_events[-20:]),
            }


class LogWatcher:
    def __init__(self, log_path, session, parse_existing=False):
        self.log_path = Path(log_path)
        self.session = session
        self.parse_existing = parse_existing
        self._stop = threading.Event()
        self._position = 0
        self.lines_parsed = 0
        self.events_detected = 0
        self.unmatched_lines = 0
        self.unmatched_samples = []

    def start(self):
        t = threading.Thread(target=self._loop, daemon=True, name="LogWatcher")
        t.start()

    def stop(self):
        self._stop.set()

    def _loop(self):
        if self.log_path.exists():
            if self.parse_existing:
                logger.info("Rattrapage du log existant...")
                with open(self.log_path, "r", encoding="utf-8", errors="replace") as f:
                    for line in f:
                        self.lines_parsed += 1
                        self._parse(line.strip())
                    self._position = f.tell()
                logger.info(f"Rattrapage: {self.lines_parsed} lignes, {self.events_detected} events")
            else:
                self._position = self.log_path.stat().st_size

        while not self._stop.is_set():
            try:
                if not self.log_path.exists():
                    time.sleep(1)
                    continue
                sz = self.log_path.stat().st_size
                if sz < self._position:
                    self._position = 0
                if sz > self._position:
                    with open(self.log_path, "r", encoding="utf-8", errors="replace") as f:
                        f.seek(self._position)
                        for line in f:
                            self.lines_parsed += 1
                            self._parse(line.strip())
                        self._position = f.tell()
            except Exception as e:
                logger.error(f"Watcher: {e}")
            time.sleep(0.5)

    def _parse(self, line):
        try:
            self._parse_inner(line)
        except Exception as e:
            logger.error(f"Parse error: {line[:80]} | {e}")

    def _mark_unmatched(self, line):
        self.unmatched_lines += 1
        if len(self.unmatched_samples) < 20:
            self.unmatched_samples.append(line[:180])

    def _parse_inner(self, line):
        if not line:
            return
        if "[Information (jeu)]" not in line and "[FIGHT]" not in line:
            return
        ts_m = RE_TIMESTAMP.search(line)
        ts = ts_m.group(1) if ts_m else datetime.now().strftime("%H:%M:%S")

        m = RE_FIGHT_START.search(line)
        if m:
            self.session.handle_fight_start(ts, m.group(1))
            return
        m = RE_FIGHT_TURN.search(line)
        if m:
            self.session.handle_fight_turn(ts, pnum(m.group(1)))
            return
        m = RE_DAMAGE_SKILL.search(line)
        if m:
            self.session.handle_damage(ts, pnum(m.group(1)), m.group(2).strip())
            self.events_detected += 1
            return
        m = RE_DAMAGE_GENERIC.search(line)
        if m:
            self.session.handle_damage(ts, pnum(m.group(1)), "(non precise)")
            self.events_detected += 1
            return

        m = RE_LEVEL_UP.search(line)
        if m:
            self.session.handle_xp(ts, m.group(1).strip(), pnum(m.group(2)), 0, True)
            self.events_detected += 1
            return
        m = RE_XP.search(line)
        if m:
            self.session.handle_xp(ts, m.group(1).strip(), pnum(m.group(2)), pnum(m.group(3)), False)
            self.events_detected += 1
            return
        m = RE_SALE.search(line)
        if m:
            self.session.handle_sale(ts, m.group(2).strip(), pnum(m.group(1)), pnum(m.group(3)))
            self.events_detected += 1
            return
        m = RE_KAMAS.search(line)
        if m:
            self.session.handle_kamas(ts, pnum(m.group(1)))
            self.events_detected += 1
            return
        m = RE_DROP.search(line)
        if m:
            self.session.handle_drop(ts, m.group(2).strip(), pnum(m.group(1)))
            self.events_detected += 1
            return
        m = RE_LOSS.search(line)
        if m:
            self.session.handle_loss(ts, m.group(2).strip(), pnum(m.group(1)))
            self.events_detected += 1
            return
        m = RE_USE.search(line)
        if m:
            self.session.handle_use(ts, m.group(1).strip())
            self.events_detected += 1
            return
        m = RE_CRAFT.search(line)
        if m:
            self.session.handle_craft(ts, m.group(1).strip())
            self.events_detected += 1
            return
        m = RE_FIGHT.search(line)
        if m:
            self.session.handle_fight(ts, m.group(1))
            self.events_detected += 1
            return
        m = RE_PLANT_FAIL.search(line)
        if m:
            self.session.handle_plant_fail(ts)
            self.events_detected += 1
            return
        self._mark_unmatched(line)

    def diagnostics(self):
        return {
            "lines": self.lines_parsed,
            "events": self.events_detected,
            "unmatched": self.unmatched_lines,
            "samples": list(self.unmatched_samples[-8:]),
        }


# ══════════════════════════════════════════════════════════════════
# FLASK APP + HTML TEMPLATE
# ══════════════════════════════════════════════════════════════════

flask_app = Flask(__name__)
flask_app.config["SEND_FILE_MAX_AGE_DEFAULT"] = 0

db = None
config = None
item_db = None
inventory = None
session = None
watcher = None


def get_html():
    """Genere le HTML complet. Pas de triple-quote avec du JS dedans."""
    css = """
:root {
    --bg: #0d1117; --bg2: #161b22; --bg3: #21262d;
    --border: #30363d; --text: #c9d1d9; --text2: #8b949e;
    --cyan: #58a6ff; --green: #3fb950; --red: #f85149;
    --yellow: #d29922; --purple: #bc8cff; --blue: #58a6ff;
}
* { margin: 0; padding: 0; box-sizing: border-box; }
body { background: var(--bg); color: var(--text); font-family: "Segoe UI", sans-serif; font-size: 14px; }
.header { background: var(--bg2); border-bottom: 1px solid var(--border); padding: 12px 24px; display: flex; align-items: center; gap: 20px; position: sticky; top: 0; z-index: 100; }
.header h1 { color: var(--cyan); font-size: 18px; white-space: nowrap; }
.header .stats { display: flex; gap: 16px; flex-wrap: wrap; font-size: 13px; }
.header .stat { padding: 4px 10px; background: var(--bg3); border-radius: 6px; }
.stat .label { color: var(--text2); }
.stat .value { font-weight: 600; }
.stat .green { color: var(--green); }
.stat .yellow { color: var(--yellow); }
.stat .red { color: var(--red); }
.stat .cyan { color: var(--cyan); }
.tabs { display: flex; gap: 0; background: var(--bg2); border-bottom: 1px solid var(--border); padding: 0 24px; }
.tab { padding: 10px 20px; cursor: pointer; color: var(--text2); border-bottom: 2px solid transparent; font-size: 13px; font-weight: 500; transition: all 0.2s; }
.tab:hover { color: var(--text); }
.tab.active { color: var(--cyan); border-bottom-color: var(--cyan); }
.content { padding: 20px 24px; }
table { width: 100%; border-collapse: collapse; font-size: 13px; }
th { text-align: left; padding: 8px 12px; color: var(--text2); font-weight: 600; border-bottom: 1px solid var(--border); position: sticky; top: 90px; background: var(--bg); cursor: pointer; user-select: none; }
th:hover { color: var(--cyan); }
td { padding: 6px 12px; border-bottom: 1px solid var(--bg3); }
tr:hover td { background: var(--bg2); }
.num { text-align: right; font-variant-numeric: tabular-nums; }
.pos { color: var(--green); }
.neg { color: var(--red); }
.dim { color: var(--text2); }
.bold { font-weight: 700; }
.item-icon { width: 24px; height: 24px; border-radius: 4px; vertical-align: middle; margin-right: 6px; }
.item-name { display: inline-flex; align-items: center; max-width: 420px; overflow: hidden; text-overflow: ellipsis; white-space: nowrap; }
.editable { background: transparent; border: 1px solid transparent; color: var(--text); padding: 2px 6px; border-radius: 4px; width: 80px; text-align: right; font-size: 13px; }
.editable:hover { border-color: var(--border); }
.editable:focus { border-color: var(--cyan); outline: none; background: var(--bg3); }
.editable.text { width: 190px; text-align: left; }
.tiny-note { color: var(--text2); font-size: 11px; margin-top: 2px; }
.ctx-menu {
    position: fixed;
    z-index: 9999;
    min-width: 260px;
    background: var(--bg2);
    border: 1px solid var(--border);
    border-radius: 8px;
    box-shadow: 0 12px 28px rgba(0,0,0,0.45);
    display: none;
    padding: 6px;
}
.ctx-title {
    padding: 8px 10px;
    color: var(--text2);
    font-size: 12px;
    border-bottom: 1px solid var(--bg3);
    margin-bottom: 4px;
}
.ctx-item {
    display: block;
    width: 100%;
    text-align: left;
    background: transparent;
    border: 0;
    color: var(--text);
    padding: 8px 10px;
    border-radius: 6px;
    cursor: pointer;
}
.ctx-item:hover { background: var(--bg3); }
.icon-picker-overlay {
    position: fixed;
    inset: 0;
    z-index: 10050;
    background: rgba(0, 0, 0, 0.65);
    display: none;
    align-items: center;
    justify-content: center;
    padding: 12px;
}
.icon-picker {
    width: min(1100px, 100%);
    max-height: 88vh;
    background: var(--bg2);
    border: 1px solid var(--border);
    border-radius: 10px;
    box-shadow: 0 16px 36px rgba(0, 0, 0, 0.5);
    overflow: hidden;
    display: flex;
    flex-direction: column;
}
.icon-picker-head {
    display: flex;
    align-items: center;
    gap: 8px;
    padding: 10px;
    border-bottom: 1px solid var(--border);
}
.icon-picker-title { color: var(--cyan); font-weight: 700; }
.icon-picker-head .editable.text { width: auto; flex: 1; }
.icon-suggestions { padding: 8px 10px; border-bottom: 1px solid var(--border); }
.icon-suggestions .title { color: var(--yellow); font-size: 12px; margin-bottom: 6px; }
.icon-suggestions .row { display: flex; flex-wrap: wrap; gap: 6px; }
.icon-chip {
    border: 1px solid var(--border);
    border-radius: 6px;
    background: var(--bg);
    padding: 4px;
    cursor: pointer;
}
.icon-chip:hover { border-color: var(--cyan); }
.icon-chip img { width: 28px; height: 28px; border-radius: 4px; display: block; }
.icon-picker-body {
    padding: 10px;
    overflow: auto;
    display: grid;
    grid-template-columns: repeat(auto-fill, minmax(180px, 1fr));
    gap: 8px;
}
.icon-card {
    border: 1px solid var(--border);
    border-radius: 8px;
    background: var(--bg);
    padding: 8px;
    cursor: pointer;
}
.icon-card:hover { border-color: var(--cyan); }
.icon-card .name { font-size: 12px; min-height: 32px; margin-bottom: 6px; }
.icon-card .line { display: flex; align-items: center; gap: 6px; }
.icon-card img { width: 34px; height: 34px; border-radius: 6px; border: 1px solid var(--bg3); }
.progress-bar { width: 100px; height: 8px; background: var(--bg3); border-radius: 4px; overflow: hidden; display: inline-block; vertical-align: middle; }
.progress-fill { height: 100%; background: var(--green); border-radius: 4px; transition: width 0.5s; }
.feed { max-height: 300px; overflow-y: auto; }
.feed-item { padding: 4px 0; font-size: 12px; display: flex; gap: 8px; }
.feed-ts { color: var(--text2); font-family: monospace; min-width: 70px; }
.feed-icon { min-width: 30px; font-weight: 600; }
.filters { display: flex; gap: 12px; margin-bottom: 16px; align-items: center; flex-wrap: wrap; }
.filter-input { background: var(--bg3); border: 1px solid var(--border); color: var(--text); padding: 6px 12px; border-radius: 6px; font-size: 13px; }
.filter-input:focus { border-color: var(--cyan); outline: none; }
.filter-btn { background: var(--bg3); border: 1px solid var(--border); color: var(--text2); padding: 6px 14px; border-radius: 6px; cursor: pointer; font-size: 12px; }
.filter-btn:hover, .filter-btn.active { border-color: var(--cyan); color: var(--cyan); }
.section { margin-bottom: 24px; }
.section-title { font-size: 14px; font-weight: 700; color: var(--yellow); margin-bottom: 10px; padding-bottom: 6px; border-bottom: 1px solid var(--bg3); }
.subsection-title { color: var(--cyan); font-size: 13px; font-weight: 700; margin: 12px 0 8px 0; }
.category-pill { display: inline-block; padding: 2px 8px; border: 1px solid var(--border); border-radius: 999px; font-size: 11px; color: var(--text2); }
.collapse { background: var(--bg2); border: 1px solid var(--border); border-radius: 8px; margin: 8px 0; }
.collapse > summary { cursor: pointer; list-style: none; padding: 10px 12px; color: var(--text); font-weight: 600; }
.collapse > summary::-webkit-details-marker { display: none; }
.collapse > summary:hover { color: var(--cyan); }
.collapse-body { padding: 0 12px 12px 12px; }
.metier-grid { display: grid; grid-template-columns: repeat(auto-fill, minmax(300px, 1fr)); gap: 12px; }
.metier-card { background: var(--bg2); border: 1px solid var(--border); border-radius: 8px; padding: 14px; transition: border-color 0.2s; }
.metier-card:hover { border-color: var(--cyan); }
.metier-name { font-weight: 700; color: var(--cyan); font-size: 15px; margin-bottom: 6px; }
.metier-stat { display: flex; justify-content: space-between; font-size: 13px; padding: 2px 0; }
.metier-eta { color: var(--yellow); font-weight: 600; font-size: 15px; margin-top: 4px; }
.level-up { background: linear-gradient(135deg, #1a1a2e, #16213e); border: 1px solid var(--yellow); border-radius: 8px; padding: 10px 16px; margin-bottom: 12px; display: flex; align-items: center; gap: 10px; }
.kamas-summary { display: grid; grid-template-columns: repeat(auto-fill, minmax(180px, 1fr)); gap: 12px; margin-bottom: 20px; }
.kamas-card { background: var(--bg2); border: 1px solid var(--border); border-radius: 8px; padding: 14px; text-align: center; }
.kamas-card .amount { font-size: 22px; font-weight: 700; }
.kamas-card .label { font-size: 11px; color: var(--text2); margin-top: 4px; }
::-webkit-scrollbar { width: 6px; }
::-webkit-scrollbar-track { background: var(--bg); }
::-webkit-scrollbar-thumb { background: var(--bg3); border-radius: 3px; }
"""

    # JavaScript entierement en guillemets doubles, aucune apostrophe dans les strings
    js = r"""
var currentTab = "dashboard";
var data = null;
var sortCol = "solde";
var sortDir = -1;
var filterText = "";
var filterMode = "all";
var inventoryCategoryFilter = "all";
var hdvFilterText = "";
var hdvCategoryFilter = "all";
var hdvSortCol = "name";
var hdvSortDir = 1;
var ctxTarget = {kind: "", name: "", field: ""};
var iconPicker = {open: false, item: "", query: "", list: [], suggestions: [], loading: false, error: ""};
var iconPickerTimer = null;

function switchTab(tab) {
    currentTab = tab;
    var tabs = document.querySelectorAll(".tab");
    for (var i = 0; i < tabs.length; i++) {
        tabs[i].classList.remove("active");
        if (tabs[i].getAttribute("data-tab") === tab) tabs[i].classList.add("active");
    }
    render();
}

function fmt(n) { return n.toLocaleString("fr-FR"); }

function eta(seconds) {
    if (!seconds || seconds <= 0) return "-";
    if (seconds < 60) return "~" + Math.round(seconds) + "s";
    if (seconds < 3600) return "~" + Math.floor(seconds/60) + "m" + String(Math.floor(seconds%60)).padStart(2,"0") + "s";
    return "~" + Math.floor(seconds/3600) + "h" + String(Math.floor((seconds%3600)/60)).padStart(2,"0") + "m";
}

function esc(s) { var d = document.createElement("div"); d.textContent = s; return d.innerHTML; }

function categoryOf(name) {
    if (!data || !data.item_categories) return "Autres";
    return data.item_categories[name] || "Autres";
}

function itemTooltip(name) {
    if (!data || !data.inventory) return name;
    var cat = categoryOf(name);
    var notes = data.inventory.notes[name] || "";
    var txt = name + "\nCategorie: " + cat;
    if (notes) txt += "\nNotes: " + notes;
    return txt;
}

function iconTag(name) {
    var candidates = data.icons[name] || [];
    if (!candidates.length) return "";
    var attrs = "";
    for (var i = 1; i < candidates.length; i++) {
        attrs += " data-f" + i + "=\"" + candidates[i] + "\"";
    }
    return "<img class=\"item-icon\" src=\"" + candidates[0] + "\"" + attrs + " onerror=\"iconFallback(this)\">";
}

function iconFallback(img) {
    var idx = parseInt(img.getAttribute("data-idx") || "1", 10);
    var next = img.getAttribute("data-f" + idx);
    if (next) {
        img.setAttribute("data-idx", String(idx + 1));
        img.src = next;
        return;
    }
    img.style.display = "none";
}

function closeItemMenu() {
    var m = document.getElementById("ctx-menu");
    if (m) m.style.display = "none";
    ctxTarget = {kind: "", name: "", field: ""};
}

function openContextMenu(ev, kind, name, field) {
    ev.preventDefault();
    var m = document.getElementById("ctx-menu");
    if (!m) return;
    ctxTarget = {kind: kind || "", name: name || "", field: field || ""};

    var title = document.getElementById("ctx-title");
    if (title) title.textContent = buildMenuTitle();
    var body = document.getElementById("ctx-menu-body");
    if (body) body.innerHTML = buildMenuBody();

    m.style.display = "block";
    var x = ev.clientX;
    var y = ev.clientY;
    var vw = window.innerWidth;
    var vh = window.innerHeight;
    var mw = 300;
    var mh = 260;
    if (x + mw > vw) x = Math.max(8, vw - mw - 8);
    if (y + mh > vh) y = Math.max(8, vh - mh - 8);
    m.style.left = x + "px";
    m.style.top = y + "px";
}

function buildMenuTitle() {
    if (ctxTarget.kind === "item") return ctxTarget.name;
    if (ctxTarget.kind === "hdv_offer") return "Offre HDV #" + ctxTarget.field;
    if (ctxTarget.kind === "hdv_new") return "Nouvelle offre HDV";
    if (ctxTarget.kind === "metier") return "Metier: " + ctxTarget.name;
    if (ctxTarget.kind === "metier_new") return "Metiers";
    if (ctxTarget.kind === "config") return "Dashboard";
    return "Actions";
}

function menuButton(label, fn) {
    return "<button class=\"ctx-item\" onclick=\"" + fn + ";closeItemMenu()\">" + label + "</button>";
}

function buildMenuBody() {
    if (ctxTarget.kind === "item") {
        return ""
            + menuButton("Modifier ajustement de quantite", "promptEditQuantity()")
            + menuButton("Modifier prix manuel", "promptEditPrice()")
            + menuButton("Ajouter offre de vente HDV", "promptAddHdvOfferForItem(\"sell\")")
            + menuButton("Ajouter offre d'achat HDV", "promptAddHdvOfferForItem(\"buy\")")
            + menuButton("Modifier nom corrige (icone)", "promptEditLabel()")
            + menuButton("Modifier notes", "promptEditNotes()")
            + menuButton("Choisir image (librairie Ankama)", "openIconPickerForCurrentItem()")
            + menuButton("Retirer image manuelle", "clearIconOverride()")
            + menuButton("Reinitialiser les corrections manuelles", "resetManualEdits()");
    }
    if (ctxTarget.kind === "hdv_offer") {
        return ""
            + menuButton("Modifier cette offre", "promptEditHdvOfferById()")
            + menuButton("Supprimer cette offre", "deleteHdvOfferById()");
    }
    if (ctxTarget.kind === "hdv_new") {
        return ""
            + menuButton("Ajouter offre de vente", "promptAddHdvOffer(\"sell\")")
            + menuButton("Ajouter offre d'achat", "promptAddHdvOffer(\"buy\")");
    }
    if (ctxTarget.kind === "metier") {
        return ""
            + menuButton("Modifier niveau actuel", "promptEditMetierLevel()")
            + menuButton("Modifier XP actuelle", "promptEditMetierXp()")
            + menuButton("Modifier niveau cible", "promptEditMetierTarget()");
    }
    if (ctxTarget.kind === "metier_new") {
        return menuButton("Ajouter un metier", "promptAddMetier()");
    }
    if (ctxTarget.kind === "config") {
        return ""
            + menuButton("Modifier personnage", "promptEditConfigCharacter()")
            + menuButton("Modifier serveur", "promptEditConfigServer()")
            + menuButton("Modifier compte", "promptEditConfigAccount()")
            + menuButton("Modifier kamas de base", "promptEditConfigBaseKamas()")
            + menuButton("Ajustement manuel kamas (+/-)", "promptEditManualKamasDelta()");
    }
    return "";
}

function promptEditQuantity() {
    if (!ctxTarget.name || !data) return;
    var current = (data.inventory.manual_qty[ctxTarget.name] || 0);
    var v = prompt("Ajustement manuel de quantite", String(current));
    if (v === null) return;
    setItemMeta(ctxTarget.name, {manual_qty: v});
}

function promptEditPrice() {
    if (!ctxTarget.name || !data) return;
    var current = (data.inventory.prices[ctxTarget.name] || 0);
    var v = prompt("Prix unitaire manuel", String(Math.round(current)));
    if (v === null) return;
    setPrice(ctxTarget.name, v);
}

function promptEditLabel() {
    if (!ctxTarget.name || !data) return;
    var current = (data.inventory.manual_label[ctxTarget.name] || "");
    var v = prompt("Nom corrige (utilise pour matcher l'icone)", current);
    if (v === null) return;
    setItemMeta(ctxTarget.name, {manual_label: v});
}

function promptEditNotes() {
    if (!ctxTarget.name || !data) return;
    var current = (data.inventory.notes[ctxTarget.name] || "");
    var v = prompt("Notes", current);
    if (v === null) return;
    setItemMeta(ctxTarget.name, {notes: v});
}

function resetManualEdits() {
    if (!ctxTarget.name) return;
    setItemMeta(ctxTarget.name, {manual_qty: 0, notes: "", manual_label: "", manual_icon_url: ""});
    setPrice(ctxTarget.name, 0);
}

function clearIconOverride() {
    if (!ctxTarget.name) return;
    setItemMeta(ctxTarget.name, {manual_icon_url: ""});
}

function openIconPickerForCurrentItem() {
    if (!ctxTarget.name) return;
    iconPicker.open = true;
    iconPicker.item = ctxTarget.name;
    iconPicker.query = ctxTarget.name;
    iconPicker.list = [];
    iconPicker.suggestions = [];
    iconPicker.loading = true;
    iconPicker.error = "";
    renderIconPicker();
    loadIconLibrary(iconPicker.query);
}

function closeIconPicker() {
    iconPicker.open = false;
    iconPicker.loading = false;
    iconPicker.error = "";
    renderIconPicker();
}

function onIconPickerInput(v) {
    iconPicker.query = String(v || "").trim();
    renderIconPicker();
    if (iconPickerTimer) clearTimeout(iconPickerTimer);
    iconPickerTimer = setTimeout(function() {
        loadIconLibrary(iconPicker.query);
    }, 180);
}

function loadIconLibrary(query) {
    if (!iconPicker.item) return;
    iconPicker.loading = true;
    iconPicker.error = "";
    renderIconPicker();
    var q = encodeURIComponent(query || "");
    var item = encodeURIComponent(iconPicker.item || "");
    fetch("/api/icon_library?q=" + q + "&item=" + item + "&limit=160")
        .then(function(r) { return r.json(); })
        .then(function(d) {
            iconPicker.loading = false;
            iconPicker.list = d && d.items ? d.items : [];
            iconPicker.suggestions = d && d.suggestions ? d.suggestions : [];
            renderIconPicker();
        })
        .catch(function() {
            iconPicker.loading = false;
            iconPicker.error = "Erreur de chargement de la librairie.";
            renderIconPicker();
        });
}

function chooseIconForCurrentItem(url) {
    if (!iconPicker.item || !url) return;
    setItemMeta(iconPicker.item, {manual_icon_url: String(url)});
    closeIconPicker();
}

function renderIconPicker() {
    var overlay = document.getElementById("icon-picker-overlay");
    var title = document.getElementById("icon-picker-title");
    var input = document.getElementById("icon-picker-input");
    var sug = document.getElementById("icon-picker-suggestions");
    var body = document.getElementById("icon-picker-body");
    if (!overlay || !title || !input || !sug || !body) return;

    overlay.style.display = iconPicker.open ? "flex" : "none";
    if (!iconPicker.open) return;

    title.textContent = "Choix image: " + iconPicker.item;
    input.value = iconPicker.query || "";

    var sugHtml = "";
    if (iconPicker.suggestions && iconPicker.suggestions.length) {
        sugHtml += "<div class=\"title\">Suggestions auto pour cet objet</div><div class=\"row\">";
        for (var i = 0; i < iconPicker.suggestions.length; i++) {
            var s = iconPicker.suggestions[i];
            var safeS = s.replace(/\\/g, "\\\\").replace(/\"/g, "\\\"");
            sugHtml += "<button class=\"icon-chip\" onclick=\"chooseIconForCurrentItem(\\\"" + safeS + "\\\")\"><img src=\"" + s + "\" onerror=\"this.style.display='none'\"></button>";
        }
        sugHtml += "</div>";
    }
    sug.innerHTML = sugHtml;
    sug.style.display = sugHtml ? "block" : "none";

    if (iconPicker.loading) {
        body.innerHTML = "<div class=\"dim\">Chargement de la librairie...</div>";
        return;
    }
    if (iconPicker.error) {
        body.innerHTML = "<div class=\"neg\">" + esc(iconPicker.error) + "</div>";
        return;
    }
    if (!iconPicker.list.length) {
        body.innerHTML = "<div class=\"dim\">Aucun resultat.</div>";
        return;
    }

    var out = "";
    for (var j = 0; j < iconPicker.list.length; j++) {
        var row = iconPicker.list[j];
        var iconUrl = (row.icons && row.icons.length) ? row.icons[0] : "";
        if (!iconUrl) continue;
        var safe = iconUrl.replace(/\\/g, "\\\\").replace(/\"/g, "\\\"");
        out += "<button class=\"icon-card\" onclick=\"chooseIconForCurrentItem(\\\"" + safe + "\\\")\">";
        out += "<div class=\"name\">" + esc(row.name || "Objet") + "</div>";
        out += "<div class=\"line\"><img src=\"" + iconUrl + "\" onerror=\"this.style.display='none'\"><span class=\"tiny-note\">gfx " + (row.gfx_id || "?") + "</span></div>";
        out += "</button>";
    }
    body.innerHTML = out;
}

function promptOfferPayload(existing, forcedType, forcedItem) {
    var itemName = forcedItem || (existing ? (existing.item || "") : "");
    if (!itemName) {
        itemName = prompt("Objet de l'offre", "");
        if (!itemName) return null;
    }
    var typeDefault = forcedType || (existing ? (existing.offer_type || "sell") : "sell");
    var typePick = prompt("Type d'offre (sell=vente, buy=achat)", typeDefault);
    if (typePick === null) return null;
    typePick = String(typePick || "sell").trim().toLowerCase();
    if (typePick !== "buy") typePick = "sell";

    var priceDefault = existing ? String(Math.round(existing.unit_price || 0)) : "0";
    var unitPrice = parseFloat(prompt("Prix unitaire", priceDefault) || "0");
    if (isNaN(unitPrice) || unitPrice < 0) unitPrice = 0;

    var qtyDefault = existing ? String(existing.quantity || 0) : "1";
    var quantity = parseInt(prompt("Quantite de l'offre", qtyDefault) || "0", 10) || 0;

    var sellerDefault = existing ? (existing.seller_name || "") : "";
    var seller = prompt("Vendeur / Acheteur (optionnel)", sellerDefault);
    if (seller === null) return null;

    var gemDefault = existing ? String(existing.gem_slots || 0) : "0";
    var gemSlots = parseInt(prompt("Slots de gemmes", gemDefault) || "0", 10) || 0;

    var subDefault = existing ? (existing.sublimations || "") : "";
    var sublimations = prompt("Sublimations equipees (texte libre)", subDefault);
    if (sublimations === null) return null;

    var notesDefault = existing ? (existing.notes || "") : "";
    var notes = prompt("Notes (optionnel)", notesDefault);
    if (notes === null) return null;

    return {
        item: itemName,
        offer_type: typePick,
        unit_price: unitPrice,
        quantity: quantity,
        seller_name: String(seller || "").trim(),
        gem_slots: gemSlots,
        sublimations: String(sublimations || "").trim(),
        notes: String(notes || "").trim()
    };
}

function promptAddHdvOffer(type) {
    var payload = promptOfferPayload(null, type || "sell", "");
    if (!payload) return;
    upsertHdvOffer(payload);
}

function promptAddHdvOfferForItem(type) {
    if (!ctxTarget.name) return;
    var payload = promptOfferPayload(null, type || "sell", ctxTarget.name);
    if (!payload) return;
    upsertHdvOffer(payload);
}

function promptEditHdvOfferById() {
    if (!ctxTarget.field || !data || !data.hdv_offer_index) return;
    var existing = data.hdv_offer_index[String(ctxTarget.field)];
    if (!existing) return;
    var payload = promptOfferPayload(existing, existing.offer_type || "sell", existing.item || "");
    if (!payload) return;
    payload.id = existing.id;
    upsertHdvOffer(payload);
}

function deleteHdvOfferById() {
    if (!ctxTarget.field) return;
    if (!confirm("Supprimer cette offre HDV ?")) return;
    fetch("/api/hdv_offer", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({action: "delete", id: parseInt(ctxTarget.field, 10) || 0})
    });
}

function upsertHdvOffer(payload) {
    fetch("/api/hdv_offer", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(payload)
    });
}

function promptEditMetierLevel() {
    if (!ctxTarget.name || !data) return;
    var m = data.session.metiers[ctxTarget.name] || {};
    var current = m.base_level || m.level || 0;
    var v = prompt("Niveau actuel", String(current));
    if (v === null) return;
    setMetier(ctxTarget.name, parseInt(v, 10) || 0, null, null);
}

function promptEditMetierXp() {
    if (!ctxTarget.name || !data) return;
    var m = data.session.metiers[ctxTarget.name] || {};
    var current = m.base_xp || 0;
    var v = prompt("XP actuelle dans le niveau", String(current));
    if (v === null) return;
    var remDefault = m.xp_next || 0;
    var rem = prompt("XP restant pour le prochain niveau (sert a apprendre la courbe globale)", String(remDefault));
    if (rem === null) return;
    setMetier(ctxTarget.name, null, parseInt(v, 10) || 0, null, parseInt(rem, 10) || 0);
}

function promptEditMetierTarget() {
    if (!ctxTarget.name || !data) return;
    var m = data.session.metiers[ctxTarget.name] || {};
    var current = m.target_level || 0;
    var v = prompt("Niveau cible", String(current));
    if (v === null) return;
    setMetier(ctxTarget.name, null, null, parseInt(v, 10) || 0);
}

function promptAddMetier() {
    var name = prompt("Nom du metier", "");
    if (!name) return;
    var lvl = parseInt(prompt("Niveau actuel", "0") || "0", 10) || 0;
    var xp = parseInt(prompt("XP actuelle", "0") || "0", 10) || 0;
    var tgt = parseInt(prompt("Niveau cible", "0") || "0", 10) || 0;
    setMetier(name, lvl, xp, tgt);
}

function setConfigField(k, v) {
    var body = {};
    body[k] = v;
    fetch("/api/config", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(body)
    });
}

function promptEditConfigCharacter() {
    var v = prompt("Personnage", data && data.config ? (data.config.character || "") : "");
    if (v === null) return;
    setConfigField("character", v);
}

function promptEditConfigServer() {
    var v = prompt("Serveur", data && data.config ? (data.config.server || "") : "");
    if (v === null) return;
    setConfigField("server", v);
}

function promptEditConfigAccount() {
    var v = prompt("Compte", data && data.config ? (data.config.account || "") : "");
    if (v === null) return;
    setConfigField("account", v);
}

function promptEditConfigBaseKamas() {
    var v = prompt("Kamas de base", String((data && data.config ? (data.config.base_kamas || 0) : 0)));
    if (v === null) return;
    setConfigField("base_kamas", parseInt(v, 10) || 0);
}

function promptEditManualKamasDelta() {
    var v = prompt("Ajustement manuel kamas (positif ou negatif)", String((data && data.config ? (data.config.manual_kamas_delta || 0) : 0)));
    if (v === null) return;
    setConfigField("manual_kamas_delta", parseInt(v, 10) || 0);
}

function renderHeader() {
    if (!data) return;
    var s = data.session;
    var h = document.getElementById("header-stats");
    h.innerHTML =
        "<span class=\"stat\" oncontextmenu=\"openContextMenu(event,&quot;config&quot;,&quot;&quot;,&quot;character&quot;)\"><span class=\"label\">Perso </span><span class=\"value cyan\">" + esc(data.config.character) + "</span></span>" +
        "<span class=\"stat\"><span class=\"label\">Duree session </span><span class=\"value\">" + s.elapsed_str + "</span></span>" +
        "<span class=\"stat\"><span class=\"label\">Combats </span><span class=\"value red\">" + s.fights + "</span></span>" +
        "<span class=\"stat\"><span class=\"label\">Crafts </span><span class=\"value yellow\">" + s.crafts + "</span></span>" +
        "<span class=\"stat\" oncontextmenu=\"openContextMenu(event,&quot;config&quot;,&quot;&quot;,&quot;base_kamas&quot;)\"><span class=\"label\">Kamas connus </span><span class=\"value green\">" + fmt(data.known_kamas_total || 0) + "</span></span>" +
        "<span class=\"stat\"><span class=\"label\">Inv. </span><span class=\"value cyan\">~" + fmt(data.inv_value) + "</span></span>" +
        "<span class=\"stat\"><span class=\"label\">Events </span><span class=\"value\">" + fmt(data.watcher.events) + "</span></span>";
}

function renderDashboard() {
    var s = data.session;
    var inv = data.inventory;
    var html = "";
    var i, name, m, lu;

    if (s.level_ups.length > 0) {
        var luMap = {};
        for (i = 0; i < s.level_ups.length; i++) {
            lu = s.level_ups[i];
            if (!luMap[lu.metier]) luMap[lu.metier] = {count: 0, lastTs: lu.ts};
            luMap[lu.metier].count += 1;
            luMap[lu.metier].lastTs = lu.ts;
        }
        html += "<div class=\"section\"><div class=\"section-title\">Niveaux gagnes (compact)</div><table>";
        html += "<tr><th>Metier</th><th class=\"num\">Niveaux</th><th class=\"num\">Dernier</th></tr>";
        var luKeys = Object.keys(luMap);
        for (i = 0; i < luKeys.length; i++) {
            var mk = luKeys[i];
            html += "<tr><td>" + esc(mk) + "</td><td class=\"num pos\">+" + luMap[mk].count + "</td><td class=\"num dim\">" + esc(luMap[mk].lastTs) + "</td></tr>";
        }
        html += "</table></div>";
    }

    html += "<div class=\"kamas-summary\">";
    html += "<div class=\"kamas-card\" oncontextmenu=\"openContextMenu(event,&quot;config&quot;,&quot;&quot;,&quot;base_kamas&quot;)\"><div class=\"amount\" style=\"color:var(--text2)\">" + fmt(data.config.base_kamas) + "</div><div class=\"label\">KAMAS BASE (clic droit)</div></div>";
    html += "<div class=\"kamas-card\"><div class=\"amount\" style=\"color:var(--green)\">+" + fmt(s.kamas_gained) + "</div><div class=\"label\">DROPS</div></div>";
    html += "<div class=\"kamas-card\"><div class=\"amount\" style=\"color:var(--yellow)\">+" + fmt(s.kamas_from_sales) + "</div><div class=\"label\">VENTES HDV</div></div>";
    html += "<div class=\"kamas-card\"><div class=\"amount\" style=\"color:var(--purple)\">" + fmt(data.config.manual_kamas_delta || 0) + "</div><div class=\"label\">AJUSTEMENT MANUEL</div></div>";
    html += "<div class=\"kamas-card\"><div class=\"amount\" style=\"color:var(--cyan)\">~" + fmt(data.inv_value) + "</div><div class=\"label\">VALEUR INVENTAIRE</div></div>";
    html += "<div class=\"kamas-card\"><div class=\"amount\" style=\"color:var(--green)\">" + fmt(data.known_kamas_total || 0) + "</div><div class=\"label\">TOTAL KAMAS CONNUS</div></div>";
    html += "</div>";

    var metierKeys = Object.keys(s.metiers);
    if (metierKeys.length > 0) {
        metierKeys.sort(function(a, b) { return s.metiers[b].xp - s.metiers[a].xp; });
        html += "<div class=\"section\"><div class=\"section-title\">XP Metiers</div><div class=\"metier-grid\">";
        for (i = 0; i < metierKeys.length; i++) {
            name = metierKeys[i];
            m = s.metiers[name];
            var safeMetierName = name.replace(/\\/g, "\\\\").replace(/"/g, "\\\"");
            html += "<div class=\"metier-card\" oncontextmenu=\"openContextMenu(event,&quot;metier&quot;,&quot;" + safeMetierName + "&quot;,&quot;&quot;)\">";
            html += "<div class=\"metier-name\">" + esc(name) + "</div>";
            html += "<div class=\"metier-stat\"><span>Niveau</span><span>" + (m.level || 0) + "</span></div>";
            html += "<div class=\"metier-stat\"><span>XP actuelle</span><span>" + fmt(m.base_xp || 0) + "</span></div>";
            html += "<div class=\"metier-stat\"><span>XP gagne</span><span class=\"pos\">+" + fmt(m.xp) + "</span></div>";
            html += "<div class=\"metier-stat\"><span>XP/h</span><span>" + fmt(m.xp_h) + "/h</span></div>";
            html += "<div class=\"metier-stat\"><span>Reste</span><span>" + (m.xp_next > 0 ? fmt(m.xp_next) : "?") + "</span></div>";
            html += "<div style=\"margin-top:6px\"><div class=\"progress-bar\"><div class=\"progress-fill\" style=\"width:" + m.pct + "%\"></div></div> " + m.pct.toFixed(0) + "%</div>";
            html += "<div class=\"metier-eta\">" + eta(m.eta_s) + "</div>";
            html += "</div>";
        }
        html += "</div></div>";
    }

    var allItems = Object.keys(inv.items).map(function(k) { return [k, inv.items[k]]; });
    allItems.sort(function(a, b) { return b[1] - a[1]; });
    var topItems = allItems.slice(0, 10);
    if (topItems.length > 0) {
        html += "<div class=\"section\"><div class=\"section-title\">Top Gains (session)</div><table>";
        html += "<tr><th>Objet</th><th class=\"num\">Drops</th><th class=\"num\">Pertes</th><th class=\"num\">Solde</th><th class=\"num\">Prix/u</th><th class=\"num\">Valeur</th></tr>";
        for (i = 0; i < topItems.length; i++) {
            name = topItems[i][0];
            var net = topItems[i][1];
            var safeName = name.replace(/\\/g, "\\\\").replace(/"/g, "\\\"");
            var d = inv.drops[name] || 0;
            var l = inv.losses[name] || 0;
            var p = inv.prices[name] || 0;
            var v = (net > 0 && p > 0) ? Math.round(net * p) : 0;
            var img = iconTag(name);
            var sCls = net > 0 ? "pos bold" : (net < 0 ? "neg" : "dim");
            html += "<tr oncontextmenu=\"openContextMenu(event,&quot;item&quot;,&quot;" + safeName + "&quot;,&quot;&quot;)\">";
            html += "<td><span class=\"item-name\">" + img + esc(name) + "</span></td>";
            html += "<td class=\"num pos\">" + (d > 0 ? "+" + d : "-") + "</td>";
            html += "<td class=\"num neg\">" + (l > 0 ? "-" + l : "-") + "</td>";
            html += "<td class=\"num " + sCls + "\">" + (net > 0 ? "+" : "") + net + "</td>";
            html += "<td class=\"num dim\">" + (p > 0 ? fmt(Math.round(p)) : "?") + "</td>";
            html += "<td class=\"num " + (v > 0 ? "pos" : "dim") + "\">" + (v > 0 ? fmt(v) : "-") + "</td>";
            html += "</tr>";
        }
        html += "</table></div>";
    }

    if (s.recent_events.length > 0) {
        html += "<div class=\"section\"><div class=\"section-title\">Activite recente</div><div class=\"feed\">";
        var evts = s.recent_events.slice().reverse().slice(0, 15);
        for (i = 0; i < evts.length; i++) {
            var e = evts[i];
            html += "<div class=\"feed-item\"><span class=\"feed-ts\">" + e.ts + "</span><span class=\"feed-icon\">" + esc(e.icon) + "</span><span>" + esc(e.text) + "</span></div>";
        }
        html += "</div></div>";
    }
    return html;
}

function renderInventory() {
    var inv = data.inventory;
    var allItems = Object.keys(inv.items).map(function(k) { return [k, inv.items[k]]; });
    var categorySet = {};
    for (var ci = 0; ci < allItems.length; ci++) categorySet[categoryOf(allItems[ci][0])] = true;
    var categoryKeys = Object.keys(categorySet).sort(function(a, b) { return a.localeCompare(b); });
    var totalAll = allItems.length;
    var totalPos = allItems.filter(function(x) { return x[1] > 0; }).length;
    var totalNeg = allItems.filter(function(x) { return x[1] < 0; }).length;

    var html = "<div class=\"filters\">";
    html += "<input class=\"filter-input\" type=\"text\" placeholder=\"Rechercher...\" value=\"" + filterText + "\" oninput=\"filterText=this.value;render()\" style=\"width:250px\">";
    html += "<select class=\"filter-input\" onchange=\"inventoryCategoryFilter=this.value;render()\"><option value=\"all\"" + (inventoryCategoryFilter===\"all\"?\" selected\":\"\") + \">Toutes categories</option>";
    for (var ck = 0; ck < categoryKeys.length; ck++) {
        var cat = categoryKeys[ck];
        var sel = inventoryCategoryFilter === cat ? " selected" : "";
        html += "<option value=\"" + esc(cat) + "\"" + sel + ">" + esc(cat) + "</option>";
    }
    html += "</select>";
    html += "<button class=\"filter-btn " + (filterMode==="all"?"active":"") + "\" onclick=\"filterMode=&quot;all&quot;;render()\">Tous (" + totalAll + ")</button>";
    html += "<button class=\"filter-btn " + (filterMode==="positive"?"active":"") + "\" onclick=\"filterMode=&quot;positive&quot;;render()\">Gains (" + totalPos + ")</button>";
    html += "<button class=\"filter-btn " + (filterMode==="negative"?"active":"") + "\" onclick=\"filterMode=&quot;negative&quot;;render()\">Pertes (" + totalNeg + ")</button>";
    html += "</div>";

    if (filterText) {
        var ft = filterText.toLowerCase();
        allItems = allItems.filter(function(x) { return x[0].toLowerCase().indexOf(ft) >= 0; });
    }
    if (filterMode === "positive") allItems = allItems.filter(function(x) { return x[1] > 0; });
    if (filterMode === "negative") allItems = allItems.filter(function(x) { return x[1] < 0; });
    if (inventoryCategoryFilter !== "all") allItems = allItems.filter(function(x) { return categoryOf(x[0]) === inventoryCategoryFilter; });

    allItems.sort(function(a, b) {
        var va, vb;
        switch(sortCol) {
            case "name": return sortDir * a[0].localeCompare(b[0]);
            case "category": return sortDir * categoryOf(a[0]).localeCompare(categoryOf(b[0]));
            case "drops": va = inv.drops[a[0]]||0; vb = inv.drops[b[0]]||0; break;
            case "losses": va = inv.losses[a[0]]||0; vb = inv.losses[b[0]]||0; break;
            case "uses": va = inv.uses[a[0]]||0; vb = inv.uses[b[0]]||0; break;
            case "sales": va = inv.sales[a[0]]||0; vb = inv.sales[b[0]]||0; break;
            case "crafts": va = inv.crafts[a[0]]||0; vb = inv.crafts[b[0]]||0; break;
            case "solde": va = a[1]; vb = b[1]; break;
            case "manual": va = inv.manual_qty[a[0]]||0; vb = inv.manual_qty[b[0]]||0; break;
            case "meta":
                va = (inv.manual_label[a[0]]||"") + " " + (inv.notes[a[0]]||"");
                vb = (inv.manual_label[b[0]]||"") + " " + (inv.notes[b[0]]||"");
                return sortDir * va.localeCompare(vb);
            case "price": va = inv.prices[a[0]]||0; vb = inv.prices[b[0]]||0; break;
            case "value":
                va = (a[1]>0 ? a[1]*(inv.prices[a[0]]||0) : 0);
                vb = (b[1]>0 ? b[1]*(inv.prices[b[0]]||0) : 0);
                break;
            default: va = a[1]; vb = b[1];
        }
        return sortDir * (va - vb);
    });

    html += "<table><tr>";
    var cols = [["name","Objet"],["category","Categorie"],["drops","Drops"],["losses","Perdu"],["uses","Utilise"],["sales","Vendu"],["crafts","Crafte"],["solde","SOLDE"],["manual","Ajust."],["price","Prix/u"],["value","Valeur"],["meta","Correction manuelle"]];
    for (var c = 0; c < cols.length; c++) {
        var key = cols[c][0];
        var label = cols[c][1];
        var arrow = sortCol === key ? (sortDir > 0 ? " +" : " -") : "";
        var cls = (key === "name" || key === "meta" || key === "category") ? "" : "num";
        html += "<th class=\"" + cls + "\" onclick=\"toggleSort(&quot;" + key + "&quot;)\">" + label + arrow + "</th>";
    }
    html += "</tr>";

    for (var i = 0; i < allItems.length; i++) {
        var name = allItems[i][0];
        var net = allItems[i][1];
        var d = inv.drops[name]||0;
        var l = inv.losses[name]||0;
        var u = inv.uses[name]||0;
        var sl = inv.sales[name]||0;
        var cr = inv.crafts[name]||0;
        var mq = inv.manual_qty[name]||0;
        var autoNet = inv.auto_items[name]||0;
        var p = inv.prices[name]||0;
        var v = (net > 0 && p > 0) ? Math.round(net * p) : 0;
        var img = iconTag(name);
        var catName = categoryOf(name);
        var sCls = net > 0 ? "pos bold" : (net < 0 ? "neg" : "dim");
        var rawNotes = inv.notes[name] || "";
        var rawLabel = inv.manual_label[name] || "";
        var safeName = name.replace(/\\/g, "\\\\").replace(/"/g, "\\\"");
        html += "<tr oncontextmenu=\"openContextMenu(event,&quot;item&quot;,&quot;" + safeName + "&quot;,&quot;&quot;)\">";
        html += "<td title=\"" + esc(itemTooltip(name)) + "\"><span class=\"item-name\">" + img + esc(name) + "</span><div class=\"tiny-note\">Auto: " + (autoNet>0?"+":"") + autoNet + "</div></td>";
        html += "<td><span class=\"category-pill\">" + esc(catName) + "</span></td>";
        html += "<td class=\"num pos\">" + (d>0?"+"+d:"-") + "</td>";
        html += "<td class=\"num neg\">" + (l>0?"-"+l:"-") + "</td>";
        html += "<td class=\"num\">" + (u>0?"-"+u:"-") + "</td>";
        html += "<td class=\"num\">" + (sl>0?"-"+sl:"-") + "</td>";
        html += "<td class=\"num\">" + (cr>0?"+"+cr:"-") + "</td>";
        html += "<td class=\"num " + sCls + "\">" + (net>0?"+":"") + net + "</td>";
        html += "<td class=\"num\"><input class=\"editable\" type=\"number\" value=\"" + mq + "\" onchange=\"setItemMeta(&quot;" + safeName + "&quot;, {manual_qty:this.value})\"></td>";
        html += "<td class=\"num\"><input class=\"editable\" type=\"number\" value=\"" + (p>0?Math.round(p):"") + "\" placeholder=\"?\" onchange=\"setPrice(&quot;" + safeName + "&quot;,this.value)\"></td>";
        html += "<td class=\"num " + (v>0?"pos":"") + "\">" + (v>0?fmt(v):"-") + "</td>";
        html += "<td>";
        html += "<input class=\"editable text\" type=\"text\" value=\"" + esc(rawLabel) + "\" placeholder=\"Nom exact (corrige)\" onchange=\"setItemMeta(&quot;" + safeName + "&quot;, {manual_label:this.value})\">";
        html += "<div style=\"margin-top:4px\"><input class=\"editable text\" type=\"text\" value=\"" + esc(rawNotes) + "\" placeholder=\"Notes\" onchange=\"setItemMeta(&quot;" + safeName + "&quot;, {notes:this.value})\"></div>";
        if (inv.corrected[name]) html += "<div class=\"tiny-note pos\" style=\"margin-top:4px\">Correction enregistree</div>";
        html += "</td>";
        html += "</tr>";
    }
    html += "</table>";
    return html;
}

function renderMetiers() {
    var s = data.session;
    var keys = Object.keys(s.metiers);
    if (keys.length === 0) return "<div class=\"section-title\" oncontextmenu=\"openContextMenu(event,&quot;metier_new&quot;,&quot;&quot;,&quot;&quot;)\">Aucun metier detecte (clic droit pour ajouter)</div>";
    keys.sort(function(a, b) { return s.metiers[b].xp - s.metiers[a].xp; });
    var html = "<div class=\"section-title\" oncontextmenu=\"openContextMenu(event,&quot;metier_new&quot;,&quot;&quot;,&quot;&quot;)\">Metiers (clic droit pour ajouter)</div><div class=\"metier-grid\">";
    for (var i = 0; i < keys.length; i++) {
        var name = keys[i];
        var m = s.metiers[name];
        var safeMetierName = name.replace(/\\/g, "\\\\").replace(/"/g, "\\\"");
        html += "<div class=\"metier-card\" oncontextmenu=\"openContextMenu(event,&quot;metier&quot;,&quot;" + safeMetierName + "&quot;,&quot;&quot;)\">";
        html += "<div class=\"metier-name\">" + esc(name) + "</div>";
        html += "<div class=\"metier-stat\"><span>Niveau</span><span>" + (m.level || 0) + "</span></div>";
        html += "<div class=\"metier-stat\"><span>Niveaux detectes session (info)</span><span class=\"dim\">+" + (m.level_ups_session || 0) + "</span></div>";
        html += "<div class=\"metier-stat\"><span>XP actuelle</span><span>" + fmt(m.base_xp || 0) + "</span></div>";
        html += "<div class=\"metier-stat\"><span>XP du niveau (courbe)</span><span>" + fmt(m.xp_for_this_lvl || 0) + " <span class=\"tiny-note\">(" + (m.curve_source === "learned" ? "appris x" + (m.curve_sample_count || 0) : "formule") + ")</span></span></div>";
        html += "<div class=\"metier-stat\"><span>XP total session</span><span class=\"pos bold\">+" + fmt(m.xp) + "</span></div>";
        html += "<div class=\"metier-stat\"><span>XP / heure</span><span>" + fmt(m.xp_h) + "/h</span></div>";
        html += "<div class=\"metier-stat\"><span>XP restant</span><span>" + (m.xp_next>0?fmt(m.xp_next):"?") + "</span></div>";
        html += "<div style=\"margin-top:8px\"><div class=\"progress-bar\" style=\"width:100%\"><div class=\"progress-fill\" style=\"width:" + m.pct + "%\"></div></div> " + m.pct.toFixed(1) + "%</div>";
        html += "<div class=\"metier-eta\" style=\"margin-top:8px;font-size:18px\">" + eta(m.eta_s) + "</div>";
        html += "</div>";
    }
    html += "</div>";
    return html;
}

function renderHDV() {
    var inv = data.inventory;
    var offersByItem = data.hdv_offers || {};
    var html = "";
    html += "<div class=\"section\">";
    html += "<div class=\"section-title\" oncontextmenu=\"openContextMenu(event,&quot;hdv_new&quot;,&quot;&quot;,&quot;&quot;)\">Marche HDV (clic droit pour ajouter)</div>";
    html += "<div class=\"filters\">";
    html += "<input class=\"filter-input\" type=\"text\" value=\"" + esc(hdvFilterText) + "\" placeholder=\"Filtrer un objet...\" oninput=\"hdvFilterText=this.value;render()\" style=\"width:260px\">";
    html += "<select class=\"filter-input\" onchange=\"hdvCategoryFilter=this.value;render()\">";
    html += "<option value=\"all\"" + (hdvCategoryFilter===\"all\"?\" selected\":\"\") + \">Toutes categories</option>";
    var catMap = {};
    var tmpAll = Object.keys(offersByItem).concat(Object.keys(inv.prices || {}));
    for (var cx = 0; cx < tmpAll.length; cx++) catMap[categoryOf(tmpAll[cx])] = true;
    var catKeys = Object.keys(catMap).sort(function(a,b){return a.localeCompare(b);});
    for (var ck = 0; ck < catKeys.length; ck++) {
        var cat = catKeys[ck];
        html += "<option value=\"" + esc(cat) + "\"" + (hdvCategoryFilter===cat?" selected":"") + ">" + esc(cat) + "</option>";
    }
    html += "</select>";
    html += "<select class=\"filter-input\" onchange=\"hdvSortCol=this.value;render()\">";
    html += "<option value=\"name\"" + (hdvSortCol===\"name\"?" selected":"") + ">Tri: Objet</option>";
    html += "<option value=\"bestSell\"" + (hdvSortCol===\"bestSell\"?" selected":"") + ">Tri: Meilleure vente</option>";
    html += "<option value=\"bestBuy\"" + (hdvSortCol===\"bestBuy\"?" selected":"") + ">Tri: Meilleure offre achat</option>";
    html += "<option value=\"offers\"" + (hdvSortCol===\"offers\"?" selected":"") + ">Tri: Nb offres</option>";
    html += "</select>";
    html += "<button class=\"filter-btn\" onclick=\"hdvSortDir*=-1;render()\">" + (hdvSortDir>0?"Asc":"Desc") + "</button>";
    html += "</div>";
    html += "</div>";

    var itemSet = {};
    var keysA = Object.keys(offersByItem);
    for (var i = 0; i < keysA.length; i++) itemSet[keysA[i]] = true;
    var keysB = Object.keys(inv.prices || {});
    for (var j = 0; j < keysB.length; j++) itemSet[keysB[j]] = true;
    var allItems = Object.keys(itemSet);
    allItems.sort(function(a, b) { return a.localeCompare(b); });

    var f = String(hdvFilterText || "").trim().toLowerCase();
    if (f) {
        allItems = allItems.filter(function(name) { return name.toLowerCase().indexOf(f) >= 0; });
    }
    if (hdvCategoryFilter !== "all") {
        allItems = allItems.filter(function(name) { return categoryOf(name) === hdvCategoryFilter; });
    }

    if (!allItems.length) {
        return html + "<p class=\"dim\">Aucune offre HDV. Clic droit dans cette section pour ajouter des offres manuelles (vente/achat).</p>";
    }

    var itemMeta = [];
    for (var mi = 0; mi < allItems.length; mi++) {
        var nm = allItems[mi];
        var offs = offersByItem[nm] || [];
        var bSell = 0;
        var bBuy = 0;
        for (var oi0 = 0; oi0 < offs.length; oi0++) {
            var op = Math.round(offs[oi0].unit_price || 0);
            if (offs[oi0].offer_type === "sell") {
                if (!bSell || op < bSell) bSell = op;
            } else if (op > bBuy) {
                bBuy = op;
            }
        }
        itemMeta.push({name: nm, offers: offs, bestSell: bSell, bestBuy: bBuy, category: categoryOf(nm)});
    }
    itemMeta.sort(function(a, b) {
        var va = 0;
        var vb = 0;
        if (hdvSortCol === "name") return hdvSortDir * a.name.localeCompare(b.name);
        if (hdvSortCol === "bestSell") { va = a.bestSell || 0; vb = b.bestSell || 0; }
        else if (hdvSortCol === "bestBuy") { va = a.bestBuy || 0; vb = b.bestBuy || 0; }
        else { va = a.offers.length; vb = b.offers.length; }
        return hdvSortDir * (va - vb);
    });

    var byCategory = {};
    for (var bi = 0; bi < itemMeta.length; bi++) {
        var ct = itemMeta[bi].category || "Autres";
        if (!byCategory[ct]) byCategory[ct] = [];
        byCategory[ct].push(itemMeta[bi]);
    }
    var categories = Object.keys(byCategory).sort(function(a,b){ return a.localeCompare(b); });

    for (var cg = 0; cg < categories.length; cg++) {
        var catName = categories[cg];
        html += "<div class=\"section\"><div class=\"subsection-title\">" + esc(catName) + " (" + byCategory[catName].length + ")</div>";
        var catItems = byCategory[catName];
        for (var cm = 0; cm < catItems.length; cm++) {
            var block = catItems[cm];
            var name = block.name;
            var offers = block.offers;
            var safeName = name.replace(/\\/g, "\\\\").replace(/"/g, "\\\"");
            var autoPrice = Math.round((inv.prices[name] || 0));
            var bestSell = block.bestSell;
            var bestBuy = block.bestBuy;
            html += "<details class=\"collapse\"" + (cm < 2 ? " open" : "") + ">";
            html += "<summary oncontextmenu=\"openContextMenu(event,&quot;item&quot;,&quot;" + safeName + "&quot;,&quot;&quot;)\"><span class=\"item-name\" title=\"" + esc(itemTooltip(name)) + "\">" + iconTag(name) + esc(name) + "</span> <span class=\"tiny-note\">| auto " + (autoPrice > 0 ? fmt(autoPrice) : "-") + " | vente " + (bestSell > 0 ? fmt(bestSell) : "-") + " | achat " + (bestBuy > 0 ? fmt(bestBuy) : "-") + "</span></summary>";
            html += "<div class=\"collapse-body\">";
            if (!offers.length) {
                html += "<div class=\"tiny-note\">Aucune offre manuelle. Clic droit sur le titre pour en ajouter.</div>";
                html += "</div></details>";
                continue;
            }
            html += "<table style=\"margin-top:4px\">";
            html += "<tr><th>Type</th><th class=\"num\">Prix/u</th><th class=\"num\">Qte</th><th>Vendeur/Acheteur</th><th class=\"num\">Gemmes</th><th>Sublimations</th><th>Notes</th><th>Maj</th></tr>";
            for (var r = 0; r < offers.length; r++) {
                var row = offers[r];
                var rid = String(row.id || "");
                var oType = row.offer_type === "buy" ? "Achat" : "Vente";
                var oCls = row.offer_type === "buy" ? "cyan" : "yellow";
                var upd = row.updated_at ? String(row.updated_at).slice(0, 16).replace("T", " ") : "-";
                html += "<tr oncontextmenu=\"openContextMenu(event,&quot;hdv_offer&quot;,&quot;" + safeName + "&quot;,&quot;" + rid + "&quot;)\">";
                html += "<td class=\"" + oCls + "\">" + oType + "</td>";
                html += "<td class=\"num\">" + fmt(Math.round(row.unit_price || 0)) + "</td>";
                html += "<td class=\"num\">" + (row.quantity || 0) + "</td>";
                html += "<td>" + esc(row.seller_name || "-") + "</td>";
                html += "<td class=\"num\">" + (row.gem_slots || 0) + "</td>";
                html += "<td>" + esc(row.sublimations || "-") + "</td>";
                html += "<td>" + esc(row.notes || "-") + "</td>";
                html += "<td class=\"dim\">" + esc(upd) + "</td>";
                html += "</tr>";
            }
            html += "</table></div></details>";
        }
        html += "</div>";
    }

    return html;
}

function renderActivity() {
    var events = data.session.recent_events.slice().reverse();
    if (events.length === 0) return "<p class=\"dim\">Aucune activite.</p>";
    var html = "<div class=\"feed\">";
    for (var i = 0; i < events.length; i++) {
        var e = events[i];
        html += "<div class=\"feed-item\"><span class=\"feed-ts\">" + e.ts + "</span><span class=\"feed-icon\">" + esc(e.icon) + "</span><span>" + esc(e.text) + "</span></div>";
    }
    html += "</div>";
    return html;
}

function renderCombats() {
    var s = data.session;
    var combats = s.combats || [];
    if (!combats.length) return "<p class=\"dim\">Aucun detail de combat detecte dans les logs pour le moment.</p>";

    var html = "<div class=\"section\"><div class=\"section-title\">Combats details (degats par tour et competence)</div></div>";
    for (var i = 0; i < combats.length; i++) {
        var f = combats[i];
        var summary = "Combat #" + esc(String(f.fight_id || "?")) + " | Degats: " + fmt(f.total_damage || 0) + " | Tours: " + ((f.turns && f.turns.length) ? f.turns.length : 0);
        html += "<details class=\"collapse\"" + (i === 0 ? " open" : "") + "><summary>" + summary + "</summary><div class=\"collapse-body\">";
        var turns = f.turns || [];
        if (!turns.length) {
            html += "<div class=\"tiny-note\">Aucun detail de tour pour ce combat.</div>";
            html += "</div></details>";
            continue;
        }
        for (var t = 0; t < turns.length; t++) {
            var tr = turns[t];
            html += "<details class=\"collapse\"" + (t === 0 ? " open" : "") + "><summary>Tour " + tr.turn + " | Degats: " + fmt(tr.total_damage || 0) + "</summary><div class=\"collapse-body\">";
            var skills = tr.skills || [];
            if (!skills.length) {
                html += "<div class=\"tiny-note\">Aucune competence detectee.</div>";
                html += "</div></details>";
                continue;
            }
            html += "<table><tr><th>Competence</th><th class=\"num\">Degats</th></tr>";
            for (var sIdx = 0; sIdx < skills.length; sIdx++) {
                var sk = skills[sIdx];
                html += "<tr><td>" + esc(sk.name || "(non precise)") + "</td><td class=\"num pos\">" + fmt(sk.damage || 0) + "</td></tr>";
            }
            html += "</table></div></details>";
        }
        html += "</div></details>";
    }
    return html;
}

function render() {
    if (!data) return;
    renderHeader();
    var el = document.getElementById("content");
    switch(currentTab) {
        case "dashboard": el.innerHTML = renderDashboard(); break;
        case "inventory": el.innerHTML = renderInventory(); break;
        case "metiers": el.innerHTML = renderMetiers(); break;
        case "hdv": el.innerHTML = renderHDV(); break;
        case "combats": el.innerHTML = renderCombats(); break;
        case "activity": el.innerHTML = renderActivity(); break;
    }
}

function toggleSort(col) {
    if (sortCol === col) sortDir *= -1;
    else { sortCol = col; sortDir = -1; }
    render();
}


function setMetier(name, level, xp, target, xpRemaining) {
    var body = {metier: name};
    var currentM = data.session.metiers[name] || {};
    if (level !== null) body.level = parseInt(level) || 0;
    else body.level = currentM.base_level || 0;
    if (xp !== null) body.xp = parseInt(xp) || 0;
    else body.xp = currentM.base_xp || 0;
    if (target !== null) body.target = parseInt(target) || 0;
    else body.target = currentM.target_level || 0;

    if (xp !== null) {
        var levelForCurve = parseInt(currentM.level || body.level || 0, 10) || 0;
        body.learn_curve = true;
        body.level_for_curve = levelForCurve;
        if (xpRemaining !== null && xpRemaining !== undefined) {
            body.xp_remaining = parseInt(xpRemaining, 10) || 0;
        } else if ((currentM.xp_next || 0) > 0) {
            body.xp_remaining = parseInt(currentM.xp_next, 10) || 0;
        }
    }

    fetch("/api/metier", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(body)
    });
}
function setPrice(item, value) {
    var price = parseFloat(value);
    if (isNaN(price) || price < 0) return;
    fetch("/api/price", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({item: item, price: price})
    });
}

function setItemMeta(item, payload) {
    var body = {item: item};
    if (payload.manual_qty !== undefined) body.manual_qty = parseInt(payload.manual_qty || "0", 10) || 0;
    if (payload.notes !== undefined) body.notes = String(payload.notes || "").trim();
    if (payload.manual_label !== undefined) body.manual_label = String(payload.manual_label || "").trim();
    if (payload.manual_icon_url !== undefined) body.manual_icon_url = String(payload.manual_icon_url || "").trim();
    fetch("/api/item", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(body)
    });
}

fetch("/api/data").then(function(r){return r.json();}).then(function(d){data=d;render();}).catch(function(){});

var evtSource = new EventSource("/api/stream");
evtSource.onmessage = function(e) { data = JSON.parse(e.data); render(); };

setInterval(function() {
    if (!data || evtSource.readyState === EventSource.CLOSED) {
        fetch("/api/data").then(function(r){return r.json();}).then(function(d){data=d;render();});
    }
}, 5000);

document.addEventListener("click", function() { closeItemMenu(); });
document.addEventListener("contextmenu", function(ev) {
    if (!ev.target.closest("[oncontextmenu]")) closeItemMenu();
});
document.addEventListener("keydown", function(ev) {
    if (ev.key === "Escape") {
        closeItemMenu();
        closeIconPicker();
    }
});
"""

    html_parts = []
    html_parts.append("<!DOCTYPE html>")
    html_parts.append("<html lang=\"fr\">")
    html_parts.append("<head>")
    html_parts.append("<meta charset=\"UTF-8\">")
    html_parts.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">")
    html_parts.append("<title>Wakfu Companion</title>")
    html_parts.append("<style>")
    html_parts.append(css)
    html_parts.append("</style>")
    html_parts.append("</head>")
    html_parts.append("<body>")
    html_parts.append("<div class=\"header\" id=\"header\">")
    html_parts.append("<h1>Wakfu Companion</h1>")
    html_parts.append("<div class=\"stats\" id=\"header-stats\"></div>")
    html_parts.append("</div>")
    html_parts.append("<div class=\"tabs\">")
    html_parts.append("<div class=\"tab active\" data-tab=\"dashboard\" onclick=\"switchTab('dashboard')\">Dashboard</div>")
    html_parts.append("<div class=\"tab\" data-tab=\"inventory\" onclick=\"switchTab('inventory')\">Inventaire</div>")
    html_parts.append("<div class=\"tab\" data-tab=\"metiers\" onclick=\"switchTab('metiers')\">Metiers</div>")
    html_parts.append("<div class=\"tab\" data-tab=\"hdv\" onclick=\"switchTab('hdv')\">HDV</div>")
    html_parts.append("<div class=\"tab\" data-tab=\"combats\" onclick=\"switchTab('combats')\">Combats</div>")
    html_parts.append("<div class=\"tab\" data-tab=\"activity\" onclick=\"switchTab('activity')\">Activite</div>")
    html_parts.append("</div>")
    html_parts.append("<div id=\"ctx-menu\" class=\"ctx-menu\" onclick=\"event.stopPropagation()\">")
    html_parts.append("<div id=\"ctx-title\" class=\"ctx-title\">Actions</div>")
    html_parts.append("<div id=\"ctx-menu-body\"></div>")
    html_parts.append("</div>")
    html_parts.append("<div id=\"icon-picker-overlay\" class=\"icon-picker-overlay\" onclick=\"closeIconPicker()\">")
    html_parts.append("<div class=\"icon-picker\" onclick=\"event.stopPropagation()\">")
    html_parts.append("<div class=\"icon-picker-head\">")
    html_parts.append("<div id=\"icon-picker-title\" class=\"icon-picker-title\">Choix image</div>")
    html_parts.append("<input id=\"icon-picker-input\" class=\"editable text\" type=\"text\" placeholder=\"Rechercher un objet...\" oninput=\"onIconPickerInput(this.value)\">")
    html_parts.append("<button class=\"ctx-item\" style=\"width:auto;padding:6px 10px\" onclick=\"closeIconPicker()\">Fermer</button>")
    html_parts.append("</div>")
    html_parts.append("<div id=\"icon-picker-suggestions\" class=\"icon-suggestions\"></div>")
    html_parts.append("<div id=\"icon-picker-body\" class=\"icon-picker-body\"></div>")
    html_parts.append("</div>")
    html_parts.append("</div>")
    html_parts.append("<div class=\"content\" id=\"content\"></div>")
    html_parts.append("<script>")
    html_parts.append(js)
    html_parts.append("</script>")
    html_parts.append("</body>")
    html_parts.append("</html>")
    return "\n".join(html_parts)


@flask_app.route("/")
def index():
    return get_html()


@flask_app.route("/api/data")
def api_data():
    return jsonify(_build_data())


@flask_app.route("/api/icon_library")
def api_icon_library():
    q = request.args.get("q", "")
    item_name = request.args.get("item", "")
    limit_raw = request.args.get("limit", "120")
    try:
        limit = max(20, min(300, int(limit_raw)))
    except Exception:
        limit = 120

    rows = item_db.icon_library(q, limit=limit)
    suggestions = item_db.get_icon_candidates(item_name) if item_name else []
    return jsonify({"ok": True, "items": rows, "suggestions": suggestions})


@flask_app.route("/api/stream")
def api_stream():
    def generate():
        while True:
            d = _build_data()
            try:
                d_json = json.dumps(d, ensure_ascii=False, default=str)
            except Exception:
                d_json = "{}"
            yield "data: " + d_json + "\n\n"
            time.sleep(REFRESH_INTERVAL)
    return Response(generate(), mimetype="text/event-stream",
                    headers={"Cache-Control": "no-cache", "X-Accel-Buffering": "no"})


@flask_app.route("/api/price", methods=["POST"])
def api_price():
    body = request.get_json(force=True)
    name = body.get("item", "")
    price = body.get("price", 0)
    if name and price >= 0:
        inventory.set_manual_price(name, float(price))
        logger.info(f"Prix manuel mis a jour: item={name} price={price}")
    return jsonify({"ok": True})


@flask_app.route("/api/item", methods=["POST"])
def api_item():
    body = request.get_json(force=True)
    name = body.get("item", "")
    if not name:
        return jsonify({"ok": False, "error": "item requis"}), 400

    manual_qty = body.get("manual_qty")
    notes = body.get("notes")
    manual_label = body.get("manual_label")
    manual_icon_url = body.get("manual_icon_url")

    inventory.set_item_meta(
        name,
        manual_qty=int(manual_qty) if manual_qty is not None else None,
        notes=str(notes) if notes is not None else None,
        manual_label=str(manual_label) if manual_label is not None else None,
        manual_icon_url=str(manual_icon_url) if manual_icon_url is not None else None,
    )
    logger.info(
        "Meta item mise a jour: item=%s manual_qty=%s label=%s notes_len=%s icon_override=%s",
        name,
        manual_qty,
        manual_label,
        len(str(notes or "")),
        bool(manual_icon_url),
    )
    return jsonify({"ok": True})


@flask_app.route("/api/metier", methods=["POST"])
def api_metier():
    body = request.get_json(force=True)
    metier = body.get("metier", "")
    level = body.get("level", 0)
    xp = body.get("xp", 0)
    target = body.get("target", 0)
    learn_curve = bool(body.get("learn_curve", False))
    xp_remaining = body.get("xp_remaining")
    level_for_curve = body.get("level_for_curve", level)
    if metier:
        i_level = int(level or 0)
        i_xp = int(xp or 0)
        i_target = int(target or 0)
        db.execute(
            "INSERT OR REPLACE INTO metier_levels (metier, current_level, current_xp, target_level, last_updated) VALUES (?,?,?,?,?)",
            (metier, i_level, i_xp, i_target, datetime.now().isoformat()))

        if learn_curve and xp_remaining is not None:
            i_rem = int(xp_remaining or 0)
            curve_level = int(level_for_curve or i_level)
            xp_required = i_xp + i_rem
            if xp_required > 0:
                session.learn_curve_level(curve_level, xp_required, source=f"manual:{metier}")
                logger.info(
                    "Courbe XP apprise: metier=%s level=%s xp_current=%s xp_remaining=%s xp_required=%s",
                    metier,
                    curve_level,
                    i_xp,
                    i_rem,
                    xp_required,
                )

        logger.info(f"Metier {metier} : niveau={i_level}, xp={i_xp}, cible={i_target}")
    return jsonify({"ok": True})


@flask_app.route("/api/hdv_offer", methods=["POST"])
def api_hdv_offer():
    body = request.get_json(force=True)
    action = str(body.get("action", "upsert")).strip().lower()
    offer_id = body.get("id")

    if action == "delete":
        if offer_id is None:
            return jsonify({"ok": False, "error": "id requis"}), 400
        db.execute("UPDATE hdv_offers SET is_active=0, updated_at=? WHERE id=?", (datetime.now().isoformat(), int(offer_id)))
        return jsonify({"ok": True})

    item = str(body.get("item", "")).strip()
    offer_type = str(body.get("offer_type", "sell")).strip().lower()
    if offer_type not in ("sell", "buy"):
        offer_type = "sell"
    if not item:
        return jsonify({"ok": False, "error": "item requis"}), 400

    unit_price = float(body.get("unit_price", 0) or 0)
    quantity = int(body.get("quantity", 0) or 0)
    seller_name = str(body.get("seller_name", "") or "").strip()
    gem_slots = int(body.get("gem_slots", 0) or 0)
    sublimations = str(body.get("sublimations", "") or "").strip()
    notes = str(body.get("notes", "") or "").strip()
    now = datetime.now().isoformat()

    if offer_id is not None:
        db.execute(
            """
            UPDATE hdv_offers
            SET item_name=?, offer_type=?, unit_price=?, quantity=?, seller_name=?, gem_slots=?, sublimations=?, notes=?, is_active=1, updated_at=?
            WHERE id=?
            """,
            (item, offer_type, unit_price, quantity, seller_name, gem_slots, sublimations, notes, now, int(offer_id)),
        )
    else:
        db.execute(
            """
            INSERT INTO hdv_offers (item_name, offer_type, unit_price, quantity, seller_name, gem_slots, sublimations, notes, source, is_active, created_at, updated_at)
            VALUES (?,?,?,?,?,?,?,?,?,?,?,?)
            """,
            (item, offer_type, unit_price, quantity, seller_name, gem_slots, sublimations, notes, "manual", 1, now, now),
        )
    return jsonify({"ok": True})

@flask_app.route("/api/config", methods=["POST"])
def api_config():
    body = request.get_json(force=True)
    for k, v in body.items():
        config.set(k, v)
    return jsonify({"ok": True})


def _build_data():
    s = session.snapshot()
    inv = inventory.get_snapshot()
    hdv_rows = db.query(
        """
        SELECT id, item_name, offer_type, unit_price, quantity, seller_name, gem_slots, sublimations, notes, source, updated_at
        FROM hdv_offers
        WHERE is_active=1
        ORDER BY item_name COLLATE NOCASE ASC, offer_type ASC, unit_price DESC
        """
    )
    hdv_offers = defaultdict(list)
    hdv_offer_index = {}
    for row in hdv_rows:
        offer = {
            "id": int(row[0]),
            "item": row[1],
            "offer_type": row[2],
            "unit_price": float(row[3] or 0),
            "quantity": int(row[4] or 0),
            "seller_name": row[5] or "",
            "gem_slots": int(row[6] or 0),
            "sublimations": row[7] or "",
            "notes": row[8] or "",
            "source": row[9] or "manual",
            "updated_at": row[10] or "",
        }
        hdv_offers[offer["item"]].append(offer)
        hdv_offer_index[str(offer["id"])] = offer

    icon_candidates = {}
    icons = {}
    for name in inv["items"]:
        label = inv.get("manual_label", {}).get(name, "")
        candidates = item_db.get_icon_candidates(label or name)
        if candidates:
            icon_candidates[name] = candidates
        manual_icon = inv.get("manual_icon_url", {}).get(name, "")
        if manual_icon:
            icons[name] = [manual_icon] + candidates
        elif candidates:
            icons[name] = candidates

    category_names = set(inv["items"].keys()) | set(inv.get("prices", {}).keys()) | set(hdv_offers.keys())
    item_categories = {}
    for n in category_names:
        label = inv.get("manual_label", {}).get(n, "")
        item_categories[n] = item_db.category_for_name(label or n)

    base_kamas = int(config.get("base_kamas", 0) or 0)
    manual_kamas_delta = int(config.get("manual_kamas_delta", 0) or 0)
    known_kamas_total = base_kamas + int(s.get("kamas_gained", 0)) + int(s.get("kamas_from_sales", 0)) + manual_kamas_delta

    return {
        "config": config.data,
        "session": s,
        "inventory": inv,
        "hdv_offers": dict(hdv_offers),
        "hdv_offer_index": hdv_offer_index,
        "item_categories": item_categories,
        "known_kamas_total": known_kamas_total,
        "inv_value": inventory.get_estimated_value(),
        "icons": icons,
        "icon_candidates": icon_candidates,
        "watcher": watcher.diagnostics(),
    }


def main():
    global db, config, item_db, inventory, session, watcher

    print("=" * 60)
    print("  WAKFU COMPANION v3.1.0")
    print("  Dashboard web : http://localhost:5000")
    print("=" * 60)

    db = Database(DB_PATH)
    config = UserConfig(CONFIG_FILE)
    item_db = ItemDatabase(CDN_ITEMS, CDN_JOBS_ITEMS, CDN_RESOURCES, CDN_ITEM_TYPES)
    inventory = SmartInventory(db)
    session = Session(db, inventory)
    watcher = LogWatcher(WAKFU_LOG, session, parse_existing=PARSE_EXISTING_LOG)

    print(f"\n  Personnage : {config.get('character')} @ {config.get('server')}")
    print(f"  Log Wakfu  : {WAKFU_LOG}")
    print(f"  Database   : {DB_PATH}")

    if WAKFU_LOG.exists():
        sz = WAKFU_LOG.stat().st_size / 1024
        print(f"  Log trouve : {sz:.1f} KB")
        if PARSE_EXISTING_LOG:
            print("  Rattrapage du log en cours...")
    else:
        print("  Log introuvable (Wakfu pas encore lance ?)")

    watcher.start()
    time.sleep(1)
    print(f"  Events detectes : {watcher.events_detected}")
    print(f"\n  Ouvre http://localhost:{WEB_PORT} dans ton navigateur !")
    print("  Ctrl+C pour arreter\n")

    try:
        flask_app.run(host="127.0.0.1", port=WEB_PORT, debug=False, use_reloader=False)
    except KeyboardInterrupt:
        pass
    finally:
        watcher.stop()
        db.execute("UPDATE sessions SET ended_at=? WHERE id=?",
                   (datetime.now().isoformat(), session.session_id))
        db.close()
        print("\nWakfu Companion arrete.")


if __name__ == "__main__":
    main()
