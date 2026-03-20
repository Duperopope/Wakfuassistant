# Journal POC — 2026-03-20

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
