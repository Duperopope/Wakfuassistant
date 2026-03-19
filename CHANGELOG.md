# CHANGELOG

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
