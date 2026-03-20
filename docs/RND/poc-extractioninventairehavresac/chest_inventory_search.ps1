$spyPath = "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu_spy.log"

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  RECHERCHE INVENTAIRE INITIAL" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

# Chercher TOUS les csf avec AddItemOperation dans tout le log
Write-Host ""
Write-Host "=== Tous les AddItemOperation ===" -ForegroundColor Green
$results = Select-String -Path $spyPath -Pattern "\{(\d{10,})=AddItemOperation\{m_refId=(\d+), m_qty=(\d+)"
Write-Host "  $($results.Count) AddItemOperation trouves" -ForegroundColor Yellow
$uidMap = @{}
foreach ($r in $results) {
    if ($r.Line -match "\{(\d{10,})=AddItemOperation\{m_refId=(\d+), m_qty=(\d+)") {
        $uidMap[$Matches[1]] = [int]$Matches[2]
    }
}
Write-Host "  $($uidMap.Count) uniqueId->refId mappes" -ForegroundColor Yellow

# Chercher les uniqueId des depots qu'on a vus
Write-Host ""
Write-Host "=== Test des UID de depots ===" -ForegroundColor Cyan
$depotUids = @("1468951001703645351", "1470358108487286852", "1470358070654665271")
foreach ($uid in $depotUids) {
    if ($uidMap.ContainsKey($uid)) {
        Write-Host "  $uid => refId=$($uidMap[$uid])" -ForegroundColor Green
    } else {
        Write-Host "  $uid => JAMAIS VU dans AddItemOperation" -ForegroundColor Red
    }
}

# Chercher le message d'inventaire initial (gros csf au login)
Write-Host ""
Write-Host "=== Messages csf avec PLUSIEURS items ===" -ForegroundColor Cyan
$bigCsf = Select-String -Path $spyPath -Pattern "Discarded inbound message csf@.*AddItemOperation.*AddItemOperation"
Write-Host "  $($bigCsf.Count) messages csf avec 2+ items" -ForegroundColor Yellow
$bigCsf | Select-Object -First 3 | ForEach-Object {
    $ts = ""; if ($_.Line -match "^.{5} ([\d:,]+)") { $ts = $Matches[1] }
    $nbItems = ([regex]::Matches($_.Line, "AddItemOperation")).Count
    Write-Host "  [$ts] $nbItems items dans ce csf" -ForegroundColor White
}

# Chercher un message massif d'inventaire
Write-Host ""
Write-Host "=== Plus gros messages Netty (par taille) ===" -ForegroundColor Cyan
$allMessages = Select-String -Path $spyPath -Pattern "Discarded inbound message \w+@"
$sorted = $allMessages | Sort-Object { $_.Line.Length } -Descending | Select-Object -First 10
foreach ($msg in $sorted) {
    $ts = ""; if ($msg.Line -match "^.{5} ([\d:,]+)") { $ts = $Matches[1] }
    $type = ""; if ($msg.Line -match "message (\w+)@") { $type = $Matches[1] }
    Write-Host "  [$ts] $type ($($msg.Line.Length) chars)" -ForegroundColor White
}

# Chercher la ligne avec l'objet qu'on vient de deposer (bol=-3)
# Le bol est negatif pour les depots. Peut-etre le refId est dans csF juste avant?
Write-Host ""
Write-Host "=== Contenu COMPLET des csF (chargement coffre) ===" -ForegroundColor Cyan
$csFs = Select-String -Path $spyPath -Pattern "Discarded inbound message csF@"
Write-Host "  $($csFs.Count) messages csF au total" -ForegroundColor Yellow
$csFs | Select-Object -Last 5 | ForEach-Object {
    $ts = ""; if ($_.Line -match "^.{5} ([\d:,]+)") { $ts = $Matches[1] }
    Write-Host "  [$ts] $($_.Line.Substring($_.Line.IndexOf('csF@'), [Math]::Min(500, $_.Line.Length - $_.Line.IndexOf('csF@'))))" -ForegroundColor Gray
}
