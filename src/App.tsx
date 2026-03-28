/**
 * App.tsx — Wakfu Overlay v4.0.6 — Tri-window router
 * Routes to ToolbarView, NavbarView, or PanelView based on window label.
 */
import { Component, onMount, onCleanup } from "solid-js";
import { getCurrentWindow } from "@tauri-apps/api/window";
import { L, setEnabled } from "./lib/logger";
import { loadSettings, loadAndApplyTheme } from "./lib/settings";
import { registerShortcuts, unregisterShortcuts } from "./lib/shortcuts";
import { setupTray, closeTray } from "./lib/tray";
import { initPipeline } from "./stores/sessionStore";
import { startOverlayTracker, stopOverlayTracker } from "./lib/overlayTracker";

import ToolbarView from "./views/ToolbarView";
import NavbarView from "./views/NavbarView";
import PanelView from "./views/PanelView";

const App: Component = () => {
  const windowLabel = getCurrentWindow().label;

  onMount(async () => {
    L.app.info("App", "v4.0.6 tri-window — window=" + windowLabel);

    // Load theme for all windows
    await loadAndApplyTheme();

    // Only toolbar initializes shared services
    if (windowLabel === "toolbar") {
      try {
        const settings = await loadSettings();
        if (settings.verboseLogs) setEnabled(true);
      } catch {}

      await registerShortcuts();
      await setupTray();
      await startOverlayTracker();
      await initPipeline();

      L.app.info("App", "toolbar services started");
    }
  });

  onCleanup(async () => {
    if (windowLabel === "toolbar") {
      stopOverlayTracker();
      await unregisterShortcuts();
      await closeTray();
    }
  });

  // Route to the correct view
  if (windowLabel === "toolbar") return <ToolbarView />;
  if (windowLabel === "navbar") return <NavbarView />;
  if (windowLabel === "panel") return <PanelView />;

  // Fallback (should never happen)
  return <div style={{ color: "red", padding: "20px" }}>Unknown window: {windowLabel}</div>;
};

export default App;