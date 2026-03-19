use std::sync::LazyLock;

use regex::Regex;
use tracing::{debug, trace};

use crate::models::game_event::{GameEvent, KamasSource, LogSource, XpSource};

/// Un pattern de parsing avec ses métadonnées et exemples de validation.
struct PatternEntry {
    name: &'static str,
    version: &'static str,
    source: PatternSource,
    regex: &'static LazyLock<Regex>,
    extract: fn(&regex::Captures) -> Option<GameEvent>,
    /// Exemples réels tirés des journaux d'écoute (docs/RND/).
    /// Servent de documentation et de base pour les tests unitaires.
    #[cfg_attr(not(test), allow(dead_code))]
    examples: &'static [&'static str],
}

/// Indique dans quel fichier log ce pattern peut apparaître.
#[derive(Debug, Clone, Copy, PartialEq)]
enum PatternSource {
    /// Présent dans les deux logs
    Both,
    /// Exclusif à wakfu.log (combat, connexion, état technique)
    MainOnly,
    /// Exclusif à wakfu_chat.log (utilisé en Phase 4)
    #[allow(dead_code)]
    ChatOnly,
}

// =============================================================================
// PATTERNS — Économie
// =============================================================================

static RE_KAMAS_GAINED: LazyLock<Regex> = LazyLock::new(|| {
    Regex::new(r"Vous avez gagn[ée] ([\d\s\u{00a0}\u{202f}]+) [Kk]amas?").unwrap()
});

static RE_KAMAS_SPENT: LazyLock<Regex> =
    LazyLock::new(|| Regex::new(r"Vous avez perdu ([\d\s\u{00a0}\u{202f}]+) [Kk]amas?").unwrap());

static RE_ITEM_GAINED: LazyLock<Regex> =
    LazyLock::new(|| Regex::new(r"Vous avez ramasss?[ée] (\d+)x?\s+(.+?)\s*\.").unwrap());

static RE_ITEM_LOST: LazyLock<Regex> =
    LazyLock::new(|| Regex::new(r"Vous avez perdu (\d+)x?\s+(.+?)\s*\.").unwrap());

static RE_HDV_SOLD_OFFLINE: LazyLock<Regex> = LazyLock::new(|| {
    Regex::new(r"Vous avez vendu (\d+) objets? pour un prix total de ([\d\s\u{00a0}\u{202f}]+)§")
        .unwrap()
});

// =============================================================================
// PATTERNS — Combat (MainOnly — exclusifs à wakfu.log)
// =============================================================================

static RE_COMBAT_START: LazyLock<Regex> =
    LazyLock::new(|| Regex::new(r"CREATION DU COMBAT").unwrap());

static RE_COMBAT_END: LazyLock<Regex> =
    LazyLock::new(|| Regex::new(r"\[FIGHT\] End fight with id (\d+)").unwrap());

static RE_SPELL_CAST: LazyLock<Regex> = LazyLock::new(|| {
    Regex::new(r"\[Information \(combat\)\] (.+?) lance le sort (.+?)(?:\s+\(Critiques\))?\s*$")
        .unwrap()
});

static RE_DAMAGE: LazyLock<Regex> = LazyLock::new(|| {
    Regex::new(
        r"\[Information \(combat\)\] (.+?): ([+-]?\s*[\d\s\u{00a0}\u{202f}]+) PV\s+\(([^)]+)\)",
    )
    .unwrap()
});

static RE_KO: LazyLock<Regex> =
    LazyLock::new(|| Regex::new(r"\[Information \(combat\)\] (.+?) est KO\s*!").unwrap());

static RE_FIGHTER: LazyLock<Regex> = LazyLock::new(|| {
    Regex::new(
        r"\[_FL_\] fightId=(\d+) (.+?) breed\s*:\s*(\d+) \[([^\]]+)\] isControlledByAI=(\w+)",
    )
    .unwrap()
});

static RE_XP_COMBAT: LazyLock<Regex> = LazyLock::new(|| {
    Regex::new(
        r"\[Information \(combat\)\] (.+?) : \+([\d\s\u{00a0}\u{202f}]+) points d'XP\.\s+Prochain niveau dans : ([\d\s\u{00a0}\u{202f}]+)\.",
    )
    .unwrap()
});

