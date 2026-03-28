# POC HDV — Hôtel des Ventes Wakfu

> Statut : VALIDÉ — Dernière mise à jour : 2026-03-21
> Fusion de : Journal_POC_HDV + HDV_PRICE_CAPTURE + GUIDE_REPRO + BACKLOG + v3_results

---

## 1. Résultat du POC

| Ce qui marche | Ce qui ne marche pas | Ce qui reste à faire |
|---|---|---|
| Interception passive des messages réseau HDV via agent Java ByteBuddy | V2.2 capture le mauvais byte[] (payload Netty, pas le protobuf pur) | Résoudre les noms d'items (itemRefId -> nom lisible via CDN Ankama) |
| Décodage protobuf des messages `msgId=12294` (ventes) et `msgId=13653` (achats) | Regex d'extraction HEX ne matchait pas le format réel du log (0 lignes extraites en V2) | Intégrer dans l'overlay Tauri (SolidJS frontend) |
| Persistance SQLite dans `logs/hdv_market.db` avec dédoublonnage par hash | `coR` payloads = données joueur, pas HDV (scan prix négatif) | Créer l'onglet Economie dans l'overlay |
| Table `market_latest` (état courant upsert par clé `(side, item_ref_id, offer_uid)`) | Extension VS Code SQLite : bug sur `"table"` (pas la base qui est corrompue) | Ajouter le suivi des achats (cmv) et solde kamas (ctu) |
| Export CSV/Markdown lisibles (`market_latest_preview.csv`, `.md`) | | Intégrer rareté des items dans le pipeline |
| Résolution des noms via CDN Ankama avec cache local | | Intégration dans le pipeline Rust principal |
| Détection d'opportunités arbitrage achat > vente via SQL | | |
| Validation solde kamas post-transaction (champ `ctu.meu`) | | |

---

## 2. Architecture technique

### Messages protobuf identifiés

