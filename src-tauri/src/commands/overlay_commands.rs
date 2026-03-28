// overlay_commands.rs — Tri-window overlay commands v4.0.6

use tauri::{AppHandle, Emitter, Manager, WebviewWindowBuilder, WebviewUrl};
use std::sync::Mutex;

#[cfg(target_os = "windows")]
use crate::services::win32_overlay;

static LAST_FOUND: Mutex<Option<bool>> = Mutex::new(None);

// -- Detection Wakfu --

#[tauri::command]
pub fn get_wakfu_window_info() -> Result<serde_json::Value, String> {
    #[cfg(target_os = "windows")]
    {
        let info = win32_overlay::find_wakfu_window();
        let found = info.found;
        let mut last = LAST_FOUND.lock().unwrap();
        if *last != Some(found) {
            tracing::info!("[OVERLAY] Wakfu detection changed: {}", found);
            *last = Some(found);
        }
        if info.found {
            serde_json::to_value(info).map_err(|e| e.to_string())
        } else {
            Ok(serde_json::json!(null))
        }
    }
    #[cfg(not(target_os = "windows"))]
    Ok(serde_json::json!(null))
}

// -- Z-order --

#[tauri::command]
pub fn reorder_above_wakfu(app: AppHandle) -> Result<(), String> {
    #[cfg(target_os = "windows")]
    {
        for label in &["toolbar", "navbar", "panel"] {
            if let Some(win) = app.get_webview_window(label) {
                if let Ok(hwnd) = win.hwnd() {
                    win32_overlay::reorder_overlay_above_wakfu(hwnd.0 as isize);
                }
            }
        }
    }
    let _ = app;
    Ok(())
}

// -- Click-through --

#[tauri::command]
pub fn toggle_click_through(app: AppHandle, enabled: bool) -> Result<(), String> {
    #[cfg(target_os = "windows")]
    {
        if let Some(win) = app.get_webview_window("toolbar") {
            if let Ok(hwnd) = win.hwnd() {
                win32_overlay::install_nchittest_subclass(hwnd.0 as isize);
            }
        }
        win32_overlay::set_ct_mode(enabled);
        tracing::info!("[OVERLAY] click-through = {}", enabled);
        let _ = app.emit("ct-state-changed", enabled);
    }
    let _ = (app, enabled);
    Ok(())
}

// -- Interactive zone --

#[tauri::command]
pub fn update_interactive_zone(x: i32, y: i32, w: i32, h: i32) -> Result<(), String> {
    #[cfg(target_os = "windows")]
    win32_overlay::set_interactive_zone(x, y, w, h);
    let _ = (x, y, w, h);
    Ok(())
}

// -- Always on top (pin) --

#[tauri::command]
pub fn set_overlay_always_on_top(app: AppHandle, on_top: bool) -> Result<(), String> {
    #[cfg(target_os = "windows")]
    win32_overlay::set_pinned_state(on_top);

    for label in &["toolbar", "navbar", "panel"] {
        if let Some(win) = app.get_webview_window(label) {
            let _ = win.set_always_on_top(on_top);
        }
    }
    tracing::info!("[OVERLAY] always_on_top = {}", on_top);
    Ok(())
}

// -- Window bounds --

#[tauri::command]
pub fn atomic_set_bounds(app: AppHandle, x: i32, y: i32, width: i32, height: i32) -> Result<(), String> {
    #[cfg(target_os = "windows")]
    {
        if let Some(win) = app.get_webview_window("toolbar") {
            if let Ok(hwnd) = win.hwnd() {
                win32_overlay::set_window_bounds(hwnd.0 as isize, x, y, width, height);
            }
        }
    }
    let _ = (app, x, y, width, height);
    Ok(())
}

// -- Scale factor --

#[tauri::command]
pub fn get_scale_factor(app: AppHandle) -> Result<f64, String> {
    let win = app.get_webview_window("toolbar")
        .ok_or("toolbar window not found")?;
    win.scale_factor().map_err(|e| e.to_string())
}

// -- Navbar window management --

#[tauri::command]
pub async fn show_navbar_window(app: AppHandle) -> Result<(), String> {
    if let Some(win) = app.get_webview_window("navbar") {
        win.show().map_err(|e| e.to_string())?;
    }
    Ok(())
}

#[tauri::command]
pub async fn hide_navbar_window(app: AppHandle) -> Result<(), String> {
    if let Some(win) = app.get_webview_window("navbar") {
        win.hide().map_err(|e| e.to_string())?;
    }
    Ok(())
}

