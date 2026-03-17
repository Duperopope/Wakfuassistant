from __future__ import annotations

# ui/tabs/hdv.py — Onglet HDV (Hôtel des Ventes)
# Sous-onglets : Overview · Mes ventes · Mes achats · Offres de vente · Offres d'achat

from datetime import datetime, timedelta

from PyQt5.QtCore import QEvent, QObject, QSize, Qt, QTimer, pyqtSignal
from PyQt5.QtGui import QColor, QIcon
from PyQt5.QtWidgets import (
    QApplication,
    QFrame,
    QHBoxLayout,
    QHeaderView,
    QLabel,
    QPushButton,
    QGridLayout,
    QScrollArea,
    QSizePolicy,
    QStackedWidget,
    QTableWidget,
    QTableWidgetItem,
    QVBoxLayout,
    QWidget,
)

from core.item_icons import ItemIconService, get_gfx_id, get_item_data, get_type_name, load_pixmap, _RARITY_FR
from core.permanent_journal import estimate_market_price, read_permanent_market_deposits
from ui.tabs.base import BaseTab, WipWidget
from ui.theme import (
    BG, BG_PANEL, BG_PANEL2, BORDER, BORDER2,
    GREEN, RED, TEAL, TEAL_BRIGHT, TEXT, TEXT_DIM,
)

_KAMA = "₭"

_SUB_TABS = [
    ("overview",     "Overview"),
    ("mes_ventes",   "Mes ventes"),
    ("mes_achats",   "Mes achats"),
    ("offres_vente", "Offres de vente"),
    ("offres_achat", "Offres d'achat"),
]


# ── Helpers ───────────────────────────────────────────────────────────────────

def _fmt(v: int) -> str:
    return f"{v:,}".replace(",", "\u202f")


def _fmt_short(v: int) -> str:
    if v >= 1_000_000:
        return f"{v / 1_000_000:.1f} M{_KAMA}"
    if v >= 1_000:
        return f"{round(v / 1_000)} K{_KAMA}"
    return f"{_fmt(v)} {_KAMA}"


def _lbl_dim(text: str, parent=None) -> QLabel:
    lbl = QLabel(text, parent)
    lbl.setStyleSheet(
        f"color:{TEXT_DIM};font-size:9px;font-weight:800;"
        f"letter-spacing:0.8px;background:transparent;"
    )
    return lbl


def _lbl_val(text: str = "--", color: str = TEXT, size: int = 17, parent=None) -> QLabel:
    lbl = QLabel(text, parent)
    lbl.setStyleSheet(
        f"color:{color};font-size:{size}px;font-weight:800;background:transparent;"
    )
    return lbl


def _card(parent=None) -> QFrame:
    f = QFrame(parent)
    f.setObjectName("hdvCard")
    f.setStyleSheet(
        f"QFrame#hdvCard{{background:{BG_PANEL};"
        f"border:1px solid {BORDER};border-radius:8px;}}"
    )
    return f


def _stat_card(title: str, color: str = TEAL, parent=None) -> tuple[QFrame, QLabel]:
    c = _card(parent)
    lay = QVBoxLayout(c)
    lay.setContentsMargins(14, 10, 14, 10)
    lay.setSpacing(4)
    lay.addWidget(_lbl_dim(title))
    val = _lbl_val(color=color)
    lay.addWidget(val)
    return c, val


def _section_header(title: str, sub: str = "", parent=None) -> QWidget:
    w = QWidget(parent)
    lay = QVBoxLayout(w)
    lay.setContentsMargins(0, 0, 0, 0)
    lay.setSpacing(2)
    t = QLabel(title, w)
    t.setStyleSheet(
        f"color:{TEXT};font-size:11px;font-weight:700;background:transparent;"
    )
    lay.addWidget(t)
    if sub:
        s = QLabel(sub, w)
        s.setStyleSheet(f"color:{TEXT_DIM};font-size:9px;background:transparent;")
        lay.addWidget(s)
    return w


_TOOLTIP_ICON_SZ = 120                              # référence tooltip
_TABLE_ICON_SZ   = round(_TOOLTIP_ICON_SZ * 0.97)  # 116px — 3% plus petit
_ICON_COL_W      = _TABLE_ICON_SZ + 8              # 124px — colonne icône
_ROW_H           = _TABLE_ICON_SZ + 8              # 124px — hauteur de ligne
_ROW_H_MES       = _ROW_H // 2                     # 62px  — hauteur réduite Mes Ventes
_GRID_ICON_SZ    = 56                              # icône grille compacte Overview
_GRID_COLS       = 8                               # colonnes par rangée dans la grille



