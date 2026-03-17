# ui/tabs/personnage.py — Onglet Personnage : classe, nom, statut session

from __future__ import annotations

from PyQt5.QtWidgets import (
    QWidget, QVBoxLayout, QHBoxLayout, QLabel, QFrame, QSizePolicy,
)
from PyQt5.QtCore import Qt
from PyQt5.QtGui import QPixmap

from ui.tabs.base import BaseTab
from ui.theme import TEAL, TEXT, TEXT_DIM, BORDER, GREEN, RED
from core.wakfu_tracker import GameState
from ui.titlebar import (
    _normalize_class_key,
    _CLASS_TO_ID,
    _CLASS_ICON_CACHE_DIR,
    _ZAAP_WAKFU_ICON,
    _extract_icon_from_wakfu_install,
    _extract_icon_from_wakfu_install_by_breed_id,
)


def _sep() -> QFrame:
    f = QFrame()
    f.setFrameShape(QFrame.HLine)
    f.setStyleSheet(f"color: {BORDER}; background: {BORDER}; max-height: 1px; margin: 4px 0;")
    return f


class PersonnageTab(BaseTab):
    """Onglet affichant l'identité du personnage : icône de classe, nom, niveau, statut."""

    def __init__(self, parent: QWidget | None = None):
        super().__init__(parent)

        root = QVBoxLayout(self)
        root.setContentsMargins(16, 16, 16, 16)
        root.setSpacing(12)

        title = QLabel("Personnage")
        title.setStyleSheet(f"color: {TEXT}; font-size: 14px; font-weight: 700;")
        root.addWidget(title)

        # ── Identité ──────────────────────────────────────────────────────
        identity_row = QHBoxLayout()
        identity_row.setSpacing(16)
        identity_row.setContentsMargins(0, 0, 0, 0)

        # Icône de classe
        self._class_icon = QLabel()
        self._class_icon.setFixedSize(72, 72)
        self._class_icon.setAlignment(Qt.AlignCenter)
        self._class_icon.setStyleSheet(
            f"background: rgba(255,255,255,0.04);"
            f" border: 1px solid {BORDER};"
            f" border-radius: 10px;"
        )
        identity_row.addWidget(self._class_icon)

        # Infos texte
        info_col = QVBoxLayout()
        info_col.setSpacing(4)
        info_col.setContentsMargins(0, 0, 0, 0)

        self._name_lbl = QLabel("—")
        self._name_lbl.setStyleSheet(
            f"color: {TEXT}; font-size: 17px; font-weight: 800;"
        )

        self._class_lbl = QLabel("—")
        self._class_lbl.setStyleSheet(
            f"color: {TEAL}; font-size: 12px; font-weight: 600;"
        )

        self._level_lbl = QLabel("")
        self._level_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 11px;")

        self._status_lbl = QLabel("connexion ?")
        self._status_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 10px;")

        info_col.addWidget(self._name_lbl)
        info_col.addWidget(self._class_lbl)
        info_col.addWidget(self._level_lbl)
        info_col.addWidget(self._status_lbl)
        info_col.addStretch()

        identity_row.addLayout(info_col, 1)
        root.addLayout(identity_row)

        root.addWidget(_sep())
        root.addStretch(1)

    # ── API publique ───────────────────────────────────────────────

    def set_character_name(self, name: str | None):
        self._name_lbl.setText(name or "—")

    def set_class_name(self, class_key: str | None):
        if class_key:
            self._class_lbl.setText(class_key.capitalize())
        else:
            self._class_lbl.setText("—")

    def set_level(self, level: int | None):
        self._level_lbl.setText(f"Niveau {level}" if level is not None else "")

    def set_connection_status(self, connected: bool | None):
        if connected is True:
            self._status_lbl.setText("● connecté")
            self._status_lbl.setStyleSheet(f"color: {GREEN}; font-size: 10px;")
        elif connected is False:
            self._status_lbl.setText("● déconnecté")
            self._status_lbl.setStyleSheet(f"color: {RED}; font-size: 10px;")
        else:
            self._status_lbl.setText("◌ écran de sélection")
            self._status_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 10px;")

    def set_game_state(self, state: "GameState"):
        if state == GameState.OFFLINE:
            self._status_lbl.setText("● Wakfu non détecté")
            self._status_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 10px;")
            self._name_lbl.setText("—")
            self._class_lbl.setText("—")
            self._level_lbl.setText("")
        elif state == GameState.SELECTING:
            self._status_lbl.setText("◌ Écran de sélection")
            self._status_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 10px;")
            self._name_lbl.setText("—")
            self._class_lbl.setText("—")
            self._level_lbl.setText("")
        # IN_GAME: no-op, data is set by individual setters

    def set_class_icon(self, class_key: str):
        key = _normalize_class_key(class_key)
        class_id = _CLASS_TO_ID.get(key, 4)
        cache_file = _CLASS_ICON_CACHE_DIR / f"class_{class_id}_{key}.tga"
        if not cache_file.exists():
            _extract_icon_from_wakfu_install(key, cache_file)
        self._load_icon(cache_file, tooltip=f"Classe : {key}")

    def set_class_icon_by_breed_id(self, breed_id: int):
        try:
            bid = int(breed_id)
        except (TypeError, ValueError):
            return
        cache_file = _CLASS_ICON_CACHE_DIR / f"breed_{bid}.tga"
        if not cache_file.exists():
            _extract_icon_from_wakfu_install_by_breed_id(bid, cache_file)
        self._load_icon(cache_file, tooltip=f"Breed : {bid}")

    def clear_class_icon(self):
        """Efface l'icône de classe (changement de personnage)."""
        self._class_icon.clear()
        self._class_icon.setToolTip("")

    # ── Privé ──────────────────────────────────────────────────────

    def _load_icon(self, source, tooltip: str = ""):
        if source is None or not source.exists():
            fallback = _ZAAP_WAKFU_ICON if _ZAAP_WAKFU_ICON.exists() else None
            if fallback is None:
                self._class_icon.clear()
                return
            source = fallback

        pix = QPixmap(str(source))
        if pix.isNull():
            self._class_icon.clear()
            return

        self._class_icon.setPixmap(
            pix.scaled(64, 64, Qt.KeepAspectRatio, Qt.SmoothTransformation)
        )
        self._class_icon.setToolTip(tooltip)
