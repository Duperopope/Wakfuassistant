function rnd(v, wrap) {
  if (typeof v !== "number") return v;
  const display = Math.round(v);
  const precise = v.toFixed(2);
  if (wrap === false) return display;
  return '<span title="' + precise + '" style="cursor:help">' + display + '</span>';
}

// Players tab - classement des joueurs
import { fetchJson } from "../api.js";
import { getState, updateFilters, setState } from "../state.js";
import { esc } from "../utils.js";

export async function loadPlayers() {
  const s = getState();
  const f = s.filters;
  let url = `/api/players?sort=${f.sort}&order=${f.order}&limit=${f.limit}&offset=${f.offset}&min_level=${f.minLevel}&max_level=${f.maxLevel}`;
  if (f.breed) url += `&breed=${encodeURIComponent(f.breed)}`;
  if (f.guild) url += `&guild=${encodeURIComponent(f.guild)}`;

  if (f.search && f.search.length >= 2) {
    const searchData = await fetchJson(`/api/search?q=${encodeURIComponent(f.search)}`);
    renderPlayerRows(searchData.players || [], 0);
    renderPagination(searchData.players?.length || 0, 0, f.limit);
    return;
  }

  const data = await fetchJson(url);
  setState({ players: data.players || [] });
  renderPlayerRows(data.players || [], f.offset);
  renderPagination(data.total || 0, f.offset, f.limit);
}

export function renderPlayerRows(players, startOffset) {
  const tbody = document.getElementById("playersTbody");
  if (!tbody) return;
  tbody.innerHTML = players.map((p, i) => {
    const rank = p.rank || startOffset + i + 1;
    const iconUrl = p.gfx_id ? `/icons/items/${p.gfx_id}.png` : "";
    return `<tr>
      <td class="rank">${rank}</td>
      <td class="name-cell" onclick="window.__showPlayer('${esc(p.name)}')">${esc(p.name)}</td>
      <td>${p.level}</td>
      <td><span class="breed-badge">${esc(p.breedName)}</span></td>
      <td class="guild-cell">${esc(p.guild_name)}</td>
      <td class="num high">${rnd(p.score_global)}</td>
      <td class="num">${rnd(p.poids_offensif)}</td>
      <td class="num">${rnd(p.poids_defensif)}</td>
      <td class="num">${p.total_pv}</td>
      <td class="num">${p.total_res}</td>
      <td class="num">${p.pa}</td>
      <td class="num">${p.pm}</td>
    </tr>`;
  }).join("");
}

function renderPagination(total, offset, limit) {
  const div = document.getElementById("playersPagination");
  if (!div) return;
  const page = Math.floor(offset / limit) + 1;
  const totalPages = Math.ceil(total / limit);
  div.innerHTML = `
    <button ${offset <= 0 ? "disabled" : ""} onclick="window.__goPage(${offset - limit})">Precedent</button>
    <span>Page ${page} / ${totalPages} (${total} joueurs)</span>
    <button ${offset + limit >= total ? "disabled" : ""} onclick="window.__goPage(${offset + limit})">Suivant</button>
  `;
}

// Expose pour onclick inline (sera remplace par events plus tard)
window.__goPage = (newOffset) => {
  updateFilters({ offset: Math.max(0, newOffset) });
  loadPlayers();
};
