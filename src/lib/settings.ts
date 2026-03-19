import { Store } from "@tauri-apps/plugin-store";

export interface UserSettings {
  clickThroughHotkey: string;
  theme: "dark" | "light";
  language: "fr" | "en";
  // Opacité mode normal (0.35–1.0)
  overlayOpacity: number;
  // Opacité mode click-through (0.05–0.85)
  ctOpacity: number;
  // Position relative en % de la fenêtre Wakfu
  relOffsetX: number;
  relOffsetY: number;
  relSizeW: number;
  relSizeH: number;
  // État fold (0=footer, 1=footer+tabs, 2=footer+tabs+content)
  foldState: 0 | 1 | 2;
  // Pin
  pinned: boolean;
  // Logs détaillés (verbose)
  verboseLogs: boolean;
  // Hauteurs dépliées par onglet (pixels CSS)
  tabHeights: Partial<Record<string, number>>;
}

const DEFAULTS: UserSettings = {
  clickThroughHotkey: "F12",
  theme: "dark",
  language: "fr",
  overlayOpacity: 0.96,
  ctOpacity: 0.60,
  // Default: coin supérieur droit de Wakfu (x = wakfuW - overlayW - 10px marge)
  relOffsetX: (1920 - 400 - 10) / 1920,
  relOffsetY: 10 / 1080,
  relSizeW: 400 / 1920,
  relSizeH: 300 / 1080,
  foldState: 1,
  pinned: false,
  verboseLogs: false,
  tabHeights: {},
};

let store: Store | null = null;

async function ensureStore(): Promise<Store> {
  if (!store) {
    store = await Store.load("settings.json");
  }
  return store;
}

export async function loadSettings(): Promise<UserSettings> {
  try {
    const st = await ensureStore();
    const saved = await st.get<UserSettings>("user-settings");
    if (saved) {
      return { ...DEFAULTS, ...saved };
    }
    return { ...DEFAULTS };
  } catch {
    return { ...DEFAULTS };
  }
}

export async function saveSettings(settings: UserSettings): Promise<void> {
  const st = await ensureStore();
  await st.set("user-settings", settings);
  await st.save();
}

export function getDefaultSettings(): UserSettings {
  return { ...DEFAULTS };
}
