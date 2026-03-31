/* Icons Atlas - preloaded base64 icons */
var _iconsAtlas = null;
function loadIconsAtlas(cb) {
    if (_iconsAtlas) { if (cb) cb(); return; }
    fetch("/api/icons-atlas")
        .then(function(r) { return r.json(); })
        .then(function(data) { _iconsAtlas = data; console.log("Atlas loaded:", Object.keys(data).length, "icons"); if (cb) cb(); })
        .catch(function(e) { console.error("Atlas error:", e); _iconsAtlas = {}; if (cb) cb(); });
}
function getIconSrc(gfxId) {
    if (!gfxId || gfxId === 0) return null;
    var key = String(gfxId);
    if (_iconsAtlas && _iconsAtlas[key]) {
        return "data:image/webp;base64," + _iconsAtlas[key];
    }
    return "/icons/items/" + key + ".png";
}

// character.js - Onglet Personnage : 3 grilles (Build, Inventaire, Coffre)
// Données locales uniquement : build-result.json, inventory_bags.json, account_chest_full.json
// Enrichissement via CDN local (cdn_items.json décompilé) + noms du coffre




import { fetchJson } from "../api.js";
import { initTooltipDelegation } from "../tooltip.js";

/* Constantes rareté */
var RARITY = [
    { name: "Commun",     hex: "#c0c0c0", cls: "common"    },
    { name: "Inhabituel", hex: "#ffffff", cls: "unusual"   },
    { name: "Rare",       hex: "#22b069", cls: "rare"      },
    { name: "Mythique",   hex: "#ff8c19", cls: "mythic"    },
    { name: "Legendaire", hex: "#ffee00", cls: "legendary" },
    { name: "Relique",    hex: "#ff55ff", cls: "relic"     },
    { name: "Souvenir",   hex: "#66ccff", cls: "souvenir"  },
    { name: "Epique",     hex: "#ff6600", cls: "epic"      }
];

var GEM_COLORS = { Red: "#e74c3c", Blue: "#3498db", Green: "#2ecc71", White: "#ecf0f1" };

function esc(s) {
    var d = document.createElement("div");
    d.textContent = s || "";
    return d.innerHTML;
}

function ri(idx) {
    return RARITY[Math.min(Math.max(idx || 0, 0), 7)];
}

/* Cellule */
function cellHTML(item) {
    var rMap = {1:{cls:"common",hex:"#aaa"},2:{cls:"uncommon",hex:"#fff"},3:{cls:"rare",hex:"#4fc"},4:{cls:"mythic",hex:"#fa0"},5:{cls:"legend",hex:"#f80"},6:{cls:"relic",hex:"#e44"},7:{cls:"epic",hex:"#e4e"}};
    var id = item.id || item.refId || item.itemId || 0;
    var nm = item.name || item.title || ("#" + id);
    var r = rMap[item.rarity] || {cls:"common",hex:"#555"};
    var gfx = item.gfxId || item.gfx || 0;
    var qty = item.quantity || 1;
    var lvl = item.level || "";
    var desc = item.description || "";
    var gems = item.gemSlots || item.gems || [];
    var hasGems = gems.length > 0 || item.enchantCount > 0;

    /* Tooltip complet */
    var tipParts = [nm];
    if (lvl) tipParts.push("Niveau " + lvl);
    var rName = {1:"Commun",2:"Inhabituel",3:"Rare",4:"Mythique",5:"Legendaire",6:"Relique",7:"Epique"}[item.rarity];
    if (rName) tipParts.push(rName);
    if (desc) tipParts.push(desc.length > 200 ? desc.substring(0, 200) + "..." : desc);
    var tipText = tipParts.join("\n");

    var h = "";
    h += "<div class=\"gc\" style=\"border-color:" + r.hex + "\"";
    h += " data-tooltip=\"" + esc(tipText).replace(/\n/g, "&#10;") + "\"";
    h += " data-id=\"" + id + "\">";

    /* Icon area */
    h += "<div class=\"gc__icon-area\">";
    if (gfx) {
        var cdnUrl = getIconSrc(gfx);
        h += "<img class=\"gc__img\" src=\"" + cdnUrl + "\" alt=\"\" loading=\"lazy\" onerror=\"this.style.display='none';this.nextElementSibling.style.display='flex'\">";
        h += "<span class=\"gc__fb\" style=\"display:none\">" + esc(nm.substring(0, 3)).toUpperCase() + "</span>";
    } else {
        h += "<span class=\"gc__fb\">" + esc(nm.substring(0, 3)).toUpperCase() + "</span>";
    }
    h += "</div>";

    /* Badges */
    if (qty > 1) h += "<span class=\"gc__qty\">x" + qty + "</span>";
    if (lvl) h += "<span class=\"gc__lvl\">" + lvl + "</span>";

    /* Gem dots */
    if (gems.length > 0) {
        var gemH = "";
        var gColors = {1:"#e33",2:"#3b3",3:"#33e",4:"#fff"};
        for (var gi = 0; gi < gems.length; gi++) {
            var gc = gColors[gems[gi]] || gColors[gems[gi].color] || "#888";
            gemH += "<span class=\"gc__gem-dot\" style=\"background:" + gc + "\"></span>";
        }
        h += "<div class=\"gc__gems\">" + gemH + "</div>";
    }
    if (hasGems) h += "<span class=\"gc__ench\">&#10024;</span>";

    /* Nom complet sur 2 lignes */
    h += "<div class=\"gc__name\">" + esc(nm) + "</div>";

    if (item.slot) h += "<span class=\"gc__slot\">" + esc(item.slot) + "</span>";
    if (item.owned) h += "<span class=\"gc__owned\">&#10003;</span>";
    h += "</div>";
    return h;
}

