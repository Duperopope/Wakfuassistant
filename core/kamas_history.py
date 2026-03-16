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
import re
from datetime import datetime
from pathlib import Path

_PROJECT_ROOT = Path(__file__).resolve().parents[1]
_PERM_LOG     = _PROJECT_ROOT / "logs" / "permanent" / "all_events.log"
_JOURNAL      = _PROJECT_ROOT / "data" / "kamas_journal.jsonl"

# Timestamp dans all_events.log : [2026-03-16 04:44:11.994]
_TS_RE = re.compile(r"^\[(\d{4}-\d{2}-\d{2} \d{2}:\d{2}:\d{2})(?:\.\d+)?")
_GAIN_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez gagné\s+([0-9\s\u00a0\u202f\xa0.,]+)\s+kamas?\b",
    re.IGNORECASE,
)
_LOSS_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez perdu\s+([0-9\s\u00a0\u202f\xa0.,]+)\s+kamas?\b",
    re.IGNORECASE,
)


def _parse_kamas_token(raw: str) -> int | None:
    digits = re.sub(r"[^0-9]", "", raw)
    return int(digits) if digits else None


def now_iso() -> str:
    """Timestamp seconde pour config.json."""
    return datetime.now().strftime("%Y-%m-%d %H:%M:%S")


def now_ms_iso() -> str:
    """Timestamp milliseconde pour le journal."""
    return datetime.now().strftime("%Y-%m-%d %H:%M:%S.%f")[:-3]


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


def replay_kamas_delta(since_iso: str | None) -> int:
    """
    Lit all_events.log et retourne le delta kamas (gains - pertes)
    pour toutes les lignes postérieures à `since_iso`.

    `since_iso` est une chaîne ISO "YYYY-MM-DD HH:MM:SS[.mmm]" (ou None).
    """
    if not _PERM_LOG.exists():
        return 0

    since_dt: datetime | None = None
    if since_iso:
        try:
            # Accepte avec ou sans millisecondes
            fmt = "%Y-%m-%d %H:%M:%S.%f" if "." in since_iso else "%Y-%m-%d %H:%M:%S"
            since_dt = datetime.strptime(since_iso, fmt)
        except ValueError:
            since_dt = None

    delta = 0
    past_cutoff = since_dt is None

    try:
        with _PERM_LOG.open("r", encoding="utf-8", errors="ignore") as fh:
            for line in fh:
                if not past_cutoff:
                    m = _TS_RE.match(line)
                    if m:
                        try:
                            raw_ts = m.group(1)
                            line_dt = datetime.strptime(raw_ts, "%Y-%m-%d %H:%M:%S")
                            if line_dt > since_dt:
                                past_cutoff = True
                        except ValueError:
                            pass
                    if not past_cutoff:
                        continue

                gain_m = _GAIN_RE.search(line)
                if gain_m:
                    v = _parse_kamas_token(gain_m.group(1))
                    if v is not None:
                        delta += v
                    continue

                loss_m = _LOSS_RE.search(line)
                if loss_m:
                    v = _parse_kamas_token(loss_m.group(1))
                    if v is not None:
                        delta -= v

    except OSError:
        return 0

    return delta
