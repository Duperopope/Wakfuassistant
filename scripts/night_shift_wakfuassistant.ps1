param(
    [string]$Mission = "Travaille en continu sur l'application WakfuAssistant toute la nuit. Priorite: stabilite, tests, correction des regressions, documentation sous docs/Codebase. Ne t'arrete pas tant que la session n'est pas stoppee.",
    [int]$PauseMinSeconds = 45,
    [int]$PauseMaxSeconds = 120,
    [string]$Model = "opencode/gpt-5-nano",
    [string]$Agent,
    [switch]$NoContinue,
    [switch]$OneCycle
)

$ErrorActionPreference = 'Stop'

if ($PauseMinSeconds -lt 0) { $PauseMinSeconds = 0 }
if ($PauseMaxSeconds -lt $PauseMinSeconds) { $PauseMaxSeconds = $PauseMinSeconds }

$workspaceRoot = Split-Path -Parent $PSScriptRoot
$wrapper = Join-Path $PSScriptRoot 'opencode-openclaw-run.ps1'

if (-not (Test-Path -LiteralPath $wrapper -PathType Leaf)) {
    throw "Wrapper introuvable: $wrapper"
}

$logDir = Join-Path $workspaceRoot 'logs\realtime'
New-Item -ItemType Directory -Path $logDir -Force | Out-Null
$logFile = Join-Path $logDir 'night_shift.log'
$stateFile = Join-Path $logDir 'night_shift_state.json'
$errorFile = Join-Path $logDir 'night_shift_last_error.txt'
$limitStateFile = Join-Path $logDir 'night_shift_limit_state.json'

function Get-IsoNowUtc {
    return (Get-Date).ToUniversalTime().ToString('o')
}

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

function Write-State {
    param(
        [string]$Status,
        [int]$Cycle,
        [string]$LastCycleStartUtc,
        [int]$LastExitCode,
        [string]$LastError
    )

    $state = [ordered]@{
        status = $Status
        workerPid = $PID
        updatedUtc = (Get-IsoNowUtc)
        cycle = $Cycle
        lastCycleStartUtc = $LastCycleStartUtc
        lastExitCode = $LastExitCode
        lastError = $LastError
    }

    ($state | ConvertTo-Json -Depth 4) | Set-Content -LiteralPath $stateFile -Encoding utf8
}

function Get-LimitState {
    if (Test-Path -LiteralPath $limitStateFile -PathType Leaf) {
        try {
            $raw = Get-Content -LiteralPath $limitStateFile -Raw -ErrorAction Stop
            $parsed = $raw | ConvertFrom-Json -ErrorAction Stop
            return [ordered]@{
                consecutiveFailures = [int]$parsed.consecutiveFailures
                consecutiveModelFailures = [int]$parsed.consecutiveModelFailures
                lastErrorFingerprint = [string]$parsed.lastErrorFingerprint
            }
        }
        catch {
            # If state is corrupted, reset to safe defaults.
        }
    }

    return [ordered]@{
        consecutiveFailures = 0
        consecutiveModelFailures = 0
        lastErrorFingerprint = ''
    }
}

function Save-LimitState {
    param(
        [hashtable]$State
    )

    ($State | ConvertTo-Json -Depth 4) | Set-Content -LiteralPath $limitStateFile -Encoding utf8
}

Write-Log "Night shift start"
Write-Log "Workspace: $workspaceRoot"
Write-Log "Mission: $Mission"
Write-Log "Pause range: $PauseMinSeconds-$PauseMaxSeconds s"
Write-State -Status 'starting' -Cycle 0 -LastCycleStartUtc '' -LastExitCode 0 -LastError ''

$LoopGuardInstruction = @"
Mode permanent (obligatoire):
- Ameliore le projet a chaque cycle (code, robustesse, qualite, UX ou perf)
- Documente en continu chaque changement dans docs/Codebase et CHANGELOG.md
- Phase 1 obligatoire: completer la documentation applicative dans docs/Codebase
- Phase 2 obligatoire (apres doc complete): appliquer uniquement des idees emergentes liees a la R&D pour ameliorer le programme sur tous les aspects
- En phase 2: chaque amelioration doit etre testee et documentee avant de passer a la suivante
- Evite les boucles steriles: ne repete jamais la meme action sans nouvelle hypothese
- Si un blocage apparait, fais un mini diagnostic, choisis une nouvelle strategie et continue
- A la fin de chaque cycle, laisse une trace exploitable: ce qui a ete fait, pourquoi, resultat, prochaine etape
- Priorite absolue: modifications utiles et verifiables, pas de bavardage
- Maintiens un dossier propre, bien organise et bien range
- Si tu deplaces/renommes des fichiers: fais-le de facon minimale, mets a jour tous les imports/usages, puis valide par tests
- Ne fais aucun deplacement structurel risquant de casser l'application sans verification explicite (tests + execution)
- Nettoie uniquement ce qui est sur et documente chaque deplacement/suppression dans la doc
"@

$EffectiveMission = @"
$Mission

$LoopGuardInstruction
"@

Write-Log "Loop guard instruction: enabled"

$AutoImproveOnLimitsInstruction = @"
Auto-amelioration (quand les limites sont atteintes):
- Utilise pleinement la memoire OpenClaw (historique, erreurs, preferences, contexte R&D)
- Si tu bloques, passe en mode meta: ameliore d'abord le systeme lui-meme (scripts, resilence, tests, observabilite)
- Genere et applique des strategies alternatives au lieu de repeter la meme tentative
- Priorise des changements qui reduisent les risques de panne dans les prochains cycles
- Documente chaque adaptation dans docs/Codebase + CHANGELOG.md
"@