/* Section grille */
function gridHTML(title, badge, subtitle, items) {
    var count = items.length;
    var cells = "";
    if (count > 0) {
        items.forEach(function(it) { cells += cellHTML(it); });
    } else {
        cells = "<div class=\"gg__empty\">" + esc(subtitle || "Aucun objet") + "</div>";
    }
    var h = "";
    h += "<section class=\"gg\">";
    h += "<header class=\"gg__head\">";
    h += "<h3 class=\"gg__title\">" + esc(title) + " <span class=\"gg__badge\">" + esc(badge) + "</span></h3>";
    if (subtitle && count > 0) h += "<span class=\"gg__sub\">" + esc(subtitle) + "</span>";
    h += "</header>";
    h += "<div class=\"gg__cells\">" + cells + "</div>";
    h += "</section>";
    return h;
}

/* Patrimoine */
function patrimoineHTML(bc, ic, cc, timestamps) {
    var total = bc + ic + cc;
    var h = "";
    h += "<div class=\"pat\">";
    h += "<h3 class=\"pat__title\">Patrimoine</h3>";
    h += "<div class=\"pat__row\">";
    h += "<span class=\"pat__tag\">Build <strong>" + bc + "</strong></span>";
    h += "<span class=\"pat__tag\">Inventaire <strong>" + ic + "</strong></span>";
    h += "<span class=\"pat__tag\">Coffre <strong>" + cc + "</strong></span>";
    h += "<span class=\"pat__tag pat__total\">Total <strong>" + total + "</strong></span>";
    h += "</div>";
    h += "<div class=\"pat__ts\">";
    timestamps.forEach(function(t) { h += "<span>" + esc(t) + "</span>"; });
    h += "</div></div>";
    return h;
}

