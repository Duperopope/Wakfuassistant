# Wakfu Assistant — Onglet Personnage : Worklog (2026-03-18)

## Contexte

Deux correctifs sur l'onglet Personnage : un bug de niveau incorrect, et le remplacement de la métrique "Combats / Niv" par "Temps joué" avec la même logique d'ancrage que XP et Kamas.

---

## Session 1 — Fix niveau incorrect dans l'onglet Personnage

### Problème signalé

Le niveau affiché dans l'onglet Personnage ne correspondait pas au vrai niveau du personnage. La calibration XP (widget "Données") indiquait correctement niveau **181**, mais l'onglet affichait une valeur erronée (niveau **5**).

### Diagnostic

Inspection de `data/config.json` :

```json
"xp_calibration": { "level": 181, ... },
"known_character_vitals": {
  "L'Immortel": { "level": 5, ... }
}
```

Deux sources de vérité contradictoires. Le flux de données au démarrage :

1. `_restore_character_vitals()` lit `known_character_vitals["level"]` → 5
2. `replay_character_xp_since()` ne renvoie un level que depuis les events `level_up` (pas présents ici) → ne corrige pas
3. `query_character_info()` idem — fallback seulement si `_last_level is None`, mais il vaut déjà 5

### Root cause

`_process_interface_payload()` acceptait n'importe quelle valeur `"level"` reçue du feed Lua, **même inférieure** au niveau déjà connu, et l'écrasait dans `known_character_vitals`. Le feed Lua peut envoyer un niveau de 5 (entité non-joueur, état transitoire, ou donnée corrompue) qui écrase la calibration correcte.

Le niveau ne peut pas régresser dans Wakfu — cette contrainte n'était pas vérifiée.

### Fixes

**`ui/window.py` — `_process_interface_payload()`** : garde uniquement les valeurs `> 0` et `>= niveau actuel`.

```python
# Avant
if level_value is not None and level_value != self._last_level:
    self._last_level = level_value

# Après
if level_value is not None and level_value > 0 and level_value != self._last_level:
    if level_value >= (self._last_level or 0):  # jamais en arrière
        self._last_level = level_value
```

**`ui/window.py` — `_restore_character_vitals()`** : la calibration XP est la source la plus fiable pour le niveau — on en prend le maximum.

```python
try:
    cfg = self._read_config_json()
    calib_level = int(cfg.get("xp_calibration", {}).get("level", 0) or 0)
    if calib_level > (self._last_level or 0):
        self._last_level = calib_level
except Exception:
    pass
```

---

## Session 2 — Remplacement de "Combats / Niv" par "Temps joué"

### Problème signalé

La métrique "⚔ COMBATS / NIV" dans la card XP de l'onglet Personnage était jugée non pertinente. Elle devait être remplacée par le **temps joué sur ce personnage**, avec la même logique d'ancrage que XP et Kamas : une vérité connue + delta écoulé depuis.

### Source de données

Le jeu loggue la commande `/played` sous forme :

```
[Information (jeu)] Vous avez joué 15 jours 14 heures 19 minutes 13 secondes sur ce personnage.
```

Ces événements sont déjà capturés dans `all_events.jsonl` sous le type `"played"` avec `data.raw`.

### Architecture retenue (même logique qu'XP)

```
Ancre temps joué = dernière entrée "played" dans le journal
  → seconds_au_moment_de_l'ancre + Δt_réel_depuis_l'ancre
  → mise à jour immédiate si nouvelle ligne "/played" détectée en live
```

Deux variables dans `OverlayWindow` :
- `_played_seconds_anchor` : secondes totales jouées au moment de l'ancre
- `_played_anchor_ts` : `QDateTime` du moment où l'ancre a été posée

### Problématiques rencontrées

**1. Pas de champ "personnage" dans les events `played`**

Contrairement aux events `xp_combat`, les entries `played` ne portent pas de nom de personnage. On ne peut donc pas filtrer par personnage si plusieurs persos jouent. Limitation acceptée : l'assistant est mono-personnage en pratique.

**2. Offset de temps entre l'ancre et le démarrage**

La dernière entrée `played` peut dater de plusieurs heures. Il faut calculer le delta entre `ts_local` de l'entry et `now`, et l'ajouter aux secondes de base — sans quoi le temps joué serait toujours "figé" à la valeur du dernier `/played`.

```python
elapsed_since_anchor = max(0, int((now_utc - anchor_utc).total_seconds()))
self._played_seconds_anchor = secs + elapsed_since_anchor
```

**3. Parsing du format texte**

La chaîne `"15 jours 14 heures 19 minutes 13 secondes sur ce personnage."` est entièrement en langue française avec pluriels variables. Résolu avec des regex par mot-clé (`jour`, `heure`, `minute`, `seconde`) insensibles à la casse et indépendants de l'ordre.

### Fichiers modifiés

**`core/permanent_journal.py`** :
- `_parse_played_seconds(raw)` — parse la chaîne FR → secondes totales
- `query_played_time()` — retourne la dernière entry `played` avec son timestamp

**`ui/window.py`** :
- Import de `query_played_time`
- `_PLAYED_LOG_RE` — regex de détection temps-réel dans les lignes de log
- Init de `_played_seconds_anchor` et `_played_anchor_ts` dans `__init__`
- `_restore_character_vitals()` — chargement de l'ancre au démarrage
- Boucle de parsing — mise à jour immédiate si nouvelle ligne `/played` détectée
- Tick timer — calcul `ancre + Δt` envoyé à `set_played_time()`
- Suppression de la logique "combats / niv"

**`ui/tabs/personnage.py`** :
- `_XPProgressCard` — troisième colonne redessinée : deux labels (`_played_main` en grand, `_played_sub` plus petit), sans emoji dans le titre
- `set_played_time(total_seconds)` — formate selon la durée :
  - `> 1 jour` → `"X jour(s)"` + sous-texte `"Yh Zm"`
  - `< 1 jour` → `"Xh Ym"` seul
  - `< 1 heure` → `"X min"` seul
- `set_combats_to_level()` supprimée

### Rendu final

```
┌──────────────┬───────────────┬──────────────┐
│     —        │      —        │  14 jours    │
│              │               │   7h 38m     │
│  XP / HEURE  │ TEMPS RESTANT │  TEMPS JOUÉ  │
└──────────────┴───────────────┴──────────────┘
```
