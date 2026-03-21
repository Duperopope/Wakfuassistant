param(
    [string]$ProtoLogPath = "H:\Code\Wakfuassistant\logs\market_v3_proto.log",
    [string]$CachePath = "H:\Code\Wakfuassistant\docs\RND\poc-extractioninventairehavresac\output\item_name_cache.json",
    [int]$Top = 30
)

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

function Convert-HexToBytes {
    param([string]$Hex)

    $bytes = New-Object byte[] ($Hex.Length / 2)
    for ($i = 0; $i -lt $bytes.Length; $i++) {
        $bytes[$i] = [Convert]::ToByte($Hex.Substring($i * 2, 2), 16)
    }
    return $bytes
}

function Read-Varint {
    param(
        [byte[]]$Data,
        [ref]$Pos
    )

    [UInt64]$value = 0
    $shift = 0
    while ($Pos.Value -lt $Data.Length) {
        $b = [UInt64]$Data[$Pos.Value]
        $Pos.Value++
        $value = $value -bor (($b -band [UInt64]0x7F) -shl $shift)
        if (($b -band [UInt64]0x80) -eq 0) {
            return $value
        }
        $shift += 7
        if ($shift -gt 63) {
            throw "Varint too long"
        }
    }
    throw "Unexpected EOF while reading varint"
}

function Read-LengthDelimited {
    param(
        [byte[]]$Data,
        [ref]$Pos
    )

    $len = [int](Read-Varint -Data $Data -Pos $Pos)
    if ($len -lt 0 -or ($Pos.Value + $len) -gt $Data.Length) {
        throw "Invalid length-delimited field"
    }

    $slice = New-Object byte[] $len
    [Array]::Copy($Data, $Pos.Value, $slice, 0, $len)
    $Pos.Value += $len
    return $slice
}

function Skip-Field {
    param(
        [byte[]]$Data,
        [int]$WireType,
        [ref]$Pos
    )

    switch ($WireType) {
        0 { [void](Read-Varint -Data $Data -Pos $Pos) }
        1 {
            if (($Pos.Value + 8) -gt $Data.Length) { throw "EOF fixed64" }
            $Pos.Value += 8
        }
        2 { [void](Read-LengthDelimited -Data $Data -Pos $Pos) }
        5 {
            if (($Pos.Value + 4) -gt $Data.Length) { throw "EOF fixed32" }
            $Pos.Value += 4
        }
        default { throw "Unsupported wire type: $WireType" }
    }
}

function Parse-ProtoSellerName {
    param([byte[]]$Bytes)

    $pos = 0
    $name = "?"
    while ($pos -lt $Bytes.Length) {
        $tag = Read-Varint -Data $Bytes -Pos ([ref]$pos)
        $field = [int]($tag -shr 3)
        $wire = [int]($tag -band 7)
        if ($field -eq 2 -and $wire -eq 2) {
            $raw = Read-LengthDelimited -Data $Bytes -Pos ([ref]$pos)
            $decoded = [System.Text.Encoding]::UTF8.GetString($raw)
            if (-not [string]::IsNullOrWhiteSpace($decoded)) {
                $name = $decoded
            }
        } else {
            Skip-Field -Data $Bytes -WireType $wire -Pos ([ref]$pos)
        }
    }
    return $name
}

function Parse-ProtoItemRefId {
    param([byte[]]$Bytes)

    $pos = 0
    $itemRefId = 0
    while ($pos -lt $Bytes.Length) {
        $tag = Read-Varint -Data $Bytes -Pos ([ref]$pos)
        $field = [int]($tag -shr 3)
        $wire = [int]($tag -band 7)

        if ($field -eq 2 -and $wire -eq 0) {
            $itemRefId = [int](Read-Varint -Data $Bytes -Pos ([ref]$pos))
            break
        } else {
            Skip-Field -Data $Bytes -WireType $wire -Pos ([ref]$pos)
        }
    }
    return $itemRefId
}

