param(
    [string]$CsvPath    = (Join-Path $PSScriptRoot "..\poc-database\courbexp230.csv"),
    [string]$DbPath     = (Join-Path $PSScriptRoot "..\poc-database\wakfu_permanent.db"),
    [string]$SchemaData = (Join-Path $PSScriptRoot "..\poc-database\schema-data.sql"),
    [string]$SqlitePref = (Join-Path $PSScriptRoot "..\poc-database\sqlite3.exe")
)

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

# ── Helpers DB ────────────────────────────────────────────────
. (Join-Path $PSScriptRoot "db-helpers.ps1")

$sqlite = Resolve-SqlitePath -PreferredPath $SqlitePref
if ($null -eq $sqlite) { Write-Host "ERREUR : sqlite3.exe introuvable." -ForegroundColor Red; exit 1 }

Initialize-Db -SqlitePath $sqlite -DbPath $DbPath -SchemaFiles @($SchemaData)

# ── Contexte Wakfu ────────────────────────────────────────────
$logsDir   = Join-Path $env:APPDATA "zaap\gamesLogs\wakfu\logs"
$serveur   = Get-WakfuServer
$character = Get-WakfuCharacter
if ($null -eq $character) { Write-Host "ERREUR : aucune fenetre WAKFU detectee." -ForegroundColor Red; exit 1 }

# ── CSV XP personnage ────────────────────────────────────────
$xpCurve = @{}
Import-Csv $CsvPath | ForEach-Object { $xpCurve[[int]$_.Niveau] = [int64]$_.XP_pour_ce_niveau }

function Get-XpNiveau($lvl) { return $xpCurve[$lvl + 1] }
function Get-NiveauTag($lvl) {
    if ($lvl -le 190) { return "CSV" }
    if ($lvl -le 230) { return "?" }
    return "inconnu"
}

# ── Pattern XP (combat + jeu, discrimination par entite) ─────
$pat = "(?i)\[Information \((combat|jeu)\)\]\s+(.+?)\s*:\s*\+([\d\s]+)\s+points d'XP\.(.*?)Prochain niveau dans\s*:\s*([\d\s]+)\."

Write-Host ""
Write-Host "Serveur : $serveur  |  Personnage : $character" -ForegroundColor Magenta

# ══════════════════════════════════════════════════════════════
# PHASE 1 — Scan historique → DB permanente
# ══════════════════════════════════════════════════════════════

$fichiers = @("wakfu_chat.log.2","wakfu_chat.log.1","wakfu_chat.log") |
    ForEach-Object { Join-Path $logsDir $_ } | Where-Object { Test-Path $_ }

$dateAncre   = $null
$prevLogTs   = $null
$batchEvents = @()

Write-Host "  Scan historique → DB..." -ForegroundColor DarkGray

foreach ($f in $fichiers) {
    Get-Content $f | ForEach-Object {
        if ($_ -match "\((\d{1,2})/(\d{1,2})/(\d{2})\)") {
            $script:dateAncre = "{0:D2}/{1:D2}/{2}" -f [int]$Matches[1],[int]$Matches[2],$Matches[3]
            $script:prevLogTs = $null; return
        }
        if ($_ -notmatch $pat) { return }

        $entity  = $Matches[2].Trim()
        if ($entity -ne $script:character) { return }

        $xpG     = [int64](($Matches[3]) -replace "\s","")
        $middle  = $Matches[4]
        $rem     = [int64](($Matches[5]) -replace "\s","")
        $ts      = if ($_ -match "(\d{2}:\d{2}:\d{2})") { $Matches[1] } else { $null }
        $lvlGain = if ($middle -match "\+(\d+) niveau") { [int]$Matches[1] } else { 0 }

        if ($null -ne $ts -and $null -ne $script:prevLogTs) {
            if ([TimeSpan]::Parse($ts) -lt [TimeSpan]::Parse($script:prevLogTs)) {
                if ($null -ne $script:dateAncre) {
                    $script:dateAncre = ([datetime]::ParseExact($script:dateAncre,"dd/MM/yy",$null).AddDays(1)).ToString("dd/MM/yy")
                }
            }
        }
        if ($null -ne $ts) { $script:prevLogTs = $ts }

        $absTs = $null
        if ($null -ne $script:dateAncre -and $null -ne $ts) {
            try {
                $dt = [datetime]::ParseExact("$($script:dateAncre) $ts","dd/MM/yy HH:mm:ss",$null)
                $absTs = $dt.ToString("o")
            } catch {}
        }

        $script:batchEvents += @{
            server=$script:serveur; character=$script:character; sourceTs=$ts; absoluteTs=$absTs
            entity=$script:character; entityType="character"; xpGained=$xpG; xpRemaining=$rem; levelUp=$lvlGain
        }
    }
}

if ($batchEvents.Count -gt 0) {
    Add-XpEventsBatch -Events $batchEvents
    Write-Host "  $($batchEvents.Count) evenements XP personnage stockes en DB." -ForegroundColor DarkGray
}

# ══════════════════════════════════════════════════════════════
# PHASE 2 — Reconstruction du niveau depuis la DB
# ══════════════════════════════════════════════════════════════

