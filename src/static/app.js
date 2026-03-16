
var currentTab = "dashboard";
var data = null;
var sortCol = "solde";
var sortDir = -1;
var filterText = "";
var filterMode = "all";
var inventoryCategoryFilter = "all";
var hdvFilterText = "";
var hdvCategoryFilter = "all";
var hdvSortCol = "name";
var hdvSortDir = 1;
var ctxTarget = {kind: "", name: "", field: ""};
var iconPicker = {open: false, item: "", query: "", list: [], suggestions: [], selectedUrl: "", loading: false, error: ""};
var iconPickerTimer = null;

function switchTab(tab) {
    currentTab = tab;
    var tabs = document.querySelectorAll(".tab");
    for (var i = 0; i < tabs.length; i++) {
        tabs[i].classList.remove("active");
        if (tabs[i].getAttribute("data-tab") === tab) tabs[i].classList.add("active");
    }
    render();
}

function fmt(n) { return n.toLocaleString("fr-FR"); }

function eta(seconds) {
    if (!seconds || seconds <= 0) return "-";
    if (seconds < 60) return "~" + Math.round(seconds) + "s";
    if (seconds < 3600) return "~" + Math.floor(seconds/60) + "m" + String(Math.floor(seconds%60)).padStart(2,"0") + "s";
    return "~" + Math.floor(seconds/3600) + "h" + String(Math.floor((seconds%3600)/60)).padStart(2,"0") + "m";
}

function esc(s) { var d = document.createElement("div"); d.textContent = s; return d.innerHTML; }

function categoryOf(name) {
    if (!data || !data.item_categories) return "Autres";
    return data.item_categories[name] || "Autres";
}

function itemTooltip(name) {
    if (!data || !data.inventory) return name;
    var cat = categoryOf(name);
    var notes = data.inventory.notes[name] || "";
    var txt = name + "\nCategorie: " + cat;
    if (notes) txt += "\nNotes: " + notes;
    return txt;
}

function iconTag(name) {
    var candidates = data.icons[name] || [];
    if (!candidates.length) return "";
    var attrs = "";
    for (var i = 1; i < candidates.length; i++) {
        attrs += " data-f" + i + "=\"" + candidates[i] + "\"";
    }
    return "<img class=\"item-icon\" src=\"" + candidates[0] + "\"" + attrs + " onerror=\"iconFallback(this)\">";
}

function iconFallback(img) {
    var idx = parseInt(img.getAttribute("data-idx") || "1", 10);
    var next = img.getAttribute("data-f" + idx);
    if (next) {
        img.setAttribute("data-idx", String(idx + 1));
        img.src = next;
        return;
    }
    img.style.display = "none";
}

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
    if (title) title.textContent = buildMenuTitle();
    var body = document.getElementById("ctx-menu-body");
    if (body) body.innerHTML = buildMenuBody();

    m.style.display = "block";
    var x = ev.clientX;
    var y = ev.clientY;
    var vw = window.innerWidth;
    var vh = window.innerHeight;
    var mw = 300;
    var mh = 260;
    if (x + mw > vw) x = Math.max(8, vw - mw - 8);
    if (y + mh > vh) y = Math.max(8, vh - mh - 8);
    m.style.left = x + "px";
    m.style.top = y + "px";
}

function buildMenuTitle() {
    if (ctxTarget.kind === "item") return ctxTarget.name;
    if (ctxTarget.kind === "hdv_offer") return "Offre HDV #" + ctxTarget.field;
    if (ctxTarget.kind === "hdv_new") return "Nouvelle offre HDV";
    if (ctxTarget.kind === "zone") return "Zone: " + (ctxTarget.name || "(inconnue)");
    if (ctxTarget.kind === "metier") return "Metier: " + ctxTarget.name;
    if (ctxTarget.kind === "metier_new") return "Metiers";
    if (ctxTarget.kind === "config") return "Dashboard";
    return "Actions";
}

function menuButton(label, fn) {
    return "<button class=\"ctx-item\" onclick=\"" + fn + ";closeItemMenu()\">" + label + "</button>";
}

function buildMenuBody() {
    if (ctxTarget.kind === "item") {
        return ""
            + menuButton("Modifier ajustement de quantite", "promptEditQuantity()")
            + menuButton("Modifier prix manuel", "promptEditPrice()")
            + menuButton("Ajouter offre de vente HDV", "promptAddHdvOfferForItem(\"sell\")")
            + menuButton("Ajouter offre d'achat HDV", "promptAddHdvOfferForItem(\"buy\")")
            + menuButton("Taguer une perte (detruit/craft/banque)", "promptTagLoss()")
            + menuButton("Ajouter composant de craft", "promptAddCraftComponent()")
            + menuButton("Vider recette craft", "clearCraftRecipe()")
            + menuButton("Modifier nom corrige (icone)", "promptEditLabel()")
            + menuButton("Modifier notes", "promptEditNotes()")
            + menuButton("Choisir image (librairie Ankama)", "openIconPickerForCurrentItem()")
            + menuButton("Retirer image manuelle", "clearIconOverride()")
            + menuButton("Signaler un bug ici", "promptReportBug()")
            + menuButton("Reinitialiser les corrections manuelles", "resetManualEdits()");
    }
    if (ctxTarget.kind === "hdv_offer") {
        return ""
            + menuButton("Modifier cette offre", "promptEditHdvOfferById()")
            + menuButton("Signaler un bug ici", "promptReportBug()")
            + menuButton("Supprimer cette offre", "deleteHdvOfferById()");
    }
    if (ctxTarget.kind === "hdv_new") {
        return ""
            + menuButton("Ajouter offre de vente", "promptAddHdvOffer(\"sell\")")
            + menuButton("Signaler un bug ici", "promptReportBug()")
            + menuButton("Ajouter offre d'achat", "promptAddHdvOffer(\"buy\")");
    }
    if (ctxTarget.kind === "metier") {
        return ""
            + menuButton("Modifier niveau actuel", "promptEditMetierLevel()")
            + menuButton("Modifier XP actuelle", "promptEditMetierXp()")
            + menuButton("Signaler un bug ici", "promptReportBug()")
            + menuButton("Modifier niveau cible", "promptEditMetierTarget()");
    }
    if (ctxTarget.kind === "metier_new") {
        return ""
            + menuButton("Ajouter un metier", "promptAddMetier()")
            + menuButton("Signaler un bug ici", "promptReportBug()");
    }
    if (ctxTarget.kind === "config") {
        return ""
            + menuButton("Modifier personnage", "promptEditConfigCharacter()")
            + menuButton("Modifier serveur", "promptEditConfigServer()")
            + menuButton("Modifier compte", "promptEditConfigAccount()")
            + menuButton("Onboarding initial (perso/xp/kamas)", "openOnboarding()")
            + menuButton("Modifier kamas de base", "promptEditConfigBaseKamas()")
            + menuButton("Reset base locale", "promptResetData()")
            + menuButton("Signaler un bug ici", "promptReportBug()")
            + menuButton("Ajustement manuel kamas (+/-)", "promptEditManualKamasDelta()");
    }
    if (ctxTarget.kind === "zone") {
        return menuButton("Signaler un bug ici", "promptReportBug()");
    }
    return menuButton("Signaler un bug ici", "promptReportBug()");
}

function buildZoneNameFromEvent(ev) {
    var t = ev.target;
    if (!t) return "zone inconnue";
    var titleEl = t.closest(".section-title,.subsection-title,.metier-name,th,.tab");
    if (titleEl && titleEl.textContent) return String(titleEl.textContent || "").trim().slice(0, 120);
    var cls = String(t.className || "").trim();
    var tag = String(t.tagName || "DIV").toLowerCase();
    if (cls) return tag + "." + cls.split(/\s+/).slice(0, 2).join(".");
    return tag;
}

