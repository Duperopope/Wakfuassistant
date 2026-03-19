mod commands;
mod models;
mod services;
mod utils;

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
        .invoke_handler(tauri::generate_handler![
            commands::session::get_session_stats,
        ])
        .run(tauri::generate_context!())
        .expect("Erreur au lancement de Wakfu Overlay");
}
