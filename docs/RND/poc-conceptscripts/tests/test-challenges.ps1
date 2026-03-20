# ============================================================
# Test : Challenges combat (réussis / ratés)
#
# Ce que ça vérifie :
#   - Challenge réussi : Le challenge "X" est réussi.
#   - Challenge raté : Le challenge "X" a échoué.
#   - Noms avec accents et caractères spéciaux
#   - Ligne sans rapport → null
#
# Source log : wakfu_chat.log ([Information (jeu)])
# Usage      : pwsh -File test-challenges.ps1
# ============================================================

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

function Parse-ChallengeLine {
    param([string]$Line)
    if ($Line -match '(?i)\[Information \(jeu\)\] Le challenge "([^"]+)" est r.ussi\.') {
        return @{ type="challenge_success"; name=$Matches[1] }
    }
    if ($Line -match '(?i)\[Information \(jeu\)\] Le challenge "([^"]+)" a .chou.\.') {
        return @{ type="challenge_failed";  name=$Matches[1] }
    }
    return $null
}

# ── Cas de test ──────────────────────────────────────────────────────────────
Write-Host "=== Challenges combat ===" -ForegroundColor Cyan
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

$r = Parse-ChallengeLine '00:39:04,796 - [Information (jeu)] Le challenge "Nomade" est réussi.'
Assert 'Challenge réussi : "Nomade"' ($null -ne $r -and $r.type -eq "challenge_success" -and $r.name -eq "Nomade")

$r = Parse-ChallengeLine '00:39:04,796 - [Information (jeu)] Le challenge "Déclin" a échoué.'
Assert 'Challenge raté : "Déclin" (accent é)' ($null -ne $r -and $r.type -eq "challenge_failed" -and $r.name -eq "Déclin")

$r = Parse-ChallengeLine '01:15:00,450 - [Information (jeu)] Le challenge "Maître de la distance" est réussi.'
Assert 'Challenge réussi : nom avec accents et espaces' ($null -ne $r -and $r.name -eq "Maître de la distance")

$r = Parse-ChallengeLine '01:15:00,450 - [Information (jeu)] Le challenge "L''Intouchable" est réussi.'
Assert 'Challenge réussi : nom avec apostrophe' ($null -ne $r -and $r.name -eq "L'Intouchable")

# Ligne sans rapport
$r = Parse-ChallengeLine '01:13:31,909 - [Information (jeu)] Vous avez gagné 5 kamas.'
Assert "Ligne kamas → pas un challenge (null)" ($null -eq $r)

$r = Parse-ChallengeLine '01:13:57,910 - [Information (combat)] L''Immortel : +13 114 689 points d''XP.  Prochain niveau dans : 1 365 544 387.'
Assert "Ligne XP → pas un challenge (null)" ($null -eq $r)

$TotalTests = $i
$color = if ($fail -eq 0) { "Green" } else { "Red" }
Write-Host ("  {0}/{1} tests passes" -f $pass, $TotalTests) -ForegroundColor $color