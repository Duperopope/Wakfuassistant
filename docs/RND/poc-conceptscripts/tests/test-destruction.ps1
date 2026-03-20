# ============================================================
# Test : Destruction d'objets (runes, poudres, équipements)
#
# Mécanique : la destruction génère 2 ou 3 lignes consécutives
#   1. [Information (jeu)] Vous avez perdu Nx {item} .         (toujours)
#   2. [Information (jeu)] Vous avez ramassé Nx {ressource} .  (si > 0 récupéré, ordre variable)
#   3. [Information (jeu)] Vous avez détruit N objet(s) et récupéré N ressource(s)  (en dernier)
#
# Cas réels observés (wakfu.log 2026-03-20) :
#   perdu 5x Prévisiobottes + ramassé 38x Eclats + détruit 5 objets récupéré 38 ressources
#   perdu 5x Boufmarteau + détruit 5 objets récupéré 0 ressource  (0 = pas de ramassé)
#   ramassé 22x Eclats + perdu 3x Patapourtour + détruit 3 objets (ordre inversé possible)
#
# Source log : wakfu.log ET wakfu_chat.log (les deux ont [Information (jeu)])
# Usage      : pwsh -File test-destruction.ps1
# ============================================================

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

# ── Parsers ligne par ligne ──────────────────────────────────────────────────

function Parse-ItemLost {
    param([string]$Line)
    if ($Line -match "(?i)Vous avez perdu (\d+)x (.+?) \.$") {
        return @{ qty=[int]$Matches[1]; item=$Matches[2].Trim() }
    }
    return $null
}

function Parse-ItemGained {
    param([string]$Line)
    # On évite \S+ pour ne pas avoir de problème d'accents — on capture le mot jusqu'à l'espace
    if ($Line -match "(?i)Vous avez ramass.+ (\d+)x (.+?) \.$") {
        return @{ qty=[int]$Matches[1]; item=$Matches[2].Trim() }
    }
    return $null
}

function Parse-DestructionBilan {
    param([string]$Line)
    if ($Line -match "(?i)Vous avez d.truit (\d+) objet.* et r.cup.r. (\d+) ressource") {
        return @{ objects=[int]$Matches[1]; resources=[int]$Matches[2] }
    }
    return $null
}

# ── Simulateur de fenêtre glissante ─────────────────────────────────────────
# Accumule perdu/ramassé, vide le buffer quand le bilan "détruit" arrive.
# Retourne TOUJOURS un tableau (même vide) grâce au @() dans l'appel.

function Simulate-DestructionWindow {
    param([string[]]$Lines)
    $events  = [System.Collections.Generic.List[hashtable]]::new()
    $lostBuf = [System.Collections.Generic.List[hashtable]]::new()
    $gainBuf = [System.Collections.Generic.List[hashtable]]::new()

    foreach ($line in $Lines) {
        $bilan = Parse-DestructionBilan -Line $line
        if ($null -ne $bilan) {
            $events.Add(@{
                type       = "destruction"
                objects    = $bilan.objects
                resources  = $bilan.resources
                lost_items = $lostBuf.ToArray()
                got_items  = $gainBuf.ToArray()
            })
            $lostBuf.Clear()
            $gainBuf.Clear()
            continue
        }
        $lost = Parse-ItemLost -Line $line
        if ($null -ne $lost) { $lostBuf.Add($lost); continue }

        $gained = Parse-ItemGained -Line $line
        if ($null -ne $gained) { $gainBuf.Add($gained); continue }
    }
    return ,$events.ToArray()   # virgule = force retour tableau même si 1 élément
}

# ── Moteur de test ───────────────────────────────────────────────────────────
Write-Host "=== Destruction d'objets ===" -ForegroundColor Cyan
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
        if ($Detail) { Write-Host "         $Detail" -ForegroundColor DarkRed }
    }
}

