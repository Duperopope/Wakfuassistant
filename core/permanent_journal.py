from __future__ import annotations

# permanent_journal.py — Wakfu Companion Assistant
# Source de vérité unique : all_events.jsonl (structuré) + all_events.log (lisible)
# Migration automatique des journaux legacy au premier démarrage.

import json
import math as _math
import os
import re
import socket
import struct
import time
from datetime import date, datetime, timedelta, timezone
from pathlib import Path

_PROJECT_ROOT        = Path(__file__).resolve().parents[1]
_PERM_DIR            = _PROJECT_ROOT / "logs" / "permanent"
_ALL_EVENTS_LOG      = _PERM_DIR / "all_events.jsonl"      # structuré, source unique (toujours UTF-8)
_ALL_EVENTS_READABLE = _PERM_DIR / "all_events.log"        # companion lisible
_RECORDER_STATE      = _PERM_DIR / "recorder_state.json"

# Sources legacy (lecture seule — absorbées lors de la migration)
_LEGACY_KAMAS_JSONL = _PERM_DIR / "kamas_events.jsonl"
_LEGACY_CHAT_LOG    = _PERM_DIR / "chat_events.log"
_LEGACY_JOURNAL_LOG = _PERM_DIR / "journal_events.log"

# Incrémenter pour forcer un rebuild au prochain démarrage
_JOURNAL_VERSION = 7  # item_gained (ramassé) ajouté

_APPDATA_WAKFU_DIR     = Path(os.environ.get("APPDATA", "")) / "zaap" / "gamesLogs" / "wakfu" / "logs"
_RAW_WAKFU_CHAT_LOG    = _APPDATA_WAKFU_DIR / "wakfu_chat.log"
_RAW_WAKFU_LOG         = _APPDATA_WAKFU_DIR / "wakfu.log"
_RAW_WAKFU_JOURNAL_LOG = _APPDATA_WAKFU_DIR / "wakfu_journal.log"

# ── Patterns timestamp ────────────────────────────────────────────────────────

_CLIENT_TIME_RE = re.compile(r"\b(\d{2}):(\d{2}):(\d{2}),(\d{3})\b")

_WAKFU_TIME_RE = re.compile(
    r"nous sommes le .+?\((\d{1,2})/(\d{1,2})/(\d{2})\)\s+et il est\s+(\d{1,2}):(\d{2})",
    re.IGNORECASE,
)

# Format des fichiers legacy (chat_events.log / journal_events.log) :
# [YYYY-MM-DD HH:MM:SS.mmm][source_file]  INFO HH:MM:SS,mmm ... ligne de log
_LEGACY_LINE_RE = re.compile(
    r"^\[(\d{4}-\d{2}-\d{2}) (\d{2}:\d{2}:\d{2})[\.\d]*\]\[([^\]]+)\]\s*(.*)"
)

# ── Patterns événements ───────────────────────────────────────────────────────

# Canaux de chat joueur reconnus (pour analytique communautaire)
_CHAT_CHANNELS = frozenset({
    "guilde", "alliance", "commerce", "recrutement", "général", "general",
    "zone", "équipe", "groupe", "team", "cogestion",
    "recrutement (fr)", "recrutement (en)", "recrutement (es)", "recrutement (pt)",
})

# [Canal] Pseudo : message  — capture les messages de chat joueur
_CHAT_RE = re.compile(
    r"\[([^\]]+)\]\s+(.+?)\s*:\s*(.*)",
)

# Retour du marché : "Vous avez vendu X objets pour un prix total de Y§ pendant votre absence"
_MARKET_SOLD_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez vendu\s+([0-9\s\u00a0\u202f.,]+)\s+objets?\s+pour un prix total de\s+([0-9\s\u00a0\u202f.,]+)\s*§",
    re.IGNORECASE,
)
# "Vous avez vendu [item] contre X kamas"
_MARKET_SOLD_ITEM_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez vendu\s+(.+?)\s+contre\s+([0-9\s\u00a0\u202f.,]+)\s+kamas?",
    re.IGNORECASE,
)
# Quête réussie / échouée
_QUEST_DONE_RE  = re.compile(r"\[Information \(jeu\)\]\s+Quête accomplie\s*:\s*(.+)", re.IGNORECASE)
_QUEST_FAIL_RE  = re.compile(r"\[Information \(jeu\)\]\s+Quête échouée\s*:\s*(.+)",  re.IGNORECASE)
# Connexion / déconnexion
_LOGIN_RE  = re.compile(r"\[Information \(jeu\)\]\s+Vous êtes maintenant connecté", re.IGNORECASE)
_LOGOUT_RE = re.compile(r"\[Information \(jeu\)\]\s+Vous venez de vous déconnecter", re.IGNORECASE)
# Mort de personnage
_DEATH_RE = re.compile(r"\[Information \(combat\)\]\s+(.+?)\s+est mort", re.IGNORECASE)
_KO_RE    = re.compile(r"\[Information \(combat\)\]\s+(.+?)\s+est KO\s*!", re.IGNORECASE)
_HP_LOSS_RE = re.compile(
    r"\[Information \(combat\)\]\s+(.+?)\s*:\s*-([\d\s\u00a0\u202f]+)\s+PV",
    re.IGNORECASE,
)

_GAIN_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez gagné\s+([0-9\s\u00a0\u202f\xa0.,]+)\s+kamas?\b",
    re.IGNORECASE,
)
_LOSS_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez perdu\s+([0-9\s\u00a0\u202f\xa0.,]+)\s+kamas?\b",
    re.IGNORECASE,
)
# Dépôt marché : "Vous avez perdu Nx [Item Name] ."
_ITEM_LOSS_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez perdu\s+(\d+)x\s+(.+?)\s*\.",
    re.IGNORECASE,
)
# Ramassage : "[Information (jeu)] Vous avez ramassé Nx Nom ."
_ITEM_GAIN_LOOT_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez ramass[eé]\s+(\d+)x\s+(.+?)\s*\.",
    re.IGNORECASE,
)
# Alias non utilisé — gardé pour compatibilité ascendante
_ITEM_GAIN_INV_RE = _ITEM_GAIN_LOOT_RE
_SPELL_RE = re.compile(
    r"\[Information \(combat\)\]\s+(.+?)\s+lance le sort\s+(.+?)(?:\s*\(|\s*$)",
    re.IGNORECASE,
)
_XP_COMBAT_RE = re.compile(
    r"\[Information \(combat\)\]\s+(.+?)\s*:\s*\+([0-9\s\u00a0\u202f.,]+)\s*points d'XP\.\s*Prochain niveau dans\s*:\s*([0-9\s\u00a0\u202f.,]+)",
    re.IGNORECASE,
)
_XP_PROF_RE = re.compile(
    r"\[Information \(jeu\)\]\s+(.+?)\s*:\s*\+([0-9\s\u00a0\u202f.,]+)\s*points d'XP\.\s*Prochain niveau dans\s*:\s*([0-9\s\u00a0\u202f.,]+)",
    re.IGNORECASE,
)
_LEVEL_UP_RE = re.compile(
    r"\[Information \(jeu\)\]\s+(.+?)\s+gagne un niveau.*?niveau\s+(\d+)",
    re.IGNORECASE,
)
_WHOIS_RE = re.compile(
    r"Le joueur\s+(.+?)\s+\(([^)]+)\)\s+est connecté sur le serveur\s+(.+?)(?:\.|$)",
    re.IGNORECASE,
)
_BREED_FL_RE = re.compile(
    r"\[_FL_\].*?fightId=\d+\s+(.+?)\s+breed\s*:\s*(\d+)\s+\[[^\]]+\]\s+isControlledByAI=false",
    re.IGNORECASE,
)
_LOC_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous vous trouvez en\s+\((-?\d+),\s*(-?\d+),\s*(-?\d+)\)\s+de l'instance\s+([0-9\s\u00a0\u202f\xa0]+)",
    re.IGNORECASE,
)
_PING_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Ping\s*:\s*(\d+)\s*ms",
    re.IGNORECASE,
)
_PLAYED_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez joué\s+(.+)",
    re.IGNORECASE,
)

# ── Helpers ───────────────────────────────────────────────────────────────────

def _parse_num(raw: str) -> int | None:
    digits = re.sub(r"[^0-9]", "", raw)
    return int(digits) if digits else None


def _parse_local_iso(raw: str) -> datetime | None:
    raw = str(raw or "").strip()
    if not raw:
        return None
    try:
        fmt = "%Y-%m-%d %H:%M:%S.%f" if "." in raw else "%Y-%m-%d %H:%M:%S"
        return datetime.strptime(raw, fmt)
    except ValueError:
        return None


def _parse_iso_date(raw: str | None) -> date | None:
    if not raw:
        return None
    try:
        return date.fromisoformat(str(raw))
    except ValueError:
        return None


# ── Event parsing ─────────────────────────────────────────────────────────────

