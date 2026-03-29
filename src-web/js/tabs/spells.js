// Spells Editor - edition des sorts et export JSON
export async function loadSpellsEditor(container) {
  container.innerHTML = `
    <div style="text-align:center;padding:40px">
      <h2 style="color:var(--accent-purple)">Spells Editor</h2>
      <p style="color:var(--text-muted)">Editeur de sorts Sram - chargement depuis l\u2019API</p>
      <div id="spells-container"></div>
      <div id="spells-status" style="margin-top:10px;color:var(--text-muted);font-size:.8rem">Chargement...</div>
    </div>
  `;

  try {
    const spells = await fetch("/api/build/spells").then(r => r.ok ? r.json() : []);
    const status = document.getElementById("spells-status");
    const spellsEl = document.getElementById("spells-container");

    if (!spells.length) {
      status.textContent = "Aucun sort trouve.";
      return;
    }

    // Grouper par element
    const groups = {};
    for (const sp of spells) {
      const elem = sp.element || "Neutre";
      if (!groups[elem]) groups[elem] = [];
      groups[elem].push(sp);
    }

    let h = '<div style="text-align:left;max-width:1200px;margin:0 auto">';
    for (const [elem, list] of Object.entries(groups)) {
      h += '<div class="eq-card" style="margin-bottom:12px">';
      h += '<div class="eq-card-title">' + elem + ' (' + list.length + ' sorts)</div>';
      h += '<table class="spell-table"><thead><tr><th>Sort</th><th>PA</th><th>PW</th><th>Base Min</th><th>Base Max</th><th>CC</th><th>Portee</th><th>AoE</th></tr></thead><tbody>';
      for (const sp of list) {
        h += '<tr>';
        h += '<td><strong>' + (sp.name || sp.id) + '</strong></td>';
        h += '<td>' + (sp.ap || 0) + '</td>';
        h += '<td>' + (sp.wp || 0) + '</td>';
        h += '<td>' + (sp.baseMin || 0) + '</td>';
        h += '<td>' + (sp.baseMax || 0) + '</td>';
        h += '<td>' + (sp.critBonus || 0) + '%</td>';
        h += '<td>' + (sp.rangeMin || 0) + '-' + (sp.rangeMax || 0) + '</td>';
        h += '<td>' + (sp.aoe || "-") + '</td>';
        h += '</tr>';
      }
      h += '</tbody></table></div>';
    }
    h += '</div>';
    spellsEl.innerHTML = h;
    status.textContent = spells.length + " sorts charges.";
  } catch (err) {
    document.getElementById("spells-status").innerHTML = '<span style="color:var(--accent-red)">Erreur: ' + err.message + '</span>';
  }
}
