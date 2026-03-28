# HDV Market Protocol Reference
# Wakfu Assistant - Documentation technique complete
# Derniere mise a jour : 2026-03-22
# Auteur : Sam + Claude (full stack dev)

---

## 1. Architecture de capture

### 1.1 Composants

Le systeme de capture HDV repose sur un agent Java ByteBuddy qui intercepte
les paquets reseau du client Wakfu. L'agent s'injecte dans la JVM du client
au lancement et hook les methodes de deserialisation protobuf.

- **Agent JAR** : `rnd/poc-hdv/agent/build/libs/market-price-agent-v3.jar`
  - Construit le 2026-03-22 a 05:37:02
  - Taille : 4332.2 KB
  - Technologie : ByteBuddy (instrumentation JVM)
- **Lanceur** : `LANCER_HDV.bat` (racine du projet)
- **Log texte** : `logs/market_v3.log` (messages bruts lisibles)
- **Log protobuf** : `logs/market_v3_proto.log` (payload hex pour parsing)
- **Base SQLite** : `logs/hdv_market.db` (donnees parsees et indexees)

### 1.2 Flux de donnees

```
Client Wakfu (JVM)
    |
    v
Agent ByteBuddy (hook cmy.dn / coy.dn)
    |
    v
market_v3.log + market_v3_proto.log
    |
    v
sync_hdv_to_sqlite.ps1 (parsing protobuf + insertion SQLite)
    |
    v
hdv_market.db (tables market_observations + market_latest)
    |
    v
API / Overlay Tauri v2
```

### 1.3 Lancement

Le fichier LANCER_HDV.bat lance le client Wakfu avec l'agent attache :
```bat
java -javaagent:"rnd/poc-hdv/agent/build/libs/market-price-agent-v3.jar" ...
```

---

## 2. Hooks actifs et inactifs

### 2.1 Hooks fonctionnels

| Classe | Methode | Message capte | Status |
|--------|---------|---------------|--------|
| `cmy` | `dn(byte[])` | clX (SELL) + clU (BUY) | ACTIF - source principale |
| `coy` | `dn(byte[])` | msgId 12522 | ACTIF mais inutilise (doublon clX) |

### 2.2 Hooks non fonctionnels

| Classe | Methode | Raison |
|--------|---------|--------|
| `aDj` | `channelRead0` | Ne se declenche pas |
| `adj_2` | `channelRead0` | Ne se declenche pas |
| `aaw_1` | `h()` | Ne se declenche pas |

### 2.3 Messages captures

- **clX** (msgId 12294) : offres de VENTE avec items, enchantements, vendeur
- **clU** (msgId 13653) : offres d'ACHAT avec criteres, acheteur
- **coy** (msgId 12522) : doublon des offres de vente (non utilise)
- **Footer** : pagination + timestamp serveur

---

## 3. Mapping Protobuf SELL (clX - msgId 12294)

### 3.1 Structure du wrapper

| Champ | Wire type | Contenu | Exemple |
|-------|-----------|---------|---------|
| F1 | varint | header_unknown_1 | variable |
| F2 | varint | header_unknown_2 | variable |
| F3 | length-delimited | entry (repete, 1 par offre) | sous-message |

### 3.2 Structure d'une offre SELL

Mapping confirme le 2026-03-22 par dump protobuf brut.

| Champ | Wire type | Contenu | Exemple | Notes |
|-------|-----------|---------|---------|-------|
| F1 | varint (int64) | offer_uid | 56227895991202134 | Identifiant unique |
| F2 | length-delimited | kW (item data) | sous-message | Voir 3.3 |
| F3 | length-delimited | seller | sous-message | Voir 3.4 |
| F5 | varint | qty_init | 19 | Quantite mise en vente |
| F6 | varint | qty_remaining | 13 | Quantite restante |
| F7 | varint | unit_price | 320000 | Prix unitaire en kamas |
| F8 | varint | sell_duration | 0 | Code duree (voir 5.6) |
| F9 | varint | expiration_ts | 1774756801164 | Timestamp Unix ms |

**Note** : F4 n'existe pas dans ce message.

### 3.3 Sous-message kW (item data, champ F2)

