# ============================================
#  RECHERCHE PRIX BRUT DANS LES CAPTURES HDV
#  H:\Code\Wakfuassistant\docs\RND\poc-hdv\hdv_find_price.ps1
# ============================================

$outputDir = "H:\Code\Wakfuassistant\docs\RND\poc-hdv\output"

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  RECHERCHE DU PRIX DANS LES MESSAGES HDV" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

# Prix connus de tes screenshots (Mes offres)
# Critique Berserk II = 105569
# Serpe Aisk = 49999
# Tabouret de Sufokia = 495
# Kalypsor = 237409
# Orbe Rustique = 91
# Orbe Durable = 80
# Orbe Mystique = 75

$knownPrices = @(105569, 49999, 495, 237409, 91, 80, 75, 6500000, 6499999, 6499998, 6499996, 6499995, 1001, 1501, 8001, 6001, 4001, 2001, 5)

Write-Host "`n  Prix recherches: $($knownPrices -join ', ')" -ForegroundColor Yellow

# Chercher dans TOUS les fichiers de capture
$captureFiles = Get-ChildItem "$outputDir\hdv_*.txt" -File

foreach ($file in $captureFiles) {
    $content = Get-Content $file.FullName -Raw
    $found = @()
    
    foreach ($price in $knownPrices) {
        # Chercher en texte brut
        if ($content -match "(?<!\d)$price(?!\d)") {
            $found += $price
        }
    }
    
    if ($found.Count -gt 0) {
        Write-Host "`n  $($file.Name) : PRIX TROUVES = $($found -join ', ')" -ForegroundColor Green
        
        # Montrer le contexte
        foreach ($price in $found) {
            $lines = Get-Content $file.FullName
            foreach ($line in $lines) {
                if ($line -match "(?<!\d)$price(?!\d)") {
                    $short = if ($line.Length -gt 150) { $line.Substring(0, 150) + "..." } else { $line }
                    Write-Host "    $price => $short" -ForegroundColor Yellow
                }
            }
        }
    }
}

# Chercher aussi dans les bytes protobuf des coy/cwj
Write-Host "`n=== RECHERCHE DANS LES BYTES PROTOBUF ===" -ForegroundColor Yellow

$capture1 = "$outputDir\hdv_capture.txt"
if (Test-Path $capture1) {
    $lines = Get-Content $capture1
    
    foreach ($line in $lines) {
        # Extraire les tableaux de bytes
        $arrays = [regex]::Matches($line, "(\w+)=\[([^\]]+)\]")
        foreach ($a in $arrays) {
            $fname = $a.Groups[1].Value
            $fval = $a.Groups[2].Value
            
            if ($fval -notmatch "^[\d\s,\-]+$") { continue }
            
            try {
                $signedBytes = $fval -split ",\s*" | ForEach-Object { [int]$_.Trim() }
                $byteArr = [byte[]]::new($signedBytes.Count)
                for ($i = 0; $i -lt $signedBytes.Count; $i++) {
                    if ($signedBytes[$i] -lt 0) { $byteArr[$i] = [byte](256 + $signedBytes[$i]) }
                    else { $byteArr[$i] = [byte]$signedBytes[$i] }
                }
                
                # Chercher chaque prix en int32 LE et BE
                foreach ($price in $knownPrices) {
                    if ($price -gt [int]::MaxValue) { continue }
                    
                    $le = [BitConverter]::GetBytes([int]$price)
                    $be = [BitConverter]::GetBytes([int]$price)
                    [Array]::Reverse($be)
                    
                    for ($i = 0; $i -lt $byteArr.Count - 3; $i++) {
                        $matchLE = $true; $matchBE = $true
                        for ($j = 0; $j -lt 4; $j++) {
                            if ($byteArr[$i+$j] -ne $le[$j]) { $matchLE = $false }
                            if ($byteArr[$i+$j] -ne $be[$j]) { $matchBE = $false }
                        }
                        if ($matchLE) {
                            $ts = ""; if ($line -match "^.{5} ([\d:,]+)") { $ts = $Matches[1] }
                            $msgType = ""; if ($line -match "message (\w+)@") { $msgType = $Matches[1] }
                            Write-Host "  PRIX $price TROUVE int32LE dans $msgType.$fname offset=$i [$ts]" -ForegroundColor Green
                        }
                        if ($matchBE) {
                            $ts = ""; if ($line -match "^.{5} ([\d:,]+)") { $ts = $Matches[1] }
                            $msgType = ""; if ($line -match "message (\w+)@") { $msgType = $Matches[1] }
                            Write-Host "  PRIX $price TROUVE int32BE dans $msgType.$fname offset=$i [$ts]" -ForegroundColor Green
                        }
                    }
                    
                    # Aussi en varint protobuf
                    $varintBytes = @()
                    $val = [long]$price
                    do {
                        $b = $val -band 0x7F
                        $val = $val -shr 7
                        if ($val -gt 0) { $b = $b -bor 0x80 }
                        $varintBytes += [byte]$b
                    } while ($val -gt 0)
                    
                    if ($varintBytes.Count -le $byteArr.Count) {
                        for ($i = 0; $i -lt $byteArr.Count - $varintBytes.Count + 1; $i++) {
                            $matchV = $true
                            for ($j = 0; $j -lt $varintBytes.Count; $j++) {
                                if ($byteArr[$i+$j] -ne $varintBytes[$j]) { $matchV = $false; break }
                            }
                            if ($matchV) {
                                # Verifier que le byte avant est un tag protobuf valide (field << 3 | wiretype)
                                $beforeByte = if ($i -gt 0) { $byteArr[$i-1] } else { 0 }
                                $wireType = $beforeByte -band 0x07
                                if ($wireType -eq 0 -and $beforeByte -gt 0) {
                                    $ts = ""; if ($line -match "^.{5} ([\d:,]+)") { $ts = $Matches[1] }
                                    $msgType = ""; if ($line -match "message (\w+)@") { $msgType = $Matches[1] }
                                    $fieldNum = $beforeByte -shr 3
                                    Write-Host "  PRIX $price TROUVE varint dans $msgType.$fname offset=$i (field=$fieldNum) [$ts]" -ForegroundColor Green
                                }
                            }
                        }
                    }
                }
            } catch { }
        }
    }
}

# Aussi chercher dans les captures etendues (mes offres)
Write-Host "`n=== RECHERCHE DANS MES OFFRES ===" -ForegroundColor Yellow
$mesOffres = "$outputDir\hdv_06_mes_offres.txt"
if (Test-Path $mesOffres) {
    $lines = Get-Content $mesOffres
    foreach ($line in $lines) {
        if ($line -match "Discarded inbound message cmm@\w+\{(.+)\}\s*that") {
            $contenu = $Matches[1]
            Write-Host "  cmm contenu ($($contenu.Length) chars):" -ForegroundColor Cyan
            if ($contenu.Length -lt 50) {
                Write-Host "    $contenu" -ForegroundColor White
                Write-Host "    (trop court - protobuf toString casse?)" -ForegroundColor Red
            } else {
                Write-Host "    $($contenu.Substring(0, [Math]::Min(200, $contenu.Length)))..." -ForegroundColor Gray
            }
        }
    }
}

Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  FIN RECHERCHE PRIX" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan
