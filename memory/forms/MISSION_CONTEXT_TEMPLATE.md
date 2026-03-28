# MISSION CONTEXT (Single-file handoff for Claude Code)

Ce document est la source unique que l'operateur donne au LLM.
Le LLM doit pouvoir demarrer, executer et conclure la mission avec ce seul fichier.

## 1. Meta mission

- Mission ID: MISSION_<YYYYMMDD_HHMM>
- Date de lancement: <DATE_ISO>
- Auteur contexte (developpeur): testeur expert gameplay (14 ans), non codeur
- LLM operateur: Claude Code (VS Code)
- Mode initial: Compact

## 2. Regle de demarrage (obligatoire)

1. Lire ce fichier en entier avant toute action.
2. Reformuler l'objectif en une phrase.
3. Lister les 3 prochaines actions maximum.
4. Demander confirmation utilisateur avant toute action irreversible.

## 3. Objectif principal

Mission de ce run: <GOAL>.

Livrables minimum:

1. sortie lisible decision-ready,
2. verdict confirme/infirme/inconclusif avec preuves,
3. prochaine action concrete.

## 4. Profil utilisateur a prendre en compte

1. Excellente maitrise du jeu.
2. Non codeur.
3. Capable de suivre des instructions precises et de donner des retours qualites.

Implication pour le LLM:

1. poser des questions courtes et exactes,
2. une action a la fois,
3. eviter le jargon technique non necessaire.

## 5. Perimetre

Inclus:

1. capture HDV,
2. sync SQLite,
3. export lisible,
4. analyses opportunites,
5. verification terrain,
6. mise a jour doc/protocole.

Exclus sauf demande explicite:

1. refonte large,
2. operations destructives,
3. hypotheses sans evidence.

## 6. Sources de verite autorisees

1. HDV marche: logs/market_v3_proto.log et logs/hdv_market.db
2. Tables canoniques: market_observations, market_latest
3. Exports lisibles: artefacts derives generes a la demande, puis archives dans logs/runs/<RUN_ID>/artifacts/
4. Gameplay/session: wakfu.log, wakfu_chat.log
5. Metadonnees objets: cache local + CDN Ankama
6. Contexte operateur: serveur <SERVER>, personnage <CHARACTER>

## 7. Invariants non negociables

1. Ne jamais confondre item_ref_id et offer_uid.
2. Aucune conclusion sans evidence.
3. Aucune commande destructive globale.
4. Toute regression potentielle doit etre testee.
5. En cas de doute: statut inconclusif + test suivant propose.

## 8. Politique anti-regression (Never Break)

1. Pre-change: capturer baseline.
2. Change: modification minimale.
3. Post-change: verification immediate.
4. Validation utilisateur: protocole pas-a-pas.
5. Publication: preuves + doc a jour.

## 9. Politique modele (cout vs difficulte)

1. Commencer en mode compact.
2. Si 2 iterations consecutives ratees: proposer switch vers modele plus puissant.
3. Si 3 iterations consecutives ratees: recommander fortement switch avant nouvelle tentative.
4. Tout switch doit etre confirme par l'utilisateur.
5. Une fois debloque: revenir au mode moins couteux.

## 10. Questions obligatoires que le LLM doit poser

Ordre impose:

1. Quel est l'objectif unique de ce run en une phrase ?
2. Quel livrable exact veux-tu a la fin ?
3. Quelle action precise fais-tu maintenant en jeu ?
4. As-tu fini cette action ? (oui/non)
5. Quel resultat observes-tu exactement ?
6. Confirme-tu que je passe a l'etape suivante ? (oui/non)

## 11. Format de sortie du LLM (court et strict)

1. Action faite
2. Resultat
3. Preuve
4. Prochaine etape

## 12. Criteres de succes

1. Resultat testable et confirme en jeu.
2. Resultat traceable et reproductible.
3. Pas de regression critique.

## 13. Criteres d'echec

1. Conclusion sans preuve.
2. Sortie non testable en jeu.
3. Regression non detectee.

## 14. Journal de decisions

| Horodatage | Decision | Motif | Impact |
|-----------|----------|-------|--------|
| | | | |

## 15. Retours testeur (fin de run)

- Ce qui a bien fonctionne:
- Ce qui a bloque:
- Question la plus utile posee par le LLM:
- Question inutile ou floue a supprimer:
- Amelioration pour le prochain run: