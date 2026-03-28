# Wakfu Assistant — Architecture technique
# Derniere mise a jour : 2026-03-23
# Version application : 4.0.4

> Ce document decrit l'etat reel de l'architecture au 2026-03-23.
> Pour le detail du systeme UI, voir 13-INTERFACE_UI.md.
> Pour le detail du pipeline HDV, voir 14-HDV_PROTOCOL_REFERENCE.md et 15-CRAFT_ECONOMY_REFERENCE.md.

---

## Table des matieres

1. Vue d'ensemble
2. Stack technologique
3. Structure du projet
4. Pipeline de donnees (logs -> frontend)
5. Architecture dual-window (overlay)
6. Agent Java ByteBuddy (HDV)
7. IPC Frontend <-> Backend
8. Base de donnees locale (SQLite)
9. Composants implementes vs prevus
10. Conventions

---

## 1. Vue d'ensemble

    +--------------------------------------------------+
    |              WAKFU ASSISTANT v4                   |
    |                                                   |
    |  +-----------+      +------------------------+   |
    |  |  Tauri v2 |      |   Java ByteBuddy       |   |
    |  |  (Rust)   |      |   Agent (HDV capture)  |   |
    |  +-----------+      +------------------------+   |
    |        |                      |                  |
    |        v                      v                  |
    |  +------------------+   +------------------+    |
    |  | SQLite WAL       |   | market_v3_proto  |    |
    |  | wakfu_overlay.db |   | .log             |    |
    |  +------------------+   +------------------+    |
    |        |                      |                  |
    |        v                      v                  |
    |  +------------------------------------------+   |
    |  |  SolidJS frontend (dual-window)           |   |
    |  |  Fenetre main (420x96) + Panel (420x420)  |   |
    |  +------------------------------------------+   |
    +--------------------------------------------------+

Sources d'entree :
- Logs texte Wakfu (%APPDATA%/zaap/gamesLogs/wakfu/logs/) -> pipeline Rust
- Trafic reseau Wakfu intercepte -> agent Java ByteBuddy -> .log -> scripts PowerShell

Pas de serveur communautaire. Tout est local.

---

## 2. Stack technologique

    Composant          Technologie                    Justification
    Framework desktop  Tauri v2                       Installeur ~5 MB, RAM ~50 MB, cold start < 1s
    Backend            Rust                           Performance, acces Win32 natif, zero overhead
    Frontend           SolidJS + Vite                 Reactivite fine-grained sans Virtual DOM
    Styles             TailwindCSS v4                 Utility-first, theming par CSS custom properties
    Typage             TypeScript                     Miroirs des structs Rust dans lib/tauri.ts
    Persistance UI     tauri-plugin-store (JSON)      settings.json dans %APPDATA%/wakfu-overlay/
    Base donnees       rusqlite (SQLite WAL)           wakfu_overlay.db, 3 migrations
    File watching      notify-rs                      ReadDirectoryChangesW natif Windows
    Overlay Win32      windows crate + WndProc        Click-through partiel via NCHITTEST subclass
    Logs structurees   tracing + tracing-appender     Rotation automatique
    Raccourcis globaux tauri-plugin-global-shortcut   F12 meme quand fenetre en arriere-plan
    Systray            tauri-plugin-tray              Minimize vers tray, icone statut
    Instance unique    tauri-plugin-single-instance   Focus fenetre existante si relance
    Agent HDV          Java 11 + ByteBuddy 1.14       Interception Netty sans modifier le JAR Wakfu

---

