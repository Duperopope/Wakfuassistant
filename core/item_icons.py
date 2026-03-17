"""core/item_icons.py — Service d'icônes d'objets Wakfu

Résolution nom FR → gfxId via items.json + resources.json (Ankama CDN data).
Téléchargement async depuis le CDN, cache disque dans data/ankama_cdn/item_icons/.
"""
from __future__ import annotations

import json
import queue
import re as _re
import threading
import unicodedata
import urllib.request
from pathlib import Path
from typing import Callable

from PyQt5.QtCore import QObject, QTimer, pyqtSignal
from PyQt5.QtGui import QPixmap

_PROJECT_ROOT = Path(__file__).resolve().parents[1]
_CDN_DIR       = _PROJECT_ROOT / "data" / "ankama_cdn"
_ICON_DIR      = _CDN_DIR / "item_icons"
_ITEMS_JSON    = _CDN_DIR / "items.json"
_RES_JSON      = _CDN_DIR / "resources.json"
_JOBS_JSON     = _CDN_DIR / "jobsItems.json"
_TYPES_JSON    = _CDN_DIR / "itemTypes.json"

_CDN_URL = "https://static.ankama.com/wakfu/portal/game/item/115/{gfx_id}.png"

_ICON_DIR.mkdir(parents=True, exist_ok=True)

# ── Index nom → gfxId + métadonnées (chargé paresseusement) ──────────────────

_name_index: dict[str, int] | None = None          # fr_normalized → gfxId
_data_index: dict[str, dict] | None = None         # fr_normalized → {title, level, rarity, desc, type_id}
_type_index: dict[int, str] | None = None          # itemTypeId → nom FR nettoyé
_index_lock = threading.Lock()

_RE_PLURAL = _re.compile(r"\{[^}]+\}")             # retire {[~1]?s:} etc.


def _clean_type(name: str) -> str:
    return _RE_PLURAL.sub("", name).strip()

_RARITY_FR: dict[int, tuple[str, str]] = {        # rarity → (label_fr, couleur_hex)
    0: ("Commun",      "#8e9db0"),
    1: ("Commun",      "#8e9db0"),
    2: ("Peu commun",  "#5aaa5a"),
    3: ("Rare",        "#4a7acc"),
    4: ("Mythique",    "#c05ac0"),
    5: ("Légendaire",  "#d4853a"),
    6: ("Relique",     "#cc4444"),
    7: ("Souvenir",    "#c8b84a"),
}


def _normalize(name: str) -> str:
    """Normalise une chaîne pour la comparaison (minuscules, sans accents)."""
    nfkd = unicodedata.normalize("NFKD", name.lower().strip())
    return "".join(c for c in nfkd if not unicodedata.combining(c))


