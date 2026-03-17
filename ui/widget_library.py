# ui/widget_library.py — Bibliothèque de widgets (F1 en mode Édition)
# Panneau flottant permettant de :
#   • Choisir le style de la barre d'XP (6 styles)
#   • Activer / masquer les widgets du panneau Personnage
from __future__ import annotations

from PyQt5.QtWidgets import (
    QWidget, QVBoxLayout, QHBoxLayout, QLabel, QPushButton,
    QScrollArea, QFrame, QSizePolicy, QGridLayout,
)
from PyQt5.QtCore  import Qt, QRect, QRectF, pyqtSignal
from PyQt5.QtGui   import QPainter, QColor, QPen, QFont

from ui.theme      import (
    BG_PANEL, BG_PANEL2, BORDER, BORDER2, TEAL, TEAL_BRIGHT,
    TEXT, TEXT_DIM, FONT_TITLE, FONT_LABEL,
)
from ui.xp_styles  import XP_PAINT_FN, XP_STYLE_NAMES, paint_official_fallback

_PANEL_W  = 292
_SWATCH_H = 32

# Métadonnées de chaque widget de la bibliothèque
#  (section_id, label_court, icône)
_WIDGET_META: list[tuple[str, str, str]] = [
    ("p.class_icon",  "Icône",    "🏅"),
    ("p.name",        "Nom",      "🔤"),
    ("p.class",       "Classe",   "⚔"),
    ("p.level",       "Niveau",   "#"),
    ("p.xpbar",       "Barre XP", "▓"),
    ("p.gender",      "Genre",    "♀♂"),
    ("p.card_xph",    "XP/h",     "⚡"),
    ("p.card_time",   "Session",  "⏱"),
    ("p.card_zone",   "Zone",     "🗺"),
    ("p.card_combats", "Combats/Niv", "⚔"),
    ("p.level_ring",  "Ring Niv", "◎"),
    ("p.hp_bar",      "Barre HP", "♥"),
    ("p.kamas_w",     "Kamas",    "⚜"),
    ("p.combat_w",    "Combat",   "💀"),
    ("p.notes_w",     "Notes",    "📝"),
    ("p.server_tag",  "Serveur",  "🌐"),
]


# ── Swatch : aperçu miniature d'un style XP ──────────────────────────────────

class _StyleSwatch(QWidget):
    clicked = pyqtSignal(int)

    def __init__(self, style_idx: int, parent=None):
        super().__init__(parent)
        self._idx      = style_idx
        self._selected = False
        self.setFixedHeight(_SWATCH_H + 22)
        self.setCursor(Qt.PointingHandCursor)

    def set_selected(self, v: bool):
        self._selected = v
        self.update()

    def mousePressEvent(self, e):
        if e.button() == Qt.LeftButton:
            self.clicked.emit(self._idx)

    def paintEvent(self, _):
        p = QPainter(self)
        p.setRenderHint(QPainter.Antialiasing)
        w, h = self.width(), self.height()

        # Bordure de sélection
        if self._selected:
            p.setPen(QPen(QColor(TEAL_BRIGHT), 2))
            p.setBrush(QColor(TEAL).darker(200))
        else:
            p.setPen(QPen(QColor(BORDER), 1))
            p.setBrush(QColor(BG_PANEL2))
        p.drawRoundedRect(QRectF(1, 1, w - 2, _SWATCH_H), 5, 5)

        # Prévisualisation du style
        bar_rect = QRect(6, 5, w - 12, _SWATCH_H - 10)
        p.save()
        p.setClipRect(QRectF(1, 1, w - 2, _SWATCH_H))
        if self._idx == 0:
            paint_official_fallback(p, bar_rect, 0.65, "")
        else:
            fn = XP_PAINT_FN.get(self._idx)
            if fn:
                fn(p, bar_rect, 0.65, "")
        p.restore()

        # Nom du style
        p.setPen(QColor(TEAL_BRIGHT if self._selected else TEXT_DIM))
        f = QFont(FONT_LABEL, 8)
        if self._selected:
            f.setWeight(QFont.Bold)
        p.setFont(f)
        p.drawText(QRectF(4, _SWATCH_H + 2, w - 8, 18),
                   Qt.AlignCenter, XP_STYLE_NAMES[self._idx])


# ── Carte de widget (toggle visibilité) ──────────────────────────────────────

class _WidgetCard(QWidget):
    toggled = pyqtSignal(str, bool)  # section_id, visible

    def __init__(self, section_id: str, label: str, icon: str, parent=None):
        super().__init__(parent)
        self._id      = section_id
        self._visible = False
        self.setFixedHeight(36)
        self.setCursor(Qt.PointingHandCursor)

        lay = QHBoxLayout(self)
        lay.setContentsMargins(8, 4, 6, 4)
        lay.setSpacing(6)

        self._icon_lbl = QLabel(icon)
        self._icon_lbl.setFixedWidth(20)
        self._icon_lbl.setAlignment(Qt.AlignCenter)
        self._icon_lbl.setStyleSheet("font-size: 14px; background: transparent;")

        self._name_lbl = QLabel(label)
        self._name_lbl.setStyleSheet(f"color: {TEXT}; font-size: 11px; background: transparent;")

        self._eye_btn = QPushButton("👁")
        self._eye_btn.setFixedSize(26, 26)
        self._eye_btn.setCheckable(True)
        self._eye_btn.setStyleSheet(f"""
            QPushButton {{
                background: transparent;
                border: 1px solid {BORDER};
                border-radius: 5px;
                font-size: 11px;
                color: {TEXT_DIM};
            }}
            QPushButton:checked {{
                background: rgba(30,180,176,0.18);
                border-color: {TEAL};
                color: {TEAL_BRIGHT};
            }}
            QPushButton:hover {{ border-color: {TEAL}; }}
        """)
        self._eye_btn.clicked.connect(self._on_toggle)

        lay.addWidget(self._icon_lbl)
        lay.addWidget(self._name_lbl, 1)
        lay.addWidget(self._eye_btn)

        self.setStyleSheet(f"""
            _WidgetCard {{
                background: transparent;
                border-radius: 6px;
            }}
            _WidgetCard:hover {{
                background: rgba(255,255,255,0.03);
            }}
        """)

    def set_visible_state(self, v: bool):
        self._visible = v
        self._eye_btn.setChecked(v)

    def _on_toggle(self, checked: bool):
        self._visible = checked
        self.toggled.emit(self._id, checked)


