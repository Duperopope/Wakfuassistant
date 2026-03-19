param(
    [string]$SqlitePath = (Join-Path $PSScriptRoot "sqlite3.exe"),
    [string]$SchemaPath = (Join-Path $PSScriptRoot "schema-permanent.sql"),
    [string]$DbPath = (Join-Path $PSScriptRoot "wakfu_permanent.db"),
    [string]$LogsRoot = (Join-Path $env:APPDATA "zaap\gamesLogs\wakfu\logs"),
    [string[]]$LogFiles = @("wakfu.log", "wakfu_chat.log", "wakfu_journal.log"),
    [ValidateSet("once", "watch")]
    [string]$Mode = "once",
    [int]$DebounceMs = 250,
    [int]$WorkerCount = [Math]::Max(1, [Math]::Min([Environment]::ProcessorCount, 8))
)

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

function Resolve-SqlitePath {
    param([string]$PreferredPath)

    if (Test-Path -Path $PreferredPath -PathType Leaf) {
        return $PreferredPath
    }

    $globalSqlite = Get-Command sqlite3 -ErrorAction SilentlyContinue
    if ($null -ne $globalSqlite -and -not [string]::IsNullOrWhiteSpace($globalSqlite.Source)) {
        if ([System.IO.Path]::IsPathRooted($globalSqlite.Source)) {
            return $globalSqlite.Source
        }
    }

    $whereResult = & where.exe sqlite3 2>$null
    if ($LASTEXITCODE -eq 0 -and -not [string]::IsNullOrWhiteSpace($whereResult)) {
        return ($whereResult | Select-Object -First 1)
    }

    return $null
}

function Escape-SqlLiteral {
    param([string]$Value)

    if ($null -eq $Value) {
        return ""
    }

    return $Value.Replace("'", "''")
}

function New-IsoNow {
    return (Get-Date).ToString("o")
}

function Get-SourceTimestampText {
    param([string]$Line)

    if ($Line -match "\b(\d{2}:\d{2}:\d{2},\d{3})\b") {
        return $Matches[1]
    }

    if ($Line -match "\b(\d{2}:\d{2}:\d{2})\b") {
        return $Matches[1]
    }

    return $null
}

function Normalize-IntegerString {
    param([string]$Value)

    if ([string]::IsNullOrWhiteSpace($Value)) {
        return [int64]0
    }

    $normalized = [regex]::Replace($Value, "[\s\u00A0\u202F']", "")
    return [int64]$normalized
}

function Parse-EventFromLine {
    param([string]$Line)

    $eventType = "unrecognized"
    $data = @{}

    if ($Line -match "(?i)Vous avez gagn\S*\s+([0-9\s\u00A0\u202F']+)\s+kama(?:s)?\.") {
        $eventType = "kamas_gained"
        $data = @{ amount = (Normalize-IntegerString -Value $Matches[1]) }
    }
    elseif ($Line -match "(?i)Vous avez perdu\s+([0-9\s\u00A0\u202F']+)\s+kama(?:s)?\.") {
        $eventType = "kamas_spent"
        $data = @{ amount = (Normalize-IntegerString -Value $Matches[1]) }
    }
    elseif ($Line -match "(?i)^\[FIGHT\]\s+End fight with id\s+(\d+)") {
        $eventType = "combat_ended"
        $data = @{ fight_id = [int64]$Matches[1]; victory = $true; note = "heuristique_poc" }
    }
    elseif ($Line -match "(?i):\s*\+([0-9\s\u00A0\u202F']+)\s+points d'XP\.") {
        $eventType = "xp_gained"
        $data = @{ amount = (Normalize-IntegerString -Value $Matches[1]) }
    }
    elseif ($Line -match "(?i)Lancement de l'occupation MARKET sur la board \[bAL id=(\d+)\]") {
        $eventType = "market_opened"
        $data = @{ board_id = [int64]$Matches[1] }
    }
    elseif ($Line -match "(?i)On arr.te l'occupation MARKET sur la board \[bAL id=(\d+)\]") {
        $eventType = "market_closed"
        $data = @{ board_id = [int64]$Matches[1] }
    }
    elseif ($Line -match '(?i)Qu.te .chou.e:\s*"([^"]+)"') {
        $eventType = "quest_failed"
        $data = @{ quest_name = $Matches[1] }
    }
    elseif ($Line -match "(?i)Vous avez r.ussi la qu.te\s+(.+?)\.") {
        $eventType = "quest_succeeded"
        $data = @{ quest_name = $Matches[1] }
    }

    return @{
        event_type = $eventType
        data_json = ($data | ConvertTo-Json -Compress)
    }
}

