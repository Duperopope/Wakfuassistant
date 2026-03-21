# CARTOGRAPHIE PROTOCOLE WAKFU
# Generee le 2026-03-21 19:27
# Projet: H:\Code\Wakfuassistant
# GitHub: https://github.com/Duperopope/Wakfuassistant

## ARCHITECTURE RESEAU

### Classes de base
- **Nn** = classe abstraite message reseau
- **Nr extends Nn** = message brut (byte[] payload)
- **d()** = retourne l'ID du message (int)
- **dn(byte[])** = deserialisation du payload

### Handlers (message dispatchers)
| Handler | Fichier | Cases | Domaine |
|---------|---------|-------|---------|
| cdV | dec_bgn_caller_cdV.java | 40 | Combat, effets, monde |
| cdl | dec_bgn_caller_cdl.java | 24 | Inventaire, stockage |
| ccv | dec_bgn_caller_ccv.java | 72 | Client/UI (IDs bas 13-563) |
| INCONNU | ? | ? | HDV, equipement joueurs |

### Messages par handler

#### cdV (Combat/Monde) - 40 cases
| MsgID | Classe | Role |
|-------|--------|------|
| 12265 | cwj | Effet/action applique (combat) |
| 12292 | com | World dump (27KB) |
| 12830 | cok | ? |
| 12045 | ctg | ? |
| 12915 | cuj | ? |
| 13584 | cwk | ? |
| 13559 | cwl | ? |
| 12963 | ctt | Transaction? |
| 12027 | ctt | Transaction? |
| 13806 | cto | ? |
| 23923 | cyU | ? |
| 22953 | czo | ? |
| 12913 | cqJ | ? |
| 13065 | cos | ? |
| 12145 | cpm | ? |
| 12054 | cpj | ? |
| 15689 | ctE | Guild data (15KB) |
| 13150 | ctz | ? |
| 12880 | cox | ? |
| 12614 | cow | ? |
| 13416 | ctj | ? |
| 13441 | cvm | ? |
| 23341 | cvl | ? |
| 12591 | czm | ? |
| 12991 | cop | ? |
| 12632 | cpi | ? |
| 13878 | cvs | ? |
| 13934 | cpk | ? |
| 13434 | cwg | ? |
| 12953 | cqw | ? |
| 13495 | cqw | ? |

#### cdl (Inventaire) - 24 cases
| MsgID | Classe | Role |
|-------|--------|------|
| 12125 | csn | Inventaire complet (1106B) |
| 13742 | csB | ? |
| 12056 | csm | ? |
| 13003 | cso | ? |
| 12177 | csr | ? |
| 12380 | css | ? |
| 15997 | cyk | ? |
| 15387 | cyn | ? |
| 15313 | cyl | ? |
| 12918 | csp | ? |
| 13804 | csf | ? |
| 13548 | cse | ? |
| 13426 | csv | ? |
| 13874 | csg | ? |
| 13298 | csi | ? |
| 12792 | csh | ? |
| 13608 | cst | ? |
| 13000 | csw | ? |
| 13997 | csX | ? |
| 12690 | csY | ? |
| 12808 | csV | ? |
| 12940 | csT | ? |
| 13601 | csx | ? |
| 12744 | csW | ? |

#### SANS HANDLER CONNU
| MsgID | Classe | Parent | Role suppose |
|-------|--------|--------|-------------|
| 13668 | cru | Nr | Items equipes joueurs zone |
| 13928 | coR | Nr | Reponse HDV (contient coS[]) |
| 13327 | crv | Nr | ? |
| 13500 | crw | Nr | ? |
| 12860 | crx | Nr | ? |
| 13853 | crz | Nr | ? |
| 12041 | crs | Nr | ? |
| 12036 | crt | Nr | ? |
| 14941 | crA | Nr | ? |
| 12058 | crB | Nr | ? |
| 12801 | csq | Nr | ? |
| 13419 | cqv | cqf | Detail item? |

### Classes de donnees decompilees
| Classe | Parent | Champs | Role |
|--------|--------|--------|------|
| cwj | cwi->Nr | mfZ(int actionId), hvy(byte[]), mga(bool), mkP(bool), mkQ(list) | Message effet combat |
| cru | Nr | mgi(byte[]) | Blob items equipes |
| coS | - | mdw(byte type), mdx(long id), mdy(byte[]) | Offre HDV individuelle |
| coR | Nr | mdu(bool), mdv(coS[]) | Reponse HDV liste offres |
| iM | GeneratedMessageV3 | 13 champs protobuf (LV,Qq,Qs,getValue,Qt,Qw,Qy,QA,QD,QF...) | Payload effet CWJ |
| ii | ? | 23 champs protobuf (wP,wR,wT,wV,wX,mj,xc...) | Sous-message de iM |
| eNg | VC<eRO> | actionId(n), eRO, VD, stateId(qWm), description(qWl) | Definition d'effet |
| eNf | - | 316 constantes eNg statiques | Registre effets complet |
| eRO | QD | mfB(int, -1 default) | StateRunningEffect |
| QD | - | dr(byte[])→iM.bf() | RunningEffect base |
| bgG | - | TLongObjectHashMap<bgy> icQ | Registre PERSONNAGES (pas effets!) |
| bgJ | bYT | bop() appelle bgG.dlO() | Wrapper comptage/vote |
| zP | AbstractParser<zO> | jK(CodedInputStream) | Parser protobuf pour iM |

