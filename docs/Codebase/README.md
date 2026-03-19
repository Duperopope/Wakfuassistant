# Documentation Codebase — WakfuAssistant

Genere : 2026-03-19

## Overview

WakfuAssistant est un overlay PyQt5 pour le jeu Wakfu. Il se greffe a la fenetre du jeu,
surveille son etat, parse les logs et affiche un HUD enrichi (transactions, personnage,
metiers, combat, inventaire, HDV).

## Architecture

```
main.py                 # Point d'entree (QApplication + OverlayWindow)
  ui/window.py          # Fenetre overlay principale
    ui/tabs/            # Onglets UI
    ui/theme.py          # Palette de couleurs et QSS
    ui/titlebar.py      # Barre de titre custom
  core/wakfu_tracker.py # Detection fenetre Wakfu (Win32 API)
  core/permanent_journal.py  # Journal permanent (all_events.jsonl)
  core/kamas_history.py # Historique kamas + corrections manuelles
  core/game_database.py # Base de donnees locale (items, prix HDV)
  core/item_icons.py    # Telechargement icones items (CDN Ankama)
```

## Flux de donnees

```
Wakfu jeu
  -> logs Wakfu (AppData/zaap/gamesLogs/wakfu/logs/)
    -> wakfu.log, wakfu_chat.log, wakfu_journal.log
      -> core/permanent_journal.py (sync_permanent_journal)
        -> all_events.jsonl (journal permanent)
          -> Lecture par ui/tabs/transactions.py (kamas, depots marche)
          -> Lecture par ui/tabs/hdv.py (ventes, prix)
          -> Lecture par ui/tabs/personnage.py (XP, niveau, spells)
          -> Lecture par ui/tabs/metiers.py (professions)
          -> Lecture par ui/tabs/combat.py (statistiques combat)
          -> Lecture par ui/tabs/inventaire.py (inventaire net)

Fenetre Wakfu detectee
  -> ui/window.py (WakfuTracker, polling 200ms)
    -> Signaux : found/lost, geometry_changed, minimized/restored, focus_changed, character_changed
      -> Mise a jour de l'overlay (position, etat du jeu, personnage actif)
```

## Modules core

### permanent_journal.py
- **Role** : Source de verite unique pour tous les evenements de jeu
- **Fichier** : `logs/permanent/all_events.jsonl` (UTF-8)
- **Fonction principale** : `sync_permanent_journal()` — append les nouveaux evenements
- **Fonctions de lecture** :
  - `_iter_all_events(type_filter)` — iterateur sur tous les evenements
  - `read_permanent_kamas_events()` — kamas uniquement
  - `read_permanent_market_deposits()` — depots marche uniquement
  - `query_combat_stats(char_name)` — statistiques combat
  - `query_inventory()` — inventaire net
  - `query_played_time()` — temps de jeu
- **Patterns d'evenements** : kamas_gain/loss, spell_cast, xp_combat/profession,
  level_up, item_gained/lost, market_sold/deposit, chat, login/logout, death, ko, etc.
- **Dependances** : Aucune (logs fichiers uniquement)

### kamas_history.py
- **Role** : Gestion de l'historique kamas avec corrections manuelles
- **Fichier** : `data/kamas_journal.jsonl` (corrections utilisateur)
- **Fonction principale** : `replay_permanent_delta(since_iso)` — calcul du solde kamas
- **Dependances** : `permanent_journal.py` (delegation)

### game_database.py
- **Role** : Base de donnees locale pour les items et prix HDV
- **Fichier** : `data/game_database.json`
- **APIs** :
  - `get_item_settings(name)` / `set_item_settings(name, qty_override, ah_price)`
  - `get_profession_state(name)` / `set_profession_state(name, level, xp)`
  - `rename_item(old_name, new_name)` — renomme un item dans la DB
- **Thread-safe** : Utilise un `Lock()` pour les ecritures

### wakfu_tracker.py
- **Role** : Detection et suivi de la fenetre Wakfu via Win32 API
- **Classe principale** : `WakfuTracker(QObject)` — signale :
  - `found(hwnd)` / `lost()` — fenetre detectee/perdue
  - `geometry_changed(x,y,w,h)` — mouvement/redimensionnement
  - `minimized()` / `restored()` — etat minimise
  - `focus_changed(bool)` — focus premier plan
  - `character_changed(str)` — personnage actif ("" = deconnecte)
- **Polling** : QTimer 200ms
- **Detection personnage** : Parse le titre de fenetre `(.+) - Wakfu$`

### item_icons.py
- **Role** : Telechargement async des icones items depuis le CDN Ankama
- **Cache** : `data/ankama_cdn/item_icons/` (PNG)
- **APIs** :
  - `load_pixmap(gfx_id)` — charge une icone item
  - `get_item_data(item_name)` — retourne les donnees item (nom, rarete, gfxId)
  - `get_type_name(type_id)` — nom du type d'item
  - `get_item_rarity_candidates(rarity)` — items par rarete

## Modules UI

### window.py
- **Role** : Fenetre overlay principale (2685 lignes)
- **Classe** : `OverlayWindow` (QWidget)
- **Responsabilites** :
  - Positionnement relatif a la fenetre Wakfu
  - TabBar avec 7 onglets
  - Barre de titre custom (drag, resize, close)
  - Timer de sync periodique (classe, personnage, journal)
- **Etat capture** :
  - Position/taille fenetre Wakfu
  - Character name
  - Server name
  - Time sync (NTP offset)
- **Signaux vers tabs** : via les widgets enfants

### tabs/transactions.py
- **Role** : Historique kamas avec solde courant et corrections manuelles
- **Fonctionnalites** :
  - Solde courant calcule depuis all_events.jsonl
  - Corrections manuelles (ajout/soustraction manuelle)
  - Depots marche (taxes, prix估算)
  - Export CSV
- **Classe** : `TransactionsTab` (BaseTab)

### tabs/hdv.py
- **Role** : Suivi des prix HDV et estimations de vente
- **Sous-onglets** : Overview / Mes ventes / Mes achats / Offres de vente / Offres d'achat
- **Fonctions** :
  - Calcul du prix unitaire depuis la taxe de depot
  - `estimate_market_price(tax, qty, days, territory_pct)` — fourchettes de prix
  - Telechargement des offres depuis `data/market_offers.json`

### tabs/personnage.py
- **Role** : Informations personnage (niveau, XP, breed, server, account)
- **Source** : all_events.jsonl + interface_state_runtime_v*.json
- **Classe** : `PersonnageTab` (BaseTab)

### tabs/metiers.py
- **Role** : Suivi des metiers et de l'XP par profession
- **Source** : all_events.jsonl (xp_profession events)
- **Classe** : `MetiersTab` (BaseTab)

### tabs/combat.py
- **Role** : Statistiques de combat
- **Source** : all_events.jsonl (spell_cast, hp_loss, ko, death, xp_combat)
- **Classe** : `CombatTab` (BaseTab)

### tabs/inventaire.py
- **Role** : Inventaire net (gagne - perdu)
- **Source** : all_events.jsonl (item_gained, item_lost)
- **Classe** : `InventaireTab` (BaseTab)

### tabs/options.py
- **Role** : Parametres de l'overlay (position, taille, opacite, shortcuts)
- **Classe** : `OptionsTab` (BaseTab)

## Fichiers de donnees

| Fichier | Role | Format |
|---------|------|--------|
| `data/config.json` | Configuration UI | JSON |
| `data/game_database.json` | Items, prix, etat professions | JSON |
| `data/kamas_journal.jsonl` | Corrections kamas manuelles | JSONL |
| `data/calibration_entries.json` | Points de calibration overlay | JSON |
| `data/market_offers.json` | Offres HDV (telecharge) | JSON |
| `logs/permanent/all_events.jsonl` | Journal de tous les evenements | JSONL |
| `logs/permanent/all_events.log` | Journal lisible | TXT |
| `logs/permanent/recorder_state.json` | Position de sync | JSON |
| `data/ankama_cdn/item_icons/*.png` | Icones items | PNG |
| `data/ankama_cdn/items.json` | Catalogue items Ankama | JSON |
| `data/ankama_cdn/jobsItems.json` | Items par metier | JSON |
| `data/ankama_cdn/resources.json` | Ressources | JSON |

## Configuration

- **Position overlay** : `data/calibration_entries.json` (points de calibration)
- **Interface** : `data/config.json`
  - `window_x`, `window_y`, `window_w`, `window_h` — geometrie
  - `attach` — attache a la fenetre de jeu
  - `opacity` — opacite
  - `shortcuts` — raccourcis clavier
  - `market_default_days` — delai de depot marche
  - `market_territory_rate` — taux de taxe territoire

## Tests

```bash
python -m pytest tests/ -v
```

7 tests actuellement :
- `test_calibration_history.py` — 2 tests
- `test_game_database.py` — 2 tests
- `test_item_icons.py` — 1 test
- `test_kamas_history.py` — 1 test
- `test_permanent_journal.py` — 1 test

## Health Check

```bash
python health_check.py
```

Verifie : Python >= 3.10, imports PyQt5/win32gui, dossiers data/core, config.json,
journal permanent (optionnel), syntaxe Python.

## Build (PyInstaller)

- `WakfuAssistant.spec` — spec pour le build principal
- `clawopencodepanel.spec` — spec pour le panel de controle

Sorties : `dist/WakfuAssistant/`
