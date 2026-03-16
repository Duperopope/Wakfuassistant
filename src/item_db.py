"""Item database: loads CDN/local JSON and provides lookup by name."""
import re
import json
import logging
import urllib.request
from pathlib import Path

logger = logging.getLogger("wakfu_companion")


def _normalize_name(text):
    """Local import-free version to avoid circular dependency at module load."""
    import unicodedata
    text = str(text or "").strip().lower()
    if not text:
        return ""
    text = unicodedata.normalize("NFKD", text)
    text = "".join(ch for ch in text if not unicodedata.combining(ch))
    text = re.sub(r"[^a-z0-9]+", " ", text)
    return " ".join(text.split())


class ItemDatabase:
    CDN_CONFIG_URL = "https://wakfu.cdn.ankama.com/gamedata/config.json"
    CDN_BASE_URL = "https://wakfu.cdn.ankama.com/gamedata/{version}"
    ICON_URLS = [
        "https://vertylo.github.io/wakassets/items/{gfx}.png",
        "https://s.ankama.com/www/static.ankama.com/wakfu/portal/game/item/115/{gfx}.png",
        "https://s.ankama.com/www/static.ankama.com/wakfu/portal/game/item/64/{gfx}.png",
    ]

    def __init__(self, items_path, jobs_path=None, resources_path=None, item_types_path=None):
        self.items = {}
        self.by_name = {}
        self.item_types = {}
        self._load_local(items_path, jobs_path, resources_path)
        self._load_item_types(item_types_path)
        self._load_from_cdn_if_possible()
        logger.info(f"ItemDB indexe: {len(self.by_name)} noms normalises")

    def _fetch_json(self, url, timeout=4):
        req = urllib.request.Request(url, headers={"User-Agent": "WakfuAssistant/1.0"})
        with urllib.request.urlopen(req, timeout=timeout) as resp:
            return json.loads(resp.read().decode("utf-8"))

    def _load_local(self, items_path, jobs_path=None, resources_path=None):
        self._load_entries_from_file(Path(items_path), kind="items")
        if jobs_path:
            self._load_entries_from_file(Path(jobs_path), kind="jobs")
        if resources_path:
            self._load_entries_from_file(Path(resources_path), kind="resources")

    def _cleanup_type_title(self, raw):
        txt = str(raw or "").strip()
        if not txt:
            return "Autres"
        txt = re.sub(r"\{[^}]*\}", "", txt)
        txt = re.sub(r"\s+", " ", txt).strip()
        return txt or "Autres"

    def _load_item_types(self, path):
        p = Path(path) if path else None
        if not p or not p.exists():
            return
        try:
            rows = json.loads(p.read_text(encoding="utf-8"))
            for row in rows or []:
                tid = row.get("definition", {}).get("id")
                if tid is None:
                    continue
                label = (
                    row.get("title", {}).get("fr")
                    or row.get("title", {}).get("en")
                    or "Autres"
                )
                self.item_types[int(tid)] = self._cleanup_type_title(label)
            logger.info(f"ItemDB local: itemTypes charges ({len(self.item_types)})")
        except Exception as e:
            logger.warning(f"ItemDB itemTypes {p}: {e}")

    def _load_entries_from_file(self, path, kind):
        if not path or not path.exists():
            return
        try:
            with open(path, "r", encoding="utf-8") as f:
                raw = json.load(f)
            self._index_entries(raw, kind)
            logger.info(f"ItemDB local: {kind} charge depuis {path.name}")
        except Exception as e:
            logger.warning(f"ItemDB local {path}: {e}")

    def _load_from_cdn_if_possible(self):
        try:
            cfg = self._fetch_json(self.CDN_CONFIG_URL)
            version = cfg.get("version", "").strip()
            if not version:
                return
            base = self.CDN_BASE_URL.format(version=version)
            items = self._fetch_json(f"{base}/items.json")
            jobs = self._fetch_json(f"{base}/jobsItems.json")
            resources = self._fetch_json(f"{base}/resources.json")

            # Le CDN dynamique est la source de verite quand disponible.
            self.items = {}
            self.by_name = {}
            self._index_entries(items, kind="items")
            self._index_entries(jobs, kind="jobs")
            self._index_entries(resources, kind="resources")
            logger.info(f"ItemDB CDN: version={version} chargee")
        except Exception as e:
            logger.warning(f"ItemDB CDN indisponible, fallback local: {e}")

    def _index_entries(self, entries, kind):
        for entry in entries or []:
            if kind == "resources":
                self._index_resource(entry)
            else:
                self._index_item_like(entry)

    def _index_item_like(self, entry):
        item_def = entry.get("definition", {}).get("item")
        if not item_def:
            item_def = entry.get("definition", {})
        iid = item_def.get("id")
        if iid:
            self.items[iid] = entry

        for lang in ("fr", "en", "es", "pt"):
            n = entry.get("title", {}).get(lang, "")
            if not n:
                continue
            nk = _normalize_name(n)
            if not nk:
                continue
            prev = self.by_name.get(nk)
            if not prev:
                self.by_name[nk] = entry
                continue
            prev_level = self._entry_level(prev)
            this_level = self._entry_level(entry)
            if this_level >= prev_level:
                self.by_name[nk] = entry

    def _index_resource(self, entry):
        rid = entry.get("definition", {}).get("id")
        if rid:
            self.items[rid] = entry
        for lang in ("fr", "en", "es", "pt"):
            n = entry.get("title", {}).get(lang, "")
            nk = _normalize_name(n)
            if nk:
                self.by_name[nk] = entry

    def _entry_level(self, entry):
        d = entry.get("definition", {})
        if "item" in d:
            return d.get("item", {}).get("level", 0)
        return d.get("level", 0)

    def _entry_gfx_id(self, entry):
        d = entry.get("definition", {})
        if "item" in d:
            return d.get("item", {}).get("graphicParameters", {}).get("gfxId")
        if "graphicParameters" in d:
            return d.get("graphicParameters", {}).get("gfxId")
        return d.get("iconGfxId")

    def _entry_item_type_id(self, entry):
        d = entry.get("definition", {})
        if "item" in d:
            return d.get("item", {}).get("baseParameters", {}).get("itemTypeId")
        return d.get("itemTypeId")

    def find(self, name):
        k = _normalize_name(name)
        if not k:
            return None
        if k in self.by_name:
            return self.by_name[k]
        # Fallback prudent: startswith seulement, jamais "contains" arbitraire.
        starts = [v for key, v in self.by_name.items() if key.startswith(k)]
        if len(starts) == 1:
            return starts[0]
        return None

    def search(self, q, limit=20):
        q = _normalize_name(q)
        return [v for k, v in self.by_name.items() if q and q in k][:limit]

    def get_icon_candidates(self, name):
        item = self.find(name)
        if not item:
            return []
        gfx_id = self._entry_gfx_id(item)
        if not gfx_id or int(gfx_id) < 0:
            return []
        out = []
        for tpl in self.ICON_URLS:
            out.append(tpl.format(gfx=gfx_id))
        return out

    def category_for_name(self, name):
        entry = self.find(name)
        if not entry:
            return "Autres"
        tid = self._entry_item_type_id(entry)
        if tid is None:
            return "Autres"
        return self.item_types.get(int(tid), f"Type {int(tid)}")

    def icon_library(self, query="", limit=120):
        q = _normalize_name(query)
        out = []
        seen = set()
        for key, entry in self.by_name.items():
            if q and q not in key:
                continue
            if key in seen:
                continue
            gfx_id = self._entry_gfx_id(entry)
            if not gfx_id or int(gfx_id) < 0:
                continue
            title = (
                entry.get("title", {}).get("fr")
                or entry.get("title", {}).get("en")
                or key
            )
            out.append(
                {
                    "name": title,
                    "gfx_id": int(gfx_id),
                    "icons": [tpl.format(gfx=gfx_id) for tpl in self.ICON_URLS],
                }
            )
            seen.add(key)
            if len(out) >= int(limit):
                break
        out.sort(key=lambda x: (x.get("name") or "").lower())
        return out
