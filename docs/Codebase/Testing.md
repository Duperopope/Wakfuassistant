Testing and Quality
- Framework: pytest (Python)
- Coverage: core modules used by WakfuAssistant tests (game_database, permanent_journal, item_icons, calib/history, etc.)
- How to run
  - From repo root: `python -m pytest tests -q`
- How tests are organized
  - tests/test_game_database.py
  - tests/test_permanent_journal.py
  - tests/test_item_icons.py
- Running health_check before/after changes
- How to add tests
  1. Create a new file under `tests/` with a descriptive name, e.g. `test_recipe_behavior.py`.
  2. Use the existing fixtures (e.g. `temp_dir`) to isolate file-based DBs.
  3. Focus on one unit of behavior per test; keep tests hermetic and deterministic.
- Conventions
  - Tests should not require network access or external services.
  - Tests should work offline and be fast (under a second where possible).
- Results interpretation
  - All tests must pass to consider a change safe.
- Notes
  - If you change public interfaces, update or add tests accordingly.
