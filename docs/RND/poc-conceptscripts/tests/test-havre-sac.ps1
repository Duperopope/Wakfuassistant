# ============================================================
# Test : Havre sac — ouverture + visiteurs
#
# Ce que ça vérifie :
#   - Ouverture du havre sac (PERSONAL_SPACE_ENTER_RESULT_MESSAGE)
#   - Détection d'un visiteur via [Checkpath] Room access is forbidden
#   - Détection d'erreur de dépôt coffre de compte
#   - Détection de décoration mal placée (bruit de fond)
#
# Pattern visiteur :
#   Le seul signal d'un visiteur dans les logs est :
#   [Checkpath] Room access is forbidden for player with id {ID}
#   → le joueur ID a essayé d'entrer dans une pièce verrouillée.
#   Si le visiteur n'essaie aucune pièce verrouillée, il n'apparaît PAS dans les logs.
#
# Source log : wakfu.log uniquement (pas dans wakfu_chat.log)
# Usage      : pwsh -File test-havre-sac.ps1
# ============================================================

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

function Parse-HavreSacOpen {
    param([string]$Line)
    if ($Line -match "(?i)PERSONAL_SPACE_ENTER_RESULT_MESSAGE \(success=true\)") {
        return @{ type="havre_sac_open"; success=$true }
    }
    if ($Line -match "(?i)PERSONAL_SPACE_ENTER_RESULT_MESSAGE \(success=false\)") {
        return @{ type="havre_sac_open"; success=$false }
    }
    return $null
}

function Parse-HavreSacVisitor {
    # [Checkpath] Room access is forbidden for player with id {ID}
    # Signifie qu'un joueur (ID) a tenté d'accéder à une pièce verrouillée
    param([string]$Line)
    if ($Line -match "(?i)\[Checkpath\] Room access is forbidden for player with id (\d+)") {
        return @{ type="visitor_blocked"; player_id=[int64]$Matches[1] }
    }
    return $null
}

function Parse-AccountChestError {
    param([string]$Line)
    if ($Line -match "(?i)\[Account chest\] Error when stacking items to account chest") {
        return @{ type="account_chest_error" }
    }
    return $null
}

function Parse-HavreSacDecorError {
    # Bruit de fond à l'entrée du havre sac — élément de décoration mal placé
    param([string]$Line)
    if ($Line -match "(?i)sac dimensionnel plac. au mauvais endroit .+ de type=DECORATION") {
        return @{ type="decor_misplaced" }
    }
    return $null
}

# ── Cas de test ──────────────────────────────────────────────────────────────
Write-Host "=== Havre sac — ouverture + visiteurs ===" -ForegroundColor Cyan
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

# Ouverture réussie (ligne réelle wakfu.log 2026-03-20)
$r = Parse-HavreSacOpen "01:17:13,749 [AWT-EventQueue-0] (cdV:1092) - PERSONAL_SPACE_ENTER_RESULT_MESSAGE (success=true)"
Assert "Ouverture havre sac réussie" ($null -ne $r -and $r.success -eq $true)

# Ouverture échouée (zone interdite)
$r = Parse-HavreSacOpen "01:17:13,749 [AWT-EventQueue-0] (cdV:1092) - PERSONAL_SPACE_ENTER_RESULT_MESSAGE (success=false)"
Assert "Ouverture havre sac échouée (zone interdite)" ($null -ne $r -and $r.success -eq $false)

# Visiteur bloqué (ligne réelle wakfu.log 2026-03-20 → player 3057237 a tenté une pièce verrouillée)
$r = Parse-HavreSacVisitor "01:18:41,620 [AWT-EventQueue-0] (bnv:338) - [Checkpath] Room access is forbidden for player with id 3057237"
Assert "Visiteur bloqué sur pièce verrouillée (id=3057237)" ($null -ne $r -and $r.player_id -eq 3057237)

# Autre ID visiteur
$r = Parse-HavreSacVisitor "02:05:12,100 [AWT-EventQueue-0] (bnv:338) - [Checkpath] Room access is forbidden for player with id 6586467"
Assert "Visiteur bloqué (id=6586467)" ($null -ne $r -and $r.player_id -eq 6586467)

# Erreur coffre de compte
$r = Parse-AccountChestError "01:17:32,423 [AWT-EventQueue-0] (ceg:26) - [Account chest] Error when stacking items to account chest= ERROR"
Assert "Erreur dépôt coffre de compte" ($null -ne $r)

# Décoration mal placée = bruit de fond, doit être reconnu mais ignoré en pratique
$r = Parse-HavreSacDecorError "01:17:13,811 [AWT-EventQueue-0] (fnv:265) - Élément dans le sac dimensionnel placé au mauvais endroit bDm@3ab23398 (-4;46) de type=DECORATION"
Assert "Décoration mal placée (bruit de fond identifié)" ($null -ne $r)

# Ligne sans rapport → null
$r = Parse-HavreSacVisitor "01:17:13,748 [AWT-EventQueue-0] (flc:215) - [NATION] Trying to remove 6586467 from {Nation id=0} after a disconnection"
Assert "NATION message → pas un visiteur (null)" ($null -eq $r)

# Note explicative sur la limite
Write-Host ""
Write-Host "  NOTE : Un visiteur qui n'essaie aucune piece verrouillee" -ForegroundColor DarkYellow
Write-Host "  ne laisse AUCUNE trace dans les logs. Detection partielle seulement." -ForegroundColor DarkYellow

$TotalTests = $i
$color = if ($fail -eq 0) { "Green" } else { "Red" }
Write-Host ("  {0}/{1} tests passes" -f $pass, $TotalTests) -ForegroundColor $color