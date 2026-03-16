param(
    [string]$SourcePath = "$env:APPDATA\zaap\gamesLogs\wakfu\logs",
    [string]$TargetPath = "H:\Code\Wakfuassistant\logs\permanent",
    [int]$PollMs = 1000
)

$ErrorActionPreference = "Stop"

New-Item -ItemType Directory -Path $TargetPath -Force | Out-Null

$statusLog = Join-Path $TargetPath "recorder_status.log"
$statePath = Join-Path $TargetPath "recorder_state.json"
$allOut = Join-Path $TargetPath "all_events.log"
$chatOut = Join-Path $TargetPath "chat_events.log"
$journalOut = Join-Path $TargetPath "journal_events.log"

function Write-Status {
    param([string]$Message)

    $line = "[{0}] {1}" -f (Get-Date -Format "yyyy-MM-dd HH:mm:ss"), $Message
    Add-Content -Path $statusLog -Value $line -Encoding UTF8
}

$offsets = @{}
if (Test-Path $statePath) {
    try {
        $loaded = Get-Content $statePath -Raw | ConvertFrom-Json -AsHashtable
        if ($loaded -is [hashtable]) {
            $offsets = $loaded
        }
    }
    catch {
        Write-Status "WARN failed_to_load_state message=$($_.Exception.Message)"
    }
}

if (-not (Test-Path $SourcePath)) {
    throw "Source path not found: $SourcePath"
}

Write-Status "START source=$SourcePath target=$TargetPath pollMs=$PollMs"

while ($true) {
    $stateChanged = $false

    try {
        $files = Get-ChildItem -Path $SourcePath -File -Filter "wakfu*.log*" -ErrorAction SilentlyContinue | Sort-Object Name

        foreach ($file in $files) {
            $name = $file.Name
            if (-not $offsets.ContainsKey($name)) {
                $offsets[$name] = 0
                $stateChanged = $true
            }

            $offset = [int64]$offsets[$name]
            if ($file.Length -lt $offset) {
                # File rotated or truncated.
                $offset = 0
            }

            $fs = [System.IO.File]::Open($file.FullName, [System.IO.FileMode]::Open, [System.IO.FileAccess]::Read, [System.IO.FileShare]::ReadWrite)
            try {
                [void]$fs.Seek($offset, [System.IO.SeekOrigin]::Begin)
                $sr = New-Object System.IO.StreamReader($fs, [System.Text.Encoding]::UTF8, $true, 4096, $true)

                $allLines = New-Object System.Collections.Generic.List[string]
                $chatLines = New-Object System.Collections.Generic.List[string]
                $journalLines = New-Object System.Collections.Generic.List[string]

                while (($line = $sr.ReadLine()) -ne $null) {
                    $prefix = "[{0}][{1}] " -f (Get-Date -Format "yyyy-MM-dd HH:mm:ss.fff"), $name
                    $entry = $prefix + $line
                    $allLines.Add($entry)

                    if ($line -match "\[(Communaut[eE].*|Commerce|Recrutement.*|Guilde|Groupe|Priv[eE].*)\]") {
                        $chatLines.Add($entry)
                    }
                    if ($line -match "\[Information \((jeu|combat)\)\]") {
                        $journalLines.Add($entry)
                    }
                }

                if ($allLines.Count -gt 0) {
                    Add-Content -Path $allOut -Value $allLines -Encoding UTF8
                }
                if ($chatLines.Count -gt 0) {
                    Add-Content -Path $chatOut -Value $chatLines -Encoding UTF8
                }
                if ($journalLines.Count -gt 0) {
                    Add-Content -Path $journalOut -Value $journalLines -Encoding UTF8
                }

                $newOffset = [int64]$fs.Position
                if ($newOffset -ne [int64]$offsets[$name]) {
                    $offsets[$name] = $newOffset
                    $stateChanged = $true
                }

                if ($allLines.Count -gt 0) {
                    Write-Status "APPEND file=$name lines=$($allLines.Count)"
                }
            }
            finally {
                $fs.Dispose()
            }
        }
    }
    catch {
        Write-Status "ERROR message=$($_.Exception.Message)"
    }

    if ($stateChanged) {
        try {
            $offsets | ConvertTo-Json | Set-Content -Path $statePath -Encoding UTF8
        }
        catch {
            Write-Status "WARN failed_to_save_state message=$($_.Exception.Message)"
        }
    }

    Start-Sleep -Milliseconds $PollMs
}
