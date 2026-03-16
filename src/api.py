"""Flask REST + SSE API server for Wakfu Companion.

Endpoints
─────────
GET  /                     → serve frontend index.html
GET  /static/<path>        → serve frontend static files
GET  /api/data             → full state snapshot (JSON)
GET  /api/stream           → Server-Sent Events stream
POST /api/price            → set unit price for an item
POST /api/item             → modify item metadata (manual_qty, notes, …)
POST /api/metier           → add / update a profession
POST /api/config           → update a config field
POST /api/bug_report       → submit a bug report (logged to file)
"""

from __future__ import annotations

import json
import logging
import queue
import threading
import time
from pathlib import Path
from typing import Any

from flask import Flask, Response, jsonify, request, send_from_directory

import src.config as cfg
import src.database as db
import src.item_db as item_db
from src.models import Metier, SessionState
from src.parsers import LogWatcher

logger = logging.getLogger(__name__)

# ── Paths ────────────────────────────────────────────────────────────────────

_ROOT = Path(__file__).parent.parent
_FRONTEND = _ROOT / "frontend"
_LOGS_DIR = _ROOT / "logs" / "realtime"   # populated by PowerShell scripts
_BUGS_PATH = _ROOT / "data" / "bug_reports.jsonl"

# ── Global state ─────────────────────────────────────────────────────────────

_state = SessionState()
_watcher: LogWatcher | None = None
_sse_clients: list[queue.SimpleQueue] = []
_sse_lock = threading.Lock()

# ── Flask app ─────────────────────────────────────────────────────────────────

app = Flask(__name__, static_folder=None)
app.config["JSON_ENSURE_ASCII"] = False


# ── Helpers ──────────────────────────────────────────────────────────────────

def _state_snapshot() -> dict[str, Any]:
    """Build the full JSON payload consumed by the frontend."""
    config = cfg.get()
    inv = _state.inventory

    item_names = list(inv.items.keys())
    categories = item_db.build_categories_map(item_names)
    icons = item_db.build_icons_map(item_names)

    known_kamas = (
        config.get("base_kamas", 0)
        + _state.kamas_gained
        + _state.kamas_from_sales
        + config.get("manual_kamas_delta", 0)
    )

    return {
        "config": config,
        "session": _state.to_dict(),
        "inventory": inv.to_dict(),
        "known_kamas_total": known_kamas,
        "inv_value": _state.inv_value(),
        "watcher": {
            "events": _watcher.events_processed if _watcher else 0,
        },
        "item_categories": categories,
        "icons": icons,
    }


def _push_to_sse(payload: dict[str, Any]) -> None:
    """Send a JSON payload to all connected SSE clients."""
    data = json.dumps(payload, ensure_ascii=False)
    dead: list[queue.SimpleQueue] = []
    with _sse_lock:
        for q in _sse_clients:
            try:
                q.put_nowait(data)
            except Exception:
                dead.append(q)
        for d in dead:
            _sse_clients.remove(d)


def _save_persistent() -> None:
    """Persist prices, manual_qty, notes and metier config."""
    inv = _state.inventory
    db.save(
        inventory_prices=dict(inv.prices),
        inventory_manual_qty=dict(inv.manual_qty),
        inventory_notes=dict(inv.notes),
        metiers_raw={k: v.to_dict() for k, v in _state.metiers.items()},
    )


# ── Background log-polling thread ────────────────────────────────────────────

def _log_poll_loop(interval: float = 1.0) -> None:
    """Poll log files every *interval* seconds and push SSE updates."""
    global _watcher
    _watcher = LogWatcher(_LOGS_DIR, _state)
    while True:
        try:
            new = _watcher.scan_once()
            if new:
                _push_to_sse(_state_snapshot())
        except Exception as exc:
            logger.warning("Log poll error: %s", exc)
        time.sleep(interval)


# ── Routes: static files ──────────────────────────────────────────────────────

@app.route("/")
def index():
    return send_from_directory(_FRONTEND, "index.html")


@app.route("/static/<path:filename>")
def static_files(filename: str):
    return send_from_directory(_FRONTEND, filename)


# ── Routes: API ───────────────────────────────────────────────────────────────

@app.route("/api/data")
def api_data():
    return jsonify(_state_snapshot())


