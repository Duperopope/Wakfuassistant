// equipment.js — Builder Sram : compare build actuel / possédés / HDV par slot

import { fetchJson } from "../api.js";
import { getRarity, escHtml, getIconSrc } from "../shared/item.js";
import { prefillCache } from "../tooltip.js";

const SOURCE_LABEL = { build: "Équipé", inventaire: "🎒 Sac", coffre: "📦 Coffre", hdv: "💰 HDV" };
const SOURCE_CLASS = { build: "bld-src--equip", inventaire: "bld-src--inv", coffre: "bld-src--chest", hdv: "bld-src--hdv" };

// ── Utilitaires ─────────────────────────────────────────────────────
function fmtScore(n) { return n >= 1000 ? (n / 1000).toFixed(1) + "k" : String(n); }
function fmtPrice(n) {
    if (!n) return "—";
    if (n >= 1e6) return (n / 1e6).toFixed(1) + "M";
    if (n >= 1000) return Math.round(n / 1000) + "k";
    return String(n);
}

function gainTag(gain) {
    if (gain === null || gain === undefined) return "";
    if (gain > 0) return `<span class="bld-gain bld-gain--up">+${fmtScore(gain)}</span>`;
    if (gain < 0) return `<span class="bld-gain bld-gain--down">${fmtScore(gain)}</span>`;
    return `<span class="bld-gain bld-gain--eq">=</span>`;
}

function breakdownTip(bd) {
    if (!bd || !Object.keys(bd).length) return "";
    return Object.entries(bd)
        .filter(([, v]) => v !== 0)
        .sort((a, b) => Math.abs(b[1]) - Math.abs(a[1]))
        .map(([k, v]) => `${k}: ${v > 0 ? "+" : ""}${v}`)
        .join(" | ");
}

// ── Ligne item ───────────────────────────────────────────────────────
function itemRow(it, gain, isCurrent, slotInfo) {
    if (!it) return "";
    const r = getRarity(it.rarity || 0);
    const borderStyle = `border:2px solid ${escHtml(r.hex)}`;
    const icon = it.gfxId
        ? `<img src="${getIconSrc(it.gfxId)}" width="40" height="40" style="border-radius:6px;${borderStyle}" onerror="this.style.display='none'">`
        : `<span class="bld-no-icon" style="${borderStyle};border-radius:6px"></span>`;

    const srcLabel = SOURCE_LABEL[it.source] || it.source;
    const srcCls   = SOURCE_CLASS[it.source]  || "";
    const tip      = breakdownTip(it.breakdown);
    const rowCls   = isCurrent ? "bld-row bld-row--current" : "bld-row";
    const priceTag = it.unit_price ? `<span class="bld-price">${fmtPrice(it.unit_price)}</span>` : "";
    const lvlTag   = it.level ? `<span class="bld-row__lvl">niv.${it.level}</span>` : "";

    // Bouton "Équiper" pour les lignes alternatives
    let equipBtn = "";
    if (!isCurrent && slotInfo) {
        equipBtn = `<button class="bld-btn-equip" title="Définir comme équipé"
            data-slot="${escHtml(slotInfo.slot)}"
            data-type-id="${slotInfo.typeId || ""}"
            data-item-id="${it.id}">⚡</button>`;
    }
    // Bouton "Réinitialiser" pour les lignes actuelles en mode manuel
    let resetBtn = "";
    if (isCurrent && slotInfo && slotInfo.isManual) {
        resetBtn = `<button class="bld-btn-reset-slot" title="Réinitialiser ce slot"
            data-slot="${escHtml(slotInfo.slot)}">✕</button>`;
    }

    return `<div class="${rowCls}" data-item-id="${it.id}" data-item-name="${escHtml(it.name)}" data-item-rarity="${it.rarity || 0}">
  ${icon}
  <div class="bld-row__info">
    <span class="bld-row__name" style="color:${escHtml(r.hex)}" title="${escHtml(it.name)}">${escHtml(it.name.length > 28 ? it.name.slice(0, 28) + "…" : it.name)}</span>
    <div class="bld-row__meta">
      ${lvlTag}
      ${tip ? `<span class="bld-tip" title="${escHtml(tip)}">📊</span>` : ""}
    </div>
  </div>
  <div class="bld-row__right">
    <span class="bld-row__score">${fmtScore(it.score)}</span>
    ${gainTag(gain)}
    <span class="bld-src ${srcCls}">${srcLabel}</span>
    ${priceTag}
    ${equipBtn}${resetBtn}
  </div>
</div>`;
}

