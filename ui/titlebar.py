# ui/titlebar.py — Barre de titre custom (drag, pin, fold, close)

from PyQt5.QtWidgets import QWidget, QHBoxLayout, QLabel, QPushButton
from PyQt5.QtCore    import Qt, pyqtSignal
from PyQt5.QtGui     import QPainter, QColor, QPen

from ui.theme import (
    BG_PANEL, TEAL, TEAL_BRIGHT, TEXT, TEXT_DIM, BORDER, RED
)

HEIGHT = 36


class _TitleBtn(QPushButton):
    """Bouton compact pour la barre de titre."""

    def __init__(self, text: str, tooltip: str = "", danger: bool = False):
        super().__init__(text)
        self.setFixedSize(24, 24)
        self.setToolTip(tooltip)
        self._danger  = danger
        self._active  = False
        self._refresh_style()

    def set_active(self, active: bool):
        self._active = active
        self._refresh_style()

    def _refresh_style(self):
        if self._danger:
            self.setStyleSheet(f"""
                QPushButton {{
                    background: transparent; border: none;
                    color: {TEXT_DIM}; font-size: 13px; border-radius: 3px;
                }}
                QPushButton:hover {{
                    background: rgba(224,80,80,0.18); color: {RED};
                }}
            """)
        elif self._active:
            self.setStyleSheet(f"""
                QPushButton {{
                    background: rgba(30,180,176,0.18);
                    border: 1px solid {TEAL};
                    color: {TEAL}; font-size: 13px; border-radius: 3px;
                }}
                QPushButton:hover {{
                    background: rgba(30,180,176,0.28); color: {TEAL_BRIGHT};
                }}
            """)
        else:
            self.setStyleSheet(f"""
                QPushButton {{
                    background: transparent; border: none;
                    color: {TEXT_DIM}; font-size: 13px; border-radius: 3px;
                }}
                QPushButton:hover {{
                    background: rgba(255,255,255,0.07); color: {TEXT};
                }}
            """)


class TitleBar(QWidget):
    """
    Barre de titre draggable.

    Signaux :
        fold_toggled(bool)   — True = replié
        pin_toggled(bool)    — True = position verrouillée
        close_requested()
    """

    fold_toggled    = pyqtSignal(bool)
    pin_toggled     = pyqtSignal(bool)
    close_requested = pyqtSignal()

    def __init__(self, parent=None):
        super().__init__(parent)
        self.setFixedHeight(HEIGHT)
        self.setCursor(Qt.SizeAllCursor)

        self._pinned = False
        self._folded = False

        lay = QHBoxLayout(self)
        lay.setContentsMargins(10, 0, 6, 0)
        lay.setSpacing(4)

        # Titre
        lbl = QLabel("⚡ WAKFU")
        lbl.setStyleSheet(
            f"color: {TEAL}; font-weight: 800; font-size: 13px; letter-spacing: 1px;"
        )

        # Infos session (timer, perso)
        self._info = QLabel("")
        self._info.setStyleSheet(f"color: {TEXT_DIM}; font-size: 10px;")

        lay.addWidget(lbl)
        lay.addSpacing(6)
        lay.addWidget(self._info)
        lay.addStretch()

        # Boutons
        self._btn_pin   = _TitleBtn("📌", "Fixer / déverrouiller la position")
        self._btn_fold  = _TitleBtn("▾",  "Réduire / déplier")
        self._btn_close = _TitleBtn("✕",  "Fermer", danger=True)

        self._btn_pin.clicked.connect(self._toggle_pin)
        self._btn_fold.clicked.connect(self._toggle_fold)
        self._btn_close.clicked.connect(self.close_requested.emit)

        lay.addWidget(self._btn_pin)
        lay.addWidget(self._btn_fold)
        lay.addWidget(self._btn_close)

    # ── API publique ───────────────────────────────────────────────

    def set_info(self, text: str):
        self._info.setText(text)

    @property
    def is_pinned(self) -> bool:
        return self._pinned

    # ── Slots internes ─────────────────────────────────────────────

    def _toggle_pin(self):
        self._pinned = not self._pinned
        self._btn_pin.set_active(self._pinned)
        self.pin_toggled.emit(self._pinned)

    def _toggle_fold(self):
        self._folded = not self._folded
        self._btn_fold.setText("▴" if self._folded else "▾")
        self.fold_toggled.emit(self._folded)

    # ── Rendu ──────────────────────────────────────────────────────

    def paintEvent(self, _event):
        p = QPainter(self)
        # Fond
        p.fillRect(self.rect(), QColor(BG_PANEL))
        # Ligne teal en bas
        p.setPen(QPen(QColor(TEAL), 1))
        y = self.height() - 1
        p.drawLine(0, y, self.width(), y)
