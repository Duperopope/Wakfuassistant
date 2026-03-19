import type { Component } from "solid-js";
import { For, createSignal } from "solid-js";
import { getCurrentWindow, LogicalSize, LogicalPosition } from "@tauri-apps/api/window";
import { session } from "../../stores/sessionStore";

export type TabId = "character" | "combat" | "professions" | "economy" | "options";

interface Tab {
  id: TabId;
  label: string;
  icon: string;
}

const TABS: Tab[] = [
  { id: "character",   label: "Perso",    icon: "👤" },
  { id: "combat",      label: "Combat",   icon: "⚔" },
  { id: "professions", label: "Métiers",  icon: "⛏" },
  { id: "economy",     label: "Économie", icon: "💰" },
  { id: "options",     label: "Options",  icon: "⚙" },
];

const FULL_HEIGHT = 600;
const TABBAR_HEIGHT = 48;
const WINDOW_WIDTH = 400;

const [activeTab, setActiveTab] = createSignal<TabId>("character");
const [collapsed, setCollapsed] = createSignal(false);
const [hoveredTab, setHoveredTab] = createSignal<TabId | null>(null);

/** Valeur compacte affichée sous chaque icône */
function widgetValue(id: TabId): string {
  switch (id) {
    case "character": {
      const delta = session.kamasGainedSession - session.kamasSpentSession;
      const abs = Math.abs(delta);
      const sign = delta >= 0 ? "+" : "-";
      if (abs >= 1_000_000) return `${sign}${(abs / 1_000_000).toFixed(1)}M`;
      if (abs >= 1_000)     return `${sign}${Math.round(abs / 1_000)}K`;
      return `${sign}${abs}`;
    }
    case "combat":
      return session.combatCount > 0
        ? `${session.victoryCount}/${session.combatCount}`
        : "—";
    default:
      return "—";
  }
}

function widgetColor(id: TabId): string {
  if (id === "character") {
    const delta = session.kamasGainedSession - session.kamasSpentSession;
    return delta >= 0 ? "text-victory-green" : "text-defeat-red";
  }
  return "text-text-muted";
}

const TabBar: Component = () => {
  const appWindow = getCurrentWindow();

  const toggleCollapse = async () => {
    const next = !collapsed();
    const pos = await appWindow.outerPosition();
    const scale = await appWindow.scaleFactor();
    const lx = pos.x / scale;
    const ly = pos.y / scale;

    if (next) {
      await appWindow.setSize(new LogicalSize(WINDOW_WIDTH, TABBAR_HEIGHT));
      await appWindow.setPosition(new LogicalPosition(lx, ly + FULL_HEIGHT - TABBAR_HEIGHT));
    } else {
      await appWindow.setPosition(new LogicalPosition(lx, ly - (FULL_HEIGHT - TABBAR_HEIGHT)));
      await appWindow.setSize(new LogicalSize(WINDOW_WIDTH, FULL_HEIGHT));
    }

    setHoveredTab(null);
    setCollapsed(next);
  };

  return (
    <div class="flex border-t border-overlay-border bg-overlay-bg shrink-0">
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
            <span class={`block mt-0.5 text-[9px] leading-none font-mono ${widgetColor(tab.id)}`}>
              {widgetValue(tab.id)}
            </span>
          </button>
        )}
      </For>

      {/* Bouton expand/collapse */}
      <button
        onClick={toggleCollapse}
        class="w-10 flex flex-col items-center justify-center text-text-muted hover:text-text-primary hover:bg-overlay-surface/30 transition-colors shrink-0"
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
  );
};

export { activeTab, setActiveTab, collapsed, hoveredTab };
export default TabBar;
