# ui/onboarding.py — Page d'onboarding intégrée à la fenêtre principale

from __future__ import annotations

from PyQt5.QtWidgets import (
    QWidget, QVBoxLayout, QHBoxLayout, QLabel, QLineEdit, QPushButton, QFrame
)
from PyQt5.QtCore import Qt, pyqtSignal
from PyQt5.QtGui import QIntValidator

from ui.theme import BG_PANEL, TEAL, TEAL_BRIGHT, TEXT, TEXT_DIM, BORDER


class OnboardingPage(QWidget):
    """
    Page d'onboarding affichée directement dans l'overlay (pas de popup).
    Émet confirmed(kamas_value: int) quand l'utilisateur valide.
    """

    confirmed = pyqtSignal(int)

    def __init__(self, parent: QWidget | None = None):
        super().__init__(parent)
        self._build_ui()

    # ── Construction ─────────────────────────────────────────────────────

    def _build_ui(self):
        root = QVBoxLayout(self)
        root.setContentsMargins(28, 24, 28, 20)
        root.setSpacing(0)

        # ── Badge ────────────────────────────────────────────────────────
        badge = QLabel("◈", self)
        badge.setAlignment(Qt.AlignCenter)
        badge.setStyleSheet(f"color: {TEAL}; font-size: 32px; padding-bottom: 2px;")
        root.addWidget(badge)

        # ── Titre ────────────────────────────────────────────────────────
        title = QLabel("Wakfu Assistant", self)
        title.setAlignment(Qt.AlignCenter)
        title.setStyleSheet(
            f"color: {TEAL_BRIGHT}; font-size: 15px; font-weight: 700;"
            f" letter-spacing: 0.8px; padding-bottom: 4px;"
        )
        root.addWidget(title)

        subtitle = QLabel(
            "Pour commencer, indique combien de kamas\n"
            "tu possèdes actuellement en jeu.",
            self,
        )
        subtitle.setAlignment(Qt.AlignCenter)
        subtitle.setWordWrap(True)
        subtitle.setStyleSheet(
            f"color: {TEXT_DIM}; font-size: 11px; line-height: 160%; padding-bottom: 20px;"
        )
        root.addWidget(subtitle)

        # ── Champ kamas ──────────────────────────────────────────────────
        field_label = QLabel("Kamas actuels", self)
        field_label.setStyleSheet(
            f"color: {TEAL}; font-size: 10px; font-weight: 700;"
            f" letter-spacing: 1px; text-transform: uppercase; padding-bottom: 4px;"
        )
        root.addWidget(field_label)

        self._input = QLineEdit(self)
        self._input.setPlaceholderText("ex : 576 869")
        self._input.setValidator(QIntValidator(0, 999_999_999, self))
        self._input.setAlignment(Qt.AlignCenter)
        self._input.setStyleSheet(f"""
            QLineEdit {{
                background: {BG_PANEL};
                color: {TEXT};
                border: 1px solid {BORDER};
                border-radius: 8px;
                padding: 10px 14px;
                font-size: 18px;
                font-weight: 700;
            }}
            QLineEdit:focus {{
                border-color: {TEAL};
            }}
        """)
        self._input.returnPressed.connect(self._confirm)
        root.addWidget(self._input)

        hint = QLabel(
            "L'overlay suivra tes gains et pertes depuis ce point.\n"
            "Tu pourras corriger cette valeur à tout moment dans Options > Données.",
            self,
        )
        hint.setAlignment(Qt.AlignCenter)
        hint.setWordWrap(True)
        hint.setStyleSheet(
            f"color: {TEXT_DIM}; font-size: 10px; padding-top: 6px; padding-bottom: 16px;"
        )
        root.addWidget(hint)

        # ── Séparateur ───────────────────────────────────────────────────
        sep = QFrame(self)
        sep.setFrameShape(QFrame.HLine)
        sep.setStyleSheet(f"color: {BORDER}; background: {BORDER}; max-height: 1px; margin-bottom: 14px;")
        root.addWidget(sep)

        root.addStretch(1)

        # ── Bouton principal ─────────────────────────────────────────────
        confirm_btn = QPushButton("Commencer le suivi  →", self)
        confirm_btn.setCursor(Qt.PointingHandCursor)
        confirm_btn.setStyleSheet(f"""
            QPushButton {{
                background: {TEAL};
                color: #0a1a1f;
                border: none;
                border-radius: 8px;
                padding: 11px 0;
                font-size: 12px;
                font-weight: 700;
                letter-spacing: 0.3px;
            }}
            QPushButton:hover {{
                background: {TEAL_BRIGHT};
            }}
        """)
        confirm_btn.clicked.connect(self._confirm)
        root.addWidget(confirm_btn)

        root.addSpacing(6)

        # ── Bouton passer ────────────────────────────────────────────────
        skip_btn = QPushButton("Passer — démarrer à 0 kamas", self)
        skip_btn.setCursor(Qt.PointingHandCursor)
        skip_btn.setStyleSheet(f"""
            QPushButton {{
                background: transparent;
                color: {TEXT_DIM};
                border: none;
                padding: 5px 0;
                font-size: 10px;
            }}
            QPushButton:hover {{
                color: {TEXT};
            }}
        """)
        skip_btn.clicked.connect(self._skip)
        root.addWidget(skip_btn)

    # ── API publique ──────────────────────────────────────────────────────

    def reset_input(self):
        """Vide le champ et replace le focus pour une nouvelle saisie."""
        self._input.clear()
        self._input.setFocus()

    # ── Slots privés ──────────────────────────────────────────────────────

    def _confirm(self):
        text = self._input.text().strip()
        value = 0
        if text:
            try:
                value = int(text)
            except ValueError:
                return
        self.confirmed.emit(value)

    def _skip(self):
        self.confirmed.emit(0)
