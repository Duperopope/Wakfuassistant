param(
    [string]$SourcePath = "$env:APPDATA\zaap\gamesLogs\wakfu\logs",
    [string]$TargetPath = "H:\Code\Wakfuassistant\logs\realtime",
    [int]$PollMs = 1000
)

$ErrorActionPreference = "Stop"

New-Item -ItemType Directory -Path $TargetPath -Force | Out-Null

$statusLog = Join-Path $TargetPath "mirror_status.log"

function Write-Status {
    param([string]$Message)

    $line = "[{0}] {1}" -f (Get-Date -Format "yyyy-MM-dd HH:mm:ss"), $Message
    Add-Content -Path $statusLog -Value $line -Encoding UTF8
}

function Get-FileKey {
    param([System.IO.FileInfo]$File)

    return "{0}|{1}" -f $File.FullName.ToLowerInvariant(), $File.Length
}

if (-not (Test-Path $SourcePath)) {
    throw "Source path not found: $SourcePath"
}

Write-Status "START source=$SourcePath target=$TargetPath pollMs=$PollMs"

$state = @{}

while ($true) {
    try {
        $srcFiles = Get-ChildItem -Path $SourcePath -File -Filter "wakfu*.log*" -ErrorAction SilentlyContinue
        $currentNames = @{}

        foreach ($src in $srcFiles) {
            $name = $src.Name
            $currentNames[$name] = $true

            $targetFile = Join-Path $TargetPath $name
            $stamp = "{0:o}|{1}" -f $src.LastWriteTimeUtc, $src.Length

            if (-not $state.ContainsKey($name) -or $state[$name] -ne $stamp) {
                Copy-Item -Path $src.FullName -Destination $targetFile -Force
                $state[$name] = $stamp
                Write-Status "SYNC file=$name size=$($src.Length)"
            }
        }

        # Remove stale mirrored files if source rotation deleted them.
        $mirrored = Get-ChildItem -Path $TargetPath -File -Filter "wakfu*.log*" -ErrorAction SilentlyContinue
        foreach ($m in $mirrored) {
            if (-not $currentNames.ContainsKey($m.Name)) {
                Remove-Item -Path $m.FullName -Force -ErrorAction SilentlyContinue
                $state.Remove($m.Name) | Out-Null
                Write-Status "DELETE file=$($m.Name)"
            }
        }
    }
    catch {
        Write-Status "ERROR $($_.Exception.Message)"
    }

    Start-Sleep -Milliseconds $PollMs
}
