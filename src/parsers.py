"""Log parsing: regex patterns + LogWatcher."""
import re
import time
import threading
import logging
from datetime import datetime
from pathlib import Path

from models import pnum

logger = logging.getLogger("wakfu_companion")

RE_TIMESTAMP = re.compile(r"(\d{2}:\d{2}:\d{2}),\d{3}")
RE_XP = re.compile(
    r"\[Information \(jeu\)\]\s+"
    r"(.+?)\s*:\s*\+(\d[\d\s]*)\s*points?\s*d['\u2019]XP\.\s+"
    r"Prochain niveau dans\s*:\s*(\d[\d\s]*)\."
)
RE_LEVEL_UP = re.compile(
    r"\[Information \(jeu\)\]\s+"
    r"(.+?)\s*:\s*\+(\d[\d\s]*)\s*points?\s*d['\u2019]XP\.\s+\+1\s*niveau"
)
RE_KAMAS = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez gagn\S?\s+(\d[\d\s]*)\s*kamas"
)
RE_DROP = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez ramass\S+\s+(\d[\d\s]*)x\s+(.+?)\s*\."
)
RE_LOSS = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez perdu\s+(\d[\d\s]*)x\s+(.+?)\s*\."
)
RE_USE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous venez d['\u2019]utiliser\s*:\s*(.+?)\s*$"
)
RE_SALE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous venez de vendre\s+(\d[\d\s]*)x\s+(.+?)\s{1,4}pour un prix total de\s+(\d[\d\s]*)\s*\u00a7"
)
RE_CRAFT = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez r\S+ussi votre recette de\s+(.+?)\s*\.\s*$"
)
RE_FIGHT = re.compile(r"\[FIGHT\]\s*End fight with id\s+(\d+)")
RE_FIGHT_START = re.compile(r"\[FIGHT\]\s*Start fight with id\s+(\d+)", re.IGNORECASE)
RE_FIGHT_TURN = re.compile(r"\[FIGHT\].*?(?:turn|tour)\s*[:#]?\s*(\d+)", re.IGNORECASE)
RE_DAMAGE_SKILL = re.compile(
    r"\[Information \(jeu\)\]\s+Vous infligez\s+(\d[\d\s]*)\s+(?:de\s+)?(?:dommages?|degats?).*?(?:avec|via)\s+(.+?)(?:\.|$)",
    re.IGNORECASE,
)
RE_DAMAGE_GENERIC = re.compile(
    r"\[Information \(jeu\)\]\s+Vous infligez\s+(\d[\d\s]*)\s+(?:de\s+)?(?:dommages?|degats?)",
    re.IGNORECASE,
)
RE_PLANT_FAIL = re.compile(
    r"\[Information \(jeu\)\]\s+Conditions d['\u2019]utilisation non respect"
)


class LogWatcher:
    def __init__(self, log_path, session, parse_existing=False):
        self.log_path = Path(log_path)
        self.session = session
        self.parse_existing = parse_existing
        self._stop = threading.Event()
        self._position = 0
        self.lines_parsed = 0
        self.events_detected = 0
        self.unmatched_lines = 0
        self.unmatched_samples = []

    def start(self):
        t = threading.Thread(target=self._loop, daemon=True, name="LogWatcher")
        t.start()

    def stop(self):
        self._stop.set()

    def _loop(self):
        if self.log_path.exists():
            if self.parse_existing:
                logger.info("Rattrapage du log existant...")
                with open(self.log_path, "r", encoding="utf-8", errors="replace") as f:
                    for line in f:
                        self.lines_parsed += 1
                        self._parse(line.strip())
                    self._position = f.tell()
                logger.info(
                    f"Rattrapage: {self.lines_parsed} lignes, {self.events_detected} events"
                )
            else:
                self._position = self.log_path.stat().st_size
        else:
            logger.warning(f"Log Wakfu introuvable: {self.log_path}")

        while not self._stop.is_set():
            try:
                if not self.log_path.exists():
                    time.sleep(1)
                    continue
                sz = self.log_path.stat().st_size
                if sz < self._position:
                    self._position = 0
                if sz > self._position:
                    with open(self.log_path, "r", encoding="utf-8", errors="replace") as f:
                        f.seek(self._position)
                        for line in f:
                            self.lines_parsed += 1
                            self._parse(line.strip())
                        self._position = f.tell()
            except Exception as e:
                logger.error(f"Watcher: {e}")
            time.sleep(0.5)

    def _parse(self, line):
        try:
            self._parse_inner(line)
        except Exception as e:
            logger.error(f"Parse error: {line[:80]} | {e}")

    def _mark_unmatched(self, line):
        self.unmatched_lines += 1
        if len(self.unmatched_samples) < 20:
            self.unmatched_samples.append(line[:180])

    def _parse_inner(self, line):
        if not line:
            return
        if "[Information (jeu)]" not in line and "[FIGHT]" not in line:
            return
        ts_m = RE_TIMESTAMP.search(line)
        ts = ts_m.group(1) if ts_m else datetime.now().strftime("%H:%M:%S")

        m = RE_FIGHT_START.search(line)
        if m:
            self.session.handle_fight_start(ts, m.group(1))
            return
        m = RE_FIGHT_TURN.search(line)
        if m:
            self.session.handle_fight_turn(ts, pnum(m.group(1)))
            return
        m = RE_DAMAGE_SKILL.search(line)
        if m:
            self.session.handle_damage(ts, pnum(m.group(1)), m.group(2).strip())
            self.events_detected += 1
            return
        m = RE_DAMAGE_GENERIC.search(line)
        if m:
            self.session.handle_damage(ts, pnum(m.group(1)), "(non precise)")
            self.events_detected += 1
            return

        m = RE_LEVEL_UP.search(line)
        if m:
            self.session.handle_xp(ts, m.group(1).strip(), pnum(m.group(2)), 0, True)
            self.events_detected += 1
            return
        m = RE_XP.search(line)
        if m:
            self.session.handle_xp(
                ts, m.group(1).strip(), pnum(m.group(2)), pnum(m.group(3)), False
            )
            self.events_detected += 1
            return
        m = RE_SALE.search(line)
        if m:
            self.session.handle_sale(
                ts, m.group(2).strip(), pnum(m.group(1)), pnum(m.group(3))
            )
            self.events_detected += 1
            return
        m = RE_KAMAS.search(line)
        if m:
            self.session.handle_kamas(ts, pnum(m.group(1)))
            self.events_detected += 1
            return
        m = RE_DROP.search(line)
        if m:
            self.session.handle_drop(ts, m.group(2).strip(), pnum(m.group(1)))
            self.events_detected += 1
            return
        m = RE_LOSS.search(line)
        if m:
            self.session.handle_loss(ts, m.group(2).strip(), pnum(m.group(1)))
            self.events_detected += 1
            return
        m = RE_USE.search(line)
        if m:
            self.session.handle_use(ts, m.group(1).strip())
            self.events_detected += 1
            return
        m = RE_CRAFT.search(line)
        if m:
            self.session.handle_craft(ts, m.group(1).strip())
            self.events_detected += 1
            return
        m = RE_FIGHT.search(line)
        if m:
            self.session.handle_fight(ts, m.group(1))
            self.events_detected += 1
            return
        m = RE_PLANT_FAIL.search(line)
        if m:
            self.session.handle_plant_fail(ts)
            self.events_detected += 1
            return
        self._mark_unmatched(line)

    def diagnostics(self):
        return {
            "lines": self.lines_parsed,
            "events": self.events_detected,
            "unmatched": self.unmatched_lines,
            "samples": list(self.unmatched_samples[-8:]),
        }
