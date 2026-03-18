# ui/tabs/inventaire.py — Onglet Inventaire
# Grille d'objets collectés triés par catégorie/niveau/rareté.
# Chaque case affiche l'icône réelle + bordure rareté animée (spritesheet 60×246, 4 frames).

from __future__ import annotations

from pathlib import Path

from PyQt5.QtCore import (
    QObject, QPoint, QRect, QSize, Qt, QTimer,
)
from PyQt5.QtGui import QColor, QFont, QFontMetrics, QPainter, QPixmap
from PyQt5.QtWidgets import (
    QDialog, QDialogButtonBox, QFormLayout, QFrame, QHBoxLayout,
    QInputDialog, QLabel, QLineEdit, QMenu, QScrollArea,
    QSizePolicy, QSpinBox, QVBoxLayout, QWidget,
)

from ui.tabs.base import BaseTab
from ui.theme import (
    BORDER, TEAL, TEAL_BRIGHT,
    TEXT, TEXT_DIM, FONT_TITLE, FONT_LABEL, BG,
)

_PROJECT_ROOT      = Path(__file__).resolve().parents[2]
_BORDER_DIR        = _PROJECT_ROOT / "ui" / "assets" / "theme" / "images" / "pictos"
_OFFICIAL_ICON_DIR = _PROJECT_ROOT / "data" / "ankama_official" / "wakassets" / "items"
_CDN_ICON_DIR      = _PROJECT_ROOT / "data" / "ankama_cdn" / "item_icons"

_CELL     = 60    # taille d'une case (px)
_GAP      = 6     # espacement entre cases
_FRAME_H  = 60    # hauteur d'un frame dans le spritesheet
_N_FRAMES = 4     # nombre de frames d'animation
_ANIM_MS  = 600   # intervalle entre frames (ms)

# Rareté → nom du fichier de bordure
_RARITY_BORDER: dict[int, str] = {
    0: "RarityBorder-Old.png",
    1: "RarityBorder-Common.png",
    2: "RarityBorder-Rare.png",
    3: "RarityBorder-Mythic.png",
    4: "RarityBorder-Legendary.png",
    5: "RarityBorder-Relic.png",
    6: "RarityBorder-Memory.png",
    7: "RarityBorder-Epic.png",
}

_RARITY_LABEL: dict[int, str] = {
    0: "Ancien", 1: "Commun", 2: "Rare", 3: "Mythique",
    4: "Légendaire", 5: "Relique", 6: "Souvenir", 7: "Épique",
}

# Cache des spritesheets découpés : rarity → liste de 4 QPixmap (60×60)
_BORDER_FRAMES_CACHE: dict[int, list[QPixmap]] = {}


def _get_border_frames(rarity: int) -> list[QPixmap] | None:
    if rarity in _BORDER_FRAMES_CACHE:
        return _BORDER_FRAMES_CACHE[rarity]
    fname = _RARITY_BORDER.get(rarity)
    if fname is None:
        return None
    path = _BORDER_DIR / fname
    if not path.exists():
        return None
    sheet = QPixmap(str(path))
    if sheet.isNull():
        return None
    frames = [sheet.copy(QRect(0, i * _FRAME_H, _CELL, _FRAME_H)) for i in range(_N_FRAMES)]
    _BORDER_FRAMES_CACHE[rarity] = frames
    return frames


def _load_item_icon_sync(gfx_id: int) -> QPixmap | None:
    """Charge l'icône depuis les assets officiels (>10k), fallback CDN."""
    for d in (_OFFICIAL_ICON_DIR, _CDN_ICON_DIR):
        p = d / f"{gfx_id}.png"
        if p.exists():
            px = QPixmap(str(p))
            if not px.isNull():
                return px.scaled(_CELL - 8, _CELL - 8, Qt.KeepAspectRatio, Qt.SmoothTransformation)
    return None


def _fmt_qty(v: int) -> str:
    if v >= 1_000_000:
        return f"{v / 1_000_000:.1f}M"
    if v >= 1_000:
        return f"{v // 1_000}k"
    return str(v)


def _item_color(name: str) -> QColor:
    h = 0
    for c in name:
        h = (h * 31 + ord(c)) & 0xFFFF
    return QColor.fromHsv(h % 360, 110, 130)


# ── Contrôleur d'animation global ────────────────────────────────────────────

