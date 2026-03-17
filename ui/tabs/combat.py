# ui/tabs/combat.py — Onglet Combat
# 4 panneaux : Sorts, Monstres, Combos 1 tour, Sessions XP/h

from __future__ import annotations

import time
from collections import Counter

from PyQt5.QtWidgets import (
    QWidget, QVBoxLayout, QHBoxLayout, QLabel, QFrame,
    QScrollArea, QSizePolicy, QGridLayout, QApplication,
)
from PyQt5.QtCore import Qt, QRectF, QTimer
from PyQt5.QtGui import QFont, QColor, QPainter, QBrush, QLinearGradient

from ui.tabs.base import BaseTab
from ui.theme import (
    BORDER, TEAL, TEAL_BRIGHT, TEXT, TEXT_DIM, RED,
    FONT_TITLE, FONT_BODY, FONT_LABEL,
    BG_PANEL, BG_PANEL2,
)


def _fmt_xp(v: int) -> str:
    if v >= 1_000_000_000:
        return f"{v/1_000_000_000:.2f}G"
    if v >= 1_000_000:
        return f"{v/1_000_000:.1f}M"
    if v >= 1_000:
        return f"{v//1_000}K"
    return str(v)


def _fmt_dur(s: int) -> str:
    if s < 60:
        return f"{s}s"
    h, r = divmod(s, 3600)
    m, _ = divmod(r, 60)
    if h:
        return f"{h}h{m:02d}"
    return f"{m}min"


# ── Barre de proportion ───────────────────────────────────────────────────────

class _Bar(QWidget):
    def __init__(self, color: str = TEAL, parent=None):
        super().__init__(parent)
        self._ratio = 0.0
        self._color = color
        self.setFixedHeight(6)
        self.setSizePolicy(QSizePolicy.Expanding, QSizePolicy.Fixed)

    def set_ratio(self, r: float):
        self._ratio = max(0.0, min(1.0, r))
        self.update()

    def paintEvent(self, _):
        p = QPainter(self)
        p.setRenderHint(QPainter.Antialiasing)
        w, h = self.width(), self.height()
        # track
        p.setBrush(QColor(BORDER))
        p.setPen(Qt.NoPen)
        p.drawRoundedRect(QRectF(0, 0, w, h), 3, 3)
        # fill
        fw = max(0, int(w * self._ratio))
        if fw:
            grad = QLinearGradient(0, 0, fw, 0)
            grad.setColorAt(0, QColor(self._color))
            grad.setColorAt(1, QColor(TEAL_BRIGHT))
            p.setBrush(QBrush(grad))
            p.drawRoundedRect(QRectF(0, 0, fw, h), 3, 3)


# ── Panneau générique ─────────────────────────────────────────────────────────

