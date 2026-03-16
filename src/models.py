"""Helper functions and core model classes."""
import re
import math
import threading
import unicodedata
from collections import defaultdict
from datetime import datetime

import logging

logger = logging.getLogger("wakfu_companion")


def pnum(raw):
    """Parse a number string with spaces (e.g. '1 234') into an int."""
    cleaned = ""
    for ch in str(raw):
        if ch.isdigit():
            cleaned += ch
    if not cleaned:
        return 0
    return int(cleaned)


def normalize_name(text):
    """Normalize an item/metier name for fuzzy matching."""
    text = str(text or "").strip().lower()
    if not text:
        return ""
    text = unicodedata.normalize("NFKD", text)
    text = "".join(ch for ch in text if not unicodedata.combining(ch))
    text = re.sub(r"[^a-z0-9]+", " ", text)
    return " ".join(text.split())


class XPCurve:
    """Courbe XP des metiers Wakfu.

    Sources :
    - wakfu.wiki.gg/wiki/Professions : formule 150*level + 75 par niveau
    - wakfu.fandom.com/wiki/Professions : formule 100*(current+next) par niveau

    On utilise la formule wiki.gg (plus recente) : XP pour passer du level L au L+1 = 150*L + 75
    XP total pour atteindre level L = 75 * L^2
    """

    @staticmethod
    def xp_for_level(level, learned_curve=None):
        """XP necessaire pour passer de level a level+1."""
        if learned_curve and int(level) in learned_curve:
            return max(1, int(round(learned_curve[int(level)])))
        return 150 * level + 75

    @staticmethod
    def total_xp_to_level(level):
        """XP cumule total pour atteindre level (depuis 0)."""
        return 75 * level * level

    @staticmethod
    def xp_from_to(current_level, target_level, learned_curve=None):
        """XP necessaire pour aller de current_level a target_level."""
        if target_level <= current_level:
            return 0
        total = 0
        for lvl in range(int(current_level), int(target_level)):
            total += XPCurve.xp_for_level(lvl, learned_curve)
        return total

    @staticmethod
    def level_from_total_xp(total_xp):
        """Calcule le niveau atteint avec un total XP donne."""
        if total_xp <= 0:
            return 0
        return int(math.sqrt(total_xp / 75))

    @staticmethod
    def progress_in_level(current_level, xp_into_level, learned_curve=None):
        """Pourcentage de progression dans le niveau actuel."""
        needed = XPCurve.xp_for_level(current_level, learned_curve)
        if needed <= 0:
            return 0
        return min(100, (xp_into_level / needed) * 100)

    @staticmethod
    def eta_to_target(current_level, xp_remaining_this_level, target_level, xp_per_hour, learned_curve=None):
        """Temps estime (en secondes) pour atteindre target_level."""
        if xp_per_hour <= 0 or target_level <= current_level:
            return 0
        xp_needed = xp_remaining_this_level
        if target_level > current_level + 1:
            xp_needed += XPCurve.xp_from_to(current_level + 1, target_level, learned_curve)
        return (xp_needed / xp_per_hour) * 3600


