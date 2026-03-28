"""Wakfu Command Center - Endpoint build optimizer."""
import json
from config import BUILD_PATH
import cdn


def get_build():
    """Charge build-result.json et enrichit avec le CDN."""
    with open(BUILD_PATH, "r", encoding="utf-8-sig") as f:
        build = json.load(f)
    for item in build.get("items", []):
        item_id = item.get("id")
        if item_id:
            c = cdn.get(item_id)
            if c:
                if not item.get("gfxId"):
                    item["gfxId"] = c["gfxId"]
                if not item.get("iconUrl"):
                    item["iconUrl"] = c["iconUrl"]
                if not item.get("typeName"):
                    item["typeName"] = c["typeName"]
                if not item.get("rarityName"):
                    item["rarityName"] = c["rarityName"]
                if not item.get("rarityColor"):
                    item["rarityColor"] = c["rarityColor"]
    return build


def register(app):
    """Enregistre la route build."""
    @app.get("/api/build")
    def api_build():
        return get_build()

    print("[BUILD] Route: /api/build")
