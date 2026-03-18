# Grand 3 — Journal d'écoute n°2
## Session de R&D — Observation et analyse

*Session démarrée : 2026-03-18 à ~14:50*
*Ligne de base : 3160 lignes dans wakfu.log*
*Objectifs spécifiques :*
- *HDV : ventes en temps réel et hors-session*
- *Liens cliquables dans le chat (sorts, items) — format exact*
- *Corroboration et infirmation des données du Journal 1*
- *Tout pattern encore inconnu*

---

## Observations

### Poll 1 — 14:50:28 à 14:52:25 (lignes 3160→3198)

**HDV — Session MARKET complète**

Première observation d'une session HDV de bout en bout :
- `Lancement de l'occupation MARKET sur la board [bAL id=31547]{Point3 : (-1, -12, -47)}` — entrée dans l'HDV (monde 1136)
- `On arrête l'occupation MARKET sur la board [bAL id=31547]` — sortie de l'HDV
- La board `[bAL id=31547]` identifie le comptoir précis utilisé ; les coordonnées donnent sa position dans le monde

**HDV — Achats en temps réel (dans la session)**

Deux achats identiques observés dans la foulée :
```
Vous avez perdu 1 kama.
Vous avez ramassé 1x Hache Piou .
```
→ Pattern achat : `perdu N kama(s)` + `ramassé Nx {item}` — les deux lignes arrivent ensemble, ordre constant.

Un troisième achat (item inconnu) : `Vous avez perdu 1 kama.` sans `ramassé` associé dans la fenêtre de poll — probablement splitté entre deux polls, à confirmer.

**HDV — Vente confirmée en temps réel**

```
Vous avez perdu 1x Menthole .
Vous avez gagné 18 kamas.
```
→ Pattern vente réalisée : `perdu Nx {item}` + `gagné N kamas` — même structure miroir que l'achat.

**HDV — Mise en vente (?)** *(interprétation à confirmer)*

```
Vous avez perdu 1x Amulette du Bouftou Royal .
Vous avez perdu 15 kamas.
```
→ Deux `perdu` consécutifs : perte d'item + perte de kamas. Hypothèse : frais de mise en vente (commission). À distinguer d'une enchère ou d'un autre mécanisme.

**Transition monde**

Après fermeture MARKET : `on quitte le monde 1136` → `PERSONAL_SPACE_ENTER_RESULT_MESSAGE` (monde 9). Confirme que le monde 1136 = HDV, et la transition vers maison personnelle est tracée.

**Quêtes démarrées**

Trois quêtes simultanées au moment de l'entrée dans la maison personnelle :
- `La quête "Récupération de larmes" a démarré.`
- `La quête "Tableau de chasse : Plante Carnivore" a démarré.`
- `La quête "Tableau de chasse : Grand Orrok" a démarré.`

Les "Tableaux de chasse" semblent être des quêtes de kill-count automatiquement assignées — à corroborer si elles apparaissent aussi à d'autres moments.

### Poll 2 — 14:52:38 à 14:55:19 (lignes 3199→3550)

**[Commerce] — canal chat et liens cliquables (hypothèse)**

Première observation du canal `[Commerce]` dans le log :
```
[Commerce] Goat'Geta : Dantgoule   & Aura de la Dantgoule   AV
```
Format : `[Commerce] {joueur} : {item1}   & {item2}   AV` (AV = À Vendre).

Observation cruciale : présence d'espaces doubles avant `&` et après chaque nom d'item. Dans le jeu, les items dans le chat sont des **liens cliquables**. Ces espaces doubles sont probablement des artéfacts du strip des balises de lien — le texte brut est conservé mais la mise en forme disparaît, laissant des espaces résiduels. Le log ne conserve pas les balises des liens cliquables, mais le double espace reste un marqueur indirect de leur présence.

**Destruction d'objets — nouveau pattern**

