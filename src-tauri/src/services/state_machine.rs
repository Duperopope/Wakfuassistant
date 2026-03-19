use serde::Serialize;
use tracing::info;

use crate::models::game_event::GameEvent;

/// États du jeu — transitions gérées par match exhaustif.
///
/// ```text
///                 ┌──────────┐
///                 │ OFFLINE  │
///                 └────┬─────┘
///                      │ ServerConnected
///                      ▼
///                 ┌──────────┐
///                 │ LOADING  │
///                 └────┬─────┘
///                      │ CharacterSelected (frame world)
///                      ▼
///                 ┌──────────┐
///           ┌────►│ IN_GAME  │◄───┐
///           │     └────┬─────┘    │
///           │          │          │
///           │    CombatStarted  CombatEnded
///           │          │          │
///           │          ▼          │
///           │     ┌──────────┐   │
///           │     │IN_COMBAT │───┘
///           │     └──────────┘
///           │
///      CharacterSelected / ServerConnected
///           │
///           ▼
///     ┌──────────────┐
///     │ DISCONNECTED │ → OFFLINE (timeout) ou LOADING (reconnexion)
///     └──────────────┘
/// ```
#[derive(Debug, Clone, PartialEq, Serialize)]
pub enum GameState {
    Offline,
    Loading { server: Option<String> },
    InGame { server: String, character: String },
    InCombat { server: String, character: String, fight_id: Option<String> },
    Disconnected { reason: String },
}

/// Événement de transition émis par le FSM vers le frontend.
#[derive(Debug, Clone, Serialize)]
pub struct StateTransition {
    pub from: GameState,
    pub to: GameState,
}

/// Machine à états du jeu.
pub struct StateMachine {
    state: GameState,
    /// Dernier serveur connu (persiste entre les transitions)
    last_server: Option<String>,
    /// Dernier personnage connu
    last_character: Option<String>,
}

impl StateMachine {
    pub fn new() -> Self {
        Self {
            state: GameState::Offline,
            last_server: None,
            last_character: None,
        }
    }

    pub fn state(&self) -> &GameState {
        &self.state
    }