$limitState = Get-LimitState
Write-Log ("Limit state loaded: failures={0}, modelFailures={1}" -f $limitState.consecutiveFailures, $limitState.consecutiveModelFailures)

$cycle = 0
while ($true) {
    $cycle++
    $cycleStartUtc = Get-IsoNowUtc
    Write-Log "Cycle #$cycle - start"

    $previousErrorContext = ''
    if (Test-Path -LiteralPath $errorFile -PathType Leaf) {
        try {
            $previousErrorContext = Get-Content -LiteralPath $errorFile -Raw -ErrorAction Stop
            if ($previousErrorContext.Length -gt 4000) {
                $previousErrorContext = $previousErrorContext.Substring($previousErrorContext.Length - 4000)
            }
            Write-Log "Cycle #$cycle - previous error context loaded"
        }
        catch {
            Write-Log "Cycle #$cycle - failed to read previous error context"
        }
    }

    $missionWithRecovery = $EffectiveMission

    $limitMode = ($limitState.consecutiveFailures -ge 3 -or $limitState.consecutiveModelFailures -ge 2)
    if ($limitMode) {
        Write-Log "Cycle #$cycle - limit mode enabled"
        $missionWithRecovery = @"
$missionWithRecovery

$AutoImproveOnLimitsInstruction
"@
    }

    if (-not [string]::IsNullOrWhiteSpace($previousErrorContext)) {
        $missionWithRecovery = @"
$EffectiveMission

Contexte erreur precedente a relire avant d'agir:
$previousErrorContext

Instruction reprise:
- Lis l'erreur precedente, corrige la cause racine, puis continue sans bloquer.
"@

    if ($limitMode) {
        $missionWithRecovery = @"
$missionWithRecovery

$AutoImproveOnLimitsInstruction
"@
    }
    }

    Write-State -Status 'cycle-running' -Cycle $cycle -LastCycleStartUtc $cycleStartUtc -LastExitCode 0 -LastError ''

    $invokeParams = @{
        MessageParts = @($missionWithRecovery)
    }
    if ($Model) { $invokeParams.Model = $Model }
    if ($Agent) { $invokeParams.Agent = $Agent }
    if ($NoContinue) { $invokeParams.NoContinue = $true }

    $cycleErrorMessage = ''
    try {
        & $wrapper @invokeParams
        $exitCode = $LASTEXITCODE
    }
    catch {
        $exitCode = 1
        $cycleErrorMessage = $_.Exception.Message
        Write-Log ("Cycle #$cycle exception: {0}" -f $cycleErrorMessage)
    }

    if ($exitCode -ne 0 -and [string]::IsNullOrWhiteSpace($cycleErrorMessage)) {
        $cycleErrorMessage = "wrapper exited with code $exitCode"
    }

    if ($exitCode -ne 0) {
        $errorPayload = @"
time=$(Get-Date -Format 'yyyy-MM-dd HH:mm:ss')
cycle=$cycle
exit=$exitCode
message=$cycleErrorMessage
"@
        $errorPayload | Set-Content -LiteralPath $errorFile -Encoding utf8
        Write-Log "Cycle #$cycle - error context updated"

        $limitState.consecutiveFailures = [int]$limitState.consecutiveFailures + 1
        $isModelFailure = ($cycleErrorMessage -match 'ProviderModelNotFoundError|Model not found:|All candidate models failed')
        if ($isModelFailure) {
            $limitState.consecutiveModelFailures = [int]$limitState.consecutiveModelFailures + 1
        } else {
            $limitState.consecutiveModelFailures = 0
        }

        $limitState.lastErrorFingerprint = $cycleErrorMessage
        Save-LimitState -State $limitState
        Write-Log ("Cycle #$cycle - limit state updated: failures={0}, modelFailures={1}" -f $limitState.consecutiveFailures, $limitState.consecutiveModelFailures)
    }
    else {
        if (Test-Path -LiteralPath $errorFile -PathType Leaf) {
            Remove-Item -LiteralPath $errorFile -Force -ErrorAction SilentlyContinue
            Write-Log "Cycle #$cycle - previous error context cleared after success"
        }

        $limitState.consecutiveFailures = 0
        $limitState.consecutiveModelFailures = 0
        $limitState.lastErrorFingerprint = ''
        Save-LimitState -State $limitState
    }

    Write-Log "Cycle #$cycle - end (exit=$exitCode)"
    Write-State -Status 'cycle-ended' -Cycle $cycle -LastCycleStartUtc $cycleStartUtc -LastExitCode $exitCode -LastError $cycleErrorMessage

    if ($OneCycle) {
        Write-Log "OneCycle active: stopping after first cycle"
        break
    }

    $sleepSeconds = if ($PauseMaxSeconds -gt $PauseMinSeconds) {
        Get-Random -Minimum $PauseMinSeconds -Maximum ($PauseMaxSeconds + 1)
    }
    else {
        $PauseMinSeconds
    }

    Write-Log "Next cycle in $sleepSeconds seconds (Ctrl+C to stop)"
    Start-Sleep -Seconds $sleepSeconds
}

Write-Log "Night shift stopped"
Write-State -Status 'stopped' -Cycle $cycle -LastCycleStartUtc '' -LastExitCode 0 -LastError ''