param(
    [string]$PrefsRoot     = (Join-Path $env:APPDATA "zaap\gamesLogs\wakfu\preferences"),
    [string]$LogsRoot      = (Join-Path $env:APPDATA "zaap\gamesLogs\wakfu\logs"),
    [string]$DbPath        = (Join-Path $PSScriptRoot "monitor_session.db"),
    [string]$SchemaPath    = (Join-Path $PSScriptRoot "schema-session.sql"),
    [string]$CharacterName = "L'Immortel",
    [int]$PollMs = 500,
    [switch]$ShowAll
)

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

# wakfu_chat.log : XP, kamas, challenges, quêtes, [Proximité] (clan master potentiel)
# wakfu.log      : zones (on quitte le monde), positions (bZJ centré sur)
$SourceFiles = @(
    @{ name = "wakfu_chat.log"; role = "chat" },
    @{ name = "wakfu.log";      role = "zone" }
)

# ════════════════════════════════════════════════════════════════════════════
# UTILITAIRES
# ════════════════════════════════════════════════════════════════════════════
function Normalize-Int {
    param([string]$v)
    return [int64]([regex]::Replace($v, "[\s\u00A0\u202F']", ""))
}
function Format-Big { param([int64]$n); return "{0:N0}" -f $n }
function Get-IsoDate { return (Get-Date).ToString("o") }

function Format-Elapsed {
    param([datetime]$since)
    $s = [int]((Get-Date) - $since).TotalSeconds
    if ($s -lt 0)  { return "?" }
    if ($s -lt 60) { return "${s}s" }
    $m = [int]($s / 60); $s = $s % 60
    if ($m -lt 60) { return "${m}m${s}s" }
    $h = [int]($m / 60); $m = $m % 60
    return "${h}h${m}m"
}

function Get-SourceTs {
    param([string]$Line)
    if ($Line -match "\b(\d{2}:\d{2}:\d{2}),\d{3}\b") { return $Matches[1] }
    if ($Line -match "\b(\d{2}:\d{2}:\d{2})\b")       { return $Matches[1] }
    return "??:??:??"
}

function Log-TsToDatetime {
    param([string]$ts)
    if ([string]::IsNullOrWhiteSpace($ts)) { return $null }
    $today = Get-Date
    try {
        $dt = [datetime]::ParseExact("$($today.ToString('yyyy-MM-dd')) $ts", "yyyy-MM-dd HH:mm:ss", $null)
        if ($dt -gt $today) { $dt = $dt.AddDays(-1) }
        return $dt
    } catch { return $null }
}

function Sql-Escape { param([string]$v); return $v.Replace("'", "''") }

# ════════════════════════════════════════════════════════════════════════════
# SQLITE
# ════════════════════════════════════════════════════════════════════════════
$Script:SqliteBin = $null

function Find-Sqlite {
    if (Test-Path (Join-Path $PSScriptRoot "sqlite3.exe")) {
        return (Join-Path $PSScriptRoot "sqlite3.exe")
    }
    $g = Get-Command sqlite3 -ErrorAction SilentlyContinue
    if ($null -ne $g) { return $g.Source }
    return $null
}

function Exec-Sqlite {
    param([string]$Sql)
    $result = $Sql | & $Script:SqliteBin -noheader $DbPath
    if ($LASTEXITCODE -ne 0) { throw "SQLite error on: $($Sql.Substring(0,[Math]::Min(80,$Sql.Length)))" }
    return $result
}

function Query-Sqlite {
    param([string]$Sql)
    $result = $Sql | & $Script:SqliteBin -noheader -separator "|" $DbPath
    if ($LASTEXITCODE -ne 0) { return @() }
    return @($result)
}

function Init-Db {
    $schema = Get-Content $SchemaPath -Raw -Encoding UTF8
    $init = "PRAGMA journal_mode=WAL;`nPRAGMA busy_timeout=5000;`n$schema"
    $init | & $Script:SqliteBin $DbPath | Out-Null
}

# ════════════════════════════════════════════════════════════════════════════
# DÉTECTION PREFS / SESSION
# ════════════════════════════════════════════════════════════════════════════
function Read-LastCharacterName {
    $file = Get-ChildItem $PrefsRoot -Filter "accountPreferences*.properties" -ErrorAction SilentlyContinue |
            Sort-Object LastWriteTime -Descending | Select-Object -First 1
    if ($null -eq $file) { return $null }
    $line = Get-Content $file.FullName -Encoding UTF8 |
            Where-Object { $_ -match "^lastSelectedCharacterName=(.+)$" } | Select-Object -First 1
    if ($null -eq $line) { return $null }
    return ($line -replace "^lastSelectedCharacterName=", "").Trim()
}

