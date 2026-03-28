use std::sync::Mutex;
use std::sync::atomic::{AtomicBool, AtomicIsize, Ordering};
use serde::{Deserialize, Serialize};
use tracing::{debug, info, warn};

// =============================================================================
// Z-ORDER HOOK — WinEvent sur EVENT_SYSTEM_FOREGROUND
// Principe : TOPMOST quand Wakfu a le focus, NOTOPMOST sinon.
// Cela permet à l'overlay d'être au-dessus de Wakfu mais sous les autres apps.
// Le "pin" utilisateur (set_pinned_state=true) désactive le NOTOPMOST automatique.
// =============================================================================

// HWNDs trackés par le hook (mis à jour depuis le thread Tauri principal)
static MAIN_HWND_FOR_HOOK:  AtomicIsize = AtomicIsize::new(0);
static PANEL_HWND_FOR_HOOK: AtomicIsize = AtomicIsize::new(0);
// État pin : si true, le hook ne retire jamais le TOPMOST
pub static PINNED_STATE: AtomicBool = AtomicBool::new(false);

pub fn set_pinned_state(pinned: bool) {
    PINNED_STATE.store(pinned, Ordering::Relaxed);
}

pub fn update_panel_hwnd_for_hook(panel_hwnd: isize) {
    PANEL_HWND_FOR_HOOK.store(panel_hwnd, Ordering::Relaxed);
}

#[cfg(windows)]
pub fn start_z_order_hook(main_hwnd: isize) {
    MAIN_HWND_FOR_HOOK.store(main_hwnd, Ordering::Relaxed);
    std::thread::spawn(|| {
        unsafe {
            use windows::Win32::UI::Accessibility::SetWinEventHook;
            use windows::Win32::Foundation::HMODULE;
            use windows::Win32::UI::WindowsAndMessaging::{GetMessageW, TranslateMessage, DispatchMessageW, MSG};

            // EVENT_SYSTEM_FOREGROUND = 3, WINEVENT_OUTOFCONTEXT = 0
            let _hook = SetWinEventHook(
                3u32,
                3u32,
                Some(HMODULE(std::ptr::null_mut())),
                Some(on_foreground_changed),
                0, 0,
                0u32,
            );

            let mut msg = MSG::default();
            loop {
                let r = GetMessageW(&mut msg, None, 0, 0);
                if r.0 <= 0 { break; }
                let _ = TranslateMessage(&msg);
                DispatchMessageW(&msg);
            }
        }
    });
    info!(category = "WIN32", "Z-order WinEvent hook installe");
}

#[cfg(windows)]
unsafe extern "system" fn on_foreground_changed(
    _: windows::Win32::UI::Accessibility::HWINEVENTHOOK,
    _: u32,
    hwnd: windows::Win32::Foundation::HWND,
    _: i32, _: i32, _: u32, _: u32,
) {
    use windows::Win32::UI::WindowsAndMessaging::*;
    use windows::Win32::Foundation::HWND;

    let main_raw  = MAIN_HWND_FOR_HOOK.load(Ordering::Relaxed);
    let panel_raw = PANEL_HWND_FOR_HOOK.load(Ordering::Relaxed);
    if main_raw == 0 { return; }

    let hwnd_val = hwnd.0 as isize;

    // Si l'overlay lui-même passe au premier plan, ne rien changer
    let is_overlay = hwnd_val == main_raw || (panel_raw != 0 && hwnd_val == panel_raw);
    if is_overlay { return; }

    // Identifier si c'est Wakfu qui prend le focus
    let mut buf = [0u16; 256];
    let len = GetWindowTextW(hwnd, &mut buf) as usize;
    let title = if len > 0 { String::from_utf16_lossy(&buf[..len]).to_uppercase() } else { String::new() };
    let is_wakfu = title == "WAKFU" || title.ends_with(" - WAKFU");

    let main  = HWND(main_raw as *mut _);
    let panel_opt = if panel_raw != 0 { Some(HWND(panel_raw as *mut _)) } else { None };

    let apply = |win: HWND, insert: HWND| {
        let _ = SetWindowPos(win, Some(insert), 0, 0, 0, 0,
            SWP_NOACTIVATE | SWP_NOMOVE | SWP_NOSIZE);
    };

    if is_wakfu {
        // Wakfu au premier plan → TOPMOST pour être au-dessus
        apply(main, HWND_TOPMOST);
        if let Some(p) = panel_opt { apply(p, HWND_TOPMOST); }
    } else if !PINNED_STATE.load(Ordering::Relaxed) {
        // Autre app au premier plan, pas pinné → retirer TOPMOST
        apply(main, HWND_NOTOPMOST);
        if let Some(p) = panel_opt { apply(p, HWND_NOTOPMOST); }
        // Positionner l'overlay juste EN DESSOUS de la fenêtre foreground
        // → overlay reste au-dessus de Wakfu mais sous toutes les autres apps
        apply(main, hwnd);
        if let Some(p) = panel_opt { apply(p, hwnd); }
    }
    // Si pinné : conserver l'état TOPMOST même quand une autre app prend le focus
}