| Message | ID (msgId) | Direction | Contenu |
|---------|------------|-----------|---------|
| clX | **12294** (0x3006) | Serveur -> Client | Résultat recherche entries (ventes) — champ `mg` |
| clU | **13653** (0x3555) | Serveur -> Client | Résultat recherche offers (achats) — champ `mI` |
| clW | 13022 (0x32DE) | Client -> Serveur | Requête search entries (items en vente) |
| clV | 13088 (0x3320) | Client -> Serveur | Requête search offers (offres d'achat) |
| cmv | 12304 | Serveur -> Client | Confirmation achat (maH=OK) |
| ctu | — | Serveur -> Client | Mise à jour solde kamas (meu=solde) |
| csf | — | Serveur -> Client | Item reçu (AddItemOperation: refId, qty, bagId) |
| coy | — | Serveur -> Client | Offre individuelle (format proto inline) |

### Pipeline logique

```
Source runtime : Wakfu + agent Java (-javaagent)
  └─ Interception PASSIVE de cmy.dn(byte[]) (parent de clX et clU)
       └─ Logs bruts :
            ├─ logs/market_v3.log         (texte, tous messages)
            └─ logs/market_v3_proto.log   (payloads proto hex — msgId 12294 + 13653)
                  └─ Format : timestamp|class|msgId|type|status|protoLen|PROTOHEX=...
  └─ Parsing métier (PowerShell) — sync_hdv_to_sqlite.ps1
       └─ Extraction : item_ref_id, offer_uid, unit_price, quantity, actor_name, source_ts
  └─ Persistance SQLite — logs/hdv_market.db
       ├─ market_observations : historique dédoublonné (hash ligne)
       └─ market_latest : état courant upsert par clé (side, item_ref_id, offer_uid)
  └─ Restitution lisible — export_hdv_readable.ps1
       ├─ logs/market_latest_preview.csv
       ├─ logs/market_latest_preview.md
       └─ logs/market_latest_named_preview.csv (avec noms d'objets via CDN)
```

### Chaîne de décodage interne (confirmée par sources décompilées)

```
Netty packet
  → aDj (dispatch général)
    → cmy.dn(ByteBuffer) : lit 1 byte status + appelle fd()
      → clX.fd() : lit 4 bytes longueur + byte[] protobuf
        → mg.bV(byte[]) : parse le protobuf
          → Liste de mc (ProtoMarketEntry)
            → champ 7 = unit_price (varint int64)
```

### Schéma protobuf reconstitué

```protobuf
message ProtoMarketSearchResult (mg) {
  Pagination pagination = 1;
  repeated MarketEntry entries = 2;
  int64 server_time = 3;
}

message MarketEntry (mc) {
  int64 uid = 1;
  SubMessage item = 2;
  Seller seller = 3;
  int64 init_qty = 5;
  int64 rem_qty = 6;
  int64 unit_price = 7;   // LE PRIX EN KAMAS
  int32 sell_duration = 8;
  int64 expiration = 9;
}

message Seller {
  int64 id = 1;
  string name = 2;
}
```

### Format protobuf du message 'coy' (ProtoMarketOffer — offre individuelle)

| Field | Type | Description |
|-------|------|-------------|
| F1 | varint | UID de l'offre (unique) |
| F2 | varint | = F1 (copie, entryId) |
| F3 | varint | Quantité (valeur absolue du varint) |
| F4 | varint | itemRefId (identifiant de l'objet) |
| F5 | message | Sous-message état (toujours {0,0,0}) |
| F6 | varint | Timestamp début |
| F7 | varint | Timestamp fin |
| F8 | message | Détails de l'offre |
| F8.F10 | varint | itemRefId (copie de F4) |
| F8.F13 | varint | UID (copie de F1) |
| F8.F22 | varint | PRIX UNITAIRE en kamas (abs value) |
| F9 | varint | Catégorie (1=ressource, 12=équip) |
| F10 | varint | RefId item / sous-catégorie |
| F11 | message | Infos supplémentaires |
| F13 | message | Flags / metadata |

### Classes clés (fichiers décompilés)

| Classe | Fichier décompilé | Rôle |
|--------|-------------------|------|
| aDj | dec_aDj.java | Dispatch Netty général |
| cmy | dec_resp_parent_cmy.java | Parent des réponses HDV |
| clX | dec_resp_clX.java | Décodeur réponse entries (msgId=12294) |
| clU | dec_resp_clU.java | Décodeur réponse offers (msgId=13653) |
| clV | dec_req_clV.java | Requête search entries |
| clW | dec_req_clW.java | Requête search offers |
| mg | dec_wrapper_mg.java | Wrapper protobuf entries |
| mI | dec_wrapper_mI.java | Wrapper protobuf offers |
| mc | dec_model_mc.java | ProtoMarketEntry (uid, price...) |
| mE | dec_proto_mE.java | Proto builder/parser |
| mb | dec_model_mb.java | Modèle entry (7 champs) |
| bHz | dec_offer_bHZ.java | Handler HDV principal |
| cLN | dec_price_cLN.java | Message IDs (opcodes) |
| fiR | dec_price_fiR.java | Prix / conversion |

---

## 3. Point critique : item_ref_id vs offer_uid

> **ALERTE — DISTINCTION CRITIQUE — RÈGLE ABSOLUE DU PROJET**
>
> Ces deux identifiants ne sont PAS interchangeables. Les confondre corrompt toute analyse.
>
> | Identifiant | Signification | Exemple |
> |-------------|---------------|---------|
> | `item_ref_id` | Identifiant de **l'objet** (ce que tu veux pour reconnaitre l'item) | `26599` = Culotte |
> | `offer_uid` | Identifiant unique de **l'offre dans le HDV** (pas l'objet) | `56227059278285599` |
>
> **Règle** : `56227059278285599` est un `offer_uid`, **jamais** un `item_ref_id`.
>
> La clé de déduplication dans `market_latest` est le triplet `(side, item_ref_id, offer_uid)`.
> Utiliser `offer_uid` à la place de `item_ref_id` dans une requête prix = résultat faux garanti.