function Read-SessionTimes {
    $result = @{ session_start = $null; ingame_since = $null }
    $logPath = Join-Path $LogsRoot "wakfu.log"
    if (-not (Test-Path $logPath)) { return $result }
    foreach ($line in (Get-Content $logPath -Encoding UTF8)) {
        if ($null -eq $result.session_start -and $line -match "\b(\d{2}:\d{2}:\d{2}),\d{3}\b") {
            $result.session_start = Log-TsToDatetime $Matches[1]
        }
        if ($null -eq $result.ingame_since -and $line -match "\[Information \((jeu|combat)\)\]") {
            if ($line -match "\b(\d{2}:\d{2}:\d{2}),\d{3}\b") {
                $result.ingame_since = Log-TsToDatetime $Matches[1]
            }
        }
        if ($null -ne $result.session_start -and $null -ne $result.ingame_since) { break }
    }
    return $result
}

# ════════════════════════════════════════════════════════════════════════════
# ZONES — résolution nom + cache en mémoire
# ════════════════════════════════════════════════════════════════════════════
$Script:WorldCache    = @{}   # worldId -> name (ou 'inconnu')
$Script:WorldsAsked   = @{}   # worldId -> bool (déjà demandé au joueur)

function Get-WorldName {
    param([int]$WorldId)
    if ($Script:WorldCache.ContainsKey($WorldId)) { return $Script:WorldCache[$WorldId] }
    $row = Query-Sqlite "SELECT name FROM worlds WHERE world_id = $WorldId;"
    if ($row.Count -gt 0 -and -not [string]::IsNullOrWhiteSpace($row[0])) {
        $n = $row[0].Trim()
        $Script:WorldCache[$WorldId] = $n
        return $n
    }
    return $null
}

function Upsert-World {
    param([int]$WorldId, [string]$Name)
    $n   = Sql-Escape $Name
    $now = Get-IsoDate
    Exec-Sqlite @"
INSERT INTO worlds (world_id, name, first_seen, last_seen)
VALUES ($WorldId, '$n', '$now', '$now')
ON CONFLICT(world_id) DO UPDATE SET
    name      = '$n',
    last_seen = '$now';
"@ | Out-Null
    $Script:WorldCache[$WorldId] = $Name
}

function Touch-World {
    param([int]$WorldId)
    $now = Get-IsoDate
    Exec-Sqlite @"
INSERT INTO worlds (world_id, name, first_seen, last_seen)
VALUES ($WorldId, NULL, '$now', '$now')
ON CONFLICT(world_id) DO UPDATE SET last_seen = '$now';
"@ | Out-Null
}

# ════════════════════════════════════════════════════════════════════════════
# ÉCRITURE DB
# ════════════════════════════════════════════════════════════════════════════
function Write-Session {
    param([string]$Id, [string]$CharName, [int]$CharLevel, [int64]$CharXpInLevel,
          [int64]$KamasStart, [string]$ClientStartTs, [string]$IngameSinceTs)
    $cn  = Sql-Escape $CharName
    $now = Get-IsoDate
    $cst = if ($null -ne $ClientStartTs)  { "'$(Sql-Escape $ClientStartTs)'" } else { "NULL" }
    $igs = if ($null -ne $IngameSinceTs)  { "'$(Sql-Escape $IngameSinceTs)'" } else { "NULL" }
    $lvl = if ($CharLevel -gt 0) { $CharLevel } else { "NULL" }
    $xpl = if ($CharXpInLevel -ge 0) { $CharXpInLevel } else { "NULL" }
    $km  = if ($KamasStart -ge 0) { $KamasStart } else { "NULL" }
    Exec-Sqlite "INSERT OR REPLACE INTO sessions VALUES ('$(Sql-Escape $Id)','$cn',$lvl,$xpl,$km,$cst,$igs,'$now');" | Out-Null
}

function Write-ZoneVisit {
    param([string]$SessionId, [int]$WorldId, [object]$PosX, [object]$PosY, [string]$SourceTs)
    $px  = if ($null -ne $PosX) { $PosX } else { "NULL" }
    $py  = if ($null -ne $PosY) { $PosY } else { "NULL" }
    $now = Get-IsoDate
    $sts = if ($null -ne $SourceTs) { "'$(Sql-Escape $SourceTs)'" } else { "NULL" }
    Exec-Sqlite "INSERT INTO zone_visits (session_id,world_id,pos_x,pos_y,visited_at,source_ts) VALUES ('$(Sql-Escape $SessionId)',$WorldId,$px,$py,'$now',$sts);" | Out-Null
}

