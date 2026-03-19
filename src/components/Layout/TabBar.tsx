import { Component, For, createSignal } from "solid-js";

export type TabId = "character" | "combat" | "professions" | "economy" | "options";

interface Tab {
  id: TabId;
  label: string;
  icon: string; // Emoji pour le prototype — on remplacera par des SVG en Phase 4
}

const TABS: Tab[] = [
  { id: "character",   label: "Perso",     icon: "👤" },
  { id: "combat",      label: "Combat",    icon: "⚔" },
  { id: "professions", label: "Métiers",   icon: "⛏" },
  { id: "economy",     label: "Économie",  icon: "💰" },
  { id: "options",     label: "Options",   icon: "⚙" },
];

const [activeTab, setActiveTab] = createSignal<TabId>("character");

const TabBar: Component = () => {
  return (
    <div class="flex border-b border-overlay-border bg-overlay-bg shrink-0">
      <For each={TABS}>
        {(tab) => (
          <button
            onClick={() => setActiveTab(tab.id)}
            class={`flex-1 py-1.5 text-xs text-center transition-colors ${
              activeTab() === tab.id
                ? "text-kamas border-b-2 border-kamas bg-overlay-surface/50"
                : "text-text-muted hover:text-text-secondary hover:bg-overlay-surface/30"
            }`}
            title={tab.label}
          >
            <span class="block text-sm">{tab.icon}</span>
            <span class="block mt-0.5 text-[10px]">{tab.label}</span>
          </button>
        )}
      </For>
    </div>
  );
};

export { activeTab, setActiveTab };
export default TabBar;
