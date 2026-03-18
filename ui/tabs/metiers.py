# ui/tabs/metiers.py — Onglet Métiers
# Suivi XP/h, édition progression, gestion des recettes par métier.

from __future__ import annotations

import time
from pathlib import Path

from PyQt5.QtCore import Qt, QTimer, QPoint, QSize
from PyQt5.QtGui import QColor, QFont, QPainter, QPen, QPixmap
from PyQt5.QtWidgets import (
    QComboBox,
    QDialog,
    QDialogButtonBox,
    QFormLayout,
    QFrame,
    QHBoxLayout,
    QHeaderView,
    QInputDialog,
    QLabel,
    QLineEdit,
    QListWidget,
    QListWidgetItem,
    QMenu,
    QMessageBox,
    QPushButton,
    QScrollArea,
    QSizePolicy,
    QSpinBox,
    QTableWidget,
    QTableWidgetItem,
    QVBoxLayout,
    QWidget,
)

from ui.tabs.base import BaseTab
from ui.theme import (
    BORDER,
    TEAL,
    TEAL_BRIGHT,
    TEXT,
    TEXT_DIM,
    FONT_TITLE,
    FONT_LABEL,
    BG,
)
from core.game_database import (
    delete_recipe,
    get_all_known_items,
    get_profession_state,
    list_recipes,
    set_profession_state,
    upsert_recipe,
)

_PROJECT_ROOT = Path(__file__).resolve().parents[2]
_JOBS_ICON_DIR = _PROJECT_ROOT / "data" / "wakassets" / "jobs"
_OFFICIAL_ICON_DIR = _PROJECT_ROOT / "data" / "ankama_official" / "wakassets" / "items"
_CDN_ICON_DIR = _PROJECT_ROOT / "data" / "ankama_cdn" / "item_icons"

# Rareté → (label_fr, couleur_hex)
_RARITY_FR: dict[int, tuple[str, str]] = {
    0: ("Ancien",       "#BCC0C0"),
    1: ("Commun",       "#BCC0C0"),
    2: ("Rare",         "#28F18B"),
    3: ("Mythique",     "#FD8E39"),
    4: ("Légendaire",   "#FEDE71"),
    5: ("Relique",      "#FF47E7"),
    6: ("Souvenir",     "#8FC7E2"),
    7: ("Épique",       "#FD87BA"),
}

_BG_ODD  = "#0d1520"
_BG_EVEN = "#111d2e"

_PROFESSIONS: list[tuple[str, int]] = [
    # Collecte
    ("Paysan",          64),
    ("Forestier",       71),
    ("Herboriste",      72),
    ("Mineur",          73),
    ("Pêcheur",         75),
    ("Trappeur",        74),
    # Artisanat
    ("Armurier",        77),
    ("Bijoutier",       78),
    ("Boulanger",       40),
    ("Cuisinier",       76),
    ("Ébéniste",        81),
    ("Maître d'Armes",  83),
    ("Maroquinier",     80),
    ("Tailleur",        79),
]

_COLLECTE_NAMES  = {"Paysan", "Forestier", "Herboriste", "Mineur", "Pêcheur", "Trappeur"}
_ARTISANAT_NAMES = {"Armurier", "Bijoutier", "Boulanger", "Cuisinier", "Ébéniste",
                    "Maître d'Armes", "Maroquinier", "Tailleur"}

_ITEMS_CACHE: list[str] | None = None


def _all_items() -> list[str]:
    global _ITEMS_CACHE
    if _ITEMS_CACHE is None:
        _ITEMS_CACHE = get_all_known_items()
    return _ITEMS_CACHE


# ── Helpers ───────────────────────────────────────────────────────────────────

def _fmt_duration(seconds: float) -> str:
    if seconds <= 0:
        return "—"
    s = int(seconds)
    if s < 60:
        return f"{s}s"
    h, r = divmod(s, 3600)
    m, _ = divmod(r, 60)
    if h >= 24:
        return f"{h // 24}j{h % 24}h"
    if h:
        return f"{h}h{m:02d}"
    return f"{m}min"


def _fmt_xp(v: int) -> str:
    if v >= 1_000_000_000:
        return f"{v / 1_000_000_000:.2f}G"
    if v >= 1_000_000:
        return f"{v / 1_000_000:.1f}M"
    if v >= 1_000:
        return f"{v // 1_000}K"
    return str(v)


def _job_pixmap(job_id: int, size: int = 48) -> QPixmap | None:
    path = _JOBS_ICON_DIR / f"{job_id}.png"
    if not path.exists():
        return None
    pix = QPixmap(str(path))
    if pix.isNull():
        return None
    return pix.scaled(size, size, Qt.KeepAspectRatio, Qt.SmoothTransformation)


