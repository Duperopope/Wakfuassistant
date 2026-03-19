-- Migration 002 : CDN Cache (2026-03-19)

CREATE TABLE IF NOT EXISTS cdn_metadata (
    key TEXT PRIMARY KEY,
    value TEXT NOT NULL,
    updated_at TEXT NOT NULL DEFAULT (datetime('now'))
);

CREATE TABLE IF NOT EXISTS items_cache (
    id INTEGER PRIMARY KEY,
    name_fr TEXT NOT NULL DEFAULT '',
    name_en TEXT NOT NULL DEFAULT '',
    level INTEGER NOT NULL DEFAULT 0,
    item_type_id INTEGER NOT NULL DEFAULT 0,
    rarity INTEGER NOT NULL DEFAULT 0
);

CREATE INDEX IF NOT EXISTS idx_items_cache_level ON items_cache(level);
CREATE INDEX IF NOT EXISTS idx_items_cache_rarity ON items_cache(rarity);
