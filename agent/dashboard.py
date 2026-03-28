"""
Wakfu Assistant — Dashboard Textual interactif
Écran unique, support souris, données persistantes SQLite.
"""
from __future__ import annotations

import json
import os
import re
import sqlite3
import subprocess
import threading
import time
from collections import deque
from datetime import datetime, timedelta
from typing import Optional

from textual import events
from textual.app import App, ComposeResult
from textual.binding import Binding
from textual.screen import ModalScreen
from textual.widgets import (
    DataTable,
    Footer,
    Label,
    Log,
    Static,
    Button,
)
from textual.containers import Container, Vertical, Horizontal

# ─────────────────────────────────────────────────────────────────────────────
# Paths (hardcoded as specified)
# ─────────────────────────────────────────────────────────────────────────────
BASE      = os.path.dirname(os.path.abspath(__file__))
ROOT      = os.path.dirname(BASE)
LOG_PATH  = os.path.join(BASE, "logs", "wakfu_messages.log")
I18N_PATH = os.path.join(ROOT, "logs", "i18n_items_fr.json")
DB_PATH   = os.path.join(ROOT, "logs", "hdv_market.db")
PERM_DB   = os.path.join(ROOT, "docs", "RND", "poc-database", "wakfu_permanent.db")
SYNC_PS1  = os.path.join(ROOT, "docs", "RND", "poc-hdv", "sync_hdv_to_sqlite.ps1")
LAUNCHER  = r"G:\ankama\Ankama Launcher.exe"
AGENT_JAR = os.path.join(BASE, "wakfu-spy-agent.jar")

JAVA_TOOL_OPTIONS = (
    f"-javaagent:{AGENT_JAR}"
    " --add-opens=java.base/java.lang=ALL-UNNAMED"
    " --add-opens=java.base/java.lang.reflect=ALL-UNNAMED"
    " --add-opens=java.base/java.util=ALL-UNNAMED"
)

SERVER_NAME = "ogrest"
CHAR_NAME   = "L'Immortel"

# Job type IDs → names loaded dynamically from permanent DB (job_levels table)
# Populated at startup via load_permanent_data()
JOB_TYPE_MAP: dict[int, str] = {}  # htM ID -> job_name (filled from DB)

# ─────────────────────────────────────────────────────────────────────────────
# Shared state
# ─────────────────────────────────────────────────────────────────────────────
class ItemData:
    __slots__ = ("item_id", "qty", "unique_id")

    def __init__(self, item_id: int, qty: int, unique_id: int = 0):
        self.item_id   = item_id
        self.qty       = qty
        self.unique_id = unique_id


class S:
    lock = threading.Lock()
    # Inventory (session)
    inventory: dict[int, ItemData] = {}
    gained:    dict[int, int] = {}
    lost:      dict[int, int] = {}
    events:    deque = deque(maxlen=300)
    # Prices from HDV DB
    prices: dict[int, tuple] = {}      # item_id -> (sell_price, buy_price)
    i18n:   dict[int, str]  = {}       # item_id -> French name
    # Character data
    char_level: int = 0
    char_xp_remaining: int = 0
    char_xp_gained_session: int = 0
    kamas: Optional[int] = None
    kamas_delta: int = 0
    # Jobs
    jobs: dict[str, dict] = {}         # job_name -> {level, xp_remaining}
    # Status
    wakfu_alive: bool = False
    agent_active: bool = False
    session_start: datetime = datetime.now()
    db_items: int = 0
    db_obs: int = 0
    last_scan: str = "--"
    sync_running: bool = False
    sync_msg: str = ""
    status_msg: str = "Prêt"
    running: bool = True
    # Internal
    _log_mtime: float = 0.0
    _log_pos: int = 0
    _last_line: str = ""


# ─────────────────────────────────────────────────────────────────────────────
# DB helpers
# ─────────────────────────────────────────────────────────────────────────────
def perm_conn() -> sqlite3.Connection:
    conn = sqlite3.connect(PERM_DB, timeout=10)
    conn.execute("PRAGMA journal_mode=WAL")
    return conn


def hdv_conn() -> sqlite3.Connection:
    conn = sqlite3.connect(DB_PATH, timeout=10)
    conn.execute("PRAGMA journal_mode=WAL")
    return conn


def ensure_kamas_table():
    """Create kamas_events table if it doesn't exist."""
    try:
        with perm_conn() as conn:
            conn.execute("""
                CREATE TABLE IF NOT EXISTS kamas_events (
                    id             INTEGER PRIMARY KEY AUTOINCREMENT,
                    server         TEXT,
                    character_name TEXT,
                    source_ts      TEXT,
                    balance        INTEGER,
                    delta          INTEGER,
                    inserted_at    TEXT
                )
            """)
    except Exception:
        pass


def load_i18n() -> dict[int, str]:
    """Load French item names from i18n JSON."""
    result: dict[int, str] = {}
    if not os.path.exists(I18N_PATH):
        return result
    try:
        with open(I18N_PATH, "r", encoding="utf-8", errors="replace") as f:
            raw = json.load(f)
        for k, v in raw.items():
            try:
                result[int(k)] = str(v)
            except (ValueError, TypeError):
                pass
    except Exception:
        pass
    return result


def load_prices() -> dict[int, tuple]:
    """
    Load latest sell/buy prices from HDV market DB.
    Returns dict: item_id -> (sell_price, buy_price). 0 = no data.
    """
    result: dict[int, tuple] = {}
    if not os.path.exists(DB_PATH):
        return result
    try:
        with hdv_conn() as conn:
            cursor = conn.execute(
                "SELECT item_ref_id, side, MIN(unit_price) "
                "FROM market_latest "
                "GROUP BY item_ref_id, side"
            )
            raw: dict[int, dict[str, int]] = {}
            for item_ref_id, side, price in cursor.fetchall():
                if item_ref_id not in raw:
                    raw[item_ref_id] = {}
                raw[item_ref_id][side] = price
            for item_id, sides in raw.items():
                sell = sides.get("sell", 0)
                buy  = sides.get("buy", 0)
                result[item_id] = (sell, buy)
    except Exception:
        pass
    return result


def load_db_stats() -> tuple[int, int]:
    """Returns (distinct_items, total_observations) from market DB."""
    if not os.path.exists(DB_PATH):
        return 0, 0
    try:
        with hdv_conn() as conn:
            items = conn.execute(
                "SELECT COUNT(DISTINCT item_ref_id) FROM market_latest"
            ).fetchone()[0]
            obs = conn.execute(
                "SELECT COUNT(*) FROM market_observations"
            ).fetchone()[0]
            return items, obs
    except Exception:
        return 0, 0


def load_permanent_data():
    """Load job levels, character level, latest XP and kamas from permanent DB."""
    if not os.path.exists(PERM_DB):
        return
    try:
        with perm_conn() as conn:
            # Job levels
            rows = conn.execute(
                "SELECT job_name, level FROM job_levels WHERE server=?",
                (SERVER_NAME,)
            ).fetchall()
            with S.lock:
                for job_name, level in rows:
                    if job_name not in S.jobs:
                        S.jobs[job_name] = {}
                    S.jobs[job_name]["level"] = level
                    if "xp_remaining" not in S.jobs[job_name]:
                        S.jobs[job_name]["xp_remaining"] = 0

            # Character level
            row = conn.execute(
                "SELECT level FROM character_levels "
                "WHERE server=? AND character_name=?",
                (SERVER_NAME, CHAR_NAME)
            ).fetchone()
            if row:
                with S.lock:
                    S.char_level = row[0]

            # Latest XP for character
            row = conn.execute(
                "SELECT xp_remaining FROM xp_events "
                "WHERE server=? AND character_name=? AND entity_type='character' "
                "ORDER BY id DESC LIMIT 1",
                (SERVER_NAME, CHAR_NAME)
            ).fetchone()
            if row:
                with S.lock:
                    S.char_xp_remaining = row[0]

            # Latest kamas
            try:
                row = conn.execute(
                    "SELECT balance FROM kamas_events "
                    "WHERE server=? AND character_name=? "
                    "ORDER BY id DESC LIMIT 1",
                    (SERVER_NAME, CHAR_NAME)
                ).fetchone()
                if row:
                    with S.lock:
                        S.kamas = row[0]
            except Exception:
                pass

    except Exception:
        pass


# ─────────────────────────────────────────────────────────────────────────────
# Log parsing
# ─────────────────────────────────────────────────────────────────────────────
def extract_nested(value: str, key: str) -> Optional[str]:
    """
    Extract a value from a nested struct string like:
    'kW{an=295,wX=12345,Gx=9495,Fe=1,...}'
    Returns string value for key, or None.
    """
    pattern = re.compile(rf"\b{re.escape(key)}=([^,}}\|]+)")
    m = pattern.search(value)
    if m:
        return m.group(1).strip()
    return None


def parse_fields(rest: str) -> dict[str, str]:
    """
    Parse pipe-separated field string into a dict.
    Handles both top-level key=value and preserves nested struct strings.
    """
    result: dict[str, str] = {}
    parts = rest.split("|")
    for part in parts:
        eq = part.find("=")
        if eq > 0:
            k = part[:eq]
            v = part[eq + 1:]
            result[k] = v
    return result


def parse_line(line: str) -> Optional[dict]:
    """
    Parse a single log line.
    Format: HH:MM:SS.mmm|MSG|TYPE|field=value|...|_fieldCount=N
    Returns dict with 'type', 'ts', 'fields' or None if irrelevant/malformed.
    """
    line = line.strip()
    if not line or line.startswith("[x2]"):
        return None

    parts = line.split("|", 4)
    if len(parts) < 3:
        return None

    ts  = parts[0]
    typ = parts[2]

    RELEVANT = {"csE", "csC", "csD", "csf", "csJ", "csr", "col", "ctZ", "ctu", "cmb"}
    if typ not in RELEVANT:
        return None

    rest   = "|".join(parts[3:]) if len(parts) > 3 else ""
    fields = parse_fields(rest)

    return {"ts": ts, "type": typ, "fields": fields}


def _extract_item_fields(fields: dict[str, str]) -> tuple[Optional[int], int, int]:
    """
    From parsed fields (which may contain nested structs), extract:
    - item_id (from Gx)
    - qty (from Fe)
    - unique_id (from wX)
    Searches both top-level and nested struct values.
    """
    item_id: Optional[int] = None
    qty     = 0
    uid     = 0

    # Top-level first
    if "Gx" in fields:
        try: item_id = int(fields["Gx"])
        except ValueError: pass
    if "Fe" in fields:
        try: qty = int(fields["Fe"])
        except ValueError: pass
    if "wX" in fields:
        try: uid = int(fields["wX"])
        except ValueError: pass

    # Search inside nested struct values
    for fv in fields.values():
        if "{" not in fv and "=" not in fv:
            continue
        if item_id is None:
            gx = extract_nested(fv, "Gx")
            if gx:
                try: item_id = int(gx)
                except ValueError: pass
        if qty == 0:
            fe = extract_nested(fv, "Fe")
            if fe:
                try: qty = int(fe)
                except ValueError: pass
        if uid == 0:
            wx = extract_nested(fv, "wX")
            if wx:
                try: uid = int(wx)
                except ValueError: pass

    return item_id, qty, uid


def process_parsed(parsed: dict):
    """
    Update shared state S based on a parsed log event.
    Spawns background DB writes as needed.
    """
    typ    = parsed["type"]
    fields = parsed["fields"]
    ts     = parsed["ts"]
    now_iso = datetime.now().isoformat()

    with S.lock:
        if typ == "csE":
            # Inventory add
            item_id, qty, uid = _extract_item_fields(fields)
            if item_id and qty > 0:
                if item_id in S.inventory:
                    S.inventory[item_id].qty += qty
                else:
                    S.inventory[item_id] = ItemData(item_id, qty, uid)
                S.gained[item_id] = S.gained.get(item_id, 0) + qty
                name = S.i18n.get(item_id, f"#{item_id}")
                S.events.append((ts, f"+{qty}x {name}", "green"))

        elif typ == "csC":
            # Inventory remove
            item_id, qty, _uid = _extract_item_fields(fields)
            if item_id and qty > 0:
                if item_id in S.inventory:
                    S.inventory[item_id].qty = max(0, S.inventory[item_id].qty - qty)
                    if S.inventory[item_id].qty == 0:
                        del S.inventory[item_id]
                S.lost[item_id] = S.lost.get(item_id, 0) + qty
                name = S.i18n.get(item_id, f"#{item_id}")
                S.events.append((ts, f"-{qty}x {name}", "red"))

        elif typ == "csD":
            # Inventory move
            item_id, qty, _uid = _extract_item_fields(fields)
            if item_id:
                name = S.i18n.get(item_id, f"#{item_id}")
                S.events.append((ts, f"~{qty}x {name} (déplacé)", "yellow"))

        elif typ == "csf":
            S.events.append((ts, "Conteneur ouvert/fermé", "dim"))

        elif typ == "csJ":
            S.events.append((ts, "Connexion monde", "cyan"))

        elif typ == "csr":
            S.events.append((ts, "Transaction HDV", "magenta"))

        elif typ == "ctu":
            # Solde kamas post-transaction HDV : meu=SOLDE
            try:
                balance = int(fields.get("meu", 0))
                if balance > 0:
                    old = S.kamas or balance
                    delta = balance - old
                    S.kamas_delta += delta
                    S.kamas = balance
                    sign = f"+{delta:,}" if delta >= 0 else f"{delta:,}"
                    S.events.append((ts, f"Kamas: {balance:,}k ({sign})", "bold yellow"))
                    _kamas_bal, _kamas_delta, _kamas_ts, _kamas_iso = balance, delta, ts, now_iso
            except (ValueError, TypeError):
                pass

        elif typ == "cmb":
            # Récupération kamas depuis HDV : jZV=MONTANT
            try:
                amount = int(fields.get("jZV", 0))
                if amount > 0:
                    S.kamas_delta += amount
                    if S.kamas is not None:
                        S.kamas += amount
                    S.events.append((ts, f"Kamas récupérés HDV: +{amount:,}k", "bold green"))
            except (ValueError, TypeError):
                pass

        elif typ == "col":
            # Job XP: aDh=ACTOR_ID, epe=XP_REMAINING, htM=JOB_TYPE_ID
            job_type_id  = 0
            xp_remaining = 0
            try: job_type_id  = int(fields.get("htM", 0))
            except ValueError: pass
            try: xp_remaining = int(fields.get("epe", 0))
            except ValueError: pass

            if job_type_id:
                job_name = JOB_TYPE_MAP.get(job_type_id, f"Job#{job_type_id}")
                if job_name not in S.jobs:
                    S.jobs[job_name] = {"level": 0, "xp_remaining": xp_remaining}
                else:
                    S.jobs[job_name]["xp_remaining"] = xp_remaining
                S.events.append((ts, f"XP {job_name}: {xp_remaining:,} restant", "blue"))
                # DB write in background (outside lock)
                _jn, _xp, _ts, _iso = job_name, xp_remaining, ts, now_iso

        elif typ == "ctZ":
            # Character XP: epc=XP_REMAINING, bfF=XP_GAINED, mjg=LEVEL
            xp_remaining = 0
            xp_gained    = 0
            level        = 0
            level_up     = 0
            try: xp_remaining = int(fields.get("epc", 0))
            except ValueError: pass
            try: xp_gained    = int(fields.get("bfF", 0))
            except ValueError: pass
            try: level        = int(fields.get("mjg", 0))
            except ValueError: pass

            old_level = S.char_level
            if level > 0:
                S.char_level = level
                if level > old_level and old_level > 0:
                    level_up = 1
                    S.events.append((ts, f"LEVEL UP ! Niveau {level}", "bold green"))

            S.char_xp_remaining = xp_remaining
            S.char_xp_gained_session += xp_gained
            if xp_gained > 0:
                S.events.append((ts, f"XP perso: +{xp_gained:,} (reste {xp_remaining:,})", "green"))

            # capture for bg write
            _xp_g, _xp_r, _lvl, _lu = xp_gained, xp_remaining, level, level_up

    # Background DB writes (after releasing lock)
    if typ == "col" and job_type_id:  # type: ignore[possibly-undefined]
        threading.Thread(
            target=_write_job_xp,
            args=(_jn, _xp, _ts, _iso),  # type: ignore[possibly-undefined]
            daemon=True
        ).start()

    if typ == "ctZ":
        threading.Thread(
            target=_write_char_xp,
            args=(ts, _xp_g, _xp_r, _lvl, _lu, now_iso),  # type: ignore[possibly-undefined]
            daemon=True
        ).start()

    if typ == "ctu" and "_kamas_bal" in dir():
        threading.Thread(
            target=_write_kamas,
            args=(_kamas_ts, _kamas_bal, _kamas_delta, _kamas_iso),  # type: ignore
            daemon=True
        ).start()


def _write_job_xp(job_name: str, xp_remaining: int, source_ts: str, inserted_at: str):
    """Insert a job XP event into the permanent DB."""
    try:
        with perm_conn() as conn:
            conn.execute(
                """INSERT OR IGNORE INTO xp_events
                   (server, character_name, source_ts, absolute_ts,
                    entity_name, entity_type, xp_gained, xp_remaining,
                    level_up, inserted_at)
                   VALUES (?,?,?,?,?,?,?,?,?,?)""",
                (SERVER_NAME, CHAR_NAME, source_ts, "",
                 job_name, "job", 0, xp_remaining, 0, inserted_at)
            )
    except Exception:
        pass


def _write_char_xp(source_ts: str, xp_gained: int, xp_remaining: int,
                   level: int, level_up: int, inserted_at: str):
    """Insert a character XP event and update character_levels."""
    try:
        with perm_conn() as conn:
            conn.execute(
                """INSERT OR IGNORE INTO xp_events
                   (server, character_name, source_ts, absolute_ts,
                    entity_name, entity_type, xp_gained, xp_remaining,
                    level_up, inserted_at)
                   VALUES (?,?,?,?,?,?,?,?,?,?)""",
                (SERVER_NAME, CHAR_NAME, source_ts, "",
                 CHAR_NAME, "character", xp_gained, xp_remaining,
                 level_up, inserted_at)
            )
            if level > 0:
                conn.execute(
                    """INSERT OR REPLACE INTO character_levels
                       (server, character_name, level, updated_at)
                       VALUES (?,?,?,?)""",
                    (SERVER_NAME, CHAR_NAME, level, inserted_at)
                )
    except Exception:
        pass


def _write_kamas(source_ts: str, balance: int, delta: int, inserted_at: str):
    """Insert a kamas event into the permanent DB."""
    try:
        with perm_conn() as conn:
            conn.execute(
                """INSERT INTO kamas_events
                   (server, character_name, source_ts, balance, delta, inserted_at)
                   VALUES (?,?,?,?,?,?)""",
                (SERVER_NAME, CHAR_NAME, source_ts, balance, delta, inserted_at)
            )
    except Exception:
        pass


# ─────────────────────────────────────────────────────────────────────────────
# Log tail
# ─────────────────────────────────────────────────────────────────────────────
def replay_recent(n_lines: int = 400):
    """
    Read the last N lines from the log and process them to populate initial state.
    """
    if not os.path.exists(LOG_PATH):
        return
    try:
        with open(LOG_PATH, "r", encoding="utf-8", errors="replace") as f:
            f.seek(0, 2)
            file_size = f.tell()
            read_size = min(file_size, 200 * 1024)
            f.seek(max(0, file_size - read_size))
            raw = f.read()
            S._log_pos = f.tell()

        lines = raw.splitlines()
        lines = lines[-n_lines:]

        prev = ""
        for line in lines:
            if line == prev:
                continue
            prev = line
            parsed = parse_line(line)
            if parsed:
                process_parsed(parsed)

    except Exception:
        pass


def tail_log():
    """
    Background thread: continuously tail the log file and process new lines.
    """
    # Seek to end of file initially (replay_recent already handled history)
    try:
        if os.path.exists(LOG_PATH):
            with open(LOG_PATH, "r", encoding="utf-8", errors="replace") as f:
                f.seek(0, 2)
                S._log_pos = f.tell()
    except Exception:
        pass

    while S.running:
        try:
            if not os.path.exists(LOG_PATH):
                time.sleep(1)
                continue

            with open(LOG_PATH, "r", encoding="utf-8", errors="replace") as f:
                f.seek(S._log_pos)
                new_lines = f.readlines()
                S._log_pos = f.tell()

            prev = S._last_line
            for line in new_lines:
                line = line.rstrip("\n")
                if line == prev:
                    prev = line
                    continue
                prev = line
                S._last_line = line
                parsed = parse_line(line)
                if parsed:
                    process_parsed(parsed)

            try:
                S._log_mtime = os.path.getmtime(LOG_PATH)
            except Exception:
                pass

        except Exception:
            pass

        time.sleep(0.3)


def monitor_wakfu():
    """
    Background thread: check if Wakfu is alive by log mtime.
    """
    while S.running:
        try:
            if os.path.exists(LOG_PATH):
                mtime = os.path.getmtime(LOG_PATH)
                age   = time.time() - mtime
                with S.lock:
                    S.agent_active = age < 30
                    S.wakfu_alive  = age < 120
            else:
                with S.lock:
                    S.agent_active = False
                    S.wakfu_alive  = False
        except Exception:
            pass
        time.sleep(5)


# ─────────────────────────────────────────────────────────────────────────────
# Formatting helpers
# ─────────────────────────────────────────────────────────────────────────────
def fmt_kamas(n: int) -> str:
    if n == 0:
        return "0"
    if abs(n) >= 1_000_000:
        return f"{n / 1_000_000:.2f}M"
    if abs(n) >= 1_000:
        return f"{n / 1_000:.1f}k"
    return str(n)


def fmt_price(p: int) -> str:
    if p == 0:
        return "--"
    return fmt_kamas(p)


def session_elapsed() -> str:
    delta = datetime.now() - S.session_start
    h, rem = divmod(int(delta.total_seconds()), 3600)
    m, s   = divmod(rem, 60)
    return f"{h:02d}:{m:02d}:{s:02d}"


def run_sync_bg(on_done_callback=None):
    """Run HDV sync PowerShell script in a background thread."""
    def _run():
        with S.lock:
            S.sync_running = True
            S.sync_msg     = "Sync en cours..."
        try:
            subprocess.run(
                ["powershell", "-ExecutionPolicy", "Bypass", "-File", SYNC_PS1],
                capture_output=True,
                text=True,
                timeout=120
            )
            new_prices = load_prices()
            new_stats  = load_db_stats()
            with S.lock:
                S.prices   = new_prices
                S.db_items = new_stats[0]
                S.db_obs   = new_stats[1]
                S.last_scan    = datetime.now().strftime("%H:%M")
                S.sync_running = False
                S.sync_msg     = f"Sync OK ({new_stats[0]} items)"
        except subprocess.TimeoutExpired:
            with S.lock:
                S.sync_running = False
                S.sync_msg     = "Sync: timeout"
        except Exception as e:
            with S.lock:
                S.sync_running = False
                S.sync_msg     = f"Sync err: {e}"
        finally:
            if on_done_callback:
                on_done_callback()

    threading.Thread(target=_run, daemon=True).start()


def clipboard_copy(text: str):
    """Copy text to Windows clipboard via PowerShell."""
    try:
        # Escape single quotes in text
        safe = text.replace("'", "''")
        subprocess.run(
            ["powershell", "-Command", f"Set-Clipboard -Value '{safe}'"],
            capture_output=True,
            timeout=5
        )
    except Exception:
        pass


