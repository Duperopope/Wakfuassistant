/* ============================================================
   Wakfu Assistant — Tooltip système v3
   Basé sur Module:Infobox item dark (wakfu.wiki.gg)
   Source: https://wakfu.wiki.gg/wiki/Module:Infobox_item_dark
   ============================================================ */

import { RARITY, TYPE_INFO, ACTIONS, ELEMENT_ICONS, WIKI, getRarity, escHtml, getIconSrc, fmtPrice } from "./shared/item.js";


// --- Cache tooltip ---
const _cache = {};

// --- Fonctions publiques ---

function showTooltip(evt, itemId, slotColors) {
  if (!itemId) return;
  let tip = document.getElementById("wk-tooltip");
  if (!tip) {
    tip = document.createElement("div");
    tip.id = "wk-tooltip";
    tip.className = "wk-tooltip";
    document.body.appendChild(tip);
  }
  tip.style.display = "block";
  positionTooltip(tip, evt);

  if (_cache[itemId]) {
    if (slotColors) _cache[itemId]._slot_colors = slotColors;
    renderTooltip(tip, _cache[itemId]);
    return;
  }

  tip.innerHTML = '<div style="padding:20px;color:#aaa;text-align:center">Chargement...</div>';

  fetch("/api/cdn/" + itemId)
    .then(r => { if (!r.ok) throw new Error(r.status); return r.json(); })
    .then(data => {
      data._slot_colors = slotColors || null;
      _cache[itemId] = data;
      renderTooltip(tip, data);
    })
    .catch(() => {
      tip.innerHTML = '<div style="padding:12px;color:#f66">Item introuvable</div>';
    });
}

function hideTooltip() {
  const tip = document.getElementById("wk-tooltip");
  if (tip) tip.style.display = "none";
}

function positionTooltip(tip, evt) {
  const pad = 15;
  let x = evt.clientX + pad;
  let y = evt.clientY + pad;
  // Ajuster si déborde à droite
  if (x + 320 > window.innerWidth) x = evt.clientX - 330;
  // Ajuster si déborde en bas
  if (y + 400 > window.innerHeight) y = Math.max(10, window.innerHeight - 420);
  tip.style.left = x + "px";
  tip.style.top  = y + "px";
}

function renderTooltip(tip, item) {
  const r = RARITY[item.rarity] || RARITY[0];
  const typeInfo = TYPE_INFO[item.type_id] || { fr:"Objet", icon:"One-Handed_Weapon" };
  // type deja complet via Ankama officiel
  const gfxId = item.gfx_id || 0;

  // Construire le HTML exactement comme le module wiki
  let html = "";

  // --- Conteneur principal avec gradient rareté ---
  html += '<div class="wk-inner" style="background:linear-gradient(152deg, rgb(' + r.rgb + ' / 30%), rgb(84,84,84) 35%, rgb(84,84,84) 100%)">';

  // --- Badge rareté ---
  html += '<div class="wk-rarity-tag" style="background:' + r.hex + ';color:' + r.txtColor + '">' + r.name + '</div>';

  // --- Nom de l'item ---
  html += '<div class="wk-name">' + escHtml(item.name_fr || item.name_en || "???") + '</div>';

  // --- Zone info: image + type/level ---
  html += '<div class="wk-info-row">';
  // Image item
  html += '<div class="wk-info-left">';
  html += '<div class="wk-img-wrap"><img src="/icons/items/' + gfxId + '.png" alt="" onerror="this.style.display=\'none\'"></div>';
  // Type avec icône wiki
  html += '<div class="wk-type-line">';
  html += '<img src="' + WIKI + '/ItemType_' + typeInfo.icon + '.png" class="wk-type-icon" alt="">';
  html += '<span>[' + typeInfo.fr;
  // deja dans typeInfo.fr
  html += ']</span>';
  html += '</div>'; // wk-type-line
  html += '</div>'; // wk-info-left

  // Level
  html += '<div class="wk-level-box">';
  html += '<div class="wk-level-label">Lvl.</div>';
  html += '<div class="wk-level-num">' + (item.level || "?") + '</div>';
  html += '</div>';
  html += '</div>'; // wk-info-row

  // --- EFFECTS ---
  const effects = item.effects || [];
  if (effects.length > 0) {
    html += '<div class="wk-section-title">EFFECTS</div>';
    html += '<div class="wk-section-border">';
    html += '<div class="wk-section-inner">';
    for (let i = 0; i < effects.length; i++) {
      const eff = effects[i];
      const actionId = eff.action_id || eff.actionId || 0;
      const val = eff.value || eff.params?.[0] || 0;
      const params = eff.params || [];
      const bgColor = (i % 2 === 0) ? "rgb(63,63,63)" : "rgb(75,75,75)";
      const act = ACTIONS[actionId];

      let rowHtml = "";
      if (act) {
        const iconUrl = WIKI + "/" + act.icon + ".png";
        rowHtml = '<img src="' + iconUrl + '" class="wk-stat-icon" alt=""> ';

        // Gestion des maîtrises élémentaires multi-éléments (action 1050, 1052, 1068)
        if ([1050, 1052, 1068].includes(actionId) && params.length >= 3) {
          const nbElem = params[2] || 0;
          rowHtml += val + " Maîtrise avec " + nbElem + (nbElem > 1 ? " éléments" : " élément");
        }
        // Résistances multi-éléments (1051, 1053, 1069)
        else if ([1051, 1053, 1069].includes(actionId) && params.length >= 3) {
          const nbElem = params[2] || 0;
          rowHtml += val + " Résistance à " + nbElem + (nbElem > 1 ? " éléments" : " élément");
        }
        // % stats
        else if (act.label.startsWith("%")) {
          rowHtml += val + act.label;
        }
        // Normal
        else {
          rowHtml += val + " " + act.label;
        }
      } else {
        // Action inconnue : afficher brut
        rowHtml = val + " (action " + actionId + ")";
      }

      html += '<div class="wk-row" style="background:' + bgColor + '">' + rowHtml + '</div>';
    }
    html += '</div></div>'; // inner + border
  }

  // --- GEMMES (si slot_colors fourni) ---
  const slotColors = item._slot_colors || "";
  if (slotColors) {
    const gemColorMap = {"Rouge":"#e74c3c","Bleu":"#3498db","Vert":"#2ecc71","Blanc":"#ecf0f1"};
    const gems = slotColors.split(",").map(function(g){ return g.trim(); }).filter(Boolean);
    if (gems.length > 0) {
      html += '<div style="margin:6px 0;display:flex;align-items:center;gap:6px">';
      html += '<span style="color:#888;font-size:10px;letter-spacing:1px">GEMMES</span> ';
      for (var gi = 0; gi < gems.length; gi++) {
        var gc = gemColorMap[gems[gi]] || "#888";
        html += '<span style="display:inline-block;width:14px;height:14px;border-radius:50%;background:' + gc + ';border:1px solid rgba(255,255,255,0.3)" title="' + escHtml(gems[gi]) + '"></span>';
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

  // Charger le graphe prix
  _loadPriceChart(item.id || item.item_id || 0, item._slot_colors || null);
}

// escHtml -> shared/item.js


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

// --- Délégation d'événements ---
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
