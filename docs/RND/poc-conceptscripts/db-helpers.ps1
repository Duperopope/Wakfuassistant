# ============================================================
# WAKFU ASSISTANT — Helpers DB partages
# Usage : . (Join-Path $PSScriptRoot "db-helpers.ps1")
# ============================================================

$script:_SqlitePath = $null
$script:_DbPath     = $null

# ── sqlite3 discovery ─────────────────────────────────────────
function Resolve-SqlitePath {
    param([string]$PreferredPath)
    if (Test-Path -Path $PreferredPath -PathType Leaf) { return $PreferredPath }
    $g = Get-Command sqlite3 -ErrorAction SilentlyContinue
    if ($null -ne $g -and -not [string]::IsNullOrWhiteSpace($g.Source)) {
        if ([System.IO.Path]::IsPathRooted($g.Source)) { return $g.Source }
    }
    $w = & where.exe sqlite3 2>$null
    if ($LASTEXITCODE -eq 0 -and -not [string]::IsNullOrWhiteSpace($w)) {
        return ($w | Select-Object -First 1)
    }
    return $null
}

# ── Primitives SQL ────────────────────────────────────────────
function Escape-Sql {
    param([string]$V)
    if ($null -eq $V) { return "" }
    return $V.Replace("'", "''")
}

function New-IsoNow { return (Get-Date).ToString("o") }

function Invoke-Sql {
    param([string]$Sql, [switch]$Rows)
    $sqlArgs = @("-noheader")
    if ($Rows) { $sqlArgs += @("-separator", "|") }
    $result = $Sql | & $script:_SqlitePath @sqlArgs $script:_DbPath
    if ($LASTEXITCODE -ne 0) { throw "SQLite error on: $($Sql.Substring(0, [Math]::Min(80, $Sql.Length)))" }
    if ($null -eq $result) { return @() }
    return @($result)
}

function Invoke-SqlBatch {
    param([string]$Sql)
    $null = $Sql | & $script:_SqlitePath $script:_DbPath
    if ($LASTEXITCODE -ne 0) { throw "SQLite batch error" }
}

function Initialize-Db {
    param([string]$SqlitePath, [string]$DbPath, [string[]]$SchemaFiles)
    $script:_SqlitePath = $SqlitePath
    $script:_DbPath     = $DbPath
    $init = "PRAGMA journal_mode=WAL;`nPRAGMA synchronous=NORMAL;`nPRAGMA busy_timeout=5000;`n"
    foreach ($sf in $SchemaFiles) {
        if (Test-Path $sf) { $init += (Get-Content $sf -Raw -Encoding UTF8) + "`n" }
    }
    $null = $init | & $SqlitePath $DbPath
    if ($LASTEXITCODE -ne 0) { throw "Schema init failed" }
}

# ── Detection contexte Wakfu ──────────────────────────────────
function Get-WakfuServer {
    $logsDir = Join-Path $env:APPDATA "zaap\gamesLogs\wakfu\logs"
    $wl = Join-Path $logsDir "wakfu.log"
    if (-not (Test-Path $wl)) { return "inconnu" }
    $line = Get-Content $wl -ErrorAction SilentlyContinue |
        Where-Object { $_ -match "wakfu-\w+\.ankama-games\.com:5556" } | Select-Object -Last 1
    if ($null -ne $line -and $line -match "wakfu-(\w+)\.ankama-games\.com:5556") { return $Matches[1] }
    return "inconnu"
}

function Get-WakfuCharacter {
    $p = Get-Process | Where-Object { $_.MainWindowTitle -match "- WAKFU$" } | Select-Object -First 1
    if ($null -eq $p) { return $null }
    return ($p.MainWindowTitle -replace "\s*-\s*WAKFU$", "").Trim()
}

# ── Job levels ────────────────────────────────────────────────
function Get-JobLevel {
    param([string]$Server, [string]$JobName)
    $row = @(Invoke-Sql -Rows -Sql "SELECT level FROM job_levels WHERE server='$(Escape-Sql $Server)' AND job_name='$(Escape-Sql $JobName)';")
    if ($row.Count -eq 0 -or [string]::IsNullOrWhiteSpace($row[0])) { return $null }
    return [int]($row[0])
}

function Set-JobLevel {
    param([string]$Server, [string]$JobName, [int]$Level)
    $now = Escape-Sql (New-IsoNow)
    $s = Escape-Sql $Server; $j = Escape-Sql $JobName
    Invoke-Sql -Sql "INSERT INTO job_levels (server,job_name,level,updated_at) VALUES ('$s','$j',$Level,'$now') ON CONFLICT(server,job_name) DO UPDATE SET level=$Level, updated_at='$now';"
}

