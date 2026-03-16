"""Item database wrapper around the Ankama CDN data files.

Loads ``data/ankama_cdn/items.json`` (and ``jobsItems.json``) to provide:
 - Item category lookup by name
 - Icon URL lookup by name
"""

from __future__ import annotations

import json
import threading
from pathlib import Path
from typing import Any

_DATA_DIR = Path(__file__).parent.parent / "data" / "ankama_cdn"

_lock = threading.Lock()
_loaded = False
_categories: dict[str, str] = {}   # item_name -> category
_icons: dict[str, list[str]] = {}   # item_name -> [url, ...]

# Ankama CDN base URL for item icons
_CDN_BASE = "https://www.wakfu.com/static/img/items/{gfx_id}.png"

# Item type ID → human-readable category (partial mapping)
_TYPE_MAP: dict[int, str] = {
    # Equipment
    1: "Équipement", 2: "Équipement", 3: "Équipement", 4: "Équipement",
    5: "Équipement", 6: "Équipement", 7: "Équipement", 8: "Équipement",
    9: "Équipement", 10: "Équipement", 11: "Équipement", 12: "Équipement",
    85: "Équipement", 86: "Équipement",
    # Consumables / food
    120: "Consommable", 121: "Consommable", 340: "Consommable",
    # Crafting resources
    100: "Ressource", 101: "Ressource", 102: "Ressource",
    103: "Ressource", 104: "Ressource", 105: "Ressource",
    200: "Ressource", 201: "Ressource", 203: "Ressource",
    # Crafted items
    300: "Craft", 301: "Craft", 302: "Craft", 303: "Craft",
    304: "Craft", 305: "Craft", 306: "Craft", 307: "Craft",
    # Quest
    400: "Quête", 401: "Quête",
    # Decoration / furniture
    480: "Décoration", 481: "Décoration",
    # Pets / mounts
    519: "Familier",
    # Scrolls
    130: "Parchemin",
}


def _process_item_list(items: list[dict[str, Any]]) -> None:
    """Extract category and icon from a list of item dicts."""
    for item in items:
        defn = item.get("definition", {})
        # Support both items.json and jobsItems.json structures
        item_inner = defn.get("item", defn)  # items.json wraps in "item", jobsItems doesn't
        title_obj = item.get("title", {})
        fr_name: str = title_obj.get("fr") or title_obj.get("en") or ""
        if not fr_name:
            continue

        type_id = int(
            item_inner.get("baseParameters", {}).get("itemTypeId", 0)
            or item_inner.get("itemTypeId", 0)
        )
        cat = _TYPE_MAP.get(type_id, "Autres")
        _categories[fr_name] = cat

        gfx = item_inner.get("graphicParameters", {})
        gfx_id = gfx.get("gfxId") or gfx.get("femaleGfxId")
        if gfx_id:
            _icons[fr_name] = [_CDN_BASE.format(gfx_id=gfx_id)]


def _load_once() -> None:
    global _loaded
    with _lock:
        if _loaded:
            return

        for fname in ("items.json", "jobsItems.json"):
            path = _DATA_DIR / fname
            try:
                with open(path, "r", encoding="utf-8") as f:
                    raw = json.load(f)
                if isinstance(raw, list):
                    _process_item_list(raw)
                elif isinstance(raw, dict):
                    # Possible wrapped format: {"items": [...]}
                    _process_item_list(raw.get("items", []))
            except (FileNotFoundError, json.JSONDecodeError):
                continue

        _loaded = True


def get_category(name: str) -> str:
    """Return the item category for *name* (French display name)."""
    _load_once()
    return _categories.get(name, "Autres")


def get_icon_urls(name: str) -> list[str]:
    """Return a list of icon URLs for *name*."""
    _load_once()
    return _icons.get(name, [])


def build_categories_map(names: list[str]) -> dict[str, str]:
    """Return {name: category} for all *names* in one call."""
    _load_once()
    return {n: _categories.get(n, "Autres") for n in names}


def build_icons_map(names: list[str]) -> dict[str, list[str]]:
    """Return {name: [url, ...]} for all *names* that have icons."""
    _load_once()
    return {n: _icons[n] for n in names if n in _icons}
