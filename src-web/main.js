// Main entry - point d entree Vite HMR
import "./css/app.css";
import { fetchJson, reloadData, connectSSE } from "./js/api.js";
import { getState, setState, updateFilters, subscribe } from "./js/state.js";
import { debounce } from "./js/utils.js";
import { loadPlayers } from "./js/tabs/players.js";
import { loadGuilds } from "./js/tabs/guilds.js";
import { loadClasses } from "./js/tabs/classes.js";
import { loadInventory } from "./js/tabs/inventory.js";
import { loadRecent } from "./js/tabs/recent.js";
import { loadCdn, populateCdnFilters } from "./js/tabs/cdn.js";
import { showPlayer, closeModal } from "./js/modal.js";
// import "./css/builds.css"; // desactive temporairement
import { loadEquipment } from "./js/tabs/equipment.js";
import { loadOptimizer } from "./js/tabs/optimizer.js";
import { loadSpellsEditor } from "./js/tabs/spells.js";

// ─── Onglets principaux ───
function switchTab(tab) {
  setState({ currentTab: tab });
  document.querySelectorAll(".tab").forEach(el =>
    el.classList.toggle("active", el.dataset.tab === tab)
  );
  document.querySelectorAll(".tab-content").forEach(el =>
    el.style.display = el.dataset.content === tab ? "" : "none"
  );
  if (tab === "classement") {
    const sub = getState().currentSubtab || "players";
    switchSubtab(sub);
  }
  if (tab === "cdn") loadCdn(true);
}

// ─── Sous-onglets Classement ───
function switchSubtab(sub) {
  setState({ currentSubtab: sub });
  document.querySelectorAll(".subtab").forEach(el =>
    el.classList.toggle("active", el.dataset.subtab === sub)
  );
  document.querySelectorAll(".subtab-content").forEach(el =>
    el.style.display = el.dataset.subcontent === sub ? "" : "none"
  );
  if (sub === "players") loadPlayers();
  if (sub === "guilds") loadGuilds();
  if (sub === "recent") loadRecent();
  if (sub === "inventory") loadInventory();
}

// ─── Stats bar ───
function renderStats(s) {
  const bar = document.getElementById("statsBar");
  if (!bar) return;
  bar.innerHTML = `
    <div class="stat-card"><div class="label">JOUEURS</div><div class="value accent">${s.total_players || 0}</div></div>
    <div class="stat-card"><div class="label">GUILDES</div><div class="value accent">${s.total_guilds || 0}</div></div>
    <div class="stat-card"><div class="label">TOP SCORE</div><div class="value green">${s.max_poids_offensif || 0}</div></div>
    <div class="stat-card"><div class="label">TOP JOUEUR</div><div class="value">${s.top_player || "-"}</div></div>
    <div class="stat-card"><div class="label">MOY. OFFENSIF</div><div class="value">${s.avg_poids_offensif || 0}</div></div>
    <div class="stat-card"><div class="label">MOY. NIVEAU</div><div class="value">${s.avg_level || 0}</div></div>
    <div class="stat-card"><div class="label">DERNIER RELEVE</div><div class="value" style="font-size:13px;color:var(--text-muted)">${(() => {
      if (!s.last_update) return "inconnu";
      try {
        const d = new Date(s.last_update.replace(" ", "T"));
        if (isNaN(d.getTime())) return s.last_update;
        const now = new Date();
        const diff = Math.floor((now - d) / 60000);
        let ago = "";
        if (diff < 60) ago = "il y a " + diff + " min";
        else if (diff < 1440) ago = "il y a " + Math.floor(diff / 60) + "h";
        else ago = "il y a " + Math.floor(diff / 1440) + "j";
        return d.toLocaleDateString("fr-FR", {day:"2-digit",month:"short"}) + " " + d.toLocaleTimeString("fr-FR", {hour:"2-digit",minute:"2-digit"}) + " (" + ago + ")";
      } catch(e) { return s.last_update; }
    })()}</div></div>
  `;
}

// ─── Filtres ───
function populateBreedFilter(classes) {
  const sel = document.getElementById("breedFilter");
  if (!sel) return;
  sel.innerHTML = '<option value="">Toutes les classes</option>' +
    (classes || []).map(c => `<option value="${c.breedName}">${c.breedName} (${c.count})</option>`).join("");
}

async function populateGuildFilter() {
  const data = await fetchJson("/api/guilds?min_members=2&limit=500");
  const sel = document.getElementById("guildFilter");
  if (!sel) return;
  sel.innerHTML = '<option value="">Toutes les guildes</option>' +
    (data.guilds || []).map(g => `<option value="${g.guild_name}">${g.guild_name} (${g.nb_members})</option>`).join("");
}

// ─── Init ───
async function init() {
  const stats = await fetchJson("/api/stats");
  setState({ stats, classes: stats.classes || [] });
  renderStats(stats);
  populateBreedFilter(stats.classes);
  loadClasses(stats.classes);
  populateCdnFilters();
  await populateGuildFilter();
  await loadPlayers();

  // SSE live updates
  connectSSE(async () => {
    const s = await fetchJson("/api/stats");
    setState({ stats: s, classes: s.classes || [] });
    renderStats(s);
    loadClasses(s.classes);
    const state = getState();
    if (state.currentTab === "classement") {
      if (state.currentSubtab === "players") loadPlayers();
      if (state.currentSubtab === "guilds") loadGuilds();
      if (state.currentSubtab === "recent") loadRecent(true);
    }
  });
}

