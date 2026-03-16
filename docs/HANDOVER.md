# Handover pour reprise agent

## Ce qui ne marchait pas (retour utilisateur)
- Mauvaises images ou images incoherentes sur certains objets.
- Corrections manuelles pas assez fiables partout (notamment metiers).
- Increments fantomes de niveau metier apres edition manuelle.
- Clic droit non disponible partout pour corriger/signaler un bug.
- HDV insuffisant pour les cas reels (achat/vente, ownership, nom joueur, qualite).
- Onglet combats absent/invisible dans certaines versions de l'UI.
- Selection d'image via librairie Ankama sans validation claire.
- Besoin de reset propre de la base locale et des traces de session.
- Besoin d'un onboarding initial (niveau/xp/kamas) pour etablir une base fiable.
- Besoin de tagger les pertes (detruit/craft/banque/autre).
- Besoin de definir des recettes craft (composants + cout derive).

## Etat actuel implemente (a verifier en priorite)
- Onboarding initial (niveau, xp courante, xp totale niveau, kamas).
- Reset local via API/UI (donnees trackees, option vidage log Wakfu).
- Tags de perte par objet.
- Recettes craft et calcul de cout composants.
- HDV: offre a moi/autre + nom joueur.
- Clic droit de signalement de bug sur zones/objets/metiers/HDV/dashboard.
- Picker d'images avec selection explicite puis validation.
- Onglet combats present dans la navigation et rendu detaille.

## Prochaine verification pour le prochain agent
1. Tester end-to-end onboarding -> sauvegarde -> affichage header.
2. Tester reset + relecture log.
3. Tester icon picker: choix puis bouton valider.
4. Verifier table inventaire (colonnes pertes + cout craft).
5. Verifier tab combats avec logs reellement presents.
6. Revue UX des prompts (coherence des libelles FR).
