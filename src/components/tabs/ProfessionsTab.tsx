import type { Component } from "solid-js";

const ProfessionsTab: Component = () => {
  return (
    <div class="flex flex-col h-full p-4 items-center justify-center space-y-4">
      {/* Icône phase */}
      <div class="text-4xl">⛏</div>

      {/* Message */}
      <div class="text-center space-y-2">
        <div class="text-sm font-bold text-text-primary">Métiers</div>
        <div class="text-xs text-text-muted">
          Suivi des métiers disponible en Phase 4
        </div>
      </div>

      {/* Info supplémentaire */}
      <div class="text-[10px] text-text-muted italic max-w-xs text-center">
        Les données de progression des métiers (forge, cuisine, élevage, etc.)
        seront affichées ici dès leur détection dans les logs.
      </div>
    </div>
  );
};

export default ProfessionsTab;