## 3. Structure du projet

    H:\Code\Wakfuassistant\
    |
    +-- src\                             Frontend SolidJS
    |   +-- App.tsx                      Point d'entree, routing fenetre main/panel
    |   +-- index.tsx                    Bootstrap SolidJS
    |   +-- components\
    |   |   +-- Layout\
    |   |   |   +-- WidgetBay.tsx        Barre de navigation (BottomBar + ControlStrip)
    |   |   +-- tabs\
    |   |   |   +-- CharacterTab.tsx     Stats session, evenements recents
    |   |   |   +-- CombatTab.tsx        Stats combat temps reel
    |   |   |   +-- ProfessionsTab.tsx   Niveaux metiers
    |   |   |   +-- EconomyTab.tsx       Donnees HDV et crafts
    |   |   |   +-- OptionsTab.tsx       Themes, langue, opacite, logs
    |   |   +-- widgets\
    |   |       +-- WidgetFrame.tsx      Wrapper standard widget (label + valeur)
    |   |       +-- KamasBalance.tsx     Balance kamas actuelle
    |   |       +-- KamasSession.tsx     Delta kamas session
    |   |       +-- CombatStats.tsx      Victoires / combats
    |   |       +-- XpGained.tsx         XP total session
    |   |       +-- ParserHealth.tsx     Taux reconnaissance parser
    |   |       +-- CharacterInfo.tsx    Nom personnage + serveur
    |   +-- stores\
    |   |   +-- sessionStore.ts          Store SolidJS + init pipeline Channel
    |   |   +-- widgetStore.ts           Signaux widgets (baySnap, widgetRows)
    |   +-- lib\
    |       +-- tauri.ts                 Wrappers invoke() typés + types miroirs Rust
    |       +-- overlayTracker.ts        Logique overlay : position, CT, panel, pin
    |       +-- settings.ts              Persistance settings + presets themes
    |       +-- shortcuts.ts             Raccourci global F12
    |       +-- logger.ts                Logger structure frontend (categories)
    |       +-- tray.ts                  Icone systray
    |
    +-- src-tauri\
    |   +-- tauri.conf.json              Config fenetres, CSP, bundle NSIS
    |   +-- Cargo.toml
    |   +-- capabilities\main.json       Permissions Tauri v2
    |   +-- src\
    |       +-- main.rs                  Point d'entree (delogue vers lib.rs)
    |       +-- lib.rs                   Setup Tauri, plugins, invoke_handler
    |       +-- commands\
    |       |   +-- session.rs           get_session_stats
    |       |   +-- pipeline.rs          start_log_pipeline, get_parser_health, get_game_state
    |       |   +-- overlay_commands.rs  Overlay, panel v4, click-through, bounds
    |       |   +-- cdn_commands.rs      get_cdn_version, refresh_cdn_cache, get_item_name
    |       |   +-- log_commands.rs      set_verbose_logging, bridge_log
    |       +-- services\
    |       |   +-- log_watcher.rs       notify-rs, detection rotation fichier
    |       |   +-- log_parser.rs        Regex versionnés, registre de patterns, ParserHealth
    |       |   +-- state_machine.rs     FSM : Offline -> Loading -> InGame -> InCombat
    |       |   +-- database.rs          rusqlite, migrations, init WAL
    |       |   +-- cdn_cache.rs         Proxy CDN Ankama, cache items + recipes
    |       |   +-- win32_overlay.rs     WndProc subclass, NCHITTEST, set_window_bounds
    |       +-- models\
    |       |   +-- game_event.rs        Enum GameEvent (KamasGained, XpGained, etc.)
    |       +-- utils\
    |       |   +-- logger.rs            tracing + rotation (tracing-appender)
    |       |   +-- paths.rs             Chemins AppData, logs Wakfu (Steam EN + Ankama FR)
    |       |   +-- constants.rs         APP_VERSION, URLs CDN
    |       +-- migrations\
    |           +-- 001_initial.sql      Tables game_sessions, game_events, session_stats
    |           +-- 002_cdn_cache.sql    Table cdn_items_cache
    |           +-- 003_recipes_cache.sql Table cdn_recipes_cache
    |
    +-- agent\
    |   +-- wakfu-spy-agent.jar          Agent ByteBuddy actif (version compilee)
    |   +-- src\main\java\com\wakfu\     Sources Java
    |
    +-- docs\                            Documentation (voir INDEX.md)
    +-- logs\                            Bases SQLite + logs captures
    +-- memory\                          Documents LLM

---

