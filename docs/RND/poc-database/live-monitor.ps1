param(
    [string]$PrefsRoot = (Join-Path $env:APPDATA "zaap\gamesLogs\wakfu\preferences"),
    [string]$LogsRoot  = (Join-Path $env:APPDATA "zaap\gamesLogs\wakfu\logs"),
    # wakfu.log EXCLU du polling — mêmes events jeu que wakfu_chat.log (doublons XP/kamas)
    # wakfu.log lu uniquement au startup pour heure de connexion
    [string[]]$LogFiles = @("wakfu_chat.log"),
    [int]$PollMs = 500,
    [switch]$ShowAll
)

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

# ════════════════════════════════════════════════════════════════════════════
# UTILITAIRES
# ════════════════════════════════════════════════════════════════════════════
function Normalize-Int {
    param([string]$v)
    return [int64]([regex]::Replace($v, "[\s\u00A0\u202F']", ""))
}

function Format-Big {
    param([int64]$n)
    return "{0:N0}" -f $n
}

function Format-Elapsed {
    param([datetime]$since)
    $s = [int]((Get-Date) - $since).TotalSeconds
    if ($s -lt 0)   { return "?" }
    if ($s -lt 60)  { return "${s}s" }
    $m = [int]($s / 60); $s = $s % 60
    if ($m -lt 60)  { return "${m}m${s}s" }
    $h = [int]($m / 60); $m = $m % 60
    return "${h}h${m}m"
}

function Get-SourceTs {
    param([string]$Line)
    if ($Line -match "\b(\d{2}:\d{2}:\d{2}),\d{3}\b") { return $Matches[1] }
    if ($Line -match "\b(\d{2}:\d{2}:\d{2})\b")       { return $Matches[1] }
    return "??:??:??"
}

# Convertit "HH:mm:ss" du log (sans date) en datetime aujourd'hui
# Gère le cas où l'heure est < heure actuelle → hier possible (session nocturne)
function Log-TsToDateTime {
    param([string]$ts)
    if ([string]::IsNullOrWhiteSpace($ts)) { return $null }
    $today = Get-Date
    try {
        $dt = [datetime]::ParseExact("$($today.ToString('yyyy-MM-dd')) $ts", "yyyy-MM-dd HH:mm:ss", $null)
        # Si l'heure est > heure actuelle, c'est hier
        if ($dt -gt $today) { $dt = $dt.AddDays(-1) }
        return $dt
    } catch { return $null }
}

# ════════════════════════════════════════════════════════════════════════════
# LECTURE PREFS ET SESSION
# ════════════════════════════════════════════════════════════════════════════
function Read-LastCharacterName {
    param([string]$PrefsPath)
    $file = Get-ChildItem -Path $PrefsPath -Filter "accountPreferences*.properties" -ErrorAction SilentlyContinue |
            Sort-Object LastWriteTime -Descending | Select-Object -First 1
    if ($null -eq $file) { return $null }
    $line = Get-Content $file.FullName -Encoding UTF8 |
            Where-Object { $_ -match "^lastSelectedCharacterName=(.+)$" } |
            Select-Object -First 1
    if ($null -eq $line) { return $null }
    return ($line -replace "^lastSelectedCharacterName=", "").Trim()
}

# Lit wakfu.log pour extraire :
#   session_start  = premier timestamp du fichier (= lancement JVM)
#   ingame_since   = premier [Information (jeu/combat)] = personnage chargé en monde
function Read-SessionTimes {
    param([string]$LogPath)
    $result = @{ session_start = $null; ingame_since = $null }
    if (-not (Test-Path $LogPath)) { return $result }

    $lines = Get-Content $LogPath -Encoding UTF8
    foreach ($line in $lines) {
        if ($null -eq $result.session_start -and $line -match "\b(\d{2}:\d{2}:\d{2}),\d{3}\b") {
            $result.session_start = Log-TsToDateTime -ts $Matches[1]
        }
        if ($null -eq $result.ingame_since -and $line -match "\[Information \((jeu|combat)\)\]") {
            if ($line -match "\b(\d{2}:\d{2}:\d{2}),\d{3}\b") {
                $result.ingame_since = Log-TsToDateTime -ts $Matches[1]
            }
        }
        if ($null -ne $result.session_start -and $null -ne $result.ingame_since) { break }
    }
    return $result
}

