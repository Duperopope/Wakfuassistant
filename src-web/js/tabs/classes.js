// Classes tab - stats par classe avec graphiques
import { fetchJson } from "../api.js";
import { esc } from "../utils.js";

let _classes = [];
let _sortCol = "count";
let _sortAsc = false;

// Couleurs par classe (palette Wakfu)
const BREED_COLORS = {
  "Sram": "#8B5CF6", "Cra": "#F59E0B", "Ecaflip": "#10B981", "Iop": "#EF4444",
  "Ouginak": "#F97316", "Steamer": "#6366F1", "Sacrieur": "#DC2626", "Eniripsa": "#EC4899",
  "Osamodas": "#14B8A6", "Eliotrope": "#7C3AED", "Huppermage": "#3B82F6", "Sadida": "#22C55E",
  "Pandawa": "#A855F7", "Xelor": "#0EA5E9", "Roublard": "#84CC16", "Zobal": "#E11D48",
  "Enutrof": "#EAB308", "Feca": "#06B6D4",
};

function getColor(breed) {
  return BREED_COLORS[breed] || "#888";
}

// Donut chart SVG - repartition des classes
function renderDonut(classes, containerId) {
  const el = document.getElementById(containerId);
  if (!el) return;
  
  const total = classes.reduce((s, c) => s + c.count, 0);
  if (!total) return;
  
  const size = 220;
  const cx = size / 2, cy = size / 2;
  const outerR = 95, innerR = 55;
  
  let paths = "";
  let labels = "";
  let angle = -90;
  
  classes.forEach((c, i) => {
    const pct = c.count / total;
    const sweep = pct * 360;
    const startAngle = angle * Math.PI / 180;
    const endAngle = (angle + sweep) * Math.PI / 180;
    
    const x1o = cx + outerR * Math.cos(startAngle);
    const y1o = cy + outerR * Math.sin(startAngle);
    const x2o = cx + outerR * Math.cos(endAngle);
    const y2o = cy + outerR * Math.sin(endAngle);
    const x1i = cx + innerR * Math.cos(endAngle);
    const y1i = cy + innerR * Math.sin(endAngle);
    const x2i = cx + innerR * Math.cos(startAngle);
    const y2i = cy + innerR * Math.sin(startAngle);
    
    const large = sweep > 180 ? 1 : 0;
    const color = getColor(c.breedName);
    
    paths += `<path d="M${x1o},${y1o} A${outerR},${outerR} 0 ${large} 1 ${x2o},${y2o} L${x1i},${y1i} A${innerR},${innerR} 0 ${large} 0 ${x2i},${y2i} Z" fill="${color}" opacity="0.85" stroke="var(--bg)" stroke-width="2">
      <title>${c.breedName}: ${c.count} joueurs (${(pct*100).toFixed(1)}%)</title>
    </path>`;
    
    angle += sweep;
  });
  
  // Centre: total
  const center = `<text x="${cx}" y="${cy-8}" text-anchor="middle" fill="var(--text)" font-size="24" font-weight="700">${total}</text>
    <text x="${cx}" y="${cy+12}" text-anchor="middle" fill="var(--text-muted)" font-size="11">joueurs</text>`;
  
  el.innerHTML = `<svg width="${size}" height="${size}" viewBox="0 0 ${size} ${size}">${paths}${center}</svg>`;
}

// Legende avec barres horizontales
function renderLegend(classes, containerId) {
  const el = document.getElementById(containerId);
  if (!el) return;
  
  const total = classes.reduce((s, c) => s + c.count, 0);
  const maxCount = Math.max(...classes.map(c => c.count));
  
  el.innerHTML = classes.map(c => {
    const color = getColor(c.breedName);
    const pct = ((c.count / total) * 100).toFixed(1);
    const barW = Math.round((c.count / maxCount) * 100);
    return `<div class="legend-row">
      <span class="legend-dot" style="background:${color}"></span>
      <span class="legend-breed">${c.breedName}</span>
      <span class="legend-bar-bg"><span class="legend-bar" style="width:${barW}%;background:${color}"></span></span>
      <span class="legend-count">${c.count}</span>
      <span class="legend-pct">${pct}%</span>
    </div>`;
  }).join("");
}

