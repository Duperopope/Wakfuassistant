# 6 — Commandes /sync in-game

## Principe

Le joueur tape une commande `/sync...` dans le chat Wakfu. Le jeu ne la reconnaît pas et
affiche « Commande inconnue » dans les logs. Le script capte cette ligne et extrait la donnée.

**Pattern capté** :
```
[Messages d'erreur] Commande inconnue : /sync<categorie><cle><valeur>
```

Regex : `(?i)Commande inconnue\s*:\s*/sync(characterxptarget|characterxpcurrent|characterxplvl|itemprice|item|job)(.+?)(\d+)\s*$`

**Important** : les alternatives sont triées du plus long au plus court pour éviter les faux
matchs (ex : `itemprice` doit être testé avant `item`, sinon `/syncitemprice...` serait
capté comme category=item avec key=price...).

**Règle** : la clé est normalisée (minuscules, sans accents/espaces/apostrophes) pour le
matching en DB. La valeur est toujours un entier positif en fin de commande.

---

## Commandes par catégorie

### Inventaire

| Commande | Effet | Exemple |
|----------|-------|---------|
| `/syncitem<nom><nb>` | Calibre le nombre réel d'un objet en inventaire | `/syncitempoilsdepandissidan707` |
| `/syncitemprice<nom><prix>` | Définit le prix unitaire (kamas) d'un objet | `/syncitempricepoilsdepandissidan60` |

- **`/syncitem`** : passe l'item en mode « calibré » (source=chat). L'affichage bascule de `+N enr.` à `#N`. Les ramassés/perdus suivants incrémentent/décrémentent à partir de cette valeur.
- **`/syncitemprice`** : enregistre un prix manuel dans `item_prices` (direction=manual). Utilisé quand le prix n'a pas été auto-détecté via HDV.

### Métiers

| Commande | Effet | Exemple |
|----------|-------|---------|
| `/syncjob<metier><niv>` | Corrige le niveau d'un métier | `/syncjobarmurier76` |

- Le nom du métier est normalisé et cherché dans le lookup (aliases inclus : `herbo`, `mda`, `maro`, `ebeni`).
- Met à jour `job_levels` en DB + `jobState` en mémoire.

**Métiers reconnus** (14) :

| Récolte (6) | Craft (8) |
|-------------|-----------|
| Herboriste | Armurier |
| Forestier | Bijoutier |
| Mineur | Boulanger |
| Paysan | Cuisinier |
| Pêcheur | Ébéniste |
| Trappeur | Maître d'Armes |
|  | Maroquinier |
|  | Tailleur |

**Aliases** : `herbo` → Herboriste, `mda` → Maître d'Armes, `maro` → Maroquinier, `ebeni` → Ébéniste

### Personnage

| Commande | Effet | Exemple |
|----------|-------|---------|
| `/synccharacterxplvl<perso><niv>` | Définit le niveau du personnage | `/synccharacterxplvll'immortel189` |
| `/synccharacterxpcurrent<perso><xp>` | XP gagnée sur le niveau actuel | `/synccharacterxpcurrentl'immortel773445465` |
| `/synccharacterxptarget<perso><xp>` | XP totale requise pour finir le niveau | `/synccharacterxptargetl'immortel1796721311` |

- Le nom du personnage est normalisé pour la clé DB mais le display original est conservé.
- Ces données sont stockées dans `sync_data` et utilisables par tous les scripts.

### Cartographie

| Commande | Effet |
|----------|-------|
| `/positionsync:<champs>` | Enregistre les informations de la map/région courante |

Format des champs (séparés par `,`, espaces remplacés par `%%`) :

```
/positionsync:Map[FR]:Sufokia,Map[EN]:unknown,Region:Dune%%Kane,Leadername:Hugo%%Surlo,Maplvl:51-125,RegionLVL:51-65,Joblvl:Forestier35,Herboriste35,Paysan30-35
```

