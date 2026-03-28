# Protocoles opérationnels — Wakfu Assistant

> Dernière mise à jour : 2026-03-21 — Fusion de : LLM_Operating_Protocol.md + Protocole_NonRegression_NeverBreak.md

---

## 1. Principes fondamentaux

Ces règles s'appliquent à tout run, toute modification, toute session de travail.

1. Aucune conclusion sans preuve (fichier, commande, SQL, capture).
2. Aucune modification n'est valide tant que le cycle complet de vérification n'est pas passé.
3. Toute incertitude est marquée "inconclusif" — jamais improviser.
4. Toute tâche TODO terminée référence une évidence concrète.
5. Les identifiants métier ne sont jamais confondus (`item_ref_id` vs `offer_uid`).
6. Un seul objectif fonctionnel par patch — changement minimal, ciblé, atomique.
7. Pas de commande destructive globale.
8. Pas d'hypothèse silencieuse sur la qualité d'un résultat.

---

## 2. Protocole LLM — Mode opératoire

### 2.1 Fichiers de pilotage

| # | Fichier | Rôle |
|---|---------|------|
| 1 | `docs/RND/forms/ACTIVE_TEST_RUN_FORM.md` | Formulaire actif du run en cours |
| 2 | `docs/RND/forms/ACTIVE_TODOLIST.md` | TODO actif |
| 3 | `docs/RND/forms/TEST_RUN_FORM_TEMPLATE.md` | Template formulaire |
| 4 | `docs/RND/forms/PROTOCOL_STEP_BY_STEP_TEMPLATE.md` | Template protocole |
| 5 | `docs/RND/forms/ACTIVE_MISSION_CONTEXT.md` | Contexte mission actif |
| 6 | `docs/RND/forms/MISSION_CONTEXT_TEMPLATE.md` | Template contexte mission |
| 7 | `docs/RND/poc-hdv/new_test_run_form.ps1` | Script rotation/nettoyage |

### 2.2 Routine obligatoire à chaque run

