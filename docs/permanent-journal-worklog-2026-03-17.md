# Wakfu Assistant — Journal Permanent : Worklog (2026-03-17)

## Contexte

Ce document retrace la refonte complète du pipeline d'événements kamas, depuis la détection d'un bug de double-comptage jusqu'à la mise en place d'une source de vérité unique consolidée.

---

## Session 1 — Diagnostic du double-comptage kamas

### Problème signalé

Les transactions après 02:06:33 étaient comptées en double, produisant un écart de +584 kamas entre l'affichage de l'app (596 700) et l'inventaire réel (596 116).

### Root cause

L'ancien système utilisait deux journaux en parallèle :
- `kamas_events.jsonl` — capture temps-réel
- Un scan incrémental des logs AppData

La position de lecture (`perm_log_offset`) n'était pas correctement sauvegardée après chaque sync, ce qui faisait relire les dernières lignes à chaque tick.

### Fix immédiat

Introduction d'un fingerprint de déduplication par événement :

```python
def _make_fingerprint(event_type, data, client_clock) -> str:
    return f"{client_clock}|{event_type}|{data['amount']}"
```

Les fingerprints sont stockés dans `recorder_state.json` et vérifiés avant chaque écriture.

---

## Session 2 — Décision d'unification : source unique `all_events.jsonl`

### Problème fondamental identifié

Avoir deux journaux (`kamas_events.jsonl` + scan AppData) était intrinsèquement fragile : toute divergence entre les deux causait des doublons ou des omissions. Le feedback utilisateur a été clair :

> "C'est pas viable d'avoir 2 systèmes de journaux du coup il aurait fallu TOUT mettre sur le nouveau journal quitte à débug."

### Architecture retenue

**Source unique :**
- `logs/permanent/all_events.jsonl` — structuré JSONL, toutes les captures
- `logs/permanent/all_events.log` — companion lisible (même données, format humain)
- `logs/permanent/recorder_state.json` — état du lecteur (positions, fingerprints, version)

**Versionning :** `_JOURNAL_VERSION` dans le code — incrémenter pour forcer un rebuild complet au prochain démarrage.

**Migration automatique :** au premier démarrage avec la nouvelle version, `rebuild_all_events()` absorbe :
1. `kamas_events.jsonl` (via `_migrate_kamas_events()` — timestamps exacts via `resolved_client_local`)
2. `chat_events.log`, `journal_events.log` (via `_migrate_legacy_log_file()` — date système + heure client)
3. Archives, realtime, racine (via `_absorb_external_sources()`)
4. Scan complet AppData depuis position 0

### Extension du scope : tous les événements du jeu

Sur demande, le parsing a été étendu à l'ensemble des événements utiles pour analytics communautaires :

| Type | Pattern | Usage |
|---|---|---|
| `kamas_gain` / `kamas_loss` | `[Information (jeu)] Vous avez gagné/perdu N kamas` | Balance kamas |
| `market_sold` | `Vous avez vendu N objets pour Y § pendant votre absence` | Retours marché |
| `market_sold_item` | `Vous avez vendu [item] contre Y kamas` | Ventes directes |
| `quest_complete` / `quest_fail` | `Quête accomplie/échouée : ...` | Progression |
| `login` / `logout` | `Vous êtes maintenant connecté / déconnecté` | Sessions |
| `death` | `[Information (combat)] ... est mort` | Mortalité |
| `chat` | `[Canal] Pseudo : message` (canaux whitelistés) | Analytics joueurs |
| `xp_combat` / `xp_profession` | `+N points d'XP. Prochain niveau dans :` | XP tracking |
| `level_up` | `gagne un niveau ... niveau N` | Niveaux |
| `whois` | `Le joueur X (compte) est connecté sur le serveur Y` | Identification |
| `breed` | `[_FL_] ... breed : N` | Classe (ID race) |
| `location` | `Vous vous trouvez en (x, y, z) de l'instance N` | Cartographie |

Les canaux de chat reconnus (`_CHAT_CHANNELS`) sont whitelistés pour éviter les faux positifs :
`guilde`, `alliance`, `commerce`, `recrutement`, `général`, `zone`, `équipe`, etc.

### Absorption et nettoyage des archives