def _parse_event(raw_line: str) -> tuple[str, dict] | None:
    m = _GAIN_RE.search(raw_line)
    if m:
        amt = _parse_num(m.group(1))
        if amt and amt > 0:
            return "kamas_gain", {"amount": amt}

    m = _LOSS_RE.search(raw_line)
    if m:
        amt = _parse_num(m.group(1))
        if amt and amt > 0:
            return "kamas_loss", {"amount": amt}

    m = _SPELL_RE.search(raw_line)
    if m:
        spell = m.group(2).strip().rstrip("(").strip()
        if spell:
            return "spell_cast", {"character": m.group(1).strip(), "spell": spell}

    m = _XP_COMBAT_RE.search(raw_line)
    if m:
        xp = _parse_num(m.group(2))
        xp_next = _parse_num(m.group(3))
        if xp and xp > 0:
            return "xp_combat", {
                "character": m.group(1).strip(),
                "xp": xp,
                "xp_to_next": xp_next,
            }

    m = _XP_PROF_RE.search(raw_line)
    if m:
        xp = _parse_num(m.group(2))
        xp_next = _parse_num(m.group(3))
        if xp and xp > 0:
            return "xp_profession", {
                "profession": m.group(1).strip(),
                "xp": xp,
                "xp_to_next": xp_next,
            }

    m = _LEVEL_UP_RE.search(raw_line)
    if m:
        lvl = _parse_num(m.group(2))
        if lvl:
            return "level_up", {"character": m.group(1).strip(), "level": int(lvl)}

    m = _WHOIS_RE.search(raw_line)
    if m:
        return "whois", {
            "character": m.group(1).strip(),
            "account": m.group(2).strip(),
            "server": m.group(3).strip(),
        }

    m = _BREED_FL_RE.search(raw_line)
    if m:
        try:
            bid = int(m.group(2))
        except ValueError:
            return None
        return "breed", {"character": m.group(1).strip(), "breed_id": bid}

    m = _LOC_RE.search(raw_line)
    if m:
        instance = _parse_num(m.group(4))
        return "location", {
            "x": int(m.group(1)),
            "y": int(m.group(2)),
            "z": int(m.group(3)),
            "instance": instance,
        }

    m = _PING_RE.search(raw_line)
    if m:
        return "ping", {"ms": int(m.group(1))}

    m = _PLAYED_RE.search(raw_line)
    if m:
        return "played", {"raw": m.group(1).strip()}

    m = _WAKFU_TIME_RE.search(raw_line)
    if m:
        d, mo, yy, hh, mm = (int(g) for g in m.groups())
        return "time_anchor", {
            "real_date": f"20{yy:02d}-{mo:02d}-{d:02d}",
            "real_time": f"{hh:02d}:{mm:02d}",
        }

    m = _ITEM_LOSS_RE.search(raw_line)
    if m:
        qty_str = m.group(1)
        item = m.group(2).strip().rstrip(".")
        try:
            qty = int(qty_str)
        except ValueError:
            qty = 1
        if qty > 0 and item:
            return "item_lost", {"qty": qty, "item": item}

    m = _ITEM_GAIN_LOOT_RE.search(raw_line)
    if m is None:
        m = _ITEM_GAIN_INV_RE.search(raw_line)
    if m:
        qty = _parse_num(m.group(1)) or 1
        item = m.group(2).strip().rstrip(".")
        if qty > 0 and item:
            return "item_gained", {"qty": qty, "item": item}

    # ── Marché ────────────────────────────────────────────────────────────────
    m = _MARKET_SOLD_RE.search(raw_line)
    if m:
        qty   = _parse_num(m.group(1))
        total = _parse_num(m.group(2))
        if total:
            return "market_sold", {"quantity": qty, "total": total}

    m = _MARKET_SOLD_ITEM_RE.search(raw_line)
    if m:
        price = _parse_num(m.group(2))
        if price:
            return "market_sold_item", {"item": m.group(1).strip(), "price": price}

    # ── Quêtes ────────────────────────────────────────────────────────────────
    m = _QUEST_DONE_RE.search(raw_line)
    if m:
        return "quest_complete", {"name": m.group(1).strip().strip('"')}

    m = _QUEST_FAIL_RE.search(raw_line)
    if m:
        return "quest_fail", {"name": m.group(1).strip().strip('"')}

    # ── Connexion ─────────────────────────────────────────────────────────────
    if _LOGIN_RE.search(raw_line):
        return "login", {}

    if _LOGOUT_RE.search(raw_line):
        return "logout", {}

    # ── Mort ──────────────────────────────────────────────────────────────────
    m = _DEATH_RE.search(raw_line)
    if m:
        return "death", {"character": m.group(1).strip()}

    m = _KO_RE.search(raw_line)
    if m:
        return "ko", {"character": m.group(1).strip()}

    m = _HP_LOSS_RE.search(raw_line)
    if m:
        hp = _parse_num(m.group(2))
        if hp and hp > 0:
            return "hp_loss", {"character": m.group(1).strip(), "amount": hp}

    # ── Chat joueur (canaux identifiés) ───────────────────────────────────────
    # Testé en dernier — pattern large, ne capture que les canaux connus
    m = _CHAT_RE.search(raw_line)
    if m:
        channel = m.group(1).strip().lower()
        if channel in _CHAT_CHANNELS:
            author  = m.group(2).strip()
            message = m.group(3).strip()
            if author:
                return "chat", {
                    "channel": m.group(1).strip(),
                    "author":  author,
                    "message": message,
                }

    return None


def _make_fingerprint(event_type: str, data: dict, client_clock: str) -> str:
    if event_type in ("kamas_gain", "kamas_loss"):
        return f"{client_clock}|{event_type}|{data['amount']}"
    if event_type == "spell_cast":
        return f"{client_clock}|spell|{data['character'].lower()}|{data['spell'].lower()}"
    if event_type in ("xp_combat", "xp_profession"):
        key = data.get("character") or data.get("profession") or ""
        return f"{client_clock}|{event_type}|{key.lower()}|{data.get('xp')}"
    if event_type == "level_up":
        return f"{client_clock}|level_up|{data['character'].lower()}|{data['level']}"
    if event_type == "whois":
        return f"{client_clock}|whois|{data['character'].lower()}|{data['account'].lower()}"
    if event_type == "breed":
        return f"{client_clock}|breed|{data['character'].lower()}|{data['breed_id']}"
    if event_type == "location":
        return f"{client_clock}|loc|{data['x']}|{data['y']}|{data['z']}|{data.get('instance')}"
    if event_type == "ping":
        return f"{client_clock}|ping|{data['ms']}"
    if event_type == "played":
        return f"{client_clock}|played|{data['raw'][:40].lower()}"
    if event_type == "time_anchor":
        return f"{client_clock}|time_anchor|{data['real_date']}"
    if event_type in ("market_sold", "market_sold_item"):
        return f"{client_clock}|{event_type}|{data.get('total') or data.get('price')}"
    if event_type in ("quest_complete", "quest_fail"):
        return f"{client_clock}|{event_type}|{data['name'][:60].lower()}"
    if event_type in ("login", "logout"):
        return f"{client_clock}|{event_type}"
    if event_type == "death":
        return f"{client_clock}|death|{data['character'].lower()}"
    if event_type == "ko":
        return f"{client_clock}|ko|{data['character'].lower()}"
    if event_type == "hp_loss":
        return f"{client_clock}|hp_loss|{data['character'].lower()}|{data.get('amount', 0)}"
    if event_type == "chat":
        return f"{client_clock}|chat|{data['channel'].lower()}|{data['author'].lower()}|{data['message'][:40].lower()}"
    if event_type == "item_lost":
        return f"{client_clock}|item_lost|{data['item'][:40].lower()}|{data.get('qty', 1)}"
    if event_type == "item_gained":
        return f"{client_clock}|item_gained|{data['item'][:40].lower()}|{data.get('qty', 1)}"
    if event_type == "market_deposit":
        return f"{client_clock}|market_deposit|{data['item'][:40].lower()}|{data.get('qty', 1)}|{data.get('tax', 0)}"
    return f"{client_clock}|{event_type}|{json.dumps(data, ensure_ascii=False)[:80]}"


# ── Format lisible ─────────────────────────────────────────────────────────────

