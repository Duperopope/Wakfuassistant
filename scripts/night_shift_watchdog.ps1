param(
    [string]$Mission = "",
    [int]$PauseMinSeconds = 45,
    [int]$PauseMaxSeconds = 120,
    [int]$CheckEverySeconds = 20,
    [int]$CycleStartTimeoutSeconds = 10,
    [string]$Model = "opencode/gpt-5-nano",
    [string]$Agent,
    [switch]$NoContinue,
    [switch]$OnePass
)

$ErrorActionPreference = 'Stop'

if ($PauseMinSeconds -lt 0) { $PauseMinSeconds = 0 }
if ($PauseMaxSeconds -lt $PauseMinSeconds) { $PauseMaxSeconds = $PauseMinSeconds }
if ($CheckEverySeconds -lt 5) { $CheckEverySeconds = 5 }
if ($CycleStartTimeoutSeconds -lt 5) { $CycleStartTimeoutSeconds = 5 }

$workspaceRoot = Split-Path -Parent $PSScriptRoot
$workerScript = Join-Path $PSScriptRoot 'night_shift_wakfuassistant.ps1'

if (-not (Test-Path -LiteralPath $workerScript -PathType Leaf)) {
    throw "Worker script not found: $workerScript"
}

$logDir = Join-Path $workspaceRoot 'logs\realtime'
New-Item -ItemType Directory -Path $logDir -Force | Out-Null
$logFile = Join-Path $logDir 'night_shift_watchdog.log'
$stopFile = Join-Path $logDir 'night_shift_watchdog.stop'
$lockFile = Join-Path $logDir 'night_shift_watchdog.lock'
$stateFile = Join-Path $logDir 'night_shift_state.json'

function Write-Log {
    param([string]$Message)
    $line = "[{0}] {1}" -f (Get-Date -Format 'yyyy-MM-dd HH:mm:ss'), $Message
    Write-Host $line
    for ($i = 0; $i -lt 5; $i++) {
        try {
            Add-Content -LiteralPath $logFile -Value $line -Encoding utf8
            return
        }
        catch {
            Start-Sleep -Milliseconds 120
        }
    }
}

function Test-ProcessAlive {
    param([int]$ProcessId)
    try {
        $proc = Get-Process -Id $ProcessId -ErrorAction Stop
        return $null -ne $proc
    }
    catch {
        return $false
    }
}

function Get-WorkerState {
    if (-not (Test-Path -LiteralPath $stateFile -PathType Leaf)) {
        return $null
    }

    try {
        $raw = Get-Content -LiteralPath $stateFile -Raw -ErrorAction Stop
        return ($raw | ConvertFrom-Json -ErrorAction Stop)
    }
    catch {
        Write-Log ("State read/parse failed: {0}" -f $_.Exception.Message)
        return $null
    }
}

function Get-CreationDateUtc {
    param([string]$CimDate)
    if ([string]::IsNullOrWhiteSpace($CimDate)) {
        return $null
    }
    try {
        return [System.Management.ManagementDateTimeConverter]::ToDateTime($CimDate).ToUniversalTime()
    }
    catch {
        return $null
    }
}

function Restart-Worker {
    param(
        [string]$Reason,
        [array]$Workers
    )

    Write-Log ("Restarting worker: {0}" -f $Reason)

    foreach ($w in @($Workers)) {
        try {
            Stop-Process -Id $w.ProcessId -Force -ErrorAction Stop
            Write-Log ("Stopped worker pid={0}" -f $w.ProcessId)
        }
        catch {
            Write-Log ("Failed to stop worker pid={0}: {1}" -f $w.ProcessId, $_.Exception.Message)
        }
    }

    try { Remove-Item -LiteralPath $stateFile -Force -ErrorAction SilentlyContinue } catch {}
    Start-Worker
}

function Get-WorkerProcesses {
    $workerEscaped = [Regex]::Escape($workerScript)
    $watchdogEscaped = [Regex]::Escape($PSCommandPath)

    $all = Get-CimInstance Win32_Process | Where-Object {
        ($_.Name -ieq 'powershell.exe' -or $_.Name -ieq 'pwsh.exe') -and
        $_.CommandLine -and
        $_.CommandLine -match $workerEscaped -and
        $_.CommandLine -notmatch $watchdogEscaped
    }

    return @($all)
}

