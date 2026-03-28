// hdv_commands.rs — Interface marché HDV (craft_economy.db + hdv_market.db)

use rusqlite::Connection;
use serde::Serialize;
use tracing::debug;

use crate::utils::paths;

// ── Structs retournées au frontend ──────────────────────────────────────────

#[derive(Serialize)]
pub struct HdvStats {
    pub total_items: u32,
    pub total_sell_offers: u32,
    pub total_buy_offers: u32,
    pub last_scan: Option<String>,
    pub server_id: String,
}

#[derive(Serialize)]
pub struct MarketPriceRow {
    pub item_ref_id: i64,
    pub name_fr: String,
    pub level: i32,
    pub rarity: i32,
    pub rarity_name: String,
    pub min_price: i64,
    pub avg_price: f64,
    pub max_price: i64,
    pub total_offers: i32,
    pub total_qty: i32,
    pub last_seen: String,
    pub side: String,
    pub server_id: String,
}

#[derive(Serialize)]
pub struct MarketPriceResult {
    pub rows: Vec<MarketPriceRow>,
    pub total: u32,
    pub page: u32,
    pub per_page: u32,
}

#[derive(Serialize)]
pub struct MarketOffer {
    pub offer_uid: i64,
    pub actor_name: String,
    pub unit_price: i64,
    pub qty_remaining: i32,
    pub updated_at: String,
    pub side: String,
    pub slot_colors: String,
}

// ── Helpers ─────────────────────────────────────────────────────────────────

fn open_craft_db() -> Result<Connection, String> {
    let path = paths::hdv_craft_db_path();
    if !path.exists() {
        return Err(format!(
            "craft_economy.db introuvable à : {}. Lance un scan HDV d'abord.",
            path.display()
        ));
    }
    Connection::open(&path).map_err(|e| format!("Erreur ouverture craft_economy.db: {}", e))
}

fn open_market_db() -> Result<Connection, String> {
    let path = paths::hdv_market_db_path();
    if !path.exists() {
        return Err(format!(
            "hdv_market.db introuvable à : {}. Lance un scan HDV d'abord.",
            path.display()
        ));
    }
    Connection::open(&path).map_err(|e| format!("Erreur ouverture hdv_market.db: {}", e))
}

// ── Commandes Tauri ──────────────────────────────────────────────────────────

/// Statistiques globales du dernier scan HDV
#[tauri::command]
pub fn get_hdv_stats() -> Result<HdvStats, String> {
    debug!("[HdvCommands] get_hdv_stats");
    let db = open_craft_db()?;

    let total_items: u32 = db
        .query_row("SELECT COUNT(DISTINCT item_ref_id) FROM market_prices", [], |r| r.get(0))
        .map_err(|e| format!("Erreur count: {}", e))?;

    let total_sell: u32 = db
        .query_row(
            "SELECT COUNT(DISTINCT item_ref_id) FROM market_prices WHERE side='sell'",
            [],
            |r| r.get(0),
        )
        .unwrap_or(0);

    let total_buy: u32 = db
        .query_row(
            "SELECT COUNT(DISTINCT item_ref_id) FROM market_prices WHERE side='buy'",
            [],
            |r| r.get(0),
        )
        .unwrap_or(0);

    let last_scan: Option<String> = db
        .query_row(
            "SELECT MAX(last_seen) FROM market_prices",
            [],
            |r| r.get(0),
        )
        .ok()
        .flatten();

    let server_id: String = db
        .query_row(
            "SELECT server_id FROM market_prices LIMIT 1",
            [],
            |r| r.get(0),
        )
        .unwrap_or_else(|_| "ogrest".to_string());

    Ok(HdvStats {
        total_items,
        total_sell_offers: total_sell,
        total_buy_offers: total_buy,
        last_scan,
        server_id,
    })
}

