# ============================================================
# Test : Changements de zone + position carte
#
# Ce que ça vérifie :
#   - "on quitte le monde N" → zone change
#   - "bZJ initialisé, centré sur (X,Y)" → position
#   - Corrélation zone + position
#   - Protecteurs de nation (Update de chaos du protecteur {ID})
#
# Source log : wakfu.log uniquement
# Usage      : pwsh -File test-zones.ps1
# ============================================================

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

function Parse-ZoneLine {
    param([string]$Line)
    if ($Line -match "(?i)on quitte le monde (\d+)") {
        return @{ type="quitte_monde"; world_id=[int]$Matches[1] }
    }
    if ($Line -match "(?i)bZJ initialisé, centré sur \((-?\d+),(-?\d+)\)") {
        return @{ type="bzj_pos"; x=[int]$Matches[1]; y=[int]$Matches[2] }
    }
    return $null
}

function Parse-ProtectorLine {
    param([string]$Line)
    if ($Line -match "(?i)Update de chaos du protecteur (\d+), chaos = (\w+)") {
        return @{ type="protecteur_update"; id=[int]$Matches[1]; chaos=($Matches[2] -eq "true") }
    }
    return $null
}

# ── Cas de test ──────────────────────────────────────────────────────────────
Write-Host "=== Changements de zone + position ===" -ForegroundColor Cyan
$pass = 0; $fail = 0; $i = 0

function Assert {
    param([string]$Name, [bool]$Ok, [string]$Detail = "")
    $script:i++
    if ($Ok) {
        $script:pass++
        Write-Host ("  [OK] [{0}] {1}" -f $script:i, $Name) -ForegroundColor Green
    } else {
        $script:fail++
        Write-Host ("  [!!] [{0}] {1}" -f $script:i, $Name) -ForegroundColor Red
        if ($Detail) { Write-Host ("         $Detail") -ForegroundColor DarkRed }
    }
}

# Quitter un monde (lignes réelles session 2026-03-20)
$r = Parse-ZoneLine "INFO 00:50:38,802 - on quitte le monde 1252"
Assert "Quitte monde 1252" ($null -ne $r -and $r.type -eq "quitte_monde" -and $r.world_id -eq 1252)

$r = Parse-ZoneLine "INFO 00:50:42,452 - on quitte le monde 1089"
Assert "Quitte monde 1089 (biblio-teleport)" ($null -ne $r -and $r.world_id -eq 1089)

$r = Parse-ZoneLine "INFO 00:50:46,274 - on quitte le monde 436"
Assert "Quitte monde 436 (inconnu)" ($null -ne $r -and $r.world_id -eq 436)

# Position carte
$r = Parse-ZoneLine "INFO 00:50:38,860 - bZJ initialisé, centré sur (0,0)"
Assert "Position (0,0)" ($null -ne $r -and $r.type -eq "bzj_pos" -and $r.x -eq 0 -and $r.y -eq 0)

$r = Parse-ZoneLine "INFO 00:50:46,292 - bZJ initialisé, centré sur (6,-6)"
Assert "Position (6,-6) avec coordonnée négative" ($null -ne $r -and $r.x -eq 6 -and $r.y -eq -6)

$r = Parse-ZoneLine "INFO 01:17:13,794 - bZJ initialisé, centré sur (-1,0)"
Assert "Position (-1,0) avec X négatif" ($null -ne $r -and $r.x -eq -1 -and $r.y -eq 0)

# Protecteur de nation (zone Sufokia = protecteurs 348, 349, 354)
$r = Parse-ProtectorLine "INFO 00:51:06,563 - Update de chaos du protecteur 348, chaos = false"
Assert "Protecteur 348 chaos=false (Sufokia)" ($null -ne $r -and $r.id -eq 348 -and $r.chaos -eq $false)

$r = Parse-ProtectorLine "INFO 00:51:06,563 - Update de chaos du protecteur 354, chaos = true"
Assert "Protecteur 354 chaos=true" ($null -ne $r -and $r.id -eq 354 -and $r.chaos -eq $true)

# Ligne sans rapport → null
$r = Parse-ZoneLine "INFO 01:17:13,749 - PERSONAL_SPACE_ENTER_RESULT_MESSAGE (success=true)"
Assert "PERSONAL_SPACE → pas une zone (null)" ($null -eq $r)

$r = Parse-ZoneLine "INFO 01:13:14,800 - Lancement de l'occupation MARKET sur la board [bAL id=31546]"
Assert "HDV MARKET → pas une zone (null)" ($null -eq $r)

$TotalTests = $i
$color = if ($fail -eq 0) { "Green" } else { "Red" }
Write-Host ("  {0}/{1} tests passes" -f $pass, $TotalTests) -ForegroundColor $color