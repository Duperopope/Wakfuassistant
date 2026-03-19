use std::sync::Mutex;
use std::sync::atomic::{AtomicBool, AtomicIsize, Ordering};
use serde::{Deserialize, Serialize};
use tracing::{debug, info};

// =============================================================================
// CLICK-THROUGH PARTIEL — WndProc subclass
// =============================================================================
//
// Quand CT_MODE = true, WM_NCHITTEST retourne HTTRANSPARENT pour toute la
// fenêtre SAUF la zone du bouton œil (INTERACTIVE_ZONE), qui retourne HTCLIENT.
// On ne touche pas à WS_EX_TRANSPARENT : c'est le WndProc qui filtre.
// =============================================================================

/// Mode click-through actif
pub static CT_MODE: AtomicBool = AtomicBool::new(false);

/// Zone interactive en mode CT : (x, y, w, h) en pixels CLIENT physiques
static INTERACTIVE_ZONE: Mutex<Option<(i32, i32, i32, i32)>> = Mutex::new(None);

/// WndProc original avant notre remplacement (non-nul = subclass installé)
static ORIGINAL_WNDPROC: AtomicIsize = AtomicIsize::new(0);

/// Notre WndProc : intercepte WM_NCHITTEST en mode CT pour le click-through partiel.
#[cfg(windows)]
unsafe extern "system" fn overlay_wndproc(
    hwnd: windows::Win32::Foundation::HWND,
    msg: u32,
    wparam: windows::Win32::Foundation::WPARAM,
    lparam: windows::Win32::Foundation::LPARAM,
) -> windows::Win32::Foundation::LRESULT {
    use windows::Win32::Foundation::{LRESULT, RECT};
    use windows::Win32::UI::WindowsAndMessaging::{
        CallWindowProcW, DefWindowProcW, GetWindowRect,
        WM_NCHITTEST, HTCLIENT, HTTRANSPARENT,
    };

    if msg == WM_NCHITTEST && CT_MODE.load(Ordering::Relaxed) {
        // Coordonnées écran encodées dans LPARAM (MAKELPARAM)
        let screen_x = (lparam.0 & 0xFFFF) as i16 as i32;
        let screen_y = ((lparam.0 >> 16) & 0xFFFF) as i16 as i32;

        // Conversion écran → client : pour une fenêtre sans décorations,
        // les coordonnées client = coordonnées écran - top-left de la fenêtre
        let mut wrect = RECT::default();
        let _ = GetWindowRect(hwnd, &mut wrect);
        let client_x = screen_x - wrect.left;
        let client_y = screen_y - wrect.top;

        // Vérifier si le curseur est dans la zone interactive (bouton œil)
        if let Ok(guard) = INTERACTIVE_ZONE.lock() {
            if let Some((zx, zy, zw, zh)) = *guard {
                if client_x >= zx && client_x < zx + zw && client_y >= zy && client_y < zy + zh {
                    tracing::trace!(category = "WIN32", client_x, client_y, "NCHITTEST → HTCLIENT (zone interactive)");
                    return LRESULT(HTCLIENT as isize);
                }
            }
        }
        tracing::trace!(category = "WIN32", client_x, client_y, "NCHITTEST → HTTRANSPARENT (click-through)");
        return LRESULT(HTTRANSPARENT as isize);
    }

    // Déléguer au WndProc original (Tauri gère drag, resize, etc.)
    let orig_raw = ORIGINAL_WNDPROC.load(Ordering::Relaxed);
    if orig_raw != 0 {
        type RawProc = unsafe extern "system" fn(
            windows::Win32::Foundation::HWND, u32,
            windows::Win32::Foundation::WPARAM,
            windows::Win32::Foundation::LPARAM,
        ) -> windows::Win32::Foundation::LRESULT;
        let orig_fn: RawProc = std::mem::transmute(orig_raw);
        CallWindowProcW(Some(orig_fn), hwnd, msg, wparam, lparam)
    } else {
        DefWindowProcW(hwnd, msg, wparam, lparam)
    }
}

/// Installe le WndProc personnalisé sur l'overlay (idempotent).
/// À appeler UNE fois depuis lib.rs::setup() après la création de la fenêtre.
#[cfg(windows)]
pub fn install_nchittest_subclass(hwnd_raw: isize) {
    use windows::Win32::Foundation::HWND;
    use windows::Win32::UI::WindowsAndMessaging::{SetWindowLongPtrW, GWLP_WNDPROC};

    if ORIGINAL_WNDPROC.load(Ordering::Relaxed) != 0 {
        return; // Déjà installé
    }
    tracing::info!(category = "WIN32", hwnd = hwnd_raw, "Installation WndProc click-through partiel");
    unsafe {
        let hwnd = HWND(hwnd_raw as *mut std::ffi::c_void);
        let old = SetWindowLongPtrW(hwnd, GWLP_WNDPROC, overlay_wndproc as *const () as isize);
        ORIGINAL_WNDPROC.store(old, Ordering::Relaxed);
    }
}

