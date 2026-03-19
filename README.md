# Wakfu Overlay v2

Overlay gaming temps réel pour le MMORPG **Wakfu** (Windows). Se greffe sur la fenêtre du jeu et lit les logs en temps réel pour afficher des statistiques de session.

## Stack

- **Backend** : Rust (Tauri v2)
- **Frontend** : SolidJS + TypeScript + TailwindCSS
- **Base locale** : SQLite (rusqlite, mode WAL)
- **Distribution** : Installeur NSIS (~5-10 MB)

## Fonctionnalités (cibles)

| Onglet | Contenu |
|---|---|
| **Personnage** | Niveau, XP, kamas, temps joué, taux XP/h |
| **Combat** | Stats combat temps réel, sorts, dégâts |
| **Métiers** | XP et progression par métier |
| **Inventaire** | Suivi net des objets gagnés/perdus |
| **Économie** | Transactions, historique kamas, HDV |
| **Options** | Thème, opacité, calibration |

## Développement

### Prérequis

- [Rust](https://rustup.rs/) (1.77+)
- [Node.js](https://nodejs.org/) (20+)
- [Tauri v2 prerequisites](https://v2.tauri.app/start/prerequisites/)

### Lancer en mode dev

```bash
npm install
npm run tauri dev
```

### Build

```bash
npm run tauri build
```

## Architecture

Voir [docs/ARCHITECTURE.md](docs/ARCHITECTURE.md) pour la documentation technique complète.

## Historique

La v1 (Python/PyQt5) est archivée sous le tag `v1.0-final`. La v2 repart sur des fondations Rust/Tauri pour des performances, une testabilité, et une distribuabilité radicalement meilleures.
