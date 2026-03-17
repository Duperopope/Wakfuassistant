# ui/drag_editor.py — Éditeur WYSIWYG (F11)
# Overlay transparent : les widgets restent visibles en dessous.
# Poignées move + resize (×8) + rotation directement sur le widget réel.
from __future__ import annotations

from pathlib import Path
import json, math

from PyQt5.QtWidgets import (
    QWidget, QGraphicsView, QGraphicsScene,
    QGraphicsObject, QGraphicsItem, QHBoxLayout,
    QMenu, QFontDialog,
)
from PyQt5.QtCore  import Qt, QRectF, QPointF, QPoint, pyqtSignal, QObject
from PyQt5.QtGui   import QPainter, QColor, QPen, QBrush, QFont

_LAYOUT_FILE = Path(__file__).resolve().parents[1] / "data" / "ui_layout.json"
_ACCENT  = QColor(80, 180, 255)
_HS      = 8       # handle size (px)
_ROT_D   = 22.0    # hauteur du handle de rotation (au-dessus du bord haut)

# ── Types de poignées ─────────────────────────────────────────────────────────
_TL, _TC, _TR = 0, 1, 2
_ML,      _MR = 3, 4
_BL, _BC, _BR = 5, 6, 7
_ROT          = 8

_H_CURSORS = {
    _TL: Qt.SizeFDiagCursor, _TC: Qt.SizeVerCursor,  _TR: Qt.SizeBDiagCursor,
    _ML: Qt.SizeHorCursor,                             _MR: Qt.SizeHorCursor,
    _BL: Qt.SizeBDiagCursor, _BC: Qt.SizeVerCursor,  _BR: Qt.SizeFDiagCursor,
    _ROT: Qt.CrossCursor,
}


# ─────────────────────────────────────────────────────────────────────────────
# DragSection — wrapper widget (API inchangée)
# ─────────────────────────────────────────────────────────────────────────────

class DragSection(QWidget):
    def __init__(self, section_id: str, label: str = "", parent=None):
        super().__init__(parent)
        self._id    = section_id
        self._label = label or section_id

    def wrap(self, widget: QWidget) -> "DragSection":
        lay = QHBoxLayout(self)
        lay.setContentsMargins(0, 0, 0, 0)
        lay.setSpacing(0)
        lay.addWidget(widget)
        return self


# ─────────────────────────────────────────────────────────────────────────────
# _Handle — poignée de transformation (QGraphicsObject simple, pas de proxy)
# ─────────────────────────────────────────────────────────────────────────────

class _Handle(QGraphicsObject):
    def __init__(self, htype: int, parent: "_ItemFrame"):
        super().__init__(parent)
        self._type = htype
        self.setCursor(_H_CURSORS.get(htype, Qt.ArrowCursor))
        self.setZValue(30)      # toujours au-dessus du frame
        self._prev: QPointF | None = None

    def boundingRect(self) -> QRectF:
        s = float(_HS) + 4.0
        return QRectF(-s / 2, -s / 2, s, s)

    def paint(self, p: QPainter, option, widget=None):
        p.setRenderHint(QPainter.Antialiasing)
        s = float(_HS)
        if self._type == _ROT:
            p.setPen(QPen(_ACCENT, 1.5))
            p.setBrush(QBrush(_ACCENT))
            p.drawEllipse(QRectF(-s / 2, -s / 2, s, s))
        else:
            p.setPen(QPen(_ACCENT, 1.5))
            p.setBrush(QBrush(QColor("#131b26")))
            p.drawRect(QRectF(-s / 2, -s / 2, s, s))

    def mousePressEvent(self, e):
        if e.button() == Qt.LeftButton:
            self._prev = e.scenePos()
            e.accept()
        else:
            super().mousePressEvent(e)

    def mouseMoveEvent(self, e):
        if self._prev is not None:
            dp = e.scenePos() - self._prev
            self._prev = e.scenePos()
            shift = bool(e.modifiers() & Qt.ShiftModifier)
            self.parentItem()._handle_drag(self._type, dp, e.scenePos(), shift)
            e.accept()
        else:
            super().mouseMoveEvent(e)

    def mouseReleaseEvent(self, e):
        self._prev = None
        e.accept()


