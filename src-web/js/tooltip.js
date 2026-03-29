// ============================================================
// tooltip.js - Tooltip Wakfu fidele au Module:Infobox item dark
// Source: https://wakfu.wiki.gg/wiki/Module:Infobox_item_dark
// ============================================================

import { fetchJson } from "./api.js";
import { esc } from "./utils.js";

const _cache = {};

const RARITY = {
  0: { name: "Commun",     hex: "#b2b2b2", rgb: "178,178,178", textColor: "black" },
  1: { name: "Inhabituel", hex: "#ffffff", rgb: "255,255,255", textColor: "black" },
  2: { name: "Rare",       hex: "#22b069", rgb: "45,188,117",  textColor: "white" },
  3: { name: "Mythique",   hex: "#a06016", rgb: "160,96,22",   textColor: "white" },
  4: { name: "Legendaire", hex: "#bbc70c", rgb: "187,199,12",  textColor: "black" },
  5: { name: "Relique",    hex: "#794faf", rgb: "121,79,175",  textColor: "white" },
  6: { name: "Souvenir",   hex: "#257db0", rgb: "37,125,176",  textColor: "white" },
  7: { name: "Epique",     hex: "#b04f8a", rgb: "176,79,138",  textColor: "white" },
};

const TYPE_NAMES = {
  101:"Hache",103:"Anneau",108:"Baguette",110:"Epee",111:"Pelle",
  112:"Dague",113:"Baton",114:"Marteau",115:"Aiguille",117:"Arc",
  119:"Bouclier",120:"Amulette",132:"Bottes",133:"Ceinture",134:"Casque",
  136:"Plastron",138:"Cape",189:"Epaulettes",218:"Arme 2 Mains",
  223:"Torche",253:"Poing",254:"Cartes",480:"Embleme",
  520:"Familier",537:"Monture",582:"Familier",611:"Monture",812:"Sublimation"
};

// Mapping actionId -> { label, icon (wiki filename sans .png), sign }
const ACTIONS = {
  20:  { label:"PV", icon:"HP", sign:"+" },
  21:  { label:"PV", icon:"HP", sign:"-" },
  26:  { label:"Maitrise Soin", icon:"Healing_Mastery", sign:"+" },
  31:  { label:"PA", icon:"AP", sign:"+" },
  41:  { label:"PM", icon:"MP", sign:"+" },
  56:  { label:"PA", icon:"AP", sign:"-" },
  57:  { label:"PM", icon:"MP", sign:"-" },
  71:  { label:"Resistance Dos", icon:"Rear_Resistance", sign:"+" },
  80:  { label:"Resistance Elementaire", icon:"Elemental_Resistance", sign:"+" },
  82:  { label:"Resistance Feu", icon:"Element_Fire", sign:"+" },
  83:  { label:"Resistance Eau", icon:"Element_Water", sign:"+" },
  84:  { label:"Resistance Terre", icon:"Element_Earth", sign:"+" },
  85:  { label:"Resistance Air", icon:"Element_Air", sign:"+" },
  90:  { label:"Resistance Elementaire", icon:"Elemental_Resistance", sign:"-" },
  120: { label:"Maitrise Elementaire", icon:"Elemental_Mastery", sign:"+" },
  122: { label:"Maitrise Feu", icon:"Element_Fire", sign:"+" },
  123: { label:"Maitrise Terre", icon:"Element_Earth", sign:"+" },
  124: { label:"Maitrise Eau", icon:"Element_Water", sign:"+" },
  125: { label:"Maitrise Air", icon:"Element_Air", sign:"+" },
  130: { label:"Maitrise Elementaire", icon:"Elemental_Mastery", sign:"-" },
  149: { label:"Maitrise Critique", icon:"Critical_Mastery", sign:"+" },
  150: { label:"Coup Critique", icon:"Critical_Hit", sign:"+" },
  160: { label:"Portee", icon:"Range", sign:"+" },
  162: { label:"Prospection", icon:"Prospecting", sign:"+" },
  166: { label:"Sagesse", icon:"Wisdom", sign:"+" },
  168: { label:"Coup Critique", icon:"Critical_Hit", sign:"-" },
  171: { label:"Initiative", icon:"Initiative", sign:"+" },
  173: { label:"Tacle", icon:"Lock", sign:"+" },
  174: { label:"Tacle", icon:"Lock", sign:"-" },
  175: { label:"Esquive", icon:"Dodge", sign:"+" },
  176: { label:"Esquive", icon:"Dodge", sign:"-" },
  177: { label:"Volonte", icon:"Force_of_Will", sign:"+" },
  180: { label:"Maitrise Dos", icon:"Rear_Mastery", sign:"+" },
  181: { label:"Maitrise Dos", icon:"Rear_Mastery", sign:"-" },
  191: { label:"PW", icon:"WP", sign:"+" },
  875: { label:"Parade", icon:"Block", sign:"+" },
  988: { label:"Resistance Critique", icon:"Critical_Resistance", sign:"+" },
  1052:{ label:"Maitrise Melee", icon:"Melee_Mastery", sign:"+" },
  1053:{ label:"Maitrise Distance", icon:"Distance_Mastery", sign:"+" },
  1055:{ label:"Maitrise Berserk", icon:"Berserk_Mastery", sign:"+" },
  1056:{ label:"Maitrise Critique", icon:"Critical_Mastery", sign:"-" },
  1059:{ label:"Maitrise Melee", icon:"Melee_Mastery", sign:"-" },
  1060:{ label:"Maitrise Distance", icon:"Distance_Mastery", sign:"-" },
  1061:{ label:"Maitrise Berserk", icon:"Berserk_Mastery", sign:"-" },
  1062:{ label:"Resistance Critique", icon:"Critical_Resistance", sign:"-" },
  1063:{ label:"Resistance Dos", icon:"Rear_Resistance", sign:"-" },
  1068:{ label:"Maitrise", icon:"Elemental_Mastery", sign:"+", variable:true },
  1069:{ label:"Resistance", icon:"Elemental_Resistance", sign:"+", variable:true },
};