// ── Carte de slot ────────────────────────────────────────────────────
function slotCard(s, manualSlots) {
    const gainOwned = s.gain_owned ?? null;
    const gainHdv   = s.gain_hdv   ?? null;
    const bestGain  = Math.max(gainOwned ?? 0, gainHdv ?? 0);
    const hasUpgrade = bestGain > 0;
    const isManual   = manualSlots.includes(s.slot);
    const cls = hasUpgrade ? "bld-slot bld-slot--upgrade" : "bld-slot";

    const slotInfo = { slot: s.slot, typeId: s.typeId, isManual };

    let rows = itemRow(s.current, null, true, slotInfo);
    if (s.best_owned) rows += itemRow(s.best_owned, gainOwned, false, slotInfo);
    if (s.best_hdv)   rows += itemRow(s.best_hdv,   gainHdv,   false, slotInfo);
    if (!s.best_owned && !s.best_hdv) {
        rows += `<div class="bld-row bld-row--empty">Aucune alternative trouvée</div>`;
    }

    const badgeHtml = hasUpgrade
        ? `<span class="bld-slot__badge">↑ +${fmtScore(bestGain)}</span>`
        : "";
    const manualBadge = isManual
        ? `<span class="bld-slot__manual">Manuel</span>`
        : "";

    return `<div class="${cls}">
  <div class="bld-slot__head">
    <span class="bld-slot__name">${escHtml(s.slot)}</span>
    ${badgeHtml}
    ${manualBadge}
  </div>
  <div class="bld-slot__rows">${rows}</div>
</div>`;
}

// ── Barre de progression du score ────────────────────────────────────
function scorePct(current, potential) {
    if (!potential || potential === 0) return 0;
    return Math.min(100, Math.round((current / potential) * 100));
}

// ── État persisté ────────────────────────────────────────────────────
let _selectedLevel  = 0;  // 0 = pas de filtre
let _selectedBudget = 0;  // 0 = pas de filtre (en kamas)
let _clickHandler   = null;  // référence pour retirer l'ancien listener
let _knownPlayersCache = null;
let _nameToFileMap = {};  // map dbName → fileName
let _validFileNames = new Set();  // ensemble des noms de fichiers valides (pour valider)

async function _fetchRealPlayerNames() {
    if (_knownPlayersCache) return _knownPlayersCache;
    try {
        const data = await fetchJson("/api/players?limit=5000&sort=name&order=ASC");
        const meData2 = await fetchJson("/api/me");
        const fileNames = meData2.known_players || [];
        const dbNames = (data.players || []).map(p => p.name);
        _nameToFileMap = {};
        _validFileNames = new Set(fileNames);
        for (const real of dbNames) {
            const sanitized = real.replace(/['']/g, "_");
            const match = fileNames.find(f => f === real || f === sanitized);
            if (match) _nameToFileMap[real] = match;
        }
        _knownPlayersCache = dbNames;
    } catch (_) {
        _knownPlayersCache = [];
        _validFileNames = new Set();
    }
    return _knownPlayersCache;
}

// ── Sélecteur joueur actif (datalist = filtre natif + accents/apostrophes) ──
function _renderPlayerSelect(meData, realNames) {
    const current = meData.name || "";
    const players = realNames || meData.known_players || [];
    const opts = players.map(p => `<option value="${escHtml(p)}">`).join("");
    const lvlInfo = meData.level ? ` niv.${meData.level}` : "";
    return `
<label class="bld-level-label" for="bld-player-search">Personnage</label>
<input id="bld-player-search" class="bld-player-search"
       list="bld-player-list"
       value="${escHtml(current)}"
       placeholder="Rechercher…"
       autocomplete="off">
<datalist id="bld-player-list">${opts}</datalist>
${current ? `<span class="bld-player-info">${escHtml(current)}${lvlInfo}</span>` : ""}`;
}

