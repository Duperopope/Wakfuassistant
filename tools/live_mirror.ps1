# ============================================================================
# Sync-StrictMirror.ps1
# Description : Synchronisation miroir strict d'un repo Git local sur un remote.
#               Fait un fetch + reset --hard + clean à intervalle régulier.
# Usage       : .\Sync-StrictMirror.ps1 -RepoPath "C:\MonRepo" -Branch "main"
# Auteur      : Sam (corrigé et documenté)
# Version     : 2.0.0
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
    [string]$LogFile = ""
)

# ----------------------------------------------------------------------------
# CONFIGURATION GLOBALE
# ----------------------------------------------------------------------------
$ErrorActionPreference = "Stop"

# PowerShell 7+ : empêcher que les codes retour non-zero des executables natifs
# déclenchent une erreur automatique (on gère nous-mêmes via $LASTEXITCODE).
if ($PSVersionTable.PSVersion.Major -ge 7) {
    $global:PSNativeCommandUseErrorActionPreference = $false
}

# ----------------------------------------------------------------------------
# FONCTIONS DE LOGGING
# ----------------------------------------------------------------------------
function Write-Log {
    <#
    .SYNOPSIS
        Écrit un message horodaté dans la console ET dans un fichier log si configuré.
    .PARAMETER Message
        Le texte à logger.
    .PARAMETER Level
        Niveau : INFO, WARN, ERROR. Par défaut INFO.
    #>
    param(
        [string]$Message,
        [ValidateSet("INFO", "WARN", "ERROR")]
        [string]$Level = "INFO"
    )

    $timestamp = Get-Date -Format "yyyy-MM-dd HH:mm:ss"
    $line = "[$timestamp] [$Level] $Message"

    switch ($Level) {
        "ERROR" { Write-Host $line -ForegroundColor Red }
        "WARN" { Write-Host $line -ForegroundColor Yellow }
        default { Write-Host $line }
    }

    if ($script:LogFilePath) {
        try {
            Add-Content -Path $script:LogFilePath -Value $line -Encoding UTF8
        }
        catch {
            # Si on ne peut pas écrire dans le log, on ne plante pas le script
            Write-Host "[$timestamp] [WARN] Impossible d'ecrire dans le fichier log: $($_.Exception.Message)" -ForegroundColor Yellow
        }
    }
}

# ----------------------------------------------------------------------------
# VERROU D'INSTANCE UNIQUE (mutex)
# ----------------------------------------------------------------------------
function New-ScriptMutex {
    <#
    .SYNOPSIS
        Crée un mutex nommé pour empêcher deux instances du script de tourner
        sur le même repo en même temps.
    .OUTPUTS
        L'objet Mutex si acquis, $null sinon.
    #>
    $resolvedPath = (Resolve-Path $RepoPath).Path
    # On crée un nom de mutex basé sur le hash du chemin pour éviter les caractères spéciaux
    $hash = [System.BitConverter]::ToString(
        [System.Security.Cryptography.SHA256]::Create().ComputeHash(
            [System.Text.Encoding]::UTF8.GetBytes($resolvedPath.ToLowerInvariant())
        )
    ).Replace("-", "").Substring(0, 16)

    $mutexName = "Global\SyncStrictMirror_$hash"
    $mutex = [System.Threading.Mutex]::new($false, $mutexName)

    $acquired = $false
    try {
        $acquired = $mutex.WaitOne(0)
    }
    catch [System.Threading.AbandonedMutexException] {
        # Un process précédent a crashé sans relâcher le mutex — on le récupère
        $acquired = $true
    }

    if (-not $acquired) {
        $mutex.Dispose()
        return $null
    }

    return $mutex
}

# ----------------------------------------------------------------------------
# FONCTIONS GIT
# ----------------------------------------------------------------------------
function Invoke-Git {
    <#
    .SYNOPSIS
        Exécute une commande git et retourne UNIQUEMENT stdout.
        Stderr est capturé séparément pour ne pas polluer la sortie.
    .PARAMETER GitArgs
        Les arguments à passer à git.
    .OUTPUTS
        Le contenu de stdout en tant que string (ou tableau de strings).
    #>
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
    }
    catch {
        throw "Impossible de lancer git: $($_.Exception.Message)"
    }
    finally {
        $proc.Dispose()
    }

    if ($proc.ExitCode -ne 0) {
        $errorDetail = if ($stderr) { $stderr.Trim() } else { $stdout.Trim() }
        throw "git $($GitArgs -join ' ') a echoue (code $($proc.ExitCode)): $errorDetail"
    }

    return $stdout
}

