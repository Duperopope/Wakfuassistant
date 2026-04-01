import type { Component } from "solid-js";
import { createSignal, createResource, For, Show } from "solid-js";
import {
  searchHdvItems,
  getHdvStats,
  getItemDetail,
  fmtKamas,
  fmtNumber,
  rarityColor,
  rarityName,
  type MarketSearchResult,
  type HdvStats,
  type ItemDetail,
} from "../../lib/hdvApi";

const MarketView: Component = () => {
  const [query, setQuery] = createSignal("");
  const [side, setSide] = createSignal("sell");
  const [sort, setSort] = createSignal("price_asc");
  const [page, setPage] = createSignal(0);
  const PER_PAGE = 30;

  const [stats] = createResource(getHdvStats);

  const searchParams = () => ({
    q: query(),
    side: side(),
    sort: sort(),
    page: page(),
  });

  const [results] = createResource(searchParams, async (p) => {
    return searchHdvItems(p.q, p.side, p.sort, p.page, PER_PAGE);
  });

  // Détail item
  const [selectedId, setSelectedId] = createSignal<number | null>(null);
  const [detail] = createResource(
    () => selectedId(),
    async (id) => (id ? getItemDetail(id) : null),
  );

  let searchTimeout: number | undefined;
  const onSearchInput = (val: string) => {
    clearTimeout(searchTimeout);
    searchTimeout = setTimeout(() => {
      setQuery(val);
      setPage(0);
    }, 300) as unknown as number;
  };

  const totalPages = () => {
    const r = results();
    return r ? Math.ceil(r.total / PER_PAGE) : 0;
  };

  return (
    <div class="space-y-2">
      {/* Stats header */}
      <Show when={stats()}>
        {(s) => (
          <div class="flex gap-2 text-[9px] text-text-muted">
            <span>{fmtNumber(s().totalSellOffers)} ventes</span>
            <span>•</span>
            <span>{fmtNumber(s().totalBuyOffers)} achats</span>
            <span>•</span>
            <span>{fmtNumber(s().totalSellItems)} items</span>
          </div>
        )}
      </Show>

      {/* Search + filters */}
      <div class="flex gap-1">
        <input
          type="text"
          placeholder="Rechercher un item..."
          onInput={(e) => onSearchInput(e.currentTarget.value)}
          class="flex-1 bg-overlay-surface text-text-primary text-xs rounded px-2 py-1.5 border border-overlay-border focus:border-accent outline-none"
        />
      </div>
      <div class="flex gap-1 text-[10px]">
        <For
          each={[
            { v: "sell", l: "Ventes" },
            { v: "buy", l: "Achats" },
            { v: "both", l: "Tout" },
          ]}
        >
          {(opt) => (
            <button
              onClick={() => {
                setSide(opt.v);
                setPage(0);
              }}
              class={`px-2 py-0.5 rounded transition ${
                side() === opt.v
                  ? "bg-accent text-overlay-bg"
                  : "bg-overlay-surface text-text-muted hover:text-text-primary"
              }`}
            >
              {opt.l}
            </button>
          )}
        </For>
        <div class="flex-1" />
        <select
          value={sort()}
          onChange={(e) => {
            setSort(e.currentTarget.value);
            setPage(0);
          }}
          class="bg-overlay-surface text-text-muted text-[10px] rounded px-1 border border-overlay-border outline-none"
        >
          <option value="price_asc">Prix ↑</option>
          <option value="price_desc">Prix ↓</option>
          <option value="name_asc">Nom A-Z</option>
          <option value="level_desc">Niveau ↓</option>
          <option value="offers_desc">Offres ↓</option>
        </select>
      </div>

      {/* Results */}
      <Show
        when={!results.loading}
        fallback={
          <div class="text-xs text-text-muted text-center py-4">
            Recherche...
          </div>
        }
      >
        <Show when={results()}>
          {(r) => (
            <>
              <div class="text-[9px] text-text-muted">
                {r().total} résultats — page {r().page + 1}/{totalPages()}
              </div>
              <div class="space-y-0.5 max-h-52 overflow-y-auto">
                <For each={r().rows}>
                  {(item) => (
                    <button
                      onClick={() => setSelectedId(item.itemRefId)}
                      class={`w-full flex justify-between items-center text-[11px] py-1 px-1.5 rounded transition hover:bg-overlay-surface ${
                        selectedId() === item.itemRefId
                          ? "bg-overlay-surface"
                          : ""
                      }`}
                    >
                      <div class="flex items-center gap-1 truncate flex-1 min-w-0">
                        <span
                          class="inline-block w-1.5 h-1.5 rounded-full flex-shrink-0"
                          style={{ background: rarityColor(item.rarity) }}
                        />
                        <span class="text-text-primary truncate">
                          {item.nameFr}
                        </span>
                        <span class="text-text-muted flex-shrink-0 text-[9px]">
                          Niv.{item.level}
                        </span>
                      </div>
                      <div class="flex items-center gap-2 flex-shrink-0 ml-1">
                        <span class="font-mono text-kamas">
                          {fmtKamas(item.minPrice)}
                        </span>
                        <span class="text-text-muted text-[9px]">
                          ×{item.offerCount}
                        </span>
                      </div>
                    </button>
                  )}
                </For>
              </div>

              {/* Pagination */}
              <Show when={totalPages() > 1}>
                <div class="flex justify-center gap-2 pt-1">
                  <button
                    onClick={() => setPage(Math.max(0, page() - 1))}
                    disabled={page() === 0}
                    class="text-[10px] px-2 py-0.5 rounded bg-overlay-surface text-text-muted disabled:opacity-30"
                  >
                    ←
                  </button>
                  <span class="text-[10px] text-text-muted py-0.5">
                    {page() + 1} / {totalPages()}
                  </span>
                  <button
                    onClick={() =>
                      setPage(Math.min(totalPages() - 1, page() + 1))
                    }
                    disabled={page() >= totalPages() - 1}
                    class="text-[10px] px-2 py-0.5 rounded bg-overlay-surface text-text-muted disabled:opacity-30"
                  >
                    →
                  </button>
                </div>
              </Show>
            </>
          )}
        </Show>
      </Show>

      {/* Item detail panel */}
      <Show when={detail()}>
        {(d) => {
          const data = d();
          if (!data) return null;
          return (
            <div class="bg-overlay-surface rounded-lg p-2 border border-overlay-border mt-1">
              <div class="flex justify-between items-start mb-2">
                <div>
                  <div class="flex items-center gap-1">
                    <span
                      class="inline-block w-2 h-2 rounded-full"
                      style={{ background: rarityColor(data.rarity) }}
                    />
                    <span class="text-xs font-bold text-text-primary">
                      {data.nameFr}
                    </span>
                  </div>
                  <div class="text-[9px] text-text-muted">
                    Niv.{data.level} • {rarityName(data.rarity)}
                  </div>
                </div>
                <button
                  onClick={() => setSelectedId(null)}
                  class="text-text-muted text-xs hover:text-text-primary"
                >
                  ✕
                </button>
              </div>

              {/* Prix résumé */}
              <div class="grid grid-cols-3 gap-1 text-center text-[10px] mb-2">
                <div>
                  <div class="text-text-muted">Vente min</div>
                  <div class="font-mono text-victory-green">
                    {data.sellMin ? fmtKamas(data.sellMin) : "—"}
                  </div>
                </div>
                <div>
                  <div class="text-text-muted">Vente moy</div>
                  <div class="font-mono text-text-primary">
                    {data.sellAvg ? fmtKamas(Math.round(data.sellAvg)) : "—"}
                  </div>
                </div>
                <div>
                  <div class="text-text-muted">Achat max</div>
                  <div class="font-mono text-defeat-red">
                    {data.buyMax ? fmtKamas(data.buyMax) : "—"}
                  </div>
                </div>
              </div>

              {/* Offres sell */}
              <Show when={data.sellOffers.length > 0}>
                <div class="text-[9px] text-text-muted uppercase tracking-wider mb-1">
                  Ventes ({data.sellOffers.length})
                </div>
                <div class="space-y-0.5 max-h-24 overflow-y-auto mb-2">
                  <For each={data.sellOffers.slice(0, 15)}>
                    {(o) => (
                      <div class="flex justify-between text-[10px]">
                        <span class="text-text-primary truncate">
                          {o.actorName}
                        </span>
                        <div class="flex gap-2 flex-shrink-0">
                          <span class="font-mono text-kamas">
                            {fmtKamas(o.unitPrice)}
                          </span>
                          <span class="text-text-muted">×{o.qtyRemaining}</span>
                          {o.slotColors && (
                            <span class="text-text-muted text-[8px]">
                              [{o.slotColors}]
                            </span>
                          )}
                        </div>
                      </div>
                    )}
                  </For>
                </div>
              </Show>

              {/* Offres buy */}
              <Show when={data.buyOffers.length > 0}>
                <div class="text-[9px] text-text-muted uppercase tracking-wider mb-1">
                  Achats ({data.buyOffers.length})
                </div>
                <div class="space-y-0.5 max-h-16 overflow-y-auto">
                  <For each={data.buyOffers.slice(0, 10)}>
                    {(o) => (
                      <div class="flex justify-between text-[10px]">
                        <span class="text-text-primary truncate">
                          {o.actorName}
                        </span>
                        <span class="font-mono text-defeat-red">
                          {fmtKamas(o.unitPrice)}
                        </span>
                      </div>
                    )}
                  </For>
                </div>
              </Show>
            </div>
          );
        }}
      </Show>
    </div>
  );
};

export default MarketView;