// Bar chart horizontal - niveau moyen par classe
function renderLevelChart(classes, containerId) {
  const el = document.getElementById(containerId);
  if (!el) return;
  
  const sorted = [...classes].sort((a, b) => b.avg_level - a.avg_level);
  const maxLvl = Math.max(...sorted.map(c => c.avg_level), 1);
  
  el.innerHTML = `<div class="level-chart-title">Niveau moyen par classe</div>` +
    sorted.map(c => {
      const color = getColor(c.breedName);
      const barW = Math.round((c.avg_level / 245) * 100);
      return `<div class="lc-row">
        <span class="lc-breed">${c.breedName}</span>
        <span class="lc-bar-bg"><span class="lc-bar" style="width:${barW}%;background:${color}"></span></span>
        <span class="lc-value">${c.avg_level}</span>
      </div>`;
    }).join("");
}

// Bar chart - force moyenne (moy off) par classe
function renderOffChart(classes, containerId) {
  const el = document.getElementById(containerId);
  if (!el) return;
  
  const sorted = [...classes].sort((a, b) => b.avg_poids_offensif - a.avg_poids_offensif);
  const maxOff = Math.max(...sorted.map(c => c.avg_poids_offensif), 1);
  
  el.innerHTML = `<div class="level-chart-title">Puissance offensive moyenne</div>` +
    sorted.map(c => {
      const color = getColor(c.breedName);
      const barW = Math.round((c.avg_poids_offensif / maxOff) * 100);
      return `<div class="lc-row">
        <span class="lc-breed">${c.breedName}</span>
        <span class="lc-bar-bg"><span class="lc-bar" style="width:${barW}%;background:${color}"></span></span>
        <span class="lc-value">${c.avg_poids_offensif}</span>
      </div>`;
    }).join("");
}

function sortClasses(col) {
  if (_sortCol === col) _sortAsc = !_sortAsc;
  else { _sortCol = col; _sortAsc = false; }
  renderTable();
}

function getArrow(col) {
  if (_sortCol !== col) return "";
  return _sortAsc ? " \u25B2" : " \u25BC";
}

function renderTable() {
  const tbody = document.getElementById("classesTbody");
  if (!tbody) return;

  const sorted = [..._classes].sort((a, b) => {
    let va = a[_sortCol], vb = b[_sortCol];
    if (typeof va === "string") { va = va.toLowerCase(); vb = (vb || "").toLowerCase(); }
    if (va < vb) return _sortAsc ? -1 : 1;
    if (va > vb) return _sortAsc ? 1 : -1;
    return 0;
  });

  tbody.innerHTML = sorted.map((c, i) => {
    const topClick = c.top_player ? ` style="cursor:pointer;color:var(--accent)" onclick="window.__showPlayer('${esc(c.top_player)}')"` : "";
    return `<tr>
      <td class="rank">${i + 1}</td>
      <td><span class="breed-badge" style="border-left:3px solid ${getColor(c.breedName)};padding-left:8px">${esc(c.breedName)}</span></td>
      <td class="num">${c.count}</td>
      <td class="num high">${c.avg_poids_offensif}</td>
      <td class="num">${c.avg_level}</td>
      <td class="num">${c.max_poids_offensif}</td>
      <td${topClick}>${esc(c.top_player || "-")}</td>
    </tr>`;
  }).join("");
}

export function loadClasses(classes) {
  if (!classes || !classes.length) {
    fetchJson("/api/stats").then(stats => {
      _classes = stats.classes || [];
      renderAll();
    });
    return;
  }
  _classes = classes;
  renderAll();
}

function renderAll() {
  renderDonut(_classes, "classesDonut");
  renderLegend(_classes, "classesLegend");
  renderLevelChart(_classes, "classesLevelChart");
  renderOffChart(_classes, "classesOffChart");
  renderTable();
  
  // Bind tri headers
  document.querySelectorAll("#classesTable th[data-sort]").forEach(th => {
    th.style.cursor = "pointer";
    th.onclick = () => sortClasses(th.dataset.sort);
  });
}
