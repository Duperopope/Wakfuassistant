Codebase Testing
==============

Goals for Phase 1 tests:
- Ensure core functionality is exercised by automated tests (pytest).
- Provide a health_check.py to verify environment readiness after changes.
- Keep tests fast, deterministic and isolated (temporary DB paths per test).

Test conventions:
- Use temporary file paths for JSON databases in tests (as seen in tests/test_*.py).
- Avoid external side effects; tests should be hermetic.
- When tests fail, the repository should be easily diagnosable via health_check and logs.

How to run tests locally:
- Execute: python -m pytest -q
- To run a single test module: python -m pytest tests/test_<module>.py
- Health check: python health_check.py

Docs section is intentionally lightweight and focuses on reproducible test results and project hygiene.
