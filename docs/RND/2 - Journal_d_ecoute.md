# Grand 2 — Journal d'écoute temps réel
## Session de R&D — Observation comportementale des logs Wakfu

*Session démarrée : 2026-03-18 à 14:12*
*Observateur : Claude (WakfuAssistant R&D)*
*Méthode : polling wakfu.log + wakfu_chat.log, ligne de base à 9393 lignes*

---

## Contexte de départ (14:12)

Au lancement de la session, le jeu est ouvert. Dernier événement connu :
- Personnage sur **Rubilax** (Passe Par La, Eliotrope) qui quitte le monde 1089 à 14:11:09
- Retour apparent à l'écran de sélection de personnage (`centré sur (0,0)`)
- Chat actif : canal `[Commerce]` et `[Recrutement (FR)]` visibles → confirme une connexion serveur active

---

## Observations

---

### 14:14 — Connexion d'un personnage (serveur indéterminé → L'Immortel / Ogrest probable)

**Séquence observée :**
```
14:14:15 - Nettoyage des CharacterInfo (0 restants sur 2)   ← 2 persos sur ce serveur
14:14:15 - Unloading All
14:14:17 - Loading chat file
14:14:17 - bZJ initialisé, centré sur (-3,-2)
```

**Interprétation :** Connexion avec un personnage sur un serveur à 2 personnages.
D'après `clientConfig/`, Rubilax en a 2 (Treshatu + Passe Par La). Ogrest en a 4.
→ **Hypothèse : connexion sur Rubilax** avec Treshatu ou Passe Par La.

**Mais :** à 14:15:49, une ligne XP trahit le vrai personnage :
```
[Information (combat)] L'Immortel : +15 384 points d'XP.  Prochain niveau dans : 255 833 161.
```
L'Immortel est sur **Ogrest**. Un changement de serveur a donc eu lieu entre les deux
(probablement manqué lors d'un intervalle de polling). La connexion à 14:14 était sur Rubilax,
et à un moment non capturé précisément, le joueur a basculé sur Ogrest / L'Immortel.

**Données extraites :**
- `Prochain niveau dans : 255 833 161` → L'Immortel est un personnage de **très haut niveau**
- `[Guilde] Guilde : Glory to Sufokia !` → L'Immortel appartient à la guilde "Glory to Sufokia"
  (ou le message est visible globalement — à confirmer)
- `[Politique] Votre nation est à présent alliée à la Nation de Brâkmar.` → info nation active
- `[Information (jeu)] Vous avez vendu 9 objets pour un prix total de 12 632§ pendant votre absence.`
  → **HDV vente hors-session confirmée**, 9 items, 12 632 kamas

---

### 14:14:25–14:15:00 — Collecte de ressources détectée

```
On démarre l'occupation de collecte sur la ressource bKV@6dfd00c1
Fin de l'occupation de collecte
(×7 répétitions, ~2 secondes chacune)
```

**Découverte :** La collecte de ressources (farming) est **entièrement traçable** via ces deux marqueurs.
Chaque ressource a un identifiant interne (`bKV@{HEX}`). La collecte prend ~2s par ressource.

**Ce qu'on peut déduire :**
- Nombre de ressources collectées sur la carte
- Durée totale de la session de collecte
- Rythme (ressources/minute)

**Ce qu'on ne peut pas déduire directement :** le nom de la ressource collectée (l'ID `bKV@` est une
référence interne non lisible). Le nom apparaît dans les `[Information (jeu)] Vous avez ramassé Nx {ITEM}`
mais ces deux events ne sont pas nécessairement dans le même ordre ni liés explicitement.

---

### 14:15 — Biblio-téléport : détectable et loggué

```
14:15:17 - [Information (jeu)] Vous venez d'utiliser : Biblio-téléport
14:15:17 - on quitte le monde 1135 → centré sur (0,0)

14:15:26 - [Information (jeu)] Vous venez d'utiliser : Biblio-téléport
14:15:26 - on quitte le monde 1135 → centré sur (0,0)

14:15:54 - [Information (jeu)] Vous venez d'utiliser : Biblio-téléport
14:15:54 - on quitte le monde 437 → centré sur (0,0)
```

**Découverte :** L'utilisation d'items de téléportation est loggée via `[Information (jeu)] Vous venez
d'utiliser : {NOM_ITEM}`. Le world de destination (`1135`, `1089`) correspond à la bibliothèque de
téléport. La séquence monde→1135 (bibliothèque)→monde destination est visible.