# ════════════════════════════════════════════════════════════════════════════
# PARSERS
# ════════════════════════════════════════════════════════════════════════════
function Parse-XpLine {
    param([string]$Line)
    $pat = "(?i)\]\s+(.+?)\s*:\s*\+([0-9\s\u00A0\u202F']+)\s+points d'XP\.\s*((?:\+\d+\s+niveau[x]?\.\s*)?)Prochain niveau dans\s*:\s*([0-9\s\u00A0\u202F']+)\."
    if (-not ($Line -match $pat)) { return $null }
    # Sauvegarder les groupes AVANT tout autre -match (PowerShell écrase $Matches)
    $entity    = $Matches[1].Trim()
    $xpGained  = Normalize-Int $Matches[2]
    $levelUp   = $Matches[3].Trim() -ne ""
    $remaining = Normalize-Int $Matches[4]
    $type      = if ($Line -match "\[Information \(jeu\)\]") { "xp_job" } else { "xp_character" }
    return @{ type=$type; entity=$entity; xp_gained=$xpGained; remaining=$remaining; level_up=$levelUp }
}

function Parse-KamasLine {
    param([string]$Line)
    if ($Line -match "(?i)Vous avez gagn\S*\s+([0-9\s\u00A0\u202F']+)\s+kama(?:s)?\.") {
        return @{ type = "kamas_gained"; amount = Normalize-Int $Matches[1] }
    }
    if ($Line -match "(?i)Vous avez perdu\s+([0-9\s\u00A0\u202F']+)\s+kama(?:s)?\.") {
        return @{ type = "kamas_spent"; amount = Normalize-Int $Matches[1] }
    }
    return $null
}

function Parse-ChallengeLine {
    param([string]$Line)
    # [Information (jeu)] Le challenge "Nom" est réussi.
    if ($Line -match '(?i)\[Information \(jeu\)\] Le challenge "([^"]+)" est r.ussi\.') {
        return @{ type = "challenge_success"; name = $Matches[1] }
    }
    # [Information (jeu)] Le challenge "Nom" a échoué.
    if ($Line -match '(?i)\[Information \(jeu\)\] Le challenge "([^"]+)" a .chou.\.') {
        return @{ type = "challenge_failed"; name = $Matches[1] }
    }
    return $null
}

# ════════════════════════════════════════════════════════════════════════════
# ETA (fenêtre glissante 15 min)
# ════════════════════════════════════════════════════════════════════════════
function Get-Eta {
    param([string]$Key, [int64]$Remaining, [hashtable]$History)
    if (-not $History.ContainsKey($Key)) { return $null }
    $hist = $History[$Key]
    if ($hist.Count -lt 2) { return $null }
    $cutoff = (Get-Date).AddMinutes(-15)
    $recent = @($hist | Where-Object { $_.t -ge $cutoff })
    if ($recent.Count -lt 2) { return $null }
    $spanMin = ((Get-Date) - $recent[0].t).TotalMinutes
    if ($spanMin -le 0) { return $null }
    $totalXp   = ($recent | Measure-Object -Property xp -Sum).Sum
    $xpPerMin  = $totalXp / $spanMin
    if ($xpPerMin -le 0) { return $null }
    $xpPerHour = [int64]($xpPerMin * 60)
    $etaMin    = $Remaining / $xpPerMin
    $h = [int]($etaMin / 60); $m = [int]($etaMin % 60)
    return @{
        eta_str = if ($h -gt 0) { "${h}h${m}m" } else { "${m}m" }
        xph_str = "$(Format-Big $xpPerHour) XP/h"
    }
}

# ════════════════════════════════════════════════════════════════════════════
# STARTUP — Détection + config
# ════════════════════════════════════════════════════════════════════════════
Clear-Host
Write-Host "═══════════════════════════════════════════════════════════════" -ForegroundColor Cyan
Write-Host "  WAKFU LIVE MONITOR  v2" -ForegroundColor White
Write-Host "═══════════════════════════════════════════════════════════════" -ForegroundColor Cyan
Write-Host ""

# ── Personnage (auto-détecté) ────────────────────────────────────────────
$detectedName = Read-LastCharacterName -PrefsPath $PrefsRoot
if (-not [string]::IsNullOrWhiteSpace($detectedName)) {
    Write-Host "  Personnage détecté : " -NoNewline -ForegroundColor DarkGray
    Write-Host $detectedName -ForegroundColor Green
    $confirm = (Read-Host "  Confirmer ? (Entrée = oui, ou tape un autre nom)").Trim()
    $charName = if ([string]::IsNullOrWhiteSpace($confirm)) { $detectedName } else { $confirm }
} else {
    Write-Host "  [!] Détection impossible." -ForegroundColor Yellow
    $charName = (Read-Host "  Nom du personnage").Trim()
    if ([string]::IsNullOrWhiteSpace($charName)) { $charName = "?" }
}

# ── Niveau ───────────────────────────────────────────────────────────────
$charLevel = 0
$v = (Read-Host "  Niveau actuel (Entrée pour ignorer)").Trim()
$null = [int]::TryParse($v, [ref]$charLevel)

# ── XP déjà dans le niveau ───────────────────────────────────────────────
# Permet de connaître le total XP du niveau (totalXP = xpDejaDansNiv + remaining)
$charXpInLevel = [int64]-1
$v = (Read-Host "  XP déjà dans ce niveau (ex: 48000000 — Entrée pour ignorer)").Trim()
if (-not [string]::IsNullOrWhiteSpace($v)) {
    $vn = [int64]0
    if ([int64]::TryParse([regex]::Replace($v, "[\s\u00A0\u202F'_,]", ""), [ref]$vn)) {
        $charXpInLevel = $vn
    }
}

# ── Kamas ────────────────────────────────────────────────────────────────
$kamasBalance = [int64]-1
$v = (Read-Host "  Kamas actuels (Entrée pour ignorer)").Trim()
if (-not [string]::IsNullOrWhiteSpace($v)) {
    $vn = [int64]0
    if ([int64]::TryParse([regex]::Replace($v, "[\s\u00A0\u202F'_,]", ""), [ref]$vn)) {
        $kamasBalance = $vn
    }
}

# ── Heure de connexion (wakfu.log) ───────────────────────────────────────
$sessionTimes = Read-SessionTimes -LogPath (Join-Path $LogsRoot "wakfu.log")

# ════════════════════════════════════════════════════════════════════════════
# ÉTAT RUNTIME
# ════════════════════════════════════════════════════════════════════════════
$cursors    = @{}   # path -> int
$xpHistory  = @{}   # "type|entity" -> List[@{t;xp}]
$jobLevels  = @{}   # job_name -> int
$jobXpInLev = @{}   # job_name -> int64 (XP déjà dans le niveau, demandé une fois)
$jobsSeen   = @{}   # job_name -> bool
$xpCurve    = @{}   # "type|entity" -> List[@{level;total_xp}]
# total_xp du niveau courant, connu dès qu'on a xpInLevel + first remaining
$levelTotals = @{}  # "type|entity" -> int64

# Initialiser perso si on a les infos
$charKey = "xp_character|$charName"
if ($charXpInLevel -ge 0) {
    $xpCurve[$charKey]    = [System.Collections.Generic.List[object]]::new()
    $levelTotals[$charKey] = [int64]-1   # sera calculé à la première ligne XP
}

# ── Curseurs sur les fichiers ────────────────────────────────────────────
foreach ($name in $LogFiles) {
    $path = Join-Path $LogsRoot $name
    if (Test-Path $path) {
        $lines = Get-Content $path -Encoding UTF8
        $cursors[$path] = $lines.Count
    } else {
        $cursors[$path] = 0
    }
}

