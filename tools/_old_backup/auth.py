"""
Wakfu Command Center - Authentification & Securite
Middleware FastAPI pour API key + session admin
"""
import os, hashlib, secrets, time, functools
from fastapi import Request, HTTPException, Depends
from fastapi.responses import JSONResponse

# Charger .env manuellement (pas de dependance dotenv)
def _load_env():
    env_path = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), '.env')
    config = {}
    if os.path.isfile(env_path):
        with open(env_path, 'r', encoding='utf-8') as f:
            for line in f:
                line = line.strip()
                if line and not line.startswith('#') and '=' in line:
                    key, val = line.split('=', 1)
                    config[key.strip()] = val.strip()
    return config

_config = _load_env()
API_KEY = _config.get('API_KEY', '')
ADMIN_HASH = _config.get('ADMIN_PASSWORD_HASH', '')
SESSION_SECRET = _config.get('SESSION_SECRET', secrets.token_hex(16))
TOKEN_EXPIRY = int(_config.get('TOKEN_EXPIRY_HOURS', 24)) * 3600

# Sessions actives: {token: {'created': timestamp, 'ip': str}}
_sessions = {}

def _clean_sessions():
    now = time.time()
    expired = [k for k, v in _sessions.items() if now - v['created'] > TOKEN_EXPIRY]
    for k in expired:
        del _sessions[k]

def verify_api_key(request: Request):
    """Middleware: verifie l API key dans le header Authorization."""
    # Routes publiques (login, UI, health)
    path = request.url.path
    if path in ('/', '/ui', '/api/login', '/api/health', '/docs', '/openapi.json'):
        return True
    if path.startswith('/icons/'):
        return True
    
    auth = request.headers.get('Authorization', '')
    if auth.startswith('Bearer '):
        token = auth[7:]
        # Verifier si c est l API key
        if token == API_KEY:
            return True
        # Verifier si c est un session token
        _clean_sessions()
        if token in _sessions:
            return True
    
    # Verifier cookie de session
    session_token = request.cookies.get('wcc_session')
    if session_token:
        _clean_sessions()
        if session_token in _sessions:
            return True
    
    raise HTTPException(status_code=401, detail='API key requise. Header: Authorization: Bearer <key>')

def login(password: str, client_ip: str = '127.0.0.1'):
    """Verifie le mot de passe admin et retourne un session token."""
    pwd_hash = hashlib.sha256(password.encode()).hexdigest()
    if pwd_hash != ADMIN_HASH:
        return None
    token = secrets.token_hex(32)
    _sessions[token] = {'created': time.time(), 'ip': client_ip}
    return token

def get_sessions_info():
    """Retourne les sessions actives (pour admin)."""
    _clean_sessions()
    return [{'token_prefix': k[:8] + '...', 'ip': v['ip'], 
             'created': v['created'], 'age_minutes': int((time.time() - v['created']) / 60)}
            for k, v in _sessions.items()]

def revoke_session(token_prefix: str):
    """Revoque une session par son prefixe."""
    to_del = [k for k in _sessions if k.startswith(token_prefix)]
    for k in to_del:
        del _sessions[k]
    return len(to_del)

def register_auth_routes(app):
    """Enregistre les routes d authentification."""
    from fastapi.responses import JSONResponse
    
    @app.post('/api/login')
    async def api_login(request: Request):
        try:
            body = await request.json()
        except:
            raise HTTPException(400, 'JSON body requis: {"password": "..."}')
        password = body.get('password', '')
        token = login(password, request.client.host)
        if not token:
            raise HTTPException(401, 'Mot de passe incorrect')
        response = JSONResponse({'token': token, 'expires_in': TOKEN_EXPIRY})
        response.set_cookie('wcc_session', token, max_age=TOKEN_EXPIRY, httponly=True, samesite='strict')
        return response
    
    @app.get('/api/auth/sessions')
    async def api_sessions(request: Request):
        verify_api_key(request)
        return get_sessions_info()
    
    @app.post('/api/auth/revoke')
    async def api_revoke(request: Request):
        verify_api_key(request)
        body = await request.json()
        prefix = body.get('token_prefix', '')
        count = revoke_session(prefix)
        return {'revoked': count}
    
    @app.get('/api/health')
    async def api_health():
        return {'status': 'ok', 'auth': bool(API_KEY), 'timestamp': __import__('time').time()}
    
    print(f'[AUTH] Routes enregistrees: /api/login, /api/health, /api/auth/sessions, /api/auth/revoke')
    print(f'[AUTH] API Key configuree: {bool(API_KEY)} ({API_KEY[:8]}...)')
    print(f'[AUTH] Token expiry: {TOKEN_EXPIRY//3600}h')
