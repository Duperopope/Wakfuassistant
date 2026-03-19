import { register, unregister } from "@tauri-apps/plugin-global-shortcut";
import { setClickThrough, isClickThrough } from "./overlayTracker";

console.log("[Shortcuts] Module initialisé");

/**
 * Enregistre les raccourcis globaux
 * F12 : basculer click-through (overlay click passe/ne passe pas aux fenêtres en dessous)
 */
export async function registerShortcuts(): Promise<void> {
  try {
    // Désenregistrer d'abord au cas où (HMR / redémarrage)
    try { await unregister("F12"); } catch { /* ignoré si pas encore enregistré */ }

    await register("F12", async () => {
      const current = isClickThrough();
      await setClickThrough(!current);
      const newState = !current;
      console.log(`[Shortcuts] F12 pressed → click-through toggled to ${newState}`);
    });

    console.log("[Shortcuts] ✓ F12 registered");
  } catch (e) {
    console.error("[Shortcuts] Erreur register F12:", e);
    throw e;
  }
}

/**
 * Désenregistre les raccourcis globaux
 */
export async function unregisterShortcuts(): Promise<void> {
  try {
    await unregister("F12");
    console.log("[Shortcuts] ✓ F12 unregistered");
  } catch (e) {
    console.error("[Shortcuts] Erreur unregister F12:", e);
    throw e;
  }
}

console.log("[Shortcuts] Module chargé");
