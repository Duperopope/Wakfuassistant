param(
    [string]$DbPath = "logs/hdv_market.db",
    [string]$OutCsvPath = "logs/top10_buy_over_sell_resources.csv",
    [string]$MetaCachePath = "logs/item_meta_cache.json",
    [int]$Top = 10,
    [int]$PreLimit = 3000
)

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

if (-not (Get-Command sqlite3 -ErrorAction SilentlyContinue)) {
    throw "sqlite3 n'est pas disponible dans le PATH."
}

if (-not (Test-Path -LiteralPath $DbPath)) {
    throw "Base SQLite introuvable: $DbPath"
}

function Get-ResourceTypeCatalog {
    $cfg = Invoke-RestMethod -Uri "https://wakfu.cdn.ankama.com/gamedata/config.json" -TimeoutSec 20
    $version = $cfg.version
    $itemTypes = Invoke-RestMethod -Uri "https://wakfu.cdn.ankama.com/gamedata/$version/itemTypes.json" -TimeoutSec 40

    $typeMap = @{}
    $resourceTypeIds = New-Object System.Collections.Generic.HashSet[int]

    foreach ($t in $itemTypes) {
        if ($t.PSObject.Properties.Match('definition').Count -eq 0) { continue }
        if ($t.definition.PSObject.Properties.Match('id').Count -eq 0) { continue }

        $typeId = [int]$t.definition.id
        $fr = ""
        $en = ""
        if ($t.PSObject.Properties.Match('title').Count -gt 0 -and $null -ne $t.title) {
            if ($t.title.PSObject.Properties.Match('fr').Count -gt 0 -and $null -ne $t.title.fr -and $t.title.fr -ne "") { $fr = [string]$t.title.fr }
            if ($t.title.PSObject.Properties.Match('en').Count -gt 0 -and $null -ne $t.title.en -and $t.title.en -ne "") { $en = [string]$t.title.en }
        }

        $typeMap[$typeId] = [pscustomobject]@{
            id = $typeId
            fr = $fr
            en = $en
        }

        $isResourceType = $false
        if ($fr -match "Ressource|Recolte|Re\u0301colte|Raffinage|Mineur|Forestier|Pecheur|Paysan|Herboriste|Trappeur") { $isResourceType = $true }
        if ($en -match "Resource|Harvest|Refinement|Miner|Lumberjack|Fisherman|Farmer|Herbalist|Trapper") { $isResourceType = $true }

        if ($isResourceType) {
            [void]$resourceTypeIds.Add($typeId)
        }
    }

    return [pscustomobject]@{
        version = $version
        typeMap = $typeMap
        resourceTypeIds = $resourceTypeIds
    }
}

function Get-ItemMetaMap {
    param(
        [string]$CachePath,
        [hashtable]$TypeMap
    )

    $itemMetaMap = @{}

    if (Test-Path -LiteralPath $CachePath) {
        try {
            $cached = Get-Content -LiteralPath $CachePath -Raw | ConvertFrom-Json
            foreach ($p in $cached.PSObject.Properties) {
                $itemMetaMap[[string]$p.Name] = [pscustomobject]$p.Value
            }
            return $itemMetaMap
        } catch {
            Write-Host "Cache meta invalide, reconstruction..." -ForegroundColor DarkYellow
        }
    }

    $cfg = Invoke-RestMethod -Uri "https://wakfu.cdn.ankama.com/gamedata/config.json" -TimeoutSec 20
    $version = $cfg.version
    $items = Invoke-RestMethod -Uri "https://wakfu.cdn.ankama.com/gamedata/$version/items.json" -TimeoutSec 80

    foreach ($item in $items) {
        $itemId = $null
        $name = $null
        $typeId = $null
        $level = $null

        if ($item.PSObject.Properties.Match('definition').Count -gt 0 -and $item.definition.PSObject.Properties.Match('item').Count -gt 0) {
            $itemId = $item.definition.item.id
            if ($item.definition.item.PSObject.Properties.Match('level').Count -gt 0) {
                $level = [int]$item.definition.item.level
            }
            if ($item.definition.item.PSObject.Properties.Match('baseParameters').Count -gt 0) {
                $typeId = $item.definition.item.baseParameters.itemTypeId
            }
        }

        if ($item.PSObject.Properties.Match('title').Count -gt 0 -and $null -ne $item.title) {
            if ($item.title.PSObject.Properties.Match('fr').Count -gt 0 -and $null -ne $item.title.fr -and $item.title.fr -ne "") { $name = [string]$item.title.fr }
            elseif ($item.title.PSObject.Properties.Match('en').Count -gt 0 -and $null -ne $item.title.en -and $item.title.en -ne "") { $name = [string]$item.title.en }
        }

        if ($itemId -and $typeId) {
            $frType = $null
            $enType = $null
            if ($TypeMap.ContainsKey([int]$typeId)) {
                $frType = $TypeMap[[int]$typeId].fr
                $enType = $TypeMap[[int]$typeId].en
            }

            $itemMetaMap[[string]$itemId] = [pscustomobject]@{
                item_id = [int]$itemId
                item_name = $(if ($name) { $name } else { "refId=$itemId" })
                item_level = $(if ($null -ne $level) { [int]$level } else { 0 })
                item_type_id = [int]$typeId
                item_type_fr = $frType
                item_type_en = $enType
            }
        }
    }

    ($itemMetaMap | ConvertTo-Json -Depth 5) | Out-File -FilePath $CachePath -Encoding UTF8
    return $itemMetaMap
}

