#!/usr/bin/env python3
"""
Wakfu Assistant — Calcul du poids en stats des équipements par joueur.

Charge les données CDN (items.json) et les fichiers joueurs (logs/players/*.json),
calcule le poids offensif/défensif normalisé de chaque joueur selon le système
de poids officiel Ankama (Devblogs 1.81 / 1.88), et génère des classements.

Constantes de poids confirmées dans le code décompilé (aTG.java, aTJ.java, aTN.java) :
  167, 200, 228, 250, 283, 333
"""

import json
import os
import re
import csv
import sys
import logging
from pathlib import Path
from collections import defaultdict

# Forcer UTF-8 sur la console Windows
if sys.stdout.encoding != "utf-8":
    sys.stdout.reconfigure(encoding="utf-8")
if sys.stderr.encoding != "utf-8":
    sys.stderr.reconfigure(encoding="utf-8")

# ─────────────────────────── Configuration ───────────────────────────

PROJECT_ROOT = Path(__file__).resolve().parent.parent
ITEMS_JSON = PROJECT_ROOT / "rnd" / "data" / "cdn_items.json"
PLAYERS_DIR = PROJECT_ROOT / "logs" / "players"
OUTPUT_DIR = PROJECT_ROOT / "logs" / "analysis"

# ─────────────────────────── Logging ─────────────────────────────────

logging.basicConfig(
    level=logging.INFO,
    format="%(asctime)s [%(levelname)s] %(message)s",
    datefmt="%H:%M:%S",
)
log = logging.getLogger("wakfu_weights")

# ─────────────────────────── Constantes de poids ─────────────────────
# Source : Devblogs Ankama 1.81 + 1.88, confirmées dans le code décompilé

POIDS_MAITRISE = {
    "mono":     167,   # Maîtrise 1 élément
    "bi":       228,   # Maîtrise 2 éléments
    "tri":      283,   # Maîtrise 3 éléments
    "quad":     333,   # Maîtrise 4 éléments (élémentaire)
    "base":     250,   # Mêlée/Distance seule, Critique, Dos, Soin, Berserk
    "cumul":    200,   # Mêlée/Distance quand les deux sont sur le même item
}

# Mapping des slots d'équipement
SLOT_NAMES = {
    0: "Casque", 3: "Épaulettes", 4: "Amulette", 5: "Plastron",
    7: "Bague G", 8: "Bague D", 10: "Ceinture", 12: "Bottes",
    13: "Cape", 15: "Arme", 16: "Seconde main", 17: "Outil",
    22: "Familier", 24: "Monture",
}

# Slots à exclure du comptage d'items "combattants"
SLOTS_EXCLUS = {17}  # Outil (récolte)

# ─── ActionIds offensifs (maîtrises) ─────────────────────────────────

# Gains
ACTION_MAITRISE_ELEM = 120      # Maîtrise Élémentaire (4 élé)
ACTION_MAITRISE_VAR = 1068      # Maîtrise dans N éléments (params[2] = nb)
ACTION_MAITRISE_FEU = 122
ACTION_MAITRISE_TERRE = 123
ACTION_MAITRISE_EAU = 124
ACTION_MAITRISE_AIR = 125
ACTION_MAITRISE_MELEE = 1052
ACTION_MAITRISE_DISTANCE = 1053
ACTION_MAITRISE_CRITIQUE = 149
ACTION_MAITRISE_DOS = 180
ACTION_MAITRISE_SOIN = 26
ACTION_MAITRISE_BERSERK = 1055
ACTION_COUP_CRIT_GAIN = 150
ACTION_COUP_CRIT_PERTE = 168

# Pertes
ACTION_NEG_MAITRISE_ELEM = 130
ACTION_NEG_MAITRISE_CRITIQUE = 1056
ACTION_NEG_MAITRISE_MELEE = 1059
ACTION_NEG_MAITRISE_DISTANCE = 1060
ACTION_NEG_MAITRISE_BERSERK = 1061
ACTION_NEG_MAITRISE_DOS = 181

# ─── ActionIds défensifs ─────────────────────────────────────────────

