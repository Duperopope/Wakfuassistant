/**
 * WidgetBay.tsx — Barre de contrôle + onglets de navigation.
 *
 * NOMENCLATURE :
 *   Barre de contrôle  = FooterBar  = la bande tout en bas avec [fold | pin | œil | X]
 *   Barre d'onglets    = TabBar     = la rangée d'icônes au-dessus de la barre de contrôle
 *   Zone de contenu    = Content    = le panneau d'onglet actif (fold=2 seulement)
 *
 * HAUTEURS CSS (border-box, Tailwind base 16px) :
 *   FOOTER_H = 28px  (h-7)
 *   TABS_H   = 38px  (py-1.5×2 + icon 14 + gap 2 + label 9 + border-t 1)
 *
 * FOLD STATES :
 *   0 = barre de contrôle seule          → fenêtre 28px
 *   1 = barre de contrôle + onglets      → fenêtre 66px
 *   2 = tout déplié (contenu de l'onglet actif) → fenêtre = tabHeight[activeTab]
 *
 * ANCRAGE BAS : le fold expand/collapse vers le HAUT, la barre de contrôle
 * reste au même endroit sur l'écran.
 *
 * PAR-ONGLET : chaque onglet mémorise sa dernière hauteur dépliée.
 *   Clic sur onglet actif (fold=2)      → referme (fold=1)
 *   Clic sur autre onglet (fold=2)      → change onglet, applique sa hauteur
 *   Clic sur n'importe quel onglet (fold≤1) → déplie à la hauteur de cet onglet
 */
import type { Component } from "solid-js";
import { For, Show, createEffect, createSignal, onMount } from "solid-js";
import { gameState } from "../../stores/sessionStore";
import {
  togglePin, isPinned, isClickThrough, setClickThrough,
  adjustOpacity, setFoldHeightOverride, notifyTabHeight,
} from "../../lib/overlayTracker";
import { minimizeToTray } from "../../lib/tray";
import { loadSettings, saveSettings } from "../../lib/settings";
import { L } from "../../lib/logger";
import { invoke } from "@tauri-apps/api/core";

// ── Constantes de hauteur (pixels CSS, border-box) ───────────────────────────
const FOOTER_H = 28;   // h-7
const TABS_H   = 38;   // py-1.5 + icons + border-t
const DEFAULT_TAB_H = 220;  // hauteur par défaut d'un onglet dépliée

// ── Types ────────────────────────────────────────────────────────────────────
export type TabId = "character" | "combat" | "professions" | "economy" | "options";
export type FoldState = 0 | 1 | 2;

const TABS: Array<{ id: TabId; label: string; icon: string }> = [
  { id: "character",   label: "Perso",     icon: "\u{1F464}" },
  { id: "combat",      label: "Combat",    icon: "\u2694"    },
  { id: "professions", label: "M\u00e9tiers",  icon: "\u26CF"    },
  { id: "economy",     label: "\u00c9conomie", icon: "\u{1F4B0}" },
  { id: "options",     label: "Options",   icon: "\u2699"    },
];

// ── Signaux globaux (partagés avec App.tsx) ──────────────────────────────────
const [activeTab,  setActiveTab]  = createSignal<TabId>("character");
const [foldState,  setFoldState]  = createSignal<FoldState>(1);
const [hoveredTab, setHoveredTab] = createSignal<TabId | null>(null);

/** Hauteurs par onglet en CSS px — chargées depuis settings.tabHeights */
const [tabHeights, setTabHeights] = createSignal<Partial<Record<TabId, number>>>({});

export { activeTab, foldState, hoveredTab };

// ── Chargement initial ───────────────────────────────────────────────────────

loadSettings().then((s) => {
  setFoldState((s.foldState ?? 1) as FoldState);
  setTabHeights(s.tabHeights as Partial<Record<TabId, number>> ?? {});
  L.ui.debug('WidgetBay', 'settings chargés',
    { foldState: s.foldState, tabHeights: s.tabHeights });
}).catch((e) => L.ui.error('WidgetBay', 'loadSettings échoué', e));

