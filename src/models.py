"""Session state models for the Wakfu Companion backend."""

from __future__ import annotations

import time
from dataclasses import dataclass, field
from typing import Any


@dataclass
class Skill:
    name: str
    damage: int

    def to_dict(self) -> dict[str, Any]:
        return {"name": self.name, "damage": self.damage}


@dataclass
class CombatTurn:
    turn: int
    total_damage: int = 0
    skills: list[Skill] = field(default_factory=list)

    def to_dict(self) -> dict[str, Any]:
        return {
            "turn": self.turn,
            "total_damage": self.total_damage,
            "skills": [s.to_dict() for s in self.skills],
        }


@dataclass
class Combat:
    fight_id: str
    total_damage: int = 0
    turns: list[CombatTurn] = field(default_factory=list)

    def to_dict(self) -> dict[str, Any]:
        return {
            "fight_id": self.fight_id,
            "total_damage": self.total_damage,
            "turns": [t.to_dict() for t in self.turns],
        }


@dataclass
class Event:
    ts: str
    icon: str
    text: str

    def to_dict(self) -> dict[str, Any]:
        return {"ts": self.ts, "icon": self.icon, "text": self.text}


@dataclass
class Metier:
    """Profession tracking: XP, level, progression rate."""

    name: str
    level: int = 0
    xp: int = 0               # XP gained this session
    xp_h: int = 0             # XP per hour (computed)
    xp_next: int = 0          # XP remaining to next level
    target_level: int = 0
    pct: float = 0.0           # progress toward next level (%)
    eta_s: float = 0.0         # seconds to next level
    eta_target: float = 0.0    # seconds to target level

    def to_dict(self) -> dict[str, Any]:
        return {
            "level": self.level,
            "xp": self.xp,
            "xp_h": self.xp_h,
            "xp_next": self.xp_next,
            "target_level": self.target_level,
            "pct": self.pct,
            "eta_s": self.eta_s,
            "eta_target": self.eta_target,
        }


@dataclass
class LevelUp:
    metier: str
    ts: str

    def to_dict(self) -> dict[str, Any]:
        return {"metier": self.metier, "ts": self.ts}


@dataclass
class Inventory:
    """Tracks item net quantities (gained - lost) during the session."""

    items: dict[str, int] = field(default_factory=dict)           # name -> net qty
    prices: dict[str, float] = field(default_factory=dict)        # name -> unit price
    manual_qty: dict[str, int] = field(default_factory=dict)      # manual overrides
    notes: dict[str, str] = field(default_factory=dict)           # user notes

    def add_item(self, name: str, qty: int) -> None:
        self.items[name] = self.items.get(name, 0) + qty

    def to_dict(self) -> dict[str, Any]:
        return {
            "items": dict(self.items),
            "prices": dict(self.prices),
            "manual_qty": dict(self.manual_qty),
            "notes": dict(self.notes),
        }


@dataclass
class SessionState:
    """Complete mutable state for one assistant session."""

    start_time: float = field(default_factory=time.time)
    fights: int = 0
    crafts: int = 0
    kamas_gained: int = 0       # from drops/loot
    kamas_from_sales: int = 0   # from market sales
    inventory: Inventory = field(default_factory=Inventory)
    metiers: dict[str, Metier] = field(default_factory=dict)
    level_ups: list[LevelUp] = field(default_factory=list)
    combats: list[Combat] = field(default_factory=list)
    recent_events: list[Event] = field(default_factory=list)
    _current_combat: Combat | None = field(default=None, repr=False, compare=False)

    # ── helpers ──────────────────────────────────────────────────

    def elapsed_seconds(self) -> float:
        return time.time() - self.start_time

    def elapsed_str(self) -> str:
        s = int(self.elapsed_seconds())
        if s < 60:
            return f"~{s}s"
        if s < 3600:
            return f"~{s // 60}m"
        h = s // 3600
        m = (s % 3600) // 60
        return f"~{h}h{str(m).zfill(2)}m"

    def add_event(self, icon: str, text: str, ts: str) -> None:
        self.recent_events.append(Event(ts=ts, icon=icon, text=text))

    def add_or_update_metier(
        self,
        name: str,
        xp_delta: int = 0,
        level: int | None = None,
        target_level: int | None = None,
    ) -> None:
        m = self.metiers.setdefault(name, Metier(name=name))
        m.xp += xp_delta
        if level is not None:
            m.level = level
        if target_level is not None:
            m.target_level = target_level
        self._recompute_metier_rates(m)

    def _recompute_metier_rates(self, m: Metier) -> None:
        elapsed = self.elapsed_seconds()
        if elapsed > 0:
            m.xp_h = int(m.xp / elapsed * 3600)
        # Approximate XP required for next level (Wakfu formula approximation)
        # Level N requires roughly 1000 * N^1.4 XP
        if m.level > 0:
            xp_for_next = int(1000 * (m.level ** 1.4))
            if xp_for_next > 0:
                xp_in_level = m.xp % xp_for_next
                m.xp_next = max(0, xp_for_next - xp_in_level)
                m.pct = min(100.0, xp_in_level / xp_for_next * 100)
            else:
                m.xp_next = 0
                m.pct = 0.0
            if m.xp_h > 0:
                m.eta_s = m.xp_next / m.xp_h * 3600
                if m.target_level > m.level:
                    levels_to_go = m.target_level - m.level
                    avg_xp_per_level = int(1000 * ((m.level + levels_to_go / 2) ** 1.4))
                    m.eta_target = avg_xp_per_level * levels_to_go / m.xp_h * 3600

    def start_combat(self, fight_id: str) -> Combat:
        c = Combat(fight_id=fight_id)
        self._current_combat = c
        self.combats.append(c)
        self.fights += 1
        return c

    def get_or_start_combat(self, fight_id: str) -> Combat:
        if self._current_combat and self._current_combat.fight_id == fight_id:
            return self._current_combat
        return self.start_combat(fight_id)

    def end_combat(self) -> None:
        self._current_combat = None

    def inv_value(self) -> int:
        """Estimated inventory value from prices."""
        total = 0
        for name, qty in self.inventory.items.items():
            if qty > 0:
                price = self.inventory.prices.get(name, 0)
                total += int(qty * price)
        return total

    def to_dict(self) -> dict[str, Any]:
        return {
            "elapsed_str": self.elapsed_str(),
            "fights": self.fights,
            "crafts": self.crafts,
            "kamas_gained": self.kamas_gained,
            "kamas_from_sales": self.kamas_from_sales,
            "metiers": {k: v.to_dict() for k, v in self.metiers.items()},
            "level_ups": [lu.to_dict() for lu in self.level_ups],
            "combats": [c.to_dict() for c in self.combats],
            "recent_events": [e.to_dict() for e in self.recent_events],
        }