ACTION_PV = 20
ACTION_NEG_PV = 21
ACTION_RES_ELEM = 80
ACTION_RES_FEU = 82
ACTION_RES_EAU = 83
ACTION_RES_TERRE = 84
ACTION_RES_AIR = 85
ACTION_RES_VAR = 1069           # Résistance dans N éléments (params[2] = nb)
ACTION_RES_DOS = 71
ACTION_RES_CRITIQUE = 988
ACTION_PARADE = 875
ACTION_NEG_RES_ELEM = 90
ACTION_NEG_RES_CRITIQUE = 1062
ACTION_NEG_RES_DOS = 1063

# ─── ActionIds annexes ───────────────────────────────────────────────

ACTION_TACLE = 173
ACTION_NEG_TACLE = 174
ACTION_ESQUIVE = 175
ACTION_NEG_ESQUIVE = 176
ACTION_INITIATIVE = 171
ACTION_VOLONTE = 177
ACTION_PROSPECTION = 162
ACTION_SAGESSE = 166

# ─── ActionIds majeurs ───────────────────────────────────────────────

ACTION_PA = 31
ACTION_PM = 41
ACTION_PW = 191
ACTION_PORTEE = 160
ACTION_NEG_PA = 56
ACTION_NEG_PM = 57

# Regroupement pour identification rapide
ACTIONS_MAITRISE_MONO = {ACTION_MAITRISE_FEU, ACTION_MAITRISE_TERRE,
                         ACTION_MAITRISE_EAU, ACTION_MAITRISE_AIR}
ACTIONS_MAITRISE_SPECIALE = {
    ACTION_MAITRISE_CRITIQUE, ACTION_MAITRISE_DOS,
    ACTION_MAITRISE_SOIN, ACTION_MAITRISE_BERSERK,
}
ACTIONS_NEG_SPECIALE = {
    ACTION_NEG_MAITRISE_CRITIQUE: ACTION_MAITRISE_CRITIQUE,
    ACTION_NEG_MAITRISE_MELEE: ACTION_MAITRISE_MELEE,
    ACTION_NEG_MAITRISE_DISTANCE: ACTION_MAITRISE_DISTANCE,
    ACTION_NEG_MAITRISE_BERSERK: ACTION_MAITRISE_BERSERK,
    ACTION_NEG_MAITRISE_DOS: ACTION_MAITRISE_DOS,
    ACTION_NEG_MAITRISE_ELEM: ACTION_MAITRISE_ELEM,
}


# ═══════════════════════════ Chargement items ════════════════════════

def charger_items(path: Path) -> dict:
    """Charge items.json et construit un dict itemId → infos."""
    log.info("Chargement de %s ...", path)
    with open(path, "r", encoding="utf-8") as f:
        raw = json.load(f)

    items = {}
    for entry in raw:
        defn = entry.get("definition", {})
        item_info = defn.get("item", {})
        item_id = item_info.get("id")
        if item_id is None:
            continue

        # Extraire les effets d'équipement
        effets = []
        for eff_wrap in defn.get("equipEffects", []):
            eff_def = eff_wrap.get("effect", {}).get("definition", {})
            action_id = eff_def.get("actionId")
            params = eff_def.get("params", [])
            if action_id is not None:
                effets.append({
                    "actionId": action_id,
                    "params": params,
                })

        titre = entry.get("title", {})
        bp = item_info.get("baseParameters", {})

        gp = item_info.get("graphicParameters", {})
        desc = entry.get("description", {})
        items[item_id] = {
            "name_fr": titre.get("fr", titre.get("en", f"Item#{item_id}")),
            "desc_fr": desc.get("fr", "") if isinstance(desc, dict) else "",
            "level": item_info.get("level", 0),
            "rarity": bp.get("rarity", 0),
            "itemTypeId": bp.get("itemTypeId", 0),
            "gfxId": gp.get("gfxId", 0),
            "effects": effets,
        }

    log.info("  → %d items chargés.", len(items))
    return items


# ═══════════════════════════ Parsing joueurs ═════════════════════════

RE_EQUIPMENT = re.compile(r"(\d+)=(\d+)")
RE_GUILD_LOCAL = re.compile(
    r"m_id=(\d+),\s*m_name='([^']*)'(?:,\s*m_members=(\d+))?"
)
RE_GUILD_REMOTE = re.compile(
    r"m_guildId=(\d+).*?m_name='([^']*)'"
)


def parser_equipment(raw: str) -> dict[int, int]:
    """Parse une string Java map '{slot=itemId, ...}' → dict slot→itemId."""
    if not raw or raw.strip() in ("", "{}", "null"):
        return {}
    return {int(m.group(1)): int(m.group(2)) for m in RE_EQUIPMENT.finditer(raw)}


