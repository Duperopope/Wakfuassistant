// ============================================================
// character.js - Onglet Personnage > Fiche (Paper Doll)
// Affiche la fiche complete d un joueur avec paper doll
// Source layout: Wakfu in-game inventory (14 slots)
// Source data: /api/players/{name} via api_v2.py
// ============================================================

import { fetchJson } from "../api.js";
import { esc } from "../utils.js";
import { initTooltipDelegation } from "../tooltip.js";

// --- Layout Paper Doll ---
const PAPER_DOLL_SLOTS = [
  { slot: 0,  label: "Casque",         area: "left",   icon: "casque" },
  { slot: 3,  label: "\u00c9paulettes",     area: "left",   icon: "epaulettes" },
  { slot: 4,  label: "Amulette",       area: "left",   icon: "amulette" },
  { slot: 5,  label: "Plastron",       area: "left",   icon: "plastron" },
  { slot: 13, label: "Cape",           area: "left",   icon: "cape" },
  { slot: 10, label: "Ceinture",       area: "left",   icon: "ceinture" },
  { slot: 12, label: "Bottes",         area: "left",   icon: "bottes" },
  { slot: 7,  label: "Anneau G",       area: "right",  icon: "anneau" },
  { slot: 8,  label: "Anneau D",       area: "right",  icon: "anneau" },
  { slot: 15, label: "Arme",           area: "right",  icon: "arme" },
  { slot: 18, label: "Seconde main",   area: "right",  icon: "secondemain" },
  { slot: 17, label: "Accessoire",     area: "right",  icon: "accessoire" },
  { slot: 22, label: "Familier",       area: "right",  icon: "familier" },
  { slot: 24, label: "Monture",        area: "right",  icon: "monture" },
];

const RARITY_CLS = {0:"rarity-0",1:"rarity-1",2:"rarity-2",3:"rarity-3",4:"rarity-4",5:"rarity-5",6:"rarity-6",7:"rarity-7"};
const RARITY_NAMES = {0:"Commun",1:"Inhabituel",2:"Rare",3:"Mythique",4:"L\u00e9gendaire",5:"Relique",6:"Souvenir",7:"\u00c9pique"};

function rnd(v) { return typeof v === "number" ? Math.round(v) : v; }

function getBreedColor(bid) {
  var c = {1:"#e8d44d",2:"#3dc44f",3:"#d4a853",4:"#555577",5:"#44aadd",6:"#88bb44",
    7:"#ff88aa",8:"#dd4444",9:"#77cc55",10:"#77aa44",11:"#cc3333",12:"#ddaa55",
    13:"#cc7744",14:"#bb66bb",15:"#6688bb",16:"#5599dd",17:"#8877cc",18:"#aa6644"};
  return c[bid] || "#888";
}

let _searchBound = false;

// --- Point d entree ---
export async function loadCharacter() {
  var container = document.getElementById("charContainer");
  if (!container) return;

  container.innerHTML = '<div class="char-search-bar">' +
    '<input type="text" id="charSearchInput" placeholder="Rechercher un joueur..." autocomplete="off">' +
    '<button id="charSearchBtn">Rechercher</button>' +
    '<div id="charSearchResults" class="char-search-results"></div>' +
    '</div>' +
    '<div id="charContent">' +
    '<div class="char-empty"><div class="char-empty-icon">\u{1F9D9}</div>' +
    '<p>Recherchez un joueur pour afficher sa fiche</p>' +
    '<p style="font-size:12px;color:var(--text-muted)">Ou cliquez sur un joueur dans le classement</p></div></div>';

  if (!_searchBound) {
    _searchBound = true;

    document.addEventListener("input", async function(e) {
      if (e.target.id !== "charSearchInput") return;
      var q = e.target.value.trim();
      if (q.length < 2) { hideResults(); return; }
      try {
        var data = await fetchJson("/api/search?q=" + encodeURIComponent(q));
        showResults(data.players || []);
      } catch(err) { hideResults(); }
    });

    document.addEventListener("click", function(e) {
      var item = e.target.closest(".char-search-item");
      if (item) {
        var name = item.dataset.name;
        var inp = document.getElementById("charSearchInput");
        if (inp) inp.value = name;
        hideResults();
        loadPlayerSheet(name);
        return;
      }
      if (!e.target.closest(".char-search-bar")) hideResults();
    });

    document.addEventListener("keydown", function(e) {
      if (e.target.id === "charSearchInput" && e.key === "Enter") {
        var q = e.target.value.trim();
        if (q.length >= 2) { hideResults(); loadPlayerSheet(q); }
      }
    });
  }
}

function hideResults() {
  var d = document.getElementById("charSearchResults");
  if (d) { d.innerHTML = ""; d.style.display = "none"; }
}

