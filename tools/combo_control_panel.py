import os
import queue
import random
import subprocess
import threading
import time
import sys
import ctypes
from ctypes import wintypes
from datetime import datetime
from pathlib import Path
import tkinter as tk
from tkinter import ttk
from tkinter.scrolledtext import ScrolledText


def _resolve_workspace() -> Path:
    # When bundled as a one-file exe, __file__ points to a temp extraction dir.
    # We want the real workspace folder on disk.
    if getattr(sys, "frozen", False):
        exe_dir = Path(sys.executable).resolve().parent
        candidates = [
            exe_dir.parent,  # dist/ClawOpenCodePanel.exe -> workspace is parent of dist
            exe_dir,
            Path.cwd(),
        ]
    else:
        candidates = [Path(__file__).resolve().parents[1], Path.cwd()]

    for candidate in candidates:
        if (candidate / "scripts" / "opencode-openclaw-run.ps1").exists():
            return candidate

    # Fallback keeps behavior deterministic if launched from an unusual location.
    return Path(__file__).resolve().parents[1]


WORKSPACE = _resolve_workspace()
WRAPPER = WORKSPACE / "scripts" / "opencode-openclaw-run.ps1"
CODEBASE_DIR = WORKSPACE / "docs" / "Codebase"

RND_DOCS = [
    WORKSPACE / "docs" / "permanent-journal-worklog-2026-03-17.md",
    WORKSPACE / "docs" / "personnage-worklog-2026-03-18.md",
    WORKSPACE / "docs" / "transactions-worklog-2026-03-16.md",
]

AGENT_POLICY = (
    "Agent operating rules (mandatory):\n"
    "- Before each modification: commit current git state\n"
    "- After each modification: run all tests\n"
    "- If no tests exist: create tests\n"
    "- If tests fail after a change: revert and try another approach\n"
    "- If 3 attempts fail: revert and explain in CHANGELOG.md in simple French\n"
    "- Use clear French commit messages\n"
    "- Do not ask the user technical questions\n"
    "- Keep CHANGELOG.md, tests, and health-check up to date\n"
)


_user32 = ctypes.WinDLL("user32", use_last_error=True)

WM_LBUTTONDOWN = 0x0201
WM_LBUTTONUP = 0x0202
MK_LBUTTON = 0x0001
MOUSEEVENTF_LEFTDOWN = 0x0002
MOUSEEVENTF_LEFTUP = 0x0004
SW_RESTORE = 9


def _make_lparam(x: int, y: int) -> int:
    return (y << 16) | (x & 0xFFFF)


def _get_visible_window_with_keyword(keyword: str) -> int | None:
    needle = keyword.strip().lower()
    if not needle:
        return None

    found: list[int] = []

    @ctypes.WINFUNCTYPE(ctypes.c_bool, wintypes.HWND, wintypes.LPARAM)
    def _enum_cb(hwnd: int, lparam: int) -> bool:
        if not _user32.IsWindowVisible(hwnd):
            return True

        length = _user32.GetWindowTextLengthW(hwnd)
        if length <= 0:
            return True

        buf = ctypes.create_unicode_buffer(length + 1)
        _user32.GetWindowTextW(hwnd, buf, length + 1)
        title = buf.value.lower()
        if needle in title:
            found.append(hwnd)
            return False
        return True

    _user32.EnumWindows(_enum_cb, 0)
    return found[0] if found else None


