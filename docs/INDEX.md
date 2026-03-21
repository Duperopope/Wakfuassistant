# Documentation — Wakfu Assistant
## Répartisseur central

> Dernière mise à jour : 2026-03-21
> Point d'entrée unique pour toute la documentation du projet.

---

## Navigation rapide

| Je cherche... | Aller à |
|---|---|
| Vue d'ensemble du projet | [README.md](../README.md) |
| Architecture technique complète | [ARCHITECTURE.md](ARCHITECTURE.md) |
| Briefing complet pour LLM | [memory/CONTEXT_BRIEFING.md](../memory/CONTEXT_BRIEFING.md) |
| Protocoles opérationnels LLM | [memory/PROTOCOLES_OPERATIONS.md](../memory/PROTOCOLES_OPERATIONS.md) |
| Agent Java (WakfuSpyAgent) | [agent/README.md](agent/README.md) |
| Sources de données & formats logs | [RND/01 - SOURCES_ET_FORMATS.md](RND/01%20-%20SOURCES_ET_FORMATS.md) |
| Observations terrain | [RND/02 - JOURNAUX_ECOUTE.md](RND/02%20-%20JOURNAUX_ECOUTE.md) |
| POC HDV & marché | [RND/06 - POC_HDV.md](RND/06%20-%20POC_HDV.md) |
| Protocole réseau Netty | [RND/08 - PROTOCOL_RESEAU.md](RND/08%20-%20PROTOCOL_RESEAU.md) |
| Contradictions & gaps | [RND/10 - CONTRADICTIONS.md](RND/10%20-%20CONTRADICTIONS.md) |
| Formulaires actifs (agent) | [memory/forms/](../memory/forms/) |

---

## Structure du projet

```
docs/
├── INDEX.md                          ← CE FICHIER (répartisseur)
├── ARCHITECTURE.md                   ← Architecture technique
├── agent/
│   └── README.md                     ← Agent Java WakfuSpyAgent
└── RND/
    ├── 01 - SOURCES_ET_FORMATS.md    ← Sources de données + 20 patterns regex
    ├── 02 - JOURNAUX_ECOUTE.md       ← Observations terrain (3 sessions)
    ├── 03 - POC_LOGS_PIPELINE.md     ← POC pipeline logs (2026-03-20)
    ├── 04 - COMMANDES_SYNC.md        ← Commandes /sync in-game
    ├── 05 - POC_INVENTAIRE.md        ← POC coffre & havre-sac
    ├── 06 - POC_HDV.md               ← POC Hôtel des Ventes (VALIDÉ)
    ├── 07 - CONCEPT_ECOSYSTEME.md    ← Vision écosystème R&D unifié
    ├── 08 - PROTOCOL_RESEAU.md       ← Cartographie protocole Netty
    ├── 09 - TODO_PROCHAINE_SESSION.md ← Actions pour prochaine session
    ├── 10 - CONTRADICTIONS.md        ← Contradictions & gaps documentaires
    └── archives/
        ├── SESSION_LOGS_FUSION.md    ← Synthèse sessions A1→D10
        └── sessions/                 ← Sessions individuelles archivées
            ├── SESSION_LOG_A1.md
            ├── SESSION_LOG_A2.md
            ├── SESSION_LOG_A3.md
            ├── SESSION_LOG_A4.md
            ├── SESSION_LOG_B5.md
            ├── SESSION_LOG_B6.md
            ├── SESSION_LOG_C7.md
            ├── SESSION_LOG_D9.md
            └── SESSION_LOG_D10.md

memory/                               ← Docs LLM agent (séparé de docs/)
├── CONTEXT_BRIEFING.md               ← Briefing projet complet (source de vérité)
├── PROTOCOLES_OPERATIONS.md          ← Protocole LLM + Never Break
└── forms/
    ├── ACTIVE_MISSION_CONTEXT.md     ← Contexte mission en cours
    ├── ACTIVE_TODOLIST.md            ← Todo-list active
    ├── ACTIVE_TEST_RUN_FORM.md       ← Formulaire test en cours
    ├── MISSION_CONTEXT_TEMPLATE.md   ← Template contexte de mission
    ├── PROTOCOL_STEP_BY_STEP_TEMPLATE.md ← Template protocole
    └── TEST_RUN_FORM_TEMPLATE.md     ← Template formulaire test
```

---

## R&D — Documentation numérotée

### Chapitre 01 — Sources de données & Formats
**[01 - SOURCES_ET_FORMATS.md](RND/01%20-%20SOURCES_ET_FORMATS.md)**
Synthèse des 3 flux de données (logs texte, agent Netty, CDN), 20 patterns regex documentés, IDs de référence confirmés, limites connues.
*Fusion de : 1-Sources_de_donnees + LOG_FORMATS*

---

### Chapitre 02 — Observations terrain
**[02 - JOURNAUX_ECOUTE.md](RND/02%20-%20JOURNAUX_ECOUTE.md)**
3 sessions d'observation en jeu. Économie, combat, XP, inventaire, zones. Hypothèses validées et invalidées avec corrections.
*Fusion de : Journaux d'écoute 1, 2, 3*

