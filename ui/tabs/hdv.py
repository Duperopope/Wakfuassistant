from __future__ import annotations

# ui/tabs/hdv.py — Onglet HDV (Hôtel des Ventes)
# Sous-onglets : Overview · Mes ventes · Mes achats · Offres de vente · Offres d'achat

import json
from pathlib import Path
from datetime import datetime, timedelta

from PyQt5.QtCore import QEvent, QObject, QPoint, QSize, Qt, QTimer, QSettings, pyqtSignal
from PyQt5.QtGui import QColor, QIcon
from PyQt5.QtWidgets import (
    QApplication,
    QFrame,
    QHBoxLayout,
    QHeaderView,
    QLabel,
    QMenu,
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

from core.item_icons import (
    ItemIconService,
    get_gfx_id,
    get_item_data,
    get_item_rarity_candidates,
    get_type_name,
    load_pixmap,
    _RARITY_FR,
)
from core.permanent_journal import estimate_market_price, read_permanent_market_deposits
from ui.tabs.base import BaseTab
from ui.theme import (
    BG, BG_PANEL, BG_PANEL2, BORDER, BORDER2,
    GREEN, RED, TEAL, TEAL_BRIGHT, TEXT, TEXT_DIM,
)

_KAMA = "₭"

_WAKFU_THEME_ROOT = Path("H:/Games/Wakfu/themes/theme_Ymoka_Nightflow/theme/images/itemsRarityBorders")
_RARITY_BORDER_FILE = {
    0: "common.png",
    1: "common.png",
    2: "rare.png",
    3: "mythic.png",
    4: "legendary.png",
    5: "relic.png",
    6: "souvenir.png",
    7: "epic.png",
}

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
    0: ("#a8acb3", "#a8acb3"),
    1: ("#b7bcc4", "#b7bcc4"),
    2: ("#28F18B", "#28F18B"),
    3: ("#FD8E39", "#FD8E39"),
    4: ("#FEDE71", "#FEDE71"),
    5: ("#FF47E7", "#FF47E7"),
    6: ("#8FC7E2", "#8FC7E2"),
    7: ("#FD87BA", "#FD87BA"),
}


