# GUIDE DE RECONSTRUCTION COMPLET — Character, Inventaire & Coffre de Compte
# Date: 2026-03-24
# Auteur: Sam + Claude (sessions completes)
# Projet: Wakfu Assistant
# Repo: https://github.com/Duperopope/Wakfuassistant

---

# TABLE DES MATIERES

1. ARCHITECTURE GLOBALE DE L'AGENT
2. SYSTEME 1 : CHARACTER EXTRACTOR (Personnage)
3. SYSTEME 2 : ACCOUNT CHEST (Coffre de compte)
4. SYSTEME 3 : UNIVERSAL SNIFFER (Messages reseau)
5. SYSTEME 4 : HDV / MARCHE (CmyDnAdvice + ChannelReadAdvice)
6. SYSTEME 5 : KAMAS
7. HOOKS OBSOLETES (historique)
8. CLASSES UTILITAIRES
9. CONFIGURATION MAVEN ET BUILD
10. ENREGISTREMENT DES HOOKS (WakfuSpyAgent.java)
11. FICHIERS DE SORTIE COMPLETS
12. REGLES BYTEBUDDY CRITIQUES
13. METHODOLOGIE DE RECHERCHE DANS LE CODE DECOMPILE
14. GUIDE DE REPRISE RAPIDE

---

# 1. ARCHITECTURE GLOBALE DE L'AGENT

## 1.1 Vue d'ensemble

L'agent est un JAR Java injecte via -javaagent dans le client Wakfu.
Il utilise ByteBuddy pour intercepter des methodes du client a runtime.
Toutes les donnees sont ecrites en fichiers JSON/LOG sur disque.

Point d'entree : WakfuSpyAgent.premain(String, Instrumentation)
Le JAR est un fat-jar (shade plugin) contenant ByteBuddy 1.15.11.

## 1.2 Liste des fichiers Java dans le JAR

Fichier                         | Lignes | Role                              | Statut
--------------------------------|--------|-----------------------------------|--------
WakfuSpyAgent.java              | ~450   | Point d'entree, tous les hooks    | ACTIF
CharacterExtractorAdvice.java   | ~220   | Extraction personnage as(byte[])  | ACTIF v3
AccountChestAdvice.java         | ~250   | Coffre de compte cSb.f()          | ACTIF v2
UniversalSnifferAdvice.java     | ~100   | Sniffer S2C dn(byte[])->boolean   | ACTIF v2
ChannelReadAdvice.java          | ~300   | Netty channelRead0 (pipeline)     | ACTIF
CmyDnAdvice.java                | ~100   | HDV protobuf cmy.dn(byte[])       | ACTIF
KamasAdvice.java                | ~50    | Kamas ctu.dn(byte[])              | ACTIF
PipelineAdvice.java             | ~80    | Handlers pipeline secondaires     | ACTIF
ItemLogWriter.java              | ~60    | Utilitaire ecriture items         | ACTIF
CraftPassiveReader.java         | ~190   | Lecture passive metiers (timer)   | ACTIF V4
CraftAdvice.java                | ~160   | Ancien hook craft V3 (INUTILISE)  | MORT
CharacterAdvice.java            | ~200   | Ancien hook cph.dn (OBSOLETE)     | MORT
CharacterDeserializeAdvice.java | ~150   | Ancien hook as(byte[]) v1         | MORT
CharacterLevelAdvice.java       | ~150   | Ancien hook bgT.OC(int)           | MORT

## 1.3 Phases d'initialisation (WakfuSpyAgent.init)

Phase 1 : DiscoveryTransformer (ClassFileTransformer passif)
  - Enregistre toutes les classes chargees par la JVM
  - Log les classes interessantes (noms courts, mots-cles reseau/items)
  - Ne modifie aucune classe

Phase 2 : ByteBuddy installByteBuddy(inst)
  - Hook Netty : aDj.channelRead0 → ChannelReadAdvice
  - Hook Pipeline : aXh/aXi/aXj/aXl/aXm/aXn → PipelineAdvice
  - Hook HDV : cmy.dn(byte[]) → CmyDnAdvice
  - Hook Kamas : ctu.dn(byte[]) → KamasAdvice
  - Hook Character ancien : cph/cPh/cPH.dn(byte[]) → CharacterAdvice
  - Hook Sniffer universel : toute classe avec dn(byte[])->boolean → UniversalSnifferAdvice
  - Hook Deserialize : bgT/bgy/exP/bhJ.as(byte[]) → CharacterExtractorAdvice
  - Hook Chest : cSb.f(1 arg) → AccountChestAdvice
  - Craft V4 : CraftPassiveReader.startPassiveCapture() (PAS un hook)

Phase 3 : RuntimeScanner (thread daemon)
  - Attend 15s puis documente les classes cibles chargees
  - Cherche aussi les classes avec "market", "hdv", "exchange", etc.

---

# 2. SYSTEME 1 : CHARACTER EXTRACTOR

