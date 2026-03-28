# 9 - Concept Ecosysteme RND Unifie

Date: 2026-03-21
Statut: Proposition conceptuelle consolidee
Portee: Regrouper toutes les briques RND en un POC unique, viable et evolutif

---

## 1. Vision

Construire un ecosysteme unifie WakfuAssistant qui transforme des signaux fragmentes (logs jeu, chat, Netty/proto, sync in-game, metadonnees Ankama) en une plateforme unique:

- fiable (source de verite explicite par domaine),
- exploitable par non-codeur,
- extensible vers des usages communautaires,
- pilotable par LLM sans ambiguite.

Objectif concret:
- Un seul flux operable de bout en bout: capture -> normalisation -> stockage -> enrichissement -> restitution -> aide a la decision.

---

## 2. Etat actuel consolide (ce qu'on a deja)

### 2.1 Briques deja valides

1. Telemetrie gameplay via logs (`wakfu.log`, `wakfu_chat.log`): zones, quetes, collecte, combats, erreurs, signaux session.
2. POC havre-sac/coffre: mouvements depot/retrait, mapping progressif uid -> refId.
3. POC HDV structure: capture protobuf, decode, sync SQLite persistante.
4. Exports lisibles non-codeur: CSV/Markdown, enrichissement nom d'objet.
5. Filtres metier/domaines: arbitrage global vs ressources/recoltes uniquement.

### 2.2 Sources de verite actuelles par domaine

1. Prix HDV et offres marche:
   source principale = proto HDV decode + base SQLite.
2. Evenements gameplay session:
   source principale = logs jeu/chat parse.
3. Inventaire/coffre havre-sac:
   source principale = messages operationnels + mapping persistant.
4. Nommage/metadonnees objets:
   source principale = CDN Ankama + cache local.

### 2.3 Point critique deja regle

Le systeme sait desormais distinguer sans ambiguite:

- item_ref_id (identite objet)
- offer_uid (identite offre)

Ce point verrouille la qualite de toutes les analyses HDV.

---

## 3. Probleme a resoudre par le POC unifie

Aujourd'hui, les briques existent mais sont encore percuees comme plusieurs POCs.

Le POC unifie doit:

1. Presenter un contrat de donnees commun.
2. Exposer une seule experience operateur.
3. Produire des livrables business lisibles (decision-ready).
4. Permettre un mode IA-first (LLM peut piloter et expliquer).

---

## 4. Architecture cible en synergie

### 4.1 Vue logique

1. Ingestion Layer
   capte toutes les entrees (logs, proto, sync, metadata CDN).
2. Parsing Layer
   transforme chaque signal en evenement normalise.
3. Storage Layer
   persiste en SQLite avec tables canoniques + historique.
4. Enrichment Layer
   ajoute noms d'objets, types, niveau, contextes map/metier.
5. Intelligence Layer
   calcule KPI, detecte opportunites, classe priorites.
6. Delivery Layer
   sort CSV/MD/tableaux lisibles + scripts de requete.

### 4.2 Principe d'orchestration

Pipeline standard:

1. Capture session (jeu)
2. Sync DB
3. Enrichissement
4. Generation de rapports
5. Recommandations actionnables

---

## 5. Contrat de donnees unifie (proposition)

Tables canoniques minimales:

1. events_raw
   archive brute horodatee de toutes les entrees.
2. events_parsed
   evenements normalises (type, source, payload minimal).
3. market_observations
   historique offres HDV dedoublonne.
4. market_latest
   dernier etat de chaque offre.
5. items_catalog
   referentiel objet (nom, type, niveau, provenance).
6. inventory_flows
   mouvements inventaire/coffre.
7. session_facts
   contexte session (serveur, perso, horaires, zones).
8. derived_opportunities
   opportunites calculees (arbitrage, alertes, watchlist).

Regles minimales:

1. Toute ligne doit avoir source, timestamp, confiance.
2. Toute inference doit conserver le lien vers donnees sources.
3. Toute sortie utilisateur doit etre reproductible via requete.

---

## 6. POC unifie viable (MVP)