---

## 4. Données capturées

### Échelle du HDV (snapshot de validation)

- **82 918** offres de vente sur 9 214 pages
- **4 408** offres d'achat sur 490 pages
- Joueur observé : 65 objets en vente, 26 991K à récupérer

### Statistiques session de test agent

- Offres capturées : 119 uniques (238 brutes, doublons pipeline)
- Items différents : 67
- Offres avec prix > 0 : 69% (82/119)
- Offres à prix 0 : 31% (37/119) = items sans valeur marchande
- Prix observés : 1 000k à 900 000k

### Structure de la table `market_latest`

| Colonne | Description |
|---------|-------------|
| `side` | `buy` ou `sell` |
| `item_ref_id` | Identifiant de l'objet |
| `offer_uid` | Identifiant unique de l'offre |
| `actor_name` | Vendeur ou acheteur |
| `unit_price` | Prix unitaire en kamas |
| `quantity` | Quantité disponible |
| `source_msg_id` | ID proto du message source |
| `source_ts` | Timestamp de la trame réseau |
| `updated_at` | Timestamp de la dernière sync |

### Validation des identifiants (session test)

```
f10=26599 → Culotte
f10=26858 → Les Pompes Ettes
f10=27486 → Plastron de la Maman Gerbouille
f10=25851 → Anneau Poutreux
f10=19886 → Voile Nomade
Taux identification : 5/5 = 100%
```

### Validation de l'achat

- Message `cmv` maH=OK = confirmation achat
- Message `csf` AddItemOperation m_refId=26426 m_qty=1
- refId=26426 = Main du Boo
- bagId HDV = 29186495290016880 (différent du bag inventaire 27497136409018909)
- Solde kamas : 724742 → achat 1 kama → `ctu.meu=724741` (confirmé)

### Fichiers de sortie utiles

- `logs/top10_buy_over_sell.csv`
- `logs/top10_buy_over_sell_resources.csv`
- `logs/market_latest_named_preview.csv`
- `logs/market_latest_preview.csv`
- `logs/market_latest_preview.md`

---

## 5. Guide de reproduction

> Prérequis : Windows, Wakfu + Ankama Launcher, Java, sqlite3 dans le PATH, projet ouvert dans VS Code (`H:\Code\Wakfuassistant`).

### Etape A — Lancer la capture HDV

1. Ouvrir le fichier batch :
   - `rnd/poc-hdv/agent/launch_hdv_v2.bat`
2. Suivre les instructions affichées :
   - Fermer Wakfu + Ankama Launcher
   - Relancer via le batch
   - Ouvrir Wakfu
   - Ouvrir le HDV en jeu
   - Faire défiler / rechercher les pages souhaitées

Note : plus tu fais défiler de pages, plus la base est complète. Sans scroll, seules les offres vues en jeu sont capturées.

### Etape B — Vérification des logs

Après capture, ces fichiers doivent exister :

- `logs/market_v3.log`
- `logs/market_v3_proto.log`

Si `market_v3_proto.log` est vide ou absent, aucune donnée n'est disponible pour le décodage.

### Etape C — Sync vers la base SQLite

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File "docs\RND\poc-hdv\sync_hdv_to_sqlite.ps1"
```

Résultat attendu :

- La base `logs/hdv_market.db` est créée ou mise à jour.
- Dédoublonnage automatique via hash.
- Table `market_latest` mise à jour (état courant des offres).

### Etape D — Export lisible en clair

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File "docs\RND\poc-hdv\export_hdv_readable.ps1"
```

Fichiers générés :

- `logs/market_latest_preview.csv` (grand volume, idéal pour filtres)
- `logs/market_latest_preview.md` (lecture rapide dans VS Code)

