# watchdog.ps1 - Boucle autonome OpenCode + memoire OpenClaw
# Usage : powershell -ExecutionPolicy Bypass -File H:\Code\Wakfuassistant\scripts\watchdog.ps1

$ErrorActionPreference = "Continue"
$projectDir = "H:\Code\Wakfuassistant"
$memoryDir = "$projectDir\memory"
$logFile = "$projectDir\logs\watchdog.log"
$pauseSeconds = 30

Set-Location $projectDir

if (!(Test-Path "$projectDir\logs")) { New-Item -ItemType Directory -Path "$projectDir\logs" -Force | Out-Null }
if (!(Test-Path $memoryDir)) { New-Item -ItemType Directory -Path $memoryDir -Force | Out-Null }

function Log($msg) {
    $ts = Get-Date -Format "yyyy-MM-dd HH:mm:ss"
    $line = "[$ts] $msg"
    Write-Host $line
    Add-Content -Path $logFile -Value $line -Encoding UTF8
}

function Save-Memory($action, $result) {
    $today = Get-Date -Format "yyyy-MM-dd"
    $ts = Get-Date -Format "HH:mm:ss"
    $memFile = "$memoryDir\$today.md"
    $entry = "`n## $ts - Watchdog`n- Action: $action`n- Resultat: $result`n"
    Add-Content -Path $memFile -Value $entry -Encoding UTF8
}

function Get-TodayMemory {
    $today = Get-Date -Format "yyyy-MM-dd"
    $memFile = "$memoryDir\$today.md"
    if (Test-Path $memFile) {
        $content = Get-Content $memFile -Raw -Encoding UTF8
        if ($content.Length -gt 1500) { return $content.Substring($content.Length - 1500) }
        return $content
    }
    return "Pas de memoire."
}

function Run-Tests {
    $result = & python -m pytest tests/ -v 2>&1 | Out-String
    return $result
}

function Run-HealthCheck {
    $result = & python "$projectDir\health_check.py" 2>&1 | Out-String
    return $result
}

# ============================================================
# BOUCLE PRINCIPALE
# ============================================================

Log "========== WATCHDOG DEMARRE =========="
$cycleCount = 0

while ($true) {
    $cycleCount++
    Log "--- Cycle $cycleCount ---"

    try {
        # 1. Health check
        $healthOutput = Run-HealthCheck
        $healthOK = $healthOutput -notmatch "ERREUR|FAIL|Error|Traceback"
        
        if (-not $healthOK) {
            Log "HEALTH CHECK ECHOUE"
            Save-Memory "Health check echoue" "Erreur detectee"
            
            $mem = Get-TodayMemory
            $promptFile = "$projectDir\logs\prompt_temp.txt"
            Set-Content -Path $promptFile -Value "MEMOIRE DU JOUR: $mem`n`nLe health_check.py a echoue. Erreur: $healthOutput`n`nCorrige le probleme. Commite avant modification, teste apres, reverte si echec. Commit en francais. CHANGELOG.md a jour." -Encoding UTF8
            
            Log "Lancement OpenCode pour correction health check..."
            $ocResult = & opencode run (Get-Content $promptFile -Raw) 2>&1 | Out-String
            Log "OpenCode termine. Sortie: $($ocResult.Substring(0, [Math]::Min(200, $ocResult.Length)))"
            Save-Memory "Correction health check tentee" "OpenCode execute"
            
            Start-Sleep -Seconds $pauseSeconds
            continue
        }
        Log "Health check OK"

        # 2. Tests
        $testOutput = Run-Tests
        $testsOK = $testOutput -match "passed" -and $testOutput -notmatch "failed|error"

        if (-not $testsOK) {
            Log "TESTS ECHOUES"
            Save-Memory "Tests echoues" "Erreur detectee"
            
            $mem = Get-TodayMemory
            $promptFile = "$projectDir\logs\prompt_temp.txt"
            Set-Content -Path $promptFile -Value "MEMOIRE DU JOUR: $mem`n`nLes tests pytest ont echoue: $testOutput`n`nCorrige les tests ou le code. Commite avant, teste apres, reverte si echec. Commit en francais. CHANGELOG.md a jour." -Encoding UTF8
            
            Log "Lancement OpenCode pour correction tests..."
            $ocResult = & opencode run (Get-Content $promptFile -Raw) 2>&1 | Out-String
            Log "OpenCode termine. Sortie: $($ocResult.Substring(0, [Math]::Min(200, $ocResult.Length)))"
            Save-Memory "Correction tests tentee" "OpenCode execute"
            
            Start-Sleep -Seconds $pauseSeconds
            continue
        }
        Log "Tests OK"

        # 3. Nettoyage periodique
        if ($cycleCount % 10 -eq 0) {
            Log "Nettoyage periodique..."
            & opencode run "Nettoie le projet : supprime __pycache__, .pytest_cache, fichiers .bak inutiles. Verifie .gitignore. Commite en francais. CHANGELOG.md a jour." 2>&1 | Out-String
            Save-Memory "Nettoyage" "Execute"
            Start-Sleep -Seconds $pauseSeconds
            continue
        }

        # 4. Amelioration continue
        $mem = Get-TodayMemory
        $promptFile = "$projectDir\logs\prompt_temp.txt"
        Set-Content -Path $promptFile -Value "MEMOIRE DU JOUR: $mem`n`nWakfuAssistant fonctionne: health check OK, tests passent. Choisis UNE amelioration: ajouter tests, corriger typage, documenter, optimiser, ou ajouter fonctionnalite. Commite avant, teste apres, reverte si echec. Commit francais. CHANGELOG.md a jour." -Encoding UTF8
        
        Log "Amelioration continue..."
        $ocResult = & opencode run (Get-Content $promptFile -Raw) 2>&1 | Out-String
        Log "OpenCode termine. Sortie: $($ocResult.Substring(0, [Math]::Min(200, $ocResult.Length)))"
        Save-Memory "Amelioration" "Cycle $cycleCount"

    } catch {
        Log "ERREUR INATTENDUE: $($_.Exception.Message)"
        Save-Memory "Erreur watchdog" $_.Exception.Message
    }

    Log "Pause $pauseSeconds secondes..."
    Start-Sleep -Seconds $pauseSeconds
}
