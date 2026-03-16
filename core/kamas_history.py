# core/kamas_history.py
"""
Rejoue l'historique kamas depuis le log permanent (all_events.log).

Format d'une ligne :
  [2026-03-16 04:44:11.994][wakfu.log]  INFO ... [Information (jeu)] Vous avez gagné 151 104 kamas.

Journal des corrections manuelles : data/kamas_journal.jsonl
  {"ts": "2026-03-16 14:23:45.123", "value": 576869}
"""

from __future__ import annotations

import io
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


def get_permanent_log_start_ts() -> str | None:
    """Retourne le timestamp de la première entrée du log permanent, ou None."""
    if not _PERM_LOG.exists():
        return None
    try:
        with _PERM_LOG.open("r", encoding="utf-8", errors="ignore") as fh:
            for line in fh:
                m = _TS_RE.match(line)
                if m:
                    return m.group(1)
    except OSError:
        pass
    return None


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
    """
    Lit all_events.log et retourne le delta kamas (gains - pertes)
    pour toutes les lignes postérieures à `since_iso`.

    `since_iso` est une chaîne ISO "YYYY-MM-DD HH:MM:SS[.mmm]" (ou None).
    `file_offset` : offset octet pour sauter directement au bon endroit du fichier
                    (évite de relire tout le fichier depuis le début).
                    Si > 0, la comparaison de timestamp est ignorée (l'offset fait foi).
    """
    if not _PERM_LOG.exists():
        return 0

    since_dt: datetime | None = None
    if since_iso and file_offset == 0:
        try:
            fmt = "%Y-%m-%d %H:%M:%S.%f" if "." in since_iso else "%Y-%m-%d %H:%M:%S"
            since_dt = datetime.strptime(since_iso, fmt)
        except ValueError:
            since_dt = None

    delta = 0
    past_cutoff = (since_dt is None) or (file_offset > 0)

    try:
        file_size = _PERM_LOG.stat().st_size
        with _PERM_LOG.open("rb") as fh_bin:
            if file_offset > 0 and file_offset < file_size:
                fh_bin.seek(file_offset)
            fh = io.TextIOWrapper(fh_bin, encoding="utf-8", errors="ignore")
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
