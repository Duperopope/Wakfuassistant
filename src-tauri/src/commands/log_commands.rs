use crate::utils::logger;

/// Active ou désactive le logging verbose depuis le frontend.
/// Correspond à la case "Logs détaillés" dans les Options.
#[tauri::command]
pub fn set_verbose_logging(enabled: bool) {
    logger::set_verbose(enabled);
}

/// Pont de logging : reçoit les logs TypeScript et les écrit dans le fichier Rust.
/// Permet un journal unifié frontend + backend dans un seul fichier.
#[tauri::command]
pub fn bridge_log(
    level: String,
    category: String,
    fn_name: String,
    message: String,
    data: Option<String>,
) {
    let full = match &data {
        Some(d) => format!("[TS][{category}] {fn_name}() — {message} | {d}"),
        None    => format!("[TS][{category}] {fn_name}() — {message}"),
    };
    match level.as_str() {
        "trace" => tracing::trace!(target: "wakfu_overlay::frontend", category = %category, fn_name = %fn_name, "{}", full),
        "debug" => tracing::debug!(target: "wakfu_overlay::frontend", category = %category, fn_name = %fn_name, "{}", full),
        "warn"  => tracing::warn!(target:  "wakfu_overlay::frontend", category = %category, fn_name = %fn_name, "{}", full),
        "error" => tracing::error!(target: "wakfu_overlay::frontend", category = %category, fn_name = %fn_name, "{}", full),
        _       => tracing::info!(target:  "wakfu_overlay::frontend", category = %category, fn_name = %fn_name, "{}", full),
    }
}
