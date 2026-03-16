from __future__ import annotations

import json
import os
import re
import math
from dataclasses import dataclass
from datetime import datetime, timedelta
from pathlib import Path

from PyQt5.QtCore import Qt, QTimer, QSettings, QEvent, QPoint, pyqtSignal
from PyQt5.QtGui import QColor, QPainter, QPen
from PyQt5.QtWidgets import (
    QFrame,
    QGridLayout,
    QHBoxLayout,
    QLabel,
    QMenu,
    QMessageBox,
    QPushButton,
    QTableWidget,
    QTableWidgetItem,
    QVBoxLayout,
    QWidget,
    QHeaderView,
)

from core.permanent_journal import read_permanent_kamas_events, sync_permanent_kamas_journal
from ui.tabs.base import BaseTab
from ui.theme import BG_PANEL, BORDER, GREEN, RED, TEAL, TEXT, TEXT_DIM

_PROJECT_ROOT = Path(__file__).resolve().parents[2]
_KAMAS_JOURNAL = _PROJECT_ROOT / "data" / "kamas_journal.jsonl"
_APPDATA_WAKFU_DIR = Path(os.environ.get("APPDATA", "")) / "zaap" / "gamesLogs" / "wakfu" / "logs"

_TS_RE = re.compile(r"^\[(\d{4}-\d{2}-\d{2} \d{2}:\d{2}:\d{2}(?:\.\d{3})?)\]")
_INNER_TIME_RE = re.compile(r"\b(\d{2}:\d{2}:\d{2}),(\d{3})\b")
_GAIN_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez gagné\s+([0-9\s\u00a0\u202f\xa0.,]+)\s+kamas?\b",
    re.IGNORECASE,
)
_LOSS_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez perdu\s+([0-9\s\u00a0\u202f\xa0.,]+)\s+kamas?\b",
    re.IGNORECASE,
)


@dataclass
class TransactionEvent:
    dt: datetime
    kind: str
    libelle: str
    amount: int
    correction_ts: str | None = None
    correction_line_no: int | None = None


def _parse_ts(raw: str) -> datetime:
    fmt = "%Y-%m-%d %H:%M:%S.%f" if "." in raw else "%Y-%m-%d %H:%M:%S"
    return datetime.strptime(raw, fmt)


def _fmt_kamas(value: int) -> str:
    return f"{value:,}".replace(",", " ")


def _format_dt_parts(dt: datetime) -> tuple[str, str]:
    rounded = dt + timedelta(milliseconds=500)
    rounded = rounded.replace(microsecond=0)
    return rounded.strftime("%d/%m/%Y"), rounded.strftime("%H:%M:%S")


