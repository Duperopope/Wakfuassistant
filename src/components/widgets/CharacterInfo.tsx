import type { Component } from "solid-js";
import { Show } from "solid-js";
import WidgetFrame from "./WidgetFrame";
import { session } from "../../stores/sessionStore";

const CharacterInfo: Component = () => (
  <WidgetFrame label="Personnage">
    <div class="flex items-baseline gap-1.5 leading-none">
      <span class="text-kamas font-bold text-sm">{session.characterName}</span>
      <Show when={session.serverName}>
        <span class="text-text-muted text-[9px]">{session.serverName}</span>
      </Show>
    </div>
  </WidgetFrame>
);

export default CharacterInfo;
