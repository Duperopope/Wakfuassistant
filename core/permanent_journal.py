from __future__ import annotations

import io
import json
import os
import re
import socket
import struct
import time
from datetime import datetime, timedelta, timezone
from pathlib import Path

_PROJECT_ROOT = Path(__file__).resolve().parents[1]
_PERM_DIR = _PROJECT_ROOT / "logs" / "permanent"
_PERM_EVENTS_LOG = _PERM_DIR / "kamas_events.jsonl"
_RECORDER_STATE = _PERM_DIR / "recorder_state.json"

_APPDATA_WAKFU_DIR = Path(os.environ.get("APPDATA", "")) / "zaap" / "gamesLogs" / "wakfu" / "logs"
_RAW_WAKFU_CHAT_LOG = _APPDATA_WAKFU_DIR / "wakfu_chat.log"
_RAW_WAKFU_LOG = _APPDATA_WAKFU_DIR / "wakfu.log"
_RAW_WAKFU_JOURNAL_LOG = _APPDATA_WAKFU_DIR / "wakfu_journal.log"

_GAIN_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez gagné\s+([0-9\s\u00a0\u202f\xa0.,]+)\s+kamas?\b",
    re.IGNORECASE,
)
_LOSS_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez perdu\s+([0-9\s\u00a0\u202f\xa0.,]+)\s+kamas?\b",
    re.IGNORECASE,
)
_INNER_TIME_RE = re.compile(r"\b(\d{2}:\d{2}:\d{2}),(\d{3})\b")


def get_permanent_events_log_path() -> Path:
    return _PERM_EVENTS_LOG


def get_permanent_events_size() -> int:
    try:
        return int(_PERM_EVENTS_LOG.stat().st_size) if _PERM_EVENTS_LOG.exists() else 0
    except OSError:
        return 0


def _parse_local_iso(raw: str) -> datetime | None:
    raw = str(raw or "").strip()
    if not raw:
        return None
    try:
        fmt = "%Y-%m-%d %H:%M:%S.%f" if "." in raw else "%Y-%m-%d %H:%M:%S"
        return datetime.strptime(raw, fmt)
    except ValueError:
        return None


def _parse_kamas_token(raw: str) -> int | None:
    digits = re.sub(r"[^0-9]", "", raw)
    return int(digits) if digits else None


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
        _RECORDER_STATE.write_text(json.dumps(state, ensure_ascii=False, indent=2), encoding="utf-8")
    except OSError:
        pass


def _query_ntp_utc(server: str, timeout_s: float) -> datetime | None:
    # Minimal SNTP query (RFC 4330) over UDP.
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

    frac_s = frac / float(1 << 32)
    return datetime.fromtimestamp(sec_1970 + frac_s, tz=timezone.utc)


def _get_atomic_offset_ms(state: dict) -> float | None:
    sync = state.get("time_sync")
    if not isinstance(sync, dict):
        sync = {}

    now_mono = time.monotonic()
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
        sync.update({
            "offset_ms": None,
            "status": "unavailable",
            "checked_at_utc": local_utc.isoformat(),
            "valid_until_mono": now_mono + 120.0,
        })
        state["time_sync"] = sync
        _write_state(state)
        return None

    offset_ms = (ntp_utc - local_utc).total_seconds() * 1000.0
    sync.update({
        "offset_ms": offset_ms,
        "status": "ok",
        "checked_at_utc": local_utc.isoformat(),
        "valid_until_mono": now_mono + 600.0,
    })
    state["time_sync"] = sync
    _write_state(state)
    return offset_ms


def _resolve_client_local(client_time: str, ref_local: datetime) -> datetime | None:
    try:
        parsed = datetime.strptime(client_time, "%H:%M:%S.%f")
    except ValueError:
        return None

    base = ref_local.replace(
        hour=parsed.hour,
        minute=parsed.minute,
        second=parsed.second,
        microsecond=parsed.microsecond,
    )
    candidates = (base - timedelta(days=1), base, base + timedelta(days=1))
    chosen = min(candidates, key=lambda dt: abs((dt - ref_local).total_seconds()))

    if chosen > ref_local:
        past_candidates = [dt for dt in candidates if dt <= ref_local]
        if past_candidates:
            chosen = min(past_candidates, key=lambda dt: abs((dt - ref_local).total_seconds()))
        else:
            chosen = ref_local

    return chosen


