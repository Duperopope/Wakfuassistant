import { Component, createSignal, createResource, For, Show } from "solid-js";
import {
  getPatrimoineSummary, getPatrimoineItems,
  fmtKamas, rarityColor, rarityName,
  type PatrimoineSummary, type PatrimoineItem,
} from "../../lib/hdvApi";

const PatrimoineView: Component = () => {
  const [summary] = createResource(getPatrimoineSummary);
  const [viewAll, setViewAll] = createSignal(false);
  const [allItems] = createResource(
    () => viewAll() ? "all" : null,
    async (src) => {
      if (!src) return null;
      return getPatrimoineItems("all", "value_desc", 0, 200);
    }
  );

  const pct = (priced: number, total: number) =>
    total > 0 ? Math.round((priced / total) * 100) : 0;

  return (
    <div class="space-y-3">
      <Show when={summary()} fallback={
        <div class="text-xs text-text-muted text-center py-8">Chargement...</div>
      }>
        {(s) => {
          const data = s();
          return (
            <>
              {/* Total */}
              <div class="bg-overlay-surface rounded-lg p-3 border border-overlay-border text-center">
                <div class="text-[10px] text-text-muted uppercase tracking-wider">Patrimoine total</div>
                <div class="font-mono text-xl text-kamas font-bold mt-1">
                  {fmtKamas(data.totalValue)}
                </div>
              </div>

              {/* Répartition */}
              <div class="grid grid-cols-2 gap-2">
                <div class="bg-overlay-surface rounded p-2">
                  <div class="text-[10px] text-text-muted">Coffre</div>
                  <div class="font-mono text-sm text-kamas">{fmtKamas(data.chestValue)}</div>
                  <div class="text-[9px] text-text-muted">
                    {data.chestPricedCount}/{data.chestItemCount} items évalués ({pct(data.chestPricedCount, data.chestItemCount)}%)
                  </div>
                </div>
                <div class="bg-overlay-surface rounded p-2">
                  <div class="text-[10px] text-text-muted">Inventaire</div>
                  <div class="font-mono text-sm text-kamas">{fmtKamas(data.inventoryValue)}</div>
                  <div class="text-[9px] text-text-muted">
                    {data.inventoryPricedCount}/{data.inventoryItemCount} items évalués ({pct(data.inventoryPricedCount, data.inventoryItemCount)}%)
                  </div>
                </div>
              </div>

              {data.unpricedCount > 0 && (
                <div class="text-[10px] text-text-muted bg-overlay-surface rounded p-2 text-center">
                  {data.unpricedCount} items sans prix HDV connu
                </div>
              )}

              {/* Top items */}
              <div class="bg-overlay-surface rounded p-2">
                <div class="text-[10px] text-text-muted uppercase tracking-wider mb-2">
                  Top items par valeur
                </div>
                <div class="space-y-1 max-h-40 overflow-y-auto">
                  <For each={data.topItems.slice(0, 10)}>
                    {(item) => (
                      <div class="flex justify-between items-center text-[11px] py-0.5">
                        <div class="flex items-center gap-1 truncate flex-1 min-w-0">
                          <span
                            class="inline-block w-1.5 h-1.5 rounded-full flex-shrink-0"
                            style={{ background: rarityColor(item.rarity) }}
                          />
                          <span class="text-text-primary truncate">{item.name}</span>
                          {item.quantity > 1 && (
                            <span class="text-text-muted flex-shrink-0">×{item.quantity}</span>
                          )}
                        </div>
                        <span class="font-mono text-kamas ml-2 flex-shrink-0">
                          {fmtKamas(item.totalValue)}
                        </span>
                      </div>
                    )}
                  </For>
                </div>
              </div>

              {/* Voir tout */}
              <Show when={!viewAll()}>
                <button
                  onClick={() => setViewAll(true)}
                  class="w-full text-[10px] text-accent bg-overlay-surface rounded p-2 hover:brightness-110 transition"
                >
                  Voir tous les items →
                </button>
              </Show>

              <Show when={viewAll() && allItems()}>
                <div class="bg-overlay-surface rounded p-2 max-h-60 overflow-y-auto">
                  <For each={allItems()!.items}>
                    {(item) => (
                      <div class="flex justify-between items-center text-[10px] py-0.5 border-b border-overlay-border last:border-0">
                        <div class="flex items-center gap-1 truncate flex-1 min-w-0">
                          <span
                            class="inline-block w-1.5 h-1.5 rounded-full flex-shrink-0"
                            style={{ background: rarityColor(item.rarity) }}
                          />
                          <span class="truncate">{item.name}</span>
                          {item.quantity > 1 && <span class="text-text-muted">×{item.quantity}</span>}
                          <span class="text-text-muted flex-shrink-0">[{item.source}]</span>
                        </div>
                        <span class="font-mono text-kamas ml-1 flex-shrink-0">
                          {item.unitPrice > 0 ? fmtKamas(item.totalValue) : "—"}
                        </span>
                      </div>
                    )}
                  </For>
                </div>
              </Show>
            </>
          );
        }}
      </Show>
    </div>
  );
};

export default PatrimoineView;
