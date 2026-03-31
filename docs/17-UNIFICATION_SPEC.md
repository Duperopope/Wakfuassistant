# docs/17-UNIFICATION_SPEC.md
# Wakfu Assistant - Source de verite du projet Web
# Date: 2026-03-31 | Statut: EN COURS
#
# TOUT LLM DOIT LIRE CE FICHIER AVANT DE CODER.
# Si un choix contredit ce fichier, c'est le choix qui a tort.

## REGLES ABSOLUES

1. JAMAIS de fix_*.py ou patch_*.py a la racine
2. JAMAIS reecrire un onglet from scratch - on modifie l existant
3. JAMAIS toucher src/ ni src-tauri/ (overlay = futur)
4. UNE seule source de verite par concept (rarete, icones, tooltip)
5. Chaque modif = 1 commit testable
6. Nettoyer au fur et a mesure - supprimer l ancien quand on extrait

## SCOPE ACTIF (web uniquement)

    src-web/          Frontend Vite vanilla JS
    tools/            Backend FastAPI Python
    scripts/          Sync HDV PowerShell
    agent/            Java ByteBuddy capture
    docs/             Documentation

## HORS SCOPE (ne pas toucher)

    src/              SolidJS Tauri (futur)
    src-tauri/        Rust backend (futur)
    build-generator/  Ancien, session dediee
    _archive_v1*/     Archive morte

## PROBLEMES IDENTIFIES

### 4 palettes de rarete differentes
- tooltip.js : couleurs wiki officielles (source de verite)
- app.css .rarity-0 a .rarity-7 : couleurs differentes
- hdv.js RARITY_COLORS : encore differentes + ordre Epique/Souvenir inverse
- character.js rMap : simplifiee, couleurs differentes

DECISION: on utilise tooltip.js (wiki officiel) partout.

### 3 systemes d icones
- character.js : atlas base64 precharge (instantane) = MEILLEUR
- modal.js + inventory.js : /icons/items/{gfx}.png (requete par icone)
- hdv.js : CDN Ankama externe

DECISION: atlas partout, CDN en fallback.

### 2 tooltips incompatibles
- tooltip.js : stats CDN detaillees, pas de prix
- hdv.js showPriceTooltip : graphe prix, pas de stats

DECISION: un seul tooltip qui combine les deux.

### SSE partiel
- Classement reagit au SSE (temps reel)
- HDV et Personnage ignorent le SSE

DECISION: SSE etendu, tous les onglets reagissent.

### API hardcodee
- api.js : API_BASE = http://127.0.0.1:8042

DECISION: API_BASE vide (relatif) pour Render.

## PLAN D EXECUTION

### Etape 1 - Nettoyage (commit 1)
Supprimer du repo: fix_*.py, _archive_v1_20260329/
Statut: TODO

### Etape 2 - Creer shared/ (commit 2)
Creer src-web/js/shared/item.js :
  - RARITY (depuis tooltip.js, wiki officiel)
  - TYPE_INFO, ACTIONS, SLOT_NAMES (depuis tooltip.js)
  - loadIconsAtlas(), getIconSrc() (depuis character.js)
  - icoUrl() fallback CDN (depuis hdv.js)
  - fmtK() formatage prix (depuis hdv.js)
Creer src-web/js/shared/tooltip.js :
  - Tooltip unifie = stats CDN + graphe prix marche
  - Un seul initTooltipDelegation() global
Creer src-web/js/shared/events.js :
  - SSE etendu: player-update, hdv-update, inventory-update
NE RIEN MODIFIER D AUTRE dans ce commit.
Statut: TODO

### Etape 3 - Migrer les onglets (1 commit par onglet)
3a. hdv.js : supprimer RARITY_NAMES/COLORS/fmtK/icoUrl, importer shared/
3b. character.js : supprimer RARITY/getIconSrc/loadIconsAtlas, importer shared/
3c. modal.js : supprimer RARITY_CLASSES, importer shared/
3d. inventory.js : supprimer RARITY_CLASS/rc(), importer shared/
3e. app.css : aligner .rarity-0 a .rarity-7 sur couleurs wiki
Statut: TODO

### Etape 4 - Preparer Render (commit)
- api.js : API_BASE vide
- api_v2.py : servir dist-web/ en static
- Ajouter requirements.txt
- npm run build:web doit produire dist-web/ fonctionnel
Statut: TODO

## BASES DE DONNEES

### Publiques (exposees par l API)
- wakfu.db : joueurs, guildes, classement, snapshots equipement
- hdv_market.db : offres HDV, historique prix

### Privees (jamais exposees)
- Donnees compte personnel (inventaire, coffre, kamas)
  -> endpoint /api/inventory/local et /api/chest proteges ou separes

## DEPLOIEMENT CIBLE

Render.com Web Service
Build: npm install && npm run build:web && pip install -r requirements.txt
Start: uvicorn tools.api_v2:app --host 0.0.0.0 --port 
DB: Turso (SQLite distribue, 5GB gratuit, bases separees public/prive)