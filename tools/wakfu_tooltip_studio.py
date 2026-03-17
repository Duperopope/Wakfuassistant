from __future__ import annotations

import argparse
import hashlib
import io
import json
import mimetypes
import os
import re
import threading
import urllib.parse
import urllib.request
from http import HTTPStatus
from http.server import BaseHTTPRequestHandler, ThreadingHTTPServer
from pathlib import Path
from typing import Any

from PIL import Image

THEME_BASE_URL = "https://wakfu.cdn.ankama.com/gamedata/theme/"
ROOT = Path(__file__).resolve().parents[1]
THEME_JSON = ROOT / "data" / "ankama_official" / "theme" / "theme.json"
MODEL_OUT = ROOT / "data" / "tooltip_model.json"


def _normalize(value: Any) -> str:
    if value is None:
        return ""
    if isinstance(value, list):
        return " ".join(str(v) for v in value)
    return str(value)


def _walk_refs(obj: Any, out: list[dict[str, Any]]) -> None:
    if isinstance(obj, dict):
        if "id" in obj and "path" in obj:
            out.append(obj)
        for v in obj.values():
            _walk_refs(v, out)
    elif isinstance(obj, list):
        for v in obj:
            _walk_refs(v, out)


def _resolve_theme_url(path: str) -> str:
    clean = path.replace("\\", "/").lstrip("/")
    if clean.lower().startswith("theme/"):
        clean = clean[6:]
    return urllib.parse.urljoin(THEME_BASE_URL, clean)


def _detect_local_theme_dir(wakfu_root: Path | None) -> Path | None:
    if wakfu_root is None or not wakfu_root.exists():
        return None
    themes_dir = wakfu_root / "themes"
    if not themes_dir.exists():
        return None
    candidates = sorted([p for p in themes_dir.iterdir() if p.is_dir() and p.name.startswith("theme_")])
    for c in candidates:
        if (c / "theme").exists():
            return c
    return None


def _resolve_local_theme_asset(local_theme_dir: Path | None, theme_path: str) -> Path | None:
    if local_theme_dir is None:
        return None
    clean = theme_path.replace("\\", "/").lstrip("/")
    if clean.lower().startswith("theme/"):
        clean = clean[6:]

    direct = local_theme_dir / "theme" / clean
    if direct.exists() and direct.is_file():
        return direct

    if Path(clean).suffix.lower() == ".tga":
        png_candidate = local_theme_dir / "theme" / Path(clean).with_suffix(".png")
        if png_candidate.exists() and png_candidate.is_file():
            return png_candidate
    return None


def _resolve_blocked_texture_fallback(local_theme_dir: Path | None, asset_id: str, theme_path: str) -> Path | None:
    """Map blocked Tooltip-Borders-* texture references to available local rarity border images."""
    if local_theme_dir is None:
        return None

    key = f"{asset_id} {theme_path}".lower()
    rarity_map = {
        "legendary": "legendary.png",
        "rare": "rare.png",
        "epic": "epic.png",
        "mythic": "mythic.png",
        "relic": "relic.png",
        "old": "old.png",
        "memory": "souvenir.png",
        "souvenir": "souvenir.png",
        "common": "common.png",
    }

    matched = ""
    for token, fname in rarity_map.items():
        if token in key:
            matched = fname
            break

    if not matched:
        return None

    candidate = local_theme_dir / "theme" / "images" / "itemsRarityBorders" / matched
    if candidate.exists() and candidate.is_file():
        return candidate
    return None


def _asset_kind(path: str) -> str:
    p = path.lower()
    if "tooltip" in p:
        return "tooltip"
    if "rarity" in p:
        return "rarity"
    if "picto" in p:
        return "picto"
    if "item" in p:
        return "item"
    return "other"


def _collect_local_image_assets() -> list[dict[str, Any]]:
    roots: list[tuple[Path, str]] = [
        (ROOT / "data" / "ankama_official" / "wakassets", "github-local"),
        (ROOT / "docs" / "_generated" / "tooltip_assets", "generated"),
        (ROOT / "data" / "ankama_cdn" / "item_icons", "cdn-local"),
        (ROOT / "data" / "ankama_cdn" / "class_icons", "cdn-local"),
    ]
    exts = {".png", ".jpg", ".jpeg", ".webp", ".bmp", ".gif", ".tga"}
    out: list[dict[str, Any]] = []
    seen: set[str] = set()

    for base, kind in roots:
        if not base.exists():
            continue
        for p in base.rglob("*"):
            if not p.is_file() or p.suffix.lower() not in exts:
                continue
            key = str(p).lower()
            if key in seen:
                continue
            seen.add(key)
            rel = p.relative_to(ROOT).as_posix()
            out.append(
                {
                    "id": p.stem,
                    "path": rel,
                    "usage": kind,
                    "kind": kind,
                    "ext": p.suffix.lower(),
                    "themeUrl": "",
                    "availableLocal": True,
                    "localPath": str(p),
                }
            )
    return out


def build_assets_manifest(local_theme_dir: Path | None) -> list[dict[str, Any]]:
    if not THEME_JSON.exists():
        raise FileNotFoundError(f"Theme file not found: {THEME_JSON}")

    theme_data = json.loads(THEME_JSON.read_text(encoding="utf-8"))
    refs: list[dict[str, Any]] = []
    _walk_refs(theme_data, refs)

    out: list[dict[str, Any]] = []
    seen: set[tuple[str, str]] = set()

    for ref in refs:
        rid = _normalize(ref.get("id"))
        rpath = _normalize(ref.get("path"))
        if not rpath:
            continue
        key = (rid, rpath)
        if key in seen:
            continue
        seen.add(key)

        local = _resolve_local_theme_asset(local_theme_dir, rpath)
        out.append(
            {
                "id": rid,
                "path": rpath,
                "usage": _normalize(ref.get("usage")),
                "kind": _asset_kind(f"{rid} {rpath}"),
                "ext": Path(rpath).suffix.lower(),
                "themeUrl": _resolve_theme_url(rpath),
                "availableLocal": bool(local),
                "localPath": str(local) if local else "",
            }
        )

    out.extend(_collect_local_image_assets())
    out.sort(key=lambda x: (x["kind"], x["id"], x["path"]))
    return out


def _to_import_asset_rows(payload: Any) -> list[dict[str, Any]]:
    rows: list[dict[str, Any]] = []
    src = payload
    if isinstance(payload, dict):
        src = payload.get("assets", [])
    if not isinstance(src, list):
        return rows

    for i, item in enumerate(src):
        if isinstance(item, str):
            url = item.strip()
            if not url:
                continue
            rid = Path(urllib.parse.urlparse(url).path).name or f"github_asset_{i}"
            rows.append(
                {
                    "id": rid,
                    "path": url,
                    "usage": "github-import",
                    "kind": "github",
                    "ext": Path(url).suffix.lower(),
                    "themeUrl": url,
                    "availableLocal": False,
                    "localPath": "",
                }
            )
            continue

        if not isinstance(item, dict):
            continue

        url = str(item.get("url") or item.get("raw") or item.get("themeUrl") or "").strip()
        if not url:
            continue
        rid = str(item.get("id") or Path(urllib.parse.urlparse(url).path).name or f"github_asset_{i}")
        kind = str(item.get("kind") or "github")
        path = str(item.get("path") or url)
        usage = str(item.get("usage") or "github-import")
        rows.append(
            {
                "id": rid,
                "path": path,
                "usage": usage,
                "kind": kind,
                "ext": Path(url).suffix.lower(),
                "themeUrl": url,
                "availableLocal": False,
                "localPath": "",
            }
        )

    return rows


