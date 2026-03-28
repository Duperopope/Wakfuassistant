"""Wakfu Command Center - Chargement et recherche CDN items."""
import json
from config import CDN_PATH, RARITY_MAP, TYPE_MAP

_by_id = {}
_all = []
_loaded = False


def load():
    """Charge le CDN JSON et indexe par item ID."""
    global _by_id, _all, _loaded
    if _loaded:
        return
    print(f"[CDN] Chargement {CDN_PATH}")
    with open(CDN_PATH, "r", encoding="utf-8") as f:
        raw = json.load(f)

    for entry in raw:
        if not isinstance(entry, dict):
            continue
        defn = entry.get("definition", {})
        item = defn.get("item", {}) if isinstance(defn, dict) else {}
        bp = item.get("baseParameters", {}) if isinstance(item, dict) else {}
        gp = item.get("graphicParameters", {}) if isinstance(item, dict) else {}
        title = entry.get("title", {})
        desc = entry.get("description", {})

        item_id = item.get("id")
        if item_id is None:
            continue

        type_id = bp.get("itemTypeId", 0)
        rarity = bp.get("rarity", 0)
        gfx_id = gp.get("gfxId", 0)
        rn, rc = RARITY_MAP.get(rarity, ("?", "#999"))
        tn = TYPE_MAP.get(type_id, f"Type#{type_id}")

        stats = []
        for eff in defn.get("equipEffects", []):
            if isinstance(eff, dict):
                ef = eff.get("effect", {})
                if isinstance(ef, dict):
                    ed = ef.get("definition", {})
                    ep = ef.get("params", [])
                    stats.append({"actionId": ed.get("actionId", 0) if isinstance(ed, dict) else 0, "value": ep[0] if ep else 0})

        parsed = {
            "id": item_id, "level": item.get("level", 0),
            "name_fr": title.get("fr", f"Item#{item_id}") if isinstance(title, dict) else f"Item#{item_id}",
            "name_en": title.get("en", "") if isinstance(title, dict) else "",
            "desc_fr": desc.get("fr", "") if isinstance(desc, dict) else "",
            "typeId": type_id, "typeName": tn,
            "rarity": rarity, "rarityName": rn, "rarityColor": rc,
            "setId": bp.get("itemSetId", 0), "gfxId": gfx_id,
            "iconUrl": f"https://static.ankama.com/wakfu/portal/game/item/115/{gfx_id}.png" if gfx_id else "",
            "stats": stats,
        }
        _by_id[item_id] = parsed
        _all.append(parsed)

    _loaded = True
    print(f"[CDN] {len(_by_id)} items indexes")


def get(item_id: int):
    """Retourne un item CDN par ID, ou None."""
    return _by_id.get(item_id)


def search(q="", type_id=None, rarity=None, min_level=None, max_level=None, limit=20, offset=0):
    """Recherche dans le CDN avec filtres."""
    results = _all
    if q:
        ql = q.lower()
        results = [i for i in results if ql in i["name_fr"].lower() or ql in i.get("name_en", "").lower()]
    if type_id is not None:
        results = [i for i in results if i["typeId"] == type_id]
    if rarity is not None:
        results = [i for i in results if i["rarity"] == rarity]
    if min_level is not None:
        results = [i for i in results if i["level"] >= min_level]
    if max_level is not None:
        results = [i for i in results if i["level"] <= max_level]
    return {"total": len(results), "limit": limit, "offset": offset, "items": results[offset:offset+limit]}


def register(app):
    """Enregistre les routes CDN."""
    load()

    @app.get("/api/cdn/{item_id}")
    def cdn_by_id(item_id: int):
        from fastapi.responses import JSONResponse
        item = get(item_id)
        if item:
            return item
        return JSONResponse({"error": "Item non trouve"}, status_code=404)

    @app.get("/api/cdn")
    def cdn_search(q: str = "", limit: int = 20, offset: int = 0, type_id: int = None, rarity: int = None, min_level: int = None, max_level: int = None):
        return search(q, type_id, rarity, min_level, max_level, limit, offset)

    print("[CDN] Routes: /api/cdn, /api/cdn/{id}")
