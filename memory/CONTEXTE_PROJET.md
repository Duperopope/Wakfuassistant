# ====================================================
# MEMOIRE PROJET - Wakfu Assistant
# Derniere mise a jour: 2026-03-28 13:51
# COLLE CE FICHIER AU DEBUT DE CHAQUE NOUVELLE CONVERSATION
# ====================================================

## REGLES ABSOLUES POUR L'ASSISTANT
1. TOUTE commande PowerShell doit se terminer par | Set-Clipboard
2. L'utilisateur colle dans le terminal, il ne code PAS
3. Jamais de placeholder - tout doit etre fonctionnel
4. Expliquer clairement ce que fait chaque script
5. Toujours documenter et logger

## ARCHITECTURE DU PROJET
- Racine: H:\Code\Wakfuassistant
- Git: branche master, tag stable: stable-v1.0_20260328
- PC: AMD 5700X3D, 32GB RAM, 1TB SSD

## MODULES EN PRODUCTION (tous actifs)
1. Agent Espion: agent/wakfu-spy-agent.jar + live_decoder.py
2. Ranking: tools/weights_api.py -> port 8042
3. Optimizer: tools/build_optimizer_v6.ps1 (v8.3, 72.7KB)
4. Simulateur: build-generator/index.html (Sram Meta v4.0)
5. Overlay: overlay/ (Electron, construit en 12h - NE PAS TOUCHER)
6. Marche HDV: hdv_market.db (70MB) -> port 8080

## FICHIERS CRITIQUES (14 hashes SHA256 dans docs/integrity_hashes.json)
- tools/build_optimizer_v6.ps1
- tools/weights_api.py
- tools/calculate_weights.py
- build-generator/index.html
- build-generator/equipment.html
- build-generator/js/damage-engine.js
- overlay/main.js + index.html + package.json
- agent/live_decoder.py
- cdn_items_full.json (symlink -> logs/)
- cdn_recipes.json (symlink -> logs/)
- cdn_recipe_ingredients.json (symlink -> logs/)
- market_prices.json (symlink -> logs/)

## SECURITE CIA EN PLACE
- Confidentialite: scan secrets OK, dossier secrets/.env
- Integrite: SHA256, tag Git, CIA-PROTECTION.ps1
- Disponibilite: backup Robocopy sur E:\, archive ZIP dans backups/
- Nettoyage: 266MB archives dans _archive/

## DONNEES
- 6365 fichiers joueurs dans logs/players/
- 9417 items dans hdv_market.db
- CDN items, recettes, ingredients dans logs/

## SCRIPTS UTILITAIRES
- CIA-PROTECTION.ps1 (audit securite)
- NETTOYAGE-ARTEFACTS.ps1 (menage securise)
- tools/VERIF-INTEGRITE.ps1 (check rapide)
- tools/LOAD-SECRETS.ps1 (charger .env)

## HISTORIQUE DES DECISIONS
- Overlay Electron = version finale (pas Tauri)
- src-tauri/ et src/ = abandonnes (9 jours sans modif)
- Maven pour Java (pas Gradle)
- PowerShell pour l'optimizer (pas encore migre en web)
- Symlinks pour les fichiers CDN a la racine

## TODO EN ATTENTE
A. Integrer donnees CDN dans equipment.html (icones, stats, sets)
B. Consolider services en une seule UI (Phase 2)
C. Migration optimizer PowerShell -> web (Phase 3)
