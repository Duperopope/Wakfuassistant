#!/usr/bin/env python3
"""
Décodeur HDV Wakfu - Analyse complète du payload auo.
Structure découverte (76 + name_len bytes total):
  [61 bytes : prefix fixe][1 byte : name_len][N bytes : name][14 bytes : tail]

Tail structure (14 bytes):
  [6 zeros][2 bytes : valeur_A][2 bytes : zeros?][2 bytes : valeur_B][2 bytes : valeur_C]

Usage: python decode_hdv.py
"""
import json
import struct
import sys
from pathlib import Path

JSONL_PATH = Path(r"H:\Code\Wakfuassistant\agent\logs\wakfu_hdv_offers.jsonl")

# Prix connus affichés à l'écran pour 5 des offres "Ombre"
KNOWN_PRICES = [20_000_000, 12_000_000, 8_499_998, 8_444_444, 8_350_000]

# Offsets connus dans la structure (empirique)
PREFIX_SIZE = 61      # bytes fixes avant le byte longueur du nom
TAIL_SIZE = 14        # bytes de tail après le nom

def parse_hex_payload(auo_str: str) -> bytes:
    if '_' not in auo_str:
        return b''
    hex_part = auo_str.split('_', 1)[1].rstrip('.')
    if len(hex_part) % 2 != 0:
        hex_part = hex_part[:-1]
    try:
        return bytes.fromhex(hex_part)
    except ValueError:
        return b''

def find_name_offset(data: bytes) -> tuple[int, int, str]:
    for i in range(20, len(data) - 2):
        n = data[i]
        if 2 <= n <= 24 and i + 1 + n < len(data):
            chunk = data[i+1 : i+1+n]
            if all(32 <= b < 127 for b in chunk):
                return i, n, chunk.decode('latin-1')
    return -1, 0, ""

def decode_varint(data: bytes, offset: int) -> tuple[int, int]:
    """Décode un varint protobuf. Retourne (valeur, nb_bytes_consommés)."""
    val = 0
    shift = 0
    for i in range(10):
        if offset + i >= len(data):
            return -1, 0
        b = data[offset + i]
        val |= (b & 0x7F) << shift
        shift += 7
        if not (b & 0x80):
            return val, i + 1
    return -1, 0

def encode_varint(value: int) -> bytes:
    """Encode une valeur en varint protobuf."""
    result = []
    while value > 0x7F:
        result.append((value & 0x7F) | 0x80)
        value >>= 7
    result.append(value)
    return bytes(result)

def search_price_exhaustive(data: bytes, name: str) -> list[str]:
    """Cherche les prix connus dans TOUS formats / offsets."""
    hits = []
    for price in KNOWN_PRICES:
        # int16/32/64 BE et LE
        for offset in range(len(data)):
            for fmt, size in [('>H', 2), ('<H', 2), ('>I', 4), ('<I', 4),
                               ('>i', 4), ('<i', 4), ('>Q', 8), ('<Q', 8),
                               ('>q', 8), ('<q', 8)]:
                if offset + size <= len(data):
                    v = struct.unpack_from(fmt, data, offset)[0]
                    if v == price:
                        hits.append(f"  *** PRIX {price:,} @ offset {offset} fmt={fmt} : "
                                     f"{data[offset:offset+size].hex().upper()}")
        # Varint protobuf
        target_varint = encode_varint(price)
        for offset in range(len(data) - len(target_varint) + 1):
            if data[offset:offset+len(target_varint)] == target_varint:
                hits.append(f"  *** PRIX {price:,} varint({len(target_varint)}B) @ offset {offset}: "
                             f"{target_varint.hex().upper()}")
        # Avec facteurs
        for factor in [10, 100, 1000, 10000]:
            if price % factor == 0:
                scaled = price // factor
                for fmt, size in [('>H', 2), ('<H', 2), ('>I', 4), ('<I', 4)]:
                    for offset in range(len(data)):
                        if offset + size <= len(data):
                            v = struct.unpack_from(fmt, data, offset)[0]
                            if v == scaled:
                                hits.append(f"  *** PRIX {price:,} = {scaled}×{factor} "
                                             f"@ offset {offset} fmt={fmt}: "
                                             f"{data[offset:offset+size].hex().upper()}")
    return hits

