/* shared/item.js — Source unique rarete, types, icones, formatage */

export const RARITY = {
  0: { name:"Commun",     hex:"#b2b2b2", rgb:"178 178 178", txtColor:"black",  cls:"common"    },
  1: { name:"Commun",     hex:"#b2b2b2", rgb:"178 178 178", txtColor:"black",  cls:"common"    },
  2: { name:"Rare",       hex:"#22b069", rgb:"45 188 117",  txtColor:"white",  cls:"rare"      },
  3: { name:"Mythique",   hex:"#a06016", rgb:"160 96 22",   txtColor:"white",  cls:"mythic"    },
  4: { name:"Legendaire", hex:"#bbc70c", rgb:"187 199 12",  txtColor:"black",  cls:"legendary" },
  5: { name:"Relique",    hex:"#794faf", rgb:"121 79 175",  txtColor:"white",  cls:"relic"     },
  6: { name:"Souvenir",   hex:"#257db0", rgb:"37 125 176",  txtColor:"white",  cls:"souvenir"  },
  7: { name:"Epique",     hex:"#b04f8a", rgb:"176 79 138",  txtColor:"white",  cls:"epic"      },
};

export const TYPE_INFO = {
  101: { fr:"Hache (Deux mains)",       icon:"Two-Handed_Weapon" },
  103: { fr:"Anneau",                   icon:"Ring" },
  108: { fr:"Baguette (Une main)",      icon:"One-Handed_Weapon" },
  110: { fr:"Epee (Une main)",          icon:"One-Handed_Weapon" },
  111: { fr:"Pelle (Deux mains)",       icon:"Two-Handed_Weapon" },
  112: { fr:"Dague (Seconde main)",     icon:"One-Handed_Weapon" },
  113: { fr:"Baton (Une main)",         icon:"One-Handed_Weapon" },
  114: { fr:"Marteau (Deux mains)",     icon:"Two-Handed_Weapon" },
  115: { fr:"Aiguille (Une main)",      icon:"One-Handed_Weapon" },
  117: { fr:"Arc (Deux mains)",         icon:"Two-Handed_Weapon" },
  119: { fr:"Bottes",                   icon:"Boots" },
  120: { fr:"Amulette",                 icon:"Amulet" },
  132: { fr:"Cape",                     icon:"Cloak" },
  133: { fr:"Ceinture",                 icon:"Belt" },
  134: { fr:"Casque",                   icon:"Helmet" },
  136: { fr:"Plastron",                 icon:"Breastplate" },
  138: { fr:"Epaulettes",               icon:"Epaulettes" },
  189: { fr:"Bouclier (Seconde main)",  icon:"One-Handed_Weapon" },
  219: { fr:"Poing",                    icon:"One-Handed_Weapon" },
  223: { fr:"Epee (Deux mains)",        icon:"Two-Handed_Weapon" },
  253: { fr:"Baton (Deux mains)",       icon:"Two-Handed_Weapon" },
  254: { fr:"Cartes (Une main)",        icon:"One-Handed_Weapon" },
  480: { fr:"Torche",                   icon:"Emblem" },
  518: { fr:"Arme 1 Main",              icon:"One-Handed_Weapon" },
  519: { fr:"Arme 2 Mains",             icon:"Two-Handed_Weapon" },
  520: { fr:"Seconde Main",             icon:"One-Handed_Weapon" },
  537: { fr:"Outil",                    icon:"Emblem" },
  582: { fr:"Familier",                 icon:"Pet" },
  611: { fr:"Monture",                  icon:"Mount" },
  646: { fr:"Embleme",                  icon:"Emblem" },
  647: { fr:"Costume",                  icon:"Emblem" },
  812: { fr:"Sublimation",              icon:"Emblem" },
};

