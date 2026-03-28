import type { Component } from "solid-js";
import WidgetFrame from "./WidgetFrame";
import { parserHealth } from "../../stores/sessionStore";

const ParserHealth: Component = () => {
  const rate = () => parserHealth().matchRate;
  const color = () =>
    rate() > 0.8 ? "text-victory-green" : rate() > 0.5 ? "text-kamas" : "text-defeat-red";

  return (
    <WidgetFrame label="Parser">
      <span class={`font-mono text-sm font-bold leading-none ${color()}`}>
        {Math.round(rate() * 100)}%
        <span class="text-[9px] text-text-muted ml-1">
          ({parserHealth().totalLines}L)
        </span>
      </span>
    </WidgetFrame>
  );
};

export default ParserHealth;