| Champ | Valeur possible | Description |
|-------|-----------------|-------------|
| `Map[FR]:Nom` | texte | Nom de la carte en français |
| `Map[EN]:Nom` | texte ou `unknown` | Nom de la carte en anglais |
| `NoRegion` | — | La carte n'a pas de régions |
| `Region:Nom` | texte (espaces → `%%`) | Nom de la région courante |
| `Leadername:Nom` | texte ou `None` | Leader de la région |
| `Maplvl:X-Y` | entiers | Niveau des monstres de la carte |
| `RegionLVL:X-Y` ou `None` | entiers | Niveau des monstres dans la région |
| `Joblvl:Metier35,...` | liste ou `None` | Niveau métier requis (récolte) |

- Le `worldId` est lu automatiquement depuis l'état du background watcher.
- Stocké dans `map_locations` (clé : `world_id + region_name`).
- Met à jour le nom de la map en mémoire → `>> Localisation` affiche le nom FR dès la sync.

---

## Auto-détection (pas de commande nécessaire)

Ces données sont captées automatiquement depuis les logs, sans intervention du joueur :

### XP métier
```
[Information (jeu)] Trappeur : +261 points d'XP. Prochain niveau dans : 17 459.
```
→ Stocké dans `xp_events` (entity_type=job). Level-up auto-détecté, met à jour `job_levels`.

### XP personnage
```
[Information (combat)] L'Immortel : +25 451 667 points d'XP. Prochain niveau dans : 773 445 465.
```
→ Stocké dans `xp_events` (entity_type=character). Si accompagné d'un ramassé dans la même seconde = récompense de quête (journalière ou environnementale).

### Items ramassés
```
[Information (jeu)] Vous avez ramassé 2x Bois Sec .
```
→ Auto-tracké dans `sync_data` (category=item, source=auto). Si suivi d'une ligne XP récolte, l'item est associé au métier dans `job_resources`.

### Items perdus
```
[Information (jeu)] Vous avez perdu 1x Poils de Pandissidan .
```
→ Décrémenté dans `sync_data`. Corrélé avec kamas pour détecter HDV (voir ci-dessous).

### Kamas et HDV (auto-corrélation par timestamp)

| Séquence (même seconde) | Détection | Donnée extraite |
|--------------------------|-----------|-----------------|
| `perdu Nk` → `ramassé Mx Item` | **Achat HDV** | prix unitaire = N/M |
| `perdu 1x Item` → `gagné Nk` | **Vente (offre d'achat)** | prix unitaire = N |
| `perdu 1x Item` → `perdu Nk` | **Listing HDV** | taxe = N kamas |

→ Les prix sont stockés dans `item_prices` avec historique complet (direction, timestamp, personnage).

### Temps de jeu
```
[Information (jeu)] Vous avez joué 16 jours 13 heures 7 minutes 33 secondes sur ce personnage.
```
→ Stocké dans `sync_data` (category=playtime, source=log).

### Capt'chat (antibot)
Détecté dans `wakfu.log` (pas wakfu_chat.log) via pattern `(?i)Capt.chat` en background job.
→ Stocké dans `captchat_events` avec le nombre de récoltes au moment de l'apparition.

---

## Stockage

Toutes les données convergent vers `wakfu_permanent.db` (SQLite, WAL mode).

| Table | Rôle |
|-------|------|
| `sync_data` | Données synchronisées (items, niveaux, playtime) — clé: server+category+key |
| `xp_events` | Tous les gains XP (métier + perso) — permanent, dédupliqué |
| `job_levels` | Dernier niveau connu par métier — mis à jour à chaque level-up |
| `character_levels` | Dernier niveau connu par personnage |
| `job_resources` | Association item→métier auto-apprise |
| `item_prices` | Historique des prix observés (HDV + manuel) |
| `xp_curve_observed` | Courbe XP observée à chaque level-up |
| `captchat_events` | Apparitions Capt'chat avec contexte |
| `map_locations` | Cartographie des maps et régions (worldId, niveaux, métiers) |
