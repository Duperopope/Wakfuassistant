use std::sync::{Arc, Mutex};

use tauri::ipc::Channel;
use tauri::State;

use crate::services::log_parser::ParserHealth;
use crate::services::log_watcher::{GameStreamEvent, PipelineState};
use crate::services::state_machine::GameState;
use crate::utils::paths;

/// État global du pipeline, géré par Tauri.
pub struct AppPipelineState(pub Arc<Mutex<Option<Arc<Mutex<PipelineState>>>>>);

/// Démarre le pipeline de surveillance des logs.
/// Le Channel reçoit tous les événements en temps réel.
#[tauri::command]
pub fn start_log_pipeline(
    on_event: Channel<GameStreamEvent>,
    state: State<'_, AppPipelineState>,
) -> Result<(), String> {
    let log_dir = paths::wakfu_log_dir()
        .ok_or_else(|| "Répertoire des logs Wakfu introuvable. Lancez Wakfu au moins une fois.".to_string())?;

    let pipeline = crate::services::log_watcher::start_pipeline(log_dir, on_event)
        .map_err(|e| format!("Erreur démarrage pipeline: {e}"))?;

    // Stocker l'état du pipeline
    if let Ok(mut s) = state.0.lock() {
        *s = Some(pipeline);
    }

    Ok(())
}

/// Récupère la santé du parser.
#[tauri::command]
pub fn get_parser_health(state: State<'_, AppPipelineState>) -> Result<ParserHealth, String> {
    let guard = state.0.lock().map_err(|e| e.to_string())?;
    let pipeline = guard
        .as_ref()
        .ok_or_else(|| "Pipeline non démarré".to_string())?;
    let ps = pipeline.lock().map_err(|e| e.to_string())?;
    Ok(ps.parser_health())
}

/// Récupère l'état courant du FSM.
#[tauri::command]
pub fn get_game_state(state: State<'_, AppPipelineState>) -> Result<GameState, String> {
    let guard = state.0.lock().map_err(|e| e.to_string())?;
    let pipeline = guard
        .as_ref()
        .ok_or_else(|| "Pipeline non démarré".to_string())?;
    let ps = pipeline.lock().map_err(|e| e.to_string())?;
    Ok(ps.game_state().clone())
}

/// Force un re-scan des fichiers log.
#[tauri::command]
pub fn force_log_rescan(state: State<'_, AppPipelineState>) -> Result<(), String> {
    let guard = state.0.lock().map_err(|e| e.to_string())?;
    let pipeline = guard
        .as_ref()
        .ok_or_else(|| "Pipeline non démarré".to_string())?;
    let mut ps = pipeline.lock().map_err(|e| e.to_string())?;
    let _ = ps.poll();
    Ok(())
}