function Invoke-Sqlite {
    param(
        [string]$LocalSqlitePath,
        [string]$LocalDbPath,
        [string]$Sql,
        [switch]$UseSeparator
    )

    $sqliteArgs = @("-noheader")
    if ($UseSeparator) {
        $sqliteArgs += @("-separator", "|")
    }

    $result = $Sql | & $LocalSqlitePath @sqliteArgs $LocalDbPath
    if ($LASTEXITCODE -ne 0) {
        throw "Echec SQLite sur requete."
    }

    if ($null -eq $result) {
        return @()
    }

    return @($result)
}

function Initialize-Database {
    param(
        [string]$LocalSqlitePath,
        [string]$LocalDbPath,
        [string]$LocalSchemaPath
    )

    if (-not (Test-Path -Path $LocalSchemaPath -PathType Leaf)) {
        throw "Schema introuvable: $LocalSchemaPath"
    }

    $schemaSql = Get-Content -Path $LocalSchemaPath -Raw -Encoding UTF8
    $initSql = @"
PRAGMA journal_mode = WAL;
PRAGMA synchronous = NORMAL;
PRAGMA busy_timeout = 5000;
$schemaSql
"@

    $null = $initSql | & $LocalSqlitePath $LocalDbPath
    if ($LASTEXITCODE -ne 0) {
        throw "Echec creation/initialisation schema permanent."
    }
}

function Get-OrCreateState {
    param(
        [string]$LocalSqlitePath,
        [string]$LocalDbPath,
        [string]$SourceFile
    )

    $sourceSql = Escape-SqlLiteral -Value $SourceFile
    $row = Invoke-Sqlite -LocalSqlitePath $LocalSqlitePath -LocalDbPath $LocalDbPath -UseSeparator -Sql "SELECT generation, last_line_no, last_line_count FROM ingest_state WHERE source_file = '$sourceSql';"

    if ([string]::IsNullOrWhiteSpace($row)) {
        $nowSql = Escape-SqlLiteral -Value (New-IsoNow)
        $null = Invoke-Sqlite -LocalSqlitePath $LocalSqlitePath -LocalDbPath $LocalDbPath -Sql "INSERT INTO ingest_state (source_file, generation, last_line_no, last_line_count, updated_at) VALUES ('$sourceSql', 0, 0, 0, '$nowSql');"
        return @{ generation = 0; last_line_no = 0; last_line_count = 0 }
    }

    $parts = ($row | Select-Object -First 1) -split "\|"
    return @{
        generation = [int]$parts[0]
        last_line_no = [int]$parts[1]
        last_line_count = [int]$parts[2]
    }
}