def _make_table(cols: list[str], parent=None) -> QTableWidget:
    """Crée une table avec col 0 = icône (fixe), col 1 = OBJET (stretch), reste = ResizeToContents."""
    all_cols = [""] + cols   # col 0 = icône sans header
    t = QTableWidget(0, len(all_cols), parent)
    t.setHorizontalHeaderLabels(all_cols)
    t.setEditTriggers(QTableWidget.NoEditTriggers)
    t.setSelectionBehavior(QTableWidget.SelectRows)
    t.setSelectionMode(QTableWidget.SingleSelection)
    t.setFocusPolicy(Qt.ClickFocus)
    t.verticalHeader().setVisible(False)
    t.setShowGrid(False)
    t.setAlternatingRowColors(False)
    t.viewport().setMouseTracking(True)
    t.setStyleSheet(
        "QTableWidget { font-size: 14px; }"
        f"QHeaderView::section {{ font-size: 10px; color: {TEXT_DIM}; }}"
    )
    t.setIconSize(QSize(_TABLE_ICON_SZ, _TABLE_ICON_SZ))
    hh = t.horizontalHeader()
    hh.setSectionResizeMode(0, QHeaderView.Fixed)
    t.setColumnWidth(0, _ICON_COL_W)
    hh.setSectionResizeMode(1, QHeaderView.Stretch)   # OBJET
    for i in range(2, len(all_cols)):
        hh.setSectionResizeMode(i, QHeaderView.ResizeToContents)
    return t


def _set_row(
    table: QTableWidget,
    row: int,
    cells: list[tuple[str, int, str]],
    bg: QColor | None = None,
    row_height: int = _ROW_H,
):
    """Remplit les colonnes 1+ (col 0 = icône réservée)."""
    icon_it = QTableWidgetItem()
    icon_it.setFlags(Qt.ItemIsEnabled | Qt.ItemIsSelectable)
    if bg:
        icon_it.setBackground(bg)
    table.setItem(row, 0, icon_it)
    for col, (txt, align, color) in enumerate(cells, start=1):
        it = QTableWidgetItem(txt)
        it.setTextAlignment(align)
        it.setForeground(QColor(color))
        if bg:
            it.setBackground(bg)
        it.setFlags(Qt.ItemIsEnabled | Qt.ItemIsSelectable)
        table.setItem(row, col, it)
    table.setRowHeight(row, row_height)


# ── Popup tooltip style in-game ───────────────────────────────────────────────

# Rarity → (badge_background, border_color)
_RARITY_BADGE: dict[int, tuple[str, str]] = {
    0: ("#2e3b28", "#4a6a3a"),   # commun    (olive sombre)
    1: ("#2e3b28", "#4a6a3a"),   # commun
    2: ("#1e3a28", "#3a8a4a"),   # peu commun (vert)
    3: ("#1a2848", "#3a5acc"),   # rare       (bleu)
    4: ("#31184a", "#8a3acc"),   # mythique   (violet)
    5: ("#3e2010", "#cc6a1a"),   # légendaire (orange)
    6: ("#3e1414", "#aa2a2a"),   # relique    (rouge)
    7: ("#363014", "#aa8a1a"),   # souvenir   (or)
}


