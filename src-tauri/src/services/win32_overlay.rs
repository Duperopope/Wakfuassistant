use serde::{Deserialize, Serialize};
use tracing::{debug, info};

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
    /// DPI du moniteur où se trouve la fenêtre (96 = 100%, 144 = 150%, etc.)
    pub dpi: u32,
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
            dpi: 96,
        }
    }
}

#[cfg(windows)]
pub fn find_wakfu_window() -> WakfuWindowInfo {
    use windows::Win32::Foundation::{HWND, LPARAM, RECT};
    use windows::Win32::UI::WindowsAndMessaging::{
        EnumWindows, GetWindowRect, GetWindowTextW, IsIconic, IsWindowVisible,
    };
    use std::sync::Mutex;

    debug!("[Win32Overlay] Recherche de la fenêtre Wakfu");

    static FOUND: Mutex<Option<isize>> = Mutex::new(None);
    *FOUND.lock().unwrap() = None;

    unsafe extern "system" fn enum_callback(hwnd: HWND, _: LPARAM) -> windows::core::BOOL {
        let mut buf = [0u16; 256];
        let len = GetWindowTextW(hwnd, &mut buf) as usize;
        if len > 0 {
            let title = String::from_utf16_lossy(&buf[..len]);
            if title == "WAKFU" || title.ends_with(" - WAKFU") {
                *FOUND.lock().unwrap() = Some(hwnd.0 as isize);
                return windows::core::BOOL(0);
            }
        }
        windows::core::BOOL(1)
    }

    unsafe {
        let _ = EnumWindows(Some(enum_callback), LPARAM(0));
    }

    let hwnd_val = match *FOUND.lock().unwrap() {
        Some(v) => v,
        None => {
            debug!("[Win32Overlay] Fenêtre Wakfu non trouvée");
            return WakfuWindowInfo::default();
        }
    };

    let hwnd = HWND(hwnd_val as *mut _);

    let mut rect = RECT::default();
    let mut title_buffer = [0u16; 256];

    unsafe {
        if let Err(e) = GetWindowRect(hwnd, &mut rect) {
            info!(error = %e, "[Win32Overlay] GetWindowRect échouée");
            return WakfuWindowInfo::default();
        }

        let title_len = GetWindowTextW(hwnd, &mut title_buffer) as usize;
        let title = if title_len > 0 {
            String::from_utf16_lossy(&title_buffer[..title_len]).to_string()
        } else {
            "WAKFU".to_string()
        };

        let is_minimized = IsIconic(hwnd).as_bool();
        let is_visible = IsWindowVisible(hwnd).as_bool();

        // Récupérer le DPI du moniteur
        let dpi = get_monitor_dpi(hwnd);

        debug!(
            title = %title,
            x = rect.left, y = rect.top,
            w = rect.right - rect.left, h = rect.bottom - rect.top,
            dpi = dpi,
            minimized = is_minimized, visible = is_visible,
            "[Win32Overlay] Fenêtre Wakfu détectée"
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
            dpi,
        }
    }
}

#[cfg(windows)]
unsafe fn get_monitor_dpi(hwnd: windows::Win32::Foundation::HWND) -> u32 {
    let dpi = get_dpi_for_window(hwnd);
    if dpi > 0 {
        return dpi;
    }
    96
}

#[cfg(windows)]
unsafe fn get_dpi_for_window(hwnd: windows::Win32::Foundation::HWND) -> u32 {
    // Charger dynamiquement GetDpiForWindow depuis user32.dll
    use std::ffi::CString;
    use windows::Win32::System::LibraryLoader::{GetProcAddress, GetModuleHandleA};
    use windows::core::PCSTR;

    let module_name = CString::new("user32.dll").unwrap();
    let module = GetModuleHandleA(PCSTR(module_name.as_ptr() as *const u8));
    let module = match module {
        Ok(m) => m,
        Err(_) => return 0,
    };

    let func_name = CString::new("GetDpiForWindow").unwrap();
    let func = GetProcAddress(module, PCSTR(func_name.as_ptr() as *const u8));
    match func {
        Some(f) => {
            let get_dpi: unsafe extern "system" fn(windows::Win32::Foundation::HWND) -> u32 =
                std::mem::transmute(f);
            get_dpi(hwnd)
        }
        None => 0,
    }
}

#[cfg(not(windows))]
pub fn find_wakfu_window() -> WakfuWindowInfo {
    debug!("[Win32Overlay] Plateforme non-Windows : retour stub");
    WakfuWindowInfo::default()
}
