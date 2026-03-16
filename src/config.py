"""Configuration: paths, env vars, UserConfig."""
import os
import json
from pathlib import Path

# Project root: 2 levels up from this file (src/config.py -> src/ -> project root)
PROJECT_ROOT = Path(__file__).parent.parent

# Wakfu log path: env var WAKFU_LOG_PATH overrides default
_default_log = Path.home() / "AppData/Roaming/zaap/gamesLogs/wakfu/logs/wakfu.log"
WAKFU_LOG = Path(os.environ.get("WAKFU_LOG_PATH", str(_default_log)))

DB_PATH = PROJECT_ROOT / "data" / "wakfu_tracker.db"
CDN_ITEMS = PROJECT_ROOT / "data" / "ankama_cdn" / "items.json"
CDN_JOBS_ITEMS = PROJECT_ROOT / "data" / "ankama_cdn" / "jobsItems.json"
CDN_RESOURCES = PROJECT_ROOT / "data" / "ankama_cdn" / "resources.json"
CDN_ITEM_TYPES = PROJECT_ROOT / "data" / "ankama_cdn" / "itemTypes.json"
CONFIG_FILE = PROJECT_ROOT / "data" / "config.json"
LOG_FILE = PROJECT_ROOT / "logs" / "companion.log"

PARSE_EXISTING_LOG = os.environ.get("PARSE_EXISTING_LOG", "1") != "0"
WEB_PORT = int(os.environ.get("WEB_PORT", "5000"))
REFRESH_INTERVAL = int(os.environ.get("REFRESH_INTERVAL", "2"))

# Create necessary directories
LOG_FILE.parent.mkdir(parents=True, exist_ok=True)
DB_PATH.parent.mkdir(parents=True, exist_ok=True)
CONFIG_FILE.parent.mkdir(parents=True, exist_ok=True)


class UserConfig:
    DEFAULTS = {
        "character": "L'Immortel",
        "server": "Ogrest",
        "account": "Kairozadyk",
        "base_kamas": 0,
        "manual_kamas_delta": 0,
        "onboarding_done": False,
        "character_level": 0,
        "character_xp_current": 0,
        "character_xp_total": 0,
    }

    def __init__(self, path):
        self.path = Path(path)
        self.data = dict(self.DEFAULTS)
        if self.path.exists():
            try:
                with open(self.path, "r", encoding="utf-8") as f:
                    self.data.update(json.load(f))
            except Exception:
                pass
        self.save()

    def save(self):
        with open(self.path, "w", encoding="utf-8") as f:
            json.dump(self.data, f, indent=2, ensure_ascii=False)

    def get(self, k, d=None):
        return self.data.get(k, d)

    def set(self, k, v):
        self.data[k] = v
        self.save()
