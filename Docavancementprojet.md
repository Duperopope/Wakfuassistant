# WAKFU ASSISTANT — Documentation Technique Complète

> **Date** : 2026-03-31  
> **Repository** : https://github.com/Duperopope/Wakfuassistant  
> **Branche** : master  
> **Auteur initial** : Duperopope

---

## TABLE DES MATIÈRES

1. Architecture globale
2. Couche 1 — Agent Java (collecte des données)
3. Couche 2 — Serveur Python (API + temps réel)
4. Couche 3 — Frontend SPA (interface utilisateur)
5. Flux de données complets
6. Système SSE (temps réel)
7. Bases de données
8. Endpoints API exhaustifs
9. Modules frontend détaillés
10. Système de tooltip unifié
11. Fichiers de données (logs/)
12. Dépendances entre modules
13. Bugs connus et dettes techniques
14. Checklist migration vers Release

---

## 1. ARCHITECTURE GLOBALE

L'application est composée de trois couches indépendantes communiquant via fichiers JSON/SQLite et HTTP/SSE.
```

┌──────────────────────────────────────────────────────────────┐
│ CLIENT WAKFU (JVM) │
│ Agent Java (ByteBuddy) injecté dans le processus de jeu │
│ → Intercepte les paquets réseau (protobuf) │
│ → Lit la mémoire du jeu (inventaire, coffre, joueurs) │
│ → Écrit dans logs/ (JSON, protobuf hex, SQLite) │
└──────────────┬───────────────────────────────────────────────┘
│ Fichiers sur disque
▼
┌──────────────────────────────────────────────────────────────┐
│ SERVEUR PYTHON (FastAPI) │
│ tools/api_v2.py — Port 8042 │
│ → Watcher unifié (toutes les 5s) sur logs/ │
│ → Parse protobuf HDV (hdv_sync.py) │
│ → Calcule les scores (calculate_weights.py) │
│ → Stocke dans wakfu.db (joueurs) et hdv_market.db (HDV) │
│ → Expose API REST + SSE temps réel │
└──────────────┬───────────────────────────────────────────────┘
│ HTTP + SSE (port 8042)
▼
┌──────────────────────────────────────────────────────────────┐
│ FRONTEND SPA (Vite) │
│ src-web/ — JavaScript ES modules │
│ → 3 onglets principaux : Classement, Personnage, HDV │
│ → Tooltip unifié (wiki-style avec graphe prix) │
│ → SSE pour mises à jour temps réel │
└──────────────────────────────────────────────────────────────┘

````

---

## 2. COUCHE 1 — AGENT JAVA

### Emplacement
`agent/src/main/java/com/wakfuassistant/agent/`

### Fichiers Java principaux

| Fichier Java | Rôle | Fichier de sortie |
|---|---|---|
| `CharacterExtractorAdvice.java` | Intercepte les données des joueurs proches | `logs/players/{name}.json` |
| `InventoryPassiveReader.java` | Lecture passive de l'inventaire toutes les ~5s | `logs/inventory_bags.json` |
| `AccountChestAdvice.java` | Capture le coffre de compte quand ouvert en jeu | `logs/account_chest_full.json` |
| `UniversalSnifferAdvice.java` | Sniffe les paquets réseau protobuf (HDV, kamas) | `logs/market_v3_proto.log` |
| `CharacterAdvice.java` | Log les joueurs locaux/distants rencontrés | `logs/character_data.log` |
| `CacheBoosterAdvice.java` | Gestion du cache | — |

### Format des fichiers de sortie

**logs/players/{name}.json** — Un fichier JSON par joueur observé :
```json
{
  "name": "Madame Céleste",
  "level": 154,
  "breedId": 18,
  "breedName": "Ouginak",
  "sex": 1,
  "guild": "id|name",
  "equipment": "0=12345,3=67890,...",
  "equipmentLevel": "12345=154,67890=154,...",
  "spells": "...",
  "appearance": "..."
}
````

**logs/inventory_bags.json** — Inventaire complet :

```json
{
  "timestamp": "2026-03-31T14:20:46",
  "source": "InventoryPassiveReader",
  "player": "<undefined>",
  "level": 154,
  "kamas": 2204302,
  "totalBags": 4,
  "totalItems": 47,
  "bags": [
    {
      "bagId": "...",
      "bagName": "item_XXXX",
      "capacity": 30,
      "itemCount": 12,
      "items": [{ "refId": 2021, "name": "item_2021", "quantity": 6 }]
    }
  ]
}
```

**logs/account_chest_full.json** — Coffre de compte :

```json
{
  "lastUpdate": "2026-03-31T10:57:14",
  "totalCompartments": 3,
  "totalItems": 156,
  "totalCapacity": 200,
  "totalEnchanted": 12,
  "compartments": [
    {
      "id": "...",
      "name": "Compartiment 1",
      "capacity": 70,
      "itemCount": 52,
      "enchantedCount": 4,
      "emptySlots": 18,
      "items": [
        { "itemId": 12345, "name": "item_12345", "quantity": 1, "level": 200, "enchant": {...}, "maxStack": 1 }
      ]
    }
  ]
}
```

**logs/market_v3_proto.log** — Données HDV en protobuf hex (append-only) :

