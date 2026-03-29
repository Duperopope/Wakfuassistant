import { fetchJson } from "../api.js";

let _loaded = false;
let _currentTab = "new";
let _newPlayers = [];
let _updatedPlayers = [];
let _sortCol = "detected_at";
let _sortAsc = false;

// Filtres
let _filters = { name: "", guild: "", breed: "", minLevel: 0, maxLevel: 245, minScore: 0 };

function formatAgo(dateStr) {
  try {
    const d = new Date(dateStr);
    const now = new Date();
    const diff = Math.floor((now - d) / 60000);
    if (diff < 1) return "a l\u0027instant";
    if (diff < 60) return diff + " min";
    if (diff < 1440) return Math.floor(diff / 60) + "h";
    return Math.floor(diff / 1440) + "j";
  } catch (e) {
    return dateStr;
  }
}

function esc(s) { return (s || "").replace(/&/g,"&amp;").replace(/</g,"&lt;").replace(/>/g,"&gt;").replace(/"/g,"&quot;"); }

function filterPlayers(players) {
  return players.filter(p => {
    if (_filters.name && !p.name.toLowerCase().includes(_filters.name)) return false;
    if (_filters.guild && !(p.guild_name || "").toLowerCase().includes(_filters.guild)) return false;
    if (_filters.breed && p.breedName !== _filters.breed) return false;
    if (p.level < _filters.minLevel || p.level > _filters.maxLevel) return false;
    if (_filters.minScore > 0 && (p.score_global || 0) < _filters.minScore) return false;
    return true;
  }).sort((a, b) => {
    let va = a[_sortCol], vb = b[_sortCol];
    if (va === undefined || va === null) va = "";
    if (vb === undefined || vb === null) vb = "";
    if (typeof va === "string") { va = va.toLowerCase(); vb = (vb + "").toLowerCase(); }
    if (va < vb) return _sortAsc ? -1 : 1;
    if (va > vb) return _sortAsc ? 1 : -1;
    return 0;
  });
}

function getArrow(col) {
  if (_sortCol !== col) return "";
  return _sortAsc ? " \u25B2" : " \u25BC";
}

function sortRecent(col) {
  if (_sortCol === col) _sortAsc = !_sortAsc;
  else { _sortCol = col; _sortAsc = false; }
  renderCurrent();
}

function highlight(text, term) {
  if (!term) return text;
  const re = new RegExp("(" + term.replace(/[.*+?^${}()|[\]\\]/g, "\\$&") + ")", "gi");
  return text.replace(re, '<mark style="background:var(--accent);color:#fff;border-radius:2px;padding:0 2px">$1</mark>');
}

function renderList(players, containerId, isNew) {
  const el = document.getElementById(containerId);
  if (!el) return;

  const filtered = filterPlayers(players);
  const hasFilters = _filters.name || _filters.guild || _filters.breed || _filters.minLevel > 0 || _filters.maxLevel < 245 || _filters.minScore > 0;

  if (!filtered.length) {
    el.innerHTML = '<div style="text-align:center;color:var(--text-muted);padding:40px">' +
      (hasFilters ? "Aucun resultat avec ces filtres" : "Aucun joueur") + '</div>';
    return;
  }

  const header = '<div class="recent-row recent-header">' +
    ['detected_at:QUAND', 'name:NOM', 'level:NIV', 'breedName:CLASSE', 'guild_name:GUILDE', 'score_global:SCORE', 'poids_offensif:OFF']
    .map(c => {
      const [key, label] = c.split(":");
      return `<span class="rc-${label === 'QUAND' ? 'time' : label === 'NOM' ? 'name' : label === 'NIV' ? 'level' : label === 'CLASSE' ? 'class' : label === 'GUILDE' ? 'guild' : label === 'SCORE' ? 'score' : 'off'}" data-rsort="${key}" style="cursor:pointer">${label}${getArrow(key)}</span>`;
    }).join("") + '</div>';

  const count = '<div style="font-size:11px;color:var(--text-muted);padding:4px 12px">' +
    filtered.length + (hasFilters ? ' resultat(s)' : ' joueurs') + '</div>';

  const rows = filtered.map(p => {
    const ago = formatAgo(isNew ? p.first_seen : p.detected_at);
    const scoreColor = p.score_global > 0 ? "var(--green)" : "var(--text-muted)";
    const offColor = p.poids_offensif > 0 ? "var(--accent)" : "var(--text-muted)";
    const nameData = ` data-player="${p.name.replace(/"/g, '&quot;')}"`; 

    const displayName = highlight(esc(p.name), _filters.name);
    const displayGuild = highlight(esc(p.guild_name || "-"), _filters.guild);

    return '<div class="recent-row">' +
      `<span class="rc-time" title="${esc(isNew ? p.first_seen : p.detected_at)}">${ago}</span>` +
      `<span class="rc-name clickable-player"${nameData}>${displayName}</span>` +
      `<span class="rc-level">${p.level}</span>` +
      `<span class="rc-class"><span class="breed-badge">${esc(p.breedName)}</span></span>` +
      `<span class="rc-guild">${displayGuild}</span>` +
      `<span class="rc-score" style="color:${scoreColor}">${p.score_global || "-"}</span>` +
      `<span class="rc-off" style="color:${offColor}">${p.poids_offensif || "-"}</span>` +
      '</div>';
  }).join("");

  el.innerHTML = header + count + rows;

  el.querySelectorAll("[data-rsort]").forEach(h => {
    h.addEventListener("click", () => sortRecent(h.dataset.rsort));
  });
}

function switchRecentTab(tab) {
  _currentTab = tab;
  document.querySelectorAll(".recent-btn").forEach(b => {
    const isActive = b.dataset.recent === tab;
    b.classList.toggle("active", isActive);
    b.style.background = isActive ? "var(--accent)" : "var(--card)";
    b.style.color = isActive ? "#fff" : "var(--text-muted)";
  });
  document.getElementById("recentNewList").style.display = tab === "new" ? "" : "none";
  document.getElementById("recentUpdatedList").style.display = tab === "updated" ? "" : "none";
  renderCurrent();
}

function renderCurrent() {
  if (_currentTab === "new") {
    renderList(_newPlayers, "recentNewList", true);
  } else {
    renderList(_updatedPlayers, "recentUpdatedList", false);
  }
}

function populateClassFilter() {
  const sel = document.getElementById("recentSearchClass");
  if (!sel) return;
  const breeds = new Set();
  _newPlayers.forEach(p => breeds.add(p.breedName));
  _updatedPlayers.forEach(p => breeds.add(p.breedName));
  const sorted = [...breeds].sort();
  sel.innerHTML = '<option value="">Toutes classes</option>' +
    sorted.map(b => `<option value="${b}">${b}</option>`).join("");
}

function bindFilters() {
  let timer;
  function onFilter() {
    clearTimeout(timer);
    timer = setTimeout(function() {
      var nameEl = document.getElementById("recentSearchName");
      var guildEl = document.getElementById("recentSearchGuild");
      var classEl = document.getElementById("recentSearchClass");
      var minLvl = document.getElementById("recentMinLevel");
      var maxLvl = document.getElementById("recentMaxLevel");
      var minScore = document.getElementById("recentMinScore");

      _filters.name = (nameEl ? nameEl.value.trim().toLowerCase() : "");
      _filters.guild = (guildEl ? guildEl.value.trim().toLowerCase() : "");
      _filters.breed = (classEl ? classEl.value : "");
      _filters.minLevel = parseInt(minLvl ? minLvl.value : "0") || 0;
      _filters.maxLevel = parseInt(maxLvl ? maxLvl.value : "245") || 245;
      _filters.minScore = parseInt(minScore ? minScore.value : "0") || 0;

      renderCurrent();
    }, 200);
  }

  ["recentSearchName", "recentSearchGuild", "recentMinLevel", "recentMaxLevel", "recentMinScore"].forEach(function(id) {
    var el = document.getElementById(id);
    if (el && !el._bound) {
      el._bound = true;
      el.addEventListener("input", onFilter);
    }
  });

  var classEl = document.getElementById("recentSearchClass");
  if (classEl && !classEl._bound) {
    classEl._bound = true;
    classEl.addEventListener("change", function() { renderCurrent(); });
  }
}


export async function loadRecent(force) {
  if (_loaded && !force) return;

  const data = await fetchJson("/api/recent?limit=200");
  if (!data) return;

  _newPlayers = data.new_players || [];
  _updatedPlayers = data.updated_players || [];

  populateClassFilter();
  renderCurrent();

  document.querySelectorAll(".recent-btn").forEach(b => {
    b.onclick = () => switchRecentTab(b.dataset.recent);
  });

  bindFilters();
  _loaded = true;
}
