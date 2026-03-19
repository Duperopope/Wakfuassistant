import { Component, onMount, Switch, Match } from "solid-js";
import Titlebar from "./components/Layout/Titlebar";
import TabBar, { activeTab } from "./components/Layout/TabBar";
import CharacterTab from "./components/tabs/CharacterTab";
import { initPipeline } from "./stores/sessionStore";

// Placeholder pour les onglets non encore implémentés
function PlaceholderTab(props: { name: string }) {
  return (
    <div class="flex items-center justify-center h-full text-text-muted text-xs">
      <p>Onglet {props.name} — Phase 4</p>
    </div>
  );
}

const App: Component = () => {
  onMount(() => {
    initPipeline();
  });

  return (
    <div class="flex flex-col h-screen bg-overlay-bg/90 rounded-lg overflow-hidden border border-overlay-border/50">
      <Titlebar />
      <TabBar />

      {/* Contenu de l'onglet actif */}
      <div class="flex-1 min-h-0">
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
      </div>
    </div>
  );
};

export default App;
