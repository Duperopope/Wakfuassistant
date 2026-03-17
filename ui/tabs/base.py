# ui/tabs/base.py — Classe de base + placeholder + WIP widget

from pathlib import Path

from PyQt5.QtCore import Qt
from PyQt5.QtGui import QPainter, QColor, QMovie, QLinearGradient, QPixmap
from PyQt5.QtWidgets import QWidget, QVBoxLayout, QLabel, QApplication

from ui.theme import BG, TEXT_DIM, TEAL

_WIP_GIF = Path(__file__).resolve().parents[1] / "assets" / "Parts" / "wip.gif"


class BaseTab(QWidget):
    """
    Classe de base pour tous les onglets.
    Fournit un fond peint (illustration + emblème watermark) et refresh().
    """

    _shared_illus: "QPixmap | None"       = None   # illustration breed (droite)
    _shared_class_icon: "QPixmap | None"  = None   # emblème classe (watermark centré)

    @classmethod
    def set_shared_illustration(cls, pix: "QPixmap | None"):
        cls._shared_illus = pix
        cls._repaint_all()

    @classmethod
    def set_shared_class_icon(cls, pix: "QPixmap | None"):
        cls._shared_class_icon = pix
        cls._repaint_all()

    @classmethod
    def _repaint_all(cls):
        app = QApplication.instance()
        if app:
            for w in app.allWidgets():
                if isinstance(w, BaseTab):
                    w.update()

    def __init__(self, parent=None):
        super().__init__(parent)

    def paintEvent(self, _event):
        p = QPainter(self)
        p.fillRect(self.rect(), QColor(BG))

        w, h = self.width(), self.height()
        bg = QColor(BG)

        # ── Illustration breed (droite, 22% opacity) ────────────────────
        illus = BaseTab._shared_illus
        if illus and not illus.isNull():
            scaled = illus.scaledToHeight(h, Qt.SmoothTransformation)
            if scaled.width() < w:
                scaled = illus.scaledToWidth(w, Qt.SmoothTransformation)
            x = w - scaled.width()
            y = (h - scaled.height()) // 2
            p.setOpacity(0.22)
            p.drawPixmap(x, y, scaled)
            p.setOpacity(1.0)

            grad = QLinearGradient(0, 0, w, 0)
            grad.setColorAt(0.0,  QColor(bg.red(), bg.green(), bg.blue(), 230))
            grad.setColorAt(0.45, QColor(bg.red(), bg.green(), bg.blue(), 120))
            grad.setColorAt(1.0,  QColor(bg.red(), bg.green(), bg.blue(), 0))
            p.fillRect(self.rect(), grad)

        # ── Emblème classe watermark (centré, 7% opacity) ───────────────
        emblem = BaseTab._shared_class_icon
        if emblem and not emblem.isNull():
            size = min(w, h) * 9 // 10
            scaled = emblem.scaled(size, size, Qt.KeepAspectRatio, Qt.SmoothTransformation)
            ex = (w - scaled.width()) // 2
            ey = (h - scaled.height()) // 2
            p.setOpacity(0.07)
            p.drawPixmap(ex, ey, scaled)
            p.setOpacity(1.0)

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