### Etape E — Export avec vrais noms d'objets (CDN Ankama)

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File "docs\RND\poc-hdv\export_hdv_readable.ps1" -ResolveItemNames
```

Fichier généré :

- `logs/market_latest_named_preview.csv`

Note : le script télécharge la base des items depuis le CDN Ankama et conserve un cache local dans `logs/item_name_cache.json`. Si internet est indisponible, le cache est réutilisé.

### Lecture des données dans VS Code

Méthode recommandée (la plus stable) :

- Ouvrir `logs/market_latest_preview.md`
- Ouvrir `logs/market_latest_preview.csv`

Ces fichiers sont déjà en clair, aucun plugin n'est obligatoire.

Si tu veux lire la base SQLite directement : le plugin SQLite peut échouer avec une erreur sur `"table"` (bug extension, pas la base). Contournement : utiliser les exports CSV/MD, ou installer SQLite Viewer puis `Open With...`.

### Recherche d'opportunités arbitrage (achat > vente)

```powershell
sqlite3 "logs/hdv_market.db" -cmd ".headers on" -cmd ".mode column" "
WITH sell_min AS (
  SELECT item_ref_id, MIN(unit_price) AS min_sell
  FROM market_latest
  WHERE side='sell'
  GROUP BY item_ref_id
),
buy_max AS (
  SELECT item_ref_id, MAX(unit_price) AS max_buy
  FROM market_latest
  WHERE side='buy'
  GROUP BY item_ref_id
)
SELECT b.item_ref_id,
       b.max_buy,
       s.min_sell,
       (b.max_buy - s.min_sell) AS delta
