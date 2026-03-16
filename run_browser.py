"""Lanceur mode navigateur — démarre le serveur Flask et ouvre le navigateur."""
import os
import sys
import time
import threading
import webbrowser
from pathlib import Path

# Add project root to path so src.* imports work
sys.path.insert(0, str(Path(__file__).resolve().parent))

from src.api import run_server

HOST = "127.0.0.1"
PORT = int(os.environ.get("WAKFU_PORT", "5000"))
URL = f"http://{HOST}:{PORT}/"


def _open_browser() -> None:
    """Wait briefly for Flask to start, then open the browser."""
    time.sleep(1.2)
    webbrowser.open(URL)


if __name__ == "__main__":
    threading.Thread(target=_open_browser, daemon=True).start()
    print(f"Wakfu Companion — http://{HOST}:{PORT}/")
    run_server(host=HOST, port=PORT)