/// Active / désactive le mode click-through (côté Win32).
pub fn set_ct_mode(enabled: bool) {
    tracing::debug!(category = "WIN32", enabled, "set_ct_mode");
    CT_MODE.store(enabled, Ordering::Relaxed);
}

/// Met à jour la zone interactive (bouton œil) en pixels physiques CLIENT.
/// x, y, w, h = position dans la fenêtre overlay (top-left = 0,0).
pub fn set_interactive_zone(x: i32, y: i32, w: i32, h: i32) {
    tracing::debug!(category = "WIN32", x, y, w, h, "set_interactive_zone");
    if let Ok(mut g) = INTERACTIVE_ZONE.lock() {
        *g = Some((x, y, w, h));
    }
}

#[cfg(not(windows))]
pub fn install_nchittest_subclass(_hwnd_raw: isize) {}
#[cfg(not(windows))]
pub fn set_ct_mode(_enabled: bool) {}
#[cfg(not(windows))]
pub fn set_interactive_zone(_x: i32, _y: i32, _w: i32, _h: i32) {}

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
        let mut buf = [0u16; 512];
        let len = GetWindowTextW(hwnd, &mut buf) as usize;
        if len > 0 {
            let title = String::from_utf16_lossy(&buf[..len]);
            let title_upper = title.to_uppercase();
            if title_upper == "WAKFU" || title_upper.ends_with(" - WAKFU") {
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

/// Place l'overlay juste au-dessus de la fenêtre Wakfu dans le Z-order
/// (au-dessus de Wakfu, mais en-dessous des fenêtres système)
#[cfg(windows)]
pub fn reorder_overlay_above_wakfu(overlay_hwnd_raw: isize) -> bool {
    use windows::Win32::Foundation::HWND;
    use windows::Win32::UI::WindowsAndMessaging::{
        SetWindowPos, SWP_NOACTIVATE, SWP_NOMOVE, SWP_NOSIZE,
    };

    let info = find_wakfu_window();
    if !info.found {
        return false;
    }

    // On retrouve le HWND de Wakfu
    use std::sync::Mutex;
    static WAKFU_HWND: Mutex<Option<isize>> = Mutex::new(None);

    unsafe extern "system" fn find_cb(
        hwnd: HWND,
        _: windows::Win32::Foundation::LPARAM,
    ) -> windows::core::BOOL {
        let mut buf = [0u16; 512];
        let len =
            windows::Win32::UI::WindowsAndMessaging::GetWindowTextW(hwnd, &mut buf) as usize;
        if len > 0 {
            let title = String::from_utf16_lossy(&buf[..len]);
            let title_upper = title.to_uppercase();
            if title_upper == "WAKFU" || title_upper.ends_with(" - WAKFU") {
                *WAKFU_HWND.lock().unwrap() = Some(hwnd.0 as isize);
                return windows::core::BOOL(0);
            }
        }
        windows::core::BOOL(1)
    }

    *WAKFU_HWND.lock().unwrap() = None;
    unsafe {
        let _ = windows::Win32::UI::WindowsAndMessaging::EnumWindows(
            Some(find_cb),
            windows::Win32::Foundation::LPARAM(0),
        );
    }

    let wakfu_hwnd_val = match *WAKFU_HWND.lock().unwrap() {
        Some(v) => v,
        None => return false,
    };

    let wakfu_hwnd = HWND(wakfu_hwnd_val as *mut _);
    let overlay_hwnd = HWND(overlay_hwnd_raw as *mut _);

    unsafe {
        // Placer l'overlay juste au-dessus de Wakfu
        let _ = SetWindowPos(
            overlay_hwnd,
            Some(wakfu_hwnd),
            0,
            0,
            0,
            0,
            SWP_NOACTIVATE | SWP_NOMOVE | SWP_NOSIZE,
        );
    }

    true
}

#[cfg(not(windows))]
pub fn reorder_overlay_above_wakfu(_overlay_hwnd_raw: isize) -> bool {
    false
}

#[cfg(not(windows))]
pub fn find_wakfu_window() -> WakfuWindowInfo {
    debug!("[Win32Overlay] Plateforme non-Windows : retour stub");
    WakfuWindowInfo::default()
}
