/**
 * ╔══════════════════════════════════════════════════════════════════╗
 * ║  WAKFU OVERLAY — Système de logging centralisé                  ║
 * ║  Catégories : APP · PIPELINE · OVERLAY · SETTINGS · TRAY        ║
 * ║             · SHORTCUTS · STORE · UI · IPC                      ║
 * ║  Niveaux : TRACE · DEBUG · INFO · WARN · ERROR                  ║
 * ║  Toggle  : OptionsTab → case "Logs détaillés"                   ║
 * ╚══════════════════════════════════════════════════════════════════╝
 */
import { invoke } from "@tauri-apps/api/core";

export type LogCategory =
  | "APP"       // Cycle de vie application (mount, cleanup, init)
  | "PIPELINE"  // Pipeline de logs Wakfu (parser, FSM, watcher)
  | "OVERLAY"   // Suivi fenêtre Wakfu (position, click-through, pin)
  | "SETTINGS"  // Chargement/sauvegarde des paramètres
  | "TRAY"      // System tray (menu, icône)
  | "SHORTCUTS" // Raccourcis globaux (F12)
  | "STORE"     // Store SolidJS (session, widgets)
  | "UI"        // Rendu UI (tabs, widgets, fold)
  | "IPC";      // Appels Tauri (invoke, channel)

export type LogLevel = "TRACE" | "DEBUG" | "INFO" | "WARN" | "ERROR";

let _enabled = false;

export function setEnabled(v: boolean): void {
  _enabled = v;
}

export function isEnabled(): boolean {
  return _enabled;
}

function ts(): string {
  return new Date().toISOString().replace("T", " ").slice(0, 23);
}

export function log(
  category: LogCategory,
  level: LogLevel,
  fn: string,
  message: string,
  data?: unknown
): void {
  const alwaysLog = level === "WARN" || level === "ERROR";
  if (!_enabled && !alwaysLog) return;

  const dataStr = data !== undefined ? ` | ${JSON.stringify(data)}` : "";
  const catPad = category.padEnd(9);
  const lvlPad = level.padEnd(5);
  const line = `[${ts()}] [${catPad}] [${lvlPad}] ${fn}() — ${message}${dataStr}`;

  if (level === "ERROR") console.error(line);
  else if (level === "WARN") console.warn(line);
  else console.log(line);

  // Pont vers le fichier de log Rust (journal unifié)
  invoke("bridge_log", {
    level: level.toLowerCase(),
    category,
    fnName: fn,
    message,
    data: data !== undefined ? JSON.stringify(data) : null,
  }).catch(() => {});
}

// ── Raccourcis par catégorie ──────────────────────────────────────────────────

function cat(c: LogCategory) {
  return {
    trace: (fn: string, msg: string, d?: unknown) => log(c, "TRACE", fn, msg, d),
    debug: (fn: string, msg: string, d?: unknown) => log(c, "DEBUG", fn, msg, d),
    info:  (fn: string, msg: string, d?: unknown) => log(c, "INFO",  fn, msg, d),
    warn:  (fn: string, msg: string, d?: unknown) => log(c, "WARN",  fn, msg, d),
    error: (fn: string, msg: string, d?: unknown) => log(c, "ERROR", fn, msg, d),
  };
}

export const L = {
  app:       cat("APP"),
  pipeline:  cat("PIPELINE"),
  overlay:   cat("OVERLAY"),
  settings:  cat("SETTINGS"),
  tray:      cat("TRAY"),
  shortcuts: cat("SHORTCUTS"),
  store:     cat("STORE"),
  ui:        cat("UI"),
  ipc:       cat("IPC"),
};
