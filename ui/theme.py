# ui/theme.py — Palette et QSS Wakfu (dark + teal)

DEFAULT_PALETTE = "wakfu"

PALETTES = {
    "wakfu": {
        "BG": "#0e1015",
        "BG_PANEL": "#16191f",
        "BG_PANEL2": "#1e2229",
        "BORDER": "#2a2e3a",
        "BORDER2": "#383e4d",
        "TEAL": "#1eb4b0",
        "TEAL_BRIGHT": "#25d4d0",
        "TEXT": "#dde2ec",
        "TEXT_DIM": "#7a8090",
        "GREEN": "#4ccc70",
        "RED": "#e05050",
    },
    "ember": {
        "BG": "#16110d",
        "BG_PANEL": "#201914",
        "BG_PANEL2": "#2a221b",
        "BORDER": "#4b3627",
        "BORDER2": "#6a4a34",
        "TEAL": "#d08a35",
        "TEAL_BRIGHT": "#e3ad5f",
        "TEXT": "#f0dfc8",
        "TEXT_DIM": "#a58d74",
        "GREEN": "#70c98b",
        "RED": "#e06a58",
    },
    "ocean": {
        "BG": "#0d121a",
        "BG_PANEL": "#151d2a",
        "BG_PANEL2": "#1c2738",
        "BORDER": "#2d3e59",
        "BORDER2": "#3f5577",
        "TEAL": "#3a9ecf",
        "TEAL_BRIGHT": "#70bee4",
        "TEXT": "#d7e6f2",
        "TEXT_DIM": "#8498ad",
        "GREEN": "#67c7a0",
        "RED": "#df6f77",
    },
    "forest": {
        "BG": "#101712",
        "BG_PANEL": "#18241b",
        "BG_PANEL2": "#223126",
        "BORDER": "#35503b",
        "BORDER2": "#4b6a52",
        "TEAL": "#5aa06a",
        "TEAL_BRIGHT": "#84c58f",
        "TEXT": "#d9e8dc",
        "TEXT_DIM": "#8aa08f",
        "GREEN": "#79cf8d",
        "RED": "#d86a6a",
    },
    "astrub": {
        "BG": "#12141a",
        "BG_PANEL": "#1c2230",
        "BG_PANEL2": "#263043",
        "BORDER": "#3a4a66",
        "BORDER2": "#55698b",
        "TEAL": "#58b7e3",
        "TEAL_BRIGHT": "#89d1ef",
        "TEXT": "#e2edf7",
        "TEXT_DIM": "#93a5bb",
        "GREEN": "#74cc9b",
        "RED": "#e47878",
    },
    "bonta": {
        "BG": "#17161f",
        "BG_PANEL": "#242233",
        "BG_PANEL2": "#2f2d43",
        "BORDER": "#4f4b68",
        "BORDER2": "#6d6889",
        "TEAL": "#b89aff",
        "TEAL_BRIGHT": "#ceb8ff",
        "TEXT": "#ece9fb",
        "TEXT_DIM": "#aaa4c0",
        "GREEN": "#8fd5a4",
        "RED": "#e9838f",
    },
    "brakmar": {
        "BG": "#170f11",
        "BG_PANEL": "#25171a",
        "BG_PANEL2": "#341f23",
        "BORDER": "#5c343a",
        "BORDER2": "#7f4852",
        "TEAL": "#d25b65",
        "TEAL_BRIGHT": "#e08a92",
        "TEXT": "#f2e0e2",
        "TEXT_DIM": "#b7979b",
        "GREEN": "#80c49a",
        "RED": "#ea7078",
    },
    "sufokia": {
        "BG": "#0f1720",
        "BG_PANEL": "#162331",
        "BG_PANEL2": "#1e3143",
        "BORDER": "#31506c",
        "BORDER2": "#456e93",
        "TEAL": "#49a6cf",
        "TEAL_BRIGHT": "#7ac3e2",
        "TEXT": "#dcedf7",
        "TEXT_DIM": "#8ba4b8",
        "GREEN": "#6fc7b3",
        "RED": "#df7e7e",
    },
    "amakna": {
        "BG": "#16140f",
        "BG_PANEL": "#242016",
        "BG_PANEL2": "#312a1d",
        "BORDER": "#5a4a2f",
        "BORDER2": "#796540",
        "TEAL": "#c7a44f",
        "TEAL_BRIGHT": "#dbbe73",
        "TEXT": "#f0e5cf",
        "TEXT_DIM": "#ae9f82",
        "GREEN": "#8ac07b",
        "RED": "#df8675",
    },
    "xelorium": {
        "BG": "#14131d",
        "BG_PANEL": "#201e2f",
        "BG_PANEL2": "#2b2840",
        "BORDER": "#4b4670",
        "BORDER2": "#655f92",
        "TEAL": "#8f7be0",
        "TEAL_BRIGHT": "#b3a4f0",
        "TEXT": "#e9e5fb",
        "TEXT_DIM": "#9f98be",
        "GREEN": "#87c5a8",
        "RED": "#e28695",
    },
}


