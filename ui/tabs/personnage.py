# ui/tabs/personnage.py — Onglet Personnage (rework)

from __future__ import annotations

import time
from pathlib import Path

from PyQt5.QtCore import Qt, QSize, QRect, pyqtSignal
from PyQt5.QtGui import QPixmap, QIcon, QPainter, QColor, QLinearGradient, QFont, QPen
from PyQt5.QtWidgets import (
    QWidget,
    QVBoxLayout,
    QHBoxLayout,
    QLabel,
    QFrame,
    QPushButton,
    QSizePolicy,
    QStackedWidget,
)

from ui.tabs.base import BaseTab
from ui.theme import (
    TEAL,
    TEAL_BRIGHT,
    TEXT,
    TEXT_DIM,
    BORDER,
    GREEN,
    RED,
    FONT_TITLE,
    FONT_BODY,
    FONT_LABEL,
)
from ui.xp_styles import XP_PAINT_FN, paint_official_fallback, XP_STYLE_NAMES
from core.wakfu_tracker import GameState
from ui.titlebar import (
    _normalize_class_key,
    _CLASS_TO_ID,
    _CLASS_ICON_CACHE_DIR,
    _ZAAP_WAKFU_ICON,
    _extract_icon_from_wakfu_install,
    _extract_icon_from_wakfu_install_by_breed_id,
)

_ROOT = Path(__file__).resolve().parents[2]
_WAKASSETS_ICONS = _ROOT / "data" / "wakassets" / "breedsIcons"
_ILLUS_DIR = _ROOT / "data" / "ankama_official" / "wakassets" / "breedsIllusrations"
_EMOTE_DIR = _ROOT / "data" / "ankama_official" / "wakassets" / "emoteIconsPlayers"
_EMOTE_FALLBACK = _EMOTE_DIR / "041.png"

_TYPE_CYCLE = ["type_0", "type_1"]

_ZONE_BY_LEVEL: list[tuple[int, str]] = [
    (0, "Incarnam"),
    (16, "Astrub"),
    (26, "Amakna"),
    (46, "Sufokia"),
    (61, "Bonta / Brakmar"),
    (76, "Frigost"),
    (91, "Xelorium"),
    (106, "Moon Island"),
    (121, "Enurado"),
    (141, "Srambad"),
    (161, "Ingloriom"),
    (181, "Shhhudoku"),
    (196, "Hagen Duster"),
    (210, "Épreuves Ultimes"),
]


def _recommended_zone(level: int | None) -> str:
    if level is None:
        return "—"
    zone = _ZONE_BY_LEVEL[0][1]
    for min_lvl, name in _ZONE_BY_LEVEL:
        if level >= min_lvl:
            zone = name
    return zone


def _emote_path(breed_id: int, gender: str | None) -> Path:
    suffix = 1 if gender == "type_1" else 0
    return _EMOTE_DIR / f"{breed_id * 10 + suffix:03d}.png"


def _fmt_duration(seconds: int) -> str:
    h, r = divmod(max(0, int(seconds)), 3600)
    m, _ = divmod(r, 60)
    return f"{h}h{m:02d}" if h else f"{m}min"


def _fmt_xp(v: int) -> str:
    v = max(0, int(v))
    if v >= 1_000_000:
        return f"{v/1_000_000:.1f}M"
    if v >= 1_000:
        return f"{v//1_000}K"
    return str(v)


class _MiniBar(QWidget):
    def __init__(self, color: str = TEAL, parent=None):
        super().__init__(parent)
        self._ratio = 0.0
        self._color = color
        self.setFixedHeight(5)
        self.setSizePolicy(QSizePolicy.Expanding, QSizePolicy.Fixed)

    def set_ratio(self, ratio: float):
        self._ratio = max(0.0, min(1.0, float(ratio)))
        self.update()

    def paintEvent(self, _):
        p = QPainter(self)
        p.setRenderHint(QPainter.Antialiasing)
        w, h = self.width(), self.height()
        p.setPen(Qt.NoPen)
        p.setBrush(QColor(BORDER))
        p.drawRoundedRect(QRect(0, 0, w, h), 2, 2)

        fw = int(w * self._ratio)
        if fw > 0:
            grad = QLinearGradient(0, 0, fw, 0)
            grad.setColorAt(0, QColor(self._color).darker(130))
            grad.setColorAt(1, QColor(self._color))
            p.setBrush(grad)
            p.drawRoundedRect(QRect(0, 0, fw, h), 2, 2)