# ── Panneau principal ─────────────────────────────────────────────────────────

class WidgetLibraryPanel(QWidget):
    xp_style_changed   = pyqtSignal(int)          # style sélectionné
    section_toggle     = pyqtSignal(str, bool)     # section_id, visible

    def __init__(self, parent=None):
        super().__init__(parent)
        self.setFixedWidth(_PANEL_W)
        self.setAttribute(Qt.WA_TranslucentBackground)
        self.setWindowFlags(Qt.Widget)
        self._current_style = 0
        self._cards: dict[str, _WidgetCard] = {}
        self._swatches: list[_StyleSwatch]  = []
        self._build_ui()

    # ── Construction ─────────────────────────────────────────────────

    def _build_ui(self):
        # Conteneur principal avec fond semi-transparent
        outer = QVBoxLayout(self)
        outer.setContentsMargins(0, 0, 0, 0)

        self._bg = QFrame()
        self._bg.setStyleSheet(f"""
            QFrame {{
                background: rgba(12, 18, 26, 0.97);
                border: 1px solid {BORDER2};
                border-radius: 12px;
            }}
        """)
        outer.addWidget(self._bg)

        root = QVBoxLayout(self._bg)
        root.setContentsMargins(12, 12, 12, 12)
        root.setSpacing(10)

        # ── Header ──────────────────────────────────────────────────
        hdr = QHBoxLayout()
        title = QLabel("Bibliothèque")
        title.setStyleSheet(f"color: {TEAL_BRIGHT}; font-size: 13px; font-weight: 700; background: transparent;")
        hint  = QLabel("F1 pour fermer")
        hint.setStyleSheet(f"color: {TEXT_DIM}; font-size: 9px; background: transparent;")
        hdr.addWidget(title)
        hdr.addStretch()
        hdr.addWidget(hint)
        root.addLayout(hdr)

        root.addWidget(self._sep())

        # ── Section : Barres d'XP ────────────────────────────────────
        root.addWidget(self._section_label("STYLES BARRE D'XP"))

        grid = QGridLayout()
        grid.setSpacing(6)
        for idx in range(len(XP_STYLE_NAMES)):
            sw = _StyleSwatch(idx)
            sw.clicked.connect(self._on_style_click)
            grid.addWidget(sw, idx // 2, idx % 2)
            self._swatches.append(sw)
        self._swatches[0].set_selected(True)
        root.addLayout(grid)

        root.addWidget(self._sep())

        # ── Section : Composants ─────────────────────────────────────
        root.addWidget(self._section_label("COMPOSANTS"))

        scroll = QScrollArea()
        scroll.setWidgetResizable(True)
        scroll.setFrameShape(QFrame.NoFrame)
        scroll.setHorizontalScrollBarPolicy(Qt.ScrollBarAlwaysOff)
        scroll.setStyleSheet("background: transparent;")

        inner = QWidget()
        inner.setStyleSheet("background: transparent;")
        vlay  = QVBoxLayout(inner)
        vlay.setContentsMargins(0, 0, 0, 0)
        vlay.setSpacing(2)

        for sid, label, icon in _WIDGET_META:
            card = _WidgetCard(sid, label, icon)
            card.toggled.connect(self.section_toggle)
            vlay.addWidget(card)
            self._cards[sid] = card

        vlay.addStretch()
        scroll.setWidget(inner)
        root.addWidget(scroll, 1)

    # ── Helpers visuels ──────────────────────────────────────────────

    @staticmethod
    def _sep() -> QFrame:
        line = QFrame()
        line.setFrameShape(QFrame.HLine)
        line.setStyleSheet(f"color: {BORDER}; background: {BORDER}; max-height: 1px;")
        return line

    @staticmethod
    def _section_label(text: str) -> QLabel:
        lbl = QLabel(text)
        lbl.setStyleSheet(
            f"color: {TEXT_DIM}; font-size: 9px; font-weight: 700; "
            f"letter-spacing: 1px; background: transparent;"
        )
        return lbl

    # ── Slots ─────────────────────────────────────────────────────────

    def _on_style_click(self, idx: int):
        self._swatches[self._current_style].set_selected(False)
        self._current_style = idx
        self._swatches[idx].set_selected(True)
        self.xp_style_changed.emit(idx)

    # ── API publique ──────────────────────────────────────────────────

    def refresh_states(self, sections):
        """Met à jour les états visibles/cachés à partir des DragSections."""
        vis = {s._id: s.isVisible() for s in sections}
        for sid, card in self._cards.items():
            card.set_visible_state(vis.get(sid, False))

    def set_active_style(self, idx: int):
        if 0 <= idx < len(self._swatches):
            self._swatches[self._current_style].set_selected(False)
            self._current_style = idx
            self._swatches[idx].set_selected(True)