def _item_icon(name: str, size: int = 24) -> QPixmap | None:
    """Charge l'icône d'un item (officiel > CDN), None si introuvable."""
    try:
        from core.item_icons import get_gfx_id, load_pixmap
    except Exception:
        return None
    gfx = get_gfx_id(name)
    if gfx is None:
        return None
    official = _OFFICIAL_ICON_DIR / f"{gfx}.png"
    if official.exists():
        px = QPixmap(str(official))
        if not px.isNull():
            return px.scaled(size, size, Qt.KeepAspectRatio, Qt.SmoothTransformation)
    return load_pixmap(gfx, size)


def _item_rarity(name: str) -> tuple[int, str, str] | None:
    """Retourne (rarity_int, label_fr, couleur) pour un item, None si inconnu."""
    try:
        from core.item_icons import get_item_data
    except Exception:
        return None
    data = get_item_data(name)
    if not data:
        return None
    r = data.get("rarity")
    if r is None:
        return None
    label, color = _RARITY_FR.get(int(r), ("Commun", "#BCC0C0"))
    return int(r), label, color


def _item_level(name: str) -> int | None:
    try:
        from core.item_icons import get_item_data
    except Exception:
        return None
    data = get_item_data(name)
    return data.get("level") if data else None


def _format_components(components: list[dict]) -> str:
    if not components:
        return "—"
    return "  ·  ".join(f"{c.get('qty', 1)}× {c.get('item', '')}" for c in components)


def _section_label(text: str) -> QLabel:
    lbl = QLabel(text)
    f = QFont(FONT_LABEL, 9)
    f.setBold(True)
    lbl.setFont(f)
    lbl.setStyleSheet(f"color: {TEAL}; background: transparent; letter-spacing: 2px;")
    return lbl


# ── Barre XP horizontale ─────────────────────────────────────────────────────

class _HorizXpBar(QWidget):
    def __init__(self, parent=None):
        super().__init__(parent)
        self._ratio: float = 0.0
        self.setFixedHeight(10)
        self.setSizePolicy(QSizePolicy.Expanding, QSizePolicy.Fixed)

    def set_ratio(self, ratio: float):
        self._ratio = max(0.0, min(1.0, float(ratio)))
        self.update()

    def paintEvent(self, event):
        p = QPainter(self)
        p.setRenderHint(QPainter.Antialiasing)
        w, h = self.width(), self.height()
        r = 5

        # Track
        p.setPen(Qt.NoPen)
        p.setBrush(QColor(BORDER))
        p.drawRoundedRect(0, 0, w, h, r, r)

        # Fill
        if self._ratio > 0:
            fill_w = max(2 * r, int(w * self._ratio))
            p.setBrush(QColor(TEAL))
            p.drawRoundedRect(0, 0, fill_w, h, r, r)

        p.end()


# ── Carte profession ──────────────────────────────────────────────────────────

