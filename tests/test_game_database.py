import pytest
from core import game_database as db
import os
import json

def test_set_and_get_item_settings(temp_dir):
    path = os.path.join(str(temp_dir), "game.json")
    original_path = db._DB_PATH
    db._DB_PATH = db.Path(path)
    try:
        db.set_item_settings("Epée", qty_override=10, ah_price=1000)
        settings = db.get_item_settings("Epée")
        assert settings.get("qty_override") == 10
        assert settings.get("ah_price") == 1000
    finally:
        db._DB_PATH = original_path

def test_set_profession_state(temp_dir):
    path = os.path.join(str(temp_dir), "game2.json")
    original_path = db._DB_PATH
    db._DB_PATH = db.Path(path)
    try:
        db.set_profession_state("Bricoleur", level=15, xp_remaining=5000)
        state = db.get_profession_state("Bricoleur")
        assert state.get("level") == 15
        assert state.get("xp_remaining") == 5000
    finally:
        db._DB_PATH = original_path