**Pattern :** `on quitte le monde {X}` + `Biblio-téléport` + `on quitte le monde 1135` + `centré sur Y`
→ télétransport complet tracé.

**Implication :** On peut détecter l'utilisation de n'importe quel item de consommation loggé dans
`[Information (jeu)] Vous venez d'utiliser : {NOM}`.

---

### 14:15 — Quêtes : réussite et échec détectables

```
14:15:02 - [Information (jeu)] Quête échouée: "Compétitif : Stop Chef"
14:15:49 - [Information (jeu)] Vous avez réussi la quête Ninefi.
14:15:49 - [Information (jeu)] Vous avez ramassé 1x Almaton .
```

**Note de format :** Les deux patterns sont différents :
- Échec : `Quête échouée: "{NOM_QUETE}"`  (avec guillemets)
- Réussite : `Vous avez réussi la quête {NOM_QUETE}.` (sans guillemets)

**Implication :** Suivi des quêtes en temps réel possible. Associer la récompense (`Almaton`) à la
quête Ninefi est possible par co-occurrence temporelle (<100ms d'écart).

---

### 14:15 — IDs de joueurs dans la zone via [NATION]

```
[NATION] Trying to remove 6352525 from {Nation id=0} after a disconnection but he's not in it
[NATION] Trying to remove 6619903 from {Nation id=0} after a disconnection but he's not in it
[NATION] Trying to remove 6458300 from {Nation id=0} after a disconnection but he's not in it
```

**Interprétation :** Ces lignes apparaissent lors de changements de carte — quand d'autres joueurs
quittent la zone. Les IDs (6352525, 6619903, 6458300) sont des IDs de personnages tiers visibles
dans la zone, pas nécessairement du joueur actif.

**Utilité limitée :** Ces IDs sont des joueurs aléatoires croisés sur la carte. Sans corrélation
avec un nom, ils ne sont pas exploitables directement. Ils pourraient potentiellement être croisés
avec les `[_FL_]` si ces joueurs participaient au même combat.

---

### 14:18:25 — Rotation de log : contenu de démarrage révélateur

Le log a été réinitialisé à 14:18:25 (redémarrage du jeu). Le nouveau fichier commence par
une avalanche de WARN inédits :

#### Découverte A — `retrait d'une ressource en (X, Y)` = carte des ressources de zones connues

```
WARN 14:18:25 - retrait d'une ressource en (-86, -152) alors que la map est inconnue/pas chargée
(×80+ occurrences en 3ms, coordonnées variées)
```

**Interprétation :** Au démarrage, le moteur nettoie l'état des ressources de zones qu'il
avait en mémoire (session précédente). Ces coordonnées sont les **positions XY de cellules
avec ressources** dans la grille de map Wakfu.

**Ce qu'on peut en extraire :**
- Les zones de collecte visitées dans la session précédente (par les coordonnées)
- La densité de ressources par zone (nombre de lignes)
- Deux clusters visibles : autour de (-83,-150) et (-43,-153) → deux maps de farming

**Limitation :** coordonnées dans le repère interne Wakfu ; le nom de la ressource n'apparaît pas.

#### Découverte B — `Tentative de suppression d'un CharacterInfo 0` = artefact d'init

```
WARN 14:18:25 - Tentative de suppression d'un CharacterInfo 0 inexistant. (×5)
```

ID=0 n'est pas un vrai personnage : c'est le nettoyage interne du `CharacterInfoManager` au
démarrage. À **ne pas confondre** avec une vraie suppression (ID >1 000 000).

---

### 14:18:31 — Combat L'Immortel : ID confirmé + révélation account.xml

```
[_FL_] fightId=1600047387 L'Immortel breed : 4 [3111456] isControlledByAI=false
```

**ID de L'Immortel = 3111456** — confirmé.

**Corrélation avec `account.xml` :** Ce même ID était dans :
```
highlightedCharacteristics3111456=
```
**Révélation :** Les clés `highlightedCharacteristics{ID}` dans `account.xml` sont les IDs
des propres personnages du joueur ayant eu leurs stats configurées dans la fiche. Ce fichier
est une **source partielle de mapping ID → personnage**, à croiser avec les noms de
`clientConfig/` pour construire la table sans attendre un combat.

**Adversaires :**
- `Poiscaille des Profondeurs` breed `3883`, `Pichon Abyssal` breed `3884` → IDs négatifs = monstres
- Zone aquatique/abyssale (coordonnées Z=-80)

**Combat verrouillé :** `Votre combat est verrouillé` → solo lock.

**Sorts observés :** Fourberie, Assassinat, Attaque perfide, Mise à mort, Saignée mortelle,
Réplique de Saignée mortelle, Invisibilité → **Breed 4 = Sram** (confirmé par les sorts).

**XP gagnée sur ce combat :**
```
+54 468 878 XP (fin de combat normal)
+18 794 142 XP (challenge "Focus" réussi → +225 kamas)
Total : 73 263 020 XP — Prochain niveau dans : 182 570 141
```
→ La séparation XP combat / XP challenge est loggée en deux lignes distinctes.

**Loot :** `5x Sioupère-Glou Mystique` (drop de combat)

**`CharacterInfoManager (0 restants sur 80)` au départ du combat :**
Le compteur n'est pas le nombre de personnages sur le serveur mais le nombre d'**entités
chargées sur la map** pendant la session (joueurs + monstres + NPCs). Ici, 80 entités
étaient en mémoire (zone abyssale).

---

### 14:19:33–14:19:37 — Déconnexion et changement de serveur

```
14:19:33 - Unloading All (retour char select)
14:19:37 - Cleaning GameAccountData for 135009704
14:19:37 - Sending DisconnectionMessage to Servers. Reason : {LogOff}
14:19:37 - Launcher Button clicked
14:19:37 - Token obtained from Zaap
14:19:42 - Authentication token received ... errorCode=0
14:19:42 - Sending DisconnectionMessage to Servers. Reason : {Dispatch}
14:19:42 - Connexion au proxy :wakfu-pandora.ankama-games.com:5556
14:19:46 - Loading chat file
14:19:47 - On remet la frame World
```

**Découverte — Account ID interne :** `Cleaning GameAccountData for 135009704`
→ `135009704` est l'**ID de compte Ankama interne**, confirmé en croisant avec le
fichier `accountPreferences135009704.properties`.

**Transition vers Pandora :** la séquence `{LogOff}` → `Launcher Button clicked` →
new token → `{Dispatch}` → `wakfu-pandora.ankama-games.com:5556` correspond au
changement de serveur via le bouton launcher/retour à la sélection. Pandora est un
troisième serveur — `clientConfig/Kairozadyk/Pandora/` existe déjà.

**Companions reçus :** `Companions received : 2` → le personnage Pandora a 2 héros associés.

---

### 14:20:02 — Système Héros : erreurs révélatrices

```
[Héros] Impossible d'ajouter un Héros : errorId 12
[Messages d'erreur] Groupement impossible : Le héros est en attente de personnalisation.
Veuillez vous connecter sur ce personnage pour effectuer ces modifications.
```

**Interprétation :** Le joueur tente d'activer un héros (personnage secondaire du système
de compagnons) qui n'a jamais été connecté directement. Le jeu exige une connexion
préalable sur ce personnage pour finaliser sa création.

