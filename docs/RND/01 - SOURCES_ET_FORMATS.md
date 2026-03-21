# Sources de données & Formats de logs — Wakfu Assistant

> Dernière mise à jour : 2026-03-21 — Fusion de : 1-Sources_de_donnees.md + LOG_FORMATS.md

---

## 1. Vue d'ensemble des sources

Wakfu Assistant exploite trois flux de données distincts pour reconstituer l'état de jeu en temps réel :

| Flux | Source | Type | Fiabilité |
|------|--------|------|-----------|
| **Logs texte** | `wakfu.log` + `wakfu_chat.log` | Fichiers texte, rotation ×3 | Très haute — source principale |
| **Agent Netty (Java Spy)** | Bytecode intercepté JVM Wakfu | Payloads proto binaires | Très haute — seule source fiable pour les prix HDV |
| **CDN Ankama** | `haapi.ankama.com` + serveurs HTTP locaux launcher | REST/JSON + WebSocket | Moyenne — données statiques, tokens auth |

**Principe de complémentarité :**
- Les logs texte couvrent les événements en jeu (combat, XP, items, chat, connexion/déconnexion).
- L'agent Netty est la source de vérité pour les transactions HDV avec prix unitaires (`item_ref_id`, `offer_uid`, payloads proto).
- Le CDN/API Ankama fournit les métadonnées (noms d'items, icons, abonnements).

**Règle de source unique pour éviter les doublons :**
- `wakfu_chat.log` → source unique pour `[Information (jeu)]` et canaux de chat
- `wakfu.log` → source unique pour `[Information (combat)]`, changements de zone, marqueurs de connexion
- Les deux fichiers ne doivent jamais être lus en parallèle pour le même type d'événement.

---

## 2. Sources primaires — Logs texte Wakfu

### 2.1 Fichiers et chemins

| Fichier | Chemin (fixe, Windows) | Format de ligne |
|---------|----------------------|-----------------|
| `wakfu.log` | `%APPDATA%\zaap\gamesLogs\wakfu\logs\wakfu.log` | `LEVEL HH:MM:SS,mmm [thread] (class:line) - MESSAGE` |
| `wakfu_chat.log` | `%APPDATA%\zaap\gamesLogs\wakfu\logs\wakfu_chat.log` | `HH:MM:SS,mmm - MESSAGE` |
| `wakfu_journal.log` | `%APPDATA%\zaap\gamesLogs\wakfu\logs\wakfu_lua.log` | Erreurs Lua, peu exploitable |

**Chemin absolu type :** `C:/Users/{USER}/AppData/Roaming/zaap/gamesLogs/wakfu/logs/`

**Rotation :** 3 fichiers max (`.log`, `.log.1`, `.log.2`). Réinitialisé à chaque lancement du client — le premier timestamp = heure de démarrage JVM.

**Arborescence complète des logs disponibles :**
```
%APPDATA%/zaap/gamesLogs/wakfu/logs/
├── wakfu.log                         ← LOG PRINCIPAL (actif, rotation ×3)
├── wakfu_chat.log                    ← Chat + [Information (jeu)] uniquement (plus propre)
├── wakfu_animation.log               ← Erreurs animations (non exploitable overlay)
├── wakfu_camera.log                  ← Mouvements caméra
├── wakfu_fileLoading.log             ← Chargements assets
├── wakfu_lua.log                     ← Erreurs scripts Lua/quêtes
├── wakfu_particles_scripts.log       ← Particules/effets
└── wakfu_theme.log                   ← Thèmes UI
```

### 2.2 Format détaillé de wakfu.log

```
INFO 10:41:40,601 [AWT-EventQueue-0] (ccv:362) - Authentication token received from dispatch server : 166c4a79...
```

- `LEVEL` = `INFO`, `WARN`, `ERROR`, `DEBUG`
- `HH:MM:SS,mmm` = heure sans date (limitation — voir §7)
- `[thread]` = thread Java
- `(class:line)` = classe source
- `MESSAGE` = contenu parsé par les patterns

**Contenu de wakfu.log :**
- Marqueurs de connexion/déconnexion/état
- `[Information (combat)]` — sorts, dégâts, KO (exclusif à wakfu.log)
- `[Information (jeu)]` — items, kamas, XP (aussi dans wakfu_chat.log)
- Toutes les occupations (MARKET, COLLECT, PLANT)
- Traces réseau et infrastructure

### 2.3 Format détaillé de wakfu_chat.log

```
00:39:23,267 - [Information (jeu)] Vous avez ramassé 20x Jeton Exquis .
00:39:04,796 - [Commerce] Zokle : Sanguinolence III wtb
14:15:32,451 - [Proximité] Maui l'Aïeul : Il n'y a plus assez de monstres dans la zone.
```

- Format épuré : pas de thread ni classe
- Contient uniquement les messages de chat et `[Information (jeu)]`
- `[Information (combat)]` est **absent** — confirmé expérimentalement

**Canaux présents :**

| Canal | Description | Présent dans wakfu_chat.log ? |
|-------|-------------|-------------------------------|
| `[Commerce]` | Annonces achat/vente | ✅ |
| `[Communauté (FR)]` / `[Communauté (EN)]` | Discussion générale | ✅ |
| `[Recrutement (FR)]` / `[Recrutement (EN)]` | Recrutement groupe/raid | ✅ |
| `[Proximité]` | Chat local zone visible | ✅ |
| `[Information (jeu)]` | Notifications système jeu | ✅ |
| `[Information (combat)]` | Événements de combat | ❌ **exclusif wakfu.log** |
| `[Messages d'erreur]` | Erreurs d'utilisation | ✅ |
| `[Guilde]`, `[Alliance]` | Si applicable | ✅ |

### 2.4 Cycle de connexion — États et marqueurs

**SELECTING (écran login) :**
| Marqueur | Signification |
|----------|--------------|
| `connect(ENV_VARIABLES)` | Connexion Zaap initiée |
| `token obtained from zaap` | Début d'un nouveau cycle AUTH |
| `Connexion au proxy :wakfu-dispatcher.ankama-games.com:5558` | Connexion au dispatcher |
| `Authentication result 0` | Auth réussie |

**CHAR_SELECT :**
| Marqueur | Signification |
|----------|--------------|
| `Connexion au proxy :wakfu-{NOM_SERVEUR}.ankama-games.com:5556` | Nom du serveur dans l'URL |
| `Loading chat file.` | Écran sélection de personnage actif |
| `Nettoyage des CharacterInfo contenus dans le CharacterInfoManager (0 restants sur N)` | N personnages dans la liste |

**IN_GAME :**
| Marqueur | Signification |
|----------|--------------|
| `on remet la frame world` / `On remet la frame World` | Joueur en jeu |
| `tp {ID} to X, Y` | Spawn — contient l'ID numérique du personnage |
| `on quitte le monde {N}` | Départ de la zone N (direction : zone suivante) |
| `bZJ initialisé, centré sur (X,Y)` | Position carte initialisée |
| `Update de chaos du protecteur {ID}, chaos = {bool}` | Protecteur de nation |

**Déconnexions :**
| Marqueur | Raison |
|----------|--------|
| `Sending DisconnectionMessage to Servers. Reason : {LogOff}` | Déconnexion ESC |
| `Sending DisconnectionMessage to Servers. Reason : {Quit Request From Client}` | Fermeture fenêtre client |
| `Connexion avec le serveur perdue` | Perte réseau |

### 2.5 Ancres de date

Le jeu annonce les transitions jour/nuit avec la **date réelle** entre parenthèses :
```
HH:MM:SS,mmm - [Information (jeu)] Il fait nuit, nous sommes le 20 Martalo 977 (20/3/26) et il est 01:47.
```

Format : `(DD/M/YY)` — jour et mois sans zéro, année sur 2 chiffres.
Fréquence : plusieurs fois par heure (cycle jour/nuit toutes ~20 min de jeu).
Présentes dans `wakfu_chat.log` et `wakfu.log`.

### 2.6 Liens cliquables dans le chat — artéfact double espace

Quand un joueur insère un lien d'item `[Nom item]` dans le chat, les crochets sont supprimés dans le log mais les espaces conservés. Deux items contigus laissent un double espace :
```
[Commerce] Foufy : Espadon de Tal Kasha  Espadon de Tal Kasha  à vendre
```
Règle de détection : un double espace (`  `) entre des mots indique un lien d'item cliquable.

---

## 3. Source secondaire — Agent Netty (Java Spy)

### 3.1 Ce que l'agent capture

L'agent Netty est un Java agent injecté dans la JVM Wakfu via l'option `-javaagent`. Il intercepte les messages Netty (protocole réseau du jeu) au niveau bytecode, avant déchiffrement applicatif.

**Source de vérité HDV actuelle :**
- Fichier de capture : `logs/market_v3_proto.log` (payloads proto bruts)
- Sync vers : `logs/hdv_market.db` (SQLite)
- Tables : `market_observations` (historique dédoublonné) + `market_latest` (état courant par offre)

**Scripts opérationnels :**
| Script | Rôle |
|--------|------|
| `docs/RND/poc-hdv/agent/launch_hdv_v2.bat` | Capture des payloads |
| `docs/RND/poc-hdv/sync_hdv_to_sqlite.ps1` | Sync proto → SQLite |
| `docs/RND/poc-hdv/export_hdv_readable.ps1` | Export lisible |
| `docs/RND/poc-hdv/GUIDE_REPRO_HDV_NON_CODEUR.md` | Guide non-codeur |

### 3.2 Formats de sortie

**Champs clés d'une observation HDV :**
| Champ | Description |
|-------|-------------|
| `offer_uid` | Identifiant unique de l'offre (gros entier int64) — ≠ l'objet |
| `item_ref_id` | ID de l'item (référence catalogue) |
| `price` | Prix unitaire (accessible uniquement via l'agent — jamais dans les logs texte) |
| `quantity` | Quantité de l'offre |
| `seller_id` | ID du vendeur |

**Note critique :** `offer_uid` ≠ `item_ref_id`. L'objet est identifié par `item_ref_id`.

### 3.3 Limites de l'approche

- Les heuristiques basées uniquement sur les logs texte (sans proto) ne sont pas suffisantes pour reconstituer des prix de marché fiables.
- Les interprétations textuelles sans `msgId`/payload ne doivent plus être utilisées comme source principale pour le prix HDV.
- Le prix de mise en vente (prix unitaire affiché HDV) n'est **jamais loggué** dans les logs texte — seul l'agent Netty le capture.

---

## 4. Source tertiaire — CDN Ankama

### 4.1 Endpoints connus

| URL | Type | Données |
|-----|------|---------|
| `https://haapi.ankama.com` | HTTPS REST | API Ankama (auth, abonnements, profil) |
| `zaap-chat.ankama.com:6337` | Serveur chat | Messages de chat en ligne |
| `wakfu-dispatcher.ankama-games.com:5558` | Proxy TCP | Authentification, liste serveurs |
| `wakfu-{NOM}.ankama-games.com:5556` | Proxy TCP | Serveur de jeu (ex: ogrest, rubilax, pandora) |

**Serveurs HTTP locaux du launcher :**
| Port | Type | Rôle |
|------|------|------|
| 26116 | HTTP REST (`[SERVICE]`) | API interne — tokens d'auth (`AuthGetGameTokenRPC`) |
| 26117 | WebSocket text (`[TEXTSOCKETSERVER]`) | Communication temps réel launcher↔jeu |

### 4.2 Découverte du chemin d'installation

Le chemin d'installation du jeu est dans `repositories.json` :
```json
{
  "id": "wakfumain",
  "gameUid": "wakfu",
  "gameId": 3,
  "location": "H:\\Games\\Wakfu",
  "version": "6.0_1.91.1.4783.283"
}
```
Chemin : `%APPDATA%\zaap\repositories\repositories.json`

### 4.3 config.properties — Liste exhaustive des serveurs

Fichier `{INSTALL_JEU}/config.properties` — contient les URLs de tous les serveurs :
```
server.wakfu-ogrest.host=wakfu-ogrest.ankama-games.com
server.wakfu-rubilax.host=wakfu-rubilax.ankama-games.com
chat.server.host=zaap-chat.ankama.com
chat.server.port=6337
haapi.url=https://haapi.ankama.com
```
Permet de dresser la liste exhaustive des serveurs sans les découvrir via les logs.

---

## 5. Patterns regex documentés

> Source de vérité : `src-tauri/src/services/log_parser.rs`
> Les patterns sont testés **dans l'ordre du registre `PATTERNS`** — le premier qui matche gagne.

**Séparateurs de milliers** dans les nombres : espace ordinaire (U+0020), NBSP (U+00A0) ou NNBSP (U+202F) — tous traités par `parse_num` / `parse_num_i64`.

Le parser extrait le `MESSAGE` (après ` - `) avant d'appliquer les patterns.

---

### 5.1 Tableau récapitulatif des 20 patterns

| # | Nom | Source | Regex (simplifiée) | GameEvent produit | Groupes |
|---|-----|--------|--------------------|-------------------|---------|
| 1 | `fighter_join` | MainOnly | `\[_FL_\] fightId=(\d+) (.+?) breed\s*:\s*(\d+) \[([^\]]+)\] isControlledByAI=(\w+)` | `CombatStarted { monster_group: Some(...) }` | 5 |
| 2 | `xp_combat` | MainOnly | `\[Information \(combat\)\] (.+?) : \+([\d\s…]+) points d'XP\.\s+Prochain niveau dans : ([\d\s…]+)\.` | `XpGained { source: Combat }` | 3 |
| 3 | `spell_cast` | MainOnly | `\[Information \(combat\)\] (.+?) lance le sort (.+?)(?:\s+\(Critiques\))?\s*$` | `DamageDealt { element: "caster:sort" }` | 2 |
| 4 | `damage` | MainOnly | `\[Information \(combat\)\] (.+?): ([+-]?\s*[\d\s…]+) PV\s+\(([^)]+)\)` | `DamageDealt` ou `DamageReceived` | 3 |
| 5 | `ko` | MainOnly | `\[Information \(combat\)\] (.+?) est KO\s*!` | `DamageReceived { source: "KO:name" }` | 1 |
| 6 | `combat_start` | MainOnly | `CREATION DU COMBAT` | `CombatStarted { monster_group: None }` | 0 |
| 7 | `combat_end` | MainOnly | `\[FIGHT\] End fight with id (\d+)` | `CombatEnded { victory: true }` | 1 |
| 8 | `server_connect` | MainOnly | `Connexion au proxy\s*:wakfu-([^.]+)\.ankama-games\.com:5556` | `ServerConnected { server }` | 1 |
| 9 | `frame_world` | MainOnly | `[Oo]n remet la frame [Ww]orld` | `CharacterSelected { name: "", server: "" }` | 0 |
| 10 | `disconnect_logoff` | MainOnly | `Sending DisconnectionMessage to Servers\. Reason : \{LogOff\}` | `Disconnected { reason: "LogOff" }` | 0 |
| 11 | `disconnect_quit` | MainOnly | `Sending DisconnectionMessage to Servers\. Reason : \{Quit Request From Client\}` | `Disconnected { reason: "Quit" }` | 0 |
| 12 | `connection_lost` | MainOnly | `Connexion avec le serveur perdue` | `Disconnected { reason: "ConnectionLost" }` | 0 |
| 13 | `kamas_gained` | Both | `Vous avez gagn[ée] ([\d\s…]+) [Kk]amas?` | `KamasGained { source: Unknown }` | 1 |
| 14 | `kamas_spent` | Both | `Vous avez perdu ([\d\s…]+) [Kk]amas?` | `KamasSpent { source: Unknown }` | 1 |
| 15 | `hdv_sold_offline` | Both | `Vous avez vendu (\d+) objets? pour un prix total de ([\d\s…]+)§` | `KamasGained { source: Hdv }` | 2 |
| 16 | `item_gained` | Both | `Vous avez ramasss?[ée] (\d+)x?\s+(.+?)\s*\.` | `HarvestCompleted { profession: "" }` | 2 |
| 17 | `item_lost` | Both | `Vous avez perdu (\d+)x?\s+(.+?)\s*\.` | `HarvestCompleted { resource: "-nom" }` | 2 |
| 18 | `profession_xp` | Both | `(.+?) : \+([\d\s…]+) points d'XP\.\s+Prochain niveau dans : ([\d\s…]+)\.` | `HarvestCompleted { resource: "xp:métier" }` | 3 |
| 19 | `quest_completed` | Both | `Vous avez r[ée]ussi la qu[êe]te (.+?)\.` | `XpGained { amount: 0, source: Quest }` | 1 |
| 20 | `quest_failed` | Both | `Qu[êe]te [ée]chou[ée]e:\s*"(.+?)"` | **(aucun — retourne None)** | 1 |

---

### 5.2 Détail des patterns critiques

**Pattern 1 — `fighter_join` :**
```
\[_FL_\] fightId=(\d+) (.+?) breed\s*:\s*(\d+) \[([^\]]+)\] isControlledByAI=(\w+)
```
Exemples :
```
[_FL_] fightId=1600047387 L'Immortel breed : 4 [3111456] isControlledByAI=false
[_FL_] fightId=1616067187 Divinité Du Sacrifice breed : 11 [5832637] isControlledByAI=false
[_FL_] fightId=1616067517 Capt'chat breed : 5314 [-1776810787728971] isControlledByAI=true
```
Notes : `breed\s*:\s*` tolère un espace variable. Les IDs monstres peuvent être négatifs (int64). Pattern en priorité 1 (regex longue et spécifique → peu de faux positifs).

**Pattern 2 — `xp_combat` :**
```
\[Information \(combat\)\] (.+?) : \+([\d\s\u{00a0}\u{202f}]+) points d'XP\.\s+Prochain niveau dans : ([\d\s\u{00a0}\u{202f}]+)\.
```
Exemples :
```
[Information (combat)] L'Immortel : +15 384 points d'XP.  Prochain niveau dans : 255 833 161.
[Information (combat)] L'Immortel : +54 468 878 points d'XP.  Prochain niveau dans : 182 570 141.
```
Notes : En priorité 2 (avant `profession_xp` en position 18) pour éviter que les noms de personnages ne soient interprétés comme des noms de métiers. Le préfixe `[Information (combat)]` le distingue.

**Pattern 8 — `server_connect` :**
```
Connexion au proxy\s*:wakfu-([^.]+)\.ankama-games\.com:5556
```
Exemples :
```
Connexion au proxy :wakfu-ogrest.ankama-games.com:5556
Connexion au proxy :wakfu-pandora.ankama-games.com:5556
Connexion au proxy :wakfu-rubilax.ankama-games.com:5556
```

**Pattern 13 — `kamas_gained` :**
```
Vous avez gagn[ée] ([\d\s\u{00a0}\u{202f}]+) [Kk]amas?
```
GameEvent : `KamasGained { amount, source: KamasSource::Unknown, raw_line: caps[0] }`

Notes : `[ée]` gère `gagne`/`gagné`. `[Kk]amas?` couvre singulier/pluriel. La source est `Unknown` — aucune contextualisation par le parser seul.

**Pattern 15 — `hdv_sold_offline` :**
```
Vous avez vendu (\d+) objets? pour un prix total de ([\d\s\u{00a0}\u{202f}]+)§
```
Exemple :
```
Vous avez vendu 9 objets pour un prix total de 12 632§ pendant votre absence.
```
Notes : `§` (U+00A7) est le symbole kamas Wakfu dans les messages HDV. Le texte après `§` n'est pas capturé. `raw_line` est construite synthétiquement.

**Pattern 20 — `quest_failed` :**
```
Qu[êe]te [ée]chou[ée]e:\s*"(.+?)"
```
Exemples :
```
Quête échouée: "Compétitif : Stop Chef"
Quête échouée: "Course : Gligli Mania"
Quête échouée: "Solo : Épurage des Champs"
```
Notes : Seul pattern du registre à retourner `None` volontairement. La ligne est reconnue (pas d'`Unrecognized`) mais aucun événement n'est émis. Exclu du test `all_patterns_extract_from_examples` via `skip_none = ["quest_failed"]`.

---

## 6. IDs de référence confirmés

### 6.1 Character IDs (personnages confirmés)

Associés via la méthode `[_FL_]` (fight log, `isControlledByAI=false`) :

| Nom personnage | ID numérique | Serveur | Source confirmation |
|---------------|-------------|---------|---------------------|
| L'Immortel | 3111456 | Ogrest | `[_FL_]` breed=4 |
| Divinité Du Sacrifice | 5832637 | Pandora | `[_FL_]` breed=11 |

### 6.2 World IDs (zones)

Construits progressivement par corrélation `on quitte le monde N` + contexte :

| worldId | Nom | Source de confirmation |
|---------|-----|----------------------|
| 9 | Havre-sac personnel | `PERSONAL_SPACE_ENTER_RESULT_MESSAGE` |
| 527 | Zone farm herborisme | Observations farming + captcha Capt'chat |
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

### 6.3 Breed IDs (classes/espèces)

Observés dans les lignes `[_FL_]` :

| Breed ID | Classe/Espèce | isAI |
|----------|--------------|------|
| 4 | Personnage L'Immortel (Féca ?) | false |
| 5 | Personnage (Capt'chat Divinité) | false |
| 11 | Eliotrope (Divinité Du Sacrifice) | false |
| 5314 | Capt'chat (antibot) | true |

**Note :** La liste complète des breed IDs est disponible dans `config.properties` et les ressources du jeu — les valeurs ci-dessus sont uniquement celles confirmées en session.

### 6.4 Board IDs HDV (comptoirs)

| Board ID | Lieu | Source |
|----------|------|--------|
| 31546 | Sufokia comptoir 1 | `[bAL id=31546]` observé session |
| 31547 | Sufokia comptoir 2 | `[bAL id=31547]` observé session |

**Board IDs manquants :** Bonta, Brakmar, Astrub, Kelba, Srambad — à découvrir lors de prochaines sessions.

### 6.5 Protecteurs de nation

| Protecteur IDs | Nation/Zone | Source |
|---------------|-------------|--------|
| 348, 349, 354 | Sufokia (monde 1135) | Corrélation avec arrivée en zone |

### 6.6 Serveurs connus

| Nom serveur | URL proxy |
|-------------|-----------|
| ogrest | `wakfu-ogrest.ankama-games.com:5556` |
| rubilax | `wakfu-rubilax.ankama-games.com:5556` |
| pandora | `wakfu-pandora.ankama-games.com:5556` |

Liste exhaustive disponible dans `{INSTALL_JEU}/config.properties`.

### 6.7 Server IDs numériques

| lastServerId | Nom serveur |
|-------------|-------------|
| 10 | (valeur observée dans `userPreferences.properties` — serveur exact à confirmer) |

---

## 7. Limites et points d'attention

### 7.1 Limitations structurelles des logs texte

1. **Heure sans date** : `wakfu.log` contient `HH:MM:SS,mmm` mais pas la date du jour. Technique de reconstruction : utiliser le `mtime` NTFS (ancre = dernière ligne écrite) puis remonter en détectant les passages minuit (si `T(n) < T(n-1)` → incrémenter d'un jour). Fiabilité très haute si le fichier n'a pas été touché manuellement.

2. **Lag de flush I/O** : Java bufferise son I/O. Les dernières lignes du log peuvent ne pas être disponibles immédiatement après un événement (délai ~1-3 secondes).

3. **Rotation à chaque lancement** : `wakfu.log` est réinitialisé à chaque démarrage du client Wakfu JVM — impossible de reconstruire un historique multi-sessions depuis le fichier seul (nécessite ingestion continue en DB).

4. **Nom du serveur absent en SERVER_SELECT** : Pas disponible dans les logs avant que le joueur clique sur un serveur.

5. **Noms de personnages non disponibles en CHAR_SELECT** : La liste des personnages affichés dans l'écran de sélection n'est pas loguée — uniquement le compte total. Les noms viennent de `clientConfig/` en heuristique.

### 7.2 Doublons et risques de mauvaise attribution

6. **Doublons [Information (jeu)]** : Les événements `[Information (jeu)]` apparaissent dans `wakfu.log` ET `wakfu_chat.log`. Lire les deux provoque des doublons. Règle : utiliser `wakfu_chat.log` comme source unique pour ces événements.

7. **Discrimination XP personnage vs métier** : Le tag `[Information (combat)]` ne discrimine pas le type d'XP. Un Trappeur utilisant des pièges en combat génère une ligne XP avec `[Information (combat)]`, pas `[Information (jeu)]`. **Discriminant réel : comparer le nom de l'entité avec le titre de fenêtre (`{NOM} - WAKFU`).**

8. **Chevauchement `kamas_spent` / `item_lost`** : Les deux commencent par `Vous avez perdu`. `kamas_spent` (priorité 14) est testé avant `item_lost` (priorité 17) — ils sont mutuellement exclusifs car `kamas_spent` matche `\d+\s+[Kk]amas` et `item_lost` requiert un `x?` suivi d'un nom d'objet.

### 7.3 Informations inaccessibles depuis les logs texte

9. **Prix HDV non disponibles** : Le prix unitaire mis en vente à l'HDV n'est jamais loggué dans les logs texte. Seuls les frais de commission (kamas perdus) et le montant reçu à la vente sont visibles. L'agent Netty est nécessaire pour les prix.

10. **Valeurs dés captcha non loggées** : Les valeurs des dés du Capt'chat (combinaison attendue) ne sont jamais loguées — information purement visuelle.

11. **Nom de compte absent de wakfu.log** : Le nom de compte Ankama n'apparaît jamais dans `wakfu.log`. Se récupère via `clientConfig/{LOGIN}/` ou `userPreferences.properties`.

### 7.4 Faux positifs et cas edge

12. **Personnages supprimés dans clientConfig** : Les dossiers `clientConfig/` et `characterPreferences-*.properties` ne sont jamais nettoyés par Wakfu — un personnage supprimé laisse ses fichiers. Le filesystem est donc inutilisable seul pour détecter les suppressions.

13. **`tp {ID}` non garanti** : La ligne `tp {ID} to X, Y` n'apparaît pas à chaque connexion — absent lors de spawns tutoriels ou changements de carte ordinaires. Méthode principale d'association ID↔Nom : `[_FL_]` en combat.

14. **`victory: true` par défaut** : Le pattern `combat_end` émet toujours `victory: true` — le FSM doit corriger selon les KO observés.

15. **`spell_cast` non lié aux dégâts** : Le lancer de sort et les dégâts sont deux événements distincts dans les logs — impossible d'associer un sort à ses dégâts sans état externe (FSM).

16. **`PERSONAL_SPACE_ENTER_RESULT_MESSAGE` — faux positifs** : Ce signal se déclenche à chaque ouverture du havre sac (depuis n'importe quelle zone). Impossible de distinguer l'ouverture "à distance" de l'entrée physique depuis ce seul signal.

17. **`ChatOnly` non utilisé** : `PatternSource::ChatOnly` est défini dans le code mais aucun pattern du registre ne l'utilise actuellement.

18. **Clan master non identifiable** : Aucun discriminant syntaxique pour distinguer NPC et joueurs en `[Proximité]`. Heuristique retenue : premier message `[Proximité]` après `on quitte le monde N` — à confirmer.

19. **`ramasss?[ée]` — faute de frappe Ankama** : Le pattern `item_gained` tolère `ramasssé` (triple s) observé dans certaines versions du log.

20. **`MANAGE_FLEA` — feature retirée** : L'occupation `MANAGE_FLEA` (vitrines havre sac) peut encore apparaître dans les logs dans certains contextes, mais la feature n'est plus accessible aux joueurs depuis plusieurs mises à jour.