## 2.1 Ce que ca capture

Toutes les donnees du personnage apres deserialization :
- name, level, breedId, breedName, sex, entityId
- kamas (via fyF() — BUGGED, retourne souvent -1 sur bgT)
- equipment (Map slot->itemId via champ iiN)
- guild (nom, id, membres via champ ija)
- inventory handler (via champ ieT)
- bag container (via champ ieV)
- spells (via champ ift)
- builds (via champ hUL)
- active effects count (via champ ifg)

## 2.2 Hook ByteBuddy

Cible : classes bgT, bgy, exP, bhJ, et toutes les sous-classes de bgy
Methode : as(byte[]) — void, pas de retour
Timing : OnMethodExit (apres deserialization complete)
Filtre : dataSize >= 1000 bytes (elimine le bruit)

Enregistrement dans WakfuSpyAgent.java :
    new AgentBuilder.Default()
        .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
        .disableClassFormatChanges()
        .type(ElementMatchers.named("bgT")
            .or(ElementMatchers.named("bgy"))
            .or(ElementMatchers.named("exP"))
            .or(ElementMatchers.named("bhJ"))
            .or(ElementMatchers.hasSuperType(ElementMatchers.named("bgy")))
        )
        .transform((deserBuilder, typeDescription, classLoader, module, protectionDomain) ->
            deserBuilder.visit(
                Advice.to(CharacterExtractorAdvice.class)
                    .on(ElementMatchers.named("as")
                        .and(ElementMatchers.takesArguments(byte[].class))
                        .and(ElementMatchers.returns(void.class))
                    )
            )
        )
        .installOn(inst);

## 2.3 Chaine de deserialization Wakfu

Serveur envoie : message com (msgId 12292) avec payload ~29 KB
  → cdV handler L280-300
  → bgT.as(byte[]) = bgt_0.as()
  → bgy.as() L1657
  → exP.as() L1009
  → bgT.OC(int level) stocke le niveau dans champ ijf

## 2.4 Classes JVM impliquees

Decompile  | JVM  | Taille  | Role
-----------|------|---------|-----
bgt_0      | bgT  | 55 316  | Joueur local (LocalPlayer)
bgy        | bgy  | 56 288  | Classe abstraite parente (CharacterInfo)
exP        | exP  | 57 676  | Sous-systeme de donnees perso
bhJ        | bhJ  | 51 026  | Joueur distant (RemotePlayer)

## 2.5 Methodes et champs accedes par reflection

Methodes (remontee dans la hierarchie avec getSuperclass) :
- dnE()    → short  : niveau du personnage (champ ijf)
- getName()→ String : nom du personnage
- Sn()     → long   : entityId unique
- doV()    → Object : breed object, puis .aWP() → short breedId
- aWO()    → byte   : sexe (0=male, 1=femelle)
- fyF()    → long   : kamas (BUGGED sur bgT)

Champs (remontee dans la hierarchie) :
- iiN  : HashMap<Integer, Integer> — slot equipement → itemId
- ija  : Object (guild) — getId(), getName(), getMembers()
- ieT  : Object (InventoryHandler) — toString() pour inventaires
- ieV  : Object (BagContainer/bdl_0) — toString() pour sacs
- ift  : Object (SpellDeckSet) — sorts actifs/passifs par deck
- hUL  : Object (BuildSheetSet) — builds sauvegardes
- ifg  : Map<?,?> — effets actifs (RunningEffects)
- ciZ  : int — breedId (fallback si doV() echoue)

## 2.6 Mapping breedId → Classe

ID | Classe      | ID | Classe
---|-------------|----|-----------
1  | Feca        | 10 | Sadida
2  | Osamodas    | 11 | Sacrieur
3  | Enutrof     | 12 | Pandawa
4  | Sram        | 13 | Roublard
5  | Xelor       | 14 | Zobal
6  | Ecaflip     | 15 | Steamer
7  | Eniripsa    | 16 | Eliotrope
8  | Iop         | 17 | Huppermage
9  | Cra         | 18 | Ouginak

## 2.7 Sortie JSON

