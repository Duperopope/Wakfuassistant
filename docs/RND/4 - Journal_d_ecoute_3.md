# Grand 4 — Journal d'écoute n°3
## Session de R&D — Observation et analyse

*Session démarrée : 2026-03-18 à ~15:50*
*Ligne de base : 5269 lignes dans wakfu.log*
*Objectifs spécifiques :*
- *PERSONAL_SPACE : succès vs échec (zones chargées, Buve-temps, autres joueurs)*
- *Havre-sac d'autres joueurs : différence de signal ?*
- *Toute observation annexe*

---

## Observations

### Poll 1 — 15:54 à 15:55 (lignes 5270→5819) — Reconnexion + havre-sac

**Nouveau serveur — Ogrest**

Reconnexion complète observée dès le début : `Authentication token received from dispatch server` → `Connexion au proxy :wakfu-ogrest.ankama-games.com:5556` — le joueur est sur **Ogrest** (Journal 2 = Pandora).

**Monde 999 — nouveau monde identifié**

Le joueur démarre in-game dans le monde 999. `Quête échouée: "Collaboratif : Stop Chef"` apparaît à la sortie → il s'agit d'une zone où des quêtes collaboratives sont actives. Quitté à 15:54:33 via Biblio-téléport.

**PERSONAL_SPACE_LEAVE_RESULT_MESSAGE — CONFIRMÉ**

```
DEBUG 15:54:57,681 [AWT-EventQueue-0] (cdV:1137) - PERSONAL_SPACE_LEAVE_RESULT_MESSAGE
INFO  15:54:57,685 [AWT-EventQueue-0] (cdV:390) - on quitte le monde 9
```

Signal de sortie du havre-sac confirmé, source `cdV:1137`. Il fait toujours suite à un `PERSONAL_SPACE_ENTER_RESULT_MESSAGE (success=true)` et est immédiatement suivi de `on quitte le monde 9`. La sortie est déclenchée par `Action performed on interactive element : WALKON` (le joueur marche sur la tuile de sortie).

**Havre-sac — erreur zone interdite (Biblio hub, monde 1089)**

Depuis le monde 1089 (hub Biblio-téléport), le joueur a spammé l'ouverture du havre-sac. Résultat :
```
[Messages d'erreur] Impossible d'ouvrir son sac à cet endroit
```
Répété × 10 (une ligne par tentative). **Aucun `PERSONAL_SPACE_ENTER_RESULT_MESSAGE` n'apparaît** — le signal est entièrement absent en cas d'échec. La détection d'ouverture sur `PERSONAL_SPACE_ENTER` est donc fiable (pas de faux positifs).

**Havre-sac — erreur pendant déplacement**

Un message distinct apparaît quand le joueur tente d'ouvrir son havre-sac en se déplaçant :
```
[Messages d'erreur] Impossible d'entrer dans le Havre-Sac pendant un déplacement.
```
Deux messages d'erreur distincts selon la raison du blocage :
1. `Impossible d'ouvrir son sac à cet endroit` → zone interdite
2. `Impossible d'entrer dans le Havre-Sac pendant un déplacement.` → en mouvement

**Havre-sac — succès depuis zone de farm (monde 527)**

Deux ouvertures réussies depuis le monde 527 :
```
on quitte le monde 527
PERSONAL_SPACE_ENTER_RESULT_MESSAGE (success=true)
→ monde 9
Action performed on interactive element : WALKON
PERSONAL_SPACE_LEAVE_RESULT_MESSAGE
on quitte le monde 9
```
Séquence identique les deux fois. Le pattern entrée/sortie est propre et fiable.

**Marqueurs du joueur**

- `[Proximité] L'Immortel : **Bibliotemple` à 16:01:08 — joueur confirme sa position dans le hub Biblio (monde 1089), juste avant d'en sortir (16:01:14)
- `[Proximité] L'Immortel : **zaap de sufokia` à 16:01:29 — joueur au zaap de Sufokia (monde 1135)

**Mapping mondes confirmé**

| Monde | Identification | Source |
|-------|---------------|--------|
| 999 | Zone inconnue (Ogrest) avec quête "Collaboratif : Stop Chef" | départ session |
| 1089 | Hub Biblio-téléport | marqueur + transitions |
| 1135 | Zone Sufokia (HDV bAL 31546) | marqueur + occupation MARKET |
| 527 | Zone de farm (Herborisme) | ouvertures havre-sac réussies |
| 9 | Espace personnel / havre-sac | PERSONAL_SPACE |

**Divers**

- `[CHAT] Error 403` + `Authentication failed error code=9` — échec d'auth chat au démarrage, suivi d'une reconnexion automatique. Bruit de fond.
- `[Guilde] Guilde : Glory to Sufokia !` — message de guilde visible dès le char select.
- `Update de chaos du protecteur {ID}` + `Update de la satisfaction du protecteur {ID}` — IDs 348/349/354 dans monde 1135 (Sufokia), IDs 203/292/293/299/300/301/302/303 dans une autre zone. Ces IDs semblent être des protecteurs de nation. Pattern récurrent à chaque changement de monde.