function Build-ParsedRows {
    param(
        [object[]]$LineObjects,
        [int]$ParallelWorkers
    )

    if ($LineObjects.Count -eq 0) {
        return @()
    }

    $supportsParallel = $PSVersionTable.PSVersion.Major -ge 7
    if ($supportsParallel -and $ParallelWorkers -gt 1 -and $LineObjects.Count -ge 200) {
        $rows = $LineObjects | ForEach-Object -Parallel {
            $line = [string]$_.raw_line
            $eventType = "unrecognized"
            $data = @{}

            if ($line -match "(?i)Vous avez gagn\S*\s+([0-9\s\u00A0\u202F']+)\s+kama(?:s)?\.") {
                $eventType = "kamas_gained"
                $data = @{ amount = [int64]([regex]::Replace($Matches[1], "[\s\u00A0\u202F']", "")) }
            }
            elseif ($line -match "(?i)Vous avez perdu\s+([0-9\s\u00A0\u202F']+)\s+kama(?:s)?\.") {
                $eventType = "kamas_spent"
                $data = @{ amount = [int64]([regex]::Replace($Matches[1], "[\s\u00A0\u202F']", "")) }
            }
            elseif ($line -match "(?i)^\[FIGHT\]\s+End fight with id\s+(\d+)") {
                $eventType = "combat_ended"
                $data = @{ fight_id = [int64]$Matches[1]; victory = $true; note = "heuristique_poc" }
            }
            elseif ($line -match "(?i):\s*\+([0-9\s\u00A0\u202F']+)\s+points d'XP\.") {
                $eventType = "xp_gained"
                $data = @{ amount = [int64]([regex]::Replace($Matches[1], "[\s\u00A0\u202F']", "")) }
            }
            elseif ($line -match "(?i)Lancement de l'occupation MARKET sur la board \[bAL id=(\d+)\]") {
                $eventType = "market_opened"
                $data = @{ board_id = [int64]$Matches[1] }
            }
            elseif ($line -match "(?i)On arr.te l'occupation MARKET sur la board \[bAL id=(\d+)\]") {
                $eventType = "market_closed"
                $data = @{ board_id = [int64]$Matches[1] }
            }
            elseif ($line -match '(?i)Qu.te .chou.e:\s*"([^"]+)"') {
                $eventType = "quest_failed"
                $data = @{ quest_name = $Matches[1] }
            }
            elseif ($line -match "(?i)Vous avez r.ussi la qu.te\s+(.+?)\.") {
                $eventType = "quest_succeeded"
                $data = @{ quest_name = $Matches[1] }
            }

            [pscustomobject]@{
                line_no = [int]$_.line_no
                raw_line = $line
                source_timestamp_text = $_.source_timestamp_text
                event_type = $eventType
                data_json = ($data | ConvertTo-Json -Compress)
            }
        } -ThrottleLimit $ParallelWorkers

        return $rows | Sort-Object -Property line_no
    }

    $output = New-Object System.Collections.Generic.List[object]
    foreach ($obj in $LineObjects) {
        $parsed = Parse-EventFromLine -Line $obj.raw_line
        $output.Add([pscustomobject]@{
            line_no = [int]$obj.line_no
            raw_line = [string]$obj.raw_line
            source_timestamp_text = $obj.source_timestamp_text
            event_type = [string]$parsed.event_type
            data_json = [string]$parsed.data_json
        })
    }

    return $output
}

