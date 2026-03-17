# ui/tabs/inventaire.py — Onglet Inventaire
# Grille d'objets collectés — tooltip sur hover via _ItemTooltipPopup (HDV);
# clic droit pour éditer.

from __future__ import annotations

from datetime import datetime, timedelta
from pathlib import Path
import unicodedata

from PyQt5.QtWidgets import (
    QWidget, QVBoxLayout, QHBoxLayout, QLabel, QFrame,
    QScrollArea, QSizePolicy, QLineEdit, QMenu, QAction,
    QDialog, QSpinBox, QDialogButtonBox, QFormLayout, QToolButton,
    QApplication,
)
from PyQt5.QtCore import Qt, QSize, QRect, QPoint, QTimer, QSettings, QObject, QEvent
from PyQt5.QtGui import QFont, QColor, QPainter, QFontMetrics, QPen, QPixmap

from core.item_icons import (
    ItemIconService,
    get_gfx_id,
    get_item_data,
    get_item_rarity_candidates,
    get_type_name,
)
from core.game_database import get_item_settings, set_item_settings, rename_item
from ui.tabs.base import BaseTab
from ui.theme import (
    BORDER, TEAL, TEAL_BRIGHT,
    TEXT, TEXT_DIM, FONT_TITLE, FONT_LABEL, BG,
)

_CELL  = 58   # taille d'une case (px)
_GAP   = 4    # espacement entre cases
_ANIM_STACK_THRESHOLD = 100
_STATIC_FRAME_INDEX = 1  # frame 2 (index 1)
_RECENT_PICKUP_WINDOW = timedelta(minutes=5)

_PROJECT_ROOT = Path(__file__).resolve().parents[2]
_RARITY_BORDER_DIR = _PROJECT_ROOT / "ui" / "assets" / "theme" / "images" / "pictos"
_RARITY_BORDER_FILE = {
    0: "RarityBorder-Old.png",
    1: "RarityBorder-Common.png",
    2: "RarityBorder-Rare.png",
    3: "RarityBorder-Mythic.png",
    4: "RarityBorder-Legendary.png",
    5: "RarityBorder-Relic.png",
    6: "RarityBorder-Memory.png",
    7: "RarityBorder-Epic.png",
}

_RARITY_LABEL = {
    0: "Ancien",
    1: "Commun",
    2: "Rare",
    3: "Mythique",
    4: "Légendaire",
    5: "Relique",
    6: "Souvenir",
    7: "Épique",
}

_GROUP_ORDER = ["Equipements", "Ressources", "Récoltes", "Rafinages & composants", "Créatures", "Havre-sac", "Cosmétiques", "Divers"]

_GROUP_PATTERNS: dict[str, list[tuple[str, ...]]] = {
    "Equipements": [
        ("amulette",),
        ("anneau",),
        ("botte",),
        ("cape",),
        ("casque",),
        ("ceinture",),
        ("epaulette",),
        ("plastron",),
        ("arme", "1 main", "une main", "(1", "(une"),
        ("arme", "2 main", "deux mains", "(2", "(deux"),
        ("seconde main", "off-hand", "offhand", "bouclier"),
        ("embleme",),
        ("sac",),
        ("panoplie",),
    ],
    "Ressources": [
        ("ressource", "monstre"),
        ("sioupere", "sioup", "glou"),
        ("recette",),
        ("amelioration",),
        ("ressource",),
    ],
    "Récoltes": [
        ("recolte", "paysan"),
        ("recolte", "forestier"),
        ("recolte", "herboriste"),
        ("recolte", "trappeur"),
        ("recolte", "mineur"),
        ("recolte", "pecheur"),
        ("recolte",),
    ],
    "Rafinages & composants": [
        ("rafinage", "paysan"),
        ("rafinage", "forestier"),
        ("rafinage", "trappeur"),
        ("rafinage", "mineur"),
        ("rafinage", "pecheur"),
        ("composant", "armurier"),
        ("composant", "bijoutier"),
        ("composant", "maroquinier"),
        ("composant", "tailleur"),
        ("composant", "maitre", "armes"),
        ("composant", "boulanger"),
        ("composant", "cuisinier"),
        ("composant", "ebeniste"),
        ("rafinage",),
        ("composant",),
    ],
    "Créatures": [
        ("compagnon",),
        ("monture",),
        ("familier",),
    ],
    "Havre-sac": [
        ("havre", "gemme"),
        ("havre", "monde"),
        ("decoration", "havre"),
        ("vitrine",),
        ("atelier",),
    ],
    "Cosmétiques": [
        ("apparence", "equipement"),
        ("costume",),
        ("artifice",),
        ("transformation",),
        ("attitude",),
        ("aura", "lumiere"),
        ("apparence", "monture"),
    ],
}


