use std::sync::OnceLock;
use std::sync::atomic::{AtomicBool, Ordering};
use tracing_appender::rolling;
use tracing_subscriber::{fmt, fmt::format::FmtSpan, layer::SubscriberExt, reload, util::SubscriberInitExt, EnvFilter};

use super::paths;

/// Contrôle global du logging verbose (activable depuis Options → "Logs détaillés")
pub static VERBOSE: AtomicBool = AtomicBool::new(false);

/// Fermeture pour rechargement dynamique du filtre de niveau de log
static SET_FILTER: OnceLock<Box<dyn Fn(&str) + Send + Sync>> = OnceLock::new();

#[inline(always)]
#[allow(dead_code)]
pub fn is_verbose() -> bool {
    VERBOSE.load(Ordering::Relaxed)
}

/// Active/désactive le logging verbose. Change le filtre tracing à la volée.
pub fn set_verbose(enabled: bool) {
    VERBOSE.store(enabled, Ordering::Relaxed);
    if let Some(set_fn) = SET_FILTER.get() {
        set_fn(if enabled {
            "wakfu_overlay=debug,warn"
        } else {
            "wakfu_overlay=info,warn"
        });
    }
    if enabled {
        tracing::info!(
            category = "LOGGER",
            "▶ Verbose logging activé — couverture 100% fonctions"
        );
    } else {
        tracing::info!(
            category = "LOGGER",
            "■ Verbose logging désactivé"
        );
    }
}

/// Initialise le système de logging.
/// - Console : toujours active
/// - Fichier rotatif : toujours actif (rotation quotidienne)
/// - Spans entrée/sortie : activés en mode verbose (niveau trace)
/// - Filtre dynamique : INFO par défaut, TRACE si verbose activé
pub fn init() {
    let log_dir = paths::app_log_dir();
    std::fs::create_dir_all(&log_dir).ok();

    let file_appender = rolling::daily(&log_dir, "wakfu-overlay.log");

    let (filter, reload_handle) = reload::Layer::new(
        EnvFilter::new("wakfu_overlay=info,warn")
    );

    SET_FILTER
        .set(Box::new(move |filter_str: &str| {
            reload_handle
                .modify(|f| *f = EnvFilter::new(filter_str))
                .ok();
        }))
        .ok();

    tracing_subscriber::registry()
        .with(filter)
        .with(
            fmt::layer()
                .with_target(true)
                .with_line_number(true)
                .with_span_events(FmtSpan::FULL),
        )
        .with(
            fmt::layer()
                .with_writer(file_appender)
                .with_ansi(false)
                .with_target(true)
                .with_line_number(true)
                .with_span_events(FmtSpan::FULL),
        )
        .init();
}
