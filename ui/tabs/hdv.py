from __future__ import annotations

# ui/tabs/hdv.py — Onglet HDV (Hôtel des Ventes)
# Sous-onglets : Overview · Mes ventes · Mes achats · Offres de vente · Offres d'achat

from PyQt5.QtCore import Qt
from PyQt5.QtGui import QColor
from PyQt5.QtWidgets import (
    QFrame,
    QHBoxLayout,
    QHeaderView,
    QLabel,
    QPushButton,
    QScrollArea,
    QStackedWidget,
    QTableWidget,
    QTableWidgetItem,
    QVBoxLayout,
    QWidget,
)

from core.permanent_journal import estimate_market_price, read_permanent_market_deposits
from ui.tabs.base import BaseTab
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


def _make_table(cols: list[str], parent=None) -> QTableWidget:
    t = QTableWidget(0, len(cols), parent)
    t.setHorizontalHeaderLabels(cols)
    t.setEditTriggers(QTableWidget.NoEditTriggers)
    t.setSelectionBehavior(QTableWidget.SelectRows)
    t.setSelectionMode(QTableWidget.SingleSelection)
    t.setFocusPolicy(Qt.ClickFocus)
    t.verticalHeader().setVisible(False)
    t.setShowGrid(False)
    t.setAlternatingRowColors(False)
    t.viewport().setMouseTracking(True)
    t.horizontalHeader().setSectionResizeMode(0, QHeaderView.Stretch)
    for i in range(1, len(cols)):
        t.horizontalHeader().setSectionResizeMode(i, QHeaderView.ResizeToContents)
    return t


def _set_row(table: QTableWidget, row: int, cells: list[tuple[str, int, str]], bg: QColor | None = None):
    for col, (txt, align, color) in enumerate(cells):
        it = QTableWidgetItem(txt)
        it.setTextAlignment(align)
        it.setForeground(QColor(color))
        if bg:
            it.setBackground(bg)
        it.setFlags(Qt.ItemIsEnabled | Qt.ItemIsSelectable)
        table.setItem(row, col, it)
    table.setRowHeight(row, 24)


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


# ── Placeholder page ──────────────────────────────────────────────────────────

class _PlaceholderPage(QWidget):
    def __init__(self, title: str, hint: str = "", parent=None):
        super().__init__(parent)
        lay = QVBoxLayout(self)
        lay.setAlignment(Qt.AlignCenter)
        lay.setContentsMargins(20, 20, 20, 20)
        lbl = QLabel(title)
        lbl.setAlignment(Qt.AlignCenter)
        lbl.setStyleSheet(
            f"color:{TEXT_DIM};font-size:14px;font-weight:600;background:transparent;"
        )
        lay.addWidget(lbl)
        if hint:
            sub = QLabel(hint)
            sub.setAlignment(Qt.AlignCenter)
            sub.setWordWrap(True)
            sub.setStyleSheet(f"color:{TEXT_DIM};font-size:10px;background:transparent;")
            lay.addSpacing(6)
            lay.addWidget(sub)


# ── Overview page — market intelligence ──────────────────────────────────────

class _OverviewPage(QWidget):
    """
    Vue d'ensemble orientée rentabilité :
    - Métriques clés (mes offres, valeur, meilleur prix/u, taxes)
    - Mes articles classés par valeur estimée décroissante
    - Sections futures : plus demandés (HDV scan), rentables à fabriquer (recettes)
    """

    def __init__(self, parent=None):
        super().__init__(parent)

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

        # ── Mes articles — classés par valeur ─────────────────────────────
        root.addWidget(_section_header(
            "Mes articles en vente",
            "Classés par prix estimé décroissant · basé sur les taxes de dépôt",
        ))
        self._tbl_mes = _make_table([
            "OBJET", "QTÉ", f"PRIX MIN ({_KAMA}/u)", f"PRIX MAX ({_KAMA}/u)",
            f"VALEUR TOT. ({_KAMA})", "DATE DÉPÔT",
        ])
        root.addWidget(self._tbl_mes)

        # ── Section : Plus demandés ────────────────────────────────────────
        root.addWidget(_section_header(
            "Plus demandés",
            "Objets avec le plus d'ordres d'achat actifs — nécessite un scan de l'HDV",
        ))
        ph_demand = _make_table(["OBJET", "NB ORDRES D'ACHAT", f"PRIX MAX OFFERT ({_KAMA}/u)", "SERVEUR"])
        ph_demand.setEnabled(False)
        ph_demand.setMaximumHeight(80)
        _dim = QLabel("Données à venir — scannez l'HDV depuis l'outil dédié")
        _dim.setStyleSheet(
            f"color:{TEXT_DIM};font-size:10px;font-style:italic;background:transparent;padding:6px 0;"
        )
        root.addWidget(_dim)

        # ── Section : Rentables à fabriquer ───────────────────────────────
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

    def update_data(self, deposits: list[dict], days: int, rate: int):
        if not deposits:
            self._l_offres.setText("--")
            self._l_valeur.setText("--")
            self._l_best.setText("--")
            self._l_taxes.setText("--")
            self._tbl_mes.setRowCount(0)
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

        # Table triée par valeur totale estimée décroissante
        rows.sort(key=lambda x: round((x[1] + x[2]) / 2) * x[0]["qty"], reverse=True)
        self._tbl_mes.setRowCount(len(rows))
        for row, (dep, lo, hi) in enumerate(rows):
            mid_tot = round((lo + hi) / 2) * dep["qty"]
            date_str = dep["dt"].strftime("%d/%m/%Y %H:%M")
            bg = QColor("#16191f") if row % 2 == 0 else QColor("#12161d")
            _set_row(self._tbl_mes, row, [
                (dep["item"],            Qt.AlignLeft | Qt.AlignVCenter, TEXT),
                (str(dep["qty"]),       Qt.AlignCenter,                  TEXT_DIM),
                (_fmt(lo),               Qt.AlignCenter,                  TEAL),
                (_fmt(hi),               Qt.AlignCenter,                  TEAL),
                (_fmt(mid_tot),          Qt.AlignCenter,                  GREEN),
                (date_str,               Qt.AlignCenter,                  TEXT_DIM),
            ], bg)