function showResults(players) {
  var d = document.getElementById("charSearchResults");
  if (!d || !players.length) { hideResults(); return; }
  d.style.display = "block";
  d.innerHTML = players.slice(0, 8).map(function(p) {
    var bc = getBreedColor(p.breed_id);
    return '<div class="char-search-item" data-name="' + esc(p.name) + '">' +
      '<span class="char-search-name">' + esc(p.name) + '</span>' +
      '<span class="char-search-meta"><span style="color:' + bc + '">' + esc(p.breed_name || p.breedName || "") + '</span> Niv.' + p.level + '</span></div>';
  }).join("");
}

async function loadPlayerSheet(name) {
  var el = document.getElementById("charContent");
  if (!el) return;
  el.innerHTML = '<div class="char-loading">Chargement de ' + esc(name) + '...</div>';
  try {
    var p = await fetchJson("/api/players/" + encodeURIComponent(name));
    if (p.error) { el.innerHTML = '<div class="char-empty"><p style="color:var(--red)">Joueur introuvable</p></div>'; return; }
    renderSheet(el, p);
    initTooltipDelegation();
  } catch(e) {
    el.innerHTML = '<div class="char-empty"><p style="color:var(--red)">Erreur: ' + esc(e.message) + '</p></div>';
  }
}

function renderSheet(el, p) {
  var bc = getBreedColor(p.breed_id);
  var bn = p.breedName || p.breed_name || "?";
  var equip = p.equipment || [];
  var spells = p.spells || {};

  // Map slot -> item
  var sm = {};
  for (var i = 0; i < equip.length; i++) sm[equip[i].slot] = equip[i];

  var h = '';

  // HEADER
  h += '<div class="char-header">';
  h += '<div class="char-avatar" style="border-color:' + bc + '"><div class="char-avatar-inner" style="background:' + bc + '20"><span class="char-breed-icon">' + bn.charAt(0) + '</span></div></div>';
  h += '<div class="char-identity"><h2 class="char-name">' + esc(p.name) + '</h2>';
  h += '<div class="char-subtitle"><span class="char-breed" style="color:' + bc + '">' + esc(bn) + '</span>';
  h += '<span class="char-level">Niveau ' + p.level + '</span>';
  if (p.guild_name) h += '<span class="char-guild">' + esc(p.guild_name) + '</span>';
  h += '</div></div>';
  h += '<div class="char-score-badge"><div class="char-score-value">' + rnd(p.score_global || 0) + '</div><div class="char-score-label">Score</div></div>';
  h += '</div>';

  // STATS BAR
  h += '<div class="char-stats-bar">';
  var stats = [
    ["PA", "#4a9eff", p.pa||0], ["PM", "#4ade80", p.pm||0], ["PW", "#22d3ee", p.pw||0],
    ["PV", "#ef4444", p.total_pv||0], ["R\u00e9s", "#a78bfa", p.total_res||0],
    ["CC", "#fbbf24", "+" + (p.coup_crit||0) + "%"],
    ["Off", "#f97316", rnd(p.poids_offensif||0)], ["D\u00e9f", "#8b5cf6", rnd(p.poids_defensif||0)],
    ["Tacle", "#64748b", p.tacle||0], ["Esq", "#64748b", p.esquive||0]
  ];
  for (var s = 0; s < stats.length; s++) {
    h += '<div class="char-stat"><span class="cs-icon" style="color:' + stats[s][1] + '">' + stats[s][0] + '</span><span class="cs-val">' + stats[s][2] + '</span></div>';
  }
  h += '</div>';

  // PAPER DOLL
  h += '<div class="char-paperdoll">';
  h += '<div class="pd-col pd-col-left">';
  for (var j = 0; j < PAPER_DOLL_SLOTS.length; j++) {
    if (PAPER_DOLL_SLOTS[j].area === "left") h += renderSlot(PAPER_DOLL_SLOTS[j], sm[PAPER_DOLL_SLOTS[j].slot]);
  }
  h += '</div>';
  h += '<div class="pd-center"><div class="pd-avatar-frame" style="border-color:' + bc + '"><div class="pd-avatar-bg" style="background:' + bc + '15"><span class="pd-avatar-letter" style="color:' + bc + '">' + bn.charAt(0) + bn.charAt(1) + '</span></div></div></div>';
  h += '<div class="pd-col pd-col-right">';
  for (var k = 0; k < PAPER_DOLL_SLOTS.length; k++) {
    if (PAPER_DOLL_SLOTS[k].area === "right") h += renderSlot(PAPER_DOLL_SLOTS[k], sm[PAPER_DOLL_SLOTS[k].slot]);
  }
  h += '</div>';
  h += '</div>';

  // SORTS
  var decks = spells.decks || [];
  var builds = spells.builds || [];
  var activeDeck = spells.active_deck || 0;
  var combatObs = spells.combat_observed || [];

  if (decks.length || combatObs.length) {
    h += '<div class="char-spells-section"><h3 class="char-section-title">Sorts</h3>';
    for (var d = 0; d < decks.length; d++) {
      var deck = decks[d];
      var isAct = deck.index === activeDeck;
      var bi = null;
      for (var b = 0; b < builds.length; b++) { if (builds[b].index === deck.index) { bi = builds[b]; break; } }
      var dn = bi ? bi.name : "Deck " + deck.index;
      h += '<div class="char-spell-deck' + (isAct ? ' active' : '') + '">';
      h += '<div class="char-deck-header"><span class="char-deck-name">' + esc(dn) + '</span>';
      if (isAct) h += '<span class="char-deck-badge">ACTIF</span>';
      h += '</div>';
      h += renderSpellGroup("Actifs", deck.active_spells || []);
      h += renderSpellGroup("Passifs", deck.passive_spells || [], true);
      h += '</div>';
    }
    if (combatObs.length) {
      h += '<div class="char-spell-deck"><div class="char-deck-header"><span class="char-deck-name">Sorts observ\u00e9s en combat</span></div>';
      h += '<div class="char-spell-list">';
      for (var co = 0; co < combatObs.length; co++) h += renderOneSpell(combatObs[co], false);
      h += '</div></div>';
    }
    h += '</div>';
  }

  el.innerHTML = h;
}

