# ui/tabbar.py — Barre d'onglets style Wakfu

from PyQt5.QtWidgets import QWidget, QHBoxLayout, QPushButton
from PyQt5.QtCore    import pyqtSignal, Qt
from PyQt5.QtGui     import QPainter, QColor, QPen, QFont, QFontMetrics

from ui.theme import BG_PANEL, BG, TEAL, TEAL_BRIGHT, TEXT, TEXT_DIM, BORDER

HEIGHT  = 30
TABS    = ["Personnage", "Inventaire", "HDV", "Transactions", "Combat", "Metiers", "Options"]


class _TabBtn(QPushButton):

    def __init__(self, label: str, palette: dict[str, str] | None = None):
        super().__init__(label)
        self._full_label = label
        self.setToolTip(label)
        self.setCheckable(True)
        self._base_font_size = 10
        self._min_font_size = 6
        self._palette = palette or {
            "TEAL": TEAL,
            "TEAL_BRIGHT": TEAL_BRIGHT,
            "TEXT": TEXT,
            "TEXT_DIM": TEXT_DIM,
            "BORDER": BORDER,
        }
        self._refresh(False)
        self._fit_text_to_width()

    def set_palette(self, palette: dict[str, str]):
        self._palette = palette
        self._refresh(self.isChecked())

    def resizeEvent(self, event):
        super().resizeEvent(event)
        self._fit_text_to_width()

    def _fit_text_to_width(self):
        # Texte complet obligatoire: on ajuste la taille de police au lieu de tronquer.
        super().setText(self._full_label)
        available = max(10, self.width() - 10)

        size = self._base_font_size
        while size >= self._min_font_size:
            f = QFont(self.font())
            f.setPointSize(size)
            self.setFont(f)
            fm = QFontMetrics(f)
            if fm.horizontalAdvance(self._full_label) <= available:
                break
            size -= 1

    def _refresh(self, active: bool):
        teal = self._palette.get("TEAL", TEAL)
        teal_bright = self._palette.get("TEAL_BRIGHT", TEAL_BRIGHT)
        text = self._palette.get("TEXT", TEXT)
        text_dim = self._palette.get("TEXT_DIM", TEXT_DIM)
        border = self._palette.get("BORDER", BORDER)
        if active:
            self.setStyleSheet(f"""
                QPushButton {{
                    background: transparent;
                    border: none;
                    border-bottom: 2px solid {teal};
                    color: {teal_bright};
                    font-size: 10px;
                    font-weight: 800;
                    padding: 0 6px;
                    letter-spacing: 0.5px;
                }}
            """)
        else:
            self.setStyleSheet(f"""
                QPushButton {{
                    background: transparent;
                    border: none;
                    border-bottom: 2px solid transparent;
                    color: {text_dim};
                    font-size: 10px;
                    font-weight: 700;
                    padding: 0 6px;
                    letter-spacing: 0.5px;
                }}
                QPushButton:hover {{
                    color: {text};
                    border-bottom-color: {border};
                }}
            """)

    def setChecked(self, checked: bool):
        super().setChecked(checked)
        self._refresh(checked)
        self._fit_text_to_width()


class TabBar(QWidget):
    """
    Barre d'onglets horizontale.

    Signal tab_changed(int) émis au changement d'onglet.
    """

    tab_changed = pyqtSignal(int)

    def __init__(self, parent=None):
        super().__init__(parent)
        self.setFixedHeight(HEIGHT)
        self._current_idx = 0
        self._palette = {
            "BG_PANEL": BG_PANEL,
            "BORDER": BORDER,
            "TEAL": TEAL,
            "TEAL_BRIGHT": TEAL_BRIGHT,
            "TEXT": TEXT,
            "TEXT_DIM": TEXT_DIM,
        }

        lay = QHBoxLayout(self)
        lay.setContentsMargins(4, 0, 4, 0)
        lay.setSpacing(0)

        self._btns: list[_TabBtn] = []
        for i, name in enumerate(TABS):
            btn = _TabBtn(name, self._palette)
            btn.clicked.connect(lambda _, idx=i: self._select(idx))
            lay.addWidget(btn)
            self._btns.append(btn)

        self._select(0)

    def _select(self, idx: int):
        self._current_idx = idx
        for i, btn in enumerate(self._btns):
            btn.setChecked(i == idx)
        self.tab_changed.emit(idx)

    def set_current_index(self, idx: int, emit_signal: bool = False):
        if idx < 0 or idx >= len(self._btns):
            return
        self._current_idx = idx
        for i, btn in enumerate(self._btns):
            btn.setChecked(i == idx)
        if emit_signal:
            self.tab_changed.emit(idx)

    def current_index(self) -> int:
        return int(self._current_idx)

    def paintEvent(self, _event):
        p = QPainter(self)
        p.fillRect(self.rect(), QColor(self._palette.get("BG_PANEL", BG_PANEL)))
        # Séparateur bas
        p.setPen(QPen(QColor(self._palette.get("BORDER", BORDER)), 1))
        y = self.height() - 1
        p.drawLine(0, y, self.width(), y)

    def set_palette(self, palette: dict[str, str]):
        self._palette = {
            **self._palette,
            **palette,
        }
        for btn in self._btns:
            btn.set_palette(self._palette)
        self.update()
