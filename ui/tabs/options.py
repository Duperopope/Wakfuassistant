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
    QCheckBox,
    QColorDialog,
    QScrollArea,
    QTableWidget,
    QTableWidgetItem,
    QHeaderView,
    QMessageBox,
    QInputDialog,
    QTabWidget,
)
from PyQt5.QtCore import Qt, pyqtSignal, QRegExp
from PyQt5.QtGui import QIntValidator, QColor, QRegExpValidator

from ui.tabs.base import BaseTab
from ui.theme import BG_PANEL, BORDER, TEXT, TEXT_DIM, TEAL
from core.kamas_history import get_last_correction_ts, list_kamas_corrections
from core.calibration_history import add_entry, list_entries, update_entry, delete_entry, last_entry


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

    opacity_changed        = pyqtSignal(float)
    ct_opacity_changed     = pyqtSignal(float)
    font_changed           = pyqtSignal(str)
    font_title_changed     = pyqtSignal(str)
    font_body_changed      = pyqtSignal(str)
    font_label_changed     = pyqtSignal(str)
    palette_changed        = pyqtSignal(str)
    custom_palette_changed = pyqtSignal(dict)   # {key: hex_color, ...}
    shape_changed          = pyqtSignal(int)
    reset_requested        = pyqtSignal()
    kamas_corrected        = pyqtSignal(int)
    xp_calibrated          = pyqtSignal(int, int, int)   # level, xp_total, xp_gained
    health_calibrated      = pyqtSignal(int, int)        # hp_current, hp_max
    profession_xp_calibrated = pyqtSignal(str, int, int) # profession, xp_gained, xp_to_next
    profession_state_calibrated = pyqtSignal(str, int, int, int)  # profession, level, xp_gained, xp_to_next
    transactions_refresh_requested = pyqtSignal()
    short_numbers_changed  = pyqtSignal(bool)
    fold_anchor_changed    = pyqtSignal(bool)
    market_settings_changed = pyqtSignal(int, int)

    FONT_CHOICES = [
        "Segoe UI Variable",
        "Inter",
        "IBM Plex Sans",
        "Trebuchet MS",
        "Verdana",
        "Noto Sans",
    ]
    FONT_TITLE_CHOICES = ["Cinzel", "Segoe UI Variable", "Trajan Pro", "Georgia", "Times New Roman"]
    FONT_BODY_CHOICES  = ["Nunito Sans", "Segoe UI Variable", "Inter", "Noto Sans", "Verdana"]
    FONT_LABEL_CHOICES = ["Rajdhani", "Exo 2", "Segoe UI Variable", "Consolas", "Courier New"]

    CUSTOM_COLORS = [
        ("BG",      "Fond",    "#0e1015"),
        ("TEAL",    "Accent",  "#1eb4b0"),
        ("TEXT",    "Texte",   "#dde2ec"),
        ("BORDER",  "Bordure", "#2a2e3a"),
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

    # Vrais métiers de Wakfu 2 (collecte + artisanat)
    PROFESSION_CHOICES = [
        # Collecte
        "Mineur", "Pêcheur", "Trappeur", "Herboriste",
        # Artisanat
        "Armurier", "Bijoutier", "Boulanger", "Cuisinier",
        "Couturier", "Maroquinier", "Menuisier", "Maître d'Armes", "Alchimiste",
    ]

    def __init__(
        self,
        initial_opacity: float = 0.96,
        initial_ct_opacity: float = 0.60,
        initial_font: str = "Noto Sans",
        initial_palette: str = "wakfu",
        initial_corner_radius: int = 24,
        initial_short_kamas: bool = False,
        initial_fold_anchor_bottom: bool = False,
        initial_market_days: int = 28,
        initial_market_rate: int = 5,
        initial_font_title: str = "Cinzel",
        initial_font_body: str = "Nunito Sans",
        initial_font_label: str = "Rajdhani",
        parent: QWidget | None = None,
    ):
        super().__init__(parent)
        self._building = True
        self._custom_colors: dict[str, str] = {k: default for k, _, default in self.CUSTOM_COLORS}

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
            initial_opacity, initial_ct_opacity,
            initial_font, initial_palette, initial_corner_radius,
            initial_short_kamas, initial_fold_anchor_bottom,
        )
        root.addWidget(self._display_card)

        # ── Carte Typographie ────────────────────────────────────────────
        self._typo_card = CollapsibleCard("Typographie", collapsed=True, parent=self)
        self._populate_typo_card(
            self._typo_card.body_layout(),
            initial_font_title, initial_font_body, initial_font_label,
        )
        root.addWidget(self._typo_card)

        # ── Carte Thème personnalisé ─────────────────────────────────────
        self._custom_theme_card = CollapsibleCard("Thème personnalisé", collapsed=True, parent=self)
        self._populate_custom_theme_card(self._custom_theme_card.body_layout())
        root.addWidget(self._custom_theme_card)

        # ── Carte Données ────────────────────────────────────────────────
        self._data_card = CollapsibleCard("Données", collapsed=True, parent=self)
        self._populate_data_card(self._data_card.body_layout())
        root.addWidget(self._data_card)

        # ── Carte Gameplay ───────────────────────────────────────────────
        self._gameplay_card = CollapsibleCard("Gameplay", collapsed=True, parent=self)
        self._populate_gameplay_card(
            self._gameplay_card.body_layout(),
            initial_market_days, initial_market_rate,
        )
        root.addWidget(self._gameplay_card)

        # Accordéon
        self._all_cards: list[CollapsibleCard] = [
            self._display_card, self._typo_card, self._custom_theme_card,
            self._data_card, self._gameplay_card,
        ]
        for card in self._all_cards:
            card.expanded.connect(lambda c=card: self._on_card_expanded(c))
        self._data_card.expanded.connect(self._refresh_data_timestamps)

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
        initial_ct_opacity: float = 0.60,
        initial_font: str = "Noto Sans",
        initial_palette: str = "wakfu",
        initial_corner_radius: int = 24,
        initial_short_kamas: bool = False,
        initial_fold_anchor_bottom: bool = False,
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

        # Opacité clic à travers
        ct_row = QHBoxLayout()
        ct_row.setSpacing(8)
        ct_lbl = QLabel("Clic à travers")
        ct_lbl.setMinimumWidth(70)
        ct_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 11px;")

        self._ct_opacity_slider = QSlider(Qt.Horizontal)
        self._ct_opacity_slider.setRange(5, 85)
        self._ct_opacity_slider.setSingleStep(1)
        self._ct_opacity_slider.setPageStep(5)
        self._ct_opacity_slider.setValue(int(max(5, min(85, round(initial_ct_opacity * 100)))))
        self._ct_opacity_slider.setStyleSheet(self._opacity_slider.styleSheet())

        self._ct_opacity_value = QLabel("")
        self._ct_opacity_value.setMinimumWidth(40)
        self._ct_opacity_value.setAlignment(Qt.AlignRight | Qt.AlignVCenter)
        self._ct_opacity_value.setStyleSheet(f"color: {TEXT}; font-size: 11px; font-weight: 600;")

        ct_row.addWidget(ct_lbl)
        ct_row.addWidget(self._ct_opacity_slider, 1)
        ct_row.addWidget(self._ct_opacity_value)
        lay.addLayout(ct_row)

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

        # Nombres courts
        self._short_kamas_cb = QCheckBox("Nombres courts (historique)")
        self._short_kamas_cb.setChecked(initial_short_kamas)
        self._short_kamas_cb.setStyleSheet(f"""
            QCheckBox {{
                color: {TEXT_DIM};
                font-size: 11px;
                spacing: 6px;
            }}
            QCheckBox::indicator {{
                width: 14px;
                height: 14px;
                border: 1px solid {BORDER};
                border-radius: 3px;
                background: #0f1116;
            }}
            QCheckBox::indicator:checked {{
                background: {TEAL};
                border-color: {TEAL};
            }}
            QCheckBox::indicator:hover {{
                border-color: {TEAL};
            }}
        """)
        self._short_kamas_cb.setToolTip(
            "Affiche les montants en format court :\n"
            "100 000 – 999 999 → ex. 150 ₭₭  |  1 000 000+ → ex. 1.5 M₭\n"
            "Survolez une valeur pour voir le montant exact."
        )
        lay.addWidget(self._short_kamas_cb)

        # Ancrer en bas (replié)
        _cb_qss = f"""
            QCheckBox {{
                color: {TEXT_DIM};
                font-size: 11px;
                spacing: 6px;
            }}
            QCheckBox::indicator {{
                width: 14px;
                height: 14px;
                border: 1px solid {BORDER};
                border-radius: 3px;
                background: #0f1116;
            }}
            QCheckBox::indicator:checked {{
                background: {TEAL};
                border-color: {TEAL};
            }}
            QCheckBox::indicator:hover {{
                border-color: {TEAL};
            }}
        """
        self._fold_anchor_cb = QCheckBox("Ancrer en bas (replié)")
        self._fold_anchor_cb.setChecked(initial_fold_anchor_bottom)
        self._fold_anchor_cb.setStyleSheet(_cb_qss)
        self._fold_anchor_cb.setToolTip(
            "Quand la fenêtre est repliée, elle reste ancrée en bas :\n"
            "le bas de la fenêtre garde sa position au lieu du haut."
        )
        lay.addWidget(self._fold_anchor_cb)

        # Connecter les signaux
        self._opacity_slider.valueChanged.connect(self._on_slider_change)
        self._ct_opacity_slider.valueChanged.connect(self._on_ct_slider_change)
        self._font_combo.currentTextChanged.connect(self._on_font_change)
        self._palette_combo.currentIndexChanged.connect(self._on_palette_change)
        self._shape_combo.currentIndexChanged.connect(self._on_shape_change)
        self._short_kamas_cb.stateChanged.connect(self._on_short_kamas_change)
        self._fold_anchor_cb.stateChanged.connect(self._on_fold_anchor_change)
        self._on_slider_change(self._opacity_slider.value())
        self._on_ct_slider_change(self._ct_opacity_slider.value())

    # ── Contenu : carte Typographie ───────────────────────────────────────

    def _populate_typo_card(self, lay: QVBoxLayout,
                            initial_title: str, initial_body: str, initial_label: str):
        _combo_qss = f"""
            QComboBox {{
                background: #0f1116; border: 1px solid {BORDER}; border-radius: 8px;
                padding: 5px 10px; color: {TEXT}; min-height: 22px;
            }}
            QComboBox:hover {{ border-color: {TEAL}; }}
            QComboBox::drop-down {{ border: none; width: 20px; }}
            QComboBox QAbstractItemView {{
                background: {BG_PANEL}; border: 1px solid {BORDER};
                color: {TEXT}; selection-background-color: rgba(30,180,176,0.18);
            }}
        """
        lay.addWidget(_section_label("RÔLES DE POLICE"))
        lay.addWidget(_sep_line())

        for label_txt, choices, initial, attr, signal_name in [
            ("Titres",  self.FONT_TITLE_CHOICES, initial_title,  "_font_title_combo",  "font_title_changed"),
            ("Texte",   self.FONT_BODY_CHOICES,  initial_body,   "_font_body_combo",   "font_body_changed"),
            ("Labels",  self.FONT_LABEL_CHOICES, initial_label,  "_font_label_combo",  "font_label_changed"),
        ]:
            row = QHBoxLayout()
            row.setSpacing(8)
            lbl = QLabel(label_txt)
            lbl.setMinimumWidth(60)
            lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 11px;")
            combo = QComboBox()
            combo.addItems(choices)
            if initial in choices:
                combo.setCurrentText(initial)
            combo.setStyleSheet(_combo_qss)
            setattr(self, attr, combo)
            sig = getattr(self, signal_name)
            combo.currentTextChanged.connect(
                lambda text, s=sig: (not self._building) and s.emit(text)
            )
            row.addWidget(lbl)
            row.addWidget(combo, 1)
            lay.addLayout(row)

    # ── Contenu : carte Thème personnalisé ────────────────────────────────

    def _populate_custom_theme_card(self, lay: QVBoxLayout):
        lay.addWidget(_section_label("COULEURS PERSONNALISÉES"))
        lay.addWidget(_sep_line())

        note = QLabel("Crée un thème \"Perso\" basé sur vos couleurs.")
        note.setStyleSheet(f"color: {TEXT_DIM}; font-size: 10px;")
        note.setWordWrap(True)
        lay.addWidget(note)

        self._color_btns: dict[str, QPushButton] = {}

        grid = QVBoxLayout()
        grid.setSpacing(6)

        for key, label, default in self.CUSTOM_COLORS:
            row = QHBoxLayout()
            row.setSpacing(8)
            lbl = QLabel(label)
            lbl.setMinimumWidth(70)
            lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 11px;")

            btn = QPushButton()
            btn.setFixedSize(32, 22)
            btn.setStyleSheet(f"""
                QPushButton {{
                    background: {default};
                    border: 1px solid {BORDER};
                    border-radius: 5px;
                }}
                QPushButton:hover {{ border-color: {TEAL}; }}
            """)
            self._color_btns[key] = btn
            btn.clicked.connect(lambda _, k=key: self._pick_color(k))

            hex_lbl = QLabel(default)
            hex_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 10px; font-family: Consolas;")
            hex_lbl.setObjectName(f"hex_{key}")

            row.addWidget(lbl)
            row.addStretch()
            row.addWidget(hex_lbl)
            row.addWidget(btn)
            grid.addLayout(row)

        lay.addLayout(grid)

        apply_btn = QPushButton("Appliquer comme thème perso")
        apply_btn.setStyleSheet(f"""
            QPushButton {{
                background: rgba(30,180,176,0.12);
                color: {TEAL};
                border: 1px solid {TEAL};
                border-radius: 8px;
                padding: 6px 14px;
                font-size: 11px;
                font-weight: 600;
            }}
            QPushButton:hover {{ background: rgba(30,180,176,0.22); }}
        """)
        apply_btn.clicked.connect(self._apply_custom_theme)
        lay.addWidget(apply_btn)

    def _pick_color(self, key: str):
        current = self._custom_colors.get(key, "#000000")
        color = QColorDialog.getColor(QColor(current), self, f"Choisir : {key}")
        if color.isValid():
            hex_col = color.name()
            self._custom_colors[key] = hex_col
            btn = self._color_btns[key]
            btn.setStyleSheet(f"""
                QPushButton {{
                    background: {hex_col};
                    border: 1px solid {BORDER};
                    border-radius: 5px;
                }}
                QPushButton:hover {{ border-color: {TEAL}; }}
            """)
            # Mettre à jour le label hex
            for child in self.findChildren(QLabel, f"hex_{key}"):
                child.setText(hex_col)

    def _apply_custom_theme(self):
        self.custom_palette_changed.emit(dict(self._custom_colors))

    # ── Contenu : carte Données ───────────────────────────────────────────

    def _populate_data_card(self, lay: QVBoxLayout):
        self._input_qss = f"""
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
        self._confirm_qss = f"""
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

        self._data_tabs = QTabWidget(self)
        self._data_tabs.setDocumentMode(True)
        self._data_tabs.setStyleSheet(f"""
            QTabWidget::pane {{
                border: 1px solid {BORDER};
                border-radius: 8px;
                background: rgba(255,255,255,0.01);
                top: -1px;
            }}
            QTabBar::tab {{
                background: #121822;
                color: {TEXT_DIM};
                border: 1px solid {BORDER};
                border-bottom: none;
                padding: 6px 10px;
                margin-right: 4px;
                border-top-left-radius: 6px;
                border-top-right-radius: 6px;
                min-width: 88px;
            }}
            QTabBar::tab:selected {{
                color: {TEAL};
                background: #182231;
            }}
        """)

        self._tab_general = QWidget(self)
        self._tab_xp = QWidget(self)
        self._tab_metiers = QWidget(self)
        self._tab_history = QWidget(self)

        self._data_tabs.addTab(self._tab_general, "Général")
        self._data_tabs.addTab(self._tab_xp, "XP")
        self._data_tabs.addTab(self._tab_metiers, "XP Métiers")
        self._data_tabs.addTab(self._tab_history, "Historique")

        self._build_data_general_tab(self._tab_general)
        self._build_data_xp_tab(self._tab_xp)
        self._build_data_metiers_tab(self._tab_metiers)
        self._build_data_history_tab(self._tab_history)

        lay.addWidget(self._data_tabs)

        # Actions compactes en bas
        tx_row = QHBoxLayout()
        tx_row.setSpacing(6)
        tx_lbl = QLabel("Transactions")
        tx_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 10px;")
        tx_row.addWidget(tx_lbl)
        tx_row.addStretch(1)

        tx_refresh_btn = QPushButton("Rafraîchir")
        tx_refresh_btn.setStyleSheet(f"""
            QPushButton {{
                background: rgba(45,120,165,0.25);
                color: #dfeef9;
                border: 1px solid {BORDER};
                border-radius: 6px;
                padding: 4px 10px;
                font-size: 10px;
                font-weight: 700;
            }}
            QPushButton:hover {{ border-color: {TEAL}; color: {TEAL}; }}
        """)
        tx_refresh_btn.clicked.connect(self.transactions_refresh_requested)
        tx_row.addWidget(tx_refresh_btn)
        lay.addLayout(tx_row)

        lay.addWidget(_sep_line())
        lay.addWidget(_section_label("RÉINITIALISATION"))
        lay.addWidget(_sep_line())

        self._log_start_lbl = QLabel("")
        self._log_start_lbl.setStyleSheet(f"color: {TEAL}; font-size: 10px; font-weight: 600;")
        lay.addWidget(self._log_start_lbl)

        reset_desc = QLabel("Efface l'historique et relance la configuration initiale.")
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
        self._refresh_calibration_history()

    def _build_data_general_tab(self, container: QWidget):
        lay = QVBoxLayout(container)
        lay.setContentsMargins(10, 10, 10, 10)
        lay.setSpacing(8)

        lay.addWidget(_section_label("SESSION"))
        session_row = QHBoxLayout()
        self._session_timer_lbl = QLabel("00:00:00")
        self._session_timer_lbl.setStyleSheet(f"color: {TEAL}; font-size: 15px; font-weight: 700;")
        self._session_status_lbl = QLabel("connexion ?")
        self._session_status_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 10px;")
        session_row.addWidget(self._session_timer_lbl)
        session_row.addStretch(1)
        session_row.addWidget(self._session_status_lbl)
        lay.addLayout(session_row)
        lay.addWidget(_sep_line())

        lay.addWidget(_section_label("KAMAS"))
        kamas_top = QHBoxLayout()
        kamas_field_lbl = QLabel("Montant actuel")
        kamas_field_lbl.setStyleSheet(f"color: {TEXT}; font-size: 11px; font-weight: 600;")
        self._kamas_display = QLabel("—")
        self._kamas_display.setStyleSheet(f"color: {TEAL}; font-size: 12px; font-weight: 700;")
        kamas_top.addWidget(kamas_field_lbl)
        kamas_top.addStretch(1)
        kamas_top.addWidget(self._kamas_display)
        lay.addLayout(kamas_top)

        kamas_edit_row = QHBoxLayout()
        self._kamas_input = QLineEdit()
        self._kamas_input.setPlaceholderText("Nouveau montant…")
        self._kamas_input.setValidator(QIntValidator(0, 999_999_999))
        self._kamas_input.setStyleSheet(self._input_qss)
        self._kamas_input.returnPressed.connect(self._on_kamas_confirm)
        confirm_btn = QPushButton("✓")
        confirm_btn.setStyleSheet(self._confirm_qss)
        confirm_btn.clicked.connect(self._on_kamas_confirm)
        kamas_edit_row.addWidget(self._kamas_input, 1)
        kamas_edit_row.addWidget(confirm_btn)
        lay.addLayout(kamas_edit_row)

        self._kamas_last_entry_lbl = QLabel("")
        self._kamas_last_entry_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 9px;")
        lay.addWidget(self._kamas_last_entry_lbl)
        lay.addWidget(_sep_line())

        lay.addWidget(_section_label("SANTÉ"))
        hp_row = QHBoxLayout()
        self._hp_current_input = QLineEdit()
        self._hp_current_input.setPlaceholderText("PV actuel")
        self._hp_current_input.setValidator(QIntValidator(0, 9_999_999))
        self._hp_current_input.setStyleSheet(self._input_qss)
        self._hp_max_input = QLineEdit()
        self._hp_max_input.setPlaceholderText("PV max")
        self._hp_max_input.setValidator(QIntValidator(1, 9_999_999))
        self._hp_max_input.setStyleSheet(self._input_qss)
        hp_btn = QPushButton("✓")
        hp_btn.setStyleSheet(self._confirm_qss)
        hp_btn.clicked.connect(self._on_health_calibrate)
        hp_row.addWidget(self._hp_current_input, 1)
        hp_row.addWidget(self._hp_max_input, 1)
        hp_row.addWidget(hp_btn)
        lay.addLayout(hp_row)

        self._health_last_entry_lbl = QLabel("")
        self._health_last_entry_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 9px;")
        lay.addWidget(self._health_last_entry_lbl)
        lay.addStretch(1)

    def _build_data_xp_tab(self, container: QWidget):
        lay = QVBoxLayout(container)
        lay.setContentsMargins(10, 10, 10, 10)
        lay.setSpacing(8)

        lay.addWidget(_section_label("XP COMBAT"))
        xp_note = QLabel("Saisissez les valeurs affichées après un combat.")
        xp_note.setWordWrap(True)
        xp_note.setStyleSheet(f"color: {TEXT_DIM}; font-size: 10px;")
        lay.addWidget(xp_note)

        digits_only = QRegExpValidator(QRegExp(r'\d{1,15}'))
        for field_label, placeholder, attr in [
            ("Niveau actuel", "ex : 155", "_xp_cal_level"),
            ("XP totale du niveau", "ex : 12 500 000", "_xp_cal_total"),
            ("XP gagnée (cumulée)", "ex : 3 200 000", "_xp_cal_gained"),
        ]:
            row = QHBoxLayout()
            lbl = QLabel(field_label)
            lbl.setMinimumWidth(130)
            lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 11px;")
            inp = QLineEdit()
            inp.setPlaceholderText(placeholder)
            inp.setValidator(digits_only)
            inp.setStyleSheet(self._input_qss)
            setattr(self, attr, inp)
            row.addWidget(lbl)
            row.addWidget(inp, 1)
            lay.addLayout(row)

        xp_cal_row = QHBoxLayout()
        xp_cal_btn = QPushButton("✓ Calibrer")
        xp_cal_btn.setStyleSheet(f"""
            QPushButton {{
                background: rgba(30,180,176,0.12);
                color: {TEAL};
                border: 1px solid {TEAL};
                border-radius: 6px;
                padding: 4px 10px;
                font-size: 11px;
                font-weight: 600;
            }}
            QPushButton:hover {{ background: rgba(30,180,176,0.22); }}
        """)
        xp_cal_btn.clicked.connect(self._on_xp_calibrate)
        self._xp_cal_status = QLabel("")
        self._xp_cal_status.setStyleSheet(f"color: {TEAL}; font-size: 10px;")
        xp_cal_row.addWidget(self._xp_cal_status, 1)
        xp_cal_row.addWidget(xp_cal_btn)
        lay.addLayout(xp_cal_row)

        self._xp_last_entry_lbl = QLabel("")
        self._xp_last_entry_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 9px;")
        lay.addWidget(self._xp_last_entry_lbl)
        lay.addStretch(1)

    def _build_data_metiers_tab(self, container: QWidget):
        lay = QVBoxLayout(container)
        lay.setContentsMargins(10, 10, 10, 10)
        lay.setSpacing(8)

        lay.addWidget(_section_label("XP MÉTIERS"))
        hint = QLabel("Une seule ligne: métier, niveau, XP gagnée et XP max du niveau (permet de calculer la progression automatiquement).")
        hint.setWordWrap(True)
        hint.setStyleSheet(f"color: {TEXT_DIM}; font-size: 10px;")
        lay.addWidget(hint)

        prof_row = QHBoxLayout()
        self._prof_name_combo = QComboBox(self)
        self._prof_name_combo.addItems(self.PROFESSION_CHOICES)
        self._prof_name_combo.setStyleSheet(f"""
            QComboBox {{
                background: #0f1116;
                border: 1px solid {BORDER};
                border-radius: 6px;
                padding: 4px 8px;
                color: {TEXT};
                font-size: 11px;
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
        """)

        self._prof_level_input = QLineEdit()
        self._prof_level_input.setPlaceholderText("Niv")
        self._prof_level_input.setValidator(QRegExpValidator(QRegExp(r'\d{1,3}')))
        self._prof_level_input.setStyleSheet(self._input_qss)
        self._prof_level_input.setFixedWidth(64)

        self._prof_xp_gain_input = QLineEdit()
        self._prof_xp_gain_input.setPlaceholderText("XP gagnée")
        self._prof_xp_gain_input.setValidator(QRegExpValidator(QRegExp(r'\d{1,15}')))
        self._prof_xp_gain_input.setStyleSheet(self._input_qss)
        
        self._prof_xp_total_input = QLineEdit()
        self._prof_xp_total_input.setPlaceholderText("XP max du niveau")
        self._prof_xp_total_input.setValidator(QRegExpValidator(QRegExp(r'\d{1,15}')))
        self._prof_xp_total_input.setStyleSheet(self._input_qss)
        
        prof_btn = QPushButton("✓")
        prof_btn.setStyleSheet(self._confirm_qss)
        prof_btn.clicked.connect(self._on_profession_xp_calibrate)
        prof_row.addWidget(self._prof_name_combo, 2)
        prof_row.addWidget(self._prof_level_input)
        prof_row.addWidget(self._prof_xp_gain_input, 1)
        prof_row.addWidget(self._prof_xp_total_input, 1)
        prof_row.addWidget(prof_btn)
        lay.addLayout(prof_row)

        # Zone d'affichage des métiers enregistrés
        self._prof_entries_container = QWidget()
        self._prof_entries_layout = QVBoxLayout(self._prof_entries_container)
        self._prof_entries_layout.setContentsMargins(0, 0, 0, 0)
        self._prof_entries_layout.setSpacing(2)
        
        scroll = QScrollArea()
        scroll.setWidget(self._prof_entries_container)
        scroll.setWidgetResizable(True)
        scroll.setStyleSheet(f"QScrollArea {{ border: 1px solid {BORDER}; background: rgba(255,255,255,0.01); border-radius: 4px; }}")
        scroll.setFixedHeight(120)
        lay.addWidget(scroll)
        
        self._refresh_profession_entries()
        lay.addStretch(1)

    def _build_data_history_tab(self, container: QWidget):
        lay = QVBoxLayout(container)
        lay.setContentsMargins(10, 10, 10, 10)
        lay.setSpacing(8)

        lay.addWidget(_section_label("HISTORIQUE DES CALIBRAGES"))
        self._calib_table = QTableWidget(0, 3)
        self._calib_table.setHorizontalHeaderLabels(["Type", "Valeurs", "Horodatage"])
        self._calib_table.setSelectionBehavior(QTableWidget.SelectRows)
        self._calib_table.setEditTriggers(QTableWidget.NoEditTriggers)
        self._calib_table.verticalHeader().setVisible(False)
        self._calib_table.horizontalHeader().setSectionResizeMode(0, QHeaderView.ResizeToContents)
        self._calib_table.horizontalHeader().setSectionResizeMode(1, QHeaderView.Stretch)
        self._calib_table.horizontalHeader().setSectionResizeMode(2, QHeaderView.ResizeToContents)
        self._calib_table.setStyleSheet(f"background: #0f1116; border: 1px solid {BORDER}; color: {TEXT};")
        lay.addWidget(self._calib_table, 1)

        hist_actions = QHBoxLayout()
        edit_entry_btn = QPushButton("Éditer entrée")
        del_entry_btn = QPushButton("Supprimer entrée")
        refresh_entry_btn = QPushButton("Rafraîchir")
        for b in (edit_entry_btn, del_entry_btn, refresh_entry_btn):
            b.setStyleSheet(f"""
                QPushButton {{
                    background: rgba(45,120,165,0.25);
                    color: #dfeef9;
                    border: 1px solid {BORDER};
                    border-radius: 6px;
                    padding: 4px 10px;
                    font-size: 10px;
                    font-weight: 700;
                }}
                QPushButton:hover {{ border-color: {TEAL}; color: {TEAL}; }}
            """)
        edit_entry_btn.clicked.connect(self._on_edit_calibration_entry)
        del_entry_btn.clicked.connect(self._on_delete_calibration_entry)
        refresh_entry_btn.clicked.connect(self._refresh_calibration_history)
        hist_actions.addWidget(edit_entry_btn)
        hist_actions.addWidget(del_entry_btn)
        hist_actions.addStretch(1)
        hist_actions.addWidget(refresh_entry_btn)
        lay.addLayout(hist_actions)

    # ── Contenu : carte Gameplay ──────────────────────────────────────────

    def _populate_gameplay_card(self, lay: QVBoxLayout, initial_market_days: int = 28, initial_market_rate: int = 5):
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

        lay.addWidget(_section_label("MARCHÉ"))
        lay.addWidget(_sep_line())

        # Durée de publication par défaut
        days_row = QHBoxLayout()
        days_row.setSpacing(8)
        days_lbl = QLabel("Durée défaut")
        days_lbl.setMinimumWidth(90)
        days_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 11px;")
        self._market_days_combo = QComboBox()
        for days, label in [(7, "7 jours"), (14, "14 jours"), (28, "28 jours")]:
            self._market_days_combo.addItem(label, days)
        for i in range(self._market_days_combo.count()):
            if self._market_days_combo.itemData(i) == initial_market_days:
                self._market_days_combo.setCurrentIndex(i)
                break
        self._market_days_combo.setStyleSheet(_combo_qss)
        self._market_days_combo.setToolTip(
            "Durée de publication utilisée pour estimer le prix\n"
            "des objets à partir de la taxe de dépôt marché.\n"
            "Modifiable par transaction dans l'historique."
        )
        days_row.addWidget(days_lbl)
        days_row.addWidget(self._market_days_combo, 1)
        lay.addLayout(days_row)

        # Taux territoire
        rate_row = QHBoxLayout()
        rate_row.setSpacing(8)
        rate_lbl = QLabel("Taux territoire")
        rate_lbl.setMinimumWidth(90)
        rate_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 11px;")
        self._market_rate_combo = QComboBox()
        for rate, label in [(5, "Standard  (5%)"), (10, "Astrub  (10%)")]:
            self._market_rate_combo.addItem(label, rate)
        for i in range(self._market_rate_combo.count()):
            if self._market_rate_combo.itemData(i) == initial_market_rate:
                self._market_rate_combo.setCurrentIndex(i)
                break
        self._market_rate_combo.setStyleSheet(_combo_qss)
        self._market_rate_combo.setToolTip(
            "Taux de taxe du territoire de vente.\n"
            "Standard : 5%  |  Astrub : 10%\n"
            "Utilisé pour calculer le prix estimé depuis la taxe payée."
        )
        rate_row.addWidget(rate_lbl)
        rate_row.addWidget(self._market_rate_combo, 1)
        lay.addLayout(rate_row)

        # Note explicative
        note = QLabel(
            "Prix estimé = taxe ÷ (taux × durée/28j)\n"
            "Ex : taxe 125₭, 7j, 5% → 7 500₭/unité"
        )
        note.setStyleSheet(f"color: {TEXT_DIM}; font-size: 9px; padding-top: 4px;")
        note.setWordWrap(True)
        lay.addWidget(note)

        # Signaux
        self._market_days_combo.currentIndexChanged.connect(self._on_market_settings_change)
        self._market_rate_combo.currentIndexChanged.connect(self._on_market_settings_change)

    # ── API publique ──────────────────────────────────────────────────────

    def set_session_time(self, elapsed_seconds: int, status: str):
        """Met à jour le timer de session et le statut de connexion."""
        if not hasattr(self, "_session_timer_lbl"):
            return
        h, rem = divmod(max(0, elapsed_seconds), 3600)
        m, s   = divmod(rem, 60)
        self._session_timer_lbl.setText(f"{h:02d}:{m:02d}:{s:02d}")
        self._session_status_lbl.setText(status)

    def set_kamas(self, value: int | None):
        """Met à jour l'affichage live des kamas dans la carte Données."""
        if not hasattr(self, "_kamas_display"):
            return
        if value is None:
            self._kamas_display.setText("—")
        else:
            self._kamas_display.setText(f"{value:,}".replace(",", "\u00a0") + " k")

    def _refresh_data_timestamps(self):
        """Relit le journal à chaque ouverture de la carte pour garantir l'affichage."""
        ts = get_last_correction_ts()
        if ts:
            self.set_kamas_last_entry(ts)
        health = last_entry("health")
        xp = last_entry("xp")
        self.set_health_last_entry(health.get("ts") if health else None)
        self.set_xp_last_entry(xp.get("ts") if xp else None)
        self._refresh_profession_entries()
        self._refresh_calibration_history()

    def set_log_start_date(self, ts: str | None):
        """
        Met à jour l'étiquette indiquant la date la plus ancienne du log permanent.
        `ts` est un timestamp ISO "YYYY-MM-DD HH:MM:SS".
        """
        if not hasattr(self, "_log_start_lbl"):
            return
        if not ts:
            self._log_start_lbl.setText("")
        else:
            label = _format_ts(ts)
            self._log_start_lbl.setText(f"Données depuis le {label}")

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

    def set_health_last_entry(self, ts: str | None):
        if not hasattr(self, "_health_last_entry_lbl"):
            return
        if not ts:
            self._health_last_entry_lbl.setText("")
            return
        self._health_last_entry_lbl.setText(f"✎ Santé enregistrée : {_format_ts(ts)}")

    def set_xp_last_entry(self, ts: str | None):
        if not hasattr(self, "_xp_last_entry_lbl"):
            return
        if not ts:
            self._xp_last_entry_lbl.setText("")
            return
        self._xp_last_entry_lbl.setText(f"✎ XP enregistrée : {_format_ts(ts)}")



    def _on_kamas_confirm(self):
        text = self._kamas_input.text().strip()
        if not text:
            return
        try:
            value = int(text)
        except ValueError:
            return
        self._kamas_input.clear()
        entry = add_entry("kamas", {"value": value})
        self.set_kamas_last_entry(entry.get("ts"))
        self._refresh_calibration_history()
        self.kamas_corrected.emit(value)

    def _on_xp_calibrate(self):
        try:
            level  = int(self._xp_cal_level.text().strip())
            total  = int(self._xp_cal_total.text().strip())
            gained = int(self._xp_cal_gained.text().strip())
        except (ValueError, AttributeError):
            return
        if level < 1 or total < 1:
            return
        entry = add_entry("xp", {"level": level, "xp_total": total, "xp_gained": gained})
        self.set_xp_last_entry(entry.get("ts"))
        self._refresh_calibration_history()
        self.xp_calibrated.emit(level, total, gained)
        self._xp_cal_status.setText(f"✓ Niveau {level} calibré")

    def _on_health_calibrate(self):
        cur = (self._hp_current_input.text() or "").strip()
        mx = (self._hp_max_input.text() or "").strip()
        if not cur or not mx:
            return
        try:
            hp_current = int(cur)
            hp_max = int(mx)
        except ValueError:
            return
        if hp_current < 0 or hp_max <= 0:
            return
        entry = add_entry("health", {"hp_current": hp_current, "hp_max": hp_max})
        self.set_health_last_entry(entry.get("ts"))
        self._refresh_calibration_history()
        self.health_calibrated.emit(hp_current, hp_max)

    def _on_profession_xp_calibrate(self):
        profession = (self._prof_name_combo.currentText() or "").strip()
        level_txt = (self._prof_level_input.text() or "").strip()
        gain = (self._prof_xp_gain_input.text() or "").strip()
        xp_total_txt = (self._prof_xp_total_input.text() or "").strip()
        if not profession or not level_txt or not gain or not xp_total_txt:
            return
        try:
            level = int(level_txt)
            xp_gained = int(gain)
            xp_total = int(xp_total_txt)
        except ValueError:
            return
        if level < 1 or xp_total < 1:
            return
        # Calculer automatiquement xp_to_next = xp_total - xp_gained
        xp_to_next = max(0, xp_total - xp_gained)
        
        entry = add_entry("xp_profession", {
            "profession": profession,
            "level": level,
            "xp_gained": xp_gained,
            "xp_to_next": xp_to_next,
        })
        self._refresh_profession_entries()
        self._refresh_calibration_history()
        self.profession_xp_calibrated.emit(profession, xp_gained, xp_to_next)
        self.profession_state_calibrated.emit(profession, level, xp_gained, xp_to_next)

    def _entry_to_row(self, entry: dict) -> tuple[str, str, str]:
        kind = str(entry.get("kind", ""))
        payload = entry.get("payload", {}) if isinstance(entry.get("payload"), dict) else {}
        ts = _format_ts(str(entry.get("ts", "")))
        if kind == "kamas":
            val = payload.get("value")
            return "Kamas", f"{val:,} k".replace(",", "\u00a0") if isinstance(val, int) else "—", ts
        if kind == "health":
            c = payload.get("hp_current")
            m = payload.get("hp_max")
            return "Santé", f"{c}/{m}" if isinstance(c, int) and isinstance(m, int) else "—", ts
        if kind == "xp":
            lvl = payload.get("level")
            total = payload.get("xp_total")
            gained = payload.get("xp_gained")
            return "XP", f"Niv {lvl} · {gained}/{total}" if isinstance(lvl, int) else "—", ts
        if kind == "xp_profession":
            prof = payload.get("profession")
            lvl = payload.get("level")
            gained = payload.get("xp_gained")
            nxt = payload.get("xp_to_next")
            if isinstance(lvl, int):
                return "XP métiers", f"{prof} · niv {lvl} · +{gained} · reste {nxt}", ts
            return "XP métiers", f"{prof} · +{gained} · reste {nxt}", ts
        return kind or "Autre", str(payload), ts

    def _refresh_profession_entries(self):
        """Affiche les métiers enregistrés dans la zone scrollable."""
        while self._prof_entries_layout.count():
            item = self._prof_entries_layout.takeAt(0)
            if item.widget():
                item.widget().deleteLater()
        
        entries = list_entries(kind="xp_profession", limit=20)
        if not entries:
            empty_lbl = QLabel("Aucun métier enregistré")
            empty_lbl.setStyleSheet(f"color: {TEXT_DIM}; font-size: 10px; padding: 8px;")
            self._prof_entries_layout.addWidget(empty_lbl)
            return
        
        # Reverse pour afficher les plus récents en premier
        for entry in reversed(entries):
            payload = entry.get("payload", {}) if isinstance(entry.get("payload"), dict) else {}
            prof = payload.get("profession", "?")
            lvl = payload.get("level")
            gained = payload.get("xp_gained")
            nxt = payload.get("xp_to_next")
            ts = _format_ts(str(entry.get("ts", "")))
            
            # Formater l'info
            if isinstance(lvl, int):
                info = f"{prof.upper()} · Niv {lvl} · +{gained} · Reste {nxt} | {ts}"
            else:
                info = f"{prof.upper()} · +{gained} · Reste {nxt} | {ts}"
            
            row_lbl = QLabel(info)
            row_lbl.setStyleSheet(f"color: {TEXT}; font-size: 10px; padding: 4px 6px; background: rgba(30,180,176,0.05); border-radius: 3px;")
            row_lbl.setWordWrap(True)
            row_lbl.setMaximumHeight(28)
            self._prof_entries_layout.addWidget(row_lbl)
        
        self._prof_entries_layout.addStretch(1)

    def _refresh_calibration_history(self):
        if not hasattr(self, "_calib_table"):
            return
        rows = list_entries(limit=120)

        # Fusionne l'historique dédié des kamas pour que la ligne affichée
        # sous "Montant actuel" soit aussi visible dans l'onglet Historique.
        extra_kamas = list_kamas_corrections(limit=120)
        existing_keys: set[tuple[str, str, int]] = set()
        for entry in rows:
            if str(entry.get("kind", "")) != "kamas":
                continue
            payload = entry.get("payload", {}) if isinstance(entry.get("payload"), dict) else {}
            try:
                value = int(payload.get("value"))
            except (TypeError, ValueError):
                continue
            existing_keys.add(("kamas", str(entry.get("ts", "")), value))

        for idx, item in enumerate(extra_kamas):
            ts = str(item.get("ts", ""))
            value = int(item.get("value", 0) or 0)
            key = ("kamas", ts, value)
            if key in existing_keys:
                continue
            rows.append({
                "id": f"kamas-journal-{idx}-{ts}",
                "kind": "kamas",
                "ts": ts,
                "payload": {"value": value},
            })

        rows.sort(key=lambda r: str(r.get("ts", "")), reverse=True)
        rows = rows[:120]
        self._calib_table.setRowCount(len(rows))
        for i, e in enumerate(rows):
            kind, values, ts = self._entry_to_row(e)
            it_kind = QTableWidgetItem(kind)
            it_values = QTableWidgetItem(values)
            it_ts = QTableWidgetItem(ts)
            it_kind.setData(Qt.UserRole, e.get("id"))
            self._calib_table.setItem(i, 0, it_kind)
            self._calib_table.setItem(i, 1, it_values)
            self._calib_table.setItem(i, 2, it_ts)

    def _selected_entry_id(self) -> str | None:
        if not hasattr(self, "_calib_table"):
            return None
        row = self._calib_table.currentRow()
        if row < 0:
            return None
        item = self._calib_table.item(row, 0)
        if item is None:
            return None
        val = item.data(Qt.UserRole)
        return str(val) if val else None

    def _on_delete_calibration_entry(self):
        entry_id = self._selected_entry_id()
        if not entry_id:
            return
        if str(entry_id).startswith("kamas-journal-"):
            QMessageBox.information(
                self,
                "Calibrage",
                "Cette ligne provient du journal Kamas dédié et n'est pas supprimable ici.",
            )
            return
        if QMessageBox.question(self, "Calibrage", "Supprimer cette entrée ?") != QMessageBox.Yes:
            return
        if delete_entry(entry_id):
            self._refresh_calibration_history()

    def _on_edit_calibration_entry(self):
        entry_id = self._selected_entry_id()
        if not entry_id:
            return
        if str(entry_id).startswith("kamas-journal-"):
            QMessageBox.information(
                self,
                "Calibrage",
                "Cette ligne provient du journal Kamas dédié et est en lecture seule ici.",
            )
            return
        selected = None
        for row in list_entries(limit=200):
            if row.get("id") == entry_id:
                selected = row
                break
        if not selected:
            return
        kind = selected.get("kind")
        payload = selected.get("payload", {}) if isinstance(selected.get("payload"), dict) else {}

        if kind == "kamas":
            cur = int(payload.get("value", 0) or 0)
            value, ok = QInputDialog.getInt(self, "Éditer kamas", "Valeur", cur, 0, 2_000_000_000)
            if ok:
                if QMessageBox.question(
                    self,
                    "Confirmer modification",
                    "Modifier cette entrée peut décaler les calculs. Continuer ?",
                ) == QMessageBox.Yes:
                    if update_entry(entry_id, {"value": int(value)}):
                        self._refresh_calibration_history()
            return

        if kind == "health":
            cur_hp = int(payload.get("hp_current", 0) or 0)
            cur_max = int(payload.get("hp_max", 1) or 1)
            hp, ok_hp = QInputDialog.getInt(self, "Éditer santé", "HP actuel", cur_hp, 0, 9_999_999)
            if not ok_hp:
                return
            mx, ok_mx = QInputDialog.getInt(self, "Éditer santé", "HP max", cur_max, 1, 9_999_999)
            if ok_mx:
                if QMessageBox.question(
                    self,
                    "Confirmer modification",
                    "Modifier cette entrée peut décaler les calculs. Continuer ?",
                ) == QMessageBox.Yes:
                    if update_entry(entry_id, {"hp_current": int(hp), "hp_max": int(mx)}):
                        self._refresh_calibration_history()
            return

        text, ok = QInputDialog.getText(self, "Éditer entrée", "JSON payload", text=str(payload))
        if not ok:
            return
        try:
            import json as _json
            new_payload = _json.loads(text)
            if not isinstance(new_payload, dict):
                raise ValueError
        except Exception:
            QMessageBox.warning(self, "Calibrage", "Payload JSON invalide")
            return
        if QMessageBox.question(
            self,
            "Confirmer modification",
            "Modifier cette entrée peut décaler les calculs. Continuer ?",
        ) != QMessageBox.Yes:
            return
        if update_entry(entry_id, new_payload):
            self._refresh_calibration_history()

    # ── Slots ─────────────────────────────────────────────────────────────

    def _on_slider_change(self, value: int):
        self._opacity_value.setText(f"{value}%")
        if self._building:
            return
        self.opacity_changed.emit(value / 100.0)

    def _on_ct_slider_change(self, value: int):
        self._ct_opacity_value.setText(f"{value}%")
        if self._building:
            return
        self.ct_opacity_changed.emit(value / 100.0)

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

    def _on_short_kamas_change(self, state: int):
        if self._building:
            return
        self.short_numbers_changed.emit(bool(state))

    def _on_fold_anchor_change(self, state: int):
        if self._building:
            return
        self.fold_anchor_changed.emit(bool(state))

    def _on_market_settings_change(self, _index: int = 0):
        if self._building:
            return
        days = int(self._market_days_combo.currentData() or 28)
        rate = int(self._market_rate_combo.currentData() or 5)
        self.market_settings_changed.emit(days, rate)
