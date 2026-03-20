# ============================================
#  HDV CAPTURE ETENDUE - MULTI ONGLETS
#  H:\Code\Wakfuassistant\docs\RND\poc-hdv\hdv_capture_extended.ps1
# ============================================

$spyPath = "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu_spy.log"
$outputDir = "H:\Code\Wakfuassistant\docs\RND\poc-hdv\output"

if (-not (Test-Path $outputDir)) {
    New-Item -ItemType Directory -Path $outputDir -Force | Out-Null
}

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  HDV CAPTURE ETENDUE" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan
Write-Host ""
Write-Host "  On va capturer chaque action separement." -ForegroundColor White
Write-Host "  Lancez Wakfu, allez au HDV." -ForegroundColor White
Write-Host ""

# Fonction de capture
function Capture-Action {
    param([string]$actionName, [string]$instructions)
    
    Write-Host "--------------------------------------------" -ForegroundColor Gray
    Write-Host "  ACTION: $actionName" -ForegroundColor Yellow
    Write-Host "  $instructions" -ForegroundColor White
    Read-Host "  ENTREE quand pret"
    
    $before = (Get-Item $spyPath).Length
    
    Write-Host "  >>> Faites l'action maintenant <<<" -ForegroundColor Cyan
    Read-Host "  ENTREE quand termine"
    
    $after = (Get-Item $spyPath).Length
    $delta = $after - $before
    
    # Lire les nouvelles lignes
    $stream = [System.IO.FileStream]::new($spyPath, [System.IO.FileMode]::Open, [System.IO.FileAccess]::Read, [System.IO.FileShare]::ReadWrite)
    $stream.Seek($before, [System.IO.SeekOrigin]::Begin) | Out-Null
    $reader = [System.IO.StreamReader]::new($stream, [System.Text.Encoding]::UTF8)
    $newContent = $reader.ReadToEnd()
    $reader.Close()
    $stream.Close()
    
    $newLines = $newContent -split "`n" | Where-Object { $_.Trim() -ne "" }
    
    # Filtrer bruit
    $useful = $newLines | Where-Object {
        $_ -notmatch "\(fHq:" -and $_ -notmatch "\(aHu:" -and $_ -notmatch "voices in use" -and $_ -notmatch "GuildChangeMessage"
    }
    
    # Compter types Netty
    $types = @{}
    foreach ($line in $useful) {
        if ($line -match "Discarded inbound message (\w+)@") {
            $t = $Matches[1]
            if (-not $types.ContainsKey($t)) { $types[$t] = 0 }
            $types[$t]++
        }
    }
    
    Write-Host "  +$delta octets, $($useful.Count) lignes utiles" -ForegroundColor Green
    
    $knownNonHDV = @("NM","NS","cvn","GuildChangeMessage","crV","coR","coe","coNN","col","coj","cvJ")
    
    foreach ($entry in ($types.GetEnumerator() | Sort-Object Value -Descending)) {
        $color = if ($entry.Key -in $knownNonHDV) { "DarkGray" } else { "Green" }
        Write-Host "    $($entry.Key) x$($entry.Value)" -ForegroundColor $color
    }
    
    # Sauvegarder
    $savePath = "$outputDir\hdv_$($actionName -replace '\s','_').txt"
    $useful | Out-File $savePath -Encoding UTF8
    Write-Host "  Sauvegarde: $savePath" -ForegroundColor Gray
    
    # Chercher refId et prix
    $refIds = @()
    $prices = @()
    foreach ($line in $useful) {
        if ($line -match "m_refId=(\d+)") { $refIds += $Matches[1] }
        if ($line -match "meu=(\d+)") { $prices += "solde=$($Matches[1])" }
        if ($line -match "maH=(\w+)") { $prices += "confirm=$($Matches[1])" }
    }
    if ($refIds.Count -gt 0) { Write-Host "    refId: $($refIds -join ', ')" -ForegroundColor Green }
    if ($prices.Count -gt 0) { Write-Host "    prix/solde: $($prices -join ', ')" -ForegroundColor Yellow }
    
    Write-Host ""
    return $useful
}

# --- CAPTURES SEQUENTIELLES ---

Write-Host ""
Write-Host "  ETAPE 1: OUVRIR LE HDV" -ForegroundColor Magenta
$r1 = Capture-Action "01_ouvrir_hdv" "Ouvrez le HDV (cliquez sur le PNJ)"

Write-Host "  ETAPE 2: ONGLET RECHERCHER - PAGE 1" -ForegroundColor Magenta
$r2 = Capture-Action "02_rechercher_page1" "Restez sur l'onglet Rechercher, regardez la page 1"

Write-Host "  ETAPE 3: ALLER PAGE 2" -ForegroundColor Magenta
$r3 = Capture-Action "03_page2" "Cliquez sur la fleche pour aller a la page 2"

Write-Host "  ETAPE 4: ALLER PAGE 3" -ForegroundColor Magenta
$r4 = Capture-Action "04_page3" "Cliquez sur la fleche pour aller a la page 3"

Write-Host "  ETAPE 5: ONGLET OFFRES D'ACHAT" -ForegroundColor Magenta
$r5 = Capture-Action "05_offres_achat" "Cliquez sur l'onglet Offres d'achat"

Write-Host "  ETAPE 6: ONGLET MES OFFRES" -ForegroundColor Magenta
$r6 = Capture-Action "06_mes_offres" "Cliquez sur l'onglet Mes offres"

Write-Host "  ETAPE 7: RECUPERER KAMAS" -ForegroundColor Magenta
$r7 = Capture-Action "07_recuperer_kamas" "Cliquez sur Recuperer 26991 K"

Write-Host "  ETAPE 8: ONGLET HISTORIQUE" -ForegroundColor Magenta
$r8 = Capture-Action "08_historique" "Cliquez sur l'onglet Historique"

Write-Host ""
Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  CAPTURE TERMINEE" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  Fichiers sauvegardes dans: $outputDir" -ForegroundColor Green
Write-Host "  Prochaine etape: analyser chaque capture" -ForegroundColor Yellow
Write-Host "============================================" -ForegroundColor Cyan