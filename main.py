#!/usr/bin/env python3
"""
Wakfu Assistant — Entry point
Lance l'overlay PyQt5 sans terminal.
"""

import sys
from PyQt5.QtWidgets import QApplication
from PyQt5.QtGui     import QIcon
from ui.theme  import QSS
from ui.window import OverlayWindow


def main():
    app = QApplication(sys.argv)
    app.setApplicationName("Wakfu Assistant")
    app.setStyleSheet(QSS)

    win = OverlayWindow()
    win.show()

    sys.exit(app.exec_())


if __name__ == "__main__":
    main()
