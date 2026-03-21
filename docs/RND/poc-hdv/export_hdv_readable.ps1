param(
    [string]$DbPath = "logs/hdv_market.db",
    [string]$OutDir = "logs",
    [int]$CsvLimit = 5000,
    [int]$MdLimit = 300,
    [string]$NameCachePath = "logs/item_name_cache.json",
    [switch]$ResolveItemNames
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
$namedCsvPath = Join-Path $OutDir "market_latest_named_preview.csv"

$selectSql = "SELECT updated_at, source_ts, side, item_ref_id, offer_uid, actor_name, unit_price, quantity FROM market_latest ORDER BY updated_at DESC"

sqlite3 $DbPath -cmd ".headers on" -cmd ".mode csv" "$selectSql LIMIT $CsvLimit;" > $csvPath
sqlite3 $DbPath -cmd ".headers on" -cmd ".mode markdown" "$selectSql LIMIT $MdLimit;" > $mdPath

function Get-ItemNameMap {
    param([string]$LocalCachePath)

    $itemMap = @{}

    if (Test-Path -LiteralPath $LocalCachePath) {
        try {
            $cache = Get-Content -LiteralPath $LocalCachePath -Raw | ConvertFrom-Json
            foreach ($p in $cache.PSObject.Properties) {
                $itemMap[[string]$p.Name] = [string]$p.Value
            }
        } catch {
            Write-Host "Cache noms invalide, reconstruction..." -ForegroundColor DarkYellow
        }
    }

    try {
        $config = Invoke-RestMethod -Uri "https://wakfu.cdn.ankama.com/gamedata/config.json" -TimeoutSec 15
        $version = $config.version

        $itemsJson = Invoke-RestMethod -Uri "https://wakfu.cdn.ankama.com/gamedata/$version/items.json" -TimeoutSec 30

        foreach ($item in $itemsJson) {
            $id = $null
            $name = $null
            if ($item.definition -and $item.definition.item) { $id = $item.definition.item.id }
            if ($item.title) {
                if ($item.title.fr) { $name = $item.title.fr }
                elseif ($item.title.en) { $name = $item.title.en }
            }
            if ($id -and $name) {
                $itemMap[[string]$id] = $name
            }
        }

        ($itemMap | ConvertTo-Json -Depth 3) | Out-File -FilePath $LocalCachePath -Encoding UTF8
    } catch {
        Write-Host "Impossible de rafraichir les noms via CDN Ankama (offline ou timeout)." -ForegroundColor DarkYellow
        if ($itemMap.Count -eq 0) {
            Write-Host "Aucun cache local disponible pour les noms d'objets." -ForegroundColor DarkYellow
        }
    }

    return $itemMap
}

if ($ResolveItemNames) {
    $itemNameMap = Get-ItemNameMap -LocalCachePath $NameCachePath

    $rows = Import-Csv -LiteralPath $csvPath
    $rowsWithNames = foreach ($row in $rows) {
        $itemRef = [string]$row.item_ref_id
        $itemName = if ($itemNameMap.ContainsKey($itemRef)) { $itemNameMap[$itemRef] } else { "refId=$itemRef" }

        [pscustomobject]@{
            updated_at = $row.updated_at
            source_ts = $row.source_ts
            side = $row.side
            item_ref_id = $row.item_ref_id
            item_name = $itemName
            offer_uid = $row.offer_uid
            actor_name = $row.actor_name
            unit_price = $row.unit_price
            quantity = $row.quantity
        }
    }

    $rowsWithNames | Export-Csv -Path $namedCsvPath -NoTypeInformation -Encoding UTF8
}

Write-Host "Export termine"
Write-Host "- CSV: $csvPath"
Write-Host "- MD : $mdPath"
if ($ResolveItemNames) {
    Write-Host "- CSV noms objets: $namedCsvPath"
}