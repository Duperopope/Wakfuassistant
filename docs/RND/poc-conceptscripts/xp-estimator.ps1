param(
    [string]$LogPath = (Join-Path $env:APPDATA "zaap\gamesLogs\wakfu\logs\wakfu.log")
)

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

function Parse-NormalizedInt64 {
    param([string]$Value)

    if ([string]::IsNullOrWhiteSpace($Value)) {
        return [int64]0
    }

    # Supprime espaces, espaces inseparables et apostrophes utilises dans certains formats numeriques.
    $cleaned = [regex]::Replace($Value, "[\s\u00A0\u202F']", "")
    if (-not ($cleaned -match "^-?\d+$")) {
        return [int64]0
    }

    return [int64]$cleaned
}

function Format-TimeSpanShort {
    param([TimeSpan]$Value)

    if ($Value.TotalSeconds -lt 0) {
        return "00m 00s"
    }

    if ($Value.TotalHours -ge 1) {
        return "{0:00}h {1:00}m {2:00}s" -f [int]$Value.TotalHours, $Value.Minutes, $Value.Seconds
    }

    return "{0:00}m {1:00}s" -f $Value.Minutes, $Value.Seconds
}

function Write-Dashboard {
    param(
        [int]$CurrentLevel,
        [int64]$CurrentKamas,
        [int64]$SessionXp,
        [int64]$SessionKamasDelta,
        [int64]$LatestRemainingXp,
        [double]$XpPerHour,
        [string]$EtaText,
        [datetime]$StartedAt,
        [string]$LastLine
    )

    Clear-Host
    Write-Host "=== Estimateur Level Up Temps Reel ===" -ForegroundColor Cyan
    Write-Host "Debut session : $($StartedAt.ToString('yyyy-MM-dd HH:mm:ss'))"
    Write-Host ""
    Write-Host "Niveau actuel           : $CurrentLevel"
    Write-Host "Kamas actuels           : $CurrentKamas"
    Write-Host "Delta kamas session     : $SessionKamasDelta"
    Write-Host "XP gagnee session       : $SessionXp"

    if ($LatestRemainingXp -ge 0) {
        Write-Host "XP restante (dernier log): $LatestRemainingXp"
    }
    else {
        Write-Host "XP restante (dernier log): inconnue (attente d'une ligne XP)"
    }

    Write-Host "Rythme XP estime        : $([math]::Round($XpPerHour, 2)) XP/h"
    Write-Host "ETA level up            : $EtaText" -ForegroundColor Yellow
    Write-Host ""
    Write-Host "Derniere ligne utile    : $LastLine"
    Write-Host ""
    Write-Host "Astuce: laisse cette fenetre ouverte pendant que tu joues. Ctrl+C pour arreter."
}

if (-not (Test-Path -Path $LogPath -PathType Leaf)) {
    Write-Host "ERREUR: log introuvable: $LogPath" -ForegroundColor Red
    Write-Host "Passe un chemin valide avec -LogPath."
    exit 1
}

Write-Host "=== Configuration initiale ===" -ForegroundColor Cyan

$kamasInput = Read-Host "Combien tu as de kamas actuellement"
$levelInput = Read-Host "Quel niveau tu es actuellement"
$xpInput = Read-Host "Combien d'XP tu as deja gagnee dans cette session (0 si debut)"

$currentKamas = Parse-NormalizedInt64 -Value $kamasInput
$currentLevel = [int](Parse-NormalizedInt64 -Value $levelInput)
$sessionXp = Parse-NormalizedInt64 -Value $xpInput

$sessionKamasDelta = [int64]0
$latestRemainingXp = [int64]-1
$startedAt = Get-Date
$lastUsefulLine = "Aucune ligne analysee pour l'instant"

Write-Host ""
Write-Host "Lecture en temps reel de: $LogPath" -ForegroundColor Green
Write-Host "Attente de nouvelles lignes..." -ForegroundColor Green

# Historique XP pour calculer un rythme en fonction de la session en cours.
$xpEvents = New-Object System.Collections.Generic.List[object]

Write-Dashboard -CurrentLevel $currentLevel -CurrentKamas $currentKamas -SessionXp $sessionXp -SessionKamasDelta $sessionKamasDelta -LatestRemainingXp $latestRemainingXp -XpPerHour 0 -EtaText "En attente de gain XP" -StartedAt $startedAt -LastLine $lastUsefulLine

Get-Content -Path $LogPath -Encoding UTF8 -Tail 0 -Wait | ForEach-Object {
    $line = [string]$_
    $lineChanged = $false

    if ($line -match "(?i)Vous avez gagn(?:e|é)\s+([0-9\s\u00A0\u202F']+)\s+kama(?:s)?\.") {
        $amount = Parse-NormalizedInt64 -Value $Matches[1]
        $currentKamas += $amount
        $sessionKamasDelta += $amount
        $lastUsefulLine = $line
        $lineChanged = $true
    }
    elseif ($line -match "(?i)Vous avez perdu\s+([0-9\s\u00A0\u202F']+)\s+kama(?:s)?\.") {
        $amount = Parse-NormalizedInt64 -Value $Matches[1]
        $currentKamas -= $amount
        $sessionKamasDelta -= $amount
        $lastUsefulLine = $line
        $lineChanged = $true
    }

    # XP avec "Prochain niveau dans" pour obtenir directement l'XP restante.
    if ($line -match "(?i):\s*\+([0-9\s\u00A0\u202F']+)\s+points d'XP\.\s*Prochain niveau dans\s*:\s*([0-9\s\u00A0\u202F']+)\.") {
        $xpAmount = Parse-NormalizedInt64 -Value $Matches[1]
        $remaining = Parse-NormalizedInt64 -Value $Matches[2]

        $sessionXp += $xpAmount
        $latestRemainingXp = $remaining
        $xpEvents.Add([pscustomobject]@{ at = (Get-Date); amount = $xpAmount })

        $lastUsefulLine = $line
        $lineChanged = $true
    }
    elseif ($line -match "(?i):\s*\+([0-9\s\u00A0\u202F']+)\s+points d'XP\.") {
        # Fallback si la ligne XP n'inclut pas "Prochain niveau dans".
        $xpAmount = Parse-NormalizedInt64 -Value $Matches[1]

        $sessionXp += $xpAmount
        $xpEvents.Add([pscustomobject]@{ at = (Get-Date); amount = $xpAmount })

        $lastUsefulLine = $line
        $lineChanged = $true
    }

    if (-not $lineChanged) {
        return
    }

    $elapsedHours = ((Get-Date) - $startedAt).TotalHours
    $xpPerHour = 0.0
    if ($elapsedHours -gt 0) {
        $xpPerHour = $sessionXp / $elapsedHours
    }

    $etaText = "Donnees insuffisantes"
    if ($latestRemainingXp -eq 0) {
        $etaText = "Level up imminent"
    }
    elseif ($latestRemainingXp -gt 0 -and $xpPerHour -gt 0) {
        $hoursLeft = $latestRemainingXp / $xpPerHour
        $eta = [TimeSpan]::FromHours($hoursLeft)
        $etaText = Format-TimeSpanShort -Value $eta
    }

    Write-Dashboard -CurrentLevel $currentLevel -CurrentKamas $currentKamas -SessionXp $sessionXp -SessionKamasDelta $sessionKamasDelta -LatestRemainingXp $latestRemainingXp -XpPerHour $xpPerHour -EtaText $etaText -StartedAt $startedAt -LastLine $lastUsefulLine
}