function Get-CurrentBranch {
    <#
    .SYNOPSIS
        Retourne le nom de la branche courante, ou une chaîne vide si HEAD est détaché.
    #>
    try {
        $name = Invoke-Git @("symbolic-ref", "--quiet", "--short", "HEAD")
        if ($name) {
            return $name.Trim()
        }
    }
    catch {
        # HEAD détaché ou autre erreur — ce n'est pas critique ici
    }
    return ""
}

function Get-RemoteDefaultBranch {
    <#
    .SYNOPSIS
        Retourne la branche par défaut du remote (ex: main, master).
        Se base sur refs/remotes/<remote>/HEAD.
    #>
    try {
        $headRef = Invoke-Git @("symbolic-ref", "--quiet", "--short", "refs/remotes/$Remote/HEAD")
        if ($headRef) {
            $parts = $headRef.Trim().Split("/")
            return $parts[$parts.Length - 1]
        }
    }
    catch {
        # Le remote n'a peut-être pas de HEAD configuré
    }
    return ""
}

function Resolve-TargetBranch {
    <#
    .SYNOPSIS
        Détermine quelle branche cibler, dans cet ordre de priorité :
        1. Le paramètre -Branch s'il est fourni
        2. La branche courante du repo local
        3. La branche par défaut du remote
    #>
    if ($Branch) {
        Write-Log "Branche cible (parametre) : $Branch"
        return $Branch
    }

    $current = Get-CurrentBranch
    if ($current) {
        Write-Log "Branche cible (courante) : $current"
        return $current
    }

    $defaultRemote = Get-RemoteDefaultBranch
    if ($defaultRemote) {
        Write-Log "Branche cible (remote default) : $defaultRemote"
        return $defaultRemote
    }

    throw "Impossible de determiner la branche. Passe -Branch explicitement."
}

