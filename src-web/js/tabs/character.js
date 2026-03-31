// character.js — Page Personnage : Build / Inventaire / Coffre

import { fetchJson } from "../api.js";
import { getRarity, escHtml, loadIconsAtlas as sharedLoadAtlas, getIconSrc as sharedGetIcon } from "../shared/item.js";
import { initTooltipDelegation } from "../tooltip.js";

const GEM_COLOR = { 1: "#e04040", 2: "#38c454", 3: "#4466ee", 4: "#cccccc" };

// ── Carte d'un item ──────────────────────────────────────────────
function itemCard(it) {
    const id      = it.id || it.refId || it.itemId || 0;
    const nm      = it.name || ("#" + id);
    const r       = getRarity(it.rarity || 0);
    const gfx     = it.gfxId || it.gfx || 0;
    const qty     = it.quantity || 1;
    const lvl     = it.level || "";
    const gems    = it.gemSlots || it.gems || [];
    const iconUrl = gfx ? sharedGetIcon(gfx) : "";

    let h = `<div class="ch-card" style="--rc:${r.hex}" data-item-id="${id}">`;
    h += `<div class="ch-card__ico">`;
    if (iconUrl) {
        h += `<img src="${escHtml(iconUrl)}" alt="" loading="lazy" onerror="this.style.display='none';this.nextSibling.style.display='flex'">`;
        h += `<span class="ch-card__ico-fb" style="display:none">${escHtml(nm.slice(0, 3).toUpperCase())}</span>`;
    } else {
        h += `<span class="ch-card__ico-fb">${escHtml(nm.slice(0, 3).toUpperCase())}</span>`;
    }
    h += `</div>`;
    if (qty > 1) h += `<span class="ch-card__qty">x${qty}</span>`;
    if (lvl)     h += `<span class="ch-card__lvl">${lvl}</span>`;
    if (gems.length > 0) {
        h += `<div class="ch-card__gems">`;
        gems.forEach(g => {
            const c = GEM_COLOR[g] || GEM_COLOR[g && g.color] || "#555";
            h += `<span class="ch-card__gem" style="background:${c}"></span>`;
        });
        h += `</div>`;
    }
    h += `<div class="ch-card__name">${escHtml(nm)}</div>`;
    h += `</div>`;
    return h;
}

// ── Section repliable (Build / Sac / Compartiment) ──────────────
function renderSection(icon, title, badge, meta, items) {
    const cells = items.length
        ? items.map(itemCard).join("")
        : `<span class="ch-empty">${escHtml(meta || "Aucun objet")}</span>`;

    // Stats inline dans le header
    let statsHtml = "";
    if (items.length > 0) {
        const leveled = items.filter(it => it.level > 0);
        if (leveled.length > 0) {
            const avg = Math.round(leveled.reduce((s, it) => s + it.level, 0) / leveled.length);
            statsHtml += `<span class="ch-section__stat">Moy.\u00a0niv.\u00a0${avg}</span>`;
        }
        const top = items.slice().sort((a, b) => (b.level || 0) - (a.level || 0))[0];
        if (top && top.name && !top.name.startsWith("#")) {
            const nm = top.name.length > 22 ? top.name.slice(0, 22) + "\u2026" : top.name;
            const topId = top.id || top.refId || top.itemId || 0;
            statsHtml += `<span class="ch-section__stat ch-section__stat--top" data-item-id="${topId}">${escHtml(nm)}\u00a0niv.\u00a0${top.level || "?"}</span>`;
        }
    }

    return `
<section class="ch-section ch-section--collapsed">
  <div class="ch-section__head" role="button" tabindex="0" onclick="this.closest('.ch-section').classList.toggle('ch-section--collapsed')" onkeydown="if(event.key==='Enter'||event.key===' ')this.click()">
    <span class="ch-section__chevron">&#9660;</span>
    <span class="ch-section__icon">${icon}</span>
    <h3 class="ch-section__title">${escHtml(title)}</h3>
    <span class="ch-section__badge">${escHtml(String(badge))}</span>
    ${statsHtml}
    ${meta && items.length ? `<span class="ch-section__meta">${escHtml(meta)}</span>` : ""}
  </div>
  <div class="ch-grid">${cells}</div>
</section>`;
}

// ── Header joueur ────────────────────────────────────────────────
function playerHeader(invData) {
    const name  = invData.player && invData.player !== "<undefined>" ? invData.player : null;
    const level = invData.level || "";
    const kamas = invData.kamas > 0 ? invData.kamas.toLocaleString("fr-FR") + " K" : null;
    if (!name && !level && !kamas) return "";
    return `
<div class="ch-header">
  <div class="ch-header__left">
    ${name  ? `<span class="ch-header__name">${escHtml(name)}</span>` : ""}
    ${level ? `<span class="ch-header__level">Niv.\u00a0${level}</span>` : ""}
  </div>
  ${kamas ? `<span class="ch-header__kamas">${kamas}</span>` : ""}
</div>`;
}