class _ItemTooltipPopup(QFrame):
    """Popup tooltip qui reproduit le style de l'info-bulle Wakfu in-game."""

    _instance: "_ItemTooltipPopup | None" = None

    @classmethod
    def get(cls) -> "_ItemTooltipPopup":
        if cls._instance is None:
            cls._instance = cls()
        return cls._instance

    def __init__(self):
        super().__init__(None, Qt.ToolTip | Qt.FramelessWindowHint)
        self.setAttribute(Qt.WA_ShowWithoutActivating)
        self.setObjectName("WakfuTip")
        self.setFixedWidth(310)

        # {item_name_lower: (lo, hi, source_label)}
        self._prices: dict[str, tuple[int, int, str]] = {}
        self._current_rarity = 0

        outer = QVBoxLayout(self)
        outer.setContentsMargins(12, 10, 12, 12)
        outer.setSpacing(0)

        # Badge rareté
        badge_row = QHBoxLayout()
        badge_row.setContentsMargins(0, 0, 0, 6)
        self._badge = QLabel()
        self._badge.setSizePolicy(QSizePolicy.Fixed, QSizePolicy.Fixed)
        badge_row.addWidget(self._badge)
        badge_row.addStretch()
        outer.addLayout(badge_row)

        # Icône (120×120) centrée au-dessus du titre
        self._icon_lbl = QLabel()
        self._icon_lbl.setFixedSize(120, 120)
        self._icon_lbl.setAlignment(Qt.AlignCenter)
        self._icon_lbl.setStyleSheet("background:transparent;")
        outer.addWidget(self._icon_lbl, 0, Qt.AlignHCenter)
        outer.addSpacing(8)

        # Titre
        self._title = QLabel()
        self._title.setWordWrap(True)
        self._title.setAlignment(Qt.AlignCenter)
        self._title.setStyleSheet(
            "color:#ffffff;font-size:15px;font-weight:bold;background:transparent;"
        )
        outer.addWidget(self._title)
        outer.addSpacing(4)

        # Type  ·  Niv. X
        self._meta = QLabel()
        self._meta.setAlignment(Qt.AlignCenter)
        self._meta.setStyleSheet(
            f"color:{TEXT_DIM};font-size:10px;background:transparent;"
        )
        outer.addWidget(self._meta)

        # Séparateur
        sep = QFrame()
        sep.setFrameShape(QFrame.HLine)
        sep.setStyleSheet(f"background:{BORDER};max-height:1px;border:none;margin:7px 0;")
        outer.addWidget(sep)

        # Prix estimé
        self._price_lbl = QLabel()
        self._price_lbl.setAlignment(Qt.AlignCenter)
        self._price_lbl.setStyleSheet(
            f"color:{TEAL};font-size:10px;font-weight:600;background:transparent;"
        )
        outer.addWidget(self._price_lbl)
        outer.addSpacing(6)

        # Description
        self._desc = QLabel()
        self._desc.setWordWrap(True)
        self._desc.setAlignment(Qt.AlignCenter)
        self._desc.setStyleSheet(
            "color:#9aaabb;font-size:10px;font-style:italic;background:transparent;"
        )
        outer.addWidget(self._desc)

    def set_prices(self, prices: dict[str, tuple[int, int, str]]):
        """{nom: (lo, hi, source)} — source = 'moy. 7j' ou 'dernière vente'."""
        self._prices = {k.lower(): v for k, v in prices.items()}

    def _apply_frame_style(self):
        _, border = _RARITY_BADGE.get(self._current_rarity, ("#2e3b28", "#4a6a3a"))
        self.setStyleSheet(f"""
            QFrame#WakfuTip {{
                background: #12151e;
                border: 1px solid {border};
                border-radius: 6px;
            }}
        """)

    def show_for(self, item_name: str, global_pos):
        data = get_item_data(item_name)
        if not data:
            return

        rarity  = data.get("rarity") or 0
        level   = data.get("level")
        type_id = data.get("type_id")
        title   = data.get("title") or item_name
        desc    = (data.get("desc") or "").replace("\r\n", " ").replace("\n", " ").strip()

        self._current_rarity = rarity
        rarity_label, _ = _RARITY_FR.get(rarity, ("", TEXT_DIM))
        badge_bg, badge_border = _RARITY_BADGE.get(rarity, ("#2e3b28", "#4a6a3a"))

        # Badge
        if rarity_label:
            self._badge.setText(rarity_label)
            self._badge.setStyleSheet(f"""
                QLabel {{
                    background:{badge_bg};border:1px solid {badge_border};
                    color:#ffffff;font-size:9px;font-weight:700;letter-spacing:0.5px;
                    padding:1px 8px;border-radius:3px;
                }}
            """)
            self._badge.setVisible(True)
        else:
            self._badge.setVisible(False)

        # Icône 120×120 — lecture directe depuis le disque pour ne pas utiliser le cache 24px
        gfx_id = get_gfx_id(item_name)
        if gfx_id:
            px = load_pixmap(gfx_id, 120)
            if px:
                self._icon_lbl.setPixmap(px)
                self._icon_lbl.setVisible(True)
            else:
                self._icon_lbl.setVisible(False)
        else:
            self._icon_lbl.setVisible(False)

        self._title.setText(title)

        # Type · Niveau
        meta_parts = []
        if type_id:
            tn = get_type_name(type_id)
            if tn:
                meta_parts.append(f"[{tn}]")
        if level:
            meta_parts.append(f"Niv. {level}")
        self._meta.setText("  ·  ".join(meta_parts))
        self._meta.setVisible(bool(meta_parts))

        # Prix estimé
        entry = self._prices.get(item_name.lower())
        if entry:
            lo, hi, source = entry
            if lo == hi:
                price_txt = f"Prix estimé ({source}) : {_fmt(lo)} {_KAMA}/u"
            else:
                price_txt = f"Prix estimé ({source}) : {_fmt(lo)} – {_fmt(hi)} {_KAMA}/u"
            self._price_lbl.setText(price_txt)
            self._price_lbl.setVisible(True)
        else:
            self._price_lbl.setVisible(False)

        # Description
        if desc:
            if not (desc.startswith('"') or desc.startswith("«")):
                desc = f'"{desc}"'
            if not (desc.endswith('"') or desc.endswith("»")):
                desc += '"'
            self._desc.setText(desc)
            self._desc.setVisible(True)
        else:
            self._desc.setVisible(False)

        self._apply_frame_style()
        self.adjustSize()

        x, y = global_pos.x() + 16, global_pos.y() + 8
        screen = QApplication.primaryScreen()
        if screen:
            r = screen.availableGeometry()
            if x + self.width()  > r.right():
                x = global_pos.x() - self.width() - 8
            if y + self.height() > r.bottom():
                y = global_pos.y() - self.height() - 8
        self.move(x, y)
        self.show()

    def close_popup(self):
        self.hide()