function Get-AllJobLevels {
    param([string]$Server)
    $result = @{}
    $rows = Invoke-Sql -Rows -Sql "SELECT job_name,level FROM job_levels WHERE server='$(Escape-Sql $Server)';"
    foreach ($r in $rows) {
        if ([string]::IsNullOrWhiteSpace($r)) { continue }
        $p = $r -split '\|'
        $result[$p[0]] = [int]$p[1]
    }
    return $result
}

# ── Character levels ──────────────────────────────────────────
function Get-CharacterLevel {
    param([string]$Server, [string]$CharacterName)
    $row = @(Invoke-Sql -Rows -Sql "SELECT level FROM character_levels WHERE server='$(Escape-Sql $Server)' AND character_name='$(Escape-Sql $CharacterName)';")
    if ($row.Count -eq 0 -or [string]::IsNullOrWhiteSpace($row[0])) { return $null }
    return [int]($row[0])
}

function Set-CharacterLevel {
    param([string]$Server, [string]$CharacterName, [int]$Level)
    $now = Escape-Sql (New-IsoNow)
    $s = Escape-Sql $Server; $c = Escape-Sql $CharacterName
    Invoke-Sql -Sql "INSERT INTO character_levels (server,character_name,level,updated_at) VALUES ('$s','$c',$Level,'$now') ON CONFLICT(server,character_name) DO UPDATE SET level=$Level, updated_at='$now';"
}

# ── XP events ────────────────────────────────────────────────
function Add-XpEvent {
    param(
        [string]$Server, [string]$Character, [string]$SourceTs, [string]$AbsoluteTs,
        [string]$EntityName, [string]$EntityType, [int64]$XpGained, [int64]$XpRemaining, [int]$LevelUp
    )
    $now = Escape-Sql (New-IsoNow)
    $s = Escape-Sql $Server; $c = Escape-Sql $Character; $e = Escape-Sql $EntityName
    $st = Escape-Sql $SourceTs; $at = Escape-Sql $AbsoluteTs; $et = Escape-Sql $EntityType
    Invoke-Sql -Sql "INSERT OR IGNORE INTO xp_events (server,character_name,source_ts,absolute_ts,entity_name,entity_type,xp_gained,xp_remaining,level_up,inserted_at) VALUES ('$s','$c','$st','$at','$e','$et',$XpGained,$XpRemaining,$LevelUp,'$now');"
}

function Add-XpEventsBatch {
    param([object[]]$Events)
    if ($Events.Count -eq 0) { return }
    $now = Escape-Sql (New-IsoNow)
    $sql = "BEGIN;`n"
    foreach ($ev in $Events) {
        $s = Escape-Sql $ev.server; $c = Escape-Sql $ev.character; $e = Escape-Sql $ev.entity
        $st = Escape-Sql $ev.sourceTs; $at = Escape-Sql $ev.absoluteTs; $et = Escape-Sql $ev.entityType
        $sql += "INSERT OR IGNORE INTO xp_events (server,character_name,source_ts,absolute_ts,entity_name,entity_type,xp_gained,xp_remaining,level_up,inserted_at) VALUES ('$s','$c','$st','$at','$e','$et',$($ev.xpGained),$($ev.xpRemaining),$($ev.levelUp),'$now');`n"
    }
    $sql += "COMMIT;"
    Invoke-SqlBatch -Sql $sql
}

function Get-JobLevelUps {
    param([string]$Server, [string]$JobName)
    $s = Escape-Sql $Server; $j = Escape-Sql $JobName
    $rows = Invoke-Sql -Rows -Sql "SELECT xp_gained,xp_remaining,level_up,source_ts,absolute_ts FROM xp_events WHERE server='$s' AND entity_name='$j' AND entity_type='job' AND level_up>0 ORDER BY id;"
    return $rows | ForEach-Object {
        if ([string]::IsNullOrWhiteSpace($_)) { return }
        $p = $_ -split '\|'
        @{ xpGained=[int64]$p[0]; xpRemaining=[int64]$p[1]; levelUp=[int]$p[2]; sourceTs=$p[3]; absoluteTs=$p[4] }
    }
}