#[cfg(not(windows))]
pub fn start_z_order_hook(_: isize) {}
#[cfg(not(windows))]
pub fn update_panel_hwnd_for_hook(_: isize) {}

// =============================================================================
// CLICK-THROUGH PARTIEL via WndProc subclass
// =============================================================================

pub static CT_MODE: AtomicBool = AtomicBool::new(false);
static INTERACTIVE_ZONE: Mutex<Option<(i32, i32, i32, i32)>> = Mutex::new(None);
static ORIGINAL_WNDPROC: AtomicIsize = AtomicIsize::new(0);

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
        let screen_x = (lparam.0 & 0xFFFF) as i16 as i32;
        let screen_y = ((lparam.0 >> 16) & 0xFFFF) as i16 as i32;
        let mut wrect = RECT::default();
        let _ = GetWindowRect(hwnd, &mut wrect);
        let cx = screen_x - wrect.left;
        let cy = screen_y - wrect.top;
        if let Ok(guard) = INTERACTIVE_ZONE.lock() {
            if let Some((zx, zy, zw, zh)) = *guard {
                if cx >= zx && cx < zx + zw && cy >= zy && cy < zy + zh {
                    return LRESULT(HTCLIENT as isize);
                }
            }
        }
        return LRESULT(HTTRANSPARENT as isize);
    }
    let orig = ORIGINAL_WNDPROC.load(Ordering::Relaxed);
    if orig != 0 {
        type P = unsafe extern "system" fn(windows::Win32::Foundation::HWND, u32, windows::Win32::Foundation::WPARAM, windows::Win32::Foundation::LPARAM) -> windows::Win32::Foundation::LRESULT;
        let f: P = std::mem::transmute(orig);
        CallWindowProcW(Some(f), hwnd, msg, wparam, lparam)
    } else { DefWindowProcW(hwnd, msg, wparam, lparam) }
}

#[cfg(windows)]
pub fn install_nchittest_subclass(hwnd_raw: isize) {
    use windows::Win32::Foundation::HWND;
    use windows::Win32::UI::WindowsAndMessaging::{SetWindowLongPtrW, GWLP_WNDPROC};
    if ORIGINAL_WNDPROC.load(Ordering::Relaxed) != 0 { return; }
    info!(category = "WIN32", hwnd = hwnd_raw, "Installation WndProc click-through");
    unsafe {
        let hwnd = HWND(hwnd_raw as *mut std::ffi::c_void);
        let old = SetWindowLongPtrW(hwnd, GWLP_WNDPROC, overlay_wndproc as *const () as isize);
        ORIGINAL_WNDPROC.store(old, Ordering::Relaxed);
    }
}

pub fn set_ct_mode(enabled: bool) {
    debug!(category = "WIN32", enabled, "set_ct_mode");
    CT_MODE.store(enabled, Ordering::Relaxed);
}