## 4. Pipeline de donnees (logs -> frontend)

    Fichiers wakfu.log / wakfu_chat.log
    (%APPDATA%/zaap/gamesLogs/wakfu/logs/)
            |
            v
    log_watcher.rs (notify-rs)
      Detecte chaque ecriture via ReadDirectoryChangesW
      Gere la rotation de fichier (nouveau fichier = recommence)
            |
            v
    log_parser.rs (regex crate)
      Patterns versionnés par type d'evenement
      Chaque ligne -> Option<GameEvent>
      Compteur ParserHealth : % lignes reconnues
            |
            v
    state_machine.rs (enum FSM)
      Offline -> Loading -> InGame -> InCombat -> Disconnected
      Met a jour SessionStats en memoire
            |
            +--------------------+
            v                    v
    database.rs              Channel Tauri
    (wakfu_overlay.db)       (streaming temps reel)
    INSERT game_events            |
    UPDATE session_stats          v
                          sessionStore.ts (SolidJS)
                            handleStreamEvent()
                              stateChange -> setGameState()
                              sessionUpdate -> setSession()
                              parserHealth -> setParserHealth()
                              gameEvent -> setRecentEvents()
                                    |
                                    v
                            Composants SolidJS reactifs
                            (CharacterTab, CombatTab, etc.)

### 4.1 Etats de la FSM (GameState)

    Offline      : pas de log detecte
    Loading      : connexion au serveur en cours (server: string)
    InGame       : en jeu (server, character)
    InCombat     : combat en cours (server, character)
    Disconnected : deconnexion detectee (lastServer: string|null)

### 4.2 Sources de logs Wakfu

    Fichier              Contenu                      Evenements extraits
    wakfu_chat.log       Chat, economie, combat        KamasGained/Spent, XpGained, transactions HDV
    wakfu.log            Etat technique du jeu         CharacterSelected, ServerConnected, Disconnected
    wakfu_journal.log    Journal de jeu                Quetes, combats, niveaux

IMPORTANT : le projet supporte deux installations de Wakfu (Steam EN + Ankama FR).
Les chemins sont geres dans paths.rs qui recherche les deux localisations.
Voir 14-HDV_PROTOCOL_REFERENCE.md pour le detail des chemins.

---

## 5. Architecture dual-window (overlay)

L'overlay est compose de deux fenetres Tauri independantes.
Detail complet dans 13-INTERFACE_UI.md.

    Fenetre main (toujours visible)
      Label   : "main"
      Taille  : 420x96 px, decorations: false, transparent: true
      Contenu : WidgetBay (BottomBar 72px + ControlStrip 24px)
      Role    : navigation, controles overlay

    Fenetre panel (a la demande)
      Label   : "panel"
      Taille  : 420x420 px (physique selon scale factor)
      Creee   : invoke create_panel_window() au premier clic
      Ensuite : show/hide via invoke show/hide_panel_window()
      Contenu : onglet actif (character/combat/professions/economy/options)

    Communication inter-fenetres : emit/listen Tauri
      emit("tab-change")    -> panel monte l'onglet correspondant
      emit("opacity-change")-> panel ajuste --panel-opacity
      emit("panel-ready")   -> App.tsx envoie l'etat initial au panel

    Click-through Win32 (win32_overlay.rs)
      WndProc subclass sur la fenetre main
      WM_NCHITTEST intercepte : zone interactive -> HTCLIENT, reste -> HTTRANSPARENT
      Zone interactive par defaut : 420x96 px (toute la barre)
      CT_MODE desactive au demarrage (toute la barre est cliquable)
      F12 global shortcut toggle CT_MODE

---

## 6. Agent Java ByteBuddy (HDV)