class _ProfRow(QFrame):
    def __init__(self, name: str, job_id: int, on_edit, on_recipes, parent=None):
        super().__init__(parent)
        self.name = name
        self._on_edit = on_edit
        self._on_recipes = on_recipes

        self._xp_gained_session: int = 0
        self._session_start_ts: float | None = None
        self._last_xp_to_next: int = 0
        self._level = 1
        self._xp_remaining_manual = 0
        self._last_event_ts: str = ""

        self.setStyleSheet(f"""
            QFrame {{
                background: rgba(255,255,255,0.03);
                border: 1px solid {BORDER};
                border-radius: 10px;
            }}
            QFrame:hover {{
                background: rgba(255,255,255,0.06);
                border-color: {TEAL};
            }}
        """)
        self.setSizePolicy(QSizePolicy.Expanding, QSizePolicy.Fixed)
        self.setFixedHeight(110)
        self.setContextMenuPolicy(Qt.CustomContextMenu)
        self.customContextMenuRequested.connect(self._menu)

        outer = QHBoxLayout(self)
        outer.setContentsMargins(12, 10, 14, 10)
        outer.setSpacing(14)

        # Icône métier 48×48
        icon_lbl = QLabel()
        icon_lbl.setFixedSize(48, 48)
        icon_lbl.setAlignment(Qt.AlignCenter)
        icon_lbl.setStyleSheet("background: transparent;")
        pix = _job_pixmap(job_id, 48)
        if pix:
            icon_lbl.setPixmap(pix)
        else:
            icon_lbl.setText("⚙")
            icon_lbl.setStyleSheet(f"font-size:24px; background:transparent; color:{TEXT_DIM};")
        outer.addWidget(icon_lbl, 0, Qt.AlignVCenter)

        # Zone centrale
        center = QVBoxLayout()
        center.setSpacing(4)
        center.setContentsMargins(0, 0, 0, 0)

        # Ligne 1 : nom + niveau
        top_row = QHBoxLayout()
        top_row.setSpacing(8)

        self._name_lbl = QLabel(name)
        f_name = QFont(FONT_LABEL, 12)
        f_name.setBold(True)
        self._name_lbl.setFont(f_name)
        self._name_lbl.setStyleSheet(f"color: {TEXT}; background: transparent;")
        top_row.addWidget(self._name_lbl)
        top_row.addStretch()

        self._level_badge = QLabel("NIV 1")
        f_badge = QFont(FONT_LABEL, 11)
        f_badge.setBold(True)
        self._level_badge.setFont(f_badge)
        self._level_badge.setStyleSheet(f"color: {TEAL_BRIGHT}; background: transparent;")
        top_row.addWidget(self._level_badge)
        center.addLayout(top_row)

        # Ligne 2 : barre XP
        self._xp_bar = _HorizXpBar()
        center.addWidget(self._xp_bar)

        # Ligne 3 : XP/h  +  ETA
        bottom_row = QHBoxLayout()
        bottom_row.setSpacing(0)

        self._xph_lbl = QLabel("—")
        self._xph_lbl.setFont(QFont(FONT_LABEL, 9))
        self._xph_lbl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")
        bottom_row.addWidget(self._xph_lbl)
        bottom_row.addStretch()

        self._eta_lbl = QLabel("—")
        self._eta_lbl.setFont(QFont(FONT_LABEL, 9))
        self._eta_lbl.setStyleSheet(f"color: {TEAL_BRIGHT}; background: transparent;")
        bottom_row.addWidget(self._eta_lbl)
        center.addLayout(bottom_row)

        outer.addLayout(center, 1)

    # ── Interactions ──────────────────────────────────────────────────

    def mousePressEvent(self, event):
        if event.button() == Qt.LeftButton:
            self._on_recipes(self.name)
        super().mousePressEvent(event)

    def _menu(self, pos: QPoint):
        menu = QMenu(self)
        menu.setStyleSheet(f"""
            QMenu {{
                background: #1a2535; border: 1px solid {BORDER};
                color: {TEXT}; font-family: {FONT_LABEL}; font-size: 10px; padding: 4px;
            }}
            QMenu::item {{ padding: 4px 16px; border-radius: 4px; }}
            QMenu::item:selected {{ background: rgba(30,180,176,0.25); }}
        """)
        edit_act    = menu.addAction("✏  Éditer niveau / XP restante")
        recipes_act = menu.addAction("📋  Ouvrir les recettes")
        chosen = menu.exec_(self.mapToGlobal(pos))
        if chosen == edit_act:
            self._on_edit(self.name)
        elif chosen == recipes_act:
            self._on_recipes(self.name)

    # ── API ───────────────────────────────────────────────────────────

    def apply_manual_progress(self, level: int, xp_remaining: int):
        self._level = max(1, int(level))
        self._xp_remaining_manual = max(0, int(xp_remaining))
        self._last_xp_to_next = self._xp_remaining_manual or self._last_xp_to_next
        self._refresh()

    def on_xp_gain(self, xp_gain: int, xp_to_next: int, ts_now: float):
        if self._session_start_ts is None:
            self._session_start_ts = ts_now
        self._xp_gained_session += max(0, int(xp_gain))
        self._last_xp_to_next = max(0, int(xp_to_next or 0))
        self._refresh()

    def set_baseline(self, xp_to_next: int):
        self._last_xp_to_next = max(0, int(xp_to_next or 0))
        self._refresh()

    def set_tracking_snapshot(self, xp_gained: int, xp_to_next: int, event_count: int = 0, ts: str = ""):
        self._xp_gained_session = max(0, int(xp_gained or 0))
        self._last_xp_to_next   = max(0, int(xp_to_next or 0))
        self._last_event_ts     = str(ts or "")
        if event_count > 0 and self._session_start_ts is None:
            self._session_start_ts = time.time()
        self._refresh()

    def tick(self):
        self._refresh()

    # ── Rendu interne ─────────────────────────────────────────────────

    def _refresh(self):
        shown_remaining = (self._last_xp_to_next if self._last_xp_to_next > 0
                           else self._xp_remaining_manual)
        self._level_badge.setText(f"NIV {self._level}")

        # Barre XP
        if self._xp_gained_session > 0 and shown_remaining >= 0:
            total = self._xp_gained_session + shown_remaining
            ratio = self._xp_gained_session / total if total > 0 else 0.0
        else:
            ratio = 0.0
        self._xp_bar.set_ratio(ratio)

        elapsed = (time.time() - self._session_start_ts) if self._session_start_ts else 0
        if elapsed > 0 and self._xp_gained_session > 0:
            xph = int(self._xp_gained_session / elapsed * 3600)
            gained_str = f"+{_fmt_xp(self._xp_gained_session)} XP"
            xph_str    = f"{_fmt_xp(xph)} XP/h"
            self._xph_lbl.setText(f"{gained_str}  ·  {xph_str}")
            if shown_remaining > 0 and xph > 0:
                eta_s = shown_remaining / xph * 3600
                self._eta_lbl.setText(_fmt_duration(eta_s))
                self._eta_lbl.setStyleSheet(f"color: {TEAL_BRIGHT}; background: transparent;")
            else:
                self._eta_lbl.setText("—")
        else:
            if shown_remaining > 0:
                self._xph_lbl.setText(f"{_fmt_xp(shown_remaining)} restant")
                self._eta_lbl.setText("—")
                self._eta_lbl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")
            else:
                self._xph_lbl.setText("—")
                self._eta_lbl.setText("—")