# ── Tooltip filter ────────────────────────────────────────────────────────────

class _TooltipFilter(QObject):
    """Event filter : MouseMove + timer 150ms → popup immédiate.
    ToolTip natif de Qt ignoré (trop lent)."""

    _DELAY_MS = 150

    def __init__(self, table: QTableWidget, parent=None):
        super().__init__(parent)
        self._table = table
        self._pending_name = ""
        self._pending_pos  = None
        self._timer = QTimer()
        self._timer.setSingleShot(True)
        self._timer.setInterval(self._DELAY_MS)
        self._timer.timeout.connect(self._show_pending)
        table.viewport().installEventFilter(self)

    def _name_at(self, pos) -> str:
        item = self._table.itemAt(pos)
        if item is None:
            return ""
        name_it = self._table.item(item.row(), 1)
        return name_it.text() if name_it else ""

    def _show_pending(self):
        if self._pending_name and self._pending_pos:
            _ItemTooltipPopup.get().show_for(self._pending_name, self._pending_pos)

    def eventFilter(self, obj, event):
        if obj is self._table.viewport():
            t = event.type()
            if t == QEvent.MouseMove:
                name = self._name_at(event.pos())
                if name:
                    if name != self._pending_name:
                        self._pending_name = name
                        self._pending_pos  = event.globalPos()
                        self._timer.start()
                    elif not _ItemTooltipPopup.get().isVisible():
                        self._pending_pos = event.globalPos()
                        self._timer.start()
                else:
                    self._timer.stop()
                    self._pending_name = ""
                    _ItemTooltipPopup.get().close_popup()
                return False   # ne pas consommer MouseMove
            if t == QEvent.ToolTip:
                return True    # absorber le tooltip natif Qt (trop lent)
            if t in (QEvent.Leave, QEvent.MouseButtonPress):
                self._timer.stop()
                self._pending_name = ""
                _ItemTooltipPopup.get().close_popup()
        return super().eventFilter(obj, event)


# ── Compact icon button (Overview grid) ──────────────────────────────────────

class _ItemIconButton(QWidget):
    """Bouton icône compact pour la grille Overview — clic → navigue vers Mes Ventes."""

    item_clicked = pyqtSignal(str)   # item_name

    def __init__(self, item_name: str, parent=None):
        super().__init__(parent)
        self._name = item_name
        cell = _GRID_ICON_SZ + 8
        self.setFixedSize(cell, cell)
        self.setCursor(Qt.PointingHandCursor)
        self.setToolTip(item_name)

        lay = QVBoxLayout(self)
        lay.setContentsMargins(4, 4, 4, 4)
        lay.setSpacing(0)

        self._lbl = QLabel()
        self._lbl.setFixedSize(_GRID_ICON_SZ, _GRID_ICON_SZ)
        self._lbl.setAlignment(Qt.AlignCenter)
        self._lbl.setStyleSheet(
            f"background:{BG_PANEL};border:1px solid {BORDER};border-radius:4px;"
        )
        lay.addWidget(self._lbl)

    def set_pixmap(self, px):
        self._lbl.setPixmap(px)

    def mousePressEvent(self, event):
        if event.button() == Qt.LeftButton:
            self.item_clicked.emit(self._name)
        super().mousePressEvent(event)


