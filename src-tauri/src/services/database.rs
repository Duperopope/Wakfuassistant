use rusqlite::Connection;
use std::path::Path;
use tracing::info;

/// Initialise la base SQLite avec mode WAL et cache optimisé pour un overlay gaming.
pub fn init_database(db_path: &Path) -> Result<Connection, rusqlite::Error> {
    if let Some(parent) = db_path.parent() {
        std::fs::create_dir_all(parent).ok();
    }

    let conn = Connection::open(db_path)?;

    conn.execute_batch(
        "
        PRAGMA journal_mode = WAL;
        PRAGMA synchronous = NORMAL;
        PRAGMA cache_size = -20000;
        PRAGMA foreign_keys = ON;
        PRAGMA busy_timeout = 5000;
        PRAGMA temp_store = MEMORY;
    ",
    )?;

    info!(path = %db_path.display(), "Base SQLite initialisée (WAL, 20MB cache)");

    run_migrations(&conn)?;

    Ok(conn)
}

fn run_migrations(conn: &Connection) -> Result<(), rusqlite::Error> {
    conn.execute_batch(include_str!("../migrations/001_initial.sql"))?;
    conn.execute_batch(include_str!("../migrations/002_cdn_cache.sql"))?;
    conn.execute_batch(include_str!("../migrations/003_recipes_cache.sql"))?;
    info!("Migrations SQLite appliquées");
    Ok(())
}
