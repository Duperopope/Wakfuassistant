/**
 * overlayTracker.ts — Suivi de la fenêtre Wakfu + gestion de la fenêtre overlay.
 *
 * ARCHITECTURE :
 *   - Boucle 100ms (10 Hz) : suit la position de Wakfu en temps réel
 *   - Ancrage BAS : la barre de contrôle reste fixe, le contenu s'étend vers le haut
 *   - Heights par onglet : chaque onglet mémorise sa propre hauteur dépliée
 *   - Click-through partiel : géré via WndProc Win32 (voir win32_overlay.rs)
 */
import { invoke } from "@tauri-apps/api/core";
import { PhysicalPosition, PhysicalSize } from "@tauri-apps/api/window";
import { getAppWindow } from "./tauri";
import { loadSettings, saveSettings } from "./settings";
import { createSignal } from "solid-js";
import { L } from "./logger";

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

// ── State interne ────────────────────────────────────────────────────────────

let trackerId: ReturnType<typeof setInterval> | null = null;
let unlistenResized: (() => void) | null = null;
/** Dernière position connue de la fenêtre Wakfu (pixels physiques écran) */
let lastWakfuRect = { x: 0, y: 0, w: 0, h: 0 };
/** Wakfu était visible au dernier tick */
let wakfuFound = false;
/** Timestamp du dernier redimensionnement programmatique (garde-fou anti-boucle) */
let programmaticResizeAt = 0;
/** Hauteur CSS imposée par le fold (null = non-gérée ici) */
let foldHeightOverride: number | null = null;
/**
 * Ancre physique de la fenêtre overlay.
 * Mise à jour uniquement lors d'un déplacement manuel ou d'un repositionnement Wakfu.
 * JAMAIS mise à jour pendant les fold changes → élimine la race condition setPosition/setSize.
 */
let windowAnchor: { x: number; bottom: number; width: number } | null = null;
/** Position relative de l'overlay par rapport à Wakfu (fraction 0..1) */
let relOffset = { x: 0, y: 0 };
/** Taille relative par rapport à Wakfu (fraction 0..1) — UNIQUEMENT la largeur est utilisée */
let relSize = { w: 0, h: 0 };
/** Timer de sauvegarde débounce */
let saveTimer: ReturnType<typeof setTimeout> | null = null;
/** Timer de sauvegarde des tab heights */
let tabSaveTimer: ReturnType<typeof setTimeout> | null = null;

// ── Signaux réactifs ─────────────────────────────────────────────────────────

const [clickThroughEnabled, setClickThroughEnabled] = createSignal(false);
const [pinned, setPinned] = createSignal(false);
const [overlayOpacity, setOverlayOpacitySignal] = createSignal(0.96);
const [ctOpacity, setCtOpacitySignal] = createSignal(0.60);

// ── Exports publics ──────────────────────────────────────────────────────────

export { pinned, clickThroughEnabled as isClickThroughSignal, overlayOpacity, ctOpacity };
export function isClickThrough(): boolean { return clickThroughEnabled(); }
export function isPinned(): boolean { return pinned(); }
export function getLastWakfuRect() { return { ...lastWakfuRect }; }

// ── Persistance settings ─────────────────────────────────────────────────────

function scheduleSave(): void {
  if (saveTimer) clearTimeout(saveTimer);
  L.overlay.debug('scheduleSave', 'save position débounce 1500ms');
  saveTimer = setTimeout(async () => {
    try {
      const s = await loadSettings();
      s.relOffsetX = relOffset.x;
      s.relOffsetY = relOffset.y;
      s.relSizeW = relSize.w;
      s.relSizeH = relSize.h;
      s.pinned = pinned();
      s.overlayOpacity = overlayOpacity();
      s.ctOpacity = ctOpacity();
      await saveSettings(s);
      L.overlay.debug('scheduleSave', 'position sauvegardée', { relOffset, relSize });
    } catch (e) { L.overlay.error('scheduleSave', 'échec save', e); }
  }, 1500);
}

/**
 * Sauvegarde la hauteur dépliée d'un onglet (débounce 800ms).
 * Appelé depuis WidgetBay quand l'utilisateur redimensionne en fold=2.
 */
export function notifyTabHeight(tabId: string, cssH: number): void {
  L.overlay.debug('notifyTabHeight', `${tabId} → ${cssH}px CSS`);
  if (tabSaveTimer) clearTimeout(tabSaveTimer);
  tabSaveTimer = setTimeout(async () => {
    try {
      const s = await loadSettings();
      s.tabHeights = { ...s.tabHeights, [tabId]: cssH };
      await saveSettings(s);
      L.overlay.debug('notifyTabHeight', `${tabId} sauvegardé: ${cssH}px`);
    } catch (e) { L.overlay.error('notifyTabHeight', 'échec save', e); }
  }, 800);
}