class _ItemTooltipPopup(QFrame):
    """Popup tooltip inspiré des maquettes HTML fournies (style Wakfu infobox)."""

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
        self.setFixedWidth(338)

        # {item_name_lower: (lo, hi, source_label)}
        self._prices: dict[str, tuple[int, int, str]] = {}
        # {item_name_lower: rarity_id}
        self._rarity_overrides: dict[str, int] = {}
        self._current_rarity = 0

        outer = QVBoxLayout(self)
        outer.setContentsMargins(9, 9, 9, 9)
        outer.setSpacing(6)

        # Badge rareté
        self._badge = QLabel()
        self._badge.setSizePolicy(QSizePolicy.Fixed, QSizePolicy.Fixed)
        badge_row = QHBoxLayout()
        badge_row.setContentsMargins(2, 0, 0, 0)
        badge_row.addWidget(self._badge)
        badge_row.addStretch()
        outer.addLayout(badge_row)

        self._content = QFrame()
        self._content.setObjectName("WakfuTipContent")
        content_lay = QVBoxLayout(self._content)
        content_lay.setContentsMargins(10, 10, 10, 10)
        content_lay.setSpacing(8)
        outer.addWidget(self._content)

        # Icône + méta
        top_row = QHBoxLayout()
        top_row.setContentsMargins(0, 0, 0, 0)
        top_row.setSpacing(10)

        self._icon_wrap = QFrame()
        self._icon_wrap.setFixedSize(122, 122)
        self._icon_wrap.setObjectName("WakfuTipIconWrap")
        icon_wrap_lay = QVBoxLayout(self._icon_wrap)
        icon_wrap_lay.setContentsMargins(1, 1, 1, 1)
        icon_wrap_lay.setSpacing(0)

        self._icon_lbl = QLabel()
        self._icon_lbl.setFixedSize(120, 120)
        self._icon_lbl.setAlignment(Qt.AlignCenter)
        self._icon_lbl.setStyleSheet("background: transparent; border: none;")
        icon_wrap_lay.addWidget(self._icon_lbl, 0, Qt.AlignCenter)
        top_row.addWidget(self._icon_wrap, 0, Qt.AlignTop)

        meta_col = QVBoxLayout()
        meta_col.setContentsMargins(0, 0, 0, 0)
        meta_col.setSpacing(3)

        # Titre
        self._title = QLabel()
        self._title.setWordWrap(True)
        self._title.setAlignment(Qt.AlignLeft | Qt.AlignVCenter)
        self._title.setStyleSheet(
            "color:#efe9db;font-size:15px;font-weight:700;"
            "font-family:'Times New Roman';background:transparent;"
        )
        meta_col.addWidget(self._title)

        # Type  ·  Niv. X
        self._meta = QLabel()
        self._meta.setAlignment(Qt.AlignLeft | Qt.AlignVCenter)
        self._meta.setStyleSheet(
            "color:#c6c4bc;font-size:10px;background:transparent;"
        )
        meta_col.addWidget(self._meta)

        self._price_lbl = QLabel()
        self._price_lbl.setAlignment(Qt.AlignLeft | Qt.AlignVCenter)
        self._price_lbl.setStyleSheet(
            "color:#6fd0c0;font-size:11px;font-weight:700;background:transparent;"
        )
        meta_col.addWidget(self._price_lbl)

        self._source_lbl = QLabel()
        self._source_lbl.setAlignment(Qt.AlignLeft | Qt.AlignVCenter)
        self._source_lbl.setStyleSheet(
            "color:#8f949b;font-size:9px;font-style:italic;background:transparent;"
        )
        meta_col.addWidget(self._source_lbl)
        meta_col.addStretch(1)

        top_row.addLayout(meta_col, 1)
        content_lay.addLayout(top_row)

        # Séparateur
        sep = QFrame()
        sep.setFrameShape(QFrame.HLine)
        sep.setStyleSheet("background:rgba(179, 169, 136, 120);max-height:1px;border:none;margin:0;")
        content_lay.addWidget(sep)

        # Effets / attributs (visuel type tableau)
        self._effects = QFrame()
        self._effects.setObjectName("WakfuTipEffects")
        effects_lay = QVBoxLayout(self._effects)
        effects_lay.setContentsMargins(6, 6, 6, 6)
        effects_lay.setSpacing(4)

        self._eff_unit = QLabel("Valeur estimée/u : --")
        self._eff_unit.setStyleSheet("color:#e7d49d;font-size:10px;background:transparent;")
        effects_lay.addWidget(self._eff_unit)

        self._eff_range = QLabel("Fourchette : --")
        self._eff_range.setStyleSheet("color:#b9bec7;font-size:10px;background:transparent;")
        effects_lay.addWidget(self._eff_range)

        self._eff_market = QLabel("Tendance : --")
        self._eff_market.setStyleSheet("color:#93d8ca;font-size:10px;background:transparent;")
        effects_lay.addWidget(self._eff_market)

        content_lay.addWidget(self._effects)

        # Description
        self._desc_title = QLabel("Description")
        self._desc_title.setStyleSheet(
            "color:#d2cec2;font-size:10px;font-weight:700;letter-spacing:0.2px;background:transparent;"
        )
        content_lay.addWidget(self._desc_title)

        self._desc = QLabel()
        self._desc.setWordWrap(True)
        self._desc.setAlignment(Qt.AlignLeft | Qt.AlignTop)
        self._desc.setStyleSheet(
            "color:#b7bccc;font-size:10px;font-style:italic;background:transparent;"
        )
        content_lay.addWidget(self._desc)

    def _fmt_game_kamas(self, value: int) -> str:
        # Format proche du jeu: "27 k" / "1 245 k"
        k = max(0, int(round(value / 1000.0)))
        return f"{_fmt(k)} k"

    def set_prices(self, prices: dict[str, tuple[int, int, str]]):
        """{nom: (lo, hi, source)} — source = 'moy. 7j' ou 'dernière vente'."""
        self._prices = {k.lower(): v for k, v in prices.items()}

    def set_rarity_overrides(self, overrides: dict[str, int]):
        clean: dict[str, int] = {}
        for key, value in overrides.items():
            name = str(key or "").strip().lower()
            if not name:
                continue
            try:
                rid = int(value)
            except (TypeError, ValueError):
                continue
            if 0 <= rid <= 7:
                clean[name] = rid
        self._rarity_overrides = clean

    def _apply_frame_style(self):
        _, border = _RARITY_BADGE.get(self._current_rarity, ("#2e3b28", "#4a6a3a"))
        self.setStyleSheet(f"""
            QFrame#WakfuTip {{
                background: rgba(20, 21, 25, 248);
                border: 2px solid {border};
                border-radius: 7px;
            }}
            QFrame#WakfuTipContent {{
                background: qlineargradient(
                    x1:0, y1:0, x2:0, y2:1,
                    stop:0 rgba(56, 58, 66, 235),
                    stop:1 rgba(32, 34, 41, 235)
                );
                border: 1px solid rgba(180, 168, 137, 75);
                border-radius: 6px;
            }}
            QFrame#WakfuTipIconWrap {{
                background: rgba(20, 18, 15, 150);
                border: 1px solid rgba(136, 124, 91, 130);
                border-radius: 6px;
            }}
            QFrame#WakfuTipEffects {{
                background: rgba(19, 21, 27, 145);
                border: 1px solid rgba(127, 132, 145, 95);
                border-radius: 4px;
            }}
        """)

        border_img = self._rarity_border_path(self._current_rarity)
        if border_img:
            # Draw rarity frame on top of icon area when local theme border is available.
            self._icon_wrap.setStyleSheet(
                f"QFrame#WakfuTipIconWrap{{"
                f"border-image: url('{border_img}') 37 37 37 37 stretch stretch;"
                f"background: rgba(17, 14, 9, 120);"
                f"}}"
            )

    def _rarity_border_path(self, rarity: int) -> str:
        name = _RARITY_BORDER_FILE.get(int(rarity), "common.png")
        path = _WAKFU_THEME_ROOT / name
        if not path.exists():
            return ""
        return path.as_posix()

    def show_for(self, item_name: str, global_pos):
        data = get_item_data(item_name)
        if not data:
            return

        rarity_raw = data.get("rarity")
        try:
            rarity = int(rarity_raw)
        except (TypeError, ValueError):
            rarity = 0
        name_key = item_name.lower()
        manual_rarity = self._rarity_overrides.get(name_key, None)
        if manual_rarity is not None:
            rarity = int(manual_rarity)
        else:
            # Si plusieurs raretés existent pour un même libellé, prendre la plus basse
            # (comportement conservateur qui colle mieux au rendu in-game par défaut).
            candidates = get_item_rarity_candidates(item_name)
            if candidates:
                rarity = int(min(candidates))

        level = data.get("level")
        type_id = data.get("type_id")
        title = data.get("title") or item_name
        desc = (data.get("desc") or "").replace("\r\n", " ").replace("\n", " ").strip()

        self._current_rarity = rarity
        rarity_label, _ = _RARITY_FR.get(rarity, ("", TEXT_DIM))
        badge_bg, badge_border = _RARITY_BADGE.get(rarity, ("#2e3b28", "#4a6a3a"))

        # Badge
        if rarity_label:
            self._badge.setText(rarity_label)
            self._badge.setStyleSheet(f"""
                QLabel {{
                    background:{badge_bg};border:1px solid {badge_border};
                    color:#121317;font-size:9px;font-weight:800;letter-spacing:0.4px;
                    padding:1px 9px;border-radius:3px;
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
                meta_parts.append(tn)
        if level:
            meta_parts.append(f"Niv. {level}")
        self._meta.setText("  ·  ".join(meta_parts))
        self._meta.setVisible(bool(meta_parts))

        # Prix estimé + section effets
        entry = self._prices.get(item_name.lower())
        if entry:
            lo, hi, _source = entry
            if lo == hi:
                price_txt = f"Prix moyen : {self._fmt_game_kamas(lo)} /u"
                range_txt = "Fourchette : stable"
            else:
                mid = round((lo + hi) / 2)
                price_txt = f"Prix moyen : {self._fmt_game_kamas(mid)} /u"
                range_txt = f"Fourchette : {self._fmt_game_kamas(lo)} a {self._fmt_game_kamas(hi)}"
            self._price_lbl.setText(price_txt)
            self._price_lbl.setVisible(True)
            self._source_lbl.setText(f"Source: {_source}")
            self._source_lbl.setVisible(True)
            self._eff_unit.setText(f"Valeur estimée/u : {self._fmt_game_kamas(round((lo + hi) / 2))}")
            self._eff_range.setText(range_txt)
            self._eff_market.setText("Tendance : demande active" if hi > lo else "Tendance : stable")
            self._effects.setVisible(True)
        else:
            self._price_lbl.setVisible(False)
            self._source_lbl.setVisible(False)
            self._eff_unit.setText("Valeur estimée/u : --")
            self._eff_range.setText("Fourchette : --")
            self._eff_market.setText("Tendance : inconnue")
            self._effects.setVisible(True)

        # Description
        if desc:
            if not (desc.startswith('"') or desc.startswith("«")):
                desc = f'"{desc}"'
            if not (desc.endswith('"') or desc.endswith("»")):
                desc += '"'
            self._desc.setText(desc)
            self._desc.setVisible(True)
            self._desc_title.setVisible(True)
        else:
            self._desc.setVisible(False)
            self._desc_title.setVisible(False)

        self._apply_frame_style()
        self.adjustSize()

        x, y = global_pos.x() + 16, global_pos.y() + 8
        screen = QApplication.primaryScreen()
        if screen:
            r = screen.availableGeometry()
            if x + self.width() > r.right():
                x = global_pos.x() - self.width() - 8
            if y + self.height() > r.bottom():
                y = global_pos.y() - self.height() - 8
        self.move(x, y)
        self.show()

    def close_popup(self):
        self.hide()


class _PlaceholderBookPage(QWidget):
    """Page HDV stylée pour onglets sans source de données live."""

    def __init__(self, title: str, subtitle: str, empty_hint: str, columns: list[str], parent=None):
        super().__init__(parent)
        lay = QVBoxLayout(self)
        lay.setContentsMargins(12, 12, 12, 12)
        lay.setSpacing(8)

        lay.addWidget(_section_header(title, subtitle))

        hint = QLabel(empty_hint)
        hint.setWordWrap(True)
        hint.setStyleSheet(
            f"color:{TEXT_DIM};font-size:10px;background:{BG_PANEL};"
            f"border:1px solid {BORDER};border-radius:6px;padding:8px;"
        )
        lay.addWidget(hint)

        self._table = _make_table(columns)
        self._table.setRowCount(0)
        lay.addWidget(self._table, 1)

    def refresh(self):
        self._table.setRowCount(0)


class _OffresVentePage(QWidget):
    """Synthèse par objet des dépôts observés pour donner une vue "offres de vente"."""

    def __init__(self, on_item_context=None, parent=None):
        super().__init__(parent)
        self._on_item_context = on_item_context
        self._row_items: list[str] = []

        lay = QVBoxLayout(self)
        lay.setContentsMargins(12, 12, 12, 12)
        lay.setSpacing(8)

        stats_row = QHBoxLayout()
        stats_row.setSpacing(8)
        self._c_items, self._l_items = _stat_card("OBJETS SUIVIS", TEXT)
        self._c_offers, self._l_offers = _stat_card("DEPOTS OBSERVES", TEXT)
        self._c_volume, self._l_volume = _stat_card("VOLUME TOTAL", TEAL)
        for c in (self._c_items, self._c_offers, self._c_volume):
            c.setMaximumHeight(72)
            stats_row.addWidget(c, 1)
        lay.addLayout(stats_row)

        lay.addWidget(_section_header(
            "Offres de vente (historique)",
            "Agrégation des dépôts détectés dans le journal permanent",
        ))

        self._table = _make_table([
            "OBJET", "OFFRES", "QTE", f"PRIX EST./U ({_KAMA})", "DERNIER DEPOT",
        ])
        self._tip_filter = _TooltipFilter(self._table, self)
        self._table.setContextMenuPolicy(Qt.CustomContextMenu)
        self._table.customContextMenuRequested.connect(self._on_table_context_menu)
        lay.addWidget(self._table, 1)

    def _on_table_context_menu(self, pos):
        if self._on_item_context is None:
            return
        item = self._table.itemAt(pos)
        if item is None:
            return
        name_item = self._table.item(item.row(), 1)
        if name_item is None:
            return
        self._on_item_context(name_item.text(), self._table.viewport().mapToGlobal(pos))

    def update_data(self, deposits: list[dict], days: int, rate: int):
        grouped: dict[str, list[dict]] = {}
        for dep in deposits:
            grouped.setdefault(dep["item"], []).append(dep)

        rows: list[tuple[str, int, int, int, datetime]] = []
        for item_name, deps in grouped.items():
            offers = len(deps)
            qty = sum(int(d.get("qty") or 0) for d in deps)
            latest = max((d.get("dt") for d in deps), default=datetime.now())
            last_dep = max(deps, key=lambda d: d.get("dt") or datetime.min)
            lo, hi = estimate_market_price(last_dep.get("tax", 0), max(1, last_dep.get("qty", 1)), days, rate)
            mid_unit = round((lo + hi) / 2)
            rows.append((item_name, offers, qty, mid_unit, latest))

        rows.sort(key=lambda x: (x[3], x[2], x[1]), reverse=True)

        self._row_items = [r[0] for r in rows]
        self._table.setRowCount(len(rows))
        for row, (item_name, offers, qty, mid_unit, latest) in enumerate(rows):
            bg = QColor("#16191f") if row % 2 == 0 else QColor("#12161d")
            _set_row(self._table, row, [
                (item_name, Qt.AlignLeft | Qt.AlignVCenter, TEXT),
                (str(offers), Qt.AlignCenter, TEXT_DIM),
                (str(qty), Qt.AlignCenter, TEXT_DIM),
                (f"{_fmt(mid_unit)} {_KAMA}", Qt.AlignCenter, GREEN),
                (latest.strftime("%d/%m/%Y %H:%M"), Qt.AlignCenter, TEXT_DIM),
            ], bg, row_height=_ROW_H_MES)

        self._l_items.setText(str(len(rows)) if rows else "--")
        self._l_offers.setText(str(len(deposits)) if deposits else "--")
        self._l_volume.setText(f"{sum(r[2] for r in rows)} obj." if rows else "--")

    def iter_table_rows(self):
        for row, name in enumerate(self._row_items):
            yield row, name


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
        # Le popup article ne doit apparaître que sur l'icône/nom,
        # pas sur les colonnes numériques (taxe, valeur, date).
        if item.column() not in (0, 1):
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
    item_right_clicked = pyqtSignal(str, QPoint)  # item_name, global_pos

    def __init__(self, item_name: str, parent=None):
        super().__init__(parent)
        self._name = item_name
        cell = _GRID_ICON_SZ + 8
        self.setFixedSize(cell, cell)
        self.setCursor(Qt.PointingHandCursor)
        self.setMouseTracking(True)

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
        elif event.button() == Qt.RightButton:
            self.item_right_clicked.emit(self._name, event.globalPos())
        super().mousePressEvent(event)

    def enterEvent(self, event):
        _ItemTooltipPopup.get().show_for(self._name, self.mapToGlobal(self.rect().center()))
        super().enterEvent(event)

    def mouseMoveEvent(self, event):
        _ItemTooltipPopup.get().show_for(self._name, event.globalPos())
        super().mouseMoveEvent(event)

    def leaveEvent(self, event):
        _ItemTooltipPopup.get().close_popup()
        super().leaveEvent(event)


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

    def __init__(self, on_item_click=None, on_item_context=None, parent=None):
        super().__init__(parent)
        self._on_item_click = on_item_click
        self._on_item_context = on_item_context

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
        self._c_objets,  self._l_objets  = _stat_card("OBJETS EN VENTE", TEXT)
        self._c_offres,  self._l_offres  = _stat_card("MES OFFRES ACTIVES", TEXT)
        self._c_valeur,  self._l_valeur  = _stat_card("VALEUR PRÉVISIONNELLE", TEAL)
        self._c_best,    self._l_best    = _stat_card("MEILLEUR PRIX/U", TEAL)
        self._c_taxes,   self._l_taxes   = _stat_card("TAXES PAYÉES", RED)
        for c in (self._c_offres, self._c_objets, self._c_valeur, self._c_best, self._c_taxes):
            stats_row.addWidget(c, 1)
        root.addLayout(stats_row)

        # ── Grille compacte d'articles ─────────────────────────────────────
        root.addWidget(_section_header(
            "Mes articles en vente",
            "Classés par valeur unitaire estimée · cliquez sur une icône pour voir le détail",
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
            self._l_objets.setText("--")
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

        rows: list[tuple[dict, int, int, int]] = []
        for dep in deposits:
            lo, hi = estimate_market_price(dep["tax"], dep["qty"], days, rate)
            mid_unit = round((lo + hi) / 2)
            tot = mid_unit * dep["qty"]
            total_valeur += tot
            if mid_unit > best_unit:
                best_unit = mid_unit
                best_item = dep["item"]
            rows.append((dep, lo, hi, mid_unit))

        n = len(deposits)
        total_qty = sum(d["qty"] for d in deposits)

        self._l_objets.setText(f"{total_qty} obj.")
        self._l_offres.setText(str(n))
        self._l_valeur.setText(_fmt_short(total_valeur))
        self._l_taxes.setText(f"-{_fmt(total_taxes)} {_KAMA}")
        if best_unit:
            self._l_best.setText(f"~{_fmt_short(best_unit)}")
            self._l_best.setToolTip(best_item)
        else:
            self._l_best.setText("--")

        # Tri : valeur unitaire estimée décroissante, puis quantité décroissante.
        rows.sort(
            key=lambda x: (x[3], x[0]["qty"]),
            reverse=True,
        )

        # Peupler la grille
        for idx, (dep, _lo, _hi, _mid_unit) in enumerate(rows):
            btn = _ItemIconButton(dep["item"])
            if self._on_item_click:
                btn.item_clicked.connect(self._on_item_click)
            if self._on_item_context:
                btn.item_right_clicked.connect(self._on_item_context)
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
    def __init__(self, on_item_context=None, parent=None):
        super().__init__(parent)
        self._on_item_context = on_item_context
        self._settings = QSettings("WakfuAssistant", "Overlay")
        self._value_mode_settings_key = "hdv_mes_ventes_value_modes"
        self._value_mode_total_by_offer: dict[str, bool] = self._load_value_modes()
        self._row_offer_keys: list[str] = []
        self._row_value_unit: list[str] = []
        self._row_value_total: list[str] = []
        self._row_value_is_unit: list[bool] = []
        lay = QVBoxLayout(self)
        lay.setContentsMargins(12, 12, 12, 12)
        lay.setSpacing(8)

        # Cartes stats — 2 par ligne
        row1 = QHBoxLayout()
        row1.setSpacing(8)
        self._c_objets, self._l_objets = _stat_card("OBJETS EN VENTE", TEXT)
        self._c_offres, self._l_offres = _stat_card("OFFRES", TEXT)
        self._c_valeur, self._l_valeur = _stat_card("VALEUR EST.", TEAL)
        for c in (self._c_offres, self._c_objets, self._c_valeur):
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
            f"VALEUR ({_KAMA})", "DATE DÉPÔT",
        ])
        self._tip_filter = _TooltipFilter(self._table, self)
        self._table.cellClicked.connect(self._on_table_cell_clicked)
        self._table.setContextMenuPolicy(Qt.CustomContextMenu)
        self._table.customContextMenuRequested.connect(self._on_table_context_menu)
        lay.addWidget(self._table, 1)

    def _load_value_modes(self) -> dict[str, bool]:
        raw = str(self._settings.value(self._value_mode_settings_key, "", type=str) or "")
        if not raw:
            return {}
        try:
            data = json.loads(raw)
        except (ValueError, TypeError):
            return {}
        if not isinstance(data, dict):
            return {}
        out: dict[str, bool] = {}
        for key, value in data.items():
            if isinstance(key, str):
                out[key] = bool(value)
        return out

    def _save_value_modes(self):
        payload = json.dumps(self._value_mode_total_by_offer, ensure_ascii=True, separators=(",", ":"))
        self._settings.setValue(self._value_mode_settings_key, payload)

    @staticmethod
    def _offer_key(dep: dict) -> str:
        ts_client = str(dep.get("ts_client") or "").strip()
        if not ts_client:
            dt = dep.get("dt")
            ts_client = dt.strftime("%Y-%m-%d %H:%M:%S") if isinstance(dt, datetime) else ""
        item = str(dep.get("item") or "")
        qty = int(dep.get("qty") or 0)
        tax = int(dep.get("tax") or 0)
        return f"{ts_client}|{item}|{qty}|{tax}"

    def update_data(self, deposits: list[dict], days: int, rate: int):
        total_taxes = sum(d["tax"] for d in deposits)
        total_valeur = 0
        rows = sorted(deposits, key=lambda d: d["dt"], reverse=True)
        self._row_offer_keys = []
        self._row_value_unit = []
        self._row_value_total = []
        self._row_value_is_unit = []

        self._table.setRowCount(len(rows))
        for row, dep in enumerate(rows):
            offer_key = self._offer_key(dep)
            lo, hi = estimate_market_price(dep["tax"], dep["qty"], days, rate)
            mid_unit = round((lo + hi) / 2)
            mid_tot = round((lo + hi) / 2) * dep["qty"]
            total_valeur += mid_tot
            if lo > 0 and hi > 0:
                if lo == hi:
                    value_txt = f"{_fmt(lo)} {_KAMA}/u"
                else:
                    value_txt = f"{_fmt(lo)}-{_fmt(hi)} {_KAMA}/u"
            else:
                value_txt = "--"
            total_txt = f"{_fmt(mid_tot)} {_KAMA}" if mid_tot > 0 else "--"
            show_total = bool(self._value_mode_total_by_offer.get(offer_key, False))
            display_txt = total_txt if show_total else value_txt
            self._row_value_unit.append(value_txt)
            self._row_value_total.append(total_txt)
            self._row_value_is_unit.append(not show_total)
            self._row_offer_keys.append(offer_key)
            date_str = dep["dt"].strftime("%d/%m/%Y %H:%M")
            bg = QColor("#16191f") if row % 2 == 0 else QColor("#12161d")
            _set_row(self._table, row, [
                (dep["item"],     Qt.AlignLeft | Qt.AlignVCenter, TEXT),
                (str(dep["qty"]), Qt.AlignCenter,                 TEXT_DIM),
                (f"{_fmt(dep['tax'])} {_KAMA}", Qt.AlignCenter,    RED),
                (display_txt,      Qt.AlignCenter,                 GREEN),
                (date_str,        Qt.AlignCenter,                 TEXT_DIM),
            ], bg, row_height=_ROW_H_MES)

        n = len(deposits)
        total_qty = sum(d["qty"] for d in deposits)
        self._l_objets.setText(f"{total_qty} obj.")
        self._l_offres.setText(str(n))
        self._l_valeur.setText(_fmt_short(total_valeur) if total_valeur else "--")
        self._l_taxes.setText(f"-{_fmt(total_taxes)} {_KAMA}" if total_taxes else "--")

    def _on_table_cell_clicked(self, row: int, column: int):
        # Flip-flop uniquement sur la colonne "Valeur".
        if column != 4:
            return
        if row < 0 or row >= len(self._row_value_is_unit):
            return

        self._row_value_is_unit[row] = not self._row_value_is_unit[row]
        new_txt = self._row_value_unit[row] if self._row_value_is_unit[row] else self._row_value_total[row]
        if row < len(self._row_offer_keys):
            key = self._row_offer_keys[row]
            if self._row_value_is_unit[row]:
                self._value_mode_total_by_offer.pop(key, None)
            else:
                self._value_mode_total_by_offer[key] = True
            self._save_value_modes()
        value_item = self._table.item(row, 4)
        if value_item is not None:
            value_item.setText(new_txt)

    def _on_table_context_menu(self, pos):
        if self._on_item_context is None:
            return
        item = self._table.itemAt(pos)
        if item is None:
            return
        name_item = self._table.item(item.row(), 1)
        if name_item is None:
            return
        self._on_item_context(name_item.text(), self._table.viewport().mapToGlobal(pos))

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

        self._settings = QSettings("WakfuAssistant", "Overlay")
        self._rarity_override_key = "hdv_item_rarity_overrides"
        self._rarity_overrides: dict[str, int] = self._load_rarity_overrides()
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

        self._mes_ventes_page = _MesVentesPage(on_item_context=self._show_item_rarity_menu)
        self._overview_page   = _OverviewPage(
            on_item_click=self._on_overview_item_click,
            on_item_context=self._show_item_rarity_menu,
        )
        self._offres_vente_page = _OffresVentePage(on_item_context=self._show_item_rarity_menu)
        self._mes_achats_page = _PlaceholderBookPage(
            "Mes offres d'achat",
            "Historique personnel des ordres d'achat",
            "Aucune source d'ordres d'achat n'est encore disponible dans le journal permanent.",
            ["OBJET", "QTE", f"PRIX/U ({_KAMA})", "DATE"],
        )
        self._offres_achat_page = _PlaceholderBookPage(
            "Offres d'achat",
            "Carnet d'ordres global (scan HDV requis)",
            "L'onglet sera rempli automatiquement des qu'un scan des offres d'achat sera ajoute.",
            ["OBJET", "ACHETEURS", "QTE DEM.", f"PRIX/U ({_KAMA})", "MAJ"],
        )

        self._pages["overview"]     = self._overview_page
        self._pages["mes_ventes"]   = self._mes_ventes_page
        self._pages["mes_achats"]   = self._mes_achats_page
        self._pages["offres_vente"] = self._offres_vente_page
        self._pages["offres_achat"] = self._offres_achat_page

        for page in self._pages.values():
            self._stack.addWidget(page)

        root.addWidget(self._stack, 1)

        # Wire navigation
        for key, btn in self._tab_bar.buttons().items():
            btn.clicked.connect(lambda _checked=False, k=key: self._switch_to(k))

        initial_key = str(self._settings.value("hdv_last_subtab", "overview", type=str) or "overview")
        if initial_key not in self._pages:
            initial_key = "overview"
        self._switch_to(initial_key)

        # Service d'icônes
        self._icon_svc = ItemIconService.instance()
        self._icon_map: dict[int, list[tuple[QTableWidget, int]]] = {}
        self._icon_grid_map: dict[int, list[str]] = {}   # gfxId → [item_name] pour la grille
        self._icon_svc.icon_ready.connect(self._on_icon_ready)

        self.refresh()

    def _load_rarity_overrides(self) -> dict[str, int]:
        raw = str(self._settings.value(self._rarity_override_key, "", type=str) or "")
        if not raw:
            return {}
        try:
            data = json.loads(raw)
        except (TypeError, ValueError):
            return {}
        if not isinstance(data, dict):
            return {}
        out: dict[str, int] = {}
        for key, value in data.items():
            name = str(key or "").strip().lower()
            if not name:
                continue
            try:
                rid = int(value)
            except (TypeError, ValueError):
                continue
            if 0 <= rid <= 7:
                out[name] = rid
        return out

    def _save_rarity_overrides(self):
        payload = json.dumps(self._rarity_overrides, ensure_ascii=True, separators=(",", ":"))
        self._settings.setValue(self._rarity_override_key, payload)

    def _show_item_rarity_menu(self, item_name: str, global_pos: QPoint):
        name = str(item_name or "").strip()
        if not name:
            return

        menu = QMenu(self)
        header = menu.addSection(f"Rareté de {name}")
        _ = header

        current = self._rarity_overrides.get(name.lower(), None)
        candidates = get_item_rarity_candidates(name)
        if current is not None and current not in candidates:
            # Nettoie un override obsolète si la base ne supporte plus cette rareté.
            self._rarity_overrides.pop(name.lower(), None)
            self._save_rarity_overrides()
            current = None

        auto_action = menu.addAction("Automatique (base de données)")
        auto_action.setCheckable(True)
        auto_action.setChecked(current is None)

        rarity_actions: list[tuple[int, object]] = []
        for rid in candidates:
            label, _color = _RARITY_FR.get(rid, (f"Rareté {rid}", "#BCC0C0"))
            action = menu.addAction(f"{rid} - {label}")
            action.setCheckable(True)
            action.setChecked(current == rid)
            rarity_actions.append((rid, action))

        if not rarity_actions:
            unavailable = menu.addAction("Aucune rareté détectée pour cet objet")
            unavailable.setEnabled(False)

        chosen = menu.exec_(global_pos)
        if chosen is None:
            return

        key = name.lower()
        if chosen == auto_action:
            self._rarity_overrides.pop(key, None)
            self._save_rarity_overrides()
            _ItemTooltipPopup.get().set_rarity_overrides(self._rarity_overrides)
            return

        for rid, action in rarity_actions:
            if chosen == action:
                self._rarity_overrides[key] = rid
                self._save_rarity_overrides()
                _ItemTooltipPopup.get().set_rarity_overrides(self._rarity_overrides)
                return

    def _on_overview_item_click(self, item_name: str):
        """Navigue vers Mes Ventes et scroll jusqu'à l'article cliqué."""
        self._switch_to("mes_ventes")
        self._mes_ventes_page.scroll_to_item(item_name)

    def _switch_to(self, key: str):
        if key not in self._pages:
            key = "overview"
        self._tab_bar.set_active(key)
        page = self._pages.get(key)
        if page is not None:
            self._stack.setCurrentWidget(page)
            self._settings.setValue("hdv_last_subtab", key)

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
        self._offres_vente_page.update_data(self._deposits, self._market_days, self._market_rate)
        self._mes_achats_page.refresh()
        self._offres_achat_page.refresh()

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
        _ItemTooltipPopup.get().set_rarity_overrides(self._rarity_overrides)

        # Icônes : table Mes Ventes (triée par date)
        for row, dep in enumerate(
            sorted(self._deposits, key=lambda d: d["dt"], reverse=True)
        ):
            self._request_icon(self._mes_ventes_page._table, row, dep["item"])

        # Icônes : Offres de vente (agrégé par objet)
        for row, item_name in self._offres_vente_page.iter_table_rows():
            self._request_icon(self._offres_vente_page._table, row, item_name)

        # Icônes : grille Overview (un bouton par article unique)
        seen: set[str] = set()
        for dep in self._deposits:
            if dep["item"] not in seen:
                seen.add(dep["item"])
                self._request_grid_icon(dep["item"])
