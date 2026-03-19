# Modules — Documentation Detaillee

Genere : 2026-03-19

---

## core/permanent_journal.py

### Role

Source de verite unique pour tous les evenements de jeu. Parse les logs Wakfu et produit un journal
permanent en JSONL. Ce journal alimente tous les onglets de l'overlay.

### Chemins

```python
_PROJECT_ROOT / "logs" / "permanent" / "all_events.jsonl"   # Journal (UTF-8)
_PROJECT_ROOT / "logs" / "permanent" / "all_events.log"     # Lisible (UTF-8)
_PROJECT_ROOT / "logs" / "permanent" / "recorder_state.json" # Position de sync
```

### Types d'evenements

| Type | Data | Source |
|------|------|--------|
| kamas_gain | amount | Log jeu |
| kamas_loss | amount | Log jeu |
| spell_cast | character, spell | Log jeu |
| xp_combat | character, xp, xp_to_next | Log jeu |
| xp_profession | profession, xp, xp_to_next | Log jeu |
| level_up | character, level | Log jeu |
| whois | character, account, server | /whois |
| breed | character, breed_id | Log combat |
| location | x, y, z, instance | Log jeu |
| ping | ms | Log jeu |
| played | raw | Log jeu |
| item_gained | qty, item | Log jeu |
| item_lost | qty, item | Log jeu |
| market_sold | quantity, total | Log jeu |
| market_sold_item | item, price | Log jeu |
| market_deposit | item, qty, tax | Detection automatique |
| quest_complete / quest_fail | name | Log jeu |
| login / logout | - | Log jeu |
| death / ko | character | Log combat |
| hp_loss | character, amount | Log combat |
| chat | channel, author, message | Log chat |

### Fonctions principales

#### sync_permanent_journal() -> dict
Appende les nouveaux evenements depuis les logs Wakfu live. Retourne `{"all": N}`.
Si le journal n'existe pas ou la version a change, declenche un rebuild complet.

#### rebuild_all_events() -> dict
Reconstruit entierement all_events.jsonl depuis zero :
1. Migration kamas_events.jsonl legacy
2. Migration chat_events.log et journal_events.log legacy
3. Absorption archives et realtime
4. Lecture complete depuis APPDATA

#### read_permanent_kamas_events() -> list[dict]
Itere les evenements kamas_gain/loss, deduplique par fingerprint, retourne `[{dt, kind, amount}]`.

#### read_permanent_market_deposits() -> list[dict]
Itere les market_deposit, retourne `[{dt, ts_client, item, qty, tax}]`.

#### estimate_market_price(tax, qty, days=28, territory_pct=5) -> (min, max)
Estime le prix unitaire d'apres la taxe de depot marche.
```python
# Formule : taxe = round(prix * qty * taux)
# Taux effectif = territory_pct * (days / 28)
```

#### query_combat_stats(char_name=None) -> dict
Single-pass scan de all_events.jsonl. Retourne :
```python
{
    "spell_counts": {spell: count},
    "killed_by": {monstre: count},
    "damage_by": {monstre: total},
    "xp_events": [{ts, xp, xp_to_next}],
    "turn_combos": [{spells, count, ts}],
    "best_xp_sessions": [{total_xp, duration_s, xph, ts, count}],
}
```

---

## core/wakfu_tracker.py

### Role

Surveillance de la fenetre Wakfu via Win32 API. Polling 200ms, emet des signaux Qt
pour les changements d'etat.

### Signaux

```python
found(hwnd: int)              # Fenetre detectee
lost()                         # Fenetre perdue
geometry_changed(x: int, y: int, w: int, h: int)  # Deplacement/redim
minimized()                   # Wakfu reduit
restored()                    # Wakfu restaure
focus_changed(has_focus: bool) # Premier plan
character_changed(name: str)   # Nom personnage ("" = deconnecte)
```

### GameState

```python
class GameState(Enum):
    OFFLINE       = "offline"
    SERVER_SELECT = "server_select"
    CHAR_SELECT   = "char_select"
    SELECTING     = "selecting"  # Fenetre ouverte
    IN_GAME       = "in_game"
```

### Detection personnage

Regex sur le titre de fenetre : `(.+) - Wakfu$` extrait le nom du personnage.
- Si le titre ne correspond pas : ecran de selection (character = "")

---

## core/game_database.py

### Role

Base de donnees locale JSON pour les items, prix et professions.

### Structure

```json
{
  "items": {
    "Nom de l'item": {
      "qty_override": 10,
      "ah_price": 50000
    }
  },
  "professions": {
    "Bucheron": {"level": 30, "xp": 15000}
  },
  "recipes": {}
}
```

### Thread-safe

Les ecritures sont protegees par un `Lock()`. Les lectures ne verrouillent pas.

---

## ui/window.py

### Responsabilites

1. **Positionnement** : L'overlay suit la fenetre Wakfu en position relative
2. **Navigation** : TabBar avec 7 onglets
3. **Sync** : Timer 1s qui synchronise les donnees
4. **Etats** : OFFLINE / SERVER_SELECT / CHAR_SELECT / IN_GAME

### Position relative

```python
# L'overlay maintient des ratios par rapport a la taille de Wakfu
_relative_offset_ratio = (rx, ry)  # Offset en fraction de la taille Wakfu
_relative_size_ratio = (rw, rh)    # Taille en fraction de la taille Wakfu
```

### Sync

- `_CLASS_SYNC_MS = 500` : Polling du log Wakfu (classe personnage)
- `_tick()` toutes les 1s : sync journal, interface feed, personnage

---

## ui/tabs/transactions.py

### Role

Affiche l'historique des transactions kamas avec le solde courant calcule.

### Solde courant

```
solde = base_kamas + corrections_manuelles + delta_depuis_base
```

- `base_kamas` : Valeur initiale配置 (calibration)
- `corrections_manuelles` : Ajustements utilisateur (data/kamas_journal.jsonl)
- `delta_depuis_base` : Somme de tous les evenements kamas depuis la base

### Depots marche

Quand une perte kamas coincide avec un depot marche (item_lost + kamas_loss a la meme seconde),
le montant est identifie comme taxe de depot et n'est pas inclus dans le solde net.
Les depots enrichissent les libelles de transaction avec le prix estime.

---

## ui/tabs/hdv.py

### Estimation de prix

```python
estimate_market_price(tax, qty, days=28, territory_pct=5)
```

- `tax` : Montant de la taxe de depot
- `qty` : Quantite d'items deposes
- `days` : Duree du depot (28 = taux plein, 14 = 50%, 7 = 33%)
- `territory_pct` : Taux du territoire (5% par defaut)

Formule :
```
taux_effectif = territory_pct * (days / 28) / 100
prix_unitaire = tax / (qty * taux_effectif)
```

Fourchette retournee : prix_min <= prix_reel < prix_max (arrondi vers le haut)

---

## health_check.py

### Verification

1. Python >= 3.10
2. Imports PyQt5 et win32gui
3. Dossiers data/ et core/
4. data/config.json valide (JSON UTF-8)
5. Journal permanent des evenements (optionnel)
6. Aucune erreur de syntaxe Python

### Encodage

Force UTF-8 sur stdout pour eviter les problemes d'accent sur console Windows.
