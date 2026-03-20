# Guide de test terrain — Wakfu Assistant
## À lire avant de commencer

Les scripts de test unitaires vérifient que les regex matchent des lignes **inventées**.
Ce guide vérifie qu'elles matchent des lignes **réelles** sorties du jeu.

**Chaque scénario nommé comme validé sera fourni avec les lignes réelles correspondantes en powershell à adapter au code cible:**


---

## SCÉNARIO 1 — XP de personnage

**Ce qu'on teste :** est-ce que le parser détecte un gain d'XP de combat ?

**Action dans le jeu :** Fais un combat (n'importe quel monstre).

**Commande à lancer AVANT le combat :**
```powershell
Get-Content "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu_chat.log" -Wait -Tail 0 |
  Where-Object { $_ -match "L'Immortel.*points d'XP" }
```

**⚠️ Pourquoi pas `[Information (combat)]` ?** Découverte 2026-03-20 : le filtre `[Information (combat)]` remonte aussi le XP Trappeur (métier). La vraie discrimination se fait sur le **nom de l'entité** (`L'Immortel`), pas sur la source tag.

**Ce que tu dois voir :**
```
HH:MM:SS,mmm - [Information (combat)] L'Immortel : +XXXXX points d'XP.  Prochain niveau dans : XXXXXXX.
```

**Note ETA :** L'ETA ne s'affiche que dans `live-monitor.ps1`, pas ici. Et dans le monitor, il faut **au moins 2 combats** avant que l'ETA apparaisse — le premier combat affiche `ETA: ...`, le deuxième affiche une vraie valeur.

**Questions :**
- La ligne apparaît-elle après le combat ?
- Le nom `L'Immortel` est-il correct ?
- Les chiffres sont-ils lisibles (avec ou sans espaces) ?
- La source est-elle bien `[Information (combat)]` et non `[Information (jeu)]` ?

---

## SCÉNARIO 2 — XP de métier

**Ce qu'on teste :** est-ce que le parser distingue XP métier de XP personnage ?

**Action dans le jeu :** Récolte une ressource (herbe, minerai, poisson…).

**Commande :**
```powershell
Get-Content "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu_chat.log" -Wait -Tail 0 |
  Where-Object { $_ -match "\[Information \(jeu\)\].*points d'XP" }
```

**Ce que tu dois voir :**
```
HH:MM:SS,mmm - [Information (jeu)] Trappeur : +XXX points d'XP.  Prochain niveau dans : XXXXX.
```

**Questions :**
- La source est-elle `[Information (jeu)]` (et non `combat`) ?
- Le nom du métier est-il correct ?
- Cette commande ne doit PAS afficher de XP de personnage (`L'Immortel`) — si elle en affiche, c'est un bug.

---

## SCÉNARIO 3 — Destruction d'objets → éclats

**Ce qu'on teste :** les 3 lignes de la séquence de destruction sont-elles captées ?

**Action dans le jeu :** Va chez un forgeron / recycleur, détruis quelques équipements bas niveau.

**Commande :**
```powershell
Get-Content "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu_chat.log" -Wait -Tail 0 |
  Where-Object { $_ -match "perdu \d+x|ramass.+ \d+x|d.truit \d+ objet" }
```

**Ce que tu dois voir (3 lignes par destruction) :**
```
HH:MM:SS,mmm - [Information (jeu)] Vous avez perdu Nx NOM_ITEM .
HH:MM:SS,mmm - [Information (jeu)] Vous avez ramassé Nx Eclats .        ← si > 0
HH:MM:SS,mmm - [Information (jeu)] Vous avez détruit N objet(s) et récupéré N ressource(s)
```

**Questions :**
- Les 3 lignes apparaissent-elles dans le bon ordre ?
- Y a-t-il des cas où `ramassé` vient avant `perdu` ?
- Y a-t-il des cas avec 0 ressources (pas de ligne `ramassé`) ?
- Le nom de l'item est-il correct (accents, apostrophes) ?

---

## SCÉNARIO 4 — Ventes HDV (en session)

**Ce qu'on teste :** mise en vente, vente instantanée, achat.

**Action dans le jeu :** Va à l'HDV de Sufokia. Fais au moins une mise en vente ET un achat.

**Commande :**
```powershell
Get-Content "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu_chat.log" -Wait -Tail 0 |
  Where-Object { $_ -match "gagn. \d+ kama|perdu \d+ kama|bAL id" }
```

**Ce que tu dois voir :**

*Mise en vente (2 lignes) :*
```
[Information (jeu)] Vous avez perdu Nx NOM_ITEM .
[Information (jeu)] Vous avez perdu N kamas.
```

*Achat (2 lignes) :*
```
[Information (jeu)] Vous avez perdu N kamas.
[Information (jeu)] Vous avez ramassé Nx NOM_ITEM .
```

*Dans wakfu.log, ouverture du comptoir :*
```powershell
Get-Content "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu.log" -Wait -Tail 0 |
  Where-Object { $_ -match "bAL id" }
```
```
Lancement de l'occupation MARKET sur la board [bAL id=XXXXX]
```

**Questions :**
- Les 2 lignes mise-en-vente arrivent-elles bien ensemble ?
- Le board ID `bAL id=` apparaît-il ?
- Note le board ID exact ici : `bAL id = ______`

---

## SCÉNARIO 5 — Ventes HDV hors-session

**Ce qu'on teste :** les ventes passées quand tu n'étais pas connecté.

**Action dans le jeu :** Reconnecte-toi après avoir laissé des objets en vente. La ligne apparaît au login si des ventes ont eu lieu.

**Commande :**
```powershell
Get-Content "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu_chat.log" -Wait -Tail 0 |
  Where-Object { $_ -match "pendant votre absence" }
```

**Ce que tu dois voir :**
```
[Information (jeu)] Vous avez vendu N objets pour un prix total de XXXXX§ pendant votre absence.
```

**Questions :**
- La ligne apparaît-elle à la connexion ?
- Le symbole `§` est-il bien présent ?
- Le nombre d'objets et le total sont-ils corrects ?

---

## SCÉNARIO 6 — Havre sac (ouverture)

**Ce qu'on teste :** le signal d'ouverture du havre sac.

**Action dans le jeu :** Ouvre ton havre sac (l'icône dans l'inventaire).

**Commande :**
```powershell
Get-Content "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu.log" -Wait -Tail 0 |
  Where-Object { $_ -match "PERSONAL_SPACE" }
```

**Ce que tu dois voir :**
```
PERSONAL_SPACE_ENTER_RESULT_MESSAGE (success=true)
```

**Questions :**
- La ligne apparaît-elle à chaque ouverture ?
- Essaie d'ouvrir depuis une zone interdite (donjon, biblio) — vois-tu `success=false` ?

---

## SCÉNARIO 7 — Havre sac (visiteur)

**Ce qu'on teste :** est-ce qu'on détecte un joueur qui entre dans ton havre sac ?

**Action dans le jeu :** Demande à quelqu'un de ta guilde d'entrer dans ton havre sac pendant que tu y es. Demande-lui d'essayer d'entrer dans une pièce verrouillée.

**Commande :**
```powershell
Get-Content "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu.log" -Wait -Tail 0 |
  Where-Object { $_ -match "Checkpath|forbidden" }
```

**Ce que tu dois voir :**
```
[Checkpath] Room access is forbidden for player with id XXXXXXX
```

**Questions :**
- La ligne apparaît-elle quand le visiteur essaie une pièce verrouillée ?
- Si le visiteur ne touche aucune pièce verrouillée, voit-on quelque chose ? (réponse attendue : non)
- L'ID du visiteur est-il un nombre ? Note-le ici : `______`

---

## SCÉNARIO 8 — Changements de zone

**Ce qu'on teste :** la détection des zones traversées.

**Action dans le jeu :** Utilise le Biblio-téléport pour aller de Sufokia vers une autre ville.

**Commande :**
```powershell
Get-Content "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu.log" -Wait -Tail 0 |
  Where-Object { $_ -match "on quitte le monde|bZJ" }
```

**Ce que tu dois voir :**
```
on quitte le monde XXXX
bZJ initialisé, centré sur (X,Y)
on quitte le monde YYYY
...
```

**Questions :**
- Les worldIds apparaissent-ils à chaque changement de zone ?
- Note les IDs traversés ici et ce que tu penses être la zone : `______`
- Le `bZJ` suit-il toujours le `quitte le monde` ?

---

## SCÉNARIO 9 — Challenges

**Ce qu'on teste :** la détection des challenges réussis/ratés.

**Action dans le jeu :** Fais des combats dans une zone avec challenges actifs (n'importe quelle zone de farm).

**Commande :**
```powershell
Get-Content "$env:APPDATA\zaap\gamesLogs\wakfu\logs\wakfu_chat.log" -Wait -Tail 0 |
  Where-Object { $_ -match "challenge" }
```

**Ce que tu dois voir :**
```
[Information (jeu)] Le challenge "NOM" est réussi.
[Information (jeu)] Le challenge "NOM" a échoué.
```

**Questions :**
- Les deux types (réussi / raté) apparaissent-ils ?
- Les noms avec accents sont-ils corrects ?
- Y a-t-il des noms de challenges que tu n'aurais pas anticipés ?

---

## Comment reporter les résultats

Pour chaque scénario :

```
SCÉNARIO X — [Nom]
Statut   : ✅ OK / ❌ FAIL / ⚠️ PARTIEL
Observé  : [colle les lignes que tu as vues]
Commentaire : [ce qui était faux, inattendu, manquant]
```
