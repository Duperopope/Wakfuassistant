param(
    [switch]$SkipWakassets,
    [switch]$SkipTheme
)

$ErrorActionPreference = "Stop"
$projectRoot = Split-Path -Parent $PSScriptRoot
$pythonExe = Join-Path $projectRoot ".venv\Scripts\python.exe"
$scriptPath = Join-Path $projectRoot "tools\sync_ankama_official_assets.py"

if (-not (Test-Path $pythonExe)) {
    throw "Python venv not found at $pythonExe"
}

$args = @($scriptPath)
if ($SkipWakassets) { $args += "--skip-wakassets" }
if ($SkipTheme) { $args += "--skip-theme" }

& $pythonExe @args