pub fn set_interactive_zone(x: i32, y: i32, w: i32, h: i32) {
    if let Ok(mut g) = INTERACTIVE_ZONE.lock() { *g = Some((x, y, w, h)); }
}

#[cfg(not(windows))]
pub fn install_nchittest_subclass(_: isize) {}
#[cfg(not(windows))]
pub fn set_ct_mode(_: bool) {}
#[cfg(not(windows))]
pub fn set_interactive_zone(_: i32, _: i32, _: i32, _: i32) {}

// =============================================================================
// SET WINDOW BOUNDS — position + taille en UN SEUL APPEL Win32
// Résout le problème de drift quand on fait setSize + setPosition séparément
// =============================================================================

#[cfg(windows)]
pub fn set_window_bounds(hwnd_raw: isize, x: i32, y: i32, w: i32, h: i32) -> bool {
    use windows::Win32::Foundation::HWND;
    use windows::Win32::UI::WindowsAndMessaging::{SetWindowPos, SWP_NOZORDER, SWP_NOACTIVATE};
    unsafe {
        let hwnd = HWND(hwnd_raw as *mut std::ffi::c_void);
        SetWindowPos(hwnd, None, x, y, w, h, SWP_NOZORDER | SWP_NOACTIVATE).is_ok()
    }
}

#[cfg(not(windows))]
pub fn set_window_bounds(_: isize, _: i32, _: i32, _: i32, _: i32) -> bool { false }

// =============================================================================
// Detection fenetre Wakfu
// =============================================================================

#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct WakfuWindowInfo {
    pub found: bool, pub x: i32, pub y: i32,
    pub width: i32, pub height: i32,
    pub is_minimized: bool, pub is_visible: bool,
    pub title: String, pub dpi: u32,
}
impl Default for WakfuWindowInfo {
    fn default() -> Self {
        Self { found: false, x: 0, y: 0, width: 0, height: 0,
               is_minimized: false, is_visible: false, title: String::new(), dpi: 96 }
    }
}

#[cfg(windows)]
pub fn find_wakfu_window() -> WakfuWindowInfo {
    use windows::Win32::Foundation::{HWND, LPARAM, RECT};
    use windows::Win32::UI::WindowsAndMessaging::*;
    use std::sync::Mutex;
    static FOUND: Mutex<Option<isize>> = Mutex::new(None);
    *FOUND.lock().unwrap() = None;
    unsafe extern "system" fn cb(hwnd: HWND, _: LPARAM) -> windows::core::BOOL {
        let mut buf = [0u16; 512];
        let len = GetWindowTextW(hwnd, &mut buf) as usize;
        if len > 0 {
            let t = String::from_utf16_lossy(&buf[..len]).to_uppercase();
            if t == "WAKFU" || t.ends_with(" - WAKFU") {
                *FOUND.lock().unwrap() = Some(hwnd.0 as isize);
                return windows::core::BOOL(0);
            }
        }
        windows::core::BOOL(1)
    }
    unsafe { let _ = EnumWindows(Some(cb), LPARAM(0)); }
    let v = match *FOUND.lock().unwrap() { Some(v) => v, None => return WakfuWindowInfo::default() };
    let hwnd = HWND(v as *mut _);
    let mut r = RECT::default();
    let mut tb = [0u16; 256];
    unsafe {
        if GetWindowRect(hwnd, &mut r).is_err() { return WakfuWindowInfo::default(); }
        let tl = GetWindowTextW(hwnd, &mut tb) as usize;
        let title = if tl > 0 { String::from_utf16_lossy(&tb[..tl]) } else { "WAKFU".into() };
        WakfuWindowInfo { found: true, x: r.left, y: r.top,
            width: r.right - r.left, height: r.bottom - r.top,
            is_minimized: IsIconic(hwnd).as_bool(), is_visible: IsWindowVisible(hwnd).as_bool(),
            title, dpi: get_monitor_dpi(hwnd) }
    }
}