| Champ | Wire type | Contenu | Exemple | Notes |
|-------|-----------|---------|---------|-------|
| F1 | varint (int64) | item_uid_internal | variable | UID interne unique |
| F2 | varint | item_ref_id | 21893 | Lien vers cdn_items.json |
| F3 | varint | item_quantity | 1 | Toujours 1 pour equipements |
| F52 | length-delimited | shard_data | sous-message | Enchantements (voir 3.5) |
| F7 | bytes (4B) | unknown_56 | variable | Fonction inconnue |

### 3.4 Sous-message seller (champ F3)

| Champ | Wire type | Contenu | Exemple |
|-------|-----------|---------|---------|
| F1 | varint | actor_id | 87486735 |
| F2 | length-delimited (string) | actor_name | "Seiryu" |
| F3 | varint | actor_level | variable |
| F4 | varint | breed_id | variable |
| F5 | varint | sex | 0 ou 1 |

### 3.5 Sous-message shard_data / enchantements (kW.F52)

Contient des slots repetes (0 a 3 slots max par item).

| Champ | Wire type | Contenu | Exemple |
|-------|-----------|---------|---------|
| F1 | varint | slot_index | 0-3 |
| F2 | varint | slot_unknown | 0 |
| F3 | varint | slot_color | 0-6 (voir 5.1) |
| F4 | varint | sublimation_id | ex: 319 |
| F5 | varint | shard_unk3 | 0 |
| F6 | varint | shard_unk4 | 0 |
| F7 | varint | shard_count | ex: 2 |

---

## 4. Mapping Protobuf BUY (clU - msgId 13653)

### 4.1 Structure du wrapper

Meme structure que SELL : F1/F2 en-tete, F3 entries repetees.

### 4.2 Structure d'une offre BUY

Mapping confirme le 2026-03-22 par dump protobuf brut (3 entries analysees).

| Champ | Wire type | Contenu | Exemple | Notes |
|-------|-----------|---------|---------|-------|
| F1 | varint (int64) | offer_uid | 56227059278285599 | Identifiant unique |
| F2 | varint | item_ref_id | 14363 | Lien vers cdn_items.json |
| F3 | varint | buyer_id | 169687922 | ID du personnage acheteur |
| F4 | length-delimited (string) | buyer_name | "Aylin Gewinn" | Nom du personnage |
| F5 | varint | qty_init | 1 | Quantite demandee |
| F6 | varint | qty_remaining | 0 | Quantite encore a acheter |
| F7 | varint | unit_price | 1001 | Prix max unitaire en kamas |
| F8 | varint | duration_code | 10 | Code duree (voir 5.6) |
| F9 | varint | expiration_code | 2 | Code supplementaire |
| F10 | varint | expiration_ts | 1774152001454 | Timestamp Unix ms |
| F12 | varint (repeated) | slot_colors_wanted | 6,6,6,6 | Couleurs demandees (6=Any) |
| F13 | varint | sublimation_wanted | 0 | Sublimation recherchee |

### 4.3 Differences SELL vs BUY

- BUY n'a pas de sous-message kW (pas d'item physique, c'est une demande)
- BUY a buyer_name en string directe (F4), SELL a seller en sous-message (F3)
- BUY a slot_colors_wanted (F12 repeated) et sublimation_wanted (F13)
- BUY a un expiration_code (F9) absent de SELL
- Les duration_codes sont differents entre SELL et BUY (voir 5.6)

---

## 5. Tables de reference

### 5.1 Codes couleur de slot (slot_color)

| Code | Couleur | Usage |
|------|---------|-------|
| 0 | Vide | Slot sans gemme |
| 1 | Rouge | Gemme rouge |
| 2 | Vert | Gemme verte |
| 3 | Bleu | Gemme bleue |
| 4 | Blanc/Epic | Gemme blanche ou epique |
| 5 | Noir | Gemme noire |
| 6 | Any | Toute couleur (BUY uniquement) |

### 5.2 Codes de rarete (rarity)

| Code | Rarete | Couleur UI |
|------|--------|-----------|
| 0 | Common | Gris |
| 1 | Uncommon | Blanc |
| 2 | Rare | Vert |
| 3 | Mythique | Orange |
| 4 | Legendaire | Jaune dore |
| 5 | Relique | Violet |
| 6 | Epique | Cyan/turquoise |
| 7 | Ultime | variable |
| 8 | Souvenir | variable |