def parser_guild(raw: str) -> tuple[int, str]:
    """Extrait (guild_id, guild_name) depuis la string Java."""
    if not raw:
        return (0, "")
    # Tenter le format LOCAL d'abord (contient m_name)
    m = RE_GUILD_LOCAL.search(raw)
    if m:
        return (int(m.group(1)), m.group(2))
    # Format REMOTE (m_guildId, m_name souvent vide)
    m = RE_GUILD_REMOTE.search(raw)
    if m:
        return (int(m.group(1)), m.group(2))
    # Fallback : juste l'id
    m2 = re.search(r"m_guildId=(\d+)", raw)
    if m2:
        return (int(m2.group(1)), "")
    return (0, "")


RE_SPELL_DECK = re.compile(
    r"(\d+)=SpellDeckModel\{m_level=(-?\d+),\s*"
    r"m_activeSpells=\[([^\]]*)\],\s*"
    r"m_passiveSpells=\[([^\]]*)\]"
)
RE_BUILD_SHEET = re.compile(
    r"(\d+)=BuildSheetModel\{m_name='([^']*)',\s*m_level=(-?\d+)"
)
RE_ACTIVE_SHEET = re.compile(r"m_activeSheetIndex=(\d+)")


def parser_spells(spells_raw: str, builds_raw: str) -> dict:
    """Parse les spell decks et build sheets depuis les strings Java."""
    result = {"decks": [], "active_deck": 0, "builds": []}
    if not spells_raw:
        return result

    for m in RE_SPELL_DECK.finditer(spells_raw):
        deck_idx = int(m.group(1))
        deck_level = int(m.group(2))
        actives = [int(x.strip()) for x in m.group(3).split(",") if x.strip() and x.strip() != "0"]
        passives = [int(x.strip()) for x in m.group(4).split(",") if x.strip() and x.strip() != "0"]
        result["decks"].append({
            "index": deck_idx,
            "level": deck_level,
            "active_spells": actives,
            "passive_spells": passives,
        })

    if builds_raw:
        m_active = RE_ACTIVE_SHEET.search(builds_raw)
        if m_active:
            result["active_deck"] = int(m_active.group(1))
        for m in RE_BUILD_SHEET.finditer(builds_raw):
            result["builds"].append({
                "index": int(m.group(1)),
                "name": m.group(2),
                "level": int(m.group(3)),
            })

    return result


def charger_joueurs(dossier: Path) -> list[dict]:
    """Charge tous les fichiers joueur .json."""
    joueurs = []
    erreurs = 0
    for fichier in sorted(dossier.glob("*.json")):
        try:
            with open(fichier, "r", encoding="utf-8") as f:
                data = json.load(f)
            joueurs.append(data)
        except Exception as e:
            log.warning("Erreur lecture %s : %s", fichier.name, e)
            erreurs += 1

    log.info("  → %d joueurs chargés (%d erreurs).", len(joueurs), erreurs)
    return joueurs


# ═══════════════════════ Calcul des poids ════════════════════════════