function Write-XpEvent {
    param([string]$SessionId, [string]$SourceTs, [string]$EntityName, [string]$EntityType,
          [int64]$XpGained, [int64]$XpRemaining, [bool]$LevelUp, [object]$WorldId)
    $en  = Sql-Escape $EntityName
    $et  = Sql-Escape $EntityType
    $now = Get-IsoDate
    $sts = "'$(Sql-Escape $SourceTs)'"
    $lu  = if ($LevelUp) { 1 } else { 0 }
    $wid = if ($null -ne $WorldId) { $WorldId } else { "NULL" }
    Exec-Sqlite "INSERT INTO xp_events (session_id,recorded_at,source_ts,entity_name,entity_type,xp_gained,xp_remaining,level_up,world_id) VALUES ('$(Sql-Escape $SessionId)','$now',$sts,'$en','$et',$XpGained,$XpRemaining,$lu,$wid);" | Out-Null
}

function Write-XpCurve {
    param([string]$EntityName, [string]$EntityType, [int]$Level, [int64]$TotalXp)
    $en  = Sql-Escape $EntityName
    $et  = Sql-Escape $EntityType
    $now = Get-IsoDate
    Exec-Sqlite "INSERT OR REPLACE INTO xp_curve (entity_name,entity_type,level,total_xp,recorded_at) VALUES ('$en','$et',$Level,$TotalXp,'$now');" | Out-Null
}

function Write-KamasEvent {
    param([string]$SessionId, [string]$SourceTs, [int64]$Delta, [object]$Balance, [object]$WorldId)
    $now = Get-IsoDate
    $sts = "'$(Sql-Escape $SourceTs)'"
    $bal = if ($null -ne $Balance -and $Balance -ge 0) { $Balance } else { "NULL" }
    $wid = if ($null -ne $WorldId) { $WorldId } else { "NULL" }
    Exec-Sqlite "INSERT INTO kamas_events (session_id,recorded_at,source_ts,delta,balance,world_id) VALUES ('$(Sql-Escape $SessionId)','$now',$sts,$Delta,$bal,$wid);" | Out-Null
}

function Write-Challenge {
    param([string]$SessionId, [string]$SourceTs, [string]$Name, [string]$Result, [object]$WorldId)
    $n   = Sql-Escape $Name
    $now = Get-IsoDate
    $sts = "'$(Sql-Escape $SourceTs)'"
    $wid = if ($null -ne $WorldId) { $WorldId } else { "NULL" }
    Exec-Sqlite "INSERT INTO challenges (session_id,recorded_at,source_ts,name,result,world_id) VALUES ('$(Sql-Escape $SessionId)','$now',$sts,'$n','$(Sql-Escape $Result)',$wid);" | Out-Null
}

function Write-ProximityMsg {
    param([string]$SessionId, [string]$SourceTs, [string]$SpeakerName, [string]$Message, [object]$WorldId)
    $sp  = Sql-Escape $SpeakerName
    $msg = Sql-Escape $Message
    $now = Get-IsoDate
    $sts = "'$(Sql-Escape $SourceTs)'"
    $wid = if ($null -ne $WorldId) { $WorldId } else { "NULL" }
    Exec-Sqlite "INSERT INTO proximity_messages (session_id,world_id,speaker_name,message,recorded_at,source_ts) VALUES ('$(Sql-Escape $SessionId)',$wid,'$sp','$msg','$now',$sts);" | Out-Null
}

function Write-JobLevel {
    param([string]$EntityName, [int]$Level, [object]$XpInLevel)
    $en  = Sql-Escape $EntityName
    $now = Get-IsoDate
    $xpl = if ($null -ne $XpInLevel -and $XpInLevel -ge 0) { $XpInLevel } else { "NULL" }
    Exec-Sqlite "INSERT OR REPLACE INTO job_levels (entity_name,level,xp_in_level,updated_at) VALUES ('$en',$Level,$xpl,'$now');" | Out-Null
}

# ════════════════════════════════════════════════════════════════════════════
# PARSERS
# ════════════════════════════════════════════════════════════════════════════
function Parse-XpLine {
    param([string]$Line)
    $pat = "(?i)\]\s+(.+?)\s*:\s*\+([0-9\s\u00A0\u202F']+)\s+points d'XP\.\s*((?:\+\d+\s+niveau[x]?\.\s*)?)Prochain niveau dans\s*:\s*([0-9\s\u00A0\u202F']+)\."
    if (-not ($Line -match $pat)) { return $null }
    $entity    = $Matches[1].Trim()
    $xpGained  = Normalize-Int $Matches[2]
    $levelUp   = $Matches[3].Trim() -ne ""
    $remaining = Normalize-Int $Matches[4]
    # Discriminer par l'entité : seul le personnage principal est xp_character.
    # [Information (combat)] peut contenir du XP métier (ex: Trappeur en combat).
    $type      = if ($entity -eq $CharacterName) { "xp_character" } else { "xp_job" }
    return @{ type=$type; entity=$entity; xp_gained=$xpGained; remaining=$remaining; level_up=$levelUp }
}

