Codebase Overview
=================

- This document provides a high-level view of WakfuAssistant's codebase for Phase 1 documentation.
- Key modules: core (business logic), health_check.py (system checks), tests (unit tests), and data/config.json for runtime configuration.
- Routing and storage follow a simple JSON-file based persistence for testability.
- Conventions: small, incremental changes with tests and health checks passing after each modification.

Structure hints:
- core/ - core domain logic and data handling
- data/ - sample datasets and persistent state (JSON files)
- tests/ - unit tests for modules
- health_check.py - lightweight self-test script
- CHANGELOG.md - changelog with concise French entries

This file is intended as a quick map for developers and for onboarding new contributors in Phase 1.
Phase 1 highlights: deterministic data handling (recipes), health checks, and hermetic tests with temporary JSON DBs.
