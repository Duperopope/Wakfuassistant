# LOG_FORMATS — Référence des patterns regex du log_parser

> Source de vérité : `src-tauri/src/services/log_parser.rs`
> Total patterns documentés : **20**
> Dernière mise à jour : 2026-03-21

---

## Contexte

Le parser Wakfu opère sur deux fichiers journaux distincts :

| Fichier | `LogSource` | Format des lignes |
|---------|-------------|-------------------|
| `wakfu.log` | `WakfuMain` | `LEVEL HH:MM:SS,mmm [thread] (class:line) - MESSAGE` |
| `wakfu_chat.log` | `WakfuChat` | `HH:MM:SS,mmm - MESSAGE` |

Le parser extrait le `MESSAGE` (après ` - `) avant d'appliquer les patterns. Les patterns sont testés **dans l'ordre du registre `PATTERNS`** — le premier qui matche gagne.

**Séparateurs de milliers** dans les nombres : espace ordinaire (U+0020), NBSP (U+00A0) ou NNBSP (U+202F) — tous traités par `parse_num` / `parse_num_i64`.

---

## Patterns — dans l'ordre du registre PATTERNS

---

### 1. `fighter_join`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `MainOnly` (wakfu.log uniquement) |

**Regex :**
```
\[_FL_\] fightId=(\d+) (.+?) breed\s*:\s*(\d+) \[([^\]]+)\] isControlledByAI=(\w+)
```

**Description :** Détecte l'entrée d'un combattant dans un combat. Chaque participant (joueur, monstre, familier) génère une ligne `[_FL_]` au début du combat.

**Groupes de capture :**

| # | Groupe | Signification |
|---|--------|---------------|
| 1 | `(\d+)` | ID numérique du combat (`fightId`) |
| 2 | `(.+?)` | Nom du combattant (joueur ou monstre) |
| 3 | `(\d+)` | ID de la race/espèce (`breed`) |
| 4 | `([^\]]+)` | ID unique du combattant entre crochets (peut être négatif pour les monstres) |
| 5 | `(\w+)` | `true` si contrôlé par l'IA, `false` si joueur humain |

**GameEvent produit :**
```
CombatStarted {
    monster_group: Some("fight={fightId} {name} breed={breedId} id={fighterId} ai={isAi}")
}
```
> Note : Le FSM agrège plusieurs `CombatStarted` successifs pour reconstituer le groupe de combattants.

**Exemples :**
```
[_FL_] fightId=1600047387 L'Immortel breed : 4 [3111456] isControlledByAI=false
[_FL_] fightId=1616067187 Divinité Du Sacrifice breed : 11 [5832637] isControlledByAI=false
[_FL_] fightId=1616067517 Capt'chat breed : 5314 [-1776810787728971] isControlledByAI=true
```

**Notes :** `breed\s*:\s*` tolère un espace variable autour du deux-points. Les IDs de combattant monstres peuvent être négatifs (longs). Ce pattern est placé en premier (priorité haute) car sa regex est longue et spécifique, réduisant les faux positifs.

---

### 2. `xp_combat`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `MainOnly` (wakfu.log uniquement) |

**Regex :**
```
\[Information \(combat\)\] (.+?) : \+([\d\s\u{00a0}\u{202f}]+) points d'XP\.\s+Prochain niveau dans : ([\d\s\u{00a0}\u{202f}]+)\.
```

**Description :** Capture les gains d'XP personnage à la fin d'un combat, affichés dans la zone `[Information (combat)]`.

**Groupes de capture :**

