# CONTEXT BRIEFING — WakfuAssistant

> Source de vérité pour tout LLM opérant sur ce projet.
> Dernière mise à jour : 2026-03-21
> Responsable projet : Sam (Product Owner)

---

## 1. Vision

WakfuAssistant est un overlay de bureau pour le MMORPG Wakfu. Capture temps réel des données du jeu (logs texte + paquets Netty via agent Java) transformées en informations exploitables : économie, progression, combat, intelligence de marché (arbitrage HDV, coûts de craft, châsses/enchantements). Ambition : meilleure application cross-game d'analyse et d'assistance.

## 2. Stack technique

Distribution : Tauri v2 (~10-15 MB NSIS). Frontend : SolidJS + Vite + TailwindCSS v4 + TypeScript. Backend : Rust (log_watcher notify-rs, log_parser 20 regex, state_machine FSM, database rusqlite WAL, cdn_cache reqwest, win32_overlay windows crate). IPC : Tauri Commands + Events. Agent externe : Java Byte-Buddy V3 injection Netty dans client Wakfu, sortie fichiers protobuf sur disque. Serveur futur : Axum Rust + PostgreSQL sur Render.com.

## 3. Structure du repository (branche master)

agent/ : WakfuSpyAgent.java 13KB, ChannelReadAdvice.java 10KB, PipelineAdvice.java 3KB. docs/ARCHITECTURE.md 17KB. docs/RND/ : 11 documents R&D totalisant ~200KB, formulaires, scripts POC dans sous-dossiers poc-hdv, poc-extractioninventairehavresac, poc-database, poc-javaagent, poc-conceptscripts. src-tauri/src/commands/ : cdn_commands.rs 1.9KB, log_commands.rs 1.4KB, overlay_commands.rs 3.8KB, pipeline.rs 2.7KB, session.rs 725B, mod.rs 105B. src-tauri/src/services/ : cdn_cache.rs 4KB, database.rs 1KB, log_parser.rs 30.6KB, log_watcher.rs 9.6KB, state_machine.rs 11KB, win32_overlay.rs 11.9KB, mod.rs 124B. src-tauri/src/models/ : game_event.rs 2.2KB, mod.rs 20B. src-tauri/src/migrations/ : 001_initial.sql 1.9KB, 002_cdn_cache.sql. src/ : App.tsx 6.8KB, index.tsx 276B. src/components/tabs/ : CharacterTab.tsx 5.3KB, CombatTab.tsx 2KB, EconomyTab.tsx 2KB SQUELETTE, OptionsTab.tsx 7.7KB, ProfessionsTab.tsx 829B PLACEHOLDER VIDE. src/stores/ : sessionStore.ts 3.6KB, widgetStore.ts 884B. src/lib/ : logger.ts 3.4KB, overlayTracker.ts 17.4KB, settings.ts 1.8KB, shortcuts.ts 1.3KB, tauri.ts 3.7KB, tray.ts 1.8KB.

## 4. Pipeline de données

Flux principal : fichiers wakfu.log et wakfu_chat.log dans %APPDATA%/zaap/gamesLogs/wakfu/logs/ → log_watcher.rs (notify-rs ReadDirectoryChangesW 200ms debounce + timer sécurité 2s) → log_parser.rs (20 patterns regex versionnés, registre PatternEntry avec nom, version, source, regex, extract, exemples) → state_machine.rs (FSM Offline→Loading→InGame→InCombat→Disconnected) → database rusqlite (INSERT game_events, UPDATE sessions) + Tauri Events emit vers Frontend SolidJS temps réel.

Flux secondaire NON connecté au pipeline Rust : Client Wakfu JVM → Agent Byte-Buddy V3 hook channelRead0 Netty → fichiers protobuf disque (market_v3_proto.log, spy_*.txt) → Scripts PowerShell (sync_hdv_to_sqlite.ps1, export_hdv_readable.ps1) → hdv_market.db SQLite séparée.

## 5. Base SQLite état actuel

