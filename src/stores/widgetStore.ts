import { createSignal } from "solid-js";

export type WidgetId =
  | "kamas-balance"
  | "kamas-session"
  | "combat-stats"
  | "xp-gained"
  | "parser-health"
  | "character-info";

export interface WidgetSlot {
  id: WidgetId;
  cols: 1 | 2 | 3 | 4;
}

export const TAB_STRIP_H = 48;
export const WIDGET_ROW_H = 64;
export const BAY_SNAPS = [TAB_STRIP_H, TAB_STRIP_H + WIDGET_ROW_H, TAB_STRIP_H + WIDGET_ROW_H * 2] as const;
export type BaySnap = (typeof BAY_SNAPS)[number];

export const DEFAULT_ROWS: WidgetSlot[][] = [
  [{ id: "kamas-balance", cols: 2 }, { id: "kamas-session", cols: 2 }],
  [{ id: "combat-stats",  cols: 2 }, { id: "xp-gained",     cols: 2 }],
];

const [baySnap, setBaySnap]       = createSignal<BaySnap>(TAB_STRIP_H);
const [widgetRows, setWidgetRows] = createSignal<WidgetSlot[][]>(DEFAULT_ROWS);

export { baySnap, setBaySnap, widgetRows, setWidgetRows };
