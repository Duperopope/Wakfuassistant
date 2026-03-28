import { Store } from "@tauri-apps/plugin-store";

// === Presets de theme Wakfu (couleurs HEX pour compatibilite WebView2) ===
export interface ThemeColors {
  accent: string;
  accentHover: string;
  accentDim: string;
  overlayBg: string;
  overlaySurface: string;
  overlayBorder: string;
  barBg: string;
  barIcon: string;
  barIconActive: string;
  tabCombat: string;
  tabProfessions: string;
  tabEconomy: string;
}

export const THEME_PRESETS: Record<string, ThemeColors> = {
  "wakfu-classic": {
    accent: "#E8872A",
    accentHover: "#F09A3E",
    accentDim: "#C46B1A",
    overlayBg: "#1A1B2E",
    overlaySurface: "#252640",
    overlayBorder: "#3A3B55",
    barBg: "#F5F5F7",
    barIcon: "#6B6B80",
    barIconActive: "#2A2A3E",
    tabCombat: "#E74C3C",
    tabProfessions: "#9B59B6",
    tabEconomy: "#D4A843",
  },
  "wakfu-dark": {
    accent: "#7B68EE",
    accentHover: "#8B7CF8",
    accentDim: "#5B4ACE",
    overlayBg: "#121218",
    overlaySurface: "#1E1E28",
    overlayBorder: "#2E2E3E",
    barBg: "#1E1E28",
    barIcon: "#7A7A90",
    barIconActive: "#D0D0E0",
    tabCombat: "#FF6B6B",
    tabProfessions: "#BB86FC",
    tabEconomy: "#FFD93D",
  },
  "wakfu-nature": {
    accent: "#27AE60",
    accentHover: "#2ECC71",
    accentDim: "#1E8449",
    overlayBg: "#0D1F12",
    overlaySurface: "#152A1A",
    overlayBorder: "#2A4A32",
    barBg: "#EAF5EC",
    barIcon: "#3E6B48",
    barIconActive: "#1A3D22",
    tabCombat: "#E74C3C",
    tabProfessions: "#8E44AD",
    tabEconomy: "#F39C12",
  },
  "wakfu-fire": {
    accent: "#E85D3A",
    accentHover: "#F07050",
    accentDim: "#C4421A",
    overlayBg: "#1A0E0A",
    overlaySurface: "#2A1810",
    overlayBorder: "#4A2820",
    barBg: "#F8EDE8",
    barIcon: "#6B4038",
    barIconActive: "#2A1510",
    tabCombat: "#FF4444",
    tabProfessions: "#E67E22",
    tabEconomy: "#F1C40F",
  },
};

export interface UserSettings {
  clickThroughHotkey: string;
  theme: "dark" | "light";
  language: "fr" | "en";
  overlayOpacity: number;
  ctOpacity: number;
  relOffsetX: number;
  relOffsetY: number;
  relSizeW: number;
  relSizeH: number;
  foldState: 0 | 1 | 2;
  pinned: boolean;
  verboseLogs: boolean;
  tabHeights: Partial<Record<string, number>>;
  themePreset: string;
  customColors: ThemeColors | null;
}

const DEFAULTS: UserSettings = {
  clickThroughHotkey: "F12",
  theme: "dark",
  language: "fr",
  overlayOpacity: 0.96,
  ctOpacity: 0.60,
  relOffsetX: (1920 - 420 - 10) / 1920,
  relOffsetY: 10 / 1080,
  relSizeW: 420 / 1920,
  relSizeH: 520 / 1080,
  foldState: 1,
  pinned: false,
  verboseLogs: false,
  tabHeights: {},
  themePreset: "wakfu-classic",
  customColors: null,
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

/** Applique un preset ou des couleurs custom aux CSS custom properties */
export function applyThemeColors(colors: ThemeColors): void {
  const root = document.documentElement;
  root.style.setProperty("--color-accent", colors.accent);
  root.style.setProperty("--color-accent-hover", colors.accentHover);
  root.style.setProperty("--color-accent-dim", colors.accentDim);
  root.style.setProperty("--color-overlay-bg", colors.overlayBg);
  root.style.setProperty("--color-overlay-surface", colors.overlaySurface);
  root.style.setProperty("--color-overlay-border", colors.overlayBorder);
  root.style.setProperty("--color-bar-bg", colors.barBg);
  root.style.setProperty("--color-bar-icon", colors.barIcon);
  root.style.setProperty("--color-bar-icon-active", colors.barIconActive);
  root.style.setProperty("--color-tab-combat", colors.tabCombat);
  root.style.setProperty("--color-tab-professions", colors.tabProfessions);
  root.style.setProperty("--color-tab-economy", colors.tabEconomy);
}

/** Charge et applique le theme depuis les settings */
export async function loadAndApplyTheme(): Promise<void> {
  const s = await loadSettings();
  if (s.customColors) {
    applyThemeColors(s.customColors);
  } else {
    const preset = THEME_PRESETS[s.themePreset] || THEME_PRESETS["wakfu-classic"];
    applyThemeColors(preset);
  }
}