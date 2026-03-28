/**
 * NavbarView.tsx — Window 2: Navigation bar (72px height)
 * Contains: Home, expand tabs (combat/professions/economy), Options
 */
import { Component, onMount, onCleanup, createSignal, For, Show } from "solid-js";
import { getCurrentWindow } from "@tauri-apps/api/window";
import { emit, listen } from "@tauri-apps/api/event";
import { L } from "../lib/logger";
import { loadAndApplyTheme } from "../lib/settings";
import {
  type TabId, HOME_TAB, SETTINGS_TAB, EXPAND_TABS,
  activeTab, setActiveTab, panelOpen, setPanelOpen,
  expandOpen, setExpandOpen,
} from "../stores/navStore";

const NavbarView: Component = () => {
  let unlistenMinimize: (() => void) | null = null;

  const handleHomeClick = async () => {
    if (activeTab() === HOME_TAB && panelOpen()) {
      setPanelOpen(false);
      setExpandOpen(false);
      await emit("panel-action", { action: "close" });
    } else {
      setActiveTab(HOME_TAB);
      setPanelOpen(true);
      setExpandOpen(false);
      await emit("tab-change", { tab: HOME_TAB });
      await emit("panel-action", { action: "open" });
    }
  };

  const handleSettingsClick = async () => {
    if (activeTab() === SETTINGS_TAB && panelOpen()) {
      setPanelOpen(false);
      setExpandOpen(false);
      await emit("panel-action", { action: "close" });
    } else {
      setActiveTab(SETTINGS_TAB);
      setPanelOpen(true);
      setExpandOpen(false);
      await emit("tab-change", { tab: SETTINGS_TAB });
      await emit("panel-action", { action: "open" });
    }
  };

  const handlePlusClick = () => {
    setExpandOpen(!expandOpen());
  };

  const handleExpandTabClick = async (tabId: TabId) => {
    if (activeTab() === tabId && panelOpen()) {
      setPanelOpen(false);
      setExpandOpen(false);
      await emit("panel-action", { action: "close" });
    } else {
      setActiveTab(tabId);
      setPanelOpen(true);
      await emit("tab-change", { tab: tabId });
      await emit("panel-action", { action: "open" });
    }
  };

  onMount(async () => {
    L.app.info("NavbarView", "mounted");
    await loadAndApplyTheme();

    unlistenMinimize = await listen("minimize-all", async () => {
      const win = getCurrentWindow();
      await win.hide();
    }) as unknown as () => void;

    const win = getCurrentWindow();
    await win.show();
  });

  onCleanup(() => {
    if (unlistenMinimize) unlistenMinimize();
  });

  return (
    <div
      style={{
        width: "420px",
        height: "72px",
        display: "flex",
        "flex-direction": "column",
        background: "var(--overlay-bg)",
        "border-radius": "0 0 8px 8px",
        overflow: "hidden",
      }}
    >
      {/* Main nav row */}
      <div
        style={{
          display: "flex",
          "align-items": "center",
          "justify-content": "space-around",
          height: "44px",
          padding: "0 12px",
        }}
      >
        {/* Home */}
        <button
          onClick={handleHomeClick}
          style={{
            width: "36px",
            height: "36px",
            border: "none",
            "border-radius": "8px",
            background: activeTab() === HOME_TAB && panelOpen()
              ? "var(--accent)" : "var(--overlay-surface)",
            color: activeTab() === HOME_TAB && panelOpen()
              ? "var(--overlay-bg)" : "var(--bar-icon)",
            cursor: "pointer",
            "font-size": "16px",
            display: "flex",
            "align-items": "center",
            "justify-content": "center",
            transition: "all 0.2s",
          }}
          title="Personnage"
        >
          {"\uD83C\uDFAE"}
        </button>

        {/* Plus / Expand */}
        <button
          onClick={handlePlusClick}
          style={{
            width: "36px",
            height: "36px",
            border: "none",
            "border-radius": "50%",
            background: expandOpen() ? "var(--accent)" : "var(--overlay-surface)",
            color: expandOpen() ? "var(--overlay-bg)" : "var(--bar-icon)",
            cursor: "pointer",
            "font-size": "18px",
            "font-weight": "bold",
            display: "flex",
            "align-items": "center",
            "justify-content": "center",
            transition: "all 0.2s",
            transform: expandOpen() ? "rotate(45deg)" : "none",
          }}
          title="Plus de tabs"
        >
          +
        </button>

        {/* Settings */}
        <button
          onClick={handleSettingsClick}
          style={{
            width: "36px",
            height: "36px",
            border: "none",
            "border-radius": "8px",
            background: activeTab() === SETTINGS_TAB && panelOpen()
              ? "var(--accent)" : "var(--overlay-surface)",
            color: activeTab() === SETTINGS_TAB && panelOpen()
              ? "var(--overlay-bg)" : "var(--bar-icon)",
            cursor: "pointer",
            "font-size": "16px",
            display: "flex",
            "align-items": "center",
            "justify-content": "center",
            transition: "all 0.2s",
          }}
          title="Param\u00e8tres"
        >
          {"\u2699"}
        </button>
      </div>

      {/* Expand row */}
      <Show when={expandOpen()}>
        <div
          style={{
            display: "flex",
            "align-items": "center",
            "justify-content": "center",
            gap: "8px",
            height: "28px",
            background: "var(--overlay-surface)",
          }}
        >
          <For each={EXPAND_TABS}>
            {(tab) => (
              <button
                onClick={() => handleExpandTabClick(tab.id)}
                style={{
                  border: "none",
                  "border-radius": "4px",
                  padding: "2px 10px",
                  background: activeTab() === tab.id && panelOpen()
                    ? "var(--accent)" : "transparent",
                  color: activeTab() === tab.id && panelOpen()
                    ? "var(--overlay-bg)" : "var(--text-secondary)",
                  cursor: "pointer",
                  "font-size": "11px",
                  transition: "all 0.2s",
                }}
                title={tab.label}
              >
                {tab.icon} {tab.label}
              </button>
            )}
          </For>
        </div>
      </Show>
    </div>
  );
};

export default NavbarView;