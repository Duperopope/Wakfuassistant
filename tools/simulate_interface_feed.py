#!/usr/bin/env python3
"""Write a simulated real-time interface feed for the overlay.

This is a stand-in for the future Java runtime extractor. It writes a JSON file
at logs/realtime/interface_state.json using the same schema consumed by the UI.
"""

from __future__ import annotations

import argparse
import json
import time
from pathlib import Path


PROJECT_ROOT = Path(__file__).resolve().parents[1]
CONFIG_PATH = PROJECT_ROOT / "data" / "config.json"
OUTPUT_PATH = PROJECT_ROOT / "logs" / "realtime" / "interface_state.json"


def read_config() -> dict:
    try:
        return json.loads(CONFIG_PATH.read_text(encoding="utf-8"))
    except (OSError, ValueError, TypeError):
        return {}


def build_payload(args: argparse.Namespace) -> dict:
    config = read_config()
    base_kamas = int(config.get("base_kamas", 0) or 0)
    manual_kamas_delta = int(config.get("manual_kamas_delta", 0) or 0)
    level = int(args.level)
    crit = int(args.crit)
    xp_gain = int(args.xp_gain)
    xp_to_next = int(args.xp_to_next)
    kamas_total = int(args.kamas if args.kamas is not None else base_kamas + manual_kamas_delta)
    ap = int(args.ap)
    mp = int(args.mp)
    wp = int(args.wp)
    hp_percent = int(args.hp_percent)

    return {
        "level": level,
        "critical_percent": crit,
        "last_xp_gain": xp_gain,
        "xp_to_next": xp_to_next,
        "kamas_total": kamas_total,
        "inventory_open": bool(args.inventory_open),
        "character_sheet_open": bool(args.character_sheet_open),
        "ap": ap,
        "mp": mp,
        "wp": wp,
        "hp_percent": hp_percent,
        "updated_at": int(time.time()),
        "source": "simulator",
    }


def write_payload(payload: dict) -> None:
    OUTPUT_PATH.parent.mkdir(parents=True, exist_ok=True)
    OUTPUT_PATH.write_text(json.dumps(payload, ensure_ascii=False, indent=2), encoding="utf-8")


def build_loop_payload(args: argparse.Namespace, tick: int) -> dict:
    config = read_config()
    base_kamas = int(config.get("base_kamas", 0) or 0)
    manual_kamas_delta = int(config.get("manual_kamas_delta", 0) or 0)

    level = int(args.level)
    xp_gain = int(args.xp_gain) + (tick % 5) * 111_111
    xp_to_next = max(0, int(args.xp_to_next) - (tick * 75_000))
    crit = max(0, min(100, int(args.crit) + (tick % 4) * 2))
    ap = int(args.ap)
    mp = int(args.mp)
    wp = max(0, int(args.wp) - (tick % 3))
    hp_percent = max(1, min(100, int(args.hp_percent) - (tick % 7) * 3))
    kamas_total = int(args.kamas if args.kamas is not None else base_kamas + manual_kamas_delta + tick * 137)

    return {
        "level": level,
        "critical_percent": crit,
        "last_xp_gain": xp_gain,
        "xp_to_next": xp_to_next,
        "kamas_total": kamas_total,
        "inventory_open": bool(args.inventory_open if tick % 2 == 0 else not args.inventory_open),
        "character_sheet_open": bool(args.character_sheet_open if tick % 3 != 0 else not args.character_sheet_open),
        "ap": ap,
        "mp": mp,
        "wp": wp,
        "hp_percent": hp_percent,
        "updated_at": int(time.time()),
        "source": "simulator-loop",
        "tick": tick,
    }


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--level", type=int, default=180)
    parser.add_argument("--crit", type=int, default=42)
    parser.add_argument("--xp-gain", dest="xp_gain", type=int, default=6436651)
    parser.add_argument("--xp-to-next", dest="xp_to_next", type=int, default=596506133)
    parser.add_argument("--kamas", type=int)
    parser.add_argument("--ap", type=int, default=12)
    parser.add_argument("--mp", type=int, default=6)
    parser.add_argument("--wp", type=int, default=6)
    parser.add_argument("--hp-percent", dest="hp_percent", type=int, default=100)
    parser.add_argument("--inventory-open", dest="inventory_open", action="store_true")
    parser.add_argument("--character-sheet-open", dest="character_sheet_open", action="store_true")
    parser.add_argument("--loop", action="store_true")
    parser.add_argument("--interval", type=float, default=1.0)
    args = parser.parse_args()

    if args.loop:
        tick = 0
        print(f"LOOPING {OUTPUT_PATH} every {args.interval:.2f}s")
        try:
            while True:
                payload = build_loop_payload(args, tick)
                write_payload(payload)
                print(json.dumps(payload, ensure_ascii=False), flush=True)
                tick += 1
                time.sleep(max(0.1, float(args.interval)))
        except KeyboardInterrupt:
            print("STOPPED")
            return 0

    payload = build_payload(args)
    write_payload(payload)
    print(f"WROTE {OUTPUT_PATH}")
    print(json.dumps(payload, ensure_ascii=False))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())