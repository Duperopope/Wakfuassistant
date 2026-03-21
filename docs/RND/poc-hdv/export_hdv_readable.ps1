param(
    [string]$DbPath = "logs/hdv_market.db",
    [string]$OutDir = "logs",
    [int]$CsvLimit = 5000,
    [int]$MdLimit = 300
)

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

if (-not (Get-Command sqlite3 -ErrorAction SilentlyContinue)) {
    throw "sqlite3 n'est pas disponible dans le PATH."
}

if (-not (Test-Path -LiteralPath $DbPath)) {
    throw "Base SQLite introuvable: $DbPath"
}

if (-not (Test-Path -LiteralPath $OutDir)) {
    New-Item -ItemType Directory -Path $OutDir | Out-Null
}

$csvPath = Join-Path $OutDir "market_latest_preview.csv"
$mdPath = Join-Path $OutDir "market_latest_preview.md"

$selectSql = "SELECT updated_at, source_ts, side, item_ref_id, offer_uid, actor_name, unit_price, quantity FROM market_latest ORDER BY updated_at DESC"

sqlite3 $DbPath -cmd ".headers on" -cmd ".mode csv" "$selectSql LIMIT $CsvLimit;" > $csvPath
sqlite3 $DbPath -cmd ".headers on" -cmd ".mode markdown" "$selectSql LIMIT $MdLimit;" > $mdPath

Write-Host "Export termine"
Write-Host "- CSV: $csvPath"
Write-Host "- MD : $mdPath"