# ── Test 1 : Destruction simple, sans ressources (0 récupéré) ────────────────
$lines = @(
    "01:14:39,829 - [Information (jeu)] Vous avez perdu 5x Boufmarteau .",
    "01:14:39,829 - [Information (jeu)] Vous avez detruit 5 objets et recupere 0 ressource"
)
$evts = Simulate-DestructionWindow -Lines $lines
Assert "Destruction sans ressource (Boufmarteau -> 0)" `
    ($evts.Count -eq 1 -and $evts[0].objects -eq 5 -and $evts[0].resources -eq 0 `
     -and $evts[0].lost_items.Count -gt 0 -and $evts[0].lost_items[0].item -eq "Boufmarteau") `
    ("Count=$($evts.Count)" + $(if ($evts.Count -gt 0) {" item=$($evts[0].lost_items.Count)"} else {""}))

# ── Test 2 : Destruction avec récupération d'éclats ─────────────────────────
$lines = @(
    "01:14:27,126 - [Information (jeu)] Vous avez perdu 5x Previsiobottes .",
    "01:14:27,128 - [Information (jeu)] Vous avez ramasse 38x Eclats .",
    "01:14:27,129 - [Information (jeu)] Vous avez detruit 5 objets et recupere 38 ressources"
)
$evts = Simulate-DestructionWindow -Lines $lines
Assert "Destruction avec eclats (Previsiobottes -> 38 Eclats)" `
    ($evts.Count -eq 1 -and $evts[0].objects -eq 5 -and $evts[0].resources -eq 38 `
     -and $evts[0].lost_items[0].item -eq "Previsiobottes" `
     -and $evts[0].got_items[0].item -eq "Eclats") `
    ("Count=$($evts.Count)" + $(if ($evts.Count -gt 0) {" lost=$($evts[0].lost_items.Count) got=$($evts[0].got_items.Count)"} else {""}))

# ── Test 3 : Ordre inversé (ramassé avant perdu) ─────────────────────────────
$lines = @(
    "01:14:29,458 - [Information (jeu)] Vous avez ramasse 22x Eclats .",
    "01:14:29,460 - [Information (jeu)] Vous avez perdu 3x Patapourtour .",
    "01:14:29,460 - [Information (jeu)] Vous avez detruit 3 objets et recupere 22 ressources"
)
$evts = Simulate-DestructionWindow -Lines $lines
Assert "Destruction ordre inverse (ramasse avant perdu)" `
    ($evts.Count -eq 1 -and $evts[0].objects -eq 3 `
     -and $evts[0].lost_items[0].item -eq "Patapourtour" `
     -and $evts[0].got_items[0].item -eq "Eclats") `
    ("Count=$($evts.Count)")

# ── Test 4 : Plusieurs destructions à la suite ───────────────────────────────
$lines = @(
    "01:14:39,829 - [Information (jeu)] Vous avez perdu 5x Boufmarteau .",
    "01:14:39,829 - [Information (jeu)] Vous avez detruit 5 objets et recupere 0 ressource",
    "01:14:41,859 - [Information (jeu)] Vous avez perdu 1x Hache Piou .",
    "01:14:41,859 - [Information (jeu)] Vous avez detruit 1 objet et recupere 0 ressource"
)
$evts = Simulate-DestructionWindow -Lines $lines
Assert "Deux destructions consecutives -> 2 evenements distincts" `
    ($evts.Count -eq 2 -and $evts[0].lost_items[0].item -eq "Boufmarteau" `
     -and $evts[1].lost_items[0].item -eq "Hache Piou") `
    ("Count=$($evts.Count)")

# ── Test 5 : Destruction d'1 seul objet ──────────────────────────────────────
$lines = @(
    "01:15:05,137 - [Information (jeu)] Vous avez perdu 1x Armurétro .",
    "01:15:05,137 - [Information (jeu)] Vous avez ramasse 9x Eclats .",
    "01:15:05,138 - [Information (jeu)] Vous avez detruit 1 objet et recupere 9 ressources"
)
$evts = Simulate-DestructionWindow -Lines $lines
Assert "Destruction 1 objet -> 9 eclats" `
    ($evts.Count -eq 1 -and $evts[0].objects -eq 1 -and $evts[0].resources -eq 9) `
    ("Count=$($evts.Count)")

# ── Test 6 : Ligne sans rapport → 0 événements ───────────────────────────────
$lines = @(
    "01:13:31,909 - [Information (jeu)] Vous avez gagne 5 kamas.",
    "01:13:57,910 - [Communaute (FR)] Prune : Ah pcq on peuit avoir des dofus dans ce jeu"
)
$evts = Simulate-DestructionWindow -Lines $lines
Assert "Lignes non-destruction -> aucun evenement" ($evts.Count -eq 0) ("Count=$($evts.Count)")

# ── Test 7 : Parse-ItemLost quantité > 1 ──────────────────────────────────────
$r = Parse-ItemLost "01:14:33,102 - [Information (jeu)] Vous avez perdu 6x Epee Poutreuse ."
Assert "Parse-ItemLost : 6x Epee Poutreuse" ($null -ne $r -and $r.qty -eq 6 -and $r.item -eq "Epee Poutreuse")

# ── Test 8 : Parse-DestructionBilan singulier vs pluriel ─────────────────────
$r1 = Parse-DestructionBilan "01:14:41,859 - [Information (jeu)] Vous avez detruit 1 objet et recupere 0 ressource"
$r2 = Parse-DestructionBilan "01:14:27,129 - [Information (jeu)] Vous avez detruit 5 objets et recupere 38 ressources"
Assert "Parse-DestructionBilan : singulier (1 objet / 0 ressource)" ($null -ne $r1 -and $r1.objects -eq 1 -and $r1.resources -eq 0)
Assert "Parse-DestructionBilan : pluriel (5 objets / 38 ressources)" ($null -ne $r2 -and $r2.objects -eq 5 -and $r2.resources -eq 38)

$color = if ($fail -eq 0) { "Green" } else { "Red" }
Write-Host ("  {0}/{1} tests passes" -f $pass, $i) -ForegroundColor $color