def calculer_poids_item(item_data: dict) -> dict:
    """
    Calcule le poids normalisé d'un item.
    Retourne un dict avec toutes les stats calculées.
    """
    effets = item_data["effects"]

    # Pré-scan : l'item a-t-il mêlée ET distance ? (pour le cumul)
    action_ids = {e["actionId"] for e in effets}
    has_melee = ACTION_MAITRISE_MELEE in action_ids or ACTION_NEG_MAITRISE_MELEE in action_ids
    has_distance = ACTION_MAITRISE_DISTANCE in action_ids or ACTION_NEG_MAITRISE_DISTANCE in action_ids
    cumul_melee_dist = has_melee and has_distance

    stats = {
        "poids_offensif": 0.0,
        "pv": 0, "res_total": 0,
        "res_dos": 0, "res_critique": 0, "parade": 0,
        "pa": 0, "pm": 0, "po": 0, "pw": 0,
        "tacle": 0, "esquive": 0, "initiative": 0,
        "volonte": 0, "prospection": 0, "sagesse": 0,
        "coup_crit": 0,
    }

    for eff in effets:
        aid = eff["actionId"]
        params = eff["params"]
        val = params[0] if params else 0

        # ─── OFFENSIF : Maîtrises ───
        if aid == ACTION_MAITRISE_ELEM:
            # 4 éléments, poids 333
            stats["poids_offensif"] += val * (250 / POIDS_MAITRISE["quad"])

        elif aid == ACTION_MAITRISE_VAR:
            # Maîtrise variable, nb éléments dans params[2]
            nb_elem = int(params[2]) if len(params) > 2 else 1
            cle = {1: "mono", 2: "bi", 3: "tri", 4: "quad"}.get(nb_elem, "quad")
            stats["poids_offensif"] += val * (250 / POIDS_MAITRISE[cle])

        elif aid in ACTIONS_MAITRISE_MONO:
            # Mono-élément (feu/terre/eau/air), poids 167
            stats["poids_offensif"] += val * (250 / POIDS_MAITRISE["mono"])

        elif aid == ACTION_MAITRISE_MELEE:
            poids = POIDS_MAITRISE["cumul"] if cumul_melee_dist else POIDS_MAITRISE["base"]
            stats["poids_offensif"] += val * (250 / poids)

        elif aid == ACTION_MAITRISE_DISTANCE:
            poids = POIDS_MAITRISE["cumul"] if cumul_melee_dist else POIDS_MAITRISE["base"]
            stats["poids_offensif"] += val * (250 / poids)

        elif aid in ACTIONS_MAITRISE_SPECIALE:
            stats["poids_offensif"] += val * (250 / POIDS_MAITRISE["base"])

        elif aid == ACTION_COUP_CRIT_GAIN:
            stats["coup_crit"] += int(val)

        elif aid == ACTION_COUP_CRIT_PERTE:
            stats["coup_crit"] -= int(val)

        # ─── Pertes offensives (valeurs négatives) ───
        elif aid == ACTION_NEG_MAITRISE_ELEM:
            stats["poids_offensif"] -= val * (250 / POIDS_MAITRISE["quad"])

        elif aid == ACTION_NEG_MAITRISE_MELEE:
            poids = POIDS_MAITRISE["cumul"] if cumul_melee_dist else POIDS_MAITRISE["base"]
            stats["poids_offensif"] -= val * (250 / poids)

        elif aid == ACTION_NEG_MAITRISE_DISTANCE:
            poids = POIDS_MAITRISE["cumul"] if cumul_melee_dist else POIDS_MAITRISE["base"]
            stats["poids_offensif"] -= val * (250 / poids)

        elif aid == ACTION_NEG_MAITRISE_BERSERK:
            stats["poids_offensif"] -= val * (250 / POIDS_MAITRISE["base"])

        elif aid == ACTION_NEG_MAITRISE_CRITIQUE:
            stats["poids_offensif"] -= val * (250 / POIDS_MAITRISE["base"])

        elif aid == ACTION_NEG_MAITRISE_DOS:
            stats["poids_offensif"] -= val * (250 / POIDS_MAITRISE["base"])

        # ─── DÉFENSIF ───
        elif aid == ACTION_PV:
            stats["pv"] += int(val)
        elif aid == ACTION_NEG_PV:
            stats["pv"] -= int(val)

        elif aid == ACTION_RES_ELEM:
            stats["res_total"] += int(val) * 4  # 4 éléments
        elif aid == ACTION_NEG_RES_ELEM:
            stats["res_total"] -= int(val) * 4
        elif aid in (ACTION_RES_FEU, ACTION_RES_EAU, ACTION_RES_TERRE, ACTION_RES_AIR):
            stats["res_total"] += int(val)
        elif aid == ACTION_RES_VAR:
            nb_elem = int(params[2]) if len(params) > 2 else 1
            stats["res_total"] += int(val) * nb_elem
        elif aid == ACTION_RES_DOS:
            stats["res_dos"] += int(val)
        elif aid == ACTION_RES_CRITIQUE:
            stats["res_critique"] += int(val)
        elif aid == ACTION_PARADE:
            stats["parade"] += int(val)
        elif aid == ACTION_NEG_RES_CRITIQUE:
            stats["res_critique"] -= int(val)
        elif aid == ACTION_NEG_RES_DOS:
            stats["res_dos"] -= int(val)

        # ─── MAJEUR ───
        elif aid == ACTION_PA:
            stats["pa"] += int(val)
        elif aid == ACTION_PM:
            stats["pm"] += int(val)
        elif aid == ACTION_PW:
            stats["pw"] += int(val)
        elif aid == ACTION_PORTEE:
            stats["po"] += int(val)
        elif aid == ACTION_NEG_PA:
            stats["pa"] -= int(val)
        elif aid == ACTION_NEG_PM:
            stats["pm"] -= int(val)

        # ─── ANNEXE ───
        elif aid == ACTION_TACLE:
            stats["tacle"] += int(val)
        elif aid == ACTION_NEG_TACLE:
            stats["tacle"] -= int(val)
        elif aid == ACTION_ESQUIVE:
            stats["esquive"] += int(val)
        elif aid == ACTION_NEG_ESQUIVE:
            stats["esquive"] -= int(val)
        elif aid == ACTION_INITIATIVE:
            stats["initiative"] += int(val)
        elif aid == ACTION_VOLONTE:
            stats["volonte"] += int(val)
        elif aid == ACTION_PROSPECTION:
            stats["prospection"] += int(val)
        elif aid == ACTION_SAGESSE:
            stats["sagesse"] += int(val)

    # Poids défensif = PV + résistances cumulées (brut)
    stats["poids_defensif"] = stats["pv"] + stats["res_total"]

    return stats