def _iter_raw_sources() -> list[Path]:
    # Inclut aussi les fichiers rotatifs (.1/.2/...) pour l'historique long.
    candidates: dict[str, Path] = {}
    patterns = ("wakfu_chat.log*", "wakfu.log*", "wakfu_journal.log*")
    for pat in patterns:
        for path in _APPDATA_WAKFU_DIR.glob(pat):
            if not path.is_file():
                continue
            candidates[str(path)] = path

    existing: list[tuple[float, Path]] = []
    for path in candidates.values():
        try:
            st = path.stat()
        except OSError:
            continue
        if st.st_size <= 0:
            continue
        existing.append((float(st.st_mtime), path))

    # Chronologique: plus ancien -> plus recent.
    existing.sort(key=lambda item: item[0])
    return [path for _mtime, path in existing]


def _iter_new_lines(path: Path, start_pos: int):
    with path.open("rb") as fh_bin:
        fh_bin.seek(max(0, start_pos))
        while True:
            offset = fh_bin.tell()
            chunk = fh_bin.readline()
            if not chunk:
                break
            yield offset, chunk.decode("utf-8", errors="ignore")
        return fh_bin.tell()


def _line_fingerprint(raw_line: str, kind: str, amount: int, client_clock: str | None) -> str:
    lower = raw_line.lower()
    marker = "[information (jeu)]"
    idx = lower.find(marker)
    if idx >= 0:
        normalized = raw_line[idx:].strip().lower()
    else:
        normalized = raw_line.strip().lower()
    return f"{client_clock or ''}|{kind}|{amount}|{normalized}"


def sync_permanent_kamas_journal() -> int:
    _PERM_DIR.mkdir(parents=True, exist_ok=True)
    state = _read_state()

    sources_list = _iter_raw_sources()
    if not sources_list:
        return 0

    sources = state.get("sources")
    if not isinstance(sources, dict):
        sources = {}

    recent_fps = state.get("recent_fingerprints")
    if not isinstance(recent_fps, list):
        recent_fps = []
    fps_list = [str(v) for v in recent_fps if isinstance(v, str)]
    fps_set = set(fps_list)

    offset_ms = _get_atomic_offset_ms(state)
    appended = 0

    try:
        with _PERM_EVENTS_LOG.open("a", encoding="utf-8") as out_fh:
            for source in sources_list:
                source_key = str(source)
                source_state = sources.get(source_key)
                if not isinstance(source_state, dict):
                    source_state = {}

                try:
                    source_ref_local = datetime.fromtimestamp(source.stat().st_mtime)
                except OSError:
                    source_ref_local = datetime.now()

                try:
                    size = int(source.stat().st_size)
                except OSError:
                    continue

                start_pos = int(source_state.get("pos", 0) or 0)
                if start_pos < 0 or start_pos > size:
                    start_pos = 0

                last_pos = start_pos
                for line_pos, raw_line in _iter_new_lines(source, start_pos):
                    last_pos = line_pos
                    gain_m = _GAIN_RE.search(raw_line)
                    loss_m = _LOSS_RE.search(raw_line)
                    if not gain_m and not loss_m:
                        continue

                    if gain_m:
                        amount = _parse_kamas_token(gain_m.group(1))
                        kind = "gain"
                    else:
                        amount = _parse_kamas_token(loss_m.group(1))
                        kind = "loss"

                    if amount is None or amount <= 0:
                        continue

                    now_local = datetime.now()
                    now_utc = datetime.now(timezone.utc)
                    inner = _INNER_TIME_RE.search(raw_line)
                    client_clock = None
                    resolved_client_local = source_ref_local
                    if inner:
                        client_clock = f"{inner.group(1)}.{inner.group(2)}"
                        resolved = _resolve_client_local(client_clock, source_ref_local)
                        if resolved is not None:
                            resolved_client_local = resolved

                    fp = _line_fingerprint(raw_line, kind, int(amount), client_clock)
                    if fp in fps_set:
                        continue

                    atomic_utc = None
                    quality = "local-only"
                    if offset_ms is not None:
                        atomic_utc = now_utc + timedelta(milliseconds=float(offset_ms))
                        quality = "atomic"

                    entry = {
                        "ts_local": now_local.strftime("%Y-%m-%d %H:%M:%S.%f")[:-3],
                        "ts_local_utc": now_utc.isoformat(),
                        "ts_atomic_utc": atomic_utc.isoformat() if atomic_utc is not None else None,
                        "atomic_offset_ms": round(float(offset_ms), 3) if offset_ms is not None else None,
                        "sync_quality": quality,
                        "source_file": source.name,
                        "source_offset": int(line_pos),
                        "client_time": client_clock,
                        "resolved_client_local": resolved_client_local.strftime("%Y-%m-%d %H:%M:%S.%f")[:-3],
                        "kind": kind,
                        "amount": int(amount),
                        "raw": raw_line.strip(),
                    }
                    out_fh.write(json.dumps(entry, ensure_ascii=False) + "\n")
                    appended += 1

                    fps_set.add(fp)
                    fps_list.append(fp)
                    if len(fps_list) > 8000:
                        drop_count = len(fps_list) - 8000
                        for old_fp in fps_list[:drop_count]:
                            fps_set.discard(old_fp)
                        fps_list = fps_list[drop_count:]

                try:
                    last_pos = int(source.stat().st_size)
                except OSError:
                    pass
                source_state["pos"] = max(start_pos, int(last_pos))
                sources[source_key] = source_state
    except OSError:
        return appended

    state["sources"] = sources
    state["active_source"] = str(sources_list[0]) if sources_list else ""
    state["recent_fingerprints"] = fps_list[-8000:]
    _write_state(state)
    return appended


