# Protocole de Serialisation des Items Wakfu - Reference Complete

> **Version** : 1.0.0
> **Date** : 2026-03-21
> **Source** : Decompilation complete de wakfu-client.jar (18 979 classes, 86.8 MB)
> **Statut** : VALIDE - 100% verifie par le code source
> **Outil** : CFR 0.152, AMD 5700 X3D, 32GB RAM, duree 03:43

---

## 1. Vue d'ensemble

Le client Wakfu serialise les items via un format binaire custom (Java Big-Endian ByteBuffer).
Chaque item est encapsule dans la structure uy_1 : header fixe (14 bytes) + 8 sous-blocs optionnels.
Chaque sous-bloc est precede d'un byte flag (1 = present, 0 = absent).

Architecture des classes :

    uy_1 (serialiseur reseau)
    +-- gs_0 (interface : aF/aG/DN/clear/b)
    +-- vk_1 -> wg_2   [pet]
    +-- vt_2 -> vr_2   [xp]
    +-- vp_2 -> yd_2   [shard/enchantements]  << CRITIQUE
    +-- vb_1 -> tt_1   [companion]
    +-- uz_2 -> ve_1   [bind]
    +-- vd_2 -> vg_2   [elements]
    +-- vh_2 -> we_1   [merged items]
    +-- vj_1           [mimi symbic]

    ffV (modele metier cote client)
    +-- fhi_0 (ShardsContainer)
    |   +-- Map<Byte, fhn_0> (slots)
    |   |   +-- fhn_0 (Shard : effectId, stateId, colorType)
    |   +-- int sublimationItemId
    |   +-- int specialSublimationItemId
    |   +-- byte charges
    +-- fnl_0 (pet)
    +-- fij_0 (xp)
    +-- fgr_0 (bind)
    +-- fgX   (companion)
    +-- fhz   (merged set)
    +-- fhy_0 (skin/mimi)

Conversion reseau -> modele :

    uy_1 (reseau)  --> ffV.c(uy_1)      --> ffV (modele client)
    uy_1.aeH       --> vp_2 -> yd_2     --> fhk_0.d(yd_2) -> fhi_0
    yf_1 (slot)    --> fhk_0.a(yf_1)    --> fhn_0(effectId, color, amount)
    byte[] proto    --> fga_0.eM(byte[]) --> kW (protobuf) -> fga_0.w(kW) -> ffV

---

## 2. Format binaire uy_1 - Item complet

### Header (14 bytes fixes)

    Offset  Type    Champ       Description                     Exemple
    0       long    uniqueId    ID unique de l'instance         56227059278285599
    8       int     refId       ID reference CDN                26599
    12      short   quantity    Quantite empilee                1

### Sous-blocs optionnels (8 blocs)

    #  Flag  Wrapper  Inner  Label          Taille      Description
    1  byte  vk_1     wg_2   pet            variable    Donnees familier
    2  byte  vt_2     vr_2   xp             12 bytes    Experience item
    3  byte  vp_2     yd_2   shard          variable    Enchantements/sublimations
    4  byte  vb_1     tt_1   companionInfo  8 bytes     Info compagnon
    5  byte  uz_2     ve_1   bind           2 bytes     Liaison (lie au compte)
    6  byte  vd_2     vg_2   elements       2 bytes     Elements degats/resistances
    7  byte  vh_2     we_1   mergedItems    variable    Items fusionnes (sets)
    8  byte  vj_1     -      mimiSymbic     4 bytes     Skin cosmetique

### 2.1 Pet (wg_2) - variable

    [int]    definitionId       ID definition familier
    [short]  nameLen            Longueur du nom en bytes
    [bytes]  name               Nom UTF-8 du familier
    [int]    colorItemRefId     Couleur personnalisee
    [int]    equippedRefItemId  Item equipe sur le familier
    [int]    health             Points de vie
    [int]    xp                 Experience
    [long]   lastMealDate       Timestamp dernier repas
    [long]   lastHungryDate     Timestamp derniere faim
    [int]    sleepRefItemId     Item de sommeil
    [long]   sleepDate          Timestamp mise en sommeil

### 2.2 XP (vr_2) - 12 bytes

    [int]    definitionId       ID definition XP
    [long]   xp                 Points d'experience

### 2.3 Shard (yd_2) - variable -> voir Section 3

### 2.4 CompanionInfo (tt_1) - 8 bytes

    [long]   xp                 XP du compagnon

### 2.5 Bind (ve_1) - 2 bytes

    [byte]   type               Type de liaison
    [byte]   applied            0 = non, 1 = oui

