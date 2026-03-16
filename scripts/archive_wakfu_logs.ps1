param(
    [string]$SourcePath = "$env:APPDATA\zaap\gamesLogs\wakfu\logs",
    [string]$TargetRoot = "H:\Code\Wakfuassistant\logs\archives\auto",
    [int]$KeepDays = 90
)

$ErrorActionPreference = "Stop"

function Write-RunLog {
    param([string]$Message)

    $line = "[{0}] {1}" -f (Get-Date -Format "yyyy-MM-dd HH:mm:ss"), $Message
    Add-Content -Path (Join-Path $TargetRoot "archive_runs.log") -Value $line -Encoding UTF8
}

if (-not (Test-Path $SourcePath)) {
    throw "Source path not found: $SourcePath"
}

New-Item -ItemType Directory -Path $TargetRoot -Force | Out-Null

$stamp = Get-Date -Format "yyyyMMdd_HHmmss"
$archiveName = "wakfu_logs_$stamp"
$archiveDir = Join-Path $TargetRoot $archiveName
$zipPath = Join-Path $TargetRoot ("$archiveName.zip")

New-Item -ItemType Directory -Path $archiveDir -Force | Out-Null

Get-ChildItem -Path $SourcePath -File -ErrorAction SilentlyContinue |
    Copy-Item -Destination $archiveDir -Force

$files = Get-ChildItem -Path $archiveDir -File -ErrorAction SilentlyContinue
$manifestPath = Join-Path $archiveDir "MANIFEST.txt"

@(
    "Archive: $archiveDir",
    "Created: $(Get-Date -Format 'yyyy-MM-dd HH:mm:ss')",
    "Source: $SourcePath",
    "FileCount: $($files.Count)",
    ""
) + ($files | Sort-Object Name | ForEach-Object {
    "{0}`t{1} KB`t{2}" -f $_.Name, ([math]::Round($_.Length / 1KB, 2)), $_.LastWriteTime.ToString("yyyy-MM-dd HH:mm:ss")
}) | Set-Content -Path $manifestPath -Encoding UTF8

if (Test-Path $zipPath) {
    Remove-Item $zipPath -Force
}
Compress-Archive -Path (Join-Path $archiveDir "*") -DestinationPath $zipPath -CompressionLevel Optimal

$cutoff = (Get-Date).AddDays(-[math]::Abs($KeepDays))
Get-ChildItem -Path $TargetRoot -Directory -ErrorAction SilentlyContinue |
    Where-Object { $_.Name -like "wakfu_logs_*" -and $_.LastWriteTime -lt $cutoff } |
    Remove-Item -Recurse -Force -ErrorAction SilentlyContinue

Get-ChildItem -Path $TargetRoot -File -Filter "wakfu_logs_*.zip" -ErrorAction SilentlyContinue |
    Where-Object { $_.LastWriteTime -lt $cutoff } |
    Remove-Item -Force -ErrorAction SilentlyContinue

Write-RunLog "OK archive=$archiveName files=$($files.Count)"
Write-Output "ARCHIVE_DIR=$archiveDir"
Write-Output "ZIP_PATH=$zipPath"
Write-Output "FILE_COUNT=$($files.Count)"