class SmartInventory:
    def __init__(self, db):
        self.db = db
        self._inv = defaultdict(int)
        self._prices = {}
        self._manual_price_items = set()
        self._manual_qty = defaultdict(int)
        self._notes = {}
        self._manual_label = {}
        self._manual_icon_url = {}
        self._total_drops = defaultdict(int)
        self._total_losses = defaultdict(int)
        self._total_uses = defaultdict(int)
        self._total_sales = defaultdict(int)
        self._total_crafts = defaultdict(int)
        self._sale_kamas = defaultdict(int)
        self.lock = threading.Lock()
        rows = db.query(
            "SELECT item_name, manual_qty, manual_price, notes, manual_label, manual_icon_url FROM user_items"
        )
        for name, manual_qty, price, notes, manual_label, manual_icon_url in rows:
            if price and price > 0:
                self._prices[name] = price
                self._manual_price_items.add(name)
            if manual_qty:
                self._manual_qty[name] = int(manual_qty)
            if notes:
                self._notes[name] = notes
            if manual_label:
                self._manual_label[name] = manual_label
            if manual_icon_url:
                self._manual_icon_url[name] = manual_icon_url

    def add_drop(self, item, qty, ts):
        with self.lock:
            self._inv[item] += qty
            self._total_drops[item] += qty

    def add_loss(self, item, qty, ts):
        with self.lock:
            self._inv[item] -= qty
            self._total_losses[item] += qty

    def add_use(self, item, ts):
        with self.lock:
            self._inv[item] -= 1
            self._total_uses[item] += 1

    def add_sale(self, item, qty, total, ts):
        with self.lock:
            self._inv[item] -= qty
            self._total_sales[item] += qty
            self._sale_kamas[item] += total
            if qty > 0:
                self._prices[item] = total / qty
        self.db.execute(
            "INSERT INTO market_prices (item_name, unit_price, quantity, total_price, recorded_at, source) VALUES (?,?,?,?,?,?)",
            (item, total / max(qty, 1), qty, total, ts, "hdv_sale"),
        )

    def add_craft(self, recipe, ts):
        with self.lock:
            self._inv[recipe] += 1
            self._total_crafts[recipe] += 1

    def set_manual_price(self, item, price):
        with self.lock:
            self._prices[item] = price
            if price > 0:
                self._manual_price_items.add(item)
            elif item in self._manual_price_items:
                self._manual_price_items.discard(item)
        self.db.execute(
            """
            INSERT INTO user_items (item_name, manual_price, last_updated)
            VALUES (?,?,?)
            ON CONFLICT(item_name) DO UPDATE SET
                manual_price=excluded.manual_price,
                last_updated=excluded.last_updated
            """,
            (item, price, datetime.now().isoformat()),
        )

    def set_item_meta(self, item, manual_qty=None, notes=None, manual_label=None, manual_icon_url=None):
        with self.lock:
            cur_qty = self._manual_qty.get(item, 0)
            cur_notes = self._notes.get(item, "")
            cur_label = self._manual_label.get(item, "")
            cur_icon = self._manual_icon_url.get(item, "")

            if manual_qty is not None:
                self._manual_qty[item] = int(manual_qty)
                cur_qty = self._manual_qty[item]
            if notes is not None:
                if notes:
                    self._notes[item] = notes
                    cur_notes = notes
                elif item in self._notes:
                    self._notes.pop(item, None)
                    cur_notes = ""
            if manual_label is not None:
                if manual_label:
                    self._manual_label[item] = manual_label
                    cur_label = manual_label
                elif item in self._manual_label:
                    self._manual_label.pop(item, None)
                    cur_label = ""
            if manual_icon_url is not None:
                if manual_icon_url:
                    self._manual_icon_url[item] = manual_icon_url
                    cur_icon = manual_icon_url
                elif item in self._manual_icon_url:
                    self._manual_icon_url.pop(item, None)
                    cur_icon = ""

        self.db.execute(
            """
            INSERT INTO user_items (item_name, manual_qty, notes, manual_label, manual_icon_url, last_updated)
            VALUES (?,?,?,?,?,?)
            ON CONFLICT(item_name) DO UPDATE SET
                manual_qty=excluded.manual_qty,
                notes=excluded.notes,
                manual_label=excluded.manual_label,
                manual_icon_url=excluded.manual_icon_url,
                last_updated=excluded.last_updated
            """,
            (
                item,
                int(cur_qty),
                cur_notes,
                cur_label,
                cur_icon,
                datetime.now().isoformat(),
            ),
        )

    def get_snapshot(self):
        with self.lock:
            all_items = (
                set(self._inv.keys())
                | set(self._manual_qty.keys())
                | set(self._notes.keys())
                | set(self._manual_label.keys())
                | set(self._manual_icon_url.keys())
            )
            items = {}
            corrected = {}
            for item in all_items:
                items[item] = self._inv.get(item, 0) + self._manual_qty.get(item, 0)
                corrected[item] = bool(
                    self._manual_qty.get(item, 0)
                    or self._notes.get(item, "")
                    or self._manual_label.get(item, "")
                    or self._manual_icon_url.get(item, "")
                    or (item in self._manual_price_items)
                )
            return {
                "items": items,
                "auto_items": dict(self._inv),
                "manual_qty": dict(self._manual_qty),
                "notes": dict(self._notes),
                "manual_label": dict(self._manual_label),
                "manual_icon_url": dict(self._manual_icon_url),
                "manual_price_items": list(self._manual_price_items),
                "corrected": corrected,
                "drops": dict(self._total_drops),
                "losses": dict(self._total_losses),
                "uses": dict(self._total_uses),
                "sales": dict(self._total_sales),
                "crafts": dict(self._total_crafts),
                "prices": dict(self._prices),
                "sale_kamas": dict(self._sale_kamas),
            }

    def get_estimated_value(self):
        with self.lock:
            total = 0
            all_items = set(self._inv.keys()) | set(self._manual_qty.keys())
            for item in all_items:
                qty = self._inv.get(item, 0) + self._manual_qty.get(item, 0)
                if qty > 0:
                    total += int(qty * self._prices.get(item, 0))
            return total