Deux migrations appliquées via database.rs run_migrations() avec include_str!. Tables migration 001 : migrations, game_sessions (id TEXT PK, character_name, server_name, started_at, ended_at, total_kamas_gained/spent, total_xp_gained, total_combats, total_victories), game_events (id AUTOINCREMENT, session_id FK, timestamp, event_type, event_data JSON, log_source, synced), economy_snapshots (id, session_id, timestamp, kamas_balance, delta, source), profession_progress (id, character_name, profession_name, current_level, total_xp, last_updated, UNIQUE character+profession), cdn_items_cache (item_id PK, data TEXT, cached_at, cdn_version). Tables migration 002 : cdn_metadata (key TEXT PK, value TEXT, updated_at), items_cache (id PK, name_fr, name_en, level, item_type_id, rarity). Pragmas : journal_mode=WAL, synchronous=NORMAL, cache_size=-20000, foreign_keys=ON, busy_timeout=5000, temp_store=MEMORY.

Tables MANQUANTES à créer : recipes_cache, recipe_ingredients_cache, recipe_results_cache (priorité 1), hdv_offers, hdv_price_history, craft_costs (priorité 2+).

## 6. CDN Ankama source de données publique

URL config : https://wakfu.cdn.ankama.com/gamedata/config.json. Version jeu : 1.91.1.53. URL pattern : https://wakfu.cdn.ankama.com/gamedata/{version}/{type}.json. Intégré dans cdn_cache.rs : items.json. À intégrer : recipes.json (id, category, level, xpRatio), recipeIngredients.json (recipeId, itemId, quantity, ingredientOrder), recipeResults.json (recipeId, itemId, quantity). Disponibles non prioritaires : actions.json, states.json, equipmentItemTypes.json, jobsItems.json. Exemple recipeIngredients : {"recipeId":1160,"itemId":5439,"quantity":3,"ingredientOrder":0}.

## 7. Modèle de données Wakfu gameplay

### 7.1 Rareté 8 niveaux
0 Common blanc, 1 Unusual vert, 2 Rare orange max 2 sockets base, 3 Mythical jaune max 3 sockets base, 4 Legendary max 4 sockets base, 5 Relic rose max 4 sockets 1 équipé max sublimation spéciale possible, 6 Epic violet max 4 sockets 1 équipé max sublimation spéciale possible, 7 PvP. Champ rarity int dans items.json stocké dans items_cache. On peut sacrifier un item même rareté même niveau à l'autel d'enchantement pour débloquer jusqu'à 4 sockets et changer les couleurs. Sources : wakfu.fandom.com/wiki/Item_Rarity, devblog enchantement mai 2025.

### 7.2 Châsses sockets 4 types
Rouge carré : Earth Res, Berserk Mastery, Distance Mastery, Melee Mastery. Bleu triangle : Air Res, Elemental Mastery, HP, Healing Mastery, Lock, Water Res. Vert hexagone : Critical Mastery, Dodge, Fire Res, Initiative, Rear Mastery. Blanc/Jaune rond : JOKER accepte tout enchantement. 3 châsses blanches = accès quasi toutes sublimations. Sockets attribuées aléatoirement à l'identification. Sources : wakfu.wiki.gg/wiki/Enchantment, devblog enchantement.

### 7.3 Sublimations deux catégories coexistantes
A. Sublimation classique (toute rareté) : nécessite 3 sockets dans un ordre de couleur précis (ex Berserk Block = Bleu-Vert-Bleu), blanc remplace toute couleur, appliquée via parchemin, 1 par item. B. Sublimation épique ou relique (rareté Relic/Epic UNIQUEMENT) : s'ajoute EN PLUS de la classique, appliquée via parchemin dédié, 1 par item. Donc item Relic ou Epic peut porter sublimation classique + sublimation épique/relique simultanément. Items rareté inférieure ne peuvent PAS porter de sublimation spéciale. Source : wakfu.wiki.gg/wiki/Sublimation.