def calculer_joueur(joueur: dict, items_db: dict, niveau_max: int = 0) -> dict | None:
    """Calcule toutes les stats d'un joueur à partir de son équipement.
    niveau_max : si > 0, ignore les items dont le niveau dépasse cette valeur (filtrage par tranche).
    """
    name = joueur.get("name", "Inconnu")

    # Parser l'équipement
    equip_raw = joueur.get("equipment", "")
    try:
        equip = parser_equipment(equip_raw)
    except Exception as e:
        log.warning("Erreur parsing equipment pour %s : %s", name, e)
        return None

    if not equip:
        return None

    # Parser la guilde
    guild_id, guild_name = parser_guild(joueur.get("guild", ""))

    # Accumuler les stats de tous les items
    totaux = {
        "name": name,
        "level": joueur.get("level", 0),
        "breedName": joueur.get("breedName", "?"),
        "guild_name": guild_name,
        "guild_id": guild_id,
        "entityId": joueur.get("entityId", 0),
        "poids_offensif": 0.0,
        "poids_defensif": 0.0,
        "total_pv": 0,
        "total_res": 0,
        "pa": 0, "pm": 0, "po": 0, "pw": 0,
        "tacle": 0, "esquive": 0, "initiative": 0,
        "coup_crit": 0,
        "nb_items": 0,
        "top_item_name": "",
        "top_item_poids": 0.0,
        "items_detail": [],  # Pour le log détaillé
    }

    items_inconnus = 0

    for slot, item_id in equip.items():
        item_data = items_db.get(item_id)
        if item_data is None:
            items_inconnus += 1
            log.debug("Item inconnu %d (slot %d) pour %s", item_id, slot, name)
            continue

        # Filtrer les items hors-tranche (niveau trop élevé pour la tranche demandée)
        if niveau_max > 0 and item_data.get("level", 0) > niveau_max:
            continue

        stats_item = calculer_poids_item(item_data)

        # Accumuler
        totaux["poids_offensif"] += stats_item["poids_offensif"]
        totaux["total_pv"] += stats_item["pv"]
        totaux["total_res"] += stats_item["res_total"]
        totaux["poids_defensif"] += stats_item["poids_defensif"]
        totaux["pa"] += stats_item["pa"]
        totaux["pm"] += stats_item["pm"]
        totaux["po"] += stats_item["po"]
        totaux["pw"] += stats_item["pw"]
        totaux["tacle"] += stats_item["tacle"]
        totaux["esquive"] += stats_item["esquive"]
        totaux["initiative"] += stats_item["initiative"]
        totaux["coup_crit"] += stats_item["coup_crit"]

        # Comptage (hors outil)
        if slot not in SLOTS_EXCLUS:
            totaux["nb_items"] += 1

        # Tracker le meilleur item offensif
        if stats_item["poids_offensif"] > totaux["top_item_poids"]:
            totaux["top_item_poids"] = stats_item["poids_offensif"]
            totaux["top_item_name"] = item_data["name_fr"]

        # Détail pour debug
        totaux["items_detail"].append({
            "slot": slot,
            "slot_name": SLOT_NAMES.get(slot, f"Slot{slot}"),
            "item_id": item_id,
            "gfx_id": item_data.get("gfxId", 0),
            "name": item_data["name_fr"],
            "level": item_data["level"],
            "rarity": item_data["rarity"],
            "poids_off": stats_item["poids_offensif"],
            "pv": stats_item["pv"],
            "res": stats_item["res_total"],
            "pa": stats_item["pa"],
            "pm": stats_item["pm"],
        })

    if items_inconnus > 0:
        log.debug("  %s : %d items inconnus sur %d slots",
                  name, items_inconnus, len(equip))

    # Parser les sorts et builds
    totaux["spells_data"] = parser_spells(
        joueur.get("spells", ""),
        joueur.get("builds", ""),
    )

    return totaux