function renderSpellGroup(label, spells, passive) {
  if (!spells || !spells.length) return "";
  var h = '<div class="char-spell-group"><div class="char-spell-label">' + label + '</div><div class="char-spell-list">';
  for (var i = 0; i < spells.length; i++) h += renderOneSpell(spells[i], passive);
  h += '</div></div>';
  return h;
}

function renderOneSpell(s, passive) {
  var sp = typeof s === "object" ? s : { id: s };
  var gfx = sp.gfxId || sp.gfx_id || sp.id;
  var nm = sp.name || "";
  return '<span class="char-spell' + (passive ? ' passive' : '') + '" title="' + esc(nm || "Spell " + sp.id) + '">' +
    '<img src="/icons/spells/' + gfx + '.png" onerror="this.style.display=\'none\'" alt="">' +
    (nm ? '<span class="char-spell-name">' + esc(nm) + '</span>' : '') + '</span>';
}

function renderSlot(def, item) {
  if (!item) {
    return '<div class="pd-slot pd-slot-empty" data-slot="' + def.slot + '">' +
      '<div class="pd-slot-icon-wrap"><img src="/icons/slots/' + def.icon + '.png?v=1" class="pd-slot-icon" onerror="this.style.display=\'none\'" alt=""></div>' +
      '<div class="pd-slot-label">' + esc(def.label) + '</div></div>';
  }
  var rc = RARITY_CLS[item.rarity] || "rarity-0";
  var rn = item.rarityName || RARITY_NAMES[item.rarity] || "";
  var gfx = item.gfx_id || 0;
  var isPet = (def.slot === 22 || def.slot === 24);
  return '<div class="pd-slot pd-slot-filled ' + rc + '" data-item-id="' + item.item_id + '" data-slot="' + def.slot + '" style="cursor:pointer">' +
    '<div class="pd-slot-icon-wrap pd-has-item">' +
    (gfx ? '<img src="/icons/items/' + gfx + '.png" class="pd-item-img" onerror="this.src=\'/icons/slots/' + def.icon + '.png?v=1\'" alt="">' :
           '<img src="/icons/slots/' + def.icon + '.png?v=1" class="pd-slot-icon" alt="">') +
    '</div><div class="pd-slot-info">' +
    '<div class="pd-item-name ' + rc + '">' + esc(item.name || "???") + '</div>' +
    '<div class="pd-item-meta">' +
    (!isPet && item.level ? '<span>Niv.' + item.level + '</span>' : '') +
    '<span class="' + rc + '">' + esc(rn) + '</span></div></div></div>';
}

// Expose pour ouvrir depuis le classement
window.__loadCharacterTab = function(name) {
  // Activer tab personnage
  document.querySelectorAll("[data-tab]").forEach(function(el) { el.classList.remove("active"); });
  document.querySelectorAll("[data-content]").forEach(function(el) { el.style.display = "none"; });
  var tab = document.querySelector('[data-tab="cdn"]');
  var content = document.querySelector('[data-content="cdn"]');
  if (tab) tab.classList.add("active");
  if (content) content.style.display = "";
  // Activer sous-onglet fiche
  document.querySelectorAll("[data-perso-sub]").forEach(function(el) { el.classList.toggle("active", el.dataset.persoSub === "fiche"); });
  document.querySelectorAll("[data-perso-content]").forEach(function(el) { el.style.display = el.dataset.persoContent === "fiche" ? "" : "none"; });
  // Charger
  var container = document.getElementById("charContainer");
  if (container && !document.getElementById("charSearchInput")) {
    loadCharacter();
  }
  var inp = document.getElementById("charSearchInput");
  if (inp) inp.value = name;
  loadPlayerSheet(name);
};
