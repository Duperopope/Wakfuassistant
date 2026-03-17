# ui/tabs/base.py — Classe de base + placeholder + WIP widget

from pathlib import Path

from PyQt5.QtCore import Qt
from PyQt5.QtGui import QPainter, QColor, QMovie
from PyQt5.QtWidgets import QWidget, QVBoxLayout, QLabel

from ui.theme import BG, TEXT_DIM, TEAL

_WIP_GIF = Path(__file__).resolve().parents[1] / "assets" / "Parts" / "wip.gif"


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


class WipWidget(QWidget):
    """Widget 'Work In Progress' : affiche le gif animé wip.gif centré."""

    def __init__(self, label: str = "", parent=None):
        super().__init__(parent)
        lay = QVBoxLayout(self)
        lay.setAlignment(Qt.AlignCenter)
        lay.setContentsMargins(20, 20, 20, 20)
        lay.setSpacing(10)

        # GIF animé
        gif_lbl = QLabel()
        gif_lbl.setAlignment(Qt.AlignCenter)
        gif_lbl.setStyleSheet("background: transparent;")
        if _WIP_GIF.exists():
            movie = QMovie(str(_WIP_GIF))
            gif_lbl.setMovie(movie)
            movie.start()
        else:
            gif_lbl.setText("🚧")
            gif_lbl.setStyleSheet("font-size: 32px; background: transparent;")
        lay.addWidget(gif_lbl)

        if label:
            lbl = QLabel(label)
            lbl.setAlignment(Qt.AlignCenter)
            lbl.setWordWrap(True)
            lbl.setStyleSheet(
                f"color: {TEXT_DIM}; font-size: 10px; background: transparent;"
            )
            lay.addWidget(lbl)


class PlaceholderTab(BaseTab):
    """Onglet vide affiché avant implémentation — affiche le gif WIP."""

    def __init__(self, name: str, parent=None):
        super().__init__(parent)
        lay = QVBoxLayout(self)
        lay.setAlignment(Qt.AlignCenter)
        lay.addWidget(WipWidget(f"Onglet {name}"))
