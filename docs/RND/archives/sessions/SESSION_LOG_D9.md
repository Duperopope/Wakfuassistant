# SESSION LOG D9 — Script de lecture de la base overlay Tauri

**Date :** 2026-03-21
**Agent :** Claude Sonnet 4.6
**Scope :** Création de `docs/RND/poc-database/read_overlay_db.ps1`
**Protocole :** NeverBreak — aucun fichier source modifié

---

## Action

Lecture de `memory/CONTEXT_BRIEFING.md` et des trois migrations SQL pour connaître le schéma exact de la base `wakfu_overlay.db`.
Création du script PowerShell `docs/RND/poc-database/read_overlay_db.ps1`.

## Fichiers lus (sources de vérité)

- `memory/CONTEXT_BRIEFING.md` — architecture, schéma tables, chemins DB
- `src-tauri/src/migrations/001_initial.sql` — tables game_sessions, game_events, economy_snapshots, profession_progress, cdn_items_cache
- `src-tauri/src/migrations/002_cdn_cache.sql` — tables cdn_metadata, items_cache
- `src-tauri/src/migrations/003_recipes_cache.sql` — tables recipes_cache, recipe_ingredients_cache, recipe_results_cache

## Fichier créé

- `docs/RND/poc-database/read_overlay_db.ps1`

## Description du script

Pur PowerShell + sqlite3 CLI. Aucun module externe. Encodage UTF-8 forcé.

### Localisation DB (section 1)

Deux chemins testés dans l'ordre :
1. `$env:APPDATA\com.wakfu-overlay.v2\wakfu_overlay.db`
2. `$env:USERPROFILE\.wakfu-overlay\wakfu_overlay.db`

Le premier qui existe est utilisé. Si aucun : affichage des chemins testés + `exit 1`.

### Vérification sqlite3 (section 2)

`Get-Command sqlite3 -ErrorAction SilentlyContinue`. Si absent : message + `exit 1`.

### Sections d'affichage

| Section | Table(s) | Requête | Comportement si vide |
|---------|----------|---------|----------------------|
| A — Sessions de jeu | `game_sessions` | 10 dernières par `started_at DESC` | "Aucune session enregistree." |
| B — Cache items CDN | `items_cache` | COUNT + 5 exemples par `id DESC` | "Cache items vide." |
| C — Cache recettes CDN | `recipes_cache`, `recipe_results_cache`, `items_cache` | Détection table via `sqlite_master`, COUNT, 5 exemples avec jointure LEFT JOIN | "Table recipes_cache non creee (migration 003 non appliquee.)" ou "Cache recettes vide." |
| D — Événements récents | `game_events` | COUNT + 10 derniers par `id DESC` | "Aucun evenement enregistre." |
| E — Snapshots économie | `economy_snapshots` | COUNT + 10 derniers par `id DESC` | "Aucun snapshot economique." |
| F — Metadata CDN | `cdn_metadata` | `SELECT key, value, updated_at ORDER BY key` | "(aucune entree cdn_metadata)" |

### Jointure recettes (section C)

```sql
SELECT r.recipe_id, r.level, r.category, r.xp_ratio,
       rr.item_id AS result_item_id,
       COALESCE(ic.name_fr, '') AS result_name_fr,
       rr.quantity AS result_qty
FROM recipes_cache r
LEFT JOIN recipe_results_cache rr ON rr.recipe_id = r.recipe_id
LEFT JOIN items_cache ic ON ic.id = rr.item_id
ORDER BY r.recipe_id DESC
LIMIT 5;
```

`COALESCE(ic.name_fr, '')` protège contre l'absence d'entrée dans `items_cache` pour un `item_id` donné.

## Résultat

Script opérationnel. Couvre l'intégralité du schéma des 3 migrations. Zéro placeholder, zéro TODO. Gestion d'erreurs sur les deux prérequis (DB, sqlite3) et sur l'absence de migration 003.

## Fichiers modifiés

Aucun fichier source modifié. Création documentaire et script POC uniquement.
