# PoC Base de donnees - Wakfu Overlay v2

Ce PoC valide le pipeline minimal suivant :

logs texte -> regex parsing -> insertion SQLite -> requetes de verification

Il est volontairement simple et autonome (PowerShell + sqlite3.exe).

## Contenu du dossier

- `schema.sql` : schema de la table `game_events`
- `parse-logs.ps1` : lit un fichier log, detecte 4 types d'evenements, insere en base
- `query-check.ps1` : execute les requetes de controle
- `sample-logs.txt` : echantillon de lignes plausibles pour test rapide
- `wakfu_poc.db` : base generee a l'execution
- `sqlite3.exe` : binaire a deposer manuellement dans ce dossier

## 3 etapes pour lancer

1. Telecharger `sqlite3.exe` (version Windows) puis le placer dans ce dossier.
2. Lancer le parsing :

```powershell
pwsh -File .\parse-logs.ps1
```

Option pour parser un autre fichier (exemple `wakfu_chat.log`) :

```powershell
pwsh -File .\parse-logs.ps1 -LogPath "C:\Users\<user>\AppData\Roaming\zaap\gamesLogs\wakfu\logs\wakfu_chat.log"
```

3. Lancer les requetes de verification :

```powershell
pwsh -File .\query-check.ps1
```

## Evenements detectes dans ce PoC

- `kamas_gained` : `Vous avez gagne N kama(s).`
- `kamas_spent` : `Vous avez perdu N kama(s).`
- `xp_gained` : `... : +N points d'XP.`
- `combat_ended` : `[FIGHT] End fight with id X` (heuristique PoC avec `victory=true`)

Les autres lignes sont inserees avec `event_type = unrecognized` pour garder la trace brute.

## Note importante sur les logs

Le fichier `sample-logs.txt` contient des lignes plausibles et anonymisees.
Pour un test reel, remplace ce contenu par de vraies traces.
D'apres la R&D actuelle, plusieurs events combat sont surtout visibles dans `wakfu.log`, alors que `wakfu_chat.log` est plus propre pour economie/chat.

## Base permanente sur les logs reels Wakfu

Le dossier contient aussi une version "collecte continue" pour centraliser les vrais logs de `%APPDATA%` dans une base unique, meme si Ankama tronque/rotate les fichiers.

Fichiers ajoutes :

- `schema-permanent.sql` : schema des tables de collecte (`raw_log_lines`, `parsed_events`, `ingest_state`)
- `collect-wakfu-logs.ps1` : collecte incrementale depuis `%APPDATA%/zaap/gamesLogs/wakfu/logs/`
- `query-permanent.ps1` : controles et stats de la base permanente

### Lancer la collecte reelle

1. Placer `sqlite3.exe` dans ce dossier.
2. Lancer une passe unique :

```powershell
pwsh -File .\collect-wakfu-logs.ps1
```

3. Lancer en continu en mode evenementiel (recommande pour ne rien perdre) :

```powershell
pwsh -File .\collect-wakfu-logs.ps1 -Mode watch
```

4. Verifier la base :

```powershell
pwsh -File .\query-permanent.ps1
```

Par defaut, la collecte suit `wakfu.log`, `wakfu_chat.log` et `wakfu_journal.log` dans `%APPDATA%`.
Tu peux surcharger le dossier source avec `-LogsRoot` et la liste des fichiers avec `-LogFiles`.

Optimisations incluses :

- Surveillance par evenement de fichier (`FileSystemWatcher`) avec debounce
- Parsing parallele sur plusieurs coeurs (`-WorkerCount`, auto par defaut)
- Ecriture SQLite en batch transactionnel (`WAL`, `busy_timeout`)

Exemple tuning CPU :

```powershell
pwsh -File .\collect-wakfu-logs.ps1 -Mode watch -WorkerCount 12 -DebounceMs 150
```
