use tauri::Window;
use tracing::{debug, error, info};

use crate::services::win32_overlay::{find_wakfu_window, WakfuWindowInfo};

/// Récupère les informations de la fenêtre Wakfu (position, taille, état)
#[tauri::command]
pub fn get_wakfu_window_info() -> Result<WakfuWindowInfo, String> {
    debug!("[OverlayCommands] get_wakfu_window_info appelée");

    let info = find_wakfu_window();

    if info.found {
        debug!(
            x = info.x,
            y = info.y,
            width = info.width,
            height = info.height,
            "[OverlayCommands] Fenêtre trouvée"
        );
    } else {
        debug!("[OverlayCommands] Fenêtre Wakfu non trouvée");
    }

    Ok(info)
}

/// Bascule le mode click-through (curseur passe à travers l'overlay)
#[tauri::command]
pub async fn toggle_click_through(window: Window, enabled: bool) -> Result<(), String> {
    debug!(enabled = enabled, "[OverlayCommands] toggle_click_through");

    window.set_ignore_cursor_events(enabled).map_err(|e| {
        error!(error = %e, "[OverlayCommands] Erreur set_ignore_cursor_events");
        format!("Erreur click-through: {}", e)
    })?;

    info!(enabled = enabled, "[OverlayCommands] Click-through changé");
    Ok(())
}

/// Définit si l'overlay reste toujours au-dessus
#[tauri::command]
pub async fn set_overlay_always_on_top(window: Window, enabled: bool) -> Result<(), String> {
    debug!(
        enabled = enabled,
        "[OverlayCommands] set_overlay_always_on_top"
    );

    window.set_always_on_top(enabled).map_err(|e| {
        error!(error = %e, "[OverlayCommands] Erreur set_always_on_top");
        format!("Erreur always-on-top: {}", e)
    })?;

    info!(enabled = enabled, "[OverlayCommands] Always-on-top changé");
    Ok(())
}