# ── Sub-tab nav bar ───────────────────────────────────────────────────────────

class _SubTabBar(QWidget):
    def __init__(self, labels: list[tuple[str, str]], parent=None):
        super().__init__(parent)
        self._btns: dict[str, QPushButton] = {}
        lay = QHBoxLayout(self)
        lay.setContentsMargins(0, 0, 0, 0)
        lay.setSpacing(4)
        for key, label in labels:
            btn = QPushButton(label)
            btn.setCheckable(True)
            btn.setObjectName("hdvSubTab")
            btn.setCursor(Qt.PointingHandCursor)
            btn.setStyleSheet(f"""
                QPushButton#hdvSubTab {{
                    background: transparent;
                    border: none;
                    border-bottom: 2px solid transparent;
                    border-radius: 0px;
                    color: {TEXT_DIM};
                    font-size: 11px;
                    font-weight: 600;
                    padding: 6px 14px;
                }}
                QPushButton#hdvSubTab:hover {{
                    color: {TEAL};
                    border-bottom-color: {BORDER2};
                }}
                QPushButton#hdvSubTab:checked {{
                    color: {TEAL_BRIGHT};
                    border-bottom-color: {TEAL};
                }}
            """)
            self._btns[key] = btn
            lay.addWidget(btn)
        lay.addStretch()

    def set_active(self, key: str):
        for k, btn in self._btns.items():
            btn.setChecked(k == key)

    def buttons(self) -> dict[str, QPushButton]:
        return self._btns


# ── Overview page — market intelligence ──────────────────────────────────────

