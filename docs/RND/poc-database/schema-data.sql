-- ============================================================
-- WAKFU ASSISTANT — Schema donnees structurees
-- Applique a wakfu_permanent.db (CREATE IF NOT EXISTS, non-destructif)
-- Cohabite avec schema-permanent.sql (raw_log_lines, parsed_events, ingest_state)
-- ============================================================

-- ── Niveaux de metiers (persistant, mis a jour a chaque level-up) ────
CREATE TABLE IF NOT EXISTS job_levels (
    server      TEXT    NOT NULL,
    job_name    TEXT    NOT NULL,
    level       INTEGER NOT NULL,
    updated_at  TEXT    NOT NULL,
    PRIMARY KEY (server, job_name)
);

-- ── Niveaux de personnages (persistant) ──────────────────────────────
CREATE TABLE IF NOT EXISTS character_levels (
    server          TEXT    NOT NULL,
    character_name  TEXT    NOT NULL,
    level           INTEGER NOT NULL,
    updated_at      TEXT    NOT NULL,
    PRIMARY KEY (server, character_name)
);

-- ── Evenements XP (permanents — la "time machine") ──────────────────
-- Chaque gain d'XP est stocke pour toujours.
-- UNIQUE empeche les doublons lors de re-scans des memes fichiers log.
CREATE TABLE IF NOT EXISTS xp_events (
    id              INTEGER PRIMARY KEY AUTOINCREMENT,
    server          TEXT    NOT NULL,
    character_name  TEXT,
    source_ts       TEXT,               -- HH:MM:SS depuis la ligne de log
    absolute_ts     TEXT,               -- ISO datetime reconstruit (ancres de date)
    entity_name     TEXT    NOT NULL,
    entity_type     TEXT    NOT NULL,    -- 'character' | 'job'
    xp_gained       INTEGER NOT NULL,
    xp_remaining    INTEGER NOT NULL,
    level_up        INTEGER NOT NULL DEFAULT 0,
    inserted_at     TEXT    NOT NULL,
    UNIQUE(server, source_ts, entity_name, xp_gained, xp_remaining)
);

CREATE INDEX IF NOT EXISTS idx_xpe_entity  ON xp_events(entity_name, entity_type);
CREATE INDEX IF NOT EXISTS idx_xpe_server  ON xp_events(server);
CREATE INDEX IF NOT EXISTS idx_xpe_abs_ts  ON xp_events(absolute_ts);

-- ── Courbe XP observee (crowdsourcee a chaque level-up) ─────────────
-- Une seule valeur par (type, niveau) — INSERT OR REPLACE a chaque observation
CREATE TABLE IF NOT EXISTS xp_curve_observed (
    curve_type  TEXT    NOT NULL,       -- 'character' | 'job'
    level       INTEGER NOT NULL,
    xp_required INTEGER NOT NULL,       -- XP totale de la barre pour ce niveau
    observed_at TEXT    NOT NULL,
    source      TEXT    NOT NULL DEFAULT 'live',
    PRIMARY KEY (curve_type, level)
);

-- ── Evenements Capt'chat (antibot breed 5314) ───────────────────────
CREATE TABLE IF NOT EXISTS captchat_events (
    id                  INTEGER PRIMARY KEY AUTOINCREMENT,
    server              TEXT    NOT NULL,
    character_name      TEXT,
    detected_at         TEXT    NOT NULL,
    total_harvests_at   INTEGER,
    source_line         TEXT
);

CREATE INDEX IF NOT EXISTS idx_captchat_server ON captchat_events(server);

-- ── Ressources connues par metier (auto-appris) ─────────────────────
-- Chaque fois qu'on voit "Vous avez ramassé Nx {item}" apres un gain XP
-- d'un metier de recolte, on apprend que cet item vient de ce metier.
CREATE TABLE IF NOT EXISTS job_resources (
    job_name        TEXT    NOT NULL,
    item_name       TEXT    NOT NULL,
    last_seen       TEXT    NOT NULL,
    harvest_count   INTEGER NOT NULL DEFAULT 1,
    total_qty       INTEGER NOT NULL DEFAULT 0,
    PRIMARY KEY (job_name, item_name)
);

-- ── Prix observes des objets (historique, auto-detecte) ──────────────
-- Chaque achat/vente HDV genere un prix observe.
-- perdu Nk + ramassé Mx Item dans la meme seconde = achat a N/M par unite.
-- gagné Nk + perdu Mx Item dans la meme seconde = vente a N/M par unite.
CREATE TABLE IF NOT EXISTS item_prices (
    id              INTEGER PRIMARY KEY AUTOINCREMENT,
    server          TEXT    NOT NULL,
    item_name       TEXT    NOT NULL,
    item_key        TEXT    NOT NULL,        -- nom normalise
    unit_price      INTEGER NOT NULL,        -- prix par unite en kamas
    total_price     INTEGER NOT NULL,        -- prix total paye/recu
    quantity        INTEGER NOT NULL,
    direction       TEXT    NOT NULL,         -- 'buy' | 'sell'
    observed_at     TEXT    NOT NULL,         -- timestamp absolu
    source_ts       TEXT,                    -- HH:MM:SS,mmm du log
    character_name  TEXT
);

CREATE INDEX IF NOT EXISTS idx_prices_item   ON item_prices(item_key);
CREATE INDEX IF NOT EXISTS idx_prices_server ON item_prices(server);

-- ── Cartographie (maps et régions) ───────────────────────────
-- Une entrée par (world_id, region_name). Mise à jour à chaque /positionsync.
-- region_name = '' quand la carte n'a pas de régions.
CREATE TABLE IF NOT EXISTS map_locations (
    world_id        INTEGER NOT NULL,
    region_name     TEXT    NOT NULL DEFAULT '',   -- '' = pas de région
    map_name_fr     TEXT,
    map_name_en     TEXT,
    leader_name     TEXT,
    map_lvl_min     INTEGER,
    map_lvl_max     INTEGER,
    region_lvl_min  INTEGER,
    region_lvl_max  INTEGER,
    job_requirements TEXT,   -- ex: "Forestier:35,Herboriste:35,Paysan:30-35"
    observed_at     TEXT    NOT NULL,
    observed_by     TEXT,
    PRIMARY KEY (world_id, region_name)
);

-- ── Donnees synchronisees (universel, via commandes chat in-game) ─────
-- Systeme de correction universel : le joueur tape /sync<category><key><value>
-- dans le chat Wakfu, le script capte "Commande inconnue" et stocke la valeur.
-- Categories: item, job, characterxplvl, characterxpcurrent, characterxptarget, playtime
-- Le champ value est mis a jour en temps reel (+ramassé, -perdu, level-up, etc.)
CREATE TABLE IF NOT EXISTS sync_data (
    server      TEXT    NOT NULL,
    category    TEXT    NOT NULL,
    key         TEXT    NOT NULL,        -- nom normalise (lowercase, sans accents/espaces)
    key_display TEXT,                    -- nom affichable (avec accents, majuscules)
    value       INTEGER NOT NULL,
    updated_at  TEXT    NOT NULL,
    source      TEXT    NOT NULL DEFAULT 'chat',  -- 'chat' | 'auto' | 'log'
    PRIMARY KEY (server, category, key)
);
