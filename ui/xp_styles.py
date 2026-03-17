# ui/xp_styles.py — Fonctions de rendu QPainter pour les styles de barre d'XP
# Chaque fonction a la signature :
#   paint_xxx(p: QPainter, rect: QRect, progress: float, text: str) -> None
# Utilisé par _XPBar (personnage.py) et par les swatches (widget_library.py).

from __future__ import annotations
import math

from PyQt5.QtCore  import Qt, QRectF, QRect, QPointF
from PyQt5.QtGui   import (
    QPainter, QColor, QLinearGradient, QBrush, QPen, QFont, QPolygonF,
)

from ui.theme import TEAL, TEAL_BRIGHT, BORDER, TEXT, TEXT_DIM, FONT_LABEL


# ── Noms des styles (index = ID de style) ────────────────────────────────────
XP_STYLE_NAMES = [
    "Wakfu Officiel",   # 0 – géré directement dans _XPBar (9-patch PNG)
    "Runique",          # 1
    "Néon",             # 2
    "Cristal",          # 3
    "Arc d'Énergie",    # 4
    "Hexagones",        # 5
]


# ── Style 0 : fallback gradient (quand les PNG ne sont pas dispo) ─────────────

def paint_official_fallback(p: QPainter, rect: QRect, progress: float, text: str = ""):
    w, h = rect.width(), rect.height()
    p.setPen(Qt.NoPen)
    p.setBrush(QBrush(QColor("#0a0d12")))
    p.drawRoundedRect(rect, 6, 6)
    if progress > 0:
        fw = max(12, int(w * progress))
        grad = QLinearGradient(0, 0, fw, 0)
        grad.setColorAt(0.0, QColor("#0d6b68"))
        grad.setColorAt(1.0, QColor(TEAL_BRIGHT))
        p.setBrush(QBrush(grad))
        p.setPen(Qt.NoPen)
        p.drawRoundedRect(QRect(0, 0, fw, h), 6, 6)
    if text:
        p.setPen(QColor(TEXT))
        p.setFont(QFont(FONT_LABEL, 8))
        p.drawText(rect, Qt.AlignCenter, text)


# ── Style 1 : Runique (cellules segmentées) ───────────────────────────────────

