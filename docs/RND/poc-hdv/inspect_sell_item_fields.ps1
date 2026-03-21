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

$line = Get-Content $log | Where-Object { $_ -match "\|msgId=12294\|" } | Select-Object -Last 1
$hex = [regex]::Match($line, "PROTOHEX=([0-9A-F]+)$").Groups[1].Value
$bytes = Convert-HexToBytes $hex

$pos = 0
$entryIndex = 0
while ($pos -lt $bytes.Length -and $entryIndex -lt 3) {
    $tag = Read-Varint -Data $bytes -Pos ([ref]$pos)
    $field = [int]($tag -shr 3)
    $wire = [int]($tag -band 7)
    if ($field -eq 2 -and $wire -eq 2) {
        $entryBytes = Read-LengthDelimited -Data $bytes -Pos ([ref]$pos)
        $entryIndex++
        Write-Host "ENTRY #$entryIndex" -ForegroundColor Cyan

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
                    if ($iw -eq 0) {
                        $val = [int64](Read-Varint -Data $itemBytes -Pos ([ref]$ip))
                        Write-Host ("  item.f{0}={1}" -f $if, $val) -ForegroundColor White
                    } elseif ($iw -eq 2) {
                        $sub = Read-LengthDelimited -Data $itemBytes -Pos ([ref]$ip)
                        Write-Host ("  item.f{0}={{len:{1}}}" -f $if, $sub.Length) -ForegroundColor Gray
                    } elseif ($iw -eq 1) {
                        Write-Host ("  item.f{0}=fix64" -f $if) -ForegroundColor Gray
                        $ip += 8
                    } elseif ($iw -eq 5) {
                        Write-Host ("  item.f{0}=fix32" -f $if) -ForegroundColor Gray
                        $ip += 4
                    } else {
                        break
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
