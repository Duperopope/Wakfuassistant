"""Wakfu game log parser.

Wakfu stores its journal/chat logs at:
    %APPDATA%\\zaap\\gamesLogs\\wakfu\\logs\\wakfu*.log

Each line is either plain-text or structured.  We use a set of regex
patterns to extract game events (kamas gains, item drops, profession XP,
combat events) and emit them into the SessionState.
"""

from __future__ import annotations

import re
import time
from datetime import datetime
from pathlib import Path
from typing import Callable, NamedTuple

from src.models import SessionState

# ── Pattern registry ─────────────────────────────────────────────────────────

class _Pattern(NamedTuple):
    name: str
    regex: re.Pattern[str]
    handler: Callable[[re.Match[str], SessionState, str], None]


def _ts_now() -> str:
    return datetime.now().strftime("%H:%M:%S")


def _parse_int(s: str) -> int:
    """Parse a number that may contain spaces or dots (French formatting)."""
    return int(re.sub(r"[\s\u00a0.]", "", s))


# ── Handlers ─────────────────────────────────────────────────────────────────

def _handle_kamas_gained(m: re.Match[str], state: SessionState, ts: str) -> None:
    amount = _parse_int(m.group("amount"))
    state.kamas_gained += amount
    state.add_event("💰", f"+{amount:,} kamas".replace(",", "\u202f"), ts)


def _handle_kamas_lost(m: re.Match[str], state: SessionState, ts: str) -> None:
    amount = _parse_int(m.group("amount"))
    state.kamas_gained -= amount
    state.add_event("💸", f"-{amount:,} kamas perdu".replace(",", "\u202f"), ts)


def _handle_kamas_sale(m: re.Match[str], state: SessionState, ts: str) -> None:
    amount = _parse_int(m.group("amount"))
    state.kamas_from_sales += amount
    state.add_event("🏪", f"+{amount:,} kamas (vente)".replace(",", "\u202f"), ts)


def _handle_item_gain(m: re.Match[str], state: SessionState, ts: str) -> None:
    name = m.group("name").strip()
    qty_str = m.group("qty") if "qty" in m.groupdict() and m.group("qty") else "1"
    qty = _parse_int(qty_str) if qty_str else 1
    state.inventory.add_item(name, qty)
    state.add_event("📦", f"+{qty} {name}", ts)


def _handle_item_lost(m: re.Match[str], state: SessionState, ts: str) -> None:
    name = m.group("name").strip()
    qty_str = m.group("qty") if "qty" in m.groupdict() and m.group("qty") else "1"
    qty = _parse_int(qty_str) if qty_str else 1
    state.inventory.add_item(name, -qty)
    state.add_event("🗑️", f"-{qty} {name}", ts)


def _handle_metier_xp(m: re.Match[str], state: SessionState, ts: str) -> None:
    xp = _parse_int(m.group("xp"))
    metier = m.group("metier").strip() if "metier" in m.groupdict() and m.group("metier") else "Inconnu"
    state.add_or_update_metier(metier, xp_delta=xp)
    state.add_event("⚒️", f"+{xp:,} XP {metier}".replace(",", "\u202f"), ts)
    state.crafts += 1


def _handle_level_up(m: re.Match[str], state: SessionState, ts: str) -> None:
    metier = m.group("metier").strip() if "metier" in m.groupdict() and m.group("metier") else "Inconnu"
    level = int(m.group("level")) if "level" in m.groupdict() and m.group("level") else 0
    state.add_or_update_metier(metier, level=level)
    from src.models import LevelUp
    state.level_ups.append(LevelUp(metier=metier, ts=ts))
    state.add_event("🎉", f"Niveau {level} - {metier}", ts)


def _handle_fight_start(m: re.Match[str], state: SessionState, ts: str) -> None:
    fight_id = m.group("id") if "id" in m.groupdict() and m.group("id") else str(int(time.time()))
    state.start_combat(fight_id)
    state.add_event("⚔️", f"Combat #{fight_id} démarré", ts)