### 7.4 Impact valorisation HDV
Prix item dépend de : rareté + nombre sockets + couleurs sockets + ordre sockets + sublimation classique + sublimation spéciale. Filtre HDV in-game permet recherche par couleur socket et type sublimation. Ancien POC arbitrage ignorait châsses → valorisations fausses pour équipements. Ressources/consommables non affectés.

## 8. POCs existants

### 8.1 POC Logs gameplay VALIDÉ
Pipeline complet log_watcher → log_parser → FSM → SQLite → UI. 16 tests unitaires passent. 20 patterns regex couvrent l'essentiel.

### 8.2 POC Coffre/Havre-sac VALIDÉ
Retraits via csf AddItemOperation{m_refId, m_qty, m_bagId}. Dépôts via cso{duS=uniqueId, bol=position} sans refId, mapping progressif uid→refId. Mapping persistant uid_refid_mapping.json. Scripts actifs : chest_poc_v5.ps1, check_mapping.ps1. Limite : dépôts ne portent pas le refId.

### 8.3 POC HDV VALIDÉ
Protobuf IDs : ventes 12294, achats 13653. Base hdv_market.db opérationnelle. 82918 offres vente, 4408 offres achat observées. Scripts : sync_hdv_to_sqlite.ps1, export_hdv_readable.ps1. Distinction item_ref_id vs offer_uid verrouillée.

### 8.4 Point critique résolu
item_ref_id = identité objet (ex 26599 = Amulette du Bouftou). offer_uid = identité offre marché (unique par listing). Ne JAMAIS confondre.

## 9. Trous identifiés

1. CDN recettes non intégrées (cdn_cache.rs, database.rs) → impossible calculer coûts craft. 2. Pas de pont Agent Java → Rust, aucun watcher pour market_v3_proto.log → deux systèmes déconnectés. 3. Pas de tables HDV dans Tauri DB → pas de données marché dans overlay. 4. Modèle châsses/enchantements/sublimations absent → valorisation HDV fausse pour équipements. 5. EconomyTab squelette, ProfessionsTab vide → UI inutilisable économie/métiers. 6. Tests insuffisants : 16 tests Rust, 0 test CDN, 0 test DB, 0 test frontend. 7. Fichiers décrits dans ARCHITECTURE.md absents du repo : combat.rs, economy.rs, professions.rs, settings.rs, community_sync.rs, persistence.rs, models session/combat/profession/economy, stores combatStore/economyStore/settingsStore, lib/events.ts, types/index.ts.

## 10. Protocoles obligatoires

### 10.1 Never Break (docs/RND/11 - Protocole_NonRegression_NeverBreak.md)
Gate 1 scope écrit + baseline. Gate 2 changement minimal atomique. Gate 3 vérification immédiate. Gate 4 validation utilisateur. Gate 5 publication + doc.

### 10.2 LLM Operating Protocol (docs/RND/10 - LLM_Operating_Protocol.md)
Mode Compact par défaut. 1 tâche in-progress à la fois. Preuve obligatoire. Format sortie : Action/Résultat/Preuve/Prochaine étape. Aucune conclusion sans preuve.

### 10.3 Règles absolues
Ne JAMAIS confondre item_ref_id et offer_uid. Ne JAMAIS mettre de placeholder ou TODO dans le code. Ne JAMAIS modifier un fichier hors scope de la mission. Toujours documenter dans docs/RND/SESSION_LOG_{id}.md. Toujours vérifier cargo test après modification.

## 11. Priorités de développement ordre fixé

1. Métiers/Recettes : intégrer recipes, recipeIngredients, recipeResults depuis CDN. 2. Prix HDV : pont agent Java → Rust, tables HDV dans Tauri DB. 3. Inventaire : unifier POC coffre avec pipeline principal. 4. Sync back/front : aligner vision technique et vision utilisateur.

## 12. Conventions

Code en anglais. UI et documentation en français. Commits en français messages clairs. Tests obligatoires pour chaque service Rust #[cfg(test)]. Logging via tracing crate avec rotation tracing-appender. CHANGELOG.md mis à jour à chaque changement.