const WIKI_ICONS = "https://wakfu.wiki.gg/images";

let _tooltipEl = null;
let _hideTimer = null;

function getTooltipEl() {
  if (!_tooltipEl) {
    _tooltipEl = document.createElement("div");
    _tooltipEl.className = "wk-tooltip";
    document.body.appendChild(_tooltipEl);
  }
  return _tooltipEl;
}

function positionTooltip(el) {
  var tip = getTooltipEl();
  var rect = el.getBoundingClientRect();
  var tipW = tip.offsetWidth || 310;
  var tipH = tip.offsetHeight || 200;
  var left = rect.right + 12;
  var topPos = rect.top;
  if (left + tipW > window.innerWidth - 10) left = rect.left - tipW - 12;
  if (topPos + tipH > window.innerHeight - 10) topPos = window.innerHeight - tipH - 10;
  if (topPos < 10) topPos = 10;
  tip.style.left = left + "px";
  tip.style.top = topPos + "px";
}

function evenOddColor(i) {
  return (i % 2 === 0) ? "rgb(63,63,63)" : "rgb(75,75,75)";
}

function renderTooltip(item) {
  var r = RARITY[item.rarity] || RARITY[0];
  var typeId = item.type_id || item.typeId || item.itemTypeId || 0;
  var typeName = TYPE_NAMES[typeId] || "";
  var isPet = (typeId === 582 || typeId === 611);
  var level = item.level || 0;
  var name = item.name_fr || item.name || "?";
  var gfxId = item.gfx_id || item.gfxId || 0;

  var html = "";

  // Conteneur principal avec gradient de rarete
  html += "<div class=\"wk-inner\" style=\"background:linear-gradient(152deg,rgba(" + r.rgb + ",0.3) 0%,rgb(84,84,84) 35%,rgb(84,84,84) 100%);\">";

  // Badge rarete
  html += "<div class=\"wk-rarity-tag\" style=\"background:" + r.hex + ";color:" + r.textColor + "\">" + esc(r.name) + "</div>";

  // Nom
  html += "<div class=\"wk-name\">" + esc(name) + "</div>";

  // Info container: image + type + level
  html += "<div class=\"wk-info\">";
  html += "<div class=\"wk-info-left\">";

  // Image item
  html += "<div class=\"wk-img-wrap\"><div class=\"wk-img-inner\">";
  if (gfxId) {
    html += "<img src=\"/icons/items/" + gfxId + ".png\" onerror=\"this.style.display=\'none\'\" alt=\"\">";
  }
  html += "</div></div>";

  // Type
  if (typeName) {
    html += "<div class=\"wk-sub\"><div class=\"wk-type\">[" + esc(typeName) + "]</div></div>";
  }

  html += "</div>"; // wk-info-left

  // Level
  if (!isPet && level > 0) {
    html += "<div class=\"wk-level\"><div>Niv.</div><div>" + level + "</div></div>";
  }

  html += "</div>"; // wk-info

  // === EFFECTS ===
  var effects = item.effects || [];
  if (effects.length > 0) {
    html += "<div class=\"wk-header\">EFFETS</div>";
    html += "<div class=\"wk-section\"><div class=\"wk-section-inner\">";

    var rowIdx = 1;
    for (var i = 0; i < effects.length; i++) {
      var eff = effects[i];
      var actionId = eff.actionId;
      var params = eff.params || [];
      var val = params[0] || 0;
      if (val === 0 && !params.length) continue;

      var info = ACTIONS[actionId];
      if (!info) continue;

      var displayVal = Math.abs(Math.round(val));
      var label = info.label;
      var prefix = info.sign === "-" ? "-" : "+";
      var iconUrl = WIKI_ICONS + "/" + info.icon + ".png";

      // Maitrise/Resistance variable (N elements)
      if (info.variable && params.length > 2) {
        var nb = Math.round(params[2]) || 1;
        label = displayVal + " " + label + " dans " + nb + " element" + (nb > 1 ? "s" : "");
      } else {
        label = prefix + displayVal + " " + label;
      }

      // Coup critique -> afficher en %
      if (actionId === 150 || actionId === 168) {
        label = prefix + displayVal + "% " + info.label;
      }

      html += "<div class=\"wk-row\" style=\"background:" + evenOddColor(rowIdx) + "\">";
      html += "<img src=\"" + iconUrl + "\" onerror=\"this.style.display=\'none\'\" alt=\"\">";
      html += " " + label;
      html += "</div>";
      rowIdx++;
    }

    html += "</div></div>"; // wk-section-inner + wk-section
  }

  // === DESCRIPTION ===
  var desc = item.desc_fr || item.description || "";
  if (desc) {
    desc = desc.replace(/\[el\d+\]/g, "").replace(/\[#\w+\]/g, "").replace(/\[-\]/g, "").trim();
    if (desc) {
      html += "<div class=\"wk-desc\">\"" + esc(desc) + "\"</div>";
    }
  }

  html += "</div>"; // wk-inner
  return html;
}

async function fetchItem(itemId) {
  if (_cache[itemId]) return _cache[itemId];
  try {
    var data = await fetchJson("/api/cdn/" + itemId);
    if (!data.error) { _cache[itemId] = data; return data; }
  } catch(e) {
    console.warn("[tooltip] fetch error", itemId, e);
  }
  return null;
}

export function showTooltip(el, itemId) {
  if (_hideTimer) { clearTimeout(_hideTimer); _hideTimer = null; }
  var tip = getTooltipEl();
  tip.innerHTML = "<div class=\"wk-inner\"><div class=\"wk-loading\">Chargement...</div></div>";
  tip.style.display = "block";
  positionTooltip(el);
  fetchItem(itemId).then(function(item) {
    if (!item) { tip.innerHTML = "<div class=\"wk-inner\"><div class=\"wk-loading\">Item introuvable</div></div>"; return; }
    tip.innerHTML = renderTooltip(item);
    positionTooltip(el);
  });
}

export function hideTooltip() {
  _hideTimer = setTimeout(function() {
    var tip = getTooltipEl();
    if (tip) tip.style.display = "none";
  }, 200);
}

export function keepTooltip() {
  if (_hideTimer) { clearTimeout(_hideTimer); _hideTimer = null; }
}

export function initTooltipDelegation() {
  if (window.__tooltipBound) return;
  window.__tooltipBound = true;
  document.addEventListener("mouseover", function(e) {
    var t = e.target.closest("[data-item-id]");
    if (t) { showTooltip(t, parseInt(t.getAttribute("data-item-id"))); return; }
    if (e.target.closest(".wk-tooltip")) keepTooltip();
  });
  document.addEventListener("mouseout", function(e) {
    var t = e.target.closest("[data-item-id]");
    if (t) { hideTooltip(); return; }
    if (e.target.closest(".wk-tooltip")) hideTooltip();
  });
}