def _handle_fight_damage(m: re.Match[str], state: SessionState, ts: str) -> None:
    dmg = _parse_int(m.group("dmg"))
    skill = m.group("skill").strip() if "skill" in m.groupdict() and m.group("skill") else "Attaque"
    turn_n = int(m.group("turn")) if "turn" in m.groupdict() and m.group("turn") else 1
    if state._current_combat:
        c = state._current_combat
        c.total_damage += dmg
        # find or create turn
        turn_obj = next((t for t in c.turns if t.turn == turn_n), None)
        if turn_obj is None:
            from src.models import CombatTurn
            turn_obj = CombatTurn(turn=turn_n)
            c.turns.append(turn_obj)
        turn_obj.total_damage += dmg
        from src.models import Skill
        turn_obj.skills.append(Skill(name=skill, damage=dmg))


def _handle_fight_end(m: re.Match[str], state: SessionState, ts: str) -> None:
    if state._current_combat:
        dmg = state._current_combat.total_damage
        fid = state._current_combat.fight_id
        state.end_combat()
        state.add_event("🏁", f"Combat #{fid} terminé — {dmg:,} dégâts".replace(",", "\u202f"), ts)


# ── Pattern list (order matters: first match wins per line) ──────────────────

# Timestamp prefix common in Wakfu logs: [HH:MM:SS] or just the raw message
_TS = r"(?:\[(?P<ts>\d{2}:\d{2}(?::\d{2})?)\]\s*)?"
_NUM = r"(?P<amount>[\d\s\u00a0.]+)"

PATTERNS: list[_Pattern] = [
    # ── Kamas (highest priority — check before item patterns) ──
    _Pattern(
        "kamas_gained",
        re.compile(
            _TS + r"(?:Vous avez (?:reçu|gagné|obtenu)\s+" + _NUM + r"\s*kamas?\.?)",
            re.IGNORECASE,
        ),
        _handle_kamas_gained,
    ),
    _Pattern(
        "kamas_sale",
        re.compile(
            _TS + r"(?:Vous avez vendu .+? pour\s+" + _NUM + r"\s*kamas?\.?)",
            re.IGNORECASE,
        ),
        _handle_kamas_sale,
    ),
    _Pattern(
        "kamas_sale_alt",
        re.compile(
            _TS + r"(?:Vente.+?\:\s*" + _NUM + r"\s*kamas?\.?)",
            re.IGNORECASE,
        ),
        _handle_kamas_sale,
    ),
    _Pattern(
        "kamas_lost",
        re.compile(
            _TS + r"(?:Vous avez (?:perdu|dépensé)\s+" + _NUM + r"\s*kamas?\.?)",
            re.IGNORECASE,
        ),
        _handle_kamas_lost,
    ),
    # ── Professions / metiers (before item patterns to avoid mismatches) ──
    _Pattern(
        "level_up",
        re.compile(
            _TS + r"(?:Vous avez atteint le niveau\s+(?P<level>\d+)(?:\s+de\s+)?(?P<metier>[^\.\n]*))",
            re.IGNORECASE,
        ),
        _handle_level_up,
    ),
    _Pattern(
        "metier_xp",
        re.compile(
            _TS + r"(?:Vous avez gagné\s+(?P<xp>[\d\s.]+)\s+points? d'expérience (?:de\s+)?(?P<metier>[^\.\n]+))",
            re.IGNORECASE,
        ),
        _handle_metier_xp,
    ),
    _Pattern(
        "metier_xp_alt",
        re.compile(
            _TS + r"(?:\+(?P<xp>[\d\s.]+)\s+XP\s+(?P<metier>[^\.\n]+))",
            re.IGNORECASE,
        ),
        _handle_metier_xp,
    ),
    # ── Combat ──
    _Pattern(
        "fight_start",
        re.compile(
            _TS + r"(?:Combat\s+#?(?P<id>\d+)\s+(?:démarré|commencé|started))",
            re.IGNORECASE,
        ),
        _handle_fight_start,
    ),
    _Pattern(
        "fight_damage",
        re.compile(
            _TS + r"(?:Vous avez infligé\s+(?P<dmg>[\d\s.]+)\s+(?:points? de )?dégâts?(?:\s+avec\s+(?P<skill>[^\.\n]+))?(?:\s+\(tour\s+(?P<turn>\d+)\))?)",
            re.IGNORECASE,
        ),
        _handle_fight_damage,
    ),
    _Pattern(
        "fight_end",
        re.compile(
            _TS + r"(?:Combat\s+(?:terminé|fini|ended))",
            re.IGNORECASE,
        ),
        _handle_fight_end,
    ),
    # ── Items (lower priority than kamas/metier patterns) ──
    _Pattern(
        "item_gain",
        re.compile(
            _TS + r"Vous avez (?:reçu|ramassé|obtenu)\s*:?\s*(?P<name>[^\(×x\d\n]+?)\s*(?:[×x\(]\s*(?P<qty>[\d\s.]+))?\.?$",
            re.IGNORECASE,
        ),
        _handle_item_gain,
    ),
    _Pattern(
        "item_gain_qty",
        re.compile(
            _TS + r"\+\s*(?P<qty>[\d]+)\s+(?P<name>[^\n]+?)\.?$",
            re.IGNORECASE,
        ),
        _handle_item_gain,
    ),
    _Pattern(
        "item_lost",
        re.compile(
            _TS + r"(?:Vous avez (?:perdu|utilisé|remis))\s*:?\s*(?P<name>[^\(×x\d\n]+?)\s*(?:[×x\(]\s*(?P<qty>[\d\s.]+))?\.?$",
            re.IGNORECASE,
        ),
        _handle_item_lost,
    ),
    # ── Generic kamas (last resort — matches bare numbers) ──
    _Pattern(
        "kamas_gained_alt",
        re.compile(
            _TS + r"(?:\+\s*" + _NUM + r"\s*kamas?\.?)",
            re.IGNORECASE,
        ),
        _handle_kamas_gained,
    ),
]

