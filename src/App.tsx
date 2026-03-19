import type { Component } from "solid-js";
import { onMount, onCleanup, Show, Switch, Match, createEffect } from "solid-js";
import WidgetBay, { activeTab, foldState, hoveredTab } from "./components/Layout/WidgetBay";
import type { TabId } from "./components/Layout/WidgetBay";
import CharacterTab from "./components/tabs/CharacterTab";
import CombatTab from "./components/tabs/CombatTab";
import ProfessionsTab from "./components/tabs/ProfessionsTab";
import EconomyTab from "./components/tabs/EconomyTab";
import OptionsTab from "./components/tabs/OptionsTab";
import { initPipeline, session } from "./stores/sessionStore";
import { startOverlayTracker, stopOverlayTracker, getCurrentOpacity } from "./lib/overlayTracker";
import { getAppWindow } from "./lib/tauri";
import { registerShortcuts, unregisterShortcuts } from "./lib/shortcuts";
import { setupTray, closeTray } from "./lib/tray";
import { setEnabled, L } from "./lib/logger";
import { invoke } from "@tauri-apps/api/core";
import { loadSettings } from "./lib/settings";

function fmt(n: number): string {
  return new Intl.NumberFormat("fr-FR").format(n);
}

function TabTooltip(props: { tab: TabId }) {
  return (
    <div class="absolute bottom-full left-0 right-0 bg-overlay-bg/95 border border-overlay-border px-3 py-2 text-[11px] space-y-1 pointer-events-none z-50">
      <Switch>
        <Match when={props.tab === "character"}>
          <div class="flex justify-between">
            <span class="text-text-muted">Balance kamas</span>
            <span class="font-mono text-kamas">{fmt(session.kamasBalance)}</span>
          </div>
          <div class="flex justify-between">
            <span class="text-text-muted">Session net</span>
            <span class={`font-mono ${session.kamasGainedSession - session.kamasSpentSession >= 0 ? "text-victory-green" : "text-defeat-red"}`}>
              {session.kamasGainedSession - session.kamasSpentSession >= 0 ? "+" : ""}
              {fmt(session.kamasGainedSession - session.kamasSpentSession)}
            </span>
          </div>
          <div class="flex justify-between">
            <span class="text-text-muted">XP session</span>
            <span class="font-mono text-xp-blue">{fmt(session.totalXp)}</span>
          </div>
        </Match>
        <Match when={props.tab === "combat"}>
          <div class="flex justify-between">
            <span class="text-text-muted">Victoires</span>
            <span class="font-mono text-text-primary">{session.victoryCount}/{session.combatCount}</span>
          </div>
          <div class="flex justify-between">
            <span class="text-text-muted">Taux</span>
            <span class="font-mono text-text-primary">
              {session.combatCount > 0 ? `${Math.round((session.victoryCount / session.combatCount) * 100)}%` : "\u2014"}
            </span>
          </div>
        </Match>
        <Match when={props.tab === "professions"}>
          <span class="text-text-muted italic">Donn\u00e9es disponibles en Phase 4</span>
        </Match>
        <Match when={props.tab === "economy"}>
          <div class="flex justify-between">
            <span class="text-text-muted">Gagn\u00e9</span>
            <span class="font-mono text-victory-green">+{fmt(session.kamasGainedSession)}</span>
          </div>
          <div class="flex justify-between">
            <span class="text-text-muted">D\u00e9pens\u00e9</span>
            <span class="font-mono text-defeat-red">-{fmt(session.kamasSpentSession)}</span>
          </div>
        </Match>
        <Match when={props.tab === "options"}>
          <span class="text-text-muted italic">Configuration de l'overlay</span>
        </Match>
      </Switch>
    </div>
  );
}

const App: Component = () => {
  onMount(async () => {
    // Charger les settings pour initialiser le logging verbose
    try {
      const settings = await loadSettings();
      setEnabled(settings.verboseLogs);
      if (settings.verboseLogs) {
        await invoke("set_verbose_logging", { enabled: true });
      }
    } catch {}

    L.app.info('onMount', 'application démarrée');
    initPipeline();
    startOverlayTracker().catch((e) =>
      L.app.error('onMount', 'Erreur startOverlayTracker', e)
    );
    registerShortcuts().catch((e) =>
      L.app.error('onMount', 'Erreur registerShortcuts', e)
    );
    setupTray().catch((e) =>
      L.app.error('onMount', 'Erreur setupTray', e)
    );
  });

  onCleanup(() => {
    L.app.info('onCleanup', 'application arrêtée');
    stopOverlayTracker();
    try { unregisterShortcuts().catch(() => {}); } catch {}
    try { closeTray().catch(() => {}); } catch {}
  });

  // Appliquer l'opacité via style DOM
  createEffect(() => {
    const opacity = getCurrentOpacity();
    document.documentElement.style.opacity = String(opacity);
  });

  const resize = (dir: string) => (e: MouseEvent) => {
    e.preventDefault();
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
    getAppWindow()?.startResizeDragging(dir as any).catch(() => {});
  };

  return (
    <div class="relative flex flex-col h-screen bg-overlay-bg/90 rounded-lg overflow-hidden border border-overlay-border/50">
      {/* Poignées de redimensionnement */}
      <div class="absolute top-0 left-2 right-2 h-1 cursor-n-resize z-50" onMouseDown={resize("North")} />
      <div class="absolute top-0 left-0 w-2 h-2 cursor-nw-resize z-50" onMouseDown={resize("NorthWest")} />
      <div class="absolute top-0 right-0 w-2 h-2 cursor-ne-resize z-50" onMouseDown={resize("NorthEast")} />
      <div class="absolute top-2 left-0 w-1 bottom-0 cursor-w-resize z-50" onMouseDown={resize("West")} />
      <div class="absolute top-2 right-0 w-1 bottom-0 cursor-e-resize z-50" onMouseDown={resize("East")} />
      {/* Contenu (visible si fold === 2) */}
      <Show when={foldState() === 2}>
        <div class="flex-1 min-h-0 relative">
          <Switch>
            <Match when={activeTab() === "character"}>
              <CharacterTab />
            </Match>
            <Match when={activeTab() === "combat"}>
              <CombatTab />
            </Match>
            <Match when={activeTab() === "professions"}>
              <ProfessionsTab />
            </Match>
            <Match when={activeTab() === "economy"}>
              <EconomyTab />
            </Match>
            <Match when={activeTab() === "options"}>
              <OptionsTab />
            </Match>
          </Switch>
        </div>
      </Show>

      {/* Tooltips au hover des onglets (visible si fold >= 1) */}
      <Show when={hoveredTab() !== null && foldState() >= 1}>
        <div class="relative">
          <TabTooltip tab={hoveredTab()!} />
        </div>
      </Show>

      {/* Footer + Onglets (toujours en bas) */}
      <WidgetBay />
    </div>
  );
};

export default App;