// ── Fonctions internes ───────────────────────────────────────────────────────

async function getWakfuInfo(): Promise<WakfuWindowInfo> {
  try {
    const info = await invoke<WakfuWindowInfo>("get_wakfu_window_info");
    L.overlay.debug('getWakfuInfo', `found=${info.found} min=${info.is_minimized} vis=${info.is_visible}`,
      { x: info.x, y: info.y, w: info.width, h: info.height, dpi: info.dpi });
    return info;
  } catch (e) {
    L.overlay.error('getWakfuInfo', 'invoke échoué', e);
    return { found: false, x: 0, y: 0, width: 0, height: 0, is_minimized: false, is_visible: false, title: "", dpi: 96 };
  }
}

/** Calcule la position et taille COMPLÈTE (sans fold) de l'overlay en pixels physiques. */
function calcOverlayPos(wakfu: { x: number; y: number; w: number; h: number }) {
  const w = Math.max(300, Math.round(relSize.w * wakfu.w));
  const h = Math.max(48, Math.round(relSize.h * wakfu.h));
  // Clamp : l'overlay reste toujours partiellement visible
  const x = Math.max(wakfu.x - w + 50, Math.min(wakfu.x + wakfu.w - 50,
    Math.round(wakfu.x + relOffset.x * wakfu.w)));
  const y = Math.max(wakfu.y - h + 50, Math.min(wakfu.y + wakfu.h - 50,
    Math.round(wakfu.y + relOffset.y * wakfu.h)));
  L.overlay.debug('calcOverlayPos', 'position complète calculée',
    { x, y, w, h, relOffset, relSize });
  return { x, y, w, h };
}

/**
 * Met à jour relOffset et relSize depuis la position absolue courante de l'overlay.
 * Quand folded : utilise le BAS de l'overlay comme référence pour Y
 * (de sorte que relOffset.y encode la position du bas, et quand on dépliera
 *  l'overlay ira vers le haut).
 */
function updateRelativeFromAbsolute(
  overlayX: number, overlayY: number, overlayW: number, overlayH: number,
  wakfu: { x: number; y: number; w: number; h: number },
  folded: boolean,
): void {
  if (wakfu.w <= 0 || wakfu.h <= 0) return;
  relOffset.x = (overlayX - wakfu.x) / wakfu.w;
  relSize.w = overlayW / wakfu.w;

  if (folded && foldHeightOverride !== null) {
    // Ancrage BAS : stocker la position du bas de l'overlay comme référence Y
    const overlayBottom = overlayY + overlayH;
    // On stocke comme si l'overlay avait sa hauteur relative complète (relSize.h)
    const fullPhysH = Math.max(1, Math.round(relSize.h * wakfu.h));
    const fullTopY = overlayBottom - fullPhysH;
    relOffset.y = (fullTopY - wakfu.y) / wakfu.h;
    L.overlay.debug('updateRelativeFromAbsolute', 'mode folded — ancrage bas',
      { overlayBottom, fullTopY, relOffset });
  } else {
    relOffset.y = (overlayY - wakfu.y) / wakfu.h;
    relSize.h = overlayH / wakfu.h;
    L.overlay.debug('updateRelativeFromAbsolute', 'mode plein',
      { overlayX, overlayY, overlayW, overlayH, relOffset, relSize });
  }
  scheduleSave();
}

/**
 * Applique la position de l'overlay selon Wakfu.
 * ANCRAGE BAS : quand folded, ajuste Y pour que le bas de l'overlay
 * reste au même endroit que le bas de l'overlay pleine hauteur.
 */
async function applyPosition(wakfu: { x: number; y: number; w: number; h: number }): Promise<void> {
  const appWindow = getAppWindow();
  if (!appWindow) return;

  const fullPos = calcOverlayPos(wakfu);
  const dpr = window.devicePixelRatio;

  let physH: number;
  let physY: number;

  if (foldHeightOverride !== null) {
    // Folded : garder le BAS au même endroit que l'overlay pleine hauteur
    physH = Math.round(foldHeightOverride * dpr);
    physY = fullPos.y + fullPos.h - physH;
    L.overlay.debug('applyPosition', 'folded — ancrage bas',
      { fullBottom: fullPos.y + fullPos.h, physH, physY });
  } else {
    physH = fullPos.h;
    physY = fullPos.y;
    L.overlay.debug('applyPosition', 'plein',
      { x: fullPos.x, y: physY, w: fullPos.w, h: physH });
  }

  programmaticResizeAt = Date.now();
  await appWindow.setPosition(new PhysicalPosition(fullPos.x, physY));
  await appWindow.setSize(new PhysicalSize(fullPos.w, physH));
}