class KamasLineChart(QWidget):
    pointClicked = pyqtSignal(int)

    _MIN_ZOOM_POINTS = 10
    _DETAIL_GRID_MAX_SPAN = 80
    _DETAIL_GRID_LINES = 6

    def __init__(self, parent: QWidget | None = None):
        super().__init__(parent)
        self._series: list[tuple[datetime, int]] = []
        self._zoom_span: int = 0
        self._zoom_center: float = 0.0
        self._hover_index: int | None = None
        self._hover_pos: QPoint | None = None
        self._is_panning: bool = False
        self._pan_start_x: int = 0
        self._pan_start_y: int = 0
        self._pan_start_center: float = 0.0
        self.setMouseTracking(True)
        self.setMinimumHeight(150)

    def set_series(self, series: list[tuple[datetime, int]]):
        old_total = len(self._series)
        self._series = series
        total = len(self._series)
        if total <= 0:
            self._zoom_span = 0
            self._zoom_center = 0.0
        else:
            min_span = min(total, self._MIN_ZOOM_POINTS)
            if self._zoom_span <= 0:
                self._zoom_span = total
            self._zoom_span = max(min_span, min(total, self._zoom_span))
            if self._zoom_center <= 0.0:
                self._zoom_center = (total - 1) / 2.0
            elif old_total > 0 and total != old_total:
                # Conserve la position relative dans la serie quand de nouveaux
                # points arrivent, pour eviter les sauts de fenetre de zoom.
                rel = self._zoom_center / max(1.0, float(old_total - 1))
                self._zoom_center = rel * max(1.0, float(total - 1))
            self._zoom_center = max(0.0, min(float(total - 1), self._zoom_center))
        self.update()

    def _visible_bounds(self) -> tuple[int, int]:
        total = len(self._series)
        if total <= 0:
            return 0, 0
        min_span = min(total, self._MIN_ZOOM_POINTS)
        span = max(min_span, min(total, self._zoom_span or total))
        center = max(0.0, min(float(total - 1), self._zoom_center))
        start = int(round(center - span / 2.0))
        end = start + span
        if start < 0:
            start = 0
            end = span
        if end > total:
            end = total
            start = max(0, end - span)
        return start, end

    def _x_to_index(self, x: int) -> int | None:
        total = len(self._series)
        if total <= 0:
            return None
        start, end = self._visible_bounds()
        count = end - start
        if count <= 0:
            return None
        left = 10
        right = self.width() - 10
        plot_w = max(1, right - left)
        ratio = max(0.0, min(1.0, (x - left) / float(plot_w)))
        idx = start + int(round(ratio * max(1, count - 1)))
        return max(start, min(end - 1, idx))

    def wheelEvent(self, event):
        total = len(self._series)
        if total < 3:
            return

        cursor_idx = self._x_to_index(event.pos().x())
        if cursor_idx is None:
            cursor_idx = int(round(self._zoom_center)) if self._zoom_center > 0 else total // 2

        delta = int(event.angleDelta().y())
        if delta == 0:
            return

        steps = delta / 120.0
        min_span = min(total, self._MIN_ZOOM_POINTS)
        current_span = max(min_span, min(total, self._zoom_span or total))
        # Zoom progressif: moins brutal et plus stable.
        factor = math.pow(0.90, steps)
        new_span = int(round(current_span * factor))
        new_span = max(min_span, min(total, new_span))
        if new_span == current_span:
            event.accept()
            return

        # Conserve le point sous le curseur lors du zoom.
        start, end = self._visible_bounds()
        visible_count = max(1, end - start)
        left = 10
        right = self.width() - 10
        plot_w = max(1, right - left)
        ratio = max(0.0, min(1.0, (event.pos().x() - left) / float(plot_w)))

        new_start = int(round(cursor_idx - ratio * max(1, new_span - 1)))
        max_start = max(0, total - new_span)
        new_start = max(0, min(max_start, new_start))
        new_center = new_start + (new_span - 1) / 2.0

        self._zoom_span = new_span
        self._zoom_center = float(new_center)
        self.update()
        event.accept()

    def mouseDoubleClickEvent(self, event):
        if event.button() == Qt.LeftButton and self._series:
            self._zoom_span = len(self._series)
            self._zoom_center = (len(self._series) - 1) / 2.0
            self.update()
            event.accept()
            return
        super().mouseDoubleClickEvent(event)

    def mouseMoveEvent(self, event):
        if self._is_panning:
            total = len(self._series)
            if total > 1:
                dx = int(event.pos().x() - self._pan_start_x)
                left = 10
                right = self.width() - 10
                plot_w = max(1, right - left)
                min_span = min(total, self._MIN_ZOOM_POINTS)
                span = max(min_span, min(total, self._zoom_span or total))
                # Echelle relative au zoom: plus on zoom, plus le pan est fin.
                idx_per_px = max(0.01, (span - 1) / float(plot_w))
                shift = dx * idx_per_px
                max_center = float(total - 1)
                self._zoom_center = max(0.0, min(max_center, self._pan_start_center - shift))
                self.update()
            event.accept()
            return

        idx = self._x_to_index(event.pos().x())
        self._hover_index = idx
        self._hover_pos = event.pos()
        self.update()
        super().mouseMoveEvent(event)

    def mousePressEvent(self, event):
        if event.button() == Qt.LeftButton and len(self._series) > 1:
            self._is_panning = True
            self._pan_start_x = int(event.pos().x())
            self._pan_start_y = int(event.pos().y())
            self._pan_start_center = float(self._zoom_center)
            self._hover_index = None
            self._hover_pos = None
            self.setCursor(Qt.ClosedHandCursor)
            event.accept()
            return
        super().mousePressEvent(event)

    def mouseReleaseEvent(self, event):
        if event.button() == Qt.LeftButton and self._is_panning:
            dx = abs(int(event.pos().x()) - self._pan_start_x)
            dy = abs(int(event.pos().y()) - self._pan_start_y)
            self._is_panning = False
            self.setCursor(Qt.ArrowCursor)
            # Clic court (sans drag): cible la transaction dans l'historique.
            if dx <= 3 and dy <= 3:
                idx = self._x_to_index(event.pos().x())
                if idx is not None:
                    self.pointClicked.emit(idx)
            event.accept()
            return
        super().mouseReleaseEvent(event)

    def leaveEvent(self, event):
        if self._is_panning:
            self._is_panning = False
            self.setCursor(Qt.ArrowCursor)
        self._hover_index = None
        self._hover_pos = None
        self.update()
        super().leaveEvent(event)

    def paintEvent(self, _event):
        p = QPainter(self)
        p.setRenderHint(QPainter.Antialiasing)

        p.fillRect(self.rect(), QColor(BG_PANEL))
        p.setPen(QPen(QColor(BORDER), 1))
        p.drawRect(self.rect().adjusted(0, 0, -1, -1))

        if len(self._series) < 2:
            p.setPen(QColor(TEXT_DIM))
            p.drawText(self.rect(), Qt.AlignCenter, "Aucune transaction recente")
            return

        start, end = self._visible_bounds()
        visible = self._series[start:end]
        if len(visible) < 2:
            p.setPen(QColor(TEXT_DIM))
            p.drawText(self.rect(), Qt.AlignCenter, "Zoom trop proche")
            return

        left = 10
        top = 10
        right = self.width() - 10
        bottom = self.height() - 16
        plot_w = max(1, right - left)
        plot_h = max(1, bottom - top)

        visible_values = [value for _dt, value in visible]
        v_min = min(visible_values)
        v_max = max(visible_values)
        span = max(1, v_max - v_min)

        # Ligne zero pour lire rapidement la tendance.
        if v_min <= 0 <= v_max:
            y_zero = int(bottom - ((0 - v_min) / span) * plot_h)
            p.setPen(QPen(QColor(BORDER), 1, Qt.DashLine))
            p.drawLine(left, y_zero, right, y_zero)

        count = len(visible)
        coords: list[tuple[int, int]] = []
        for idx, (_dt, value) in enumerate(visible):
            x = int(left + (idx / max(1, count - 1)) * plot_w)
            y = int(bottom - ((value - v_min) / span) * plot_h)
            coords.append((x, y))

        if count <= self._DETAIL_GRID_MAX_SPAN:
            p.setPen(QPen(QColor(BORDER), 1, Qt.DotLine))
            grid_steps = max(2, min(self._DETAIL_GRID_LINES, count))
            for step in range(grid_steps):
                ratio = step / max(1, grid_steps - 1)
                local_idx = int(round(ratio * max(1, count - 1)))
                gx, _gy = coords[local_idx]
                gdt, _gval = visible[local_idx]
                p.drawLine(gx, top, gx, bottom)

                label = gdt.strftime("%d/%m %H:%M")
                p.setPen(QColor(TEXT_DIM))
                label_x = max(left, min(gx - 36, right - 72))
                p.drawText(label_x, bottom + 12, label)
                p.setPen(QPen(QColor(BORDER), 1, Qt.DotLine))

        # Couleur stable: ne depend pas de la fenetre visible pour eviter
        # les bascules rouge/vert pendant le zoom/pan.
        line_color = QColor(TEAL)
        p.setPen(QPen(line_color, 2))

        for i in range(1, len(coords)):
            p.drawLine(coords[i - 1][0], coords[i - 1][1], coords[i][0], coords[i][1])

        if self._hover_index is not None and start <= self._hover_index < end:
            local_idx = self._hover_index - start
            hx, hy = coords[local_idx]
            hdt, hval = self._series[self._hover_index]
            balance_txt = f"Solde estime: {_fmt_kamas(hval)}"
            when_txt = hdt.strftime("%d/%m/%Y %H:%M:%S")

            p.setPen(QPen(QColor(TEAL), 1, Qt.DashLine))
            p.drawLine(hx, top, hx, bottom)
            p.setPen(QPen(QColor(TEAL), 2))
            p.setBrush(QColor(TEAL))
            p.drawEllipse(QPoint(hx, hy), 3, 3)

            tooltip_lines = [balance_txt, when_txt]
            tooltip_x = max(left + 8, min(hx + 10, right - 220))
            tooltip_y = max(top + 8, hy - 38)
            tip_w = 208
            tip_h = 34
            p.setPen(QPen(QColor(BORDER), 1))
            p.setBrush(QColor(14, 18, 26, 235))
            p.drawRoundedRect(tooltip_x, tooltip_y, tip_w, tip_h, 6, 6)
            p.setPen(QColor(TEXT))
            p.drawText(tooltip_x + 8, tooltip_y + 14, tooltip_lines[0])
            p.setPen(QColor(TEXT_DIM))
            p.drawText(tooltip_x + 8, tooltip_y + 28, tooltip_lines[1])


