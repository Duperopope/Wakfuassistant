// Wakfu Companion v4.0 — Frontend
// Fichier genere par setup_v4.ps1 — modifiable librement
// Source architecture : pywebview js_api https://pywebview.flowrl.com/api/

var currentTab = "dashboard";
var data = null;
var sortCol = "solde";
var sortDir = -1;
var filterText = "";
var filterMode = "all";
var inventoryCategoryFilter = "all";

function switchTab(tab) {
    currentTab = tab;
    document.querySelectorAll(".tab").forEach(function(t) {
        t.classList.toggle("active", t.getAttribute("data-tab") === tab);
    });
    render();
}

function fmt(n) { return n.toLocaleString("fr-FR"); }

function eta(seconds) {
    if (!seconds || seconds <= 0) return "-";
    if (seconds < 60) return "~" + Math.round(seconds) + "s";
    if (seconds < 3600) return "~" + Math.floor(seconds / 60) + "m";
    var h = Math.floor(seconds / 3600);
    var m = Math.floor((seconds % 3600) / 60);
    return "~" + h + "h" + String(m).padStart(2, "0") + "m";
}

function esc(s) {
    var d = document.createElement("div");
    d.textContent = s;
    return d.innerHTML;
}

function iconTag(name) {
    if (!data || !data.icons || !data.icons[name]) return "";
    var urls = data.icons[name];
    if (!urls.length) return "";
    var attrs = "";
    for (var i = 1; i < urls.length; i++) {
        attrs += " data-f" + i + '="' + urls[i] + '"';
    }
    return '<img class="item-icon" src="' + urls[0] + '"' + attrs +
           ' onerror="iconFallback(this)" loading="lazy">';
}

function iconFallback(img) {
    var idx = parseInt(img.getAttribute("data-idx") || "1", 10);
    var next = img.getAttribute("data-f" + idx);
    if (next) {
        img.setAttribute("data-idx", String(idx + 1));
        img.src = next;
    } else {
        img.style.display = "none";
    }
}

function categoryOf(name) {
    if (!data || !data.item_categories) return "Autres";
    return data.item_categories[name] || "Autres";
}

// ─── Overlay API (pywebview bridge) ───
function isOverlayMode() {
    return typeof window.pywebview !== "undefined";
}

function toggleClickThrough() {
    if (isOverlayMode() && window.pywebview.api) {
        window.pywebview.api.toggle_click_through().then(function(r) {
            var btn = document.getElementById("btn-click-through");
            if (btn) {
                btn.classList.toggle("active", r.click_through);
                btn.textContent = r.click_through ? "Click-Through ON" : "Click-Through OFF";
            }
        });
    }
}

// ─── API helpers ───
function setPrice(item, value) {
    var price = parseFloat(value);
    if (isNaN(price) || price < 0) return;
    fetch("/api/price", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({item: item, price: price})
    });
}

function setItemMeta(item, payload) {
    var body = {item: item};
    if (payload.manual_qty !== undefined) body.manual_qty = parseInt(payload.manual_qty || "0", 10) || 0;
    if (payload.notes !== undefined) body.notes = String(payload.notes || "").trim();
    if (payload.manual_label !== undefined) body.manual_label = String(payload.manual_label || "").trim();
    if (payload.manual_icon_url !== undefined) body.manual_icon_url = String(payload.manual_icon_url || "").trim();
    fetch("/api/item", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(body)
    });
}

function setMetier(name, level, xp, target) {
    var body = {metier: name};
    if (level !== null && level !== undefined) body.level = parseInt(level) || 0;
    if (xp !== null && xp !== undefined) body.xp = parseInt(xp) || 0;
    if (target !== null && target !== undefined) body.target = parseInt(target) || 0;
    fetch("/api/metier", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(body)
    });
}

function setConfigField(k, v) {
    var body = {};
    body[k] = v;
    fetch("/api/config", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(body)
    });
}

// ─── Context menu ───
var ctxTarget = {kind: "", name: "", field: ""};

function closeItemMenu() {
    var m = document.getElementById("ctx-menu");
    if (m) m.style.display = "none";
    ctxTarget = {kind: "", name: "", field: ""};
}

