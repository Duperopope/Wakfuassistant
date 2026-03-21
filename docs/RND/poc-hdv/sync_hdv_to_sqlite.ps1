param(
    [string]$ProtoLogPath = "H:\Code\Wakfuassistant\logs\market_v3_proto.log",
    [string]$DbPath = "H:\Code\Wakfuassistant\logs\hdv_market.db"
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
        if ($shift -gt 63) { throw "Varint too long" }
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
        1 { $Pos.Value += 8 }
        2 { [void](Read-LengthDelimited -Data $Data -Pos $Pos) }
        5 { $Pos.Value += 4 }
        default { throw "Unsupported wire type: $WireType" }
    }
}

function Escape-Sql {
    param([string]$Value)
    if ($null -eq $Value) { return "" }
    return $Value.Replace("'", "''")
}

function Parse-SellerName {
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
        [string]$SourceTs
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
                    $seller = Parse-SellerName -Bytes $sellerBytes
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
        side = "sell"
        source_ts = $SourceTs
        offer_uid = $uid
        item_ref_id = $itemRefId
        actor_name = $seller
        unit_price = $unitPrice
        quantity = $quantity
        msg_id = 12294
    }
}

function Parse-BuyOffer {
    param(
        [byte[]]$OfferBytes,
        [string]$SourceTs
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
                    Skip-Field -Data $OfferBytes -WireType $wire -Pos ([ref]$pos)
                }
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
        side = "buy"
        source_ts = $SourceTs
        offer_uid = $uid
        item_ref_id = $itemRefId
        actor_name = $buyer
        unit_price = $unitPrice
        quantity = $quantity
        msg_id = 13653
    }
}

function Parse-Entries {
    param(
        [byte[]]$ProtoBytes,
        [string]$SourceTs,
        [ValidateSet('sell', 'buy')][string]$Kind
    )

    $entries = New-Object System.Collections.Generic.List[object]
    $pos = 0

    while ($pos -lt $ProtoBytes.Length) {
        $tag = Read-Varint -Data $ProtoBytes -Pos ([ref]$pos)
        $field = [int]($tag -shr 3)
        $wire = [int]($tag -band 7)

        if ($field -eq 2 -and $wire -eq 2) {
            $entryBytes = Read-LengthDelimited -Data $ProtoBytes -Pos ([ref]$pos)
            $decoded = if ($Kind -eq 'sell') {
                Parse-SellEntry -EntryBytes $entryBytes -SourceTs $SourceTs
            } else {
                Parse-BuyOffer -OfferBytes $entryBytes -SourceTs $SourceTs
            }
            if ($null -ne $decoded) {
                $entries.Add($decoded)
            }
        } else {
            Skip-Field -Data $ProtoBytes -WireType $wire -Pos ([ref]$pos)
        }
    }

    return $entries
}

if (-not (Test-Path $ProtoLogPath)) {
    throw "Proto log introuvable: $ProtoLogPath"
}

$schemaSql = @"
PRAGMA journal_mode=WAL;
CREATE TABLE IF NOT EXISTS market_observations (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  observed_at TEXT NOT NULL,
  side TEXT NOT NULL,
  item_ref_id INTEGER NOT NULL,
  offer_uid INTEGER NOT NULL,
  actor_name TEXT,
  unit_price INTEGER NOT NULL,
  quantity INTEGER NOT NULL,
  source_msg_id INTEGER NOT NULL,
  source_ts TEXT NOT NULL,
  line_hash TEXT NOT NULL UNIQUE
);
CREATE INDEX IF NOT EXISTS idx_obs_item_side ON market_observations(item_ref_id, side);
CREATE INDEX IF NOT EXISTS idx_obs_ts ON market_observations(source_ts);

CREATE TABLE IF NOT EXISTS market_latest (
  side TEXT NOT NULL,
  item_ref_id INTEGER NOT NULL,
  offer_uid INTEGER NOT NULL,
  actor_name TEXT,
  unit_price INTEGER NOT NULL,
  quantity INTEGER NOT NULL,
  source_msg_id INTEGER NOT NULL,
  source_ts TEXT NOT NULL,
  updated_at TEXT NOT NULL,
  PRIMARY KEY (side, item_ref_id, offer_uid)
);
CREATE INDEX IF NOT EXISTS idx_latest_item ON market_latest(item_ref_id);
"@