function Get-HarvestCount {
    param([string]$Server, [string[]]$HarvestJobs)
    $inList = ($HarvestJobs | ForEach-Object { "'$(Escape-Sql $_)'" }) -join ","
    $row = @(Invoke-Sql -Rows -Sql "SELECT COUNT(*) FROM xp_events WHERE server='$(Escape-Sql $Server)' AND entity_type='job' AND entity_name IN ($inList);")
    if ($row.Count -eq 0 -or [string]::IsNullOrWhiteSpace($row[0])) { return 0 }
    return [int64]($row[0])
}

function Get-HarvestCountPerJob {
    param([string]$Server, [string[]]$HarvestJobs)
    $inList = ($HarvestJobs | ForEach-Object { "'$(Escape-Sql $_)'" }) -join ","
    $result = @{}
    $rows = Invoke-Sql -Rows -Sql "SELECT entity_name,COUNT(*),SUM(xp_gained) FROM xp_events WHERE server='$(Escape-Sql $Server)' AND entity_type='job' AND entity_name IN ($inList) GROUP BY entity_name;"
    foreach ($r in $rows) {
        if ([string]::IsNullOrWhiteSpace($r)) { continue }
        $p = $r -split '\|'
        $result[$p[0]] = @{ count=[int64]$p[1]; totalXp=[int64]$p[2] }
    }
    return $result
}

# ── Job resources (auto-learned) ──────────────────────────────
function Add-JobResource {
    param([string]$JobName, [string]$ItemName, [int]$Qty)
    $now = Escape-Sql (New-IsoNow); $j = Escape-Sql $JobName; $i = Escape-Sql $ItemName
    Invoke-Sql -Sql "INSERT INTO job_resources (job_name,item_name,last_seen,harvest_count,total_qty) VALUES ('$j','$i','$now',1,$Qty) ON CONFLICT(job_name,item_name) DO UPDATE SET harvest_count=harvest_count+1, total_qty=total_qty+$Qty, last_seen='$now';"
}

function Get-JobResourcesSummary {
    param([string]$JobName)
    $j = Escape-Sql $JobName
    $rows = @(Invoke-Sql -Rows -Sql "SELECT item_name,harvest_count,total_qty FROM job_resources WHERE job_name='$j' ORDER BY harvest_count DESC;")
    $result = @()
    foreach ($r in $rows) {
        if ([string]::IsNullOrWhiteSpace($r)) { continue }
        $p = $r -split '\|'
        $result += @{ item=$p[0]; count=[int64]$p[1]; qty=[int64]$p[2] }
    }
    return $result
}

function Get-JobForItem {
    param([string]$ItemName)
    $i = Escape-Sql $ItemName
    $row = @(Invoke-Sql -Rows -Sql "SELECT job_name FROM job_resources WHERE item_name='$i' LIMIT 1;")
    if ($row.Count -eq 0 -or [string]::IsNullOrWhiteSpace($row[0])) { return $null }
    return $row[0]
}

# ── Sync universel (commandes chat in-game) ──────────────────
# Normalise un nom : lowercase, sans accents, sans espaces/apostrophes
function Normalize-Name {
    param([string]$Name)
    return ($Name.ToLower() -replace "[éèêë]","e" -replace "[àâä]","a" -replace "[îïì]","i" -replace "[ûüù]","u" -replace "[ôö]","o" -replace "[ç]","c" -replace "['`" ]","" -replace "\s","")
}

function Set-SyncData {
    param([string]$Server, [string]$Category, [string]$Key, [string]$KeyDisplay, [int64]$Value, [string]$Source = 'chat')
    $now = Escape-Sql (New-IsoNow); $s = Escape-Sql $Server
    $cat = Escape-Sql $Category; $k = Escape-Sql $Key; $kd = Escape-Sql $KeyDisplay; $src = Escape-Sql $Source
    Invoke-Sql -Sql "INSERT INTO sync_data (server,category,key,key_display,value,updated_at,source) VALUES ('$s','$cat','$k','$kd',$Value,'$now','$src') ON CONFLICT(server,category,key) DO UPDATE SET value=$Value, key_display='$kd', updated_at='$now', source='$src';"
}

function Get-SyncData {
    param([string]$Server, [string]$Category, [string]$Key)
    $s = Escape-Sql $Server; $cat = Escape-Sql $Category; $k = Escape-Sql $Key
    $row = @(Invoke-Sql -Rows -Sql "SELECT value,key_display,source FROM sync_data WHERE server='$s' AND category='$cat' AND key='$k';")
    if ($row.Count -eq 0 -or [string]::IsNullOrWhiteSpace($row[0])) { return $null }
    $p = $row[0] -split '\|'
    return @{ value=[int64]$p[0]; display=$p[1]; source=$p[2] }
}