function Parse-KamasLine {
    param([string]$Line)
    if ($Line -match "(?i)Vous avez gagn\S*\s+([0-9\s\u00A0\u202F']+)\s+kama(?:s)?\.") {
        return @{ type="kamas_gained"; amount=(Normalize-Int $Matches[1]) }
    }
    if ($Line -match "(?i)Vous avez perdu\s+([0-9\s\u00A0\u202F']+)\s+kama(?:s)?\.") {
        return @{ type="kamas_spent";  amount=(Normalize-Int $Matches[1]) }
    }
    return $null
}

function Parse-ChallengeLine {
    param([string]$Line)
    if ($Line -match '(?i)\[Information \(jeu\)\] Le challenge "([^"]+)" est r.ussi\.') {
        return @{ type="challenge_success"; name=$Matches[1] }
    }
    if ($Line -match '(?i)\[Information \(jeu\)\] Le challenge "([^"]+)" a .chou.\.') {
        return @{ type="challenge_failed";  name=$Matches[1] }
    }
    return $null
}

function Parse-ProximityLine {
    param([string]$Line)
    # [Proximité] Nom : message
    if ($Line -match '(?i)\[Proximit.\]\s+(.+?)\s*:\s*(.+)$') {
        return @{ speaker=$Matches[1].Trim(); message=$Matches[2].Trim() }
    }
    return $null
}

function Parse-ZoneLine {
    param([string]$Line)
    if ($Line -match "(?i)on quitte le monde (\d+)") {
        return @{ type="quitte_monde"; world_id=[int]$Matches[1] }
    }
    if ($Line -match "(?i)bZJ initialisé, centré sur \((-?\d+),(-?\d+)\)") {
        return @{ type="bzj_pos"; x=[int]$Matches[1]; y=[int]$Matches[2] }
    }
    return $null
}

# ════════════════════════════════════════════════════════════════════════════
# ETA
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
    $totalXp  = ($recent | Measure-Object -Property xp -Sum).Sum
    $xpPerMin = $totalXp / $spanMin
    if ($xpPerMin -le 0) { return $null }
    $xpPerHour = [int64]($xpPerMin * 60)
    $etaMin = $Remaining / $xpPerMin
    $h = [int]($etaMin / 60); $m = [int]($etaMin % 60)
    return @{
        eta_str = if ($h -gt 0) { "${h}h${m}m" } else { "${m}m" }
        xph_str = "$(Format-Big $xpPerHour) XP/h"
    }
}

# ════════════════════════════════════════════════════════════════════════════
# INIT SQLITE
# ════════════════════════════════════════════════════════════════════════════
$Script:SqliteBin = Find-Sqlite
if ($null -eq $Script:SqliteBin) {
    Write-Host "ERREUR: sqlite3 introuvable." -ForegroundColor Red
    exit 1
}
Init-Db

# ════════════════════════════════════════════════════════════════════════════
# STARTUP — config + détection
# ════════════════════════════════════════════════════════════════════════════
Clear-Host
Write-Host "═══════════════════════════════════════════════════════════════" -ForegroundColor Cyan
Write-Host "  WAKFU LIVE MONITOR  v3  (zones + DB)" -ForegroundColor White
Write-Host "═══════════════════════════════════════════════════════════════" -ForegroundColor Cyan
Write-Host ""

# ── Personnage (auto-détecté) ─────────────────────────────────────────────
$detectedName = Read-LastCharacterName
if (-not [string]::IsNullOrWhiteSpace($detectedName)) {
    Write-Host "  Personnage détecté : " -NoNewline -ForegroundColor DarkGray
    Write-Host $detectedName -ForegroundColor Green
    $c = (Read-Host "  Confirmer ? (Entrée = oui, ou tape un autre nom)").Trim()
    $charName = if ([string]::IsNullOrWhiteSpace($c)) { $detectedName } else { $c }
} else {
    $charName = (Read-Host "  Nom du personnage").Trim()
    if ([string]::IsNullOrWhiteSpace($charName)) { $charName = "?" }
}

# ── Niveau personnage ─────────────────────────────────────────────────────
$charLevel = 0
$v = (Read-Host "  Niveau actuel (Entrée pour ignorer)").Trim()
$null = [int]::TryParse($v, [ref]$charLevel)

