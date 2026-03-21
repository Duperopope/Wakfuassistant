# POC HDV - Capture des prix en temps reel
## Date: 2026-03-21
## Statut: FONCTIONNEL

## Architecture
- Agent Java ByteBuddy injecte via JAVA_TOOL_OPTIONS
- Interception PASSIVE de aDj.channelRead0 (pipeline Netty)
- Decodage protobuf inline des messages 'coy' (offres de vente)
- L'HDV du jeu n'est PAS affecte (lecture seule)

## Fichiers cles
- Agent JAR: docs/RND/poc-hdv/agent/build/libs/market-price-agent.jar
- Lanceur: docs/RND/poc-hdv/agent/launch_hdv_v2.bat
- Sources: docs/RND/poc-hdv/agent/src/main/java/com/wakfu/agent/
  - MarketPriceAgentV2.java (point d'entree, hook ByteBuddy)
  - MarketNettyAdvice.java (decodage protobuf inline)
- Logs: logs/market_prices.log (lisible) et logs/market_prices.json (exploitable)

## Format protobuf du message 'coy' (ProtoMarketOffer)
| Field | Type    | Description                          |
|-------|---------|--------------------------------------|
| F1    | varint  | UID de l'offre (unique)              |
| F2    | varint  | = F1 (copie, entryId)                |
| F3    | varint  | Quantite (valeur absolue du varint)  |
| F4    | varint  | itemRefId (identifiant de l'objet)   |
| F5    | message | Sous-message etat (toujours {0,0,0}) |
| F6    | varint  | Timestamp debut                      |
| F7    | varint  | Timestamp fin                        |
| F8    | message | Details de l'offre                   |
| F8.F10| varint  | itemRefId (copie de F4)              |
| F8.F13| varint  | UID (copie de F1)                    |
| F8.F22| varint  | PRIX UNITAIRE en kamas (abs value)   |
| F9    | varint  | Categorie (1=ressource, 12=equip)    |
| F10   | varint  | RefId item / sous-categorie          |
| F11   | message | Infos supplementaires                |
| F13   | message | Flags / metadata                     |

## Messages reseau identifies
| Message | ID    | Direction       | Contenu                    |
|---------|-------|-----------------|----------------------------|
| clW     | 13022 | Client->Serveur | Recherche ventes           |
| clV     | 13088 | Client->Serveur | Recherche achats           |
| clU     | 13653 | Serveur->Client | Resultat recherche (mI)    |
| clX     | 12294 | Serveur->Client | Resultat recherche (mg)    |
| coy     | -     | Serveur->Client | Offre individuelle (proto) |
| cmv     | 12304 | Serveur->Client | Confirmation achat         |
| ctu     | -     | Serveur->Client | Mise a jour kamas          |
| csf     | -     | Serveur->Client | Item recu                  |

## Statistiques de la session de test
- Offres capturees: 119 uniques (238 brutes, doublons pipeline)
- Items differents: 67
- Offres avec prix > 0: 69% (82/119)
- Offres a prix 0: 31% (37/119) = items sans valeur marchande
- Prix observes: 1 000k a 900 000k

## Prochaines etapes
1. Resoudre les noms d'items (itemRefId -> nom lisible via API Wakfu)
2. Integrer dans l'overlay Tauri (SolidJS frontend)
3. Stocker l'historique dans SQLite
4. Creer l'onglet Economie dans l'overlay
5. Ajouter le suivi des achats (cmv) et solde kamas (ctu)