class _Panel(QFrame):
    def __init__(self, title: str, icon: str, parent=None):
        super().__init__(parent)
        self.setStyleSheet(f"""
            QFrame {{
                background: rgba(255,255,255,0.02);
                border: 1px solid {BORDER};
                border-radius: 10px;
            }}
        """)
        self.setSizePolicy(QSizePolicy.Expanding, QSizePolicy.Expanding)

        root = QVBoxLayout(self)
        root.setContentsMargins(12, 10, 12, 10)
        root.setSpacing(6)

        hdr = QHBoxLayout()
        icon_lbl = QLabel(icon)
        icon_lbl.setStyleSheet("font-size: 15px; background: transparent;")
        title_lbl = QLabel(title)
        title_lbl.setFont(QFont(FONT_LABEL, 9))
        title_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-weight: 700; letter-spacing: 1px; background: transparent;")
        hdr.addWidget(icon_lbl)
        hdr.addWidget(title_lbl, 1)
        root.addLayout(hdr)

        sep = QFrame()
        sep.setFrameShape(QFrame.HLine)
        sep.setStyleSheet(f"color: {BORDER}; background: {BORDER}; max-height: 1px;")
        root.addWidget(sep)

        self._content = QVBoxLayout()
        self._content.setSpacing(4)
        self._content.setContentsMargins(0, 0, 0, 0)
        root.addLayout(self._content, 1)

    def clear_content(self):
        while self._content.count():
            item = self._content.takeAt(0)
            if item.widget():
                item.widget().deleteLater()

    def add_row(self, left: str, right: str, ratio: float = 0.0, color: str = TEAL):
        row = QWidget()
        row.setStyleSheet("background: transparent;")
        rl = QVBoxLayout(row)
        rl.setContentsMargins(0, 0, 0, 0)
        rl.setSpacing(1)

        text_row = QHBoxLayout()
        text_row.setContentsMargins(0, 0, 0, 0)
        l = QLabel(left)
        l.setFont(QFont(FONT_LABEL, 9))
        l.setStyleSheet(f"color: {TEXT}; background: transparent;")
        l.setSizePolicy(QSizePolicy.Expanding, QSizePolicy.Fixed)
        r = QLabel(right)
        r.setFont(QFont(FONT_LABEL, 9))
        r.setStyleSheet(f"color: {TEAL_BRIGHT}; background: transparent;")
        r.setAlignment(Qt.AlignRight)
        text_row.addWidget(l)
        text_row.addWidget(r)
        rl.addLayout(text_row)

        if ratio > 0:
            bar = _Bar(color)
            bar.set_ratio(ratio)
            rl.addWidget(bar)

        self._content.addWidget(row)

    def add_combo_row(self, spells: list[str], ts: str):
        row = QWidget()
        row.setStyleSheet("background: transparent;")
        rl = QVBoxLayout(row)
        rl.setContentsMargins(0, 0, 0, 0)
        rl.setSpacing(2)

        # Spell chain
        chain = " › ".join(spells[:6])
        if len(spells) > 6:
            chain += f" +{len(spells)-6}"
        chain_lbl = QLabel(chain)
        chain_lbl.setFont(QFont(FONT_LABEL, 8))
        chain_lbl.setStyleSheet(f"color: {TEXT}; background: transparent;")
        chain_lbl.setWordWrap(True)

        meta_lbl = QLabel(f"{len(spells)} sorts différents · {ts[:10]}")
        meta_lbl.setFont(QFont(FONT_LABEL, 7))
        meta_lbl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")

        rl.addWidget(chain_lbl)
        rl.addWidget(meta_lbl)
        self._content.addWidget(row)

    def add_session_row(self, xph: int, total_xp: int, duration_s: int, ts: str, count: int):
        row = QWidget()
        row.setStyleSheet("background: transparent;")
        rl = QVBoxLayout(row)
        rl.setContentsMargins(0, 0, 0, 0)
        rl.setSpacing(2)

        top = QHBoxLayout()
        top.setContentsMargins(0, 0, 0, 0)
        xph_lbl = QLabel(f"⚡ {_fmt_xp(xph)} XP/h")
        xph_lbl.setFont(QFont(FONT_LABEL, 10))
        xph_lbl.setStyleSheet(f"color: {TEAL_BRIGHT}; font-weight: 700; background: transparent;")
        dur_lbl = QLabel(_fmt_dur(duration_s))
        dur_lbl.setFont(QFont(FONT_LABEL, 9))
        dur_lbl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")
        dur_lbl.setAlignment(Qt.AlignRight)
        top.addWidget(xph_lbl, 1)
        top.addWidget(dur_lbl)
        rl.addLayout(top)

        meta = QLabel(f"{_fmt_xp(total_xp)} XP total · {count} combat(s) · {ts[:10]}")
        meta.setFont(QFont(FONT_LABEL, 7))
        meta.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")
        rl.addWidget(meta)
        self._content.addWidget(row)

    def set_empty(self, msg: str = "Aucune donnée"):
        lbl = QLabel(msg)
        lbl.setFont(QFont(FONT_LABEL, 9))
        lbl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")
        lbl.setAlignment(Qt.AlignCenter)
        self._content.addWidget(lbl)


# ── Onglet Combat ─────────────────────────────────────────────────────────────

