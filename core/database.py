"""
Thin wrapper module to provide backward-compatible import path for tests
and external tools (such as OpenCode) that expect a module named
`core.database`. The real implementation lives in core/game_database.py.
This wrapper simply re-exports symbols from game_database.py.
"""

from .game_database import *  # noqa: F401,F403