def decode_prefix(data: bytes) -> dict:
    """Décode les champs clés du prefix de 61 bytes."""
    if len(data) < 61:
        return {}
    result = {}
    result['byte13'] = data[13]  # varie (1,2,3) ~ enchant count?
    # Corps obfusqué (après marker 6F à position 41)
    if data[41] == 0x6F:
        result['marker_pos'] = 41
        result['flags'] = struct.unpack_from('>I', data, 42)[0]
        result['flags_hex'] = data[42:46].hex().upper()
        result['field'] = struct.unpack_from('>I', data, 46)[0]
        result['type'] = data[50:52].hex().upper()
        result['subtype'] = data[52:54].hex().upper()
        result['player_id'] = data[57:61].hex().upper()
    return result

def analyze_tail(tail: bytes) -> dict:
    """Analyse les 14 bytes de tail."""
    result = {
        'full_hex': tail.hex().upper(),
        'len': len(tail),
    }
    if len(tail) >= 8:
        result['zeros'] = tail[:6].hex().upper()
        result['A'] = struct.unpack_from('>H', tail, 6)[0]
        result['A_LE'] = struct.unpack_from('<H', tail, 6)[0]
    if len(tail) >= 10:
        result['B'] = struct.unpack_from('>H', tail, 8)[0]
    if len(tail) >= 12:
        result['C'] = struct.unpack_from('>H', tail, 10)[0]
        result['C_LE'] = struct.unpack_from('<H', tail, 10)[0]
    if len(tail) >= 14:
        result['D'] = struct.unpack_from('>H', tail, 12)[0]
        result['D_LE'] = struct.unpack_from('<H', tail, 12)[0]
    # Cherche le prix dans le tail complet
    if len(tail) >= 14:
        for price in KNOWN_PRICES:
            varint = encode_varint(price)
            for i in range(len(tail) - len(varint) + 1):
                if tail[i:i+len(varint)] == varint:
                    result[f'PRIX_{price}'] = f'varint @ tail[{i}]'
            for fmt, size in [('>I', 4), ('<I', 4), ('>Q', 8), ('<Q', 8)]:
                for i in range(len(tail)):
                    if i + size <= len(tail):
                        v = struct.unpack_from(fmt, tail, i)[0]
                        if v == price:
                            result[f'PRIX_{price}'] = f'{fmt} @ tail[{i}]'
    return result

