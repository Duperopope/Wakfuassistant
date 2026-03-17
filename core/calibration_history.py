from __future__ import annotations

import json
from datetime import datetime
from pathlib import Path

_ROOT = Path(__file__).resolve().parents[1]
_PATH = _ROOT / "data" / "calibration_entries.json"


def _now_ms() -> str:
    return datetime.now().strftime("%Y-%m-%d %H:%M:%S.%f")[:-3]


def _read() -> list[dict]:
    if not _PATH.exists():
        return []
    try:
        data = json.loads(_PATH.read_text(encoding="utf-8"))
    except Exception:
        return []
    if not isinstance(data, list):
        return []
    out: list[dict] = []
    for row in data:
        if not isinstance(row, dict):
            continue
        if not isinstance(row.get("id"), str):
            continue
        if not isinstance(row.get("kind"), str):
            continue
        if not isinstance(row.get("ts"), str):
            continue
        payload = row.get("payload")
        if not isinstance(payload, dict):
            payload = {}
        out.append({
            "id": row["id"],
            "kind": row["kind"],
            "ts": row["ts"],
            "payload": payload,
        })
    return out


def _write(entries: list[dict]):
    _PATH.parent.mkdir(parents=True, exist_ok=True)
    _PATH.write_text(json.dumps(entries, ensure_ascii=False, indent=2), encoding="utf-8")


def list_entries(kind: str | None = None, limit: int = 100) -> list[dict]:
    rows = _read()
    if kind:
        rows = [r for r in rows if r.get("kind") == kind]
    rows.sort(key=lambda r: r.get("ts", ""), reverse=True)
    return rows[: max(1, int(limit))]


def add_entry(kind: str, payload: dict) -> dict:
    kind = str(kind or "").strip()
    if not kind:
        raise ValueError("kind is required")
    entries = _read()
    ts = _now_ms()
    entry_id = f"{kind}-{int(datetime.now().timestamp() * 1000)}-{len(entries) + 1}"
    item = {
        "id": entry_id,
        "kind": kind,
        "ts": ts,
        "payload": dict(payload or {}),
    }
    entries.append(item)
    _write(entries)
    return item


def update_entry(entry_id: str, payload: dict) -> bool:
    entry_id = str(entry_id or "").strip()
    if not entry_id:
        return False
    entries = _read()
    for row in entries:
        if row.get("id") == entry_id:
            row["payload"] = dict(payload or {})
            row["ts"] = _now_ms()
            _write(entries)
            return True
    return False


def delete_entry(entry_id: str) -> bool:
    entry_id = str(entry_id or "").strip()
    if not entry_id:
        return False
    entries = _read()
    new_entries = [r for r in entries if r.get("id") != entry_id]
    if len(new_entries) == len(entries):
        return False
    _write(new_entries)
    return True


def last_entry(kind: str) -> dict | None:
    rows = list_entries(kind=kind, limit=1)
    return rows[0] if rows else None