Codebase Overview

- Architecture: core, data, health_check, tests, memory
- Core modules: core/game_database.py, core/*.py for data access and business logic
- Health checks: health_check.py verifying python, imports, config, and syntax
- Data: data/ config and assets used by tests
- Tests: tests/ for unit tests; how to run with pytest

How to run locally:
- Create and activate a virtual environment
- Install requirements (e.g., pip install -r requirements.txt)
- Run health checks: python health_check.py
- Run tests: pytest -q

Notes:
- The health_check script should pass after each change to ensure baseline stability.
- Phase 1 focuses on documentation, test reliability, and health checks before any major refactor.