class CombatTab(BaseTab):

    def __init__(self, parent: QWidget | None = None):
        super().__init__(parent)
        self._char_name: str | None = None
        # Runtime counters
        self._rt_spell_counts: dict[str, int] = {}
        self._rt_killed_by:    dict[str, int] = {}   # monstre → fois tué joueur
        self._rt_damage_by:    dict[str, int] = {}   # monstre → dégâts totaux sur joueur
        self._rt_xp_events:    list[dict]     = []
        self._rt_current_turn: list[str]      = []
        self._rt_last_spell_ts: float | None  = None
        self._rt_best_combos:  list[dict]     = []
        self._rt_combat_count: int            = 0

        self._build_ui()

    # ── Construction ─────────────────────────────────────────────────

    def _build_ui(self):
        root = QVBoxLayout(self)
        root.setContentsMargins(12, 10, 12, 10)
        root.setSpacing(8)

        # Header
        hdr = QHBoxLayout()
        title = QLabel("Combat")
        title.setFont(QFont(FONT_TITLE, 14))
        title.setStyleSheet(f"color: {TEAL_BRIGHT}; background: transparent;")
        self._char_lbl = QLabel("")
        self._char_lbl.setFont(QFont(FONT_LABEL, 9))
        self._char_lbl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")
        hdr.addWidget(title)
        hdr.addStretch()
        hdr.addWidget(self._char_lbl, 0, Qt.AlignBottom)
        root.addLayout(hdr)

        # 2x2 grid of panels
        grid = QGridLayout()
        grid.setSpacing(8)

        self._p_spells   = _Panel("SORTS LES PLUS UTILISÉS",        "✨")
        self._p_monsters = _Panel("MONSTRES LES PLUS DANGEREUX",   "☠")
        self._p_combos   = _Panel("MEILLEURS COMBOS EN 1 TOUR",    "⚔")
        self._p_xph      = _Panel("COMBATS LES PLUS RENTABLES",    "⚡")

        grid.addWidget(self._p_spells,   0, 0)
        grid.addWidget(self._p_monsters, 0, 1)
        grid.addWidget(self._p_combos,   1, 0)
        grid.addWidget(self._p_xph,      1, 1)

        grid.setRowStretch(0, 1)
        grid.setRowStretch(1, 1)
        grid.setColumnStretch(0, 1)
        grid.setColumnStretch(1, 1)

        root.addLayout(grid, 1)

        # Bloc dedie aux groupes rentables / routes donjons
        self._p_routes = _Panel("SELECTION DES MEILLEURS GROUPES RENTABLES", "🏛")
        root.addWidget(self._p_routes)

        # Seed with empty state
        self._refresh_all_panels()

    # ── API publique ─────────────────────────────────────────────────

    def set_character_name(self, name: str | None):
        self._char_name = name
        self._char_lbl.setText(name or "")

    def load_history(self, stats: dict):
        """Called once at startup with data from query_combat_stats()."""
        self._rt_spell_counts  = dict(stats.get("spell_counts", {}))
        self._rt_killed_by     = dict(stats.get("killed_by", {}))
        self._rt_damage_by     = dict(stats.get("damage_by", {}))
        self._rt_xp_events     = list(stats.get("xp_events", []))
        self._rt_best_combos   = list(stats.get("turn_combos", []))
        self._rt_combat_count  = len(self._rt_xp_events)
        self._refresh_all_panels()

    def on_spell_cast(self, spell: str):
        """Called from window.py on live spell_cast event."""
        self._rt_spell_counts[spell] = self._rt_spell_counts.get(spell, 0) + 1
        # Turn detection
        now = time.time()
        if self._rt_last_spell_ts is not None and (now - self._rt_last_spell_ts) > 35:
            # New turn — save previous
            if len(self._rt_current_turn) >= 2:
                unique = list(dict.fromkeys(self._rt_current_turn))
                if len(unique) >= 2:
                    self._rt_best_combos.append({
                        "spells": unique,
                        "count":  len(unique),
                        "ts":     time.strftime("%Y-%m-%d %H:%M:%S"),
                    })
                    self._rt_best_combos.sort(key=lambda x: x["count"], reverse=True)
                    self._rt_best_combos = self._rt_best_combos[:5]
            self._rt_current_turn = []
        self._rt_current_turn.append(spell)
        self._rt_last_spell_ts = now
        self._refresh_spells_panel()

    def on_xp_combat(self, xp: int, xp_to_next: int):
        """Called from window.py on live xp_combat event."""
        self._rt_xp_events.append({
            "ts":         time.strftime("%Y-%m-%d %H:%M:%S"),
            "xp":         xp,
            "xp_to_next": xp_to_next,
        })
        self._rt_combat_count += 1
        self._refresh_xph_panel()

    def on_monster_death(self, monster: str):
        pass  # plus utilisé, gardé pour compatibilité

    def on_player_damage(self, attacker: str, amount: int):
        """Monstre a infligé des dégâts au joueur."""
        self._rt_damage_by[attacker] = self._rt_damage_by.get(attacker, 0) + amount
        self._refresh_monsters_panel()

    def on_player_killed_by(self, attacker: str):
        """Joueur est mort, tué par ce monstre."""
        self._rt_killed_by[attacker] = self._rt_killed_by.get(attacker, 0) + 1
        self._refresh_monsters_panel()

    # ── Refresh ──────────────────────────────────────────────────────

    def _refresh_all_panels(self):
        self._refresh_spells_panel()
        self._refresh_monsters_panel()
        self._refresh_combos_panel()
        self._refresh_xph_panel()
        self._refresh_routes_panel()

    def _refresh_spells_panel(self):
        self._p_spells.clear_content()
        if not self._rt_spell_counts:
            self._p_spells.set_empty()
            return
        top = sorted(self._rt_spell_counts.items(), key=lambda x: x[1], reverse=True)[:8]
        max_v = top[0][1] if top else 1
        for spell, count in top:
            self._p_spells.add_row(spell, str(count), count / max_v, TEAL)

    def _refresh_monsters_panel(self):
        self._p_monsters.clear_content()
        has_kills  = bool(self._rt_killed_by)
        has_damage = bool(self._rt_damage_by)
        if not has_kills and not has_damage:
            self._p_monsters.set_empty("Aucune donnée (nécessite un combat live)")
            return

        if has_kills:
            # Sous-titre "M'a le plus tué"
            sub1 = QLabel("☠  M'A LE PLUS TUÉ")
            sub1.setFont(QFont(FONT_LABEL, 7))
            sub1.setStyleSheet(f"color: {TEXT_DIM}; font-weight: 700; letter-spacing: 1px; background: transparent;")
            self._p_monsters._content.addWidget(sub1)
            top_kills = sorted(self._rt_killed_by.items(), key=lambda x: x[1], reverse=True)[:4]
            max_k = top_kills[0][1]
            for name, count in top_kills:
                self._p_monsters.add_row(name, f"×{count} mort(s)", count / max_k, "#e05050")

        if has_damage:
            if has_kills:
                sep = QFrame()
                sep.setFrameShape(QFrame.HLine)
                sep.setStyleSheet(f"color: {BORDER}; background: {BORDER}; max-height: 1px;")
                self._p_monsters._content.addWidget(sep)
            sub2 = QLabel("💢  PLUS GROS DÉGÂTS")
            sub2.setFont(QFont(FONT_LABEL, 7))
            sub2.setStyleSheet(f"color: {TEXT_DIM}; font-weight: 700; letter-spacing: 1px; background: transparent;")
            self._p_monsters._content.addWidget(sub2)
            top_dmg = sorted(self._rt_damage_by.items(), key=lambda x: x[1], reverse=True)[:4]
            max_d = top_dmg[0][1]
            for name, amt in top_dmg:
                self._p_monsters.add_row(name, _fmt_xp(amt) + " PV", amt / max_d, "#c04080")

    def _refresh_combos_panel(self):
        self._p_combos.clear_content()
        if not self._rt_best_combos:
            self._p_combos.set_empty("Pas encore de combos détectés")
            return
        for combo in self._rt_best_combos[:4]:
            self._p_combos.add_combo_row(combo["spells"], combo["ts"])

    def _refresh_xph_panel(self):
        self._p_xph.clear_content()
        from core.permanent_journal import _compute_best_xp_sessions
        sessions = _compute_best_xp_sessions(self._rt_xp_events)
        if not sessions:
            self._p_xph.set_empty("Aucun combat enregistré")
            return
        for s in sessions[:4]:
            self._p_xph.add_session_row(
                s["xph"], s["total_xp"], s["duration_s"], s["ts"], s["count"]
            )

    def _refresh_routes_panel(self):
        self._p_routes.clear_content()
        self._p_routes.add_row(
            "Optimisation XP et Combat Rentable en Kama",
            "",
        )
        self._p_routes.add_row(
            "Combats rentables en Kama",
            "Meilleur ratio temps / profit",
        )
        self._p_routes.add_row(
            "Meilleurs groupes d'XP",
            "Zones a forte densite d'experience",
        )
        self._p_routes.add_row(
            "Donjons dangereux",
            "Haut risque, strategie avancee",
        )
        self._p_routes.add_row(
            "Nettoyage des donjons",
            "Ordre de parcours pour maximiser les gains",
        )
