$niveauActuel = [int](Read-Host "Quel est ton niveau actuel dans le jeu")
$logsDir = Join-Path $env:APPDATA "zaap\gamesLogs\wakfu\logs"
$pat = "(?i)\[Information \(combat\)\]\s+(.+?)\s*:\s*\+([\d\s]+)\s+points d'XP\.(.*?)Prochain niveau dans\s*:\s*([\d\s]+)\."

$fichiers = @("wakfu_chat.log.2","wakfu_chat.log.1","wakfu_chat.log") |
    ForEach-Object { Join-Path $logsDir $_ } | Where-Object { Test-Path $_ }

$character  = $null
$levelLog   = @()
$gainsLogs  = 0   # total des gains dans les logs, pour calculer le niveau de départ

Write-Host "Scan historique..." -ForegroundColor DarkGray

foreach ($f in $fichiers) {
    $dateAncre = (Get-Item $f).LastWriteTime.ToString("dd/MM/yy")  # fallback si pas d'ancre dans le fichier
    Get-Content $f | ForEach-Object {
        # Ancre de date : "(16/3/26)" dans les lignes "nous sommes le..."
        if ($_ -match "\((\d{1,2}/\d{1,2}/\d{2})\)") {
            $script:dateAncre = $Matches[1]
            return
        }
        if ($_ -notmatch $pat) { return }
        $entity  = $Matches[1].Trim()
        $middle  = $Matches[3]
        $rem     = [int64]($Matches[4] -replace "\s","")
        $ts      = if ($_ -match "(\d{2}:\d{2}:\d{2})") { $Matches[1] } else { "??" }
        $lvlGain = if ($middle -match "\+(\d+) niveau") { [int]$Matches[1] } else { 0 }
        if ($lvlGain -eq 0) { return }
        if ($null -eq $script:character) { $script:character = $entity }
        if ($entity -ne $script:character) { return }
        $script:gainsLogs += $lvlGain
        $script:levelLog  += @{ niveau=0; heure="$($script:dateAncre) $ts"; xpNiveau=$rem; gain=$lvlGain }
    }
}

# Recalcule les numéros de niveau depuis le niveau actuel connu
$niveauDepart = $niveauActuel - $gainsLogs
$n = $niveauDepart
foreach ($r in $levelLog) { $n += $r.gain; $r.niveau = $n }
$niveau = $niveauActuel

Write-Host "Perso : $character  |  Niveau actuel : $niveau  (avant logs : $niveauDepart)" -ForegroundColor Magenta
Write-Host ""
Write-Host "  Niv   Passe a            XP niveau    Ratio" -ForegroundColor DarkYellow
$prev = $null
foreach ($r in $levelLog) {
    $ratio = if ($prev -and $prev.xpNiveau -gt 0) { "x{0:F2}" -f ($r.xpNiveau/$prev.xpNiveau) } else { "---" }
    Write-Host ("  {0,-5} {1,-18}  {2,-12} {3}" -f $r.niveau, $r.heure, ("{0:N0}"-f$r.xpNiveau), $ratio) -ForegroundColor Yellow
    $prev = $r
}
Write-Host ""
Write-Host "En attente de nouveaux combats..." -ForegroundColor Cyan

$xpHist = @()

Get-Content (Join-Path $logsDir "wakfu_chat.log") -Wait -Tail 0 | ForEach-Object {
    if ($_ -notmatch $pat) { return }
    $entity    = $Matches[1].Trim()
    $xpGained  = [int64]($Matches[2] -replace "\s","")
    $middle    = $Matches[3]
    $remaining = [int64]($Matches[4] -replace "\s","")
    $ts        = if ($_ -match "(\d{2}:\d{2}:\d{2})") { $Matches[1] } else { "??" }
    $lvlGain   = if ($middle -match "\+(\d+) niveau") { [int]$Matches[1] } else { 0 }
    if ($entity -ne $character) { return }

    $now = Get-Date
    $script:xpHist += @{ time=$now; remaining=$remaining }
    if ($xpHist.Count -gt 8) { $script:xpHist = $xpHist[-8..-1] }

    $eta = "---"
    if ($xpHist.Count -ge 2) {
        $elapsed = ($xpHist[-1].time - $xpHist[0].time).TotalSeconds
        $done    = $xpHist[0].remaining - $xpHist[-1].remaining
        if ($elapsed -gt 0 -and $done -gt 0) {
            $eta = [TimeSpan]::FromSeconds($remaining / ($done / $elapsed)).ToString("hh\:mm\:ss")
        }
    }

    if ($lvlGain -gt 0) {
        $script:niveau += $lvlGain
        $script:levelLog += @{ niveau=$script:niveau; heure=(Get-Date).ToString("dd/MM HH:mm:ss"); xpNiveau=$remaining }
        Write-Host ""
        Write-Host "  NIVEAU $($script:niveau)  [$ts]  ETA suivant : $eta" -ForegroundColor Yellow
        Write-Host "  Niv   Passe a            XP niveau    Ratio" -ForegroundColor DarkYellow
        $prev2 = $null
        foreach ($r in $script:levelLog) {
            $ratio = if ($prev2 -and $prev2.xpNiveau -gt 0) { "x{0:F2}" -f ($r.xpNiveau/$prev2.xpNiveau) } else { "---" }
            Write-Host ("  {0,-5} {1,-18}  {2,-12} {3}" -f $r.niveau, $r.heure, ("{0:N0}"-f$r.xpNiveau), $ratio) -ForegroundColor Yellow
            $prev2 = $r
        }
        Write-Host ""
    }

    $color = if ($lvlGain -gt 0) { "Yellow" } else { "Cyan" }
    Write-Host ("{0}  +{1,-10} XP  Reste:{2,-12} ETA:{3}" -f $ts, ("{0:N0}"-f$xpGained), ("{0:N0}"-f$remaining), $eta) -ForegroundColor $color
}