def _format_log_line(entry: dict) -> str:
    """Formate une entrée all_events en ligne lisible pour all_events.log."""
    ts    = entry.get("ts_local", "")[:19]   # YYYY-MM-DD HH:MM:SS
    etype = entry.get("type", "unknown")
    src   = entry.get("source_file", "")
    data  = entry.get("data") or {}

    if etype == "kamas_gain":
        detail = f"+{data.get('amount', 0):,} ₭".replace(",", " ")
    elif etype == "kamas_loss":
        detail = f"-{data.get('amount', 0):,} ₭".replace(",", " ")
    elif etype == "spell_cast":
        detail = f"{data.get('character', '?')} › {data.get('spell', '?')}"
    elif etype in ("xp_combat", "xp_profession"):
        key = data.get("character") or data.get("profession") or "?"
        detail = f"{key} +{data.get('xp', 0):,} XP".replace(",", " ")
    elif etype == "level_up":
        detail = f"{data.get('character', '?')} › niveau {data.get('level', '?')}"
    elif etype == "whois":
        detail = f"{data.get('character', '?')} ({data.get('account', '?')}) @ {data.get('server', '?')}"
    elif etype == "breed":
        detail = f"{data.get('character', '?')} breed={data.get('breed_id', '?')}"
    elif etype == "location":
        detail = f"({data.get('x')}, {data.get('y')}, {data.get('z')}) instance {data.get('instance')}"
    elif etype == "ping":
        detail = f"{data.get('ms')} ms"
    elif etype == "played":
        detail = data.get("raw", "")
    elif etype == "time_anchor":
        detail = f"{data.get('real_date')} {data.get('real_time')}"
    elif etype == "market_sold":
        qty = data.get("quantity") or "?"
        total = f"{data.get('total', 0):,}".replace(",", " ")
        detail = f"{qty} objets → {total} ₭"
    elif etype == "market_sold_item":
        price = f"{data.get('price', 0):,}".replace(",", " ")
        detail = f"{data.get('item', '?')} → {price} ₭"
    elif etype == "quest_complete":
        detail = f"✓ {data.get('name', '')}"
    elif etype == "quest_fail":
        detail = f"✗ {data.get('name', '')}"
    elif etype in ("login", "logout"):
        detail = etype
    elif etype == "death":
        detail = f"{data.get('character', '?')} mort"
    elif etype == "chat":
        detail = f"[{data.get('channel', '?')}] {data.get('author', '?')} : {data.get('message', '')[:60]}"
    elif etype == "item_lost":
        detail = f"{data.get('qty', '?')}x {data.get('item', '?')}"
    elif etype == "item_gained":
        qty = data.get("qty", 1)
        item = data.get("item", "?")
        detail = f"+{qty}x {item}"
    elif etype == "market_deposit":
        item = data.get("item", "?")
        qty  = data.get("qty", 1)
        tax  = data.get("tax", 0)
        detail = f"{qty}x {item}  taxe -{tax:,} ₭".replace(",", "\u202f")
    else:
        detail = json.dumps(data, ensure_ascii=False)[:80]

    return f"{ts}  {etype:<18}  {detail:<50}  [{src}]"


# ── Timestamp reconstruction ──────────────────────────────────────────────────

def _count_crossings_and_anchor(path: Path, start_pos: int) -> tuple[int, date | None]:
    crossings = 0
    prev_secs: int | None = None
    latest_anchor: date | None = None
    try:
        with path.open("rb") as fh:
            fh.seek(max(0, start_pos))
            for raw_bytes in fh:
                raw = raw_bytes.decode("utf-8", errors="ignore")
                ta = _WAKFU_TIME_RE.search(raw)
                if ta:
                    d, mo, yy = int(ta.group(1)), int(ta.group(2)), int(ta.group(3))
                    try:
                        latest_anchor = date(2000 + yy, mo, d)
                    except ValueError:
                        pass
                m = _CLIENT_TIME_RE.search(raw)
                if not m:
                    continue
                secs = int(m.group(1)) * 3600 + int(m.group(2)) * 60 + int(m.group(3))
                if prev_secs is not None and (prev_secs - secs) > 3600:
                    crossings += 1
                prev_secs = secs
    except OSError:
        pass
    return crossings, latest_anchor


# ── NTP ───────────────────────────────────────────────────────────────────────

def _query_ntp_utc(server: str, timeout_s: float) -> datetime | None:
    packet = b"\x1b" + 47 * b"\0"
    try:
        with socket.socket(socket.AF_INET, socket.SOCK_DGRAM) as sock:
            sock.settimeout(timeout_s)
            sock.sendto(packet, (server, 123))
            data, _addr = sock.recvfrom(48)
    except OSError:
        return None
    if len(data) < 48:
        return None
    sec_1900, frac = struct.unpack("!II", data[40:48])
    sec_1970 = sec_1900 - 2208988800
    if sec_1970 <= 0:
        return None
    return datetime.fromtimestamp(sec_1970 + frac / float(1 << 32), tz=timezone.utc)


def _get_atomic_offset_ms(state: dict) -> float | None:
    sync = state.get("time_sync")
    if not isinstance(sync, dict):
        sync = {}
    now_mono   = time.monotonic()
    valid_until = float(sync.get("valid_until_mono", 0.0) or 0.0)
    cached = sync.get("offset_ms")
    if cached is not None and now_mono <= valid_until:
        try:
            return float(cached)
        except (TypeError, ValueError):
            pass
    local_utc = datetime.now(timezone.utc)
    ntp_utc = None
    for server in ("time.windows.com", "pool.ntp.org", "time.google.com"):
        ntp_utc = _query_ntp_utc(server, timeout_s=0.8)
        if ntp_utc is not None:
            break
    if ntp_utc is None:
        sync.update({"offset_ms": None, "status": "unavailable",
                     "checked_at_utc": local_utc.isoformat(),
                     "valid_until_mono": now_mono + 120.0})
        state["time_sync"] = sync
        _write_state(state)
        return None
    offset_ms = (ntp_utc - local_utc).total_seconds() * 1000.0
    sync.update({"offset_ms": offset_ms, "status": "ok",
                 "checked_at_utc": local_utc.isoformat(),
                 "valid_until_mono": now_mono + 600.0})
    state["time_sync"] = sync
    _write_state(state)
    return offset_ms


# ── État ──────────────────────────────────────────────────────────────────────

def _read_state() -> dict:
    if not _RECORDER_STATE.exists():
        return {}
    try:
        return json.loads(_RECORDER_STATE.read_text(encoding="utf-8"))
    except (OSError, ValueError, TypeError):
        return {}


def _write_state(state: dict):
    try:
        _PERM_DIR.mkdir(parents=True, exist_ok=True)
        _RECORDER_STATE.write_text(
            json.dumps(state, ensure_ascii=False, indent=2), encoding="utf-8"
        )
    except OSError:
        pass


# ── Sources live ──────────────────────────────────────────────────────────────

def _iter_raw_sources() -> list[Path]:
    """Retourne tous les fichiers log Wakfu live existants, du plus ancien au plus récent."""
    candidates: dict[str, Path] = {}
    patterns = ("wakfu_chat.log*", "wakfu.log*", "wakfu_journal.log*")
    for pat in patterns:
        for path in _APPDATA_WAKFU_DIR.glob(pat):
            if path.is_file():
                candidates[str(path)] = path
    existing: list[tuple[float, Path]] = []
    for path in candidates.values():
        try:
            st = path.stat()
        except OSError:
            continue
        if st.st_size > 0:
            existing.append((float(st.st_mtime), path))
    existing.sort(key=lambda item: item[0])
    return [path for _mtime, path in existing]


def _iter_new_lines(path: Path, start_pos: int):
    with path.open("rb") as fh:
        fh.seek(max(0, start_pos))
        while True:
            offset = fh.tell()
            chunk = fh.readline()
            if not chunk:
                break
            yield offset, chunk.decode("utf-8", errors="ignore")


# ── Migration des sources legacy ──────────────────────────────────────────────

def _migrate_kamas_events(fps_set: set[str], fps_list: list[str]) -> list[dict]:
    """
    Lit kamas_events.jsonl (et ses backups) — utilise resolved_client_local
    comme timestamp exact. Retourne une liste d'entrées all_events prêtes à écrire.
    """
    sources: list[Path] = sorted(_PERM_DIR.glob("kamas_events.backup_*.jsonl"))
    if _LEGACY_KAMAS_JSONL.exists():
        sources.append(_LEGACY_KAMAS_JSONL)
    # Inclure aussi la version absorbée (renommée après le premier rebuild)
    absorbed = _LEGACY_KAMAS_JSONL.with_suffix(".absorbed")
    if absorbed.exists() and absorbed not in sources:
        sources.append(absorbed)

    entries: list[dict] = []
    for src in sources:
        try:
            lines = src.read_text(encoding="utf-8", errors="ignore").splitlines()
        except OSError:
            continue
        for line in lines:
            if not line.strip():
                continue
            try:
                data = json.loads(line)
            except (ValueError, TypeError):
                continue
            if not isinstance(data, dict):
                continue
            kind = str(data.get("kind") or "").strip().lower()
            if kind not in ("gain", "loss"):
                continue
            try:
                amount = int(data.get("amount") or 0)
            except (TypeError, ValueError):
                continue
            # Utilise resolved_client_local (reconstruit au moment de la capture)
            ts_str = str(data.get("resolved_client_local") or data.get("ts_local") or "")
            if not ts_str:
                continue
            client_time = str(data.get("client_time") or data.get("ts_client") or "")
            event_type = "kamas_gain" if kind == "gain" else "kamas_loss"
            fp = _make_fingerprint(event_type, {"amount": amount}, client_time)
            if fp in fps_set:
                continue
            fps_set.add(fp)
            fps_list.append(fp)
            entries.append({
                "ts_local":    ts_str,
                "ts_client":   client_time,
                "source_file": str(data.get("source_file") or src.name),
                "type":        event_type,
                "data":        {"amount": amount},
            })
    return entries