1. Lancer la rotation :

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File "docs\RND\poc-hdv\new_test_run_form.ps1" -Goal "<objectif>" -Server "<serveur>" -Character "<personnage>"
```

2. Remplir `ACTIVE_TEST_RUN_FORM.md` au fil du run.
3. Mettre à jour `ACTIVE_TODOLIST.md` en continu.
4. Vérifier/compléter `ACTIVE_MISSION_CONTEXT.md` avant exécution.
5. Exécuter le protocole pas-à-pas (une étape validée avant la suivante).
6. Produire un verdict final avec preuves.

### 2.3 Protocole opérateur (strict)

1. Initialiser le run avec `new_test_run_form.ps1`.
2. Ouvrir et vérifier `ACTIVE_MISSION_CONTEXT.md` avant toute action en jeu.
3. Donner ce seul fichier au LLM pour un pilotage autonome.
4. Exécuter une seule action en jeu à la fois.
5. Après chaque action, répondre au LLM avec le résultat exact observé.
6. Ne jamais sauter une vérification demandée par le protocole.
7. En cas de doute ou résultat ambigu, répondre `inconclusif` et ne pas improviser.
8. À la fin du run, compléter `ACTIVE_TEST_RUN_FORM.md` et `ACTIVE_TODOLIST.md`.

### 2.4 Boucle d'amélioration et gestion des artefacts

1. Archive automatique du formulaire précédent.
2. Nouveau formulaire vierge pour nouveau run.
3. Artefacts intermédiaires déplacés en quarantaine (`logs/runs/<timestamp>/`).
4. Conservation des artefacts canoniques persistants (ex : `logs/hdv_market.db`, logs proto, docs).
5. Les exports lisibles (`market_latest_preview*`, `top10_buy_over_sell*`) sont des artefacts dérivés : ils peuvent être régénérés et sont archivés par run.

### 2.5 SOP Efficacité Token (Claude Code)

Mode par défaut : **Compact**.

**Workflow compact obligatoire**

1. Définir l'objectif en une phrase.
2. Chercher les fichiers candidats (sans tout lire).
3. Lire uniquement les sections nécessaires.
4. Exécuter la plus petite action utile.
5. Vérifier sur 1 ou 2 checks ciblés.
6. Rapporter en format court.

**Conditions d'escalade vers Standard**

1. Ambiguïté sur la source de vérité.
2. Contradiction entre 2 évidences.
3. Impact potentiel sur données persistantes.

**Conditions d'escalade vers Deep**

1. Risque de régression large.
2. Corruption/incohérence de base.
3. Changement de protocole/schémas.

**Format de sortie court (obligatoire)**

Format 4 blocs max :

1. Action faite
2. Résultat
3. Preuve
4. Prochaine étape

**Checklist anti-gaspillage** — avant chaque action, vérifier :

1. Cette action ajoute-t-elle une preuve nouvelle ?
2. Puis-je réutiliser un artefact existant ?
3. Puis-je résumer au lieu de re-lire entièrement ?
4. Puis-je m'arrêter ici avec un résultat utile ?

Si 2 réponses ou plus sont "non", revoir le plan.

### 2.6 Politique de switch de modèle (coût vs difficulté)

**Mapping difficulté → classe de modèle**

| Difficulté | Type de tâche | Modèle |
|------------|---------------|--------|
| Simple | Édition locale, réponse courte, vérification minimale | Moins coûteux |
| Moyenne | Plusieurs fichiers, vérification croisée, scripts | Intermédiaire |
| Complexe | Debug profond, régressions, architecture, migration | Plus puissant |

**Seuil d'escalade après échecs**

1. 2 itérations consécutives sans critère de succès → proposer un switch vers modèle plus puissant.
2. 3 itérations consécutives en échec → recommander fortement le switch avant toute nouvelle tentative.

Une itération est "ratée" si : la vérification ne passe pas, la même erreur revient sans gain net, ou aucun nouvel élément de preuve n'est obtenu.

**Demande explicite à l'utilisateur avant switch :**

1. Rester sur modèle actuel et tenter une alternative.
2. Passer à un modèle plus puissant (plus coûteux).
3. Redescendre sur un modèle moins coûteux pour actions simples.

Le choix utilisateur doit être journalisé dans le run form.

**Règle de retour vers modèle moins coûteux :**

Après résolution d'un blocage complexe, revenir en mode compact et modèle moins coûteux pour les tâches mécaniques. Conserver le modèle puissant uniquement pour les segments à forte incertitude.

---

## 3. Protocole Never Break — Non-régression

### 3.1 Invariants à protéger

1. Les scripts critiques s'exécutent sans erreur bloquante.
2. La base SQLite reste lisible et cohérente.
3. Les exports canoniques sont produits dans le format attendu.
4. Les identifiants métier ne sont pas confondus (`item_ref_id` vs `offer_uid`).

### 3.2 Les 5 Gates

**Gate 1 — Pré-change**

1. Identifier l'impact exact (fichiers, scripts, sorties attendues).
2. Définir les invariants à protéger.
3. Capturer un baseline : timestamps artefacts clé, compteurs DB clé, échantillon de sortie lisible.
4. Scope du changement écrit en une phrase + liste exacte des fichiers modifiés.
5. Plan de vérification post-change préparé.

**Gate 2 — Change minimal**

1. Modifier le plus petit ensemble de fichiers possible.
2. Un seul objectif fonctionnel par patch.
3. Éviter toute refonte non nécessaire et tout refactor cosmétique simultané.
4. Conserver les APIs et formats de sortie stables.
5. Documentation mise à jour dans le même cycle.

**Gate 3 — Vérification immédiate**

1. Rejouer le flux critique : sync DB, export lisible, extraction opportunités.
2. Comparer baseline vs post-change : fichiers produits, structure colonnes, stats principales.
3. Détecter toute régression fonctionnelle et toute dérive de schéma.
4. Marquer le résultat : Confirmé / Infirmé / Partiel / Inconclusif.

**Gate 4 — Validation utilisateur**

1. Fournir un protocole pas-à-pas au développeur/joueur.
2. Une action joueur = une vérification attendue.
3. Marquer chaque étape en confirmé/infirmé/partiel.
4. Si une étape échoue : stop, correction, retest de la même étape. Pas de passage à l'étape suivante sur un état incertain.
5. Ne pas promouvoir le changement sans validation terrain minimale.

> ⚠️ Tension : le protocole LLM encourage l'efficacité token et la rapidité de traitement (mode compact), tandis que la Gate 4 impose une validation humaine complète avant promotion. En cas de conflit, la validation humaine prime toujours sur la vitesse d'exécution.

**Gate 5 — Publication**

1. Mettre à jour la doc et les formulaires.
2. Archiver les preuves du run.
3. Conserver un chemin de repli non destructif (artefacts précédents archivés).

### 3.3 Stratégie de rollback

1. Pas de rollback destructif.
2. Archiver les artefacts précédents avant promotion des nouveaux.
3. Revenir au script précédent uniquement via restauration de version connue.
4. Documenter la cause racine avant nouvelle tentative.

### 3.4 Définition du zéro-régression pratique

Un changement est zéro-régression si :

1. Tous les invariants sont verts.
2. Les sorties historiques restent lisibles et exploitables.
3. Aucun cas valide précédent n'est cassé.
4. Le run form contient des preuves suffisantes.

### 3.5 Signal d'arrêt immédiat

Arrêter le run et escalader si :

1. Les compteurs DB deviennent incohérents sans explication.
2. Un artefact canonique disparaît.
3. Une commande critique cesse de produire ses sorties attendues.
4. La vérification ne peut pas être reproduite.

---

## 4. Checklist de session

Ordre strict à suivre pour toute session de travail.

### Phase 0 — Initialisation

- [ ] Lancer `new_test_run_form.ps1` avec objectif, serveur, personnage.
- [ ] Vérifier `ACTIVE_MISSION_CONTEXT.md` : mission claire, invariants listés.
- [ ] Vérifier `ACTIVE_TODOLIST.md` : reprendre les items ouverts du run précédent.
- [ ] Choisir le modèle LLM adapté à la difficulté estimée.

### Phase 1 — Pré-change (Gate 1)

- [ ] Écrire le scope du changement en une phrase.
- [ ] Lister les fichiers qui seront modifiés.
- [ ] Capturer le baseline (timestamps, compteurs DB, échantillon de sortie).
- [ ] Identifier les invariants à protéger pour ce run.
- [ ] Préparer le plan de vérification post-change.

### Phase 2 — Exécution (Gate 2)

- [ ] Appliquer le changement minimal et atomique.
- [ ] Pas de refactor cosmétique simultané.
- [ ] Mettre à jour la documentation dans le même cycle.
- [ ] Remplir `ACTIVE_TEST_RUN_FORM.md` au fil des actions.

### Phase 3 — Vérification immédiate (Gate 3)

- [ ] Rejouer le flux critique (sync DB, export, extraction).
- [ ] Comparer baseline vs post-change.
- [ ] Marquer chaque point : Confirmé / Infirmé / Partiel / Inconclusif.
- [ ] Aucune anomalie non documentée.

### Phase 4 — Validation utilisateur (Gate 4)

- [ ] Produire le protocole pas-à-pas pour validation terrain.
- [ ] Attendre confirmation de chaque étape avant de continuer.
- [ ] Ne pas promouvoir sans validation terrain minimale.

### Phase 5 — Publication (Gate 5)

- [ ] Mettre à jour docs et formulaires.
- [ ] Archiver les preuves du run dans `logs/runs/<timestamp>/`.
- [ ] Conserver les artefacts canoniques persistants.
- [ ] Mettre à jour `ACTIVE_TODOLIST.md` : fermer les items résolus, ouvrir les suivants.

### Phase 6 — Clôture

- [ ] Produire le verdict final avec preuves.
- [ ] Archiver `ACTIVE_TEST_RUN_FORM.md`.
- [ ] Revenir au modèle compact/moins coûteux si retour à des tâches mécaniques.

---

## 5. Règles absolues

Ces règles ne peuvent pas être violées, quelle que soit la situation.

1. Pas de conclusion sans preuve (fichier, commande, SQL, capture).
2. Pas de commande destructive globale.
3. Pas d'hypothèse silencieuse sur la qualité d'un résultat.
4. Pas de "ça marche" sans evidence liée à un fichier/commande.
5. Pas de rollback destructif.
6. Pas de passage à l'étape suivante sur un état incertain ou partiel.
7. Pas de refactor cosmétique simultané à un changement fonctionnel.
8. Tout résultat ambigu est marqué "inconclusif" — jamais ignoré, jamais supposé résolu.
9. Tout switch de modèle LLM est soumis à l'accord explicite de l'utilisateur et journalisé.
10. La validation utilisateur (Gate 4) prime toujours sur l'efficacité token ou la vitesse d'exécution.
