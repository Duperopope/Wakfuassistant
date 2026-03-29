// ============================================================
// inventory.js - Onglet Inventaire (Meta / Best-in-Slot)
// Utilise les classes CSS unifiees: .rarity-X, .clickable-player
// ============================================================

const SLOT_ORDER = [
  "Casque","Epaulettes","Amulette","Plastron",
  "Anneau 1","Anneau 2","Bottes","Ceinture","Cape",
  "Arme principale","Seconde main","Accessoire",
  "Familier","Embleme"
];

// Map nom de rarete -> classe CSS
const RARITY_CLASS = {
  "Commun":"rarity-0","Inhabituel":"rarity-1","Rare":"rarity-2",
  "Mythique":"rarity-3","Legendaire":"rarity-4","Relique":"rarity-5",
  "Souvenir":"rarity-6","Epique":"rarity-7"
};

function rarityClass(name) {
  return RARITY_CLASS[name] || "rarity-0";
}

function esc(s) {
  if (!s) return "";
  return String(s).replace(/&/g,"&amp;").replace(/</g,"&lt;").replace(/>/g,"&gt;").replace(/"/g,"&quot;");
}

// --- Etat interne ---
let _invData = null;
let _invMode = "bis";
let _invBreed = "";
let _invTop = 0;
let _modeBound = false;

// --- Fetch API ---
async function fetchInventory() {
  var url = "/api/inventory?max_level=999";
  if (_invBreed) url += "&breed=" + encodeURIComponent(_invBreed);
  if (_invTop > 0) url += "&top=" + _invTop;
  try {
    var resp = await fetch(url);
    _invData = await resp.json();
  } catch(e) {
    console.error("[inventory] fetch error:", e);
    _invData = null;
  }
}

// ============================================================
// RENDER: Best-in-Slot
// ============================================================
function renderBIS(data) {
  var el = document.getElementById("invContent");
  if (!el || !data.best_in_slot) return;

  var html = '<div class="bis-grid">';
  SLOT_ORDER.forEach(function(slot) {
    var items = data.best_in_slot[slot];
    if (!items || !items.length) return;

    html += '<div class="bis-card">';
    html += '<div class="bis-slot-name">' + esc(slot) + '</div>';

    items.slice(0, 5).forEach(function(it, i) {
      var rc = rarityClass(it.rarity_name);
      html += '<div class="bis-item' + (i === 0 ? ' bis-first' : '') + '">'
        + '<span class="bis-rank">' + (i + 1) + '</span>'
        + '<span class="bis-name ' + rc + '">' + esc(it.name) + '</span>'
        + '<span class="bis-level">niv.' + it.level + '</span>'
        + '<span class="bis-carriers">' + it.carriers + ' porteurs</span>'
        + '<span class="bis-score">score moy: ' + (it.avg_score || "N/A") + '</span>'
        + '</div>';
    });

    html += '</div>';
  });
  html += '</div>';
  html += '<div class="inv-info">' + (data.players_scanned || 0)
    + ' joueurs scannes / ' + (data.players_pool || 0) + ' dans le pool</div>';
  el.innerHTML = html;
}

// ============================================================
// RENDER: Meta (tableau detaille)
// ============================================================
function renderMeta(data) {
  var el = document.getElementById("invContent");
  if (!el) return;

  var items = data.items || [];
  var html = '<table class="data-table"><thead><tr>'
    + '<th>#</th><th>ITEM</th><th>NIVEAU</th><th>RARETE</th><th>SLOT</th>'
    + '<th>PORTEURS</th><th>SCORE MOY.</th><th>CLASSE DOM.</th><th>TOP PORTEURS</th>'
    + '</tr></thead><tbody>';

  items.slice(0, 100).forEach(function(it, i) {
    var rc = rarityClass(it.rarity_name);

    // Noms des porteurs: cliquables avec la classe unifiee
    var carriers_html = (it.carrier_names || []).map(function(c) {
      var playerName = typeof c === "object" ? c.name : c;
      var playerScore = typeof c === "object" ? c.score : "";
      var title = playerScore ? 'title="Score: ' + playerScore + '"' : '';
      return '<span class="clickable-player" ' + title
        + ' data-player="' + esc(playerName) + '">'
        + esc(playerName) + '</span>';
    }).join(", ");

    html += '<tr>'
      + '<td>' + (i + 1) + '</td>'
      + '<td class="' + rc + '" style="font-weight:600">' + esc(it.name) + '</td>'
      + '<td>' + it.level + '</td>'
      + '<td class="' + rc + '">' + esc(it.rarity_name) + '</td>'
      + '<td>' + esc(it.slot) + '</td>'
      + '<td style="font-weight:700">' + it.carriers + '</td>'
      + '<td style="font-weight:700;color:var(--accent)">' + (it.avg_score || "N/A") + '</td>'
      + '<td>' + esc(it.top_breed || "") + '</td>'
      + '<td class="carriers-cell">' + carriers_html + '</td>'
      + '</tr>';
  });

  html += '</tbody></table>';
  html += '<div class="inv-info">' + (data.players_scanned || 0)
    + ' joueurs scannes, ' + (data.total_items || 0) + ' items uniques</div>';
  el.innerHTML = html;
}

// ============================================================
// RENDER: Vue globale (graphiques rarete + slots)
// ============================================================
function renderAll(data) {
  var el = document.getElementById("invContent");
  if (!el) return;

  // --- Rarete chart ---
  var entries = Object.entries(data.rarity_stats || {}).sort(function(a, b) { return b[1] - a[1]; });
  var maxR = entries[0] ? entries[0][1] : 1;
  var totalR = entries.reduce(function(s, e) { return s + e[1]; }, 0);

  var html = '<div class="inv-charts">';
  html += '<div class="chart-card"><div class="chart-title">Rarete des items equipes</div>';
  entries.forEach(function(e) {
    var rc = rarityClass(e[0]);
    var pct = ((e[1] / totalR) * 100).toFixed(1);
    var barW = ((e[1] / maxR) * 100).toFixed(0);
    html += '<div class="inv-stat-row">'
      + '<span class="inv-stat-dot ' + rc + '-bg"></span>'
      + '<span class="inv-stat-name ' + rc + '">' + esc(e[0]) + '</span>'
      + '<span class="inv-stat-bar-bg"><span class="inv-stat-bar ' + rc + '-bg" style="width:' + barW + '%"></span></span>'
      + '<span class="inv-stat-val">' + e[1] + ' (' + pct + '%)</span>'
      + '</div>';
  });
  html += '</div>';

  // --- Slot chart ---
  var slots = [];
  SLOT_ORDER.forEach(function(s) {
    var bis = (data.best_in_slot || {})[s];
    if (bis) {
      var tot = bis.reduce(function(sum, it) { return sum + it.carriers; }, 0);
      slots.push([s, tot]);
    }
  });
  var maxS = slots.length ? Math.max.apply(null, slots.map(function(s) { return s[1]; })) : 1;
  html += '<div class="chart-card"><div class="chart-title">Items par slot</div>';
  slots.forEach(function(e) {
    var barW = ((e[1] / maxS) * 100).toFixed(0);
    html += '<div class="inv-stat-row">'
      + '<span class="inv-stat-name" style="min-width:90px">' + esc(e[0]) + '</span>'
      + '<span class="inv-stat-bar-bg"><span class="inv-stat-bar" style="width:' + barW + '%;background:var(--accent)"></span></span>'
      + '<span class="inv-stat-val">' + e[1] + '</span>'
      + '</div>';
  });
  html += '</div></div>';
  el.innerHTML = html;
}

// ============================================================
// Clic delegue sur .clickable-player dans l inventaire
// ============================================================

// ============================================================
// EXPORT: loadInventory
// ============================================================
export async function loadInventory() {
  var container = document.querySelector('[data-subcontent="inventory"]');
  if (!container) return;

  // Bind mode switcher une seule fois
  if (!_modeBound) {
    _modeBound = true;

    var switcher = document.getElementById("invModeSwitcher");
    if (switcher) {
      var btns = switcher.querySelectorAll(".inv-mode-btn");
      btns.forEach(function(btn) {
        btn.addEventListener("click", function() {
          btns.forEach(function(b) { b.classList.remove("active"); });
          btn.classList.add("active");
          _invMode = btn.dataset.mode;
          renderCurrent();
        });
      });
    }

    var breedSel = document.getElementById("invBreedFilter");
    if (breedSel) {
      breedSel.addEventListener("change", async function() {
        _invBreed = this.value;
        _invData = null;
        await fetchInventory();
        renderCurrent();
      });
    }

    var topSel = document.getElementById("invTopFilter");
    if (topSel) {
      topSel.addEventListener("change", async function() {
        _invTop = parseInt(this.value) || 0;
        _invData = null;
        await fetchInventory();
        renderCurrent();
      });
    }
  }

  // Premier chargement
  if (!_invData) {
    var content = document.getElementById("invContent");
    if (content) {
      content.innerHTML = '<p style="text-align:center;color:var(--text-muted)">Chargement...</p>';
    }
    await fetchInventory();

    // Peupler le filtre breed
    var breedSel = document.getElementById("invBreedFilter");
    if (breedSel && _invData && _invData.breeds && _invData.breeds.length) {
      var opts = '<option value="">Toutes les classes</option>';
      _invData.breeds.forEach(function(b) {
        opts += '<option value="' + esc(b) + '">' + esc(b) + '</option>';
      });
      breedSel.innerHTML = opts;
    }
  }

  renderCurrent();
}

function renderCurrent() {
  if (!_invData) return;
  if (_invMode === "bis") renderBIS(_invData);
  else if (_invMode === "meta") renderMeta(_invData);
  else renderAll(_invData);
}