def _migrate_legacy_log_file(path: Path, fps_set: set[str], fps_list: list[str]) -> list[dict]:
    """
    Lit chat_events.log ou journal_events.log.
    Format : [YYYY-MM-DD HH:MM:SS.mmm][source_file]  raw_game_log_line
    La date système [YYYY-MM-DD] est utilisée comme date de l'événement.
    Le timestamp client dans raw_line donne l'heure précise.
    """
    if not path.exists():
        return []
    entries: list[dict] = []
    try:
        lines = path.read_text(encoding="utf-8", errors="ignore").splitlines()
    except OSError:
        return []

    for line in lines:
        m_sys = _LEGACY_LINE_RE.match(line)
        if not m_sys:
            continue
        sys_date_str = m_sys.group(1)    # YYYY-MM-DD
        source_file  = m_sys.group(3)    # e.g. "wakfu.log"
        raw_content  = m_sys.group(4)    # la ligne brute du jeu

        try:
            sys_date = date.fromisoformat(sys_date_str)
        except ValueError:
            continue

        m_ct = _CLIENT_TIME_RE.search(raw_content)
        if not m_ct:
            continue
        h, mn, s, ms = int(m_ct.group(1)), int(m_ct.group(2)), int(m_ct.group(3)), int(m_ct.group(4))
        client_clock = f"{h:02d}:{mn:02d}:{s:02d}.{ms:03d}"

        evt = _parse_event(raw_content)
        if evt is None:
            continue
        event_type, event_data = evt

        fp = _make_fingerprint(event_type, event_data, client_clock)
        if fp in fps_set:
            continue
        fps_set.add(fp)
        fps_list.append(fp)

        ts_local = datetime(sys_date.year, sys_date.month, sys_date.day, h, mn, s, ms * 1000)
        entries.append({
            "ts_local":    ts_local.strftime("%Y-%m-%d %H:%M:%S.%f")[:-3],
            "ts_client":   client_clock,
            "source_file": source_file,
            "type":        event_type,
            "data":        event_data,
        })
    return entries


# ── Absorption sources externes (archives, realtime, racine) ─────────────────

_GAME_LOG_PAT = re.compile(r"(?:^|[\\/])wakfu(?:_chat|_journal)?\.log(?:\.\d+)?$", re.IGNORECASE)
_ARCHIVE_DATE_PAT = re.compile(r"(\d{4})(\d{2})(\d{2})_(\d{2})(\d{2})(\d{2})")


def _date_from_name(name: str) -> date | None:
    m = _ARCHIVE_DATE_PAT.search(name)
    if m:
        try:
            return date(int(m.group(1)), int(m.group(2)), int(m.group(3)))
        except ValueError:
            return None
    return None


_KAMAS_TYPES = frozenset({"kamas_gain", "kamas_loss"})


def _market_detect(event_type: str, event_data: dict, client_clock: str,
                   pending: list) -> tuple[str | None, dict | None, bool]:
    """
    Détecte les dépôts marché : item_lost suivi de kamas_loss à la même seconde.
    pending = [dict | None]  (boîte mutable pour l'état entre appels)
    Retourne (event_type, event_data, should_emit).
    """
    sec = client_clock[:8]  # HH:MM:SS

    if event_type == "item_lost":
        pending[0] = {"item": event_data["item"], "qty": event_data["qty"], "sec": sec}
        return None, None, False  # ne pas émettre item_lost seul

    if event_type == "kamas_loss" and pending[0] is not None:
        p = pending[0]
        if sec == p["sec"]:
            # Taxe de dépôt marché confirmée → émettre market_deposit (analytics)
            # Le kamas_loss original est conservé pour le solde (should_emit=True)
            pending[0] = None
            return "market_deposit", {
                "item": p["item"],
                "qty":  p["qty"],
                "tax":  event_data["amount"],
            }, True  # will emit market_deposit; caller also emits kamas_loss
        else:
            pending[0] = None
    elif pending[0] is not None:
        pending[0] = None

    return event_type, event_data, True


def _market_tax_rate(days: int, territory_pct: int) -> float:
    """Taux de taxe effectif pour une durée de dépôt.
    28j = 100 %, 14j = 50 %, 7j = 33.33 % du taux territoire.
    """
    if days == 28:
        factor = 1.0
    elif days == 14:
        factor = 0.5
    elif days == 7:
        factor = 1.0 / 3.0
    else:
        factor = days / 28.0
    return territory_pct / 100.0 * factor


def estimate_market_price(
    tax: int,
    qty: int,
    days: int = 28,
    territory_pct: int = 5,
) -> tuple[int, int]:
    """Estime la fourchette de prix/unité d'après la taxe de dépôt.

    Le jeu calcule : taxe = round_half_up(prix × qty × taux)
    Donc : (taxe − 0.5) / (qty × taux)  ≤  prix  <  (taxe + 0.5) / (qty × taux)

    Retourne (prix_min, prix_max) par unité.
    """
    rate = _market_tax_rate(days, territory_pct)
    if rate <= 0 or qty <= 0 or tax <= 0:
        return (0, 0)
    denom = qty * rate
    min_price = _math.ceil((tax - 0.5) / denom)
    max_price = _math.ceil((tax + 0.5) / denom) - 1
    if max_price < min_price:
        max_price = min_price
    return (min_price, max_price)


def _parse_raw_source(path: Path, fps_set: set[str], fps_list: list[str],
                      archive_date: date | None = None,
                      skip_kamas: bool = False) -> list[dict]:
    """
    Lit un fichier log Wakfu brut (format natif : HH:MM:SS,mmm ou INFO HH:MM:SS,mmm).
    Utilise archive_date comme ancre de date si fournie (plus fiable que le mtime).
    skip_kamas=True exclut kamas_gain/kamas_loss (pour le rebuild historique multi-perso).
    Retourne la liste d'entrées all_events.
    """
    try:
        file_size = int(path.stat().st_size)
        if file_size == 0:
            return []
        ref_mtime = datetime.fromtimestamp(path.stat().st_mtime)
    except OSError:
        return []

    crossings, anchor = _count_crossings_and_anchor(path, 0)
    if anchor is not None:
        current_date = anchor
    elif archive_date is not None:
        # L'archive date est la date de capture → remonter en arrière selon les crossings
        current_date = archive_date - timedelta(days=crossings)
    else:
        current_date = (ref_mtime - timedelta(days=crossings)).date()

    last_client_secs: int | None = None
    entries: list[dict] = []
    _pending_item: list = [None]

    for _, raw_line in _iter_new_lines(path, 0):
        # Les fichiers projet-legacy ont le préfixe [timestamp][source] — les ignorer ici
        # (ils sont gérés par _migrate_legacy_log_file)
        if _LEGACY_LINE_RE.match(raw_line):
            continue

        m_ts = _CLIENT_TIME_RE.search(raw_line)
        if not m_ts:
            continue
        h, mn, s, ms = int(m_ts.group(1)), int(m_ts.group(2)), int(m_ts.group(3)), int(m_ts.group(4))
        client_secs  = h * 3600 + mn * 60 + s
        client_clock = f"{h:02d}:{mn:02d}:{s:02d}.{ms:03d}"

        if last_client_secs is not None and (last_client_secs - client_secs) > 3600:
            current_date += timedelta(days=1)
        last_client_secs = client_secs

        ta = _WAKFU_TIME_RE.search(raw_line)
        if ta:
            d_, mo_, yy_ = int(ta.group(1)), int(ta.group(2)), int(ta.group(3))
            try:
                current_date = date(2000 + yy_, mo_, d_)
            except ValueError:
                pass

        ts_local = datetime(current_date.year, current_date.month, current_date.day,
                            h, mn, s, ms * 1000)
        ts_local_str = ts_local.strftime("%Y-%m-%d %H:%M:%S.%f")[:-3]

        evt = _parse_event(raw_line)
        if evt is None:
            _pending_item[0] = None  # flush pending on parse failure
            continue
        event_type, event_data = evt

        if skip_kamas and event_type in _KAMAS_TYPES:
            _pending_item[0] = None
            continue

        # Market deposit detection
        if event_type == "item_lost":
            md_type, md_data, _ = _market_detect(event_type, event_data, client_clock, _pending_item)
            continue  # never emit item_lost standalone

        if event_type == "kamas_loss" and _pending_item[0] is not None:
            md_type, md_data, _ = _market_detect(event_type, event_data, client_clock, _pending_item)
            if md_type == "market_deposit":
                # Emit market_deposit for analytics
                fp_md = _make_fingerprint("market_deposit", md_data, client_clock)
                if fp_md not in fps_set:
                    fps_set.add(fp_md)
                    fps_list.append(fp_md)
                    entries.append({
                        "ts_local":    ts_local_str,
                        "ts_client":   client_clock,
                        "source_file": path.name,
                        "type":        "market_deposit",
                        "data":        md_data,
                    })
                # Then fall through to also emit kamas_loss for balance
        elif _pending_item[0] is not None:
            _pending_item[0] = None

        fp = _make_fingerprint(event_type, event_data, client_clock)
        if fp in fps_set:
            continue
        fps_set.add(fp)
        fps_list.append(fp)

        entries.append({
            "ts_local":    ts_local_str,
            "ts_client":   client_clock,
            "source_file": path.name,
            "type":        event_type,
            "data":        event_data,
        })

    return entries


