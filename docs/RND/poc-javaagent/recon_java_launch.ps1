# =============================================================================
#  RECONNAISSANCE JAVA AGENT - Etape 1
#  Localise les fichiers de configuration JVM de Wakfu
#  H:\Code\Wakfuassistant\docs\RND\poc-javaagent\recon_java_launch.ps1
# =============================================================================

$outputDir = "H:\Code\Wakfuassistant\docs\RND\poc-javaagent\output"
if (!(Test-Path $outputDir)) { New-Item -ItemType Directory -Path $outputDir -Force | Out-Null }

$reportPath = "$outputDir\recon_report.txt"
$report = @()

function Add-Report($section, $content) {
    $script:report += ""
    $script:report += "=== $section ==="
    $script:report += $content
    Write-Host "  [OK] $section" -ForegroundColor Green
}

Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  RECONNAISSANCE LANCEMENT WAKFU" -ForegroundColor Cyan
Write-Host "============================================" -ForegroundColor Cyan

# --- 1. Chercher les dossiers Wakfu ---
Write-Host "`n--- Recherche des installations Wakfu ---" -ForegroundColor Yellow

$searchPaths = @(
    "$env:LOCALAPPDATA\Ankama",
    "$env:APPDATA\Ankama",
    "$env:APPDATA\zaap",
    "$env:USERPROFILE\.config\Ankama",
    "C:\Program Files (x86)\Steam\steamapps\common\Wakfu",
    "C:\Program Files\Steam\steamapps\common\Wakfu",
    "D:\Steam\steamapps\common\Wakfu",
    "C:\Program Files (x86)\Ankama",
    "C:\Program Files\Ankama",
    "D:\Ankama",
    "C:\Ankama"
)

$foundDirs = @()
foreach ($p in $searchPaths) {
    if (Test-Path $p) {
        $foundDirs += $p
        Write-Host "  TROUVE: $p" -ForegroundColor Green
        
        $subDirs = Get-ChildItem -Path $p -Recurse -Directory -ErrorAction SilentlyContinue | 
            Where-Object { $_.Name -match "wakfu|game|jre|java|bin" } |
            Select-Object -First 20
        foreach ($sd in $subDirs) {
            Write-Host "    -> $($sd.FullName)" -ForegroundColor DarkGreen
        }
    }
}

if ($foundDirs.Count -eq 0) {
    Write-Host "  Aucun dossier Ankama/Wakfu standard trouve" -ForegroundColor Red
    Write-Host "  Recherche elargie..." -ForegroundColor Yellow
    
    $drives = Get-PSDrive -PSProvider FileSystem | Where-Object { $_.Used -gt 0 }
    foreach ($drive in $drives) {
        $root = $drive.Root
        $wakfuDirs = Get-ChildItem -Path $root -Directory -ErrorAction SilentlyContinue |
            Where-Object { $_.Name -match "Ankama|Wakfu|zaap" }
        foreach ($wd in $wakfuDirs) {
            $foundDirs += $wd.FullName
            Write-Host "  TROUVE: $($wd.FullName)" -ForegroundColor Green
        }
    }
}

Add-Report "DOSSIERS TROUVES" ($foundDirs -join "`n")

# --- 2. Chercher wakfu.ici et fichiers de config ---
Write-Host "`n--- Recherche des fichiers de configuration ---" -ForegroundColor Yellow

$configFiles = @()
$targetFiles = @("wakfu.ici", "zaap-start.sh", "zaap-start.bat", "config.json", 
                  "config.properties", "launch.bat", "launch.sh", "start.bat",
                  "wakfu.bat", "wakfu.sh", "game.json", "settings.json",
                  "zaap-start-custom.sh", "zaap-start-custom.bat")

foreach ($dir in $foundDirs) {
    foreach ($fname in $targetFiles) {
        $found = Get-ChildItem -Path $dir -Recurse -Filter $fname -ErrorAction SilentlyContinue
        foreach ($f in $found) {
            $configFiles += $f.FullName
            Write-Host "  CONFIG: $($f.FullName) ($($f.Length) bytes)" -ForegroundColor Cyan
            
            $content = Get-Content $f.FullName -Raw -ErrorAction SilentlyContinue
            if ($content -and $content.Length -lt 10000) {
                $preview = $content.Substring(0, [Math]::Min(500, $content.Length))
                Write-Host "    Preview: $preview" -ForegroundColor DarkCyan
            }
        }
    }
}

Add-Report "FICHIERS DE CONFIG" ($configFiles -join "`n")

# --- 3. Chercher le JRE bundlé ---
Write-Host "`n--- Recherche du JRE Wakfu ---" -ForegroundColor Yellow

$jrePaths = @()
foreach ($dir in $foundDirs) {
    $javaExes = Get-ChildItem -Path $dir -Recurse -Filter "java.exe" -ErrorAction SilentlyContinue
    foreach ($jx in $javaExes) {
        $jrePaths += $jx.FullName
        Write-Host "  JAVA: $($jx.FullName)" -ForegroundColor Magenta
        
        try {
            $version = & $jx.FullName -version 2>&1
            Write-Host "    Version: $version" -ForegroundColor DarkMagenta
            Add-Report "JAVA VERSION ($($jx.FullName))" ($version | Out-String)
        } catch {
            Write-Host "    (impossible de lire la version)" -ForegroundColor DarkGray
        }
    }
}

