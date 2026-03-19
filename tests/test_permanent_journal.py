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