class _CombatInsightPanel(QFrame):
    def __init__(self, title: str, parent=None):
        super().__init__(parent)
        self.setStyleSheet(
            f"QFrame{{background: rgba(255,255,255,0.02); border: 1px solid {BORDER}; border-radius: 8px;}}"
        )
        self.setSizePolicy(QSizePolicy.Expanding, QSizePolicy.Expanding)

        root = QVBoxLayout(self)
        root.setContentsMargins(10, 8, 10, 8)
        root.setSpacing(5)

        hdr = QLabel(title)
        hdr.setFont(QFont(FONT_LABEL, 8))
        hdr.setStyleSheet(f"color: {TEXT_DIM}; font-weight: 700; letter-spacing: 0.7px; background: transparent;")
        root.addWidget(hdr)

        sep = QFrame()
        sep.setFrameShape(QFrame.HLine)
        sep.setStyleSheet(f"color: {BORDER}; background: {BORDER}; max-height: 1px;")
        root.addWidget(sep)

        self._content = QVBoxLayout()
        self._content.setContentsMargins(0, 0, 0, 0)
        self._content.setSpacing(4)
        root.addLayout(self._content, 1)

    def clear_content(self):
        while self._content.count():
            item = self._content.takeAt(0)
            if item.widget():
                item.widget().deleteLater()

    def set_empty(self, msg: str):
        lbl = QLabel(msg)
        lbl.setWordWrap(True)
        lbl.setFont(QFont(FONT_LABEL, 8))
        lbl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")
        self._content.addWidget(lbl)

    def add_metric_row(self, left: str, right: str, ratio: float, color: str):
        row = QWidget()
        row.setStyleSheet("background: transparent;")
        rl = QVBoxLayout(row)
        rl.setContentsMargins(0, 0, 0, 0)
        rl.setSpacing(2)

        top = QHBoxLayout()
        top.setContentsMargins(0, 0, 0, 0)
        l = QLabel(left)
        l.setFont(QFont(FONT_LABEL, 8))
        l.setStyleSheet(f"color: {TEXT}; background: transparent;")
        l.setWordWrap(True)
        r = QLabel(right)
        r.setFont(QFont(FONT_LABEL, 8))
        r.setStyleSheet(f"color: {TEAL_BRIGHT}; background: transparent;")
        r.setAlignment(Qt.AlignRight | Qt.AlignVCenter)
        top.addWidget(l, 1)
        top.addWidget(r)
        rl.addLayout(top)

        bar = _MiniBar(color)
        bar.set_ratio(ratio)
        rl.addWidget(bar)

        self._content.addWidget(row)

    def add_combo_row(self, spells: list[str], meta: str, dpt: int | None = None):
        row = QWidget()
        row.setStyleSheet("background: transparent;")
        rl = QVBoxLayout(row)
        rl.setContentsMargins(0, 0, 0, 0)
        rl.setSpacing(1)

        chain = " > ".join(spells[:5])
        if len(spells) > 5:
            chain += f" +{len(spells) - 5}"
        chain_lbl = QLabel(chain)
        chain_lbl.setFont(QFont(FONT_LABEL, 8))
        chain_lbl.setStyleSheet(f"color: {TEXT}; background: transparent;")
        chain_lbl.setWordWrap(True)

        # Top row: meta + DPT side-by-side
        top_row = QHBoxLayout()
        top_row.setContentsMargins(0, 0, 0, 0)
        top_row.setSpacing(4)
        
        meta_lbl = QLabel(meta)
        meta_lbl.setFont(QFont(FONT_LABEL, 7))
        meta_lbl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")
        top_row.addWidget(meta_lbl, 1)
        
        if dpt is not None and int(dpt) > 0:
            dpt_txt = f"DPT: {_fmt_xp(int(dpt))}"
            dpt_lbl = QLabel(dpt_txt)
            dpt_lbl.setFont(QFont(FONT_LABEL, 7))
            dpt_lbl.setStyleSheet(f"color: {TEAL_BRIGHT}; background: transparent;")
            dpt_lbl.setAlignment(Qt.AlignRight)
            top_row.addWidget(dpt_lbl)

        rl.addWidget(chain_lbl)
        rl.addLayout(top_row)
        self._content.addWidget(row)


