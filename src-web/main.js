// Main entry - Wakfu Command Center
// Tabs: Classement / Personnage / HDV Market
import "./css/app.css";
import { fetchJson, reloadData } from "./js/api.js";
import { connectSSE, on as onSSE } from "./js/shared/events.js";
import { getState, setState, updateFilters, subscribe } from "./js/state.js";
import { debounce } from "./js/utils.js";
import { loadPlayers } from "./js/tabs/players.js";
import { loadGuilds } from "./js/tabs/guilds.js";
import { loadClasses } from "./js/tabs/classes.js";
import { loadInventory } from "./js/tabs/inventory.js";
import { loadRecent } from "./js/tabs/recent.js";
import { loadCharacter } from "./js/tabs/character.js";
import { showPlayer, closeModal } from "./js/modal.js";
import { loadEquipment } from "./js/tabs/equipment.js";
import { loadOptimizer } from "./js/tabs/optimizer.js";
import { loadSpellsEditor } from "./js/tabs/spells.js";
import { loadHdv, refreshHdv } from "./js/tabs/hdv.js";
import { initTooltipDelegation } from "./js/tooltip.js";

// ─── State pour sous-onglets Personnage ───
let persoLoaded = { fiche: false, builder: false, optimizer: false, spells: false };
let currentPersoSub = "fiche";

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
  if (tab === "hdv") {
    loadHdv();
  }
  if (tab === "cdn") {
    switchPersoSub(currentPersoSub);
  }
}

// ─── Sous-onglets Classement ───
function switchSubtab(sub) {
  setState({ currentSubtab: sub });
  document.querySelectorAll(".subtab:not([data-perso-sub])").forEach(el =>
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

// ─── Sous-onglets Personnage ───
function switchPersoSub(sub) {
  currentPersoSub = sub;
  // Toggle active class
  document.querySelectorAll("[data-perso-sub]").forEach(el =>
    el.classList.toggle("active", el.dataset.persoSub === sub)
  );
  // Toggle panels
  document.querySelectorAll("[data-perso-content]").forEach(el =>
    el.style.display = el.dataset.persoContent === sub ? "" : "none"
  );
  // Lazy load
  if (sub === "fiche") {
    loadCharacter();
  } else if (!persoLoaded[sub]) {
    persoLoaded[sub] = true;
    if (sub === "builder") loadEquipment(document.getElementById("equipment-container"));
    if (sub === "optimizer") loadOptimizer(document.getElementById("optimizer-container"));
    if (sub === "spells") loadSpellsEditor(document.getElementById("spells-container"));
  }
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
  initTooltipDelegation();
  const stats = await fetchJson("/api/stats");
  setState({ stats, classes: stats.classes || [] });
  renderStats(stats);
  populateBreedFilter(stats.classes);
  loadClasses(stats.classes);
  await populateGuildFilter();
  await loadPlayers();

  // SSE live updates (unifie)
  connectSSE();

  // ── Helpers SSE ──────────────────────────────────────────────────
  function _refreshBuilderIfVisible() {
    if (getState().currentTab === "cdn" && currentPersoSub === "builder") {
      loadEquipment(document.getElementById("equipment-container"));
    }
  }

  // Classement: joueurs mis a jour
  onSSE("update", async () => {
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
    // Un nouveau joueur vu = possible mise à jour de l'équipement actif
    _refreshBuilderIfVisible();
  });

  // HDV: nouvelles offres detectees
  onSSE("hdv", () => {
    const state = getState();
    if (state.currentTab === "hdv") refreshHdv();
    // Le builder affiche les prix HDV → rafraîchir si visible
    _refreshBuilderIfVisible();
  });

  // Coffre ou inventaire mis a jour
  onSSE("chest", () => {
    const state = getState();
    if (state.currentTab === "hdv") refreshHdv();
    if (state.currentTab === "cdn") {
      persoLoaded.fiche = false;
      if (currentPersoSub === "fiche") loadCharacter();
      _refreshBuilderIfVisible();
    }
  });

  onSSE("inventory", () => {
    const state = getState();
    if (state.currentTab === "hdv") refreshHdv();
    if (state.currentTab === "cdn") {
      persoLoaded.fiche = false;
      if (currentPersoSub === "fiche") loadCharacter();
      _refreshBuilderIfVisible();
    }
  });

  // Reload manuel
  onSSE("reload", async () => {
    const s = await fetchJson("/api/stats");
    setState({ stats: s, classes: s.classes || [] });
    renderStats(s);
    loadClasses(s.classes);
  });
}

// ─── Wire up DOM ───
document.addEventListener("DOMContentLoaded", () => {
  // Onglets principaux
  document.querySelectorAll(".tab").forEach(el => {
    el.addEventListener("click", () => switchTab(el.dataset.tab));
  });

  // Sous-onglets Classement
  document.querySelectorAll(".subtab:not([data-perso-sub])").forEach(el => {
    el.addEventListener("click", () => switchSubtab(el.dataset.subtab));
  });

  // Sous-onglets Personnage
  document.querySelectorAll("[data-perso-sub]").forEach(el => {
    el.addEventListener("click", () => switchPersoSub(el.dataset.persoSub));
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

// === LISTENER DELEGUE GLOBAL: .clickable-player ===
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

