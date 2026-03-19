import type { Component } from "solid-js";
import WidgetFrame from "./WidgetFrame";
import { session } from "../../stores/sessionStore";

function fmtDelta(n: number): string {
  const sign = n >= 0 ? "+" : "-";
  const abs = Math.abs(n);
  if (abs >= 1_000_000) return `${sign}${(abs / 1_000_000).toFixed(1)}M`;
  if (abs >= 1_000)     return `${sign}${Math.round(abs / 1_000)}K`;
  return `${sign}${abs}`;
}

const KamasSession: Component = () => {
  const delta = () => session.kamasGainedSession - session.kamasSpentSession;
  return (
    <WidgetFrame label="Session">
      <span class={`font-mono text-sm font-bold leading-none ${delta() >= 0 ? "text-victory-green" : "text-defeat-red"}`}>
        {fmtDelta(delta())}
      </span>
    </WidgetFrame>
  );
};

export default KamasSession;
