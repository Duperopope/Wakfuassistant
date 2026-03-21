# Journal POC — 2026-03-20

## Addendum 2026-03-21 - Etat actuel du POC

Evolution majeure depuis cette session:
- Le pipeline HDV cible est stabilise autour de `market_v3_proto.log` + decode protobuf + persistance SQLite.
- Base persistante validee: `logs/hdv_market.db`.
- Exports lisibles en clair valides: `logs/market_latest_preview.csv`, `logs/market_latest_preview.md`, `logs/market_latest_named_preview.csv`.

Observations confirmees:
- Ingestion dedoublonnee operationnelle (historique + latest).
- Separation achats/ventes fiable via `msgId`.
- Mapping objet: `item_ref_id`; identifiant offre: `offer_uid`.

Observations infirmees ou depassees:
- Les workflows uniquement textuels/chat pour econometrie fine HDV sont depasses par le decode protobuf structure.

Reproduction rapide (etat 2026-03-21):
1. Capture en jeu via `docs/RND/poc-hdv/agent/launch_hdv_v2.bat`
2. Sync DB via `docs/RND/poc-hdv/sync_hdv_to_sqlite.ps1`
3. Export lisible via `docs/RND/poc-hdv/export_hdv_readable.ps1 -ResolveItemNames`
4. Filtre ressources uniquement via `docs/RND/poc-hdv/top_buy_over_sell_resources.ps1`

*Session de développement et validation du pipeline de détection temps réel.*
*Heure approximative : 00h12 → ~02h30*

---

## Contexte de départ

Les journaux d'écoute 1-3 avaient constitué la base théorique (Grand 1).
Ce journal documente la **mise en pratique** : construction d'un pipeline de détection
live fonctionnel, testé sur de vrais logs en session active.

---

## Ce qui a été construit

### Pipeline `poc-database/` (v1 — existait avant)
Validé et étendu en début de session :
- `collect-wakfu-logs.ps1` : collecte incrémentale avec FileSystemWatcher
- `schema-permanent.sql` : tables `raw_log_lines`, `parsed_events`, `ingest_state`
- `query-permanent.ps1` : vérification volumétrie et taux de reconnaissance

**Résultats de la validation :**
- 9 308 lignes brutes ingérées (5 457 de `wakfu.log` + 3 851 de `wakfu_chat.log`)
- 9 308 parsed_events (1 par ligne, même non-reconnues)
- Taux de reconnaissance global : **1,53 %** — normal (98 % = bruit système)
- Events reconnus : `xp_gained` (80), `quest_failed` (34), `kamas_gained` (24), `quest_succeeded` (4)

### Live monitor v1 → v3 (`poc-conceptscripts/live-monitor.ps1`)

Construit de zéro, itérations successives dans la session :

**v1 (initial)** — polling `wakfu_chat.log`, affichage coloré, pas de DB.
Problèmes identifiés :
- Lignes XP comptées en double (même event dans `wakfu.log` ET `wakfu_chat.log`)
- XP personnage et XP métier non distinguées
- Pas de persistance
- Bug PowerShell : `$Matches` écrasé par le second `-match` dans la fonction `Parse-XpLine`

**v2** — corrections + enrichissements :
- Fix double-count : `wakfu.log` exclu du polling (gardé uniquement pour les zones)
- Séparation `xp_character` (`[Information (combat)]`) vs `xp_job` (`[Information (jeu)]`)
- Détection automatique du personnage depuis `accountPreferences*.properties`
- Prompt startup : niveau, XP dans le niveau, kamas
- Calcul ETA depuis `Prochain niveau dans : X` (déjà dans les logs, pas besoin de le demander)
- Courbe XP par niveau : total calculé dès qu'on a `xpInLevel + remaining`
- Détection challenges : `Le challenge "X" est réussi/a échoué`
- Heure de connexion depuis premier timestamp de `wakfu.log`
- Heure en jeu depuis premier `[Information (jeu/combat)]` de `wakfu.log`

