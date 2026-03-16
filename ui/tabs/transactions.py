from __future__ import annotations

import json
import os
import re
import math
from dataclasses import dataclass
from datetime import datetime, timedelta
from pathlib import Path

from PyQt5.QtCore import Qt, QTimer, QSettings, QEvent, QPoint, pyqtSignal, QPropertyAnimation, QEasingCurve
from PyQt5.QtGui import QColor, QIcon, QPainter, QPen
from PyQt5.QtCore import QSize
from PyQt5.QtWidgets import (
    QApplication,
    QFrame,
    QGridLayout,
    QHBoxLayout,
    QLabel,
    QMenu,
    QMessageBox,
    QInputDialog,
    QPushButton,
    QWidgetAction,
    QTableWidget,
    QTableWidgetItem,
    QVBoxLayout,
    QWidget,
    QHeaderView,
    QGraphicsOpacityEffect,
)

from core.permanent_journal import read_permanent_kamas_events, sync_permanent_kamas_journal
from ui.tabs.base import BaseTab
from ui.theme import BG_PANEL, BORDER, GREEN, RED, TEAL, TEXT, TEXT_DIM

_PROJECT_ROOT = Path(__file__).resolve().parents[2]
_ASSETS_DIR   = Path(__file__).resolve().parents[1] / "assets"
_KAMAS_JOURNAL = _PROJECT_ROOT / "data" / "kamas_journal.jsonl"
_TX_LABELS_DB = _PROJECT_ROOT / "data" / "transaction_labels.json"
_APPDATA_WAKFU_DIR = Path(os.environ.get("APPDATA", "")) / "zaap" / "gamesLogs" / "wakfu" / "logs"
_KAMA_SYMBOL = "₭"

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


def _fmt_kamas_with_symbol(value: int) -> str:
    return f"{_fmt_kamas(value)} {_KAMA_SYMBOL}"


def _fmt_kamas_short(value: int) -> str:
    """Format court : KK pour 100K–999K, MK pour 1M+. En dessous : nombre seul (icône séparée)."""
    abs_v = abs(value)
    sign = "-" if value < 0 else ""
    if abs_v >= 1_000_000:
        m = abs_v / 1_000_000
        s = f"{m:.1f}".rstrip("0").rstrip(".")
        return f"{sign}{s} MK"
    if abs_v >= 100_000:
        k = round(abs_v / 1_000)
        return f"{sign}{k} KK"
    # < 100K en mode court : nombre uniquement, l'icône ₭ reste visible à côté
    return f"{sign}{_fmt_kamas(abs_v)}"


def _format_dt_parts(dt: datetime) -> tuple[str, str]:
    rounded = dt + timedelta(milliseconds=500)
    rounded = rounded.replace(microsecond=0)
    return rounded.strftime("%d/%m/%Y"), rounded.strftime("%H:%M:%S")


class _ClickableFrame(QFrame):
    """QFrame qui émet clicked() (clic gauche) ou right_clicked(QPoint) (clic droit).
    Les deux events sont acceptés pour éviter toute propagation."""
    clicked       = pyqtSignal()
    right_clicked = pyqtSignal(QPoint)

    def mousePressEvent(self, event):
        if event.button() == Qt.LeftButton:
            event.accept()
            self.clicked.emit()
            return
        if event.button() == Qt.RightButton:
            event.accept()
            self.right_clicked.emit(event.globalPos())
            return
        event.accept()  # bloquer tout autre bouton également


class KamasLineChart(QWidget):
    pointClicked = pyqtSignal(int)
    viewBoundsChanged = pyqtSignal(int, int)
    rangeMenuRequested = pyqtSignal(QPoint)
    zoomOutLimitReached = pyqtSignal(int)

    _MIN_ZOOM_POINTS = 2
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
        self._last_emitted_bounds: tuple[int, int] | None = None
        self._view_anim_timer = QTimer(self)
        self._view_anim_timer.setInterval(16)
        self._view_anim_timer.timeout.connect(self._on_view_anim_tick)
        self._anim_step: int = 0
        self._anim_steps: int = 10
        self._anim_from_span: float = 0.0
        self._anim_to_span: float = 0.0
        self._anim_from_center: float = 0.0
        self._anim_to_center: float = 0.0
        self.setMouseTracking(True)
        self.setMinimumHeight(150)

    def _stop_view_animation(self):
        if self._view_anim_timer.isActive():
            self._view_anim_timer.stop()

    def _start_view_animation(self, target_span: int, target_center: float):
        total = len(self._series)
        if total <= 0:
            return
        self._stop_view_animation()
        self._anim_step = 0
        self._anim_from_span = float(self._zoom_span or total)
        self._anim_to_span = float(max(1, min(total, int(target_span))))
        self._anim_from_center = float(self._zoom_center)
        self._anim_to_center = float(max(0.0, min(float(total - 1), float(target_center))))
        self._view_anim_timer.start()

    def _on_view_anim_tick(self):
        total = len(self._series)
        if total <= 0:
            self._stop_view_animation()
            return

        self._anim_step += 1
        t = self._anim_step / max(1, self._anim_steps)
        # Ease-out cubic for smoother camera feel.
        eased = 1.0 - pow(1.0 - max(0.0, min(1.0, t)), 3)

        span = self._anim_from_span + (self._anim_to_span - self._anim_from_span) * eased
        center = self._anim_from_center + (self._anim_to_center - self._anim_from_center) * eased
        self._zoom_span = int(round(span))
        self._zoom_center = float(center)
        self._emit_bounds_if_changed()
        self.update()

        if self._anim_step >= self._anim_steps:
            self._zoom_span = int(round(self._anim_to_span))
            self._zoom_center = float(self._anim_to_center)
            self._emit_bounds_if_changed()
            self.update()
            self._stop_view_animation()

    def _emit_bounds_if_changed(self):
        start, end = self._visible_bounds()
        current = (int(start), int(end))
        if self._last_emitted_bounds == current:
            return
        self._last_emitted_bounds = current
        self.viewBoundsChanged.emit(current[0], current[1])

    def set_series(self, series: list[tuple[datetime, int]], reset_view: bool = False):
        old_total = len(self._series)
        old_span = int(self._zoom_span)
        old_center = float(self._zoom_center)
        was_following_latest = False
        if old_total > 0:
            old_min_span = min(old_total, self._MIN_ZOOM_POINTS)
            old_effective_span = max(old_min_span, min(old_total, old_span or old_total))
            old_effective_center = max(0.0, min(float(old_total - 1), old_center))
            old_start = int(round(old_effective_center - old_effective_span / 2.0))
            old_end = old_start + old_effective_span
            if old_start < 0:
                old_start = 0
                old_end = old_effective_span
            if old_end > old_total:
                old_end = old_total
                old_start = max(0, old_end - old_effective_span)
            # Considere "live" si la fenetre colle deja la fin de serie.
            was_following_latest = old_end >= old_total - 1
        self._series = series
        total = len(self._series)
        self._stop_view_animation()
        if total <= 0:
            self._zoom_span = 0
            self._zoom_center = 0.0
        else:
            min_span = min(total, self._MIN_ZOOM_POINTS)
            if reset_view:
                # Changement de periode: recadrage anime vers la plage choisie.
                self._zoom_span = old_span if old_span > 0 else total
                self._zoom_center = old_center if old_total > 0 else (total - 1) / 2.0
            elif self._zoom_span <= 0:
                self._zoom_span = total
            self._zoom_span = max(min_span, min(total, self._zoom_span))
            if self._zoom_center <= 0.0:
                self._zoom_center = (total - 1) / 2.0
            elif old_total > 0 and total != old_total:
                # Conserve la position relative dans la serie quand de nouveaux
                # points arrivent, pour eviter les sauts de fenetre de zoom.
                rel = self._zoom_center / max(1.0, float(old_total - 1))
                self._zoom_center = rel * max(1.0, float(total - 1))

            if old_total > 0 and total > old_total and was_following_latest:
                # En mode live, on garde le dernier point visible a droite.
                self._zoom_center = float(total - 1)

            self._zoom_center = max(0.0, min(float(total - 1), self._zoom_center))
            if reset_view and total > 1:
                self._start_view_animation(total, (total - 1) / 2.0)
        self._last_emitted_bounds = None
        self._emit_bounds_if_changed()
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
        self._stop_view_animation()
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
            if delta < 0:
                self.zoomOutLimitReached.emit(max(1, int(round(abs(steps)))))
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

        # Zoom par zones:
        # - droite: colle la vue au present (dernier point a droite)
        # - centre: conserve le point sous le curseur
        # - gauche: garde un ancrage vers le passe
        if ratio >= 0.67:
            new_start = max_start
        elif ratio <= 0.33:
            new_start = start

        new_start = max(0, min(max_start, new_start))
        new_center = new_start + (new_span - 1) / 2.0

        self._zoom_span = new_span
        self._zoom_center = float(new_center)
        self._emit_bounds_if_changed()
        self.update()
        event.accept()

    def mouseDoubleClickEvent(self, event):
        if event.button() == Qt.LeftButton and self._series:
            self._stop_view_animation()
            self._zoom_span = len(self._series)
            self._zoom_center = (len(self._series) - 1) / 2.0
            self._emit_bounds_if_changed()
            self.update()
            event.accept()
            return
        super().mouseDoubleClickEvent(event)

    def mouseMoveEvent(self, event):
        if self._is_panning:
            self._stop_view_animation()
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
                self._emit_bounds_if_changed()
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

    def contextMenuEvent(self, event):
        self.rangeMenuRequested.emit(event.globalPos())
        event.accept()

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
        raw_min = min(visible_values)
        raw_max = max(visible_values)
        raw_span = max(1, raw_max - raw_min)

        # Echelle relative a la valeur absolue pour eviter des crans
        # visuellement exagérés quand les variations sont tres faibles.
        magnitude = max(1, abs(raw_min), abs(raw_max))
        min_relative_span = max(1, int(round(magnitude * 0.02)))
        if raw_span < min_relative_span:
            center = (raw_min + raw_max) / 2.0
            half = min_relative_span / 2.0
            v_min = int(math.floor(center - half))
            v_max = int(math.ceil(center + half))
            # Le solde ne doit pas descendre sous zero visuellement.
            if v_min < 0:
                shift = -v_min
                v_min += shift
                v_max += shift
        else:
            v_min = raw_min
            v_max = raw_max

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
            x0, y0 = coords[i - 1]
            x1, y1 = coords[i]
            # Courbe en escalier: valeur constante entre transactions,
            # puis saut net au moment du changement.
            p.drawLine(x0, y0, x1, y0)
            if y1 != y0:
                p.drawLine(x1, y0, x1, y1)

        if self._hover_index is not None and start <= self._hover_index < end:
            local_idx = self._hover_index - start
            hx, hy = coords[local_idx]
            hdt, hval = self._series[self._hover_index]
            prev_val = hval
            if self._hover_index > 0:
                prev_val = int(self._series[self._hover_index - 1][1])
            diff_val = int(hval) - int(prev_val)

            balance_txt = f"Solde: {_fmt_kamas_with_symbol(hval)}"
            diff_txt = f"Difference: {diff_val:+,}".replace(",", " ") + f" {_KAMA_SYMBOL}"
            when_txt = hdt.strftime("%d/%m/%Y %H:%M:%S")

            p.setPen(QPen(QColor(TEAL), 1, Qt.DashLine))
            p.drawLine(hx, top, hx, bottom)
            p.setPen(QPen(QColor(TEAL), 2))
            p.setBrush(QColor(TEAL))
            p.drawEllipse(QPoint(hx, hy), 3, 3)

            tooltip_lines = [balance_txt, diff_txt, when_txt]
            tooltip_x = max(left + 8, min(hx + 10, right - 220))
            tooltip_y = max(top + 8, hy - 38)
            tip_w = 208
            tip_h = 48
            p.setPen(QPen(QColor(BORDER), 1))
            p.setBrush(QColor(14, 18, 26, 235))
            p.drawRoundedRect(tooltip_x, tooltip_y, tip_w, tip_h, 6, 6)
            p.setPen(QColor(TEXT))
            p.drawText(tooltip_x + 8, tooltip_y + 14, tooltip_lines[0])
            p.setPen(QColor(TEAL))
            p.drawText(tooltip_x + 8, tooltip_y + 28, tooltip_lines[1])
            p.setPen(QColor(TEXT_DIM))
            p.drawText(tooltip_x + 8, tooltip_y + 42, tooltip_lines[2])


