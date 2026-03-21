$log = "H:\Code\Wakfuassistant\logs\market_v3_proto.log"

function Convert-HexToBytes([string]$Hex) {
    $bytes = New-Object byte[] ($Hex.Length / 2)
    for ($i = 0; $i -lt $bytes.Length; $i++) {
        $bytes[$i] = [Convert]::ToByte($Hex.Substring($i * 2, 2), 16)
    }
    return $bytes
}

function Read-Varint([byte[]]$Data, [ref]$Pos) {
    [UInt64]$value = 0
    $shift = 0
    while ($Pos.Value -lt $Data.Length) {
        $b = [UInt64]$Data[$Pos.Value]
        $Pos.Value++
        $value = $value -bor (($b -band [UInt64]0x7F) -shl $shift)
        if (($b -band [UInt64]0x80) -eq 0) { return $value }
        $shift += 7
    }
    throw "EOF"
}

function Read-LengthDelimited([byte[]]$Data, [ref]$Pos) {
    $len = [int](Read-Varint -Data $Data -Pos $Pos)
    $slice = New-Object byte[] $len
    [Array]::Copy($Data, $Pos.Value, $slice, 0, $len)
    $Pos.Value += $len
    return $slice
}

function Skip-Field([byte[]]$Data, [int]$WireType, [ref]$Pos) {
    switch ($WireType) {
        0 { [void](Read-Varint -Data $Data -Pos $Pos) }
        1 { $Pos.Value += 8 }
        2 { [void](Read-LengthDelimited -Data $Data -Pos $Pos) }
        5 { $Pos.Value += 4 }
        default { throw "wire" }
    }
}

function Parse-SellRefIds([string]$line) {
    $hex = [regex]::Match($line, "PROTOHEX=([0-9A-F]+)$").Groups[1].Value
    $bytes = Convert-HexToBytes $hex
    $refIds = @()
    $pos = 0
    while ($pos -lt $bytes.Length) {
        $tag = Read-Varint -Data $bytes -Pos ([ref]$pos)
        $field = [int]($tag -shr 3)
        $wire = [int]($tag -band 7)
        if ($field -eq 2 -and $wire -eq 2) {
            $entryBytes = Read-LengthDelimited -Data $bytes -Pos ([ref]$pos)
            $ep = 0
            while ($ep -lt $entryBytes.Length) {
                $etag = Read-Varint -Data $entryBytes -Pos ([ref]$ep)
                $ef = [int]($etag -shr 3)
                $ew = [int]($etag -band 7)
                if ($ef -eq 2 -and $ew -eq 2) {
                    $itemBytes = Read-LengthDelimited -Data $entryBytes -Pos ([ref]$ep)
                    $ip = 0
                    while ($ip -lt $itemBytes.Length) {
                        $itag = Read-Varint -Data $itemBytes -Pos ([ref]$ip)
                        $if = [int]($itag -shr 3)
                        $iw = [int]($itag -band 7)
                        if ($if -eq 2 -and $iw -eq 0) {
                            $refIds += [int](Read-Varint -Data $itemBytes -Pos ([ref]$ip))
                            break
                        } else {
                            Skip-Field -Data $itemBytes -WireType $iw -Pos ([ref]$ip)
                        }
                    }
                    break
                } else {
                    Skip-Field -Data $entryBytes -WireType $ew -Pos ([ref]$ep)
                }
            }
        } else {
            Skip-Field -Data $bytes -WireType $wire -Pos ([ref]$pos)
        }
    }
    return $refIds
}

function Parse-BuyRefIds([string]$line) {
    $hex = [regex]::Match($line, "PROTOHEX=([0-9A-F]+)$").Groups[1].Value
    $bytes = Convert-HexToBytes $hex
    $refIds = @()
    $pos = 0
    while ($pos -lt $bytes.Length) {
        $tag = Read-Varint -Data $bytes -Pos ([ref]$pos)
        $field = [int]($tag -shr 3)
        $wire = [int]($tag -band 7)
        if ($field -eq 2 -and $wire -eq 2) {
            $offerBytes = Read-LengthDelimited -Data $bytes -Pos ([ref]$pos)
            $op = 0
            while ($op -lt $offerBytes.Length) {
                $otag = Read-Varint -Data $offerBytes -Pos ([ref]$op)
                $of = [int]($otag -shr 3)
                $ow = [int]($otag -band 7)
                if ($of -eq 2 -and $ow -eq 0) {
                    $refIds += [int](Read-Varint -Data $offerBytes -Pos ([ref]$op))
                    break
                } else {
                    Skip-Field -Data $offerBytes -WireType $ow -Pos ([ref]$op)
                }
            }
        } else {
            Skip-Field -Data $bytes -WireType $wire -Pos ([ref]$pos)
        }
    }
    return $refIds
}

$sellLines = Get-Content $log | Where-Object { $_ -match "\|msgId=12294\|" }
$buyLines = Get-Content $log | Where-Object { $_ -match "\|msgId=13653\|" }

$sellRefIds = @($sellLines | ForEach-Object { Parse-SellRefIds $_ } | Sort-Object -Unique)
$buyRefIds = @($buyLines | ForEach-Object { Parse-BuyRefIds $_ } | Sort-Object -Unique)
$overlap = @($sellRefIds | Where-Object { $_ -in $buyRefIds })

Write-Host ("SELL_REFS=" + ($sellRefIds -join ', '))
Write-Host ("BUY_REFS=" + ($buyRefIds -join ', '))
Write-Host ("OVERLAP=" + ($overlap -join ', '))
