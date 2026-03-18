import pytest
from core import calibration_history as ch

def test_add_and_get_entry(temp_dir):
    history = ch.CalibrationHistory(str(temp_dir / "calibration.json"))
    history.add_entry({"xp": 12345})
    entries = history.list_entries()
    assert entries[-1]["xp"] == 12345

# Ajoutez ici des tests pour update_entry, delete_entry, edge cases