def _image_payload_for_browser(path: Path, payload: bytes) -> tuple[bytes, str]:
    ext = path.suffix.lower()
    if ext == ".tga":
        try:
            img = Image.open(io.BytesIO(payload))
            out = io.BytesIO()
            img.save(out, format="PNG")
            return out.getvalue(), "image/png"
        except Exception:
            return payload, "application/octet-stream"

    ctype, _ = mimetypes.guess_type(path.name)
    return payload, (ctype or "application/octet-stream")


def _cache_remote_assets(assets: list[dict[str, Any]]) -> tuple[int, int]:
    cache_dir = ROOT / "data" / "asset_cache"
    cache_dir.mkdir(parents=True, exist_ok=True)

    done = 0
    failed = 0
    for row in assets:
        if row.get("availableLocal"):
            continue
        url = str(row.get("themeUrl") or "").strip()
        if not url.lower().startswith(("http://", "https://")):
            continue

        try:
            req = urllib.request.Request(url, headers={"User-Agent": "WakfuAssistant/1.0"})
            with urllib.request.urlopen(req, timeout=30) as resp:
                raw = resp.read()

            ext = Path(urllib.parse.urlparse(url).path).suffix.lower() or ".bin"
            digest = hashlib.sha1(url.encode("utf-8")).hexdigest()[:16]
            if ext == ".tga":
                payload, _ctype = _image_payload_for_browser(Path("x.tga"), raw)
                out = cache_dir / f"{digest}.png"
            else:
                payload = raw
                out = cache_dir / f"{digest}{ext}"

            out.write_bytes(payload)
            row["localPath"] = str(out)
            row["availableLocal"] = True
            done += 1
        except Exception:
            failed += 1

    return done, failed


