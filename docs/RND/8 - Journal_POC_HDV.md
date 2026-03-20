# Journal POC - Hotel des Ventes (HDV)

**Date**: 2026-03-20 20:31
**Statut**: POC VALIDE - Lecture des offres et transactions confirmee

---

## Objectif

Capturer automatiquement les offres de vente et les transactions a l'Hotel des Ventes de Wakfu via les logs Netty du client Java.

## Resultats

### Validation du solde kamas

- Solde avant achat: 724742 kamas
- Achat: Main du Boo pour 1 kama
- Message ctu meu=724741 recu apres achat
- CONFIRME: ctu.meu = solde kamas post-transaction

### Validation des offres de vente

Les messages coy contiennent les listings HDV avec le champ f10 = refId:
- f10=26599 Culotte
- f10=26858 Les Pompes Ettes
- f10=27486 Plastron de la Maman Gerbouille
- f10=25851 Anneau Poutreux
- f10=19886 Voile Nomade

Taux identification: 5/5 = 100 pourcent

### Validation de l achat

- Message cmv maH=OK = confirmation achat
- Message csf AddItemOperation m_refId=26426 m_qty=1 m_bagId=29186495290016880
- refId=26426 = Main du Boo
- bagId HDV = 29186495290016880 (different du bag inventaire 27497136409018909)

### Echelle du HDV

- 82918 offres de vente sur 9214 pages
- 4408 offres d achat sur 490 pages
- Joueur: 65 objets en vente, 26991K a recuperer

## Messages Netty HDV identifies

- coy = Offre de vente (f10=refId, f9=qty, f4=vendeurId, f22=prix?)
- cwj = Item marchand (mfZ=prix?, hvy=protobuf)
- csa = Chargement categorie (htO=sessionId, mgJ=protobuf)
- crW = Ouverture session HDV (mgF=sessionId)
- crX = Fermeture session HDV (htO=sessionId, jDn=true)
- cmv = Confirmation achat (maH=OK)
- csf = Item recu (AddItemOperation avec refId, qty, bagId)
- ctu = Solde kamas (meu=solde)
- cvg = Config zone HDV (aDh=zoneId)
- clU/clX = Navigation menu
- cud = Interaction PNJ (huJ=npcId)
- coM = Mouvement PNJ

## Points a investiguer

1. Champ prix exact dans coy (f22=-1000 encode?)
2. Pagination: quel message demande la page suivante?
3. Onglet Mes offres: messages specifiques?
4. Onglet Historique: messages specifiques?
5. Mise en vente: capturer le flux sortant
6. Recuperation kamas: message de confirmation

## Prochaines etapes

1. Capturer navigation multi-pages pour identifier la pagination
2. Capturer onglet Mes offres et Historique
3. Tester achat a prix plus eleve pour valider le champ prix
4. Construire POC tracker HDV temps reel
5. Designer API communautaire prix HDV
