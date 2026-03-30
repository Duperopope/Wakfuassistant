/**
 * hdvApi.ts — Types et commandes Tauri pour HDV + Patrimoine
 */
import { invoke } from "@tauri-apps/api/core";

// ── HDV Types ───────────────────────────────────────────────────────────────

export interface HdvStats {
  totalSellItems: number;
  totalBuyItems: number;
  totalSellOffers: number;
  totalBuyOffers: number;
  lastUpdated: string | null;
  priceRangeMin: number;
  priceRangeMax: number;
}

export interface MarketItemRow {
  itemRefId: number;
  nameFr: string;
  level: number;
  rarity: number;
  minPrice: number;
  avgPrice: number;
  maxPrice: number;
  offerCount: number;
  totalQty: number;
  side: string;
}

export interface MarketSearchResult {
  rows: MarketItemRow[];
  total: number;
  page: number;
  perPage: number;
}

export interface MarketOffer {
  offerUid: number;
  actorName: string;
  actorLevel: number;
  unitPrice: number;
  qtyInit: number;
  qtyRemaining: number;
  sellDuration: number;
  expirationDate: string;
  updatedAt: string;
  side: string;
  slotColors: string;
  sublimationId: number;
}

export interface ItemDetail {
  itemRefId: number;
  nameFr: string;
  level: number;
  rarity: number;
  sellOffers: MarketOffer[];
  buyOffers: MarketOffer[];
  sellMin: number | null;
  sellAvg: number | null;
  buyMax: number | null;
}

// ── Patrimoine Types ────────────────────────────────────────────────────────

export interface PatrimoineItem {
  itemRefId: number;
  name: string;
  quantity: number;
  unitPrice: number;
  totalValue: number;
  source: string;
  rarity: number;
}

export interface PatrimoineSummary {
  kamas: number;
  chestValue: number;
  chestItemCount: number;
  chestPricedCount: number;
  inventoryValue: number;
  inventoryItemCount: number;
  inventoryPricedCount: number;
  totalValue: number;
  topItems: PatrimoineItem[];
  unpricedCount: number;
}

export interface PatrimoineListResult {
  items: PatrimoineItem[];
  total: number;
  page: number;
  perPage: number;
  totalValue: number;
}

// ── Rarity helpers ──────────────────────────────────────────────────────────

export const RARITY_NAMES: Record<number, string> = {
  0: "Commun",    1: "Inhabituel", 2: "Rare",
  3: "Mythique",  4: "Légendaire", 5: "Relique",
  6: "Épique",    7: "Ultime",     8: "Souvenir",
};

export const RARITY_COLORS: Record<number, string> = {
  0: "#9ca3af", 1: "#e5e7eb", 2: "#4ade80",
  3: "#fb923c", 4: "#fbbf24", 5: "#c084fc",
  6: "#22d3ee", 7: "#f43f5e", 8: "#a78bfa",
};

export function rarityName(r: number): string {
  return RARITY_NAMES[r] ?? "Inconnu";
}

export function rarityColor(r: number): string {
  return RARITY_COLORS[r] ?? "#9ca3af";
}

// ── Format helpers ──────────────────────────────────────────────────────────

export function fmtKamas(n: number): string {
  if (n >= 1_000_000) return (n / 1_000_000).toFixed(1) + "M";
  if (n >= 1_000) return (n / 1_000).toFixed(0) + "K";
  return n.toLocaleString("fr-FR");
}

export function fmtNumber(n: number): string {
  return new Intl.NumberFormat("fr-FR").format(n);
}

// ── HDV Commands ────────────────────────────────────────────────────────────

export async function getHdvStats(): Promise<HdvStats> {
  return invoke<HdvStats>("get_hdv_stats");
}

export async function searchHdvItems(
  query: string,
  side: string,
  sort: string,
  page: number,
  perPage: number,
): Promise<MarketSearchResult> {
  return invoke<MarketSearchResult>("search_hdv_items", {
    query, side, sort, page, perPage,
  });
}

export async function getItemDetail(itemRefId: number): Promise<ItemDetail> {
  return invoke<ItemDetail>("get_item_detail", { itemRefId });
}

// ── Patrimoine Commands ─────────────────────────────────────────────────────

export async function getPatrimoineSummary(): Promise<PatrimoineSummary> {
  return invoke<PatrimoineSummary>("get_patrimoine_summary");
}

export async function getPatrimoineItems(
  source: string,
  sort: string,
  page: number,
  perPage: number,
): Promise<PatrimoineListResult> {
  return invoke<PatrimoineListResult>("get_patrimoine_items", {
    source, sort, page, perPage,
  });
}