@app.route("/api/stream")
def api_stream():
    """Server-Sent Events endpoint — streams state updates to the client."""
    client_queue: queue.SimpleQueue = queue.SimpleQueue()
    with _sse_lock:
        _sse_clients.append(client_queue)

    def _generate():
        # Send initial snapshot immediately
        yield f"data: {json.dumps(_state_snapshot(), ensure_ascii=False)}\n\n"
        try:
            while True:
                try:
                    data = client_queue.get(timeout=25)
                    yield f"data: {data}\n\n"
                except queue.Empty:
                    # Keep-alive comment
                    yield ": keepalive\n\n"
        except GeneratorExit:
            pass
        finally:
            with _sse_lock:
                try:
                    _sse_clients.remove(client_queue)
                except ValueError:
                    pass

    return Response(_generate(), mimetype="text/event-stream",
                    headers={"Cache-Control": "no-cache",
                             "X-Accel-Buffering": "no"})


@app.route("/api/price", methods=["POST"])
def api_price():
    body: dict[str, Any] = request.get_json(force=True) or {}
    item_name: str = str(body.get("item", "")).strip()
    price = float(body.get("price", 0) or 0)
    if not item_name:
        return jsonify({"error": "missing item"}), 400
    _state.inventory.prices[item_name] = price
    _save_persistent()
    _push_to_sse(_state_snapshot())
    return jsonify({"ok": True})


@app.route("/api/item", methods=["POST"])
def api_item():
    body: dict[str, Any] = request.get_json(force=True) or {}
    item_name: str = str(body.get("item", "")).strip()
    if not item_name:
        return jsonify({"error": "missing item"}), 400
    if "manual_qty" in body:
        _state.inventory.manual_qty[item_name] = int(body["manual_qty"] or 0)
    if "notes" in body:
        _state.inventory.notes[item_name] = str(body["notes"] or "").strip()
    _save_persistent()
    _push_to_sse(_state_snapshot())
    return jsonify({"ok": True})


@app.route("/api/metier", methods=["POST"])
def api_metier():
    body: dict[str, Any] = request.get_json(force=True) or {}
    name: str = str(body.get("name", "")).strip()
    if not name:
        return jsonify({"error": "missing name"}), 400
    level = int(body.get("level") or 0)
    xp = int(body.get("xp") or 0)
    target = int(body.get("target") or 0)
    m = _state.metiers.setdefault(name, Metier(name=name))
    if level:
        m.level = level
    if xp:
        m.xp = xp
    if target:
        m.target_level = target
    _state._recompute_metier_rates(m)
    _save_persistent()
    _push_to_sse(_state_snapshot())
    return jsonify({"ok": True})


@app.route("/api/config", methods=["POST"])
def api_config():
    body: dict[str, Any] = request.get_json(force=True) or {}
    key: str = str(body.get("key", "")).strip()
    value = body.get("value")
    if not key:
        return jsonify({"error": "missing key"}), 400
    cfg.set_field(key, value)
    _push_to_sse(_state_snapshot())
    return jsonify({"ok": True})


@app.route("/api/bug_report", methods=["POST"])
def api_bug_report():
    body: dict[str, Any] = request.get_json(force=True) or {}
    _BUGS_PATH.parent.mkdir(parents=True, exist_ok=True)
    entry = {
        "ts": time.strftime("%Y-%m-%dT%H:%M:%S"),
        "report": body,
    }
    with open(_BUGS_PATH, "a", encoding="utf-8") as f:
        f.write(json.dumps(entry, ensure_ascii=False) + "\n")
    return jsonify({"ok": True})


# ── Bootstrap ─────────────────────────────────────────────────────────────────

def _bootstrap() -> None:
    """Initialise state from persisted data and config."""
    config = cfg.load()

    persisted = db.load()
    _state.inventory.prices = persisted.get("prices", {})
    _state.inventory.manual_qty = persisted.get("manual_qty", {})
    _state.inventory.notes = persisted.get("notes", {})

    # Restore metier levels/targets from persistence
    for mname, mdata in persisted.get("metiers", {}).items():
        m = Metier(name=mname)
        m.level = int(mdata.get("level") or 0)
        m.target_level = int(mdata.get("target_level") or 0)
        # Don't restore xp — it resets each session
        _state.metiers[mname] = m

    # Pre-load base kamas from config so the total is correct immediately
    _ = config.get("base_kamas", 0)

    # Start background log-polling thread (daemon so it exits with the process)
    t = threading.Thread(target=_log_poll_loop, daemon=True, name="log-poll")
    t.start()

    # Pre-warm item DB in the background
    threading.Thread(target=item_db.preload, daemon=True, name="item-db-load").start()


def create_app() -> Flask:
    """Factory — call this to get a ready-to-use Flask app."""
    _bootstrap()
    return app


def run_server(host: str = "127.0.0.1", port: int = 5000, debug: bool = False) -> None:
    """Start the Flask development server (blocking)."""
    _bootstrap()
    # Use threaded=True so SSE streams don't block other requests
    app.run(host=host, port=port, debug=debug, threaded=True, use_reloader=False)
