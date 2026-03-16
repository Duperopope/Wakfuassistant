# ui/window.py — Fenêtre overlay principale

from PyQt5.QtWidgets import QWidget, QVBoxLayout, QStackedWidget, QApplication
from PyQt5.QtCore    import Qt, QPoint, QRect, QTimer, QDateTime
from PyQt5.QtGui     import QPainter, QColor, QPen

from ui.theme    import BG, BORDER, TEAL
from ui.titlebar import TitleBar
from ui.tabbar   import TabBar, TABS
from ui.tabs.base import PlaceholderTab

DEFAULT_W = 300
DEFAULT_H = 600
MIN_W     = 220
MIN_H     = 120
EDGE      = 6          # px depuis le bord pour détecter le resize

# Bitmask directions resize
_L = 1; _R = 2; _T = 4; _B = 8

_CURSORS = {
    _L:      Qt.SizeHorCursor,
    _R:      Qt.SizeHorCursor,
    _T:      Qt.SizeVerCursor,
    _B:      Qt.SizeVerCursor,
    _T|_L:   Qt.SizeFDiagCursor,
    _B|_R:   Qt.SizeFDiagCursor,
    _T|_R:   Qt.SizeBDiagCursor,
    _B|_L:   Qt.SizeBDiagCursor,
}


def _edge_at(pos: QPoint, w: int, h: int) -> int:
    x, y = pos.x(), pos.y()
    flags = 0
    if x < EDGE:     flags |= _L
    if x > w - EDGE: flags |= _R
    if y < EDGE:     flags |= _T
    if y > h - EDGE: flags |= _B
    return flags


