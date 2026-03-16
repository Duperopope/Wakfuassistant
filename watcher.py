"""
watcher.py — Surveille le lancement de Wakfu et démarre l'overlay automatiquement.

Tournant en arrière-plan (pythonw, pas de console), ce script :
  - Poll toutes les POLL_SEC secondes si une fenêtre Wakfu est visible
  - Lance l'overlay dès que Wakfu apparaît et que l'overlay n'est pas déjà actif
  - Relance l'overlay si Wakfu redémarre après une fermeture
"""

import time
import subprocess
from pathlib import Path

import win32gui
import win32process
import win32api

_ROOT = Path(__file__).resolve().parent
_PYTHONW = _ROOT / ".venv" / "Scripts" / "pythonw.exe"
_MAIN = _ROOT / "main.py"
_POLL_SEC = 3


def _wakfu_visible() -> bool:
    found: list[int] = []

    def _cb(hwnd, _):
        if not win32gui.IsWindowVisible(hwnd):
            return
        title = win32gui.GetWindowText(hwnd).upper()
        if "WAKFU" not in title or "ASSISTANT" in title:
            return
        try:
            _, pid = win32process.GetWindowThreadProcessId(hwnd)
            h = win32api.OpenProcess(0x0410, False, pid)
            exe = win32process.GetModuleFileNameEx(h, 0)
            win32api.CloseHandle(h)
            if exe.lower().endswith("java.exe"):
                found.append(hwnd)
        except Exception:
            pass

    win32gui.EnumWindows(_cb, None)
    return bool(found)


def main() -> None:
    overlay: subprocess.Popen | None = None

    while True:
        time.sleep(_POLL_SEC)

        wakfu_up = _wakfu_visible()
        overlay_alive = overlay is not None and overlay.poll() is None

        if wakfu_up and not overlay_alive:
            try:
                overlay = subprocess.Popen(
                    [str(_PYTHONW), str(_MAIN)],
                    cwd=str(_ROOT),
                )
            except OSError:
                pass


if __name__ == "__main__":
    main()
