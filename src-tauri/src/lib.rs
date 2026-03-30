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
    utils::logger::init();
    info!(version = utils::constants::APP_VERSION, "Demarrage de Wakfu Overlay v4.0.6 — Tri-window");

    let db_path = utils::paths::database_path();
    match services::database::init_database(&db_path) {
        Ok(_) => info!("Base de donnees prete"),
        Err(e) => tracing::error!(error = %e, "Echec init DB"),
    }

    tauri::Builder::default()
        .setup(|app| {
            // --- TOOLBAR window (was "main") ---
            if let Some(toolbar) = app.get_webview_window("toolbar") {
                // Click-through WndProc subclass on toolbar only
                #[cfg(windows)]
                if let Ok(hwnd) = toolbar.hwnd() {
                    services::win32_overlay::install_nchittest_subclass(hwnd.0 as isize);
                    services::win32_overlay::start_z_order_hook(hwnd.0 as isize);
                    info!("[WIN32] Subclass + Z-order hook installed on toolbar");
                }
                // Close = hide dans le tray
                let win = toolbar.clone();
                toolbar.on_window_event(move |event| {
                    if let tauri::WindowEvent::CloseRequested { api, .. } = event {
                        api.prevent_close();
                        let _ = win.hide();
                        info!("Toolbar cachee dans le tray");
                    }
                });
            }

            // --- NAVBAR window ---
            if let Some(navbar) = app.get_webview_window("navbar") {
                #[cfg(windows)]
                if let Ok(hwnd) = navbar.hwnd() {
                    services::win32_overlay::update_panel_hwnd_for_hook(hwnd.0 as isize);
                    info!("[WIN32] Navbar HWND registered for Z-order");
                }
                let win = navbar.clone();
                navbar.on_window_event(move |event| {
                    if let tauri::WindowEvent::CloseRequested { api, .. } = event {
                        api.prevent_close();
                        let _ = win.hide();
                    }
                });
            }

            Ok(())
        })
        .plugin(tauri_plugin_single_instance::init(|app, _args, _cwd| {
            if let Some(window) = app.get_webview_window("toolbar") {
                let _ = window.show();
                let _ = window.set_focus();
            }
        }))
        .plugin(tauri_plugin_store::Builder::new().build())
        .plugin(tauri_plugin_process::init())
        .plugin(tauri_plugin_global_shortcut::Builder::new().build())
        .manage(AppPipelineState(Arc::new(Mutex::new(None))))
        .invoke_handler(tauri::generate_handler![
            // Session (original)
            commands::session::get_session_stats,
            // Pipeline (original)
            commands::pipeline::start_log_pipeline,
            commands::pipeline::get_parser_health,
            commands::pipeline::get_game_state,
            commands::pipeline::force_log_rescan,
            // Overlay — original commands
            commands::overlay_commands::get_wakfu_window_info,
            commands::overlay_commands::reorder_above_wakfu,
            commands::overlay_commands::toggle_click_through,
            commands::overlay_commands::update_interactive_zone,
            commands::overlay_commands::set_overlay_always_on_top,
            // Overlay — new tri-window commands
            commands::overlay_commands::atomic_set_bounds,
            commands::overlay_commands::get_scale_factor,
            commands::overlay_commands::show_navbar_window,
            commands::overlay_commands::hide_navbar_window,
            commands::overlay_commands::position_navbar_below_toolbar,
            commands::overlay_commands::create_panel_window,
            commands::overlay_commands::show_panel_window,
            commands::overlay_commands::hide_panel_window,
            commands::overlay_commands::destroy_panel_window,
            commands::overlay_commands::position_panel_above_navbar,
            // CDN (original)
            commands::cdn_commands::get_cdn_version,
            commands::cdn_commands::refresh_cdn_cache,
            commands::cdn_commands::get_item_name,
            commands::cdn_commands::refresh_recipes_cache,
            commands::cdn_commands::get_recipe_by_item_id,
            // Log (original)
            commands::log_commands::set_verbose_logging,
            commands::log_commands::bridge_log,
            // HDV — marché v2
            commands::hdv_commands::get_hdv_stats,
            commands::hdv_commands::search_hdv_items,
            commands::hdv_commands::get_item_detail,
            // Patrimoine
            commands::patrimoine_commands::get_patrimoine_summary,
            commands::patrimoine_commands::get_patrimoine_items,
        ])
        .run(tauri::generate_context!())
        .expect("Erreur au lancement de Wakfu Overlay");
}
