# Protocol Discoveries - Wakfu Network Reverse Engineering
> Updated: 2026-03-21 18:38:58
> VERITES CONFIRMEES PAR DECOMPILATION

## Chaine de deserialisation CWJ (CONFIRMEE)
1. Reseau -> cwj.dn(byte[]) deserialise le message
2. cwj.mfZ = actionId (304=sublimation)
3. cwj.hvy = payload protobuf (byte[short])
4. Handler cdV.java appelle eNf.fBb().pU(mfZ) pour lookup effet
5. Puis eRO.dr(hvy) -> QD.dr(byte[]) -> iM.bf(byte[])
6. iM.bf() = zP.parseFrom(byArray) = PROTOBUF GOOGLE STANDARD
7. iM extends zP (classe protobuf generee)

## Classe cwj (decompilee, id=12265)
- mfZ (int) = actionId
- hvy (byte[short]) = payload protobuf
- mga, mkP = booleans
- mkQ = ArrayList<azy<int,int,long>> triplets
- ezG()=mfZ, ezH()=hvy

## Classe eNg (registre effets)
- eNg(actionId, eRO, VD, stateId, description, QF)
- qWm = stateId accessible via cbt()
- 304 = generique, stateId vient du parchemin

## Classe iM (protobuf hvy) - extends zP
- iM.bf(byte[]) = zP.parseFrom(byArray)
- Champs protobuf (wire tags du switch/case):
  F1(8)=long LV(), F2(16)=long Qq(), F3(24)=int Qs()
  F4(32)=int getValue() [NON-OBFUSQUE!]
  F5(42)=msg im Qt(), F6(48)=long Qw(), F7(56)=long Qy()
  F8(66)=msg ii QA(), F9(72)=int QD(), F10(80)=long QF()
  F11(90)=msg, F12(98)=msg, F13(106)=msg
- Seul 1 champ prive: byte Y = -1
- Tout le reste est dans zP (parent)

## Donnees CWJ mfZ=304 decodees
- F1/F2: IDs uniques (varient)
- F3: Qs() = 9 valeurs uniques (97794, 45980, etc.)
- F4: getValue() = 0 pour tous les 304
- F6/F7: player_id
- F8: sous-msg ii avec F11=1411 constant
- F10: 92536832 constant

## FAUX POSITIFS (NE PLUS REPETER)
- Abandon III dans CSN = concatenation index+champ
- CSN = blocs 24B, pas de sublimations
- coY = categories HDV
- CSA = joueur proche
- F3/16 matches = coincidence

## PROCHAINE ETAPE
- Decompiler zP pour voir les vrais champs protobuf
- Le stateId est probablement dans F3 (Qs) ou F8 (ii)

## Heritage iM: iM -> GeneratedMessageV3 -> AbstractParser -> ...

## VERITE: Heritage protobuf
- iM extends GeneratedMessageV3 (Google protobuf)
- zP extends AbstractParser<zO> -> parse vers zO
- zO est probablement iM ou son inner class
- Les champs sont DANS iM (pas dans un parent Wakfu)
- GeneratedMessageV3 et AbstractParser = lib Google (pas dans JAR)

## VERITE: Mapping complet iM protobuf (13 champs)
| F# | Wire | Type | Variable | Getter | Donnees mfZ=304 |
|-----|------|------|----------|--------|-----------------|
| F1 | 8 | int64 | wX | LV() | 342699505 (id unique) |
| F2 | 16 | int64 | zs | Qq() | =F1 |
| F3 | 24 | int32 | zu | Qs() | 97794 (9 valeurs uniques) |
| F4 | 32 | int32 | wR | getValue() [NON-OBF] | 0 |
| F5 | 42 | msg im | zx | Qt() | coords x/y/z |
| F6 | 48 | int64 | zz | Qw() | 3111456 (player_id) |
| F7 | 56 | int64 | zB | Qy() | =F6 |
| F8 | 66 | msg ii | zD | QA() | sous-msg, F11=1411 |
| F9 | 72 | int32 | zF | QD() | 1 |
| F10 | 80 | int64 | zH | QF() | 92536832 |
| F11 | 90 | msg iA | zJ | Py() | metadata |
| F12 | 98 | msg iQ | zL | RM() | sous-msg |
| F13 | 106 | msg iq | zN | OA() | zeros |

