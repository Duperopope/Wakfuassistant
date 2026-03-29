import { initTooltipDelegation } from "../tooltip.js";

// ============================================================
// armory.js - Onglet Armurerie
// Vue visuelle des items les plus portes par slot et classe
// Icones: /icons/items/{gfx_id}.png (unifie avec modal.js)
// Classes CSS: .rarity-X, .clickable-player (unifiees)
// ============================================================

const SLOT_LAYOUT = [
  { id: "Casque", col: "left", icon: "casque" },
  { id: "Cape", col: "left", icon: "cape" },
  { id: "Amulette", col: "left", icon: "amulette" },
  { id: "Epaulettes", col: "left", icon: "epaulettes" },
  { id: "Plastron", col: "left", icon: "plastron" },
  { id: "Ceinture", col: "left", icon: "ceinture" },
  { id: "Bottes", col: "right", icon: "bottes" },
  { id: "Anneau 1", col: "right", icon: "anneau" },
  { id: "Anneau 2", col: "right", icon: "anneau" },
  { id: "Arme principale", col: "right", icon: "arme" },
  { id: "Seconde main", col: "right", icon: "secondemain" },
  { id: "Accessoire", col: "right", icon: "accessoire" },
  { id: "Familier", col: "right", icon: "familier" },
  { id: "Monture", col: "right", icon: "monture" }
];

const RARITY_CLASS = {
  "Commun":"rarity-0","Inhabituel":"rarity-1","Rare":"rarity-2",
  "Mythique":"rarity-3","Legendaire":"rarity-4","Relique":"rarity-5",
  "Souvenir":"rarity-6","Epique":"rarity-7"
};

