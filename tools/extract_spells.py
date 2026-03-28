#!/usr/bin/env python3
"""
Extrait les sorts depuis les données binaires du jeu Wakfu (bdata/66.bin).

Format binaire (reverse-engineered depuis le code décompilé) :
  - Header: int scrambleBase = readInt() + 756423
  - Index: N entries × (long id, int offset, int size, byte scramble)
  - Column index: byte count, then column metadata
  - Data records: chaque record est lu avec son propre scramble byte

Le reader utilise un scramble progressif :
  - cRa initial = (cRc ^ cRb)  avec cRc = typeId (66), cRb = scrambleBase
  - à chaque lecture: cRa = byte(cRa + (cRc * position + cRb))
  - readInt = buffer.getInt() - cRa
  - readShort = buffer.getShort() - cRa
  - readByte = buffer.getByte() - cRa
  - readBool = (buffer.getByte() - cRa) != 0
  - readFloat = buffer.getFloat()  (PAS de scramble)
  - readString = readInt(len) + raw bytes

Les 3 premiers champs de chaque sort sont :
  int spellId, int egP, int gfxId
"""

import struct
import json
import zipfile
from pathlib import Path

BDATA_PATH = Path(r"C:\Users\Smedj\AppData\Local\Ankama\Wakfu\contents\bdata\66.jar")
OUTPUT_PATH = Path(__file__).resolve().parent.parent / "rnd" / "data" / "spell_names_fr.json"
TYPE_ID = 66  # ewj_2.ozD = 66


class ScrambleReader:
    """Émule aqh_1 / aqj_1 du client Wakfu."""

    def __init__(self, data: bytes, cRc: int, cRb: int):
        self.data = data
        self.pos = 0
        self.cRc = cRc
        self.cRb = cRb
        self.cRa = (cRc ^ cRb) & 0xFF

    def _advance_scramble(self):
        """bGQ(): cRa = byte(cRa + (cRc * position + cRb))"""
        self.cRa = (self.cRa + (self.cRc * self.pos + self.cRb)) & 0xFF

    def set_position(self, pos: int, scramble_byte: int):
        """a(int n, byte by): reset position and scramble."""
        self.cRa = scramble_byte & 0xFF
        self.pos = pos

    def read_byte(self) -> int:
        self._advance_scramble()
        val = self.data[self.pos]
        self.pos += 1
        return (val - self.cRa) & 0xFF

    def read_sbyte(self) -> int:
        v = self.read_byte()
        return v if v < 128 else v - 256

    def read_bool(self) -> bool:
        self._advance_scramble()
        val = self.data[self.pos]
        self.pos += 1
        return (val - self.cRa) & 0xFF != 0

    def read_short(self) -> int:
        self._advance_scramble()
        val = struct.unpack_from('<h', self.data, self.pos)[0]
        self.pos += 2
        return (val - self.cRa) & 0xFFFF

    def read_sshort(self) -> int:
        v = self.read_short()
        return v if v < 32768 else v - 65536

    def read_int(self) -> int:
        self._advance_scramble()
        val = struct.unpack_from('<i', self.data, self.pos)[0]
        self.pos += 4
        return val - self.cRa

    def read_float(self) -> float:
        self._advance_scramble()
        val = struct.unpack_from('<f', self.data, self.pos)[0]
        self.pos += 4
        return val

    def read_long(self) -> int:
        self._advance_scramble()
        val = struct.unpack_from('<q', self.data, self.pos)[0]
        self.pos += 8
        return val - self.cRa

    def read_string(self) -> str:
        length = self.read_int()
        if length <= 0 or length > 10000:
            return ""
        raw = self.data[self.pos:self.pos + length]
        self.pos += length
        return raw.decode('utf-8', errors='replace')

    def read_int_array(self) -> list:
        n = self.read_int()
        return [self.read_int() for _ in range(n)]


def parse_spell_record(reader: ScrambleReader) -> dict:
    """Parse un record aOx (sort) — voir aOx.a(aqh_1)."""
    spell_id = reader.read_int()      # o
    egP = reader.read_int()            # egP (unknown)
    gfx_id = reader.read_int()         # ciZ = gfxId
    aWK = reader.read_sshort()         # aWK
    aZk = reader.read_sshort()         # aZk (breed?)
    erz = reader.read_sshort()         # erz
    erA = reader.read_float()          # erA
    erB = reader.read_float()          # erB
    erC = reader.read_sshort()         # erC
    erD = reader.read_bool()           # erD
    erE = reader.read_bool()           # erE
    erF = reader.read_bool()           # erF
    erG = reader.read_bool()           # erG
    erH = reader.read_bool()           # erH
    erI = reader.read_bool()           # erI
    erJ = reader.read_bool()           # erJ
    erK = reader.read_int()            # erK
    erL = reader.read_string()         # erL (area/target?)
    erM = reader.read_sshort()         # erM
    # 10 floats
    for _ in range(10):
        reader.read_float()
    # 4 shorts
    for _ in range(4):
        reader.read_sshort()
    esb = reader.read_sshort()         # esb
    eqF = reader.read_string()         # eqF
    esc = reader.read_string()         # esc
    esd = reader.read_sbyte()          # esd
    ese = reader.read_bool()           # ese
    esf = reader.read_bool()           # esf
    esg = reader.read_bool()           # esg
    esh = reader.read_sbyte()          # esh
    esi = reader.read_bool()           # esi
    esj = reader.read_bool()           # esj
    esk = reader.read_bool()           # esk
    esl = reader.read_bool()           # esl
    esm = reader.read_bool()           # esm
    esn = reader.read_bool()           # esn
    baD = reader.read_int_array()      # baD (int[])
    egL = reader.read_int_array()      # egL (int[])
    # HashMap<byte, aoz_0>
    n_eso = reader.read_int()
    for _ in range(n_eso):
        reader.read_sbyte()            # key
        # aoz_0.a(reader) — need to know its format
        # For now we skip — this may fail
        pass

    return {
        "id": spell_id,
        "gfxId": gfx_id,
        "breed": aZk,
    }


