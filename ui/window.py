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
from core.permanent_journal import (
    sync_permanent_journal, query_character_info,
    query_last_server, query_unique_chat_authors,
    query_profession_tracking, replay_character_xp_since,
    query_log_start_date, query_inventory, query_played_time,
)
from ui.tabbar   import TabBar, TABS
from ui.tabs.base import PlaceholderTab
from ui.tabs.hdv import HdvTab
from ui.tabs.options import OptionsTab
from ui.tabs.personnage import PersonnageTab
from ui.tabs.metiers import MetiersTab
from ui.tabs.combat import CombatTab
from ui.tabs.inventaire import InventaireTab
from core.wakfu_tracker import WakfuTracker, GameState

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
_PLAYED_LOG_RE = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez joué\s+(.+)",
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
_WHOIS_RE = re.compile(
    r"Le joueur\s+(.+?)\s+\([^)]+\)\s+est connecté sur le serveur\s+(.+?)(?:\.|$)",
    re.IGNORECASE,
)
_ITEM_GAIN_LOOT_RE_WIN = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez ramass[eé]\s+(\d+)x\s+(.+?)\s*\.",
    re.IGNORECASE,
)
_ITEM_GAIN_INV_RE_WIN = _ITEM_GAIN_LOOT_RE_WIN  # même pattern
_ITEM_LOSS_RE_WIN = re.compile(
    r"\[Information \(jeu\)\]\s+Vous avez perdu\s+(\d+)x\s+(.+?)\s*\.",
    re.IGNORECASE,
)
_DEATH_RE_COMBAT = re.compile(r"\[Information \(combat\)\]\s+(.+?)\s+est mort", re.IGNORECASE)
_KO_RE_COMBAT    = re.compile(r"\[Information \(combat\)\]\s+(.+?)\s+est KO\s*!", re.IGNORECASE)
_HP_LOSS_RE_COMBAT = re.compile(
    r"\[Information \(combat\)\]\s+(.+?)\s*:\s*-([\d\s\u00a0\u202f]+)\s+PV",
    re.IGNORECASE,
)
_XP_PROF_RE = re.compile(
    r"\[Information \(jeu\)\]\s+(.+?)\s*:\s*\+([0-9\s\u00a0\u202f.,]+)\s*points d'XP\.\s*Prochain niveau dans\s*:\s*([0-9\s\u00a0\u202f.,]+)",
    re.IGNORECASE,
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
    # ── Confirmés par combats réels (17/03/2026) ───────────────────
    "feca": (
        "fecalistofedes", "fécalistofedes",
    ),
    "osamodas": (
        "forme draconique",
        "tempete de sable", "tempête de sable",
        "pesanteur",
    ),
    "enutrof": (
        "dette",
        "excavation",
        "filouterie",
        "meteore", "météore",
        "pelle du jugement",
        "purge",
    ),
    "sram": (
        "kleptosram",
        "fourberie",
        "arnaque",
        "invisibilite", "invisibilité",
        "saignee mortelle", "saignée mortelle",
        "mise a mort", "mise à mort",
        "premier sang",
        "attaque perfide",
        "assassinat",
        "piege de teleportation", "piège de téléportation",
        "ouvrir les veines",
        "galopade",
    ),
    "xelor": (
        "aiguille",
        "sablier",
        "ralentissement",
        "desynchronisation", "désynchronisation",
        "contre la montre",
    ),
    "ecaflip": (
        "craps",
        "ecaflip",          # Les Bébétards d'Ecaflip, etc.
        "quitte ou double",
        "la roue de la fortune",
        "bond du felin", "bond du félin",
        "la croquette",
        "hermite poilu",
        "lune poilue",
        "chacrifice",
        "relance",
    ),
    "eniripsa": (
        "anatomie",
        "contre-nature",
        "cure alternative",
        "explo-soin",
        "mot soignant",
        "vivification",
    ),
    "iop": (
        "fulgur",
        "jabs",
        "roknocerok",
        "ebranler", "ébranler",
        "epee celeste", "épée céleste",
    ),
    "cra": (
        "fleche", "flèche",     # Flèche chercheuse / d'immolation / cinglante…
        "balise de destruction",
        "balise d'alignement",
        "pluie de fleches", "pluie de flèches",
    ),
    "sadida": (
        "graine",
        "vaporiser",
        "poignee de lianes", "poignée de lianes",
        "insolence",
    ),
    "sacrier": (
        "aversion",
        "furie sanguinaire",
        "pied rocheux",
        "poing tatoue agrippant", "poing tatoué agrippant",
        "sang pour sang",
        "chatiment ose", "châtiment osé",
    ),
    "pandawa": (
        "chamrak",
        "nuage laiteux",
        "tonneau",
        "triple karma leet",
        "tournee generale", "tournée générale",
        "souffle enflamme", "souffle enflammé",
    ),
    "rogue": (
        "dynamite",
        "mitraille",
        "bombe",
    ),
    "masqueraider": (
        "masque de psychopathe",
        "felure", "félure",
        "armature",
        "coup de pied fouette", "coup de pied fouetté",
    ),
    "ouginak": (
        "chienchien",
        "emeute", "émeute",
        "ougigarou",
        "bastonnade",
        "croc-en-jambe",
    ),
    "foggernaut": (
        "steamerator",
        "tir de destruction",
        "tir d'alignement",
        "tir de distance",
        "tourelle",
        "crache flammes",
        "pietinement", "piétinement",
    ),
    "elio": (
        "portail",
        "pulsation",
        "cataclysme",
        "exaltation",
        "affliction",
        "barriere", "barrière",
    ),
    "huppermage": (
        "disque luminescent",
        "flux d'energie", "flux d'énergie",
        "eboulement", "éboulement",
        "coeur de lumiere", "cœur de lumière",
    ),
}


