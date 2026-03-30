// hdv_commands.rs — Commandes marché HDV v2
// Lit directement hdv_market.db (market_latest) + items_cache (wakfu_overlay.db)

use rusqlite::{Connection, params};
use serde::Serialize;
use tracing::{debug, info};

use crate::utils::paths;

// ── Structs ─────────────────────────────────────────────────────────────────

#[derive(Serialize, Clone, Debug)]
pub struct HdvStats {
    pub total_sell_items: u32,
    pub total_buy_items: u32,
    pub total_sell_offers: u32,
    pub total_buy_offers: u32,
    pub last_updated: Option<String>,
    pub price_range_min: i64,
    pub price_range_max: i64,
}

#[derive(Serialize, Clone, Debug)]
pub struct MarketItemRow {
    pub item_ref_id: i64,
    pub name_fr: String,
    pub level: i32,
    pub rarity: i32,
    pub min_price: i64,
    pub avg_price: f64,
    pub max_price: i64,
    pub offer_count: i32,
    pub total_qty: i32,
    pub side: String,
}

#[derive(Serialize, Clone, Debug)]
pub struct MarketSearchResult {
    pub rows: Vec<MarketItemRow>,
    pub total: u32,
    pub page: u32,
    pub per_page: u32,
}

#[derive(Serialize, Clone, Debug)]
pub struct MarketOffer {
    pub offer_uid: i64,
    pub actor_name: String,
    pub actor_level: i32,
    pub unit_price: i64,
    pub qty_init: i32,
    pub qty_remaining: i32,
    pub sell_duration: i32,
    pub expiration_date: String,
    pub updated_at: String,
    pub side: String,
    pub slot_colors: String,
    pub sublimation_id: i32,
}

#[derive(Serialize, Clone, Debug)]
pub struct ItemDetail {
    pub item_ref_id: i64,
    pub name_fr: String,
    pub level: i32,
    pub rarity: i32,
    pub sell_offers: Vec<MarketOffer>,
    pub buy_offers: Vec<MarketOffer>,
    pub sell_min: Option<i64>,
    pub sell_avg: Option<f64>,
    pub buy_max: Option<i64>,
}

// ── Helpers ─────────────────────────────────────────────────────────────────

fn open_market_db() -> Result<Connection, String> {
    let path = paths::hdv_market_db_path();
    if !path.exists() {
        return Err(format!(
            "hdv_market.db introuvable ({}). Lance un scan HDV d'abord.",
            path.display()
        ));
    }
    Connection::open(&path).map_err(|e| format!("Erreur ouverture hdv_market.db: {}", e))
}

fn open_overlay_db() -> Result<Connection, String> {
    let path = paths::database_path();
    Connection::open(&path).map_err(|e| format!("Erreur ouverture wakfu_overlay.db: {}", e))
}

/// Construit un hashmap item_ref_id → (name_fr, level, rarity) depuis items_cache
fn load_item_names() -> Result<std::collections::HashMap<i64, (String, i32, i32)>, String> {
    let db = open_overlay_db()?;
    let mut stmt = db
        .prepare("SELECT id, name_fr, level, rarity FROM items_cache")
        .map_err(|e| format!("Erreur prepare items_cache: {}", e))?;
    let mut map = std::collections::HashMap::new();
    let rows = stmt
        .query_map([], |row| {
            Ok((
                row.get::<_, i64>(0)?,
                row.get::<_, String>(1)?,
                row.get::<_, i32>(2)?,
                row.get::<_, i32>(3)?,
            ))
        })
        .map_err(|e| format!("Erreur query items_cache: {}", e))?;
    for row in rows {
        if let Ok((id, name, level, rarity)) = row {
            map.insert(id, (name, level, rarity));
        }
    }
    Ok(map)
}

// ── Commandes Tauri ─────────────────────────────────────────────────────────

#[tauri::command]
pub fn get_hdv_stats() -> Result<HdvStats, String> {
    debug!("[HDV] get_hdv_stats");
    let db = open_market_db()?;

    let total_sell_items: u32 = db
        .query_row(
            "SELECT COUNT(DISTINCT item_ref_id) FROM market_latest WHERE side='sell'",
            [], |r| r.get(0),
        ).unwrap_or(0);

    let total_buy_items: u32 = db
        .query_row(
            "SELECT COUNT(DISTINCT item_ref_id) FROM market_latest WHERE side='buy'",
            [], |r| r.get(0),
        ).unwrap_or(0);

    let total_sell_offers: u32 = db
        .query_row(
            "SELECT COUNT(*) FROM market_latest WHERE side='sell'",
            [], |r| r.get(0),
        ).unwrap_or(0);

    let total_buy_offers: u32 = db
        .query_row(
            "SELECT COUNT(*) FROM market_latest WHERE side='buy'",
            [], |r| r.get(0),
        ).unwrap_or(0);

    let last_updated: Option<String> = db
        .query_row("SELECT MAX(updated_at) FROM market_latest", [], |r| r.get(0))
        .ok().flatten();

    let price_range_min: i64 = db
        .query_row(
            "SELECT MIN(unit_price) FROM market_latest WHERE unit_price > 0",
            [], |r| r.get(0),
        ).unwrap_or(0);

    let price_range_max: i64 = db
        .query_row(
            "SELECT MAX(unit_price) FROM market_latest",
            [], |r| r.get(0),
        ).unwrap_or(0);

    info!(sell = total_sell_offers, buy = total_buy_offers, "[HDV] stats loaded");

    Ok(HdvStats {
        total_sell_items,
        total_buy_items,
        total_sell_offers,
        total_buy_offers,
        last_updated,
        price_range_min,
        price_range_max,
    })
}

