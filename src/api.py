"""Flask application: all routes and _build_data()."""
import json
import time
import logging
from collections import defaultdict
from datetime import datetime
from pathlib import Path

from flask import Flask, jsonify, render_template, request, Response

from config import REFRESH_INTERVAL, WAKFU_LOG
from config import UserConfig
from models import SmartInventory, Session

logger = logging.getLogger("wakfu_companion")

flask_app = Flask(
    __name__,
    template_folder=str(Path(__file__).parent / "templates"),
    static_folder=str(Path(__file__).parent / "static"),
)
flask_app.config["SEND_FILE_MAX_AGE_DEFAULT"] = 0

# Globals initialised by main.py before Flask starts
db = None
config = None
item_db = None
inventory = None
session = None
watcher = None


@flask_app.route("/")
def index():
    return render_template("index.html")


@flask_app.route("/api/data")
def api_data():
    return jsonify(_build_data())


@flask_app.route("/api/icon_library")
def api_icon_library():
    q = request.args.get("q", "")
    item_name = request.args.get("item", "")
    limit_raw = request.args.get("limit", "120")
    try:
        limit = max(20, min(300, int(limit_raw)))
    except Exception:
        limit = 120

    rows = item_db.icon_library(q, limit=limit)
    suggestions = item_db.get_icon_candidates(item_name) if item_name else []
    return jsonify({"ok": True, "items": rows, "suggestions": suggestions})


@flask_app.route("/api/stream")
def api_stream():
    def generate():
        while True:
            d = _build_data()
            try:
                d_json = json.dumps(d, ensure_ascii=False, default=str)
            except Exception:
                d_json = "{}"
            yield "data: " + d_json + "\n\n"
            time.sleep(REFRESH_INTERVAL)

    return Response(
        generate(),
        mimetype="text/event-stream",
        headers={"Cache-Control": "no-cache", "X-Accel-Buffering": "no"},
    )


@flask_app.route("/api/price", methods=["POST"])
def api_price():
    body = request.get_json(force=True)
    name = body.get("item", "")
    price = body.get("price", 0)
    if name and price >= 0:
        inventory.set_manual_price(name, float(price))
        logger.info(f"Prix manuel mis a jour: item={name} price={price}")
    return jsonify({"ok": True})


@flask_app.route("/api/item", methods=["POST"])
def api_item():
    body = request.get_json(force=True)
    name = body.get("item", "")
    if not name:
        return jsonify({"ok": False, "error": "item requis"}), 400

    manual_qty = body.get("manual_qty")
    notes = body.get("notes")
    manual_label = body.get("manual_label")
    manual_icon_url = body.get("manual_icon_url")

    inventory.set_item_meta(
        name,
        manual_qty=int(manual_qty) if manual_qty is not None else None,
        notes=str(notes) if notes is not None else None,
        manual_label=str(manual_label) if manual_label is not None else None,
        manual_icon_url=str(manual_icon_url) if manual_icon_url is not None else None,
    )
    logger.info(
        "Meta item mise a jour: item=%s manual_qty=%s label=%s notes_len=%s icon_override=%s",
        name,
        manual_qty,
        manual_label,
        len(str(notes or "")),
        bool(manual_icon_url),
    )
    return jsonify({"ok": True})


@flask_app.route("/api/metier", methods=["POST"])
def api_metier():
    body = request.get_json(force=True)
    metier = body.get("metier", "")
    level = body.get("level", 0)
    xp = body.get("xp", 0)
    target = body.get("target", 0)
    learn_curve = bool(body.get("learn_curve", False))
    xp_remaining = body.get("xp_remaining")
    level_for_curve = body.get("level_for_curve", level)
    if metier:
        metier_name = str(metier).strip()
        i_level = int(level or 0)
        i_xp = int(xp or 0)
        i_target = int(target or 0)
        db.execute(
            "INSERT OR REPLACE INTO metier_levels (metier, current_level, current_xp, target_level, manual_truth, last_updated) VALUES (?,?,?,?,?,?)",
            (metier_name, i_level, i_xp, i_target, 1, datetime.now().isoformat()),
        )

        if learn_curve and xp_remaining is not None:
            i_rem = int(xp_remaining or 0)
            curve_level = int(level_for_curve or i_level)
            xp_required = i_xp + i_rem
            if xp_required > 0:
                session.learn_curve_level(
                    curve_level, xp_required, source=f"manual:{metier_name}"
                )
                logger.info(
                    "Courbe XP apprise: metier=%s level=%s xp_current=%s xp_remaining=%s xp_required=%s",
                    metier_name,
                    curve_level,
                    i_xp,
                    i_rem,
                    xp_required,
                )

        logger.info(
            f"Metier {metier_name} : niveau={i_level}, xp={i_xp}, cible={i_target}, manual_truth=1"
        )
    return jsonify({"ok": True})


@flask_app.route("/api/hdv_offer", methods=["POST"])
def api_hdv_offer():
    body = request.get_json(force=True)
    action = str(body.get("action", "upsert")).strip().lower()
    offer_id = body.get("id")

    if action == "delete":
        if offer_id is None:
            return jsonify({"ok": False, "error": "id requis"}), 400
        db.execute(
            "UPDATE hdv_offers SET is_active=0, updated_at=? WHERE id=?",
            (datetime.now().isoformat(), int(offer_id)),
        )
        return jsonify({"ok": True})

    item = str(body.get("item", "")).strip()
    offer_type = str(body.get("offer_type", "sell")).strip().lower()
    if offer_type not in ("sell", "buy"):
        offer_type = "sell"
    if not item:
        return jsonify({"ok": False, "error": "item requis"}), 400

    unit_price = float(body.get("unit_price", 0) or 0)
    quantity = int(body.get("quantity", 0) or 0)
    seller_name = str(body.get("seller_name", "") or "").strip()
    is_own_offer = 1 if bool(body.get("is_own_offer", False)) else 0
    gem_slots = int(body.get("gem_slots", 0) or 0)
    sublimations = str(body.get("sublimations", "") or "").strip()
    notes = str(body.get("notes", "") or "").strip()
    now = datetime.now().isoformat()

    if offer_id is not None:
        db.execute(
            """
            UPDATE hdv_offers
            SET item_name=?, offer_type=?, unit_price=?, quantity=?, seller_name=?, is_own_offer=?, gem_slots=?, sublimations=?, notes=?, is_active=1, updated_at=?
            WHERE id=?
            """,
            (
                item,
                offer_type,
                unit_price,
                quantity,
                seller_name,
                is_own_offer,
                gem_slots,
                sublimations,
                notes,
                now,
                int(offer_id),
            ),
        )
    else:
        db.execute(
            """
            INSERT INTO hdv_offers (item_name, offer_type, unit_price, quantity, seller_name, is_own_offer, gem_slots, sublimations, notes, source, is_active, created_at, updated_at)
            VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)
            """,
            (
                item,
                offer_type,
                unit_price,
                quantity,
                seller_name,
                is_own_offer,
                gem_slots,
                sublimations,
                notes,
                "manual",
                1,
                now,
                now,
            ),
        )
    return jsonify({"ok": True})


@flask_app.route("/api/loss_tag", methods=["POST"])
def api_loss_tag():
    body = request.get_json(force=True)
    item = str(body.get("item", "") or "").strip()
    quantity = int(body.get("quantity", 0) or 0)
    reason = str(body.get("reason", "") or "").strip().lower()
    notes = str(body.get("notes", "") or "").strip()
    if not item:
        return jsonify({"ok": False, "error": "item requis"}), 400
    if quantity <= 0:
        return jsonify({"ok": False, "error": "quantite invalide"}), 400
    if reason not in ("detruit", "craft", "banque", "autre"):
        reason = "autre"
    db.execute(
        "INSERT INTO item_loss_tags (item_name, quantity, reason, notes, created_at) VALUES (?,?,?,?,?)",
        (item, quantity, reason, notes, datetime.now().isoformat()),
    )
    return jsonify({"ok": True})


