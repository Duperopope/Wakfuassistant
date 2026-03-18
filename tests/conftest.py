import pytest
import sys
from pathlib import Path

import os

@pytest.fixture(scope="session", autouse=True)
def add_project_root_to_path():
    project_root = str(Path(__file__).resolve().parent.parent)
    sys.path.insert(0, project_root)
    yield
    sys.path.pop(0)

@pytest.fixture
def temp_dir(tmp_path):
    return tmp_path
