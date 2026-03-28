/**
 * PanelView.tsx — Window 3: Content panel (420px)
 * Renders the active tab content. Listens for tab-change and panel-action events.
 */
import { Component, onMount, onCleanup, createSignal, Switch, Match, Show } from "solid-js";
import { getCurrentWindow } from "@tauri-apps/api/window";
import { emit, listen } from "@tauri-apps/api/event";
import { L } from "../lib/logger";
import { loadAndApplyTheme } from "../lib/settings";
import type { TabId } from "../stores/navStore";

import CharacterTab from "../components/tabs/CharacterTab";
import CombatTab from "../components/tabs/CombatTab";
import ProfessionsTab from "../components/tabs/ProfessionsTab";
import EconomyTab from "../components/tabs/EconomyTab";
import OptionsTab from "../components/tabs/OptionsTab";

const PanelView: Component = () => {
  const [currentTab, setCurrentTab] = createSignal<TabId>("character");
  const [isVisible, setIsVisible] = createSignal(false);
  let unlistenTab: (() => void) | null = null;
  let unlistenAction: (() => void) | null = null;
  let unlistenMinimize: (() => void) | null = null;

  onMount(async () => {
    L.app.info("PanelView", "mounted");
    await loadAndApplyTheme();

    unlistenTab = await listen<{ tab: TabId }>("tab-change", (e) => {
      L.ui.debug("PanelView", "tab-change received: " + e.payload.tab);
      setCurrentTab(e.payload.tab);
      setIsVisible(true);
    }) as unknown as () => void;

    unlistenAction = await listen<{ action: string }>("panel-action", async (e) => {
      if (e.payload.action === "open") {
        setIsVisible(true);
        const win = getCurrentWindow();
        await win.show();
      } else if (e.payload.action === "close") {
        setIsVisible(false);
        const win = getCurrentWindow();
        await win.hide();
      }
    }) as unknown as () => void;

    unlistenMinimize = await listen("minimize-all", async () => {
      const win = getCurrentWindow();
      await win.hide();
    }) as unknown as () => void;

    // Signal ready
    await emit("panel-ready", {});
    L.app.info("PanelView", "panel-ready emitted");
  });

  onCleanup(() => {
    if (unlistenTab) unlistenTab();
    if (unlistenAction) unlistenAction();
    if (unlistenMinimize) unlistenMinimize();
  });

  return (
    <div
      class="glass-panel"
      style={{
        width: "420px",
        height: "420px",
        overflow: "hidden",
      }}
    >
      <Show when={isVisible()} fallback={
        <div style={{
          display: "flex",
          "align-items": "center",
          "justify-content": "center",
          height: "100%",
          color: "var(--text-muted)",
          "font-size": "12px",
        }}>
          En attente...
        </div>
      }>
        <Switch fallback={<CharacterTab />}>
          <Match when={currentTab() === "character"}><CharacterTab /></Match>
          <Match when={currentTab() === "combat"}><CombatTab /></Match>
          <Match when={currentTab() === "professions"}><ProfessionsTab /></Match>
          <Match when={currentTab() === "economy"}><EconomyTab /></Match>
          <Match when={currentTab() === "options"}><OptionsTab /></Match>
        </Switch>
      </Show>
    </div>
  );
};

export default PanelView;