# Wakfu Assistant — Index Central de Documentation

> **Derniere mise a jour** : 2026-03-23
> **Distributeur unique** : ce fichier est le point d'entree de toute la documentation
> **Convention statuts** : VALIDE | PARTIEL | BLOQUE | EN COURS | AUDIT_REQUIS

---

## Navigation rapide

    [README]                   -> ../README.md
    [ARCHITECTURE]             -> 00-ARCHITECTURE.md
    [CHANGELOG]                -> ../CHANGELOG.md
    [01 SOURCES ET FORMATS]    -> 01-SOURCES_ET_FORMATS.md        VALIDE
    [02 JOURNAUX ECOUTE]       -> 02-JOURNAUX_ECOUTE.md           VALIDE
    [03 POC LOGS PIPELINE]     -> 03-POC_LOGS_PIPELINE.md         VALIDE
    [04 COMMANDES SYNC]        -> 04-COMMANDES_SYNC.md            PARTIEL
    [05 POC INVENTAIRE]        -> 05-POC_INVENTAIRE.md            EN COURS
    [06 POC HDV]               -> 06-POC_HDV.md                   VALIDE
    [07 CONCEPT ECOSYSTEME]    -> 07-CONCEPT_ECOSYSTEME.md        VALIDE
    [08 PROTOCOL RESEAU]       -> 08-PROTOCOL_RESEAU.md           VALIDE
    [09 PROTOCOL ITEMS]        -> 09-PROTOCOL_ITEMS.md            VALIDE
    [10 TODO PROCHAINE SESSION]-> 10-TODO_PROCHAINE_SESSION.md    EN COURS
    [11 HDV ENCHANTEMENTS]     -> 11-HDV_ENCHANTEMENTS.md         VALIDE
    [12 CONTRADICTIONS]        -> 12-CONTRADICTIONS.md            EN COURS
    [13 INTERFACE UI]          -> 13-INTERFACE_UI.md              VALIDE
    [14 HDV PROTOCOL REFERENCE]-> 14-HDV_PROTOCOL_REFERENCE.md   VALIDE
    [15 CRAFT ECONOMY]         -> 15-CRAFT_ECONOMY_REFERENCE.md  VALIDE
    [16 PROTOCOL DISCOVERIES]  -> 16-PROTOCOL_DISCOVERIES.md     PARTIEL
    [PROTOCOL SERIALIZATION]   -> ../memory/PROTOCOL_ITEMS_SERIALIZATION.md  VALIDE

    [AUDIT V2 CRAFT ECONOMY]   -> ../rnd/AUDIT-CRAFT_ECONOMY_V2.md  AUDIT_REQUIS

---

## Arborescence du projet

    H:\Code\Wakfuassistant\
    +-- README.md                          Presentation du projet
    +-- CHANGELOG.md                       Journal des modifications
    +-- package.json                       Config npm (SolidJS frontend)
    |
    +-- docs\
    |   +-- INDEX.md                       << CE FICHIER (distributeur unique)
    |   +-- 00-ARCHITECTURE.md            Architecture technique Tauri v2
    |   +-- 01-SOURCES_ET_FORMATS.md      Sources de donnees (logs, CDN, Netty)
    |   +-- 02-JOURNAUX_ECOUTE.md         Observations terrain sessions 18-21/03
    |   +-- 03-POC_LOGS_PIPELINE.md       POC parsing logs -> GameEvent
    |   +-- 04-COMMANDES_SYNC.md          Commandes de synchronisation
    |   +-- 05-POC_INVENTAIRE.md          POC inventaire (csf/cso)
    |   +-- 06-POC_HDV.md                 POC HDV (VALIDE: 82918 offres)
    |   +-- 07-CONCEPT_ECOSYSTEME.md      Concept ecosysteme global
    |   +-- 08-PROTOCOL_RESEAU.md         Mapping 85 types de messages
    |   +-- 09-PROTOCOL_ITEMS.md          Serialisation items (uy_1, yd_2)
    |   +-- 10-TODO_PROCHAINE_SESSION.md  Taches et pistes a explorer
    |   +-- 11-HDV_ENCHANTEMENTS.md       Mapping complet enchantements HDV
    |   +-- 12-CONTRADICTIONS.md          Contradictions et gaps identifies
    |   +-- 13-INTERFACE_UI.md            Systeme UI overlay dual-window v4
    |   +-- 14-HDV_PROTOCOL_REFERENCE.md  Reference capture HDV, protobuf, SQLite
    |   +-- 15-CRAFT_ECONOMY_REFERENCE.md Reference calcul rentabilite crafts
    |   +-- 16-PROTOCOL_DISCOVERIES.md    Decouvertes incrementales protocole
    |   |
    +-- rnd\                              R&D uniquement (scripts, data, code POC)
    |   +-- AUDIT-CRAFT_ECONOMY_V2.md     AUDIT_REQUIS — fichier POC corrompu
    |   +-- decompiled\
    |   |   |   +-- cfr.jar              Decompilateur CFR 0.152
    |   |   |   +-- wakfu-src\           18 979 fichiers .java (86.8 MB)
    |   |   |       +-- _MAP\
    |   |   |           +-- STATS.md          Statistiques decompilation
    |   |   |           +-- INDEX_CLASSES.md  Toutes les classes
    |   |   |           +-- INDEX_NETWORK.md  1 917 classes reseau
    |   |   |           +-- INDEX_ITEMS.md    274 classes items
    |   |   |           +-- INDEX_EFFECTS.md  2 279 classes effets
    |   |   |           +-- INDEX_MARKET.md   109 classes marche
    |   |   |           +-- INDEX_SERIALIZERS.md  2 005 serialiseurs
    |   |   |           +-- INDEX_HERITAGE.md Arbre d'heritage
    |   |   +-- poc-hdv\                 Scripts HDV et agent Java source
    |   |   +-- poc-conceptscripts\      Scripts live-monitor, XP, etc.
    |   |   +-- poc-database\            Versions anterieures DB
    |   |   +-- poc-extractioninventairehavresac\
    |   |   +-- poc-javaagent\
    |   |   +-- data\                    Donnees CDN brutes (json)
    |   |   +-- archives\
    |
    +-- memory\
    |   +-- PROTOCOL_ITEMS_SERIALIZATION.md  Reference complete protocole
    |   +-- MEMORY.md                        Index memoire LLM
    |   +-- forms\                           Formulaires et briefings LLM
    |
    +-- agent\
    |   +-- wakfu-spy-agent.jar              Agent ByteBuddy principal
    |   +-- src\main\java\                   Sources Java de l'agent
    |
    +-- logs\
    |   +-- hdv_market.db                    Base SQLite HDV
    |   +-- craft_economy.db                 Base crafts + rentabilite
    |   +-- wakfu_permanent.db               Niveaux metiers
    |   +-- market_v3_proto.log              Captures protobuf HDV
    |
    +-- src\                                 Frontend SolidJS
    +-- src-tauri\                           Backend Rust (Tauri v2)

---

## Statut des composants

### Stack principale

    Composant              Statut     Details
    Tauri v2 overlay       VALIDE     Boot OK, 26 tests Rust, NSIS installer
    SolidJS frontend       VALIDE     dual-window, 5 tabs, WidgetBay v4
    Win32 overlay          VALIDE     Transparent, click-through partiel NCHITTEST
    SQLite CDN cache       VALIDE     Cache items/actions/states
    Java ByteBuddy agent   VALIDE     Interception Netty fonctionnelle

### POCs valides

    POC                    Statut     Resultats cles
    HDV (06)               VALIDE     82 918 offres, protobuf decode, SQLite OK
    Logs Pipeline (03)     VALIDE     20 regex patterns, FSM, GameEvent
    Protocol reseau (08)   VALIDE     85 message types, 3 handlers
    Protocol items (09)    VALIDE     Format binaire 100% decode

### En cours

    Composant              Statut     Bloqueur
    Inventaire (05)        EN COURS   Necessite hook fga_0.eM()
    Decodage CRU (13668)   EN COURS   Blob opaque, passe par evx_2
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

    Index disponibles dans rnd/decompiled/wakfu-src/_MAP/

---

## Identifiants confirmes

### Personnages

    Nom                    ID         Breed     BreedId
    L'Immortel             3111456    Sram      4
    Divinite Du Sacrifice  5832637    Sacrieur  11
    Divinite Rolex         5832820    Xelor     5
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
    docs/                    Documentation projet (XX-TITRE.md + INDEX.md + ARCHITECTURE.md)
    rnd/                     R&D uniquement : scripts, data brute, code POC, decompiles
    memory/                  Documents LLM (protocole, briefings, formulaires)

    Nommage fichiers docs/ :
    XX-TITRE_EN_MAJUSCULES.md   XX = numero a deux chiffres (01-99), sans espace, sans tiret dans le prefixe
    AUDIT-TITRE.md              Fichiers en attente d'audit ou corrompus
    Pas d'espaces dans le prefixe numerique — garantit un tri correct dans Windows et VSCode

    Titres de worklogs :
    WORKLOG-YYYY-MM-DD-[COMPOSANT]-[TYPE].md
    TYPE = BUG_FIX | FEATURE | REFACTOR | SESSION_RND | ARCHITECTURE | AUDIT
    Exemple : WORKLOG-2026-03-23-OVERLAY-BUG_FIX.md

    Statuts :
    VALIDE       = teste et confirme par le code source ou en jeu
    PARTIEL      = partiellement verifie, certains points en suspens
    EN COURS     = travail actif
    BLOQUE       = necessite une action externe ou une decouverte
    AUDIT_REQUIS = contenu non valide, a verifier avant utilisation

---

## Historique des mises a jour

    Date        Auteur     Action
    2026-03-18  Sam+LLM    Creation initiale, sessions d'ecoute
    2026-03-20  Sam+LLM    POC HDV valide, pipeline logs
    2026-03-21  Sam+LLM    Decompilation complete (18 979 classes)
    2026-03-21  Sam+LLM    Protocol items decode (uy_1, yd_2, yf_1, ye_2)
    2026-03-21  Sam+LLM    Protobuf HDV reconstruit (mg, mi_0, mc, mE, mk)
    2026-03-21  Sam+LLM    Documentation complete generee (4 fichiers)
    2026-03-22  Sam+LLM    HDV enchantements, craft economy reference
    2026-03-23  Sam+LLM    Restructuration docs/ (migration depuis RND/), 13-INTERFACE_UI, AUDIT-CRAFT_ECONOMY_V2
    2026-03-23  Sam+LLM    docs/RND/ deplace vers rnd/ racine, references mises a jour