function promptReportBug() {
    var defaultMsg = "";
    if (ctxTarget.kind === "item" && ctxTarget.name) defaultMsg = "Bug sur l'objet: " + ctxTarget.name;
    else if (ctxTarget.kind === "metier" && ctxTarget.name) defaultMsg = "Bug sur le metier: " + ctxTarget.name;
    else if (ctxTarget.kind === "zone" && ctxTarget.name) defaultMsg = "Bug sur la zone: " + ctxTarget.name;
    var msg = prompt("Decris le bug observe", defaultMsg);
    if (msg === null) return;
    msg = String(msg || "").trim();
    if (!msg) return;

    var uiState = {
        tab: currentTab,
        sortCol: sortCol,
        sortDir: sortDir,
        filterText: filterText,
        filterMode: filterMode,
        inventoryCategoryFilter: inventoryCategoryFilter,
        hdvFilterText: hdvFilterText,
        hdvCategoryFilter: hdvCategoryFilter,
        hdvSortCol: hdvSortCol,
        hdvSortDir: hdvSortDir,
    };

    fetch("/api/bug_report", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({
            message: msg,
            tab: currentTab,
            context_kind: ctxTarget.kind || "",
            context_name: ctxTarget.name || "",
            context_field: ctxTarget.field || "",
            ui_state: uiState
        })
    }).then(function() {
        alert("Bug enregistre. Merci.");
    }).catch(function() {
        alert("Impossible d'enregistrer le bug.");
    });
}

function promptEditQuantity() {
    if (!ctxTarget.name || !data) return;
    var current = (data.inventory.manual_qty[ctxTarget.name] || 0);
    var v = prompt("Ajustement manuel de quantite", String(current));
    if (v === null) return;
    setItemMeta(ctxTarget.name, {manual_qty: v});
}

function promptEditPrice() {
    if (!ctxTarget.name || !data) return;
    var current = (data.inventory.prices[ctxTarget.name] || 0);
    var v = prompt("Prix unitaire manuel", String(Math.round(current)));
    if (v === null) return;
    setPrice(ctxTarget.name, v);
}

function promptEditLabel() {
    if (!ctxTarget.name || !data) return;
    var current = (data.inventory.manual_label[ctxTarget.name] || "");
    var v = prompt("Nom corrige (utilise pour matcher l'icone)", current);
    if (v === null) return;
    setItemMeta(ctxTarget.name, {manual_label: v});
}

function promptEditNotes() {
    if (!ctxTarget.name || !data) return;
    var current = (data.inventory.notes[ctxTarget.name] || "");
    var v = prompt("Notes", current);
    if (v === null) return;
    setItemMeta(ctxTarget.name, {notes: v});
}

function resetManualEdits() {
    if (!ctxTarget.name) return;
    setItemMeta(ctxTarget.name, {manual_qty: 0, notes: "", manual_label: "", manual_icon_url: ""});
    setPrice(ctxTarget.name, 0);
}

function promptTagLoss() {
    if (!ctxTarget.name) return;
    var qty = parseInt(prompt("Quantite a taguer en perte", "1") || "0", 10) || 0;
    if (qty <= 0) return;
    var reason = String(prompt("Raison (detruit/craft/banque/autre)", "detruit") || "detruit").trim().toLowerCase();
    if (reason !== "detruit" && reason !== "craft" && reason !== "banque" && reason !== "autre") reason = "autre";
    var notes = prompt("Notes (optionnel)", "") || "";
    fetch("/api/loss_tag", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({item: ctxTarget.name, quantity: qty, reason: reason, notes: notes})
    });
}

function promptAddCraftComponent() {
    if (!ctxTarget.name) return;
    var comp = prompt("Nom de l'objet composant", "");
    if (!comp) return;
    var qty = parseInt(prompt("Quantite de ce composant", "1") || "1", 10) || 1;
    fetch("/api/craft_component", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({output_item: ctxTarget.name, component_item: comp, quantity: qty, action: "upsert"})
    });
}

function clearCraftRecipe() {
    if (!ctxTarget.name) return;
    if (!confirm("Vider toute la recette craft pour cet objet ?")) return;
    fetch("/api/craft_component", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({output_item: ctxTarget.name, action: "clear"})
    });
}

function clearIconOverride() {
    if (!ctxTarget.name) return;
    setItemMeta(ctxTarget.name, {manual_icon_url: ""});
}

function openIconPickerForCurrentItem() {
    if (!ctxTarget.name) return;
    iconPicker.open = true;
    iconPicker.item = ctxTarget.name;
    iconPicker.query = ctxTarget.name;
    iconPicker.list = [];
    iconPicker.suggestions = [];
    iconPicker.selectedUrl = "";
    iconPicker.loading = true;
    iconPicker.error = "";
    renderIconPicker();
    loadIconLibrary(iconPicker.query);
}

function closeIconPicker() {
    iconPicker.open = false;
    iconPicker.loading = false;
    iconPicker.error = "";
    iconPicker.selectedUrl = "";
    renderIconPicker();
}

function onIconPickerInput(v) {
    iconPicker.query = String(v || "").trim();
    renderIconPicker();
    if (iconPickerTimer) clearTimeout(iconPickerTimer);
    iconPickerTimer = setTimeout(function() {
        loadIconLibrary(iconPicker.query);
    }, 180);
}

function loadIconLibrary(query) {
    if (!iconPicker.item) return;
    iconPicker.loading = true;
    iconPicker.error = "";
    renderIconPicker();
    var q = encodeURIComponent(query || "");
    var item = encodeURIComponent(iconPicker.item || "");
    fetch("/api/icon_library?q=" + q + "&item=" + item + "&limit=160")
        .then(function(r) { return r.json(); })
        .then(function(d) {
            iconPicker.loading = false;
            iconPicker.list = d && d.items ? d.items : [];
            iconPicker.suggestions = d && d.suggestions ? d.suggestions : [];
            renderIconPicker();
        })
        .catch(function() {
            iconPicker.loading = false;
            iconPicker.error = "Erreur de chargement de la librairie.";
            renderIconPicker();
        });
}

function chooseIconForCurrentItem(url) {
    if (!iconPicker.item || !url) return;
    iconPicker.selectedUrl = String(url);
    renderIconPicker();
}

function applySelectedIcon() {
    if (!iconPicker.item || !iconPicker.selectedUrl) {
        alert("Choisis une image avant de valider.");
        return;
    }
    setItemMeta(iconPicker.item, {manual_icon_url: String(iconPicker.selectedUrl)});
    closeIconPicker();
}

