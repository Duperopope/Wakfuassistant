# ============================================================
# AutoRightClick.ps1 v3.1
# Numpad 0      = maintenir pour spam clic droit
# Numpad .       = toggle ON/OFF spam clic droit continu
# Intervalle    : 8 à 10 ms (aléatoire)
# Echap         = quitter
# ============================================================

Add-Type @"
using System;
using System.Runtime.InteropServices;

public static class NativeMethods {
    [DllImport("user32.dll")]
    public static extern short GetAsyncKeyState(int vKey);

    [DllImport("user32.dll")]
    public static extern void mouse_event(uint dwFlags, int dx, int dy, uint dwData, UIntPtr dwExtraInfo);
}
"@

# --- Constantes touches ---
# Numpad 0 : VK_NUMPAD0 (0x60) / VK_INSERT (0x2D)
# Numpad . : VK_DECIMAL (0x6E) / VK_DELETE (0x2E)
# Source : https://learn.microsoft.com/en-us/windows/win32/inputdev/virtual-key-codes

$KEYS_PAD0   = @(0x60, 0x2D)   # Numpad 0 ou Insert
$KEYS_PADOT  = @(0x6E, 0x2E)   # Numpad . ou Delete
$VK_ESCAPE   = 0x1B

# --- Constantes souris ---
$MOUSEEVENTF_RIGHTDOWN = 0x0008
$MOUSEEVENTF_RIGHTUP   = 0x0010

# --- Fonction : vérifier si UNE des touches d'un groupe est enfoncée ---
function Test-KeyDown {
    param([int[]]$KeyCodes)
    foreach ($vk in $KeyCodes) {
        $state = [NativeMethods]::GetAsyncKeyState($vk)
        if ($state -band 0x8000) {
            return $true
        }
    }
    return $false
}

# --- Variables d'état ---
$random            = New-Object System.Random
$isClicking0       = $false       # Numpad 0 maintenu
$toggleActive      = $false       # Toggle Numpad . actif
$padDotWasDown     = $false       # Anti-rebond pour la touche .
$clickCount        = 0

# --- Affichage ---
Write-Host ""
Write-Host "============================================" -ForegroundColor Cyan
Write-Host "  AUTO RIGHT-CLICK v3.1" -ForegroundColor Green
Write-Host "============================================" -ForegroundColor Cyan
Write-Host ""
Write-Host "  Maintenir [Numpad 0] = spam clic droit" -ForegroundColor Yellow
Write-Host "  Appuyer   [Numpad .] = toggle ON/OFF spam" -ForegroundColor Magenta
Write-Host "  Appuyer   [Echap]    = quitter le script" -ForegroundColor Red
Write-Host ""
Write-Host "  Intervalle : 8 a 10 ms par clic" -ForegroundColor Gray
Write-Host "  Compatible NumLock ON et OFF" -ForegroundColor Gray
Write-Host "============================================" -ForegroundColor Cyan
Write-Host ""
Write-Host "[PRET] En attente d'action..." -ForegroundColor Green

# --- Boucle principale ---
while ($true) {

    # ---- Echap pour quitter ----
    if (Test-KeyDown @($VK_ESCAPE)) {
        Write-Host ""
        Write-Host "[QUIT] Script ferme. Total clics : $clickCount" -ForegroundColor Red
        break
    }

    # ---- Numpad . : détection toggle (front montant uniquement) ----
    $padDotIsDown = Test-KeyDown $KEYS_PADOT

    if ($padDotIsDown -and -not $padDotWasDown) {
        $toggleActive = -not $toggleActive
        if ($toggleActive) {
            Write-Host "[NUMPAD .] Toggle ON - spam clic droit actif" -ForegroundColor Magenta
        } else {
            Write-Host "[NUMPAD .] Toggle OFF - stop. Total : $clickCount" -ForegroundColor DarkGray
        }
    }
    $padDotWasDown = $padDotIsDown

    # ---- Numpad 0 : détection maintien ----
    $pad0Down = Test-KeyDown $KEYS_PAD0

    if ($pad0Down -and -not $isClicking0) {
        Write-Host "[NUMPAD 0] Spam clic droit..." -ForegroundColor Green
        $isClicking0 = $true
    }
    if (-not $pad0Down -and $isClicking0) {
        Write-Host "[NUMPAD 0] Stop. Total : $clickCount" -ForegroundColor Yellow
        $isClicking0 = $false
    }

    # ---- Action : clic si l'une des deux conditions est remplie ----
    $shouldClick = $pad0Down -or $toggleActive

    if ($shouldClick) {
        # Clic droit complet (DOWN + UP)
        [NativeMethods]::mouse_event($MOUSEEVENTF_RIGHTDOWN, 0, 0, 0, [UIntPtr]::Zero)
        [NativeMethods]::mouse_event($MOUSEEVENTF_RIGHTUP, 0, 0, 0, [UIntPtr]::Zero)

        $clickCount++

        # Pause aléatoire 8-10 ms
        $delay = $random.Next(8, 11)
        Start-Sleep -Milliseconds $delay

    } else {
        # Rien d'actif, on dort un peu pour ne pas surcharger le CPU
        Start-Sleep -Milliseconds 10
    }
}