def _absorb_external_sources(fps_set: set[str], fps_list: list[str]) -> list[dict]:
    """
    Absorbe toutes les sources externes de logs Wakfu :
      - logs/archives/auto/wakfu_logs_*  (dossiers et ZIPs)
      - logs/archives/*.zip              (archive manuelle)
      - logs/realtime/wakfu*.log*        (logs realtime copiés)
      - logs/wakfu_chat.log              (racine projet)
      - logs/wakfu_journal.log           (racine projet)
    Après absorption, supprime les fichiers source.
    Retourne la liste de toutes les entrées parsées.
    """
    import zipfile
    import shutil
    import tempfile

    all_entries: list[dict] = []
    to_delete: list[Path] = []

    def _absorb_file(path: Path, archive_date: date | None = None):
        # skip_kamas=True : les logs bruts couvrent tous les personnages,
        # les kamas sont fournis exclusivement par _migrate_kamas_events()
        entries = _parse_raw_source(path, fps_set, fps_list, archive_date, skip_kamas=True)
        all_entries.extend(entries)

    def _absorb_zip(zip_path: Path, archive_date: date | None = None):
        try:
            with zipfile.ZipFile(zip_path, "r") as zf:
                names = [n for n in zf.namelist() if _GAME_LOG_PAT.search(n)]
                # Exclure les fichiers project_logs/ (déjà absorbés via legacy migration)
                names = [n for n in names if "project_logs" not in n.lower()]
                if not names:
                    return
                with tempfile.TemporaryDirectory() as tmpdir:
                    for name in names:
                        try:
                            zf.extract(name, tmpdir)
                            tmp = Path(tmpdir) / name
                            if tmp.exists() and tmp.stat().st_size > 0:
                                _absorb_file(tmp, archive_date)
                        except Exception:
                            continue
        except Exception:
            pass

    # ── logs/archives/auto/ ───────────────────────────────────────────────────
    auto_dir = _PROJECT_ROOT / "logs" / "archives" / "auto"
    if auto_dir.exists():
        seen_zips: set[str] = set()
        for item in sorted(auto_dir.iterdir()):
            if item.name == "archive_runs.log":
                to_delete.append(item)
                continue
            arc_date = _date_from_name(item.name)
            if item.suffix == ".zip" and item.is_file():
                _absorb_zip(item, arc_date)
                to_delete.append(item)
                seen_zips.add(item.stem)
            elif item.is_dir() and item.name.startswith("wakfu_logs_"):
                for pat in ("wakfu_chat.log*", "wakfu.log*", "wakfu_journal.log*"):
                    for f in sorted(item.glob(pat)):
                        _absorb_file(f, arc_date)
                to_delete.append(item)

    # ── logs/archives/*.zip (archive manuelle) ────────────────────────────────
    archives_root = _PROJECT_ROOT / "logs" / "archives"
    if archives_root.exists():
        for item in archives_root.iterdir():
            if item.suffix == ".zip" and item.is_file():
                arc_date = _date_from_name(item.name)
                _absorb_zip(item, arc_date)
                to_delete.append(item)
            elif item.is_dir() and item.name.startswith("archive_"):
                arc_date = _date_from_name(item.name)
                for pat in ("wakfu_chat.log*", "wakfu.log*", "wakfu_journal.log*"):
                    for f in sorted(item.rglob(pat)):
                        if "project_logs" not in str(f).lower():
                            _absorb_file(f, arc_date)
                to_delete.append(item)

    # ── logs/realtime/ — game logs parsés + tous les autres logs Wakfu supprimés
    realtime_dir = _PROJECT_ROOT / "logs" / "realtime"
    if realtime_dir.exists():
        for pat in ("wakfu_chat.log*", "wakfu.log*", "wakfu_journal.log*"):
            for f in sorted(realtime_dir.glob(pat)):
                _absorb_file(f)
                to_delete.append(f)
        # Tous les autres logs Wakfu (animation, camera, fileLoading, lua, etc.)
        # ne contiennent pas d'événements utiles mais viennent du jeu → nettoyer
        absorbed = {str(f) for f in to_delete}
        for f in realtime_dir.glob("wakfu_*.log*"):
            if f.is_file() and str(f) not in absorbed:
                to_delete.append(f)

    # ── logs/ racine ──────────────────────────────────────────────────────────
    logs_root = _PROJECT_ROOT / "logs"
    for fname in ("wakfu_chat.log", "wakfu_journal.log"):
        f = logs_root / fname
        if f.exists():
            _absorb_file(f)
            to_delete.append(f)

    # ── Nettoyage ─────────────────────────────────────────────────────────────
    for item in to_delete:
        try:
            if item.is_dir():
                shutil.rmtree(item, ignore_errors=True)
            elif item.is_file():
                item.unlink(missing_ok=True)
        except OSError:
            pass

    return all_entries


# ── Rebuild complet ───────────────────────────────────────────────────────────

def rebuild_all_events() -> dict[str, int]:
    """
    Reconstruit all_events.jsonl et all_events.log depuis zéro :
    1. Absorbe kamas_events.jsonl (timestamps exacts via resolved_client_local)
    2. Absorbe chat_events.log et journal_events.log (date système + heure client)
    3. Lit tous les logs Wakfu live depuis le début (AppData)
    4. Déduplique, trie chronologiquement, écrit les deux fichiers
    Retourne {"all": N, "kamas": N_kamas}.
    """
    _PERM_DIR.mkdir(parents=True, exist_ok=True)
    state = _read_state()
    offset_ms = _get_atomic_offset_ms(state)

    fps_list: list[str] = []
    fps_set:  set[str]  = set()

    all_entries: list[dict] = []

    # ── 1. Migration kamas_events.jsonl (timestamps fiables) ─────────────────
    kamas_entries = _migrate_kamas_events(fps_set, fps_list)
    all_entries.extend(kamas_entries)

    # ── 2. Migration legacy logs (chat_events.log, journal_events.log) ───────
    for legacy_path in (_LEGACY_CHAT_LOG, _LEGACY_JOURNAL_LOG):
        legacy_entries = _migrate_legacy_log_file(legacy_path, fps_set, fps_list)
        all_entries.extend(legacy_entries)

    # ── 3. Absorption archives, realtime, racine ──────────────────────────────
    external_entries = _absorb_external_sources(fps_set, fps_list)
    all_entries.extend(external_entries)

    # ── 4. Lecture live depuis AppData (depuis position 0) ───────────────────
    sources_list = _iter_raw_sources()
    all_sources_state: dict = {}
    _rebuild_pending: list = [None]

    for source in sources_list:
        source_key = str(source)
        try:
            ref_mtime = datetime.fromtimestamp(source.stat().st_mtime)
            file_size = int(source.stat().st_size)
        except OSError:
            continue

        crossings, anchor = _count_crossings_and_anchor(source, 0)
        current_date: date = anchor if anchor is not None else (ref_mtime - timedelta(days=crossings)).date()
        last_client_secs: int | None = None
        _rebuild_pending[0] = None

        for _, raw_line in _iter_new_lines(source, 0):
            m_ts = _CLIENT_TIME_RE.search(raw_line)
            if not m_ts:
                continue
            h, mn, s, ms = int(m_ts.group(1)), int(m_ts.group(2)), int(m_ts.group(3)), int(m_ts.group(4))
            client_secs  = h * 3600 + mn * 60 + s
            client_clock = f"{h:02d}:{mn:02d}:{s:02d}.{ms:03d}"

            if last_client_secs is not None and (last_client_secs - client_secs) > 3600:
                current_date += timedelta(days=1)
            last_client_secs = client_secs

            ta = _WAKFU_TIME_RE.search(raw_line)
            if ta:
                d_, mo_, yy_ = int(ta.group(1)), int(ta.group(2)), int(ta.group(3))
                try:
                    current_date = date(2000 + yy_, mo_, d_)
                except ValueError:
                    pass

            ts_local = datetime(current_date.year, current_date.month, current_date.day,
                                h, mn, s, ms * 1000)
            ts_local_str = ts_local.strftime("%Y-%m-%d %H:%M:%S.%f")[:-3]

            evt = _parse_event(raw_line)
            if evt is None:
                _rebuild_pending[0] = None
                continue
            event_type, event_data = evt

            # Les fichiers rotatifs : on ignore les kamas (multi-perso, dates fausses)
            if event_type in _KAMAS_TYPES and re.search(r'\.\d+$', source.name):
                _rebuild_pending[0] = None
                continue

            # Market deposit detection
            if event_type == "item_lost":
                _market_detect(event_type, event_data, client_clock, _rebuild_pending)
                continue

            if event_type == "kamas_loss" and _rebuild_pending[0] is not None:
                md_type, md_data, _ = _market_detect(event_type, event_data, client_clock, _rebuild_pending)
                if md_type == "market_deposit":
                    fp_md = _make_fingerprint("market_deposit", md_data, client_clock)
                    if fp_md not in fps_set:
                        fps_set.add(fp_md)
                        fps_list.append(fp_md)
                        all_entries.append({
                            "ts_local":      ts_local_str,
                            "ts_client":     client_clock,
                            "ntp_offset_ms": round(float(offset_ms), 3) if offset_ms is not None else None,
                            "source_file":   source.name,
                            "type":          "market_deposit",
                            "data":          md_data,
                        })
            elif _rebuild_pending[0] is not None:
                _rebuild_pending[0] = None

            fp = _make_fingerprint(event_type, event_data, client_clock)
            if fp in fps_set:
                continue
            fps_set.add(fp)
            fps_list.append(fp)

            all_entries.append({
                "ts_local":      ts_local_str,
                "ts_client":     client_clock,
                "ntp_offset_ms": round(float(offset_ms), 3) if offset_ms is not None else None,
                "source_file":   source.name,
                "type":          event_type,
                "data":          event_data,
            })

        try:
            final_pos = int(source.stat().st_size)
        except OSError:
            final_pos = 0
        all_sources_state[source_key] = {
            "pos":              final_pos,
            "current_date":     current_date.isoformat(),
            "last_client_secs": last_client_secs,
        }

    # ── 5. Tri chronologique ──────────────────────────────────────────────────
    def _sort_key(e: dict) -> str:
        return e.get("ts_local") or ""

    all_entries.sort(key=_sort_key)

    # ── 5. Écriture des deux fichiers ─────────────────────────────────────────
    count_all   = len(all_entries)
    count_kamas = sum(1 for e in all_entries if e.get("type") in ("kamas_gain", "kamas_loss"))

    try:
        with (_ALL_EVENTS_LOG.open("w", encoding="utf-8", newline="") as jfh,
              _ALL_EVENTS_READABLE.open("w", encoding="utf-8", newline="") as lfh):
            for entry in all_entries:
                jfh.write(json.dumps(entry, ensure_ascii=False) + "\n")
                lfh.write(_format_log_line(entry) + "\n")
    except OSError:
        pass

    # ── 6. Mise à jour de l'état ──────────────────────────────────────────────
    state["all_sources"]     = all_sources_state
    state["all_fps"]         = fps_list[-12_000:]
    state["journal_version"] = _JOURNAL_VERSION
    _write_state(state)

    # ── 7. Nettoyage des fichiers legacy (absorbés, plus nécessaires) ──────────
    _cleanup_legacy_files()

    return {"all": count_all, "kamas": count_kamas}


