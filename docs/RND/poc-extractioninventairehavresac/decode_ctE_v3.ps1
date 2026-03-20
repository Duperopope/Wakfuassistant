# ============================================
#  DECODEUR ctE v3 - SCAN BIG-ENDIAN + STRUCTURE
#  H:\Code\Wakfuassistant\docs\RND\poc-extractioninventairehavresac\decode_ctE_v3.ps1
# ============================================

$spyPath = "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu_spy.log"
$outputDir = "H:\Code\Wakfuassistant\docs\RND\poc-extractioninventairehavresac\output"

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  DECODEUR ctE v3 - SCAN BRUT" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

# Extraire miv
$ctE_lines = Select-String -Path $spyPath -Pattern "Discarded inbound message ctE@"
$biggest = $null
$biggestLen = 0
foreach ($match in $ctE_lines) {
    if ($match.Line.Length -gt $biggestLen) {
        $biggestLen = $match.Line.Length
        $biggest = $match.Line
    }
}

$arrayContent = ""
if ($biggest -match "miv=\[([^\]]+)\]") {
    $arrayContent = $Matches[1]
}

$signedBytes = $arrayContent -split ",\s*" | ForEach-Object { [int]$_.Trim() }
$bytes = [byte[]]::new($signedBytes.Count)
for ($i = 0; $i -lt $signedBytes.Count; $i++) {
    if ($signedBytes[$i] -lt 0) {
        $bytes[$i] = [byte](256 + $signedBytes[$i])
    } else {
        $bytes[$i] = [byte]$signedBytes[$i]
    }
}

Write-Host "  $($bytes.Count) octets" -ForegroundColor Green

# --- SCAN BRUT POUR LES UNIQUEID CONNUS (du csS) ---
Write-Host "`n=== SCAN BRUT UNIQUEID CONNUS ===" -ForegroundColor Yellow

$knownUids = @(
    1468669294429602781,
    1470076891930034303,
    1470076891477049445,
    1469795416315789410,
    1470076891745485407,
    1470076892483682697,
    1469795416433229825,
    1469795416584224825,
    1469794946285306304,
    1469794946167866249
)

foreach ($uid in $knownUids) {
    $uidBytesLE = [BitConverter]::GetBytes([long]$uid)
    $uidBytesBE = [BitConverter]::GetBytes([long]$uid)
    [Array]::Reverse($uidBytesBE)

    # Chercher LE
    for ($i = 0; $i -lt $bytes.Count - 7; $i++) {
        $match = $true
        for ($j = 0; $j -lt 8; $j++) {
            if ($bytes[$i + $j] -ne $uidBytesLE[$j]) { $match = $false; break }
        }
        if ($match) {
            Write-Host "  uid=$uid TROUVE LE a offset $i" -ForegroundColor Green
            # Contexte autour
            $ctxStart = [Math]::Max(0, $i - 8)
            $ctxEnd = [Math]::Min($bytes.Count, $i + 16)
            $ctx = ($bytes[$ctxStart..($ctxEnd-1)] | ForEach-Object { $_.ToString("X2") }) -join " "
            Write-Host "    contexte: $ctx" -ForegroundColor Gray
        }
    }

    # Chercher BE
    for ($i = 0; $i -lt $bytes.Count - 7; $i++) {
        $match = $true
        for ($j = 0; $j -lt 8; $j++) {
            if ($bytes[$i + $j] -ne $uidBytesBE[$j]) { $match = $false; break }
        }
        if ($match) {
            Write-Host "  uid=$uid TROUVE BE a offset $i" -ForegroundColor Green
            $ctxStart = [Math]::Max(0, $i - 8)
            $ctxEnd = [Math]::Min($bytes.Count, $i + 16)
            $ctx = ($bytes[$ctxStart..($ctxEnd-1)] | ForEach-Object { $_.ToString("X2") }) -join " "
            Write-Host "    contexte: $ctx" -ForegroundColor Gray
        }
    }
}

# --- SCAN BRUT POUR LES REFID CONNUS ---
Write-Host "`n=== SCAN BRUT REFID CONNUS ===" -ForegroundColor Yellow

$knownRefIds = @{
    2037="Epee du Tofu"; 9430="Dague de Boisaille"; 26396="Cape de Sakuya"
    26835="Bague Hou"; 12438="Anneau Craquele"; 12284="Poudre Osamodas"
    13638="Croutons"; 2340="Seau d eau"; 29718="Incantation Feca"
    25832="Epee Poutreuse"; 25012="Sifli a Iop"
    11441="Chataigne"; 27050="Poils Pandissidan"; 21122="Sioupere-Glou"
}

