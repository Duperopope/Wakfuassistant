from __future__ import annotations

from datetime import datetime

from PyQt5.QtWidgets import (
    QWidget,
    QVBoxLayout,
    QHBoxLayout,
    QLabel,
    QSlider,
    QFrame,
    QComboBox,
    QPushButton,
    QSizePolicy,
    QLineEdit,
)
from PyQt5.QtCore import Qt, pyqtSignal
from PyQt5.QtGui import QIntValidator

from ui.tabs.base import BaseTab
from ui.theme import BG_PANEL, BORDER, TEXT, TEXT_DIM, TEAL


# ---------------------------------------------------------------------------
# Widget générique : carte repliable
# ---------------------------------------------------------------------------

class CollapsibleCard(QFrame):
    """
    Carte avec header cliquable (▶/▼ + titre) et body masqué par défaut.
    Émet expanded() quand elle s'ouvre (pour logique accordéon).
    """

    expanded = pyqtSignal()

    def __init__(self, title: str, collapsed: bool = True, parent: QWidget | None = None):
        super().__init__(parent)
        self._collapsed = collapsed

        self.setStyleSheet(f"""
            CollapsibleCard {{
                background: {BG_PANEL};
                border: 1px solid {BORDER};
                border-radius: 4px;
            }}
        """)

        outer = QVBoxLayout(self)
        outer.setContentsMargins(0, 0, 0, 0)
        outer.setSpacing(0)

        # ── Header ──────────────────────────────────────────────────────────
        self._header = QPushButton()
        self._header.setCheckable(False)
        self._header.setCursor(Qt.PointingHandCursor)
        self._header.setSizePolicy(QSizePolicy.Expanding, QSizePolicy.Fixed)
        self._header.setStyleSheet(f"""
            QPushButton {{
                background: transparent;
                border: none;
                text-align: left;
                padding: 8px 10px;
                color: {TEXT};
                font-size: 12px;
                font-weight: 700;
            }}
            QPushButton:hover {{
                background: rgba(255,255,255,0.04);
                border-radius: 4px;
            }}
        """)
        self._title = title
        self._update_header()
        self._header.clicked.connect(self.toggle)
        outer.addWidget(self._header)

        # ── Séparateur visible seulement quand déplié ────────────────────
        self._sep = QFrame()
        self._sep.setFrameShape(QFrame.HLine)
        self._sep.setStyleSheet(f"color: {BORDER}; background: {BORDER}; max-height: 1px;")
        outer.addWidget(self._sep)

        # ── Body (container) ─────────────────────────────────────────────
        self._body = QWidget()
        self._body.setSizePolicy(QSizePolicy.Expanding, QSizePolicy.Preferred)
        outer.addWidget(self._body)

        self._body_layout = QVBoxLayout(self._body)
        self._body_layout.setContentsMargins(10, 8, 10, 10)
        self._body_layout.setSpacing(8)

        self._apply_state(animate=False)

    # ── API publique ──────────────────────────────────────────────────────

    def body_layout(self) -> QVBoxLayout:
        return self._body_layout

    def collapse(self):
        if not self._collapsed:
            self._collapsed = True
            self._apply_state()

    def toggle(self):
        self._collapsed = not self._collapsed
        self._apply_state()
        if not self._collapsed:
            self.expanded.emit()

    # ── Privé ─────────────────────────────────────────────────────────────

    def _update_header(self):
        arrow = "▶" if self._collapsed else "▼"
        self._header.setText(f"  {arrow}  {self._title}")

    def _apply_state(self, animate: bool = True):
        self._update_header()
        visible = not self._collapsed
        self._body.setVisible(visible)
        self._sep.setVisible(visible)


# ---------------------------------------------------------------------------
# Helpers internes
# ---------------------------------------------------------------------------

def _section_label(text: str) -> QLabel:
    lbl = QLabel(text)
    lbl.setStyleSheet(
        f"color: {TEAL}; font-size: 9px; font-weight: 700;"
        f" letter-spacing: 1.2px; padding-top: 4px; padding-bottom: 2px;"
    )
    return lbl