### 2.6 Elements (vg_2) - 2 bytes

    [byte]   damageElements     Masque de bits elements degats
    [byte]   resistanceElements Masque de bits elements resistance

### 2.7 MergedItems (we_1) - variable

    [int]    version            Version du format
    [short]  dataLen            Longueur des donnees
    [bytes]  data               Donnees binaires des items fusionnes

### 2.8 MimiSymbic (vj_1) - 4 bytes

    [int]    skinItemRefId      ID CDN de l'apparence cosmetique

---

## 3. Bloc Shard/Enchantement (yd_2)

### Format binaire

    [short]  nSlots              Nombre de slots de shards
      x nSlots: (10 bytes chacun - yf_1)
        [byte]   position        Index du slot (0, 1, 2, 3)
        [int]    slottedItemId   EffectId CDN (0 = slot vide)
        [byte]   slotColor       Couleur du slot (enum rd_0)
        [int]    shardsAmount    Niveau/quantite du shard

    [short]  nGems               Nombre de gemmes additionnelles
      x nGems: (5 bytes chacun - ye_2)
        [byte]   propertyId      ID propriete (enum fgg_0)
        [int]    gemRefId        ID CDN de la gemme

    [int]    sublimationItemId       ID CDN sublimation principale (0 = aucune)
    [int]    specialSublimationItemId ID CDN sublimation speciale (0 = aucune)
    [byte]   charges                  Charges restantes (-1 = infini)

### Taille calculee

    taille = 2 + (nSlots x 10) + 2 + (nGems x 5) + 4 + 4 + 1
           = 13 + (nSlots x 10) + (nGems x 5) bytes

    Item typique 3 slots, 0 gemmes : 13 + 30 + 0 = 43 bytes

### Conversion reseau -> modele (fhk_0)

    // fhk_0.a(yf_1) - convertit un slot reseau en Shard
    public static fhn_0 a(yf_1 yf_12) {
        return new fhn_0(yf_12.alj, yf_12.alk, yf_12.all);
        //              effectId,   colorByte,  shardsAmount
    }

    // fhk_0.d(yd_2) - convertit tout le bloc en ShardsContainer
    public static fhi_0 d(yd_2 yd_22) {
        fhi_0 fhi_02 = new fhi_0();
        yd_22.alb.forEach(yf_12 ->
            fhk_0.a(fhi_02, yf_12.Tg, fhk_0.a(yf_12)));
        fhi_02.VE(yd_22.ald);      // sublimationItemId
        fhi_02.VF(yd_22.ale);      // specialSublimationItemId
        fhi_02.gE(yd_22.alf);      // charges
        yd_22.alc.forEach(ye_22 ->
            fhi_02.a(fgg_0.UZ(ye_22.alg), ye_22.alh));  // gems
        return fhi_02;
    }

---

## 4. Enums de reference

### 4.1 Couleurs de slots (rd_0)

    Valeur  Constante  Nom     Usage
    0       bjA        NONE    Slot vide / neutre
    1       bjB        RED     Slot rouge
    2       bjC        BLUE    Slot bleu
    3       bjD        GREEN   Slot vert
    4       bjE        WHITE   Slot epique/relique

    Listes predefinies :
    bjG = [RED, BLUE, GREEN]          3 couleurs standards
    bjH = [RED, BLUE, GREEN, WHITE]   4 couleurs actives

    Confirme par bow_0 : switch ("RED", "GREEN", "BLUE", "WHITE")

### 4.2 Slots d'equipement (ffS)

    Byte  Nom               Label i18n                     TypeId
    0     HEAD              desc.equipment.head            134
    3     SHOULDERS         desc.equipment.shoulder        138
    4     NECK              desc.equipment.neck            120
    5     CHEST             desc.equipment.chest           136
    7     LEFT_HAND         desc.equipment.leftHand        103
    8     RIGHT_HAND        desc.equipment.rightHand       103
    10    BELT              desc.equipment.belt            133
    12    LEGS              desc.equipment.legs            119
    13    BACK              desc.equipment.back            132
    15    WEAPON_1          desc.equipment.firstWeapon     100
    16    WEAPON_2          desc.equipment.secondWeapon    100
    17    ACCESSORY         desc.equipment.accessory       646
    22    PET               desc.equipment.pet             582
    23    COSTUME (deprecated) desc.equipment.costume      -
    24    MOUNT             desc.equipment.mount           611

    Slots actifs (liste sha) :
    HEAD, BACK, NECK, SHOULDERS, CHEST, BELT, LEFT_HAND, RIGHT_HAND,
    LEGS, WEAPON_2, WEAPON_1, ACCESSORY, MOUNT, PET

