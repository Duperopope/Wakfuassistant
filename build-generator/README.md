# Sram Meta Build Generator

## Description
Outil de comparaison de builds Sram pour Wakfu.
Implemente la formule de degats officielle de WakfuCalc par Ectawem.

## Sources
- Formules : [WakfuCalc par Ectawem](https://sites.google.com/view/wakfucalc/en/guides/formulas)
- Architecture : inspire de [WakForge](https://github.com/Tmktahu/WakForge) (MIT License)
- Donnees : Document de reference Sram "L'Immortel" v2.7

## Utilisation
Ouvrir `index.html` dans un navigateur.
Aucun serveur necessaire — tout tourne en local (HTML/CSS/JS).

## Structure
Copy
build-generator/ data/ sram-base-stats.json # Stats de base, guilde, territoires sram-spells.json # Sorts (neutres + elementaires) sram-passives.json # 15 passifs Sram + 8 communs sram-sublimations.json # 12 sublimations documentees formulas.json # Formules WakfuCalc (degats, EHP, EM) js/ damage-engine.js # Moteur de calcul css/ style.css # Theme Sram/Ombre index.html # Interface principale README.md # Ce fichier


## Version
v1.0.0 — 27/03/2026
