function rnd(v, wrap) {
  if (typeof v !== "number") return v;
  const display = Math.round(v);
  const precise = v.toFixed(2);
  if (wrap === false) return display;
  return '<span title="' + precise + '" style="cursor:help">' + display + '</span>';
}

// Modal - detail joueur
import { fetchJson } from "./api.js";
import { esc } from "./utils.js";
import { initTooltipDelegation } from "./tooltip.js";
import { getState, setState } from "./state.js";

function escAttr(s) { return (s||"").replace(/&/g,"&amp;").replace(/"/g,"&quot;").replace(/'/g,"&#39;").replace(/</g,"&lt;"); }

const RARITY_CLASSES = {0:"rarity-0",1:"rarity-1",2:"rarity-2",3:"rarity-3",4:"rarity-4",5:"rarity-5",6:"rarity-6",7:"rarity-7"};
const SLOT_ICON_MAP = {0:"casque",3:"epaulettes",4:"amulette",5:"plastron",7:"anneau",8:"anneau",10:"ceinture",12:"bottes",13:"cape",15:"arme",17:"accessoire",18:"secondemain",22:"familier",23:"monture",24:"monture"};
const SLOT_ORDER = {0:0,13:1,4:2,3:3,5:4,10:5,12:6,7:7,8:8,15:9,18:10,17:11,22:12,24:13};


export async function showPlayer(name, tranche, keepTab) {
  let url = `/api/players/${encodeURIComponent(name)}`;
  if (tranche !== null && tranche !== undefined) url += `?tranche=${tranche}`;
  const p = await fetchJson(url);
  if (p.error) return;

  const modal = getState().modal;
  const activeTab = keepTab ? modal.activeTab : "equip";
  setState({ modal: { open: true, playerName: name, tranche: tranche, activeTab } });

  const overlay = document.getElementById("modalOverlay");
  const header = document.querySelector(".modal-header h2");
  const body = document.getElementById("modalBody");
  if (!overlay || !body) return;

  header.textContent = `${p.name} — Niv.${p.level} ${p.breedName || ""}`;
  const tsHtml = (() => {
    if (!p.snapshot_timestamp) return "";
    let ts = p.snapshot_timestamp;
    try {
      const d = new Date(ts);
      if (!isNaN(d.getTime())) {
        const now = new Date();
        const diff = Math.floor((now - d) / 60000);
        let ago = "";
        if (diff < 60) ago = "il y a " + diff + " min";
        else if (diff < 1440) ago = "il y a " + Math.floor(diff / 60) + "h";
        else ago = "il y a " + Math.floor(diff / 1440) + "j";
        ts = d.toLocaleDateString("fr-FR", {day:"2-digit",month:"short",year:"numeric"}) + " a " + d.toLocaleTimeString("fr-FR", {hour:"2-digit",minute:"2-digit"});
        ago = " (" + ago + ")";
        return '<div style="text-align:right;font-size:11px;color:var(--text-muted);margin-bottom:8px;opacity:.7"><span style="margin-right:4px">\u{1F4C5}</span>' + ts + ago + '</div>';
      }
    } catch(e) {}
    return '<div style="text-align:right;font-size:11px;color:var(--text-muted);margin-bottom:8px;opacity:.7">' + ts + '</div>';
  })();

  // Tranches buttons
  const tranchesHtml = p.available_tranches?.length ? `
    <div class="tranche-tabs">
      <div class="tranche-btn ${p.viewing_tranche === null ? "active" : ""}" 
           data-tranche-player="${escAttr(p.name)}" data-tranche-val="null">Actuel (Niv.${p.level})</div>
      ${p.available_tranches.map(t => `
        <div class="tranche-btn ${p.viewing_tranche === t ? "active" : ""}"
             data-tranche-player="${escAttr(p.name)}" data-tranche-val="${t}">${t}-${t+14}</div>
      `).join("")}
    </div>` : "";

  // Stats cards
  const statsHtml = `<div class="player-stats">
    <div class="player-stat"><div class="ps-label">SCORE GLOBAL</div><div class="ps-value" style="color:var(--green)">${rnd(p.score_global)}</div></div>
    <div class="player-stat"><div class="ps-label">POIDS OFFENSIF</div><div class="ps-value" style="color:var(--accent)">${rnd(p.poids_offensif)}</div></div>
    <div class="player-stat"><div class="ps-label">POIDS DEFENSIF</div><div class="ps-value" style="color:var(--purple)">${rnd(p.poids_defensif)}</div></div>
    <div class="player-stat"><div class="ps-label">PV</div><div class="ps-value">${p.total_pv}</div></div>
    <div class="player-stat"><div class="ps-label">RESISTANCE</div><div class="ps-value">${p.total_res}</div></div>
    <div class="player-stat"><div class="ps-label">PA / PM / PO / PW</div><div class="ps-value"><span style="color:#4a9eff">${p.pa || 0}</span> / <span style="color:#4ade80">${p.pm || 0}</span> / <span style="color:#fff">${p.po || 0}</span> / <span style="color:#22d3ee">${p.pw || 0}</span></div></div>
    <div class="player-stat"><div class="ps-label">COUP CRITIQUE</div><div class="ps-value">+${p.coup_crit}%</div></div>
    <div class="player-stat"><div class="ps-label">TACLE / ESQUIVE</div><div class="ps-value">${p.tacle} / ${p.esquive}</div></div>
  </div>`;

  // Guild
  const guildHtml = p.guild_name ? `<div style="margin-bottom:12px"><span style="background:var(--surface2);border:1px solid var(--border);border-radius:6px;padding:6px 12px;font-size:13px"><b>GUILDE</b> ${esc(p.guild_name)}</span></div>` : "";

  // Equipment table
  const equipHtml = (p.equipment || []).slice().sort(function(a,b){return (SLOT_ORDER[a.slot]!==undefined?SLOT_ORDER[a.slot]:99)-(SLOT_ORDER[b.slot]!==undefined?SLOT_ORDER[b.slot]:99);}).map(e => {
    const rarCls = RARITY_CLASSES[e.rarity] || "";
    const iconUrl = e.gfx_id ? `/icons/items/${e.gfx_id}.png` : "";
    const iconImg = iconUrl ? `<img src="${iconUrl}" class="item-icon" onerror="this.style.display='none'" alt="">` : "";
    return `<tr data-item-id="${e.item_id}" style="cursor:pointer">
      <td style="white-space:nowrap"><img src="/icons/slots/${SLOT_ICON_MAP[e.slot] || 'accessoire'}.png?v=1774811227" style="width:20px;height:20px;vertical-align:middle;margin-right:4px" onerror="this.style.display='none'" alt="">${esc(e.slot_name || String(e.slot))}</td>
      <td>${iconImg}<span class="${rarCls}">${esc(e.name)}</span></td>
      <td class="num">${(e.slot === 22 || e.slot === 24) ? "" : (e.level || "")}</td>
      <td class="${rarCls}">${e.rarityName ? esc(e.rarityName) : ""}</td>
      <td class="num">${e.poids_off ? '<span style="color:' + (e.poids_off > 0 ? 'var(--green)' : 'var(--red, #f44)') + '">' + rnd(e.poids_off) + '</span>' : ""}</td>
      <td class="num">${e.pv ? '<span style="color:' + (e.pv > 0 ? 'var(--green)' : 'var(--red, #f44)') + '">' + rnd(e.pv) + '</span>' : ""}</td>
      <td class="num">${e.res ? '<span style="color:' + (e.res > 0 ? 'var(--green)' : 'var(--red, #f44)') + '">' + rnd(e.res) + '</span>' : ""}</td>
      <td class="num">${e.pa ? '<span style="color:' + (e.pa > 0 ? 'var(--green)' : 'var(--red, #f44)') + '">' + e.pa + '</span>' : ""}</td>
      <td class="num">${e.pm ? '<span style="color:' + (e.pm > 0 ? 'var(--green)' : 'var(--red, #f44)') + '">' + e.pm + '</span>' : ""}</td>
    </tr>`;
  }).join("");

  // Spells
  const spells = p.spells || {};
  const decks = spells.decks || [];
  const builds = spells.builds || [];
  const activeDeck = spells.active_deck || 0;
  const combatObserved = spells.combat_observed || [];

  const renderSpell = (s, cls) => {
    const gfxId = s.gfxId || s.gfx_id || 0;
    const name = s.name || "";
    const tooltip = name ? `${name} (ID: ${s.id})` : `Spell ID: ${s.id}`;
    return `<span class="spell-id ${cls}" title="${esc(tooltip)}"><img src="/icons/spells/${gfxId}.png" class="spell-icon" onerror="this.style.display='none'" alt="">${name || s.id}</span>`;
  };

  const renderSpellCombat = (s) => {
    const gfxId = s.gfxId || s.gfx_id || 0;
    const name = s.name || "";
    const tooltip = name ? `${name} (ID: ${s.id}) — vu en combat` : `Spell ID: ${s.id} — vu en combat`;
    return `<span class="spell-id" title="${esc(tooltip)}"><img src="/icons/spells/${gfxId}.png" class="spell-icon" onerror="this.style.display='none'" alt="">${name || s.id}</span>`;
  };

  let spellsHtml = "";
  if (decks.length) {
    spellsHtml = decks.map(deck => {
      const isActive = deck.index === activeDeck;
      const buildInfo = builds.find(b => b.index === deck.index);
      const deckName = buildInfo?.name || `Deck ${deck.index}`;
      const deckLevel = buildInfo?.level || "";
      return `<div class="spell-deck ${isActive ? "spell-deck-active" : ""}">
        <div class="spell-deck-header">
          <span class="spell-deck-name">${esc(deckName)}</span>
          ${deckLevel ? `<span class="spell-deck-level">Niv. ${deckLevel}</span>` : ""}
          ${isActive ? '<span class="spell-deck-badge">ACTIF</span>' : ""}
        </div>
        <div class="spell-section">
          <div class="spell-section-label">Sorts actifs</div>
          <div class="spell-list">${(deck.active_spells || []).map(s => renderSpell(s, "")).join("")}</div>
        </div>
        <div class="spell-section">
          <div class="spell-section-label">Passifs</div>
          <div class="spell-list">${(deck.passive_spells || []).map(s => renderSpell(s, "passive")).join("")}</div>
        </div>
      </div>`;
    }).join("");
  }

  if (combatObserved.length) {
    spellsHtml += `<div class="spell-deck">
      <div class="spell-deck-header"><span class="spell-deck-name">Sorts observes en combat</span></div>
      <div class="spell-list">${combatObserved.map(s => renderSpellCombat(s)).join("")}</div>
    </div>`;
  }

  // Modal tabs
  const tabsHtml = `<div class="modal-tabs">
    <div class="modal-tab ${activeTab === "equip" ? "active" : ""}" onclick="window.__switchModalTab('equip')">Equipement</div>
    <div class="modal-tab ${activeTab === "spells" ? "active" : ""}" onclick="window.__switchModalTab('spells')">Sorts</div>
  </div>`;

  body.innerHTML = tsHtml + tranchesHtml + statsHtml + guildHtml + tabsHtml + `
    <div id="modalEquip" style="${activeTab !== "equip" ? "display:none" : ""}">
      <h3 style="font-size:14px;margin:16px 0 8px">EQUIPEMENT (${(p.equipment||[]).length} pieces) — ${p.viewing_tranche != null && p.viewing_tranche !== undefined ? "Tranche " + p.viewing_tranche : "Niveau actuel"}</h3>
      <table class="equip-table">
        <thead><tr><th>SLOT</th><th>ITEM</th><th>NIV</th><th>RARETE</th><th>POIDS OFF</th><th>PV</th><th>RES</th><th>PA</th><th>PM</th></tr></thead>
        <tbody>${equipHtml}</tbody>
      </table>
    </div>
    <div id="modalSpells" style="${activeTab !== "spells" ? "display:none" : ""}">
      ${spellsHtml || '<p style="color:var(--text2);padding:20px">Aucune donnee de sorts disponible</p>'}
    </div>`;

  overlay.classList.add("active");
  initTooltipDelegation();

  // Delegation pour boutons tranche
  body.addEventListener("click", (e) => {
    const btn = e.target.closest("[data-tranche-player]");
    if (!btn) return;
    const playerName = btn.dataset.tranchePlayer;
    const val = btn.dataset.trancheVal;
    const trancheArg = val === "null" ? null : parseInt(val);
    window.__showPlayer(playerName, trancheArg, true);
  });
}

export function switchModalTab(tab) {
  setState({ modal: { ...getState().modal, activeTab: tab } });
  document.querySelectorAll(".modal-tab").forEach(el => el.classList.toggle("active", el.dataset.mtab === tab));
  const equipDiv = document.getElementById("modalEquip");
  const spellsDiv = document.getElementById("modalSpells");
  if (equipDiv) equipDiv.style.display = tab === "equip" ? "" : "none";
  if (spellsDiv) spellsDiv.style.display = tab === "spells" ? "" : "none";
}

export function closeModal() {
  setState({ modal: { open: false, playerName: null, tranche: null, activeTab: "equip" } });
  document.getElementById("modalOverlay")?.classList.remove("active");
}

// Expose
window.__showPlayer = showPlayer;
window.__switchModalTab = switchModalTab;
window.__closeModal = closeModal;