class _OverviewPage(QWidget):
    """
    Vue d'ensemble orientée rentabilité :
    - Métriques clés (mes offres, valeur, meilleur prix/u, taxes)
    - Grille compacte d'icônes cliquables → navigation vers Mes Ventes
    - Sections futures : plus demandés, rentables à fabriquer
    """

    def __init__(self, on_item_click=None, parent=None):
        super().__init__(parent)
        self._on_item_click = on_item_click

        scroll = QScrollArea(self)
        scroll.setWidgetResizable(True)
        scroll.setFrameShape(QFrame.NoFrame)
        scroll.setHorizontalScrollBarPolicy(Qt.ScrollBarAlwaysOff)

        root_w = QWidget()
        root = QVBoxLayout(root_w)
        root.setContentsMargins(12, 12, 12, 12)
        root.setSpacing(14)
        root.setAlignment(Qt.AlignTop)
        scroll.setWidget(root_w)

        outer = QVBoxLayout(self)
        outer.setContentsMargins(0, 0, 0, 0)
        outer.addWidget(scroll)

        # ── Métriques ─────────────────────────────────────────────────────
        stats_row = QHBoxLayout()
        stats_row.setSpacing(8)
        self._c_offres,  self._l_offres  = _stat_card("MES OFFRES ACTIVES", TEXT)
        self._c_valeur,  self._l_valeur  = _stat_card("VALEUR PRÉVISIONNELLE", TEAL)
        self._c_best,    self._l_best    = _stat_card("MEILLEUR PRIX/U", TEAL)
        self._c_taxes,   self._l_taxes   = _stat_card("TAXES PAYÉES", RED)
        for c in (self._c_offres, self._c_valeur, self._c_best, self._c_taxes):
            stats_row.addWidget(c, 1)
        root.addLayout(stats_row)

        # ── Grille compacte d'articles ─────────────────────────────────────
        root.addWidget(_section_header(
            "Mes articles en vente",
            "Classés par valeur estimée · cliquez sur une icône pour voir le détail",
        ))
        self._grid_widget = QWidget()
        self._grid_layout = QGridLayout(self._grid_widget)
        self._grid_layout.setSpacing(6)
        self._grid_layout.setContentsMargins(0, 0, 0, 0)
        self._grid_layout.setAlignment(Qt.AlignTop | Qt.AlignLeft)
        root.addWidget(self._grid_widget)

        # ── Sections futures ───────────────────────────────────────────────
        root.addWidget(_section_header(
            "Plus demandés",
            "Objets avec le plus d'ordres d'achat actifs — nécessite un scan de l'HDV",
        ))
        _dim = QLabel("Données à venir — scannez l'HDV depuis l'outil dédié")
        _dim.setStyleSheet(
            f"color:{TEXT_DIM};font-size:10px;font-style:italic;background:transparent;padding:6px 0;"
        )
        root.addWidget(_dim)

        root.addWidget(_section_header(
            "Rentables à fabriquer",
            "Marge bénéficiaire nette (prix de vente − coût ressources) — nécessite les recettes",
        ))
        _dim2 = QLabel("Données à venir — recettes de fabrication non encore importées")
        _dim2.setStyleSheet(
            f"color:{TEXT_DIM};font-size:10px;font-style:italic;background:transparent;padding:6px 0;"
        )
        root.addWidget(_dim2)

        root.addStretch()

        # Références aux boutons grille pour mise à jour des icônes
        self._grid_buttons: dict[str, _ItemIconButton] = {}

    def update_data(self, deposits: list[dict], days: int, rate: int):
        # Vider la grille
        while self._grid_layout.count():
            item = self._grid_layout.takeAt(0)
            if item.widget():
                item.widget().deleteLater()
        self._grid_buttons.clear()

        if not deposits:
            self._l_offres.setText("--")
            self._l_valeur.setText("--")
            self._l_best.setText("--")
            self._l_taxes.setText("--")
            return

        # Calcul des métriques
        total_taxes = sum(d["tax"] for d in deposits)
        total_valeur = 0
        best_unit = 0
        best_item = ""

        rows: list[tuple[dict, int, int]] = []
        for dep in deposits:
            lo, hi = estimate_market_price(dep["tax"], dep["qty"], days, rate)
            mid_unit = round((lo + hi) / 2)
            tot = mid_unit * dep["qty"]
            total_valeur += tot
            if mid_unit > best_unit:
                best_unit = mid_unit
                best_item = dep["item"]
            rows.append((dep, lo, hi))

        n = len(deposits)
        total_qty = sum(d["qty"] for d in deposits)

        self._l_offres.setText(f"{n} · {total_qty} obj.")
        self._l_valeur.setText(_fmt_short(total_valeur))
        self._l_taxes.setText(f"-{_fmt(total_taxes)} {_KAMA}")
        if best_unit:
            self._l_best.setText(f"~{_fmt_short(best_unit)}")
            self._l_best.setToolTip(best_item)
        else:
            self._l_best.setText("--")

        # Tri : valeur totale décroissante, puis prix/u décroissant (évite les inversions à égalité)
        rows.sort(
            key=lambda x: (round((x[1] + x[2]) / 2) * x[0]["qty"], round((x[1] + x[2]) / 2)),
            reverse=True,
        )

        # Peupler la grille
        for idx, (dep, _lo, _hi) in enumerate(rows):
            btn = _ItemIconButton(dep["item"])
            if self._on_item_click:
                btn.item_clicked.connect(self._on_item_click)
            r, c = divmod(idx, _GRID_COLS)
            self._grid_layout.addWidget(btn, r, c)
            self._grid_buttons[dep["item"]] = btn

    def set_icon(self, item_name: str, px):
        """Applique un pixmap sur le bouton grille correspondant."""
        btn = self._grid_buttons.get(item_name)
        if btn:
            btn.set_pixmap(px)


# ── Mes offres de vente page ──────────────────────────────────────────────────