def main():
    # Extraire 66.bin du JAR
    with zipfile.ZipFile(BDATA_PATH, 'r') as zf:
        raw_data = zf.read('66.bin')

    print(f"Données binaires: {len(raw_data)} octets")

    # Lire le header
    buf = raw_data
    scramble_base = struct.unpack_from('<i', buf, 0)[0] + 756423
    print(f"Scramble base: {scramble_base}")

    # Créer le reader pour l'index
    reader = ScrambleReader(buf, TYPE_ID, scramble_base)
    reader.pos = 4  # après le premier int

    # Lire l'index: N entries
    n_records = reader.read_int()
    print(f"Nombre de records: {n_records}")

    index = []
    for _ in range(n_records):
        rec_id = reader.read_long()
        offset = reader.read_int()
        size = reader.read_int()
        scramble = reader.read_sbyte()
        index.append((rec_id, offset, size, scramble))

    print(f"Index lu: {len(index)} entrées")
    if index:
        print(f"  Premier: id={index[0][0]}, offset={index[0][1]}, size={index[0][2]}")
        print(f"  Dernier: id={index[-1][0]}, offset={index[-1][1]}, size={index[-1][2]}")

    # Lire le column index (on le skip pour l'instant)
    n_columns = reader.read_sbyte()
    print(f"Colonnes: {n_columns}")
    # Skip column metadata — chaque colonne a un format spécifique
    # aqm_1.b(reader) — on doit parser ça
    # Pour l'instant, on note la position après le column index
    # et on utilise les offsets directs

    # La section data commence après le column index
    # Les offsets dans l'index sont relatifs au début de la data section
    # (après le slice dans le constructeur aqa_1)
    # Le data reader est créé avec buffer.slice() à la position actuelle
    # Donc les offsets sont relatifs à la fin de l'index/column section

    # Mais on ne connaît pas la taille exacte du column index...
    # Parsons aqm_1.b(reader) pour chaque colonne
    for _ in range(n_columns & 0xFF):
        col_name = reader.read_string()
        col_type = reader.read_sbyte()
        # Le reste dépend de aqm_1 — c'est un index secondaire
        # Pour simplifier, essayons de trouver la data section
        # en parsant ce qu'on peut
        n_entries = reader.read_int()
        for _ in range(n_entries):
            reader.read_long()   # key
            reader.read_int()    # count
            # array of indices
            n_idx = reader.read_int()
            for _ in range(n_idx):
                reader.read_int()
        print(f"  Colonne '{col_name}' (type={col_type}): {n_entries} clés")

    data_start = reader.pos
    print(f"Data section commence à l'offset {data_start}")

    # Créer un nouveau reader pour la data section
    data_buf = buf[data_start:]
    data_reader = ScrambleReader(data_buf, TYPE_ID, scramble_base)

    # Parser chaque record
    results = {}
    errors = 0
    for rec_id, offset, size, scramble_byte in index:
        try:
            data_reader.set_position(offset, scramble_byte)
            spell = parse_spell_record(data_reader)
            # Vérifier que la lecture est cohérente
            if spell["id"] > 0 and spell["id"] < 100000:
                results[spell["id"]] = {
                    "gfxId": spell["gfxId"],
                    "name": "",  # pas de nom dans les bdata (c'est dans i18n)
                }
        except Exception as e:
            errors += 1
            if errors <= 5:
                print(f"  Erreur record id={rec_id}: {e}")

    print(f"\nRésultat: {len(results)} sorts extraits, {errors} erreurs")

    # Vérifier quelques sorts connus
    for sid in [4588, 4585, 4595, 4609, 4956, 8511]:
        if sid in results:
            print(f"  Sort {sid}: gfxId={results[sid]['gfxId']}")
        else:
            print(f"  Sort {sid}: NON TROUVÉ")

    # Sauvegarder
    with open(OUTPUT_PATH, 'w', encoding='utf-8') as f:
        json.dump(results, f, indent=2, ensure_ascii=False)
    print(f"\nSauvegardé dans {OUTPUT_PATH}")


if __name__ == "__main__":
    main()
