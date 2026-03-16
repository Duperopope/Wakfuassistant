# ui/onboarding.py — Dialog d'onboarding au premier lancement

from __future__ import annotations

from PyQt5.QtWidgets import (
    QDialog, QVBoxLayout, QHBoxLayout, QLabel, QLineEdit,
    QPushButton, QFrame
)
from PyQt5.QtCore import Qt
from PyQt5.QtGui import QIntValidator

from ui.theme import BG, BG_PANEL, TEAL, TEAL_BRIGHT, TEXT, TEXT_DIM, BORDER


class KamasOnboardingDialog(QDialog):
    """
    Demande le montant de kamas actuel au premier lancement.
    Retourne la valeur via self.kamas_value (int) après accept().
    """

    def __init__(self, parent=None):
        super().__init__(parent, Qt.Dialog | Qt.FramelessWindowHint)
        self.kamas_value: int = 0
        self._build_ui()
        self.setStyleSheet(f"""
            QDialog {{
                background: {BG};
                border: 1px solid {TEAL};
                border-radius: 10px;
            }}
            QLabel#title {{
                color: {TEAL_BRIGHT};
                font-size: 14px;
                font-weight: 700;
                letter-spacing: 0.5px;
            }}
            QLabel#subtitle {{
                color: {TEXT_DIM};
                font-size: 11px;
            }}
            QLineEdit {{
                background: {BG_PANEL};
                color: {TEXT};
                border: 1px solid {BORDER};
                border-radius: 6px;
                padding: 6px 10px;
                font-size: 15px;
                font-weight: 600;
            }}
            QLineEdit:focus {{
                border: 1px solid {TEAL};
            }}
            QPushButton#confirm {{
                background: {TEAL};
                color: #0a1a1f;
                border: none;
                border-radius: 6px;
                padding: 7px 24px;
                font-size: 12px;
                font-weight: 700;
            }}
            QPushButton#confirm:hover {{
                background: {TEAL_BRIGHT};
            }}
            QPushButton#skip {{
                background: transparent;
                color: {TEXT_DIM};
                border: 1px solid {BORDER};
                border-radius: 6px;
                padding: 7px 16px;
                font-size: 11px;
            }}
            QPushButton#skip:hover {{
                color: {TEXT};
                border-color: {TEXT_DIM};
            }}
        """)

    def _build_ui(self):
        self.setFixedWidth(340)
        layout = QVBoxLayout(self)
        layout.setContentsMargins(24, 20, 24, 20)
        layout.setSpacing(12)

        title = QLabel("Premier lancement", self)
        title.setObjectName("title")
        layout.addWidget(title)

        subtitle = QLabel(
            "Combien de kamas as-tu en ce moment ?\n"
            "L'overlay utilisera cette base et suivra\n"
            "tes gains/pertes automatiquement.",
            self,
        )
        subtitle.setObjectName("subtitle")
        subtitle.setWordWrap(True)
        layout.addWidget(subtitle)

        sep = QFrame(self)
        sep.setFrameShape(QFrame.HLine)
        sep.setStyleSheet(f"color: {BORDER};")
        layout.addWidget(sep)

        self._input = QLineEdit(self)
        self._input.setPlaceholderText("ex: 576869")
        self._input.setValidator(QIntValidator(0, 999_999_999, self))
        self._input.returnPressed.connect(self._confirm)
        layout.addWidget(self._input)

        btn_row = QHBoxLayout()
        btn_row.setSpacing(8)

        skip_btn = QPushButton("Passer", self)
        skip_btn.setObjectName("skip")
        skip_btn.clicked.connect(self.reject)
        btn_row.addWidget(skip_btn)

        btn_row.addStretch()

        confirm_btn = QPushButton("Confirmer", self)
        confirm_btn.setObjectName("confirm")
        confirm_btn.clicked.connect(self._confirm)
        btn_row.addWidget(confirm_btn)

        layout.addLayout(btn_row)

        self._input.setFocus()

    def _confirm(self):
        text = self._input.text().strip()
        if text:
            try:
                self.kamas_value = int(text)
            except ValueError:
                return
        self.accept()
