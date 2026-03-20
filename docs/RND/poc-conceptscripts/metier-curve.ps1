param(
    [string]$CsvPath    = (Join-Path $PSScriptRoot "..\poc-database\courbemetiers175.csv"),
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

# ── CSV metiers ───────────────────────────────────────────────
$xpCurve = @{}
Import-Csv $CsvPath | ForEach-Object { $xpCurve[[int]$_.Niveau_Metier] = [int64]$_.XP_pour_ce_niveau }

function Get-XpMetier($lvl) { return $xpCurve[$lvl + 1] }
function Get-MetierTag($lvl) {
    if ($xpCurve.ContainsKey($lvl + 1)) { return "CSV" }
    return "SAISI"
}

# ── Whitelist metiers ─────────────────────────────────────────
$metiersConnus  = @("Herboriste","Forestier","Mineur","Paysan","Pêcheur","Trappeur",
                     "Armurier","Bijoutier","Boulanger","Cuisinier","Ébéniste",
                     "Maître d'Armes","Maroquinier","Tailleur")
$metiersRecolte = @("Herboriste","Forestier","Mineur","Paysan","Pêcheur","Trappeur")

# ── Patterns ─────────────────────────────────────────────────
$pat        = "(?i)\[Information \((combat|jeu)\)\]\s+(.+?)\s*:\s*\+([\d\s]+)\s+points d'XP\.(.*?)Prochain niveau dans\s*:\s*([\d\s]+)\."
$patRamasse = "(?i)Vous avez ramass[eé]\s+(\d+)x?\s+(.+?)\s*\."
$patPerdu   = "(?i)Vous avez perdu\s+(\d+)x?\s+(.+?)\s*\."
$patJoue    = "(?i)Vous avez jou[eé]\s+(.+?)\s+sur ce personnage"
$patKamas   = "(?i)Vous avez (gagn[eé]|perdu)\s+([\d\s]+)\s+kamas?\."
$patQuete       = "(?i)Vous avez r[eé]ussi la qu[eê]te\s+(.+?)\s*\.?\s*$"
$patPos         = "(?i)Vous vous trouvez en \((-?\d+),\s*(-?\d+),\s*(-?\d+)\) de l.instance (\d+)"
$patCmd         = "(?i)Commande inconnue\s*:\s*/sync(characterxptarget|characterxpcurrent|characterxplvl|itemprice|item|job)(.+?)(\d+)\s*$"
$patPositionSync = "(?i)Commande inconnue\s*:\s*/positionsync:(.+)$"

# Lookup metiers : nom normalise → nom reel
$metierLookup = @{}
foreach ($m in $metiersConnus) {
    $metierLookup[(Normalize-Name $m)] = $m
}
# Alias courants
$metierLookup["herbo"] = "Herboriste"
$metierLookup["mda"]   = "Maître d'Armes"
$metierLookup["maro"]  = "Maroquinier"
$metierLookup["ebeni"] = "Ébéniste"

# ══════════════════════════════════════════════════════════════
# PHASE 1 — Scan historique → DB permanente
# ══════════════════════════════════════════════════════════════

Write-Host ""
Write-Host "Serveur : $serveur  |  Personnage actif : $character" -ForegroundColor Magenta
Write-Host "  (L'XP metier est partagee entre tous les personnages du serveur)" -ForegroundColor DarkGray

$fichiers = @("wakfu_chat.log.2","wakfu_chat.log.1","wakfu_chat.log") |
    ForEach-Object { Join-Path $logsDir $_ } | Where-Object { Test-Path $_ }

$dateAncre      = $null
$prevLogTs      = $null
$batchEvents    = @()
$histPending    = $null   # item ramassé en attente de correlation avec XP
$oldestLogDate  = $null   # plus ancienne date vue dans les logs
$newestLogDate  = $null   # plus recente date vue dans les logs
$histItemCount  = 0       # compteur items historiques appris

Write-Host "  Scan historique → DB..." -ForegroundColor DarkGray

foreach ($f in $fichiers) {
    Get-Content $f | ForEach-Object {
        if ($_ -match "\((\d{1,2})/(\d{1,2})/(\d{2})\)") {
            $script:dateAncre = "{0:D2}/{1:D2}/{2}" -f [int]$Matches[1],[int]$Matches[2],$Matches[3]
            try {
                $d = [datetime]::ParseExact($script:dateAncre,"dd/MM/yy",$null)
                if ($null -eq $script:oldestLogDate -or $d -lt $script:oldestLogDate) { $script:oldestLogDate = $d }
                if ($null -eq $script:newestLogDate -or $d -gt $script:newestLogDate) { $script:newestLogDate = $d }
            } catch {}
            $script:prevLogTs = $null; return
        }

        # Detecter les "ramassé" historiques pour apprendre item→metier
        if ($_ -match $script:patRamasse) {
            $script:histPending = @{ qty=[int]$Matches[1]; name=$Matches[2].Trim() }
            return
        }

        if ($_ -notmatch $pat) { return }

        $entity  = $Matches[2].Trim()

        $xpG     = [int64](($Matches[3]) -replace "\s","")
        $middle  = $Matches[4]
        $rem     = [int64](($Matches[5]) -replace "\s","")
        $ts      = if ($_ -match "(\d{2}:\d{2}:\d{2})") { $Matches[1] } else { $null }
        $lvlGain = if ($middle -match "\+(\d+) niveau") { [int]$Matches[1] } else { 0 }

        # XP personnage (pas un metier) → stocker aussi dans le batch
        if ($entity -notin $script:metiersConnus) {
            $script:histPending = $null  # consommer le pending (quete enviro)
            # On stocke en batch avec entityType=character (meme table xp_events)
            # La date absolue est calculée plus bas, on la met ici avant
        }

        # Association item→metier historique (ramassé juste avant XP recolte)
        if ($entity -in $script:metiersRecolte -and $null -ne $script:histPending) {
            Add-JobResource -JobName $entity -ItemName $script:histPending.name -Qty $script:histPending.qty
            $script:histItemCount++
            $script:histPending = $null
        }

        # Date absolue
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

        $eType = if ($entity -in $script:metiersConnus) { "job" } else { "character" }
        $script:batchEvents += @{
            server=$script:serveur; character=$script:character; sourceTs=$ts; absoluteTs=$absTs
            entity=$entity; entityType=$eType; xpGained=$xpG; xpRemaining=$rem; levelUp=$lvlGain
        }
    }
}

if ($batchEvents.Count -gt 0) {
    Add-XpEventsBatch -Events $batchEvents
    Write-Host "  $($batchEvents.Count) evenements XP metier stockes en DB." -ForegroundColor DarkGray
} else {
    Write-Host "  Aucun evenement XP metier dans les logs." -ForegroundColor DarkGray
}
if ($histItemCount -gt 0) {
    Write-Host "  $histItemCount associations item→metier apprises depuis les logs." -ForegroundColor DarkGray
}

# Afficher la couverture temporelle des logs
$logRange = ""
if ($null -ne $oldestLogDate) {
    $oldest = $oldestLogDate.ToString("dd/MM/yy")
    $newest = if ($null -ne $newestLogDate) { $newestLogDate.ToString("dd/MM/yy") } else { $oldest }
    $days   = if ($null -ne $newestLogDate) { [int]($newestLogDate - $oldestLogDate).TotalDays } else { 0 }
    $logRange = "$oldest → $newest ($days jours)"
    Write-Host "  Couverture logs : $logRange" -ForegroundColor DarkGray
}

# ══════════════════════════════════════════════════════════════
# PHASE 2 — Reconstruction des niveaux depuis la DB
# ══════════════════════════════════════════════════════════════

# Lire les niveaux stockes en DB
$knownLevels = Get-AllJobLevels -Server $serveur

# Si aucun métier n'est connu en DB pour ce serveur → initialisation complète
if ($knownLevels.Count -eq 0) {
    Write-Host ""
    Write-Host "  Nouveau serveur : aucun niveau de métier en DB." -ForegroundColor Yellow
    Write-Host "  Entrez 0 pour ignorer un métier (niveau inconnu / non pratiqué)." -ForegroundColor DarkGray
    Write-Host ""
    foreach ($job in $metiersConnus) {
        $rawInput = Read-Host "  Niveau actuel de $job"
        $lvl      = 0; [int]::TryParse($rawInput.Trim(), [ref]$lvl) | Out-Null
        if ($lvl -gt 0) {
            Set-JobLevel -Server $serveur -JobName $job -Level $lvl
            $knownLevels[$job] = $lvl
        }
    }
    Write-Host ""
}

# Pour chaque metier connu avec des level-ups en DB, recalculer le niveau
$jobState = @{}

foreach ($job in $metiersConnus) {
    $levelUps = @(Get-JobLevelUps -Server $serveur -JobName $job)
    $dbLevel  = if ($knownLevels.ContainsKey($job)) { $knownLevels[$job] } else { $null }

    # Pas de donnees du tout → on verra en temps reel
    if ($levelUps.Count -eq 0 -and $null -eq $dbLevel) { continue }

    $totalGains = 0
    foreach ($lu in $levelUps) { $totalGains += $lu.levelUp }

    if ($null -ne $dbLevel) {
        $niveauActuel = $dbLevel
    } elseif ($totalGains -gt 0) {
        # Level-ups en logs mais pas de niveau en DB (serveur partiellement connu)
        $niveauActuel = [int](Read-Host "  Niveau actuel de $job")
        Set-JobLevel -Server $serveur -JobName $job -Level $niveauActuel
    } else {
        continue
    }

    $niveauDepart = $niveauActuel - $totalGains
    $n = $niveauDepart
    $levelLog = @()

    foreach ($lu in $levelUps) {
        $n += $lu.levelUp
        $csvVal = Get-XpMetier $n
        $tag    = Get-MetierTag $n
        $xpNiv  = if ($null -ne $csvVal) { $csvVal } else { 0 }
        $heure  = if ($lu.absoluteTs) {
            try { ([datetime]::Parse($lu.absoluteTs)).ToString("dd/MM/yy HH:mm:ss") } catch { $lu.sourceTs }
        } else { $lu.sourceTs }
        $dt = if ($lu.absoluteTs) { try { [datetime]::Parse($lu.absoluteTs) } catch { $null } } else { $null }
        $levelLog += @{ niveau=$n; heure=$heure; dt=$dt; xpNiveau=$xpNiv; gain=$lu.levelUp; tag=$tag }
    }

    # Ligne "en cours"
    $xpEnCours  = Get-XpMetier $niveauActuel
    $tagEnCours = Get-MetierTag $niveauActuel
    if ($null -eq $xpEnCours) { $xpEnCours = 0; $tagEnCours = "?" }
    $levelLog += @{ niveau=$niveauActuel; heure="en cours"; dt=$null; xpNiveau=$xpEnCours; gain=0; tag=$tagEnCours }

    $jobState[$job] = @{
        niveau       = $niveauActuel
        xpTotal      = $xpEnCours
        xpHist       = @()
        levelLog     = $levelLog
        niveauDepart = $niveauDepart
        gainsTotal   = $totalGains
    }
}

# ══════════════════════════════════════════════════════════════
# PHASE 3 — Stats historiques recoltes (depuis DB)
# ══════════════════════════════════════════════════════════════

$dbHarvestStats    = Get-HarvestCountPerJob -Server $serveur -HarvestJobs $metiersRecolte
$dbCaptchatCount   = Get-CaptchatCount -Server $serveur
$dbTotalHarvests   = 0
foreach ($v in $dbHarvestStats.Values) { $dbTotalHarvests += $v.count }

# Charger les syncs items existants
$itemSync = Get-AllSyncData -Server $serveur -Category "item"

# Enrichir $worldNames avec les maps connues en DB
$dbMapNames = Get-MapWorldNames
foreach ($wIdInt in $dbMapNames.Keys) {
    if (-not $worldNames.ContainsKey($wIdInt)) { $worldNames[$wIdInt] = $dbMapNames[$wIdInt] }
}

# Session counters (en memoire, pour le taux /h de cette session)
$sessionStart      = Get-Date
$sessionHarvests   = @{}
$sessionTotalH     = 0
$captchatPrev      = 0

# ══════════════════════════════════════════════════════════════
# Fonctions d'affichage
# ══════════════════════════════════════════════════════════════

function Show-MetierTable($job, $rows) {
    Write-Host "  --- $job ---" -ForegroundColor DarkYellow
    Write-Host "  Niv   Passe a            Duree          XP niveau        Source" -ForegroundColor DarkYellow
    $prev = $null
    foreach ($r in $rows) {
        $duree = if ($prev -and $null -ne $prev.dt -and $null -ne $r.dt) {
            $s = [int]($r.dt - $prev.dt).TotalSeconds
            if ($s -lt 0) { "---" } elseif ($s -lt 3600) { "{0}m{1:D2}s" -f [int]($s/60),($s%60) }
            else { "{0}h{1:D2}m" -f [int]($s/3600),[int](($s%3600)/60) }
        } else { "---" }
        $xpStr = if ($r.xpNiveau -gt 0) { "{0:N0}" -f $r.xpNiveau } else { "MAX" }
        $color = switch ($r.tag) {
            "CSV"   { "Green" }
            "EXACT" { "Cyan" }
            "SAISI" { "Cyan" }
            default { "DarkGray" }
        }
        Write-Host ("  {0,-5} {1,-18}  {2,-14} {3,-18} [{4}]" -f $r.niveau, $r.heure, $duree, $xpStr, $r.tag) -ForegroundColor $color
        $prev = $r
    }
}

function Show-HarvestSummary {
    $elapsed  = (Get-Date) - $script:sessionStart
    $elapsedH = $elapsed.TotalHours
    $elapsedS = $elapsed.ToString("hh\:mm\:ss")
    $bw       = 56

    Write-Host ""
    Write-Host ("  ┌" + ("─" * $bw) + "┐") -ForegroundColor DarkCyan
    $header = "  RECOLTES  Session : $elapsedS"
    Write-Host ("  │" + $header.PadRight($bw) + "│") -ForegroundColor DarkCyan
    Write-Host ("  ├" + ("─" * $bw) + "┤") -ForegroundColor DarkCyan

    foreach ($job in ($script:sessionHarvests.Keys | Sort-Object)) {
        $s    = $script:sessionHarvests[$job]
        $rate = if ($elapsedH -gt 0.001) { [int]($s.count / $elapsedH) } else { 0 }
        $line = "  {0,-14} {1,5} recoltes  {2,5}/h  {3,12}" -f $job, $s.count, $rate, ("+{0:N0} XP" -f $s.totalXp)
        Write-Host ("  │" + $line.PadRight($bw) + "│") -ForegroundColor Green
    }

    $totalRate = if ($elapsedH -gt 0.001) { [int]($script:sessionTotalH / $elapsedH) } else { 0 }
    Write-Host ("  ├" + ("─" * $bw) + "┤") -ForegroundColor DarkCyan
    $tline = "  TOTAL session  {0,5} recoltes  {1,5}/h" -f $script:sessionTotalH, $totalRate
    Write-Host ("  │" + $tline.PadRight($bw) + "│") -ForegroundColor White

    # All-time
    $allTimeH  = $script:dbTotalHarvests + $script:sessionTotalH
    $allTimeCC = $script:dbCaptchatCount + $script:captchatPrev
    $aline = "  ALL-TIME       {0,5} recoltes enr." -f $allTimeH
    Write-Host ("  │" + $aline.PadRight($bw) + "│") -ForegroundColor DarkGray

    # Inventaire items avec prix et valeur
    if ($script:itemSync.Count -gt 0) {
        Write-Host ("  ├" + ("─" * $bw) + "┤") -ForegroundColor DarkCyan
        $iHeader = "  INVENTAIRE  (item / qty / prix / valeur)"
        Write-Host ("  │" + $iHeader.PadRight($bw) + "│") -ForegroundColor DarkCyan
        $totalValue   = [int64]0
        $hasUnknown   = $false
        foreach ($k in ($script:itemSync.Keys | Sort-Object)) {
            $si = $script:itemSync[$k]
            $priceInfo = Get-LastItemPrice -Server $serveur -ItemKey $k
            $qtyLabel = if ($si.source -eq 'auto') { "+$($si.value) enr." } else { "#$($si.value)" }
            if ($null -ne $priceInfo -and $si.value -gt 0) {
                $stackVal    = $priceInfo.unitPrice * $si.value
                $totalValue += $stackVal
                $iline = "  {0,-18} {1,9}  {2,7}k/u  {3,10}k" -f $si.display, $qtyLabel, ("{0:N0}" -f $priceInfo.unitPrice), ("{0:N0}" -f $stackVal)
                Write-Host ("  │" + $iline.PadRight($bw) + "│") -ForegroundColor Green
            } else {
                $hasUnknown = $true
                $iline = "  {0,-18} {1,9}  prix inconnu" -f $si.display, $qtyLabel
                Write-Host ("  │" + $iline.PadRight($bw) + "│") -ForegroundColor DarkGray
            }
        }
        Write-Host ("  ├" + ("─" * $bw) + "┤") -ForegroundColor DarkCyan
        $valLabel = if ($hasUnknown) { "{0:N0}k (partiel)" -f $totalValue } else { "{0:N0}k" -f $totalValue }
        $vline = "  VALEUR TOTALE : $valLabel"
        Write-Host ("  │" + $vline.PadRight($bw) + "│") -ForegroundColor White
    }

    if ($allTimeCC -gt 0 -and $allTimeH -gt 0) {
        $ratio = [int]($allTimeH / $allTimeCC)
        $cline = "  * Capt'chat   {0} apparitions  ~1/{1} recoltes" -f $allTimeCC, $ratio
        Write-Host ("  │" + $cline.PadRight($bw) + "│") -ForegroundColor Red
    } else {
        $cline = "  * Capt'chat   aucune apparition"
        Write-Host ("  │" + $cline.PadRight($bw) + "│") -ForegroundColor DarkGray
    }

    Write-Host ("  └" + ("─" * $bw) + "┘") -ForegroundColor DarkCyan
    Write-Host ""
}

# ══════════════════════════════════════════════════════════════
# Affichage initial
# ══════════════════════════════════════════════════════════════

Write-Host ""
Write-Host "Serveur : $serveur  |  Personnage actif : $character" -ForegroundColor Magenta
Write-Host "  [CSV] confirme  [EXACT] calcule en live  [SAISI] entre manuellement" -ForegroundColor DarkGray
Write-Host ""

if ($jobState.Count -eq 0) {
    Write-Host "  Aucun metier suivi. Nouveaux metiers detectes automatiquement en temps reel." -ForegroundColor DarkGray
} else {
    foreach ($job in ($jobState.Keys | Sort-Object)) {
        $s = $jobState[$job]
        Write-Host "  $job  |  Niv : $($s.niveau)  |  Avant logs : $($s.niveauDepart)  |  Level-ups : $($s.gainsTotal)" -ForegroundColor Magenta
        Show-MetierTable $job $s.levelLog
        Write-Host ""
    }
}

if ($dbTotalHarvests -gt 0) {
    Write-Host "  Historique DB : $dbTotalHarvests recoltes enregistrees | $dbCaptchatCount capt'chat" -ForegroundColor DarkGray
}
if ($itemSync.Count -gt 0) {
    Write-Host "  Inventaire suivi :" -ForegroundColor DarkGray
    foreach ($k in ($itemSync.Keys | Sort-Object)) {
        $sd = $itemSync[$k]
        $qtyLabel = if ($sd.source -eq 'auto') { "+$($sd.value) enr." } else { "#$($sd.value)" }
        $priceInfo = Get-LastItemPrice -Server $serveur -ItemKey $k
        $priceLabel = if ($null -ne $priceInfo) { " ($("{0:N0}" -f $priceInfo.unitPrice)k/u)" } else { " (prix inconnu)" }
        Write-Host "    $($sd.display) : $qtyLabel$priceLabel" -ForegroundColor DarkGray
    }
}

Write-Host ""
Write-Host "En attente de gains XP metier..." -ForegroundColor Cyan
Write-Host "  Resume recoltes toutes les 50 interactions" -ForegroundColor DarkGray
Write-Host "  Commandes in-game (taper dans le chat Wakfu) :" -ForegroundColor DarkGray
Write-Host "    /syncitem<nom><nb>    Ex: /syncitempoilsdepandissidan707" -ForegroundColor DarkGray
Write-Host "    /syncjob<metier><niv> Ex: /syncjobarmurier76" -ForegroundColor DarkGray
Write-Host "    /synccharacterxplvl<perso><niv>" -ForegroundColor DarkGray
Write-Host ""

# ══════════════════════════════════════════════════════════════
# PHASE 4 — Background watcher (wakfu.log)
# Track: Capt'chat, localisation, havre-sac, fin de collecte
# ══════════════════════════════════════════════════════════════

# Mapping worldId connus
$worldNames = @{
    9="Havre-Sac"; 527="Zone farm (?)"; 862="Combat Capt'chat"
    1089="Biblio-teleport"; 1135="Sufokia"; 1136="HDV Sufokia"
}

$rndSuffix    = Get-Random
$captchatFile = Join-Path $env:TEMP "wakfu_captchat_$rndSuffix.txt"
$stateFile    = Join-Path $env:TEMP "wakfu_state_$rndSuffix.txt"
"0|--:--:--"            | Set-Content $captchatFile
"outdoor|0|?|0,0"       | Set-Content $stateFile  # format: <zone>|<lastCollecteMs>|<worldId>|<x,y>

$bgWatcher = Start-Job -ScriptBlock {
    param($logPath, $ccFile, $stFile)
    $ccCount    = 0
    $inHavreSac = $false
    $lastColMs  = 0
    $worldId    = "?"
    $posXY      = "0,0"

    function Write-State {
        param($z, $colMs, $wId, $xy)
        "$z|$colMs|$wId|$xy" | Set-Content $stFile
    }

    Get-Content $logPath -Wait -Tail 0 | ForEach-Object {
        if ($_ -match "(?i)Capt.chat") {
            $ccCount++
            "$ccCount|$((Get-Date).ToString('HH:mm:ss'))|$_" | Set-Content $ccFile
        }
        # Changement de zone : "on quitte le monde {ID}"
        if ($_ -match "on quitte le monde (\d+)") {
            $worldId = $Matches[1]
            $posXY   = "?,?"
            $zone    = if ($worldId -eq "9") { "havresac" } else { "outdoor" }
            Write-State $zone $lastColMs $worldId $posXY
        }
        # Coordonnees : "bZJ initialisé, centré sur (X,Y)"
        if ($_ -match "bZJ initialis.+centr.+sur \((-?\d+),(-?\d+)\)") {
            $posXY = "$($Matches[1]),$($Matches[2])"
            $zone  = if ($inHavreSac) { "havresac" } else { "outdoor" }
            Write-State $zone $lastColMs $worldId $posXY
        }
        if ($_ -match "PERSONAL_SPACE_ENTER_RESULT_MESSAGE \(success=true\)") {
            $inHavreSac = $true
            $worldId    = "9"
            Write-State "havresac" $lastColMs $worldId $posXY
        }
        if ($_ -match "PERSONAL_SPACE_LEAVE_RESULT_MESSAGE") {
            $inHavreSac = $false
            Write-State "outdoor" $lastColMs $worldId $posXY
        }
        if ($_ -match "Fin de l.occupation de collecte") {
            $lastColMs = [DateTimeOffset]::UtcNow.ToUnixTimeMilliseconds()
            $zone = if ($inHavreSac) { "havresac" } else { "outdoor" }
            Write-State $zone $lastColMs $worldId $posXY
        }
    }
} -ArgumentList (Join-Path $logsDir "wakfu.log"), $captchatFile, $stateFile

# ══════════════════════════════════════════════════════════════
# PHASE 5 — Temps reel
# ══════════════════════════════════════════════════════════════

# Helper : lire l'etat du background watcher
function Get-BgState {
    $raw = (Get-Content $script:stateFile -ErrorAction SilentlyContinue)
    if ($null -ne $raw -and $raw -match '^(\w+)\|(\d+)\|([^|]+)\|(.+)$') {
        return @{
            zone     = $Matches[1]          # "havresac" | "outdoor"
            colMs    = [int64]$Matches[2]   # epoch ms derniere collecte
            worldId  = $Matches[3]          # world ID ou "?"
            pos      = $Matches[4]          # "x,y" ou "?,?"
        }
    }
    return @{ zone="outdoor"; colMs=0; worldId="?"; pos="?,?" }
}

function Get-LocationLabel {
    param($State)
    $wId   = $State.worldId
    $wInt  = 0; $isInt = [int]::TryParse($wId, [ref]$wInt)
    $wName = if ($isInt -and $script:worldNames.ContainsKey($wInt)) { $script:worldNames[$wInt] } else { "monde $wId" }
    $pos   = $State.pos
    if ($State.zone -eq "havresac") { return "Havre-Sac" }
    if ($wId -eq "?") { return "???" }
    return "$wName ($pos)"
}

$pendingItem     = $null  # item ramasse en attente d'association avec un metier
$pendingKamas    = $null  # kamas en attente de correlation HDV (meme seconde)
$pendingLostItem = $null  # item perdu en attente de correlation HDV (vente/listing)
$pendingQuete    = $null  # nom de la quete journaliere (réussie juste avant le ramassé)
$lastLocLabel    = ""     # dernier affichage de localisation

try {
Get-Content (Join-Path $logsDir "wakfu_chat.log") -Wait -Tail 0 | ForEach-Object {

    # ══════════════════════════════════════════════════════════
    # COMMANDES IN-GAME /sync<category><key><value>
    # ══════════════════════════════════════════════════════════
    if ($_ -match $patCmd) {
        $cmdCat = $Matches[1].ToLower()
        $cmdRaw = $Matches[2].Trim()          # texte brut (avec accents) pour display
        $cmdKey = Normalize-Name $cmdRaw       # cle normalisee (sans accents/espaces)
        $cmdVal = [int64]$Matches[3]

        $bw = 56
        switch ($cmdCat) {
            "item" {
                # /syncitem<nom><nb> → sync inventaire d'un objet
                $displayName = $cmdRaw  # texte brut avec accents
                # Chercher si on connait deja cet item (nom reel depuis DB)
                $knownItems = Get-AllSyncData -Server $serveur -Category "item"
                if ($knownItems.ContainsKey($cmdKey) -and $knownItems[$cmdKey].display) {
                    $displayName = $knownItems[$cmdKey].display
                }
                Set-SyncData -Server $serveur -Category "item" -Key $cmdKey -KeyDisplay $displayName -Value $cmdVal
                $itemSync[$cmdKey] = @{ display=$displayName; value=$cmdVal; source='chat' }
                Write-Host ""
                Write-Host ("  ┌" + ("─" * $bw) + "┐") -ForegroundColor Cyan
                Write-Host ("  │" + "  SYNC item: $displayName = $cmdVal".PadRight($bw) + "│") -ForegroundColor Cyan
                Write-Host ("  └" + ("─" * $bw) + "┘") -ForegroundColor Cyan
            }
            "job" {
                # /syncjob<metier><niv> → sync niveau de metier
                $realJob = $metierLookup[$cmdKey]
                if ($null -ne $realJob) {
                    Set-JobLevel -Server $serveur -JobName $realJob -Level ([int]$cmdVal)
                    Set-SyncData -Server $serveur -Category "job" -Key $cmdKey -KeyDisplay $realJob -Value $cmdVal
                    if ($jobState.ContainsKey($realJob)) { $jobState[$realJob].niveau = [int]$cmdVal }
                    Write-Host ""
                    Write-Host ("  ┌" + ("─" * $bw) + "┐") -ForegroundColor Cyan
                    Write-Host ("  │" + "  SYNC job: $realJob = niveau $cmdVal".PadRight($bw) + "│") -ForegroundColor Cyan
                    Write-Host ("  └" + ("─" * $bw) + "┘") -ForegroundColor Cyan
                } else {
                    Write-Host "  /syncjob : metier '$cmdKey' inconnu" -ForegroundColor Red
                    Write-Host "  Connus : $($metierLookup.Keys -join ', ')" -ForegroundColor DarkGray
                }
            }
            "characterxplvl" {
                # /synccharacterxplvl<perso><niv> → sync niveau personnage
                Set-CharacterLevel -Server $serveur -CharacterName $cmdRaw -Level ([int]$cmdVal)
                Set-SyncData -Server $serveur -Category "characterxplvl" -Key $cmdKey -KeyDisplay $cmdRaw -Value $cmdVal
                Write-Host ""
                Write-Host ("  ┌" + ("─" * $bw) + "┐") -ForegroundColor Cyan
                Write-Host ("  │" + "  SYNC personnage: $cmdRaw = niveau $cmdVal".PadRight($bw) + "│") -ForegroundColor Cyan
                Write-Host ("  └" + ("─" * $bw) + "┘") -ForegroundColor Cyan
            }
            "characterxpcurrent" {
                # /synccharacterxpcurrent<perso><xp> → XP gagnee niveau actuel
                Set-SyncData -Server $serveur -Category "characterxpcurrent" -Key $cmdKey -KeyDisplay $cmdRaw -Value $cmdVal
                Write-Host ""
                Write-Host ("  ┌" + ("─" * $bw) + "┐") -ForegroundColor Cyan
                Write-Host ("  │" + "  SYNC XP actuelle: $cmdRaw = $("{0:N0}" -f $cmdVal) XP".PadRight($bw) + "│") -ForegroundColor Cyan
                Write-Host ("  └" + ("─" * $bw) + "┘") -ForegroundColor Cyan
            }
            "characterxptarget" {
                # /synccharacterxptarget<perso><xp> → XP totale pour finir le niveau
                Set-SyncData -Server $serveur -Category "characterxptarget" -Key $cmdKey -KeyDisplay $cmdRaw -Value $cmdVal
                Write-Host ""
                Write-Host ("  ┌" + ("─" * $bw) + "┐") -ForegroundColor Cyan
                Write-Host ("  │" + "  SYNC XP cible: $cmdRaw = $("{0:N0}" -f $cmdVal) XP".PadRight($bw) + "│") -ForegroundColor Cyan
                Write-Host ("  └" + ("─" * $bw) + "┘") -ForegroundColor Cyan
            }
            "itemprice" {
                # /syncitemprice<nom><prix> → prix unitaire manuel
                $displayName = $cmdRaw
                Add-ItemPrice -Server $serveur -ItemName $displayName -ItemKey $cmdKey `
                    -UnitPrice $cmdVal -TotalPrice $cmdVal -Quantity 1 -Direction "manual" `
                    -SourceTs "manual" -Character $character
                Write-Host ""
                Write-Host ("  ┌" + ("─" * $bw) + "┐") -ForegroundColor Cyan
                Write-Host ("  │" + "  SYNC prix: $displayName = $("{0:N0}" -f $cmdVal) kamas".PadRight($bw) + "│") -ForegroundColor Cyan
                Write-Host ("  └" + ("─" * $bw) + "┘") -ForegroundColor Cyan
            }
        }
        return
    }

    # ══════════════════════════════════════════════════════════
    # Kamas gagné/perdu → stocker pour correlation HDV
    # + correlation inverse : pendingLostItem + kamas = vente/listing
    # ══════════════════════════════════════════════════════════
    if ($_ -match $patKamas) {
        $kamasDir = if ($Matches[1] -match "gagn") { "gain" } else { "loss" }
        $kamasAmt = [int64](($Matches[2]) -replace "\s","")
        $kamasTs  = if ($_ -match "(\d{2}:\d{2}:\d{2})") { $Matches[1] } else { "" }

        # Correlation avec pendingLostItem (meme seconde)
        if ($null -ne $script:pendingLostItem -and $script:pendingLostItem.ts -eq $kamasTs) {
            $li = $script:pendingLostItem
            $script:pendingLostItem = $null
            if ($kamasDir -eq "gain") {
                # Vente (offre d'achat acceptee) : perdu item + gagné kamas
                $unitPrice = [int64][Math]::Floor($kamasAmt / $li.qty)
                Add-ItemPrice -Server $serveur -ItemName $li.name -ItemKey $li.key `
                    -UnitPrice $unitPrice -TotalPrice $kamasAmt -Quantity $li.qty -Direction "sell" `
                    -SourceTs $kamasTs -Character $character
                $bw = 56
                Write-Host ""
                Write-Host ("  ┌" + ("─" * $bw) + "┐") -ForegroundColor DarkYellow
                Write-Host ("  │" + ("  VENTE {0}x {1} pour {2:N0}k ({3:N0}k/u)" -f $li.qty, $li.name, $kamasAmt, $unitPrice).PadRight($bw) + "│") -ForegroundColor DarkYellow
                Write-Host ("  └" + ("─" * $bw) + "┘") -ForegroundColor DarkYellow
            } else {
                # Listing HDV : perdu item + perdu kamas (taxe)
                Write-Host ("  LISTING HDV {0}x {1} (taxe: {2:N0}k)" -f $li.qty, $li.name, $kamasAmt) -ForegroundColor DarkGray
            }
        }

        $script:pendingKamas = @{ direction=$kamasDir; amount=$kamasAmt; ts=$kamasTs }
        return
    }

    # ══════════════════════════════════════════════════════════
    # "Vous avez réussi la quête X" → quête journalière Almanax
    # ══════════════════════════════════════════════════════════
    if ($_ -match $patQuete) {
        $script:pendingQuete = $Matches[1].Trim()
        return
    }

    # ══════════════════════════════════════════════════════════
    # "Vous avez ramassé" → stocker en attente de confirmation
    # L'increment sync_data se fait UNIQUEMENT sur confirmation :
    #   - XP metier apres (recolte ext.) → confirme dans le handler XP
    #   - XP perso apres (quete enviro) → confirme dans le handler XP
    #   - Kamas perdus avant (achat HDV) → confirme ici immediatement
    #   - "Fin de collecte" dans wakfu.log (recolte havre-sac) → confirme ici
    # Sans confirmation (coffre, trade) → affiche mais n'incremente pas
    # ══════════════════════════════════════════════════════════
    if ($_ -match $patRamasse) {
        $rQty  = [int]$Matches[1]
        $rName = $Matches[2].Trim()
        $rTs   = if ($_ -match "(\d{2}:\d{2}:\d{2})") { $Matches[1] } else { "" }
        $rKey  = Normalize-Name $rName
        $confirmed = $false

        # Correlation HDV : perdu kamas + ramassé item dans la meme seconde = achat
        if ($null -ne $script:pendingKamas -and $script:pendingKamas.direction -eq "loss" -and $script:pendingKamas.ts -eq $rTs) {
            $totalPrice = $script:pendingKamas.amount
            $unitPrice  = [int64][Math]::Floor($totalPrice / $rQty)
            Add-ItemPrice -Server $serveur -ItemName $rName -ItemKey $rKey `
                -UnitPrice $unitPrice -TotalPrice $totalPrice -Quantity $rQty -Direction "buy" `
                -SourceTs $rTs -Character $character
            $bw = 56
            Write-Host ""
            Write-Host ("  ┌" + ("─" * $bw) + "┐") -ForegroundColor DarkYellow
            Write-Host ("  │" + ("  ACHAT {0}x {1} pour {2:N0}k ({3:N0}k/u)" -f $rQty, $rName, $totalPrice, $unitPrice).PadRight($bw) + "│") -ForegroundColor DarkYellow
            Write-Host ("  └" + ("─" * $bw) + "┘") -ForegroundColor DarkYellow
            $script:pendingKamas = $null
            $confirmed = $true
        }

        # Check "Fin de collecte" en havre-sac (wakfu.log via background job)
        # Seul cas havre-sac fiable : zone=havresac ET collecte recente (<3s)
        # En outdoor, la confirmation vient du XP (handler plus bas)
        if (-not $confirmed) {
            $stateRaw = (Get-Content $stateFile -ErrorAction SilentlyContinue)
            if ($null -ne $stateRaw -and $stateRaw -match '^(\w+)\|(\d+)$') {
                $zone     = $Matches[1]
                $colMs    = [int64]$Matches[2]
                $nowMs    = [DateTimeOffset]::UtcNow.ToUnixTimeMilliseconds()
                $deltaMs  = $nowMs - $colMs
                # En havre-sac + collecte dans les 3 dernieres secondes = recolte (pas coffre)
                if ($zone -eq "havresac" -and $deltaMs -ge 0 -and $deltaMs -le 3000) {
                    $confirmed = $true
                    $knownJobHS = Get-JobForItem -ItemName $rName
                    if ($null -ne $knownJobHS) {
                        Add-JobResource -JobName $knownJobHS -ItemName $rName -Qty $rQty
                    }
                }
            }
        }

        # Si confirme (achat HDV ou recolte havre-sac) → incrementer sync_data
        # Les autres confirmations (XP metier, XP perso) se font dans leurs handlers respectifs
        if ($confirmed) {
            Add-SyncDelta -Server $serveur -Category "item" -Key $rKey -KeyDisplay $rName -Delta $rQty
            $existing = $itemSync[$rKey]
            if ($null -ne $existing) {
                $itemSync[$rKey] = @{ display=$rName; value=($existing.value + $rQty); source=$existing.source }
            } else {
                $itemSync[$rKey] = @{ display=$rName; value=$rQty; source='auto' }
            }
        }

        # Affichage immediat du ramasse
        $knownJob = Get-JobForItem -ItemName $rName
        $jobLabel = if ($null -ne $knownJob) { $knownJob } else { "?" }
        $confTag  = if ($confirmed) { "+" } else { "~" }  # + = confirme, ~ = non confirme (coffre/trade)
        $color    = if ($confirmed) { "DarkGreen" } else { "DarkGray" }
        $syncData = $itemSync[$rKey]
        if ($null -ne $syncData) {
            $qtyLabel = if ($syncData.source -eq 'auto') { "+$($syncData.value) enr." } else { "#$($syncData.value)" }
            $priceInfo = Get-LastItemPrice -Server $serveur -ItemKey $rKey
            if ($null -ne $priceInfo -and $syncData.value -gt 0) {
                $stackVal  = $priceInfo.unitPrice * $syncData.value
                $priceLabel = "  {0:N0}k/u  stock:{1:N0}k" -f $priceInfo.unitPrice, $stackVal
            } else {
                $priceLabel = ""
            }
            Write-Host ("{0}  {1}{2}x {3}  [{4}]  {5}{6}" -f $rTs, $confTag, $rQty, $rName, $jobLabel, $qtyLabel, $priceLabel) -ForegroundColor $color
        } else {
            Write-Host ("{0}  {1}{2}x {3}  [{4}]" -f $rTs, $confTag, $rQty, $rName, $jobLabel) -ForegroundColor $color
        }

        $script:pendingItem  = @{ qty=$rQty; name=$rName; key=$rKey; quete=$script:pendingQuete }
        $script:pendingQuete = $null
        return
    }

    # ══════════════════════════════════════════════════════════
    # "Vous avez perdu" item → decrementer + stocker pour correlation HDV
    # ══════════════════════════════════════════════════════════
    if ($_ -match $patPerdu) {
        $lostQty  = [int]$Matches[1]
        $lostItem = $Matches[2].Trim()
        $lostKey  = Normalize-Name $lostItem
        $lostTs   = if ($_ -match "(\d{2}:\d{2}:\d{2})") { $Matches[1] } else { "" }

        # Auto-track dans sync_data (decrementer, ou creer si inconnu)
        Add-SyncDelta -Server $serveur -Category "item" -Key $lostKey -KeyDisplay $lostItem -Delta (-$lostQty)
        $existing = $itemSync[$lostKey]
        if ($null -ne $existing) {
            $newVal = $existing.value - $lostQty
            $itemSync[$lostKey] = @{ display=$lostItem; value=$newVal; source=$existing.source }
        } else {
            $newVal = -$lostQty
            $itemSync[$lostKey] = @{ display=$lostItem; value=$newVal; source='auto' }
        }
        Write-Host ("  -{0}x {1}  (→ {2})" -f $lostQty, $lostItem, $newVal) -ForegroundColor DarkRed

        # Stocker en attente pour correlation HDV (vente/listing dans la meme seconde)
        $script:pendingLostItem = @{ qty=$lostQty; name=$lostItem; key=$lostKey; ts=$lostTs }
        return
    }

    # ══════════════════════════════════════════════════════════
    # "Vous avez joué X sur ce personnage" → stocker le playtime
    # ══════════════════════════════════════════════════════════
    if ($_ -match $patJoue) {
        $durationStr = $Matches[1].Trim()
        # Parser : "16 jours 13 heures 7 minutes 33 secondes"
        $totalSec = 0
        if ($durationStr -match "(\d+)\s*jours?")    { $totalSec += [int]$Matches[1] * 86400 }
        if ($durationStr -match "(\d+)\s*heures?")    { $totalSec += [int]$Matches[1] * 3600 }
        if ($durationStr -match "(\d+)\s*minutes?")   { $totalSec += [int]$Matches[1] * 60 }
        if ($durationStr -match "(\d+)\s*secondes?")  { $totalSec += [int]$Matches[1] }
        Set-SyncData -Server $serveur -Category "playtime" -Key (Normalize-Name $character) -KeyDisplay $character -Value $totalSec -Source "log"
        $days = [int]($totalSec / 86400); $hrs = [int](($totalSec % 86400) / 3600); $mins = [int](($totalSec % 3600) / 60)
        Write-Host "  Temps de jeu $character : ${days}j ${hrs}h ${mins}m (enregistre)" -ForegroundColor DarkGray
        return
    }

    # ══════════════════════════════════════════════════════════
    # /positionsync:... → cartographie d'une map/région
    # Format: Map[FR]:Nom,Map[EN]:Nom,Region:Nom%%Avec%%Espaces,
    #         Leadername:Nom,Maplvl:51-125,RegionLVL:51-65,
    #         Joblvl:Forestier35,Herboriste35,Paysan30-35
    # ══════════════════════════════════════════════════════════
    if ($_ -match $patPositionSync) {
        $tokens = ($Matches[1]) -split ","
        $mapFR = $null; $mapEN = $null; $region = $null; $leader = $null
        $mapLvlMin = 0; $mapLvlMax = 0; $regionLvlMin = 0; $regionLvlMax = 0
        $jobReqs = @(); $inJoblvl = $false

        foreach ($tok in $tokens) {
            $t = $tok.Trim()
            if ($inJoblvl) {
                # Chaque token suivant est un metier : Forestier35 ou Paysan30-35
                if ($t -match "^(.+?)(\d+)-(\d+)$") {
                    $jobReqs += "$($Matches[1]):$($Matches[2])-$($Matches[3])"
                } elseif ($t -match "^(.+?)(\d+)$") {
                    $jobReqs += "$($Matches[1]):$($Matches[2])"
                }
                continue
            }
            if ($t -match "(?i)^Map\[FR\]:(.+)$")        { $mapFR = $Matches[1].Replace("%%"," "); continue }
            if ($t -match "(?i)^Map\[EN\]:(.+)$")        { $mapEN = $Matches[1].Replace("%%"," "); continue }
            if ($t -match "(?i)^NoRegion$")              { $region = $null; continue }
            if ($t -match "(?i)^Region:(.+)$")           { $region = $Matches[1].Replace("%%"," "); continue }
            if ($t -match "(?i)^Leadername:None$")       { $leader = $null; continue }
            if ($t -match "(?i)^Leadername:(.+)$")       { $leader = $Matches[1].Replace("%%"," "); continue }
            if ($t -match "(?i)^Maplvl:(\d+)-(\d+)$")   { $mapLvlMin=[int]$Matches[1]; $mapLvlMax=[int]$Matches[2]; continue }
            if ($t -match "(?i)^RegionLVL:None$")        { $regionLvlMin=0; $regionLvlMax=0; continue }
            if ($t -match "(?i)^RegionLVL:(\d+)-(\d+)$"){ $regionLvlMin=[int]$Matches[1]; $regionLvlMax=[int]$Matches[2]; continue }
            if ($t -match "(?i)^Joblvl:None$")           { $inJoblvl = $true; continue }
            if ($t -match "(?i)^Joblvl:(.+)$")          {
                $inJoblvl = $true
                $firstJob = $Matches[1]
                if ($firstJob -match "^(.+?)(\d+)-(\d+)$") { $jobReqs += "$($Matches[1]):$($Matches[2])-$($Matches[3])" }
                elseif ($firstJob -match "^(.+?)(\d+)$")   { $jobReqs += "$($Matches[1]):$($Matches[2])" }
                continue
            }
        }

        # Récupérer le worldId depuis le background state
        $bgSt   = Get-BgState
        $wId    = $bgSt.worldId
        $wIdInt = 0; $null = [int]::TryParse($wId, [ref]$wIdInt)

        $regionKey  = if ($null -ne $region) { $region } else { "" }
        $leaderStr  = if ($null -ne $leader) { $leader } else { "" }
        $jobReqStr  = $jobReqs -join ","

        Set-MapLocation -WorldId $wIdInt -RegionName $regionKey -MapNameFR $mapFR -MapNameEN $mapEN `
            -LeaderName $leaderStr -MapLvlMin $mapLvlMin -MapLvlMax $mapLvlMax `
            -RegionLvlMin $regionLvlMin -RegionLvlMax $regionLvlMax `
            -JobRequirements $jobReqStr -Character $character

        # Mettre à jour $worldNames en mémoire
        if ($wIdInt -gt 0 -and $null -ne $mapFR) { $worldNames[$wIdInt] = $mapFR }

        # Affichage
        $bw = 56
        $regionStr = if ($null -ne $region) { " / $region" } else { "" }
        $lvlStr    = if ($mapLvlMax -gt 0) { "  [Niv $mapLvlMin-$mapLvlMax]" } else { "" }
        Write-Host ""
        Write-Host ("  ┌" + ("─" * $bw) + "┐") -ForegroundColor DarkCyan
        Write-Host ("  │" + "  MAP : $mapFR$regionStr$lvlStr  [monde $wId]".PadRight($bw) + "│") -ForegroundColor DarkCyan
        if ($null -ne $leader) {
            Write-Host ("  │" + "  Leader : $leader".PadRight($bw) + "│") -ForegroundColor DarkGray
        }
        if ($jobReqs.Count -gt 0) {
            Write-Host ("  │" + "  Jobs   : $($jobReqs -join ', ')".PadRight($bw) + "│") -ForegroundColor DarkGray
        }
        Write-Host ("  └" + ("─" * $bw) + "┘") -ForegroundColor DarkCyan
        return
    }

    # ══════════════════════════════════════════════════════════
    # /pos → position du joueur (commande manuelle dans le chat)
    # ══════════════════════════════════════════════════════════
    if ($_ -match $patPos) {
        $px = $Matches[1]; $py = $Matches[2]; $pz = $Matches[3]; $inst = $Matches[4]
        $wName = if ($worldNames.ContainsKey([int]$inst)) { $worldNames[[int]$inst] } else { "monde $inst" }
        Write-Host ("  Localisation : ({0}, {1}, {2})  {3}  [instance {4}]" -f $px, $py, $pz, $wName, $inst) -ForegroundColor DarkCyan
        return
    }

    # ══════════════════════════════════════════════════════════
    # Affichage changement de localisation (polling bg state)
    # ══════════════════════════════════════════════════════════
    $bgState  = Get-BgState
    $locLabel = Get-LocationLabel $bgState
    if ($locLabel -ne $script:lastLocLabel -and $locLabel -ne "???") {
        $script:lastLocLabel = $locLabel
        Write-Host ("  >> Localisation : {0}" -f $locLabel) -ForegroundColor DarkCyan
    }

    # ══════════════════════════════════════════════════════════
    # Ligne XP metier
    # ══════════════════════════════════════════════════════════
    if ($_ -notmatch $pat) { return }

    $entity    = $Matches[2].Trim()
    $xpGained  = [int64]($Matches[3] -replace "\s","")
    $middle    = $Matches[4]
    $remaining = [int64]($Matches[5] -replace "\s","")
    $ts        = if ($_ -match "(\d{2}:\d{2}:\d{2})") { $Matches[1] } else { "??" }
    $lvlGain   = if ($middle -match "\+(\d+) niveau") { [int]$Matches[1] } else { 0 }

    # ── XP personnage (pas un metier) ──
    if ($entity -notin $metiersConnus) {
        # Stocker en DB comme evenement XP personnage
        $absNow = (Get-Date).ToString("o")
        Add-XpEvent -Server $serveur -Character $character -SourceTs $ts -AbsoluteTs $absNow `
            -EntityName $entity -EntityType "character" -XpGained $xpGained -XpRemaining $remaining -LevelUp $lvlGain

        # Association item → quete environnementale (ramassé Sioupere + XP perso meme seconde)
        if ($null -ne $script:pendingItem) {
            $pi = $script:pendingItem
            $script:pendingItem = $null
            # Acquisition confirmée → incrementer sync_data
            Add-SyncDelta -Server $serveur -Category "item" -Key $pi.key -KeyDisplay $pi.name -Delta $pi.qty
            $existing = $itemSync[$pi.key]
            if ($null -ne $existing) {
                $itemSync[$pi.key] = @{ display=$pi.name; value=($existing.value + $pi.qty); source=$existing.source }
            } else {
                $itemSync[$pi.key] = @{ display=$pi.name; value=$pi.qty; source='auto' }
            }
            $qLabel = if ($null -ne $pi.quete) { "quête journalière ($($pi.quete))" } else { "quête enviro" }
            Write-Host ("{0}  {1} : +{2:N0} XP  Reste:{3:N0}  ({4} → {5}x {6})" -f `
                $ts, $entity, $xpGained, $remaining, $qLabel, $pi.qty, $pi.name) -ForegroundColor Magenta
        } else {
            Write-Host ("{0}  {1} : +{2:N0} XP  Reste:{3:N0}" -f $ts, $entity, $xpGained, $remaining) -ForegroundColor Magenta
        }

        # Level-up personnage
        if ($lvlGain -gt 0) {
            Set-CharacterLevel -Server $serveur -CharacterName $entity -Level ([int]$lvlGain)
            Write-Host ("  {0} LEVEL UP ! +{1} niveau(x)" -f $entity, $lvlGain) -ForegroundColor Yellow
        }
        return
    }

    # ── Stocker en DB immediatement (metier) ──
    $absNow = (Get-Date).ToString("o")
    Add-XpEvent -Server $serveur -Character $character -SourceTs $ts -AbsoluteTs $absNow `
        -EntityName $entity -EntityType "job" -XpGained $xpGained -XpRemaining $remaining -LevelUp $lvlGain

    # ── Nouveau metier jamais vu en session ──
    if (-not $jobState.ContainsKey($entity)) {
        $dbLvl = Get-JobLevel -Server $serveur -JobName $entity
        if ($null -eq $dbLvl) {
            Write-Host ""
            Write-Host "  Nouveau metier detecte : $entity (aucun niveau en DB)" -ForegroundColor Yellow
            Write-Host "  Tapez /syncjob$(Normalize-Name $entity)<niveau> dans le chat pour le renseigner" -ForegroundColor DarkYellow
            $niveauActuel = [int](Read-Host "  Ou entrez le niveau ici (premiere et derniere fois)")
            Set-JobLevel -Server $serveur -JobName $entity -Level $niveauActuel
        } else {
            $niveauActuel = $dbLvl
            Write-Host "  $entity detecte — niveau $niveauActuel (depuis DB)" -ForegroundColor DarkGray
        }
        $xpEnCours  = Get-XpMetier $niveauActuel
        $tagEnCours = Get-MetierTag $niveauActuel
        if ($null -eq $xpEnCours) { $xpEnCours = 0; $tagEnCours = "?" }
        $initLog = @(@{ niveau=$niveauActuel; heure="en cours"; dt=$null; xpNiveau=$xpEnCours; gain=0; tag=$tagEnCours })
        $jobState[$entity] = @{
            niveau=$niveauActuel; xpTotal=$xpEnCours; xpHist=@()
            levelLog=$initLog; niveauDepart=$niveauActuel; gainsTotal=0
        }
    }

    # ── ETA (fenetre glissante 8 points) ──
    $jobState[$entity].xpHist += @{ time=(Get-Date); remaining=$remaining }
    if ($jobState[$entity].xpHist.Count -gt 8) {
        $jobState[$entity].xpHist = $jobState[$entity].xpHist[-8..-1]
    }

    $eta  = "---"
    $hist = $jobState[$entity].xpHist
    if ($hist.Count -ge 2) {
        $elapsed = ($hist[-1].time - $hist[0].time).TotalSeconds
        $done    = $hist[0].remaining - $hist[-1].remaining
        if ($elapsed -gt 0 -and $done -gt 0) {
            $etaSec = [int]($remaining / ($done / $elapsed))
            $etaTs  = [TimeSpan]::FromSeconds($etaSec)
            if ($etaTs.TotalDays -ge 1) {
                $eta = "{0}j{1:D2}h{2:D2}m" -f [int][Math]::Floor($etaTs.TotalDays), $etaTs.Hours, $etaTs.Minutes
            } elseif ($etaTs.TotalHours -ge 1) {
                $eta = "{0}h{1:D2}m" -f [int][Math]::Floor($etaTs.TotalHours), $etaTs.Minutes
            } else {
                $eta = "{0}m{1:D2}s" -f $etaTs.Minutes, $etaTs.Seconds
            }
        }
    }

    # ── Level-up ──
    if ($lvlGain -gt 0) {
        $oldXpTotal = $jobState[$entity].xpTotal
        $jobState[$entity].niveau += $lvlGain

        Set-JobLevel -Server $serveur -JobName $entity -Level $jobState[$entity].niveau

        $maintenant      = Get-Date
        $heureMaintenant = $maintenant.ToString("dd/MM/yy HH:mm:ss")

        $totalNivSuivant = Get-XpMetier $jobState[$entity].niveau
        $tagSuivant      = Get-MetierTag $jobState[$entity].niveau
        if ($null -eq $totalNivSuivant) { $totalNivSuivant = 0; $tagSuivant = "?" }

        if ($oldXpTotal -gt 0) {
            Set-XpCurveObserved -CurveType "job" -Level $jobState[$entity].niveau -XpRequired $oldXpTotal
        }

        $jobState[$entity].levelLog = @($jobState[$entity].levelLog | Where-Object { $_.heure -ne "en cours" })
        $jobState[$entity].levelLog += @{ niveau=$jobState[$entity].niveau; heure=$heureMaintenant; dt=$maintenant; xpNiveau=$oldXpTotal; gain=$lvlGain; tag="EXACT" }
        $jobState[$entity].levelLog += @{ niveau=($jobState[$entity].niveau+1); heure="en cours"; dt=$null; xpNiveau=$totalNivSuivant; gain=0; tag=$tagSuivant }
        $jobState[$entity].xpTotal = $totalNivSuivant

        Write-Host ""
        Write-Host ("  $entity NIVEAU {0}  [{1}]  ETA suivant : {2}  |  Niv {3} total : {4:N0} XP [{5}]" -f `
            $jobState[$entity].niveau, $ts, $eta, ($jobState[$entity].niveau+1), $totalNivSuivant, $tagSuivant) -ForegroundColor Yellow
        Show-MetierTable $entity $jobState[$entity].levelLog
        Write-Host ""
    }

    # ── Association item → metier (la ligne "ramasse" vient AVANT la ligne XP = recolte confirmee) ──
    $isRecolte = $entity -in $metiersRecolte
    if ($isRecolte -and $null -ne $script:pendingItem) {
        $pi = $script:pendingItem
        $script:pendingItem = $null
        Add-JobResource -JobName $entity -ItemName $pi.name -Qty $pi.qty
        # Recolte confirmee par XP → incrementer sync_data
        Add-SyncDelta -Server $serveur -Category "item" -Key $pi.key -KeyDisplay $pi.name -Delta $pi.qty
        $existing = $itemSync[$pi.key]
        if ($null -ne $existing) {
            $itemSync[$pi.key] = @{ display=$pi.name; value=($existing.value + $pi.qty); source=$existing.source }
        } else {
            $itemSync[$pi.key] = @{ display=$pi.name; value=$pi.qty; source='auto' }
        }
    }

    # ── Comptage recoltes session ──
    if ($isRecolte) {
        if (-not $sessionHarvests.ContainsKey($entity)) {
            $sessionHarvests[$entity] = @{ count=0; totalXp=0 }
        }
        $sessionHarvests[$entity].count   += 1
        $sessionHarvests[$entity].totalXp += $xpGained
        $script:sessionTotalH++

        # Capt'chat check (background job)
        $ccData = ((Get-Content $captchatFile -ErrorAction SilentlyContinue) -split '\|')
        $ccNow  = if ($ccData -and $ccData[0] -match '^\d+$') { [int]$ccData[0] } else { 0 }
        if ($ccNow -gt $captchatPrev) {
            $ccTime = if ($ccData.Count -ge 2) { $ccData[1] } else { "??" }
            $ccLine = if ($ccData.Count -ge 3) { $ccData[2] } else { "" }
            $allH = $dbTotalHarvests + $script:sessionTotalH
            Add-CaptchatEvent -Server $serveur -Character $character -TotalHarvests $allH -SourceLine $ccLine
            $script:captchatPrev = $ccNow
            $ratio = if ($allH -gt 0) { [int]($allH / ($dbCaptchatCount + $ccNow)) } else { "?" }
            Write-Host ""
            Write-Host ("  ┌" + ("─" * 52) + "┐") -ForegroundColor Red
            Write-Host ("  │" + "  * CAPT'CHAT DETECTE !  [$ccTime]".PadRight(52) + "│") -ForegroundColor Red
            Write-Host ("  │" + ("  Apparition #{0}  |  Taux estime : ~1/{1} recoltes" -f ($dbCaptchatCount + $ccNow), $ratio).PadRight(52) + "│") -ForegroundColor Red
            Write-Host ("  └" + ("─" * 52) + "┘") -ForegroundColor Red
            Write-Host ""
        }

        # Resume toutes les 50 recoltes
        if ($script:sessionTotalH % 50 -eq 0) { Show-HarvestSummary }
    }

    # ── Ligne par evenement ──
    $elapsedH = ((Get-Date) - $sessionStart).TotalHours
    if ($isRecolte) {
        $rate  = if ($elapsedH -gt 0.001) { [int]($sessionHarvests[$entity].count / $elapsedH) } else { 0 }
        $color = if ($lvlGain -gt 0) { "Yellow" } else { "Green" }
        Write-Host ("{0}  [{1,-14}]  +{2,-8} XP  Reste:{3,-10} ETA:{4}  ({5}/h)" -f `
            $ts, $entity, ("{0:N0}"-f$xpGained), ("{0:N0}"-f$remaining), $eta, $rate) -ForegroundColor $color
    } else {
        $color = if ($lvlGain -gt 0) { "Yellow" } else { "Cyan" }
        Write-Host ("{0}  [{1,-14}]  +{2,-8} XP  Reste:{3,-10} ETA:{4}" -f `
            $ts, $entity, ("{0:N0}"-f$xpGained), ("{0:N0}"-f$remaining), $eta) -ForegroundColor $color
    }
}
} finally {
    Stop-Job $bgWatcher -ErrorAction SilentlyContinue
    Remove-Job $bgWatcher -ErrorAction SilentlyContinue
    Remove-Item $captchatFile -ErrorAction SilentlyContinue
    Remove-Item $stateFile -ErrorAction SilentlyContinue
}