function renderIconPicker() {
    var overlay = document.getElementById("icon-picker-overlay");
    var title = document.getElementById("icon-picker-title");
    var input = document.getElementById("icon-picker-input");
    var applyBtn = document.getElementById("icon-picker-apply");
    var sug = document.getElementById("icon-picker-suggestions");
    var body = document.getElementById("icon-picker-body");
    if (!overlay || !title || !input || !sug || !body || !applyBtn) return;

    overlay.style.display = iconPicker.open ? "flex" : "none";
    if (!iconPicker.open) return;

    title.textContent = "Choix image: " + iconPicker.item;
    input.value = iconPicker.query || "";
    applyBtn.disabled = !iconPicker.selectedUrl;
    applyBtn.textContent = iconPicker.selectedUrl ? "Valider l'image" : "Choisir une image";

    var sugHtml = "";
    if (iconPicker.suggestions && iconPicker.suggestions.length) {
        sugHtml += "<div class=\"title\">Suggestions auto pour cet objet</div><div class=\"row\">";
        for (var i = 0; i < iconPicker.suggestions.length; i++) {
            var s = iconPicker.suggestions[i];
            var safeS = s.replace(/\\/g, "\\\\").replace(/\"/g, "\\\"");
            var selectedChip = iconPicker.selectedUrl === s ? " style=\"border-color:var(--green)\"" : "";
            sugHtml += "<button class=\"icon-chip\"" + selectedChip + " onclick=\"chooseIconForCurrentItem(\\\"" + safeS + "\\\")\"><img src=\"" + s + "\" onerror=\"this.style.display='none'\"></button>";
        }
        sugHtml += "</div>";
    }
    sug.innerHTML = sugHtml;
    sug.style.display = sugHtml ? "block" : "none";

    if (iconPicker.loading) {
        body.innerHTML = "<div class=\"dim\">Chargement de la librairie...</div>";
        return;
    }
    if (iconPicker.error) {
        body.innerHTML = "<div class=\"neg\">" + esc(iconPicker.error) + "</div>";
        return;
    }
    if (!iconPicker.list.length) {
        body.innerHTML = "<div class=\"dim\">Aucun resultat.</div>";
        return;
    }

    var out = "";
    for (var j = 0; j < iconPicker.list.length; j++) {
        var row = iconPicker.list[j];
        var iconUrl = (row.icons && row.icons.length) ? row.icons[0] : "";
        if (!iconUrl) continue;
        var safe = iconUrl.replace(/\\/g, "\\\\").replace(/\"/g, "\\\"");
        var selectedClass = iconPicker.selectedUrl === iconUrl ? " selected" : "";
        out += "<button class=\"icon-card" + selectedClass + "\" onclick=\"chooseIconForCurrentItem(\\\"" + safe + "\\\")\">";
        out += "<div class=\"name\">" + esc(row.name || "Objet") + "</div>";
        out += "<div class=\"line\"><img src=\"" + iconUrl + "\" onerror=\"this.style.display='none'\"><span class=\"tiny-note\">gfx " + (row.gfx_id || "?") + "</span></div>";
        out += "</button>";
    }
    body.innerHTML = out;
}

function promptOfferPayload(existing, forcedType, forcedItem) {
    var itemName = forcedItem || (existing ? (existing.item || "") : "");
    if (!itemName) {
        itemName = prompt("Objet de l'offre", "");
        if (!itemName) return null;
    }
    var typeDefault = forcedType || (existing ? (existing.offer_type || "sell") : "sell");
    var typePick = prompt("Type d'offre (sell=vente, buy=achat)", typeDefault);
    if (typePick === null) return null;
    typePick = String(typePick || "sell").trim().toLowerCase();
    if (typePick !== "buy") typePick = "sell";

    var priceDefault = existing ? String(Math.round(existing.unit_price || 0)) : "0";
    var unitPrice = parseFloat(prompt("Prix unitaire", priceDefault) || "0");
    if (isNaN(unitPrice) || unitPrice < 0) unitPrice = 0;

    var qtyDefault = existing ? String(existing.quantity || 0) : "1";
    var quantity = parseInt(prompt("Quantite de l'offre", qtyDefault) || "0", 10) || 0;

    var sellerDefault = existing ? (existing.seller_name || "") : "";
    var ownDefault = existing ? (existing.is_own_offer ? "oui" : "non") : "non";
    var ownRaw = prompt("Est-ce notre offre ? (oui/non)", ownDefault);
    if (ownRaw === null) return null;
    var isOwnOffer = String(ownRaw || "non").trim().toLowerCase();
    isOwnOffer = (isOwnOffer === "oui" || isOwnOffer === "yes" || isOwnOffer === "y" || isOwnOffer === "1");

    var sellerLabel = isOwnOffer ? "Nom du joueur (toi)" : "Nom du joueur (autre)";
    var seller = prompt(sellerLabel, sellerDefault || (isOwnOffer ? (data && data.config ? data.config.character : "") : ""));
    if (seller === null) return null;

    var gemDefault = existing ? String(existing.gem_slots || 0) : "0";
    var gemSlots = parseInt(prompt("Slots de gemmes", gemDefault) || "0", 10) || 0;

    var subDefault = existing ? (existing.sublimations || "") : "";
    var sublimations = prompt("Sublimations equipees (texte libre)", subDefault);
    if (sublimations === null) return null;

    var notesDefault = existing ? (existing.notes || "") : "";
    var notes = prompt("Notes (optionnel)", notesDefault);
    if (notes === null) return null;

    return {
        item: itemName,
        offer_type: typePick,
        unit_price: unitPrice,
        quantity: quantity,
        seller_name: String(seller || "").trim(),
        is_own_offer: isOwnOffer,
        gem_slots: gemSlots,
        sublimations: String(sublimations || "").trim(),
        notes: String(notes || "").trim()
    };
}

function promptAddHdvOffer(type) {
    var payload = promptOfferPayload(null, type || "sell", "");
    if (!payload) return;
    upsertHdvOffer(payload);
}

function promptAddHdvOfferForItem(type) {
    if (!ctxTarget.name) return;
    var payload = promptOfferPayload(null, type || "sell", ctxTarget.name);
    if (!payload) return;
    upsertHdvOffer(payload);
}

function promptEditHdvOfferById() {
    if (!ctxTarget.field || !data || !data.hdv_offer_index) return;
    var existing = data.hdv_offer_index[String(ctxTarget.field)];
    if (!existing) return;
    var payload = promptOfferPayload(existing, existing.offer_type || "sell", existing.item || "");
    if (!payload) return;
    payload.id = existing.id;
    upsertHdvOffer(payload);
}

function deleteHdvOfferById() {
    if (!ctxTarget.field) return;
    if (!confirm("Supprimer cette offre HDV ?")) return;
    fetch("/api/hdv_offer", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({action: "delete", id: parseInt(ctxTarget.field, 10) || 0})
    });
}

function upsertHdvOffer(payload) {
    fetch("/api/hdv_offer", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(payload)
    });
}

function promptEditMetierLevel() {
    if (!ctxTarget.name || !data) return;
    var m = data.session.metiers[ctxTarget.name] || {};
    var current = m.base_level || m.level || 0;
    var v = prompt("Niveau actuel", String(current));
    if (v === null) return;
    setMetier(ctxTarget.name, parseInt(v, 10) || 0, null, null);
}

function promptEditMetierXp() {
    if (!ctxTarget.name || !data) return;
    var m = data.session.metiers[ctxTarget.name] || {};
    var current = m.base_xp || 0;
    var v = prompt("XP actuelle dans le niveau", String(current));
    if (v === null) return;
    var remDefault = m.xp_next || 0;
    var rem = prompt("XP restant pour le prochain niveau (sert a apprendre la courbe globale)", String(remDefault));
    if (rem === null) return;
    setMetier(ctxTarget.name, null, parseInt(v, 10) || 0, null, parseInt(rem, 10) || 0);
}

function promptEditMetierTarget() {
    if (!ctxTarget.name || !data) return;
    var m = data.session.metiers[ctxTarget.name] || {};
    var current = m.target_level || 0;
    var v = prompt("Niveau cible", String(current));
    if (v === null) return;
    setMetier(ctxTarget.name, null, null, parseInt(v, 10) || 0);
}

