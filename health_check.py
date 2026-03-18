import sys
import os
import json
import glob

REQUIRED_IMPORTS = [
    "PyQt5", "win32gui"
]

DATA_DIRS = [
    "data", "core"
]

CONFIG_FILES = [
    "data/config.json"
]

ALL_EVENTS_PATH = "all_events.jsonl"
PY_VERSION_MIN = (3, 10)

RESULTS = []

def check_python_version():
    if sys.version_info >= PY_VERSION_MIN:
        RESULTS.append(("Version de Python >= 3.10", True))
    else:
        RESULTS.append(("Version de Python >= 3.10", False))

def check_imports():
    for mod in REQUIRED_IMPORTS:
        try:
            __import__(mod)
            RESULTS.append((f"Import {mod}", True))
        except Exception:
            RESULTS.append((f"Import {mod}", False))

def check_data_dirs():
    for d in DATA_DIRS:
        if os.path.isdir(d):
            RESULTS.append((f"Dossier présent : {d}", True))
        else:
            RESULTS.append((f"Dossier manquant : {d}", False))

def check_config_json():
    ok = True
    for f in CONFIG_FILES:
        if not os.path.isfile(f):
            RESULTS.append((f"Fichier manquant : {f}", False))
            ok = False
        else:
            try:
                json.load(open(f, encoding="utf-8"))
                RESULTS.append((f"{f} valide", True))
            except Exception:
                RESULTS.append((f"{f} non valide", False))
                ok = False
    return ok

def check_all_events_jsonl():
    if not os.path.isfile(ALL_EVENTS_PATH):
        RESULTS.append((f"{ALL_EVENTS_PATH} absent (ok si non utilisé)", True))
        return
    try:
        with open(ALL_EVENTS_PATH, encoding="utf-8") as f:
            lines = f.readlines()
            json.loads(lines[0])
            json.loads(lines[-1])
        RESULTS.append((f"{ALL_EVENTS_PATH} valide (données JSONL)", True))
    except Exception:
        RESULTS.append((f"{ALL_EVENTS_PATH} invalide", False))

def check_py_syntax():
    all_ok = True
    for fn in glob.glob("**/*.py", recursive=True):
        try:
            compile(open(fn, encoding="utf-8").read(), fn, "exec")
        except Exception:
            RESULTS.append((f"Erreur de syntaxe : {fn}", False))
            all_ok = False
    if all_ok:
        RESULTS.append(("Aucune erreur de syntaxe Python détectée", True))

def summary_and_exit():
    for check, ok in RESULTS:
        print(("OK" if ok else "ERREUR"), check)
    if all(ok for _, ok in RESULTS):
        sys.exit(0)
    else:
        sys.exit(1)

if __name__ == "__main__":
    check_python_version()
    check_imports()
    check_data_dirs()
    check_config_json()
    check_all_events_jsonl()
    check_py_syntax()
    summary_and_exit()
