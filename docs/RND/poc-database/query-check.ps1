param(
    [string]$DbPath = (Join-Path $PSScriptRoot "wakfu_poc.db"),
    [string]$SqlitePath = (Join-Path $PSScriptRoot "sqlite3.exe")
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
    Write-Host "ERREUR: base SQLite introuvable: $DbPath" -ForegroundColor Red
    Write-Host "Lance d'abord parse-logs.ps1 pour creer/remplir la base."
    exit 1
}

function Invoke-SqliteTable {
    param([string]$Query)

    & $SqlitePath -header -column $DbPath $Query
    if ($LASTEXITCODE -ne 0) {
        throw "Echec requete SQLite: $Query"
    }
}

function Get-SqliteScalar {
    param([string]$Query)

    $value = & $SqlitePath -noheader $DbPath $Query
    if ($LASTEXITCODE -ne 0) {
        throw "Echec requete SQLite: $Query"
    }

    return $value
}

Write-Host "=== Verification PoC SQLite ===" -ForegroundColor Cyan

Write-Host "`n1) Nombre total d'evenements" -ForegroundColor Yellow
Invoke-SqliteTable -Query "SELECT COUNT(*) AS total_events FROM game_events;"

Write-Host "`n2) Compte par event_type" -ForegroundColor Yellow
Invoke-SqliteTable -Query "SELECT event_type, COUNT(*) AS count FROM game_events GROUP BY event_type ORDER BY count DESC;"

Write-Host "`n3) 5 derniers evenements inseres" -ForegroundColor Yellow
Invoke-SqliteTable -Query "SELECT id, timestamp, event_type, raw_line, data_json FROM game_events ORDER BY id DESC LIMIT 5;"

$total = [int64](Get-SqliteScalar -Query "SELECT COUNT(*) FROM game_events;")
$recognized = [int64](Get-SqliteScalar -Query "SELECT COUNT(*) FROM game_events WHERE event_type <> 'unrecognized';")

$rate = 0.0
if ($total -gt 0) {
    $rate = [math]::Round(($recognized / $total) * 100, 2)
}

Write-Host "`n4) Taux de reconnaissance global" -ForegroundColor Yellow
Write-Host "Reconnu: $recognized / $total"
Write-Host "Taux: $rate%"