function openContextMenu(ev, kind, name, field) {
    ev.preventDefault();
    var m = document.getElementById("ctx-menu");
    if (!m) return;
    ctxTarget = {kind: kind || "", name: name || "", field: field || ""};
    var title = document.getElementById("ctx-title");
    if (title) title.textContent = ctxTarget.name || ctxTarget.kind || "Actions";
    var body = document.getElementById("ctx-menu-body");
    if (body) body.innerHTML = buildMenuBody();
    m.style.display = "block";
    var x = Math.min(ev.clientX, window.innerWidth - 280);
    var y = Math.min(ev.clientY, window.innerHeight - 300);
    m.style.left = x + "px";
    m.style.top = y + "px";
}

function menuBtn(label, fn) {
    return '<button class="ctx-item" onclick="' + fn + ';closeItemMenu()">' + label + '</button>';
}

function buildMenuBody() {
    if (ctxTarget.kind === "item") {
        return menuBtn("Modifier quantite", "promptEditQty()")
             + menuBtn("Modifier prix", "promptEditPrice()")
             + menuBtn("Modifier notes", "promptEditNotes()")
             + menuBtn("Signaler un bug", "promptBugReport()");
    }
    if (ctxTarget.kind === "metier") {
        return menuBtn("Modifier niveau", "promptMetierLevel()")
             + menuBtn("Modifier cible", "promptMetierTarget()")
             + menuBtn("Signaler un bug", "promptBugReport()");
    }
    if (ctxTarget.kind === "metier_new") {
        return menuBtn("Ajouter un metier", "promptAddMetier()")
             + menuBtn("Signaler un bug", "promptBugReport()");
    }
    if (ctxTarget.kind === "config") {
        return menuBtn("Modifier personnage", "promptConfig('character')")
             + menuBtn("Modifier serveur", "promptConfig('server')")
             + menuBtn("Modifier kamas de base", "promptConfig('base_kamas')")
             + menuBtn("Ajustement kamas (+/-)", "promptConfig('manual_kamas_delta')")
             + menuBtn("Signaler un bug", "promptBugReport()");
    }
    return menuBtn("Signaler un bug", "promptBugReport()");
}

function promptEditQty() {
    if (!ctxTarget.name || !data) return;
    var cur = (data.inventory.manual_qty[ctxTarget.name] || 0);
    var v = prompt("Ajustement quantite", String(cur));
    if (v === null) return;
    setItemMeta(ctxTarget.name, {manual_qty: v});
}

function promptEditPrice() {
    if (!ctxTarget.name || !data) return;
    var cur = (data.inventory.prices[ctxTarget.name] || 0);
    var v = prompt("Prix unitaire", String(Math.round(cur)));
    if (v === null) return;
    setPrice(ctxTarget.name, v);
}

function promptEditNotes() {
    if (!ctxTarget.name || !data) return;
    var cur = (data.inventory.notes[ctxTarget.name] || "");
    var v = prompt("Notes", cur);
    if (v === null) return;
    setItemMeta(ctxTarget.name, {notes: v});
}

function promptMetierLevel() {
    if (!ctxTarget.name || !data) return;
    var m = data.session.metiers[ctxTarget.name] || {};
    var v = prompt("Niveau actuel", String(m.base_level || m.level || 0));
    if (v === null) return;
    setMetier(ctxTarget.name, parseInt(v, 10) || 0, null, null);
}

function promptMetierTarget() {
    if (!ctxTarget.name || !data) return;
    var m = data.session.metiers[ctxTarget.name] || {};
    var v = prompt("Niveau cible", String(m.target_level || 0));
    if (v === null) return;
    setMetier(ctxTarget.name, null, null, parseInt(v, 10) || 0);
}

function promptAddMetier() {
    var name = prompt("Nom du metier", "");
    if (!name) return;
    var lvl = parseInt(prompt("Niveau actuel", "0") || "0", 10) || 0;
    var tgt = parseInt(prompt("Niveau cible", "0") || "0", 10) || 0;
    setMetier(name, lvl, 0, tgt);
}

function promptConfig(field) {
    if (!data) return;
    var cur = data.config[field];
    var v = prompt("Valeur pour " + field, String(cur || ""));
    if (v === null) return;
    if (field === "base_kamas" || field === "manual_kamas_delta") {
        setConfigField(field, parseInt(v, 10) || 0);
    } else {
        setConfigField(field, v);
    }
}