# Compter les level-ups en DB pour ce personnage
$levelUpRows = Invoke-Sql -Rows -Sql "SELECT xp_gained,xp_remaining,level_up,source_ts,absolute_ts FROM xp_events WHERE server='$(Escape-Sql $serveur)' AND entity_name='$(Escape-Sql $character)' AND entity_type='character' AND level_up>0 ORDER BY id;"

$gainsLogs = 0
$levelUps  = @()
foreach ($row in $levelUpRows) {
    if ([string]::IsNullOrWhiteSpace($row)) { continue }
    $p = $row -split '\|'
    $gainsLogs += [int]$p[2]
    $levelUps += @{ xpGained=[int64]$p[0]; xpRemaining=[int64]$p[1]; levelUp=[int]$p[2]; sourceTs=$p[3]; absoluteTs=$p[4] }
}

# Lire le niveau depuis la DB ou le demander UNE SEULE FOIS
$niveauActuel = Get-CharacterLevel -Server $serveur -CharacterName $character
if ($null -eq $niveauActuel) {
    $niveauActuel = [int](Read-Host "Niveau actuel de $character (premiere et derniere fois)")
    Set-CharacterLevel -Server $serveur -CharacterName $character -Level $niveauActuel
}

$niveauDepart = $niveauActuel - $gainsLogs
$n = $niveauDepart
$levelLog = @()

foreach ($lu in $levelUps) {
    $n += $lu.levelUp
    $csvVal = Get-XpNiveau $n
    $tag    = if ($null -ne $csvVal) { Get-NiveauTag $n } else { "inconnu" }
    $xpNiv  = if ($null -ne $csvVal) { $csvVal } else { 0 }
    $heure  = if ($lu.absoluteTs) {
        try { ([datetime]::Parse($lu.absoluteTs)).ToString("dd/MM/yy HH:mm:ss") } catch { $lu.sourceTs }
    } else { $lu.sourceTs }
    $dt = if ($lu.absoluteTs) { try { [datetime]::Parse($lu.absoluteTs) } catch { $null } } else { $null }
    $levelLog += @{ niveau=$n; heure=$heure; dt=$dt; xpNiveau=$xpNiv; gain=$lu.levelUp; tag=$tag }
}

# Ligne "en cours"
$xpEnCours  = Get-XpNiveau $niveauActuel
$tagEnCours = Get-NiveauTag $niveauActuel
if ($null -eq $xpEnCours) { $xpEnCours = 0; $tagEnCours = "?" }
$levelLog += @{ niveau=$niveauActuel; heure="en cours"; dt=$null; xpNiveau=$xpEnCours; gain=0; tag=$tagEnCours }

# ══════════════════════════════════════════════════════════════
# Affichage
# ══════════════════════════════════════════════════════════════

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
            "CSV-OK"  { "Green" }
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

# ══════════════════════════════════════════════════════════════
# Temps reel
# ══════════════════════════════════════════════════════════════

$xpHist        = @()
$niveau        = $niveauActuel
$xpTotalActuel = $xpEnCours

Get-Content (Join-Path $logsDir "wakfu_chat.log") -Wait -Tail 0 | ForEach-Object {
    if ($_ -notmatch $pat) { return }
    $entity    = $Matches[2].Trim()
    $xpGained  = [int64]($Matches[3] -replace "\s","")
    $middle    = $Matches[4]
    $remaining = [int64]($Matches[5] -replace "\s","")
    $ts        = if ($_ -match "(\d{2}:\d{2}:\d{2})") { $Matches[1] } else { "??" }
    $lvlGain   = if ($middle -match "\+(\d+) niveau") { [int]$Matches[1] } else { 0 }
    if ($entity -ne $character) { return }

    # Stocker en DB immediatement
    $absNow = (Get-Date).ToString("o")
    Add-XpEvent -Server $serveur -Character $character -SourceTs $ts -AbsoluteTs $absNow `
        -EntityName $character -EntityType "character" -XpGained $xpGained -XpRemaining $remaining -LevelUp $lvlGain

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

        # Persister en DB
        Set-CharacterLevel -Server $serveur -CharacterName $character -Level $script:niveau
        if ($script:xpTotalActuel -gt 0) {
            Set-XpCurveObserved -CurveType "character" -Level $script:niveau -XpRequired $script:xpTotalActuel
        }

        $maintenant      = Get-Date
        $heureMaintenant = $maintenant.ToString("dd/MM/yy HH:mm:ss")

        $totalNivSuivant = Get-XpNiveau $script:niveau
        $tagSuivant      = Get-NiveauTag $script:niveau
        if ($null -eq $totalNivSuivant) {
            # > 230 : on stocke la valeur crowdsourcee — calcul par carryover
            # remaining = total_suivant - carryover, on ne peut pas deduire total_suivant sans info supplementaire
            # Pour l'instant on marque inconnu, la valeur sera corrigee si observee
            $totalNivSuivant = 0
            $tagSuivant = "?"
        }

        # 191-230 : verification automatique par carryover (plus de question)
        if ((Get-NiveauTag $script:niveau) -eq "?" -and $null -ne (Get-XpNiveau $script:niveau)) {
            $totalNivSuivant = Get-XpNiveau $script:niveau
            $tagSuivant      = "?"
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