# ── XP déjà dans le niveau ────────────────────────────────────────────────
$charXpInLevel = [int64]-1
$v = (Read-Host "  XP déjà dans ce niveau (Entrée pour ignorer)").Trim()
if (-not [string]::IsNullOrWhiteSpace($v)) {
    $vn = [int64]0
    if ([int64]::TryParse([regex]::Replace($v,"[\s\u00A0\u202F'_,]",""), [ref]$vn)) { $charXpInLevel = $vn }
}

# ── Kamas ─────────────────────────────────────────────────────────────────
$kamasBalance = [int64]-1
$v = (Read-Host "  Kamas actuels (Entrée pour ignorer)").Trim()
if (-not [string]::IsNullOrWhiteSpace($v)) {
    $vn = [int64]0
    if ([int64]::TryParse([regex]::Replace($v,"[\s\u00A0\u202F'_,]",""), [ref]$vn)) { $kamasBalance = $vn }
}

# ── Heure de connexion ────────────────────────────────────────────────────
$sessionTimes = Read-SessionTimes
$sessionId    = (Get-Date).ToString("o")

# ── Sauvegarder la session en DB ──────────────────────────────────────────
$cstStr = if ($null -ne $sessionTimes.session_start) { $sessionTimes.session_start.ToString("o") } else { $null }
$igsStr = if ($null -ne $sessionTimes.ingame_since)  { $sessionTimes.ingame_since.ToString("o")  } else { $null }
Write-Session -Id $sessionId -CharName $charName -CharLevel $charLevel `
    -CharXpInLevel $charXpInLevel -KamasStart $kamasBalance `
    -ClientStartTs $cstStr -IngameSinceTs $igsStr

# ── Affichage résumé ──────────────────────────────────────────────────────
Write-Host ""
Write-Host "─── Session ─────────────────────────────────────────────────────" -ForegroundColor DarkGray
Write-Host ("  Perso  : $charName" + $(if ($charLevel -gt 0) { "  niv.$charLevel" } else { "" })) -ForegroundColor White
if ($charXpInLevel -ge 0) {
    Write-Host "  XP niv : $(Format-Big $charXpInLevel)" -ForegroundColor DarkGray
}
Write-Host ("  Kamas  : " + $(if ($kamasBalance -ge 0) { Format-Big $kamasBalance } else { "non suivi" })) -ForegroundColor White
if ($null -ne $sessionTimes.session_start) {
    Write-Host "  Client : $($sessionTimes.session_start.ToString('HH:mm:ss'))  (+$(Format-Elapsed $sessionTimes.session_start))" -ForegroundColor DarkGray
}
if ($null -ne $sessionTimes.ingame_since) {
    Write-Host "  En jeu : $($sessionTimes.ingame_since.ToString('HH:mm:ss'))  (+$(Format-Elapsed $sessionTimes.ingame_since))" -ForegroundColor Cyan
}
Write-Host "  DB     : $DbPath" -ForegroundColor DarkGray
Write-Host "  Ctrl+C pour quitter" -ForegroundColor DarkGray
Write-Host "═══════════════════════════════════════════════════════════════" -ForegroundColor Cyan
Write-Host ""

# ════════════════════════════════════════════════════════════════════════════
# ÉTAT RUNTIME
# ════════════════════════════════════════════════════════════════════════════
$cursors      = @{}   # path -> int (dernière ligne lue)
$xpHistory    = @{}   # "type|entity" -> List[@{t;xp}]
$jobLevels    = @{}   # job_name -> int
$jobXpInLev   = @{}   # job_name -> int64
$jobsSeen     = @{}   # job_name -> bool
$xpCurve      = @{}   # "type|entity" -> List[@{level;total}]
$levelTotals  = @{}   # "type|entity" -> int64
$currentWorld = $null # dernier worldId vu (depuis "on quitte le monde")
$pendingPos   = $null # @{x;y} attendant d'être lié au prochain visit

# Charger les niveaux de métiers depuis DB (persistance inter-sessions)
$dbJobRows = Query-Sqlite "SELECT entity_name, level, xp_in_level FROM job_levels;"
foreach ($row in $dbJobRows) {
    if ([string]::IsNullOrWhiteSpace($row)) { continue }
    $parts = $row -split "\|"
    if ($parts.Count -ge 2) {
        $jName = $parts[0].Trim()
        $jLvl  = [int]$parts[1].Trim()
        $jobLevels[$jName] = $jLvl
        $jobsSeen[$jName]  = $true
        if ($parts.Count -ge 3 -and -not [string]::IsNullOrWhiteSpace($parts[2])) {
            $jobXpInLev[$jName] = [int64]$parts[2].Trim()
        }
        Write-Host "  [DB] Métier restauré : $jName niv.$jLvl" -ForegroundColor DarkGray
    }
}