Voir 14-HDV_PROTOCOL_REFERENCE.md pour le protocole complet.

    Principe : instrumentation bytecode sans modifier wakfu-client.jar
    Outil    : ByteBuddy 1.14 + Java 11, attache via -javaagent: au lancement
    Cible    : classe Netty de traitement des messages reseau HDV

    Flux de capture :
    Wakfu client -> Netty handler -> ByteBuddy intercept
        -> decode protobuf (offres HDV, enchantements)
        -> ecrit market_v3_proto.log (logs/market_v3_proto.log)
        -> sync_hdv_to_sqlite.ps1 parse le log -> hdv_market.db
        -> BUILD_CRAFT_DATABASE_V2.ps1 -> craft_economy.db

    Fichiers agent :
    agent/wakfu-spy-agent.jar              JAR actif (version compilee)
    rnd/poc-hdv/agent/               Sources Java + Gradle build
    LANCER_HDV.bat.DISABLED               Lanceur (desactive, a reactiver)

    Statut : VALIDE (capture fonctionnelle), lancement manuel requis.
    Evolution prevue : auto-attach depuis le watcher Rust (voir 15-CRAFT_ECONOMY_REFERENCE.md 14.1)

---

## 7. IPC Frontend <-> Backend

### 7.1 Tauri Commands (invoke — requete/reponse)

    Commande                   Module              Role
    get_session_stats          session.rs          Stats de session aggregees
    start_log_pipeline         pipeline.rs         Demarre le watcher + streaming Channel
    get_parser_health          pipeline.rs         Taux de reconnaissance du parser
    get_game_state             pipeline.rs         Etat FSM actuel
    force_log_rescan           pipeline.rs         Force relecture des logs
    get_wakfu_window_info      overlay_commands.rs Detection fenetre Wakfu (WakfuWindowInfo)
    reorder_above_wakfu        overlay_commands.rs Replace l'overlay au-dessus de Wakfu
    toggle_click_through       overlay_commands.rs Active/desactive CT + installe WndProc
    update_interactive_zone    overlay_commands.rs Definit la zone cliquable en mode CT
    set_overlay_always_on_top  overlay_commands.rs AlwaysOnTop sur main + panel
    atomic_set_bounds          overlay_commands.rs Position + taille en un seul appel Win32
    create_panel_window        overlay_commands.rs Cree la fenetre panel (ou la montre si existe)
    show_panel_window          overlay_commands.rs Affiche le panel
    hide_panel_window          overlay_commands.rs Cache le panel
    destroy_panel_window       overlay_commands.rs Detruit la fenetre panel
    position_panel_above_main  overlay_commands.rs Repositionne le panel au-dessus de main
    get_cdn_version            cdn_commands.rs     Version CDN Ankama actuelle
    refresh_cdn_cache          cdn_commands.rs     Force redownload donnees CDN
    get_item_name              cdn_commands.rs     Nom francais d'un item par ID
    refresh_recipes_cache      cdn_commands.rs     Recharge le cache de recettes
    get_recipe_by_item_id      cdn_commands.rs     Recette d'un item par ID
    set_verbose_logging        log_commands.rs     Active/desactive logs detailles Rust
    bridge_log                 log_commands.rs     Log frontend -> tracing Rust (debug)

### 7.2 Channel Tauri (streaming unidirectionnel Rust -> Frontend)

Le pipeline utilise un Channel Tauri (pas des events broadcast).
Un seul channel par session, ouvert par start_log_pipeline().

    Event             Payload                 Declencheur
    gameEvent         GameEventPayload        Chaque evenement de jeu parse
    stateChange       {from, to, details}     Transition FSM
    sessionUpdate     SessionStats            Apres chaque evenement significatif
    parserHealth      ParserHealth            Periodiquement

### 7.3 Events Tauri (broadcast inter-fenetres)

    Event            Emetteur       Recepteur   Contenu
    tab-change       App.tsx (main) PanelView   {tab: TabId|null, open: bool}
    opacity-change   overlayTracker PanelView   {panel: number}
    panel-ready      PanelView      App.tsx     {}

---

## 8. Base de donnees locale (SQLite)

### 8.1 wakfu_overlay.db — base principale Tauri