function Parse-SellEntry {
    param(
        [byte[]]$EntryBytes,
        [string]$Timestamp
    )

    $pos = 0
    $uid = 0L
    $itemRefId = 0
    $seller = "?"
    $unitPrice = 0L
    $quantity = 0L

    while ($pos -lt $EntryBytes.Length) {
        $tag = Read-Varint -Data $EntryBytes -Pos ([ref]$pos)
        $field = [int]($tag -shr 3)
        $wire = [int]($tag -band 7)

        switch ($field) {
            1 {
                if ($wire -eq 0) { $uid = [int64](Read-Varint -Data $EntryBytes -Pos ([ref]$pos)) }
                else { Skip-Field -Data $EntryBytes -WireType $wire -Pos ([ref]$pos) }
            }
            2 {
                if ($wire -eq 2) {
                    $itemBytes = Read-LengthDelimited -Data $EntryBytes -Pos ([ref]$pos)
                    $itemRefId = Parse-ProtoItemRefId -Bytes $itemBytes
                } else {
                    Skip-Field -Data $EntryBytes -WireType $wire -Pos ([ref]$pos)
                }
            }
            3 {
                if ($wire -eq 2) {
                    $sellerBytes = Read-LengthDelimited -Data $EntryBytes -Pos ([ref]$pos)
                    $seller = Parse-ProtoSellerName -Bytes $sellerBytes
                } else {
                    Skip-Field -Data $EntryBytes -WireType $wire -Pos ([ref]$pos)
                }
            }
            6 {
                if ($wire -eq 0) { $quantity = [int64](Read-Varint -Data $EntryBytes -Pos ([ref]$pos)) }
                else { Skip-Field -Data $EntryBytes -WireType $wire -Pos ([ref]$pos) }
            }
            7 {
                if ($wire -eq 0) { $unitPrice = [int64](Read-Varint -Data $EntryBytes -Pos ([ref]$pos)) }
                else { Skip-Field -Data $EntryBytes -WireType $wire -Pos ([ref]$pos) }
            }
            default {
                Skip-Field -Data $EntryBytes -WireType $wire -Pos ([ref]$pos)
            }
        }
    }

    if ($itemRefId -le 0 -or $unitPrice -le 0) { return $null }

    return [pscustomobject]@{
        kind      = "sell"
        timestamp = $Timestamp
        uid       = $uid
        itemRefId = $itemRefId
        actor     = $seller
        quantity  = $quantity
        unitPrice = $unitPrice
    }
}

function Parse-BuyOffer {
    param(
        [byte[]]$OfferBytes,
        [string]$Timestamp
    )

    $pos = 0
    $uid = 0L
    $itemRefId = 0
    $buyer = "?"
    $unitPrice = 0L
    $quantity = 0L

    while ($pos -lt $OfferBytes.Length) {
        $tag = Read-Varint -Data $OfferBytes -Pos ([ref]$pos)
        $field = [int]($tag -shr 3)
        $wire = [int]($tag -band 7)

        switch ($field) {
            1 {
                if ($wire -eq 0) { $uid = [int64](Read-Varint -Data $OfferBytes -Pos ([ref]$pos)) }
                else { Skip-Field -Data $OfferBytes -WireType $wire -Pos ([ref]$pos) }
            }
            2 {
                if ($wire -eq 0) { $itemRefId = [int](Read-Varint -Data $OfferBytes -Pos ([ref]$pos)) }
                else { Skip-Field -Data $OfferBytes -WireType $wire -Pos ([ref]$pos) }
            }
            4 {
                if ($wire -eq 2) {
                    $raw = Read-LengthDelimited -Data $OfferBytes -Pos ([ref]$pos)
                    $decoded = [System.Text.Encoding]::UTF8.GetString($raw)
                    if (-not [string]::IsNullOrWhiteSpace($decoded)) { $buyer = $decoded }
                } else {
                    Skip-Field -Data $OfferBytes -WireType $wire -Pos ([ref]$pos) }
            }
            7 {
                if ($wire -eq 0) { $unitPrice = [int64](Read-Varint -Data $OfferBytes -Pos ([ref]$pos)) }
                else { Skip-Field -Data $OfferBytes -WireType $wire -Pos ([ref]$pos) }
            }
            8 {
                if ($wire -eq 0) { $quantity = [int64](Read-Varint -Data $OfferBytes -Pos ([ref]$pos)) }
                else { Skip-Field -Data $OfferBytes -WireType $wire -Pos ([ref]$pos) }
            }
            default {
                Skip-Field -Data $OfferBytes -WireType $wire -Pos ([ref]$pos)
            }
        }
    }

    if ($itemRefId -le 0 -or $unitPrice -le 0) { return $null }

    return [pscustomobject]@{
        kind      = "buy"
        timestamp = $Timestamp
        uid       = $uid
        itemRefId = $itemRefId
        actor     = $buyer
        quantity  = $quantity
        unitPrice = $unitPrice
    }
}

function Parse-ResponseEntries {
    param(
        [byte[]]$ProtoBytes,
        [string]$Timestamp,
        [ValidateSet('sell', 'buy')][string]$Kind
    )

    $result = New-Object System.Collections.Generic.List[object]
    $pos = 0
    while ($pos -lt $ProtoBytes.Length) {
        $tag = Read-Varint -Data $ProtoBytes -Pos ([ref]$pos)
        $field = [int]($tag -shr 3)
        $wire = [int]($tag -band 7)

        if ($field -eq 2 -and $wire -eq 2) {
            $entryBytes = Read-LengthDelimited -Data $ProtoBytes -Pos ([ref]$pos)
            $decoded = if ($Kind -eq 'sell') {
                Parse-SellEntry -EntryBytes $entryBytes -Timestamp $Timestamp
            } else {
                Parse-BuyOffer -OfferBytes $entryBytes -Timestamp $Timestamp
            }
            if ($null -ne $decoded) {
                $result.Add($decoded)
            }
        } else {
            Skip-Field -Data $ProtoBytes -WireType $wire -Pos ([ref]$pos)
        }
    }
    return $result
}

function Get-ItemNameMap {
    param([string]$LocalCachePath)

    $itemMap = @{}

    if (Test-Path $LocalCachePath) {
        try {
            $cache = Get-Content $LocalCachePath -Raw | ConvertFrom-Json
            foreach ($p in $cache.PSObject.Properties) {
                $itemMap[[string]$p.Name] = [string]$p.Value
            }
        } catch {}
    }

    try {
        $configRaw = Invoke-WebRequest -Uri "https://wakfu.cdn.ankama.com/gamedata/config.json" -UseBasicParsing -TimeoutSec 10
        $config = $configRaw.Content | ConvertFrom-Json
        $version = $config.version
        $itemsRaw = Invoke-WebRequest -Uri "https://wakfu.cdn.ankama.com/gamedata/$version/items.json" -UseBasicParsing -TimeoutSec 20
        $itemsJson = $itemsRaw.Content | ConvertFrom-Json
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
    } catch {}

    return $itemMap
}

if (-not (Test-Path $ProtoLogPath)) {
    throw "Proto log introuvable: $ProtoLogPath"
}

$itemNameMap = Get-ItemNameMap -LocalCachePath $CachePath
$sellEntries = New-Object System.Collections.Generic.List[object]
$buyEntries = New-Object System.Collections.Generic.List[object]
$lineErrors = 0

Get-Content -Path $ProtoLogPath | ForEach-Object {
    $line = $_
    if ([string]::IsNullOrWhiteSpace($line)) { return }
    if ($line -notmatch "PROTOHEX=([0-9A-F]+)$") { return }

    $timestamp = ($line -split "\|", 2)[0]
    $hex = $Matches[1]

    try {
        $protoBytes = Convert-HexToBytes -Hex $hex
        if ($line -match "\|msgId=12294\|") {
            $decoded = Parse-ResponseEntries -ProtoBytes $protoBytes -Timestamp $timestamp -Kind sell
            foreach ($entry in $decoded) { $sellEntries.Add($entry) }
        } elseif ($line -match "\|msgId=13653\|") {
            $decoded = Parse-ResponseEntries -ProtoBytes $protoBytes -Timestamp $timestamp -Kind buy
            foreach ($entry in $decoded) { $buyEntries.Add($entry) }
        }
    } catch {
        $lineErrors++
    }
}

$buyByRef = @{}
foreach ($entry in $buyEntries) {
    $key = [string]$entry.itemRefId
    if (-not $buyByRef.ContainsKey($key)) { $buyByRef[$key] = New-Object System.Collections.Generic.List[object] }
    $buyByRef[$key].Add($entry)
}

$sellByRef = @{}
foreach ($entry in $sellEntries) {
    $key = [string]$entry.itemRefId
    if (-not $sellByRef.ContainsKey($key)) { $sellByRef[$key] = New-Object System.Collections.Generic.List[object] }
    $sellByRef[$key].Add($entry)
}

$results = New-Object System.Collections.Generic.List[object]
foreach ($key in $sellByRef.Keys) {
    if (-not $buyByRef.ContainsKey($key)) { continue }

    $sells = $sellByRef[$key]
    $buys = $buyByRef[$key]
    if ($sells.Count -eq 0 -or $buys.Count -eq 0) { continue }

    $sellMin = ($sells | Measure-Object -Property unitPrice -Minimum).Minimum
    $buyMax = ($buys | Measure-Object -Property unitPrice -Maximum).Maximum
    if ($buyMax -le $sellMin) { continue }

    $latestSellTs = ($sells | Sort-Object timestamp -Descending | Select-Object -First 1).timestamp
    $latestBuyTs = ($buys | Sort-Object timestamp -Descending | Select-Object -First 1).timestamp
    $name = if ($itemNameMap.ContainsKey($key)) { $itemNameMap[$key] } else { "refId=$key" }

    $results.Add([pscustomobject]@{
        itemRefId          = [int]$key
        name               = $name
        cheapestSell       = [int64]$sellMin
        highestBuy         = [int64]$buyMax
        margin             = [int64]($buyMax - $sellMin)
        sellSamples        = $sells.Count
        buySamples         = $buys.Count
        latestSellTs       = $latestSellTs
        latestBuyTs        = $latestBuyTs
    })
}

$results = @($results | Sort-Object margin -Descending)

Write-Host "Ventes decodees: $($sellEntries.Count)" -ForegroundColor Green
Write-Host "Achats decodes: $($buyEntries.Count)" -ForegroundColor Green
Write-Host "Erreurs lignes: $lineErrors" -ForegroundColor Yellow
Write-Host "Objets avec achat > vente: $($results.Count)" -ForegroundColor Cyan

if ($results.Count -gt 0) {
    Write-Host "`nTop $Top arbitrages observes:" -ForegroundColor Cyan
    $results |
        Select-Object -First $Top name, itemRefId, cheapestSell, highestBuy, margin, sellSamples, buySamples, latestSellTs, latestBuyTs |
        Format-Table -AutoSize
}
