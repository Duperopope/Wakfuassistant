"""Wakfu Command Center - Configuration et chemins."""
import os

ROOT_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
TOOLS_DIR = os.path.dirname(os.path.abspath(__file__))

# Chemins data (fichiers locaux hors git)
CDN_PATH = os.path.join(ROOT_DIR, "docs", "RND", "data", "cdn_items_full.json")
BUILD_PATH = os.path.join(ROOT_DIR, "build-generator", "data", "build-result.json")
DB_PATH = os.path.join(ROOT_DIR, "logs", "hdv_market.db")
CRAFT_DB_PATH = os.path.join(ROOT_DIR, "logs", "craft_economy.db")
UI_PATH = os.path.join(TOOLS_DIR, "static", "index.html")
PLAYERS_DIR = os.path.join(ROOT_DIR, "logs", "players")
AGENT_LOGS = os.path.join(ROOT_DIR, "agent", "logs")
ICONS_DIR = os.path.join(ROOT_DIR, "rnd", "data", "icons")

# .env loading
ENV = {}
_env_path = os.path.join(ROOT_DIR, ".env")
if os.path.isfile(_env_path):
    with open(_env_path, "r", encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if line and not line.startswith("#") and "=" in line:
                k, v = line.split("=", 1)
                ENV[k.strip()] = v.strip()

API_KEY = ENV.get("API_KEY", "")
ADMIN_HASH = ENV.get("ADMIN_PASSWORD_HASH", "")
HOST = ENV.get("HOST", "127.0.0.1")
PORT = int(ENV.get("PORT", "8042"))
CORS_ORIGINS = ENV.get("CORS_ORIGINS", "http://localhost:8042,http://127.0.0.1:8042").split(",")
SESSION_SECRET = ENV.get("SESSION_SECRET", "dev-secret")
TOKEN_EXPIRY = int(ENV.get("TOKEN_EXPIRY_HOURS", "24")) * 3600

# Mapping constantes Wakfu
RARITY_MAP = {
    0: ("Commun", "#c0c0c0"), 1: ("Inhabituel", "#ffffff"),
    2: ("Rare", "#00cc44"), 3: ("Mythique", "#ff8c19"),
    4: ("Legendaire", "#ffee00"), 5: ("Relique", "#ff55ff"),
    6: ("Souvenir", "#6cf"), 7: ("Epique", "#ff6600"),
}

TYPE_MAP = {
    101: "Hache", 103: "Anneau", 108: "Baguette", 110: "Epee",
    111: "Pelle", 112: "Dague", 113: "Baton", 114: "Marteau",
    115: "Aiguille", 117: "Arc", 119: "Bouclier", 120: "Amulette",
    132: "Bottes", 133: "Ceinture", 134: "Casque", 136: "Plastron",
    138: "Cape", 189: "Epaulettes", 218: "Arme 2 Mains",
    223: "Torche", 253: "Poing", 254: "Cartes", 480: "Embleme",
    520: "Familier", 537: "Monture", 812: "Sublimation",
}


def check_paths():
    """Verifie que les fichiers data existent et affiche le statut."""
    paths = {
        "CDN": CDN_PATH, "Build": BUILD_PATH, "DB HDV": DB_PATH,
        "UI HTML": UI_PATH, "Players": PLAYERS_DIR,
    }
    for name, path in paths.items():
        exists = os.path.exists(path)
        size = ""
        if exists and os.path.isfile(path):
            s = os.path.getsize(path)
            size = f" ({s/1_000_000:.1f} MB)" if s > 1_000_000 else f" ({s:,} bytes)"
        status = "OK" if exists else "MANQUANT"
        print(f"  [{status}] {name}: {path}{size}")