# ── Couleur dérivée du nom (palette cohérente sans icône) ────────────────────

def _item_color(name: str) -> QColor:
    h = 0
    for c in name:
        h = (h * 31 + ord(c)) & 0xFFFF
    hue = h % 360
    return QColor.fromHsv(hue, 110, 130)


def _normalize_text(value: str) -> str:
    lowered = (value or "").strip().lower()
    nfkd = unicodedata.normalize("NFKD", lowered)
    return "".join(c for c in nfkd if not unicodedata.combining(c))


def _category_group_and_rank(category: str) -> tuple[str, int]:
    ncat = _normalize_text(category)
    for group_name, pattern_list in _GROUP_PATTERNS.items():
        for idx, aliases in enumerate(pattern_list):
            if any(alias in ncat for alias in aliases):
                return group_name, idx
    return "Divers", 999


# ── Case d'un objet ──────────────────────────────────────────────────────────

class _ItemCell(QWidget):
    def __init__(
        self,
        name: str,
        qty: int,
        category: str,
        level: int | None,
        rarity: int,
        gfx_id: int | None,
        tab: "InventaireTab",
        parent=None,
    ):
        super().__init__(parent)
        self.name = name
        self.qty = qty
        self.category = category
        self.level = level
        self.rarity = rarity if isinstance(rarity, int) else 1
        self.gfx_id = gfx_id
        self._tab = tab
        self._color = _item_color(name)
        self._icon_px: QPixmap | None = None
        self._anim_frame = _STATIC_FRAME_INDEX if qty < _ANIM_STACK_THRESHOLD else 0
        self._rarity_px = self._load_rarity_border(self.rarity)
        self._last_gain_at: datetime | None = None
        self._prix_ah = int(get_item_settings(name).get("ah_price", 0) or 0)
        self.setFixedSize(_CELL, _CELL)
        # Note: tooltip is now handled via popup through _InventaireTooltipFilter
        self.setContextMenuPolicy(Qt.CustomContextMenu)
        self.customContextMenuRequested.connect(self._on_context)

    def _load_rarity_border(self, rarity: int) -> QPixmap | None:
        filename = _RARITY_BORDER_FILE.get(int(rarity), _RARITY_BORDER_FILE[1])
        path = _RARITY_BORDER_DIR / filename
        if not path.exists():
            return None
        px = QPixmap(str(path))
        return None if px.isNull() else px

    def set_icon(self, px: QPixmap):
        self._icon_px = px
        self.update()

    def set_animation_frame(self, frame: int):
        self._anim_frame = max(0, int(frame))
        self.update()

    def mark_gained_now(self):
        self._last_gain_at = datetime.now()

    def can_animate(self, now: datetime) -> bool:
        if self.qty >= _ANIM_STACK_THRESHOLD:
            return True
        if self._last_gain_at is None:
            return False
        return (now - self._last_gain_at) <= _RECENT_PICKUP_WINDOW

    def sort_key(self) -> tuple[str, int, int, str]:
        lvl = self.level if isinstance(self.level, int) else 10_000
        return (self.category.lower(), lvl, int(self.rarity), self.name.lower())

    # ── Rendu ─────────────────────────────────────────────────────────

    def paintEvent(self, _):
        p = QPainter(self)
        p.setRenderHint(QPainter.Antialiasing)
        r = self.rect().adjusted(1, 1, -2, -2)

        # Fond coloré dérivé du nom
        col = QColor(self._color)
        col.setAlpha(60)
        p.setBrush(col)
        border_col = QColor(self._color)
        border_col.setAlpha(160)
        p.setPen(QPen(border_col, 1))
        p.drawRoundedRect(r, 6, 6)

        if self._icon_px and not self._icon_px.isNull():
            target = QRect(3, 3, _CELL - 6, _CELL - 6)
            p.drawPixmap(target, self._icon_px)
        else:
            words = [w for w in self.name.split() if w]
            if len(words) >= 2:
                initials = (words[0][0] + words[1][0]).upper()
            else:
                initials = self.name[:2].upper()

            p.setPen(QColor(TEXT))
            font = QFont(FONT_LABEL, 13)
            font.setWeight(QFont.Bold)
            p.setFont(font)
            p.drawText(QRect(0, 4, _CELL, _CELL - 18), Qt.AlignCenter, initials)

        if self._rarity_px and not self._rarity_px.isNull():
            src_w = self._rarity_px.width()
            src_h_total = self._rarity_px.height()
            frame_h = src_w if src_h_total >= src_w else src_h_total
            frame_idx = self._anim_frame % 4 if frame_h > 0 else 0
            if frame_h > 0 and src_h_total >= (frame_h * 4):
                # Les sprites Wakfu sont souvent en 4 frames verticales avec un espacement.
                stride = max(frame_h, (src_h_total - frame_h) // 3)
                src_y = frame_idx * stride
                if src_y + frame_h > src_h_total:
                    src_y = max(0, src_h_total - frame_h)
            else:
                src_y = 0
            src = QRect(0, src_y, src_w, frame_h if frame_h > 0 else src_h_total)
            p.drawPixmap(r, self._rarity_px, src)

        # Badge quantité
        qty_str = _fmt_qty(self.qty)
        p.setFont(QFont(FONT_LABEL, 7))
        fm = QFontMetrics(p.font())
        bw = fm.horizontalAdvance(qty_str) + 6
        bh = 13
        bx = r.right() - bw + 1
        by = r.bottom() - bh + 1
        badge_bg = QColor(0, 0, 0, 160)
        p.setBrush(badge_bg)
        p.setPen(Qt.NoPen)
        p.drawRoundedRect(QRect(bx, by, bw, bh), 3, 3)
        p.setPen(QColor(TEAL_BRIGHT))
        p.drawText(QRect(bx, by, bw, bh), Qt.AlignCenter, qty_str)

    def enterEvent(self, event):
        """Show item tooltip on mouse enter via HDV popup."""
        try:
            # Lazy import to avoid circular deps - import tooltip popup from HDV
            from ui.tabs.hdv import _ItemTooltipPopup
            _ItemTooltipPopup.get().show_for(self.name, self.mapToGlobal(self.rect().center()))
        except ImportError:
            pass

    def leaveEvent(self, event):
        """Hide item tooltip on mouse leave."""
        try:
            from ui.tabs.hdv import _ItemTooltipPopup
            _ItemTooltipPopup.get().close_popup()
        except ImportError:
            pass

    # ── Données ───────────────────────────────────────────────────────

    def update_qty(self, qty: int):
        self.qty = qty
        if self.qty < _ANIM_STACK_THRESHOLD:
            self._anim_frame = _STATIC_FRAME_INDEX
        self.update()

    def matches(self, query: str) -> bool:
        return query.lower() in self.name.lower()

    # ── Menu contextuel ───────────────────────────────────────────────

    def _on_context(self, pos: QPoint):
        menu = QMenu(self)
        menu.setStyleSheet(f"""
            QMenu {{
                background: #1a2535;
                border: 1px solid {BORDER};
                color: {TEXT};
                font-family: {FONT_LABEL};
                font-size: 10px;
                padding: 4px;
            }}
            QMenu::item {{ padding: 4px 16px; border-radius: 4px; }}
            QMenu::item:selected {{ background: rgba(30,180,176,0.25); }}
        """)
        act_edit   = menu.addAction("✏  Éditer…")
        act_rename = menu.addAction("🏷  Renommer…")
        menu.addSeparator()
        act_del    = menu.addAction("🗑  Supprimer")

        chosen = menu.exec_(self.mapToGlobal(pos))
        if chosen == act_edit:
            self._edit_item()
        elif chosen == act_rename:
            self._edit_name()
        elif chosen == act_del:
            self._tab._remove(self.name)
            self._tab._refresh_display()

    def _edit_item(self):
        dlg = QDialog(self)
        dlg.setWindowTitle("Éditer l'objet")
        dlg.setStyleSheet(f"background: #1a2535; color: {TEXT}; font-family: {FONT_LABEL};")
        form = QFormLayout(dlg)
        qty_spin = QSpinBox()
        qty_spin.setRange(1, 999_999_999)
        qty_spin.setValue(self.qty)
        qty_spin.setStyleSheet(f"background: #0d1520; color: {TEXT}; border: 1px solid {BORDER}; padding: 4px;")
        form.addRow(f"<b>{self.name}</b>", qty_spin)

        price_spin = QSpinBox()
        price_spin.setRange(0, 999_999_999)
        price_spin.setValue(int(self._prix_ah or 0))
        price_spin.setStyleSheet(f"background: #0d1520; color: {TEXT}; border: 1px solid {BORDER}; padding: 4px;")
        form.addRow("Prix AH (calibration)", price_spin)

        btns = QDialogButtonBox(QDialogButtonBox.Ok | QDialogButtonBox.Cancel)
        btns.setStyleSheet(f"color: {TEXT};")
        btns.accepted.connect(dlg.accept)
        btns.rejected.connect(dlg.reject)
        form.addRow(btns)
        if dlg.exec_() == QDialog.Accepted:
            self._prix_ah = int(price_spin.value())
            set_item_settings(self.name, qty_override=int(qty_spin.value()), ah_price=self._prix_ah)
            self._tab._upsert(self.name, qty_spin.value())
            self._tab._refresh_display()

    def _edit_name(self):
        from PyQt5.QtWidgets import QInputDialog
        new_name, ok = QInputDialog.getText(
            self, "Renommer", "Nouveau nom :", text=self.name
        )
        if ok and new_name.strip() and new_name.strip() != self.name:
            old_qty = self.qty
            rename_item(self.name, new_name.strip())
            self._tab._remove(self.name)
            self._tab._upsert(new_name.strip(), old_qty)
            self._tab._refresh_display()


# ── Helpers ──────────────────────────────────────────────────────────────────

def _fmt_qty(v: int) -> str:
    if v >= 1_000_000:
        return f"{v/1_000_000:.1f}M"
    if v >= 1_000:
        return f"{v//1_000}k"
    return str(v)


def _safe_int(value) -> int | None:
    try:
        return int(value)
    except (TypeError, ValueError):
        return None


def _item_meta(name: str) -> tuple[str, int | None, int, int | None]:
    data = get_item_data(name) or {}
    type_id = _safe_int(data.get("type_id"))
    category = get_type_name(type_id) if type_id is not None else None
    category = (category or "Sans catégorie").strip()

    level = _safe_int(data.get("level"))

    rarity = _safe_int(data.get("rarity"))
    candidates = get_item_rarity_candidates(name)
    if candidates:
        rarity = int(min(candidates))
    if rarity is None or rarity < 0 or rarity > 7:
        rarity = 1

    gfx_id = get_gfx_id(name)
    return category, level, rarity, gfx_id


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

    def set_cells(self, cells: list[_ItemCell]):
        self._cells = list(cells)
        for cell in self._cells:
            if cell.parent() is not self:
                cell.setParent(self)
        self._relayout()

    def remove_cell(self, cell: _ItemCell):
        if cell in self._cells:
            self._cells.remove(cell)
            cell.setParent(None)
            cell.deleteLater()
            self._relayout()

    def visible_cells(self) -> list[_ItemCell]:
        return [c for c in self._cells if c.isVisible()]

    def resizeEvent(self, event):
        super().resizeEvent(event)
        self._relayout()

    def _relayout(self):
        w = self.width()
        if w < _CELL:
            return
        cols = max(1, (w + _GAP) // (_CELL + _GAP))
        visible = self.visible_cells()
        rows = max(1, -(-len(visible) // cols))   # ceil division
        total_h = rows * (_CELL + _GAP) - _GAP if visible else 0
        self.setFixedHeight(max(1, total_h))

        for i, cell in enumerate(visible):
            col = i % cols
            row = i // cols
            cell.move(col * (_CELL + _GAP), row * (_CELL + _GAP))
            cell.show()


class _CategorySection(QFrame):
    def __init__(self, category: str, parent=None):
        super().__init__(parent)
        self.category = category
        self._user_expanded = False

        self.setObjectName("invCategorySection")
        self.setStyleSheet(
            f"QFrame#invCategorySection{{"
            f"background: rgba(255,255,255,0.02);"
            f"border: 1px solid {BORDER};"
            f"border-radius: 8px;"
            f"}}"
        )

        lay = QVBoxLayout(self)
        lay.setContentsMargins(6, 6, 6, 6)
        lay.setSpacing(4)

        self._btn = QToolButton(self)
        self._btn.setCheckable(True)
        self._btn.setChecked(False)
        self._btn.setArrowType(Qt.RightArrow)
        self._btn.setToolButtonStyle(Qt.ToolButtonTextBesideIcon)
        self._btn.setStyleSheet(
            f"QToolButton{{"
            f"background: transparent;"
            f"border: none;"
            f"color: {TEAL_BRIGHT};"
            f"font-family: {FONT_LABEL};"
            f"font-size: 10px;"
            f"font-weight: 700;"
            f"padding: 2px 2px;"
            f"text-align: left;"
            f"}}"
        )
        self._btn.toggled.connect(self._on_toggled)
        lay.addWidget(self._btn)

        self.flow = _FlowContainer(self)
        self.flow.setVisible(False)
        lay.addWidget(self.flow)

        self._set_header(0, 0)

    def _on_toggled(self, checked: bool):
        self._user_expanded = bool(checked)
        self.flow.setVisible(checked)
        self._btn.setArrowType(Qt.DownArrow if checked else Qt.RightArrow)
        if checked:
            self.flow._relayout()
            QTimer.singleShot(0, self.flow._relayout)
        self._save_state()

    def _save_state(self):
        settings = QSettings("Ankama", "WakfuAssistant")
        settings.setValue(f"inventory/section/{self.category}", self._user_expanded)

    def _load_state(self):
        settings = QSettings("Ankama", "WakfuAssistant")
        expanded = settings.value(f"inventory/section/{self.category}", True, type=bool)
        self.set_expanded(expanded, remember=True)

    def _set_header(self, visible_count: int, total_count: int):
        if visible_count == total_count:
            text = f"{self.category} ({total_count})"
        else:
            text = f"{self.category} ({visible_count}/{total_count})"
        self._btn.setText(text)

    def add_cell(self, cell: _ItemCell):
        self.flow.add_cell(cell)
        c = len(self.flow._cells)
        self._set_header(c, c)

    def remove_cell(self, cell: _ItemCell):
        self.flow.remove_cell(cell)
        c = len(self.flow._cells)
        self._set_header(c, c)

    def set_ordered_cells(self, cells: list[_ItemCell]):
        self.flow.set_cells(cells)
        c = len(cells)
        self._set_header(c, c)

    def set_expanded(self, expanded: bool, remember: bool = True):
        if remember:
            self._user_expanded = expanded
        self._btn.blockSignals(True)
        self._btn.setChecked(expanded)
        self._btn.blockSignals(False)
        self.flow.setVisible(expanded)
        self._btn.setArrowType(Qt.DownArrow if expanded else Qt.RightArrow)
        if expanded:
            self.flow._relayout()
            QTimer.singleShot(0, self.flow._relayout)

    def update_filter_state(self, query_active: bool):
        visible = len(self.flow.visible_cells())
        total = len(self.flow._cells)
        self._set_header(visible, total)
        if query_active:
            self.setVisible(visible > 0)
            if visible > 0:
                self.set_expanded(True, remember=False)
        else:
            self.setVisible(total > 0)
            self.set_expanded(self._user_expanded, remember=False)


class _CategoryGroup(QFrame):
    def __init__(self, title: str, parent=None):
        super().__init__(parent)
        self.title = title
        self._sections: list[_CategorySection] = []
        self._user_expanded = True

        self.setObjectName("invCategoryGroup")
        self.setStyleSheet(
            f"QFrame#invCategoryGroup{{"
            f"background: rgba(255,255,255,0.01);"
            f"border: 1px solid rgba(255,255,255,0.06);"
            f"border-radius: 8px;"
            f"}}"
        )

        lay = QVBoxLayout(self)
        lay.setContentsMargins(8, 8, 8, 8)
        lay.setSpacing(6)

        self._btn = QToolButton(self)
        self._btn.setCheckable(True)
        self._btn.setChecked(True)
        self._btn.setArrowType(Qt.DownArrow)
        self._btn.setToolButtonStyle(Qt.ToolButtonTextBesideIcon)
        self._btn.setText(title)
        self._btn.setStyleSheet(
            f"QToolButton{{"
            f"background: transparent;"
            f"border: none;"
            f"color: {TEAL_BRIGHT};"
            f"font-family: {FONT_LABEL};"
            f"font-size: 11px;"
            f"font-weight: 800;"
            f"padding: 1px 2px;"
            f"text-align: left;"
            f"}}"
        )
        self._btn.toggled.connect(self._on_toggled)
        lay.addWidget(self._btn)

        self._sections_host = QWidget(self)
        self._sections_lay = QVBoxLayout(self._sections_host)
        self._sections_lay.setContentsMargins(0, 0, 0, 0)
        self._sections_lay.setSpacing(6)
        lay.addWidget(self._sections_host)

    def _on_toggled(self, checked: bool):
        self._user_expanded = bool(checked)
        self._sections_host.setVisible(checked)
        self._btn.setArrowType(Qt.DownArrow if checked else Qt.RightArrow)
        self._save_state()

    def _save_state(self):
        settings = QSettings("Ankama", "WakfuAssistant")
        settings.setValue(f"inventory/group/{self.title}", self._user_expanded)

    def _load_state(self):
        settings = QSettings("Ankama", "WakfuAssistant")
        expanded = settings.value(f"inventory/group/{self.title}", True, type=bool)
        self.set_expanded(expanded, remember=True)

    def set_expanded(self, expanded: bool, remember: bool = True):
        if remember:
            self._user_expanded = bool(expanded)
        self._btn.blockSignals(True)
        self._btn.setChecked(bool(expanded))
        self._btn.blockSignals(False)
        self._sections_host.setVisible(bool(expanded))
        self._btn.setArrowType(Qt.DownArrow if expanded else Qt.RightArrow)

    def update_filter_state(self, query_active: bool):
        if query_active:
            self.set_expanded(True, remember=False)
        else:
            self.set_expanded(self._user_expanded, remember=False)

    def add_section(self, section: _CategorySection):
        if section not in self._sections:
            self._sections.append(section)
        if section.parent() is not self._sections_host:
            section.setParent(self._sections_host)
        self._sections_lay.addWidget(section)

    def remove_section(self, section: _CategorySection):
        if section in self._sections:
            self._sections.remove(section)
        self._sections_lay.removeWidget(section)

    def reorder_sections(self, ordered: list[_CategorySection]):
        for sec in ordered:
            self._sections_lay.removeWidget(sec)
            self._sections_lay.addWidget(sec)
        self._sections = list(ordered)

    def has_sections(self) -> bool:
        return bool(self._sections)


# ── Onglet Inventaire ─────────────────────────────────────────────────────────

class InventaireTab(BaseTab):
    def __init__(self, parent: QWidget | None = None):
        super().__init__(parent)
        self._items: dict[str, _ItemCell] = {}
        self._sections: dict[str, _CategorySection] = {}
        self._section_group: dict[str, str] = {}
        self._groups: dict[str, _CategoryGroup] = {}
        self._icon_waiting: dict[int, list[_ItemCell]] = {}
        self._filter_query = ""
        self._icon_svc = ItemIconService.instance()
        self._icon_svc.icon_ready.connect(self._on_icon_ready)
        self._anim_frame = 0
        self._anim_timer = QTimer(self)
        self._anim_timer.setInterval(170)
        self._anim_timer.timeout.connect(self._tick_animation)
        self._anim_timer.start()
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

        # ScrollArea contenant les catégories
        scroll = QScrollArea()
        scroll.setWidgetResizable(True)
        scroll.setFrameShape(QFrame.NoFrame)
        scroll.setHorizontalScrollBarPolicy(Qt.ScrollBarAlwaysOff)
        scroll.setStyleSheet("background: transparent;")

        self._sections_host = QWidget()
        self._sections_lay = QVBoxLayout(self._sections_host)
        self._sections_lay.setContentsMargins(0, 0, 0, 0)
        self._sections_lay.setSpacing(6)
        self._init_group_containers()
        self._sections_lay.addStretch(1)
        scroll.setWidget(self._sections_host)
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
        for name, qty in inventory.items():
            if qty > 0:
                db_item = get_item_settings(name)
                effective_qty = int(db_item.get("qty_override", qty) or qty)
                self._upsert(name, effective_qty)
        self._refresh_display()

    def on_item_gained(self, name: str, qty: int):
        current = self._items.get(name)
        cell = self._upsert(name, (current.qty if current else 0) + qty)
        cell.mark_gained_now()
        self._refresh_display()

    def on_item_lost(self, name: str, qty: int):
        current = self._items.get(name)
        if current:
            new_qty = max(0, current.qty - qty)
            if new_qty == 0:
                self._remove(name)
            else:
                self._upsert(name, new_qty)
            self._refresh_display()

    # ── Privé ─────────────────────────────────────────────────────────

    def _upsert(self, name: str, qty: int) -> _ItemCell:
        if name in self._items:
            cell = self._items[name]
            cell.update_qty(qty)
            return cell
        else:
            category, level, rarity, gfx_id = _item_meta(name)
            cell = _ItemCell(name, qty, category, level, rarity, gfx_id, self)
            self._items[name] = cell
            section = self._ensure_section(category)
            section.add_cell(cell)
            if gfx_id:
                self._request_icon(cell, gfx_id)
            return cell

    def _remove(self, name: str):
        cell = self._items.pop(name, None)
        if cell:
            section = self._sections.get(cell.category)
            if section is not None:
                section.remove_cell(cell)
                if not section.flow._cells:
                    group_name = self._section_group.pop(cell.category, "Divers")
                    group_box = self._groups.get(group_name)
                    if group_box is not None:
                        group_box.remove_section(section)
                    section.setParent(None)
                    section.deleteLater()
                    self._sections.pop(cell.category, None)
                    if group_box is not None:
                        group_box.setVisible(group_box.has_sections())

    def _refresh_display(self):
        self._sort_sections()
        n = len(self._items)
        self._empty_lbl.setVisible(n == 0)
        total_qty = sum(c.qty for c in self._items.values())
        self._count_lbl.setText(
            f"{n} objet{'s' if n != 1 else ''} · "
            f"{total_qty:,} unités".replace(",", "\u202f")
        )
        self._apply_filter()

    def _apply_filter(self):
        q = self._filter_query
        for cell in self._items.values():
            cell.setVisible(not q or cell.matches(q))
        query_active = bool(q)
        for section in self._sections.values():
            section.flow._relayout()
            section.update_filter_state(query_active)
        self._refresh_group_visibility()

    def _on_search(self, text: str):
        self._filter_query = text.strip()
        self._apply_filter()

    def _init_group_containers(self):
        for group_name in _GROUP_ORDER:
            box = _CategoryGroup(group_name, self._sections_host)
            box._load_state()  # Load persisted state from QSettings
            box.setVisible(True)  # Ensure group widget is visible
            self._groups[group_name] = box
            self._sections_lay.addWidget(box)

    def _refresh_group_visibility(self):
        for group_name in _GROUP_ORDER:
            group_box = self._groups.get(group_name)
            if group_box is None:
                continue
            any_visible = False
            for category, section in self._sections.items():
                if self._section_group.get(category) != group_name:
                    continue
                # Check if section has items, not if it's currently visible in the hierarchy
                if len(section.flow._cells) > 0:
                    any_visible = True
                    break
            group_box.setVisible(any_visible)
            if any_visible:
                group_box.update_filter_state(bool(self._filter_query))

    def _ensure_section(self, category: str) -> _CategorySection:
        section = self._sections.get(category)
        if section is not None:
            return section

        group_name, _ = _category_group_and_rank(category)
        group_box = self._groups.get(group_name)
        if group_box is None:
            group_name = "Divers"
            group_box = self._groups[group_name]

        section = _CategorySection(category, self._sections_host)
        section._load_state()  # Load persisted state from QSettings
        self._sections[category] = section
        self._section_group[category] = group_name
        group_box.add_section(section)
        section.setVisible(True)  # Ensure widget is visible
        group_box.setVisible(True)
        return section

    def _sort_sections(self):
        grouped: dict[str, list[_ItemCell]] = {}
        for cell in self._items.values():
            grouped.setdefault(cell.category, []).append(cell)

        def _cat_sort_key(cat: str):
            group_name, rank = _category_group_and_rank(cat)
            group_idx = _GROUP_ORDER.index(group_name) if group_name in _GROUP_ORDER else len(_GROUP_ORDER)
            return (group_idx, rank, _normalize_text(cat))

        categories = sorted(grouped.keys(), key=_cat_sort_key)
        for category in categories:
            section = self._ensure_section(category)
            ordered = sorted(grouped[category], key=lambda c: c.sort_key())
            section.set_ordered_cells(ordered)
            section.setVisible(True)  # Ensure section is visible after adding cells

        per_group: dict[str, list[_CategorySection]] = {g: [] for g in _GROUP_ORDER}
        for category in categories:
            section = self._sections.get(category)
            if section is None:
                continue
            group_name = self._section_group.get(category, "Divers")
            if group_name not in per_group:
                group_name = "Divers"
            per_group[group_name].append(section)

        for group_name in _GROUP_ORDER:
            group_box = self._groups.get(group_name)
            if group_box is None:
                continue
            group_box.reorder_sections(per_group.get(group_name, []))
            group_box.setVisible(bool(per_group.get(group_name)))

    def _request_icon(self, cell: _ItemCell, gfx_id: int):
        px = self._icon_svc.get_cached(gfx_id, size=_CELL - 6)
        if px is not None:
            cell.set_icon(px)
            return
        self._icon_waiting.setdefault(gfx_id, []).append(cell)
        self._icon_svc.request(gfx_id, size=_CELL - 6)

    def _on_icon_ready(self, gfx_id: int, px):
        for cell in self._icon_waiting.pop(gfx_id, []):
            if cell is not None:
                cell.set_icon(px)

    def _tick_animation(self):
        self._anim_frame = (self._anim_frame + 1) % 4
        now = datetime.now()
        for cell in self._items.values():
            if cell.can_animate(now):
                cell.set_animation_frame(self._anim_frame)
            else:
                cell.set_animation_frame(_STATIC_FRAME_INDEX)
