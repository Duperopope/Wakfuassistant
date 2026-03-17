# core/wakfu_tracker.py
# Surveille la fenêtre Wakfu : position, taille, état (minimisé/restauré).

import os
import re as _re
import win32gui
import win32con
import win32process
import win32api
from enum import Enum
from PyQt5.QtCore import QObject, QTimer, pyqtSignal


class GameState(Enum):
    OFFLINE   = "offline"
    SELECTING = "selecting"
    IN_GAME   = "in_game"

# "L'immortel - Wakfu"  →  group(1) = "L'immortel"
# "Wakfu"               →  pas de match → aucun personnage connecté
_RE_TITLE = _re.compile(r'^(.+?)\s*-\s*[Ww]akfu\s*$')


class WakfuTracker(QObject):
    """
    Signaux émis :
        found(hwnd)               — fenêtre Wakfu détectée
        lost()                    — fenêtre Wakfu fermée / introuvable
        geometry_changed(x,y,w,h) — fenêtre déplacée ou redimensionnée
        minimized()               — Wakfu réduit
        restored()                — Wakfu restauré
        focus_changed(bool)       — True si Wakfu est au premier plan
        character_changed(str)    — nom du personnage actif ("" = aucun)
    """

    found             = pyqtSignal(int)
    lost              = pyqtSignal()
    geometry_changed  = pyqtSignal(int, int, int, int)   # x y w h
    minimized         = pyqtSignal()
    restored          = pyqtSignal()
    focus_changed     = pyqtSignal(bool)                  # True si Wakfu est au premier plan
    character_changed = pyqtSignal(str)                   # "" = déconnecté / écran de sélection

    _POLL_MS = 3

    def __init__(self, parent=None):
        super().__init__(parent)
        self._pid = os.getpid()
        self._hwnd:          int | None             = None
        self._was_minimized: bool                   = False
        self._was_focused:   bool                   = False
        self._last_rect:     tuple[int,int,int,int] = (0, 0, 0, 0)
        self._last_character: str                   = ""   # dernier nom émis

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
                # Wakfu est une app Java — ignorer les autres processus (navigateurs, etc.)
                h = win32api.OpenProcess(0x0410, False, pid)
                exe = win32process.GetModuleFileNameEx(h, 0)
                win32api.CloseHandle(h)
                if not exe.lower().endswith("java.exe"):
                    return
            except Exception:
                return

            score = 10
            # "Wakfu" seul (écran de sélection) ET "Perso - Wakfu" (connecté) : même valeur
            if "WAKFU" in title_up:
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

    @staticmethod
    def _hwnd_still_valid(hwnd: int) -> bool:
        """Vérifie que le hwnd est encore valide. Appel kernel pur, aucune comm cross-process."""
        try:
            return bool(win32gui.IsWindow(hwnd))
        except Exception:
            return False

    def _poll(self):
        # Chemin rapide : le hwnd est déjà connu, on évite EnumWindows.
        if self._hwnd is not None:
            if not self._hwnd_still_valid(self._hwnd):
                self._hwnd = None
                if self._was_focused:
                    self._was_focused = False
                    self.focus_changed.emit(False)
                if self._last_character:
                    self._last_character = ""
                    self.character_changed.emit("")
                self.lost.emit()
                return
            hwnd = self._hwnd
        else:
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

        # Personnage actif — détecté depuis le titre de la fenêtre
        try:
            title = win32gui.GetWindowText(hwnd)
            m = _RE_TITLE.match(title)
            char_name = m.group(1).strip() if m else ""
        except Exception:
            char_name = ""
        if char_name != self._last_character:
            self._last_character = char_name
            self.character_changed.emit(char_name)

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
    def hwnd(self) -> int | None:
        """HWND de la fenêtre Wakfu, ou None."""
        return self._hwnd

    @property
    def is_active(self) -> bool:
        return self._hwnd is not None

    @property
    def is_focused(self) -> bool:
        return self._was_focused

    @property
    def game_state(self) -> GameState:
        if self._hwnd is None:
            return GameState.OFFLINE
        if self._last_character:
            return GameState.IN_GAME
        return GameState.SELECTING
