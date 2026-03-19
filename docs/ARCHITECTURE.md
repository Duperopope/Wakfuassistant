# Architecture — Wakfu Overlay v2

> Documentation de référence de l'architecture technique. Ce document décrit la stack, la structure, le pipeline de données, et les conventions du projet.

---

## 1. Stack technologique

### 1.1 Vue d'ensemble

```
┌─────────────────────────────────────────────────────────┐
│                    DISTRIBUTION                          │
│          Tauri v2 bundle (~5-10 MB installeur)           │
├────────────────────┬────────────────────────────────────┤
│    FRONTEND (UI)   │         BACKEND (Core)             │
│                    │                                     │
│  SolidJS + Vite    │    Rust (Tauri backend)             │
│  TailwindCSS       │                                     │
│  TypeScript        │  ┌─ log_watcher (notify-rs)        │
│                    │  ├─ log_parser (regex crate)        │
│                    │  ├─ state_machine (enum FSM)       │
│                    │  ├─ database (rusqlite + WAL)      │
│                    │  ├─ cdn_proxy (reqwest + cache)    │
│                    │  ├─ win32_overlay (windows crate)  │
│                    │  └─ community_sync (reqwest)       │
│                    │                                     │
│                    │  IPC : Tauri Commands + Events      │
├────────────────────┴────────────────────────────────────┤
│                 SERVEUR COMMUNAUTAIRE                     │
│            Axum (Rust) + PostgreSQL                       │
│            Hébergement : Render.com                       │
└─────────────────────────────────────────────────────────┘
```

### 1.2 Choix technologiques

| Composant | Technologie | Justification |
|---|---|---|
| Framework desktop | Tauri v2 | Installeur 5-10 MB, RAM ~30-50 MB, cold start < 1s, WebView native |
| Backend | Rust | 50-230x plus rapide que Python pour le parsing de logs |
| Frontend | SolidJS | 70% plus rapide que React, bundles < 20 KB, pas de Virtual DOM |
| Styles | TailwindCSS | Utility-first, theming gaming, bundle CSS minimal |
| File watching | notify-rs | ReadDirectoryChangesW natif sur Windows |
| Base locale | rusqlite | SQLite WAL, zero-config, lecture/écriture concurrente |
| Overlay Win32 | windows crate | API Win32 natives (WS_EX_LAYERED, WS_EX_TRANSPARENT) |
| Serveur API | Axum | 9740 rps vs 305 (FastAPI), latence p99 1.4 ms |

---

## 2. Structure du projet

```
wakfu-overlay-v2/
├── src-tauri/                      # Backend Rust (Tauri)
│   ├── Cargo.toml
│   ├── tauri.conf.json
│   ├── capabilities/
│   │   └── main.json               # Permissions fenêtre, overlay
│   ├── src/
│   │   ├── main.rs                  # Point d'entrée Tauri
│   │   ├── commands/                # Commandes IPC exposées au frontend
│   │   │   ├── mod.rs
│   │   │   ├── session.rs           # get_session, get_kamas, get_xp...
│   │   │   ├── combat.rs            # get_combat_stats, get_current_fight...
│   │   │   ├── economy.rs           # get_transactions, get_hdv_prices...
│   │   │   ├── professions.rs       # get_profession_xp, get_harvests...
│   │   │   ├── overlay.rs           # toggle_click_through, set_opacity...
│   │   │   └── settings.rs          # get_config, save_config...
│   │   ├── services/
│   │   │   ├── mod.rs
│   │   │   ├── log_watcher.rs       # notify-rs, détection rotation
│   │   │   ├── log_parser.rs        # Regex versionné, registre de patterns
│   │   │   ├── state_machine.rs     # FSM : OFFLINE → IN_GAME
│   │   │   ├── win32_overlay.rs     # Attachement fenêtre Wakfu
│   │   │   ├── database.rs          # rusqlite, migrations, requêtes
│   │   │   ├── cdn_cache.rs         # Proxy CDN Ankama, cache items
│   │   │   ├── community_sync.rs    # Upload anonyme vers serveur
│   │   │   └── persistence.rs       # Config utilisateur JSON
│   │   ├── models/
│   │   │   ├── mod.rs
│   │   │   ├── game_event.rs        # Enum typé de tous les événements
│   │   │   ├── session.rs           # SessionState, KamasTracker
│   │   │   ├── combat.rs            # CombatRecord, FightStats
│   │   │   ├── profession.rs        # ProfessionXP, HarvestEvent
│   │   │   └── economy.rs           # Transaction, HDVListing
│   │   ├── utils/
│   │   │   ├── mod.rs
│   │   │   ├── logger.rs            # tracing + tracing-appender (rotatif)
│   │   │   ├── paths.rs             # Chemins AppData, logs Wakfu
│   │   │   └── constants.rs         # Versions, URLs CDN
│   │   └── migrations/
│   │       ├── 001_initial.sql
│   │       └── 002_economy.sql
│   └── icons/
├── src/                             # Frontend SolidJS
│   ├── index.html
│   ├── App.tsx
│   ├── main.tsx
│   ├── styles/
│   │   └── globals.css              # TailwindCSS base
│   ├── components/
│   │   ├── Layout/
│   │   │   ├── Titlebar.tsx         # Barre titre custom draggable
│   │   │   ├── TabBar.tsx           # Navigation onglets
│   │   │   └── Overlay.tsx          # Container overlay principal
│   │   ├── tabs/
│   │   │   ├── CharacterTab.tsx     # XP, niveau, kamas
│   │   │   ├── InventoryTab.tsx     # Items, loot
│   │   │   ├── CombatTab.tsx        # Stats combat temps réel
│   │   │   ├── ProfessionsTab.tsx   # Progression métiers
│   │   │   ├── EconomyTab.tsx       # Transactions, HDV
│   │   │   └── SettingsTab.tsx      # Thème, opacité, calibration
│   │   └── shared/
│   │       ├── StatCard.tsx
│   │       ├── ProgressBar.tsx
│   │       └── DataTable.tsx
│   ├── stores/                       # Signaux SolidJS (state management)
│   │   ├── sessionStore.ts
│   │   ├── combatStore.ts
│   │   ├── economyStore.ts
│   │   └── settingsStore.ts
│   ├── lib/
│   │   ├── tauri.ts                  # Wrappers typés pour invoke()
│   │   └── events.ts                 # Listeners événements Tauri
│   └── types/
│       └── index.ts                  # Types TypeScript partagés
├── package.json
├── vite.config.ts
├── tailwind.config.js
├── tsconfig.json
└── README.md
```

---

## 3. Pipeline de données

```
[Fichier wakfu.log / wakfu_chat.log]
        │
        ▼
  ┌──────────────┐     notify-rs (ReadDirectoryChangesW)
  │ log_watcher  │────► Détecte modification → lit nouvelles lignes
  └──────┬───────┘     Gère rotation de fichier
         │
         ▼
  ┌──────────────┐     Regex versionné, patterns centralisés
  │ log_parser   │────► Parse chaque ligne → GameEvent typé
  └──────┬───────┘     Compteur de santé : % lignes reconnues
         │
         ▼
  ┌───────────────┐    Transitions : OFFLINE → CHAR_SELECT → IN_GAME
  │ state_machine │────► Met à jour l'état de session
  └──────┬────────┘    Détecte connexion/déconnexion/changement perso
         │
         ├──────────────────────────────┐
         ▼                              ▼
  ┌──────────────┐              ┌──────────────┐
  │   database   │              │ Tauri Events │
  │  (rusqlite)  │              │  → Frontend  │
  └──────────────┘              └──────────────┘
   INSERT GameEvent              emit("game-event", payload)
   UPDATE session stats          emit("session-update", stats)
                                 emit("combat-update", fight)
```

### 3.1 Sources de logs Wakfu

Les logs du jeu se trouvent dans le répertoire Zaap :
`%APPDATA%/zaap/gamesLogs/wakfu/logs/`

| Fichier | Contenu | Événements extraits |
|---|---|---|
| `wakfu_chat.log` | Chat, économie, combat | Kamas, items, XP, transactions HDV |
| `wakfu.log` | État technique du jeu | Détection classe, sorts, connexion |
| `wakfu_journal.log` | Journal de jeu | Quêtes, combats, niveaux |

Les patterns de parsing sont documentés en détail dans `docs/RND/`.

---

## 4. Modèle de données

### 4.1 GameEvent (Rust)

Chaque ligne de log parsée devient un `GameEvent` typé. C'est le type central du système.

```rust
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(tag = "kind")]
pub enum GameEvent {
    // Économie
    KamasGained { amount: i64, source: KamasSource, raw_line: String },
    KamasSpent { amount: i64, source: KamasSource, raw_line: String },

    // Combat
    CombatStarted { monster_group: Option<String> },
    CombatEnded { victory: bool, duration_secs: Option<u32> },
    DamageDealt { target: String, amount: u32, element: Option<String> },
    DamageReceived { source: String, amount: u32 },
    XpGained { amount: u64, source: XpSource },

    // Métiers
    HarvestCompleted { resource: String, profession: String, quantity: u32 },
    CraftCompleted { item: String, profession: String },
    ProfessionLevelUp { profession: String, new_level: u32 },

    // Session
    CharacterSelected { name: String, server: String },
    ServerConnected { server: String },
    Disconnected { reason: Option<String> },

    // Diagnostics
    Unrecognized { raw_line: String },
}
```

### 4.2 Base de données locale (SQLite WAL)

Tables principales :

| Table | Rôle |
|---|---|
| `game_sessions` | Sessions de jeu (personnage, serveur, durée, stats agrégées) |
| `game_events` | Événements horodatés (JSON sérialisé, indexés par session/type) |
| `economy_snapshots` | Historique balance kamas |
| `profession_progress` | Progression métiers par personnage |
| `cdn_items_cache` | Cache des données items CDN Ankama |

Pragmas SQLite optimisés pour un overlay gaming :
- `journal_mode = WAL` — lecture/écriture concurrente
- `synchronous = NORMAL` — compromis perf/sécurité
- `cache_size = -20000` — 20 MB de cache

---

## 5. IPC Frontend ↔ Backend

### 5.1 Tauri Commands (requête/réponse)

Le frontend appelle le backend Rust via `invoke()` :

```typescript
const stats = await invoke<SessionStats>("get_session_stats");
const health = await invoke<number>("get_parser_health");
```

### 5.2 Tauri Events (push temps réel)

Le backend pousse les données vers le frontend via `emit()` :

| Événement | Payload | Fréquence |
|---|---|---|
| `game-events` | `GameEvent[]` | À chaque batch de nouvelles lignes |
| `session-update` | `SessionStats` | Après chaque événement significatif |
| `combat-update` | `FightStats` | Pendant les combats |
| `wakfu-connected` | `boolean` | Quand la fenêtre Wakfu apparaît/disparaît |
| `parser-health` | `number` | Périodiquement |

---

## 6. Overlay Win32

L'overlay utilise les API Win32 natives via le crate `windows` :

- **Détection fenêtre** : `FindWindowW` avec titre "WAKFU"
- **Suivi position** : `GetWindowRect` à 1 Hz
- **Click-through** : `WS_EX_LAYERED | WS_EX_TRANSPARENT` via `SetWindowLongPtrW`
- **Always-on-top** : géré par Tauri (`alwaysOnTop: true`)
- **Transparence** : géré par Tauri (`transparent: true`, `decorations: false`)

Stubs fournis pour les plateformes non-Windows.

---

## 7. Serveur communautaire

Stack : **Axum (Rust) + PostgreSQL** sur Render.com.

### Endpoints

| Méthode | Route | Rôle |
|---|---|---|
| POST | `/api/v1/contribute` | Upload anonyme de stats agrégées |
| GET | `/api/v1/economy/stats` | Stats économiques communautaires |
| GET | `/api/v1/stats/global` | Stats globales agrégées |
| GET | `/api/v1/items/:id` | Proxy CDN Ankama avec cache |

Le serveur n'est pas dans le chemin critique — l'overlay fonctionne à 100% hors-ligne. La contribution est opt-in.

---

## 8. Phases de développement

| Phase | Semaines | Objectif | Livrables clés |
|---|---|---|---|
| 1. Fondations | 1-2 | Projet bootable | Scaffold Tauri+SolidJS, paths.rs, logger.rs, database.rs |
| 2. Pipeline | 3-5 | Logs parsés en temps réel | log_watcher.rs, log_parser.rs, state_machine.rs |
| 3. Overlay | 6 | Suivi fenêtre Wakfu | win32_overlay.rs, click-through, polling position |
| 4. UI | 7-10 | 6 onglets fonctionnels | Tous les tabs SolidJS connectés aux stores |
| 5. CDN | 11 | Items enrichis | cdn_cache.rs, noms français des items |
| 6. Serveur | 12-14 | Contribution communautaire | Axum API, community_sync.rs, opt-in |
| 7. Polish | 15-16 | Release publique | NSIS installeur, auto-update, onboarding |

---

## 9. Héritage du prototype v1

Le prototype Python/PyQt5 (archivé sous le tag `v1.0-final`) a validé le concept et produit un savoir-faire précieux, porté intégralement :

| Acquis v1 | Destination v2 |
|---|---|
| 20+ patterns regex de parsing | Registre `log_parser.rs` (crate `regex`) |
| Logique FSM implicite (connexion/déconnexion) | `state_machine.rs` (enum FSM explicite) |
| Calibration kamas et onboarding | `SettingsTab.tsx` |
| Thèmes QSS gaming | TailwindCSS avec palettes équivalentes |
| Détection installation via `repositories.json` Zaap | `paths.rs` |
| Journaux d'écoute (docs/RND/) | Spécification vivante du parser |

---

## 10. Conventions

- **Code** : anglais
- **UI et documentation** : français
- **Commits** : français, messages clairs, Co-Authored-By si applicable
- **Tests** : obligatoires pour chaque service Rust (`#[cfg(test)]`)
- **Logging** : `tracing` crate avec rotation via `tracing-appender`
- **CHANGELOG.md** : mis à jour à chaque changement significatif, en français simple