function _bindPlayerSelect(container, meData) {
    const input = container.querySelector("#bld-player-search");
    if (!input) return;

    // Valider et envoyer quand l'utilisateur choisit dans la liste ou appuie Entrée
    const _apply = async () => {
        _knownPlayersCache = null;
        const name = input.value.trim();
        if (!name || name === (meData.name || "")) return;

        // Chercher le fileName correspondant au dbName saisi
        let fileName = _nameToFileMap[name];
        if (!fileName) {
            // Fallback : essayer les transformations de sanitization
            const sanitized = name.replace(/['\u2019]/g, "_");
            fileName = _validFileNames.has(sanitized) ? sanitized : null;
        }

        // Si on ne trouve pas un nom valide, refuser
        if (!fileName || !_validFileNames.has(fileName)) {
            alert(`"${name}" n'est pas un personnage valide. Veuillez en sélectionner un dans la liste.`);
            return;
        }

        try {
            await fetch("/api/me", {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify({ name: fileName }),
            });
        } catch (_) {}
        loadEquipment(container);
    };

    // Déclenche sur sélection datalist (change) ou Entrée
    input.addEventListener("change", _apply);
    input.addEventListener("keydown", (e) => { if (e.key === "Enter") _apply(); });
}

// ── Chargement principal ─────────────────────────────────────────────
export async function loadEquipment(container) {
    if (!container) return;

    // Conserver les valeurs saisies si déjà présentes dans le DOM
    const existingLevel  = container.querySelector("#bld-level-input");
    const existingBudget = container.querySelector("#bld-budget-input");
    if (existingLevel)  _selectedLevel  = parseInt(existingLevel.value)  || 0;
    if (existingBudget) _selectedBudget = parseInt(existingBudget.value) || 0;

    container.innerHTML = `<div class="bld-loading">Analyse du build en cours…</div>`;

    // Charger le joueur actif et la liste des joueurs connus
    let meData = { name: "", level: 0, known_players: [] };
    try { meData = await fetchJson("/api/me"); } catch (_) {}
    const _realNames = await _fetchRealPlayerNames();

    let data;
    try {
        const params = new URLSearchParams();
        if (_selectedLevel  > 0) params.set("level",  _selectedLevel);
        if (_selectedBudget > 0) params.set("budget", _selectedBudget);
        const qs = params.toString();
        data = await fetchJson("/api/builder/sram" + (qs ? "?" + qs : ""));
    } catch (e) {
        container.innerHTML = `<div class="bld-error">Erreur : ${escHtml(e.message)}</div>`;
        return;
    }

    if (data.error) {
        // Montrer aussi le sélecteur de personnage même en cas d'erreur
        container.innerHTML = `
<div class="bld-toolbar">
  <div class="bld-toolbar__left">
    <span class="bld-toolbar__title">Builder Sram</span>
  </div>
  <div class="bld-toolbar__right">
    ${_renderPlayerSelect(meData, _realNames)}
  </div>
</div>
<div class="bld-empty">${escHtml(data.error)}</div>`;
        _bindPlayerSelect(container, meData);
        return;
    }

    const { slots = [], total_score = 0, potential_score = 0, manual_equip = [],
            player_name = "", player_level = 0 } = data;
    const gain = potential_score - total_score;
    const pct  = scorePct(total_score, potential_score);

    // ── Déterminer le niveau max du build pour la valeur par défaut ──
    const maxItemLevel = slots.length
        ? Math.max(...slots.map(s => s.current?.level || 0))
        : 0;
    const displayLevel  = _selectedLevel  || maxItemLevel || 140;
    const displayBudget = _selectedBudget || "";

    const hasManual = manual_equip.length > 0;
    const activePlayerName  = player_name  || meData.name  || "";
    const activePlayerLevel = player_level || meData.level || 0;

    // ── HTML ─────────────────────────────────────────────────────────
    let html = `
<div class="bld-toolbar">
  <div class="bld-toolbar__left">
    <span class="bld-toolbar__title">Builder Sram</span>
    <span class="bld-toolbar__sub">Score offensif burst mêlée</span>
  </div>
  <div class="bld-toolbar__right">
    ${_renderPlayerSelect({ ...meData, name: activePlayerName, level: activePlayerLevel }, _realNames)}
    <label class="bld-level-label" for="bld-level-input">Niv. max</label>
    <input id="bld-level-input" class="bld-level-input" type="number" min="1" max="230"
           value="${displayLevel}" placeholder="140">
    <label class="bld-level-label" for="bld-budget-input">Budget (K)</label>
    <input id="bld-budget-input" class="bld-level-input" type="number" min="0"
           value="${displayBudget}" placeholder="illimité">
    <button class="bld-btn-refresh" id="bld-refresh-btn">Actualiser</button>
    ${hasManual ? `<button class="bld-btn-reset-all" id="bld-reset-all-btn" title="Réinitialiser tous les slots manuels">⟳ Reset build</button>` : ""}
  </div>
</div>

<div class="bld-scores">
  <div class="bld-score-block">
    <span class="bld-score-block__label">Score actuel</span>
    <span class="bld-score-block__val">${fmtScore(total_score)}</span>
  </div>
  <div class="bld-score-progress">
    <div class="bld-score-progress__bar">
      <div class="bld-score-progress__fill" style="width:${pct}%"></div>
    </div>
    <span class="bld-score-progress__pct">${pct}%</span>
  </div>
  <div class="bld-score-block bld-score-block--potential">
    <span class="bld-score-block__label">Potentiel max</span>
    <span class="bld-score-block__val">${fmtScore(potential_score)}${gain > 0 ? ` <sup class="bld-gain bld-gain--up">+${fmtScore(gain)}</sup>` : ""}</span>
  </div>
</div>

<div class="bld-legend">
  <span class="bld-src bld-src--equip">Équipé</span>
  <span class="bld-src bld-src--inv">🎒 Sac</span>
  <span class="bld-src bld-src--chest">📦 Coffre</span>
  <span class="bld-src bld-src--hdv">💰 HDV</span>
  <span class="bld-gain bld-gain--up">+score</span>
  <span class="bld-tip" title="Clique ⚡ sur un item alternatif pour le définir comme équipé dans ce slot">⚡ = Équiper</span>
</div>`;

    // Séparer les slots avec et sans upgrade
    const upgradeSlots = slots.filter(s => (s.gain_owned ?? 0) > 0 || (s.gain_hdv ?? 0) > 0);
    const okSlots      = slots.filter(s => (s.gain_owned ?? 0) <= 0 && (s.gain_hdv ?? 0) <= 0);

    if (upgradeSlots.length) {
        html += `<div class="bld-section-title">Améliorations disponibles (${upgradeSlots.length})</div>`;
        html += `<div class="bld-slots">${upgradeSlots.map(s => slotCard(s, manual_equip)).join("")}</div>`;
    }
    if (okSlots.length) {
        html += `<div class="bld-section-title bld-section-title--ok">Slots optimaux (${okSlots.length})</div>`;
        html += `<div class="bld-slots bld-slots--ok">${okSlots.map(s => slotCard(s, manual_equip)).join("")}</div>`;
    }

    container.innerHTML = html;

    // Prefill tooltip cache avec tous les items du builder
    const _tooltipItems = [];
    for (const s of slots) {
        for (const it of [s.current, s.best_owned, s.best_hdv]) {
            if (it) _tooltipItems.push({ id: it.id, name_fr: it.name, rarity: it.rarity, gfxId: it.gfxId, level: it.level });
        }
    }
    prefillCache(_tooltipItems);

    // ── Sélecteur joueur actif ───────────────────────────────────────
    _bindPlayerSelect(container, meData);

    // ── Bouton Actualiser ────────────────────────────────────────────
    container.querySelector("#bld-refresh-btn")?.addEventListener("click", () => {
        _selectedLevel  = parseInt(container.querySelector("#bld-level-input")?.value)  || 0;
        _selectedBudget = parseInt(container.querySelector("#bld-budget-input")?.value) || 0;
        loadEquipment(container);
    });

    // Entrée dans les inputs → actualiser
    ["#bld-level-input", "#bld-budget-input"].forEach(sel => {
        container.querySelector(sel)?.addEventListener("keydown", (e) => {
            if (e.key === "Enter") container.querySelector("#bld-refresh-btn")?.click();
        });
    });

    // ── Reset tous les slots manuels ─────────────────────────────────
    container.querySelector("#bld-reset-all-btn")?.addEventListener("click", async () => {
        await fetch("/api/builder/equip", { method: "DELETE" });
        loadEquipment(container);
    });

    // ── Délégation de clics (un seul listener, remplacé à chaque rechargement) ──
    if (_clickHandler) container.removeEventListener("click", _clickHandler);

    _clickHandler = async (e) => {
        // Bouton Équiper ⚡
        const equipBtn = e.target.closest(".bld-btn-equip");
        if (equipBtn) {
            equipBtn.disabled = true;
            equipBtn.textContent = "…";
            try {
                const res = await fetch("/api/builder/equip", {
                    method: "POST",
                    headers: { "Content-Type": "application/json" },
                    body: JSON.stringify({
                        slot:    equipBtn.dataset.slot,
                        type_id: equipBtn.dataset.typeId ? parseInt(equipBtn.dataset.typeId) : null,
                        item_id: parseInt(equipBtn.dataset.itemId),
                    }),
                });
                if (!res.ok) throw new Error(`HTTP ${res.status}`);
            } catch (err) {
                alert("Erreur lors de l'équipement : " + err.message);
                return;
            }
            loadEquipment(container);
            return;
        }

        // Bouton reset slot ✕
        const resetBtn = e.target.closest(".bld-btn-reset-slot");
        if (resetBtn) {
            const slot = encodeURIComponent(resetBtn.dataset.slot);
            try {
                const res = await fetch(`/api/builder/equip/${slot}`, { method: "DELETE" });
                if (!res.ok) throw new Error(`HTTP ${res.status}`);
            } catch (err) {
                alert("Erreur lors du reset : " + err.message);
                return;
            }
            loadEquipment(container);
        }
    };

    container.addEventListener("click", _clickHandler);
}