# ── Constructeur de recette ───────────────────────────────────────────────────

class _RecipeBuilderDialog(QDialog):
    def __init__(self, profession: str, recipe_type: str, recipe: dict | None = None, parent=None):
        super().__init__(parent)
        self._profession   = profession
        self._recipe_type  = recipe_type
        self._recipe_id    = ""
        self._components: list[dict] = []

        self.setWindowTitle(f"Recette · {profession}")
        self.setMinimumWidth(560)
        self.setStyleSheet(
            f"background: #1a2535; color: {TEXT}; font-family: {FONT_LABEL}; font-size: 11px;"
        )

        root = QVBoxLayout(self)
        root.setSpacing(10)
        form = QFormLayout()
        form.setSpacing(8)

        self._output_item = QComboBox(self)
        self._output_item.setEditable(True)
        self._output_item.addItems(_all_items())
        self._output_item.setStyleSheet(
            f"background: #0d1520; color: {TEXT}; border: 1px solid {BORDER}; padding: 5px;"
        )

        self._output_qty = QSpinBox(self)
        self._output_qty.setRange(1, 999_999)
        self._output_qty.setStyleSheet(
            f"background: #0d1520; color: {TEXT}; border: 1px solid {BORDER}; padding: 5px;"
        )

        self._kind = QComboBox(self)
        self._kind.addItem("Recette entrante (matières)", "incoming")
        self._kind.addItem("Recette sortante (produit)", "outgoing")
        self._kind.setStyleSheet(
            f"background: #0d1520; color: {TEXT}; border: 1px solid {BORDER}; padding: 5px;"
        )

        form.addRow("Type", self._kind)
        form.addRow("Objet produit", self._output_item)
        form.addRow("Quantité produite", self._output_qty)
        root.addLayout(form)

        comp_lbl = QLabel("Composants")
        comp_lbl.setFont(QFont(FONT_LABEL, 10))
        comp_lbl.setStyleSheet(f"color: {TEAL}; background: transparent; letter-spacing: 1px;")
        root.addWidget(comp_lbl)

        self._components_list = QListWidget(self)
        self._components_list.setStyleSheet(
            f"background: #0d1520; color: {TEXT}; border: 1px solid {BORDER}; "
            f"font-size: 11px; padding: 2px;"
        )
        root.addWidget(self._components_list, 1)

        comp_actions = QHBoxLayout()
        for label, slot in [("+ Ajouter", self._add_component),
                             ("✏ Modifier", self._edit_component),
                             ("✕ Retirer", self._remove_component)]:
            btn = QPushButton(label, self)
            btn.setStyleSheet(
                f"background: #152235; color: {TEXT}; border: 1px solid {BORDER}; "
                f"padding: 6px 10px; border-radius: 4px;"
            )
            btn.clicked.connect(slot)
            comp_actions.addWidget(btn)
        comp_actions.addStretch()
        root.addLayout(comp_actions)

        buttons = QDialogButtonBox(QDialogButtonBox.Ok | QDialogButtonBox.Cancel, parent=self)
        buttons.setStyleSheet(f"color: {TEXT};")
        buttons.accepted.connect(self._on_accept)
        buttons.rejected.connect(self.reject)
        root.addWidget(buttons)

        if recipe:
            self._recipe_id = str(recipe.get("id", ""))
            self._output_item.setCurrentText(str(recipe.get("output_item", "")))
            self._output_qty.setValue(int(recipe.get("output_qty", 1) or 1))
            kind = "incoming" if recipe_type == "incoming" else "outgoing"
            self._kind.setCurrentIndex(0 if kind == "incoming" else 1)
            self._components = [
                {"item": str(c.get("item", "")).strip(), "qty": max(1, int(c.get("qty", 1) or 1))}
                for c in recipe.get("components", []) if isinstance(c, dict)
            ]
            self._refresh_components()
        else:
            self._kind.setCurrentIndex(0 if recipe_type == "incoming" else 1)

    def _refresh_components(self):
        self._components_list.clear()
        for c in self._components:
            it = QListWidgetItem(f"  {c['qty']}×  {c['item']}")
            it.setData(Qt.UserRole, c)
            self._components_list.addItem(it)

    def _pick_item_name(self, title: str, current: str = "") -> tuple[str, bool]:
        item_name, ok = QInputDialog.getItem(self, title, "Objet", _all_items(), editable=True)
        if ok and str(item_name).strip():
            return str(item_name).strip(), True
        if current.strip():
            return current.strip(), False
        return "", False

    def _add_component(self):
        item_name, ok = self._pick_item_name("Ajouter un composant")
        if not ok:
            return
        qty, ok_qty = QInputDialog.getInt(self, "Quantité", "Nombre", 1, 1, 999_999)
        if not ok_qty:
            return
        self._components.append({"item": item_name, "qty": qty})
        self._refresh_components()

    def _edit_component(self):
        row = self._components_list.currentRow()
        if row < 0 or row >= len(self._components):
            return
        current = self._components[row]
        item_name, ok = self._pick_item_name("Modifier composant", current=current["item"])
        if not ok:
            return
        qty, ok_qty = QInputDialog.getInt(self, "Quantité", "Nombre", int(current["qty"]), 1, 999_999)
        if not ok_qty:
            return
        self._components[row] = {"item": item_name, "qty": qty}
        self._refresh_components()

    def _remove_component(self):
        row = self._components_list.currentRow()
        if row < 0 or row >= len(self._components):
            return
        del self._components[row]
        self._refresh_components()

    def _on_accept(self):
        if not self._output_item.currentText().strip():
            QMessageBox.warning(self, "Recette", "Choisis l'objet produit.")
            return
        if not self._components:
            QMessageBox.warning(self, "Recette", "Ajoute au moins un composant.")
            return
        self.accept()

    def recipe_payload(self) -> tuple[str, dict]:
        recipe_type = self._kind.currentData() or "outgoing"
        payload = {
            "id":          self._recipe_id,
            "output_item": self._output_item.currentText().strip(),
            "output_qty":  int(self._output_qty.value()),
            "components":  list(self._components),
        }
        return recipe_type, payload


