mod commands;
mod models;
mod services;
mod utils;

use std::sync::{Arc, Mutex};

use commands::pipeline::AppPipelineState;
use tauri::Manager;
use tracing::info;

#[cfg_attr(mobile, tauri::mobile_entry_point)]
pub fn run() {
    // Initialiser le logging (tracing + rotation fichier)
    utils::logger::init();

    info!(
        version = utils::constants::APP_VERSION,
        "Démarrage de Wakfu Overlay"
    );

    // Initialiser la base de données
    let db_path = utils::paths::database_path();
    match services::database::init_database(&db_path) {
        Ok(_conn) => info!("Base de données prête"),
        Err(e) => tracing::error!(error = %e, "Échec initialisation base de données"),
    }

    tauri::Builder::default()
        .plugin(tauri_plugin_single_instance::init(|app, _args, _cwd| {
            // Une instance existe déjà → on la remet au premier plan
            if let Some(window) = app.get_webview_window("main") {
                let _ = window.show();
                let _ = window.set_focus();
                info!("Instance déjà active — focus sur la fenêtre existante");
            }
        }))
        .plugin(tauri_plugin_store::Builder::new().build())
        .plugin(tauri_plugin_process::init())
        .plugin(tauri_plugin_global_shortcut::Builder::new().build())
        .manage(AppPipelineState(Arc::new(Mutex::new(None))))
        .invoke_handler(tauri::generate_handler![
            commands::session::get_session_stats,
            commands::pipeline::start_log_pipeline,
            commands::pipeline::get_parser_health,
            commands::pipeline::get_game_state,
            commands::pipeline::force_log_rescan,
            commands::overlay_commands::get_wakfu_window_info,
            commands::overlay_commands::toggle_click_through,
            commands::overlay_commands::set_overlay_always_on_top,
            commands::cdn_commands::get_cdn_version,
            commands::cdn_commands::refresh_cdn_cache,
            commands::cdn_commands::get_item_name,
        ])
        .run(tauri::generate_context!())
        .expect("Erreur au lancement de Wakfu Overlay");
}