/**
 * Applique un changement de taille dû au fold en gardant le BAS fixe.
 * Point d'ancrage = bord bas courant de la fenêtre.
 */
async function applyCurrentWindowSize(): Promise<void> {
  const appWindow = getAppWindow();
  if (!appWindow) return;

  if (foldHeightOverride !== null) {
    const dpr = window.devicePixelRatio;
    const physH = Math.round(foldHeightOverride * dpr);
    const pos = await appWindow.outerPosition();
    const size = await appWindow.outerSize();
    // Bord bas fixe = ancre
    const bottom = pos.y + size.height;
    const newY = bottom - physH;
    L.overlay.debug('applyCurrentWindowSize', `ancrage bas → y=${newY} h=${physH} (bottom=${bottom})`,
      { oldY: pos.y, oldH: size.height, foldOverride: foldHeightOverride, dpr });
    programmaticResizeAt = Date.now();
    await appWindow.setPosition(new PhysicalPosition(pos.x, newY));
    await appWindow.setSize(new PhysicalSize(size.width, physH));
  } else if (lastWakfuRect.w > 0) {
    await applyPosition(lastWakfuRect);
  }
}

// ── Boucle de tracking ───────────────────────────────────────────────────────

async function trackLoop(): Promise<void> {
  const appWindow = getAppWindow();
  if (!appWindow) return;

  const info = await getWakfuInfo();

  if (!info.found || info.is_minimized || !info.is_visible) {
    if (wakfuFound) {
      L.overlay.info('trackLoop', 'Wakfu disparu → overlay masqué');
      try { await appWindow.hide(); } catch {}
      wakfuFound = false;
    }
    return;
  }

  if (!wakfuFound) {
    wakfuFound = true;
    L.overlay.info('trackLoop', 'Wakfu apparu → overlay affiché');
    try { await appWindow.show(); } catch {}
  }

  const rect = { x: info.x, y: info.y, w: info.width, h: info.height };

  if (!pinned()) {
    const moved = rect.x !== lastWakfuRect.x || rect.y !== lastWakfuRect.y
      || rect.w !== lastWakfuRect.w || rect.h !== lastWakfuRect.h;
    if (moved || !lastWakfuRect.w) {
      L.overlay.debug('trackLoop', 'Wakfu bougé → reposition', rect);
      await applyPosition(rect);
    }
  }

  lastWakfuRect = rect;
}

// ── API Publique ─────────────────────────────────────────────────────────────

/**
 * Impose une hauteur CSS à la fenêtre (fold state).
 * null = utiliser la hauteur complète (fold=2 avec hauteur par onglet).
 * ANCRAGE BAS : le bord bas de la fenêtre reste fixe.
 */
export function setFoldHeightOverride(cssH: number | null): void {
  L.overlay.debug('setFoldHeightOverride', `${foldHeightOverride}px → ${cssH === null ? 'null' : cssH + 'px'} CSS`);
  foldHeightOverride = cssH;
  applyCurrentWindowSize().catch((e) => L.overlay.error('setFoldHeightOverride', 'applyCurrentWindowSize échoué', e));
}

export async function startOverlayTracker(): Promise<void> {
  if (trackerId !== null) {
    L.overlay.warn('startOverlayTracker', 'déjà démarré — ignoré');
    return;
  }
  L.overlay.info('startOverlayTracker', 'démarrage tracker 10 Hz');

  try {
    const s = await loadSettings();
    relOffset.x = s.relOffsetX;
    relOffset.y = s.relOffsetY;
    relSize.w = s.relSizeW;
    relSize.h = s.relSizeH;
    setPinned(s.pinned);
    setOverlayOpacitySignal(s.overlayOpacity);
    setCtOpacitySignal(s.ctOpacity);
    L.overlay.debug('startOverlayTracker', 'settings chargés', { relOffset, relSize, pinned: s.pinned });
  } catch (e) { L.overlay.error('startOverlayTracker', 'loadSettings échoué', e); }

  const appWindow = getAppWindow();
  if (appWindow) {
    await appWindow.setAlwaysOnTop(true).catch((e) => L.overlay.warn('startOverlayTracker', 'setAlwaysOnTop échoué', e));

    // Écouter les déplacements/resize manuels de l'overlay
    const unlistenMove = await appWindow.onMoved(() => {
      L.overlay.debug('onMoved', 'overlay déplacé manuellement');
      if (lastWakfuRect.w > 0) onOverlayMoved().catch((e) => L.overlay.error('onMoved', 'erreur', e));
    });
    const unlistenResize = await appWindow.onResized(() => {
      L.overlay.debug('onResized', 'overlay redimensionné');
      if (lastWakfuRect.w > 0) onOverlayResized().catch((e) => L.overlay.error('onResized', 'erreur', e));
    });
    unlistenResized = () => { unlistenMove(); unlistenResize(); };
  }

  // Boucle 10 Hz — suivi en temps réel
  trackLoop().catch((e) => L.overlay.error('startOverlayTracker', 'trackLoop initial échoué', e));
  trackerId = setInterval(() => trackLoop().catch(() => {}), 100);
  L.overlay.info('startOverlayTracker', 'tracker démarré @ 10 Hz (100ms)');
}

