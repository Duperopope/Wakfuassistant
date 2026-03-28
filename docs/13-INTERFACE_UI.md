# Wakfu Assistant — Interface utilisateur : Reference d'implementation
# Documentation technique complete — Systeme overlay dual-window
# Derniere mise a jour : 2026-03-23
# Statut : VALIDE

---

## Table des matieres

1. Vue d'ensemble
2. Architecture dual-window
3. Fenetre principale (main)
4. Composant WidgetBay
5. Systeme de navigation et signaux SolidJS
6. Fenetre panel
7. Systeme click-through Win32
8. Systeme de themes
9. Persistance des settings
10. Raccourcis clavier
11. Cycle de vie et initialisation
12. Workflow developpement (HMR)
13. Fichiers de reference

---

## 1. Vue d'ensemble

L'interface est une overlay Tauri v2 composee de deux fenetres independantes :
- main : barre de navigation fixe 420x96 px, toujours visible.
- panel : contenu expandable (420x420 px), cree a la premiere ouverture, masquee/affichee ensuite.

Le frontend est ecrit en SolidJS avec Vite. La reactivite fine-grained de SolidJS est
choisie deliberement : contrairement a React, les composants ne re-rendent pas
integralement — seuls les noeuds DOM affectes sont mis a jour. Cela est critique pour
une overlay qui doit rester legere et ne pas se faire detecter par les anti-cheat.

La communication entre fenetres se fait via les evenements Tauri (emit/listen).
La logique d'overlay (position, click-through, pin, opacite) est geree par
overlayTracker.ts cote frontend, et par overlay_commands.rs + win32_overlay.rs cote Rust.

---

## 2. Architecture dual-window