class Session:
    def __init__(self, db, inventory):
        self.db = db
        self.inventory = inventory
        self.start_time = datetime.now()
        self.lock = threading.Lock()
        self.xp_by_metier = defaultdict(int)
        self.xp_to_next = {}
        self.level_ups = []
        self._level_up_keys = set()
        self.kamas_gained = 0
        self.kamas_from_sales = 0
        self.fights = 0
        self._current_fight_id = "session"
        self._current_turn = 1
        self._combat_stats = {}
        self.crafts_success = 0
        self.plant_fails = 0
        self.recent_events = []
        cur = db.execute(
            "INSERT INTO sessions (started_at, character, server) VALUES (?,?,?)",
            (self.start_time.isoformat(), "L'Immortel", "Ogrest"),
        )
        self.session_id = cur.lastrowid if cur else 0

    def _curve_map(self):
        rows = self.db.query("SELECT level, xp_required, sample_count FROM xp_curve_levels")
        values = {}
        samples = {}
        for lvl, xp_req, count in rows:
            ilvl = int(lvl or 0)
            if ilvl < 0:
                continue
            values[ilvl] = float(xp_req or 0)
            samples[ilvl] = int(count or 0)
        return values, samples

    def learn_curve_level(self, level, xp_required, source="manual"):
        lvl = int(level or 0)
        xp_req = int(xp_required or 0)
        if lvl < 0 or xp_req <= 0:
            return
        now = datetime.now().isoformat()
        row = self.db.query(
            "SELECT xp_required, sample_count FROM xp_curve_levels WHERE level=?", (lvl,)
        )
        if row:
            prev_xp, prev_count = row[0]
            prev_xp = float(prev_xp or 0)
            prev_count = int(prev_count or 0)
            if prev_count <= 0 or prev_xp <= 0:
                new_xp = float(xp_req)
                new_count = 1
            else:
                new_count = prev_count + 1
                new_xp = ((prev_xp * prev_count) + xp_req) / new_count
            self.db.execute(
                "UPDATE xp_curve_levels SET xp_required=?, sample_count=?, updated_at=?, source=? WHERE level=?",
                (new_xp, new_count, now, source, lvl),
            )
        else:
            self.db.execute(
                "INSERT INTO xp_curve_levels (level, xp_required, sample_count, updated_at, source) VALUES (?,?,?,?,?)",
                (lvl, float(xp_req), 1, now, source),
            )

    def _evt(self, icon, text, ts):
        with self.lock:
            self.recent_events.append({"ts": ts, "icon": icon, "text": text})
            if len(self.recent_events) > 50:
                self.recent_events.pop(0)

    def _ensure_combat(self, fid):
        k = str(fid or "session")
        if k not in self._combat_stats:
            self._combat_stats[k] = {
                "fight_id": k,
                "started_at": "",
                "ended_at": "",
                "total_damage": 0,
                "turns": {},
            }
        return self._combat_stats[k]

    def handle_xp(self, ts, metier, xp, xp_next, leveled):
        with self.lock:
            self.xp_by_metier[metier] += xp
            if xp_next > 0:
                self.xp_to_next[metier] = xp_next
            if leveled:
                lvl_key = f"{metier}|{ts}"
                if lvl_key not in self._level_up_keys:
                    self._level_up_keys.add(lvl_key)
                    self.level_ups.append({"ts": ts, "metier": metier})
        self.db.execute(
            "INSERT INTO xp_events (session_id,timestamp,metier,xp_gained,xp_to_next,level_up) VALUES (?,?,?,?,?,?)",
            (self.session_id, ts, metier, xp, xp_next, 1 if leveled else 0),
        )
        lbl = " LEVEL UP!" if leveled else ""
        self._evt("LVL" if leveled else "XP", f"+{xp:,} XP {metier}{lbl}", ts)

    def handle_kamas(self, ts, amount):
        with self.lock:
            self.kamas_gained += amount
        self.db.execute(
            "INSERT INTO kamas_events (session_id,timestamp,amount,source) VALUES (?,?,?,?)",
            (self.session_id, ts, amount, "drop"),
        )
        self._evt("$", f"+{amount:,} kamas", ts)

    def handle_drop(self, ts, item, qty):
        self.inventory.add_drop(item, qty, ts)
        self.db.execute(
            "INSERT INTO drop_events (session_id,timestamp,item_name,quantity) VALUES (?,?,?,?)",
            (self.session_id, ts, item, qty),
        )
        self._evt("+", f"+{qty}x {item}", ts)

    def handle_loss(self, ts, item, qty):
        self.inventory.add_loss(item, qty, ts)
        self.db.execute(
            "INSERT INTO loss_events (session_id,timestamp,item_name,quantity,reason) VALUES (?,?,?,?,?)",
            (self.session_id, ts, item, qty, "lost"),
        )
        self._evt("-", f"-{qty}x {item}", ts)

    def handle_use(self, ts, item):
        self.inventory.add_use(item, ts)
        self.db.execute(
            "INSERT INTO use_events (session_id,timestamp,item_name,quantity) VALUES (?,?,?,?)",
            (self.session_id, ts, item, 1),
        )
        self._evt("USE", f"Utilise: {item}", ts)

    def handle_sale(self, ts, item, qty, total):
        self.inventory.add_sale(item, qty, total, ts)
        with self.lock:
            self.kamas_from_sales += total
        self.db.execute(
            "INSERT INTO sale_events (session_id,timestamp,item_name,quantity,total_kamas) VALUES (?,?,?,?,?)",
            (self.session_id, ts, item, qty, total),
        )
        unit = total // max(qty, 1)
        self._evt("HDV", f"Vendu {qty}x {item} = {total:,} kamas ({unit:,}/u)", ts)

    def handle_craft(self, ts, recipe):
        self.inventory.add_craft(recipe, ts)
        with self.lock:
            self.crafts_success += 1
        self.db.execute(
            "INSERT INTO craft_events (session_id,timestamp,recipe_name,success) VALUES (?,?,?,?)",
            (self.session_id, ts, recipe, 1),
        )
        self._evt("CRF", f"Craft: {recipe}", ts)

    def handle_fight(self, ts, fid):
        with self.lock:
            self.fights += 1
            combat = self._ensure_combat(fid)
            if not combat["started_at"]:
                combat["started_at"] = ts
            combat["ended_at"] = ts
            self._current_fight_id = str(fid)
            self._current_turn = 1
        self.db.execute(
            "INSERT INTO fight_events (session_id,timestamp,fight_id) VALUES (?,?,?)",
            (self.session_id, ts, fid),
        )
        self._evt("FGT", f"Combat #{fid}", ts)

    def handle_fight_start(self, ts, fid):
        with self.lock:
            self._current_fight_id = str(fid)
            self._current_turn = 1
            combat = self._ensure_combat(fid)
            if not combat["started_at"]:
                combat["started_at"] = ts

    def handle_fight_turn(self, ts, turn):
        with self.lock:
            self._current_turn = max(1, int(turn or 1))
            combat = self._ensure_combat(self._current_fight_id)
            tk = str(self._current_turn)
            if tk not in combat["turns"]:
                combat["turns"][tk] = {"turn": self._current_turn, "total_damage": 0, "skills": {}}

    def handle_damage(self, ts, amount, skill="(non precise)", turn=None):
        dmg = int(amount or 0)
        if dmg <= 0:
            return
        with self.lock:
            if turn is not None:
                self._current_turn = max(1, int(turn or 1))
            fight_id = self._current_fight_id or "session"
            combat = self._ensure_combat(fight_id)
            tk = str(self._current_turn)
            if tk not in combat["turns"]:
                combat["turns"][tk] = {"turn": self._current_turn, "total_damage": 0, "skills": {}}
            turn_data = combat["turns"][tk]
            turn_data["total_damage"] += dmg
            skill_key = str(skill or "(non precise)").strip() or "(non precise)"
            turn_data["skills"][skill_key] = int(turn_data["skills"].get(skill_key, 0)) + dmg
            combat["total_damage"] += dmg

    def handle_plant_fail(self, ts):
        with self.lock:
            self.plant_fails += 1
        self._evt("!", "Plantation echouee", ts)

    def snapshot(self):
        with self.lock:
            from datetime import timedelta

            elapsed = (datetime.now() - self.start_time).total_seconds()
            h = max(elapsed / 3600, 0.001)
            xp_total = sum(self.xp_by_metier.values())
            metiers = {}
            curve_values, curve_samples = self._curve_map()
            lvl_rows = self.db.query(
                "SELECT metier, current_level, current_xp, target_level, manual_truth FROM metier_levels"
            )

            db_by_norm = {}
            for row in lvl_rows:
                m_name = str(row[0] or "").strip()
                nk = normalize_name(m_name)
                if not nk:
                    continue
                db_by_norm[nk] = {
                    "name": m_name,
                    "level": int(row[1] or 0),
                    "xp": int(row[2] or 0),
                    "target": int(row[3] or 0),
                    "manual_truth": bool(int(row[4] or 0)),
                }

            xp_by_norm = defaultdict(int)
            xp_next_by_norm = {}
            display_name_by_norm = {}
            for raw_name, v in self.xp_by_metier.items():
                nk = normalize_name(raw_name)
                if not nk:
                    continue
                xp_by_norm[nk] += int(v or 0)
                if nk not in display_name_by_norm:
                    display_name_by_norm[nk] = raw_name
            for raw_name, v in self.xp_to_next.items():
                nk = normalize_name(raw_name)
                if not nk:
                    continue
                xp_next_by_norm[nk] = int(v or 0)

            level_ups_by_norm = defaultdict(int)
            for lu in self.level_ups:
                nk = normalize_name(lu.get("metier", ""))
                if nk:
                    level_ups_by_norm[nk] += 1

            all_norms = set(xp_by_norm.keys()) | set(db_by_norm.keys())

            for nk in sorted(all_norms):
                dbm = db_by_norm.get(nk)
                m = dbm["name"] if dbm else display_name_by_norm.get(nk, nk)
                xp = xp_by_norm.get(nk, 0)
                xp_h = int(xp / h)
                xp_next = xp_next_by_norm.get(nk, 0)
                eta_s = (xp_next / xp_h * 3600) if xp_h > 0 and xp_next > 0 else 0
                pct = min(99, max(0, (1 - xp_next / (xp_next + xp)) * 100)) if xp_next > 0 else 0
                base_level = dbm["level"] if dbm else 0
                base_xp_input = dbm["xp"] if dbm else 0
                target_lvl = dbm["target"] if dbm else 0
                manual_truth = bool(dbm["manual_truth"]) if dbm else False
                lvl_ups_count = int(level_ups_by_norm.get(nk, 0))
                real_level = base_level if manual_truth else base_level + lvl_ups_count

                xp_for_this_lvl = XPCurve.xp_for_level(real_level, curve_values)
                xp_into_level = (
                    max(0, xp_for_this_lvl - xp_next)
                    if xp_next > 0
                    else max(0, min(xp_for_this_lvl, base_xp_input))
                )
                pct_level = (
                    XPCurve.progress_in_level(real_level, xp_into_level, curve_values)
                    if xp_next > 0
                    else pct
                )

                eta_target = 0
                if target_lvl > real_level and xp_h > 0:
                    eta_target = XPCurve.eta_to_target(
                        real_level, xp_next, target_lvl, xp_h, curve_values
                    )

                xp_to_target = (
                    XPCurve.xp_from_to(real_level, target_lvl, curve_values)
                    if target_lvl > real_level
                    else 0
                )
                curve_source = "learned" if int(real_level) in curve_values else "formula"
                curve_sample_count = int(curve_samples.get(int(real_level), 0))

                metiers[m] = {
                    "xp": xp,
                    "xp_h": xp_h,
                    "xp_next": xp_next,
                    "eta_s": eta_s,
                    "pct": pct,
                    "level": real_level,
                    "base_level": base_level,
                    "target_level": target_lvl,
                    "base_xp": int(base_xp_input or 0),
                    "pct_level": round(pct_level, 1),
                    "xp_for_this_lvl": xp_for_this_lvl,
                    "xp_into_level": xp_into_level,
                    "eta_target": eta_target,
                    "xp_to_target": xp_to_target,
                    "curve_source": curve_source,
                    "curve_sample_count": curve_sample_count,
                    "level_ups_session": lvl_ups_count,
                    "manual_truth": manual_truth,
                }
            combats = []
            for fid, raw in self._combat_stats.items():
                turns = []
                for tk, tr in raw["turns"].items():
                    skills = [{"name": sk, "damage": int(sd)} for sk, sd in tr["skills"].items()]
                    skills.sort(key=lambda x: x["damage"], reverse=True)
                    turns.append(
                        {
                            "turn": int(tr["turn"]),
                            "total_damage": int(tr["total_damage"]),
                            "skills": skills,
                        }
                    )
                turns.sort(key=lambda x: x["turn"])
                combats.append(
                    {
                        "fight_id": raw["fight_id"],
                        "started_at": raw["started_at"],
                        "ended_at": raw["ended_at"],
                        "total_damage": int(raw["total_damage"]),
                        "turns": turns,
                    }
                )
            combats.sort(key=lambda x: x["fight_id"], reverse=True)
            return {
                "elapsed": int(elapsed),
                "elapsed_str": str(timedelta(seconds=int(elapsed))),
                "xp_total": xp_total,
                "xp_per_hour": int(xp_total / h),
                "metiers": metiers,
                "level_ups": list(self.level_ups),
                "kamas_gained": self.kamas_gained,
                "kamas_from_sales": self.kamas_from_sales,
                "kamas_per_hour": int(self.kamas_gained / h),
                "fights": self.fights,
                "crafts": self.crafts_success,
                "plant_fails": self.plant_fails,
                "combats": combats,
                "curve_levels": {str(int(k)): int(round(v)) for k, v in curve_values.items()},
                "curve_samples": {str(int(k)): int(v) for k, v in curve_samples.items()},
                "recent_events": list(self.recent_events[-20:]),
            }
