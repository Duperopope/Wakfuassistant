Testing Guide for WakfuAssistant

Prerequisites:
- Python 3.10+ (prefer Python 3.10.x as in CI)
- Virtual environment activated

Running tests:
- Install dependencies: pytest, etc. (as defined in project)
- Run all tests: pytest -q
- Run a single test module: pytest tests/test_game_database.py -q

Health check:
- Run: python health_check.py
- Exit code 0 means all checks pass; any failure should be resolved before merging.

Test strategy:
- Ensure tests cover core features (database upsert/delete, item settings, etc.)
- Keep tests deterministic; avoid relying on system state
- Add new tests for new features

Documentation:
- Update docs/Codebase/Testing.md when you add new tests or change testing strategy