```
19:22:56.298|clX|msgId=12294|type=MARKET_ENTRIES|status=0|protoLen=641|rawSize=647|PROTOHEX=0A08...
KAMAS_UPDATE|kamas=2203982
```

Ligne de type `msgId=12294` = offres de vente. `msgId=13653` = offres d'achat. `KAMAS_UPDATE` = solde kamas.

**logs/character_data.log** — Journal des joueurs rencontrés :

```
[2026-03-28T15:45:56.533] LOCAL_PLAYER | Madame Céleste | Ouginak Lv.154 | kamas=-1 | entityId=3134552
[2026-03-28T15:45:56.533] REMOTE_PLAYER | Asterrex | Ouginak Lv.98 | kamas=-1 | entityId=6616261
```

### Bug connu

`InventoryPassiveReader.java` ligne ~211 : `callStringMethod(localPlayer, "getName", "unknown")` retourne `<undefined>` car la méthode JVM est obfusquée. Le nom du joueur n'est donc pas correctement extrait dans `inventory_bags.json`.

---

## 3. COUCHE 2 — SERVEUR PYTHON

### Fichiers principaux

| Fichier                      | Rôle                                            | Lignes environ |
| ---------------------------- | ----------------------------------------------- | -------------- |
| `tools/api_v2.py`            | Serveur FastAPI principal (API + SSE + watcher) | ~1200          |
| `tools/db.py`                | Couche d'accès SQLite (WakfuDB)                 | ~400           |
| `tools/hdv_sync.py`          | Parser protobuf HDV → SQLite                    | ~250           |
| `tools/calculate_weights.py` | Calcul des scores offensif/défensif             | ~300           |
| `tools/config.py`            | Configuration partagée                          | ~20            |
| `tools/cdn.py`               | Utilitaires CDN                                 | ~50            |

### tools/api_v2.py — Structure interne

Le fichier est organisé en sections :

**Configuration (lignes 1-60)** : imports, constantes (`BASE_DIR`, `PLAYERS_DIR`, `DB_PATH`, `ICONS_DIR`, `WEB_DIR`, `ITEMS_JSON`, `COOLDOWN=5`), logging.

**Base de données (lignes 60-90)** : initialisation de `WakfuDB`, chargement de `calculate_weights` pour le scoring.

**SSE (lignes 90-110)** : `_sse_clients` (liste de `asyncio.Queue`), `_sse_lock` (threading.Lock), `broadcast_sse(event, data)` qui envoie un JSON à tous les clients SSE connectés.

**Reload joueurs (lignes 110-240)** : `reload_players()` parcourt `logs/players/*.json`, parse chaque fichier, calcule les scores via `calculer_joueur()`, fait un upsert dans la DB. `reload_single_player(fpath)` recharge un seul joueur.

**Watcher unifié (lignes 240-345)** : `_start_watcher()` lance un thread daemon `UnifiedWatcher` qui toutes les 5 secondes vérifie les modifications (mtime) de quatre sources. Quand un fichier change, il lance l'action correspondante et émet un événement SSE.