def _build_indexes() -> tuple[dict[str, int], dict[str, dict], dict[int, str]]:
    gfx: dict[str, int] = {}
    dat: dict[str, dict] = {}
    typ: dict[int, str]  = {}

    # itemTypes.json
    if _TYPES_JSON.exists():
        try:
            for t in json.loads(_TYPES_JSON.read_text(encoding="utf-8-sig")):
                tid = (t.get("definition") or {}).get("id")
                fr  = (t.get("title") or {}).get("fr") or ""
                if tid and fr:
                    typ[int(tid)] = _clean_type(fr)
        except Exception:
            pass

    if _ITEMS_JSON.exists():
        try:
            items = json.loads(_ITEMS_JSON.read_text(encoding="utf-8"))
            for it in items:
                fr = (it.get("title") or {}).get("fr") or ""
                item_def = (it.get("definition") or {}).get("item") or {}
                g = item_def.get("graphicParameters", {}).get("gfxId")
                if fr and g:
                    key = _normalize(fr)
                    gfx.setdefault(key, int(g))
                    if key not in dat:
                        base = item_def.get("baseParameters") or {}
                        dat[key] = {
                            "title":   fr,
                            "level":   item_def.get("level"),
                            "rarity":  base.get("rarity"),
                            "type_id": base.get("itemTypeId"),
                            "desc":    (it.get("description") or {}).get("fr") or "",
                        }
        except Exception:
            pass

    if _RES_JSON.exists():
        try:
            resources = json.loads(_RES_JSON.read_text(encoding="utf-8"))
            for res in resources:
                fr = (res.get("title") or {}).get("fr") or ""
                g = res.get("iconGfxId")
                if fr and g:
                    key = _normalize(fr)
                    gfx.setdefault(key, int(g))
                    if key not in dat:
                        dat[key] = {
                            "title": fr, "level": None,
                            "rarity": None, "type_id": None, "desc": "",
                        }
        except Exception:
            pass

    # jobsItems.json
    if _JOBS_JSON.exists():
        try:
            jobs = json.loads(_JOBS_JSON.read_text(encoding="utf-8"))
            for it in jobs:
                fr  = (it.get("title") or {}).get("fr") or ""
                dfn = it.get("definition") or {}
                g   = dfn.get("graphicParameters", {}).get("gfxId")
                if fr and g:
                    key = _normalize(fr)
                    gfx.setdefault(key, int(g))
                    if key not in dat:
                        dat[key] = {
                            "title":   fr,
                            "level":   dfn.get("level"),
                            "rarity":  dfn.get("rarity"),
                            "type_id": dfn.get("itemTypeId"),
                            "desc":    (it.get("description") or {}).get("fr") or "",
                        }
        except Exception:
            pass

    return gfx, dat, typ


def _get_indexes() -> tuple[dict[str, int], dict[str, dict], dict[int, str]]:
    global _name_index, _data_index, _type_index
    if _name_index is None:
        with _index_lock:
            if _name_index is None:
                _name_index, _data_index, _type_index = _build_indexes()
    return _name_index, _data_index, _type_index


def get_gfx_id(name: str) -> int | None:
    """Retourne le gfxId pour un nom d'objet FR, ou None si inconnu."""
    gfx, _, _ = _get_indexes()
    return gfx.get(_normalize(name))


def get_item_data(name: str) -> dict | None:
    """Retourne {title, level, rarity, type_id, desc} pour un nom d'objet FR, ou None."""
    _, dat, _ = _get_indexes()
    return dat.get(_normalize(name))


def get_type_name(type_id: int) -> str | None:
    """Retourne le nom FR du type d'objet (ex. 'Récolte du Trappeur'), ou None."""
    _, _, typ = _get_indexes()
    return typ.get(type_id)


# ── Cache mémoire ──────────────────────────────────────────────────────────────

_mem_cache: dict[int, QPixmap | None] = {}   # None = échec confirmé
_mem_lock = threading.Lock()


def _load_from_disk(gfx_id: int, size: int) -> QPixmap | None:
    path = _ICON_DIR / f"{gfx_id}.png"
    if not path.exists():
        return None
    px = QPixmap(str(path))
    if px.isNull():
        return None
    return px.scaled(size, size, aspectRatioMode=1)   # KeepAspectRatio = 1


def load_pixmap(gfx_id: int, size: int) -> QPixmap | None:
    """Charge le PNG depuis le disque à la taille demandée (sans passer par le cache 24px)."""
    from PyQt5.QtCore import Qt as _Qt
    path = _ICON_DIR / f"{gfx_id}.png"
    if not path.exists():
        return None
    px = QPixmap(str(path))
    if px.isNull():
        return None
    return px.scaled(size, size, _Qt.KeepAspectRatio, _Qt.SmoothTransformation)


# ── Worker de téléchargement ──────────────────────────────────────────────────

_dl_queue: "queue.Queue[int | None]" = queue.Queue()
_result_queue: "queue.Queue[tuple[int, bool]]" = queue.Queue()  # (gfxId, success)
_in_flight: set[int] = set()
_in_flight_lock = threading.Lock()


