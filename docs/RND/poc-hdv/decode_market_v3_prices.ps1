# ============================================
#  Decode prices from market_v3_proto.log
#  Reads msgId=12294 protobuf payloads and extracts MarketEntry.unit_price (field 7)
# ============================================

param(
    [string]$ProtoLogPath = "H:\Code\Wakfuassistant\logs\market_v3_proto.log",
    [string]$OutputJsonPath = "H:\Code\Wakfuassistant\logs\market_prices_decoded_v3.json",
    [int]$Top = 20
)

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

function Convert-HexToBytes {
    param([Parameter(Mandatory = $true)][string]$Hex)

    $clean = $Hex.Trim()
    if (($clean.Length % 2) -ne 0) {
        throw "Invalid hex payload length: $($clean.Length)"
    }

    $bytes = New-Object byte[] ($clean.Length / 2)
    for ($i = 0; $i -lt $bytes.Length; $i++) {
        $bytes[$i] = [Convert]::ToByte($clean.Substring($i * 2, 2), 16)
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
        throw "Invalid length-delimited field (len=$len)"
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
            if (($Pos.Value + 8) -gt $Data.Length) { throw "EOF on fixed64" }
            $Pos.Value += 8
        }
        2 { [void](Read-LengthDelimited -Data $Data -Pos $Pos) }
        5 {
            if (($Pos.Value + 4) -gt $Data.Length) { throw "EOF on fixed32" }
            $Pos.Value += 4
        }
        default { throw "Unsupported wire type: $WireType" }
    }
}

function Parse-SellerName {
    param([byte[]]$SellerBytes)

    $p = 0
    $name = "?"
    while ($p -lt $SellerBytes.Length) {
        $tag = Read-Varint -Data $SellerBytes -Pos ([ref]$p)
        $field = [int]($tag -shr 3)
        $wire = [int]($tag -band 0x7)

        if ($field -eq 2 -and $wire -eq 2) {
            $raw = Read-LengthDelimited -Data $SellerBytes -Pos ([ref]$p)
            try {
                $decoded = [System.Text.Encoding]::UTF8.GetString($raw)
                if (-not [string]::IsNullOrWhiteSpace($decoded)) {
                    $name = $decoded
                }
            } catch {
                $name = "?"
            }
        } else {
            Skip-Field -Data $SellerBytes -WireType $wire -Pos ([ref]$p)
        }
    }

    return $name
}

function Parse-MarketEntry {
    param(
        [byte[]]$EntryBytes,
        [string]$Timestamp
    )

    $p = 0
    $uid = 0L
    $seller = "?"
    $initialQty = 0L
    $remainingQty = 0L
    $unitPrice = 0L
    $sellDurationId = 0L
    $expiration = 0L

    while ($p -lt $EntryBytes.Length) {
        $tag = Read-Varint -Data $EntryBytes -Pos ([ref]$p)
        $field = [int]($tag -shr 3)
        $wire = [int]($tag -band 0x7)

        switch ($field) {
            1 {
                if ($wire -eq 0) { $uid = [int64](Read-Varint -Data $EntryBytes -Pos ([ref]$p)) }
                else { Skip-Field -Data $EntryBytes -WireType $wire -Pos ([ref]$p) }
            }
            3 {
                if ($wire -eq 2) {
                    $sellerBytes = Read-LengthDelimited -Data $EntryBytes -Pos ([ref]$p)
                    $seller = Parse-SellerName -SellerBytes $sellerBytes
                } else {
                    Skip-Field -Data $EntryBytes -WireType $wire -Pos ([ref]$p)
                }
            }
            5 {
                if ($wire -eq 0) { $initialQty = [int64](Read-Varint -Data $EntryBytes -Pos ([ref]$p)) }
                else { Skip-Field -Data $EntryBytes -WireType $wire -Pos ([ref]$p) }
            }
            6 {
                if ($wire -eq 0) { $remainingQty = [int64](Read-Varint -Data $EntryBytes -Pos ([ref]$p)) }
                else { Skip-Field -Data $EntryBytes -WireType $wire -Pos ([ref]$p) }
            }
            7 {
                if ($wire -eq 0) { $unitPrice = [int64](Read-Varint -Data $EntryBytes -Pos ([ref]$p)) }
                else { Skip-Field -Data $EntryBytes -WireType $wire -Pos ([ref]$p) }
            }
            8 {
                if ($wire -eq 0) { $sellDurationId = [int64](Read-Varint -Data $EntryBytes -Pos ([ref]$p)) }
                else { Skip-Field -Data $EntryBytes -WireType $wire -Pos ([ref]$p) }
            }
            9 {
                if ($wire -eq 0) { $expiration = [int64](Read-Varint -Data $EntryBytes -Pos ([ref]$p)) }
                else { Skip-Field -Data $EntryBytes -WireType $wire -Pos ([ref]$p) }
            }
            default {
                Skip-Field -Data $EntryBytes -WireType $wire -Pos ([ref]$p)
            }
        }
    }

    return [pscustomobject]@{
        timestamp      = $Timestamp
        uid            = $uid
        seller         = $seller
        initialQty     = $initialQty
        remainingQty   = $remainingQty
        unitPrice      = $unitPrice
        sellDurationId = $sellDurationId
        expiration     = $expiration
    }
}