# ─────────────────────────────────────────────────────────────────────────────
# Modal: Item context menu
# ─────────────────────────────────────────────────────────────────────────────
class ItemContextMenu(ModalScreen):
    """Right-click context menu for an inventory row."""

    BINDINGS = [Binding("escape", "dismiss", "Fermer")]

    CSS = """
    ItemContextMenu {
        align: center middle;
    }
    #modal_container {
        background: $surface;
        border: solid $primary;
        padding: 1 2;
        width: 52;
        height: auto;
    }
    #modal_title {
        text-align: center;
        color: $accent;
        margin-bottom: 1;
    }
    #modal_info {
        margin-bottom: 1;
    }
    .modal_btn {
        margin: 0 1;
    }
    """

    def __init__(self, item_id: int, item_name: str, qty: int,
                 sell: int, buy: int, **kwargs):
        super().__init__(**kwargs)
        self._item_id   = item_id
        self._item_name = item_name
        self._qty       = qty
        self._sell      = sell
        self._buy       = buy

    def compose(self) -> ComposeResult:
        with Container(id="modal_container"):
            yield Label(f"[bold]{self._item_name}[/bold]", id="modal_title")
            yield Label(
                f"Qté: {self._qty}  |  Vente: {fmt_price(self._sell)}"
                f"  |  Achat: {fmt_price(self._buy)}",
                id="modal_info"
            )
            with Horizontal():
                yield Button("📋 Copier le nom",   id="btn_copy",   classes="modal_btn")
                yield Button("💰 Prix HDV détail", id="btn_detail", classes="modal_btn")
                yield Button("✖ Fermer",           id="btn_close",  classes="modal_btn")

    def on_button_pressed(self, event: Button.Pressed) -> None:
        btn_id = event.button.id
        if btn_id == "btn_copy":
            clipboard_copy(self._item_name)
            self.dismiss(None)
        elif btn_id == "btn_detail":
            detail = (
                f"{self._item_name} | "
                f"Vente: {fmt_price(self._sell)} | "
                f"Achat: {fmt_price(self._buy)}"
            )
            clipboard_copy(detail)
            self.dismiss(None)
        elif btn_id == "btn_close":
            self.dismiss(None)


