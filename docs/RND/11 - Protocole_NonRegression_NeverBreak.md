# 11 - Protocole NonRegression NeverBreak

Date: 2026-03-21
Statut: Actif

Objectif:
empêcher les regressions et reduire au maximum le risque de casse applicative pendant les evolutions.

---

## 1. Invariants a proteger

1. Les scripts critiques s'executent sans erreur bloquante.
2. La base SQLite reste lisible et coherente.
3. Les exports canoniques sont produits dans le format attendu.
4. Les identifiants metier ne sont pas confondus (`item_ref_id` vs `offer_uid`).

---

## 2. Checklist pre-change

1. Scope du changement ecrit en une phrase.
2. Liste exacte des fichiers modifies.
3. Baseline capturee:
   - timestamps artefacts cle,
   - compteurs DB cle,
   - echantillon de sortie lisible.
4. Plan de verification post-change prepare.

---

## 3. Strategie de changement

1. Changement minimal, cible, atomique.
2. Un seul objectif fonctionnel par patch.
3. Pas de refactor cosmetique simultane.
4. Documentation mise a jour dans le meme cycle.

---

## 4. Verification post-change (obligatoire)

1. Rejouer le flux critique:
   - sync DB,
   - export lisible,
   - extraction opportunites.
2. Comparer baseline et post-change:
   - fichiers produits,
   - structure colonnes,
   - stats principales.
3. Marquer resultat:
   - Confirme,
   - Infirme,
   - Partiel,
   - Inconclusif.

---

## 5. Regles de rollback sur

1. Pas de rollback destructif.
2. Archiver les artefacts precedents avant promotion des nouveaux.
3. Revenir au script precedent uniquement via restoration de version connue.
4. Documenter la cause racine avant nouvelle tentative.

---

## 6. Protocole de test guide developpeur/joueur

1. Une action joueur = une verification attendue.
2. Si une etape echoue:
   - stop,
   - correction,
   - retest de la meme etape.
3. Pas de passage a l'etape suivante sur un etat incertain.

Template recommande:
`docs/RND/forms/PROTOCOL_STEP_BY_STEP_TEMPLATE.md`

---

## 7. Definition du zero-regression pratique

Un changement est zero-regression si:

1. tous les invariants sont verts,
2. les sorties historiques restent lisibles et exploitables,
3. aucun cas valide precedent n'est casse,
4. le run form contient des preuves suffisantes.

---

## 8. Signal d'arret immediat

Arreter le run et escalader si:

1. les compteurs DB deviennent incoherents sans explication,
2. un artefact canonique disparait,
3. une commande critique cesse de produire ses sorties attendues,
4. la verification ne peut pas etre reproduite.
