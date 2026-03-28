"""Wakfu Command Center - Requetes marche HDV (SQLite)."""
import sqlite3
from config import DB_PATH
import cdn


def _db():
    conn = sqlite3.connect(DB_PATH)
    conn.row_factory = sqlite3.Row
    return conn


def query(q="", side="", min_price=None, max_price=None, sort="unit_price", order="asc", limit=50, offset=0):
    """Recherche dans market_latest avec enrichissement CDN."""
    db = _db()
    conds, params = [], []
    if q:
        ids = [i["id"] for i in cdn._all if q.lower() in i["name_fr"].lower()]
        if not ids:
            db.close()
            return {"total": 0, "limit": limit, "offset": offset, "items": []}
        conds.append(f"item_ref_id IN ({','.join('?' * len(ids))})")
        params.extend(ids)
    if side:
        conds.append("side = ?"); params.append(side)
    if min_price is not None:
        conds.append("unit_price >= ?"); params.append(min_price)
    if max_price is not None:
        conds.append("unit_price <= ?"); params.append(max_price)

    where = (" WHERE " + " AND ".join(conds)) if conds else ""
    ok_sorts = {"unit_price", "qty_remaining", "updated_at", "expiration_date", "item_ref_id"}
    sc = sort if sort in ok_sorts else "unit_price"
    so = "DESC" if order.lower() == "desc" else "ASC"

    total = db.execute(f"SELECT COUNT(*) as c FROM market_latest{where}", params).fetchone()["c"]
    rows = db.execute(f"SELECT * FROM market_latest{where} ORDER BY {sc} {so} LIMIT ? OFFSET ?", params + [limit, offset]).fetchall()

    items = []
    for row in rows:
        r = dict(row)
        c = cdn.get(r.get("item_ref_id")) or {}
        items.append({
            "side": r.get("side", ""), "itemId": r.get("item_ref_id"),
            "name": c.get("name_fr", f"Item#{r.get('item_ref_id')}"),
            "iconUrl": c.get("iconUrl", ""), "level": c.get("level", 0),
            "typeName": c.get("typeName", "?"), "rarityName": c.get("rarityName", "?"),
            "rarityColor": c.get("rarityColor", "#999"),
            "actorName": r.get("actor_name", ""), "unitPrice": r.get("unit_price", 0),
            "qtyInit": r.get("qty_init", 0), "qtyRemaining": r.get("qty_remaining", 0),
            "expirationDate": r.get("expiration_date", ""),
            "updatedAt": r.get("updated_at", ""), "slotColors": r.get("slot_colors", ""),
        })
    db.close()
    return {"total": total, "limit": limit, "offset": offset, "items": items}


def stats():
    """Statistiques globales du marche."""
    db = _db()
    total = db.execute("SELECT COUNT(*) as c FROM market_latest").fetchone()["c"]
    obs = db.execute("SELECT COUNT(*) as c FROM market_observations").fetchone()["c"]
    sells = db.execute("SELECT COUNT(*) as c FROM market_latest WHERE side='sell'").fetchone()["c"]
    buys = db.execute("SELECT COUNT(*) as c FROM market_latest WHERE side='buy'").fetchone()["c"]
    unique = db.execute("SELECT COUNT(DISTINCT item_ref_id) as c FROM market_latest").fetchone()["c"]
    latest = db.execute("SELECT MAX(updated_at) as m FROM market_latest").fetchone()["m"]
    top_rows = db.execute("SELECT item_ref_id, COUNT(*) as cnt FROM market_latest GROUP BY item_ref_id ORDER BY cnt DESC LIMIT 10").fetchall()
    top = []
    for r in top_rows:
        c = cdn.get(r["item_ref_id"]) or {}
        top.append({"itemId": r["item_ref_id"], "name": c.get("name_fr", f"Item#{r['item_ref_id']}"), "count": r["cnt"]})
    db.close()
    return {"total_offers": total, "total_observations": obs, "sell_offers": sells, "buy_offers": buys, "unique_items": unique, "latest_update": latest, "top_items": top}


def history(item_id: int, days: int = 30):
    """Historique des prix pour un item."""
    db = _db()
    rows = db.execute("SELECT * FROM market_observations WHERE item_ref_id = ? AND source_ts >= datetime('now', ? || ' days') ORDER BY source_ts DESC LIMIT 500", [item_id, f"-{days}"]).fetchall()
    c = cdn.get(item_id) or {}
    db.close()
    return {"itemId": item_id, "name": c.get("name_fr", f"Item#{item_id}"), "count": len(rows), "history": [dict(r) for r in rows]}


def register(app):
    """Enregistre les routes marche."""
    @app.get("/api/market")
    def api_market(q: str = "", limit: int = 50, offset: int = 0, side: str = "", min_price: int = None, max_price: int = None, sort: str = "unit_price", order: str = "asc"):
        return query(q, side, min_price, max_price, sort, order, limit, offset)

    @app.get("/api/market/stats")
    def api_market_stats():
        return stats()

    @app.get("/api/market/history/{item_id}")
    def api_market_history(item_id: int, days: int = 30):
        return history(item_id, days)

    print("[MARKET] Routes: /api/market, /api/market/stats, /api/market/history/{id}")