# ─────────────────────────────────────────────────────────────────────────────
# Main App
# ─────────────────────────────────────────────────────────────────────────────
class WakfuDashboard(App):
    """Main Textual dashboard application — single screen."""

    TITLE = "Wakfu Assistant"

    BINDINGS = [
        Binding("l", "launch_game",  "Jeu",     show=True),
        Binding("s", "sync_hdv",     "Sync",    show=True),
        Binding("r", "refresh_data", "Refresh", show=True),
        Binding("q", "quit",         "Quitter", show=True),
    ]

    CSS = """
    Screen {
        layout: grid;
        grid-size: 1 5;
        grid-rows: 1 1fr 4 3 3;
    }
    #header {
        height: 1;
        background: $primary;
        color: $text;
        padding: 0 1;
        text-align: center;
    }
    #body {
        layout: horizontal;
        height: 100%;
    }
    #inv_panel {
        width: 60%;
        border-right: solid $primary;
    }
    #inv_title {
        background: $primary-darken-2;
        color: $text;
        padding: 0 1;
        height: 1;
    }
    #inv_table {
        height: 1fr;
    }
    #events_panel {
        width: 40%;
    }
    #events_title {
        background: $primary-darken-2;
        color: $text;
        padding: 0 1;
        height: 1;
    }
    #events_log {
        height: 1fr;
    }
    #xp_bar {
        height: 4;
        background: $surface;
        border-top: solid $primary;
        padding: 0 1;
    }
    #kamas_bar {
        height: 3;
        background: $surface-darken-1;
        border-top: solid $primary;
        padding: 0 1;
    }
    #hdv_bar {
        height: 3;
        background: $panel;
        border-top: solid $accent;
        padding: 0 1;
    }
    #jobs_label {
        color: $accent;
    }
    """

    def __init__(self):
        super().__init__()
        self._row_item_ids: dict[str, int] = {}  # row_key -> item_id
        self._event_count: int = 0

    def compose(self) -> ComposeResult:
        # Row 1: header
        yield Static("", id="header")

        # Row 2: body (inventory left, events right)
        with Horizontal(id="body"):
            with Vertical(id="inv_panel"):
                yield Static("INVENTAIRE (session)", id="inv_title")
                yield DataTable(id="inv_table", cursor_type="row")
            with Vertical(id="events_panel"):
                yield Static("ÉVÉNEMENTS EN DIRECT", id="events_title")
                yield Log(id="events_log", auto_scroll=True)

        # Row 3: XP bar
        with Vertical(id="xp_bar"):
            yield Label("", id="xp_label")
            yield Label("", id="jobs_label")

        # Row 4: Kamas
        with Vertical(id="kamas_bar"):
            yield Label("", id="kamas_label")

        # Row 5: HDV bar + footer
        with Vertical(id="hdv_bar"):
            yield Label("", id="hdv_label")
            yield Footer()

    def on_mount(self) -> None:
        # Setup DataTable columns
        table = self.query_one("#inv_table", DataTable)
        table.add_columns("Objet", "Qté", "Vente", "Achat", "Total")

        # Populate initial inventory from pre-loaded state
        self._rebuild_inventory_table()

        # Push pre-loaded events into Log
        self._push_initial_events()

        # Start background threads
        threading.Thread(target=tail_log,      daemon=True).start()
        threading.Thread(target=monitor_wakfu, daemon=True).start()

        # Periodic UI refresh
        self.set_interval(0.5, self._tick)

    def _rebuild_inventory_table(self):
        """Rebuild inventory DataTable entirely from S.inventory."""
        table = self.query_one("#inv_table", DataTable)
        table.clear()
        self._row_item_ids.clear()

        with S.lock:
            items  = list(S.inventory.items())
            prices = dict(S.prices)
            i18n   = dict(S.i18n)

        for item_id, item_data in items:
            self._add_or_update_row(table, item_id, item_data.qty, prices, i18n)

    def _add_or_update_row(self, table: DataTable, item_id: int, qty: int,
                           prices: dict, i18n: dict):
        """Add or update a single row in the inventory DataTable."""
        key       = str(item_id)
        name      = i18n.get(item_id, f"#{item_id}")
        sell, buy = prices.get(item_id, (0, 0))
        total     = sell * qty if sell > 0 else 0

        if key in self._row_item_ids:
            try:
                table.update_cell(key, "Objet", name,   update_width=False)
                table.update_cell(key, "Qté",   str(qty), update_width=False)
                table.update_cell(key, "Vente", fmt_price(sell), update_width=False)
                table.update_cell(key, "Achat", fmt_price(buy),  update_width=False)
                table.update_cell(key, "Total", fmt_price(total), update_width=False)
            except Exception:
                pass
        else:
            table.add_row(
                name, str(qty), fmt_price(sell), fmt_price(buy), fmt_price(total),
                key=key
            )
            self._row_item_ids[key] = item_id

    def _push_initial_events(self):
        """Write pre-loaded events to the Log widget."""
        log_widget = self.query_one("#events_log", Log)
        with S.lock:
            evts = list(S.events)
        for ts, text, _ in evts:
            log_widget.write_line(f"{ts}  {text}")
        self._event_count = len(evts)

    # ── Periodic tick ────────────────────────────────────────────────────────
    def _tick(self) -> None:
        """Called every 0.5s — refresh all UI panels from shared state."""
        self._update_header()
        self._flush_new_events()
        self._update_inventory()
        self._update_xp_bar()
        self._update_kamas()
        self._update_hdv_bar()

    def _update_header(self):
        with S.lock:
            wakfu = S.wakfu_alive
            agent = S.agent_active
            level = S.char_level

        lvl_str   = f"Niv.{level}" if level > 0 else ""
        char_info = f"L'Immortel {lvl_str}".strip()

        wakfu_dot   = "● Wakfu" if wakfu else "○ Wakfu"
        agent_dot   = "● Agent" if agent else "○ Agent"
        wakfu_color = "green"   if wakfu else "red"
        agent_color = "green"   if agent else "red"

        hdr = (
            f" {char_info} | Ogrest | Session {session_elapsed()}"
            f" | [{wakfu_color}]{wakfu_dot}[/{wakfu_color}]"
            f" | [{agent_color}]{agent_dot}[/{agent_color}]"
        )
        self.query_one("#header", Static).update(hdr)

    def _flush_new_events(self):
        """Write any new events in S.events to the Log widget."""
        with S.lock:
            evts = list(S.events)

        if len(evts) > self._event_count:
            log_widget = self.query_one("#events_log", Log)
            for ts, text, _ in evts[self._event_count:]:
                log_widget.write_line(f"{ts}  {text}")
            self._event_count = len(evts)

    def _update_inventory(self):
        """Add/update/remove inventory rows to match S.inventory."""
        table = self.query_one("#inv_table", DataTable)

        with S.lock:
            inv     = {k: v.qty for k, v in S.inventory.items()}
            prices  = dict(S.prices)
            i18n    = dict(S.i18n)

        # Add/update existing items
        for item_id, qty in inv.items():
            self._add_or_update_row(table, item_id, qty, prices, i18n)

        # Remove rows for items no longer in inventory
        stale_keys = [k for k in self._row_item_ids if int(k) not in inv]
        for key in stale_keys:
            try:
                table.remove_row(key)
            except Exception:
                pass
            self._row_item_ids.pop(key, None)

    def _update_xp_bar(self):
        with S.lock:
            char_level   = S.char_level
            xp_remaining = S.char_xp_remaining
            xp_session   = S.char_xp_gained_session
            jobs         = {k: dict(v) for k, v in S.jobs.items()}

        lvl_str = f"Niv.{char_level}" if char_level > 0 else "Niv.--"
        xp_s    = f"+{xp_session:,}"  if xp_session > 0 else "--"
        xp_r    = f"{xp_remaining:,}" if xp_remaining > 0 else "--"
        xp_line = f"Personnage {lvl_str}  |  XP session: {xp_s}  |  XP restant: {xp_r}"
        self.query_one("#xp_label", Label).update(xp_line)

        job_parts = []
        for jname, jdata in sorted(jobs.items(), key=lambda x: -x[1].get("level", 0)):
            lvl = jdata.get("level", 0)
            if lvl > 0:
                job_parts.append(f"{jname} {lvl}")
        jobs_line = "Métiers: " + " | ".join(job_parts) if job_parts else "Métiers: En attente..."
        self.query_one("#jobs_label", Label).update(jobs_line)

    def _update_kamas(self):
        with S.lock:
            kamas       = S.kamas
            kamas_delta = S.kamas_delta

        if kamas is not None:
            k_str = fmt_kamas(kamas)
            if kamas_delta > 0:
                d_str = f"  (session: +{fmt_kamas(kamas_delta)})"
            elif kamas_delta < 0:
                d_str = f"  (session: {fmt_kamas(kamas_delta)})"
            else:
                d_str = ""
            kamas_line = f"Kamas: {k_str}{d_str}"
        else:
            kamas_line = "Kamas: En attente..."
        self.query_one("#kamas_label", Label).update(kamas_line)

    def _update_hdv_bar(self):
        with S.lock:
            db_items     = S.db_items
            last_scan    = S.last_scan
            sync_running = S.sync_running
            sync_msg     = S.sync_msg

        if sync_running:
            status = "  [yellow]Sync en cours...[/yellow]"
        elif sync_msg:
            status = f"  {sync_msg}"
        else:
            status = ""

        hdv_line = f"HDV: {db_items:,} items | Scan {last_scan}{status}"
        self.query_one("#hdv_label", Label).update(hdv_line)

    # ── Mouse handling ───────────────────────────────────────────────────────
    def on_mouse_down(self, event: events.MouseDown) -> None:
        """Handle right-click (button=3) to show item context menu."""
        if event.button != 3:
            return

        table = self.query_one("#inv_table", DataTable)

        # Check if the click is within the DataTable widget region
        try:
            region = table.region
            if not region.contains(event.x, event.y):
                return
        except Exception:
            return

        # Determine which row was clicked (relative offset inside table)
        try:
            rel_y = event.y - table.region.y - 1  # -1 for header row
            if rel_y < 0:
                return

            # Find row key by index
            row_keys = list(table.rows.keys())
            if rel_y >= len(row_keys):
                return
            row_key = row_keys[rel_y]
            item_id = self._row_item_ids.get(str(row_key.value))
            if item_id is None:
                # Try using the key value directly
                try:
                    item_id = int(str(row_key.value))
                except (ValueError, TypeError):
                    return

        except Exception:
            return

        with S.lock:
            item_data = S.inventory.get(item_id)
            name      = S.i18n.get(item_id, f"#{item_id}")
            sell, buy = S.prices.get(item_id, (0, 0))

        qty = item_data.qty if item_data else 0
        self.push_screen(ItemContextMenu(item_id, name, qty, sell, buy))

    # ── Actions ──────────────────────────────────────────────────────────────
    def action_launch_game(self) -> None:
        """Launch Wakfu via Ankama Launcher with javaagent."""
        try:
            env = os.environ.copy()
            env["JAVA_TOOL_OPTIONS"] = JAVA_TOOL_OPTIONS
            subprocess.Popen(
                [LAUNCHER],
                env=env,
                creationflags=subprocess.DETACHED_PROCESS | subprocess.CREATE_NEW_PROCESS_GROUP
            )
            with S.lock:
                S.events.append((
                    datetime.now().strftime("%H:%M:%S"),
                    "Launcher Wakfu démarré",
                    "cyan"
                ))
        except Exception as e:
            with S.lock:
                S.events.append((
                    datetime.now().strftime("%H:%M:%S"),
                    f"Erreur launch: {e}",
                    "red"
                ))

    def action_sync_hdv(self) -> None:
        """Run HDV sync PowerShell in background."""
        with S.lock:
            already = S.sync_running
        if not already:
            run_sync_bg()

    def action_refresh_data(self) -> None:
        """Reload prices from DB and refresh inventory table."""
        def _reload():
            new_prices = load_prices()
            new_stats  = load_db_stats()
            with S.lock:
                S.prices   = new_prices
                S.db_items = new_stats[0]
                S.db_obs   = new_stats[1]

        threading.Thread(target=_reload, daemon=True).start()
        self._rebuild_inventory_table()

    def action_quit(self) -> None:
        with S.lock:
            S.running = False
        self.exit()


# ─────────────────────────────────────────────────────────────────────────────
# Entry point
# ─────────────────────────────────────────────────────────────────────────────
def main():
    # 1. Ensure kamas_events table exists in permanent DB
    ensure_kamas_table()

    # 2. Load i18n French names
    S.i18n = load_i18n()

    # 3. Load HDV market prices
    S.prices = load_prices()

    # 4. Load DB stats
    S.db_items, S.db_obs = load_db_stats()
    S.last_scan = datetime.now().strftime("%H:%M")

    # 5. Load permanent character/job data from wakfu_permanent.db
    load_permanent_data()

    # 6. Replay recent log lines to populate initial inventory/events
    replay_recent(400)

    # 7. Launch Textual interactive dashboard
    app = WakfuDashboard()
    app.run()


if __name__ == "__main__":
    main()
