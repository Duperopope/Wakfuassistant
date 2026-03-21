#!/usr/bin/env python3
"""
Live decoder for Wakfu intercepted messages.
Reads wakfu_messages.log in tail-f mode and outputs human-readable French text.
"""

import json
import os
import re
import sys
import time

# Force UTF-8 output on Windows
if sys.platform == "win32":
    sys.stdout.reconfigure(encoding="utf-8", errors="replace")
    sys.stderr.reconfigure(encoding="utf-8", errors="replace")

LOG_PATH = os.path.join(os.path.dirname(__file__), "logs", "wakfu_messages.log")
I18N_PATH = os.path.join(os.path.dirname(__file__), "..", "logs", "i18n_items_fr.json")

# Message types to skip entirely
SKIP_TYPES = {"coe", "coNN", "NM", "cru", "cud", "csa", "coy", "conn", "cwj",
              "coR", "cya", "cvg", "clX", "Ok", "crV", "crW", "cod", "ctC",
              "cqF", "cqZ", "cvn", "NS", "ctD", "cqv", "cqH", "crr", "crX",
              "crf", "cqG"}

# Regex patterns
RE_TIMESTAMP = re.compile(r'^(\d{2}:\d{2}:\d{2})\.\d+')
RE_MSG_TYPE = re.compile(r'\|MSG\|(\w+)\|')
RE_GX = re.compile(r'Gx=(\d+)')
RE_FE = re.compile(r'Fe=(\d+)')
RE_BOL = re.compile(r'bol=(-?\d+)')
RE_KVL = re.compile(r'kVl=(\d+)')
RE_EJM = re.compile(r'ejM=(\d+)')
RE_HTO = re.compile(r'htO=(-?\d+)')
RE_NW = re.compile(r'nW=(\d+)')  # item ref in csF messages


def load_i18n(path):
    """Load item ID -> French name mapping."""
    try:
        with open(path, "r", encoding="utf-8") as f:
            data = json.load(f)
        # Keys are strings in the JSON, convert to int for lookup
        return {int(k): v for k, v in data.items()}
    except Exception as e:
        print(f"[WARN] Impossible de charger i18n: {e}", flush=True)
        return {}


def item_name(i18n, item_id):
    """Resolve item ID to French name, fallback to ID."""
    name = i18n.get(item_id)
    if name:
        return f"{name} (ID:{item_id})"
    return f"ID:{item_id}"


def decode_line(line, i18n):
    """Decode a single log line into human-readable text, or None to skip."""
    line = line.strip()
    if not line:
        return None

    # Skip [x2] prefixed lines
    if line.startswith("[x2]"):
        return None

    # Extract timestamp
    ts_match = RE_TIMESTAMP.match(line)
    timestamp = ts_match.group(1) if ts_match else "??:??:??"

    # Extract message type
    mt_match = RE_MSG_TYPE.search(line)
    if not mt_match:
        return None
    msg_type = mt_match.group(1)

    # Skip noise
    if msg_type in SKIP_TYPES:
        return None

    # --- Inventory/storage item messages: csE, csC, csF, csD ---
    if msg_type in ("csE", "csC", "csD"):
        gx = RE_GX.search(line)
        fe = RE_FE.search(line)
        if gx:
            item_id = int(gx.group(1))
            qty = int(fe.group(1)) if fe else 1
            name = item_name(i18n, item_id)
            label = {"csE": "Inventaire +", "csC": "Inventaire -", "csD": "Deplacement"}
            return f"[{timestamp}] \U0001f4e6 {label.get(msg_type, msg_type)}: {name} x{qty}"
        return None

    if msg_type == "csF":
        # Craft/recipe progress — extract nW as item ref
        nw = RE_NW.search(line)
        if nw:
            item_id = int(nw.group(1))
            name = item_name(i18n, item_id)
            return f"[{timestamp}] \U0001f528 Craft: {name}"
        return None

    # --- Kamas change ---
    if msg_type == "cso":
        bol = RE_BOL.search(line)
        if bol:
            amount = int(bol.group(1))
            sign = "+" if amount >= 0 else ""
            return f"[{timestamp}] \U0001f4b0 Kamas: {sign}{amount}"
        return None

    # --- Market listing (csr) with kVl = price ---
    if msg_type == "csr":
        bol = RE_BOL.search(line)
        kvl = RE_KVL.search(line)
        ejm = RE_EJM.search(line)
        qty = int(ejm.group(1)) if ejm else "?"
        price = int(kvl.group(1)) if kvl else "?"
        qty_items = int(bol.group(1)) if bol else "?"
        return f"[{timestamp}] \U0001f3ea HDV Transaction: x{qty_items} @ {price} kamas (lot={qty})"

    # --- Container data ---
    if msg_type == "csf":
        return f"[{timestamp}] \U0001f4bc Conteneur ouvert/ferme"

    # --- Map interaction ---
    if msg_type == "coM":
        return f"[{timestamp}] \U0001f5fa Interaction carte"

    # Fallback: show unhandled interesting messages
    return f"[{timestamp}] \u2753 {msg_type}: {line[20:120]}..."


