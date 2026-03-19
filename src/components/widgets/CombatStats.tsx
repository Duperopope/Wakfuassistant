import type { Component } from "solid-js";
import WidgetFrame from "./WidgetFrame";
import { session } from "../../stores/sessionStore";

const CombatStats: Component = () => {
  const rate = () =>
    session.combatCount > 0
      ? Math.round((session.victoryCount / session.combatCount) * 100)
      : 0;

  return (
    <WidgetFrame label="Combats">
      <div class="flex items-baseline gap-1 leading-none">
        <span class="font-mono text-sm text-text-primary font-bold">
          {session.victoryCount}/{session.combatCount}
        </span>
        <span class="text-[9px] text-text-muted">{rate()}%</span>
      </div>
    </WidgetFrame>
  );
};

export default CombatStats;
