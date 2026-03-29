# -*- coding: utf-8 -*-
"""
Nettoyage post-migration v2.
1) Identifier les fichiers obsoletes
2) Les deplacer dans un dossier _archive (pas supprimer)
3) Optimiser le watcher (reload incremental)
"""
import os, shutil, glob, time

PROJECT = "H:/Code/Wakfuassistant"
ARCHIVE = os.path.join(PROJECT, "_archive_v1_%s" % time.strftime("%Y%m%d"))

# Creer le dossier d'archive
os.makedirs(ARCHIVE, exist_ok=True)
os.makedirs(os.path.join(ARCHIVE, "logs"), exist_ok=True)
print("=== ARCHIVE: %s ===" % ARCHIVE)

moved = 0
kept = 0

# =====================================================
# 1) ANCIEN BACKEND -> archive
# =====================================================
old_api = os.path.join(PROJECT, "tools/weights_api.py")
if os.path.exists(old_api):
    shutil.copy2(old_api, os.path.join(ARCHIVE, "weights_api.py"))
    os.remove(old_api)
    print("[ARCHIVE] weights_api.py (ancien backend monolithe)")
    moved += 1

# =====================================================
# 2) ANCIENNES BASES SEPAREES -> archive
# =====================================================
old_dbs = [
    "logs/hdv_market.db",
    "logs/craft_economy.db",
]
for rel in old_dbs:
    fpath = os.path.join(PROJECT, rel)
    if os.path.exists(fpath):
        shutil.copy2(fpath, os.path.join(ARCHIVE, "logs", os.path.basename(fpath)))
        os.remove(fpath)
        print("[ARCHIVE] %s (migre dans wakfu.db)" % rel)
        moved += 1

# =====================================================
# 3) BACKUP de wakfu.db si existe
# =====================================================
bak_files = glob.glob(os.path.join(PROJECT, "logs/wakfu.db.bak_*"))
for f in bak_files:
    shutil.move(f, os.path.join(ARCHIVE, "logs", os.path.basename(f)))
    print("[ARCHIVE] %s" % os.path.basename(f))
    moved += 1

# =====================================================
# 4) FICHIERS JOUEURS JSON -> on les GARDE pour l'instant
#    Le watcher en a besoin pour detecter les changements.
#    On les supprimera quand le capture ira directement en SQLite.
# =====================================================
players_dir = os.path.join(PROJECT, "logs/players")
main_count = len([f for f in os.listdir(players_dir) if f.endswith('.json') and '_t' not in f])
snap_count = len([f for f in os.listdir(players_dir) if f.endswith('.json') and '_t' in f])
print("\n[GARDE] logs/players/ (%d principaux + %d snapshots)" % (main_count, snap_count))
print("  -> Le watcher lit encore ces fichiers.")
print("  -> Seront supprimes quand le capture ecrira directement en SQLite.")
kept += main_count + snap_count

# =====================================================
# 5) VERIFIER qu'on ne casse rien
# =====================================================
print("\n=== FICHIERS GARDES (essentiels) ===")
essentials = [
    "tools/api_v2.py",
    "tools/db.py",
    "tools/calculate_weights.py",
    "logs/wakfu.db",
    "src-web/index.html",
    "src-web/main.js",
    "src-web/css/app.css",
    "src-web/js/tabs/inventory.js",
    "src-web/js/tabs/players.js",
    "src-web/js/tabs/guilds.js",
    "src-web/js/tabs/classes.js",
    "src-web/js/tabs/recent.js",
    "src-web/js/modal.js",
    "rnd/data/cdn_items.json",
]
for rel in essentials:
    fpath = os.path.join(PROJECT, rel)
    exists = os.path.exists(fpath)
    size = os.path.getsize(fpath) if exists else 0
    status = "OK (%d B)" % size if exists else "MANQUANT!"
    print("  %s: %s" % (rel, status))

# =====================================================
# 6) SCRIPTS TEMPORAIRES RESIDUELS -> archive
# =====================================================
temp_scripts = glob.glob(os.path.join(PROJECT, "tools/_*.py"))
for f in temp_scripts:
    bn = os.path.basename(f)
    if bn.startswith("_") and bn not in ("__init__.py",):
        shutil.move(f, os.path.join(ARCHIVE, bn))
        print("[ARCHIVE] tools/%s (script temporaire)" % bn)
        moved += 1

# =====================================================
# 7) RESUME
# =====================================================
archive_size = 0
for root, dirs, files in os.walk(ARCHIVE):
    for f in files:
        archive_size += os.path.getsize(os.path.join(root, f))

print("\n" + "=" * 50)
print("RESUME NETTOYAGE")
print("=" * 50)
print("  Fichiers archives: %d" % moved)
print("  Fichiers gardes: %d" % (kept + len(essentials)))
print("  Taille archive: %.1f KB" % (archive_size / 1024))
print("  Dossier archive: %s" % ARCHIVE)
print()
print("  IMPORTANT: l'archive contient l'ancien code.")
print("  Vous pouvez la supprimer dans quelques jours")
print("  une fois que tout est valide en production.")
print()
print("  Pour lancer le serveur v2:")
print("    cd H:\\Code\\Wakfuassistant && python tools\\api_v2.py --port 8042")