function Start-Worker {
    $argList = @(
        '-NoProfile',
        '-ExecutionPolicy',
        'Bypass',
        '-File',
        $workerScript,
        '-PauseMinSeconds',
        [string]$PauseMinSeconds,
        '-PauseMaxSeconds',
        [string]$PauseMaxSeconds
    )

    if (-not [string]::IsNullOrWhiteSpace($Mission)) {
        $argList += @('-Mission', $Mission)
    }

    if ($Model) {
        $argList += @('-Model', $Model)
    }
    if ($Agent) {
        $argList += @('-Agent', $Agent)
    }
    if ($NoContinue) {
        $argList += '-NoContinue'
    }

    $proc = Start-Process -FilePath 'powershell.exe' -ArgumentList $argList -WorkingDirectory $workspaceRoot -NoNewWindow -PassThru
    Write-Log ("Worker started in same terminal (pid={0})" -f $proc.Id)
}

Write-Log 'Night watchdog start'
Write-Log ("Workspace: {0}" -f $workspaceRoot)
Write-Log ("Worker: {0}" -f $workerScript)
Write-Log ("Check interval: {0}s" -f $CheckEverySeconds)
Write-Log ("Pause range: {0}-{1}s" -f $PauseMinSeconds, $PauseMaxSeconds)
Write-Log ("Cycle start timeout: {0}s" -f $CycleStartTimeoutSeconds)
Write-Log ("Stop file: {0}" -f $stopFile)
Write-Log ("Lock file: {0}" -f $lockFile)

if (Test-Path -LiteralPath $lockFile -PathType Leaf) {
    $existingPid = $null
    try {
        $existingText = Get-Content -LiteralPath $lockFile -ErrorAction Stop | Select-Object -First 1
        [void][int]::TryParse($existingText, [ref]$existingPid)
    }
    catch {
        $existingPid = $null
    }

    if ($existingPid -and (Test-ProcessAlive -ProcessId $existingPid)) {
        Write-Log ("Another watchdog is already running (pid={0}). Exiting." -f $existingPid)
        exit 0
    }

    try { Remove-Item -LiteralPath $lockFile -Force -ErrorAction SilentlyContinue } catch {}
}

Set-Content -LiteralPath $lockFile -Value $PID -Encoding ascii

while ($true) {
    try {
        if (Test-Path -LiteralPath $stopFile -PathType Leaf) {
            Write-Log 'Stop file detected. Exiting watchdog loop.'
            try { Remove-Item -LiteralPath $stopFile -Force -ErrorAction SilentlyContinue } catch {}
            break
        }

        $workers = Get-WorkerProcesses
        if ($workers.Count -eq 0) {
            Write-Log 'No worker process detected. Restarting worker.'
            Start-Worker
        }
        else {
            if ($workers.Count -gt 1) {
                $allPids = ($workers | Select-Object -ExpandProperty ProcessId) -join ', '
                Write-Log ("Multiple workers detected (pid={0}); restarting clean." -f $allPids)
                Restart-Worker -Reason 'multiple-workers' -Workers @($workers)
            }
            else {
                $worker = @($workers)[0]
                $state = Get-WorkerState
                $createdUtc = Get-CreationDateUtc -CimDate $worker.CreationDate
                $ageSeconds = 0
                if ($createdUtc) {
                    $ageSeconds = [int]((Get-Date).ToUniversalTime().Subtract($createdUtc).TotalSeconds)
                }

                $hasCycleStart = $false
                if ($state -and $state.lastCycleStartUtc) {
                    $hasCycleStart = -not [string]::IsNullOrWhiteSpace([string]$state.lastCycleStartUtc)
                }

                if ($ageSeconds -ge $CycleStartTimeoutSeconds -and -not $hasCycleStart) {
                    Restart-Worker -Reason ("no-cycle-start-under-{0}s" -f $CycleStartTimeoutSeconds) -Workers @($worker)
                }
                else {
                    Write-Log ("Worker alive (pid={0}, age={1}s, cycleStart={2})" -f $worker.ProcessId, $ageSeconds, $hasCycleStart)
                }
            }
        }

        if ($OnePass) {
            Write-Log 'OnePass active: stopping after first check.'
            break
        }
    }
    catch {
        Write-Log ("Watchdog iteration error: {0}" -f $_.Exception.Message)
    }

    Start-Sleep -Seconds $CheckEverySeconds
}

Write-Log 'Night watchdog stopped'
try { Remove-Item -LiteralPath $lockFile -Force -ErrorAction SilentlyContinue } catch {}