// ── Helpers ──────────────────────────────────────────────────────────────────

function getTabHeight(tab: TabId): number {
  return tabHeights()[tab] ?? DEFAULT_TAB_H;
}

/**
 * Applique le fold state courant à la fenêtre via setFoldHeightOverride.
 * fold=0 → 28px, fold=1 → 66px, fold=2 → hauteur de l'onglet actif.
 */
function applyCurrentFold(): void {
  const fold = foldState();
  switch (fold) {
    case 0: {
      const h = FOOTER_H;
      L.ui.debug('applyCurrentFold', `fold=0 → ${h}px`);
      setFoldHeightOverride(h);
      break;
    }
    case 1: {
      const h = FOOTER_H + TABS_H;
      L.ui.debug('applyCurrentFold', `fold=1 → ${h}px`);
      setFoldHeightOverride(h);
      break;
    }
    case 2: {
      const h = getTabHeight(activeTab());
      L.ui.debug('applyCurrentFold', `fold=2 onglet=${activeTab()} → ${h}px`);
      setFoldHeightOverride(h);
      break;
    }
  }
}

/** Persiste le fold state dans les settings. */
function saveFold(fold: FoldState): void {
  loadSettings().then(async (s) => {
    s.foldState = fold;
    await saveSettings(s);
    L.ui.debug('saveFold', `fold=${fold} sauvegardé`);
  }).catch((e) => L.ui.error('saveFold', 'erreur', e));
}

// ── Effets réactifs ──────────────────────────────────────────────────────────

createEffect(() => {
  applyCurrentFold();
  L.ui.debug('createEffect[fold]', `fold=${foldState()} activeTab=${activeTab()}`);
  sendEyeZone();
});

// ── Zone interactive bouton œil ──────────────────────────────────────────────

/**
 * Envoie la position physique du bouton œil au backend Win32.
 * Barre de contrôle layout (de droite à gauche) : X(28) | œil(28) | pin(28) | fold(28) | drag
 * → œil : x = W - 56, y = H - FOOTER_H, w = h = 28
 */
function sendEyeZone(): void {
  const dpr = window.devicePixelRatio;
  const W = window.innerWidth;
  const H = window.innerHeight;
  const x = Math.round((W - 56) * dpr);
  const y = Math.round((H - FOOTER_H) * dpr);
  const sz = Math.round(28 * dpr);
  L.ui.debug('sendEyeZone', `zone œil → x=${x} y=${y} sz=${sz} (W=${W} H=${H} dpr=${dpr})`);
  invoke('update_interactive_zone', { x, y, w: sz, h: sz }).catch(
    (e) => L.ui.error('sendEyeZone', 'invoke échoué', e)
  );
}

// ── Actions utilisateur ──────────────────────────────────────────────────────

/**
 * Bascule le fold via le bouton de la barre de contrôle.
 * fold=2 → fold=1 (collapse, garde les onglets visibles)
 * fold=1 → fold=2 (expand le dernier onglet actif)
 * fold=0 → fold=1 (affiche les onglets)
 */
function cycleFold(): void {
  const cur = foldState();
  let next: FoldState;
  if (cur === 2) next = 1;
  else if (cur === 1) next = 2;
  else next = 1; // fold=0 → fold=1
  L.ui.info('cycleFold', `fold: ${cur} → ${next}`);
  setFoldState(next);
  saveFold(next);
}

/**
 * Clic sur un onglet :
 * - Si l'onglet est actif ET fold=2 : referme le contenu (fold→1)
 * - Sinon : ouvre cet onglet à sa hauteur stockée (fold→2)
 */