| # | Groupe | Signification |
|---|--------|---------------|
| 1 | `(.+?)` | Nom du personnage qui reçoit l'XP |
| 2 | `([\d\s\u{00a0}\u{202f}]+)` | Montant d'XP gagné (avec séparateurs de milliers) |
| 3 | `([\d\s\u{00a0}\u{202f}]+)` | XP restant avant le prochain niveau (capturé mais non utilisé dans l'event) |

**GameEvent produit :**
```
XpGained {
    amount: <montant groupe 2>,
    source: XpSource::Combat,
}
```

**Exemples :**
```
[Information (combat)] L'Immortel : +15 384 points d'XP.  Prochain niveau dans : 255 833 161.
[Information (combat)] L'Immortel : +54 468 878 points d'XP.  Prochain niveau dans : 182 570 141.
[Information (combat)] Divinité Rolex : +11 538 points d'XP.  Prochain niveau dans : 83 837 174.
```

**Notes :** Ce pattern est en priorité 2 (avant `profession_xp` en position 18) pour éviter que les noms de personnages ne soient interprétés comme des noms de métiers. Le préfixe `[Information (combat)]` le distingue de `profession_xp`.

---

### 3. `spell_cast`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `MainOnly` (wakfu.log uniquement) |

**Regex :**
```
\[Information \(combat\)\] (.+?) lance le sort (.+?)(?:\s+\(Critiques\))?\s*$
```

**Description :** Détecte le lancer d'un sort en combat, avec ou sans coup critique.

**Groupes de capture :**

| # | Groupe | Signification |
|---|--------|---------------|
| 1 | `(.+?)` | Nom du lanceur (joueur ou monstre) |
| 2 | `(.+?)` | Nom du sort lancé (sans la mention "(Critiques)") |

**GameEvent produit :**
```
DamageDealt {
    target: "",        // cible inconnue à ce stade
    amount: 0,         // dégâts non encore connus
    element: Some("{caster}:{spell}"),
}
```
> Abus sémantique : `DamageDealt` est utilisé ici comme porteur de l'information de lancer de sort, avant que les dégâts réels soient connus.

**Exemples :**
```
[Information (combat)] L'Immortel lance le sort Fourberie
[Information (combat)] Divinité Rolex lance le sort Destruction de Glyphe
[Information (combat)] L'Immortel lance le sort Saignée mortelle (Critiques)
```

**Notes :** `(?:\s+\(Critiques\))?` est un groupe non-capturant optionnel — les coups critiques sont absorbés sans être capturés séparément. `\s*$` absorbe les espaces en fin de ligne.

---

### 4. `damage`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `MainOnly` (wakfu.log uniquement) |

**Regex :**
```
\[Information \(combat\)\] (.+?): ([+-]?\s*[\d\s\u{00a0}\u{202f}]+) PV\s+\(([^)]+)\)
```

**Description :** Capture les variations de PV en combat : dégâts infligés (valeur négative) ou soins reçus (valeur positive).

**Groupes de capture :**

| # | Groupe | Signification |
|---|--------|---------------|
| 1 | `(.+?)` | Nom de la cible affectée |
| 2 | `([+-]?\s*[\d\s\u{00a0}\u{202f}]+)` | Variation de PV (négatif = dégâts, positif = soin) |
| 3 | `([^)]+)` | Élément ou type (ex: `Feu`, `Vol de vie`) |

**GameEvent produit :**
- Si la valeur est **négative** (dégâts) :
```
DamageDealt {
    target: <groupe 1>,
    amount: <valeur absolue>,
    element: Some(<groupe 3>),
}
```
- Si la valeur est **positive** (soin) :
```
DamageReceived {
    source: "heal:{groupe 3}",
    amount: <valeur>,
}
```

**Exemples :**
```
[Information (combat)] Poiscaille des Profondeurs: -250 PV  (Feu)
[Information (combat)] L'Immortel: +150 PV  (Vol de vie)
```

**Notes :** La logique d'inversion (`DamageReceived` pour les soins) est un compromis sémantique — aucune variante `HealReceived` n'existe dans `GameEvent`. Les espaces doubles avant `(` sont tolérés par `\s+`. `[^)]+` capture tout jusqu'à la parenthèse fermante.

---

### 5. `ko`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `MainOnly` (wakfu.log uniquement) |

**Regex :**
```
\[Information \(combat\)\] (.+?) est KO\s*!
```

**Description :** Détecte la mise KO d'un combattant (joueur ou monstre).

**Groupes de capture :**

| # | Groupe | Signification |
|---|--------|---------------|
| 1 | `(.+?)` | Nom du combattant mis KO |

**GameEvent produit :**
```
DamageReceived {
    source: "KO:{name}",
    amount: 0,
}
```
> Abus sémantique : utilise `DamageReceived` comme signal KO. `amount: 0` indique que c'est un événement d'état, non un chiffre de dégâts.

**Exemples :**
```
[Information (combat)] Divinité Rolex est KO !
[Information (combat)] Poiscaille des Profondeurs est KO !
```

**Notes :** `\s*!` tolère l'espace avant `!` (présent dans les exemples réels). Ne distingue pas KO joueur vs KO monstre — le FSM doit interpréter.

---

### 6. `combat_start`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `MainOnly` (wakfu.log uniquement) |

**Regex :**
```
CREATION DU COMBAT
```

**Description :** Signal de création d'un combat, émis en majuscules dans le log principal.

**Groupes de capture :** Aucun.

**GameEvent produit :**
```
CombatStarted {
    monster_group: None,
}
```

**Exemples :**
```
CREATION DU COMBAT
```

**Notes :** Pattern littéral sans regex spéciale. Précède généralement les lignes `[_FL_]` qui enrichissent le combat. `monster_group: None` indique que le groupe n'est pas encore connu.

---

### 7. `combat_end`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `MainOnly` (wakfu.log uniquement) |

**Regex :**
```
\[FIGHT\] End fight with id (\d+)
```

**Description :** Marque la fin d'un combat, identifié par son ID.

**Groupes de capture :**

| # | Groupe | Signification |
|---|--------|---------------|
| 1 | `(\d+)` | ID numérique du combat terminé |

**GameEvent produit :**
```
CombatEnded {
    victory: true,        // valeur provisoire — le FSM détermine victoire/défaite
    duration_secs: None,  // durée non calculée par le parser
}
```

**Exemples :**
```
[FIGHT] End fight with id 1600047387
[FIGHT] End fight with id 1616067517
```

**Notes :** L'ID capturé n'est pas transmis dans le `GameEvent` (aucun champ `fight_id` dans `CombatEnded`). `victory: true` est une valeur par défaut — le FSM corrige si nécessaire selon les KO.

---

### 8. `server_connect`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `MainOnly` (wakfu.log uniquement) |

**Regex :**
```
Connexion au proxy\s*:wakfu-([^.]+)\.ankama-games\.com:5556
```

**Description :** Détecte la connexion à un serveur de jeu Wakfu. Le nom du serveur est extrait de l'URL du proxy.

**Groupes de capture :**

| # | Groupe | Signification |
|---|--------|---------------|
| 1 | `([^.]+)` | Nom du serveur (ex: `ogrest`, `pandora`, `rubilax`) |

**GameEvent produit :**
```
ServerConnected {
    server: <groupe 1>,
}
```

**Exemples :**
```
Connexion au proxy :wakfu-ogrest.ankama-games.com:5556
Connexion au proxy :wakfu-pandora.ankama-games.com:5556
Connexion au proxy :wakfu-rubilax.ankama-games.com:5556
```

**Notes :** `\s*` tolère un espace optionnel avant `:wakfu-`. `[^.]+` capture tout jusqu'au premier `.` — isole le sous-domaine serveur. Le port `5556` est fixe (proxy Ankama).

---

### 9. `frame_world`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `MainOnly` (wakfu.log uniquement) |

**Regex :**
```
[Oo]n remet la frame [Ww]orld
```

**Description :** Signal de chargement du monde de jeu, indiquant qu'un personnage est entré en jeu. La casse de la première lettre et de `World` varie selon la version du client.

**Groupes de capture :** Aucun.

**GameEvent produit :**
```
CharacterSelected {
    name: "",    // inconnu — le FSM enrichira depuis d'autres lignes
    server: "",  // inconnu — enrichi depuis le dernier ServerConnected
}
```

**Exemples :**
```
On remet la frame World
on remet la frame world
```

**Notes :** `[Oo]` et `[Ww]` gèrent les deux variantes de casse observées. Le FSM utilise cet événement pour transitionner vers l'état `InGame` et associer le nom du personnage courant.

---

### 10. `disconnect_logoff`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `MainOnly` (wakfu.log uniquement) |

**Regex :**
```
Sending DisconnectionMessage to Servers\. Reason : \{LogOff\}
```

**Description :** Déconnexion volontaire via le bouton de déconnexion du jeu.

**Groupes de capture :** Aucun.

**GameEvent produit :**
```
Disconnected {
    reason: Some("LogOff"),
}
```

**Exemples :**
```
Sending DisconnectionMessage to Servers. Reason : {LogOff}
```

**Notes :** Les accolades `{LogOff}` sont échappées avec `\{` et `\}` dans la regex. Pattern littéral strict — pas de variantes connues pour cette raison.

---

### 11. `disconnect_quit`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `MainOnly` (wakfu.log uniquement) |

**Regex :**
```
Sending DisconnectionMessage to Servers\. Reason : \{Quit Request From Client\}
```

**Description :** Déconnexion par fermeture de la fenêtre du client Wakfu.

**Groupes de capture :** Aucun.

**GameEvent produit :**
```
Disconnected {
    reason: Some("Quit"),
}
```

**Exemples :**
```
Sending DisconnectionMessage to Servers. Reason : {Quit Request From Client}
```

**Notes :** Distinct de `disconnect_logoff` par la raison `{Quit Request From Client}`. Les deux patterns partagent le même préfixe `Sending DisconnectionMessage`.

---

### 12. `connection_lost`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `MainOnly` (wakfu.log uniquement) |

**Regex :**
```
Connexion avec le serveur perdue
```

**Description :** Perte de connexion réseau non intentionnelle (coupure réseau, timeout serveur).

**Groupes de capture :** Aucun.

**GameEvent produit :**
```
Disconnected {
    reason: Some("ConnectionLost"),
}
```

**Exemples :**
```
Connexion avec le serveur perdue
```

**Notes :** Pattern littéral. Contrairement aux deux patterns de déconnexion précédents, celui-ci ne provient pas d'un message `DisconnectionMessage` — c'est une détection de perte réseau.

---

### 13. `kamas_gained`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `Both` (wakfu.log et wakfu_chat.log) |

**Regex :**
```
Vous avez gagn[ée] ([\d\s\u{00a0}\u{202f}]+) [Kk]amas?
```

**Description :** Capture tout gain de kamas (monnaie du jeu), quelle que soit la source.

**Groupes de capture :**

| # | Groupe | Signification |
|---|--------|---------------|
| 1 | `([\d\s\u{00a0}\u{202f}]+)` | Montant en kamas, avec séparateurs de milliers possibles |

**GameEvent produit :**
```
KamasGained {
    amount: <groupe 1 parsé en i64>,
    source: KamasSource::Unknown,
    raw_line: <ligne complète matchée (caps[0])>,
}
```

**Exemples :**
```
Vous avez gagné 24 kamas.
Vous avez gagné 160 kamas.
Vous avez gagné 12 632 kamas.
```

**Notes :** `[ée]` gère la variante `gagne` / `gagné`. `[Kk]amas?` couvre `kama` (singulier) et `kamas` (pluriel) en majuscule ou minuscule. La source est `Unknown` — aucune contextualisation par le parser. `raw_line` est `caps[0]` (toute la portion matchée).

---

### 14. `kamas_spent`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `Both` (wakfu.log et wakfu_chat.log) |

**Regex :**
```
Vous avez perdu ([\d\s\u{00a0}\u{202f}]+) [Kk]amas?
```

**Description :** Capture toute dépense de kamas.

**Groupes de capture :**

| # | Groupe | Signification |
|---|--------|---------------|
| 1 | `([\d\s\u{00a0}\u{202f}]+)` | Montant perdu en kamas |

**GameEvent produit :**
```
KamasSpent {
    amount: <groupe 1 parsé en i64>,
    source: KamasSource::Unknown,
    raw_line: <ligne complète matchée>,
}
```

**Exemples :**
```
Vous avez perdu 1 kama.
Vous avez perdu 2 kamas.
Vous avez perdu 15 kamas.
```

**Notes :** Attention au chevauchement potentiel avec `item_lost` : les deux commencent par `Vous avez perdu`. Ce pattern matche uniquement si suivi de chiffres puis `kamas/kama`. `item_lost` matche `\d+x?\s+<nom>\s*\.` — les deux sont mutuellement exclusifs en pratique. `kamas_spent` (priorité 14) est testé avant `item_lost` (priorité 17).

---

### 15. `hdv_sold_offline`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `Both` (wakfu.log et wakfu_chat.log) |

**Regex :**
```
Vous avez vendu (\d+) objets? pour un prix total de ([\d\s\u{00a0}\u{202f}]+)§
```

**Description :** Détecte les ventes HDV réalisées pendant l'absence du joueur, affichées à la reconnexion.

**Groupes de capture :**

| # | Groupe | Signification |
|---|--------|---------------|
| 1 | `(\d+)` | Nombre d'objets vendus |
| 2 | `([\d\s\u{00a0}\u{202f}]+)` | Prix total encaissé en kamas |

**GameEvent produit :**
```
KamasGained {
    amount: <groupe 2 parsé>,
    source: KamasSource::Hdv,
    raw_line: "HDV hors-session: {count} objets, {total} kamas",
}
```

**Exemples :**
```
Vous avez vendu 9 objets pour un prix total de 12 632§ pendant votre absence.
```

**Notes :** `§` (signe paragraphe, U+00A7) est le symbole kamas utilisé par Wakfu dans les messages HDV. `objets?` couvre singulier et pluriel. La `raw_line` est construite synthétiquement (pas la ligne brute). Le texte après `§` (` pendant votre absence.`) n'est pas capturé.

---

### 16. `item_gained`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `Both` (wakfu.log et wakfu_chat.log) |

**Regex :**
```
Vous avez ramasss?[ée] (\d+)x?\s+(.+?)\s*\.
```

**Description :** Capture les objets ramassés (drop de monstre, récolte, récompense).

**Groupes de capture :**

| # | Groupe | Signification |
|---|--------|---------------|
| 1 | `(\d+)` | Quantité ramassée |
| 2 | `(.+?)` | Nom de l'objet (trimmed) |

**GameEvent produit :**
```
HarvestCompleted {
    resource: <groupe 2>,
    profession: "",      // inconnu — non fourni par ce type de message
    quantity: <groupe 1>,
}
```

**Exemples :**
```
Vous avez ramassé 1x Hache Piou .
Vous avez ramassé 5x Sioupère-Glou Mystique .
Vous avez ramassé 20x Jeton Exquis .
Vous avez ramassé 40x Lailait .
Vous avez ramassé 1x Almaton .
```

**Notes :** `ramasss?[ée]` gère une faute de frappe observée dans certaines versions du log (`ramassé` / `ramasse` / `ramasssé`). `x?` rend le `x` après la quantité optionnel. Le point final ` .` est dans la regex — les exemples montrent un espace avant le point (` .`), capturé par `\s*\.`. `profession: ""` est vide car ce message ne précise pas la profession source.

---

### 17. `item_lost`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `Both` (wakfu.log et wakfu_chat.log) |

**Regex :**
```
Vous avez perdu (\d+)x?\s+(.+?)\s*\.
```

**Description :** Capture les objets perdus (mort en combat, échange, utilisation).

**Groupes de capture :**

| # | Groupe | Signification |
|---|--------|---------------|
| 1 | `(\d+)` | Quantité perdue |
| 2 | `(.+?)` | Nom de l'objet (trimmed) |

**GameEvent produit :**
```
HarvestCompleted {
    resource: "-{groupe 2}",   // préfixe "-" indique une perte
    profession: "",
    quantity: <groupe 1>,
}
```

**Exemples :**
```
Vous avez perdu 1x Feuille de Menthe .
Vous avez perdu 1x Amulette du Bouftou Royal .
Vous avez perdu 1x Bouture de Châtaignier .
Vous avez perdu 11x Transmutation Raffinée .
```

**Notes :** La perte est encodée par le préfixe `-` dans le champ `resource`. Ce pattern est testé **après** `kamas_spent` (priorité 14) — le texte `"Vous avez perdu 15 kamas."` ne matche pas `item_lost` car il n'y a pas de `x` ni de nom d'objet après le nombre. Le point final peut être précédé d'un espace (` .`).

---

### 18. `profession_xp`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `Both` (wakfu.log et wakfu_chat.log) |

**Regex :**
```
(.+?) : \+([\d\s\u{00a0}\u{202f}]+) points d'XP\.\s+Prochain niveau dans : ([\d\s\u{00a0}\u{202f}]+)\.
```

**Description :** Capture les gains d'XP de métier (herboriste, pêcheur, mineur, etc.).

**Groupes de capture :**

| # | Groupe | Signification |
|---|--------|---------------|
| 1 | `(.+?)` | Nom du métier |
| 2 | `([\d\s\u{00a0}\u{202f}]+)` | Montant d'XP gagné |
| 3 | `([\d\s\u{00a0}\u{202f}]+)` | XP restant avant prochain niveau (capturé mais non utilisé) |

**GameEvent produit :**
```
HarvestCompleted {
    resource: "xp:{profession}",
    profession: <groupe 1>,
    quantity: <groupe 2 parsé en u32>,
}
```

**Exemples :**
```
Herboriste : +47 points d'XP.  Prochain niveau dans : 1 253.
Pêcheur : +120 points d'XP.  Prochain niveau dans : 5 800.
```

**Notes :** La regex est quasi-identique à `xp_combat` (pattern 2) — la différence est que `xp_combat` requiert le préfixe `[Information (combat)]` et est `MainOnly`, tandis que `profession_xp` est `Both` et sans préfixe. En `WakfuMain`, `xp_combat` (priorité 2) absorbe les XP combat avant que `profession_xp` (priorité 18) puisse les capter. En `WakfuChat`, seul `profession_xp` est actif — pas de risque de faux positif sur les XP combat.

---

### 19. `quest_completed`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `Both` (wakfu.log et wakfu_chat.log) |

**Regex :**
```
Vous avez r[ée]ussi la qu[êe]te (.+?)\.
```

**Description :** Détecte la complétion d'une quête.

**Groupes de capture :**

| # | Groupe | Signification |
|---|--------|---------------|
| 1 | `(.+?)` | Nom de la quête (capturé mais non utilisé dans l'event — variable `_quest`) |

**GameEvent produit :**
```
XpGained {
    amount: 0,               // XP de quête non parsé depuis cette ligne
    source: XpSource::Quest,
}
```

**Exemples :**
```
Vous avez réussi la quête Ninefi.
```

**Notes :** `r[ée]ussi` et `qu[êe]te` gèrent les variantes avec/sans accent (selon version du client ou encodage). Le nom de la quête est capturé mais ignoré (`_quest`) — `amount: 0` car le gain d'XP réel est sur une ligne séparée (capturée par `xp_combat` ou `profession_xp`).

---

### 20. `quest_failed`

| Champ | Valeur |
|-------|--------|
| **Version** | 1.0 |
| **Source** | `Both` (wakfu.log et wakfu_chat.log) |

**Regex :**
```
Qu[êe]te [ée]chou[ée]e:\s*"(.+?)"
```

**Description :** Reconnaît l'échec d'une quête pour éviter une ligne `Unrecognized`. N'émet aucun événement.

**Groupes de capture :**

| # | Groupe | Signification |
|---|--------|---------------|
| 1 | `(.+?)` | Nom de la quête entre guillemets (capturé mais ignoré — variable `_quest`) |

**GameEvent produit :** **Aucun** — la fonction `extract` retourne `None`.

> Ce pattern est le seul du registre à retourner `None` volontairement. La ligne est reconnue (pas de `Unrecognized`) mais aucun événement n'est émis vers le FSM ou la DB.

**Exemples :**
```
Quête échouée: "Compétitif : Stop Chef"
Quête échouée: "Course : Gligli Mania"
Quête échouée: "Solo : Épurage des Champs"
```

**Notes :** `Qu[êe]te [ée]chou[ée]e` gère toutes les variantes d'accentuation. Le nom de la quête est entre guillemets doubles `"..."`. Ce pattern est exclu du test `all_patterns_extract_from_examples` via `skip_none = ["quest_failed"]`.

---

## Récapitulatif

| # | Nom | Source | GameEvent produit | Groupes capturés |
|---|-----|--------|-------------------|------------------|
| 1 | `fighter_join` | MainOnly | `CombatStarted { monster_group: Some(...) }` | 5 |
| 2 | `xp_combat` | MainOnly | `XpGained { source: Combat }` | 3 |
| 3 | `spell_cast` | MainOnly | `DamageDealt { element: "caster:sort" }` | 2 |
| 4 | `damage` | MainOnly | `DamageDealt` ou `DamageReceived` | 3 |
| 5 | `ko` | MainOnly | `DamageReceived { source: "KO:name" }` | 1 |
| 6 | `combat_start` | MainOnly | `CombatStarted { monster_group: None }` | 0 |
| 7 | `combat_end` | MainOnly | `CombatEnded { victory: true }` | 1 |
| 8 | `server_connect` | MainOnly | `ServerConnected { server }` | 1 |
| 9 | `frame_world` | MainOnly | `CharacterSelected { name: "", server: "" }` | 0 |
| 10 | `disconnect_logoff` | MainOnly | `Disconnected { reason: "LogOff" }` | 0 |
| 11 | `disconnect_quit` | MainOnly | `Disconnected { reason: "Quit" }` | 0 |
| 12 | `connection_lost` | MainOnly | `Disconnected { reason: "ConnectionLost" }` | 0 |
| 13 | `kamas_gained` | Both | `KamasGained { source: Unknown }` | 1 |
| 14 | `kamas_spent` | Both | `KamasSpent { source: Unknown }` | 1 |
| 15 | `hdv_sold_offline` | Both | `KamasGained { source: Hdv }` | 2 |
| 16 | `item_gained` | Both | `HarvestCompleted { profession: "" }` | 2 |
| 17 | `item_lost` | Both | `HarvestCompleted { resource: "-nom" }` | 2 |
| 18 | `profession_xp` | Both | `HarvestCompleted { resource: "xp:métier" }` | 3 |
| 19 | `quest_completed` | Both | `XpGained { amount: 0, source: Quest }` | 1 |
| 20 | `quest_failed` | Both | **(aucun — retourne None)** | 1 |

**Total : 20 patterns documentés.**

---

## Limites et trous identifiés

1. **Noms de personnages non capturés** : `fighter_join` identifie les combattants mais le nom du personnage actif n'est jamais extrait directement — dépend du FSM.
2. **Victoire/défaite** : `combat_end` émet toujours `victory: true` — le FSM doit corriger.
3. **Source kamas** : `kamas_gained` et `kamas_spent` émettent `KamasSource::Unknown` — aucune distinction combat/trade/craft par le parser seul.
4. **XP quête non chiffré** : `quest_completed` émet `amount: 0` — le gain réel est sur une autre ligne.
5. **Métier absent de `item_gained`** : `profession: ""` — impossible de savoir quel métier a produit la récolte depuis ce seul message.
6. **Dommages et soins mélangés** : `damage` utilise `DamageDealt` pour les dégâts et `DamageReceived` pour les soins — sémantique inversée pour les soins.
7. **`spell_cast` non lié aux dégâts** : lancer de sort et dégâts sont deux événements distincts — impossible d'associer un sort à ses dégâts sans état externe.
8. **ChatOnly non utilisé** : `PatternSource::ChatOnly` est défini mais aucun pattern du registre ne l'utilise actuellement.
