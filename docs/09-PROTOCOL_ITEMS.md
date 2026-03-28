# 09 - Protocole Items & Enchantements Wakfu

> **Statut** : VALIDE
> **Date** : 2026-03-21
> **Prerequis** : Decompilation complete (18 979 classes, voir memory/PROTOCOL_ITEMS_SERIALIZATION.md)
> **Objectif** : Spec technique pour implementer le decodeur Rust dans le pipeline Tauri

---

## Contexte

Ce document decrit le format binaire exact des items Wakfu tel qu'il transite sur le reseau
entre le serveur et le client Java. Il sert de specification pour l'implementation du decodeur
Rust dans src-tauri/. Toutes les informations proviennent de la decompilation du client
wakfu-client.jar avec CFR 0.152 le 2026-03-21.

Reference complete : memory/PROTOCOL_ITEMS_SERIALIZATION.md

---

## 1. Format uy_1 - Pseudo-code Rust

Le format est Big-Endian (Java ByteBuffer standard).

    struct RawItem {
        unique_id: i64,          // 8 bytes
        ref_id: i32,             // 4 bytes  -> cdn_items.json
        quantity: i16,           // 2 bytes
        pet: Option<PetData>,           // flag byte + data
        xp: Option<XpData>,             // flag byte + data
        shard: Option<ShardData>,       // flag byte + data  << CRITIQUE
        companion: Option<CompanionData>, // flag byte + data
        bind: Option<BindData>,         // flag byte + data
        elements: Option<ElementsData>, // flag byte + data
        merged: Option<MergedData>,     // flag byte + data
        mimi_symbic: Option<MimiData>,  // flag byte + data
    }

### Lecture d'un sous-bloc optionnel

    fn read_optional<T>(buf: &mut Cursor, reader: fn(&mut Cursor) -> T) -> Option<T> {
        let flag = buf.read_u8();
        if flag == 1 { Some(reader(buf)) } else { None }
    }

---

## 2. Bloc ShardData (yd_2) - Specification Rust

    struct ShardData {
        slots: Vec<ShardSlot>,           // [short count] + count * ShardSlot
        additional_gems: Vec<AdditionalGem>, // [short count] + count * AdditionalGem
        sublimation_item_id: i32,        // 0 = aucune
        special_sublimation_item_id: i32, // 0 = aucune
        charges: i8,                     // -1 = infini
    }

    struct ShardSlot {                   // 10 bytes fixes (yf_1)
        position: u8,                    // index 0..3
        slotted_item_id: i32,           // effectId CDN, 0 = vide
        slot_color: SlotColor,          // enum 0..4
        shards_amount: i32,             // niveau du shard
    }

    struct AdditionalGem {              // 5 bytes fixes (ye_2)
        property_id: u8,               // fgg_0 enum (19=epic, 20=relic)
        gem_ref_id: i32,               // ID CDN de la gemme
    }

    enum SlotColor {                    // rd_0
        None  = 0,  // bjA - slot vide/neutre
        Red   = 1,  // bjB
        Blue  = 2,  // bjC
        Green = 3,  // bjD
        White = 4,  // bjE - epique/relique
    }

### Pseudo-code de deserialisation

    fn read_shard_data(buf: &mut Cursor) -> ShardData {
        let n_slots = buf.read_u16() as usize;
        let mut slots = Vec::with_capacity(n_slots);
        for _ in 0..n_slots {
            slots.push(ShardSlot {
                position:       buf.read_u8(),
                slotted_item_id: buf.read_i32(),
                slot_color:     SlotColor::from(buf.read_u8()),
                shards_amount:  buf.read_i32(),
            });
        }

        let n_gems = buf.read_u16() as usize;
        let mut gems = Vec::with_capacity(n_gems);
        for _ in 0..n_gems {
            gems.push(AdditionalGem {
                property_id: buf.read_u8(),
                gem_ref_id:  buf.read_i32(),
            });
        }

        ShardData {
            slots,
            additional_gems: gems,
            sublimation_item_id:         buf.read_i32(),
            special_sublimation_item_id: buf.read_i32(),
            charges:                     buf.read_i8(),
        }
    }

---

## 3. Autres sous-blocs - Specifications

### 3.1 PetData (wg_2)

    fn read_pet(buf: &mut Cursor) -> PetData {
        let definition_id      = buf.read_i32();
        let name_len           = buf.read_u16() as usize;
        let name               = buf.read_utf8(name_len);
        let color_item_ref_id  = buf.read_i32();
        let equipped_ref_id    = buf.read_i32();
        let health             = buf.read_i32();
        let xp                 = buf.read_i32();
        let last_meal_date     = buf.read_i64();
        let last_hungry_date   = buf.read_i64();
        let sleep_ref_id       = buf.read_i32();
        let sleep_date         = buf.read_i64();
        // total: 4+2+N+4+4+4+4+8+8+4+8 = 50+N bytes
    }

### 3.2 XpData (vr_2) - 12 bytes

    fn read_xp(buf: &mut Cursor) -> XpData {
        let definition_id = buf.read_i32();
        let xp            = buf.read_i64();
    }

### 3.3 CompanionData (tt_1) - 8 bytes

    fn read_companion(buf: &mut Cursor) -> CompanionData {
        let xp = buf.read_i64();
    }

### 3.4 BindData (ve_1) - 2 bytes

    fn read_bind(buf: &mut Cursor) -> BindData {
        let bind_type = buf.read_u8();
        let applied   = buf.read_u8() == 1;
    }

### 3.5 ElementsData (vg_2) - 2 bytes

    fn read_elements(buf: &mut Cursor) -> ElementsData {
        let damage_elements     = buf.read_u8();
        let resistance_elements = buf.read_u8();
    }

### 3.6 MergedData (we_1) - variable

    fn read_merged(buf: &mut Cursor) -> MergedData {
        let version  = buf.read_i32();
        let data_len = buf.read_u16() as usize;
        let data     = buf.read_bytes(data_len);
    }

### 3.7 MimiData (vj_1) - 4 bytes

    fn read_mimi(buf: &mut Cursor) -> MimiData {
        let skin_item_ref_id = buf.read_i32();
    }

---

## 4. Messages reseau pertinents

### 4.1 cru_0 (msgId 13668) - Items equipes

Le payload est un blob brut. La chaine de traitement cote client :

    cru_0.mgi (byte[])
      -> cdC handler
        -> bbs_2.cg(byte[])
          -> evx_2.d(long accountId, byte[] data)
            -> lit [int] count puis boucle count fois
              -> [int] typeOrdinal + donnees typees

Pour intercepter : hooker cru_0.dn(byte[]) ou bbs_2.cg(byte[]).

### 4.2 csn_0 (msgId 12125) - Inventaire complet

    [long]   containerId   (characterId ou bagId)
    [byte[]] payload       -> fga_0.eM(byte[])
                           -> kW protobuf
                           -> fga_0.w(kW)
                           -> ffV (item complet)

Pour intercepter : hooker fga_0.eM(byte[]) pour obtenir chaque item deserialise.

### 4.3 csf (msgId 13804) - Update inventaire incremental

    [byte]   flag
    loop while hasRemaining:
      [long]   uniqueId
      [byte]   operationType (enum fif)
      [...]    data selon le type

### 4.4 HDV (protobuf)

    12294 (clX) : [int] protoLen + [bytes] protobuf mg  + [byte] searchType(fjc)
    13653 (clU) : [int] protoLen + [bytes] protobuf mi_0 + [byte] searchType(fjc)

    Deserialisation : mg.bV(byte[]) ou mi_0.cb(byte[])

---

## 5. Integration dans le pipeline Tauri

### 5.1 Fichiers a creer/modifier

    src-tauri/src/protocol/mod.rs          Module protocol
    src-tauri/src/protocol/item.rs         Struct RawItem + deserialisation uy_1
    src-tauri/src/protocol/shard.rs        Struct ShardData + enums
    src-tauri/src/protocol/pet.rs          PetData
    src-tauri/src/protocol/hdv.rs          Protobuf HDV (prost ou manual)
    src-tauri/src/protocol/messages.rs     Dispatch par msgId

### 5.2 Dependances Rust suggerees

    byteorder = "1.5"          # Big-Endian read/write
    prost = "0.12"             # Protobuf deserialisation (pour HDV)
    bytes = "1.5"              # Buffer manipulation

### 5.3 Points d'interception agent Java

    Priorite 1 : fga_0.eM(byte[])     -> log chaque item deserialise
    Priorite 2 : cru_0.dn(byte[])     -> log blob equipement brut
    Priorite 3 : csn_0.dn(byte[])     -> log blob inventaire brut
    Priorite 4 : cmy_0.fd(ByteBuffer) -> log payloads HDV