HTML_TEMPLATE = r"""
<!doctype html>
<html lang="fr">
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Wakfu Tooltip Studio</title>
<style>
:root { --bg:#121418; --panel:#1b1f25; --line:#303946; --text:#f4f7fb; --muted:#93a0b5; --accent:#7cd8ff; }
* { box-sizing:border-box; }
body { margin:0; font-family:Segoe UI, Arial, sans-serif; background:radial-gradient(circle at 20% 10%, #2b3444 0%, #121418 55%); color:var(--text); }
header { padding:12px 16px; border-bottom:1px solid var(--line); background:rgba(18,20,24,.9); position:sticky; top:0; }
main { display:grid; grid-template-columns:360px 1fr; min-height:calc(100vh - 57px); }
aside { border-right:1px solid var(--line); background:rgba(27,31,37,.95); padding:12px; overflow:auto; }
section { padding:14px; }
input,select,button,textarea { background:#101419; color:var(--text); border:1px solid #334255; border-radius:8px; padding:8px; }
button { cursor:pointer; }
.row { display:flex; gap:8px; align-items:center; margin-bottom:8px; }
.list { max-height:58vh; overflow:auto; border:1px solid var(--line); border-radius:10px; padding:6px; }
.asset-grid { display:grid; grid-template-columns:repeat(auto-fill, minmax(62px, 1fr)); gap:6px; }
.asset { border:1px solid #2a3645; border-radius:8px; cursor:pointer; background:#1a2028; height:62px; position:relative; overflow:hidden; }
.asset:hover { border-color:#4d6b8e; }
.asset.active { border-color:#7cd8ff; box-shadow:0 0 0 1px rgba(124,216,255,.25) inset; }
.asset img { width:100%; height:100%; object-fit:contain; display:block; background:#10161d; }
.asset.bad { border-color:#8b3f4b; }
.small { font-size:12px; color:var(--muted); }
.preview { border:1px solid var(--line); border-radius:10px; padding:10px; min-height:180px; margin-bottom:12px; }
.preview img { max-width:100%; max-height:280px; display:block; }
.mock-stage { border:1px dashed #3d4c60; border-radius:10px; padding:10px; margin-top:6px; width:fit-content; }
.tooltip { width:340px; height:320px; border-radius:10px; border:2px solid #7f8796; background:rgba(50,53,61,.97); position:relative; overflow:visible; }
.layer { position:absolute; overflow:hidden; min-width:8px; min-height:8px; cursor:default; border:1px dashed transparent; }
.layer.active { border-color:var(--accent); background:rgba(124,216,255,.06); }
.drag-handle { position:absolute; top:-16px; left:0; width:86px; height:14px; background:rgba(19,24,30,.95); border:1px solid #46617c; border-radius:4px; cursor:move; font-size:10px; color:#a8bfd8; padding-left:4px; line-height:12px; user-select:none; z-index:5; }
.layer-body { position:absolute; top:0; left:0; right:0; bottom:0; display:flex; align-items:center; justify-content:center; transform-origin:center center; }
.resize-handle { position:absolute; width:10px; height:10px; background:#7cd8ff; border:1px solid #11202e; border-radius:2px; opacity:0; z-index:6; }
.layer.active .resize-handle { opacity:1; }
.resize-handle[data-dir="n"] { top:-5px; left:calc(50% - 5px); cursor:n-resize; }
.resize-handle[data-dir="s"] { bottom:-5px; left:calc(50% - 5px); cursor:s-resize; }
.resize-handle[data-dir="e"] { right:-5px; top:calc(50% - 5px); cursor:e-resize; }
.resize-handle[data-dir="w"] { left:-5px; top:calc(50% - 5px); cursor:w-resize; }
.resize-handle[data-dir="ne"] { right:-5px; top:-5px; cursor:ne-resize; }
.resize-handle[data-dir="nw"] { left:-5px; top:-5px; cursor:nw-resize; }
.resize-handle[data-dir="se"] { right:-5px; bottom:-5px; cursor:se-resize; }
.resize-handle[data-dir="sw"] { left:-5px; bottom:-5px; cursor:sw-resize; }
.badge { display:inline-block; background:#a8acb3; border:1px solid #a8acb3; padding:2px 8px; border-radius:3px; font-size:11px; font-weight:700; }
.tip-icon-wrap { width:126px; height:126px; border-radius:8px; background:rgba(25,28,33,.9); display:flex; align-items:center; justify-content:center; overflow:hidden; border:1px solid rgba(125,129,138,.65); background-size:cover; }
.tip-icon-wrap img { width:120px; height:120px; object-fit:contain; }
.tip-title { text-align:center; font-size:16px; font-weight:700; font-family:'Times New Roman', serif; }
.tip-meta, .tip-price, .tip-desc { text-align:center; color:#c2c7cf; font-size:12px; }
.tip-sep { border-top:1px solid #5f6876; margin:8px 0; }
.grid2 { display:grid; grid-template-columns:repeat(2,minmax(120px,1fr)); gap:8px; }
textarea { width:100%; min-height:140px; }
</style>
</head>
<body>
<header>
  <div><strong>Wakfu Tooltip Studio</strong> - Choisis les assets et regle le design, puis exporte le modele.</div>
</header>
<main>
  <aside>
    <div class="row"><input id="q" placeholder="recherche id/path" style="flex:1" /></div>
    <div class="row">
    <select id="kind"><option value="all">all kinds</option><option>tooltip</option><option>rarity</option><option>picto</option><option>item</option><option>github</option><option>github-local</option><option>generated</option><option>cdn-local</option><option>other</option></select>
      <label class="small"><input type="checkbox" id="localOnly" /> local only</label>
    </div>
        <div class="row">
            <input id="githubUrl" placeholder="URL manifest GitHub (raw json)" style="flex:1" />
            <button id="importGithubBtn">Importer</button>
        </div>
    <div class="row">
      <button id="downloadAllBtn" style="width:100%;">Tout telecharger en local (cache)</button>
    </div>
    <div class="small" id="count"></div>
        <div class="row">
            <button id="addAssetLayerBtn" type="button" style="width:100%;">Ajouter asset comme element</button>
        </div>
    <div id="assets" class="list"></div>
  </aside>
  <section>
    <div class="preview">
      <div class="small" id="meta"></div>
      <img id="assetImg" alt="asset preview" />
            <div class="row" style="margin-top:8px;">
                <button id="useAsTooltipBg" type="button">Asset -> fond tooltip</button>
                <button id="useAsIconBg" type="button">Asset -> fond cadre icone</button>
                <button id="clearTooltipBg" type="button">Retirer texture fond</button>
            </div>
    </div>

    <div class="grid2">
      <label>Tooltip border color <input id="borderColor" type="color" value="#7f8796" /></label>
      <label>Tooltip background <input id="bgColor" type="color" value="#32353d" /></label>
      <label>Badge color <input id="badgeColor" type="color" value="#a8acb3" /></label>
      <label>Title color <input id="titleColor" type="color" value="#f1f1f2" /></label>
      <label>Border width <input id="borderWidth" type="range" min="1" max="6" value="2" /></label>
      <label>Radius <input id="radius" type="range" min="0" max="20" value="7" /></label>
      <label>Icon size <input id="iconSize" type="range" min="64" max="140" value="120" /></label>
      <label>Font size title <input id="titleSize" type="range" min="11" max="24" value="15" /></label>
            <label>Canvas width <input id="canvasWidth" type="range" min="240" max="520" value="340" /></label>
            <label>Canvas height <input id="canvasHeight" type="range" min="220" max="560" value="320" /></label>
            <label>Fond alpha % <input id="bgAlpha" type="range" min="0" max="100" value="97" /></label>
            <label>Texture alpha % <input id="bgTextureAlpha" type="range" min="0" max="100" value="100" /></label>
    </div>

    <h3>Mockup live</h3>
        <div class="small">Maintiens Alt + clic gauche pour deplacer. Resize ultra libre via les 8 poignées (bords + coins). Recadre avec zoom/offset sur le bloc actif.</div>
        <div class="grid2" style="margin:8px 0 4px 0;">
            <label>Bloc actif <input id="activeLayerName" type="text" readonly /></label>
            <label><input id="layerVisible" type="checkbox" checked /> Visible</label>
            <label>Opacity bloc % <input id="layerOpacity" type="range" min="0" max="100" value="100" /></label>
            <label>Align X <select id="layerAlignX"><option value="left">left</option><option value="center" selected>center</option><option value="right">right</option></select></label>
            <label>Align Y <select id="layerAlignY"><option value="top">top</option><option value="center" selected>center</option><option value="bottom">bottom</option></select></label>
            <label>Image fit <select id="layerFit"><option value="contain" selected>contain</option><option value="cover">cover</option><option value="fill">fill</option><option value="none">none</option></select></label>
            <label>Epaisseur bordure <input id="layerBorderWidth" type="range" min="0" max="20" value="0" /></label>
            <label>Rayon bordure <input id="layerBorderRadius" type="range" min="0" max="80" value="0" /></label>
            <label>Couleur bordure <input id="layerBorderColor" type="color" value="#7cd8ff" /></label>
            <label>Zoom contenu % <input id="layerZoom" type="range" min="20" max="400" value="100" /></label>
            <label>Offset X <input id="layerOffsetX" type="range" min="-300" max="300" value="0" /></label>
            <label>Offset Y <input id="layerOffsetY" type="range" min="-300" max="300" value="0" /></label>
            <label><button id="resetLayerCrop" type="button">Reset crop bloc</button></label>
            <label><button id="removeLayerBtn" type="button">Supprimer bloc actif</button></label>
        </div>
        <div class="mock-stage">
            <div id="mock" class="tooltip">
                <div id="layerBadge" class="layer" data-layer="badge" style="left:8px;top:8px;width:120px;height:34px;" title="Alt + drag">
                    <div class="drag-handle">badge</div>
                    <div class="layer-body"><span id="badge" class="badge">Commun</span></div>
                </div>

                <div id="layerIcon" class="layer" data-layer="icon" style="left:106px;top:46px;width:126px;height:142px;" title="Alt + drag">
                    <div class="drag-handle">icon</div>
                    <div class="layer-body"><div id="iconWrap" class="tip-icon-wrap"><img id="iconImg" src="" /></div></div>
                </div>

                <div id="layerTitle" class="layer" data-layer="title" style="left:32px;top:196px;width:276px;height:34px;" title="Alt + drag">
                    <div class="drag-handle">title</div>
                    <div class="layer-body"><div id="title" class="tip-title">Amulette de test</div></div>
                </div>

                <div id="layerType" class="layer" data-layer="type" style="left:44px;top:232px;width:150px;height:30px;" title="Alt + drag">
                    <div class="drag-handle">type</div>
                    <div class="layer-body"><div class="tip-meta">[Amulette]</div></div>
                </div>

                <div id="layerLevelLabel" class="layer" data-layer="level_label" style="left:198px;top:232px;width:44px;height:30px;" title="Alt + drag">
                    <div class="drag-handle">niv</div>
                    <div class="layer-body"><div class="tip-meta">Niv.</div></div>
                </div>

                <div id="layerLevelValue" class="layer" data-layer="level_value" style="left:244px;top:232px;width:58px;height:30px;" title="Alt + drag">
                    <div class="drag-handle">level</div>
                    <div class="layer-body"><div class="tip-meta">230</div></div>
                </div>

                <div id="layerSep" class="layer" data-layer="sep" style="left:28px;top:264px;width:284px;height:24px;" title="Alt + drag">
                    <div class="drag-handle">sep</div>
                    <div class="layer-body"><div class="tip-sep" style="width:100%;margin:0;"></div></div>
                </div>

                <div id="layerPrice" class="layer" data-layer="price" style="left:44px;top:288px;width:252px;height:30px;" title="Alt + drag">
                    <div class="drag-handle">price</div>
                    <div class="layer-body"><div class="tip-price">Prix moy. : 27 k</div></div>
                </div>

                <div id="layerDesc" class="layer" data-layer="desc" style="left:36px;top:322px;width:268px;height:46px;" title="Alt + drag">
                    <div class="drag-handle">desc</div>
                    <div class="layer-body"><div class="tip-desc">"Description de test"</div></div>
                </div>
            </div>
    </div>

    <div class="row" style="margin-top:12px;">
      <button id="copyJson">Copier JSON</button>
      <button id="saveJson">Sauver dans data/tooltip_model.json</button>
      <button id="loadJson">Recharger modele sauve</button>
    </div>
    <textarea id="jsonBox" spellcheck="false"></textarea>
    <div class="small" id="saveStatus"></div>
  </section>
</main>
<script>
let assets = [];
let selected = null;

const els = {
  q: document.getElementById('q'), kind: document.getElementById('kind'), localOnly: document.getElementById('localOnly'),
  assets: document.getElementById('assets'), count: document.getElementById('count'), assetImg: document.getElementById('assetImg'),
  meta: document.getElementById('meta'), mock: document.getElementById('mock'), badge: document.getElementById('badge'),
  borderColor: document.getElementById('borderColor'), bgColor: document.getElementById('bgColor'), badgeColor: document.getElementById('badgeColor'),
  titleColor: document.getElementById('titleColor'), borderWidth: document.getElementById('borderWidth'), radius: document.getElementById('radius'),
    iconSize: document.getElementById('iconSize'), titleSize: document.getElementById('titleSize'), canvasWidth: document.getElementById('canvasWidth'),
    canvasHeight: document.getElementById('canvasHeight'), bgAlpha: document.getElementById('bgAlpha'), bgTextureAlpha: document.getElementById('bgTextureAlpha'),
    iconWrap: document.getElementById('iconWrap'),
  iconImg: document.getElementById('iconImg'), title: document.getElementById('title'), jsonBox: document.getElementById('jsonBox'),
  saveStatus: document.getElementById('saveStatus'), copyJson: document.getElementById('copyJson'), saveJson: document.getElementById('saveJson'),
    loadJson: document.getElementById('loadJson'),
    downloadAllBtn: document.getElementById('downloadAllBtn'),
        addAssetLayerBtn: document.getElementById('addAssetLayerBtn'),
    githubUrl: document.getElementById('githubUrl'), importGithubBtn: document.getElementById('importGithubBtn'),
    activeLayerName: document.getElementById('activeLayerName'), layerVisible: document.getElementById('layerVisible'),
    layerOpacity: document.getElementById('layerOpacity'), layerAlignX: document.getElementById('layerAlignX'), layerAlignY: document.getElementById('layerAlignY'), layerFit: document.getElementById('layerFit'),
        layerBorderWidth: document.getElementById('layerBorderWidth'), layerBorderRadius: document.getElementById('layerBorderRadius'), layerBorderColor: document.getElementById('layerBorderColor'),
    layerZoom: document.getElementById('layerZoom'), layerOffsetX: document.getElementById('layerOffsetX'),
    layerOffsetY: document.getElementById('layerOffsetY'), resetLayerCrop: document.getElementById('resetLayerCrop'),
        useAsTooltipBg: document.getElementById('useAsTooltipBg'), useAsIconBg: document.getElementById('useAsIconBg'), clearTooltipBg: document.getElementById('clearTooltipBg'),
        removeLayerBtn: document.getElementById('removeLayerBtn')
};

const layerMap = {
    badge: document.getElementById('layerBadge'),
    icon: document.getElementById('layerIcon'),
    title: document.getElementById('layerTitle'),
    type: document.getElementById('layerType'),
    level_label: document.getElementById('layerLevelLabel'),
    level_value: document.getElementById('layerLevelValue'),
    sep: document.getElementById('layerSep'),
    price: document.getElementById('layerPrice'),
    desc: document.getElementById('layerDesc'),
};

let activeLayer = null;
let dragState = null;
let resizeState = null;
const EDGE_BLEED = 80;
let tooltipBgTexture = '';
let iconFrameTexture = '';
let customLayerSeq = 0;

const BASE_LAYERS = ['badge', 'icon', 'title', 'type', 'level_label', 'level_value', 'sep', 'price', 'desc'];

const layerStyle = {};

function currentModel() {
  return {
    borderColor: els.borderColor.value,
    bgColor: els.bgColor.value,
    badgeColor: els.badgeColor.value,
    titleColor: els.titleColor.value,
    borderWidth: Number(els.borderWidth.value),
    radius: Number(els.radius.value),
    iconSize: Number(els.iconSize.value),
    titleSize: Number(els.titleSize.value),
        canvasWidth: Number(els.canvasWidth.value),
        canvasHeight: Number(els.canvasHeight.value),
        bgAlpha: Number(els.bgAlpha.value),
        bgTextureAlpha: Number(els.bgTextureAlpha.value),
        tooltipBgTexture,
        iconFrameTexture,
        customLayers: Object.entries(layerMap)
            .filter(([name]) => !BASE_LAYERS.includes(name))
            .map(([name, el]) => ({
                name,
                assetId: String(el.dataset.assetId || ''),
                assetPath: String(el.dataset.assetPath || ''),
            })),
        layout: captureLayout(),
        layerStyle: captureLayerStyle(),
    selectedAsset: selected ? { id: selected.id, path: selected.path } : null,
  };
}

function applyModel(m) {
  els.borderColor.value = m.borderColor || '#7f8796';
  els.bgColor.value = m.bgColor || '#32353d';
  els.badgeColor.value = m.badgeColor || '#a8acb3';
  els.titleColor.value = m.titleColor || '#f1f1f2';
  els.borderWidth.value = String(m.borderWidth || 2);
  els.radius.value = String(m.radius || 7);
  els.iconSize.value = String(m.iconSize || 120);
  els.titleSize.value = String(m.titleSize || 15);
    els.canvasWidth.value = String(m.canvasWidth || 340);
    els.canvasHeight.value = String(m.canvasHeight || 320);
    els.bgAlpha.value = String(m.bgAlpha || 97);
    els.bgTextureAlpha.value = String(m.bgTextureAlpha || 100);
    tooltipBgTexture = String(m.tooltipBgTexture || '');
    iconFrameTexture = String(m.iconFrameTexture || '');

        // Rebuild custom image layers before applying layout/style.
        for (const [name, el] of Object.entries(layerMap)) {
            if (BASE_LAYERS.includes(name)) continue;
            el.remove();
            delete layerMap[name];
            delete layerStyle[name];
        }
        const custom = Array.isArray(m.customLayers) ? m.customLayers : [];
        for (const row of custom) {
            createAssetLayer(
                {
                    id: String(row.assetId || row.name || `asset_${Date.now()}`),
                    path: String(row.assetPath || ''),
                },
                false,
                String(row.name || '')
            );
        }

    applyLayout(m.layout || {});
    applyLayerStyle(m.layerStyle || {});
  renderMockup();
}

function captureLayout() {
    const out = {};
    for (const [name, el] of Object.entries(layerMap)) {
        out[name] = {
            x: parseInt(el.style.left || '0', 10) || 0,
            y: parseInt(el.style.top || '0', 10) || 0,
            w: parseInt(el.style.width || String(el.offsetWidth), 10) || el.offsetWidth,
            h: parseInt(el.style.height || String(el.offsetHeight), 10) || el.offsetHeight,
        };
    }
    return out;
}

function applyLayout(layout) {
    // Backward-compat: old models had a single "level" block.
    if (layout.level && !layout.level_label && !layout.level_value) {
        const v = layout.level;
        layout.level_label = { x: Number(v.x || 0), y: Number(v.y || 0), w: 44, h: Number(v.h || 30) };
        layout.level_value = { x: Number(v.x || 0) + 46, y: Number(v.y || 0), w: Math.max(8, Number(v.w || 80) - 46), h: Number(v.h || 30) };
    }

    for (const [name, el] of Object.entries(layerMap)) {
        const v = layout[name];
        if (!v) continue;
        if (typeof v.x === 'number') el.style.left = `${v.x}px`;
        if (typeof v.y === 'number') el.style.top = `${v.y}px`;
        if (typeof v.w === 'number') el.style.width = `${Math.max(8, v.w)}px`;
        if (typeof v.h === 'number') el.style.height = `${Math.max(8, v.h)}px`;
    }
}

function defaultStyleForLayer() {
        return {
            visible: true,
            opacity: 100,
            alignX: 'center',
            alignY: 'center',
            fit: 'contain',
            borderWidth: 0,
            borderRadius: 0,
            borderColor: '#7cd8ff',
            zoom: 100,
            ox: 0,
            oy: 0,
        };
}

function createAssetLayer(asset, selectAfter = true, forcedName = '') {
    const name = forcedName || `asset_${++customLayerSeq}`;
    const el = document.createElement('div');
    el.className = 'layer';
    el.dataset.layer = name;
    el.dataset.assetId = String(asset.id || name);
    el.dataset.assetPath = String(asset.path || '');
    el.title = 'Alt + drag';
    el.style.left = '80px';
    el.style.top = '80px';
    el.style.width = '120px';
    el.style.height = '120px';
    const src = `/asset?id=${encodeURIComponent(el.dataset.assetId)}&path=${encodeURIComponent(el.dataset.assetPath)}`;
    el.innerHTML = `
        <div class="drag-handle">${String(asset.id || 'asset').slice(0, 10)}</div>
        <div class="layer-body"><img src="${src}" alt="asset"/></div>
    `;
    els.mock.appendChild(el);
    layerMap[name] = el;
    if (!layerStyle[name]) layerStyle[name] = defaultStyleForLayer();
    bindLayerInteractions(el);
    if (selectAfter) setActiveLayer(el);
    renderMockup();
    return name;
}

function removeActiveLayer() {
    if (!activeLayer) return;
    const name = layerNameFromElement(activeLayer);
    if (!name || BASE_LAYERS.includes(name)) {
        els.saveStatus.textContent = 'Ce bloc de base ne peut pas etre supprime.';
        return;
    }
    activeLayer.remove();
    delete layerMap[name];
    delete layerStyle[name];
    setActiveLayer(layerMap.icon || Object.values(layerMap)[0]);
    renderMockup();
}

function layerNameFromElement(el) {
    for (const [name, node] of Object.entries(layerMap)) {
        if (node === el) return name;
    }
    return '';
}

function ensureLayerStyle(name) {
    if (!layerStyle[name]) layerStyle[name] = defaultStyleForLayer();
    return layerStyle[name];
}

function captureLayerStyle() {
    const out = {};
    for (const name of Object.keys(layerMap)) {
        const s = ensureLayerStyle(name);
        out[name] = {
            visible: !!s.visible,
            opacity: Number(s.opacity || 100),
            alignX: String(s.alignX || 'center'),
            alignY: String(s.alignY || 'center'),
            fit: String(s.fit || 'contain'),
            zoom: Number(s.zoom || 100),
            ox: Number(s.ox || 0),
            oy: Number(s.oy || 0),
        };
    }
    return out;
}

function applyLayerStyle(style) {
    for (const name of Object.keys(layerMap)) {
        const src = style[name] || defaultStyleForLayer();
        layerStyle[name] = {
            visible: src.visible !== false,
            opacity: Number(src.opacity || 100),
            alignX: String(src.alignX || 'center'),
            alignY: String(src.alignY || 'center'),
            fit: String(src.fit || 'contain'),
            zoom: Number(src.zoom || 100),
            ox: Number(src.ox || 0),
            oy: Number(src.oy || 0),
        };
    }
}

function updateLayerStyleControls() {
    if (!activeLayer) return;
    const name = layerNameFromElement(activeLayer);
    const s = ensureLayerStyle(name);
    els.activeLayerName.value = name;
    els.layerVisible.checked = !!s.visible;
    els.layerOpacity.value = String(s.opacity);
    els.layerAlignX.value = s.alignX;
    els.layerAlignY.value = s.alignY;
    els.layerFit.value = s.fit;
    els.layerBorderWidth.value = String(s.borderWidth || 0);
    els.layerBorderRadius.value = String(s.borderRadius || 0);
    els.layerBorderColor.value = String(s.borderColor || '#7cd8ff');
    els.layerZoom.value = String(s.zoom);
    els.layerOffsetX.value = String(s.ox);
    els.layerOffsetY.value = String(s.oy);
}

function applyVisualToLayer(name) {
    const el = layerMap[name];
    if (!el) return;
    const s = ensureLayerStyle(name);
    el.style.display = s.visible ? 'block' : 'none';
    el.style.opacity = `${Math.max(0, Math.min(100, s.opacity)) / 100}`;
    const body = el.querySelector('.layer-body');
    if (body) {
        body.style.borderStyle = 'solid';
        body.style.borderWidth = `${Math.max(0, Number(s.borderWidth || 0))}px`;
        body.style.borderColor = String(s.borderColor || '#7cd8ff');
        body.style.borderRadius = `${Math.max(0, Number(s.borderRadius || 0))}px`;
        body.style.overflow = 'hidden';
        const ax = s.alignX === 'left' ? 'flex-start' : (s.alignX === 'right' ? 'flex-end' : 'center');
        const ay = s.alignY === 'top' ? 'flex-start' : (s.alignY === 'bottom' ? 'flex-end' : 'center');
        body.style.justifyContent = ax;
        body.style.alignItems = ay;
        body.style.transform = `translate(${s.ox}px, ${s.oy}px) scale(${s.zoom / 100})`;
        body.style.transformOrigin = `${s.alignX} ${s.alignY}`;

        const textNode = body.querySelector('.tip-title, .tip-meta, .tip-price, .tip-desc, .badge');
        if (textNode) {
            textNode.style.textAlign = s.alignX;
            textNode.style.width = '100%';
        }

        const imgNode = body.querySelector('img');
        if (imgNode) {
            imgNode.style.objectFit = s.fit;
            imgNode.style.objectPosition = `${50 + s.ox / 4}% ${50 + s.oy / 4}%`;
        }
    }
}

function applyAllLayerStyles() {
    for (const name of Object.keys(layerMap)) applyVisualToLayer(name);
}

function setActiveLayer(el) {
    activeLayer = el;
    for (const n of Object.values(layerMap)) {
        n.classList.toggle('active', n === el);
    }
    updateLayerStyleControls();
}

function clampLayerInside(el) {
    const maxX = (els.mock.clientWidth - el.offsetWidth) + EDGE_BLEED;
    const maxY = (els.mock.clientHeight - el.offsetHeight) + EDGE_BLEED;
    const minX = -EDGE_BLEED;
    const minY = -EDGE_BLEED;
    const x = Math.min(maxX, Math.max(minX, parseInt(el.style.left || '0', 10) || 0));
    const y = Math.min(maxY, Math.max(minY, parseInt(el.style.top || '0', 10) || 0));
    el.style.left = `${x}px`;
    el.style.top = `${y}px`;
}

function setupLayerInteractions() {
    for (const el of Object.values(layerMap)) {
      bindLayerInteractions(el);
    }

    if (window.__wakfuStudioMouseBound) return;
    window.__wakfuStudioMouseBound = true;

    document.addEventListener('mousemove', (ev) => {
        if (resizeState) {
            const dx = ev.clientX - resizeState.startX;
            const dy = ev.clientY - resizeState.startY;
            let x = resizeState.baseX;
            let y = resizeState.baseY;
            let w = resizeState.baseW;
            let h = resizeState.baseH;
            const dir = resizeState.dir;

            if (dir.includes('e')) w = Math.max(8, resizeState.baseW + dx);
            if (dir.includes('s')) h = Math.max(8, resizeState.baseH + dy);
            if (dir.includes('w')) {
                w = Math.max(8, resizeState.baseW - dx);
                x = resizeState.baseX + (resizeState.baseW - w);
            }
            if (dir.includes('n')) {
                h = Math.max(8, resizeState.baseH - dy);
                y = resizeState.baseY + (resizeState.baseH - h);
            }

            resizeState.el.style.left = `${x}px`;
            resizeState.el.style.top = `${y}px`;
            resizeState.el.style.width = `${w}px`;
            resizeState.el.style.height = `${h}px`;
            clampLayerInside(resizeState.el);
            renderMockup();
            return;
        }

        if (!dragState) return;
        const dx = ev.clientX - dragState.startX;
        const dy = ev.clientY - dragState.startY;
        dragState.el.style.left = `${dragState.baseX + dx}px`;
        dragState.el.style.top = `${dragState.baseY + dy}px`;
        clampLayerInside(dragState.el);
        renderMockup();
    });

    document.addEventListener('mouseup', () => {
        dragState = null;
        resizeState = null;
    });

    const ro = new ResizeObserver(() => {
        for (const el of Object.values(layerMap)) {
            clampLayerInside(el);
        }
        renderMockup();
    });
    for (const el of Object.values(layerMap)) {
        ro.observe(el);
    }
}

function bindLayerInteractions(el) {
    if (!el || el.dataset.bound === '1') return;
    el.dataset.bound = '1';
    const dirs = ['n', 's', 'e', 'w', 'ne', 'nw', 'se', 'sw'];
    for (const dir of dirs) {
        const h = document.createElement('div');
        h.className = 'resize-handle';
        h.dataset.dir = dir;
        el.appendChild(h);
    }

    el.addEventListener('mousedown', (ev) => {
        const resizeHandle = ev.target.closest('.resize-handle');
        if (resizeHandle && ev.button === 0) {
            ev.preventDefault();
            setActiveLayer(el);
            resizeState = {
                el,
                dir: resizeHandle.dataset.dir,
                startX: ev.clientX,
                startY: ev.clientY,
                baseX: parseInt(el.style.left || '0', 10) || 0,
                baseY: parseInt(el.style.top || '0', 10) || 0,
                baseW: parseInt(el.style.width || String(el.offsetWidth), 10) || el.offsetWidth,
                baseH: parseInt(el.style.height || String(el.offsetHeight), 10) || el.offsetHeight,
            };
            return;
        }

        if (!ev.altKey || ev.button !== 0) return;
        ev.preventDefault();
        setActiveLayer(el);
        dragState = {
            el,
            startX: ev.clientX,
            startY: ev.clientY,
            baseX: parseInt(el.style.left || '0', 10) || 0,
            baseY: parseInt(el.style.top || '0', 10) || 0,
        };
    });
    el.addEventListener('click', () => setActiveLayer(el));
}

function renderMockup() {
  const m = currentModel();
    els.mock.style.width = m.canvasWidth + 'px';
    els.mock.style.height = m.canvasHeight + 'px';
  els.mock.style.borderColor = m.borderColor;
  els.mock.style.borderWidth = m.borderWidth + 'px';
  els.mock.style.borderRadius = m.radius + 'px';
    const bgA = Math.max(0, Math.min(100, m.bgAlpha)) / 100;
    const texA = Math.max(0, Math.min(100, m.bgTextureAlpha)) / 100;
    els.mock.style.backgroundColor = hexToRgba(m.bgColor, bgA);
    if (m.tooltipBgTexture) {
        els.mock.style.backgroundImage = `linear-gradient(rgba(255,255,255,${texA}), rgba(255,255,255,${texA})), url('${m.tooltipBgTexture}')`;
        els.mock.style.backgroundSize = 'cover';
        els.mock.style.backgroundPosition = 'center';
        els.mock.style.backgroundBlendMode = 'multiply';
    } else {
        els.mock.style.backgroundImage = 'none';
        els.mock.style.backgroundBlendMode = 'normal';
    }
  els.badge.style.background = m.badgeColor;
  els.badge.style.borderColor = m.badgeColor;
  els.title.style.color = m.titleColor;
  els.title.style.fontSize = m.titleSize + 'px';
  els.iconImg.style.width = m.iconSize + 'px';
  els.iconImg.style.height = m.iconSize + 'px';
    if (m.iconFrameTexture) {
        els.iconWrap.style.backgroundImage = `url('${m.iconFrameTexture}')`;
        els.iconWrap.style.backgroundSize = 'cover';
        els.iconWrap.style.backgroundPosition = 'center';
    } else {
        els.iconWrap.style.backgroundImage = 'none';
    }
    applyAllLayerStyles();
  els.jsonBox.value = JSON.stringify(m, null, 2);
}

function hexToRgba(hex, a) {
  const h = hex.replace('#','');
  const n = parseInt(h, 16);
  const r = (n >> 16) & 255, g = (n >> 8) & 255, b = n & 255;
  return `rgba(${r},${g},${b},${a})`;
}

function filterAssets() {
  const q = els.q.value.toLowerCase().trim();
  const kind = els.kind.value;
  const localOnly = els.localOnly.checked;

  const rows = assets.filter(a => {
    if (kind !== 'all' && a.kind !== kind) return false;
    if (localOnly && !a.availableLocal) return false;
    if (!q) return true;
    const hay = `${a.id} ${a.path} ${a.usage}`.toLowerCase();
    return hay.includes(q);
  });

    const grid = document.createElement('div');
    grid.className = 'asset-grid';
  for (const a of rows) {
        const div = document.createElement('button');
        div.type = 'button';
        div.className = 'asset' + (selected && selected.id === a.id && selected.path === a.path ? ' active' : '') + (!a.availableLocal ? ' bad' : '');
        div.title = `${a.id || '(no id)'}\n${a.path}`;
        div.innerHTML = `<img loading="lazy" alt="${a.id || 'asset'}" src="/asset?id=${encodeURIComponent(a.id)}&path=${encodeURIComponent(a.path)}"/>`;
        div.onclick = () => selectAsset(a);
        div.ondblclick = () => createAssetLayer(a, true);
        grid.appendChild(div);
  }
    els.assets.innerHTML = '';
    els.assets.appendChild(grid);
  els.count.textContent = `${rows.length} / ${assets.length} assets`;
}

function selectAsset(a) {
  selected = a;
  els.meta.textContent = `${a.id} | ${a.path} | ${a.availableLocal ? 'local ok' : 'cdn maybe blocked'}`;
  els.assetImg.src = `/asset?id=${encodeURIComponent(a.id)}&path=${encodeURIComponent(a.path)}`;
  els.iconImg.src = els.assetImg.src;
  filterAssets();
  renderMockup();
}

async function loadAssets() {
  const r = await fetch('/api/assets');
  assets = await r.json();
  filterAssets();
  const first = assets.find(a => a.availableLocal) || assets[0];
  if (first) selectAsset(first);
}

async function importGithubAssets() {
    const url = (els.githubUrl.value || '').trim();
    if (!url) {
        els.saveStatus.textContent = 'Renseigne une URL raw JSON de manifest GitHub.';
        return;
    }
    const r = await fetch('/api/import-github', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ url }),
    });
    const txt = await r.text();
    els.saveStatus.textContent = txt;
    if (r.status === 200) {
        await loadAssets();
    }
}

async function downloadAllAssets() {
    els.saveStatus.textContent = 'Telechargement en cours...';
    const r = await fetch('/api/download-all', { method: 'POST' });
    const txt = await r.text();
    els.saveStatus.textContent = txt;
    await loadAssets();
}

async function saveModel() {
  const r = await fetch('/api/save-model', {
    method: 'POST', headers: { 'Content-Type': 'application/json' }, body: els.jsonBox.value
  });
  const txt = await r.text();
  els.saveStatus.textContent = txt;
}

async function loadModel() {
  const r = await fetch('/api/model');
  if (r.status !== 200) {
    els.saveStatus.textContent = 'No saved model yet.';
    return;
  }
  const m = await r.json();
  applyModel(m);
}

for (const k of ['q','kind','localOnly']) { els[k].addEventListener('input', filterAssets); }
for (const k of ['borderColor','bgColor','badgeColor','titleColor','borderWidth','radius','iconSize','titleSize','canvasWidth','canvasHeight','bgAlpha','bgTextureAlpha']) {
  els[k].addEventListener('input', renderMockup);
}
els.copyJson.addEventListener('click', async () => { await navigator.clipboard.writeText(els.jsonBox.value); els.saveStatus.textContent = 'JSON copied.'; });
els.saveJson.addEventListener('click', saveModel);
els.loadJson.addEventListener('click', loadModel);
els.importGithubBtn.addEventListener('click', importGithubAssets);
els.downloadAllBtn.addEventListener('click', downloadAllAssets);
els.addAssetLayerBtn.addEventListener('click', () => {
    if (!selected) {
        els.saveStatus.textContent = 'Selectionne un asset d abord.';
        return;
    }
    createAssetLayer(selected, true);
});
els.removeLayerBtn.addEventListener('click', removeActiveLayer);

for (const k of ['layerVisible', 'layerZoom', 'layerOffsetX', 'layerOffsetY']) {
    els[k].addEventListener('input', () => {
        if (!activeLayer) return;
        const name = layerNameFromElement(activeLayer);
        const s = ensureLayerStyle(name);
        s.visible = els.layerVisible.checked;
        s.opacity = Number(els.layerOpacity.value);
        s.alignX = String(els.layerAlignX.value);
        s.alignY = String(els.layerAlignY.value);
        s.fit = String(els.layerFit.value);
        s.borderWidth = Number(els.layerBorderWidth.value);
        s.borderRadius = Number(els.layerBorderRadius.value);
        s.borderColor = String(els.layerBorderColor.value);
        s.zoom = Number(els.layerZoom.value);
        s.ox = Number(els.layerOffsetX.value);
        s.oy = Number(els.layerOffsetY.value);
        renderMockup();
    });
}

for (const k of ['layerOpacity', 'layerAlignX', 'layerAlignY', 'layerFit', 'layerBorderWidth', 'layerBorderRadius', 'layerBorderColor']) {
    els[k].addEventListener('input', () => {
        if (!activeLayer) return;
        const name = layerNameFromElement(activeLayer);
        const s = ensureLayerStyle(name);
        s.opacity = Number(els.layerOpacity.value);
        s.alignX = String(els.layerAlignX.value);
        s.alignY = String(els.layerAlignY.value);
        s.fit = String(els.layerFit.value);
        s.borderWidth = Number(els.layerBorderWidth.value);
        s.borderRadius = Number(els.layerBorderRadius.value);
        s.borderColor = String(els.layerBorderColor.value);
        renderMockup();
    });
}

els.useAsTooltipBg.addEventListener('click', () => {
    if (!selected) return;
    tooltipBgTexture = `/asset?id=${encodeURIComponent(selected.id)}&path=${encodeURIComponent(selected.path)}`;
    renderMockup();
});

els.useAsIconBg.addEventListener('click', () => {
    if (!selected) return;
    iconFrameTexture = `/asset?id=${encodeURIComponent(selected.id)}&path=${encodeURIComponent(selected.path)}`;
    renderMockup();
});

els.clearTooltipBg.addEventListener('click', () => {
    tooltipBgTexture = '';
    renderMockup();
});

els.resetLayerCrop.addEventListener('click', () => {
    if (!activeLayer) return;
    const name = layerNameFromElement(activeLayer);
    layerStyle[name] = defaultStyleForLayer();
    updateLayerStyleControls();
    renderMockup();
});

setupLayerInteractions();
setActiveLayer(layerMap.icon);
loadAssets().then(renderMockup);
</script>
</body>
</html>
"""