function rc(name) { return RARITY_CLASS[name] || "rarity-0"; }
function esc(s) { return (s||"").replace(/&/g,"&amp;").replace(/</g,"&lt;").replace(/>/g,"&gt;").replace(/"/g,"&quot;"); }

let _armData = null;
let _armBreed = "";
let _armTop = 0;
let _armLevelMin = 0;
let _armLevelMax = 999;
let _bound = false;

async function fetchArmory() {
  var url = "/api/inventory?min_level=" + _armLevelMin + "&max_level=" + _armLevelMax;
  if (_armBreed) url += "&breed=" + encodeURIComponent(_armBreed);
  if (_armTop > 0) url += "&top=" + _armTop;
  try {
    var resp = await fetch(url);
    _armData = await resp.json();
  } catch(e) {
    console.error("[armory] fetch error:", e);
    _armData = null;
  }
}

function itemIcon(gfx_id, size) {
  if (!gfx_id) return '<div class="arm-no-icon" style="width:'+size+'px;height:'+size+'px"></div>';
  return '<img src="/icons/items/' + gfx_id + '.png" class="item-icon" '
    + 'style="width:'+size+'px;height:'+size+'px" '
    + 'onerror="this.style.display=\'none\'" alt="">';
}

function renderArmory(data) {
  var el = document.getElementById("invContent");
  if (!el || !data || !data.best_in_slot) {
    if (el) el.innerHTML = '<p style="text-align:center;color:var(--text-muted);padding:40px">Aucune donnee</p>';
    return;
  }

  var bis = data.best_in_slot;
  var html = '';

  // Info bar
  html += '<div class="arm-info">';
  html += '<span>' + (data.players_scanned || 0) + ' joueurs analyses</span>';
  html += '<span>' + (data.total_items || 0) + ' items uniques</span>';
  html += '</div>';

  // Grille visuelle des slots
  html += '<div class="arm-grid">';

  // Colonne gauche
  html += '<div class="arm-col">';
  SLOT_LAYOUT.filter(function(s) { return s.col === "left"; }).forEach(function(slot) {
    html += renderSlotCard(slot, bis[slot.id] || []);
  });
  html += '</div>';

  // Colonne droite
  html += '<div class="arm-col">';
  SLOT_LAYOUT.filter(function(s) { return s.col === "right"; }).forEach(function(slot) {
    html += renderSlotCard(slot, bis[slot.id] || []);
  });
  html += '</div>';

  html += '</div>';
  el.innerHTML = html;
  initTooltipDelegation();
}

function renderSlotCard(slot, items) {
  if (!items || items.length === 0) return '';
  var html = '<div class="arm-slot-card">';
  html += '<div class="arm-slot-header">';
  html += '<img src="/icons/slots/' + slot.icon + '.png?v=1774810874" class="arm-slot-icon" style="width:24px;height:24px;vertical-align:middle;margin-right:6px" onerror="this.style.display=\'none\'" alt="">';
  html += '<span class="arm-slot-name">' + esc(slot.id) + '</span>';
  if (items.length > 0) {
    html += '<span class="arm-slot-count">' + items[0].carriers + ' porteurs</span>';
  }
  html += '</div>';


  // Top 3 items pour ce slot
  items.slice(0, 3).forEach(function(it, i) {
    var rarCls = rc(it.rarity_name);
    var isFirst = i === 0;
    html += '<div class="arm-item' + (isFirst ? ' arm-item-first' : '') + '" data-item-id="' + it.item_id + '" style="cursor:pointer">';
    html += '<div class="arm-item-icon">' + itemIcon(it.gfx_id, isFirst ? 48 : 32) + '</div>';
    html += '<div class="arm-item-info">';
    html += '<div class="arm-item-name ' + rarCls + '">' + esc(it.name) + '</div>';
    html += '<div class="arm-item-meta">';
    var isPet = (it.type_id === 582 || it.type_id === 611);
    html += isPet ? '' : '<span>Niv.' + it.level + '</span>';
    html += '<span class="' + rarCls + '">' + esc(it.rarity_name) + '</span>';
    html += '<span>' + it.carriers + ' porteur' + (it.carriers > 1 ? 's' : '') + '</span>';
    html += '<span>Score: ' + it.avg_score + '</span>';
    html += '</div>';
    // Porteurs cliquables
    if (it.carrier_names && it.carrier_names.length) {
      html += '<div class="arm-carriers">';
      it.carrier_names.slice(0, 3).forEach(function(c) {
        var pname = typeof c === "object" ? c.name : c;
        html += '<span class="clickable-player" data-player="' + esc(pname) + '">' + esc(pname) + '</span>';
      });
      html += '</div>';
    }
    html += '</div>';
    html += '</div>';
  });

  html += '</div>';
  return html;
}

export async function loadInventory() {
  var container = document.querySelector('[data-subcontent="inventory"]');
  if (!container) return;

  if (!_bound) {
    _bound = true;

    var breedSel = document.getElementById("invBreedFilter");
    if (breedSel) {
      breedSel.addEventListener("change", async function() {
        _armBreed = this.value;
        _armData = null;
        await fetchArmory();
        renderArmory(_armData);
      });
    }

    var topSel = document.getElementById("invTopFilter");
    if (topSel) {
      topSel.addEventListener("change", async function() {
        _armTop = parseInt(this.value) || 0;
        _armData = null;
        await fetchArmory();
        renderArmory(_armData);
      });
    }

var lvlMinSel = document.getElementById("invLevelMin");
if (lvlMinSel) {
  lvlMinSel.addEventListener("change", async function() {
    _armLevelMin = parseInt(this.value) || 0;
    await fetchArmory();
    renderArmory(_armData);
  });
}
var lvlMaxSel = document.getElementById("invLevelMax");
if (lvlMaxSel) {
  lvlMaxSel.addEventListener("change", async function() {
    _armLevelMax = parseInt(this.value) || 999;
    await fetchArmory();
    renderArmory(_armData);
  });
}
  }

  if (!_armData) {
    var content = document.getElementById("invContent");
    if (content) content.innerHTML = '<p style="text-align:center;color:var(--text-muted)">Chargement...</p>';
    await fetchArmory();

    var breedSel = document.getElementById("invBreedFilter");
    if (breedSel && _armData && _armData.breeds && _armData.breeds.length) {
      var opts = '<option value="">Toutes les classes</option>';
      _armData.breeds.forEach(function(b) {
        opts += '<option value="' + esc(b) + '">' + esc(b) + '</option>';
      });
      breedSel.innerHTML = opts;
    }
  }

  renderArmory(_armData);
}
