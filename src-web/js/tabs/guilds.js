// Guilds tab - classement intelligent des guildes
import { fetchJson } from "../api.js";
import { esc } from "../utils.js";

let _guilds = [];
let _sortCol = "wilson_score";
let _sortAsc = false;

function wilsonScore(avg, n, globalAvg) {
  const k = 15;
  const shrunk = (n * avg + k * globalAvg) / (n + k);
  const sizeBonus = 1 + Math.log2(Math.max(n, 1)) * 0.03;
  return Math.round(shrunk * sizeBonus * 10) / 10;
}

function scoreTooltip(g, globalAvg) {
  const k = 15;
  const shrunk = (g.nb_members * g.avg_poids_offensif + k * globalAvg) / (g.nb_members + k);
  const bonus = (1 + Math.log2(Math.max(g.nb_members, 1)) * 0.03);
  return `Score de confiance\n` +
    `━━━━━━━━━━━━━━━━━━━\n` +
    `Moyenne brute: ${g.avg_poids_offensif}\n` +
    `Membres: ${g.nb_members}\n` +
    `━━━━━━━━━━━━━━━━━━━\n` +
    `Moyenne ajustee: ${Math.round(shrunk)}\n` +
    `(tire vers moy. serveur ${Math.round(globalAvg)})\n` +
    `Bonus taille (x${bonus.toFixed(2)})\n` +
    `━━━━━━━━━━━━━━━━━━━\n` +
    `= ${g.wilson_score}\n\n` +
    `Plus la guilde est grande et forte,\n` +
    `plus le score est fiable.`;
}

function computeRankings(guilds) {
  if (!guilds || !guilds.length) return { ranked: [], globalAvg: 0 };
  const globalAvg = guilds.reduce((s, g) => s + g.avg_poids_offensif, 0) / guilds.length;
  const ranked = guilds.map(g => ({
    ...g,
    wilson_score: wilsonScore(g.avg_poids_offensif, g.nb_members, globalAvg),
  }));
  return { ranked, globalAvg };
}

let _globalAvg = 0;

function sortGuilds(col) {
  if (_sortCol === col) {
    _sortAsc = !_sortAsc;
  } else {
    _sortCol = col;
    _sortAsc = false;
  }
  renderGuilds();
}

function getArrow(col) {
  if (_sortCol !== col) return "";
  return _sortAsc ? " \u25B2" : " \u25BC";
}

function renderGuilds() {
  const container = document.getElementById("guildsTableContainer");
  if (!container) return;

  const sorted = [..._guilds].sort((a, b) => {
    let va = a[_sortCol], vb = b[_sortCol];
    if (typeof va === "string") { va = va.toLowerCase(); vb = (vb || "").toLowerCase(); }
    if (va < vb) return _sortAsc ? -1 : 1;
    if (va > vb) return _sortAsc ? 1 : -1;
    return 0;
  });

  const cols = [
    { key: "guild_name", label: "GUILDE", align: "left" },
    { key: "nb_members", label: "MEMBRES", align: "center" },
    { key: "wilson_score", label: "SCORE", align: "right" },
    { key: "avg_poids_offensif", label: "MOY. OFF", align: "right" },
    { key: "avg_poids_defensif", label: "MOY. DEF", align: "right" },
    { key: "avg_level", label: "MOY. NIV", align: "right" },
    { key: "max_poids_offensif", label: "MAX OFF", align: "right" },
  ];

  const headers = '<div class="gt-row gt-header">' +
    '<span class="gt-cell gt-rank">#</span>' +
    cols.map(c => {
      const arrow = getArrow(c.key);
      const tip = c.key === "wilson_score" ? ' title="Score de confiance: penalise les petites guildes, recompense la taille + la force"' : "";
      return `<span class="gt-cell gt-${c.align}"${tip} data-sort="${c.key}">${c.label}${arrow}</span>`;
    }).join("") +
    '<span class="gt-cell gt-left">TOP JOUEUR</span>' +
    '</div>';

  const rows = sorted.map((g, i) => {
    const sizeClass = g.nb_members >= 10 ? "gt-large" : g.nb_members >= 5 ? "gt-medium" : "gt-small";
    // topClick supprime -> delegue via .clickable-player
    // topStyle supprime -> classe unifiee
    const scoreTip = scoreTooltip(g, _globalAvg).replace(/"/g, "&quot;");

    return `<div class="gt-row ${sizeClass}">` +
      `<span class="gt-cell gt-rank">${i + 1}</span>` +
      `<span class="gt-cell gt-left gt-name">${esc(g.guild_name)}</span>` +
      `<span class="gt-cell gt-center">${g.nb_members}</span>` +
      `<span class="gt-cell gt-right gt-score" title="${scoreTip}">${g.wilson_score}</span>` +
      `<span class="gt-cell gt-right">${g.avg_poids_offensif}</span>` +
      `<span class="gt-cell gt-right">${g.avg_poids_defensif}</span>` +
      `<span class="gt-cell gt-right">${g.avg_level}</span>` +
      `<span class="gt-cell gt-right">${g.max_poids_offensif}</span>` +
      `<span class="gt-cell gt-left${g.top_player ? ' clickable-player' : ''}" ${g.top_player ? 'data-player="' + esc(g.top_player) + '"' : ''}>${esc(g.top_player || "-")}</span>` +
      `</div>`;
  }).join("");

  container.innerHTML = headers + rows;

  // Bind tri
  container.querySelectorAll("[data-sort]").forEach(el => {
    el.style.cursor = "pointer";
    el.onclick = () => sortGuilds(el.dataset.sort);
  });

}

export async function loadGuilds() {
  const data = await fetchJson("/api/guilds?min_members=1&limit=500");
  const result = computeRankings(data.guilds || []);
  _guilds = result.ranked;
  _globalAvg = result.globalAvg;
  renderGuilds();
}
