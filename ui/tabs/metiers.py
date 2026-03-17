# ui/tabs/metiers.py — Onglet Métiers
# Suivi XP/h, édition progression, et gestion des recettes par métier.

from __future__ import annotations

import time

from PyQt5.QtWidgets import (
    QWidget,
    QVBoxLayout,
    QLabel,
    QFrame,
    QScrollArea,
    QSizePolicy,
    QGridLayout,
    QHBoxLayout,
    QMenu,
    QDialog,
    QFormLayout,
    QSpinBox,
    QDialogButtonBox,
    QPushButton,
    QTableWidget,
    QTableWidgetItem,
    QHeaderView,
    QMessageBox,
    QComboBox,
    QListWidget,
    QListWidgetItem,
    QInputDialog,
)
from PyQt5.QtCore import Qt, QTimer, QPoint
from PyQt5.QtGui import QFont

from ui.tabs.base import BaseTab
from ui.theme import (
    BORDER,
    TEAL,
    TEAL_BRIGHT,
    TEXT,
    TEXT_DIM,
    FONT_TITLE,
    FONT_LABEL,
)
from core.game_database import (
    set_profession_state,
    get_profession_state,
    list_recipes,
    upsert_recipe,
    delete_recipe,
    get_all_known_items,
)


_PROFESSIONS = [
    # Collecte
    ("Mineur", "⛏️"),
    ("Pêcheur", "🎣"),
    ("Trappeur", "🐾"),
    ("Herboriste", "🌿"),
    # Artisanat
    ("Armurier", "🛡️"),
    ("Bijoutier", "💍"),
    ("Boulanger", "🍞"),
    ("Cuisinier", "🍳"),
    ("Couturier", "🧵"),
    ("Maroquinier", "🎒"),
    ("Menuisier", "🪵"),
    ("Maître d'Armes", "⚔️"),
    ("Alchimiste", "⚗️"),
]

_ITEMS_CACHE: list[str] | None = None


def _all_items() -> list[str]:
    global _ITEMS_CACHE
    if _ITEMS_CACHE is None:
        _ITEMS_CACHE = get_all_known_items()
    return _ITEMS_CACHE


def _fmt_duration(seconds: float) -> str:
    if seconds <= 0:
        return "—"
    s = int(seconds)
    if s < 60:
        return f"{s}s"
    h, r = divmod(s, 3600)
    m, _ = divmod(r, 60)
    if h >= 24:
        return f"{h//24}j{h%24}h"
    if h:
        return f"{h}h{m:02d}"
    return f"{m}min"


def _fmt_xp(v: int) -> str:
    if v >= 1_000_000_000:
        return f"{v/1_000_000_000:.2f}G"
    if v >= 1_000_000:
        return f"{v/1_000_000:.1f}M"
    if v >= 1_000:
        return f"{v//1_000}K"
    return str(v)


def _format_components(components: list[dict]) -> str:
    if not components:
        return "—"
    return " + ".join(f"{c.get('qty', 1)}x {c.get('item', '')}" for c in components)


