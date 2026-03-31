import { fetchJson } from "../api.js";

const RARITY_NAMES = ["Commun","Commun","Rare","Mythique","Legendaire","Epique","Relique","Souvenir"];
const RARITY_COLORS = ["#c0c0c0","#ffffff","#00cc44","#ff8c19","#ffee00","#ff55ff","#66ccff","#ff6600"];

function fmtK(n) {
  if (!n && n !== 0) return "0";
  if (n >= 1000000) return (n / 1000000).toFixed(1) + "M";
  if (n >= 1000) return (n / 1000).toFixed(1) + "K";
  return n.toLocaleString("fr-FR");
}

function icoUrl(gfx) {
  if (!gfx) return "";
  return "https://static.ankama.com/wakfu/portal/game/item/115/" + gfx + ".png";
}

let ms = { query: "", side: "", offset: 0, limit: 30, sort: "unit_price", order: "asc" };
let currentSub = "patrimoine";

// ===================== PATRIMOINE =====================
async function loadPatrimoine() {
  const el = document.getElementById("hdv-patrimoine");
  if (!el) return;
  el.innerHTML = "<p style='color:#aaa'>Chargement du patrimoine...</p>";
  try {
    const data = await fetchJson("/api/patrimoine");
    if (data.error) {
      el.innerHTML = "<p style='color:#f44'>" + data.error + "</p>";
      return;
    }
    let html = "<div style='display:flex;gap:16px;flex-wrap:wrap;margin-bottom:20px'>";
    html += "<div style='background:#1a1a2e;padding:16px 24px;border-radius:8px;min-width:180px'>";
    html += "<div style='color:#aaa;font-size:12px'>VALEUR TOTALE</div>";
    html += "<div style='color:#ffee00;font-size:28px;font-weight:bold'>" + fmtK(data.totalValue) + " K</div></div>";
    html += "<div style='background:#1a1a2e;padding:16px 24px;border-radius:8px;min-width:140px'>";
    html += "<div style='color:#aaa;font-size:12px'>KAMAS LIQUIDES</div>";
    html += "<div style='color:#00cc44;font-size:22px;font-weight:bold'>" + fmtK(data.kamas) + "</div></div>";
    html += "<div style='background:#1a1a2e;padding:16px 24px;border-radius:8px;min-width:140px'>";
    html += "<div style='color:#aaa;font-size:12px'>COFFRE</div>";
    html += "<div style='color:#66ccff;font-size:22px'>" + fmtK(data.chestValue) + " K</div>";
    html += "<div style='color:#888;font-size:11px'>" + (data.chestPriced || 0) + " items evalues</div></div>";
    html += "<div style='background:#1a1a2e;padding:16px 24px;border-radius:8px;min-width:140px'>";
    html += "<div style='color:#aaa;font-size:12px'>INVENTAIRE</div>";
    html += "<div style='color:#ff8c19;font-size:22px'>" + fmtK(data.inventoryValue) + " K</div>";
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
        var rc = RARITY_COLORS[it.rarity || 0] || "#ccc";
        html += "<tr data-item-ref-id='" + (it.itemId || it.item_ref_id || 0) + "' data-item-name='" + ((it.name || '').replace(/'/g, '')) + "' style='border-bottom:1px solid #222'>";
        html += "<td style='padding:6px;display:flex;align-items:center;gap:6px'>";
        if (it.gfxId) html += "<img src='" + icoUrl(it.gfxId) + "' width='28' height='28' style='border-radius:4px' onerror='this.style.display=\"none\"'>";
        html += "<span style='color:" + rc + "'>" + (it.name || "#" + it.itemId) + "</span></td>";
        html += "<td>" + (it.quantity || 1) + "</td>";
        html += "<td>" + fmtK(it.unitPrice) + "</td>";
        html += "<td style='color:#ffee00;font-weight:bold'>" + fmtK(it.totalValue) + "</td>";
        html += "<td style='color:#888;font-size:12px'>" + (it.source || "") + "</td>";
        html += "</tr>";
      }
      html += "</tbody></table>";
    }

    if (!data.topItems || data.topItems.length === 0) {
      html += "<p style='color:#888;margin-top:20px'>Aucun item evaluable. La base HDV (hdv_market.db) est probablement vide. Lance l agent Java pour capturer des offres.</p>";
    }
    el.innerHTML = html;
    attachPriceHover();
  } catch (e) {
    el.innerHTML = "<p style='color:#f44'>Erreur: " + e.message + "</p>";
  }
}