function handleTabClick(tab: TabId): void {
  const cur = foldState();
  const curTab = activeTab();
  L.ui.info('handleTabClick', `clic onglet=${tab} (actuel=${curTab} fold=${cur})`);

  if (tab === curTab && cur === 2) {
    // Toggle : referme le contenu
    L.ui.debug('handleTabClick', 'même onglet fold=2 → fermeture');
    setFoldState(1);
    saveFold(1);
  } else {
    // Ouvre (ou change d'onglet) — applique la hauteur de cet onglet
    const h = getTabHeight(tab);
    L.ui.debug('handleTabClick', `ouverture onglet=${tab} hauteur=${h}px`);
    setActiveTab(tab);
    setFoldState(2);
    saveFold(2);
    // applyCurrentFold via createEffect mais on peut aussi forcer direct
  }
}

// ── Sous-composants ──────────────────────────────────────────────────────────

function StatusDot() {
  const color = () => {
    const s = gameState();
    switch (s.state) {
      case "InGame": case "InCombat": return "bg-victory-green";
      case "Loading": return "bg-kamas animate-pulse";
      case "Disconnected": return "bg-defeat-red";
      default: return "bg-text-muted";
    }
  };
  return <div class={`w-1.5 h-1.5 rounded-full shrink-0 ${color()}`} />;
}

/**
 * Barre de contrôle — band tout en bas de l'overlay (hauteur fixe 28px = h-7).
 * Contient : [zone drag | fold ▲▼ | pin 📌 | œil 👁 | fermer ✕]
 * Clic droit sur fold → minimize to tray.
 * Molette sur œil → ajuste opacité.
 */
function FooterBar() {
  // Icône du bouton fold selon l'état
  const foldIcon = () =>
    foldState() === 2
      ? "M0 6L5 0L10 6z"   // chevron haut = replier
      : "M0 0L5 6L10 0z";  // chevron bas = déplier

  const handleEyeWheel = (e: WheelEvent) => {
    e.preventDefault();
    const delta = e.deltaY < 0 ? 0.05 : -0.05;
    L.ui.debug('handleEyeWheel', `opacité delta=${delta}`);
    adjustOpacity(delta).catch((err) => L.ui.error('handleEyeWheel', 'erreur', err));
  };

  const handleEyeClick = () => {
    const next = !isClickThrough();
    L.ui.info('handleEyeClick', `click-through → ${next}`);
    setClickThrough(next).catch((err) => L.ui.error('handleEyeClick', 'erreur', err));
  };

  return (
    <div
      data-tauri-drag-region
      class="flex items-center h-7 bg-titlebar border-t border-overlay-border select-none shrink-0 overflow-hidden"
    >
      {/* Zone de drag */}
      <div data-tauri-drag-region class="flex-1 h-full flex items-center gap-1.5 px-2 overflow-hidden">
        <StatusDot />
      </div>

      {/* Fold ▲▼ — clic gauche: cycle | clic droit: minimize to tray */}
      <button
        onClick={cycleFold}
        onContextMenu={(e) => {
          e.preventDefault();
          L.ui.info('fold.contextMenu', 'minimize to tray');
          minimizeToTray().catch(() => {});
        }}
        class="w-7 h-7 flex items-center justify-center text-text-muted hover:text-text-primary hover:bg-overlay-surface/30 transition-colors shrink-0"
        title={`${foldState() === 2 ? "R\u00e9duire" : "Agrandir"} | Clic droit: masquer`}
      >
        <svg width="10" height="6" viewBox="0 0 10 6">
          <path fill="currentColor" d={foldIcon()} />
        </svg>
      </button>

      {/* Pin 📌 */}
      <button
        onClick={() => { L.ui.info('pin.click', `pin actuel: ${isPinned()}`); togglePin().catch(() => {}); }}
        class={`w-7 h-7 flex items-center justify-center transition-colors shrink-0 ${
          isPinned() ? "text-kamas" : "text-text-muted hover:text-text-primary hover:bg-overlay-surface/30"
        }`}
        title={isPinned() ? "D\u00e9verrouiller position" : "Verrouiller position"}
      >
        <svg width="10" height="12" viewBox="0 0 10 12" fill="currentColor">
          <path d="M3 0v5L1 7v1h3v4l1 .5L6 8h3V7L7 5V0z" />
        </svg>
      </button>

      {/* Œil 👁 — opacité + click-through */}
      <button
        onClick={handleEyeClick}
        onWheel={handleEyeWheel}
        class={`w-7 h-7 flex items-center justify-center transition-colors shrink-0 ${
          isClickThrough() ? "text-xp-blue" : "text-text-muted hover:text-text-primary hover:bg-overlay-surface/30"
        }`}
        title={isClickThrough() ? "D\u00e9sactiver click-through" : "Activer click-through | Molette: opacit\u00e9"}
      >
        <svg width="14" height="10" viewBox="0 0 14 10" fill="currentColor">
          <path d="M7 0C3 0 0 5 0 5s3 5 7 5 7-5 7-5S11 0 7 0zm0 8a3 3 0 110-6 3 3 0 010 6z" />
          {!isClickThrough() && <circle cx="7" cy="5" r="1.5" />}
        </svg>
      </button>

      {/* Fermer ✕ → minimize to tray */}
      <button
        onClick={() => { L.ui.info('close.click', 'minimize to tray'); minimizeToTray().catch(() => {}); }}
        class="w-7 h-7 flex items-center justify-center text-text-muted hover:bg-defeat-red/80 hover:text-white transition-colors shrink-0"
        title="Masquer dans le tray"
      >
        <svg width="8" height="8" viewBox="0 0 10 10">
          <path fill="currentColor" d="M1 0L0 1l4 4-4 4 1 1 4-4 4 4 1-1-4-4 4-4-1-1-4 4z" />
        </svg>
      </button>
    </div>
  );
}

