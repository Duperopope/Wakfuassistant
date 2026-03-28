use chrono::{DateTime, Utc};
use serde::{Deserialize, Serialize};

/// Chaque ligne de log parsée devient un GameEvent typé.
/// Type central du système — tous les services produisent ou consomment des GameEvent.
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(tag = "kind")]
pub enum GameEvent {
    // === Économie ===
    KamasGained {
        amount: i64,
        source: KamasSource,
        raw_line: String,
    },
    KamasSpent {
        amount: i64,
        source: KamasSource,
        raw_line: String,
    },

    // === Combat ===
    CombatStarted {
        monster_group: Option<String>,
    },
    CombatEnded {
        victory: bool,
        duration_secs: Option<u32>,
    },
    DamageDealt {
        target: String,
        amount: u32,
        element: Option<String>,
    },
    DamageReceived {
        source: String,
        amount: u32,
    },
    XpGained {
        amount: u64,
        source: XpSource,
    },

    // === Métiers ===
    HarvestCompleted {
        resource: String,
        profession: String,
        quantity: u32,
    },
    CraftCompleted {
        item: String,
        profession: String,
    },
    ProfessionLevelUp {
        profession: String,
        new_level: u32,
    },

    // === Session ===
    CharacterSelected {
        name: String,
        server: String,
    },
    ServerConnected {
        server: String,
    },
    Disconnected {
        reason: Option<String>,
    },

    // === Diagnostics ===
    Unrecognized {
        raw_line: String,
    },
}

#[derive(Debug, Clone, Serialize, Deserialize)]
pub enum KamasSource {
    Combat,
    Trade,
    Hdv,
    Quest,
    Craft,
    Unknown,
}

#[derive(Debug, Clone, Serialize, Deserialize)]
pub enum XpSource {
    Combat,
    Quest,
    Challenge,
    Achievement,
    Unknown,
}

#[allow(dead_code)] // Utilisé en Phase 4 pour la persistance DB
#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct TimestampedEvent {
    pub id: Option<i64>,
    pub timestamp: DateTime<Utc>,
    pub session_id: String,
    pub event: GameEvent,
    pub log_source: LogSource,
    pub synced: bool,
}

#[derive(Debug, Clone, Copy, PartialEq, Serialize, Deserialize)]
pub enum LogSource {
    WakfuMain,
    WakfuChat,
}
