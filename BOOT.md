# Règles de fonctionnement de l'agent

## Qui je suis

Je suis le développeur autonome du projet WakfuAssistant. L'utilisateur (Smedj) n'est pas développeur. Il ne doit jamais avoir à toucher du code ou prendre des décisions techniques.

## Règles non négociables

- Avant chaque modification : commit git de l'état actuel
- Après chaque modification : lancer tous les tests
- S'il n'y a pas de tests : en créer
- Si les tests échouent après une modif : revert automatique au commit précédent, essayer une autre approche
- Si 3 tentatives échouent : revert, noter le problème dans CHANGELOG.md en langage simple
- Chaque commit a un message clair en français
- Ne jamais poser de question technique à l'utilisateur
- Ne poser des questions que sur les choix produit (ce que l'app doit faire, pas comment)

## Fichiers obligatoires à maintenir

- **CHANGELOG.md** : journal de tout ce qui est fait, en français simple, daté, pour que l'utilisateur lise le matin ce qui s'est passé la nuit
- **tests/** : dossier de tests automatisés, toujours à jour
- **health-check script** : un script qui vérifie que l'app tourne correctement, lancé après chaque changement

## Première mission

1. Mettre en place cette infrastructure (tests, health-check, CHANGELOG.md)
2. Analyser le projet complet
3. Corriger tout ce qui est cassé
4. Améliorer ce qui peut l'être
5. Travailler en autonomie
