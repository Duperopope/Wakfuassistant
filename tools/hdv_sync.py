import struct, hashlib, sqlite3, os, re, logging
from datetime import datetime, timezone

log = logging.getLogger("hdv_sync")

# --- Protobuf primitives ---

def read_varint(data, pos):
    value = 0; shift = 0
    while pos < len(data):
        b = data[pos]; pos += 1
        value |= (b & 0x7F) << shift
        if (b & 0x80) == 0:
            return value, pos
        shift += 7
        if shift > 63:
            raise ValueError("Varint too long")
    raise ValueError("Unexpected EOF in varint")

def read_length_delimited(data, pos):
    length, pos = read_varint(data, pos)
    if length < 0 or pos + length > len(data):
        raise ValueError("Invalid length-delimited field")
    return data[pos:pos+length], pos + length

def skip_field(data, wire_type, pos):
    if wire_type == 0:
        _, pos = read_varint(data, pos)
    elif wire_type == 1:
        pos += 8
    elif wire_type == 2:
        _, pos = read_length_delimited(data, pos)
    elif wire_type == 5:
        pos += 4
    else:
        raise ValueError(f"Unsupported wire type: {wire_type}")
    return pos

# --- Color mapping (corrected: 2=Vert, 3=Bleu) ---

SLOT_COLORS = {0: "Vide", 1: "Rouge", 2: "Vert", 3: "Bleu", 4: "Blanc", 5: "Noir", 6: "Any"}

def decode_slot_color(val):
    return SLOT_COLORS.get(val, f"?({val})")

# --- Parse sell entry (msgId=12294) ---

def parse_sell_entry(entry_bytes, source_ts):
    pos = 0
    uid = 0; item_ref_id = 0; seller = "?"; actor_id = 0; seller_level = 0; seller_breed = 0
    unit_price = 0; qty_init = 0; qty_remain = 0; sell_duration = 0; expiration_ts = 0
    slot_colors = []; sublim_id = 0; special_sublim_id = 0

    while pos < len(entry_bytes):
        tag, pos = read_varint(entry_bytes, pos)
        field = tag >> 3; wire = tag & 7

        if field == 1 and wire == 0:
            uid, pos = read_varint(entry_bytes, pos)
            uid = _to_signed64(uid)
        elif field == 2 and wire == 2:
            kw_bytes, pos = read_length_delimited(entry_bytes, pos)
            kp = 0
            while kp < len(kw_bytes):
                ktag, kp = read_varint(kw_bytes, kp)
                kf = ktag >> 3; kw = ktag & 7
                if kf == 2 and kw == 0:
                    item_ref_id, kp = read_varint(kw_bytes, kp)
                elif kf == 52 and kw == 2:
                    shard_bytes, kp = read_length_delimited(kw_bytes, kp)
                    sp = 0
                    while sp < len(shard_bytes):
                        stag, sp = read_varint(shard_bytes, sp)
                        sf = stag >> 3; sw = stag & 7
                        if sf == 1 and sw == 2:
                            slot_bytes, sp = read_length_delimited(shard_bytes, sp)
                            slp = 0; slot_color = 0; slot_sublim = 0
                            while slp < len(slot_bytes):
                                sltag, slp = read_varint(slot_bytes, slp)
                                slf = sltag >> 3; slw = sltag & 7
                                if slw == 0:
                                    slval, slp = read_varint(slot_bytes, slp)
                                    if slf == 12:
                                        slot_color = slval
                                    elif slf == 14:
                                        slot_sublim = slval
                                else:
                                    slp = skip_field(slot_bytes, slw, slp)
                            slot_colors.append(decode_slot_color(slot_color))
                            if slot_sublim > 0 and sublim_id == 0:
                                sublim_id = slot_sublim
                        else:
                            sp = skip_field(shard_bytes, sw, sp)
                else:
                    kp = skip_field(kw_bytes, kw, kp)
        elif field == 3 and wire == 2:
            seller_bytes, pos = read_length_delimited(entry_bytes, pos)
            sp3 = 0
            while sp3 < len(seller_bytes):
                stag3, sp3 = read_varint(seller_bytes, sp3)
                sf3 = stag3 >> 3; sw3 = stag3 & 7
                if sf3 == 1 and sw3 == 0:
                    actor_id, sp3 = read_varint(seller_bytes, sp3)
                    actor_id = _to_signed64(actor_id)
                elif sf3 == 2 and sw3 == 2:
                    name_bytes, sp3 = read_length_delimited(seller_bytes, sp3)
                    decoded = name_bytes.decode("utf-8", errors="replace").strip()
                    if decoded:
                        seller = decoded
                elif sf3 == 3 and sw3 == 0:
                    seller_level, sp3 = read_varint(seller_bytes, sp3)
                elif sf3 == 4 and sw3 == 0:
                    seller_breed, sp3 = read_varint(seller_bytes, sp3)
                else:
                    sp3 = skip_field(seller_bytes, sw3, sp3)
        elif field == 5 and wire == 0:
            qty_init, pos = read_varint(entry_bytes, pos)
        elif field == 6 and wire == 0:
            qty_remain, pos = read_varint(entry_bytes, pos)
        elif field == 7 and wire == 0:
            unit_price, pos = read_varint(entry_bytes, pos)
        elif field == 8 and wire == 0:
            sell_duration, pos = read_varint(entry_bytes, pos)
        elif field == 9 and wire == 0:
            expiration_ts, pos = read_varint(entry_bytes, pos)
        else:
            pos = skip_field(entry_bytes, wire, pos)

    exp_date = ""
    if expiration_ts > 0:
        try:
            exp_date = datetime.fromtimestamp(expiration_ts / 1000, tz=timezone.utc).strftime("%Y-%m-%d %H:%M:%S")
        except:
            pass

    return {
        "side": "sell", "item_ref_id": item_ref_id, "offer_uid": uid,
        "actor_name": seller, "actor_id": actor_id, "actor_level": seller_level,
        "actor_breed": seller_breed, "unit_price": unit_price, "qty_init": qty_init,
        "qty_remaining": qty_remain, "sell_duration": sell_duration,
        "expiration_ts": expiration_ts, "expiration_date": exp_date,
        "source_ts": source_ts, "slot_colors": ",".join(slot_colors),
        "sublimation_id": sublim_id, "special_sublimation_id": special_sublim_id,
    }

