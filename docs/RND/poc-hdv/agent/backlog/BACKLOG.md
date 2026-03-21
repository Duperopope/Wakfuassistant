# BACKLOG POC-HDV - Wakfu Market Decoder
# Dernière mise à jour : 2026-03-21 01:04
# ============================================================

## STATUT GLOBAL : EN COURS - V3 NECESSAIRE

## CE QU'ON SAIT (CONFIRMÉ)
### Architecture réseau Wakfu HDV
- Le client Wakfu utilise Netty + protobuf pour le marché (HDV)
- Les messages passent par une classe de dispatch (aDj) puis des handlers spécifiques
- Le V2.2 agent (Byte-Buddy) a capturé 14 types de messages via aDj
- MAIS il capture le MAUVAIS byte[] (le plus gros du message Netty, pas le protobuf)

### Message IDs identifiés (depuis dec_price_cLN.java)
- 13088 (0x3320) = clV = REQUEST chercher des entries (items en vente)
- 13022 (0x32DE) = clW = REQUEST chercher des offers (offres d'achat)
- 12294 (0x3006) = clX = RESPONSE contient mg (ProtoMarketEntry avec unit_price)
- 13653 (0x3555) = clU = RESPONSE contient mI (ProtoMarketOffer avec unit_price)

### Chaîne de décodage (confirmée par sources décompilées)
Netty packet
  → aDj (dispatch général)
    → cmy.dn(ByteBuffer) : lit 1 byte status + appelle fd()
      → clX.fd() : lit 4 bytes longueur + byte[] protobuf
        → mg.bV(byte[]) : parse le protobuf
          → Liste de mc (ProtoMarketEntry)
            → champ 7 = unit_price (varint int64)

### Classes clés (fichiers décompilés)
| Classe | Fichier décompilé              | Rôle                              |
|--------|-------------------------------|-----------------------------------|
| aDj    | dec_aDj.java                  | Dispatch Netty général            |
| cmy    | dec_resp_parent_cmy.java      | Parent des réponses HDV           |
| clX    | dec_resp_clX.java             | Décodeur réponse entries          |
| clU    | dec_resp_clU.java             | Décodeur réponse offers           |
| clV    | dec_req_clV.java              | Requête search entries            |
| clW    | dec_req_clW.java              | Requête search offers             |
| mg     | dec_wrapper_mg.java           | Wrapper protobuf entries          |
| mI     | dec_wrapper_mI.java           | Wrapper protobuf offers           |
| mc     | dec_model_mc.java             | ProtoMarketEntry (uid, price...)  |
| mE     | dec_proto_mE.java             | Proto builder/parser              |
| mb     | dec_model_mb.java             | Modèle entry (7 champs)          |
| bHz    | dec_offer_bHZ.java            | Handler HDV principal             |
| cLN    | dec_price_cLN.java            | Message IDs (opcodes)            |
| fiR    | dec_price_fiR.java            | Prix / conversion                 |

### Schéma Protobuf reconstitué
message ProtoMarketSearchResult (mg) {
  Pagination pagination = 1;  // sub-message
  repeated MarketEntry entries = 2;  // sub-message
  int64 server_time = 3;  // varint
}

message MarketEntry (mc) {
  int64 uid = 1;           // varint
  SubMessage item = 2;     // sub-message (item details)
  Seller seller = 3;       // sub-message
  int64 init_qty = 5;      // varint
  int64 rem_qty = 6;       // varint
  int64 unit_price = 7;    // varint <-- LE PRIX EN KAMAS
  int32 sell_duration = 8; // varint
  int64 expiration = 9;    // varint
}

message Seller {
  int64 id = 1;            // varint
  string name = 2;         // string
}

## CE QUI A ÉCHOUÉ
- V2.2 agent capture byte[] via aDj mais c'est le mauvais payload
- Le protobuf HDV n'est PAS dans les données capturées (confirmé par scan exhaustif)
- Le regex d'extraction HEX ne matchait pas le format réel du log (0 lignes extraites!)
- Les scans de prix (90000, 94993) dans les coR payloads = négatif (coR = données joueur, pas HDV)

## PLAN V3
### Option A (recommandée) : Intercepter mg.bV(byte[])
- Hook la méthode statique mg.bV(byte[]) avec Byte-Buddy
- Le byte[] passé en argument EST le protobuf pur
- On le log en hex, on le décode côté PowerShell
- Avantage : pas besoin de comprendre le transport Netty

### Option B : Intercepter clX.fd() / clU.fd()
- Hook les méthodes fd() de clX et clU
- Capturer le ByteBuffer avant/après fd()
- Plus complexe car il faut extraire le ByteBuffer

### Option C : Intercepter cmy.dn(ByteBuffer)
- Hook le parent cmy.dn()
- Capturer le ByteBuffer complet
- Permet de voir TOUS les messages HDV (entries + offers)

## FICHIERS DU PROJET
- Agent JAR V2.2 : docs/RND/poc-hdv/agent/
- Logs V2.2 : logs/market_v22_all.log
- Sources décompilées : docs/RND/decompiled/ (121 fichiers dec_*.java)
- Ce backlog : docs/RND/poc-hdv/agent/backlog/

## V3 AGENT CREE - 2026-03-21 01:08
### Fichiers crees
- src/main/java/com/wakfu/agent/MarketPriceAgentV3.java (premain)
- src/main/java/com/wakfu/agent/CmyDnAdvice.java (hook cmy.dn - LE PRINCIPAL)
- src/main/java/com/wakfu/agent/NettyDispatchAdvice.java (contexte Netty)
- build.gradle (mis a jour pour V3)
- launch_hdv_v3.bat

### Strategie V3
- Hook cmy.dn(byte[]) qui est appele pour CHAQUE reponse HDV
- cmy est le parent de clX (entries, msgId=12294) et clU (offers, msgId=13653)
- Le byte[] contient : [1 byte status][4 bytes length][protobuf pur]
- On extrait le protobuf et on le log dans market_v3_proto.log
- Le msgId est recupere via self.d() pour identifier le type

### Logs V3
- market_v3.log : TOUS les messages (cmy.dn + Netty dispatch)
- market_v3_proto.log : UNIQUEMENT les protobuf HDV (12294 + 13653)
  Format: timestamp|class|msgId|type|status|protoLen|PROTOHEX=...

### Prochaines etapes
1. gradle jar (compiler)
2. Lancer Wakfu avec -javaagent:market-price-agent-v3.jar
3. Aller a l'HDV, chercher "Amulette Auneth"
4. Copier market_v3_proto.log ici pour decoder