function promptAddMetier() {
    var name = prompt("Nom du metier", "");
    if (!name) return;
    var lvl = parseInt(prompt("Niveau actuel", "0") || "0", 10) || 0;
    var xp = parseInt(prompt("XP actuelle", "0") || "0", 10) || 0;
    var tgt = parseInt(prompt("Niveau cible", "0") || "0", 10) || 0;
    setMetier(name, lvl, xp, tgt);
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

function promptEditConfigCharacter() {
    var v = prompt("Personnage", data && data.config ? (data.config.character || "") : "");
    if (v === null) return;
    setConfigField("character", v);
}

function promptEditConfigServer() {
    var v = prompt("Serveur", data && data.config ? (data.config.server || "") : "");
    if (v === null) return;
    setConfigField("server", v);
}

function promptEditConfigAccount() {
    var v = prompt("Compte", data && data.config ? (data.config.account || "") : "");
    if (v === null) return;
    setConfigField("account", v);
}

function promptEditConfigBaseKamas() {
    var v = prompt("Kamas de base", String((data && data.config ? (data.config.base_kamas || 0) : 0)));
    if (v === null) return;
    setConfigField("base_kamas", parseInt(v, 10) || 0);
}

function promptEditManualKamasDelta() {
    var v = prompt("Ajustement manuel kamas (positif ou negatif)", String((data && data.config ? (data.config.manual_kamas_delta || 0) : 0)));
    if (v === null) return;
    setConfigField("manual_kamas_delta", parseInt(v, 10) || 0);
}

function openOnboarding() {
    var m = document.getElementById("onboarding-overlay");
    if (!m) return;
    document.getElementById("ob-level").value = String((data && data.config ? (data.config.character_level || 0) : 0));
    document.getElementById("ob-xp-current").value = String((data && data.config ? (data.config.character_xp_current || 0) : 0));
    document.getElementById("ob-xp-total").value = String((data && data.config ? (data.config.character_xp_total || 0) : 0));
    document.getElementById("ob-kamas").value = String((data && data.config ? (data.config.base_kamas || 0) : 0));
    m.style.display = "flex";
}

function closeOnboarding() {
    var m = document.getElementById("onboarding-overlay");
    if (m) m.style.display = "none";
}

function saveOnboarding() {
    var payload = {
        character_level: parseInt(document.getElementById("ob-level").value || "0", 10) || 0,
        character_xp_current: parseInt(document.getElementById("ob-xp-current").value || "0", 10) || 0,
        character_xp_total: parseInt(document.getElementById("ob-xp-total").value || "0", 10) || 0,
        base_kamas: parseInt(document.getElementById("ob-kamas").value || "0", 10) || 0,
        onboarding_done: true
    };
    fetch("/api/config", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(payload)
    }).then(function() {
        closeOnboarding();
    });
}

function promptResetData() {
    var clearDb = confirm("Reset local: effacer les donnees trackees (sessions, HDV, combats, tags) ?");
    if (!clearDb) return;
    var clearWakfu = confirm("Vider aussi le fichier log Wakfu ?");
    fetch("/api/reset", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({clear_db: true, clear_wakfu_log: clearWakfu, clear_config: false})
    }).then(function() {
        alert("Reset termine.");
    });
}

function renderHeader() {
    if (!data) return;
    var s = data.session;
    var h = document.getElementById("header-stats");
    h.innerHTML =
        "<span class=\"stat\" oncontextmenu=\"openContextMenu(event,&quot;config&quot;,&quot;&quot;,&quot;character&quot;)\"><span class=\"label\">Perso </span><span class=\"value cyan\">" + esc(data.config.character) + "</span></span>" +
        "<span class=\"stat\"><span class=\"label\">Niveau perso </span><span class=\"value\">" + fmt(data.config.character_level || 0) + "</span></span>" +
        "<span class=\"stat\"><span class=\"label\">XP perso </span><span class=\"value\">" + fmt(data.config.character_xp_current || 0) + " / " + fmt(data.config.character_xp_total || 0) + "</span></span>" +
        "<span class=\"stat\"><span class=\"label\">Duree session </span><span class=\"value\">" + s.elapsed_str + "</span></span>" +
        "<span class=\"stat\"><span class=\"label\">Combats </span><span class=\"value red\">" + s.fights + "</span></span>" +
        "<span class=\"stat\"><span class=\"label\">Crafts </span><span class=\"value yellow\">" + s.crafts + "</span></span>" +
        "<span class=\"stat\" oncontextmenu=\"openContextMenu(event,&quot;config&quot;,&quot;&quot;,&quot;base_kamas&quot;)\"><span class=\"label\">Kamas connus </span><span class=\"value green\">" + fmt(data.known_kamas_total || 0) + "</span></span>" +
        "<span class=\"stat\"><span class=\"label\">Inv. </span><span class=\"value cyan\">~" + fmt(data.inv_value) + "</span></span>" +
        "<span class=\"stat\"><span class=\"label\">Events </span><span class=\"value\">" + fmt(data.watcher.events) + "</span></span>";
}

