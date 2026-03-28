"""Wakfu Command Center - Authentification et securite."""
import hashlib, secrets, time
from fastapi import Request, HTTPException
from fastapi.responses import JSONResponse
from config import API_KEY, ADMIN_HASH, TOKEN_EXPIRY

_sessions = {}


def _clean():
    now = time.time()
    for k in [k for k, v in _sessions.items() if now - v["t"] > TOKEN_EXPIRY]:
        del _sessions[k]


def verify(request: Request):
    """Verifie API key ou session token. Leve HTTPException 401 si invalide."""
    path = request.url.path
    # Routes publiques
    if path in ("/", "/ui", "/api/login", "/api/health", "/docs", "/openapi.json"):
        return
    if path.startswith("/icons/"):
        return

    # Bearer token
    auth = request.headers.get("Authorization", "")
    if auth.startswith("Bearer "):
        token = auth[7:]
        if token == API_KEY:
            return
        _clean()
        if token in _sessions:
            return

    # Cookie session
    cookie = request.cookies.get("wcc_session")
    if cookie:
        _clean()
        if cookie in _sessions:
            return

    raise HTTPException(401, "Acces refuse. Utilisez Authorization: Bearer <API_KEY>")


def login(password: str, ip: str = "127.0.0.1"):
    """Verifie le password admin, retourne un session token ou None."""
    if hashlib.sha256(password.encode()).hexdigest() != ADMIN_HASH:
        return None
    token = secrets.token_hex(32)
    _sessions[token] = {"t": time.time(), "ip": ip}
    return token


def register(app):
    """Enregistre les routes auth sur l app FastAPI."""

    # Middleware global
    @app.middleware("http")
    async def auth_middleware(request: Request, call_next):
        try:
            verify(request)
        except HTTPException as e:
            return JSONResponse({"detail": e.detail}, status_code=e.status_code)
        return await call_next(request)

    @app.post("/api/login")
    async def api_login(request: Request):
        try:
            body = await request.json()
        except Exception:
            raise HTTPException(400, "JSON requis: {password: ...}")
        token = login(body.get("password", ""), request.client.host)
        if not token:
            raise HTTPException(401, "Mot de passe incorrect")
        resp = JSONResponse({"token": token, "expires_in": TOKEN_EXPIRY})
        resp.set_cookie("wcc_session", token, max_age=TOKEN_EXPIRY, httponly=True, samesite="strict")
        return resp

    @app.get("/api/health")
    async def health():
        return {"status": "ok", "auth": bool(API_KEY)}

    @app.get("/api/auth/sessions")
    async def sessions(request: Request):
        _clean()
        return [{"prefix": k[:8], "ip": v["ip"], "age_min": int((time.time()-v["t"])/60)} for k, v in _sessions.items()]

    print(f"[AUTH] OK - API Key: {API_KEY[:8]}... | Expiry: {TOKEN_EXPIRY//3600}h")