### 4.3 Proprietes d'items (fgg_0)

    ID  Constante  Description
    1   shZ        Objet tresor (interface speciale)
    2   sia        Objet de quete
    3   sib        Prend la couleur de la guilde
    4   sic        Ne peut pas etre drope par la bourse enutrof
    5   sid        Livre placeable en bibliotheque
    6   sie        Pas de feedback sur actions (plantation)
    7   sif        Item shop uniquement
    8   sig        RELIQUE - un seul equipe a la fois
    9   sih        Cree un evenement de jeu au drop
    10  sii        Pas de jet bonus de loot
    11  sij        1 xp = 1 level, max 32000, admin uniquement
    12  sik        RELIQUE_2 - un seul equipe a la fois (v2)
    13  sil        Non recyclable
    14  sim        Non consomme a l'utilisation
    15  sin        Pas de condition de niveau pour runer
    16  sio        Stasis augmente tentatives loot transmutations
    17  sip        Stasis augmente tentatives loot ressources boss
    18  siq        Cache dans les listes de metier
    19  sir        AJOUTE SLOT GEMME EPIQUE
    20  sis        AJOUTE SLOT GEMME RELIQUE
    21  sit        Quete lie au compte
    22  siu        Objet cache (quetes uniquement)
    23  siv        Exclus auto-completion et offres d'achat
    24  siw        Exclus de l'encyclopedie in-game

---

## 5. Messages reseau

### 5.1 Table de correspondance

    MsgId  Classe   Parent   Format payload        Handler  Usage
    13668  cru_0    nr_0     byte[] brut (opaque)   cdC      Items equipes joueur
    12125  csn_0    nr_0     long + byte[]          cdl      Inventaire complet
    13804  csf      nr_0     byte + items loop      cdl      Update inventaire
    13003  cso      nr_0     long + short           cdl      Item deplace (uid+qty)
    12294  clX      cmy_0    protobuf mg            chh_0    HDV resultats vente
    13653  clU      cmy_0    protobuf mi_0          chf_0    HDV resultats achat
    13452  cln      nv_0     long (request)         -        Requete inventaire
    13674  crU      cqQ      header + int           -        Sous-message equipement

### 5.2 Detail des payloads

cru_0 (13668) - Items equipes :

    [byte[]] mgi    -> blob entier non parse au niveau message
                    -> envoye a bbs_2.cg(byte[]) -> evx_2
                    -> evx_2.d(long, byte[]) lit :
                       [int] count
                       x count:
                         [int] typeOrdinal (enum eva_1)
                         [...] donnees typees

csn_0 (12125) - Inventaire complet :

    [long]   aDh    -> containerId (characterId ou bagId)
    [byte[]] mhd    -> reste du payload -> fga_0.eM(byte[])
                    -> protobuf kW -> fga_0.w(kW) -> ffV

csf (13804) - Update inventaire :

    [byte]   mgP    -> flag
    loop while hasRemaining:
      [long]  uid   -> uniqueId de l'item
      [byte]  type  -> type d'operation (fif enum)
      [...]   data  -> fif.eM(ByteBuffer) selon le type

cso (13003) - Item deplace :

    [long]   duS    -> uniqueId de l'item
    [short]  bol    -> nouvelle quantite

---

## 6. Protobuf HDV

### 6.1 Sell - Resultats de recherche vente (mg, msgId 12294)

    message SellSearchResult {               // mg.java (13103 B)
      optional Pagination pagination = 1;     // mk
      repeated SellEntry entries = 2;         // mc
      optional int64 server_time = 3;         // Ks
    }

    message SellEntry {                       // mc.java (17748 B)
      optional int64 offer_uid = 1;           // wq
      optional Item item = 2;                 // kW (protobuf imbrique)
      optional Seller seller = 3;             // mo_0
      // champ 4 absent
      optional int32 init_qty = 5;            // Kb
      optional int32 rem_qty = 6;             // Kd
      optional int64 unit_price = 7;          // Kf
      optional int32 sell_duration = 8;       // Kh
      optional int64 expiration = 9;          // Kj
    }

    message Pagination {                      // mk.java (11552 B)
      optional int32 page_index = 1;          // uI
      optional int32 total_count = 2;         // jq
      optional int32 page_size = 3;           // KA
    }

### 6.2 Buy - Resultats de recherche achat (mi_0, msgId 13653)

    message BuySearchResult {                 // mi_0.java (13271 B)
      optional Pagination pagination = 1;     // mk
      repeated BuyEntry entries = 2;          // mE
      optional int64 server_time = 3;         // Ks
    }

    message BuyEntry {                        // mE.java (25120 B, 15 champs)
      optional int64 offer_uid = 1;           // wq
      optional int32 item_ref_id = 2;         // qB
      optional int64 buyer_id = 3;            // LE
      optional string buyer_name = 4;         // LG (UTF-8)
      optional int32 init_qty = 5;            // LI
      optional int32 rem_qty = 6;             // LK
      optional int64 unit_price = 7;          // Kf
      optional int32 total_price = 8;         // jq
      optional int32 sell_duration = 9;       // Kh
      optional int64 expiration = 10;         // Kj
      optional int32 rarity = 11;             // LQ
      repeated int32 item_type_ids = 12;      // LS
      optional bool is_active = 13;           // LU
      optional int32 min_level = 14;          // LW
      optional int32 max_level = 15;          // LY
    }

### 6.3 Serialisation des items dans le protobuf

    Serialisation : fga_0.cK(ffV) -> kY (protobuf builder) -> toByteArray()
    Deserialisation : fga_0.eM(byte[]) -> kW (protobuf parsed) -> fga_0.w(kW) -> ffV
    Shards specifiquement : fga_0.x(kW) -> kW.adU() -> lc_0 -> fhk_0.g(lc_0) -> fhi_0

---

## 7. Chaine de decodage

### 7.1 Decodage d'un item depuis le reseau (ByteBuffer)

    1. Lire header : uniqueId (long), refId (int), quantity (short)
    2. Pour chaque sous-bloc (8 fois) :
       a. Lire flag (byte)
       b. Si flag == 1, deserialiser le sous-bloc correspondant
       c. Si flag == 0, passer au suivant
    3. Pour le bloc shard (flag 3) :
       a. Lire nSlots (short)
       b. Pour chaque slot : position(byte), slottedItemId(int), slotColor(byte), shardsAmount(int)
       c. Lire nGems (short)
       d. Pour chaque gem : propertyId(byte), gemRefId(int)
       e. Lire sublimationItemId(int), specialSublimationItemId(int), charges(byte)

### 7.2 Decodage d'un item depuis le protobuf (fga_0)

    1. byte[] -> kW.parseFrom(byte[])             protobuf deserialize
    2. kW.LV()   -> uniqueId
    3. kW.acs()  -> refId
    4. kW.aaD()  -> quantity
    5. kW.adU()  -> lc_0 (shards proto)
    6. lc_0 -> fhk_0.g(lc_0) -> fhi_0            ShardsContainer
    7. fhi_0.dTS() -> Map<Byte, fhn_0>            slots avec effectId/stateId

### 7.3 Resolution des noms

    effectId -> fgD.fXh().Vd(effectId) -> fhc_0   EffectDefinition
    sublimationItemId -> cdn_items.json lookup     nom de la sublimation
    slotColor -> rd_0.O(byte) -> enum              nom de la couleur

---

## 8. Versioning

### 8.1 Format yd_2 (shards)

    Version            Format
    < 1                Non supporte
    1 - 10054999       Slots uniquement (pas de gems)
    10055001 - 10063999  Slots + additionalGems
    10064001 - 10068999  Slots + gems + sublim + 4 bytes legacy + charges
    >= 10069001        Format actuel (yd_2.aG) clean

    Classe migration : yh_2 (gere les 3 anciens formats)

### 8.2 Autres sous-blocs

    Version            Bloc        Classe migration
    < 10036004         elements    ve_2
    < 10048000         pet         vl_2
    < 10029000         companion   vc_1
    < 10045010         bind        va_1
    < 10037001         merged      vi_2
    < 10064001         slot(yf_1)  yg_1

---

## 9. Classes Java decompiless - Index

### 9.1 Serialiseurs (format binaire reseau)

    Classe   Taille  Role
    uy_1     9304 B  Serialiseur item complet
    yd_2     4600 B  Serialiseur shards/enchantements
    yf_1     1911 B  Serialiseur slot de shard (10 bytes)
    ye_2     1241 B  Serialiseur gemme additionnelle (5 bytes)
    yh_2     3634 B  Migration legacy shards
    vk_1     1335 B  Wrapper pet
    vt_2     1086 B  Wrapper xp
    vp_2     1337 B  Wrapper shard (contient yd_2)
    vb_1     1345 B  Wrapper companion
    uz_2     1340 B  Wrapper bind
    vd_2     1344 B  Wrapper elements
    vh_2     1343 B  Wrapper merged items
    vj_1     1038 B  MimiSymbic (4 bytes)
    wg_2     3973 B  Inner pet data
    vr_2     1239 B  Inner xp data
    ve_1     1502 B  Inner bind data
    tt_1     1027 B  Inner companion data
    we_1     1749 B  Inner merged items data
    vg_2     1250 B  Inner elements data

