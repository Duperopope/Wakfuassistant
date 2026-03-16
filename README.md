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

## Arborescence utile
- `src/main.py`: application principale (backend + frontend inline)
- `data/wakfu_tracker.db`: base SQLite
- `data/ankama_cdn/`: exports Ankama (items, itemTypes, jobsItems, resources...)

## Lancement
```bash
python src/main.py
```

Ouvrir ensuite: `http://localhost:5000`

## Variables et chemins
- log Wakfu: `C:\Users\...\AppData\Roaming\zaap\gamesLogs\wakfu\logs\wakfu.log`
- base locale: `data/wakfu_tracker.db`

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

## Notes de conception
- Les logs restent la base de vérité automatique.
- Les corrections UI sont persistées et considérées comme des surcharges utilisateur.
- Certaines métriques combat dépendent du format exact des lignes de log disponibles.
