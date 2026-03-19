import { register, unregister } from "@tauri-apps/plugin-global-shortcut";
import { setClickThrough, isClickThrough } from "./overlayTracker";
import { L } from "./logger";

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
      const enabled = !current;
      await setClickThrough(enabled);
      L.shortcuts.debug('registerShortcuts', 'toggle click-through', { enabled });
    });

    L.shortcuts.info('registerShortcuts', 'F12 enregistré');
  } catch (e) {
    L.shortcuts.error('registerShortcuts', 'Erreur register F12', e);
    throw e;
  }
}

/**
 * Désenregistre les raccourcis globaux
 */
export async function unregisterShortcuts(): Promise<void> {
  try {
    await unregister("F12");
    L.shortcuts.info('unregisterShortcuts', 'raccourcis supprimés');
  } catch (e) {
    L.shortcuts.error('unregisterShortcuts', 'Erreur unregister F12', e);
    throw e;
  }
}
