// patrimoine_commands.rs — Valorisation du patrimoine joueur
// Croise logs/account_chest_full.json + logs/inventory_bags.json avec hdv_market.db

use rusqlite::{Connection, params};
use serde::{Deserialize, Serialize};
use std::collections::HashMap;
use std::path::PathBuf;
use tracing::{debug, info, warn};

use crate::utils::paths;

// ── JSON structs pour parser les fichiers logs ──────────────────────────────

#[derive(Deserialize, Debug)]
struct ChestJson {
    #[serde(default)]
    compartments: Vec<ChestCompartment>,
    #[serde(default, rename = "totalItems")]
    total_items: Option<u32>,
}

#[derive(Deserialize, Debug)]
struct ChestCompartment {
    #[serde(default)]
    id: String,
    #[serde(default)]
    name: String,
    #[serde(default)]
    items: Vec<ChestItem>,
}

#[derive(Deserialize, Debug, Clone)]
struct ChestItem {
    #[serde(default, rename = "itemId")]
    item_id: i64,
    #[serde(default)]
    name: String,
    #[serde(default)]
    quantity: i32,
}

#[derive(Deserialize, Debug)]
struct InventoryJson {
    #[serde(default)]
    bags: Vec<InventoryBag>,
}

#[derive(Deserialize, Debug)]
struct InventoryBag {
    #[serde(default)]
    items: Vec<ChestItem>,
}

// ── Structs retournées au frontend ──────────────────────────────────────────

#[derive(Serialize, Clone, Debug)]
pub struct PatrimoineSummary {
    pub kamas: i64,
    pub chest_value: i64,
    pub chest_item_count: u32,
    pub chest_priced_count: u32,
    pub inventory_value: i64,
    pub inventory_item_count: u32,
    pub inventory_priced_count: u32,
    pub total_value: i64,
    pub top_items: Vec<PatrimoineItem>,
    pub unpriced_count: u32,
}

#[derive(Serialize, Clone, Debug)]
pub struct PatrimoineItem {
    pub item_ref_id: i64,
    pub name: String,
    pub quantity: i32,
    pub unit_price: i64,
    pub total_value: i64,
    pub source: String,
    pub rarity: i32,
}

#[derive(Serialize, Clone, Debug)]
pub struct PatrimoineListResult {
    pub items: Vec<PatrimoineItem>,
    pub total: u32,
    pub page: u32,
    pub per_page: u32,
    pub total_value: i64,
}

// ── Helpers ─────────────────────────────────────────────────────────────────

fn logs_dir() -> PathBuf {
    let dev_path = PathBuf::from("logs");
    if dev_path.exists() {
        return dev_path;
    }
    paths::app_data_dir().join("logs")
}

fn load_chest_items() -> Vec<(i64, String, i32)> {
    let path = logs_dir().join("account_chest_full.json");
    if !path.exists() {
        warn!("[PATRIMOINE] account_chest_full.json introuvable");
        return Vec::new();
    }
    let content = match std::fs::read_to_string(&path) {
        Ok(c) => c,
        Err(e) => {
            warn!("[PATRIMOINE] Erreur lecture coffre: {}", e);
            return Vec::new();
        }
    };
    let chest: ChestJson = match serde_json::from_str(&content) {
        Ok(c) => c,
        Err(e) => {
            warn!("[PATRIMOINE] Erreur parse coffre: {}", e);
            return Vec::new();
        }
    };
    let mut items = Vec::new();
    for comp in &chest.compartments {
        for item in &comp.items {
            if item.item_id > 0 {
                items.push((item.item_id, item.name.clone(), item.quantity.max(1)));
            }
        }
    }
    items
}

fn load_inventory_items() -> Vec<(i64, String, i32)> {
    let path = logs_dir().join("inventory_bags.json");
    if !path.exists() {
        warn!("[PATRIMOINE] inventory_bags.json introuvable");
        return Vec::new();
    }
    let content = match std::fs::read_to_string(&path) {
        Ok(c) => c,
        Err(e) => {
            warn!("[PATRIMOINE] Erreur lecture inventaire: {}", e);
            return Vec::new();
        }
    };
    let inv: InventoryJson = match serde_json::from_str(&content) {
        Ok(i) => i,
        Err(e) => {
            warn!("[PATRIMOINE] Erreur parse inventaire: {}", e);
            return Vec::new();
        }
    };
    let mut items = Vec::new();
    for bag in &inv.bags {
        for item in &bag.items {
            if item.item_id > 0 {
                items.push((item.item_id, item.name.clone(), item.quantity.max(1)));
            }
        }
    }
    items
}

/// Charge les prix min SELL depuis hdv_market.db
fn load_sell_prices() -> HashMap<i64, i64> {
    let path = paths::hdv_market_db_path();
    if !path.exists() {
        return HashMap::new();
    }
    let db = match Connection::open(&path) {
        Ok(d) => d,
        Err(_) => return HashMap::new(),
    };
    let mut stmt = match db.prepare(
        "SELECT item_ref_id, MIN(unit_price) FROM market_latest
         WHERE side = 'sell' AND unit_price > 0
         GROUP BY item_ref_id"
    ) {
        Ok(s) => s,
        Err(_) => return HashMap::new(),
    };
    let mut map = HashMap::new();
    if let Ok(rows) = stmt.query_map([], |row| {
        Ok((row.get::<_, i64>(0)?, row.get::<_, i64>(1)?))
    }) {
        for row in rows.flatten() {
            map.insert(row.0, row.1);
        }
    }
    map
}

