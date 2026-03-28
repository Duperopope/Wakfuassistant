# Mise a jour 2026-03-22 - ENCHANTEMENTS HDV DECODES

## Resultat
- Enchantements extraits avec succes depuis les messages clX (msgId 12294)
- 58 items enchantes sur 173 offres de vente dans un test de 2 pages
- Couleurs de slots : Rouge, Bleu, Vert, Blanc/Epique
- Sublimations detectees : IDs 1, 319, 3199, 12415

## Architecture technique validee
- Hook 1 : cmy.dn(byte[]) - capture les reponses protobuf HDV (clX ventes, clU achats)
- Hook 3 : coy.dn(byte[]) - capture les messages coy (msgId 12522) - contient des requetes, PAS les enchantements
- Hook 2 : aDj.channelRead0 / adj_2 - NE FONCTIONNE PAS au runtime (classe renommee par obfuscation)
- Les enchantements sont dans clX (12294) > entry (mc) > F2 (kW) > F52 (shardData) > repeated F1 (slot)
- Chaque slot contient : F10 (index), F11 (?), F12 (couleur), F14 (sublimation_id)
- Couleurs : 0=Vide, 1=Rouge, 2=Bleu, 3=Vert, 4=Blanc/Epique

## Mapping protobuf mc (sell entry dans clX/12294)

  Field  | Type          | Contenu
  -------|---------------|--------
  F1     | varint        | offer_uid
  F2     | submsg kW     | item data
  F2.F1  | varint        | item_uid interne
  F2.F2  | varint        | item_ref_id (ex: 21893)
  F2.F3  | varint        | quantite item
  F2.F52 | submsg        | shard/enchantement data
  F2.F52.F1 | repeated submsg | slots
  F2.F52.F1.F10 | varint | slot_index (0,1,2,3)
  F2.F52.F1.F12 | varint | couleur (0=Vide,1=Rouge,2=Bleu,3=Vert,4=Blanc)
  F2.F52.F1.F14 | varint | sublimation_id
  F2.F56 | submsg        | donnees supplementaires
  F3     | submsg        | seller data
  F3.F1  | varint        | actor_id
  F3.F2  | string        | actor_name (nom vendeur)
  F3.F3  | varint        | level
  F3.F4  | varint        | breed
  F5     | varint        | qty_init
  F6     | varint        | qty_remaining
  F7     | varint        | unit_price (en kamas)
  F8     | varint        | sell_duration
  F9     | varint        | expiration_timestamp

## Classes obfusquees confirmees (version client mars 2026)

  Classe runtime | Classe decompilee | Role
  ---------------|-------------------|-----
  cmy            | cmy               | Decodeur parent reponses HDV
  coy            | coy               | Decodeur messages individuels (msgId 12522)
  aDj            | adj_2 (CFR)       | Handler Netty principal
  clX            | clX               | Message sell entries (msgId 12294)
  clU            | clU               | Message buy offers (msgId 13653)
  mc             | mc                | Protobuf sell entry
  mE             | mE                | Protobuf offer detail (15 champs)
  kW             | kW                | Protobuf item data (dans mc.F2)
  aaw_1          | aaw_1             | Dispatcher messages Netty

## Fichiers cles

  Fichier | Role
  --------|-----
  rnd/poc-hdv/agent/src/.../MarketPriceAgentV3.java | Agent ByteBuddy, 3 hooks
  rnd/poc-hdv/agent/src/.../CmyDnAdvice.java | Hook 1 : capture clX/clU protobuf
  rnd/poc-hdv/agent/src/.../CoyDnAdvice.java | Hook 3 : capture coy (requetes)
  rnd/poc-hdv/agent/src/.../CoyNettyAdvice.java | Hook 2 : discovery Netty (diagnostic)
  rnd/poc-hdv/agent/build.gradle | Build config, produit market-price-agent-v3.jar
  rnd/poc-hdv/sync_hdv_to_sqlite.ps1 | Parse proto log -> SQLite avec enchantements
  rnd/poc-hdv/export_hdv_readable.ps1 | Export CSV/MD lisibles avec noms CDN
  LANCER_HDV.bat | Launcher unique (agent + sync + export)
  logs/hdv_market.db | Base SQLite avec offres + enchantements
  logs/market_v3_proto.log | Log brut protobuf hex
  rnd/data/cdn_items.json | Cache CDN 8324 items (noms fr/en/es/pt)

## Commandes

  # Compiler agent
  cd H:\Code\Wakfuassistant\docs\RND\poc-hdv\agent
  .\gradle-bin\gradle-8.10.2\bin\gradle.bat clean build

  # Lancer capture complete
  H:\Code\Wakfuassistant\LANCER_HDV.bat

  # Sync manuelle
  powershell -NoProfile -ExecutionPolicy Bypass -File "docs\RND\poc-hdv\sync_hdv_to_sqlite.ps1"

  # Export avec noms
  powershell -NoProfile -ExecutionPolicy Bypass -File "docs\RND\poc-hdv\export_hdv_readable.ps1" -ResolveItemNames

  # Requete enchantements
  sqlite3 logs/hdv_market.db ".headers on" ".mode column" "SELECT item_ref_id, actor_name, unit_price, slot_colors, sublimation_id FROM market_latest WHERE slot_colors != '' ORDER BY unit_price DESC LIMIT 20;"

## Bugs connus
- Hook 2 (aDj/adj_2.channelRead0) ne se declenche pas au runtime
- Parse-CoyOffer overflow Int32 sur varint 0xFFFFFFFFFFFFFFFF - a corriger avec cast [int64]
- 6 erreurs parsing sur messages MARKET_COY - non bloquant
- Export -ResolveItemNames necessite docs\RND\data\cdn_items.json (15 MB)
