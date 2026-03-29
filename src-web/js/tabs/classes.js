const BREED_COLORS = {
  "Feca":"#5B8DEE","Osamodas":"#48D1CC","Enutrof":"#FFD700","Sram":"#C084FC",
  "Xelor":"#F472B6","Ecaflip":"#F97316","Sacrieur":"#EF4444","Sadida":"#34D399",
  "Iop":"#FF6B6B","Cra":"#A78BFA","Eniripsa":"#EC4899","Pandawa":"#22C55E",
  "Roublard":"#FBBF24","Zobal":"#60A5FA","Steamer":"#14B8A6","Eliotrope":"#818CF8",
  "Huppermage":"#38BDF8","Ouginak":"#FB923C"
};

function getColor(name) { return BREED_COLORS[name] || "#888"; }

// Mode persistant entre les rechargements
let _classesMode = "count";
let _switcherBound = false;

// ---- Donut SVG (synchronise avec le mode) ----
function renderDonut(container, classes, mode) {
  const getValue = (c) => {
    if (mode === "offense") return c.avg_poids_offensif;
    if (mode === "level") return c.avg_level;
    return c.count;
  };
  const titles = { count: "Joueurs par classe", level: "Niveau moyen par classe", offense: "Puissance offensive par classe" };
  const labels = { count: "joueurs", level: "niv. moyen", offense: "puissance" };

  // Mettre a jour le titre au dessus du donut
  const titleEl = document.getElementById("classesDonutTitle");
  if (titleEl) titleEl.textContent = titles[mode] || "Classes";

  const total = classes.reduce((s, c) => s + getValue(c), 0);
  const sorted = [...classes].sort((a, b) => getValue(b) - getValue(a));
  const cx = 100, cy = 100, R = 80, r = 50;
  let cumul = 0;
  let paths = "";
  sorted.forEach(c => {
    const val = getValue(c);
    const frac = val / total;
    if (frac <= 0) return;
    const startAngle = cumul * 2 * Math.PI - Math.PI / 2;
    cumul += frac;
    const endAngle = cumul * 2 * Math.PI - Math.PI / 2;
    const large = frac > 0.5 ? 1 : 0;
    const x1o = cx + R * Math.cos(startAngle), y1o = cy + R * Math.sin(startAngle);
    const x2o = cx + R * Math.cos(endAngle),   y2o = cy + R * Math.sin(endAngle);
    const x1i = cx + r * Math.cos(endAngle),   y1i = cy + r * Math.sin(endAngle);
    const x2i = cx + r * Math.cos(startAngle), y2i = cy + r * Math.sin(startAngle);
    const color = getColor(c.breedName);
    const display = mode === "count" ? val : val.toFixed(1);
    const pct = (frac * 100).toFixed(1);
    paths += '<path d="M'+x1o+','+y1o+' A'+R+','+R+' 0 '+large+' 1 '+x2o+','+y2o+' L'+x1i+','+y1i+' A'+r+','+r+' 0 '+large+' 0 '+x2i+','+y2i+' Z" fill="'+color+'" opacity="0.9" stroke="rgba(0,0,0,0.3)" stroke-width="1"><title>'+c.breedName+': '+display+' ('+pct+'%)</title></path>';
  });

  // Centre du donut : total pour count, moyenne pour level/offense
  var centerVal, centerLabel;
  if (mode === "count") {
    centerVal = total;
    centerLabel = labels[mode];
  } else {
    centerVal = (total / classes.length).toFixed(0);
    centerLabel = labels[mode];
  }

  container.innerHTML = '<svg viewBox="0 0 200 200" width="180" height="180">'
    + paths
    + '<text x="100" y="92" text-anchor="middle" fill="white" font-size="32" font-weight="bold">' + centerVal + '</text>'
    + '<text x="100" y="112" text-anchor="middle" fill="rgba(255,255,255,0.5)" font-size="9" font-weight="600" text-transform="uppercase">' + centerLabel + '</text>'
    + '</svg>';
}


// ---- Barres horizontales (panneau droit) ----
function renderBarChart(container, classes, mode) {
  const sorted = [...classes].sort((a, b) => {
    if (mode === "level") return b.avg_level - a.avg_level;
    if (mode === "offense") return b.avg_poids_offensif - a.avg_poids_offensif;
    return b.count - a.count;
  });
  const getValue = (c) => {
    if (mode === "level") return c.avg_level;
    if (mode === "offense") return c.avg_poids_offensif;
    return c.count;
  };
  const formatVal = (v) => {
    if (mode === "count") return v;
    return typeof v === "number" ? v.toFixed(1) : v;
  };
  const maxVal = Math.max(...sorted.map(getValue), 1);
  let html = "";
  sorted.forEach(c => {
    const val = getValue(c);
    const barW = ((val / maxVal) * 100).toFixed(1);
    const color = getColor(c.breedName);
    html += '<div class="uc-row"><span class="uc-name">'+c.breedName+'</span><span class="uc-bar-track"><span class="uc-bar-fill" style="width:'+barW+'%;background:'+color+'"></span></span><span class="uc-value">'+formatVal(val)+'</span></div>';
  });
  container.innerHTML = html;
}

// ---- Export principal ----
export function loadClasses(classes) {
  if (!classes || !classes.length) return;

  const donutEl = document.getElementById("classesDonut");
  const chartEl = document.getElementById("classesUnifiedChart");
  const switcher = document.getElementById("classesChartSwitcher");

  // Mode par defaut
  // Mode persiste au niveau module via _classesMode

  // Rendu initial
  if (donutEl) renderDonut(donutEl, classes, _classesMode);
  if (chartEl) renderBarChart(chartEl, classes, _classesMode);

  // Switcher
  if (switcher) {
    const btns = switcher.querySelectorAll(".chart-switch-btn");
    // Toujours mettre a jour la classe active
    btns.forEach(b => b.classList.remove("active"));
    btns.forEach(b => { if (b.dataset.mode === _classesMode) b.classList.add("active"); });
    // Binder les clicks UNE SEULE FOIS
    if (!_switcherBound) {
    _switcherBound = true;
    btns.forEach(btn => {
      btn.addEventListener("click", () => {
        btns.forEach(b => b.classList.remove("active"));
        btn.classList.add("active");
        _classesMode = btn.dataset.mode;
        if (chartEl) renderBarChart(chartEl, classes, _classesMode);
        if (donutEl) renderDonut(donutEl, classes, _classesMode);
      });
    });
  }
  } // fin guard _switcherBound

  // ---- Tableau classes ----
  const tbody = document.querySelector("#classesTable tbody");
  if (tbody) {
    const sorted = [...classes].sort((a, b) => b.avg_poids_offensif - a.avg_poids_offensif);
    let currentSort = { col: "avg_poids_offensif", asc: false };

    function renderTable(data) {
      tbody.innerHTML = data.map((c, i) => {
        const color = getColor(c.breedName);
        return '<tr>'
          + '<td>'+(i+1)+'</td>'
          + '<td><span style="display:inline-block;width:10px;height:10px;border-radius:50%;background:'+color+';margin-right:6px;vertical-align:middle"></span>'+c.breedName+'</td>'
          + '<td>'+c.count+'</td>'
          + '<td>'+c.avg_poids_offensif.toFixed(1)+'</td>'
          + '<td>'+c.avg_level.toFixed(1)+'</td>'
          + '<td>'+c.max_poids_offensif.toFixed(1)+'</td>'
          + '<td class="clickable-player" data-player="'+c.top_player+'">'+c.top_player+'</td>'
          + '</tr>';
      }).join("");
    }

    renderTable(sorted);

    const headers = document.querySelectorAll("#classesTable thead th[data-sort]");
    headers.forEach(th => {
      th.style.cursor = "pointer";
      th.addEventListener("click", () => {
        const col = th.dataset.sort;
        if (currentSort.col === col) {
          currentSort.asc = !currentSort.asc;
        } else {
          currentSort.col = col;
          currentSort.asc = false;
        }
        const dir = currentSort.asc ? 1 : -1;
        const s = [...classes].sort((a, b) => {
          const va = a[col], vb = b[col];
          if (typeof va === "string") return dir * va.localeCompare(vb);
          return dir * (vb - va);
        });
        if (currentSort.asc) s.reverse();
        renderTable(s);
        headers.forEach(h => h.textContent = h.textContent.replace(/ [\u25B2\u25BC]/g, ""));
        th.textContent += currentSort.asc ? " \u25B2" : " \u25BC";
      });
    });
  }
}