# ═══════════════════════ Affichage détaillé ═══════════════════════════

def afficher_detail_joueur(result: dict):
    """Affiche le détail complet d'un joueur (vérification)."""
    print("\n" + "=" * 80)
    print(f"  DÉTAIL : {result['name']} (Niv.{result['level']} {result['breedName']})")
    if result["guild_name"]:
        print(f"  Guilde : {result['guild_name']} (id:{result['guild_id']})")
    print("=" * 80)

    print(f"\n  {'Slot':<15} {'Item':<30} {'Niv':>4} {'R':>2} "
          f"{'Poids Off':>10} {'PV':>5} {'Rés':>5} {'PA':>3} {'PM':>3}")
    print("  " + "-" * 95)

    for d in sorted(result["items_detail"], key=lambda x: x["slot"]):
        print(f"  {d['slot_name']:<15} {d['name'][:30]:<30} {d['level']:>4} "
              f"{d['rarity']:>2} {d['poids_off']:>10.1f} {d['pv']:>5} "
              f"{d['res']:>5} {d['pa']:>3} {d['pm']:>3}")

    print("  " + "-" * 95)
    print(f"  {'TOTAL':<15} {'':<30} {'':>4} {'':>2} "
          f"{result['poids_offensif']:>10.1f} {result['total_pv']:>5} "
          f"{result['total_res']:>5} {result['pa']:>3} {result['pm']:>3}")

    print(f"\n  Poids offensif normalisé : {result['poids_offensif']:.1f}")
    print(f"  Poids défensif brut      : {result['poids_defensif']:.1f}")
    print(f"  Coup Critique            : {result['coup_crit']:+d}%")
    print(f"  Tacle / Esquive          : {result['tacle']} / {result['esquive']}")
    print(f"  Initiative               : {result['initiative']}")
    print(f"  Nb items (hors outil)    : {result['nb_items']}")
    print(f"  Meilleur item offensif   : {result['top_item_name']}")
    print("=" * 80)


# ═══════════════════════ Export CSV ═══════════════════════════════════

