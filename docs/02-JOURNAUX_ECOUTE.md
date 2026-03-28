# 02 — Journaux d'écoute — Observations terrain Wakfu

> Dernière mise à jour : 2026-03-21
> Fusion des sessions d'observation terrain (Journaux 1, 2, 3)
> Addendums intégrés directement dans le corps du texte

---

## Résumé des découvertes

| Domaine | Observation clé | Statut |
|---------|----------------|--------|
| Économie / HDV | Pattern achat : `perdu N kama(s)` + `ramassé Nx {item}` | Validé |
| Économie / HDV | Pattern vente réalisée : `perdu Nx {item}` + `gagné N kamas` | Validé |
| Économie / HDV | Distinction mise en vente (`perdu item + perdu kamas`) vs vente instantanée (`perdu item + gagné kamas`) | Validé |
| Économie / HDV | Ventes hors-session : `Vous avez vendu N objets pour un prix total de N§ pendant votre absence.` | Validé |
| Économie / HDV | Prix HDV non déductibles depuis le texte — source de vérité = protobuf (`msgId=12294`/`13653`) + SQLite | Validé |
| Combat / XP | XP combat et XP challenge loggés en deux lignes distinctes | Validé |
| Combat / XP | `[_FL_]` fournit : fightId, nom, breed, ID, isControlledByAI — universellement fiable | Validé |
| Combat / XP | ID positif + `isControlledByAI=false` = personnage joueur ; ID négatif + `false` = companion NPC ; ID négatif + `true` = mob/invocation | Validé |
| Combat / XP | Challenges : succès et échecs loggés dans `[Information (jeu)]` | Validé |
| Combat / XP | Captcha Capt'chat (breed 5314) : succès détectable (`ramassé 40x {item}`) / échec (`est KO !`) | Validé |
| Combat / XP | Valeurs des dés du captcha jamais loggées — info purement visuelle | Validé (limitation) |
| Inventaire / Coffre | `[GUILD_STORAGE_BOX]` trace l'accès complet au coffre de guilde ; dépôt = `Vous avez perdu 1x {item}` | Validé |
| Inventaire / Coffre | Coffre de compte : dépôt réussi silencieux — erreur logge `[Account chest] Error when stacking items` ×N | Validé |
| Inventaire / Coffre | Destruction d'objets : `perdu Nx {item}` + `détruit N objet(s) et récupéré N ressource(s)` | Validé |
| Inventaire / Coffre | Apprentissage cosmétique/meuble : `utiliser : {item}` + `appris l'apparence {item}` | Validé |
| Zones / Monde | `PERSONAL_SPACE_ENTER/LEAVE_RESULT_MESSAGE` trace l'entrée/sortie havre-sac — monde 9 = havre-sac | Validé |
| Zones / Monde | `on quitte le monde {ID}` trace toutes les transitions de zone | Validé |
| Zones / Monde | Monde 9 = havre-sac, 527 = zone farm, 999 = zone Ogrest (quêtes collaboratives), 1089 = hub Biblio-téléport, 1135 = Sufokia, 1136 = HDV | Validé |
| Zones / Monde | Havre-sac : `PERSONAL_SPACE_ENTER` absent en cas d'échec — pas de faux positifs | Validé |
| Personnages | `highlightedCharacteristics{ID}` dans `account.xml` = IDs des personnages du compte | Validé |
| Personnages | `[Héros] Nouveau leader local : {ID}` = 3ème source de mapping ID→Nom | Validé |
| Personnages | `Cleaning GameAccountData for 135009704` = ID de compte Ankama interne | Validé |
| Personnages | 3111456 = L'Immortel (Ogrest, Sram breed 4) ; 5832637 = Divinité Du Sacrifice (Pandora, Sacrieur breed 11) ; 5832820 = Divinité Rolex (Pandora, Xelor breed 5) | Validé |
| Chat | Doubles espaces dans les canaux chat = artéfact de liens cliquables `[item]` strippés — pas de balise préservée | Validé |
| Chat | `[Information (combat)]` absent de `wakfu_chat.log` — exclusif à `wakfu.log` | Validé |
| Chat | `[NATION] Trying to remove {ID}` = bruit non exploitable pour l'économie HDV | Validé (bruit) |
| Collecte | `On démarre l'occupation de collecte sur la ressource bKV@{HEX}` / `Fin de l'occupation` = farming entièrement traçable | Validé |
| Collecte | Nom de la ressource collectée non directement lié à l'ID `bKV@` — corrélation via `ramassé Nx {item}` proche | Partiel |

---

## Session 1 — 2026-03-18, 14:12–14:30 — Premières observations terrain

*Observateur : Claude (WakfuAssistant R&D)*
*Méthode : polling wakfu.log + wakfu_chat.log, ligne de base à 9393 lignes*
*Serveurs actifs : Rubilax → Ogrest → Pandora*

> ⚠️ Corrigé (Addendum 2026-03-21) : Les patterns collecte, quêtes et transitions monde sont valides pour la télémétrie gameplay. En revanche, les déductions prix HDV ne doivent pas se faire depuis le texte — pipeline dédié `market_v3_proto.log -> hdv_market.db` obligatoire. Les lignes `[NATION] Trying to remove ...` restent du bruit non exploitable pour l'économie HDV.

---

### Contexte de départ (14:12)

Au lancement de la session, le jeu est ouvert. Dernier événement connu :
- Personnage sur **Rubilax** (Passe Par La, Eliotrope) qui quitte le monde 1089 à 14:11:09
- Retour apparent à l'écran de sélection de personnage (`centré sur (0,0)`)
- Chat actif : canal `[Commerce]` et `[Recrutement (FR)]` visibles → connexion serveur active

---

### 14:14 — Connexion d'un personnage (Rubilax puis Ogrest)

**Séquence observée :**
```
14:14:15 - Nettoyage des CharacterInfo (0 restants sur 2)   ← 2 persos sur ce serveur
14:14:15 - Unloading All
14:14:17 - Loading chat file
14:14:17 - bZJ initialisé, centré sur (-3,-2)
```

Connexion sur Rubilax (2 personnages : Treshatu + Passe Par La). À 14:15:49, une ligne XP confirme le vrai personnage actif :
```
[Information (combat)] L'Immortel : +15 384 points d'XP.  Prochain niveau dans : 255 833 161.
```
L'Immortel est sur **Ogrest** — un changement de serveur non capturé entre les deux polls s'est produit. La connexion à 14:14 était sur Rubilax ; le basculement vers Ogrest/L'Immortel a eu lieu dans l'intervalle.

**Données extraites :**
- `Prochain niveau dans : 255 833 161` → L'Immortel est de très haut niveau
- `[Guilde] Guilde : Glory to Sufokia !` → guilde de L'Immortel
- `[Politique] Votre nation est à présent alliée à la Nation de Brâkmar.`
- `[Information (jeu)] Vous avez vendu 9 objets pour un prix total de 12 632§ pendant votre absence.` → **HDV vente hors-session confirmée**

---

### 14:14:25–14:15:00 — Collecte de ressources détectée

```
On démarre l'occupation de collecte sur la ressource bKV@6dfd00c1
Fin de l'occupation de collecte
(×7 répétitions, ~2 secondes chacune)
```

La collecte (farming) est entièrement traçable via ces deux marqueurs. Chaque ressource a un identifiant interne (`bKV@{HEX}`). La collecte prend ~2s par ressource. On peut déduire le nombre de ressources collectées, la durée et le rythme (ressources/minute). Le nom de la ressource n'est pas directement lié à l'ID `bKV@` — corrélation via `[Information (jeu)] Vous avez ramassé Nx {ITEM}` par co-occurrence temporelle.

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

Pattern : `on quitte le monde {X}` + `Biblio-téléport` + `on quitte le monde 1135` + `centré sur Y` → télétransport complet tracé. Tout item de consommation loggé dans `[Information (jeu)] Vous venez d'utiliser : {NOM}` est détectable.

---

### 14:15 — Quêtes : réussite et échec détectables

```
14:15:02 - [Information (jeu)] Quête échouée: "Compétitif : Stop Chef"
14:15:49 - [Information (jeu)] Vous avez réussi la quête Ninefi.
14:15:49 - [Information (jeu)] Vous avez ramassé 1x Almaton .
```

Formats distincts :
- Échec : `Quête échouée: "{NOM_QUETE}"` (avec guillemets)
- Réussite : `Vous avez réussi la quête {NOM_QUETE}.` (sans guillemets)