def _cleanup_legacy_files():
    """Supprime les fichiers legacy après migration réussie dans all_events.jsonl."""
    to_remove = [
        _LEGACY_CHAT_LOG,
        _LEGACY_JOURNAL_LOG,
    ]
    # Sauvegardes kamas
    to_remove.extend(_PERM_DIR.glob("kamas_events.backup_*.jsonl"))
    # recorder_status.log (ancien format de debug)
    to_remove.append(_PERM_DIR / "recorder_status.log")

    for path in to_remove:
        try:
            if path.exists():
                path.unlink()
        except OSError:
            pass

    # kamas_events.jsonl : renommer en .absorbed pour référence, pas supprimer
    if _LEGACY_KAMAS_JSONL.exists():
        target = _LEGACY_KAMAS_JSONL.with_suffix(".absorbed")
        try:
            _LEGACY_KAMAS_JSONL.rename(target)
        except OSError:
            pass


# ── Sync incrémental (appende uniquement les nouveaux événements) ─────────────

def sync_permanent_journal() -> dict[str, int]:
    """
    Appende dans all_events.jsonl/all_events.log les nouvelles lignes
    des logs Wakfu live depuis la dernière position connue.
    Si journal_version a changé, déclenche un rebuild complet.
    Retourne {"all": N}.
    """
    _PERM_DIR.mkdir(parents=True, exist_ok=True)
    state = _read_state()

    # Rebuild si version obsolète ou journal vide
    if (state.get("journal_version") != _JOURNAL_VERSION
            or not _ALL_EVENTS_LOG.exists()
            or _ALL_EVENTS_LOG.stat().st_size == 0):
        return rebuild_all_events()

    sources_list = _iter_raw_sources()
    if not sources_list:
        return {"all": 0}

    all_sources_state: dict = state.get("all_sources") if isinstance(state.get("all_sources"), dict) else {}
    all_fps_list: list[str] = state.get("all_fps") if isinstance(state.get("all_fps"), list) else []
    all_fps_set: set[str] = set(str(v) for v in all_fps_list if isinstance(v, str))

    offset_ms = _get_atomic_offset_ms(state)
    count_all = 0
    _sync_pending: list = [None]

    try:
        with (_ALL_EVENTS_LOG.open("a", encoding="utf-8", newline="") as jfh,
              _ALL_EVENTS_READABLE.open("a", encoding="utf-8", newline="") as lfh):
            for source in sources_list:
                source_key = str(source)
                all_src = all_sources_state.get(source_key)
                if not isinstance(all_src, dict):
                    all_src = {}

                try:
                    ref_mtime = datetime.fromtimestamp(source.stat().st_mtime)
                    file_size = int(source.stat().st_size)
                except OSError:
                    continue

                start_pos = int(all_src.get("pos", 0) or 0)
                if start_pos < 0 or start_pos > file_size:
                    start_pos = 0

                current_date: date | None = _parse_iso_date(all_src.get("current_date"))
                last_client_secs: int | None = all_src.get("last_client_secs")

                if current_date is None:
                    crossings, anchor = _count_crossings_and_anchor(source, start_pos)
                    current_date = anchor if anchor is not None else (ref_mtime - timedelta(days=crossings)).date()
                    last_client_secs = None

                _sync_pending[0] = None
                for _, raw_line in _iter_new_lines(source, start_pos):
                    m_ts = _CLIENT_TIME_RE.search(raw_line)
                    if not m_ts:
                        continue
                    h, mn, s, ms = int(m_ts.group(1)), int(m_ts.group(2)), int(m_ts.group(3)), int(m_ts.group(4))
                    client_secs  = h * 3600 + mn * 60 + s
                    client_clock = f"{h:02d}:{mn:02d}:{s:02d}.{ms:03d}"

                    if last_client_secs is not None and (last_client_secs - client_secs) > 3600:
                        current_date += timedelta(days=1)
                    last_client_secs = client_secs

                    ta = _WAKFU_TIME_RE.search(raw_line)
                    if ta:
                        d_, mo_, yy_ = int(ta.group(1)), int(ta.group(2)), int(ta.group(3))
                        try:
                            current_date = date(2000 + yy_, mo_, d_)
                        except ValueError:
                            pass

                    ts_local = datetime(current_date.year, current_date.month, current_date.day,
                                        h, mn, s, ms * 1000)
                    ts_local_str = ts_local.strftime("%Y-%m-%d %H:%M:%S.%f")[:-3]

                    evt = _parse_event(raw_line)
                    if evt is None:
                        _sync_pending[0] = None
                        continue
                    event_type, event_data = evt

                    # Market deposit detection
                    if event_type == "item_lost":
                        _market_detect(event_type, event_data, client_clock, _sync_pending)
                        continue

                    if event_type == "kamas_loss" and _sync_pending[0] is not None:
                        md_type, md_data, _ = _market_detect(event_type, event_data, client_clock, _sync_pending)
                        if md_type == "market_deposit":
                            fp_md = _make_fingerprint("market_deposit", md_data, client_clock)
                            if fp_md not in all_fps_set:
                                entry_md: dict = {
                                    "ts_local":      ts_local_str,
                                    "ts_client":     client_clock,
                                    "ntp_offset_ms": round(float(offset_ms), 3) if offset_ms is not None else None,
                                    "source_file":   source.name,
                                    "type":          "market_deposit",
                                    "data":          md_data,
                                }
                                jfh.write(json.dumps(entry_md, ensure_ascii=False) + "\n")
                                lfh.write(_format_log_line(entry_md) + "\n")
                                count_all += 1
                                all_fps_set.add(fp_md)
                                all_fps_list.append(fp_md)
                    elif _sync_pending[0] is not None:
                        _sync_pending[0] = None

                    fp = _make_fingerprint(event_type, event_data, client_clock)
                    if fp in all_fps_set:
                        continue

                    entry: dict = {
                        "ts_local":      ts_local_str,
                        "ts_client":     client_clock,
                        "ntp_offset_ms": round(float(offset_ms), 3) if offset_ms is not None else None,
                        "source_file":   source.name,
                        "type":          event_type,
                        "data":          event_data,
                    }
                    jfh.write(json.dumps(entry, ensure_ascii=False) + "\n")
                    lfh.write(_format_log_line(entry) + "\n")
                    count_all += 1

                    all_fps_set.add(fp)
                    all_fps_list.append(fp)
                    if len(all_fps_list) > 12_000:
                        drop = len(all_fps_list) - 12_000
                        for old in all_fps_list[:drop]:
                            all_fps_set.discard(old)
                        all_fps_list = all_fps_list[drop:]

                try:
                    final_pos = int(source.stat().st_size)
                except OSError:
                    final_pos = start_pos
                all_src["pos"]              = max(start_pos, final_pos)
                all_src["current_date"]     = current_date.isoformat()
                all_src["last_client_secs"] = last_client_secs
                all_sources_state[source_key] = all_src

    except OSError:
        pass

    state["all_sources"]     = all_sources_state
    state["all_fps"]         = all_fps_list[-12_000:]
    _write_state(state)

    return {"all": count_all}


