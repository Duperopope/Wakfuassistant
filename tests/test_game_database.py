import pytest
from core import game_database as db
import threading

def test_create_and_read_item(temp_dir):
    database = db.GameDatabase(str(temp_dir / "game.db"))
    item_id = database.create_item("Épée", "Arme", 10)
    item = database.get_item(item_id)
    assert item[1] == "Épée"
    assert item[2] == "Arme"
    assert item[3] == 10

# Ajoutez ici d'autres tests pour CRUD, edge cases et thread safety
