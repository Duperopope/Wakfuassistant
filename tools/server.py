#!/usr/bin/env python3
"""
Wakfu Command Center - Serveur principal.
Point d'entree unique: python tools/server.py

Modules:
    config.py  - Chemins, .env, constantes
    auth.py    - Authentification API key + sessions
    cdn.py     - Chargement CDN items (8324 items)
    market.py  - Requetes marche HDV (SQLite)
    build.py   - Build optimizer enrichi
"""
import sys, os

# S'assurer que tools/ est dans le path
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

from fastapi import FastAPI
from fastapi.middleware.cors import CORSMiddleware
from fastapi.responses import HTMLResponse
import uvicorn

from config import HOST, PORT, CORS_ORIGINS, UI_PATH, check_paths
import auth
import cdn
import market
import build

# ================================================
# App FastAPI
# ================================================
app = FastAPI(title="Wakfu Command Center", version="2.0")

# CORS
app.add_middleware(
    CORSMiddleware,
    allow_origins=CORS_ORIGINS,
    allow_methods=["*"],
    allow_headers=["*"],
    allow_credentials=True,
)

# ================================================
# Enregistrement des modules (ordre important)
# ================================================
auth.register(app)      # Auth middleware + /api/login, /api/health
cdn.register(app)       # /api/cdn, /api/cdn/{id}
market.register(app)    # /api/market, /api/market/stats, /api/market/history
build.register(app)     # /api/build

# ================================================
# Route UI (Command Center HTML)
# ================================================
@app.get("/ui", response_class=HTMLResponse)
def ui():
    if os.path.isfile(UI_PATH):
        with open(UI_PATH, "r", encoding="utf-8-sig") as f:
            return f.read()
    return HTMLResponse("<h1>UI non trouvee</h1><p>Fichier attendu: " + UI_PATH + "</p>", status_code=404)


# ================================================
# Demarrage
# ================================================
if __name__ == "__main__":
    print("=" * 50)
    print("  Wakfu Command Center v2.0")
    print("=" * 50)
    check_paths()
    print()
    print(f"  Serveur: http://{HOST}:{PORT}")
    print(f"  UI:      http://{HOST}:{PORT}/ui")
    print(f"  API:     http://{HOST}:{PORT}/api/health")
    print("=" * 50)
    uvicorn.run(app, host=HOST, port=PORT)
