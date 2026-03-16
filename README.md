# Wakfu Assistant

Companion Wakfu orienté logs: suivi session, inventaire, métiers, HDV et combats.

Le projet reste volontairement conforme à une contrainte simple:
- source légale principale de données = logs du jeu
- corrections manuelles possibles dans l'UI quand les logs ne suffisent pas

## Fonctionnalités

### Dashboard session
- durée de session
- kamas connus = kamas de base + gains logs + ventes HDV + ajustement manuel
- cartes de synthèse (drops, HDV, inventaire)
- activité récente

### Métiers
- édition manuelle niveau/xp/cible via clic droit
- l'édition manuelle est la source de vérité pour le niveau affiché
- courbe XP globale apprise par niveau (`xp_current + xp_remaining`)
- réutilisation de cette courbe pour tous les personnages

### Inventaire
- tableau triable
- filtre texte + filtre de catégorie
- catégories d'objets via tags Ankama (`itemTypes`)
- icônes + infobulles au survol
- corrections persistées: quantité, prix, label, notes, image

### HDV
- offres manuelles vente/achat par objet
- support des attributs impactant le prix: slots de gemmes, sublimations, notes
- vue organisée par catégories d'objets
- tri/filtres dédiés + sections dépliables

### Combats
- onglet dédié
- structure dépliante: combat -> tours -> compétences
- dégâts par tour et par compétence (selon ce que les logs permettent de détecter)

### Sélecteur d'images Ankama
- menu visuel (modal) au lieu d'une saisie URL brute
- recherche dans la librairie d'icônes
- suggestions auto + sélection au clic

## Stack
- Python 3
- Flask (UI web locale + SSE)
- SQLite
- Données Ankama CDN locales (`data/ankama_cdn/*.json`)

## Arborescence
```
src/
  main.py          — point d'entrée (~90 lignes)
  config.py        — chemins, variables d'env, UserConfig
  database.py      — classe Database + schéma SQLite
  item_db.py       — ItemDatabase (chargement CDN/local)
  models.py        — XPCurve, SmartInventory, Session
  parsers.py       — regex log Wakfu + LogWatcher
  api.py           — Flask app, routes, _build_data()
  static/
    style.css      — feuille de styles
    app.js         — interface JavaScript
  templates/
    index.html     — squelette HTML
data/
  ankama_cdn/      — données Ankama exportées (items, types...)
  wakfu_tracker.db — base SQLite (créée automatiquement)
```

## Installation
```bash
pip install -r requirements.txt
```

## Lancement
```bash
python src/main.py
```

Ouvrir ensuite: `http://localhost:5000`

## Configuration (optionnelle)
Copie `.env.example` en `.env` et ajuste les valeurs, ou passe les variables directement :

```bash
# Chemin vers le log Wakfu (détection automatique Windows par défaut)
WAKFU_LOG_PATH="C:\Users\TonNom\AppData\Roaming\zaap\gamesLogs\wakfu\logs\wakfu.log" python src/main.py

# Autre port
WEB_PORT=8080 python src/main.py
```

Variables disponibles :
| Variable | Défaut | Description |
|---|---|---|
| `WAKFU_LOG_PATH` | `~/AppData/Roaming/.../wakfu.log` | Chemin vers le log Wakfu |
| `WEB_PORT` | `5000` | Port du serveur web |
| `PARSE_EXISTING_LOG` | `1` | Lire le log existant au démarrage (0 pour désactiver) |
| `REFRESH_INTERVAL` | `2` | Intervalle SSE en secondes |

## Publication GitHub

### 1) Commit local
```bash
git add src/main.py README.md
git commit -m "Refonte UI: categories, HDV, combats, courbe XP et corrections manuelles"
```

### 2) Vérifier le remote
```bash
git remote -v
```

### 3) Si aucun remote n'existe
```bash
git remote add origin https://github.com/<owner>/<repo>.git
```

### 4) Push
```bash
git push -u origin main
```

## Miroir strict local <-> repo (temps reel)

Pour forcer ton dossier local a etre un miroir exact du remote (aucun fichier en plus, aucun en moins):

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File .\tools\live_mirror.ps1 -RepoPath . -Remote origin -Branch master -IntervalSeconds 2 -ForceReleaseLocks -CleanRetries 6 -RetryDelaySeconds 2
```

Ce mode applique en boucle:
- `git fetch --prune`
- `git reset --hard origin/<branch>`
- `git clean -fdx`

Attention: tous les changements locaux non pushes et les fichiers non trackes seront supprimes.

En cas de fichiers verrouilles sous Windows, active `-ForceReleaseLocks` et augmente `-CleanRetries`.

## Notes de conception
- Les logs restent la base de vérité automatique.
- Les corrections UI sont persistées et considérées comme des surcharges utilisateur.
- Certaines métriques combat dépendent du format exact des lignes de log disponibles.
