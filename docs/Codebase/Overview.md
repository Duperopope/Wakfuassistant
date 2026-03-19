WakfuAssistant Codebase Overview

- Architecture: 
  - core/: business logic and data handling
  - data/: assets, config and json databases
  - tests/: unit tests for core modules
  - logs/: runtime logs
  - docs/Codebase/: documentation scaffolding for phase 1

- Key modules:
  - core/game_database.py: in-memory JSON DB wrapper with file-based persistence, thread-safe
  - health_check.py: quick health checks for environment and syntax
  - watchdog scripts: runtime health indicators
  - memory/: daily and long-term memory logs for AGI continuity

- Data schema:
  - data/game_database.json: main store (items, professions, recipes)
  - tests/test_game_database.py: unit tests for recipe upsert/delete, item settings, etc.

- Data provenance:
  - data/config.json: runtime configuration

- How to run tests:
  - Ensure Python >= 3.10
  - Create/activate venv and install dependencies if needed
  - Run: pytest -q
