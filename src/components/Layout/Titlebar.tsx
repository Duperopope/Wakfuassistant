import type { Component } from "solid-js";
import { getCurrentWindow } from "@tauri-apps/api/window";
import { gameState } from "../../stores/sessionStore";

const Titlebar: Component = () => {
  const appWindow = getCurrentWindow();

  const stateColor = () => {
    const s = gameState();
    switch (s.state) {
      case "InGame":
      case "InCombat":
        return "bg-victory-green";
      case "Loading":
        return "bg-kamas animate-pulse";
      case "Disconnected":
        return "bg-defeat-red";
      default:
        return "bg-text-muted";
    }
  };

  const stateLabel = () => {
    const s = gameState();
    switch (s.state) {
      case "Offline":
        return "Hors ligne";
      case "Loading":
        return "Chargement…";
      case "InGame":
        return s.character;
      case "InCombat":
        return "⚔ Combat";
      case "Disconnected":
        return "Déconnecté";
      default:
        return "—";
    }
  };

  return (
    <div
      data-tauri-drag-region
      class="flex items-center justify-between h-[var(--spacing-titlebar)] bg-titlebar px-2 select-none shrink-0"
    >
      {/* Indicateur d'état + nom */}
      <div data-tauri-drag-region class="flex items-center gap-2 min-w-0">
        <div class={`w-2 h-2 rounded-full shrink-0 ${stateColor()}`} />
        <span
          data-tauri-drag-region
          class="text-xs text-text-secondary truncate"
        >
          {stateLabel()}
        </span>
      </div>

      {/* Bouton fermer */}
      <button
        onClick={() => appWindow.close()}
        class="w-7 h-7 flex items-center justify-center rounded hover:bg-defeat-red/80 text-text-muted hover:text-white transition-colors"
        title="Fermer"
      >
        <svg width="10" height="10" viewBox="0 0 10 10">
          <path
            fill="currentColor"
            d="M1 0L0 1l4 4-4 4 1 1 4-4 4 4 1-1-4-4 4-4-1-1-4 4z"
          />
        </svg>
      </button>
    </div>
  );
};

export default Titlebar;