# ─────────────────────────────────────────────────────────────────────────────
# _ItemFrame — cadre WYSIWYG autour du DragSection (sans proxy)
# ─────────────────────────────────────────────────────────────────────────────

class _ItemFrame(QGraphicsObject):
    MIN_W = 20.0
    MIN_H = 10.0

    def __init__(self, section: DragSection, x: float, y: float,
                 w: float, h: float, rot: float = 0.0):
        super().__init__()
        self._section = section
        self._w = max(self.MIN_W, w)
        self._h = max(self.MIN_H, h)

        self.setFlag(QGraphicsItem.ItemIsMovable)
        self.setFlag(QGraphicsItem.ItemIsSelectable)
        self.setFlag(QGraphicsItem.ItemSendsGeometryChanges)
        self.setZValue(10)
        self.setPos(x, y)
        self.setTransformOriginPoint(self._w / 2, self._h / 2)
        self.setRotation(rot)

        self._handles = {
            t: _Handle(t, self)
            for t in (_TL, _TC, _TR, _ML, _MR, _BL, _BC, _BR, _ROT)
        }
        self._update_handles()
        # Sync widget position/size immédiatement
        self._apply()

    # ── Géométrie ──────────────────────────────────────────────────────────

    def boundingRect(self) -> QRectF:
        m = _HS / 2.0 + 3.0
        return QRectF(-m, -_ROT_D - m, self._w + 2 * m, self._h + _ROT_D + 2 * m)

    def paint(self, p: QPainter, option, widget=None):
        p.setRenderHint(QPainter.Antialiasing)
        rect = QRectF(0, 0, self._w, self._h)
        # Contour fin en pointillés — AUCUN fond, le widget reste entièrement visible
        pen = QPen(_ACCENT, 1.0, Qt.DashLine)
        p.setPen(pen)
        p.setBrush(Qt.NoBrush)
        p.drawRect(rect)
        # Ligne vers la poignée de rotation
        p.setPen(QPen(_ACCENT, 0.8, Qt.DotLine))
        cx = self._w / 2.0
        p.drawLine(QPointF(cx, 0.0), QPointF(cx, -_ROT_D))
        # Label au-dessus (ne couvre pas le contenu)
        font = QFont("Rajdhani", 8)
        font.setBold(True)
        p.setFont(font)
        p.setPen(QColor(150, 210, 255, 180))
        p.drawText(QRectF(0, -_ROT_D, self._w, _ROT_D - 2.0),
                   Qt.AlignBottom | Qt.AlignLeft,
                   self._section._label)

    def _update_handles(self):
        cx, cy = self._w / 2.0, self._h / 2.0
        for htype, (hx, hy) in {
            _TL: (0,       0       ), _TC: (cx,      0       ), _TR: (self._w, 0       ),
            _ML: (0,       cy      ),                            _MR: (self._w, cy      ),
            _BL: (0,       self._h ), _BC: (cx,      self._h ), _BR: (self._w, self._h ),
            _ROT: (cx, -_ROT_D),
        }.items():
            self._handles[htype].setPos(hx, hy)
        self.setTransformOriginPoint(cx, cy)
        self.prepareGeometryChange()
        self.update()

    # ── Transformations ────────────────────────────────────────────────────

    def _handle_drag(self, htype: int, dp: QPointF, scene_pos: QPointF, shift: bool = False):
        if htype == _ROT:
            self._do_rotate(scene_pos)
        else:
            self._do_resize(htype, dp, shift)

    def _scene_to_local_delta(self, dp: QPointF) -> QPointF:
        r = math.radians(self.rotation())
        cos_r, sin_r = math.cos(r), math.sin(r)
        return QPointF(
             dp.x() * cos_r + dp.y() * sin_r,
            -dp.x() * sin_r + dp.y() * cos_r,
        )

    def _local_to_scene_delta(self, ldx: float, ldy: float) -> QPointF:
        t = self.sceneTransform()
        return t.map(QPointF(ldx, ldy)) - t.map(QPointF(0.0, 0.0))

    def _do_resize(self, htype: int, dp: QPointF, shift: bool = False):
        ld  = self._scene_to_local_delta(dp)
        ldx, ldy = ld.x(), ld.y()

        new_w = self._w
        new_h = self._h
        if htype in (_TL, _ML, _BL): new_w = max(self.MIN_W, self._w - ldx)
        if htype in (_TR, _MR, _BR): new_w = max(self.MIN_W, self._w + ldx)
        if htype in (_TL, _TC, _TR): new_h = max(self.MIN_H, self._h - ldy)
        if htype in (_BL, _BC, _BR): new_h = max(self.MIN_H, self._h + ldy)

        # Shift + coin → maintien du ratio original
        if shift and htype in (_TL, _TR, _BL, _BR) and self._h > 0:
            ratio = self._w / self._h
            dw = abs(new_w - self._w)
            dh = abs(new_h - self._h)
            if dh == 0 or (dw > 0 and dw / ratio >= dh):
                new_h = max(self.MIN_H, new_w / ratio)
            else:
                new_w = max(self.MIN_W, new_h * ratio)

        # Décalage du coin TL en local (bord gauche / haut déplacé)
        sl_x = (self._w - new_w) if htype in (_TL, _ML, _BL) else 0.0
        sl_y = (self._h - new_h) if htype in (_TL, _TC, _TR) else 0.0
        ds   = self._local_to_scene_delta(sl_x, sl_y)

        pos = self.pos()
        self.setPos(pos.x() + ds.x(), pos.y() + ds.y())
        self._w, self._h = new_w, new_h
        self._update_handles()
        self._apply()

    def _do_rotate(self, scene_pos: QPointF):
        center = self.mapToScene(QPointF(self._w / 2.0, self._h / 2.0))
        delta  = scene_pos - center
        self.setRotation(math.degrees(math.atan2(delta.x(), -delta.y())))
        self.update()
        # NOTE : la rotation est stockée en JSON mais les QWidget
        # ne supportent pas nativement la rotation visuelle.

    def _apply(self):
        """Applique position + taille au widget réel → WYSIWYG immédiat."""
        p = self.pos()
        self._section.move(int(p.x()), int(p.y()))
        self._section.resize(int(self._w), int(self._h))

    def itemChange(self, change, value):
        if change == QGraphicsItem.ItemPositionChange:
            # Clamp position so items can't escape the container bounds
            scene = self.scene()
            if scene:
                sr = scene.sceneRect()
                nx = max(sr.x(), min(float(value.x()), sr.x() + sr.width()  - self._w))
                ny = max(sr.y(), min(float(value.y()), sr.y() + sr.height() - self._h))
                return QPointF(nx, ny)
        elif change == QGraphicsItem.ItemPositionHasChanged:
            # Déplacement via ItemIsMovable → sync widget
            self._apply()
        return super().itemChange(change, value)

    def contextMenuEvent(self, e):
        menu = QMenu()
        act_font = menu.addAction("Modifier la police…")
        act_hide = menu.addAction("Masquer l'élément")
        sp = e.screenPos()
        action = menu.exec_(sp if isinstance(sp, QPoint) else QPoint(int(sp.x()), int(sp.y())))
        if action == act_font:
            try:
                views = self.scene().views() if self.scene() else []
                parent_w = views[0] if views else None
                ok, new_font = QFontDialog.getFont(
                    self._section.font(), parent_w, "Police — " + self._section._label
                )
                if ok:
                    self._section.setFont(new_font)
                    for child in self._section.findChildren(QWidget):
                        child.setFont(new_font)
            except Exception:
                pass
        elif action == act_hide:
            self._section.hide()
            EditModeManager.instance().save_visibility(self._section._id, False)
        e.accept()

    def get_transform(self) -> dict:
        p = self.pos()
        return {"x": p.x(), "y": p.y(),
                "w": self._w, "h": self._h, "rot": self.rotation()}


# ─────────────────────────────────────────────────────────────────────────────
# _EditOverlay — QGraphicsView transparent plein-écran
# ─────────────────────────────────────────────────────────────────────────────

class _EditOverlay(QGraphicsView):
    def __init__(self, container: QWidget,
                 sections: list[DragSection],
                 saved: dict,
                 positions: dict):          # positions pré-enregistrées avant détachement
        super().__init__(container)
        self.setGeometry(container.rect())
        self.setStyleSheet("background: transparent; border: none;")
        self.setFrameShape(0)
        self.setAttribute(Qt.WA_TranslucentBackground)
        self.setHorizontalScrollBarPolicy(Qt.ScrollBarAlwaysOff)
        self.setVerticalScrollBarPolicy(Qt.ScrollBarAlwaysOff)
        self.setRenderHint(QPainter.Antialiasing)
        self.setDragMode(QGraphicsView.NoDrag)

        scene = QGraphicsScene(self)
        scene.setSceneRect(0, 0, container.width(), container.height())
        self.setScene(scene)

        self._frames: dict[str, _ItemFrame] = {}
        for s in sections:
            # Priorité : position sauvegardée → position actuelle pré-enregistrée
            d = saved.get(s._id, {})
            if d and d.get("w", 0) > 0:
                x, y = d["x"], d["y"]
                w, h = d["w"], d["h"]
                rot  = d.get("rot", 0.0)
            else:
                px, py, pw, ph = positions.get(s._id, (0.0, 0.0, 100.0, 40.0))
                x, y, w, h, rot = px, py, pw, ph, 0.0

            frame = _ItemFrame(s, x, y, w, h, rot)
            scene.addItem(frame)
            self._frames[s._id] = frame

    def mousePressEvent(self, event):
        # Passe au widget sous-jacent si aucun item de la scène n'est à ce point
        if self.itemAt(event.pos()) is None:
            event.ignore()
            return
        super().mousePressEvent(event)

    def get_transforms(self) -> dict:
        return {sid: f.get_transform() for sid, f in self._frames.items()}