class OverlayWindow(QWidget):
    """
    Fenêtre overlay :
      - frameless, fond semi-transparent, always-on-top
      - draggable depuis la titlebar
      - redimensionnable depuis tous les bords et coins
      - repliable sur la titlebar (bouton ▾)
      - pin : verrouille la position (bouton 📌)
    """

    def __init__(self):
        super().__init__()
        self._drag_pos:        QPoint | None = None
        self._resize_dir:      int           = 0
        self._resize_start_g:  QRect         = QRect()
        self._resize_start_p:  QPoint        = QPoint()
        self._folded:          bool          = False
        self._saved_h:         int           = DEFAULT_H

        self._setup_window()
        self._build_ui()
        self._connect()
        self._position()
        self._start_timer()

    # ── Initialisation ────────────────────────────────────────────

    def _setup_window(self):
        self.setWindowFlags(
            Qt.FramelessWindowHint |
            Qt.WindowStaysOnTopHint |
            Qt.Tool
        )
        self.setAttribute(Qt.WA_TranslucentBackground)
        self.setMouseTracking(True)
        self.setMinimumSize(MIN_W, MIN_H)
        self.resize(DEFAULT_W, DEFAULT_H)

    def _build_ui(self):
        root = QVBoxLayout(self)
        root.setContentsMargins(1, 1, 1, 1)
        root.setSpacing(0)

        self._titlebar = TitleBar(self)
        root.addWidget(self._titlebar)

        self._tabbar = TabBar(self)
        root.addWidget(self._tabbar)

        self._stack = QStackedWidget(self)
        root.addWidget(self._stack)

        self._tab_widgets: list[QWidget] = []
        for name in TABS:
            w = PlaceholderTab(name)
            self._stack.addWidget(w)
            self._tab_widgets.append(w)

    def _connect(self):
        self._titlebar.fold_toggled.connect(self._on_fold)
        self._titlebar.pin_toggled.connect(self._on_pin)
        self._titlebar.close_requested.connect(self.close)
        self._tabbar.tab_changed.connect(self._stack.setCurrentIndex)

    def _position(self):
        screen = QApplication.primaryScreen().availableGeometry()
        self.move(screen.right() - DEFAULT_W - 10, screen.top() + 40)

    def _start_timer(self):
        self._t0 = QDateTime.currentDateTime()
        t = QTimer(self)
        t.timeout.connect(self._tick)
        t.start(1000)

    # ── API publique ──────────────────────────────────────────────

    def set_tab(self, index: int, widget: QWidget):
        """Remplace un placeholder par le vrai widget d'onglet."""
        old = self._stack.widget(index)
        self._stack.removeWidget(old)
        old.deleteLater()
        self._stack.insertWidget(index, widget)
        self._tab_widgets[index] = widget

    # ── Slots ─────────────────────────────────────────────────────

    def _on_fold(self, folded: bool):
        self._folded = folded
        if folded:
            self._saved_h = self.height()
            self._tabbar.hide()
            self._stack.hide()
            self.setFixedHeight(self._titlebar.height() + 2)
        else:
            self.setMinimumHeight(MIN_H)
            self.setMaximumHeight(16_777_215)
            self._tabbar.show()
            self._stack.show()
            self.resize(self.width(), self._saved_h)

    def _on_pin(self, pinned: bool):
        # Pin = position verrouillée (ne peut plus être draggée)
        pass

    def _tick(self):
        e = self._t0.secsTo(QDateTime.currentDateTime())
        self._titlebar.set_info(f"{e//3600:02d}:{(e%3600)//60:02d}:{e%60:02d}")

    # ── Resize + Drag — événements souris ─────────────────────────

    def mousePressEvent(self, event):
        if event.button() != Qt.LeftButton:
            return

        edge = _edge_at(event.pos(), self.width(), self.height())

        if edge and not self._folded:
            # Démarrer un resize
            self._resize_dir     = edge
            self._resize_start_p = event.globalPos()
            self._resize_start_g = self.geometry()
            self._drag_pos       = None
        elif (not self._titlebar.is_pinned
              and event.y() <= self._titlebar.height()):
            # Démarrer un drag
            self._drag_pos   = event.globalPos() - self.frameGeometry().topLeft()
            self._resize_dir = 0

    def mouseMoveEvent(self, event):
        if event.buttons() == Qt.LeftButton:
            if self._drag_pos:
                self.move(event.globalPos() - self._drag_pos)
                return
            if self._resize_dir:
                self._do_resize(event.globalPos())
                return

        # Pas de clic : mettre à jour le curseur
        self._update_cursor(event.pos())

    def mouseReleaseEvent(self, _event):
        self._drag_pos   = None
        self._resize_dir = 0

    def leaveEvent(self, _event):
        self.setCursor(Qt.ArrowCursor)

    # ── Resize ────────────────────────────────────────────────────

    def _do_resize(self, gp: QPoint):
        dx = gp.x() - self._resize_start_p.x()
        dy = gp.y() - self._resize_start_p.y()
        g  = self._resize_start_g

        x, y, w, h = g.x(), g.y(), g.width(), g.height()

        if self._resize_dir & _R:
            w = max(MIN_W, g.width() + dx)
        if self._resize_dir & _B:
            h = max(MIN_H, g.height() + dy)
        if self._resize_dir & _L:
            w = max(MIN_W, g.width() - dx)
            x = g.x() + g.width() - w
        if self._resize_dir & _T:
            h = max(MIN_H, g.height() - dy)
            y = g.y() + g.height() - h

        self.setGeometry(x, y, w, h)

    def _update_cursor(self, pos: QPoint):
        if self._folded:
            self.setCursor(Qt.ArrowCursor)
            return
        edge = _edge_at(pos, self.width(), self.height())
        if edge in _CURSORS:
            self.setCursor(_CURSORS[edge])
        elif pos.y() <= self._titlebar.height() and not self._titlebar.is_pinned:
            self.setCursor(Qt.SizeAllCursor)
        else:
            self.setCursor(Qt.ArrowCursor)

    # ── Rendu ─────────────────────────────────────────────────────

    def paintEvent(self, _event):
        p = QPainter(self)
        p.setRenderHint(QPainter.Antialiasing)
        r = self.rect()

        p.setPen(Qt.NoPen)
        p.setBrush(QColor(14, 16, 21, 242))
        p.drawRoundedRect(r, 4, 4)

        p.setPen(QPen(QColor(BORDER), 1))
        p.setBrush(Qt.NoBrush)
        p.drawRoundedRect(r.adjusted(0, 0, -1, -1), 4, 4)
