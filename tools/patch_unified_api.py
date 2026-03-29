"""
Wakfu Command Center - Routes unifiees
Build + CDN + Market endpoints pour weights_api.py
"""
import json, os, sqlite3, re
from fastapi import Query
from fastapi.responses import HTMLResponse, JSONResponse

# === Chemins ===
TOOLS_DIR = os.path.dirname(os.path.abspath(__file__))
ROOT_DIR = os.path.dirname(TOOLS_DIR)
CDN_PATH = os.path.join(ROOT_DIR, 'docs', 'RND', 'data', 'cdn_items_full.json')
BUILD_PATH = os.path.join(ROOT_DIR, 'build-generator', 'data', 'build-result.json')
DB_PATH = os.path.join(ROOT_DIR, 'logs', 'hdv_market.db')
UI_PATH = os.path.join(TOOLS_DIR, 'command_center.html')

# === Chargement CDN (liste -> dict indexe par id) ===
_cdn_by_id = {}
_cdn_list = []

RARITY_MAP = {0: ('Commun', '#c0c0c0'), 1: ('Inhabituel', '#ffffff'), 2: ('Rare', '#00cc44'), 3: ('Mythique', '#ff8c19'), 4: ('Legendaire', '#ffee00'), 5: ('Relique', '#ff55ff'), 6: ('Souvenir', '#6cf'), 7: ('Epique', '#ff6600')}
TYPE_MAP = {101:'Hache',103:'Anneau',108:'Baguette',110:'Epee',111:'Pelle',112:'Dague',113:'Baton',114:'Marteau',115:'Aiguille',117:'Arc',119:'Bouclier',120:'Amulette',132:'Bottes',133:'Ceinture',134:'Casque',136:'Plastron',138:'Cape',189:'Epaulettes',218:'Arme 2 Mains',219:'Arme 2 Main',223:'Torche',253:'Poing',254:'Cartes',480:'Embleme',520:'Familier',537:'Monture',812:'Sublimation'}

def _load_cdn():
    global _cdn_by_id, _cdn_list
    if _cdn_by_id:
        return
    print(f'[CDN] Chargement {CDN_PATH}')
    with open(CDN_PATH, 'r', encoding='utf-8') as f:
        raw = json.load(f)
    
    for entry in raw:
        if not isinstance(entry, dict):
            continue
        defn = entry.get('definition', {})
        item = defn.get('item', {}) if isinstance(defn, dict) else {}
        bp = item.get('baseParameters', {}) if isinstance(item, dict) else {}
        gp = item.get('graphicParameters', {}) if isinstance(item, dict) else {}
        title = entry.get('title', {})
        desc = entry.get('description', {})
        
        item_id = item.get('id')
        if item_id is None:
            continue
        
        type_id = bp.get('itemTypeId', 0)
        rarity = bp.get('rarity', 0)
        gfx_id = gp.get('gfxId', 0)
        rarity_name, rarity_color = RARITY_MAP.get(rarity, ('?', '#999'))
        type_name = TYPE_MAP.get(type_id, f'Type#{type_id}')
        
        # Extraire les stats (equipEffects)
        stats = []
        for eff in defn.get('equipEffects', []):
            if isinstance(eff, dict):
                ef = eff.get('effect', {})
                if isinstance(ef, dict):
                    ed = ef.get('definition', {})
                    ep = ef.get('params', [])
                    action_id = ed.get('actionId', 0) if isinstance(ed, dict) else 0
                    value = ep[0] if ep else 0
                    stats.append({'actionId': action_id, 'value': value})
        
        parsed = {
            'id': item_id,
            'level': item.get('level', 0),
            'name_fr': title.get('fr', f'Item#{item_id}') if isinstance(title, dict) else f'Item#{item_id}',
            'name_en': title.get('en', '') if isinstance(title, dict) else '',
            'desc_fr': desc.get('fr', '') if isinstance(desc, dict) else '',
            'typeId': type_id,
            'typeName': type_name,
            'rarity': rarity,
            'rarityName': rarity_name,
            'rarityColor': rarity_color,
            'setId': bp.get('itemSetId', 0),
            'gfxId': gfx_id,
            'iconUrl': f'https://static.ankama.com/wakfu/portal/game/item/115/{gfx_id}.png' if gfx_id else '',
            'stats': stats,
        }
        _cdn_by_id[item_id] = parsed
        _cdn_list.append(parsed)
    
    print(f'[CDN] {len(_cdn_by_id)} items indexes')