**Intérêt :** `errorId 12` est un code d'erreur stable et parseable. Le message en clair
donne la raison. On pourrait détecter l'état des héros via ces codes.

---

### 14:23 — Pandora : Divinité Du Sacrifice, combat solo, breed 11 = Sacrieur

```
[_FL_] fightId=1616067187 Divinité Du Sacrifice breed : 11 [5832637] isControlledByAI=false
```

**ID = 5832637, Breed 11 = Sacrieur** — confirmé par les sorts :
- `Furie sanguinaire`, `Punition` → sorts Sacrieur
- `refuse la mort ! / 400 Armure (Refus de la mort) / 50 Résistance Élémentaire` → passive Sacrieur de survie

**XP :** `+575 XP. Prochain niveau dans : 83 837 174` → personnage de niveau intermédiaire.

**Loot monstre :** `On démarre l'occupation de collecte d'un monstre` / `Fin de l'occupation de collecte d'un monstre` → variante de la collecte pour le **loot de cadavre de monstre** (différent de `collecte d'une ressource`). Drop : `1x Chacharcasse`.

**Challenge échoué :** `[Information (jeu)] Le challenge "Tsunami" a échoué.`
→ les challenges sont loggés en succès ET en échec dans `[Information (jeu)]`.

---

### 14:24 — Système Héros en action : groupe multi-personnages + companion NPC

