import type { Component } from "solid-js";
import { onMount, Show, Switch, Match } from "solid-js";
import Titlebar from "./components/Layout/Titlebar";
import WidgetBay, { activeTab, collapsed, hoveredTab } from "./components/Layout/WidgetBay";
import type { TabId } from "./components/Layout/WidgetBay";
import CharacterTab from "./components/tabs/CharacterTab";
import { initPipeline } from "./stores/sessionStore";
import { session } from "./stores/sessionStore";

function PlaceholderTab(props: { name: string }) {
  return (
    <div class="flex items-center justify-center h-full text-text-muted text-xs">
      <p>Onglet {props.name} — Phase 4</p>
    </div>
  );
}

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
  onMount(() => {
    initPipeline();
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
              <PlaceholderTab name="Combat" />
            </Match>
            <Match when={activeTab() === "professions"}>
              <PlaceholderTab name="Métiers" />
            </Match>
            <Match when={activeTab() === "economy"}>
              <PlaceholderTab name="Économie" />
            </Match>
            <Match when={activeTab() === "options"}>
              <PlaceholderTab name="Options" />
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