def _download_worker():
    while True:
        gfx_id = _dl_queue.get()
        if gfx_id is None:
            break
        path = _ICON_DIR / f"{gfx_id}.png"
        ok = False
        if not path.exists():
            url = _CDN_URL.format(gfx_id=gfx_id)
            try:
                req = urllib.request.Request(url, headers={"User-Agent": "WakfuAssistant/1.0"})
                with urllib.request.urlopen(req, timeout=8) as resp:
                    data = resp.read()
                if data:
                    path.write_bytes(data)
                    ok = True
            except Exception:
                ok = False
        else:
            ok = True
        with _in_flight_lock:
            _in_flight.discard(gfx_id)
        _result_queue.put((gfx_id, ok))


_worker = threading.Thread(target=_download_worker, daemon=True)
_worker.start()


def _request_download(gfx_id: int):
    with _in_flight_lock:
        if gfx_id in _in_flight:
            return
        _in_flight.add(gfx_id)
    _dl_queue.put(gfx_id)


# ── Service public (QObject avec signal) ──────────────────────────────────────

class ItemIconService(QObject):
    """
    Service d'icônes thread-safe.

    Usage :
        svc = ItemIconService.instance()
        svc.icon_ready.connect(my_slot)   # slot(gfx_id: int, px: QPixmap)
        svc.request(gfx_id, size=24)
        px = svc.get_cached(gfx_id, size) # None si pas encore disponible
    """
    icon_ready = pyqtSignal(int, object)   # (gfxId, QPixmap)

    _instance: "ItemIconService | None" = None

    @classmethod
    def instance(cls) -> "ItemIconService":
        if cls._instance is None:
            cls._instance = cls()
        return cls._instance

    def __init__(self, parent=None):
        super().__init__(parent)
        self._pending_sizes: dict[int, int] = {}   # gfxId → requested size

        self._poll = QTimer(self)
        self._poll.setInterval(80)
        self._poll.timeout.connect(self._drain_results)
        self._poll.start()

    def request(self, gfx_id: int, size: int = 24):
        """Demande le chargement d'une icône. Émet icon_ready quand disponible."""
        if gfx_id is None:
            return
        with _mem_lock:
            if gfx_id in _mem_cache:
                px = _mem_cache[gfx_id]
                if px is not None:
                    scaled = px.scaled(size, size, aspectRatioMode=1)
                    self.icon_ready.emit(gfx_id, scaled)
                return
        # Tenter le chargement depuis le disque
        px = _load_from_disk(gfx_id, size)
        if px is not None:
            with _mem_lock:
                _mem_cache[gfx_id] = px
            self.icon_ready.emit(gfx_id, px)
            return
        # Lancer le téléchargement
        self._pending_sizes[gfx_id] = size
        _request_download(gfx_id)

    def get_cached(self, gfx_id: int, size: int = 24) -> QPixmap | None:
        """Retourne l'icône si disponible en cache, redimensionnée à size (sinon None)."""
        with _mem_lock:
            px = _mem_cache.get(gfx_id)
        if px is None:
            px = _load_from_disk(gfx_id, size)
            if px:
                with _mem_lock:
                    _mem_cache[gfx_id] = px
        if px is not None:
            return px.scaled(size, size, aspectRatioMode=1)
        return None

    def _drain_results(self):
        try:
            while True:
                gfx_id, ok = _result_queue.get_nowait()
                size = self._pending_sizes.pop(gfx_id, 24)
                if ok:
                    px = _load_from_disk(gfx_id, size)
                    if px:
                        with _mem_lock:
                            _mem_cache[gfx_id] = px
                        self.icon_ready.emit(gfx_id, px)
                    else:
                        with _mem_lock:
                            _mem_cache[gfx_id] = None
                else:
                    with _mem_lock:
                        _mem_cache[gfx_id] = None
        except queue.Empty:
            pass
