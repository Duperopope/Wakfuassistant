# ui/theme.py — Palette et QSS Wakfu (dark + teal)

# ── Couleurs ─────────────────────────────────────────────────────
BG          = "#0e1015"   # fond fenêtre
BG_PANEL    = "#16191f"   # fond panels / titlebar
BG_PANEL2   = "#1e2229"   # fond légèrement plus clair
BORDER      = "#2a2e3a"   # bordure normale
BORDER2     = "#383e4d"   # bordure hover/active
TEAL        = "#1eb4b0"   # accent principal Wakfu
TEAL_BRIGHT = "#25d4d0"   # accent brillant
TEXT        = "#dde2ec"   # texte principal
TEXT_DIM    = "#7a8090"   # texte secondaire
GOLD        = "#f0c040"   # kamas
GREEN       = "#4ccc70"   # gains
RED         = "#e05050"   # pertes
PURPLE      = "#a060e0"   # mythique

# ── QSS global ───────────────────────────────────────────────────
QSS = f"""
QWidget {{
    background: transparent;
    color: {TEXT};
    font-family: "Segoe UI";
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
    background: {BORDER2};
    border-radius: 2px;
    min-height: 20px;
}}
QScrollBar::handle:vertical:hover {{ background: {TEAL}; }}
QScrollBar::add-line:vertical,
QScrollBar::sub-line:vertical {{ height: 0; border: none; }}
QScrollBar::add-page:vertical,
QScrollBar::sub-page:vertical {{ background: none; }}

/* Inputs */
QLineEdit {{
    background: {BG};
    border: 1px solid {BORDER};
    border-radius: 3px;
    padding: 4px 8px;
    color: {TEXT};
    selection-background-color: {TEAL};
}}
QLineEdit:focus {{ border-color: {TEAL}; }}
QLineEdit::placeholder {{ color: {TEXT_DIM}; }}

QSpinBox, QDoubleSpinBox {{
    background: {BG};
    border: 1px solid {BORDER};
    border-radius: 3px;
    padding: 4px 8px;
    color: {TEXT};
}}
QSpinBox:focus, QDoubleSpinBox:focus {{ border-color: {TEAL}; }}

/* Tables */
QTableWidget {{
    background: transparent;
    border: none;
    gridline-color: {BORDER};
    outline: none;
}}
QTableWidget::item {{
    padding: 3px 6px;
    border: none;
    border-bottom: 1px solid {BORDER};
}}
QTableWidget::item:selected {{
    background: rgba(30,180,176,0.12);
    color: {TEXT};
}}
QHeaderView::section {{
    background: {BG_PANEL};
    color: {TEXT_DIM};
    font-size: 9px;
    font-weight: 800;
    letter-spacing: 0.8px;
    text-transform: uppercase;
    padding: 5px 8px;
    border: none;
    border-bottom: 1px solid {BORDER};
}}
QHeaderView::section:hover {{ color: {TEAL}; }}

/* Menus contextuels */
QMenu {{
    background: {BG_PANEL};
    border: 1px solid {BORDER2};
    border-radius: 4px;
    padding: 4px;
    color: {TEXT};
}}
QMenu::item {{
    padding: 5px 24px 5px 10px;
    border-radius: 3px;
}}
QMenu::item:selected {{
    background: rgba(30,180,176,0.15);
    color: {TEAL_BRIGHT};
}}
QMenu::separator {{
    height: 1px;
    background: {BORDER};
    margin: 3px 4px;
}}

/* Boutons génériques */
QPushButton {{
    background: {BG_PANEL2};
    border: 1px solid {BORDER};
    border-radius: 3px;
    color: {TEXT};
    padding: 5px 14px;
    font-weight: 600;
}}
QPushButton:hover {{
    border-color: {TEAL};
    color: {TEAL_BRIGHT};
}}
QPushButton:pressed {{
    background: rgba(30,180,176,0.15);
}}
"""
