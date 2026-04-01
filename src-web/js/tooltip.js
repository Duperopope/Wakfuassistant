/* ============================================================
   Wakfu Assistant — Tooltip système v4
   Basé sur Module:Infobox item dark (wakfu.wiki.gg)
   Source: https://wakfu.wiki.gg/wiki/Module:Infobox_item_dark
   ============================================================ */

import { RARITY, TYPE_INFO, ACTIONS, ELEMENT_ICONS, WIKI, getRarity, escHtml, getIconSrc, fmtPrice } from "./shared/item.js";


// --- Cache tooltip ---
const _cache = {};

// --- Pre-remplir le cache tooltip en batch (appele par les pages apres chargement) ---
// Les items prefills sont marques _partial: le tooltip s'affiche instantanement
// mais un fetch asynchrone enrichit avec les effects/description si disponibles.
export function prefillCache(items) {
  for (let i = 0; i < items.length; i++) {
    const it = items[i];
    const id = it.id || it.item_id || it.itemId || it.refId;
    if (!id || _cache[id]) continue;
    _cache[id] = {
      id: id,
      item_id: id,
      name_fr: it.name_fr || it.name || "",
      level: it.level || 0,
      rarity: it.rarity || 0,
      type_id: it.type_id || it.typeId || 0,
      gfx_id: it.gfx_id || it.gfxId || 0,
      effects: it.effects || [],
      desc_fr: it.desc_fr || "",
      _slot_colors: it._slot_colors || it.slotColors || null,
      _partial: !(it.effects && it.effects.length), // besoin d'enrichissement
    };
  }
}

// --- Fonctions publiques ---

var _currentItemId = null;

function showTooltip(evt, itemId, slotColors) {
  if (!itemId) return;
  let tip = document.getElementById("wk-tooltip");
  if (_currentItemId === itemId && tip && tip.style.display === "block") {
    positionTooltip(tip, evt);
    return;
  }
  _currentItemId = itemId;
  if (!tip) {
    tip = document.createElement("div");
    tip.id = "wk-tooltip";
    tip.className = "wk-tooltip";
    document.body.appendChild(tip);
  }
  tip.style.display = "block";
  positionTooltip(tip, evt);

  // Deja en cache -> render instantane
  if (_cache[itemId]) {
    if (slotColors) _cache[itemId]._slot_colors = slotColors;
    renderTooltip(tip, _cache[itemId]);

    // Enrichissement asynchrone si partial (pas d'effects)
    if (_cache[itemId]._partial) {
      fetch("/api/cdn/" + itemId)
        .then(r => { if (!r.ok) throw new Error(r.status); return r.json(); })
        .then(data => {
          const cached = _cache[itemId];
          if (data.effects && data.effects.length) cached.effects = data.effects;
          if (data.desc_fr) cached.desc_fr = data.desc_fr;
          if (data.type_id) cached.type_id = data.type_id;
          if (data.gfx_id) cached.gfx_id = data.gfx_id;
          cached._partial = false;
          if (_currentItemId == itemId) {
            const t = document.getElementById("wk-tooltip");
            if (t) renderTooltip(t, cached);
          }
        })
        .catch(() => { _cache[itemId]._partial = false; });
    }
    return;
  }

  // Pas en cache -> fetch API (cas rare si prefill a fonctionne)
  tip.innerHTML = '<div style="padding:12px;color:#aaa;text-align:center">Chargement...</div>';

  fetch("/api/cdn/" + itemId)
    .then(r => { if (!r.ok) throw new Error(r.status); return r.json(); })
    .then(data => {
      data._slot_colors = slotColors || null;
      _cache[itemId] = data;
      if (_currentItemId == itemId) renderTooltip(tip, data);
    })
    .catch(() => {
      // Fallback depuis data-attributes du DOM
      const srcEl = evt.target.closest("[data-item-id]");
      const name = srcEl && srcEl.dataset.itemName;
      if (name) {
        const r = RARITY[parseInt(srcEl.dataset.itemRarity) || 0] || RARITY[0];
        _cache[itemId] = {
          id: itemId, name_fr: name, level: parseInt(srcEl.dataset.itemLevel) || 0,
          rarity: parseInt(srcEl.dataset.itemRarity) || 0, gfx_id: 0, type_id: 0,
          effects: [], desc_fr: "", _slot_colors: slotColors,
        };
        if (_currentItemId == itemId) renderTooltip(tip, _cache[itemId]);
      } else {
        tip.innerHTML = '<div style="padding:12px;color:#f66">Item introuvable</div>';
      }
    });
}

function hideTooltip() {
  _currentItemId = null;
  const tip = document.getElementById("wk-tooltip");
  if (tip) tip.style.display = "none";
}

function positionTooltip(tip, evt) {
  const pad = 15;
  let x = evt.clientX + pad;
  let y = evt.clientY + pad;
  if (x + 320 > window.innerWidth) x = evt.clientX - 330;
  if (y + 400 > window.innerHeight) y = Math.max(10, window.innerHeight - 420);
  tip.style.left = x + "px";
  tip.style.top  = y + "px";
}

function renderTooltip(tip, item) {
  const r = RARITY[item.rarity] || RARITY[0];
  const typeInfo = TYPE_INFO[item.type_id] || null;
  const gfxId = item.gfx_id || item.gfxId || 0;
  const iconSrc = gfxId ? getIconSrc(gfxId) : "";

  let html = "";

  // --- Conteneur principal avec gradient rarete ---
  html += '<div class="wk-inner" style="background:linear-gradient(152deg, rgb(' + r.rgb + ' / 30%), rgb(84,84,84) 35%, rgb(84,84,84) 100%)">';

  // --- Badge rarete ---
  html += '<div class="wk-rarity-tag" style="background:' + r.hex + ';color:' + r.txtColor + '">' + r.name + '</div>';

  // --- Nom de l'item ---
  html += '<div class="wk-name">' + escHtml(item.name_fr || item.name_en || "???") + '</div>';

  // --- Zone info: image + type/level ---
  html += '<div class="wk-info-row">';
  html += '<div class="wk-info-left">';
  if (iconSrc) {
    html += '<div class="wk-img-wrap"><img src="' + iconSrc + '" alt="" onerror="this.style.display=\'none\'"></div>';
  }
  if (typeInfo) {
    html += '<div class="wk-type-line">';
    html += '<img src="' + WIKI + '/ItemType_' + typeInfo.icon + '.png" class="wk-type-icon" alt="">';
    html += '<span>[' + typeInfo.fr + ']</span>';
    html += '</div>';
  }
  html += '</div>'; // wk-info-left

  // Level
  if (item.level) {
    html += '<div class="wk-level-box">';
    html += '<div class="wk-level-label">Lvl.</div>';
    html += '<div class="wk-level-num">' + item.level + '</div>';
    html += '</div>';
  }
  html += '</div>'; // wk-info-row

  // --- EFFECTS ---
  const effects = item.effects || [];
  if (effects.length > 0) {
    html += '<div class="wk-section-title">EFFECTS</div>';
    html += '<div class="wk-section-border"><div class="wk-section-inner">';
    for (let i = 0; i < effects.length; i++) {
      const eff = effects[i];
      const actionId = eff.action_id || eff.actionId || 0;
      const val = eff.value || eff.params?.[0] || 0;
      const params = eff.params || [];
      const bgColor = (i % 2 === 0) ? "rgb(63,63,63)" : "rgb(75,75,75)";
      const act = ACTIONS[actionId];

      let rowHtml = "";
      if (act) {
        rowHtml = '<img src="' + WIKI + "/" + act.icon + '.png" class="wk-stat-icon" alt=""> ';
        if ([1050, 1052, 1068].includes(actionId) && params.length >= 3) {
          const nbElem = params[2] || 0;
          rowHtml += val + " Maitrise avec " + nbElem + (nbElem > 1 ? " elements" : " element");
        } else if ([1051, 1053, 1069].includes(actionId) && params.length >= 3) {
          const nbElem = params[2] || 0;
          rowHtml += val + " Resistance a " + nbElem + (nbElem > 1 ? " elements" : " element");
        } else if (act.label.startsWith("%")) {
          rowHtml += val + act.label;
        } else {
          rowHtml += val + " " + act.label;
        }
      } else {
        rowHtml = val + " (action " + actionId + ")";
      }
      html += '<div class="wk-row" style="background:' + bgColor + '">' + rowHtml + '</div>';
    }
    html += '</div></div>';
  }

  // --- GEMMES ---
  const slotColors = item._slot_colors || "";
  if (slotColors) {
    const gemIconMap = {"Rouge":"shardRedFull","Bleu":"shardBlueFull","Vert":"shardGreenFull","Blanc":"shardWhiteFull"};
    const gems = slotColors.split(",").map(g => g.trim()).filter(Boolean);
    if (gems.length > 0) {
      html += '<div style="margin:6px 0;display:flex;align-items:center;justify-content:center;gap:6px">';
      for (let gi = 0; gi < gems.length; gi++) {
        const icon = gemIconMap[gems[gi]] || "shardWhiteFull";
        html += '<img src="/icons/items/' + icon + '.png" width="18" height="18" style="vertical-align:middle" title="' + escHtml(gems[gi]) + '">';
      }
      html += '</div>';
    }
  }

  // --- DESCRIPTION ---
  const desc = item.desc_fr || "";
  if (desc) {
    html += '<div class="wk-desc">"' + escHtml(desc) + '"</div>';
  }

  // --- GRAPHE PRIX HDV ---
  html += '<div id="wk-price-zone" style="margin-top:8px;border-top:1px solid #555;padding-top:8px"></div>';

  html += '</div>'; // wk-inner

  tip.innerHTML = html;
  tip.style.borderColor = r.hex;

  // Charger le graphe prix (async, ne bloque pas le tooltip)
  _loadPriceChart(item.id || item.item_id || item.item_ref_id || item.itemId || 0, item._slot_colors || null);
}


