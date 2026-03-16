# core/kamas_history.py
"""
Rejoue l'historique kamas depuis le log permanent (all_events.log).

Format d'une ligne :
  [2026-03-16 04:44:11.994][wakfu.log]  INFO ... [Information (jeu)] Vous avez gagné 151 104 kamas.
"""

from __future__ import annotations

import re
from datetime import datetime, timezone
from pathlib import Path

_PROJECT_ROOT = Path(__file__).resolve().parents[1]
_PERM_LOG = _PROJECT_ROOT / "logs" / "permanent" / "all_events.log"

_TS_RE = re.compile(r"^\[(\d{4}-\d{2}-\d{2} \d{2}:\d{2}:\d{2})")
_GAIN_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez gagné\s+([0-9\s\u00a0\u202f\xa0.,]+)\s+kamas",
    re.IGNORECASE,
)
_LOSS_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez perdu\s+([0-9\s\u00a0\u202f\xa0.,]+)\s+kamas",
    re.IGNORECASE,
)


def _parse_kamas_token(raw: str) -> int | None:
    digits = re.sub(r"[^0-9]", "", raw)
    return int(digits) if digits else None


def replay_kamas_delta(since_iso: str | None) -> int:
    """
    Lit all_events.log et retourne le delta kamas (gains - pertes)
    pour toutes les lignes postérieures à `since_iso`.

    `since_iso` est une chaîne ISO "YYYY-MM-DD HH:MM:SS" (ou None pour tout relire).
    """
    if not _PERM_LOG.exists():
        return 0

    since_dt: datetime | None = None
    if since_iso:
        try:
            since_dt = datetime.fromisoformat(since_iso)
        except ValueError:
            since_dt = None

    delta = 0
    past_cutoff = since_dt is None  # si pas de cutoff, on lit tout

    try:
        with _PERM_LOG.open("r", encoding="utf-8", errors="ignore") as fh:
            for line in fh:
                if not past_cutoff:
                    m = _TS_RE.match(line)
                    if m:
                        try:
                            line_dt = datetime.fromisoformat(m.group(1))
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


def now_iso() -> str:
    return datetime.now().strftime("%Y-%m-%d %H:%M:%S")
