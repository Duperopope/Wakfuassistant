import { TrayIcon } from "@tauri-apps/api/tray";
import { Menu } from "@tauri-apps/api/menu";
import { getAppWindow } from "./tauri";
import { defaultWindowIcon } from "@tauri-apps/api/app";
import { exit } from "@tauri-apps/plugin-process";
import { L } from "./logger";

let trayIcon: TrayIcon | null = null;

export async function setupTray(): Promise<void> {
  L.tray.info('setupTray', 'initialisation du tray');
  const icon = await defaultWindowIcon() ?? undefined;

  const menu = await Menu.new({
    items: [
      {
        id: "show",
        text: "Afficher",
        action: async () => {
          const win = getAppWindow();
          if (win) { await win.show(); await win.setFocus(); }
        },
      },
      {
        id: "quit",
        text: "Quitter",
        action: async () => {
          await exit(0);
        },
      },
    ],
  });

  if (trayIcon) {
    await trayIcon.close();
  }

  trayIcon = await TrayIcon.new({
    icon: icon,
    menu: menu,
    menuOnLeftClick: false,
    tooltip: "Wakfu Overlay v2",
    action: async (event) => {
      // Double-clic gauche = afficher l'overlay
      if (event.type === "DoubleClick") {
        const win = getAppWindow();
        if (win) { await win.show(); await win.setFocus(); }
      }
    },
  });
  L.tray.info('setupTray', 'tray initialisé');
}

export async function closeTray(): Promise<void> {
  L.tray.info('closeTray', 'tray fermé');
  if (trayIcon) {
    await trayIcon.close();
    trayIcon = null;
  }
}

// Appelé par le bouton fermer du footer : minimise dans le tray au lieu de quitter
export async function minimizeToTray(): Promise<void> {
  L.tray.info('minimizeToTray', 'minimisé en tray');
  const win = getAppWindow();
  if (win) {
    await win.hide();
  }
}
