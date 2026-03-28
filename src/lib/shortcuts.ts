import { register, unregister, isRegistered } from "@tauri-apps/plugin-global-shortcut";
import { isClickThrough, setClickThrough } from "./overlayTracker";
import { L } from "./logger";

export async function registerShortcuts(): Promise<void> {
  try {
    // Unregister d'abord (idempotent) — isRegistered() ne suffit pas en dev (hot-reload)
    try { await unregister("F12"); } catch {}
    await register("F12", async () => {
      const next = !isClickThrough();
      L.shortcuts.info("F12", `click-through -> ${next}`);
      await setClickThrough(next);
    });
    L.shortcuts.info("registerShortcuts", "F12 OK");
  } catch (e) {
    L.shortcuts.error("registerShortcuts", "Erreur register F12", e);
  }
}

export async function unregisterShortcuts(): Promise<void> {
  try {
    await unregister("F12");
    L.shortcuts.info("unregisterShortcuts", "F12 removed");
  } catch (e) {
    L.shortcuts.error("unregisterShortcuts", "Erreur unregister F12", e);
  }
}