#[tauri::command]
pub fn search_hdv_items(
    query: String,
    side: String,
    sort: String,
    page: u32,
    per_page: u32,
) -> Result<MarketSearchResult, String> {
    debug!(query = %query, side = %side, sort = %sort, "[HDV] search_hdv_items");

    let db = open_market_db()?;
    let names = load_item_names()?;

    let side_filter = match side.as_str() {
        "sell" => "WHERE side = 'sell'",
        "buy"  => "WHERE side = 'buy'",
        _      => "",
    };

    // Agrège par item_ref_id + side
    let sql = format!(
        "SELECT item_ref_id, side,
                MIN(unit_price) as min_price,
                AVG(unit_price) as avg_price,
                MAX(unit_price) as max_price,
                COUNT(*) as offer_count,
                SUM(qty_remaining) as total_qty
         FROM market_latest
         {}
         GROUP BY item_ref_id, side",
        side_filter
    );

    let mut stmt = db.prepare(&sql).map_err(|e| format!("Erreur prepare: {}", e))?;
    let rows = stmt
        .query_map([], |row| {
            Ok((
                row.get::<_, i64>(0)?,
                row.get::<_, String>(1)?,
                row.get::<_, i64>(2)?,
                row.get::<_, f64>(3)?,
                row.get::<_, i64>(4)?,
                row.get::<_, i32>(5)?,
                row.get::<_, i32>(6)?,
            ))
        })
        .map_err(|e| format!("Erreur query: {}", e))?;

    let query_lower = query.to_lowercase();
    let mut all_rows: Vec<MarketItemRow> = Vec::new();

    for row in rows {
        let (item_id, s, min_p, avg_p, max_p, count, qty) =
            row.map_err(|e| format!("Erreur row: {}", e))?;

        let (name, level, rarity) = names
            .get(&item_id)
            .cloned()
            .unwrap_or_else(|| (format!("Item#{}", item_id), 0, 0));

        // Filtre par query
        if !query_lower.is_empty() && !name.to_lowercase().contains(&query_lower) {
            continue;
        }

        all_rows.push(MarketItemRow {
            item_ref_id: item_id,
            name_fr: name,
            level,
            rarity,
            min_price: min_p,
            avg_price: avg_p,
            max_price: max_p,
            offer_count: count,
            total_qty: qty,
            side: s,
        });
    }

    // Tri
    match sort.as_str() {
        "price_asc"   => all_rows.sort_by_key(|r| r.min_price),
        "price_desc"  => all_rows.sort_by_key(|r| std::cmp::Reverse(r.min_price)),
        "name_asc"    => all_rows.sort_by(|a, b| a.name_fr.to_lowercase().cmp(&b.name_fr.to_lowercase())),
        "level_desc"  => all_rows.sort_by_key(|r| std::cmp::Reverse(r.level)),
        "offers_desc" => all_rows.sort_by_key(|r| std::cmp::Reverse(r.offer_count)),
        _             => all_rows.sort_by_key(|r| r.min_price),
    }

    let total = all_rows.len() as u32;
    let offset = (page * per_page) as usize;
    let paged: Vec<MarketItemRow> = all_rows.into_iter().skip(offset).take(per_page as usize).collect();

    Ok(MarketSearchResult {
        rows: paged,
        total,
        page,
        per_page,
    })
}

#[tauri::command]
pub fn get_item_detail(item_ref_id: i64) -> Result<ItemDetail, String> {
    debug!(item_ref_id, "[HDV] get_item_detail");
    let db = open_market_db()?;
    let names = load_item_names()?;

    let (name, level, rarity) = names
        .get(&item_ref_id)
        .cloned()
        .unwrap_or_else(|| (format!("Item#{}", item_ref_id), 0, 0));

    let mut stmt = db
        .prepare(
            "SELECT offer_uid, actor_name, COALESCE(actor_level, 0), unit_price,
                    qty_init, qty_remaining, sell_duration,
                    COALESCE(expiration_date, ''), COALESCE(updated_at, ''),
                    side, COALESCE(slot_colors, ''), COALESCE(sublimation_id, 0)
             FROM market_latest
             WHERE item_ref_id = ?
             ORDER BY side, unit_price ASC",
        )
        .map_err(|e| format!("Erreur prepare: {}", e))?;

    let offers: Vec<MarketOffer> = stmt
        .query_map(params![item_ref_id], |row| {
            Ok(MarketOffer {
                offer_uid: row.get(0)?,
                actor_name: row.get(1)?,
                actor_level: row.get(2)?,
                unit_price: row.get(3)?,
                qty_init: row.get(4)?,
                qty_remaining: row.get(5)?,
                sell_duration: row.get(6)?,
                expiration_date: row.get(7)?,
                updated_at: row.get(8)?,
                side: row.get(9)?,
                slot_colors: row.get(10)?,
                sublimation_id: row.get(11)?,
            })
        })
        .map_err(|e| format!("Erreur query: {}", e))?
        .filter_map(|r| r.ok())
        .collect();

    let sell_offers: Vec<MarketOffer> = offers.iter().filter(|o| o.side == "sell").cloned().collect();
    let buy_offers: Vec<MarketOffer> = offers.iter().filter(|o| o.side == "buy").cloned().collect();

    let sell_min = sell_offers.iter().map(|o| o.unit_price).min();
    let sell_avg = if sell_offers.is_empty() {
        None
    } else {
        Some(sell_offers.iter().map(|o| o.unit_price as f64).sum::<f64>() / sell_offers.len() as f64)
    };
    let buy_max = buy_offers.iter().map(|o| o.unit_price).max();

    Ok(ItemDetail {
        item_ref_id,
        name_fr: name,
        level,
        rarity,
        sell_offers,
        buy_offers,
        sell_min,
        sell_avg,
        buy_max,
    })
}