# ── Compat. ascendante ────────────────────────────────────────────────────────

def sync_permanent_kamas_journal() -> int:
    """Maintenu pour compatibilité."""
    result = sync_permanent_journal()
    return result.get("kamas", result.get("all", 0))


# ── Requêtes all_events ───────────────────────────────────────────────────────

def _iter_all_events(type_filter: str | None = None):
    if not _ALL_EVENTS_LOG.exists():
        return
    try:
        with _ALL_EVENTS_LOG.open("r", encoding="utf-8", errors="ignore") as fh:
            for line in fh:
                raw = line.strip()
                if not raw:
                    continue
                try:
                    entry = json.loads(raw)
                except (ValueError, TypeError):
                    continue
                if not isinstance(entry, dict):
                    continue
                if type_filter and entry.get("type") != type_filter:
                    continue
                yield entry
    except OSError:
        return


def _norm_name(s: str) -> str:
    """Normalise un nom pour comparaison : minuscules + apostrophes uniformes."""
    return s.strip().lower().replace("\u2019", "'").replace("\u02bc", "'")


def query_character_info(name: str) -> dict:
    """
    Retourne les dernières informations connues pour un personnage :
    {breed_id, last_spell, last_xp_gain, last_xp_to_next, account, server, last_seen_ts}
    """
    name_lower = _norm_name(name)
    result: dict = {}

    for entry in _iter_all_events():
        t    = entry.get("type", "")
        data = entry.get("data", {})
        ts   = entry.get("ts_local", "")

        if t in ("spell_cast", "xp_combat", "level_up", "breed") and data:
            char = _norm_name(str(data.get("character") or ""))
            if char != name_lower:
                continue
            result["last_seen_ts"] = ts
            if t == "spell_cast":
                result.setdefault("last_spell", data.get("spell"))
            elif t == "xp_combat":
                result["last_xp_gain"]    = data.get("xp")
                result["last_xp_to_next"] = data.get("xp_to_next")
            elif t == "level_up":
                result["last_level"] = data.get("level")
            elif t == "breed":
                result["breed_id"] = data.get("breed_id")

        elif t == "whois" and data:
            char = _norm_name(str(data.get("character") or ""))
            if char == name_lower:
                result["account"] = data.get("account")
                result["server"]  = data.get("server")
                result["last_seen_ts"] = ts

    return result


# ── Requêtes serveur / joueurs ────────────────────────────────────────────────

def query_log_start_date() -> str | None:
    """Retourne la date du premier événement enregistré dans all_events.jsonl (format JJ/MM/AAAA)."""
    if not _ALL_EVENTS_LOG.exists():
        return None
    try:
        with _ALL_EVENTS_LOG.open("r", encoding="utf-8", errors="ignore") as fh:
            for line in fh:
                raw = line.strip()
                if not raw:
                    continue
                try:
                    entry = json.loads(raw)
                except (ValueError, TypeError):
                    continue
                if not isinstance(entry, dict):
                    continue
                ts = entry.get("ts_local") or entry.get("ts")
                if ts:
                    dt = _parse_local_iso(ts)
                    if dt:
                        return dt.strftime("%d/%m/%Y")
                    # Fallback: try raw date prefix
                    if len(ts) >= 10:
                        try:
                            d = datetime.fromisoformat(ts[:10])
                            return d.strftime("%d/%m/%Y")
                        except ValueError:
                            pass
    except OSError:
        pass
    return None


def query_last_server() -> str | None:
    """Retourne le dernier serveur détecté via /whois dans all_events.jsonl."""
    result = None
    for entry in _iter_all_events("whois"):
        server = entry.get("data", {}).get("server")
        if server:
            result = server
    return result


def query_unique_chat_authors() -> int:
    """Compte le nombre d'auteurs uniques ayant écrit dans le chat (log permanent)."""
    authors: set[str] = set()
    for entry in _iter_all_events("chat"):
        author = entry.get("data", {}).get("author")
        if author:
            authors.add(str(author).lower().strip())
    return len(authors)


def query_profession_xp() -> dict[str, dict]:
    """
    Retourne les dernières données XP connues par métier depuis all_events.jsonl.
    Clé = nom du métier, valeur = {xp, xp_to_next, ts}
    """
    result: dict[str, dict] = {}
    for entry in _iter_all_events("xp_profession"):
        data = entry.get("data", {})
        prof = data.get("profession")
        if not prof:
            continue
        result[prof] = {
            "xp":        data.get("xp", 0),
            "xp_to_next": data.get("xp_to_next", 0),
            "ts":        entry.get("ts_local", ""),
        }
    return result


def query_profession_tracking() -> dict[str, dict]:
    """
    Retourne un suivi enrichi par metier depuis all_events.jsonl.
    Clé = nom du métier, valeur = {xp_gained, xp_to_next, count, ts}
    """
    result: dict[str, dict] = {}
    for entry in _iter_all_events("xp_profession"):
        data = entry.get("data", {})
        prof = str(data.get("profession") or "").strip()
        if not prof:
            continue
        xp = int(data.get("xp", 0) or 0)
        xp_next = int(data.get("xp_to_next", 0) or 0)
        row = result.get(prof)
        if row is None:
            row = {"xp_gained": 0, "xp_to_next": 0, "count": 0, "ts": ""}
            result[prof] = row
        row["xp_gained"] += max(0, xp)
        row["xp_to_next"] = max(0, xp_next)
        row["count"] += 1
        row["ts"] = str(entry.get("ts_local", ""))
    return result


def replay_character_xp_since(character_name: str, since_iso: str | None) -> dict:
    """
    Rejoue l'XP combat d'un personnage depuis une date de reference.
    Retourne {xp_gained, xp_to_next, level, combat_count, last_ts}.
    """
    name_lower = _norm_name(character_name)
    since_dt: datetime | None = _parse_local_iso(since_iso) if since_iso else None

    xp_gained = 0
    xp_to_next: int | None = None
    level: int | None = None
    combat_count = 0
    last_ts = ""

    for entry in _iter_all_events():
        ts = str(entry.get("ts_local") or "")
        dt = _parse_local_iso(ts)
        if since_dt is not None and dt is not None and dt <= since_dt:
            continue

        etype = entry.get("type", "")
        data = entry.get("data", {})
        if not isinstance(data, dict):
            continue

        if etype == "xp_combat":
            char = _norm_name(str(data.get("character") or ""))
            if char != name_lower:
                continue
            xp = int(data.get("xp", 0) or 0)
            xp_gained += max(0, xp)
            xp_to_next = int(data.get("xp_to_next", 0) or 0)
            combat_count += 1
            last_ts = ts or last_ts
        elif etype == "level_up":
            char = _norm_name(str(data.get("character") or ""))
            if char != name_lower:
                continue
            try:
                level = int(data.get("level"))
            except (TypeError, ValueError):
                pass
            last_ts = ts or last_ts

    return {
        "xp_gained": xp_gained,
        "xp_to_next": xp_to_next,
        "level": level,
        "combat_count": combat_count,
        "last_ts": last_ts,
    }


def query_inventory() -> dict[str, int]:
    """
    Retourne l'inventaire net (gained - lost) depuis all_events.jsonl.
    Clé = nom de l'objet, valeur = quantité nette (peut être 0 si tout perdu).
    """
    counts: dict[str, int] = {}
    for entry in _iter_all_events():
        etype = entry.get("type")
        data  = entry.get("data", {})
        item  = str(data.get("item", "")).strip()
        if not item:
            continue
        qty = int(data.get("qty", 1))
        if etype == "item_gained":
            counts[item] = counts.get(item, 0) + qty
        elif etype in ("item_lost", "market_deposit"):
            counts[item] = counts.get(item, 0) - qty
    # Remove items with zero or negative net quantity
    return {k: v for k, v in counts.items() if v > 0}


def _compute_turn_combos(player_spells: list[dict]) -> list[dict]:
    """Group spell_cast events into 35-second turns, return top combos by unique spell count."""
    TURN_GAP = 35  # seconds

    if not player_spells:
        return []

    turns: list[list[dict]] = []
    current: list[dict] = []
    last_dt = None

    for s in player_spells:
        dt = _parse_local_iso(s["ts"])
        if dt is None:
            continue
        if last_dt is not None and (dt - last_dt).total_seconds() > TURN_GAP:
            if current:
                turns.append(current)
            current = []
        current.append(s)
        last_dt = dt

    if current:
        turns.append(current)

    result = []
    for turn in turns:
        unique = list(dict.fromkeys(s["spell"] for s in turn))
        if len(unique) >= 2:
            result.append({
                "spells": unique,
                "count":  len(unique),
                "ts":     turn[0]["ts"],
            })

    result.sort(key=lambda x: x["count"], reverse=True)
    return result[:5]


