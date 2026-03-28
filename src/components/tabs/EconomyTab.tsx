import type { Component } from "solid-js";
import { session } from "../../stores/sessionStore";

const fmt = (n: number): string => new Intl.NumberFormat("fr-FR").format(n);

const EconomyTab: Component = () => {
  const delta = () =>
    session.kamasGainedSession - session.kamasSpentSession;
  const deltaColor = () =>
    delta() >= 0 ? "text-victory-green" : "text-defeat-red";

  return (
    <div class="flex flex-col h-full p-4 space-y-3">
      {/* Titre */}
      <div class="text-sm font-bold text-text-primary">Économie</div>

      {/* Vue globale */}
      <div class="space-y-2 bg-overlay-surface rounded p-3">
        <div class="flex justify-between text-xs">
          <span class="text-text-muted">Gains</span>
          <span class="font-mono text-victory-green">+{fmt(session.kamasGainedSession)}</span>
        </div>
        <div class="flex justify-between text-xs">
          <span class="text-text-muted">Dépenses</span>
          <span class="font-mono text-defeat-red">-{fmt(session.kamasSpentSession)}</span>
        </div>
        <div class="border-t border-overlay-border pt-2 mt-2 flex justify-between text-xs font-bold">
          <span class="text-text-primary">Net</span>
          <span class={`font-mono ${deltaColor()}`}>
            {delta() >= 0 ? "+" : ""}{fmt(delta())}
          </span>
        </div>
      </div>

      {/* Ratio */}
      {session.kamasGainedSession > 0 && (
        <div class="text-xs text-text-muted text-center">
          Ratio : {((session.kamasSpentSession / session.kamasGainedSession) * 100).toFixed(1)}% dépenses
        </div>
      )}

      {/* Balance actuelle */}
      <div class="bg-overlay-surface rounded p-3">
        <div class="text-[10px] text-text-muted mb-1">Balance kamas</div>
        <div class="font-mono text-lg text-kamas">
          {fmt(session.kamasBalance)}
        </div>
      </div>

      {/* Footer */}
      <div class="flex-1" />
      <div class="text-[10px] text-text-muted italic">
        Données de la session en cours
      </div>
    </div>
  );
};

export default EconomyTab;