@flask_app.route("/api/craft_component", methods=["POST"])
def api_craft_component():
    body = request.get_json(force=True)
    action = str(body.get("action", "upsert") or "upsert").strip().lower()
    output_item = str(body.get("output_item", "") or "").strip()
    component_item = str(body.get("component_item", "") or "").strip()

    if not output_item:
        return jsonify({"ok": False, "error": "output_item requis"}), 400

    if action == "clear":
        db.execute("DELETE FROM craft_components WHERE output_item=?", (output_item,))
        return jsonify({"ok": True})

    if not component_item:
        return jsonify({"ok": False, "error": "component_item requis"}), 400

    if action == "delete":
        db.execute(
            "DELETE FROM craft_components WHERE output_item=? AND component_item=?",
            (output_item, component_item),
        )
        return jsonify({"ok": True})

    quantity = int(body.get("quantity", 1) or 1)
    if quantity <= 0:
        quantity = 1
    db.execute(
        """
        INSERT INTO craft_components (output_item, component_item, quantity, created_at)
        VALUES (?,?,?,?)
        ON CONFLICT(output_item, component_item) DO UPDATE SET
            quantity=excluded.quantity,
            created_at=excluded.created_at
        """,
        (output_item, component_item, quantity, datetime.now().isoformat()),
    )
    return jsonify({"ok": True})


@flask_app.route("/api/reset", methods=["POST"])
def api_reset():
    global inventory, session, watcher
    body = request.get_json(force=True)
    clear_db = bool(body.get("clear_db", True))
    clear_wakfu_log = bool(body.get("clear_wakfu_log", False))
    clear_config = bool(body.get("clear_config", False))

    try:
        watcher.stop()
    except Exception:
        pass

    if clear_db:
        for table in [
            "sessions",
            "xp_events",
            "kamas_events",
            "drop_events",
            "loss_events",
            "use_events",
            "sale_events",
            "craft_events",
            "fight_events",
            "market_prices",
            "hdv_offers",
            "item_loss_tags",
            "craft_components",
            "bug_reports",
            "metier_levels",
            "user_items",
            "xp_curve_levels",
        ]:
            db.execute(f"DELETE FROM {table}")

    if clear_wakfu_log:
        try:
            if WAKFU_LOG.exists():
                WAKFU_LOG.write_text("", encoding="utf-8")
        except Exception as e:
            logger.warning(f"Impossible de vider le log Wakfu: {e}")

    if clear_config:
        for k, v in UserConfig.DEFAULTS.items():
            config.set(k, v)

    from parsers import LogWatcher

    inventory = SmartInventory(db)
    session = Session(db, inventory)
    watcher = LogWatcher(WAKFU_LOG, session, parse_existing=False)
    watcher.start()
    return jsonify({"ok": True})


@flask_app.route("/api/bug_report", methods=["POST"])
def api_bug_report():
    body = request.get_json(force=True)
    message = str(body.get("message", "") or "").strip()
    if not message:
        return jsonify({"ok": False, "error": "message requis"}), 400

    tab = str(body.get("tab", "") or "")
    context_kind = str(body.get("context_kind", "") or "")
    context_name = str(body.get("context_name", "") or "")
    context_field = str(body.get("context_field", "") or "")
    ui_state = body.get("ui_state", {})
    now = datetime.now().isoformat()

    db.execute(
        """
        INSERT INTO bug_reports (created_at, tab, context_kind, context_name, context_field, message, ui_state, status)
        VALUES (?,?,?,?,?,?,?,?)
        """,
        (
            now,
            tab,
            context_kind,
            context_name,
            context_field,
            message,
            json.dumps(ui_state, ensure_ascii=False),
            "open",
        ),
    )
    logger.info(
        "Bug report: tab=%s kind=%s name=%s field=%s msg=%s",
        tab,
        context_kind,
        context_name,
        context_field,
        message[:160],
    )
    return jsonify({"ok": True})


@flask_app.route("/api/config", methods=["POST"])
def api_config():
    body = request.get_json(force=True)
    for k, v in body.items():
        config.set(k, v)
    return jsonify({"ok": True})