### 2.1 Schema

    App.tsx (point d'entree)
      |
      +-- windowLabel === "main"  -> composant principal
      |     +-- WidgetBay (420x72 px) — barre de navigation
      |     +-- ControlStrip (420x24 px) — controles overlay
      |
      +-- windowLabel === "panel" -> PanelView
            +-- Header (40 px) — titre de l'onglet actif
            +-- Zone de contenu — onglet actif monte ici

### 2.2 Configuration des fenetres (tauri.conf.json)

Fenetre main :
  label: "main", width: 420, height: 96
  decorations: false, transparent: true
  alwaysOnTop: false, resizable: false, visible: false
  skipTaskbar: true

La fenetre panel n'est pas declaree dans tauri.conf.json. Elle est creee dynamiquement
par la commande Rust create_panel_window a la premiere ouverture. Sa taille physique
est calculee en tenant compte du scale factor (ecrans HiDPI).

### 2.3 Pourquoi deux fenetres ?

Une seule fenetre avec le panel integre necessite de redimensionner la fenetre
main a chaque ouverture/fermeture. Sur Windows, le redimensionnement d'une fenetre
transparente cause des artefacts visuels (clignotements, zones noires). La separation
en deux fenetres evite entierement ce probleme.

---

## 3. Fenetre principale (main)

### 3.1 Dimensions

    Hauteur totale      : 96 px CSS (FOOTER_H_CSS dans overlayTracker.ts)
    BottomBar           : 72 px (icones de navigation)
    ControlStrip        : 24 px (pin, click-through, minimize)
    Largeur             : 420 px CSS (BAR_WIDTH_CSS)

### 3.2 Comportement au demarrage (onMount dans App.tsx)

1. loadAndApplyTheme() — applique le theme sauvegarde.
2. loadSettings() — si verboseLogs, active les logs Rust.
3. startOverlayTracker() — restaure la position, desactive click-through,
   met en place le poll Wakfu, ecoute panel-ready.
4. Ecoute de panel-ready — quand le panel confirme son montage,
   App.tsx lui envoie l'etat actuel (tab actif + panelOpen).
5. registerShortcuts() — enregistre F12.
6. setupTray() — icone systray.
7. win.show() — affiche la fenetre (elle demarre invisible pour eviter le flash).

### 3.3 Nettoyage (onCleanup dans App.tsx)

stopOverlayTracker(), unregisterShortcuts(), closeTray().

---

## 4. Composant WidgetBay

Fichier : src/components/Layout/WidgetBay.tsx

### 4.1 Structure

    WidgetBay
      +-- BottomBar (72 px)
      |     +-- Bouton Perso (icone maison, gauche)
      |     +-- Bouton + (centre, position absolue, deborde vers le haut)
      |     |     +-- expand-circle (animation CSS)
      |     |     |     +-- Icone + / x (rotation CSS)
      |     |     |     +-- For each EXPAND_TABS
      |     |     |           +-- Bouton Combat / Metiers / Economie
      +-- ControlStrip (24 px)
            +-- StatusDot (indicateur connexion Wakfu)
            +-- Bouton Pin (+ clic droit : lien largeur)
            +-- Bouton Click-through (+ molette : opacite)
            +-- Bouton Minimize (systray)

### 4.2 Bouton + (expand-circle)

Le bouton + est positionne en absolu au centre de BottomBar, avec un debordement
vers le haut (bottom: 8px). Il contient les onglets expandables.

Comportement :
- Panel ferme : clic ouvre le panel + l'expand (affiche les onglets secondaires).
- Panel ouvert : clic toggle l'expand seulement.

Animation : la classe CSS expand-circle / expanded controle la hauteur via transition.
L'icone + pivote de 45deg quand expanded (devient x).

### 4.3 StatusDot

Indicateur couleur dans ControlStrip :
- Vert (bg-victory-green) : Wakfu detecte (wakfuDetected()) ou etat InGame/InCombat.
- Bleu pulse (bg-accent) : etat Loading.
- Rouge (bg-defeat-red) : Disconnected.
- Gris (bg-text-muted) : Idle / inconnu.

### 4.4 Bouton Pin

- Clic gauche : togglePin() — active alwaysOnTop sur main ET panel.
- Clic droit : toggleWidthLink() — lie ou delie les largeurs des deux fenetres
  (fonctionnalite future, indicateur point bleu en badge).

### 4.5 Bouton Click-through

- Clic : toggle mode click-through (F12).
- Molette (normal) : ajuste l'opacite du panel (adjustPanelOpacity +/-0.05).
- Molette (Ctrl ou panel ferme) : ajuste l'opacite de la barre (adjustBarOpacity).

---

## 5. Systeme de navigation et signaux SolidJS

### 5.1 Signaux partages (module-level dans WidgetBay.tsx)

    activeTab  : Signal<TabId | null>  — onglet actif (null si panel ferme)
    expandOpen : Signal<boolean>       — expand ouvert ou non
    panelOpen  : Signal<boolean>       — panel fenetre visible ou non

Ces signaux sont declares en dehors du composant, ce qui les rend persistants
entre les remontages. activeTab et panelOpen sont exportes et consommes par App.tsx.

### 5.2 Type TabId

    type TabId = "character" | "combat" | "professions" | "economy" | "options"

HOME_TAB = "character", SETTINGS_TAB = "options".
EXPAND_TABS = ["combat", "professions", "economy"] (les trois onglets expandables).

### 5.3 Logique de navigation

handleHomeClick :
  Si actif + panel ouvert -> ferme panel (toggle off).
  Sinon -> setActiveTab("character") + setPanelOpen(true).

handleSettingsClick :
  Meme logique pour "options".

handlePlusClick :
  Si panel ferme -> ouvre panel sur le dernier onglet (ou "character") + ouvre expand.
  Si panel ouvert -> toggle expand seulement.

handleExpandTabClick(tabId) :
  Si meme onglet + panel ouvert -> ferme panel (toggle off).
  Sinon -> setActiveTab(tabId) + setPanelOpen(true).
  Dans tous les cas -> setExpandOpen(false).

### 5.4 Reaction de App.tsx aux signaux

createEffect sur panelOpen() :
  true  -> openPanel(), puis emit("tab-change", { tab, open: true }).
  false -> closePanel(), puis emit("tab-change", { tab: null, open: false }).

createEffect sur activeTab() :
  Si panel ouvert -> emit("tab-change", { tab, open: true }).

### 5.5 Pourquoi emit plutot qu'un store partage ?

Les deux fenetres sont des processus WebView distincts. Un store SolidJS n'est pas
partage entre elles. La communication passe obligatoirement par les evenements Tauri.
emit() envoie un message a toutes les fenetres (broadcast). La fenetre panel ecoute
via listen("tab-change").

---

## 6. Fenetre panel

Fichier : src/App.tsx (composant PanelView)

### 6.1 Creation et cycle de vie

La fenetre panel est creee a la premiere invocation de openPanel() via la commande
Rust create_panel_window(x, y, width, height).

Apres creation, le panel emet panel-ready. App.tsx ecoute cet evenement et envoie
immediatement l'etat actuel. Cela synchronise le panel meme si l'emit initial
arrive avant que le listener soit en place.

Fallback : si panel-ready n'arrive pas en 3 secondes, openPanel() force un show_panel_window.

### 6.2 Positionnement

Position initiale : juste au-dessus de la fenetre main.
  panelY = mainPos.y - panelHPhys
  panelX = mainPos.x

Le panel suit le deplacement de main via l'evenement onMoved (dans startOverlayTracker).

### 6.3 Onglets du panel

Selon currentTab(), PanelView monte le composant correspondant :
  "character"   -> CharacterTab   (stats personnage, evenements recents)
  "combat"      -> CombatTab      (stats combat en cours)
  "professions" -> ProfessionsTab (niveaux metiers)
  "economy"     -> EconomyTab     (donnees HDV, crafts)
  "options"     -> OptionsTab     (themes, langue, opacite, logs)

### 6.4 Animation d'entree/sortie

A l'ouverture : classe CSS panel-slide-enter.
A la fermeture : classe CSS panel-slide-exit (250 ms), puis hide.

### 6.5 Opacite du panel

Le panel ecoute opacity-change pour ajuster --panel-opacity en temps reel.
Ce CSS custom property est applique sur le conteneur principal du panel.

---

## 7. Systeme click-through Win32

Fichier : src-tauri/src/services/win32_overlay.rs

### 7.1 Principe

Le click-through partiel est implemente via un WndProc subclass personnalise.
En mode click-through (CT_MODE = true), chaque message WM_NCHITTEST est intercepte :
- Si le curseur est dans la zone interactive -> retourner HTCLIENT (fenetre recoit le clic).
- Sinon -> retourner HTTRANSPARENT (le clic passe a la fenetre derriere).

En mode normal (CT_MODE = false), le WndProc appelle simplement le WndProc original.
La fenetre principale ne passe jamais entierement en click-through au demarrage
(toggle_click_through(enabled: false) dans startOverlayTracker).

### 7.2 Installation du subclass

install_nchittest_subclass(hwnd) :
  Appele lors du premier toggle_click_through.
  SetWindowLongPtrW(hwnd, GWLP_WNDPROC, overlay_wndproc) remplace le WndProc.
  ORIGINAL_WNDPROC stocke le pointeur original pour CallWindowProcW.
  Ne s'installe qu'une fois (garde par ORIGINAL_WNDPROC != 0).

### 7.3 Zone interactive

set_interactive_zone(x, y, w, h) :
  Stockee dans INTERACTIVE_ZONE (Mutex<Option<(i32, i32, i32, i32)>>).
  Par defaut : x=0, y=0, w=BAR_WIDTH_CSS*sf, h=FOOTER_H_CSS*sf (toute la barre).
  Mise a jour par updateInteractiveZone() au demarrage.

Coordonnees en pixels physiques (echelle DPI incluse).

### 7.4 Etats atomiques

    CT_MODE           : AtomicBool — mode click-through actif ou non
    INTERACTIVE_ZONE  : Mutex<Option<(i32,i32,i32,i32)>> — zone cliquable
    ORIGINAL_WNDPROC  : AtomicIsize — pointeur WndProc original

### 7.5 Raccourci F12

F12 global shortcut (plugin-global-shortcut) appelle setClickThrough(!isClickThrough()).
setClickThrough() met a jour le signal SolidJS, appelle invoke("toggle_click_through")
pour activer le WndProc Win32, et sauvegarde via scheduleSave().

---

## 7bis. Systeme Z-order (overlay au-dessus de Wakfu uniquement)

Fichier : src-tauri/src/services/win32_overlay.rs

### Principe

L'overlay doit etre :
- Au-dessus de Wakfu quand Wakfu est au premier plan (ou si pin actif)
- En dessous de toutes les autres apps (Chrome, Discord, etc.) quand elles ont le focus

Deux mecanismes complementaires :

### Hook WinEvent (source principale — instantane)

`start_z_order_hook(main_hwnd)` installe un hook `EVENT_SYSTEM_FOREGROUND`
(valeur 3u32, WINEVENT_OUTOFCONTEXT = 0u32) qui fire a la milliseconde pres
quand n'importe quelle fenetre passe au premier plan.

Logique du callback `on_foreground_changed` :
  1. hwnd = overlay main ou panel → rien (eviter de casser l'etat)
  2. hwnd = fenetre titree "WAKFU" ou "* - WAKFU" → HWND_TOPMOST sur main + panel
  3. hwnd = autre app + PINNED_STATE = false →
       a. HWND_NOTOPMOST : sortir de la couche topmost
       b. SetWindowPos(overlay, Some(fg_hwnd)) : placer overlay SOUS la fenetre fg

L'etape (b) est indispensable : HWND_NOTOPMOST seul laisse l'overlay en tete
du groupe non-topmost. L'etape (b) l'insere juste sous l'app focusee dans le Z-order.
Wakfu etant deja plus bas, l'overlay reste naturellement au-dessus de Wakfu.

### Poll 1s (fallback)

`reorder_overlay_above_wakfu` est appele chaque seconde depuis pollWakfu().
Meme logique que le hook : verifie GetForegroundWindow(), applique TOPMOST ou
NOTOPMOST + position-sous-fg selon PINNED_STATE. Sert de rattrapage si le hook
rate un evenement.

### Etats atomiques

    MAIN_HWND_FOR_HOOK  : AtomicIsize — HWND fenetre main (mis a jour au setup)
    PANEL_HWND_FOR_HOOK : AtomicIsize — HWND fenetre panel (mis a jour a sa creation)
    PINNED_STATE        : AtomicBool  — etat pin (mis a jour par set_overlay_always_on_top)

### Pin utilisateur

Quand l'utilisateur clique Pin :
- PINNED_STATE = true
- Le hook et le poll ne retirent jamais TOPMOST
- L'overlay reste au-dessus de tout

### Note windows-rs 0.61

Les constantes EVENT_SYSTEM_FOREGROUND et WINEVENT_OUTOFCONTEXT n'existent pas
en tant que symboles nommes dans windows-rs 0.61. On utilise les valeurs brutes :
EVENT_SYSTEM_FOREGROUND = 3u32, WINEVENT_OUTOFCONTEXT = 0u32.
HMODULE doit etre wrappee dans Some() pour les fonctions qui prennent Option<HMODULE>.

---

## 8. Systeme de themes

Fichier : src/lib/settings.ts

### 8.1 Presets disponibles

    wakfu-classic : fond blanc (barre), accent orange #E8872A
    wakfu-dark    : fond sombre, accent violet #7B68EE
    wakfu-nature  : fond vert fonce, accent vert #27AE60
    wakfu-fire    : fond rouge fonce, accent rouge-orange #E85D3A

### 8.2 Structure ThemeColors

    accent, accentHover, accentDim  : couleur principale et variantes
    overlayBg, overlaySurface, overlayBorder : fonds panel
    barBg, barIcon, barIconActive   : couleurs barre de navigation
    tabCombat, tabProfessions, tabEconomy : couleurs des boutons expand

### 8.3 Application (applyThemeColors)

Ecrit directement sur document.documentElement.style.setProperty().
CSS custom properties utilisees :
  --color-accent, --color-accent-hover, --color-accent-dim
  --color-overlay-bg, --color-overlay-surface, --color-overlay-border
  --color-bar-bg, --color-bar-icon, --color-bar-icon-active
  --color-tab-combat, --color-tab-professions, --color-tab-economy

IMPORTANT : utilisation de valeurs HEX explicites (pas de oklch ni de fonctions CSS
modernes) pour compatibilite avec WebView2 (Chromium embarque, version variable).

### 8.4 Changement de theme en direct

OptionsTab appelle applyThemeColors() immediatement sur selection, sans attendre
la sauvegarde. La sauvegarde se fait en arriere-plan.

---

## 9. Persistance des settings

Fichier : src/lib/settings.ts

### 9.1 Backend

@tauri-apps/plugin-store : Store.load("settings.json").
Fichier physique : %APPDATA%\wakfu-overlay\settings.json (gere par Tauri).

### 9.2 Interface UserSettings

    clickThroughHotkey : string          — "F12" par defaut
    theme              : "dark"|"light"  — non utilise (remplace par themePreset)
    language           : "fr"|"en"
    overlayOpacity     : number          — opacite panel (0.1 - 1.0, defaut 0.96)
    ctOpacity          : number          — opacite barre (defaut 0.60)
    relOffsetX         : number          — position X (pixels ou ratio si < 2)
    relOffsetY         : number          — position Y
    relSizeW/H         : number          — taille relative (non utilise activement)
    foldState          : 0|1|2           — etat pli (non utilise activement)
    pinned             : boolean
    verboseLogs        : boolean
    tabHeights         : Record<string,number> — hauteurs par onglet (futur)
    themePreset        : string          — cle dans THEME_PRESETS
    customColors       : ThemeColors|null — couleurs custom (override preset)

### 9.3 Positions sauvegardees

relOffsetX/relOffsetY stockent la position physique en pixels.
ATTENTION : l'ancien format stockait des ratios (< 2). La logique de
restoreWindowPosition gere les deux cas (if x < 2 && x > 0 -> convertir).
Les nouvelles sauvegardes utilisent toujours des pixels physiques.

### 9.4 Sauvegarde differee (scheduleSave)

Les changements d'opacite, pin, click-through declenchent scheduleSave() :
debounce de 500 ms pour eviter les ecritures trop frequentes.

---

## 10. Raccourcis clavier

Fichier : src/lib/shortcuts.ts

    F12 : toggle click-through (global shortcut, fonctionne meme si la fenetre n'est pas au premier plan)

Pattern "unregister-first" : unregister("F12") est toujours appele avant register("F12").
Raison : isRegistered() verifie seulement si l'instance courante a enregistre le raccourci,
pas l'etat global OS. En hot-reload Tauri (dev), l'ancienne registration survive
et register() echouerait. Le unregister-first est idempotent et robuste.

---

## 11. Cycle de vie et initialisation

### 11.1 Sequence de demarrage complete

    main.rs
      -> lib.rs : setup Tauri, handlers, plugin-store, plugin-log, plugin-global-shortcut
      -> SQLite init (wakfu_overlay.db)
      -> Fenetre main creee (visible: false)
      -> install_nchittest_subclass(hwnd)   — subclass WndProc pour click-through
      -> start_z_order_hook(hwnd)           — spawn thread WinEvent (EVENT_SYSTEM_FOREGROUND)

    App.tsx (windowLabel === "main")
      -> loadAndApplyTheme()
      -> loadSettings() -> verboseLogs?
      -> startOverlayTracker()
           -> charge settings (pinned, opacites)
           -> invoke set_overlay_always_on_top(pinned)  — restaure TOPMOST si pinned
           -> invoke toggle_click_through(false)
           -> restoreWindowPosition()
           -> updateInteractiveZone()
           -> installe onMoved listener
           -> ecoute panel-ready
           -> demarre poll Wakfu (setInterval 1s)
      -> ecoute panel-ready -> emit tab-change etat actuel
      -> registerShortcuts() -> unregister F12 + register F12
      -> setupTray()
      -> win.show()

    Panel (cree a la demande)
      -> loadAndApplyTheme()
      -> ecoute tab-change -> monte l'onglet correspondant
      -> ecoute opacity-change -> update --panel-opacity
      -> emit panel-ready -> App.tsx repond avec etat actuel

### 11.2 Sequence de fermeture panel

    setPanelOpen(false) dans WidgetBay
      -> createEffect dans App.tsx reagit
      -> closePanel() -> invoke hide_panel_window
      -> emit tab-change { tab: null, open: false }
      -> PanelView reagit -> setAnimClass("panel-slide-exit") -> hide

---

## 12. Workflow developpement (HMR)

### 12.1 Commandes

    npm run tauri dev   : lance Vite dev server (localhost:1420) + Cargo run
    npm run dev         : Vite seul (pas Tauri, pour debug frontend pur)
    npm run build       : build production (npm run build -> cargo tauri build)

### 12.2 HMR SolidJS + Vite

Vite fournit le HMR (Hot Module Replacement) automatiquement en mode dev.
vite-plugin-solid + solid-refresh remplacent les composants modifies sans
recharger la page entiere. Les signaux SolidJS reactifs sont preserves entre
les rechargements de modules.

IMPORTANT : le hot-reload ne reexecute pas onMount/onCleanup si le composant
n'est pas demonte. Les effets de bord (setInterval, listeners Tauri) survivent
au hot-reload. En pratique : modifier WidgetBay.tsx ou les onglets est instantane.
Modifier overlayTracker.ts ou App.tsx provoque un rechargement complet de la page
(perte de l'etat des signaux).

### 12.3 Rechargement Rust

Modifier src-tauri/ redeclenche cargo run automatiquement (Tauri watcher).
Le rechargement Rust ferme et recrée le processus — les fenetres redemarrent.

### 12.4 Pourquoi SolidJS plutot que React pour une overlay

React re-rend l'ensemble de l'arbre de composants a chaque changement d'etat,
meme avec memo/useCallback. SolidJS compile les templates JSX en operations DOM
directes — un signal qui change met a jour un seul noeud DOM sans diff virtuel.
Pour une overlay transparente qui doit etre fluide a 60fps sans impact CPU, c'est
le choix correct.

---

## 13. Fichiers de reference

### 13.1 Frontend

    src/App.tsx                           Point d'entree, routing main/panel
    src/components/Layout/WidgetBay.tsx   Barre de navigation + signaux partages
    src/components/tabs/CharacterTab.tsx  Onglet personnage (stats, evenements)
    src/components/tabs/CombatTab.tsx     Onglet combat
    src/components/tabs/ProfessionsTab.tsx Onglet metiers
    src/components/tabs/EconomyTab.tsx    Onglet economie (HDV)
    src/components/tabs/OptionsTab.tsx    Onglet options (themes, settings)
    src/lib/overlayTracker.ts             Logique overlay (position, CT, panel)
    src/lib/settings.ts                   Persistance settings + themes
    src/lib/shortcuts.ts                  Raccourci F12
    src/lib/logger.ts                     Logger structure (categories)
    src/lib/tray.ts                       Icone systray
    src/stores/sessionStore.ts            Store SolidJS session jeu

### 13.2 Backend Rust

    src-tauri/src/commands/overlay_commands.rs  Commandes Tauri (CT, panel, bounds, pin)
    src-tauri/src/services/win32_overlay.rs     WndProc subclass NCHITTEST + WinEvent hook Z-order
    src-tauri/src/lib.rs                        Setup Tauri, enregistrement commandes, hook init

### 13.3 Configuration

    src-tauri/tauri.conf.json   Config fenetres, CSP, bundle NSIS
    package.json                Scripts npm, dependances
    vite.config.ts              Config Vite (port 1420)

---

## Historique

    Date        Action
    2026-03-23  Creation initiale — documentation complete systeme UI v4.0.4
    2026-03-23  Corrections bugs 1-5 (F12, CT invoke, setIsSaving, Z-order hook WinEvent)
                Ajout section 7bis Z-order, mise a jour sequences demarrage et raccourcis