    /// Traite un GameEvent et retourne une transition si l'état change.
    pub fn process(&mut self, event: &GameEvent) -> Option<StateTransition> {
        let new_state = match (&self.state, event) {
            // === Vers LOADING ===
            (_, GameEvent::ServerConnected { server }) => {
                self.last_server = Some(server.clone());
                Some(GameState::Loading {
                    server: Some(server.clone()),
                })
            }

            // === Vers IN_GAME ===
            (
                GameState::Loading { server },
                GameEvent::CharacterSelected { name, .. },
            ) => {
                let srv = server
                    .as_ref()
                    .or(self.last_server.as_ref())
                    .cloned()
                    .unwrap_or_default();
                if !name.is_empty() {
                    self.last_character = Some(name.clone());
                }
                let char_name = self
                    .last_character
                    .clone()
                    .unwrap_or_else(|| "Inconnu".to_string());
                Some(GameState::InGame {
                    server: srv,
                    character: char_name,
                })
            }

            // Disconnected + CharacterSelected → InGame (reconnexion)
            (GameState::Disconnected { .. }, GameEvent::CharacterSelected { name, .. }) => {
                let srv = self.last_server.clone().unwrap_or_default();
                if !name.is_empty() {
                    self.last_character = Some(name.clone());
                }
                let char_name = self
                    .last_character
                    .clone()
                    .unwrap_or_else(|| "Inconnu".to_string());
                Some(GameState::InGame {
                    server: srv,
                    character: char_name,
                })
            }

            // frame_world en Offline → traiter comme Loading → InGame
            (GameState::Offline, GameEvent::CharacterSelected { name, .. }) => {
                let srv = self.last_server.clone().unwrap_or_default();
                if !name.is_empty() {
                    self.last_character = Some(name.clone());
                }
                let char_name = self
                    .last_character
                    .clone()
                    .unwrap_or_else(|| "Inconnu".to_string());
                Some(GameState::InGame {
                    server: srv,
                    character: char_name,
                })
            }

            // === Vers IN_COMBAT ===
            (
                GameState::InGame { server, character },
                GameEvent::CombatStarted { monster_group },
            ) => {
                let fight_id = monster_group
                    .as_ref()
                    .and_then(|s| s.strip_prefix("fight="))
                    .and_then(|s| s.split_whitespace().next())
                    .map(|s| s.to_string());
                Some(GameState::InCombat {
                    server: server.clone(),
                    character: character.clone(),
                    fight_id,
                })
            }

            // Combat déjà en cours — on reste dans le même état (fighters supplémentaires)
            (GameState::InCombat { .. }, GameEvent::CombatStarted { .. }) => None,

            // === Retour à IN_GAME après combat ===
            (
                GameState::InCombat {
                    server, character, ..
                },
                GameEvent::CombatEnded { .. },
            ) => Some(GameState::InGame {
                server: server.clone(),
                character: character.clone(),
            }),

            // === Vers DISCONNECTED ===
            (_, GameEvent::Disconnected { reason }) => Some(GameState::Disconnected {
                reason: reason.clone().unwrap_or_else(|| "Unknown".to_string()),
            }),

            // === Pas de transition ===
            _ => None,
        };

        if let Some(new) = new_state {
            if new != self.state {
                let transition = StateTransition {
                    from: self.state.clone(),
                    to: new.clone(),
                };
                info!(
                    from = ?self.state,
                    to = ?new,
                    "Transition d'état"
                );
                self.state = new;
                return Some(transition);
            }
        }

        None
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn initial_state_is_offline() {
        let fsm = StateMachine::new();
        assert_eq!(*fsm.state(), GameState::Offline);
    }

    #[test]
    fn server_connect_transitions_to_loading() {
        let mut fsm = StateMachine::new();
        let transition = fsm.process(&GameEvent::ServerConnected {
            server: "ogrest".to_string(),
        });
        assert!(transition.is_some());
        assert!(matches!(
            fsm.state(),
            GameState::Loading {
                server: Some(ref s)
            } if s == "ogrest"
        ));
    }

    #[test]
    fn frame_world_transitions_to_in_game() {
        let mut fsm = StateMachine::new();
        fsm.process(&GameEvent::ServerConnected {
            server: "pandora".to_string(),
        });
        let transition = fsm.process(&GameEvent::CharacterSelected {
            name: "L'Immortel".to_string(),
            server: String::new(),
        });
        assert!(transition.is_some());
        match fsm.state() {
            GameState::InGame { server, character } => {
                assert_eq!(server, "pandora");
                assert_eq!(character, "L'Immortel");
            }
            other => panic!("Expected InGame, got {:?}", other),
        }
    }

    #[test]
    fn combat_lifecycle() {
        let mut fsm = StateMachine::new();
        fsm.process(&GameEvent::ServerConnected {
            server: "ogrest".to_string(),
        });
        fsm.process(&GameEvent::CharacterSelected {
            name: "L'Immortel".to_string(),
            server: String::new(),
        });

        // Start combat
        let t = fsm.process(&GameEvent::CombatStarted {
            monster_group: Some("fight=1600047387 L'Immortel breed=4 id=3111456 ai=false".to_string()),
        });
        assert!(t.is_some());
        assert!(matches!(fsm.state(), GameState::InCombat { .. }));

        // Additional fighters don't change state
        let t2 = fsm.process(&GameEvent::CombatStarted {
            monster_group: Some("fight=1600047387 Mob breed=3883 id=-123 ai=true".to_string()),
        });
        assert!(t2.is_none());

        // End combat
        let t3 = fsm.process(&GameEvent::CombatEnded {
            victory: true,
            duration_secs: None,
        });
        assert!(t3.is_some());
        assert!(matches!(fsm.state(), GameState::InGame { .. }));
    }

    #[test]
    fn disconnect_from_any_state() {
        let mut fsm = StateMachine::new();
        fsm.process(&GameEvent::ServerConnected {
            server: "ogrest".to_string(),
        });
        fsm.process(&GameEvent::CharacterSelected {
            name: "Test".to_string(),
            server: String::new(),
        });

        let t = fsm.process(&GameEvent::Disconnected {
            reason: Some("LogOff".to_string()),
        });
        assert!(t.is_some());
        assert!(matches!(fsm.state(), GameState::Disconnected { .. }));
    }

    #[test]
    fn reconnect_after_disconnect() {
        let mut fsm = StateMachine::new();
        fsm.process(&GameEvent::ServerConnected {
            server: "ogrest".to_string(),
        });
        fsm.process(&GameEvent::CharacterSelected {
            name: "Test".to_string(),
            server: String::new(),
        });
        fsm.process(&GameEvent::Disconnected {
            reason: Some("LogOff".to_string()),
        });

        // Reconnect
        fsm.process(&GameEvent::ServerConnected {
            server: "rubilax".to_string(),
        });
        assert!(matches!(
            fsm.state(),
            GameState::Loading {
                server: Some(ref s)
            } if s == "rubilax"
        ));
    }
}