foreach ($ref in $knownRefIds.Keys) {
    $refVal = [int]$ref

    # En int16 LE/BE
    if ($refVal -le 65535) {
        $ref16LE = [BitConverter]::GetBytes([int16]$refVal)
        $ref16BE = [BitConverter]::GetBytes([int16]$refVal)
        [Array]::Reverse($ref16BE)

        for ($i = 0; $i -lt $bytes.Count - 1; $i++) {
            if ($bytes[$i] -eq $ref16BE[0] -and $bytes[$i+1] -eq $ref16BE[1]) {
                # Verifier que c'est pas du bruit (bytes avant/apres doivent etre raisonnables)
                $before = if ($i -gt 0) { $bytes[$i-1] } else { 0 }
                $after = if ($i+2 -lt $bytes.Count) { $bytes[$i+2] } else { 0 }
                # On ne reporte que si entouré de petites valeurs
                if ($before -lt 20 -or $after -lt 20) {
                    Write-Host "  refId=$ref ($($knownRefIds[[string]$ref])) TROUVE int16BE a offset $i" -ForegroundColor Green
                    $ctxStart = [Math]::Max(0, $i - 4)
                    $ctxEnd = [Math]::Min($bytes.Count, $i + 6)
                    $ctx = ($bytes[$ctxStart..($ctxEnd-1)] | ForEach-Object { $_.ToString("X2") }) -join " "
                    Write-Host "    contexte: $ctx" -ForegroundColor Gray
                }
            }
        }
    }

    # En int32 LE/BE
    $ref32LE = [BitConverter]::GetBytes([int32]$refVal)
    $ref32BE = [BitConverter]::GetBytes([int32]$refVal)
    [Array]::Reverse($ref32BE)

    for ($i = 0; $i -lt $bytes.Count - 3; $i++) {
        $matchLE = $true
        $matchBE = $true
        for ($j = 0; $j -lt 4; $j++) {
            if ($bytes[$i+$j] -ne $ref32LE[$j]) { $matchLE = $false }
            if ($bytes[$i+$j] -ne $ref32BE[$j]) { $matchBE = $false }
        }
        if ($matchLE) {
            Write-Host "  refId=$ref ($($knownRefIds[[string]$ref])) TROUVE int32LE a offset $i" -ForegroundColor Green
            $ctxStart = [Math]::Max(0, $i - 4)
            $ctxEnd = [Math]::Min($bytes.Count, $i + 8)
            $ctx = ($bytes[$ctxStart..($ctxEnd-1)] | ForEach-Object { $_.ToString("X2") }) -join " "
            Write-Host "    contexte: $ctx" -ForegroundColor Gray
        }
        if ($matchBE) {
            Write-Host "  refId=$ref ($($knownRefIds[[string]$ref])) TROUVE int32BE a offset $i" -ForegroundColor Green
            $ctxStart = [Math]::Max(0, $i - 4)
            $ctxEnd = [Math]::Min($bytes.Count, $i + 8)
            $ctx = ($bytes[$ctxStart..($ctxEnd-1)] | ForEach-Object { $_.ToString("X2") }) -join " "
            Write-Host "    contexte: $ctx" -ForegroundColor Gray
        }
    }
}

# --- SCAN BRUT POUR LES UID DE DEPOTS ---
Write-Host "`n=== SCAN BRUT UID DEPOTS ===" -ForegroundColor Yellow

$depotUids = @(1470358329912983798, 1470358066242257617, 1470358188564939153)
foreach ($uid in $depotUids) {
    $uidBytesLE = [BitConverter]::GetBytes([long]$uid)
    $uidBytesBE = [BitConverter]::GetBytes([long]$uid)
    [Array]::Reverse($uidBytesBE)

    for ($i = 0; $i -lt $bytes.Count - 7; $i++) {
        $matchLE = $true
        $matchBE = $true
        for ($j = 0; $j -lt 8; $j++) {
            if ($bytes[$i+$j] -ne $uidBytesLE[$j]) { $matchLE = $false }
            if ($bytes[$i+$j] -ne $uidBytesBE[$j]) { $matchBE = $false }
        }
        if ($matchLE) {
            Write-Host "  DEPOT uid=$uid TROUVE LE a offset $i" -ForegroundColor Red
        }
        if ($matchBE) {
            Write-Host "  DEPOT uid=$uid TROUVE BE a offset $i" -ForegroundColor Red
        }
    }
    if (-not $matchLE -and -not $matchBE) {
        Write-Host "  DEPOT uid=$uid absent du ctE" -ForegroundColor DarkGray
    }
}

Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  FIN SCAN BRUT" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan
