# CHANGELOG

## [PoC Database — Correctifs] - 2026-03-19

### Corrigé
- `collect-wakfu-logs.ps1` : détection sqlite3 globale (PATH) si absent en local
- `collect-wakfu-logs.ps1` : apostrophe manquante dans regex séparateurs numériques (`1'234 kamas`)
- `collect-wakfu-logs.ps1` : `$args` renommé `$sqliteArgs` (conflit variable automatique PowerShell)
- `collect-wakfu-logs.ps1` : SQL passé via stdin plutôt qu'en argument (robustesse multi-lignes)
- `collect-wakfu-logs.ps1` : `INSERT parsed_events` utilisait `last_insert_rowid()` cassé sur `INSERT OR IGNORE` — remplacé par SELECT subquery avec NOT EXISTS
- `collect-wakfu-logs.ps1` : guard PSVersion >= 7 avant `ForEach-Object -Parallel`
- `query-permanent.ps1` + `query-check.ps1` : même correction sqlite3 PATH que le script collect
- `schema-permanent.sql` : ajout `UNIQUE(raw_line_id)` sur `parsed_events` (protection DB-level en plus du NOT EXISTS)

### Ajouté
- `xp-time-to-level.ps1` : estimateur ETA level-up en temps réel sur wakfu.log
- `.gitignore` : exclusion des fichiers `*.db` générés dans le dossier PoC

---

## [Chantier 7 — Build & Distribution] - 2026-03-19

### Configuration
- `tauri.conf.json` :
  - `productName` → "Wakfu Overlay v2"
  - `identifier` → "com.wakfu-overlay.v2"
  - Bundle target : NSIS (Windows installer)
  - NSIS options :
    - `installMode: "currentUser"` (installation pour l'utilisateur courant)
    - Multi-langue : English + French
    - Sélecteur langue au démarrage
    - Raccourcis : Start Menu + Desktop
  - CSP : permet connexions vers `https://wakfu.cdn.ankama.com`

### Build
- Commande : `npm run tauri build`
- Output : `target/release/bundle/nsis/Wakfu Overlay v2_2.0.0_x64-setup.exe` (~10-15 MB)
- Executables : stripped, optimisés pour Windows 10+
- Distribution : standalone installer, auto-update capable via Tauri

---

## [Chantier 6 — Onglets UI] - 2026-03-19

### Ajouté
- `src/components/tabs/CombatTab.tsx` : affichage statistiques combats
  - Barre de progression du taux de victoire (%)
  - Compteurs : victoires, défaites, total combats
  - Données temps réel depuis `sessionStore.combatCount`, `victoryCount`
- `src/components/tabs/ProfessionsTab.tsx` : placeholder pour Phase 4
  - Message explicatif, icône métier ⛏
- `src/components/tabs/EconomyTab.tsx` : détails économie session
  - Gains/dépenses kamas avec couleurs
  - Delta net (vert/rouge)
  - Ratio dépenses
  - Balance actuelle
- `src/components/tabs/OptionsTab.tsx` : panneau configuration complet
  - Sélecteur langue (fr/en)
  - Sélecteur thème (dark/light)
  - Slider opacité (0.5–1.0)
  - Bouton sauvegarder → `saveSettings()`
  - Bouton rafraîchir CDN → `invoke("refresh_cdn_cache")`
  - Affichage status message avec timing
  - Raccourci et version affichés

### Modifié
- `App.tsx` : imports 4 nouveaux composants, Switch/Match utilise vrais composants au lieu PlaceholderTab

---

## [Phase 3b — Overlay Win32] - 2026-03-19

### Ajouté
- `src-tauri/src/services/win32_overlay.rs` : détection fenêtre Wakfu via `FindWindowW`, récupération position/taille/état (minimisé, visible)
- `src-tauri/src/commands/overlay_commands.rs` : 3 commandes IPC :
  - `get_wakfu_window_info()` : retourne `WakfuWindowInfo` (position, taille, minimisé, visible, titre)
  - `toggle_click_through(enabled: bool)` : basculer click-through via `window.set_ignore_cursor_events()`
  - `set_overlay_always_on_top(enabled: bool)` : always-on-top via `window.set_always_on_top()`
- `src/lib/overlayTracker.ts` : boucle de suivi 1 Hz :
  - Détecte si Wakfu est visible/active
  - Repositionne overlay à proximité (coin supérieur droit de Wakfu)
  - Cache overlay si Wakfu minimisée/introuvable
  - Optimisation : skip repositionnement si position identique
- Intégration dans `App.tsx` : `startOverlayTracker()` à `onMount`, `stopOverlayTracker()` à `onCleanup`
- Permissions Tauri ajoutées : `allow-show`, `allow-hide`, `allow-set-always-on-top`
- Configuration overlay : `visible: false`, `resizable: false`, `skipTaskbar: true`, fenêtre 400x300

### Modifié
- `tauri.conf.json` : config overlay (height 300, visible false, skipTaskbar true, resizable false)
- `vite.config.ts` : `strictPort: false` pour éviter conflit de port
- `capabilities/default.json` : ajout permissions pour show/hide/always-on-top

### Détails technique
- Win32 API via crate `windows 0.61` : `FindWindowW`, `GetWindowRect`, `IsIconic`, `IsWindowVisible`
- Stub non-Windows : retourne `WakfuWindowInfo::default()`
- Frontend : Tauri IPC async avec `invoke()`, polling via `setInterval`

---

## [Chantier 2 — CDN Cache] - 2026-03-19

### Ajouté
- Migration SQLite `002_cdn_cache.sql` :
  - Table `cdn_metadata` : key/value + timestamp (pour versionner le cache)
  - Table `items_cache` : id, name_fr, name_en, level, item_type_id, rarity + indices pour recherche
- `src-tauri/src/services/cdn_cache.rs` :
  - `fetch_game_version()` : GET `config.json`, parse version
  - `fetch_and_cache_items(version, db)` : GET `items.json`, parse, insérer en transaction
  - `get_item_name(db, item_id, lang)` : lookup item par ID
  - Détection : rechargement uniquement si version a changé
- `src-tauri/src/commands/cdn_commands.rs` : 3 commandes IPC :
  - `get_cdn_version()` : retourne version actuelle du CDN
  - `refresh_cdn_cache()` : rafraîchit le cache (download + insert)
  - `get_item_name(item_id, lang)` : lookup item name par ID et langue

### Détails
- URL CDN : `https://wakfu.cdn.ankama.com/gamedata/config.json` et `/{version}/items.json`
- Parsing : serde_json, extraction `name.fr` / `name.en`
- Transaction SQL : atomicité du remplissage de la table
- Caching : metadata stocke la version, évite re-DL inutile
- Fallback : si item non trouvé, retourne "Item#<id>"

---

## [Chantier 5 — Persistent Store] - 2026-03-19

### Ajouté
- `src/lib/settings.ts` : interface `UserSettings` avec champs :
  - `bayHeight` : hauteur bay par défaut 48px
  - `clickThroughHotkey` : touche par défaut "F12"
  - `theme` : "dark" | "light" (défaut dark)
  - `language` : "fr" | "en" (défaut fr)
  - `overlayOpacity` : 0.5–1.0 (défaut 0.9)
- Fonctions publiques :
  - `loadSettings()` : charge depuis store ou retourne defaults
  - `saveSettings(settings)` : persiste dans store (appelle `save()`)
  - `getDefaultSettings()` : retourne defaults
- Plugin Tauri : `tauri-plugin-store` v2.4.2
- Store utilisé : `settings.json` dans AppData
- Permissions : `store:default` dans `capabilities/default.json`

### Détails
- Lazy initialization : le store se crée au premier `load()`
- `...defaults, ...saved` : fusion pour backcompat (nouvelles clés reçoivent les defaults)

---

## [Chantier 4 — System Tray] - 2026-03-19

### Ajouté
- `src/lib/tray.ts` : setup system tray via `TrayIcon` + `Menu`
  - Menu items :
    - Afficher/Masquer : bascule `window.isVisible()`
    - Toggle Click-Through (F12) : même action que le raccourci
    - Quitter : `exit(0)` via `@tauri-apps/plugin-process`
  - Tooltip : "Wakfu Overlay v2"
  - Menu on left-click : `false` (droit click)
- Plugins Tauri : `tauri-plugin-process` v2.3.1 (pour `exit()`)
- Permissions : `process:allow-exit` dans `capabilities/default.json`

### Modifié
- `App.tsx` : appel `setupTray()` en `onMount`, `closeTray()` en `onCleanup`
- Plugin process enregistré automatiquement dans backend

---

## [Chantier 3 — Raccourci Global F12] - 2026-03-19

### Ajouté
- `src/lib/shortcuts.ts` : registre F12 via `@tauri-apps/plugin-global-shortcut`
  - F12 bascule `isClickThrough` (curseur passe/ne passe pas à travers overlay)
  - Logging console détaillé
- Plugin Tauri installé : `tauri-plugin-global-shortcut` v2.3.1
- Permissions dans `capabilities/default.json` : `global-shortcut:allow-register`, `allow-unregister`, `allow-is-registered`

### Modifié
- `App.tsx` : appel `registerShortcuts()` en `onMount`, `unregisterShortcuts()` en `onCleanup`
- Plugin enregistré dans Rust backend via `pub fn run()` (auto-ajouté par `npm run tauri add`)

---

## [Phase 3a — Widget System] - 2026-03-19

### Ajouté
- `WidgetBay` : footer modulaire remplaçant TabBar, avec handle de redimensionnement (3 snap points : 48/112/176px)
- 6 widgets live : KamasBalance, KamasSession, CombatStats, XpGained, ParserHealth, CharacterInfo
- `widgetStore.ts` : registre de layout widgets, signal baySnap (snap points)
- `WidgetFrame` : composant wrapper standard pour tous les widgets (h-14, label + valeur)
- Tooltip contextuel au survol des onglets (données live depuis sessionStore)
- Ancrage bas de fenêtre : expand/collapse et cycle de snap préservent la position du bas
- `Dynamic` (solid-js/web) pour résoudre les widgets via registre ID → composant

---

## v2.0.0 — Refonte complète (2026-03-19)

### Transition v1 → v2

- Archivage de la v1 Python/PyQt5 sous le tag `v1.0-final` (préservée sur GitHub)
- Suppression du code Python, conservation des docs de recherche (docs/RND/)
- Nouvelle stack : Rust (Tauri v2) + SolidJS + TypeScript + TailwindCSS

### Phase 1 — Fondations

- Scaffold Tauri v2 + SolidJS + TypeScript
- Structure backend Rust : models, services, commands, utils
- `GameEvent` — enum typé central pour tous les événements de jeu
- `database.rs` — SQLite WAL avec migrations, tables sessions/events/economy/professions
- `paths.rs` — résolution automatique des logs Wakfu (Zaap + repositories.json)
- `logger.rs` — tracing + rotation fichier quotidienne
- `get_session_stats` — première commande Tauri IPC
- Configuration overlay : transparent, always-on-top, decorations off, 400x600
- `docs/ARCHITECTURE.md` — documentation technique complète de la v2

### Phase 2 — Pipeline temps réel

- `log_parser.rs` — registre de 20 patterns regex extraits des journaux R&D, `LazyLock<Regex>`, parsing nombres français (espaces/NBSP), `ParserHealth` métriques
- `state_machine.rs` — FSM exhaustif : Offline → Loading → InGame → InCombat → Disconnected, persistance serveur/personnage entre transitions
- `log_watcher.rs` — surveillance hybride : notify-rs (200ms debounce) + timer de sécurité (2s), détection rotation fichier, `GameStreamEvent` typé pour le frontend
- `commands/pipeline.rs` — 4 commandes Tauri IPC : `start_log_pipeline` (Channel streaming), `get_parser_health`, `get_game_state`, `force_log_rescan`
- `paths.rs` — ajout fallback Steam (Program Files x86/x64)
- `game_event.rs` — `LogSource` avec `Copy` derive
- `Cargo.toml` — ajout notify 8, notify-debouncer-mini 0.6, `rust-version = "1.80"` (LazyLock stable)
- 16 tests unitaires (8 parser + 5 FSM + 3 méta-tests) — tous passent

### Phase 3a — Squelette UI (validation bout-en-bout)

- `globals.css` — thème gaming Tailwind v4 (oklch), scrollbar custom, fond transparent
- `vite.config.ts` — intégration @tailwindcss/vite, port 1420, target es2021
- `lib/tauri.ts` — couche IPC typée : types miroirs des structs Rust, `startPipeline()` via Channel
- `stores/sessionStore.ts` — store SolidJS réactif, signaux GameState/ParserHealth/recentEvents, `initPipeline()`
- `Titlebar.tsx` — barre de titre custom draggable (data-tauri-drag-region), indicateur FSM coloré, boutons minimize/close SVG
- `TabBar.tsx` — 5 onglets avec signal activeTab, highlight doré
- `CharacterTab.tsx` — affichage kamas (balance + delta), XP, combats, winrate, feed d'événements récents, indicateur santé parser
- `App.tsx` — assembleur avec Switch/Match, placeholders Phase 4
- `capabilities/default.json` — permissions fenêtre (dragging, close, minimize, click-through)
- Suppression du scaffold Vite par défaut (App.css, index.css, assets demo)
- TypeScript 0 erreurs, Rust 0 warnings, 16 tests toujours verts

---

## v1.0-final — Prototype Python/PyQt5 (archivé)

Voir l'historique git pour les détails de la v1.
Le tag `v1.0-final` marque le dernier état du prototype.
