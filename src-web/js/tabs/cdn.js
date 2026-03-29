// CDN Items tab - catalogue complet des items Wakfu
import { fetchJson } from "../api.js";
import { esc } from "../utils.js";

let cdnOffset = 0;
const CDN_LIMIT = 50;

export async function loadCdn(reset) {
  if (reset) cdnOffset = 0;

  const search = document.getElementById("cdnSearch")?.value || "";
  const typeId = document.getElementById("cdnTypeFilter")?.value || "";
  const rarity = document.getElementById("cdnRarityFilter")?.value || "";

  let url = `/api/cdn?limit=${CDN_LIMIT}&offset=${cdnOffset}`;
  if (search) url += `&q=${encodeURIComponent(search)}`;
  if (typeId) url += `&type_id=${typeId}`;
  if (rarity) url += `&rarity=${rarity}`;

  const data = await fetchJson(url);
  renderCdnRows(data.items || []);
  renderCdnPagination(data.total || 0);
}

function renderCdnRows(items) {
  const tbody = document.getElementById("cdnTbody");
  if (!tbody) return;
  tbody.innerHTML = items.map(item => {
    const iconUrl = item.iconUrl || "";
    const iconImg = iconUrl ? `<img src="${iconUrl}" class="item-icon" onerror="this.style.display='none'" alt="">` : "";
    return `<tr>
      <td>${iconImg}</td>
      <td><span class="rarity-${item.rarity}" style="font-weight:600">${esc(item.name_fr)}</span></td>
      <td class="num">${item.level}</td>
      <td>${esc(item.typeName)}</td>
      <td><span style="color:${item.rarityColor}">${esc(item.rarityName)}</span></td>
      <td class="num" style="color:var(--text2);font-size:11px">${item.id}</td>
    </tr>`;
  }).join("");
}

function renderCdnPagination(total) {
  const div = document.getElementById("cdnPagination");
  if (!div) return;
  const page = Math.floor(cdnOffset / CDN_LIMIT) + 1;
  const totalPages = Math.ceil(total / CDN_LIMIT);
  div.innerHTML = `
    <button ${cdnOffset <= 0 ? "disabled" : ""} onclick="window.__cdnPage(${cdnOffset - CDN_LIMIT})">Precedent</button>
    <span>Page ${page} / ${totalPages} (${total} items)</span>
    <button ${cdnOffset + CDN_LIMIT >= total ? "disabled" : ""} onclick="window.__cdnPage(${cdnOffset + CDN_LIMIT})">Suivant</button>
  `;
}

export function populateCdnFilters() {
  const types = [
    [103,"Anneau"],[108,"Baguette"],[110,"Epee"],[112,"Dague"],[113,"Baton"],
    [114,"Marteau"],[117,"Arc"],[119,"Bouclier"],[120,"Amulette"],[132,"Bottes"],
    [133,"Ceinture"],[134,"Casque"],[136,"Plastron"],[138,"Cape"],[189,"Epaulettes"],
    [480,"Embleme"],[520,"Familier"],[537,"Monture"],[812,"Sublimation"],
  ];
  const rarities = [
    [0,"Commun"],[1,"Inhabituel"],[2,"Rare"],[3,"Mythique"],
    [4,"Legendaire"],[5,"Relique"],[6,"Souvenir"],[7,"Epique"],
  ];

  const typeSel = document.getElementById("cdnTypeFilter");
  if (typeSel) {
    typeSel.innerHTML = '<option value="">Tous les types</option>' +
      types.map(([id, name]) => `<option value="${id}">${name}</option>`).join("");
  }

  const rarSel = document.getElementById("cdnRarityFilter");
  if (rarSel) {
    rarSel.innerHTML = '<option value="">Toutes les raretes</option>' +
      rarities.map(([id, name]) => `<option value="${id}">${name}</option>`).join("");
  }
}

window.__cdnPage = (offset) => {
  cdnOffset = Math.max(0, offset);
  loadCdn(false);
};