# ── Dialog recettes d'un métier ───────────────────────────────────────────────

_RECIPE_COLS = ["NIV", "OBJET", "RARETÉ", "XP", "COMPOSANTS"]


class _ProfessionRecipesDialog(QDialog):

    def __init__(self, profession: str, parent=None):
        super().__init__(parent)
        self._profession = profession
        self.setWindowTitle(f"Recettes · {profession}")
        self.setMinimumSize(1100, 700)
        self.setStyleSheet(
            f"background: #111d2e; color: {TEXT}; font-family: {FONT_LABEL}; font-size: 11px;"
        )

        root = QVBoxLayout(self)
        root.setContentsMargins(16, 14, 16, 14)
        root.setSpacing(10)

        # Barre de recherche
        self._search_bar = QLineEdit(self)
        self._search_bar.setPlaceholderText("Rechercher une recette…")
        self._search_bar.setStyleSheet(
            f"background: #0d1520; color: {TEXT}; border: 1px solid {BORDER}; "
            f"border-radius: 6px; padding: 7px 12px; font-size: 11px;"
        )
        self._search_bar.textChanged.connect(self._filter_table)
        root.addWidget(self._search_bar)

        # Table principale
        self._table = self._build_table()
        root.addWidget(self._table, 1)

        # Boutons bas
        actions = QHBoxLayout()
        add_btn = QPushButton("＋  Créer une recette", self)
        add_btn.setStyleSheet(
            f"background: rgba(30,180,176,0.15); color: {TEAL_BRIGHT}; "
            f"border: 1px solid {TEAL}; border-radius: 6px; padding: 7px 14px; font-size: 11px;"
        )
        add_btn.clicked.connect(lambda: self._create_recipe("outgoing"))
        actions.addWidget(add_btn)
        actions.addStretch()

        close_btn = QPushButton("Fermer", self)
        close_btn.setStyleSheet(
            f"background: #152235; color: {TEXT}; border: 1px solid {BORDER}; "
            f"border-radius: 6px; padding: 7px 14px; font-size: 11px;"
        )
        close_btn.clicked.connect(self.accept)
        actions.addWidget(close_btn)
        root.addLayout(actions)

        self._table.itemDoubleClicked.connect(lambda _: self._edit_selected())
        self._table.setContextMenuPolicy(Qt.CustomContextMenu)
        self._table.customContextMenuRequested.connect(self._recipe_menu)

        self._refresh_table()

    # ── Construction table ─────────────────────────────────────────────

    def _build_table(self) -> QTableWidget:
        t = QTableWidget(0, len(_RECIPE_COLS), self)
        t.setHorizontalHeaderLabels(_RECIPE_COLS)
        t.setSelectionBehavior(QTableWidget.SelectRows)
        t.setEditTriggers(QTableWidget.NoEditTriggers)
        t.setAlternatingRowColors(False)
        t.verticalHeader().setVisible(False)
        t.setSortingEnabled(True)
        t.setShowGrid(False)
        t.setIconSize(QSize(28, 28))
        t.setStyleSheet(f"""
            QTableWidget {{
                background: {_BG_ODD};
                color: {TEXT};
                border: none;
                font-size: 12px;
                outline: 0;
            }}
            QTableWidget::item {{
                padding: 0 6px;
                border-bottom: 1px solid rgba(255,255,255,0.04);
            }}
            QTableWidget::item:selected {{
                background: rgba(30,180,176,0.18);
                color: {TEXT};
            }}
            QHeaderView::section {{
                background: #0d1520;
                color: {TEXT_DIM};
                border: none;
                border-bottom: 1px solid {BORDER};
                padding: 6px 8px;
                font-size: 10px;
                font-weight: 700;
                letter-spacing: 1px;
            }}
        """)
        hdr = t.horizontalHeader()
        hdr.setSectionResizeMode(0, QHeaderView.ResizeToContents)  # NIV
        hdr.setSectionResizeMode(1, QHeaderView.Stretch)            # OBJET
        hdr.setSectionResizeMode(2, QHeaderView.ResizeToContents)  # RARETÉ
        hdr.setSectionResizeMode(3, QHeaderView.ResizeToContents)  # XP
        hdr.setSectionResizeMode(4, QHeaderView.Stretch)            # COMPOSANTS
        return t

    # ── Remplissage ────────────────────────────────────────────────────

    def _fill_table(self, rows: list[dict]):
        self._table.setSortingEnabled(False)
        self._table.setRowCount(len(rows))
        for ridx, rec in enumerate(rows):
            output_name = str(rec.get("output_item", ""))
            bg = QColor(_BG_ODD if ridx % 2 == 0 else _BG_EVEN)

            # NIV
            craft_level = rec.get("craft_level")
            niv_text = str(int(craft_level)) if craft_level is not None else "—"
            niv_item = QTableWidgetItem()
            niv_item.setData(Qt.DisplayRole, int(craft_level) if craft_level is not None else -1)
            niv_item.setText(niv_text)
            niv_item.setTextAlignment(Qt.AlignCenter | Qt.AlignVCenter)
            niv_item.setData(Qt.UserRole, rec)

            # OBJET — avec icône si disponible
            nom_item = QTableWidgetItem(output_name)
            nom_item.setTextAlignment(Qt.AlignLeft | Qt.AlignVCenter)
            icon_px = _item_icon(output_name, 28)
            if icon_px:
                from PyQt5.QtGui import QIcon
                nom_item.setIcon(QIcon(icon_px))

            # RARETÉ — texte coloré
            rarity_info = _item_rarity(output_name)
            if rarity_info:
                _, r_label, r_color = rarity_info
                rarity_item = QTableWidgetItem(r_label)
                rarity_item.setForeground(QColor(r_color))
            else:
                rarity = rec.get("rarity")
                if rarity is not None:
                    _, r_label, r_color = _RARITY_FR.get(int(rarity), ("Commun", "#BCC0C0"))[:2] + ("#BCC0C0",)
                    rarity_item = QTableWidgetItem(r_label)
                    rarity_item.setForeground(QColor(r_color))
                else:
                    rarity_item = QTableWidgetItem("—")
                    rarity_item.setForeground(QColor(TEXT_DIM))
            rarity_item.setTextAlignment(Qt.AlignCenter | Qt.AlignVCenter)

            # XP
            xp_val = rec.get("xp")
            xp_text = _fmt_xp(int(xp_val)) if xp_val is not None else "—"
            xp_item = QTableWidgetItem(xp_text)
            xp_item.setTextAlignment(Qt.AlignRight | Qt.AlignVCenter)
            xp_item.setForeground(QColor(TEAL_BRIGHT))

            # COMPOSANTS — texte compact, tooltip détaillé
            components = rec.get("components", [])
            short_comp = _format_components(components)
            comp_item = QTableWidgetItem(short_comp)
            comp_item.setForeground(QColor(TEXT_DIM))
            comp_item.setTextAlignment(Qt.AlignLeft | Qt.AlignVCenter)
            if len(components) > 2:
                tooltip_lines = "\n".join(
                    f"  {c.get('qty', 1)}×  {c.get('item', '')}" for c in components
                )
                comp_item.setToolTip(f"Composants :\n{tooltip_lines}")

            for cidx, cell in enumerate((niv_item, nom_item, rarity_item, xp_item, comp_item)):
                cell.setBackground(bg)
                self._table.setItem(ridx, cidx, cell)
            self._table.setRowHeight(ridx, 38)

        self._table.setSortingEnabled(True)
        self._table.sortByColumn(0, Qt.AscendingOrder)

    def _refresh_table(self):
        rows = list_recipes(self._profession, "outgoing")
        self._fill_table(rows)
        self._filter_table(self._search_bar.text())

    def _filter_table(self, text: str):
        query = text.strip().lower()
        for row in range(self._table.rowCount()):
            match = not query or any(
                self._table.item(row, col) and query in (self._table.item(row, col).text() or "").lower()
                for col in range(self._table.columnCount())
            )
            self._table.setRowHidden(row, not match)

    # ── Actions ────────────────────────────────────────────────────────

    def _selected_recipe(self) -> dict | None:
        row = self._table.currentRow()
        if row < 0:
            return None
        it = self._table.item(row, 0)
        if it is None:
            return None
        rec = it.data(Qt.UserRole)
        return rec if isinstance(rec, dict) else None

    def _create_recipe(self, recipe_type: str):
        dlg = _RecipeBuilderDialog(self._profession, recipe_type, parent=self)
        if dlg.exec_() != QDialog.Accepted:
            return
        real_type, payload = dlg.recipe_payload()
        upsert_recipe(self._profession, real_type, payload)
        self._refresh_table()

    def _edit_selected(self):
        rec = self._selected_recipe()
        if not rec:
            return
        dlg = _RecipeBuilderDialog(self._profession, "outgoing", rec, parent=self)
        if dlg.exec_() != QDialog.Accepted:
            return
        real_type, payload = dlg.recipe_payload()
        upsert_recipe(self._profession, real_type, payload)
        self._refresh_table()

    def _delete_selected(self):
        rec = self._selected_recipe()
        if not rec:
            return
        rid = str(rec.get("id", ""))
        if not rid:
            return
        answer = QMessageBox.question(self, "Supprimer", "Supprimer cette recette ?")
        if answer != QMessageBox.Yes:
            return
        delete_recipe(self._profession, "outgoing", rid)
        self._refresh_table()

    def _recipe_menu(self, pos: QPoint):
        menu = QMenu(self)
        menu.setStyleSheet(f"""
            QMenu {{
                background: #1a2535; border: 1px solid {BORDER};
                color: {TEXT}; font-family: {FONT_LABEL}; font-size: 10px; padding: 4px;
            }}
            QMenu::item {{ padding: 4px 16px; border-radius: 4px; }}
            QMenu::item:selected {{ background: rgba(30,180,176,0.25); }}
        """)
        edit_act = menu.addAction("✏  Modifier")
        del_act  = menu.addAction("🗑  Supprimer")
        chosen = menu.exec_(self._table.viewport().mapToGlobal(pos))
        if chosen == edit_act:
            self._edit_selected()
        elif chosen == del_act:
            self._delete_selected()