function promptBugReport() {
    var msg = prompt("Description du bug", "");
    if (!msg) return;
    fetch("/api/bug_report", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({
            message: msg,
            tab: currentTab,
            context_kind: ctxTarget.kind,
            context_name: ctxTarget.name,
            context_field: ctxTarget.field,
            ui_state: {tab: currentTab, sortCol: sortCol, sortDir: sortDir, filterText: filterText}
        })
    }).then(function() { alert("Bug enregistre. Merci !"); });
}

// ─── Render functions ───
function renderHeader() {
    if (!data) return;
    var s = data.session;
    var h = document.getElementById("header-stats");
    if (!h) return;
    h.innerHTML =
        '<span class="stat" oncontextmenu="openContextMenu(event,\'config\',\'\',\'\')"><span class="label">Perso </span><span class="value cyan">' + esc(data.config.character) + '</span></span>' +
        '<span class="stat"><span class="label">Session </span><span class="value">' + s.elapsed_str + '</span></span>' +
        '<span class="stat"><span class="label">Combats </span><span class="value red">' + s.fights + '</span></span>' +
        '<span class="stat"><span class="label">Crafts </span><span class="value yellow">' + s.crafts + '</span></span>' +
        '<span class="stat"><span class="label">Kamas </span><span class="value green">' + fmt(data.known_kamas_total || 0) + '</span></span>' +
        '<span class="stat"><span class="label">Inv </span><span class="value cyan">~' + fmt(data.inv_value) + '</span></span>' +
        '<span class="stat"><span class="label">Events </span><span class="value">' + fmt(data.watcher.events) + '</span></span>';
}

