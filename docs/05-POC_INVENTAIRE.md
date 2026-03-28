# Journal POC - Extraction Inventaire Havre-Sac

## Addendum 2026-03-21 - Confirmation/Infirmation

Confirmations:
- Le POC coffre/havre-sac reste valide sur son scope (mouvements, mapping progressif uid->refId, entree/sortie espace perso).
- La limitation depot sans `refId` reste vraie.

Clarification de scope:
- Ce POC est distinct du pipeline HDV prix marche.
- Le pipeline HDV actif utilise `market_v3_proto.log` + `sync_hdv_to_sqlite.ps1` + `hdv_market.db`.

Decision:
- Conserver ce document comme reference inventaire/coffre.
- Ne pas melanger ses hypotheses avec la logique arbitrage HDV.

**Date**: 2026-03-20 20:08
**Statut**: POC VALIDE
**Dossier**: rnd/poc-extractioninventairehavresac/

---

## Objectif

Capturer automatiquement les mouvements d'items (depots/retraits) dans le coffre du Havre-Sac de Wakfu, sans saisie manuelle, en lisant les logs du client Java.

## Resultats

### Ce qui fonctionne a 100%

- **Retraits du coffre** : captures via `AddItemOperation{m_refId, m_qty, m_bagId}` dans les messages Netty `csf`. Le `refId` permet de resoudre le nom de l'item via le CDN Ankama ou l'encyclopedie web.
- **Depots dans le coffre** : captures via messages Netty `cso{duS=uniqueId, bol=position}`. Le nom est resolu si l'item a ete retire au moins une fois (mapping `uid -> refId` persistant).
- **Entree/sortie Havre-Sac** : detectees via `DimensionalBag.initializeToEnter()` et `PERSONAL_SPACE_LEAVE_RESULT_MESSAGE`.
- **Ouverture du coffre** : detectee via message `csJ`.
- **Bilan de session** : affiche a chaque sortie du Havre-Sac.

### Limitation identifiee

Le protocole Wakfu n'envoie pas le `refId` dans les messages de depot (`cso`), seulement le `uniqueId`. Le mapping `uid -> refId` se construit progressivement via les retraits et persiste entre sessions dans `uid_refid_mapping.json`.

**Solution communautaire** : en fusionnant les mappings de tous les joueurs, la resolution sera quasi-totale.

## Architecture technique

### Messages Netty identifies

| Message | Role | Donnees |
|---------|------|---------|
| `csJ` | Ouverture coffre | `mhx=SUCCESS` |
| `csF` | Chargement coffre | `mhx=SUCCESS` (protobuf casse cote toString) |
| `csf` | Operation item | `AddItemOperation{m_refId, m_qty, m_bagId, m_posInBag}` |
| `cso` | Finalisation move | `duS=uniqueId, bol=position` |
| `csC` | Confirmation | `mhx=SUCCESS` |
| `csE` | Sync slot | timestamp de sync |
| `csm` | Liste coffre | liste de uniqueId (protobuf) |
| `csS` | Storage Sync login | uniqueId seulement (pas de refId) |
| `ctE` | Character data | format custom Ankama (pas d'inventaire) |

### Sequence retrait (coffre -> inventaire)

1. `csf` avec `AddItemOperation{m_refId, m_qty, m_bagId}`
2. `csE` sync
3. `cso{duS=uniqueId, bol=-1}` finalisation
4. `csC{mhx=SUCCESS}` confirmation
5. Log texte: `Vous avez ramasse Xx NomItem`

### Sequence depot (inventaire -> coffre)

1. `cso{duS=uniqueId, bol=position_negative}` (pas de refId!)
2. `csC{mhx=SUCCESS}` confirmation
3. Pas de log texte

### Resolution des noms

1. **CDN Ankama** : `https://wakfu.cdn.ankama.com/gamedata/<version>/items.json` (8324 equipements) + `resources.json` (170 ressources)
2. **Encyclopedie web** : `https://www.wakfu.com/fr/mmorpg/encyclopedie/<categorie>/<refId>` (scraping fallback)
3. **Cache local** : `item_name_cache.json` (noms resolus par l'encyclopedie)
4. **Mapping persistant** : `uid_refid_mapping.json` (uid -> refId appris via retraits)

### Configuration Log4j requise

Ajouter dans les Java Options du launcher Ankama :
`-Dlog4j.configuration=file:///C:/Users/<User>/AppData/Roaming/zaap/gamesLogs/wakfu/log4j-spy.properties`

Le fichier `log4j-spy.properties` active le niveau DEBUG et un RollingFileAppender vers `logs/wakfu_spy.log`.

## Fichiers du POC

### Scripts actifs
- `chest_poc_v5.ps1` : POC final avec monitoring temps reel et mapping persistant
- `check_mapping.ps1` : verification de l'etat du mapping et stats

### Scripts d'exploration (historique R&D)
- `chest_correlation.ps1` : premiere tentative de correlation depot/retrait
- `chest_deep_search.ps1` : recherche approfondie dans les messages Netty
- `chest_dump.ps1` : dump brut des messages
- `chest_inventory_search.ps1` : recherche de l'inventaire initial
- `dump_smart.ps1` : decodeur protobuf du csS
- `dump_compartiment4.ps1` : dump du compartiment inventaire
- `decode_ctE.ps1` / `decode_ctE_v2.ps1` / `decode_ctE_v3.ps1` : tentatives de decodage du ctE
- `inspect_ctE.ps1` : inspection des champs du ctE
- `detect_format_ctE.ps1` : detection du format (compression, entropie)

### Fichiers de donnees (output/)
- `uid_refid_mapping.json` : mapping persistant uid -> refId
- `item_name_cache.json` : cache noms encyclopedie
- `dump_compartiment4.txt` / `dump_ctE.txt` : dumps protobuf
- `spy_*.txt` : captures de logs filtrees

## Prochaines etapes

1. **HDV (Hotel des Ventes)** : explorer les messages Netty lors d'achats/ventes
2. **Quantites de depot** : le message `cso` ne contient pas la quantite (toujours 1x) - investiguer
3. **Havre-Gemmes** : les refId 27574 et 27933 resolvent vers "Havre" - trouver le sous-type
4. **Integration Tauri/Rust** : porter le monitoring PowerShell en module Rust natif
5. **Base communautaire** : API pour fusionner les mappings de tous les joueurs
6. **Protobuf** : reprendre le reverse-engineering du csS/csn pour extraire le mapping complet au login

## Conclusions

Le POC valide que l'extraction automatique des mouvements d'inventaire est **faisable et fiable**. La donnee provient directement du protocole reseau du jeu, eliminant tout risque d'erreur de saisie manuelle. Le systeme de mapping persistant et communautaire garantit une resolution progressive de 100% des items.

Cette approche constitue la brique fondamentale pour une base de donnees communautaire integre, extensible a l'HDV et a d'autres systemes de jeu.
