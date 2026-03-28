/**
 * ToolbarView.tsx — Window 1: Toolbar (28px height)
 * Contains: StatusDot, drag region, control strip (pin, CT, minimize)
 */
import { Component, onMount, onCleanup, createSignal } from "solid-js";
import { getCurrentWindow } from "@tauri-apps/api/window";
import { emit, listen } from "@tauri-apps/api/event";
import { invoke } from "@tauri-apps/api/core";
import { exit } from "@tauri-apps/plugin-process";
import { L } from "../lib/logger";
import { loadAndApplyTheme } from "../lib/settings";

const ToolbarView: Component = () => {
  const [isPinned, setIsPinned] = createSignal(false);
  const [isClickThrough, setIsClickThrough] = createSignal(false);
  const [wakfuDetected, setWakfuDetected] = createSignal(false);
  let pollTimer: ReturnType<typeof setInterval> | null = null;
  let unlistenCt: (() => void) | null = null;

  const togglePin = async () => {
    const next = !isPinned();
    setIsPinned(next);
    try {
      await invoke("set_overlay_always_on_top", { onTop: next });
      L.overlay.info("togglePin", "pinned=" + next);
    } catch (e) {
      L.overlay.error("togglePin", "failed", e);
    }
  };

  const toggleClickThrough = async () => {
    const next = !isClickThrough();
    setIsClickThrough(next);
    try {
      await invoke("toggle_click_through", { enabled: next });
    } catch (e) {
      L.overlay.error("toggleClickThrough", "failed", e);
    }
  };

  const minimizeToTray = async () => {
    try {
      const win = getCurrentWindow();
      await win.hide();
      await emit("minimize-all", {});
    } catch {}
  };

  const pollWakfu = async () => {
    try {
      const info = await invoke("get_wakfu_window_info");
      setWakfuDetected(info !== null);
      if (info !== null) {
        await invoke("reorder_above_wakfu");
      }
    } catch {}
  };

  onMount(async () => {
    L.app.info("ToolbarView", "mounted");
    await loadAndApplyTheme();
    pollTimer = setInterval(pollWakfu, 1000);
    unlistenCt = await listen<boolean>("ct-state-changed", (e) => {
      setIsClickThrough(e.payload);
    }) as unknown as () => void;

    const win = getCurrentWindow();
    await win.show();
  });

  onCleanup(() => {
    if (pollTimer) clearInterval(pollTimer);
    if (unlistenCt) unlistenCt();
  });

  return (
    <div
      style={{
        width: "420px",
        height: "28px",
        display: "flex",
        "align-items": "center",
        "justify-content": "space-between",
        padding: "0 8px",
        background: "var(--bar-bg)",
        "border-radius": "8px 8px 0 0",
        cursor: "grab",
        "user-select": "none",
      }}
      data-tauri-drag-region
    >
      {/* Left: status dot */}
      <div style={{ display: "flex", "align-items": "center", gap: "6px" }}>
        <div
          style={{
            width: "8px",
            height: "8px",
            "border-radius": "50%",
            background: wakfuDetected() ? "#2ECC71" : "#5A5A70",
          }}
        />
        <span style={{ "font-size": "10px", color: "var(--text-muted)", "pointer-events": "none" }}>
          Wakfu Overlay
        </span>
      </div>

      {/* Right: controls */}
      <div style={{ display: "flex", gap: "4px" }}>
        {/* Pin */}
        <button
          onClick={togglePin}
          style={{
            width: "20px",
            height: "20px",
            border: "none",
            background: isPinned() ? "var(--accent)" : "var(--overlay-surface)",
            "border-radius": "4px",
            cursor: "pointer",
            "font-size": "10px",
            color: isPinned() ? "var(--overlay-bg)" : "var(--bar-icon)",
            display: "flex",
            "align-items": "center",
            "justify-content": "center",
          }}
          title={isPinned() ? "D\u00e9sempingler" : "\u00c9pingler"}
        >
          {"\uD83D\uDCCC"}
        </button>

        {/* Click-through */}
        <button
          onClick={toggleClickThrough}
          style={{
            width: "20px",
            height: "20px",
            border: "none",
            background: isClickThrough() ? "var(--accent)" : "var(--overlay-surface)",
            "border-radius": "4px",
            cursor: "pointer",
            "font-size": "10px",
            color: isClickThrough() ? "var(--overlay-bg)" : "var(--bar-icon)",
            display: "flex",
            "align-items": "center",
            "justify-content": "center",
          }}
          title="Click-through (F12)"
        >
          {"\uD83D\uDC41"}
        </button>

        {/* Minimize */}
        <button
          onClick={minimizeToTray}
          style={{
            width: "20px",
            height: "20px",
            border: "none",
            background: "var(--overlay-surface)",
            "border-radius": "4px",
            cursor: "pointer",
            "font-size": "10px",
            color: "var(--bar-icon)",
            display: "flex",
            "align-items": "center",
            "justify-content": "center",
          }}
          title="R\u00e9duire dans le tray"
        >
          {"\u2014"}
        </button>
      </div>
    </div>
  );
};

export default ToolbarView;