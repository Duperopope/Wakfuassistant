# Wakfu Assistant - Proof of Concept

Outil companion pour Wakfu qui parse le log du jeu en temps réel.

## Features (PoC Terminal)
- **XP Tracker** : XP/h par metier, progression, level ups
- **Kamas Tracker** : gains/h, kamas de base editables
- **Drop Tracker** : items ramasses avec quantites
- **Craft Tracker** : recettes reussies
- **Inventaire** : gestion inventaire/coffre/hdv manuelle
- **Prix HDV** : saisie manuelle des prix, historique
- **Mouvements** : suivi des deplacements d items entre inventaire/coffre/hdv/craft
- **Base items Ankama** : 8324 items du CDN officiel avec recherche et icones
- **SQLite** : toutes les donnees persistees

## Log Source
`C:\Users\...\AppData\Roaming\zaap\gamesLogs\wakfu\logs\wakfu.log`

## Format des lignes parsees
`[Information (jeu)] Herboriste : +261 points d'XP.  Prochain niveau dans : 14 454.`
`[Information (jeu)] Vous avez gagne 243 kamas.`
`[Information (jeu)] Vous avez ramasse 5x Eter .`
`[Information (jeu)] Vous avez reussi votre recette de Essence Exquise.`

## Stack
- Python 3
- SQLite
- Donnees Ankama CDN (items.json, recipes.json, etc.)
- Icons : https://vertylo.github.io/wakassets/items/{id}.png

## Usage
`python src/main.py`

## Roadmap
- [ ] Overlay transparent par-dessus Wakfu
- [ ] Icones des items
- [ ] Graphiques XP/kamas dans le temps
- [ ] Calcul de rentabilite farm auto
- [ ] Alertes prix HDV
