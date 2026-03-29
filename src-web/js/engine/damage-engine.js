// Wakfu Build Optimizer - Damage Engine (module ES)
// Converti depuis build-generator/js/damage-engine.js v8.3

/**
 * ============================================================
 * SRAM META BUILD GENERATOR v4.0 — MULTI-TOURS
 * 
 * CHANGEMENTS MAJEURS :
 * - Simulation sur 3 tours (Prep -> Invis -> Burst)
 * - Budget PA/PW/PM reel par tour
 * - Sac a Patate : ignore les passifs on-kill (Assassin, Assaut Letal)
 * - Penalite PA gaspilles
 * - Deck de sorts recommande
 *
 * SOURCE UNIQUE : Document de reference Sram "L'Immortel" v2.7
 * GitHub : https://github.com/Duperopope/Wakfuassistant
 * FORMULE : WakfuCalc par Ectawem
 * STATS : wakfu.wiki.gg/wiki/Characteristic
 * ============================================================
 */
var DamageEngine = (function () {
  "use strict";

  /* =============================================
     RESSOURCES DE BASE SRAM (doc ref)
     ============================================= */
  var BASE_RESOURCES = {
    ap: 6, mp: 3, wp: 6, crit_base: 3
  };

  /* Cout des sorts de preparation (T1) */
  var PREP_COSTS = {
    invisibilite: { ap: 2, wp: 2 },
    double:       { ap: 2, wp: 1 },
    surineur:     { ap: 0, wp: 2 }
  };

  /* =============================================
     SYSTEME D'APTITUDES
     Source : https://wakfu.wiki.gg/wiki/Characteristic
     ============================================= */
  var APTITUDE_LIMITS = {
    intelligence: {
      hp_percent:       { limit: null, per_point: 4, unit: "% PV max" },
      resistance:       { limit: 10,   per_point: 10, unit: "Resistance elem" },
      barrier:          { limit: 10,   per_point: 1, unit: "activation/tour" },
      heals_received:   { limit: 5,    per_point: 6, unit: "% soins recus" },
      armor_hp_percent: { limit: 10,   per_point: 4, unit: "% PV en Armure" }
    },
    strength: {
      mastery:          { limit: null, per_point: 5, unit: "Maitrise elem" },
      melee_mastery:    { limit: 20,   per_point: 8, unit: "Maitrise melee" },
      distance_mastery: { limit: 20,   per_point: 8, unit: "INUTILE SRAM" },
      hp_flat:          { limit: null, per_point: 20, unit: "PV" }
    },
    agility: {
      lock:             { limit: null, per_point: 6, unit: "Tacle" },
      dodge:            { limit: null, per_point: 6, unit: "Esquive" },
      initiative:       { limit: 20,   per_point: 4, unit: "Initiative" },
      lock_and_dodge:   { limit: null, per_point: 4, unit: "Tacle+Esquive" },
      force_of_will:    { limit: 20,   per_point: 1, unit: "Volonte" }
    },
    chance: {
      crit_hit:         { limit: 20,   per_point: 1, unit: "% Crit" },
      block:            { limit: 20,   per_point: 1, unit: "% Parade" },
      crit_mastery:     { limit: null, per_point: 4, unit: "Maitrise crit" },
      rear_mastery:     { limit: null, per_point: 6, unit: "Maitrise dos" },
      berserk_mastery:  { limit: null, per_point: 8, unit: "Maitrise berserk" },
      healing_mastery:  { limit: null, per_point: 6, unit: "Maitrise soins" },
      rear_resistance:  { limit: 20,   per_point: 4, unit: "Res dos" },
      crit_resistance:  { limit: 20,   per_point: 4, unit: "Res crit" }
    },
    major: {
      ap:               { limit: 1, effect: "+1 PA" },
      mp_damage:        { limit: 1, effect: "+1 PM, +20 Maitrise" },
      range_damage:     { limit: 1, effect: "+1 Portee, +40 Maitrise" },
      wp:               { limit: 1, effect: "+2 PW" },
      armor_given:      { limit: 1, effect: "+20% Armure donnee" },
      damage_inflicted: { limit: 1, effect: "+10% DI" },
      resistance:       { limit: 1, effect: "+50 Resistance" },
      heals_performed:  { limit: 1, effect: "+10% Soins" },
      indirect_damage:  { limit: 1, effect: "+10% Indirect, +40 Maitrise" }
    }
  };

  /* =============================================
     PRESETS DE STATS — SRAM = MELEE, ZERO DISTANCE
     ============================================= */
  var STAT_PRESETS = {
    burst_melee: {
      name: "Burst Melee (Sram Standard)",
      description: "Burst au contact dans le dos. Melee + Crit.",
      intelligence: { hp_percent: 10, resistance: 10, barrier: 10, armor_hp_percent: 5 },
      strength: { mastery: 15, melee_mastery: 20 },
      agility: { dodge: 20, lock_and_dodge: 15 },
      chance: { crit_hit: 20, crit_mastery: 14 },
      major: ["ap", "damage_inflicted", "mp_damage"],
      reasoning: "Sram = melee/dos. Melee 20 (160) obligatoire. Dodge 20 + Lock&Dodge 15 pour mobilite et Fluctuation. Barrier 10 pour survie contact. PA + %DI + PM/Dmg."
    },
    burst_retenue: {
      name: "Burst PF (Retenue)",
      description: "Max burst avec PF 100 via Retenue. Invis -> PF -> Mise a mort dos.",
      intelligence: { hp_percent: 10, resistance: 10, barrier: 10, armor_hp_percent: 5 },
      strength: { mastery: 15, melee_mastery: 20 },
      agility: { dodge: 15, lock_and_dodge: 20 },
      chance: { crit_hit: 20, rear_mastery: 14 },
      major: ["ap", "damage_inflicted", "mp_damage"],
      reasoning: "Retenue = toujours dans le dos avec MdO + PF100. Rear Mastery 14 (84 dos) car frappe TOUJOURS dos en burst. Lock&Dodge 20 pour Fluctuation. Melee 20 obligatoire."
    },
    farm_chain: {
      name: "Farm / Chain Kill",
      description: "Enchainer les kills. Mobilite maximale.",
      intelligence: { hp_percent: 25, resistance: 10 },
      strength: { mastery: 15, melee_mastery: 20 },
      agility: { dodge: 25, initiative: 10 },
      chance: { crit_hit: 20, crit_mastery: 14 },
      major: ["ap", "damage_inflicted", "mp_damage"],
      reasoning: "25% PV pour survie longue. Melee 20. Dodge 25 (150) pour circuler entre mobs. PM+Dmg mobilite. Init pour jouer en premier."
    },
    aoe_traps: {
      name: "AoE / Pieges / Leurre",
      description: "Degats de zone, pieges, explosion Double.",
      intelligence: { hp_percent: 15, resistance: 10, barrier: 10 },
      strength: { mastery: 15, melee_mastery: 20 },
      agility: { lock: 20, dodge: 5, lock_and_dodge: 10 },
      chance: { crit_hit: 20, crit_mastery: 14 },
      major: ["ap", "damage_inflicted", "mp_damage"],
      reasoning: "Lock 20 (120) pour garder mobs dans pieges/Leurre. Melee 20 car pieges = contact. Barrier 10 pour survie contact."
    },
    pvp_survie: {
      name: "PvP / Survie",
      description: "Equilibre degats/survie PvP.",
      intelligence: { hp_percent: 10, resistance: 10, barrier: 10, armor_hp_percent: 5 },
      strength: { mastery: 15, melee_mastery: 20 },
      agility: { dodge: 15, lock_and_dodge: 15 },
      chance: { crit_hit: 20, block: 10, crit_mastery: 4 },
      major: ["ap", "damage_inflicted", "resistance"],
      reasoning: "Barrier 10 + Block 10 + Armor 5 + Res majeur (+50). Survie PvP max. Melee 20 toujours."
    },
    sac_a_patate: {
      name: "Test Sac a Patate",
      description: "Mannequin infini : pure DPS, pas de kill, pas de Fluctuation.",
      intelligence: { hp_percent: 10, resistance: 10, barrier: 10, armor_hp_percent: 5 },
      strength: { mastery: 15, melee_mastery: 20 },
      agility: { dodge: 20, lock_and_dodge: 15 },
      chance: { crit_hit: 20, crit_mastery: 14 },
      major: ["ap", "damage_inflicted", "mp_damage"],
      reasoning: "Mannequin PV infinis : Assassin/Assaut Letal inutiles (pas de kill). Focus pur DPS multi-tours. Pas de Fluctuation (mannequin immobile, pas de passage adjacent)."
    }
  };

  function flatResToPercent(flatRes) {
    var pct = (1 - Math.pow(0.8, flatRes / 100)) * 100;
    pct = Math.floor(pct);
    if (pct > 90) pct = 90;
    if (pct < 0) pct = 0;
    return pct;
  }

  function calcPresetBonuses(preset) {
    var b = { mastery:0, melee_mastery:0, dist_mastery:0, hp_flat:0, hp_pct:0,
              res:0, lock:0, dodge:0, init:0, crit_pct:0, crit_mastery:0,
              rear_mastery:0, block_pct:0, barrier:0, di:0, ap:0, mp:0, range:0, wp:0,
              berserk_mastery:0, force_will:0, heals_recv:0, armor_hp:0 };
    var intel = preset.intelligence || {};
    if (intel.hp_percent)       b.hp_pct += intel.hp_percent * 4;
    if (intel.resistance)       b.res += intel.resistance * 10;
    if (intel.barrier)          b.barrier += intel.barrier;
    if (intel.heals_received)   b.heals_recv += intel.heals_received * 6;
    if (intel.armor_hp_percent) b.armor_hp += intel.armor_hp_percent * 4;
    var str = preset.strength || {};
    if (str.mastery)          b.mastery += str.mastery * 5;
    if (str.melee_mastery)    b.melee_mastery += str.melee_mastery * 8;
    if (str.distance_mastery) b.dist_mastery += str.distance_mastery * 8;
    if (str.hp_flat)          b.hp_flat += str.hp_flat * 20;
    var agi = preset.agility || {};
    if (agi.lock)           b.lock += agi.lock * 6;
    if (agi.dodge)          b.dodge += agi.dodge * 6;
    if (agi.initiative)     b.init += agi.initiative * 4;
    if (agi.lock_and_dodge) { b.lock += agi.lock_and_dodge * 4; b.dodge += agi.lock_and_dodge * 4; }
    if (agi.force_of_will)  b.force_will += agi.force_of_will;
    var cha = preset.chance || {};
    if (cha.crit_hit)        b.crit_pct += cha.crit_hit;
    if (cha.block)           b.block_pct += cha.block;
    if (cha.crit_mastery)    b.crit_mastery += cha.crit_mastery * 4;
    if (cha.rear_mastery)    b.rear_mastery += cha.rear_mastery * 6;
    if (cha.berserk_mastery) b.berserk_mastery += cha.berserk_mastery * 8;
    var maj = preset.major || [];
    for (var m = 0; m < maj.length; m++) {
      switch(maj[m]) {
        case "ap": b.ap += 1; break;
        case "mp_damage": b.mp += 1; b.mastery += 20; break;
        case "range_damage": b.range += 1; b.mastery += 40; break;
        case "wp": b.wp += 2; break;
        case "damage_inflicted": b.di += 10; break;
        case "resistance": b.res += 50; break;
        case "indirect_damage": b.di += 10; b.mastery += 40; break;
      }
    }
    return b;
  }

  function countPresetPoints(preset) {
    var total = 0;
    var cats = ["intelligence","strength","agility","chance"];
    for (var c = 0; c < cats.length; c++) {
      var cat = preset[cats[c]] || {};
      for (var k in cat) { if (cat.hasOwnProperty(k)) total += cat[k]; }
    }
    total += (preset.major || []).length;
    return total;
  }

  function recommendStats(passives, subs, sacPatate) {
    if (sacPatate) return "sac_a_patate";
    var hasRet = false, hasAB = false, hasFluct = false;
    var hasLeurre = false, hasAssassin = false, hasAssautLetal = false, hasPieges = false;
    for (var i = 0; i < passives.length; i++) {
      var p = passives[i];
      if (p.id === "retenue") hasRet = true;
      if (p.id === "assaut_brutal") hasAB = true;
      if (p.id === "fluctuation") hasFluct = true;
      if (p.id === "leurre") hasLeurre = true;
      if (p.id === "assassin") hasAssassin = true;
      if (p.id === "assaut_letal") hasAssautLetal = true;
      if (p.id.indexOf("piege") !== -1 || p.id === "embuscade") hasPieges = true;
    }
    if (hasAssassin && hasAssautLetal) return "farm_chain";
    if (hasLeurre || hasPieges) return "aoe_traps";
    if (hasRet) return "burst_retenue";
    return "burst_melee";
  }

  /* =============================================
     SORTS — Source unique : sram-spells.json (doc ref)
     ============================================= */
  var ALL_SPELLS = [
    { id:"mise_a_mort", name:"Mise a mort", ap:4, wp:0, base:154, elem:"feu",
      pf_scaling:true, gen_pf:false, consume_pf:true,
      upt:1, upt_target:1, breaks_invis:true, ab_eligible:false },
    { id:"arnaque", name:"Arnaque", ap:3, wp:0, base:108, elem:"feu",
      pf_scaling:true, gen_pf:false, consume_pf:true,
      upt:2, upt_target:1, breaks_invis:true, ab_eligible:false },
    { id:"traumatisme", name:"Traumatisme", ap:5, wp:0, base:192, elem:"eau",
      pf_scaling:true, gen_pf:false, consume_pf:true,
      upt:1, upt_target:1, breaks_invis:true, ab_eligible:false },
    { id:"coup_penetrant", name:"Coup penetrant", ap:4, wp:0, base:140, elem:"air",
      pf_scaling:false, gen_pf:true, consume_pf:false,
      upt:2, upt_target:1, breaks_invis:true, ab_eligible:true },
    { id:"attaque_letale", name:"Attaque letale", ap:4, wp:0, base:140, elem:"terre",
      pf_scaling:false, gen_pf:true, consume_pf:false,
      upt:2, upt_target:1, breaks_invis:true, ab_eligible:true },
    { id:"attaque_mortelle", name:"Attaque mortelle", ap:5, wp:0, base:175, elem:"terre",
      pf_scaling:false, gen_pf:true, consume_pf:false,
      upt:1, upt_target:1, breaks_invis:true, ab_eligible:true },
    { id:"contact_letal", name:"Contact letal", ap:2, wp:0, base:62, elem:"feu",
      pf_scaling:false, gen_pf:true, consume_pf:false,
      upt:3, upt_target:2, breaks_invis:true, ab_eligible:false }
  ];

  /* =============================================
     PASSIFS — Source unique : sram-passives.json (doc ref)
     ============================================= */
  var ALL_PASSIVES = [
    { id:"retenue", name:"Retenue", type:"sram", unlock:15, di:0, conflicts:["assaut_brutal"], pf_grant:100, farm:0, survie:0, aoe:0, util:0, on_kill:false },
    { id:"assassin", name:"Assassin", type:"sram", unlock:10, di:0, conflicts:[], pf_grant:0, farm:30, survie:0, aoe:0, util:0, on_kill:true },
    { id:"duperie", name:"Duperie", type:"sram", unlock:10, di:0, conflicts:["leurre"], pf_grant:0, farm:0, survie:25, aoe:0, util:0, on_kill:false },
    { id:"passe_passe", name:"Passe-passe", type:"sram", unlock:20, di:0, conflicts:[], pf_grant:0, farm:0, survie:0, aoe:0, util:15, on_kill:false },
    { id:"embuscade", name:"Embuscade", type:"sram", unlock:25, di:0, conflicts:[], pf_grant:0, farm:5, survie:0, aoe:5, util:5, on_kill:false },
    { id:"piege_attraction_ii", name:"Piege Attraction II", type:"sram", unlock:30, di:0, conflicts:[], pf_grant:0, farm:0, survie:0, aoe:15, util:0, on_kill:false },
    { id:"peur_alternative", name:"Peur alternative", type:"sram", unlock:35, di:0, conflicts:[], pf_grant:0, farm:0, survie:0, aoe:0, util:15, on_kill:false },
    { id:"hemophilie", name:"Hemophilie", type:"sram", unlock:40, di:0, conflicts:[], pf_grant:0, farm:0, survie:0, aoe:10, util:20, on_kill:false },
    { id:"piege_repulsion_ii", name:"Piege Repulsion II", type:"sram", unlock:45, di:0, conflicts:[], pf_grant:0, farm:0, survie:0, aoe:0, util:10, on_kill:false },
    { id:"localisation_quantique", name:"Loc. quantique", type:"sram", unlock:50, di:0, conflicts:[], pf_grant:0, farm:0, survie:0, aoe:0, util:5, removes_back:true, on_kill:false },
    { id:"leurre", name:"Leurre", type:"sram", unlock:60, di:0, conflicts:["duperie"], pf_grant:0, farm:10, survie:0, aoe:25, util:0, leurre_dmg:1220, on_kill:false },
    { id:"diversion_alternative", name:"Diversion alt.", type:"sram", unlock:70, di:0, conflicts:[], pf_grant:0, farm:0, survie:0, aoe:0, util:5, on_kill:false },
    { id:"piege_teleportation_ii", name:"Piege TP II", type:"sram", unlock:80, di:0, conflicts:[], pf_grant:0, farm:0, survie:0, aoe:0, util:15, on_kill:false },
    { id:"assaut_letal", name:"Assaut letal", type:"sram", unlock:90, di:0, conflicts:[], pf_grant:0, farm:35, survie:0, aoe:0, util:0, on_kill:true },
    { id:"assaut_brutal", name:"Assaut Brutal", type:"sram", unlock:100, di:0, conflicts:["retenue"], pf_grant:0, farm:0, survie:0, aoe:0, util:0, removes_pf:true, ab_pct_per_ap:5, on_kill:false },
    { id:"carnage", name:"Carnage", type:"common", unlock:0, di:15, conflicts:[], pf_grant:0, farm:0, survie:0, aoe:0, util:0, on_kill:false },
    { id:"fluctuation", name:"Fluctuation", type:"common", unlock:0, di:0, conflicts:[], pf_grant:0, farm:0, survie:0, aoe:0, util:0, fluct_cap:60, on_kill:false },
    { id:"evasion", name:"Evasion", type:"common", unlock:0, di:0, conflicts:[], pf_grant:0, farm:0, survie:5, aoe:0, util:5, on_kill:false },
    { id:"interception", name:"Interception", type:"common", unlock:0, di:0, conflicts:[], pf_grant:0, farm:0, survie:5, aoe:0, util:5, on_kill:false },
    { id:"inspiration", name:"Inspiration", type:"common", unlock:0, di:0, conflicts:[], pf_grant:0, farm:0, survie:0, aoe:0, util:10, on_kill:false },
    { id:"motivation", name:"Motivation", type:"common", unlock:0, di:0, conflicts:[], pf_grant:0, farm:5, survie:0, aoe:0, util:10, on_kill:false },
    { id:"medecine", name:"Medecine", type:"common", unlock:0, di:0, conflicts:[], pf_grant:0, farm:0, survie:10, aoe:0, util:0, on_kill:false },
    { id:"rock", name:"Rock", type:"common", unlock:0, di:0, conflicts:[], pf_grant:0, farm:0, survie:15, aoe:0, util:0, on_kill:false }
  ];

  var ALL_SUBS = [
    { id:"temerite", name:"Temerite", di:15, is_burst:true },
    { id:"anatomie", name:"Anatomie", di_back_net:20, di_penalty:-20, is_burst:true },
    { id:"mesure_iii", name:"Mesure III", di_crit:20, is_burst:true },
    { id:"assassin_squelettique", name:"Assassin Squelettique", di:0, is_burst:false, farm:50 },
    { id:"petulance", name:"Petulance", di:0, is_burst:false, farm:10 }
  ];

  /* =============================================
     COMBINAISONS + CONFLITS
     ============================================= */
  function combos(arr, k) {
    var r = [];
    function h(s, c) {
      if (c.length === k) { r.push(c.slice()); return; }
      for (var i = s; i < arr.length; i++) { c.push(arr[i]); h(i+1,c); c.pop(); }
    }
    h(0, []); return r;
  }

  function hasConflict(combo) {
    var ids = {};
    for (var i = 0; i < combo.length; i++) ids[combo[i].id] = true;
    for (var j = 0; j < combo.length; j++) {
      if (combo[j].conflicts) {
        for (var c = 0; c < combo[j].conflicts.length; c++) {
          if (ids[combo[j].conflicts[c]]) return true;
        }
      }
    }
    return false;
  }

  /* =============================================
     GENERATEUR DE ROTATIONS v4.0
     Filtre strict : on garde seulement les rotations
     qui maximisent l'utilisation des PA
     ============================================= */
  function genRotations(apMax, wpMax, spells) {
    var results = [];
    var bestAP = 0;

    function dfs(apLeft, wpLeft, chosen, usage) {
      if (chosen.length > 0) {
        var usedAP = apMax - apLeft;
        if (usedAP > bestAP) bestAP = usedAP;
        results.push({ rot: chosen.slice(), usedAP: usedAP });
      }
      if (chosen.length >= 6) return;
      for (var i = 0; i < spells.length; i++) {
        var sp = spells[i];
        if (sp.ap > apLeft || sp.wp > wpLeft) continue;
        var u = usage[sp.id] || 0;
        if (u >= sp.upt) continue;
        usage[sp.id] = u + 1;
        chosen.push(sp);
        dfs(apLeft - sp.ap, wpLeft - sp.wp, chosen, usage);
        chosen.pop();
        usage[sp.id] = u;
      }
    }
    dfs(apMax, wpMax, [], {});

    /* Filtre strict : seulement rotations au max PA exact */
    var filtered = [];
    for (var r = 0; r < results.length; r++) {
      if (results[r].usedAP >= bestAP) {
        filtered.push(results[r].rot);
      }
    }
    /* Si aucune rotation au max, prendre max-1 */
    if (filtered.length === 0) {
      for (var r2 = 0; r2 < results.length; r2++) {
        if (results[r2].usedAP >= bestAP - 1) {
          filtered.push(results[r2].rot);
        }
      }
    }
    return filtered;
  }

  /* =============================================
     CALCUL DEGATS D'UN SORT
     ============================================= */
  function calcSpell(sp, ctx) {
    var base = sp.base;
    var mF = 1 + ctx.mastery / 100;
    var oF = ctx.locaQ ? 1.0 : ({back:1.25, side:1.1, front:1.0}[ctx.ori] || 1.0);
    var cF = ctx.crit ? 1.25 : 1.0;
    var diF = 1 + ctx.di / 100;
    var rF = 1 - flatResToPercent(ctx.res) / 100;
    var dmg = base * mF * oF * cF * diF * rF;
    if (ctx.assautBrutal && sp.ab_eligible && sp.ap >= 4) {
      dmg *= (1 + sp.ap * 5 / 100);
    }
    var df = 1.0;
    if (ctx.mdo) df *= 2.0;
    if (ctx.isolated) df *= 1.5;
    if (sp.pf_scaling && ctx.pf > 0) {
      df *= (1 + ctx.pf / 100);
    }
    dmg *= df;
    if (ctx.fluct > 0) {
      dmg *= (1 + Math.min(ctx.fluct, 60) / 100);
    }
    return Math.round(dmg);
  }

  /* =============================================
     CALCUL ROTATION COMPLETE
     ============================================= */
  function calcRotation(rotation, ctx) {
    var total = 0, mdo_available = true, pf_left = ctx.pf;
    var steps = [], totalAP = 0;
    for (var i = 0; i < rotation.length; i++) {
      var sp = rotation[i];
      var is_mdo = mdo_available && sp.breaks_invis;
      var spCtx = {
        mastery: ctx.mastery, ori: ctx.ori, crit: ctx.crit,
        di: ctx.di, res: ctx.res, isolated: ctx.isolated,
        mdo: is_mdo, pf: sp.pf_scaling ? pf_left : 0,
        assautBrutal: ctx.assautBrutal, fluct: ctx.fluct, locaQ: ctx.locaQ
      };
      var dmg = calcSpell(sp, spCtx);
      total += dmg; totalAP += sp.ap;
      steps.push({
        order: i + 1, name: sp.name, ap: sp.ap, element: sp.elem,
        damage: dmg, mdo: is_mdo,
        pf_used: sp.pf_scaling ? pf_left : 0,
        ab_bonus: ctx.assautBrutal && sp.ab_eligible && sp.ap >= 4 ? (sp.ap * 5) + "%" : null
      });
      if (is_mdo) mdo_available = false;
      if (sp.consume_pf && sp.pf_scaling) pf_left = 0;
    }
    return { total: total, steps: steps, totalAP: totalAP };
  }

  /* =============================================
     SIMULATION MULTI-TOURS v4.0
     Tour 1 (Preparation) : Invisibilite + Double + Surineur
     Tour 2 (Invisible)   : Retenue +50 PF, positionnement dos
                            Sorts < 4PA si Retenue (ne brisent pas invis)
     Tour 3 (Burst)       : MdO + PF scaling + sorts restants
     ============================================= */
  function simulateMultiTurn(passives, subs, useSurineur, g) {
    var hasMajorAP = true;  /* majeur PA toujours pris */
    var hasMajorPM = true;  /* majeur PM+Dmg toujours pris */
    var totalAP = BASE_RESOURCES.ap + (hasMajorAP ? 1 : 0);  /* 7 PA */
    var totalWP = BASE_RESOURCES.wp;                           /* 6 PW */
    var totalMP = BASE_RESOURCES.mp + (hasMajorPM ? 1 : 0);  /* 4 PM */

    var hasRet = false, hasAB = false, hasLQ = false, hasFluct = false;
    var di = 0, farm = 0, surv = 0, aoe = 0, util = 0, leurre = 0, fluctCap = 0;
    var onKillPassives = [];

    for (var i = 0; i < passives.length; i++) {
      var p = passives[i];
      if (p.id === "retenue") hasRet = true;
      if (p.id === "assaut_brutal") hasAB = true;
      if (p.id === "localisation_quantique") hasLQ = true;
      if (p.id === "fluctuation") { hasFluct = true; fluctCap = p.fluct_cap || 60; }
      di += (p.di || 0);
      if (p.on_kill) onKillPassives.push(p.name);
      /* En mode sac a patate, les passifs on_kill ne comptent pas pour farm */
      if (g.sacPatate && p.on_kill) {
        /* Ne pas ajouter farm/util de ces passifs */
      } else {
        farm += (p.farm || 0);
        surv += (p.survie || 0);
        aoe += (p.aoe || 0);
        util += (p.util || 0);
      }
      if (p.leurre_dmg) leurre = p.leurre_dmg;
    }

    var ori = g.ori || "back";
    var isBack = ori === "back";
    var crit = g.crit !== false;

    for (var s = 0; s < subs.length; s++) {
      var sb = subs[s];
      if (sb.di) di += sb.di;
      if (sb.di_back_net && isBack && !hasLQ) di += sb.di_back_net;
      if (sb.di_crit && crit) di += sb.di_crit;
      if (sb.di_penalty && !(isBack && !hasLQ)) di += sb.di_penalty;
      if (!g.sacPatate) farm += (sb.farm || 0);
    }

    di += (g.guildDI || 0) + (g.majorDI || 0) + (g.otherDI || 0);
    if (useSurineur) {
      if (isBack && !hasLQ) di += 20;
      if (crit) di += 20;
    }

    var effectFluct = (hasFluct && !g.noFluctuation) ? Math.min(fluctCap, 60) : 0;

    /* ===== TOUR 1 : PREPARATION ===== */
    var t1 = { ap: totalAP, wp: totalWP, mp: totalMP, actions: [] };

    /* Invisibilite obligatoire */
    t1.ap -= PREP_COSTS.invisibilite.ap;    /* -2 PA */
    t1.wp -= PREP_COSTS.invisibilite.wp;    /* -2 PW */
    t1.actions.push({ name: "Invisibilite", ap: 2, wp: 2, type: "buff" });

    /* Double (si pas deja invoque / si Leurre equipe) */
    var useDouble = leurre > 0;
    if (useDouble && t1.ap >= PREP_COSTS.double.ap && t1.wp >= PREP_COSTS.double.wp) {
      t1.ap -= PREP_COSTS.double.ap;
      t1.wp -= PREP_COSTS.double.wp;
      t1.actions.push({ name: "Double", ap: 2, wp: 1, type: "summon" });
    }

    /* Surineur */
    if (useSurineur && t1.wp >= PREP_COSTS.surineur.wp) {
      t1.wp -= PREP_COSTS.surineur.wp;
      t1.actions.push({ name: "Surineur", ap: 0, wp: 2, type: "buff" });
    }

    /* PA restants T1 : possibilite de sorts < 4PA si Retenue */
    var t1DmgSteps = [];
    var t1Damage = 0;
    if (hasRet && t1.ap >= 2) {
      /* Avec Retenue, seuls les sorts < 4 PA ne brisent pas l'invis */
      /* Contact Letal (2PA) est le seul sort < 4PA de degats */
      var clUses = 0;
      while (t1.ap >= 2 && clUses < 3) {
        var cl = ALL_SPELLS[6]; /* contact_letal */
        var clCtx = {
          mastery: g.mastery || 0, ori: hasLQ ? "front" : ori,
          crit: crit, di: di, res: g.res || 0,
          isolated: g.isolated && !g.sacPatate,
          mdo: false, pf: 0, assautBrutal: false,
          fluct: effectFluct, locaQ: hasLQ
        };
        var clDmg = calcSpell(cl, clCtx);
        t1Damage += clDmg;
        t1DmgSteps.push({
          order: t1DmgSteps.length + 1, name: cl.name, ap: cl.ap,
          element: cl.elem, damage: clDmg, mdo: false, pf_used: 0, ab_bonus: null,
          turn: 1
        });
        t1.ap -= 2;
        clUses++;
      }
    }

    /* ===== TOUR 2 : INVISIBLE ===== */
    var pf = 0;
    if (hasRet) pf += 50;  /* Retenue fin T1 */
    /* T2 : 7 PA, 1 PW restant typique, on se positionne */
    var t2 = { ap: totalAP, wp: t1.wp, mp: totalMP, actions: [] };
    t2.actions.push({ name: "Positionnement dos (PM)", mp: totalMP, type: "move" });

    /* Sorts < 4PA pendant invis T2 si Retenue */
    var t2DmgSteps = [];
    var t2Damage = 0;
    if (hasRet) {
      pf += 50;  /* Retenue fin T2 */
      var cl2Uses = 0;
      var apLeft2 = t2.ap;
      while (apLeft2 >= 2 && cl2Uses < 3) {
        var cl2 = ALL_SPELLS[6];
        var cl2Ctx = {
          mastery: g.mastery || 0, ori: hasLQ ? "front" : ori,
          crit: crit, di: di, res: g.res || 0,
          isolated: g.isolated && !g.sacPatate,
          mdo: false, pf: 0, assautBrutal: false,
          fluct: effectFluct, locaQ: hasLQ
        };
        var cl2Dmg = calcSpell(cl2, cl2Ctx);
        t2Damage += cl2Dmg;
        t2DmgSteps.push({
          order: t2DmgSteps.length + 1, name: cl2.name, ap: cl2.ap,
          element: cl2.elem, damage: cl2Dmg, mdo: false, pf_used: 0, ab_bonus: null,
          turn: 2
        });
        apLeft2 -= 2;
        cl2Uses++;
      }
      /* PA restants T2 apres Contact Letal */
      t2.ap = apLeft2;
    }

    if (!hasRet && !hasAB) pf = 0;

    /* ===== TOUR 3 : BURST ===== */
    var burstAP = g.burstAP || totalAP;
    var burstWP = t2.wp; /* PW restants apres prep */

    var rotCtx = {
      mastery: g.mastery || 0, ori: hasLQ ? "front" : ori,
      crit: crit, di: di, res: g.res || 0,
      isolated: g.isolated && !g.sacPatate,
      pf: pf, assautBrutal: hasAB, fluct: effectFluct, locaQ: hasLQ
    };

    var rots = genRotations(burstAP, burstWP, ALL_SPELLS);
    var bestTotal = 0, bestResult = null;
    for (var r = 0; r < rots.length; r++) {
      var res = calcRotation(rots[r], rotCtx);
      if (res.total > bestTotal) {
        bestTotal = res.total;
        bestResult = res;
      }
    }

    /* Marquer les steps du burst comme T3 */
    var burstSteps = [];
    if (bestResult) {
      for (var bs = 0; bs < bestResult.steps.length; bs++) {
        var step = bestResult.steps[bs];
        step.turn = 3;
        burstSteps.push(step);
      }
    }

    /* Total sur 3 tours */
    var totalDamage3T = t1Damage + t2Damage + bestTotal;

    /* Deck de sorts recommande */
    var deckSpells = ["Invisibilite"];
    if (useDouble) deckSpells.push("Double");
    if (useSurineur) deckSpells.push("Surineur");
    var seenSpells = {};
    var allDmgSteps = t1DmgSteps.concat(t2DmgSteps).concat(burstSteps);
    for (var d = 0; d < allDmgSteps.length; d++) {
      if (!seenSpells[allDmgSteps[d].name]) {
        deckSpells.push(allDmgSteps[d].name);
        seenSpells[allDmgSteps[d].name] = true;
      }
    }

    /* Meta score */
    var w = g.weights || {burst:0.5,farm:0.2,aoe:0.15,survie:0.1,util:0.05};
    var bRef = g.burstRef || 50000;
    var bN = Math.min(totalDamage3T / bRef * 100, 100);
    var fN = Math.min(farm, 100);
    var aN = Math.min(aoe + (leurre > 0 ? 30 : 0), 100);
    var sN = Math.min(surv, 100);
    var uN = Math.min(util, 100);
    var meta = bN*w.burst + fN*w.farm + aN*w.aoe + sN*w.survie + uN*w.util;

    var recPresetId = recommendStats(passives, subs, g.sacPatate);
    var recPreset = STAT_PRESETS[recPresetId];
    var recBonuses = calcPresetBonuses(recPreset);

    return {
      totalDamage: totalDamage3T,
      burstDamage: bestTotal,
      t1Damage: t1Damage,
      t2Damage: t2Damage,
      t1Actions: t1.actions,
      t1DmgSteps: t1DmgSteps,
      t2DmgSteps: t2DmgSteps,
      burstSteps: burstSteps,
      burstAP: bestResult ? bestResult.totalAP : 0,
      totalAP_base: totalAP,
      totalWP_base: BASE_RESOURCES.wp,
      totalMP_base: totalMP,
      wpAfterPrep: t2.wp,
      pf: pf, di: di, fluct: effectFluct,
      passiveNames: passives.map(function(x){return x.name;}),
      subNames: subs.map(function(x){return x.name;}),
      surineur: useSurineur,
      meta: Math.round(meta*100)/100,
      burstNorm: Math.round(bN*100)/100,
      farm: farm, aoe: aoe+(leurre>0?30:0),
      survie: surv, util: util,
      leurre: leurre, hasRet: hasRet, hasAB: hasAB, hasFluct: hasFluct,
      onKillPassives: onKillPassives,
      deckSpells: deckSpells,
      statPresetId: recPresetId,
      statPreset: recPreset,
      statBonuses: recBonuses
    };
  }

  /* =============================================
     OPTIMIZER v4.0
     ============================================= */
  function optimize(g, topN) {
    topN = topN || 15;
    var t0 = performance.now();

    var avail = ALL_PASSIVES.filter(function(p){ return p.unlock <= (g.level||140); });

    /* En mode Sac a Patate : filtrer les passifs on_kill
       Ils restent disponibles mais leur score farm/util = 0 (gere dans simulateMultiTurn) */

    var pCombos = combos(avail, g.passiveSlots || 4);
    var valid = pCombos.filter(function(c){ return !hasConflict(c); });

    var bSubs = ALL_SUBS.filter(function(s){ return s.is_burst; });
    var sCombos = [[]];
    for (var k = 1; k <= bSubs.length; k++) {
      var sc = combos(bSubs, k);
      for (var i = 0; i < sc.length; i++) sCombos.push(sc[i]);
    }

    var all = [];
    for (var vi = 0; vi < valid.length; vi++) {
      for (var si = 0; si < sCombos.length; si++) {
        for (var u = 0; u < 2; u++) {
          all.push(simulateMultiTurn(valid[vi], sCombos[si], u===0, g));
        }
      }
    }

    all.sort(function(a,b){ return b.meta - a.meta; });
    var ms = Math.round(performance.now() - t0);
    console.log("[Opt v4.0] " + all.length + " builds en " + ms + "ms | " + valid.length + " combos valides");

    return {
      top: all.slice(0, topN),
      count: all.length,
      ms: ms,
      validCombos: valid.length
    };
  }

  return {
    ALL_SPELLS:ALL_SPELLS, ALL_PASSIVES:ALL_PASSIVES, ALL_SUBS:ALL_SUBS,
    STAT_PRESETS:STAT_PRESETS, APTITUDE_LIMITS:APTITUDE_LIMITS,
    BASE_RESOURCES:BASE_RESOURCES, PREP_COSTS:PREP_COSTS,
    flatResToPercent:flatResToPercent,
    optimize:optimize, simulateMultiTurn:simulateMultiTurn,
    genRotations:genRotations, calcRotation:calcRotation,
    calcPresetBonuses:calcPresetBonuses, countPresetPoints:countPresetPoints,
    recommendStats:recommendStats
  };
})();

export {  };