/// Charge les raretés depuis items_cache
fn load_rarities() -> HashMap<i64, i32> {
    let path = paths::database_path();
    let db = match Connection::open(&path) {
        Ok(d) => d,
        Err(_) => return HashMap::new(),
    };
    let mut stmt = match db.prepare("SELECT id, rarity FROM items_cache") {
        Ok(s) => s,
        Err(_) => return HashMap::new(),
    };
    let mut map = HashMap::new();
    if let Ok(rows) = stmt.query_map([], |row| {
        Ok((row.get::<_, i64>(0)?, row.get::<_, i32>(1)?))
    }) {
        for row in rows.flatten() {
            map.insert(row.0, row.1);
        }
    }
    map
}

fn build_patrimoine_items(
    raw_items: &[(i64, String, i32)],
    source: &str,
    prices: &HashMap<i64, i64>,
    rarities: &HashMap<i64, i32>,
) -> Vec<PatrimoineItem> {
    raw_items
        .iter()
        .map(|(id, name, qty)| {
            let unit = prices.get(id).copied().unwrap_or(0);
            PatrimoineItem {
                item_ref_id: *id,
                name: name.clone(),
                quantity: *qty,
                unit_price: unit,
                total_value: unit * (*qty as i64),
                source: source.to_string(),
                rarity: rarities.get(id).copied().unwrap_or(0),
            }
        })
        .collect()
}

// ── Commandes Tauri ─────────────────────────────────────────────────────────

#[tauri::command]
pub fn get_patrimoine_summary() -> Result<PatrimoineSummary, String> {
    debug!("[PATRIMOINE] get_patrimoine_summary");

    let prices = load_sell_prices();
    let rarities = load_rarities();

    let chest_raw = load_chest_items();
    let inv_raw = load_inventory_items();

    let chest_items = build_patrimoine_items(&chest_raw, "coffre", &prices, &rarities);
    let inv_items = build_patrimoine_items(&inv_raw, "inventaire", &prices, &rarities);

    let chest_value: i64 = chest_items.iter().map(|i| i.total_value).sum();
    let inv_value: i64 = inv_items.iter().map(|i| i.total_value).sum();
    let chest_priced = chest_items.iter().filter(|i| i.unit_price > 0).count() as u32;
    let inv_priced = inv_items.iter().filter(|i| i.unit_price > 0).count() as u32;
    let unpriced = (chest_items.len() as u32 - chest_priced) + (inv_items.len() as u32 - inv_priced);

    // Top items par valeur totale (coffre + inventaire)
    let mut all: Vec<PatrimoineItem> = chest_items.iter().chain(inv_items.iter()).cloned().collect();
    all.sort_by_key(|i| std::cmp::Reverse(i.total_value));
    let top_items: Vec<PatrimoineItem> = all.into_iter().filter(|i| i.total_value > 0).take(20).collect();

    // Kamas : on lit depuis la session (0 pour l'instant, sera enrichi)
    let kamas: i64 = 0;
    let total = kamas + chest_value + inv_value;

    info!(
        chest_value, inv_value, total,
        chest = chest_items.len(), inv = inv_items.len(),
        "[PATRIMOINE] summary computed"
    );

    Ok(PatrimoineSummary {
        kamas,
        chest_value,
        chest_item_count: chest_items.len() as u32,
        chest_priced_count: chest_priced,
        inventory_value: inv_value,
        inventory_item_count: inv_items.len() as u32,
        inventory_priced_count: inv_priced,
        total_value: total,
        top_items,
        unpriced_count: unpriced,
    })
}

#[tauri::command]
pub fn get_patrimoine_items(
    source: String,
    sort: String,
    page: u32,
    per_page: u32,
) -> Result<PatrimoineListResult, String> {
    debug!(source = %source, sort = %sort, "[PATRIMOINE] get_patrimoine_items");

    let prices = load_sell_prices();
    let rarities = load_rarities();

    let raw = match source.as_str() {
        "coffre" | "chest" => load_chest_items(),
        "inventaire" | "inventory" => load_inventory_items(),
        "all" => {
            let mut all = load_chest_items();
            all.extend(load_inventory_items());
            all
        }
        _ => load_chest_items(),
    };

    let src_label = match source.as_str() {
        "inventaire" | "inventory" => "inventaire",
        "all" => "all",
        _ => "coffre",
    };

    let mut items = build_patrimoine_items(&raw, src_label, &prices, &rarities);

    match sort.as_str() {
        "value_desc"  => items.sort_by_key(|i| std::cmp::Reverse(i.total_value)),
        "value_asc"   => items.sort_by_key(|i| i.total_value),
        "price_desc"  => items.sort_by_key(|i| std::cmp::Reverse(i.unit_price)),
        "price_asc"   => items.sort_by_key(|i| i.unit_price),
        "name_asc"    => items.sort_by(|a, b| a.name.to_lowercase().cmp(&b.name.to_lowercase())),
        "qty_desc"    => items.sort_by_key(|i| std::cmp::Reverse(i.quantity)),
        "rarity_desc" => items.sort_by_key(|i| std::cmp::Reverse(i.rarity)),
        _             => items.sort_by_key(|i| std::cmp::Reverse(i.total_value)),
    }

    let total_value: i64 = items.iter().map(|i| i.total_value).sum();
    let total = items.len() as u32;
    let offset = (page * per_page) as usize;
    let paged: Vec<PatrimoineItem> = items.into_iter().skip(offset).take(per_page as usize).collect();

    Ok(PatrimoineListResult {
        items: paged,
        total,
        page,
        per_page,
        total_value,
    })
}
