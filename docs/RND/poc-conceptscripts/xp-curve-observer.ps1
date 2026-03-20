param(
    [string]$LogPath   = (Join-Path $env:APPDATA "zaap\gamesLogs\wakfu\logs\wakfu_chat.log"),
    [int]$StartLevel   = 0    # 0 = auto-détecté au premier level-up
)

# ============================================================
# XP Curve Observer
# Suit la progression d'XP d'un personnage en temps réel :
#   - Détecte le nom du personnage automatiquement (premier level-up)
#   - Calcule l'ETA jusqu'au prochain niveau
#   - Enregistre l'heure exacte de chaque montée de niveau
#   - Calcule l'XP requise par niveau et le ratio entre chacun
# ============================================================

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

function Normalize-Int {
    param([string]$v)
    return [int64]([regex]::Replace($v, "[\s\u00A0\u202F']", ""))
}

# ── État global ──────────────────────────────────────────────
$character    = $null          # nom détecté automatiquement
$currentLevel = $StartLevel    # niveau courant
$xpHistory    = [System.Collections.Generic.List[hashtable]]::new()  # derniers gains pour le taux
$levelLog     = [System.Collections.Generic.List[hashtable]]::new()  # historique des level-ups

function Show-LevelTable {
    Write-Host ""
    Write-Host "  ── Courbe XP ──────────────────────────────────────────" -ForegroundColor DarkYellow
    Write-Host ("  {0,-6}  {1,-17}  {2,-14}  {3}" -f "Niveau", "Passé à", "XP du niveau", "Ratio") -ForegroundColor DarkYellow
    $prev = $null
    foreach ($row in $script:levelLog) {
        $ratio = if ($null -ne $prev -and $prev.xp_level -gt 0) {
            "x{0:F2}" -f ($row.xp_level / $prev.xp_level)
        } else { "---" }
        $xpStr = if ($row.xp_level -gt 0) { "{0:N0}" -f $row.xp_level } else { "~{0:N0}" -f $row.remaining_after }
        Write-Host ("  {0,-6}  {1,-17}  {2,-14}  {3}" -f $row.level, $row.passed_at, $xpStr, $ratio) -ForegroundColor Yellow
        $prev = $row
    }
    Write-Host "  ────────────────────────────────────────────────────────" -ForegroundColor DarkYellow
}

# ── Surveillance ─────────────────────────────────────────────
Write-Host ""
Write-Host "  XP Curve Observer — en attente de combats..." -ForegroundColor Cyan
Write-Host "  Personnage : auto-détecté au premier level-up" -ForegroundColor DarkGray
Write-Host "  Log : $LogPath" -ForegroundColor DarkGray
Write-Host ""

$pat = "(?i)\[Information \(combat\)\]\s+(.+?)\s*:\s*\+([\d\s\u00A0\u202F']+)\s+points d'XP\.(.*?)Prochain niveau dans\s*:\s*([\d\s\u00A0\u202F']+)\."

Get-Content $LogPath -Wait -Tail 0 | ForEach-Object {
    $line = $_
    if ($line -notmatch $pat) { return }

    $entity    = $Matches[1].Trim()
    $xpGained  = Normalize-Int $Matches[2]
    $middle    = $Matches[3]
    $remaining = Normalize-Int $Matches[4]
    $ts        = if ($line -match "(\d{2}:\d{2}:\d{2})") { $Matches[1] } else { "??" }
    $levelGain = if ($middle -match "\+(\d+) niveau") { [int]$Matches[1] } else { 0 }

    # ── Détection du personnage ──────────────────────────────
    if ($null -eq $script:character) {
        if ($levelGain -gt 0) {
            $script:character = $entity
            Write-Host "  Personnage détecté : $entity" -ForegroundColor Magenta
        } else {
            # Affiche tous les candidats jusqu'à avoir un level-up
            Write-Host "$ts  [$entity]  +$("{0:N0}" -f $xpGained) XP  Reste:$("{0:N0}" -f $remaining)" -ForegroundColor DarkGray
            return
        }
    }

    # Ignore XP métier (autre entité)
    if ($entity -ne $script:character) { return }

    # ── Enregistrement pour taux XP ─────────────────────────
    $now = Get-Date
    $xpHistory.Add(@{ time=$now; remaining=$remaining })
    while ($xpHistory.Count -gt 8) { $xpHistory.RemoveAt(0) }

    # ── Calcul ETA ───────────────────────────────────────────
    $eta = "--- (attente 2e combat)"
    if ($xpHistory.Count -ge 2) {
        $first   = $xpHistory[0]
        $last    = $xpHistory[$xpHistory.Count - 1]
        $elapsed = ($last.time - $first.time).TotalSeconds
        $xpDone  = $first.remaining - $last.remaining
        if ($elapsed -gt 0 -and $xpDone -gt 0) {
            $rate    = $xpDone / $elapsed
            $secLeft = $remaining / $rate
            $eta     = [TimeSpan]::FromSeconds($secLeft).ToString("hh\:mm\:ss")
        }
    }

    # ── Level-up ─────────────────────────────────────────────
    if ($levelGain -gt 0) {
        $script:currentLevel += $levelGain

        # XP du niveau = remaining_after + XP déjà accumulée dans ce niveau via ce combat
        # Approximation : on stocke remaining_after comme proxy du total du niveau suivant
        $levelRow = @{
            level           = $script:currentLevel
            passed_at       = (Get-Date).ToString("dd/MM HH:mm:ss")
            log_ts          = $ts
            remaining_after = $remaining
            xp_level        = $remaining   # sera affiné si on capte le début du niveau
        }
        $script:levelLog.Add($levelRow)

        Write-Host ""
        Write-Host ("  ★ NIVEAU {0}  +{1} niv  [{2}]  ETA suivant : {3}" -f `
            $script:currentLevel, $levelGain, $ts, $eta) -ForegroundColor Yellow
        Show-LevelTable
    }

    # ── Affichage standard ───────────────────────────────────
    $lvlTag = if ($levelGain -gt 0) { " +$levelGain niv" } else { "" }
    $color  = if ($levelGain -gt 0) { "Yellow" } else { "Cyan" }
    Write-Host ("{0}  +{1,-12} XP{2}  Reste:{3,-14} ETA:{4}" -f `
        $ts, ("{0:N0}" -f $xpGained), $lvlTag, ("{0:N0}" -f $remaining), $eta) -ForegroundColor $color
}