**v3 (final)** — zones + DB :
- Dual-source : `wakfu_chat.log` (events jeu) + `wakfu.log` (zones, positions)
- Détection zones : `on quitte le monde {N}` → lookup DB → demande nom si inconnu
- Position carte : `bZJ initialisé, centré sur (X,Y)` liée aux visites
- Détection clan master potentiel : `[Proximité]` capturé et stocké
- SQLite complet : `monitor_session.db` avec 9 tables
- Persistance inter-sessions : niveaux métiers + noms de zones jamais redemandés
- Session enregistrée en DB au démarrage

---

## Découvertes techniques

### `[Information (combat)]` vs `[Information (jeu)]`

Le discriminant pour séparer XP personnage et XP métier :
```
[Information (combat)] L'Immortel : +13 114 689 points d'XP.  Prochain niveau dans : 1 365 544 387.
[Information (jeu)] Trappeur : +221 points d'XP.  Prochain niveau dans : 2 959.
```
- `(combat)` = XP de personnage, `(jeu)` = XP de métier
- Le nom de l'entité (perso ou métier) est dans la même position regex dans les deux cas
- Level-up détectable par ` +1 niveau.` dans la ligne (entre XP et "Prochain niveau dans")

### `Prochain niveau dans : X` — valeur clé

**Présent dans les logs.** Inutile de demander l'XP restante au joueur.
Formule courbe XP : `total_niveau = xpInLevel_startup + xpGained_premier_event + remaining_premier_event`
Une seule question au startup suffit pour calibrer le niveau courant.

### Double-count XP

`wakfu.log` et `wakfu_chat.log` contiennent **les mêmes** lignes `[Information (jeu/combat)]`.
Solution : surveiller uniquement `wakfu_chat.log` pour les events jeu.
`wakfu.log` est gardé **en lecture séparée** uniquement pour :
- Les changements de zone (`on quitte le monde`)
- Les positions (`bZJ initialisé`)
- Les marqueurs de connexion (premier timestamp, premier event jeu)

### Bug PowerShell `$Matches`

```powershell
# ❌ FAUX — $Matches écrasé par le second -match
if ($Line -match $pat) {
    return @{
        type   = if ($Line -match "\[Information \(jeu\)\]") { "xp_job" } else { "xp_character" }
        entity = $Matches[1]  # ← NULL car $Matches vient du second -match
    }
}

# ✅ CORRECT — sauvegarder avant tout autre test
if ($Line -match $pat) {
    $entity = $Matches[1].Trim()   # ← sauvegarder immédiatement
    $xp     = Normalize-Int $Matches[2]
    $type   = if ($Line -match "\[Information \(jeu\)\]") { "xp_job" } else { "xp_character" }
    return @{ type=$type; entity=$entity; ... }
}
```

### Détection automatique du personnage

```
%APPDATA%\zaap\gamesLogs\wakfu\preferences\accountPreferences{ID}.properties
→ lastSelectedCharacterName=L'Immortel
```
Fiabilité : haute. Mis à jour à chaque session. Permet de pré-remplir le nom
sans saisie manuelle.

### Détection heure de connexion

- **Lancement client** = premier timestamp de `wakfu.log` (le fichier est réinitialisé à chaque lancement)
- **Entrée en jeu** = premier `[Information (jeu)]` ou `[Information (combat)]` dans `wakfu.log`
- Aucun marqueur `on remet la frame world` ou `Received FriendListMessage` n'était présent
  dans la session du 2026-03-20 (log court de 207 lignes, milieu de session)

### Changements de zone

