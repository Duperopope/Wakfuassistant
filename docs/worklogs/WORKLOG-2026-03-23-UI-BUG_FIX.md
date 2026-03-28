# WORKLOG — 2026-03-23 — UI — BUG_FIX

> **Composant** : Interface overlay (WidgetBay, shortcuts, overlayTracker, OptionsTab)
> **Type** : BUG_FIX
> **Auteur** : Sam + LLM
> **Version** : 4.0.4

---

## Audit de l'interface — 2026-03-23 ~13:00

### Contexte

Lancement `npm run tauri dev`. App démarrée et fonctionnelle (Wakfu détecté, panel créé).
Trois bugs identifiés à partir des logs de démarrage et analyse statique du code.

---

### Bug 1 — F12 : "HotKey already registered" [CRITIQUE]

**Fichier** : `src/lib/shortcuts.ts`
**Détecté à** : 2026-03-23 12:57:27 (log ERROR)

**Log observé :**
```
[SHORTCUTS] registerShortcuts() — Erreur register F12 |
"HotKey already registered: HotKey { mods: Modifiers(0x0), key: F12, id: 171 }"
```

**Cause :**
`isRegistered("F12")` vérifie si *cette* instance Tauri a enregistré le raccourci.
En hot-reload Vite (cargo rerun), un nouveau processus est créé mais l'ancien
raccourci OS n'est pas forcément nettoyé. Le `isRegistered` retourne `false`
(ce processus ne l'a pas enregistré), mais `register()` échoue parce qu'il est
déjà pris au niveau système.

**Code avant :**
```ts
const already = await isRegistered("F12");
if (already) {
    L.shortcuts.debug("registerShortcuts", "F12 deja enregistre, skip");
    return;
}
await register("F12", ...);
```

**Fix :** Pattern unregister-first (idempotent) :
```ts
try { await unregister("F12"); } catch {}
await register("F12", ...);
```

**Impact :** F12 (toggle click-through) non fonctionnel au démarrage en mode dev.
En production (pas de hot-reload), le bug se manifeste si l'app crash sans cleanup.

---

### Bug 2 — setClickThrough() n'invoque pas Rust [CRITIQUE]

**Fichier** : `src/lib/overlayTracker.ts` ligne 132-136
**Détecté à** : 2026-03-23 13:00 (analyse statique)

**Code avant :**
```ts
export async function setClickThrough(enabled: boolean): Promise<void> {
    setClickThroughSignal(enabled);
    L.overlay.info("setClickThrough", `CT: ${enabled}`);
    scheduleSave();
    // ← invoke("toggle_click_through") ABSENT
}
```

**Cause :**
La fonction met à jour le signal SolidJS (UI) et sauvegarde le setting,
mais ne transmet jamais l'ordre au backend Rust via `invoke("toggle_click_through")`.
Résultat : le bouton œil dans ControlStrip et le raccourci F12 changent l'affichage
mais le click-through Win32 (WndProc NCHITTEST) n'est jamais réellement activé.

**Fix :** Ajouter l'invoke Rust dans la fonction :
```ts
try { await invoke("toggle_click_through", { enabled }); } catch (e) {
    L.overlay.error("setClickThrough", `Rust invoke failed: ${e}`);
}
```

**Impact :** Click-through totalement non fonctionnel (bouton et F12).
Le mode click-through ne peut jamais être activé via l'UI.

---

### Bug 3 — setIsSaving(false) absent dans saveCurrentSettings [MOYEN]

**Fichier** : `src/components/tabs/OptionsTab.tsx` ligne 58-74
**Détecté à** : 2026-03-23 13:05 (analyse statique)

**Code avant :**
```ts
const saveCurrentSettings = async () => {
    setIsSaving(true);
    try {
        // ...
        setStatusMessage("Paramètres sauvegardés ✓");
    } catch (e) {
        setStatusMessage("Erreur sauvegarde ✗");
    } finally {
        // VIDE — setIsSaving(false) manquant !
    }
};
```

**Cause :**
Le bloc `finally` est vide. `setIsSaving(false)` n'est jamais appelé après la sauvegarde.
Le bouton "Sauvegarder" devient définitivement `disabled` après le premier clic.
`setIsSaving(false)` est bien présent dans `refreshCdnCache` mais oublié ici.

**Fix :** Ajouter `setIsSaving(false)` dans le `finally` :
```ts
} finally {
    setIsSaving(false);
}
```

**Bonus identifié :** La version affichée dans OptionsTab est "2.1.0" au lieu de "4.0.4".

---

---

### Bug 4 — Z-order : overlay reste sous Wakfu [CRITIQUE]

**Fichiers** : `src-tauri/src/services/win32_overlay.rs` + `src/lib/overlayTracker.ts`
**Détecté à** : 2026-03-23 ~13:30

**Cause 1 — HWND_TOP vs HWND_TOPMOST :**
`reorder_overlay_above_wakfu` appelait `SetWindowPos(overlay, HWND_TOP, ...)`.
`HWND_TOP` place la fenêtre en tête des fenêtres non-topmost — mais quand Wakfu reçoit
le focus, Windows le remonte lui-même en tête de ce groupe. Résultat : l'overlay
repasse dessous à chaque clic sur Wakfu.

`HWND_TOPMOST` crée une couche séparée, toujours au-dessus de tous les HWND_TOP.
Wakfu (Java, non fullscreen exclusif) est une fenêtre normale — il ne peut pas
passer au-dessus d'un HWND_TOPMOST.

**Fix Rust :**
```rust
// avant
SetWindowPos(overlay, Some(HWND_TOP), ...);

// après
SetWindowPos(overlay, Some(HWND_TOPMOST), ...);
```

**Cause 2 — alwaysOnTop non restauré au démarrage :**
`startOverlayTracker` chargeait `s.pinned` et mettait à jour le signal SolidJS,
mais n'invoquait jamais `set_overlay_always_on_top` côté Rust. L'état visuel
(icône pin) était correct mais la fenêtre n'était pas réellement topmost.

**Fix TS :**
```ts
// Ajouté dans startOverlayTracker, avant toggle_click_through
await invoke("set_overlay_always_on_top", { onTop: pinned() });
```

---

### Bug 5 — Overlay au-dessus de TOUTES les apps (Chrome, Discord...) [CRITIQUE]

**Fichiers** : `src-tauri/src/services/win32_overlay.rs` + `src-tauri/src/lib.rs` + `src-tauri/src/commands/overlay_commands.rs`
**Détecté à** : 2026-03-23 ~14:00

**Cause :**
HWND_TOPMOST permanent (fix bug 4) résout le problème Wakfu mais rend l'overlay
au-dessus de TOUT — Chrome, Discord, etc. L'objectif est :
- Au-dessus de Wakfu quand Wakfu est au premier plan
- En dessous des autres apps quand une autre app prend le focus
- Jamais au-dessus si "pinned" = false (sauf si l'utilisateur pin explicitement)

**Solution — WinEvent hook EVENT_SYSTEM_FOREGROUND :**
`SetWinEventHook` sur `EVENT_SYSTEM_FOREGROUND` (valeur brute 3u32, WINEVENT_OUTOFCONTEXT = 0u32) :
callback instantané (pas de polling) à chaque changement de fenêtre foreground.
- hwnd = overlay → rien (préserver l'état)
- hwnd = Wakfu → HWND_TOPMOST sur main + panel
- hwnd = autre app + !PINNED_STATE →
    1. HWND_NOTOPMOST (sortir de la couche topmost)
    2. `SetWindowPos(overlay, Some(fg_hwnd))` → placer overlay JUSTE EN DESSOUS de l'app foreground

La deuxième étape est critique : HWND_NOTOPMOST seul laisse l'overlay en tête du
groupe non-topmost (toujours au-dessus de Chrome, Discord, etc.).
`SetWindowPos(overlay, Some(fg_hwnd))` insère l'overlay juste sous la fenêtre
foreground dans le Z-order — elle reste au-dessus de Wakfu mais sous toutes les autres.

**Ajouts Rust :**
```rust
// win32_overlay.rs — nouveaux statics
static MAIN_HWND_FOR_HOOK:  AtomicIsize = AtomicIsize::new(0);
static PANEL_HWND_FOR_HOOK: AtomicIsize = AtomicIsize::new(0);
pub static PINNED_STATE: AtomicBool = AtomicBool::new(false);

// start_z_order_hook() — spawn thread avec message loop + SetWinEventHook
// on_foreground_changed() — callback : TOPMOST/NOTOPMOST selon focus
// update_panel_hwnd_for_hook() — appelé à la création du panel
// set_pinned_state() — appelé par set_overlay_always_on_top
```

**Câblage :**
```rust
// lib.rs — setup, après install_nchittest_subclass
services::win32_overlay::start_z_order_hook(hwnd.0 as isize);

// overlay_commands.rs — create_panel_window, après install_nchittest_subclass
win32_overlay::update_panel_hwnd_for_hook(hwnd.0 as isize);

// overlay_commands.rs — set_overlay_always_on_top
#[cfg(windows)]
win32_overlay::set_pinned_state(on_top);
```

**`reorder_overlay_above_wakfu` (poll fallback 1s) :**
Mis à jour avec la même logique :
- fg = Wakfu ou overlay → HWND_TOPMOST
- fg = autre + !pinned → HWND_NOTOPMOST + `SetWindowPos(overlay, Some(fg))`
Le hook est la source principale (instantané) ; le poll (1s) rattrape les cas manqués.

---

---

### Bug 6 — Drag impossible sur la fenêtre principale [CRITIQUE]

**Fichier** : `src/components/Layout/WidgetBay.tsx`
**Détecté à** : 2026-03-23 ~14:30

**Symptôme :** L'utilisateur ne peut pas déplacer la fenêtre overlay, quel que soit l'état du pin.

**Investigation :**

Tauri v2 sur Windows gère le drag via deux mécanismes complémentaires :
1. `data-tauri-drag-region` (attribut HTML) → wry intercepte WM_NCHITTEST et retourne
   HTCAPTION pour les zones marquées → Windows démarre le move loop nativement
2. `appWindow.startDragging()` (JS manuel) → wry appelle ReleaseCapture + PostMessage WM_NCLBUTTONDOWN HTCAPTION

**Cause confirmée — `data-tauri-drag-region` absent sur BottomBar :**
La fenêtre est composée de deux zones :
- `BottomBar` (72px, la grande barre Perso/+/Options) : **aucun** `data-tauri-drag-region`
- `ControlStrip` (24px, la barre Pin/œil/minimize) : `data-tauri-drag-region` sur le div flex-1 gauche uniquement

L'utilisateur essaie naturellement de drag depuis `BottomBar` (la plus grande surface),
qui ne déclenche aucun drag. La petite zone drag dans `ControlStrip` n'est pas évidente.

**Zones drag après fix :**
- `BottomBar` : fond entre les boutons (padding 32px gauche/droite + zones non couvertes)
- `ControlStrip` flex-1 : ~350px × 24px à gauche des boutons

**Fix appliqué :**
```tsx
// avant
<div class="relative flex items-center justify-between px-8 shrink-0"
// après
<div data-tauri-drag-region
     class="relative flex items-center justify-between px-8 shrink-0"
```

**Hypothèses secondaires non écartées (si bug persiste après fix) :**

A. **WndProc subclass installée trop tôt** :
   `install_nchittest_subclass` est appelée dans `lib.rs setup` avant que wry ait
   initialisé son handler WM_NCHITTEST pour les drag regions. `ORIGINAL_WNDPROC`
   capture le WndProc d'avant la drag region de wry → `CallWindowProcW(original, WM_NCHITTEST)`
   ne retourne pas HTCAPTION → pas de drag.
   **Test** : déplacer `install_nchittest_subclass` pour ne l'appeler qu'au premier
   `toggle_click_through` (supprimer l'appel de `lib.rs`).

B. **`startDragging()` inefficace sur fenêtre non-décorée** :
   `WM_NCLBUTTONDOWN HTCAPTION` via `DefWindowProcW` est ignoré pour les fenêtres
   sans `WS_CAPTION` (`decorations: false`). Le mécanisme WM_NCHITTEST → HTCAPTION
   est le seul chemin fiable pour les overlays non-décorés.

---

## Corrections appliquées

| # | Fichier | Type | Statut |
|---|---|---|---|
| 1 | `src/lib/shortcuts.ts` | unregister-first pour F12 | CORRIGÉ |
| 2 | `src/lib/overlayTracker.ts` | invoke toggle_click_through | CORRIGÉ |
| 3 | `src/components/tabs/OptionsTab.tsx` | setIsSaving finally + version | CORRIGÉ |
| 4 | `src-tauri/src/services/win32_overlay.rs` | HWND_TOPMOST au lieu de HWND_TOP | CORRIGÉ |
| 4b | `src/lib/overlayTracker.ts` | restauration alwaysOnTop au démarrage | CORRIGÉ |
| 5 | `src-tauri/src/services/win32_overlay.rs` | WinEvent hook EVENT_SYSTEM_FOREGROUND | CORRIGÉ |
| 5b | `src-tauri/src/lib.rs` | start_z_order_hook au setup | CORRIGÉ |
| 5c | `src-tauri/src/commands/overlay_commands.rs` | update_panel_hwnd + set_pinned_state | CORRIGÉ |
| 5d | `src-tauri/src/services/win32_overlay.rs` | SetWindowPos(overlay, Some(fg_hwnd)) après NOTOPMOST | CORRIGÉ |
| 6 | `src/components/Layout/WidgetBay.tsx` | data-tauri-drag-region sur BottomBar | CORRIGÉ (à valider) |

---

## Etat de l'interface post-correction

### Fonctionnel (VALIDE)
- Démarrage dual-window (main 420x96 + panel 420x420)
- WidgetBay : navigation Perso / + expand / Options
- ControlStrip : StatusDot, Pin, œil click-through, minimize tray
- Système de thèmes (4 presets, appliqué en direct)
- Persistance des settings (plugin-store)
- Poll Wakfu 1s (détection fenêtre)
- Positionnement panel au-dessus de main
- Suivi position au drag (position_panel_above_main)
- Z-order : au-dessus de Wakfu uniquement, sous les autres apps (WinEvent hook)

### Non fonctionnel / EN COURS
- Drag fenêtre : data-tauri-drag-region ajouté sur BottomBar — à valider ; si KO, investiguer hypothèse WndProc (voir Bug 6)
- Click-through : fonctionnel après correction bug 2 (à valider en jeu)
- F12 : fonctionnel après correction bug 1 (à valider)
- Bouton Sauvegarder OptionsTab : fonctionnel après correction bug 3
- Onglets Personnage, Combat, Métiers, Économie : UI présente, données réelles non connectées
- Animation slide-exit du panel : `setIsOpen(false)` synchrone avec `animClass`, l'animation ne joue pas

### Notes
- Version Rust : 2.2.0 (lib.rs) / Tauri conf : 4.0.4 / OptionsTab affichait 2.1.0 → corrigé en 4.0.4
- F12 vérifié via `isRegistered` (ne suffit pas en dev) → remplacé par unregister-first
- Hook WinEvent : WINEVENT_OUTOFCONTEXT = callback dans le thread du hook, pas dans celui de Wakfu
- Drag : si data-tauri-drag-region ne suffit pas, l'hypothèse A (WndProc timing) est la prochaine à tester