# Init curseurs
foreach ($src in $SourceFiles) {
    $path = Join-Path $LogsRoot $src.name
    if (Test-Path $path) {
        $lines = Get-Content $path -Encoding UTF8
        $cursors[$path] = $lines.Count
        Write-Host "  [SUIVI]  $($src.name) — $($lines.Count) lignes passées ignorées" -ForegroundColor DarkGreen
    } else {
        $cursors[$path] = 0
        Write-Host "  [ABSENT] $($src.name)" -ForegroundColor DarkGray
    }
}

Write-Host ""
Write-Host "En attente d'events..." -ForegroundColor DarkGray
Write-Host ("─" * 63) -ForegroundColor DarkGray

# ════════════════════════════════════════════════════════════════════════════
# BOUCLE PRINCIPALE
# ════════════════════════════════════════════════════════════════════════════
while ($true) {
    Start-Sleep -Milliseconds $PollMs

    foreach ($src in $SourceFiles) {
        $path = Join-Path $LogsRoot $src.name
        if (-not (Test-Path $path)) { continue }

        $allLines  = Get-Content $path -Encoding UTF8
        $lineCount = $allLines.Count
        $from      = $cursors[$path]

        if ($lineCount -lt $from) { $from = 0; Write-Host "[ROTATION] $($src.name)" -ForegroundColor DarkYellow }
        if ($lineCount -le $from) { continue }

        $newLines       = $allLines[$from..($lineCount - 1)]
        $cursors[$path] = $lineCount

        foreach ($line in $newLines) {
            if ([string]::IsNullOrWhiteSpace($line)) { continue }
            $ts = Get-SourceTs -Line $line

            # ═══════════════════════════════════════════════════════════════
            # ZONE (wakfu.log uniquement)
            # ═══════════════════════════════════════════════════════════════
            if ($src.role -eq "zone") {
                $z = Parse-ZoneLine -Line $line
                if ($null -ne $z) {
                    if ($z.type -eq "quitte_monde") {
                        $wid  = $z.world_id
                        $name = Get-WorldName -WorldId $wid

                        # Enregistrer la visite dans la DB (position sera liée via pendingPos)
                        $px = if ($null -ne $pendingPos) { $pendingPos.x } else { $null }
                        $py = if ($null -ne $pendingPos) { $pendingPos.y } else { $null }
                        Write-ZoneVisit -SessionId $sessionId -WorldId $wid -PosX $px -PosY $py -SourceTs $ts
                        Touch-World -WorldId $wid
                        $pendingPos   = $null
                        $currentWorld = $wid

                        # Premier contact avec ce monde → demander le nom si inconnu
                        if ($null -eq $name -and -not $Script:WorldsAsked.ContainsKey($wid)) {
                            $Script:WorldsAsked[$wid] = $true
                            Write-Host ""
                            Write-Host "  ┌─ NOUVEAU MONDE DÉTECTÉ : #$wid" -ForegroundColor Yellow
                            $ni = (Read-Host "  │  Nom de cette zone ? (Entrée = 'inconnu #$wid')").Trim()
                            if ([string]::IsNullOrWhiteSpace($ni)) { $ni = "inconnu #$wid" }
                            Upsert-World -WorldId $wid -Name $ni
                            $name = $ni
                            Write-Host "  └─ Sauvegardé : $ni" -ForegroundColor Yellow
                        }

                        $label = if (-not [string]::IsNullOrWhiteSpace($name)) { $name } else { "monde #$wid" }
                        Write-Host "$ts " -NoNewline -ForegroundColor DarkGray
                        Write-Host "[ZONE      ] " -NoNewline -ForegroundColor DarkYellow
                        Write-Host $label -ForegroundColor DarkYellow

                    } elseif ($z.type -eq "bzj_pos") {
                        $pendingPos = @{ x = $z.x; y = $z.y }
                        # Silencieux, sauf si ShowAll
                        if ($ShowAll) {
                            Write-Host "$ts " -NoNewline -ForegroundColor DarkGray
                            Write-Host "[POS       ] " -NoNewline -ForegroundColor DarkGray
                            Write-Host "($($z.x),$($z.y))" -ForegroundColor DarkGray
                        }
                    }
                }
                continue  # wakfu.log : ne traiter QUE les zones
            }

            # ═══════════════════════════════════════════════════════════════
            # CHAT (wakfu_chat.log)
            # ═══════════════════════════════════════════════════════════════

            # ── XP ──────────────────────────────────────────────────────
            $xp = Parse-XpLine -Line $line
            if ($null -ne $xp) {
                if ($xp.type -eq "xp_character" -and $xp.entity -ne $charName) { continue }

                $key = "$($xp.type)|$($xp.entity)"

                # Nouveau métier → demander niveau (ou charger depuis DB)
                if ($xp.type -eq "xp_job" -and -not $jobsSeen.ContainsKey($xp.entity)) {
                    $jobsSeen[$xp.entity] = $true
                    Write-Host ""
                    Write-Host "  ┌─ NOUVEAU MÉTIER : $($xp.entity)" -ForegroundColor Cyan
                    $jv = 0
                    $ji = (Read-Host "  │  Niveau actuel (Entrée = ?)").Trim()
                    if ([int]::TryParse($ji, [ref]$jv)) { $jobLevels[$xp.entity] = $jv }
                    $jxp = [int64]-1
                    $ji2 = (Read-Host "  │  XP déjà dans ce niveau (Entrée = ignorer)").Trim()
                    if (-not [string]::IsNullOrWhiteSpace($ji2)) {
                        $jxpv = [int64]0
                        if ([int64]::TryParse([regex]::Replace($ji2,"[\s\u00A0\u202F'_,]",""), [ref]$jxpv)) {
                            $jxp = $jxpv; $jobXpInLev[$xp.entity] = $jxp
                        }
                    }
                    Write-JobLevel -EntityName $xp.entity -Level $jv -XpInLevel ($jxp -ge 0 ? $jxp : $null)
                    $xpCurve[$key]    = [System.Collections.Generic.List[object]]::new()
                    $levelTotals[$key] = [int64]-1
                    Write-Host "  └────────────────────────────────────────────────" -ForegroundColor Cyan
                }

                # Total XP du niveau courant (xpInLevel + gained + remaining)
                if (-not $levelTotals.ContainsKey($key) -or $levelTotals[$key] -lt 0) {
                    $initXp = [int64]-1
                    if ($xp.type -eq "xp_character" -and $charXpInLevel -ge 0) { $initXp = $charXpInLevel }
                    elseif ($xp.type -eq "xp_job" -and $jobXpInLev.ContainsKey($xp.entity)) { $initXp = $jobXpInLev[$xp.entity] }
                    if ($initXp -ge 0) {
                        $levelTotals[$key] = $initXp + $xp.xp_gained + $xp.remaining
                        if (-not $xpCurve.ContainsKey($key)) {
                            $xpCurve[$key] = [System.Collections.Generic.List[object]]::new()
                        }
                    }
                }

                # Historique taux
                if (-not $xpHistory.ContainsKey($key)) {
                    $xpHistory[$key] = [System.Collections.Generic.List[object]]::new()
                }
                $xpHistory[$key].Add(@{ t = Get-Date; xp = $xp.xp_gained })

                # Écriture DB
                Write-XpEvent -SessionId $sessionId -SourceTs $ts -EntityName $xp.entity `
                    -EntityType $xp.type -XpGained $xp.xp_gained -XpRemaining $xp.remaining `
                    -LevelUp $xp.level_up -WorldId $currentWorld

                $eta = Get-Eta -Key $key -Remaining $xp.remaining -History $xpHistory

                if ($xp.type -eq "xp_character") {
                    $lvlStr = if ($charLevel -gt 0) { "niv.$charLevel" } else { "niv.?" }
                    $color = "Green"; $label = "PERSO XP "
                } else {
                    $jlv    = if ($jobLevels.ContainsKey($xp.entity)) { $jobLevels[$xp.entity] } else { 0 }
                    $lvlStr = if ($jlv -gt 0) { "niv.$jlv" } else { "niv.?" }
                    $color = "DarkCyan"; $label = "MÉTIER XP"
                }

                if ($xp.level_up) {
                    $lvlOld = if ($xp.type -eq "xp_character") { $charLevel } else { if ($jobLevels.ContainsKey($xp.entity)) { $jobLevels[$xp.entity] } else { 0 } }
                    if ($levelTotals.ContainsKey($key) -and $levelTotals[$key] -gt 0 -and $lvlOld -gt 0) {
                        if (-not $xpCurve.ContainsKey($key)) { $xpCurve[$key] = [System.Collections.Generic.List[object]]::new() }
                        $xpCurve[$key].Add(@{ level=$lvlOld; total=$levelTotals[$key] })
                        Write-XpCurve -EntityName $xp.entity -EntityType $xp.type -Level $lvlOld -TotalXp $levelTotals[$key]
                    }
                    Write-Host ""; Write-Host "  ★  NIVEAU SUIVANT — $($xp.entity) !  ★" -ForegroundColor Yellow; Write-Host ""
                    if ($xp.type -eq "xp_character" -and $charLevel -gt 0) { $charLevel++ }
                    if ($xp.type -eq "xp_job" -and $jobLevels.ContainsKey($xp.entity)) {
                        $jobLevels[$xp.entity]++
                        Write-JobLevel -EntityName $xp.entity -Level $jobLevels[$xp.entity] -XpInLevel 0
                    }
                    $xpHistory[$key]    = [System.Collections.Generic.List[object]]::new()
                    $levelTotals[$key]  = if ($xp.type -eq "xp_job") { $xp.remaining } else { [int64]-1 }
                    if ($xp.type -eq "xp_character") { $charXpInLevel = 0 }
                    if ($xp.type -eq "xp_job")        { $jobXpInLev[$xp.entity] = 0 }
                }

                $totalStr = if ($levelTotals.ContainsKey($key) -and $levelTotals[$key] -gt 0) { "/$(Format-Big $levelTotals[$key])" } else { "" }
                $zoneStr  = if ($null -ne $currentWorld) { "  [$(Get-WorldName $currentWorld ?? "monde #$currentWorld")]" } else { "" }

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
                if ($null -ne $sessionTimes.ingame_since) {
                    Write-Host "  +$(Format-Elapsed $sessionTimes.ingame_since)" -NoNewline -ForegroundColor DarkGray
                }
                Write-Host ""
                continue
            }

            # ── Challenges ───────────────────────────────────────────────
            $ch = Parse-ChallengeLine -Line $line
            if ($null -ne $ch) {
                Write-Challenge -SessionId $sessionId -SourceTs $ts -Name $ch.name -Result $ch.type -WorldId $currentWorld
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
                Write-KamasEvent -SessionId $sessionId -SourceTs $ts -Delta $delta `
                    -Balance $kamasBalance -WorldId $currentWorld
                $balStr = if ($kamasBalance -ge 0) { "  solde: $(Format-Big $kamasBalance)" } else { "" }
                $sign   = if ($delta -gt 0) { "+" } else { "" }
                $color  = if ($delta -gt 0) { "Yellow" } else { "Red" }
                $lbl    = if ($delta -gt 0) { "[KAMAS +  ]" } else { "[KAMAS -  ]" }
                Write-Host "$ts " -NoNewline -ForegroundColor DarkGray
                Write-Host "$lbl " -NoNewline -ForegroundColor $color
                Write-Host "$sign$(Format-Big $delta) kamas$balStr" -ForegroundColor $color
                continue
            }

            # ── Proximité — potentiel clan master ─────────────────────────
            $prox = Parse-ProximityLine -Line $line
            if ($null -ne $prox) {
                Write-ProximityMsg -SessionId $sessionId -SourceTs $ts `
                    -SpeakerName $prox.speaker -Message $prox.message -WorldId $currentWorld
                # Affichage discret (clan master potentiel, surtout juste après un changement de zone)
                Write-Host "$ts " -NoNewline -ForegroundColor DarkGray
                Write-Host "[PROXIMIT.] " -NoNewline -ForegroundColor DarkGray
                Write-Host "$($prox.speaker) : $($prox.message.Substring(0,[Math]::Min(60,$prox.message.Length)))" -ForegroundColor DarkGray
                continue
            }

            # ── Quêtes ───────────────────────────────────────────────────
            if ($line -match '(?i)Qu.te .chou.e:\s*"([^"]+)"') {
                Write-Host "$ts " -NoNewline -ForegroundColor DarkGray
                Write-Host "[QUETE -  ] " -NoNewline -ForegroundColor Magenta
                Write-Host $Matches[1] -ForegroundColor Magenta; continue
            }
            if ($line -match "(?i)Vous avez r.ussi la qu.te\s+(.+?)\.") {
                Write-Host "$ts " -NoNewline -ForegroundColor DarkGray
                Write-Host "[QUETE OK ] " -NoNewline -ForegroundColor Cyan
                Write-Host $Matches[1] -ForegroundColor Cyan; continue
            }

            # ── Non-reconnu ──────────────────────────────────────────────
            if ($ShowAll) {
                Write-Host "$ts " -NoNewline -ForegroundColor DarkGray
                Write-Host "[...      ] " -NoNewline -ForegroundColor DarkGray
                Write-Host $line.Substring(0,[Math]::Min(100,$line.Length)) -ForegroundColor DarkGray
            }
        }
    }
}
