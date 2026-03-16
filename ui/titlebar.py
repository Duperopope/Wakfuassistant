# ui/titlebar.py — Barre de titre custom (drag, pin, fold, close)

from pathlib import Path

from PyQt5.QtWidgets import QWidget, QHBoxLayout, QLabel, QPushButton
from PyQt5.QtCore    import Qt, pyqtSignal, QSize
from PyQt5.QtGui     import QPainter, QColor, QPen, QIcon, QLinearGradient

from ui.theme import (
    BG_PANEL, TEAL, TEAL_BRIGHT, TEXT, TEXT_DIM, BORDER, RED
)

HEIGHT = 40
_ICON_DIR = Path(__file__).resolve().parent / "assets" / "titlebar"


class _TitleBtn(QPushButton):
    """Bouton compact pour la barre de titre."""

    def __init__(self, icon_name: str, tooltip: str = "", danger: bool = False):
        super().__init__("")
        self.setFixedSize(28, 28)
        self.setIcon(QIcon(str(_ICON_DIR / icon_name)))
        self.setIconSize(QSize(16, 16))
        self.setToolTip(tooltip)
        self._danger  = danger
        self._active  = False
        self._palette = {
            "TEAL": TEAL,
            "TEAL_BRIGHT": TEAL_BRIGHT,
            "TEXT": TEXT,
            "TEXT_DIM": TEXT_DIM,
            "RED": RED,
        }
        self._refresh_style()

    def set_palette(self, palette: dict[str, str]):
        self._palette = {
            **self._palette,
            **palette,
        }
        self._refresh_style()

    def set_active(self, active: bool):
        self._active = active
        self._refresh_style()

    def _refresh_style(self):
        teal = self._palette.get("TEAL", TEAL)
        teal_bright = self._palette.get("TEAL_BRIGHT", TEAL_BRIGHT)
        text = self._palette.get("TEXT", TEXT)
        text_dim = self._palette.get("TEXT_DIM", TEXT_DIM)
        red = self._palette.get("RED", RED)
        if self._danger:
            self.setStyleSheet(f"""
                QPushButton {{
                    background: transparent; border: none;
                    color: {text_dim}; border-radius: 10px;
                }}
                QPushButton:hover {{
                    background: rgba(224,80,80,0.18); color: {red};
                }}
            """)
        elif self._active:
            self.setStyleSheet(f"""
                QPushButton {{
                    background: rgba(30,180,176,0.18);
                    border: 1px solid {teal};
                    color: {teal}; border-radius: 10px;
                }}
                QPushButton:hover {{
                    background: rgba(30,180,176,0.28); color: {teal_bright};
                }}
            """)
        else:
            self.setStyleSheet(f"""
                QPushButton {{
                    background: transparent; border: none;
                    color: {text_dim}; border-radius: 10px;
                }}
                QPushButton:hover {{
                    background: rgba(255,255,255,0.07); color: {text};
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
    click_through_toggled = pyqtSignal(bool)
    close_requested = pyqtSignal()

    def __init__(self, parent=None):
        super().__init__(parent)
        self.setFixedHeight(HEIGHT)
        self.setCursor(Qt.SizeAllCursor)

        self._pinned = False
        self._folded = False
        self._click_through = False
        self._palette = {
            "BG_PANEL": BG_PANEL,
            "TEAL": TEAL,
            "TEXT": TEXT,
            "TEXT_DIM": TEXT_DIM,
            "TEAL_BRIGHT": TEAL_BRIGHT,
            "RED": RED,
        }

        lay = QHBoxLayout(self)
        lay.setContentsMargins(12, 0, 8, 0)
        lay.setSpacing(6)

        # Titre
        self._lbl = QLabel("⚡ WAKFU")

        # Infos session (timer, perso)
        self._info = QLabel("")

        lay.addWidget(self._lbl)
        lay.addSpacing(6)
        lay.addWidget(self._info)
        lay.addStretch()

        # Boutons
        self._btn_pin   = _TitleBtn("pin.svg", "Fixer / déverrouiller la position")
        self._btn_click = _TitleBtn("clickthrough.svg", "Activer / désactiver le clic à travers")
        self._btn_fold  = _TitleBtn("chevron_down.svg",  "Réduire / déplier")
        self._btn_close = _TitleBtn("close.svg",  "Fermer", danger=True)

        self._btn_pin.clicked.connect(self._toggle_pin)
        self._btn_click.clicked.connect(self._toggle_click_through)
        self._btn_fold.clicked.connect(self._toggle_fold)
        self._btn_close.clicked.connect(self.close_requested.emit)

        lay.addWidget(self._btn_pin)
        lay.addWidget(self._btn_click)
        lay.addWidget(self._btn_fold)
        lay.addWidget(self._btn_close)
        self.set_palette(self._palette)

    # ── API publique ───────────────────────────────────────────────

    def set_info(self, text: str):
        self._info.setText(text)

    @property
    def is_pinned(self) -> bool:
        return self._pinned

    def set_click_through(self, enabled: bool):
        self._click_through = bool(enabled)
        self._btn_click.set_active(self._click_through)

    @property
    def is_click_through(self) -> bool:
        return self._click_through

    def set_palette(self, palette: dict[str, str]):
        self._palette = {
            **self._palette,
            **palette,
        }
        teal = self._palette.get("TEAL", TEAL)
        text_dim = self._palette.get("TEXT_DIM", TEXT_DIM)
        self._lbl.setStyleSheet(
            f"color: {teal}; font-weight: 800; font-size: 13px; letter-spacing: 1px;"
        )
        self._info.setStyleSheet(f"color: {text_dim}; font-size: 10px;")
        self._btn_pin.set_palette(self._palette)
        self._btn_click.set_palette(self._palette)
        self._btn_fold.set_palette(self._palette)
        self._btn_close.set_palette(self._palette)
        self.update()

    # ── Slots internes ─────────────────────────────────────────────

    def _toggle_pin(self):
        self._pinned = not self._pinned
        self._btn_pin.set_active(self._pinned)
        self.pin_toggled.emit(self._pinned)

    def _toggle_fold(self):
        self._folded = not self._folded
        self._btn_fold.setIcon(QIcon(str(_ICON_DIR / ("chevron_up.svg" if self._folded else "chevron_down.svg"))))
        self.fold_toggled.emit(self._folded)

    def _toggle_click_through(self):
        self._click_through = not self._click_through
        self._btn_click.set_active(self._click_through)
        self.click_through_toggled.emit(self._click_through)

    # ── Rendu ──────────────────────────────────────────────────────

    def paintEvent(self, _event):
        p = QPainter(self)
        # Fond
        base = QColor(self._palette.get("BG_PANEL", BG_PANEL))
        top = QColor(base).lighter(108)
        grad = QLinearGradient(0, 0, 0, self.height())
        grad.setColorAt(0.0, top)
        grad.setColorAt(1.0, base)
        p.fillRect(self.rect(), grad)
        # Ligne teal en bas
        p.setPen(QPen(QColor(self._palette.get("TEAL", TEAL)), 1))
        y = self.height() - 1
        p.drawLine(0, y, self.width(), y)
