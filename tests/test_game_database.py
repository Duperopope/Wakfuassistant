import pytest
from core import game_database as db
import os


def test_rename_item(temp_dir):
    path = os.path.join(str(temp_dir), "game_rename.json")
    original = db._DB_PATH
    db._DB_PATH = db.Path(path)
    try:
        db.set_item_settings("Potion A", qty_override=5, ah_price=100)
        db.rename_item("Potion A", "Potion B")
        assert db.get_item_settings("Potion A") == {}
        settings = db.get_item_settings("Potion B")
        assert settings.get("qty_override") == 5
        assert settings.get("ah_price") == 100
    finally:
        db._DB_PATH = original


def test_recipe_upsert_and_delete(temp_dir):
    path = os.path.join(str(temp_dir), "game_recipe.json")
    original = db._DB_PATH
    db._DB_PATH = db.Path(path)
    try:
        recipe = {
            "output_item": "Fer",
            "output_qty": 1,
            "xp": 10,
            "components": [
                {"item": "Minerai de Fer", "qty": 3},
            ],
        }
        db.upsert_recipe("mineur", "outgoing", recipe)
        results = db.list_recipes("mineur", "outgoing")
        assert len(results) == 1
        assert results[0]["output_item"] == "Fer"
        assert results[0]["output_qty"] == 1
        assert len(results[0]["components"]) == 1

        recipe["output_qty"] = 3
        db.upsert_recipe("mineur", "outgoing", recipe)
        results = db.list_recipes("mineur", "outgoing")
        assert len(results) == 1
        assert results[0]["output_qty"] == 3

        rid = results[0]["id"]
        db.delete_recipe("mineur", "outgoing", rid)
        results = db.list_recipes("mineur", "outgoing")
        assert len(results) == 0
    finally:
        db._DB_PATH = original


def test_get_profession_state_defaults(temp_dir):
    path = os.path.join(str(temp_dir), "game_prof.json")
    original = db._DB_PATH
    db._DB_PATH = db.Path(path)
    try:
        state = db.get_profession_state("Inconnu")
        assert state["level"] == 1
        assert state["xp_remaining"] == 0
    finally:
        db._DB_PATH = original


def test_set_and_get_item_settings(temp_dir):
    path = os.path.join(str(temp_dir), "game.json")
    original = db._DB_PATH
    db._DB_PATH = db.Path(path)
    try:
        db.set_item_settings("Epee", qty_override=10, ah_price=1000)
        settings = db.get_item_settings("Epee")
        assert settings.get("qty_override") == 10
        assert settings.get("ah_price") == 1000
    finally:
        db._DB_PATH = original


def test_set_profession_state(temp_dir):
    path = os.path.join(str(temp_dir), "game2.json")
    original = db._DB_PATH
    db._DB_PATH = db.Path(path)
    try:
        db.set_profession_state("Bricoleur", level=15, xp_remaining=5000)
        state = db.get_profession_state("Bricoleur")
        assert state["level"] == 15
        assert state["xp_remaining"] == 5000
    finally:
        db._DB_PATH = original
