import type { Component } from "solid-js";
import WidgetFrame from "./WidgetFrame";
import { session } from "../../stores/sessionStore";

function fmtXp(n: number): string {
  if (n >= 1_000_000) return `${(n / 1_000_000).toFixed(1)}M`;
  if (n >= 1_000)     return `${Math.round(n / 1_000)}K`;
  return String(n);
}

const XpGained: Component = () => (
  <WidgetFrame label="XP">
    <span class="font-mono text-sm text-xp-blue font-bold leading-none">
      {fmtXp(session.totalXp)}
    </span>
  </WidgetFrame>
);

export default XpGained;