# ── Récap session ─────────────────────────────────────────────────────────
Write-Host ""
Write-Host "─── Session ─────────────────────────────────────────────────────" -ForegroundColor DarkGray
Write-Host ("  Perso   : $charName" + $(if ($charLevel -gt 0) { "  (niv. $charLevel)" } else { "" })) -ForegroundColor White
if ($charXpInLevel -ge 0) {
    Write-Host "  XP niv  : $(Format-Big $charXpInLevel) déjà accumulés" -ForegroundColor DarkGray
}
Write-Host ("  Kamas   : " + $(if ($kamasBalance -ge 0) { Format-Big $kamasBalance } else { "non suivi" })) -ForegroundColor White
if ($null -ne $sessionTimes.session_start) {
    Write-Host "  Client  : lancé à $($sessionTimes.session_start.ToString('HH:mm:ss'))  ($(Format-Elapsed $sessionTimes.session_start) ago)" -ForegroundColor DarkGray
}
if ($null -ne $sessionTimes.ingame_since) {
    Write-Host "  En jeu  : depuis $($sessionTimes.ingame_since.ToString('HH:mm:ss'))  ($(Format-Elapsed $sessionTimes.ingame_since) ago)" -ForegroundColor Cyan
}
foreach ($name in $LogFiles) {
    $path = Join-Path $LogsRoot $name
    if (Test-Path $path) {
        Write-Host "  Suivi   : $name — $($cursors[$path]) lignes passées ignorées" -ForegroundColor DarkGreen
    } else {
        Write-Host "  Absent  : $name" -ForegroundColor DarkGray
    }
}
Write-Host "  Ctrl+C pour quitter" -ForegroundColor DarkGray
Write-Host "═══════════════════════════════════════════════════════════════" -ForegroundColor Cyan
Write-Host ""
Write-Host "En attente d'events..." -ForegroundColor DarkGray
Write-Host ("─" * 63) -ForegroundColor DarkGray

