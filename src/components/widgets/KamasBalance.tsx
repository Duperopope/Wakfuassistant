import type { Component } from "solid-js";
import WidgetFrame from "./WidgetFrame";
import { session } from "../../stores/sessionStore";

const KamasBalance: Component = () => (
  <WidgetFrame label="Kamas">
    <span class="text-kamas font-mono text-sm font-bold leading-none">
      {new Intl.NumberFormat("fr-FR").format(session.kamasBalance)}
    </span>
  </WidgetFrame>
);

export default KamasBalance;
