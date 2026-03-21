# SESSION LOG A1

**Date :** 2026-03-21
**Agent :** Claude Sonnet 4.6
**Scope :** Création migration SQL 003_recipes_cache

---

## Action

Création du fichier `src-tauri/src/migrations/003_recipes_cache.sql`.

## Fichier créé

**Chemin :** `src-tauri/src/migrations/003_recipes_cache.sql`

**Contenu :**

```sql
CREATE TABLE IF NOT EXISTS recipes_cache (
    recipe_id INTEGER PRIMARY KEY,
    category INTEGER NOT NULL,
    level INTEGER NOT NULL DEFAULT 0,
    xp_ratio INTEGER NOT NULL DEFAULT 0,
    cached_at TEXT NOT NULL DEFAULT (datetime('now')),
    cdn_version TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS recipe_ingredients_cache (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    recipe_id INTEGER NOT NULL,
    item_id INTEGER NOT NULL,
    quantity INTEGER NOT NULL DEFAULT 1,
    ingredient_order INTEGER NOT NULL DEFAULT 0,
    FOREIGN KEY (recipe_id) REFERENCES recipes_cache(recipe_id)
);

CREATE TABLE IF NOT EXISTS recipe_results_cache (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    recipe_id INTEGER NOT NULL,
    item_id INTEGER NOT NULL,
    quantity INTEGER NOT NULL DEFAULT 1,
    FOREIGN KEY (recipe_id) REFERENCES recipes_cache(recipe_id)
);

CREATE INDEX IF NOT EXISTS idx_recipe_ingredients_recipe ON recipe_ingredients_cache(recipe_id);
CREATE INDEX IF NOT EXISTS idx_recipe_results_recipe ON recipe_results_cache(recipe_id);
CREATE INDEX IF NOT EXISTS idx_recipe_results_item ON recipe_results_cache(item_id);
```

## Résultat

- 3 tables créées : `recipes_cache`, `recipe_ingredients_cache`, `recipe_results_cache`
- 3 index créés : `idx_recipe_ingredients_recipe`, `idx_recipe_results_recipe`, `idx_recipe_results_item`
- Pattern identique à `001_initial.sql` (`CREATE TABLE IF NOT EXISTS`)
- Clés étrangères déclarées vers `recipes_cache(recipe_id)`
- Aucun placeholder, aucun TODO

## Statut

TERMINÉ — SQL syntaxiquement valide. Aucun autre fichier modifié.

## Prochaine étape

Intégrer la migration dans `database.rs` (run_migrations) et implémenter `cdn_cache.rs` pour alimenter les 3 tables depuis recipes.json, recipeIngredients.json, recipeResults.json du CDN Ankama.
