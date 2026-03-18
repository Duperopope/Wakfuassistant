import pytest
from core import kamas_history as kh
from datetime import datetime
import re

def test_now_iso_format():
    iso = kh.now_iso()
    assert re.match(r"\d{4}-\d{2}-\d{2} \d{2}:\d{2}:\d{2}" , iso)

# Ajoutez ici des tests pour list_kamas_corrections, write_kamas_correction