class _MesVentesPage(QWidget):
    def __init__(self, parent=None):
        super().__init__(parent)
        lay = QVBoxLayout(self)
        lay.setContentsMargins(12, 12, 12, 12)
        lay.setSpacing(8)

        # Cartes stats — 2 par ligne
        row1 = QHBoxLayout()
        row1.setSpacing(8)
        self._c_offres, self._l_offres = _stat_card("OFFRES", TEXT)
        self._c_valeur, self._l_valeur = _stat_card("VALEUR EST.", TEAL)
        for c in (self._c_offres, self._c_valeur):
            c.setMaximumHeight(72)
            row1.addWidget(c, 1)
        lay.addLayout(row1)

        row2 = QHBoxLayout()
        row2.setSpacing(8)
        self._c_taxes, self._l_taxes = _stat_card("TAXES PAYÉES", RED)
        self._c_taxes.setMaximumHeight(72)
        row2.addWidget(self._c_taxes, 1)
        row2.addStretch(1)
        lay.addLayout(row2)

        # Table sans PRIX MIN / PRIX MAX
        self._table = _make_table([
            "OBJET", "QTÉ", f"TAXE ({_KAMA})",
            f"VALEUR TOT. ({_KAMA})", "DATE DÉPÔT",
        ])
        self._tip_filter = _TooltipFilter(self._table, self)
        lay.addWidget(self._table, 1)

    def update_data(self, deposits: list[dict], days: int, rate: int):
        total_taxes = sum(d["tax"] for d in deposits)
        total_valeur = 0
        rows = sorted(deposits, key=lambda d: d["dt"], reverse=True)

        self._table.setRowCount(len(rows))
        for row, dep in enumerate(rows):
            lo, hi = estimate_market_price(dep["tax"], dep["qty"], days, rate)
            mid_tot = round((lo + hi) / 2) * dep["qty"]
            total_valeur += mid_tot
            date_str = dep["dt"].strftime("%d/%m/%Y %H:%M")
            bg = QColor("#16191f") if row % 2 == 0 else QColor("#12161d")
            _set_row(self._table, row, [
                (dep["item"],     Qt.AlignLeft | Qt.AlignVCenter, TEXT),
                (str(dep["qty"]), Qt.AlignCenter,                 TEXT_DIM),
                (str(dep["tax"]), Qt.AlignCenter,                 RED),
                (_fmt(mid_tot),   Qt.AlignCenter,                 GREEN),
                (date_str,        Qt.AlignCenter,                 TEXT_DIM),
            ], bg, row_height=_ROW_H_MES)

        n = len(deposits)
        total_qty = sum(d["qty"] for d in deposits)
        self._l_offres.setText(f"{n} · {total_qty} obj.")
        self._l_valeur.setText(_fmt_short(total_valeur) if total_valeur else "--")
        self._l_taxes.setText(f"-{_fmt(total_taxes)} {_KAMA}" if total_taxes else "--")

    def scroll_to_item(self, item_name: str):
        """Sélectionne et scroll jusqu'à la ligne correspondant à item_name."""
        for row in range(self._table.rowCount()):
            it = self._table.item(row, 1)
            if it and it.text() == item_name:
                self._table.scrollToItem(it)
                self._table.selectRow(row)
                break


# ── Main HDV tab ──────────────────────────────────────────────────────────────