function renderDashboard() {
    var s = data.session;
    var inv = data.inventory;
    var html = "";

    // Level ups
    if (s.level_ups.length > 0) {
        html += '<div class="section"><div class="section-title">Niveaux gagnes</div><table>';
        html += '<tr><th>Metier</th><th class="num">Dernier</th></tr>';
        var luMap = {};
        for (var lu = 0; lu < s.level_ups.length; lu++) {
            var item = s.level_ups[lu];
            if (!luMap[item.metier]) luMap[item.metier] = {count: 0, ts: item.ts};
            luMap[item.metier].count++;
            luMap[item.metier].ts = item.ts;
        }
        var luKeys = Object.keys(luMap);
        for (var lk = 0; lk < luKeys.length; lk++) {
            html += '<tr><td>' + esc(luKeys[lk]) + ' <span class="pos">+' + luMap[luKeys[lk]].count + '</span></td>';
            html += '<td class="num dim">' + esc(luMap[luKeys[lk]].ts) + '</td></tr>';
        }
        html += '</table></div>';
    }

    // Kamas
    html += '<div class="kamas-summary">';
    html += '<div class="kamas-card" oncontextmenu="openContextMenu(event,\'config\',\'\',\'base_kamas\')"><div class="amount" style="color:var(--text2)">' + fmt(data.config.base_kamas || 0) + '</div><div class="label">BASE</div></div>';
    html += '<div class="kamas-card"><div class="amount" style="color:var(--green)">+' + fmt(s.kamas_gained) + '</div><div class="label">DROPS</div></div>';
    html += '<div class="kamas-card"><div class="amount" style="color:var(--yellow)">+' + fmt(s.kamas_from_sales) + '</div><div class="label">VENTES</div></div>';
    html += '<div class="kamas-card"><div class="amount" style="color:var(--cyan)">~' + fmt(data.inv_value) + '</div><div class="label">INVENTAIRE</div></div>';
    html += '<div class="kamas-card"><div class="amount" style="color:var(--green)">' + fmt(data.known_kamas_total || 0) + '</div><div class="label">TOTAL</div></div>';
    html += '</div>';

    // Metiers
    var metierKeys = Object.keys(s.metiers);
    if (metierKeys.length > 0) {
        metierKeys.sort(function(a, b) { return s.metiers[b].xp - s.metiers[a].xp; });
        html += '<div class="section"><div class="section-title" oncontextmenu="openContextMenu(event,\'metier_new\',\'\',\'\')">XP Metiers (clic droit = ajouter)</div><div class="metier-grid">';
        for (var i = 0; i < metierKeys.length; i++) {
            var name = metierKeys[i];
            var m = s.metiers[name];
            var safeName = name.replace(/\\/g, "\\\\").replace(/'/g, "\\'");
            html += '<div class="metier-card" oncontextmenu="openContextMenu(event,\'metier\',\'' + safeName + '\',\'\')">';
            html += '<div class="metier-name">' + esc(name) + '</div>';
            html += '<div class="metier-stat"><span>Niveau</span><span>' + (m.level || 0) + '</span></div>';
            html += '<div class="metier-stat"><span>XP session</span><span class="pos bold">+' + fmt(m.xp) + '</span></div>';
            html += '<div class="metier-stat"><span>XP/h</span><span>' + fmt(m.xp_h) + '/h</span></div>';
            html += '<div class="metier-stat"><span>Reste</span><span>' + (m.xp_next > 0 ? fmt(m.xp_next) : "?") + '</span></div>';
            if (m.target_level > 0) {
                html += '<div class="metier-stat"><span>Cible</span><span>' + m.target_level + ' (' + eta(m.eta_target) + ')</span></div>';
            }
            html += '<div style="margin-top:6px"><div class="progress-bar" style="width:100%"><div class="progress-fill" style="width:' + m.pct + '%"></div></div> ' + m.pct.toFixed(0) + '%</div>';
            html += '<div class="metier-eta">' + eta(m.eta_s) + '</div>';
            html += '</div>';
        }
        html += '</div></div>';
    } else {
        html += '<div class="section"><div class="section-title" oncontextmenu="openContextMenu(event,\'metier_new\',\'\',\'\')">Aucun metier (clic droit pour ajouter)</div></div>';
    }

    // Top drops
    var allItems = Object.keys(inv.items).map(function(k) { return [k, inv.items[k]]; });
    allItems.sort(function(a, b) { return b[1] - a[1]; });
    var top = allItems.slice(0, 10);
    if (top.length > 0) {
        html += '<div class="section"><div class="section-title">Top Gains</div><table>';
        html += '<tr><th>Objet</th><th class="num">Solde</th><th class="num">Prix/u</th><th class="num">Valeur</th></tr>';
        for (var t = 0; t < top.length; t++) {
            var tName = top[t][0];
            var tNet = top[t][1];
            var tPrice = inv.prices[tName] || 0;
            var tVal = (tNet > 0 && tPrice > 0) ? Math.round(tNet * tPrice) : 0;
            var tCls = tNet > 0 ? "pos bold" : (tNet < 0 ? "neg" : "dim");
            var safeTName = tName.replace(/\\/g, "\\\\").replace(/'/g, "\\'");
            html += '<tr oncontextmenu="openContextMenu(event,\'item\',\'' + safeTName + '\',\'\')">';
            html += '<td><span class="item-name">' + iconTag(tName) + esc(tName) + '</span></td>';
            html += '<td class="num ' + tCls + '">' + (tNet > 0 ? "+" : "") + tNet + '</td>';
            html += '<td class="num dim">' + (tPrice > 0 ? fmt(Math.round(tPrice)) : "?") + '</td>';
            html += '<td class="num ' + (tVal > 0 ? "pos" : "") + '">' + (tVal > 0 ? fmt(tVal) : "-") + '</td>';
            html += '</tr>';
        }
        html += '</table></div>';
    }

    // Feed
    if (s.recent_events.length > 0) {
        html += '<div class="section"><div class="section-title">Activite recente</div><div class="feed">';
        var evts = s.recent_events.slice().reverse().slice(0, 15);
        for (var j = 0; j < evts.length; j++) {
            var e = evts[j];
            html += '<div class="feed-item"><span class="feed-ts">' + e.ts + '</span><span class="feed-icon">' + esc(e.icon) + '</span><span>' + esc(e.text) + '</span></div>';
        }
        html += '</div></div>';
    }

    return html;
}

function renderInventory() {
    var inv = data.inventory;
    var allItems = Object.keys(inv.items).map(function(k) { return [k, inv.items[k]]; });

    // Filters
    var categorySet = {};
    for (var ci = 0; ci < allItems.length; ci++) categorySet[categoryOf(allItems[ci][0])] = true;
    var categoryKeys = Object.keys(categorySet).sort();

    var html = '<div style="display:flex;gap:12px;margin-bottom:16px;flex-wrap:wrap;align-items:center">';
    html += '<input class="filter-input" type="text" placeholder="Rechercher..." value="' + esc(filterText) + '" oninput="filterText=this.value;render()" style="width:250px">';
    html += '<select class="filter-input" onchange="inventoryCategoryFilter=this.value;render()">';
    html += '<option value="all"' + (inventoryCategoryFilter === "all" ? " selected" : "") + '>Toutes categories</option>';
    for (var ck = 0; ck < categoryKeys.length; ck++) {
        var cat = categoryKeys[ck];
        html += '<option value="' + esc(cat) + '"' + (inventoryCategoryFilter === cat ? " selected" : "") + '>' + esc(cat) + '</option>';
    }
    html += '</select>';
    var totalAll = allItems.length;
    var totalPos = allItems.filter(function(x) { return x[1] > 0; }).length;
    var totalNeg = allItems.filter(function(x) { return x[1] < 0; }).length;
    html += '<button class="filter-btn' + (filterMode === "all" ? " active" : "") + '" onclick="filterMode=\'all\';render()">Tous (' + totalAll + ')</button>';
    html += '<button class="filter-btn' + (filterMode === "positive" ? " active" : "") + '" onclick="filterMode=\'positive\';render()">Gains (' + totalPos + ')</button>';
    html += '<button class="filter-btn' + (filterMode === "negative" ? " active" : "") + '" onclick="filterMode=\'negative\';render()">Pertes (' + totalNeg + ')</button>';
    html += '</div>';

    // Apply filters
    if (filterText) {
        var ft = filterText.toLowerCase();
        allItems = allItems.filter(function(x) { return x[0].toLowerCase().indexOf(ft) >= 0; });
    }
    if (filterMode === "positive") allItems = allItems.filter(function(x) { return x[1] > 0; });
    if (filterMode === "negative") allItems = allItems.filter(function(x) { return x[1] < 0; });
    if (inventoryCategoryFilter !== "all") allItems = allItems.filter(function(x) { return categoryOf(x[0]) === inventoryCategoryFilter; });

    // Sort
    allItems.sort(function(a, b) {
        if (sortCol === "name") return sortDir * a[0].localeCompare(b[0]);
        if (sortCol === "category") return sortDir * categoryOf(a[0]).localeCompare(categoryOf(b[0]));
        if (sortCol === "price") return sortDir * ((inv.prices[a[0]] || 0) - (inv.prices[b[0]] || 0));
        if (sortCol === "value") {
            var va = (a[1] > 0 ? a[1] * (inv.prices[a[0]] || 0) : 0);
            var vb = (b[1] > 0 ? b[1] * (inv.prices[b[0]] || 0) : 0);
            return sortDir * (va - vb);
        }
        return sortDir * (a[1] - b[1]); // default: solde
    });

    html += '<table><tr>';
    var cols = [["name","Objet"],["category","Cat."],["solde","Solde"],["price","Prix/u"],["value","Valeur"]];
    for (var c = 0; c < cols.length; c++) {
        var key = cols[c][0];
        var label = cols[c][1];
        var arrow = sortCol === key ? (sortDir > 0 ? " +" : " -") : "";
        html += '<th class="' + (key !== "name" && key !== "category" ? "num" : "") + '" onclick="toggleSort(\'' + key + '\')">' + label + arrow + '</th>';
    }
    html += '</tr>';

    for (var i = 0; i < Math.min(allItems.length, 300); i++) {
        var name = allItems[i][0];
        var net = allItems[i][1];
        var p = inv.prices[name] || 0;
        var v = (net > 0 && p > 0) ? Math.round(net * p) : 0;
        var cls = net > 0 ? "pos bold" : (net < 0 ? "neg" : "dim");
        var safeName = name.replace(/\\/g, "\\\\").replace(/'/g, "\\'");
        html += '<tr oncontextmenu="openContextMenu(event,\'item\',\'' + safeName + '\',\'\')">';
        html += '<td><span class="item-name">' + iconTag(name) + esc(name) + '</span></td>';
        html += '<td><span class="category-pill">' + esc(categoryOf(name)) + '</span></td>';
        html += '<td class="num ' + cls + '">' + (net > 0 ? "+" : "") + net + '</td>';
        html += '<td class="num dim">' + (p > 0 ? fmt(Math.round(p)) : "?") + '</td>';
        html += '<td class="num ' + (v > 0 ? "pos" : "") + '">' + (v > 0 ? fmt(v) : "-") + '</td>';
        html += '</tr>';
    }
    html += '</table>';
    return html;
}

function renderCombats() {
    var combats = data.session.combats || [];
    if (!combats.length) return '<p class="dim">Aucun combat detecte.</p>';
    var html = '<div class="section"><div class="section-title">Combats</div></div>';
    for (var i = 0; i < combats.length; i++) {
        var f = combats[i];
        html += '<details class="collapse"' + (i === 0 ? " open" : "") + '>';
        html += '<summary>Combat #' + esc(String(f.fight_id)) + ' | Degats: ' + fmt(f.total_damage) + ' | Tours: ' + (f.turns ? f.turns.length : 0) + '</summary>';
        html += '<div class="collapse-body">';
        var turns = f.turns || [];
        for (var t = 0; t < turns.length; t++) {
            var tr = turns[t];
            html += '<div style="margin:4px 0"><strong>Tour ' + tr.turn + '</strong> — ' + fmt(tr.total_damage) + ' degats</div>';
            var skills = tr.skills || [];
            if (skills.length) {
                html += '<table><tr><th>Competence</th><th class="num">Degats</th></tr>';
                for (var si = 0; si < skills.length; si++) {
                    html += '<tr><td>' + esc(skills[si].name) + '</td><td class="num pos">' + fmt(skills[si].damage) + '</td></tr>';
                }
                html += '</table>';
            }
        }
        html += '</div></details>';
    }
    return html;
}

function renderActivity() {
    var events = data.session.recent_events.slice().reverse();
    if (events.length === 0) return '<p class="dim">Aucune activite.</p>';
    var html = '<div class="feed">';
    for (var i = 0; i < events.length; i++) {
        var e = events[i];
        html += '<div class="feed-item"><span class="feed-ts">' + e.ts + '</span><span class="feed-icon">' + esc(e.icon) + '</span><span>' + esc(e.text) + '</span></div>';
    }
    html += '</div>';
    return html;
}

function render() {
    if (!data) return;
    renderHeader();
    var el = document.getElementById("content");
    if (!el) return;
    switch (currentTab) {
        case "dashboard": el.innerHTML = renderDashboard(); break;
        case "inventory": el.innerHTML = renderInventory(); break;
        case "combats": el.innerHTML = renderCombats(); break;
        case "activity": el.innerHTML = renderActivity(); break;
        default: el.innerHTML = renderDashboard();
    }
}

function toggleSort(col) {
    if (sortCol === col) sortDir *= -1;
    else { sortCol = col; sortDir = -1; }
    render();
}

// ─── Data loading + SSE ───
fetch("/api/data")
    .then(function(r) { return r.json(); })
    .then(function(d) { data = d; render(); })
    .catch(function(e) { console.error("Initial fetch error:", e); });

var evtSource = new EventSource("/api/stream");
evtSource.onmessage = function(e) {
    try { data = JSON.parse(e.data); render(); }
    catch (err) { console.error("SSE parse error:", err); }
};
evtSource.onerror = function() {
    if (evtSource.readyState === EventSource.CLOSED) {
        setTimeout(function() { evtSource = new EventSource("/api/stream"); }, 3000);
    }
};
setInterval(function() {
    if (!data || evtSource.readyState === EventSource.CLOSED) {
        fetch("/api/data").then(function(r) { return r.json(); }).then(function(d) { data = d; render(); });
    }
}, 5000);

// ─── Events ───
document.addEventListener("click", function() { closeItemMenu(); });
document.addEventListener("keydown", function(ev) {
    if (ev.key === "Escape") closeItemMenu();
    if (ev.altKey && ev.key === "o") toggleClickThrough();
});