def _compute_best_xp_sessions(xp_events: list[dict]) -> list[dict]:
    """Group xp_combat events within 5 min into sessions, rank by XP/h."""
    SESSION_GAP = 300  # 5 minutes

    if not xp_events:
        return []

    sessions: list[list[dict]] = []
    current: list[dict] = []
    last_dt = None

    for ev in xp_events:
        dt = _parse_local_iso(ev["ts"])
        if dt is None:
            continue
        enriched = {**ev, "_dt": dt}
        if last_dt is not None and (dt - last_dt).total_seconds() > SESSION_GAP:
            if current:
                sessions.append(current)
            current = []
        current.append(enriched)
        last_dt = dt

    if current:
        sessions.append(current)

    result = []
    for session in sessions:
        total_xp = sum(e["xp"] for e in session)
        t0 = session[0]["_dt"]
        t1 = session[-1]["_dt"]
        duration = max(30, (t1 - t0).total_seconds())
        xph = int(total_xp / duration * 3600)
        result.append({
            "total_xp":  total_xp,
            "duration_s": int(duration),
            "xph":        xph,
            "ts":         session[0]["ts"],
            "count":      len(session),
        })

    result.sort(key=lambda x: x["xph"], reverse=True)
    return result[:5]


def query_combat_stats(char_name: str | None = None) -> dict:
    """
    Single-pass scan of all_events.jsonl.
    Corrèle spell_cast → hp_loss / ko pour attribuer dégâts et kills au bon monstre.
    Returns:
        spell_counts: dict[str, int]
        killed_by: dict[str, int]      # monster → times it killed the player
        damage_by: dict[str, int]      # monster → total HP damage dealt to player
        xp_events: list[{ts, xp, xp_to_next}]
        turn_combos: list[{spells, count, ts}]
        best_xp_sessions: list[{total_xp, duration_s, xph, ts, count}]
    """
    spell_counts: dict[str, int] = {}
    killed_by:    dict[str, int] = {}
    damage_by:    dict[str, int] = {}
    xp_events:    list[dict]     = []
    player_spells: list[dict]    = []

    char_lower = char_name.lower().strip() if char_name else None

    # Context: last non-player entity that cast a spell (= current attacker)
    last_attacker: str | None = None

    for entry in _iter_all_events():
        t    = entry.get("type")
        data = entry.get("data", {})
        ts   = entry.get("ts_local", "")

        if t == "spell_cast":
            char  = str(data.get("character") or "").strip()
            spell = str(data.get("spell") or "").strip()
            if not spell:
                continue
            if char_lower is None or char.lower() == char_lower:
                spell_counts[spell] = spell_counts.get(spell, 0) + 1
                player_spells.append({"ts": ts, "spell": spell})
            else:
                # Non-player caster → remember as current attacker
                last_attacker = char

        elif t == "xp_combat":
            char = str(data.get("character") or "").strip()
            if char_lower is None or char.lower() == char_lower:
                xp_events.append({
                    "ts":        ts,
                    "xp":        data.get("xp", 0) or 0,
                    "xp_to_next": data.get("xp_to_next", 0) or 0,
                })

        elif t == "hp_loss":
            char = str(data.get("character") or "").strip()
            if char_lower and char.lower() == char_lower and last_attacker:
                amt = data.get("amount", 0) or 0
                damage_by[last_attacker] = damage_by.get(last_attacker, 0) + amt

        elif t in ("ko", "death"):
            char = str(data.get("character") or "").strip()
            if char_lower and char.lower() == char_lower and last_attacker:
                killed_by[last_attacker] = killed_by.get(last_attacker, 0) + 1

    return {
        "spell_counts":     spell_counts,
        "killed_by":        killed_by,
        "damage_by":        damage_by,
        "xp_events":        xp_events,
        "turn_combos":      _compute_turn_combos(player_spells),
        "best_xp_sessions": _compute_best_xp_sessions(xp_events),
    }


# ── Requêtes kamas ────────────────────────────────────────────────────────────

def get_permanent_events_log_path() -> Path:
    return _ALL_EVENTS_LOG


def get_permanent_events_size() -> int:
    try:
        return int(_ALL_EVENTS_LOG.stat().st_size) if _ALL_EVENTS_LOG.exists() else 0
    except OSError:
        return 0


def get_active_permanent_log_size() -> int:
    return get_permanent_events_size()


def _iter_permanent_events():
    """
    Itère les événements kamas depuis all_events.jsonl.
    Déduplication intégrée par fingerprint.
    """
    if not _ALL_EVENTS_LOG.exists():
        return
    seen: set[str] = set()
    try:
        with _ALL_EVENTS_LOG.open("r", encoding="utf-8", errors="ignore") as fh:
            for line in fh:
                raw = line.strip()
                if not raw:
                    continue
                try:
                    entry = json.loads(raw)
                except (ValueError, TypeError):
                    continue
                if not isinstance(entry, dict):
                    continue
                t = entry.get("type", "")
                if t not in ("kamas_gain", "kamas_loss"):
                    continue
                data = entry.get("data") or {}
                try:
                    amount = int(data.get("amount") or 0)
                except (TypeError, ValueError):
                    continue
                client_time = str(entry.get("ts_client") or "")
                kind = "gain" if t == "kamas_gain" else "loss"
                fp = f"{client_time}|{kind}|{amount}"
                if fp in seen:
                    continue
                seen.add(fp)
                dt = _parse_local_iso(str(entry.get("ts_local") or ""))
                if dt is None:
                    continue
                yield {
                    "dt":     dt,
                    "kind":   kind,
                    "amount": amount,
                }
    except OSError:
        return


def read_permanent_kamas_events() -> list[dict]:
    events = list(_iter_permanent_events() or [])
    events.sort(key=lambda item: item["dt"])
    return events


def read_permanent_market_deposits() -> list[dict]:
    """Retourne tous les market_deposit depuis all_events.jsonl, triés par date.

    Chaque entrée : {dt, ts_client, item, qty, tax}
    """
    if not _ALL_EVENTS_LOG.exists():
        return []
    results: list[dict] = []
    try:
        with _ALL_EVENTS_LOG.open("r", encoding="utf-8", errors="ignore") as fh:
            for line in fh:
                raw = line.strip()
                if not raw:
                    continue
                try:
                    entry = json.loads(raw)
                except (ValueError, TypeError):
                    continue
                if not isinstance(entry, dict) or entry.get("type") != "market_deposit":
                    continue
                data = entry.get("data") or {}
                dt = _parse_local_iso(str(entry.get("ts_local") or ""))
                if dt is None:
                    continue
                try:
                    tax = int(data.get("tax") or 0)
                    qty = int(data.get("qty") or 1)
                except (TypeError, ValueError):
                    continue
                results.append({
                    "dt":        dt,
                    "ts_client": str(entry.get("ts_client") or ""),
                    "item":      str(data.get("item") or "?"),
                    "qty":       qty,
                    "tax":       tax,
                })
    except OSError:
        pass
    results.sort(key=lambda x: x["dt"])
    return results


def get_permanent_events_start_ts() -> str | None:
    for evt in _iter_permanent_events() or []:
        return evt["dt"].strftime("%Y-%m-%d %H:%M:%S")
    return None


# Alias utilisé dans kamas_history.py
get_permanent_log_start_ts = get_permanent_events_start_ts


def replay_permanent_delta(since_iso: str | None, file_offset: int = 0) -> int:
    _ = file_offset  # kept for API compat
    sync_permanent_journal()
    since_dt: datetime | None = _parse_local_iso(since_iso) if since_iso else None
    delta = 0
    for evt in _iter_permanent_events():
        if since_dt is not None and evt["dt"] <= since_dt:
            continue
        delta += evt["amount"] if evt["kind"] == "gain" else -evt["amount"]
    return delta


# Alias maintenu pour kamas_history.py
replay_kamas_delta = replay_permanent_delta


def _parse_played_seconds(raw: str) -> int | None:
    """
    Parse 'X jours Y heures Z minutes W secondes sur ce personnage.'
    Retourne le total en secondes, ou None si non parseable.
    """
    import re as _re
    raw = str(raw or "")
    total = 0
    found = False
    m = _re.search(r"(\d+)\s+jour", raw)
    if m:
        total += int(m.group(1)) * 86400
        found = True
    m = _re.search(r"(\d+)\s+heure", raw)
    if m:
        total += int(m.group(1)) * 3600
        found = True
    m = _re.search(r"(\d+)\s+minute", raw)
    if m:
        total += int(m.group(1)) * 60
        found = True
    m = _re.search(r"(\d+)\s+seconde", raw)
    if m:
        total += int(m.group(1))
        found = True
    return total if found else None


def query_played_time() -> dict | None:
    """
    Retourne la dernière entrée 'played' connue dans all_events.jsonl.
    Format: {seconds: int, ts_local: str}
    Retourne None si aucune entrée trouvée.
    """
    result: dict | None = None
    for entry in _iter_all_events("played"):
        raw = str(entry.get("data", {}).get("raw", ""))
        secs = _parse_played_seconds(raw)
        if secs is not None:
            result = {
                "seconds": secs,
                "ts_local": str(entry.get("ts_local", "")),
            }
    return result
