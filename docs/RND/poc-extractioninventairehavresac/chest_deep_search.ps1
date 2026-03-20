$spyPath = "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu_spy.log"

Write-Host "=== ANALYSE DES GROS MESSAGES (inventaire initial) ===" -ForegroundColor Cyan

# 1. Regarder csS (potentiellement Storage Sync = inventaire)
Write-Host ""
Write-Host "--- Messages csS ---" -ForegroundColor Green
$csS = Select-String -Path $spyPath -Pattern "Discarded inbound message csS@"
Write-Host "  $($csS.Count) messages csS" -ForegroundColor Yellow
foreach ($msg in $csS) {
    $ts = ""; if ($msg.Line -match "^.{5} ([\d:,]+)") { $ts = $Matches[1] }
    Write-Host "  [$ts] $($msg.Line.Length) chars" -ForegroundColor White
    
    # Chercher nos UID dedans
    if ($msg.Line -match "1468951001703645351") { Write-Host "    CONTIENT UID depot 1 !" -ForegroundColor Red }
    if ($msg.Line -match "1470358108487286852") { Write-Host "    CONTIENT UID depot 2 !" -ForegroundColor Red }
    if ($msg.Line -match "1470358070654665271") { Write-Host "    CONTIENT UID depot 3 !" -ForegroundColor Red }
    
    # Chercher des refId connus
    if ($msg.Line -match "m_refId") { Write-Host "    CONTIENT m_refId !" -ForegroundColor Red }
    if ($msg.Line -match "AddItemOperation") { Write-Host "    CONTIENT AddItemOperation !" -ForegroundColor Red }
    
    # Afficher les 500 premiers chars du contenu
    $start = $msg.Line.IndexOf("csS@")
    if ($start -ge 0) {
        $extrait = $msg.Line.Substring($start, [Math]::Min(800, $msg.Line.Length - $start))
        Write-Host "    $extrait" -ForegroundColor Gray
    }
}

# 2. Regarder csn (inventaire ?)
Write-Host ""
Write-Host "--- Messages csn ---" -ForegroundColor Green
$csn = Select-String -Path $spyPath -Pattern "Discarded inbound message csn@"
foreach ($msg in $csn) {
    $ts = ""; if ($msg.Line -match "^.{5} ([\d:,]+)") { $ts = $Matches[1] }
    Write-Host "  [$ts] $($msg.Line.Length) chars" -ForegroundColor White
    $start = $msg.Line.IndexOf("csn@")
    if ($start -ge 0) {
        $extrait = $msg.Line.Substring($start, [Math]::Min(800, $msg.Line.Length - $start))
        Write-Host "    $extrait" -ForegroundColor Gray
    }
}

# 3. Regarder ctE (le plus gros message)
Write-Host ""
Write-Host "--- Messages ctE (72k chars) ---" -ForegroundColor Green
$ctE = Select-String -Path $spyPath -Pattern "Discarded inbound message ctE@"
Write-Host "  $($ctE.Count) messages ctE" -ForegroundColor Yellow
foreach ($msg in ($ctE | Select-Object -First 1)) {
    if ($msg.Line -match "1468951001703645351") { Write-Host "    CONTIENT UID depot 1 !" -ForegroundColor Red }
    if ($msg.Line -match "1470358108487286852") { Write-Host "    CONTIENT UID depot 2 !" -ForegroundColor Red }
    
    # Extraire les premiers 1000 chars
    $start = $msg.Line.IndexOf("ctE@")
    if ($start -ge 0) {
        $extrait = $msg.Line.Substring($start, [Math]::Min(1000, $msg.Line.Length - $start))
        Write-Host "    $extrait" -ForegroundColor Gray
    }
}

# 4. Chercher PARTOUT dans le spy les UID de depot
Write-Host ""
Write-Host "--- Recherche UID 1468951001703645351 dans TOUT le log ---" -ForegroundColor Green
$found = Select-String -Path $spyPath -Pattern "1468951001703645351"
Write-Host "  $($found.Count) occurrences" -ForegroundColor Yellow
foreach ($f in $found) {
    $ts = ""; if ($f.Line -match "^.{5} ([\d:,]+)") { $ts = $Matches[1] }
    $type = ""; if ($f.Line -match "message (\w+)@") { $type = $Matches[1] }
    Write-Host "  [$ts] dans message $type" -ForegroundColor White
}

Write-Host ""
Write-Host "--- Recherche UID 1470358108487286852 dans TOUT le log ---" -ForegroundColor Green
$found2 = Select-String -Path $spyPath -Pattern "1470358108487286852"
Write-Host "  $($found2.Count) occurrences" -ForegroundColor Yellow
foreach ($f in $found2) {
    $ts = ""; if ($f.Line -match "^.{5} ([\d:,]+)") { $ts = $Matches[1] }
    $type = ""; if ($f.Line -match "message (\w+)@") { $type = $Matches[1] }
    Write-Host "  [$ts] dans message $type" -ForegroundColor White
}
