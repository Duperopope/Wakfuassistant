# ui/window.py — Fenêtre overlay principale

from PyQt5.QtWidgets import QWidget, QVBoxLayout, QStackedWidget, QApplication
from PyQt5.QtCore    import Qt, QPoint, QRect, QTimer, QDateTime, QSettings
from PyQt5.QtGui     import QPainter, QColor, QPen
import win32gui

from ui.theme    import BG, BORDER, TEAL
from ui.titlebar import TitleBar
from ui.tabbar   import TabBar, TABS
from ui.tabs.base import PlaceholderTab
from core.wakfu_tracker import WakfuTracker

DEFAULT_W = 300
DEFAULT_H = 600
MIN_W     = 220
MIN_H     = 120
EDGE      = 6          # px depuis le bord pour détecter le resize
ATTACH_GAP = 6         # espace entre Wakfu et l'overlay

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
        self._settings = QSettings("WakfuAssistant", "Overlay")
        self._drag_pos:        QPoint | None = None
        self._resize_dir:      int           = 0
        self._resize_start_g:  QRect         = QRect()
        self._resize_start_p:  QPoint        = QPoint()
        self._folded:          bool          = False
        self._saved_h:         int           = DEFAULT_H
        self._wakfu_rect:      tuple[int, int, int, int] | None = None
        self._relative_offset: tuple[int, int] | None = None
        self._in_programmatic_move: bool = False

        if self._settings.value("relative_offset_set", False, type=bool):
            ox = self._settings.value("relative_offset_x", 0, type=int)
            oy = self._settings.value("relative_offset_y", 0, type=int)
            self._relative_offset = (int(ox), int(oy))

        self._setup_window()
        self._build_ui()
        self._connect()
        self._setup_wakfu_tracking()
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
        saved_w = self._settings.value("window_width", DEFAULT_W, type=int)
        saved_h = self._settings.value("window_height", DEFAULT_H, type=int)
        saved_w = max(MIN_W, int(saved_w))
        saved_h = max(MIN_H, int(saved_h))
        self._saved_h = saved_h
        self.resize(saved_w, saved_h)

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

    def _setup_wakfu_tracking(self):
        self._tracker = WakfuTracker(self)
        self._tracker.found.connect(self._on_wakfu_found)
        self._tracker.lost.connect(self._on_wakfu_lost)
        self._tracker.geometry_changed.connect(self._on_wakfu_geometry)
        self._tracker.minimized.connect(self._on_wakfu_minimized)
        self._tracker.restored.connect(self._on_wakfu_restored)
        self._tracker.focus_changed.connect(self._on_wakfu_focus_changed)

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
        if not pinned and self._wakfu_rect:
            self._snap_to_wakfu(*self._wakfu_rect)

    def _tick(self):
        e = self._t0.secsTo(QDateTime.currentDateTime())
        self._titlebar.set_info(f"{e//3600:02d}:{(e%3600)//60:02d}:{e%60:02d}")

    def _on_wakfu_found(self, _hwnd: int):
        rect = self._tracker.rect
        if rect:
            self._on_wakfu_geometry(*rect)

    def _on_wakfu_lost(self):
        self._wakfu_rect = None
        self.hide()

    def _on_wakfu_geometry(self, x: int, y: int, w: int, h: int):
        self._wakfu_rect = (x, y, w, h)
        if not self._titlebar.is_pinned:
            self._snap_to_wakfu(x, y, w, h)

    def _on_wakfu_minimized(self):
        self.hide()

    def _on_wakfu_restored(self):
        if self._wakfu_rect and not self._titlebar.is_pinned:
            self._snap_to_wakfu(*self._wakfu_rect)
        if self._tracker.is_focused:
            self.show()

    def _on_wakfu_focus_changed(self, focused: bool):
        # Garder l'overlay visible pendant son interaction directe.
        if not focused:
            try:
                fg = win32gui.GetForegroundWindow()
                if fg == int(self.winId()):
                    return
            except Exception:
                pass
            self.hide()
            return

        if self._tracker.rect and not self._titlebar.is_pinned:
            self._snap_to_wakfu(*self._tracker.rect)
        self.show()
        self.raise_()

    def _snap_to_wakfu(self, x: int, y: int, w: int, h: int):
        screen = QApplication.primaryScreen().availableGeometry()

        if self._relative_offset is None:
            target_x = x + w + ATTACH_GAP
            target_y = y

            # Si ça sort à droite, basculer à gauche de Wakfu.
            if target_x + self.width() > screen.right():
                target_x = x - self.width() - ATTACH_GAP

            self._relative_offset = (target_x - x, target_y - y)
            self._save_relative_offset()
        else:
            ox, oy = self._relative_offset
            target_x = x + ox
            target_y = y + oy

        target_x = max(screen.left(), min(target_x, screen.right() - self.width()))
        target_y = max(screen.top(), min(target_y, screen.bottom() - self.height()))

        self._in_programmatic_move = True
        self.move(target_x, target_y)
        self._in_programmatic_move = False

    def _save_relative_offset(self):
        if self._relative_offset is None:
            self._settings.setValue("relative_offset_set", False)
            self._settings.remove("relative_offset_x")
            self._settings.remove("relative_offset_y")
            return

        ox, oy = self._relative_offset
        self._settings.setValue("relative_offset_set", True)
        self._settings.setValue("relative_offset_x", int(ox))
        self._settings.setValue("relative_offset_y", int(oy))

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
        if self._drag_pos and not self._titlebar.is_pinned and self._wakfu_rect and not self._in_programmatic_move:
            wx, wy, _ww, _wh = self._wakfu_rect
            self._relative_offset = (self.x() - wx, self.y() - wy)
            self._save_relative_offset()

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

    def closeEvent(self, event):
        self._settings.setValue("window_width", self.width())
        expanded_h = self._saved_h if self._folded else self.height()
        self._settings.setValue("window_height", max(MIN_H, int(expanded_h)))
        self._save_relative_offset()
        self._settings.sync()
        super().closeEvent(event)
