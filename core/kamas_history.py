# core/kamas_history.py
"""
Rejoue l'historique kamas depuis le log permanent (all_events.log).

Format d'une ligne :
  [2026-03-16 04:44:11.994][wakfu.log]  INFO ... [Information (jeu)] Vous avez gagné 151 104 kamas.

Journal des corrections manuelles : data/kamas_journal.jsonl
  {"ts": "2026-03-16 14:23:45.123", "value": 576869}
"""

from __future__ import annotations

import json
from datetime import datetime
from pathlib import Path

from core.permanent_journal import (
    get_permanent_events_log_path,
    get_permanent_events_size,
    get_permanent_events_start_ts,
    replay_permanent_delta,
    sync_permanent_kamas_journal,
)

_PROJECT_ROOT = Path(__file__).resolve().parents[1]
_JOURNAL      = _PROJECT_ROOT / "data" / "kamas_journal.jsonl"


def get_active_permanent_log_path() -> Path:
    """Retourne le journal permanent normalise des evenements kamas."""
    return get_permanent_events_log_path()


def get_active_permanent_log_size() -> int:
    return get_permanent_events_size()


def now_iso() -> str:
    """Timestamp seconde pour config.json."""
    return datetime.now().strftime("%Y-%m-%d %H:%M:%S")


def now_ms_iso() -> str:
    """Timestamp milliseconde pour le journal."""
    return datetime.now().strftime("%Y-%m-%d %H:%M:%S.%f")[:-3]


def get_permanent_log_start_ts() -> str | None:
    """Retourne le timestamp de la première entrée du journal permanent."""
    sync_permanent_kamas_journal()
    return get_permanent_events_start_ts()


def get_last_correction_ts() -> str | None:
    """Retourne le timestamp ISO de la dernière correction manuelle, ou None."""
    if not _JOURNAL.exists():
        return None
    try:
        with _JOURNAL.open("r", encoding="utf-8") as fh:
            last_line = None
            for line in fh:
                stripped = line.strip()
                if stripped:
                    last_line = stripped
        if last_line:
            return json.loads(last_line).get("ts")
    except (OSError, json.JSONDecodeError, AttributeError):
        pass
    return None


def write_kamas_correction(value: int) -> str:
    """
    Enregistre une correction manuelle dans le journal (append).
    Retourne le timestamp ms utilisé.
    """
    ts = now_ms_iso()
    entry = json.dumps({"ts": ts, "value": value}, ensure_ascii=False)
    try:
        with _JOURNAL.open("a", encoding="utf-8") as fh:
            fh.write(entry + "\n")
    except OSError:
        pass
    return ts


def replay_kamas_delta(since_iso: str | None, file_offset: int = 0) -> int:
    """Retourne le delta kamas depuis le journal permanent normalise."""
    return replay_permanent_delta(since_iso, file_offset)
