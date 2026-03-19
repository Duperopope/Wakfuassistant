# CHANGELOG

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

---

## v1.0-final — Prototype Python/PyQt5 (archivé)

Voir l'historique git pour les détails de la v1.
Le tag `v1.0-final` marque le dernier état du prototype.
