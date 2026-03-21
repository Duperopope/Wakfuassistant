# read_overlay_db.ps1
# Lit la base SQLite de l'overlay Tauri (wakfu_overlay.db) et affiche son contenu.
# Usage : .\read_overlay_db.ps1
# Prerequis : sqlite3.exe dans le PATH

[Console]::OutputEncoding = [System.Text.Encoding]::UTF8
$OutputEncoding = [System.Text.Encoding]::UTF8

# ---------------------------------------------------------------------------
# 1. Localisation de la base de donnees
# ---------------------------------------------------------------------------
$DB_PATHS = @(
    "$env:APPDATA\com.wakfu-overlay.v2\wakfu_overlay.db",
    "$env:USERPROFILE\.wakfu-overlay\wakfu_overlay.db"
)

$DB = $null
foreach ($p in $DB_PATHS) {
    if (Test-Path $p) {
        $DB = $p
        break
    }
}

if (-not $DB) {
    Write-Host "ERREUR : base de donnees introuvable. Chemins testes :"
    foreach ($p in $DB_PATHS) {
        Write-Host "  - $p"
    }
    exit 1
}

Write-Host "Base de donnees : $DB"
Write-Host ""

# ---------------------------------------------------------------------------
# 2. Verification sqlite3
# ---------------------------------------------------------------------------
if (-not (Get-Command sqlite3 -ErrorAction SilentlyContinue)) {
    Write-Host "ERREUR : sqlite3 introuvable dans le PATH."
    Write-Host "Installez sqlite3 et assurez-vous qu'il est dans le PATH."
    exit 1
}

# Fonction utilitaire : execute une requete et retourne les lignes
function Invoke-Sqlite {
    param([string]$Query)
    $result = & sqlite3 $DB $Query 2>&1
    return $result
}

# ---------------------------------------------------------------------------
# Section A — SESSIONS DE JEU
# ---------------------------------------------------------------------------
Write-Host "===== SESSIONS DE JEU ====="
$count_sessions = Invoke-Sqlite "SELECT COUNT(*) FROM game_sessions;"
Write-Host "Total sessions : $count_sessions"

if ([int]$count_sessions -eq 0) {
    Write-Host "Aucune session enregistree."
} else {
    Write-Host ""
    Write-Host "10 dernieres sessions (started_at DESC) :"
    Write-Host "id | character_name | server_name | started_at | ended_at | kamas_gained | kamas_spent | xp_gained | combats | victories"
    Write-Host ("-" * 120)
    $rows = Invoke-Sqlite @"
SELECT id, character_name, server_name, started_at, ended_at,
       total_kamas_gained, total_kamas_spent, total_xp_gained,
       total_combats, total_victories
FROM game_sessions
ORDER BY started_at DESC
LIMIT 10;
"@
    if ($rows) {
        $rows | ForEach-Object { Write-Host $_ }
    }
}

Write-Host ""

# ---------------------------------------------------------------------------
# Section B — CACHE ITEMS CDN
# ---------------------------------------------------------------------------
Write-Host "===== CACHE ITEMS CDN ====="
$count_items = Invoke-Sqlite "SELECT COUNT(*) FROM items_cache;"
Write-Host "Total items en cache : $count_items"

if ([int]$count_items -eq 0) {
    Write-Host "Cache items vide."
} else {
    Write-Host ""
    Write-Host "5 exemples (id DESC) :"
    Write-Host "id | name_fr | name_en | level | item_type_id | rarity"
    Write-Host ("-" * 80)
    $rows = Invoke-Sqlite @"
SELECT id, name_fr, name_en, level, item_type_id, rarity
FROM items_cache
ORDER BY id DESC
LIMIT 5;
"@
    if ($rows) {
        $rows | ForEach-Object { Write-Host $_ }
    }
}

Write-Host ""

# ---------------------------------------------------------------------------
# Section C — CACHE RECETTES CDN
# ---------------------------------------------------------------------------
Write-Host "===== CACHE RECETTES CDN ====="