# --- Parse buy entry (msgId=13653) - same structure ---

def parse_buy_entry(entry_bytes, source_ts):
    result = parse_sell_entry(entry_bytes, source_ts)
    result["side"] = "buy"
    return result

def _to_signed64(v):
    if v >= (1 << 63):
        v -= (1 << 64)
    return v

# --- Parse entries wrapper ---

def parse_entries(proto_bytes, source_ts, kind="sell"):
    entries = []; pos = 0
    parser = parse_sell_entry if kind == "sell" else parse_buy_entry
    while pos < len(proto_bytes):
        tag, pos = read_varint(proto_bytes, pos)
        field = tag >> 3; wire = tag & 7
        if field == 2 and wire == 2:
            entry_bytes, pos = read_length_delimited(proto_bytes, pos)
            try:
                entries.append(parser(entry_bytes, source_ts))
            except Exception as e:
                log.debug("Parse entry error: %s", e)
        else:
            pos = skip_field(proto_bytes, wire, pos)
    return entries

# --- Parse proto log file (incremental) ---

def parse_proto_log(log_path, from_offset=0):
    entries = []
    with open(log_path, "r", encoding="utf-8") as f:
        f.seek(from_offset)
        while True:
            line = f.readline()
            if not line:
                break
            line = line.strip()
            m = re.search(r"PROTOHEX=([0-9A-Fa-f]+)$", line)
            if not m:
                continue
            source_ts = line.split("|", 1)[0]
            hex_str = m.group(1)
            proto_bytes = bytes.fromhex(hex_str)

            if "|msgId=12294|" in line:
                entries.extend(parse_entries(proto_bytes, source_ts, "sell"))
            elif "|msgId=13653|" in line:
                entries.extend(parse_entries(proto_bytes, source_ts, "buy"))
        new_offset = f.tell()
    return entries, new_offset

# --- Sync to SQLite ---