# ----------------------------------------------------------------------------
# NETTOYAGE DES VERROUS FICHIERS
# ----------------------------------------------------------------------------
function Clear-RepoLocks {
    <#
    .SYNOPSIS
        Si -ForceReleaseLocks est actif, tue les processus Python qui ont des
        fichiers ouverts dans le dossier du repo (Windows uniquement).
        Utile quand git clean échoue à cause de fichiers verrouillés.
    #>
    if (-not $ForceReleaseLocks) {
        return
    }

    # Cette fonctionnalité utilise WMI, disponible uniquement sur Windows
    if ($env:OS -ne "Windows_NT") {
        Write-Log "Clear-RepoLocks ignore (non-Windows)" "WARN"
        return
    }

    $fullRepo = (Resolve-Path $RepoPath).Path
    # Normaliser le chemin : remplacer / par \ et s'assurer qu'il finit par \
    $normalizedPath = $fullRepo.Replace("/", "\").TrimEnd("\") + "\"
    $lowerPath = $normalizedPath.ToLowerInvariant()

    try {
        $procs = Get-CimInstance Win32_Process -Filter "name='python.exe' OR name='pythonw.exe' OR name='py.exe'" -ErrorAction SilentlyContinue
    }
    catch {
        Write-Log "Impossible d'interroger les processus WMI: $($_.Exception.Message)" "WARN"
        return
    }

    if (-not $procs) {
        return
    }

    $killedCount = 0
    foreach ($p in $procs) {
        $cmd = if ($p.CommandLine) { $p.CommandLine.ToLowerInvariant().Replace("/", "\") } else { "" }
        $exe = if ($p.ExecutablePath) { $p.ExecutablePath.ToLowerInvariant().Replace("/", "\") } else { "" }

        $matchByExe = $exe -and $exe.StartsWith($lowerPath)
        $matchByCmd = $cmd -and $cmd.Contains($lowerPath)

        if (-not ($matchByExe -or $matchByCmd)) {
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
        # Laisser le temps à l'OS de relâcher les handles
        Start-Sleep -Milliseconds 500
    }
}

function Invoke-CleanWithRetries {
    <#
    .SYNOPSIS
        Exécute git clean -fdx avec un mécanisme de retry.
        Entre chaque tentative, tente de libérer les verrous fichiers.
    #>
    $lastErr = ""
    for ($i = 1; $i -le $CleanRetries; $i++) {
        try {
            Invoke-Git @("clean", "-fdx") | Out-Null
            if ($i -gt 1) {
                Write-Log "git clean reussi a la tentative $i" "INFO"
            }
            return
        }
        catch {
            $lastErr = $_.Exception.Message
            Write-Log "git clean tentative $i/$CleanRetries echouee: $lastErr" "WARN"

            if ($i -lt $CleanRetries) {
                Clear-RepoLocks
                Start-Sleep -Seconds $RetryDelaySeconds
            }
        }
    }

    throw "Echec git clean apres $CleanRetries tentative(s). Ferme les process qui verrouillent des fichiers (python/app/db/logs), puis relance. Derniere erreur: $lastErr"
}

# ----------------------------------------------------------------------------
# FONCTION PRINCIPALE DE SYNCHRONISATION
# ----------------------------------------------------------------------------
function Sync-StrictMirror {
    <#
    .SYNOPSIS
        Effectue une synchronisation miroir stricte :
        1. fetch --prune depuis le remote
        2. checkout de la branche cible si nécessaire
        3. reset --hard sur le commit distant
        4. clean -fdx pour supprimer tout fichier non-tracké
    #>
    $targetBranch = Resolve-TargetBranch

    # Étape 1 : Récupérer les dernières modifications du remote
    Write-Log "Fetch depuis $Remote..."
    Invoke-Git @("fetch", "--prune", $Remote) | Out-Null

    # Étape 2 : Vérifier qu'on est sur la bonne branche
    $localBranch = Get-CurrentBranch
    if ($localBranch -ne $targetBranch) {
        Write-Log "Changement de branche: $localBranch -> $targetBranch"
        try {
            Invoke-Git @("checkout", $targetBranch) | Out-Null
        }
        catch {
            Write-Log "Checkout classique echoue, creation de la branche locale depuis $Remote/$targetBranch" "WARN"
            Invoke-Git @("checkout", "-B", $targetBranch, "$Remote/$targetBranch") | Out-Null
        }
    }

    # Étape 3 : Libérer les verrous si nécessaire
    Clear-RepoLocks

    # Étape 4 : Reset dur sur le commit distant
    Invoke-Git @("reset", "--hard", "$Remote/$targetBranch") | Out-Null

    # Étape 5 : Nettoyer tous les fichiers non-trackés
    Invoke-CleanWithRetries

    # Étape 6 : Confirmation
    $sha = (Invoke-Git @("rev-parse", "--short", "HEAD")).Trim()
    Write-Log "Mirror OK -> $targetBranch @ $sha"
}

# ----------------------------------------------------------------------------
# VALIDATION DES PARAMETRES
# ----------------------------------------------------------------------------
if (-not (Test-Path $RepoPath)) {
    throw "RepoPath introuvable: $RepoPath"
}

if (-not (Test-Path (Join-Path $RepoPath ".git"))) {
    throw "Le dossier cible n'est pas un repo git: $RepoPath"
}

if ($IntervalSeconds -lt 1) {
    throw "IntervalSeconds doit etre >= 1 (recu: $IntervalSeconds)"
}

if ($CleanRetries -lt 1) {
    throw "CleanRetries doit etre >= 1 (recu: $CleanRetries)"
}

if ($RetryDelaySeconds -lt 1) {
    throw "RetryDelaySeconds doit etre >= 1 (recu: $RetryDelaySeconds)"
}

# ----------------------------------------------------------------------------
# INITIALISATION DU LOGGING FICHIER
# ----------------------------------------------------------------------------
$script:LogFilePath = $null
if ($LogFile) {
    $script:LogFilePath = $LogFile
}
else {
    # Log par défaut dans le dossier du repo
    $logDir = Join-Path (Resolve-Path $RepoPath).Path ".git" "sync-logs"
    if (-not (Test-Path $logDir)) {
        New-Item -ItemType Directory -Path $logDir -Force | Out-Null
    }
    $script:LogFilePath = Join-Path $logDir "sync-mirror.log"
}
Write-Log "Fichier log: $script:LogFilePath"

# ----------------------------------------------------------------------------
# VERROU D'INSTANCE UNIQUE
# ----------------------------------------------------------------------------
$mutex = New-ScriptMutex
if (-not $mutex) {
    throw "Une autre instance de Sync-StrictMirror tourne deja sur ce repo. Arrete-la d'abord."
}

# ----------------------------------------------------------------------------
# POINT D'ENTREE
# ----------------------------------------------------------------------------
try {
    if ($Once) {
        # Mode exécution unique
        Write-Log "Mode -Once : synchronisation unique"
        Sync-StrictMirror
        Write-Log "Synchronisation terminee."
    }
    else {
        # Mode boucle continue
        Write-Log "Mode miroir strict actif. Ctrl+C pour arreter."
        Write-Log "Repo: $RepoPath | Remote: $Remote | Interval: ${IntervalSeconds}s"

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
    # Nettoyage garanti : on relâche le mutex même si Ctrl+C ou erreur
    if ($mutex) {
        try {
            $mutex.ReleaseMutex()
        }
        catch {
            # Le mutex peut déjà être relâché si le process a été interrompu brutalement
        }
        $mutex.Dispose()
        Write-Log "Mutex libere. Script arrete proprement."
    }
}