/**
 * Barre d'onglets — rangée d'icônes cliquables.
 * Visible quand fold >= 1.
 */
function TabBar() {
  return (
    <div class="flex border-t border-overlay-border/50 shrink-0 overflow-hidden">
      <For each={TABS}>
        {(tab) => (
          <button
            onClick={() => handleTabClick(tab.id)}
            onMouseEnter={() => setHoveredTab(tab.id)}
            onMouseLeave={() => setHoveredTab(null)}
            class={`flex-1 py-1.5 text-center transition-colors min-w-0 ${
              activeTab() === tab.id && foldState() === 2
                ? "text-kamas border-b-2 border-kamas bg-overlay-surface/50"
                : "text-text-muted hover:text-text-secondary hover:bg-overlay-surface/30"
            }`}
            title={`${tab.label} (${getTabHeight(tab.id)}px)`}
          >
            <span class="block text-sm leading-none">{tab.icon}</span>
            <span class="block mt-0.5 text-[9px] leading-none truncate">{tab.label}</span>
          </button>
        )}
      </For>
    </div>
  );
}

// ── Composant principal ──────────────────────────────────────────────────────

const WidgetBay: Component = () => {
  onMount(() => {
    L.ui.info('WidgetBay.onMount', 'monté');
    sendEyeZone();
    window.addEventListener('resize', sendEyeZone);

    // Détecter les resize manuels en fold=2 pour sauver la hauteur par onglet
    window.addEventListener('resize', () => {
      if (foldState() !== 2) return;
      const cssH = window.innerHeight;
      const tab = activeTab();
      const prev = getTabHeight(tab);
      if (Math.abs(cssH - prev) > 2) {
        L.ui.debug('WidgetBay.resize', `onglet=${tab} nouvelle hauteur=${cssH}px (prev=${prev})`);
        setTabHeights(prev => ({ ...prev, [tab]: cssH }));
        notifyTabHeight(tab, cssH);
      }
    });

    return () => {
      L.ui.info('WidgetBay.onCleanup', 'démonté');
      window.removeEventListener('resize', sendEyeZone);
    };
  });

  return (
    <div class="flex flex-col shrink-0 bg-overlay-bg mt-auto overflow-hidden">
      {/* Barre d'onglets (visible si fold >= 1) */}
      <Show when={foldState() >= 1}>
        <TabBar />
      </Show>

      {/* Barre de contrôle (toujours visible) */}
      <FooterBar />
    </div>
  );
};

export default WidgetBay;