SCHEMA_SQL = """
PRAGMA journal_mode=WAL;
CREATE TABLE IF NOT EXISTS market_observations (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  observed_at TEXT NOT NULL,
  side TEXT NOT NULL,
  item_ref_id INTEGER NOT NULL,
  offer_uid INTEGER NOT NULL,
  actor_name TEXT DEFAULT '',
  actor_id INTEGER DEFAULT 0,
  unit_price INTEGER NOT NULL DEFAULT 0,
  qty_init INTEGER DEFAULT 1,
  qty_remaining INTEGER DEFAULT 1,
  sell_duration INTEGER DEFAULT 0,
  expiration_ts INTEGER DEFAULT 0,
  source_msg_id INTEGER NOT NULL,
  source_ts TEXT NOT NULL,
  line_hash TEXT NOT NULL UNIQUE
);
CREATE INDEX IF NOT EXISTS idx_obs_item_side ON market_observations(item_ref_id, side);
CREATE INDEX IF NOT EXISTS idx_obs_ts ON market_observations(source_ts);
CREATE TABLE IF NOT EXISTS market_latest (
  side TEXT NOT NULL,
  item_ref_id INTEGER NOT NULL,
  offer_uid INTEGER NOT NULL,
  actor_name TEXT DEFAULT '',
  actor_id INTEGER DEFAULT 0,
  actor_level INTEGER DEFAULT 0,
  actor_breed INTEGER DEFAULT 0,
  unit_price INTEGER NOT NULL DEFAULT 0,
  qty_init INTEGER DEFAULT 1,
  qty_remaining INTEGER DEFAULT 1,
  sell_duration INTEGER DEFAULT 0,
  expiration_ts INTEGER DEFAULT 0,
  expiration_date TEXT DEFAULT '',
  source_msg_id INTEGER NOT NULL,
  source_ts TEXT NOT NULL,
  updated_at TEXT NOT NULL,
  slot_colors TEXT DEFAULT '',
  sublimation_id INTEGER DEFAULT 0,
  special_sublimation_id INTEGER DEFAULT 0,
  PRIMARY KEY (side, item_ref_id, offer_uid)
);
CREATE INDEX IF NOT EXISTS idx_latest_item ON market_latest(item_ref_id);
"""

def sync_to_db(db_path, entries):
    if not entries:
        return 0
    conn = sqlite3.connect(db_path)
    conn.executescript(SCHEMA_SQL)
    now = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    inserted = 0
    cursor = conn.cursor()
    cursor.execute("BEGIN")
    for e in entries:
        msg_id = 12294 if e["side"] == "sell" else 13653
        fingerprint = f"{e['side']}|{e['item_ref_id']}|{e['offer_uid']}|{e['unit_price']}|{e['qty_remaining']}|{e['source_ts']}|{e['actor_name']}"
        line_hash = hashlib.sha1(fingerprint.encode("utf-8")).hexdigest()
        try:
            cursor.execute(
                "INSERT OR IGNORE INTO market_observations(observed_at,side,item_ref_id,offer_uid,actor_name,actor_id,unit_price,qty_init,qty_remaining,sell_duration,expiration_ts,source_msg_id,source_ts,line_hash) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                (now, e["side"], e["item_ref_id"], e["offer_uid"], e["actor_name"], e["actor_id"], e["unit_price"], e["qty_init"], e["qty_remaining"], e["sell_duration"], e["expiration_ts"], msg_id, e["source_ts"], line_hash)
            )
            cursor.execute(
                """INSERT INTO market_latest(side,item_ref_id,offer_uid,actor_name,actor_id,actor_level,actor_breed,unit_price,qty_init,qty_remaining,sell_duration,expiration_ts,expiration_date,source_msg_id,source_ts,updated_at,slot_colors,sublimation_id,special_sublimation_id)
                VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
                ON CONFLICT(side,item_ref_id,offer_uid) DO UPDATE SET
                actor_name=excluded.actor_name, actor_id=excluded.actor_id, actor_level=excluded.actor_level,
                actor_breed=excluded.actor_breed, unit_price=excluded.unit_price, qty_init=excluded.qty_init,
                qty_remaining=excluded.qty_remaining, sell_duration=excluded.sell_duration,
                expiration_ts=excluded.expiration_ts, expiration_date=excluded.expiration_date,
                source_msg_id=excluded.source_msg_id, source_ts=excluded.source_ts, updated_at=excluded.updated_at,
                slot_colors=excluded.slot_colors, sublimation_id=excluded.sublimation_id,
                special_sublimation_id=excluded.special_sublimation_id""",
                (e["side"], e["item_ref_id"], e["offer_uid"], e["actor_name"], e["actor_id"], e["actor_level"], e["actor_breed"], e["unit_price"], e["qty_init"], e["qty_remaining"], e["sell_duration"], e["expiration_ts"], e["expiration_date"], msg_id, e["source_ts"], now, e["slot_colors"], e["sublimation_id"], e["special_sublimation_id"])
            )
            inserted += 1
        except Exception as ex:
            log.debug("Insert error: %s", ex)
    cursor.execute("COMMIT")
    conn.close()
    return inserted

def run_sync(log_path, db_path, from_offset=0):
    entries, new_offset = parse_proto_log(log_path, from_offset)
    count = sync_to_db(db_path, entries)
    log.info("HDV sync: %d entries parsed, %d synced, offset %d -> %d", len(entries), count, from_offset, new_offset)
    return count, new_offset