La récompense (`Almaton`) est associable à la quête Ninefi par co-occurrence temporelle (<100ms d'écart).

---

### 14:15 — IDs de joueurs dans la zone via [NATION]

```
[x3] [NATION] Trying to remove 6352525 from {Nation id=0} after a disconnection but he's not in it
```

Ces lignes apparaissent lors de changements de carte — joueurs tiers quittant la zone. IDs observés : 6352525, 6619903, 6458300. Utilité limitée : joueurs aléatoires sans corrélation avec un nom.

> ⚠️ Corrigé (Addendum 2026-03-21) : Ces lignes restent du bruit non exploitable pour l'économie HDV.

---

### 14:18:25 — Rotation de log : contenu de démarrage révélateur

**Découverte A — `retrait d'une ressource en (X, Y)` = positions ressources de session précédente**

```
WARN 14:18:25 - retrait d'une ressource en (-86, -152) alors que la map est inconnue/pas chargée
(×80+ occurrences en 3ms, coordonnées variées)
```

Au démarrage, le moteur nettoie l'état des ressources précédentes. Deux clusters visibles : autour de (-83,-150) et (-43,-153) → deux maps de farming. Coordonnées dans le repère interne Wakfu ; nom de la ressource absent.

**Découverte B — `Tentative de suppression d'un CharacterInfo 0` = artefact d'init**

```
WARN 14:18:25 - Tentative de suppression d'un CharacterInfo 0 inexistant. (×5)
```

ID=0 n'est pas un vrai personnage : nettoyage interne du `CharacterInfoManager` au démarrage. À ne pas confondre avec une vraie suppression (ID >1 000 000).

---

### 14:18:31 — Combat L'Immortel : ID confirmé + révélation account.xml

```
[_FL_] fightId=1600047387 L'Immortel breed : 4 [3111456] isControlledByAI=false
```

**ID de L'Immortel = 3111456** — confirmé.

Corrélation avec `account.xml` : la clé `highlightedCharacteristics3111456=` y est présente. Les clés `highlightedCharacteristics{ID}` dans `account.xml` sont les IDs des propres personnages du joueur — source partielle de mapping ID→personnage sans attendre un combat.

Adversaires : `Poiscaille des Profondeurs` breed 3883, `Pichon Abyssal` breed 3884. Zone aquatique/abyssale (coordonnées Z=-80). `Votre combat est verrouillé` → solo lock.

Sorts observés : Fourberie, Assassinat, Attaque perfide, Mise à mort, Saignée mortelle, Réplique de Saignée mortelle, Invisibilité → **Breed 4 = Sram** confirmé.

**XP :**
```
+54 468 878 XP (fin de combat normal)
+18 794 142 XP (challenge "Focus" réussi → +225 kamas)
Total : 73 263 020 XP — Prochain niveau dans : 182 570 141
```
La séparation XP combat / XP challenge est loggée en deux lignes distinctes.

Loot : `5x Sioupère-Glou Mystique` (drop de combat).

`CharacterInfoManager (0 restants sur 80)` : le compteur représente les entités chargées sur la map (joueurs + monstres + NPCs), pas les personnages du serveur.

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

**Account ID interne :** `Cleaning GameAccountData for 135009704` → `135009704` est l'ID de compte Ankama interne, confirmé via `accountPreferences135009704.properties`.

Transition vers **Pandora** via `{LogOff}` → `Launcher Button clicked` → nouveau token → `{Dispatch}` → `wakfu-pandora.ankama-games.com:5556`. `Companions received : 2` → le personnage Pandora a 2 héros associés.

---

### 14:20:02 — Système Héros : erreurs révélatrices

```
[Héros] Impossible d'ajouter un Héros : errorId 12
[Messages d'erreur] Groupement impossible : Le héros est en attente de personnalisation.
Veuillez vous connecter sur ce personnage pour effectuer ces modifications.
```

`errorId 12` est un code d'erreur stable et parseable. Le héros n'a jamais été connecté directement.

---

### 14:23 — Pandora : Divinité Du Sacrifice, breed 11 = Sacrieur

```
[_FL_] fightId=1616067187 Divinité Du Sacrifice breed : 11 [5832637] isControlledByAI=false
```

**ID = 5832637, Breed 11 = Sacrieur** — confirmé par les sorts : Furie sanguinaire, Punition, `refuse la mort ! / 400 Armure / 50 Résistance Élémentaire`.

**XP :** `+575 XP. Prochain niveau dans : 83 837 174` → personnage de niveau intermédiaire.

Loot monstre : `On démarre l'occupation de collecte d'un monstre` / `Fin de l'occupation de collecte d'un monstre` → variante pour le loot de cadavre de monstre (distinct de la collecte d'une ressource). Drop : `1x Chacharcasse`.

Challenge : `Le challenge "Tsunami" a échoué.` → les challenges sont loggés en succès ET en échec dans `[Information (jeu)]`.

---

### 14:24 — Système Héros en action : groupe multi-personnages + companion NPC

```
14:24:06 - Divinité Du Sacrifice a rejoint le groupe
14:24:06 - Divinité Rolex a rejoint le groupe
14:24:09 - Chevalier d'Astrub a rejoint le groupe
```

Dialogues de scénario/quête dans les logs :
```
[Information (jeu)] Pouah, ça sent le Chacha à plein nez !
[Information (jeu)] Reste derrière, petit. Je m'occupe de tout...
```
Les dialogues de scénario sont loggés dans `[Information (jeu)]`. Étapes narratives et PNJs détectables.

**Combat avec héros — `[_FL_]` du groupe :**
```
Divinité Du Sacrifice breed : 11 [5832637]  isControlledByAI=false  → perso principal (positif)
Divinité Rolex        breed :  5 [5832820]  isControlledByAI=false  → héros-perso  (positif)
Chevalier d'Astrub    breed : 2867 [-1794...970525] isControlledByAI=false → companion NPC (négatif)
Tristepin             breed : 4691 [-1794...970527] isControlledByAI=true  → invocation     (négatif)
Cadran                breed : 3791 [-1794...970364] isControlledByAI=true  → invocation Xelor (négatif)
```

> ⚠️ Corrigé (Addendum 2026-03-21) : Règle de distinction affinée — `isControlledByAI=false` + ID **positif** = personnage joueur (principal ou héros-compte) ; `isControlledByAI=false` + ID **négatif** = companion NPC (pas un perso joueur) ; `isControlledByAI=true` + ID **négatif** = mob ennemi ou invocation.

**Breed 5 = Xelor** confirmé : `Divinité Rolex` lance `Cadran` (invocation Xelor) et reçoit `1 PW (Mage temporel)`. **ID 5832820 = Divinité Rolex** → confirmé par `highlightedCharacteristics5832820=` dans `account.xml`.

XP companion : `Chevalier d'Astrub : +1 788 XP. +3 niveau. Prochain niveau dans : 750.` — bas niveau, XP loggé séparément.

Loots Pandora (Chacha) : Humus (×8), Bandeau de Boisaille (×2), Sangle de Boisaille (×2).

`[Proximité] Chacha : è_é` → certains monstres (Chacha) émettent des messages dans le canal Proximité. À ne pas confondre avec un joueur.

---

### 14:25:43 — `tp` confirmé sur Pandora

```
tp 5832637 to 6, 1
```

Le `tp {ID}` est émis **après** le combat (au chargement de la nouvelle carte), pas à la connexion initiale. La méthode fonctionne sur Pandora.

---

### 14:25:58 — `[Héros] Nouveau leader local : {ID}` = source supplémentaire d'IDs

```
14:25:58 - [Héros] Nouveau leader local : 5832820
14:26:12 - [Héros] Nouveau leader local : 5832637
14:26:20 - [Héros] Nouveau leader local : 5832820
```

Troisième source de mapping ID→Nom (après `tp` et `[_FL_]`), disponible dès qu'on utilise le système de héros.

---

### 14:25–14:27 — XP et quêtes dupliqués pour le groupe héros

En groupe héros, chaque personnage reçoit sa propre récompense XP/loot :
```
[Information (jeu)] Vous avez réussi la quête Ninefi.
[Information (combat)] Divinité Rolex : +11 538 XP.
[Information (jeu)] Vous avez réussi la quête Ninefi.
[Information (combat)] Divinité Du Sacrifice : +11 538 XP.
```
Pour parser correctement, dédupliquer si on ne veut compter qu'une fois. Les achievements aussi se déclenchent deux fois (une fois par perso).

Timestamp achievement : `! Achievement unlocked ! : 5591 on Wed Mar 18 15:25:42 CET 2026 (server time)` → horodatage côté serveur, indépendant du clock client.

---

### 14:27:03 — `tp 11414113` : nouvel ID sur Rubilax

```
14:26:56 - Biblio-téléport (dernier event Pandora)
14:27:03 - tp 11414113 to 4, 1
14:27:36 - [Politique] Votre nation est à présent alliée à la Nation de Bonta.
```

Transition vers **Rubilax** confirmée par protecteurs 348/349/354 et nation Bonta. ID `11414113` = nouveau personnage inconnu (probablement Treshatu ou Passe Par La). `[Politique] Votre nation est à présent alliée à la Nation de Bonta.` confirme le serveur (chaque serveur a son propre système de nations).

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

Marqueurs dédiés `PERSONAL_SPACE_ENTER/LEAVE_RESULT_MESSAGE`. **Monde 9 = maison personnelle** (havre-sac). Sortie déclenchée par `WALKON` sur la tuile de sortie.

---

### 14:29–14:30 — Coffre de guilde : accès entièrement loggé

```
[GUILD_STORAGE_BOX] Starting browse occupation
[GUILD_STORAGE_BOX] Taille reçue
[GUILD_STORAGE_BOX] Content received
[GUILD_STORAGE_BOX] Cancelling browse occupation  ← fermé sans dépôt
[GUILD_STORAGE_BOX] Starting browse occupation    ← rouvert
[GUILD_STORAGE_BOX] Content received
[Information (jeu)] Vous avez perdu 1x Epaulettes de Boisaille .  ← dépôt = item "perdu"
[GUILD_STORAGE_BOX] Finishing occupation
```

Un dépôt apparaît comme `Vous avez perdu 1x {ITEM}` — impossible de distinguer perte/dépôt sans ce contexte de `[GUILD_STORAGE_BOX]`.

---

### 14:30 — Apprentissage d'apparences : loggé item par item

```
Vous venez d'utiliser : Jarre Sufokienne
Vous avez appris l'apparence Jarre Sufokienne
(× Mannequin d'entrainement II, Remorque, Panier de blé, Tonneau d'armes, Tonneau à pointes, Bambou en pot)
```

Pattern : `Vous venez d'utiliser : {NOM}` + `Vous avez appris l'apparence {NOM}` (systématique pour tout item cosmétique enseignant une apparence).

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
14:30:46 - SoundManager stopped         ← dernier log avant arrêt JVM
```

Séquence standard : `{Quit Request From Client}` → `{UI Closed}` → `SoundManager stopped`. Session fermée depuis **Pandora** (`wakfu-pandora.ankama-games.com:5556`).

---

## Session 2 — 2026-03-18, 14:50–15:22 — HDV, combat, XP étendu

*Ligne de base : 3160 lignes dans wakfu.log*
*Objectifs : HDV ventes temps réel et hors-session, liens cliquables chat, corroboration Journal 1*

> ⚠️ Corrigé (Addendum 2026-03-21) : Les patterns textuels achat/vente dans le chat/log sont réels (actions du joueur). Les sessions MARKET confirment l'entrée/sortie d'interface. En revanche, les doubles espaces dans `[Commerce]` ne sont pas une preuve assez robuste pour exploitation automatique stricte — indicateur seulement. Le calcul prix/marge HDV se fait exclusivement via protobuf (`msgId=12294` ventes, `msgId=13653` achats) synchronisé en SQLite.

---

### Poll 1 — 14:50:28 à 14:52:25 (lignes 3160→3198)

**HDV — Session MARKET complète**

```
Lancement de l'occupation MARKET sur la board [bAL id=31547]{Point3 : (-1, -12, -47)}
On arrête l'occupation MARKET sur la board [bAL id=31547]
```

Première observation d'une session HDV de bout en bout. La board `[bAL id=31547]` identifie le comptoir précis utilisé ; les coordonnées sa position dans le monde (monde 1136).

**HDV — Achats en temps réel (dans la session)**

Deux achats identiques :
```
Vous avez perdu 1 kama.
Vous avez ramassé 1x Hache Piou .
```
Pattern achat : `perdu N kama(s)` + `ramassé Nx {item}` — ordre constant.

**HDV — Vente confirmée en temps réel**

```
Vous avez perdu 1x Menthole .
Vous avez gagné 18 kamas.
```
Pattern vente réalisée : `perdu Nx {item}` + `gagné N kamas` — structure miroir de l'achat.

**HDV — Mise en vente (listing)**

```
Vous avez perdu 1x Amulette du Bouftou Royal .
Vous avez perdu 15 kamas.
```
Deux `perdu` consécutifs : perte d'item + perte de kamas = frais de mise en vente (commission).

**Transition monde**

Après fermeture MARKET : `on quitte le monde 1136` → `PERSONAL_SPACE_ENTER_RESULT_MESSAGE` (monde 9). Confirme : monde 1136 = HDV.

**Quêtes démarrées**

Trois quêtes simultanées à l'entrée dans la maison personnelle :
- `La quête "Récupération de larmes" a démarré.`
- `La quête "Tableau de chasse : Plante Carnivore" a démarré.`
- `La quête "Tableau de chasse : Grand Orrok" a démarré.`

Les "Tableaux de chasse" semblent être des quêtes de kill-count automatiquement assignées.

---

### Poll 2 — 14:52:38 à 14:55:19 (lignes 3199→3550)

**[Commerce] — liens cliquables (hypothèse confirmée)**

```
[Commerce] Goat'Geta : Dantgoule   & Aura de la Dantgoule   AV
```

Présence de doubles espaces avant `&` et après chaque nom d'item. Artéfact du strip des balises de lien : `[item]` → crochets strippés, espace résiduelle de chaque côté du nom. Deux items contigus : `] [` → `  ` (double espace).

> ⚠️ Corrigé (Addendum 2026-03-21) : Les doubles espaces ne sont pas une preuve assez robuste pour exploitation automatique stricte — indicateur seulement.

**Destruction d'objets — trois variantes**

```
Vous avez perdu 1x Boufmarteau .
Vous avez détruit 1 objet et récupéré 0 ressource
```
```
Vous avez perdu 11x Transmutation Raffinée .
Vous avez ramassé 88x Poudre .
Vous avez détruit 11 objets et récupéré 88 ressources
```
Pattern destruction : `perdu Nx {item}` + optionnellement `ramassé Nx {ressource}` + `détruit N objet(s) et récupéré N ressource(s)`. Distinct d'une vente ou d'un achat.

**Nourrissage de familier**

```
Votre familier aime le repas ! (+50 exp.)
Vous avez perdu 1x Seau d'eau .
```
Pattern : message d'exp. du familier suivi de la perte de nourriture. Ordre constant.

**Biblio-téléport depuis plusieurs mondes**

Utilisé deux fois : depuis monde 1136, puis depuis monde 1134. Monde 1134 = zone de contenu non encore identifiée.

**Quête échouée en quittant une zone**

`Quête échouée: "Solo : Épurage des Champs"` à 14:55:06 lors de `on quitte le monde 1134`. Les quêtes solo "Épurage" échouent automatiquement au téléport.

**Gestion de groupe — patterns complets**

```
{Nom} a rejoint le groupe
{Nom} est désormais au niveau modulé {N}
Vous avez supprimé le membre {Nom}
Vous ne faites désormais plus partie d'un groupe.
```
Chaque join déclenche `Déserialisation des achievements : size={N}` ×2 (deux panels UI). Taille varie par joueur (15127 vs 12794).

`[Héros] Nouveau leader local : 5832820` à 14:53:17 — ID 5832820 confirmé pour la troisième fois par une source différente.

**`tp {ID} to {monde}, {coords}` — nouvelles instances :**
- `tp 5832820 to 156, 3` à 14:53:47 → monde 156, pos 3
- `tp 11437248 to 4, 1` ×2 à 14:55:18 → ID 11437248 inconnu, monde 4

Apparition double de `tp 11437248` : deux lignes identiques consécutives — hypothèse double-envoi réseau ou deux personnages du groupe Héros.

`[NATION] Trying to remove {ID} from {Nation id=0}` : pattern récurrent lors des changements de zones. `Nation id=0` = défaut / sans nation. Bruit de fond, non exploitable.

`Achievement activated : {ID}` — IDs 5320 et 5134 (lors de transitions de zone ou de quête).

---

### Poll 3 — 14:55:52 à 14:57:38 (lignes 3551→3627)

**Liens cliquables dans le chat — CONFIRMÉ**

```
[Commerce] Foufy : Espadon de Tal Kasha  Espadon de Tal Kasha  Espadon de Tal Kasha à vendre
[Commerce] Filipo-Ombre : a vendre Bottes Répané  Anneau de Rozan  Talisman Songe
```

Chaque item lié laisse un **double espace** (`  `) entre lui et l'élément suivant. Il n'y a pas de balise XML ou marqueur spécial préservé — uniquement cet artéfact visuel.

Un message sans liens confirme la distinction :
```
[Commerce] Mähzupp : ACHETE : Ventilation III à 45o'ooo/u - Abandon à 4oo'ooo/u ...
```
Pas de double espace → acheteur en texte libre. Les deux coexistent dans le même canal.

**Canaux de chat supplémentaires observés**

- `[Recrutement (FR)]` — recrutement de groupe/raid
- `[Communauté (FR)]` — discussion générale communauté

Format identique : `[{Canal}] {Joueur} : {message}`.

**Occupation PLANT — agriculture**

```
Vous venez d'utiliser : Bouture de Châtaignier
Lancement occupation PLANT
On termine l'occupation PLANT
Vous avez perdu 1x Bouture de Châtaignier .
```
Planter une bouture = utiliser l'item → démarrage PLANT → fin PLANT → bouture consommée. Source : `bky`. Distinct de la collecte (`bki`) et loot monstre (`bkh`).

**Professions — XP et collecte**

Pattern complet (herborisme + pêche) :
```
On démarre l'occupation de collecte sur la ressource bKV@{hash}
Fin de l'occupation de collecte
{Profession} : +{N} points d'XP.  Prochain niveau dans : {N}.
Vous avez ramassé {N}x {item} .
```
Le `bKV@{hash}` identifie le nœud précis de ressource (objet en mémoire Java). Professions vues : Herboriste, Pêcheur.

`Removing character {Name} from manager` + `Tentative de suppression d'un CharacterInfo 0 inexistant.` — vu avec `Chevalier d'Astrub` (NPC tutoriel). Ce pattern apparaît pour les NPCs/monstres sortant de la zone. Le `CharacterInfo 0` est systématiquement inexistant = artéfact d'initialisation confirmé (Journal 1 identique).

---

### Polls 4–5 — 14:57:43 à 15:00:31 (lignes 3628→3784, herborisme continu)

Session d'herborisme prolongée (Feuille de Menthe, Pousse de Menthe). Confirme la solidité du pattern collecte ressource.

**`[Commerce]` — confirmation liens vs texte libre :**
- `[Commerce] Noi-Noi-No : Amulette de Nyom av` → texte libre, pas de double espace → pas de lien
- `[Commerce] Ang'Elio Merkel : Constance II  Distribution a vendre` → `Constance II  Distribution` = deux items liés
- `[Commerce] Funnyiop : fore 160/armu153/...` → texte libre (artisan), pas de lien

Conclusion : les doubles espaces sont **exclusivement** des artéfacts de liens cliquables. Texte libre et texte lié coexistent dans le même canal.

---

### Poll 6 — 15:01:07 à 15:01:21 (lignes 3742→3784)

**Quête collaborative échouée**

`Quête échouée: "Collaboratif : Invasion de Grouilleux"` à `on quitte le monde 527`. Troisième type de quête : "Collaboratif" — échec automatique au départ de zone.

**`CharacterInfo 0` — confirmation artéfact de changement de monde**

3× `Tentative de suppression d'un CharacterInfo 0 inexistant.` simultanées à `on quitte le monde 527`. Corrélation directe changement de monde → nettoyage raté de CharacterInfo 0. **Toujours un artéfact, jamais une vraie suppression de personnage.**

**`[_FL_]` — identification de Divinité Rolex**

```
[_FL_] fightId=1616067517 Capt'chat breed : 5314 [-1776810787728971] isControlledByAI=true
[_FL_] fightId=1616067517 Divinité Rolex breed : 5 [5832820] isControlledByAI=false
```

**5832820 = Divinité Rolex**, breed 5 (Xelor). Cela révise l'interprétation antérieure de `[Héros] Nouveau leader local : 5832820` : c'est Divinité Rolex qui était le personnage actif, pas L'Immortel. L'Immortel (3111456) et Divinité Rolex (5832820) sont deux personnages distincts du même compte.

`WakfuGameCalendar : adding periodic ClimateUpdateEvent event, period= 12 minutes` — timer météo du jeu, fréquence 12 min, apparaît à chaque changement de monde. Non exploitable.

---

### Polls 7–9 — 15:01:07 à 15:12:48 — Captcha Capt'chat

**Contexte du captcha antibot**

Le Capt'chat (breed 5314) est un système antibot déguisé en combat. Seul sort disponible : `Destruction de Glyphe`. Dés de 6 sur toute la surface : côté joueur 8 dés (glyphes à détruire), côté Capt'chat 3 dés non-barrés + 5 dés barrés. Le joueur doit détruire les 3 glyphes correspondant aux valeurs non-barrées.

**Déclencheur — signature dans les logs (séquence immuable)**

```
[COLLECT CANCELLATION] No occupation or occupation already ended
on quitte le monde 527
Quête échouée: "Course : Gligli Mania"
bZJ initialisé, centré sur (0,-1)
WakfuGameCalendar : adding periodic ClimateUpdateEvent event, period= 12 minutes
NetInFight Added (×2)
CREATION DU COMBAT
[_FL_] fightId={N} Capt'chat breed : 5314 [ID_négatif] isControlledByAI=true ... at {Point3 : (1, -9, 0)}
[_FL_] fightId={N} {joueur} breed : X [ID_joueur] isControlledByAI=false ... at {Point3 : (-3, -9, 0)}
```

`[COLLECT CANCELLATION]` = signal précoce le plus fiable (le captcha interrompt toujours une collecte en cours). Position d'entrée **fixe** pour les deux combattants.

**Comparaison ÉCHEC vs SUCCÈS**

| Séquence | ÉCHEC | SUCCÈS |
|---|---|---|
| Sorts visibles | 2 `Destruction de Glyphe` | 2 en combat + 1 post-quitte |
| Avant `[FIGHT] End` | `{joueur} est KO !` | `Vous avez ramassé 40x {item}` |
| Kamas | — | `Vous avez gagné N kamas.` |

**Exemple ÉCHEC (fightId=1616067517)**

```
[Information (combat)] Divinité Rolex lance le sort Destruction de Glyphe   ← tour 1
[Information (combat)] Divinité Rolex lance le sort Destruction de Glyphe   ← tour 2
[Information (combat)] Divinité Rolex est KO !
[Information (combat)] Divinité Rolex lance le sort Destruction de Glyphe   ← post-mortem
[FIGHT] End fight with id 1616067517
```

**Exemple SUCCÈS (fightId=1616067600, combinaison 7-2-1)**

```
[Information (combat)] Divinité Rolex lance le sort Destruction de Glyphe   ← tour 1
[Information (combat)] Divinité Rolex lance le sort Destruction de Glyphe   ← tour 2
[Information (jeu)] Vous avez ramassé 40x Lailait .
on quitte le monde 862
[Information (combat)] Divinité Rolex lance le sort Destruction de Glyphe   ← tour 3 (réseau décalé)
[Information (jeu)] Vous avez gagné 160 kamas.
[FIGHT] End fight with id 1616067600
```

**Anomalies structurelles :**
- Le 3ème sort en succès arrive APRÈS `on quitte le monde 862` (validation réseau décalée)
- `scenario/2715.lua:718` — erreur Lua présente dans les deux cas (bruit de fond)
- L'ID du Capt'chat change à chaque combat (ID négatif incrémental : -1776810787728971, -728514, -728167, -726636...)

**Récompense fixe :** 40× ressources + N kamas. Exemple : `40x Lailait` et `160 kamas`.

**Limitation critique :** Les valeurs des dés du captcha (combinaison Capt'chat) ne sont **jamais loggées**. Information purement visuelle côté client — ni dans `wakfu.log`, ni dans `wakfu_chat.log`.

**Nouvelles quêtes identifiées :**
- `Quête échouée: "Course : Gligli Mania"` — type "Course" (chronométrée)
- `Quête échouée: "Collaboratif : La poule aux oeufs d'Or"` — 2ème quête collaborative
- `Quête échouée: "Solo : Épurage des Champs"` — type "Solo"

**`[Proximité]` — couplage système → chat**

`[Proximité] Maui l'Aïeul : Il n'y a plus assez de monstres dans la zone. Pensez à replanter !` + immédiatement `[ligne: 1], Pas assez de monstre` — message Lua interne `aFi:606` couplé au chat local. Exploitable pour détecter les conditions de zone.

---

### Polls 10–14 — 15:13 à 15:22 : HDV Sufokia, havre-sac, fermeture

**HDV — Distinction mise en vente vs réponse à offre d'achat (confirmé)**

Deux transactions avec des Feuilles de Menthe :
- **Mise en vente (listing)** : `Vous avez perdu 1x Feuille de Menthe .` + `Vous avez perdu 2 kamas.` → item + frais de commission, en attente d'un acheteur
- **Réponse à une offre d'achat (instant)** : `Vous avez perdu 1x Feuille de Menthe .` + `Vous avez gagné 24 kamas.` → quelqu'un avait posé une offre d'achat, transaction instantanée

Règle : `perdu item + perdu kamas` = mise en vente / `perdu item + gagné kamas` = vente instantanée ou réponse à offre.

**HDV — Pathfinding automatique vers une board**

```
Searching path to [bAL id=31546]{Point3 : (-12, 27, -57)}
Lancement de l'occupation MARKET sur la board [bAL id=31546]{Point3 : (-12, 27, -57)}
```
Board HDV de Sufokia = `[bAL id=31546]` (distinct de la board 31547 de la session précédente). `Searching path to` (source `cQQ:57`) précède systématiquement le `Lancement de l'occupation MARKET` (source `bkw:41`).

**Espace personnel (havre-sac) — MANAGE_FLEA et vitrines**

```
Serching path to {Point3 : (4, 2, 0)}   ← faute de frappe "Serching" dans le log
Lancement de l'occupation MANAGE_FLEA sur la vitrine uid={uid_long}
[DIMENSIONAL_BAG_FLEA_CONTENT_MESSAGE] ownerId=5832820
On arrête l'occupation MANAGE_FLEA sur la vitrine uid={uid_long} (fromServer=false, sendMessage=true)
Recu demande d'annulation du managing du local player
```

`MANAGE_FLEA` = gestion d'une vitrine au sein du havre-sac (bag dimensionnel). `ownerId` confirme le propriétaire. `fromServer=false` = fermeture côté client. L'UID de la vitrine est un int64 unique.

**Dépôt dans coffre de compte — erreur de stacking**

```
ERROR [Account chest] Error when stacking items to account chest= ERROR
```
Apparaît 3× consécutives (une par seconde) lors d'un dépôt échoué. Les dépôts réussis ne génèrent **aucun log** (opération silencieuse).

**Apprentissage de meubles/vitrines**

Séquence identique aux cosmétiques :
- `Vitrine de la collection Vileardente` → apprise à 15:20:09
- `Vitrine Barda` → apprise à 15:21:13
- `Recycleuse d'objets hors-service` → apprise à 15:21:38

`ramassé {item}` → `utiliser {item}` → `appris l'apparence {item}`. Le pattern `appris l'apparence` est réutilisé pour **meubles et costumes**.

**`[Messages d'erreur]` — canal d'erreurs jeu**

`[Messages d'erreur] Conditions d'utilisation non respectées. Consultez la description de l'objet pour plus d'informations.` (source `aPh:174`) — apparaît quand un item ne peut pas être utilisé (restriction de niveau, classe, nation, ou item déjà appris).

**Fermeture du jeu — séquence confirmée**

```
Sending DisconnectionMessage to Servers. Reason : {Quit Request From Client}
[CHAT] Connection closed (zaap-chat.ankama.com)
Connexion avec le serveur perdue (wakfu-pandora.ankama-games.com)
save chat config
SoundManager stopped
Sending DisconnectionMessage to Servers. Reason : {UI Closed}
Stopping cAx...
```

Séquences identiques aux sessions précédentes. Serveurs : `zaap-chat.ankama.com` (chat) et `wakfu-pandora.ankama-games.com:5556` (jeu). IP locale client : `192.168.1.69`.

**wakfu_chat.log vs wakfu.log — différence clé confirmée**

`wakfu_chat.log` contient **uniquement** les canaux chat (`[Information (jeu)]`, `[Commerce]`, `[Recrutement (FR)]`, `[Communauté (FR)]`, `[Proximité]`, `[Messages d'erreur]`). Format simplifié : `HH:mm:ss,ms - [Canal] message`.

`[Information (combat)]` (sorts, KO, combat terminé) est **absent de `wakfu_chat.log`** — exclusif à `wakfu.log`.

---

## Session 3 — 2026-03-18, 15:50–16:10 — PERSONAL_SPACE et erreurs Netty

*Ligne de base : 5269 lignes dans wakfu.log*
*Objectifs : PERSONAL_SPACE succès vs échec, havre-sac d'autres joueurs, observations annexes*

> ⚠️ Corrigé (Addendum 2026-03-21) : Les signaux `PERSONAL_SPACE_ENTER_RESULT_MESSAGE` et `PERSONAL_SPACE_LEAVE_RESULT_MESSAGE` sont fiables. Le monde `9` correspond bien à l'espace personnel (havre-sac). Les erreurs d'ouverture havre-sac sont correctement observées selon le contexte. Ces signaux restent utiles pour la télémétrie de session mais ne pilotent pas la logique prix HDV — source de vérité = protobuf + SQLite.

---

### Poll 1 — 15:54 à 15:55 (lignes 5270→5819) — Reconnexion + havre-sac

**Nouveau serveur — Ogrest**

Reconnexion complète : `Authentication token received from dispatch server` → `Connexion au proxy :wakfu-ogrest.ankama-games.com:5556` — joueur sur **Ogrest** (Journal 2 = Pandora).

**Monde 999 — nouveau monde identifié**

Le joueur démarre dans le monde 999. `Quête échouée: "Collaboratif : Stop Chef"` apparaît à la sortie → zone avec quêtes collaboratives actives. Quitté à 15:54:33 via Biblio-téléport.

**PERSONAL_SPACE_LEAVE_RESULT_MESSAGE — CONFIRMÉ**

```
DEBUG 15:54:57,681 [AWT-EventQueue-0] (cdV:1137) - PERSONAL_SPACE_LEAVE_RESULT_MESSAGE
INFO  15:54:57,685 [AWT-EventQueue-0] (cdV:390) - on quitte le monde 9
```

Signal de sortie du havre-sac confirmé, source `cdV:1137`. Fait toujours suite à un `PERSONAL_SPACE_ENTER_RESULT_MESSAGE (success=true)` et est immédiatement suivi de `on quitte le monde 9`. Sortie déclenchée par `WALKON` sur la tuile de sortie.

**Havre-sac — erreur zone interdite (monde 1089 : hub Biblio-téléport)**

```
[Messages d'erreur] Impossible d'ouvrir son sac à cet endroit
```
Répété ×10 (une ligne par tentative). **Aucun `PERSONAL_SPACE_ENTER_RESULT_MESSAGE` n'apparaît en cas d'échec** — la détection sur `PERSONAL_SPACE_ENTER` est fiable (pas de faux positifs).

**Havre-sac — erreur pendant déplacement**

```
[Messages d'erreur] Impossible d'entrer dans le Havre-Sac pendant un déplacement.
```

Deux messages d'erreur distincts selon la raison :
1. `Impossible d'ouvrir son sac à cet endroit` → zone interdite
2. `Impossible d'entrer dans le Havre-Sac pendant un déplacement.` → en mouvement

**Havre-sac — succès depuis zone de farm (monde 527)**

Deux ouvertures réussies :
```
on quitte le monde 527
PERSONAL_SPACE_ENTER_RESULT_MESSAGE (success=true)
→ monde 9
Action performed on interactive element : WALKON
PERSONAL_SPACE_LEAVE_RESULT_MESSAGE
on quitte le monde 9
```
Séquence identique les deux fois. Pattern entrée/sortie propre et fiable.

**Marqueurs du joueur**

- `[Proximité] L'Immortel : **Bibliotemple` à 16:01:08 → joueur dans le hub Biblio (monde 1089)
- `[Proximité] L'Immortel : **zaap de sufokia` à 16:01:29 → joueur au zaap de Sufokia (monde 1135)

**Divers**

- `[CHAT] Error 403` + `Authentication failed error code=9` — échec d'auth chat au démarrage, suivi d'une reconnexion automatique. Bruit de fond.
- `[Guilde] Guilde : Glory to Sufokia !` — visible dès le char select.
- `Update de chaos du protecteur {ID}` + `Update de la satisfaction du protecteur {ID}` — IDs 348/349/354 dans monde 1135 (Sufokia), IDs 203/292/293/299/300/301/302/303 dans une autre zone. Protecteurs de nation. Récurrent à chaque changement de monde.

---

## Observations classées par domaine

### Économie & HDV

**Patterns textuels (télémétrie uniquement — prix via protobuf)**

| Pattern | Signification |
|---------|--------------|
| `perdu N kama(s)` + `ramassé Nx {item}` | Achat réalisé |
| `perdu Nx {item}` + `gagné N kamas` | Vente réalisée (ou réponse à offre d'achat) |
| `perdu Nx {item}` + `perdu N kamas` | Mise en vente (frais de commission) |
| `Vous avez vendu N objets pour un prix total de N§ pendant votre absence.` | Ventes hors-session |

**Sessions HDV loggées**

- Entrée : `Lancement de l'occupation MARKET sur la board [bAL id={N}]{Point3 : ...}`
- Sortie : `On arrête l'occupation MARKET sur la board [bAL id={N}]`
- Boards confirmées : `[bAL id=31546]` (Sufokia, monde 1135, coords -12,27,-57) et `[bAL id=31547]` (monde 1136, coords -1,-12,-47)
- `Searching path to [bAL id={N}]` précède systématiquement le lancement

**Source de vérité prix :** pipeline `market_v3_proto.log -> hdv_market.db` via protobuf (`msgId=12294` = ventes, `msgId=13653` = achats). Le texte de log n'expose jamais le prix unitaire réel.

**MANAGE_FLEA — vitrines havre-sac**

- Entrée : `Lancement de l'occupation MANAGE_FLEA sur la vitrine uid={uid_long}`
- Contenu : `[DIMENSIONAL_BAG_FLEA_CONTENT_MESSAGE] ownerId={id}`
- Sortie : `On arrête l'occupation MANAGE_FLEA sur la vitrine uid={uid_long} (fromServer=false/true, sendMessage=true)`

---

### Combat & XP

**Sources d'information combat**

| Marqueur | Information |
|---------|------------|
| `[_FL_] fightId={N} {Nom} breed : {B} [{ID}] isControlledByAI={bool}` | Tous les participants, universellement fiable |
| `[Information (combat)] {Nom} : +{N} points d'XP.` | XP du combat principal |
| `[Information (combat)] {Challenge} réussi → +{N} kamas` | XP challenge (ligne séparée) |
| `[Information (jeu)] Le challenge "{NOM}" a échoué.` | Échec de challenge |
| `[Information (jeu)] Vous avez réussi la quête {NOM}.` | Réussite de quête |
| `Quête échouée: "{NOM_QUETE}"` | Échec de quête |

**Règle ID combat**

- `isControlledByAI=false` + ID positif → personnage joueur (principal ou héros-compte)
- `isControlledByAI=false` + ID négatif → companion NPC (Chevalier d'Astrub, etc.) — pas un perso joueur
- `isControlledByAI=true` + ID négatif → mob ennemi ou invocation

**Captcha Capt'chat (breed 5314)**

- Déclencheur : `[COLLECT CANCELLATION]` + `on quitte le monde 527` + `CREATION DU COMBAT`
- Succès : `Vous avez ramassé 40x {item}` + `Vous avez gagné N kamas` avant `[FIGHT] End`
- Échec : `{joueur} est KO !` dans `[Information (combat)]`
- Limitation : valeurs des dés jamais loggées (information purement visuelle)
- Monde du combat : 862 (retour à 527 après succès)

**Groupe héros**

En mode héros, chaque événement `[Information (jeu/combat)]` est dupliqué (une fois par perso). Dédupliquer pour ne compter qu'une seule fois. Achievements déclenchés ×N (une fois par perso).

---

### Inventaire & Coffre

**Coffre de guilde**

Préfixe `[GUILD_STORAGE_BOX]` trace l'accès complet. Dépôt = `Vous avez perdu 1x {item}` (indistinguable d'une perte sans ce contexte). Annulation = `Cancelling browse occupation`.

**Coffre de compte**

Dépôt réussi : silencieux (aucun log). Erreur de stacking : `[Account chest] Error when stacking items to account chest= ERROR` ×N (répété par tentative).

**Destruction d'objets**

```
Vous avez perdu Nx {item}
[optionnel] Vous avez ramassé Nx {ressource}
Vous avez détruit N objet(s) et récupéré N ressource(s)
```
La ligne bilan `détruit N objet(s)` distingue la destruction d'une vente ou d'un dépôt.

**Nourrissage de familier**

`Votre familier aime le repas ! (+N exp.)` suivi de `Vous avez perdu 1x {nourriture}`. Ordre constant.

**Apprentissage cosmétique/meuble**

`Vous venez d'utiliser : {item}` + `Vous avez appris l'apparence {item}`. Même pattern pour costumes et meubles.

---

### Zones & Monde

**WorldIds confirmés**

| Monde | Identification | Source |
|-------|---------------|--------|
| 9 | Espace personnel / havre-sac | `PERSONAL_SPACE_ENTER/LEAVE` + Sessions 1, 2, 3 |
| 156 | Inconnu (tp 5832820 to 156, 3) | Session 1 `tp` |
| 527 | Zone de farm (herborisme) + déclencheur captcha | Sessions 2 + 3 |
| 862 | Zone captcha Capt'chat | Session 2 |
| 999 | Zone Ogrest — quêtes collaboratives actives | Session 3 |
| 1089 | Hub Biblio-téléport | Marqueurs [Proximité] + transitions Session 3 |
| 1134 | Zone de contenu non identifiée | Session 2 |
| 1135 | Sufokia (HDV bAL 31546, zaap de sufokia) | Sessions 1, 2, 3 |
| 1136 | HDV (Hôtel des Ventes) | Session 2 (MARKET + transition vers monde 9) |
| 4 | Inconnu (tp 11437248 to 4, 1) | Session 2 `tp` |
| 6 | Inconnu (tp 5832637 to 6, 1) | Session 1 `tp` |

**WorldIds inconnus** : 156, 4, 6 (vus uniquement via `tp`), 1134 (Biblio-téléport depuis)

**Transitions de monde**

`on quitte le monde {ID}` trace toutes les sorties. `bZJ initialisé, centré sur ({X},{Y})` marque l'arrivée. `centré sur (0,0)` = écran de sélection ou chargement.

**Havre-sac**

- Entrée réussie : `PERSONAL_SPACE_ENTER_RESULT_MESSAGE (success=true)` + `on quitte le monde {source}`
- Sortie : `PERSONAL_SPACE_LEAVE_RESULT_MESSAGE` + `on quitte le monde 9`
- Échec (zone interdite) : `[Messages d'erreur] Impossible d'ouvrir son sac à cet endroit` — aucun `PERSONAL_SPACE_ENTER` → pas de faux positifs
- Échec (déplacement) : `[Messages d'erreur] Impossible d'entrer dans le Havre-Sac pendant un déplacement.`

**Protecteurs de nation**

`Update de chaos/satisfaction du protecteur {ID}` à chaque changement de monde. IDs confirmés pour Sufokia (monde 1135) : 348, 349, 354. IDs pour autre zone : 203, 292, 293, 299, 300, 301, 302, 303.

---

### Personnages & IDs confirmés

**Personnages joueur du compte**

| ID | Nom | Serveur | Breed | Classe | Source |
|----|-----|---------|-------|--------|--------|
| 3111456 | L'Immortel | Ogrest | 4 | Sram | `[_FL_]` Session 1 + `highlightedCharacteristics` account.xml |
| 5832637 | Divinité Du Sacrifice | Pandora | 11 | Sacrieur | `[_FL_]` Session 1 |
| 5832820 | Divinité Rolex | Pandora | 5 | Xelor | `[_FL_]` Session 2 + `[Héros]` + account.xml |
| 11414113 | Inconnu (Rubilax — Treshatu ou Passe Par La ?) | Rubilax | — | — | `tp` Session 1 |

**ID de compte Ankama interne**

`135009704` (confirmé via `Cleaning GameAccountData for 135009704` + `accountPreferences135009704.properties`)

**Sources de mapping ID → Nom (par fiabilité)**

| Source | Fiabilité | Contexte |
|--------|-----------|---------|
| `[_FL_] {NOM} [{ID}]` | Universelle | Tout combat |
| `[Héros] Nouveau leader local : {ID}` | Très fiable | Utilisation système héros |
| `highlightedCharacteristics{ID}` dans account.xml | Partielle | Persos ayant configuré leurs highlights de stats |
| `tp {ID}` | Partielle | Certaines transitions de carte seulement |
| `Unserializing effects for fighter {ID}` | Fiable | Début de combat |

**Breeds confirmés**

| Breed ID | Classe / Entité |
|----------|----------------|
| 4 | Sram |
| 5 | Xelor |
| 11 | Sacrieur |
| 2616 | Chacha (monstre Pandora) |
| 2617 | Chacha Blanc (variante) |
| 2867 | Chevalier d'Astrub (companion NPC) |
| 3791 | Cadran (invocation Xelor) |
| 3883 | Poiscaille des Profondeurs (monstre abyssal) |
| 3884 | Pichon Abyssal (monstre abyssal) |
| 4691 | Tristepin (héros NPC) |
| 5314 | Capt'chat (captcha antibot) |

**IDs tiers observés (joueurs aléatoires)**

6352525, 6619903, 6458300 (via `[NATION] Trying to remove`), 11437248 (via `tp`). Non exploitables sans corrélation avec un nom.

**Board IDs confirmés**

- `[bAL id=31546]` — comptoir HDV Sufokia (monde 1135, coords Point3 : -12, 27, -57)
- `[bAL id=31547]` — comptoir HDV (monde 1136, coords Point3 : -1, -12, -47)

---

## Hypothèses invalidées

1. **`tp {ID}` est émis à la connexion de chaque personnage.**
   → Invalidé. Le `tp` n'est émis que lors de certaines transitions de carte après un combat ou une action spécifique. Non systématique à la connexion.

2. **`isControlledByAI=false` signifie toujours un personnage joueur.**
   → Invalidé. `isControlledByAI=false` + ID **négatif** = companion NPC (ex. Chevalier d'Astrub). Seul `isControlledByAI=false` + ID **positif** garantit un personnage joueur.

3. **`[Héros] Nouveau leader local : 5832820` désignait L'Immortel.**
   → Invalidé. 5832820 = Divinité Rolex (Xelor, Pandora), confirmé par `[_FL_]` Session 2. L'Immortel = 3111456.

4. **`CharacterInfoManager (0 restants sur N)` : N = nombre de personnages sur le serveur.**
   → Invalidé. N = nombre d'entités chargées sur la map en session (joueurs + monstres + NPCs). Ici 80 entités en zone abyssale.

5. **`Tentative de suppression d'un CharacterInfo 0` = vraie suppression de personnage.**
   → Invalidé. ID=0 est systématiquement un artefact d'init du `CharacterInfoManager`. Toujours inexistant, jamais une vraie suppression (les vraies suppressions ont ID >1 000 000).

6. **Les prix HDV sont déductibles depuis le texte du log.**
   → Invalidé. Le texte expose les patterns de transaction (achat/vente/listing) mais jamais le prix unitaire réel. Source de vérité obligatoire : pipeline protobuf (`msgId=12294`/`13653`) + SQLite.

7. **Les doubles espaces dans `[Commerce]` sont une preuve robuste de liens cliquables pour exploitation automatique stricte.**
   → Nuancé. Les doubles espaces sont bien un artéfact de liens cliquables, mais insuffisants comme preuve seule pour exploitation automatique stricte — les joueurs peuvent aussi mentionner des noms d'items en texte libre sans liens.