```
14:24:06 - Divinité Du Sacrifice a rejoint le groupe
14:24:06 - Divinité Rolex a rejoint le groupe
14:24:09 - Chevalier d'Astrub a rejoint le groupe
```

**Découverte — Dialogue de quête dans les logs :**
```
[Information (jeu)] Pouah, ça sent le Chacha à plein nez !
[Information (jeu)] Reste derrière, petit. Je m'occupe de tout...
[Information (jeu)] Quoi ? Pas question. Je participe au combat également !
```
Les **dialogues de scénario/quête** sont loggés dans `[Information (jeu)]`. On peut détecter
les étapes narratives et les PNJs qui parlent.

**Combat avec héros — `[_FL_]` du groupe :**
```
Divinité Du Sacrifice breed : 11 [5832637]  isControlledByAI=false  → perso principal (positif)
Divinité Rolex        breed :  5 [5832820]  isControlledByAI=false  → héros-perso  (positif)
Chevalier d'Astrub    breed : 2867 [-1794...970525] isControlledByAI=false → companion NPC (négatif)
Tristepin             breed : 4691 [-1794...970527] isControlledByAI=true  → invocation     (négatif)
Cadran                breed : 3791 [-1794...970364] isControlledByAI=true  → invocation Xelor (négatif)
```

