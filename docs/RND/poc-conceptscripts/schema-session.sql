-- ============================================================
-- WAKFU ASSISTANT — Session Monitor Database Schema
-- Accumule toutes les données de session pour exploitation future
-- ============================================================

PRAGMA journal_mode = WAL;
PRAGMA synchronous  = NORMAL;
PRAGMA busy_timeout = 5000;

-- ─── Zones / Mondes ─────────────────────────────────────────────────────────
-- Un "monde" = ID interne Wakfu (wakfu.log: "on quitte le monde {ID}")
-- Mapping construit au fil des sessions
CREATE TABLE IF NOT EXISTS worlds (
    world_id   INTEGER PRIMARY KEY,
    name       TEXT,           -- NULL = inconnu, nommé par le joueur quand vu la 1ère fois
    notes      TEXT,
    first_seen TEXT NOT NULL,
    last_seen  TEXT NOT NULL
);

-- Données connues depuis la doc RND
INSERT OR IGNORE INTO worlds (world_id, name, notes, first_seen, last_seen) VALUES
    (9,    'Havre-sac personnel',            'PERSONAL_SPACE_ENTER_RESULT_MESSAGE',     '2026-01-01T00:00:00', '2026-01-01T00:00:00'),
    (527,  'Zone farm (non identifiée)',      'Herborisme/collecte, captcha Capt''chat', '2026-01-01T00:00:00', '2026-01-01T00:00:00'),
    (862,  'Combat Capt''chat (antibot)',     'Monde de combat temporaire antibot',      '2026-01-01T00:00:00', '2026-01-01T00:00:00'),
    (1089, 'Bibliothèque de téléportation',  'Hub biblio-téléport (biblio-téléport item)', '2026-01-01T00:00:00', '2026-01-01T00:00:00'),
    (1135, 'Sufokia',                         'Zone principale Sufokia',                 '2026-01-01T00:00:00', '2026-01-01T00:00:00'),
    (1136, 'HDV Sufokia',                     'Hôtel des ventes Sufokia',                '2026-01-01T00:00:00', '2026-01-01T00:00:00');

-- ─── Visites de zones ───────────────────────────────────────────────────────
-- Une ligne = un changement de zone détecté ("on quitte le monde {ID}")
CREATE TABLE IF NOT EXISTS zone_visits (
    id         INTEGER PRIMARY KEY AUTOINCREMENT,
    session_id TEXT    NOT NULL,
    world_id   INTEGER NOT NULL,
    pos_x      INTEGER,            -- bZJ centré sur (X,Y) du monde suivant
    pos_y      INTEGER,
    visited_at TEXT    NOT NULL,
    source_ts  TEXT                -- timestamp du log source
);
CREATE INDEX IF NOT EXISTS idx_zone_visits_session  ON zone_visits(session_id);
CREATE INDEX IF NOT EXISTS idx_zone_visits_world    ON zone_visits(world_id);

-- ─── Messages de proximité ──────────────────────────────────────────────────
-- [Proximité] = chat local. Premier msg après zone change = probable clan master NPC
CREATE TABLE IF NOT EXISTS proximity_messages (
    id           INTEGER PRIMARY KEY AUTOINCREMENT,
    session_id   TEXT    NOT NULL,
    world_id     INTEGER,           -- monde courant au moment du message
    speaker_name TEXT    NOT NULL,
    message      TEXT    NOT NULL,
    recorded_at  TEXT    NOT NULL,
    source_ts    TEXT,
    is_clan_master INTEGER NOT NULL DEFAULT 0  -- 1 si confirmé par joueur
);
CREATE INDEX IF NOT EXISTS idx_prox_world ON proximity_messages(world_id);

-- ─── Sessions ───────────────────────────────────────────────────────────────
CREATE TABLE IF NOT EXISTS sessions (
    session_id      TEXT PRIMARY KEY,   -- ISO timestamp du démarrage du monitor
    char_name       TEXT NOT NULL,
    char_level      INTEGER,
    char_xp_in_level INTEGER,           -- XP déjà dans le niveau au démarrage (saisi)
    kamas_start     INTEGER,
    client_start_ts TEXT,               -- premier timestamp wakfu.log (lancement JVM)
    ingame_since_ts TEXT,               -- premier [Information (jeu/combat)] wakfu.log
    started_at      TEXT NOT NULL
);

-- ─── XP events ──────────────────────────────────────────────────────────────
CREATE TABLE IF NOT EXISTS xp_events (
    id           INTEGER PRIMARY KEY AUTOINCREMENT,
    session_id   TEXT    NOT NULL,
    recorded_at  TEXT    NOT NULL,
    source_ts    TEXT,
    entity_name  TEXT    NOT NULL,
    entity_type  TEXT    NOT NULL,  -- 'xp_character' | 'xp_job'
    xp_gained    INTEGER NOT NULL,
    xp_remaining INTEGER NOT NULL,
    level_up     INTEGER NOT NULL DEFAULT 0,
    world_id     INTEGER             -- monde courant au moment du gain
);
CREATE INDEX IF NOT EXISTS idx_xp_session ON xp_events(session_id);
CREATE INDEX IF NOT EXISTS idx_xp_entity  ON xp_events(entity_name, entity_type);

-- ─── Courbe XP par niveau ───────────────────────────────────────────────────
-- Enregistré à chaque level-up observé : total XP requis pour ce niveau
CREATE TABLE IF NOT EXISTS xp_curve (
    id            INTEGER PRIMARY KEY AUTOINCREMENT,
    entity_name   TEXT    NOT NULL,
    entity_type   TEXT    NOT NULL,
    level         INTEGER NOT NULL,
    total_xp      INTEGER NOT NULL,  -- XP totale requise pour passer ce niveau
    recorded_at   TEXT    NOT NULL,
    UNIQUE(entity_name, entity_type, level)
);

-- ─── Kamas ──────────────────────────────────────────────────────────────────
CREATE TABLE IF NOT EXISTS kamas_events (
    id          INTEGER PRIMARY KEY AUTOINCREMENT,
    session_id  TEXT    NOT NULL,
    recorded_at TEXT    NOT NULL,
    source_ts   TEXT,
    delta       INTEGER NOT NULL,   -- positif = gagné, négatif = dépensé
    balance     INTEGER,            -- solde estimé (NULL si non initialisé)
    world_id    INTEGER
);
CREATE INDEX IF NOT EXISTS idx_kamas_session ON kamas_events(session_id);

-- ─── Challenges ─────────────────────────────────────────────────────────────
CREATE TABLE IF NOT EXISTS challenges (
    id          INTEGER PRIMARY KEY AUTOINCREMENT,
    session_id  TEXT    NOT NULL,
    recorded_at TEXT    NOT NULL,
    source_ts   TEXT,
    name        TEXT    NOT NULL,
    result      TEXT    NOT NULL,   -- 'success' | 'failed'
    world_id    INTEGER
);

-- ─── Job levels (demandés au joueur une seule fois) ─────────────────────────
CREATE TABLE IF NOT EXISTS job_levels (
    entity_name TEXT    NOT NULL,
    level       INTEGER NOT NULL,
    xp_in_level INTEGER,
    updated_at  TEXT    NOT NULL,
    PRIMARY KEY (entity_name)
);
