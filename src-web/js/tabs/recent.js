import { fetchJson } from "../api.js";

let _loaded = false;
let _currentTab = "new";

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

function renderList(players, containerId, isNew) {
  const el = document.getElementById(containerId);
  if (!el) return;

  if (!players || players.length === 0) {
    el.innerHTML = '<div style="text-align:center;color:var(--text-muted);padding:40px">Aucun joueur</div>';
    return;
  }

  const header = '<div class="recent-row recent-header">' +
    '<span class="rc-time">QUAND</span>' +
    '<span class="rc-name">NOM</span>' +
    '<span class="rc-level">NIV</span>' +
    '<span class="rc-class">CLASSE</span>' +
    '<span class="rc-guild">GUILDE</span>' +
    '<span class="rc-score">SCORE</span>' +
    '<span class="rc-off">OFF</span>' +
    '</div>';

  const rows = players.map(p => {
    const ago = formatAgo(isNew ? p.first_seen : p.detected_at);
    const scoreColor = p.score_global > 0 ? "var(--green)" : "var(--text-muted)";
    const offColor = p.poids_offensif > 0 ? "var(--accent)" : "var(--text-muted)";
    const nameClick = p.rank > 0 ? ' style="cursor:pointer;text-decoration:underline" onclick="window.__showPlayer(\u0027' + p.name.replace(/'/g, "\\'") + '\u0027)"' : "";

    return '<div class="recent-row">' +
      '<span class="rc-time" title="' + (isNew ? p.first_seen : p.detected_at) + '">' + ago + '</span>' +
      '<span class="rc-name"' + nameClick + '>' + p.name + '</span>' +
      '<span class="rc-level">' + p.level + '</span>' +
      '<span class="rc-class"><span class="breed-badge">' + p.breedName + '</span></span>' +
      '<span class="rc-guild">' + (p.guild_name || "-") + '</span>' +
      '<span class="rc-score" style="color:' + scoreColor + '">' + (p.score_global || "-") + '</span>' +
      '<span class="rc-off" style="color:' + offColor + '">' + (p.poids_offensif || "-") + '</span>' +
      '</div>';
  }).join("");

  el.innerHTML = header + rows;
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
}

export async function loadRecent(force) {
  if (_loaded && !force) return;

  const data = await fetchJson("/api/recent?limit=50");
  if (!data) return;

  renderList(data.new_players, "recentNewList", true);
  renderList(data.updated_players, "recentUpdatedList", false);

  // Bind sous-onglets
  document.querySelectorAll(".recent-btn").forEach(b => {
    b.onclick = () => switchRecentTab(b.dataset.recent);
  });

  _loaded = true;
}