def _get_db():
    conn = sqlite3.connect(DB_PATH)
    conn.row_factory = sqlite3.Row
    return conn


def register_unified_routes(app):
    """Enregistre les routes /api/build, /api/cdn, /api/market sur l app FastAPI."""
    _load_cdn()
    
    # ==================== BUILD ====================
    @app.get('/api/build')
    def api_build():
        with open(BUILD_PATH, 'r', encoding='utf-8-sig') as f:
            build = json.load(f)
        
        # Enrichir les items avec les donnees CDN
        for item in build.get('items', []):
            item_id = item.get('id')
            if item_id and item_id in _cdn_by_id:
                cdn_item = _cdn_by_id[item_id]
                if not item.get('gfxId'):
                    item['gfxId'] = cdn_item['gfxId']
                if not item.get('iconUrl'):
                    item['iconUrl'] = cdn_item['iconUrl']
                if not item.get('typeName'):
                    item['typeName'] = cdn_item['typeName']
                if not item.get('rarityName'):
                    item['rarityName'] = cdn_item['rarityName']
                if not item.get('rarityColor'):
                    item['rarityColor'] = cdn_item['rarityColor']
                if not item.get('stats') and cdn_item.get('stats'):
                    item['stats'] = cdn_item['stats']
        
        return build
    
    # ==================== CDN ====================
    @app.get('/api/cdn/{item_id}')
    def api_cdn_by_id(item_id: int):
        if item_id in _cdn_by_id:
            return _cdn_by_id[item_id]
        return JSONResponse({'error': 'Item non trouve'}, status_code=404)
    
    @app.get('/api/cdn')
    def api_cdn_search(q: str = '', limit: int = 20, offset: int = 0, type_id: int = None, rarity: int = None, min_level: int = None, max_level: int = None):
        results = _cdn_list
        if q:
            ql = q.lower()
            results = [i for i in results if ql in i['name_fr'].lower() or ql in i.get('name_en', '').lower()]
        if type_id is not None:
            results = [i for i in results if i['typeId'] == type_id]
        if rarity is not None:
            results = [i for i in results if i['rarity'] == rarity]
        if min_level is not None:
            results = [i for i in results if i['level'] >= min_level]
        if max_level is not None:
            results = [i for i in results if i['level'] <= max_level]
        total = len(results)
        page = results[offset:offset+limit]
        return {'total': total, 'limit': limit, 'offset': offset, 'items': page}
    
    # ==================== MARKET ====================
    @app.get('/api/market')
    def api_market(q: str = '', limit: int = 50, offset: int = 0, side: str = '', min_price: int = None, max_price: int = None, sort: str = 'unit_price', order: str = 'asc'):
        db = _get_db()
        conditions = []
        params = []
        if q:
            # Chercher les item_ids qui matchent dans le CDN
            ql = q.lower()
            matching_ids = [i['id'] for i in _cdn_list if ql in i['name_fr'].lower()]
            if matching_ids:
                placeholders = ','.join('?' * len(matching_ids))
                conditions.append(f'item_ref_id IN ({placeholders})')
                params.extend(matching_ids)
            else:
                return {'total': 0, 'limit': limit, 'offset': offset, 'items': []}
        if side:
            conditions.append('side = ?')
            params.append(side)
        if min_price is not None:
            conditions.append('unit_price >= ?')
            params.append(min_price)
        if max_price is not None:
            conditions.append('unit_price <= ?')
            params.append(max_price)
        
        where = (' WHERE ' + ' AND '.join(conditions)) if conditions else ''
        
        # Allowed sort columns
        allowed_sorts = {'unit_price', 'qty_remaining', 'updated_at', 'expiration_date', 'item_ref_id'}
        sort_col = sort if sort in allowed_sorts else 'unit_price'
        sort_order = 'DESC' if order.lower() == 'desc' else 'ASC'
        
        # Count
        count_row = db.execute(f'SELECT COUNT(*) as c FROM market_latest{where}', params).fetchone()
        total = count_row['c'] if count_row else 0
        
        # Fetch
        rows = db.execute(f'SELECT * FROM market_latest{where} ORDER BY {sort_col} {sort_order} LIMIT ? OFFSET ?', params + [limit, offset]).fetchall()
        
        items = []
        for row in rows:
            r = dict(row)
            item_id = r.get('item_ref_id')
            cdn = _cdn_by_id.get(item_id, {})
            items.append({
                'side': r.get('side', ''),
                'itemId': item_id,
                'name': cdn.get('name_fr', f'Item#{item_id}'),
                'iconUrl': cdn.get('iconUrl', ''),
                'level': cdn.get('level', 0),
                'typeName': cdn.get('typeName', '?'),
                'rarityName': cdn.get('rarityName', '?'),
                'rarityColor': cdn.get('rarityColor', '#999'),
                'actorName': r.get('actor_name', ''),
                'unitPrice': r.get('unit_price', 0),
                'qtyInit': r.get('qty_init', 0),
                'qtyRemaining': r.get('qty_remaining', 0),
                'expirationDate': r.get('expiration_date', ''),
                'updatedAt': r.get('updated_at', ''),
                'slotColors': r.get('slot_colors', ''),
            })
        
        db.close()
        return {'total': total, 'limit': limit, 'offset': offset, 'items': items}
    
    @app.get('/api/market/stats')
    def api_market_stats():
        db = _get_db()
        total = db.execute('SELECT COUNT(*) as c FROM market_latest').fetchone()['c']
        obs = db.execute('SELECT COUNT(*) as c FROM market_observations').fetchone()['c']
        sells = db.execute("SELECT COUNT(*) as c FROM market_latest WHERE side='sell'").fetchone()['c']
        buys = db.execute("SELECT COUNT(*) as c FROM market_latest WHERE side='buy'").fetchone()['c']
        unique = db.execute('SELECT COUNT(DISTINCT item_ref_id) as c FROM market_latest').fetchone()['c']
        latest = db.execute('SELECT MAX(updated_at) as m FROM market_latest').fetchone()['m']
        
        # Top items by offer count
        top_rows = db.execute('SELECT item_ref_id, COUNT(*) as cnt FROM market_latest GROUP BY item_ref_id ORDER BY cnt DESC LIMIT 10').fetchall()
        top = []
        for tr in top_rows:
            item_id = tr['item_ref_id']
            cdn = _cdn_by_id.get(item_id, {})
            top.append({'itemId': item_id, 'name': cdn.get('name_fr', f'Item#{item_id}'), 'count': tr['cnt']})
        
        db.close()
        return {'total_offers': total, 'total_observations': obs, 'sell_offers': sells, 'buy_offers': buys, 'unique_items': unique, 'latest_update': latest, 'top_items': top}
    
    @app.get('/api/market/history/{item_id}')
    def api_market_history(item_id: int, days: int = 30):
        db = _get_db()
        rows = db.execute("SELECT * FROM market_observations WHERE item_ref_id = ? AND source_ts >= datetime('now', ? || ' days') ORDER BY source_ts DESC LIMIT 500", [item_id, f'-{days}']).fetchall()
        cdn = _cdn_by_id.get(item_id, {})
        history = [dict(r) for r in rows]
        db.close()
        return {'itemId': item_id, 'name': cdn.get('name_fr', f'Item#{item_id}'), 'iconUrl': cdn.get('iconUrl', ''), 'count': len(history), 'history': history}
    
    print(f'[UNIFIED] Routes enregistrees: /api/build, /api/cdn, /api/market, /api/market/stats, /api/market/history')


def register_ui_route(app):
    """Route /ui pour le Command Center HTML."""
    @app.get('/ui', response_class=HTMLResponse)
    def command_center_ui():
        with open(UI_PATH, 'r', encoding='utf-8-sig') as f:
            return f.read()
    print(f'[UNIFIED-UI] Route /ui -> {UI_PATH}')