def make_handler(assets: list[dict[str, Any]], local_theme_dir: Path | None):
    class Handler(BaseHTTPRequestHandler):
        def _send(self, code: int, data: bytes, content_type: str = "text/plain; charset=utf-8") -> None:
            self.send_response(code)
            self.send_header("Content-Type", content_type)
            self.send_header("Content-Length", str(len(data)))
            self.end_headers()
            self.wfile.write(data)

        def do_GET(self):  # noqa: N802
            parsed = urllib.parse.urlparse(self.path)
            path = parsed.path
            qs = urllib.parse.parse_qs(parsed.query)

            if path == "/":
                self._send(HTTPStatus.OK, HTML_TEMPLATE.encode("utf-8"), "text/html; charset=utf-8")
                return

            if path == "/api/assets":
                payload = json.dumps(assets, ensure_ascii=False).encode("utf-8")
                self._send(HTTPStatus.OK, payload, "application/json; charset=utf-8")
                return

            if path == "/api/model":
                if MODEL_OUT.exists():
                    payload = MODEL_OUT.read_bytes()
                    self._send(HTTPStatus.OK, payload, "application/json; charset=utf-8")
                else:
                    self._send(HTTPStatus.NOT_FOUND, b"model not found")
                return

            if path == "/asset":
                rid = (qs.get("id") or [""])[0]
                rpath = (qs.get("path") or [""])[0]
                candidate = None
                for a in assets:
                    if a["id"] == rid and a["path"] == rpath:
                        candidate = a
                        break
                if candidate is None:
                    self._send(HTTPStatus.NOT_FOUND, b"unknown asset")
                    return

                direct_local = Path(str(candidate.get("localPath") or ""))
                if direct_local.exists() and direct_local.is_file():
                    raw = direct_local.read_bytes()
                    payload, ctype = _image_payload_for_browser(direct_local, raw)
                    self._send(HTTPStatus.OK, payload, ctype)
                    return

                local = _resolve_local_theme_asset(local_theme_dir, candidate["path"])
                if local and local.exists():
                    raw = local.read_bytes()
                    payload, ctype = _image_payload_for_browser(local, raw)
                    self._send(HTTPStatus.OK, payload, ctype)
                    return

                # Fallback: try CDN directly (can fail with 403)
                url = candidate["themeUrl"]
                try:
                    req = urllib.request.Request(url, headers={"User-Agent": "WakfuAssistant/1.0"})
                    with urllib.request.urlopen(req, timeout=20) as resp:
                        raw = resp.read()
                    ref_path = Path(str(candidate.get("path") or candidate.get("themeUrl") or "asset.bin"))
                    payload, ctype = _image_payload_for_browser(ref_path, raw)
                    self._send(HTTPStatus.OK, payload, ctype)
                except Exception as exc:  # pragma: no cover
                    fallback = _resolve_blocked_texture_fallback(
                        local_theme_dir,
                        str(candidate.get("id") or ""),
                        str(candidate.get("path") or ""),
                    )
                    if fallback is not None:
                        raw = fallback.read_bytes()
                        payload, ctype = _image_payload_for_browser(fallback, raw)
                        self._send(HTTPStatus.OK, payload, ctype)
                        return
                    self._send(HTTPStatus.BAD_GATEWAY, str(exc).encode("utf-8"))
                return

            self._send(HTTPStatus.NOT_FOUND, b"not found")

        def do_POST(self):  # noqa: N802
            if self.path == "/api/download-all":
                try:
                    done, failed = _cache_remote_assets(assets)
                    self._send(HTTPStatus.OK, f"Telechargement termine: {done} ok, {failed} en erreur".encode("utf-8"))
                except Exception as exc:
                    self._send(HTTPStatus.BAD_REQUEST, f"download error: {exc}".encode("utf-8"))
                return

            if self.path == "/api/import-github":
                try:
                    length = int(self.headers.get("Content-Length") or "0")
                except ValueError:
                    length = 0
                data = self.rfile.read(length)
                try:
                    body = json.loads(data.decode("utf-8"))
                    url = str(body.get("url") or "").strip()
                    if not url:
                        self._send(HTTPStatus.BAD_REQUEST, b"missing url")
                        return

                    req = urllib.request.Request(url, headers={"User-Agent": "WakfuAssistant/1.0"})
                    with urllib.request.urlopen(req, timeout=30) as resp:
                        payload = json.loads(resp.read().decode("utf-8"))

                    imported = _to_import_asset_rows(payload)
                    before = len(assets)
                    seen = {(a.get("id", ""), a.get("path", ""), a.get("themeUrl", "")) for a in assets}
                    for row in imported:
                        key = (row.get("id", ""), row.get("path", ""), row.get("themeUrl", ""))
                        if key in seen:
                            continue
                        seen.add(key)
                        assets.append(row)

                    assets.sort(key=lambda x: (x.get("kind", ""), x.get("id", ""), x.get("path", "")))
                    added = len(assets) - before
                    self._send(HTTPStatus.OK, f"Import GitHub OK: +{added} assets".encode("utf-8"))
                except Exception as exc:
                    self._send(HTTPStatus.BAD_REQUEST, f"import error: {exc}".encode("utf-8"))
                return

            if self.path != "/api/save-model":
                self._send(HTTPStatus.NOT_FOUND, b"not found")
                return

            try:
                length = int(self.headers.get("Content-Length") or "0")
            except ValueError:
                length = 0
            data = self.rfile.read(length)
            try:
                model = json.loads(data.decode("utf-8"))
            except Exception as exc:
                self._send(HTTPStatus.BAD_REQUEST, f"invalid json: {exc}".encode("utf-8"))
                return

            MODEL_OUT.parent.mkdir(parents=True, exist_ok=True)
            MODEL_OUT.write_text(json.dumps(model, ensure_ascii=False, indent=2), encoding="utf-8")
            self._send(HTTPStatus.OK, f"saved: {MODEL_OUT}".encode("utf-8"))

        def log_message(self, fmt: str, *args):  # noqa: A003
            return

    return Handler


