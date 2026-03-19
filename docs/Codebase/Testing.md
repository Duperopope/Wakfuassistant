Phase 1 Testing Guide

- Objective: Provide a practical, repeatable testing workflow for core features (notably core/game_database.py).
- Scope: Unit tests for data layer, integration hooks, and basic health checks.

Setup
- Python 3.10+ (as per health_check.py requirements)
- Virtual environment: create and activate
- Install dependencies if any (pytest is used locally by this repo)

How to run tests
- Run: pytest -q
- Expected results: tests pass; exit code 0
- If tests fail, inspect logs in memory/2026-03-19.md (and current memory files) for regression trace

Interpreting results
- PASS: individual test names -> their expected behavior is verified
- FAIL: a test failed -> examine stack trace, identify root cause (logic, edge case, or data file issues)
- SKIP: intentionally skipped tests (may indicate environment limitations)

Common fixes workflow
- Reproduce failure locally
- Inspect core files touched by failing test (e.g., core/game_database.py)
- Implement minimal, targeted fix
- Re-run tests; confirm pass
- Update CHANGELOG.md with a short justification
- Update docs/Codebase/Overview.md if necessary

Notes
- Tests for deterministic IDs in recipe upserts rely on stable hashing of essential contents; avoid including mutable fields (like output_qty) in the hash basis.
- Ensure tests clean up any temporary DB files used during tests.