/// Recherche paginée dans les prix du marché
/// - query : filtre sur le nom (vide = tout)
/// - side  : "sell" | "buy" | "both"
/// - sort  : "price_asc" | "price_desc" | "name_asc"
#[tauri::command]
pub fn search_hdv_prices(
    query: String,
    side: String,
    sort: String,
    page: u32,
    per_page: u32,
) -> Result<MarketPriceResult, String> {
    debug!(
        query = %query, side = %side, sort = %sort, page, per_page,
        "[HdvCommands] search_hdv_prices"
    );

    let db = open_craft_db()?;

    let side_filter = match side.as_str() {
        "sell" => "AND mp.side = 'sell'",
        "buy"  => "AND mp.side = 'buy'",
        _      => "",
    };

    let order_clause = match sort.as_str() {
        "price_asc"  => "mp.min_price ASC",
        "price_desc" => "mp.min_price DESC",
        "name_asc"   => "i.name_fr ASC",
        _            => "mp.min_price ASC",
    };

    let search_pat = format!("%{}%", query.to_lowercase());
    let offset = page * per_page;

    // Total count
    let count_sql = format!(
        "SELECT COUNT(*) FROM market_prices mp
         LEFT JOIN items i ON i.id = mp.item_ref_id
         WHERE (? = '' OR LOWER(COALESCE(i.name_fr,'')) LIKE ?)
         {}",
        side_filter
    );
    let total: u32 = db
        .query_row(&count_sql, [&query, &search_pat], |r| r.get(0))
        .map_err(|e| format!("Erreur count: {}", e))?;

    // Data rows
    let data_sql = format!(
        "SELECT mp.item_ref_id,
                COALESCE(i.name_fr, CAST(mp.item_ref_id AS TEXT)) as name_fr,
                COALESCE(i.level, 0),
                COALESCE(i.rarity, 0),
                COALESCE(i.rarity_name, 'Commun'),
                mp.min_price,
                mp.avg_price,
                mp.max_price,
                mp.total_offers,
                mp.total_qty,
                mp.last_seen,
                mp.side,
                mp.server_id
         FROM market_prices mp
         LEFT JOIN items i ON i.id = mp.item_ref_id
         WHERE (? = '' OR LOWER(COALESCE(i.name_fr,'')) LIKE ?)
         {}
         ORDER BY {}
         LIMIT ? OFFSET ?",
        side_filter, order_clause
    );

    let mut stmt = db
        .prepare(&data_sql)
        .map_err(|e| format!("Erreur prepare: {}", e))?;

    let rows = stmt
        .query_map(
            rusqlite::params![query, search_pat, per_page, offset],
            |row| {
                Ok(MarketPriceRow {
                    item_ref_id: row.get(0)?,
                    name_fr: row.get(1)?,
                    level: row.get(2)?,
                    rarity: row.get(3)?,
                    rarity_name: row.get(4)?,
                    min_price: row.get(5)?,
                    avg_price: row.get(6)?,
                    max_price: row.get(7)?,
                    total_offers: row.get(8)?,
                    total_qty: row.get(9)?,
                    last_seen: row.get(10)?,
                    side: row.get(11)?,
                    server_id: row.get(12)?,
                })
            },
        )
        .map_err(|e| format!("Erreur query: {}", e))?;

    let mut result = Vec::new();
    for row in rows {
        result.push(row.map_err(|e| format!("Erreur row: {}", e))?);
    }

    Ok(MarketPriceResult {
        rows: result,
        total,
        page,
        per_page,
    })
}

/// Récupère les offres individuelles d'un item depuis hdv_market.db
#[tauri::command]
pub fn get_item_offers(item_ref_id: i64, side: String) -> Result<Vec<MarketOffer>, String> {
    debug!(item_ref_id, side = %side, "[HdvCommands] get_item_offers");
    let db = open_market_db()?;

    let mut stmt = db
        .prepare(
            "SELECT offer_uid, actor_name, unit_price, qty_remaining, updated_at, side,
                    COALESCE(slot_colors, '')
             FROM market_latest
             WHERE item_ref_id = ? AND side = ?
             ORDER BY unit_price ASC
             LIMIT 50",
        )
        .map_err(|e| format!("Erreur prepare: {}", e))?;

    let rows = stmt
        .query_map(rusqlite::params![item_ref_id, side], |row| {
            Ok(MarketOffer {
                offer_uid: row.get(0)?,
                actor_name: row.get(1)?,
                unit_price: row.get(2)?,
                qty_remaining: row.get(3)?,
                updated_at: row.get(4)?,
                side: row.get(5)?,
                slot_colors: row.get(6)?,
            })
        })
        .map_err(|e| format!("Erreur query: {}", e))?;

    let mut result = Vec::new();
    for row in rows {
        result.push(row.map_err(|e| format!("Erreur row: {}", e))?);
    }
    Ok(result)
}
