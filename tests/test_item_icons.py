import pytest
from core import item_icons


def test_normalize():
    assert item_icons._normalize("épée ") == item_icons._normalize("Épée")


def test_clean_type():
    assert item_icons._clean_type("Hache{[~1]?s:}") == "Hache"
    assert item_icons._clean_type("Récolte du Trappeur") == "Récolte du Trappeur"
    assert item_icons._clean_type("") == ""


def test_normalize_accents():
    assert item_icons._normalize("é") == "e"
    assert item_icons._normalize("ç") == "c"
    assert item_icons._normalize("ô") == "o"
    assert item_icons._normalize("Dague de lapin") == item_icons._normalize("dague de LAPIN")
