# ============================================================
# Test : HDV — ventes, achats, mises en vente
#
# Ce que ça vérifie :
#   - Vente hors-session ("pendant votre absence")
#   - Gain de kamas (vente instantanée / récompense)
#   - Perte de kamas (achat / commission mise en vente)
#   - Discrimination mise-en-vente vs vente-instantanée (fenêtre de 2 lignes)
#   - Identification du comptoir par bAL id
#
# Source log : wakfu.log ET wakfu_chat.log
# Usage      : pwsh -File test-hdv.ps1
# ============================================================

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

function Normalize-Int {
    param([string]$v)
    return [int64]([regex]::Replace($v, "[\s\u00A0\u202F']", ""))
}

function Parse-KamasGained {
    param([string]$Line)
    if ($Line -match "(?i)Vous avez gagn\S+\s+([0-9\s\u00A0\u202F']+)\s+kama(?:s)?\.") {
        return @{ type="kamas_gained"; amount=(Normalize-Int $Matches[1]) }
    }
    return $null
}

function Parse-KamasLost {
    param([string]$Line)
    if ($Line -match "(?i)Vous avez perdu\s+([0-9\s\u00A0\u202F']+)\s+kama(?:s)?\.") {
        return @{ type="kamas_lost"; amount=(Normalize-Int $Matches[1]) }
    }
    return $null
}

function Parse-VenteHorsSsession {
    param([string]$Line)
    if ($Line -match "(?i)Vous avez vendu (\d+) objets? pour un prix total de ([0-9\s\u00A0\u202F']+)\u00A7 pendant votre absence") {
        return @{ type="vente_hors_session"; qty=[int]$Matches[1]; total=(Normalize-Int $Matches[2]) }
    }
    # Variante sans §
    if ($Line -match "(?i)Vous avez vendu (\d+) objets? pour un prix total de ([0-9\s\u00A0\u202F']+)\§ pendant votre absence") {
        return @{ type="vente_hors_session"; qty=[int]$Matches[1]; total=(Normalize-Int $Matches[2]) }
    }
    return $null
}

function Parse-MarketBoard {
    param([string]$Line)
    if ($Line -match "(?i)Lancement de l'occupation MARKET sur la board \[bAL id=(\d+)\]") {
        return @{ type="market_open"; board_id=[int]$Matches[1] }
    }
    if ($Line -match "(?i)On arr.te l'occupation MARKET sur la board \[bAL id=(\d+)\]") {
        return @{ type="market_close"; board_id=[int]$Matches[1] }
    }
    return $null
}

# ── Fenêtre pour discriminer mise-en-vente vs vente-instantanée ──────────────
# Règle :
#   perdu item + perdu kamas → mise en vente (commission)
#   perdu item + gagné kamas → vente instantanée / réponse à offre d'achat
#   perdu kamas + ramassé item → achat
#
# Simplifié ici : fenêtre de 2 lignes pour tester la classification.

function Classify-TwoLines {
    param([string]$Line1, [string]$Line2)
    $lost1   = $Line1 -match "(?i)Vous avez perdu (\d+)x (.+?) \."
    $gained1 = $Line1 -match "(?i)Vous avez ramass\S+ (\d+)x (.+?) \."
    $kLost1  = $null -ne (Parse-KamasLost $Line1)
    $kGain1  = $null -ne (Parse-KamasGained $Line1)

    $lost2   = $Line2 -match "(?i)Vous avez perdu (\d+)x (.+?) \."
    $kLost2  = $null -ne (Parse-KamasLost $Line2)
    $kGain2  = $null -ne (Parse-KamasGained $Line2)
    $gained2 = $Line2 -match "(?i)Vous avez ramass\S+ (\d+)x (.+?) \."

    if ($lost1 -and $kLost2)  { return "mise_en_vente" }
    if ($lost1 -and $kGain2)  { return "vente_instantanee" }
    if ($kLost1 -and $gained2){ return "achat" }
    return "inconnu"
}

# ── Cas de test ──────────────────────────────────────────────────────────────
Write-Host "=== HDV — ventes, achats, kamas ===" -ForegroundColor Cyan
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

