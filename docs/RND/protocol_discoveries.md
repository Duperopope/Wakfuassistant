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