def _iter_permanent_events():
    if not _PERM_EVENTS_LOG.exists():
        return
    try:
        with _PERM_EVENTS_LOG.open("r", encoding="utf-8", errors="ignore") as fh:
            for line in fh:
                raw = line.strip()
                if not raw:
                    continue
                try:
                    data = json.loads(raw)
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
                dt = _parse_local_iso(str(data.get("resolved_client_local") or ""))
                if dt is None:
                    dt = _parse_local_iso(str(data.get("ts_local") or ""))
                if dt is None:
                    continue
                yield {
                    "dt": dt,
                    "kind": kind,
                    "amount": amount,
                    "source_offset": int(data.get("source_offset") or 0),
                }
    except OSError:
        return


def read_permanent_kamas_events() -> list[dict]:
    events = list(_iter_permanent_events() or [])
    events.sort(key=lambda item: item["dt"])
    return events


def get_permanent_events_start_ts() -> str | None:
    for evt in _iter_permanent_events() or []:
        return evt["dt"].strftime("%Y-%m-%d %H:%M:%S")
    return None


def replay_permanent_delta(since_iso: str | None, file_offset: int = 0) -> int:
    sync_permanent_kamas_journal()

    file_size = get_permanent_events_size()
    use_offset = file_offset > 0 and file_offset < file_size

    since_dt: datetime | None = None
    if since_iso and not use_offset:
        since_dt = _parse_local_iso(since_iso)

    delta = 0
    try:
        with _PERM_EVENTS_LOG.open("rb") as fh_bin:
            if use_offset:
                fh_bin.seek(file_offset)
            fh = io.TextIOWrapper(fh_bin, encoding="utf-8", errors="ignore")
            for line in fh:
                raw = line.strip()
                if not raw:
                    continue
                try:
                    data = json.loads(raw)
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

                if since_dt is not None and not use_offset:
                    evt_dt = _parse_local_iso(str(data.get("resolved_client_local") or ""))
                    if evt_dt is None:
                        evt_dt = _parse_local_iso(str(data.get("ts_local") or ""))
                    if evt_dt is None or evt_dt <= since_dt:
                        continue

                if kind == "gain":
                    delta += amount
                else:
                    delta -= amount
    except OSError:
        return 0

    return delta