### 5.3 Sublimations observees (top 10 par frequence)

Les sublimation_id correspondent aux effets speciaux attaches aux gemmes.
La liste complete est disponible dans le CDN (fichier states.json).
Les IDs observes les plus frequents dans notre capture de 2 763 offres
incluent par exemple : 319, 3199, et d'autres a cataloguer.

### 5.4 itemProperties (proprietes speciales)

| ID | Propriete | Effet en jeu |
|----|-----------|-------------|
| 1 | Treasure | Butin special |
| 7 | Shop | Item de boutique |
| 8 | Relic | Equipement unique (1 seul equipe) |
| 12 | Epic | Equipement unique (1 seul equipe) |
| 13 | Non-recyclable | Ne peut pas etre recycle |
| 19 | Epic gem slot | Emplacement gemme epique |
| 20 | Relic gem slot | Emplacement gemme relique |

### 5.5 Types d'items (equipmentItemTypes)

Les typeId dans items.json correspondent aux categories d'equipement :
amulettes, anneaux, bottes, capes, casques, plastrons, epaulettes, ceintures,
armes (1H, 2H, distance), boucliers, familiers, montures, insignes, etc.
La correspondance complete est dans `cdn_equipmentItemTypes.json`.

### 5.6 Table des durees (CONFIRMEE 2026-03-22)

Mapping confirme par analyse croisee des expiration_ts et sell_duration
sur 2 745 offres actives.

#### Offres SELL (msgId 12294, champ F8)

| Code protobuf | Duree reelle | Heures | Validation |
|---------------|-------------|--------|------------|
| 0 | 7 jours | 168h | max_remaining=191h (n=2589, 94.6%) |
| 1 | 14 jours | 336h | max_remaining=359h (n=86, 3.1%) |
| 2 | 28 jours | 672h | max_remaining=671h (n=61, 2.2%) |

#### Offres BUY (msgId 13653, champ F8)

| Code protobuf | Duree reelle | Heures | Validation |
|---------------|-------------|--------|------------|
| 1 | 7 jours | 168h | max_remaining=191h (n=7, 77.8%) |
| 10 | expire/special | 0h | remaining=-1.6h (n=2, 22.2%) |

#### Methode de validation

La duree est confirmee par : duree_restante_max = expiration_ts - timestamp_capture.
Si une offre vient d'etre posee, sa duree restante est proche de la duree totale.
Les valeurs max observees (191h, 359h, 671h) correspondent a 7j+23h, 14j+23h,
27j+23h, confirmant que les offres les plus recentes ont ete posees ~1h avant
la capture.

#### Note importante

Les codes SELL et BUY utilisent des valeurs DIFFERENTES pour la meme duree :
SELL code 0 = BUY code 1 = 7 jours.
Les codes BUY pour 14j et 28j ne sont pas encore observes.

#### Calculs derives

- listing_date = expiration_ts - (duration_days * 86400000) (en ms)
- time_remaining_h = (expiration_ts - now_ms) / 3600000
- is_expired = (expiration_ts < now_ms)
- freshness = time_remaining_h / (duration_days * 24) (0.0=expire, 1.0=neuf)

---

## 6. Schema SQLite

### 6.1 Table market_observations (historique complet)

```sql
CREATE TABLE IF NOT EXISTS market_observations (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  observed_at TEXT NOT NULL,
  side TEXT NOT NULL,             -- 'sell' ou 'buy'
  item_ref_id INTEGER NOT NULL,   -- lien vers cdn_items.json
  offer_uid INTEGER NOT NULL,     -- ID unique de l'offre
  actor_name TEXT,                -- nom du vendeur/acheteur
  actor_id INTEGER DEFAULT 0,     -- ID du personnage
  unit_price INTEGER NOT NULL,    -- prix unitaire en kamas
  qty_init INTEGER DEFAULT 0,     -- quantite initiale
  qty_remaining INTEGER DEFAULT 0,-- quantite restante
  sell_duration INTEGER DEFAULT 0,-- code duree protobuf
  expiration_ts INTEGER DEFAULT 0,-- timestamp unix ms
  source_msg_id INTEGER NOT NULL, -- 12294 (sell) ou 13653 (buy)
  source_ts TEXT NOT NULL,        -- timestamp de capture
  line_hash TEXT NOT NULL UNIQUE   -- SHA1 anti-doublon
);
```

