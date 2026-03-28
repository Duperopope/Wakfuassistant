/**
 * overlayTracker.ts — v4.0.6 Tri-window overlay tracker
 * Manages positioning of toolbar + navbar + panel windows.
 * Only runs in the toolbar window.
 */
import { invoke } from "@tauri-apps/api/core";
import { listen } from "@tauri-apps/api/event";
import { L } from "./logger";
import { loadSettings, saveSettings } from "./settings";

const POLL_INTERVAL_MS = 1000;

let pollTimer: ReturnType<typeof setInterval> | null = null;

// ── Public API ───────────────────────────────────────────────────

export async function startOverlayTracker(): Promise<void> {
  L.overlay.info("startOverlayTracker", "starting tri-window tracker");

  // Position navbar below toolbar on startup
  try {
    await invoke("position_navbar_below_toolbar");
    L.overlay.info("startOverlayTracker", "navbar positioned below toolbar");
  } catch (e) {
    L.overlay.error("startOverlayTracker", "failed to position navbar", e);
  }

  // Load saved pin state
  try {
    const settings = await loadSettings();
    if (settings.pinned) {
      await invoke("set_overlay_always_on_top", { onTop: true });
    }
  } catch {}

  // Listen for panel-action to manage panel window
  await listen<{ action: string }>("panel-action", async (e) => {
    if (e.payload.action === "open") {
      await openPanel();
    } else if (e.payload.action === "close") {
      await closePanel();
    }
  });

  // Start polling for Wakfu window
  pollTimer = setInterval(pollWakfu, POLL_INTERVAL_MS);
  L.overlay.info("startOverlayTracker", "tracker started, polling every " + POLL_INTERVAL_MS + "ms");
}

export function stopOverlayTracker(): void {
  if (pollTimer) {
    clearInterval(pollTimer);
    pollTimer = null;
  }
  L.overlay.info("stopOverlayTracker", "tracker stopped");
}

// ── Internal ─────────────────────────────────────────────────────

async function openPanel(): Promise<void> {
  try {
    // Get navbar position to place panel above it
    const scale: number = await invoke("get_scale_factor");
    const PANEL_H = Math.round(420 * scale);
    const PANEL_W = Math.round(420 * scale);

    // Position panel above navbar
    await invoke("create_panel_window", {
      x: 0.0, y: 0.0, width: PANEL_W * 1.0, height: PANEL_H * 1.0,
    });

    // Wait a tick then position correctly
    setTimeout(async () => {
      try {
        await invoke("position_panel_above_navbar", { panelHeight: PANEL_H * 1.0 });
        L.overlay.info("openPanel", "panel positioned above navbar");
      } catch (e) {
        L.overlay.error("openPanel", "position_panel_above_navbar failed", e);
      }
    }, 200);

    L.overlay.info("openPanel", "panel opened");
  } catch (e) {
    L.overlay.error("openPanel", "failed to open panel", e);
  }
}

async function closePanel(): Promise<void> {
  try {
    await invoke("hide_panel_window");
    L.overlay.info("closePanel", "panel hidden");
  } catch (e) {
    L.overlay.error("closePanel", "failed", e);
  }
}

async function pollWakfu(): Promise<void> {
  try {
    const info = await invoke("get_wakfu_window_info");
    if (info !== null) {
      await invoke("reorder_above_wakfu");
      // Re-position navbar below toolbar each poll
      await invoke("position_navbar_below_toolbar");
    }
  } catch {}
}