class _XPBar(QWidget):
    def __init__(self, parent=None):
        super().__init__(parent)
        self.setMinimumSize(120, 18)
        self._progress = 0.0
        self._xp_cur = 0
        self._xp_max = 1
        self._style = 0
        self.setToolTip("")  # Initialize tooltip

    def set_xp(self, current: int, total: int):
        self._xp_cur = max(0, int(current))
        self._xp_max = max(1, int(total))
        self._progress = min(1.0, self._xp_cur / self._xp_max)
        percent = int(self._progress * 100)
        self.setToolTip(f"Progression: {percent}%")
        self.update()

    def set_style(self, idx: int):
        self._style = max(0, min(len(XP_STYLE_NAMES) - 1, int(idx)))
        self.update()

    def paintEvent(self, _):
        p = QPainter(self)
        p.setRenderHint(QPainter.Antialiasing)
        rect = self.rect()
        txt = f"{_fmt_xp(self._xp_cur)} / {_fmt_xp(self._xp_max)}"

        if self._style == 0:
            # Barre avec meilleur contraste et lisibilité
            p.setPen(Qt.NoPen)

            track = rect.adjusted(0, 1, 0, -1)
            p.setBrush(QColor("#0e151e"))
            p.drawRoundedRect(track, 7, 7)

            inset = track.adjusted(1, 1, -1, -1)
            p.setBrush(QColor("#111c27"))
            p.drawRoundedRect(inset, 6, 6)

            if self._progress > 0:
                fw = max(1, int(inset.width() * self._progress))
                fill = QRect(inset.x(), inset.y(), fw, inset.height())

                grad = QLinearGradient(fill.left(), fill.top(), fill.right(), fill.top())
                grad.setColorAt(0.0, QColor("#0f5f72"))
                grad.setColorAt(0.6, QColor(TEAL))
                grad.setColorAt(1.0, QColor(TEAL_BRIGHT))
                p.setBrush(grad)
                p.drawRoundedRect(fill, 6, 6)

                # reflet subtil du remplissage
                shine_h = max(2, fill.height() // 3)
                shine = QRect(fill.x() + 1, fill.y() + 1, max(1, fill.width() - 2), shine_h)
                p.setBrush(QColor(255, 255, 255, 38))
                p.drawRoundedRect(shine, 4, 4)

            # contour externe pour lisibilité
            p.setBrush(Qt.NoBrush)
            p.setPen(QPen(QColor(BORDER), 1))
            p.drawRoundedRect(track.adjusted(0, 0, -1, -1), 7, 7)

            # Texte avec contour pour meilleure lisibilité
            font = QFont(FONT_LABEL, 8)
            font.setWeight(QFont.DemiBold)
            p.setFont(font)
            
            # Shadow fin en gris foncé
            p.setPen(QColor(0, 0, 0, 128))
            for dx, dy in [(-1, -1), (-1, 0), (-1, 1), (0, -1), (0, 1), (1, -1), (1, 0), (1, 1)]:
                shadow_rect = rect.adjusted(dx, dy, dx, dy)
                p.drawText(shadow_rect, Qt.AlignCenter, txt)
            
            # Texte principal en blanc bright
            p.setPen(QColor("#e0e8ff"))
            p.drawText(rect, Qt.AlignCenter, txt)
        else:
            fn = XP_PAINT_FN.get(self._style, paint_official_fallback)
            fn(p, rect, self._progress, txt)

class _XPProgressCard(QFrame):
    """Card large à 3 colonnes : XP/heure · Temps restant · Temps joué."""

    def __init__(self, parent=None):
        super().__init__(parent)
        self.setStyleSheet(
            f"QFrame{{background: rgba(255,255,255,0.03); border: 1px solid {BORDER}; border-radius: 8px;}}"
        )
        self.setSizePolicy(QSizePolicy.Expanding, QSizePolicy.Fixed)
        self.setFixedHeight(62)

        lay = QHBoxLayout(self)
        lay.setContentsMargins(0, 0, 0, 0)
        lay.setSpacing(0)

        self._vals: list[QLabel] = []

        # ── Colonnes 0 et 1 : XP/h et Temps restant (layout standard) ────
        for i, title in enumerate(("XP / HEURE", "TEMPS RESTANT")):
            if i > 0:
                div = QFrame()
                div.setFrameShape(QFrame.VLine)
                div.setFixedWidth(1)
                div.setStyleSheet(f"background: {BORDER}; border: none;")
                lay.addWidget(div)

            cell = QWidget()
            cell.setStyleSheet("background: transparent; border: none;")
            cl = QVBoxLayout(cell)
            cl.setContentsMargins(10, 6, 10, 6)
            cl.setSpacing(2)

            val = QLabel("—")
            val.setAlignment(Qt.AlignCenter)
            vf = QFont(FONT_LABEL, 14)
            vf.setWeight(QFont.Bold)
            val.setFont(vf)
            val.setStyleSheet(f"color: {TEAL_BRIGHT}; background: transparent;")

            ttl = QLabel(title)
            ttl.setAlignment(Qt.AlignCenter)
            ttl.setFont(QFont(FONT_LABEL, 8))
            ttl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")

            cl.addWidget(val)
            cl.addWidget(ttl)
            lay.addWidget(cell, 1)
            self._vals.append(val)

        # ── Colonne 2 : Temps joué — layout spécial (jours + h/min) ──────
        div = QFrame()
        div.setFrameShape(QFrame.VLine)
        div.setFixedWidth(1)
        div.setStyleSheet(f"background: {BORDER}; border: none;")
        lay.addWidget(div)

        played_cell = QWidget()
        played_cell.setStyleSheet("background: transparent; border: none;")
        pcl = QVBoxLayout(played_cell)
        pcl.setContentsMargins(10, 5, 10, 5)
        pcl.setSpacing(0)

        self._played_main = QLabel("—")
        self._played_main.setAlignment(Qt.AlignCenter)
        mf = QFont(FONT_LABEL, 13)
        mf.setWeight(QFont.Bold)
        self._played_main.setFont(mf)
        self._played_main.setStyleSheet(f"color: {TEAL_BRIGHT}; background: transparent;")

        self._played_sub = QLabel("")
        self._played_sub.setAlignment(Qt.AlignCenter)
        self._played_sub.setFont(QFont(FONT_LABEL, 9))
        self._played_sub.setStyleSheet(f"color: {TEAL}; background: transparent;")

        ttl = QLabel("TEMPS JOUÉ")
        ttl.setAlignment(Qt.AlignCenter)
        ttl.setFont(QFont(FONT_LABEL, 8))
        ttl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")

        pcl.addWidget(self._played_main)
        pcl.addWidget(self._played_sub)
        pcl.addWidget(ttl)
        lay.addWidget(played_cell, 1)

    def _set(self, idx: int, value: str, color: str | None = None):
        self._vals[idx].setText(value or "—")
        self._vals[idx].setStyleSheet(f"color: {color or TEAL_BRIGHT}; background: transparent;")

    def set_xph(self, value: str, color: str | None = None):      self._set(0, value, color)
    def set_remaining(self, value: str, color: str | None = None): self._set(1, value, color)

    def set_played(self, main: str, sub: str = "", color: str | None = None):
        self._played_main.setText(main or "—")
        self._played_main.setStyleSheet(f"color: {color or TEAL_BRIGHT}; background: transparent;")
        self._played_sub.setText(sub)
        self._played_sub.setVisible(bool(sub))


class _StatBox(QFrame):
    def __init__(self, title: str, parent=None):
        super().__init__(parent)
        self.setStyleSheet(
            f"QFrame{{background: rgba(255,255,255,0.03); border: 1px solid {BORDER}; border-radius: 8px;}}"
        )
        self.setSizePolicy(QSizePolicy.Expanding, QSizePolicy.Fixed)
        self.setFixedHeight(62)

        lay = QVBoxLayout(self)
        lay.setContentsMargins(10, 6, 10, 6)
        lay.setSpacing(2)

        self.value = QLabel("—")
        self.value.setAlignment(Qt.AlignCenter)
        vf = QFont(FONT_LABEL, 14)
        vf.setWeight(QFont.Bold)
        self.value.setFont(vf)
        self.value.setStyleSheet(f"color: {TEAL_BRIGHT}; background: transparent;")

        self.title = QLabel(title)
        self.title.setAlignment(Qt.AlignCenter)
        self.title.setFont(QFont(FONT_LABEL, 8))
        self.title.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")

        lay.addWidget(self.value)
        lay.addWidget(self.title)

    def set_value(self, value: str, color: str | None = None):
        self.value.setText(value or "—")
        self.value.setStyleSheet(f"color: {color or TEAL_BRIGHT}; background: transparent;")


class PersonnageTab(BaseTab):
    gender_changed = pyqtSignal(object)

    def __init__(self, parent: QWidget | None = None):
        super().__init__(parent)

        self._gender: str | None = None
        self._current_breed_id: int | None = None
        self._current_level: int | None = None
        self._xp_current = 0
        self._xp_total = 1

        # Données combat fusionnées dans l'onglet personnage.
        self._rt_spell_counts: dict[str, int] = {}
        self._rt_damage_by: dict[str, int] = {}
        self._rt_killed_by: dict[str, int] = {}
        self._rt_best_combos: list[dict] = []
        self._rt_t1_combo_counts: dict[str, int] = {}
        self._rt_t1_combo_spells: dict[str, list[str]] = {}
        self._rt_best_t1: list[dict] = []
        self._rt_current_turn: list[str] = []
        self._rt_fight_turns: list[list[str]] = []
        self._rt_last_spell_ts: float | None = None

        root = QVBoxLayout(self)
        root.setContentsMargins(0, 0, 0, 0)
        root.setSpacing(0)

        self._stack = QStackedWidget()
        root.addWidget(self._stack)

        # ── Page offline / sélection ──────────────────────────────────────
        _offline_page = QWidget()
        _ol = QVBoxLayout(_offline_page)
        self._offline_lbl = QLabel("● Déconnecté")
        self._offline_lbl.setAlignment(Qt.AlignCenter)
        self._offline_lbl.setFont(QFont(FONT_LABEL, 11))
        self._offline_lbl.setStyleSheet(f"color: {RED}; background: transparent;")
        _ol.addWidget(self._offline_lbl)
        self._stack.addWidget(_offline_page)   # index 0

        # ── Page contenu (in-game) ───────────────────────────────────────
        _main_page = QWidget()
        self._stack.addWidget(_main_page)      # index 1

        root = QVBoxLayout(_main_page)
        root.setContentsMargins(18, 14, 18, 14)
        root.setSpacing(10)

        header = QHBoxLayout()
        header.setSpacing(12)

        self._class_icon = QLabel()
        self._class_icon.setFixedSize(140, 140)
        self._class_icon.setAlignment(Qt.AlignCenter)
        self._class_icon.setStyleSheet(f"background: rgba(255,255,255,0.03); border: 1px solid {BORDER}; border-radius: 10px;")
        header.addWidget(self._class_icon)

        info = QVBoxLayout()
        info.setSpacing(4)

        self._name_lbl = QLabel("—")
        nf = QFont(FONT_TITLE, 20)
        nf.setWeight(QFont.Bold)
        self._name_lbl.setFont(nf)
        self._name_lbl.setStyleSheet(f"color: {TEXT}; background: transparent;")

        self._class_lbl = QLabel("—")
        cf = QFont(FONT_LABEL, 12)
        cf.setWeight(QFont.DemiBold)
        self._class_lbl.setFont(cf)
        self._class_lbl.setStyleSheet(f"color: {TEAL}; background: transparent;")

        self._level_lbl = QLabel("")
        self._level_lbl.setFont(QFont(FONT_BODY, 11))
        self._level_lbl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")

        self._server_lbl = QLabel("")
        self._server_lbl.setFont(QFont(FONT_LABEL, 9))
        self._server_lbl.setStyleSheet(f"color: {TEAL_BRIGHT}; background: transparent;")
        self._server_lbl.setVisible(False)

        self._status_lbl = QLabel("◌ Écran de sélection")
        self._status_lbl.setFont(QFont(FONT_LABEL, 9))
        self._status_lbl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")

        info.addWidget(self._name_lbl)
        info.addWidget(self._class_lbl)
        info.addWidget(self._level_lbl)
        info.addWidget(self._server_lbl)
        info.addWidget(self._status_lbl)

        bars = QVBoxLayout()
        bars.setSpacing(6)

        self._xp_bar = _XPBar(self)

        bars.addWidget(self._xp_bar)
        info.addSpacing(6)
        info.addLayout(bars)

        header.addLayout(info, 1)

        side = QVBoxLayout()
        side.setSpacing(8)

        self._gender_btn = QPushButton()
        self._gender_btn.setFixedSize(64, 64)
        self._gender_btn.setIconSize(QSize(56, 56))
        self._gender_btn.clicked.connect(self._cycle_gender)
        self._gender_btn.setStyleSheet(
            "QPushButton{background: transparent; border: none; border-radius: 10px;}"
            "QPushButton:hover{background: rgba(255,255,255,0.08);}"
        )

        side.addWidget(self._gender_btn, 0, Qt.AlignTop)
        side.addStretch(1)
        header.addLayout(side)

        root.addLayout(header)

        sep = QFrame()
        sep.setFrameShape(QFrame.HLine)
        sep.setStyleSheet(f"color: {BORDER}; background: {BORDER}; max-height: 1px;")
        root.addWidget(sep)

        stats = QHBoxLayout()
        stats.setSpacing(8)
        self._card_zone = _StatBox("🗺 ZONE")
        self._card_xp_progress = _XPProgressCard()

        stats.addWidget(self._card_zone, 1)
        stats.addWidget(self._card_xp_progress, 3)
        root.addLayout(stats)

        # Bloc combat réorganisé dans Personnage
        combat_title = QLabel("Analyse combat")
        combat_title.setFont(QFont(FONT_LABEL, 9))
        combat_title.setStyleSheet(f"color: {TEAL}; font-weight: 700; letter-spacing: 0.7px; background: transparent;")
        root.addWidget(combat_title)

        combat_grid = QHBoxLayout()
        combat_grid.setSpacing(8)

        left_col = QVBoxLayout()
        left_col.setSpacing(8)
        right_col = QVBoxLayout()
        right_col.setSpacing(8)

        self._panel_spells = _CombatInsightPanel("SORTS LES PLUS UTILISES")
        self._panel_damage = _CombatInsightPanel("PLUS GROS DEGATS SUBIS")
        self._panel_combo_t1 = _CombatInsightPanel("MEILLEURS COMBOS TOUR 1")
        self._panel_combo_best = _CombatInsightPanel("MEILLEURS COMBOS (GLOBAL)")

        left_col.addWidget(self._panel_spells, 1)
        left_col.addWidget(self._panel_combo_t1, 1)
        right_col.addWidget(self._panel_damage, 1)
        right_col.addWidget(self._panel_combo_best, 1)

        combat_grid.addLayout(left_col, 1)
        combat_grid.addLayout(right_col, 1)
        root.addLayout(combat_grid, 1)
        root.addStretch(1)

        self._kamas_proxy = QLabel("")
        self._refresh_gender_btn()
        self._card_zone.set_value("—")
        self._refresh_combat_panels()

    def set_server(self, name: str | None, unique_players: int | None = None, log_start: str | None = None):
        if not name:
            self._server_lbl.setVisible(False)
            self._server_lbl.setText("")
            return
        parts = [str(name)]
        if unique_players is not None:
            parts.append(f"{unique_players:,} joueurs".replace(",", "\u202f"))
        if log_start:
            parts.append(f"depuis {log_start}")
        self._server_lbl.setText("  ·  ".join(parts))
        self._server_lbl.setVisible(True)

    def set_xp_style(self, idx: int):
        self._xp_bar.set_style(idx)

    def set_kamas_widget(self, value: int | None):
        if value is None:
            self._kamas_proxy.setText("—")
        else:
            self._kamas_proxy.setText(str(int(value)))

    def refresh_fonts(self):
        from ui.theme import FONT_TITLE, FONT_BODY, FONT_LABEL

        nf = QFont(FONT_TITLE, 20)
        nf.setWeight(QFont.Bold)
        self._name_lbl.setFont(nf)
        cf = QFont(FONT_LABEL, 12)
        cf.setWeight(QFont.DemiBold)
        self._class_lbl.setFont(cf)
        self._level_lbl.setFont(QFont(FONT_BODY, 11))

    def set_character_name(self, name: str | None):
        self._name_lbl.setText(name or "—")

    def set_class_name(self, class_key: str | None):
        self._class_lbl.setText(class_key.upper() if class_key else "—")

    def set_level(self, level: int | None):
        self._current_level = level if level is not None else None
        self._level_lbl.setText(f"Niveau {level}" if level is not None else "")
        self._card_zone.set_value(_recommended_zone(level))

    def set_xp(self, xp_current: int, xp_total: int):
        self._xp_current = max(0, int(xp_current))
        self._xp_total = max(1, int(xp_total))
        self._xp_bar.set_xp(self._xp_current, self._xp_total)

    def set_xp_remaining(self, xp_to_next: int | None, xp_gained: int | None = None, elapsed_s: int | None = None):
        if xp_to_next is None or int(xp_to_next) <= 0:
            self._card_xp_progress.set_remaining("—", TEXT_DIM)
            self._card_xp_progress.set_xph("—", TEXT_DIM)
            return

        if xp_gained is None or int(xp_gained) <= 0 or elapsed_s is None or int(elapsed_s) <= 0:
            self._card_xp_progress.set_remaining("∞", TEXT_DIM)
            self._card_xp_progress.set_xph("—", TEXT_DIM)
            return

        xp_per_hour = (int(xp_gained) / int(elapsed_s)) * 3600
        if xp_per_hour > 0:
            # XP/heure
            v = int(xp_per_hour)
            if v >= 1_000_000:
                xph_str = f"{v/1_000_000:.1f}M/h"
            elif v >= 1_000:
                xph_str = f"{v//1_000}K/h"
            else:
                xph_str = f"{v}/h"
            self._card_xp_progress.set_xph(xph_str, TEAL_BRIGHT)

            # Temps restant
            minutes = int(xp_to_next) / (xp_per_hour / 60)
            if minutes < 1:
                display = "< 1 min"
            elif minutes < 60:
                display = f"{int(minutes)}m"
            else:
                hours = int(minutes / 60)
                mins = int(minutes % 60)
                display = f"{hours}h{mins:02d}m"
            self._card_xp_progress.set_remaining(display, TEAL_BRIGHT)
        else:
            self._card_xp_progress.set_xph("—", TEXT_DIM)
            self._card_xp_progress.set_remaining("∞", TEXT_DIM)

    def set_played_time(self, total_seconds: int | None):
        if total_seconds is None or total_seconds <= 0:
            self._card_xp_progress.set_played("—", "", TEXT_DIM)
            return
        s = int(total_seconds)
        days, rem = divmod(s, 86400)
        hours, rem = divmod(rem, 3600)
        minutes = rem // 60
        if days > 0:
            main = f"{days} jour{'s' if days > 1 else ''}"
            sub  = f"{hours}h {minutes:02d}m"
        elif hours > 0:
            main = f"{hours}h {minutes:02d}m"
            sub  = ""
        else:
            main = f"{minutes} min"
            sub  = ""
        self._card_xp_progress.set_played(main, sub, TEAL_BRIGHT)

    def load_combat_history(self, stats: dict):
        self._rt_spell_counts = dict(stats.get("spell_counts", {}))
        self._rt_damage_by = dict(stats.get("damage_by", {}))
        self._rt_killed_by = dict(stats.get("killed_by", {}))
        self._rt_best_combos = list(stats.get("turn_combos", []))

        self._rt_t1_combo_counts.clear()
        self._rt_t1_combo_spells.clear()
        for combo in self._rt_best_combos[:5]:
            spells = list(combo.get("spells", []))
            if len(spells) < 2:
                continue
            key = " > ".join(spells)
            self._rt_t1_combo_counts[key] = max(1, int(combo.get("count", 1) or 1))
            self._rt_t1_combo_spells[key] = spells
        self._rebuild_best_t1()
        self._refresh_combat_panels()

    def on_spell_cast(self, spell: str):
        spell = str(spell or "").strip()
        if not spell:
            return

        self._rt_spell_counts[spell] = self._rt_spell_counts.get(spell, 0) + 1

        now = time.time()
        if self._rt_last_spell_ts is not None and (now - self._rt_last_spell_ts) > 35:
            self._finalize_current_turn()
        self._rt_current_turn.append(spell)
        self._rt_last_spell_ts = now
        self._refresh_spells_panel()

    def on_player_damage(self, attacker: str, amount: int):
        name = str(attacker or "").strip()
        if not name:
            return
        self._rt_damage_by[name] = self._rt_damage_by.get(name, 0) + max(0, int(amount or 0))
        self._refresh_damage_panel()

    def on_player_killed_by(self, attacker: str):
        name = str(attacker or "").strip()
        if not name:
            return
        self._rt_killed_by[name] = self._rt_killed_by.get(name, 0) + 1
        self._refresh_damage_panel()

    def on_xp_combat(self, _xp: int, _xp_to_next: int):
        # Fin de combat probable: on clôt le tour en cours puis on extrait le combo de T1.
        self._finalize_current_turn()
        if self._rt_fight_turns:
            t1 = self._rt_fight_turns[0]
            if len(t1) >= 2:
                key = " > ".join(t1)
                self._rt_t1_combo_counts[key] = self._rt_t1_combo_counts.get(key, 0) + 1
                self._rt_t1_combo_spells[key] = t1
                self._rebuild_best_t1()
        self._rt_fight_turns = []
        self._refresh_combo_panels()

    def set_display_state(self, state: GameState):
        """Met à jour le QStackedWidget et les labels selon l'état du jeu."""
        if state == GameState.IN_GAME:
            # En jeu — page contenu
            self._stack.setCurrentIndex(1)
            self._status_lbl.setText("● Connecté")
            self._status_lbl.setStyleSheet(f"color: {GREEN}; background: transparent;")
        else:
            # Pas en jeu — page vide avec statut adapté
            self._stack.setCurrentIndex(0)
            if state == GameState.OFFLINE:
                self._offline_lbl.setText("● Déconnecté")
                self._offline_lbl.setStyleSheet(f"color: {RED}; background: transparent;")
            elif state == GameState.SERVER_SELECT:
                self._offline_lbl.setText("◌ Sélection de serveur")
                self._offline_lbl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")
            elif state == GameState.CHAR_SELECT:
                self._offline_lbl.setText("◌ Sélection de personnage")
                self._offline_lbl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")
            else:  # SELECTING (écran login / déconnecté)
                self._offline_lbl.setText("● Déconnecté")
                self._offline_lbl.setStyleSheet(f"color: {RED}; background: transparent;")

    def set_connection_status(self, connected: bool | None):
        """Compatibilité — préférer set_display_state."""
        if connected is True:
            self.set_display_state(GameState.IN_GAME)
        elif connected is False:
            self.set_display_state(GameState.OFFLINE)
        else:
            self.set_display_state(GameState.SELECTING)

    def _finalize_current_turn(self):
        if len(self._rt_current_turn) < 2:
            self._rt_current_turn = []
            return

        unique = list(dict.fromkeys(self._rt_current_turn))
        self._rt_fight_turns.append(unique)
        if len(unique) >= 2:
            self._rt_best_combos.append({
                "spells": unique,
                "count": len(unique),
                "ts": time.strftime("%Y-%m-%d %H:%M:%S"),
            })
            self._rt_best_combos.sort(key=lambda x: int(x.get("count", 0)), reverse=True)
            self._rt_best_combos = self._rt_best_combos[:8]
        self._rt_current_turn = []

    def _rebuild_best_t1(self):
        rows = sorted(self._rt_t1_combo_counts.items(), key=lambda x: x[1], reverse=True)[:6]
        self._rt_best_t1 = [
            {
                "spells": self._rt_t1_combo_spells.get(k, k.split(" > ")),
                "count": c,
            }
            for k, c in rows
        ]

    def _refresh_combat_panels(self):
        self._refresh_spells_panel()
        self._refresh_damage_panel()
        self._refresh_combo_panels()

    def _refresh_spells_panel(self):
        self._panel_spells.clear_content()
        if not self._rt_spell_counts:
            self._panel_spells.set_empty("Aucun sort detecte")
            return
        top = sorted(self._rt_spell_counts.items(), key=lambda x: x[1], reverse=True)[:6]
        max_v = max(1, top[0][1])
        for name, count in top:
            self._panel_spells.add_metric_row(name, str(count), count / max_v, TEAL)

    def _refresh_damage_panel(self):
        self._panel_damage.clear_content()
        if not self._rt_damage_by and not self._rt_killed_by:
            self._panel_damage.set_empty("Aucun degat enregistre")
            return

        ranking: dict[str, int] = {}
        for mob, dmg in self._rt_damage_by.items():
            ranking[mob] = ranking.get(mob, 0) + int(dmg)
        for mob, deaths in self._rt_killed_by.items():
            ranking[mob] = ranking.get(mob, 0) + (int(deaths) * 500)

        top = sorted(ranking.items(), key=lambda x: x[1], reverse=True)[:6]
        max_v = max(1, top[0][1])
        for mob, score in top:
            dmg = int(self._rt_damage_by.get(mob, 0))
            deaths = int(self._rt_killed_by.get(mob, 0))
            meta = f"{_fmt_xp(dmg)} PV"
            if deaths > 0:
                meta += f"  ·  {deaths} KO"
            self._panel_damage.add_metric_row(mob, meta, score / max_v, RED)

    def _refresh_combo_panels(self):
        self._panel_combo_t1.clear_content()
        self._panel_combo_best.clear_content()

        if self._rt_best_t1:
            for combo in self._rt_best_t1[:4]:
                spells = list(combo.get("spells", []))
                count = int(combo.get("count", 1) or 1)
                self._panel_combo_t1.add_combo_row(spells, f"Tour 1 · x{count}")
        else:
            self._panel_combo_t1.set_empty("Pas encore de combo T1")

        if self._rt_best_combos:
            for combo in self._rt_best_combos[:4]:
                spells = list(combo.get("spells", []))
                size = int(combo.get("count", len(spells)) or len(spells))
                ts = str(combo.get("ts", ""))
                suffix = ts[:10] if ts else "live"
                self._panel_combo_best.add_combo_row(spells, f"{size} sorts · {suffix}")
        else:
            self._panel_combo_best.set_empty("Pas encore de combo detecte")

    def set_game_state(self, state: GameState):
        """Compatibilité — préférer set_display_state."""
        self.set_display_state(state)

    def set_gender(self, gender: str | None):
        if gender not in _TYPE_CYCLE:
            gender = None
        self._gender = gender
        self._refresh_gender_btn()
        self._update_illustration()

    def set_class_icon(self, class_key: str):
        key = _normalize_class_key(class_key)
        class_id = _CLASS_TO_ID.get(key, 4)
        self._current_breed_id = class_id
        self._update_illustration()
        self._update_class_watermark(class_id, key)
        self._refresh_gender_btn()

        icon = _WAKASSETS_ICONS / f"{class_id}.png"
        if not icon.exists():
            icon = _CLASS_ICON_CACHE_DIR / f"class_{class_id}_{key}.tga"
            if not icon.exists():
                _extract_icon_from_wakfu_install(key, icon)
        self._load_icon(icon, tooltip=f"Classe : {key}")

    def set_class_icon_by_breed_id(self, breed_id: int):
        try:
            bid = int(breed_id)
        except (TypeError, ValueError):
            return

        self._current_breed_id = bid
        self._update_illustration()
        self._refresh_gender_btn()

        icon = _WAKASSETS_ICONS / f"{bid}.png"
        if not icon.exists():
            icon = _CLASS_ICON_CACHE_DIR / f"breed_{bid}.tga"
            if not icon.exists():
                _extract_icon_from_wakfu_install_by_breed_id(bid, icon)
        self._load_icon(icon, tooltip=f"Breed : {bid}")

    def clear_class_icon(self):
        self._class_icon.clear()
        self._class_icon.setToolTip("")
        BaseTab.set_shared_class_icon(None)
        BaseTab.set_shared_illustration(None)

    def _cycle_gender(self):
        if self._gender not in _TYPE_CYCLE:
            self._gender = _TYPE_CYCLE[0]
        else:
            idx = (_TYPE_CYCLE.index(self._gender) + 1) % len(_TYPE_CYCLE)
            self._gender = _TYPE_CYCLE[idx]
        self._refresh_gender_btn()
        self._update_illustration()
        self.gender_changed.emit(self._gender)

    def _refresh_gender_btn(self):
        icon_path = _EMOTE_FALLBACK
        if self._current_breed_id is not None:
            icon_path = _emote_path(self._current_breed_id, self._gender)

        if icon_path.exists():
            pix = QPixmap(str(icon_path)).scaled(56, 56, Qt.KeepAspectRatio, Qt.SmoothTransformation)
            self._gender_btn.setIcon(QIcon(pix))
            self._gender_btn.setText("")
        else:
            self._gender_btn.setIcon(QIcon())
            self._gender_btn.setText("⚥")

    def _update_illustration(self):
        if self._current_breed_id is None:
            BaseTab.set_shared_illustration(None)
            return

        suffix = 1 if self._gender == "type_1" else 0
        illus_id = self._current_breed_id * 10 + suffix
        path = _ILLUS_DIR / f"{illus_id}.png"
        pix = QPixmap(str(path)) if path.exists() else None
        BaseTab.set_shared_illustration(pix if pix and not pix.isNull() else None)

    def _update_class_watermark(self, class_id: int, key: str):
        icon = _WAKASSETS_ICONS / f"{class_id}.png"
        if not icon.exists():
            icon = _CLASS_ICON_CACHE_DIR / f"class_{class_id}_{key}.tga"
        pix = QPixmap(str(icon)) if icon.exists() else None
        BaseTab.set_shared_class_icon(pix if pix and not pix.isNull() else None)

    def _load_icon(self, source, tooltip: str = ""):
        path = Path(str(source)) if source is not None else None
        if path is None or not path.exists():
            fallback = _ZAAP_WAKFU_ICON if _ZAAP_WAKFU_ICON.exists() else None
            if fallback is None:
                self._class_icon.clear()
                return
            path = fallback

        pix = QPixmap(str(path))
        if pix.isNull():
            self._class_icon.clear()
            return

        self._class_icon.setPixmap(pix.scaled(132, 132, Qt.KeepAspectRatio, Qt.SmoothTransformation))
        self._class_icon.setToolTip(tooltip)
