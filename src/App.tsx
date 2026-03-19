import type { Component } from "solid-js";
import { onMount, onCleanup, Show, Switch, Match } from "solid-js";
import Titlebar from "./components/Layout/Titlebar";
import WidgetBay, { activeTab, collapsed, hoveredTab } from "./components/Layout/WidgetBay";
import type { TabId } from "./components/Layout/WidgetBay";
import CharacterTab from "./components/tabs/CharacterTab";
import CombatTab from "./components/tabs/CombatTab";
import ProfessionsTab from "./components/tabs/ProfessionsTab";
import EconomyTab from "./components/tabs/EconomyTab";
import OptionsTab from "./components/tabs/OptionsTab";
import { initPipeline } from "./stores/sessionStore";
import { session } from "./stores/sessionStore";
import { startOverlayTracker, stopOverlayTracker } from "./lib/overlayTracker";
import { registerShortcuts, unregisterShortcuts } from "./lib/shortcuts";
import { setupTray, closeTray } from "./lib/tray";

function fmt(n: number): string {
  return new Intl.NumberFormat("fr-FR").format(n);
}

function TabTooltip(props: { tab: TabId }) {
  return (
    <div class="absolute bottom-0 left-0 right-0 bg-overlay-bg/95 border-t border-overlay-border px-3 py-2 text-[11px] space-y-1 pointer-events-none z-50">
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
              {session.combatCount > 0 ? `${Math.round((session.victoryCount / session.combatCount) * 100)}%` : "—"}
            </span>
          </div>
        </Match>
        <Match when={props.tab === "professions"}>
          <span class="text-text-muted italic">Données disponibles en Phase 4</span>
        </Match>
        <Match when={props.tab === "economy"}>
          <div class="flex justify-between">
            <span class="text-text-muted">Gagné</span>
            <span class="font-mono text-victory-green">+{fmt(session.kamasGainedSession)}</span>
          </div>
          <div class="flex justify-between">
            <span class="text-text-muted">Dépensé</span>
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
    initPipeline();
    startOverlayTracker().catch((e) =>
      console.error("[App] Erreur startOverlayTracker:", e)
    );
    registerShortcuts().catch((e) =>
      console.error("[App] Erreur registerShortcuts:", e)
    );
    setupTray().catch((e) =>
      console.error("[App] Erreur setupTray:", e)
    );
  });

  onCleanup(async () => {
    stopOverlayTracker();
    unregisterShortcuts().catch((e) =>
      console.error("[App] Erreur unregisterShortcuts:", e)
    );
    closeTray().catch((e) =>
      console.error("[App] Erreur closeTray:", e)
    );
  });

  return (
    <div class="flex flex-col h-screen bg-overlay-bg/90 rounded-lg overflow-hidden border border-overlay-border/50">
      <Show when={!collapsed()}>
        <Titlebar />
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

          <Show when={hoveredTab() !== null}>
            <TabTooltip tab={hoveredTab()!} />
          </Show>
        </div>
      </Show>

      <WidgetBay />
    </div>
  );
};

export default App;
