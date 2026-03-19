CREATE TABLE IF NOT EXISTS ingest_state (
    source_file TEXT PRIMARY KEY,
    generation INTEGER NOT NULL DEFAULT 0,
    last_line_no INTEGER NOT NULL DEFAULT 0,
    last_line_count INTEGER NOT NULL DEFAULT 0,
    updated_at TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS raw_log_lines (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    source_file TEXT NOT NULL,
    generation INTEGER NOT NULL,
    source_line_no INTEGER NOT NULL,
    source_timestamp_text TEXT,
    ingested_at TEXT NOT NULL,
    raw_line TEXT NOT NULL,
    UNIQUE(source_file, generation, source_line_no)
);

CREATE INDEX IF NOT EXISTS idx_raw_source_file ON raw_log_lines(source_file);
CREATE INDEX IF NOT EXISTS idx_raw_ingested_at ON raw_log_lines(ingested_at);
CREATE INDEX IF NOT EXISTS idx_raw_source_timestamp ON raw_log_lines(source_timestamp_text);

CREATE TABLE IF NOT EXISTS parsed_events (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    raw_line_id INTEGER NOT NULL UNIQUE,
    event_type TEXT NOT NULL,
    data_json TEXT NOT NULL DEFAULT '{}',
    parsed_at TEXT NOT NULL,
    FOREIGN KEY(raw_line_id) REFERENCES raw_log_lines(id)
);

CREATE INDEX IF NOT EXISTS idx_events_event_type ON parsed_events(event_type);
CREATE INDEX IF NOT EXISTS idx_events_parsed_at ON parsed_events(parsed_at);
