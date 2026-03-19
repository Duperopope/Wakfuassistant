import { Component, Show, For } from "solid-js";
import { session, recentEvents, gameState, parserHealth } from "../../stores/sessionStore";
import type { GameEventPayload } from "../../lib/tauri";

/** Formatte un nombre avec séparateur de milliers */
function fmt(n: number): string {
  return new Intl.NumberFormat("fr-FR").format(n);
}

/** Carte de statistique réutilisable */
function StatCard(props: {
  label: string;
  value: string;
  subValue?: string;
  color?: string;
}) {
  return (
    <div class="bg-overlay-surface rounded-lg p-3 border border-overlay-border">
      <div class="flex justify-between items-center">
        <span class="text-text-secondary text-xs">{props.label}</span>
        <span
          class={`font-mono text-sm font-semibold ${props.color ?? "text-text-primary"}`}
        >
          {props.value}
        </span>
      </div>
      <Show when={props.subValue}>
        <p class="text-text-muted text-[10px] mt-1 text-right">{props.subValue}</p>
      </Show>
    </div>
  );
}

/** Badge d'événement dans le feed */
function EventBadge(props: { event: GameEventPayload }) {
  const kindColors: Record<string, string> = {
    KamasGained: "text-victory-green",
    KamasSpent: "text-defeat-red",
    XpGained: "text-xp-blue",
    CombatStarted: "text-kamas",
    CombatEnded: "text-kamas",
    HarvestCompleted: "text-profession-purple",
    ProfessionLevelUp: "text-profession-purple",
  };

  return (
    <div class="flex items-center gap-2 py-0.5 text-[11px]">
      <span class={kindColors[props.event.kind] ?? "text-text-muted"}>
        {props.event.kind === "KamasGained" && `+${fmt(props.event.amount ?? 0)} K`}
        {props.event.kind === "KamasSpent" && `-${fmt(props.event.amount ?? 0)} K`}
        {props.event.kind === "XpGained" && `+${fmt(props.event.amount ?? 0)} XP`}
        {props.event.kind === "CombatStarted" && "⚔ Combat"}
        {props.event.kind === "CombatEnded" && "✓ Fin combat"}
        {props.event.kind === "HarvestCompleted" &&
          `⛏ ${props.event.resource} ×${props.event.amount ?? 0}`}
        {props.event.kind === "ProfessionLevelUp" &&
          `🎉 ${props.event.profession} Niv. ${props.event.amount}`}
      </span>
    </div>
  );
}

const CharacterTab: Component = () => {
  const kamasDelta = () => session.kamasGainedSession - session.kamasSpentSession;

  const winRate = () => {
    if (session.combatCount === 0) return 0;
    return Math.round((session.victoryCount / session.combatCount) * 100);
  };

  return (
    <div class="p-3 space-y-3 overflow-y-auto h-full">
      {/* Nom du personnage */}
      <div class="text-center py-1">
        <h2 class="text-base font-bold text-kamas">{session.characterName}</h2>
        <Show when={session.serverName}>
          <p class="text-[10px] text-text-muted">{session.serverName}</p>
        </Show>
      </div>

      {/* Kamas */}
      <div class="bg-overlay-surface rounded-lg p-3 border border-overlay-border">
        <div class="flex justify-between items-center">
          <span class="text-text-secondary text-xs">Kamas</span>
          <span class="text-kamas font-mono text-base font-bold">
            {fmt(session.kamasBalance)}
          </span>
        </div>
        <div class="flex justify-between mt-1.5 text-[11px]">
          <span class="text-victory-green">+{fmt(session.kamasGainedSession)}</span>
          <span class="text-defeat-red">-{fmt(session.kamasSpentSession)}</span>
        </div>
        <div class="mt-1 text-center">
          <span
            class={`text-xs font-bold ${
              kamasDelta() >= 0 ? "text-victory-green" : "text-defeat-red"
            }`}
          >
            {kamasDelta() >= 0 ? "+" : ""}
            {fmt(kamasDelta())} net
          </span>
        </div>
      </div>

      {/* Stats en grille */}
      <div class="grid grid-cols-2 gap-2">
        <StatCard label="XP" value={fmt(session.totalXp)} color="text-xp-blue" />
        <StatCard
          label="Combats"
          value={`${session.victoryCount}/${session.combatCount}`}
          subValue={`${winRate()}% victoires`}
          color="text-text-primary"
        />
      </div>

      {/* Parser health — petit indicateur de diagnostic */}
      <div class="flex items-center gap-2 text-[10px] text-text-muted">
        <div
          class={`w-1.5 h-1.5 rounded-full ${
            parserHealth().matchRate > 0.8
              ? "bg-victory-green"
              : parserHealth().matchRate > 0.5
                ? "bg-kamas"
                : "bg-defeat-red"
          }`}
        />
        <span>
          Parser : {Math.round(parserHealth().matchRate * 100)}%
          ({parserHealth().totalLines} lignes)
        </span>
      </div>

      {/* Feed d'événements récents */}
      <Show when={recentEvents().length > 0}>
        <div class="border-t border-overlay-border pt-2">
          <h3 class="text-[10px] text-text-muted uppercase tracking-wider mb-1">
            Événements récents
          </h3>
          <div class="space-y-0.5 max-h-32 overflow-y-auto">
            <For each={recentEvents().slice(0, 15)}>
              {(evt) => <EventBadge event={evt} />}
            </For>
          </div>
        </div>
      </Show>
    </div>
  );
};

export default CharacterTab;