/* Chargement principal */
async function loadSheet(container) {
    container.innerHTML = "<div class=\"gc-loading\">Chargement des donnees...</div>";

    var buildData = null, invData = null, chestData = null;

    try {
        var results = await Promise.allSettled([
            fetchJson("/api/build-data"),
            fetchJson("/api/inventory/local"),
            fetchJson("/api/chest")
        ]);
        if (results[0].status === "fulfilled" && !results[0].value.error) buildData = results[0].value;
        if (results[1].status === "fulfilled" && !results[1].value.error) invData = results[1].value;
        if (results[2].status === "fulfilled" && !results[2].value.error) chestData = results[2].value;
    } catch (err) {
        console.error("[character] Fetch error:", err);
        container.innerHTML = "<div class=\"gc-error\">Erreur : " + esc(err.message) + "</div>";
        return;
    }

    var html = "";

    // Header joueur
    if (invData && invData.player) {
        html += "<div class=\"inv-player-header\">";
        html += "<div><h2 class=\"inv-player-name\">" + esc(invData.player) + "</h2>";
        html += "<span class=\"inv-player-detail\">Niv. " + (invData.level || "?") + "</span></div>";
        html += "<div class=\"inv-player-stats\">";
        if (invData.kamas > 0) html += "<span class=\"inv-stat\">" + invData.kamas.toLocaleString("fr-FR") + " Kamas</span>";
        html += "</div></div>";
    }

    // Grille 1 : Build
    var buildItems = [];
    if (buildData && buildData.items) {
        buildData.items.forEach(function(it) {
            buildItems.push({
                refId: it.id || it.refId || 0,
                name: it.name || "?",
                level: it.level || 0,
                rarity: it.rarity || 0,
                gfxId: it.gfxId || 0,
                quantity: 1,
                slot: it.slot || "",
                owned: it.owned || false
            });
        });
    }
    var buildSub = "";
    if (buildData) {
        var subs = (buildData.sublimations || []).length;
        var burst = buildData.burst || {};
        var parts = [];
        if (burst.masteryPool) parts.push("Mastery Pool: " + burst.masteryPool);
        if (subs > 0) parts.push(subs + " sublimations");
        buildSub = parts.join(" — ");
    }
    html += gridHTML("Build", buildItems.length + " pieces", buildSub || "Aucun build (build-result.json)", buildItems);

    // Grille 2 : Inventaire
    if (invData && invData.bags && invData.bags.length > 0) {
        invData.bags.forEach(function(bag) {
            var bagItems = [];
            (bag.items || []).forEach(function(it) {
                bagItems.push({
                    refId: it.refId || 0,
                    name: it.name || ("#" + it.refId),
                    level: it.level || 0,
                    rarity: it.rarity || 0,
                    gfxId: it.gfxId || 0,
                    quantity: it.quantity || 1
                });
            });
            html += gridHTML(bag.bagName || "Sac", bag.itemCount + "/" + bag.capacity, "Sac vide", bagItems);
        });
    } else {
        html += gridHTML("Inventaire", "0", "Lance le jeu avec l agent pour capturer l inventaire.", []);
    }

    // Grille 3 : Coffre
    if (chestData && chestData.compartments && chestData.compartments.length > 0) {
        chestData.compartments.forEach(function(comp) {
            var compItems = [];
            (comp.items || []).forEach(function(it) {
                compItems.push({
                    refId: it.itemId || 0,
                    name: it.name || ("#" + it.itemId),
                    level: it.level || 0,
                    rarity: it.rarity || 0,
                    gfxId: it.gfxId || 0,
                    quantity: it.quantity || 1,
                    enchant: it.enchant || null
                });
            });
            var enchTag = comp.enchantedCount > 0 ? " — " + comp.enchantedCount + " enchantes" : "";
            html += gridHTML("Coffre : " + comp.name, comp.itemCount + "/" + comp.capacity, comp.emptySlots + " slots vides" + enchTag, compItems);
        });
    } else {
        html += gridHTML("Coffre", "0", "Ouvre ton coffre en jeu avec l agent actif.", []);
    }

    // Patrimoine
    var bc = buildItems.length;
    var ic = invData ? (invData.totalItems || 0) : 0;
    var cc = chestData ? (chestData.totalItems || 0) : 0;
    var ts = [];
    if (invData && invData.timestamp) ts.push("Inventaire : " + invData.timestamp);
    if (chestData && chestData.lastUpdate) ts.push("Coffre : " + chestData.lastUpdate);
    html += patrimoineHTML(bc, ic, cc, ts);

    container.innerHTML = html;
    initTooltipDelegation(container);
    attachCharacterPriceHover();
    console.log("[character] Rendu : build=" + bc + ", inv=" + ic + ", coffre=" + cc);
}

/* Point d entree */
export async function loadCharacter() {
    console.log("[character] init");
    var container = document.getElementById("ficheContent");
    if (!container) {
        container = document.querySelector("[data-subcontent=\"fiche\"]");
    }
    if (!container) {
        console.error("[character] Container introuvable !");
        return;
    }
    await loadSheet(container);
}

window.__loadCharacterTab = function() {
    loadCharacter();
};

// Pre-charger l'atlas
loadIconsAtlas();


// === GRAPHE PRIX MOUSEOVER (personnage) ===
function attachCharacterPriceHover() {
    var container = document.getElementById("ficheContent") || document.getElementById("charContainer") || document.getElementById("persoFichePanel");
    if (!container) return;

    container.addEventListener("mouseover", function(e) {
        var card = e.target.closest(".gc[data-id]");
        if (!card) return;
        var itemId = parseInt(card.dataset.id);
        if (!itemId || itemId <= 0) return;
        var itemName = card.querySelector(".gc__name") ? card.querySelector(".gc__name").textContent.trim() : "";
        if (typeof showPriceTooltip === "function") {
            showPriceTooltip(itemId, itemName, e);
        } else if (window.__showPriceTooltip) {
            window.__showPriceTooltip(itemId, itemName, e);
        }
    });

    container.addEventListener("mousemove", function(e) {
        if (typeof positionTooltip === "function") positionTooltip(e);
        else if (window.__positionTooltip) window.__positionTooltip(e);
    });

    container.addEventListener("mouseout", function(e) {
        var card = e.target.closest(".gc[data-id]");
        if (card) {
            if (typeof hidePriceTooltip === "function") hidePriceTooltip();
            else if (window.__hidePriceTooltip) window.__hidePriceTooltip();
        }
    });
}
