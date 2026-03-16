# ui/window.py — Fenêtre overlay principale

from PyQt5.QtWidgets import QWidget, QVBoxLayout, QStackedWidget, QApplication, QPushButton
from PyQt5.QtCore    import Qt, QPoint, QRect, QTimer, QDateTime, QSettings, QRectF
from PyQt5.QtGui     import QPainter, QColor, QPen, QPainterPath, QRegion
import win32gui
import win32con

from ui.theme    import BG, BORDER, TEAL, TEAL_BRIGHT, QSS, build_qss, get_palette, DEFAULT_PALETTE
from ui.titlebar import TitleBar
from ui.tabbar   import TabBar, TABS
from ui.tabs.base import PlaceholderTab
from ui.tabs.options import OptionsTab
from core.wakfu_tracker import WakfuTracker

DEFAULT_W = 440
DEFAULT_H = 600
MIN_W     = 220
MIN_H     = 120
EDGE      = 12         # zone plus large pour faciliter le resize
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
        self._relative_offset_ratio: tuple[float, float] | None = None
        self._relative_size_ratio: tuple[float, float] | None = None
        self._in_programmatic_move: bool = False
        self._corner_radius = self._settings.value("window_corner_radius", 24, type=int)
        self._palette_name = self._settings.value("ui_palette", DEFAULT_PALETTE, type=str)
        self._palette = get_palette(self._palette_name)
        self._click_through = self._settings.value("click_through", False, type=bool)
        self._click_unlock_btn: QPushButton | None = None

        if self._settings.value("relative_offset_set", False, type=bool):
            ox = self._settings.value("relative_offset_rx", 0.0, type=float)
            oy = self._settings.value("relative_offset_ry", 0.0, type=float)
            self._relative_offset_ratio = (float(ox), float(oy))

        if self._settings.value("relative_size_set", False, type=bool):
            rw = self._settings.value("relative_size_rw", 0.0, type=float)
            rh = self._settings.value("relative_size_rh", 0.0, type=float)
            self._relative_size_ratio = (float(rw), float(rh))

        self._setup_window()
        self._setup_click_unlock_button()
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
        saved_opacity = self._settings.value("overlay_opacity", 0.96, type=float)
        self._opacity = max(0.35, min(1.0, float(saved_opacity)))
        self.setWindowOpacity(self._opacity)
        self._font_family = self._settings.value("ui_font_family", "Noto Sans", type=str)
        self._apply_app_font_style()
        saved_w = self._settings.value("window_width", DEFAULT_W, type=int)
        saved_h = self._settings.value("window_height", DEFAULT_H, type=int)
        saved_w = max(MIN_W, DEFAULT_W, int(saved_w))
        saved_h = max(MIN_H, int(saved_h))
        self._saved_h = saved_h
        self.resize(saved_w, saved_h)
        self._apply_rounded_mask()

    def _build_ui(self):
        root = QVBoxLayout(self)
        root.setContentsMargins(1, 1, 1, 1)
        root.setSpacing(0)

        self._titlebar = TitleBar(self)
        self._titlebar.set_palette(self._palette)
        root.addWidget(self._titlebar)

        self._tabbar = TabBar(self)
        self._tabbar.set_palette(self._palette)
        root.addWidget(self._tabbar)

        self._stack = QStackedWidget(self)
        root.addWidget(self._stack)

        self._tab_widgets: list[QWidget] = []
        for name in TABS:
            w = PlaceholderTab(name)
            self._stack.addWidget(w)
            self._tab_widgets.append(w)

        if "Options" in TABS:
            idx = TABS.index("Options")
            opt = OptionsTab(
                self._opacity,
                self._font_family,
                self._palette_name,
                self._corner_radius,
                self,
            )
            opt.opacity_changed.connect(self.set_overlay_opacity)
            opt.font_changed.connect(self.set_overlay_font_family)
            opt.palette_changed.connect(self.set_overlay_palette)
            opt.shape_changed.connect(self.set_window_corner_radius)
            self.set_tab(idx, opt)

    def _setup_click_unlock_button(self):
        btn = QPushButton("🖱 Deverrouiller", None)
        btn.setWindowFlags(Qt.Tool | Qt.FramelessWindowHint | Qt.WindowStaysOnTopHint)
        btn.setAttribute(Qt.WA_TranslucentBackground, False)
        btn.setFocusPolicy(Qt.NoFocus)
        btn.setFixedHeight(28)
        btn.setStyleSheet(
            f"""
            QPushButton {{
                background: {BG};
                color: {TEAL_BRIGHT};
                border: 1px solid {BORDER};
                border-radius: 8px;
                padding: 4px 10px;
                font-weight: 700;
            }}
            QPushButton:hover {{
                border-color: {TEAL};
                background: #111722;
            }}
            """
        )
        btn.clicked.connect(lambda: self.set_click_through(False))
        btn.hide()
        self._click_unlock_btn = btn

    def _connect(self):
        self._titlebar.fold_toggled.connect(self._on_fold)
        self._titlebar.pin_toggled.connect(self._on_pin)
        self._titlebar.click_through_toggled.connect(self._on_click_through)
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
            self._apply_relative_to_wakfu(*self._wakfu_rect)

    def _on_click_through(self, enabled: bool):
        self.set_click_through(enabled)

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
        self._update_click_unlock_button_visibility()

    def _on_wakfu_geometry(self, x: int, y: int, w: int, h: int):
        self._wakfu_rect = (x, y, w, h)
        if not self._titlebar.is_pinned:
            self._apply_relative_to_wakfu(x, y, w, h)

    def _on_wakfu_minimized(self):
        self.hide()
        self._update_click_unlock_button_visibility()

    def _on_wakfu_restored(self):
        if self._wakfu_rect and not self._titlebar.is_pinned:
            self._apply_relative_to_wakfu(*self._wakfu_rect)
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
            self._update_click_unlock_button_visibility()
            return

        if self._tracker.rect and not self._titlebar.is_pinned:
            self._apply_relative_to_wakfu(*self._tracker.rect)
        self.show()
        self.raise_()
        self._update_click_unlock_button_visibility()

    def _ensure_relative_defaults(self, wakfu_w: int, wakfu_h: int):
        if wakfu_w <= 0 or wakfu_h <= 0:
            return

        if self._relative_size_ratio is None:
            rw = max(MIN_W / wakfu_w, self.width() / wakfu_w)
            rh = max(MIN_H / wakfu_h, self.height() / wakfu_h)
            rw = min(0.95, max(0.20, rw))
            rh = min(0.95, max(0.20, rh))
            self._relative_size_ratio = (rw, rh)

        if self._relative_offset_ratio is None and self._wakfu_rect:
            wx, wy, ww, wh = self._wakfu_rect
            ox = (self.x() - wx) / max(1, ww)
            oy = (self.y() - wy) / max(1, wh)
            self._relative_offset_ratio = (ox, oy)

        self._save_relative_layout()

    def _apply_relative_to_wakfu(self, x: int, y: int, w: int, h: int):
        screen = QApplication.primaryScreen().availableGeometry()

        self._ensure_relative_defaults(w, h)
        if self._relative_size_ratio is None or self._relative_offset_ratio is None:
            return

        rw, rh = self._relative_size_ratio
        oxr, oyr = self._relative_offset_ratio

        target_w = int(max(MIN_W, min(w - 10, round(w * rw))))
        target_h = int(max(MIN_H, min(h - 10, round(h * rh))))
        target_x = int(round(x + (w * oxr)))
        target_y = int(round(y + (h * oyr)))

        target_w = max(MIN_W, target_w)
        target_h = max(MIN_H, target_h)

        target_x = max(screen.left(), min(target_x, screen.right() - target_w))
        target_y = max(screen.top(), min(target_y, screen.bottom() - target_h))

        self._in_programmatic_move = True
        if self._folded:
            self.move(target_x, target_y)
            self.resize(target_w, self.height())
        else:
            self.setGeometry(target_x, target_y, target_w, target_h)
        self._in_programmatic_move = False
        self._position_click_unlock_button()

    def _save_relative_layout(self):
        if self._relative_offset_ratio is None:
            self._settings.setValue("relative_offset_set", False)
            self._settings.remove("relative_offset_rx")
            self._settings.remove("relative_offset_ry")
        else:
            ox, oy = self._relative_offset_ratio
            self._settings.setValue("relative_offset_set", True)
            self._settings.setValue("relative_offset_rx", float(ox))
            self._settings.setValue("relative_offset_ry", float(oy))

        if self._relative_size_ratio is None:
            self._settings.setValue("relative_size_set", False)
            self._settings.remove("relative_size_rw")
            self._settings.remove("relative_size_rh")
        else:
            rw, rh = self._relative_size_ratio
            self._settings.setValue("relative_size_set", True)
            self._settings.setValue("relative_size_rw", float(rw))
            self._settings.setValue("relative_size_rh", float(rh))

    def set_overlay_opacity(self, opacity: float):
        self._opacity = max(0.35, min(1.0, float(opacity)))
        if not self._click_through:
            self.setWindowOpacity(self._opacity)
        self._settings.setValue("overlay_opacity", self._opacity)

    def set_overlay_font_family(self, family: str):
        if not family:
            return
        self._font_family = str(family)
        self._apply_app_font_style()
        self._settings.setValue("ui_font_family", self._font_family)

    def set_overlay_palette(self, palette_name: str):
        if not palette_name:
            return
        self._palette_name = str(palette_name)
        self._palette = get_palette(self._palette_name)
        self._titlebar.set_palette(self._palette)
        self._tabbar.set_palette(self._palette)
        self._apply_app_font_style()
        self.update()
        self._settings.setValue("ui_palette", self._palette_name)

    def set_window_corner_radius(self, radius: int):
        self._corner_radius = max(4, min(32, int(radius)))
        self._apply_rounded_mask()
        self.update()
        self._settings.setValue("window_corner_radius", self._corner_radius)

    def set_click_through(self, enabled: bool):
        self._click_through = bool(enabled)
        self._titlebar.set_click_through(self._click_through)
        self._settings.setValue("click_through", self._click_through)
        # Mode pass-through plus discret: opacité fixe à 60%.
        self.setWindowOpacity(0.60 if self._click_through else self._opacity)
        self._apply_click_through_style()
        self._update_click_unlock_button_visibility()

    def _apply_click_through_style(self):
        hwnd = int(self.winId())
        try:
            ex_style = win32gui.GetWindowLong(hwnd, win32con.GWL_EXSTYLE)
            if self._click_through:
                ex_style |= win32con.WS_EX_TRANSPARENT
            else:
                ex_style &= ~win32con.WS_EX_TRANSPARENT
            win32gui.SetWindowLong(hwnd, win32con.GWL_EXSTYLE, ex_style)
            win32gui.SetWindowPos(
                hwnd,
                0,
                0,
                0,
                0,
                0,
                win32con.SWP_NOMOVE
                | win32con.SWP_NOSIZE
                | win32con.SWP_NOZORDER
                | win32con.SWP_FRAMECHANGED,
            )
        except Exception:
            pass

    def _position_click_unlock_button(self):
        if self._click_unlock_btn is None:
            return
        self._click_unlock_btn.adjustSize()
        fg = self.frameGeometry()
        x = fg.x() + max(8, fg.width() - self._click_unlock_btn.width() - 8)
        y = fg.y() + 8
        self._click_unlock_btn.move(x, y)

    def _update_click_unlock_button_visibility(self):
        if self._click_unlock_btn is None:
            return

        show_btn = self._click_through and self.isVisible()
        if show_btn:
            self._position_click_unlock_button()
            self._click_unlock_btn.show()
            self._click_unlock_btn.raise_()
        else:
            self._click_unlock_btn.hide()

    def _apply_app_font_style(self):
        app = QApplication.instance()
        if app is None:
            return

        family = self._font_family.replace('"', '\\"')
        font_stack = f'"{family}", "Noto Sans", "Inter", "IBM Plex Sans", "Segoe UI Variable", "Segoe UI", sans-serif'
        app.setStyleSheet(build_qss(self._palette_name, font_stack))

    def _apply_rounded_mask(self):
        # Forme réelle de la fenêtre: pas seulement peinte, mais aussi masquée.
        path = QPainterPath()
        path.addRoundedRect(QRectF(self.rect()), self._corner_radius, self._corner_radius)
        region = QRegion(path.toFillPolygon().toPolygon())
        self.setMask(region)

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
        if not self._titlebar.is_pinned and self._wakfu_rect and not self._in_programmatic_move:
            wx, wy, ww, wh = self._wakfu_rect
            if ww > 0 and wh > 0:
                self._relative_offset_ratio = ((self.x() - wx) / ww, (self.y() - wy) / wh)
                if not self._folded:
                    self._relative_size_ratio = (self.width() / ww, self.height() / wh)
                self._save_relative_layout()

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
        bg = QColor(self._palette.get("BG", BG))
        bg.setAlpha(242)
        p.setBrush(bg)
        p.drawRoundedRect(r, self._corner_radius, self._corner_radius)

        p.setPen(QPen(QColor(self._palette.get("BORDER", BORDER)), 1))
        p.setBrush(Qt.NoBrush)
        p.drawRoundedRect(r.adjusted(0, 0, -1, -1), self._corner_radius, self._corner_radius)

    def resizeEvent(self, event):
        super().resizeEvent(event)
        self._apply_rounded_mask()
        self._position_click_unlock_button()

    def moveEvent(self, event):
        super().moveEvent(event)
        self._position_click_unlock_button()

    def closeEvent(self, event):
        if self._click_unlock_btn is not None:
            self._click_unlock_btn.hide()
            self._click_unlock_btn.deleteLater()
            self._click_unlock_btn = None
        self._settings.setValue("window_width", self.width())
        expanded_h = self._saved_h if self._folded else self.height()
        self._settings.setValue("window_height", max(MIN_H, int(expanded_h)))
        self._save_relative_layout()
        self._settings.sync()
        super().closeEvent(event)

    def showEvent(self, event):
        super().showEvent(event)
        self._titlebar.set_click_through(self._click_through)
        self._apply_click_through_style()
        self._update_click_unlock_button_visibility()