Chemin : %LOCALAPPDATA%/wakfu-overlay/wakfu_overlay.db
Pragmas : WAL, synchronous=NORMAL, cache_size=-20000 (20MB), foreign_keys=ON,
          busy_timeout=5000ms, temp_store=MEMORY

    Migration              Tables creees
    001_initial.sql        game_sessions, game_events, session_stats
    002_cdn_cache.sql      cdn_items_cache
    003_recipes_cache.sql  cdn_recipes_cache

### 8.2 hdv_market.db — captures HDV

Chemin : logs/hdv_market.db
Alimente par : sync_hdv_to_sqlite.ps1 (parse market_v3_proto.log)

    Table                  Contenu
    market_latest          Derniere offre par item + serveur
    market_observations    Historique toutes offres

### 8.3 craft_economy.db — rentabilite crafts

Chemin : logs/craft_economy.db
Alimente par : BUILD_CRAFT_DATABASE_V2.ps1
Detail complet dans 15-CRAFT_ECONOMY_REFERENCE.md

### 8.4 settings.json — persistance UI

Chemin : %APPDATA%/wakfu-overlay/settings.json
Gere par : tauri-plugin-store (pas SQLite)
Contenu : theme, opacite, position fenetre, langue, pin, verboseLogs

---

## 9. Composants implementes vs prevus

### Implementes et fonctionnels

    Composant                     Statut    Detail
    Log watcher + parser          VALIDE    20+ patterns regex, FSM 5 etats
    Overlay dual-window           VALIDE    main + panel, click-through NCHITTEST
    WidgetBay (navigation)        VALIDE    BottomBar + ControlStrip, expand
    CharacterTab                  VALIDE    Stats session, feed evenements
    OptionsTab                    VALIDE    4 themes, langue, opacite, CDN refresh
    Agent Java HDV                VALIDE    Capture offres + enchantements
    Pipeline HDV PowerShell       VALIDE    Log -> SQLite -> craft_economy.db
    Cache CDN                     VALIDE    Items, recipes (3 migrations)
    Persistance settings          VALIDE    plugin-store, restore position
    Click-through Win32           VALIDE    WndProc subclass, zone interactive
    Themes                        VALIDE    4 presets, CSS custom properties

### En cours ou incomplets

    Composant                     Statut    Bloqueur / note
    CombatTab                     EN COURS  UI presente, donnees combat partielles
    ProfessionsTab                EN COURS  UI presente, niveaux depuis logs
    EconomyTab                    EN COURS  UI presente, tables HDV non connectees
    InventoryTab                  ABSENT    Necessite hook fga_0.eM() (voir 05)
    Auto-attach agent Java        ABSENT    Lancement manuel requis (LANCER_HDV.bat)
    Calcul panier Rust            ABSENT    Algo greedy actuellement en PowerShell
    Snapshots automatiques HDV    ABSENT    Manuel uniquement

### Abandonne depuis la v1

    Composant                     Raison
    Serveur communautaire         Hors scope, non prioritaire
    SettingsTab (ancienne)        Remplace par OptionsTab
    Ancien WidgetBay snap         Remplace par architecture dual-window

---

## 10. Conventions

    Code source      : anglais (noms de variables, fonctions, structs)
    UI et docs       : francais (labels, messages, commentaires doc)
    Commits          : francais, prefixe feat/fix/refactor/docs
    Tests            : obligatoires pour chaque service Rust (#[cfg(test)])
    Logging Rust     : tracing crate, categories explicites (category = "WIN32" etc.)
    Logging frontend : lib/logger.ts, categories (L.ui, L.overlay, L.store, etc.)
    Nommage docs     : XX-TITRE_MAJUSCULES.md (deux chiffres, sans espace dans prefixe)
    Worklogs         : WORKLOG-YYYY-MM-DD-[COMPOSANT]-[TYPE].md
    Statuts docs     : VALIDE | PARTIEL | EN COURS | BLOQUE | AUDIT_REQUIS

---

## Historique des mises a jour

    Date        Action
    2026-03-XX  Creation initiale (architecture planifiee v1)
    2026-03-22  Implementation dual-window, agent Java HDV valide
    2026-03-23  Mise a jour complete — etat reel v4.0.4, suppression composants fictifs