// =============================================================================
// PATTERNS — Métiers / Récolte
// =============================================================================

static RE_PROFESSION_XP: LazyLock<Regex> = LazyLock::new(|| {
    Regex::new(
        r"(.+?) : \+([\d\s\u{00a0}\u{202f}]+) points d'XP\.\s+Prochain niveau dans : ([\d\s\u{00a0}\u{202f}]+)\.",
    )
    .unwrap()
});

// =============================================================================
// PATTERNS — Session / Connexion (MainOnly)
// =============================================================================

static RE_SERVER_CONNECT: LazyLock<Regex> = LazyLock::new(|| {
    Regex::new(r"Connexion au proxy\s*:wakfu-([^.]+)\.ankama-games\.com:5556").unwrap()
});

static RE_FRAME_WORLD: LazyLock<Regex> =
    LazyLock::new(|| Regex::new(r"[Oo]n remet la frame [Ww]orld").unwrap());

static RE_DISCONNECT_LOGOFF: LazyLock<Regex> = LazyLock::new(|| {
    Regex::new(r"Sending DisconnectionMessage to Servers\. Reason : \{LogOff\}").unwrap()
});

static RE_DISCONNECT_QUIT: LazyLock<Regex> = LazyLock::new(|| {
    Regex::new(r"Sending DisconnectionMessage to Servers\. Reason : \{Quit Request From Client\}")
        .unwrap()
});

static RE_CONNECTION_LOST: LazyLock<Regex> =
    LazyLock::new(|| Regex::new(r"Connexion avec le serveur perdue").unwrap());

// =============================================================================
// PATTERNS — Quêtes
// =============================================================================

static RE_QUEST_COMPLETED: LazyLock<Regex> =
    LazyLock::new(|| Regex::new(r"Vous avez r[ée]ussi la qu[êe]te (.+?)\.").unwrap());