class TransactionsTab(BaseTab):
    def __init__(self, parent: QWidget | None = None):
        super().__init__(parent)
        self.setObjectName("transactionsTab")
        self._settings = QSettings("WakfuAssistant", "Overlay")
        self.setStyleSheet(
            f"""
            QWidget#transactionsTab {{
                background: transparent;
            }}
            QFrame#txCard {{
                background: {BG_PANEL};
                border: 1px solid {BORDER};
                border-radius: 10px;
            }}
            QLabel#txSectionTitle {{
                color: {TEXT};
                font-size: 12px;
                font-weight: 700;
                letter-spacing: 0.4px;
            }}
            QLabel#txSectionSubtitle {{
                color: {TEXT_DIM};
                font-size: 10px;
            }}
            QLabel#txMetricName {{
                color: {TEXT_DIM};
                font-size: 9px;
                font-weight: 700;
                letter-spacing: 0.8px;
            }}
            QLabel#txMetricValue {{
                color: {TEXT};
                font-size: 14px;
                font-weight: 800;
            }}
            QTableWidget#txTable {{
                background: transparent;
                border: none;
                gridline-color: transparent;
            }}
            QTableWidget#txTable::item {{
                border: none;
                border-bottom: 1px solid {BORDER};
                padding: 5px 8px;
            }}
            QTableWidget#txTable::item:selected {{
                background: rgba(56, 180, 170, 120);
                color: #e5f2ec;
            }}
            QHeaderView::section {{
                background: transparent;
                border: none;
                border-bottom: 1px solid {BORDER};
                color: {TEXT_DIM};
                font-size: 9px;
                font-weight: 800;
                padding: 6px 8px;
            }}
            """
        )

        self._events: list[TransactionEvent] = []
        self._display_events: list[TransactionEvent] = []
        # 0 = historique complet (pas de truncation).
        self._max_events = 0
        self._pulse_timer = QTimer(self)
        self._pulse_timer.setInterval(90)
        self._pulse_timer.timeout.connect(self._on_pulse_tick)
        self._pulse_event: TransactionEvent | None = None
        self._pulse_row_hint = -1
        self._pulse_tick = 0
        self._pulse_max_ticks = 14
        self._sort_column = 0
        self._sort_desc = True
        # Toujours demarrer en mode normal pour eviter une activation
        # involontaire de l'edition de colonnes au redemarrage.
        self._organization_mode = False
        self._resizing_guard = False
        self._layout_ready = False

        root = QVBoxLayout(self)
        root.setContentsMargins(10, 10, 10, 10)
        root.setSpacing(10)

        header_card = QFrame(self)
        header_card.setObjectName("txCard")
        header_layout = QHBoxLayout(header_card)
        header_layout.setContentsMargins(12, 10, 12, 10)
        header_layout.setSpacing(8)

        title_col = QVBoxLayout()
        title_col.setSpacing(2)
        title = QLabel("Transactions")
        title.setObjectName("txSectionTitle")
        subtitle = QLabel("Historique des gains/pertes et points de recalage")
        subtitle.setObjectName("txSectionSubtitle")
        title_col.addWidget(title)
        title_col.addWidget(subtitle)
        header_layout.addLayout(title_col, 1)

        refresh_btn = QPushButton("Rafraichir")
        refresh_btn.setFixedHeight(28)
        refresh_btn.setMinimumWidth(104)
        refresh_btn.clicked.connect(self.refresh)
        header_layout.addWidget(refresh_btn)

        root.addWidget(header_card)

        metrics_card = QFrame(self)
        metrics_card.setObjectName("txCard")
        metrics_layout = QGridLayout(metrics_card)
        metrics_layout.setContentsMargins(10, 10, 10, 10)
        metrics_layout.setHorizontalSpacing(8)
        metrics_layout.setVerticalSpacing(8)

        gain_box, self._gain_label = self._build_metric_box("GAINS", GREEN)
        loss_box, self._loss_label = self._build_metric_box("PERTES", RED)
        net_box, self._net_label = self._build_metric_box("NET", TEAL)
        current_box, self._current_label = self._build_metric_box("KAMAS ACTUELS", TEAL)

        metrics_layout.addWidget(gain_box, 0, 0)
        metrics_layout.addWidget(loss_box, 0, 1)
        metrics_layout.addWidget(net_box, 1, 0)
        metrics_layout.addWidget(current_box, 1, 1)

        root.addWidget(metrics_card)

        chart_frame = QFrame(self)
        chart_frame.setObjectName("txCard")
        chart_frame.setStyleSheet(
            f"QFrame {{ background: {BG_PANEL}; border: 1px solid {BORDER}; border-radius: 8px; }}"
        )
        chart_layout = QVBoxLayout(chart_frame)
        chart_layout.setContentsMargins(10, 10, 10, 8)
        chart_layout.setSpacing(6)

        chart_title = QLabel("Evolution des transactions")
        chart_title.setObjectName("txSectionTitle")
        chart_layout.addWidget(chart_title)

        self._chart = KamasLineChart(chart_frame)
        self._chart.pointClicked.connect(self._focus_event_in_history)
        chart_layout.addWidget(self._chart)
        root.addWidget(chart_frame)

        table_card = QFrame(self)
        table_card.setObjectName("txCard")
        table_layout = QVBoxLayout(table_card)
        table_layout.setContentsMargins(10, 10, 10, 10)
        table_layout.setSpacing(6)

        table_title = QLabel("Historique")
        table_title.setObjectName("txSectionTitle")
        table_head = QHBoxLayout()
        table_head.setSpacing(8)
        table_head.addWidget(table_title)
        table_head.addStretch(1)

        self._organization_btn = QPushButton("Edition colonnes")
        self._organization_btn.setCheckable(True)
        self._organization_btn.setChecked(bool(self._organization_mode))
        self._organization_btn.setFixedHeight(24)
        self._organization_btn.clicked.connect(self._on_toggle_organization_mode)
        table_head.addWidget(self._organization_btn)
        table_layout.addLayout(table_head)

        self._table = QTableWidget(0, 5, table_card)
        self._table.setObjectName("txTable")
        self._table.setHorizontalHeaderLabels(["Date", "Heure", "Type", "Libelle", "Montant"])
        self._table.verticalHeader().setVisible(False)
        self._table.setEditTriggers(QTableWidget.NoEditTriggers)
        self._table.setSelectionBehavior(QTableWidget.SelectRows)
        self._table.setSelectionMode(QTableWidget.SingleSelection)
        self._table.setShowGrid(False)
        self._table.setAlternatingRowColors(False)
        self._table.setStyleSheet("")
        self._table.setWordWrap(False)
        self._table.setHorizontalScrollBarPolicy(Qt.ScrollBarAlwaysOff)
        self._table.setVerticalScrollBarPolicy(Qt.ScrollBarAlwaysOff)
        self._table.setContextMenuPolicy(Qt.CustomContextMenu)
        self._table.customContextMenuRequested.connect(self._on_table_context_menu)
        header = self._table.horizontalHeader()
        header.setSectionResizeMode(QHeaderView.Interactive)
        header.setMinimumSectionSize(60)
        header.setStretchLastSection(False)
        header.setCascadingSectionResizes(False)
        header.setSectionsClickable(True)
        header.setSectionsMovable(True)
        header.sectionClicked.connect(self._on_header_clicked)
        header.sectionResized.connect(self._on_column_resized)
        header.sectionMoved.connect(self._on_columns_reordered)
        self._table.installEventFilter(self)
        table_layout.addWidget(self._table, 1)
        root.addWidget(table_card, 1)

        self._apply_default_column_widths()
        self._restore_column_widths()
        self._restore_column_order()
        self._table.horizontalHeader().setStretchLastSection(True)
        self._enforce_columns_fit()
        self._apply_organization_mode_visuals()
        self._layout_ready = True

        self._reload_history()
        self._render()

        self._timer = QTimer(self)
        self._timer.timeout.connect(self.refresh)
        self._timer.start(4000)

    def _build_metric_box(self, title: str, color: str) -> tuple[QFrame, QLabel]:
        card = QFrame(self)
        card.setObjectName("txCard")
        card.setStyleSheet(
            f"QFrame#txCard {{ background: {BG_PANEL}; border: 1px solid {BORDER}; border-radius: 8px; }}"
        )
        lay = QVBoxLayout(card)
        lay.setContentsMargins(8, 8, 8, 8)
        lay.setSpacing(2)

        name_lbl = QLabel(title)
        name_lbl.setObjectName("txMetricName")
        lay.addWidget(name_lbl)

        value_lbl = QLabel("--")
        value_lbl.setObjectName("txMetricValue")
        value_lbl.setStyleSheet(f"color: {color}; font-size: 14px; font-weight: 800;")
        lay.addWidget(value_lbl)

        return card, value_lbl

    def _on_chart_view_stats(self, pct: float, _first: int, _last: int, gains: int, losses: int):
        # Methode conservee pour compatibilite; la carte affiche desormais
        # uniquement les kamas actuels (valeur absolue).
        _ = (pct, gains, losses)
        if _last:
            self._current_label.setText(_fmt_kamas(max(0, _last)))

    @staticmethod
    def _parse_kamas_token(raw: str) -> int | None:
        digits = re.sub(r"[^0-9]", "", raw)
        return int(digits) if digits else None

    @staticmethod
    def _extract_line_datetime(line: str, fallback_dt: datetime) -> datetime | None:
        now = datetime.now()
        ts_match = _TS_RE.match(line)
        outer_dt: datetime | None = None
        if ts_match:
            try:
                outer_dt = _parse_ts(ts_match.group(1))
            except ValueError:
                outer_dt = None

        inner_match = _INNER_TIME_RE.search(line)
        if inner_match:
            hhmmss = inner_match.group(1)
            ms = inner_match.group(2)
            ref_dt = outer_dt if outer_dt is not None else fallback_dt
            try:
                base_time = datetime.strptime(f"{hhmmss}.{ms}", "%H:%M:%S.%f")
            except ValueError:
                base_time = None

            if base_time is not None:
                base_candidate = ref_dt.replace(
                    hour=base_time.hour,
                    minute=base_time.minute,
                    second=base_time.second,
                    microsecond=base_time.microsecond,
                )

                # Choisit la date la plus proche du repere pour gerer
                # correctement les lignes autour de minuit sans dates farfelues.
                candidates = (
                    base_candidate - timedelta(days=1),
                    base_candidate,
                    base_candidate + timedelta(days=1),
                )
                closest = min(candidates, key=lambda dt: abs((dt - ref_dt).total_seconds()))

                # Garde-fou: on n'affiche jamais une transaction dans le futur.
                if closest > now:
                    past_candidates = [dt for dt in candidates if dt <= now]
                    if past_candidates:
                        closest = min(
                            past_candidates,
                            key=lambda dt: abs((dt - ref_dt).total_seconds()),
                        )
                    else:
                        closest = now
                return closest

        if outer_dt is not None and outer_dt > now:
            return now

        return outer_dt

    def _parse_line(self, line: str, fallback_dt: datetime) -> TransactionEvent | None:
        dt = self._extract_line_datetime(line, fallback_dt)
        if dt is None:
            return None

        gain_m = _GAIN_RE.search(line)
        loss_m = _LOSS_RE.search(line)

        if gain_m:
            amount = self._parse_kamas_token(gain_m.group(1))
            if amount is None:
                return None
            return TransactionEvent(dt=dt, kind="gain", libelle="Gain de kamas", amount=amount)

        if loss_m:
            amount = self._parse_kamas_token(loss_m.group(1))
            if amount is None:
                return None
            return TransactionEvent(dt=dt, kind="loss", libelle="Perte de kamas", amount=amount)

        return None

    def _load_initial_history(self):
        self._events.clear()
        # Mise a jour du journal permanent normalise (client/local/atomic).
        sync_permanent_kamas_journal()

        seen: set[tuple[str, str, int, int]] = set()
        for item in read_permanent_kamas_events():
            dt = item.get("dt")
            kind = str(item.get("kind") or "").strip().lower()
            amount = int(item.get("amount") or 0)
            source_offset = int(item.get("source_offset") or 0)
            if not isinstance(dt, datetime):
                continue
            if kind not in ("gain", "loss"):
                continue
            if amount <= 0:
                continue

            key = (dt.strftime("%Y-%m-%d %H:%M:%S.%f"), kind, amount, source_offset)
            if key in seen:
                continue
            seen.add(key)

            self._events.append(
                TransactionEvent(
                    dt=dt,
                    kind=kind,
                    libelle="Gain de kamas" if kind == "gain" else "Perte de kamas",
                    amount=amount,
                )
            )

    def _load_manual_corrections(self):
        if not _KAMAS_JOURNAL.exists():
            return

        try:
            with _KAMAS_JOURNAL.open("r", encoding="utf-8") as fh:
                for line_no, line in enumerate(fh, start=1):
                    raw = line.strip()
                    if not raw:
                        continue
                    try:
                        data = json.loads(raw)
                    except json.JSONDecodeError:
                        continue

                    ts_raw = str(data.get("ts") or "").strip()
                    value_raw = data.get("value")
                    if not ts_raw:
                        continue

                    try:
                        dt = _parse_ts(ts_raw)
                        value = int(value_raw)
                    except (ValueError, TypeError):
                        continue

                    self._events.append(
                        TransactionEvent(
                            dt=dt,
                            kind="correction",
                            libelle="Correction manuelle",
                            amount=value,
                            correction_ts=ts_raw,
                            correction_line_no=line_no,
                        )
                    )
        except OSError:
            return

    def _delete_correction_event(self, evt: TransactionEvent) -> bool:
        if evt.kind != "correction":
            return False
        if not _KAMAS_JOURNAL.exists():
            return False

        try:
            lines = _KAMAS_JOURNAL.read_text(encoding="utf-8").splitlines()
        except OSError:
            return False

        target_idx: int | None = None
        if evt.correction_line_no is not None:
            idx = int(evt.correction_line_no) - 1
            if 0 <= idx < len(lines):
                try:
                    data = json.loads(lines[idx])
                except (ValueError, TypeError):
                    data = None
                if isinstance(data, dict):
                    ts_raw = str(data.get("ts") or "").strip()
                    val_raw = data.get("value")
                    try:
                        val_int = int(val_raw)
                    except (TypeError, ValueError):
                        val_int = None
                    if ts_raw == str(evt.correction_ts or "") and val_int == int(evt.amount):
                        target_idx = idx

        if target_idx is None:
            for idx, raw in enumerate(lines):
                try:
                    data = json.loads(raw)
                except (ValueError, TypeError):
                    continue
                if not isinstance(data, dict):
                    continue
                ts_raw = str(data.get("ts") or "").strip()
                val_raw = data.get("value")
                try:
                    val_int = int(val_raw)
                except (TypeError, ValueError):
                    continue
                if ts_raw == str(evt.correction_ts or "") and val_int == int(evt.amount):
                    target_idx = idx
                    break

        if target_idx is None:
            return False

        del lines[target_idx]
        try:
            payload = "\n".join(lines)
            if payload:
                payload += "\n"
            _KAMAS_JOURNAL.write_text(payload, encoding="utf-8")
        except OSError:
            return False

        return True

    def _on_table_context_menu(self, pos):
        item = self._table.itemAt(pos)
        if item is None:
            return
        row = int(item.row())
        if row < 0 or row >= len(self._display_events):
            return

        evt = self._display_events[row]
        if evt.kind != "correction":
            return

        menu = QMenu(self)
        delete_action = menu.addAction("Supprimer cette correction")
        chosen = menu.exec_(self._table.viewport().mapToGlobal(pos))
        if chosen != delete_action:
            return

        date_txt, time_txt = _format_dt_parts(evt.dt)
        confirm = QMessageBox.question(
            self,
            "Suppression correction",
            f"Supprimer la correction du {date_txt} {time_txt} ({_fmt_kamas(evt.amount)} kamas) ?",
            QMessageBox.Yes | QMessageBox.No,
            QMessageBox.No,
        )
        if confirm != QMessageBox.Yes:
            return

        if self._delete_correction_event(evt):
            self.refresh()
        else:
            QMessageBox.warning(
                self,
                "Suppression impossible",
                "La correction n'a pas pu etre supprimee du journal.",
            )

    def _reload_history(self):
        self._load_initial_history()
        self._load_manual_corrections()
        self._events.sort(key=lambda evt: evt.dt)
        if self._max_events > 0 and len(self._events) > self._max_events:
            self._events = self._events[-self._max_events:]

    @staticmethod
    def _event_signed_delta(evt: TransactionEvent) -> int:
        if evt.kind == "gain":
            return evt.amount
        if evt.kind == "loss":
            return -evt.amount
        return 0

    def _sorted_events_for_table(self) -> list[TransactionEvent]:
        events = list(self._events)

        if self._sort_column in (0, 1):
            events.sort(key=lambda evt: evt.dt, reverse=self._sort_desc)
            return events

        if self._sort_column == 2:
            order = {"gain": 0, "loss": 1, "hdv_sale": 2, "correction": 3}
            events.sort(
                key=lambda evt: (order.get(evt.kind, 99), evt.dt),
                reverse=self._sort_desc,
            )
            return events

        if self._sort_column == 3:
            events.sort(
                key=lambda evt: (evt.libelle.lower(), evt.dt),
                reverse=self._sort_desc,
            )
            return events

        # Colonne montant: tri numerique signe
        events.sort(
            key=lambda evt: (self._event_signed_delta(evt), evt.dt),
            reverse=self._sort_desc,
        )
        return events

    def _on_header_clicked(self, section: int):
        if section == self._sort_column:
            self._sort_desc = not self._sort_desc
        else:
            self._sort_column = section
            # Par defaut: Date/Heure desc, Type/Libelle asc, Montant desc.
            if section in (2, 3):
                self._sort_desc = False
            else:
                self._sort_desc = True
        self._render()

    def _column_key(self, section: int) -> str:
        return f"transactions_col_width_{section}"

    def _apply_default_column_widths(self):
        self._table.setColumnWidth(0, 120)
        self._table.setColumnWidth(1, 96)
        self._table.setColumnWidth(2, 100)
        self._table.setColumnWidth(3, 220)
        self._table.setColumnWidth(4, 110)

    def _restore_column_widths(self):
        for section in range(self._table.columnCount()):
            width = self._settings.value(self._column_key(section), 0, type=int)
            if not width:
                width = self._settings.value(self._column_default_key(section), 0, type=int)
            if width and width >= 60:
                self._table.setColumnWidth(section, int(width))

    def _on_column_resized(self, section: int, _old_size: int, new_size: int):
        if not self._layout_ready:
            return
        if self._resizing_guard:
            return
        # Sauvegarde immediate pendant le drag pour conserver les largeurs.
        self._resizing_guard = True
        try:
            self._enforce_columns_fit(preferred_section=section)
        finally:
            self._resizing_guard = False
        self._settings.setValue(self._column_key(section), int(new_size))
        self._persist_column_widths()
        self._persist_default_column_layout()

    def _persist_column_widths(self):
        for section in range(self._table.columnCount()):
            self._settings.setValue(self._column_key(section), int(self._table.columnWidth(section)))
            self._settings.setValue(self._column_default_key(section), int(self._table.columnWidth(section)))

    def _column_order_key(self) -> str:
        return "transactions_col_order_state"

    def _column_default_key(self, section: int) -> str:
        return f"transactions_default_col_width_{section}"

    def _column_order_default_key(self) -> str:
        return "transactions_default_col_order_state"

    def _on_columns_reordered(self, _logical_index: int, _old_visual_index: int, _new_visual_index: int):
        if not self._layout_ready:
            return
        self._enforce_columns_fit()
        header = self._table.horizontalHeader()
        state = header.saveState()
        self._settings.setValue(self._column_order_key(), state)
        self._settings.setValue(self._column_order_default_key(), state)
        self._persist_default_column_layout()

    def _restore_column_order(self):
        state = self._settings.value(self._column_order_key())
        if state is None:
            state = self._settings.value(self._column_order_default_key())
        if state is None:
            return
        header = self._table.horizontalHeader()
        header.restoreState(state)
        self._enforce_columns_fit()

    def _persist_default_column_layout(self):
        self._persist_column_widths()
        header = self._table.horizontalHeader()
        state = header.saveState()
        self._settings.setValue(self._column_order_default_key(), state)

    def _on_toggle_organization_mode(self, enabled: bool):
        self._organization_mode = bool(enabled)
        self._settings.setValue("transactions_column_edit_mode", self._organization_mode)
        self._apply_organization_mode_visuals()

    def _apply_organization_mode_visuals(self):
        header = self._table.horizontalHeader()
        header.setSectionsMovable(self._organization_mode)
        header.setSectionResizeMode(QHeaderView.Interactive if self._organization_mode else QHeaderView.Fixed)
        self._organization_btn.setText("Edition active" if self._organization_mode else "Edition colonnes")
        if self._organization_mode:
            self._table.setStyleSheet(
                f"QTableWidget#txTable::item {{ border-right: 1px solid {BORDER}; }}"
                f"QHeaderView::section {{ border-right: 1px solid {BORDER}; }}"
            )
        else:
            self._table.setStyleSheet(
                "QTableWidget#txTable::item { border-right: none; }"
                "QHeaderView::section { border-right: none; }"
            )

    def _enforce_columns_fit(self, preferred_section: int | None = None):
        count = self._table.columnCount()
        if count <= 0:
            return

        viewport_width = max(0, self._table.viewport().width())
        if viewport_width <= 0:
            return

        min_w = self._table.horizontalHeader().minimumSectionSize()
        if viewport_width < (count * min_w):
            # Layout Qt pas encore stabilise (souvent au demarrage): ne rien ecraser.
            return
        widths = [int(self._table.columnWidth(i)) for i in range(count)]
        overflow = sum(widths) - viewport_width
        if overflow <= 0:
            return

        order: list[int] = []
        header = self._table.horizontalHeader()
        last_visual = header.logicalIndex(header.count() - 1)
        if last_visual not in order:
            order.append(last_visual)

        for idx in sorted(range(count), key=lambda i: widths[i], reverse=True):
            if idx == preferred_section:
                continue
            if idx not in order:
                order.append(idx)

        # On ne touche la colonne en cours de drag qu'en dernier recours.
        if preferred_section is not None and 0 <= preferred_section < count and preferred_section not in order:
            order.append(preferred_section)

        self._resizing_guard = True
        try:
            for idx in order:
                if overflow <= 0:
                    break
                current = int(self._table.columnWidth(idx))
                reducible = max(0, current - min_w)
                if reducible <= 0:
                    continue
                delta = min(reducible, overflow)
                self._table.setColumnWidth(idx, current - delta)
                overflow -= delta
        finally:
            self._resizing_guard = False

    def eventFilter(self, obj, event):
        if obj is self._table and event.type() == QEvent.Resize:
            self._enforce_columns_fit()
        return super().eventFilter(obj, event)

    def _update_header_labels(self):
        labels = ["Date", "Heure", "Type", "Libelle", "Montant"]
        arrow = "▼" if self._sort_desc else "▲"
        if 0 <= self._sort_column < len(labels):
            labels[self._sort_column] = f"{labels[self._sort_column]} {arrow}"
        self._table.setHorizontalHeaderLabels(labels)

    def _focus_event_in_history(self, event_index: int):
        if event_index < 0 or event_index >= len(self._events):
            return

        target = self._events[event_index]
        row_index = -1
        for row, evt in enumerate(self._display_events):
            if evt is target:
                row_index = row
                break
        if row_index < 0:
            for row, evt in enumerate(self._display_events):
                if evt == target:
                    row_index = row
                    break
        if row_index < 0:
            return

        self._reset_table_row_backgrounds()

        item0 = self._table.item(row_index, 0)
        if item0 is not None:
            self._table.scrollToItem(item0, QTableWidget.PositionAtCenter)

        self._table.clearSelection()
        self._table.selectRow(row_index)
        self._table.setCurrentCell(row_index, 0)

        self._start_pulse_row(row_index)

    def _reset_table_row_backgrounds(self):
        for row in range(self._table.rowCount()):
            base_bg = QColor("#16191f") if row % 2 == 0 else QColor("#12161d")
            for col in range(self._table.columnCount()):
                item = self._table.item(row, col)
                if item is not None:
                    item.setBackground(base_bg)

    def _set_row_background(self, row: int, color: QColor):
        if row < 0 or row >= self._table.rowCount():
            return
        for col in range(self._table.columnCount()):
            item = self._table.item(row, col)
            if item is not None:
                item.setBackground(color)

    def _start_pulse_row(self, row: int):
        if row < 0 or row >= len(self._display_events):
            return
        self._pulse_event = self._display_events[row]
        self._pulse_row_hint = int(row)
        self._pulse_tick = 0
        self._pulse_timer.start()
        self._on_pulse_tick()

    def _find_row_for_event(self, target: TransactionEvent | None) -> int:
        if target is None:
            return -1
        for idx, evt in enumerate(self._display_events):
            if evt is target:
                return idx
        for idx, evt in enumerate(self._display_events):
            if evt == target:
                return idx
        return -1

    def _on_pulse_tick(self):
        row = self._find_row_for_event(self._pulse_event)
        if row < 0 <= self._pulse_row_hint < self._table.rowCount():
            row = self._pulse_row_hint
        if row < 0 or row >= self._table.rowCount():
            self._pulse_timer.stop()
            return

        if self._pulse_tick >= self._pulse_max_ticks:
            self._pulse_timer.stop()
            base = QColor("#16191f") if row % 2 == 0 else QColor("#12161d")
            hi = QColor(TEAL)
            settle_blend = 0.45
            settled = QColor(
                int(base.red() * (1.0 - settle_blend) + hi.red() * settle_blend),
                int(base.green() * (1.0 - settle_blend) + hi.green() * settle_blend),
                int(base.blue() * (1.0 - settle_blend) + hi.blue() * settle_blend),
            )
            self._set_row_background(row, settled)
            self._table.viewport().update()
            return

        base = QColor("#16191f") if row % 2 == 0 else QColor("#12161d")
        hi = QColor(TEAL)
        alpha_cycle = self._pulse_tick % 4
        if alpha_cycle in (0, 1):
            blend = 0.62
        elif alpha_cycle == 2:
            blend = 0.48
        else:
            blend = 0.36

        pulse = QColor(
            int(base.red() * (1.0 - blend) + hi.red() * blend),
            int(base.green() * (1.0 - blend) + hi.green() * blend),
            int(base.blue() * (1.0 - blend) + hi.blue() * blend),
        )
        self._set_row_background(row, pulse)
        self._table.viewport().update()
        self._pulse_tick += 1

    def _render(self):
        self._update_header_labels()
        gains = sum(evt.amount for evt in self._events if evt.kind == "gain")
        losses = sum(evt.amount for evt in self._events if evt.kind == "loss")
        net = gains - losses

        self._gain_label.setText(f"+{_fmt_kamas(gains)}")
        self._loss_label.setText(f"-{_fmt_kamas(losses)}")
        self._net_label.setText(f"{net:+,}".replace(",", " "))

        current_kamas = self._read_current_kamas()

        points: list[int] = []
        first_correction_idx: int | None = None
        for idx, evt in enumerate(self._events):
            if evt.kind == "correction":
                first_correction_idx = idx
                break

        if first_correction_idx is None:
            # Aucun point de recalage manuel: on reconstruit en relatif puis
            # on ancre sur le kamas actuel pour eviter un depart artificiel a 0.
            raw_points: list[int] = []
            running = 0
            for evt in self._events:
                if evt.kind == "correction":
                    running = int(evt.amount)
                else:
                    running += self._event_signed_delta(evt)
                raw_points.append(running)

            if raw_points and current_kamas is not None:
                offset = int(current_kamas) - int(raw_points[-1])
                points = [int(value + offset) for value in raw_points]
            else:
                points = raw_points
        else:
            # Avant la 1ere correction: on decale le segment pour qu'il arrive
            # au niveau de la correction (ancrage absolu utilisateur).
            prefix_raw: list[int] = []
            running = 0
            for evt in self._events[:first_correction_idx]:
                running += self._event_signed_delta(evt)
                prefix_raw.append(running)

            if prefix_raw:
                first_corr_value = int(self._events[first_correction_idx].amount)
                prefix_offset = first_corr_value - int(prefix_raw[-1])
                points.extend(int(value + prefix_offset) for value in prefix_raw)

            anchored_balance: int | None = None
            for evt in self._events[first_correction_idx:]:
                if evt.kind == "correction":
                    anchored_balance = int(evt.amount)
                    points.append(anchored_balance)
                    continue

                delta = self._event_signed_delta(evt)
                if anchored_balance is None:
                    anchored_balance = delta
                else:
                    anchored_balance += delta
                points.append(int(anchored_balance))

        # Garde-fou final: ne jamais afficher de valeurs negatives.
        points = [max(0, int(value)) for value in points]
        # Source unique: la carte "KAMAS ACTUELS" suit la derniere valeur
        # de la serie du graphique pour eviter toute divergence d'affichage.
        if points:
            self._current_label.setText(_fmt_kamas(max(0, int(points[-1]))))
        else:
            if current_kamas is None:
                self._current_label.setText("--")
            else:
                self._current_label.setText(_fmt_kamas(max(0, int(current_kamas))))
        self._current_label.setStyleSheet(f"color: {TEAL}; font-size: 14px; font-weight: 800;")

        series = list(zip([evt.dt for evt in self._events], points))
        self._chart.set_series(series)

        display_events = self._sorted_events_for_table()
        self._display_events = display_events
        self._table.setRowCount(len(display_events))
        for row, evt in enumerate(display_events):
            date_txt, time_txt = _format_dt_parts(evt.dt)
            date_item = QTableWidgetItem(date_txt)
            time_item = QTableWidgetItem(time_txt)
            if evt.kind == "correction":
                tx_type = "Correction"
                amount_text = _fmt_kamas(evt.amount)
                color = QColor(TEAL)
            elif evt.kind == "hdv_sale":
                tx_type = "Vente HDV"
                amount_text = _fmt_kamas(evt.amount)
                color = QColor(TEXT_DIM)
            elif evt.kind == "gain":
                tx_type = "Gain"
                amount_text = f"+ {_fmt_kamas(evt.amount)}"
                color = QColor(GREEN)
            else:
                tx_type = "Perte"
                amount_text = f"- {_fmt_kamas(evt.amount)}"
                color = QColor(RED)

            type_item = QTableWidgetItem(tx_type)
            libelle_item = QTableWidgetItem(evt.libelle)
            amount_item = QTableWidgetItem(amount_text)
            type_item.setForeground(color)
            amount_item.setForeground(color)

            base_bg = QColor("#16191f") if row % 2 == 0 else QColor("#12161d")
            date_item.setBackground(base_bg)
            time_item.setBackground(base_bg)
            type_item.setBackground(base_bg)
            libelle_item.setBackground(base_bg)
            amount_item.setBackground(base_bg)

            date_item.setTextAlignment(Qt.AlignCenter)
            time_item.setTextAlignment(Qt.AlignCenter)
            type_item.setTextAlignment(Qt.AlignCenter)
            libelle_item.setTextAlignment(Qt.AlignCenter)
            amount_item.setTextAlignment(Qt.AlignCenter)

            self._table.setItem(row, 0, date_item)
            self._table.setItem(row, 1, time_item)
            self._table.setItem(row, 2, type_item)
            self._table.setItem(row, 3, libelle_item)
            self._table.setItem(row, 4, amount_item)
            self._table.setRowHeight(row, 24)

    def refresh(self):
        before = len(self._events)
        self._reload_history()
        if len(self._events) == before:
            # On rerender quand meme pour refléter d'eventuelles corrections
            # de fichier (rotation/troncature).
            self._render()
            return
        self._render()

    def _read_current_kamas(self) -> int | None:
        # Le parent est l'OverlayWindow, qui expose deja _current_kamas.
        parent_value = getattr(self.parent(), "_current_kamas", None)
        if isinstance(parent_value, int):
            return parent_value

        config_path = _PROJECT_ROOT / "data" / "config.json"
        if not config_path.exists():
            return None
        try:
            data = json.loads(config_path.read_text(encoding="utf-8"))
        except (OSError, ValueError, TypeError):
            return None

        base = int(data.get("base_kamas", 0) or 0)
        manual = int(data.get("manual_kamas_delta", 0) or 0)
        return base + manual