def exporter_joueurs_csv(resultats: list[dict], path: Path):
    """Exporte le classement joueurs en CSV."""
    colonnes = [
        "name", "level", "breedName", "guild_name", "guild_id",
        "poids_offensif", "poids_defensif", "total_pv", "total_res",
        "pa", "pm", "po", "pw", "tacle", "esquive", "initiative",
        "coup_crit", "nb_items", "top_item_name",
    ]
    with open(path, "w", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(f, fieldnames=colonnes, extrasaction="ignore")
        writer.writeheader()
        for r in resultats:
            row = dict(r)
            row["poids_offensif"] = f"{row['poids_offensif']:.1f}"
            row["poids_defensif"] = f"{row['poids_defensif']:.1f}"
            writer.writerow(row)
    log.info("  → %s (%d lignes)", path.name, len(resultats))


def exporter_guildes_csv(resultats: list[dict], path: Path):
    """Exporte les moyennes par guilde en CSV."""
    # Regrouper par guilde
    guildes = defaultdict(lambda: {"joueurs": [], "guild_name": "", "guild_id": 0})
    for r in resultats:
        gid = r["guild_id"]
        if gid == 0:
            continue
        guildes[gid]["joueurs"].append(r)
        # Garder le nom de guilde le plus long (LOCAL > REMOTE)
        if len(r["guild_name"]) > len(guildes[gid]["guild_name"]):
            guildes[gid]["guild_name"] = r["guild_name"]
            guildes[gid]["guild_id"] = gid

    lignes = []
    for gid, g in guildes.items():
        joueurs = g["joueurs"]
        n = len(joueurs)
        lignes.append({
            "guild_name": g["guild_name"] or f"Guilde#{gid}",
            "guild_id": gid,
            "nb_members": n,
            "avg_poids_offensif": f"{sum(j['poids_offensif'] for j in joueurs) / n:.1f}",
            "avg_level": f"{sum(j['level'] for j in joueurs) / n:.1f}",
            "avg_poids_defensif": f"{sum(j['poids_defensif'] for j in joueurs) / n:.1f}",
        })

    lignes.sort(key=lambda x: float(x["avg_poids_offensif"]), reverse=True)

    colonnes = ["guild_name", "guild_id", "nb_members",
                "avg_poids_offensif", "avg_level", "avg_poids_defensif"]
    with open(path, "w", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(f, fieldnames=colonnes)
        writer.writeheader()
        writer.writerows(lignes)
    log.info("  → %s (%d guildes)", path.name, len(lignes))


# ═══════════════════════ Main ════════════════════════════════════════

def main():
    print("╔══════════════════════════════════════════════════════════════╗")
    print("║  Wakfu Assistant — Calcul des poids d'équipement           ║")
    print("╚══════════════════════════════════════════════════════════════╝\n")

    # 1. Charger les items
    if not ITEMS_JSON.exists():
        log.error("Fichier items.json introuvable : %s", ITEMS_JSON)
        return
    items_db = charger_items(ITEMS_JSON)

    # 2. Charger les joueurs
    if not PLAYERS_DIR.exists():
        log.error("Dossier joueurs introuvable : %s", PLAYERS_DIR)
        return
    joueurs = charger_joueurs(PLAYERS_DIR)

    # 3. Calculer pour chaque joueur
    log.info("Calcul des poids pour %d joueurs...", len(joueurs))
    resultats = []
    items_inconnus_total = 0

    for j in joueurs:
        r = calculer_joueur(j, items_db)
        if r is not None:
            resultats.append(r)

    # Trier par poids offensif décroissant
    resultats.sort(key=lambda x: x["poids_offensif"], reverse=True)

    # 4. Afficher le détail pour L'Immortel
    for r in resultats:
        if r["name"] == "L'Immortel":
            afficher_detail_joueur(r)
            break

    # 5. Top 50 joueurs par poids offensif
    print(f"\n{'─' * 90}")
    print(f"  TOP 50 JOUEURS PAR POIDS OFFENSIF NORMALISÉ")
    print(f"{'─' * 90}")
    print(f"  {'#':>3} {'Joueur':<25} {'Niv':>4} {'Classe':<12} "
          f"{'Guilde':<20} {'Poids Off':>10} {'PV':>5} {'PA':>3} {'PM':>3}")
    print(f"  {'─' * 86}")

    for i, r in enumerate(resultats[:50], 1):
        gname = r["guild_name"][:18] if r["guild_name"] else "-"
        print(f"  {i:>3} {r['name'][:24]:<25} {r['level']:>4} "
              f"{r['breedName']:<12} {gname:<20} "
              f"{r['poids_offensif']:>10.1f} {r['total_pv']:>5} "
              f"{r['pa']:>3} {r['pm']:>3}")

    # 6. Exporter les CSV
    print()
    OUTPUT_DIR.mkdir(parents=True, exist_ok=True)
    exporter_joueurs_csv(resultats, OUTPUT_DIR / "player_weights.csv")
    exporter_guildes_csv(resultats, OUTPUT_DIR / "guild_average_weights.csv")

    # 7. Résumé
    print(f"\n{'─' * 60}")
    print(f"  RÉSUMÉ")
    print(f"{'─' * 60}")
    print(f"  Joueurs traités   : {len(resultats)} / {len(joueurs)}")
    print(f"  Joueurs sans stuff: {len(joueurs) - len(resultats)}")
    print(f"  Guildes uniques   : {len({r['guild_id'] for r in resultats if r['guild_id']})}")
    if resultats:
        print(f"  Poids off. max    : {resultats[0]['poids_offensif']:.1f} ({resultats[0]['name']})")
        print(f"  Poids off. moyen  : {sum(r['poids_offensif'] for r in resultats) / len(resultats):.1f}")
    print(f"{'─' * 60}\n")


if __name__ == "__main__":
    main()
