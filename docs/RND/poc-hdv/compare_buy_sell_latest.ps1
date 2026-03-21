$log = "H:\Code\Wakfuassistant\logs\market_v3_proto.log"

function HexToBytes([string]$hex) {
    $b = New-Object byte[] ($hex.Length / 2)
    for ($i = 0; $i -lt $b.Length; $i++) {
        $b[$i] = [Convert]::ToByte($hex.Substring($i * 2, 2), 16)
    }
    return $b
}

function ReadVar([byte[]]$d, [ref]$p) {
    [UInt64]$v = 0
    $s = 0
    while ($p.Value -lt $d.Length) {
        $x = [UInt64]$d[$p.Value]
        $p.Value++
        $v = $v -bor (($x -band [UInt64]0x7F) -shl $s)
        if (($x -band [UInt64]0x80) -eq 0) { return $v }
        $s += 7
    }
    throw "eof"
}

function SkipField([byte[]]$d, [int]$w, [ref]$p) {
    switch ($w) {
        0 { [void](ReadVar $d $p) }
        1 { $p.Value += 8 }
        2 {
            $l = [int](ReadVar $d $p)
            $p.Value += $l
        }
        5 { $p.Value += 4 }
        default { return $false }
    }
    return $true
}

function ParsePricesFromLine([string]$line) {
    $m = [regex]::Match($line, "PROTOHEX=([0-9A-F]+)$")
    if (-not $m.Success) { return @() }

    $bytes = HexToBytes $m.Groups[1].Value
    $p = 0
    $prices = @()

    while ($p -lt $bytes.Length) {
        $tag = ReadVar $bytes ([ref]$p)
        $f = [UInt64]($tag -shr 3)
        $w = [int]($tag -band 7)

        if ($f -gt 1000) { break }

        if ($f -eq 2 -and $w -eq 2) {
            $l = [int](ReadVar $bytes ([ref]$p))
            if ($l -lt 0 -or ($p + $l) -gt $bytes.Length) { break }
            $entry = $bytes[$p..($p + $l - 1)]
            $p += $l

            $ep = 0
            $price = $null
            while ($ep -lt $entry.Length) {
                $et = ReadVar $entry ([ref]$ep)
                $ef = [UInt64]($et -shr 3)
                $ew = [int]($et -band 7)

                if ($ef -gt 1000) { break }

                if ($ef -eq 7 -and $ew -eq 0) {
                    $price = [int64](ReadVar $entry ([ref]$ep))
                }
                else {
                    if (-not (SkipField $entry $ew ([ref]$ep))) { break }
                }
            }

            if ($null -ne $price -and $price -gt 0) {
                $prices += $price
            }
        }
        else {
            if (-not (SkipField $bytes $w ([ref]$p))) { break }
        }
    }

    return $prices
}

$sellLine = Get-Content $log | Where-Object { $_ -match "\|msgId=12294\|" } | Select-Object -Last 1
$buyLine = Get-Content $log | Where-Object { $_ -match "\|msgId=13653\|" } | Select-Object -Last 1

if (-not $sellLine -or -not $buyLine) {
    Write-Output "MISSING_DATA"
    exit 0
}

$sellPrices = ParsePricesFromLine $sellLine
$buyPrices = ParsePricesFromLine $buyLine

$tsSell = ($sellLine -split "\|")[0]
$tsBuy = ($buyLine -split "\|")[0]

$sMin = ($sellPrices | Measure-Object -Minimum).Minimum
$sMax = ($sellPrices | Measure-Object -Maximum).Maximum
$bMin = ($buyPrices | Measure-Object -Minimum).Minimum
$bMax = ($buyPrices | Measure-Object -Maximum).Maximum

Write-Output "SELL_TS=$tsSell SELL_COUNT=$($sellPrices.Count) SELL_MIN=$sMin SELL_MAX=$sMax"
Write-Output "BUY_TS=$tsBuy BUY_COUNT=$($buyPrices.Count) BUY_MIN=$bMin BUY_MAX=$bMax"

if ($bMax -gt $sMin) {
    Write-Output "BUY_OVER_SELL=YES DELTA=$($bMax - $sMin)"
}
else {
    Write-Output "BUY_OVER_SELL=NO"
}

Write-Output ("TOP_BUY=" + (($buyPrices | Sort-Object -Descending | Select-Object -First 5) -join ", "))
Write-Output ("TOP_SELL=" + (($sellPrices | Sort-Object | Select-Object -First 5) -join ", "))