export const ACTIONS = {
  20:  { label:"PV",                     icon:"HP" },
  21:  { label:"PV",                     icon:"HP" },
  26:  { label:"Maitrise Soin",          icon:"Healing_Mastery" },
  31:  { label:"PA",                     icon:"AP" },
  41:  { label:"PM",                     icon:"MP" },
  56:  { label:"PW",                     icon:"WP" },
  71:  { label:"Resistance Dos",         icon:"Rear_Resistance" },
  80:  { label:"Resistance Elementaire", icon:"Elemental_Resistance" },
  82:  { label:"Resistance Feu",         icon:"Fire_Resistance" },
  83:  { label:"Resistance Eau",         icon:"Water_Resistance" },
  84:  { label:"Resistance Terre",       icon:"Earth_Resistance" },
  85:  { label:"Resistance Air",         icon:"Air_Resistance" },
  90:  { label:"Resistance Critique",    icon:"Critical_Resistance" },
  100: { label:"Resistance Elementaire", icon:"Elemental_Resistance" },
  120: { label:"Maitrise Elementaire",   icon:"Elemental_Mastery" },
  122: { label:"Maitrise Feu",           icon:"Fire_Mastery" },
  123: { label:"Maitrise Eau",           icon:"Water_Mastery" },
  124: { label:"Maitrise Terre",         icon:"Earth_Mastery" },
  125: { label:"Maitrise Air",           icon:"Air_Mastery" },
  130: { label:"Maitrise Elementaire",   icon:"Elemental_Mastery" },
  132: { label:"Maitrise Feu",           icon:"Fire_Mastery" },
  149: { label:"Maitrise Critique",      icon:"Critical_Mastery" },
  150: { label:"% Coup Critique",        icon:"Critical_Hit" },
  160: { label:"Portee",                 icon:"Range" },
  161: { label:"Esquive",                icon:"Dodge" },
  162: { label:"Tacle",                  icon:"Lock" },
  166: { label:"Initiative",             icon:"Initiative" },
  168: { label:"Sagesse",                icon:"Wisdom" },
  171: { label:"Prospection",            icon:"Prospecting" },
  172: { label:"Maitrise Dos",           icon:"Rear_Mastery" },
  173: { label:"Maitrise Berserk",       icon:"Berserk_Mastery" },
  174: { label:"Maitrise Melee",         icon:"Melee_Mastery" },
  175: { label:"Maitrise Distance",      icon:"Distance_Mastery" },
  176: { label:"Controle",               icon:"Control" },
  177: { label:"% Bloc",                 icon:"Block" },
  180: { label:"Volonte",                icon:"Force_of_Will" },
  181: { label:"% Degats infliges",      icon:"Damage_Inflicted" },
  184: { label:"% Armure donnee",        icon:"Armor_given" },
  191: { label:"% Armure recue",         icon:"Armor_received" },
  875: { label:"% Parade",               icon:"Block" },
  979: { label:"Maitrise Melee",         icon:"Melee_Mastery" },
  988: { label:"Resistance Elementaire", icon:"Elemental_Resistance" },
  1020:{ label:"Maitrise Elementaire",   icon:"Elemental_Mastery" },
  1050:{ label:"Maitrise",               icon:"Elemental_Mastery" },
  1051:{ label:"Resistance",             icon:"Elemental_Resistance" },
  1052:{ label:"Maitrise",               icon:"Elemental_Mastery" },
  1053:{ label:"Resistance",             icon:"Elemental_Resistance" },
  1068:{ label:"Maitrise",               icon:"Elemental_Mastery" },
  1069:{ label:"Resistance",             icon:"Elemental_Resistance" },
};

export const ELEMENT_ICONS = {
  122: "Fire", 123: "Water", 124: "Earth", 125: "Air",
  132: "Fire",
  82: "Fire", 83: "Water", 84: "Earth", 85: "Air",
};

export const GEM_COLORS = {
  Red: "#e74c3c", Blue: "#3498db", Green: "#2ecc71", White: "#ecf0f1"
};

export const WIKI = "https://wakfu.wiki.gg/images";

/* --- Helpers --- */

export function getRarity(id) {
  return RARITY[id] || RARITY[0];
}

export function fmtPrice(n) {
  if (!n && n !== 0) return "0";
  if (n >= 1000000) return (n / 1000000).toFixed(1) + "M";
  if (n >= 1000) return (n / 1000).toFixed(1) + "K";
  return n.toLocaleString("fr-FR");
}

export function escHtml(s) {
  const d = document.createElement("div");
  d.textContent = s || "";
  return d.innerHTML;
}

/* Icon: atlas base64 (preloaded) > local server > CDN fallback */
let _atlas = null;

export async function loadIconsAtlas() {
  if (_atlas) return _atlas;
  try {
    const r = await fetch("/api/icons-atlas");
    if (r.ok) _atlas = await r.json();
  } catch(e) { /* silent */ }
  return _atlas;
}

export function getIconSrc(gfxId) {
  if (_atlas && _atlas[gfxId]) return "data:image/webp;base64," + _atlas[gfxId];
  return "/icons/items/" + gfxId + ".png";
}

export function getCdnIconSrc(gfxId) {
  return "https://static.ankama.com/wakfu/portal/game/item/115/" + gfxId + ".png";
}