class TransactionsTab(BaseTab):
    _COLUMN_LAYOUT_SETTINGS_VERSION = 3
    _TIME_WINDOWS: list[tuple[str, str, timedelta | None]] = [
        ("5m", "5 minutes", timedelta(minutes=5)),
        ("15m", "15 minutes", timedelta(minutes=15)),
        ("30m", "30 minutes", timedelta(minutes=30)),
        ("1h", "1 heure", timedelta(hours=1)),
        ("6h", "6 heures", timedelta(hours=6)),
        ("24h", "24 heures", timedelta(hours=24)),
        ("72h", "72 heures", timedelta(hours=72)),
        ("1w", "1 semaine", timedelta(days=7)),
        ("2w", "2 semaines", timedelta(days=14)),
        ("1mo", "1 mois", timedelta(days=30)),
        ("3mo", "3 mois", timedelta(days=90)),
        ("6mo", "6 mois", timedelta(days=180)),
        ("1y", "1 an", timedelta(days=365)),
        ("all", "Toute la duree", None),
    ]

    def __init__(self, parent: QWidget | None = None):
        super().__init__(parent)
        self.setObjectName("transactionsTab")
        self._settings = QSettings("WakfuAssistant", "Overlay")
        self._label_suggestions_db = self._load_label_suggestions_db()
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
            QLabel#txChipLabel {{
                color: {TEXT_DIM};
                font-size: 9px;
                font-weight: 700;
                letter-spacing: 0.9px;
            }}
            QLabel#txDualTitle {{
                color: {TEXT_DIM};
                font-size: 9px;
                font-weight: 700;
                letter-spacing: 1.0px;
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
        self._chart_event_indexes: list[int] = []
        self._rendered_series: list[tuple[datetime, int]] = []
        self._view_start: int = 0
        self._view_end: int = 0
        saved_window = str(self._settings.value("transactions_time_window_key", "all", type=str) or "all")
        valid_window_keys = {key for key, _label, _delta in self._TIME_WINDOWS}
        self._time_window_key: str = saved_window if saved_window in valid_window_keys else "all"
        self._range_menu: QMenu | None = None
        self._range_current_btn: QPushButton | None = None
        self._range_shortest_btn: QPushButton | None = None
        self._range_shorter_btn: QPushButton | None = None
        self._range_longer_btn: QPushButton | None = None
        self._range_all_btn: QPushButton | None = None
        self._available_time_window_keys: list[str] = [key for key, _label, _delta in self._TIME_WINDOWS]
        self._custom_window_minutes: int | None = None
        self._last_non_all_window_key: str = "30m"
        self._reset_chart_view_on_next_render = False
        self._range_label_fx: QGraphicsOpacityEffect | None = None
        self._range_label_anim: QPropertyAnimation | None = None
        self._chart_fx: QGraphicsOpacityEffect | None = None
        self._chart_anim: QPropertyAnimation | None = None
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
        self._short_kamas: bool = False        # historique (Options)
        # État court indépendant par chip (clic direct sur le chip)
        self._chip_short: dict[str, bool] = {
            "gains": False, "losses": False, "net": False, "taxes": False, "kamas": False,
        }
        # Chips épinglés dans la barre de titre (mode replié)
        def _load_pin(k: str) -> bool:
            return bool(self._settings.value(f"chip_pinned_{k}", False, type=bool))
        self._chip_pinned: dict[str, bool] = {
            "gains": _load_pin("gains"),
            "losses": _load_pin("losses"),
            "net": _load_pin("net"),
            "kamas": _load_pin("kamas"),
        }
        # Références chips + cache valeurs pour le toggle léger
        self._gains_chip:  "_ClickableFrame | None" = None
        self._losses_chip: "_ClickableFrame | None" = None
        self._net_chip:    "_ClickableFrame | None" = None
        self._kamas_chip:  "_ClickableFrame | None" = None
        self._cached_gains: int = 0
        self._cached_losses: int = 0
        self._cached_net: int = 0
        self._cached_kamas: "int | None" = None
        self._column_layout_schema_migrated = False
        self._persist_debounce = QTimer(self)
        self._persist_debounce.setSingleShot(True)
        self._persist_debounce.setInterval(400)
        self._persist_debounce.timeout.connect(self._persist_column_widths)
        self._fit_throttle = QTimer(self)
        self._fit_throttle.setSingleShot(True)
        self._fit_throttle.setInterval(16)   # ~60fps max
        self._fit_throttle.timeout.connect(self._on_fit_throttle)

        root = QVBoxLayout(self)
        root.setContentsMargins(10, 10, 10, 10)
        root.setSpacing(10)

        metrics_card = QFrame(self)
        metrics_card.setObjectName("txCard")
        metrics_outer = QVBoxLayout(metrics_card)
        metrics_outer.setContentsMargins(10, 10, 10, 10)
        metrics_outer.setSpacing(8)

        # ── Ligne 1 : chips individuels ──────────────────────────────
        chips_row = QHBoxLayout()
        chips_row.setSpacing(8)
        chips_row.setContentsMargins(0, 0, 0, 0)

        gains_chip,  self._gains_value_label         = self._build_metric_chip("GAINS",         GREEN,  GREEN)
        pertes_chip, self._losses_value_label         = self._build_metric_chip("PERTES",        RED,    RED)
        net_chip,    self._net_value_label            = self._build_metric_chip("NET",           TEAL,   TEAL)
        taxes_chip,  self._taxes_label                = self._build_metric_chip("TAXES",         RED,    RED)
        kamas_chip,  self._current_kamas_value_label  = self._build_metric_chip("KAMAS ACTUELS", TEXT,   TEAL)

        self._gains_chip  = gains_chip
        self._losses_chip = pertes_chip
        self._net_chip    = net_chip
        self._kamas_chip  = kamas_chip

        for _chip, _key in (
            (gains_chip,  "gains"),
            (pertes_chip, "losses"),
            (net_chip,    "net"),
            (taxes_chip,  "taxes"),
            (kamas_chip,  "kamas"),
        ):
            _chip.clicked.connect(lambda k=_key: self._toggle_chip(k))
            if _key in self._chip_pinned:  # taxes non épingable (pas de valeur)
                _chip.right_clicked.connect(lambda pos, k=_key: self._show_chip_pin_menu(pos, k))
            chips_row.addWidget(_chip, 1)

        # ── Ligne 2 : cartes détail (données futures) ────────────────
        detail_row = QHBoxLayout()
        detail_row.setSpacing(8)
        detail_row.setContentsMargins(0, 0, 0, 0)

        hdv_box, self._hdv_previsionnel_label, self._hdv_recuperer_label = self._build_metric_dual_box(
            "H. DES VENTES",
            "PRÉVISIONNEL", TEAL,
            "À RÉCUPÉRER",  GREEN,
        )
        sources_box, self._sources_commerce_label, self._sources_autres_label = self._build_metric_dual_box(
            "SOURCES",
            "COMMERCE",  TEAL,
            "AUTRES",    TEXT_DIM,
        )

        detail_row.addWidget(hdv_box,     1)
        detail_row.addWidget(sources_box, 1)

        metrics_outer.addLayout(chips_row)
        metrics_outer.addLayout(detail_row)

        root.addWidget(metrics_card)

        chart_frame = QFrame(self)
        chart_frame.setObjectName("txCard")
        chart_frame.setStyleSheet(
            f"QFrame {{ background: {BG_PANEL}; border: 1px solid {BORDER}; border-radius: 8px; }}"
        )
        chart_layout = QVBoxLayout(chart_frame)
        chart_layout.setContentsMargins(10, 10, 10, 8)
        chart_layout.setSpacing(6)

        chart_head = QHBoxLayout()
        chart_head.setContentsMargins(0, 0, 0, 0)
        chart_head.setSpacing(8)

        chart_title = QLabel("Evolution des transactions")
        chart_title.setObjectName("txSectionTitle")
        chart_head.addWidget(chart_title)
        chart_head.addStretch(1)

        self._range_label = QLabel(self._format_range_label(self._selected_window_label()))
        self._range_label.setObjectName("txSectionSubtitle")
        chart_head.addWidget(self._range_label)
        self._range_label_fx = QGraphicsOpacityEffect(self._range_label)
        self._range_label_fx.setOpacity(1.0)
        self._range_label.setGraphicsEffect(self._range_label_fx)

        chart_layout.addLayout(chart_head)

        self._chart = KamasLineChart(chart_frame)
        self._chart.pointClicked.connect(self._focus_event_in_history)
        self._chart.viewBoundsChanged.connect(self._on_chart_view_changed)
        self._chart.rangeMenuRequested.connect(self._show_chart_range_menu)
        self._chart.zoomOutLimitReached.connect(self._on_chart_zoom_out_limit)
        self._chart_fx = QGraphicsOpacityEffect(self._chart)
        self._chart_fx.setOpacity(1.0)
        self._chart.setGraphicsEffect(self._chart_fx)
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

        self._organization_btn = QPushButton()
        self._organization_btn.setCheckable(True)
        self._organization_btn.setChecked(bool(self._organization_mode))
        self._organization_btn.setFixedSize(26, 26)
        self._organization_btn.setIcon(QIcon(str(_ASSETS_DIR / "columns.svg")))
        self._organization_btn.setIconSize(QSize(14, 14))
        self._organization_btn.setToolTip("Édition des colonnes — réorganiser et redimensionner")
        self._organization_btn.setCursor(Qt.PointingHandCursor)
        self._organization_btn.setStyleSheet(f"""
            QPushButton {{
                background: rgba(30,180,176,0.06);
                border: 1px solid {BORDER};
                border-radius: 6px;
                padding: 0;
            }}
            QPushButton:hover {{
                background: rgba(30,180,176,0.18);
                border-color: {TEAL};
            }}
            QPushButton:checked {{
                background: rgba(30,180,176,0.28);
                border-color: {TEAL};
            }}
        """)
        self._organization_btn.clicked.connect(self._on_toggle_organization_mode)
        table_head.addWidget(self._organization_btn)
        table_layout.addLayout(table_head)

        self._table = QTableWidget(0, 5, table_card)
        self._table.setObjectName("txTable")
        self._table.setHorizontalHeaderLabels(["Date", "Heure", "Type", "Libelle", f"Montant ({_KAMA_SYMBOL})"])
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
        header.setMinimumSectionSize(56)
        header.setStretchLastSection(False)
        header.setCascadingSectionResizes(False)
        header.setSectionsClickable(True)
        header.setSectionsMovable(True)
        header.sectionClicked.connect(self._on_header_clicked)
        header.sectionResized.connect(self._on_column_resized)
        header.sectionMoved.connect(self._on_columns_reordered)
        self._table.viewport().installEventFilter(self)
        table_layout.addWidget(self._table, 1)
        root.addWidget(table_card, 1)

        self._ensure_column_layout_settings_schema()
        self._apply_default_column_widths()
        self._apply_default_column_order()
        if not self._column_layout_schema_migrated:
            self._restore_column_widths()
            self._restore_column_order()
        else:
            self._persist_column_widths()
            self._settings.setValue(self._column_order_key(), self._table.horizontalHeader().saveState())
        self._table.horizontalHeader().setStretchLastSection(False)
        self._enforce_columns_fit()
        self._apply_organization_mode_visuals()
        self._layout_ready = True

        self._reload_history()
        self._render()

        self._timer = QTimer(self)
        self._timer.timeout.connect(self.refresh)
        self._timer.start(1000)

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

    def _build_metric_chip(self, label: str, value_color: str, accent: str) -> "tuple[_ClickableFrame, QLabel]":
        """Chip compact cliquable : accent colorée en haut, label dim, valeur + icône kama."""
        chip = _ClickableFrame(self)
        chip.setObjectName("txMetricChip")
        chip.setCursor(Qt.PointingHandCursor)
        chip.setStyleSheet(
            f"QFrame#txMetricChip {{"
            f"  background: {BG_PANEL};"
            f"  border-left:   1px solid {BORDER};"
            f"  border-right:  1px solid {BORDER};"
            f"  border-bottom: 1px solid {BORDER};"
            f"  border-top:    3px solid {accent};"
            f"  border-radius: 8px;"
            f"}}"
        )
        lay = QVBoxLayout(chip)
        lay.setContentsMargins(12, 8, 12, 8)
        lay.setSpacing(3)

        lbl = QLabel(label)
        lbl.setObjectName("txChipLabel")
        lbl.setAttribute(Qt.WA_TransparentForMouseEvents, True)

        # Ligne valeur : nombre + icône ₭ dorée (masquée en mode court si KK/MK)
        val_row = QHBoxLayout()
        val_row.setContentsMargins(0, 0, 0, 0)
        val_row.setSpacing(4)

        val = QLabel("--")
        val.setObjectName("txMetricValue")
        val.setStyleSheet(f"color: {value_color}; font-size: 16px; font-weight: 800;")
        val.setAttribute(Qt.WA_TransparentForMouseEvents, True)

        kama_icon = QLabel(_KAMA_SYMBOL)
        kama_icon.setObjectName("txKamaIcon")
        kama_icon.setStyleSheet("color: #c8a020; font-size: 13px; font-weight: 900;")
        kama_icon.setAttribute(Qt.WA_TransparentForMouseEvents, True)
        kama_icon.setAlignment(Qt.AlignBottom | Qt.AlignLeft)

        val_row.addWidget(val)
        val_row.addWidget(kama_icon)
        val_row.addStretch()

        lay.addWidget(lbl)
        lay.addLayout(val_row)

        chip._kama_icon = kama_icon  # référence dynamique pour show/hide
        return chip, val

    def _build_metric_dual_box(
        self,
        title: str,
        left_name: str,
        left_color: str,
        right_name: str,
        right_color: str,
    ) -> tuple[QFrame, QLabel, QLabel]:
        """Carte détail : titre + séparateur + deux colonnes avec diviseur central."""
        card = QFrame(self)
        card.setObjectName("txCard")
        card.setStyleSheet(
            f"QFrame#txCard {{"
            f"  background: {BG_PANEL};"
            f"  border: 1px solid {BORDER};"
            f"  border-radius: 8px;"
            f"}}"
        )

        lay = QVBoxLayout(card)
        lay.setContentsMargins(12, 8, 12, 8)
        lay.setSpacing(6)

        # En-tête
        title_lbl = QLabel(title)
        title_lbl.setObjectName("txDualTitle")
        lay.addWidget(title_lbl)

        # Séparateur horizontal
        h_sep = QFrame()
        h_sep.setFrameShape(QFrame.HLine)
        h_sep.setStyleSheet(f"background: {BORDER}; max-height: 1px; border: none;")
        lay.addWidget(h_sep)

        # Deux colonnes
        cols = QHBoxLayout()
        cols.setSpacing(0)
        cols.setContentsMargins(0, 0, 0, 0)

        left_lbl = QLabel(left_name)
        left_lbl.setObjectName("txChipLabel")
        left_val = QLabel("--")
        left_val.setObjectName("txMetricValue")
        left_val.setStyleSheet(f"color: {left_color}; font-size: 14px; font-weight: 800;")
        left_col = QVBoxLayout()
        left_col.setSpacing(3)
        left_col.setContentsMargins(0, 2, 0, 2)
        left_col.addWidget(left_lbl)
        left_col.addWidget(left_val)

        # Diviseur vertical
        v_sep = QFrame()
        v_sep.setFrameShape(QFrame.VLine)
        v_sep.setStyleSheet(f"background: {BORDER}; max-width: 1px; border: none;")
        v_sep.setFixedWidth(1)

        right_lbl = QLabel(right_name)
        right_lbl.setObjectName("txChipLabel")
        right_val = QLabel("--")
        right_val.setObjectName("txMetricValue")
        right_val.setStyleSheet(f"color: {right_color}; font-size: 14px; font-weight: 800;")
        right_col = QVBoxLayout()
        right_col.setSpacing(3)
        right_col.setContentsMargins(12, 2, 0, 2)
        right_col.addWidget(right_lbl)
        right_col.addWidget(right_val)

        cols.addLayout(left_col, 1)
        cols.addWidget(v_sep)
        cols.addLayout(right_col, 1)
        lay.addLayout(cols)

        return card, left_val, right_val

    # ── Nombres courts ───────────────────────────────────────────────────

    def set_short_kamas(self, enabled: bool):
        """Active/désactive le format court pour l'historique (depuis Options)."""
        self._short_kamas = enabled
        if self._layout_ready:
            self._render()

    def get_metrics(self) -> tuple[int, int, int, int]:
        """Retourne (gains, losses, net, kamas) pour la barre de titre repliée."""
        return (
            self._cached_gains,
            self._cached_losses,
            self._cached_net,
            self._cached_kamas if self._cached_kamas is not None else 0,
        )

    def get_pinned_metrics(self) -> list[tuple[str, str, str]]:
        """Retourne [(texte_court, couleur_hex, tooltip_complet)] pour les chips épinglés."""
        def _fmt(v: int) -> str:
            av = abs(v)
            if av >= 1_000_000:
                return f"{v / 1_000_000:.1f}M ₭"
            if av >= 1_000:
                return f"{v / 1_000:.0f}K ₭"
            return f"{v:,} ₭".replace(",", "\u202f")

        def _full(v: int) -> str:
            return f"{v:,} ₭".replace(",", "\u202f")

        result: list[tuple[str, str, str]] = []
        for key in ("gains", "losses", "net", "kamas"):
            if not self._chip_pinned.get(key, False):
                continue
            if key == "gains":
                result.append((f"↑ {_fmt(self._cached_gains)}", GREEN,
                                f"Gains : +{_full(self._cached_gains)}"))
            elif key == "losses":
                result.append((f"↓ {_fmt(self._cached_losses)}", RED,
                                f"Pertes : -{_full(self._cached_losses)}"))
            elif key == "net":
                sign = "+" if self._cached_net >= 0 else ""
                color = GREEN if self._cached_net > 0 else (RED if self._cached_net < 0 else TEAL)
                result.append((f"~ {sign}{_fmt(self._cached_net)}", color,
                                f"Net : {sign}{_full(self._cached_net)}"))
            elif key == "kamas":
                kamas = self._cached_kamas or 0
                result.append((f"⬟ {_fmt(kamas)}", TEXT_DIM,
                                f"Kamas actuels : {_full(kamas)}"))
        return result

    def _show_chip_pin_menu(self, pos: QPoint, key: str):
        """Affiche le menu contextuel pour épingler/désépingler un chip."""
        from PyQt5.QtWidgets import QMenu
        pinned = self._chip_pinned.get(key, False)
        menu = QMenu(self)
        label = "Désépingler de la barre repliée" if pinned else "Épingler dans la barre repliée"
        action = menu.addAction(label)
        action.triggered.connect(lambda: self._toggle_pin_chip(key))
        menu.exec_(pos)

    def _toggle_pin_chip(self, key: str):
        """Bascule l'état épinglé d'un chip et persiste le choix."""
        self._chip_pinned[key] = not self._chip_pinned.get(key, False)
        self._settings.setValue(f"chip_pinned_{key}", self._chip_pinned[key])

    def _toggle_chip(self, key: str):
        """Bascule le mode court/complet d'un chip individuel (clic direct)."""
        self._chip_short[key] = not self._chip_short.get(key, False)
        if key in ("gains", "losses"):
            self._set_flow_metrics(self._cached_gains, self._cached_losses)
        elif key in ("net", "kamas"):
            self._set_balance_metrics(self._cached_net, self._cached_kamas)

    def _disp(self, value: int) -> str:
        """Format historique selon le réglage Options."""
        return _fmt_kamas_short(value) if self._short_kamas else _fmt_kamas_with_symbol(value)

    @staticmethod
    def _chip_display(value: int, short: bool) -> tuple[str, bool]:
        """Retourne (texte_valeur, show_kama_icon) pour un chip selon son état."""
        if short and abs(value) >= 100_000:
            return _fmt_kamas_short(value), False   # "150 KK" ou "1.5 MK", icône masquée
        return _fmt_kamas(value), True              # nombre seul, icône ₭ visible

    # ── Métriques ────────────────────────────────────────────────────────

    def _set_flow_metrics(self, gains: int, losses: int):
        self._cached_gains = gains
        self._cached_losses = losses

        # GAINS
        g_short = self._chip_short.get("gains", False)
        g_txt, g_icon = self._chip_display(gains, g_short)
        self._gains_value_label.setText(f"+{g_txt}")
        if self._gains_chip:
            self._gains_chip._kama_icon.setVisible(g_icon)
            # Tooltip = format alternatif
            alt = _fmt_kamas_short(gains) if not g_short else f"{_fmt_kamas(gains)} {_KAMA_SYMBOL}"
            self._gains_chip.setToolTip(f"+{alt}" if abs(gains) >= 100_000 or g_short else "")

        # LOSSES
        l_short = self._chip_short.get("losses", False)
        l_txt, l_icon = self._chip_display(losses, l_short)
        self._losses_value_label.setText(f"-{l_txt}")
        if self._losses_chip:
            self._losses_chip._kama_icon.setVisible(l_icon)
            alt = _fmt_kamas_short(losses) if not l_short else f"{_fmt_kamas(losses)} {_KAMA_SYMBOL}"
            self._losses_chip.setToolTip(f"-{alt}" if abs(losses) >= 100_000 or l_short else "")

    def _set_balance_metrics(self, net: int, current_kamas: int | None):
        self._cached_net = net
        self._cached_kamas = current_kamas

        # NET
        n_short = self._chip_short.get("net", False)
        n_txt, n_icon = self._chip_display(abs(net), n_short)
        sign = "+" if net >= 0 else "-"
        net_color = GREEN if net > 0 else (RED if net < 0 else TEAL)
        self._net_value_label.setText(f"{sign}{n_txt}")
        self._net_value_label.setStyleSheet(f"color: {net_color}; font-size: 16px; font-weight: 800;")
        if self._net_chip:
            self._net_chip._kama_icon.setVisible(n_icon)
            abs_net = abs(net)
            alt = _fmt_kamas_short(abs_net) if not n_short else f"{_fmt_kamas(abs_net)} {_KAMA_SYMBOL}"
            self._net_chip.setToolTip(f"{sign}{alt}" if abs_net >= 100_000 or n_short else "")

        # KAMAS ACTUELS
        if current_kamas is None:
            self._current_kamas_value_label.setText("--")
            if self._kamas_chip:
                self._kamas_chip._kama_icon.setVisible(True)
                self._kamas_chip.setToolTip("")
        else:
            ck = max(0, int(current_kamas))
            k_short = self._chip_short.get("kamas", False)
            k_txt, k_icon = self._chip_display(ck, k_short)
            self._current_kamas_value_label.setText(k_txt)
            if self._kamas_chip:
                self._kamas_chip._kama_icon.setVisible(k_icon)
                alt = _fmt_kamas_short(ck) if not k_short else f"{_fmt_kamas(ck)} {_KAMA_SYMBOL}"
                self._kamas_chip.setToolTip(alt if ck >= 100_000 or k_short else "")

    def _on_chart_view_stats(self, pct: float, _first: int, _last: int, gains: int, losses: int):
        # Methode conservee pour compatibilite; la carte affiche desormais
        # uniquement les kamas actuels (valeur absolue).
        _ = (pct, gains, losses)
        if _last:
            self._set_balance_metrics(0, max(0, _last))

    def _on_chart_view_changed(self, start: int, end: int):
        self._view_start = max(0, int(start))
        self._view_end = max(self._view_start, int(end))
        self._refresh_range_label_from_view()
        self._update_metrics_from_visible_range()

    @staticmethod
    def _format_visible_span_label(total_seconds: int) -> str:
        seconds = max(0, int(total_seconds))
        if seconds < 60:
            return "moins d'1 min"

        minutes = seconds // 60
        if minutes < 60:
            return f"{minutes} min"

        hours, rem_minutes = divmod(minutes, 60)
        if hours < 24:
            if rem_minutes == 0:
                return f"{hours} h"
            return f"{hours} h {rem_minutes} min"

        days, rem_hours = divmod(hours, 24)
        if rem_hours == 0:
            return f"{days} j"
        return f"{days} j {rem_hours} h"

    def _refresh_range_label_from_view(self):
        series = self._rendered_series
        total = len(series)
        if total < 2:
            self._set_range_label(self._selected_window_label())
            return

        start = max(0, min(total - 1, int(self._view_start)))
        end = max(start + 1, min(total, int(self._view_end)))
        first_dt = series[start][0]
        last_dt = series[end - 1][0]
        if last_dt < first_dt:
            first_dt, last_dt = last_dt, first_dt

        span_label = self._format_visible_span_label(int((last_dt - first_dt).total_seconds()))
        self._set_range_label(span_label)

    @staticmethod
    def _normalize_duration_label_text(label: str) -> str:
        txt = str(label or "").strip()
        txt = re.sub(r"\s+", " ", txt)
        txt = re.sub(r"(?<=\d)j(?=\d)", " j ", txt)
        txt = re.sub(r"(?<=\d)j", " j", txt)
        txt = re.sub(r"(?<=\d)h", " h", txt)
        txt = re.sub(r"(?<=\d)m(?![a-z])", " min", txt)
        txt = re.sub(r"\s+", " ", txt).strip()
        return txt

    def _format_range_label(self, label: str) -> str:
        return f"Fenetre: {self._normalize_duration_label_text(label)}"

    def _set_range_label(self, label: str):
        self._range_label.setText(self._format_range_label(label))

    def _selected_window_label(self) -> str:
        if self._time_window_key != "all" and self._custom_window_minutes is not None:
            return self._format_duration_label_from_minutes(int(self._custom_window_minutes))
        for key, label, _delta in self._TIME_WINDOWS:
            if key == self._time_window_key:
                return label
        return "Toute la duree"

    @staticmethod
    def _format_duration_label_from_minutes(minutes_total: int) -> str:
        minutes = max(1, int(minutes_total))
        days, rem_minutes = divmod(minutes, 24 * 60)
        hours, rem = divmod(rem_minutes, 60)

        if days > 0:
            if hours > 0:
                return f"{days} j {hours} h"
            return f"{days} j"

        if hours > 0:
            if rem > 0:
                return f"{hours} h {rem} min"
            return f"{hours} h"

        return f"{minutes} min"

    def _selected_window_delta(self) -> timedelta | None:
        if self._time_window_key == "all":
            return None
        if self._custom_window_minutes is not None:
            return timedelta(minutes=max(1, int(self._custom_window_minutes)))
        for key, _label, delta in self._TIME_WINDOWS:
            if key == self._time_window_key:
                return delta
        return None

    @staticmethod
    def _zoom_out_minute_step(current_minutes: int) -> int:
        # Progression demandee: <10 => +1, >=10 => +2, >=15 => +3, >=20 => +4, etc.
        return max(1, int(current_minutes) // 5)

    def _current_window_short_label(self) -> str:
        if self._time_window_key != "all" and self._custom_window_minutes is not None:
            minutes = max(1, int(self._custom_window_minutes))
            if minutes < 60:
                return f"{minutes}m"
            hours, rem = divmod(minutes, 60)
            if rem == 0:
                return f"{hours}h"
            return f"{hours}h{rem:02d}"
        return self._window_short_label(self._time_window_key)

    def _on_chart_zoom_out_limit(self, steps: int):
        if self._time_window_key == "all":
            return

        delta = self._selected_window_delta()
        if delta is None:
            return

        minutes = max(1, int(delta.total_seconds() // 60))
        for _ in range(max(1, int(steps))):
            minutes += self._zoom_out_minute_step(minutes)

        # Si on depasse l'historique utile, on repasse en "Toute la duree".
        if self._events:
            history_minutes = max(1, int((datetime.now() - self._events[0].dt).total_seconds() // 60))
            if minutes >= history_minutes:
                self._custom_window_minutes = None
                self._set_time_window("all")
                return

        self._custom_window_minutes = minutes
        self._reset_chart_view_on_next_render = True
        self._set_range_label(self._selected_window_label())
        self._animate_range_label()
        self._render()
        self._animate_chart_refresh()
        self._refresh_range_menu_controls()

    @staticmethod
    def _window_short_label(key: str) -> str:
        short = {
            "5m": "5m",
            "15m": "15m",
            "30m": "30m",
            "1h": "1h",
            "6h": "6h",
            "24h": "24h",
            "72h": "72h",
            "1w": "1w",
            "2w": "2w",
            "1mo": "1mo",
            "3mo": "3mo",
            "6mo": "6mo",
            "1y": "1a",
            "all": "Tout",
        }
        return short.get(key, key)

    def _time_window_index(self, key: str) -> int:
        for idx, (k, _label, _delta) in enumerate(self._TIME_WINDOWS):
            if k == key:
                return idx
        return len(self._TIME_WINDOWS) - 1

    def _ordered_available_window_keys(self) -> list[str]:
        allowed = set(self._available_time_window_keys)
        ordered = [key for key, _label, _delta in self._TIME_WINDOWS if key in allowed]
        if not ordered:
            return ["all"]
        if "all" not in ordered:
            ordered.append("all")
        return ordered

    def _preferred_non_all_window_key(self) -> str:
        available = self._ordered_available_window_keys()
        non_all = [key for key in available if key != "all"]
        if not non_all:
            return "all"
        if self._last_non_all_window_key in non_all:
            return self._last_non_all_window_key
        return non_all[-1]

    @staticmethod
    def _compute_available_window_keys(series: list[tuple[datetime, int]], windows: list[tuple[str, str, timedelta | None]]) -> list[str]:
        if not series:
            return ["all"]

        now = datetime.now()
        oldest_dt = series[0][0]
        newest_dt = series[-1][0]
        available: list[str] = []

        for key, _label, delta in windows:
            if delta is None:
                continue
            cutoff = now - delta
            # Fenetre disponible seulement si on couvre reellement la duree
            # et qu'il y a encore de l'activite recente dans cette plage.
            has_full_depth = oldest_dt <= cutoff
            has_recent_activity = newest_dt >= cutoff
            if has_full_depth and has_recent_activity:
                available.append(key)

        available.append("all")
        return available

    def _suggested_window_keys(self) -> list[str]:
        idx = self._time_window_index(self._time_window_key)
        suggestions: list[str] = []

        for delta in (-1, 0, 1):
            j = idx + delta
            if 0 <= j < len(self._TIME_WINDOWS):
                key = self._TIME_WINDOWS[j][0]
                if key not in suggestions:
                    suggestions.append(key)

        # Jalons utiles pour naviguer vite sans inonder de boutons.
        for key in ("1h", "24h", "1w", "all"):
            if key not in suggestions:
                suggestions.append(key)

        return suggestions[:5]

    def _set_time_window_by_index(self, index: int, menu: QMenu | None = None):
        if index < 0:
            index = 0
        if index >= len(self._TIME_WINDOWS):
            index = len(self._TIME_WINDOWS) - 1
        self._set_time_window(self._TIME_WINDOWS[index][0], menu)

    def _step_time_window(self, delta: int):
        step = int(delta)
        if step == 0:
            return

        ordered = self._ordered_available_window_keys()
        if len(ordered) <= 1:
            return

        current = self._time_window_key if self._time_window_key in ordered else ordered[-1]
        idx = ordered.index(current)
        target = (idx + step) % len(ordered)
        self._set_time_window(ordered[target])

    def _range_button_style(self) -> str:
        return (
            f"QPushButton {{ border: 1px solid {BORDER}; border-radius: 10px; padding: 0 8px; "
            "background: rgba(18,22,29,180); color: #d7e6f2; }}"
            f"QPushButton:hover {{ border-color: {TEAL}; background: rgba(56,180,170,55); color: {TEAL}; }}"
            "QPushButton:pressed { background: rgba(56,180,170,90); }"
            "QPushButton:disabled { color: #6f7c8d; border-color: #2a3240; background: rgba(18,22,29,120); }"
        )

    def _animate_range_label(self):
        if self._range_label_fx is None:
            return
        anim = QPropertyAnimation(self._range_label_fx, b"opacity", self)
        anim.setDuration(180)
        anim.setStartValue(0.45)
        anim.setEndValue(1.0)
        anim.setEasingCurve(QEasingCurve.OutCubic)
        anim.start()
        self._range_label_anim = anim

    def _animate_chart_refresh(self):
        if self._chart_fx is None:
            return
        anim = QPropertyAnimation(self._chart_fx, b"opacity", self)
        anim.setDuration(160)
        anim.setStartValue(0.70)
        anim.setEndValue(1.0)
        anim.setEasingCurve(QEasingCurve.OutCubic)
        anim.start()
        self._chart_anim = anim

    def _refresh_range_menu_controls(self):
        available = self._ordered_available_window_keys()
        if self._range_current_btn is not None:
            self._range_current_btn.setText(self._current_window_short_label())
        can_navigate = len(available) > 1
        if self._range_shorter_btn is not None:
            self._range_shorter_btn.setEnabled(can_navigate)
        if self._range_longer_btn is not None:
            self._range_longer_btn.setEnabled(can_navigate)

    def _range_step_delta(self) -> int:
        # Shift = navigation rapide entre plages.
        return 3 if (QApplication.keyboardModifiers() & Qt.ShiftModifier) else 1

    def _on_range_prev_clicked(self):
        self._step_time_window(-self._range_step_delta())

    def _on_range_next_clicked(self):
        self._step_time_window(self._range_step_delta())

    def _on_range_current_clicked(self):
        # Bascule instantanee: plage active <-> toute duree.
        if self._time_window_key == "all":
            self._set_time_window(self._preferred_non_all_window_key())
        else:
            self._last_non_all_window_key = self._time_window_key
            self._set_time_window("all")

    def _show_chart_range_menu(self, global_pos: QPoint):
        menu = QMenu(self)
        menu.setStyleSheet(
            f"QMenu {{ background: {BG_PANEL}; border: 1px solid {BORDER}; }}"
            "QMenu::item { background: transparent; }"
        )
        container = QWidget(menu)
        root = QHBoxLayout(container)
        root.setContentsMargins(6, 6, 6, 6)
        root.setSpacing(4)

        available = self._ordered_available_window_keys()
        can_navigate = len(available) > 1

        def _mk_btn(text: str, min_w: int = 24) -> QPushButton:
            btn = QPushButton(text)
            btn.setMinimumHeight(22)
            btn.setMinimumWidth(min_w)
            btn.setStyleSheet(self._range_button_style())
            btn.setCursor(Qt.PointingHandCursor)
            return btn

        shorter_btn = _mk_btn("<", 24)
        shorter_btn.setEnabled(can_navigate)
        shorter_btn.setToolTip("Intervalle plus court (Shift: saut rapide)")
        shorter_btn.clicked.connect(lambda _checked=False: self._on_range_prev_clicked())
        root.addWidget(shorter_btn)
        self._range_shorter_btn = shorter_btn

        current_btn = _mk_btn(self._current_window_short_label(), 52)
        current_btn.setStyleSheet(
            f"QPushButton {{ border: 1px solid {TEAL}; color: {TEAL}; border-radius: 10px; padding: 0 10px; font-weight: 700; "
            "background: rgba(56,180,170,35); }}"
        )
        current_btn.setEnabled(True)
        current_btn.setCursor(Qt.PointingHandCursor)
        current_btn.setToolTip("Basculer avec Toute la duree")
        current_btn.clicked.connect(lambda _checked=False: self._on_range_current_clicked())
        root.addWidget(current_btn)
        self._range_current_btn = current_btn

        longer_btn = _mk_btn(">", 24)
        longer_btn.setEnabled(can_navigate)
        longer_btn.setToolTip("Intervalle plus long (Shift: saut rapide)")
        longer_btn.clicked.connect(lambda _checked=False: self._on_range_next_clicked())
        root.addWidget(longer_btn)
        self._range_longer_btn = longer_btn

        action = QWidgetAction(menu)
        action.setDefaultWidget(container)
        menu.addAction(action)
        self._range_menu = menu
        menu.exec_(global_pos)
        self._range_menu = None
        self._range_current_btn = None
        self._range_shorter_btn = None
        self._range_longer_btn = None
        self._range_shortest_btn = None
        self._range_all_btn = None

    def _set_time_window(self, key: str, menu: QMenu | None = None):
        key = str(key)
        if key == self._time_window_key:
            if self._custom_window_minutes is not None:
                self._custom_window_minutes = None
                self._reset_chart_view_on_next_render = True
                self._set_range_label(self._selected_window_label())
                self._render()
            self._refresh_range_menu_controls()
            return
        if key != "all" and key not in set(self._available_time_window_keys):
            return
        self._custom_window_minutes = None
        if key != "all":
            self._last_non_all_window_key = key
        self._time_window_key = key
        self._settings.setValue("transactions_time_window_key", self._time_window_key)
        self._reset_chart_view_on_next_render = True
        self._set_range_label(self._selected_window_label())
        self._animate_range_label()
        self._render()
        self._animate_chart_refresh()
        self._refresh_range_menu_controls()
        if menu is not None:
            pass

    def _update_metrics_from_visible_range(self):
        total = len(self._chart_event_indexes)
        if total <= 0:
            self._set_flow_metrics(0, 0)
            self._set_balance_metrics(0, None)
            return

        start = max(0, min(total, int(self._view_start)))
        end = max(start, min(total, int(self._view_end)))
        if end <= start:
            start, end = 0, total

        visible_events: list[TransactionEvent] = []
        for idx in self._chart_event_indexes[start:end]:
            if 0 <= idx < len(self._events):
                visible_events.append(self._events[idx])
        gains = sum(evt.amount for evt in visible_events if evt.kind == "gain")
        losses = sum(evt.amount for evt in visible_events if evt.kind == "loss")
        net = gains - losses

        current_val: int | None = None
        if self._rendered_series:
            current_val = int(self._rendered_series[-1][1])

        self._set_flow_metrics(gains, losses)
        self._set_balance_metrics(net, current_val)

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

    def _load_label_suggestions_db(self) -> dict[str, dict[str, int]]:
        if not _TX_LABELS_DB.exists():
            return {}
        try:
            payload = json.loads(_TX_LABELS_DB.read_text(encoding="utf-8"))
        except (OSError, ValueError, TypeError):
            return {}

        if not isinstance(payload, dict):
            return {}
        kinds_raw = payload.get("kinds")
        if not isinstance(kinds_raw, dict):
            return {}

        out: dict[str, dict[str, int]] = {}
        for kind, labels in kinds_raw.items():
            if not isinstance(kind, str) or not isinstance(labels, dict):
                continue
            clean_labels: dict[str, int] = {}
            for label, count in labels.items():
                text = str(label or "").strip()
                if not text:
                    continue
                try:
                    n = int(count)
                except (ValueError, TypeError):
                    n = 1
                clean_labels[text] = max(1, n)
            if clean_labels:
                out[kind] = clean_labels
        return out

    def _save_label_suggestions_db(self):
        payload = {"kinds": self._label_suggestions_db}
        try:
            _TX_LABELS_DB.parent.mkdir(parents=True, exist_ok=True)
            _TX_LABELS_DB.write_text(json.dumps(payload, ensure_ascii=False, indent=2), encoding="utf-8")
        except OSError:
            return

    def _register_label_suggestion(self, kind: str, label: str):
        text = str(label or "").strip()
        if not text:
            return
        k = str(kind or "").strip().lower() or "other"
        bucket = self._label_suggestions_db.setdefault(k, {})
        bucket[text] = int(bucket.get(text, 0)) + 1
        self._save_label_suggestions_db()

    def _label_suggestions_for_kind(self, kind: str) -> list[str]:
        builtins_by_kind: dict[str, list[str]] = {
            "gain": ["Gain de kamas", "Vente HDV", "Récompense", "Remboursement"],
            "loss": ["Perte de kamas", "Achat HDV", "Taxe", "Frais"],
            "correction": ["Correction manuelle", "Recalage manuel"],
        }

        ordered: list[str] = []
        seen: set[str] = set()
        k = str(kind or "").strip().lower()
        bucket = self._label_suggestions_db.get(k, {})
        if isinstance(bucket, dict):
            for label, _count in sorted(bucket.items(), key=lambda item: int(item[1]), reverse=True):
                text = str(label or "").strip()
                if text and text not in seen:
                    seen.add(text)
                    ordered.append(text)

        for labels in builtins_by_kind.values():
            for text in labels:
                t = str(text).strip()
                if t and t not in seen:
                    seen.add(t)
                    ordered.append(t)
        return ordered

    @staticmethod
    def _event_label_storage_key(evt: TransactionEvent) -> str:
        stamp = evt.dt.strftime("%Y-%m-%d %H:%M:%S.%f")
        corr = str(evt.correction_ts or "")
        return f"transactions_custom_label::{stamp}|{evt.kind}|{int(evt.amount)}|{corr}"

    def _effective_libelle(self, evt: TransactionEvent) -> str:
        custom = self._settings.value(self._event_label_storage_key(evt), "", type=str)
        custom = str(custom or "").strip()
        return custom if custom else evt.libelle

    def _set_custom_libelle(self, evt: TransactionEvent, libelle: str | None):
        key = self._event_label_storage_key(evt)
        text = str(libelle or "").strip()
        if text:
            self._settings.setValue(key, text)
            self._register_label_suggestion(evt.kind, text)
        else:
            self._settings.remove(key)

    def _edit_event_libelle(self, evt: TransactionEvent):
        current = self._effective_libelle(evt)
        suggestions = self._label_suggestions_for_kind(evt.kind)
        if current and current not in suggestions:
            suggestions.insert(0, current)

        text, ok = QInputDialog.getItem(
            self,
            "Modifier le libelle",
            "Libelle (saisie libre ou suggestion) :",
            suggestions,
            0,
            True,
        )
        if not ok:
            return
        self._set_custom_libelle(evt, text)
        self._render()

    def _on_table_context_menu(self, pos):
        item = self._table.itemAt(pos)
        if item is None:
            return
        row = int(item.row())
        if row < 0 or row >= len(self._display_events):
            return

        evt = self._display_events[row]

        menu = QMenu(self)
        edit_action = menu.addAction("Editer le libelle")
        delete_action = None
        if evt.kind == "correction":
            delete_action = menu.addAction("Supprimer cette correction")
        chosen = menu.exec_(self._table.viewport().mapToGlobal(pos))
        if chosen == edit_action:
            self._edit_event_libelle(evt)
            return
        if delete_action is None or chosen != delete_action:
            return

        date_txt, time_txt = _format_dt_parts(evt.dt)
        confirm = QMessageBox.question(
            self,
            "Suppression correction",
            f"Supprimer la correction du {date_txt} {time_txt} ({_fmt_kamas_with_symbol(evt.amount)}) ?",
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
                key=lambda evt: (self._effective_libelle(evt).lower(), evt.dt),
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

    def _ensure_column_layout_settings_schema(self):
        version_key = "transactions_column_layout_schema_version"
        current = self._settings.value(version_key, 0, type=int)
        if int(current) >= self._COLUMN_LAYOUT_SETTINGS_VERSION:
            return

        # Migration one-shot: purge les anciennes structures de persistance
        # pour repartir sur une base saine apres les changements de logique.
        for section in range(5):
            self._settings.remove(self._column_key(section))
            self._settings.remove(f"transactions_default_col_width_{section}")
        self._settings.remove(self._column_order_key())
        self._settings.remove("transactions_default_col_order_state")
        self._settings.setValue(version_key, self._COLUMN_LAYOUT_SETTINGS_VERSION)
        self._column_layout_schema_migrated = True

    def _apply_default_column_widths(self):
        self._table.setColumnWidth(0, 176)  # Date
        self._table.setColumnWidth(1, 165)  # Heure
        self._table.setColumnWidth(2, 91)   # Type
        self._table.setColumnWidth(3, 120)  # Libelle
        self._table.setColumnWidth(4, 185)  # Montant

    def _apply_default_column_order(self):
        # Configuration par défaut de l'application.
        # Visuel: Type, Libelle, Montant, Heure, Date.
        header = self._table.horizontalHeader()
        desired_visual_order = [2, 3, 4, 1, 0]
        for target_visual, logical_idx in enumerate(desired_visual_order):
            current_visual = int(header.visualIndex(logical_idx))
            if current_visual != target_visual:
                header.moveSection(current_visual, target_visual)

    @staticmethod
    def _column_semantic_min_width(section: int) -> int:
        # Minima ergonomiques pour eviter la troncature des infos critiques.
        if section == 0:  # Date
            return 104
        if section == 1:  # Heure
            return 86
        if section == 2:  # Type
            return 70
        if section == 3:  # Libelle
            return 120
        if section == 4:  # Montant
            return 116
        return 60

    @staticmethod
    def _column_hard_floor_width(section: int) -> int:
        # Fallback ultime si la fenetre devient tres etroite.
        if section == 0:  # Date
            return 78
        if section == 1:  # Heure
            return 68
        if section == 2:  # Type
            return 56
        if section == 3:  # Libelle
            return 72
        if section == 4:  # Montant
            return 88
        return 40

    def _restore_column_widths(self):
        for section in range(self._table.columnCount()):
            width = self._settings.value(self._column_key(section), 0, type=int)
            if width and width >= 60:
                self._table.setColumnWidth(section, int(width))

    def _on_column_resized(self, section: int, old_size: int, _new_size: int):
        if not self._layout_ready:
            return
        if self._resizing_guard:
            return

        delta = int(self._table.columnWidth(section)) - int(old_size)
        if delta != 0:
            self._redistribute_resize_delta(section, delta)

        self._enforce_columns_fit(preferred_section=section)
        self._persist_column_widths()

    def _redistribute_resize_delta(self, section: int, delta: int):
        header = self._table.horizontalHeader()
        count = self._table.columnCount()
        if count <= 1 or delta == 0:
            return

        visual = int(header.visualIndex(section))
        if visual < 0:
            return

        self._resizing_guard = True
        try:
            if delta > 0:
                # Priorite aux colonnes a droite du separateur, puis a gauche
                # si necessaire, pour conserver une sensation de drag naturelle.
                donors_visual = list(range(visual + 1, count)) + list(range(visual - 1, -1, -1))
                remaining = int(delta)
                for donor_visual in donors_visual:
                    if remaining <= 0:
                        break
                    donor = int(header.logicalIndex(donor_visual))
                    if donor == section:
                        continue
                    current = int(self._table.columnWidth(donor))
                    floor = self._column_semantic_min_width(donor)
                    reducible = max(0, current - floor)
                    if reducible <= 0:
                        continue
                    take = min(reducible, remaining)
                    self._table.setColumnWidth(donor, current - take)
                    remaining -= take

                if remaining > 0:
                    # Si aucun espace ne peut etre repris ailleurs,
                    # on limite la croissance de la colonne active.
                    current = int(self._table.columnWidth(section))
                    floor = self._column_semantic_min_width(section)
                    self._table.setColumnWidth(section, max(floor, current - remaining))

            else:
                freed = abs(int(delta))
                recipient_visual = visual + 1 if (visual + 1) < count else visual - 1
                if recipient_visual >= 0:
                    recipient = int(header.logicalIndex(recipient_visual))
                    if recipient != section:
                        self._table.setColumnWidth(recipient, int(self._table.columnWidth(recipient)) + freed)
        finally:
            self._resizing_guard = False

    def _persist_column_widths(self):
        for section in range(self._table.columnCount()):
            self._settings.setValue(self._column_key(section), int(self._table.columnWidth(section)))

    def _column_order_key(self) -> str:
        return "transactions_col_order_state"

    def _on_columns_reordered(self, _logical_index: int, _old_visual_index: int, _new_visual_index: int):
        if not self._layout_ready:
            return
        self._enforce_columns_fit()
        header = self._table.horizontalHeader()
        state = header.saveState()
        self._settings.setValue(self._column_order_key(), state)
        self._persist_column_widths()

    def _restore_column_order(self):
        state = self._settings.value(self._column_order_key())
        if state is None:
            return
        header = self._table.horizontalHeader()
        header.restoreState(state)
        self._enforce_columns_fit()

    def _on_toggle_organization_mode(self, enabled: bool):
        self._organization_mode = bool(enabled)
        self._settings.setValue("transactions_column_edit_mode", self._organization_mode)
        self._apply_organization_mode_visuals()

    def _apply_organization_mode_visuals(self):
        header = self._table.horizontalHeader()
        header.setSectionsMovable(self._organization_mode)
        header.setSectionResizeMode(QHeaderView.Interactive if self._organization_mode else QHeaderView.Fixed)
        tip = "Édition des colonnes active — cliquer pour terminer" if self._organization_mode \
              else "Édition des colonnes — réorganiser et redimensionner"
        self._organization_btn.setToolTip(tip)
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

        fit_width = max(0, viewport_width - 2)
        if fit_width <= 0:
            return

        logical_sections = list(range(count))
        semantic_mins = [self._column_semantic_min_width(i) for i in logical_sections]
        hard_floors = [self._column_hard_floor_width(i) for i in logical_sections]

        self._table.setUpdatesEnabled(False)
        try:
            # Assainit d'abord toute largeur invalide/persistante trop faible.
            self._resizing_guard = True
            try:
                for idx in logical_sections:
                    current = int(self._table.columnWidth(idx))
                    floor = hard_floors[idx]
                    if current < floor:
                        self._table.setColumnWidth(idx, floor)
            finally:
                self._resizing_guard = False

            widths = [int(self._table.columnWidth(i)) for i in logical_sections]
            total_w = sum(widths)
            overflow = total_w - fit_width

            if overflow < 0:
                deficit = -overflow
                # Etire pour occuper toute la largeur, priorite au Libelle puis Date/Heure.
                grow_order = [3, 0, 1, 4, 2]
                order = [idx for idx in grow_order if 0 <= idx < count]
                if not order:
                    order = list(range(count))

                self._resizing_guard = True
                try:
                    per_col = deficit // len(order)
                    rem = deficit % len(order)
                    for i, idx in enumerate(order):
                        bonus = per_col + (1 if i < rem else 0)
                        self._table.setColumnWidth(idx, int(self._table.columnWidth(idx)) + bonus)
                finally:
                    self._resizing_guard = False

            elif overflow > 0:
                # Ramene d'abord toute colonne au-dessus de son minimum ergonomique.
                shrink_order: list[int] = [3, 2, 4, 1, 0]
                if preferred_section is not None and preferred_section in shrink_order:
                    shrink_order = [i for i in shrink_order if i != preferred_section] + [preferred_section]

                self._resizing_guard = True
                try:
                    for idx in shrink_order:
                        target = max(semantic_mins[idx], hard_floors[idx])
                        if widths[idx] < target:
                            widths[idx] = target
                            self._table.setColumnWidth(idx, target)
                    widths = [int(self._table.columnWidth(i)) for i in range(count)]
                    overflow = sum(widths) - fit_width
                    if overflow <= 0:
                        overflow = 0

                    # Reduction ergonomique: Libelle d'abord, puis Type, puis le reste.
                    for idx in shrink_order:
                        if overflow <= 0:
                            break
                        current = int(self._table.columnWidth(idx))
                        floor = semantic_mins[idx]
                        reducible = max(0, current - floor)
                        if reducible <= 0:
                            continue
                        delta = min(reducible, overflow)
                        new_w = current - delta
                        self._table.setColumnWidth(idx, new_w)
                        overflow -= delta

                    # Dernier recours seulement: descendre sous min ergonomique vers hard floor.
                    if overflow > 0:
                        for idx in shrink_order:
                            if overflow <= 0:
                                break
                            current = int(self._table.columnWidth(idx))
                            floor = hard_floors[idx]
                            reducible = max(0, current - floor)
                            if reducible <= 0:
                                continue
                            delta = min(reducible, overflow)
                            new_w = current - delta
                            self._table.setColumnWidth(idx, new_w)
                            overflow -= delta
                finally:
                    self._resizing_guard = False

            self._force_exact_table_fit(fit_width, hard_floors)
        finally:
            self._table.setUpdatesEnabled(True)

    def _force_exact_table_fit(self, fit_width: int, hard_floors: list[int]):
        count = self._table.columnCount()
        if count <= 0 or fit_width <= 0:
            return

        header = self._table.horizontalHeader()
        total_w = sum(int(self._table.columnWidth(i)) for i in range(count))
        overflow = total_w - fit_width

        if overflow == 0:
            return

        self._resizing_guard = True
        try:
            if overflow > 0:
                # Correction stricte anti-debordement en priorisant la droite.
                for visual in range(count - 1, -1, -1):
                    if overflow <= 0:
                        break
                    idx = int(header.logicalIndex(visual))
                    current = int(self._table.columnWidth(idx))
                    floor = hard_floors[idx] if 0 <= idx < len(hard_floors) else 40
                    reducible = max(0, current - floor)
                    if reducible <= 0:
                        continue
                    delta = min(reducible, overflow)
                    self._table.setColumnWidth(idx, current - delta)
                    overflow -= delta
            else:
                deficit = -overflow
                last_visual = count - 1
                idx = int(header.logicalIndex(last_visual)) if last_visual >= 0 else -1
                if 0 <= idx < count:
                    self._table.setColumnWidth(idx, int(self._table.columnWidth(idx)) + deficit)
        finally:
            self._resizing_guard = False

    def eventFilter(self, obj, event):
        if obj is self._table.viewport() and event.type() == QEvent.Resize:
            if not self._fit_throttle.isActive():
                self._fit_throttle.start()
        return super().eventFilter(obj, event)

    def _on_fit_throttle(self):
        self._enforce_columns_fit()
        if self._layout_ready:
            self._persist_debounce.start()

    def _update_header_labels(self):
        labels = ["Date", "Heure", "Type", "Libelle", f"Montant ({_KAMA_SYMBOL})"]
        arrow = "▼" if self._sort_desc else "▲"
        if 0 <= self._sort_column < len(labels):
            labels[self._sort_column] = f"{labels[self._sort_column]} {arrow}"
        self._table.setHorizontalHeaderLabels(labels)

    def _focus_event_in_history(self, event_index: int):
        if event_index < 0 or event_index >= len(self._chart_event_indexes):
            return

        source_idx = self._chart_event_indexes[event_index]
        if source_idx < 0 or source_idx >= len(self._events):
            return
        target = self._events[source_idx]
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
            current_display = max(0, int(points[-1]))
        else:
            if current_kamas is None:
                current_display = None
            else:
                current_display = max(0, int(current_kamas))
        self._set_balance_metrics(0, current_display)

        full_series: list[tuple[datetime, int]] = []
        self._chart_event_indexes = []
        for idx, evt in enumerate(self._events):
            if idx < len(points):
                full_series.append((evt.dt, points[idx]))
                self._chart_event_indexes.append(idx)

        self._available_time_window_keys = self._compute_available_window_keys(full_series, self._TIME_WINDOWS)
        if self._time_window_key != "all" and self._time_window_key not in set(self._available_time_window_keys):
            self._custom_window_minutes = None
            self._time_window_key = "all"
            self._settings.setValue("transactions_time_window_key", self._time_window_key)
            self._set_range_label(self._selected_window_label())
            self._reset_chart_view_on_next_render = True

        # Fenetre temporelle choisie via clic droit sur le graphe.
        selected_delta = self._selected_window_delta()
        if selected_delta is not None and full_series:
            # Vrai mode temps reel: fenetre relative a maintenant.
            now_dt = datetime.now()
            cutoff = now_dt - selected_delta
            filtered_series: list[tuple[datetime, int]] = []
            filtered_indexes: list[int] = []
            last_before_cutoff: tuple[datetime, int] | None = None
            for idx, point in enumerate(full_series):
                if point[0] < cutoff:
                    last_before_cutoff = point
                if point[0] >= cutoff:
                    filtered_series.append(point)
                    filtered_indexes.append(self._chart_event_indexes[idx])

            # Ancrage gauche: demarre la fenetre a "cutoff" avec la
            # derniere valeur connue avant la fenetre (ou le 1er point dedans).
            if last_before_cutoff is not None:
                cutoff_value = int(last_before_cutoff[1])
                filtered_series.insert(0, (cutoff, cutoff_value))
                filtered_indexes.insert(0, -1)
            elif filtered_series and filtered_series[0][0] > cutoff:
                filtered_series.insert(0, (cutoff, int(filtered_series[0][1])))
                filtered_indexes.insert(0, -1)

            # Ancrage droit: la fenetre se termine toujours a "maintenant".
            if filtered_series:
                last_dt, last_value = filtered_series[-1]
                if last_dt < now_dt:
                    filtered_series.append((now_dt, int(last_value)))
                    filtered_indexes.append(-1)

            full_series = filtered_series
            self._chart_event_indexes = filtered_indexes

        series = full_series
        self._rendered_series = list(series)
        self._chart.set_series(series, reset_view=self._reset_chart_view_on_next_render)
        self._reset_chart_view_on_next_render = False
        self._refresh_range_label_from_view()
        self._update_metrics_from_visible_range()

        display_events = self._sorted_events_for_table()
        self._display_events = display_events
        self._table.setRowCount(len(display_events))
        for row, evt in enumerate(display_events):
            date_txt, time_txt = _format_dt_parts(evt.dt)
            date_item = QTableWidgetItem(date_txt)
            time_item = QTableWidgetItem(time_txt)
            if evt.kind == "correction":
                tx_type = "Correction"
                amount_text = self._disp(evt.amount)
                color = QColor(TEAL)
            elif evt.kind == "hdv_sale":
                tx_type = "Vente HDV"
                amount_text = self._disp(evt.amount)
                color = QColor(TEXT_DIM)
            elif evt.kind == "gain":
                tx_type = "Gain"
                amount_text = f"+ {self._disp(evt.amount)}"
                color = QColor(GREEN)
            else:
                tx_type = "Perte"
                amount_text = f"- {self._disp(evt.amount)}"
                color = QColor(RED)

            type_item = QTableWidgetItem(tx_type)
            libelle_item = QTableWidgetItem(self._effective_libelle(evt))
            amount_item = QTableWidgetItem(amount_text)
            if self._short_kamas:
                amount_item.setToolTip(_fmt_kamas_with_symbol(evt.amount))
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