Pattern confirmé sur session réelle :
```
INFO 00:50:38,802 - on quitte le monde 1252
INFO 00:50:38,860 - bZJ initialisé, centré sur (0,0)
INFO 00:50:42,452 - on quitte le monde 1089
INFO 00:50:46,274 - on quitte le monde 436
INFO 00:50:46,292 - bZJ initialisé, centré sur (6,-6)
...
INFO 00:51:06,543 - on quitte le monde 1089
INFO 00:51:06,563 - Update de chaos du protecteur 348, chaos = false
INFO 00:51:06,563 - Update de la satisfaction du protecteur 348. Nouvelle satisfaction : 3
```

Séquence observée (probablement : zone inconnue → biblio-téléport → traversée zone → Sufokia) :
`1252 → 1089 → 436 → 437 → 440 → 437 → 436 → 1089 → [Sufokia 1135]`

**Protecteurs 348/349/354** = identifiants Sufokia (confirmé par corrélation avec
`Update de la satisfaction du protecteur` à l'arrivée dans la zone).

Nouveaux worldIds à identifier : **436, 437, 440, 1252**.

### Clan master — non loggué directement

Aucun pattern direct de "maître de clan" dans les logs.
Stratégie retenue : capturer les messages `[Proximité]` et les stocker
avec le worldId courant. Le premier message [Proximité] après un changement
de zone est le clan master NPC avec haute probabilité.
**À confirmer lors d'une prochaine session.**

### Challenges

Pattern confirmé dans `wakfu_chat.log` :
```
[Information (jeu)] Le challenge "Nomade" est réussi.
[Information (jeu)] Le challenge "Déclin" a échoué.
```
Présents uniquement dans le chat log (pas de log séparé challenge XP).
L'XP des challenges est incluse dans la ligne XP de combat suivante — impossible
de l'isoler.

---

## Worldids mapping — état au 2026-03-20

| worldId | Nom | Statut |
|---|---|---|
| 9 | Havre-sac personnel | ✅ Confirmé (PERSONAL_SPACE) |
| 527 | Zone farm (herborisme) | ⚠️ Non nommé précisément |
| 862 | Combat Capt'chat (antibot) | ✅ Confirmé |
| 1089 | Bibliothèque de téléportation | ✅ Confirmé |
| 1135 | Sufokia | ✅ Confirmé (protecteurs 348/349/354) |
| 1136 | HDV Sufokia | ✅ Confirmé (bAL id=31546/31547) |
| 436 | **Inconnu** | Observé session 2026-03-20 |
| 437 | **Inconnu** | Observé session 2026-03-20 |
| 440 | **Inconnu** | Observé session 2026-03-20 |
| 1252 | **Inconnu** | Zone de départ session 2026-03-20 |

---

## Résultats des tests

Tous les parseurs validés via scripts de test unitaires PowerShell :

| Cas | Résultat |
|---|---|
| XP perso `[Information (combat)]` | ✅ Correct |
| XP métier `[Information (jeu)]` avec level-up | ✅ Correct |
| Filtre autre joueur en groupe | ✅ Correct |
| XP autre joueur ignorée | ✅ Correct |
| Challenge réussi / raté (accents) | ✅ Correct |
| Zone `on quitte le monde N` | ✅ Correct |
| Position `bZJ centré sur (X,Y)` | ✅ Correct |
| `[Proximité]` clan master | ✅ Correct |
| Session start depuis `wakfu.log` | ✅ `00:33:49` |
| In-game since depuis `wakfu.log` | ✅ `00:37:25` |

---

## Fichiers produits

```
docs/RND/poc-conceptscripts/
├── live-monitor.ps1      Moniteur temps réel v3 (zones + DB + clan master)
├── collect-logs.ps1      Collecte incrémentale logs → DB (depuis poc-database)
├── query-db.ps1          Requêtes sur DB permanente (depuis poc-database)
├── xp-estimator.ps1      Estimateur ETA standalone (depuis poc-database)
├── schema-session.sql    Schéma DB session (9 tables, données séance + courbe XP)
├── schema-logs.sql       Schéma DB logs permanents (depuis poc-database)
└── README.md             Ce document de référence

docs/RND/poc-database/    (conservé comme référence v1)
├── live-monitor.ps1      Version précédente (sans zones ni DB)
└── ...
```

---

## À faire — prochaine session

### Identification zones
- [ ] Nommer les worldIds 436, 437, 440, 1252 (activer le monitor pendant le jeu)
- [ ] Vérifier si `on quitte le monde X` = "je suis en X et je pars" (confirmé) ou "j'arrive en X"
- [ ] Collecter suffisamment de changements de zone pour établir la topologie de navigation

### Clan master
- [ ] Vérifier si le clan master NPC parle systématiquement en [Proximité] à l'arrivée dans une zone
- [ ] Collecter les noms des clan masters par zone pour construire une liste de référence
- [ ] Vérifier s'il y a un pattern distinct clan master vs joueur dans [Proximité]

### XP courbe
- [ ] Passer un level-up de personnage en gardant le monitor actif → valider l'enregistrement dans `xp_curve`
- [ ] Passer un level-up de métier → valider la persistance dans `job_levels`
- [ ] Vérifier la formule `total = xpInLevel + xpGained + remaining` sur un vrai niveau complet

### DB session
- [ ] Exécuter une vraie session complète et requêter `monitor_session.db` pour valider la qualité des données
- [ ] Écrire `query-session.ps1` pour exploiter les données de `monitor_session.db`

### Patterns non encore confirmés (depuis TODO_prochaine_session.md)
- [ ] Board IDs HDV Bonta, Brakmar, Astrub, Kelba, Srambad
- [ ] Ouverture havre sac échouée (zone interdite)
- [ ] Ports 26116/26117 (launcher API locale)

---

## Session 2 — Continuation (02h30 → ~05h00)

*Même journée, après la pause. Focus : validation terrain des parseurs + outil courbe XP.*

---

### Contexte

Les parseurs créés en session 1 étaient validés sur données inventées. L'objectif de cette session : les confronter à de vraies lignes de log en jeu actif, identifier les erreurs, et construire un outil de suivi de courbe XP.

---

### Ce qui a été construit

#### Protocole de tests terrain (`poc-conceptscripts/tests/`)

- `GUIDE_TEST_TERRAIN.md` : 9 scénarios avec action jeu + commande PowerShell + réponse attendue + questions
- Lanceur `run-all.ps1` + 6 scripts `test-*.ps1` (XP, destruction, HDV, havre-sac, zones, challenges)

#### Script `xp-curve.ps1`

Outil standalone de suivi de courbe XP en temps réel :
- Auto-détection du personnage depuis le titre de fenêtre Windows ("NomPerso - WAKFU")
- Saisie unique : niveau actuel + XP total du niveau + XP déjà accumulée
- Scan historique des logs (`.log.2` → `.log.1` → `.log`) avec datation précise depuis ancres de date
- Calcul ETA basé sur les N derniers combats observés
- Tableau niveau/date/durée/XP/ratio mis à jour en temps réel
- Formule carryover pour XP exacte sans redemander à chaque level-up
- Intégration CSV `courbexp230.csv` : niveaux ≤190 = `[CSV]` direct, 191–230 = `[?]` avec confirmation, >230 = saisie déclenchée au passage de niveau

---

### Erreurs découvertes et corrigées

#### ❌ Discrimination XP personnage vs métier — hypothèse fausse

**Hypothèse initiale (session 1) :** `[Information (combat)]` = XP personnage, `[Information (jeu)]` = XP métier.

**Réfutation (session 2) :** En combat, le Trappeur dont les pièges déclenchent des dégâts génère une ligne XP avec `[Information (combat)]`, pas `[Information (jeu)]`. La source tag ne discrimine pas.

**Correction :** Le discriminant est le **nom de l'entité**. Si entity = nom du personnage actif → `xp_character`. Sinon → `xp_job`. Correction appliquée dans `live-monitor.ps1`, `test-xp.ps1`, et `1 - Sources_de_donnees.md §2.3`.

#### ❌ `[Information (combat)]` absente de `wakfu_chat.log`

**Hypothèse initiale :** `[Information (combat)]` uniquement dans `wakfu.log`.

**Réfutation :** 2 420 occurrences confirmées dans `wakfu_chat.log` lors du scan terrain.

**Correction :** Mise à jour §2.3 et §3 de `1 - Sources_de_donnees.md`.

#### ❌ Date depuis `LastWriteTime` du fichier log

**Problème :** Utiliser la date de modification du fichier `.log.1` pour dater les lignes historiques écrasait les ancres de date trouvées dans le contenu, et donnait des formats incohérents (`16/3/26` vs `19/03/26`).

**Correction :** Extraire la date directement depuis les lignes `(DD/M/YY)` présentes dans le log. Détection du passage minuit via comparaison d'horodatages consécutifs.

#### ❌ Auto-détection du personnage sur données historiques

**Problème :** Le script prenait le premier personnage avec des level-ups dans les vieux logs — c'était L'Immortel (niveau 181), pas Goldens (créée 1h plus tôt).

**Correction :** Lecture du titre de fenêtre "NomPersonnage - WAKFU" → zéro ambiguïté, zéro saisie.

#### ❌ Bugs PowerShell de scope dans `ForEach-Object` pipeline

**Problème :** `$dateAncre = ...` dans un `foreach` externe et `$script:dateAncre = ...` dans un `ForEach-Object` interne semblaient être des variables différentes, mais le `foreach` externe tournant au scope script, l'affectation locale écrasait la variable script au changement de fichier.

**Correction :** Distinguer explicitement les variables locales (lecture seule dans le pipeline) des variables script (modifiées avec `$script:`). Ne jamais affecter depuis le foreach une variable dont le nom est utilisé avec `$script:` dans le pipeline imbriqué.

---

### Découvertes terrain

#### Données de courbe XP

Premières mesures sur le personnage "Goldens" (nouveau, créé session 2) avec bonus ×5 :

| Niveau | Passé à | XP du niveau | Ratio |
|--------|---------|-------------|-------|
| 8 | 20/03/26 02:33:34 | 2 442 (~) | — |
| 9 | 20/03/26 02:33:55 | 5 056 (~) | ×2,07 |
| 10 | 20/03/26 02:50:41 | 4 422 (~) | ×0,87 |
| 12 | 20/03/26 03:01:02 | 9 658 (~) | ×2,18 |
| 14 | 20/03/26 03:34:34 | 11 951 [CSV] | ×1,24 |

Les ratios irréguliers sont liés au bonus ×5 et aux combats qui font sauter plusieurs niveaux d'un coup (`+2 niveau`). Le CSV confirme les valeurs pour les niveaux mesurés.

#### Ancres de date dans les logs

Découverte : les lignes de transition jour/nuit embarquent la date réelle au format `(DD/M/YY)` — voir §2.14 de `1 - Sources_de_donnees.md`.

#### CSV de référence existant

`docs/RND/poc-database/courbexp230.csv` : données de 1 à 230, confirmées jusqu'au niveau 190 (source Methodwakfu 2025-11-24). Indexation : `XP_pour_ce_niveau[N]` = XP pour passer de N-1 à N.
`docs/RND/poc-database/courbemetiers175.csv` : courbe XP des métiers (à documenter).

---

### À faire — suite

- [ ] Confirmer les niveaux 191–230 du CSV avec un personnage 190+
- [ ] Documenter `courbemetiers175.csv` (structure, source, fiabilité)
- [ ] Valider test-destruction.ps1, test-hdv.ps1 sur terrain (scénarios 3, 4, 5 du guide)
- [ ] Identifier les worldIds 436, 437, 440, 1252
- [ ] Vérifier clan master via `[Proximité]`
