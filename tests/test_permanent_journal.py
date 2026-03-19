import pytest
from core import permanent_journal as pj

def test_parse_num_basic():
    # Simple numbers and NBSP
    assert pj._parse_num("1 000") == 1000
    assert pj._parse_num("2000") == 2000
    assert pj._parse_num("3000") == 3000
    assert pj._parse_num("0") == 0
    assert pj._parse_num(" 42 ") == 42

# Placeholder for additional tests
def test_placeholder():
    assert True


def test_parse_event_kamas_gain():
    line = "[Information (jeu)] Vous avez gagné 1 234 kamas"
    # Ensure the line matches the expected gain event
    # The helper _parse_event should extract a kamas_gain event with amount 1234
    evt = pj._parse_event(line)
    assert evt is not None
    etype, data = evt
    assert etype == "kamas_gain"
    assert data.get("amount") == 1234


def test_parse_event_quest_complete():
    line = '[Information (jeu)] Quête accomplie : "Nom de la quête"'
    evt = pj._parse_event(line)
    assert evt is not None
    etype, data = evt
    assert etype == "quest_complete"
    assert data.get("name") == "Nom de la quête"


def test_parse_event_login():
    line = "[Information (jeu)] Vous êtes maintenant connecté"
    evt = pj._parse_event(line)
    assert evt is not None
    etype, data = evt
    assert etype == "login"


def test_estimate_market_price_basic():
    # Simple deterministic case: tax=100, qty=2, 28 days, 5% territory tax
    # rate = 0.05; denom = 2 * 0.05 = 0.1; min = ceil((100-0.5)/0.1) = 995; max = ceil((100+0.5)/0.1) - 1 = 1004
    min_price, max_price = pj.estimate_market_price(100, 2, 28, 5)
    assert (min_price, max_price) == (995, 1004)