## Heritage confirme
- iM extends GeneratedMessageV3 (Google protobuf)
- zO extends GeneratedMessageV3 (builder?)
- zP extends AbstractParser<zO> (parser)
- Sous-messages: im (F5), ii (F8), iA (F11), iQ (F12), iq (F13)

## Sous-message ii (F8 de iM) - 23 champs
- getValue() [NON-OBF] = wR (int32, wire 80)
- LR() = wT (int32), LT() = wV (int32)
- LV() = wX (int64), tL() = mj (int32)
- Ma() = xc (int32), Mg() = xi (int32), Mi() = xk (int32)
- Wire tag 304 present dans ii! (field 38, varint)
- Nos donnees: F8 contenait F11=1411, F14=1
  F11 wire=88 -> readInt32 -> mj via tL()?
  F14 wire=112 -> readInt32

## VERITE: QD.dr(byte[])
1. iM iM2 = iM.bf(byArray) -> parse protobuf
2. this.d(iM2) -> appelle d(iM) avec le message parse
3. return iM2
-> La logique est dans QD.d(iM) ou une override dans eRO

## VERITE: QD.d(iM) - deserialisation complete
Mapping iM protobuf -> champs QD/eRO:
- F1 LV() -> di(long) = set unique id
- F2 Qq() -> bgL = second id
- F3 Qs() -> bgJ.bac().oy(F3) = LOOKUP EFFET GENERIQUE
  Si null: 'generic effect unknown: F3'
  Resultat stocke dans bgC
- F4 getValue() -> aQL = VALEUR de l'effet
- F5 Qt() -> bgG position (x,y,z)
- F6 Qw() -> dk(long) = source entity id
- F7 Qy() -> dj(long) = target entity id
- F8 ii via QD()/QF() -> f(int,long)
- F9/F10: via QC()/QD()/QE()/QF()

## CONCLUSION PARTIELLE
F3 (Qs) = ID effet generique (97794, 45980, etc.)
Ce n'est PAS le stateId CDN directement
C'est un ID dans le registre bgJ.bac().oy()
Le mapping ID_effet -> stateId est charge au runtime
Les 9 valeurs F3 uniques = 9 types d'effets differents

## Valeurs F3 connues pour mfZ=304
97794, 45980, 111781, 111783, 144984, 144985, 269995, 270833, 271019

## Recherche F3 dans CDN effects: en cours

## VERITE: Structure effet CDN
- effect.definition.id = effectId unique (ex: 241072)
- effect.definition.actionId = 304 (sublimation)
- effect.definition.params[0] = stateId (ex: 5082=Robuste)
- params = [stateId, 0, rang, 0, -1, 0]
- F3 (Qs) dans protobuf = probablement effectId

## F3 != effectId CDN (confirme)
- 575 effectIds CDN (plage 65964-408301)
- 9 F3 values (45980-271019): aucun match
- F3 = ID registre runtime (bgJ.bac().oy())

## DECOUVERTE: F8.F11 (ii) = candidat stateId
F14=1 toujours, F11 varie par F3

## VERITE: F8.F11 != stateId (aucun match)
9 paires F3/F11 confirmees, F11 constant par F3
Ni F3 ni F11 ne matchent le catalogue ou CDN states

## CONCLUSION: stateId resolve cote client
- F3 (Qs) = ID effet generique dans registre bgJ.bac()
- Le registre est charge depuis bdata au demarrage
- Le stateId n'est PAS dans le message reseau
- Il faut extraire le mapping F3->stateId depuis bdata
- OU chercher un autre endpoint CDN qui contient ce mapping

## CDN EFFECTS: BLOQUES (403)
- Tous les fichiers d'effets CDN renvoient 403
- effects.json, runningEffects.json, genericEffects.json: INACCESSIBLES
- Le mapping effectId -> stateId n'est PAS disponible via CDN

## CONCLUSION: SOURCE DES DONNEES
- F3 (CWJ304) = effectId interne runtime (pas CDN)
- F11 (sous-message ii) = contexte, pas stateId
- Le stateId est resolu client-side via bgJ.bac().oy(F3)
- Source: bdata/ (data.bdat + indexes.bdat + JARs)
- Alternative: decompiler bgJ pour comprendre le registre

## BDATA STRUCTURE (2026-03-21 18:56)
- bgJ extends bYT, appelle bgG.dlO() (vrai registre)
- bgG = registre d'effets principal via TLongObjectProcedure
- JARs bdata contiennent chacun un .bin (68.bin=18MB, 35.bin=1.6MB)
- indexes.bdat = index cle-valeur (id, is_challenge, etc.)
- data.bdat = format texte avec separateurs | et ~