Definition de "viable" pour ce projet:

1. Reproductible par non-codeur en moins de 10 minutes.
2. Stable sur plusieurs sessions (incremental + dedoublonnage).
3. Explique ses resultats (traceabilite jusqu'a la source).
4. Sort des artefacts lisibles sans plugin special.

Workflow MVP propose:

1. Lancer capture
2. Jouer et produire du signal
3. Synchroniser
4. Exporter
5. Lire rapport priorise

Livrables MVP obligatoires:

1. Rapport marche global
2. Rapport ressources/recoltes
3. Rapport session gameplay
4. Rapport inventory/coffre
5. Resume executif "quoi faire maintenant"

---

## 7. Ce que l'ecosysteme offre deja (liste non exhaustive)

### 7.1 Economie / HDV

1. Snapshot marche persistant (achats/ventes).
2. Detection automatique achat > vente.
3. Filtrage par familles (ex: ressources uniquement).
4. Export testable en jeu (top opportunites).
5. Historisation pour comparer les sessions.

### 7.2 Gameplay / progression

1. Suivi XP perso/metiers.
2. Detection quetes/challenges (reussite/echec).
3. Chronologie de zones et transitions.
4. Observation des occupations collecte/plantation.

### 7.3 Inventaire / logistique

1. Detection depots/retraits coffre.
2. Construction progressive d'un mapping uid -> refId.
3. Bilan de session inventaire.

### 7.4 Operations / assistance IA

1. Exports lisibles pour non-codeur.
2. Scripts actionnables en un appel.
3. Documentation de reproduction complete.
4. Compatibilite avec un pilotage LLM (explication + action).

### 7.5 Cas d'usage "joueur meta tous domaines" (avec briques verifiees)

Objectif utilisateur:
devenir competitif sur tous les axes (XP, combat, equipement, richesse) avec le systeme tel qu'il existe aujourd'hui.

#### Cas 1 - Monter vite XP personnage et metiers

Ce que les briques permettent deja:

1. Identifier les zones et routines de farm les plus productives via traces session.
2. Mesurer les boucles collecte/combat avec evidences horodatees.
3. Suivre la progression XP metier/perso sur plusieurs sessions.

Comment operer:

1. Jouer une session ciblee XP/collecte.
2. Synchroniser et exporter les rapports session.
3. Comparer les gains par tranche de temps (zones, activites, metiers).
4. Conserver la route la plus rentable en routine standard.

Limite actuelle:
- Le systeme n'optimise pas encore automatiquement la "meilleure route"; il fournit les donnees de decision.

#### Cas 2 - Optimiser le combat (efficacite, regularite)

Ce que les briques permettent deja:

1. Detecter quetes/challenges reussis ou rates.
2. Reconstituer une chronologie combat -> recompense -> transition zone.
3. Qualifier les sessions (stables, interrompues, peu rentables).

Comment operer:

1. Definir une boucle combat cible.
2. Capturer 2 a 3 sessions comparables.
3. Retenir les patterns qui maximisent progression/recompenses.
4. Eliminer les comportements peu rentables (detours, echecs repetes, zones faibles).

Limite actuelle:
- Pas de moteur de recommandation tactique in-fight pour l'instant.

#### Cas 3 - Tendre vers le meilleur equipement

Ce que les briques permettent deja:

1. Observer le marche equipements (offres achat/vente, ecarts de prix).
2. Prioriser les pieces abordables selon budget.
3. Croiser progression richesse + opportunites equipement.

Comment operer:

1. Produire snapshot HDV regulier.
2. Extraire les meilleurs ecarts sur categories equipement.
3. Acheter les pieces sous-cotees par rapport a la demande observee.
4. Reinvestir les profits dans upgrades prioritaires.

Limite importante (connue):
- Les enchantements/gemmes/variantes ne sont pas encore modelises finement; la comparaison equipement est donc partielle.

#### Cas 4 - Devenir le plus riche du serveur

Ce que les briques permettent deja:

1. Construire une vue marche exploitable et persistante.
2. Identifier arbitrages (achat > vente) sur donnees structurees.
3. Isoler un mode "ressources/recoltes" moins bruite (sans biais equipement).
4. Produire des listes d'execution testables en jeu.

Comment operer:

1. Capturer large couverture HDV (scroll/categories).
2. Sync DB puis exporter opportunites.
3. Executer les opportunites valides en priorite (liquidite > marge brute).
4. Reboucler quotidiennement avec comparaison des deltas.

Limite actuelle:
- La liquidite, la vitesse de vente et la fiscalite ne sont pas encore scorees automatiquement.

### 7.6 Playbook "meta multi-domaines" (operable maintenant)

Semaine-type avec briques verifiees:

1. Bloc progression (XP/combat): sessions courtes instrumentees, revue des rapports.
2. Bloc economie: capture HDV large, sync, extraction opportunites.
3. Bloc execution: achats/ventes cibles et collecte ressources rentables.
4. Bloc capitalisation: mise a jour watchlist objets + zones + routines gagnantes.

Routine technique standard:

1. Capture HDV en jeu via `rnd/poc-hdv/agent/launch_hdv_v2.bat`.
2. Sync base via `rnd/poc-hdv/sync_hdv_to_sqlite.ps1`.
3. Export lisible via `rnd/poc-hdv/export_hdv_readable.ps1 -ResolveItemNames`.
4. Focus ressources via `rnd/poc-hdv/top_buy_over_sell_resources.ps1`.

Indicateurs a suivre pour "meta":

1. XP gagnee par heure (perso + metiers).
2. Kamas nets par cycle d'execution.
3. Taux de trades executes vs opportunites detectees.
4. Progression du panier equipement cible (acquis/restants).

---

## 8. Limites connues en l'etat

1. Qualite de couverture depend de la navigation manuelle en jeu (ex: scroll HDV).
2. Les enchantements/gemmes equipements biaisent l'arbitrage equipement si non modelises.
3. Certaines resolutions de noms peuvent dependre du cache ou de la disponibilite reseau.
4. Certains signaux gameplay restent fortement contextuels.

---

## 9. Pistes d'evolution (roadmap)

### Phase A - Consolidation

1. Unifier schemas et nomenclature dans une DB canonique.
2. Ajouter indicateur de confiance par evenement.
3. Produire un "health report" automatique de chaque run.

### Phase B - Intelligence economique

1. Modeliser variantes d'items (enchantements, slots, rarete).
2. Ajouter cout transactionnel reel (taxes, volume, risque de liquidite).
3. Introduire scoring opportunite (profit, probabilite d'execution, vitesse).

### Phase C - Produit utilisateur

1. Dashboard unique (local) avec vues metier.
2. Alertes en temps quasi-reel (watchlist objets).
3. Mode "assistant scenario" (objectif joueur -> plan d'action).

### Phase D - Dimension communautaire (option)

1. Fusion anonyme de snapshots multi-joueurs.
2. Referentiel partage des mappings manquants.
3. Historique de marche inter-serveurs.

---

## 10. Viabilite et gouvernance

### 10.1 Critere "go/no-go" du POC unifie

Go si:

1. Trois sessions consecutives passent sans corruption de donnees.
2. Les rapports generes sont comprenables sans support technique.
3. Les resultats sont reproductibles sur re-run.

No-go temporaire si:

1. Les sorties sont non traçables.
2. Le pipeline depend de manipulations manuelles non documentees.
3. Les resultats varient sans explication.

### 10.2 KPI de pilotage

1. Couverture offres HDV (sell/buy distinct items).
2. Taux de resolution noms/type/niveau.
3. Taux d'opportunites confirmables en jeu.
4. Temps capture -> rapport.
5. Taux d'erreurs parsing/sync.

---

## 11. Plan d'implementation propose

1. Sprint 1: harmonisation schema + rapport unique markdown.
2. Sprint 2: enrichissement item-level/type partout + score opportunite.
3. Sprint 3: dashboard local + alertes watchlist.
4. Sprint 4: mode communautaire (si decide).

Definition of done de la version unifiee:

1. Un seul script d'orchestration lance tout le cycle.
2. Un seul document de sortie principal resume l'etat actionnable.
3. Chaque KPI cle est visible sans SQL manuel.

---

## 12. Conclusion

Le projet est deja au stade "POC robuste multi-briques".
La prochaine etape n'est pas de re-decouvrir des signaux, mais de les federer dans une colonne vertebrale commune.

Le POC unifie est viable immediatement si on formalise:

1. Contrat de donnees unique,
2. Orchestration unique,
3. Rapport unique,
4. Gouvernance de qualite.

Cette approche transforme les RND actuelles en un systeme coherent, actionnable, et pret pour industrialisation progressive.

---

## 13. Playbook LLM A -> Z (sans supposition)

Objectif:
donner a un LLM un protocole strict pour explorer, construire et faire evoluer un POC sur ce projet sans inventer d'hypotheses non prouvees.

Regle directrice:
chaque affirmation doit etre tracee a une evidence (fichier, ligne log, table SQL, sortie de commande).

### 13.1 Etape A - Cadrage et perimetre

Ce que le LLM doit faire:

1. Identifier l'objectif exact du run (ex: arbitrage ressources, progression XP, bilan coffre, rapport unifie).
2. Lister les sources de verite autorisees pour cet objectif.
3. Refuser explicitement toute deduction hors source si evidence manquante.

Ou regarder:

1. Documentation RND consolidee.
2. Scripts actifs dans `rnd/poc-hdv/`.
3. Bases et exports dans `logs/`.

Accrocs possibles et parades:

1. Objectif ambigu:
   demander une reformulation orientee resultat mesurable.
2. Source contradictoire:
   prioriser la source de verite definie par domaine (HDV = proto/SQLite).

### 13.2 Etape B - Verification environnement

Ce que le LLM doit verifier:

1. Existence des fichiers critiques (`market_v3_proto.log`, `hdv_market.db`).
2. Disponibilite des outils (`sqlite3`, PowerShell).
3. Date/heure de la derniere capture (fraicheur des donnees).

Ou regarder:

1. Dossier `logs/`.
2. Sorties de commandes shell (version outils, timestamp fichiers).

Accrocs possibles et parades:

1. Fichier absent:
   lancer la capture puis relancer sync.
2. Outil absent:
   proposer fallback (exports existants) ou installation guidee.

### 13.3 Etape C - Capture des donnees

Ce que le LLM doit faire:

1. Guider la capture en jeu (HDV ouvert, scroll pages, categories utiles).
2. Noter la couverture visee (scope minimum requis).
3. Enregistrer fin de session capture.

Ou regarder:

1. `rnd/poc-hdv/agent/launch_hdv_v2.bat`.
2. `logs/market_v3_proto.log`.

Accrocs possibles et parades:

1. Couverture insuffisante:
   demander explicitement une nouvelle passe de scroll ciblee.
2. Crash client:
   redemarrer capture, puis reprendre au dernier segment non couvert.

### 13.4 Etape D - Ingestion et persistance

Ce que le LLM doit faire:

1. Executer la synchronisation SQLite.
2. Verifier les compteurs (latest_total, latest_sell, latest_buy, distinct items).
3. Consigner un snapshot de sante du run.

Ou regarder:

1. `rnd/poc-hdv/sync_hdv_to_sqlite.ps1`.
2. `logs/hdv_market.db`.

Accrocs possibles et parades:

1. Erreurs parsing:
   isoler les lignes fautives, relancer, comparer variation de compteurs.
2. Stats incoherentes:
   confirmer la date des logs et reexecuter sur base proprement synchronisee.

### 13.5 Etape E - Enrichissement semantique

Ce que le LLM doit faire:

1. Enrichir avec noms/types/niveaux (cache + CDN Ankama).
2. Ajouter des colonnes explicites pour non-codeur.
3. Verifier le taux de resolution des noms.

Ou regarder:

1. `rnd/poc-hdv/export_hdv_readable.ps1`.
2. `logs/item_name_cache.json` et `logs/item_meta_cache*.json`.
3. `logs/market_latest_named_preview.csv`.

Accrocs possibles et parades:

1. Acces reseau indisponible:
   reutiliser le cache local et marquer la confiance degradee.
2. Encodage accentue degrade:
   conserver ID objet comme reference canonique.

### 13.6 Etape F - Analyse metier

Ce que le LLM doit faire:

1. Produire au moins deux vues:
   global marche et ressources/recoltes.
2. Expliquer chaque opportunite avec preuve (buy, sell, delta, item_ref_id).
3. Distinguer opportunite theorique vs executabilite probable.

Ou regarder:

1. `logs/top10_buy_over_sell.csv`.
2. `logs/top10_buy_over_sell_resources*.csv`.
3. Table `market_latest`.

Accrocs possibles et parades:

1. 0 opportunite sur filtre strict:
   produire une watchlist "proche du seuil" au lieu de conclure a un bug.
2. Resultat surprenant (trop beau):
   verifier biais connus (enchantements, liquidite, timing).

### 13.7 Etape G - Validation terrain

Ce que le LLM doit faire:

1. Fournir une short-list testable en jeu (max 10 items).
2. Capturer retour terrain (confirme / infirme / partiel).
3. Reinjecter les observations dans le run suivant.

Ou regarder:

1. Exports CSV lisibles.
2. Captures utilisateur et observations en jeu.

Accrocs possibles et parades:

1. Ecart entre marche observe et jeu:
   marquer obsolescence snapshot et relancer capture rapide.
2. Item introuvable:
   verifier categorie/filtres HDV et recouvrement de pages.

### 13.8 Etape H - Rapport final decision-ready

Ce que le LLM doit livrer:

1. Ce qui est confirme (preuves).
2. Ce qui est infirme (preuves).
3. Ce qui reste inconclusif (manque de donnees).
4. Prochaine action la plus rentable.

Format minimal attendu:

1. Resume executif court.
2. Tableau opportunites/priorites.
3. Journal des risques/limites.
4. Commandes de reproduction exactes.

### 13.9 Garde-fous "anti-supposition"

Le LLM ne doit jamais:

1. Confondre `offer_uid` et `item_ref_id`.
2. Deriver un prix de marche global depuis un seul signal texte non structure.
3. Conclure sans timestamp de fraicheur des donnees.
4. Oublier les limites connues (enchantements/gemmes, liquidite, couverture partielle).

Le LLM doit toujours:

1. Citer la source de chaque conclusion.
2. Donner un niveau de confiance par conclusion (haut / moyen / faible).
3. Proposer une action corrective si confiance moyenne/faible.

### 13.10 Arbre de decision en cas d'accroc

1. "Pas de fichier" -> verifier capture -> relancer pipeline.
2. "Base vide" -> verifier logs proto -> relancer sync.
3. "Resultats incoherents" -> verifier mapping IDs + timeframe + filtre.
4. "0 opportunite" -> sortir watchlist proche seuil + plan de recapture.
5. "Extension VS Code HS" -> basculer sur exports CSV/MD.

Ce mecanisme garantit un fonctionnement robuste meme en presence d'alea de session.

---

## 14. Mode "LLM Operateur Expert" (memoire, todo, hygiene, protocoles evolutifs)

Objectif:
outiller le LLM pour qu'il opere de facon plus rigoureuse qu'un developpeur senior en imposant:

1. une memoire rangee et exploitable,
2. une boucle TODO disciplinée,
3. un nettoyage d'artefacts en temps reel,
4. un protocole de test incrementale pilote par le joueur,
5. un formulaire de run standardise avec section retours.

### 14.1 Systeme de memoire organise (3 couches)

#### A. Memoire stable (long terme)

Contenu:

1. invariants verifies (ex: `item_ref_id != offer_uid`),
2. sources de verite par domaine,
3. commandes de reproduction stables,
4. limites connues structurelles.

Regles:

1. tres court, factuel, sans bruit,
2. toute entree doit etre datee,
3. remplacer/archiver une entree obsolette au lieu d'empiler.

#### B. Memoire de projet (moyen terme)

Contenu:

1. etat des scripts actifs,
2. schema de donnees en vigueur,
3. checklist de health-run,
4. decisions d'architecture en cours.

Regles:

1. mise a jour a chaque jalon (pas a chaque ligne),
2. distinguer "confirme", "infirme", "a valider".

#### C. Memoire de session (court terme)

Contenu:

1. objectif du run courant,
2. hypotheses temporaires,
3. commandes executees,
4. resultats et anomalies.

Regles:

1. ephemere, nettoyee en fin de run,
2. ne promouvoir en memoire stable que le valide.

### 14.2 Discipline TODO (cadence pro)

Format TODO minimal:

1. id
2. action
3. statut (`not-started`, `in-progress`, `completed`, `blocked`)
4. preuve attendue
5. risque

Regles d'execution:

1. une seule tache `in-progress` a la fois,
2. chaque tache terminee doit produire une preuve,
3. toute tache `blocked` doit avoir une parade explicite.

Definition of done d'une tache:

1. resultat observable,
2. evidence archivable,
3. impact documente,
4. prochaine action definie.

### 14.3 Nettoyage d'artefacts en temps reel

Probleme:
les runs iteratifs creent des artefacts transitoires (CSV, caches, variantes v2/v3) qui degradent la lisibilite.

Politique hygiene:

1. Namespace de run:
   tous les fichiers temporaires d'un run doivent etre prefixes (ex: `run_YYYYMMDD_HHMM_*`).
2. Promotion:
   seul un artefact final est promu en nom canonique.
3. Quarantaine:
   les artefacts intermediaires vont dans un dossier `tmp/` ou `runs/`.
4. Retention:
   conserver N runs, purger le reste automatiquement.

Checklist post-run:

1. supprimer les duplicats evidents,
2. verifier que les liens doc pointent vers les artefacts canoniques,
3. marquer les fichiers obsoletes.

### 14.4 Protocoles evolutifs de test (joueur guide etape par etape)

Principe:
le LLM ne demande pas "teste un peu"; il orchestre un protocole court, mesurable, evolutif.

Structure d'un protocole:

1. objectif du test,
2. preconditions,
3. etapes joueur (1 action = 1 verification),
4. evidence attendue,
5. criteres de succes/echec,
6. action suivante selon resultat.

Matrice de progression:

1. Protocole v1 = validation de base.
2. Protocole v2 = edge cases connus.
3. Protocole v3 = robustesse multi-session.

Regle anti-derapage:

1. si une etape echoue, arreter la progression,
2. corriger la cause,
3. rejouer etape N avant N+1.

### 14.5 Formulaire de test standard (a regenerer proprement)

Usage:
un formulaire par run, rempli par le developpeur/joueur pendant la session.

Template recommande:

1. Identite run
   date, objectif, version scripts, serveur, personnage.
2. Preconditions
   etat client, logs presents, DB presente.
3. Etapes executees
   action joueur, horodatage, resultat observe.
4. Evidences
   fichiers produits, lignes cle, captures.
5. Verdict
   confirme / infirme / partiel.
6. Retours (section obligatoire)
   ressenti operateur, points bloquants, idees d'amelioration.
7. Actions
   correctifs immediats, backlog, priorite.

Regles de cycle:

1. A la fin du run, figer le formulaire en lecture seule.
2. Avant un nouveau run, generer un nouveau formulaire vierge.
3. Ne jamais ecraser un formulaire precedent.

### 14.6 Boucle d'amelioration continue

Cycle 1 run = 1 apprentissage:

1. Executer protocole.
2. Capturer retours.
3. Mettre a jour checklists/protocoles.
4. Mesurer gain de temps/fiabilite au run suivant.

KPI d'efficacite LLM vs execution ad hoc:

1. temps moyen pour produire un rapport fiable,
2. taux d'erreurs de manipulation,
3. taux de conclusions sans preuve (doit tendre vers 0),
4. taux de re-run reussis sans assistance.

### 14.7 Interdits operationnels

Le LLM n'a pas le droit:

1. d'inventer une cause sans evidence,
2. de valider un resultat sans point de controle,
3. d'accumuler des artefacts non classes,
4. de faire evoluer un protocole sans retrocompatibilite minimale.

### 14.8 Resultat attendu

Si ce mode est respecte:

1. le systeme devient predictible,
2. la qualite est cumulative,

---

## 15. Protocole d'efficacite token (adapte Claude Code)

Objectif:
maximiser la pertinence sans depenser des tokens inutilement.

Principe:
le LLM adapte la profondeur d'analyse au besoin reel et passe en mode compact par defaut.

### 15.1 Modes d'execution

Mode 1 - Compact (defaut):

1. repondre court et actionnable,
2. lire seulement les fichiers strictement necessaires,
3. faire une hypothese minimale puis verifier vite.

Mode 2 - Standard:

1. ajouter contexte intermediaire,
2. verifier 2 a 3 sources avant conclusion,
3. produire un livrable avec preuves essentielles.

Mode 3 - Deep:

1. reserve aux cas critiques (regression, incoherence, migration),
2. lecture large + validations croisees,
3. rapport detaille.

Regle de bascule:

1. commencer en Compact,
2. escalader en Standard si ambiguite,
3. escalader en Deep seulement si impact eleve.

### 15.2 Budget token par cycle

Budget logique par run:

1. Discover (20%): trouver juste ce qu'il faut.
2. Decide (10%): fixer plan court.
3. Execute (50%): edits/outils.
4. Verify (15%): checks ciblés.
5. Report (5%): synthese concise.

Interdit:

1. longues analyses non actionnables,
2. repetition de contexte deja etabli,
3. lecture exhaustive sans objectif precis.

### 15.3 Strategie de contexte

1. Retrieval-first:
   chercher d'abord (file_search/grep), lire ensuite seulement les extraits utiles.
2. Evidence snapshots:
   conserver un mini-resume des preuves plutot que recharger tout le fichier.
3. Delta-only:
   a chaque tour, ne rapporter que ce qui a change.
4. Stop-early:
   des que le critere de succes est atteint, stopper l'exploration.

### 15.4 Compression sans perte utile

1. Transformer les sorties volumineuses en tableaux courts (kpi/compteurs).
2. Garder les chemins de preuves, pas les dumps complets.
3. Archiver le detail dans les artefacts, pas dans le fil de discussion.

### 15.5 Regles Claude Code (pratiques)

1. batcher les operations read-only en parallele.
2. eviter les allers-retours inutiles: plan court, execution directe.
3. utiliser des checklists de verification standardisees.
4. privilegier les scripts existants plutot que recréer de nouvelles voies.

### 15.6 Anti-derives

Le LLM doit s'auto-stopper si:

1. il reformule la meme idee plusieurs fois,
2. il ouvre des pistes hors objectif du run,
3. il n'ajoute plus de preuve nouvelle.

Action corrective:

1. revenir au dernier objectif valide,
2. executer la prochaine action minimale,
3. produire un point d'etat en 3 lignes max.

### 15.7 KPI efficacite token

1. ratio preuves nouvelles / appels outils,
2. temps vers resultat exploitable,
3. nombre d'escalades Deep injustifiees,
4. taille moyenne des comptes-rendus finaux.

### 15.8 Politique d'escalade de modele

1. Le LLM commence sur un modele moins couteux pour les operations simples.
2. En cas de complexite elevee ou d'incertitude persistante, il propose un switch vers un modele plus puissant.
3. Seuil recommande: proposer switch apres 2 iterations ratees consecutives, recommander fortement apres 3.
4. Une fois le blocage leve, retour a un modele moins couteux pour execution standard.
5. Chaque switch (ou refus de switch) est trace dans le formulaire de run.

Resultat attendu:

1. moins de tokens consommés,
2. decisions plus rapides,
3. pertinence conservee,
4. meilleure regularite run-to-run.
3. le passage d'un operateur a un autre est fluide,
4. la vitesse d'execution augmente sans sacrifier la preuve.