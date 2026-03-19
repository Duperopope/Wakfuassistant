param(
    [Parameter(Mandatory = $true, Position = 0, ValueFromRemainingArguments = $true)]
    [string[]]$MessageParts,

    [string]$Model,
    [string]$Agent,
    [string]$Session,
    [switch]$Fork,
    [switch]$NoContinue,
    [switch]$Json,
    [switch]$Thinking,
    [switch]$DryRun,
    [switch]$ShowResolvedContext
)

$ErrorActionPreference = 'Stop'

function Get-ExistingPaths {
    param(
        [string[]]$Paths
    )

    $resolved = New-Object System.Collections.Generic.List[string]
    foreach ($path in $Paths) {
        if ([string]::IsNullOrWhiteSpace($path)) {
            continue
        }

        if (Test-Path -LiteralPath $path -PathType Leaf) {
            $resolved.Add((Resolve-Path -LiteralPath $path).Path)
        }
    }

    return $resolved
}

$workspaceRoot = Split-Path -Parent $PSScriptRoot
$now = Get-Date
$todayMemory = Join-Path $workspaceRoot ("memory\{0}.md" -f $now.ToString('yyyy-MM-dd'))
$yesterdayMemory = Join-Path $workspaceRoot ("memory\{0}.md" -f $now.AddDays(-1).ToString('yyyy-MM-dd'))

$contextFiles = Get-ExistingPaths @(
    (Join-Path $workspaceRoot 'AGENTS.md'),
    (Join-Path $workspaceRoot 'BOOT.md'),
    (Join-Path $workspaceRoot 'SOUL.md'),
    (Join-Path $workspaceRoot 'USER.md'),
    (Join-Path $workspaceRoot 'IDENTITY.md'),
    (Join-Path $workspaceRoot 'TOOLS.md'),
    (Join-Path $workspaceRoot 'HEARTBEAT.md'),
    $todayMemory,
    $yesterdayMemory
)

$promptLines = @(
    'Use the attached files as the persistent workspace context imported from OpenClaw.',
    'Read the attached operating files before acting.',
    'Treat AGENTS, BOOT, SOUL, USER, TOOLS, HEARTBEAT, and memory files as higher-priority workspace guidance.',
    'When you hit technical limits, switch to self-improvement mode: use OpenClaw memory, prior errors, and agentic planning to improve the system before retrying.',
    'Never stall: if one strategy fails, choose another strategy and continue with documented decisions.',
    'Keep the workspace clean and organized; apply safe file moves only when necessary and always update references + validate with tests.',
    'Do not perform risky structural refactors without verification; document every move/rename/removal.',
    '',
    'Memoire OpenClaw a respecter:',
    'Claw conserve la memoire sur trois niveaux. Les transcriptions completes sont enregistrees sur disque et survivent aux redemarrages. Quand une conversation s''allonge, les parties anciennes sont resumees automatiquement en gardant l''essentiel. Par-dessus, une memoire a long terme stocke vos preferences et vos demandes passees dans une base consultable. Ce contexte est injecte dans chaque nouvelle conversation, quel que soit le canal.',
    '',
    'Task:',
    ($MessageParts -join ' ')
)

$finalPrompt = ($promptLines -join [Environment]::NewLine)

$baseArgs = New-Object System.Collections.Generic.List[string]
$baseArgs.Add('run')
$baseArgs.Add($finalPrompt)
$baseArgs.Add('--dir')
$baseArgs.Add($workspaceRoot)

if ($Session) {
    $baseArgs.Add('--session')
    $baseArgs.Add($Session)
} elseif (-not $NoContinue) {
    $baseArgs.Add('--continue')
}

if ($Fork) {
    $baseArgs.Add('--fork')
}

if ($Agent) {
    $baseArgs.Add('--agent')
    $baseArgs.Add($Agent)
}

if ($Json) {
    $baseArgs.Add('--format')
    $baseArgs.Add('json')
}

if ($Thinking) {
    $baseArgs.Add('--thinking')
}

foreach ($file in $contextFiles) {
    $baseArgs.Add('--file')
    $baseArgs.Add($file)
}

$preferredModels = @(
    'opencode/gpt-5-nano',
    'opencode/big-pickle',
    'opencode/mimo-v2-flash-free',
    'opencode/minimax-m2.5-free',
    'opencode/nemotron-3-super-free'
)

if ($Model -eq 'opencode') {
    $Model = 'opencode/gpt-5-nano'
}

$modelCandidates = New-Object System.Collections.Generic.List[string]
if (-not [string]::IsNullOrWhiteSpace($Model)) {
    $modelCandidates.Add($Model)
}
foreach ($m in $preferredModels) {
    if (-not $modelCandidates.Contains($m)) {
        $modelCandidates.Add($m)
    }
}

function Invoke-WithModel {
    param(
        [string]$ModelToUse,
        [System.Collections.Generic.List[string]]$CommonArgs
    )

    $args = New-Object System.Collections.Generic.List[string]
    foreach ($a in $CommonArgs) { $args.Add($a) }
    $args.Add('--model')
    $args.Add($ModelToUse)

    $captured = New-Object System.Collections.Generic.List[string]
    $prevEap = $ErrorActionPreference
    try {
        # Allow native stderr output without aborting the wrapper.
        $ErrorActionPreference = 'Continue'
        & opencode @args 2>&1 | ForEach-Object {
            $line = $_.ToString()
            $captured.Add($line)
            Write-Host $line
        }
    }
    finally {
        $ErrorActionPreference = $prevEap
    }

    $combined = (($captured | ForEach-Object { $_.ToString() }) -join [Environment]::NewLine)
    $hasModelError = $combined -match 'ProviderModelNotFoundError|Model not found:'
    return [PSCustomObject]@{
        ExitCode = $LASTEXITCODE
        HasModelError = $hasModelError
        Model = $ModelToUse
    }
}

if ($ShowResolvedContext -or $DryRun) {
    Write-Host ('Workspace: {0}' -f $workspaceRoot)
    Write-Host 'Attached context files:'
    foreach ($file in $contextFiles) {
        Write-Host (' - {0}' -f $file)
    }
    Write-Host ''
}

if ($DryRun) {
    $previewArgs = New-Object System.Collections.Generic.List[string]
    foreach ($a in $baseArgs) { $previewArgs.Add($a) }
    $previewArgs.Add('--model')
    $previewArgs.Add($modelCandidates[0])

    $quotedArgs = $previewArgs | ForEach-Object {
        if ($_ -match '\s') {
            '"{0}"' -f $_.Replace('"', '\"')
        } else {
            $_
        }
    }
    Write-Host ('Command: opencode {0}' -f ($quotedArgs -join ' '))
    exit 0
}

$result = $null
foreach ($candidate in $modelCandidates) {
    if ($ShowResolvedContext) {
        Write-Host ("Trying model: {0}" -f $candidate)
    }

    $result = Invoke-WithModel -ModelToUse $candidate -CommonArgs $baseArgs
    if (-not $result.HasModelError) {
        exit $result.ExitCode
    }

    Write-Warning ("Model failed ({0}), retrying next candidate..." -f $candidate)
}

Write-Error "All candidate models failed with model-not-found errors."
exit 1