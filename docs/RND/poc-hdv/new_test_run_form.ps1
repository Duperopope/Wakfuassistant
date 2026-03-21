param(
    [string]$Goal = "Run de validation",
    [string]$Server = "",
    [string]$Character = "",
    [int]$KeepRecentRunDirs = 10
)

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

$repoRoot = Resolve-Path (Join-Path $PSScriptRoot "..\..\..")
$formsDir = Join-Path $repoRoot "docs\RND\forms"
$logsDir = Join-Path $repoRoot "logs"
$runArchiveRoot = Join-Path $logsDir "runs"

$activeFormPath = Join-Path $formsDir "ACTIVE_TEST_RUN_FORM.md"
$activeTodoPath = Join-Path $formsDir "ACTIVE_TODOLIST.md"
$activeMissionContextPath = Join-Path $formsDir "ACTIVE_MISSION_CONTEXT.md"
$formTemplatePath = Join-Path $formsDir "TEST_RUN_FORM_TEMPLATE.md"
$missionContextTemplatePath = Join-Path $formsDir "MISSION_CONTEXT_TEMPLATE.md"

if (-not (Test-Path -LiteralPath $formsDir)) { New-Item -ItemType Directory -Path $formsDir | Out-Null }
if (-not (Test-Path -LiteralPath $runArchiveRoot)) { New-Item -ItemType Directory -Path $runArchiveRoot | Out-Null }

$stamp = Get-Date -Format "yyyyMMdd_HHmmss"
$runId = "RUN_$stamp"
$runDir = Join-Path $runArchiveRoot $runId
New-Item -ItemType Directory -Path $runDir | Out-Null

# Archive active form/todo if present
if (Test-Path -LiteralPath $activeFormPath) {
    Move-Item -LiteralPath $activeFormPath -Destination (Join-Path $runDir "ACTIVE_TEST_RUN_FORM.md")
}
if (Test-Path -LiteralPath $activeTodoPath) {
    Move-Item -LiteralPath $activeTodoPath -Destination (Join-Path $runDir "ACTIVE_TODOLIST.md")
}
if (Test-Path -LiteralPath $activeMissionContextPath) {
    Move-Item -LiteralPath $activeMissionContextPath -Destination (Join-Path $runDir "ACTIVE_MISSION_CONTEXT.md")
}

# Quarantine selected transient artifacts (non-destructive)
$transientFiles = @(
    "market_latest_preview.csv",
    "market_latest_preview.md",
    "market_latest_named_preview.csv",
    "top10_buy_over_sell.csv",
    "top10_buy_over_sell_resources.csv",
    "top10_buy_over_sell_resources_v2.csv"
)

$quarantineDir = Join-Path $runDir "artifacts"
New-Item -ItemType Directory -Path $quarantineDir | Out-Null

foreach ($name in $transientFiles) {
    $src = Join-Path $logsDir $name
    if (Test-Path -LiteralPath $src) {
        Move-Item -LiteralPath $src -Destination (Join-Path $quarantineDir $name)
    }
}

# Build fresh active form from template (or fallback content)
$dateIso = Get-Date -Format "yyyy-MM-dd"
if (Test-Path -LiteralPath $formTemplatePath) {
    $content = Get-Content -LiteralPath $formTemplatePath -Raw
    $content = $content.Replace("RUN_<YYYYMMDD_HHMM>", $runId)
    $content = $content.Replace("- Date:", "- Date: $dateIso")
    $content = $content.Replace("- Objectif:", "- Objectif: $Goal")
    $content = $content.Replace("- Serveur:", "- Serveur: $Server")
    $content = $content.Replace("- Personnage:", "- Personnage: $Character")
    $content | Out-File -FilePath $activeFormPath -Encoding UTF8
} else {
    @"
# TEST RUN FORM (Active)

## 1. Identite du run

- Run ID: $runId
- Date: $dateIso
- Objectif: $Goal
- Serveur: $Server
- Personnage: $Character
"@ | Out-File -FilePath $activeFormPath -Encoding UTF8
}

# Build fresh active todo
@"
# ACTIVE TODO LIST

Date: $dateIso
Run ID: $runId

## TODO

| ID | Action | Statut | Preuve attendue | Risque | Evidence |
|----|--------|--------|-----------------|--------|----------|
| 1 | Verifier preconditions | not-started | Checklist preconditions remplie | Moyen | |
| 2 | Executer protocole test | not-started | Etapes cochees + verdict | Moyen | |
| 3 | Generer rapport run | not-started | Rapport final cree | Moyen | |
| 4 | Consolider retours | not-started | Section retours completee | Faible | |
"@ | Out-File -FilePath $activeTodoPath -Encoding UTF8

