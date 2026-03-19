import { Store } from "@tauri-apps/plugin-store";

console.log("[Settings] Module initialisé");

export interface UserSettings {
  bayHeight: number;
  clickThroughHotkey: string;
  theme: "dark" | "light";
  language: "fr" | "en";
  overlayOpacity: number;
}

const DEFAULTS: UserSettings = {
  bayHeight: 48,
  clickThroughHotkey: "F12",
  theme: "dark",
  language: "fr",
  overlayOpacity: 0.9,
};

let store: Store | null = null;

/**
 * Initialise le store (appelé automatiquement la première fois qu'on charge)
 */
async function ensureStore(): Promise<Store> {
  if (!store) {
    try {
      store = await Store.load("settings.json");
      console.log("[Settings] ✓ Store chargé");
    } catch (e) {
      console.error("[Settings] Erreur Store.load:", e);
      throw e;
    }
  }
  return store;
}

/**
 * Charge les paramètres depuis le store (ou defaults si non trouvé)
 */
export async function loadSettings(): Promise<UserSettings> {
  try {
    const st = await ensureStore();
    const saved = await st.get<UserSettings>("user-settings");

    if (saved) {
      console.log("[Settings] Paramètres chargés depuis le store");
      return { ...DEFAULTS, ...saved };
    } else {
      console.log("[Settings] Aucun paramètre sauvegardé, utilisation des defaults");
      return DEFAULTS;
    }
  } catch (e) {
    console.error("[Settings] Erreur loadSettings:", e);
    return DEFAULTS;
  }
}

/**
 * Sauvegarde les paramètres dans le store
 */
export async function saveSettings(settings: UserSettings): Promise<void> {
  try {
    const st = await ensureStore();
    await st.set("user-settings", settings);
    await st.save();
    console.log("[Settings] ✓ Paramètres sauvegardés");
  } catch (e) {
    console.error("[Settings] Erreur saveSettings:", e);
    throw e;
  }
}

/**
 * Retourne les defaults
 */
export function getDefaultSettings(): UserSettings {
  return DEFAULTS;
}

console.log("[Settings] Module chargé");
