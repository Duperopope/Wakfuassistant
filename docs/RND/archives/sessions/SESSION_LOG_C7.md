# SESSION LOG C7 — Documentation des formats de log (LOG_FORMATS.md)

**Date :** 2026-03-21
**Agent :** Claude Sonnet 4.6
**Scope :** Création de `docs/RND/LOG_FORMATS.md` — référence des 20 patterns regex du log_parser
**Protocole :** NeverBreak — aucun fichier source modifié

---

## Action

Lecture intégrale de `src-tauri/src/services/log_parser.rs` et `src-tauri/src/models/game_event.rs`.
Création de `docs/RND/LOG_FORMATS.md` documentant chaque `PatternEntry` du registre `PATTERNS` dans l'ordre exact du code.

## Fichiers lus (sources de vérité)

- `src-tauri/src/services/log_parser.rs` — 901 lignes, registre PATTERNS, regex, extract functions, exemples
- `src-tauri/src/models/game_event.rs` — 111 lignes, enum GameEvent, KamasSource, XpSource, LogSource
- `memory/CONTEXT_BRIEFING.md` — contexte projet

## Fichier créé

- `docs/RND/LOG_FORMATS.md` — documentation de référence

## Résultat

**20 patterns documentés** dans l'ordre exact du registre `PATTERNS` :

| Plage | Catégorie | Source | Count |
|-------|-----------|--------|-------|
| 1–7 | Combat | MainOnly | 7 |
| 8–12 | Session / Connexion | MainOnly | 5 |
| 13–17 | Économie | Both | 5 |
| 18 | Métiers | Both | 1 |
| 19–20 | Quêtes | Both | 2 |
| **Total** | | | **20** |

Pour chaque pattern, le document couvre : nom, version, source, regex brute copiée du code, description française, groupes de capture numérotés, GameEvent produit (variante + champs), exemples copiés du code, notes et limites.

## Observations documentées

- `quest_failed` est le seul pattern à retourner `None` — reconnaît la ligne sans émettre d'événement.
- `damage` mappe les soins sur `DamageReceived` (compromis sémantique — pas de variante `HealReceived`).
- `profession_xp` et `xp_combat` partagent la même structure regex — la priorité (2 vs 18) et la source (MainOnly vs Both) les rendent mutuellement exclusifs dans la pratique.
- `PatternSource::ChatOnly` est défini dans l'enum mais non utilisé par aucun pattern du registre courant.
- 8 limites identifiées dans la section finale du document.

## Fichiers modifiés

Aucun fichier source modifié. Création documentaire uniquement.
