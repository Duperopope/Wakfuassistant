# Wakfu Assistant

Overlay gaming temps réel pour le MMORPG **Wakfu** (Windows). Se greffe sur la fenêtre du jeu et intercepte les données réseau en temps réel pour afficher des statistiques de session, le marché HDV, la rentabilité des crafts et plus.

## Stack

| Couche | Technologie |
|---|---|
| Backend | Rust (Tauri v2) |
| Frontend | SolidJS + TypeScript + TailwindCSS |
| Overlay | Win32 dual-window, transparent, click-through |
| Base locale | SQLite (rusqlite, mode WAL) |
| Capture réseau | Java ByteBuddy agent (interception Netty) |
| Distribution | Installeur NSIS (~5-10 MB) |

## Fonctionnalités

| Onglet | Contenu | Statut |
|---|---|---|
| **Personnage** | Niveau, XP, kamas, temps joué, taux XP/h | En cours |
| **Combat** | Stats combat temps réel, sorts, dégâts | En cours |
| **Métiers** | XP et progression par métier | En cours |
| **Inventaire** | Suivi net des objets gagnés/perdus | En cours |
| **Économie** | Transactions, historique kamas, HDV, rentabilité crafts | En cours |
| **Options** | Thème, opacité, calibration | Valide |

## POCs validés

| POC | Résultat |
|---|---|
| Capture HDV | 82 918 offres, protobuf décodé, SQLite OK |
| Pipeline logs | 20 patterns regex, FSM, GameEvent |
| Protocole réseau | 85 types de messages, 3 handlers identifiés |
| Sérialisation items | Format binaire 100% décodé (uy_1, yd_2, yf_1, ye_2) |
| Enchantements HDV | Mapping complet sublimations/gems via hook cmy.dn() |

## Développement

### Prérequis

- [Rust](https://rustup.rs/) (1.77+)
- [Node.js](https://nodejs.org/) (20+)
- [Tauri v2 prerequisites](https://v2.tauri.app/start/prerequisites/)
- Java 11+ (pour l'agent ByteBuddy)

### Lancer en mode dev

```bash
npm install
npm run tauri dev
```

### Build

```bash
npm run tauri build
```

## Documentation

Voir [docs/INDEX.md](docs/INDEX.md) — point d'entrée unique, 16 chapitres R&D + références.

## Historique

La v1 (Python/PyQt5) est archivée sous le tag `v1.0-final`. La v2 repart sur des fondations Rust/Tauri pour des performances, une testabilité, et une distribuabilité radicalement meilleures.
