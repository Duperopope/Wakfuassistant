import type { Component } from "solid-js";
import { session } from "../../stores/sessionStore";

const CombatTab: Component = () => {
  const winRate = () =>
    session.combatCount > 0
      ? Math.round((session.victoryCount / session.combatCount) * 100)
      : 0;

  const lossCount = () => session.combatCount - session.victoryCount;

  return (
    <div class="flex flex-col h-full p-4 space-y-4">
      {/* Titre */}
      <div class="text-sm font-bold text-text-primary">Combats</div>

      {/* Barre de progression win rate */}
      <div class="space-y-1">
        <div class="flex justify-between text-xs text-text-muted">
          <span>Taux de victoire</span>
          <span class="font-mono">{winRate()}%</span>
        </div>
        <div class="h-2 bg-overlay-surface rounded overflow-hidden">
          <div
            class="h-full bg-victory-green transition-all"
            style={{
              width: `${winRate()}%`,
            }}
          />
        </div>
      </div>

      {/* Stats */}
      <div class="grid grid-cols-2 gap-3 text-xs">
        <div class="bg-overlay-surface rounded p-2">
          <div class="text-text-muted">Victoires</div>
          <div class="font-mono text-victory-green text-lg">
            {session.victoryCount}
          </div>
        </div>
        <div class="bg-overlay-surface rounded p-2">
          <div class="text-text-muted">Défaites</div>
          <div class="font-mono text-defeat-red text-lg">{lossCount()}</div>
        </div>
        <div class="bg-overlay-surface rounded p-2 col-span-2">
          <div class="text-text-muted">Total combats</div>
          <div class="font-mono text-text-primary text-lg">
            {session.combatCount}
          </div>
        </div>
      </div>

      {/* Footer info */}
      <div class="flex-1" />
      <div class="text-[10px] text-text-muted italic">
        Combats détectés cette session
      </div>
    </div>
  );
};

export default CombatTab;