# ── Mes offres de vente page ──────────────────────────────────────────────────

class _MesVentesPage(QWidget):
    def __init__(self, parent=None):
        super().__init__(parent)
        lay = QVBoxLayout(self)
        lay.setContentsMargins(12, 12, 12, 12)
        lay.setSpacing(8)

        # Summary cards
        row = QHBoxLayout()
        row.setSpacing(8)
        self._c_offres, self._l_offres = _stat_card("OFFRES", TEXT)
        self._c_valeur, self._l_valeur = _stat_card("VALEUR EST.", TEAL)
        self._c_taxes,  self._l_taxes  = _stat_card("TAXES PAYÉES", RED)
        for c in (self._c_offres, self._c_valeur, self._c_taxes):
            c.setMaximumHeight(72)
            row.addWidget(c, 1)
        row.addStretch(2)
        lay.addLayout(row)

        # Table
        self._table = _make_table([
            "OBJET", "QTÉ", f"TAXE ({_KAMA})",
            f"PRIX MIN ({_KAMA}/u)", f"PRIX MAX ({_KAMA}/u)",
            f"VALEUR TOT. ({_KAMA})", "DATE DÉPÔT",
        ])
        self._table.horizontalHeader().setSectionResizeMode(5, QHeaderView.ResizeToContents)
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
                (dep["item"],      Qt.AlignLeft | Qt.AlignVCenter, TEXT),
                (str(dep["qty"]), Qt.AlignCenter,                  TEXT_DIM),
                (str(dep["tax"]),  Qt.AlignCenter,                  RED),
                (_fmt(lo),         Qt.AlignCenter,                  TEAL),
                (_fmt(hi),         Qt.AlignCenter,                  TEAL),
                (_fmt(mid_tot),    Qt.AlignCenter,                  GREEN),
                (date_str,         Qt.AlignCenter,                  TEXT_DIM),
            ], bg)

        n = len(deposits)
        total_qty = sum(d["qty"] for d in deposits)
        self._l_offres.setText(f"{n} · {total_qty} obj.")
        self._l_valeur.setText(_fmt_short(total_valeur) if total_valeur else "--")
        self._l_taxes.setText(f"-{_fmt(total_taxes)} {_KAMA}" if total_taxes else "--")


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

        self._overview_page   = _OverviewPage()
        self._mes_ventes_page = _MesVentesPage()

        self._pages["overview"]     = self._overview_page
        self._pages["mes_ventes"]   = self._mes_ventes_page
        self._pages["mes_achats"]   = _PlaceholderPage(
            "Mes offres d'achat",
            "Les ordres d'achat seront capturés automatiquement depuis les logs du jeu.",
        )
        self._pages["offres_vente"] = _PlaceholderPage(
            "Offres de vente",
            "Données issues du scan de l'HDV — fonctionnalité à venir.",
        )
        self._pages["offres_achat"] = _PlaceholderPage(
            "Offres d'achat",
            "Données issues du scan de l'HDV — fonctionnalité à venir.",
        )

        for page in self._pages.values():
            self._stack.addWidget(page)

        root.addWidget(self._stack, 1)

        # Wire navigation
        for key, btn in self._tab_bar.buttons().items():
            btn.clicked.connect(lambda _checked=False, k=key: self._switch_to(k))

        self._switch_to("overview")

    def _switch_to(self, key: str):
        self._tab_bar.set_active(key)
        page = self._pages.get(key)
        if page is not None:
            self._stack.setCurrentWidget(page)

    # ── Public API ────────────────────────────────────────────────────────────

    def set_market_settings(self, days: int, rate: int):
        self._market_days = days
        self._market_rate = rate
        self._refresh_pages()

    def refresh(self):
        self._deposits = read_permanent_market_deposits()
        self._refresh_pages()

    def _refresh_pages(self):
        self._overview_page.update_data(self._deposits, self._market_days, self._market_rate)
        self._mes_ventes_page.update_data(self._deposits, self._market_days, self._market_rate)
