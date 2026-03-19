use serde::Serialize;

#[derive(Debug, Clone, Serialize)]
pub struct SessionStats {
    pub character_name: String,
    pub server_name: String,
    pub kamas_balance: i64,
    pub kamas_gained_session: i64,
    pub kamas_spent_session: i64,
    pub total_xp: u64,
    pub combat_count: u32,
    pub victory_count: u32,
    pub session_duration: u64,
}

#[tauri::command]
pub fn get_session_stats() -> SessionStats {
    SessionStats {
        character_name: "En attente...".to_string(),
        server_name: String::new(),
        kamas_balance: 0,
        kamas_gained_session: 0,
        kamas_spent_session: 0,
        total_xp: 0,
        combat_count: 0,
        victory_count: 0,
        session_duration: 0,
    }
}
