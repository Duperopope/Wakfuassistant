"""
import_recettes.py — Importe Recettes.csv dans game_database.json

Usage:
    python scripts/import_recettes.py [--xp-mult FLOAT] [--dry-run]

Options:
    --xp-mult   Multiplicateur XP (défaut: 1.4667 = monocompte 660/450)
    --dry-run   Affiche les stats sans écrire
"""
from __future__ import annotations

import argparse
import csv
import json
import re
import sys
from pathlib import Path

_ROOT = Path(__file__).resolve().parents[1]
sys.path.insert(0, str(_ROOT))

from core.game_database import upsert_recipe  # noqa: E402

_ITEMS_JSON  = _ROOT / "data" / "ankama_cdn" / "items.json"
_RECIPES_CSV = _ROOT / "data" / "Recettes.csv"

# IDs obsolètes (métiers supprimés du jeu)
_OBSOLETE_JOB_IDS = {67, 69, 70}

# Multiplicateur monocompte par défaut : 660/450
_DEFAULT_XP_MULT = 660 / 450


def build_item_lookup() -> dict[int, str]:
    """Construit un dict {item_id: nom_fr} depuis items.json."""
    print("Chargement items.json…", end=" ", flush=True)
    raw = json.loads(_ITEMS_JSON.read_text(encoding="utf-8"))
    lookup: dict[int, str] = {}
    for entry in raw:
        try:
            iid  = int(entry["definition"]["item"]["id"])
            name = str(entry.get("title", {}).get("fr", "") or "").strip()
            if name:
                lookup[iid] = name
        except (KeyError, TypeError, ValueError):
            continue
    print(f"{len(lookup):,} items chargés.")
    return lookup


_INGR_RE = re.compile(r"ID:(\d+)\s*x(\d+)")


def parse_ingredients(raw: str, lookup: dict[int, str]) -> list[dict]:
    components = []
    for m in _INGR_RE.finditer(raw):
        item_id = int(m.group(1))
        qty     = int(m.group(2))
        name    = lookup.get(item_id, f"ID:{item_id}")
        components.append({"item": name, "item_id": item_id, "qty": qty})
    return components


def run(xp_mult: float, dry_run: bool) -> None:
    lookup = build_item_lookup()

    print(f"Lecture {_RECIPES_CSV.name}…", end=" ", flush=True)
    rows: list[dict] = []
    with _RECIPES_CSV.open(encoding="utf-8") as f:
        for row in csv.DictReader(f):
            rows.append(row)
    print(f"{len(rows):,} lignes.")

    skipped_jobs: set[str] = set()
    counts: dict[str, int] = {}
    unresolved = 0

    for row in rows:
        job_id = int(row["JobID"])
        if job_id in _OBSOLETE_JOB_IDS:
            skipped_jobs.add(row["Métier"])
            continue

        profession = row["Métier"].strip()
        pkey       = profession.lower()
        item_id    = int(row["ItemID"])
        item_name  = str(row["Nom"]).strip()
        craft_lvl  = int(row["Niveau_Craft"]) if row["Niveau_Craft"].strip().lstrip("-").isdigit() else None
        rarity     = int(row["Rareté"])   if row["Rareté"].strip().isdigit()         else None
        base_xp    = int(row["XP"])       if row["XP"].strip().isdigit()             else None
        xp         = round(base_xp * xp_mult) if base_xp is not None else None

        components = parse_ingredients(row["Ingrédients"], lookup)
        for c in components:
            if c["item"].startswith("ID:"):
                unresolved += 1

        recipe = {
            "id":          f"csv-{job_id}-{item_id}",
            "item_id":     item_id,
            "output_item": item_name,
            "output_qty":  1,
            "xp":          xp,
            "craft_level": craft_lvl,
            "rarity":      rarity,
            "components":  components,
        }

        if not dry_run:
            upsert_recipe(profession, "outgoing", recipe)

        counts[profession] = counts.get(profession, 0) + 1

    print()
    print("── Résultat ──────────────────────────────")
    for prof, n in sorted(counts.items()):
        print(f"  {prof:<22} {n:>4} recettes")
    print(f"  {'TOTAL':<22} {sum(counts.values()):>4}")
    if skipped_jobs:
        print(f"\n  Métiers obsolètes ignorés : {', '.join(sorted(skipped_jobs))}")
    if unresolved:
        print(f"\n  ⚠  {unresolved} composants non résolus (ID inconnu dans items.json)")
    if dry_run:
        print("\n  [DRY-RUN] Aucune écriture effectuée.")
    else:
        print("\n  ✓ Import terminé dans data/game_database.json")


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Importe Recettes.csv dans game_database.json")
    parser.add_argument("--xp-mult", type=float, default=_DEFAULT_XP_MULT,
                        help=f"Multiplicateur XP (défaut: {_DEFAULT_XP_MULT:.4f})")
    parser.add_argument("--dry-run", action="store_true",
                        help="Simule sans écrire")
    args = parser.parse_args()
    run(xp_mult=args.xp_mult, dry_run=args.dry_run)
