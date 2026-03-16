# ui/window.py — Fenêtre overlay principale

import json
import os
import re
from pathlib import Path

from PyQt5.QtWidgets import QWidget, QVBoxLayout, QStackedWidget, QApplication, QPushButton, QFrame, QLabel, QGridLayout, QMenu
from PyQt5.QtCore    import Qt, QPoint, QRect, QTimer, QDateTime, QSettings, QRectF, QEvent
from PyQt5.QtGui     import QPainter, QColor, QPen, QPainterPath, QRegion
import win32gui
import win32con

from ui.theme    import BG, BORDER, TEAL, TEAL_BRIGHT, QSS, build_qss, get_palette, DEFAULT_PALETTE
from ui.titlebar import TitleBar
from ui.onboarding import OnboardingPage
from core.kamas_history import (
    replay_kamas_delta, now_iso, now_ms_iso, write_kamas_correction,
    get_last_correction_ts, get_permanent_log_start_ts, get_active_permanent_log_size,
)
from core.permanent_journal import sync_permanent_kamas_journal
from ui.tabbar   import TabBar, TABS
from ui.tabs.base import PlaceholderTab
from ui.tabs.options import OptionsTab
from ui.tabs.transactions import TransactionsTab
from ui.tabs.personnage import PersonnageTab
from core.wakfu_tracker import WakfuTracker

DEFAULT_W = 895
DEFAULT_H = 590
MIN_W     = 220
MIN_H     = 120
EDGE      = 16         # zone de resize (bords)
CORNER    = 20         # zone de resize (angles, plus large pour faciliter le grab)
ATTACH_GAP = 6         # espace entre Wakfu et l'overlay
_PROJECT_ROOT = Path(__file__).resolve().parents[1]
_CONFIG_PATH = _PROJECT_ROOT / "data" / "config.json"
_WAKFU_LOG_PATH = Path(os.environ.get("APPDATA", "")) / "zaap" / "gamesLogs" / "wakfu" / "logs" / "wakfu.log"
_INTERFACE_FEED_PATHS = (
    _PROJECT_ROOT / "logs" / "realtime" / "interface_state_runtime_v7.json",
    _PROJECT_ROOT / "logs" / "realtime" / "interface_state_runtime_v4.json",
    _PROJECT_ROOT / "logs" / "realtime" / "interface_state_runtime_v2.json",
    _PROJECT_ROOT / "logs" / "realtime" / "interface_state.json",
)
_JOURNAL_LOG_PATHS = (
    _PROJECT_ROOT / "logs" / "wakfu_journal.log",
    _PROJECT_ROOT / "logs" / "realtime" / "wakfu_journal.log",
    Path(os.environ.get("APPDATA", "")) / "zaap" / "gamesLogs" / "wakfu" / "logs" / "wakfu_journal.log",
    Path(os.environ.get("APPDATA", "")) / "zaap" / "gamesLogs" / "wakfu" / "logs" / "wakfu.log",
)
_CLASS_SYNC_MS = 2500
_LOG_BOOTSTRAP_CHUNK = 650_000
_BREED_TO_CLASS = {
    1: "feca",
    2: "osamodas",
    3: "enutrof",
    4: "sram",
    5: "xelor",
    6: "ecaflip",
    7: "eniripsa",
    8: "iop",
    9: "cra",
    10: "sadida",
    11: "sacrier",
    12: "pandawa",
    13: "rogue",
    14: "masqueraider",
    15: "ouginak",
    16: "foggernaut",
    18: "elio",
    19: "huppermage",
}
_BREED_LINE_RE = re.compile(r"\bbreed\s*:\s*(\d+).*isControlledByAI=false", re.IGNORECASE)
_PLAYER_BREED_LINE_RE = re.compile(r"- \[_FL_\].*?fightId=\d+\s+(.+?)\s+breed\s*:\s*(\d+)\s+\[[^\]]+\]\s+isControlledByAI=false", re.IGNORECASE)
_SPELL_CAST_RE = re.compile(r"\[Information \(combat\)\]\s+(.+?)\s+lance le sort\s+(.+)$", re.IGNORECASE)
_COMBAT_XP_RE = re.compile(
    r"\[Information \(combat\)\]\s+(.+?)\s*:\s*\+([0-9\s\u00a0\u202f.,]+)\s*points d'XP\.\s*Prochain niveau dans\s*:\s*([0-9\s\u00a0\u202f.,]+)",
    re.IGNORECASE,
)
_CRIT_RE = re.compile(
    r"\[Information \(combat\)\]\s+(.+?)\s*:\s*([0-9]+)\s*%\s*Coup critique",
    re.IGNORECASE,
)
_LEVEL_RE = re.compile(
    r"\[Information \(combat\)\]\s+(.+?)\s*:\s*.*\(Niv\.\s*([0-9]+)\)",
    re.IGNORECASE,
)
_KAMAS_GAIN_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez gagné\s+([0-9\s\u00a0\u202f.,]+)\s+kamas?\b",
    re.IGNORECASE,
)
_KAMAS_LOSS_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez perdu\s+([0-9\s\u00a0\u202f.,]+)\s+kamas?\b",
    re.IGNORECASE,
)
_KAMA_CANDIDATE_VALUE_RE = re.compile(r"^([^=]+)=(-?\d+)\s+\(score=(-?\d+)\)")
_KAMA_CANDIDATE_BLOCKLIST = (
    "ratio",
    "bonus",
    "color",
    "webshop",
    "shop",
    "purchase",
    "level",
    "min",
    "max",
    "reward",
    "tax",
    "class ",
)
_CONNECTED_MARKERS = (
    "on remet la frame world",
    "personal_space_enter_result_message (success=true)",
    "onnewconnection channelhandlercontext",
    "connexion au proxy :wakfu-ogrest",
)
_DISCONNECTED_MARKERS = (
    "sending disconnectionmessage to servers",
    "[chat] connection closed",
    "connexion avec le serveur perdue",
)
_SPELL_CLASS_SIGNATURES = {
    "sram": (
        "kleptosram",
        "fourberie",
        "attaque perfide",
        "assassinat",
        "mise a mort",
        "mise à mort",
        "saignee mortelle",
        "saignée mortelle",
        "premier sang",
        "arnaque",
        "invisibilite",
        "invisibilité",
    ),
    "elio": (
        "portail",
        "pulsation",
        "cataclysme",
        "exaltation",
        "affliction",
        "barriere",
        "barrière",
    ),
    "xelor": (
        "aiguille",
        "sablier",
        "ralentissement",
        "desynchronisation",
        "désynchronisation",
        "contre la montre",
    ),
    "cra": (
        "fleche perçante",
        "flèche perçante",
        "fleche explosive",
        "flèche explosive",
        "fleche tempete",
        "flèche tempête",
    ),
}


def _normalize_character_name(value: str) -> str:
    name = str(value or "").strip()
    name = re.sub(r"^fightId=\d+\s+", "", name, flags=re.IGNORECASE)
    return name.strip()

# Bitmask directions resize
_L = 1; _R = 2; _T = 4; _B = 8

_CURSORS = {
    _L:      Qt.SizeHorCursor,
    _R:      Qt.SizeHorCursor,
    _T:      Qt.SizeVerCursor,
    _B:      Qt.SizeVerCursor,
    _T|_L:   Qt.SizeFDiagCursor,
    _B|_R:   Qt.SizeFDiagCursor,
    _T|_R:   Qt.SizeBDiagCursor,
    _B|_L:   Qt.SizeBDiagCursor,
}


def _edge_at(pos: QPoint, w: int, h: int) -> int:
    x, y = pos.x(), pos.y()
    # Zone d'angle plus large que le bord simple.
    in_l = x < CORNER if (y < CORNER or y > h - CORNER) else x < EDGE
    in_r = x > w - CORNER if (y < CORNER or y > h - CORNER) else x > w - EDGE
    in_t = y < CORNER if (x < CORNER or x > w - CORNER) else y < EDGE
    in_b = y > h - CORNER if (x < CORNER or x > w - CORNER) else y > h - EDGE
    flags = 0
    if in_l: flags |= _L
    if in_r: flags |= _R
    if in_t: flags |= _T
    if in_b: flags |= _B
    return flags