#[tauri::command]
pub async fn position_navbar_below_toolbar(app: AppHandle) -> Result<(), String> {
    let toolbar = app.get_webview_window("toolbar")
        .ok_or("toolbar not found")?;
    let navbar = app.get_webview_window("navbar")
        .ok_or("navbar not found")?;

    let pos = toolbar.outer_position().map_err(|e| e.to_string())?;
    let size = toolbar.outer_size().map_err(|e| e.to_string())?;

    let navbar_x = pos.x;
    let navbar_y = pos.y + size.height as i32;

    navbar.set_position(tauri::PhysicalPosition::new(navbar_x, navbar_y))
        .map_err(|e| e.to_string())?;
    navbar.set_size(tauri::PhysicalSize::new(size.width, 72))
        .map_err(|e| e.to_string())?;

    Ok(())
}

// -- Panel window management --

#[tauri::command]
pub async fn create_panel_window(app: AppHandle, x: f64, y: f64, width: f64, height: f64) -> Result<(), String> {
    if let Some(win) = app.get_webview_window("panel") {
        win.show().map_err(|e| e.to_string())?;
        win.set_position(tauri::PhysicalPosition::new(x as i32, y as i32))
            .map_err(|e| e.to_string())?;
        win.set_size(tauri::PhysicalSize::new(width as u32, height as u32))
            .map_err(|e| e.to_string())?;
        tracing::info!("[OVERLAY] panel reused at ({}, {})", x, y);
        return Ok(());
    }

    let scale = get_scale_factor(app.clone()).unwrap_or(1.0);
    let logical_w = width / scale;
    let logical_h = height / scale;

    let panel = WebviewWindowBuilder::new(
        &app,
        "panel",
        WebviewUrl::App("index.html".into()),
    )
    .title("Wakfu Overlay - Panel")
    .inner_size(logical_w, logical_h)
    .decorations(false)
    .transparent(true)
    .always_on_top(false)
    .resizable(false)
    .visible(false)
    .skip_taskbar(true)
    .build()
    .map_err(|e| format!("Failed to create panel: {}", e))?;

    panel.set_position(tauri::PhysicalPosition::new(x as i32, y as i32))
        .map_err(|e| e.to_string())?;

    if let Some(toolbar) = app.get_webview_window("toolbar") {
        if let Ok(true) = toolbar.is_always_on_top() {
            let _ = panel.set_always_on_top(true);
        }
    }

    #[cfg(target_os = "windows")]
    {
        if let Ok(hwnd) = panel.hwnd() {
            win32_overlay::update_panel_hwnd_for_hook(hwnd.0 as isize);
        }
    }

    panel.show().map_err(|e| e.to_string())?;
    tracing::info!("[OVERLAY] panel created at ({}, {}) size {}x{}", x, y, width, height);
    Ok(())
}

#[tauri::command]
pub async fn show_panel_window(app: AppHandle) -> Result<(), String> {
    if let Some(win) = app.get_webview_window("panel") {
        win.show().map_err(|e| e.to_string())?;
    }
    Ok(())
}

#[tauri::command]
pub async fn hide_panel_window(app: AppHandle) -> Result<(), String> {
    if let Some(win) = app.get_webview_window("panel") {
        win.hide().map_err(|e| e.to_string())?;
    }
    Ok(())
}

#[tauri::command]
pub async fn destroy_panel_window(app: AppHandle) -> Result<(), String> {
    if let Some(win) = app.get_webview_window("panel") {
        win.destroy().map_err(|e| e.to_string())?;
    }
    Ok(())
}

#[tauri::command]
pub async fn position_panel_above_navbar(app: AppHandle, panel_height: f64) -> Result<(), String> {
    let navbar = app.get_webview_window("navbar")
        .ok_or("navbar not found")?;
    let panel = app.get_webview_window("panel")
        .ok_or("panel not found")?;

    let pos = navbar.outer_position().map_err(|e| e.to_string())?;
    let size = navbar.outer_size().map_err(|e| e.to_string())?;

    let panel_x = pos.x;
    let panel_y = pos.y - panel_height as i32;

    panel.set_position(tauri::PhysicalPosition::new(panel_x, panel_y))
        .map_err(|e| e.to_string())?;
    panel.set_size(tauri::PhysicalSize::new(size.width, panel_height as u32))
        .map_err(|e| e.to_string())?;

    Ok(())
}