/* ============================================================
   Wakfu Assistant — Tooltip système v3
   Basé sur Module:Infobox item dark (wakfu.wiki.gg)
   Source: https://wakfu.wiki.gg/wiki/Module:Infobox_item_dark
   ============================================================ */

const WIKI = "https://wakfu.wiki.gg/images";

// --- Couleurs rareté (identiques au module Lua rarity_table_hex) ---
const RARITY = {
  0: { name:"Commun",    hex:"#b2b2b2", rgb:"178 178 178", txtColor:"black" },
  1: { name:"Commun",    hex:"#b2b2b2", rgb:"178 178 178", txtColor:"black" },
  2: { name:"Rare",      hex:"#22b069", rgb:"45 188 117",   txtColor:"white" },
  3: { name:"Mythique",  hex:"#a06016", rgb:"160 96 22",    txtColor:"white" },
  4: { name:"Légendaire",hex:"#bbc70c", rgb:"187 199 12",   txtColor:"black" },
  5: { name:"Relique",   hex:"#794faf", rgb:"121 79 175",   txtColor:"white" },
  6: { name:"Souvenir",  hex:"#257db0", rgb:"37 125 176",   txtColor:"white" },
  7: { name:"Épique",    hex:"#b04f8a", rgb:"176 79 138",   txtColor:"white" },
};

// --- Noms de type (francais) avec fichier icone wiki ---
// Le wiki utilise File:ItemType_XXX.png
const TYPE_INFO = {
  101: { fr:"Hache (Deux mains)",       icon:"Two-Handed_Weapon" },
  103: { fr:"Anneau",                    icon:"Ring" },
  108: { fr:"Baguette (Une main)",       icon:"One-Handed_Weapon" },
  110: { fr:"\u00c9p\u00e9e (Une main)",          icon:"One-Handed_Weapon" },
  111: { fr:"Pelle (Deux mains)",        icon:"Two-Handed_Weapon" },
  112: { fr:"Dague (Seconde main)",      icon:"One-Handed_Weapon" },
  113: { fr:"B\u00e2ton (Une main)",          icon:"One-Handed_Weapon" },
  114: { fr:"Marteau (Deux mains)",      icon:"Two-Handed_Weapon" },
  115: { fr:"Aiguille (Une main)",       icon:"One-Handed_Weapon" },
  117: { fr:"Arc (Deux mains)",          icon:"Two-Handed_Weapon" },
  119: { fr:"Bottes",                    icon:"Boots" },
  120: { fr:"Amulette",                  icon:"Amulet" },
  132: { fr:"Cape",                      icon:"Cloak" },
  133: { fr:"Ceinture",                  icon:"Belt" },
  134: { fr:"Casque",                    icon:"Helmet" },
  136: { fr:"Plastron",                  icon:"Breastplate" },
  138: { fr:"\u00c9paulettes",                icon:"Epaulettes" },
  189: { fr:"Bouclier (Seconde main)",   icon:"One-Handed_Weapon" },
  219: { fr:"Poing",                     icon:"One-Handed_Weapon" },
  223: { fr:"\u00c9p\u00e9e (Deux mains)",        icon:"Two-Handed_Weapon" },
  253: { fr:"B\u00e2ton (Deux mains)",        icon:"Two-Handed_Weapon" },
  254: { fr:"Cartes (Une main)",         icon:"One-Handed_Weapon" },
  480: { fr:"Torche",                    icon:"Emblem" },
  518: { fr:"Arme 1 Main",              icon:"One-Handed_Weapon" },
  519: { fr:"Arme 2 Mains",             icon:"Two-Handed_Weapon" },
  520: { fr:"Seconde Main",             icon:"One-Handed_Weapon" },
  537: { fr:"Outil",                     icon:"Emblem" },
  582: { fr:"Familier",                  icon:"Pet" },
  611: { fr:"Monture",                   icon:"Mount" },
  646: { fr:"Embl\u00e8me",                   icon:"Emblem" },
  647: { fr:"Costume",                   icon:"Emblem" },
  812: { fr:"Sublimation",              icon:"Emblem" },
};


// --- Slot "seconde main" ---
// type_id 112 (Dague) et 119 (Bouclier) sont des items "Seconde Main"
// Seconde main est deja dans le nom fr du TYPE_INFO officiel

