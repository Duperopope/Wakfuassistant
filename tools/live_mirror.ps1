# ============================================================================
# live_mirror.ps1
# Description : Synchronisation miroir strict du repo Git local sur le remote.
#               Fait un fetch + reset --hard + clean a intervalle regulier.
# Projet      : Wakfuassistant
# Version     : 2.1.0
# ============================================================================

param(
    [string]$RepoPath = ".",
    [string]$Remote = "origin",
    [string]$Branch = "",
    [int]$IntervalSeconds = 2,
    [int]$CleanRetries = 6,
    [int]$RetryDelaySeconds = 2,
    [switch]$ForceReleaseLocks,
    [switch]$Once,
    [string]$LogFile = "",
    [string[]]$CleanExcludes = @(".venv", "data", "logs", "*.db", "*.db-shm", "*.db-wal")
)

$ErrorActionPreference = "Stop"

if ($PSVersionTable.PSVersion.Major -ge 7) {
    $global:PSNativeCommandUseErrorActionPreference = $false
}

# ----------------------------------------------------------------------------
# LOGGING
# ----------------------------------------------------------------------------
$script:LogFilePath = $null

function Write-Log {
    param(
        [string]$Message,
        [ValidateSet("INFO", "WARN", "ERROR")]
        [string]$Level = "INFO"
    )
    $timestamp = Get-Date -Format "yyyy-MM-dd HH:mm:ss"
    $line = "[$timestamp] [$Level] $Message"
    switch ($Level) {
        "ERROR" { Write-Host $line -ForegroundColor Red }
        "WARN"  { Write-Host $line -ForegroundColor Yellow }
        default { Write-Host $line }
    }
    if ($script:LogFilePath) {
        try {
            Add-Content -Path $script:LogFilePath -Value $line -Encoding UTF8
        }
        catch {}
    }
}

