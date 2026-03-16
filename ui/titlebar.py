# ui/titlebar.py — Barre de titre custom (drag, pin, fold, close)

from pathlib import Path
import zipfile

from PyQt5.QtWidgets import QWidget, QHBoxLayout, QLabel, QPushButton
from PyQt5.QtCore    import Qt, pyqtSignal, QSize
from PyQt5.QtGui     import QPainter, QColor, QPen, QIcon, QLinearGradient, QPixmap

from ui.theme import (
    BG_PANEL, TEAL, TEAL_BRIGHT, TEXT, TEXT_DIM, BORDER, RED, GREEN
)

HEIGHT = 40
_ICON_DIR = Path(__file__).resolve().parent / "assets" / "titlebar"
_PROJECT_ROOT = Path(__file__).resolve().parents[1]
_CLASS_ICON_CACHE_DIR = _PROJECT_ROOT / "data" / "ankama_cdn" / "class_icons"
_ZAAP_WAKFU_ICON = Path.home() / "AppData" / "Roaming" / "zaap" / "repositories" / "production" / "wakfu" / "main" / "data" / "icon.png"
_WAKFU_INSTALL_ROOT = Path("H:/Games/Wakfu")
_WAKFU_GUI_JAR = _WAKFU_INSTALL_ROOT / "contents" / "gui_jar" / "gui.jar"

_CLASS_TO_ID = {
    "feca": 1,
    "osamodas": 2,
    "enutrof": 3,
    "sram": 4,
    "xelor": 5,
    "ecaflip": 6,
    "eniripsa": 7,
    "iop": 8,
    "cra": 9,
    "sadida": 10,
    "sacrier": 11,
    "pandawa": 12,
    "rogue": 13,
    "masqueraider": 14,
    "ouginak": 15,
    "foggernaut": 16,
    "elio": 18,
    "huppermage": 19,
}


def _normalize_class_key(value: str) -> str:
    key = (value or "").strip().lower().replace(" ", "-")
    aliases = {
        "steam": "foggernaut",
        "zobal": "masqueraider",
        "enu": "enutrof",
        "eca": "ecaflip",
        "eni": "eniripsa",
        "sacri": "sacrier",
        "osa": "osamodas",
    }
    return aliases.get(key, key or "iop")


def _class_icon_candidates(class_key: str) -> list[str]:
    key = _normalize_class_key(class_key)
    cid = _CLASS_TO_ID.get(key, 4)
    return [
        f"icons/popupIcons/breed{cid}.tga",
        f"breeds/icons/small/{cid}.tga",
        f"breeds/icons/Hud/{cid}.tga",
        f"breeds/icons/Big/{cid}.tga",
    ]


def _breed_icon_candidates(breed_id: int) -> list[str]:
    bid = int(breed_id)
    return [
        f"icons/popupIcons/breed{bid}.tga",
        f"breeds/icons/small/{bid}.tga",
        f"breeds/icons/Hud/{bid}.tga",
        f"breeds/icons/Big/{bid}.tga",
    ]


def _extract_icon_from_wakfu_install(class_key: str, target_path: Path) -> bool:
    if not _WAKFU_GUI_JAR.exists():
        return False

    try:
        with zipfile.ZipFile(_WAKFU_GUI_JAR, "r") as zf:
            for entry in _class_icon_candidates(class_key):
                try:
                    data = zf.read(entry)
                except KeyError:
                    continue
                if len(data) < 128:
                    continue
                target_path.parent.mkdir(parents=True, exist_ok=True)
                target_path.write_bytes(data)
                return True
    except OSError:
        return False

    return False


def _extract_icon_from_wakfu_install_by_breed_id(breed_id: int, target_path: Path) -> bool:
    if not _WAKFU_GUI_JAR.exists():
        return False

    try:
        with zipfile.ZipFile(_WAKFU_GUI_JAR, "r") as zf:
            for entry in _breed_icon_candidates(breed_id):
                try:
                    data = zf.read(entry)
                except KeyError:
                    continue
                if len(data) < 128:
                    continue
                target_path.parent.mkdir(parents=True, exist_ok=True)
                target_path.write_bytes(data)
                return True
    except OSError:
        return False

    return False


