# Wakfu Weights API

Serveur d'analyse des poids d'equipement des joueurs Wakfu.
Expose des endpoints JSON reutilisables + une interface web de consultation.

## Demarrage

```bash
python tools/weights_api.py                    # port 8042 par defaut
python tools/weights_api.py --port 9000        # port custom
python tools/weights_api.py --host 0.0.0.0     # accessible sur le reseau local
```

Le serveur charge `rnd/data/cdn_items.json` (8324 items) et `logs/players/*.json`
(~1000 joueurs) au demarrage, puis calcule les poids normalises de chaque joueur.

## URLs

| URL | Description |
|-----|-------------|
| `http://localhost:8042/` | Interface web (HTML) |
| `http://localhost:8042/docs` | Swagger UI (FastAPI auto-generated) |
| `http://localhost:8042/api/docs` | Documentation JSON des endpoints |

## Endpoints API

### `GET /api/players`

Liste paginee des joueurs, triee et filtrable.

**Parametres query :**

| Param | Type | Defaut | Description |
|-------|------|--------|-------------|
| `sort` | string | `poids_offensif` | Champ de tri. Valeurs: `poids_offensif`, `poids_defensif`, `level`, `name`, `total_pv`, `total_res`, `pa`, `pm`, `coup_crit`, `tacle`, `esquive` |
| `order` | string | `desc` | Ordre de tri: `asc` ou `desc` |
| `breed` | string | _(tous)_ | Filtrer par classe (ex: `Sram`, `Iop`) |
| `guild` | string | _(tous)_ | Filtrer par nom de guilde (recherche partielle) |
| `min_level` | int | `0` | Niveau minimum |
| `max_level` | int | `999` | Niveau maximum |
| `limit` | int | `100` | Resultats par page (max 1000) |
| `offset` | int | `0` | Decalage pour pagination |

**Exemple :**
```
GET /api/players?breed=Sram&min_level=200&sort=poids_offensif&limit=10
```

**Reponse :**
```json
{
  "total": 42,
  "offset": 0,
  "limit": 10,
  "players": [
    {
      "rank": 1,
      "name": "Oni",
      "level": 245,
      "breedName": "Sram",
      "guild_name": "",
      "guild_id": 10239,
      "poids_offensif": 6695.9,
      "poids_defensif": 8330.0,
      "total_pv": 6799,
      "total_res": 1531,
      "pa": 7, "pm": 1, "po": 0, "pw": 0,
      "tacle": 382, "esquive": 310, "initiative": 0,
      "coup_crit": 40,
      "nb_items": 13,
      "top_item_name": "Amulette Ruanée"
    }
  ]
}
```

---

### `GET /api/players/{name}`

Detail complet d'un joueur avec son equipement piece par piece.
Supporte la recherche partielle sur le nom.

**Exemple :**
```
GET /api/players/L'Immortel
GET /api/players/Oni
```

**Reponse :**
```json
{
  "rank": 413,
  "name": "L'Immortel",
  "level": 191,
  "breedName": "Sram",
  "guild_name": "Make Sufo Great Again",
  "poids_offensif": 1146.6,
  "poids_defensif": 2636.0,
  "total_pv": 1569,
  "total_res": 1067,
  "pa": 5, "pm": 1, "po": 0, "pw": 0,
  "equipment": [
    {
      "slot": 0,
      "slot_name": "Casque",
      "item_id": 22735,
      "name": "Masque de Wo Zwombbit",
      "level": 155,
      "rarity": 4,
      "poids_off": 186.5,
      "pv": 206,
      "res": 166,
      "pa": 0, "pm": 0
    }
  ]
}
```

---

### `GET /api/guilds`

Classement des guildes par stats moyennes.

| Param | Type | Defaut | Description |
|-------|------|--------|-------------|
| `sort` | string | `avg_poids_offensif` | `avg_poids_offensif`, `avg_poids_defensif`, `avg_level`, `nb_members`, `max_poids_offensif` |
| `order` | string | `desc` | `asc` ou `desc` |
| `min_members` | int | `1` | Nombre minimum de membres |
| `limit` | int | `50` | Nombre max de resultats |

---

### `GET /api/stats`

Statistiques globales : nombre de joueurs, guildes, moyennes, et stats par classe.

---

### `GET /api/classes`

Stats agregees par classe de personnage (count, moy. poids, max, top joueur).

---

### `GET /api/search?q=...`

Recherche joueurs et guildes par nom (minimum 2 caracteres).

**Reponse :**
```json
{
  "players": [ ... ],
  "guilds": [ ... ]
}
```

## Integration avec une autre application

L'API retourne du JSON standard. Pour connecter depuis une autre app :

```python
import requests

# Tous les Srams niv 200+
r = requests.get("http://localhost:8042/api/players", params={
    "breed": "Sram", "min_level": 200, "limit": 50
})
players = r.json()["players"]

# Detail d'un joueur
r = requests.get("http://localhost:8042/api/players/L'Immortel")
detail = r.json()
for item in detail["equipment"]:
    print(f"  {item['slot_name']}: {item['name']} (poids: {item['poids_off']})")
```

```javascript
// Depuis un frontend JS
const res = await fetch('/api/players?sort=level&order=desc&limit=20');
const { players, total } = await res.json();
```

```rust
// Depuis Tauri/Rust
let resp: serde_json::Value = reqwest::get("http://localhost:8042/api/stats")
    .await?.json().await?;
```

## Systeme de poids

Le poids offensif normalise utilise les constantes officielles Ankama
(Devblogs 1.81 + 1.88, confirmees dans le code decompile) :

| Type de Maitrise | Poids | Coeff. (250/poids) |
|------------------|-------|--------------------|
| Mono-element | 167 | x1.50 |
| Bi-element | 228 | x1.10 |
| Tri-element | 283 | x0.88 |
| Quad-element | 333 | x0.75 |
| Specialisee (seule) | 250 | x1.00 |
| Melee+Distance (cumul) | 200 | x1.25 |

Formule : `poids_normalise = valeur_stat * (250 / poids_du_type)`

## Dependances

- Python 3.10+
- FastAPI (`pip install fastapi`)
- Uvicorn (`pip install uvicorn`)
- Donnees : `rnd/data/cdn_items.json`, `logs/players/*.json`