def open_in_browser(port: int) -> None:
    import webbrowser

    webbrowser.open(f"http://127.0.0.1:{port}")


def main() -> None:
    parser = argparse.ArgumentParser(description="Interactive Wakfu tooltip studio")
    parser.add_argument("--wakfu-root", default=r"H:/Games/Wakfu", help="Path to Wakfu install root")
    parser.add_argument("--port", type=int, default=8765)
    parser.add_argument("--no-browser", action="store_true")
    args = parser.parse_args()

    wakfu_root = Path(args.wakfu_root)
    local_theme_dir = _detect_local_theme_dir(wakfu_root)
    assets = build_assets_manifest(local_theme_dir)

    handler = make_handler(assets, local_theme_dir)
    server = ThreadingHTTPServer(("127.0.0.1", args.port), handler)

    print(f"Wakfu Tooltip Studio: http://127.0.0.1:{args.port}")
    print(f"Assets loaded: {len(assets)}")
    print(f"Local theme: {local_theme_dir if local_theme_dir else 'not found'}")

    if not args.no_browser:
        threading.Timer(0.4, open_in_browser, args=(args.port,)).start()

    try:
        server.serve_forever()
    except KeyboardInterrupt:
        pass
    finally:
        server.server_close()


if __name__ == "__main__":
    main()
