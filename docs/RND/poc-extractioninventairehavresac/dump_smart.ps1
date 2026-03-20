# ============================================
#  DUMP SMART COMPARTIMENT #4 -> FICHIER + ANALYSE AUTO
#  H:\Code\Wakfuassistant\dump_smart.ps1
# ============================================

$spyPath = "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu_spy.log"
$dumpPath = "H:\Code\Wakfuassistant\dump_compartiment4.txt"
$resultPath = "H:\Code\Wakfuassistant\items_extraits.txt"

# Extraire le contenu mhJ du csS
$csS_line = (Select-String -Path $spyPath -Pattern "Discarded inbound message csS@" | Select-Object -First 1).Line
$contenu = ""
if ($csS_line -match "mhJ=\[([^\]]+)\]") {
    $contenu = $Matches[1]
}

if ([string]::IsNullOrWhiteSpace($contenu)) {
    Write-Host "  ERREUR: Pas de mhJ trouve" -ForegroundColor Red
    exit
}

# Convertir bytes signes Java -> bytes non-signes
$signedBytes = $contenu -split ",\s*" | ForEach-Object { [int]$_.Trim() }
$bytes = [byte[]]::new($signedBytes.Count)
for ($i = 0; $i -lt $signedBytes.Count; $i++) {
    if ($signedBytes[$i] -lt 0) {
        $bytes[$i] = [byte](256 + $signedBytes[$i])
    } else {
        $bytes[$i] = [byte]$signedBytes[$i]
    }
}

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  DUMP SMART - $($bytes.Count) octets total" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

# --- FONCTIONS PROTOBUF ---
function Read-Varint {
    param([byte[]]$data, [ref]$pos)
    [long]$result = 0
    [int]$shift = 0
    do {
        if ($pos.Value -ge $data.Length) { return -1 }
        [byte]$b = $data[$pos.Value]
        $pos.Value++
        $result = $result -bor (([long]($b -band 0x7F)) -shl $shift)
        $shift += 7
    } while (($b -band 0x80) -ne 0)
    return $result
}

# Variable globale pour collecter les items
$script:allFields = @()
$script:dumpLines = @()

function Dump-ToFile {
    param([byte[]]$data, [int]$offset, [int]$length, [int]$depth = 0, [int]$maxDepth = 8)
    if ($depth -gt $maxDepth) { return }
    $pos = [ref]$offset
    $end = $offset + $length
    $indent = "  " * $depth

    while ($pos.Value -lt $end) {
        $startPos = $pos.Value
        $tag = Read-Varint $data $pos
        if ($tag -lt 0) { break }

        $fieldNum = [int]($tag -shr 3)
        $wireType = [int]($tag -band 0x07)

        switch ($wireType) {
            0 {
                $val = Read-Varint $data $pos
                $line = "${indent}f${fieldNum} varint = $val"
                $script:dumpLines += $line
                $script:allFields += @{
                    Depth = $depth
                    Field = $fieldNum
                    Type = "varint"
                    Value = $val
                    Offset = $startPos
                }
            }
            1 {
                if ($pos.Value + 8 -gt $end) { $pos.Value = $end; break }
                $val = [BitConverter]::ToUInt64($data, $pos.Value)
                $pos.Value += 8
                $line = "${indent}f${fieldNum} fixed64 = $val"
                $script:dumpLines += $line
                $script:allFields += @{
                    Depth = $depth
                    Field = $fieldNum
                    Type = "fixed64"
                    Value = $val
                    Offset = $startPos
                }
            }
            2 {
                $len = Read-Varint $data $pos
                if ($len -lt 0 -or $pos.Value + $len -gt $end) { $pos.Value = $end; break }
                $script:dumpLines += "${indent}f${fieldNum} bytes [$len] {"
                $subStart = $pos.Value
                try {
                    Dump-ToFile $data $subStart $len ($depth + 1) $maxDepth
                } catch { }
                $script:dumpLines += "${indent}}"
                $pos.Value = $subStart + $len
            }
            5 {
                if ($pos.Value + 4 -gt $end) { $pos.Value = $end; break }
                $val = [BitConverter]::ToUInt32($data, $pos.Value)
                $pos.Value += 4
                $line = "${indent}f${fieldNum} fixed32 = $val"
                $script:dumpLines += $line
                $script:allFields += @{
                    Depth = $depth
                    Field = $fieldNum
                    Type = "fixed32"
                    Value = $val
                    Offset = $startPos
                }
            }
            default {
                $pos.Value = $end
            }
        }
    }
}

# --- TROUVER ET DECODER TOUS LES COMPARTIMENTS ---
$pos = [ref]0
$compCount = 0
$compOffsets = @()

while ($pos.Value -lt $bytes.Count) {
    $startPos = $pos.Value
    $tag = Read-Varint $bytes $pos
    if ($tag -lt 0) { break }
    $fieldNum = [int]($tag -shr 3)
    $wireType = [int]($tag -band 0x07)

    if ($wireType -eq 2) {
        $len = Read-Varint $bytes $pos
        if ($fieldNum -eq 1) {
            $compCount++
            $compOffsets += @{ Num=$compCount; Offset=$pos.Value; Len=$len }
        }
        $pos.Value += $len
    } elseif ($wireType -eq 0) {
        Read-Varint $bytes $pos | Out-Null
    } elseif ($wireType -eq 1) {
        $pos.Value += 8
    } elseif ($wireType -eq 5) {
        $pos.Value += 4
    }
}

Write-Host "  $compCount compartiments trouves" -ForegroundColor Green

