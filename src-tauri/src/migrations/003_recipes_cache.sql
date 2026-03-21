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
