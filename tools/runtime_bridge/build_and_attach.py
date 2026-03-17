#!/usr/bin/env python3
"""Build and attach a Java runtime agent to Wakfu JVM.

Outputs real-time bridge data to logs/realtime/interface_state.json.
"""

from __future__ import annotations

import argparse
import os
import subprocess
import time
from pathlib import Path


PROJECT_ROOT = Path(__file__).resolve().parents[2]
BRIDGE_ROOT = Path(__file__).resolve().parent
SRC_ROOT = BRIDGE_ROOT / "java_src"
BUILD_ROOT = BRIDGE_ROOT / "build"
DEFAULT_OUT = PROJECT_ROOT / "logs" / "realtime" / "inventory_probe.json"


def find_jdk_bin() -> Path:
    candidates = []
    java_home = os.environ.get("JAVA_HOME")
    if java_home:
        candidates.append(Path(java_home) / "bin")

    candidates.append(Path("C:/Program Files/Microsoft/jdk-21.0.10.7-hotspot/bin"))

    for c in candidates:
        if (c / "javac.exe").exists() and (c / "jar.exe").exists() and (c / "java.exe").exists():
            return c
    raise FileNotFoundError("No suitable JDK bin directory found (need javac, jar, java)")


def run(cmd: list[str], cwd: Path | None = None) -> None:
    proc = subprocess.run(cmd, cwd=str(cwd) if cwd else None, capture_output=True, text=True)
    if proc.returncode != 0:
        raise RuntimeError(
            "Command failed:\n"
            + " ".join(cmd)
            + "\nSTDOUT:\n"
            + (proc.stdout or "")
            + "\nSTDERR:\n"
            + (proc.stderr or "")
        )


def build_agent(jdk_bin: Path) -> Path:
    run_id = int(time.time())
    run_dir = BUILD_ROOT / f"run_{run_id}"
    classes_dir = run_dir / "classes"
    agent_jar = run_dir / "wakfu-runtime-agent.jar"
    manifest_file = run_dir / "manifest.mf"

    BUILD_ROOT.mkdir(parents=True, exist_ok=True)
    run_dir.mkdir(parents=True, exist_ok=True)
    classes_dir.mkdir(parents=True, exist_ok=True)

    sources = [str(p) for p in SRC_ROOT.rglob("*.java")]
    if not sources:
        raise RuntimeError("No Java sources found")

    javac = str(jdk_bin / "javac.exe")
    jar = str(jdk_bin / "jar.exe")

    run([javac, "-d", str(classes_dir)] + sources)

    manifest = (
        "Manifest-Version: 1.0\n"
        "Agent-Class: wakfu2.RuntimeAgentInventoryProbe\n"
        "Premain-Class: wakfu2.RuntimeAgentInventoryProbe\n"
        "Can-Redefine-Classes: true\n"
        "Can-Retransform-Classes: true\n\n"
    )
    manifest_file.write_text(manifest, encoding="utf-8")

    run([jar, "cfm", str(agent_jar), str(manifest_file), "-C", str(classes_dir), "."])
    return agent_jar


def find_wakfu_java_pid() -> str:
    ps = [
        "powershell",
        "-NoProfile",
        "-Command",
        "$p = Get-CimInstance Win32_Process | Where-Object { $_.Name -eq 'java.exe' -and $_.CommandLine -match 'Wakfu|wakfu' } | Select-Object -First 1 -ExpandProperty ProcessId; if($p){$p}else{exit 1}",
    ]
    proc = subprocess.run(ps, capture_output=True, text=True)
    if proc.returncode != 0:
        raise RuntimeError("Could not find running Wakfu java.exe process")
    pid = proc.stdout.strip()
    if not pid:
        raise RuntimeError("Could not resolve Wakfu PID")
    return pid


def attach_agent(jdk_bin: Path, pid: str, out_path: Path, agent_jar: Path, hint: int | None = None) -> None:
    java = str(jdk_bin / "java.exe")
    agent_args = str(out_path)
    if hint is not None:
        agent_args += f"|hint={int(hint)}"
    run(
        [
            java,
            "--add-modules",
            "jdk.attach",
            "-cp",
            str(agent_jar),
            "wakfu.RuntimeAttach",
            pid,
            str(agent_jar),
            agent_args,
        ]
    )


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--pid", help="Optional Wakfu java PID to attach")
    parser.add_argument("--out", default=str(DEFAULT_OUT), help="Output JSON path for overlay feed")
    parser.add_argument("--hint", type=int, help="Optional runtime numeric hint (e.g. current real kamas)")
    args = parser.parse_args()

    out_path = Path(args.out)
    jdk_bin = find_jdk_bin()
    agent_jar = build_agent(jdk_bin)

    pid = args.pid or find_wakfu_java_pid()
    attach_agent(jdk_bin, str(pid), out_path, agent_jar, hint=args.hint)

    print(f"BUILT {agent_jar}")
    print(f"ATTACHED pid={pid}")
    print(f"OUT {out_path}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
