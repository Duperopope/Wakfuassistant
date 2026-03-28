/**
 * navStore.ts — Navigation state for tri-window architecture v4.0.6
 * Shared signals used by Toolbar, Navbar, and Panel views.
 * Communication between windows uses Tauri emit/listen events.
 */
import { createSignal } from "solid-js";

export type TabId = "character" | "combat" | "professions" | "economy" | "options";

export const HOME_TAB: TabId = "character";
export const SETTINGS_TAB: TabId = "options";

export const EXPAND_TABS: { id: TabId; label: string; icon: string; color: string }[] = [
  { id: "combat",      label: "Combats",   icon: "\u2694",  color: "text-tab-combat" },
  { id: "professions", label: "M\u00e9tiers",   icon: "\u26CF",  color: "text-tab-professions" },
  { id: "economy",     label: "\u00c9conomie", icon: "\uD83D\uDCB0", color: "text-tab-economy" },
];

// Signals
const [activeTab, setActiveTab]     = createSignal<TabId | null>(null);
const [panelOpen, setPanelOpen]     = createSignal(false);
const [expandOpen, setExpandOpen]   = createSignal(false);

export {
  activeTab, setActiveTab,
  panelOpen, setPanelOpen,
  expandOpen, setExpandOpen,
};