// --- Mapping action_id -> { label, icon (wiki filename sans extension) } ---
// Source: wakfu.wiki.gg/wiki/Template:Characteristic
const ACTIONS = {
  20:  { label:"PV",                    icon:"HP" },
  21:  { label:"PV",                    icon:"HP" },  // variante
  26:  { label:"Maîtrise Soin",         icon:"Healing_Mastery" },
  31:  { label:"PA",                    icon:"AP" },
  41:  { label:"PM",                    icon:"MP" },
  56:  { label:"PW",                    icon:"WP" },
  71:  { label:"Résistance Dos",        icon:"Rear_Resistance" },
  80:  { label:"Résistance Élémentaire",icon:"Elemental_Resistance" },
  82:  { label:"Résistance Feu",        icon:"Fire_Resistance" },
  83:  { label:"Résistance Eau",        icon:"Water_Resistance" },
  84:  { label:"Résistance Terre",      icon:"Earth_Resistance" },
  85:  { label:"Résistance Air",        icon:"Air_Resistance" },
  90:  { label:"Résistance Critique",   icon:"Critical_Resistance" },
  100: { label:"Résistance Élémentaire",icon:"Elemental_Resistance" },
  120: { label:"Maîtrise Élémentaire",  icon:"Elemental_Mastery" },
  122: { label:"Maîtrise Feu",          icon:"Fire_Mastery" },
  123: { label:"Maîtrise Eau",          icon:"Water_Mastery" },
  124: { label:"Maîtrise Terre",        icon:"Earth_Mastery" },
  125: { label:"Maîtrise Air",          icon:"Air_Mastery" },
  130: { label:"Maîtrise Élémentaire",  icon:"Elemental_Mastery" },
  132: { label:"Maîtrise Feu",          icon:"Fire_Mastery" },
  149: { label:"Maîtrise Critique",     icon:"Critical_Mastery" },
  150: { label:"% Coup Critique",       icon:"Critical_Hit" },
  160: { label:"Portée",                icon:"Range" },
  161: { label:"Esquive",               icon:"Dodge" },
  162: { label:"Tacle",                 icon:"Lock" },
  166: { label:"Initiative",            icon:"Initiative" },
  168: { label:"Sagesse",               icon:"Wisdom" },
  171: { label:"Prospection",           icon:"Prospecting" },
  172: { label:"Maîtrise Dos",          icon:"Rear_Mastery" },
  173: { label:"Maîtrise Berserk",      icon:"Berserk_Mastery" },
  174: { label:"Maîtrise Mêlée",        icon:"Melee_Mastery" },
  175: { label:"Maîtrise Distance",     icon:"Distance_Mastery" },
  176: { label:"Contrôle",              icon:"Control" },
  177: { label:"% Bloc",                icon:"Block" },
  180: { label:"Volonté",               icon:"Force_of_Will" },
  181: { label:"% Dégâts infligés",     icon:"Damage_Inflicted" },
  184: { label:"% Armure donnée",       icon:"Armor_given" },
  191: { label:"% Armure reçue",        icon:"Armor_received" },
  875: { label:"% Parade",              icon:"Block" },
  979: { label:"Maîtrise Mêlée",        icon:"Melee_Mastery" },
  988: { label:"Résistance Élémentaire",icon:"Elemental_Resistance" },
  1020:{ label:"Maîtrise Élémentaire",  icon:"Elemental_Mastery" },
  1050:{ label:"Maîtrise",              icon:"Elemental_Mastery" },
  1051:{ label:"Résistance",            icon:"Elemental_Resistance" },
  1052:{ label:"Maîtrise",              icon:"Elemental_Mastery" },
  1053:{ label:"Résistance",            icon:"Elemental_Resistance" },
  1068:{ label:"Maîtrise",              icon:"Elemental_Mastery" },
  1069:{ label:"Résistance",            icon:"Elemental_Resistance" },
};

// Elements par action_id (pour "X Maitrise avec N éléments")
const ELEMENT_ICONS = {
  122: "Fire", 123: "Water", 124: "Earth", 125: "Air",
  132: "Fire",
  82: "Fire", 83: "Water", 84: "Earth", 85: "Air",
};

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

function escHtml(s) {
  return s.replace(/&/g,"&amp;").replace(/</g,"&lt;").replace(/>/g,"&gt;").replace(/"/g,"&quot;");
}

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
