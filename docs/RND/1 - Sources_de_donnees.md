# Grand 1 — Sources de données Ankama/Wakfu
## Inventaire complet des traces exploitables

*Document de référence — WakfuAssistant*
*Dernière mise à jour : 2026-03-20*

---

## Vue d'ensemble

Ankama génère plusieurs couches de données locales accessibles en lecture seule, réparties
entre des emplacements **fixes** (AppData — indépendants de l'installation) et des
emplacements **variables** (choisis par l'utilisateur à l'installation).

### Écosystème de launchers Ankama

Ankama a plusieurs générations de launcher coexistant sur la machine :

| Dossier AppData | Type | Rôle |
|----------------|------|------|
| `Roaming/zaap/` | **Launcher principal actuel** (Electron) | Gestion des jeux, auth, logs jeu |
| `Roaming/Zaapi/` | Launcher alternatif / variante Steam (Electron) | Variante légère, service port 26116 |
| `Roaming/Ankama Launcher/` | Ancien launcher (Electron/Chromium) | Obsolète, données résiduelles |
| `Local/zaap-updater/` | Updater du launcher zaap | Mise à jour auto du launcher |
| `LocalLow/Ankama/Dofus/` | Données Dofus (Unity) | Spécifique Dofus, hors scope Wakfu |

**Points clés :**
- Les dossiers **AppData** ont des emplacements fixes (`%APPDATA%` = `C:/Users/{USER}/AppData/Roaming/`).
- Le **launcher lui-même** (l'exécutable zaap) est installé à un emplacement **choisi par
  l'utilisateur** (ex : `G:\ankama\`). Son chemin est lisible dans `zaap/application.log`
  via les stack traces d'erreurs (`G:\ankama\resources\app.asar\main.js`).
- Le **jeu Wakfu** est installé à un emplacement **choisi par l'utilisateur** (peut être
  sur une autre partition, ou via Steam : `G:\Steam\steamapps\common\Wakfu`).
  Son chemin est toujours disponible dans `zaap/repositories/repositories.json`.

**Méthode pour trouver le chemin d'installation du jeu :**
```python
import json
from pathlib import Path

_REPOS = Path(os.environ["APPDATA"]) / "zaap" / "repositories" / "repositories.json"

def get_wakfu_install_path() -> Path | None:
    data = json.loads(_REPOS.read_text(encoding="utf-8"))
    for game in data.get("games", {}).values():
        if game.get("gameUid") == "wakfu":
            return Path(game["location"])
    return None
```

### Découverte : serveur HTTP local du launcher

Le launcher zaap/Zaapi expose **deux serveurs locaux** au démarrage :

| Port | Type | Rôle connu |
|------|------|-----------|
| **26116** | HTTP REST (`[SERVICE]`) | API interne — utilisée par le jeu pour obtenir les tokens d'auth (`AuthGetGameTokenRPC`) |
| **26117** | WebSocket text (`[TEXTSOCKETSERVER]`) | Communication temps réel launcher↔jeu |

Ces ports sont **potentiellement interrogeables** depuis l'overlay. Piste à explorer (voir §10).

### Arborescence des sources (emplacements fixes)

```
%APPDATA%/zaap/                               ← FIXE (toujours ici)
├── Settings                                  ← JWT Zaap (compte, abonnement, username)
├── application.log                           ← Logs du launcher (chemins install, auth)
├── repositories/repositories.json           ← Chemin d'install du jeu, version
├── universe/                                 ← Métadonnées univers (Krosmoz, etc.)
├── keydata/.keydata{ACCOUNT_ID}              ← Données chiffrées (clés de session ?)
└── gamesLogs/wakfu/
    ├── logs/
    │   ├── wakfu.log                         ← LOG PRINCIPAL (actif, rotation ×3)
    │   ├── wakfu_chat.log                    ← Chat + combat uniquement (plus propre)
    │   ├── wakfu_animation.log               ← Erreurs animations
    │   ├── wakfu_camera.log                  ← Mouvements caméra
    │   ├── wakfu_fileLoading.log             ← Chargements assets
    │   ├── wakfu_lua.log                     ← Erreurs scripts Lua/quêtes
    │   ├── wakfu_particles_scripts.log       ← Particules/effets
    │   └── wakfu_theme.log                   ← Thèmes UI
    └── preferences/
        ├── accountPreferences{ID}.properties ← Paramètres du compte (son, UI, dernier perso)
        ├── characterPreferences-{NOM}.properties (×N par perso ayant été joué)
        ├── userPreferences.properties        ← Positions fenêtres, dernier login, lastServerId
        ├── shortcuts.xml                     ← Raccourcis clavier
        └── clientConfig/
            └── {LOGIN_ANKAMA}/              ← Nom de compte = nom du dossier
                ├── account.xml              ← Zaaps favoris, highlights de stats
                ├── {SERVEUR}/               ← Un dossier par serveur (Ogrest, Rubilax, Pandora…)
                │   ├── world.xml            ← Données monde
                │   └── {NOM_PERSONNAGE}/    ← Un dossier par personnage (inclut supprimés)
                └── null/                    ← Données sans serveur associé

%APPDATA%/Zaapi/                              ← FIXE — launcher alternatif (Steam/variante)
├── application.log                           ← Logs Zaapi (contient chemin install Steam)
└── certificate/                              ← Certificats SSL locaux

%LOCALAPPDATA%/zaap-updater/                  ← FIXE — updater launcher
└── installer.exe / package.7z / pending/

{CHEMIN_CHOISI}/Wakfu/                        ← VARIABLE — installation jeu
├── config.properties                         ← URLs serveurs, paramètres jeu complets
├── zaap.yml                                  ← Config JVM (-Xmx4G, GC, fragments)
└── sentry.properties                         ← DSN Sentry (tracking erreurs Ankama)
```

---

## 1. Fichiers de configuration statiques

### 1.1 `clientConfig/{LOGIN}/` — Nom de compte et structure

**Ce qu'on peut extraire :**
- **Nom de compte Ankama** → nom du dossier lui-même (ex : `Kairozadyk`)
- **Serveurs connus** → sous-dossiers directs (ex : `Ogrest`, `Rubilax`, `Pandora`)
- **Personnages par serveur** → sous-dossiers dans chaque serveur

**Exemple de structure réelle :**
```
clientConfig/Kairozadyk/
├── account.xml
├── Ogrest/
│   ├── L'Immortel/
│   ├── L'Intemporel Kairos/
│   ├── Madame Céleste/
│   ├── Zadyk Le Magnifique/
│   └── world.xml
├── Rubilax/
│   ├── Treshatu/
│   └── world.xml
└── Pandora/
    ├── Divinité Rolex/
    └── world.xml
```

**Fiabilité :** Très haute. Ces dossiers sont créés dès la première connexion sur un
personnage et ne sont pas supprimés si le personnage est supprimé. Ils peuvent donc
contenir des personnages obsolètes (supprimés ou transférés).

**Code d'extraction :**
```python
from pathlib import Path

_PREFS_ROOT = Path("C:/Users/.../zaap/gamesLogs/wakfu/preferences/clientConfig")

def get_account_login() -> str | None:
    for child in _PREFS_ROOT.iterdir():
        if child.is_dir() and child.name not in ("null", "[Google]..."):
            return child.name
    return None

def get_servers_and_characters() -> dict[str, list[str]]:
    login = get_account_login()
    if not login:
        return {}
    result = {}
    for server_dir in (_PREFS_ROOT / login).iterdir():
        if server_dir.is_dir() and server_dir.name != "null":
            chars = [c.name for c in server_dir.iterdir() if c.is_dir()]
            result[server_dir.name] = chars
    return result
```

---

### 1.2 `userPreferences.properties` — Positions UI et état connu

**Clés exploitables :**

| Clé | Valeur exemple | Utilité |
|-----|---------------|---------|
| `lastLogin` | `Kairozadyk` | Nom de compte actif |
| `lastServerId` | `10` | ID numérique du dernier serveur |
| `resolution` | `3441x1441x32x144x1x0x0x...` | Résolution + refresh rate |
| `graphicalPresets` | `3` | Qualité graphique |
| `last.server.was.neo` | `false` | Serveur Neo ou classique |
| `minimapDialog.window.x/y/width/height` | `2963 / 1112 / 300 / 330` | Position et taille de la minimap |
| `{fenêtre}Dialog.window.x/y` | variable | Position de chaque fenêtre UI du jeu |

**Note :** `lastServerId` est un ID numérique interne, pas le nom. La correspondance
ID→Nom n'est pas directement dans ce fichier.

**Comportement vérifié par test (2026-03-18) :**

| Moment | Wakfu écrit le fichier | Wakfu relit le fichier |
|--------|----------------------|----------------------|
| Changement de map en jeu | ❌ | ❌ |
| Retour à sélection personnage | ✅ | ❌ |
| Transitions dans la même session | ❌ | ❌ |
| **Lancement à froid (jeu fermé→ouvert)** | — | ✅ **uniquement ici** |

**Système de coordonnées UI Wakfu :**
- Axe X : gauche → droite (standard)
- Axe Y : **bas → haut** (inversé). y=100 = bas de l'écran, y=1112 = haut de l'écran
- Sur résolution 3441×1441 : coin haut-droit ≈ (2963, 1112), coin bas-gauche ≈ (100, 100)

**Pistes d'utilisation pour WakfuAssistant :**
- **Lecture** : connaître la position de toutes les fenêtres UI actives pour éviter
  que l'overlay ne se superpose à une fenêtre importante
- **Premier lancement** : positionner intelligemment l'overlay selon la résolution et
  les positions des fenêtres existantes
- **Sauvegarde de configuration UI** : permettre à l'utilisateur de sauvegarder/restaurer
  la disposition de ses fenêtres par personnage (à appliquer avant le prochain lancement)
- **⚠️ Limitation** : toute modification n'est prise en compte qu'au prochain lancement
  à froid — aucun effet en temps réel pendant une session active

---

### 1.3 `accountPreferences{ID}.properties` — Paramètres compte

**Clés exploitables :**

| Clé | Valeur exemple | Utilité |
|-----|---------------|---------|
| `lastSelectedCharacterName` | `Zadyk Le Magnifique` | Dernier personnage joué |
| `autoLockFights` | `true` | Paramètre gameplay |
| `chatViewFrenchCommunity` | `true` | Canaux de chat actifs |
| `chatViewEnglishCommunity` | `true` | Canaux de chat actifs |
| `characterSelectionTileSize` | `1` | Taille des tuiles de sélection |
| `ambianceSoundsVolume` | `0.056` | Volume ambiance |
| `favoriteStatesField` | `3398` | Favoris de filtres |

**Fiabilité :** Haute. Mis à jour à chaque session.

---

### 1.4 `characterPreferences-{NOM}.properties` — Par personnage

Présent pour **chaque personnage ayant déjà été joué**, y compris les personnages
supprimés. Contient surtout des données UI (positions de barres de sorts, état des
achievements pliés/dépliés). Peu d'informations exploitables directement.

**Clés notables :**
- `buildOrder` — Ordre des builds actifs
- `openedShortcutBars` — Nombre de barres de sorts ouvertes
- `defaultShortcutBarType` — Mode WORLD ou FIGHT

---

### 1.5 Titre de fenêtre — Détection du personnage actif

Le processus Wakfu expose le nom du personnage connecté dans son titre de fenêtre Windows :
```
NomDuPersonnage - WAKFU
```

**Méthode PowerShell :**
```powershell
$proc = Get-Process | Where-Object { $_.MainWindowTitle -match "- WAKFU$" } | Select-Object -First 1
$character = ($proc.MainWindowTitle -replace "\s*-\s*WAKFU$","").Trim()
```

**Fiabilité :** Haute. Mis à jour dès que le personnage est en jeu. Permet l'auto-détection sans saisie utilisateur ni lecture de fichier de préférences.

**Complémentarité avec `accountPreferences` (§1.3) :** Le fichier de préférences donne le dernier personnage joué (même si le jeu est fermé) ; le titre de fenêtre donne le personnage actuellement en jeu (temps réel, uniquement si le jeu est ouvert).

---

### 1.6 Récupération du contexte utilisateur — Vue d'ensemble

Pour les scripts et l'overlay, trois informations contextuelles sont nécessaires. Voici où les récupérer et leur fiabilité comparative :

| Information | Source | Disponibilité | Fiabilité |
|-------------|--------|---------------|-----------|
| **Compte Ankama** | Dossier `clientConfig/{LOGIN}/` (§1.1) | Toujours, même jeu fermé | Très haute |
| **Serveur actif** | `wakfu.log` pattern `wakfu-{serveur}.ankama-games.com:5556` (§2.2.C) | Dès connexion au serveur | Très haute |
| **Personnage actif** | Titre de fenêtre `NomPerso - WAKFU` (§1.5) | Uniquement si jeu ouvert et perso connecté | Très haute |
| **Tous persos/serveurs** | Sous-dossiers `clientConfig/{LOGIN}/{SERVEUR}/{PERSO}/` (§1.1) | Toujours, histo complet | Haute (inclut persos supprimés) |

**Récupération PowerShell (les trois en une fois) :**
```powershell
# Serveur depuis wakfu.log
$logsDir = Join-Path $env:APPDATA "zaap\gamesLogs\wakfu\logs"
$serverLine = Get-Content (Join-Path $logsDir "wakfu.log") -ErrorAction SilentlyContinue |
    Where-Object { $_ -match "wakfu-\w+\.ankama-games\.com:5556" } | Select-Object -Last 1
$serveur = if ($serverLine -and $serverLine -match "wakfu-(\w+)\.ankama-games\.com:5556") { $Matches[1] } else { "inconnu" }

# Personnage depuis titre de fenêtre
$proc = Get-Process | Where-Object { $_.MainWindowTitle -match "- WAKFU$" } | Select-Object -First 1
$character = if ($proc) { ($proc.MainWindowTitle -replace "\s*-\s*WAKFU$","").Trim() } else { $null }

# Compte depuis clientConfig
$clientConfig = Join-Path $env:APPDATA "zaap\gamesLogs\wakfu\preferences\clientConfig"
$compte = (Get-ChildItem $clientConfig -Directory | Where-Object { $_.Name -notin "null","[Google]" } | Select-Object -First 1).Name
```

**Note XP métier :** L'XP de métier est **partagée entre tous les personnages d'un même serveur**. Pour le tracking de métiers, le serveur est l'identifiant pivot — pas le personnage actif. Voir §2.3 et `poc-conceptscripts/metier-curve.ps1`.

---

## 2. wakfu.log — Log principal

### 2.1 Généralités

- **Chemin :** `C:/Users/{USER}/AppData/Roaming/zaap/gamesLogs/wakfu/logs/wakfu.log`
- **Rotation :** 3 fichiers max (`.log`, `.log.1`, `.log.2`). À chaque lancement du jeu,
  le log est réinitialisé (pas de timestamps absolus en début — tout commence à la même
  session jusqu'au restart suivant).
- **Format de ligne :**
  ```
  {LEVEL} {HH:MM:SS,mmm} [{THREAD}] ({CLASS}:{LINE}) - {MESSAGE}
  ```
  Exemple :
  ```
  INFO 10:41:40,601 [AWT-EventQueue-0] (ccv:362) - Authentication token received from dispatch server : 166c4a79...
  ```
- **Limitation :** Les heures sont sans date. Si la session dure plusieurs jours, les
  heures cyclent. Pour dater absolument, utiliser les ancres de date présentes dans les logs (voir §2.14) — la date de modification du fichier est un dernier recours imprécis.

---

### 2.2 Cycle de connexion — Marqueurs d'état

#### A. Démarrage / Écran login (SELECTING)

| Marqueur | Signification |
|----------|--------------|
| `connect(ENV_VARIABLES)` | Connexion Zaap initiée |
| `Connected to Zaap. Starting token fill` | Authentification Zaap en cours |
| `token obtained from zaap` | Token Zaap reçu → **début d'un nouveau cycle AUTH** |
| `Connexion au proxy :wakfu-dispatcher.ankama-games.com:5558` | Connexion au dispatcher |
| `Authentication result 0` | Auth réussie (0 = succès) |

**Regex compte login :** Aucune — le nom de compte n'apparaît pas dans wakfu.log.
Se récupère via `clientConfig/` (voir §1.1) ou `userPreferences.properties`.

---

#### B. Sélection de serveur (SERVER_SELECT)

| Marqueur | Signification |
|----------|--------------|
| `token obtained from zaap` | Début du cycle (remise à zéro de l'état) |
| `Connexion au proxy :wakfu-dispatcher.ankama-games.com:5558` | Connexion dispatcher |
| `Authentication result 0` | Succès auth |
| `Unable to get value for key server.group.9` (×N) | Liste des groupes serveurs récupérée |

**Note :** La liste de tous les serveurs disponibles se télécharge à ce stade (messages
`server.group.*` répétitifs). Le nom du serveur sélectionné n'est pas loggué ici.

---

#### C. Connexion au serveur de jeu → Sélection de personnage (CHAR_SELECT)

| Marqueur | Signification |
|----------|--------------|
| `Authentication token received from dispatch server : {UUID} errorCode=0` | Serveur sélectionné, token de jeu reçu |
| `Connexion au proxy :wakfu-{NOM_SERVEUR}.ankama-games.com:5556` | **NOM DU SERVEUR** dans l'URL |
| `Sending DisconnectionMessage to Servers. Reason : {Dispatch}` | Transition dispatcher→jeu |
| `onNewConnection ... wakfu-{NOM}.ankama-games.com` | Connexion TCP établie au jeu |
| `Loading chat file.` | Écran de sélection de personnage actif |
| `Nettoyage des CharacterInfo contenus dans le CharacterInfoManager (0 restants sur N)` | N personnages dans la liste |

**Extraction du nom de serveur :**
```python
import re
_RE_SERVER = re.compile(
    r'Connexion au proxy :wakfu-([^.]+)\.ankama-games\.com:5556',
    re.IGNORECASE
)
# Exemple : "wakfu-rubilax.ankama-games.com:5556" → "rubilax" → "Rubilax"
```

**Fiabilité :** Très haute. Ce pattern apparaît à chaque connexion à un serveur de jeu.

**Note sur le nombre de personnages :** Le `CharacterInfoManager` affiche le compte total
de personnages sur le serveur, mais pas leurs noms. Les noms viennent de `clientConfig/`.

**Détection de la classe à la création :**
La ligne `ERROR {CLASSE}` apparaît au survol de chaque classe dans l'UI de création —
pas uniquement à la confirmation. On peut observer jusqu'à 7 changements de classe en
quelques secondes. La **dernière** `ERROR {CLASSE}` avant `success=true` est la classe
choisie avec une forte probabilité, mais pas de confirmation explicite dans les logs.

---

#### D. En jeu (IN_GAME)

| Marqueur | Signification |
|----------|--------------|
| `on remet la frame world` | Chargement monde terminé, joueur IN_GAME |
| `tp {ID} to X, Y` | Téléportation serveur du personnage — contient l'**ID numérique** du personnage |
| `personal_space_enter_result_message (success=true)` | Entrée maison personnelle réussie |
| `WakfuGameCalendar : adding periodic ClimateUpdateEvent event, period= 12 minutes` | Calendrier du jeu actif |
| `[NATION] Reception d'un message de synchro de nation demandant l'ajout d'une nouvelle nation : {ID}` | Nations chargées (30, 31, 32, 33) |
| `Déserialisation des achievements : size=2397` | Achievements du personnage chargés |
| `Received FriendListMessage` | Liste d'amis reçue |
| `Le joueur {NOM} ({GRADE}) est connecté sur le serveur {SERVEUR}.` | Commande /whois en jeu |
| `on quitte le monde {N}` | Changement de zone : le joueur **quitte** le monde N (direction : vers zone suivante) |
| `bZJ initialisé, centré sur (X,Y)` | Position de la carte initialisée dans le monde courant |
| `Update de chaos du protecteur {ID}, chaos = {bool}` | Mise à jour du protecteur de nation — IDs spécifiques à chaque capitale |

**Timing de session — Confirmé expérimentalement (session 2026-03-20) :**
- `wakfu.log` est **réinitialisé à chaque lancement du client** → le premier timestamp du fichier = heure de lancement du client Wakfu (JVM démarrée).
- Le premier `[Information (jeu)]` ou `[Information (combat)]` dans `wakfu.log` = heure effective d'entrée en jeu avec le personnage.
- `on remet la frame world` et `Received FriendListMessage` peuvent être absents des logs courts (milieu de session, fichier tronqué).

**Changements de zone — Séquence observée :**
```
INFO 00:50:38,802 - on quitte le monde 1252
INFO 00:50:38,860 - bZJ initialisé, centré sur (0,0)
INFO 00:50:42,452 - on quitte le monde 1089
INFO 00:50:46,274 - on quitte le monde 436
INFO 00:50:46,292 - bZJ initialisé, centré sur (6,-6)
```
La sémantique confirmée : `on quitte le monde N` signifie **le joueur était en N et s'en va** (pas qu'il arrive en N).
`bZJ initialisé` suit généralement le `quitte le monde` mais peut être absent (zones sans carte).

**Protecteurs — Correspondance zone :**
- Protecteurs 348, 349, 354 → Sufokia (monde 1135) — confirmé par corrélation avec arrivée dans la zone.

```python
_RE_ZONE_LEAVE = re.compile(r'on quitte le monde (\d+)')
_RE_ZONE_POS   = re.compile(r'bZJ initialisé, centré sur \((-?\d+),(-?\d+)\)')
_RE_PROTECTOR  = re.compile(r'Update de chaos du protecteur (\d+), chaos = (\w+)')
```

**Note sur `tp {ID}` :** apparaît dans certains contextes (spawn après création, retour après mort, téléportations serveur). N'est **pas garanti** à chaque connexion — dépend du scénario de spawn. Voir §2.7 pour la stratégie complète de mapping ID↔Nom.

**Extraction du nom de serveur via /whois :**
```python
_RE_WHOIS = re.compile(
    r"Le joueur\s+(.+?)\s+\([^)]+\)\s+est connecté sur le serveur\s+(.+?)(?:\.|$)",
    re.IGNORECASE
)
```

---

#### E. Déconnexions — Catalogue complet

| Marqueur | Transition | Notes |
|----------|-----------|-------|
| `Sending DisconnectionMessage to Servers. Reason : {LogOff}` | IN_GAME → CHAR_SELECT | Déconnexion via ESC |
| `Unloading characterChoiceDialog` | IN_GAME → CHAR_SELECT | Confirmation de retour à la liste |
| `Sending DisconnectionMessage to Servers. Reason : {Dispatch}` + token précédent | CHAR_SELECT → SERVER_SELECT | Retour à la liste des serveurs |
| `Sending DisconnectionMessage to Servers. Reason : {Dispatch}` **sans** token précédent | SERVER_SELECT → SELECTING | Déconnexion depuis l'écran serveur |
| `{logoff}` | IN_GAME → SELECTING | Déconnexion complète |
| `Launcher Button clicked` | ANY → SELECTING | Bouton "Quitter" cliqué |
| `Connexion avec le serveur perdue` | ANY | Perte de connexion réseau |

**Règle de désambiguïsation de `{Dispatch}` :**
```
{Dispatch} AVEC token précédent    → CHAR_SELECT (transition normale serveur→perso)
{Dispatch} SANS token précédent   → SELECTING   (déconnexion depuis serveur select)
```

---

### 2.3 Combat — Données extractibles

#### Lifecycle d'un combat

```
CREATION DU COMBAT
  → [_FL_] fightId=X NOM breed: Y [ID] join the fight  (×N joueurs/mobs)
  → [Information (combat)] NOM lance le sort SORT       (×N tours)
  → [Information (combat)] CIBLE: -N PV (ELEMENT)
  → [FIGHT] End fight with id X
```

#### Marqueurs détaillés

**Combattants :**
```
[_FL_] fightId={ID} {NOM} breed : {BREED_ID} [{FIGHTER_ID}] isControlledByAI={bool} obstacleId : {OBS_ID} join the fight at
```
- `breed` = ID numérique de la classe (ex: 11 = Eliotrope, voir table breeds)
- `isControlledByAI=false` → joueur humain
- `FIGHTER_ID` : grand entier négatif pour les monstres, positif pour les joueurs

```python
_RE_FIGHTER = re.compile(
    r'\[_FL_\] fightId=(\d+) (.+?) breed : (\d+) \[([^\]]+)\] isControlledByAI=(\w+)',
)
```

**Sorts lancés :**
```
[Information (combat)] {NOM} lance le sort {SORT}
[Information (combat)] {NOM} lance le sort {SORT} (Critiques)
```
```python
_RE_SPELL = re.compile(
    r'\[Information \(combat\)\] (.+?) lance le sort (.+?)(?:\s+\(Critiques\))?\s*$'
)
```

**Dégâts :**
```
[Information (combat)] {CIBLE}: {VALEUR} PV  ({ELEMENT})
[Information (combat)] {CIBLE}: {VALEUR} PV  ({ELEMENT}) ({SOURCE})
```
- Valeur négative = dégâts, positive = soin
- Éléments : Feu, Eau, Air, Terre, Lumière, Neutre
- Sources : Vol de vie, Hémorragie, Rupture violente, etc.

```python
_RE_DAMAGE = re.compile(
    r'\[Information \(combat\)\] (.+?): ([+-]?\s*[\d\s\u00a0\u202f]+) PV\s+\(([^)]+)\)'
)
```

**Statuts :**
```
[Information (combat)] {CIBLE}: {STATUT} (Niv. N)
[Information (combat)] {CIBLE}: {STATUT} (+N Niv.)
[Information (combat)] {CIBLE}: N PA ({SOURCE})
[Information (combat)] {CIBLE}: N PM ({SOURCE})
[Information (combat)] {CIBLE}: N PW ({SOURCE})
[Information (combat)] {CIBLE}: N % Dommages infligés ({SOURCE})
```

**KO / Mort :**
```
[Information (combat)] {NOM} est KO !
[Information (combat)] {NOM} est hors-combat !
[Information (combat)] {NOM} est mort
```

**Position en combat (XYZ) :**
```
Resynchronisation de la position d'un fighter dans notre combat. FightID = {ID}, FighterID = {ID} à la position {Point3 : (X, Y, Z)}
```

**Fin de combat :**
```
[FIGHT] End fight with id {ID}
NetInFight Removed
```

**XP gagnée — Discrimination personnage vs métier (confirmé 2026-03-20) :**

```
[Information (combat)] {NOM} : +{XP} points d'XP.  Prochain niveau dans : {RESTANT}.
[Information (jeu)]    {METIER} : +{XP} points d'XP.  Prochain niveau dans : {RESTANT}.
```

- ⚠️ **La source tag ne discrimine PAS le type d'XP** — correction 2026-03-20
- `[Information (combat)]` peut contenir XP **personnage ET métier** (ex : Trappeur utilisant des pièges en combat → sa ligne XP apparaît avec `[Information (combat)]`, pas `[Information (jeu)]`)
- `[Information (jeu)]` contient XP métier uniquement
- **Discriminant réel : le nom de l'entité** — si entity = nom du personnage actif → `xp_character` ; sinon → `xp_job`
- Le nom du personnage actif se récupère depuis le titre de fenêtre (voir §1.5)
- `[Information (jeu)]` apparaît dans **wakfu.log ET wakfu_chat.log** → ne lire que `wakfu_chat.log` pour éviter les doublons (voir §3)
- `[Information (combat)]` apparaît dans **wakfu.log ET wakfu_chat.log** (confirmé 2026-03-20 : 2 420 occurrences dans `wakfu_chat.log`)

**Level-up :** détectable par ` +1 niveau.` (ou `+N niveaux.`) entre le gain XP et "Prochain niveau dans" :
```
[Information (combat)] L'Immortel : +13 114 689 points d'XP. +1 niveau.  Prochain niveau dans : 1 365 544 387.
```

**Courbe XP par niveau — Formule et référence :**

Formule carryover (exacte, sans saisie répétée) :
```
carryover      = xp_gained - (total_xp_niveau_courant - xp_deja_accumulee)
total_xp_suivant = remaining_after_levelup + carryover
```
Une seule saisie au démarrage suffit (`total_xp_niveau_courant` + `xp_deja_accumulee`).
Ensuite chaque level-up calcule exactement le niveau suivant sans nouvelle question.

**Référence CSV :** `docs/RND/poc-database/courbexp230.csv` contient les valeurs confirmées niveaux 1–190 (source Methodwakfu 2025-11-24) et calculées jusqu'au niveau 230.
Convention CSV : `XP_pour_ce_niveau[N]` = XP nécessaire pour passer du niveau N-1 au niveau N.
Pour un joueur AU niveau X, la barre affiche `XP_pour_ce_niveau[X+1]`.

**Statut des données :**
- Niveaux 1–190 : ✅ Confirmés
- Niveaux 191–230 : ⚠️ Calculés (à confirmer par joueurs 190+)
- Niveaux 231+ : ❓ Inconnu — crowdsourcé à la montée de niveau

```python
_RE_XP = re.compile(
    r'\[Information \((?:combat|jeu)\)\]\s+(.+?)\s*:\s*\+([0-9\s\u00a0\u202f\']+)\s+points d\'XP\.'
    r'\s*((?:\+\d+\s+niveau[x]?\.\s*)?)Prochain niveau dans\s*:\s*([0-9\s\u00a0\u202f\']+)\.'
)
# group(1)=entité, group(2)=XP gagnée, group(3)=level-up si non vide, group(4)=XP restante
```

---

### 2.4 Économie et items

> *Mis à jour après Journaux d'écoute 1 et 2 — transféré dans le journal*

#### HDV — Transactions en temps réel (trois types distincts)

| Type | Pattern log | Discrimination |
|------|-------------|----------------|
| **Mise en vente** (listing) | `perdu Nx {item}` + `perdu N kamas` | Deux pertes : item + commission |
| **Réponse à offre d'achat** (vente instantanée) | `perdu Nx {item}` + `gagné N kamas` | Perte item + gain immédiat kamas |
| **Achat** | `perdu N kama(s)` + `ramassé Nx {item}` | Perte kamas + réception item |

Exemples :
```
# Mise en vente
Vous avez perdu 1x Feuille de Menthe .
Vous avez perdu 2 kamas.

# Réponse à offre d'achat (transaction instantanée)
Vous avez perdu 1x Feuille de Menthe .
Vous avez gagné 24 kamas.

# Achat
Vous avez perdu 1 kama.
Vous avez ramassé 1x Hache Piou .
```

**Règle de discrimination :**
- `perdu item` + `perdu kamas` → mise en vente
- `perdu item` + `gagné kamas` → vente instantanée / réponse à offre d'achat
- `perdu kamas` + `ramassé item` → achat

**⚠️ Prix non disponibles :** Le montant de la mise en vente (le prix demandé) n'est **jamais
loggué**. Seul le montant des frais de commission (kamas perdus à la mise en vente) est visible,
et le montant reçu à la vente. Le prix unitaire affiché dans l'HDV est une information purement
visuelle inaccessible depuis les logs.

#### HDV — Identification du comptoir par board ID

```
Searching path to [bAL id=N]{Point3 : (X, Y, Z)}
Lancement de l'occupation MARKET sur la board [bAL id=N]{Point3 : (X, Y, Z)}
On arrête l'occupation MARKET sur la board [bAL id=N]
```

Le `bAL id` identifie le comptoir précis. Boards observées à Sufokia :
- `bAL id=31546` — Sufokia comptoir 1
- `bAL id=31547` — Sufokia comptoir 2

Les IDs pour Bonta, Brakmar, Astrub, Kelba, Srambad restent à découvrir lors de prochaines sessions.

```python
_RE_MARKET_START = re.compile(
    r'Lancement de l\'occupation MARKET sur la board \[bAL id=(\d+)\]'
)
_RE_MARKET_STOP = re.compile(
    r'On arrête l\'occupation MARKET sur la board \[bAL id=(\d+)\]'
)
```

#### HDV — Ventes hors-session (au retour en jeu)

```
[Information (jeu)] Vous avez vendu N objets pour un prix total de M§ pendant votre absence.
```
```python
_RE_VENTE_HDV = re.compile(
    r'Vous avez vendu (\d+) objets pour un prix total de ([\d\s\u00a0\u202f]+)§'
)
```

#### Items ramassés / perdus

**Loot ramassé :**
```
[Information (jeu)] Vous avez ramassé Nx {NOM_ITEM} .
```

**Perte d'items :**
```
[Information (jeu)] Vous avez perdu Nx {NOM_ITEM} .
```

**Perte de kamas :**
```
[Information (jeu)] Vous avez perdu N kamas.
```

**Gain de kamas :**
```
[Information (jeu)] Vous avez gagné N kamas.
```

#### Destruction d'objets

```
Vous avez perdu Nx {NOM_ITEM} .
[Vous avez ramassé Nx {RESSOURCE} .]        ← optionnel si récupération de composants
Vous avez détruit N objet(s) et récupéré N ressource(s)
```

La dernière ligne est le bilan. Distinct d'une vente : pas de gain de kamas.

#### Nourrissage de familier

```
Votre familier aime le repas ! (+N exp.)
Vous avez perdu 1x {NOURRITURE} .
```

Ordre constant : message d'XP du familier, puis perte de l'item nourriture.

#### XP métier

```
[Information (jeu)] {METIER} : +N points d'XP. Prochain niveau dans : M.
```

**Discrimination :** Entity ≠ nom du personnage actif → XP métier. Même règle que XP personnage (voir §2.3).

**Portée serveur :** L'XP métier est commune à **tous les personnages du même serveur**. Un Trappeur niveau 50 sur Ogrest = le même Trappeur quel que soit le personnage qui joue.

**Courbe XP métier — Formule :**

Formule linéaire universelle (confirmée niveaux 0–170 sur wakfu.wiki.gg) :
```
XP_pour_ce_niveau[N] = 150 × N + 75
```
Exemples : niveau 1 = 75 XP, niveau 2 = 225 XP, niveau 10 = 1 425 XP, niveau 100 = 15 075 XP.

**Référence CSV :** `docs/RND/poc-database/courbemetiers175.csv`
- Colonnes : `Niveau_Metier, XP_pour_ce_niveau, XP_cumulee, Source`
- Convention identique à `courbexp230.csv` : `XP_pour_ce_niveau[N]` = XP pour passer du niveau N-1 au niveau N
- Pour un joueur AU niveau X, la barre affiche `XP_pour_ce_niveau[X+1]`

**Niveaux max par type de métier (source : notes CSV + wikis) :**

| Niveau max | Métiers concernés |
|------------|-------------------|
| 165 | Récolte, Ébéniste, Boulanger, Cuisinier |
| 170 | Armurier, Bijoutier, Maître d'Armes, Maroquinier, Tailleur |

**Statut des données CSV :**
- Niveaux 0–170 : ✅ Confirmés (formule linéaire validée)
- Niveaux 171+ : ❓ Inconnu — crowdsourcé si des métiers dépassent 170

**Script de suivi :** `poc-conceptscripts/metier-curve.ps1` — analogue à `xp-curve.ps1`, suit tous les métiers simultanément, historique par serveur.

#### Apprentissage de cosmétiques, meubles, vitrines

```
[Information (jeu)] Vous avez ramassé 1x {NOM_ITEM} .
Vous venez d'utiliser : {NOM_ITEM}
appris l'apparence {NOM_ITEM}
```
```python
_RE_APPRIS = re.compile(r'appris l\'apparence (.+)')
```

Le même pattern `appris l'apparence` est utilisé pour **costumes, meubles et vitrines**.
Un item déjà appris déclenche `[Messages d'erreur] Conditions d'utilisation non respectées`.

---

### 2.5 Chat (dans wakfu.log)

> *Mis à jour après Journal d'écoute 2 — transféré dans le journal*

Le log principal contient les messages de chat, mais ils sont mélangés avec tous les
autres événements. Préférer `wakfu_chat.log` pour le chat (voir §3).

**Canaux présents dans wakfu.log :**

| Canal | Description | Présent dans wakfu_chat.log ? |
|-------|-------------|-------------------------------|
| `[Commerce]` | Annonces achat/vente | ✅ |
| `[Communauté (FR)]` | Discussion générale | ✅ |
| `[Communauté (EN)]` | Discussion générale anglophone | ✅ |
| `[Recrutement (FR)]` | Recrutement groupe/raid | ✅ |
| `[Recrutement (EN)]` | Recrutement anglophone | ✅ |
| `[Proximité]` | Chat local (zone visible uniquement) | ✅ |
| `[Information (jeu)]` | Notifications système jeu | ✅ |
| `[Information (combat)]` | Événements de combat (sorts, dégâts, KO) | ❌ **exclusif à wakfu.log** |
| `[Messages d'erreur]` | Erreurs d'utilisation d'items, restrictions | ✅ |
| `[Guilde]`, `[Alliance]` | Si applicable | ✅ |

**⚠️ `[Information (combat)]` est absent de wakfu_chat.log.** Toute analyse de combat
(sorts lancés, dégâts, KO) nécessite wakfu.log.

**Format :**
```
[{CANAL}] {JOUEUR} : {MESSAGE}
```
```python
_RE_CHAT = re.compile(r'\[([^\]]+)\] (.+?) : (.+)')
```

#### Liens cliquables dans le chat — artéfact double espace

Quand un joueur insère un lien d'item cliquable `[Nom de l'item]` dans le chat, le log
**supprime les crochets** mais conserve les espaces autour du nom. Deux items contigus
(`] [`) laissent un **double espace** (`  `) dans le log.

```
# En jeu : "[Espadon de Tal Kasha] [Espadon de Tal Kasha] à vendre"
# Dans le log :
[Commerce] Foufy : Espadon de Tal Kasha  Espadon de Tal Kasha  à vendre
```

**Règle de détection :** un double espace (`  `) entre des mots dans un message de chat
indique la présence d'un lien cliquable. Les joueurs peuvent aussi écrire les noms en
texte libre sans lien — les deux coexistent dans le même canal.

```python
import re
_RE_LINKED_ITEMS = re.compile(r'(\S[^  ]+)  ')  # capture avant chaque double espace
```

---

### 2.6 Réseau et infrastructure (informatif)

---

### 2.7 Correspondance ID↔Nom de personnage

L'ID numérique interne d'un personnage (`CharacterInfo {ID}`) est nécessaire pour
interpréter certains événements — notamment la suppression. Deux sources le fournissent :

#### Méthode A — `tp {ID}` (connexion / spawn)

```
INFO {HH:MM:SS} - tp {ID} to X, Y
```

Apparaît lors de certains spawns : création de personnage, retour après mort,
téléportations serveur. Corrélation avec le nom :
- **À la création :** `characterPreferences-{NOM}.properties inexistant, on le crée`
  apparaît dans la même seconde → `tp {ID}` qui suit = ce personnage.
- **En session active :** le titre de fenêtre (`{NOM} - Wakfu`) indique le personnage
  actif au moment où le `tp` apparaît.

**Limitation :** non garanti à chaque connexion (absent lors de spawns tutoriels ou
de changements de carte ordinaires).

#### Méthode B — `[_FL_]` (combat)

```
[_FL_] fightId={FIGHT} {NOM} breed : {BREED} [{ID}] isControlledByAI=false ...
```

Donne explicitement `NOM` **et** `ID` ensemble. Apparaît dès le premier combat.
C'est la méthode **universelle et fiable** — valable sur tous les serveurs et
dans tous les contextes de jeu.

```python
_RE_FIGHTER_PLAYER = re.compile(
    r'\[_FL_\] fightId=\d+ (.+?) breed : \d+ \[(\d+)\] isControlledByAI=false'
)
# group(1) = nom, group(2) = ID numérique
```

#### Stratégie recommandée

```python
_char_id_map: dict[int, str] = {}  # ID → nom, persisté entre sessions

# 1. Remplir via [_FL_] à chaque combat (méthode principale)
# 2. Compléter via tp {ID} + titre fenêtre / prefs (méthode secondaire)
# 3. À la suppression : _char_id_map.get(ID, "Inconnu")
```

**Cas non couvert :** un personnage supprimé sans jamais avoir combattu **ni** reçu
de `tp` pendant une session où l'overlay tournait. Très rare en pratique.

---

| Pattern | Information |
|---------|-------------|
| `L:{IP_LOCAL}:{PORT} - R:{HOST}/{IP_REMOTE}:{PORT}` | Connexion TCP Netty |
| `wakfu-dispatcher.ankama-games.com:5558` | Serveur d'authentification |
| `wakfu-{NOM}.ankama-games.com:5556` | Serveur de jeu |
| `zaap-chat.ankama.com:6337` | Serveur de chat |
| `haapi.ankama.com` | API Ankama (HTTPS) |

---

### 2.8 Occupations — Activités du joueur

> *Ajouté après Journaux d'écoute 1 et 2 — transféré dans le journal*

Le système d'occupations trace les activités du joueur (interactions avec l'environnement).
Format général :
```
Lancement [de l']occupation {TYPE} [sur/à] ...
[On termine / On arrête] l'occupation {TYPE} ...
```

#### MARKET — HDV

```
Searching path to [bAL id=N]{Point3 : (X, Y, Z)}
Lancement de l'occupation MARKET sur la board [bAL id=N]{Point3 : (X, Y, Z)}
On arrête l'occupation MARKET sur la board [bAL id=N]
```

Voir §2.4 pour la taxonomie complète des transactions.

#### COLLECT — Récolte de ressources

```
On démarre l'occupation de collecte sur la ressource bKV@{hash}
Fin de l'occupation de collecte
{Profession} : +N points d'XP.  Prochain niveau dans : N.
Vous avez ramassé Nx {item} .
```

Le `bKV@{hash}` est l'identifiant interne du nœud de ressource en mémoire Java.
Les professions observées incluent Herboriste, Pêcheur.

#### PLANT — Agriculture (planter une bouture)

```
Vous venez d'utiliser : {NOM_BOUTURE}
Lancement occupation PLANT
On termine l'occupation PLANT
Vous avez perdu 1x {NOM_BOUTURE} .
```

Distincte de la récolte (COLLECT) : c'est l'action de planter, pas de récolter.

#### MANAGE_FLEA — Vitrines dans le havre sac *(feature retirée)*

**⚠️ Les vitrines de havre sac ne sont plus fonctionnelles** depuis plusieurs mises à
jour. Le gameplay (vendre ses items depuis son havre sac sans passer par l'HDV) a été
retiré quand Ankama a centralisé le commerce à l'HDV. Le pattern ci-dessous est
véstigial — les logs peuvent encore le produire dans certains contextes, mais la
feature n'est plus accessible aux joueurs.

```
Serching path to {Point3 : (X, Y, Z)}   ← note: faute de frappe "Serching" dans le jeu
Lancement de l'occupation MANAGE_FLEA sur la vitrine uid={uid_long}
[DIMENSIONAL_BAG_FLEA_CONTENT_MESSAGE] ownerId={charID}
On arrête l'occupation MANAGE_FLEA sur la vitrine uid={uid_long} (fromServer=false, sendMessage=true)
Recu demande d'annulation du managing du local player
```

`uid_long` = identifiant int64 unique de la vitrine. `ownerId` = ID numérique du propriétaire
du havre sac. `fromServer=false` = fermeture initiée côté client.

---

### 2.9 Captcha Capt'chat — Système antibot

> *Ajouté après Journal d'écoute 2 — transféré dans le journal*

Le Capt'chat (breed **5314**) est un système antibot déguisé en combat. Il se déclenche
aléatoirement pendant les sessions de farming en zone.

#### Mécanisme du combat

- Le joueur n'a qu'**un seul sort** disponible : `Destruction de Glyphe`
- Des dés de 6 apparaissent sur toute la surface de combat
- Côté joueur : 8 dés (glyphes à détruire)
- Côté Capt'chat : 3 dés non-barrés (valeurs attendues) + 5 dés barrés
- Le joueur doit détruire les 3 glyphes de son côté correspondant aux valeurs du Capt'chat

**⚠️ Limitation critique :** Les valeurs des dés (la combinaison attendue) ne sont
**jamais loguées nulle part**. C'est une information purement visuelle, inaccessible
depuis les logs.

#### Signature de déclenchement

```
[COLLECT CANCELLATION] No occupation or occupation already ended   ← signal précoce
on quitte le monde 527
Quête échouée: "Course : Gligli Mania"     ← et/ou autres quêtes de zone
bZJ initialisé, centré sur (0,-1)
WakfuGameCalendar : adding periodic ClimateUpdateEvent event, period= 12 minutes
NetInFight Added
NetInFight Added
CREATION DU COMBAT
[_FL_] fightId={N} Capt'chat breed : 5314 [{ID_négatif}] isControlledByAI=true ... at {Point3 : (1, -9, 0)}
[_FL_] fightId={N} {joueur} breed : {X} [{ID_joueur}] isControlledByAI=false ... at {Point3 : (-3, -9, 0)}
```

Le `[COLLECT CANCELLATION]` est le signal précoce le plus fiable : le captcha interrompt
toujours une collecte en cours. Les positions d'entrée en combat sont fixes pour les deux
combattants (`(1,-9,0)` et `(-3,-9,0)`).

```python
_RE_CAPTCHA_START = re.compile(
    r'\[_FL_\] fightId=(\d+) Capt\'chat breed : 5314'
)
```

#### Détection du résultat

| Résultat | Marqueurs dans les logs |
|----------|------------------------|
| **SUCCÈS** | `Vous avez ramassé 40x {item}` + `Vous avez gagné N kamas` avant/pendant `[FIGHT] End` |
| **ÉCHEC** | `{joueur} est KO !` dans `[Information (combat)]` |

Exemple SUCCÈS :
```
[Information (combat)] {joueur} lance le sort Destruction de Glyphe   ← tour 1
[Information (combat)] {joueur} lance le sort Destruction de Glyphe   ← tour 2
[Information (jeu)] Vous avez ramassé 40x {item} .
on quitte le monde 862
[Information (combat)] {joueur} lance le sort Destruction de Glyphe   ← tour 3 (réseau décalé)
[Information (jeu)] Vous avez gagné N kamas.
[FIGHT] End fight with id {N}
```

Exemple ÉCHEC :
```
[Information (combat)] {joueur} lance le sort Destruction de Glyphe   ← tour 1
[Information (combat)] {joueur} lance le sort Destruction de Glyphe   ← tour 2
[Information (combat)] {joueur} est KO !
[Information (combat)] {joueur} lance le sort Destruction de Glyphe   ← post-mortem
[FIGHT] End fight with id {N}
```

**Récompense fixe :** 40× ressources de la zone + N kamas (montant variable).
Le 3ème sort peut arriver après `on quitte le monde 862` (résolution réseau décalée).

---

### 2.10 Espace personnel — Havre sac

> *Ajouté après Journal d'écoute 2 — transféré dans le journal*

#### Ouverture du havre sac

```
personal_space_enter_result_message (success=true)
```
ou dans le log complet :
```
PERSONAL_SPACE_ENTER_RESULT_MESSAGE
```

Le havre sac est un **objet portable** ouvert via une icône d'inventaire ou un raccourci
clavier. Il n'y a pas de "maison physique" à entrer — le joueur l'ouvre toujours sur
place, quelle que soit la zone où il se trouve.

**Zones où le havre sac est inaccessible :** donjons, bibliothèques, certaines zones du
marché, et zones avec trop de havre sacs déjà ouverts à proximité. Dans ces cas,
l'ouverture échoue (le signal `success=true` n'apparaît pas).

**⚠️ Limitation :** Ce signal ne contient pas d'information sur la zone dans laquelle
le joueur se trouve quand il ouvre son havre sac.

Monde associé : `monde 9`.

**Note — Havre-Enclos (futur) :** Une refonte appelée "Havre-Enclos" est prévue dans
une prochaine mise à jour (repoussée de la 1.91). Elle ajoutera un monde personnel
à l'intérieur du havre sac. Les patterns de log associés sont inconnus pour l'instant.

#### Identification du propriétaire du havre sac

```
[DIMENSIONAL_BAG_FLEA_CONTENT_MESSAGE] ownerId={charID}
```

Apparaît lors de l'accès aux vitrines du havre sac. `charID` = ID numérique du
propriétaire (peut être différent du joueur actif si le joueur visite le havre sac
d'un autre).

#### Coffre de compte — erreurs de dépôt

```
ERROR [Account chest] Error when stacking items to account chest= ERROR
```

Apparaît quand un dépôt dans le coffre de compte échoue (item non stackable ou espace
plein). Peut se répéter plusieurs fois de suite (une par tentative). **Les dépôts
réussis ne génèrent aucun log** — opération silencieuse.

---

### 2.11 Challenges — Système de défis combat

> *Ajouté après session 2026-03-20*

Les challenges sont des objectifs bonus apparus pendant un combat. Ils sont **uniquement présents dans `wakfu_chat.log`** (pas de section séparée dans `wakfu.log`).

**Patterns confirmés :**
```
[Information (jeu)] Le challenge "Nomade" est réussi.
[Information (jeu)] Le challenge "Déclin" a échoué.
```

**Règle importante :** L'XP bonus des challenges réussis est **incluse dans la ligne XP de combat suivante** — impossible de l'isoler. Il n'existe pas de ligne séparée "vous avez gagné N XP de challenge".

```python
_RE_CHALLENGE_SUCCESS = re.compile(r'\[Information \(jeu\)\] Le challenge "(.+?)" est réussi\.')
_RE_CHALLENGE_FAILED  = re.compile(r'\[Information \(jeu\)\] Le challenge "(.+?)" a échoué\.')
```

**Attention aux accents :** Le nom du challenge peut contenir des caractères accentués. S'assurer que le fichier est lu en UTF-8.

---

### 2.12 Mapping worldId — Zones connues

> *Construit progressivement par corrélation entre `on quitte le monde N` et les contextes observés*

| worldId | Nom | Source de confirmation |
|---------|-----|----------------------|
| 9 | Havre-sac personnel | `PERSONAL_SPACE_ENTER_RESULT_MESSAGE` |
| 527 | Zone farm (herborisme, non nommée précisément) | Observations farming + captcha Capt'chat |
| 862 | Combat Capt'chat (antibot) | `breed : 5314` dans monde 862 |
| 1089 | Bibliothèque de téléportation | `Vous venez d'utiliser : Biblio-téléport` |
| 1135 | Sufokia | Protecteurs 348/349/354 à l'arrivée |
| 1136 | HDV Sufokia | `[bAL id=31546/31547]` |
| 436 | **Inconnu** | Observé session 2026-03-20 (traversée) |
| 437 | **Inconnu** | Observé session 2026-03-20 (traversée) |
| 440 | **Inconnu** | Observé session 2026-03-20 (traversée) |
| 1252 | **Inconnu** | Zone de départ session 2026-03-20 |

**Séquence de navigation observée** (2026-03-20, biblio-téléport vers Sufokia) :
`1252 → 1089 → 436 → 437 → 440 → 437 → 436 → 1089 → 1135`

**Stratégie de nommage :** À chaque nouveau worldId détecté, demander une seule fois au joueur de nommer la zone. Persister dans une DB locale. Une fois nommé, jamais redemandé.

---

### 2.14 Ancres de date dans `wakfu_chat.log`

Le jeu annonce les transitions jour/nuit avec la **date réelle** entre parenthèses :
```
HH:MM:SS,mmm - [Information (jeu)] Il fait nuit, nous sommes le 20 Martalo 977 (20/3/26) et il est 01:47.
HH:MM:SS,mmm - [Information (jeu)] Le jour se lève, nous sommes le 17 Martalo 977 (17/3/26) et il est 00:34.
HH:MM:SS,mmm - [Information (jeu)] Il fait jour, nous sommes le 18 Martalo 977 (18/3/26) et il est 10:37.
HH:MM:SS,mmm - [Information (jeu)] La nuit prend fin, nous sommes le 17 Martalo 977 (17/3/26) et il est 14:24.
```

**Format de la date embarquée :** `(DD/M/YY)` — jour et mois sans zéro, année sur 2 chiffres.

**Fréquence :** Plusieurs fois par heure de jeu (cycle jour/nuit toutes ~20 min de jeu).
Présentes dans toutes les sessions actives. Suffisant pour dater tous les événements sans ambiguïté.

**Utilisation pour dater les logs historiques :**
La dernière ancre de date avant un événement donne sa date réelle. Si l'heure du log recule entre deux lignes consécutives → passage minuit → incrémenter la date d'un jour.

```python
_RE_DATE_ANCHOR = re.compile(
    r'\((\d{1,2})/(\d{1,2})/(\d{2})\)'  # (DD/M/YY) ou (D/M/YY)
)
# Exemple : "(20/3/26)" → jour=20, mois=3, année=2026
```

**Calendrier Wakfu ↔ mois réels :**

| Mois réel | Mois Wakfu | Protecteur |
|-----------|------------|------------|
| Janvier | Javian | Jiva |
| Février | Flovor | Silvosse |
| Mars | Martalo | Ulgurde |
| Avril | Aperirel | Silouate |
| Mai | Maisial | Rosal |
| Juin | Juinssidor | Sumens |
| Juillet | Joullier | Hécate |
| Août | Fraouctor | Pouchecot |
| Septembre | Septange | Raval |
| Octobre | Octolliard | Maïmane |
| Novembre | Novamaire | Brumaire |
| Décembre | Descendre | Djaul |

**Année en jeu :** année réelle − 1049 (ex : 2026 → 977 en Wakfu). La date réelle en parenthèses rend cette conversion inutile en pratique.

---

## 3. wakfu_chat.log — Log chat dédié

### 3.1 Généralités

> *Mis à jour après Journal d'écoute 2 — transféré dans le journal*

- **Chemin :** `gamesLogs/wakfu/logs/wakfu_chat.log`
- **Format :** `{HH:MM:SS,mmm} - {MESSAGE_COMPLET}`
  - Pas de thread ni classe, format épuré
- **Contenu :** Les canaux de chat sociaux et `[Information (jeu)]` uniquement

**⚠️ Correction importante :** `wakfu_chat.log` **ne contient PAS** `[Information (combat)]`.
Les événements de combat (sorts lancés, dégâts, KO) sont **exclusifs à wakfu.log**.
Cette distinction est vérifiée expérimentalement.

**Contenu effectif de wakfu_chat.log :**
- `[Information (jeu)]` — notifications système
- `[Commerce]`, `[Communauté (FR/EN)]`, `[Recrutement (FR/EN)]`
- `[Proximité]`, `[Messages d'erreur]`
- `[Guilde]`, `[Alliance]` (si applicable)

**Avantage sur wakfu.log :** Plus léger, plus facile à parser en temps réel, pas
de bruit des événements système.

**⚠️ Règle critique de source unique (confirmé 2026-03-20) :**
Les événements `[Information (jeu)]` (XP métier, kamas, items ramassés, challenges) apparaissent dans **les deux fichiers** — `wakfu.log` ET `wakfu_chat.log`. Lire les deux pour ces événements provoque des **doublons**. Règle :
- `wakfu_chat.log` → source unique pour tous les événements `[Information (jeu)]` et canaux de chat
- `wakfu.log` → source unique pour `[Information (combat)]`, changements de zone, marqueurs de connexion

### 3.2 Exemples de contenu

```
00:39:23,267 - [Information (jeu)] Vous avez ramassé 20x Jeton Exquis .
00:39:04,796 - [Commerce] Zokle : Sanguinolence III wtb
14:15:32,451 - [Proximité] Maui l'Aïeul : Il n'y a plus assez de monstres dans la zone.
14:20:11,123 - [Messages d'erreur] Conditions d'utilisation non respectées. Consultez la description de l'objet pour plus d'informations.
```

**Recommandation :** Utiliser `wakfu_chat.log` comme source primaire pour le parsing
des canaux de chat et des événements `[Information (jeu)]` en temps réel. `wakfu.log`
reste nécessaire pour les marqueurs de connexion/état et **tous les événements de combat**.

**[Proximité] — Stratégie de détection du clan master (maître de clan) :**

Aucun log direct ne mentionne "maître de clan" ou "clan master". Stratégie retenue par corrélation :
- Le **maître de clan** est un NPC qui parle automatiquement en canal `[Proximité]` à l'arrivée dans sa zone
- Le **premier message `[Proximité]` après un `on quitte le monde N`** dans `wakfu.log` a une haute probabilité d'être le NPC clan master de la zone N
- À confirmer avec plusieurs sessions dans des zones connues (Sufokia, Bonta, Brakmar, etc.)

```python
_RE_PROXIMITY = re.compile(r'\[Proximité\] (.+?) : (.+)')
# group(1) = nom du locuteur, group(2) = message
```

**⚠️ Distinction NPC vs joueur en [Proximité] :** Aucun discriminant syntaxique identifié dans les logs pour l'instant. Les NPC et les joueurs utilisent le même format. L'heuristique "premier message après changement de zone" reste la meilleure approche connue.

---

## 4. wakfu_lua.log — Erreurs scripts

- Contient uniquement des erreurs Lua des quêtes/scénarios
- Exemples : `[LUA] RUNTIME_ERROR (scenario/2250.lua)`, `[LUA] RUNTIME_ERROR (1040.lua)`
- **Exploitabilité :** Faible pour un overlay joueur. Utile uniquement pour debug
  de quêtes ou détection de scripts cassés.

---

## 5. wakfu_animation.log — Animations manquantes

- Erreurs `[Animation] Not found (jar:file:.../N) ANIM_TYPE`
- IDs de NPC/créatures sans animation disponible
- **Exploitabilité :** Nulle pour un overlay. Informatif uniquement.

---

## 6. Fichiers de configuration jeu

### 6.1 `H:/Games/Wakfu/config.properties`

Contient la configuration réseau complète du client :
- URLs des serveurs (dispatcher, game servers nommés, chat)
- Paramètres JVM
- Chemins des assets

**Clés notables :**
```
server.wakfu-ogrest.host=wakfu-ogrest.ankama-games.com
server.wakfu-rubilax.host=wakfu-rubilax.ankama-games.com
chat.server.host=zaap-chat.ankama.com
chat.server.port=6337
haapi.url=https://haapi.ankama.com
```
Ce fichier permet de dresser la **liste exhaustive des serveurs nommés** disponibles
sans avoir à les découvrir via les logs.

### 6.2 `repositories/repositories.json`

```json
{
  "id": "wakfumain",
  "gameUid": "wakfu",
  "gameId": 3,
  "location": "H:\\Games\\Wakfu",
  "version": "6.0_1.91.1.4783.283"
}
```
Contient version installée et chemin d'installation. Utile pour trouver
dynamiquement le chemin du jeu sur une machine inconnue.

---

## 7. Synthèse — Ce qu'on peut déduire à chaque étape

### Avant le lancement du jeu
| Information | Source | Fiabilité |
|------------|--------|-----------|
| Nom de compte Ankama | `clientConfig/{LOGIN}/` | ✅ Très haute |
| Serveurs connus du compte | Sous-dossiers `clientConfig/` | ✅ Haute (peut être obsolète) |
| Personnages par serveur | Sous-sous-dossiers | ⚠️ Peut inclure supprimés |
| Dernier personnage joué | `accountPreferences` → `lastSelectedCharacterName` | ✅ Très haute |
| Version du jeu | `repositories.json` | ✅ Très haute |

### Pendant SELECTING (écran login)
| Information | Source | Fiabilité |
|------------|--------|-----------|
| Fenêtre ouverte | Titre fenêtre = "WAKFU" (sans "- ") | ✅ Très haute |
| Aucun personnage actif | Titre fenêtre sans nom | ✅ Très haute |

### Pendant SERVER_SELECT
| Information | Source | Fiabilité |
|------------|--------|-----------|
| État détecté | `token obtained from zaap` + marqueurs dispatcher | ✅ Très haute |
| Nom du serveur | Non disponible à ce stade | ❌ |

### Pendant CHAR_SELECT
| Information | Source | Fiabilité |
|------------|--------|-----------|
| État détecté | `loading chat file.` | ✅ Très haute |
| Nom du serveur | URL proxy : `wakfu-{NOM}.ankama-games.com:5556` | ✅ Très haute |
| Nombre de personnages | `CharacterInfoManager (0 restants sur N)` | ✅ Très haute |
| Noms des personnages | Non disponible dans les logs | ❌ (via `clientConfig/` en heuristique) |

### Pendant IN_GAME
| Information | Source | Fiabilité |
|------------|--------|-----------|
| Nom du personnage | Titre fenêtre : `{NOM} - Wakfu` | ✅ Très haute |
| Nom du serveur | Via `/whois` : `est connecté sur le serveur {NOM}` | ⚠️ Requiert commande |
| Nom du serveur (persisté) | `_last_server` depuis session précédente | ✅ Haute |
| Sorts lancés | `[Information (combat)] NOM lance le sort SORT` (wakfu.log uniquement) | ✅ Très haute |
| Dégâts (par élément) | `CIBLE: -N PV (ELEMENT)` | ✅ Très haute |
| Heure lancement client | Premier timestamp de `wakfu.log` (fichier réinitialisé à chaque lancement) | ✅ Très haute |
| Heure entrée en jeu | Premier `[Information (jeu/combat)]` dans `wakfu.log` | ✅ Très haute |
| Zone courante | `on quitte le monde {N}` dans `wakfu.log` | ✅ Très haute |
| Position carte | `bZJ initialisé, centré sur (X,Y)` dans `wakfu.log` | ✅ Très haute |
| XP personnage gagnée | `+N points d'XP.` dans `[Information (combat)]` (wakfu.log uniquement) | ✅ Très haute |
| XP métier gagnée | `+N points d'XP.` dans `[Information (jeu)]` (wakfu_chat.log, pas double) | ✅ Très haute |
| Level-up personnage/métier | ` +N niveau.` dans la ligne XP | ✅ Très haute |
| XP restante avant niveau | `Prochain niveau dans : X` dans chaque ligne XP | ✅ Très haute |
| Challenges combat | `Le challenge "X" est réussi/a échoué` dans `[Information (jeu)]` | ✅ Très haute |
| Clan master potentiel | Premier `[Proximité]` après `on quitte le monde` (heuristique) | ⚠️ À confirmer |
| Items ramassés | `Vous avez ramassé Nx ITEM .` | ✅ Très haute |
| Kamas perdus | `Vous avez perdu N kamas.` | ✅ Très haute |
| Kamas gagnés | `Vous avez gagné N kamas.` | ✅ Très haute |
| Ventes HDV (hors-session) | `Vous avez vendu N objets pour M§ pendant votre absence.` | ✅ Très haute |
| Vente instantanée HDV | `perdu item` + `gagné kamas` | ✅ Très haute |
| Mise en vente HDV | `perdu item` + `perdu kamas` | ✅ Très haute |
| Achat HDV | `perdu kamas` + `ramassé item` | ✅ Très haute |
| Prix mis en vente HDV | Non disponible dans les logs | ❌ |
| Chat (Commerce, Prox, etc.) | `[CANAL] JOUEUR : MESSAGE` | ✅ Très haute |
| Liens items dans chat | Double espace autour des noms d'items liés | ✅ Haute |
| Statuts combat | `CIBLE: STATUT (Niv. N)` | ✅ Très haute |
| Classe du personnage | Breed ID dans `[_FL_]` ou inférence via sorts | ✅ Haute |
| Récolte ressources | `occupation collecte bKV@hash` + `ramassé Nx item` | ✅ Très haute |
| Agriculture (planter) | `occupation PLANT` + `perdu bouture` | ✅ Très haute |
| Session HDV ouverte | `occupation MARKET sur la board [bAL id=N]` | ✅ Très haute |
| ~~Vitrine havre sac~~ | ~~`occupation MANAGE_FLEA`~~ | Feature retirée du jeu |
| Ouverture havre sac | `PERSONAL_SPACE_ENTER_RESULT_MESSAGE (success=true)` | ✅ Haute (zone non indiquée) |
| Captcha Capt'chat | `breed : 5314` + `CREATION DU COMBAT` | ✅ Très haute |
| Résultat captcha | `ramassé 40x item` (succès) ou `est KO !` (échec) | ✅ Très haute |
| Apprentissage cosmétique/meuble | `appris l'apparence {item}` | ✅ Très haute |
| Destruction d'objets | `détruit N objet(s) et récupéré N ressource(s)` | ✅ Très haute |

---

## 8. Limitations connues

1. **Heure sans date** : wakfu.log contient bien un timestamp d'heure (`HH:MM:SS,mmm`)
   dans chaque ligne, mais pas la date du jour.

   **Technique de reconstruction de date (fiable) :**
   - Le `mtime` (date de dernière modification) du fichier correspond à la dernière
     ligne écrite. C'est l'**ancre absolue** : `mtime.date` = date de la dernière entrée.
   - En lisant le fichier à rebours, tant que `T(n) <= T(n-1)` les entrées sont dans
     le même jour. Si `T(n) < T(n-1)` (l'heure "régresse"), un passage minuit a eu lieu
     entre ces deux lignes → toutes les entrées avant ce point sont à `mtime.date - 1 jour`.
   - En pratique, une session Wakfu dépasse rarement 12-16h, donc le fichier ne couvre
     au maximum que 2 dates calendaires consécutives.

   ```python
   import os
   from datetime import datetime, timedelta

   def reconstruct_dates(log_path: str) -> list[tuple[datetime, str]]:
       mtime = datetime.fromtimestamp(os.path.getmtime(log_path))
       lines = open(log_path, encoding="utf-8", errors="ignore").readlines()
       # Ancre : la dernière ligne donne la date du jour
       anchor_date = mtime.date()
       result = []
       prev_time = None
       current_date = anchor_date
       for line in reversed(lines):
           m = re.match(r'[A-Z]+ (\d{2}:\d{2}:\d{2},\d+)', line)
           if not m:
               continue
           t = datetime.strptime(m.group(1), "%H:%M:%S,%f").time()
           if prev_time is not None and t > prev_time:
               # Passage de minuit détecté (en remontant) → jour précédent
               current_date -= timedelta(days=1)
           prev_time = t
           result.append((datetime.combine(current_date, t), line))
       return list(reversed(result))
   ```

   **Fiabilité :** Très haute si le fichier n'a pas été touché manuellement après la
   session. Le `mtime` NTFS est mis à jour à chaque écriture par la JVM Wakfu.

2. **Personnages supprimés — détection et attribution** :
   - `clientConfig/` et `characterPreferences-*.properties` ne sont **jamais nettoyés**
     par Wakfu : un personnage supprimé laisse ses fichiers, ce qui rend le filesystem
     inutilisable pour détecter une suppression.
   - La suppression est signalée dans le log par :
     `Tentative de suppression d'un CharacterInfo {ID} inexistant` — ID numérique uniquement.
   - **Attribution nom↔ID :** possible si le personnage a combattu ou reçu un `tp`
     pendant une session où l'overlay tournait (voir §2.7). Si ce n'est jamais arrivé,
     l'ID reste non résolu.

3. **Nom du serveur en SERVER_SELECT** : Pas disponible dans les logs à ce stade.
   On ne sait pas quel serveur est affiché avant que le joueur clique.

4. **Lag de flush** : Java bufferise son I/O. Les dernières lignes du log peuvent
   ne pas être disponibles immédiatement après un événement (délai ~1-3 secondes).

5. **ChatLog vs MainLog** : `wakfu_chat.log` est plus propre pour le chat et les
   événements `[Information (jeu)]`, mais ne contient **ni** les marqueurs de connexion
   **ni** les événements `[Information (combat)]`. Les deux doivent être lus en parallèle.
   **⚠️ Risque de doublons :** Les événements `[Information (jeu)]` apparaissent dans les
   deux fichiers. Ne jamais traiter les deux pour le même type d'événement — utiliser
   `wakfu_chat.log` comme source unique pour `[Information (jeu)]` et `wakfu.log` pour
   `[Information (combat)]` et les marqueurs système.

6. **Personnages sans `clientConfig`** : Un personnage créé mais jamais joué depuis
   l'installation de l'overlay n'aura pas de dossier `clientConfig`.

7. **Prix HDV non disponibles** : Le prix de mise en vente (prix unitaire affiché dans
   l'HDV) n'est jamais loggué. Seuls les frais de commission (kamas perdus à la mise en
   vente) et le montant reçu à la vente sont visibles. Impossible de reconstruire le
   carnet d'ordres depuis les logs.

8. **Valeurs dés captcha non loggées** : Les valeurs des dés du Capt'chat (combinaison
   attendue) ne sont jamais loguées nulle part. L'assistant peut détecter le déclenchement
   et le résultat (succès/échec), mais pas la combinaison elle-même.

9. **PERSONAL_SPACE — faux positifs** : `PERSONAL_SPACE_ENTER_RESULT_MESSAGE` se déclenche
   à chaque ouverture du havre sac, accessible depuis de nombreux endroits dans le jeu.
   Impossible de distinguer l'ouverture "à distance" de l'entrée physique dans la maison
   personnelle depuis ce seul signal.

---

## 9. Opportunités non encore exploitées

> *Mis à jour après Journaux d'écoute 1, 2 et session 2026-03-20*

| Feature potentielle | Source | Complexité |
|--------------------|----|------------|
| Nom du serveur dès CHAR_SELECT | URL proxy dans wakfu.log | Faible |
| Nom de compte Ankama | Dossier `clientConfig/` | Faible |
| Dégâts par élément en temps réel | wakfu.log `[Information (combat)]` | Faible |
| Statuts appliqués en combat | wakfu.log `[Information (combat)]` | Faible |
| Breed ID confirmation (double-check classe) | `[_FL_]` dans wakfu.log | Moyenne |
| Nombre de personnages sur le serveur | `CharacterInfoManager` | Faible |
| Liste des sorts avec critique/normal | `lance le sort ... (Critiques)` | Faible |
| Détection fin de combat précise | `[FIGHT] End fight with id X` | Faible |
| Position XYZ en combat | `{Point3 : (X, Y, Z)}` | Moyenne |
| Parser `config.properties` pour liste serveurs | Fichier statique jeu | Faible |
| Suivi de session HDV (board ouverte/fermée) | `occupation MARKET` start/stop | Faible |
| Taux de succès captcha (par session) | `breed : 5314` + résultat | Faible |
| Suivi XP profession en temps réel | `{Profession} : +N points d'XP` | Faible |
| ~~Suivi vitrines havre sac~~ | ~~`MANAGE_FLEA`~~ | Feature retirée du jeu |
| Détection tentatives d'utilisation échouées | `[Messages d'erreur] Conditions d'utilisation` | Faible |
| Tracking apprentissages cosmétiques/meubles | `appris l'apparence {item}` | Faible |
| Détection ouverture havre sac échouée (zone interdite) | `PERSONAL_SPACE` + `[Messages d'erreur]` | Faible |
| Identification HDV par ville via board ID | `bAL id=N` → mapping villes | Moyenne (nécessite collecte IDs) |
| Identification worldIds inconnus (436, 437, 440, 1252) | `on quitte le monde N` + contexte joueur | Faible (nécessite session active) |
| Confirmation clan master via [Proximité] | Premier msg [Proximité] post zone change | Faible (heuristique à valider) |
| Topologie de navigation (graphe des zones) | Séquences `on quitte le monde N` | Moyenne (accumulation sessions) |
| Protecteurs → mapping zone capitale | `Update de chaos du protecteur {ID}` | Faible (IDs observés : 348/349/354=Sufokia) |
| Board IDs HDV Bonta, Brakmar, Astrub, Kelba, Srambad | `bAL id=N` + localisation | Faible (nécessite visites) |
| Détection ouverture havre sac échouée (zone interdite) | `PERSONAL_SPACE` + `[Messages d'erreur]` | Faible |

---

## 10. Base de données permanente — `wakfu_permanent.db`

> *Ajouté 2026-03-20 session 3*

**Principe directeur :** Ce logiciel est une **time machine Wakfu**. Tout ce qu'on log est gardé pour toujours. Aucun script ne doit redemander une information que la DB connaît déjà.

**DB :** `poc-database/wakfu_permanent.db` (SQLite, WAL mode)

**Schemas appliqués (non-destructifs, CREATE IF NOT EXISTS) :**

| Fichier | Tables | Rôle |
|---------|--------|------|
| `schema-permanent.sql` | `ingest_state`, `raw_log_lines`, `parsed_events` | Ingestion brute des logs (append-only) |
| `schema-data.sql` | `job_levels`, `character_levels`, `xp_events`, `xp_curve_observed`, `captchat_events` | Données structurées (mises à jour en live) |

**Tables clés — `schema-data.sql` :**

| Table | PK | Rôle |
|-------|----|------|
| `job_levels` | `(server, job_name)` | Niveau actuel de chaque métier par serveur — mis à jour à chaque level-up |
| `character_levels` | `(server, character_name)` | Niveau actuel de chaque personnage par serveur |
| `xp_events` | `id` + UNIQUE `(server, source_ts, entity_name, xp_gained, xp_remaining)` | Chaque gain d'XP (personnage ou métier) stocké pour toujours |
| `xp_curve_observed` | `(curve_type, level)` | Valeur XP exacte observée à chaque level-up (crowdsourcée) |
| `captchat_events` | `id` | Apparitions du Capt'chat antibot, avec nombre de récoltes au moment de la détection |

**Helpers partagés :** `poc-conceptscripts/db-helpers.ps1` — fonctions `Invoke-Sql`, `Get-JobLevel`, `Set-JobLevel`, `Add-XpEvent`, etc. Dot-sourcé par tous les scripts.

**Règle d'or — zéro Read-Host si la DB sait :**
1. **Niveau métier** : lu depuis `job_levels` → demandé UNE SEULE FOIS si inconnu → stocké immédiatement
2. **Niveau personnage** : lu depuis `character_levels` → même principe
3. **Serveur** : auto-détecté depuis `wakfu.log` (§2.2.C)
4. **Personnage** : auto-détecté depuis le titre de fenêtre (§1.5)
5. **Historique XP** : scanné depuis les logs → stocké en DB → relu depuis la DB aux runs suivants

---

*Fin du document Grand 1 — Sources de données*