def _sep_line() -> QFrame:
    sep = QFrame()
    sep.setFrameShape(QFrame.HLine)
    sep.setStyleSheet(
        f"color: {BORDER}; background: {BORDER}; max-height: 1px; margin: 2px 0 6px 0;"
    )
    return sep


def _format_ts(ts: str) -> str:
    """Convertit un timestamp ISO ms en chaîne lisible arrondie à la seconde."""
    try:
        fmt = "%Y-%m-%d %H:%M:%S.%f" if "." in ts else "%Y-%m-%d %H:%M:%S"
        dt = datetime.strptime(ts, fmt)
        return dt.strftime("%d/%m/%Y à %H:%M:%S")
    except Exception:
        return ts


# ---------------------------------------------------------------------------
# Onglet Options
# ---------------------------------------------------------------------------

class OptionsTab(BaseTab):
    """Options UI/overlay avec layout propre et controls clairs."""

    opacity_changed  = pyqtSignal(float)
    font_changed     = pyqtSignal(str)
    palette_changed  = pyqtSignal(str)
    shape_changed    = pyqtSignal(int)
    reset_requested  = pyqtSignal()
    kamas_corrected  = pyqtSignal(int)   # valeur corrigée manuellement

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
        root.setSpacing(6)

        title = QLabel("Options")
        title.setStyleSheet(f"color: {TEXT}; font-size: 14px; font-weight: 700;")
        root.addWidget(title)

        subtitle = QLabel("Réglages de l'overlay")
        subtitle.setStyleSheet(f"color: {TEXT_DIM}; font-size: 11px;")
        root.addWidget(subtitle)

        # ── Carte Affichage ──────────────────────────────────────────────
        self._display_card = CollapsibleCard("Affichage", collapsed=True, parent=self)
        self._populate_display_card(
            self._display_card.body_layout(),
            initial_opacity, initial_font, initial_palette, initial_corner_radius,
        )
        root.addWidget(self._display_card)

        # ── Carte Données ────────────────────────────────────────────────
        self._data_card = CollapsibleCard("Données", collapsed=True, parent=self)
        self._populate_data_card(self._data_card.body_layout())
        root.addWidget(self._data_card)

        # Accordéon : ouverture d'une carte replie les autres
        self._all_cards: list[CollapsibleCard] = [self._display_card, self._data_card]
        for card in self._all_cards:
            card.expanded.connect(lambda c=card: self._on_card_expanded(c))

        root.addStretch(1)
        self._building = False

    def _on_card_expanded(self, opened: CollapsibleCard):
        for card in self._all_cards:
            if card is not opened:
                card.collapse()

    # ── Contenu : carte Affichage ─────────────────────────────────────────

    def _populate_display_card(
        self,
        lay: QVBoxLayout,
        initial_opacity: float,
        initial_font: str,
        initial_palette: str,
        initial_corner_radius: int,
    ):
        _combo_qss = f"""
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

        # Opacité
        op_row = QHBoxLayout()
        op_row.setSpacing(8)
        op_lbl = QLabel("Opacité")
        op_lbl.setMinimumWidth(70)
        op_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 11px;")

        self._opacity_slider = QSlider(Qt.Horizontal)
        self._opacity_slider.setRange(35, 100)
        self._opacity_slider.setSingleStep(1)
        self._opacity_slider.setPageStep(5)
        self._opacity_slider.setValue(int(max(35, min(100, round(initial_opacity * 100)))))
        self._opacity_slider.setStyleSheet(f"""
            QSlider::groove:horizontal {{
                border: 1px solid {BORDER};
                height: 8px;
                background: #0f1116;
                border-radius: 4px;
            }}
            QSlider::sub-page:horizontal {{ background: {TEAL}; border-radius: 4px; }}
            QSlider::add-page:horizontal {{ background: #0f1116; border-radius: 4px; }}
            QSlider::handle:horizontal {{
                background: {TEXT};
                border: 1px solid {BORDER};
                width: 14px;
                margin: -4px 0;
                border-radius: 7px;
            }}
        """)

        self._opacity_value = QLabel("")
        self._opacity_value.setMinimumWidth(40)
        self._opacity_value.setAlignment(Qt.AlignRight | Qt.AlignVCenter)
        self._opacity_value.setStyleSheet(f"color: {TEXT}; font-size: 11px; font-weight: 600;")

        op_row.addWidget(op_lbl)
        op_row.addWidget(self._opacity_slider, 1)
        op_row.addWidget(self._opacity_value)
        lay.addLayout(op_row)

        # Police
        font_row = QHBoxLayout()
        font_row.setSpacing(8)
        font_lbl = QLabel("Police")
        font_lbl.setMinimumWidth(70)
        font_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 11px;")
        self._font_combo = QComboBox()
        self._font_combo.addItems(self.FONT_CHOICES)
        if initial_font in self.FONT_CHOICES:
            self._font_combo.setCurrentText(initial_font)
        self._font_combo.setStyleSheet(_combo_qss)
        font_row.addWidget(font_lbl)
        font_row.addWidget(self._font_combo, 1)
        lay.addLayout(font_row)

        # Palette
        palette_row = QHBoxLayout()
        palette_row.setSpacing(8)
        palette_lbl = QLabel("Palette")
        palette_lbl.setMinimumWidth(70)
        palette_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 11px;")
        self._palette_combo = QComboBox()
        for key, label in self.PALETTE_CHOICES:
            self._palette_combo.addItem(label, key)
        for i in range(self._palette_combo.count()):
            if self._palette_combo.itemData(i) == initial_palette:
                self._palette_combo.setCurrentIndex(i)
                break
        self._palette_combo.setStyleSheet(_combo_qss)
        palette_row.addWidget(palette_lbl)
        palette_row.addWidget(self._palette_combo, 1)
        lay.addLayout(palette_row)

        # Forme
        shape_row = QHBoxLayout()
        shape_row.setSpacing(8)
        shape_lbl = QLabel("Forme")
        shape_lbl.setMinimumWidth(70)
        shape_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 11px;")
        self._shape_combo = QComboBox()
        for radius, label in self.SHAPE_CHOICES:
            self._shape_combo.addItem(label, radius)
        for i in range(self._shape_combo.count()):
            if int(self._shape_combo.itemData(i)) == int(initial_corner_radius):
                self._shape_combo.setCurrentIndex(i)
                break
        self._shape_combo.setStyleSheet(_combo_qss)
        shape_row.addWidget(shape_lbl)
        shape_row.addWidget(self._shape_combo, 1)
        lay.addLayout(shape_row)

        # Connecter les signaux
        self._opacity_slider.valueChanged.connect(self._on_slider_change)
        self._font_combo.currentTextChanged.connect(self._on_font_change)
        self._palette_combo.currentIndexChanged.connect(self._on_palette_change)
        self._shape_combo.currentIndexChanged.connect(self._on_shape_change)
        self._on_slider_change(self._opacity_slider.value())

    # ── Contenu : carte Données ───────────────────────────────────────────

    def _populate_data_card(self, lay: QVBoxLayout):
        _input_qss = f"""
            QLineEdit {{
                background: #0f1116;
                border: 1px solid {BORDER};
                border-radius: 6px;
                padding: 4px 8px;
                color: {TEXT};
                font-size: 11px;
            }}
            QLineEdit:focus {{ border-color: {TEAL}; }}
        """
        _confirm_qss = f"""
            QPushButton {{
                background: {TEAL};
                color: #0a1a1f;
                border: none;
                border-radius: 6px;
                font-size: 13px;
                font-weight: 700;
                padding: 4px;
                min-width: 28px;
            }}
            QPushButton:hover {{ background: #1ec8c4; }}
        """

        # ── Section : PERSONNAGE ─────────────────────────────────────────
        lay.addWidget(_section_label("PERSONNAGE"))
        lay.addWidget(_sep_line())

        # ── Champ Kamas ──────────────────────────────────────────────────
        # Ligne valeur : label + valeur live (avec tooltip)
        kamas_top = QHBoxLayout()
        kamas_top.setSpacing(6)

        kamas_field_lbl = QLabel("Kamas")
        kamas_field_lbl.setStyleSheet(f"color: {TEXT}; font-size: 11px; font-weight: 600;")
        kamas_top.addWidget(kamas_field_lbl)

        kamas_top.addStretch(1)

        self._kamas_display = QLabel("—")
        self._kamas_display.setStyleSheet(
            f"color: {TEAL}; font-size: 12px; font-weight: 700;"
        )
        self._kamas_display.setToolTip("")
        kamas_top.addWidget(self._kamas_display)

        lay.addLayout(kamas_top)

        # Ligne saisie : input + bouton confirmer
        kamas_edit_row = QHBoxLayout()
        kamas_edit_row.setSpacing(6)

        self._kamas_input = QLineEdit()
        self._kamas_input.setPlaceholderText("Nouveau montant…")
        self._kamas_input.setValidator(QIntValidator(0, 999_999_999))
        self._kamas_input.setStyleSheet(_input_qss)
        self._kamas_input.returnPressed.connect(self._on_kamas_confirm)
        kamas_edit_row.addWidget(self._kamas_input, 1)

        confirm_btn = QPushButton("✓")
        confirm_btn.setStyleSheet(_confirm_qss)
        confirm_btn.clicked.connect(self._on_kamas_confirm)
        kamas_edit_row.addWidget(confirm_btn)

        lay.addLayout(kamas_edit_row)

        # Dernière saisie
        self._kamas_last_entry_lbl = QLabel("")
        self._kamas_last_entry_lbl.setStyleSheet(
            f"color: {TEXT_DIM}; font-size: 9px; padding-top: 1px;"
        )
        lay.addWidget(self._kamas_last_entry_lbl)

        # ── Séparateur avant Reset ────────────────────────────────────────
        lay.addWidget(_sep_line())

        # ── Section : RÉINITIALISATION ────────────────────────────────────
        lay.addWidget(_section_label("RÉINITIALISATION"))
        lay.addWidget(_sep_line())

        reset_desc = QLabel(
            "Efface l'historique des logs et relance\n"
            "la configuration initiale."
        )
        reset_desc.setWordWrap(True)
        reset_desc.setStyleSheet(f"color: {TEXT_DIM}; font-size: 10px;")
        lay.addWidget(reset_desc)

        reset_btn = QPushButton("Réinitialiser les données")
        reset_btn.setStyleSheet(f"""
            QPushButton {{
                background: transparent;
                color: #e05555;
                border: 1px solid #8b2222;
                border-radius: 6px;
                padding: 6px 14px;
                font-size: 11px;
                font-weight: 600;
            }}
            QPushButton:hover {{
                background: rgba(200,60,60,0.12);
                border-color: #e05555;
            }}
        """)
        reset_btn.clicked.connect(self.reset_requested)
        lay.addWidget(reset_btn)

    # ── API publique ──────────────────────────────────────────────────────

    def set_kamas(self, value: int | None):
        """Met à jour l'affichage live des kamas dans la carte Données."""
        if not hasattr(self, "_kamas_display"):
            return
        if value is None:
            self._kamas_display.setText("—")
        else:
            self._kamas_display.setText(f"{value:,}".replace(",", "\u00a0") + " k")

    def set_kamas_last_entry(self, ts: str | None):
        """
        Met à jour le label et le tooltip horodatage de la dernière correction.
        `ts` est un timestamp ISO avec ou sans millisecondes.
        """
        if not hasattr(self, "_kamas_last_entry_lbl"):
            return
        if not ts:
            self._kamas_last_entry_lbl.setText("")
            if hasattr(self, "_kamas_display"):
                self._kamas_display.setToolTip("")
            return
        label = _format_ts(ts)
        self._kamas_last_entry_lbl.setText(f"✎ {label}")
        if hasattr(self, "_kamas_display"):
            self._kamas_display.setToolTip(f"Dernière saisie manuelle : {label}")

    def _on_kamas_confirm(self):
        text = self._kamas_input.text().strip()
        if not text:
            return
        try:
            value = int(text)
        except ValueError:
            return
        self._kamas_input.clear()
        self.kamas_corrected.emit(value)

    # ── Slots ─────────────────────────────────────────────────────────────

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
