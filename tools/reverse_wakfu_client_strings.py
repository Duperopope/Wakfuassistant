#!/usr/bin/env python3
"""Extract UTF-8 constant strings from Java .class files inside a JAR.

Usage:
  python tools/reverse_wakfu_client_strings.py --jar H:/Games/Wakfu/lib/wakfu-client.jar --out data/reverse/client_strings.txt
"""

from __future__ import annotations

import argparse
import io
import re
import struct
import zipfile
from pathlib import Path


def _read_u1(stream: io.BufferedReader | io.BytesIO) -> int:
    data = stream.read(1)
    if len(data) != 1:
        raise EOFError("Unexpected EOF while reading u1")
    return data[0]


def _read_u2(stream: io.BufferedReader | io.BytesIO) -> int:
    data = stream.read(2)
    if len(data) != 2:
        raise EOFError("Unexpected EOF while reading u2")
    return struct.unpack(">H", data)[0]


def _read_u4(stream: io.BufferedReader | io.BytesIO) -> int:
    data = stream.read(4)
    if len(data) != 4:
        raise EOFError("Unexpected EOF while reading u4")
    return struct.unpack(">I", data)[0]


def extract_utf8_constants(class_bytes: bytes) -> list[str]:
    stream = io.BytesIO(class_bytes)

    magic = _read_u4(stream)
    if magic != 0xCAFEBABE:
        return []

    _minor = _read_u2(stream)
    _major = _read_u2(stream)
    cp_count = _read_u2(stream)

    out: list[str] = []

    idx = 1
    while idx < cp_count:
        tag = _read_u1(stream)

        if tag == 1:  # CONSTANT_Utf8
            length = _read_u2(stream)
            raw = stream.read(length)
            text = raw.decode("utf-8", errors="replace")
            out.append(text)
        elif tag in (3, 4):  # Integer, Float
            stream.read(4)
        elif tag in (5, 6):  # Long, Double (take two cp slots)
            stream.read(8)
            idx += 1
        elif tag in (7, 8, 16, 19, 20):  # Class, String, MethodType, Module, Package
            stream.read(2)
        elif tag in (9, 10, 11, 12, 18):  # refs and NameAndType, InvokeDynamic
            stream.read(4)
        elif tag == 15:  # MethodHandle
            stream.read(3)
        elif tag == 17:  # Dynamic
            stream.read(4)
        else:
            # Unknown tag in this class version; bail out gracefully.
            return out

        idx += 1

    return out


def looks_useful(text: str) -> bool:
    if len(text) < 3:
        return False

    needles = (
        "character",
        "caracter",
        "personnage",
        "aptitude",
        "stat",
        "master",
        "resist",
        "initiative",
        "prospection",
        "wisdom",
        "willpower",
        "critical",
        "range",
        "portee",
        "port\u00e9e",
        "hp",
        "life",
        "ap",
        "mp",
        "wp",
        "fight",
        "xulor",
    )

    low = text.lower()
    if any(n in low for n in needles):
        return True

    # Keep upper snake keys like RES_FIRE_PERCENT.
    if re.fullmatch(r"[A-Z0-9_]{4,}", text):
        return True

    return False


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--jar", required=True, help="Path to target JAR")
    parser.add_argument("--out", required=True, help="Output text report path")
    parser.add_argument("--max-per-class", type=int, default=200)
    args = parser.parse_args()

    jar_path = Path(args.jar)
    out_path = Path(args.out)
    out_path.parent.mkdir(parents=True, exist_ok=True)

    if not jar_path.exists():
        raise FileNotFoundError(f"JAR not found: {jar_path}")

    lines: list[str] = []
    class_count = 0
    match_count = 0

    with zipfile.ZipFile(jar_path, "r") as zf:
        for info in zf.infolist():
            if not info.filename.endswith(".class"):
                continue

            class_count += 1
            try:
                raw = zf.read(info.filename)
            except OSError:
                continue

            values = extract_utf8_constants(raw)
            useful = [v for v in values if looks_useful(v)]
            if not useful:
                continue

            match_count += 1
            lines.append(f"## {info.filename}")
            for v in useful[: args.max_per_class]:
                lines.append(v)
            lines.append("")

    header = [
        f"jar={jar_path}",
        f"classes_scanned={class_count}",
        f"classes_with_matches={match_count}",
        "",
    ]
    out_path.write_text("\n".join(header + lines), encoding="utf-8")
    print(f"Wrote report: {out_path}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