# Vente hors-session
$r = Parse-VenteHorsSsession "14:05:00,000 - [Information (jeu)] Vous avez vendu 9 objets pour un prix total de 12 632§ pendant votre absence."
Assert "Vente hors-session : 9 objets pour 12 632 kamas" `
    ($null -ne $r -and $r.qty -eq 9 -and $r.total -eq 12632)

$r = Parse-VenteHorsSsession "14:05:00,000 - [Information (jeu)] Vous avez vendu 1 objet pour un prix total de 50 000§ pendant votre absence."
Assert "Vente hors-session : 1 objet (singulier)" `
    ($null -ne $r -and $r.qty -eq 1 -and $r.total -eq 50000)

# Gain de kamas
$r = Parse-KamasGained "01:13:31,909 - [Information (jeu)] Vous avez gagné 5 kamas."
Assert "Gain kamas : 5 kamas" ($null -ne $r -and $r.amount -eq 5)

$r = Parse-KamasGained "01:13:31,909 - [Information (jeu)] Vous avez gagné 24 kamas."
Assert "Gain kamas : 24 kamas" ($null -ne $r -and $r.amount -eq 24)

$r = Parse-KamasGained "01:13:31,909 - [Information (jeu)] Vous avez gagné 1 500 000 kamas."
Assert "Gain kamas : 1 500 000 kamas (avec espaces)" ($null -ne $r -and $r.amount -eq 1500000)

# Perte de kamas
$r = Parse-KamasLost "01:13:57,910 - [Information (jeu)] Vous avez perdu 2 kamas."
Assert "Perte kamas : 2 kamas (commission)" ($null -ne $r -and $r.amount -eq 2)

$r = Parse-KamasLost "01:13:57,910 - [Information (jeu)] Vous avez perdu 1 kama."
Assert "Perte kamas : 1 kama (singulier)" ($null -ne $r -and $r.amount -eq 1)

# Mise en vente (2 lignes)
$class = Classify-TwoLines `
    "01:13:00,000 - [Information (jeu)] Vous avez perdu 1x Feuille de Menthe ." `
    "01:13:00,001 - [Information (jeu)] Vous avez perdu 2 kamas."
Assert "Mise en vente = perdu item + perdu kamas" ($class -eq "mise_en_vente")

# Vente instantanée (2 lignes)
$class = Classify-TwoLines `
    "01:13:10,000 - [Information (jeu)] Vous avez perdu 1x Feuille de Menthe ." `
    "01:13:10,001 - [Information (jeu)] Vous avez gagné 24 kamas."
Assert "Vente instantanée = perdu item + gagné kamas" ($class -eq "vente_instantanee")

# Achat (2 lignes)
$class = Classify-TwoLines `
    "01:13:20,000 - [Information (jeu)] Vous avez perdu 1 kama." `
    "01:13:20,001 - [Information (jeu)] Vous avez ramassé 1x Hache Piou ."
Assert "Achat = perdu kamas + ramassé item" ($class -eq "achat")

# Board ID HDV
$r = Parse-MarketBoard "01:13:14,800 - Lancement de l'occupation MARKET sur la board [bAL id=31546]{Point3 : (-12, 27, -57)}"
Assert "Ouverture HDV board 31546 (Sufokia)" ($null -ne $r -and $r.type -eq "market_open" -and $r.board_id -eq 31546)

$r = Parse-MarketBoard "01:14:10,959 - On arrête l'occupation MARKET sur la board [bAL id=31546]{Point3 : (-12, 27, -57)}"
Assert "Fermeture HDV board 31546" ($null -ne $r -and $r.type -eq "market_close" -and $r.board_id -eq 31546)

# Ligne sans rapport
$r = Parse-KamasGained "01:13:31,909 - [Information (jeu)] Vous avez perdu 5x Boufmarteau ."
Assert "Ligne non-kamas → null" ($null -eq $r)

$TotalTests = $i
$color = if ($fail -eq 0) { "Green" } else { "Red" }
Write-Host ("  {0}/{1} tests passes" -f $pass, $TotalTests) -ForegroundColor $color