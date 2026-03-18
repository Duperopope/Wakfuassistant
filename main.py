#!/usr/bin/env python3
"""
Wakfu Assistant — Entry point
Lance l'overlay PyQt5 sans terminal.
"""

import sys
import os
import tempfile
from pathlib import Path
from PyQt5.QtWidgets import QApplication
from PyQt5.QtCore import QObject, QTimer, QProcess, QLockFile
from ui.theme  import QSS, load_app_fonts
from ui.window import OverlayWindow


class LiveUiReloader(QObject):
    """Redemarre automatiquement l'app quand les sources UI/core changent."""

    _POLL_MS = 800

    def __init__(self, app: QApplication, project_root: Path):
        super().__init__()
        self._app = app
        self._project_root = project_root
        self._restarting = False
        self._files = self._collect_files()
        self._mtimes = self._snapshot(self._files)

        self._timer = QTimer(self)
        self._timer.timeout.connect(self._poll)
        self._timer.start(self._POLL_MS)

    def _collect_files(self) -> list[Path]:
        roots = [
            self._project_root / "main.py",
            self._project_root / "ui",
            self._project_root / "core",
        ]

        out: list[Path] = []
        for root in roots:
            if not root.exists():
                continue

            if root.is_file() and root.suffix == ".py":
                out.append(root)
                continue

            if root.is_dir():
                for p in root.rglob("*.py"):
                    if "__pycache__" in p.parts:
                        continue
                    out.append(p)

        return sorted(out)

    @staticmethod
    def _snapshot(files: list[Path]) -> dict[str, int]:
        snap: dict[str, int] = {}
        for p in files:
            try:
                snap[str(p)] = p.stat().st_mtime_ns
            except FileNotFoundError:
                continue
        return snap

    def _poll(self):
        if self._restarting:
            return

        files_now = self._collect_files()
        mtime_now = self._snapshot(files_now)

        if set(mtime_now.keys()) != set(self._mtimes.keys()):
            self._restart()
            return

        for path, ts in mtime_now.items():
            if self._mtimes.get(path) != ts:
                self._restart()
                return

    def _restart(self):
        self._restarting = True

        args = list(sys.argv)
        if not args or not args[0].lower().endswith(".py"):
            args = [str(self._project_root / "main.py")]

        if os.name == "nt":
            quoted = " ".join(f'"{part}"' for part in [sys.executable, *args])
            delayed = f'ping 127.0.0.1 -n 2 >nul && {quoted}'
            QProcess.startDetached("cmd.exe", ["/c", delayed], str(self._project_root))
        else:
            QProcess.startDetached(sys.executable, args, str(self._project_root))
        self._app.quit()


def _acquire_single_instance_lock() -> QLockFile | None:
    lock_path = Path(tempfile.gettempdir()) / "wakfuassistant-overlay.lock"
    lock = QLockFile(str(lock_path))
    lock.setStaleLockTime(3000)
    if not lock.tryLock(0):
        return None
    return lock


def main():
    app = QApplication(sys.argv)
    app.setApplicationName("Wakfu Assistant")
    load_app_fonts()
    app.setStyleSheet(QSS)

    app._instance_lock = _acquire_single_instance_lock()
    if app._instance_lock is None:
        return 0

    # WYSIWYG dev: recharge l'UI automatiquement apres modification de code.
    if os.environ.get("WAKFU_LIVE_UI", "1") == "1":
        app._live_reloader = LiveUiReloader(app, Path(__file__).resolve().parent)

    win = OverlayWindow()
    win.show()

    return app.exec_()


if __name__ == "__main__":
    sys.exit(main())
