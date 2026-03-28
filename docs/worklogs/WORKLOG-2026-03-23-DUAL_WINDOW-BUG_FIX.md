# WORKLOG — 2026-03-23 — DUAL_WINDOW — BUG_FIX

> **Composant** : Architecture dual-window (panel + main)
> **Type** : BUG_FIX
> **Auteur** : Sam + LLM
> **Version** : 4.0.4 -> 4.0.5

---

## Contexte

Apres la migration vers l'architecture dual-window, trois problemes critiques :
1. Le bouton "+" central est tronque (coupe par le haut de la fenetre main)
2. Le panel ne s'ouvre jamais quand on clique Perso / + / Options
3. Les widgets dans le panel ne sont donc jamais visibles

## Bug A — Bouton "+" tronque

**Cause** : Fenetre main = 96px (72px BottomBar + 24px ControlStrip). Le bouton "+"
positionne avec bottom:8px depasse de ~16px au-dessus — clippe par les bounds de la fenetre.
**Fix** : Fenetre 96 -> 116px (+20px zone transparente). Container justify-end.
**Fichiers** : tauri.conf.json, App.tsx, overlayTracker.ts (FOOTER_H_CSS)

## Bug B — Panel jamais visible (coordonnees logiques vs physiques)

**Cause** : WebviewWindowBuilder::inner_size() et .position() prennent du LOGIQUE.
openPanel() calcule en PHYSIQUE via outerPosition(). Avec scale factor > 1.0 = panel hors ecran.
**Fix** : create_panel_window divise par sf pour inner_size, puis set_position(PhysicalPosition)
et set_size(PhysicalSize) apres creation.
**Fichier** : overlay_commands.rs

## Bug C — ORIGINAL_WNDPROC partage main/panel

**Cause** : AtomicIsize global unique. Guard fait que seul main est subclasse, panel ignore.
**Fix** : Suppression de install_nchittest_subclass sur le panel (pas necessaire).
**Fichier** : overlay_commands.rs

## Bug D — Fallback timer trop court

**Fix** : 3s -> 4s. Logs ameliores pour tracer chaque etape.

---

## Corrections appliquees

| # | Fichier | Changement |
|---|---------|-----------|
| A1 | tauri.conf.json | height/minHeight 96->116, version 4.0.5 |
| A2 | App.tsx | height 116px + justify-end |
| A3 | overlayTracker.ts | FOOTER_H_CSS 96->116 |
| B1 | overlay_commands.rs | inner_size logique, set_position/set_size physique |
| B2 | overlay_commands.rs | position_panel_above_main utilise PhysicalPosition |
| C1 | overlay_commands.rs | Suppression install_nchittest_subclass sur panel |
| D1 | overlayTracker.ts | Fallback 3s->4s, logs ameliores |

## Tests

1. npm run tauri dev
2. Bouton "+" complet visible (cercle orange)
3. Clic Perso -> panel apparait au-dessus
4. Clic + -> expand Combat/Metiers/Economie
5. Clic Options -> onglet Options dans panel
6. Drag barre -> panel suit
7. Logs console F12 : messages [OVERLAY] a chaque etape