Trois variantes observées :
```
Vous avez perdu 1x Boufmarteau .
Vous avez détruit 1 objet et récupéré 0 ressource
```
```
Vous avez perdu 11x Transmutation Raffinée .
Vous avez ramassé 88x Poudre .
Vous avez détruit 11 objets et récupéré 88 ressources
```
→ Pattern destruction : `perdu Nx {item}` + optionnellement `ramassé Nx {ressource}` + `détruit N objet(s) et récupéré N ressource(s)`. La dernière ligne est le bilan. Distinct d'une vente ou d'un achat.

**Nourrissage de familier**

```
Votre familier aime le repas ! (+50 exp.)
Vous avez perdu 1x Seau d'eau .
```
→ Pattern nourrissage : message d'exp. du familier suivi de la perte de nourriture. Ordre constant.

**Biblio-téléport — usage et sortie de zone**

`Vous venez d'utiliser : Biblio-téléport` + `on quitte le monde {N}` — La bibliothèque de téléportation apparaît comme un item consommé (`Vous venez d'utiliser`). Utilisé deux fois : depuis monde 1136, puis depuis monde 1134. Le monde 1134 est une zone de contenu non encore identifiée.

**Quête échouée en quittant une zone**

`Quête échouée: "Solo : Épurage des Champs"` à 14:55:06 lors de `on quitte le monde 1134`. Les quêtes solo "Épurage" (défis de zone à durée limitée) échouent automatiquement au téléport.

**Gestion de groupe — patterns complets**

Séquence observée :
- `{Nom} a rejoint le groupe` — membre rejoint
- `{Nom} est désormais au niveau modulé {N}` — niveau adapté (modulation)
- `Vous avez supprimé le membre {Nom}` — kick
- `Vous ne faites désormais plus partie d'un groupe.` — groupe dissous

Chaque join d'un membre déclenche `Déserialisation des achievements : size={N}` ×2 (deux panels UI). La taille varie par joueur (15127 vs 12794 pour ce poll).

**`[Héros] Nouveau leader local : 5832820`** à 14:53:17 — corrobore L'Immortel. ID 5832820 confirmé pour la troisième fois par une source différente.

**`tp {ID} to {monde}, {coords}`** — nouvelles instances :
- `tp 5832820 to 156, 3` à 14:53:47 — L'Immortel → monde 156, pos 3
- `tp 11437248 to 4, 1` ×2 à 14:55:18 — ID 11437248 inconnu → monde 4