class OverlayWindow(QWidget):
    """
    Fenêtre overlay :
      - frameless, fond semi-transparent, always-on-top
      - draggable depuis la titlebar
      - redimensionnable depuis tous les bords et coins
      - repliable sur la titlebar (bouton ▾)
      - pin : verrouille la position (bouton 📌)
    """

    def __init__(self):
        super().__init__()
        self._settings = QSettings("WakfuAssistant", "Overlay")
        self._drag_pos:        QPoint | None = None
        self._resize_dir:      int           = 0
        self._resize_start_g:  QRect         = QRect()
        self._resize_start_p:  QPoint        = QPoint()
        self._cursor_overridden: bool        = False
        self._folded:          bool          = False
        self._saved_h:         int           = DEFAULT_H
        self._wakfu_rect:      tuple[int, int, int, int] | None = None
        self._relative_offset_ratio: tuple[float, float] | None = None
        self._relative_size_ratio: tuple[float, float] | None = None
        self._in_programmatic_move: bool = False
        self._corner_radius = self._settings.value("window_corner_radius", 24, type=int)
        self._palette_name = self._settings.value("ui_palette", DEFAULT_PALETTE, type=str)
        self._short_kamas: bool = bool(self._settings.value("short_kamas", False, type=bool))
        self._fold_anchor_bottom: bool = bool(self._settings.value("fold_anchor_bottom", False, type=bool))
        saved_ct = self._settings.value("ct_opacity", 0.60, type=float)
        self._ct_opacity: float = max(0.05, min(0.85, float(saved_ct)))
        self._palette = get_palette(self._palette_name)
        self._click_through = self._settings.value("click_through", False, type=bool)
        self._click_unlock_btn: QPushButton | None = None
        self._elapsed_seconds: int = 0
        self._session_connected: bool | None = None
        self._log_read_pos: int = 0
        self._journal_read_pos: int = 0
        self._journal_log_path: Path | None = None
        self._last_detected_class: str | None = None
        self._current_character_name: str | None = None
        self._last_level: int | None = None
        self._last_xp_gain: int | None = None
        self._last_xp_to_next: int | None = None
        self._last_crit_percent: int | None = None
        self._last_ap: int | None = None
        self._last_mp: int | None = None
        self._last_wp: int | None = None
        self._last_hp_percent: int | None = None
        self._inventory_open: bool | None = None
        self._character_sheet_open: bool | None = None
        self._current_kamas: int | None = None
        self._base_kamas: int = 0
        self._manual_kamas_delta: int = 0
        self._runtime_kamas_delta: int = 0
        self._interface_feed_mtime: int = 0
        self._interface_feed_path: Path | None = None
        self._options_tab: "OptionsTab | None" = None
        self._personnage_tab: "PersonnageTab | None" = None
        self._stats_labels: dict[str, QLabel] = {}
        self._runtime_kama_candidates_prev: dict[str, int] = {}
        self._runtime_kama_candidate_scores: dict[str, int] = {}
        self._runtime_kama_locked_key: str | None = None
        self._runtime_kama_lock_hits: int = 0
        self._runtime_kama_reliable: bool = False
        self._runtime_kama_last_delta_applied: int = 0
        self._runtime_kama_truth_hint: int | None = self._parse_int_token(os.environ.get("WAKFU_KAMA_TRUTH_HINT"))
        self._onboarding_done: bool = True
        self._onboarding_page: "OnboardingPage | None" = None

        self._load_kamas_config_values()
        self._load_relative_layout_preferences()

        self._setup_window()
        self._setup_click_unlock_button()
        self._build_ui()
        self._connect()
        self._setup_wakfu_tracking()
        self._position()
        self._start_timer()
        self._check_onboarding()
        QApplication.instance().installEventFilter(self)

    # ── Initialisation ────────────────────────────────────────────

    def _setup_window(self):
        self.setWindowFlags(
            Qt.FramelessWindowHint |
            Qt.WindowStaysOnTopHint |
            Qt.Tool
        )
        self.setAttribute(Qt.WA_TranslucentBackground)
        self.setMouseTracking(True)
        self.setMinimumSize(MIN_W, MIN_H)
        saved_opacity = self._settings.value("overlay_opacity", 0.96, type=float)
        self._opacity = max(0.35, min(1.0, float(saved_opacity)))
        self.setWindowOpacity(self._opacity)
        self._font_family = self._settings.value("ui_font_family", "Noto Sans", type=str)
        self._apply_app_font_style()
        default_w = self._settings.value("default_window_width", DEFAULT_W, type=int)
        default_h = self._settings.value("default_window_height", DEFAULT_H, type=int)
        saved_w = self._settings.value("window_width", default_w, type=int)
        saved_h = self._settings.value("window_height", default_h, type=int)
        saved_w = max(MIN_W, int(saved_w))
        saved_h = max(MIN_H, int(saved_h))
        self._saved_h = saved_h
        self.resize(saved_w, saved_h)
        self._apply_rounded_mask()

    def _load_relative_layout_preferences(self):
        offset_set = self._settings.value("relative_offset_set", False, type=bool)
        if not offset_set:
            offset_set = self._settings.value("default_relative_offset_set", False, type=bool)
            offset_prefix = "default_relative_offset"
        else:
            offset_prefix = "relative_offset"

        if offset_set:
            ox = self._settings.value(f"{offset_prefix}_rx", 0.0, type=float)
            oy = self._settings.value(f"{offset_prefix}_ry", 0.0, type=float)
            self._relative_offset_ratio = (float(ox), float(oy))

        size_set = self._settings.value("relative_size_set", False, type=bool)
        if not size_set:
            size_set = self._settings.value("default_relative_size_set", False, type=bool)
            size_prefix = "default_relative_size"
        else:
            size_prefix = "relative_size"

        if size_set:
            rw = self._settings.value(f"{size_prefix}_rw", 0.0, type=float)
            rh = self._settings.value(f"{size_prefix}_rh", 0.0, type=float)
            self._relative_size_ratio = (float(rw), float(rh))

    def _build_ui(self):
        root = QVBoxLayout(self)
        root.setContentsMargins(1, 1, 1, 1)
        root.setSpacing(0)

        self._titlebar = TitleBar(self)
        self._titlebar.set_class_icon(self._read_character_class())
        self._titlebar.set_palette(self._palette)
        root.addWidget(self._titlebar)

        self._tabbar = TabBar(self)
        self._tabbar.set_palette(self._palette)
        root.addWidget(self._tabbar)

        self._stack = QStackedWidget(self)
        root.addWidget(self._stack)

        self._tab_widgets: list[QWidget] = []
        for name in TABS:
            if name == "Transactions":
                w = TransactionsTab(self)
                w.set_short_kamas(self._short_kamas)
            elif name == "Options":
                w = OptionsTab(
                    self._opacity,
                    self._ct_opacity,
                    self._font_family,
                    self._palette_name,
                    self._corner_radius,
                    self._short_kamas,
                    self._fold_anchor_bottom,
                    self,
                )
                w.opacity_changed.connect(self.set_overlay_opacity)
                w.font_changed.connect(self.set_overlay_font_family)
                w.palette_changed.connect(self.set_overlay_palette)
                w.shape_changed.connect(self.set_window_corner_radius)
                w.reset_requested.connect(self._on_reset_requested)
                w.kamas_corrected.connect(self._on_kamas_corrected)
                w.transactions_refresh_requested.connect(self._refresh_transactions_tab)
                w.short_numbers_changed.connect(self._on_short_kamas_changed)
                w.fold_anchor_changed.connect(self._on_fold_anchor_changed)
                w.ct_opacity_changed.connect(self._on_ct_opacity_changed)
                w.set_kamas(self._current_kamas)
                w.set_kamas_last_entry(get_last_correction_ts())
                w.set_log_start_date(get_permanent_log_start_ts())
                self._options_tab = w
            elif name == "Personnage":
                w = PersonnageTab(self)
                self._personnage_tab = w
            else:
                w = PlaceholderTab(name)
            self._stack.addWidget(w)
            self._tab_widgets.append(w)

        # ── Page onboarding (hors TABS, index = len(TABS)) ──────────────
        self._onboarding_page = OnboardingPage(self)
        self._onboarding_page.confirmed.connect(self._on_onboarding_confirmed)
        self._stack.addWidget(self._onboarding_page)

    def _build_stats_card(self) -> QFrame:
        card = QFrame(self)
        card.setObjectName("liveStatsCard")
        card.setStyleSheet(
            f"""
            QFrame#liveStatsCard {{
                background: {self._palette.get('BG_PANEL', BG)};
                border: 1px solid {self._palette.get('BORDER', BORDER)};
                border-radius: 8px;
                margin: 4px 6px 2px 6px;
                padding: 4px;
            }}
            QLabel#liveStatsHeader {{
                color: {self._palette.get('TEAL', TEAL)};
                font-size: 10px;
                font-weight: 700;
                letter-spacing: 0.7px;
            }}
            QLabel#liveStatsValue {{
                color: {self._palette.get('TEXT', '#d7e6f2')};
                font-size: 10px;
                font-weight: 600;
            }}
            """
        )

        layout = QGridLayout(card)
        layout.setContentsMargins(8, 6, 8, 6)
        layout.setHorizontalSpacing(10)
        layout.setVerticalSpacing(3)

        fields = [
            ("Kamas", "kamas"),
            ("Niveau", "level"),
            ("Crit", "crit"),
            ("XP +", "xp_gain"),
            ("XP Next", "xp_next"),
            ("AP/MP/WP", "apmpwp"),
            ("HP%", "hp"),
            ("Interfaces", "ui"),
        ]

        for row, (label_text, key) in enumerate(fields):
            label = QLabel(label_text, card)
            label.setObjectName("liveStatsHeader")
            value = QLabel("--", card)
            value.setObjectName("liveStatsValue")
            layout.addWidget(label, row, 0)
            layout.addWidget(value, row, 1)
            self._stats_labels[key] = value

        return card

    def _refresh_stats_panel(self):
        if not self._stats_labels:
            return

        self._stats_labels["kamas"].setText("--" if self._current_kamas is None else f"{self._current_kamas}\u00a7")
        self._stats_labels["level"].setText("--" if self._last_level is None else str(self._last_level))
        self._stats_labels["crit"].setText("--" if self._last_crit_percent is None else f"{self._last_crit_percent}%")
        self._stats_labels["xp_gain"].setText("--" if self._last_xp_gain is None else str(self._last_xp_gain))
        self._stats_labels["xp_next"].setText("--" if self._last_xp_to_next is None else str(self._last_xp_to_next))

        if self._last_ap is None and self._last_mp is None and self._last_wp is None:
            self._stats_labels["apmpwp"].setText("--")
        else:
            ap = "?" if self._last_ap is None else str(self._last_ap)
            mp = "?" if self._last_mp is None else str(self._last_mp)
            wp = "?" if self._last_wp is None else str(self._last_wp)
            self._stats_labels["apmpwp"].setText(f"{ap}/{mp}/{wp}")

        self._stats_labels["hp"].setText("--" if self._last_hp_percent is None else f"{self._last_hp_percent}%")

        if self._inventory_open is None and self._character_sheet_open is None:
            self._stats_labels["ui"].setText("--")
        else:
            inv = "INV:ON" if self._inventory_open else "INV:OFF"
            sheet = "SHEET:ON" if self._character_sheet_open else "SHEET:OFF"
            self._stats_labels["ui"].setText(f"{inv} | {sheet}")

    def _read_config_json(self) -> dict:
        try:
            raw = _CONFIG_PATH.read_text(encoding="utf-8")
            data = json.loads(raw)
            if isinstance(data, dict):
                return data
        except (OSError, ValueError, TypeError):
            pass
        return {}

    def _write_config_json(self, data: dict):
        try:
            _CONFIG_PATH.parent.mkdir(parents=True, exist_ok=True)
            _CONFIG_PATH.write_text(
                json.dumps(data, ensure_ascii=False, indent=2),
                encoding="utf-8",
            )
        except OSError:
            pass

    def _read_character_class(self) -> str:
        data = self._read_config_json()

        value = data.get("character_class")
        if not value:
            return "iop"
        return str(value)

    def _read_character_name(self) -> str | None:
        data = self._read_config_json()
        value = _normalize_character_name(str(data.get("character") or ""))
        return value or None

    def _write_character_name(self, character_name: str):
        character_name = _normalize_character_name(character_name)
        if not character_name:
            return

        data = self._read_config_json()
        if data.get("character") == character_name:
            return

        data["character"] = character_name
        self._write_config_json(data)

    def _read_known_character_classes(self) -> dict[str, str]:
        data = self._read_config_json()
        mappings = data.get("known_character_classes")
        if not isinstance(mappings, dict):
            return {}

        out: dict[str, str] = {}
        for key, value in mappings.items():
            name = _normalize_character_name(str(key or ""))
            class_key = str(value or "").strip().lower()
            if name and class_key:
                out[name] = class_key
        return out

    def _write_known_character_class(self, character_name: str, class_key: str):
        character_name = _normalize_character_name(character_name)
        class_key = str(class_key or "").strip().lower()
        if not character_name or not class_key:
            return

        data = self._read_config_json()
        mappings = data.get("known_character_classes")
        if not isinstance(mappings, dict):
            mappings = {}

        if mappings.get(character_name) == class_key:
            return

        mappings[character_name] = class_key
        data["known_character_classes"] = mappings
        self._write_config_json(data)

    def _write_character_class(self, class_key: str):
        class_key = str(class_key or "").strip().lower()
        if not class_key:
            return

        data = self._read_config_json()
        if data.get("character_class") == class_key:
            return

        data["character_class"] = class_key
        self._write_config_json(data)

    def _setup_click_unlock_button(self):
        from ui.titlebar import _tinted_icon, _ICON_DIR
        from PyQt5.QtCore import QSize as _QSize
        btn = QPushButton("", None)
        btn.setWindowFlags(Qt.Tool | Qt.FramelessWindowHint | Qt.WindowStaysOnTopHint)
        btn.setAttribute(Qt.WA_TranslucentBackground, True)
        btn.setFocusPolicy(Qt.NoFocus)
        btn.setFixedSize(28, 28)
        btn.setIconSize(_QSize(16, 16))
        btn.setIcon(_tinted_icon(str(_ICON_DIR / "clickthrough.svg"), TEAL_BRIGHT))
        btn.setToolTip("Désactiver le clic à travers")
        btn.setStyleSheet("""
            QPushButton {
                background: transparent; border: none; border-radius: 10px;
            }
            QPushButton:hover {
                background: rgba(30,180,176,0.14);
            }
        """)
        btn.clicked.connect(lambda: self.set_click_through(False))
        btn.hide()
        self._click_unlock_btn = btn

    def _connect(self):
        self._titlebar.fold_toggled.connect(self._on_fold)
        self._titlebar.pin_toggled.connect(self._on_pin)
        self._titlebar.click_through_toggled.connect(self._on_click_through)
        self._titlebar.close_requested.connect(self.close)
        self._tabbar.tab_changed.connect(self._on_tab_changed)
        self._restore_last_opened_tab()

    def _on_tab_changed(self, idx: int):
        if idx < 0 or idx >= len(TABS):
            return
        self._stack.setCurrentIndex(idx)
        self._settings.setValue("last_opened_tab", int(idx))

    def _restore_last_opened_tab(self):
        idx = self._settings.value("last_opened_tab", 0, type=int)
        if idx < 0 or idx >= len(TABS):
            idx = 0
        self._tabbar.set_current_index(idx, emit_signal=False)
        self._stack.setCurrentIndex(idx)

    def _setup_wakfu_tracking(self):
        self._tracker = WakfuTracker(self)
        self._tracker.found.connect(self._on_wakfu_found)
        self._tracker.lost.connect(self._on_wakfu_lost)
        self._tracker.geometry_changed.connect(self._on_wakfu_geometry)
        self._tracker.minimized.connect(self._on_wakfu_minimized)
        self._tracker.restored.connect(self._on_wakfu_restored)
        self._tracker.focus_changed.connect(self._on_wakfu_focus_changed)

    def _position(self):
        screen = QApplication.primaryScreen().availableGeometry()
        self.move(screen.right() - self.width() - 10, screen.top() + 40)

    def _start_timer(self):
        self._t0 = QDateTime.currentDateTime()
        self._refresh_title_info()

        t = QTimer(self)
        t.timeout.connect(self._tick)
        t.start(1000)

        zorder_t = QTimer(self)
        zorder_t.timeout.connect(self._reorder_above_wakfu)
        zorder_t.start(150)

        self._class_sync_timer = QTimer(self)
        self._class_sync_timer.timeout.connect(self._sync_class_from_wakfu_log)
        self._class_sync_timer.start(_CLASS_SYNC_MS)
        self._sync_class_from_wakfu_log()

    # ── API publique ──────────────────────────────────────────────

    def set_tab(self, index: int, widget: QWidget):
        """Remplace un placeholder par le vrai widget d'onglet."""
        old = self._stack.widget(index)
        self._stack.removeWidget(old)
        old.deleteLater()
        self._stack.insertWidget(index, widget)
        self._tab_widgets[index] = widget

    # ── Slots ─────────────────────────────────────────────────────

    def _on_fold(self, folded: bool):
        self._folded = folded
        if folded:
            self._saved_h = self.height()
            bottom_y = self.y() + self.height()
            self._tabbar.hide()
            self._stack.hide()
            new_h = self._titlebar.height() + 2
            self.setFixedHeight(new_h)
            if self._fold_anchor_bottom:
                self.move(self.x(), bottom_y - new_h)
        else:
            bottom_y = self.y() + self.height()
            self.setMinimumHeight(MIN_H)
            self.setMaximumHeight(16_777_215)
            self._tabbar.show()
            self._stack.show()
            self.resize(self.width(), self._saved_h)
            if self._fold_anchor_bottom:
                self.move(self.x(), bottom_y - self._saved_h)

    def _on_pin(self, pinned: bool):
        # Pin = position verrouillée (ne peut plus être draggée)
        if not pinned and self._wakfu_rect:
            self._apply_relative_to_wakfu(*self._wakfu_rect)

    def _on_click_through(self, enabled: bool):
        self.set_click_through(enabled)

    def _tick(self):
        self._elapsed_seconds = self._t0.secsTo(QDateTime.currentDateTime())
        sync_permanent_kamas_journal()
        self._sync_character_info_from_interface_feed()
        self._sync_character_info_from_journal()
        self._refresh_title_info()

    def _refresh_title_info(self):
        e = max(0, int(self._elapsed_seconds))
        if self._session_connected is True:
            status = "connecté"
        elif self._session_connected is False:
            status = "déconnecté"
        else:
            status = "connexion ?"

        # ── Timer + statut → OptionsTab (Données) ─────────────────────────
        if self._options_tab is not None:
            self._options_tab.set_session_time(e, status)
            self._options_tab.set_kamas(self._current_kamas)

        # ── Identité personnage → PersonnageTab ────────────────────────────
        if self._personnage_tab is not None:
            self._personnage_tab.set_character_name(self._current_character_name)
            self._personnage_tab.set_class_name(self._last_detected_class)
            self._personnage_tab.set_level(self._last_level)
            self._personnage_tab.set_connection_status(self._session_connected)
            if self._last_detected_class:
                self._personnage_tab.set_class_icon(self._last_detected_class)

        # ── Métriques épinglées → TitleBar (mode replié) ─────────────────
        for widget in self._tab_widgets:
            if isinstance(widget, TransactionsTab):
                self._titlebar.set_folded_metrics(widget.get_pinned_metrics())
                break

        self._refresh_stats_panel()

    def _refresh_transactions_tab(self):
        for widget in self._tab_widgets:
            if isinstance(widget, TransactionsTab):
                widget.refresh()
                break

    def contextMenuEvent(self, event):
        menu = QMenu(self)
        menu.setStyleSheet(
            f"QMenu {{ background: {self._palette.get('BG_PANEL', BG)}; border: 1px solid {self._palette.get('BORDER', BORDER)}; }}"
            "QMenu::item { padding: 6px 16px; }"
            "QMenu::item:selected { background: rgba(30,180,176,0.18); }"
        )

        refresh_action = menu.addAction("Actualiser maintenant")
        tx_refresh_action = menu.addAction("Rafraichir transactions")
        menu.addSeparator()
        tx_tab_action = menu.addAction("Aller a Transactions")
        options_tab_action = menu.addAction("Aller a Options")

        chosen = menu.exec_(event.globalPos())
        if chosen is None:
            event.accept()
            return

        if chosen == refresh_action:
            self._tick()
        elif chosen == tx_refresh_action:
            self._refresh_transactions_tab()
        elif chosen == tx_tab_action:
            try:
                idx = TABS.index("Transactions")
                self._tabbar.set_current_index(idx)
            except ValueError:
                pass
        elif chosen == options_tab_action:
            try:
                idx = TABS.index("Options")
                self._tabbar.set_current_index(idx)
            except ValueError:
                pass

        event.accept()

    @staticmethod
    def _parse_int_token(value: str | None) -> int | None:
        raw = str(value or "")
        cleaned = "".join(ch for ch in raw if ch.isdigit())
        if not cleaned:
            return None
        try:
            return int(cleaned)
        except ValueError:
            return None

    @staticmethod
    def _resolve_journal_log_path() -> Path | None:
        existing: list[tuple[int, Path]] = []
        for path in _JOURNAL_LOG_PATHS:
            if not path.exists():
                continue
            try:
                mtime = path.stat().st_mtime_ns
            except OSError:
                continue
            existing.append((mtime, path))

        if not existing:
            return None

        existing.sort(key=lambda item: item[0], reverse=True)
        return existing[0][1]

    def _read_journal_log_update(self) -> str | None:
        path = self._resolve_journal_log_path()
        if path is None:
            return None

        # Changement de source journal: on reapplique un curseur persistant
        # uniquement si le chemin est identique, sinon on repart en tail (EOF).
        if self._journal_log_path != path:
            self._journal_log_path = path
            data = self._read_config_json()
            stored_path = str(data.get("journal_log_path") or "").strip()
            stored_pos = int(data.get("journal_read_pos", 0) or 0)
            if stored_path == str(path) and stored_pos >= 0:
                self._journal_read_pos = stored_pos
            else:
                self._journal_read_pos = 0

        try:
            size = path.stat().st_size
            if size <= 0:
                return None

            with path.open("rb") as fh:
                if self._journal_read_pos <= 0:
                    # Ne jamais rejouer l'historique au demarrage: on lit
                    # seulement les nouvelles lignes futures.
                    self._journal_read_pos = size
                    self._persist_journal_cursor(path)
                    return None

                if size < self._journal_read_pos:
                    # Rotation/troncature: on saute l'historique present dans
                    # le nouveau fichier pour eviter un double comptage.
                    self._journal_read_pos = size
                    self._persist_journal_cursor(path)
                    return None

                if size == self._journal_read_pos:
                    return None

                fh.seek(self._journal_read_pos)
                data = fh.read()
                self._journal_read_pos = size
                self._persist_journal_cursor(path)
                return data.decode("utf-8", errors="ignore")
        except OSError:
            return None

    def _persist_journal_cursor(self, path: Path | None = None):
        if path is None:
            path = self._journal_log_path
        if path is None:
            return
        self._write_config_patch({
            "journal_log_path": str(path),
            "journal_read_pos": int(max(0, self._journal_read_pos)),
        })

    def _sync_character_info_from_journal(self):
        blob = self._read_journal_log_update()
        if not blob:
            return

        # Kamas ne nécessitent pas le nom du personnage ("Vous avez gagné/perdu" = toujours le joueur).
        # XP/crit/level en ont besoin pour filtrer les événements du bon personnage.
        character_name = self._current_character_name or self._read_character_name()
        target_name = _normalize_character_name(character_name).lower() if character_name else None
        changed = False

        for raw_line in blob.splitlines():
            # ── Kamas (indépendant du nom) ───────────────────────────────
            kamas_gain_match = _KAMAS_GAIN_RE.search(raw_line)
            if kamas_gain_match:
                gain = self._parse_int_token(kamas_gain_match.group(1))
                if gain is not None:
                    self._runtime_kamas_delta += gain
                    changed = True

            kamas_loss_match = _KAMAS_LOSS_RE.search(raw_line)
            if kamas_loss_match:
                loss = self._parse_int_token(kamas_loss_match.group(1))
                if loss is not None:
                    self._runtime_kamas_delta -= loss
                    changed = True

            # ── Événements filtrés par nom de personnage ─────────────────
            if target_name is None:
                continue

            xp_match = _COMBAT_XP_RE.search(raw_line)
            if xp_match:
                caster = _normalize_character_name(xp_match.group(1)).lower()
                if caster == target_name:
                    xp_gain = self._parse_int_token(xp_match.group(2))
                    xp_to_next = self._parse_int_token(xp_match.group(3))
                    if xp_gain is not None and xp_gain != self._last_xp_gain:
                        self._last_xp_gain = xp_gain
                        changed = True
                    if xp_to_next is not None and xp_to_next != self._last_xp_to_next:
                        self._last_xp_to_next = xp_to_next
                        changed = True

            crit_match = _CRIT_RE.search(raw_line)
            if crit_match:
                caster = _normalize_character_name(crit_match.group(1)).lower()
                if caster == target_name:
                    crit_value = self._parse_int_token(crit_match.group(2))
                    if crit_value is not None and crit_value != self._last_crit_percent:
                        self._last_crit_percent = crit_value
                        changed = True

            level_match = _LEVEL_RE.search(raw_line)
            if level_match:
                caster = _normalize_character_name(level_match.group(1)).lower()
                if caster == target_name:
                    level_value = self._parse_int_token(level_match.group(2))
                    if level_value is not None and level_value != self._last_level:
                        self._last_level = level_value
                        changed = True

        if not self._runtime_kama_reliable:
            computed_kamas = self._base_kamas + self._manual_kamas_delta + self._runtime_kamas_delta
            if computed_kamas >= 0 and computed_kamas != self._current_kamas:
                self._current_kamas = computed_kamas
                changed = True

        if changed:
            self._refresh_title_info()

    def _load_kamas_config_values(self):
        sync_permanent_kamas_journal()
        data = self._read_config_json()
        self._onboarding_done = bool(data.get("onboarding_done", False))

        self._base_kamas = int(data.get("base_kamas", 0) or 0)

        if self._onboarding_done:
            # Replay kamas gains/losses from permanent log since last session.
            # perm_log_offset allows seeking directly to the right position
            # instead of scanning the entire file from byte 0.
            last_end = data.get("last_session_end") or None
            perm_log_offset = int(data.get("perm_log_offset", 0) or 0)
            replay_delta = replay_kamas_delta(last_end, perm_log_offset)
            if replay_delta:
                self._runtime_kamas_delta += replay_delta

        self._manual_kamas_delta = int(data.get("manual_kamas_delta", 0) or 0)
        self._current_kamas = self._base_kamas + self._manual_kamas_delta + self._runtime_kamas_delta

    # ── Onboarding ────────────────────────────────────────────────────────

    def _check_onboarding(self):
        """Affiche la page d'onboarding si la configuration initiale n'est pas faite."""
        if not self._onboarding_done:
            self._show_onboarding()

    def _show_onboarding(self):
        """Bascule sur la page d'onboarding (cache les onglets)."""
        if self._onboarding_page is None:
            return
        self._onboarding_page.reset_input()
        self._tabbar.hide()
        self._stack.setCurrentWidget(self._onboarding_page)

    def _on_onboarding_confirmed(self, value: int):
        """Appelé quand l'utilisateur valide l'onboarding."""
        ts = now_iso()
        perm_log_offset = get_active_permanent_log_size()
        self._base_kamas = value
        self._manual_kamas_delta = 0
        self._runtime_kamas_delta = 0
        self._current_kamas = value
        self._journal_read_pos = 0
        self._journal_log_path = None
        self._write_config_patch({
            "base_kamas": value,
            "manual_kamas_delta": 0,
            "onboarding_done": True,
            "last_session_end": ts,
            "perm_log_offset": perm_log_offset,
            "journal_read_pos": 0,
            "journal_log_path": "",
        })
        self._onboarding_done = True
        if self._options_tab:
            self._options_tab.set_kamas(self._current_kamas)
            self._options_tab.set_log_start_date(get_permanent_log_start_ts())
        self._refresh_title_info()

        # Revenir à l'onglet Personnage
        self._tabbar.show()
        self._stack.setCurrentIndex(0)

    def _on_reset_requested(self):
        """Réinitialise toutes les données et relance l'onboarding."""
        # Vider le log permanent
        perm_log = _PROJECT_ROOT / "logs" / "permanent" / "all_events.log"
        try:
            if perm_log.exists():
                perm_log.write_text("", encoding="utf-8")
        except OSError:
            pass

        # Réinitialiser la config kamas
        self._write_config_patch({
            "base_kamas": 0,
            "manual_kamas_delta": 0,
            "onboarding_done": False,
            "last_session_end": None,
            "perm_log_offset": 0,
        })

        # Réinitialiser l'état en mémoire
        self._onboarding_done = False
        self._base_kamas = 0
        self._manual_kamas_delta = 0
        self._runtime_kamas_delta = 0
        self._current_kamas = 0
        self._journal_read_pos = 0
        self._journal_log_path = None
        if self._options_tab:
            self._options_tab.set_kamas(0)
            self._options_tab.set_kamas_last_entry(None)
            self._options_tab.set_log_start_date(None)
        self._refresh_title_info()

        # Afficher l'onboarding dans la même fenêtre
        self._show_onboarding()

    def _on_kamas_corrected(self, value: int):
        """Correction manuelle du montant de kamas depuis l'onglet Options."""
        ts = write_kamas_correction(value)   # journal horodaté à la ms
        perm_log_offset = get_active_permanent_log_size()
        self._base_kamas = value
        self._manual_kamas_delta = 0
        self._runtime_kamas_delta = 0
        self._current_kamas = value
        self._journal_read_pos = 0
        self._journal_log_path = None
        self._write_config_patch({
            "base_kamas": value,
            "manual_kamas_delta": 0,
            "last_session_end": ts,
            "perm_log_offset": perm_log_offset,
            "journal_read_pos": 0,
            "journal_log_path": "",
        })
        if self._options_tab:
            self._options_tab.set_kamas_last_entry(ts)
        self._refresh_title_info()

    def _write_config_patch(self, patch: dict):
        """Merge `patch` into config.json in place."""
        try:
            data = self._read_config_json()
            data.update(patch)
            _CONFIG_PATH.write_text(
                json.dumps(data, ensure_ascii=False, indent=2), encoding="utf-8"
            )
        except OSError:
            pass

    def _sync_character_info_from_interface_feed(self):
        # Hook attendu pour la future extraction interne Java temps reel.
        selected_path: Path | None = None
        selected_payload: dict | None = None
        selected_mtime: int = 0

        for candidate in _INTERFACE_FEED_PATHS:
            if not candidate.exists():
                continue

            try:
                mtime = candidate.stat().st_mtime_ns
                if self._interface_feed_path == candidate and mtime <= self._interface_feed_mtime:
                    continue

                candidate_payload = json.loads(candidate.read_text(encoding="utf-8"))
            except (OSError, ValueError, TypeError):
                continue

            if not isinstance(candidate_payload, dict):
                continue

            status = str(candidate_payload.get("status", "ok")).strip().lower()
            if status == "error":
                continue

            selected_path = candidate
            selected_payload = candidate_payload
            selected_mtime = mtime
            break

        if selected_path is None or selected_payload is None:
            return

        payload = selected_payload
        self._interface_feed_path = selected_path
        self._interface_feed_mtime = selected_mtime

        source = str(payload.get("source", "")).strip().lower()
        allow_simulator = os.environ.get("WAKFU_ALLOW_SIMULATOR", "0") == "1"
        if source.startswith("simulator") and not allow_simulator:
            # Evite que des valeurs de test ecrasent les valeurs reelles.
            return

        runtime_kamas_usable = True
        if source == "runtime-agent":
            matches = payload.get("matches")
            if isinstance(matches, dict):
                kama_raw = matches.get("kama")
                if isinstance(kama_raw, str) and kama_raw.strip().startswith("[F@"):
                    runtime_kamas_usable = False

        changed = False

        level_value = self._parse_int_token(str(payload.get("level", "")))
        if level_value is not None and level_value != self._last_level:
            self._last_level = level_value
            changed = True

        crit_value = self._parse_int_token(str(payload.get("critical_percent", "")))
        if crit_value is not None and crit_value != self._last_crit_percent:
            self._last_crit_percent = crit_value
            changed = True

        xp_gain = self._parse_int_token(str(payload.get("last_xp_gain", "")))
        if xp_gain is not None and xp_gain != self._last_xp_gain:
            self._last_xp_gain = xp_gain
            changed = True

        xp_to_next = self._parse_int_token(str(payload.get("xp_to_next", "")))
        if xp_to_next is not None and xp_to_next != self._last_xp_to_next:
            self._last_xp_to_next = xp_to_next
            changed = True

        candidates_now, candidate_scores = self._extract_runtime_kama_candidates(payload)
        self._update_runtime_kama_lock(candidates_now, candidate_scores)

        # Kamas géré exclusivement via log-based tracking (base + delta journal).
        # kamas_total / kama_candidates de l'interface feed ignorés.

        ap_value = self._parse_int_token(str(payload.get("ap", "")))
        if ap_value is not None and ap_value != self._last_ap:
            self._last_ap = ap_value
            changed = True

        mp_value = self._parse_int_token(str(payload.get("mp", "")))
        if mp_value is not None and mp_value != self._last_mp:
            self._last_mp = mp_value
            changed = True

        wp_value = self._parse_int_token(str(payload.get("wp", "")))
        if wp_value is not None and wp_value != self._last_wp:
            self._last_wp = wp_value
            changed = True

        hp_value = self._parse_int_token(str(payload.get("hp_percent", "")))
        if hp_value is not None and hp_value != self._last_hp_percent:
            self._last_hp_percent = hp_value
            changed = True

        inventory_open_value = payload.get("inventory_open")
        if isinstance(inventory_open_value, bool) and inventory_open_value != self._inventory_open:
            self._inventory_open = inventory_open_value
            changed = True

        character_sheet_open_value = payload.get("character_sheet_open")
        if isinstance(character_sheet_open_value, bool) and character_sheet_open_value != self._character_sheet_open:
            self._character_sheet_open = character_sheet_open_value
            changed = True

        if changed:
            self._refresh_title_info()

    @staticmethod
    def _extract_runtime_kama_candidates(payload: dict) -> tuple[dict[str, int], dict[str, int]]:
        raw_candidates = payload.get("kama_candidates")
        if not isinstance(raw_candidates, dict):
            return {}, {}

        parsed: dict[str, int] = {}
        scores: dict[str, int] = {}
        for entry in raw_candidates.values():
            match = _KAMA_CANDIDATE_VALUE_RE.match(str(entry or "").strip())
            if not match:
                continue
            key = match.group(1).strip()
            key_lower = key.lower()
            if any(token in key_lower for token in _KAMA_CANDIDATE_BLOCKLIST):
                continue
            try:
                value = int(match.group(2))
                score = int(match.group(3))
            except ValueError:
                continue
            if value < 0:
                continue
            parsed[key] = value
            scores[key] = score

        return parsed, scores

    def _update_runtime_kama_lock(self, candidates_now: dict[str, int], candidate_scores: dict[str, int]):
        if not candidates_now:
            self._runtime_kama_candidates_prev = {}
            self._runtime_kama_candidate_scores = {}
            self._runtime_kama_reliable = False
            return

        self._runtime_kama_candidate_scores = dict(candidate_scores)

        delta_since_last = self._runtime_kamas_delta - self._runtime_kama_last_delta_applied
        best_key: str | None = None
        best_score = -10_000

        if delta_since_last != 0 and self._runtime_kama_candidates_prev:
            for key, previous_value in self._runtime_kama_candidates_prev.items():
                current_value = candidates_now.get(key)
                if current_value is None:
                    continue
                value_delta = current_value - previous_value
                if value_delta != delta_since_last:
                    continue

                heuristic_score = self._runtime_kama_candidate_scores.get(key, 0)
                if self._runtime_kama_locked_key == key:
                    heuristic_score += 25
                if self._runtime_kama_truth_hint is not None and current_value == self._runtime_kama_truth_hint:
                    heuristic_score += 50
                if heuristic_score > best_score:
                    best_score = heuristic_score
                    best_key = key

        # If a trusted exact value is provided, prefer the matching candidate even without delta.
        if not best_key and self._runtime_kama_truth_hint is not None:
            for key, current_value in candidates_now.items():
                if current_value != self._runtime_kama_truth_hint:
                    continue
                heuristic_score = self._runtime_kama_candidate_scores.get(key, 0) + 40
                if self._runtime_kama_locked_key == key:
                    heuristic_score += 25
                if heuristic_score > best_score:
                    best_score = heuristic_score
                    best_key = key

        if best_key:
            if self._runtime_kama_locked_key == best_key:
                self._runtime_kama_lock_hits += 1
            else:
                self._runtime_kama_locked_key = best_key
                self._runtime_kama_lock_hits = 1
            self._runtime_kama_reliable = True
            self._runtime_kama_last_delta_applied = self._runtime_kamas_delta

        elif self._runtime_kama_locked_key and self._runtime_kama_locked_key in candidates_now:
            # Keep lock if candidate remains visible.
            self._runtime_kama_reliable = self._runtime_kama_lock_hits > 0
        else:
            self._runtime_kama_reliable = False

        self._runtime_kama_candidates_prev = dict(candidates_now)

    def _sync_class_from_wakfu_log(self):
        blob = self._read_wakfu_log_update()
        if not blob:
            return

        state = self._parse_log_state(blob)
        changed = False

        connected = state.get("connected")
        if connected is not None and connected != self._session_connected:
            self._session_connected = bool(connected)
            changed = True
            # En cas de déconnexion, on évite de rester bloqué sur un ancien perso.
            if not self._session_connected:
                self._last_detected_class = None

        character_name = state.get("character_name")
        if isinstance(character_name, str) and character_name.strip():
            normalized_name = _normalize_character_name(character_name)
            if normalized_name != self._current_character_name:
                self._current_character_name = normalized_name
                self._write_character_name(normalized_name)
                changed = True

        breed_id = state.get("breed_id")
        class_key = state.get("class_key")
        if not class_key and self._current_character_name:
            class_key = self._read_known_character_classes().get(self._current_character_name)
        if not class_key and breed_id is not None:
            class_key = _BREED_TO_CLASS.get(int(breed_id))

        if breed_id is None and not class_key:
            if changed:
                self._refresh_title_info()
            return

        if self._last_detected_class == class_key and not changed:
            return

        if class_key:
            if self._last_detected_class != class_key:
                self._last_detected_class = class_key
                self._write_character_class(class_key)
                if self._current_character_name:
                    self._write_known_character_class(self._current_character_name, class_key)
                changed = True
            self._titlebar.set_class_icon(class_key)
        if changed:
            self._refresh_title_info()

    def _read_wakfu_log_update(self) -> str | None:
        if not _WAKFU_LOG_PATH.exists():
            return None

        try:
            size = _WAKFU_LOG_PATH.stat().st_size
            if size <= 0:
                return None

            with _WAKFU_LOG_PATH.open("rb") as fh:
                # Boot: on lit une grosse fin de fichier pour initialiser l'état.
                if self._log_read_pos <= 0:
                    start = max(0, size - _LOG_BOOTSTRAP_CHUNK)
                    fh.seek(start)
                    data = fh.read()
                    self._log_read_pos = size
                    return data.decode("utf-8", errors="ignore")

                # Rotation/troncature du log.
                if size < self._log_read_pos:
                    self._log_read_pos = 0
                    fh.seek(0)
                    data = fh.read()
                    self._log_read_pos = size
                    return data.decode("utf-8", errors="ignore")

                if size == self._log_read_pos:
                    return None

                fh.seek(self._log_read_pos)
                data = fh.read()
                self._log_read_pos = size
                return data.decode("utf-8", errors="ignore")
        except OSError:
            return None

    @staticmethod
    def _parse_log_state(blob: str) -> dict[str, int | str | bool | None]:
        connected: bool | None = None
        breed_id: int | None = None
        character_name: str | None = None
        inferred_classes: dict[str, str] = {}

        for raw_line in blob.splitlines():
            line = raw_line.lower()

            if any(marker in line for marker in _DISCONNECTED_MARKERS):
                connected = False
                continue

            if any(marker in line for marker in _CONNECTED_MARKERS):
                connected = True

            player_match = _PLAYER_BREED_LINE_RE.search(raw_line)
            if player_match:
                character_name = player_match.group(1).strip()
                try:
                    breed_id = int(player_match.group(2))
                except ValueError:
                    breed_id = None
                connected = True
                continue

            spell_match = _SPELL_CAST_RE.search(raw_line)
            if spell_match:
                caster_name = spell_match.group(1).strip()
                spell_name = spell_match.group(2).strip()
                class_key = OverlayWindow._infer_class_from_spell(spell_name)
                if class_key:
                    inferred_classes[caster_name] = class_key

            match = _BREED_LINE_RE.search(raw_line)
            if not match:
                continue

            try:
                breed_id = int(match.group(1))
            except ValueError:
                continue

            connected = True

        class_key = None
        if character_name:
            class_key = inferred_classes.get(character_name)
        if class_key is None and breed_id is not None:
            class_key = _BREED_TO_CLASS.get(breed_id)
        return {
            "connected": connected,
            "breed_id": breed_id,
            "character_name": character_name,
            "class_key": class_key,
        }

    @staticmethod
    def _infer_class_from_spell(spell_name: str) -> str | None:
        normalized = (
            str(spell_name or "")
            .strip()
            .lower()
            .replace("œ", "oe")
        )
        if not normalized:
            return None

        ascii_normalized = (
            normalized
            .replace("à", "a")
            .replace("â", "a")
            .replace("ä", "a")
            .replace("é", "e")
            .replace("è", "e")
            .replace("ê", "e")
            .replace("ë", "e")
            .replace("î", "i")
            .replace("ï", "i")
            .replace("ô", "o")
            .replace("ö", "o")
            .replace("ù", "u")
            .replace("û", "u")
            .replace("ü", "u")
            .replace("ç", "c")
        )

        for class_key, signatures in _SPELL_CLASS_SIGNATURES.items():
            for signature in signatures:
                if signature in normalized or signature in ascii_normalized:
                    return class_key
        return None

    def _reorder_above_wakfu(self):
        """Positionne l'overlay juste au-dessus de Wakfu dans le Z-order :
        visible par-dessus Wakfu, mais sous les autres apps si elles passent devant."""
        if not self.isVisible():
            return
        wakfu_hwnd = self._tracker.hwnd
        if not wakfu_hwnd:
            return
        overlay_hwnd = int(self.winId())
        try:
            # Fenêtre directement au-dessus de Wakfu dans la pile Z
            above = win32gui.GetWindow(wakfu_hwnd, win32con.GW_HWNDPREV)
            if above == overlay_hwnd:
                return  # déjà en position
            if above:
                # hWndInsertAfter doit être une fenêtre non-topmost ;
                # si la fenêtre au-dessus de Wakfu est topmost (ex. barre des tâches,
                # notifications système), on tombe en arrière sur HWND_TOP.
                try:
                    ex = win32gui.GetWindowLong(above, win32con.GWL_EXSTYLE)
                    is_topmost = bool(ex & win32con.WS_EX_TOPMOST)
                except Exception:
                    is_topmost = True
                if not is_topmost:
                    win32gui.SetWindowPos(
                        overlay_hwnd, above, 0, 0, 0, 0,
                        win32con.SWP_NOMOVE | win32con.SWP_NOSIZE | win32con.SWP_NOACTIVATE,
                    )
                    return
            # Pas de fenêtre non-topmost au-dessus de Wakfu → placer au sommet
            # de la couche non-topmost (= au-dessus de Wakfu)
            win32gui.SetWindowPos(
                overlay_hwnd, win32con.HWND_TOP, 0, 0, 0, 0,
                win32con.SWP_NOMOVE | win32con.SWP_NOSIZE | win32con.SWP_NOACTIVATE,
            )
        except Exception:
            pass

    def _on_wakfu_found(self, _hwnd: int):
        rect = self._tracker.rect
        if rect:
            self._on_wakfu_geometry(*rect)
        # Drop TOPMOST initial → Z-order géré manuellement via _reorder_above_wakfu
        try:
            win32gui.SetWindowPos(
                int(self.winId()), win32con.HWND_NOTOPMOST, 0, 0, 0, 0,
                win32con.SWP_NOMOVE | win32con.SWP_NOSIZE | win32con.SWP_NOACTIVATE,
            )
        except Exception:
            pass
        self.show()
        self._reorder_above_wakfu()
        self._update_click_unlock_button_visibility()

    def _on_wakfu_lost(self):
        self._wakfu_rect = None
        self.hide()
        self._update_click_unlock_button_visibility()

    def _on_wakfu_geometry(self, x: int, y: int, w: int, h: int):
        self._wakfu_rect = (x, y, w, h)
        if not self._titlebar.is_pinned:
            self._apply_relative_to_wakfu(x, y, w, h)

    def _on_wakfu_minimized(self):
        self.hide()
        self._update_click_unlock_button_visibility()

    def _on_wakfu_restored(self):
        if self._wakfu_rect and not self._titlebar.is_pinned and not self._folded:
            self._apply_relative_to_wakfu(*self._wakfu_rect)
        self.show()
        self._reorder_above_wakfu()
        self._update_click_unlock_button_visibility()

    def _on_wakfu_focus_changed(self, focused: bool):
        # Toujours visible — on resynchronise position et Z-order
        if self._tracker.rect and not self._titlebar.is_pinned and not self._folded:
            self._apply_relative_to_wakfu(*self._tracker.rect)
        self._reorder_above_wakfu()
        self._update_click_unlock_button_visibility()

    def _ensure_relative_defaults(self, wakfu_w: int, wakfu_h: int):
        if wakfu_w <= 0 or wakfu_h <= 0:
            return

        if self._relative_size_ratio is None:
            rw = max(MIN_W / wakfu_w, self.width() / wakfu_w)
            rh = max(MIN_H / wakfu_h, self.height() / wakfu_h)
            rw = min(0.95, max(0.20, rw))
            rh = min(0.95, max(0.20, rh))
            self._relative_size_ratio = (rw, rh)

        if self._relative_offset_ratio is None and self._wakfu_rect:
            wx, wy, ww, wh = self._wakfu_rect
            ox = (self.x() - wx) / max(1, ww)
            oy = (self.y() - wy) / max(1, wh)
            self._relative_offset_ratio = (ox, oy)

        self._save_relative_layout()

    def _apply_relative_to_wakfu(self, x: int, y: int, w: int, h: int):
        screen = QApplication.primaryScreen().availableGeometry()

        self._ensure_relative_defaults(w, h)
        if self._relative_size_ratio is None or self._relative_offset_ratio is None:
            return

        rw, rh = self._relative_size_ratio
        oxr, oyr = self._relative_offset_ratio

        target_w = int(max(MIN_W, min(w - 10, round(w * rw))))
        target_h = int(max(MIN_H, min(h - 10, round(h * rh))))
        target_x = int(round(x + (w * oxr)))
        target_y = int(round(y + (h * oyr)))

        target_w = max(MIN_W, target_w)
        target_h = max(MIN_H, target_h)

        # Si l'overlay est complètement hors de la fenêtre Wakfu (offset corrompu
        # ou session précédente en plein écran), le recaler sur le bord droit.
        no_overlap = (
            target_x >= x + w or
            target_x + target_w <= x or
            target_y >= y + h or
            target_y + target_h <= y
        )
        if no_overlap and w > 0 and h > 0:
            target_x = x + w - target_w - ATTACH_GAP
            target_y = y + ATTACH_GAP * 3
            self._relative_offset_ratio = ((target_x - x) / w, (target_y - y) / h)
            self._save_relative_layout()

        target_x = max(screen.left(), min(target_x, screen.right() - target_w))
        target_y = max(screen.top(), min(target_y, screen.bottom() - target_h))

        self._in_programmatic_move = True
        if self._folded:
            self.move(target_x, target_y)
            self.resize(target_w, self.height())
        else:
            self.setGeometry(target_x, target_y, target_w, target_h)
        self._in_programmatic_move = False
        self._position_click_unlock_button()

    def _save_relative_layout(self):
        if self._relative_offset_ratio is None:
            self._settings.setValue("relative_offset_set", False)
            self._settings.remove("relative_offset_rx")
            self._settings.remove("relative_offset_ry")
        else:
            ox, oy = self._relative_offset_ratio
            self._settings.setValue("relative_offset_set", True)
            self._settings.setValue("relative_offset_rx", float(ox))
            self._settings.setValue("relative_offset_ry", float(oy))
            self._settings.setValue("default_relative_offset_set", True)
            self._settings.setValue("default_relative_offset_rx", float(ox))
            self._settings.setValue("default_relative_offset_ry", float(oy))

        if self._relative_size_ratio is None:
            self._settings.setValue("relative_size_set", False)
            self._settings.remove("relative_size_rw")
            self._settings.remove("relative_size_rh")
        else:
            rw, rh = self._relative_size_ratio
            self._settings.setValue("relative_size_set", True)
            self._settings.setValue("relative_size_rw", float(rw))
            self._settings.setValue("relative_size_rh", float(rh))
            self._settings.setValue("default_relative_size_set", True)
            self._settings.setValue("default_relative_size_rw", float(rw))
            self._settings.setValue("default_relative_size_rh", float(rh))

    def set_overlay_opacity(self, opacity: float):
        self._opacity = max(0.35, min(1.0, float(opacity)))
        if not self._click_through:
            self.setWindowOpacity(self._opacity)
        self._settings.setValue("overlay_opacity", self._opacity)

    def set_overlay_font_family(self, family: str):
        if not family:
            return
        self._font_family = str(family)
        self._apply_app_font_style()
        self._settings.setValue("ui_font_family", self._font_family)

    def set_overlay_palette(self, palette_name: str):
        if not palette_name:
            return
        self._palette_name = str(palette_name)
        self._palette = get_palette(self._palette_name)
        self._titlebar.set_palette(self._palette)
        self._tabbar.set_palette(self._palette)
        self._apply_app_font_style()
        self._refresh_click_unlock_icon()
        self.update()
        self._settings.setValue("ui_palette", self._palette_name)

    def _refresh_click_unlock_icon(self):
        if self._click_unlock_btn is None:
            return
        from ui.titlebar import _tinted_icon, _ICON_DIR
        teal_bright = self._palette.get("TEAL_BRIGHT", TEAL_BRIGHT)
        self._click_unlock_btn.setIcon(
            _tinted_icon(str(_ICON_DIR / "clickthrough.svg"), teal_bright)
        )

    def set_window_corner_radius(self, radius: int):
        self._corner_radius = max(4, min(32, int(radius)))
        self._mask_cache_size = None
        self._apply_rounded_mask()
        self.update()
        self._settings.setValue("window_corner_radius", self._corner_radius)

    def _on_short_kamas_changed(self, enabled: bool):
        self._short_kamas = enabled
        self._settings.setValue("short_kamas", enabled)
        for widget in self._tab_widgets:
            if isinstance(widget, TransactionsTab):
                widget.set_short_kamas(enabled)
                break

    def _on_fold_anchor_changed(self, enabled: bool):
        self._fold_anchor_bottom = enabled
        self._settings.setValue("fold_anchor_bottom", enabled)

    def _on_ct_opacity_changed(self, opacity: float):
        self._ct_opacity = max(0.05, min(0.85, float(opacity)))
        self._settings.setValue("ct_opacity", self._ct_opacity)
        if self._click_through:
            self.setWindowOpacity(self._ct_opacity)

    def set_click_through(self, enabled: bool):
        self._click_through = bool(enabled)
        self._titlebar.set_click_through(self._click_through)
        self._settings.setValue("click_through", self._click_through)
        self.setWindowOpacity(self._ct_opacity if self._click_through else self._opacity)
        self._apply_click_through_style()
        self._update_click_unlock_button_visibility()

    def _apply_click_through_style(self):
        hwnd = int(self.winId())
        try:
            ex_style = win32gui.GetWindowLong(hwnd, win32con.GWL_EXSTYLE)
            if self._click_through:
                ex_style |= win32con.WS_EX_TRANSPARENT
            else:
                ex_style &= ~win32con.WS_EX_TRANSPARENT
            win32gui.SetWindowLong(hwnd, win32con.GWL_EXSTYLE, ex_style)
            win32gui.SetWindowPos(
                hwnd,
                0,
                0,
                0,
                0,
                0,
                win32con.SWP_NOMOVE
                | win32con.SWP_NOSIZE
                | win32con.SWP_NOZORDER
                | win32con.SWP_FRAMECHANGED,
            )
        except Exception:
            pass

    def _position_click_unlock_button(self):
        if self._click_unlock_btn is None:
            return
        # Superposé exactement sur le bouton click-through du titlebar
        x, y, _w, _h = self._titlebar.click_through_btn_geometry()
        self._click_unlock_btn.move(x, y)

    def _update_click_unlock_button_visibility(self):
        if self._click_unlock_btn is None:
            return

        show_btn = self._click_through and self.isVisible()
        if show_btn:
            self._position_click_unlock_button()
            self._click_unlock_btn.show()
            self._click_unlock_btn.raise_()
        else:
            self._click_unlock_btn.hide()

    def _apply_app_font_style(self):
        app = QApplication.instance()
        if app is None:
            return

        family = self._font_family.replace('"', '\\"')
        font_stack = f'"{family}", "Noto Sans", "Inter", "IBM Plex Sans", "Segoe UI Variable", "Segoe UI", sans-serif'
        app.setStyleSheet(build_qss(self._palette_name, font_stack))

    def _apply_rounded_mask(self):
        w, h = self.width(), self.height()
        cached = getattr(self, '_mask_cache_size', None)
        if cached == (w, h, self._corner_radius):
            return
        self._mask_cache_size = (w, h, self._corner_radius)
        r = min(self._corner_radius, w // 2, h // 2)
        d = r * 2
        # Construction directe par addition de régions simples — sans polygone.
        region = QRegion(r, 0, w - d, h)        # bande centrale verticale
        region += QRegion(0, r, w, h - d)        # bande centrale horizontale
        region += QRegion(0,     0,     d, d, QRegion.Ellipse)  # coin haut-gauche
        region += QRegion(w - d, 0,     d, d, QRegion.Ellipse)  # coin haut-droit
        region += QRegion(0,     h - d, d, d, QRegion.Ellipse)  # coin bas-gauche
        region += QRegion(w - d, h - d, d, d, QRegion.Ellipse)  # coin bas-droit
        self.setMask(region)

    # ── Resize + Drag — événements souris ─────────────────────────

    def nativeEvent(self, event_type, message):
        if event_type == b'windows_generic_MSG':
            import ctypes, ctypes.wintypes
            msg = ctypes.wintypes.MSG.from_address(int(message))
            if msg.message == 0x0014:  # WM_ERASEBKGND — évite le flash blanc avant WM_PAINT
                return True, 1
        return super().nativeEvent(event_type, message)

    def eventFilter(self, obj, event):
        """Intercepte les events souris globaux pour gérer le resize depuis n'importe quel widget."""
        t = event.type()

        if t == QEvent.MouseButtonPress and event.button() == Qt.LeftButton:
            lpos = self.mapFromGlobal(event.globalPos())
            if not self._folded and self.rect().contains(lpos):
                edge = _edge_at(lpos, self.width(), self.height())
                if edge:
                    self._resize_dir     = edge
                    self._resize_start_p = event.globalPos()
                    self._resize_start_g = self.geometry()
                    self._drag_pos       = None
                    return True

        elif t == QEvent.MouseMove:
            gpos = event.globalPos()
            lpos = self.mapFromGlobal(gpos)
            if event.buttons() == Qt.LeftButton and self._resize_dir:
                self._do_resize(gpos)
                return True
            # Mise à jour du curseur via override global (évite que les enfants l'écrasent).
            if not self._folded and self.rect().contains(lpos) and not (event.buttons() & Qt.LeftButton):
                edge = _edge_at(lpos, self.width(), self.height())
                cursor = _CURSORS.get(edge)
                if cursor is not None:
                    if not self._cursor_overridden:
                        QApplication.setOverrideCursor(cursor)
                        self._cursor_overridden = True
                    elif QApplication.overrideCursor().shape() != cursor:
                        QApplication.changeOverrideCursor(cursor)
                else:
                    if self._cursor_overridden:
                        QApplication.restoreOverrideCursor()
                        self._cursor_overridden = False
            elif self._cursor_overridden:
                QApplication.restoreOverrideCursor()
                self._cursor_overridden = False

        elif t == QEvent.MouseButtonRelease and event.button() == Qt.LeftButton:
            if self._resize_dir:
                if not self._titlebar.is_pinned and self._wakfu_rect and not self._in_programmatic_move:
                    wx, wy, ww, wh = self._wakfu_rect
                    if ww > 0 and wh > 0:
                        self._relative_offset_ratio = ((self.x() - wx) / ww, (self.y() - wy) / wh)
                        if not self._folded:
                            self._relative_size_ratio = (self.width() / ww, self.height() / wh)
                        self._save_relative_layout()
                self._drag_pos   = None
                self._resize_dir = 0
                return True

        return super().eventFilter(obj, event)

    def mousePressEvent(self, event):
        if event.button() != Qt.LeftButton:
            return
        if (not self._titlebar.is_pinned
                and event.y() <= self._titlebar.height()
                and not _edge_at(event.pos(), self.width(), self.height())):
            # Démarrer un drag (resize géré dans eventFilter)
            self._drag_pos   = event.globalPos() - self.frameGeometry().topLeft()
            self._resize_dir = 0

    def mouseMoveEvent(self, event):
        if event.buttons() == Qt.LeftButton and self._drag_pos:
            self.move(event.globalPos() - self._drag_pos)

    def mouseReleaseEvent(self, _event):
        if self._drag_pos is not None:
            # Après un drag manuel, persister la nouvelle position relative
            # pour que _on_wakfu_focus_changed ne snappe pas en arrière.
            if not self._titlebar.is_pinned and self._wakfu_rect and not self._in_programmatic_move:
                wx, wy, ww, wh = self._wakfu_rect
                if ww > 0 and wh > 0:
                    self._relative_offset_ratio = ((self.x() - wx) / ww, (self.y() - wy) / wh)
                    self._save_relative_layout()
        self._drag_pos = None

    def leaveEvent(self, _event):
        if self._cursor_overridden:
            QApplication.restoreOverrideCursor()
            self._cursor_overridden = False

    # ── Resize ────────────────────────────────────────────────────

    def _do_resize(self, gp: QPoint):
        dx = gp.x() - self._resize_start_p.x()
        dy = gp.y() - self._resize_start_p.y()
        g  = self._resize_start_g

        x, y, w, h = g.x(), g.y(), g.width(), g.height()

        if self._resize_dir & _R:
            w = max(MIN_W, g.width() + dx)
        if self._resize_dir & _B:
            h = max(MIN_H, g.height() + dy)
        if self._resize_dir & _L:
            w = max(MIN_W, g.width() - dx)
            x = g.x() + g.width() - w
        if self._resize_dir & _T:
            h = max(MIN_H, g.height() - dy)
            y = g.y() + g.height() - h

        self.setGeometry(x, y, w, h)

    def _update_cursor(self, pos: QPoint):
        if self._folded:
            self.setCursor(Qt.ArrowCursor)
            return
        edge = _edge_at(pos, self.width(), self.height())
        if edge in _CURSORS:
            self.setCursor(_CURSORS[edge])
        elif pos.y() <= self._titlebar.height() and not self._titlebar.is_pinned:
            self.setCursor(Qt.SizeAllCursor)
        else:
            self.setCursor(Qt.ArrowCursor)

    # ── Rendu ─────────────────────────────────────────────────────

    def paintEvent(self, _event):
        p = QPainter(self)
        p.setRenderHint(QPainter.Antialiasing)
        r = self.rect()

        p.setPen(Qt.NoPen)
        bg = QColor(self._palette.get("BG", BG))
        bg.setAlpha(242)
        p.setBrush(bg)
        p.drawRoundedRect(r, self._corner_radius, self._corner_radius)

        p.setPen(QPen(QColor(self._palette.get("BORDER", BORDER)), 1))
        p.setBrush(Qt.NoBrush)
        p.drawRoundedRect(r.adjusted(0, 0, -1, -1), self._corner_radius, self._corner_radius)

    def resizeEvent(self, event):
        super().resizeEvent(event)
        self._apply_rounded_mask()
        self._position_click_unlock_button()

    def moveEvent(self, event):
        super().moveEvent(event)
        self._position_click_unlock_button()

    def closeEvent(self, event):
        if self._click_unlock_btn is not None:
            self._click_unlock_btn.hide()
            self._click_unlock_btn.deleteLater()
            self._click_unlock_btn = None
        self._settings.setValue("window_width", self.width())
        expanded_h = self._saved_h if self._folded else self.height()
        self._settings.setValue("window_height", max(MIN_H, int(expanded_h)))
        self._settings.setValue("default_window_width", self.width())
        self._settings.setValue("default_window_height", max(MIN_H, int(expanded_h)))
        self._save_relative_layout()
        self._settings.sync()
        self._persist_journal_cursor()
        # Persister le kamas actuel + offset du log pour démarrage rapide
        if self._current_kamas is not None and self._onboarding_done:
            perm_log_offset = get_active_permanent_log_size()
            self._write_config_patch({
                "base_kamas": self._current_kamas,
                "manual_kamas_delta": 0,
                "last_session_end": now_iso(),
                "perm_log_offset": perm_log_offset,
            })
        super().closeEvent(event)

    def showEvent(self, event):
        super().showEvent(event)
        self._titlebar.set_click_through(self._click_through)
        self._apply_click_through_style()
        self._update_click_unlock_button_visibility()
