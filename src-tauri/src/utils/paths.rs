use std::path::PathBuf;
use tracing::{debug, info};

/// Résout le répertoire des logs Wakfu.
///
/// Stratégie de recherche (par priorité) :
/// 1. Chemin standard Zaap : %APPDATA%/zaap/gamesLogs/wakfu/logs/
/// 2. Chemin custom via repositories.json de Zaap
/// 3. Fallback Steam : C:\Program Files (x86)\Steam\steamapps\common\Wakfu\game\logs\
pub fn wakfu_log_dir() -> Option<PathBuf> {
    // 1. Chemin standard Zaap
    if let Some(appdata) = dirs::config_dir() {
        let zaap_logs = appdata
            .join("zaap")
            .join("gamesLogs")
            .join("wakfu")
            .join("logs");
        if zaap_logs.exists() {
            info!(path = %zaap_logs.display(), "Logs Wakfu trouvés (Zaap standard)");
            return Some(zaap_logs);
        }

        // 2. Fallback : repositories.json de Zaap (installation custom ou Zaapi)
        for repos_path in [
            appdata
                .join("zaap")
                .join("repositories")
                .join("repositories.json"),
            appdata.join("zaap").join("repositories.json"),
            appdata
                .join("Zaapi")
                .join("repositories")
                .join("repositories.json"),
        ] {
            if let Some(path) = resolve_from_repositories_json(&repos_path) {
                return Some(path);
            }
        }
    }

    // 3. Fallback Steam
    let steam_paths = [
        PathBuf::from(r"C:\Program Files (x86)\Steam\steamapps\common\Wakfu\game"),
        PathBuf::from(r"C:\Program Files\Steam\steamapps\common\Wakfu\game"),
    ];
    for steam_base in &steam_paths {
        let steam_logs = steam_base.join("logs");
        if steam_logs.exists() {
            info!(path = %steam_logs.display(), "Logs Wakfu trouvés (Steam)");
            return Some(steam_logs);
        }
    }

    debug!("Répertoire logs Wakfu introuvable");
    None
}

fn resolve_from_repositories_json(repos_path: &PathBuf) -> Option<PathBuf> {
    if !repos_path.exists() {
        return None;
    }
    let content = std::fs::read_to_string(repos_path).ok()?;
    let repos: serde_json::Value = serde_json::from_str(&content).ok()?;

    // Format peut être { "games": { "wakfu": { "location": "..." } } }
    // ou { "id": "wakfumain", "location": "..." }
    let location = repos
        .get("games")
        .and_then(|g| g.get("wakfu"))
        .and_then(|w| w.get("location"))
        .and_then(|v| v.as_str())
        .or_else(|| {
            if repos.get("gameUid").and_then(|v| v.as_str()) == Some("wakfu") {
                repos.get("location").and_then(|v| v.as_str())
            } else {
                None
            }
        });

    if let Some(loc) = location {
        // Les logs du jeu sont dans gamesLogs, pas dans l'install du jeu
        // Mais l'install peut aussi contenir un sous-dossier logs
        let game_logs = PathBuf::from(loc).join("logs");
        if game_logs.exists() {
            info!(
                path = %game_logs.display(),
                repos = %repos_path.display(),
                "Logs Wakfu trouvés via repositories.json"
            );
            return Some(game_logs);
        }
    }
    None
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

/// Chemin du fichier de configuration utilisateur (Phase 4)
#[allow(dead_code)]
pub fn config_path() -> PathBuf {
    app_data_dir().join("config.json")
}

/// Chemin du répertoire de cache CDN (Phase 5)
#[allow(dead_code)]
pub fn cdn_cache_dir() -> PathBuf {
    app_data_dir().join("cdn_cache")
}

/// Chemin du répertoire de logs applicatifs
pub fn app_log_dir() -> PathBuf {
    app_data_dir().join("logs")
}