Fichier : H:\Code\Wakfuassistant\logs\character_{entityId}.json
Ecrase a chaque deserialization (false = pas d'append).

Format :
{
  "timestamp": "2026-03-24T12:00:00.000",
  "type": "LOCAL_PLAYER" ou "REMOTE_PLAYER",
  "entityId": 3111456,
  "name": "L'Immortel",
  "level": 191,
  "breedId": 4,
  "breedName": "Sram",
  "sex": 0,
  "kamas": -1,
  "dataSize": 29790,
  "equipment": "{0=22735, 3=26810, ...}",
  "guild": "Make Sufo Great Again (id=21122, 236 membres)",
  "inventory": "InventoryHandler{m_inventories=2}...",
  "bags": "...",
  "activeEffects": 5,
  "spells": "...",
  "builds": "..."
}

Note : equipment, guild, inventory, bags, spells, builds sont des toString()
bruts, pas du JSON structure. Les strings sont echappees (\\, \", \n).
inventory et bags sont tronques a 800 chars, spells et builds a 500 chars.

Fichier log chronologique : H:\Code\Wakfuassistant\logs\character_data.log
(append, une ligne par capture)

## 2.8 Bugs connus

- kamas retourne -1 via fyF() sur bgT (la methode n'est pas trouvee 
  dans la hierarchie ou retourne une valeur non initialisee)
- equipment est un HashMap.toString(), pas du JSON parseable directement
- les noms d'items ne sont pas resolus (juste les IDs)
- inventory/bags sont des toString() opaques, pas structures

## 2.9 Comment on a trouve ces classes

1. Cherche "as(byte[])" dans le code decompile
2. Trouve dans bgy.java L1657 (classe abstraite)
3. Identifie bgT comme sous-classe (joueur local)
4. Le sniffer universel a capture le msgId 12292 (29 KB payload)
5. Trace dans cdV (handler de ce message) → appelle bgT.as()
6. Teste differents getters (dnE, getName, Sn, doV) par reflection
7. Explore les champs (iiN, ija, ieT, etc.) un par un

---

# 3. SYSTEME 2 : ACCOUNT CHEST (Coffre de compte)

## 3.1 Ce que ca capture

Le contenu de chaque compartiment du coffre de compte quand le
joueur le selectionne dans l'interface du coffre.

Pour chaque compartiment :
- id, nom, isReadOnly, capacite
- itemCount, emptySlots
- Pour chaque item : itemId, name (i18n), quantity, maxStack, uniqueId

## 3.2 Hook ByteBuddy

Cible : classe JVM "cSb" (decompile : csb_1.java, 616 lignes)
Methode : f (prenant 1 argument — c'est f(lx_0) = protobuf compartiment)
Timing : OnMethodExit (suppress = Throwable.class)

PARTICULARITE : cSb est une classe UI chargee UNIQUEMENT quand le
joueur ouvre le coffre de compte. Elle n'apparait PAS dans les
DISCOVERY logs. Le hook utilise RETRANSFORMATION + disableClassFormatChanges
pour la capturer au moment du chargement dynamique.

Enregistrement dans WakfuSpyAgent.java :
    new AgentBuilder.Default()
        .disableClassFormatChanges()
        .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
        .type(ElementMatchers.named("cSb"))
        .transform((chestBuilder, typeDescription, classLoader, module, protectionDomain) ->
            chestBuilder.visit(
                Advice.to(AccountChestAdvice.class)
                    .on(ElementMatchers.named("f")
                        .and(ElementMatchers.takesArguments(1)))
            )
        )
        .installOn(inst);

## 3.3 Architecture du coffre dans le code Wakfu

csb_1 (JVM: cSb) — UI handler du coffre de compte
  Champs :
    nEE : bky_1 (bKy) — vue du contenu du compartiment selectionne
    nED : bkx_1 (bKX) — liste des compartiments
  Methodes :
    d(lt_1) — recoit la liste des compartiments a l'ouverture
    f(lx_0) — recoit le contenu d'un compartiment selectionne ← HOOK

lt_1 (JVM: lT) — protobuf liste de compartiments
  abl() → List<lx_0>

lx_0 (JVM: lX) — protobuf un compartiment
  ajm() → String id
  getName() → String nom
  ajo() → String couleur
  ajt() → int capacite
  ajr() → int utilise
  ajx() → ll_0 (items protobuf)
  ajv() → boolean readOnly

ejt_0 (JVM: eJt) — conteneur d'items
  Construit via ejt_0.a(ll_0, int capacity)
  fba() → LinkedList (liste d'items, null = slot vide)

ffV — un item (1064 lignes)
  avr() → int referenceItemId
  bfd() → short quantity
  bfe() → short maxStack
  LV()  → long uniqueId
  dah() → String searchName (minuscules, fallback)
  kYd   → long uniqueId (field)
  jQZ   → fhc_0 referenceItem

## 3.4 Resolution des noms d'items

L'Advice charge a chaque appel le fichier i18n :
    H:\Code\Wakfuassistant\docs\RND\data\i18n_items_fr.json

Ce fichier fait 704 KB et contient 24 004 items au format :
    {"itemId": "nomFrancais", ...}

Le parsing est fait manuellement (pas de lib JSON dans l'Advice)
avec un parser simple qui lit les paires cle:valeur du JSON.

Priorite de resolution du nom :
1. i18n_items_fr.json (par itemId)
2. Fallback : item.dah() (nom de recherche en minuscules)

## 3.5 Accumulation des compartiments

Chaque appel de f(lx_0) ne donne qu'UN compartiment.
L'Advice accumule tous les compartiments dans un seul JSON :

1. Lit le fichier account_chest_full.json existant
2. Parse les blocs de compartiments existants (par id)
3. Ajoute/remplace le compartiment courant
4. Reecrit le fichier complet avec tous les compartiments

Cela signifie qu'il faut cliquer sur CHAQUE compartiment dans
l'interface du coffre pour avoir le JSON complet.

## 3.6 Chaine d'acces aux donnees (reflection)

Etape 1 : self = instance de cSb
Etape 2 : Field "nEE" → contentView (bKy)
Etape 3 : contentView.getName() → nom compartiment
           contentView.getId() → id compartiment
           contentView.dtg() → isReadOnly
           contentView.ajt() → capacite
Etape 4 : Field "isE" dans contentView → itemContainer (eJt)
Etape 5 : itemContainer.fba() → LinkedList d'items (null = vide)
Etape 6 : Pour chaque item non-null :
           item.avr() → referenceItemId
           item.bfd() → quantity (short)
           item.LV()  → uniqueId (long)
           item.bfe() → maxStack (short)
           item.dah() → searchName (String, fallback)

## 3.7 Sortie JSON

Fichier principal : H:\Code\Wakfuassistant\logs\account_chest_full.json

{
  "lastUpdate": "2026-03-24T12:00:00.000",
  "totalCompartments": 15,
  "compartments": [
    {
      "id": "consommables",
      "name": "Consommables",
      "isReadOnly": false,
      "capacity": 100,
      "itemCount": 13,
      "emptySlots": 87,
      "items": [
        {"slot": 0, "itemId": 12345, "name": "Potion de soin", "quantity": 50, "maxStack": 999, "uniqueId": 123456789}
      ]
    }
  ],
  "totalItems": 1114,
  "totalCapacity": 1500
}

Fichier log : H:\Code\Wakfuassistant\logs\account_chest.log (append)
Erreurs : H:\Code\Wakfuassistant\logs\chest_hook_errors.log

## 3.8 Donnees capturees (joueur L'Immortel)

Compartiment       | Items | Capacite
-------------------|-------|--------
Consommables       | 13    | 100
Ressources 1       | 32    | 100
Ressources 2       | 96    | 100
Ressources 3       | 99    | 100
Ressources 4       | 98    | 100
Ressources 5       | 100   | 100
Ressources 6       | 100   | 100
Ressources 7       | 100   | 100
Ressources 8       | 100   | 100
Drop monstres 1    | 99    | 100
Drop monstres 2    | 22    | 100
Equipement Melee   | 38    | 100
Legendaires        | 34    | 100
Armes mythiques    | 96    | 100
Divers / Pets      | 87    | 100
TOTAL              | 1114  | 1500

## 3.9 Comment on a trouve ces classes

1. Cherche "accountChest", "coffre", "chest" dans le code decompile
2. Identifie bkd_2.java, bkz_1.java, cci_2.java comme candidats
3. Cherche les classes UI qui manipulent ces donnees
4. Trouve csb_1.java (cSb) comme handler UI du coffre
5. Le commentaire "Renamed from cSb" donne le nom JVM
6. Identifie la methode f(lx_0) comme point d'entree des compartiments
7. Explore le champ nEE (bKy) pour acceder aux items via isE (eJt)
8. Teste fba() pour obtenir la liste d'items
9. Verifie les getters avr(), bfd(), LV(), bfe() sur les items

## 3.10 Bugs connus et limitations

- Le fichier i18n (704 KB) est relu a CHAQUE appel du hook — pas de cache
  (impossible d'utiliser des champs statiques dans un Advice ByteBuddy)
- Le parser JSON est naif (split par guillemets) — peut casser si un nom
  d'item contient des guillemets echappees de maniere non standard
- Il faut cliquer manuellement sur chaque compartiment pour tout capturer
- Le JSON d'accumulation reparse le fichier complet a chaque compartiment
  (performance OK mais pas elegant)

---

# 4. SYSTEME 3 : UNIVERSAL SNIFFER

## 4.1 Ce que ca capture

TOUS les messages serveur→client (S2C) qui passent par la methode
dn(byte[]) → boolean. C'est le point d'entree de tous les messages
du protocole Wakfu.

## 4.2 Hook ByteBuddy

Cible : toute classe concrete (non-abstraite, non-interface) qui declare
une methode dn(byte[]) retournant boolean.

Enregistrement :
    new AgentBuilder.Default()
        .disableClassFormatChanges()
        .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
        .type(ElementMatchers.declaresMethod(
            ElementMatchers.named("dn")
                .and(ElementMatchers.takesArguments(byte[].class))
                .and(ElementMatchers.returns(boolean.class))
        ).and(ElementMatchers.not(ElementMatchers.isAbstract()))
         .and(ElementMatchers.not(ElementMatchers.isInterface())))
        .transform(...)
        .installOn(inst);

## 4.3 Donnees extraites par message

- msgId : via methode d() sur self (int)
- className : self.getClass().getSimpleName()
- fieldCount : nombre de champs non-null (remontee hierarchie)
- Chaque champ : nom=valeur (truncated a 60 chars)
  Types speciaux : byte[N], int[N], long[N], List[N], Map[N]

## 4.4 Sortie

Fichier principal : H:\Code\Wakfuassistant\logs\universal_sniffer.log
Messages riches (>5 champs ou contient Map) :
    H:\Code\Wakfuassistant\logs\sniffer_rich_messages.log
Erreurs : H:\Code\Wakfuassistant\logs\sniffer_errors.log

Format d'une ligne :
[HH:mm:ss.SSS] msgId=12292 class=com fields=15 :: champ1=val1 | champ2=val2 | ...

## 4.5 Messages S2C identifies

msgId | Classe JVM | Occurrences | Description
------|-----------|-------------|------------
12292 | com       | ~7x         | Character data (29 KB, dump complet personnage)
15689 | ctE       | rare        | Donnees supplementaires personnage
12461 | ?         | 2178x       | Tres frequent (position/mouvement?)
13341 | ?         | 536x        | Frequent
12522 | ?         | 554x        | Frequent
13408 | cvn       | 230x        | ?
15974 | cya       | 216x        | Guild updates (aDL=21122)
691   | NM        | 63x         | Chat messages
13327 | cmy       | 16x         | HDV data (parent sell/buy)
12602 | csR       | rare        | Liste des 5 personnages du compte
13251 | col_0     | rare        | Mise a jour stats (epe=statId, htM=valeur)
12675 | cPh       | 0x          | JAMAIS ENVOYE (fausse piste initiale)
12294 | clX       | rare        | HDV sell entries (protobuf)
13653 | clU       | rare        | HDV buy entries (protobuf)
13503 | ctu       | rare        | Kamas update

---

# 5. SYSTEME 4 : HDV / MARCHE

## 5.1 Deux hooks complementaires

A. ChannelReadAdvice — hook sur aDj.channelRead0 (handler Netty principal)
   Capture tous les messages Netty avec dump complet des champs.
   Route les messages co*/cq*/cs*/cl*/cr* vers le HDV log.
   Decode protobuf pour cru (builds) et csS (equipement).
   Inspecte les offres HDV dans crV via champ mgE (TLongObjectHashMap).

B. CmyDnAdvice — hook sur cmy.dn(byte[]) (parent HDV)
   Capture le protobuf brut des messages HDV (msgId 12294, 13653, 13503).
   Extrait status + protoLen + hex du payload protobuf.
   cmy est la classe parent de clX (sell) et clU (buy).

## 5.2 Structure HDV Wakfu

Board IDs : 31546, 31547 (Sufokia)
Protobuf sell : msgId 12294, classe clX → mg → mc entries
Protobuf buy  : msgId 13653, classe clU → mi_0 → mE entries

## 5.3 Sortie

H:\Code\Wakfuassistant\logs\market_v3.log (toutes les lignes HDV)
H:\Code\Wakfuassistant\logs\market_v3_proto.log (protobuf hex brut)
H:\Code\Wakfuassistant\agent\logs\wakfu_messages.log (tous les messages Netty)
H:\Code\Wakfuassistant\agent\logs\wakfu_hdv.log (messages HDV filtres)
H:\Code\Wakfuassistant\agent\logs\wakfu_hdv_offers.jsonl (offres inspectees)

## 5.4 Resultats POC

82 918 offres capturees avec succes en une session.

---

# 6. SYSTEME 5 : KAMAS

## 6.1 Hook

Cible : classe JVM "ctu"
Methode : dn(byte[])
MsgId : 13503

## 6.2 Decodage

rawBytes = 8 bytes BigEndian = solde kamas exact
Lecture : for (i=0..7) kamas = (kamas << 8) | (rawBytes[i] & 0xFF)

## 6.3 Bug connu

Le hook KamasAdvice fonctionne sur ctu.dn() mais le CharacterExtractorAdvice
ne peut pas lire les kamas via fyF() sur bgT. Le getter n'est pas trouve
dans la hierarchie de classes ou retourne -1.

La solution serait de combiner : utiliser le msgId 13503 pour les kamas
et le CharacterExtractorAdvice pour le reste.

---

# 7. HOOKS OBSOLETES

## 7.1 CharacterAdvice.java (cph.dn)

Ciblait la classe cPh (msgId 12675).
Probleme : ce message n'est JAMAIS envoye par le serveur.
La classe existe mais le serveur utilise le msgId 12292 (com) a la place.
Extraisait : characterId (aDh), level (jzC), breed (mdM enum eIg),
equipmentSheet (jzA → fhk avec soh Map et ejt short), 
spellDeck (jzG → frd avec eoY int, sXv/sXw lists),
bonusLevels (hOz → ehy_0 avec qua Map et quc short).
Utilise des methodes privees helpers (getField, getLongField, etc.)
→ VIOLATION des regles ByteBuddy (methodes privees interdites).

## 7.2 CharacterDeserializeAdvice.java (as(byte[]) v1)

Premier hook sur la deserialization. Extrait seulement :
level (dnE), name (getName), entityId (Sn), characterId (aDh),
et les 30 premiers champs non-statiques en toString().
Remplace par CharacterExtractorAdvice v3 qui extrait beaucoup plus.

## 7.3 CharacterLevelAdvice.java (bgT.OC(int))

Hook sur OC(int) dans bgT — la methode qui stocke le niveau.
Capture : characterId (aDh), entityId (Sn), name (getName),
levelParam (argument), storedLevel (dnE), et les 50 premiers champs.
Remplace par CharacterExtractorAdvice qui lit le niveau via dnE()
apres la deserialization complete.

---

# 8. CLASSES UTILITAIRES

## 8.1 ItemLogWriter.java

Utilitaire pour ecrire les items decodes.
Chemins : wakfu_items_decoded.jsonl et wakfu_items_summary.log
Methodes statiques :
- writeItem(String jsonLine) — ecriture thread-safe
- writeSummary(String summaryLine) — resume
- escapeJson(String s) — echappe les caracteres speciaux pour JSON
- bytesToHex(byte[] bytes) — conversion hex
Utilise un verrou statique (Object LOCK) pour le thread-safety.

## 8.2 PipelineAdvice.java

Hook leger pour les handlers pipeline secondaires (aXh, aXi, aXj, etc.)
OnMethodEnter, capture les champs primitifs/numeriques du message.
Ecrit dans wakfu_messages.log.

---

# 9. CONFIGURATION MAVEN ET BUILD

## 9.1 pom.xml

GroupId: com.wakfuassistant
ArtifactId: wakfu-spy-agent
Version: 1.0.0
Java source/target: 21
ByteBuddy version: 1.15.11

Dependances :
- net.bytebuddy:byte-buddy:1.15.11
- net.bytebuddy:byte-buddy-agent:1.15.11

Plugins :
- maven-compiler-plugin 3.13.0 (source/target 21)
- maven-jar-plugin 3.4.2 (manifest avec Premain-Class, Can-Redefine/Retransform)
- maven-shade-plugin 3.6.0 (fat-jar avec ByteBuddy inclus)

Manifest :
    Premain-Class: com.wakfuassistant.agent.WakfuSpyAgent
    Agent-Class: com.wakfuassistant.agent.WakfuSpyAgent
    Can-Redefine-Classes: true
    Can-Retransform-Classes: true
    Can-Set-Native-Method-Prefix: true

## 9.2 Commande de build

$mvnCmd = "C:\Users\Smedj\.m2\wrapper\dists\apache-maven-3.9.9-bin\33b4b2b4\apache-maven-3.9.9\bin\mvn.cmd"
$agentRoot = "H:\Code\Wakfuassistant\agent"
Push-Location $agentRoot
& $mvnCmd clean package
Pop-Location
Copy-Item "$agentRoot\target\wakfu-spy-agent-1.0.0.jar" "$agentRoot\wakfu-spy-agent.jar" -Force

ATTENTION : Ne pas utiliser mvnw.cmd (casse).
ATTENTION : Ne pas utiliser le flag -q (masque les erreurs).
ATTENTION : L'ancien chemin Maven 3.9.6 est obsolete, utiliser 3.9.9.
ATTENTION : Si erreur "variable builder already defined", renommer le lambda
parameter en nom unique (craftBuilder, chestBuilder, etc.)

## 9.3 JAR genere

Taille : ~8 690 KB (fat-jar avec ByteBuddy)
Contient : toutes les classes Advice + ByteBuddy + manifest agent

---

# 10. ENREGISTREMENT DES HOOKS (WakfuSpyAgent.java)

## 10.1 Structure du fichier

Le fichier fait ~450 lignes et contient :
- Constantes de chemins (LOG_DIR, SPY_LOG, MSG_LOG, HDV_LOG)
- Stats globales (AtomicInteger, ConcurrentHashMap)
- premain() et agentmain() → init()
- init() : cree les dossiers, lance les 3 phases
- installByteBuddy() : enregistre tous les hooks
- runtimeScan() : scanner de classes en background
- documentClass() : introspection d'une classe
- log(), logMessage(), logHdv() : utilitaires de log
- decodeProto() : decodeur protobuf generique
- parseProtoJson() : parser recursif protobuf → JSON
- inspectObject() : inspection profonde d'objets HDV
- DiscoveryTransformer : ClassFileTransformer passif

## 10.2 Ordre des hooks dans installByteBuddy()

1. AgentBuilder principal : aDj + aXh/aXi/aXj/aXl/aXm/aXn
2. cmy.dn(byte[]) → CmyDnAdvice (HDV) [1er enregistrement]
3. ctu.dn(byte[]) → KamasAdvice
4. cph/cPh/cPH.dn(byte[]) → CharacterAdvice
5. cmy.dn(byte[]) → CmyDnAdvice (HDV) [2e enregistrement — DOUBLON]
6. dn(byte[])->boolean universel → UniversalSnifferAdvice
7. bgT/bgy/exP/bhJ.as(byte[]) → CharacterExtractorAdvice
8. cSb.f(1 arg) → AccountChestAdvice
9. CraftPassiveReader.startPassiveCapture() (pas un hook)

NOTE : Le hook HDV sur cmy est enregistre 2 FOIS (doublon a nettoyer).
NOTE : Les blocs try/catch sont imbriques de maniere un peu chaotique 
       (le SNIFFER englobe le DESER et le CHEST).

---

# 11. FICHIERS DE SORTIE COMPLETS

## 11.1 Repertoire H:\Code\Wakfuassistant\logs\

Fichier                       | Source                  | Mode
------------------------------|-------------------------|-------
character_{entityId}.json     | CharacterExtractorAdvice| ecrase
character_data.log            | CharacterExtractorAdvice| append
account_chest_full.json       | AccountChestAdvice      | ecrase (accumule)
account_chest.log             | AccountChestAdvice      | append
universal_sniffer.log         | UniversalSnifferAdvice  | append
sniffer_rich_messages.log     | UniversalSnifferAdvice  | append
market_v3.log                 | CmyDnAdvice             | append
market_v3_proto.log           | CmyDnAdvice + KamasAdvice| append
craft_professions.json        | CraftPassiveReader      | ecrase
craft_professions.log         | CraftPassiveReader      | ecrase
craft_xp_history.log          | CraftPassiveReader V4.1 | append
extractor_errors.log          | CharacterExtractorAdvice| append
chest_hook_errors.log         | AccountChestAdvice      | append
sniffer_errors.log            | UniversalSnifferAdvice  | append
hdv_market.db                 | sync_hdv_to_sqlite.ps1  | SQLite
craft_economy.db              | BUILD_CRAFT_DATABASE_V2 | SQLite

## 11.2 Repertoire H:\Code\Wakfuassistant\agent\logs\

Fichier                       | Source                  | Mode
------------------------------|-------------------------|-------
wakfu_agent_spy.log           | WakfuSpyAgent + tous    | append
wakfu_messages.log            | ChannelReadAdvice       | append
wakfu_hdv.log                 | ChannelReadAdvice       | append
wakfu_hdv_offers.jsonl        | ChannelReadAdvice       | append
wakfu_items_decoded.jsonl      | ItemLogWriter           | append
wakfu_items_summary.log       | ItemLogWriter           | append

---

# 12. REGLES BYTEBUDDY CRITIQUES

## 12.1 Regles absolues pour les classes Advice

1. JAMAIS de methodes privees → IllegalAccessError au runtime
   (le code Advice est inline dans la classe cible)
   Exception : CharacterAdvice.java viole cette regle (helpers prives)
   mais fonctionne car il utilise @Advice.OnMethodExit pas OnMethodEnter
   
2. Tout le code inline dans @OnMethodExit ou @OnMethodEnter
   Pas de delegation vers d'autres methodes de la meme classe

3. Pas de champs statiques dans les Advice 
   (sauf ItemLogWriter qui est appele explicitement depuis ChannelReadAdvice,
   pas depuis un Advice inline)
   CmyDnAdvice et KamasAdvice utilisent des champs statiques pour les chemins
   → fonctionne car ce sont des constantes finales

4. Noms de classes completement qualifies pour les types JDK
   java.lang.reflect.Method, java.io.FileWriter, java.text.SimpleDateFormat

5. suppress = Throwable.class sur @OnMethodExit pour ne jamais crasher le jeu

6. Utiliser la reflection pour acceder aux champs/methodes obfusques
   Toujours remonter la hierarchie avec getSuperclass()

7. OnMethodExit prefere a OnMethodEnter quand on veut lire les champs
   (les donnees sont remplies apres l'execution de la methode)

8. Les noms JVM sont CASE SENSITIVE
   bgt_0 → bgT (pas bgt, pas BGT)

## 12.2 Pattern standard Advice

public class MonAdvice {
    @Advice.OnMethodExit(suppress = Throwable.class)
    public static void onExit(@Advice.This Object self) {
        try {
            // Remontee hierarchie pour trouver un champ
            Class<?> c = self.getClass();
            java.lang.reflect.Field f = null;
            while (c != null && f == null) {
                try { f = c.getDeclaredField("monChamp"); }
                catch (NoSuchFieldException e) { c = c.getSuperclass(); }
            }
            if (f == null) return;
            f.setAccessible(true);
            Object val = f.get(self);
            // ... traitement ...
        } catch (Throwable t) {
            // log error dans fichier
        }
    }
}

## 12.3 Pattern standard enregistrement hook

try {
    new AgentBuilder.Default()
        .disableClassFormatChanges()
        .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
        .type(ElementMatchers.named("NomClasseJVM"))
        .transform((myBuilder, typeDesc, classLoader, module, protDomain) ->
            myBuilder.visit(
                Advice.to(MonAdvice.class)
                    .on(ElementMatchers.named("methode")
                        .and(ElementMatchers.takesArguments(1)))
            )
        )
        .installOn(inst);
} catch (Throwable t) {
    log("ERREUR: " + t.getMessage());
}

## 12.4 Noms JVM confirmes (CASE SENSITIVE)

Decompile   | JVM   | Usage
------------|-------|--------
bgt_0       | bgT   | Joueur local
bgy         | bgy   | Classe abstraite parente
bhJ         | bhJ   | Joueur distant
exP         | exP   | Sous-systeme donnees
csb_1       | cSb   | Coffre de compte (UI)
bky_1       | bKy   | Vue contenu coffre
bkx_1       | bKX   | Liste compartiments
cmy         | cmy   | HDV parent
ctu         | ctu   | Kamas
baj_2       | baJ   | Singleton craft
eki_0       | eKi   | Interface craft
eky_0       | eKy   | Implementation craft
eku_0       | eKu   | Donnees 1 metier
ekv_0       | eKv   | Lien compte→craft
eKX         | eKX   | Formules XP craft

---

# 13. METHODOLOGIE DE RECHERCHE DANS LE CODE DECOMPILE

## 13.1 Repertoire source

H:\Code\Wakfuassistant\rnd\decompiled\wakfu-src\
18 979 fichiers .java, 86.8 MB

## 13.2 Commandes PowerShell essentielles

Chercher un pattern :
    Select-String -Path "$srcDir\*.java" -Pattern "monMotCle"

Chercher avec fichiers seulement :
    Select-String -Path "$srcDir\*.java" -Pattern "monMotCle" -List

Trouver le nom JVM :
    Select-String -Path "$srcDir\monFichier.java" -Pattern "Renamed from"

Trouver les implementations d'une interface :
    Select-String -Path "$srcDir\*.java" -Pattern "implements.*monInterface"

Trouver les appelants d'une methode :
    Select-String -Path "$srcDir\*.java" -Pattern "\.maMethode\("

Afficher un fichier avec numeros de ligne :
    $c = Get-Content "$srcDir\fichier.java"
    for ($i = 0; $i -lt $c.Count; $i++) { "{0,4}: {1}" -f ($i+1), $c[$i] }

## 13.3 Ordre de recherche recommande

1. Chercher le mot-cle fonctionnel (ex: "craft", "chest", "guild")
2. Trouver la constante ou le case dans bgt_0.java (classe principale)
3. Identifier la classe conteneur retournee
4. Remonter vers l'interface de donnees
5. Trouver l'implementation reelle
6. Identifier les getters et maps internes
7. Trouver le singleton d'acces
8. Verifier joueur local vs autres joueurs
9. Choisir : hook reseau (appel unique) ou lecture passive (appels frequents)
10. TOUJOURS preferer la lecture passive pour les methodes UI

---

# 14. GUIDE DE REPRISE RAPIDE

## 14.1 Config machine

OS: Windows
CPU: AMD 5700 X3D
RAM: 32 GB
Disque: 1 TB disponible
Java: OpenJDK 21.0.10 (Microsoft)
Maven: 3.9.9 (dans .m2)
IDE: VS Code

## 14.2 Pour modifier un hook

1. Editer le .java dans agent/src/main/java/com/wakfuassistant/agent/
2. Build :
   Push-Location H:\Code\Wakfuassistant\agent
   & "C:\Users\Smedj\.m2\wrapper\dists\apache-maven-3.9.9-bin\33b4b2b4\apache-maven-3.9.9\bin\mvn.cmd" clean package
   Pop-Location
3. Copier :
   Copy-Item agent\target\wakfu-spy-agent-1.0.0.jar agent\wakfu-spy-agent.jar -Force
4. Fermer Wakfu, relancer LANCER_HDV.bat

## 14.3 Pour ajouter un nouveau hook

1. Creer MonAdvice.java (PAS de methodes privees!)
2. Ajouter le bloc try/catch dans WakfuSpyAgent.installByteBuddy()
3. Utiliser un nom de lambda parameter UNIQUE (pas "builder")
4. Build + restart

## 14.4 Pour trouver une classe Wakfu

1. Chercher dans H:\Code\Wakfuassistant\rnd\decompiled\wakfu-src\*.java
2. Le commentaire /* Renamed from XyZ */ donne le vrai nom JVM
3. Les classes UI n'apparaissent PAS dans DISCOVERY logs
4. Verifier dans wakfu_agent_spy.log avec DISCOVERY|NomJVM|

## 14.5 Joueur confirme

Nom: L'Immortel
Classe: Sram (breedId=4)
Level: 191
EntityId: 3111456
Account ID: 135009704
Guild: Make Sufo Great Again (id=21122, 236 membres)
Coffre: 15 compartiments, 1114/1500 items
Metiers: 15 connus (IDs 40, 64, 71-83)

## 14.6 Repo GitHub

https://github.com/Duperopope/Wakfuassistant
Branche : master
