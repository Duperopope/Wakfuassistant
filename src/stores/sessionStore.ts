import { createStore, produce } from "solid-js/store";
import { createSignal } from "solid-js";
// onMount/onCleanup non utilisés ici — initPipeline() est appelé depuis App.tsx
import {
  startPipeline,
  getSessionStats,
  getGameState,
  type SessionStats,
  type GameState,
  type GameStreamEvent,
  type GameEventPayload,
  type ParserHealth,
} from "../lib/tauri";

// =============================================
// STORE : Session
// =============================================

const DEFAULT_SESSION: SessionStats = {
  characterName: "En attente…",
  serverName: "",
  kamasBalance: 0,
  kamasGainedSession: 0,
  kamasSpentSession: 0,
  totalXp: 0,
  combatCount: 0,
  victoryCount: 0,
  sessionStartedAt: null,
};

const [session, setSession] = createStore<SessionStats>({ ...DEFAULT_SESSION });

// =============================================
// SIGNAUX : état simple (non-objet)
// =============================================

const [gameState, setGameState] = createSignal<GameState>({ state: "Offline" });
const [parserHealth, setParserHealth] = createSignal<ParserHealth>({
  totalLines: 0,
  matchedLines: 0,
  unmatchedLines: 0,
  matchRate: 1.0,
});
const [recentEvents, setRecentEvents] = createSignal<GameEventPayload[]>([]);
const [pipelineActive, setPipelineActive] = createSignal(false);

// =============================================
// HANDLER : traitement des événements du Channel
// =============================================

function handleStreamEvent(event: GameStreamEvent): void {
  switch (event.event) {
    case "sessionUpdate":
      // Merge partiel — seules les props qui changent déclenchent un re-render
      setSession(produce((s) => {
        Object.assign(s, event.data);
      }));
      break;

    case "stateChange":
      setGameState(event.data.details);
      break;

    case "parserHealth":
      setParserHealth(event.data);
      break;

    case "gameEvent":
      // Garder les 50 derniers événements pour le feed temps réel
      setRecentEvents((prev) => [event.data, ...prev].slice(0, 50));
      break;
  }
}

// =============================================
// INIT : démarrage du pipeline
// =============================================

/**
 * À appeler une seule fois dans App.tsx via onMount.
 * 1. Charge l'état initial depuis Rust (données persistées)
 * 2. Démarre le pipeline Channel pour le streaming temps réel
 */
export async function initPipeline(): Promise<void> {
  try {
    // Charger l'état initial
    const [stats, state] = await Promise.all([
      getSessionStats(),
      getGameState(),
    ]);

    setSession(produce((s) => Object.assign(s, stats)));
    setGameState(state);

    // Démarrer le streaming
    await startPipeline(handleStreamEvent);
    setPipelineActive(true);

    console.log("[Pipeline] Démarré avec succès");
  } catch (err) {
    console.error("[Pipeline] Erreur d'initialisation:", err);
  }
}

// =============================================
// EXPORTS
// =============================================

export {
  session,        // Store (accès direct : session.kamasBalance)
  gameState,      // Signal (accès via appel : gameState())
  parserHealth,   // Signal
  recentEvents,   // Signal
  pipelineActive, // Signal
};