# ── Onglet Métiers ────────────────────────────────────────────────────────────

class MetiersTab(BaseTab):
    def __init__(self, parent: QWidget | None = None):
        super().__init__(parent)
        self._rows: dict[str, _ProfRow] = {}
        self._build_ui()

        self._tick_timer = QTimer(self)
        self._tick_timer.timeout.connect(self._on_tick)
        self._tick_timer.start(30_000)

        self._load_manual_states()

    def _build_ui(self):
        root = QVBoxLayout(self)
        root.setContentsMargins(16, 14, 16, 14)
        root.setSpacing(10)

        # En-tête
        hdr = QHBoxLayout()
        title = QLabel("Métiers")
        title.setFont(QFont(FONT_TITLE, 14))
        title.setStyleSheet(f"color: {TEAL_BRIGHT}; background: transparent;")
        hint = QLabel("Clic gauche : recettes  ·  Clic droit : édition")
        hint.setFont(QFont(FONT_LABEL, 9))
        hint.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")
        hdr.addWidget(title)
        hdr.addStretch()
        hdr.addWidget(hint, 0, Qt.AlignBottom)
        root.addLayout(hdr)

        sep = QFrame()
        sep.setFrameShape(QFrame.HLine)
        sep.setStyleSheet(f"color: {BORDER}; background: {BORDER}; max-height: 1px;")
        root.addWidget(sep)

        # Scroll area
        scroll = QScrollArea()
        scroll.setWidgetResizable(True)
        scroll.setFrameShape(QFrame.NoFrame)
        scroll.setHorizontalScrollBarPolicy(Qt.ScrollBarAlwaysOff)
        scroll.setStyleSheet("background: transparent;")

        inner = QWidget()
        inner.setStyleSheet("background: transparent;")
        inner_root = QVBoxLayout(inner)
        inner_root.setContentsMargins(0, 0, 0, 0)
        inner_root.setSpacing(0)

        columns = QHBoxLayout()
        columns.setSpacing(18)

        # ── Colonne Collecte ──
        left_vbox = QVBoxLayout()
        left_vbox.setSpacing(8)
        left_vbox.setContentsMargins(0, 0, 0, 0)
        left_vbox.addWidget(_section_label("COLLECTE"))

        for name, job_id in _PROFESSIONS:
            if name in _COLLECTE_NAMES:
                row = _ProfRow(name, job_id, self._edit_profession, self._open_recipes)
                left_vbox.addWidget(row)
                self._rows[name.lower()] = row
        left_vbox.addStretch()

        # ── Colonne Artisanat ──
        right_vbox = QVBoxLayout()
        right_vbox.setSpacing(8)
        right_vbox.setContentsMargins(0, 0, 0, 0)
        right_vbox.addWidget(_section_label("ARTISANAT"))

        artisanat_rows_layout = QVBoxLayout()
        artisanat_rows_layout.setSpacing(8)
        artisanat_rows_layout.setContentsMargins(0, 0, 0, 0)
        for name, job_id in _PROFESSIONS:
            if name in _ARTISANAT_NAMES:
                row = _ProfRow(name, job_id, self._edit_profession, self._open_recipes)
                artisanat_rows_layout.addWidget(row)
                self._rows[name.lower()] = row
        right_vbox.addLayout(artisanat_rows_layout)
        right_vbox.addStretch()

        self._rows_layout = artisanat_rows_layout

        columns.addLayout(left_vbox, 1)
        columns.addLayout(right_vbox, 1)
        inner_root.addLayout(columns)

        scroll.setWidget(inner)
        root.addWidget(scroll, 1)

    def _load_manual_states(self):
        for name, _ in _PROFESSIONS:
            st  = get_profession_state(name)
            row = self._rows.get(name.lower())
            if row:
                row.apply_manual_progress(st.get("level", 1), st.get("xp_remaining", 0))

    # ── Actions ───────────────────────────────────────────────────────

    def _edit_profession(self, profession_name: str):
        row = self._rows.get(profession_name.lower())
        if row is None:
            return
        st = get_profession_state(profession_name)

        dlg = QDialog(self)
        dlg.setWindowTitle(f"Éditer · {profession_name}")
        dlg.setStyleSheet(
            f"background: #1a2535; color: {TEXT}; font-family: {FONT_LABEL}; font-size: 11px;"
        )
        form = QFormLayout(dlg)
        form.setSpacing(10)

        level_spin = QSpinBox(dlg)
        level_spin.setRange(1, 260)
        level_spin.setValue(int(st.get("level", 1) or 1))
        level_spin.setStyleSheet(
            f"background: #0d1520; color: {TEXT}; border: 1px solid {BORDER}; padding: 5px;"
        )

        xp_spin = QSpinBox(dlg)
        xp_spin.setRange(0, 999_999_999)
        xp_spin.setValue(int(st.get("xp_remaining", 0) or 0))
        xp_spin.setStyleSheet(
            f"background: #0d1520; color: {TEXT}; border: 1px solid {BORDER}; padding: 5px;"
        )

        form.addRow("Niveau", level_spin)
        form.addRow("XP restante", xp_spin)

        btns = QDialogButtonBox(QDialogButtonBox.Ok | QDialogButtonBox.Cancel, parent=dlg)
        btns.setStyleSheet(f"color: {TEXT};")
        btns.accepted.connect(dlg.accept)
        btns.rejected.connect(dlg.reject)
        form.addRow(btns)

        if dlg.exec_() != QDialog.Accepted:
            return
        level       = int(level_spin.value())
        xp_remaining = int(xp_spin.value())
        set_profession_state(profession_name, level, xp_remaining)
        row.apply_manual_progress(level, xp_remaining)

    def _open_recipes(self, profession_name: str):
        dlg = _ProfessionRecipesDialog(profession_name, self)
        dlg.exec_()

    # ── API publique ──────────────────────────────────────────────────

    def load_history(self, profession_data: dict[str, dict]):
        for raw_name, info in profession_data.items():
            key = raw_name.lower()
            row = self._rows.get(key)
            if row is None:
                for k, r in self._rows.items():
                    if k in key or key in k:
                        row = r
                        break
            if row is None:
                row = _ProfRow(raw_name, 0, self._edit_profession, self._open_recipes)
                if hasattr(self, "_rows_layout"):
                    self._rows_layout.insertWidget(0, row)
                self._rows[key] = row

            xp_next   = int(info.get("xp_to_next", 0) or 0)
            xp_gained = int(info.get("xp_gained", info.get("xp", 0)) or 0)
            cnt       = int(info.get("count", 0) or 0)
            ts        = str(info.get("ts", ""))
            row.set_tracking_snapshot(xp_gained, xp_next, cnt, ts)

    def on_xp_profession(self, profession: str, xp_gain: int, xp_to_next: int):
        key = profession.lower().strip()
        row = self._rows.get(key)
        if row is None:
            for k, r in self._rows.items():
                if k in key or key in k:
                    row = r
                    break
        if row:
            row.on_xp_gain(xp_gain, xp_to_next, time.time())

    def apply_profession_calibration(self, profession: str, level: int, xp_gained: int, xp_to_next: int):
        key = profession.lower().strip()
        row = self._rows.get(key)
        if row is None:
            for k, r in self._rows.items():
                if k in key or key in k:
                    row = r
                    break
        if row is None:
            return
        set_profession_state(row.name, int(level), int(xp_to_next))
        row.apply_manual_progress(int(level), int(xp_to_next))
        if int(xp_gained) > 0:
            row.on_xp_gain(int(xp_gained), int(xp_to_next), time.time())

    def _on_tick(self):
        for row in self._rows.values():
            row.tick()