# Build fresh active mission context from template (or fallback)
$missionId = "MISSION_$stamp"
if (Test-Path -LiteralPath $missionContextTemplatePath) {
    $ctx = Get-Content -LiteralPath $missionContextTemplatePath -Raw
    $ctx = $ctx.Replace("MISSION_<YYYYMMDD_HHMM>", $missionId)
    $ctx = $ctx.Replace("<DATE_ISO>", $dateIso)
    $ctx = $ctx.Replace("<GOAL>", $Goal)
    $ctx = $ctx.Replace("<SERVER>", $Server)
    $ctx = $ctx.Replace("<CHARACTER>", $Character)
    $ctx | Out-File -FilePath $activeMissionContextPath -Encoding UTF8
} else {
    @"
# MISSION CONTEXT (Single-file handoff for Claude Code)

Ce document est la source unique que l'operateur donne au LLM.
Le LLM doit pouvoir demarrer, executer et conclure la mission avec ce seul fichier.

## 1. Meta mission

- Mission ID: $missionId
- Date de lancement: $dateIso
- Auteur contexte (developpeur): testeur expert gameplay (14 ans), non codeur
- LLM operateur: Claude Code (VS Code)
- Mode initial: Compact

## 2. Regle de demarrage (obligatoire)

1. Lire ce fichier en entier avant toute action.
2. Reformuler l'objectif en une phrase.
3. Lister les 3 prochaines actions maximum.
4. Demander confirmation utilisateur avant toute action irreversible.

## 3. Objectif principal

Mission de ce run: $Goal.

Livrables minimum:

1. sortie lisible decision-ready,
2. verdict confirme/infirme/inconclusif avec preuves,
3. prochaine action concrete.

## 4. Profil utilisateur a prendre en compte

1. Excellente maitrise du jeu.
2. Non codeur.
3. Capable de suivre des instructions precises et de donner des retours qualites.

Implication pour le LLM:

1. poser des questions courtes et exactes,
2. une action a la fois,
3. eviter le jargon technique non necessaire.

## 5. Perimetre

Inclus:

1. capture HDV,
2. sync SQLite,
3. export lisible,
4. analyses opportunites,
5. verification terrain,
6. mise a jour doc/protocole.

Exclus sauf demande explicite:

1. refonte large,
2. operations destructives,
3. hypotheses sans evidence.

## 6. Sources de verite autorisees

1. HDV marche: logs/market_v3_proto.log et logs/hdv_market.db
2. Tables canoniques: market_observations, market_latest
3. Exports lisibles: artefacts derives generes a la demande, puis archives dans logs/runs/<RUN_ID>/artifacts/
4. Gameplay/session: wakfu.log, wakfu_chat.log
5. Metadonnees objets: cache local + CDN Ankama
6. Contexte operateur: serveur $Server, personnage $Character

## 7. Invariants non negociables

1. Ne jamais confondre item_ref_id et offer_uid.
2. Aucune conclusion sans evidence.
3. Aucune commande destructive globale.
4. Toute regression potentielle doit etre testee.
5. En cas de doute: statut inconclusif + test suivant propose.

## 8. Politique anti-regression (Never Break)

1. Pre-change: capturer baseline.
2. Change: modification minimale.
3. Post-change: verification immediate.
4. Validation utilisateur: protocole pas-a-pas.
5. Publication: preuves + doc a jour.

## 9. Politique modele (cout vs difficulte)

1. Commencer en mode compact.
2. Si 2 iterations consecutives ratees: proposer switch vers modele plus puissant.
3. Si 3 iterations consecutives ratees: recommander fortement switch avant nouvelle tentative.
4. Tout switch doit etre confirme par l'utilisateur.
5. Une fois debloque: revenir au mode moins couteux.

## 10. Questions obligatoires que le LLM doit poser

Ordre impose:

1. Quel est l'objectif unique de ce run en une phrase ?
2. Quel livrable exact veux-tu a la fin ?
3. Quelle action precise fais-tu maintenant en jeu ?
4. As-tu fini cette action ? (oui/non)
5. Quel resultat observes-tu exactement ?
6. Confirme-tu que je passe a l'etape suivante ? (oui/non)

## 11. Format de sortie du LLM (court et strict)

1. Action faite
2. Resultat
3. Preuve
4. Prochaine etape

## 12. Criteres de succes

1. Resultat testable et confirme en jeu.
2. Resultat traceable et reproductible.
3. Pas de regression critique.

## 13. Criteres d'echec

1. Conclusion sans preuve.
2. Sortie non testable en jeu.
3. Regression non detectee.

## 14. Journal de decisions

| Horodatage | Decision | Motif | Impact |
|-----------|----------|-------|--------|
| | | | |

## 15. Retours testeur (fin de run)

- Ce qui a bien fonctionne:
- Ce qui a bloque:
- Question la plus utile posee par le LLM:
- Question inutile ou floue a supprimer:
- Amelioration pour le prochain run:
"@ | Out-File -FilePath $activeMissionContextPath -Encoding UTF8
}

# Retention: keep only N recent run directories
$runDirs = Get-ChildItem -LiteralPath $runArchiveRoot -Directory | Sort-Object Name -Descending
$oldDirs = $runDirs | Select-Object -Skip $KeepRecentRunDirs
foreach ($d in $oldDirs) {
    $archiveGraveyard = Join-Path $runArchiveRoot "_older"
    if (-not (Test-Path -LiteralPath $archiveGraveyard)) { New-Item -ItemType Directory -Path $archiveGraveyard | Out-Null }
    Move-Item -LiteralPath $d.FullName -Destination (Join-Path $archiveGraveyard $d.Name)
}

Write-Host "Nouveau run initialise: $runId" -ForegroundColor Green
Write-Host "Formulaire actif: $activeFormPath" -ForegroundColor Cyan
Write-Host "TODO actif: $activeTodoPath" -ForegroundColor Cyan
Write-Host "Contexte mission actif: $activeMissionContextPath" -ForegroundColor Cyan
Write-Host "Archive run: $runDir" -ForegroundColor Cyan