// ─── Wire up DOM ───
document.addEventListener("DOMContentLoaded", () => {
  // Onglets principaux
  document.querySelectorAll(".tab").forEach(el => {
    el.addEventListener("click", () => switchTab(el.dataset.tab));
  });

  // Sous-onglets
  document.querySelectorAll(".subtab").forEach(el => {
    el.addEventListener("click", () => switchSubtab(el.dataset.subtab));
  });

  // Search
  const searchInput = document.getElementById("searchInput");
  if (searchInput) {
    const debouncedSearch = debounce(() => {
      updateFilters({ search: searchInput.value, offset: 0 });
      loadPlayers();
    }, 300);
    searchInput.addEventListener("input", debouncedSearch);
  }

  // Sort headers
  document.querySelectorAll("th[data-sort]").forEach(th => {
    th.addEventListener("click", () => {
      const s = getState().filters;
      const col = th.dataset.sort;
      const order = s.sort === col && s.order === "desc" ? "asc" : "desc";
      updateFilters({ sort: col, order, offset: 0 });
      loadPlayers();
    });
  });

  // Breed filter
  document.getElementById("breedFilter")?.addEventListener("change", (e) => {
    updateFilters({ breed: e.target.value, offset: 0 });
    loadPlayers();
  });

  // Guild filter
  document.getElementById("guildFilter")?.addEventListener("change", (e) => {
    updateFilters({ guild: e.target.value, offset: 0 });
    loadPlayers();
  });

  // Level range
  document.getElementById("minLevel")?.addEventListener("change", (e) => {
    updateFilters({ minLevel: parseInt(e.target.value) || 0, offset: 0 });
    loadPlayers();
  });
  document.getElementById("maxLevel")?.addEventListener("change", (e) => {
    updateFilters({ maxLevel: parseInt(e.target.value) || 245, offset: 0 });
    loadPlayers();
  });

  // CDN search + filters
  const cdnSearch = document.getElementById("cdnSearch");
  if (cdnSearch) {
    const debouncedCdn = debounce(() => loadCdn(true), 300);
    cdnSearch.addEventListener("input", debouncedCdn);
  }
  document.getElementById("cdnTypeFilter")?.addEventListener("change", () => loadCdn(true));
  document.getElementById("cdnRarityFilter")?.addEventListener("change", () => loadCdn(true));

  // Modal
  document.getElementById("modalOverlay")?.addEventListener("click", (e) => {
    if (e.target.id === "modalOverlay") closeModal();
  });
  document.querySelector(".modal-close")?.addEventListener("click", closeModal);

  // Reload
  document.getElementById("reloadBtn")?.addEventListener("click", async () => {
    const btn = document.getElementById("reloadBtn");
    btn.disabled = true;
    btn.textContent = "Rechargement...";
    await reloadData();
    const stats = await fetchJson("/api/stats");
    setState({ stats });
    renderStats(stats);
    loadPlayers();
    btn.disabled = false;
    btn.textContent = "Recharger";
  });

  window.__showPlayer = showPlayer;


  init();
});


// === LISTENER DELEGUE GLOBAL: tous les .clickable-player du site ===
// Place au top level, hors de tout callback, pour garantir l execution
document.addEventListener("click", function(e) {
  var el = e.target.closest(".clickable-player");
  if (!el) return;
  e.preventDefault();
  e.stopPropagation();
  var name = el.dataset.player || el.textContent.trim();
  if (name && name !== "-" && window.__showPlayer) {
    window.__showPlayer(name);
  }
});

// Vite HMR
if (import.meta.hot) {
  import.meta.hot.accept();
}


// === BUILDS SUB-TABS ===
let buildsLoaded = { equipment: false, optimizer: false, spells: false };

function initBuildsSubtabs() {
  document.querySelectorAll("[data-builds-sub]").forEach(btn => {
    btn.addEventListener("click", () => {
      const sub = btn.dataset.buildsSub;
      // Active tab
      document.querySelectorAll("[data-builds-sub]").forEach(b => b.classList.remove("active"));
      btn.classList.add("active");
      // Show content
      document.querySelectorAll("[data-builds-content]").forEach(el => el.style.display = "none");
      const content = document.querySelector('[data-builds-content="' + sub + '"]');
      if (content) content.style.display = "block";
      // Lazy load
      loadBuildsTab(sub);
    });
  });
}

async function loadBuildsTab(tab) {
  if (buildsLoaded[tab]) return;
  buildsLoaded[tab] = true;
  if (tab === "equipment") {
    await loadEquipment(document.getElementById("equipment-container"));
  } else if (tab === "optimizer") {
    await loadOptimizer(document.getElementById("optimizer-container"));
  } else if (tab === "spells") {
    await loadSpellsEditor(document.getElementById("spells-container"));
  }
}

// Charger equipment par defaut quand on ouvre Builds
const origSwitchTab = typeof switchTab === "function" ? switchTab : null;

// Init builds subtabs au chargement
if (document.readyState === 'loading') {
  document.addEventListener('DOMContentLoaded', () => { initBuildsSubtabs(); loadBuildsTab('equipment'); });
} else {
  initBuildsSubtabs(); loadBuildsTab('equipment');
}
