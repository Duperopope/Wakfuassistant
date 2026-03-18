import pytest
from core import item_icons

def test_normalize():
    assert item_icons._normalize("épée ") == item_icons._normalize("Épée")

# Ajoutez ici des tests pour _clean_type, get_item_rarity_candidates
