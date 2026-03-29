// Build Optimizer - genere et affiche les top builds
// import differe - engine charge a la demande

let optimizerData = null;

export async function loadOptimizer(container) {
  container.innerHTML = `
    <div style="text-align:center;padding:40px">
      <h2 style="color:var(--accent-purple)">Build Optimizer</h2>
      <p style="color:var(--text-muted)">Moteur de calcul DPT multi-tours pour Sram</p>
      <div style="margin:20px auto;max-width:500px;text-align:left">
        <div style="margin-bottom:12px">
          <label style="color:var(--text-muted);font-size:.8rem">Mode de calcul:</label><br>
          <select id="opt-mode" style="width:100%;padding:8px;background:var(--bg-card);border:1px solid var(--border-color);color:var(--text-primary);border-radius:6px">
            <option value="normal">Normal (sans Sac a Patate)</option>
            <option value="sac">Avec Sac a Patate</option>
          </select>
        </div>
        <div style="margin-bottom:12px">
          <label style="color:var(--text-muted);font-size:.8rem">Top N resultats:</label><br>
          <input id="opt-topn" type="number" value="5" min="1" max="20" style="width:100%;padding:8px;background:var(--bg-card);border:1px solid var(--border-color);color:var(--text-primary);border-radius:6px">
        </div>
        <button id="opt-run" style="width:100%;padding:12px;background:var(--accent-purple);color:#fff;border:none;border-radius:8px;font-weight:700;cursor:pointer;font-size:1rem">
          Lancer l\u2019optimisation
        </button>
      </div>
      <div id="opt-results" style="margin-top:20px"></div>
      <div id="opt-status" style="margin-top:10px;color:var(--text-muted);font-size:.8rem"></div>
    </div>
  `;

  // Charger les donnees
  try {
    const [spells, passives, subs, baseStats, formulas] = await Promise.all([
      fetch("/api/build/spells").then(r => r.ok ? r.json() : []),
      fetch("/api/build/passives").then(r => r.ok ? r.json() : []),
      fetch("/api/build/sublimations").then(r => r.ok ? r.json() : []),
      fetch("/api/build/base-stats").then(r => r.ok ? r.json() : {}),
      fetch("/api/build/formulas").then(r => r.ok ? r.json() : {})
    ]);
    optimizerData = { spells, passives, subs, baseStats, formulas };
    document.getElementById("opt-status").textContent = "Donnees chargees: " + spells.length + " sorts, " + passives.length + " passifs, " + subs.length + " sublimations";
  } catch (err) {
    document.getElementById("opt-status").innerHTML = '<span style="color:var(--accent-red)">Erreur chargement: ' + err.message + '</span>';
    return;
  }

  document.getElementById("opt-run").onclick = runOptimizer;
}

function runOptimizer() {
  if (!optimizerData) return;
  const status = document.getElementById("opt-status");
  const results = document.getElementById("opt-results");
  const mode = document.getElementById("opt-mode").value;
  const topN = parseInt(document.getElementById("opt-topn").value) || 5;

  status.textContent = "Optimisation en cours...";
  results.innerHTML = "";

  setTimeout(() => {
    try {
      const g = {
        spells: optimizerData.spells,
        passives: optimizerData.passives,
        sublimations: optimizerData.subs,
        baseStats: optimizerData.baseStats,
        formulas: optimizerData.formulas,
        sacPatate: mode === "sac"
      };
      const top = optimize(g, topN);
      status.textContent = "Termine! " + topN + " meilleurs builds trouves.";
      renderResults(results, top, mode === "sac");
    } catch (err) {
      status.innerHTML = '<span style="color:var(--accent-red)">Erreur: ' + err.message + '</span>';
      console.error(err);
    }
  }, 100);
}

function renderResults(el, results, sacMode) {
  if (!results || results.length === 0) {
    el.innerHTML = '<p style="color:var(--text-muted)">Aucun resultat.</p>';
    return;
  }
  let h = '';
  results.forEach((r, i) => {
    const rank = i + 1;
    const cls = rank <= 3 ? "re r" + rank : "re";
    h += '<div class="' + cls + '">';
    h += '<div class="rh">';
    h += '<div class="rn">#' + rank + '</div>';
    h += '<div class="rd">' + (r.dpt || r.score || 0).toLocaleString("fr-FR") + ' DPT</div>';
    h += '</div>';
    if (r.passives) {
      h += '<div class="tags">';
      r.passives.forEach(p => { h += '<span class="t tp">' + p + '</span>'; });
      h += '</div>';
    }
    if (r.sublimations) {
      h += '<div class="tags" style="margin-top:4px">';
      r.sublimations.forEach(s => { h += '<span class="t ts">' + s + '</span>'; });
      h += '</div>';
    }
    if (r.rotation) {
      h += '<div style="margin-top:8px;font-size:.75rem;color:var(--text-muted)">Rotation: ' + r.rotation.join(" > ") + '</div>';
    }
    h += '</div>';
  });
  el.innerHTML = h;
}