`_absorb_external_sources()` absorbe puis **supprime** automatiquement :
- `logs/archives/auto/wakfu_logs_*/` (dossiers d'archives)
- `logs/archives/auto/*.zip` (archives compressées)
- `logs/archives/*.zip` (archives manuelles)
- `logs/realtime/wakfu_chat.log*`, `wakfu.log*`, `wakfu_journal.log*`
- `logs/realtime/wakfu_*.log*` (tous les autres logs Wakfu : animation, camera, lua, etc.)
- `logs/wakfu_chat.log`, `logs/wakfu_journal.log` (racine projet)

L'extraction ZIP se fait via `zipfile.ZipFile` + `tempfile.TemporaryDirectory` (mémoire uniquement, pas de résidus disque).

---

## Session 3 — Bug kamas : contamination multi-personnages

### Problème signalé

Après le premier rebuild complet, le solde kamas affiché est passé à **1 166 951** au lieu de la valeur réelle **598 081**.

### Diagnostic

Le rebuild lit les fichiers AppData depuis la **position 0**. Ces fichiers couvrent **tous les personnages** joués depuis le compte, pas seulement le personnage suivi. Le `base_kamas = 577 306` est calibré pour un personnage unique.

**Deux sources de contamination identifiées :**

**1. Événements d'autres personnages**

Les fichiers rotatifs (`wakfu_chat.log.1`, `.log.2`) contiennent des sessions de personnages différents. Exemple :
- Un personnage marchand avait une vente en attente de 384 091 kamas
- Son event `Vous avez gagné 384 091 kamas` était dans le même fichier log

**2. Dates mal reconstruites pour les fichiers rotatifs**

`wakfu_chat.log.1` (date réelle : 12-13 mars) recevait une date basée sur son `mtime` (16 mars). Ces events mal datés apparaissaient donc **après** `last_session_end`, donc inclus dans le delta kamas.

**Le log peut confirmer :**
```
# Réel (fichier rotatif, autre perso, 12 mars mais daté 16 mars) :
2026-03-16 15:58:03  +5 047  [wakfu.log.2]   ← faux
2026-03-16 21:17:07  +10 330 [wakfu.log.2]   ← faux

# Attendu (vrai delta = +20 775 = 598 081 - 577 306)
```

### Fix — `skip_kamas` ciblé sur les fichiers rotatifs

**Règle :** dans `rebuild_all_events()` step 4 (scan AppData full depuis pos 0), ignorer les `kamas_gain`/`kamas_loss` provenant de fichiers rotatifs (`.log.N`) :

```python
if event_type in _KAMAS_TYPES and re.search(r'\.\d+$', source.name):
    continue
```

Les fichiers principaux (`wakfu_chat.log`, `wakfu.log`) sont la session en cours — leur kamas est fiable.

`_parse_raw_source()` reçoit un paramètre `skip_kamas=True` quand appelé depuis `_absorb_external_sources()` (archives = historique multi-perso, idem).

**Les kamas proviennent de trois sources propres uniquement :**
1. `kamas_events.jsonl` / `.absorbed` → `_migrate_kamas_events()` (capture temps-réel, single-character)
2. Fichiers primaires du scan AppData full (session courante)
3. Sync incrémental `sync_permanent_journal()` (session active en cours)

---

## Session 4 — Bug rebuild : kamas_events.absorbed ignoré après premier rebuild

### Problème

Après le premier rebuild (version 2→3), `kamas_events.jsonl` était renommé en `kamas_events.absorbed` par `_cleanup_legacy_files()`. Mais `_migrate_kamas_events()` cherchait uniquement `kamas_events.jsonl` — le fichier `.absorbed` était donc **invisible** lors de tous les rebuilds suivants. Résultat : 0 événements kamas historiques dans le journal.

### Fix

```python
absorbed = _LEGACY_KAMAS_JSONL.with_suffix(".absorbed")
if absorbed.exists() and absorbed not in sources:
    sources.append(absorbed)
```

---

## Session 5 — Bug rebuild : gap d'events entre kamas_events.absorbed et rebuild

### Problème

Après le rebuild version 4 (avec `skip_kamas` global), le journal s'arrêtait à 02:39:10 (dernier event de `kamas_events.absorbed`). Les events entre 02:39 et l'heure du rebuild (~04:50) — dont des transactions réelles confirmées par l'utilisateur (+2 369 à 03:16, +100 à 04:11, -25 à 04:14) — étaient perdus :

- Le rebuild lisait `wakfu_chat.log` depuis pos 0 mais skippait tous les kamas → gap non capturé
- Les positions étaient ensuite sauvegardées à la fin du fichier (size=525048)
- Le sync incrémental suivant ne voyait donc **rien de nouveau** à partir de ces positions

### Fix — `skip_kamas` ciblé (fichiers rotatifs uniquement)

Remplacement du skip global par un skip ciblé :

```python
# Avant (trop large — skippait même les events du fichier courant)
if event_type in _KAMAS_TYPES:
    continue

# Après (ciblé — skip uniquement les fichiers rotatifs .log.N)
if event_type in _KAMAS_TYPES and re.search(r'\.\d+$', source.name):
    continue
```

Le dedup par fingerprint (issu de `kamas_events.absorbed`) empêche les doublons avec les events déjà migrés. Les events dans le gap (02:39→rebuild) ont des fingerprints nouveaux → correctement capturés.

### Résultat final

```
base_kamas:  577 306  (calibration 2026-03-16 15:20:02)
delta:       +20 775
total:       598 081  ✓  (correspond exactement à l'inventaire réel à 04:49)
```

---

## Versionning du journal

| Version | Changement |
|---|---|
| 1 | Système initial dual-journal (abandonné) |
| 2 | Consolidation `all_events.jsonl` — rebuild depuis toutes sources |
| 3 | Nettoyage `logs/realtime/wakfu_*.log*` non-parseable |
| 4 | `skip_kamas` global dans scan AppData full (trop large — kamas gap créé) |
| 5 | `skip_kamas` ciblé fichiers rotatifs + fix `kamas_events.absorbed` |

---

## Fichiers modifiés

| Fichier | Nature |
|---|---|
| `core/permanent_journal.py` | Refonte complète — source unique, migration, absorption, skip_kamas ciblé |
| `core/kamas_history.py` | Wrapper `replay_kamas_delta` → `replay_permanent_delta` |

## Règles à retenir pour les futures modifications

1. **Ne jamais lire les kamas depuis les fichiers rotatifs (`.log.N`)** — multi-perso, dates fausses.
2. **`kamas_events.absorbed` doit toujours être inclus dans `_migrate_kamas_events()`** — c'est la source de vérité historique post-migration.
3. **`skip_kamas=True` dans `_absorb_external_sources()`** — les archives couvrent toutes les sessions de tous les personnages.
4. **Incrémenter `_JOURNAL_VERSION` à chaque changement du format ou de la logique d'ingestion** — déclenche rebuild automatique au prochain démarrage.
5. **Le sync incrémental (`sync_permanent_journal()`) ne filtre PAS les kamas** — il est appelé en session active (un seul personnage actif à la fois), sa capture est fiable.
