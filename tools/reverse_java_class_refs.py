#!/usr/bin/env python3
"""Dump constant-pool class refs and strings for specific class entries in a JAR."""

from __future__ import annotations

import argparse
import io
import struct
import zipfile
from pathlib import Path


def _u1(s: io.BytesIO) -> int:
    b = s.read(1)
    if len(b) != 1:
        raise EOFError
    return b[0]


def _u2(s: io.BytesIO) -> int:
    b = s.read(2)
    if len(b) != 2:
        raise EOFError
    return struct.unpack(">H", b)[0]


def _u4(s: io.BytesIO) -> int:
    b = s.read(4)
    if len(b) != 4:
        raise EOFError
    return struct.unpack(">I", b)[0]


def parse_cp(raw: bytes) -> tuple[dict[int, tuple[int, object]], dict[int, str]]:
    s = io.BytesIO(raw)
    if _u4(s) != 0xCAFEBABE:
        return {}, {}
    _u2(s)
    _u2(s)
    cp_count = _u2(s)
    cp: dict[int, tuple[int, object]] = {}
    utf8: dict[int, str] = {}
    i = 1
    while i < cp_count:
        tag = _u1(s)
        if tag == 1:
            ln = _u2(s)
            txt = s.read(ln).decode("utf-8", errors="replace")
            cp[i] = (tag, txt)
            utf8[i] = txt
        elif tag in (3, 4):
            s.read(4)
            cp[i] = (tag, None)
        elif tag in (5, 6):
            s.read(8)
            cp[i] = (tag, None)
            i += 1
        elif tag in (7, 8, 16, 19, 20):
            cp[i] = (tag, _u2(s))
        elif tag in (9, 10, 11, 12, 17, 18):
            cp[i] = (tag, (_u2(s), _u2(s)))
        elif tag == 15:
            cp[i] = (tag, (_u1(s), _u2(s)))
        else:
            break
        i += 1
    return cp, utf8


def resolve_class_name(cp: dict[int, tuple[int, object]], utf8: dict[int, str], idx: int) -> str | None:
    entry = cp.get(idx)
    if not entry or entry[0] != 7:
        return None
    name_idx = entry[1]
    if not isinstance(name_idx, int):
        return None
    return utf8.get(name_idx)


def dump_target(zf: zipfile.ZipFile, target: str) -> str:
    raw = zf.read(target)
    cp, utf8 = parse_cp(raw)
    out: list[str] = [f"## {target}"]

    class_refs = sorted(
        {
            name
            for idx, (tag, _) in cp.items()
            if tag == 7 and (name := resolve_class_name(cp, utf8, idx))
        }
    )
    out.append("[class_refs]")
    out.extend(class_refs[:800])

    strings = sorted({v for v in utf8.values() if len(v) >= 3})
    out.append("[strings]")
    out.extend(strings[:2000])
    out.append("")
    return "\n".join(out)


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("--jar", required=True)
    ap.add_argument("--class", dest="targets", action="append", required=True)
    ap.add_argument("--out", required=True)
    ns = ap.parse_args()

    jar = Path(ns.jar)
    out = Path(ns.out)
    out.parent.mkdir(parents=True, exist_ok=True)

    with zipfile.ZipFile(jar, "r") as zf:
        chunks: list[str] = []
        for t in ns.targets:
            if t not in zf.namelist():
                chunks.append(f"## {t}\nMISSING\n")
                continue
            chunks.append(dump_target(zf, t))

    out.write_text("\n".join(chunks), encoding="utf-8")
    print(f"Wrote {out}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