# ── File reading state ────────────────────────────────────────────────────────

class FilePosition:
    """Tracks how far we have read a log file."""

    def __init__(self, path: Path):
        self.path = path
        self.offset: int = 0


class LogWatcher:
    """
    Monitors a directory for Wakfu log files and continuously tails them,
    feeding new lines into *state* via the pattern registry.
    """

    def __init__(self, log_dir: Path, state: SessionState):
        self.log_dir = log_dir
        self.state = state
        self._files: dict[str, FilePosition] = {}
        self.events_processed: int = 0

    def scan_once(self) -> int:
        """
        Perform one scan: discover new log files, read new lines, parse them.
        Returns the number of new lines processed.
        """
        if not self.log_dir.exists():
            return 0

        new_lines = 0
        for path in sorted(self.log_dir.glob("wakfu*.log*")):
            key = path.name
            if key not in self._files:
                self._files[key] = FilePosition(path)

            fp = self._files[key]
            try:
                with open(path, "r", encoding="utf-8", errors="replace") as fh:
                    fh.seek(fp.offset)
                    for raw_line in fh:
                        line = raw_line.rstrip("\r\n")
                        if line:
                            self._parse_line(line)
                            new_lines += 1
                    fp.offset = fh.tell()
            except OSError:
                continue

        self.events_processed += new_lines
        return new_lines

    def _parse_line(self, line: str) -> None:
        ts = _ts_now()
        # Try to extract timestamp from line prefix [HH:MM] or [HH:MM:SS]
        m_ts = re.match(r"\[(\d{2}:\d{2}(?::\d{2})?)\]", line)
        if m_ts:
            ts = m_ts.group(1)

        for pat in PATTERNS:
            m = pat.regex.search(line)
            if m:
                pat.handler(m, self.state, ts)
                break   # stop at first match