---

### Chapitre 03 — POC Pipeline Logs
**[03 - POC_LOGS_PIPELINE.md](RND/03%20-%20POC_LOGS_PIPELINE.md)**
Journal du POC pipeline de logs du 2026-03-20. Script live_monitor v1→v3, validation courbe XP.

---

### Chapitre 04 — Commandes Sync In-Game
**[04 - COMMANDES_SYNC.md](RND/04%20-%20COMMANDES_SYNC.md)**
Commandes `/sync` pour calibration manuelle : items, métiers, personnage, carte. 14 métiers reconnus.

---

### Chapitre 05 — POC Inventaire & Coffre
**[05 - POC_INVENTAIRE.md](RND/05%20-%20POC_INVENTAIRE.md)**
Extraction Netty des mouvements havre-sac (csf/cso). Mapping progressif uid→refId. Limite : dépôts sans refId.

---

### Chapitre 06 — POC HDV (Hôtel des Ventes)
**[06 - POC_HDV.md](RND/06%20-%20POC_HDV.md)**
**Statut : VALIDÉ.** Protobuf IDs 12294/13653, 82918 offres capturées, pipeline SQLite. Point critique : item_ref_id ≠ offer_uid.
*Fusion de : Journal_POC_HDV + HDV_PRICE_CAPTURE + GUIDE_REPRO + BACKLOG + v3_results*

---

### Chapitre 07 — Concept Écosystème R&D
**[07 - CONCEPT_ECOSYSTEME.md](RND/07%20-%20CONCEPT_ECOSYSTEME.md)**
Vision architecture R&D unifiée. Phases A-D, contrats entre composants, playbook.

---

### Chapitre 08 — Protocole Réseau Netty
**[08 - PROTOCOL_RESEAU.md](RND/08%20-%20PROTOCOL_RESEAU.md)**
Cartographie du protocole réseau Wakfu. Handlers décompilés, 85 types de messages, classes Java identifiées. En cours : CRU, coR.

---

### Chapitre 09 — TODO Prochaine Session
**[09 - TODO_PROCHAINE_SESSION.md](RND/09%20-%20TODO_PROCHAINE_SESSION.md)**
Actions terrain pour la prochaine session de jeu. Voir [10 - CONTRADICTIONS.md](RND/10%20-%20CONTRADICTIONS.md) pour les items déjà résolus.

---

### Chapitre 10 — Contradictions & Gaps
**[10 - CONTRADICTIONS.md](RND/10%20-%20CONTRADICTIONS.md)**
Contradictions documentaires résolues, points d'attention, gaps critiques identifiés.

---

## Architecture & Référence technique

| Document | Description |
|---|---|
| [ARCHITECTURE.md](ARCHITECTURE.md) | Stack, pipeline, modèles de données, IPC, overlay Win32, phases de développement |
| [agent/README.md](agent/README.md) | Compilation et lancement du WakfuSpyAgent Java |
| [../README.md](../README.md) | Présentation projet, installation |
| [../CHANGELOG.md](../CHANGELOG.md) | Historique des changements |

---

## Mémoire & Protocoles LLM

> Ces fichiers sont dans `memory/` pour séparer les docs projet des docs opérationnelles de l'agent.

| Document | Description |
|---|---|
| [memory/CONTEXT_BRIEFING.md](../memory/CONTEXT_BRIEFING.md) | Source de vérité complète — à lire en premier pour tout LLM |
| [memory/PROTOCOLES_OPERATIONS.md](../memory/PROTOCOLES_OPERATIONS.md) | Protocole LLM + Never Break — règles opérationnelles |
| [memory/forms/ACTIVE_MISSION_CONTEXT.md](../memory/forms/ACTIVE_MISSION_CONTEXT.md) | Mission en cours |
| [memory/forms/ACTIVE_TODOLIST.md](../memory/forms/ACTIVE_TODOLIST.md) | Todo-list active |
| [memory/forms/ACTIVE_TEST_RUN_FORM.md](../memory/forms/ACTIVE_TEST_RUN_FORM.md) | Test en cours |

---

## Archives

| Document | Description |
|---|---|
| [RND/archives/SESSION_LOGS_FUSION.md](RND/archives/SESSION_LOGS_FUSION.md) | Synthèse de toutes les sessions de travail A1→D10 |
| [RND/archives/sessions/](RND/archives/sessions/) | Sessions individuelles (A1, A2, A3, A4, B5, B6, C7, D9, D10) |

---

## Légende des statuts

| Symbole | Signification |
|---|---|
| ✅ VALIDÉ | POC ou découverte confirmé sur données réelles |
| ⚠️ PARTIEL | Partiellement validé ou avec nuances importantes |
| 🔴 BLOQUÉ | Bloqué, dépendance non résolue |
| 🚧 EN COURS | Travail en cours lors de la dernière session |
