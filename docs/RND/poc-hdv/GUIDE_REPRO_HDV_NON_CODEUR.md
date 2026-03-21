# Guide Non-Codeur: Capturer, Stocker et Lire le HDV dans VS Code

Ce guide explique exactement comment reproduire le pipeline HDV de bout en bout, sans connaissances techniques avancees.

Objectif:
- Capturer les donnees HDV depuis Wakfu.
- Les stocker dans une base SQLite persistante.
- Les lire en clair facilement dans VS Code.
- Sortir rapidement des opportunites achat > vente.

---

## 1) Ce que fait le systeme (version simple)

1. Un agent Java intercepte les messages reseau HDV quand tu utilises l'hotel des ventes en jeu.
2. Les trames sont enregistrees dans `logs/market_v3_proto.log`.
3. Un script decode les trames et extrait les offres de vente et d'achat.
4. Un script sync en base SQLite dans `logs/hdv_market.db`.
5. Un script exporte des fichiers lisibles en clair:
   - `logs/market_latest_preview.csv`
   - `logs/market_latest_preview.md`

---

## 2) Prerequis (une seule fois)

Tu as besoin de:
- Windows
- Wakfu + Ankama Launcher
- Java (pour l'agent)
- sqlite3 dans le PATH (deja present sur ta machine)
- Le projet ouvert dans VS Code: `H:\Code\Wakfuassistant`

Verification rapide (optionnelle):

```powershell
sqlite3 --version
```

Si une version s'affiche, c'est bon.

---

## 3) Procedure complete pour regenerer les donnees

### Etape A - Lancer la capture HDV

1. Ouvre ce fichier batch:
   - `docs/RND/poc-hdv/agent/launch_hdv_v2.bat`
2. Suis les instructions affichees dans la fenetre:
   - Fermer Wakfu + Ankama Launcher
   - Relancer via le batch
   - Ouvrir Wakfu
   - Ouvrir le HDV en jeu
   - Faire defiler/rechercher les pages que tu veux capturer

Important:
- Plus tu fais defiler de pages, plus la base est complete.
- Sans scroll, la base ne contient que ce qui a ete vu en jeu.

### Etape B - Verification des logs

Apres capture, ces fichiers doivent exister:
- `logs/market_v3.log`
- `logs/market_v3_proto.log`

Si `market_v3_proto.log` est vide ou absent, il n'y a rien a decoder.

### Etape C - Sync vers la base SQLite

Commande (depuis la racine du projet):

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File "docs\RND\poc-hdv\sync_hdv_to_sqlite.ps1"
```

Resultat attendu:
- La base `logs/hdv_market.db` est creee/mise a jour.
- Dedoublonnage automatique via hash.
- Mise a jour de la table `market_latest` (etat courant des offres).

### Etape D - Export lisible en clair

Commande:

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File "docs\RND\poc-hdv\export_hdv_readable.ps1"
```

Fichiers generes:
- `logs/market_latest_preview.csv` (grand volume, ideal filtres)
- `logs/market_latest_preview.md` (lecture rapide dans VS Code)

---

## 4) Lire les donnees facilement dans VS Code

### Methode recommandee (la plus stable)

Ouvrir directement:
- `logs/market_latest_preview.md`
- `logs/market_latest_preview.csv`

Ces fichiers sont deja en clair, pas de plugin obligatoire.

### Si tu veux absolument lire la base SQLite directement

Le plugin SQLite installe peut echouer (erreur parse SQL sur `"table"`).
Ce n'est pas la base qui est corrompue: c'est un bug de l'extension.

Contournements:
1. Utiliser les exports CSV/MD (recommande).
2. Installer une autre extension SQLite (ex: SQLite Viewer) puis `Open With...`.
3. Lire via sqlite3 en terminal.

---

## 5) Comment chercher les opportunites achat > vente

Tu peux interroger la base en SQL avec cette commande (depuis la racine):

```powershell
sqlite3 "logs/hdv_market.db" -cmd ".headers on" -cmd ".mode column" "
WITH sell_min AS (
  SELECT item_ref_id, MIN(unit_price) AS min_sell
  FROM market_latest
  WHERE side='sell'
  GROUP BY item_ref_id
),
buy_max AS (
  SELECT item_ref_id, MAX(unit_price) AS max_buy
  FROM market_latest
  WHERE side='buy'
  GROUP BY item_ref_id
)
SELECT b.item_ref_id,
       b.max_buy,
       s.min_sell,
       (b.max_buy - s.min_sell) AS delta
FROM buy_max b
JOIN sell_min s ON s.item_ref_id = b.item_ref_id
WHERE b.max_buy > s.min_sell
ORDER BY delta DESC
LIMIT 100;
"
```

Interpretation:
- `delta > 0` signifie qu'il existe potentiellement un arbitrage.
- Plus `delta` est grand, plus l'ecart achat/vente est interessant.

---

## 6) Commandes prêtes a copier (resume)

Depuis `H:\Code\Wakfuassistant`:

1. Sync base:

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File "docs\RND\poc-hdv\sync_hdv_to_sqlite.ps1"
```

2. Export lisible:

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File "docs\RND\poc-hdv\export_hdv_readable.ps1"
```

3. Ouvrir les resultats:
- `logs/market_latest_preview.md`
- `logs/market_latest_preview.csv`

---

## 7) Depannage (checklist)

### Probleme: rien n'apparait en base

Verifier:
1. Tu as bien ouvert le HDV en jeu.
2. Tu as bien navigue/scroll des pages.
3. `logs/market_v3_proto.log` contient des lignes recentes.
4. Tu as relance la sync apres la session HDV.

### Probleme: le fichier `.db` est illisible dans l'editeur

Normal: un fichier SQLite est binaire.
Utiliser:
- les exports lisibles (`.md` / `.csv`),
- ou un viewer SQLite compatible.

### Probleme: erreur extension SQLite sur `"table"`

Cause probable: bug extension VS Code SQLite.
Solution immediate: utiliser le workflow export lisible.

---

## 8) Fichiers importants et role

- `docs/RND/poc-hdv/agent/launch_hdv_v2.bat`
  Lance le jeu avec l'agent d'interception et enchaine decode/sync.

- `docs/RND/poc-hdv/decode_market_v3_prices.ps1`
  Decode les trames HDV et extrait des infos prix.

- `docs/RND/poc-hdv/sync_hdv_to_sqlite.ps1`
  Parse ventes + achats et alimente `logs/hdv_market.db`.

- `docs/RND/poc-hdv/export_hdv_readable.ps1`
  Exporte en clair vers CSV/Markdown pour lecture facile.

- `logs/hdv_market.db`
  Base SQLite persistante (source de verite des analyses).

---

## 9) Rythme conseille d'utilisation

Apres chaque grosse session HDV:
1. Lancer capture (batch)
2. Lancer sync
3. Lancer export lisible
4. Lire les resultats dans `logs/market_latest_preview.csv`
5. Lancer la requete arbitrage si besoin

Ce cycle garantit une base a jour et une lecture simple pour un usage quotidien non-codeur.