| Fichier surveillé              | Action au changement                              | Événement SSE émis |
| ------------------------------ | ------------------------------------------------- | ------------------ |
| `logs/players/*.json`          | `reload_single_player()`                          | `update`           |
| `logs/market_v3_proto.log`     | `hdv_run_sync()` (parser protobuf incrémental)    | `hdv`              |
| `logs/account_chest_full.json` | Aucune (le fichier est lu à la demande par l'API) | `chest`            |
| `logs/inventory_bags.json`     | Aucune (le fichier est lu à la demande par l'API) | `inventory`        |

Au démarrage, le watcher fait un sync HDV initial complet (offset 0), puis ne parse que les nouvelles lignes (offset incrémental).

**FastAPI app (lignes 345+)** : endpoints REST, SSE, service de fichiers statiques.

**CDN Cache (lignes ~850-920)** : `_ensure_cdn_cache()` charge `cdn_items.json` et `i18n_items_local.json` en mémoire. `_cdn_lookup(ref_id)` retourne nom, level, rarity, gfxId, typeId, description.

**Endpoints Personnage (lignes ~920-1060)** : `/api/build-data`, `/api/inventory/local`, `/api/chest` — chargent les fichiers JSON locaux et enrichissent les items via le CDN.

**Endpoints HDV (lignes ~1060+)** : `/api/market`, `/api/market/stats`, `/api/market/history/{item_id}`, `/api/patrimoine` — lisent `hdv_market.db`.

### tools/db.py — WakfuDB

Classe thread-safe avec connexion par thread (`threading.local`). Tables utilisées dans `wakfu.db` :

| Table                 | Usage                                                                       |
| --------------------- | --------------------------------------------------------------------------- |
| `players`             | Tous les joueurs observés (nom, niveau, classe, guilde, scores, équipement) |
| `equipment_snapshots` | Historique d'équipement par tranche de niveau                               |
| `cdn_items`           | Cache CDN (nom, level, rarity, gfx_id, type_id)                             |
| `api_keys`            | Clés API pour les endpoints `/api/v1/`                                      |
| `scan_logs`           | Historique des scans (type, durée, nombre de joueurs)                       |

Méthodes principales : `get_players()`, `count_players()`, `get_player(name)`, `upsert_player(data)`, `search_players(query)`, `get_guilds()`, `get_classes()`, `get_recent(limit)`, `get_stats()`, `get_armory(breed, min_level, max_level, top)`, `get_cdn_item(item_id)`, `search_cdn()`, `validate_api_key(key)`, `log_scan()`.

### tools/hdv_sync.py — Parser protobuf HDV

Remplace le script PowerShell `scripts/sync_hdv_to_sqlite.ps1` (548 lignes → ~250 lignes Python).

Fonctions : `read_varint()`, `read_length_delimited()`, `skip_field()`, `decode_slot_color()`, `parse_sell_entry()`, `parse_buy_entry()`, `parse_entries()`, `parse_proto_log(log_path, from_offset)`, `sync_to_db(db_path, entries)`, `run_sync(log_path, db_path, from_offset)`.

Mapping des couleurs de gemmes (corrigé) : 0=Vide, 1=Rouge, 2=Vert, 3=Bleu, 4=Blanc, 5=Noir, 6=Any.

Tables SQLite dans `hdv_market.db` : `market_observations` (historique brut avec hash SHA-1 unique), `market_latest` (état courant avec UPSERT sur `PRIMARY KEY (side, item_ref_id, offer_uid)`).

---

## 4. COUCHE 3 — FRONTEND SPA

### Structure des fichiers

```
src-web/
├── index.html              # Page unique SPA
├── main.js                 # Point d'entrée (284 lignes)
├── css/
│   └── app.css             # Styles (thème sombre)
├── icons/
│   ├── items/              # PNG items (gfxId.png + gemmes shardXxxFull.png)
│   ├── slots/              # PNG slots d'équipement
│   └── spells/             # PNG sorts
└── js/
    ├── api.js              # Client HTTP (fetchJson, reloadData, connectSSE legacy)
    ├── state.js            # État global réactif
    ├── utils.js            # esc(), debounce(), formatNumber()
    ├── modal.js            # Modale détail joueur
    ├── tooltip.js          # Tooltip unifié v3 (wiki-style)
    ├── shared/
    │   ├── events.js       # SSE unifié (on, emit, connectSSE)
    │   └── item.js         # Constantes (RARITY, TYPE_INFO, ACTIONS, GEM_COLORS) + helpers
    └── tabs/
        ├── players.js      # Classement joueurs
        ├── guilds.js       # Classement guildes (Wilson score)
        ├── recent.js       # Joueurs récents (nouveaux + mis à jour)
        ├── inventory.js    # Armurerie (best-in-slot par slot)
        ├── character.js    # Personnage (Build + Inventaire + Coffre)
        ├── hdv.js          # HDV Market + Patrimoine (172 lignes)
        ├── classes.js       # Stats par classe
        ├── equipment.js    # Builder d'équipement
        ├── optimizer.js    # Optimiseur de build
        └── spells.js       # Éditeur de sorts
```

### Onglets principaux

L'application a 3 onglets principaux gérés par `switchTab(tab)` dans `main.js` :

**1. Classement** (`currentTab = "classement"`) — 4 sous-onglets :

- **Joueurs** (`players.js`) : tableau trié/filtré/paginé des joueurs
- **Guildes** (`guilds.js`) : classement avec score de Wilson ajusté
- **Récents** (`recent.js`) : nouveaux joueurs et mises à jour récentes
- **Armurerie** (`inventory.js`) : items les plus portés par slot

**2. Personnage** (`currentTab = "cdn"`) — 4 sous-onglets :

- **Fiche** (`character.js`) : Build + Inventaire + Coffre du joueur local
- **Builder** (`equipment.js`) : éditeur d'équipement
- **Optimiseur** (`optimizer.js`) : optimisation de build
- **Sorts** (`spells.js`) : éditeur de sorts

**3. HDV Market** (`currentTab = "hdv"`) — 2 sous-onglets :

- **Patrimoine** : valeur totale du joueur (coffre + inventaire évalués aux prix HDV)
- **Marché** : navigateur d'offres HDV avec recherche, filtre achat/vente, pagination

---

## 5. FLUX DE DONNÉES COMPLETS

### Flux "Classement des joueurs"

```
Jeu Wakfu → CharacterExtractorAdvice.java
  → Écrit logs/players/{name}.json
    → Watcher Python détecte mtime change (toutes les 5s)
      → reload_single_player(fpath) → calculer_joueur() → db.upsert_player()
        → broadcast_sse("update", {players, count, duration_ms})
          → EventSource frontend reçoit "update"
            → main.js: onSSE("update") → fetchJson("/api/stats") + loadPlayers()
              → players.js: fetchJson("/api/players?sort=...") → renderPlayerRows()
```

### Flux "HDV Market"

```
Jeu Wakfu → UniversalSnifferAdvice.java
  → Écrit logs/market_v3_proto.log (append, lignes protobuf hex)
    → Watcher Python détecte mtime change
      → hdv_run_sync(proto_path, db_path, offset) → parse_proto_log() + sync_to_db()
        → Insère dans hdv_market.db (market_observations + market_latest)
          → broadcast_sse("hdv", {new_entries, offset})
            → main.js: onSSE("hdv") → loadHdv()
              → hdv.js: fetchJson("/api/market?...") → renderMarket()
```

### Flux "Personnage" (inventaire/coffre)

```
Jeu Wakfu → InventoryPassiveReader.java / AccountChestAdvice.java
  → Écrit logs/inventory_bags.json / logs/account_chest_full.json
    → Watcher Python détecte mtime change
      → broadcast_sse("inventory"/"chest", {...})
        → main.js: onSSE("inventory"/"chest") → loadCharacter()
          → character.js: Promise.allSettled([
              fetchJson("/api/build-data"),
              fetchJson("/api/inventory/local"),
              fetchJson("/api/chest")
            ]) → loadSheet(container) → renderGrids()
```

### Flux "Patrimoine" (évaluation)

```
/api/patrimoine (dans api_v2.py)
  → Lit logs/account_chest_full.json + logs/inventory_bags.json
  → Pour chaque item, cherche le prix dans hdv_market.db (market_latest)
  → Filtre par slot_colors si l'item est enchanté
  → Calcule la valeur totale = somme(prix_unitaire × quantité)
  → Retourne {totalValue, kamas, chestValue, inventoryValue, topItems[]}
```

### Flux "Tooltip" (au survol d'un item)

```
Utilisateur survole un élément [data-item-id="12345"]
  → initTooltipDelegation() (document mouseover)
    → showTooltip(evt, 12345, slotColors)
      → Si cache[12345] existe : renderTooltip() immédiat
      → Sinon : fetch("/api/cdn/12345")
        → api_v2.py: cherche dans _items_db (mémoire) + db.get_cdn_item()
        → Retourne {name_fr, level, rarity, type_id, gfx_id, effects[], desc_fr}
      → renderTooltip() : HTML avec gradient rareté, icône, effets, gemmes
      → _loadPriceChart(12345, slotColors)
        → fetch("/api/market/history/12345?slot_colors=...")
        → Affiche min/max/avg prix + graphe canvas
```

---

## 6. SYSTÈME SSE (TEMPS RÉEL)

### Côté serveur (api_v2.py)

Le endpoint `GET /api/events` crée un `asyncio.Queue` par client connecté. Le thread `UnifiedWatcher` appelle `broadcast_sse(event, data)` qui pousse un message dans toutes les queues. Le format SSE est :

```
event: update
data: {"players":["Madame Céleste"],"count":1,"duration_ms":45}
```

Keepalive envoyé toutes les 30 secondes (`": keepalive\n\n"`).

### Événements SSE émis

| Événement   | Émetteur             | Données                            | Quand                                       |
| ----------- | -------------------- | ---------------------------------- | ------------------------------------------- |
| `update`    | Watcher (joueurs)    | `{players:[], count, duration_ms}` | Un fichier joueur change dans logs/players/ |
| `hdv`       | Watcher (HDV)        | `{new_entries, offset}`            | market_v3_proto.log change                  |
| `chest`     | Watcher (coffre)     | `{file, updated: true}`            | account_chest_full.json change              |
| `inventory` | Watcher (inventaire) | `{file, updated: true}`            | inventory_bags.json change                  |
| `reload`    | POST /api/reload     | `{players, duration_ms}`           | Rechargement manuel complet                 |

### Côté frontend

**shared/events.js** gère l'EventSource unique. `connectSSE()` est appelé une seule fois dans `main.js` à l'init. Les onglets s'abonnent via `onSSE(event, callback)`.

| Événement   | Abonné  | Action                                         |
| ----------- | ------- | ---------------------------------------------- |
| `update`    | main.js | Refresh stats + reload onglet classement actif |
| `hdv`       | main.js | Reload HDV si onglet actif                     |
| `chest`     | main.js | Reload HDV + Personnage si onglet actif        |
| `inventory` | main.js | Reload HDV + Personnage si onglet actif        |
| `reload`    | main.js | Refresh stats + classes                        |

### Double SSE (dette technique)

`api.js` contient encore `connectSSE(onReload)` qui crée un EventSource séparé. Cette fonction n'est plus appelée depuis `main.js` (qui utilise `shared/events.js`), mais le fichier `api.js` l'exporte toujours. Code mort à supprimer.

---

## 7. BASES DE DONNÉES

### logs/wakfu.db (joueurs, ~SQLite)

Tables :

- `players` : name (PK), level, breed_id, breed_name, sex, guild_name, guild_id, nation_id, equipment, equipment_level, spells, appearance, active_title, score_global, poids_offensif, poids_defensif, poids_resistance, poids_soin, pa, pm, first_seen, last_seen, updated_at
- `equipment_snapshots` : player_name, level, equipment, equipment_level, breed_name, captured_at
- `cdn_items` : item_id, name_fr, level, type_id, rarity, gfx_id (+ potentiellement d'autres colonnes)
- `api_keys` : key, owner, permissions, rate_limit, created_at, active, last_used
- `scan_logs` : scan_type, players_found, duration_ms, details, created_at

### logs/hdv_market.db (marché)

Tables :

- `market_observations` : id (autoincrement), observed_at, side, item_ref_id, offer_uid, actor_name, actor_id, unit_price, qty_init, qty_remaining, sell_duration, expiration_ts, source_msg_id, source_ts, line_hash (UNIQUE — SHA-1 du fingerprint)
- `market_latest` : side + item_ref_id + offer_uid (PK composite), actor_name, actor_id, actor_level, actor_breed, unit_price, qty_init, qty_remaining, sell_duration, expiration_ts, expiration_date, source_msg_id, source_ts, updated_at, slot_colors, sublimation_id, special_sublimation_id

Index : `idx_obs_item_side`, `idx_obs_ts`, `idx_latest_item`.

---

## 8. ENDPOINTS API EXHAUSTIFS

### API interne (pas de clé requise)

| Méthode | Route                           | Params                                                                 | Retour                                                         | Source                                 |
| ------- | ------------------------------- | ---------------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------- |
| GET     | `/`                             | —                                                                      | SPA index.html                                                 | —                                      |
| GET     | `/api/events`                   | —                                                                      | SSE stream                                                     | —                                      |
| POST    | `/api/reload`                   | —                                                                      | `{reloaded: N}`                                                | Recharge tous les joueurs              |
| GET     | `/api/players`                  | breed, guild, min_level, max_level, search, sort, order, limit, offset | `{players:[], total}`                                          | wakfu.db                               |
| GET     | `/api/players/{name}`           | tranche?                                                               | Fiche joueur complète                                          | wakfu.db + calculate_weights           |
| GET     | `/api/guilds`                   | min_members, limit                                                     | `{guilds:[]}`                                                  | wakfu.db                               |
| GET     | `/api/classes`                  | —                                                                      | `{classes:[]}`                                                 | wakfu.db                               |
| GET     | `/api/recent`                   | limit                                                                  | `{new_players:[], updated_players:[]}`                         | wakfu.db                               |
| GET     | `/api/stats`                    | —                                                                      | Stats globales + classes                                       | wakfu.db                               |
| GET     | `/api/search`                   | q                                                                      | `{players:[]}`                                                 | wakfu.db                               |
| GET     | `/api/inventory`                | breed, top, min_level, max_level                                       | Best-in-slot par slot                                          | wakfu.db                               |
| GET     | `/api/cdn/{item_id}`            | —                                                                      | Détails item CDN                                               | \_items_db + cdn_items                 |
| GET     | `/api/icons-atlas`              | —                                                                      | JSON atlas base64                                              | rnd/data/icons_atlas.json              |
| GET     | `/api/build-data`               | —                                                                      | Build du joueur local                                          | build-generator/data/build-result.json |
| GET     | `/api/inventory/local`          | —                                                                      | Inventaire enrichi CDN                                         | logs/inventory_bags.json               |
| GET     | `/api/chest`                    | —                                                                      | Coffre enrichi CDN                                             | logs/account_chest_full.json           |
| GET     | `/api/market`                   | q, side, sort, order, limit, offset, min_price, max_price              | `{total, items:[]}`                                            | hdv_market.db                          |
| GET     | `/api/market/stats`             | —                                                                      | `{total_latest, unique_items, last_update}`                    | hdv_market.db                          |
| GET     | `/api/market/history/{item_id}` | slot_colors?, days?                                                    | `{min_price, max_price, avg_price, count, history:[]}`         | hdv_market.db                          |
| GET     | `/api/patrimoine`               | —                                                                      | `{totalValue, kamas, chestValue, inventoryValue, topItems:[]}` | hdv_market.db + JSON locaux            |
| GET     | `/icons/{category}/{id}.png`    | —                                                                      | Fichier PNG                                                    | src-web/icons/                         |

### API publique v1 (clé API requise via header `X-API-Key`)

| Route                        | Équivalent legacy     |
| ---------------------------- | --------------------- |
| GET `/api/v1/players`        | `/api/players`        |
| GET `/api/v1/players/{name}` | `/api/players/{name}` |
| GET `/api/v1/guilds`         | `/api/guilds`         |
| GET `/api/v1/classes`        | `/api/classes`        |
| GET `/api/v1/recent`         | `/api/recent`         |
| GET `/api/v1/stats`          | `/api/stats`          |
| GET `/api/v1/armory`         | `/api/inventory`      |
| GET `/api/v1/search`         | `/api/search`         |
| GET `/api/v1/docs`           | Documentation JSON    |

---

## 9. MODULES FRONTEND DÉTAILLÉS

### main.js (284 lignes) — Point d'entrée

Imports : `fetchJson` et `reloadData` de `api.js` ; `connectSSE` et `on as onSSE` de `shared/events.js` ; tous les loaders de tabs.

Fonctions :

- `switchTab(tab)` : bascule entre les 3 onglets principaux
- `switchSubtab(sub)` : bascule entre les sous-onglets Classement
- `switchPersoSub(sub)` : bascule entre les sous-onglets Personnage (lazy loading)
- `renderStats(s)` : affiche la barre de stats (joueurs, guildes, top score, dernier relevé)
- `populateBreedFilter(classes)` : remplit le select des classes
- `populateGuildFilter()` : remplit le select des guildes
- `init()` : initialise tooltip, charge stats, connecte SSE, abonne les callbacks

DOMContentLoaded : wiring des clicks tabs, search input (debounced 300ms), filtres, modale, bouton reload.

### api.js (23 lignes) — Client HTTP

- `API_BASE = "http://127.0.0.1:8042"`
- `fetchJson(url)` : GET + parse JSON, throw sur erreur
- `reloadData()` : POST `/api/reload`
- `connectSSE(onReload)` : **LEGACY — plus utilisé par main.js mais toujours exporté**

### state.js (42 lignes) — État global réactif

État singleton avec : `currentTab`, `players[]`, `guilds[]`, `classes[]`, `stats{}`, `filters{search, breed, guild, minLevel, maxLevel, sort, order, offset, limit}`, `modal{open, playerName, tranche, activeTab}`.

Fonctions : `getState()`, `setState(partial)`, `updateFilters(partial)`, `subscribe(fn)`.

### shared/events.js (42 lignes) — SSE unifié

- `on(event, fn)` : s'abonner à un événement SSE
- `emit(event, data)` : émettre localement
- `connectSSE(url)` : ouvre EventSource sur `/api/events`, écoute `reload`, `update`, `hdv`, `inventory`
- `disconnectSSE()` : ferme la connexion

Reconnexion automatique après 5 secondes en cas d'erreur.

### shared/item.js (~150 lignes) — Constantes et helpers

- `RARITY` : 0-7, avec nom, hex, rgb, txtColor, css class
- `TYPE_INFO` : 30+ types d'items (id → nom FR + icône wiki)
- `ACTIONS` : 50+ actions/effets (id → label + icône wiki)
- `ELEMENT_ICONS` : mapping élément → nom
- `GEM_COLORS` : Rouge, Bleu, Vert, Blanc → hex
- `WIKI` : base URL wiki.gg images
- `getRarity(id)`, `fmtPrice(n)`, `escHtml(s)`
- `loadIconsAtlas()`, `getIconSrc(gfxId)`, `getCdnIconSrc(gfxId)`

### tooltip.js (~300 lignes) — Tooltip unifié v3

Cache interne `_cache[itemId]`. Fonctions :

- `showTooltip(evt, itemId, slotColors)` : crée/affiche le div `#wk-tooltip`, fetch CDN si pas en cache
- `hideTooltip()` : cache le tooltip
- `positionTooltip(tip, evt)` : position near mouse, évite overflow
- `renderTooltip(tip, item)` : HTML complet wiki-style (gradient rareté, badge, nom, icône, type, level, effets, gemmes, description, zone prix)
- `_loadPriceChart(itemId, slotColors)` : fetch `/api/market/history/{id}`, affiche min/max/avg + graphe canvas
- `initTooltipDelegation()` (exporté) : délégation globale sur `document` pour `[data-item-id]`

### modal.js (~200 lignes) — Détail joueur

- `showPlayer(name, tranche, keepTab)` : fetch `/api/players/{name}`, affiche stats, équipement, sorts
- `switchModalTab(tab)` : bascule Équipement / Sorts
- `closeModal()` : ferme la modale

Expose `window.__showPlayer`, `window.__switchModalTab`, `window.__closeModal`.

### tabs/players.js — Classement joueurs

- `loadPlayers()` : construit l'URL avec filtres, fetch, render
- `renderPlayerRows(players, offset)` : lignes du tableau (rang, nom cliquable, niveau, classe, guilde, scores)
- `renderPagination(total, offset, limit)` : boutons précédent/suivant
- `window.__goPage(offset)` : navigation pagination

### tabs/guilds.js — Classement guildes

- `wilsonScore(avg, n, globalAvg)` : score de confiance (shrinkage k=15, bonus taille log2)
- `computeRankings(guilds)` : calcule les scores Wilson pour toutes les guildes
- `renderGuilds()` : tableau trié avec colonnes cliquables
- `loadGuilds()` : fetch `/api/guilds`, compute, render

### tabs/recent.js — Joueurs récents

- Deux listes : `_newPlayers` et `_updatedPlayers`
- Filtrage local par nom, guilde, classe, niveau, score minimum
- Tri cliquable sur colonnes
- `loadRecent(force)` : fetch `/api/recent?limit=200`

### tabs/inventory.js (armory) — Armurerie

- `SLOT_LAYOUT` : 14 slots avec colonne gauche/droite
- `fetchArmory()` : fetch `/api/inventory`
- `renderArmory(data)` : grille visuelle des slots avec top 3 items par slot
- `renderSlotCard(slot, items)` : carte d'un slot avec icône, nom, rareté, porteurs
- `loadInventory()` : bind filtres (classe, top, level range), fetch et render

### tabs/character.js (261 lignes) — Personnage

- `cellHTML(item)` : carte d'un item (icône, nom, rareté, quantité, gemmes)
- `gridHTML(title, badge, subtitle, items)` : section grille de cartes
- `patrimoineHTML(bc, ic, cc, timestamps)` : résumé patrimoine
- `loadSheet(container)` : fetch 3 endpoints en parallèle (build-data, inventory/local, chest), construit le HTML
- `loadCharacter()` : trouve le container, appelle loadSheet

Attributs data sur les cartes : `data-id` et `data-item-id` (pour le tooltip unifié).

### tabs/hdv.js (172 lignes) — HDV Market + Patrimoine

- `loadPatrimoine()` : fetch `/api/patrimoine`, affiche valeur totale, kamas, coffre, inventaire, top items
- `loadMarket()` : fetch `/api/market` avec filtres, affiche tableau d'offres avec pagination
- `switchHdvSub(sub)` : bascule patrimoine/market
- `loadHdv()` : bind les boutons sub-tabs, affiche patrimoine par défaut

---

## 10. SYSTÈME DE TOOLTIP UNIFIÉ

Le tooltip fonctionne par délégation d'événements. `initTooltipDelegation()` est appelé dans `main.js` à l'init et dans `character.js` / `inventory.js` après chaque render.

Tout élément HTML avec l'attribut `data-item-id="XXXXX"` affichera automatiquement le tooltip au survol. L'attribut optionnel `data-slot-colors="Rouge,Bleu,Vert"` ajoute les gemmes PNG dans le tooltip et filtre les prix HDV par couleur de slots.

Le tooltip est un div `#wk-tooltip` positionné en `position: fixed` près du curseur. Le style mime le module Infobox dark du wiki Wakfu.

---

## 11. FICHIERS DE DONNÉES

### Répertoire logs/

| Fichier                   | Écrit par         | Lu par                                   | Format               |
| ------------------------- | ----------------- | ---------------------------------------- | -------------------- |
| `players/*.json`          | Agent Java        | api_v2.py (watcher)                      | JSON                 |
| `inventory_bags.json`     | Agent Java        | api_v2.py (/api/inventory/local)         | JSON                 |
| `account_chest_full.json` | Agent Java        | api_v2.py (/api/chest + /api/patrimoine) | JSON                 |
| `market_v3_proto.log`     | Agent Java        | hdv_sync.py (watcher)                    | Texte (protobuf hex) |
| `character_data.log`      | Agent Java        | Non lu automatiquement                   | Texte                |
| `wakfu.db`                | api_v2.py (db.py) | api_v2.py (db.py)                        | SQLite               |
| `hdv_market.db`           | hdv_sync.py       | api_v2.py (endpoints market)             | SQLite               |

### Répertoire rnd/data/

| Fichier                 | Usage                                                      |
| ----------------------- | ---------------------------------------------------------- |
| `cdn_items.json`        | Base complète des items Wakfu (depuis le CDN Ankama)       |
| `i18n_items_local.json` | Noms et descriptions FR des items                          |
| `icons_atlas.json`      | Atlas base64 de toutes les icônes (pour chargement rapide) |

---

## 12. DÉPENDANCES ENTRE MODULES

### Graphe d'imports frontend

```
main.js
├── css/app.css
├── js/api.js ─── fetchJson, reloadData
├── js/shared/events.js ─── connectSSE, on (as onSSE)
├── js/state.js ─── getState, setState, updateFilters, subscribe
├── js/utils.js ─── debounce
├── js/tooltip.js ─── initTooltipDelegation
├── js/modal.js ─── showPlayer, closeModal
├── js/tabs/players.js ─── loadPlayers
├── js/tabs/guilds.js ─── loadGuilds
├── js/tabs/classes.js ─── loadClasses
├── js/tabs/recent.js ─── loadRecent
├── js/tabs/inventory.js ─── loadInventory
├── js/tabs/character.js ─── loadCharacter
├── js/tabs/hdv.js ─── loadHdv
├── js/tabs/equipment.js ─── loadEquipment
├── js/tabs/optimizer.js ─── loadOptimizer
└── js/tabs/spells.js ─── loadSpellsEditor

js/shared/item.js (aucun import, exporté vers tout)
  ← tooltip.js
  ← character.js
  ← hdv.js

js/api.js (aucun import, base URL hardcodée)
  ← main.js, shared/events.js, modal.js, players.js, guilds.js,
     recent.js, inventory.js, character.js, hdv.js

js/tooltip.js
  ← shared/item.js
  exporté → main.js, character.js, inventory.js, modal.js

js/state.js
  ← main.js, players.js, modal.js
```

### Dépendances serveur Python

```
api_v2.py
├── hdv_sync.py (import: run_sync as hdv_run_sync)
├── db.py (import: WakfuDB)
├── calculate_weights.py (import: charger_items, calculer_joueur, etc.)
└── FastAPI + uvicorn + starlette
```

---

## 13. BUGS CONNUS ET DETTES TECHNIQUES

### Bugs

1. **Player name `<undefined>`** : `InventoryPassiveReader.java` ne trouve pas le nom du joueur local (méthode JVM obfusquée `getName`). Résultat : `inventory_bags.json` contient `"player": "<undefined>"`. Fix nécessaire côté Java (trouver la bonne méthode obfusquée) ou workaround côté API (lire le nom depuis `character_data.log` LOCAL_PLAYER).

2. **Inversion Blue/Green dans sync_hdv_to_sqlite.ps1** : Le script PowerShell legacy (maintenant remplacé par `hdv_sync.py`) avait l'inversion 2=Bleu/3=Vert. Le script Python `hdv_sync.py` a la correction (2=Vert/3=Bleu). Les données historiques dans `hdv_market.db` peuvent contenir des couleurs inversées si elles ont été insérées par l'ancien script PS1.

### Dettes techniques

1. **api.js contient `connectSSE()` legacy** : Cette fonction crée un EventSource séparé. Elle n'est plus utilisée par `main.js` mais reste exportée. À supprimer.

2. **`API_BASE` hardcodé** à `http://127.0.0.1:8042` dans `api.js`. Pour une release, il faudrait utiliser une URL relative ou une variable d'environnement.

3. **Pas de bundling production** : Le frontend utilise Vite en dev mode. Pour la release, il faudra `vite build` et servir les fichiers statiques depuis FastAPI ou un reverse proxy (Nginx).

4. **Pas d'authentification frontend** : Tout est accessible sans login. Les endpoints `/api/v1/` supportent les clés API mais le frontend ne les utilise pas.

5. **Watcher ne surveille pas `character_data.log`** : Ce fichier contient le nom du joueur local (LOCAL_PLAYER) mais n'est pas lu automatiquement.

6. **`shared/events.js` ne réémet pas l'événement `chest`** : Le EventSource écoute `reload`, `update`, `hdv`, `inventory` mais pas `chest`. L'événement SSE `chest` est émis par le serveur mais pas capté par events.js. Cependant `main.js` s'abonne quand même à `onSSE("chest", ...)` — ce qui ne fonctionnera pas tant que events.js ne le relaye pas.

7. **initTooltipDelegation() appelé plusieurs fois** : Il ajoute des listeners sur `document` à chaque appel. Les listeners précédents ne sont pas supprimés, causant des appels multiples.

8. **Pas de gestion d'erreur globale** : Si le serveur est down, le frontend affiche des erreurs individuelles par endpoint mais pas de bannière globale.

9. **Duplicata de la fonction `esc()`** : Définie dans `utils.js`, `shared/item.js` (`escHtml`), `recent.js`, `guilds.js`, et `inventory.js`. À centraliser.

10. **window.**showPlayer / **goPage** : Fonctions exposées globalement via `window` pour les onclick inline. À migrer vers de la délégation d'événements propre.

---

## 14. CHECKLIST MIGRATION VERS RELEASE

### Phase 1 — Corrections critiques

- [ ] Corriger le player name `<undefined>` (Java ou workaround API)
- [ ] Ajouter `chest` au listener dans `shared/events.js`
- [ ] Supprimer `connectSSE()` legacy dans `api.js`
- [ ] Dé-dupliquer `initTooltipDelegation()` (garder un seul appel, ou vérifier si déjà initialisé)
- [ ] Centraliser `esc()` dans un seul module

### Phase 2 — Production-ready

- [ ] Remplacer `API_BASE` hardcodé par une URL relative (`""` si même origine)
- [ ] Configurer `vite build` pour la production (minification, tree-shaking)
- [ ] Servir les fichiers statiques buildés depuis FastAPI (ou Nginx reverse proxy)
- [ ] Ajouter HTTPS (Let's Encrypt + Nginx)
- [ ] Ajouter authentification (login basique ou OAuth)
- [ ] Variable d'environnement pour `COOLDOWN`, `DB_PATH`, `PORT`
- [ ] Logs structurés (JSON) au lieu du format texte
- [ ] Health check endpoint (`/api/health`)

### Phase 3 — Robustesse

- [ ] Gestion d'erreur globale frontend (bannière "serveur déconnecté")
- [ ] Rate limiting sur les endpoints publics
- [ ] Backup automatique des DB SQLite
- [ ] Tests unitaires (parser protobuf, calcul des scores)
- [ ] Tests E2E (Playwright ou Cypress)
- [ ] CI/CD (GitHub Actions : lint, test, build, deploy)
- [ ] Docker Compose (Python server + Nginx)
- [ ] Documentation utilisateur (README.md simplifié)

### Phase 4 — Fonctionnalités manquantes

- [ ] Inventaire enrichi : ajouter les gemmes extraites par l'agent Java aux items de l'inventaire
- [ ] Historique des prix dans le tooltip (actuellement basé sur `market_observations`)
- [ ] Notifications (alerte quand un item est en vente sous un certain prix)
- [ ] Multi-joueur : supporter plusieurs personnages sur le même compte
- [ ] Export CSV/PDF du patrimoine

---

## ANNEXE — CONSTANTES IMPORTANTES

### Raretés Wakfu

| ID  | Nom        | Couleur hex |
| --- | ---------- | ----------- |
| 0   | Commun     | #b2b2b2     |
| 1   | Commun     | #b2b2b2     |
| 2   | Rare       | #22b069     |
| 3   | Mythique   | #a06016     |
| 4   | Légendaire | #bbc70c     |
| 5   | Relique    | #794faf     |
| 6   | Souvenir   | #257db0     |
| 7   | Épique     | #b04f8a     |

### Couleurs de gemmes (protobuf)

| Valeur | Couleur |
| ------ | ------- |
| 0      | Vide    |
| 1      | Rouge   |
| 2      | Vert    |
| 3      | Bleu    |
| 4      | Blanc   |
| 5      | Noir    |
| 6      | Any     |

### Types de messages HDV

| msgId | Type                   |
| ----- | ---------------------- |
| 12294 | Offres de vente (sell) |
| 13653 | Offres d'achat (buy)   |

### Classes Wakfu valides

Feca, Osamodas, Enutrof, Sram, Xelor, Ecaflip, Eniripsa, Iop, Cra, Sadida, Sacrieur, Pandawa, Roublard, Zobal, Steamer, Eliotrope, Huppermage, Ouginak
