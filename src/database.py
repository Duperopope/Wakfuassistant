"""Session persistence — save/load session state as JSON.

The session is saved to ``data/session.json`` so item prices,
manual quantities, and notes survive restarts.
"""

from __future__ import annotations

import json
from pathlib import Path

_SESSION_PATH = Path(__file__).parent.parent / "data" / "session.json"


def save(inventory_prices: dict[str, float],
         inventory_manual_qty: dict[str, int],
         inventory_notes: dict[str, str],
         metiers_raw: dict[str, dict],
         ) -> None:
    """Persist the mutable parts of the session that survive restarts."""
    _SESSION_PATH.parent.mkdir(parents=True, exist_ok=True)
    payload = {
        "prices": inventory_prices,
        "manual_qty": inventory_manual_qty,
        "notes": inventory_notes,
        "metiers": metiers_raw,
    }
    with open(_SESSION_PATH, "w", encoding="utf-8") as f:
        json.dump(payload, f, ensure_ascii=False, indent=2)


def load() -> dict:
    """Load persisted session data; returns empty dicts on missing file."""
    try:
        with open(_SESSION_PATH, "r", encoding="utf-8") as f:
            return json.load(f)
    except (FileNotFoundError, json.JSONDecodeError):
        return {"prices": {}, "manual_qty": {}, "notes": {}, "metiers": {}}
