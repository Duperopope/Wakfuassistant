use tauri::Window;
use tracing::{debug, error, info};

use crate::services::win32_overlay::{
    find_wakfu_window, reorder_overlay_above_wakfu, WakfuWindowInfo,
    install_nchittest_subclass, set_ct_mode, set_interactive_zone,
};

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

/// Bascule le mode click-through (curseur passe à travers l'overlay).
///
/// Sur Windows : utilise le WndProc subclass (WM_NCHITTEST) pour un click-through
/// PARTIEL — le bouton œil reste interactif même en mode CT.
/// Sur les autres plateformes : fallback sur set_ignore_cursor_events (fenêtre entière).
#[tauri::command]
pub async fn toggle_click_through(window: Window, enabled: bool) -> Result<(), String> {
    debug!(category = "COMMANDS", enabled, "toggle_click_through ▶");

    #[cfg(windows)]
    {
        // Installer le subclass si pas encore fait (lazy, idempotent)
        match window.hwnd() {
            Ok(hwnd) => install_nchittest_subclass(hwnd.0 as isize),
            Err(e) => debug!(error = %e, "hwnd() indisponible — subclass ignoré"),
        }
        // Activer/désactiver le mode CT dans le WndProc Win32
        set_ct_mode(enabled);
        // S'assurer que WS_EX_TRANSPARENT est RETIRÉ (on gère CT via WndProc)
        window.set_ignore_cursor_events(false).map_err(|e| {
            error!(error = %e, "Erreur set_ignore_cursor_events(false)");
            format!("Erreur click-through: {e}")
        })?;
    }

    #[cfg(not(windows))]
    {
        // Fallback non-Windows : toute la fenêtre en CT (bouton œil inaccessible)
        window.set_ignore_cursor_events(enabled).map_err(|e| {
            error!(error = %e, "Erreur set_ignore_cursor_events");
            format!("Erreur click-through: {e}")
        })?;
    }

    info!(category = "COMMANDS", enabled, "toggle_click_through ✓");
    Ok(())
}

/// Met à jour la zone interactive du bouton œil (en pixels physiques client).
/// Appelé depuis le frontend quand la fenêtre est créée, redimensionnée ou fold change.
/// x, y, w, h = position dans la fenêtre overlay (top-left = 0,0), pixels physiques.
#[tauri::command]
pub fn update_interactive_zone(x: i32, y: i32, w: i32, h: i32) {
    debug!(category = "COMMANDS", x, y, w, h, "update_interactive_zone ▶");
    set_interactive_zone(x, y, w, h);
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

/// Place l'overlay juste au-dessus de Wakfu (Z-order natif Win32)
#[tauri::command]
pub fn reorder_above_wakfu(window: Window) -> Result<bool, String> {
    #[cfg(windows)]
    {
        let hwnd = window.hwnd().map_err(|e| format!("hwnd: {}", e))?;
        Ok(reorder_overlay_above_wakfu(hwnd.0 as isize))
    }
    #[cfg(not(windows))]
    {
        let _ = window;
        Ok(false)
    }
}
