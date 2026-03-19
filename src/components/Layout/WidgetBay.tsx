import type { Component } from "solid-js";
import { For, createSignal } from "solid-js";
import { Dynamic } from "solid-js/web";
import {
  baySnap, setBaySnap,
  widgetRows,
  BAY_SNAPS, TAB_STRIP_H, WIDGET_ROW_H,
} from "../../stores/widgetStore";
import type { WidgetId } from "../../stores/widgetStore";
import KamasBalance   from "../widgets/KamasBalance";
import KamasSession   from "../widgets/KamasSession";
import CombatStats    from "../widgets/CombatStats";
import XpGained       from "../widgets/XpGained";
import ParserHealth   from "../widgets/ParserHealth";
import CharacterInfo  from "../widgets/CharacterInfo";

export type TabId = "character" | "combat" | "professions" | "economy" | "options";

const FULL_HEIGHT  = 600;
const WINDOW_WIDTH = 400;

const WIDGET_REGISTRY: Record<WidgetId, Component> = {
  "kamas-balance":  KamasBalance,
  "kamas-session":  KamasSession,
  "combat-stats":   CombatStats,
  "xp-gained":      XpGained,
  "parser-health":  ParserHealth,
  "character-info": CharacterInfo,
};

// cols → Tailwind flex grow class
const COL_FLEX: Record<1 | 2 | 3 | 4, string> = {
  1: "flex-1",
  2: "flex-[2]",
  3: "flex-[3]",
  4: "flex-[4]",
};

const TABS = [
  { id: "character"   as TabId, label: "Perso",    icon: "👤" },
  { id: "combat"      as TabId, label: "Combat",   icon: "⚔"  },
  { id: "professions" as TabId, label: "Métiers",  icon: "⛏"  },
  { id: "economy"     as TabId, label: "Économie", icon: "💰" },
  { id: "options"     as TabId, label: "Options",  icon: "⚙"  },
];

// ── Module-level signals (stable across re-renders) ──────────────────────────
const [activeTab,   setActiveTab]   = createSignal<TabId>("character");
const [collapsed,   setCollapsed]   = createSignal(false);
const [hoveredTab,  setHoveredTab]  = createSignal<TabId | null>(null);

const WidgetBay: Component = () => {
  /** Nombre de lignes de widgets visibles selon le snap actuel */
  const visibleRows = () => Math.floor((baySnap() - TAB_STRIP_H) / WIDGET_ROW_H);

  /** Cycle le snap de la baie (48 → 112 → 176 → 48 …) */
  const cycleBaySnap = () => {
    const idx      = BAY_SNAPS.findIndex((s) => s === baySnap());
    const nextSnap = BAY_SNAPS[(idx + 1) % BAY_SNAPS.length];
    setBaySnap(nextSnap);
    console.log(`[WidgetBay] Bay snap → ${nextSnap}`);
  };

  /** Bascule entre vue complète et vue miniature (tab bar seule) */
  const toggleCollapse = () => {
    const next = !collapsed();
    setHoveredTab(null);
    setCollapsed(next);
    console.log(`[WidgetBay] collapsed → ${next}`);
  };

  return (
    <div class="flex flex-col shrink-0 border-t border-overlay-border bg-overlay-bg">

      {/* ── Handle redimensionnement (clic = cycle snap) ────────────────── */}
      <button
        onClick={cycleBaySnap}
        class="h-1.5 w-full cursor-ns-resize hover:bg-kamas/30 active:bg-kamas/60 transition-colors"
        title="Cliquer pour ajuster la hauteur"
      />

      {/* ── Lignes de widgets ────────────────────────────────────────────── */}
      <For each={widgetRows().slice(0, visibleRows())}>
        {(row) => (
          <div class="flex gap-1 px-1.5 pb-2">
            <For each={row}>
              {(slot) => (
                <div class={COL_FLEX[slot.cols]}>
                  <Dynamic component={WIDGET_REGISTRY[slot.id]} />
                </div>
              )}
            </For>
          </div>
        )}
      </For>

      {/* ── Barre d'onglets ─────────────────────────────────────────────── */}
      <div class="flex">
        <For each={TABS}>
          {(tab) => (
            <button
              onClick={() => setActiveTab(tab.id)}
              onMouseEnter={() => setHoveredTab(tab.id)}
              onMouseLeave={() => setHoveredTab(null)}
              class={`flex-1 py-1 text-center transition-colors ${
                activeTab() === tab.id
                  ? "text-kamas border-t-2 border-kamas bg-overlay-surface/50"
                  : "text-text-muted hover:text-text-secondary hover:bg-overlay-surface/30"
              }`}
              title={tab.label}
            >
              <span class="block text-sm leading-none">{tab.icon}</span>
              <span class="block mt-0.5 text-[9px] leading-none">{tab.label}</span>
            </button>
          )}
        </For>

        {/* Bouton expand / collapse */}
        <button
          onClick={toggleCollapse}
          class="w-10 flex items-center justify-center text-text-muted hover:text-text-primary hover:bg-overlay-surface/30 transition-colors shrink-0"
          title={collapsed() ? "Agrandir" : "Réduire"}
        >
          <svg width="10" height="6" viewBox="0 0 10 6">
            <path
              fill="currentColor"
              d={collapsed() ? "M0 6L5 0L10 6z" : "M0 0L5 6L10 0z"}
            />
          </svg>
        </button>
      </div>
    </div>
  );
};

export { activeTab, setActiveTab, collapsed, hoveredTab };
export default WidgetBay;