Apparition double de `tp 11437248` : deux lignes identiques consécutives. Hypothèse : deux personnages du groupe Héros téléportés, dont un partagerait cet ID (possible bug d'affichage ou double-envoi réseau).

**`[NATION] Trying to remove {ID} from {Nation id=0}`** — pattern récurrent lors des changements de zones. IDs de joueurs tiers quittant la zone simultanément. `Nation id=0` = défaut / sans nation. Bruit de fond, non exploitable.

**`Achievement activated : {ID}`** — IDs 5320 et 5134. Se déclenche lors de transitions de zone ou de quête. Contenu non visible dans le log seul.

### Poll 3 — 14:55:52 à 14:57:38 (lignes 3551→3627)

**Liens cliquables dans le chat — CONFIRMÉ**

Trois messages `[Commerce]` supplémentaires permettent de valider définitivement l'hypothèse :

```
[Commerce] Foufy : Espadon de Tal Kasha  Espadon de Tal Kasha  Espadon de Tal Kasha à vendre
[Commerce] Filipo-Ombre : a vendre Bottes Répané  Anneau de Rozan  Talisman Songe
```

Le pattern est clair : chaque item lié cliquable laisse un **double espace** (`  `) entre lui et l'élément suivant. Le mécanisme : dans le jeu les liens sont encodés `[Nom d'item]`; dans le log, les crochets sont strippés, laissant une espace résiduelle de chaque côté du nom. Deux items contigus → `] [` → `  ` (double espace).

Conclusion : pour détecter des items liés dans un message de chat, chercher les **doubles espaces** autour des noms. Il n'y a pas de balise XML ou marqueur spécial préservé dans le log — uniquement cet artéfact visuel.

Un troisième message Commerce confirme le canal pour les acheteurs aussi :
```
[Commerce] Mähzupp : ACHETE : Ventilation III à 45o'ooo/u - Abandon à 4oo'ooo/u ...
```
→ Pas de lien ici (l'acheteur décrit ses recherches en texte libre). Les doubles espaces ne sont donc présents **que** si le joueur a effectivement inséré des liens.

**Canaux de chat supplémentaires observés**

- `[Recrutement (FR)]` — recrutement de groupe/raid
- `[Communauté (FR)]` — discussion générale communauté

Tous deux suivent le même format : `[{Canal}] {Joueur} : {message}`.

**Occupation PLANT — agriculture**

Séquence complète :
```
Vous venez d'utiliser : Bouture de Châtaignier
Lancement occupation PLANT
On termine l'occupation PLANT
Vous avez perdu 1x Bouture de Châtaignier .
```
→ Planter une bouture = utiliser l'item → démarrage PLANT → fin PLANT → bouture consommée. Distinct de la collecte (occupation `bki`) et de la récolte monstre (`bkh`). Source: `bky`.

**Professions — XP et collecte**

Pattern complet observé en série (herborisme + pêche) :
```
On démarre l'occupation de collecte sur la ressource bKV@{hash}
Fin de l'occupation de collecte
{Profession} : +{N} points d'XP.  Prochain niveau dans : {N}.
Vous avez ramassé {N}x {item} .
```
→ Le `bKV@{hash}` identifie le nœud précis de ressource (objet en mémoire Java). Professions vues : Herboriste, Pêcheur.

**`Removing character {Name} from manager`** + `Tentative de suppression d'un CharacterInfo 0 inexistant.`** — vu à 14:57:27 avec `Chevalier d'Astrub` (NPC tutoriel). Confirme que ce pattern apparaît pour les NPCs/monstres sortant de la zone, pas uniquement pour des suppressions de personnages. Le `CharacterInfo 0` est systématiquement inexistant = artéfact d'initialisation vu dans Journal 1 également.

### Polls 4–5 — 14:57:43 à 15:00:31 (lignes 3628→3784, herborisme continu)

Session d'herborisme prolongée (Feuille de Menthe, Pousse de Menthe). Aucun nouveau pattern — confirme la solidité du pattern collecte ressource.

**`[Commerce]` — confirmation liens vs texte libre :**
- `[Commerce] Noi-Noi-No : Amulette de Nyom av` — texte libre, pas de double espace → pas de lien
- `[Commerce] Ang'Elio Merkel : Constance II  Distribution a vendre` — `Constance II  Distribution` = deux items liés (`Constance II` et `Distribution`) séparés par double espace
- `[Commerce] Funnyiop : fore 160/armu153/...` — texte libre (artisan proposant des crafts), pas de lien

Conclusion renforcée : les doubles espaces dans `[Commerce]` sont **exclusivement** des artéfacts de liens cliquables. Les joueurs peuvent aussi écrire les noms en texte libre sans liens — les deux coexistent dans le même canal.

### Polls 7–9 — Captcha Capt'chat (15:01:07 → 15:12:48)

**Contexte du captcha antibot**

Le Capt'chat (breed 5314) est un système antibot déguisé en combat. Quand il "proc" sur la zone :
- Le joueur n'a qu'**un seul sort disponible** : `Destruction de Glyphe`
- Des dés de 6 apparaissent sur toute la surface de combat
- Côté joueur : 8 dés (glyphes à détruire)
- Côté Capt'chat : 3 dés non-barrés (la combinaison attendue) + 5 dés barrés
- Le joueur doit détruire les 3 glyphes de son côté correspondant aux valeurs non-barrées du Capt'chat

**Déclencheur — signature dans les logs**

Séquence immuable à chaque déclenchement :
```
[COLLECT CANCELLATION] No occupation or occupation already ended
on quitte le monde 527
Quête échouée: "Course : Gligli Mania"        ← (et/ou d'autres quêtes collaboratives)
bZJ initialisé, centré sur (0,-1)
WakfuGameCalendar : adding periodic ClimateUpdateEvent event, period= 12 minutes
NetInFight Added (×2)
CREATION DU COMBAT
[_FL_] fightId={N} Capt'chat breed : 5314 [ID_négatif] isControlledByAI=true ... at {Point3 : (1, -9, 0)}
[_FL_] fightId={N} {joueur} breed : X [ID_joueur] isControlledByAI=false ... at {Point3 : (-3, -9, 0)}
```
Le `[COLLECT CANCELLATION]` est le signal précoce le plus fiable : le captcha interrompt toujours une collecte en cours. La position d'entrée est **fixe** pour les deux combattants (1,-9,0 et -3,-9,0).

**Comparaison ÉCHEC vs SUCCÈS**

| Séquence | ÉCHEC | SUCCÈS |
|---|---|---|
| Sorts visibles | 2 `Destruction de Glyphe` en combat | 2 en combat |
| Avant `[FIGHT] End` | `{joueur} est KO !` | `Vous avez ramassé 40x {item}` |
| Kamas | — | `Vous avez gagné {N} kamas.` |
| 3ème sort | après KO (réflexe mort) | après `on quitte le monde 862` |
| Lua error | présente | présente (= bruit de fond dans les deux cas) |

**Exemple ÉCHEC (fightId=1616067517)** :
```
[Information (combat)] Divinité Rolex lance le sort Destruction de Glyphe   ← tour 1
[Information (combat)] Divinité Rolex lance le sort Destruction de Glyphe   ← tour 2
[Information (combat)] Divinité Rolex est KO !
[Information (combat)] Divinité Rolex lance le sort Destruction de Glyphe   ← post-mortem
[FIGHT] End fight with id 1616067517
Combat terminé, cliquez ici pour rouvrir l'écran de fin de combat.
```

**Exemple SUCCÈS (fightId=1616067600, combinaison 7-2-1, joueur a joué correct)** :
```
[Information (combat)] Divinité Rolex lance le sort Destruction de Glyphe   ← tour 1
[Information (combat)] Divinité Rolex lance le sort Destruction de Glyphe   ← tour 2
[Information (jeu)] Vous avez ramassé 40x Lailait .          ← RÉCOMPENSE RESSOURCES
on quitte le monde 862
[Information (combat)] Divinité Rolex lance le sort Destruction de Glyphe   ← tour 3 (résolution réseau décalée)
[Information (jeu)] Vous avez gagné 160 kamas.               ← RÉCOMPENSE KAMAS
[FIGHT] End fight with id 1616067600
Combat terminé, cliquez ici pour rouvrir l'écran de fin de combat.
```

**Marqueurs de détection dans les logs :**
- SUCCÈS → `Vous avez ramassé 40x {item}` ET `Vous avez gagné N kamas` dans la fenêtre de fin de combat
- ÉCHEC → `{joueur} est KO !` dans `[Information (combat)]`

**Récompense fixe : 40× ressources + N kamas**. Dans cet exemple : `40x Lailait` et `160 kamas`.

**Anomalies structurelles observées :**
- Le 3ème sort en succès arrive APRÈS `on quitte le monde 862` (le serveur valide le résultat légèrement en retard)
- `scenario/2715.lua:718` — erreur Lua présente dans les deux cas (ne discrimine pas)
- `Challenge courant` varie : -982, -967, -993 ou -1 selon la position de respawn dans la zone
- L'ID du Capt'chat change à chaque combat (ID négatif incrémental : -1776810787728971, -728514, -728167, -726636...) — chaque instance est unique

**Autres nouvelles quêtes identifiées**

- `Quête échouée: "Course : Gligli Mania"` — quête de type "Course" (course chronométrée), échoue à chaque captcha
- `Quête échouée: "Collaboratif : La poule aux oeufs d'Or"` — 2ème quête collaborative identifiée
- `Quête échouée: "Solo : Épurage des Champs"` — 3ème type : "Solo" (monde 1134)

**`[Proximité]` — canal de chat local**

`[Proximité] Maui l'Aïeul : Il n'y a plus assez de monstres dans la zone. Pensez à replanter !` + immédiatement `[ligne: 1], Pas assez de monstre` — le système de gestion des monstres de zone émet un message Lua interne (`aFi:606`) en même temps que le message de chat local. C'est un couplage système → chat exploitable pour détecter les conditions de zone.

### Polls 10–14 — 15:13 à 15:22 : HDV Sufokia, havre sac, fermeture

**HDV — Distinction mise en vente vs réponse à offre d'achat (confirmé)**

L'utilisateur a effectué deux transactions distinctes avec des Feuilles de Menthe :
- **Mise en vente (listing)** :
  ```
  Vous avez perdu 1x Feuille de Menthe .
  Vous avez perdu 2 kamas.
  ```
  → Deux pertes : item + frais de commission. L'item attend un acheteur.
- **Réponse à une offre d'achat (instant)** :
  ```
  Vous avez perdu 1x Feuille de Menthe .
  Vous avez gagné 24 kamas.
  ```
  → Perte item + gain immédiat de kamas. Quelqu'un avait déjà posé une offre d'achat, la transaction est instantanée.

La distinction fondamentale : `perdu item + perdu kamas` = mise en vente / `perdu item + gagné kamas` = vente instantanée ou réponse à offre.

**HDV — Pathfinding automatique vers une board**

```
Searching path to [bAL id=31546]{Point3 : (-12, 27, -57)}
Lancement de l'occupation MARKET sur la board [bAL id=31546]{Point3 : (-12, 27, -57)}
```
La board HDV de Sufokia = `[bAL id=31546]`. Une board différente de celle de la session précédente (31547). Le `Searching path to` (source `cQQ:57`) précède systématiquement le `Lancement de l'occupation MARKET` (source `bkw:41`).

**`Occupation déjà terminée`**

`bkw:77` + `cdu:578 - Occupation déja terminée` — apparaît quand la fermeture de la board HDV est demandée alors qu'elle est déjà terminée (double-fermeture). Pattern bruit de fond.

**Espace personnel (havre sac) — MANAGE_FLEA et vitrines**

Accès à une vitrine dans le havre sac :
```
Serching path to {Point3 : (4, 2, 0)}   ← note: faute de frappe "Serching" dans le log
Lancement de l'occupation MANAGE_FLEA sur la vitrine uid={uid_long}
[DIMENSIONAL_BAG_FLEA_CONTENT_MESSAGE] ownerId=5832820
... (gestion de la vitrine)
On arrête l'occupation MANAGE_FLEA sur la vitrine uid={uid_long} (fromServer=false, sendMessage=true)
Recu demande d'annulation du managing du local player
```
`MANAGE_FLEA` = gestion d'une vitrine/marché au sein du havre sac (bag dimensionnel). Le `ownerId` confirme le propriétaire. L'UID de la vitrine est un int64 unique.

`fromServer=false` = fermeture côté client (joueur ferme la fenêtre). La source `cTP:130 - Bag-action to {Point3} validated` = déplacement dans le havre sac vers une position de vitrine.

**Dépôt dans coffre de compte — erreur de stacking**

```
ERROR [Account chest] Error when stacking items to account chest= ERROR
```
Apparaît 3× consécutives (une par seconde) quand un dépôt dans le coffre de compte échoue. Source `ceg:26`. L'erreur est répétée sans résolution — le joueur a réessayé 3 fois. Les dépôts réussis ne génèrent **aucun log** (opération silencieuse).

**Apprentissage de meubles/vitrines**

Pattern confirmé pour 3 meubles différents :
- `Vitrine de la collection Vileardente` → apprise à 15:20:09
- `Vitrine Barda` → apprise à 15:21:13
- `Recycleuse d'objets hors-service` → apprise à 15:21:38

Séquence identique à celle des cosmétiques : `ramassé {item}` → `utiliser {item}` → `appris l'apparence {item}`. Le même pattern `appris l'apparence` est réutilisé pour **meubles et costumes**.

**`[Messages d'erreur]` — canal d'erreurs jeu**

`[Messages d'erreur] Conditions d'utilisation non respectées. Consultez la description de l'objet pour plus d'informations.` — canal dédié aux messages d'erreur jeu (source `aPh:174`). Apparaît quand un item ne peut pas être utilisé (restriction de niveau, classe, nation, ou item déjà appris). Exploitable pour détecter des tentatives d'utilisation échouées.

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
Séquence identique à Journal 1. `{Quit Request From Client}` = fermeture volontaire. Serveurs identifiés : `zaap-chat.ankama.com` (chat) et `wakfu-pandora.ankama-games.com:5556` (jeu principal). IP côté client : `192.168.1.69` (IP locale).

**wakfu_chat.log vs wakfu.log — différence clé confirmée**

Vérification de `wakfu_chat.log` : il contient **uniquement** les messages des canaux de chat (`[Information (jeu)]`, `[Commerce]`, `[Recrutement (FR)]`, `[Communauté (FR)]`, `[Proximité]`, `[Messages d'erreur]`). Format simplifié : `HH:mm:ss,ms - [Canal] message`.

Les messages `[Information (combat)]` (sorts du captcha, KO, combat terminé) **n'apparaissent pas dans wakfu_chat.log**. Ils sont exclusifs à `wakfu.log`.

**Valeurs des dés captcha — limitation**

Les valeurs de dés du captcha (ex. 7-6-2) ne sont **jamais loguées nulle part**. Ni dans `wakfu.log`, ni dans `wakfu_chat.log`. C'est une information purement visuelle côté client. Seul l'action "Destruction de Glyphe" est logable, pas la cible spécifique.

**`[Commerce]` — confirmation supplémentaire liens cliquables**

`[Commerce] Bermuda Humide : Dague wano  Bottes ultime survivant à vendre !` — `Dague wano  ` (double espace) et `Bottes ultime survivant  ` — deux items liés. Confirmé dans les deux logs (wakfu.log et wakfu_chat.log).

---

## Bilan de session

*Durée : ~14:50 à 15:22 (≈32 minutes)*
*Lignes générées : 3160 → 4903 (≈1743 lignes)*

### Poll 6 — 15:01:07 à 15:01:21 (lignes 3742→3784)

**Quête collaborative échouée**

`Quête échouée: "Collaboratif : Invasion de Grouilleux"` à `on quitte le monde 527` — troisième type de quête : "Collaboratif" (quête de zone commune). Même comportement que "Solo : Épurage" — échec automatique au départ de zone.

**`CharacterInfo 0` — confirmation artéfact de changement de monde**

3× `Tentative de suppression d'un CharacterInfo 0 inexistant.` déclenchées simultanément à `on quitte le monde 527`. Corrélation directe changement de monde → nettoyage raté de CharacterInfo 0. Ce pattern est **toujours** un artéfact, jamais une vraie suppression de personnage.

**`[_FL_]` en combat — nouvelle identification de personnage**

```
[_FL_] fightId=1616067517 Capt'chat breed : 5314 [-1776810787728971] isControlledByAI=true
[_FL_] fightId=1616067517 Divinité Rolex breed : 5 [5832820] isControlledByAI=false
```

**Identification clé :** 5832820 = **Divinité Rolex**, breed 5 (Xelor), contrôlé par le joueur.

Cela révise l'interprétation antérieure de `[Héros] Nouveau leader local : 5832820` : au moment de ce signal, c'est Divinité Rolex (5832820) qui est devenu le personnage actif du groupe Héros — pas L'Immortel. L'Immortel = 3111456 (confirmé en Journal 1) est un personnage distinct.

L'Immortel (3111456) et Divinité Rolex (5832820) sont deux personnages du même compte, tous deux dans les `highlightedCharacteristics` de account.xml.

Companion de combat : `Capt'chat` (breed 5314, grand ID négatif) — monstre/NPC IA.

**`WakfuGameCalendar : adding periodic ClimateUpdateEvent event, period= 12 minutes`** — timer météo du jeu, fréquence 12 min. Apparaît à chaque changement de monde. Non exploitable pour le tracking joueur.

---

## Synthèse des découvertes de cette session

> *✅ Transféré dans Grand 1 (`1 - Sources_de_donnees.md`) le 2026-03-18*

### Nouveaux patterns confirmés

| Pattern | Marqueur log | Source |
|---|---|---|
| Captcha antibot (Capt'chat) | `CREATION DU COMBAT` + `breed : 5314` | wakfu.log |
| Captcha — déclencheur | `[COLLECT CANCELLATION]` + `on quitte le monde 527` | wakfu.log |
| Captcha — succès | `Vous avez ramassé 40x {item}` avant `[FIGHT] End` | wakfu.log |
| Captcha — échec | `{joueur} est KO !` dans `[Information (combat)]` | wakfu.log |
| Canal combat | `[Information (combat)] {joueur} lance le sort {sort}` | wakfu.log seul |
| Destruction d'objets | `perdu item` + `détruit N objet(s)` | wakfu.log |
| Nourrissage familier | `familier aime le repas (+N exp.)` + `perdu item` | wakfu.log |
| PLANT (agriculture) | `Lancement occupation PLANT` + `perdu bouture` | wakfu.log |
| MANAGE_FLEA (vitrine) | `Lancement de l'occupation MANAGE_FLEA sur la vitrine uid={uid}` | wakfu.log |
| Havre sac content | `[DIMENSIONAL_BAG_FLEA_CONTENT_MESSAGE] ownerId={id}` | wakfu.log |
| Account chest erreur | `[Account chest] Error when stacking items` | wakfu.log |
| Coffre dépôt réussi | (silencieux — aucun log) | — |
| Apprentissage meuble | `utiliser : {item}` + `appris l'apparence {item}` | wakfu.log + chat |
| Erreur d'utilisation | `[Messages d'erreur] Conditions d'utilisation non respectées` | wakfu.log + chat |
| Combat mondial | `on quitte le monde 527` → `CREATION DU COMBAT` → monde 862 | wakfu.log |

### Nouveaux canaux de chat identifiés

- `[Information (combat)]` — exclusif à wakfu.log (absent du wakfu_chat.log)
- `[Proximité]` — chat local de proximité
- `[Messages d'erreur]` — erreurs système/jeu

### Identification de personnages confirmée

- **5832820 = Divinité Rolex**, breed 5 (Xelor), membre du groupe Héros
- **3111456 = L'Immortel** (confirmé en Journal 1)
- Les deux sont dans `highlightedCharacteristics` de account.xml

### Liens cliquables — conclusion définitive

Les items liés dans le chat génèrent des **doubles espaces** (`  `) dans le log, artéfact du strip des crochets `[item name]`. Présent dans tous les canaux chat (Commerce, Communauté, etc.). Pas de balise préservée. Texte libre et texte lié coexistent dans le même canal.

### Limitation critique identifiée

Les **valeurs des dés du captcha** (combinaison Capt'chat) ne sont jamais loguées. L'assistant ne peut pas reconstituer la combinaison depuis les logs — uniquement détecter le déclenchement et le résultat (succès/échec).
