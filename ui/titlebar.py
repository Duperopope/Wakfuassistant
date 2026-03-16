# ui/titlebar.py — Barre de titre custom (drag, pin, fold, close)

from pathlib import Path
import re as _re
import zipfile

from PyQt5.QtWidgets import QWidget, QHBoxLayout, QLabel, QPushButton, QToolTip
from PyQt5.QtCore    import Qt, pyqtSignal, QSize, QByteArray, QEvent
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


def _tinted_icon(svg_path: str, color: str, size: int = 16) -> QIcon:
    """Charge un SVG, remplace toutes les couleurs hex par `color`, retourne un QIcon."""
    try:
        data = Path(svg_path).read_text(encoding="utf-8")
        data = _re.sub(r"#[0-9A-Fa-f]{6}", color, data)
        pix = QPixmap()
        if pix.loadFromData(QByteArray(data.encode()), b"SVG"):
            return QIcon(pix.scaled(size, size, Qt.KeepAspectRatio, Qt.SmoothTransformation))
    except Exception:
        pass
    return QIcon(svg_path)


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
        self.setIconSize(QSize(16, 16))
        self.setToolTip(tooltip)
        self._danger   = danger
        self._active   = False
        self._svg_path = str(_ICON_DIR / icon_name)
        self._palette  = {
            "TEAL":        TEAL,
            "TEAL_BRIGHT": TEAL_BRIGHT,
            "TEXT":        TEXT,
            "TEXT_DIM":    TEXT_DIM,
            "RED":         RED,
        }
        self._refresh_style()

    def set_palette(self, palette: dict[str, str]):
        self._palette = {**self._palette, **palette}
        self._refresh_style()

    def set_active(self, active: bool):
        self._active = active
        self._refresh_style()

    def update_icon(self, icon_name: str):
        """Remplace l'icône SVG et rafraîchit la couleur."""
        self._svg_path = str(_ICON_DIR / icon_name)
        self._refresh_style()

    def _refresh_style(self):
        teal_bright = self._palette.get("TEAL_BRIGHT", TEAL_BRIGHT)
        text_dim    = self._palette.get("TEXT_DIM",    TEXT_DIM)
        red         = self._palette.get("RED",         RED)

        # Icône colorée selon l'état (pas de boîte / bordure)
        if self._danger:
            icon_color = red if self._active else text_dim
        elif self._active:
            icon_color = teal_bright
        else:
            icon_color = text_dim

        self.setIcon(_tinted_icon(self._svg_path, icon_color))

        # Fond au survol uniquement
        if self._danger:
            self.setStyleSheet(f"""
                QPushButton {{
                    background: transparent; border: none; border-radius: 10px;
                }}
                QPushButton:hover {{
                    background: rgba(224,80,80,0.14);
                }}
            """)
        else:
            self.setStyleSheet(f"""
                QPushButton {{
                    background: transparent; border: none; border-radius: 10px;
                }}
                QPushButton:hover {{
                    background: rgba(255,255,255,0.07);
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
        self._metrics_layout = QHBoxLayout(self._metrics_row)
        self._metrics_layout.setContentsMargins(0, 0, 0, 0)
        self._metrics_layout.setSpacing(14)

        # Pool de 5 labels réutilisables (évite la création dynamique à chaque tick)
        self._metric_labels: list[QLabel] = []
        for _ in range(5):
            lbl = QLabel()
            lbl.setVisible(False)
            lbl.setMouseTracking(True)
            lbl.installEventFilter(self)
            self._metrics_layout.addWidget(lbl)
            self._metric_labels.append(lbl)

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

    def set_folded_metrics(self, items: "list[tuple]"):
        """Met à jour les métriques compactes.
        items = [(texte, couleur_hex), …] ou [(texte, couleur_hex, tooltip), …]"""
        for i, lbl in enumerate(self._metric_labels):
            if i < len(items):
                entry = items[i]
                text, color = entry[0], entry[1]
                tooltip = entry[2] if len(entry) > 2 else ""
                lbl.setText(text)
                lbl.setStyleSheet(f"color: {color}; font-size: 11px; font-weight: 700;")
                lbl.setToolTip(tooltip)
                lbl.setVisible(True)
            else:
                lbl.setVisible(False)

    @property
    def is_pinned(self) -> bool:
        return self._pinned

    def set_click_through(self, enabled: bool):
        self._click_through = bool(enabled)
        self._btn_click.set_active(self._click_through)

    def click_through_btn_geometry(self) -> "tuple[int,int,int,int]":
        """Retourne (x, y, w, h) global du bouton click-through (pour y superposer le bouton unlock)."""
        pos = self._btn_click.mapToGlobal(self._btn_click.rect().topLeft())
        return pos.x(), pos.y(), self._btn_click.width(), self._btn_click.height()

    @property
    def is_click_through(self) -> bool:
        return self._click_through

    def set_palette(self, palette: dict[str, str]):
        self._palette = {
            **self._palette,
            **palette,
        }
        teal = self._palette.get("TEAL", TEAL)

        self._lbl.setStyleSheet(
            f"color: {teal}; font-weight: 800; font-size: 13px; letter-spacing: 1px;"
        )
        self._enutrium_icon.setStyleSheet("background: transparent;")

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
        self._btn_fold.update_icon("chevron_up.svg" if self._folded else "chevron_down.svg")
        # Basculer entre identité app et métriques
        self._enutrium_icon.setVisible(not self._folded)
        self._lbl.setVisible(not self._folded)
        self._metrics_row.setVisible(self._folded)
        self.fold_toggled.emit(self._folded)

    def _toggle_click_through(self):
        self._click_through = not self._click_through
        self._btn_click.set_active(self._click_through)
        self.click_through_toggled.emit(self._click_through)

    # ── Event filter ───────────────────────────────────────────────

    def eventFilter(self, obj, event):
        """Affiche les tooltips des chips même sans focus applicatif."""
        if obj in self._metric_labels:
            t = event.type()
            if t == QEvent.Enter:
                tt = obj.toolTip()
                if tt:
                    QToolTip.showText(obj.mapToGlobal(obj.rect().center()), tt, obj)
            elif t == QEvent.Leave:
                QToolTip.hideText()
        return super().eventFilter(obj, event)

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
