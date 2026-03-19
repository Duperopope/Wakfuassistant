use serde::{Deserialize, Serialize};
use tracing::debug;

/// Informations sur la fenêtre Wakfu détectée
#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct WakfuWindowInfo {
    pub found: bool,
    pub x: i32,
    pub y: i32,
    pub width: i32,
    pub height: i32,
    pub is_minimized: bool,
    pub is_visible: bool,
    pub title: String,
}

impl Default for WakfuWindowInfo {
    fn default() -> Self {
        Self {
            found: false,
            x: 0,
            y: 0,
            width: 0,
            height: 0,
            is_minimized: false,
            is_visible: false,
            title: String::new(),
        }
    }
}

#[cfg(windows)]
pub fn find_wakfu_window() -> WakfuWindowInfo {
    use windows::core::PCWSTR;
    use windows::Win32::Foundation::RECT;
    use windows::Win32::UI::WindowsAndMessaging::{
        FindWindowW, GetWindowRect, GetWindowTextW, IsIconic, IsWindowVisible,
    };

    debug!("[Win32Overlay] Recherche de la fenêtre Wakfu");

    // Tentative : FindWindowW avec titre "WAKFU"
    let window_name = wide_string("WAKFU");
    let hwnd_result = unsafe { FindWindowW(None, PCWSTR(window_name.as_ptr())) };

    let hwnd = match hwnd_result {
        Ok(h) => h,
        Err(_) => {
            debug!("[Win32Overlay] FindWindowW échouée");
            return WakfuWindowInfo::default();
        }
    };

    if hwnd.is_invalid() {
        debug!("[Win32Overlay] HWND invalide");
        return WakfuWindowInfo::default();
    }

    debug!("[Win32Overlay] Fenêtre trouvée");

    let mut rect = RECT::default();
    let mut title_buffer = [0u16; 256];

    unsafe {
        // Position et taille
        if let Ok(()) = GetWindowRect(hwnd, &mut rect) {
            debug!(
                x = rect.left,
                y = rect.top,
                width = rect.right - rect.left,
                height = rect.bottom - rect.top,
                "[Win32Overlay] GetWindowRect OK"
            );
        }

        // Titre
        let title_len = GetWindowTextW(hwnd, &mut title_buffer) as usize;
        let title = if title_len > 0 {
            String::from_utf16_lossy(&title_buffer[..title_len]).to_string()
        } else {
            "WAKFU".to_string()
        };

        let is_minimized = IsIconic(hwnd).as_bool();
        let is_visible = IsWindowVisible(hwnd).as_bool();

        debug!(
            minimized = is_minimized,
            visible = is_visible,
            "[Win32Overlay] État de la fenêtre"
        );

        WakfuWindowInfo {
            found: true,
            x: rect.left,
            y: rect.top,
            width: rect.right - rect.left,
            height: rect.bottom - rect.top,
            is_minimized,
            is_visible,
            title,
        }
    }
}

#[cfg(windows)]
fn wide_string(s: &str) -> Vec<u16> {
    use std::os::windows::ffi::OsStrExt;
    std::ffi::OsStr::new(s)
        .encode_wide()
        .chain(Some(0))
        .collect()
}

#[cfg(not(windows))]
pub fn find_wakfu_window() -> WakfuWindowInfo {
    debug!("[Win32Overlay] Plateforme non-Windows : retour stub");
    WakfuWindowInfo::default()
}