# Decoder CHAQUE compartiment
foreach ($comp in $compOffsets) {
    $script:dumpLines += "=== COMPARTIMENT #$($comp.Num) ($($comp.Len) bytes) ==="
    $script:allFields = @()

    Dump-ToFile $bytes $comp.Offset $comp.Len 0 8

    # Sauvegarder le dump
    $script:dumpLines += ""
}

# Ecrire le dump complet dans un fichier
$script:dumpLines | Out-File $dumpPath -Encoding UTF8
Write-Host "  Dump complet sauvegarde: $dumpPath ($($script:dumpLines.Count) lignes)" -ForegroundColor Green

# --- MAINTENANT ANALYSER LE FICHIER POUR TROUVER LES PATTERNS ---
Write-Host "`n============================================" -ForegroundColor Yellow
Write-Host "  ANALYSE AUTOMATIQUE DES ITEMS" -ForegroundColor Yellow
Write-Host "============================================" -ForegroundColor Yellow

$dumpContent = Get-Content $dumpPath

# Chercher les uniqueId potentiels (nombres > 10^15)
$bigNums = @()
foreach ($line in $dumpContent) {
    if ($line -match "(?:varint|fixed64)\s*=\s*(\d+)") {
        $val = [long]$Matches[1]
        if ($val -gt 1000000000000000) {
            $bigNums += @{ Value=$val; Line=$line.Trim() }
        }
    }
}
Write-Host "  $($bigNums.Count) grands nombres (uniqueId potentiels)" -ForegroundColor White
foreach ($bn in $bigNums | Select-Object -First 20) {
    Write-Host "    $($bn.Value) <= $($bn.Line)" -ForegroundColor Yellow
}
if ($bigNums.Count -gt 20) {
    Write-Host "    ... et $($bigNums.Count - 20) de plus" -ForegroundColor DarkGray
}

# Chercher les refId potentiels (1000-99999)
$medNums = @()
foreach ($line in $dumpContent) {
    if ($line -match "(?:varint|fixed64)\s*=\s*(\d+)") {
        $val = [long]$Matches[1]
        if ($val -ge 1000 -and $val -le 99999) {
            $medNums += @{ Value=$val; Line=$line.Trim() }
        }
    }
}
Write-Host "`n  $($medNums.Count) nombres moyens (refId potentiels)" -ForegroundColor White

# Chercher les refId connus specifiquement
Write-Host "`n  REFID CONNUS TROUVES:" -ForegroundColor Cyan
$knownRefs = @{
    2037="Epee du Tofu"; 9430="Dague de Boisaille"; 26396="Cape de Sakuya"
    26835="Bague Hou"; 12438="Anneau Craquele"; 12284="Poudre d'Osamodas"
    13638="Croutons"; 2340="Seau d'eau"; 29718="Incantation Feca"
    5409="?"; 25832="Epee Poutreuse"; 25012="Sifli a Iop"
    11441="Chataigne"; 27050="Poils de Pandissidan"; 21122="Sioupere-Glou"
}

foreach ($ref in $knownRefs.Keys) {
    $found = $medNums | Where-Object { $_.Value -eq $ref }
    if ($found) {
        Write-Host "    refId=$ref ($($knownRefs[$ref])) PRESENT => $($found[0].Line)" -ForegroundColor Green
    }
}

# Chercher les UID de depots non resolus
Write-Host "`n  UID DE DEPOTS NON RESOLUS:" -ForegroundColor Cyan
$depotUids = @(1470358329912983798, 1470358066242257617, 1470358188564939153)
foreach ($uid in $depotUids) {
    $found = $bigNums | Where-Object { $_.Value -eq $uid }
    if ($found) {
        Write-Host "    uid=$uid PRESENT => $($found[0].Line)" -ForegroundColor Green
    } else {
        Write-Host "    uid=$uid absent" -ForegroundColor DarkGray
    }
}

# Chercher les paires (uniqueId, refId) proches dans le dump
Write-Host "`n  PAIRES POTENTIELLES (uniqueId + refId proches):" -ForegroundColor Cyan
$lines = $dumpContent
for ($i = 0; $i -lt $lines.Count; $i++) {
    if ($lines[$i] -match "(?:varint|fixed64)\s*=\s*(\d{16,})") {
        $uid = $Matches[1]
        # Chercher un refId dans les 5 lignes avant/apres
        for ($j = [Math]::Max(0,$i-5); $j -lt [Math]::Min($lines.Count,$i+6); $j++) {
            if ($j -eq $i) { continue }
            if ($lines[$j] -match "varint\s*=\s*(\d{4,5})$") {
                $ref = $Matches[1]
                if ([int]$ref -ge 1000 -and [int]$ref -le 50000) {
                    $refName = if ($knownRefs.ContainsKey([int]$ref)) { $knownRefs[[int]$ref] } else { "?" }
                    Write-Host "    uid=$uid <-> refId=$ref ($refName)  [lignes $i et $j]" -ForegroundColor Green
                    break
                }
            }
        }
    }
}

# Sauvegarder le resultat
$resultLines = @("=== ITEMS EXTRAITS DU csS ===")
$resultLines += $bigNums | ForEach-Object { "UID: $($_.Value) | $($_.Line)" }
$resultLines += ""
$resultLines += $medNums | ForEach-Object { "REF: $($_.Value) | $($_.Line)" }
$resultLines | Out-File $resultPath -Encoding UTF8
Write-Host "`n  Resultats sauvegardes: $resultPath" -ForegroundColor Green

Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  FIN" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan
