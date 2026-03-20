# poc-conceptscripts — Scripts de concept Wakfu Assistant

*Créé le 2026-03-20 — Refactoring depuis `poc-database/`*

Scripts PowerShell autonomes pour valider les concepts de détection et de collecte.
Chaque script couvre une problématique distincte.
Prérequis commun : `sqlite3` accessible dans le PATH (winget : `winget install sqlite3`).

---

## Scripts

### `live-monitor.ps1` — Moniteur temps réel

Lit les logs Wakfu en live et affiche les events en couleur dans le terminal.
Sources dual : `wakfu_chat.log` (events jeu) + `wakfu.log` (changements de zone).
**Persiste toutes les données dans `monitor_session.db`.**

**Ce qu'il détecte :**

| Event | Source fichier | Table DB |
|---|---|---|
| XP personnage (`[Information (combat)]`) | `wakfu_chat.log` | `xp_events` |
| XP métier (`[Information (jeu)]`) | `wakfu_chat.log` | `xp_events` |
| Level-up + courbe XP | `wakfu_chat.log` | `xp_curve` |
| Kamas gagnés / dépensés | `wakfu_chat.log` | `kamas_events` |
| Challenges (réussi / raté) | `wakfu_chat.log` | `challenges` |
| Quêtes réussies / échouées | `wakfu_chat.log` | — |
| Changement de zone | `wakfu.log` → `on quitte le monde {N}` | `zone_visits` + `worlds` |
| Position carte | `wakfu.log` → `bZJ initialisé, centré sur (X,Y)` | `zone_visits` |
| Messages [Proximité] (clan master potentiel) | `wakfu_chat.log` | `proximity_messages` |

**Détection automatique au démarrage :**
- Personnage actif → `accountPreferences*.properties` → `lastSelectedCharacterName`
- Heure lancement client → premier timestamp de `wakfu.log`
- Heure entrée en jeu → premier `[Information (jeu/combat)]` dans `wakfu.log`

**Persistance inter-sessions :**
- Niveaux de métiers → `job_levels` (jamais redemandés)
- Zones → `worlds` (nommées une fois, jamais redemandées)
- XP de niveau → demandée une fois au startup

**Lancement :**
```powershell
cd "h:\Code\Wakfuassistant\docs\RND\poc-conceptscripts"
.\live-monitor.ps1
# Avec lignes non-reconnues visibles :
.\live-monitor.ps1 -ShowAll
```

**Paramètres :**
```
-PrefsRoot   Chemin preferences Wakfu (défaut : %APPDATA%\zaap\gamesLogs\wakfu\preferences)
-LogsRoot    Chemin logs Wakfu (défaut : %APPDATA%\zaap\gamesLogs\wakfu\logs)
-DbPath      Chemin base de données (défaut : .\monitor_session.db)
-PollMs      Intervalle de polling en ms (défaut : 500)
-ShowAll     Afficher aussi les lignes non-reconnues
```

---

### `collect-logs.ps1` — Collecte incrémentale vers DB permanente

Collecte tous les logs Wakfu dans `wakfu_permanent.db` en mode incrémental (curseur
par fichier, gestion de rotation). Peut tourner en mode watch (FileSystemWatcher).

```powershell
.\collect-logs.ps1              # passe unique
.\collect-logs.ps1 -Mode watch  # surveillance continue
```

---

### `query-db.ps1` — Requêtes sur la DB permanente

Vérifie le contenu de `wakfu_permanent.db` : volumétrie, répartition des events,
dernières lignes ingérées, curseurs d'ingestion, taux de reconnaissance.

```powershell
.\query-db.ps1
```

---

### `xp-estimator.ps1` — Estimateur ETA level-up

Lit `wakfu.log` en live via `Get-Content -Tail 0 -Wait`. Demande le niveau et
kamas au démarrage, puis rafraîchit un dashboard à chaque event XP/kamas.

```powershell
.\xp-estimator.ps1
.\xp-estimator.ps1 -LogPath "chemin\vers\wakfu.log"
```

---

## Schemas SQL

### `schema-session.sql` — DB session monitor

Schéma de `monitor_session.db` (créé automatiquement par `live-monitor.ps1`) :

| Table | Contenu |
|---|---|
| `worlds` | worldId → nom de zone, pré-rempli avec les IDs connus |
| `zone_visits` | Chaque changement de zone avec position (X,Y) |
| `proximity_messages` | Messages [Proximité] = clan master potentiel |
| `sessions` | Config startup de chaque session (perso, niveau, kamas) |
| `xp_events` | Chaque gain XP avec monde courant |
| `xp_curve` | Total XP requis par niveau (enregistré à chaque level-up) |
| `kamas_events` | Chaque mouvement de kamas avec solde estimé |
| `challenges` | Résultat de chaque challenge |
| `job_levels` | Niveaux de métiers persistés entre sessions |

### `schema-logs.sql` — DB logs permanents

Schéma de `wakfu_permanent.db` : `raw_log_lines`, `parsed_events`, `ingest_state`.

---

## Mapping worldId connus

Extrait de la doc RND + observations de session :

| worldId | Zone | Source |
|---|---|---|
| 9 | Havre-sac personnel | `PERSONAL_SPACE_ENTER_RESULT_MESSAGE` |
| 527 | Zone farm (à identifier) | Observations herborisme, captcha |
| 862 | Combat Capt'chat (antibot) | Monde de combat temporaire |
| 1089 | Bibliothèque de téléportation | `Vous venez d'utiliser : Biblio-téléport` |
| 1135 | Sufokia | Protecteurs 348/349/354 |
| 1136 | HDV Sufokia | `[bAL id=31546/31547]` |
| 436, 437, 440 | Inconnus (traversés en session 2026-03-20) | |
| 1252 | Inconnu (zone de départ session 2026-03-20) | |

---

## Notes architecturales importantes

**Duplication wakfu.log / wakfu_chat.log**
Les events `[Information (jeu)]` et `[Information (combat)]` apparaissent dans LES DEUX
fichiers. Ne jamais surveiller les deux pour les mêmes types d'events → doublons.
Règle : `wakfu_chat.log` pour les events jeu, `wakfu.log` pour les changements d'état système.

**Bug PowerShell $Matches**
Chaque `-match` écrase la variable `$Matches`. Sauvegarder les groupes capturés
IMMÉDIATEMENT après le premier `-match` avant tout autre test regex.

**Clan master (maître de clan)**
Pas de log direct identifié. Détecté indirectement via `[Proximité]` channel dans
`wakfu_chat.log`. Premier message `[Proximité]` après un changement de zone = probable
NPC clan master. À confirmer avec plus d'observations.