$catalog = Get-ResourceTypeCatalog
$itemMeta = Get-ItemMetaMap -CachePath $MetaCachePath -TypeMap $catalog.typeMap

$sql = @"
WITH sell_best AS (
  SELECT item_ref_id, unit_price AS cheapest_sell, actor_name AS seller_name, quantity AS sell_qty, offer_uid AS sell_offer_uid,
         ROW_NUMBER() OVER (PARTITION BY item_ref_id ORDER BY unit_price ASC, offer_uid ASC) AS rn
  FROM market_latest
  WHERE side='sell'
),
buy_best AS (
  SELECT item_ref_id, unit_price AS highest_buy, actor_name AS buyer_name, quantity AS buy_qty, offer_uid AS buy_offer_uid,
         ROW_NUMBER() OVER (PARTITION BY item_ref_id ORDER BY unit_price DESC, offer_uid ASC) AS rn
  FROM market_latest
  WHERE side='buy'
)
SELECT b.item_ref_id,
       b.highest_buy,
       s.cheapest_sell,
       (b.highest_buy - s.cheapest_sell) AS delta,
       ROUND((CAST(b.highest_buy - s.cheapest_sell AS REAL) / s.cheapest_sell) * 100.0, 2) AS margin_pct,
       b.buyer_name,
       b.buy_qty,
       b.buy_offer_uid,
       s.seller_name,
       s.sell_qty,
       s.sell_offer_uid
FROM buy_best b
JOIN sell_best s ON s.item_ref_id = b.item_ref_id
WHERE b.rn = 1
  AND s.rn = 1
  AND b.highest_buy > s.cheapest_sell
ORDER BY delta DESC
LIMIT $PreLimit;
"@

$rows = (sqlite3 $DbPath -cmd ".headers on" -cmd ".mode csv" "$sql") | ConvertFrom-Csv

$filtered = foreach ($r in $rows) {
    $itemIdStr = [string]$r.item_ref_id
    if (-not $itemMeta.ContainsKey($itemIdStr)) { continue }

    $meta = $itemMeta[$itemIdStr]
    $typeId = [int]$meta.item_type_id
    if (-not $catalog.resourceTypeIds.Contains($typeId)) { continue }

    [pscustomobject]@{
        item_ref_id = $r.item_ref_id
        item_name = $meta.item_name
        item_level = $meta.item_level
        item_type_id = $meta.item_type_id
        item_type_fr = $meta.item_type_fr
        highest_buy = $r.highest_buy
        cheapest_sell = $r.cheapest_sell
        delta = $r.delta
        margin_pct = $r.margin_pct
        buyer_name = $r.buyer_name
        buy_qty = $r.buy_qty
        buy_offer_uid = $r.buy_offer_uid
        seller_name = $r.seller_name
        sell_qty = $r.sell_qty
        sell_offer_uid = $r.sell_offer_uid
    }
}

$topRows = $filtered | Sort-Object {[int64]$_.delta} -Descending | Select-Object -First $Top

$outDir = Split-Path -Parent $OutCsvPath
if ($outDir -and -not (Test-Path -LiteralPath $outDir)) {
    New-Item -ItemType Directory -Path $outDir | Out-Null
}

$topRows | Export-Csv -Path $OutCsvPath -NoTypeInformation -Encoding UTF8

Write-Host "Top ressources exporte: $OutCsvPath" -ForegroundColor Green
Write-Host "Lignes: $(@($topRows).Count)" -ForegroundColor Cyan

$topRows |
    Select-Object item_ref_id,item_name,item_level,item_type_fr,highest_buy,cheapest_sell,delta,margin_pct |
    Format-Table -AutoSize