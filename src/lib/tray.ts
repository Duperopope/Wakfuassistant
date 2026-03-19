import { TrayIcon } from "@tauri-apps/api/tray";
import { Menu } from "@tauri-apps/api/menu";
import { getCurrentWindow } from "@tauri-apps/api/window";
import { defaultWindowIcon } from "@tauri-apps/api/app";
import { exit } from "@tauri-apps/plugin-process";
import { setClickThrough, isClickThrough } from "./overlayTracker";

console.log("[Tray] Module initialisé");

let trayIcon: TrayIcon | null = null;

/**
 * Configure et affiche le system tray
 */
export async function setupTray(): Promise<void> {
  try {
    // Récupérer l'icône par défaut
    let icon = await defaultWindowIcon();

    // Créer le menu tray
    const menu = await Menu.new({
      items: [
        {
          id: "toggle-visibility",
          text: "Afficher/Masquer",
          action: async () => {
            try {
              const win = getCurrentWindow();
              const visible = await win.isVisible();
              if (visible) {
                await win.hide();
                console.log("[Tray] Overlay masqué");
              } else {
                await win.show();
                console.log("[Tray] Overlay affiché");
              }
            } catch (e) {
              console.error("[Tray] Erreur toggle-visibility:", e);
            }
          },
        },
        {
          id: "toggle-click-through",
          text: "Toggle Click-Through (F12)",
          action: async () => {
            try {
              const current = isClickThrough();
              await setClickThrough(!current);
              console.log(`[Tray] Click-through: ${!current}`);
            } catch (e) {
              console.error("[Tray] Erreur toggle-click-through:", e);
            }
          },
        },
        {
          id: "quit",
          text: "Quitter",
          action: async () => {
            try {
              console.log("[Tray] Exiting app");
              await exit(0);
            } catch (e) {
              console.error("[Tray] Erreur exit:", e);
            }
          },
        },
      ],
    });

    // Créer le tray icon
    if (trayIcon) {
      await trayIcon.close();
    }

    trayIcon = await TrayIcon.new({
      icon: icon,
      menu: menu,
      menuOnLeftClick: false,
      tooltip: "Wakfu Overlay v2",
    });

    console.log("[Tray] ✓ System tray configuré");
  } catch (e) {
    console.error("[Tray] Erreur setupTray:", e);
    throw e;
  }
}

/**
 * Ferme et nettoie le tray
 */
export async function closeTray(): Promise<void> {
  if (trayIcon) {
    try {
      await trayIcon.close();
      trayIcon = null;
      console.log("[Tray] ✓ Tray fermé");
    } catch (e) {
      console.error("[Tray] Erreur closeTray:", e);
    }
  }
}

console.log("[Tray] Module chargé");
