# ui/tabs/base.py — Classe de base + placeholder

from PyQt5.QtWidgets import QWidget, QVBoxLayout, QLabel
from PyQt5.QtCore    import Qt
from PyQt5.QtGui     import QPainter, QColor

from ui.theme import BG, TEXT_DIM, TEAL, BORDER


class BaseTab(QWidget):
    """
    Classe de base pour tous les onglets.
    Fournit un fond peint et une méthode refresh() à surcharger.
    """

    def __init__(self, parent=None):
        super().__init__(parent)

    def paintEvent(self, _event):
        p = QPainter(self)
        p.fillRect(self.rect(), QColor(BG))

    def refresh(self):
        """Appelée par la fenêtre principale pour mettre à jour l'affichage."""
        pass


class PlaceholderTab(BaseTab):
    """Onglet vide affiché avant implémentation."""

    def __init__(self, name: str, parent=None):
        super().__init__(parent)

        lay = QVBoxLayout(self)
        lay.setAlignment(Qt.AlignCenter)

        icon = QLabel("🚧")
        icon.setAlignment(Qt.AlignCenter)
        icon.setStyleSheet("font-size: 32px; background: transparent;")

        lbl = QLabel(f"Onglet <b>{name}</b>")
        lbl.setAlignment(Qt.AlignCenter)
        lbl.setStyleSheet(
            f"color: {TEXT_DIM}; font-size: 13px; background: transparent;"
        )

        sub = QLabel("En cours de construction")
        sub.setAlignment(Qt.AlignCenter)
        sub.setStyleSheet(
            f"color: {TEAL}; font-size: 10px; background: transparent; "
            f"letter-spacing: 1px;"
        )

        lay.addWidget(icon)
        lay.addSpacing(8)
        lay.addWidget(lbl)
        lay.addSpacing(4)
        lay.addWidget(sub)
