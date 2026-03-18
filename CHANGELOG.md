# Changelog

## [2026-03-18]

### Fix — Niveau incorrect dans l'onglet Personnage
Le feed Lua de l'interface pouvait envoyer un niveau erroné (ex. niveau 5 depuis une entité non-joueur) qui écrasait silencieusement la calibration XP. Deux protections ajoutées :
- Le niveau reçu du feed n'est accepté que s'il est supérieur ou égal au niveau déjà connu (un niveau ne régresse jamais dans Wakfu)
- Au chargement, `xp_calibration.level` est utilisé comme source prioritaire si supérieur à `known_character_vitals.level`

### Feat — Temps joué dans l'onglet Personnage
Remplace la métrique "Combats / Niv" (peu utile) par le **temps joué sur ce personnage**, avec la même logique d'ancrage que XP et Kamas :
- Source : events `/played` déjà capturés dans `all_events.jsonl` (`"15 jours 14 heures..."`)
- Au démarrage : chargement de la dernière entry `/played` + calcul du delta depuis ce moment
- En temps réel : détection immédiate de nouvelles lignes `/played` dans le log
- Affichage : jours en grand, h/min en sous-texte (ex. "14 jours" / "7h 38m")

→ Détail : [docs/personnage-worklog-2026-03-18.md](docs/personnage-worklog-2026-03-18.md)

---

## [2026-03-17]

### Feat — Source unique `all_events.jsonl`
Refonte complète du pipeline d'événements : remplacement des deux journaux parallèles (`kamas_events.jsonl` + scan AppData) par une source de vérité unique.
- `logs/permanent/all_events.jsonl` — tous les événements du jeu (kamas, XP, sorts, métiers, chat, items...)
- `logs/permanent/recorder_state.json` — positions de lecture, fingerprints de déduplication
- Migration automatique au premier démarrage : absorption des anciens journaux et archives
- Déduplication par fingerprint pour les sources qui se chevauchent

### Fix — Double-comptage kamas
La position de lecture (`perm_log_offset`) n'était pas sauvegardée correctement, causant la relecture des dernières lignes à chaque tick. Corrigé par fingerprint de déduplication par événement.

→ Détail : [docs/permanent-journal-worklog-2026-03-17.md](docs/permanent-journal-worklog-2026-03-17.md)

---

## [2026-03-16]

### Feat — Onglet Transactions et historique kamas
- Graphique interactif de l'historique kamas (mode escalier, zoom roue, tooltip)
- Table historique avec tri par colonne, persistance des largeurs, highlight au clic
- Chips métriques (Gains, Pertes, Net, Taxes, Kamas actuels) avec états indépendants et format court KK/MK
- Détection des dépôts HDV (`market_deposit`) dans le journal

### Fix — Performances overlay
- Resize : event filter global sur `QApplication` (pas de flickering vs `WM_NCHITTEST` natif)
- `WakfuTracker` : fast path `IsWindow()` au lieu de `EnumWindows` à chaque tick
- Colonnes transactions : throttle 16ms + `setUpdatesEnabled(False/True)` pour éviter un repaint par pixel
- `_apply_rounded_mask` : construction directe par primitives Qt (6 appels vs polygon ~60 points)

→ Détail : [docs/transactions-worklog-2026-03-16.md](docs/transactions-worklog-2026-03-16.md)

---

## Historique antérieur (reconstruit depuis git)

| Date approx. | Changement |
|---|---|
| Début mars 2026 | Refonte onglet Personnage (icône classe, XP bar, analyse combat) |
| Début mars 2026 | Onglet HDV avec sous-onglets, dépôts et refresh au démarrage |
| Début mars 2026 | Machine d'état OFFLINE / SELECTING / IN_GAME depuis le titre de fenêtre Wakfu |
| Début mars 2026 | Détection du personnage actif et reset classe au changement de perso |
| Début mars 2026 | Chips épinglables dans la barre repliée, icônes titlebar colorées |
| Début mars 2026 | Kamas tracking (gains/pertes log), onboarding in-window |
| Début mars 2026 | Overlay PyQt5 : attachement fenêtre Wakfu, resize, thèmes, Z-order |
| Avant mars 2026 | PoC terminal : log parser, inventaire, HDV, crafts, XP tracker |