class _TitleBtn(QPushButton):
    """Bouton compact pour la barre de titre."""

    def __init__(self, icon_name: str, tooltip: str = "", danger: bool = False):
        super().__init__("")
        self.setFixedSize(28, 28)
        self.setIcon(QIcon(str(_ICON_DIR / icon_name)))
        self.setIconSize(QSize(16, 16))
        self.setToolTip(tooltip)
        self._danger  = danger
        self._active  = False
        self._palette = {
            "TEAL": TEAL,
            "TEAL_BRIGHT": TEAL_BRIGHT,
            "TEXT": TEXT,
            "TEXT_DIM": TEXT_DIM,
            "RED": RED,
        }
        self._refresh_style()

    def set_palette(self, palette: dict[str, str]):
        self._palette = {
            **self._palette,
            **palette,
        }
        self._refresh_style()

    def set_active(self, active: bool):
        self._active = active
        self._refresh_style()

    def _refresh_style(self):
        teal = self._palette.get("TEAL", TEAL)
        teal_bright = self._palette.get("TEAL_BRIGHT", TEAL_BRIGHT)
        text = self._palette.get("TEXT", TEXT)
        text_dim = self._palette.get("TEXT_DIM", TEXT_DIM)
        red = self._palette.get("RED", RED)
        if self._danger:
            self.setStyleSheet(f"""
                QPushButton {{
                    background: transparent; border: none;
                    color: {text_dim}; border-radius: 10px;
                }}
                QPushButton:hover {{
                    background: rgba(224,80,80,0.18); color: {red};
                }}
            """)
        elif self._active:
            self.setStyleSheet(f"""
                QPushButton {{
                    background: rgba(30,180,176,0.18);
                    border: 1px solid {teal};
                    color: {teal}; border-radius: 10px;
                }}
                QPushButton:hover {{
                    background: rgba(30,180,176,0.28); color: {teal_bright};
                }}
            """)
        else:
            self.setStyleSheet(f"""
                QPushButton {{
                    background: transparent; border: none;
                    color: {text_dim}; border-radius: 10px;
                }}
                QPushButton:hover {{
                    background: rgba(255,255,255,0.07); color: {text};
                }}
            """)