class HdvTab(BaseTab):
    def __init__(self, parent=None):
        super().__init__(parent)

        self._deposits: list[dict] = []
        self._market_days: int = 28
        self._market_rate: int = 5

        root = QVBoxLayout(self)
        root.setContentsMargins(10, 6, 10, 10)
        root.setSpacing(0)

        # Sub-tab bar
        self._tab_bar = _SubTabBar(_SUB_TABS, self)
        root.addWidget(self._tab_bar)

        # Separator
        sep = QFrame()
        sep.setFrameShape(QFrame.HLine)
        sep.setStyleSheet(f"background:{BORDER};max-height:1px;border:none;")
        root.addWidget(sep)
        root.addSpacing(6)

        # Stacked pages
        self._stack = QStackedWidget(self)
        self._pages: dict[str, QWidget] = {}

        self._mes_ventes_page = _MesVentesPage()
        self._overview_page   = _OverviewPage(on_item_click=self._on_overview_item_click)

        self._pages["overview"]     = self._overview_page
        self._pages["mes_ventes"]   = self._mes_ventes_page
        self._pages["mes_achats"]   = WipWidget("Mes offres d'achat")
        self._pages["offres_vente"] = WipWidget("Offres de vente · scan HDV")
        self._pages["offres_achat"] = WipWidget("Offres d'achat · scan HDV")

        for page in self._pages.values():
            self._stack.addWidget(page)

        root.addWidget(self._stack, 1)

        # Wire navigation
        for key, btn in self._tab_bar.buttons().items():
            btn.clicked.connect(lambda _checked=False, k=key: self._switch_to(k))

        self._switch_to("overview")

        # Service d'icônes
        self._icon_svc = ItemIconService.instance()
        self._icon_map: dict[int, list[tuple[QTableWidget, int]]] = {}
        self._icon_grid_map: dict[int, list[str]] = {}   # gfxId → [item_name] pour la grille
        self._icon_svc.icon_ready.connect(self._on_icon_ready)

        self.refresh()

    def _on_overview_item_click(self, item_name: str):
        """Navigue vers Mes Ventes et scroll jusqu'à l'article cliqué."""
        self._switch_to("mes_ventes")
        self._mes_ventes_page.scroll_to_item(item_name)

    def _switch_to(self, key: str):
        self._tab_bar.set_active(key)
        page = self._pages.get(key)
        if page is not None:
            self._stack.setCurrentWidget(page)

    def _on_icon_ready(self, gfx_id: int, px):
        """Applique l'icône sur toutes les cellules et boutons grille en attente."""
        icon = QIcon(px)
        for table, row in self._icon_map.pop(gfx_id, []):
            it = table.item(row, 0)
            if it is not None:
                it.setIcon(icon)
        # Grille Overview : rescaler à _GRID_ICON_SZ
        grid_items = self._icon_grid_map.pop(gfx_id, [])
        if grid_items:
            scaled = px.scaled(_GRID_ICON_SZ, _GRID_ICON_SZ, Qt.KeepAspectRatio, Qt.SmoothTransformation)
            for item_name in grid_items:
                self._overview_page.set_icon(item_name, scaled)

    def _request_grid_icon(self, item_name: str):
        """Charge l'icône pour un bouton de la grille Overview."""
        gfx_id = get_gfx_id(item_name)
        if gfx_id is None:
            return
        px = self._icon_svc.get_cached(gfx_id, _GRID_ICON_SZ)
        if px is not None:
            self._overview_page.set_icon(item_name, px)
            return
        self._icon_grid_map.setdefault(gfx_id, []).append(item_name)
        self._icon_svc.request(gfx_id, size=_TABLE_ICON_SZ)   # télécharge en grand, on rescalera

    def _request_icon(self, table: QTableWidget, row: int, item_name: str):
        gfx_id = get_gfx_id(item_name)
        if gfx_id is None:
            return
        # Vérifier le cache synchrone d'abord
        px = self._icon_svc.get_cached(gfx_id, _TABLE_ICON_SZ)
        if px is not None:
            it = table.item(row, 0)
            if it is not None:
                it.setIcon(QIcon(px))
            return
        # Enregistrer dans le map et lancer la requête async
        self._icon_map.setdefault(gfx_id, []).append((table, row))
        self._icon_svc.request(gfx_id, size=_TABLE_ICON_SZ)

    # ── Public API ────────────────────────────────────────────────────────────

    def set_market_settings(self, days: int, rate: int):
        self._market_days = days
        self._market_rate = rate
        self._refresh_pages()

    def refresh(self):
        self._deposits = read_permanent_market_deposits()
        self._refresh_pages()

    def _refresh_pages(self):
        self._icon_map.clear()
        self._icon_grid_map.clear()
        self._overview_page.update_data(self._deposits, self._market_days, self._market_rate)
        self._mes_ventes_page.update_data(self._deposits, self._market_days, self._market_rate)

        # Prix estimé par objet : moyenne sur 7j glissants, sinon dernière vente
        cutoff = datetime.now() - timedelta(days=7)
        by_item: dict[str, list[dict]] = {}
        for dep in self._deposits:
            by_item.setdefault(dep["item"], []).append(dep)

        prices: dict[str, tuple[int, int, str]] = {}
        for item_name, deps in by_item.items():
            recent = [d for d in deps if d["dt"] >= cutoff]
            if recent:
                pairs = [estimate_market_price(d["tax"], d["qty"],
                         self._market_days, self._market_rate) for d in recent]
                lo = round(sum(p[0] for p in pairs) / len(pairs))
                hi = round(sum(p[1] for p in pairs) / len(pairs))
                source = "moy. 7j"
            else:
                latest = max(deps, key=lambda d: d["dt"])
                lo, hi = estimate_market_price(latest["tax"], latest["qty"],
                                               self._market_days, self._market_rate)
                source = "dernière vente"
            prices[item_name] = (lo, hi, source)
        _ItemTooltipPopup.get().set_prices(prices)

        # Icônes : table Mes Ventes (triée par date)
        for row, dep in enumerate(
            sorted(self._deposits, key=lambda d: d["dt"], reverse=True)
        ):
            self._request_icon(self._mes_ventes_page._table, row, dep["item"])

        # Icônes : grille Overview (un bouton par article unique)
        seen: set[str] = set()
        for dep in self._deposits:
            if dep["item"] not in seen:
                seen.add(dep["item"])
                self._request_grid_icon(dep["item"])
