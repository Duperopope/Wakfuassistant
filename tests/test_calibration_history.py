import pytest
from core import calibration_history as ch
import json
import os

def test_add_entry(temp_dir):
    path = os.path.join(str(temp_dir), "calibration.json")
    original_path = ch._PATH
    ch._PATH = ch.Path(path)
    try:
        entry = ch.add_entry("xp", {"xp": 12345})
        assert entry["kind"] == "xp"
        assert entry["payload"]["xp"] == 12345
        entries = ch.list_entries()
        assert entries[-1]["payload"]["xp"] == 12345
    finally:
        ch._PATH = original_path

def test_list_entries_empty(temp_dir):
    path = os.path.join(str(temp_dir), "empty.json")
    original_path = ch._PATH
    ch._PATH = ch.Path(path)
    try:
        ch._write([])
        entries = ch.list_entries()
        assert entries == []
    finally:
        ch._PATH = original_path