### 9.2 Modele metier (client-side)

    Classe   Taille   Role
    ffV      25548 B  Item complet (modele client)
    fhi_0    12000 B  ShardsContainer
    fhn_0    3992 B   Shard individuel (effectId, stateId, color)
    fhk_0    13802 B  ShardManager (conversion + validation)
    fhj_0    1940 B   ShardHelper (donnees de test)
    ber_0    4732 B   ShardsDisplayer (UI)
    bES      7504 B   ShardSlotView (UI)
    bow_0    7070 B   ShardHandler (UI enchantement)
    fga_0    10884 B  Item decoder (protobuf <-> ffV)

### 9.3 Enums

    Classe   Taille  Role
    rd_0     1992 B  Couleurs de slots (5 valeurs)
    ffS      4453 B  Slots d'equipement (25 valeurs)
    fgg_0    4541 B  Proprietes d'items (24 valeurs)

### 9.4 Messages reseau

    Classe   Taille  MsgId   Role
    cru_0    358 B   13668   Items equipes (blob brut)
    csn_0    621 B   12125   Inventaire complet
    csf      974 B   13804   Update inventaire
    cso      546 B   13003   Item deplace
    clX      674 B   12294   HDV sell results (protobuf)
    clU      680 B   13653   HDV buy results (protobuf)
    cln      374 B   13452   Requete inventaire
    crU      582 B   13674   Sous-message equipement

### 9.5 Protobuf HDV

    Classe   Taille   Role
    mg       13103 B  SellSearchResult
    mi_0     13271 B  BuySearchResult
    mc       17748 B  SellEntry (9 champs)
    mE       25120 B  BuyEntry (15 champs)
    mk       11552 B  Pagination (3 champs)
    mo_0     ???      Seller

### 9.6 Handlers

    Classe   Role                      MsgIds geres
    cdC      Handler CRU               13668
    cdl      Handler inventaire         12125, 13804, 13003, etc.
    chh_0    Handler HDV sell           12294
    chf_0    Handler HDV buy            13653
    ccf_0    Dispatcher principal       ~300 messages
    bbs_2    Bridge -> GameAccountManager

---

## 10. Donnees de test validees (fhj_0)

La classe fhj_0 contient des donnees de test internes Ankama :

    Item refId  sublimItemId(VE)  specSubItemId(VF)  Gem(fgg_0)     gemRefId  Slots
    24109       -                 25800               -              -         -
    24109       -                 -                   sir(19=epic)   24133     -
    20720       -                 -                   sis(20=relic)  25800     -
    26041       -                 24133               -              -         -
    24079       27112             -                   -              -         3x GREEN
    24079       27113             24133               -              -         3x GREEN
    24079       -                 24133               -              -         -

Ces IDs ne sont pas dans cdn_items.json (8324 items) mais sont valides cote serveur.

---

## Annexe A - Chemins du projet

    Fichier                                              Description
    C:\...\Ankama\Wakfu\lib\wakfu-client.jar            JAR client (18 979 classes)
    H:\Code\Wakfuassistant\docs\RND\decompiled\cfr.jar  Decompilateur CFR 0.152
    H:\...\decompiled\wakfu-src\                         Sources decompiless (86.8 MB)
    H:\...\decompiled\wakfu-src\_MAP\                    Index de cartographie
    H:\...\agent\logs\runs\RUN_20260321_175522\          Logs de la session R&D
    H:\Code\Wakfuassistant\logs\cdn_items.json           Cache CDN items
    H:\...\logs\cdn_sublimations_catalog.json            Cache CDN sublimations
    H:\...\logs\effect_to_state_mapping.json             Mapping effectId -> stateId
    H:\...\logs\hdv_market.db                            Base SQLite HDV

## Annexe B - Statistiques de decompilation

    Metrique                 Valeur
    Classes dans le JAR      18 979
    Fichiers .java generes   18 979
    Taille source totale     86.8 MB
    Duree decompilation      03:43
    Duree cartographie       01:29
    Classes reseau           1 917
    Classes items            274
    Classes effets           2 279
    Classes marche           109
    Classes serialiseurs     2 005
