CREATE TABLE IF NOT EXISTS game_events (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    timestamp TEXT NOT NULL,
    event_type TEXT NOT NULL,
    raw_line TEXT NOT NULL,
    data_json TEXT DEFAULT '{}',
    session_id TEXT
);

CREATE INDEX IF NOT EXISTS idx_event_type ON game_events(event_type);
CREATE INDEX IF NOT EXISTS idx_timestamp ON game_events(timestamp);