function renderDashboard() {
    var s = data.session;
    var inv = data.inventory;
    var html = "";
    var i, name, m, lu;

    if (s.level_ups.length > 0) {
        var luMap = {};
        for (i = 0; i < s.level_ups.length; i++) {
            lu = s.level_ups[i];
            if (!luMap[lu.metier]) luMap[lu.metier] = {count: 0, lastTs: lu.ts};
            luMap[lu.metier].count += 1;
            luMap[lu.metier].lastTs = lu.ts;
        }
        html += "<div class=\"section\"><div class=\"section-title\">Niveaux gagnes (compact)</div><table>";
        html += "<tr><th>Metier</th><th class=\"num\">Niveaux</th><th class=\"num\">Dernier</th></tr>";
        var luKeys = Object.keys(luMap);
        for (i = 0; i < luKeys.length; i++) {
            var mk = luKeys[i];
            html += "<tr><td>" + esc(mk) + "</td><td class=\"num pos\">+" + luMap[mk].count + "</td><td class=\"num dim\">" + esc(luMap[mk].lastTs) + "</td></tr>";
        }
        html += "</table></div>";
    }

    html += "<div class=\"kamas-summary\">";
    html += "<div class=\"kamas-card\" oncontextmenu=\"openContextMenu(event,&quot;config&quot;,&quot;&quot;,&quot;base_kamas&quot;)\"><div class=\"amount\" style=\"color:var(--text2)\">" + fmt(data.config.base_kamas) + "</div><div class=\"label\">KAMAS BASE (clic droit)</div></div>";
    html += "<div class=\"kamas-card\"><div class=\"amount\" style=\"color:var(--green)\">+" + fmt(s.kamas_gained) + "</div><div class=\"label\">DROPS</div></div>";
    html += "<div class=\"kamas-card\"><div class=\"amount\" style=\"color:var(--yellow)\">+" + fmt(s.kamas_from_sales) + "</div><div class=\"label\">VENTES HDV</div></div>";
    html += "<div class=\"kamas-card\"><div class=\"amount\" style=\"color:var(--purple)\">" + fmt(data.config.manual_kamas_delta || 0) + "</div><div class=\"label\">AJUSTEMENT MANUEL</div></div>";
    html += "<div class=\"kamas-card\"><div class=\"amount\" style=\"color:var(--cyan)\">~" + fmt(data.inv_value) + "</div><div class=\"label\">VALEUR INVENTAIRE</div></div>";
    html += "<div class=\"kamas-card\"><div class=\"amount\" style=\"color:var(--green)\">" + fmt(data.known_kamas_total || 0) + "</div><div class=\"label\">TOTAL KAMAS CONNUS</div></div>";
    html += "</div>";

    var metierKeys = Object.keys(s.metiers);
    if (metierKeys.length > 0) {
        metierKeys.sort(function(a, b) { return s.metiers[b].xp - s.metiers[a].xp; });
        html += "<div class=\"section\"><div class=\"section-title\">XP Metiers</div><div class=\"metier-grid\">";
        for (i = 0; i < metierKeys.length; i++) {
            name = metierKeys[i];
            m = s.metiers[name];
            var safeMetierName = name.replace(/\\/g, "\\\\").replace(/"/g, "\\\"");
            html += "<div class=\"metier-card\" oncontextmenu=\"openContextMenu(event,&quot;metier&quot;,&quot;" + safeMetierName + "&quot;,&quot;&quot;)\">";
            html += "<div class=\"metier-name\">" + esc(name) + "</div>";
            html += "<div class=\"metier-stat\"><span>Niveau</span><span>" + (m.level || 0) + "</span></div>";
            html += "<div class=\"metier-stat\"><span>XP actuelle</span><span>" + fmt(m.base_xp || 0) + "</span></div>";
            html += "<div class=\"metier-stat\"><span>XP gagne</span><span class=\"pos\">+" + fmt(m.xp) + "</span></div>";
            html += "<div class=\"metier-stat\"><span>XP/h</span><span>" + fmt(m.xp_h) + "/h</span></div>";
            html += "<div class=\"metier-stat\"><span>Reste</span><span>" + (m.xp_next > 0 ? fmt(m.xp_next) : "?") + "</span></div>";
            html += "<div style=\"margin-top:6px\"><div class=\"progress-bar\"><div class=\"progress-fill\" style=\"width:" + m.pct + "%\"></div></div> " + m.pct.toFixed(0) + "%</div>";
            html += "<div class=\"metier-eta\">" + eta(m.eta_s) + "</div>";
            html += "</div>";
        }
        html += "</div></div>";
    }

    var allItems = Object.keys(inv.items).map(function(k) { return [k, inv.items[k]]; });
    allItems.sort(function(a, b) { return b[1] - a[1]; });
    var topItems = allItems.slice(0, 10);
    if (topItems.length > 0) {
        html += "<div class=\"section\"><div class=\"section-title\">Top Gains (session)</div><table>";
        html += "<tr><th>Objet</th><th class=\"num\">Drops</th><th class=\"num\">Pertes</th><th class=\"num\">Solde</th><th class=\"num\">Prix/u</th><th class=\"num\">Valeur</th></tr>";
        for (i = 0; i < topItems.length; i++) {
            name = topItems[i][0];
            var net = topItems[i][1];
            var safeName = name.replace(/\\/g, "\\\\").replace(/"/g, "\\\"");
            var d = inv.drops[name] || 0;
            var l = inv.losses[name] || 0;
            var p = inv.prices[name] || 0;
            var v = (net > 0 && p > 0) ? Math.round(net * p) : 0;
            var img = iconTag(name);
            var sCls = net > 0 ? "pos bold" : (net < 0 ? "neg" : "dim");
            html += "<tr oncontextmenu=\"openContextMenu(event,&quot;item&quot;,&quot;" + safeName + "&quot;,&quot;&quot;)\">";
            html += "<td><span class=\"item-name\">" + img + esc(name) + "</span></td>";
            html += "<td class=\"num pos\">" + (d > 0 ? "+" + d : "-") + "</td>";
            html += "<td class=\"num neg\">" + (l > 0 ? "-" + l : "-") + "</td>";
            html += "<td class=\"num " + sCls + "\">" + (net > 0 ? "+" : "") + net + "</td>";
            html += "<td class=\"num dim\">" + (p > 0 ? fmt(Math.round(p)) : "?") + "</td>";
            html += "<td class=\"num " + (v > 0 ? "pos" : "dim") + "\">" + (v > 0 ? fmt(v) : "-") + "</td>";
            html += "</tr>";
        }
        html += "</table></div>";
    }

    if (s.recent_events.length > 0) {
        html += "<div class=\"section\"><div class=\"section-title\">Activite recente</div><div class=\"feed\">";
        var evts = s.recent_events.slice().reverse().slice(0, 15);
        for (i = 0; i < evts.length; i++) {
            var e = evts[i];
            html += "<div class=\"feed-item\"><span class=\"feed-ts\">" + e.ts + "</span><span class=\"feed-icon\">" + esc(e.icon) + "</span><span>" + esc(e.text) + "</span></div>";
        }
        html += "</div></div>";
    }
    return html;
}