function Add-SyncDelta {
    param([string]$Server, [string]$Category, [string]$Key, [string]$KeyDisplay, [int64]$Delta)
    $now = Escape-Sql (New-IsoNow); $s = Escape-Sql $Server
    $cat = Escape-Sql $Category; $k = Escape-Sql $Key; $kd = Escape-Sql $KeyDisplay
    # Si la ligne existe, increment; sinon on cree avec delta comme valeur initiale
    Invoke-Sql -Sql "INSERT INTO sync_data (server,category,key,key_display,value,updated_at,source) VALUES ('$s','$cat','$k','$kd',$Delta,'$now','auto') ON CONFLICT(server,category,key) DO UPDATE SET value=value+($Delta), key_display='$kd', updated_at='$now';"
}

function Get-AllSyncData {
    param([string]$Server, [string]$Category)
    $s = Escape-Sql $Server; $cat = Escape-Sql $Category
    $rows = @(Invoke-Sql -Rows -Sql "SELECT key,key_display,value,source FROM sync_data WHERE server='$s' AND category='$cat';")
    $result = @{}
    foreach ($r in $rows) {
        if ([string]::IsNullOrWhiteSpace($r)) { continue }
        $p = $r -split '\|'
        $result[$p[0]] = @{ display=$p[1]; value=[int64]$p[2]; source=$p[3] }
    }
    return $result
}

# ── Item prices (auto-detected from HDV) ─────────────────────
function Add-ItemPrice {
    param([string]$Server, [string]$ItemName, [string]$ItemKey, [int64]$UnitPrice,
          [int64]$TotalPrice, [int]$Quantity, [string]$Direction, [string]$SourceTs, [string]$Character)
    $now = Escape-Sql (New-IsoNow); $s = Escape-Sql $Server
    $i = Escape-Sql $ItemName; $ik = Escape-Sql $ItemKey; $d = Escape-Sql $Direction
    $st = Escape-Sql $SourceTs; $c = Escape-Sql $Character
    Invoke-Sql -Sql "INSERT INTO item_prices (server,item_name,item_key,unit_price,total_price,quantity,direction,observed_at,source_ts,character_name) VALUES ('$s','$i','$ik',$UnitPrice,$TotalPrice,$Quantity,'$d','$now','$st','$c');"
}

function Get-LastItemPrice {
    param([string]$Server, [string]$ItemKey)
    $s = Escape-Sql $Server; $ik = Escape-Sql $ItemKey
    $row = @(Invoke-Sql -Rows -Sql "SELECT unit_price,direction,observed_at FROM item_prices WHERE server='$s' AND item_key='$ik' ORDER BY id DESC LIMIT 1;")
    if ($row.Count -eq 0 -or [string]::IsNullOrWhiteSpace($row[0])) { return $null }
    $p = $row[0] -split '\|'
    return @{ unitPrice=[int64]$p[0]; direction=$p[1]; observedAt=$p[2] }
}

# ── XP curve observed ────────────────────────────────────────
function Set-XpCurveObserved {
    param([string]$CurveType, [int]$Level, [int64]$XpRequired)
    $now = Escape-Sql (New-IsoNow); $ct = Escape-Sql $CurveType
    Invoke-Sql -Sql "INSERT INTO xp_curve_observed (curve_type,level,xp_required,observed_at,source) VALUES ('$ct',$Level,$XpRequired,'$now','live') ON CONFLICT(curve_type,level) DO UPDATE SET xp_required=$XpRequired, observed_at='$now', source='live';"
}

# ── Capt'chat ─────────────────────────────────────────────────
function Add-CaptchatEvent {
    param([string]$Server, [string]$Character, [int64]$TotalHarvests, [string]$SourceLine)
    $now = Escape-Sql (New-IsoNow); $s = Escape-Sql $Server; $c = Escape-Sql $Character
    $sl = Escape-Sql $SourceLine
    Invoke-Sql -Sql "INSERT INTO captchat_events (server,character_name,detected_at,total_harvests_at,source_line) VALUES ('$s','$c','$now',$TotalHarvests,'$sl');"
}

function Get-CaptchatCount {
    param([string]$Server)
    $row = @(Invoke-Sql -Rows -Sql "SELECT COUNT(*) FROM captchat_events WHERE server='$(Escape-Sql $Server)';")
    if ($row.Count -eq 0 -or [string]::IsNullOrWhiteSpace($row[0])) { return 0 }
    return [int64]($row[0])
}
