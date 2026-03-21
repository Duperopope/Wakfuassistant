# Contradictions & Points d'attention documentaires

> Ce fichier liste les contradictions identifiées dans la documentation R&D ainsi que les points résolus.
> Dernière mise à jour : 2026-03-21

---

## Contradictions résolues

### 1. Discrimination XP métier vs XP personnage
| | Claim |
|---|---|
| **Original** (Journal d'écoute 2) | Le tag `[Information (combat)]` = XP personnage, `[Information (jeu)]` = XP métier |
| **Correction** (Addendum session 2) | Le discriminant réel est le **nom de l'entité** dans le message, pas le tag seul |
| **Statut** | ✅ Résolu — Addendum intégré dans JOURNAUX_ECOUTE.md |

### 2. Source de vérité pour les prix HDV
| | Claim |
|---|---|
| **Commandes `/sync`** (doc 6) | Les commandes manuelles calibrent les prix HDV |
| **Protobuf agent** (doc 8) | Les IDs messages 12294/13653 sont la source primaire automatique |
| **Statut** | ✅ Résolu — Manuel = calibration/fallback, Protobuf = source primaire |

### 3. Double espaces dans logs `[Commerce]` comme discriminant
| | Claim |
|---|---|
| **Original** (Journal d'écoute 2) | Les doubles espaces indiquent un lien cliquable HDV |
| **Correction** (Addendum même fichier) | Indice insuffisant — non exploitable de manière robuste |
| **Statut** | ✅ Résolu — Pattern déprécié |

---

## Points d'attention (non contradictions, mais ambiguïtés)

### 4. Board IDs HDV Sufokia : 31546 vs 31547
| Fichier | Valeur | Contexte |
|---|---|---|
| Sources_de_donnees (1) | 31546 ET 31547 | Deux boards différents dans la même ville |
| Journal_d_ecoute (2) | 31547 uniquement | Session spécifique |
| Commandes_sync (6) | 31546, 31547 | Confirmés comme différents boards valides |
| **Conclusion** | ✅ Pas de contradiction — deux boards HDV coexistent à Sufokia |

### 5. TODO_PROCHAINE_SESSION vs état réel
| Item TODO | État réel |
|---|---|
| "Priorité haute : PERSONAL_SPACE enter/leave" | ✅ Déjà validé dans Journal_d_ecoute_3 |
| "Priorité haute : Board IDs HDV supplémentaires" | ✅ Sufokia déjà documenté dans Sources_de_donnees + Commandes_sync |
| "Zones inconnues 436, 437, 440, 1252" | ⚠️ Toujours inconnus — non résolus dans protocol_discoveries |
| **Action** | Mettre à jour TODO_PROCHAINE_SESSION pour retirer les items déjà résolus |

### 6. Terminologie "Havre-sac" vs "Espace personnel"
| Contexte | Terme utilisé |
|---|---|
| Journaux d'écoute, POC inventaire | "Havre-sac" (bag portable du joueur) |
| CONTEXT_BRIEFING, Journal_d_ecoute_3 | "PERSONAL_SPACE" (zone worldId=9) |
| **Conclusion** | Ce sont deux choses distinctes : le bag (inventaire) ≠ la zone (worldId=9). Pas de contradiction mais termes à ne pas confondre |

---

## Gaps documentaires (manques identifiés)

| Domaine | Gap | Criticité | Source |
|---|---|---|---|
| Protocole réseau | Handlers CRU et coR non résolus | 🔴 Bloquant | ACTIVE_TODOLIST, PROTOCOL_RESEAU.md |
| Zones monde | worldIds 436, 437, 440, 1252 non identifiés | 🟡 Moyen | Journal_POC, TODO_PROCHAINE_SESSION |
| Modèle châsses | Absent du pipeline Rust | 🟡 Moyen | CONTEXT_BRIEFING section 9 |
| Tables HDV Tauri DB | Pas encore créées | 🟡 Moyen | CONTEXT_BRIEFING section 9 |
| Dépôts coffre refId | Les dépôts ne portent pas le refId | 🟡 Moyen | POC_INVENTAIRE.md |