// ── Catégorisation des sacs ──────────────────────────────────────
function bagCategory(bag) {
    const nm = (bag.bagName || "").toLowerCase();
    if (nm.includes("qu\u00eate") || nm.includes("quete") || nm.includes("quest") || nm.includes("objet de qu")) return "quest";
    if (nm.includes("caissette") || nm.includes("aventuri")) return "crate";
    return "normal";
}

// ── Barre de résumé ──────────────────────────────────────────────
function summaryBar(invCount, chestCount, invTs, chestTs) {
    return `
<div class="ch-summary">
  <div class="ch-summary__stat">
    <span class="ch-summary__label">Inventaire</span>
    <span class="ch-summary__val">${invCount} items</span>
  </div>
  <div class="ch-summary__sep"></div>
  <div class="ch-summary__stat">
    <span class="ch-summary__label">Coffre</span>
    <span class="ch-summary__val">${chestCount} items</span>
  </div>
  <div class="ch-summary__ts">
    ${invTs   ? `<span>Inv.\u00a0: ${escHtml(invTs)}</span>`    : ""}
    ${chestTs ? `<span>Coffre\u00a0: ${escHtml(chestTs)}</span>` : ""}
  </div>
</div>`;
}

// ── Chargement principal ─────────────────────────────────────────
async function loadSheet(container) {
    container.innerHTML = `<div class="ch-loading">Chargement...</div>`;
    let invData = null, chestData = null;
    try {
        const results = await Promise.allSettled([
            fetchJson("/api/inventory/local"),
            fetchJson("/api/chest")
        ]);
        if (results[0].status === "fulfilled" && !results[0].value.error) invData   = results[0].value;
        if (results[1].status === "fulfilled" && !results[1].value.error) chestData = results[1].value;
    } catch (err) {
        container.innerHTML = `<div class="ch-error">Erreur : ${escHtml(err.message)}</div>`;
        return;
    }

    let html = "";

    // Header joueur
    if (invData && (invData.player || invData.level)) {
        html += playerHeader(invData);
    }

    // Trier les sacs par catégorie
    const bags = invData && invData.bags ? invData.bags : [];
    const normalBags = bags.filter(b => bagCategory(b) === "normal");
    const crateBags  = bags.filter(b => bagCategory(b) === "crate");
    const questBags  = bags.filter(b => bagCategory(b) === "quest");

    // Coffres triés alphabétiquement
    const compartments = chestData && chestData.compartments
        ? chestData.compartments.slice().sort((a, b) => (a.name || "").localeCompare(b.name || "", "fr"))
        : [];

    function renderBag(bag) {
        const items = (bag.items || []).map(it => ({
            id: it.refId || 0,
            name: it.name || ("#" + it.refId),
            level: it.level || 0,
            rarity: it.rarity || 0,
            gfxId: it.gfxId || 0,
            quantity: it.quantity || 1,
        }));
        const meta = (bag.capacity - (bag.itemCount || 0)) + " slots libres";
        html += renderSection("&#127526;", bag.bagName || "Sac",
            (bag.itemCount || 0) + " / " + bag.capacity, meta, items);
    }

    // 1. Sacs normaux
    if (normalBags.length > 0) {
        normalBags.forEach(renderBag);
    } else if (bags.length === 0) {
        html += renderSection("&#127526;", "Inventaire", "0 items",
            "Lance le jeu avec l'agent pour capturer l'inventaire.", []);
    }

    // 2. Caissettes de l'aventurier
    crateBags.forEach(renderBag);

    // 3. Coffre (compartiments triés alphabétiquement)
    if (compartments.length > 0) {
        compartments.forEach(comp => {
            const items = (comp.items || []).map(it => ({
                id: it.itemId || 0,
                name: it.name || ("#" + it.itemId),
                level: it.level || 0,
                rarity: it.rarity || 0,
                gfxId: it.gfxId || 0,
                quantity: it.quantity || 1,
                gems: it.enchant ? Object.values(it.enchant) : [],
            }));
            const enchStr = comp.enchantedCount > 0 ? comp.enchantedCount + " enchantes" : "";
            const meta = [comp.emptySlots + " slots libres", enchStr].filter(Boolean).join(" · ");
            html += renderSection("&#128230;", comp.name || "Compartiment",
                (comp.itemCount || 0) + " / " + comp.capacity, meta, items);
        });
    } else {
        html += renderSection("&#128230;", "Coffre", "0 items",
            "Ouvre ton coffre en jeu avec l'agent actif.", []);
    }

    // 4. Sacs de quêtes (en dernier)
    questBags.forEach(renderBag);

    // Résumé bas de page
    html += summaryBar(
        invData   ? (invData.totalItems   || 0) : 0,
        chestData ? (chestData.totalItems || 0) : 0,
        invData   && invData.timestamp    ? invData.timestamp    : "",
        chestData && chestData.lastUpdate ? chestData.lastUpdate : ""
    );

    container.innerHTML = html;
    initTooltipDelegation(container);
}

// ── Export ───────────────────────────────────────────────────────
export async function loadCharacter() {
    const container = document.getElementById("ficheContent");
    if (!container) return;
    await loadSheet(container);
}

window.__loadCharacterTab = () => loadCharacter();
sharedLoadAtlas();
