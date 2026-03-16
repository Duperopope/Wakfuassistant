from PyQt5.QtWidgets import (
    QWidget,
    QVBoxLayout,
    QHBoxLayout,
    QLabel,
    QSlider,
    QFrame,
    QComboBox,
)
from PyQt5.QtCore import Qt, pyqtSignal

from ui.tabs.base import BaseTab
from ui.theme import BG_PANEL, BORDER, TEXT, TEXT_DIM, TEAL


class OptionsTab(BaseTab):
    """Options UI/overlay avec layout propre et controls clairs."""

    opacity_changed = pyqtSignal(float)
    font_changed = pyqtSignal(str)
    palette_changed = pyqtSignal(str)
    shape_changed = pyqtSignal(int)

    FONT_CHOICES = [
        "Segoe UI Variable",
        "Inter",
        "IBM Plex Sans",
        "Trebuchet MS",
        "Verdana",
        "Noto Sans",
    ]

    PALETTE_CHOICES = [
        ("wakfu", "Wakfu Teal"),
        ("astrub", "Astrub Horizon"),
        ("bonta", "Bonta Crystal"),
        ("brakmar", "Brakmar Ember"),
        ("sufokia", "Sufokia Tide"),
        ("amakna", "Amakna Harvest"),
        ("xelorium", "Xelorium Flux"),
        ("ember", "Ember Gold"),
        ("ocean", "Ocean Blue"),
        ("forest", "Forest Green"),
    ]

    SHAPE_CHOICES = [
        (8, "Compacte"),
        (13, "Arrondie"),
        (18, "Douce"),
        (24, "Organique"),
    ]

    def __init__(
        self,
        initial_opacity: float = 0.96,
        initial_font: str = "Noto Sans",
        initial_palette: str = "wakfu",
        initial_corner_radius: int = 24,
        parent: QWidget | None = None,
    ):
        super().__init__(parent)
        self._building = True

        root = QVBoxLayout(self)
        root.setContentsMargins(10, 10, 10, 10)
        root.setSpacing(10)

        title = QLabel("Options")
        title.setStyleSheet(f"color: {TEXT}; font-size: 14px; font-weight: 700;")
        root.addWidget(title)

        subtitle = QLabel("Reglages de l'overlay")
        subtitle.setStyleSheet(f"color: {TEXT_DIM}; font-size: 11px;")
        root.addWidget(subtitle)

        root.addWidget(
            self._build_display_card(
                initial_opacity,
                initial_font,
                initial_palette,
                initial_corner_radius,
            )
        )
        root.addWidget(self._build_placeholder_card())
        root.addStretch(1)

        self._building = False

    def _build_display_card(
        self,
        initial_opacity: float,
        initial_font: str,
        initial_palette: str,
        initial_corner_radius: int,
    ) -> QFrame:
        card = QFrame(self)
        card.setStyleSheet(
            f"""
            QFrame {{
                background: {BG_PANEL};
                border: 1px solid {BORDER};
                border-radius: 4px;
            }}
            """
        )

        lay = QVBoxLayout(card)
        lay.setContentsMargins(10, 10, 10, 10)
        lay.setSpacing(8)

        head = QLabel("Affichage")
        head.setStyleSheet(f"color: {TEXT}; font-size: 12px; font-weight: 700;")
        lay.addWidget(head)

        row = QHBoxLayout()
        row.setSpacing(8)

        name = QLabel("Opacite")
        name.setMinimumWidth(70)
        name.setStyleSheet(f"color: {TEXT_DIM}; font-size: 11px;")

        self._opacity_slider = QSlider(Qt.Horizontal, card)
        self._opacity_slider.setRange(35, 100)
        self._opacity_slider.setSingleStep(1)
        self._opacity_slider.setPageStep(5)
        self._opacity_slider.setValue(int(max(35, min(100, round(initial_opacity * 100)))))

        self._opacity_slider.setStyleSheet(
            f"""
            QSlider::groove:horizontal {{
                border: 1px solid {BORDER};
                height: 8px;
                background: #0f1116;
                border-radius: 4px;
            }}
            QSlider::sub-page:horizontal {{
                background: {TEAL};
                border-radius: 4px;
            }}
            QSlider::add-page:horizontal {{
                background: #0f1116;
                border-radius: 4px;
            }}
            QSlider::handle:horizontal {{
                background: {TEXT};
                border: 1px solid {BORDER};
                width: 14px;
                margin: -4px 0;
                border-radius: 7px;
            }}
            """
        )

        self._opacity_value = QLabel("")
        self._opacity_value.setMinimumWidth(48)
        self._opacity_value.setAlignment(Qt.AlignRight | Qt.AlignVCenter)
        self._opacity_value.setStyleSheet(f"color: {TEXT}; font-size: 11px; font-weight: 600;")

        row.addWidget(name)
        row.addWidget(self._opacity_slider, 1)
        row.addWidget(self._opacity_value)
        lay.addLayout(row)

        hint = QLabel("Ajuste la transparence de la fenetre overlay.")
        hint.setStyleSheet(f"color: {TEXT_DIM}; font-size: 10px;")
        lay.addWidget(hint)

        font_row = QHBoxLayout()
        font_row.setSpacing(8)

        font_name = QLabel("Police")
        font_name.setMinimumWidth(70)
        font_name.setStyleSheet(f"color: {TEXT_DIM}; font-size: 11px;")

        self._font_combo = QComboBox(card)
        self._font_combo.addItems(self.FONT_CHOICES)
        if initial_font in self.FONT_CHOICES:
            self._font_combo.setCurrentText(initial_font)
        self._font_combo.setStyleSheet(
            f"""
            QComboBox {{
                background: #0f1116;
                border: 1px solid {BORDER};
                border-radius: 8px;
                padding: 5px 10px;
                color: {TEXT};
                min-height: 22px;
            }}
            QComboBox:hover {{ border-color: {TEAL}; }}
            QComboBox::drop-down {{ border: none; width: 20px; }}
            QComboBox QAbstractItemView {{
                background: {BG_PANEL};
                border: 1px solid {BORDER};
                color: {TEXT};
                selection-background-color: rgba(30,180,176,0.18);
            }}
            """
        )

        font_row.addWidget(font_name)
        font_row.addWidget(self._font_combo, 1)
        lay.addLayout(font_row)

        font_hint = QLabel("Choisis la police principale de l'interface.")
        font_hint.setStyleSheet(f"color: {TEXT_DIM}; font-size: 10px;")
        lay.addWidget(font_hint)

        palette_row = QHBoxLayout()
        palette_row.setSpacing(8)

        palette_name = QLabel("Palette")
        palette_name.setMinimumWidth(70)
        palette_name.setStyleSheet(f"color: {TEXT_DIM}; font-size: 11px;")

        self._palette_combo = QComboBox(card)
        for key, label in self.PALETTE_CHOICES:
            self._palette_combo.addItem(label, key)
        for i in range(self._palette_combo.count()):
            if self._palette_combo.itemData(i) == initial_palette:
                self._palette_combo.setCurrentIndex(i)
                break
        self._palette_combo.setStyleSheet(self._font_combo.styleSheet())

        palette_row.addWidget(palette_name)
        palette_row.addWidget(self._palette_combo, 1)
        lay.addLayout(palette_row)

        shape_row = QHBoxLayout()
        shape_row.setSpacing(8)

        shape_name = QLabel("Forme")
        shape_name.setMinimumWidth(70)
        shape_name.setStyleSheet(f"color: {TEXT_DIM}; font-size: 11px;")

        self._shape_combo = QComboBox(card)
        for radius, label in self.SHAPE_CHOICES:
            self._shape_combo.addItem(label, radius)
        for i in range(self._shape_combo.count()):
            if int(self._shape_combo.itemData(i)) == int(initial_corner_radius):
                self._shape_combo.setCurrentIndex(i)
                break
        self._shape_combo.setStyleSheet(self._font_combo.styleSheet())

        shape_row.addWidget(shape_name)
        shape_row.addWidget(self._shape_combo, 1)
        lay.addLayout(shape_row)

        shape_hint = QLabel("Modifie l'arrondi global de la fenetre overlay.")
        shape_hint.setStyleSheet(f"color: {TEXT_DIM}; font-size: 10px;")
        lay.addWidget(shape_hint)

        self._opacity_slider.valueChanged.connect(self._on_slider_change)
        self._font_combo.currentTextChanged.connect(self._on_font_change)
        self._palette_combo.currentIndexChanged.connect(self._on_palette_change)
        self._shape_combo.currentIndexChanged.connect(self._on_shape_change)
        self._on_slider_change(self._opacity_slider.value())

        return card

    def _build_placeholder_card(self) -> QFrame:
        card = QFrame(self)
        card.setStyleSheet(
            f"""
            QFrame {{
                background: {BG_PANEL};
                border: 1px solid {BORDER};
                border-radius: 4px;
            }}
            """
        )

        lay = QVBoxLayout(card)
        lay.setContentsMargins(10, 10, 10, 10)
        lay.setSpacing(6)

        head = QLabel("A venir")
        head.setStyleSheet(f"color: {TEXT}; font-size: 12px; font-weight: 700;")
        body = QLabel("Disposition reservee pour les prochains reglages (theme, raccourcis, comportement).")
        body.setWordWrap(True)
        body.setStyleSheet(f"color: {TEXT_DIM}; font-size: 10px;")

        lay.addWidget(head)
        lay.addWidget(body)
        return card

    def _on_slider_change(self, value: int):
        self._opacity_value.setText(f"{value}%")
        if self._building:
            return
        self.opacity_changed.emit(value / 100.0)

    def _on_font_change(self, family: str):
        if self._building:
            return
        self.font_changed.emit(family)

    def _on_palette_change(self, index: int):
        if self._building:
            return
        key = self._palette_combo.itemData(index)
        if key:
            self.palette_changed.emit(str(key))

    def _on_shape_change(self, index: int):
        if self._building:
            return
        radius = int(self._shape_combo.itemData(index))
        self.shape_changed.emit(radius)