**Règle de distinction corrigée :**
- `isControlledByAI=false` + ID **positif** → personnage joueur (principal ou héros-compte)
- `isControlledByAI=false` + ID **négatif** → companion NPC (Chevalier d'Astrub etc.) — pas un perso joueur
- `isControlledByAI=true`  + ID **négatif** → mob ennemi ou invocation

**Breed 5 = Xelor** confirmé : `Divinité Rolex` lance `Cadran` (invocation Xelor) et reçoit `1 PW (Mage temporel)` (passive Xelor).

**ID 5832820 = Divinité Rolex** → correspondance avec `account.xml : highlightedCharacteristics5832820=`.
Confirmation que les clés `highlightedCharacteristics{ID}` dans `account.xml` = IDs des propres persos.

**Item utilisé en combat :** `Divinité Rolex utilise l'objet Poing` → les items activés en combat par les héros sont loggés.

**XP companion :** `Chevalier d'Astrub : +1 788 points d'XP. +3 niveau. Prochain niveau dans : 750.`
→ le companion est bas niveau (monte 3 niveaux d'un coup). Son XP est loggé séparément des personnages joueurs.

**Loots Pandora (Chacha) :** Humus (×8), Bandeau de Boisaille (×2), Sangle de Boisaille (×2)

**Monstres avec dialogue `[Proximité]` :** `Chacha : è_é` → certains monstres (Chacha)
émettent des messages dans le canal Proximité. À ne pas confondre avec un joueur.

---

### 14:25:43 — `tp` confirmé sur Pandora

```
tp 5832637 to 6, 1
```

Le `tp {ID}` est apparu **après** le combat (au chargement de la nouvelle carte), pas à
la connexion initiale. Cela confirme que le `tp` n'est pas lié à un serveur particulier
ni à la connexion — il est émis lors de certaines transitions de carte. **La méthode fonctionne
sur Pandora.**

---

### 14:25:58 — `[Héros] Nouveau leader local : {ID}` = source supplémentaire d'IDs

```
14:25:58 - [Héros] Nouveau leader local : 5832820
14:26:12 - [Héros] Nouveau leader local : 5832637
14:26:20 - [Héros] Nouveau leader local : 5832820
```

Le système de héros logue le changement de leader avec son ID numérique. Chaque fois que
le joueur bascule entre ses héros, l'ID du nouveau leader est enregistré. **Troisième
source de mapping ID→Nom** (après `tp` et `[_FL_]`), disponible dès qu'on utilise le
système de héros.

---

### 14:25–14:27 — XP et quêtes dupliqués pour le groupe héros

La quête Ninefi est complétée avec deux entrées séparées :
```
[Information (jeu)] Vous avez réussi la quête Ninefi.   ← une fois par perso dans le groupe
[Information (combat)] Divinité Rolex : +11 538 XP.
[Information (jeu)] Vous avez réussi la quête Ninefi.
[Information (combat)] Divinité Du Sacrifice : +11 538 XP.
```

**Interprétation :** En groupe héros, chaque personnage reçoit sa propre récompense XP/loot
et chaque événement `[Information (jeu)]` / `[Information (combat)]` est dupliqué. Pour
parser correctement, il faut dédupliquer si on ne veut compter qu'une fois.

Les **achievements** se déclenchent aussi deux fois (une fois par perso) :
```
! Achievement unlocked ! : 5591 on Wed Mar 18 15:25:42 CET 2026 (server time)
```
Le `server time` dans les achievements est la date/heure côté serveur — utile pour dater
précisément un événement indépendamment du clock client.

---

### 14:27:03 — `tp 11414113` : nouvel ID sur Rubilax

```
14:26:56 - Biblio-téléport (dernier event Pandora)
14:27:03 - tp 11414113 to 4, 1
14:27:36 - [Politique] Votre nation est à présent alliée à la Nation de Bonta.
```

Après le biblio-téléport Pandora, une transition vers **Rubilax** s'opère (confirmé par les
protecteurs 348/349/354 et la nation Bonta — identiques aux sessions Rubilax antérieures).
L'ID `11414113` est un **nouveau personnage inconnu** — probablement Treshatu ou Passe Par La
(les deux persos Rubilax connus). À identifier via `[_FL_]` lors d'un prochain combat.

**Note :** `[Politique] Votre nation est à présent alliée à la Nation de Bonta.` — confirme
le serveur car chaque serveur a son propre système de nations. Bonta = Rubilax ici.

---

### 14:28 — Maison personnelle : entrée/sortie entièrement loggée

```
DEBUG - PERSONAL_SPACE_ENTER_RESULT_MESSAGE (success=true)
on quitte le monde 1135 → centré sur (-1,0)
[Information (jeu)] Vous avez ramassé 1x Dragominus .
Action performed on interactive element : WALKON
DEBUG - PERSONAL_SPACE_LEAVE_RESULT_MESSAGE
on quitte le monde 9
```

**Découverte :** Les transitions vers/depuis la **maison personnelle** ont des marqueurs
dédiés (`PERSONAL_SPACE_ENTER/LEAVE_RESULT_MESSAGE`). Le **world 9** = monde de la maison
personnelle (constante à vérifier). On peut détecter qu'un joueur est dans sa maison.

---

### 14:29–14:30 — Coffre de guilde : accès entièrement loggé

```
[GUILD_STORAGE_BOX] Starting browse occupation
[GUILD_STORAGE_BOX]  Taille reçue
[GUILD_STORAGE_BOX] Content received
[GUILD_STORAGE_BOX] Cancelling browse occupation  ← fermé sans dépôt
[GUILD_STORAGE_BOX] Starting browse occupation    ← rouvert
[GUILD_STORAGE_BOX] Content received
[Information (jeu)] Vous avez perdu 1x Epaulettes de Boisaille .  ← dépôt = item "perdu"
[GUILD_STORAGE_BOX] Finishing occupation
```

**Découverte :** L'accès au coffre de guilde est entièrement tracé via le préfixe
`[GUILD_STORAGE_BOX]`. Un dépôt apparaît comme `Vous avez perdu 1x {ITEM}` — même pattern
que la perte ordinaire d'item. Impossible de distinguer perte/dépôt sans ce contexte.

---

### 14:30 — Apprentissage d'apparences : loggé item par item

```
Vous venez d'utiliser : Jarre Sufokienne
Vous avez appris l'apparence Jarre Sufokienne
(× Mannequin d'entrainement II, Remorque, Panier de blé, Tonneau d'armes, Tonneau à pointes, Bambou en pot)
```

**Découverte :** L'utilisation d'items cosmétiques qui enseignent une apparence est loggée
en deux lignes systématiques : `Vous venez d'utiliser : {NOM}` + `Vous avez appris l'apparence {NOM}`.
On peut tracker les apparences apprises en session.

---

### 14:30:41–14:30:46 — Fermeture du jeu : séquence complète

```
14:30:38 - Nettoyage des CharacterInfo (0 restants sur 9)
14:30:41 - Cleaning GameAccountData for 135009704
14:30:41 - {LogOff}
14:30:41 - Launcher Button clicked
14:30:42 - Token obtained from Zaap
14:30:43 - {Dispatch} → server select
14:30:46 - {Quit Request From Client}   ← clic sur "Quitter le jeu"
14:30:46 - save chat config
14:30:46 - {UI Closed}                  ← fenêtre fermée
14:30:46 - SoundManager stopped         ← processus Java s'arrête
```

**Séquence complète de fermeture propre :**
- `{Quit Request From Client}` → joueur clique "Quitter"
- `{UI Closed}` → fenêtre fermée
- `SoundManager stopped` → dernier événement avant arrêt JVM

La session était sur **Pandora** jusqu'à la fermeture (`wakfu-pandora.ankama-games.com:5556`
visible dans la perte de connexion). Le `{LogOff}` puis retour server select (`{Dispatch}`)
puis quitter = séquence standard.