$schemaSql | sqlite3 $DbPath | Out-Null

$now = Get-Date -Format "yyyy-MM-dd HH:mm:ss"
$insertSql = New-Object System.Text.StringBuilder
[void]$insertSql.AppendLine("BEGIN;")
$sha1 = [System.Security.Cryptography.SHA1]::Create()

$decodedCount = 0
$errors = 0

Get-Content -Path $ProtoLogPath | ForEach-Object {
    $line = $_
    if ($line -notmatch "PROTOHEX=([0-9A-F]+)$") { return }

    $sourceTs = ($line -split "\|", 2)[0]
    $hex = $Matches[1]

    try {
        $protoBytes = Convert-HexToBytes -Hex $hex
        $entries = if ($line -match "\|msgId=12294\|") {
            Parse-Entries -ProtoBytes $protoBytes -SourceTs $sourceTs -Kind sell
        } elseif ($line -match "\|msgId=13653\|") {
            Parse-Entries -ProtoBytes $protoBytes -SourceTs $sourceTs -Kind buy
        } else {
            @()
        }

        foreach ($entry in $entries) {
            $decodedCount++
            $actor = Escape-Sql $entry.actor_name
            $fingerprint = "$($entry.side)|$($entry.item_ref_id)|$($entry.offer_uid)|$($entry.unit_price)|$($entry.quantity)|$($entry.source_ts)|$($entry.actor_name)"
            $hashBytes = $sha1.ComputeHash([System.Text.Encoding]::UTF8.GetBytes($fingerprint))
            $hash = [System.BitConverter]::ToString($hashBytes).Replace("-", "").ToLower()

            [void]$insertSql.AppendLine(
                "INSERT OR IGNORE INTO market_observations(observed_at,side,item_ref_id,offer_uid,actor_name,unit_price,quantity,source_msg_id,source_ts,line_hash) " +
                "VALUES('$now','$($entry.side)',$($entry.item_ref_id),$($entry.offer_uid),'$actor',$($entry.unit_price),$($entry.quantity),$($entry.msg_id),'$($entry.source_ts)','$hash');"
            )

            [void]$insertSql.AppendLine(
                "INSERT INTO market_latest(side,item_ref_id,offer_uid,actor_name,unit_price,quantity,source_msg_id,source_ts,updated_at) " +
                "VALUES('$($entry.side)',$($entry.item_ref_id),$($entry.offer_uid),'$actor',$($entry.unit_price),$($entry.quantity),$($entry.msg_id),'$($entry.source_ts)','$now') " +
                "ON CONFLICT(side,item_ref_id,offer_uid) DO UPDATE SET " +
                "actor_name=excluded.actor_name, unit_price=excluded.unit_price, quantity=excluded.quantity, " +
                "source_msg_id=excluded.source_msg_id, source_ts=excluded.source_ts, updated_at=excluded.updated_at;"
            )
        }
    } catch {
        $errors++
        if ($errors -le 5) {
            Write-Host ("Parse error sample: " + $_.Exception.Message) -ForegroundColor DarkYellow
        }
    }
}

[void]$insertSql.AppendLine("COMMIT;")
$insertSql.ToString() | sqlite3 $DbPath | Out-Null

$statsSql = @"
SELECT 'obs_total', COUNT(*) FROM market_observations;
SELECT 'latest_total', COUNT(*) FROM market_latest;
SELECT 'latest_sell', COUNT(*) FROM market_latest WHERE side='sell';
SELECT 'latest_buy', COUNT(*) FROM market_latest WHERE side='buy';
SELECT 'distinct_items_sell', COUNT(DISTINCT item_ref_id) FROM market_latest WHERE side='sell';
SELECT 'distinct_items_buy', COUNT(DISTINCT item_ref_id) FROM market_latest WHERE side='buy';
"@

$stats = $statsSql | sqlite3 $DbPath

Write-Host "DB sync terminee." -ForegroundColor Green
Write-Host "DB: $DbPath" -ForegroundColor Cyan
Write-Host "Entrees decodees: $decodedCount" -ForegroundColor Green
Write-Host "Erreurs parsing: $errors" -ForegroundColor Yellow
Write-Host "Stats:" -ForegroundColor Cyan
$stats | ForEach-Object { Write-Host "  $_" -ForegroundColor White }
