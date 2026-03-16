param(
    [string]$RepoPath = ".",
    [string]$Remote = "origin",
    [string]$Branch = "",
    [int]$IntervalSeconds = 2,
    [int]$CleanRetries = 6,
    [int]$RetryDelaySeconds = 2,
    [switch]$ForceReleaseLocks,
    [switch]$Once
)

$ErrorActionPreference = "Stop"
if ($PSVersionTable.PSVersion.Major -ge 7) {
    $global:PSNativeCommandUseErrorActionPreference = $false
}

function Invoke-Git {
    param([string[]]$GitArgs)
    $output = & git -C $RepoPath @GitArgs 2>&1
    $exitCode = $LASTEXITCODE
    if ($exitCode -ne 0) {
        throw "git $($GitArgs -join ' ') failed: $output"
    }
    return $output
}

function Get-CurrentBranch {
    $name = & git -C $RepoPath symbolic-ref --quiet --short HEAD 2>$null
    if ($LASTEXITCODE -eq 0 -and $name) {
        return $name.Trim()
    }
    return ""
}

function Get-RemoteDefaultBranch {
    $headRef = & git -C $RepoPath symbolic-ref --quiet --short refs/remotes/$Remote/HEAD 2>$null
    if ($LASTEXITCODE -eq 0 -and $headRef) {
        $parts = $headRef.Trim().Split("/")
        return $parts[$parts.Length - 1]
    }
    return ""
}

function Resolve-Branch {
    if ($Branch) {
        return $Branch
    }

    $current = Get-CurrentBranch
    if ($current) {
        return $current
    }

    $defaultRemote = Get-RemoteDefaultBranch
    if ($defaultRemote) {
        return $defaultRemote
    }

    throw "Impossible de determiner la branche. Passe -Branch explicitement."
}

function Release-RepoLocks {
    if (-not $ForceReleaseLocks) {
        return
    }

    $fullRepo = (Resolve-Path $RepoPath).Path
    $prefix = ($fullRepo.TrimEnd("\\") + "\\").ToLowerInvariant()

    try {
        $procs = Get-CimInstance Win32_Process -Filter "name='python.exe' OR name='pythonw.exe' OR name='py.exe'"
    }
    catch {
        return
    }

    foreach ($p in $procs) {
        $cmd = [string]$p.CommandLine
        $exe = [string]$p.ExecutablePath
        $matchByExe = $exe -and $exe.ToLowerInvariant().StartsWith($prefix)
        $matchByCmd = $cmd -and $cmd.ToLowerInvariant().Contains($prefix)
        if (-not ($matchByExe -or $matchByCmd)) {
            continue
        }
        try {
            Stop-Process -Id $p.ProcessId -Force -ErrorAction SilentlyContinue
        }
        catch {
        }
    }
}

function Clean-WithRetries {
    $lastErr = ""
    for ($i = 1; $i -le $CleanRetries; $i++) {
        try {
            Invoke-Git @("clean", "-fdx") | Out-Null
            return
        }
        catch {
            $lastErr = $_.Exception.Message
            if ($i -lt $CleanRetries) {
                Release-RepoLocks
                Start-Sleep -Seconds $RetryDelaySeconds
            }
        }
    }
    throw "Echec clean apres $CleanRetries tentative(s). Ferme les process qui verrouillent des fichiers (python/app/db/logs), puis relance. Derniere erreur: $lastErr"
}

function Sync-StrictMirror {
    $targetBranch = Resolve-Branch

    Invoke-Git @("fetch", "--prune", $Remote) | Out-Null

    $localBranch = Get-CurrentBranch
    if ($localBranch -ne $targetBranch) {
        & git -C $RepoPath checkout $targetBranch 2>$null | Out-Null
        if ($LASTEXITCODE -ne 0) {
            Invoke-Git @("checkout", "-B", $targetBranch, "$Remote/$targetBranch") | Out-Null
        }
    }

    Release-RepoLocks

    Invoke-Git @("reset", "--hard", "$Remote/$targetBranch") | Out-Null
    Clean-WithRetries

    $sha = (Invoke-Git @("rev-parse", "--short", "HEAD")).Trim()
    $ts = Get-Date -Format "yyyy-MM-dd HH:mm:ss"
    Write-Host "[$ts] Mirror OK -> $targetBranch @ $sha"
}

if (-not (Test-Path $RepoPath)) {
    throw "RepoPath introuvable: $RepoPath"
}

if (-not (Test-Path (Join-Path $RepoPath ".git"))) {
    throw "Le dossier cible n'est pas un repo git: $RepoPath"
}

if ($IntervalSeconds -lt 1) {
    throw "IntervalSeconds doit etre >= 1"
}

if ($CleanRetries -lt 1) {
    throw "CleanRetries doit etre >= 1"
}

if ($RetryDelaySeconds -lt 1) {
    throw "RetryDelaySeconds doit etre >= 1"
}

if ($Once) {
    Sync-StrictMirror
    exit 0
}

Write-Host "Mode miroir strict actif. Ctrl+C pour arreter."
Write-Host "Repo: $RepoPath | Remote: $Remote | Interval: ${IntervalSeconds}s"

while ($true) {
    try {
        Sync-StrictMirror
    }
    catch {
        $ts = Get-Date -Format "yyyy-MM-dd HH:mm:ss"
        Write-Host "[$ts] Erreur miroir: $($_.Exception.Message)"
    }
    Start-Sleep -Seconds $IntervalSeconds
}