#[cfg(windows)]
unsafe fn get_monitor_dpi(hwnd: windows::Win32::Foundation::HWND) -> u32 {
    use std::ffi::CString;
    use windows::Win32::System::LibraryLoader::{GetProcAddress, GetModuleHandleA};
    use windows::core::PCSTR;
    let mn = CString::new("user32.dll").unwrap();
    let m = match GetModuleHandleA(PCSTR(mn.as_ptr() as *const u8)) { Ok(m) => m, Err(_) => return 96 };
    let fn_name = CString::new("GetDpiForWindow").unwrap();
    match GetProcAddress(m, PCSTR(fn_name.as_ptr() as *const u8)) {
        Some(f) => { let gd: unsafe extern "system" fn(windows::Win32::Foundation::HWND) -> u32 = std::mem::transmute(f); let d = gd(hwnd); if d > 0 { d } else { 96 } }
        None => 96,
    }
}

// =============================================================================
// Z-ORDER
// =============================================================================

#[cfg(windows)]
pub fn reorder_overlay_above_wakfu(overlay_hwnd_raw: isize) -> bool {
    use windows::Win32::Foundation::HWND;
    use windows::Win32::UI::WindowsAndMessaging::*;
    use std::sync::Mutex;
    static WH: Mutex<Option<isize>> = Mutex::new(None);
    unsafe extern "system" fn fcb(hwnd: HWND, _: windows::Win32::Foundation::LPARAM) -> windows::core::BOOL {
        let mut buf = [0u16; 512];
        let len = GetWindowTextW(hwnd, &mut buf) as usize;
        if len > 0 {
            let t = String::from_utf16_lossy(&buf[..len]).to_uppercase();
            if t == "WAKFU" || t.ends_with(" - WAKFU") {
                *WH.lock().unwrap() = Some(hwnd.0 as isize);
                return windows::core::BOOL(0);
            }
        }
        windows::core::BOOL(1)
    }
    *WH.lock().unwrap() = None;
    unsafe { let _ = EnumWindows(Some(fcb), windows::Win32::Foundation::LPARAM(0)); }
    let wv = match *WH.lock().unwrap() { Some(v) => v, None => return false };

    // Wakfu trouvé — appliquer le Z-order selon l'état du focus courant (fallback poll)
    unsafe {
        let overlay = HWND(overlay_hwnd_raw as *mut _);
        let fg = GetForegroundWindow();
        let fg_val = fg.0 as isize;
        let mut buf = [0u16; 256];
        let len = GetWindowTextW(fg, &mut buf) as usize;
        let title = if len > 0 { String::from_utf16_lossy(&buf[..len]).to_uppercase() } else { String::new() };
        let fg_is_wakfu = title == "WAKFU" || title.ends_with(" - WAKFU");
        let fg_is_overlay = fg_val == overlay_hwnd_raw;

        if fg_is_wakfu || fg_is_overlay {
            let _ = SetWindowPos(overlay, Some(HWND_TOPMOST), 0, 0, 0, 0,
                SWP_NOACTIVATE | SWP_NOMOVE | SWP_NOSIZE);
        } else if !PINNED_STATE.load(Ordering::Relaxed) {
            let _ = SetWindowPos(overlay, Some(HWND_NOTOPMOST), 0, 0, 0, 0,
                SWP_NOACTIVATE | SWP_NOMOVE | SWP_NOSIZE);
            // Placer l'overlay juste sous la fenêtre foreground courante
            let _ = SetWindowPos(overlay, Some(fg), 0, 0, 0, 0,
                SWP_NOACTIVATE | SWP_NOMOVE | SWP_NOSIZE);
        }
        let _ = wv; // Wakfu hwnd confirmé, utilisé implicitement
    }
    true
}

#[cfg(not(windows))]
pub fn find_wakfu_window() -> WakfuWindowInfo { WakfuWindowInfo::default() }
#[cfg(not(windows))]
pub fn reorder_overlay_above_wakfu(_: isize) -> bool { false }
