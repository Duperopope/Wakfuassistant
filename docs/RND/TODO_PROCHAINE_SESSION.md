# TODO R&D — Prochaine session de jeu

*Créé le 2026-03-18 — suite aux Journaux d'écoute 1 et 2*

Ces actions sont à effectuer lors de la prochaine session de jeu pour confirmer,
infirmer ou compléter les données du Grand 1.

---

## Priorité haute

### 1. PERSONAL_SPACE — Échec d'ouverture du havre sac
**Contexte :** Le havre sac est un objet portable (pas une maison physique), ouvert
via icône/raccourci. Il est inaccessible dans certaines zones (donjons, bibliothèques,
zones surpeuplées). `PERSONAL_SPACE_ENTER_RESULT_MESSAGE` s'émet uniquement si
`success=true`.
**Objectif :** Vérifier ce qui est loggué quand l'ouverture échoue (zone interdite).
**Actions :**
- Tenter d'ouvrir le havre sac dans un donjon ou une bibliothèque
- Observer si un message `success=false` ou un message d'erreur apparaît
**Pattern à observer :** `PERSONAL_SPACE_ENTER_RESULT_MESSAGE`, `[Messages d'erreur]`
**Résultat attendu :** Confirmer si les tentatives échouées sont détectables.

---

### 2. Board IDs HDV — autres villes
**Objectif :** Constituer le mapping `bAL id=N` → ville HDV.
**Actions :** Aller dans chaque HDV et noter le `bAL id` dans les logs :
- [ ] Bonta
- [ ] Brakmar
- [ ] Astrub
- [ ] Kelba
- [ ] Srambad
- [ ] (Sufokia déjà connus : 31546, 31547)
**Pattern :** `Lancement de l'occupation MARKET sur la board [bAL id=N]`

---

### 3. Navigation Zaap — logs générés
**Objectif :** Vérifier si l'utilisation d'un zaap (téléportation via la carte des zaaps)
génère des entrées dans les logs.
**Actions :** Utiliser un zaap et observer wakfu.log
**Pattern à chercher :** `tp {ID}`, transitions de monde, occupation éventuelle

---

## Priorité moyenne

### 4. Malodos — debuf captcha
**Objectif :** Vérifier si le debuf "Malodos" (qui s'accumule à chaque échec captcha
et réduit la quantité de récolte) apparaît dans les logs.
**Actions :** Rater intentionnellement 1-2 captchas et chercher dans les logs :
- Toute mention de "Malodos"
- Variation dans les quantités de ressources récoltées

---

### 5. Ventes hors-session HDV — confirmation
**Objectif :** Confirmer le pattern `Vous avez vendu N objets pendant votre absence`
dans une vraie situation (items mis en vente puis reconnexion après une longue pause).
**Actions :** Mettre des items en vente, se déconnecter, attendre que des ventes
se produisent, se reconnecter et observer.

---

### 6. PERSONAL_SPACE_LEAVE_RESULT_MESSAGE
**Objectif :** Vérifier si un message de sortie de l'espace personnel apparaît
systématiquement après `PERSONAL_SPACE_ENTER_RESULT_MESSAGE`.
**Actions :** Ouvrir et fermer le havre sac, chercher dans les logs.

---

### 7. Coffre de compte — dépôt réussi
**Objectif :** Confirmer que les dépôts réussis dans le coffre de compte ne génèrent
vraiment aucun log (actuellement observé sur erreur uniquement).
**Actions :** Déposer un item dans le coffre de compte avec succès et observer wakfu.log.

---

## Priorité faible

### 8. Quêtes "Tableau de chasse"
**Objectif :** Confirmer que les quêtes "Tableau de chasse : {monstre}" sont des
kill-counters automatiquement assignés (comme supposé).
**Actions :** Observer leur déclenchement et progression dans les logs.

### 9. Téléportation bibliothèque vs zaap
**Objectif :** Confirmer si le Biblio-téléport apparaît toujours comme
`Vous venez d'utiliser : Biblio-téléport` ou si d'autres patterns existent.

### 10. Navigation serveur HTTP local (port 26116/26117)
**Objectif :** Explorer si les ports 26116/26117 exposés par le launcher sont
interrogeables depuis l'overlay pour obtenir des données en temps réel.
**Actions :** Tester des requêtes GET sur ces ports pendant une session active.

---

*Les items confirmés seront transférés dans le Grand 1 et ce fichier sera mis à jour.*
