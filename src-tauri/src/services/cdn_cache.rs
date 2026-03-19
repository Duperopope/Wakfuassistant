use reqwest::Client;
use rusqlite::Connection;
use serde_json::Value;
use tracing::{debug, info};

const CDN_CONFIG_URL: &str = "https://wakfu.cdn.ankama.com/gamedata/config.json";
const CDN_ITEMS_BASE: &str = "https://wakfu.cdn.ankama.com/gamedata";

/// Récupère la version du gamedata depuis le CDN config
pub async fn fetch_game_version() -> Result<String, Box<dyn std::error::Error>> {
    debug!("[CdnCache] Fetching game version from config.json");

    let client = Client::new();
    let response = client
        .get(CDN_CONFIG_URL)
        .timeout(std::time::Duration::from_secs(30))
        .send()
        .await?;

    let data: Value = response.json().await?;
    let version = data["version"]
        .as_str()
        .ok_or("Missing 'version' field in config.json")?;

    info!(version = %version, "[CdnCache] Game version fetched");
    Ok(version.to_string())
}

/// Structure pour mapper les items du CDN JSON
#[derive(serde::Deserialize, Debug)]
struct CdnItem {
    id: i64,
    #[serde(default)]
    name: serde_json::Map<String, Value>,
    #[serde(default)]
    level: i32,
    #[serde(default, rename = "itemTypeId")]
    item_type_id: i32,
    #[serde(default)]
    rarity: i32,
}

/// Télécharge et cache les items depuis le CDN
pub async fn fetch_and_cache_items(
    version: &str,
    db: &mut Connection,
) -> Result<(), Box<dyn std::error::Error>> {
    debug!(version = %version, "[CdnCache] Fetching items.json");

    // Vérifier si on a déjà cette version en cache
    let cached_version: Option<String> = db
        .query_row(
            "SELECT value FROM cdn_metadata WHERE key = 'items_version'",
            [],
            |row| row.get(0),
        )
        .ok();

    if let Some(cached) = cached_version {
        if cached == version {
            debug!("[CdnCache] Items already cached for this version");
            return Ok(());
        }
    }

    // Télécharger les items
    let url = format!("{}/{}/items.json", CDN_ITEMS_BASE, version);
    let client = Client::new();
    let response = client
        .get(&url)
        .timeout(std::time::Duration::from_secs(60))
        .send()
        .await?;

    let items: Vec<CdnItem> = response.json().await?;
    info!(count = items.len(), "[CdnCache] Items downloaded");

    // Insérer dans SQLite (transaction)
    let tx = db.transaction()?;

    // Vider la table existante
    tx.execute("DELETE FROM items_cache", [])?;

    let mut stmt = tx.prepare(
        "INSERT INTO items_cache (id, name_fr, name_en, level, item_type_id, rarity)
         VALUES (?, ?, ?, ?, ?, ?)",
    )?;

    for item in items {
        let name_fr = item
            .name
            .get("fr")
            .and_then(|v| v.as_str())
            .unwrap_or("")
            .to_string();
        let name_en = item
            .name
            .get("en")
            .and_then(|v| v.as_str())
            .unwrap_or("")
            .to_string();

        stmt.execute(rusqlite::params![
            item.id,
            name_fr,
            name_en,
            item.level,
            item.item_type_id,
            item.rarity,
        ])?;
    }
    drop(stmt);

    // Mettre à jour le metadata
    tx.execute(
        "INSERT OR REPLACE INTO cdn_metadata (key, value, updated_at) VALUES (?, ?, datetime('now'))",
        rusqlite::params!["items_version", version],
    )?;

    tx.commit()?;
    info!("[CdnCache] Items cached successfully");

    Ok(())
}

/// Récupère le nom d'un item par ID
pub fn get_item_name(db: &Connection, item_id: i64, lang: &str) -> Result<String, Box<dyn std::error::Error>> {
    let col = match lang {
        "en" => "name_en",
        _ => "name_fr",
    };

    let query = format!(
        "SELECT {} FROM items_cache WHERE id = ? LIMIT 1",
        col
    );

    let name: String = db.query_row(&query, [&item_id.to_string()], |row| {
        row.get(0)
    }).unwrap_or_else(|_| format!("Item#{}", item_id));

    debug!(item_id = item_id, lang = %lang, name = %name, "[CdnCache] Item name retrieved");

    Ok(name)
}
