# Wakfu Assistant - Craft Economy : Reference d'implementation
# Documentation technique complete - Metiers et HDV
# Derniere mise a jour : 2026-03-22

---

## Table des matieres

1. Vue d'ensemble
2. Sources de donnees CDN
3. Script de build (BUILD_CRAFT_DATABASE_V2.ps1)
4. Schema de la base craft_economy.db
5. Algorithme de calcul de rentabilite
6. Algorithme de panier greedy (basket fill)
7. Bugs rencontres et corrections
8. Resolution des noms d'items
9. Integration avec le pipeline HDV
10. Resultats et metriques
11. Limitations connues
12. Requetes SQL utiles
13. Migration backend (Turso)
14. Evolutions prevues (scope metiers/HDV uniquement)
15. Fichiers et chemins de reference

---

## 1. Vue d'ensemble

Le systeme d'artisanat calcule la rentabilite de chaque recette de craft
du jeu Wakfu en croisant les donnees CDN Ankama (recettes, ingredients,
items) avec les prix reels captures a l'HDV (Hotel des Ventes).

Le systeme repond a quatre questions :
- Quel craft me rapporte le plus de kamas ?
- Quel craft me coute le moins cher ?
- Lequel me rapporte le plus de points d'XP metier ?
- Lesquels me rapportent de l'XP metier ET sont rentables ?

Le pipeline fonctionne entierement en local, sans serveur distant.
Les donnees sont stockees dans deux bases SQLite :

- hdv_market.db : prix bruts captures par l'agent Java (voir HDV_PROTOCOL_REFERENCE.md)
- craft_economy.db : base enrichie combinant CDN + prix HDV + calculs de rentabilite

Le script principal est BUILD_CRAFT_DATABASE_V2.ps1. Il s'execute en environ
12 secondes et produit une base de 3.4 MB contenant 5 543 recettes analysees.

### 1.1 Diagramme d'architecture

CDN Ankama (v1.91.1.53)
  |-- recipes.json + recipeResults.json + recipeIngredients.json
  |-- items.json (8324 equipements)
  |-- jobsItems.json (8576 ressources craft)
  |-- resources.json (170 ressources recoltables)
  |
  v
BUILD_CRAFT_DATABASE_V2.ps1
  |
  +--> craft_economy.db (SQLite)
  |      |-- jobs (14 metiers + niveau joueur)
  |      |-- items (noms FR + niveaux + raretes)
  |      |-- recipes (recettes + xp_ratio)
  |      |-- recipe_ingredients (composants + quantites)
  |      |-- market_prices (prix HDV par serveur)
  |      |-- build_meta (version, serveur, date, config)
  |      |-- VIEW craft_cost
  |      |-- VIEW profitable_crafts
  |      |-- VIEW cheapest_xp
  |      |-- VIEW craftable_profitable
  |      |-- VIEW craftable_cheapest_xp
  |
  +--> hdv_market.db (source HDV)

---

## 2. Sources de donnees CDN

Les donnees de reference proviennent du CDN Ankama. Le script les telecharge
automatiquement si la version a change et les cache dans rnd/data/.

### 2.1 Fichiers utilises

cdn_recipes.json : liste des recettes (recipe_id, job_id, level, xp_ratio).
cdn_recipeResults.json : resultat de chaque recette (recipe_id vers item_id produit).
cdn_recipeIngredients.json : ingredients (recipe_id vers liste de item_id + quantity).
cdn_items.json : 8 324 equipements (armes, armures, amulettes) avec noms FR.
cdn_jobsItems.json : 8 576 ressources de craft (bois, minerais, cuirs, farines) avec noms FR.
cdn_resources.json : 170 ressources recoltables (arbres, minerais, plantes) avec noms FR.

### 2.2 Version CDN

URL de configuration : https://wakfu.cdn.ankama.com/gamedata/config.json
Telecharge depuis : https://wakfu.cdn.ankama.com/gamedata/{version}/{type}.json
Le script compare la version CDN avec celle en cache. Si changee, tout est retelecharge.