function renderInventory() {
    var inv = data.inventory;
    var allItems = Object.keys(inv.items).map(function(k) { return [k, inv.items[k]]; });
    var categorySet = {};
    for (var ci = 0; ci < allItems.length; ci++) categorySet[categoryOf(allItems[ci][0])] = true;
    var categoryKeys = Object.keys(categorySet).sort(function(a, b) { return a.localeCompare(b); });
    var totalAll = allItems.length;
    var totalPos = allItems.filter(function(x) { return x[1] > 0; }).length;
    var totalNeg = allItems.filter(function(x) { return x[1] < 0; }).length;

    var html = "<div class=\"filters\">";
    html += "<input class=\"filter-input\" type=\"text\" placeholder=\"Rechercher...\" value=\"" + filterText + "\" oninput=\"filterText=this.value;render()\" style=\"width:250px\">";
    html += "<select class=\"filter-input\" onchange=\"inventoryCategoryFilter=this.value;render()\"><option value=\"all\"" + (inventoryCategoryFilter===\"all\"?\" selected\":\"\") + \">Toutes categories</option>";
    for (var ck = 0; ck < categoryKeys.length; ck++) {
        var cat = categoryKeys[ck];
        var sel = inventoryCategoryFilter === cat ? " selected" : "";
        html += "<option value=\"" + esc(cat) + "\"" + sel + ">" + esc(cat) + "</option>";
    }
    html += "</select>";
    html += "<button class=\"filter-btn " + (filterMode==="all"?"active":"") + "\" onclick=\"filterMode=&quot;all&quot;;render()\">Tous (" + totalAll + ")</button>";
    html += "<button class=\"filter-btn " + (filterMode==="positive"?"active":"") + "\" onclick=\"filterMode=&quot;positive&quot;;render()\">Gains (" + totalPos + ")</button>";
    html += "<button class=\"filter-btn " + (filterMode==="negative"?"active":"") + "\" onclick=\"filterMode=&quot;negative&quot;;render()\">Pertes (" + totalNeg + ")</button>";
    html += "</div>";

    if (filterText) {
        var ft = filterText.toLowerCase();
        allItems = allItems.filter(function(x) { return x[0].toLowerCase().indexOf(ft) >= 0; });
    }
    if (filterMode === "positive") allItems = allItems.filter(function(x) { return x[1] > 0; });
    if (filterMode === "negative") allItems = allItems.filter(function(x) { return x[1] < 0; });
    if (inventoryCategoryFilter !== "all") allItems = allItems.filter(function(x) { return categoryOf(x[0]) === inventoryCategoryFilter; });

    allItems.sort(function(a, b) {
        var va, vb;
        switch(sortCol) {
            case "name": return sortDir * a[0].localeCompare(b[0]);
            case "category": return sortDir * categoryOf(a[0]).localeCompare(categoryOf(b[0]));
            case "drops": va = inv.drops[a[0]]||0; vb = inv.drops[b[0]]||0; break;
            case "losses": va = inv.losses[a[0]]||0; vb = inv.losses[b[0]]||0; break;
            case "uses": va = inv.uses[a[0]]||0; vb = inv.uses[b[0]]||0; break;
            case "sales": va = inv.sales[a[0]]||0; vb = inv.sales[b[0]]||0; break;
            case "crafts": va = inv.crafts[a[0]]||0; vb = inv.crafts[b[0]]||0; break;
            case "detruit": va = (((data.loss_tags||{})[a[0]]||{}).detruit)||0; vb = (((data.loss_tags||{})[b[0]]||{}).detruit)||0; break;
            case "banque": va = (((data.loss_tags||{})[a[0]]||{}).banque)||0; vb = (((data.loss_tags||{})[b[0]]||{}).banque)||0; break;
            case "loss_craft": va = (((data.loss_tags||{})[a[0]]||{}).craft)||0; vb = (((data.loss_tags||{})[b[0]]||{}).craft)||0; break;
            case "solde": va = a[1]; vb = b[1]; break;
            case "manual": va = inv.manual_qty[a[0]]||0; vb = inv.manual_qty[b[0]]||0; break;
            case "meta":
                va = (inv.manual_label[a[0]]||"") + " " + (inv.notes[a[0]]||"");
                vb = (inv.manual_label[b[0]]||"") + " " + (inv.notes[b[0]]||"");
                return sortDir * va.localeCompare(vb);
            case "price": va = inv.prices[a[0]]||0; vb = inv.prices[b[0]]||0; break;
            case "value":
                va = (a[1]>0 ? a[1]*(inv.prices[a[0]]||0) : 0);
                vb = (b[1]>0 ? b[1]*(inv.prices[b[0]]||0) : 0);
                break;
            default: va = a[1]; vb = b[1];
        }
        return sortDir * (va - vb);
    });

    html += "<table><tr>";
    var cols = [["name","Objet"],["category","Categorie"],["drops","Drops"],["losses","Perdu"],["uses","Utilise"],["sales","Vendu"],["crafts","Crafte"],["detruit","Detruit"],["banque","Banque"],["loss_craft","Pertes craft"],["solde","SOLDE"],["manual","Ajust."],["price","Prix/u"],["value","Valeur"],["meta","Correction manuelle"]];
    for (var c = 0; c < cols.length; c++) {
        var key = cols[c][0];
        var label = cols[c][1];
        var arrow = sortCol === key ? (sortDir > 0 ? " +" : " -") : "";
        var cls = (key === "name" || key === "meta" || key === "category") ? "" : "num";
        html += "<th class=\"" + cls + "\" onclick=\"toggleSort(&quot;" + key + "&quot;)\">" + label + arrow + "</th>";
    }
    html += "</tr>";

    for (var i = 0; i < allItems.length; i++) {
        var name = allItems[i][0];
        var net = allItems[i][1];
        var d = inv.drops[name]||0;
        var l = inv.losses[name]||0;
        var u = inv.uses[name]||0;
        var sl = inv.sales[name]||0;
        var cr = inv.crafts[name]||0;
        var mq = inv.manual_qty[name]||0;
        var autoNet = inv.auto_items[name]||0;
        var p = inv.prices[name]||0;
        var v = (net > 0 && p > 0) ? Math.round(net * p) : 0;
        var lt = (data.loss_tags && data.loss_tags[name]) ? data.loss_tags[name] : {detruit:0, banque:0, craft:0, autre:0};
        var cdata = (data.craft_costs && data.craft_costs[name]) ? data.craft_costs[name] : null;
        var recipe = (data.craft_recipes && data.craft_recipes[name]) ? data.craft_recipes[name] : [];
        var img = iconTag(name);
        var catName = categoryOf(name);
        var sCls = net > 0 ? "pos bold" : (net < 0 ? "neg" : "dim");
        var rawNotes = inv.notes[name] || "";
        var rawLabel = inv.manual_label[name] || "";
        var safeName = name.replace(/\\/g, "\\\\").replace(/"/g, "\\\"");
        html += "<tr oncontextmenu=\"openContextMenu(event,&quot;item&quot;,&quot;" + safeName + "&quot;,&quot;&quot;)\">";
        html += "<td title=\"" + esc(itemTooltip(name)) + "\"><span class=\"item-name\">" + img + esc(name) + "</span><div class=\"tiny-note\">Auto: " + (autoNet>0?"+":"") + autoNet + "</div></td>";
        html += "<td><span class=\"category-pill\">" + esc(catName) + "</span></td>";
        html += "<td class=\"num pos\">" + (d>0?"+"+d:"-") + "</td>";
        html += "<td class=\"num neg\">" + (l>0?"-"+l:"-") + "</td>";
        html += "<td class=\"num\">" + (u>0?"-"+u:"-") + "</td>";
        html += "<td class=\"num\">" + (sl>0?"-"+sl:"-") + "</td>";
        html += "<td class=\"num\">" + (cr>0?"+"+cr:"-") + "</td>";
        html += "<td class=\"num\">" + ((lt.detruit||0)>0?"-"+(lt.detruit||0):"-") + "</td>";
        html += "<td class=\"num\">" + ((lt.banque||0)>0?"-"+(lt.banque||0):"-") + "</td>";
        html += "<td class=\"num\">" + ((lt.craft||0)>0?"-"+(lt.craft||0):"-") + "</td>";
        html += "<td class=\"num " + sCls + "\">" + (net>0?"+":"") + net + "</td>";
        html += "<td class=\"num\"><input class=\"editable\" type=\"number\" value=\"" + mq + "\" onchange=\"setItemMeta(&quot;" + safeName + "&quot;, {manual_qty:this.value})\"></td>";
        html += "<td class=\"num\"><input class=\"editable\" type=\"number\" value=\"" + (p>0?Math.round(p):"") + "\" placeholder=\"?\" onchange=\"setPrice(&quot;" + safeName + "&quot;,this.value)\"></td>";
        html += "<td class=\"num " + (v>0?"pos":"") + "\">" + (v>0?fmt(v):"-") + "</td>";
        html += "<td>";
        html += "<input class=\"editable text\" type=\"text\" value=\"" + esc(rawLabel) + "\" placeholder=\"Nom exact (corrige)\" onchange=\"setItemMeta(&quot;" + safeName + "&quot;, {manual_label:this.value})\">";
        html += "<div style=\"margin-top:4px\"><input class=\"editable text\" type=\"text\" value=\"" + esc(rawNotes) + "\" placeholder=\"Notes\" onchange=\"setItemMeta(&quot;" + safeName + "&quot;, {notes:this.value})\"></div>";
        if (recipe.length) {
            var comps = [];
            for (var ri = 0; ri < recipe.length; ri++) comps.push(recipe[ri].qty + "x " + recipe[ri].item);
            var cc = cdata ? fmt(cdata.cost || 0) : "0";
            var ce = cdata && cdata.complete ? "" : " (prix incomplets)";
            html += "<div class=\"tiny-note\" style=\"margin-top:4px\">Recette: " + esc(comps.join(", ")) + "</div>";
            html += "<div class=\"tiny-note\" style=\"margin-top:2px\">Cout composants: " + cc + ce + "</div>";
        }
        if (inv.corrected[name]) html += "<div class=\"tiny-note pos\" style=\"margin-top:4px\">Correction enregistree</div>";
        html += "</td>";
        html += "</tr>";
    }
    html += "</table>";
    return html;
}

function renderMetiers() {
    var s = data.session;
    var keys = Object.keys(s.metiers);
    if (keys.length === 0) return "<div class=\"section-title\" oncontextmenu=\"openContextMenu(event,&quot;metier_new&quot;,&quot;&quot;,&quot;&quot;)\">Aucun metier detecte (clic droit pour ajouter)</div>";
    keys.sort(function(a, b) { return s.metiers[b].xp - s.metiers[a].xp; });
    var html = "<div class=\"section-title\" oncontextmenu=\"openContextMenu(event,&quot;metier_new&quot;,&quot;&quot;,&quot;&quot;)\">Metiers (clic droit pour ajouter)</div><div class=\"metier-grid\">";
    for (var i = 0; i < keys.length; i++) {
        var name = keys[i];
        var m = s.metiers[name];
        var safeMetierName = name.replace(/\\/g, "\\\\").replace(/"/g, "\\\"");
        html += "<div class=\"metier-card\" oncontextmenu=\"openContextMenu(event,&quot;metier&quot;,&quot;" + safeMetierName + "&quot;,&quot;&quot;)\">";
        html += "<div class=\"metier-name\">" + esc(name) + "</div>";
        html += "<div class=\"metier-stat\"><span>Niveau</span><span>" + (m.level || 0) + "</span></div>";
        html += "<div class=\"metier-stat\"><span>Niveaux detectes session (info)</span><span class=\"dim\">+" + (m.level_ups_session || 0) + "</span></div>";
        html += "<div class=\"metier-stat\"><span>XP actuelle</span><span>" + fmt(m.base_xp || 0) + "</span></div>";
        html += "<div class=\"metier-stat\"><span>XP du niveau (courbe)</span><span>" + fmt(m.xp_for_this_lvl || 0) + " <span class=\"tiny-note\">(" + (m.curve_source === "learned" ? "appris x" + (m.curve_sample_count || 0) : "formule") + ")</span></span></div>";
        html += "<div class=\"metier-stat\"><span>XP total session</span><span class=\"pos bold\">+" + fmt(m.xp) + "</span></div>";
        html += "<div class=\"metier-stat\"><span>XP / heure</span><span>" + fmt(m.xp_h) + "/h</span></div>";
        html += "<div class=\"metier-stat\"><span>XP restant</span><span>" + (m.xp_next>0?fmt(m.xp_next):"?") + "</span></div>";
        html += "<div style=\"margin-top:8px\"><div class=\"progress-bar\" style=\"width:100%\"><div class=\"progress-fill\" style=\"width:" + m.pct + "%\"></div></div> " + m.pct.toFixed(1) + "%</div>";
        html += "<div class=\"metier-eta\" style=\"margin-top:8px;font-size:18px\">" + eta(m.eta_s) + "</div>";
        html += "</div>";
    }
    html += "</div>";
    return html;
}

function renderHDV() {
    var inv = data.inventory;
    var offersByItem = data.hdv_offers || {};
    var html = "";
    html += "<div class=\"section\">";
    html += "<div class=\"section-title\" oncontextmenu=\"openContextMenu(event,&quot;hdv_new&quot;,&quot;&quot;,&quot;&quot;)\">Marche HDV (clic droit pour ajouter)</div>";
    html += "<div class=\"filters\">";
    html += "<input class=\"filter-input\" type=\"text\" value=\"" + esc(hdvFilterText) + "\" placeholder=\"Filtrer un objet...\" oninput=\"hdvFilterText=this.value;render()\" style=\"width:260px\">";
    html += "<select class=\"filter-input\" onchange=\"hdvCategoryFilter=this.value;render()\">";
    html += "<option value=\"all\"" + (hdvCategoryFilter===\"all\"?\" selected\":\"\") + \">Toutes categories</option>";
    var catMap = {};
    var tmpAll = Object.keys(offersByItem).concat(Object.keys(inv.prices || {}));
    for (var cx = 0; cx < tmpAll.length; cx++) catMap[categoryOf(tmpAll[cx])] = true;
    var catKeys = Object.keys(catMap).sort(function(a,b){return a.localeCompare(b);});
    for (var ck = 0; ck < catKeys.length; ck++) {
        var cat = catKeys[ck];
        html += "<option value=\"" + esc(cat) + "\"" + (hdvCategoryFilter===cat?" selected":"") + ">" + esc(cat) + "</option>";
    }
    html += "</select>";
    html += "<select class=\"filter-input\" onchange=\"hdvSortCol=this.value;render()\">";
    html += "<option value=\"name\"" + (hdvSortCol===\"name\"?" selected":"") + ">Tri: Objet</option>";
    html += "<option value=\"bestSell\"" + (hdvSortCol===\"bestSell\"?" selected":"") + ">Tri: Meilleure vente</option>";
    html += "<option value=\"bestBuy\"" + (hdvSortCol===\"bestBuy\"?" selected":"") + ">Tri: Meilleure offre achat</option>";
    html += "<option value=\"offers\"" + (hdvSortCol===\"offers\"?" selected":"") + ">Tri: Nb offres</option>";
    html += "</select>";
    html += "<button class=\"filter-btn\" onclick=\"hdvSortDir*=-1;render()\">" + (hdvSortDir>0?"Asc":"Desc") + "</button>";
    html += "</div>";
    html += "</div>";

    var itemSet = {};
    var keysA = Object.keys(offersByItem);
    for (var i = 0; i < keysA.length; i++) itemSet[keysA[i]] = true;
    var keysB = Object.keys(inv.prices || {});
    for (var j = 0; j < keysB.length; j++) itemSet[keysB[j]] = true;
    var allItems = Object.keys(itemSet);
    allItems.sort(function(a, b) { return a.localeCompare(b); });

    var f = String(hdvFilterText || "").trim().toLowerCase();
    if (f) {
        allItems = allItems.filter(function(name) { return name.toLowerCase().indexOf(f) >= 0; });
    }
    if (hdvCategoryFilter !== "all") {
        allItems = allItems.filter(function(name) { return categoryOf(name) === hdvCategoryFilter; });
    }

    if (!allItems.length) {
        return html + "<p class=\"dim\">Aucune offre HDV. Clic droit dans cette section pour ajouter des offres manuelles (vente/achat).</p>";
    }

    var itemMeta = [];
    for (var mi = 0; mi < allItems.length; mi++) {
        var nm = allItems[mi];
        var offs = offersByItem[nm] || [];
        var bSell = 0;
        var bBuy = 0;
        for (var oi0 = 0; oi0 < offs.length; oi0++) {
            var op = Math.round(offs[oi0].unit_price || 0);
            if (offs[oi0].offer_type === "sell") {
                if (!bSell || op < bSell) bSell = op;
            } else if (op > bBuy) {
                bBuy = op;
            }
        }
        itemMeta.push({name: nm, offers: offs, bestSell: bSell, bestBuy: bBuy, category: categoryOf(nm)});
    }
    itemMeta.sort(function(a, b) {
        var va = 0;
        var vb = 0;
        if (hdvSortCol === "name") return hdvSortDir * a.name.localeCompare(b.name);
        if (hdvSortCol === "bestSell") { va = a.bestSell || 0; vb = b.bestSell || 0; }
        else if (hdvSortCol === "bestBuy") { va = a.bestBuy || 0; vb = b.bestBuy || 0; }
        else { va = a.offers.length; vb = b.offers.length; }
        return hdvSortDir * (va - vb);
    });

    var byCategory = {};
    for (var bi = 0; bi < itemMeta.length; bi++) {
        var ct = itemMeta[bi].category || "Autres";
        if (!byCategory[ct]) byCategory[ct] = [];
        byCategory[ct].push(itemMeta[bi]);
    }
    var categories = Object.keys(byCategory).sort(function(a,b){ return a.localeCompare(b); });

    for (var cg = 0; cg < categories.length; cg++) {
        var catName = categories[cg];
        html += "<div class=\"section\"><div class=\"subsection-title\">" + esc(catName) + " (" + byCategory[catName].length + ")</div>";
        var catItems = byCategory[catName];
        for (var cm = 0; cm < catItems.length; cm++) {
            var block = catItems[cm];
            var name = block.name;
            var offers = block.offers;
            var safeName = name.replace(/\\/g, "\\\\").replace(/"/g, "\\\"");
            var autoPrice = Math.round((inv.prices[name] || 0));
            var bestSell = block.bestSell;
            var bestBuy = block.bestBuy;
            html += "<details class=\"collapse\"" + (cm < 2 ? " open" : "") + ">";
            html += "<summary oncontextmenu=\"openContextMenu(event,&quot;item&quot;,&quot;" + safeName + "&quot;,&quot;&quot;)\"><span class=\"item-name\" title=\"" + esc(itemTooltip(name)) + "\">" + iconTag(name) + esc(name) + "</span> <span class=\"tiny-note\">| auto " + (autoPrice > 0 ? fmt(autoPrice) : "-") + " | vente " + (bestSell > 0 ? fmt(bestSell) : "-") + " | achat " + (bestBuy > 0 ? fmt(bestBuy) : "-") + "</span></summary>";
            html += "<div class=\"collapse-body\">";
            if (!offers.length) {
                html += "<div class=\"tiny-note\">Aucune offre manuelle. Clic droit sur le titre pour en ajouter.</div>";
                html += "</div></details>";
                continue;
            }
            html += "<table style=\"margin-top:4px\">";
            html += "<tr><th>Type</th><th>Offre</th><th class=\"num\">Prix/u</th><th class=\"num\">Qte</th><th>Joueur</th><th class=\"num\">Gemmes</th><th>Sublimations</th><th>Notes</th><th>Maj</th></tr>";
            for (var r = 0; r < offers.length; r++) {
                var row = offers[r];
                var rid = String(row.id || "");
                var oType = row.offer_type === "buy" ? "Achat" : "Vente";
                var oCls = row.offer_type === "buy" ? "cyan" : "yellow";
                var upd = row.updated_at ? String(row.updated_at).slice(0, 16).replace("T", " ") : "-";
                var ownerTxt = row.is_own_offer ? "Moi" : "Autre";
                html += "<tr oncontextmenu=\"openContextMenu(event,&quot;hdv_offer&quot;,&quot;" + safeName + "&quot;,&quot;" + rid + "&quot;)\">";
                html += "<td class=\"" + oCls + "\">" + oType + "</td>";
                html += "<td>" + ownerTxt + "</td>";
                html += "<td class=\"num\">" + fmt(Math.round(row.unit_price || 0)) + "</td>";
                html += "<td class=\"num\">" + (row.quantity || 0) + "</td>";
                html += "<td>" + esc(row.seller_name || "-") + "</td>";
                html += "<td class=\"num\">" + (row.gem_slots || 0) + "</td>";
                html += "<td>" + esc(row.sublimations || "-") + "</td>";
                html += "<td>" + esc(row.notes || "-") + "</td>";
                html += "<td class=\"dim\">" + esc(upd) + "</td>";
                html += "</tr>";
            }
            html += "</table></div></details>";
        }
        html += "</div>";
    }

    return html;
}

function renderActivity() {
    var events = data.session.recent_events.slice().reverse();
    if (events.length === 0) return "<p class=\"dim\">Aucune activite.</p>";
    var html = "<div class=\"feed\">";
    for (var i = 0; i < events.length; i++) {
        var e = events[i];
        html += "<div class=\"feed-item\"><span class=\"feed-ts\">" + e.ts + "</span><span class=\"feed-icon\">" + esc(e.icon) + "</span><span>" + esc(e.text) + "</span></div>";
    }
    html += "</div>";
    return html;
}

function renderCombats() {
    var s = data.session;
    var combats = s.combats || [];
    if (!combats.length) return "<p class=\"dim\">Aucun detail de combat detecte dans les logs pour le moment.</p>";

    var html = "<div class=\"section\"><div class=\"section-title\">Combats details (degats par tour et competence)</div></div>";
    for (var i = 0; i < combats.length; i++) {
        var f = combats[i];
        var summary = "Combat #" + esc(String(f.fight_id || "?")) + " | Degats: " + fmt(f.total_damage || 0) + " | Tours: " + ((f.turns && f.turns.length) ? f.turns.length : 0);
        html += "<details class=\"collapse\"" + (i === 0 ? " open" : "") + "><summary>" + summary + "</summary><div class=\"collapse-body\">";
        var turns = f.turns || [];
        if (!turns.length) {
            html += "<div class=\"tiny-note\">Aucun detail de tour pour ce combat.</div>";
            html += "</div></details>";
            continue;
        }
        for (var t = 0; t < turns.length; t++) {
            var tr = turns[t];
            html += "<details class=\"collapse\"" + (t === 0 ? " open" : "") + "><summary>Tour " + tr.turn + " | Degats: " + fmt(tr.total_damage || 0) + "</summary><div class=\"collapse-body\">";
            var skills = tr.skills || [];
            if (!skills.length) {
                html += "<div class=\"tiny-note\">Aucune competence detectee.</div>";
                html += "</div></details>";
                continue;
            }
            html += "<table><tr><th>Competence</th><th class=\"num\">Degats</th></tr>";
            for (var sIdx = 0; sIdx < skills.length; sIdx++) {
                var sk = skills[sIdx];
                html += "<tr><td>" + esc(sk.name || "(non precise)") + "</td><td class=\"num pos\">" + fmt(sk.damage || 0) + "</td></tr>";
            }
            html += "</table></div></details>";
        }
        html += "</div></details>";
    }
    return html;
}

function render() {
    if (!data) return;
    renderHeader();
    var el = document.getElementById("content");
    switch(currentTab) {
        case "dashboard": el.innerHTML = renderDashboard(); break;
        case "inventory": el.innerHTML = renderInventory(); break;
        case "metiers": el.innerHTML = renderMetiers(); break;
        case "hdv": el.innerHTML = renderHDV(); break;
        case "combats": el.innerHTML = renderCombats(); break;
        case "activity": el.innerHTML = renderActivity(); break;
    }
}

function toggleSort(col) {
    if (sortCol === col) sortDir *= -1;
    else { sortCol = col; sortDir = -1; }
    render();
}


function setMetier(name, level, xp, target, xpRemaining) {
    var body = {metier: name};
    var currentM = data.session.metiers[name] || {};
    if (level !== null) body.level = parseInt(level) || 0;
    else body.level = currentM.base_level || 0;
    if (xp !== null) body.xp = parseInt(xp) || 0;
    else body.xp = currentM.base_xp || 0;
    if (target !== null) body.target = parseInt(target) || 0;
    else body.target = currentM.target_level || 0;

    if (xp !== null) {
        var levelForCurve = parseInt(currentM.level || body.level || 0, 10) || 0;
        body.learn_curve = true;
        body.level_for_curve = levelForCurve;
        if (xpRemaining !== null && xpRemaining !== undefined) {
            body.xp_remaining = parseInt(xpRemaining, 10) || 0;
        } else if ((currentM.xp_next || 0) > 0) {
            body.xp_remaining = parseInt(currentM.xp_next, 10) || 0;
        }
    }

    fetch("/api/metier", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(body)
    });
}
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

fetch("/api/data").then(function(r){return r.json();}).then(function(d){data=d;render(); if (data && data.config && !data.config.onboarding_done) openOnboarding();}).catch(function(){});

var evtSource = new EventSource("/api/stream");
evtSource.onmessage = function(e) { data = JSON.parse(e.data); render(); };

setInterval(function() {
    if (!data || evtSource.readyState === EventSource.CLOSED) {
        fetch("/api/data").then(function(r){return r.json();}).then(function(d){data=d;render();});
    }
}, 5000);

document.addEventListener("click", function() { closeItemMenu(); });
document.addEventListener("contextmenu", function(ev) {
    if (!ev.target.closest("[oncontextmenu]")) {
        openContextMenu(ev, "zone", buildZoneNameFromEvent(ev), "");
    }
});
document.addEventListener("keydown", function(ev) {
    if (ev.key === "Escape") {
        closeItemMenu();
        closeIconPicker();
    }
});
