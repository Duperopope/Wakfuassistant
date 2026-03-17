#!/usr/bin/env python3
from __future__ import annotations

import argparse
import json
import re
import subprocess
import sys
import urllib.request
from pathlib import Path
from typing import Any

WAKASSETS_REPO = "https://github.com/Vertylo/wakassets.git"
THEME_URL = "https://wakfu.cdn.ankama.com/gamedata/theme/theme.json"

PROJECT_ROOT = Path(__file__).resolve().parents[1]
OFFICIAL_DIR = PROJECT_ROOT / "data" / "ankama_official"
WAKASSETS_DIR = OFFICIAL_DIR / "wakassets"
THEME_DIR = OFFICIAL_DIR / "theme"
THEME_JSON_PATH = THEME_DIR / "theme.json"
THEME_INDEX_PATH = THEME_DIR / "theme_asset_refs.json"

ASSET_EXT_RE = re.compile(
    r"\.(png|jpg|jpeg|webp|gif|svg|bmp|json|atlas|xml|fnt|ttf|otf|mp3|ogg|wav)(\?.*)?$",
    re.IGNORECASE,
)

URL_RE = re.compile(r"^https?://", re.IGNORECASE)
THEME_BASE_URL = "https://wakfu.cdn.ankama.com/gamedata/theme/"


def _run(cmd: list[str], cwd: Path | None = None) -> None:
    proc = subprocess.run(cmd, cwd=str(cwd) if cwd else None, capture_output=True, text=True)
    if proc.returncode != 0:
        err = proc.stderr.strip() or proc.stdout.strip() or "unknown error"
        raise RuntimeError(f"Command failed: {' '.join(cmd)}\n{err}")


def sync_wakassets() -> dict[str, Any]:
    OFFICIAL_DIR.mkdir(parents=True, exist_ok=True)

    if (WAKASSETS_DIR / ".git").exists():
        _run(["git", "-C", str(WAKASSETS_DIR), "fetch", "origin"])
        _run(["git", "-C", str(WAKASSETS_DIR), "pull", "--ff-only", "origin", "main"])
        mode = "updated"
    elif WAKASSETS_DIR.exists():
        raise RuntimeError(
            f"{WAKASSETS_DIR} exists but is not a git repository. "
            "Remove/rename it or convert it to a repository."
        )
    else:
        _run(["git", "clone", "--depth", "1", WAKASSETS_REPO, str(WAKASSETS_DIR)])
        mode = "cloned"

    return {
        "mode": mode,
        "path": str(WAKASSETS_DIR),
    }


def sync_theme_json() -> dict[str, Any]:
    THEME_DIR.mkdir(parents=True, exist_ok=True)
    with urllib.request.urlopen(THEME_URL, timeout=30) as resp:
        raw = resp.read()

    THEME_JSON_PATH.write_bytes(raw)

    data = json.loads(raw.decode("utf-8"))
    index = build_theme_index(data)
    THEME_INDEX_PATH.write_text(json.dumps(index, ensure_ascii=False, indent=2), encoding="utf-8")

    return {
        "theme_json": str(THEME_JSON_PATH),
        "index_json": str(THEME_INDEX_PATH),
        "refs_count": len(index["references"]),
    }


def _iter_strings(node: Any):
    if isinstance(node, dict):
        for value in node.values():
            yield from _iter_strings(value)
    elif isinstance(node, list):
        for value in node:
            yield from _iter_strings(value)
    elif isinstance(node, str):
        yield node


def _to_resolved_url(value: str) -> str:
    if URL_RE.match(value):
        return value
    return THEME_BASE_URL + value.lstrip("/")


def build_theme_index(theme_data: Any) -> dict[str, Any]:
    found: dict[str, dict[str, str]] = {}

    for raw in _iter_strings(theme_data):
        val = raw.strip()
        if not val:
            continue
        if not ASSET_EXT_RE.search(val):
            continue

        key = val
        if key not in found:
            found[key] = {
                "raw": val,
                "resolved_url": _to_resolved_url(val),
            }

    refs = sorted(found.values(), key=lambda x: x["raw"].lower())
    return {
        "source": THEME_URL,
        "base_url": THEME_BASE_URL,
        "references": refs,
    }


def main() -> int:
    parser = argparse.ArgumentParser(description="Sync official Ankama resources for local extraction.")
    parser.add_argument(
        "--skip-wakassets",
        action="store_true",
        help="Skip git sync for wakassets repository.",
    )
    parser.add_argument(
        "--skip-theme",
        action="store_true",
        help="Skip theme.json download + reference extraction.",
    )
    args = parser.parse_args()

    summary: dict[str, Any] = {}

    if not args.skip_wakassets:
        summary["wakassets"] = sync_wakassets()

    if not args.skip_theme:
        summary["theme"] = sync_theme_json()

    print(json.dumps(summary, ensure_ascii=False, indent=2))
    return 0


if __name__ == "__main__":
    try:
        raise SystemExit(main())
    except Exception as exc:
        print(f"ERROR: {exc}", file=sys.stderr)
        raise SystemExit(1)