# Verifier si la table existe (migration 003)
$table_exists = Invoke-Sqlite "SELECT COUNT(*) FROM sqlite_master WHERE type='table' AND name='recipes_cache';"
if ([int]$table_exists -eq 0) {
    Write-Host "Table recipes_cache non creee (migration 003 non appliquee)."
} else {
    $count_recipes = Invoke-Sqlite "SELECT COUNT(*) FROM recipes_cache;"
    Write-Host "Total recettes en cache : $count_recipes"

    if ([int]$count_recipes -eq 0) {
        Write-Host "Cache recettes vide."
    } else {
        Write-Host ""
        Write-Host "5 exemples avec resultat (via recipe_results_cache + items_cache) :"
        Write-Host "recipe_id | level | category | xp_ratio | result_item_id | result_name_fr | result_qty"
        Write-Host ("-" * 100)
        $rows = Invoke-Sqlite @"
SELECT r.recipe_id, r.level, r.category, r.xp_ratio,
       rr.item_id AS result_item_id,
       COALESCE(ic.name_fr, '') AS result_name_fr,
       rr.quantity AS result_qty
FROM recipes_cache r
LEFT JOIN recipe_results_cache rr ON rr.recipe_id = r.recipe_id
LEFT JOIN items_cache ic ON ic.id = rr.item_id
ORDER BY r.recipe_id DESC
LIMIT 5;
"@
        if ($rows) {
            $rows | ForEach-Object { Write-Host $_ }
        }
    }
}

Write-Host ""

# ---------------------------------------------------------------------------
# Section D — EVENEMENTS RECENTS
# ---------------------------------------------------------------------------
Write-Host "===== EVENEMENTS RECENTS ====="
$count_events = Invoke-Sqlite "SELECT COUNT(*) FROM game_events;"
Write-Host "Total evenements : $count_events"

if ([int]$count_events -eq 0) {
    Write-Host "Aucun evenement enregistre."
} else {
    Write-Host ""
    Write-Host "10 derniers evenements (id DESC) :"
    Write-Host "id | session_id | timestamp | event_type | log_source | synced"
    Write-Host ("-" * 100)
    $rows = Invoke-Sqlite @"
SELECT id, session_id, timestamp, event_type, log_source, synced
FROM game_events
ORDER BY id DESC
LIMIT 10;
"@
    if ($rows) {
        $rows | ForEach-Object { Write-Host $_ }
    }
}

Write-Host ""

# ---------------------------------------------------------------------------
# Section E — SNAPSHOTS ECONOMIE
# ---------------------------------------------------------------------------
Write-Host "===== SNAPSHOTS ECONOMIE ====="
$count_snaps = Invoke-Sqlite "SELECT COUNT(*) FROM economy_snapshots;"
Write-Host "Total snapshots : $count_snaps"

if ([int]$count_snaps -eq 0) {
    Write-Host "Aucun snapshot economique."
} else {
    Write-Host ""
    Write-Host "10 derniers snapshots (id DESC) :"
    Write-Host "id | session_id | timestamp | kamas_balance | delta | source"
    Write-Host ("-" * 90)
    $rows = Invoke-Sqlite @"
SELECT id, session_id, timestamp, kamas_balance, delta, source
FROM economy_snapshots
ORDER BY id DESC
LIMIT 10;
"@
    if ($rows) {
        $rows | ForEach-Object { Write-Host $_ }
    }
}

Write-Host ""

# ---------------------------------------------------------------------------
# Section F — METADATA CDN
# ---------------------------------------------------------------------------
Write-Host "===== METADATA CDN ====="
$rows = Invoke-Sqlite @"
SELECT key, value, updated_at
FROM cdn_metadata
ORDER BY key;
"@
if (-not $rows) {
    Write-Host "(aucune entree cdn_metadata)"
} else {
    Write-Host "key | value | updated_at"
    Write-Host ("-" * 80)
    $rows | ForEach-Object { Write-Host $_ }
}

Write-Host ""
Write-Host "===== FIN DU RAPPORT ====="