class _AnimCtrl(QObject):
    """Timer partagé — toutes les cases se synchronisent sur ce seul tick."""

    _inst: "_AnimCtrl | None" = None

    @classmethod
    def instance(cls) -> "_AnimCtrl":
        if cls._inst is None:
            cls._inst = cls()
        return cls._inst

    def __init__(self):
        super().__init__()
        self._frame = 0
        self._cells: set["_ItemCell"] = set()
        self._timer = QTimer(self)
        self._timer.timeout.connect(self._tick)
        self._timer.start(_ANIM_MS)

    def register(self, cell: "_ItemCell"):
        self._cells.add(cell)

    def unregister(self, cell: "_ItemCell"):
        self._cells.discard(cell)

    def _tick(self):
        self._frame = (self._frame + 1) % _N_FRAMES
        dead: set["_ItemCell"] = set()
        for cell in self._cells:
            try:
                cell.update()
            except RuntimeError:
                dead.add(cell)
        self._cells -= dead

    @property
    def frame(self) -> int:
        return self._frame


# ── Case objet ────────────────────────────────────────────────────────────────

class _ItemCell(QWidget):
    def __init__(self, name: str, qty: int, tab: "InventaireTab", parent=None):
        super().__init__(parent)
        self.name              = name
        self.qty               = qty
        self._tab              = tab
        self._icon_px: QPixmap | None = None
        self._gfx_id:  int | None     = None
        self._rarity:  int | None     = None
        self._level:   int | None     = None
        self._category: str           = ""
        self._fallback_color          = _item_color(name)

        self.setFixedSize(_CELL, _CELL)
        self.setToolTip(self._make_tooltip())
        self.setContextMenuPolicy(Qt.CustomContextMenu)
        self.customContextMenuRequested.connect(self._on_context)

        self._load_meta()
        _AnimCtrl.instance().register(self)

    def _load_meta(self):
        try:
            from core.item_icons import get_gfx_id, get_item_data, ItemIconService
        except Exception:
            return

        gfx = get_gfx_id(self.name)
        self._gfx_id = gfx

        data = get_item_data(self.name)
        if data:
            r = data.get("rarity")
            self._rarity = int(r) if r is not None else None
            self._level  = data.get("level")

        if gfx is not None:
            px = _load_item_icon_sync(gfx)
            if px:
                self._icon_px = px
            else:
                svc = ItemIconService.instance()
                svc.icon_ready.connect(self._on_icon_ready)
                svc.request(gfx, _CELL - 8)

    def _on_icon_ready(self, gfx_id: int, px: QPixmap):
        if gfx_id == self._gfx_id and self._icon_px is None:
            self._icon_px = px.scaled(
                _CELL - 8, _CELL - 8, Qt.KeepAspectRatio, Qt.SmoothTransformation
            )
            self.update()

    def update_qty(self, qty: int):
        self.qty = qty
        self.setToolTip(self._make_tooltip())
        self.update()

    def matches(self, query: str) -> bool:
        return query.lower() in self.name.lower()

    def _make_tooltip(self) -> str:
        lines = [self.name, f"×{self.qty:,}".replace(",", "\u202f")]
        if self._level is not None:
            lines.append(f"Niveau {self._level}")
        if self._rarity is not None:
            lines.append(_RARITY_LABEL.get(self._rarity, "Commun"))
        if self._category:
            lines.append(self._category)
        return "\n".join(lines)

    # ── Rendu ─────────────────────────────────────────────────────────

    def paintEvent(self, _):
        p = QPainter(self)
        p.setRenderHint(QPainter.Antialiasing)
        r = self.rect().adjusted(1, 1, -1, -1)

        # Fond semi-transparent
        p.setBrush(QColor(0, 0, 0, 120))
        p.setPen(Qt.NoPen)
        p.drawRoundedRect(r, 6, 6)

        # Icône ou fallback initiales
        if self._icon_px and not self._icon_px.isNull():
            iw, ih = self._icon_px.width(), self._icon_px.height()
            p.drawPixmap((_CELL - iw) // 2, (_CELL - ih) // 2, self._icon_px)
        else:
            from PyQt5.QtGui import QPen as _QPen
            col = QColor(self._fallback_color)
            col.setAlpha(80)
            p.setBrush(col)
            bc = QColor(self._fallback_color)
            bc.setAlpha(140)
            p.setPen(_QPen(bc, 1))
            p.drawRoundedRect(r, 6, 6)
            words = [w for w in self.name.split() if w]
            initials = (
                (words[0][0] + words[1][0]).upper() if len(words) >= 2
                else self.name[:2].upper()
            )
            p.setPen(QColor(TEXT))
            font = QFont(FONT_LABEL, 13)
            font.setWeight(QFont.Bold)
            p.setFont(font)
            p.drawText(QRect(0, 4, _CELL, _CELL - 18), Qt.AlignCenter, initials)

        # Bordure rareté animée
        if self._rarity is not None:
            frames = _get_border_frames(self._rarity)
            if frames:
                p.drawPixmap(0, 0, frames[_AnimCtrl.instance().frame])

        # Badge quantité (bas-droite)
        qty_str = _fmt_qty(self.qty)
        p.setFont(QFont(FONT_LABEL, 7))
        fm = QFontMetrics(p.font())
        bw = fm.horizontalAdvance(qty_str) + 6
        bh = 13
        bx = r.right() - bw + 1
        by = r.bottom() - bh + 1
        p.setBrush(QColor(0, 0, 0, 180))
        p.setPen(Qt.NoPen)
        p.drawRoundedRect(QRect(bx, by, bw, bh), 3, 3)
        p.setPen(QColor(TEAL_BRIGHT))
        p.drawText(QRect(bx, by, bw, bh), Qt.AlignCenter, qty_str)

        p.end()

    def __del__(self):
        try:
            _AnimCtrl.instance().unregister(self)
        except Exception:
            pass

    # ── Menu contextuel ───────────────────────────────────────────────

    def _on_context(self, pos: QPoint):
        menu = QMenu(self)
        menu.setStyleSheet(f"""
            QMenu {{
                background: #1a2535; border: 1px solid {BORDER};
                color: {TEXT}; font-family: {FONT_LABEL}; font-size: 10px; padding: 4px;
            }}
            QMenu::item {{ padding: 4px 16px; border-radius: 4px; }}
            QMenu::item:selected {{ background: rgba(30,180,176,0.25); }}
        """)
        act_edit   = menu.addAction("✏  Modifier la quantité…")
        act_rename = menu.addAction("🏷  Renommer…")
        menu.addSeparator()
        act_del    = menu.addAction("🗑  Supprimer")

        chosen = menu.exec_(self.mapToGlobal(pos))
        if chosen == act_edit:
            self._edit_qty()
        elif chosen == act_rename:
            self._edit_name()
        elif chosen == act_del:
            self._tab._remove_item(self.name)

    def _edit_qty(self):
        dlg = QDialog(self)
        dlg.setWindowTitle("Modifier la quantité")
        dlg.setStyleSheet(f"background: #1a2535; color: {TEXT}; font-family: {FONT_LABEL};")
        form = QFormLayout(dlg)
        spin = QSpinBox()
        spin.setRange(1, 999_999_999)
        spin.setValue(self.qty)
        spin.setStyleSheet(
            f"background: #0d1520; color: {TEXT}; border: 1px solid {BORDER}; padding: 4px;"
        )
        form.addRow(f"<b>{self.name}</b>", spin)
        btns = QDialogButtonBox(QDialogButtonBox.Ok | QDialogButtonBox.Cancel)
        btns.setStyleSheet(f"color: {TEXT};")
        btns.accepted.connect(dlg.accept)
        btns.rejected.connect(dlg.reject)
        form.addRow(btns)
        if dlg.exec_() == QDialog.Accepted:
            self._tab._set_qty(self.name, spin.value())

    def _edit_name(self):
        new_name, ok = QInputDialog.getText(self, "Renommer", "Nouveau nom :", text=self.name)
        if ok and new_name.strip() and new_name.strip() != self.name:
            self._tab._rename_item(self.name, new_name.strip())


# ── Conteneur en flux (wrap automatique) ─────────────────────────────────────

class _FlowContainer(QWidget):
    """Dispose les _ItemCell en lignes qui se remplissent automatiquement."""

    def __init__(self, parent=None):
        super().__init__(parent)
        self._cells: list[_ItemCell] = []
        self.setStyleSheet("background: transparent;")

    def add_cell(self, cell: _ItemCell):
        cell.setParent(self)
        self._cells.append(cell)
        self._relayout()

    def remove_cell(self, cell: _ItemCell):
        if cell in self._cells:
            self._cells.remove(cell)
            cell.setParent(None)
            cell.deleteLater()
            self._relayout()

    def clear_cells(self):
        for cell in list(self._cells):
            cell.setParent(None)
            cell.deleteLater()
        self._cells.clear()
        self.setFixedHeight(1)

    def visible_cells(self) -> list[_ItemCell]:
        return [c for c in self._cells if c.isVisible()]

    def resizeEvent(self, event):
        super().resizeEvent(event)
        self._relayout()

    def showEvent(self, event):
        super().showEvent(event)
        self._relayout()

    def _relayout(self):
        w = self.width()
        if w < _CELL:
            return
        cols = max(1, (w + _GAP) // (_CELL + _GAP))
        visible = self.visible_cells()
        rows = max(1, -(-len(visible) // cols))
        total_h = rows * (_CELL + _GAP) - _GAP if visible else 0
        self.setFixedHeight(max(1, total_h))
        for i, cell in enumerate(visible):
            cell.move(i % cols * (_CELL + _GAP), i // cols * (_CELL + _GAP))
            cell.show()

    def apply_filter(self, query: str):
        for cell in self._cells:
            cell.setVisible(not query or cell.matches(query))
        self._relayout()


# ── Section de catégorie (pliable) ────────────────────────────────────────────

class _CategorySection(QWidget):
    def __init__(self, category_name: str, parent=None):
        super().__init__(parent)
        self.category_name = category_name
        self._expanded = False
        self.setStyleSheet("background: transparent;")
        self.setSizePolicy(QSizePolicy.Expanding, QSizePolicy.Fixed)

        layout = QVBoxLayout(self)
        layout.setContentsMargins(0, 0, 0, 4)
        layout.setSpacing(0)

        # En-tête cliquable
        self._header = QFrame(self)
        self._header.setStyleSheet(f"""
            QFrame {{
                background: rgba(255,255,255,0.04);
                border: 1px solid {BORDER};
                border-radius: 6px;
            }}
            QFrame:hover {{
                background: rgba(255,255,255,0.07);
                border-color: {TEAL};
            }}
        """)
        self._header.setCursor(Qt.PointingHandCursor)
        self._header.setFixedHeight(34)
        self._header.setSizePolicy(QSizePolicy.Expanding, QSizePolicy.Fixed)

        h_lay = QHBoxLayout(self._header)
        h_lay.setContentsMargins(12, 0, 12, 0)
        h_lay.setSpacing(8)

        self._arrow_lbl = QLabel("▶")
        self._arrow_lbl.setStyleSheet(
            f"color: {TEXT_DIM}; background: transparent; font-size: 8px;"
        )
        h_lay.addWidget(self._arrow_lbl)

        self._title_lbl = QLabel(category_name)
        f = QFont(FONT_LABEL, 10)
        f.setBold(True)
        self._title_lbl.setFont(f)
        self._title_lbl.setStyleSheet(
            f"color: {TEXT}; background: transparent; letter-spacing: 1px;"
        )
        h_lay.addWidget(self._title_lbl)
        h_lay.addStretch()

        self._count_lbl = QLabel("0")
        self._count_lbl.setFont(QFont(FONT_LABEL, 9))
        self._count_lbl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")
        h_lay.addWidget(self._count_lbl)

        layout.addWidget(self._header)

        # Contenu
        self._content = QWidget(self)
        self._content.setStyleSheet("background: transparent;")
        self._content.setSizePolicy(QSizePolicy.Expanding, QSizePolicy.Fixed)
        content_lay = QVBoxLayout(self._content)
        content_lay.setContentsMargins(0, 6, 0, 0)
        content_lay.setSpacing(0)

        self._flow = _FlowContainer(self._content)
        content_lay.addWidget(self._flow)

        self._content.hide()
        layout.addWidget(self._content)

        self._header.mousePressEvent = self._on_header_click

    def _on_header_click(self, event):
        self._expanded = not self._expanded
        self._arrow_lbl.setText("▼" if self._expanded else "▶")
        self._content.setVisible(self._expanded)

    def add_cell(self, cell: _ItemCell):
        self._flow.add_cell(cell)
        self._update_count()

    def clear_cells(self):
        self._flow.clear_cells()
        self._update_count()

    def _update_count(self):
        n = len(self._flow._cells)
        self._count_lbl.setText(str(n))
        total = sum(c.qty for c in self._flow._cells)
        self._count_lbl.setToolTip(f"{n} objets · {total:,} unités".replace(",", "\u202f"))

    def apply_filter(self, query: str):
        self._flow.apply_filter(query)
        visible_count = len(self._flow.visible_cells())
        self.setVisible(visible_count > 0 or not query)
        self._count_lbl.setText(
            str(visible_count) if query else str(len(self._flow._cells))
        )

    @property
    def flow(self) -> _FlowContainer:
        return self._flow


# ── Onglet Inventaire ─────────────────────────────────────────────────────────

class InventaireTab(BaseTab):
    def __init__(self, parent: QWidget | None = None):
        super().__init__(parent)
        self._items_data: dict[str, int]              = {}
        self._items: dict[str, _ItemCell]             = {}
        self._categories: dict[str, _CategorySection] = {}
        self._filter_query = ""
        self._build_ui()

    # ── Construction ─────────────────────────────────────────────────

    def _build_ui(self):
        root = QVBoxLayout(self)
        root.setContentsMargins(14, 12, 14, 12)
        root.setSpacing(8)

        # En-tête
        hdr = QHBoxLayout()
        title = QLabel("Inventaire")
        title.setFont(QFont(FONT_TITLE, 14))
        title.setStyleSheet(f"color: {TEAL_BRIGHT}; background: transparent;")
        hdr.addWidget(title)
        hdr.addStretch()
        self._count_lbl = QLabel("0 objets")
        self._count_lbl.setFont(QFont(FONT_LABEL, 9))
        self._count_lbl.setStyleSheet(f"color: {TEXT_DIM}; background: transparent;")
        hdr.addWidget(self._count_lbl, 0, Qt.AlignBottom)
        root.addLayout(hdr)

        # Barre de recherche
        self._search = QLineEdit()
        self._search.setPlaceholderText("Rechercher un objet…")
        self._search.setStyleSheet(f"""
            QLineEdit {{
                background: rgba(255,255,255,0.05);
                border: 1px solid {BORDER};
                border-radius: 6px;
                color: {TEXT};
                padding: 4px 8px;
                font-family: {FONT_LABEL};
                font-size: 10px;
            }}
            QLineEdit:focus {{ border-color: {TEAL}; }}
        """)
        self._search.textChanged.connect(self._on_search)
        root.addWidget(self._search)

        sep = QFrame()
        sep.setFrameShape(QFrame.HLine)
        sep.setStyleSheet(f"color: {BORDER}; background: {BORDER}; max-height: 1px;")
        root.addWidget(sep)

        # Zone scrollable avec les catégories
        scroll = QScrollArea()
        scroll.setWidgetResizable(True)
        scroll.setFrameShape(QFrame.NoFrame)
        scroll.setHorizontalScrollBarPolicy(Qt.ScrollBarAlwaysOff)
        scroll.setStyleSheet("background: transparent;")

        self._content_widget = QWidget()
        self._content_widget.setStyleSheet("background: transparent;")
        self._content_layout = QVBoxLayout(self._content_widget)
        self._content_layout.setContentsMargins(0, 0, 0, 0)
        self._content_layout.setSpacing(6)
        self._content_layout.addStretch()

        scroll.setWidget(self._content_widget)
        root.addWidget(scroll, 1)

        # Label vide
        self._empty_lbl = QLabel(
            "Aucun objet collecté pour l'instant.\n"
            "Les objets apparaissent automatiquement lors de vos aventures."
        )
        self._empty_lbl.setAlignment(Qt.AlignCenter)
        self._empty_lbl.setWordWrap(True)
        self._empty_lbl.setFont(QFont(FONT_LABEL, 9))
        self._empty_lbl.setStyleSheet(
            f"color: {TEXT_DIM}; background: transparent; padding: 20px;"
        )
        root.addWidget(self._empty_lbl)

    # ── API publique ─────────────────────────────────────────────────

    def load_history(self, inventory: dict[str, int]):
        self._items_data = {name: qty for name, qty in inventory.items() if qty > 0}
        self._rebuild_all()

    def on_item_gained(self, name: str, qty: int):
        prev    = self._items_data.get(name, 0)
        new_qty = prev + qty
        if new_qty <= 0:
            return
        self._items_data[name] = new_qty
        if name in self._items:
            self._items[name].update_qty(new_qty)
            self._categories.get(self._items[name]._category, None) and \
                self._categories[self._items[name]._category]._update_count()
        else:
            self._rebuild_all()
        self._refresh_header()

    def on_item_lost(self, name: str, qty: int):
        if name not in self._items_data:
            return
        new_qty = max(0, self._items_data[name] - qty)
        if new_qty == 0:
            del self._items_data[name]
            self._rebuild_all()
        else:
            self._items_data[name] = new_qty
            if name in self._items:
                self._items[name].update_qty(new_qty)
                cell = self._items[name]
                if cell._category in self._categories:
                    self._categories[cell._category]._update_count()
        self._refresh_header()

    # ── Privé : mutations ─────────────────────────────────────────────

    def _remove_item(self, name: str):
        self._items_data.pop(name, None)
        self._rebuild_all()
        self._refresh_header()

    def _set_qty(self, name: str, qty: int):
        if qty <= 0:
            self._remove_item(name)
        else:
            self._items_data[name] = qty
            if name in self._items:
                self._items[name].update_qty(qty)
                cell = self._items[name]
                if cell._category in self._categories:
                    self._categories[cell._category]._update_count()
        self._refresh_header()

    def _rename_item(self, old_name: str, new_name: str):
        qty = self._items_data.pop(old_name, 0)
        if qty > 0:
            self._items_data[new_name] = qty
        self._rebuild_all()
        self._refresh_header()

    # ── Privé : reconstruction ────────────────────────────────────────

    def _get_item_category(self, name: str) -> str:
        try:
            from core.item_icons import get_item_data, get_type_name
            data = get_item_data(name)
            if data:
                tid = data.get("type_id")
                if tid is not None:
                    cat = get_type_name(int(tid))
                    if cat:
                        return cat
        except Exception:
            pass
        return "Divers"

    def _sort_key(self, name: str) -> tuple:
        """Tri : level ASC, rarity ASC, nom."""
        try:
            from core.item_icons import get_item_data
            data = get_item_data(name)
            if data:
                level  = data.get("level")  or 9999
                rarity = data.get("rarity") or 0
                return (int(level), int(rarity), name.lower())
        except Exception:
            pass
        return (9999, 0, name.lower())

    def _rebuild_all(self):
        """Reconstruit toutes les sections depuis _items_data."""
        # Vider et supprimer les anciennes sections
        for section in self._categories.values():
            section.clear_cells()
            self._content_layout.removeWidget(section)
            section.hide()
            section.deleteLater()
        self._categories.clear()
        self._items.clear()

        if not self._items_data:
            self._refresh_header()
            return

        # Grouper par catégorie
        by_cat: dict[str, list[str]] = {}
        for name in self._items_data:
            cat = self._get_item_category(name)
            by_cat.setdefault(cat, []).append(name)

        # Trier les catégories alphabétiquement, "Divers" en dernier
        sorted_cats = sorted(
            by_cat.keys(),
            key=lambda c: ("\xff" if c == "Divers" else c.lower()),
        )

        # Retirer le stretch final
        last = self._content_layout.takeAt(self._content_layout.count() - 1)

        for cat_name in sorted_cats:
            names   = sorted(by_cat[cat_name], key=self._sort_key)
            section = _CategorySection(cat_name, self._content_widget)
            self._categories[cat_name] = section
            self._content_layout.addWidget(section)

            for name in names:
                cell          = _ItemCell(name, self._items_data[name], self)
                cell._category = cat_name
                self._items[name] = cell
                section.add_cell(cell)

        # Remettre le stretch
        self._content_layout.addStretch()

        if self._filter_query:
            self._apply_filter()

        self._refresh_header()

    def _refresh_header(self):
        n = len(self._items_data)
        self._empty_lbl.setVisible(n == 0)
        total_qty = sum(self._items_data.values())
        self._count_lbl.setText(
            f"{n} objet{'s' if n != 1 else ''} · "
            f"{total_qty:,} unités".replace(",", "\u202f")
        )

    def _apply_filter(self):
        q = self._filter_query
        for section in self._categories.values():
            section.apply_filter(q)

    def _on_search(self, text: str):
        self._filter_query = text.strip()
        self._apply_filter()