// ===================== MARCHE HDV =====================
async function loadMarket() {
  var el = document.getElementById("hdv-market");
  if (!el) return;
  el.innerHTML = "<p style='color:#aaa'>Chargement du marche...</p>";
  try {
    var stats = {};
    try { stats = await fetchJson("/api/market/stats"); } catch(e) { stats = {}; }

    var qs = "/api/market?limit=" + ms.limit + "&offset=" + ms.offset + "&sort=" + ms.sort + "&order=" + ms.order;
    if (ms.query) qs += "&q=" + encodeURIComponent(ms.query);
    if (ms.side) qs += "&side=" + ms.side;
    var data = await fetchJson(qs);

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
        var rc = RARITY_COLORS[it.rarity || 0] || "#ccc";
        var sideLabel = it.side === "buy" ? "<span style='color:#66ccff'>Achat</span>" : "<span style='color:#00cc44'>Vente</span>";
        html += "<tr data-item-ref-id='" + (it.itemId || it.item_ref_id || 0) + "' data-item-name='" + ((it.name || "").replace(/'/g, "\'")) + "' style='border-bottom:1px solid #222'>";
        html += "<td style='padding:6px;display:flex;align-items:center;gap:6px'>";
        if (it.gfxId) html += "<img src='" + icoUrl(it.gfxId) + "' width='28' height='28' style='border-radius:4px' onerror='this.style.display=\"none\"'>";
        html += "<span style='color:" + rc + "'>" + (it.name || "#" + it.itemId) + "</span></td>";
        html += "<td>" + (it.qty || 1) + "</td>";
        html += "<td style='color:#ffee00'>" + fmtK(it.unitPrice) + "</td>";
        html += "<td>" + fmtK(it.totalPrice) + "</td>";
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
    attachPriceHover();

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
    el.addEventListener("click", function() { switchHdvSub(el.dataset.hdvSub); });
  });
  switchHdvSub("patrimoine");
}


// ============================================================
// GRAPHE D'EVOLUTION DES PRIX AU MOUSEOVER
// ============================================================
let tooltipEl = null;
let tooltipCanvas = null;
let tooltipCtx = null;
let tooltipTitle = null;
let tooltipStats = null;
let currentHoverItem = null;
let hoverTimeout = null;

function ensureTooltip() {
    if (tooltipEl) return;
    tooltipEl = document.createElement("div");
    tooltipEl.id = "hdv-price-tooltip";
    tooltipEl.style.cssText = `
        position: fixed; z-index: 9999; display: none;
        background: #1a1a2e; border: 1px solid #16213e; border-radius: 8px;
        padding: 10px; box-shadow: 0 4px 20px rgba(0,0,0,0.5);
        pointer-events: none; min-width: 280px;
    `;
    tooltipTitle = document.createElement("div");
    tooltipTitle.style.cssText = "color: #e0e0e0; font-size: 13px; font-weight: bold; margin-bottom: 6px; white-space: nowrap;";
    tooltipEl.appendChild(tooltipTitle);

    tooltipStats = document.createElement("div");
    tooltipStats.style.cssText = "color: #aaa; font-size: 11px; margin-bottom: 6px; display: flex; gap: 12px;";
    tooltipEl.appendChild(tooltipStats);

    tooltipCanvas = document.createElement("canvas");
    tooltipCanvas.width = 260;
    tooltipCanvas.height = 100;
    tooltipCanvas.style.cssText = "border-radius: 4px; background: #0f0f23;";
    tooltipEl.appendChild(tooltipCanvas);
    tooltipCtx = tooltipCanvas.getContext("2d");
    document.body.appendChild(tooltipEl);
}

function drawPriceChart(data) {
    const ctx = tooltipCtx;
    const W = tooltipCanvas.width;
    const H = tooltipCanvas.height;
    ctx.clearRect(0, 0, W, H);

    const prices = data.history
        .map(h => h.unit_price || 0)
        .filter(p => p > 0)
        .reverse(); // chronological

    if (prices.length === 0) {
        ctx.fillStyle = "#666";
        ctx.font = "12px sans-serif";
        ctx.textAlign = "center";
        ctx.fillText("Pas assez de données", W / 2, H / 2);
        return;
    }

    if (prices.length === 1) {
        // Single point - draw horizontal line
        ctx.strokeStyle = "#00d2ff";
        ctx.lineWidth = 2;
        ctx.beginPath();
        ctx.moveTo(10, H / 2);
        ctx.lineTo(W - 10, H / 2);
        ctx.stroke();
        ctx.fillStyle = "#00d2ff";
        ctx.beginPath();
        ctx.arc(W / 2, H / 2, 4, 0, Math.PI * 2);
        ctx.fill();
        return;
    }

    const pad = { top: 8, bottom: 20, left: 10, right: 10 };
    const chartW = W - pad.left - pad.right;
    const chartH = H - pad.top - pad.bottom;
    const minP = Math.min(...prices);
    const maxP = Math.max(...prices);
    const range = maxP - minP || 1;

    // Grid lines
    ctx.strokeStyle = "#1a1a3e";
    ctx.lineWidth = 0.5;
    for (let i = 0; i <= 4; i++) {
        const y = pad.top + (chartH * i) / 4;
        ctx.beginPath();
        ctx.moveTo(pad.left, y);
        ctx.lineTo(W - pad.right, y);
        ctx.stroke();
    }

    // Price line
    const gradient = ctx.createLinearGradient(0, pad.top, 0, H - pad.bottom);
    gradient.addColorStop(0, "#00d2ff");
    gradient.addColorStop(1, "#0051ff");

    ctx.strokeStyle = gradient;
    ctx.lineWidth = 2;
    ctx.lineJoin = "round";
    ctx.beginPath();
    for (let i = 0; i < prices.length; i++) {
        const x = pad.left + (chartW * i) / (prices.length - 1);
        const y = pad.top + chartH - ((prices[i] - minP) / range) * chartH;
        if (i === 0) ctx.moveTo(x, y);
        else ctx.lineTo(x, y);
    }
    ctx.stroke();

    // Fill area under curve
    const fillGrad = ctx.createLinearGradient(0, pad.top, 0, H - pad.bottom);
    fillGrad.addColorStop(0, "rgba(0, 210, 255, 0.15)");
    fillGrad.addColorStop(1, "rgba(0, 81, 255, 0.02)");
    ctx.fillStyle = fillGrad;
    ctx.lineTo(pad.left + chartW, pad.top + chartH);
    ctx.lineTo(pad.left, pad.top + chartH);
    ctx.closePath();
    ctx.fill();

    // Min/Max labels
    ctx.fillStyle = "#888";
    ctx.font = "9px sans-serif";
    ctx.textAlign = "left";
    ctx.fillText(fmtK(minP), pad.left, H - 4);
    ctx.textAlign = "right";
    ctx.fillText(fmtK(maxP), W - pad.right, pad.top + 10);

    // Last point dot
    const lastX = pad.left + chartW;
    const lastY = pad.top + chartH - ((prices[prices.length - 1] - minP) / range) * chartH;
    ctx.fillStyle = "#00ff88";
    ctx.beginPath();
    ctx.arc(lastX, lastY, 3, 0, Math.PI * 2);
    ctx.fill();
}


export async function showPriceTooltip(itemRefId, itemName, event) {
    ensureTooltip();
    if (currentHoverItem === itemRefId && tooltipEl.style.display !== "none") {
        positionTooltip(event);
        return;
    }
    currentHoverItem = itemRefId;
    tooltipTitle.textContent = itemName || `Item #${itemRefId}`;
    tooltipStats.textContent = "Chargement...";
    tooltipCtx.clearRect(0, 0, tooltipCanvas.width, tooltipCanvas.height);
    tooltipEl.style.display = "block";
    positionTooltip(event);

    try {
        const resp = await fetch(`/api/market/history/${itemRefId}`);
        if (!resp.ok) throw new Error(resp.statusText);
        const data = await resp.json();

        if (currentHoverItem !== itemRefId) return; // cursor moved

        tooltipTitle.textContent = data.name || itemName || `Item #${itemRefId}`;
        tooltipStats.innerHTML = `
            <span style="color:#00ff88">Min: ${fmtK(data.min_price)}</span>
            <span style="color:#ff6b6b">Max: ${fmtK(data.max_price)}</span>
            <span style="color:#ffd93d">Moy: ${fmtK(data.avg_price)}</span>
            <span style="color:#aaa">${data.count} offres</span>
        `;
        drawPriceChart(data);
    } catch (e) {
        tooltipStats.textContent = "Erreur: " + e.message;
    }
}

export function positionTooltip(event) {
    if (!tooltipEl) return;
    const margin = 15;
    let x = event.clientX + margin;
    let y = event.clientY + margin;
    const rect = tooltipEl.getBoundingClientRect();
    if (x + rect.width > window.innerWidth) x = event.clientX - rect.width - margin;
    if (y + rect.height > window.innerHeight) y = event.clientY - rect.height - margin;
    tooltipEl.style.left = x + "px";
    tooltipEl.style.top = y + "px";
}

export function hidePriceTooltip() {
    currentHoverItem = null;
    if (tooltipEl) tooltipEl.style.display = "none";
}

// Exposer sur window pour les autres onglets
window.__showPriceTooltip = showPriceTooltip;
window.__positionTooltip = positionTooltip;
window.__hidePriceTooltip = hidePriceTooltip;


// === Attacher les événements au tableau marché ===
export function attachPriceHover() {
    var containers = [
        document.getElementById("hdv-patrimoine"),
        document.getElementById("hdv-market"),
        document.getElementById("market-table-body")
    ].filter(Boolean);
    if (containers.length === 0) return;
    containers.forEach(function(container) {

    container.addEventListener("mouseover", (e) => {
        const row = e.target.closest("tr[data-item-ref-id]");
        if (!row) return;
        clearTimeout(hoverTimeout);
        hoverTimeout = setTimeout(() => {
            const itemRefId = parseInt(row.dataset.itemRefId);
            const itemName = row.dataset.itemName || row.querySelector("td:nth-child(2)")?.textContent?.trim() || "";
            showPriceTooltip(itemRefId, itemName, e);
        }, 200); // 200ms delay to avoid spam
    });

    container.addEventListener("mousemove", (e) => {
        if (tooltipEl && tooltipEl.style.display !== "none") {
            positionTooltip(e);
        }
    });

    container.addEventListener("mouseout", (e) => {
        const row = e.target.closest("tr[data-item-ref-id]");
        if (row) {
            clearTimeout(hoverTimeout);
            hidePriceTooltip();
        }
    });
    }); // fin forEach containers
}
