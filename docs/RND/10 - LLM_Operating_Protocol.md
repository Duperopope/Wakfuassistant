# 10 - LLM Operating Protocol (A -> Z)

Date: 2026-03-21
But: donner un mode operatoire executable, sans supposition, avec memoire, TODO, protocole de test et hygiene artefacts.

---

## 1. Fichiers de pilotage

1. Formulaire actif: `docs/RND/forms/ACTIVE_TEST_RUN_FORM.md`
2. TODO actif: `docs/RND/forms/ACTIVE_TODOLIST.md`
3. Template formulaire: `docs/RND/forms/TEST_RUN_FORM_TEMPLATE.md`
4. Template protocole: `docs/RND/forms/PROTOCOL_STEP_BY_STEP_TEMPLATE.md`
5. Contexte mission actif: `docs/RND/forms/ACTIVE_MISSION_CONTEXT.md`
6. Template contexte mission: `docs/RND/forms/MISSION_CONTEXT_TEMPLATE.md`
7. Script rotation/nettoyage: `docs/RND/poc-hdv/new_test_run_form.ps1`

---

## 2. Routine obligatoire a chaque run

1. Lancer la rotation:

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File "docs\RND\poc-hdv\new_test_run_form.ps1" -Goal "<objectif>" -Server "<serveur>" -Character "<personnage>"
```

2. Remplir `ACTIVE_TEST_RUN_FORM.md` au fil du run.
3. Mettre a jour `ACTIVE_TODOLIST.md` en continu.
4. Verifier/completer `ACTIVE_MISSION_CONTEXT.md` avant execution.
5. Executer le protocole pas-a-pas (une etape validee avant la suivante).
6. Produire un verdict final avec preuves.

---

## 3. Regles anti-supposition

1. Aucune conclusion sans preuve (fichier, commande, SQL, capture).
2. Toute incertitude doit etre marquee "inconclusif".
3. Toute anomalie doit inclure une action corrective testable.
4. Toute tache TODO terminee doit referencer une evidence.

---

## 4. Boucle d'amelioration

1. Archive automatique du formulaire precedent.
2. Nouveau formulaire vierge pour nouveau run.
3. Artefacts intermediaires deplaces en quarantaine (`logs/runs/<timestamp>/`).
4. Conservation des artefacts canoniques persistants (ex: `logs/hdv_market.db`, logs proto, docs).
5. Les exports lisibles (`market_latest_preview*`, `top10_buy_over_sell*`) sont des artefacts derives: ils peuvent etre regeneres et sont archives par run.

---

## 4bis. Protocole operateur (strict)

1. Initialiser le run avec `new_test_run_form.ps1`.
2. Ouvrir et verifier `ACTIVE_MISSION_CONTEXT.md` avant toute action en jeu.
3. Donner ce seul fichier au LLM si tu veux un pilotage autonome.
4. Executer une seule action en jeu a la fois.
5. Apres chaque action, repondre au LLM avec le resultat exact observe.
6. Ne jamais sauter une verification demandee par le protocole.
7. En cas de doute ou resultat ambigu, repondre `inconclusif` et ne pas improviser.
8. A la fin du run, completer `ACTIVE_TEST_RUN_FORM.md` et `ACTIVE_TODOLIST.md`.

---

## 5. Definition de performance "LLM > expert"

1. Temps plus court pour produire un resultat fiable.
2. Moins d'iterations perdues (grace au protocole).
3. Zero confusion semantique (`item_ref_id` vs `offer_uid`).
4. Historique run-to-run propre et exploitable.

---

## 6. Protocole "Never Break / Zero Regression"

Principe:
aucune modification n'est consideree valide tant que le cycle complet de verification n'est pas passe.

Gate 1 - Pre-change:

1. Identifier l'impact exact (fichiers, scripts, sorties attendues).
2. Definir les invariants a proteger.
3. Capturer un baseline (artefacts et stats avant changement).

Gate 2 - Change minimal:

1. Modifier le plus petit ensemble de fichiers possible.
2. Eviter toute refonte non necessaire.
3. Conserver les APIs et formats de sortie stables.

Gate 3 - Verification immediate:

1. Executer les commandes critiques du flux.
2. Comparer baseline vs post-change.
3. Detecter toute regression fonctionnelle et toute derive de schema.

Gate 4 - Validation utilisateur:

1. Fournir un protocole pas-a-pas au developpeur/joueur.
2. Marquer chaque etape en confirme/infirme/partiel.
3. Ne pas promouvoir le changement sans validation terrain minimale.

Gate 5 - Publication:

1. Mettre a jour la doc et les formulaires.
2. Archiver les preuves du run.
3. Conserver un chemin de repli non destructif (artefacts precedents archives).

Regles absolues:

1. Pas de commande destructive globale.
2. Pas d'hypothese silencieuse sur la qualite d'un resultat.
3. Pas de "ca marche" sans evidence liee a un fichier/commande.

---

## 7. SOP Efficacite Token (Claude Code)

Mode par defaut: Compact.

### 7.1 Workflow compact obligatoire

1. Definir l'objectif en une phrase.
2. Chercher les fichiers candidats (sans tout lire).
3. Lire uniquement les sections necessaires.
4. Executer la plus petite action utile.
5. Verifier sur 1 ou 2 checks cibles.
6. Rapporter en format court.

### 7.2 Conditions d'escalade

Escalader en Standard si:

1. ambiguite sur la source de verite,
2. contradiction entre 2 evidences,
3. impact potentiel sur donnees persistantes.

Escalader en Deep si:

1. risque de regression large,
2. corruption/incoherence de base,
3. changement de protocole/schemas.

### 7.3 Format de sortie court (obligatoire)

Format 4 blocs max:

1. Action faite
2. Resultat
3. Preuve
4. Prochaine etape

### 7.4 Checklist anti-gaspillage

Avant chaque action, verifier:

1. Cette action ajoute-t-elle une preuve nouvelle?
2. Puis-je reutiliser un artefact existant?
3. Puis-je resumer au lieu de re-lire entierement?
4. Puis-je arreter ici avec un resultat utile?

Si 2 reponses ou plus sont "non", revoir le plan.

---

## 8. Politique de switch de modele (cout vs difficulte)

Objectif:
adapter le cout du modele a la difficulte reelle de l'operation et eviter de bloquer inutilement.

### 8.1 Mapping difficulte -> classe de modele

1. Tache simple (edition locale, reponse courte, verification minimale):
	utiliser un modele moins couteux.
2. Tache moyenne (plusieurs fichiers, verification croisee, scripts):
	utiliser un modele intermediaire.
3. Tache complexe (debug profond, regressions, architecture, migration):
	utiliser un modele plus couteux/plus puissant.

### 8.2 Seuil d'escalade apres echecs

Regle standard:

1. si 2 iterations consecutives n'atteignent pas le critere de succes, proposer un switch vers un modele plus puissant.
2. si 3 iterations consecutives echouent encore, recommander fortement le switch avant toute nouvelle tentative.

Une iteration est consideree "ratee" si:

1. la verification ne passe pas,
2. la meme erreur revient sans gain net,
3. aucun nouvel element de preuve n'est obtenu.

### 8.3 Demande explicite a l'utilisateur

Avant switch, le LLM doit demander:

1. rester sur modele actuel et tenter une alternative,
2. passer a un modele plus puissant (plus couteux),
3. redescendre sur un modele moins couteux pour actions simples.

Le choix utilisateur doit etre journalise dans le run form.

### 8.4 Regle de retour vers modele moins couteux

Apres resolution d'un blocage complexe:

1. revenir en mode compact et modele moins couteux pour les taches mecaniques.
2. conserver le modele puissant uniquement pour les segments a forte incertitude.
