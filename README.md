# Wakfu Assistant

Overlay PyQt5 pour le MMORPG **Wakfu** (Windows). Se colle à la fenêtre du jeu et lit les logs en temps réel pour afficher des statistiques de session.

## Fonctionnalités

| Onglet | Contenu |
|---|---|
| **Personnage** | Niveau, XP, temps joué, taux XP/h, temps avant prochain niveau, analyse combat (sorts, dégâts subis, combos) |
| **Métiers** | XP et progression par métier |
| **Inventaire** | Suivi net des objets gagnés/perdus |
| **HDV** | Dépôts en hôtel des ventes |
| **Transactions** | Historique et graphique des kamas, gains/pertes, taxes |
| **Options** | Calibration XP/HP, paramètres affichage, données session |

## Stack

- Python 3.10+
- PyQt5
- SQLite (`wakfu_tracker.db`)
- `win32gui` / `win32con` — attachement à la fenêtre Wakfu (Windows uniquement)

## Lancer

```bat
start.bat
```

Ou directement :

```bash
python main.py
```

## Architecture

```
core/
  permanent_journal.py   # Source de vérité unique : all_events.jsonl
  wakfu_tracker.py       # Détection fenêtre Wakfu, état connexion
  kamas_history.py       # Reconstruction historique kamas
  game_database.py       # Paramètres items/métiers persistés

ui/
  window.py              # Fenêtre overlay principale, parsing logs, timer
  tabbar.py              # Barre d'onglets
  tabs/
    personnage.py        # Onglet personnage
    metiers.py           # Onglet métiers
    inventaire.py        # Onglet inventaire
    hdv.py               # Onglet HDV
    transactions.py      # Onglet transactions/kamas
    options.py           # Onglet options/calibration

data/
  config.json            # Config persistante (vitals par personnage, calibrations)
  calibration_entries.json

logs/
  permanent/
    all_events.jsonl     # Journal principal (JSONL, toutes les captures)
    all_events.log       # Companion lisible humain
    recorder_state.json  # État du lecteur (positions, fingerprints)
```

## Logique de données

Les métriques de session (XP, kamas, temps joué) suivent le même principe :

1. **Ancre** — une valeur de vérité lue depuis les logs ou saisie manuellement dans le widget Calibration
2. **Delta** — le temps réel écoulé depuis l'ancre est ajouté en continu
3. **Persistance** — l'ancre est sauvegardée dans `config.json` et rechargée au démarrage

## Notes

- Windows uniquement (dépendance `win32gui`)
- Les fichiers `logs/`, `data/config.json`, et `data/wakfu_tracker.db` sont ignorés par git
- La langue de l'interface et des logs est le français (Wakfu FR)