# ════════════════════════════════════════════════════════════════════════════
# BOUCLE PRINCIPALE
# ════════════════════════════════════════════════════════════════════════════
while ($true) {
    Start-Sleep -Milliseconds $PollMs

    foreach ($name in $LogFiles) {
        $path = Join-Path $LogsRoot $name
        if (-not (Test-Path $path)) { continue }

        $allLines  = Get-Content $path -Encoding UTF8
        $lineCount = $allLines.Count
        $from      = $cursors[$path]

        if ($lineCount -lt $from) {
            $from = 0
            Write-Host "[ROTATION] $name" -ForegroundColor DarkYellow
        }
        if ($lineCount -le $from) { continue }

        $newLines       = $allLines[$from..($lineCount - 1)]
        $cursors[$path] = $lineCount

        foreach ($line in $newLines) {
            if ([string]::IsNullOrWhiteSpace($line)) { continue }
            $ts = Get-SourceTs -Line $line

            # ── XP ──────────────────────────────────────────────────────
            $xp = Parse-XpLine -Line $line
            if ($null -ne $xp) {
                # Filtrer les autres joueurs en groupe (XP perso seulement)
                if ($xp.type -eq "xp_character" -and $xp.entity -ne $charName) { continue }

                $key = "$($xp.type)|$($xp.entity)"

                # Premier contact avec un métier → demander niveau + XP dans niveau
                if ($xp.type -eq "xp_job" -and -not $jobsSeen.ContainsKey($xp.entity)) {
                    $jobsSeen[$xp.entity] = $true
                    Write-Host ""
                    Write-Host "  ┌─ NOUVEAU MÉTIER : $($xp.entity)" -ForegroundColor Cyan
                    $jv = 0
                    $ji = (Read-Host "  │  Niveau actuel du métier (Entrée = ?)").Trim()
                    if ([int]::TryParse($ji, [ref]$jv)) { $jobLevels[$xp.entity] = $jv }

                    $jxp = [int64]-1
                    $ji2 = (Read-Host "  │  XP déjà dans ce niveau métier (Entrée = ignorer)").Trim()
                    if (-not [string]::IsNullOrWhiteSpace($ji2)) {
                        $jxpv = [int64]0
                        if ([int64]::TryParse([regex]::Replace($ji2, "[\s\u00A0\u202F'_,]", ""), [ref]$jxpv)) {
                            $jxp = $jxpv
                            $jobXpInLev[$xp.entity] = $jxp
                            $xpCurve[$key]           = [System.Collections.Generic.List[object]]::new()
                            $levelTotals[$key]        = [int64]-1
                        }
                    }
                    Write-Host "  └────────────────────────────────────────────────" -ForegroundColor Cyan
                }

                # Calculer le total XP du niveau si on a le xpInLevel + first remaining
                if (-not $levelTotals.ContainsKey($key) -or $levelTotals[$key] -lt 0) {
                    $initXp = [int64]-1
                    if ($xp.type -eq "xp_character" -and $charXpInLevel -ge 0) {
                        $initXp = $charXpInLevel
                    } elseif ($xp.type -eq "xp_job" -and $jobXpInLev.ContainsKey($xp.entity)) {
                        $initXp = $jobXpInLev[$xp.entity]
                    }
                    if ($initXp -ge 0) {
                        # total = XP déjà accumulée + XP gagnée maintenant + XP restante
                        $levelTotals[$key] = $initXp + $xp.xp_gained + $xp.remaining
                        if (-not $xpCurve.ContainsKey($key)) {
                            $xpCurve[$key] = [System.Collections.Generic.List[object]]::new()
                        }
                    }
                }

                # Historique XP pour le taux
                if (-not $xpHistory.ContainsKey($key)) {
                    $xpHistory[$key] = [System.Collections.Generic.List[object]]::new()
                }
                $xpHistory[$key].Add(@{ t = Get-Date; xp = $xp.xp_gained })

                # ETA
                $eta = Get-Eta -Key $key -Remaining $xp.remaining -History $xpHistory

                # Affichage niveau + couleur
                if ($xp.type -eq "xp_character") {
                    $lvlStr = if ($charLevel -gt 0) { "niv.$charLevel" } else { "niv.?" }
                    $color  = "Green"; $label = "PERSO XP "
                } else {
                    $jlv    = if ($jobLevels.ContainsKey($xp.entity)) { $jobLevels[$xp.entity] } else { 0 }
                    $lvlStr = if ($jlv -gt 0) { "niv.$jlv" } else { "niv.?" }
                    $color  = "DarkCyan"; $label = "MÉTIER XP"
                }

                # Passage de niveau
                if ($xp.level_up) {
                    $lvlOld = if ($xp.type -eq "xp_character") { $charLevel } else { if ($jobLevels.ContainsKey($xp.entity)) { $jobLevels[$xp.entity] } else { 0 } }
                    # Enregistrer dans la courbe
                    if ($levelTotals.ContainsKey($key) -and $levelTotals[$key] -gt 0 -and $lvlOld -gt 0) {
                        $xpCurve[$key].Add(@{ level = $lvlOld; total_xp = $levelTotals[$key] })
                    }
                    Write-Host ""
                    Write-Host "  ★  NIVEAU SUIVANT — $($xp.entity) !  ★" -ForegroundColor Yellow
                    if ($xpCurve.ContainsKey($key) -and $xpCurve[$key].Count -ge 2) {
                        Write-Host "  Courbe XP :" -NoNewline -ForegroundColor DarkGray
                        foreach ($pt in $xpCurve[$key]) {
                            Write-Host "  niv.$($pt.level)→$(Format-Big $pt.total_xp)" -NoNewline -ForegroundColor DarkGray
                        }
                        Write-Host ""
                    }
                    Write-Host ""
                    if ($xp.type -eq "xp_character" -and $charLevel -gt 0) { $charLevel++ }
                    if ($xp.type -eq "xp_job" -and $jobLevels.ContainsKey($xp.entity)) { $jobLevels[$xp.entity]++ }
                    $xpHistory[$key]   = [System.Collections.Generic.List[object]]::new()
                    $levelTotals[$key] = [int64]-1
                    # Réinitialiser xpInLevel (on est au début du nouveau niveau)
                    if ($xp.type -eq "xp_character") { $charXpInLevel = 0 }
                    if ($xp.type -eq "xp_job")        { $jobXpInLev[$xp.entity] = 0; $levelTotals[$key] = $xp.remaining }
                }

                # Total XP du niveau pour affichage
                $totalStr = ""
                if ($levelTotals.ContainsKey($key) -and $levelTotals[$key] -gt 0) {
                    $totalStr = "/$(Format-Big $levelTotals[$key])"
                }

                Write-Host "$ts " -NoNewline -ForegroundColor DarkGray
                Write-Host "[$label] " -NoNewline -ForegroundColor $color
                Write-Host "$($xp.entity) ($lvlStr) " -NoNewline -ForegroundColor White
                Write-Host "+$(Format-Big $xp.xp_gained) XP" -NoNewline -ForegroundColor $color
                Write-Host "  reste: $(Format-Big $xp.remaining)$totalStr" -NoNewline -ForegroundColor DarkGray
                if ($null -ne $eta) {
                    Write-Host "  |  $($eta.xph_str)  ETA: $($eta.eta_str)" -NoNewline -ForegroundColor DarkYellow
                } else {
                    Write-Host "  |  ETA: ..." -NoNewline -ForegroundColor DarkGray
                }
                # Heure en jeu si dispo
                if ($null -ne $sessionTimes.ingame_since) {
                    Write-Host "  [+$(Format-Elapsed $sessionTimes.ingame_since)]" -NoNewline -ForegroundColor DarkGray
                }
                Write-Host ""
                continue
            }

            # ── Challenges ──────────────────────────────────────────────
            $ch = Parse-ChallengeLine -Line $line
            if ($null -ne $ch) {
                if ($ch.type -eq "challenge_success") {
                    Write-Host "$ts " -NoNewline -ForegroundColor DarkGray
                    Write-Host "[CHALLENGE] " -NoNewline -ForegroundColor Yellow
                    Write-Host "RÉUSSI : $($ch.name)" -ForegroundColor Yellow
                } else {
                    Write-Host "$ts " -NoNewline -ForegroundColor DarkGray
                    Write-Host "[CHALLENGE] " -NoNewline -ForegroundColor DarkGray
                    Write-Host "raté  : $($ch.name)" -ForegroundColor DarkGray
                }
                continue
            }

            # ── Kamas ────────────────────────────────────────────────────
            $km = Parse-KamasLine -Line $line
            if ($null -ne $km) {
                $delta = if ($km.type -eq "kamas_spent") { -$km.amount } else { $km.amount }
                if ($kamasBalance -ge 0) { $kamasBalance += $delta }
                $balStr  = if ($kamasBalance -ge 0) { "  solde: $(Format-Big $kamasBalance)" } else { "" }
                $sign    = if ($delta -gt 0) { "+" } else { "" }
                $color   = if ($delta -gt 0) { "Yellow" } else { "Red" }
                $label   = if ($delta -gt 0) { "[KAMAS +  ]" } else { "[KAMAS -  ]" }
                Write-Host "$ts " -NoNewline -ForegroundColor DarkGray
                Write-Host "$label " -NoNewline -ForegroundColor $color
                Write-Host "$sign$(Format-Big $delta) kamas$balStr" -ForegroundColor $color
                continue
            }

            # ── Quêtes ───────────────────────────────────────────────────
            if ($line -match '(?i)Qu.te .chou.e:\s*"([^"]+)"') {
                Write-Host "$ts " -NoNewline -ForegroundColor DarkGray
                Write-Host "[QUETE -  ] " -NoNewline -ForegroundColor Magenta
                Write-Host $Matches[1] -ForegroundColor Magenta
                continue
            }
            if ($line -match "(?i)Vous avez r.ussi la qu.te\s+(.+?)\.") {
                Write-Host "$ts " -NoNewline -ForegroundColor DarkGray
                Write-Host "[QUETE OK ] " -NoNewline -ForegroundColor Cyan
                Write-Host $Matches[1] -ForegroundColor Cyan
                continue
            }

            # ── Non-reconnu (optionnel) ───────────────────────────────────
            if ($ShowAll) {
                $preview = $line.Substring(0, [Math]::Min(100, $line.Length))
                Write-Host "$ts " -NoNewline -ForegroundColor DarkGray
                Write-Host "[...      ] " -NoNewline -ForegroundColor DarkGray
                Write-Host $preview -ForegroundColor DarkGray
            }
        }
    }
}
