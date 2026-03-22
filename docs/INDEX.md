# Wakfu Assistant — Index Central de Documentation

> **Derniere mise a jour** : 2026-03-21 21:30
> **Distributeur unique** : ce fichier est le point d'entree de toute la documentation
> **Convention** : VALIDE | PARTIEL | BLOQUE | EN COURS

---

## Navigation rapide

    [README]              -> ../README.md
    [ARCHITECTURE]        -> ../ARCHITECTURE.md
    [CHANGELOG]           -> ../CHANGELOG.md
    [PROTOCOL ITEMS]      -> RND/09-PROTOCOL_ITEMS.md          VALIDE
    [PROTOCOL REFERENCE]  -> ../memory/PROTOCOL_ITEMS_SERIALIZATION.md  VALIDE
    [SOURCES ET FORMATS]  -> RND/01-SOURCES_ET_FORMATS.md      VALIDE
    [JOURNAUX ECOUTE]     -> RND/02-JOURNAUX_ECOUTE.md         VALIDE
    [POC LOGS PIPELINE]   -> RND/03-POC_LOGS_PIPELINE.md       VALIDE
    [COMMANDES SYNC]      -> RND/04-COMMANDES_SYNC.md          PARTIEL
    [POC INVENTAIRE]      -> RND/05-POC_INVENTAIRE.md          EN COURS
    [POC HDV]             -> RND/06-POC_HDV.md                 VALIDE
    [PROTOCOL RESEAU]     -> RND/08-PROTOCOL_RESEAU.md         VALIDE
    [PROTOCOL ITEMS]      -> RND/09-PROTOCOL_ITEMS.md          VALIDE  << NOUVEAU
    [CONTRADICTIONS]      -> RND/10-CONTRADICTIONS.md          EN COURS

---

## Arborescence du projet

    H:\Code\Wakfuassistant\
    +-- README.md                          Presentation du projet
    +-- ARCHITECTURE.md                    Architecture technique Tauri v2
    +-- CHANGELOG.md                       Journal des modifications
    +-- package.json                       Config npm (SolidJS frontend)
    |
    +-- docs\
    |   +-- INDEX.md                       << CE FICHIER (distributeur unique)
    |   +-- RND\
    |   |   +-- 01-SOURCES_ET_FORMATS.md   Sources de donnees (logs, CDN, Netty)
    |   |   +-- 02-JOURNAUX_ECOUTE.md      Observations terrain sessions 18-21/03
    |   |   +-- 03-POC_LOGS_PIPELINE.md    POC parsing logs -> GameEvent
    |   |   +-- 04-COMMANDES_SYNC.md       Commandes de synchronisation
    |   |   +-- 05-POC_INVENTAIRE.md       POC inventaire (csf/cso)
    |   |   +-- 06-POC_HDV.md              POC HDV (VALIDE: 82918 offres)
    |   |   +-- 08-PROTOCOL_RESEAU.md      Mapping 85 types de messages
    |   |   +-- 09-PROTOCOL_ITEMS.md       Serialisation items (NOUVEAU)
    |   |   +-- 10-CONTRADICTIONS.md       Contradictions et gaps
    |   |   +-- protocol_discoveries.md    Decouvertes incrementales
    |   |   +-- decompiled\
    |   |   |   +-- cfr.jar                Decompilateur CFR 0.152
    |   |   |   +-- _archive_pre_full_decompile\
    |   |   |   |   +-- MANIFEST.md        Inventaire des anciens fichiers
    |   |   |   |   +-- dec_*.java         Anciennes decompilations partielles
    |   |   |   +-- wakfu-src\             18 979 fichiers .java (86.8 MB)
    |   |   |       +-- _MAP\
    |   |   |           +-- STATS.md            Statistiques de decompilation
    |   |   |           +-- INDEX_CLASSES.md    Toutes les classes
    |   |   |           +-- INDEX_NETWORK.md    1 917 classes reseau
    |   |   |           +-- INDEX_ITEMS.md      274 classes items
    |   |   |           +-- INDEX_EFFECTS.md    2 279 classes effets
    |   |   |           +-- INDEX_MARKET.md     109 classes marche
    |   |   |           +-- INDEX_SERIALIZERS.md 2 005 serialiseurs
    |   |   |           +-- INDEX_HERITAGE.md   Arbre d'heritage
    |   |   +-- poc-hdv\                   Scripts et agent HDV
    |   |   +-- poc-conceptscripts\        Scripts live-monitor, XP, etc.
    |   |   +-- poc-database\              Versions anterieures DB
    |   |   +-- data\                      Donnees CDN brutes
    |   |
    +-- memory\
    |   +-- PROTOCOL_ITEMS_SERIALIZATION.md  Reference complete protocole (NOUVEAU)
    |   +-- forms\                           Formulaires et briefings LLM
    |
    +-- agent\
    |   +-- wakfu-spy-agent.jar             Agent ByteBuddy principal
    |   +-- src\main\java\                  Sources Java de l'agent
    |   +-- logs\
    |   |   +-- wakfu_messages.log          Log des messages reseau captures
    |   |   +-- runs\
    |   |       +-- RUN_20260321_175522\    Session R&D du 21/03/2026
    |   |           +-- shard_chain_extract.md
    |   |           +-- shard_serializers_extract.md
    |   |           +-- shard_model_validated.md
    |   |           +-- item_serializer_chain.md
    |   |           +-- real_messages_and_schema.md
    |   |           +-- cru_parser_and_proto.md
    |   |           +-- item_decoder_cru_structure.md
    |
    +-- logs\
    |   +-- cdn_items.json                  8 324 items CDN
    |   +-- cdn_items_full.json             Items CDN complet
    |   +-- cdn_sublimations_catalog.json   467 parchemins, 232 sublimations
    |   +-- cdn_actions.json                71 actions CDN
    |   +-- cdn_states.json                 290 etats CDN
    |   +-- effect_to_state_mapping.json    575 effects (actionId 304)
    |   +-- hdv_market.db                   Base SQLite HDV
    |   +-- item_name_cache.json            Cache noms d'items
    |   +-- market_latest_preview.csv       Export HDV
    |   +-- market_latest_named_preview.csv Export HDV avec noms
    |
    +-- src\                               Frontend SolidJS
    +-- src-tauri\                          Backend Rust (Tauri v2)

---

## Statut des composants

### Stack principale

    Composant              Statut     Details
    Tauri v2 overlay       VALIDE     Boot OK, 26 tests Rust, NSIS installer
    SolidJS frontend       VALIDE     6 tabs, widget system modulaire
    Win32 overlay          VALIDE     Transparent, click-through
    SQLite CDN cache       VALIDE     Cache items/actions/states
    Java ByteBuddy agent   VALIDE     Interception Netty fonctionnelle

### POCs valides

    POC                    Statut     Resultats cles
    HDV (06)               VALIDE     82 918 offres, protobuf decode, SQLite OK
    Logs Pipeline (03)     VALIDE     20 regex patterns, FSM, GameEvent
    Protocol reseau (08)   VALIDE     85 message types, 3 handlers
    Protocol items (09)    VALIDE     Format binaire 100% decode (NOUVEAU)

### En cours

    Composant              Statut     Bloqueur
    Inventaire (05)        EN COURS   Necessite hook fga_0.eM()
    Decodage CRU (13668)  EN COURS   Blob opaque, passe par evx_2
    Decodage CSN (12125)   EN COURS   Protobuf kW -> fga_0.w()
    Economy tab Tauri      EN COURS   Tables HDV pas encore creees
    Equipment tab Tauri    EN COURS   Necessite decodeur uy_1 Rust

