import { invoke } from "@tauri-apps/api/core";
import { PhysicalPosition, PhysicalSize } from "@tauri-apps/api/window";
import { getAppWindow } from "./tauri";
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
  dpi: number;
}

// ── État interne ────────────────────────────────────────────────────────────
let trackerId: ReturnType<typeof setInterval> | null = null;
let lastWakfuInfo: WakfuWindowInfo | null = null;
const [clickThroughEnabled, setClickThroughEnabled] = createSignal(false);

// Quand true, le tracker ne repositionne/redimensionne PAS la fenêtre
let positionLocked = false;

console.log("[OverlayTracker] Module initialisé");

export function lockPosition(): void {
  positionLocked = true;
  console.log("[OverlayTracker] Position LOCKED");
}

export function unlockPosition(): void {
  positionLocked = false;
  lastWakfuInfo = null;
  console.log("[OverlayTracker] Position UNLOCKED");
}

export function isPositionLocked(): boolean {
  return positionLocked;
}

// ── Fonctions internes ──────────────────────────────────────────────────────

async function getWakfuWindowInfo(): Promise<WakfuWindowInfo> {
  try {
    return await invoke<WakfuWindowInfo>("get_wakfu_window_info");
  } catch (e) {
    console.error("[OverlayTracker] Erreur get_wakfu_window_info:", e);
    return { found: false, x: 0, y: 0, width: 0, height: 0, is_minimized: false, is_visible: false, title: "", dpi: 96 };
  }
}

/**
 * Positionne l'overlay en coin supérieur droit de la fenêtre Wakfu.
 * Utilise PhysicalPosition/PhysicalSize car GetWindowRect retourne des pixels physiques.
 */
async function syncOverlayPosition(wakfuInfo: WakfuWindowInfo): Promise<void> {
  const appWindow = getAppWindow();
  if (!appWindow) return;

  try {
    const OVERLAY_WIDTH = 400;
    const OVERLAY_HEIGHT = 300;

    // Positionner en haut à droite de Wakfu, avec une marge de 10px
    const overlayX = wakfuInfo.x + wakfuInfo.width - OVERLAY_WIDTH - 10;
    const overlayY = wakfuInfo.y + 10;

    console.log(`[OverlayTracker] Wakfu: pos=(${wakfuInfo.x},${wakfuInfo.y}) size=${wakfuInfo.width}x${wakfuInfo.height} dpi=${wakfuInfo.dpi} title="${wakfuInfo.title}"`);
    console.log(`[OverlayTracker] Overlay → PhysicalPosition(${overlayX}, ${overlayY}) PhysicalSize(${OVERLAY_WIDTH}, ${OVERLAY_HEIGHT})`);

    await appWindow.setPosition(new PhysicalPosition(overlayX, overlayY));
    await appWindow.setSize(new PhysicalSize(OVERLAY_WIDTH, OVERLAY_HEIGHT));
  } catch (e) {
    console.error("[OverlayTracker] Erreur sync position:", e);
  }
}

// ── Boucle principale (1 Hz) ────────────────────────────────────────────────

async function trackLoop(): Promise<void> {
  const appWindow = getAppWindow();
  if (!appWindow) return;

  const wakfuInfo = await getWakfuWindowInfo();

  if (!wakfuInfo.found) {
    try {
      await appWindow.hide();
    } catch (e) {
      console.error("[OverlayTracker] Erreur hide (not found):", e);
    }
    lastWakfuInfo = null;
    return;
  }

  if (wakfuInfo.is_minimized || !wakfuInfo.is_visible) {
    try {
      await appWindow.hide();
    } catch (e) {
      console.error("[OverlayTracker] Erreur hide (minimized):", e);
    }
    return;
  }

  // Wakfu visible → afficher l'overlay
  try {
    await appWindow.show();
  } catch (e) {
    console.error("[OverlayTracker] Erreur show:", e);
  }

  // Ne PAS repositionner si la position est verrouillée
  if (positionLocked) {
    return;
  }

  // Repositionner seulement si Wakfu a bougé/changé de taille
  if (
    !lastWakfuInfo ||
    lastWakfuInfo.x !== wakfuInfo.x ||
    lastWakfuInfo.y !== wakfuInfo.y ||
    lastWakfuInfo.width !== wakfuInfo.width ||
    lastWakfuInfo.height !== wakfuInfo.height
  ) {
    await syncOverlayPosition(wakfuInfo);
  }

  lastWakfuInfo = wakfuInfo;
}

// ── API publique ────────────────────────────────────────────────────────────

export async function startOverlayTracker(): Promise<void> {
  if (trackerId !== null) {
    console.warn("[OverlayTracker] Tracker déjà actif");
    return;
  }

  console.log("[OverlayTracker] Démarrage du tracker");

  try {
    await setOverlayAlwaysOnTop(true);
    console.log("[OverlayTracker] Always-on-top activé");
  } catch (e) {
    console.error("[OverlayTracker] Erreur always-on-top:", e);
  }

  // Premier tick immédiat
  trackLoop().catch((e) => console.error("[OverlayTracker] Erreur premier tick:", e));

  // Puis toutes les secondes
  trackerId = setInterval(() => {
    trackLoop().catch((e) => console.error("[OverlayTracker] Erreur boucle:", e));
  }, 1000);

  console.log("[OverlayTracker] Tracker actif (1 Hz)");
}

export function stopOverlayTracker(): void {
  if (trackerId !== null) {
    clearInterval(trackerId);
    trackerId = null;
    console.log("[OverlayTracker] Tracker arrêté");
  }
}

export async function setClickThrough(enabled: boolean): Promise<void> {
  try {
    const appWindow = getAppWindow();
    if (!appWindow) return;
    await invoke("toggle_click_through", { enabled, window: appWindow });
    setClickThroughEnabled(enabled);
    console.log(`[OverlayTracker] Click-through: ${enabled}`);
  } catch (e) {
    console.error("[OverlayTracker] Erreur toggle_click_through:", e);
  }
}

export async function setOverlayAlwaysOnTop(enabled: boolean): Promise<void> {
  try {
    const appWindow = getAppWindow();
    if (!appWindow) return;
    await invoke("set_overlay_always_on_top", { enabled, window: appWindow });
    console.log(`[OverlayTracker] Always-on-top: ${enabled}`);
  } catch (e) {
    console.error("[OverlayTracker] Erreur set_overlay_always_on_top:", e);
  }
}

export function isClickThrough(): boolean {
  return clickThroughEnabled();
}

console.log("[OverlayTracker] Module chargé");