function Parse-MarketEntries {
    param(
        [byte[]]$ProtoBytes,
        [string]$Timestamp
    )

    $entries = New-Object System.Collections.Generic.List[object]
    $p = 0

    while ($p -lt $ProtoBytes.Length) {
        $tag = Read-Varint -Data $ProtoBytes -Pos ([ref]$p)
        $field = [int]($tag -shr 3)
        $wire = [int]($tag -band 0x7)

        if ($field -eq 2 -and $wire -eq 2) {
            $entryBytes = Read-LengthDelimited -Data $ProtoBytes -Pos ([ref]$p)
            $entries.Add((Parse-MarketEntry -EntryBytes $entryBytes -Timestamp $Timestamp))
        } else {
            Skip-Field -Data $ProtoBytes -WireType $wire -Pos ([ref]$p)
        }
    }

    return $entries
}

if (-not (Test-Path $ProtoLogPath)) {
    throw "Proto log introuvable: $ProtoLogPath"
}

$allEntries = New-Object System.Collections.Generic.List[object]
$lineErrors = 0

Get-Content -Path $ProtoLogPath | ForEach-Object {
    $line = $_
    if ([string]::IsNullOrWhiteSpace($line)) { return }
    if ($line -notmatch "\|msgId=12294\|") { return }
    if ($line -notmatch "PROTOHEX=([0-9A-F]+)$") { return }

    $hex = $Matches[1]
    $timestamp = ($line -split "\|", 2)[0]

    try {
        $protoBytes = Convert-HexToBytes -Hex $hex
        $decoded = Parse-MarketEntries -ProtoBytes $protoBytes -Timestamp $timestamp
        foreach ($entry in $decoded) {
            if ($entry.unitPrice -gt 0) {
                $allEntries.Add($entry)
            }
        }
    } catch {
        $lineErrors++
    }
}

$allEntries | Sort-Object unitPrice -Descending | ConvertTo-Json -Depth 5 | Out-File -FilePath $OutputJsonPath -Encoding UTF8

Write-Host "Decode termine." -ForegroundColor Green
Write-Host "Entrees avec prix > 0: $($allEntries.Count)" -ForegroundColor Green
Write-Host "Erreurs de parsing ligne: $lineErrors" -ForegroundColor Yellow
Write-Host "Sortie JSON: $OutputJsonPath" -ForegroundColor Cyan

if ($allEntries.Count -gt 0) {
    Write-Host "`nTop $Top prix:" -ForegroundColor Cyan
    $allEntries |
        Sort-Object unitPrice -Descending |
        Select-Object -First $Top timestamp, seller, unitPrice, initialQty, remainingQty, uid |
        Format-Table -AutoSize
}
