# Architecture Handoff — Wakfu Assistant

> Document de transfert pour nouvel agent. Contient l'état actuel, l'architecture cible, et la stratégie de migration.

---

## 1. Vue d'ensemble du projet

**Wakfu Assistant** est un overlay gaming natif Python/PyQt5 qui se greffe sur la fenêtre du MMORPG Wakfu (Windows). Il affiche en temps réel des stats de session : XP, kamas, combat, métiers, inventaire, HDV.

- **Stack :** Python 3.10+, PyQt5, pywin32, SQLite
- **Plateforme :** Windows uniquement
- **Source de vérité :** `logs/permanent/all_events.jsonl` (JSONL structuré)
- **Entrée de données :** Parsing incrémental des logs du jeu Wakfu

---

## 2. État actuel du code (post-nettoyage 2026-03-19)

### Arborescence actuelle

```
h:/Code/Wakfuassistant/
├── main.py              # Entry point (131 lignes) — QApplication + LiveUiReloader
├── watcher.py           # Auto-launch overlay quand Wakfu démarre (68 lignes)
├── health_check.py      # Diagnostic environnement (104 lignes)
├── start.bat            # Lanceur Windows
├── README.md / CHANGELOG.md / .gitignore
│
├── core/                # Logique métier (8 fichiers)
│   ├── permanent_journal.py   # 2147 lignes — SOURCE DE VÉRITÉ, parse tous les logs
│   ├── wakfu_tracker.py       # 238 lignes — Détection fenêtre Win32, signaux Qt
│   ├── game_database.py       # 312 lignes — DB items/recettes (JSON thread-safe)
│   ├── item_icons.py          # 290+ lignes — Résolution icônes CDN Ankama
│   ├── kamas_history.py       # 130 lignes — Wrapper kamas → permanent_journal
│   ├── calibration_history.py # 105 lignes — Calibration XP/HP
│   └── database.py            # 8 lignes — Shim compat → game_database
│
├── ui/                  # Interface PyQt5 (14 fichiers Python)
│   ├── window.py         # 2080+ lignes — GOD OBJECT (orchestration, sync, config, UI)
│   ├── titlebar.py       # 452+ lignes — Barre titre custom (drag, pin, fold)
│   ├── theme.py          # 313 lignes — 9 palettes + QSS
│   ├── tabbar.py         # 167 lignes — Navigation onglets
│   ├── onboarding.py     # 171 lignes — Wizard premier lancement
│   ├── xp_styles.py      # 258 lignes — 6 styles de barre XP
│   └── tabs/
│       ├── base.py           # 125 lignes — BaseTab + watermark
│       ├── personnage.py     # 910+ lignes — Fiche personnage
│       ├── metiers.py        # 990+ lignes — Métiers/professions
│       ├── inventaire.py     # 630+ lignes — Grille inventaire
│       ├── hdv.py            # 1250+ lignes — Hôtel de vente
│       ├── transactions.py   # 1400+ lignes — Historique kamas + graphique
│       ├── combat.py         # 429 lignes — Stats combat
│       └── options.py        # 1536+ lignes — Paramètres
│
├── data/                # Données runtime (user-writable)
│   ├── config.json, game_database.json, calibration_entries.json
│   ├── kamas_journal.jsonl, ui_layout.json
│   ├── wakfu_tracker.db (+shm, wal)
│   ├── Recettes.csv
│   ├── ankama_cdn/      # Mirror CDN (items.json 16.7MB, icons, class_icons)
│   └── ankama_official/ # Assets officiels (wakassets 18K+ fichiers)
│
├── tools/               # Utilitaires dev standalone (3 fichiers)
├── scripts/             # Automation PowerShell + Python (7 fichiers)
├── tests/               # 6 fichiers test (pytest)
├── docs/Codebase/ + docs/RND/
├── logs/permanent/ + logs/realtime/ + logs/archives/
└── memory/              # Claude Code auto-memory
```

### Fichiers critiques et leurs responsabilités

#### `core/permanent_journal.py` (2147 lignes) — LE CŒUR

5 responsabilités distinctes à séparer :

| Responsabilité | Lignes approx | Fonctions clés |
|---|---|---|
| **Parsing** | ~400 | `_parse_event()`, 20+ regex patterns, `_parse_num()`, `_parse_local_iso()` |
| **Sync pipeline** | ~400 | `sync_permanent_journal()`, `rebuild_all_events()`, `_emit_event_entry()`, `_read_state()`/`_write_state()` |
| **Migration legacy** | ~300 | `_migrate_kamas_events()`, `_migrate_legacy_log_file()`, `_absorb_external_sources()`, `_cleanup_legacy_files()` |
| **Queries** | ~500 | `query_character_info()`, `query_profession_xp()`, `query_inventory()`, `query_combat_stats()`, `replay_character_xp_since()` |
| **Market** | ~200 | `estimate_market_price()`, `_market_detect()`, `_market_tax_rate()`, `read_permanent_market_deposits()` |

**Constantes critiques :**
- `_JOURNAL_VERSION = 8` — force rebuild si changé
- 20+ regex patterns pour parser les logs FR Wakfu
- `_ALL_EVENTS_LOG` → `logs/permanent/all_events.jsonl`

#### `ui/window.py` (2080+ lignes) — GOD OBJECT à décomposer

5 responsabilités distinctes :

| Responsabilité | Lignes approx | Méthodes clés |
|---|---|---|
| **Window core** | ~600 | `__init__()`, `_build_ui()`, `_start_timer()`, `_tick()`, tab management |
| **Geometry** | ~400 | Resize, drag, `_position()`, `_reorder_above_wakfu()`, `_edge_at()` |
| **Wakfu sync** | ~800 | `_read_wakfu_log_update()`, `_sync_class_from_wakfu_log()`, `_sync_character_info_from_journal()`, `_infer_class_from_spell()` |
| **Config** | ~400 | `_read_config_json()`, `_write_config_json()`, character persistence (name, class, gender, vitals) |
| **Constants** | ~250 | `DEFAULT_W/H`, `EDGE`, `CORNER`, `_BREED_TO_CLASS`, regex patterns |

#### Onglets volumineux à splitter

| Onglet | Lignes | Split proposé |
|---|---|---|
| `transactions.py` | 1400+ | tab.py, chart.py (KamasLineChart), table.py, models.py |
| `options.py` | 1536+ | tab.py, display.py, data.py, widgets.py |
| `hdv.py` | 1250+ | tab.py, pages.py, tooltip.py, widgets.py |

### Pipeline de données

```
Wakfu Game Logs (APPDATA/zaap/gamesLogs/wakfu/logs/)
    ├── wakfu_chat.log      → kamas, items, XP, market
    ├── wakfu.log            → class detection, spells
    └── wakfu_journal.log    → quests, combat, level
         ↓
permanent_journal.py::sync_permanent_journal()
    - Lit incrémentalement (offset sauvé dans recorder_state.json)
    - Parse chaque ligne via _parse_event() (20+ regex)
    - Déduplique via fingerprints (hash stable)
    - Écrit dans all_events.jsonl
         ↓
Query APIs (permanent_journal.py)
    - query_inventory() → {item: qty}
    - query_profession_xp() → {metier: {level, xp}}
    - query_combat_stats() → {spells, kills, damage}
    - replay_character_xp_since() → XP gagné
    - read_permanent_market_deposits() → dépôts HDV
         ↓
window.py::_tick() (QTimer 500ms)
    - Appelle sync_permanent_journal()
    - Met à jour chaque onglet visible
    - Sync position/z-order avec fenêtre Wakfu
```

### Modèle de threading

- **Thread principal :** Boucle Qt, UI, timers
- **permanent_journal.py :** Écritures protégées par `_lock` (threading.Lock)
- **game_database.py :** Écritures protégées par `_lock`
- **item_icons.py :** Thread background download + queue

### Patterns de design existants

1. **Lazy Indexing** — item_icons construit ses index au premier accès
2. **Déduplication par fingerprint** — hash stable pour éviter les doublons
3. **Persistence atomique** — tous les JSON écrits atomiquement
4. **Signal/Slot Qt** — communication découplée (WakfuTracker → Window)
5. **Watermark UI** — illustration partagée peinte sur tous les onglets
6. **Singleton** — ItemIconService, _AnimCtrl, _ItemTooltipPopup

### Chemins critiques dans le code

Tous les fichiers résolvent `_PROJECT_ROOT` via `Path(__file__).resolve().parents[N]` indépendamment. C'est fragile — à centraliser dans `paths.py`.

Chemins référencés dans le code :
- `data/config.json` — 3 fichiers
- `data/ankama_cdn/*` — 6 fichiers
- `data/ankama_official/wakassets/*` — 4 fichiers
- `data/game_database.json` — 2 fichiers
- `logs/permanent/*` — 2 fichiers

---

## 3. Architecture cible

### Vision : MVVM + Services + src/ layout

```
h:/Code/Wakfuassistant/
├── pyproject.toml                    # Dépendances + entry points
├── README.md / CHANGELOG.md
├── start.bat
│
├── src/wakfu_assistant/              # Package Python propre
│   ├── __init__.py                   # __version__
│   ├── __main__.py                   # python -m wakfu_assistant
│   ├── paths.py                      # SOURCE UNIQUE de tous les chemins
│   │
│   ├── core/                         # MODELS (données + logique métier pure)
│   │   ├── journal/                  # permanent_journal.py → 5 modules
│   │   │   ├── __init__.py           # Re-exports API publique
│   │   │   ├── parser.py             # Registre regex versionné + _parse_event
│   │   │   ├── sync.py               # Pipeline sync JSONL
│   │   │   ├── migration.py          # Migration formats legacy
│   │   │   ├── queries.py            # query_*, replay_*
│   │   │   └── market.py             # estimate_market_price, HDV
│   │   ├── models/                   # Modèles de données (NOUVEAU)
│   │   │   ├── session.py            # SessionModel (kamas, XP, durée)
│   │   │   ├── combat.py             # CombatModel (dégâts, sorts)
│   │   │   ├── inventory.py          # InventoryModel (items delta)
│   │   │   ├── profession.py         # ProfessionModel (XP métiers)
│   │   │   └── economy.py            # EconomyModel (HDV, transactions)
│   │   ├── game_database.py
│   │   ├── item_icons.py
│   │   ├── kamas_history.py
│   │   └── calibration_history.py
│   │
│   ├── services/                     # Infrastructure (I/O, Win32, config)
│   │   ├── log_watcher.py            # watchdog + pyqtSignal bridge
│   │   ├── win32_overlay.py          # Win32 API isolée (z-order, click-through)
│   │   ├── config_manager.py         # Config JSON + fusion avec défauts
│   │   └── logger.py                 # RotatingFileHandler structuré
│   │
│   ├── viewmodels/                   # Logique de présentation (NOUVEAU)
│   │   ├── session_vm.py
│   │   ├── combat_vm.py
│   │   ├── inventory_vm.py
│   │   ├── profession_vm.py
│   │   └── economy_vm.py
│   │
│   ├── ui/                           # VIEWS (affichage pur)
│   │   ├── app.py                    # QApplication setup (ex main.py)
│   │   ├── live_reload.py            # Dev hot-reload (ex main.py)
│   │   ├── theme.py
│   │   ├── titlebar.py
│   │   ├── tabbar.py
│   │   ├── onboarding.py
│   │   ├── xp_styles.py
│   │   ├── overlay/                  # window.py → 3-5 modules
│   │   │   ├── window.py             # Shell — assemble, ne calcule rien
│   │   │   ├── geometry.py           # Resize, drag, positionnement
│   │   │   └── constants.py          # Constantes, breeds, regex
│   │   ├── tabs/
│   │   │   ├── base.py
│   │   │   ├── personnage.py
│   │   │   ├── metiers.py
│   │   │   ├── inventaire.py
│   │   │   ├── combat.py
│   │   │   ├── transactions/         # splitté (tab, chart, table, models)
│   │   │   ├── hdv/                  # splitté (tab, pages, tooltip, widgets)
│   │   │   └── options/              # splitté (tab, display, data, widgets)
│   │   ├── widgets/                  # Composants réutilisables (NOUVEAU)
│   │   │   ├── stat_card.py
│   │   │   ├── progress_bar.py
│   │   │   └── collapsible_card.py
│   │   └── assets/                   # Fonts, titlebar, icons
│   │
│   └── watcher.py
│
├── data/                             # User-writable (config, state runtime)
│   ├── config.json
│   ├── game_database.json
│   ├── calibration_entries.json
│   ├── kamas_journal.jsonl
│   └── ui_layout.json
│
├── data_reference/                   # Read-only (CDN, assets Ankama)
│   ├── Recettes.csv
│   ├── ankama_cdn/
│   │   ├── items.json (16.7MB)
│   │   ├── itemTypes.json, jobsItems.json, resources.json
│   │   └── class_icons/
│   ├── ankama_official/
│   │   ├── theme/theme.json
│   │   └── wakassets/
│   └── item_icons/                   # Cache icons téléchargées
│
├── logs/                             # Runtime (gitignored)
│   ├── permanent/                    # all_events.jsonl (source de vérité)
│   ├── realtime/                     # Copies transientes des logs jeu
│   └── archives/
│
├── tools/                            # Dev utilities standalone
├── scripts/                          # Automation (PowerShell)
├── tests/
│   ├── core/ (miroir src)
│   ├── services/
│   └── ui/
└── docs/
    ├── Codebase/
    └── RND/                          # Notes de recherche (important)
```

### Séparation des couches

```
┌─────────────────────────────────────────────────┐
│  UI (Views)     → Affiche, écoute les signaux   │
│                   NE parse PAS, NE calcule PAS   │
├─────────────────────────────────────────────────┤
│  ViewModels     → Transforme Model → View        │
│                   Émet pyqtSignal sur changement │
├─────────────────────────────────────────────────┤
│  Models (Core)  → Données + logique métier       │
│                   Zéro dépendance Qt             │
├─────────────────────────────────────────────────┤
│  Services       → Infrastructure (I/O, Win32,    │
│                   fichiers, config, logging)      │
└─────────────────────────────────────────────────┘
```

### Innovations clés

1. **watchdog** remplace les QTimer de polling pour les logs
2. **Registre regex versionné** avec monitoring de santé (`get_parser_health()`)
3. **Win32 isolé** en service avec signaux propres
4. **paths.py** centralise TOUS les chemins (fin du `Path(__file__).parents[N]` éparpillé)
5. **Logging structuré** avec RotatingFileHandler
6. **pyproject.toml** avec entry points (`wakfu-assistant`, `wakfu-watcher`)

---

## 4. Stratégie de migration

### Phase 1 — Fondations (aucun changement de comportement)

1. Créer `pyproject.toml` avec dépendances
2. Créer `src/wakfu_assistant/__init__.py`, `__main__.py`, `paths.py`
3. Déplacer tous les fichiers source sous `src/wakfu_assistant/`
4. Mettre à jour TOUS les imports
5. Vérifier que les tests passent

### Phase 2 — Services

1. Extraire `services/log_watcher.py` (watchdog)
2. Extraire `services/win32_overlay.py` (depuis wakfu_tracker.py + window.py)
3. Extraire `services/config_manager.py` (depuis window.py)
4. Créer `services/logger.py`

### Phase 3 — Data

1. Séparer `data/` vs `data_reference/`
2. Mettre à jour `paths.py`
3. Déplacer `item_icons/` cache vers `data_reference/`

### Phase 4 — Split core

1. `permanent_journal.py` → `core/journal/` (parser, sync, migration, queries, market)
2. Créer `core/models/` (session, combat, inventory, profession, economy)
3. Supprimer `database.py` (shim compat)

### Phase 5 — Split UI

1. `window.py` → `ui/overlay/` (window, geometry, constants)
2. `transactions.py` → `ui/tabs/transactions/` (tab, chart, table, models)
3. `hdv.py` → `ui/tabs/hdv/` (tab, pages, tooltip, widgets)
4. `options.py` → `ui/tabs/options/` (tab, display, data, widgets)
5. Extraire `ui/widgets/` (composants réutilisables)

### Phase 6 — MVVM

1. Créer ViewModels
2. Rewire tabs → VM → Model
3. Window.py devient un shell de ~200 lignes

**Règle d'or :** Chaque phase est testable et déployable. On ne casse jamais l'app.

---

## 5. Dépendances actuelles (à formaliser dans pyproject.toml)

```
[project]
requires-python = ">=3.10"
dependencies = [
    "PyQt5",
    "pywin32",
]

[project.optional-dependencies]
dev = [
    "pytest",
    "watchdog",
]

[project.scripts]
wakfu-assistant = "wakfu_assistant.__main__:main"
wakfu-watcher = "wakfu_assistant.watcher:main"
wakfu-healthcheck = "wakfu_assistant.health_check:main"
```

---

## 6. Points d'attention

### Ce qui NE DOIT PAS changer
- Le format `all_events.jsonl` (source de vérité)
- Les regex de parsing (20+ patterns battle-tested)
- Le système de fingerprints pour déduplication
- Les noms des fichiers de config (`config.json`, `game_database.json`, etc.)

### Ce qui DOIT changer
- `Path(__file__).parents[N]` éparpillé → `paths.py` centralisé
- God Object `window.py` → décomposition MVVM
- QTimer polling logs → watchdog événementiel
- Pas de requirements.txt → `pyproject.toml`
- Fichiers >1000 lignes → packages avec modules focalisés

### Risques
- **Phase 1 (imports)** : Beaucoup de chemins à mettre à jour simultanément
- **Phase 4 (split journal)** : Le fichier le plus critique, nécessite des tests exhaustifs
- **Phase 6 (MVVM)** : Changement architectural majeur, faire onglet par onglet

---

## 7. Contexte utilisateur

- **Profil :** Dev AI / vibe coding, pas de questions techniques
- **Convention :** Commit avant toute modification, tests obligatoires, CHANGELOG.md à jour
- **Langue :** Code en anglais, UI et docs en français
- **Règle BOOT.md :** L'agent travaille en autonomie, ne pose jamais de question technique à l'utilisateur
