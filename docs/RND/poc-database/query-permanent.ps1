param(
    [string]$SqlitePath = (Join-Path $PSScriptRoot "sqlite3.exe"),
    [string]$DbPath = (Join-Path $PSScriptRoot "wakfu_permanent.db")
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

$resolvedSqlitePath = Resolve-SqlitePath -PreferredPath $SqlitePath
if ([string]::IsNullOrWhiteSpace($resolvedSqlitePath)) {
    Write-Host "ERREUR: sqlite3 est introuvable (ni local, ni global)." -ForegroundColor Red
    Write-Host "Place sqlite3.exe ici: $SqlitePath"
    exit 1
}
$SqlitePath = $resolvedSqlitePath

if (-not (Test-Path -Path $DbPath -PathType Leaf)) {
    Write-Host "ERREUR: base introuvable: $DbPath" -ForegroundColor Red
    Write-Host "Lance d'abord collect-wakfu-logs.ps1"
    exit 1
}

function Invoke-SqliteTable {
    param([string]$Sql)

    & $SqlitePath -header -column $DbPath $Sql
    if ($LASTEXITCODE -ne 0) {
        throw "Echec SQLite: $Sql"
    }
}

function Get-SqliteScalar {
    param([string]$Sql)

    $value = & $SqlitePath -noheader $DbPath $Sql
    if ($LASTEXITCODE -ne 0) {
        throw "Echec SQLite: $Sql"
    }

    return $value
}

Write-Host "=== Verification base permanente Wakfu ===" -ForegroundColor Cyan

Write-Host "`n1) Volumetrie brute" -ForegroundColor Yellow
Invoke-SqliteTable -Sql "SELECT COUNT(*) AS total_raw_lines FROM raw_log_lines;"

Write-Host "`n2) Volumetrie events parses" -ForegroundColor Yellow
Invoke-SqliteTable -Sql "SELECT COUNT(*) AS total_parsed_events FROM parsed_events;"

Write-Host "`n3) Repartition par type d'event" -ForegroundColor Yellow
Invoke-SqliteTable -Sql "SELECT event_type, COUNT(*) AS count FROM parsed_events GROUP BY event_type ORDER BY count DESC;"

Write-Host "`n4) Dernieres lignes brutes" -ForegroundColor Yellow
Invoke-SqliteTable -Sql "SELECT id, source_file, generation, source_line_no, source_timestamp_text, raw_line FROM raw_log_lines ORDER BY id DESC LIMIT 10;"

Write-Host "`n5) Etat des curseurs d'ingestion" -ForegroundColor Yellow
Invoke-SqliteTable -Sql "SELECT source_file, generation, last_line_no, updated_at FROM ingest_state ORDER BY source_file;"

$total = [int64](Get-SqliteScalar -Sql "SELECT COUNT(*) FROM parsed_events;")
$recognized = [int64](Get-SqliteScalar -Sql "SELECT COUNT(*) FROM parsed_events WHERE event_type <> 'unrecognized';")

$rate = 0.0
if ($total -gt 0) {
    $rate = [math]::Round(($recognized / $total) * 100, 2)
}

Write-Host "`n6) Taux de reconnaissance global" -ForegroundColor Yellow
Write-Host "Reconnu: $recognized / $total"
Write-Host "Taux: $rate%"