function _loadPriceChart(itemId, slotColors) {
  var zone = document.getElementById("wk-price-zone");
  if (!zone || !itemId) return;
  zone.innerHTML = '<div style="color:#666;font-size:11px;text-align:center">Chargement prix...</div>';
  var url = "/api/market/history/" + itemId;
  if (slotColors) url += "?slot_colors=" + encodeURIComponent(slotColors);
  fetch(url)
    .then(function(r) { if (!r.ok) throw new Error(r.status); return r.json(); })
    .then(function(data) {
      zone = document.getElementById("wk-price-zone");
      if (!zone) return;
      var lastDate = "";
      if (data.history && data.history.length > 0) {
        lastDate = data.history[0].observed_at || "";
      }
      var h = '<div style="text-align:center;margin-bottom:6px">';
      h += '<div style="display:inline-flex;gap:10px;font-size:11px">';
      h += '<span style="color:#00ff88">Min: ' + fmtPrice(data.min_price) + '</span>';
      h += '<span style="color:#ff6b6b">Max: ' + fmtPrice(data.max_price) + '</span>';
      h += '<span style="color:#ffd93d">Moy: ' + fmtPrice(data.avg_price) + '</span>';
      h += '<span style="color:#aaa">' + (data.count || 0) + ' offres</span></div>';
      if (lastDate) {
        var ago = "";
        try {
          var then = new Date(lastDate.replace(" ", "T"));
          var now = new Date();
          var diff = Math.floor((now - then) / 1000);
          if (diff < 60) ago = "il y a " + diff + "s";
          else if (diff < 3600) ago = "il y a " + Math.floor(diff/60) + " min";
          else if (diff < 86400) ago = "il y a " + Math.floor(diff/3600) + "h" + String(Math.floor((diff%3600)/60)).padStart(2,"0");
          else ago = "il y a " + Math.floor(diff/86400) + "j";
        } catch(e) {}
        h += '<div style="color:#aaa;font-size:10px;margin-top:3px">' + lastDate + (ago ? ' <em style="color:#ffd93d">(' + ago + ')</em>' : '') + '</div>';
      }
      h += '</div>';
      h += '<canvas id="wk-price-canvas" width="260" height="80" style="border-radius:4px;background:#0f0f23;display:block;margin:0 auto"></canvas>';
      zone.innerHTML = h;
      var canvas = document.getElementById("wk-price-canvas");
      if (!canvas) return;
      var ctx = canvas.getContext("2d");
      var W = canvas.width, H = canvas.height;
      var prices = (data.history || []).map(function(x){return x.unit_price||0}).filter(function(p){return p>0}).reverse();
      if (prices.length === 0) { ctx.fillStyle="#666";ctx.font="11px sans-serif";ctx.textAlign="center";ctx.fillText("Pas de donnees prix",W/2,H/2);return; }
      if (prices.length === 1) { ctx.strokeStyle="#00d2ff";ctx.lineWidth=2;ctx.beginPath();ctx.moveTo(10,H/2);ctx.lineTo(W-10,H/2);ctx.stroke();return; }
      var p={top:6,bottom:16,left:8,right:8},cW=W-p.left-p.right,cH=H-p.top-p.bottom;
      var minP=Math.min.apply(null,prices),maxP=Math.max.apply(null,prices),rng=maxP-minP||1;
      ctx.strokeStyle="#1a1a3e";ctx.lineWidth=0.5;
      for(var g=0;g<=3;g++){var gy=p.top+(cH*g)/3;ctx.beginPath();ctx.moveTo(p.left,gy);ctx.lineTo(W-p.right,gy);ctx.stroke();}
      var gd=ctx.createLinearGradient(0,p.top,0,H-p.bottom);gd.addColorStop(0,"#00d2ff");gd.addColorStop(1,"#0051ff");
      ctx.strokeStyle=gd;ctx.lineWidth=2;ctx.lineJoin="round";ctx.beginPath();
      for(var i=0;i<prices.length;i++){var x=p.left+(cW*i)/(prices.length-1);var y=p.top+cH-((prices[i]-minP)/rng)*cH;if(i===0)ctx.moveTo(x,y);else ctx.lineTo(x,y);}
      ctx.stroke();
      var fg=ctx.createLinearGradient(0,p.top,0,H-p.bottom);fg.addColorStop(0,"rgba(0,210,255,0.15)");fg.addColorStop(1,"rgba(0,81,255,0.02)");
      ctx.fillStyle=fg;ctx.lineTo(p.left+cW,p.top+cH);ctx.lineTo(p.left,p.top+cH);ctx.closePath();ctx.fill();
      ctx.fillStyle="#888";ctx.font="9px sans-serif";ctx.textAlign="left";ctx.fillText(fmtPrice(minP),p.left,H-2);
      ctx.textAlign="right";ctx.fillText(fmtPrice(maxP),W-p.right,p.top+8);
      var lx=p.left+cW,ly=p.top+cH-((prices[prices.length-1]-minP)/rng)*cH;
      ctx.fillStyle="#00ff88";ctx.beginPath();ctx.arc(lx,ly,3,0,Math.PI*2);ctx.fill();
    })
    .catch(function(){
      var z=document.getElementById("wk-price-zone");
      if(z) z.innerHTML='<div style="color:#555;font-size:11px;text-align:center">Prix indisponible</div>';
    });
}

// --- Delegation d'evenements ---
export function initTooltipDelegation() {
  document.addEventListener("mouseover", function(e) {
    const el = e.target.closest("[data-item-id]");
    if (el) showTooltip(e, el.dataset.itemId, el.dataset.slotColors || null);
  });
  document.addEventListener("mouseout", function(e) {
    const el = e.target.closest("[data-item-id]");
    if (el) hideTooltip();
  });
  document.addEventListener("mousemove", function(e) {
    const tip = document.getElementById("wk-tooltip");
    if (tip && tip.style.display === "block") positionTooltip(tip, e);
  });
}