### Gaps identifies

    Gap                              Priorite   Statut
    Handler CRU blob structure       HAUTE      Identifie (evx_2.d)
    WorldIds 436,437,440,1252        MOYENNE    Non identifies
    Enchantement model Rust          HAUTE      Spec prete (09-PROTOCOL_ITEMS)
    HDV tables Tauri DB              MOYENNE    Schema connu, pas cree
    Depot entries sans refId         BASSE      A investiguer
    Seller proto (mo_0)              BASSE      A decompiler

---

## Donnees CDN disponibles

    Fichier                          Entrees   Source
    cdn_items.json                   8 324     wakfu.cdn.ankama.com/gamedata/1.91.1.53/
    cdn_actions.json                 71        idem
    cdn_states.json                  290       idem (IDs 751-9078)
    cdn_sublimations_catalog.json    467       filtre itemTypeId=812
    effect_to_state_mapping.json     575       filtre actionId=304
    equipmentItemTypes.json          ~20       idem
    itemProperties.json              ~24       idem
    recipeCategories.json            ~15       idem
    itemTypes.json                   ~50       idem
    effects.json                     INTERDIT  403 Forbidden

---

## Decompilation wakfu-client.jar

    Metrique                 Valeur
    Classes dans le JAR      18 979
    Fichiers .java generes   18 979
    Taille source totale     86.8 MB
    Duree decompilation      03:43
    Outil                    CFR 0.152 (java -Xmx4g)
    Classes reseau           1 917
    Classes items            274
    Classes effets           2 279
    Classes marche           109
    Classes serialiseurs     2 005

    Index disponibles dans docs/RND/decompiled/wakfu-src/_MAP/ :
    STATS.md, INDEX_CLASSES.md, INDEX_NETWORK.md, INDEX_ITEMS.md,
    INDEX_EFFECTS.md, INDEX_MARKET.md, INDEX_SERIALIZERS.md, INDEX_HERITAGE.md

---

## Identifiants confirmes

### Personnages

    Nom                    ID         Breed  BreedId
    L'Immortel             3111456    Sram   4
    Divinite Du Sacrifice  5832637    Sacrieur 11
    Divinite Rolex         5832820    Xelor  5
    Account ID             135009704

### Zones (worldId)

    ID    Nom
    9     PERSONAL_SPACE (havre-sac)
    527   Zone farming
    862   Zone inconnue
    999   Ogrest collaboratif
    1089  Biblio-teleport hub
    1135  Entree espace personnel
    1136  HDV
    436   Inconnu
    437   Inconnu
    440   Inconnu
    1252  Inconnu

### HDV

    Board IDs : 31546, 31547 (Sufokia, les deux valides)
    Protobuf sell : msgId 12294, classe clX -> mg -> mc entries
    Protobuf buy  : msgId 13653, classe clU -> mi_0 -> mE entries

---

## Conventions de documentation

    Emplacement              Usage
    docs/                    Documentation projet (publique, versionnee)
    docs/RND/                Recherche et developpement (specs, POCs)
    docs/RND/decompiled/     Sources decompiless (gitignore recommande)
    memory/                  Documents LLM (protocole, briefings, formulaires)
    agent/logs/runs/         Logs de sessions R&D (temporaire)

    Nommage des fichiers RND :
    XX-NOM_EN_MAJUSCULES.md  ou XX = numero de chapitre (01-10)

    Statuts :
    VALIDE    = teste et confirme par le code source ou en jeu
    PARTIEL   = partiellement verifie, certains points en suspens
    EN COURS  = travail actif
    BLOQUE    = necessite une action externe ou une decouverte

---

## Historique des mises a jour

    Date        Auteur     Action
    2026-03-18  Sam+LLM    Creation initiale, sessions d'ecoute
    2026-03-20  Sam+LLM    POC HDV valide, pipeline logs
    2026-03-21  Sam+LLM    Decompilation complete (18 979 classes)
    2026-03-21  Sam+LLM    Protocol items decode (uy_1, yd_2, yf_1, ye_2)
    2026-03-21  Sam+LLM    Protobuf HDV reconstruit (mg, mi_0, mc, mE, mk)
    2026-03-21  Sam+LLM    Documentation complete generee (4 fichiers)
