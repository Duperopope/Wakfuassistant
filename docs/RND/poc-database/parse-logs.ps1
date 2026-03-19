param(
    [string]$LogPath = (Join-Path $PSScriptRoot "sample-logs.txt"),
    [string]$DbPath = (Join-Path $PSScriptRoot "wakfu_poc.db"),
    [string]$SchemaPath = (Join-Path $PSScriptRoot "schema.sql"),
    [string]$SqlitePath = (Join-Path $PSScriptRoot "sqlite3.exe"),
    [string]$SessionId = ""
)

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

function Escape-SqlLiteral {
    param([string]$Value)

    if ($null -eq $Value) {
        return ""
    }

    return $Value.Replace("'", "''")
}

function Normalize-IntegerString {
    param([string]$Value)

    if ([string]::IsNullOrWhiteSpace($Value)) {
        return 0
    }

    $normalized = [regex]::Replace($Value, "[\s\u00A0\u202F]", "")
    return [int64]$normalized
}

function Initialize-Database {
    param(
        [string]$LocalSchemaPath,
        [string]$LocalDbPath,
        [string]$LocalSqlitePath
    )

    if (-not (Test-Path -Path $LocalSchemaPath -PathType Leaf)) {
        throw "schema.sql introuvable: $LocalSchemaPath"
    }

    $schemaSql = Get-Content -Path $LocalSchemaPath -Raw -Encoding UTF8
    $null = $schemaSql | & $LocalSqlitePath $LocalDbPath

    if ($LASTEXITCODE -ne 0) {
        throw "Echec de creation du schema SQLite."
    }
}

function Build-InsertStatement {
    param(
        [string]$Timestamp,
        [string]$EventType,
        [string]$RawLine,
        [string]$DataJson,
        [string]$CurrentSessionId
    )

    $timestampSql = Escape-SqlLiteral -Value $Timestamp
    $eventTypeSql = Escape-SqlLiteral -Value $EventType
    $rawLineSql = Escape-SqlLiteral -Value $RawLine
    $dataJsonSql = Escape-SqlLiteral -Value $DataJson

    $sessionSql = "NULL"
    if (-not [string]::IsNullOrWhiteSpace($CurrentSessionId)) {
        $sessionSql = "'$(Escape-SqlLiteral -Value $CurrentSessionId)'"
    }

    return "INSERT INTO game_events (timestamp, event_type, raw_line, data_json, session_id) VALUES ('$timestampSql', '$eventTypeSql', '$rawLineSql', '$dataJsonSql', $sessionSql);"
}

if (-not (Test-Path -Path $SqlitePath -PathType Leaf)) {
    Write-Host "ERREUR: sqlite3.exe est introuvable dans le dossier du PoC." -ForegroundColor Red
    Write-Host "Place sqlite3.exe ici: $SqlitePath"
    exit 1
}

if (-not (Test-Path -Path $LogPath -PathType Leaf)) {
    Write-Host "ERREUR: fichier de log introuvable: $LogPath" -ForegroundColor Red
    exit 1
}

Initialize-Database -LocalSchemaPath $SchemaPath -LocalDbPath $DbPath -LocalSqlitePath $SqlitePath

$total = 0
$recognized = 0
$unrecognized = 0

$insertStatements = New-Object System.Collections.Generic.List[string]
$insertStatements.Add("BEGIN TRANSACTION;")

$lines = Get-Content -Path $LogPath -Encoding UTF8

foreach ($line in $lines) {
    $total++
    $eventType = "unrecognized"
    $data = @{}

    # Pattern 1: gain de kamas
    if ($line -match "(?i)Vous avez gagn(?:e|é)\s+([0-9\s\u00A0\u202F]+)\s+kama(?:s)?\.") {
        $amount = Normalize-IntegerString -Value $Matches[1]
        $eventType = "kamas_gained"
        $data = @{
            amount = $amount
        }
    }
    # Pattern 2: depense de kamas
    elseif ($line -match "(?i)Vous avez perdu\s+([0-9\s\u00A0\u202F]+)\s+kama(?:s)?\.") {
        $amount = Normalize-IntegerString -Value $Matches[1]
        $eventType = "kamas_spent"
        $data = @{
            amount = $amount
        }
    }
    # Pattern 3: gain d'XP (combat ou metier)
    elseif ($line -match "(?i):\s*\+([0-9\s\u00A0\u202F]+)\s+points d'XP\.") {
        $amount = Normalize-IntegerString -Value $Matches[1]
        $eventType = "xp_gained"
        $data = @{
            amount = $amount
        }
    }
    # Pattern 4: fin de combat
    elseif ($line -match "(?i)^\[FIGHT\]\s+End fight with id\s+(\d+)") {
        $fightId = [int64]$Matches[1]
        $eventType = "combat_ended"
        $data = @{
            fight_id = $fightId
            victory = $true
            note = "heuristique_poc"
        }
    }

    if ($eventType -eq "unrecognized") {
        $unrecognized++
    }
    else {
        $recognized++
    }

    $dataJson = $data | ConvertTo-Json -Compress
    $timestamp = (Get-Date).ToString("o")

    $insertSql = Build-InsertStatement -Timestamp $timestamp -EventType $eventType -RawLine $line -DataJson $dataJson -CurrentSessionId $SessionId
    $insertStatements.Add($insertSql)
}

$insertStatements.Add("COMMIT;")

$batchSqlPath = Join-Path $PSScriptRoot "_insert_batch.sql"
Set-Content -Path $batchSqlPath -Value ($insertStatements -join [Environment]::NewLine) -Encoding UTF8

try {
    $batchSql = Get-Content -Path $batchSqlPath -Raw -Encoding UTF8
    $null = $batchSql | & $SqlitePath $DbPath

    if ($LASTEXITCODE -ne 0) {
        throw "Echec de l'insertion des evenements."
    }
}
finally {
    if (Test-Path -Path $batchSqlPath) {
        Remove-Item -Path $batchSqlPath -Force
    }
}

$rate = 0.0
if ($total -gt 0) {
    $rate = [math]::Round(($recognized / $total) * 100, 2)
}

Write-Host "=== Resume parsing ===" -ForegroundColor Cyan
Write-Host "Lignes traitees : $total"
Write-Host "Lignes reconnues : $recognized"
Write-Host "Lignes non reconnues : $unrecognized"
Write-Host "Taux de reconnaissance : $rate%"