### 6.2 Table market_latest (snapshot actuel)

```sql
CREATE TABLE IF NOT EXISTS market_latest (
  side TEXT NOT NULL,
  item_ref_id INTEGER NOT NULL,
  offer_uid INTEGER NOT NULL,
  actor_name TEXT,
  actor_id INTEGER DEFAULT 0,
  actor_level INTEGER DEFAULT 0,
  actor_breed INTEGER DEFAULT 0,
  unit_price INTEGER NOT NULL,
  qty_init INTEGER DEFAULT 0,
  qty_remaining INTEGER DEFAULT 0,
  sell_duration INTEGER DEFAULT 0,
  expiration_ts INTEGER DEFAULT 0,
  expiration_date TEXT DEFAULT '',
  source_msg_id INTEGER NOT NULL,
  source_ts TEXT NOT NULL,
  updated_at TEXT NOT NULL,
  slot_colors TEXT DEFAULT '',       -- ex: 'Rouge,Vert,Rouge,Rouge'
  sublimation_id INTEGER DEFAULT 0,  -- ID sublimation principale
  special_sublimation_id INTEGER DEFAULT 0,
  PRIMARY KEY (side, item_ref_id, offer_uid)
);
```

### 6.3 Index

```sql
CREATE INDEX IF NOT EXISTS idx_latest_item ON market_latest(item_ref_id);
CREATE INDEX IF NOT EXISTS idx_latest_side ON market_latest(side);
CREATE INDEX IF NOT EXISTS idx_latest_price ON market_latest(unit_price);
CREATE INDEX IF NOT EXISTS idx_obs_item ON market_observations(item_ref_id);
```

### 6.4 Metriques derivees (calculees a la requete)

```sql
-- Quantite vendue
SELECT (qty_init - qty_remaining) AS qty_sold FROM market_latest;

-- Temps restant en heures
SELECT ROUND((julianday(expiration_date) - julianday('now')) * 24, 1) AS remaining_h
FROM market_latest;

-- Valeur totale d'une offre
SELECT (unit_price * qty_remaining) AS total_value FROM market_latest;

-- Items partiellement vendus
SELECT * FROM market_latest
WHERE qty_init > qty_remaining AND qty_remaining > 0;

-- Fraicheur (0.0 = expire, 1.0 = vient d'etre pose)
-- Necessite de connaitre duration_days via Decode-Duration
```

---

## 7. CDN Wakfu - Donnees de reference

### 7.1 URLs de base

- **Config** : `https://wakfu.cdn.ankama.com/gamedata/config.json`
- **Base JSON** : `https://wakfu.cdn.ankama.com/gamedata/{version}/{type}.json`
- **Version actuelle** : 1.91.1.53
- **Theme UI** : `https://wakfu.cdn.ankama.com/gamedata/theme/theme.json`

### 7.2 Fichiers CDN telecharges

| Fichier | Taille | Contenu |
|---------|--------|---------|
| cdn_items.json | 14.7 MB | 8324 equipements (armes, armures, etc.) |
| cdn_jobsItems.json | 5.9 MB | 8576 items de metiers |
| cdn_recipes.json | 502 KB | Recettes de craft |
| cdn_recipeResults.json | ~50 KB | Resultats de recettes |
| cdn_recipeIngredients.json | ~150 KB | Ingredients de recettes |
| cdn_states.json | variable | Etats/sublimations |
| cdn_actions.json | variable | Actions des items |
| cdn_equipmentItemTypes.json | ~10 KB | Types d'equipement |
| cdn_itemTypes.json | ~5 KB | Categories d'items |
| cdn_itemProperties.json | ~2 KB | Proprietes speciales |
| cdn_resources.json | variable | Ressources recoltables |
| cdn_collectibleResources.json | 202 KB | Ressources de collecte |
| cdn_harvestLoots.json | variable | Loots de recolte |
| cdn_blueprints.json | variable | Plans de construction |
| cdn_recipeCategories.json | variable | Categories de recettes |
| cdn_resourceTypes.json | variable | Types de ressources |