class _RecipeBuilderDialog(QDialog):
    def __init__(self, profession: str, recipe_type: str, recipe: dict | None = None, parent=None):
        super().__init__(parent)
        self._profession = profession
        self._recipe_type = recipe_type
        self._recipe_id = ""
        self._components: list[dict] = []

        self.setWindowTitle(f"Recette · {profession}")
        self.setMinimumWidth(520)
        self.setStyleSheet(f"background: #1a2535; color: {TEXT}; font-family: {FONT_LABEL};")

        root = QVBoxLayout(self)
        form = QFormLayout()

        self._output_item = QComboBox(self)
        self._output_item.setEditable(True)
        self._output_item.addItems(_all_items())
        self._output_item.setStyleSheet(f"background: #0d1520; color: {TEXT}; border: 1px solid {BORDER}; padding: 4px;")

        self._output_qty = QSpinBox(self)
        self._output_qty.setRange(1, 999_999)
        self._output_qty.setStyleSheet(f"background: #0d1520; color: {TEXT}; border: 1px solid {BORDER}; padding: 4px;")

        self._kind = QComboBox(self)
        self._kind.addItem("Recette entrante (matières)", "incoming")
        self._kind.addItem("Recette sortante (produit)", "outgoing")
        self._kind.setStyleSheet(f"background: #0d1520; color: {TEXT}; border: 1px solid {BORDER}; padding: 4px;")

        form.addRow("Type", self._kind)
        form.addRow("Objet produit", self._output_item)
        form.addRow("Quantité produite", self._output_qty)
        root.addLayout(form)

        self._components_list = QListWidget(self)
        self._components_list.setStyleSheet(f"background: #0d1520; color: {TEXT}; border: 1px solid {BORDER};")
        root.addWidget(QLabel("Composants"))
        root.addWidget(self._components_list, 1)

        comp_actions = QHBoxLayout()
        add_btn = QPushButton("Ajouter composant", self)
        edit_btn = QPushButton("Modifier", self)
        del_btn = QPushButton("Retirer", self)
        for btn in (add_btn, edit_btn, del_btn):
            btn.setStyleSheet(f"background: #152235; color: {TEXT}; border: 1px solid {BORDER}; padding: 5px 8px;")
        comp_actions.addWidget(add_btn)
        comp_actions.addWidget(edit_btn)
        comp_actions.addWidget(del_btn)
        comp_actions.addStretch()
        root.addLayout(comp_actions)

        buttons = QDialogButtonBox(QDialogButtonBox.Ok | QDialogButtonBox.Cancel, parent=self)
        buttons.accepted.connect(self._on_accept)
        buttons.rejected.connect(self.reject)
        root.addWidget(buttons)

        add_btn.clicked.connect(self._add_component)
        edit_btn.clicked.connect(self._edit_component)
        del_btn.clicked.connect(self._remove_component)

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
            item = QListWidgetItem(f"{c['qty']}x {c['item']}")
            item.setData(Qt.UserRole, c)
            self._components_list.addItem(item)

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
        output_item = self._output_item.currentText().strip()
        if not output_item:
            QMessageBox.warning(self, "Recette", "Choisis l'objet produit.")
            return
        if not self._components:
            QMessageBox.warning(self, "Recette", "Ajoute au moins un composant.")
            return
        self.accept()

    def recipe_payload(self) -> tuple[str, dict]:
        recipe_type = self._kind.currentData() or "outgoing"
        payload = {
            "id": self._recipe_id,
            "output_item": self._output_item.currentText().strip(),
            "output_qty": int(self._output_qty.value()),
            "components": list(self._components),
        }
        return recipe_type, payload