# ─────────────────────────────────────────────────────────────────────────────
# EditModeManager — singleton
# ─────────────────────────────────────────────────────────────────────────────

class EditModeManager(QObject):
    edit_mode_changed = pyqtSignal(bool)
    _instance: "EditModeManager | None" = None

    def __init__(self):
        super().__init__()
        self._active   = False
        self._sections: list[DragSection] = []
        self._containers: dict[str, QWidget] = {}
        self._saved    = self._load()
        self._overlay: _EditOverlay | None = None

    @classmethod
    def instance(cls) -> "EditModeManager":
        if cls._instance is None:
            cls._instance = cls()
        return cls._instance

    # ── Enregistrement ────────────────────────────────────────────────────

    def register(self, section: DragSection, container: QWidget | None = None):
        if section not in self._sections:
            self._sections.append(section)
        if container is not None:
            self._containers[section._id] = container

    def apply_saved_positions(self):
        """Restaure positions/tailles sauvegardées en mode normal (sans rotation)."""
        for s in self._sections:
            d = self._saved.get(s._id)
            if not d:
                continue
            container = self._containers.get(s._id, s.parent())
            _remove_from_layout(s.parent().layout() if s.parent() else None, s)
            if s.parent() is not container:
                s.setParent(container)
            x, y, w, h = self._abs_coords(s._id, d, container)
            s.move(QPoint(x, y))
            if w > 0 and h > 0:
                s.resize(w, h)
            # Respect persistent visibility (default True for backward compat)
            if d.get("visible", True):
                s.show()
            else:
                s.hide()

    def resize_all(self):
        """Recalcule les positions absolues depuis les coords relatives (appelé au resize)."""
        if self._active:
            return
        for s in self._sections:
            d = self._saved.get(s._id)
            if not d or "x_rel" not in d:
                continue
            container = self._containers.get(s._id, s.parent())
            if not container:
                continue
            x, y, w, h = self._abs_coords(s._id, d, container)
            s.move(QPoint(x, y))
            if w > 0 and h > 0:
                s.resize(w, h)

    @staticmethod
    def _abs_coords(sid: str, d: dict, container) -> tuple[int, int, int, int]:
        """Convertit coords relatives ou absolues en pixels selon le container."""
        if container and "x_rel" in d:
            cw = max(1, container.width())
            ch = max(1, container.height())
            x = int(d["x_rel"] * cw)
            y = int(d["y_rel"] * ch)
            w = max(20, int(d.get("w_rel", 0.25) * cw))
            h = max(10, int(d.get("h_rel", 0.08) * ch))
        else:
            x = int(d.get("x", 0))
            y = int(d.get("y", 0))
            w = int(d.get("w", 100))
            h = int(d.get("h", 40))
        return x, y, w, h

    def save_visibility(self, section_id: str, visible: bool):
        """Persiste l'état de visibilité d'une section dans ui_layout.json."""
        if section_id not in self._saved:
            self._saved[section_id] = {}
        self._saved[section_id]["visible"] = visible
        self._save()

    # ── Toggle ────────────────────────────────────────────────────────────

    def toggle(self):
        self._active = not self._active
        if self._active:
            self._enter()
        else:
            self._exit()
        self.edit_mode_changed.emit(self._active)

    @property
    def active(self) -> bool:
        return self._active

    # ── Entrée / sortie ───────────────────────────────────────────────────

    def _enter(self):
        if not self._sections:
            return
        container = next(
            (self._containers.get(s._id) for s in self._sections
             if self._containers.get(s._id)),
            None,
        )
        if container is None:
            return

        # 1. Enregistrer les positions AVANT de détacher des layouts
        positions: dict[str, tuple] = {}
        for s in self._sections:
            pos = s.mapTo(container, QPoint(0, 0))
            positions[s._id] = (
                float(pos.x()), float(pos.y()),
                max(20.0, float(s.width())),
                max(10.0, float(s.height())),
            )

        # 2. Détacher des layouts
        for s in self._sections:
            if s.parent():
                _remove_from_layout(s.parent().layout(), s)
            if s.parent() is not container:
                s.setParent(container)
            s.show()

        # 3. Créer l'overlay
        self._overlay = _EditOverlay(container, self._sections,
                                     self._saved, positions)
        self._overlay.show()
        self._overlay.raise_()

    def _exit(self):
        if not self._overlay:
            return
        transforms = self._overlay.get_transforms()
        self._overlay.hide()
        self._overlay.deleteLater()
        self._overlay = None

        data = dict(self._saved)
        for sid, tr in transforms.items():
            container = self._containers.get(sid)
            prev = data.get(sid, {})
            entry: dict = {"rot": tr.get("rot", 0.0),
                           "visible": prev.get("visible", True)}
            if container and container.width() > 0 and container.height() > 0:
                cw, ch = container.width(), container.height()
                entry["x_rel"] = tr["x"] / cw
                entry["y_rel"] = tr["y"] / ch
                entry["w_rel"] = max(0.01, tr["w"] / cw)
                entry["h_rel"] = max(0.01, tr["h"] / ch)
            else:
                entry.update({"x": tr["x"], "y": tr["y"],
                              "w": tr["w"], "h": tr["h"]})
            data[sid] = entry
        self._saved = data
        self._save()

    # ── Persistence ───────────────────────────────────────────────────────

    def _load(self) -> dict:
        if _LAYOUT_FILE.exists():
            try:
                return json.loads(_LAYOUT_FILE.read_text(encoding="utf-8"))
            except Exception:
                pass
        return {}

    def _save(self):
        _LAYOUT_FILE.write_text(
            json.dumps(self._saved, indent=2), encoding="utf-8"
        )


# ─────────────────────────────────────────────────────────────────────────────
# Helpers
# ─────────────────────────────────────────────────────────────────────────────

def _remove_from_layout(layout, widget: QWidget) -> bool:
    if layout is None:
        return False
    for i in range(layout.count()):
        item = layout.itemAt(i)
        if item is None:
            continue
        if item.widget() is widget:
            layout.takeAt(i)
            return True
        if item.layout() and _remove_from_layout(item.layout(), widget):
            return True
    return False