Stockes dans : `H:\Code\Wakfuassistant\docs\RND\data\`

### 7.3 Index des noms d'items

- **Fichier** : `cdn_item_names_index.json` (1045 KB, 8324 items)
- **Fichier scrape** : `cdn_scraped_names.json` (20 noms supplementaires)
- **Couverture marche** : 1293/1362 = 94.9%
  - CDN : 1273 items (93.5%)
  - Scrape encyclopedie : 20 items (1.5%)
  - Non resolus : 69 items (5.1%) - majoritairement IDs > 26000 (items recents)

### 7.4 Structure d'un item CDN

```json
{
  "definition": {
    "item": {
      "id": 27019,
      "level": 200,
      "baseParameters": {
        "itemTypeId": 136,
        "rarity": 4
      },
      "graphicParameters": {
        "gfxId": 12345
      }
    }
  },
  "title": {
    "fr": "Plastron Ploeil",
    "en": "Tromp Loy Breastplate",
    "es": "Trampantojoraza",
    "pt": "Plastrao Bique"
  }
}
```

### 7.5 URLs des icones

```
https://s.ankama.com/www/static.ankama.com/wakfu/portal/game/item/115/{gfxId}.png  (115px)
https://s.ankama.com/www/static.ankama.com/wakfu/portal/game/item/64/{gfxId}.png   (64px)
https://s.ankama.com/www/static.ankama.com/wakfu/portal/game/item/32/{gfxId}.png   (32px)
```

Alternative communautaire (Wakassets) :
```
https://vertylo.github.io/wakassets/{folder}/{ID}.png
Repo : https://github.com/Vertylo/wakassets
```

---

## 8. Fichiers du projet

### 8.1 Agent Java

| Fichier | Chemin |
|---------|--------|
| Agent JAR | `rnd/poc-hdv/agent/build/libs/market-price-agent-v3.jar` |
| Source principale | `rnd/poc-hdv/agent/src/.../MarketPriceAgent.java` |
| Hook advice | `rnd/poc-hdv/agent/src/.../ChannelReadAdvice.java` |
| Build Gradle | `rnd/poc-hdv/agent/build.gradle` |

### 8.2 Scripts PowerShell

| Fichier | Chemin | Role |
|---------|--------|------|
| Sync SQLite | `rnd/poc-hdv/sync_hdv_to_sqlite.ps1` | Parse proto + insert DB |
| Export CSV | `rnd/poc-hdv/export_hdv_preview.ps1` | Genere previews CSV/MD |
| Lanceur | `LANCER_HDV.bat` | Lance Wakfu + agent |

### 8.3 Donnees

| Fichier | Chemin | Contenu |
|---------|--------|---------|
| Base SQLite | `logs/hdv_market.db` | Offres parsees |
| Log texte | `logs/market_v3.log` | Messages bruts |
| Log proto | `logs/market_v3_proto.log` | Payload hex |
| Index noms | `rnd/data/cdn_item_names_index.json` | 8324 noms |
| Noms scrapes | `rnd/data/cdn_scraped_names.json` | 20 noms supp. |
| Items CDN | `rnd/data/cdn_items.json` | 8324 equipements |
| Jobs CDN | `rnd/data/cdn_jobsItems.json` | 8576 items metiers |
| Recettes CDN | `rnd/data/cdn_recipes.json` | Recettes craft |

---

## 9. Statistiques de test (capture du 2026-03-22)

### 9.1 Metriques de capture

| Metrique | Valeur |
|----------|--------|
| Entrees decodees | 2 763 |
| Erreurs de parsing | 0 |
| Offres SELL | 2 736 |
| Offres BUY | 9 |
| Items SELL distincts | 1 356 |
| Items BUY distincts | 9 |
| Offres enchantees | 2 041 (74.4%) |
| Avec sublimation | 594 (21.7%) |
| Avec expiration | 2 745 (100%) |
| Avec actor_id | 2 745 (100%) |
| Partiellement vendus | 14 |
| Prix min | 1 kama |
| Prix max | 20 000 000 kamas |
| Timestamp serveur | 1774157916042 (2026-03-22 06:38:36) |

### 9.2 Repartition par duree (SELL)

| Code | Duree | Nombre | Pourcentage |
|------|-------|--------|-------------|
| 0 | 7 jours | 2 589 | 94.6% |
| 1 | 14 jours | 86 | 3.1% |
| 2 | 28 jours | 61 | 2.2% |

### 9.3 Repartition par duree (BUY)

| Code | Duree | Nombre | Pourcentage |
|------|-------|--------|-------------|
| 1 | 7 jours | 7 | 77.8% |
| 10 | expire/special | 2 | 22.2% |

### 9.4 Couverture des noms

| Source | Items resolus | Pourcentage |
|--------|--------------|-------------|
| CDN items.json | 1 273 | 93.5% |
| Scrape encyclopedie | 20 | 1.5% |
| Non resolus | 69 | 5.1% |
| **Total** | **1 362** | **94.9%** |

---

## 10. Offres de reference pour verification en jeu

### 10.1 Offre SELL enchantee

| Champ | Valeur en base |
|-------|---------------|
| Item | Plastron Ploeil (ID 27019) |
| Vendeur | Cosinus |
| Prix | 1 200 000 kamas |
| Quantite | 1/1 |
| Enchantements | Rouge, Vert, Rouge, Rouge |
| Sublimation | ID 3199 |
| Expiration | 2026-03-24 05:00:01 |
| Duree | code 0 = 7 jours |

### 10.2 Offre SELL en vrac (partiellement vendue)

| Champ | Valeur en base |
|-------|---------------|
| Item | Fourchette cassee Bwork (ID 17839) |
| Vendeur | Dabragojo |
| Prix | 1 kama/unite |
| Quantite | 99 init / 27 restants (72 vendus) |
| Enchantements | aucun |
| Expiration | 2026-03-23 05:00:02 |
| Duree | code 1 = 14 jours |

### 10.3 Offre BUY (demande d'achat)

| Champ | Valeur en base |
|-------|---------------|
| Item | Talisman de Noke (ID 17788) |
| Acheteur | Aylin Gewinn |
| Prix max | 1 001 kamas |
| Quantite | 1 init / 0 restant |
| Couleurs demandees | Any, Any, Any, Any |
| Expiration | 2026-03-22 05:00:01 (expiree) |
| Duree | code 10 = expire/special |

---

## 11. Problemes connus et limitations

### 11.1 Payload truncation

Le hook ChannelReadAdvice.java tronque les payloads longs. Cela affecte
les pages avec beaucoup d'offres. Solution : modifier ChannelReadAdvice
pour retirer la limite de taille, recompiler l'agent JAR.

### 11.2 BUY field swap possible

Pour certaines offres BUY, qty_init < qty_remaining (ex: Metalex,
qty_init=2 mais qty_remaining=11). Cela suggere que la semantique
de F5/F6 pourrait etre differente pour les BUY par rapport aux SELL.
A investiguer avec plus de donnees BUY.

### 11.3 Nom du serveur absent

Le nom du serveur (Pandora, Rubilax, etc.) n'est pas present dans les
messages clX/clU du marche. Il faudrait hooker un message de connexion
anterieur pour le capturer, ou le configurer manuellement.

### 11.4 Items manquants dans le CDN

69 items (5.1%) n'ont pas de nom resolu. Majoritairement des IDs > 26000
(items tres recents non encore dans le CDN public) et quelques ressources/
consommables absents de items.json et jobsItems.json. L'API retournera
l'ID brut pour ces items en attendant une mise a jour CDN.

### 11.5 Codes BUY duree 14j/28j

Seuls les codes BUY 1 (7j) et 10 (expire) ont ete observes.
Les codes pour 14j et 28j en BUY sont inconnus. A completer
avec une capture contenant plus d'offres d'achat.

---

## 12. Prochaines etapes

### 12.1 Court terme

- Verifier les 3 offres de reference en jeu (section 10)
- Corriger ChannelReadAdvice.java pour supprimer la truncation
- Recompiler l'agent JAR
- Capturer un dataset complet (~300 pages sans perte)

### 12.2 Moyen terme

- Creer l'API REST (PowerShell ou Node.js)
- Integrer dans l'overlay Tauri v2
- Ajouter la resolution de noms en temps reel
- Implementer le suivi de prix historique

### 12.3 Long terme

- Detection automatique du serveur
- Alertes de prix
- Analyse de tendances
- Recommandations de prix de vente

---

*Document genere automatiquement le 2026-03-22.*
*Basé sur l'analyse de 2 763 offres HDV capturees via agent ByteBuddy.*

