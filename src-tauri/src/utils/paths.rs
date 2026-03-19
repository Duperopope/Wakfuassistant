use std::path::PathBuf;
use tracing::info;

/// Résout le répertoire des logs Wakfu via la config Zaap.
/// Chemin standard : %APPDATA%/zaap/gamesLogs/wakfu/logs/
pub fn wakfu_log_dir() -> Option<PathBuf> {
    let appdata = dirs::config_dir()?;
    let zaap_logs = appdata.join("zaap").join("gamesLogs").join("wakfu").join("logs");

    if zaap_logs.exists() {
        info!(path = %zaap_logs.display(), "Répertoire logs Wakfu trouvé");
        Some(zaap_logs)
    } else {
        // Fallback : chercher via repositories.json de Zaap
        let repos_json = appdata.join("zaap").join("repositories.json");
        if repos_json.exists() {
            if let Ok(content) = std::fs::read_to_string(&repos_json) {
                if let Ok(repos) = serde_json::from_str::<serde_json::Value>(&content) {
                    if let Some(wakfu) = repos.get("wakfu") {
                        if let Some(location) = wakfu.get("location").and_then(|v| v.as_str()) {
                            let custom_logs = PathBuf::from(location).join("logs");
                            if custom_logs.exists() {
                                info!(path = %custom_logs.display(), "Logs Wakfu trouvés via repositories.json");
                                return Some(custom_logs);
                            }
                        }
                    }
                }
            }
        }
        None
    }
}

/// Répertoire de données de l'application (AppData/Local/wakfu-overlay)
pub fn app_data_dir() -> PathBuf {
    dirs::data_local_dir()
        .unwrap_or_else(|| PathBuf::from("."))
        .join("wakfu-overlay")
}

/// Chemin de la base SQLite
pub fn database_path() -> PathBuf {
    app_data_dir().join("wakfu_overlay.db")
}

/// Chemin du fichier de configuration utilisateur
pub fn config_path() -> PathBuf {
    app_data_dir().join("config.json")
}

/// Chemin du répertoire de cache CDN
pub fn cdn_cache_dir() -> PathBuf {
    app_data_dir().join("cdn_cache")
}

/// Chemin du répertoire de logs applicatifs
pub fn app_log_dir() -> PathBuf {
    app_data_dir().join("logs")
}
