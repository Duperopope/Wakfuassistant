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

/// Rafraîchit le cache des recettes (recipes, ingredients, results)
#[tauri::command]
pub async fn refresh_recipes_cache() -> Result<String, String> {
    debug!("[CdnCommands] refresh_recipes_cache");

    let version = cdn_cache::fetch_game_version()
        .await
        .map_err(|e| format!("Erreur fetch_game_version: {}", e))?;

    info!(version = %version, "[CdnCommands] Fetching recipes for version");

    let db_path = crate::utils::paths::database_path();
    let mut db = database::init_database(&db_path)
        .map_err(|e| format!("Erreur init_database: {}", e))?;

    cdn_cache::fetch_and_cache_recipes(&version, &mut db)
        .await
        .map_err(|e| format!("Erreur fetch_and_cache_recipes: {}", e))?;

    cdn_cache::fetch_and_cache_recipe_ingredients(&version, &mut db)
        .await
        .map_err(|e| format!("Erreur fetch_and_cache_recipe_ingredients: {}", e))?;

    cdn_cache::fetch_and_cache_recipe_results(&version, &mut db)
        .await
        .map_err(|e| format!("Erreur fetch_and_cache_recipe_results: {}", e))?;

    let msg = format!("Recipes cache refreshed for version {}", version);
    info!("[CdnCommands] {}", msg);
    Ok(msg)
}

/// Récupère la recette d'un item par son item_id (résultat)
#[tauri::command]
pub fn get_recipe_by_item_id(item_id: i64) -> Result<String, String> {
    debug!(item_id = item_id, "[CdnCommands] get_recipe_by_item_id");

    let db_path = crate::utils::paths::database_path();
    let db = database::init_database(&db_path)
        .map_err(|e| format!("Erreur init_database: {}", e))?;

    let mut stmt = db
        .prepare(
            "SELECT r.recipe_id, r.category, r.level, r.xp_ratio,
                    ri.item_id as ingredient_id, ri.quantity as ingredient_qty,
                    ri.ingredient_order, ic.name_fr as ingredient_name
             FROM recipe_results_cache rr
             JOIN recipes_cache r ON r.recipe_id = rr.recipe_id
             JOIN recipe_ingredients_cache ri ON ri.recipe_id = r.recipe_id
             LEFT JOIN items_cache ic ON ic.id = ri.item_id
             WHERE rr.item_id = ?
             ORDER BY r.recipe_id, ri.ingredient_order",
        )
        .map_err(|e| format!("Erreur prepare: {}", e))?;

    let rows = stmt
        .query_map([item_id], |row| {
            Ok(serde_json::json!({
                "recipe_id": row.get::<_, i64>(0)?,
                "category": row.get::<_, i32>(1)?,
                "level": row.get::<_, i32>(2)?,
                "xp_ratio": row.get::<_, i32>(3)?,
                "ingredient_id": row.get::<_, i64>(4)?,
                "ingredient_qty": row.get::<_, i32>(5)?,
                "ingredient_order": row.get::<_, i32>(6)?,
                "ingredient_name": row.get::<_, Option<String>>(7)?.unwrap_or_default(),
            }))
        })
        .map_err(|e| format!("Erreur query: {}", e))?;

    let mut results = Vec::new();
    for row in rows {
        results.push(row.map_err(|e| format!("Erreur row: {}", e))?);
    }

    let json = serde_json::to_string(&results).map_err(|e| e.to_string())?;
    debug!(item_id = item_id, count = results.len(), "[CdnCommands] Recipe rows returned");
    Ok(json)
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
