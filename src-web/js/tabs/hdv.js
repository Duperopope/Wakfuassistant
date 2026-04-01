import { fetchJson } from "../api.js";
import { RARITY, getRarity, fmtPrice, getIconSrc, getCdnIconSrc, escHtml } from "../shared/item.js";
import { prefillCache } from "../tooltip.js";


// fmtK -> fmtPrice (shared/item.js)

// icoUrl -> getCdnIconSrc (shared/item.js)

let ms = { query: "", side: "", offset: 0, limit: 30, sort: "unit_price", order: "asc" };
let currentSub = "patrimoine";
let _lastPatrimoineTs = null;
let _lastMarketTs = null;

// ===================== PATRIMOINE =====================
async function loadPatrimoine(isSSE) {
  const el = document.getElementById("hdv-patrimoine");
  if (!el) return;
  if (!isSSE) el.innerHTML = "<p style='color:#aaa'>Chargement du patrimoine...</p>";
  try {
    const data = await fetchJson("/api/patrimoine");
    if (data.error) {
      el.innerHTML = "<p style='color:#f44'>" + data.error + "</p>";
      return;
    }
    // Skip re-render si donnees identiques (SSE refresh)
    const ts = data.lastUpdate || "";
    if (isSSE && ts && ts === _lastPatrimoineTs) return;
    _lastPatrimoineTs = ts;
    let html = "<div style='display:flex;gap:16px;flex-wrap:wrap;margin-bottom:20px'>";
    html += "<div style='background:#1a1a2e;padding:16px 24px;border-radius:8px;min-width:180px'>";
    html += "<div style='color:#aaa;font-size:12px'>VALEUR TOTALE</div>";
    html += "<div style='color:#ffee00;font-size:28px;font-weight:bold'>" + fmtPrice(data.totalValue) + " K</div></div>";
    html += "<div style='background:#1a1a2e;padding:16px 24px;border-radius:8px;min-width:140px'>";
    html += "<div style='color:#aaa;font-size:12px'>KAMAS LIQUIDES</div>";
    html += "<div style='color:#00cc44;font-size:22px;font-weight:bold'>" + fmtPrice(data.kamas) + "</div></div>";
    html += "<div style='background:#1a1a2e;padding:16px 24px;border-radius:8px;min-width:140px'>";
    html += "<div style='color:#aaa;font-size:12px'>COFFRE</div>";
    html += "<div style='color:#66ccff;font-size:22px'>" + fmtPrice(data.chestValue) + " K</div>";
    html += "<div style='color:#888;font-size:11px'>" + (data.chestPriced || 0) + " items evalues</div></div>";
    html += "<div style='background:#1a1a2e;padding:16px 24px;border-radius:8px;min-width:140px'>";
    html += "<div style='color:#aaa;font-size:12px'>INVENTAIRE</div>";
    html += "<div style='color:#ff8c19;font-size:22px'>" + fmtPrice(data.inventoryValue) + " K</div>";
    html += "<div style='color:#888;font-size:11px'>" + (data.inventoryPriced || 0) + " items evalues</div></div>";
    html += "</div>";
    if (data.lastUpdate) { html += "<div style='color:#888;font-size:12px;margin-bottom:16px'>Derniere mise a jour des prix : " + data.lastUpdate + "</div>"; }

    if (data.topItems && data.topItems.length > 0) {
      html += "<h3 style='color:#ddd;margin:16px 0 8px'>Top items par valeur</h3>";
      html += "<table style='width:100%;border-collapse:collapse'>";
      html += "<thead><tr style='color:#aaa;font-size:12px;text-align:left'>";
      html += "<th style='padding:6px'>Item</th><th>Qte</th><th>Prix unit.</th><th>Valeur</th><th>Source</th></tr></thead><tbody>";
      for (var i = 0; i < data.topItems.length; i++) {
        var it = data.topItems[i];
        var rc = getRarity(it.rarity).hex;
        html += "<tr data-item-ref-id='" + (it.itemId || it.item_ref_id || 0) + "' data-item-id='" + (it.itemId || it.item_ref_id || 0) + "' data-item-name='" + ((it.name || '').replace(/'/g, '')) + "' data-slot-colors='" + (it.slotColors || "") + "' style='border-bottom:1px solid #222'>";
        html += "<td style='padding:6px;display:flex;align-items:center;gap:6px'>";
        if (it.gfxId) html += "<img src='" + getIconSrc(it.gfxId) + "' width='28' height='28' style='border-radius:4px' onerror='this.style.display=\"none\"'>";
        html += "<span style='color:" + rc + "'>" + (it.name || "#" + it.itemId) + "</span></td>";
        html += "<td>" + (it.quantity || 1) + "</td>";
        html += "<td>" + fmtPrice(it.unitPrice) + "</td>";
        html += "<td style='color:#ffee00;font-weight:bold'>" + fmtPrice(it.totalValue) + "</td>";
        html += "<td style='color:#888;font-size:12px'>" + (it.source || "") + "</td>";
        html += "</tr>";
      }
      html += "</tbody></table>";
    }

    if (!data.topItems || data.topItems.length === 0) {
      html += "<p style='color:#888;margin-top:20px'>Aucun item evaluable. La base HDV (hdv_market.db) est probablement vide. Lance l agent Java pour capturer des offres.</p>";
    }
    el.innerHTML = html;

    // Prefill tooltip cache
    if (data.topItems) {
      prefillCache(data.topItems.map(it => ({
        id: it.itemId || it.item_ref_id, name_fr: it.name,
        level: 0, rarity: it.rarity, gfxId: it.gfxId,
        slotColors: it.slotColors || "",
      })));
    }
  } catch (e) {
    el.innerHTML = "<p style='color:#f44'>Erreur: " + e.message + "</p>";
  }
}

// ===================== MARCHE HDV =====================
async function loadMarket(isSSE) {
  var el = document.getElementById("hdv-market");
  if (!el) return;
  if (!isSSE) el.innerHTML = "<p style='color:#aaa'>Chargement du marche...</p>";
  try {
    var stats = {};
    try { stats = await fetchJson("/api/market/stats"); } catch(e) { stats = {}; }

    var qs = "/api/market?limit=" + ms.limit + "&offset=" + ms.offset + "&sort=" + ms.sort + "&order=" + ms.order;
    if (ms.query) qs += "&q=" + encodeURIComponent(ms.query);
    if (ms.side) qs += "&side=" + ms.side;
    var data = await fetchJson(qs);

    // Skip re-render si donnees identiques (SSE refresh)
    var mktTs = data.lastUpdate || "";
    if (isSSE && mktTs && mktTs === _lastMarketTs) return;
    _lastMarketTs = mktTs;

    var html = "<div style='margin-bottom:12px;display:flex;gap:12px;align-items:center;flex-wrap:wrap'>";
    html += "<input id='hdv-search' type='text' placeholder='Rechercher un item...' value='" + (ms.query || "") + "' style='padding:8px 12px;background:#1a1a2e;border:1px solid #333;color:#fff;border-radius:6px;width:240px'>";
    html += "<select id='hdv-side' style='padding:8px;background:#1a1a2e;border:1px solid #333;color:#fff;border-radius:6px'>";
    html += "<option value=''" + (ms.side === "" ? " selected" : "") + ">Tous</option>";
    html += "<option value='sell'" + (ms.side === "sell" ? " selected" : "") + ">Vente</option>";
    html += "<option value='buy'" + (ms.side === "buy" ? " selected" : "") + ">Achat</option></select>";
    html += "<span style='color:#888;font-size:13px'>" + (stats.total_latest || data.total || 0) + " offres | " + (stats.unique_items || 0) + " items uniques</span>";
    html += "</div>";
    if (data.lastUpdate) { html += "<div style='color:#888;font-size:12px;margin-bottom:16px'>Derniere mise a jour des prix : " + data.lastUpdate + "</div>"; }

    if (!data.items || data.items.length === 0) {
      html += "<p style='color:#888'>Aucune offre trouvee. La DB HDV est vide ou aucun resultat pour cette recherche.</p>";
    } else {
      html += "<table style='width:100%;border-collapse:collapse'>";
      html += "<thead><tr style='color:#aaa;font-size:12px;text-align:left'>";
      html += "<th style='padding:6px'>Item</th><th>Qte</th><th>Prix unit.</th><th>Prix total</th><th>Type</th><th>Date</th></tr></thead><tbody>";
      for (var i = 0; i < data.items.length; i++) {
        var it = data.items[i];
        var rc = getRarity(it.rarity).hex;
        var sideLabel = it.side === "buy" ? "<span style='color:#66ccff'>Achat</span>" : "<span style='color:#00cc44'>Vente</span>";
        html += "<tr data-item-ref-id='" + (it.itemId || it.item_ref_id || 0) + "' data-item-id='" + (it.itemId || it.item_ref_id || 0) + "' data-item-name='" + ((it.name || "").replace(/'/g, "\'")) + "' data-slot-colors='" + (it.slotColors || "") + "' style='border-bottom:1px solid #222'>";
        html += "<td style='padding:6px;display:flex;align-items:center;gap:6px'>";
        if (it.gfxId) html += "<img src='" + getIconSrc(it.gfxId) + "' width='28' height='28' style='border-radius:4px' onerror='this.style.display=\"none\"'>";
        html += "<span style='color:" + rc + "'>" + (it.name || "#" + it.itemId) + "</span></td>";
        html += "<td>" + (it.qty || 1) + "</td>";
        html += "<td style='color:#ffee00'>" + fmtPrice(it.unitPrice) + "</td>";
        html += "<td>" + fmtPrice(it.totalPrice) + "</td>";
        html += "<td>" + sideLabel + "</td>";
        html += "<td style='color:#888;font-size:12px'>" + (it.capturedAt || "") + "</td>";
        html += "</tr>";
      }
      html += "</tbody></table>";

      // Pagination
      var totalPages = Math.ceil((data.total || 0) / ms.limit);
      var curPage = Math.floor(ms.offset / ms.limit) + 1;
      if (totalPages > 1) {
        html += "<div style='margin-top:12px;display:flex;gap:8px;align-items:center'>";
        if (curPage > 1) html += "<button class='hdv-page-btn' data-page='" + (curPage - 1) + "' style='padding:4px 12px;background:#333;color:#fff;border:none;border-radius:4px;cursor:pointer'>Precedent</button>";
        html += "<span style='color:#aaa'>Page " + curPage + " / " + totalPages + "</span>";
        if (curPage < totalPages) html += "<button class='hdv-page-btn' data-page='" + (curPage + 1) + "' style='padding:4px 12px;background:#333;color:#fff;border:none;border-radius:4px;cursor:pointer'>Suivant</button>";
        html += "</div>";
    if (data.lastUpdate) { html += "<div style='color:#888;font-size:12px;margin-bottom:16px'>Derniere mise a jour des prix : " + data.lastUpdate + "</div>"; }
      }
    }

    el.innerHTML = html;

    // Prefill tooltip cache
    if (data.items) {
      prefillCache(data.items.map(it => ({
        id: it.itemId || it.item_ref_id, name_fr: it.name,
        level: 0, rarity: it.rarity, gfxId: it.gfxId,
        slotColors: it.slotColors || "",
      })));
    }

    // Bind events
    var searchInput = document.getElementById("hdv-search");
    if (searchInput) {
      searchInput.addEventListener("keyup", function(e) {
        if (e.key === "Enter") { ms.query = searchInput.value; ms.offset = 0; loadMarket(); }
      });
    }
    var sideSelect = document.getElementById("hdv-side");
    if (sideSelect) {
      sideSelect.addEventListener("change", function() { ms.side = sideSelect.value; ms.offset = 0; loadMarket(); });
    }
    document.querySelectorAll(".hdv-page-btn").forEach(function(btn) {
      btn.addEventListener("click", function() { var p = parseInt(btn.dataset.page); ms.offset = (p - 1) * ms.limit; loadMarket(); });
    });
  } catch (e) {
    el.innerHTML = "<p style='color:#f44'>Erreur: " + e.message + "</p>";
  }
}

// ===================== SWITCH SUB-TAB =====================
function switchHdvSub(sub) {
  currentSub = sub;
  document.querySelectorAll("[data-hdv-sub]").forEach(function(el) {
    el.classList.toggle("active", el.dataset.hdvSub === sub);
  });
  var patEl = document.getElementById("hdv-patrimoine");
  var mktEl = document.getElementById("hdv-market");
  if (patEl) patEl.style.display = sub === "patrimoine" ? "" : "none";
  if (mktEl) mktEl.style.display = sub === "market" ? "" : "none";
  if (sub === "patrimoine") loadPatrimoine();
  if (sub === "market") loadMarket();
}

// ===================== INIT =====================
export function loadHdv() {
  document.querySelectorAll("[data-hdv-sub]").forEach(function(el) {
    el.removeEventListener("click", el._hdvClickHandler);
    el._hdvClickHandler = function() { switchHdvSub(el.dataset.hdvSub); };
    el.addEventListener("click", el._hdvClickHandler);
  });
  switchHdvSub("patrimoine");
}

// Rafraichit uniquement le sous-onglet actif (pour SSE — skip si donnees inchangees)
export function refreshHdv() {
  if (currentSub === "patrimoine") loadPatrimoine(true);
  else if (currentSub === "market") loadMarket(true);
}