Add-Report "JRE TROUVES" ($jrePaths -join "`n")

# --- 4. Chercher les fichiers .jar du client ---
Write-Host "`n--- Recherche des JARs Wakfu ---" -ForegroundColor Yellow

$jarFiles = @()
foreach ($dir in $foundDirs) {
    $jars = Get-ChildItem -Path $dir -Recurse -Filter "*.jar" -ErrorAction SilentlyContinue |
        Sort-Object Length -Descending | Select-Object -First 20
    foreach ($j in $jars) {
        $sizeMB = [Math]::Round($j.Length / 1MB, 2)
        $jarFiles += "$($j.FullName) ($sizeMB MB)"
        Write-Host "  JAR: $($j.Name) ($sizeMB MB) - $($j.DirectoryName)" -ForegroundColor Blue
    }
}

Add-Report "JARS PRINCIPAUX" ($jarFiles -join "`n")

# --- 5. Chercher le processus Wakfu en cours ---
Write-Host "`n--- Recherche du processus Wakfu ---" -ForegroundColor Yellow

$wakfuProcs = Get-Process -ErrorAction SilentlyContinue | 
    Where-Object { $_.ProcessName -match "java|wakfu|ankama" }

foreach ($proc in $wakfuProcs) {
    Write-Host "  PROCESS: $($proc.ProcessName) (PID $($proc.Id))" -ForegroundColor Red
    
    try {
        $wmi = Get-CimInstance Win32_Process -Filter "ProcessId = $($proc.Id)" -ErrorAction SilentlyContinue
        if ($wmi) {
            Write-Host "    CommandLine: $($wmi.CommandLine)" -ForegroundColor DarkRed
            Add-Report "PROCESSUS WAKFU (PID $($proc.Id))" $wmi.CommandLine
        }
    } catch {
        Write-Host "    (impossible de lire la command line)" -ForegroundColor DarkGray
    }
}

if ($wakfuProcs.Count -eq 0) {
    Write-Host "  Aucun processus Wakfu detecte - lance le jeu d'abord!" -ForegroundColor Yellow
    Write-Host "  (Ce n'est pas bloquant, on peut quand meme trouver les fichiers)" -ForegroundColor DarkYellow
}

# --- 6. Chercher les logs recents pour la command line ---
Write-Host "`n--- Recherche dans les logs recents ---" -ForegroundColor Yellow

$logDir = "$env:APPDATA\zaap\gamesLogs\wakfu\logs"
if (Test-Path $logDir) {
    $recentLogs = Get-ChildItem -Path $logDir -Filter "*.log" -ErrorAction SilentlyContinue |
        Sort-Object LastWriteTime -Descending | Select-Object -First 5
    
    foreach ($log in $recentLogs) {
        Write-Host "  LOG: $($log.Name) ($([Math]::Round($log.Length/1KB))KB, modifie $($log.LastWriteTime))" -ForegroundColor DarkYellow
        
        $head = Get-Content $log.FullName -TotalCount 50 -ErrorAction SilentlyContinue
        $jvmLines = $head | Where-Object { $_ -match "jvm|java|agent|classpath|Xms|Xmx" }
        foreach ($jl in $jvmLines) {
            Write-Host "    JVM: $jl" -ForegroundColor Yellow
        }
    }
}

# --- 7. Verifier si JAVA_TOOL_OPTIONS est utilisable ---
Write-Host "`n--- Test JAVA_TOOL_OPTIONS ---" -ForegroundColor Yellow
Write-Host "  JAVA_TOOL_OPTIONS actuel: $env:JAVA_TOOL_OPTIONS" -ForegroundColor White
Write-Host "  NOTE: On peut injecter l'agent via cette variable sans modifier aucun fichier!" -ForegroundColor Green
Write-Host "  Commande: `$env:JAVA_TOOL_OPTIONS = '-javaagent:H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar'" -ForegroundColor Green

Add-Report "JAVA_TOOL_OPTIONS" "Methode d'injection sans modification de fichiers: set JAVA_TOOL_OPTIONS=-javaagent:path\to\agent.jar"

# --- Sauvegarder le rapport ---
$report | Out-File -FilePath $reportPath -Encoding UTF8
Write-Host "`n============================================" -ForegroundColor Cyan
Write-Host "  RAPPORT SAUVEGARDE" -ForegroundColor Cyan
Write-Host "  $reportPath" -ForegroundColor White
Write-Host "============================================" -ForegroundColor Cyan

Write-Host "`n  PROCHAINE ETAPE:" -ForegroundColor Yellow
Write-Host "  1. Copie-moi le resultat ci-dessus" -ForegroundColor White
Write-Host "  2. Si Wakfu est lance, je verrai la command line exacte" -ForegroundColor White
Write-Host "  3. On identifiera le meilleur point d'injection" -ForegroundColor White
Write-Host "  4. ASTUCE: JAVA_TOOL_OPTIONS permet d'injecter SANS" -ForegroundColor Green
Write-Host "     modifier aucun fichier Ankama!" -ForegroundColor Green