---

## Fin de session — 14:30:46

*Jeu fermé. Observation terminée.*

---

## Récapitulatif des découvertes de la session

> *✅ Transféré dans Grand 1 (`1 - Sources_de_donnees.md`) le 2026-03-18*

### Nouvelles sources d'ID de personnage

| Source | Contexte | Fiabilité |
|--------|----------|-----------|
| `tp {ID}` | Certaines transitions de carte (pas toutes) | ⚠️ Partielle |
| `[_FL_] {NOM} [{ID}]` | Tout combat | ✅ Universelle |
| `[Héros] Nouveau leader local : {ID}` | Utilisation du système héros | ✅ Très fiable |
| `Unserializing effects for fighter {ID}` | Début de combat | ✅ Fiable |

### Nouvelle table des breeds (partielle)

| Breed ID | Classe |
|----------|--------|
| 4 | Sram (Fourberie, Assassinat, Saignée mortelle, Invisibilité) |
| 5 | Xelor (Cadran, Mage temporel) |
| 11 | Sacrieur (Furie sanguinaire, Punition, Refus de la mort) |
| 2616 | Chacha (monstre Pandora) |
| 2617 | Chacha Blanc (variante) |
| 2867 | Chevalier d'Astrub (companion NPC) |
| 3791 | Cadran (invocation Xelor) |
| 3883 | Poiscaille des Profondeurs (monstre abyssal) |
| 3884 | Pichon Abyssal (monstre abyssal) |
| 4691 | Tristepin (héros NPC) |

### Nouveaux marqueurs découverts

| Marqueur | Information |
|----------|-------------|
| `retrait d'une ressource en (X, Y) alors que la map est inconnue` | Positions de ressources de la session précédente (au démarrage) |
| `On démarre l'occupation de collecte sur la ressource bKV@{HEX}` | Début de collecte d'une ressource (farming) |
| `On démarre l'occupation de collecte d'un monstre` | Début de loot cadavre de monstre |
| `PERSONAL_SPACE_ENTER_RESULT_MESSAGE (success=true)` | Entrée dans la maison personnelle |
| `PERSONAL_SPACE_LEAVE_RESULT_MESSAGE` | Sortie de la maison personnelle |
| `[GUILD_STORAGE_BOX] Starting browse occupation` | Ouverture coffre de guilde |
| `[GUILD_STORAGE_BOX] Finishing occupation` | Fermeture coffre de guilde |
| `Vous venez d'utiliser : {NOM}` + `Vous avez appris l'apparence {NOM}` | Apprentissage de cosmétique |
| `[Héros] Nouveau leader local : {ID}` | Changement de leader dans le système héros |
| `Cleaning GameAccountData for {ID}` | ID de compte Ankama interne = `{ID}` |
| `{Quit Request From Client}` | Joueur clique "Quitter le jeu" |
| `SoundManager stopped` | Dernier log avant arrêt JVM |
| `Le challenge "{NOM}" a échoué.` | Échec d'un challenge de combat |
| `Tentative de suppression d'un CharacterInfo 0` (×N) | Artefact d'init — pas une vraie suppression |

### Corrélation `account.xml` confirmée

Les clés `highlightedCharacteristics{ID}` dans `account.xml` correspondent aux IDs
des personnages ayant eu leurs highlights de stats configurés. IDs confirmés :
- `3111456` = L'Immortel (Ogrest, Sram breed 4)
- `5832637` = Divinité Du Sacrifice (Pandora, Sacrieur breed 11)
- `5832820` = Divinité Rolex (Pandora, Xelor breed 5)

