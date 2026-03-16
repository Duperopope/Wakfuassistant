"""Configuration management — load and persist data/config.json."""

from __future__ import annotations

import json
from pathlib import Path
from typing import Any

CONFIG_PATH = Path(__file__).parent.parent / "data" / "config.json"

_DEFAULTS: dict[str, Any] = {
    "character": "",
    "server": "",
    "account": "",
    "base_kamas": 0,
    "manual_kamas_delta": 0,
    "onboarding_done": False,
    "character_level": 0,
    "character_xp_current": 0,
    "character_xp_total": 0,
    "overlay_mode": True,
    "overlay_opacity": 0.92,
    "overlay_position": "right",
    "click_through": False,
}

_config: dict[str, Any] = {}


def load() -> dict[str, Any]:
    """Load config from disk, merging with defaults."""
    global _config
    try:
        with open(CONFIG_PATH, "r", encoding="utf-8") as f:
            _config = {**_DEFAULTS, **json.load(f)}
    except (FileNotFoundError, json.JSONDecodeError):
        _config = dict(_DEFAULTS)
    return _config


def get() -> dict[str, Any]:
    """Return current config (lazy-loading on first call)."""
    if not _config:
        load()
    return _config


def set_field(key: str, value: Any) -> None:
    """Update a single config field and persist to disk."""
    if not _config:
        load()
    _config[key] = value
    save()


def save() -> None:
    """Persist current config to disk."""
    CONFIG_PATH.parent.mkdir(parents=True, exist_ok=True)
    with open(CONFIG_PATH, "w", encoding="utf-8") as f:
        json.dump(_config, f, ensure_ascii=False, indent=2)