def get_palette(name: str) -> dict[str, str]:
    return PALETTES.get(name, PALETTES[DEFAULT_PALETTE]).copy()


def build_qss(palette_name: str = DEFAULT_PALETTE, font_stack: str | None = None) -> str:
    p = get_palette(palette_name)
    fonts = font_stack or '"Noto Sans", "Inter", "IBM Plex Sans", "Segoe UI Variable", "Segoe UI", sans-serif'
    return f"""
QWidget {{
    background: transparent;
    color: {p['TEXT']};
    font-family: {fonts};
    font-size: 12px;
    border: none;
    outline: none;
}}

/* Scrollbars */
QScrollBar:vertical {{
    background: transparent;
    width: 4px;
    border: none;
    margin: 0;
}}
QScrollBar::handle:vertical {{
    background: {p['BORDER2']};
    border-radius: 2px;
    min-height: 20px;
}}
QScrollBar::handle:vertical:hover {{ background: {p['TEAL']}; }}
QScrollBar::add-line:vertical,
QScrollBar::sub-line:vertical {{ height: 0; border: none; }}
QScrollBar::add-page:vertical,
QScrollBar::sub-page:vertical {{ background: none; }}

/* Inputs */
QLineEdit {{
    background: {p['BG']};
    border: 1px solid {p['BORDER']};
    border-radius: 8px;
    padding: 6px 10px;
    color: {p['TEXT']};
    selection-background-color: {p['TEAL']};
}}
QLineEdit:focus {{ border-color: {p['TEAL']}; }}
QLineEdit::placeholder {{ color: {p['TEXT_DIM']}; }}

QSpinBox, QDoubleSpinBox {{
    background: {p['BG']};
    border: 1px solid {p['BORDER']};
    border-radius: 8px;
    padding: 6px 10px;
    color: {p['TEXT']};
}}
QSpinBox:focus, QDoubleSpinBox:focus {{ border-color: {p['TEAL']}; }}

/* Tables */
QTableWidget {{
    background: transparent;
    border: none;
    gridline-color: {p['BORDER']};
    outline: none;
}}
QTableWidget::item {{
    padding: 3px 6px;
    border: none;
    border-bottom: 1px solid {p['BORDER']};
}}
QTableWidget::item:selected {{
    background: rgba(30,180,176,0.12);
    color: {p['TEXT']};
}}
QHeaderView::section {{
    background: {p['BG_PANEL']};
    color: {p['TEXT_DIM']};
    font-size: 9px;
    font-weight: 800;
    letter-spacing: 0.8px;
    text-transform: uppercase;
    padding: 5px 8px;
    border: none;
    border-bottom: 1px solid {p['BORDER']};
}}
QHeaderView::section:hover {{ color: {p['TEAL']}; }}

/* Menus contextuels */
QMenu {{
    background: {p['BG_PANEL']};
    border: 1px solid {p['BORDER2']};
    border-radius: 10px;
    padding: 6px;
    color: {p['TEXT']};
}}
QMenu::item {{
    padding: 7px 24px 7px 12px;
    border-radius: 7px;
}}
QMenu::item:selected {{
    background: rgba(30,180,176,0.15);
    color: {p['TEAL_BRIGHT']};
}}
QMenu::separator {{
    height: 1px;
    background: {p['BORDER']};
    margin: 3px 4px;
}}

/* Boutons génériques */
QPushButton {{
    background: {p['BG_PANEL2']};
    border: 1px solid {p['BORDER']};
    border-radius: 8px;
    color: {p['TEXT']};
    padding: 6px 14px;
    font-weight: 600;
}}
QPushButton:hover {{
    border-color: {p['TEAL']};
    color: {p['TEAL_BRIGHT']};
}}
QPushButton:pressed {{
    background: rgba(30,180,176,0.15);
}}

/* Tooltips */
QToolTip {{
    background: {p['BG_PANEL2']};
    border: 1px solid {p['BORDER2']};
    border-radius: 8px;
    color: {p['TEXT']};
    padding: 6px 10px;
    font-size: 11px;
    font-weight: 400;
    opacity: 240;
}}
"""


# Couleurs legacy conservees pour les widgets qui les importent directement.
_default = get_palette(DEFAULT_PALETTE)
BG = _default["BG"]
BG_PANEL = _default["BG_PANEL"]
BG_PANEL2 = _default["BG_PANEL2"]
BORDER = _default["BORDER"]
BORDER2 = _default["BORDER2"]
TEAL = _default["TEAL"]
TEAL_BRIGHT = _default["TEAL_BRIGHT"]
TEXT = _default["TEXT"]
TEXT_DIM = _default["TEXT_DIM"]
GREEN = _default["GREEN"]
RED = _default["RED"]

QSS = build_qss(DEFAULT_PALETTE)