### 5.4 Resolution des noms

    slottedItemId  -> cdn_items.json[id].title.fr       nom de l'item/effet
    sublimItemId   -> cdn_sublimations_catalog.json      nom sublimation
    refId          -> cdn_items.json[id]                 item de base
    slotColor      -> enum SlotColor                     couleur en clair

---

## 6. Validation

### 6.1 Donnees de test (extraites de fhj_0)

    // Item 24079 avec sublimation 27112 et 3 slots verts
    ShardData {
        slots: [
            ShardSlot { position: 0, slotted_item_id: 0, slot_color: Green, shards_amount: 0 },
            ShardSlot { position: 1, slotted_item_id: 0, slot_color: Green, shards_amount: 0 },
            ShardSlot { position: 2, slotted_item_id: 0, slot_color: Green, shards_amount: 0 },
        ],
        additional_gems: [],
        sublimation_item_id: 27112,
        special_sublimation_item_id: 0,
        charges: -1,
    }

### 6.2 Bytes attendus pour ce test

    00 03                          nSlots = 3
    00 00000000 03 00000000        slot 0: pos=0, itemId=0, color=GREEN(3), amount=0
    01 00000000 03 00000000        slot 1: pos=1, itemId=0, color=GREEN(3), amount=0
    02 00000000 03 00000000        slot 2: pos=2, itemId=0, color=GREEN(3), amount=0
    00 00                          nGems = 0
    00006A08                       sublimationItemId = 27112
    00000000                       specialSublimationItemId = 0
    FF                             charges = -1

    Total: 2 + 30 + 2 + 0 + 4 + 4 + 1 = 43 bytes

### 6.3 Tests unitaires a ecrire

    test_parse_empty_shard          yd_2 avec 0 slots, 0 gems, 0 sublim
    test_parse_3slots_green         cas fhj_0 ci-dessus
    test_parse_with_gems            slots + additionalGems epic/relic
    test_parse_full_item            uy_1 complet avec tous les flags
    test_parse_sell_entry           protobuf mc depuis payload capture
    test_parse_buy_entry            protobuf mE depuis payload capture
    test_roundtrip_shard            serialize -> deserialize -> compare

---

## 7. Classes de reference

    Classe    Fichier source                                    Taille   Lignes
    uy_1      rnd/decompiled/wakfu-src/uy_1.java           9304 B   338
    yd_2      rnd/decompiled/wakfu-src/yd_2.java           4600 B   157
    yf_1      rnd/decompiled/wakfu-src/yf_1.java           1911 B   75
    ye_2      rnd/decompiled/wakfu-src/ye_2.java           1241 B   56
    yh_2      rnd/decompiled/wakfu-src/yh_2.java           3634 B   133
    vp_2      rnd/decompiled/wakfu-src/vp_2.java           1337 B   61
    ffV       rnd/decompiled/wakfu-src/ffV.java            25548 B  1064
    fhi_0     rnd/decompiled/wakfu-src/fhi_0.java          ~12 KB   ~400
    fhn_0     rnd/decompiled/wakfu-src/fhn_0.java          3992 B   157
    fhk_0     rnd/decompiled/wakfu-src/fhk_0.java          13802 B  468
    fga_0     rnd/decompiled/wakfu-src/fga_0.java          10884 B  334
    rd_0      rnd/decompiled/wakfu-src/rd_0.java           1992 B   81
    ffS       rnd/decompiled/wakfu-src/ffS.java            4453 B   115
    fgg_0     rnd/decompiled/wakfu-src/fgg_0.java          4541 B   92
    cru_0     rnd/decompiled/wakfu-src/cru_0.java          358 B    26
    csn_0     rnd/decompiled/wakfu-src/csn_0.java          621 B    36
    mg        rnd/decompiled/wakfu-src/mg.java             13103 B  435
    mi_0      rnd/decompiled/wakfu-src/mi_0.java           13271 B  438
    mc        rnd/decompiled/wakfu-src/mc.java             17748 B  599
    mE        rnd/decompiled/wakfu-src/mE.java             25120 B  865
    mk        rnd/decompiled/wakfu-src/mk.java             11552 B  389

---

## Historique

    Date        Action
    2026-03-21  Creation - decompilation complete + cartographie
    2026-03-21  Validation schema yd_2/yf_1/ye_2 par code source
    2026-03-21  Identification des 8 sous-blocs uy_1
    2026-03-21  Reconstruction protobuf HDV (mg/mi_0/mc/mE/mk)
    2026-03-21  Documentation des donnees de test fhj_0