def _post_random_client_click(hwnd: int, margin: int = 40) -> bool:
    rect = wintypes.RECT()
    if not _user32.GetClientRect(hwnd, ctypes.byref(rect)):
        return False

    width = rect.right - rect.left
    height = rect.bottom - rect.top
    if width <= 0 or height <= 0:
        return False

    safe_margin_x = min(margin, max(0, width // 3))
    safe_margin_y = min(margin, max(0, height // 3))

    min_x = safe_margin_x
    max_x = max(min_x, width - safe_margin_x - 1)
    min_y = safe_margin_y
    max_y = max(min_y, height - safe_margin_y - 1)

    x = random.randint(min_x, max_x)
    y = random.randint(min_y, max_y)
    lparam = _make_lparam(x, y)

    _user32.PostMessageW(hwnd, WM_LBUTTONDOWN, MK_LBUTTON, lparam)
    _user32.PostMessageW(hwnd, WM_LBUTTONUP, 0, lparam)
    return True


def _random_client_point_screen(hwnd: int, margin: int = 40) -> tuple[int, int] | None:
    rect = wintypes.RECT()
    if not _user32.GetClientRect(hwnd, ctypes.byref(rect)):
        return None

    width = rect.right - rect.left
    height = rect.bottom - rect.top
    if width <= 0 or height <= 0:
        return None

    safe_margin_x = min(margin, max(0, width // 3))
    safe_margin_y = min(margin, max(0, height // 3))

    min_x = safe_margin_x
    max_x = max(min_x, width - safe_margin_x - 1)
    min_y = safe_margin_y
    max_y = max(min_y, height - safe_margin_y - 1)

    local_x = random.randint(min_x, max_x)
    local_y = random.randint(min_y, max_y)

    pt = wintypes.POINT(local_x, local_y)
    if not _user32.ClientToScreen(hwnd, ctypes.byref(pt)):
        return None
    return pt.x, pt.y


def _foreground_real_click(hwnd: int, margin: int = 40) -> bool:
    point = _random_client_point_screen(hwnd, margin=margin)
    if point is None:
        return False

    prev_cursor = wintypes.POINT()
    _user32.GetCursorPos(ctypes.byref(prev_cursor))
    prev_fg = _user32.GetForegroundWindow()

    _user32.ShowWindow(hwnd, SW_RESTORE)
    _user32.SetForegroundWindow(hwnd)
    time.sleep(0.08)

    x, y = point
    if not _user32.SetCursorPos(x, y):
        return False

    _user32.mouse_event(MOUSEEVENTF_LEFTDOWN, 0, 0, 0, 0)
    time.sleep(0.02)
    _user32.mouse_event(MOUSEEVENTF_LEFTUP, 0, 0, 0, 0)

    _user32.SetCursorPos(prev_cursor.x, prev_cursor.y)
    if prev_fg and prev_fg != hwnd:
        _user32.SetForegroundWindow(prev_fg)
    return True


class ComboControlPanel:
    def __init__(self, root: tk.Tk) -> None:
        self.root = root
        self.root.title("OpenClaw + OpenCode Control Panel")
        self.root.geometry("980x700")

        self.log_queue: queue.Queue[str] = queue.Queue()
        self.stop_event = threading.Event()
        self.worker_thread: threading.Thread | None = None

        self.gateway_proc: subprocess.Popen | None = None
        self.opencode_proc: subprocess.Popen | None = None
        self.afk_thread: threading.Thread | None = None
        self.afk_stop_event = threading.Event()

        self._build_ui()
        self._tick_log_queue()
        self.root.protocol("WM_DELETE_WINDOW", self.on_close)

    def _build_ui(self) -> None:
        main = ttk.Frame(self.root, padding=10)
        main.pack(fill=tk.BOTH, expand=True)

        top = ttk.LabelFrame(main, text="Mission", padding=10)
        top.pack(fill=tk.X)

        self.prompt_var = tk.StringVar(
            value=(
                "Continue autonomously on the current workspace goals. "
                "Use attached context and keep going until tasks are done."
            )
        )
        self.interval_var = tk.StringVar(value="120")

        ttk.Label(top, text="Instruction (sent to OpenCode each cycle):").grid(row=0, column=0, sticky=tk.W)
        self.prompt_entry = ttk.Entry(top, textvariable=self.prompt_var, width=120)
        self.prompt_entry.grid(row=1, column=0, columnspan=4, sticky=tk.EW, pady=(3, 8))

        ttk.Label(top, text="Cycle every (seconds):").grid(row=2, column=0, sticky=tk.W)
        self.interval_entry = ttk.Entry(top, textvariable=self.interval_var, width=10)
        self.interval_entry.grid(row=2, column=1, sticky=tk.W)

        self.start_gateway_var = tk.BooleanVar(value=True)
        self.start_gateway_chk = ttk.Checkbutton(
            top,
            text="Start OpenClaw gateway with worker",
            variable=self.start_gateway_var,
        )
        self.start_gateway_chk.grid(row=2, column=2, sticky=tk.W, padx=(15, 0))

        self.anti_afk_var = tk.BooleanVar(value=True)
        self.anti_afk_chk = ttk.Checkbutton(
            top,
            text="Anti-AFK Wakfu (clic random 3-4 min)",
            variable=self.anti_afk_var,
        )
        self.anti_afk_chk.grid(row=3, column=0, columnspan=2, sticky=tk.W, pady=(6, 0))

        self.anti_afk_real_click_var = tk.BooleanVar(value=True)
        self.anti_afk_real_click_chk = ttk.Checkbutton(
            top,
            text="Robust mode: real click (focus Wakfu)",
            variable=self.anti_afk_real_click_var,
        )
        self.anti_afk_real_click_chk.grid(row=4, column=0, columnspan=2, sticky=tk.W, pady=(2, 0))

        self.wakfu_window_keyword_var = tk.StringVar(value="WAKFU")
        ttk.Label(top, text="Wakfu window keyword:").grid(row=3, column=2, sticky=tk.E, pady=(6, 0))
        self.wakfu_window_keyword_entry = ttk.Entry(top, textvariable=self.wakfu_window_keyword_var, width=20)
        self.wakfu_window_keyword_entry.grid(row=3, column=3, sticky=tk.W, pady=(6, 0))

        for i in range(4):
            top.columnconfigure(i, weight=1)

        btns = ttk.Frame(main)
        btns.pack(fill=tk.X, pady=(10, 8))

        self.start_btn = ttk.Button(btns, text="Start Continuous Work", command=self.start)
        self.start_btn.pack(side=tk.LEFT)

        self.stop_btn = ttk.Button(btns, text="Stop", command=self.stop, state=tk.DISABLED)
        self.stop_btn.pack(side=tk.LEFT, padx=(8, 0))

        self.run_once_btn = ttk.Button(btns, text="Run One Cycle Now", command=self.run_once)
        self.run_once_btn.pack(side=tk.LEFT, padx=(8, 0))

        self.status_var = tk.StringVar(value="Idle")
        ttk.Label(btns, textvariable=self.status_var).pack(side=tk.RIGHT)

        self.finalize_on_stop_var = tk.BooleanVar(value=True)
        self.finalize_on_stop_chk = ttk.Checkbutton(
            main,
            text="On Stop: create stable report and open it",
            variable=self.finalize_on_stop_var,
        )
        self.finalize_on_stop_chk.pack(anchor=tk.W)

        log_frame = ttk.LabelFrame(main, text="Live Logs", padding=10)
        log_frame.pack(fill=tk.BOTH, expand=True)

        self.log_box = ScrolledText(log_frame, wrap=tk.WORD, height=24)
        self.log_box.pack(fill=tk.BOTH, expand=True)
        self.log_box.configure(state=tk.DISABLED)

        help_text = (
            "How it works:\n"
            "- Start Continuous Work launches OpenClaw gateway (optional) and runs OpenCode cycles forever.\n"
            "- Each cycle uses scripts/opencode-openclaw-run.ps1 with your instruction and --continue session behavior.\n"
            "- Anti-AFK can send one random click in Wakfu every 3-4 minutes to avoid disconnects.\n"
            "- Robust mode does a real foreground mouse click for game clients that ignore background messages.\n"
            "- It will keep running overnight until you click Stop."
        )
        ttk.Label(main, text=help_text, justify=tk.LEFT).pack(fill=tk.X, pady=(8, 0))

    def log(self, text: str) -> None:
        stamp = datetime.now().strftime("%H:%M:%S")
        self.log_queue.put(f"[{stamp}] {text}")

    def _tick_log_queue(self) -> None:
        flushed = False
        while True:
            try:
                line = self.log_queue.get_nowait()
            except queue.Empty:
                break
            flushed = True
            self.log_box.configure(state=tk.NORMAL)
            self.log_box.insert(tk.END, line + "\n")
            self.log_box.see(tk.END)
            self.log_box.configure(state=tk.DISABLED)
        self.root.after(120, self._tick_log_queue)
        if flushed:
            self.root.update_idletasks()

    def _safe_terminate(self, proc: subprocess.Popen | None, name: str) -> None:
        if proc is None:
            return
        if proc.poll() is not None:
            return
        self.log(f"Stopping {name} (pid={proc.pid})")
        try:
            proc.terminate()
            proc.wait(timeout=5)
        except Exception:
            try:
                proc.kill()
            except Exception:
                pass

    def start_gateway(self) -> None:
        if self.gateway_proc and self.gateway_proc.poll() is None:
            self.log("OpenClaw gateway already running in this panel process")
            return

        self.log("Starting OpenClaw gateway...")
        self.gateway_proc = subprocess.Popen(
            ["openclaw", "gateway"],
            cwd=str(WORKSPACE),
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            text=True,
            encoding="utf-8",
            errors="replace",
            creationflags=subprocess.CREATE_NEW_PROCESS_GROUP,
        )

        def _pump_gateway() -> None:
            assert self.gateway_proc is not None
            for line in self.gateway_proc.stdout or []:
                self.log(f"[gateway] {line.rstrip()}")
            code = self.gateway_proc.wait()
            self.log(f"[gateway] exited with code {code}")

        threading.Thread(target=_pump_gateway, daemon=True).start()

    def _run_opencode_cycle(self, prompt: str) -> int:
        cycle_prompt = self._compose_cycle_prompt(prompt)
        cmd = [
            "powershell",
            "-NoProfile",
            "-ExecutionPolicy",
            "Bypass",
            "-File",
            str(WRAPPER),
            cycle_prompt,
        ]
        self.log("Running OpenCode cycle...")
        self.opencode_proc = subprocess.Popen(
            cmd,
            cwd=str(WORKSPACE),
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            text=True,
            encoding="utf-8",
            errors="replace",
            creationflags=subprocess.CREATE_NEW_PROCESS_GROUP,
        )

        assert self.opencode_proc is not None
        for line in self.opencode_proc.stdout or []:
            self.log(f"[opencode] {line.rstrip()}")
            if self.stop_event.is_set():
                break

        if self.stop_event.is_set() and self.opencode_proc.poll() is None:
            self._safe_terminate(self.opencode_proc, "OpenCode cycle")

        code = self.opencode_proc.wait()
        self.log(f"[opencode] cycle finished with code {code}")
        return code

    def _compose_cycle_prompt(self, prompt: str) -> str:
        docs_list = "\n".join([f"- {p}" for p in RND_DOCS])
        return (
            f"{AGENT_POLICY}\n"
            f"R&D context files to read and use:\n{docs_list}\n\n"
            "Primary documentation target:\n"
            f"- Write full up-to-date app documentation under {CODEBASE_DIR}\n\n"
            "Autonomy mode:\n"
            "- Keep working continuously until manually stopped\n"
            "- Do not pause waiting for user confirmation on technical steps\n\n"
            f"Current mission:\n{prompt}"
        )

    def _run_cmd_capture(self, cmd: list[str], timeout: int = 120) -> tuple[int, str]:
        try:
            completed = subprocess.run(
                cmd,
                cwd=str(WORKSPACE),
                timeout=timeout,
                text=True,
                encoding="utf-8",
                errors="replace",
                capture_output=True,
            )
            output = (completed.stdout or "") + (completed.stderr or "")
            return completed.returncode, output.strip()
        except Exception as exc:
            return 1, str(exc)

    def _build_stable_report(self) -> Path:
        CODEBASE_DIR.mkdir(parents=True, exist_ok=True)
        report = CODEBASE_DIR / "LATEST_STABLE_REPORT.md"

        branch_code, branch_out = self._run_cmd_capture(["git", "rev-parse", "--abbrev-ref", "HEAD"], timeout=20)
        commit_code, commit_out = self._run_cmd_capture(["git", "log", "-1", "--pretty=format:%H|%ad|%s", "--date=iso"], timeout=20)
        status_code, status_out = self._run_cmd_capture(["git", "status", "--short"], timeout=20)
        tests_code, tests_out = self._run_cmd_capture([str(WORKSPACE / ".venv" / "Scripts" / "python.exe"), "-m", "pytest", "-q"], timeout=900)

        lines = [
            "# Latest Stable Report",
            "",
            f"Generated: {datetime.now().isoformat(timespec='seconds')}",
            "",
            "## Workspace",
            f"- Path: {WORKSPACE}",
            f"- Branch: {branch_out if branch_code == 0 else 'unknown'}",
            f"- Last commit: {commit_out if commit_code == 0 else 'unknown'}",
            "",
            "## Working Tree",
            f"- git status exit code: {status_code}",
            "```text",
            status_out or "(clean)",
            "```",
            "",
            "## Test Status",
            f"- pytest exit code: {tests_code}",
            "```text",
            tests_out or "(no output)",
            "```",
            "",
            "## R&D References",
        ]
        lines.extend([f"- {p}" for p in RND_DOCS])
        lines.extend([
            "",
            "## Documentation Target",
            f"- Ensure full current documentation exists in: {CODEBASE_DIR}",
            "",
            "## Note",
            "- This report is generated when Stop is pressed in the control panel.",
        ])

        report.write_text("\n".join(lines) + "\n", encoding="utf-8")
        return report

    def _worker_loop(self) -> None:
        prompt = self.prompt_var.get().strip()
        if not prompt:
            self.log("Prompt is empty, stopping worker")
            self._set_idle_ui()
            return

        try:
            interval = max(5, int(self.interval_var.get().strip()))
        except Exception:
            interval = 120

        self.log(f"Continuous mode started (interval={interval}s)")

        if self.anti_afk_var.get():
            self._start_anti_afk()

        if self.start_gateway_var.get():
            self.start_gateway()

        while not self.stop_event.is_set():
            code = self._run_opencode_cycle(prompt)

            if self.stop_event.is_set():
                break

            if code != 0:
                self.log("OpenCode cycle failed; continuing until manual Stop")

            for remaining in range(interval, 0, -1):
                if self.stop_event.is_set():
                    break
                if remaining in (interval, 60, 30, 10, 5, 4, 3, 2, 1):
                    self.log(f"Next cycle in {remaining}s")
                time.sleep(1)

        self._set_idle_ui()
        self.log("Continuous mode stopped")

    def _start_anti_afk(self) -> None:
        if self.afk_thread and self.afk_thread.is_alive():
            return

        self.afk_stop_event.clear()

        def _afk_loop() -> None:
            self.log("Anti-AFK started (random click every 180-240s)")
            while not self.stop_event.is_set() and not self.afk_stop_event.is_set():
                wait_s = random.randint(180, 240)
                for _ in range(wait_s):
                    if self.stop_event.is_set() or self.afk_stop_event.is_set():
                        break
                    time.sleep(1)

                if self.stop_event.is_set() or self.afk_stop_event.is_set():
                    break

                keyword = self.wakfu_window_keyword_var.get().strip() or "WAKFU"
                hwnd = _get_visible_window_with_keyword(keyword)
                if hwnd is None:
                    self.log(f"[anti-afk] Window not found for keyword '{keyword}'")
                    continue

                use_real_click = self.anti_afk_real_click_var.get()
                if use_real_click:
                    ok = _foreground_real_click(hwnd)
                    method = "real"
                else:
                    ok = _post_random_client_click(hwnd)
                    method = "message"

                if ok:
                    self.log(f"[anti-afk] Keepalive click sent ({method}) to window '{keyword}'")
                else:
                    self.log(f"[anti-afk] Click failed ({method}) on window '{keyword}'")

            self.log("Anti-AFK stopped")

        self.afk_thread = threading.Thread(target=_afk_loop, daemon=True)
        self.afk_thread.start()

    def _stop_anti_afk(self) -> None:
        self.afk_stop_event.set()

    def _set_idle_ui(self) -> None:
        self.stop_event.set()
        self._stop_anti_afk()
        self.status_var.set("Idle")
        self.root.after(0, lambda: self.start_btn.configure(state=tk.NORMAL))
        self.root.after(0, lambda: self.stop_btn.configure(state=tk.DISABLED))

    def start(self) -> None:
        if self.worker_thread and self.worker_thread.is_alive():
            self.log("Worker already running")
            return

        self.stop_event.clear()
        self.start_btn.configure(state=tk.DISABLED)
        self.stop_btn.configure(state=tk.NORMAL)
        self.status_var.set("Running")

        self.worker_thread = threading.Thread(target=self._worker_loop, daemon=True)
        self.worker_thread.start()

    def run_once(self) -> None:
        if self.worker_thread and self.worker_thread.is_alive():
            self.log("Cannot run once while continuous mode is active")
            return

        prompt = self.prompt_var.get().strip()
        if not prompt:
            self.log("Prompt is empty")
            return

        def _once() -> None:
            self.status_var.set("Running one cycle")
            self._run_opencode_cycle(prompt)
            self.status_var.set("Idle")

        threading.Thread(target=_once, daemon=True).start()

    def stop(self) -> None:
        self.log("Stop requested by user")
        self.stop_event.set()
        self._stop_anti_afk()
        self.status_var.set("Stopping")

        self._safe_terminate(self.opencode_proc, "OpenCode cycle")
        self._safe_terminate(self.gateway_proc, "OpenClaw gateway")

        try:
            subprocess.run(["openclaw", "gateway", "stop"], cwd=str(WORKSPACE), timeout=10)
            self.log("OpenClaw gateway stop command sent")
        except Exception as exc:
            self.log(f"Gateway stop command failed: {exc}")

        if self.finalize_on_stop_var.get():
            try:
                report = self._build_stable_report()
                self.log(f"Stable report generated: {report}")
                if hasattr(os, "startfile"):
                    os.startfile(str(report))
            except Exception as exc:
                self.log(f"Stable report generation failed: {exc}")

        self.start_btn.configure(state=tk.NORMAL)
        self.stop_btn.configure(state=tk.DISABLED)
        self.status_var.set("Idle")

    def on_close(self) -> None:
        self.stop()
        self.root.destroy()


def main() -> None:
    if not WRAPPER.exists():
        raise SystemExit(f"Wrapper not found: {WRAPPER}")

    root = tk.Tk()
    style = ttk.Style(root)
    if "vista" in style.theme_names():
        style.theme_use("vista")

    app = ComboControlPanel(root)
    app.log("Control panel ready")
    root.mainloop()


if __name__ == "__main__":
    main()
