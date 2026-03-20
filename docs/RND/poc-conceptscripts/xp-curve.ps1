param(
    [string]$CsvPath = "h:\Code\Wakfuassistant\docs\RND\poc-database\courbexp230.csv"
)

# ── Détection du personnage ───────────────────────────────────
$wakfuWindow = Get-Process | Where-Object { $_.MainWindowTitle -match "- WAKFU$" } | Select-Object -First 1
if ($null -eq $wakfuWindow) {
    Write-Host "ERREUR : aucune fenetre WAKFU detectee." -ForegroundColor Red; exit 1
}
$character = ($wakfuWindow.MainWindowTitle -replace "\s*-\s*WAKFU$","").Trim()
$niveauActuel = [int](Read-Host "Niveau actuel de $character")

# ── Chargement du CSV ─────────────────────────────────────────
# CSV : Niveau N = XP pour passer du niveau N-1 au niveau N
# Donc pour un joueur AU niveau X, la barre affiche CSV[X+1]
$xpCurve = @{}
Import-Csv $CsvPath | ForEach-Object {
    $xpCurve[[int]$_.Niveau] = [int64]$_.XP_pour_ce_niveau
}

function Get-XpNiveau($lvl) {
    # XP de la barre quand on EST au niveau lvl = XP pour atteindre lvl+1
    return $xpCurve[$lvl + 1]
}
function Get-NiveauTag($lvl) {
    if ($lvl -le 190)  { return "CSV" }
    if ($lvl -le 230)  { return "?" }
    return "inconnu"
}

# ── Scan historique ───────────────────────────────────────────
$logsDir  = Join-Path $env:APPDATA "zaap\gamesLogs\wakfu\logs"
$pat      = "(?i)\[Information \(combat\)\]\s+(.+?)\s*:\s*\+([\d\s]+)\s+points d'XP\.(.*?)Prochain niveau dans\s*:\s*([\d\s]+)\."
$fichiers = @("wakfu_chat.log.2","wakfu_chat.log.1","wakfu_chat.log") |
    ForEach-Object { Join-Path $logsDir $_ } | Where-Object { Test-Path $_ }

$levelLog  = @()
$gainsLogs = 0
$dateAncre = $null
$prevLogTs = $null

Write-Host "Scan historique..." -ForegroundColor DarkGray

foreach ($f in $fichiers) {
    Get-Content $f | ForEach-Object {
        if ($_ -match "\((\d{1,2})/(\d{1,2})/(\d{2})\)") {
            $script:dateAncre = "{0:D2}/{1:D2}/{2}" -f [int]$Matches[1],[int]$Matches[2],$Matches[3]
            $script:prevLogTs = $null; return
        }
        if ($_ -notmatch $pat) { return }
        $entity  = $Matches[1].Trim()
        $middle  = $Matches[3]
        $rem     = [int64]($Matches[4] -replace "\s","")
        $ts      = if ($_ -match "(\d{2}:\d{2}:\d{2})") { $Matches[1] } else { $null }
        $lvlGain = if ($middle -match "\+(\d+) niveau") { [int]$Matches[1] } else { 0 }
        if ($lvlGain -eq 0 -or $entity -ne $script:character) { return }

        if ($null -ne $ts -and $null -ne $script:dateAncre -and $null -ne $script:prevLogTs) {
            if ([TimeSpan]::Parse($ts) -lt [TimeSpan]::Parse($script:prevLogTs)) {
                $script:dateAncre = ([datetime]::ParseExact($script:dateAncre,"dd/MM/yy",$null).AddDays(1)).ToString("dd/MM/yy")
            }
        }
        if ($null -ne $ts) { $script:prevLogTs = $ts }

        $dt    = $null
        $heure = if ($null -ne $script:dateAncre) { "$($script:dateAncre) $ts" } else { "??/??/?? $ts" }
        if ($null -ne $script:dateAncre -and $null -ne $ts) {
            try { $dt = [datetime]::ParseExact($heure,"dd/MM/yy HH:mm:ss",$null) } catch {}
        }
        $script:gainsLogs += $lvlGain
        $script:levelLog  += @{ niveau=0; heure=$heure; dt=$dt; xpNiveau=0; gain=$lvlGain; tag="log" }
    }
}

# Recalcule les numéros de niveau et XP depuis CSV
$niveauDepart = $niveauActuel - $gainsLogs
$n = $niveauDepart
foreach ($r in $levelLog) {
    $n += $r.gain; $r.niveau = $n
    $csvVal = Get-XpNiveau $n
    if ($null -ne $csvVal) { $r.xpNiveau = $csvVal; $r.tag = Get-NiveauTag $n }
    else { $r.xpNiveau = 0; $r.tag = "inconnu" }
}

# Ligne "en cours" pour le niveau actuel
$xpEnCours = Get-XpNiveau $niveauActuel
$tagEnCours = Get-NiveauTag $niveauActuel
if ($null -eq $xpEnCours) {
    $xpEnCours = [int64]((Read-Host "XP totale du niveau $niveauActuel (inconnu dans le CSV)") -replace "\s","")
    $tagEnCours = "SAISI"
}
$levelLog += @{ niveau=$niveauActuel; heure="en cours"; dt=$null; xpNiveau=$xpEnCours; gain=0; tag=$tagEnCours }

# ── Affichage ─────────────────────────────────────────────────
function Show-LevelTable($rows) {
    Write-Host "  Niv   Passe a            Duree          XP niveau        Source" -ForegroundColor DarkYellow
    $prev = $null
    foreach ($r in $rows) {
        $duree = if ($prev -and $null -ne $prev.dt -and $null -ne $r.dt) {
            $s = [int]($r.dt - $prev.dt).TotalSeconds
            if ($s -lt 0) { "---" } elseif ($s -lt 3600) { "{0}m{1:D2}s" -f [int]($s/60),($s%60) }
            else { "{0}h{1:D2}m" -f [int]($s/3600),[int](($s%3600)/60) }
        } else { "---" }
        $xpStr = if ($r.xpNiveau -gt 0) { "{0:N0}" -f $r.xpNiveau } else { "???" }
        $color = switch ($r.tag) {
            "CSV"     { "Green" }
            "?"       { "Yellow" }
            "EXACT"   { "Cyan" }
            "SAISI"   { "Cyan" }
            default   { "DarkGray" }
        }
        Write-Host ("  {0,-5} {1,-18}  {2,-14} {3,-18} [{4}]" -f $r.niveau, $r.heure, $duree, $xpStr, $r.tag) -ForegroundColor $color
        $prev = $r
    }
}

Write-Host ""
Write-Host "Perso : $character  |  Niv : $niveauActuel  |  Avant logs : $niveauDepart  |  Level-ups : $gainsLogs" -ForegroundColor Magenta
Write-Host "  [CSV] confirme ≤190  [?] non confirme 191-230  [EXACT] calcule en live  [SAISI] entre manuellement" -ForegroundColor DarkGray
Write-Host ""
Show-LevelTable $levelLog
Write-Host ""
Write-Host "En attente de combats..." -ForegroundColor Cyan

# ── Temps réel ────────────────────────────────────────────────
$xpHist       = @()
$niveau        = $niveauActuel
$xpTotalActuel = $xpEnCours   # XP de la barre courante (depuis CSV ou saisie)

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
        $maintenant     = Get-Date
        $heureMaintenant = $maintenant.ToString("dd/MM/yy HH:mm:ss")

        # Carryover : avec CSV on connait le total exact du niveau suivant
        $totalNivSuivant = Get-XpNiveau $script:niveau
        $tagSuivant      = Get-NiveauTag $script:niveau
        if ($null -eq $totalNivSuivant) {
            # > 230 : on demande
            Write-Host "  Niveau $($script:niveau) inconnu dans le CSV." -ForegroundColor DarkYellow
            $totalNivSuivant = [int64]((Read-Host "  XP totale de ce niveau") -replace "\s","")
            $tagSuivant = "SAISI"
        }
        $carryover = $totalNivSuivant - $remaining

        # 191-230 : vérification
        if ((Get-NiveauTag $script:niveau) -eq "?") {
            Write-Host ("  Niv {0} : CSV dit {1:N0} XP, calcule {2:N0} XP (carryover={3:N0}). Correct ? (O/N)" -f `
                $script:niveau, $totalNivSuivant, $totalNivSuivant, $carryover) -ForegroundColor Yellow
            $rep = Read-Host "  "
            if ($rep -ne "O") {
                $totalNivSuivant = [int64]((Read-Host "  XP totale correcte") -replace "\s","")
                $tagSuivant = "SAISI"
            } else { $tagSuivant = "CSV-OK" }
        }

        $script:levelLog = @($script:levelLog | Where-Object { $_.heure -ne "en cours" })
        $script:levelLog += @{ niveau=$script:niveau; heure=$heureMaintenant; dt=$maintenant; xpNiveau=$script:xpTotalActuel; gain=$lvlGain; tag="EXACT" }
        $script:levelLog += @{ niveau=($script:niveau+1); heure="en cours"; dt=$null; xpNiveau=$totalNivSuivant; gain=0; tag=$tagSuivant }
        $script:xpTotalActuel = $totalNivSuivant

        Write-Host ""
        Write-Host ("  NIVEAU {0}  [{1}]  ETA suivant : {2}  |  Niv {3} total : {4:N0} XP [{5}]" -f `
            $script:niveau, $ts, $eta, ($script:niveau+1), $totalNivSuivant, $tagSuivant) -ForegroundColor Yellow
        Show-LevelTable $script:levelLog
        Write-Host ""
    }

    $color = if ($lvlGain -gt 0) { "Yellow" } else { "Cyan" }
    Write-Host ("{0}  +{1,-10} XP  Reste:{2,-12} ETA:{3}" -f $ts, ("{0:N0}"-f$xpGained), ("{0:N0}"-f$remaining), $eta) -ForegroundColor $color
}