## CORRECTION bgG/bgJ (2026-03-21 18:57)
- bgG = registre PERSONNAGES (CharacterInfo/bgy), PAS d'effets
- bgJ/bYT = systeme de vote/comptage (builds populaires)
- Le registre d'effets est dans eNf (constantes statiques eNg)
- eNg(actionId, eRO, VD, stateId, description, QF)
- Action 304 est generique, pas dans les constantes eNg

## VERITE: eNf ACTION 304 (2026-03-21 18:58)
- Action 304 = 'State : Applique un etat' (stateId generique = 1015)
- eNg(304, eOr, qPA, 1015, desc, QF.bhD)
- Le VRAI stateId est dans params[0] du CDN items.json
- Exemple: Robuste effectId=241072, params=[5082,0,1,0,-1,0] -> stateId=5082
- F3 dans CWJ304 = effectId runtime (pas le CDN effectDefinition.id)
- Mapping effect_to_state_mapping.json cree

## PIVOT STRATEGIE (2026-03-21 19:01)
- F3 (CWJ304) = ID runtime interne, INTROUVABLE dans le CDN
- 0/9 match direct, 0/9 match arithmetique
- CDN effectIds range: 65964-408301 (575 uniques)
- F3 range: 45980-271019 (9 uniques) - overlap de range mais pas de match
- ABANDON de la piste CWJ pour les sublimations
- NOUVELLE APPROCHE: decoder CRU (items equipes) et coR/coS (offres HDV)
- Les instances d'items contiennent directement leurs effets avec stateId

## CRU = ITEMS EQUIPES - SUBLIMATIONS TROUVEES (2026-03-21 19:02)
- CRU byte[2317] = format binaire CUSTOM Wakfu (PAS protobuf)
- Contient noms de personnages en ASCII (longueur-prefixee)
- Header: 4x int32 BE (version, count, ...)
- stateIds trouves en int16 BE: 2636(Plastron Tourmente), 5078(Fracass'carapace), 6815(Wakfu Berserk II), 8367(Arrogance)
- Nouvelle approche: parser le format custom pour extraire tous les stateIds par joueur

## CRU STRUCTURE BINAIRE (2026-03-21 19:06)
- Header: int32[4] = version(1), itemCount(15), unknown(70), unknown(4736)
- Noms de persos repetes ~3x par item (proprietaire, createur, ?)
- Blocs: 31B=item simple, 67B=item+1effet, 103B=item+2effets
- Formula: 31 + 36*n bytes (n=nombre effets)
- stateIds en int16 BE dans le payload
- Sublims confirmees: Wakfu Berserk II(6815), Arrogance(8367), Fracass'carapace(5078)

## CRU FORMAT DECODE COMPLET (2026-03-21 19:07)
- Chaque entry: [stateId:int16BE] [flag:1B] [nameLen:1B] [name:UTF8] [00 00] [itemId:int16BE] [padding] [regionId] [timestamp]
- stateId a offset -3 avant nameLen
- flag byte a offset -1 avant nameLen (0x10, 0x28, 0x38 = rang ou type)
- itemId dans les 2 bytes apres [00 00] post-nom
- Sublimations confirmees dans CRU: Wakfu Berserk II(6815), Arrogance(8367), Fracass'carapace(5078)

## CORRECTION CRU (2026-03-21 19:09)
- Les 'stateIds' trouves precedemment sont probablement des TIMESTAMPS tronques
- Les bytes avant le nom font partie d'un int64 timestamp (pattern 00 01 9C xx xx xx xx)
- Les itemIds (3329, 4738, etc.) sont vrais et verifiables dans le CDN
- NECESSITE: decompiler cru.class pour connaitre le vrai format
- FAUX POSITIFS PROBABLES: Wakfu Berserk II(6815), Arrogance(8367), Fracass'carapace(5078)

## CRU = WRAPPER OPAQUE (2026-03-21 19:10)
- cru.class contient UN seul champ: byte[] mgi
- ezW() retourne mgi (le blob binaire brut)
- Les 'itemIds' 3329,4738,etc ne sont PAS des CDN item IDs (instances uniques)
- Le vrai decodage est dans le handler qui appelle cru.ezW()
- Besoin: trouver qui deserialise mgi et extraire la structure
