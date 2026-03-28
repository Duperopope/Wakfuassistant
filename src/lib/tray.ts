import { TrayIcon } from "@tauri-apps/api/tray";
import { Menu } from "@tauri-apps/api/menu";
import { getAppWindow } from "./tauri";
import { defaultWindowIcon } from "@tauri-apps/api/app";
import { exit } from "@tauri-apps/plugin-process";
import { L } from "./logger";

let trayIcon: TrayIcon | null = null;

export async function setupTray(): Promise<void> {
  L.tray.info("setupTray", "initialisation du tray");
  const icon = (await defaultWindowIcon()) ?? undefined;

  const menu = await Menu.new({
    items: [
      {
        id: "show",
        text: "Afficher Wakfu Overlay",
        action: async () => {
          const win = getAppWindow();
          if (win) {
            await win.show();
            await win.unminimize();
            await win.setFocus();
          }
        },
      },
      {
        id: "quit",
        text: "Quitter",
        action: async () => {
          L.tray.info("quit", "fermeture complete");
          await exit(0);
        },
      },
    ],
  });

  if (trayIcon) await trayIcon.close();

  trayIcon = await TrayIcon.new({
    icon: icon,
    menu: menu,
    menuOnLeftClick: false,
    tooltip: "Wakfu Overlay v2",
    action: async (event) => {
      if (event.type === "Click" || event.type === "DoubleClick") {
        const win = getAppWindow();
        if (win) {
          await win.show();
          await win.unminimize();
          await win.setFocus();
        }
      }
    },
  });
  L.tray.info("setupTray", "tray OK");
}

export async function closeTray(): Promise<void> {
  if (trayIcon) { await trayIcon.close(); trayIcon = null; }
}

export async function minimizeToTray(): Promise<void> {
  const win = getAppWindow();
  if (win) await win.hide();
}