def _normalize_character_name(value: str) -> str:
    name = str(value or "").strip()
    name = re.sub(r"^fightId=\d+\s+", "", name, flags=re.IGNORECASE)
    # Normalise les apostrophes typographiques (titre Windows) vers apostrophe droite (logs)
    name = name.replace("\u2019", "'").replace("\u02bc", "'")
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
        self._market_default_days: int = 28
        self._market_territory_rate: int = 5
        saved_ct = self._settings.value("ct_opacity", 0.60, type=float)
        self._ct_opacity: float = max(0.05, min(0.85, float(saved_ct)))
        self._palette = get_palette(self._palette_name)
        self._click_through = self._settings.value("click_through", False, type=bool)
        self._click_unlock_btn: QPushButton | None = None
        self._elapsed_seconds: int = 0
        self._game_state: GameState = GameState.OFFLINE
        self._session_connected: bool | None = None
        self._log_read_pos: int = 0
        self._journal_read_pos: int = 0
        self._journal_log_path: Path | None = None
        self._last_detected_class: str | None = None
        self._current_character_name: str | None = None
        self._last_level: int | None = None
        self._last_xp_gain: int | None = None
        self._last_xp_to_next: int | None = None
        self._session_xp_gained: int = 0   # XP absolu dans le niveau (depuis calibration)
        self._session_xp_at_start: int = 0  # baseline au chargement du perso (pour le taux)
        self._played_seconds_anchor: int | None = None  # secondes jouées au moment de l'ancre
        self._played_anchor_ts: "QDateTime | None" = None  # moment réel de l'ancre
        self._last_crit_percent: int | None = None
        self._last_ap: int | None = None
        self._last_mp: int | None = None
        self._last_wp: int | None = None
        self._inventory_open: bool | None = None
        self._character_sheet_open: bool | None = None
        self._current_kamas: int | None = None
        self._base_kamas: int = 0
        self._manual_kamas_delta: int = 0
        self._runtime_kamas_delta: int = 0
        self._interface_feed_mtime: int = 0
        self._interface_feed_path: Path | None = None
        self._options_tab:    "OptionsTab | None"        = None
        self._personnage_tab: "PersonnageTab | None"     = None
        self._library_panel:   "WidgetLibraryPanel | None" = None
        self._metiers_tab:    "MetiersTab | None"         = None
        self._combat_tab:     "CombatTab | None"          = None
        self._inventaire_tab: "InventaireTab | None"      = None
        self._session_combat_count:  int               = 0
        self._combat_last_attacker:  str | None        = None  # dernier monstre ayant agi
        self._combat_damage_by:      dict[str, int]    = {}    # monstre → dégâts infligés au joueur
        self._combat_killed_by:      dict[str, int]    = {}    # monstre → kills du joueur
        self._last_server:    str | None                  = None
        self._unique_players: int | None                  = None
        self._log_start_date: str | None                  = None
        self._stats_labels: dict[str, QLabel] = {}
        self._runtime_kama_candidates_prev: dict[str, int] = {}
        self._runtime_kama_candidate_scores: dict[str, int] = {}
        self._runtime_kama_locked_key: str | None = None
        self._runtime_kama_lock_hits: int = 0
        self._runtime_kama_reliable: bool = False
        self._runtime_kama_last_delta_applied: int = 0
        self._runtime_kama_truth_hint: int | None = self._parse_int_token(os.environ.get("WAKFU_KAMA_TRUTH_HINT"))
        self._known_character_vitals: dict[str, dict] = {}
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
        # Restaure les positions éditées (après que show() ait fixé les géométries)
        from ui.drag_editor import EditModeManager
        QTimer.singleShot(150, EditModeManager.instance().apply_saved_positions)
        # Charge les données historiques (serveur + métiers) depuis le log permanent
        QTimer.singleShot(300, self._load_journal_history)

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
        import ui.theme as _theme
        _theme.FONT_TITLE = self._settings.value("ui_font_title", _theme.FONT_TITLE, type=str)
        _theme.FONT_BODY  = self._settings.value("ui_font_body",  _theme.FONT_BODY,  type=str)
        _theme.FONT_LABEL = self._settings.value("ui_font_label", _theme.FONT_LABEL, type=str)
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

        # ── Bannière mode édition (F11) ──────────────────────────────────
        from ui.drag_editor import EditModeManager
        self._edit_banner = QLabel("  ✥  Mode Édition  —  F11 pour quitter  ")
        self._edit_banner.setAlignment(Qt.AlignCenter)
        self._edit_banner.setFixedHeight(22)
        self._edit_banner.setStyleSheet(
            "QLabel { background: rgba(80,180,255,0.15); color: #50B4FF;"
            " font-size: 11px; font-weight: bold;"
            " border-bottom: 1px solid rgba(80,180,255,0.4); }"
        )
        self._edit_banner.setVisible(False)
        root.addWidget(self._edit_banner)
        EditModeManager.instance().edit_mode_changed.connect(self._edit_banner.setVisible)

        self._tabbar = TabBar(self)
        self._tabbar.set_palette(self._palette)
        root.addWidget(self._tabbar)

        self._stack = QStackedWidget(self)
        root.addWidget(self._stack)

        self._tab_widgets: list[QWidget] = []
        for name in TABS:
            if name == "Options":
                import ui.theme as _theme
                w = OptionsTab(
                    self._opacity,
                    self._ct_opacity,
                    self._font_family,
                    self._palette_name,
                    self._corner_radius,
                    self._short_kamas,
                    self._fold_anchor_bottom,
                    initial_market_days=self._market_default_days,
                    initial_market_rate=self._market_territory_rate,
                    initial_font_title=self._settings.value("ui_font_title", _theme.FONT_TITLE, type=str),
                    initial_font_body=self._settings.value("ui_font_body",   _theme.FONT_BODY,  type=str),
                    initial_font_label=self._settings.value("ui_font_label", _theme.FONT_LABEL, type=str),
                    parent=self,
                )
                w.opacity_changed.connect(self.set_overlay_opacity)
                w.font_changed.connect(self.set_overlay_font_family)
                w.font_title_changed.connect(lambda f: self._set_font_role("title", f))
                w.font_body_changed.connect(lambda f:  self._set_font_role("body",  f))
                w.font_label_changed.connect(lambda f: self._set_font_role("label", f))
                w.palette_changed.connect(self.set_overlay_palette)
                w.shape_changed.connect(self.set_window_corner_radius)
                w.reset_requested.connect(self._on_reset_requested)
                w.kamas_corrected.connect(self._on_kamas_corrected)
                w.transactions_refresh_requested.connect(self._refresh_transactions_tab)
                w.short_numbers_changed.connect(self._on_short_kamas_changed)
                w.fold_anchor_changed.connect(self._on_fold_anchor_changed)
                w.ct_opacity_changed.connect(self._on_ct_opacity_changed)
                w.market_settings_changed.connect(self._on_market_settings_changed)
                w.xp_calibrated.connect(self._on_xp_calibrated)
                w.profession_xp_calibrated.connect(self._on_profession_xp_calibrated)
                w.profession_state_calibrated.connect(self._on_profession_state_calibrated)
                w.set_kamas(self._current_kamas)
                w.set_kamas_last_entry(get_last_correction_ts())
                w.set_log_start_date(get_permanent_log_start_ts())
                self._options_tab = w
            elif name == "Transactions":
                w = HdvTab(self)
                w.set_short_kamas(self._short_kamas)
                w.set_market_settings(self._market_default_days, self._market_territory_rate)
                self._hdv_tab = w
            elif name == "Personnage":
                w = PersonnageTab(self)
                self._personnage_tab = w
                w.gender_changed.connect(self._on_gender_changed)
            elif name == "Inventaire":
                w = InventaireTab(self)
                self._inventaire_tab = w
            elif name == "Combat":
                w = CombatTab(self)
                self._combat_tab = w
            elif name in ("Metier", "Metiers"):
                w = MetiersTab(self)
                self._metiers_tab = w
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

        self._stats_labels["hp"].setText("--")

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

    def _read_known_character_genders(self) -> dict[str, str]:
        data = self._read_config_json()
        mappings = data.get("known_character_genders")
        if not isinstance(mappings, dict):
            return {}
        out: dict[str, str] = {}
        for key, value in mappings.items():
            name = _normalize_character_name(str(key or ""))
            gender = str(value or "").strip().lower()
            if name and gender in ("type_0", "type_1"):
                out[name] = gender
        return out

    def _write_known_character_gender(self, character_name: str, gender: "str | None"):
        character_name = _normalize_character_name(character_name)
        if not character_name:
            return
        data = self._read_config_json()
        mappings = data.get("known_character_genders")
        if not isinstance(mappings, dict):
            mappings = {}
        if gender in ("type_0", "type_1"):
            mappings[character_name] = gender
        else:
            mappings.pop(character_name, None)
        data["known_character_genders"] = mappings
        self._write_config_json(data)

    def _read_known_character_vitals(self) -> dict[str, dict]:
        data = self._read_config_json()
        mappings = data.get("known_character_vitals")
        if not isinstance(mappings, dict):
            return {}
        out: dict[str, dict] = {}
        for key, value in mappings.items():
            name = _normalize_character_name(str(key or ""))
            if not name or not isinstance(value, dict):
                continue
            item: dict = {}
            for field in ("xp_gained", "xp_to_next", "level"):
                raw = value.get(field)
                try:
                    num = int(raw)
                except (TypeError, ValueError):
                    continue
                item[field] = num
            for field in ("xp_truth_ts", "hp_truth_ts"):
                raw = str(value.get(field) or "").strip()
                if raw:
                    item[field] = raw
            if item:
                out[name] = item
        return out

    def _write_known_character_vitals(self, character_name: str, patch: dict):
        name = _normalize_character_name(character_name)
        if not name:
            return
        data = self._read_config_json()
        mappings = data.get("known_character_vitals")
        if not isinstance(mappings, dict):
            mappings = {}

        current = mappings.get(name)
        if not isinstance(current, dict):
            current = {}

        changed = False
        for key, raw_val in patch.items():
            if key in ("xp_truth_ts", "hp_truth_ts"):
                val = str(raw_val or "").strip()
                if not val:
                    continue
            else:
                try:
                    val = int(raw_val)
                except (TypeError, ValueError):
                    continue
            if current.get(key) != val:
                current[key] = val
                changed = True

        if not changed:
            return

        mappings[name] = current
        data["known_character_vitals"] = mappings
        self._write_config_json(data)
        self._known_character_vitals[name] = {
            "xp_gained": int(current.get("xp_gained", 0) or 0),
            "xp_to_next": int(current.get("xp_to_next", 0) or 0),

            "level": int(current.get("level", 0) or 0),
            "xp_truth_ts": str(current.get("xp_truth_ts") or ""),
            "hp_truth_ts": str(current.get("hp_truth_ts") or ""),
        }

    def _restore_character_vitals(self, character_name: str | None):
        if not character_name:
            self._session_xp_gained = 0
            self._session_xp_at_start = 0
            self._last_xp_to_next = None
            self._session_combat_count = 0
            return

        name = _normalize_character_name(character_name)
        vitals = self._known_character_vitals.get(name, {})

        xp_gained = int(vitals.get("xp_gained", 0) or 0)
        xp_to_next = vitals.get("xp_to_next")
        level = vitals.get("level")
        xp_truth_ts = str(vitals.get("xp_truth_ts") or "").strip()

        self._session_xp_gained = max(0, xp_gained)
        self._last_xp_to_next = int(xp_to_next) if xp_to_next is not None else None
        self._session_combat_count = 0

        if level is not None and int(level) > 0:
            self._last_level = int(level)

        # Calibration XP (widget données) — source la plus fiable pour le niveau.
        try:
            cfg = self._read_config_json()
            calib_level = int(cfg.get("xp_calibration", {}).get("level", 0) or 0)
            if calib_level > (self._last_level or 0):
                self._last_level = calib_level
        except Exception:
            pass

        # Reconstruction retroactive depuis le point de calibration (heure de verite).
        if xp_truth_ts:
            replay = replay_character_xp_since(character_name, xp_truth_ts)
            delta = int(replay.get("xp_gained", 0) or 0)
            self._session_xp_gained = max(0, self._session_xp_gained + delta)
            xp_next_replay = replay.get("xp_to_next")
            if xp_next_replay is not None:
                self._last_xp_to_next = int(xp_next_replay)
            lvl_replay = replay.get("level")
            if lvl_replay is not None:
                self._last_level = int(lvl_replay)
            self._session_combat_count = int(replay.get("combat_count", 0) or 0)

        # Fallback: dernière valeur connue dans le journal permanent.
        try:
            sync_permanent_journal()
            info = query_character_info(character_name)
            if self._last_xp_to_next is None:
                xp_next = self._parse_int_token(str(info.get("last_xp_to_next", "")))
                if xp_next is not None:
                    self._last_xp_to_next = xp_next
            if self._last_level is None:
                lvl = self._parse_int_token(str(info.get("last_level", "")))
                if lvl is not None:
                    self._last_level = lvl
        except Exception:
            pass

        # Temps joué — ancre depuis la dernière entrée /played du journal.
        self._played_seconds_anchor = None
        self._played_anchor_ts = None
        try:
            played = query_played_time()
            if played is not None:
                from core.permanent_journal import _parse_local_iso as _pli
                from datetime import timezone as _tz
                secs = int(played["seconds"])
                anchor_dt = _pli(played["ts_local"])
                if anchor_dt is not None:
                    # Calcul de l'offset entre l'ancre et maintenant
                    import datetime as _dt
                    now_utc = _dt.datetime.now(_tz.utc)
                    anchor_utc = anchor_dt.replace(tzinfo=_tz.utc) if anchor_dt.tzinfo is None else anchor_dt
                    elapsed_since_anchor = max(0, int((now_utc - anchor_utc).total_seconds()))
                    self._played_seconds_anchor = secs + elapsed_since_anchor
                    self._played_anchor_ts = QDateTime.currentDateTime()
        except Exception:
            pass

        # Baseline pour calcul du taux XP/h depuis ce chargement
        self._session_xp_at_start = self._session_xp_gained
        self._t0 = QDateTime.currentDateTime()

    def _on_gender_changed(self, gender: "str | None"):
        name = self._current_character_name
        if name:
            self._write_known_character_gender(name, gender)

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
        self._tracker.character_changed.connect(self._on_character_changed)
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
        sync_permanent_journal()
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
            conn_status = True if self._game_state == GameState.IN_GAME else (None if self._game_state == GameState.SELECTING else False)
            self._personnage_tab.set_connection_status(conn_status)
            if self._last_detected_class:
                self._personnage_tab.set_class_icon(self._last_detected_class)
                # Icône dans la barre repliée
                from PyQt5.QtGui import QPixmap as _QPixmap
                from pathlib import Path as _Path
                _icons_dir = _Path(__file__).resolve().parents[1] / "wakassets" / "breedsIcons"
                from ui.titlebar import _CLASS_TO_ID, _normalize_class_key
                _bid = _CLASS_TO_ID.get(_normalize_class_key(self._last_detected_class), 4)
                _icon_file = _icons_dir / f"{_bid}.png"
                if _icon_file.exists():
                    self._titlebar.set_folded_class_icon(_QPixmap(str(_icon_file)))
            if self._current_character_name:
                known_genders = self._read_known_character_genders()
                name_key = _normalize_character_name(self._current_character_name)
                self._personnage_tab.set_gender(known_genders.get(name_key))
            # XP bar — progress absolu dans le niveau
            xp_gained  = self._session_xp_gained or 0
            xp_to_next = self._last_xp_to_next or 0
            xp_total   = xp_gained + xp_to_next
            self._personnage_tab.set_xp(xp_gained, xp_total if xp_total > 0 else 1)
            # Taux XP/h et temps restant : XP gagné depuis le chargement du perso uniquement
            elapsed_s = max(0, int(self._elapsed_seconds))
            xp_since_load = max(0, xp_gained - self._session_xp_at_start)
            self._personnage_tab.set_xp_remaining(xp_to_next, xp_since_load, elapsed_s)

        # Temps joué sur ce personnage
        if self._personnage_tab is not None:
            if self._played_seconds_anchor is not None and self._played_anchor_ts is not None:
                extra = max(0, self._played_anchor_ts.secsTo(QDateTime.currentDateTime()))
                total_played = self._played_seconds_anchor + extra
            else:
                total_played = None
            self._personnage_tab.set_played_time(total_played)

        if self._combat_tab is not None and self._current_character_name:
            self._combat_tab.set_character_name(self._current_character_name)

        # ── Métriques épinglées → TitleBar (mode replié) ─────────────────
        for widget in self._tab_widgets:
            if isinstance(widget, HdvTab):
                self._titlebar.set_folded_metrics(widget.get_pinned_metrics())
                break

        self._refresh_stats_panel()

    def _refresh_transactions_tab(self):
        for widget in self._tab_widgets:
            if isinstance(widget, HdvTab):
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

            # ── Whois (serveur) ──────────────────────────────────────────
            whois_m = _WHOIS_RE.search(raw_line)
            if whois_m:
                server = whois_m.group(2).strip()
                if server and server != self._last_server:
                    self._last_server = server
                    if self._personnage_tab is not None:
                        self._personnage_tab.set_server(
                            server, self._unique_players,
                            getattr(self, "_log_start_date", None)
                        )

            # ── Inventaire (ramassage / pertes) ──────────────────────────
            if self._inventaire_tab is not None:
                item_m = _ITEM_GAIN_LOOT_RE_WIN.search(raw_line)
                if item_m:
                    qty  = self._parse_int_token(item_m.group(1)) or 1
                    name = item_m.group(2).strip().rstrip(".")
                    if name:
                        self._inventaire_tab.on_item_gained(name, qty)
                else:
                    item_loss_m = _ITEM_LOSS_RE_WIN.search(raw_line)
                    if item_loss_m:
                        qty  = self._parse_int_token(item_loss_m.group(1)) or 1
                        name = item_loss_m.group(2).strip().rstrip(".")
                        if name:
                            self._inventaire_tab.on_item_lost(name, qty)

            # ── XP Métier ────────────────────────────────────────────────
            xp_prof_m = _XP_PROF_RE.search(raw_line)
            if xp_prof_m:
                prof_name  = xp_prof_m.group(1).strip()
                xp_gain    = self._parse_int_token(xp_prof_m.group(2))
                xp_to_next = self._parse_int_token(xp_prof_m.group(3))
                if prof_name and xp_gain and self._metiers_tab is not None:
                    self._metiers_tab.on_xp_profession(prof_name, xp_gain, xp_to_next or 0)

            # ── Événements filtrés par nom de personnage ─────────────────
            if target_name is None:
                continue

            # ── Feed combat tab + tracking attaquant ─────────────────────
            spell_m = _SPELL_CAST_RE.search(raw_line)
            if spell_m:
                caster = _normalize_character_name(spell_m.group(1)).lower()
                if caster == target_name:
                    if self._combat_tab is not None:
                        self._combat_tab.on_spell_cast(spell_m.group(2).strip())
                    if self._personnage_tab is not None:
                        self._personnage_tab.on_spell_cast(spell_m.group(2).strip())
                else:
                    # Sort d'un monstre → mémoriser comme attaquant courant
                    self._combat_last_attacker = spell_m.group(1).strip()

            hp_loss_m = _HP_LOSS_RE_COMBAT.search(raw_line)
            if hp_loss_m:
                victim = _normalize_character_name(hp_loss_m.group(1)).lower()
                if victim == target_name and self._combat_last_attacker:
                    amt = self._parse_int_token(hp_loss_m.group(2)) or 0
                    atk = self._combat_last_attacker
                    self._combat_damage_by[atk] = self._combat_damage_by.get(atk, 0) + amt
                    if self._combat_tab is not None:
                        self._combat_tab.on_player_damage(atk, amt)
                    if self._personnage_tab is not None:
                        self._personnage_tab.on_player_damage(atk, amt)

            ko_m = _KO_RE_COMBAT.search(raw_line)
            death_m2 = _DEATH_RE_COMBAT.search(raw_line)
            for m in (ko_m, death_m2):
                if m:
                    victim = _normalize_character_name(m.group(1)).lower()
                    if victim == target_name and self._combat_last_attacker:
                        atk = self._combat_last_attacker
                        self._combat_killed_by[atk] = self._combat_killed_by.get(atk, 0) + 1
                        if self._combat_tab is not None:
                            self._combat_tab.on_player_killed_by(atk)
                        if self._personnage_tab is not None:
                            self._personnage_tab.on_player_killed_by(atk)

            xp_match = _COMBAT_XP_RE.search(raw_line)
            if xp_match:
                caster = _normalize_character_name(xp_match.group(1)).lower()
                if caster == target_name:
                    xp_gain = self._parse_int_token(xp_match.group(2))
                    xp_to_next = self._parse_int_token(xp_match.group(3))
                    if xp_gain is not None and xp_gain != self._last_xp_gain:
                        self._session_xp_gained += xp_gain
                        self._session_combat_count += 1
                        self._last_xp_gain = xp_gain
                        if self._current_character_name:
                            vitals = self._known_character_vitals.get(
                                _normalize_character_name(self._current_character_name),
                                {},
                            )
                            if not str(vitals.get("xp_truth_ts") or "").strip():
                                self._write_known_character_vitals(
                                    self._current_character_name,
                                    {"xp_gained": self._session_xp_gained},
                                )
                        changed = True
                        if self._combat_tab is not None:
                            self._combat_tab.on_xp_combat(xp_gain, xp_to_next or 0)
                        if self._personnage_tab is not None:
                            self._personnage_tab.on_xp_combat(xp_gain, xp_to_next or 0)
                    if xp_to_next is not None and xp_to_next != self._last_xp_to_next:
                        self._last_xp_to_next = xp_to_next
                        if self._current_character_name:
                            self._write_known_character_vitals(
                                self._current_character_name,
                                {"xp_to_next": self._last_xp_to_next},
                            )
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
                        if self._current_character_name:
                            self._write_known_character_vitals(
                                self._current_character_name,
                                {"level": self._last_level},
                            )
                        changed = True

            played_m = _PLAYED_LOG_RE.search(raw_line)
            if played_m:
                from core.permanent_journal import _parse_played_seconds as _pps
                secs = _pps(played_m.group(1))
                if secs is not None:
                    self._played_seconds_anchor = secs
                    self._played_anchor_ts = QDateTime.currentDateTime()

        if not self._runtime_kama_reliable:
            computed_kamas = self._base_kamas + self._manual_kamas_delta + self._runtime_kamas_delta
            if computed_kamas >= 0 and computed_kamas != self._current_kamas:
                self._current_kamas = computed_kamas
                changed = True

        if changed:
            self._refresh_title_info()

    def _load_kamas_config_values(self):
        sync_permanent_journal()
        data = self._read_config_json()
        self._known_character_vitals = self._read_known_character_vitals()
        self._onboarding_done = bool(data.get("onboarding_done", False))
        self._market_default_days = int(data.get("market_default_days", 28) or 28)
        self._market_territory_rate = int(data.get("market_territory_rate", 5) or 5)

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
        if level_value is not None and level_value > 0 and level_value != self._last_level:
            # Le niveau ne peut jamais régresser — ignore les valeurs inférieures au niveau connu.
            if level_value >= (self._last_level or 0):
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

        # hp_percent tracking removed - no longer persistent

        if self._last_level is not None and self._current_character_name:
            self._write_known_character_vitals(
                self._current_character_name,
                {"level": self._last_level},
            )

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

        breed_id      = state.get("breed_id")
        breed_char    = state.get("character_name")   # perso auquel appartient ce breed_id
        class_key     = state.get("class_key")

        # N'utiliser breed_id que s'il appartient explicitement au personnage actif.
        # Un log peut contenir des _FL_ d'autres joueurs dans le même combat.
        cur = _normalize_character_name(self._current_character_name or "").lower()
        breed_belongs = (
            breed_char is not None
            and _normalize_character_name(str(breed_char)).lower() == cur
        )

        if not class_key and self._current_character_name:
            class_key = self._read_known_character_classes().get(self._current_character_name)
        if not class_key and breed_id is not None and breed_belongs:
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
            if self._personnage_tab is not None:
                self._personnage_tab.set_class_icon(class_key)
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
        if self._game_state != GameState.OFFLINE:
            self._game_state = GameState.OFFLINE
            self._current_character_name = None
            self._session_connected = False
            self._last_detected_class = None
            self._last_level = None
            if self._personnage_tab is not None:
                self._personnage_tab.set_game_state(GameState.OFFLINE)
            self._refresh_title_info()
        self.hide()
        self._update_click_unlock_button_visibility()

    def _on_character_changed(self, name: str):
        """Déclenché dès que le titre de la fenêtre Wakfu change."""
        new_state = GameState.IN_GAME if name else GameState.SELECTING
        name_changed = (name or None) != self._current_character_name
        state_changed = new_state != self._game_state

        if not name_changed and not state_changed:
            return

        self._game_state = new_state
        self._current_character_name = name or None
        self._session_connected = (new_state == GameState.IN_GAME)

        # Toujours effacer l'état du perso précédent (changement de perso OU écran sélection)
        self._last_detected_class = None
        self._last_level = None
        self._last_xp_gain = None
        self._restore_character_vitals(self._current_character_name)

        if new_state == GameState.IN_GAME and name:
            _dbg = [f"_on_character_changed name={name!r} repr={[hex(ord(c)) for c in name[:8]]}"]
            # 1. Cache config.json
            cached_class = self._read_known_character_classes().get(name)
            _dbg.append(f"cache={cached_class!r}")
            if cached_class:
                self._last_detected_class = cached_class
            else:
                # 2. Journal permanent : breed_id ou sort déjà observé
                sync_permanent_journal()
                perm = query_character_info(name)
                _dbg.append(f"perm={perm}")
                resolved = None
                if perm.get("breed_id") is not None:
                    resolved = _BREED_TO_CLASS.get(int(perm["breed_id"]))
                if not resolved and perm.get("last_spell"):
                    resolved = OverlayWindow._infer_class_from_spell(perm["last_spell"])
                _dbg.append(f"resolved={resolved!r}")
                if resolved:
                    self._last_detected_class = resolved
                    self._write_known_character_class(name, resolved)
                else:
                    self._log_read_pos = 0
            try:
                (_PROJECT_ROOT / "logs" / "debug_char.txt").write_text(
                    "\n".join(_dbg), encoding="utf-8"
                )
            except Exception:
                pass

        if self._personnage_tab is not None:
            self._personnage_tab.set_game_state(new_state)
            if self._last_detected_class:
                self._personnage_tab.set_class_icon(self._last_detected_class)
            else:
                self._personnage_tab.clear_class_icon()

        self._refresh_title_info()

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

    # ── Bibliothèque de widgets (F1 en mode Édition) ──────────────────────────

    def _toggle_library_panel(self):
        if self._library_panel is None:
            self._create_library_panel()
        if self._library_panel.isVisible():
            self._library_panel.hide()
        else:
            self._position_library_panel()
            self._library_panel.show()
            self._library_panel.raise_()
            from ui.drag_editor import EditModeManager
            self._library_panel.refresh_states(EditModeManager.instance()._sections)

    def _hide_library_panel(self):
        if self._library_panel is not None:
            self._library_panel.hide()

    def _create_library_panel(self):
        from ui.widget_library import WidgetLibraryPanel
        panel = WidgetLibraryPanel(parent=self)
        panel.xp_style_changed.connect(self._on_library_xp_style)
        panel.section_toggle.connect(self._on_library_section_toggle)
        self._library_panel = panel

    def _position_library_panel(self):
        if self._library_panel is None:
            return
        pw = self._library_panel.width()
        ph = self.height() - self._titlebar.height() - 10
        self._library_panel.setFixedHeight(max(200, ph))
        self._library_panel.move(self.width() - pw - 8, self._titlebar.height() + 5)

    def _on_library_xp_style(self, idx: int):
        if self._personnage_tab is not None:
            self._personnage_tab.set_xp_style(idx)

    def _on_library_section_toggle(self, section_id: str, visible: bool):
        from ui.drag_editor import EditModeManager
        mgr = EditModeManager.instance()
        for s in mgr._sections:
            if s._id == section_id:
                if visible:
                    s.show()
                else:
                    s.hide()
                break
        mgr.save_visibility(section_id, visible)
        # Quand on active le ring de niveau, masquer la barre XP (et vice-versa)
        if section_id == "p.level_ring" and visible:
            for s in mgr._sections:
                if s._id == "p.xpbar":
                    s.hide()
                    if self._library_panel:
                        self._library_panel.refresh_states(mgr._sections)
                    break
        elif section_id == "p.xpbar" and visible:
            for s in mgr._sections:
                if s._id == "p.level_ring":
                    s.hide()
                    if self._library_panel:
                        self._library_panel.refresh_states(mgr._sections)
                    break

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

    def _set_font_role(self, role: str, family: str):
        if not family:
            return
        import ui.theme as _theme
        if role == "title":
            _theme.FONT_TITLE = family
        elif role == "body":
            _theme.FONT_BODY = family
        elif role == "label":
            _theme.FONT_LABEL = family
        self._settings.setValue(f"ui_font_{role}", family)
        if self._personnage_tab is not None:
            self._personnage_tab.refresh_fonts()

    def _load_journal_history(self):
        """Charge serveur + XP métiers depuis le log permanent au démarrage."""
        try:
            server = query_last_server()
            unique = query_unique_chat_authors()
            log_start = query_log_start_date()
            self._unique_players = unique
            self._log_start_date = log_start
            if server:
                self._last_server = server
                if self._personnage_tab is not None:
                    self._personnage_tab.set_server(server, unique, log_start)
        except Exception:
            pass
        try:
            prof_data = query_profession_tracking()
            if prof_data and self._metiers_tab is not None:
                self._metiers_tab.load_history(prof_data)
        except Exception:
            pass
        try:
            from core.permanent_journal import query_combat_stats
            combat_data = query_combat_stats(self._current_character_name)
            if self._combat_tab is not None:
                self._combat_tab.load_history(combat_data)
                if self._current_character_name:
                    self._combat_tab.set_character_name(self._current_character_name)
            if self._personnage_tab is not None:
                self._personnage_tab.load_combat_history(combat_data)
        except Exception:
            pass
        try:
            inv_data = query_inventory()
            if inv_data and self._inventaire_tab is not None:
                self._inventaire_tab.load_history(inv_data)
        except Exception:
            pass

    def _on_xp_calibrated(self, level: int, xp_total: int, xp_gained: int):
        self._session_xp_gained = max(0, int(xp_gained))
        self._last_xp_to_next = max(0, int(xp_total) - int(xp_gained))
        if self._current_character_name:
            self._write_known_character_vitals(
                self._current_character_name,
                {
                    "level": int(level),
                    "xp_gained": self._session_xp_gained,
                    "xp_to_next": self._last_xp_to_next,
                    "xp_truth_ts": now_ms_iso(),
                },
            )
        self._write_config_patch({
            "xp_calibration": {
                "level": level,
                "xp_total": xp_total,
                "xp_gained": xp_gained,
            }
        })
        self._refresh_title_info()



    def _on_profession_xp_calibrated(self, profession: str, xp_gain: int, xp_to_next: int):
        if self._metiers_tab is not None:
            self._metiers_tab.on_xp_profession(profession, int(xp_gain), int(xp_to_next))

    def _on_profession_state_calibrated(self, profession: str, level: int, xp_gain: int, xp_to_next: int):
        if self._metiers_tab is not None:
            self._metiers_tab.apply_profession_calibration(
                profession,
                int(level),
                int(xp_gain),
                int(xp_to_next),
            )
        # Update player level
        if int(level) > 0:
            self._last_level = int(level)

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
            if isinstance(widget, HdvTab):
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

    def _on_market_settings_changed(self, days: int, rate: int):
        self._market_default_days = days
        self._market_territory_rate = rate
        data = self._read_config_json()
        data["market_default_days"] = days
        data["market_territory_rate"] = rate
        self._write_config_json(data)
        for widget in self._tab_widgets:
            if isinstance(widget, HdvTab):
                widget.set_market_settings(days, rate)

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
            if self.rect().contains(lpos):
                edge = _edge_at(lpos, self.width(), self.height())
                if self._folded:
                    edge &= (_L | _R)   # only horizontal resize when folded
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
            if self.rect().contains(lpos) and not (event.buttons() & Qt.LeftButton):
                edge = _edge_at(lpos, self.width(), self.height())
                if self._folded:
                    edge &= (_L | _R)
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

        elif t == QEvent.KeyPress and event.key() == Qt.Key_F11:
            from ui.drag_editor import EditModeManager
            mgr = EditModeManager.instance()
            mgr.toggle()
            if not mgr.active:
                self._hide_library_panel()
            return True

        elif t == QEvent.KeyPress and event.key() == Qt.Key_F1:
            from ui.drag_editor import EditModeManager
            if EditModeManager.instance().active:
                self._toggle_library_panel()
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
            edge = _edge_at(pos, self.width(), self.height()) & (_L | _R)
            self.setCursor(_CURSORS.get(edge, Qt.ArrowCursor))
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
        from ui.drag_editor import EditModeManager
        EditModeManager.instance().resize_all()

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
