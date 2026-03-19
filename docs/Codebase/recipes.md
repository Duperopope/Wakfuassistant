# Documentation: Recipe Database

- The recipe store uses a deterministic ID generation to avoid duplicate recipes on updates.
- Upserts will replace an existing recipe with the same computed ID; new entries are appended only when no existing ID matches.
- The ID is derived from output_item, output_qty, and a sorted list of components (each with item and qty).
- Tests reference: tests/test_game_database.py::test_recipe_upsert_and_delete