### CDN Wakfu
- Base URL: https://wakfu.cdn.ankama.com/gamedata/1.91.1.53/
- items.json: 8324 items (DISPONIBLE)
- actions.json: 71 actions (DISPONIBLE) - action 304 = "Applique un etat"
- states.json: 290 etats, IDs 751-9078 (DISPONIBLE, INCOMPLET)
- effects.json: 403 FORBIDDEN
- Fichiers telecharges locaux: cdn_items.json, cdn_actions.json, cdn_states.json, cdn_sublimations_catalog.json, effect_to_state_mapping.json, equipmentItemTypes.json, itemProperties.json, recipeCategories.json, itemTypes.json

### Donnees extraites
- effect_to_state_mapping.json: 575 effets actionId=304, plage effectId 65964-408301
- cdn_sublimations_catalog.json: 467 parchemins, 232 sublimations uniques
- Parchemins: itemTypeId=812, actionId=304, params=[stateId,0,rang,0,-1,0]

### Messages reseau captures (log 45003 lignes, 85 types)
| Type | Count | Payload | Role |
|------|-------|---------|------|
| coe | 5968 | pas de byte[] | Mouvement entites (BRUIT) |
| coY | 1726 | 1263B | Categories HDV |
| conn | 1710 | - | Connexions |
| cwj | 356 | 101-173B protobuf | Actions/effets combat |
| coR | 1454 | Java objects coS[] | Reponses HDV |
| cya | 364 | - | Modifications guilde |
| coy | 4868 | 175-1263B | Offres HDV individuelles |
| cru | 96 | 163-2317B | Items equipes joueurs |
| csn | 4 | 1106B | Inventaire (handler cdl) |
| cqv | 354 | 1498B | Detail item? |

### Faux positifs documentes
1. **Abandon III dans CSN**: 0x1B (index 27) + 0x14 (separateur) = 0x1B14 = 6932 par coincidence
2. **bgG = registre personnages**, PAS d'effets (CharacterInfo/bgy)
3. **F3 CWJ304 = ID runtime interne**, pas un CDN effectId (0/9 match)
4. **stateIds dans CRU (6815,8367,5078)**: PROBABLEMENT des timestamps tronques, a verifier
5. **F8.F11 dans CWJ**: pas un stateId (valeurs 398-5796, aucun match catalogue)
6. **coY = categories HDV**, pas des offres individuelles

### Constantes CWJ mfZ=304
- F3: 9 valeurs uniques (45980,97794,111781,111783,144984,144985,269995,270833,271019)
- F8.F11: (981,1411,5735,398,5796,1212,1206,1916,1915)
- F1/F2: timestamps, F5: coords, F6/F7: playerIds, F10: constant

### bdata (C:\Users\Smedj\AppData\Local\Ankama\Wakfu\contents\bdata)
- data.bdat: 1079KB (format texte, separateurs | et ~)
- indexes.bdat: 64KB (index cle-valeur: id, is_challenge)
- JARs: chacun contient un .bin (68.bin=18MB, 35.bin=1.6MB, etc.)
- Headers .bin: format binaire custom (prefix 0x?z??)

### Fichiers projet
- Agent: H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar
- Logs: H:\Code\Wakfuassistant\agent\logs\wakfu_messages.log
- Decompiled: H:\Code\Wakfuassistant\docs\RND\decompiled\
- Data: H:\Code\Wakfuassistant\docs\RND\data\
- Runs: H:\Code\Wakfuassistant\agent\logs\runs\RUN_20260321_175522\

## CRU PARSE TENTATIVE (2026-03-21 19:28)
- version=1, count=15 (15 entries = 15 items equipes?)
- Format: Java standard BE (readInt/readShort/readLong/readUTF)
- sipush 13668 = 0 hits -> constante encodee via ldc/constant pool
- 18979 classes, handler introuvable par scan bytecode

## CLASSES ITEM DECOMPILEES (2026-03-21 19:32)
- bhi: item client-side (ne devrait pas etre serialise), champ rr ifW
- Yd: abstract, a(int,ByteBuffer) = serialiseur items
- Yb: retour de Yd.a()
- cfG, cjE, clL: petites classes avec refs itemReferenceId/equipmentSlot

## CLASSES ITEM DECOMPILEES (2026-03-21 19:32)
- bhi: item client-side (ne devrait pas etre serialise), champ rr ifW
- Yd: abstract, a(int,ByteBuffer) = serialiseur items
- Yb: retour de Yd.a()
- cfG, cjE, clL: petites classes avec refs itemReferenceId/equipmentSlot
