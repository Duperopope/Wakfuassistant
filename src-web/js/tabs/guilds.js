// Guilds tab - classement des guildes
import { fetchJson } from "../api.js";
import { esc } from "../utils.js";

export async function loadGuilds() {
  const data = await fetchJson("/api/guilds?min_members=2&limit=200");
  renderGuildRows(data.guilds || []);
}

function renderGuildRows(guilds) {
  const tbody = document.getElementById("guildsTbody");
  if (!tbody) return;
  tbody.innerHTML = guilds.map((g, i) => `<tr>
    <td class="rank">${i + 1}</td>
    <td class="name-cell">${esc(g.guild_name)}</td>
    <td class="num">${g.nb_members}</td>
    <td class="num high">${g.avg_poids_offensif}</td>
    <td class="num">${g.avg_poids_defensif}</td>
    <td class="num">${g.avg_level}</td>
    <td class="num">${g.max_poids_offensif}</td>
    <td>${esc(g.top_player)}</td>
  </tr>`).join("");
}