function Ingest-File {
    param(
        [string]$LocalSqlitePath,
        [string]$LocalDbPath,
        [string]$FilePath,
        [int]$ParallelWorkers
    )

    if (-not (Test-Path -Path $FilePath -PathType Leaf)) {
        return @{
            file = $FilePath
            exists = $false
            total = 0
            inserted = 0
            recognized = 0
            unrecognized = 0
            generation = 0
        }
    }

    $state = Get-OrCreateState -LocalSqlitePath $LocalSqlitePath -LocalDbPath $LocalDbPath -SourceFile $FilePath
    $generation = [int]$state.generation
    $lastLineNo = [int]$state.last_line_no

    $lines = Get-Content -Path $FilePath -Encoding UTF8
    $lineCount = $lines.Count

    if ($lineCount -lt $lastLineNo) {
        $generation++
        $lastLineNo = 0
    }

    if ($lineCount -le $lastLineNo) {
        return @{
            file = $FilePath
            exists = $true
            total = $lineCount
            inserted = 0
            recognized = 0
            unrecognized = 0
            generation = $generation
        }
    }

    $lineObjects = New-Object System.Collections.Generic.List[object]
    for ($i = $lastLineNo; $i -lt $lineCount; $i++) {
        $line = [string]$lines[$i]
        $lineObjects.Add([pscustomobject]@{
            line_no = $i + 1
            raw_line = $line
            source_timestamp_text = (Get-SourceTimestampText -Line $line)
        })
    }

    $parsedRows = Build-ParsedRows -LineObjects $lineObjects -ParallelWorkers $ParallelWorkers

    $recognized = 0
    $unrecognized = 0
    $batchSql = New-Object System.Collections.Generic.List[string]
    $batchSql.Add("PRAGMA busy_timeout = 5000;")
    $batchSql.Add("BEGIN IMMEDIATE TRANSACTION;")

    $sourceFileSql = Escape-SqlLiteral -Value $FilePath

    foreach ($row in $parsedRows) {
        $rawLineSql = Escape-SqlLiteral -Value $row.raw_line
        $ingestedAtSql = Escape-SqlLiteral -Value (New-IsoNow)
        $eventTypeSql = Escape-SqlLiteral -Value $row.event_type
        $dataJsonSql = Escape-SqlLiteral -Value $row.data_json
        $parsedAtSql = Escape-SqlLiteral -Value (New-IsoNow)

        $sourceTimestampSql = "NULL"
        if (-not [string]::IsNullOrWhiteSpace($row.source_timestamp_text)) {
            $sourceTimestampSql = "'$(Escape-SqlLiteral -Value ([string]$row.source_timestamp_text))'"
        }

        $batchSql.Add("INSERT OR IGNORE INTO raw_log_lines (source_file, generation, source_line_no, source_timestamp_text, ingested_at, raw_line) VALUES ('$sourceFileSql', $generation, $($row.line_no), $sourceTimestampSql, '$ingestedAtSql', '$rawLineSql');")
        $batchSql.Add(@"
INSERT INTO parsed_events (raw_line_id, event_type, data_json, parsed_at)
SELECT r.id, '$eventTypeSql', '$dataJsonSql', '$parsedAtSql'
FROM raw_log_lines r
WHERE r.source_file = '$sourceFileSql'
  AND r.generation = $generation
  AND r.source_line_no = $($row.line_no)
  AND NOT EXISTS (
      SELECT 1
      FROM parsed_events p
      WHERE p.raw_line_id = r.id
  );
"@)

        if ($row.event_type -eq "unrecognized") {
            $unrecognized++
        }
        else {
            $recognized++
        }
    }

    $nowSql = Escape-SqlLiteral -Value (New-IsoNow)
    $batchSql.Add("UPDATE ingest_state SET generation = $generation, last_line_no = $lineCount, last_line_count = $lineCount, updated_at = '$nowSql' WHERE source_file = '$sourceFileSql';")
    $batchSql.Add("COMMIT;")

    $null = Invoke-Sqlite -LocalSqlitePath $LocalSqlitePath -LocalDbPath $LocalDbPath -Sql ($batchSql -join [Environment]::NewLine)

    return @{
        file = $FilePath
        exists = $true
        total = $lineCount
        inserted = $parsedRows.Count
        recognized = $recognized
        unrecognized = $unrecognized
        generation = $generation
    }
}

function Invoke-CollectionForFiles {
    param(
        [string[]]$FullPaths,
        [int]$ParallelWorkers,
        [string]$LocalSqlitePath,
        [string]$LocalDbPath
    )

    $results = @()
    foreach ($path in $FullPaths) {
        $results += Ingest-File -LocalSqlitePath $LocalSqlitePath -LocalDbPath $LocalDbPath -FilePath $path -ParallelWorkers $ParallelWorkers
    }

    $passInserted = ($results | Measure-Object -Property inserted -Sum).Sum
    $passRecognized = ($results | Measure-Object -Property recognized -Sum).Sum
    $passUnrecognized = ($results | Measure-Object -Property unrecognized -Sum).Sum

    $rate = 0.0
    if (($passRecognized + $passUnrecognized) -gt 0) {
        $rate = [math]::Round(($passRecognized / ($passRecognized + $passUnrecognized)) * 100, 2)
    }

    Write-Host "=== Passe de collecte ===" -ForegroundColor Cyan
    foreach ($r in $results) {
        if (-not $r.exists) {
            Write-Host "[ABSENT] $($r.file)"
            continue
        }

        Write-Host "[OK] $($r.file) | total=$($r.total) | ajoutes=$($r.inserted) | generation=$($r.generation)"
    }

    Write-Host "Ajoutes (tous fichiers): $passInserted"
    Write-Host "Reconnu cette passe: $passRecognized"
    Write-Host "Non reconnu cette passe: $passUnrecognized"
    Write-Host "Taux reconnaissance passe: $rate%"
}

$resolvedSqlitePath = Resolve-SqlitePath -PreferredPath $SqlitePath
if ([string]::IsNullOrWhiteSpace($resolvedSqlitePath)) {
    Write-Host "ERREUR: sqlite3 est introuvable (ni local, ni global)." -ForegroundColor Red
    Write-Host "Place sqlite3.exe ici: $SqlitePath"
    exit 1
}
$SqlitePath = $resolvedSqlitePath

if (-not (Test-Path -Path $LogsRoot -PathType Container)) {
    Write-Host "ERREUR: dossier de logs Wakfu introuvable: $LogsRoot" -ForegroundColor Red
    Write-Host "Verifie que Wakfu est bien lance via Zaap et que les logs existent."
    exit 1
}

Initialize-Database -LocalSqlitePath $SqlitePath -LocalDbPath $DbPath -LocalSchemaPath $SchemaPath

$trackedFullPaths = @()
foreach ($name in $LogFiles) {
    $trackedFullPaths += (Join-Path $LogsRoot $name)
}

if ($Mode -eq "once") {
    Invoke-CollectionForFiles -FullPaths $trackedFullPaths -ParallelWorkers $WorkerCount -LocalSqlitePath $SqlitePath -LocalDbPath $DbPath
    exit 0
}

Write-Host "Mode watch evenementiel actif. Dossier source: $LogsRoot" -ForegroundColor Yellow
Write-Host "Fichiers suivis: $($LogFiles -join ', ')"
Write-Host "Debounce: $DebounceMs ms"
Write-Host "Workers parsing: $WorkerCount"

Invoke-CollectionForFiles -FullPaths $trackedFullPaths -ParallelWorkers $WorkerCount -LocalSqlitePath $SqlitePath -LocalDbPath $DbPath

$watcher = New-Object System.IO.FileSystemWatcher
$watcher.Path = $LogsRoot
$watcher.Filter = "*.log"
$watcher.IncludeSubdirectories = $false
$watcher.NotifyFilter = [System.IO.NotifyFilters]'FileName, LastWrite, Size'
$watcher.EnableRaisingEvents = $true

$pending = [System.Collections.Concurrent.ConcurrentDictionary[string, datetime]]::new([System.StringComparer]::OrdinalIgnoreCase)
$trackedPaths = @($trackedFullPaths)

$action = {
    param($senderObj, $eventData)

    $localTrackedPaths = $using:trackedPaths
    $localPending = $using:pending
    $fullPath = $eventData.FullPath

    if ($localTrackedPaths -contains $fullPath) {
        $now = Get-Date
        $null = $localPending.AddOrUpdate($fullPath, $now, { param($k, $v) $now })
    }
}

$changedSub = Register-ObjectEvent -InputObject $watcher -EventName Changed -Action $action
$createdSub = Register-ObjectEvent -InputObject $watcher -EventName Created -Action $action
$renamedSub = Register-ObjectEvent -InputObject $watcher -EventName Renamed -Action $action

try {
    while ($true) {
        $null = Wait-Event -Timeout 1

        $ready = New-Object System.Collections.Generic.List[string]
        $now = Get-Date

        foreach ($kv in $pending.GetEnumerator()) {
            if (($now - $kv.Value).TotalMilliseconds -lt $DebounceMs) {
                continue
            }

            $removedValue = [datetime]::MinValue
            if ($pending.TryRemove($kv.Key, [ref]$removedValue)) {
                $ready.Add($kv.Key)
            }
        }

        if ($ready.Count -gt 0) {
            Invoke-CollectionForFiles -FullPaths $ready.ToArray() -ParallelWorkers $WorkerCount -LocalSqlitePath $SqlitePath -LocalDbPath $DbPath
        }
    }
}
finally {
    Unregister-Event -SubscriptionId $changedSub.Id -ErrorAction SilentlyContinue
    Unregister-Event -SubscriptionId $createdSub.Id -ErrorAction SilentlyContinue
    Unregister-Event -SubscriptionId $renamedSub.Id -ErrorAction SilentlyContinue
    $watcher.Dispose()
}
