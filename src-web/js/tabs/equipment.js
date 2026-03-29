// Equipment Viewer - affiche le build-result.json
import { fetchJson } from "../api.js";

const SLOT_ICONS = {
  "FIRST_WEAPON": "\u2694\uFE0F", "SECOND_WEAPON": "\uD83D\uDEE1\uFE0F",
  "HEAD": "\uD83E\uDDE2", "CHEST": "\uD83D\uDC54", "BACK": "\uD83E\uDDE3",
  "BELT": "\uD83E\uDD4B", "LEGS": "\uD83D\uDC56", "NECK": "\uD83D\uDCFF",
  "LEFT_HAND": "\uD83D\uDC8D", "RIGHT_HAND": "\uD83D\uDC8E",
  "ACCESSORY": "\u2728", "PET": "\uD83D\uDC3E", "MOUNT": "\uD83D\uDC0E",
  "COSTUME": "\uD83C\uDFAD", "EMBLEM": "\uD83C\uDFC5", "SUBLIMATION": "\uD83D\uDD2E"
};

function fmt(n) {
  if (typeof n !== "number") return n;
  return n >= 1000 ? n.toLocaleString("fr-FR") : String(n);
}

function statBox(label, val, detail) {
  let h = '<div class="stat-item"><div class="sl">' + label + '</div><div class="sv">' + val + '</div>';
  if (detail) h += '<div style="font-size:.65rem;color:var(--text-muted)">' + detail + '</div>';
  return h + '</div>';
}

export async function loadEquipment(container) {
  if (!container) return;
  container.innerHTML = '<p style="text-align:center;color:var(--text-muted)">Chargement du build...</p>';

  try {
    const d = await fetchJson("/api/build");
    if (!d || !d.items) {
      container.innerHTML = '<p style="text-align:center;color:var(--accent-red)">Aucun build-result.json trouve. Lance l\u2019optimiseur d\u2019abord.</p>';
      return;
    }
    renderEquipment(container, d);
  } catch (err) {
    container.innerHTML = '<p style="text-align:center;color:var(--accent-red)">Erreur: ' + err.message + '</p>';
  }
}

function renderEquipment(el, d) {
  let h = '';

  // Stats banner
  h += '<div class="stats-banner">';
  if (d.score) {
    h += statBox("SCORE", fmt(d.score.total), "ench " + fmt(d.score.enchant || 0));
    h += statBox("DPT", fmt(d.score.dpt || 0), "");
  }
  if (d.stats) {
    const s = d.stats;
    h += statBox("MAITRISE", fmt(s.mastery || 0), "");
    h += statBox("RESISTANCE", fmt(s.resistance || 0), "");
    h += statBox("PV", fmt(s.hp || 0), "");
    h += statBox("CC", (s.crit || 0) + "%", "");
    h += statBox("PARADE", (s.block || 0) + "%", "");
    h += statBox("PA", s.ap || 0, "");
    h += statBox("PM", s.mp || 0, "");
    h += statBox("PW", s.wp || 0, "");
  }
  h += '</div>';

  // Grid d items
  h += '<div class="eq-grid">';

  // Equipement
  h += '<div class="eq-card"><div class="eq-card-title">Equipement (' + d.items.length + ' pieces)</div>';
  h += '<table class="spell-table"><thead><tr><th></th><th>Item</th><th>Lvl</th><th>Stats</th></tr></thead><tbody>';
  for (const it of d.items) {
    const iconUrl = it.gfxId ? "/icons/items/" + it.gfxId + ".png" : "";
    const icon = iconUrl ? '<img src="' + iconUrl + '" style="width:32px;height:32px;border-radius:4px" onerror="this.style.display=\u0027none\u0027">' : "";
    const slotIcon = SLOT_ICONS[it.slot] || "\uD83D\uDCE6";

    h += '<tr>';
    h += '<td class="slot-icon">' + slotIcon + '</td>';
    h += '<td>';
    if (icon) h += icon + ' ';
    h += '<strong>' + (it.name || "ID " + it.id) + '</strong>';
    if (it.rarity) h += ' <span class="item-tag tag-' + it.rarity + '">' + it.rarity + '</span>';
    if (it.sublimation && it.sublimation !== "-") h += ' <span class="item-tag tag-sub">' + it.sublimation + '</span>';
    h += '</td>';
    h += '<td>' + (it.level || "?") + '</td>';
    h += '<td style="font-size:.75rem;color:var(--text-muted)">' + (it.statsText || "") + '</td>';
    h += '</tr>';
  }
  h += '</tbody></table></div>';

  // Budget
  if (d.budget) {
    h += '<div class="eq-card"><div class="eq-card-title">Budget</div>';
    h += '<table class="spell-table"><tbody>';
    for (const [k, v] of Object.entries(d.budget)) {
      h += '<tr><td>' + k + '</td><td class="sv">' + fmt(v) + '</td></tr>';
    }
    h += '</tbody></table></div>';
  }

  // Diagnostic CC
  if (d.crit_diagnostic) {
    h += '<div class="eq-card"><div class="eq-card-title">Diagnostic CC</div>';
    h += '<pre style="font-size:.75rem;color:var(--text-muted);white-space:pre-wrap">' + JSON.stringify(d.crit_diagnostic, null, 2) + '</pre></div>';
  }

  // Sublimations
  if (d.sublimations && d.sublimations.length > 0) {
    h += '<div class="eq-card"><div class="eq-card-title">Sublimations (' + d.sublimations.length + ')</div>';
    h += '<table class="spell-table"><tbody>';
    for (const sub of d.sublimations) {
      h += '<tr><td><strong>' + sub.name + '</strong></td><td style="font-size:.75rem">' + (sub.effect || "") + '</td></tr>';
    }
    h += '</tbody></table></div>';
  }

  h += '</div>'; // eq-grid
  el.innerHTML = h;
}
