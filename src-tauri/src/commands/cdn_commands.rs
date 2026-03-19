use tracing::{debug, info};

use crate::services::cdn_cache;
use crate::services::database;

/// Récupère la version actuelle du gamedata
#[tauri::command]
pub async fn get_cdn_version() -> Result<String, String> {
    debug!("[CdnCommands] get_cdn_version");

    let version = cdn_cache::fetch_game_version()
        .await
        .map_err(|e| format!("Erreur fetch_game_version: {}", e))?;

    info!(version = %version, "[CdnCommands] Version récupérée");
    Ok(version)
}

/// Rafraîchit le cache CDN des items
#[tauri::command]
pub async fn refresh_cdn_cache() -> Result<String, String> {
    debug!("[CdnCommands] refresh_cdn_cache");

    // Récupérer la version
    let version = cdn_cache::fetch_game_version()
        .await
        .map_err(|e| format!("Erreur fetch_game_version: {}", e))?;

    info!(version = %version, "[CdnCommands] Fetching items for version");

    // Ouvrir la base de données
    let db_path = crate::utils::paths::database_path();
    let mut db = database::init_database(&db_path)
        .map_err(|e| format!("Erreur init_database: {}", e))?;

    // Télécharger et cacher
    cdn_cache::fetch_and_cache_items(&version, &mut db)
        .await
        .map_err(|e| format!("Erreur fetch_and_cache_items: {}", e))?;

    let msg = format!("Cache rafraîchi: {}", version);
    info!("[CdnCommands] {}", msg);
    Ok(msg)
}

/// Récupère le nom d'un item
#[tauri::command]
pub fn get_item_name(item_id: i64, lang: String) -> Result<String, String> {
    debug!(item_id = item_id, lang = %lang, "[CdnCommands] get_item_name");

    // Ouvrir la base de données
    let db_path = crate::utils::paths::database_path();
    let db = database::init_database(&db_path)
        .map_err(|e| format!("Erreur init_database: {}", e))?;

    let name = cdn_cache::get_item_name(&db, item_id, &lang)
        .map_err(|e| format!("Erreur get_item_name: {}", e))?;

    Ok(name)
}