def tail_log(path, i18n):
    """Tail the log file and decode new lines."""
    # Wait for file to exist
    while not os.path.exists(path):
        print(f"[INFO] En attente du fichier: {path}", flush=True)
        time.sleep(1.0)

    last_size = 0
    last_line = None  # For dedup

    # Start from end of file
    last_size = os.path.getsize(path)
    print(f"[INFO] Demarrage du decodeur live (taille actuelle: {last_size} octets)", flush=True)
    print(f"[INFO] Fichier: {path}", flush=True)
    print("-" * 60, flush=True)

    while True:
        try:
            current_size = os.path.getsize(path)
        except OSError:
            time.sleep(0.5)
            continue

        if current_size < last_size:
            # File was truncated/rotated
            print("[INFO] Fichier reinitialise, relecture depuis le debut", flush=True)
            last_size = 0

        if current_size > last_size:
            with open(path, "r", encoding="utf-8", errors="replace") as f:
                f.seek(last_size)
                new_data = f.read()
                last_size = f.tell()

            for line in new_data.splitlines():
                # Dedup: skip if identical to previous line
                if line == last_line:
                    last_line = line
                    continue
                last_line = line

                result = decode_line(line, i18n)
                if result:
                    print(result, flush=True)

        time.sleep(0.1)


def replay_log(path, i18n, last_n=200):
    """Replay last N lines of existing log for context."""
    if not os.path.exists(path):
        return

    with open(path, "r", encoding="utf-8", errors="replace") as f:
        lines = f.readlines()

    recent = lines[-last_n * 2:]  # *2 because of duplicates
    last_line = None
    printed = 0

    print("=" * 60, flush=True)
    print(f"  REPLAY des {last_n} derniers messages utiles", flush=True)
    print("=" * 60, flush=True)

    for line in recent:
        if line.strip() == last_line:
            last_line = line.strip()
            continue
        last_line = line.strip()

        result = decode_line(line, i18n)
        if result:
            print(result, flush=True)
            printed += 1

    print("=" * 60, flush=True)
    print(f"  FIN REPLAY ({printed} messages)", flush=True)
    print("=" * 60, flush=True)


def main():
    print("[INFO] Chargement i18n...", flush=True)
    i18n = load_i18n(I18N_PATH)
    print(f"[INFO] {len(i18n)} items charges", flush=True)

    # Optional: replay recent history
    if "--replay" in sys.argv:
        n = 200
        for arg in sys.argv:
            if arg.startswith("--replay="):
                n = int(arg.split("=")[1])
        replay_log(LOG_PATH, i18n, last_n=n)

    tail_log(LOG_PATH, i18n)


if __name__ == "__main__":
    main()
