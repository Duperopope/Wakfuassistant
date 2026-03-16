#!/usr/bin/env python3
"""Wakfu Companion v3.1.0 — Entry point."""
import sys
import os
import time
import logging
from datetime import datetime

# Ensure src/ is on the path so sibling modules can be imported directly
sys.path.insert(0, os.path.dirname(__file__))

from config import (
    WAKFU_LOG, DB_PATH, CDN_ITEMS, CDN_JOBS_ITEMS,
    CDN_RESOURCES, CDN_ITEM_TYPES, CONFIG_FILE,
    LOG_FILE, PARSE_EXISTING_LOG, WEB_PORT,
)
from config import UserConfig
from database import Database
from item_db import ItemDatabase
from models import SmartInventory, Session
from parsers import LogWatcher
import api

logger = logging.getLogger("wakfu_companion")
logger.setLevel(logging.DEBUG)
fh = logging.FileHandler(LOG_FILE, encoding="utf-8")
fh.setLevel(logging.DEBUG)
fh.setFormatter(logging.Formatter("%(asctime)s [%(levelname)s] %(message)s"))
logger.addHandler(fh)
logging.getLogger("werkzeug").setLevel(logging.WARNING)

logger.info("=" * 60)
logger.info("Wakfu Companion v3.1.0")
logger.info("=" * 60)


def main():
    print("=" * 60)
    print("  WAKFU COMPANION v3.1.0")
    print(f"  Dashboard web : http://localhost:{WEB_PORT}")
    print("=" * 60)

    db = Database(DB_PATH)
    config = UserConfig(CONFIG_FILE)
    item_db = ItemDatabase(CDN_ITEMS, CDN_JOBS_ITEMS, CDN_RESOURCES, CDN_ITEM_TYPES)
    inventory = SmartInventory(db)
    session = Session(db, inventory)
    watcher = LogWatcher(WAKFU_LOG, session, parse_existing=PARSE_EXISTING_LOG)

    # Wire globals into the api module
    api.db = db
    api.config = config
    api.item_db = item_db
    api.inventory = inventory
    api.session = session
    api.watcher = watcher

    print(f"\n  Personnage : {config.get('character')} @ {config.get('server')}")
    print(f"  Log Wakfu  : {WAKFU_LOG}")
    print(f"  Database   : {DB_PATH}")

    if WAKFU_LOG.exists():
        sz = WAKFU_LOG.stat().st_size / 1024
        print(f"  Log trouve : {sz:.1f} KB")
        if PARSE_EXISTING_LOG:
            print("  Rattrapage du log en cours...")
    else:
        print("  Log introuvable (Wakfu pas encore lance ? Le watcher attend le fichier.)")

    watcher.start()
    time.sleep(1)
    print(f"  Events detectes : {watcher.events_detected}")
    print(f"\n  Ouvre http://localhost:{WEB_PORT} dans ton navigateur !")
    print("  Ctrl+C pour arreter\n")

    try:
        api.flask_app.run(host="127.0.0.1", port=WEB_PORT, debug=False, use_reloader=False)
    except KeyboardInterrupt:
        pass
    finally:
        watcher.stop()
        db.execute(
            "UPDATE sessions SET ended_at=? WHERE id=?",
            (datetime.now().isoformat(), session.session_id),
        )
        db.close()
        print("\nWakfu Companion arrete.")


if __name__ == "__main__":
    main()