def main():
    if not JSONL_PATH.exists():
        print(f"Fichier introuvable: {JSONL_PATH}")
        sys.exit(1)

    seen_ids = set()
    offers = []

    with open(JSONL_PATH) as f:
        for line in f:
            line = line.strip()
            if not line:
                continue
            try:
                obj = json.loads(line)
            except json.JSONDecodeError:
                continue

            offer_id = obj.get('offerId')
            if offer_id in seen_ids:
                continue
            seen_ids.add(offer_id)

            fields = obj.get('fields', {})
            auo = fields.get('auo', '')
            dvg = fields.get('dvG', 0)

            # Taille annoncée
            size_str = auo.split('_')[0] if '_' in auo else ''
            announced = int(size_str.split('[')[1].split(']')[0]) if '[' in size_str else 0

            data = parse_hex_payload(auo)
            if not data:
                continue

            name_off, name_len, name = find_name_offset(data)
            if name_off < 0:
                continue

            post_start = name_off + 1 + name_len
            tail = data[post_start:]
            tail_missing = (announced - len(data)) if announced > len(data) else 0

            prefix = decode_prefix(data)
            tail_info = analyze_tail(tail)

            offers.append({
                'offer_id': offer_id,
                'dvG': dvg,
                'data': data,
                'name': name,
                'name_off': name_off,
                'name_len': name_len,
                'announced': announced,
                'captured': len(data),
                'tail_missing': tail_missing,
                'prefix': prefix,
                'tail': tail,
                'tail_info': tail_info,
            })

    print(f"=== {len(offers)} offres uniques (refId=3700 'Ombre') ===")
    print(f"Prix attendus: {[f'{p:,}' for p in KNOWN_PRICES]}\n")

    # =====================================================================
    # TABLE PRINCIPALE
    # =====================================================================
    print("=== TABLE DES OFFRES ===")
    print(f"{'Vendeur':20s} | {'dvG':15s} | {'flags':10s} | {'field':5s} | {'type':6s} | "
          f"{'b13':3s} | {'tail_A':6s} | {'tail_C':6s} | {'tail_D':6s} | {'miss':4s} | TAIL HEX")
    print("-" * 130)

    for o in sorted(offers, key=lambda x: x['dvG']):
        p = o['prefix']
        ti = o['tail_info']
        print(f"{o['name']:20s} | {o['dvG']:15d} | {p.get('flags_hex','?'):10s} | "
              f"{p.get('field', 0):5d} | {p.get('type','?'):6s} | "
              f"{p.get('byte13', 0):3d} | "
              f"{ti.get('A',0):6d} | {ti.get('C',0):6d} | {ti.get('D',0):6d} | "
              f"{o['tail_missing']:4d} | {ti.get('full_hex','?')}")

    # =====================================================================
    # RECHERCHE EXHAUSTIVE DU PRIX
    # =====================================================================
    print(f"\n=== RECHERCHE EXHAUSTIVE DU PRIX ===")
    any_hit = False
    for o in offers:
        hits = search_price_exhaustive(o['data'], o['name'])
        if hits:
            any_hit = True
            print(f"\n{o['name']:}")
            for h in hits:
                print(h)
    if not any_hit:
        print("AUCUN HIT - Prix non trouvé dans les 80 bytes capturés.")
        print("→ Vérifier que le JAR est bien le nouveau (rebuild fait le 2026-03-22)")
        print("→ Relancer Wakfu avec le nouveau JAR, revisiter l'HDV Ombre")

    # =====================================================================
    # ANALYSE DU TAIL : corrélation valeur A avec prix
    # =====================================================================
    print(f"\n=== ANALYSE CORRÉLATION TAIL_A / TAIL_C / TAIL_D ===")
    print("Tail_A × 1 / × 10 / × 100 / × 1000 pour chaque offre :")
    for o in sorted(offers, key=lambda x: x['dvG']):
        ti = o['tail_info']
        A = ti.get('A', 0)
        A_LE = ti.get('A_LE', 0)
        C = ti.get('C', 0)
        D = ti.get('D', 0)
        if A or A_LE or C or D:
            mults = [A, A*10, A*100, A*1000, A_LE, A_LE*1000]
            close = [m for m in mults if any(abs(m - p) < p * 0.05 for p in KNOWN_PRICES)]
            print(f"  {o['name']:20s}: A={A:6d} A_LE={A_LE:6d} C={C:6d} D={D:6d}"
                  f"{'  ← PROCHE PRIX: '+str(close) if close else ''}")

    # =====================================================================
    # VARINT SEARCH : bytes exacts attendus pour chaque prix
    # =====================================================================
    print(f"\n=== VARINT ENCODINGS DES PRIX ATTENDUS ===")
    for price in KNOWN_PRICES:
        vb = encode_varint(price)
        print(f"  {price:,} → varint = {vb.hex().upper()} ({len(vb)} bytes)")

    # =====================================================================
    # HEX DUMP COMPLET de chaque offre
    # =====================================================================
    print(f"\n=== HEX DUMP COMPLET ===")
    for o in sorted(offers, key=lambda x: x['dvG']):
        print(f"\n{'='*70}")
        print(f"{o['name']:} (dvG={o['dvG']}, captured={o['captured']}B/"
              f"announced={o['announced']}B, missing={o['tail_missing']}B)")
        data = o['data']
        # Hex dump avec offset
        for row in range(0, len(data), 16):
            chunk = data[row:row+16]
            hex_part = ' '.join(f'{b:02X}' for b in chunk)
            ascii_part = ''.join(chr(b) if 32 <= b < 127 else '.' for b in chunk)
            print(f"  {row:04X}: {hex_part:<48s}  {ascii_part}")

        # Annotations structurelles
        p = o['prefix']
        name_off = o['name_off']
        print(f"  → prefix[13]={p.get('byte13',0)} | flags={p.get('flags_hex','?')} "
              f"| field={p.get('field',0)} | type={p.get('type','?')} "
              f"| subtype={p.get('subtype','?')} | playerID={p.get('player_id','?')}")
        print(f"  → name@[{name_off}:{name_off+1+o['name_len']}]={o['name']!r}")
        print(f"  → tail@[{name_off+1+o['name_len']}:] = {o['tail'].hex().upper()}")

if __name__ == '__main__':
    main()
