# WORKLOG 2026-03-23 — TRI-WINDOW ARCHITECTURE v4.0.6

## Statut: EN COURS
## Auteur: Claude (Full Stack) + Sam (Chef d orchestre)
## Date: 2026-03-23

---

## Contexte

La version dual-window (v4.0.4 / v4.0.5) avait plusieurs bugs critiques :
- Le bouton "+" etait tronque (overflow: hidden sur 96px puis 116px)
- Le panel ne s ouvrait pas (panel-ready fallback defaillant)
- Les capabilities ne listaient pas la fenetre "panel"
- Le WndProc subclass etait partage entre main et panel

## Solution: Architecture Tri-Window

Au lieu de 1 fenetre main + 1 panel dynamique, on passe a 3 fenetres declarees :+----------------------------+ | TOOLBAR (420x28) | <- Fenetre 1: drag, pin, CT, minimize +----------------------------+ | NAVBAR (420x72) | <- Fenetre 2: Home, +, Options +----------------------------+ | | | PANEL (420x420) | <- Fenetre 3: contenu tabs | | +----------------------------+


## Fichiers modifies

### Backend (Part 1)
| Fichier | Action |
|---------|--------|
| src-tauri/tauri.conf.json | 2 fenetres declarees (toolbar, navbar) + version 4.0.6 |
| src-tauri/capabilities/default.json | 3 fenetres (toolbar, navbar, panel) |
| src-tauri/src/commands/overlay_commands.rs | Commandes tri-window |
| src-tauri/src/lib.rs | Enregistrement nouvelles commandes |

### Frontend (Part 2)
| Fichier | Action |
|---------|--------|
| src/stores/navStore.ts | NOUVEAU - etat navigation partage |
| src/views/ToolbarView.tsx | NOUVEAU - barre outil (28px) |
| src/views/NavbarView.tsx | NOUVEAU - barre navigation (72px) |
| src/views/PanelView.tsx | NOUVEAU - panneau contenu |
| src/App.tsx | Router par label de fenetre |
| src/lib/overlayTracker.ts | Reecrit pour tri-window |
| src/globals.css | Simplifie (retire expand-circle) |

## Test checklist

- [ ] `npm run tauri dev` compile sans erreur
- [ ] 2 fenetres visibles au demarrage (toolbar + navbar)
- [ ] Clic "Perso" ouvre le panel au-dessus de la navbar
- [ ] Clic "+" affiche les sous-tabs (Combats, Metiers, Economie)
- [ ] Clic "Parametres" ouvre le panel Options
- [ ] Re-clic sur un tab actif ferme le panel
- [ ] Le toolbar est draggable
- [ ] F12 toggle le click-through
- [ ] Le pin (epingle) maintient l overlay au premier plan
- [ ] Minimize envoie tout dans le tray

## Notes techniques

- toolbar et navbar sont declarees dans tauri.conf.json (fenetres statiques)
- panel est cree dynamiquement via WebviewWindowBuilder (fenetre dynamique)
- La communication inter-fenetres utilise emit/listen de Tauri
- Le polling Wakfu (1Hz) repositionne navbar sous toolbar a chaque tick
- Le subclass WndProc n est installe que sur toolbar (pas navbar ni panel)