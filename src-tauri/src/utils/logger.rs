use tracing_appender::rolling;
use tracing_subscriber::{fmt, layer::SubscriberExt, util::SubscriberInitExt, EnvFilter};

use super::paths;

/// Initialise le système de logging avec tracing.
/// - Console : en mode debug
/// - Fichier rotatif : toujours actif (rotation quotidienne)
pub fn init() {
    let log_dir = paths::app_log_dir();
    std::fs::create_dir_all(&log_dir).ok();

    let file_appender = rolling::daily(&log_dir, "wakfu-overlay.log");

    let env_filter = EnvFilter::try_from_default_env()
        .unwrap_or_else(|_| EnvFilter::new("wakfu_overlay=info,warn"));

    tracing_subscriber::registry()
        .with(env_filter)
        .with(fmt::layer().with_target(true))
        .with(
            fmt::layer()
                .with_writer(file_appender)
                .with_ansi(false)
                .with_target(true),
        )
        .init();
}