# ----------------------------------------------------------------------------
# GIT - Separation propre stdout / stderr
# ----------------------------------------------------------------------------
function Invoke-Git {
    param([string[]]$GitArgs)

    $pinfo = [System.Diagnostics.ProcessStartInfo]::new()
    $pinfo.FileName = "git"
    $pinfo.Arguments = "-C `"$RepoPath`" $($GitArgs -join ' ')"
    $pinfo.RedirectStandardOutput = $true
    $pinfo.RedirectStandardError = $true
    $pinfo.UseShellExecute = $false
    $pinfo.CreateNoWindow = $true

    $proc = [System.Diagnostics.Process]::new()
    $proc.StartInfo = $pinfo

    try {
        [void]$proc.Start()
        $stdout = $proc.StandardOutput.ReadToEnd()
        $stderr = $proc.StandardError.ReadToEnd()
        $proc.WaitForExit()
        $code = $proc.ExitCode
    }
    finally {
        $proc.Dispose()
    }

    if ($code -ne 0) {
        $detail = if ($stderr) { $stderr.Trim() } else { $stdout.Trim() }
        throw "git $($GitArgs -join ' ') a echoue (code $code): $detail"
    }

    return $stdout
}

# ----------------------------------------------------------------------------
# BRANCHES
# ----------------------------------------------------------------------------
function Get-CurrentBranch {
    try {
        $result = Invoke-Git @("symbolic-ref", "--quiet", "--short", "HEAD")
        if ($result) { return $result.Trim() }
    }
    catch {}
    return ""
}

function Get-RemoteDefaultBranch {
    try {
        $result = Invoke-Git @("symbolic-ref", "--quiet", "--short", "refs/remotes/$Remote/HEAD")
        if ($result) {
            $parts = $result.Trim().Split("/")
            return $parts[$parts.Length - 1]
        }
    }
    catch {}
    return ""
}

function Resolve-TargetBranch {
    if ($Branch) {
        Write-Log "Branche cible (parametre) : $Branch"
        return $Branch
    }
    $currentBranch = Get-CurrentBranch
    if ($currentBranch) {
        Write-Log "Branche cible (courante) : $currentBranch"
        return $currentBranch
    }
    $remoteBranch = Get-RemoteDefaultBranch
    if ($remoteBranch) {
        Write-Log "Branche cible (remote default) : $remoteBranch"
        return $remoteBranch
    }
    throw "Impossible de determiner la branche. Passe -Branch explicitement."
}

# ----------------------------------------------------------------------------
# NETTOYAGE DES VERROUS (Windows uniquement)
# ----------------------------------------------------------------------------
function Remove-RepoLocks {
    if (-not $ForceReleaseLocks) { return }
    if ($env:OS -ne "Windows_NT") {
        Write-Log "Remove-RepoLocks ignore sur non-Windows" "WARN"
        return
    }

    $fullRepo = (Resolve-Path $RepoPath).Path
    $normalizedPath = ($fullRepo.Replace("/", "\").TrimEnd("\") + "\").ToLowerInvariant()

    $filter = "name='python.exe' OR name='pythonw.exe' OR name='py.exe'"
    try {
        $procs = Get-CimInstance Win32_Process -Filter $filter -ErrorAction SilentlyContinue
    }
    catch {
        Write-Log "Impossible d'interroger WMI: $($_.Exception.Message)" "WARN"
        return
    }

    if (-not $procs) { return }

    $killedCount = 0
    foreach ($p in $procs) {
        $cmd = if ($p.CommandLine) { $p.CommandLine.ToLowerInvariant().Replace("/", "\") } else { "" }
        $exe = if ($p.ExecutablePath) { $p.ExecutablePath.ToLowerInvariant().Replace("/", "\") } else { "" }

        if (-not ($exe.StartsWith($normalizedPath) -or $cmd.Contains($normalizedPath))) {
            continue
        }

        try {
            Stop-Process -Id $p.ProcessId -Force -ErrorAction SilentlyContinue
            $killedCount++
            Write-Log "Process tue: PID $($p.ProcessId) ($($p.Name))" "WARN"
        }
        catch {
            Write-Log "Impossible de tuer PID $($p.ProcessId): $($_.Exception.Message)" "WARN"
        }
    }

    if ($killedCount -gt 0) {
        Start-Sleep -Milliseconds 500
    }
}

# ----------------------------------------------------------------------------
# CLEAN AVEC EXCLUSIONS ET RETRIES
# ----------------------------------------------------------------------------
function Invoke-CleanWithRetries {
    $cleanArgs = @("clean", "-fd")
    foreach ($exclude in $CleanExcludes) {
        $cleanArgs += "-e"
        $cleanArgs += $exclude
    }

    Write-Log "Clean args: git $($cleanArgs -join ' ')"

    $cleanError = ""
    for ($i = 1; $i -le $CleanRetries; $i++) {
        try {
            Invoke-Git $cleanArgs | Out-Null
            if ($i -gt 1) {
                Write-Log "git clean reussi a la tentative $i"
            }
            return
        }
        catch {
            $cleanError = $_.Exception.Message
            Write-Log "git clean tentative $i/$CleanRetries echouee: $cleanError" "WARN"
            if ($i -lt $CleanRetries) {
                Remove-RepoLocks
                Start-Sleep -Seconds $RetryDelaySeconds
            }
        }
    }
    throw "Echec git clean apres $CleanRetries tentative(s). Derniere erreur: $cleanError"
}

# ----------------------------------------------------------------------------
# SYNCHRONISATION MIROIR
# Sauvegarde et restaure le script lui-meme apres le reset --hard
# pour eviter que le miroir ecrase la version locale du script.
# ----------------------------------------------------------------------------
function Sync-StrictMirror {
    $targetBranch = Resolve-TargetBranch

    # Sauvegarder le contenu actuel de CE script avant le reset
    $selfPath = $PSCommandPath
    $selfBackup = $null
    if ($selfPath -and (Test-Path $selfPath)) {
        $selfBackup = Get-Content -Path $selfPath -Raw -Encoding UTF8
        Write-Log "Script self-backup OK ($($selfBackup.Length) octets)"
    }

    Write-Log "Fetch depuis $Remote..."
    Invoke-Git @("fetch", "--prune", $Remote) | Out-Null

    $currentBranch = Get-CurrentBranch
    if ($currentBranch -ne $targetBranch) {
        Write-Log "Changement de branche: $currentBranch -> $targetBranch"
        try {
            Invoke-Git @("checkout", $targetBranch) | Out-Null
        }
        catch {
            Write-Log "Checkout classique echoue, creation depuis $Remote/$targetBranch" "WARN"
            Invoke-Git @("checkout", "-B", $targetBranch, "$Remote/$targetBranch") | Out-Null
        }
    }

    Remove-RepoLocks

    Invoke-Git @("reset", "--hard", "$Remote/$targetBranch") | Out-Null
    Invoke-CleanWithRetries

    # Restaurer le script si le reset l'a ecrase
    if ($selfBackup -and $selfPath -and (Test-Path $selfPath)) {
        $currentContent = Get-Content -Path $selfPath -Raw -Encoding UTF8
        if ($currentContent -ne $selfBackup) {
            Set-Content -Path $selfPath -Value $selfBackup -Encoding UTF8 -NoNewline
            Write-Log "Script restaure apres reset (la version GitHub est differente)" "WARN"
        }
    }

    $sha = (Invoke-Git @("rev-parse", "--short", "HEAD")).Trim()
    Write-Log "Mirror OK -> $targetBranch @ $sha"
}

# ----------------------------------------------------------------------------
# MUTEX
# ----------------------------------------------------------------------------
function New-ScriptMutex {
    $resolvedPath = (Resolve-Path $RepoPath).Path
    $hashBytes = [System.Security.Cryptography.SHA256]::Create().ComputeHash(
        [System.Text.Encoding]::UTF8.GetBytes($resolvedPath.ToLowerInvariant())
    )
    $hash = [System.BitConverter]::ToString($hashBytes).Replace("-", "").Substring(0, 16)
    $mutexName = "Global\SyncMirror_$hash"
    $mutex = [System.Threading.Mutex]::new($false, $mutexName)

    $acquired = $false
    try {
        $acquired = $mutex.WaitOne(0)
    }
    catch [System.Threading.AbandonedMutexException] {
        $acquired = $true
    }

    if (-not $acquired) {
        $mutex.Dispose()
        return $null
    }
    return $mutex
}

# ----------------------------------------------------------------------------
# VALIDATION
# ----------------------------------------------------------------------------
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

# ----------------------------------------------------------------------------
# GITIGNORE - S'assurer que les fichiers locaux sont ignores
# ----------------------------------------------------------------------------
$gitignorePath = Join-Path (Resolve-Path $RepoPath).Path ".gitignore"
$requiredIgnores = @(".venv/", "data/", "logs/", "*.db", "*.db-shm", "*.db-wal", ".git/sync-logs/")
$gitignoreContent = if (Test-Path $gitignorePath) { Get-Content $gitignorePath -Raw } else { "" }
$addedEntries = @()

foreach ($entry in $requiredIgnores) {
    if ($gitignoreContent -notmatch [regex]::Escape($entry)) {
        $addedEntries += $entry
    }
}

if ($addedEntries.Count -gt 0) {
    $block = "`n# === Wakfuassistant local files (auto-added by live_mirror) ===`n"
    $block += ($addedEntries -join "`n") + "`n"
    Add-Content -Path $gitignorePath -Value $block -Encoding UTF8
    Write-Log "Ajout au .gitignore: $($addedEntries -join ', ')" "WARN"
}