def paint_runic(p: QPainter, rect: QRect, progress: float, text: str = ""):
    w, h = rect.width(), rect.height()
    n     = max(8, w // 14)
    gap   = 2
    seg_w = max(2.0, (w - gap * (n - 1)) / n)
    filled = int(progress * n)

    p.setPen(Qt.NoPen)
    for i in range(n):
        x = i * (seg_w + gap)
        r = QRectF(x, 0, seg_w, h)
        if i < filled:
            c = QColor(TEAL_BRIGHT) if i == filled - 1 else QColor(TEAL)
            p.setBrush(c)
            p.drawRoundedRect(r, 2, 2)
            # reflet interne
            p.setBrush(QColor(255, 255, 255, 35))
            p.drawRoundedRect(QRectF(x + 1, 1, max(1, seg_w - 2), max(1, h * 0.35)), 1, 1)
        else:
            p.setBrush(QColor("#0e1c28"))
            p.drawRoundedRect(r, 2, 2)
            # contour subtil
            p.setPen(QPen(QColor(BORDER), 0.5))
            p.setBrush(Qt.NoBrush)
            p.drawRoundedRect(r, 2, 2)
            p.setPen(Qt.NoPen)

    if text:
        p.setPen(QColor(TEXT))
        p.setFont(QFont(FONT_LABEL, 8))
        p.drawText(rect, Qt.AlignCenter, text)


# ── Style 2 : Néon (barre ultra-fine avec halo) ───────────────────────────────

def paint_neon(p: QPainter, rect: QRect, progress: float, text: str = ""):
    w, h  = rect.width(), rect.height()
    bar_h = max(4, h // 3)
    bar_y = (h - bar_h) // 2

    p.setPen(Qt.NoPen)
    # piste
    p.setBrush(QColor("#0b161e"))
    p.drawRoundedRect(QRectF(0, bar_y, w, bar_h), bar_h / 2, bar_h / 2)

    if progress > 0:
        fw = max(bar_h, int(w * progress))
        # couches de halo
        for i in range(3, 0, -1):
            glow = QColor(TEAL_BRIGHT)
            glow.setAlpha(22 * i)
            p.setBrush(glow)
            inf = i * 2
            p.drawRoundedRect(
                QRectF(-inf / 2, bar_y - inf / 2, fw + inf, bar_h + inf),
                (bar_h + inf) / 2, (bar_h + inf) / 2,
            )
        # cœur lumineux
        p.setBrush(QColor(TEAL_BRIGHT))
        p.drawRoundedRect(QRectF(0, bar_y, fw, bar_h), bar_h / 2, bar_h / 2)
        # spécule blanche
        p.setBrush(QColor(255, 255, 255, 80))
        top_h = max(1, bar_h // 3)
        p.drawRoundedRect(
            QRectF(2, bar_y + 1, fw - 4, top_h),
            top_h / 2, top_h / 2,
        )

    if text:
        p.setPen(QColor(TEAL_BRIGHT))
        f = QFont(FONT_LABEL, 8)
        p.setFont(f)
        p.drawText(QRectF(0, 0, w - 4, h), Qt.AlignRight | Qt.AlignVCenter, text)


# ── Style 3 : Cristal (parallélogramme angulaire) ─────────────────────────────

def paint_crystal(p: QPainter, rect: QRect, progress: float, text: str = ""):
    w, h  = rect.width(), rect.height()
    slope = max(2, h // 2)

    bg = QPolygonF([
        QPointF(slope, 0), QPointF(w - slope, 0),
        QPointF(w, h / 2), QPointF(w - slope, h),
        QPointF(slope, h), QPointF(0, h / 2),
    ])
    p.setPen(QPen(QColor(BORDER), 1))
    p.setBrush(QColor("#0b1520"))
    p.drawPolygon(bg)

    if progress > 0:
        fw = max(slope * 2 + 4, int(w * progress))
        fill = QPolygonF([
            QPointF(slope + 1, 1),
            QPointF(min(fw - slope, w - slope - 1), 1),
            QPointF(min(fw, w - 1), h / 2),
            QPointF(min(fw - slope, w - slope - 1), h - 1),
            QPointF(slope + 1, h - 1),
            QPointF(1, h / 2),
        ])
        grad = QLinearGradient(slope, 0, fw, 0)
        grad.setColorAt(0.0, QColor("#0a4858"))
        grad.setColorAt(0.5, QColor(TEAL))
        grad.setColorAt(1.0, QColor(TEAL_BRIGHT))
        p.setBrush(QBrush(grad))
        p.setPen(Qt.NoPen)
        p.drawPolygon(fill)

        # reflet supérieur
        hi_max = min(fw - slope, w - slope - 1)
        if hi_max > slope + 2:
            hi = QPolygonF([
                QPointF(slope + 2, 2),
                QPointF(hi_max, 2),
                QPointF(hi_max + h // 4, h // 3),
                QPointF(hi_max, h // 3),
                QPointF(slope + 2, h // 3),
            ])
            p.setBrush(QColor(255, 255, 255, 28))
            p.drawPolygon(hi)

    if text:
        p.setPen(QColor(TEXT))
        p.setFont(QFont(FONT_LABEL, 8))
        p.drawText(rect, Qt.AlignCenter, text)


# ── Style 4 : Arc d'Énergie (jauge circulaire) ───────────────────────────────

def paint_arc(p: QPainter, rect: QRect, progress: float, text: str = ""):
    w, h   = rect.width(), rect.height()
    size   = min(w, h) - 4
    cx, cy = w / 2, h / 2
    r_out  = size / 2
    arc_r  = QRectF(cx - r_out, cy - r_out, size, size)
    bar_w  = max(4, int(size / 6))

    # piste
    pen = QPen(QColor("#182430"), bar_w)
    pen.setCapStyle(Qt.RoundCap)
    p.setPen(pen)
    p.drawArc(arc_r.toRect(), 225 * 16, -270 * 16)

    # remplissage
    if progress > 0:
        fill_pen = QPen(QColor(TEAL_BRIGHT), bar_w - 2)
        fill_pen.setCapStyle(Qt.RoundCap)
        p.setPen(fill_pen)
        p.drawArc(arc_r.toRect(), 225 * 16, int(-270 * 16 * progress))

    # texte central (%)
    p.setPen(QColor(TEAL_BRIGHT))
    fs = max(6, int(size / 4))
    f  = QFont(FONT_LABEL, fs)
    f.setWeight(QFont.Bold)
    p.setFont(f)
    p.drawText(arc_r.toRect(), Qt.AlignCenter, f"{int(progress * 100)}%")


# ── Style 5 : Hexagones ───────────────────────────────────────────────────────

def paint_hexagons(p: QPainter, rect: QRect, progress: float, text: str = ""):
    w, h   = rect.width(), rect.height()
    hex_r  = max(5, h // 2 - 2)
    hex_dw = hex_r * 2
    gap    = 3
    n      = max(5, (w + gap) // (hex_dw + gap))
    total  = n * hex_dw + (n - 1) * gap
    x0     = (w - total) / 2
    cy     = h / 2
    filled = int(progress * n + 0.0001)

    for i in range(n):
        cx  = x0 + i * (hex_dw + gap) + hex_r
        pts = QPolygonF([
            QPointF(
                cx + hex_r * math.cos(math.pi / 6 + math.pi / 3 * k),
                cy + hex_r * math.sin(math.pi / 6 + math.pi / 3 * k),
            )
            for k in range(6)
        ])
        if i < filled:
            grad = QLinearGradient(cx - hex_r, cy, cx + hex_r, cy)
            grad.setColorAt(0.0, QColor(TEAL))
            grad.setColorAt(1.0, QColor(TEAL_BRIGHT))
            p.setBrush(QBrush(grad))
            p.setPen(QPen(QColor(TEAL_BRIGHT), 0.5))
        else:
            p.setBrush(QColor("#0d1c28"))
            p.setPen(QPen(QColor(BORDER), 0.5))
        p.drawPolygon(pts)

    if text:
        p.setPen(QColor(TEXT))
        p.setFont(QFont(FONT_LABEL, 8))
        p.drawText(rect, Qt.AlignCenter, text)


# ── Dispatch ──────────────────────────────────────────────────────────────────

XP_PAINT_FN: dict[int, callable] = {
    1: paint_runic,
    2: paint_neon,
    3: paint_crystal,
    4: paint_arc,
    5: paint_hexagons,
}
