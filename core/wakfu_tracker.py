# core/wakfu_tracker.py
# Surveille la fenêtre Wakfu : position, taille, état (minimisé/restauré).

import os
import win32gui
import win32con
import win32process
from PyQt5.QtCore import QObject, QTimer, pyqtSignal


class WakfuTracker(QObject):
    """
    Signaux émis :
        found(hwnd)               — fenêtre Wakfu détectée
        lost()                    — fenêtre Wakfu fermée / introuvable
        geometry_changed(x,y,w,h) — fenêtre déplacée ou redimensionnée
        minimized()               — Wakfu réduit
        restored()                — Wakfu restauré
    """

    found            = pyqtSignal(int)
    lost             = pyqtSignal()
    geometry_changed = pyqtSignal(int, int, int, int)   # x y w h
    minimized        = pyqtSignal()
    restored         = pyqtSignal()
    focus_changed    = pyqtSignal(bool)                  # True si Wakfu est au premier plan

    _POLL_MS = 400

    def __init__(self, parent=None):
        super().__init__(parent)
        self._pid = os.getpid()
        self._hwnd:          int | None             = None
        self._was_minimized: bool                   = False
        self._was_focused:   bool                   = False
        self._last_rect:     tuple[int,int,int,int] = (0, 0, 0, 0)

        self._timer = QTimer(self)
        self._timer.timeout.connect(self._poll)
        self._timer.start(self._POLL_MS)

    # ── Lecture fenêtre ──────────────────────────────────────────

    def _find_wakfu(self) -> int | None:
        """Retourne le hwnd de la fenêtre Wakfu visible, ou None."""
        found: list[tuple[int, int]] = []

        def _cb(hwnd, _):
            if not win32gui.IsWindowVisible(hwnd):
                return

            title = win32gui.GetWindowText(hwnd)
            if not title:
                return

            title_up = title.upper()
            if "WAKFU" not in title_up:
                return

            # Évite de suivre l'overlay lui-même.
            if "ASSISTANT" in title_up:
                return

            try:
                _, pid = win32process.GetWindowThreadProcessId(hwnd)
                if pid == self._pid:
                    return
            except Exception:
                return

            score = 10
            if title_up.strip().startswith("WAKFU"):
                score += 20
            if not win32gui.IsIconic(hwnd):
                score += 30

            found.append((score, hwnd))

        win32gui.EnumWindows(_cb, None)
        if not found:
            return None
        found.sort(key=lambda item: item[0], reverse=True)
        return found[0][1]

    @staticmethod
    def _get_rect(hwnd: int) -> tuple[int, int, int, int] | None:
        """Retourne (x, y, w, h) de la fenêtre, ou None si erreur."""
        try:
            l, t, r, b = win32gui.GetWindowRect(hwnd)
            return l, t, r - l, b - t
        except Exception:
            return None

    # ── Boucle de polling ────────────────────────────────────────

    def _poll(self):
        hwnd = self._find_wakfu()

        # Wakfu introuvable
        if hwnd is None:
            if self._hwnd is not None:
                self._hwnd = None
                if self._was_focused:
                    self._was_focused = False
                    self.focus_changed.emit(False)
                self.lost.emit()
            return

        # Wakfu détecté pour la première fois
        if hwnd != self._hwnd:
            self._hwnd          = hwnd
            self._was_minimized = False
            self._was_focused   = False
            self._last_rect     = (0, 0, 0, 0)
            self.found.emit(hwnd)

        # Wakfu est-il la fenêtre active ?
        try:
            is_focused = (win32gui.GetForegroundWindow() == hwnd)
        except Exception:
            is_focused = False

        if is_focused != self._was_focused:
            self._was_focused = is_focused
            self.focus_changed.emit(is_focused)

        # État minimisé
        is_min = bool(win32gui.IsIconic(hwnd))
        if is_min and not self._was_minimized:
            self._was_minimized = True
            if self._was_focused:
                self._was_focused = False
                self.focus_changed.emit(False)
            self.minimized.emit()
            return
        if not is_min and self._was_minimized:
            self._was_minimized = False
            self.restored.emit()

        if is_min:
            return

        # Géométrie
        rect = self._get_rect(hwnd)
        if rect and rect != self._last_rect:
            self._last_rect = rect
            self.geometry_changed.emit(*rect)

    # ── Accesseurs ───────────────────────────────────────────────

    @property
    def rect(self) -> tuple[int, int, int, int] | None:
        """(x, y, w, h) actuel, ou None si Wakfu introuvable."""
        if self._hwnd is None:
            return None
        return self._get_rect(self._hwnd)

    @property
    def is_active(self) -> bool:
        return self._hwnd is not None

    @property
    def is_focused(self) -> bool:
        return self._was_focused