class _ProfessionRecipesDialog(QDialog):
    _PAGE_SIZE = 8

    def __init__(self, profession: str, parent=None):
        super().__init__(parent)
        self._profession = profession
        self._incoming_page = 0
        self._outgoing_page = 0

        self.setWindowTitle(f"Métiers · {profession}")
        self.setMinimumSize(920, 600)
        self.setStyleSheet(f"background: #1a2535; color: {TEXT}; font-family: {FONT_LABEL};")

        root = QVBoxLayout(self)

        self._incoming_table, self._incoming_prev, self._incoming_next, self._incoming_lbl, add_incoming = self._build_table_block(
            "Recettes entrantes (matières)", "incoming"
        )
        self._outgoing_table, self._outgoing_prev, self._outgoing_next, self._outgoing_lbl, add_outgoing = self._build_table_block(
            "Recettes sortantes (produits)", "outgoing"
        )

        root.addWidget(self._wrap_block("Entrantes", self._incoming_table, self._incoming_prev, self._incoming_next, self._incoming_lbl, add_incoming))
        root.addWidget(self._wrap_block("Sortantes", self._outgoing_table, self._outgoing_prev, self._outgoing_next, self._outgoing_lbl, add_outgoing))

        close_btn = QPushButton("Fermer", self)
        close_btn.setStyleSheet(f"background: #152235; color: {TEXT}; border: 1px solid {BORDER}; padding: 6px 10px;")
        close_btn.clicked.connect(self.accept)
        root.addWidget(close_btn, 0, Qt.AlignRight)

        add_incoming.clicked.connect(lambda: self._create_recipe("incoming"))
        add_outgoing.clicked.connect(lambda: self._create_recipe("outgoing"))

        self._incoming_prev.clicked.connect(lambda: self._change_page("incoming", -1))
        self._incoming_next.clicked.connect(lambda: self._change_page("incoming", +1))
        self._outgoing_prev.clicked.connect(lambda: self._change_page("outgoing", -1))
        self._outgoing_next.clicked.connect(lambda: self._change_page("outgoing", +1))

        self._incoming_table.itemDoubleClicked.connect(lambda _: self._edit_selected("incoming"))
        self._outgoing_table.itemDoubleClicked.connect(lambda _: self._edit_selected("outgoing"))

        self._incoming_table.setContextMenuPolicy(Qt.CustomContextMenu)
        self._outgoing_table.setContextMenuPolicy(Qt.CustomContextMenu)
        self._incoming_table.customContextMenuRequested.connect(lambda pos: self._recipe_menu("incoming", pos))
        self._outgoing_table.customContextMenuRequested.connect(lambda pos: self._recipe_menu("outgoing", pos))

        self._refresh_tables()

    def _build_table_block(self, title: str, recipe_type: str):
        table = QTableWidget(0, 3, self)
        table.setHorizontalHeaderLabels(["Produit", "Qté", "Composants"])
        table.setSelectionBehavior(QTableWidget.SelectRows)
        table.setEditTriggers(QTableWidget.NoEditTriggers)
        table.setAlternatingRowColors(True)
        table.verticalHeader().setVisible(False)
        table.horizontalHeader().setSectionResizeMode(0, QHeaderView.ResizeToContents)
        table.horizontalHeader().setSectionResizeMode(1, QHeaderView.ResizeToContents)
        table.horizontalHeader().setSectionResizeMode(2, QHeaderView.Stretch)
        table.setStyleSheet(f"background: #0d1520; color: {TEXT}; border: 1px solid {BORDER};")

        prev_btn = QPushButton("◀", self)
        next_btn = QPushButton("▶", self)
        page_lbl = QLabel("Page 1/1", self)
        add_btn = QPushButton("Créer une recette", self)

        for btn in (prev_btn, next_btn, add_btn):
            btn.setStyleSheet(f"background: #152235; color: {TEXT}; border: 1px solid {BORDER}; padding: 5px 8px;")

        return table, prev_btn, next_btn, page_lbl, add_btn

    def _wrap_block(self, block_title: str, table: QTableWidget, prev_btn: QPushButton, next_btn: QPushButton, page_lbl: QLabel, add_btn: QPushButton) -> QWidget:
        box = QFrame(self)
        box.setStyleSheet(f"QFrame{{background: rgba(255,255,255,0.02); border: 1px solid {BORDER}; border-radius: 8px;}}")
        lay = QVBoxLayout(box)

        title = QLabel(block_title, box)
        title.setStyleSheet(f"color: {TEAL_BRIGHT}; font-weight: 700;")
        lay.addWidget(title)
        lay.addWidget(table, 1)

        actions = QHBoxLayout()
        actions.addWidget(add_btn)
        actions.addStretch()
        actions.addWidget(prev_btn)
        actions.addWidget(page_lbl)
        actions.addWidget(next_btn)
        lay.addLayout(actions)
        return box

    def _change_page(self, recipe_type: str, delta: int):
        if recipe_type == "incoming":
            self._incoming_page = max(0, self._incoming_page + delta)
        else:
            self._outgoing_page = max(0, self._outgoing_page + delta)
        self._refresh_tables()

    def _rows_for_page(self, recipes: list[dict], page: int) -> tuple[list[dict], int, int]:
        total_pages = max(1, (len(recipes) + self._PAGE_SIZE - 1) // self._PAGE_SIZE)
        page = min(page, total_pages - 1)
        start = page * self._PAGE_SIZE
        end = start + self._PAGE_SIZE
        return recipes[start:end], page, total_pages

    def _fill_table(self, table: QTableWidget, rows: list[dict]):
        table.setRowCount(len(rows))
        for ridx, rec in enumerate(rows):
            item0 = QTableWidgetItem(str(rec.get("output_item", "")))
            item1 = QTableWidgetItem(str(rec.get("output_qty", 1)))
            item2 = QTableWidgetItem(_format_components(rec.get("components", [])))
            item0.setData(Qt.UserRole, rec)
            for cidx, item in enumerate((item0, item1, item2)):
                table.setItem(ridx, cidx, item)

    def _refresh_tables(self):
        incoming = list_recipes(self._profession, "incoming")
        outgoing = list_recipes(self._profession, "outgoing")

        incoming_rows, incoming_page, incoming_total = self._rows_for_page(incoming, self._incoming_page)
        outgoing_rows, outgoing_page, outgoing_total = self._rows_for_page(outgoing, self._outgoing_page)

        self._incoming_page = incoming_page
        self._outgoing_page = outgoing_page

        self._fill_table(self._incoming_table, incoming_rows)
        self._fill_table(self._outgoing_table, outgoing_rows)

        self._incoming_lbl.setText(f"Page {incoming_page + 1}/{incoming_total}")
        self._outgoing_lbl.setText(f"Page {outgoing_page + 1}/{outgoing_total}")

        self._incoming_prev.setEnabled(incoming_page > 0)
        self._incoming_next.setEnabled((incoming_page + 1) < incoming_total)
        self._outgoing_prev.setEnabled(outgoing_page > 0)
        self._outgoing_next.setEnabled((outgoing_page + 1) < outgoing_total)

    def _selected_recipe(self, recipe_type: str) -> dict | None:
        table = self._incoming_table if recipe_type == "incoming" else self._outgoing_table
        row = table.currentRow()
        if row < 0:
            return None
        item = table.item(row, 0)
        if item is None:
            return None
        rec = item.data(Qt.UserRole)
        return rec if isinstance(rec, dict) else None

    def _create_recipe(self, recipe_type: str):
        dlg = _RecipeBuilderDialog(self._profession, recipe_type, parent=self)
        if dlg.exec_() != QDialog.Accepted:
            return
        real_type, payload = dlg.recipe_payload()
        upsert_recipe(self._profession, real_type, payload)
        self._refresh_tables()

    def _edit_selected(self, recipe_type: str):
        rec = self._selected_recipe(recipe_type)
        if not rec:
            return
        dlg = _RecipeBuilderDialog(self._profession, recipe_type, rec, parent=self)
        if dlg.exec_() != QDialog.Accepted:
            return
        real_type, payload = dlg.recipe_payload()
        upsert_recipe(self._profession, real_type, payload)
        self._refresh_tables()

    def _delete_selected(self, recipe_type: str):
        rec = self._selected_recipe(recipe_type)
        if not rec:
            return
        rid = str(rec.get("id", ""))
        if not rid:
            return
        answer = QMessageBox.question(self, "Supprimer", "Supprimer cette recette ?")
        if answer != QMessageBox.Yes:
            return
        delete_recipe(self._profession, recipe_type, rid)
        self._refresh_tables()

    def _recipe_menu(self, recipe_type: str, pos: QPoint):
        table = self._incoming_table if recipe_type == "incoming" else self._outgoing_table
        menu = QMenu(self)
        edit_act = menu.addAction("Modifier")
        del_act = menu.addAction("Supprimer")
        chosen = menu.exec_(table.viewport().mapToGlobal(pos))
        if chosen == edit_act:
            self._edit_selected(recipe_type)
        elif chosen == del_act:
            self._delete_selected(recipe_type)


class _ProfRow(QFrame):
    def __init__(self, name: str, icon: str, on_edit, on_recipes, parent=None):
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
                background: rgba(255,255,255,0.02);
                border: 1px solid {BORDER};
                border-radius: 8px;
            }}
            QFrame:hover {{
                background: rgba(255,255,255,0.04);
                border-color: {TEAL};
            }}
        """)
        self.setSizePolicy(QSizePolicy.Expanding, QSizePolicy.Fixed)
        self.setMinimumHeight(56)
        self.setContextMenuPolicy(Qt.CustomContextMenu)
        self.customContextMenuRequested.connect(self._menu)

        lay = QGridLayout(self)
        lay.setContentsMargins(10, 6, 10, 6)
        lay.setHorizontalSpacing(10)
        lay.setVerticalSpacing(2)

        icon_lbl = QLabel(icon)
        icon_lbl.setStyleSheet("font-size: 16px; background: transparent;")
        icon_lbl.setFixedWidth(22)
        lay.addWidget(icon_lbl, 0, 0, 3, 1, Qt.AlignCenter)

        self._name_lbl = QLabel(name)
        self._name_lbl.setFont(QFont(FONT_LABEL, 10))
        self._name_lbl.setStyleSheet(f"color: {TEXT}; background: transparent;")
        lay.addWidget(self._name_lbl, 0, 1, Qt.AlignLeft | Qt.AlignBottom)

        self._progress_lbl = QLabel("Niv 1 · 0 restant")
        self._progress_lbl.setFont(QFont(FONT_LABEL, 9))
        self._progress_lbl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")
        lay.addWidget(self._progress_lbl, 1, 1, Qt.AlignLeft | Qt.AlignTop)

        self._xph_lbl = QLabel("—")
        self._xph_lbl.setFont(QFont(FONT_LABEL, 9))
        self._xph_lbl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")
        lay.addWidget(self._xph_lbl, 2, 1, Qt.AlignLeft | Qt.AlignTop)

        self._eta_lbl = QLabel("—")
        self._eta_lbl.setFont(QFont(FONT_LABEL, 10))
        self._eta_lbl.setStyleSheet(f"color: {TEAL_BRIGHT}; background: transparent;")
        self._eta_lbl.setAlignment(Qt.AlignRight | Qt.AlignVCenter)
        lay.addWidget(self._eta_lbl, 0, 2, 3, 1, Qt.AlignRight | Qt.AlignVCenter)

        lay.setColumnStretch(1, 1)

    def mousePressEvent(self, event):
        if event.button() == Qt.LeftButton:
            self._on_recipes(self.name)
        super().mousePressEvent(event)

    def _menu(self, pos: QPoint):
        menu = QMenu(self)
        edit_act = menu.addAction("Éditer niveau / XP restante")
        recipes_act = menu.addAction("Ouvrir recettes")
        chosen = menu.exec_(self.mapToGlobal(pos))
        if chosen == edit_act:
            self._on_edit(self.name)
        elif chosen == recipes_act:
            self._on_recipes(self.name)

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
        self._last_xp_to_next = max(0, int(xp_to_next or 0))
        self._last_event_ts = str(ts or "")
        if event_count > 0 and self._session_start_ts is None:
            self._session_start_ts = time.time()
        self._refresh()

    def tick(self):
        self._refresh()

    def _refresh(self):
        shown_remaining = self._last_xp_to_next if self._last_xp_to_next > 0 else self._xp_remaining_manual
        self._progress_lbl.setText(f"Niv {self._level} · {_fmt_xp(shown_remaining)} restant")

        elapsed = (time.time() - self._session_start_ts) if self._session_start_ts else 0
        if elapsed > 0 and self._xp_gained_session > 0:
            xph = int(self._xp_gained_session / elapsed * 3600)
            if self._last_event_ts:
                self._xph_lbl.setText(f"+{_fmt_xp(self._xp_gained_session)} XP · {_fmt_xp(xph)} XP/h")
            else:
                self._xph_lbl.setText(f"{_fmt_xp(xph)} XP/h")
            if shown_remaining > 0 and xph > 0:
                eta_s = shown_remaining / xph * 3600
                self._eta_lbl.setText(_fmt_duration(eta_s))
                self._eta_lbl.setStyleSheet(f"color: {TEAL_BRIGHT}; background: transparent;")
            else:
                self._eta_lbl.setText("—")
        else:
            self._xph_lbl.setText("—")
            if shown_remaining > 0:
                self._eta_lbl.setText(f"{_fmt_xp(shown_remaining)} restant")
                self._eta_lbl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")
            else:
                self._eta_lbl.setText("—")


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
        root.setContentsMargins(18, 14, 18, 14)
        root.setSpacing(8)

        hdr = QHBoxLayout()
        title = QLabel("Métiers")
        title.setFont(QFont(FONT_TITLE, 14))
        title.setStyleSheet(f"color: {TEAL_BRIGHT}; background: transparent;")
        hint = QLabel("Clic droit: édition · Clic gauche: recettes")
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

        scroll = QScrollArea()
        scroll.setWidgetResizable(True)
        scroll.setFrameShape(QFrame.NoFrame)
        scroll.setHorizontalScrollBarPolicy(Qt.ScrollBarAlwaysOff)
        scroll.setStyleSheet("background: transparent;")

        inner = QWidget()
        inner.setStyleSheet("background: transparent;")
        vlay = QVBoxLayout(inner)
        self._rows_layout = vlay
        vlay.setContentsMargins(0, 0, 0, 0)
        vlay.setSpacing(4)

        for name, icon in _PROFESSIONS:
            row = _ProfRow(name, icon, self._edit_profession, self._open_recipes)
            vlay.addWidget(row)
            self._rows[name.lower()] = row

        vlay.addStretch()
        scroll.setWidget(inner)
        root.addWidget(scroll, 1)

    def _load_manual_states(self):
        for name, _ in _PROFESSIONS:
            st = get_profession_state(name)
            row = self._rows.get(name.lower())
            if row:
                row.apply_manual_progress(st.get("level", 1), st.get("xp_remaining", 0))

    def _edit_profession(self, profession_name: str):
        row = self._rows.get(profession_name.lower())
        if row is None:
            return

        st = get_profession_state(profession_name)

        dlg = QDialog(self)
        dlg.setWindowTitle(f"Éditer métier · {profession_name}")
        dlg.setStyleSheet(f"background: #1a2535; color: {TEXT}; font-family: {FONT_LABEL};")
        form = QFormLayout(dlg)

        level_spin = QSpinBox(dlg)
        level_spin.setRange(1, 260)
        level_spin.setValue(int(st.get("level", 1) or 1))
        level_spin.setStyleSheet(f"background: #0d1520; color: {TEXT}; border: 1px solid {BORDER}; padding: 4px;")

        xp_spin = QSpinBox(dlg)
        xp_spin.setRange(0, 999_999_999)
        xp_spin.setValue(int(st.get("xp_remaining", 0) or 0))
        xp_spin.setStyleSheet(f"background: #0d1520; color: {TEXT}; border: 1px solid {BORDER}; padding: 4px;")

        form.addRow("Niveau", level_spin)
        form.addRow("XP restante", xp_spin)

        btns = QDialogButtonBox(QDialogButtonBox.Ok | QDialogButtonBox.Cancel, parent=dlg)
        btns.accepted.connect(dlg.accept)
        btns.rejected.connect(dlg.reject)
        form.addRow(btns)

        if dlg.exec_() != QDialog.Accepted:
            return

        level = int(level_spin.value())
        xp_remaining = int(xp_spin.value())
        set_profession_state(profession_name, level, xp_remaining)
        row.apply_manual_progress(level, xp_remaining)

    def _open_recipes(self, profession_name: str):
        dlg = _ProfessionRecipesDialog(profession_name, self)
        dlg.exec_()

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
                row = _ProfRow(raw_name, "🛠", self._edit_profession, self._open_recipes)
                if hasattr(self, "_rows_layout"):
                    self._rows_layout.insertWidget(0, row)
                self._rows[key] = row

            xp_next = int(info.get("xp_to_next", 0) or 0)
            xp_gained = int(info.get("xp_gained", info.get("xp", 0)) or 0)
            cnt = int(info.get("count", 0) or 0)
            ts = str(info.get("ts", ""))
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
