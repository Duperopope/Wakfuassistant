# ============================================================
# Test : XP personnage + métier + level-up
#
# Ce que ça vérifie :
#   - XP de personnage (entité = nom du personnage)
#   - XP de métier (entité = nom du métier)
#   - Détection du level-up
#   - Extraction entité / xp_gained / remaining
#   - Format avec espaces insécables dans les nombres
#
# IMPORTANT — découverte 2026-03-20 :
#   [Information (combat)] peut contenir du XP MÉTIER (ex: Trappeur en combat).
#   La discrimination xp_character vs xp_job se fait sur le NOM DE L'ENTITÉ,
#   pas sur la source [Information (combat)] vs [Information (jeu)].
#   → si entité = CharacterName → xp_character, sinon xp_job.
#
# Source log : wakfu_chat.log (les deux types y apparaissent)
# Usage      : pwsh -File test-xp.ps1
# ============================================================

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

function Normalize-Int {
    param([string]$v)
    return [int64]([regex]::Replace($v, "[\s\u00A0\u202F']", ""))
}

$CharacterName = "L'Immortel"

function Parse-XpLine {
    param([string]$Line)
    $pat = "(?i)\]\s+(.+?)\s*:\s*\+([0-9\s\u00A0\u202F']+)\s+points d'XP\.\s*((?:\+\d+\s+niveau[x]?\.\s*)?)Prochain niveau dans\s*:\s*([0-9\s\u00A0\u202F']+)\."
    if (-not ($Line -match $pat)) { return $null }
    $entity    = $Matches[1].Trim()
    $xpGained  = Normalize-Int $Matches[2]
    $levelUp   = $Matches[3].Trim() -ne ""
    $remaining = Normalize-Int $Matches[4]
    # Discriminer par l'entité : [Information (combat)] peut aussi contenir du XP métier.
    $type      = if ($entity -eq $script:CharacterName) { "xp_character" } else { "xp_job" }
    return @{ type=$type; entity=$entity; xp_gained=$xpGained; remaining=$remaining; level_up=$levelUp }
}

# ── Cas de test ──────────────────────────────────────────────────────────────
$Tests = @(
    @{
        Name     = "XP personnage (combat) sans level-up"
        Line     = "00:39:23,267 - [Information (combat)] L'Immortel : +13 114 689 points d'XP.  Prochain niveau dans : 1 365 544 387."
        Expect   = @{ type="xp_character"; entity="L'Immortel"; xp_gained=13114689; remaining=1365544387; level_up=$false }
    }
    @{
        Name     = "XP métier (jeu) sans level-up"
        Line     = "00:39:04,796 - [Information (jeu)] Trappeur : +221 points d'XP.  Prochain niveau dans : 2 959."
        Expect   = @{ type="xp_job"; entity="Trappeur"; xp_gained=221; remaining=2959; level_up=$false }
    }
    @{
        Name     = "XP personnage avec level-up"
        Line     = "01:15:00,450 - [Information (combat)] L'Immortel : +8 500 000 points d'XP. +1 niveau.  Prochain niveau dans : 2 000 000 000."
        Expect   = @{ type="xp_character"; entity="L'Immortel"; xp_gained=8500000; remaining=2000000000; level_up=$true }
    }
    @{
        Name     = "XP métier avec level-up"
        Line     = "02:10:15,320 - [Information (jeu)] Herboriste : +500 points d'XP. +1 niveau.  Prochain niveau dans : 1 000."
        Expect   = @{ type="xp_job"; entity="Herboriste"; xp_gained=500; remaining=1000; level_up=$true }
    }
    @{
        Name     = "Ligne non-XP → doit retourner null"
        Line     = "01:13:31,909 - [Information (jeu)] Vous avez gagné 5 kamas."
        Expect   = $null
    }
    @{
        Name     = "XP avec nom contenant apostrophe"
        Line     = "00:45:00,000 - [Information (jeu)] Maître d'armes : +1 000 points d'XP.  Prochain niveau dans : 50 000."
        Expect   = @{ type="xp_job"; entity="Maître d'armes"; xp_gained=1000; remaining=50000; level_up=$false }
    }
    @{
        # BUG CONNU 2026-03-20 : Trappeur en combat → [Information (combat)] mais c'est du xp_job
        Name     = "Trappeur XP dans [Information (combat)] → doit être xp_job"
        Line     = "00:39:04,796 - [Information (combat)] Trappeur : +221 points d'XP.  Prochain niveau dans : 2 959."
        Expect   = @{ type="xp_job"; entity="Trappeur"; xp_gained=221; remaining=2959; level_up=$false }
    }
    @{
        # Données réelles — session 2026-03-20 (1er combat observé)
        Name     = "XP réel L'Immortel combat 1 (2026-03-20)"
        Line     = "02:07:50,000 - [Information (combat)] L'Immortel : +12 326 014 points d'XP.  Prochain niveau dans : 1 085 299 128."
        Expect   = @{ type="xp_character"; entity="L'Immortel"; xp_gained=12326014; remaining=1085299128; level_up=$false }
    }
    @{
        # Données réelles — session 2026-03-20 (2e combat observé, ETA calculé à 01:05:39)
        Name     = "XP réel L'Immortel combat 2 (2026-03-20)"
        Line     = "02:08:45,000 - [Information (combat)] L'Immortel : +15 050 352 points d'XP.  Prochain niveau dans : 1 070 248 776."
        Expect   = @{ type="xp_character"; entity="L'Immortel"; xp_gained=15050352; remaining=1070248776; level_up=$false }
    }
)

# ── Moteur de test ───────────────────────────────────────────────────────────
Write-Host "=== XP personnage + métier ===" -ForegroundColor Cyan
$pass = 0; $fail = 0; $i = 0

foreach ($t in $Tests) {
    $i++
    $got = Parse-XpLine -Line $t.Line

    if ($null -eq $t.Expect) {
        $ok = ($null -eq $got)
    } else {
        $ok = ($null -ne $got) `
            -and $got.type       -eq $t.Expect.type `
            -and $got.entity     -eq $t.Expect.entity `
            -and $got.xp_gained  -eq $t.Expect.xp_gained `
            -and $got.remaining  -eq $t.Expect.remaining `
            -and $got.level_up   -eq $t.Expect.level_up
    }

    if ($ok) {
        $pass++
        Write-Host ("  [OK] [{0}/{1}] {2}" -f $i, $Tests.Count, $t.Name) -ForegroundColor Green
    } else {
        $fail++
        Write-Host ("  [!!] [{0}/{1}] {2}" -f $i, $Tests.Count, $t.Name) -ForegroundColor Red
        if ($null -ne $t.Expect -and $null -ne $got) {
            Write-Host ("         Attendu : type={0} entity={1} xp={2} remaining={3} levelup={4}" -f `
                $t.Expect.type, $t.Expect.entity, $t.Expect.xp_gained, $t.Expect.remaining, $t.Expect.level_up) -ForegroundColor DarkRed
            Write-Host ("         Obtenu  : type={0} entity={1} xp={2} remaining={3} levelup={4}" -f `
                $got.type, $got.entity, $got.xp_gained, $got.remaining, $got.level_up) -ForegroundColor DarkRed
        } elseif ($null -eq $got) {
            Write-Host "         Obtenu  : null (parser n'a rien reconnu)" -ForegroundColor DarkRed
        }
    }
}

$color = if ($fail -eq 0) { "Green" } else { "Red" }
Write-Host ("  {0}/{1} tests passés" -f $pass, $Tests.Count) -ForegroundColor $color
