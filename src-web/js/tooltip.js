/* ============================================================
   Wakfu Assistant — Tooltip système v3
   Basé sur Module:Infobox item dark (wakfu.wiki.gg)
   Source: https://wakfu.wiki.gg/wiki/Module:Infobox_item_dark
   ============================================================ */

import { RARITY, TYPE_INFO, ACTIONS, ELEMENT_ICONS, WIKI, getRarity, escHtml, getIconSrc } from "./shared/item.js";


// --- Cache tooltip ---
const _cache = {};

// --- Fonctions publiques ---

function showTooltip(evt, itemId) {
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
    renderTooltip(tip, _cache[itemId]);
    return;
  }

  tip.innerHTML = '<div style="padding:20px;color:#aaa;text-align:center">Chargement...</div>';

  fetch("/api/cdn/" + itemId)
    .then(r => { if (!r.ok) throw new Error(r.status); return r.json(); })
    .then(data => {
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

  // --- DESCRIPTION ---
  const desc = item.desc_fr || "";
  if (desc) {
    html += '<div class="wk-desc">"' + escHtml(desc) + '"</div>';
  }

  html += '</div>'; // wk-inner

  tip.innerHTML = html;
  // Appliquer la bordure rareté
  tip.style.borderColor = r.hex;
}

// escHtml -> shared/item.js

// --- Délégation d'événements ---
export function initTooltipDelegation() {
  document.addEventListener("mouseover", function(e) {
    const el = e.target.closest("[data-item-id]");
    if (el) showTooltip(e, el.dataset.itemId);
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