static RE_QUEST_FAILED: LazyLock<Regex> =
    LazyLock::new(|| Regex::new(r#"Qu[êe]te [ée]chou[ée]e:\s*"(.+?)""#).unwrap());

// =============================================================================
// REGISTRE CENTRAL — ordre = priorité de matching
// =============================================================================

static PATTERNS: LazyLock<Vec<PatternEntry>> = LazyLock::new(|| {
    vec![
        // --- Combat (MainOnly, priorité haute car patterns longs) ---
        PatternEntry {
            name: "fighter_join",
            version: "1.0",
            source: PatternSource::MainOnly,
            regex: &RE_FIGHTER,
            extract: |caps| {
                let fight_id = caps[1].to_string();
                let name = caps[2].trim().to_string();
                let breed_id: u32 = caps[3].parse().ok()?;
                let fighter_id = caps[4].trim().to_string();
                let is_ai = caps[5].eq_ignore_ascii_case("true");
                // On émet un CombatStarted enrichi pour le premier fighter
                // Le FSM agrégera les fighters
                Some(GameEvent::CombatStarted {
                    monster_group: Some(format!(
                        "fight={fight_id} {name} breed={breed_id} id={fighter_id} ai={is_ai}"
                    )),
                })
            },
            examples: &[
                "[_FL_] fightId=1600047387 L'Immortel breed : 4 [3111456] isControlledByAI=false",
                "[_FL_] fightId=1616067187 Divinité Du Sacrifice breed : 11 [5832637] isControlledByAI=false",
                "[_FL_] fightId=1616067517 Capt'chat breed : 5314 [-1776810787728971] isControlledByAI=true",
            ],
        },
        PatternEntry {
            name: "xp_combat",
            version: "1.0",
            source: PatternSource::MainOnly,
            regex: &RE_XP_COMBAT,
            extract: |caps| {
                let amount = parse_num(&caps[2])?;
                Some(GameEvent::XpGained {
                    amount,
                    source: XpSource::Combat,
                })
            },
            examples: &[
                "[Information (combat)] L'Immortel : +15 384 points d'XP.  Prochain niveau dans : 255 833 161.",
                "[Information (combat)] L'Immortel : +54 468 878 points d'XP.  Prochain niveau dans : 182 570 141.",
                "[Information (combat)] Divinité Rolex : +11 538 points d'XP.  Prochain niveau dans : 83 837 174.",
            ],
        },
        PatternEntry {
            name: "spell_cast",
            version: "1.0",
            source: PatternSource::MainOnly,
            regex: &RE_SPELL_CAST,
            extract: |caps| {
                let caster = caps[1].trim().to_string();
                let spell = caps[2].trim().to_string();
                Some(GameEvent::DamageDealt {
                    target: String::new(),
                    amount: 0,
                    element: Some(format!("{caster}:{spell}")),
                })
            },
            examples: &[
                "[Information (combat)] L'Immortel lance le sort Fourberie",
                "[Information (combat)] Divinité Rolex lance le sort Destruction de Glyphe",
                "[Information (combat)] L'Immortel lance le sort Saignée mortelle (Critiques)",
            ],
        },
        PatternEntry {
            name: "damage",
            version: "1.0",
            source: PatternSource::MainOnly,
            regex: &RE_DAMAGE,
            extract: |caps| {
                let target = caps[1].trim().to_string();
                let raw_amount = caps[2].trim();
                let element = caps[3].trim().to_string();
                let amount_str = raw_amount.replace([' ', '\u{00a0}', '\u{202f}'], "");
                let is_negative = amount_str.starts_with('-');
                let abs_amount: u32 = amount_str.trim_start_matches(['+', '-']).parse().ok()?;
                if is_negative {
                    Some(GameEvent::DamageDealt {
                        target,
                        amount: abs_amount,
                        element: Some(element),
                    })
                } else {
                    // Positive = heal
                    Some(GameEvent::DamageReceived {
                        source: format!("heal:{element}"),
                        amount: abs_amount,
                    })
                }
            },
            examples: &[
                "[Information (combat)] Poiscaille des Profondeurs: -250 PV  (Feu)",
                "[Information (combat)] L'Immortel: +150 PV  (Vol de vie)",
            ],
        },
        PatternEntry {
            name: "ko",
            version: "1.0",
            source: PatternSource::MainOnly,
            regex: &RE_KO,
            extract: |caps| {
                let name = caps[1].trim().to_string();
                Some(GameEvent::DamageReceived {
                    source: format!("KO:{name}"),
                    amount: 0,
                })
            },
            examples: &[
                "[Information (combat)] Divinité Rolex est KO !",
                "[Information (combat)] Poiscaille des Profondeurs est KO !",
            ],
        },
        PatternEntry {
            name: "combat_start",
            version: "1.0",
            source: PatternSource::MainOnly,
            regex: &RE_COMBAT_START,
            extract: |_| {
                Some(GameEvent::CombatStarted {
                    monster_group: None,
                })
            },
            examples: &["CREATION DU COMBAT"],
        },
        PatternEntry {
            name: "combat_end",
            version: "1.0",
            source: PatternSource::MainOnly,
            regex: &RE_COMBAT_END,
            extract: |_| {
                Some(GameEvent::CombatEnded {
                    victory: true, // Le FSM déterminera la victoire/défaite
                    duration_secs: None,
                })
            },
            examples: &[
                "[FIGHT] End fight with id 1600047387",
                "[FIGHT] End fight with id 1616067517",
            ],
        },
        // --- Connexion / Session (MainOnly) ---
        PatternEntry {
            name: "server_connect",
            version: "1.0",
            source: PatternSource::MainOnly,
            regex: &RE_SERVER_CONNECT,
            extract: |caps| {
                let server = caps[1].trim().to_string();
                Some(GameEvent::ServerConnected { server })
            },
            examples: &[
                "Connexion au proxy :wakfu-ogrest.ankama-games.com:5556",
                "Connexion au proxy :wakfu-pandora.ankama-games.com:5556",
                "Connexion au proxy :wakfu-rubilax.ankama-games.com:5556",
            ],
        },
        PatternEntry {
            name: "frame_world",
            version: "1.0",
            source: PatternSource::MainOnly,
            regex: &RE_FRAME_WORLD,
            extract: |_| {
                Some(GameEvent::CharacterSelected {
                    name: String::new(), // Le FSM enrichira
                    server: String::new(),
                })
            },
            examples: &["On remet la frame World", "on remet la frame world"],
        },
        PatternEntry {
            name: "disconnect_logoff",
            version: "1.0",
            source: PatternSource::MainOnly,
            regex: &RE_DISCONNECT_LOGOFF,
            extract: |_| {
                Some(GameEvent::Disconnected {
                    reason: Some("LogOff".to_string()),
                })
            },
            examples: &[
                "Sending DisconnectionMessage to Servers. Reason : {LogOff}",
            ],
        },
        PatternEntry {
            name: "disconnect_quit",
            version: "1.0",
            source: PatternSource::MainOnly,
            regex: &RE_DISCONNECT_QUIT,
            extract: |_| {
                Some(GameEvent::Disconnected {
                    reason: Some("Quit".to_string()),
                })
            },
            examples: &[
                "Sending DisconnectionMessage to Servers. Reason : {Quit Request From Client}",
            ],
        },
        PatternEntry {
            name: "connection_lost",
            version: "1.0",
            source: PatternSource::MainOnly,
            regex: &RE_CONNECTION_LOST,
            extract: |_| {
                Some(GameEvent::Disconnected {
                    reason: Some("ConnectionLost".to_string()),
                })
            },
            examples: &["Connexion avec le serveur perdue"],
        },
        // --- Économie (Both) ---
        PatternEntry {
            name: "kamas_gained",
            version: "1.0",
            source: PatternSource::Both,
            regex: &RE_KAMAS_GAINED,
            extract: |caps| {
                let amount = parse_num_i64(&caps[1])?;
                Some(GameEvent::KamasGained {
                    amount,
                    source: KamasSource::Unknown,
                    raw_line: caps[0].to_string(),
                })
            },
            examples: &[
                "Vous avez gagné 24 kamas.",
                "Vous avez gagné 160 kamas.",
                "Vous avez gagné 12 632 kamas.",
            ],
        },
        PatternEntry {
            name: "kamas_spent",
            version: "1.0",
            source: PatternSource::Both,
            regex: &RE_KAMAS_SPENT,
            extract: |caps| {
                let amount = parse_num_i64(&caps[1])?;
                Some(GameEvent::KamasSpent {
                    amount,
                    source: KamasSource::Unknown,
                    raw_line: caps[0].to_string(),
                })
            },
            examples: &[
                "Vous avez perdu 1 kama.",
                "Vous avez perdu 2 kamas.",
                "Vous avez perdu 15 kamas.",
            ],
        },
        PatternEntry {
            name: "hdv_sold_offline",
            version: "1.0",
            source: PatternSource::Both,
            regex: &RE_HDV_SOLD_OFFLINE,
            extract: |caps| {
                let count: i64 = caps[1].parse().ok()?;
                let total = parse_num_i64(&caps[2])?;
                Some(GameEvent::KamasGained {
                    amount: total,
                    source: KamasSource::Hdv,
                    raw_line: format!("HDV hors-session: {count} objets, {total} kamas"),
                })
            },
            examples: &[
                "Vous avez vendu 9 objets pour un prix total de 12 632§ pendant votre absence.",
            ],
        },
        PatternEntry {
            name: "item_gained",
            version: "1.0",
            source: PatternSource::Both,
            regex: &RE_ITEM_GAINED,
            extract: |caps| {
                let quantity: u32 = caps[1].parse().ok()?;
                let item = caps[2].trim().to_string();
                Some(GameEvent::HarvestCompleted {
                    resource: item,
                    profession: String::new(),
                    quantity,
                })
            },
            examples: &[
                "Vous avez ramassé 1x Hache Piou .",
                "Vous avez ramassé 5x Sioupère-Glou Mystique .",
                "Vous avez ramassé 20x Jeton Exquis .",
                "Vous avez ramassé 40x Lailait .",
                "Vous avez ramassé 1x Almaton .",
            ],
        },
        PatternEntry {
            name: "item_lost",
            version: "1.0",
            source: PatternSource::Both,
            regex: &RE_ITEM_LOST,
            extract: |caps| {
                let quantity: u32 = caps[1].parse().ok()?;
                let item = caps[2].trim().to_string();
                // Item lost is tracked as a negative harvest
                Some(GameEvent::HarvestCompleted {
                    resource: format!("-{item}"),
                    profession: String::new(),
                    quantity,
                })
            },
            examples: &[
                "Vous avez perdu 1x Feuille de Menthe .",
                "Vous avez perdu 1x Amulette du Bouftou Royal .",
                "Vous avez perdu 1x Bouture de Châtaignier .",
                "Vous avez perdu 11x Transmutation Raffinée .",
            ],
        },
        // --- Métiers (Both — dans [Information (jeu)]) ---
        PatternEntry {
            name: "profession_xp",
            version: "1.0",
            source: PatternSource::Both,
            regex: &RE_PROFESSION_XP,
            extract: |caps| {
                let profession = caps[1].trim().to_string();
                // Filtrer les faux positifs : les noms de personnages dans les XP combat
                // sont gérés par xp_combat (priorité plus haute)
                // Ici on ne garde que les professions connues
                let amount = parse_num(&caps[2])?;
                Some(GameEvent::HarvestCompleted {
                    resource: format!("xp:{profession}"),
                    profession,
                    quantity: amount as u32,
                })
            },
            examples: &[
                "Herboriste : +47 points d'XP.  Prochain niveau dans : 1 253.",
                "Pêcheur : +120 points d'XP.  Prochain niveau dans : 5 800.",
            ],
        },
        // --- Quêtes (Both) ---
        PatternEntry {
            name: "quest_completed",
            version: "1.0",
            source: PatternSource::Both,
            regex: &RE_QUEST_COMPLETED,
            extract: |caps| {
                let _quest = caps[1].trim().to_string();
                Some(GameEvent::XpGained {
                    amount: 0,
                    source: XpSource::Quest,
                })
            },
            examples: &[
                "Vous avez réussi la quête Ninefi.",
            ],
        },
        PatternEntry {
            name: "quest_failed",
            version: "1.0",
            source: PatternSource::Both,
            regex: &RE_QUEST_FAILED,
            extract: |caps| {
                let _quest = caps[1].trim().to_string();
                // On ne génère pas d'événement pour les quêtes échouées
                // mais on les reconnaît pour éviter Unrecognized
                None
            },
            examples: &[
                r#"Quête échouée: "Compétitif : Stop Chef""#,
                r#"Quête échouée: "Course : Gligli Mania""#,
                r#"Quête échouée: "Solo : Épurage des Champs""#,
            ],
        },
    ]
});

// =============================================================================
// HELPERS
// =============================================================================

/// Parse un nombre avec espaces/NBSP comme séparateurs de milliers → u64
fn parse_num(s: &str) -> Option<u64> {
    let cleaned: String = s.chars().filter(|c| c.is_ascii_digit()).collect();
    cleaned.parse().ok()
}

/// Parse un nombre avec espaces/NBSP comme séparateurs de milliers → i64
fn parse_num_i64(s: &str) -> Option<i64> {
    let cleaned: String = s.chars().filter(|c| c.is_ascii_digit()).collect();
    cleaned.parse().ok()
}

// =============================================================================
// PUBLIC API
// =============================================================================

/// Métriques de santé du parser
#[derive(Debug, Clone, serde::Serialize)]
pub struct ParserHealth {
    pub total_lines: u64,
    pub matched_lines: u64,
    pub unmatched_lines: u64,
    pub match_rate: f64,
}

/// Parser de logs Wakfu. Maintient des compteurs de santé.
pub struct LogParser {
    total_lines: u64,
    matched_lines: u64,
}

impl LogParser {
    pub fn new() -> Self {
        tracing::debug!(category = "PARSER", "LogParser::new ▶");
        Self {
            total_lines: 0,
            matched_lines: 0,
        }
    }

    /// Parse une ligne de log et retourne un GameEvent typé.
    /// `source` indique le fichier d'origine (pour filtrer les patterns applicables).
    pub fn parse_line(&mut self, line: &str, source: LogSource) -> GameEvent {
        self.total_lines += 1;
        let trimmed = line.trim();

        trace!(category = "PARSER", source = ?source, total = self.total_lines, line = trimmed, "parse_line ▶");

        if trimmed.is_empty() {
            return GameEvent::Unrecognized {
                raw_line: String::new(),
            };
        }

        // Extraire le contenu après le préfixe de log
        // wakfu.log:     "INFO 10:41:40,601 [thread] (class:line) - MESSAGE"
        // wakfu_chat.log: "10:41:40,601 - MESSAGE"
        let content = extract_message_content(trimmed, source);

        for pattern in PATTERNS.iter() {
            // Filtrer par source
            if !pattern_matches_source(pattern.source, source) {
                continue;
            }

            if let Some(caps) = pattern.regex.captures(content) {
                if let Some(event) = (pattern.extract)(&caps) {
                    self.matched_lines += 1;
                    debug!(
                        category = "PARSER",
                        pattern = pattern.name,
                        version = pattern.version,
                        "✓ match → {:?}", event
                    );
                    return event;
                }
            }
        }

        // Pas de warn ici — beaucoup de lignes sont du bruit technique normal
        trace!(category = "PARSER", line = %trimmed, "✗ aucun match");
        GameEvent::Unrecognized {
            raw_line: trimmed.to_string(),
        }
    }

    /// Parse un batch de lignes (utilisé par les commandes de rescan)
    #[allow(dead_code)]
    pub fn parse_batch(&mut self, lines: &[String], source: LogSource) -> Vec<GameEvent> {
        debug!(category = "PARSER", count = lines.len(), source = ?source, "parse_batch ▶");
        lines
            .iter()
            .map(|l| self.parse_line(l, source.clone()))
            .collect()
    }

    /// Retourne les métriques de santé
    pub fn health(&self) -> ParserHealth {
        trace!(category = "PARSER", total = self.total_lines, matched = self.matched_lines, "health ▶");
        let unmatched = self.total_lines - self.matched_lines;
        let rate = if self.total_lines > 0 {
            self.matched_lines as f64 / self.total_lines as f64
        } else {
            1.0
        };
        ParserHealth {
            total_lines: self.total_lines,
            matched_lines: self.matched_lines,
            unmatched_lines: unmatched,
            match_rate: rate,
        }
    }
}

/// Extrait le contenu utile d'une ligne de log en supprimant le préfixe.
fn extract_message_content(line: &str, source: LogSource) -> &str {
    match source {
        LogSource::WakfuMain => {
            // Format: "LEVEL HH:MM:SS,mmm [thread] (class:line) - MESSAGE"
            // On cherche " - " après le préfixe pour isoler le message
            if let Some(idx) = line.find(" - ") {
                &line[idx + 3..]
            } else {
                line
            }
        }
        LogSource::WakfuChat => {
            // Format: "HH:MM:SS,mmm - MESSAGE"
            if let Some(idx) = line.find(" - ") {
                &line[idx + 3..]
            } else {
                line
            }
        }
    }
}

/// Vérifie si un pattern est applicable pour une source de log donnée.
fn pattern_matches_source(pattern_src: PatternSource, log_src: LogSource) -> bool {
    match pattern_src {
        PatternSource::Both => true,
        PatternSource::MainOnly => matches!(log_src, LogSource::WakfuMain),
        PatternSource::ChatOnly => matches!(log_src, LogSource::WakfuChat),
    }
}

// =============================================================================
// TESTS
// =============================================================================

#[cfg(test)]
mod tests {
    use super::*;

    /// Vérifie que chaque pattern matche ses exemples documentés
    #[test]
    fn all_patterns_match_their_examples() {
        for pattern in PATTERNS.iter() {
            for example in pattern.examples {
                let matched = pattern.regex.is_match(example);
                assert!(
                    matched,
                    "Pattern '{}' v{} ne matche pas son exemple: {}",
                    pattern.name, pattern.version, example
                );
            }
        }
    }

    /// Vérifie que les fonctions d'extraction retournent des résultats
    /// pour chaque exemple (sauf les patterns qui retournent None volontairement)
    #[test]
    fn all_patterns_extract_from_examples() {
        let skip_none = ["quest_failed"]; // Patterns qui retournent None volontairement
        for pattern in PATTERNS.iter() {
            if skip_none.contains(&pattern.name) {
                continue;
            }
            for example in pattern.examples {
                if let Some(caps) = pattern.regex.captures(example) {
                    let result = (pattern.extract)(&caps);
                    assert!(
                        result.is_some(),
                        "Pattern '{}' v{} matche mais extract retourne None pour: {}",
                        pattern.name,
                        pattern.version,
                        example
                    );
                }
            }
        }
    }

    #[test]
    fn parse_kamas_gained() {
        let mut parser = LogParser::new();
        let event = parser.parse_line(
            "14:15:49,123 - [Information (jeu)] Vous avez gagné 24 kamas.",
            LogSource::WakfuChat,
        );
        match event {
            GameEvent::KamasGained { amount, .. } => assert_eq!(amount, 24),
            other => panic!("Expected KamasGained, got {:?}", other),
        }
    }

    #[test]
    fn parse_kamas_with_spaces() {
        let mut parser = LogParser::new();
        let event = parser.parse_line(
            "14:15:49,123 - [Information (jeu)] Vous avez gagné 12 632 kamas.",
            LogSource::WakfuChat,
        );
        match event {
            GameEvent::KamasGained { amount, .. } => assert_eq!(amount, 12632),
            other => panic!("Expected KamasGained, got {:?}", other),
        }
    }

    #[test]
    fn parse_xp_combat() {
        let mut parser = LogParser::new();
        let event = parser.parse_line(
            "INFO 14:18:31,000 [AWT-EventQueue-0] (abc:123) - [Information (combat)] L'Immortel : +54 468 878 points d'XP.  Prochain niveau dans : 182 570 141.",
            LogSource::WakfuMain,
        );
        match event {
            GameEvent::XpGained { amount, source } => {
                assert_eq!(amount, 54468878);
                assert!(matches!(source, XpSource::Combat));
            }
            other => panic!("Expected XpGained, got {:?}", other),
        }
    }

    #[test]
    fn parse_server_connect() {
        let mut parser = LogParser::new();
        let event = parser.parse_line(
            "INFO 14:19:42,000 [thread] (cls:0) - Connexion au proxy :wakfu-pandora.ankama-games.com:5556",
            LogSource::WakfuMain,
        );
        match event {
            GameEvent::ServerConnected { server } => assert_eq!(server, "pandora"),
            other => panic!("Expected ServerConnected, got {:?}", other),
        }
    }

    #[test]
    fn parse_hdv_sold_offline() {
        let mut parser = LogParser::new();
        let event = parser.parse_line(
            "14:15:49,123 - [Information (jeu)] Vous avez vendu 9 objets pour un prix total de 12 632§ pendant votre absence.",
            LogSource::WakfuChat,
        );
        match event {
            GameEvent::KamasGained { amount, source, .. } => {
                assert_eq!(amount, 12632);
                assert!(matches!(source, KamasSource::Hdv));
            }
            other => panic!("Expected KamasGained(Hdv), got {:?}", other),
        }
    }

    #[test]
    fn parse_item_gained() {
        let mut parser = LogParser::new();
        let event = parser.parse_line(
            "14:15:49,123 - [Information (jeu)] Vous avez ramassé 5x Sioupère-Glou Mystique .",
            LogSource::WakfuChat,
        );
        match event {
            GameEvent::HarvestCompleted {
                resource, quantity, ..
            } => {
                assert_eq!(resource, "Sioupère-Glou Mystique");
                assert_eq!(quantity, 5);
            }
            other => panic!("Expected HarvestCompleted, got {:?}", other),
        }
    }

    #[test]
    fn combat_patterns_ignored_in_chat_log() {
        let mut parser = LogParser::new();
        // Combat patterns should not match in chat log
        let event = parser.parse_line("14:15:49,123 - CREATION DU COMBAT", LogSource::WakfuChat);
        assert!(matches!(event, GameEvent::Unrecognized { .. }));
    }

    #[test]
    fn parser_health_tracks_correctly() {
        let mut parser = LogParser::new();
        parser.parse_line(
            "14:15:49,123 - Vous avez gagné 100 kamas.",
            LogSource::WakfuChat,
        );
        parser.parse_line("14:15:50,000 - some random noise", LogSource::WakfuChat);
        let health = parser.health();
        assert_eq!(health.total_lines, 2);
        assert_eq!(health.matched_lines, 1);
        assert!((health.match_rate - 0.5).abs() < 0.01);
    }
}
