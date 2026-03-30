/**
 * EconomyTab.tsx — Hub Économie + Patrimoine + Marché HDV
 */
import { Component, createSignal, Switch, Match } from "solid-js";

import SessionView from "../economy/SessionView";
import PatrimoineView from "../economy/PatrimoineView";
import MarketView from "../economy/MarketView";

type SubTab = "session" | "patrimoine" | "market";

const SUB_TABS: { id: SubTab; label: string; icon: string }[] = [
  { id: "session",    label: "Session",    icon: "💰" },
  { id: "patrimoine", label: "Patrimoine", icon: "📦" },
  { id: "market",     label: "Marché",     icon: "🏪" },
];

const EconomyTab: Component = () => {
  const [activeSubTab, setActiveSubTab] = createSignal<SubTab>("patrimoine");

  return (
    <div class="flex flex-col h-full">
      {/* Sub-tab bar */}
      <div class="flex border-b border-overlay-border px-2 pt-2">
        {SUB_TABS.map((tab) => (
          <button
            onClick={() => setActiveSubTab(tab.id)}
            class={`flex-1 text-center text-[11px] py-1.5 transition-all border-b-2 ${
              activeSubTab() === tab.id
                ? "border-accent text-accent font-semibold"
                : "border-transparent text-text-muted hover:text-text-primary"
            }`}
          >
            {tab.icon} {tab.label}
          </button>
        ))}
      </div>

      {/* Content */}
      <div class="flex-1 overflow-y-auto p-3">
        <Switch fallback={<PatrimoineView />}>
          <Match when={activeSubTab() === "session"}><SessionView /></Match>
          <Match when={activeSubTab() === "patrimoine"}><PatrimoineView /></Match>
          <Match when={activeSubTab() === "market"}><MarketView /></Match>
        </Switch>
      </div>
    </div>
  );
};

export default EconomyTab;
