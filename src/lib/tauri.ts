import { invoke, Channel } from "@tauri-apps/api/core";

// =============================================
// TYPES — miroirs exacts des structs Rust
// =============================================

/** Miroir de GameState dans state_machine.rs */
export type GameState =
  | { state: "Offline" }
  | { state: "Loading"; server: string }
  | { state: "InGame"; server: string; character: string }
  | { state: "InCombat"; server: string; character: string }
  | { state: "Disconnected"; lastServer: string | null };

/** Miroir de SessionStats dans commands/session.rs */
export interface SessionStats {
  characterName: string;
  serverName: string;
  kamasBalance: number;
  kamasGainedSession: number;
  kamasSpentSession: number;
  totalXp: number;
  combatCount: number;
  victoryCount: number;
  sessionStartedAt: string | null;
}

/** Miroir de ParserHealth dans log_parser.rs */
export interface ParserHealth {
  totalLines: number;
  matchedLines: number;
  unmatchedLines: number;
  matchRate: number;
}

/** Miroir de LogStatus retourné par get_log_status */
export interface LogStatus {
  mainLogFound: boolean;
  chatLogFound: boolean;
  mainLogPath: string | null;
  chatLogPath: string | null;
}

/** Événement streamé via Channel depuis le pipeline Rust */
export type GameStreamEvent =
  | { event: "gameEvent"; data: GameEventPayload }
  | { event: "stateChange"; data: { from: string; to: string; details: GameState } }
  | { event: "sessionUpdate"; data: SessionStats }
  | { event: "parserHealth"; data: ParserHealth };

/** Payload simplifié d'un événement de jeu (pour l'affichage) */
export interface GameEventPayload {
  kind: string;
  amount?: number;
  source?: string;
  target?: string;
  profession?: string;
  resource?: string;
  rawLine?: string;
  timestamp: string;
}

// =============================================
// COMMANDES TAURI — Phase 1 + Phase 2
// =============================================

/** Récupère les stats de session actuelles (Phase 1) */
export async function getSessionStats(): Promise<SessionStats> {
  return invoke<SessionStats>("get_session_stats");
}

/** Récupère l'état du jeu (Phase 2) */
export async function getGameState(): Promise<GameState> {
  return invoke<GameState>("get_game_state");
}

/** Récupère la santé du parser (Phase 2) */
export async function getParserHealth(): Promise<ParserHealth> {
  return invoke<ParserHealth>("get_parser_health");
}

/** Récupère le statut des fichiers log (Phase 2) */
export async function getLogStatus(): Promise<LogStatus> {
  return invoke<LogStatus>("get_log_status");
}

/**
 * Démarre le pipeline de lecture temps réel (Phase 2).
 *
 * IMPORTANT : cette fonction utilise un Channel Tauri, pas un Event.
 * Les Channels sont optimisés pour le streaming ordonné de données.
 *
 * Le callback onEvent sera appelé pour chaque événement de jeu parsé.
 * Le Channel reste ouvert tant que l'app tourne.
 */
export function startPipeline(
  onEvent: (event: GameStreamEvent) => void
): Promise<void> {
  const channel = new Channel<GameStreamEvent>();
  channel.onmessage = onEvent;
  return invoke("start_log_pipeline", { onEvent: channel });
}

/** Force un re-scan des fichiers log (bouton dans Options) */
export async function forceLogRescan(): Promise<void> {
  return invoke("force_log_rescan");
}
