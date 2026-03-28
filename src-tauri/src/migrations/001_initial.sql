CREATE TABLE IF NOT EXISTS migrations (
    id INTEGER PRIMARY KEY,
    name TEXT NOT NULL,
    applied_at TEXT NOT NULL DEFAULT (datetime('now'))
);

CREATE TABLE IF NOT EXISTS game_sessions (
    id TEXT PRIMARY KEY,
    character_name TEXT,
    server_name TEXT,
    started_at TEXT NOT NULL,
    ended_at TEXT,
    total_kamas_gained INTEGER DEFAULT 0,
    total_kamas_spent INTEGER DEFAULT 0,
    total_xp_gained INTEGER DEFAULT 0,
    total_combats INTEGER DEFAULT 0,
    total_victories INTEGER DEFAULT 0
);

CREATE TABLE IF NOT EXISTS game_events (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    session_id TEXT NOT NULL,
    timestamp TEXT NOT NULL,
    event_type TEXT NOT NULL,
    event_data TEXT NOT NULL,
    log_source TEXT NOT NULL,
    synced INTEGER DEFAULT 0,
    FOREIGN KEY (session_id) REFERENCES game_sessions(id)
);

CREATE TABLE IF NOT EXISTS economy_snapshots (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    session_id TEXT NOT NULL,
    timestamp TEXT NOT NULL,
    kamas_balance INTEGER NOT NULL,
    delta INTEGER NOT NULL,
    source TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS profession_progress (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    character_name TEXT NOT NULL,
    profession_name TEXT NOT NULL,
    current_level INTEGER NOT NULL,
    total_xp INTEGER DEFAULT 0,
    last_updated TEXT NOT NULL,
    UNIQUE(character_name, profession_name)
);

CREATE TABLE IF NOT EXISTS cdn_items_cache (
    item_id INTEGER PRIMARY KEY,
    data TEXT NOT NULL,
    cached_at TEXT NOT NULL,
    cdn_version TEXT NOT NULL
);

CREATE INDEX IF NOT EXISTS idx_events_session ON game_events(session_id, timestamp);
CREATE INDEX IF NOT EXISTS idx_events_type ON game_events(event_type);
CREATE INDEX IF NOT EXISTS idx_events_synced ON game_events(synced) WHERE synced = 0;
CREATE INDEX IF NOT EXISTS idx_economy_session ON economy_snapshots(session_id, timestamp);
