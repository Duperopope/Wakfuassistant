
## TABLE DES MATIÈRES

1. [Stats & ressources de base](#1-stats--ressources-de-base)
   - [Stats de base du Sram niveau 140](#stats-de-base-du-sram-niveau-140-sans-équipement-sans-aptitudes-sans-bonus)
   - [Bonus variables — Guilde](#bonus-variables--guilde)
   - [Bonus variables — Contrôle de territoires](#bonus-variables--contrôle-de-territoires-niveau-39)
   - [Baseline](#baseline--stats-totales-sans-aptitudes-avec-bonus-guilde-et-territoire-uniquement)

2. [Progression & aptitudes](#2-progression--aptitudes)
   - [Pool de points d'aptitudes](#pool-de-points-daptitudes-niveau-140--142-points-au-total)
   - [Documentation complète des aptitudes](#documentation-complète-des-aptitudes--source--csv-fait-main-par-le-joueur-vérifié-en-jeu)

3. [Mécanique de classe — Assassin Squelettique](#3-mécanique-de-classe--assassin-squelettique)
   - [Mécaniques de classe](#mécaniques-de-classe--spécialité-assassin-squelettique--complet-screenshot)
   - [Passif de classe — Assassin Squelettique](#passif-de-classe--assassin-squelettique--complet-screenshot)

4. [Sorts](#4-sorts)
   - [Système de deck & passifs](#système-de-deck-et-passifs)
   - [Sorts élémentaires — Barre Feu](#sorts-élémentaires--barre-feu--55-branche-complète)
   - [Sorts élémentaires — Barre Eau](#sorts-élémentaires--barre-eau--55-branche-complète)
   - [Sorts élémentaires — Barre Air](#sorts-élémentaires--barre-air--55-branche-complète)
   - [Sorts de classe du Sram](#sorts-de-classe-du-sram--6-documentés)
   - [Sorts neutres / spécialité Sram](#sorts-neutres--spécialité-sram--6~9-documentés-en-cours)
   - [Sorts communs](#sorts-communs-toutes-classes--1-documenté-en-cours)
   - [Le Double — invocation et sorts propres](#le-double--invocation-et-sorts-propres)

5. [Passifs](#5-passifs)
   - [Passifs spécifiques Sram](#passifs-spécifiques-sram--1515-documentés-complets)
   - [Passifs communs](#passifs-communs-disponibles-pour-toutes-les-classes--8)

6. [Calcul des dégâts](#6-calcul-des-dégâts)
   - [Types de dégâts dans Wakfu](#types-de-dégâts-dans-wakfu)
   - [Formule de dommages](#formule-de-dommages)
   - [Mécanisme Invisibilité × Retenue × Maître des Ombres × Fluctuation](#mécanisme-invisibilité--retenue--maître-des-ombres--fluctuation--confirmé)

7. [Équipement & optimisation](#7-équipement--optimisation)
   - [Sublimations](#sublimations--système-et-builds-pour-le-sram--17-documentées)
   - [Système de châsses](#système-de-châsses--correspondance-couleurs/formes)

8. [Théorycrafting](#8-théorycrafting--débats-de-build)

9. [Annexes](#9-annexes)
   - [Suivi des données en attente](#suivi-des-données-en-attente)
   - [Note pour LLM externe](#note-pour-llm-externe)

---

## 1. Stats & ressources de base

## STATS DE BASE DU SRAM NIVEAU 140 (sans équipement, sans aptitudes, sans bonus)

Le Sram niveau 140 possède nativement 1 450 points de vie, 6 points d'action (PA), 3 points de mouvement (PM), 6 points de wakfu (PW) et 3% de coup critique. Ce sont les stats intrinsèques de la classe à ce niveau. Toutes les autres stats de combat sont à zéro nativement.

---

## BONUS VARIABLES — GUILDE

Ces bonus proviennent de la guilde et sont susceptibles de changer. Actuellement ils apportent : 45 points de vie (via deux lignes : 10 PV multiplié par 3 et 5 PV multiplié par 3), 10 de sagesse (5 multiplié par 2), 10 de prospection (5 multiplié par 2), 10 d'initiative (5 multiplié par 2), 15 d'esquive (5 multiplié par 3), 15 de tacle (5 multiplié par 3), 8% de dommages infligés (2% multiplié par 4), 6% de soins réalisés (2% multiplié par 3), 20 de résistance feu (5 multiplié par 4), 20 de résistance terre (5 multiplié par 4), 20 de résistance eau (5 multiplié par 4), 20 de résistance air (5 multiplié par 4), et 10% d'XP fabrication (5% multiplié par 2).

---

## BONUS VARIABLES — CONTRÔLE DE TERRITOIRES (Niveau 39)

Ces bonus dépendent du nombre de territoires contrôlés par le clan et peuvent fluctuer. Au niveau 39, ils apportent : 39 points de vie, 30 de sagesse et 30 de prospection.

---

## BASELINE — Stats totales sans aptitudes (avec bonus guilde et territoire uniquement)

Points de vie : 1 534 sur 1 534. PA : 6. PM : 3. PW : 6. Dommages infligés : 8%. Soins réalisés : 6%. Coup critique : 3%. Parade : 0%. Initiative : 10. Portée : 0. Esquive : 15. Tacle : 15. Sagesse : 40. Prospection : 40. Volonté : 0. Maîtrises élémentaires : toutes à 0. Résistances élémentaires : toutes à 20 (4%). Maîtrise critique : 0. Maîtrise dos : 0. Maîtrise mêlée : 0. Maîtrise distance : 0. Maîtrise soin : 0. Maîtrise berserk : 0. Résistance critique : 0. Résistance dos : 0. Armure donnée : 0%. Armure reçue : 0%. Dommages indirects : 0%.

---

## 2. Progression & aptitudes

## POOL DE POINTS D'APTITUDES (Niveau 140) — 142 points au total

### Système de gain de points

Les points d'aptitudes classiques (Intelligence, Force, Agilité, Chance) sont gagnés en rotation cyclique à chaque level up : Niv. 2 = Intelligence, Niv. 3 = Force, Niv. 4 = Agilité, Niv. 5 = Chance, Niv. 6 = Intelligence, etc. Les points Majeurs sont débloqués à des niveaux fixes à la place d'un point classique : Niv. 25 = 1er point Majeur, Niv. 75 = 2ème point Majeur, Niv. 125 = 3ème point Majeur, Niv. 175 = 4ème point Majeur.

### Répartition au niveau 140

Intelligence : 35 points. Force : 35 points. Agilité : 35 points. Chance : 34 points. Majeur : 3 points. Total : 142 points.

---

## DOCUMENTATION COMPLÈTE DES APTITUDES — SOURCE : CSV FAIT MAIN PAR LE JOUEUR, VÉRIFIÉ EN JEU

### CATÉGORIE INTELLIGENCE — 35 points disponibles

Stat "% Points de Vie" : pas de plafond (infini). +4% PV par point. Stat "Résistance Élémentaire" : plafond 10. +10 Rés. Élém. par point. Max +100. Stat "Barrière" : plafond 10. +1 activation par point. -70 dommages par activation au Niv. 140. Stat "% Soins reçus" : plafond 5. +6% par point. Max +30%. Stat "% PdV en Armure" : plafond 10. +4% PdV en Armure par point. Max +40%.

### CATÉGORIE FORCE — 35 points disponibles

Stat "Maîtrise Élémentaire" : pas de plafond. +5 par point. Stat "Maîtrise Mêlée" : plafond 40. +8 par point. Max +320. Stat "Maîtrise Distance" : plafond 40. +8 par point. Max +320. Stat "Points de Vie" : pas de plafond. +20 PV par point.

### CATÉGORIE AGILITÉ — 35 points disponibles

Stat "Tacle" : pas de plafond. +6 par point. Stat "Esquive" : pas de plafond. +6 par point. Stat "Initiative" : plafond 20. +4 par point. Max +80. Stat "Tacle et Esquive" : pas de plafond. +4 Tacle ET +4 Esquive par point. Stat "Volonté" : plafond 20. +1 par point. Max +20.

### CATÉGORIE CHANCE — 34 points disponibles

Stat "% Coup Critique" : plafond 20. +1% par point. Max +20%. Stat "% Parade" : plafond 20. +1% par point. Max +20%. Stat "Maîtrise Critique" : pas de plafond. +4 par point. Stat "Maîtrise Dos" : pas de plafond. +6 par point. Stat "Maîtrise Berserk" : pas de plafond. +8 par point. Stat "Maîtrise Soin" : pas de plafond. +6 par point. Stat "Résistance Dos" : plafond 20. +4 par point. Max +80. Stat "Résistance Critique" : plafond 20. +4 par point. Max +80.

### CATÉGORIE MAJEUR — 3 points disponibles, 1 point max par stat

+1 PA. +1 PM et +20 Maîtrise Élémentaire. +1 Portée et +40 Maîtrise Élémentaire. +2 PW. +20% Armure donnée (cap 50% PV). +10% DI. +50 Résistance Élémentaire. +10% Soins réalisés. +10% Dommages indirects et +40 Maîtrise Élémentaire.

---

## 3. Mécanique de classe — Assassin Squelettique

## MÉCANIQUES DE CLASSE — SPÉCIALITÉ "ASSASSIN SQUELETTIQUE" — COMPLET (SCREENSHOT)

### Passif de début de combat

En début de combat : +20% Coup Critique, +50 Point Faible, déblocage des sorts de la 3ème barre (Invisibilité, Double, Piège de Répulsion, Piège d'Attraction, Piège de Téléportation, Retirer un Piège).

### Mécanique "Point Faible"

Ressource générée par les sorts élémentaires. Tous les 25 PF consommés : +1 PA, +1 PM, +1 PW, +10 Hémorragie sur la cible. Sources : 50 PF au début du combat, sorts élémentaires (5 PF/PA constant), +25 PF en fin de tour si isolé (aucun ennemi à 2 cases ou moins) ET sans état Assassin, +25 PF en tuant un ennemi.

### État "Assassin"

Obtenu au kill. Empêche les 25 PF de fin de tour par isolement. **Le passif spécifique "Assassin" (Niv. 10) remplace les +25 PF au kill par +1 PA, +1 PM, +1 PW, +20% PV soin.**

### Mécanique "Hémorragie"

État sur la cible. Dommages supplémentaires sous l'armure quand le Sram inflige des dommages directs. Peut être converti en Hémophilie par le passif Hémophilie. Peut être posé en masse (+20 Niv.) par l'explosion de Leurre. Peut être transféré via Assaut létal ou Contact Létal standard.

### Bonus isolé — CONFIRMÉ %df — CONDITION CONFIRMÉE PAR SCREENSHOT

+50% de dommages supplémentaires aux ennemis isolés. **Condition : "aucun allié à 2 cases ou moins OU au contact de son Double".** Le Double ACTIVE le bonus isolé.

### Invisibilité et Maître des Ombres — CONFIRMÉ %df

Invisibilité : 2 PA + 2 PW, portée 1-4, **durée fixe 2 tours (tombe automatiquement fin tour 2)**, +2 PM. Maître des Ombres : ×2.00 %df sur le premier sort de dommages directs en sortant d'invisibilité. **Fluctuation s'accumule sur les ennemis qui interagissent avec le Sram invisible — confirmé. Le Sram invisible est quasiment intaclable (esquive massive).**

---

## PASSIF DE CLASSE — ASSASSIN SQUELETTIQUE — COMPLET (SCREENSHOT)

### Description complète (confirmée par screenshot)

**En début de combat :** déblocage des sorts de la 3ème barre (Invisibilité, Double, Piège de Répulsion, Piège d'Attraction, Piège de Téléportation, Retirer un Piège). Le Sram gagne +20% Coup Critique et +50 Point Faible.

**Bonus isolé :** le Sram inflige 50% de dommages supplémentaires aux ennemis isolés (aucun allié à 2 cases ou moins) OU au contact de son Double. **Confirmé %df ×1.50.**

**Au kill :** en tuant un ennemi, le Sram gagne +25 Point Faible et l'état Assassin.

**En fin de tour :** le Sram gagne +25 Point Faible s'il est isolé (aucun ennemi à 2 cases ou moins) et n'a pas l'état Assassin.

**Génération de PF :** les sorts élémentaires du Sram génèrent du Point Faible.

---

## 4. Sorts

## SYSTÈME DE DECK ET PASSIFS

### Deck de sorts

12 sorts maximum dans le deck de combat, choisis parmi sorts élémentaires (15 au total : 5 × 3 branches Feu/Eau/Air) + sorts neutres/spécialité Sram (~15 sorts) + sorts communs (toutes classes — Charme de Masse documenté).

### Passifs — Système

Slots débloqués : Niv. 10, 30, 50, 100, 150, 200. Au Niv. 140 : **4 slots de passifs**. Prochain slot au Niv. 150. **Les slots acceptent n'importe quel mix de passifs communs ET passifs spécifiques Sram**, sans restriction de type. Seule limite : le nombre de slots.

---

## SORTS ÉLÉMENTAIRES — BARRE FEU — 5/5, BRANCHE COMPLÈTE

Premier Sang : 2 PA, portée 1, normal 35, critique 44, PF +10, Hémorragie +10 (ou +2 si déjà), mêlée, 3/tour.

Ouvrir les Veines : 2 PA, portée 1, normal 38, critique 48, PF +10 + PF par Hémorragie consommée, consomme Hémorragie, soin 1% PV max par Hémorragie, mêlée, 1/cible et 3/tour.

Saignée mortelle : 3 PA, portée 1-5, normal 53, critique 66, PF +15, Hémorragie +6, état Saignée mortelle (réplique auto), soin 100% dommages Hémorragie, mixte (réplique mêlée), 3/cible et 4/tour.

Châtiment : 4 PA, portée 0 (zone), normal 82 (103 boosté), critique 103 (128 boosté), PF +20, mêlée (zone), 2/tour. **Avec Assaut Brutal : perd +20 PF, gagne +20% dommages.**

Mise à mort : 6 PA, portée 1, normal 123 (+1%/PF), critique 154 (+1%/PF), consomme tout le PF, mêlée, 1/tour. **%df confirmé. NON AFFECTÉ par Assaut Brutal.**

---

## SORTS ÉLÉMENTAIRES — BARRE EAU — 5/5, BRANCHE COMPLÈTE

Kleptosram : 2 PA, portée 1-2 (en ligne, pas de LdV, monocible), normal 35, critique 44, PF +10 (+5 de dos), mêlée, 3/tour. **CONFIRMÉ 2 PA.**

Arnaque : 2 PA, portée 1-2 (pas de LdV), normal 35 (+1%/PF), critique 44 (+1%/PF), consomme tout le PF, soin 0.5% PV/PF, mêlée, 3/tour.

Attaque perfide : 3 PA, portée 1-2 (pas de LdV), normal 71, critique 89, **passe sous l'armure**, donne 40% dommages en armure à la cible ennemie, PF +15, mêlée, 2/cible et 3/tour.

Attaque létale : 4 PA, portée 1-2 (pas de LdV), normal 76, critique 96, PF +20, si kill +2 PA +2 PM, mêlée, 2/tour. **Avec Assaut Brutal : perd +20 PF, gagne +20% dommages.**

Attaque mortelle : 5 PA, portée 1-2 (pas de LdV), normal 103 (144 si cible <50% PV), critique 128 (180 si cible <50% PV), PF +25, mêlée, 1/cible. **Avec Assaut Brutal : perd +25 PF, gagne +25% dommages.**

### Traits de branche Eau

Tous les sorts Eau : portée 1-2, pas de LdV, full mêlée. Ratio PF/PA constant à 5 PF/PA. Kleptosram de dos = 7.5 PF/PA.

---

## SORTS ÉLÉMENTAIRES — BARRE AIR — 5/5, BRANCHE COMPLÈTE

Coup pénétrant : 4 PA, portée 1, normal 76, critique 96, PF +20, mêlée, 2/tour. **Bonus anti-armure** : si armure, +38/48 sur l'armure. **Avec Assaut Brutal : perd +20 PF, gagne +20% dommages.**

Fourberie : 3 PA, portée 1-4 (pas de LdV), normal 57, critique 72, PF +15, 1/cible et 3/tour. **Téléporte le Sram derrière la cible.**

Coup Sournois : 3 PA, portée 1, normal 57, critique 72, PF +15, mêlée, 1/cible et 4/tour. **S'éloigne de 2 cases. Répétition multi-cibles.**

Effroi : 3 PA, portée 1, normal 49/65, critique 61/82, PF +15, mêlée, 2/cible et 3/tour. **Retourne la cible.**

Traumatisme : 4 PA, portée 1-4 (pas de LdV), normal 76, critique 96, +1%/PF (%df), consomme PF, mêlée, 2/tour. **NON AFFECTÉ par Assaut Brutal.**

---

## SORTS DE CLASSE DU SRAM — 6 DOCUMENTÉS

Invisibilité : 2 PA + 2 PW, portée 1-4, **durée fixe 2 tours**, +2 PM. Déclenche MdO. **Fluctuation s'accumule pendant l'invisibilité. Le Sram invisible est quasiment intaclable.**

Double : 2 PA + 1 PW, portée 1 (4 avec Passe-passe), 1/2 tours. Invoque le Double ou prend le contrôle.

Piège de Répulsion : 2 PA + 1 PW, portée 1-6, pas de LdV, 2/tour, 2 max. Pousse 2 cases (+2 PA si tour en cours). **Avec passif Embuscade : ne rend plus de PA, +1 PW + 72 dommages.**

Piège d'Attraction : 2 PA + 1 PW, portée 1-6, pas de LdV, 2/tour, 2 max. Attire 2 cases (+2 PA si tour en cours). **Avec passif Embuscade : ne rend plus de PA, +1 PW + 72 dommages.**

Piège de Téléportation : 2 PA + 1 PW, portée 1-6, pas de LdV, 2/tour, 2 max. Téléporte sur l'autre piège (6 cases max, +1 PA si tour en cours). Avec Piège de Téléportation II : piège non consommé (1 tour), 4 cases max, alliés uniquement.

Retirer un Piège : gratuit, portée 1-63, pas de LdV, 3/tour.

---

## SORTS NEUTRES / SPÉCIALITÉ SRAM — 6/~9 DOCUMENTÉS, EN COURS

### Sorts du Sram

Peur : 2 PA, portée 2-5, 3/tour. Pousse la cible sur la case ciblée. Si cible = Double : +2 PA.

Galopade : 1 PW, portée 1-3, 2 tours recharge. +3 PM max + 560 Esquive (1 tour).

Entourloupe : 2 PA + 1 PW, portée 0, 2/tour. Swap avec Double. 2ème utilisation gratuite.

Sournoiserie : 2 PA, portée 1-6, 2 tours recharge. Marque → téléportation dos si piège déclenché.

Assassinat : 1 PA + 2 PW, portée 1-3, 2 tours recharge. -100 Rés Élém. **⚠️ Kill confirm uniquement.** La réduction de résistance cible un élément spécifique — pour les sorts élémentaires classiques du Sram (Feu/Eau/Air), cela réduit directement la résistance correspondante sans ambiguïté. Pour les dégâts Lumière ou Stasis (via sublimations), voir section Types de dégâts.

Surineur : 2 PW, portée 0, 2 tours de recharge. **Au début du prochain tour :** +20% Dommages infligés de dos, +20% Dommages infligés en coup critique, Stabilisé (tour en cours). **Buff burst massif.**

### Sorts du Double (4 sorts propres)

Peur (Double) : 2 PA, portée 2-3, 2/tour. Pousse/attire selon passif.

Diversion : 2 PA, portée 0, 1/tour. Tourne vers/de dos au Double selon passif.

Contact Létal : 2 PA, portée 1, 2 tours recharge. Marque Létale → standard ou Assaut létal.

Piège d'Embuscade : 4 PA, portée 3-6, pas de LdV, 1/tour. Double se téléporte face au déclencheur.

### Système de pièges — Vue d'ensemble

3 pièges posables (Répulsion, Attraction, Téléportation) + 1 piège Double (Embuscade) + Retirer un Piège. Tous invisibles pour l'ennemi. Répulsion et Attraction remboursent +2 PA si déclenchés dans le tour (coût net = 1 PW). Téléportation rembourse +1 PA. **Avec passif Embuscade Sram : pièges ne rendent plus de PA, mais +1 PW + 72 dommages au déclenchement ennemi.** Les passifs Piège II modifient chaque piège. Synergisent avec Sournoiserie.

---

## SORTS COMMUNS (toutes classes) — 1 DOCUMENTÉ, EN COURS

Charme de Masse : 2 PW, portée 1-4, 3 tours de recharge. Donne +150 Tacle à la cible. Attire de 2 cases vers la cible. **Tier A en AoE/regroupement.** **Tier B en single-target.**

---

## LE DOUBLE — INVOCATION ET SORTS PROPRES

### Sort d'invocation : Double

Coût : 2 PA + 1 PW. Portée : 1 (portée 4 en ligne sans LdV avec Passe-passe). Cooldown : 1 fois tous les 2 tours. Si Double déjà en jeu : gratuit en PA, prise de contrôle + tour instantané. **Le Sram prend le contrôle du Double PENDANT son propre tour** — deuxième tour avec 8 PA / 6 PM indépendants.

### Caractéristiques du Double (Niv. 1)

PA : 8. PM : 6. PV : 40% des PV max du Sram. Possède les caractéristiques du Sram. +2 Tacle. Immunisé zones du Sram. Ne peut pas être soigné. **Fragile à HL : meurt souvent en un tour ennemi.**

### Sorts du Double (4 sorts propres)

**Peur (Double)** : 2 PA, portée 2-3, 2/tour. Pousse (défaut) ou attire (avec Peur alternative) la cible.

**Diversion** : 2 PA, portée 0, 1/tour. Tourne les combattants vers le Double (défaut) ou de dos au Double (avec Diversion alternative).

**Contact Létal** : 2 PA, portée 1, 2 tours recharge. Marque Létale → standard (swap porteur ↔ Double) ou avec Assaut létal (Sram TP dos du porteur + 2 PA + transfert Hémorragie).

**Piège d'Embuscade** : 4 PA, portée 3-6, pas de LdV, 1/tour. Le Double se téléporte face au déclencheur.

---

## 5. Passifs

## PASSIFS SPÉCIFIQUES SRAM — 15/15 DOCUMENTÉS, COMPLETS

Duperie (Niv. 10) : Après avoir reçu des dommages directs, le Sram échange de position avec son Double. 1 fois par tour. Passif de survie réactif. **Tier A en survie.** **Tier B en DPS.**

Assassin (Niv. 10) : En tuant un ennemi : ne gagne plus de Point Faible, mais regagne directement +1 PA, +1 PM, +1 PW, et soin de 20% PV max. **Tier S en farm/multi-kill.** **Tier C en boss single-target.**

Retenue (Niv. 15) : Invisibilité ne peut plus cibler un allié. L'état Invisible n'est retiré QUE par un sort à 4 PA ou plus. **Tier S en burst.** Voir section Mécanisme Retenue × MdO.

Passe-passe (Niv. 20) : Le Double peut s'invoquer jusqu'à 4 Portée en ligne, sans LdV. En invoquant : échange de position avec le Double, puis re-échange en fin de tour. **Tier A en burst.** **Tier S en survie.**

Embuscade (Niv. 25) : Les pièges ne rendent plus de PA au Sram. Regagne 1 PW au déclenchement d'un piège. Lorsqu'un ennemi déclenche un piège du Sram : inflige 72 dommages. **Trade PA → PW + dommages passifs.** **Tier B en piège-spam/PW recovery.** **Tier C en burst DPS.**

Piège d'Attraction II (Niv. 30) : Le Piège d'Attraction passe en zone croix de taille 1, attire les cibles vers le centre. **Tier B en multi-cibles.** **Tier C en single-target.**

Peur alternative (Niv. 35) : Le sort Peur du Double ATTIRE la cible au contact du Double au lieu de la pousser. **Tier A en single-target.**

Hémophilie (Niv. 40) : En fin de tour, convertit l'Hémorragie des ennemis en Hémophilie (poison de début de tour ennemi : 4% du niveau du Sram par niveau d'Hémorragie, dommages mêlée). Hémorragie n'ajoute plus de dommages directs. **Tier B en DoT/attrition.** **Tier C en burst.**

Piège de Répulsion II (Niv. 45) : Le Piège de Répulsion devient monocible et pousse de 3 cases dans la direction du regard de la cible. **Tier B en mobilité.** **Tier C en contrôle.**

Localisation quantique (Niv. 50) : En début de combat, Maîtrise dos → Maîtrise mêlée. L'orientation de la cible n'est plus prise en compte (toujours ×1.00 face). **Tier D en conditions normales.** **Tier B situationnel** contre cibles immunisées au retournement ou dos inaccessible. **Passif de niche situationnel.**

Leurre (Niv. 60) : Le Double explose quand il subit des dommages directs. **Dommages CONFIRMÉS : 317 dommages neutres base (sans stuff), 1 220 dommages neutres avec stuff.** Applique Hémorragie (+20 Niv.) aux ennemis autour de lui. Les dommages de Leurre scalent avec les maîtrises/stats du Sram (confirmé par la différence base vs stuff : 317 → 1 220 = ×3.85 de scaling avec l'équipement). **Les dommages sont de type neutre** — voir section "Types de dégâts" pour les implications sur le choix de maîtrise et la résistance ciblée. **⚠️ Conflit avec Duperie.** **Tier A en AoE/farm.** **Tier B en single-target.**

Diversion alternative (Niv. 70) : Le sort Diversion du Double retourne les cibles DE DOS au Double. **Tier C en DPS standard.** **Tier B en gameplay défensif/distance.**

Piège de Téléportation II (Niv. 80) : Piège non consommé (1 tour), 4 cases max, alliés uniquement. **Tier B en team play.** **Tier C en solo** (garde utilité mobilité personnelle).

Assaut létal (Niv. 90) : Au kill : +2 PA, TP dans le dos du porteur de la Marque Létale, transfert Hémorragie. **Tier S en farm/multi-kill.** **Tier A en boss multi-adds.** **Tier C en boss single-target.**

Assaut Brutal (Niv. 100) : Sorts ≥4 PA ne génèrent plus de PF. +5% dommages par PA. Mise à mort et Traumatisme NON affectés. **Tier B en farm.** **Tier C en burst boss.**

---

## PASSIFS COMMUNS (disponibles pour toutes les classes) — 8

Évasion (Niv. 10) : +100% du niveau en Esquive (= +140 au Niv. 140). Après esquive (avec pertes) : +35% du niveau en Esquive pendant 3 tours (= +49). Passif défensif/mobilité. **Tier B pour Sram standard.** **Tier A avec Fluctuation** (plus d'esquive = plus de Fluctuation = plus de dommages reçus sur la cible).

Interception (Niv. 15) : +100% du niveau en Tacle (= +140 au Niv. 140). Après avoir taclé : +35% du niveau en Tacle pendant 3 tours (= +49). Passif contrôle. **Tier C pour Sram DPS standard.** **Tier B avec Fluctuation** (plus de tacle = plus de Fluctuation).

Inspiration (Niv. 25) : +50% du niveau en Initiative (= +70 au Niv. 140). +10% DI aux ennemis ayant plus d'Initiative. Passif offensif conditionnel. **Tier A pour Sram.**

Motivation (Niv. 35) : +1 PA, -20% Dommages infligés, +10 Volonté. **Tier C pour Sram DPS burst.** **Tier B pour Sram rotation longue / farm / PvP.**

Médecine (Niv. 55) : +30% Soins réalisés, +25% Armure donnée, -15% DI. **Tier C pour Sram.**

Rock (Niv. 65) : +60% PV, +25% Soins reçus, -25% DI, -50% Soins réalisés. **Tier C pour Sram DPS.**

Carnage (Niv. 75) : +15% DI, +10% DI aux ennemis avec Armure, -30% Soins réalisés. **Tier S pour Sram DPS** (quasi-obligatoire).

Fluctuation (Niv. Quete Huppermage — commun toutes classes) : **MÉCANIQUE COMPLÈTE — CONFIRMÉE PAR SCREENSHOTS + JOUEUR.**

**Déclencheurs de Fluctuation (le Sram pose Fluctuation sur l'ennemi) :**
Lorsqu'une entité esquive le Sram : avec pertes → Fluctuation (+10 Niv.), sans perte (esquive totale) → Fluctuation (+15 Niv.).
Lorsque le Sram tacle une entité : Fluctuation (+15 Niv.).
Aux entités terminant leur tour au contact du Sram : Fluctuation (+20 Niv.).
**Lorsqu'une entité passe à côté d'une case adjacente au Sram : Fluctuation s'applique. CONFIRMÉ PAR LE JOUEUR.** C'est le déclencheur principal en combat — le simple déplacement d'un ennemi près du Sram pose Fluctuation.

**Payoff CONFIRMÉ PAR SCREENSHOT :** L'état Fluctuation est un debuff posé sur l'ennemi. **Scaling : 1% dommages reçus par niveau de Fluctuation. CAP MAXIMUM : 60 niveaux = +60% dommages reçus.** Fluctuation est consommée au prochain sort du poseur de Fluctuation qui touche la cible. Durée : 2 tours.

**NATURE CONFIRMÉE : "Dommages reçus" côté cible.** C'est un multiplicateur SÉPARÉ de tout le reste de la formule de dommages (pas un %DI, pas un %df — c'est un debuff appliqué sur la cible qui augmente les dommages qu'elle reçoit). ×1.60 au cap de 60 niveaux.

**FONCTIONNE EN INVISIBILITÉ — CONFIRMÉ PAR LE JOUEUR.** Le Sram invisible est quasiment intaclable (esquive massive en invisibilité). Les ennemis qui tentent de l'attaquer génèrent des esquives → Fluctuation s'accumule. Les ennemis qui se déplacent à côté du Sram invisible → Fluctuation s'accumule. En pratique, le Sram invisible atteint souvent le cap de 60 rapidement face à plusieurs ennemis.

**⚠️ CAP DE 60 NIVEAUX — CONFIRMÉ.** Fluctuation ne peut PAS dépasser 60 niveaux. Le multiplicateur maximum est donc ×1.60, quel que soit le nombre d'interactions.

**⚠️ Fluctuation est consommée par LE PREMIER SORT du poseur qui touche la cible.** Le Sram doit lancer Mise à mort EN PREMIER (ou le sort le plus puissant) pour maximiser Fluctuation. Si Fourberie ou un autre sort touche la cible Fluctuée AVANT Mise à mort, Fluctuation est consommée/gaspillée. **Solution : Fourberie sur une cible SECONDAIRE pour le téléport, puis Mise à mort sur la cible Fluctuée.**

**⚠️ Chaque ennemi a son propre stack de Fluctuation.** Si 3 ennemis passent à côté du Sram, chacun accumule Fluctuation indépendamment. Le Sram choisit sur qui décharger.

**TIER FINAL — RÉÉVALUÉ AVEC TOUTES LES CONFIRMATIONS :**
**Tier S en burst boss** (le boss se déplace ou attaque le Sram invisible → Fluctuation cap 60 rapidement → Mise à mort avec ×1.60 séparé).
**Tier A en farm** (les mobs qui se déplacent près du Sram ou l'attaquent → Fluctuation → le premier sort sur chacun est boosté de ×1.30-1.60).
**Tier S en PvP** (les joueurs bougent et attaquent beaucoup → Fluctuation cap rapide).
**Fluctuation + Évasion (passif) = combo Tier S** (plus d'esquive = plus de Fluctuation = plus de dommages reçus).
**Fluctuation + Invisibilité = combo Tier S** (intaclable = esquive totale = +15/interaction, cap atteint en 4 esquives totales).

---

## 6. Calcul des dégâts

## TYPES DE DÉGÂTS DANS WAKFU

### Les 6 types de dégâts

Wakfu possède 6 types de dégâts : 4 élémentaires classiques (Feu, Eau, Terre, Air) et 2 spéciaux (Lumière, Stasis). Les sorts du Sram sont principalement Feu, Eau et Air. Lumière et Stasis interviennent via certaines mécaniques spécifiques (sublimation Rupture violente pour la Lumière, certains effets de jeu pour la Stasis).

### Lumière et Stasis — Mécaniques de calcul

Les deux types spéciaux partagent un point commun côté offensif : ils utilisent la Maîtrise élémentaire la plus haute du lanceur pour le calcul des dégâts. Si un personnage a 1200 Maîtrise Feu, 800 Eau, 600 Terre et 500 Air, un sort Lumière ET un sort Stasis utiliseront les 1200 de Feu.

La différence fondamentale se situe côté défensif (résistances de la cible). **Lumière tape dans la résistance la plus HAUTE de la cible.** Si un monstre a 60% résistance Feu, 40% Eau, 30% Terre, 20% Air, un sort Lumière sera encaissé par les 60% de résistance Feu. Lumière est donc intrinsèquement pénalisé par les résistances adverses. **Stasis tape dans la résistance la plus BASSE de la cible.** Dans le même exemple, un sort Stasis sera encaissé par les 20% de résistance Air. Stasis exploite donc la faiblesse de l'ennemi et est considéré comme dévastateur, notamment en multi-cibles où chaque monstre peut avoir une faiblesse élémentaire différente.

### Règle de priorité en cas d'égalité — FETA

Quand plusieurs maîtrises élémentaires sont égales (côté lanceur) ou plusieurs résistances sont égales (côté cible), le jeu utilise l'ordre de priorité FETA : Feu, puis Eau, puis Terre, puis Air. C'est un moyen mnémotechnique bien connu de la communauté Wakfu.

### Implications pour le Sram

**Rupture violente (sublimation GGR)** : inflige des dégâts Lumière au retrait d'armure (20% du niveau du Sram). Ces dégâts Lumière utiliseront la maîtrise la plus haute du Sram MAIS taperont dans la résistance la plus HAUTE de la cible. Cela réduit l'efficacité de Rupture violente contre des cibles à résistances élevées et hétérogènes. **Cela renforce le tier B de Rupture violente** : les dégâts bonus sont pénalisés par la mécanique Lumière.

**Leurre (passif Sram)** : les 317/1220 dommages d'explosion sont en "dommages neutres". Les dommages neutres dans Wakfu ne sont PAS de la Lumière ni de la Stasis — ils utilisent la maîtrise élémentaire la plus haute du lanceur ET tapent dans la résistance correspondante à cet élément. **⚠️ À vérifier : les dommages neutres de Leurre suivent-ils la règle Lumière, Stasis, ou un 3ème système propre aux dommages neutres ?** Cette distinction change l'efficacité réelle de Leurre contre des cibles à résistances hétérogènes.

**Assassinat (-100 Rés Élém.)** : réduit la résistance d'UN élément spécifique. Contre une cible Stasis, cela n'aide que si l'élément réduit est déjà le plus bas. Contre une cible Lumière, cela n'aide que si l'élément réduit est déjà le plus haut. Pour les sorts élémentaires classiques du Sram (Feu/Eau/Air), Assassinat réduit directement la résistance correspondante — pas d'ambiguïté.

---

## FORMULE DE DOMMAGES

### Formule globale

Dommages finaux = (((Base du sort × (1 + (Somme des Maîtrises pertinentes / 100)) × Bonus d'orientation × Multiplicateur critique × (1 + (Somme des %DI / 100)) × Produit des %df × (1 - (%Résistance / 100))) + Dommages fixes) - Barrière) × Coefficient de Parade × (1 + Fluctuation%/100)

### Sélection de la Maîtrise et de la Résistance selon le type de dégâts

Pour les sorts élémentaires classiques (Feu, Eau, Air du Sram) : la Maîtrise utilisée est celle de l'élément du sort, et la résistance de la cible est celle du même élément. Aucune ambiguïté.

Pour les dégâts Lumière : la Maîtrise utilisée est la plus haute des 4 éléments du lanceur. La résistance ciblée est la plus haute des 4 éléments de la cible. Intrinsèquement défavorable.

Pour les dégâts Stasis : la Maîtrise utilisée est la plus haute des 4 éléments du lanceur. La résistance ciblée est la plus basse des 4 éléments de la cible. Intrinsèquement favorable.

En cas d'égalité, priorité FETA : Feu > Eau > Terre > Air.

### Somme des Maîtrises pertinentes (ADDITIVES entre elles)

Toutes les maîtrises pertinentes sont additionnées en un seul pool avant d'être divisées par 100 :

Maîtrise Élémentaire (correspondant à l'élément du sort, ou la plus haute pour Lumière/Stasis) + Maîtrise Mêlée (si la cible est à 2 cases ou moins) OU Maîtrise Distance (si la cible est à 3 cases ou plus) + Maîtrise Dos (si le lanceur frappe dans le dos de la cible) + Maîtrise Critique (si le sort est un coup critique) + Maîtrise Berserk (si le lanceur a 50% PV ou moins).

**Point crucial : Mêlée, Dos et Critique sont dans le MÊME pool additif.** Passer de 500 à 600 de maîtrise totale donne moins de gain relatif que passer de 100 à 200. C'est le principe des rendements décroissants.

### Bonus d'orientation (MULTIPLICATEUR séparé)

×1.00 si la cible fait face au lanceur (de face). ×1.10 si la cible montre son côté au lanceur (de côté). ×1.25 si la cible montre son dos au lanceur (de dos).

**Le ×1.25 de dos est un multiplicateur séparé des maîtrises. Il se multiplie avec le reste, il ne s'additionne pas.**

### Multiplicateur critique (MULTIPLICATEUR séparé)

×1.00 si le sort n'est pas un coup critique. ×1.25 si le sort est un coup critique (la base du sort ET les niveaux d'états appliqués sont multipliés par 1.25).

**Le ×1.25 de critique est un multiplicateur séparé des maîtrises. Il se multiplie avec le reste.**

### Somme des %DI (Dommages Infligés — ADDITIFS entre eux, MULTIPLICATEUR séparé des maîtrises)

Tous les %DI sont additionnés : %DI de guilde + %DI d'aptitudes + %DI de sublimations (Témérité, etc.) + %DI conditionnels. Puis le total est un multiplicateur : (1 + total%DI/100).

**Les %DI sont un 3ème multiplicateur séparé.** 8% guilde + 10% Majeur + 30% Témérité = 48% DI total = ×1.48.

### Produit des %df (Dommages supplémentaires de classe — MULTIPLICATEURS SÉPARÉS entre eux ET des %DI) — CONFIRMÉ par MethodWakfu

Les %df sont des multiplicateurs propres à certaines mécaniques de classe. Chaque %df est un multiplicateur séparé qui se multiplie avec tous les autres. Ils ne s'additionnent PAS entre eux et ne s'additionnent PAS avec les %DI.

**%df confirmés du Sram :**

Bonus isolé : ×1.50 (+50% dommages contre ennemis isolés). **Confirmé %df. CONDITION CONFIRMÉE PAR SCREENSHOT : "aucun allié à 2 cases ou moins OU au contact de son Double". Le Double ne brise PAS le bonus isolé — il l'active.**

Maître des Ombres : ×2.00 (+100% dommages sur le premier sort de dommages directs en sortant d'invisibilité). **Confirmé %df par MethodWakfu.**

Mise à mort — scaling PF : ×(1 + PF%/100). Avec 100 PF = ×2.00. **Confirmé %df par MethodWakfu.**

Arnaque — scaling PF : ×(1 + PF%/100). **Confirmé %df.**



**Pile maximale de %df du Sram en burst :** Maître des Ombres ×2.00 × Isolé ×1.50 × Mise à mort/Traumatisme à 100 PF ×2.00 = **×6.00 de multiplicateur %df total**. Cela se multiplie ENSUITE avec les maîtrises, le ×1.25 dos, le ×1.25 crit et les %DI.

### Conversion Résistance brute → %Résistance

%Résistance = 1 - 0.8^(Résistance brute / 100). 0 brut = 0%. 100 brut = 20%. 200 brut = 36%. 311 brut = 50%. 540 brut = 70%. 722 brut = 80%. 1032 brut = 90% (cap maximum).

La résistance effective inclut : Résistance élémentaire correspondante + Résistance Critique (si coup critique) + Résistance Dos (si attaque de dos).

### Coefficient de Parade

×1.00 si pas de parade. ×0.80 si parade (réduit de 20% les dommages). ×0.68 si parade + sublimation Blocking Expert.

### Fluctuation — MULTIPLICATEUR SÉPARÉ "DOMMAGES REÇUS" CÔTÉ CIBLE — CONFIRMÉ

Fluctuation est un debuff posé sur la cible ennemie. C'est un multiplicateur "dommages reçus" côté cible — **CONFIRMÉ par le joueur comme étant un "dommage reçu côté cible"**. Il s'applique APRÈS tous les calculs côté lanceur, comme un multiplicateur final séparé. **Scaling : 1% par niveau de Fluctuation. CAP : 60 niveaux maximum = +60% dommages reçus = ×1.60.** Fluctuation est consommée par le premier sort du poseur de Fluctuation qui touche la cible.

### Exemple concret — Mise à mort avec 100 PF, de dos, en critique, isolé, Maître des Ombres

Base du sort en critique : 154. Bonus PF (100 PF) : ×2.00 (%df). Supposons 600 de maîtrise totale (élémentaire + mêlée + dos + critique). Multiplicateur maîtrise : (1 + 600/100) = 7.00. Orientation dos : ×1.25. Maître des Ombres : ×2.00 (%df). Isolé : ×1.50 (%df). Mise à mort PF : ×2.00 (%df). %DI : 63% (8% guilde + 10% majeur + 30% Témérité + 15% Carnage) = ×1.63.

**Calcul complet avec Carnage :** 154 × 7.00 × 1.25 × 1.63 × 2.00 × 1.50 × 2.00 = **13 165 dommages avant résistances**.

Contre un ennemi à 50% résistance (311 brut) : 13 165 × 0.50 = **6 583 dommages nets**.

Contre un ennemi avec Assassinat (-100 rés) à 311→211 brut (≈33% rés) : 13 165 × 0.67 = **8 821 dommages nets**.

### Exemple concret — Mise à mort avec Surineur actif

Base du sort en critique : 154. Bonus PF (100 PF) : ×2.00 (%df). Supposons 600 de maîtrise totale. Multiplicateur maîtrise : 7.00. Orientation dos : ×1.25. Maître des Ombres : ×2.00 (%df). Isolé : ×1.50 (%df). Mise à mort PF : ×2.00 (%df). %DI avec Surineur : 103% (8% guilde + 10% majeur + 30% Témérité + 15% Carnage + 20% Surineur dos + 20% Surineur crit) = ×2.03.

**Calcul complet avec Surineur :** 154 × 7.00 × 1.25 × 2.03 × 2.00 × 1.50 × 2.00 = **16 393 dommages avant résistances**.

**Gain de Surineur vs sans Surineur : +24.5% de dommages finaux.**

### Exemple concret — Mise à mort avec Surineur + Anatomie + Mesure III (BUILD ULTIME THÉORIQUE)

%DI : 8% guilde + 10% majeur + 30% Témérité + 15% Carnage + 20% Surineur dos + 20% Surineur crit + 40% Anatomie dos - 20% Anatomie malus + 20% Mesure III crit + 6% Embuscade sublimation mêlée = **149% DI = ×2.49**.

**Calcul complet build ultime :** 154 × 7.00 × 1.25 × 2.49 × 2.00 × 1.50 × 2.00 = **20 107 dommages avant résistances**.

**Pile multiplicative build ultime :** ×1.25 (dos) × ×1.25 (crit) × ×2.49 (%DI) × ×2.00 (MdO) × ×1.50 (Isolé) × ×2.00 (PF) = **×23.34**.

### Exemple concret — Mise à mort avec Fluctuation 60 niveaux (BUILD ULTIME + FLUCTUATION)

Fluctuation = multiplicateur séparé côté cible **CONFIRMÉ**. ×1.60 au cap de 60 niveaux.

**Build ultime + Fluctuation 60 :** 20 107 × 1.60 = **32 171 dommages avant résistances**. Pile multiplicative totale : ×23.34 × 1.60 = **×37.35**.

### Implications pour le build — Le débat Maîtrise vs Multiplicateurs

Le principe fondamental est : les maîtrises sont additives (rendements décroissants) tandis que les multiplicateurs (critique ×1.25, dos ×1.25, %DI, %df, Fluctuation) sont multiplicatifs (valeur constante).

**Conclusion théorique :** à haute maîtrise totale (>500), investir dans des multiplicateurs séparés (atteindre 100% crit, maximiser les %DI) devient plus efficace que d'ajouter de la maîtrise. Le build "100% crit + DI%" est mathématiquement optimal à haut niveau de maîtrise.

### Le cas spécifique du Sram

Le Sram commence le combat avec 23% de CC (3% base + 20% Assassin Squelettique). Il lui faut 77% supplémentaires.

**Pile multiplicative complète du Sram — Récapitulatif par palier :**

Burst basique (Carnage, sans Surineur) : ×15.28.
Burst avec Surineur : ×19.03.
Build ultime théorique (Surineur + Anatomie + Mesure III + Embuscade sublimation) : ×23.34.
Build ultime + Fluctuation 60 (multiplicateur séparé CONFIRMÉ) : **×37.35**.

### Impact de Localisation quantique sur la formule — RÉÉVALUÉ

Avec Localisation quantique : Maîtrise dos → Maîtrise mêlée, orientation forcée ×1.00. Perte de -20% dommages finaux en conditions normales. **Tier D en conditions normales.** **Tier B situationnel** contre cibles immunisées au retournement ou dos physiquement inaccessible. **Passif de niche situationnel, pas un piège à noobs universel.**

---

## MÉCANISME INVISIBILITÉ × RETENUE × MAÎTRE DES OMBRES × FLUCTUATION — CONFIRMÉ

### Les 4 règles fondamentales

**Règle 1 — Seuil de rupture d'invisibilité (avec passif Retenue)** : Le Sram perd l'invisibilité uniquement en infligeant des dommages directs avec un sort coûtant 4 PA ou plus.

**Règle 2 — Maître des Ombres se déclenche UNIQUEMENT au moment de devenir visible** : Le bonus MdO (×2.00 %df) ne se déclenche que sur le sort qui fait sortir de l'invisibilité (≥4 PA avec Retenue).

**Règle 3 — Retenue concentre 100% du bonus MdO sur le finisher.**

**Règle 4 — Durée fixe** : L'invisibilité tombe automatiquement à la fin du tour 2, quoi qu'il arrive. Le burst DOIT se faire dans cette fenêtre.

### Tableau — Sorts qui NE BRISENT PAS l'invisibilité (avec Retenue)

Premier Sang (2 PA), Ouvrir les Veines (2 PA), Saignée mortelle (3 PA), Peur (2 PA), Fourberie (3 PA), Coup Sournois (3 PA), Arnaque (2 PA), Attaque perfide (3 PA), Effroi (3 PA), Kleptosram (2 PA), Sournoiserie (2 PA), Entourloupe (2 PA + 1 PW), Piège de Répulsion (2 PA + 1 PW), Piège d'Attraction (2 PA + 1 PW), Piège de Téléportation (2 PA + 1 PW).

### Tableau — Sorts qui BRISENT l'invisibilité (≥4 PA, avec Retenue)

Châtiment (4 PA), Coup pénétrant (4 PA), Attaque létale (4 PA), Attaque mortelle (5 PA), Mise à mort (6 PA) — **CIBLE IDÉALE DU MdO**, Traumatisme (4 PA).

### Combo burst optimal confirmé avec Retenue + Surineur + Fluctuation (BUILD ULTIME)

**Tour 1 (tour du Sram) :** Invisibilité (2 PA, 2 PW) + Surineur (2 PW) → invisible 2 tours, +2 PM. Coût : 2 PA + 4 PW. Reste 4 PA + 2 PW pour setup (Double, pièges, etc.). **Tour ennemi :** les ennemis se déplacent à côté du Sram invisible et/ou tentent de l'attaquer → esquive (quasiment intaclable en invisible) → **Fluctuation s'accumule sur chaque ennemi qui interagit avec le Sram** (confirmé fonctionne en invisibilité). Le cap de 60 niveaux est atteint rapidement (4 esquives totales × 15 = 60, ou 3 passages adjacents × 20 = 60). **Tour 2 (tour du Sram, invisible, Surineur actif, Fluctuation cap 60 sur la cible) :** Fourberie (3 PA) sur une cible SECONDAIRE pour le téléport dos (ne pas gaspiller Fluctuation sur la cible principale). Puis sorts <4 PA pour PF (sur la cible secondaire ou via sorts qui ne ciblent pas la cible Fluctuée). Puis **Mise à mort (6 PA)** sur la cible avec Fluctuation → BRISE L'INVISIBILITÉ → **MdO ×2.00 + Fluctuation ×1.60 consommée + Surineur actif**. **Pile multiplicative build ultime avec Fluctuation 60 :** ×23.34 × 1.60 = **×37.35**. **⚠️ Attention à l'ordre des sorts :** Fluctuation est consommée par le PREMIER sort qui touche la cible Fluctuée. Mise à mort doit être le PREMIER sort à toucher cette cible.

---

## 7. Équipement & optimisation

## SUBLIMATIONS — SYSTÈME ET BUILDS POUR LE SRAM — 17 DOCUMENTÉES

### Sublimations Classiques

**Témérité** : BBG. Retrait total d'armure : +9% DI (max 30%/tour). **Tier S.** Source : Stèle Troncharbre (141+).

**Rupture violente** : GGR. Retrait d'armure : dégâts lumière 20% du niveau. **Tier B.** Source : Stèle Srambad (141+). **⚠️ Les dégâts Lumière tapent dans la résistance la plus HAUTE de la cible — intrinsèquement pénalisé.** Cela confirme le tier B : les dégâts bonus sont systématiquement réduits par la meilleure défense de l'adversaire.

**Rupture PA** : BBB. Retrait total d'armure : +1 PA (2 activ./tour). **Tier A.** Source : Stèle Troncharbre (141+).

**Destruction** : GBG. +9% dégâts dos / -6% face et côté. **Tier A dos.** Source : Brèche de Bonta (141+).

**Carnage (sublimation)** : RRG. PV > 90% : +63 Maîtrise élémentaire au Niv. 140. **Tier B.** Source : Stèle Crête Givrée (141+). **NE PAS CONFONDRE avec le passif commun Carnage.**

**Force vitale** : RGB. PV ≥ 90% : +1 PA. **Tier S burst.** Source : Stèle Carapattes (215).

**Influence vitale** : GRG. PV > 90% : +12% CC. **Tier A.** Source : Stèle Crustargneux (215).

**Embuscade (sublimation)** : BBR. +6% DI mêlée. **Tier A.** Source : Stèle Usine Mécanique (141+). **NE PAS CONFONDRE avec le passif Sram Embuscade.**

**Jugement** : RRB. Monocible : +9% dégâts sur cette cible tour suivant. **Tier A boss.** Source : Nox.

**Sanguinolence** : RGR. +4% dégâts reçus par malus (max 40%). **Tier A.** Source : Stèle Cagnardeurs (215).

**Loup solitaire** : RBG. Aucun allié 1-4 cases : +6% DI. **Tier A/C selon Double.** Source : Volcan Or'Hodruin.

**Profit** : BBG. Retrait PA/PM : +1 PA. **Tier C Sram.** Source : Stèle Cagnardeurs (215).

**Puissance brute** : GGG. -2 PW max, +4% DI/PW dépensé. **Tier C.** Source : Brèche Ultime Zinit (201+).

### Sublimations Épiques (1 slot)

**Anatomie** : Maît. élém. > Maît. dos : -20% DI, +40% DI dos. **Tier S dos.** Source : Bourse Ébéniste.

**Mesure III** : CC ≥ 50% : +20% DI crit. **Tier S crit.** Source : Bourse Ébéniste.

### Sublimations Reliques (1 slot)

**Pétulance** : Déplacement via sort : +1 PA (2 max/tour). **Tier S.** Source : Bourse Ébéniste.

**Par-delà la barrière** : Sort ≥4 PA : +15% dégâts crit. Sort ≥1 PW : +15% dégâts crit. **Tier A.** Source : Bourse Ébéniste.

**Brasero** : +10% DI 2 catégories tournantes. **Tier B.** Source : Bourse Ébéniste.

---

## SYSTÈME DE CHÂSSES — CORRESPONDANCE COULEURS/FORMES

Bleu = Triangle. Vert = Hexagone. Rouge = Carré. Blanc = Rond (joker).

---

## 8. Théorycrafting — Débats de build

## THÉORYCRAFTING — DÉBATS DE BUILD

### Débat 1 : Premier Sang + Ouvrir les Veines vs Kleptosram

Kleptosram de dos (7.5 PF/PA) > Premier Sang + Ouvrir les Veines en mono-cible longue durée.

### Débat 2 : Full Maîtrise vs 100% Crit

Build 100% crit = +25% dommages à maîtrise totale égale. Mathématiquement supérieur.

### Débat 3 : Mise à mort vs Traumatisme

Les deux dans le deck. Mise à mort = meilleur burst mono. Traumatisme = plus flexible (portée 1-4, pas de LdV).

### Débat 4 : Choix des 4 passifs — Analyse complète FINALE (15/15 passifs Sram + 8 communs)

**Configuration burst boss ULTIME (single target) — CONFIRMÉE AVEC FLUCTUATION :**
Assassin Squelettique (obligatoire) + Carnage (+15% DI, Tier S) + Retenue (contrôle MdO, Tier S burst) + **Fluctuation (Tier S burst — ×1.60 multiplicateur séparé au cap 60)**. Le 4ème slot donne plus de dommages que Passe-passe en burst pur. Passe-passe peut être remplacé si le positionnement est assuré autrement (Fourberie). **⚠️ Fluctuation occupe le slot de Passe-passe.** Le Sram perd le gap-close + escape du Double. Acceptable en boss statique où le positionnement est prévisible. **Alternative :** Assassin Squelettique + Carnage + Retenue + Passe-passe (si la survie/mobilité est prioritaire).

**Configuration burst boss avec Fluctuation + Passe-passe (5ème slot au Niv. 150) :**
Assassin Squelettique + Carnage + Retenue + Fluctuation + Passe-passe. **Le build parfait — nécessite le 5ème slot au Niv. 150.**

**Configuration farm/multi-kill — OPTIMALE :**
Assassin Squelettique + Carnage + Assassin + Assaut létal. **+3 PA, +1 PM, +1 PW, soin 20%, TP dos, Hémorragie transférée par kill.**

**Configuration farm alternative (AoE) :**
Assassin Squelettique + Carnage + Leurre + Assassin.

**Configuration AoE/Hémorragie :**
Assassin Squelettique + Carnage + Leurre + Hémophilie ou Piège d'Attraction II.

**Configuration piège-offensif :**
Assassin Squelettique + Carnage + Embuscade + Piège d'Attraction II ou Sournoiserie. **Niche.**

**⚠️ Conflit Duperie vs Leurre :** Choisir l'un OU l'autre. Leurre > Duperie à HL.

**⚠️ Conflit Assaut Brutal vs Build burst Mise à mort :** Ne pas prendre avec Retenue.

**⚠️ Conflit Embuscade Sram vs Mobilité piège :** Embuscade supprime le remboursement PA.

**⚠️ Localisation quantique : Tier D normal, Tier B situationnel** contre cibles anti-dos.

### Débat 5 : Rôle du Double dans le gameplay

Le Double est le pivot central. 8 PA / 6 PM indépendants = deuxième tour. Active le bonus isolé ×1.50 au contact. Avec Peur alternative, aspire les ennemis. Avec Leurre, sa mort est une arme (**1 220 dommages neutres avec stuff, confirmé**). Avec Passe-passe, gap-close + escape. Avec Assaut létal, chaîne de kills.

### Débat 6 : Les pièges comme outils de mobilité

PA-neutres sans Embuscade (coût net = 1 PW). PW-neutres avec Embuscade (mais coûteux en PA).

### Débat 7 : Localisation quantique — Réévaluée

Tier D normal, Tier B situationnel. Passif de niche.

### Débat 8 : Hémophilie — Quand la prendre ?

Viable en combats longs. Contre-synergique avec Ouvrir les Veines.

### Débat 9 : Leurre — Le Double-bombe — DOMMAGES CONFIRMÉS

Leurre > Duperie à HL. Conflit Duperie. **Dommages confirmés : 317 base sans stuff → 1 220 avec stuff (dommages neutres).** Le scaling avec les stats du Sram est massif (×3.85 multiplicateur entre nu et équipé). Leurre est un outil AoE redoutable en farm quand le Double meurt au milieu d'un pack. Les dommages de Leurre scalent avec les maîtrises/stats du personnage, ce qui en fait un passif qui se bonifie fortement avec l'équipement. **⚠️ "50% des PV courants du Double en zone" est la formule de base — les 317/1220 sont le résultat après application des maîtrises/stats.** Le Double ayant 40% des PV max du Sram, et l'explosion faisant 50% des PV courants du Double, la base est donc 20% des PV max du Sram. Avec 1 534 PV base : 20% = 307 PV de base, ce qui correspond presque aux 317 sans stuff (la petite différence pouvant venir des bonus guilde/territoire). Avec stuff, les PV augmentent et les maîtrises amplifient le tout → 1 220. **Les dommages sont de type neutre — voir section Types de dégâts pour les implications sur les résistances.**

### Débat 10 : Surineur — Le buff burst

+24.5% dommages finaux. **Tier S en burst boss.**

### Débat 11 : Assaut létal + Assassin — La chaîne de kills ultime

+3 PA, +1 PM, +1 PW, soin 20%, TP dos, Hémorragie conservée par kill.

### Débat 12 : Assaut Brutal — Pour ou contre ?

Passif de farm. **Ne jamais combiner avec Retenue.**

### Débat 13 : Fluctuation — LE GAME CHANGER (CONFIRMÉ — TIER S BURST)

**Scaling confirmé : 1% dommages reçus par niveau. CAP 60 niveaux = +60% max.**

**Fonctionne en invisibilité (confirmé par le joueur).** Le Sram invisible est quasiment intaclable → esquive totale quasi-systématique → +15 niveaux par interaction. Cap de 60 atteint en 4 esquives totales.

**Fluctuation se déclenche aussi au passage adjacent (confirmé par le joueur).** Un ennemi qui se déplace en passant par une case adjacente au Sram → Fluctuation s'applique. C'est le déclencheur le plus courant en combat.

**Fluctuation est un MULTIPLICATEUR SÉPARÉ "dommages reçus" côté cible — CONFIRMÉ.** ×1.60 au cap. Pile burst ultime = ×23.34 × 1.60 = **×37.35**.

**⚠️ Consommée au premier sort qui touche la cible.** Le Sram doit s'assurer que Mise à mort est le PREMIER sort à toucher la cible Fluctuée. Solution : Fourberie sur une cible secondaire pour le téléport, puis Mise à mort en premier sur la cible Fluctuée.

**⚠️ Durée 2 tours.** Fluctuation accumulée pendant le tour ennemi dure 2 tours — suffisant pour le tour de burst du Sram.

**⚠️ CAP 60 niveaux.** On ne peut PAS dépasser 60. Le multiplicateur plafonne à ×1.60. C'est déjà monstrueux mais il y a un plafond.

**Combo optimal Fluctuation + Invisibilité + Surineur + Retenue :** Tour 1 → Invisibilité + Surineur + setup. Tour ennemi → Fluctuation cap 60 (rapide en invisible). Tour 2 → burst avec MdO + Surineur + Fluctuation ×1.60. Pile multiplicative confirmée : **×37.35**.

**Fluctuation remplace Passe-passe** dans le 4ème slot pour un build burst boss pur. Passe-passe reste meilleur pour la survie/mobilité. **Build parfait au Niv. 150 : les deux.**

### Débat 14 : Charme de Masse — Le regroupement offensif

Sort commun. 2 PW, +150 Tacle + attraction 2 cases. **Tier A en AoE.**

### Débat 15 : Embuscade Sram — Le trade PA/PW des pièges

**Tier B en piège-spam.** **Tier C en burst DPS.**

### Débat 16 : Piège de Téléportation II — Réévalué

**Tier B team play, Tier C solo** (garde utilité mobilité perso).

### Débat 17 : Lumière vs Stasis — Implications pour le Sram

Le Sram n'utilise ni Lumière ni Stasis comme éléments principaux — ses sorts sont Feu, Eau et Air. Cependant, deux mécaniques impliquent ces types de dégâts : la sublimation **Rupture violente** (dégâts Lumière = tape dans la résistance la plus HAUTE de la cible → pénalisé) et les **dommages neutres de Leurre** (dont le comportement exact vis-à-vis des résistances reste à confirmer). La connaissance de Lumière/Stasis permet de comprendre pourquoi Rupture violente est tier B plutôt que tier A : ses dégâts bonus sont systématiquement encaissés par la meilleure résistance de la cible. En revanche, les sorts élémentaires classiques du Sram n'ont pas ce problème puisqu'ils tapent dans la résistance de leur propre élément. **La leçon pour le build : ne pas surinvestir dans des mécaniques Lumière. Les sorts élémentaires classiques (Feu finisher, Eau sustain, Air mobilité) restent le cœur du gameplay Sram.**

---

## 9. Annexes

## SUIVI DES DONNÉES EN ATTENTE

1. ~~Branche Feu~~ — **COMPLÈTE** (5/5).
2. ~~Branche Eau~~ — **COMPLÈTE** (5/5).
3. ~~Branche Air~~ — **COMPLÈTE** (5/5).
4. **Sorts neutres/spécialité Sram** — EN COURS (12/~15). Manquants potentiels : Escrosramerie, Filouterie, possiblement 1 autre.
5. **Sorts communs** — EN COURS (1 documenté : Charme de Masse).
6. **Passifs communs** — EN COURS (8 documentés dont Fluctuation COMPLET avec cap 60 confirmé).
7. ~~Passifs spécifiques Sram~~ — **COMPLETS** (15/15).
8. **Équipement** — non documenté.
9. **⚠️ Hémophilie + Ouvrir les Veines** — conflit potentiel.
10. ~~⚠️ Dommages explosion Leurre~~ — **RÉSOLU : 317 base sans stuff, 1 220 avec stuff, dommages neutres. Scale avec les maîtrises/stats du Sram.**
11. **⚠️ Sorts manquants** — Escrosramerie, Filouterie.
12. **⚠️ Assaut Brutal — +5%/PA = %DI ou %df ?**
13. **⚠️ Assaut létal + Retenue** — kill invisible → TP dos invisible ?
14. ~~⚠️ Fluctuation — scaling.~~ **RÉSOLU : 1%/niveau, cap 60, confirmé screenshot.**
15. ~~⚠️ Fluctuation + Invisibilité.~~ **RÉSOLU : fonctionne en invisibilité, confirmé joueur.**
16. ~~⚠️ Fluctuation — nature dans la formule.~~ **RÉSOLU : multiplicateur séparé "dommages reçus" côté cible, CONFIRMÉ joueur.**
17. **⚠️ Loup solitaire — Double compte comme allié ?**
18. **⚠️ Par-delà la barrière — dégâts critiques = %DI ou maîtrise ?**
19. **⚠️ Pétulance — quels sorts de déplacement comptent ?**
20. ~~⚠️ Embuscade Sram — 72 dommages fixes ou scalés ?~~ **Probablement fixes (à confirmer), mais le scaling de Leurre est confirmé.**
21. **⚠️ Leurre — les dommages neutres suivent quelle règle de résistance ?** Lumière (rés. la plus haute), Stasis (rés. la plus basse), ou l'élément correspondant à la maîtrise la plus haute ? À tester en jeu.
22. **⚠️ Assassinat — la réduction de -100 Rés Élém. cible quel élément exactement ?** Feu/Eau/Air spécifique ou tous ?

---

## NOTE POUR LLM EXTERNE

Formule : Base × (1+Maîtrises/100) × Orientation × Critique × (1+DI%/100) × Produit(%df) × (1-Rés%/100) × (1+Fluctuation%/100) - Barrière. Types de dégâts : Feu/Eau/Terre/Air (classiques), Lumière (maîtrise la plus haute du lanceur, résistance la plus haute de la cible — pénalisé), Stasis (maîtrise la plus haute du lanceur, résistance la plus basse de la cible — avantagé). Priorité égalité : FETA (Feu>Eau>Terre>Air). Fluctuation = multiplicateur séparé côté cible CONFIRMÉ. CAP 60 niveaux = ×1.60 max. Piles multiplicatives : Burst basique ×15.28. Burst + Surineur ×19.03. Build ultime théorique ×23.34. **Build ultime + Fluctuation 60 ×37.35 (multiplicateur séparé CONFIRMÉ, cap 60 CONFIRMÉ).** Invisibilité = durée fixe 2 tours. **Fluctuation fonctionne en invisibilité (confirmé). Se déclenche au passage adjacent (confirmé). Le Sram invisible est quasiment intaclable.** Scaling Fluctuation = 1%/niveau, cap 60 (confirmé screenshot : 60 niveaux = 60% dommages reçus). Consommée au premier sort. Dommages Leurre : 317 base → 1 220 stuff (neutres, scalent avec stats). Rupture violente = dégâts Lumière (tape dans rés. la plus haute — pénalisé, Tier B confirmé). Passifs communs : 8 documentés dont Fluctuation (TIER S BURST — game changer, cap 60). Passifs Sram : COMPLETS (15/15) incluant Embuscade. Passif classe Assassin Squelettique COMPLET. Config burst boss ultime Niv. 140 : Squelettique + Carnage + Retenue + Fluctuation + Surineur deck + Anatomie/Mesure III + Pétulance. Config burst boss Niv. 150 (5 slots) : + Passe-passe. Config farm : Squelettique + Carnage + Assassin + Assaut létal.
