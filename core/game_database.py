from __future__ import annotations

import json
import hashlib
from pathlib import Path
from threading import Lock

_PROJECT_ROOT = Path(__file__).resolve().parents[1]
_DB_PATH = _PROJECT_ROOT / "data" / "game_database.json"

_lock = Lock()


def _default_db() -> dict:
    return {
        "items": {},
        "professions": {},
        "recipes": {},
    }


def _read_db() -> dict:
    if not _DB_PATH.exists():
        return _default_db()
    try:
        raw = json.loads(_DB_PATH.read_text(encoding="utf-8"))
        if not isinstance(raw, dict):
            return _default_db()
        out = _default_db()
        out.update(raw)
        for key in ("items", "professions", "recipes"):
            if not isinstance(out.get(key), dict):
                out[key] = {}
        return out
    except Exception:
        return _default_db()


def _write_db(data: dict):
    _DB_PATH.parent.mkdir(parents=True, exist_ok=True)
    _DB_PATH.write_text(json.dumps(data, ensure_ascii=False, indent=2), encoding="utf-8")


def get_item_settings(name: str) -> dict:
    key = str(name or "").strip()
    if not key:
        return {}
    with _lock:
        db = _read_db()
        val = db.get("items", {}).get(key, {})
        return val if isinstance(val, dict) else {}


def set_item_settings(name: str, qty_override: int | None = None, ah_price: int | None = None):
    key = str(name or "").strip()
    if not key:
        return
    with _lock:
        db = _read_db()
        items = db.setdefault("items", {})
        cur = items.get(key, {})
        if not isinstance(cur, dict):
            cur = {}
        if qty_override is not None:
            cur["qty_override"] = max(0, int(qty_override))
        if ah_price is not None:
            cur["ah_price"] = max(0, int(ah_price))
        items[key] = cur
        _write_db(db)


def rename_item(old_name: str, new_name: str):
    old_key = str(old_name or "").strip()
    new_key = str(new_name or "").strip()
    if not old_key or not new_key or old_key == new_key:
        return
    with _lock:
        db = _read_db()
        items = db.setdefault("items", {})
        old_val = items.pop(old_key, None)
        if isinstance(old_val, dict):
            merged = items.get(new_key, {})
            if not isinstance(merged, dict):
                merged = {}
            merged.update(old_val)
            items[new_key] = merged
        _write_db(db)


def get_profession_state(name: str) -> dict:
    key = str(name or "").strip().lower()
    if not key:
        return {"level": 1, "xp_remaining": 0}
    with _lock:
        db = _read_db()
        val = db.get("professions", {}).get(key, {})
        if not isinstance(val, dict):
            val = {}
        return {
            "level": int(val.get("level", 1) or 1),
            "xp_remaining": int(val.get("xp_remaining", 0) or 0),
        }


def set_profession_state(name: str, level: int, xp_remaining: int):
    key = str(name or "").strip().lower()
    if not key:
        return
    with _lock:
        db = _read_db()
        profs = db.setdefault("professions", {})
        profs[key] = {
            "level": max(1, int(level)),
            "xp_remaining": max(0, int(xp_remaining)),
        }
        _write_db(db)


def list_recipes(profession: str, recipe_type: str) -> list[dict]:
    pkey = str(profession or "").strip().lower()
    rkey = "incoming" if str(recipe_type or "").strip().lower() == "incoming" else "outgoing"
    if not pkey:
        return []
    with _lock:
        db = _read_db()
        plist = db.get("recipes", {}).get(pkey, {}).get(rkey, [])
        if not isinstance(plist, list):
            return []
        out: list[dict] = []
        for r in plist:
            if not isinstance(r, dict):
                continue
            comps = r.get("components", [])
            if not isinstance(comps, list):
                comps = []
            out.append({
                "id":          str(r.get("id", "")),
                "item_id":     int(r["item_id"]) if r.get("item_id") is not None else None,
                "output_item": str(r.get("output_item", "")).strip(),
                "output_qty":  max(1, int(r.get("output_qty", 1) or 1)),
                "xp":          int(r["xp"]) if r.get("xp") is not None else None,
                "craft_level": int(r["craft_level"]) if r.get("craft_level") is not None else None,
                "rarity":      int(r["rarity"]) if r.get("rarity") is not None else None,
                "components": [
                    {
                        "item":    str(c.get("item", "")).strip(),
                        "item_id": int(c["item_id"]) if c.get("item_id") is not None else None,
                        "qty":     max(1, int(c.get("qty", 1) or 1)),
                    }
                    for c in comps if isinstance(c, dict)
                ],
            })
        return out


def upsert_recipe(profession: str, recipe_type: str, recipe: dict):
    pkey = str(profession or "").strip().lower()
    if not pkey:
        return
    rkey = "incoming" if str(recipe_type or "").strip().lower() == "incoming" else "outgoing"
    rid = str(recipe.get("id", "")).strip()
    if not rid:
        # Generate a stable, deterministic id based on essential recipe contents
        # This ensures repeated upserts of the same recipe update the existing entry
        output_item = str(recipe.get("output_item", "")).strip()
        components = recipe.get("components", [])
        comps = []
        for c in components:
            if isinstance(c, dict):
                comps.append({
                    "item": str(c.get("item", "")).strip(),
                    "qty": int(c.get("qty", 1) or 1),
                })
        # Normalize order for deterministic hashing
        comps.sort(key=lambda x: x["item"])
        data = {
            "output_item": output_item,
            "output_qty": int(recipe.get("output_qty", 1) or 1),
            "components": comps,
        }
        hash_digest = hashlib.sha256(json.dumps(data, sort_keys=True).encode("utf-8")).hexdigest()[:8]
        rid = f"{pkey}-{rkey}-{hash_digest}"
    _opt_int = lambda k: int(recipe[k]) if recipe.get(k) is not None else None
    normalized = {
        "id":          rid,
        "item_id":     _opt_int("item_id"),
        "output_item": str(recipe.get("output_item", "")).strip(),
        "output_qty":  max(1, int(recipe.get("output_qty", 1) or 1)),
        "xp":          _opt_int("xp"),
        "craft_level": _opt_int("craft_level"),
        "rarity":      _opt_int("rarity"),
        "components": [
            {
                "item":    str(c.get("item", "")).strip(),
                "item_id": int(c["item_id"]) if c.get("item_id") is not None else None,
                "qty":     max(1, int(c.get("qty", 1) or 1)),
            }
            for c in recipe.get("components", []) if isinstance(c, dict)
        ],
    }

    with _lock:
        db = _read_db()
        recipes = db.setdefault("recipes", {})
        by_prof = recipes.setdefault(pkey, {})
        for rk in ("incoming", "outgoing"):
            if not isinstance(by_prof.get(rk), list):
                by_prof[rk] = []
        lst: list[dict] = by_prof[rkey]
        for i, existing in enumerate(lst):
            if isinstance(existing, dict) and str(existing.get("id", "")) == rid:
                lst[i] = normalized
                _write_db(db)
                return
        lst.append(normalized)
        _write_db(db)


def delete_recipe(profession: str, recipe_type: str, recipe_id: str):
    pkey = str(profession or "").strip().lower()
    rid = str(recipe_id or "").strip()
    if not pkey or not rid:
        return
    rkey = "incoming" if str(recipe_type or "").strip().lower() == "incoming" else "outgoing"
    with _lock:
        db = _read_db()
        lst = db.setdefault("recipes", {}).setdefault(pkey, {}).setdefault(rkey, [])
        if not isinstance(lst, list):
            return
        db["recipes"][pkey][rkey] = [r for r in lst if not (isinstance(r, dict) and str(r.get("id", "")) == rid)]
        _write_db(db)


def get_all_known_items() -> list[str]:
    items_path = _PROJECT_ROOT / "data" / "ankama_cdn" / "items.json"
    resources_path = _PROJECT_ROOT / "data" / "ankama_cdn" / "resources.json"
    jobs_path = _PROJECT_ROOT / "data" / "ankama_cdn" / "jobsItems.json"

    names: set[str] = set()
    for path in (items_path, resources_path, jobs_path):
        if not path.exists():
            continue
        try:
            rows = json.loads(path.read_text(encoding="utf-8"))
        except Exception:
            continue
        if not isinstance(rows, list):
            continue
        for row in rows:
            if not isinstance(row, dict):
                continue
            title = row.get("title", {})
            if isinstance(title, dict):
                fr = str(title.get("fr", "")).strip()
                if fr:
                    names.add(fr)

    return sorted(names, key=lambda s: s.lower())
