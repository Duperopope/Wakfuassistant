# ui/tabbar.py — Barre d'onglets style Wakfu

from PyQt5.QtWidgets import QWidget, QHBoxLayout, QPushButton
from PyQt5.QtCore    import pyqtSignal
from PyQt5.QtGui     import QPainter, QColor, QPen

from ui.theme import BG_PANEL, BG, TEAL, TEAL_BRIGHT, TEXT, TEXT_DIM, BORDER

HEIGHT  = 30
TABS    = ["Personnage", "Inventaire", "HDV", "Marché", "Combat", "Banque", "Options"]


class _TabBtn(QPushButton):

    def __init__(self, label: str):
        super().__init__(label)
        self.setCheckable(True)
        self._refresh(False)

    def _refresh(self, active: bool):
        if active:
            self.setStyleSheet(f"""
                QPushButton {{
                    background: transparent;
                    border: none;
                    border-bottom: 2px solid {TEAL};
                    color: {TEAL_BRIGHT};
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
                    color: {TEXT_DIM};
                    font-size: 10px;
                    font-weight: 700;
                    padding: 0 6px;
                    letter-spacing: 0.5px;
                }}
                QPushButton:hover {{
                    color: {TEXT};
                    border-bottom-color: {BORDER};
                }}
            """)

    def setChecked(self, checked: bool):
        super().setChecked(checked)
        self._refresh(checked)


class TabBar(QWidget):
    """
    Barre d'onglets horizontale.

    Signal tab_changed(int) émis au changement d'onglet.
    """

    tab_changed = pyqtSignal(int)

    def __init__(self, parent=None):
        super().__init__(parent)
        self.setFixedHeight(HEIGHT)

        lay = QHBoxLayout(self)
        lay.setContentsMargins(4, 0, 4, 0)
        lay.setSpacing(0)

        self._btns: list[_TabBtn] = []
        for i, name in enumerate(TABS):
            btn = _TabBtn(name)
            btn.clicked.connect(lambda _, idx=i: self._select(idx))
            lay.addWidget(btn)
            self._btns.append(btn)

        self._select(0)

    def _select(self, idx: int):
        for i, btn in enumerate(self._btns):
            btn.setChecked(i == idx)
        self.tab_changed.emit(idx)

    def paintEvent(self, _event):
        p = QPainter(self)
        p.fillRect(self.rect(), QColor(BG_PANEL))
        # Séparateur bas
        p.setPen(QPen(QColor(BORDER), 1))
        y = self.height() - 1
        p.drawLine(0, y, self.width(), y)