class TitleBar(QWidget):
    """
    Barre de titre draggable.

    Signaux :
        fold_toggled(bool)   — True = replié
        pin_toggled(bool)    — True = position verrouillée
        close_requested()

    Déplié  : logo Enutrium + nom de l'appli.
    Replié  : métriques compactes (gains / pertes / net / kamas).
    """

    fold_toggled          = pyqtSignal(bool)
    pin_toggled           = pyqtSignal(bool)
    click_through_toggled = pyqtSignal(bool)
    close_requested       = pyqtSignal()

    def __init__(self, parent=None):
        super().__init__(parent)
        self.setFixedHeight(HEIGHT)
        self.setCursor(Qt.SizeAllCursor)

        self._pinned       = False
        self._folded       = False
        self._click_through = False
        self._palette = {
            "BG_PANEL":    BG_PANEL,
            "TEAL":        TEAL,
            "TEAL_BRIGHT": TEAL_BRIGHT,
            "TEXT":        TEXT,
            "TEXT_DIM":    TEXT_DIM,
            "RED":         RED,
            "GREEN":       GREEN,
        }

        lay = QHBoxLayout(self)
        lay.setContentsMargins(12, 0, 8, 0)
        lay.setSpacing(6)

        # ── Identité app (visible quand déplié) ───────────────────────────
        self._enutrium_icon = QLabel()
        self._enutrium_icon.setFixedSize(28, 28)
        self._enutrium_icon.setScaledContents(False)
        _enu_pix = QPixmap(str(_ICON_DIR / "Enutrium.png"))
        if not _enu_pix.isNull():
            self._enutrium_icon.setPixmap(
                _enu_pix.scaled(28, 28, Qt.KeepAspectRatio, Qt.SmoothTransformation)
            )

        self._lbl = QLabel("Enutrium")

        # ── Métriques compactes (visible quand replié) ────────────────────
        self._metrics_row = QWidget()
        _m_lay = QHBoxLayout(self._metrics_row)
        _m_lay.setContentsMargins(0, 0, 0, 0)
        _m_lay.setSpacing(14)

        self._m_gains  = QLabel("↑  —")
        self._m_losses = QLabel("↓  —")
        self._m_net    = QLabel("~  —")
        self._m_kamas  = QLabel("⬟  —")
        for _m in (self._m_gains, self._m_losses, self._m_net, self._m_kamas):
            _m_lay.addWidget(_m)

        self._metrics_row.setVisible(False)

        lay.addWidget(self._enutrium_icon)
        lay.addSpacing(2)
        lay.addWidget(self._lbl)
        lay.addSpacing(8)
        lay.addWidget(self._metrics_row)
        lay.addStretch()

        # ── Boutons ───────────────────────────────────────────────────────
        self._btn_pin   = _TitleBtn("pin.svg",          "Fixer / déverrouiller la position")
        self._btn_click = _TitleBtn("clickthrough.svg", "Activer / désactiver le clic à travers")
        self._btn_fold  = _TitleBtn("chevron_down.svg", "Réduire / déplier")
        self._btn_close = _TitleBtn("close.svg",        "Fermer", danger=True)

        self._btn_pin.clicked.connect(self._toggle_pin)
        self._btn_click.clicked.connect(self._toggle_click_through)
        self._btn_fold.clicked.connect(self._toggle_fold)
        self._btn_close.clicked.connect(self.close_requested.emit)

        lay.addWidget(self._btn_pin)
        lay.addWidget(self._btn_click)
        lay.addWidget(self._btn_fold)
        lay.addWidget(self._btn_close)
        self.set_palette(self._palette)

    # ── API publique ───────────────────────────────────────────────

    def set_info(self, text: str):
        """No-op : les infos session sont désormais dans PersonnageTab / OptionsTab."""

    def set_class_icon(self, class_key: str):
        """No-op : l'icône de classe est désormais dans PersonnageTab."""

    def set_class_icon_by_breed_id(self, breed_id: int):
        """No-op : l'icône de classe est désormais dans PersonnageTab."""

    def set_folded_metrics(self, gains: int, losses: int, net: int, kamas: int):
        """Met à jour les métriques compactes affichées quand la barre est repliée."""
        def _fmt(v: int) -> str:
            av = abs(v)
            if av >= 1_000_000:
                return f"{v / 1_000_000:.1f}M ₭"
            if av >= 1_000:
                return f"{v / 1_000:.0f}K ₭"
            return f"{v:,} ₭".replace(",", "\u202f")

        self._m_gains.setText(f"↑ {_fmt(gains)}")
        self._m_losses.setText(f"↓ {_fmt(losses)}")
        sign = "+" if net >= 0 else ""
        self._m_net.setText(f"~ {sign}{_fmt(net)}")
        self._m_kamas.setText(f"⬟ {_fmt(kamas)}")

    @property
    def is_pinned(self) -> bool:
        return self._pinned

    def set_click_through(self, enabled: bool):
        self._click_through = bool(enabled)
        self._btn_click.set_active(self._click_through)

    @property
    def is_click_through(self) -> bool:
        return self._click_through

    def set_palette(self, palette: dict[str, str]):
        self._palette = {
            **self._palette,
            **palette,
        }
        teal     = self._palette.get("TEAL",     TEAL)
        text     = self._palette.get("TEXT",     TEXT)
        text_dim = self._palette.get("TEXT_DIM", TEXT_DIM)
        green    = self._palette.get("GREEN",    GREEN)
        red      = self._palette.get("RED",      RED)

        self._lbl.setStyleSheet(
            f"color: {teal}; font-weight: 800; font-size: 13px; letter-spacing: 1px;"
        )
        self._enutrium_icon.setStyleSheet("background: transparent;")
        self._m_gains.setStyleSheet( f"color: {green};    font-size: 11px; font-weight: 700;")
        self._m_losses.setStyleSheet(f"color: {red};      font-size: 11px; font-weight: 700;")
        self._m_net.setStyleSheet(   f"color: {teal};     font-size: 11px; font-weight: 700;")
        self._m_kamas.setStyleSheet( f"color: {text_dim}; font-size: 11px; font-weight: 700;")

        self._btn_pin.set_palette(self._palette)
        self._btn_click.set_palette(self._palette)
        self._btn_fold.set_palette(self._palette)
        self._btn_close.set_palette(self._palette)
        self.update()

    # ── Slots internes ─────────────────────────────────────────────

    def _toggle_pin(self):
        self._pinned = not self._pinned
        self._btn_pin.set_active(self._pinned)
        self.pin_toggled.emit(self._pinned)

    def _toggle_fold(self):
        self._folded = not self._folded
        self._btn_fold.setIcon(
            QIcon(str(_ICON_DIR / ("chevron_up.svg" if self._folded else "chevron_down.svg")))
        )
        # Basculer entre identité app et métriques
        self._enutrium_icon.setVisible(not self._folded)
        self._lbl.setVisible(not self._folded)
        self._metrics_row.setVisible(self._folded)
        self.fold_toggled.emit(self._folded)

    def _toggle_click_through(self):
        self._click_through = not self._click_through
        self._btn_click.set_active(self._click_through)
        self.click_through_toggled.emit(self._click_through)

    # ── Rendu ──────────────────────────────────────────────────────

    def paintEvent(self, _event):
        p = QPainter(self)
        # Fond
        base = QColor(self._palette.get("BG_PANEL", BG_PANEL))
        top = QColor(base).lighter(108)
        grad = QLinearGradient(0, 0, 0, self.height())
        grad.setColorAt(0.0, top)
        grad.setColorAt(1.0, base)
        p.fillRect(self.rect(), grad)
        # Ligne teal en bas
        p.setPen(QPen(QColor(self._palette.get("TEAL", TEAL)), 1))
        y = self.height() - 1
        p.drawLine(0, y, self.width(), y)
