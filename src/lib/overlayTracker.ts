import { invoke } from "@tauri-apps/api/core";
import { getCurrentWindow, LogicalPosition, LogicalSize } from "@tauri-apps/api/window";
import { createSignal } from "solid-js";

interface WakfuWindowInfo {
  found: boolean;
  x: number;
  y: number;
  width: number;
  height: number;
  is_minimized: boolean;
  is_visible: boolean;
  title: string;
}

// État interne du tracker
let trackerId: ReturnType<typeof setInterval> | null = null;
let lastWakfuInfo: WakfuWindowInfo | null = null;
const [clickThroughEnabled, setClickThroughEnabled] = createSignal(false);

console.log("[OverlayTracker] Module initialisé");

/**
 * Récupère les infos de la fenêtre Wakfu
 */
async function getWakfuWindowInfo(): Promise<WakfuWindowInfo> {
  try {
    const info = await invoke<WakfuWindowInfo>("get_wakfu_window_info");
    return info;
  } catch (e) {
    console.error("[OverlayTracker] Erreur get_wakfu_window_info:", e);
    return { found: false, x: 0, y: 0, width: 0, height: 0, is_minimized: false, is_visible: false, title: "" };
  }
}

/**
 * Repositionne et redimensionne l'overlay à la même position que Wakfu
 */
async function syncOverlayPosition(wakfuInfo: WakfuWindowInfo): Promise<void> {
  const appWindow = getCurrentWindow();

  try {
    // Marge pour afficher l'overlay à proximité de Wakfu (coin supérieur droit)
    const OVERLAY_WIDTH = 400;
    const OVERLAY_HEIGHT = 300;
    const overlayX = wakfuInfo.x + wakfuInfo.width - OVERLAY_WIDTH - 10;
    const overlayY = wakfuInfo.y + 10;

    await appWindow.setPosition(new LogicalPosition(overlayX, overlayY));
    await appWindow.setSize(new LogicalSize(OVERLAY_WIDTH, OVERLAY_HEIGHT));

    console.debug(`[OverlayTracker] Position sync: (${overlayX}, ${overlayY})`);
  } catch (e) {
    console.error("[OverlayTracker] Erreur sync position:", e);
  }
}

/**
 * Boucle principale : interroge Wakfu toutes les secondes
 */
async function trackLoop(): Promise<void> {
  const wakfuInfo = await getWakfuWindowInfo();

  if (!wakfuInfo.found) {
    // Wakfu pas trouvée : masquer l'overlay
    try {
      await getCurrentWindow().hide();
      console.debug("[OverlayTracker] Wakfu non trouvée → overlay masqué");
    } catch (e) {
      console.error("[OverlayTracker] Erreur hide:", e);
    }
    lastWakfuInfo = null;
    return;
  }

  if (wakfuInfo.is_minimized || !wakfuInfo.is_visible) {
    // Wakfu minimisée : masquer l'overlay
    try {
      await getCurrentWindow().hide();
      console.debug("[OverlayTracker] Wakfu minimisée → overlay masqué");
    } catch (e) {
      console.error("[OverlayTracker] Erreur hide:", e);
    }
    return;
  }

  // Wakfu visible : afficher l'overlay
  try {
    await getCurrentWindow().show();
  } catch (e) {
    console.error("[OverlayTracker] Erreur show:", e);
  }

  // Vérifier si la position/taille a changé (optimisation)
  if (
    !lastWakfuInfo ||
    lastWakfuInfo.x !== wakfuInfo.x ||
    lastWakfuInfo.y !== wakfuInfo.y ||
    lastWakfuInfo.width !== wakfuInfo.width ||
    lastWakfuInfo.height !== wakfuInfo.height
  ) {
    await syncOverlayPosition(wakfuInfo);
    console.debug("[OverlayTracker] Position mise à jour");
  }

  lastWakfuInfo = wakfuInfo;
}

/**
 * Démarre le suivi de la fenêtre Wakfu (1 Hz)
 */
export async function startOverlayTracker(): Promise<void> {
  if (trackerId !== null) {
    console.warn("[OverlayTracker] Tracker déjà actif");
    return;
  }

  console.log("[OverlayTracker] Démarrage du tracker");

  // Initialiser l'overlay
  try {
    await setOverlayAlwaysOnTop(true);
    console.log("[OverlayTracker] Always-on-top activé");
  } catch (e) {
    console.error("[OverlayTracker] Erreur always-on-top:", e);
  }

  // Boucle toutes les secondes
  trackerId = setInterval(() => {
    trackLoop().catch((e) => console.error("[OverlayTracker] Erreur boucle:", e));
  }, 1000);

  console.log("[OverlayTracker] Tracker actif");
}

/**
 * Arrête le suivi
 */
export function stopOverlayTracker(): void {
  if (trackerId !== null) {
    clearInterval(trackerId);
    trackerId = null;
    console.log("[OverlayTracker] Tracker arrêté");
  }
}

/**
 * Bascule le click-through (curseur passe à travers l'overlay)
 */
export async function setClickThrough(enabled: boolean): Promise<void> {
  try {
    const appWindow = getCurrentWindow();
    await invoke("toggle_click_through", { enabled, window: appWindow });
    setClickThroughEnabled(enabled);
    console.log(`[OverlayTracker] Click-through: ${enabled}`);
  } catch (e) {
    console.error("[OverlayTracker] Erreur toggle_click_through:", e);
  }
}

/**
 * Définit always-on-top
 */
export async function setOverlayAlwaysOnTop(enabled: boolean): Promise<void> {
  try {
    const appWindow = getCurrentWindow();
    await invoke("set_overlay_always_on_top", { enabled, window: appWindow });
    console.log(`[OverlayTracker] Always-on-top: ${enabled}`);
  } catch (e) {
    console.error("[OverlayTracker] Erreur set_overlay_always_on_top:", e);
  }
}

/**
 * Retourne l'état du click-through
 */
export function isClickThrough(): boolean {
  return clickThroughEnabled();
}

console.log("[OverlayTracker] Module chargé");