# ----------------------------------------------------------------------------
# INIT LOGGING FICHIER
# ----------------------------------------------------------------------------
if ($LogFile) {
    $script:LogFilePath = $LogFile
}
else {
    $logDir = Join-Path (Resolve-Path $RepoPath).Path ".git" "sync-logs"
    if (-not (Test-Path $logDir)) {
        New-Item -ItemType Directory -Path $logDir -Force | Out-Null
    }
    $script:LogFilePath = Join-Path $logDir "sync-mirror.log"
}
Write-Log "Log: $script:LogFilePath"

# ----------------------------------------------------------------------------
# LANCEMENT
# ----------------------------------------------------------------------------
$mutex = New-ScriptMutex
if (-not $mutex) {
    throw "Une autre instance tourne deja sur ce repo."
}

try {
    if ($Once) {
        Write-Log "Mode -Once : synchronisation unique"
        Sync-StrictMirror
        Write-Log "Termine."
    }
    else {
        Write-Log "Mode miroir strict actif. Ctrl+C pour arreter."
        Write-Log "Repo: $RepoPath | Remote: $Remote | Interval: ${IntervalSeconds}s"
        Write-Log "Exclusions clean: $($CleanExcludes -join ', ')"
        while ($true) {
            try {
                Sync-StrictMirror
            }
            catch {
                Write-Log "Erreur miroir: $($_.Exception.Message)" "ERROR"
            }
            Start-Sleep -Seconds $IntervalSeconds
        }
    }
}
finally {
    if ($mutex) {
        try { $mutex.ReleaseMutex() } catch {}
        $mutex.Dispose()
        Write-Log "Mutex libere. Script arrete."
    }
}