### 2.3 Relation entre les fichiers

Les trois fichiers de recettes sont lies par recipe_id. Les items sont lies
par item_id (appele item_ref_id dans le contexte HDV). Le champ definition.item.id
dans items.json correspond a definition.id dans jobsItems.json. Les noms FR
se trouvent dans title.fr pour les trois fichiers.

---

## 3. Script de build (BUILD_CRAFT_DATABASE_V2.ps1)

### 3.1 Emplacement

H:\Code\Wakfuassistant\docs\RND\poc-hdv\BUILD_CRAFT_DATABASE_V2.ps1

### 3.2 Parametres

DataDir : dossier des fichiers CDN (defaut : docs\RND\data).
HdvDb : base des prix HDV (defaut : logs\hdv_market.db).
OutputDb : base de sortie (defaut : logs\craft_economy.db).
CdnBase : URL de base CDN (defaut : https://wakfu.cdn.ankama.com/gamedata).
LogDir : dossier des logs Wakfu (defaut : %APPDATA%\zaap\gamesLogs\wakfu\logs).
PermanentDb : base permanente Tauri (defaut : logs\wakfu_permanent.db).
ServerOverride : forcer un serveur (optionnel).

### 3.3 Etapes d'execution (11 phases)

Phase 1 - Detection du serveur actif. Le script lit wakfu.log et cherche le
nom du serveur (pandora, ogrest, rubilax, etc.).

REGLE CRITIQUE : si aucun serveur n'est detecte et que ServerOverride n'est pas
fourni, le script ABANDONNE avec une erreur explicite. Il est INTERDIT d'utiliser
un serveur par defaut. Un joueur connecte sur Ogrest dont les prix seraient tagges
pandora corromprait les donnees multi-serveur de maniere silencieuse. Le script
affiche '[ERREUR] Serveur non detecte. Utilisez -ServerOverride ogrest ou
connectez-vous en jeu.' et quitte avec exit code 1.

Phase 2 - Detection des niveaux de metiers via wakfu_permanent.db.
Chaque metier est identifie par son ID (ex: 71 = Forestier, 74 = Trappeur).
Les metiers non trouves restent a niveau 0.

Phase 3 - Verification de la version CDN via config.json.

Phase 4 - Chargement des donnees CDN. Trois index fusionnes dans un
dictionnaire unique itemIndex[string_id] = {Name, Level, Rarity, TypeId}.
Les cles DOIVENT etre des strings (voir bug 7.5).

Phase 5 - Creation du schema SQLite (DROP IF EXISTS + CREATE).

Phase 6 - Insertion des 14 metiers avec niveaux joueur.

Phase 7 - Insertion des items avec noms FR depuis itemIndex.

Phase 8 - Insertion des recettes et ingredients.

Phase 9 - Import des prix HDV depuis hdv_market.db, filtre par serveur detecte.
Agregation MIN/AVG/MAX/COUNT/SUM separee par cote sell et buy.

Phase 10 - Insertion des metadonnees dans build_meta.

Phase 11 - Affichage des resultats : stats, top 20 rentables, top 20 XP, top 10 hors portee.

### 3.4 Fonctions utilitaires

Invoke-Sql : execute une requete SQL via sqlite3.exe en mode pipeline.
Invoke-SqlScalar : variante retournant une seule valeur.
Escape-Sql : double les apostrophes (L'Immortel devient L''Immortel).

### 3.5 Contrainte critique : position du bloc param()

En PowerShell, param() doit etre le PREMIER statement executable du fichier,
apres un eventuel commentaire bloc. Tout code avant param() provoque une erreur
de parsing. Bug rencontre et corrige le 2026-03-22 (voir section 7.1).

---

## 4. Schema de la base craft_economy.db

### 4.1 Table jobs
id INTEGER PRIMARY KEY : ID du metier CDN (ex: 71 = Forestier).
name_fr TEXT : nom francais du metier.
player_level INTEGER DEFAULT 0 : niveau du joueur dans ce metier.

### 4.2 Table items
id INTEGER PRIMARY KEY : item_ref_id (identique au CDN).
name_fr TEXT : nom francais de l'item.
level INTEGER DEFAULT 0 : niveau requis.
rarity INTEGER DEFAULT 0 : code rarete (0=Common .. 7=Ultime).
type_id INTEGER DEFAULT 0 : categorie d'item.

### 4.3 Table recipes
id INTEGER PRIMARY KEY : recipe_id du CDN.
job_id INTEGER : metier concerne (FK vers jobs.id).
level INTEGER DEFAULT 0 : niveau de la recette.
xp_ratio REAL DEFAULT 0 : ratio XP de base.
result_item_id INTEGER : item produit (FK vers items.id).

### 4.4 Table recipe_ingredients
recipe_id INTEGER : FK vers recipes.id.
item_id INTEGER : FK vers items.id (l'ingredient).
quantity INTEGER DEFAULT 1 : nombre d'unites requises.
PRIMARY KEY (recipe_id, item_id).

### 4.5 Table market_prices
server_id TEXT NOT NULL : identifiant du serveur. JAMAIS de defaut.
item_ref_id INTEGER : FK vers items.id.
side TEXT : sell ou buy.
min_price, avg_price, max_price : prix min/moyen/max observes.
offer_count INTEGER : nombre d'offres.
total_qty INTEGER : quantite totale disponible.
last_seen TEXT : date de derniere observation.
PRIMARY KEY (server_id, item_ref_id, side).

### 4.6 Table build_meta
key TEXT PRIMARY KEY, value TEXT.
Cles : build_date, cdn_version, server_id, server_confidence,
character_name, script_version, job_ID_level (une par metier).

### 4.7 Vue craft_cost
Cout min de fabrication = SUM(quantity * min_price) par ingredient cote sell.
Indique le nombre d'ingredients sans prix (missing_prices).

### 4.8 Vue profitable_crafts
Compare craft_cost vs sell_price. Calcule profit et marge en pourcentage.
Champ craftable = 1 si niveau joueur >= niveau recette.

### 4.9 Vue cheapest_xp
Classe les recettes par kamas_per_xp = craft_cost / xp_ratio.

---

## 5. Algorithme de calcul de rentabilite

### 5.1 Formule de base (vue SQL)
craft_cost = SUM(ingredient_quantity * MIN(ingredient_sell_price))
sell_price = MIN(result_sell_price)
profit = sell_price - craft_cost
margin_pct = (profit / craft_cost) * 100

### 5.2 Limitations
Suppose que toute la quantite est disponible au prix minimum.
Ne tient pas compte de la taxe HDV (5%), du temps de vente, ni de la concurrence.
Le panier greedy (section 6) corrige la premiere limitation.

---

## 6. Algorithme de panier greedy (basket fill)

### 6.1 Principe
On interroge directement hdv_market.db pour chaque ingredient.
Toutes les offres sell sont triees par prix croissant.
On remplit la quantite requise en prenant les moins cheres d'abord.

### 6.2 Exemple concret
Recette Dora Nami : necessite 15 Bois de Sakoura Mystique.
Offres disponibles : 1x a 3k, 42x a 5k, 15x a 15k, 1x a 56k.
Remplissage : 1 unite a 3k + 14 unites a 5k = 73 kamas total.
(vs 75 kamas avec la formule MIN * qty)

### 6.3 Statut d'un ingredient
VIABLE : quantite disponible >= quantite requise.
INCOMPLET : quantite disponible < requise. Cout partiel calcule, manque signale.
AUCUN PRIX : aucune offre sell pour cet ingredient.

### 6.4 Implementation actuelle
Script PowerShell separe interrogeant hdv_market.db.
Objectif : migration en Rust dans l'app Tauri pour calcul temps reel (~10s refresh).

---

## 7. Bugs rencontres et corrections

### 7.1 Invoke-Sql non reconnu (CommandNotFoundException)
Symptome : le script plante a la phase 5.
Cause : commentaire bloc non ferme + Write-Host orphelin avant param().
PowerShell ne peut pas enregistrer les fonctions.
Correction : restructurer le fichier, param() en premier statement.

### 7.2 Erreurs d'assignation lignes 53-58
Symptome : cote gauche non assignable pour DataDir, HdvDb, etc.
Cause : param() pas en premiere position a cause du bug 7.1.
Correction : supprimer les assignations redondantes, garder param() seul.

### 7.3 Apostrophe dans le nom du personnage
Symptome : erreur SQL a l'insertion de L'Immortel dans build_meta.
Cause : apostrophe casse la requete SQL.
Correction : Escape-Sql double les apostrophes (L'Immortel -> L''Immortel).

### 7.4 Quatre mille vingt-cinq items sans nom francais
Symptome : 4025 items sur 10588 ont name_fr vide.
Cause : le script ne chargeait que cdn_items.json (equipements) et cdn_resources.json.
Les 8576 ressources de craft sont dans cdn_jobsItems.json, non charge.
Correction : ajouter le chargement de cdn_jobsItems.json en phase 4.
Les noms de jobsItems ecrasent les noms vides de items.json.
Resultat : items sans nom reduits de 4025 a 2038.

### 7.5 Cles de dictionnaire string vs int
Symptome : apres ajout de jobsItems.json, le nombre d'items indexes ne change pas.
Cause : PowerShell traite itemIndex[1846] (int) et itemIndex['1846'] (string)
comme deux entrees distinctes. Les phases utilisaient des types differents.
Correction : forcer toutes les cles a string avec la notation entre guillemets.

### 7.6 Deux mille trente-huit items restent sans nom
Statut : non resolu. Probablement des equipements obsoletes ou evenementiels
absents de tous les fichiers CDN. Piste : scrape encyclopedie Ankama.

### 7.7 Defaut serveur pandora (CORRIGE)
Symptome : quand aucun serveur n'est detecte, le script utilisait pandora par defaut.
Risque : un joueur sur Ogrest aurait ses prix tagges pandora, corrompant la base.
Correction : le script abandonne avec exit code 1 si aucun serveur n'est detecte
et que ServerOverride n'est pas fourni. Aucun defaut n'est acceptable.

---

## 8. Resolution des noms d'items

### 8.1 Sources de noms (par priorite)
1. cdn_items.json : 8324 equipements avec noms FR.
2. cdn_jobsItems.json : 8576 ressources de craft avec noms FR.
3. cdn_resources.json : 170 ressources recoltables avec noms FR.
4. cdn_scraped_names.json : 20 noms supplementaires (scrape encyclopedie).

### 8.2 Processus de resolution
Phase 4 du build : dictionnaire itemIndex fusionne les trois sources CDN.
Ordre de priorite : items.json d'abord, puis jobsItems.json ecrase les noms
vides, puis resources.json ecrase les noms vides. Cles normalisees en string.

### 8.3 Metriques de couverture (snapshot 2026-03-22)
Total items en base : 10 588.
Items avec nom FR : 8 550 (80.8%).
Items sans nom FR : 2 038 (19.2%).
Couverture des items presents au marche : 94.9%.

### 8.4 Exemples de noms resolus via jobsItems.json
ID 1846 = Minerai de Fer. ID 1889 = Topinambour. ID 2340 = Seau d'eau.
ID 2355 = Fleur de Sel. ID 20589 = Bois de Nuisetier.
ID 26395 = Bois de Sakoura Mystique.

---

## 9. Integration avec le pipeline HDV

### 9.1 Flux de donnees
L'agent Java capture les offres HDV en temps reel et les ecrit dans
market_v3_proto.log. Le script sync_hdv_to_sqlite.ps1 parse ce log et
insere les offres dans hdv_market.db (tables market_latest et
market_observations). Le script BUILD_CRAFT_DATABASE_V2.ps1 importe ensuite
les prix agreges depuis hdv_market.db dans craft_economy.db.

### 9.2 Taggage serveur
Les prix dans craft_economy.db sont tagges avec le server_id detecte dans
wakfu.log. La colonne server_id a ete ajoutee a hdv_market.db (defaut ogrest)
mais sync_hdv_to_sqlite.ps1 ne la remplit pas encore dynamiquement.
TODO : propager la detection serveur dans le script de sync.

### 9.3 Filtre HDV - Afficher les moins chers
Quand ce filtre est actif en jeu, le serveur Wakfu n'envoie qu'une seule offre
par item (la moins chere). L'agent ne capture donc qu'un sous-ensemble.
Pour une capture complete : decocher ce filtre avant de scroller.

### 9.4 Fraicheur des donnees
Les prix refletent l'etat du marche au moment du dernier scroll HDV.
Les offres postees ou retirees apres la capture ne sont pas refletees.
Le timestamp est visible dans build_meta (cle build_date) et dans
le champ updated_at de market_latest.

---

## 10. Resultats et metriques (snapshot 2026-03-22, serveur Ogrest)

### 10.1 Contenu de la base
Metiers : 14 (2 detectes pour L'Immortel : Forestier niv.1, Trappeur niv.1).
Items : 10 588. Recettes : 5 543. Ingredients : 34 571.
Prix importes : 10 620 (sell 8 969, buy 1 651).
Taille de la base : 3 468 KB. Temps de build : 12.5 secondes.

### 10.2 Metriques de rentabilite
Crafts calculables (au moins un ingredient avec prix) : 5 537.
Crafts rentables (profit > 0) : 1 300.
Crafts rentables ET craftables par le joueur : 17.

### 10.3 Top 5 crafts rentables (tous metiers)

Dora Nami (Tailleur niv.0) : vente 9 999k, cout 75k, profit 9 924k.
Ingredients : 15x Bois de Sakoura Mystique a 5 kamas.

Marteau Fou (Maitre d'Armes niv.0) : vente 7 000k, cout 1 542k, profit 5 458k.
Ingredients : 1x Sang de Tofu 92k, 1x Bois de Nuisetier 250k, 4x Sioupere-Glou Grossiere 300k.

Cape d'Halouine (Tailleur niv.0) : vente 4 980k, cout 40k, profit 4 940k.
Ingredients : 10x Bois d'arbre d'Halouine a 4k. INCOMPLET (8 manquants).

Buche de Nowel (Boulanger niv.0) : vente 1 877k, cout 147k, profit 1 730k.
Ingredients : 4x Kamas en Chocolat de Nowel 34k, 1x Branche de Houx 11k.

Monbow Sapin (Forestier niv.0) : vente 9 500k, cout 8 000k, profit 1 500k.
Ingredients : 100x Bois de Sapin Magique a 80k. Marge faible (18.8%).

---

## 11. Limitations connues

### 11.1 Couverture du marche
Le filtre HDV limite la capture a une offre par item.
Solution : decocher le filtre et scroller toutes les pages.

### 11.2 Donnees statiques (snapshot unique)
Les prix refletent un instant T. Solution future : snapshots automatiques
toutes les 30 minutes via le watcher Rust.

### 11.3 Taxe HDV non integree
La taxe de 5% sur les ventes n'est pas soustraite du prix de vente.
Le profit reel est inferieur de 5%. TODO : integrer dans profitable_crafts.

### 11.4 Items sans nom
2 038 items (19.2%) sans nom FR. N'affecte pas le calcul (lie par item_id).

### 11.5 Niveaux de metier potentiellement obsoletes
Lus depuis wakfu_permanent.db, alimentee par parsing de logs texte.
Si la base est absente, niveaux a 0 et tous les crafts marques non craftables.
Solution future : detection via agent Java (messages Netty).

### 11.6 Lancement manuel de l'agent
Actuellement il faut executer LANCER_HDV.bat a la main avant chaque session.
Les donnees ne se mettent a jour que pendant que l'agent tourne.
Solution : watcher automatique Rust/Tauri avec hot-attach.

---

## 12. Requetes SQL utiles

### 12.1 Cout d'une recette specifique
SELECT result_name, craft_cost_min, craft_cost_avg, ingredient_count, missing_prices
FROM craft_cost WHERE result_name LIKE '%Plastron%';

### 12.2 XP la moins chere pour un metier
SELECT result_name, recipe_level, xp_ratio, craft_cost_min, kamas_per_xp
FROM cheapest_xp WHERE job_name = 'Cuisinier' ORDER BY kamas_per_xp LIMIT 10;

### 12.3 Crafts rentables pour un metier
SELECT result_name, result_level, craft_cost_min, sell_price_min,
  profit_vs_sell_min, profit_margin_pct
FROM profitable_crafts WHERE job_name = 'Armurier' AND profit_vs_sell_min > 0
ORDER BY profit_margin_pct DESC LIMIT 10;

### 12.4 Detail des ingredients d'une recette
SELECT i.name_fr, ing.quantity, COALESCE(mp.min_price,0) AS prix_unit,
  ing.quantity * COALESCE(mp.min_price,0) AS sous_total
FROM recipe_ingredients ing
JOIN items i ON i.id = ing.item_id
LEFT JOIN market_prices mp ON mp.item_ref_id = ing.item_id AND mp.side='sell'
WHERE ing.recipe_id = 2060
ORDER BY sous_total DESC;

### 12.5 Crafts rentables ET qui donnent de l'XP
SELECT r.id, i.name_fr AS resultat, j.name_fr AS metier, r.level,
  r.xp_ratio, cc.craft_cost_min, mp.min_price AS sell_price,
  (mp.min_price - cc.craft_cost_min) AS profit,
  ROUND(cc.craft_cost_min / NULLIF(r.xp_ratio, 0), 1) AS kamas_per_xp
FROM recipes r
JOIN craft_cost cc ON cc.recipe_id = r.id
JOIN items i ON i.id = r.result_item_id
JOIN jobs j ON j.id = r.job_id
LEFT JOIN market_prices mp ON mp.item_ref_id = r.result_item_id AND mp.side='sell'
WHERE mp.min_price > cc.craft_cost_min AND r.xp_ratio > 0
  AND r.level <= j.player_level
ORDER BY profit DESC LIMIT 20;

### 12.6 Recettes les plus rentables par kamas ET par XP (score combine)
SELECT r.id, i.name_fr AS resultat, j.name_fr AS metier, r.level,
  (mp.min_price - cc.craft_cost_min) AS profit,
  ROUND(cc.craft_cost_min / NULLIF(r.xp_ratio, 0), 1) AS kamas_per_xp,
  r.xp_ratio
FROM recipes r
JOIN craft_cost cc ON cc.recipe_id = r.id
JOIN items i ON i.id = r.result_item_id
JOIN jobs j ON j.id = r.job_id
LEFT JOIN market_prices mp ON mp.item_ref_id = r.result_item_id AND mp.side='sell'
WHERE mp.min_price > cc.craft_cost_min AND r.xp_ratio > 0
ORDER BY profit DESC, kamas_per_xp ASC LIMIT 20;

---

## 13. Migration backend (Turso)

Le schema est 100% compatible SQLite / libSQL (Turso).
1. turso db create wakfu-economy
2. turso db shell wakfu-economy < schema.sql
3. Les clients Tauri utilisent embedded replicas (local SQLite + sync cloud).
4. Les prix market_prices sont mis a jour par les joueurs (crowdsource).
5. Les donnees CDN sont statiques, mises a jour a chaque patch Wakfu.

---

## 14. Evolutions prevues (scope metiers/HDV uniquement)

### 14.1 Watcher automatique (priorite haute)
Remplacer LANCER_HDV.bat par un watcher Rust integre a Tauri.
Detecte le processus Wakfu, hot-attache l'agent Java, declenche
sync + build automatiquement quand market_v3_proto.log est modifie.

### 14.2 Calcul de panier en Rust (priorite haute)
Migrer l'algorithme de basket fill (section 6) en Rust.
Calcul local, refresh ~10s, lecture directe de hdv_market.db.

### 14.3 Snapshots programmes (priorite moyenne)
Deux modes : court (~2000 pages, ~5 min) et complet (~9000 pages, ~20 min).
Objectif : ~2 snapshots par heure, alternes toutes les 30 minutes.
Declenchement manuel depuis l'interface Tauri.

### 14.4 Integration XP/kama (priorite moyenne)
Utiliser xp_ratio pour calculer un score XP/kama pondere par le niveau
du joueur. Recommander le craft le plus efficient pour monter un metier
en fonction du budget disponible.

### 14.5 Detection niveaux via agent (priorite future)
Migrer la detection des niveaux de metier depuis le parsing de logs texte
vers l'interception directe des messages Netty par l'agent Java.
Les logs texte seront conserves pour verification et calibration.

### 14.6 Taxe HDV dans le calcul (priorite future)
Soustraire 5% du prix de vente dans la vue profitable_crafts.
profit_net = (sell_price * 0.95) - craft_cost.

### 14.7 Inventaire joueur (hors scope actuel)
La detection des items possedes par le joueur (inventaire personnage +
coffre partage multi-personnages/serveurs) necessite une seance de R&D
dediee. Sera developpe sur une branche separee, teste, puis merge en master.
Non documente ici tant que la R&D n'est pas terminee.

---

## 15. Fichiers et chemins de reference

### 15.1 Scripts
BUILD_CRAFT_DATABASE_V2.ps1 : H:\Code\Wakfuassistant\docs\RND\poc-hdv\BUILD_CRAFT_DATABASE_V2.ps1
sync_hdv_to_sqlite.ps1 : H:\Code\Wakfuassistant\docs\RND\poc-hdv\sync_hdv_to_sqlite.ps1
LANCER_HDV.bat : H:\Code\Wakfuassistant\LANCER_HDV.bat

### 15.2 Bases de donnees
craft_economy.db : H:\Code\Wakfuassistant\logs\craft_economy.db
hdv_market.db : H:\Code\Wakfuassistant\logs\hdv_market.db
wakfu_permanent.db : H:\Code\Wakfuassistant\logs\wakfu_permanent.db

### 15.3 Donnees CDN
Dossier : H:\Code\Wakfuassistant\docs\RND\data\
cdn_items.json, cdn_jobsItems.json, cdn_resources.json, cdn_recipes.json,
cdn_recipeResults.json, cdn_recipeIngredients.json, cdn_item_names_index.json.

### 15.4 Logs
market_v3_proto.log : H:\Code\Wakfuassistant\logs\market_v3_proto.log
market_v3.log : H:\Code\Wakfuassistant\logs\market_v3.log

### 15.5 Agent Java
wakfu-spy-agent.jar (actif) : H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar
market-price-agent-v3.jar (ancien) : H:\Code\Wakfuassistant\docs\RND\poc-hdv\agent\build\libs\market-price-agent-v3.jar

### 15.6 Documentation associee
HDV_PROTOCOL_REFERENCE.md : protocole de capture, mapping protobuf, schema hdv_market.db.
ARCHITECTURE_INJECTION.md : decision d'architecture pour l'injection agent (hot-attach).
ARCHITECTURE.md (docs/) : architecture globale de l'application Tauri v2.
CRAFT_ECONOMY_V2_REFERENCE.md (rnd/) : fichier auto-genere a chaque build avec requetes SQL.