FROM buy_max b
JOIN sell_min s ON s.item_ref_id = b.item_ref_id
WHERE b.max_buy > s.min_sell
ORDER BY delta DESC
LIMIT 100;
"
```

`delta > 0` = arbitrage potentiel. Plus `delta` est grand, plus l'écart est intéressant.

### Note sur les fichiers de sortie archivés

Les exports lisibles (`market_latest_preview*`, `top10_buy_over_sell*`) peuvent être archivés dans `logs/runs/<RUN_ID>/artifacts/` lors de l'initialisation d'un nouveau run. Si un export n'est plus en racine `logs/`, consulter le dernier run archivé ou le régénérer.

### Rythme conseillé d'utilisation

Après chaque grosse session HDV :

1. Lancer capture (batch)
2. Lancer sync
3. Lancer export lisible
4. Lire les résultats dans `logs/market_latest_preview.csv`
5. Lancer la requête arbitrage si besoin

### Dépannage

**Rien n'apparaît en base** : vérifier que le HDV a bien été ouvert en jeu, que des pages ont été naviguées, que `logs/market_v3_proto.log` contient des lignes récentes, et que la sync a été relancée après la session.

**Fichier `.db` illisible dans l'éditeur** : normal, SQLite est binaire. Utiliser les exports CSV/MD ou un viewer compatible.

---

## 6. Scripts opérationnels

| Script | Rôle | Chemin |
|--------|------|--------|
| `launch_hdv_v2.bat` | Lance Wakfu avec l'agent d'interception, enchaîne decode/sync | `rnd/poc-hdv/agent/launch_hdv_v2.bat` |
| `sync_hdv_to_sqlite.ps1` | Parse ventes + achats (msgId 12294 + 13653), alimente `hdv_market.db` | `rnd/poc-hdv/sync_hdv_to_sqlite.ps1` |
| `export_hdv_readable.ps1` | Exporte en clair vers CSV/Markdown pour lecture facile | `rnd/poc-hdv/export_hdv_readable.ps1` |
| `decode_market_v3_prices.ps1` | Décode les trames HDV et extrait les infos prix | `rnd/poc-hdv/decode_market_v3_prices.ps1` |
| Agent JAR V3 | Agent Java ByteBuddy V3 (hook `cmy.dn`) | `rnd/poc-hdv/agent/build/libs/market-price-agent.jar` |
| `launch_hdv_v3.bat` | Lanceur V3 | `rnd/poc-hdv/agent/launch_hdv_v3.bat` |

### Sources Java de l'agent

- `MarketPriceAgentV2.java` — Point d'entrée, hook ByteBuddy (V2)
- `MarketNettyAdvice.java` — Décodage protobuf inline (V2)
- `MarketPriceAgentV3.java` — Point d'entrée V3 (premain)
- `CmyDnAdvice.java` — Hook `cmy.dn` — le hook principal V3
- `NettyDispatchAdvice.java` — Contexte Netty (V3)

Racine sources : `rnd/poc-hdv/agent/src/main/java/com/wakfu/agent/`

---

## 7. Backlog & résultats v3

### Résultats V3 (2026-03-21)

**V3 ECHEC** : aucune entry HDV dans les payloads capturés par `cmy.dn`. Le protobuf HDV n'est pas accessible via ce hook.

La cause confirmée : le V2.2 et V3 capturent le mauvais byte[] (le plus gros du message Netty, pas le protobuf pur). Le scan exhaustif des payloads `coR` a confirmé que ces données correspondent aux données joueur, pas au HDV.

### Plan de correction (prochaine itération agent)

**Option A (recommandée)** : Intercepter `mg.bV(byte[])`
- Hook la méthode statique `mg.bV(byte[])` avec ByteBuddy
- Le `byte[]` passé en argument EST le protobuf pur
- Log en hex, décodage côté PowerShell
- Avantage : pas besoin de comprendre le transport Netty

**Option B** : Intercepter `clX.fd()` / `clU.fd()`
- Hook les méthodes `fd()` de `clX` et `clU`
- Capturer le ByteBuffer avant/après `fd()`
- Plus complexe (extraction ByteBuffer nécessaire)

**Option C** : Intercepter `cmy.dn(ByteBuffer)`
- Hook le parent `cmy.dn()`
- Capturer le ByteBuffer complet
- Permet de voir TOUS les messages HDV (entries + offers)

### Backlog priorisé

1. Implémenter Option A : hook `mg.bV(byte[])` — protobuf pur garanti
2. Compiler, lancer Wakfu, aller à l'HDV, chercher "Amulette Auneth", copier `market_v3_proto.log` pour décoder
3. Valider le décodage des champs `unit_price` (champ 7 de `MarketEntry`)
4. Intégrer résolution des noms d'objets (CDN Ankama) dans le pipeline principal
5. Intégrer rareté des items
6. Créer l'onglet Economie dans l'overlay Tauri

---

## 8. Gaps identifiés

### Noms des ressources manquants

Le pipeline actuel identifie les items par `item_ref_id` (entier). La résolution en nom lisible dépend du CDN Ankama et d'un cache local (`logs/item_name_cache.json`). Ce cache est partiel : certains `item_ref_id` restent sans nom connu.

- Le flag `-ResolveItemNames` de `export_hdv_readable.ps1` couvre les cas standard.
- Les items inconnus du CDN apparaissent avec leur `item_ref_id` brut dans les exports.
- Les ressources/récoltes (catégorie 1) sont identifiables par le champ `F9` du protobuf mais leur nom nécessite toujours la résolution CDN.

### Rareté des items

La rareté n'est pas encore capturée dans le pipeline. Elle n'est pas présente dans les champs protobuf actuellement décodés. Son extraction nécessiterait soit une source externe (API Wakfu officielle), soit un champ supplémentaire à identifier dans le protobuf.

### Opportunités ressources/récoltes

Sur le snapshot courant : 0 opportunité strictement ressources/récoltes (à réévaluer après nouvelle capture avec une base plus complète).

### Intégration dans le pipeline Rust

Le pipeline HDV est actuellement 100% PowerShell + SQLite. L'intégration dans le pipeline Rust principal (Wakfu Assistant) est identifiée comme étape suivante mais n'est pas encore commencée. Les gaps à combler avant intégration :

- Noms d'items stables et complets
- Rareté des items
- Format d'échange défini entre le pipeline SQLite et le runtime Rust
- Commande launcher intégrée (actuellement batch séparé)

### Métiers L'Immortel

Les recettes et matériaux des métiers L'Immortel ne sont pas couverts par le pipeline HDV actuel. C'est un cas d'usage identifié mais non implémenté.