def _build_data():
    s = session.snapshot()
    inv = inventory.get_snapshot()
    hdv_rows = db.query(
        """
        SELECT id, item_name, offer_type, unit_price, quantity, seller_name, is_own_offer, gem_slots, sublimations, notes, source, updated_at
        FROM hdv_offers
        WHERE is_active=1
        ORDER BY item_name COLLATE NOCASE ASC, offer_type ASC, unit_price DESC
        """
    )
    hdv_offers = defaultdict(list)
    hdv_offer_index = {}
    for row in hdv_rows:
        offer = {
            "id": int(row[0]),
            "item": row[1],
            "offer_type": row[2],
            "unit_price": float(row[3] or 0),
            "quantity": int(row[4] or 0),
            "seller_name": row[5] or "",
            "is_own_offer": bool(int(row[6] or 0)),
            "gem_slots": int(row[7] or 0),
            "sublimations": row[8] or "",
            "notes": row[9] or "",
            "source": row[10] or "manual",
            "updated_at": row[11] or "",
        }
        hdv_offers[offer["item"]].append(offer)
        hdv_offer_index[str(offer["id"])] = offer

    loss_rows = db.query(
        "SELECT item_name, reason, SUM(quantity) FROM item_loss_tags GROUP BY item_name, reason"
    )
    loss_tags = defaultdict(lambda: {"detruit": 0, "craft": 0, "banque": 0, "autre": 0})
    for item_name, reason, qty in loss_rows:
        rr = str(reason or "autre")
        if rr not in ("detruit", "craft", "banque", "autre"):
            rr = "autre"
        loss_tags[item_name][rr] = int(qty or 0)

    craft_rows = db.query(
        "SELECT output_item, component_item, quantity FROM craft_components ORDER BY output_item, component_item"
    )
    craft_recipes = defaultdict(list)
    craft_costs = {}
    for out_item, comp_item, qty in craft_rows:
        q = int(qty or 0)
        craft_recipes[out_item].append({"item": comp_item, "qty": q})
    for out_item, components in craft_recipes.items():
        total = 0
        complete = True
        for comp in components:
            unit = float(inv.get("prices", {}).get(comp["item"], 0) or 0)
            if unit <= 0:
                complete = False
            total += int(round(unit * int(comp["qty"] or 0)))
        craft_costs[out_item] = {"cost": int(total), "complete": complete}

    icon_candidates = {}
    icons = {}
    for name in inv["items"]:
        label = inv.get("manual_label", {}).get(name, "")
        candidates = item_db.get_icon_candidates(label or name)
        if candidates:
            icon_candidates[name] = candidates
        manual_icon = inv.get("manual_icon_url", {}).get(name, "")
        if manual_icon:
            icons[name] = [manual_icon] + candidates
        elif candidates:
            icons[name] = candidates

    category_names = (
        set(inv["items"].keys()) | set(inv.get("prices", {}).keys()) | set(hdv_offers.keys())
    )
    item_categories = {}
    for n in category_names:
        label = inv.get("manual_label", {}).get(n, "")
        item_categories[n] = item_db.category_for_name(label or n)

    base_kamas = int(config.get("base_kamas", 0) or 0)
    manual_kamas_delta = int(config.get("manual_kamas_delta", 0) or 0)
    known_kamas_total = (
        base_kamas
        + int(s.get("kamas_gained", 0))
        + int(s.get("kamas_from_sales", 0))
        + manual_kamas_delta
    )

    return {
        "config": config.data,
        "session": s,
        "inventory": inv,
        "hdv_offers": dict(hdv_offers),
        "hdv_offer_index": hdv_offer_index,
        "loss_tags": dict(loss_tags),
        "craft_recipes": dict(craft_recipes),
        "craft_costs": craft_costs,
        "item_categories": item_categories,
        "known_kamas_total": known_kamas_total,
        "inv_value": inventory.get_estimated_value(),
        "icons": icons,
        "icon_candidates": icon_candidates,
        "watcher": watcher.diagnostics(),
    }