export function stopOverlayTracker(): void {
  L.overlay.info('stopOverlayTracker', 'arrêt tracker');
  if (trackerId !== null) { clearInterval(trackerId); trackerId = null; }
  if (unlistenResized) { unlistenResized(); unlistenResized = null; }
  if (saveTimer) { clearTimeout(saveTimer); saveTimer = null; }
  if (tabSaveTimer) { clearTimeout(tabSaveTimer); tabSaveTimer = null; }
}

export async function togglePin(): Promise<void> {
  const next = !pinned();
  L.overlay.info('togglePin', `pinned: ${pinned()} → ${next}`);
  setPinned(next);

  if (!next && lastWakfuRect.w > 0) {
    const appWindow = getAppWindow();
    if (appWindow) {
      const pos = await appWindow.outerPosition();
      const size = await appWindow.outerSize();
      updateRelativeFromAbsolute(pos.x, pos.y, size.width, size.height, lastWakfuRect, foldHeightOverride !== null);
    }
  }
  scheduleSave();
}

export async function setClickThrough(enabled: boolean): Promise<void> {
  L.overlay.info('setClickThrough', `click-through: ${clickThroughEnabled()} → ${enabled}`);
  const appWindow = getAppWindow();
  if (!appWindow) {
    L.overlay.error('setClickThrough', 'appWindow null');
    return;
  }
  await invoke("toggle_click_through", { enabled });
  setClickThroughEnabled(enabled);
  scheduleSave();
}

export async function adjustOpacity(delta: number): Promise<void> {
  if (clickThroughEnabled()) {
    const next = Math.max(0.05, Math.min(0.85, ctOpacity() + delta));
    L.overlay.debug('adjustOpacity', `ctOpacity: ${ctOpacity().toFixed(2)} → ${next.toFixed(2)}`);
    setCtOpacitySignal(next);
  } else {
    const next = Math.max(0.35, Math.min(1.0, overlayOpacity() + delta));
    L.overlay.debug('adjustOpacity', `overlayOpacity: ${overlayOpacity().toFixed(2)} → ${next.toFixed(2)}`);
    setOverlayOpacitySignal(next);
  }
  scheduleSave();
}

export function getCurrentOpacity(): number {
  return clickThroughEnabled() ? ctOpacity() : overlayOpacity();
}

/** Appelé quand l'overlay est DÉPLACÉ manuellement par l'utilisateur. */
export async function onOverlayMoved(): Promise<void> {
  // Ignorer les événements trop proches d'un resize programmatique
  if (Date.now() - programmaticResizeAt < 300) {
    L.overlay.debug('onOverlayMoved', 'ignoré (resize programmatique récent)');
    return;
  }
  if (lastWakfuRect.w <= 0) return;
  const appWindow = getAppWindow();
  if (!appWindow) return;
  const pos = await appWindow.outerPosition();
  const size = await appWindow.outerSize();
  L.overlay.debug('onOverlayMoved', 'sauvegarde position manuelle',
    { x: pos.x, y: pos.y, w: size.width, h: size.height, folded: foldHeightOverride !== null });
  updateRelativeFromAbsolute(pos.x, pos.y, size.width, size.height, lastWakfuRect, foldHeightOverride !== null);
}

/** Appelé quand l'overlay est REDIMENSIONNÉ manuellement (séparé de onMoved). */
export async function onOverlayResized(): Promise<void> {
  if (Date.now() - programmaticResizeAt < 300) {
    L.overlay.debug('onOverlayResized', 'ignoré (resize programmatique récent)');
    return;
  }
  if (lastWakfuRect.w <= 0) return;
  if (foldHeightOverride !== null) {
    // En fold, seul X/Y change (height est contrôlé par fold)
    L.overlay.debug('onOverlayResized', 'ignoré (window fold-contrôlée)');
    return;
  }
  const appWindow = getAppWindow();
  if (!appWindow) return;
  const pos = await appWindow.outerPosition();
  const size = await appWindow.outerSize();
  L.overlay.debug('onOverlayResized', 'redimensionnement manuel sauvegardé',
    { x: pos.x, y: pos.y, w: size.width, h: size.height });
  updateRelativeFromAbsolute(pos.x, pos.y, size.width, size.height, lastWakfuRect, false);
}
