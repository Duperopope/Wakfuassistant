"""Database: SQLite wrapper + schema."""
import sqlite3
import threading
import logging

logger = logging.getLogger("wakfu_companion")


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
                    is_own_offer INTEGER DEFAULT 0,
                    gem_slots INTEGER DEFAULT 0,
                    sublimations TEXT DEFAULT '',
                    notes TEXT DEFAULT '',
                    source TEXT DEFAULT 'manual',
                    is_active INTEGER DEFAULT 1,
                    created_at TEXT,
                    updated_at TEXT
                );
                CREATE TABLE IF NOT EXISTS item_loss_tags (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    item_name TEXT NOT NULL,
                    quantity INTEGER DEFAULT 0,
                    reason TEXT NOT NULL,
                    notes TEXT DEFAULT '',
                    created_at TEXT
                );
                CREATE TABLE IF NOT EXISTS craft_components (
                    output_item TEXT NOT NULL,
                    component_item TEXT NOT NULL,
                    quantity INTEGER DEFAULT 1,
                    created_at TEXT,
                    PRIMARY KEY (output_item, component_item)
                );
                CREATE TABLE IF NOT EXISTS bug_reports (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    created_at TEXT,
                    tab TEXT,
                    context_kind TEXT,
                    context_name TEXT,
                    context_field TEXT,
                    message TEXT,
                    ui_state TEXT,
                    status TEXT DEFAULT 'open'
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
                    manual_truth INTEGER DEFAULT 1,
                    last_updated TEXT
                );
            """)
            self._ensure_user_items_columns()
            self._ensure_metier_levels_columns()
            self._ensure_hdv_offers_columns()
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

    def _ensure_metier_levels_columns(self):
        cols = {row[1] for row in self.conn.execute("PRAGMA table_info(metier_levels)").fetchall()}
        required = {
            "manual_truth": "INTEGER DEFAULT 1",
        }
        for name, col_type in required.items():
            if name not in cols:
                self.conn.execute(f"ALTER TABLE metier_levels ADD COLUMN {name} {col_type}")

    def _ensure_hdv_offers_columns(self):
        cols = {row[1] for row in self.conn.execute("PRAGMA table_info(hdv_offers)").fetchall()}
        required = {
            "is_own_offer": "INTEGER DEFAULT 0",
        }
        for name, col_type in required.items():
            if name not in cols:
                self.conn.execute(f"ALTER TABLE hdv_offers ADD COLUMN {name} {col_type}")

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
