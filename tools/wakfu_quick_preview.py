from __future__ import annotations

import argparse
import io
import json
import re
import urllib.parse
import urllib.request
from datetime import datetime
from pathlib import Path
from typing import Any

from PIL import Image


THEME_BASE_URL = "https://wakfu.cdn.ankama.com/gamedata/theme/"


def _walk_theme(obj: Any, out: list[dict[str, Any]]) -> None:
    if isinstance(obj, dict):
        if "id" in obj and "path" in obj:
            out.append(obj)
        for value in obj.values():
            _walk_theme(value, out)
    elif isinstance(obj, list):
        for value in obj:
            _walk_theme(value, out)


def _normalize_text(value: Any) -> str:
    if value is None:
        return ""
    if isinstance(value, list):
        return " ".join(str(v) for v in value)
    return str(value)


def _collect_tooltip_like_refs(theme_data: Any) -> list[dict[str, str]]:
    refs: list[dict[str, Any]] = []
    _walk_theme(theme_data, refs)

    needles = (
        "tooltip",
        "itemtooltip",
        "itemstaticdescription",
        "itemdetailtemplate",
        "rarityborder",
        "itemrarity",
        "unidentifieditem",
    )

    found: list[dict[str, str]] = []
    seen: set[tuple[str, str]] = set()

    for ref in refs:
        rid = _normalize_text(ref.get("id"))
        rpath = _normalize_text(ref.get("path"))
        usage = _normalize_text(ref.get("usage"))
        hay = f"{rid} {rpath} {usage}".lower()
        if any(n in hay for n in needles):
            key = (rid, rpath)
            if key in seen:
                continue
            seen.add(key)
            found.append({"id": rid, "path": rpath, "usage": usage})

    found.sort(key=lambda x: (x["id"], x["path"]))
    return found


def _resolve_theme_url(path: str) -> str:
    if path.lower().startswith(("http://", "https://")):
        return path
    clean = path.lstrip("/")
    if clean.lower().startswith("theme/"):
        clean = clean[6:]
    return urllib.parse.urljoin(THEME_BASE_URL, clean)


def _safe_name(value: str) -> str:
    return re.sub(r"[^a-zA-Z0-9._-]+", "_", value).strip("_") or "asset"


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

    ext = Path(clean).suffix.lower()
    if ext == ".tga":
        png_candidate = local_theme_dir / "theme" / Path(clean).with_suffix(".png")
        if png_candidate.exists() and png_candidate.is_file():
            return png_candidate

    return None


def _build_tooltip_texture_previews(
    tooltip_refs: list[dict[str, str]],
    output_md: Path,
    limit: int,
    local_theme_dir: Path | None,
) -> list[dict[str, str]]:
    out_dir = output_md.parent / "_generated" / "tooltip_assets"
    out_dir.mkdir(parents=True, exist_ok=True)

    previews: list[dict[str, str]] = []
    for idx, ref in enumerate(tooltip_refs[: max(1, limit)], start=1):
        rid = ref["id"]
        rpath = ref["path"]
        url = _resolve_theme_url(rpath)
        raw_ext = Path(rpath).suffix.lower()

        base = f"{idx:03d}_{_safe_name(rid)}"
        rel_preview = ""
        status = "ok"

        try:
            local_asset = _resolve_local_theme_asset(local_theme_dir, rpath)
            if local_asset is not None:
                payload = local_asset.read_bytes()
                raw_ext = local_asset.suffix.lower()
                status = f"ok (local:{local_asset.name})"
            else:
                req = urllib.request.Request(url, headers={"User-Agent": "WakfuAssistant/1.0"})
                with urllib.request.urlopen(req, timeout=30) as resp:
                    payload = resp.read()

            if raw_ext == ".tga":
                dst = out_dir / f"{base}.png"
                img = Image.open(io.BytesIO(payload))
                img.save(dst, format="PNG")
            else:
                ext = raw_ext if raw_ext else ".bin"
                dst = out_dir / f"{base}{ext}"
                dst.write_bytes(payload)

            rel_preview = dst.relative_to(output_md.parent).as_posix()
        except Exception as exc:
            status = f"error: {exc}"

        previews.append(
            {
                "id": rid,
                "path": rpath,
                "url": url,
                "preview": rel_preview,
                "status": status,
            }
        )

    return previews


def _collect_item_icons(items_dir: Path, limit: int) -> list[str]:
    icons = [p.name for p in sorted(items_dir.glob("*.png")) if p.is_file()]
    return icons[:limit]


def _collect_rarity_colors(theme_data: Any) -> dict[str, tuple[int, int, int, int]]:
    rarity_keys = (
        "common",
        "rare",
        "epic",
        "legendary",
        "mythic",
        "relic",
        "souvenir",
        "old",
        "admin",
    )
    out: dict[str, tuple[int, int, int, int]] = {}

    colors = theme_data.get("colors", []) if isinstance(theme_data, dict) else []
    for row in colors:
        if not isinstance(row, dict):
            continue
        cid = str(row.get("id", "")).lower()
        rgba = (
            int(row.get("red", 255)),
            int(row.get("green", 255)),
            int(row.get("blue", 255)),
            int(row.get("alpha", 100)),
        )

        if cid == "tooltipbackgroundcolor":
            out["tooltip_bg"] = rgba
        if cid == "tooltipbordercolor":
            out["tooltip_border"] = rgba

        for rarity in rarity_keys:
            if cid == f"{rarity}raritycolor":
                out[rarity] = rgba

    return out


def _build_markdown(
    output_md: Path,
    icons: list[str],
    tooltip_refs: list[dict[str, str]],
    tooltip_previews: list[dict[str, str]],
    rarity_colors: dict[str, tuple[int, int, int, int]],
    items_dir: Path,
) -> str:
    output_dir = output_md.parent
    rel_items_dir = Path(
        Path("..") / items_dir.relative_to(output_dir.parent)
    ).as_posix()

    lines: list[str] = []
    lines.append("# Wakfu Quick Preview")
    lines.append("")
    lines.append(
        f"Generated: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}"
    )
    lines.append("")
    lines.append("## Item Icons (sample)")
    lines.append("")

    if icons:
        cols = 5
        for i, name in enumerate(icons):
            if i % cols == 0:
                lines.append("<table><tr>")
            rel_img = f"{rel_items_dir}/{name}"
            item_id = name[:-4]
            lines.append(
                f"<td align=\"center\" style=\"padding:8px;\">"
                f"<img src=\"{rel_img}\" width=\"64\"/><br/>"
                f"<code>{item_id}</code></td>"
            )
            if i % cols == cols - 1:
                lines.append("</tr></table>")
        if len(icons) % cols != 0:
            lines.append("</tr></table>")
    else:
        lines.append("No item icons found.")

    lines.append("")
    lines.append("## Tooltip Texture Preview (Rendered)")
    lines.append("")
    lines.append(
        "These are actual tooltip/rarity textures downloaded from the official theme CDN and converted when needed."
    )
    lines.append("")
    lines.append("| preview | id | source path | status |")
    lines.append("|---|---|---|---|")

    failed_count = 0
    for row in tooltip_previews:
        rid = row["id"].replace("|", "\\|")
        rpath = row["path"].replace("|", "\\|")
        status = row["status"].replace("|", "\\|")
        if row["preview"]:
            preview_cell = f"<img src=\"{row['preview']}\" width=\"180\"/>"
        else:
            preview_cell = "(failed)"
            failed_count += 1
        lines.append(f"| {preview_cell} | {rid} | {rpath} | {status} |")

    lines.append("")
    lines.append("## Item Tooltip Cards (Theme-Based Preview)")
    lines.append("")
    lines.append(
        "This preview recreates item tooltip cards from official theme metadata (rarity + tooltip colors), even when CDN textures are blocked."
    )
    lines.append("")

    tooltip_bg = rarity_colors.get("tooltip_bg", (68, 58, 25, 95))
    default_border = rarity_colors.get("tooltip_border", (119, 109, 76, 80))
    rarities = [
        "common",
        "rare",
        "epic",
        "legendary",
        "mythic",
        "relic",
        "souvenir",
    ]
    card_w = 270
    card_h = 130

    for idx, rarity in enumerate(rarities):
        border = rarity_colors.get(rarity, default_border)
        icon_name = icons[idx % len(icons)] if icons else None
        icon_html = ""
        if icon_name:
            rel_img = f"{rel_items_dir}/{icon_name}"
            icon_html = f"<img src=\"{rel_img}\" width=\"48\" height=\"48\" style=\"border-radius:8px;\"/>"

        lines.append(
            "<div style=\"display:inline-block;vertical-align:top;margin:8px;\" >"
            f"<div style=\"width:{card_w}px;height:{card_h}px;"
            f"background:rgba({tooltip_bg[0]},{tooltip_bg[1]},{tooltip_bg[2]},{tooltip_bg[3] / 100:.2f});"
            f"border:2px solid rgba({border[0]},{border[1]},{border[2]},{border[3] / 100:.2f});"
            "border-radius:12px;padding:10px;color:#f6f0d2;font-family:Segoe UI,Arial,sans-serif;\" >"
            f"<div style=\"font-weight:700;color:rgb({border[0]},{border[1]},{border[2]});text-transform:capitalize;\">{rarity} tooltip</div>"
            "<div style=\"display:flex;gap:10px;align-items:center;margin-top:8px;\">"
            f"{icon_html}<div><div style=\"font-size:13px;\">Objet de test</div>"
            "<div style=\"font-size:12px;opacity:0.9;\">PA +1 | PM +1 | Maîtrise +120</div></div></div>"
            "</div></div>"
        )

    lines.append("")
    if failed_count == len(tooltip_previews) and tooltip_previews:
        lines.append("Note: texture downloads returned HTTP 403 from Ankama CDN in this environment.")
        lines.append("")

    lines.append("## Tooltip/Item Theme References")
    lines.append("")
    lines.append(
        "These are key references in the official theme likely involved in item tooltip rendering."
    )
    lines.append("")
    lines.append("| id | path | usage |")
    lines.append("|---|---|---|")

    for ref in tooltip_refs[:200]:
        rid = ref["id"].replace("|", "\\|")
        rpath = ref["path"].replace("|", "\\|")
        usage = ref["usage"].replace("|", "\\|")
        lines.append(f"| {rid} | {rpath} | {usage} |")

    lines.append("")
    lines.append("## Useful Paths")
    lines.append("")
    lines.append("- Item icons folder: ../data/ankama_official/wakassets/items/")
    lines.append("- Theme source: ../data/ankama_official/theme/theme.json")
    lines.append("")

    output_md.write_text("\n".join(lines) + "\n", encoding="utf-8")
    return "\n".join(lines)


def main() -> None:
    parser = argparse.ArgumentParser(description="Generate a quick Wakfu item/tooltip preview markdown.")
    parser.add_argument("--workspace", type=Path, default=Path(__file__).resolve().parents[1])
    parser.add_argument("--limit", type=int, default=25)
    parser.add_argument("--tooltip-limit", type=int, default=24)
    parser.add_argument("--wakfu-root", type=Path, default=Path("H:/Games/Wakfu"))
    parser.add_argument(
        "--output",
        type=Path,
        default=Path("docs") / "wakfu-quick-preview.md",
    )
    args = parser.parse_args()

    workspace = args.workspace.resolve()
    items_dir = workspace / "data" / "ankama_official" / "wakassets" / "items"
    theme_path = workspace / "data" / "ankama_official" / "theme" / "theme.json"
    output_md = workspace / args.output

    if not items_dir.exists():
        raise SystemExit(f"Missing items directory: {items_dir}")
    if not theme_path.exists():
        raise SystemExit(f"Missing theme file: {theme_path}")

    output_md.parent.mkdir(parents=True, exist_ok=True)

    with theme_path.open("r", encoding="utf-8") as f:
        theme_data = json.load(f)

    icons = _collect_item_icons(items_dir, max(1, args.limit))
    tooltip_refs = _collect_tooltip_like_refs(theme_data)
    rarity_colors = _collect_rarity_colors(theme_data)
    local_theme_dir = _detect_local_theme_dir(args.wakfu_root)
    tooltip_previews = _build_tooltip_texture_previews(
        tooltip_refs,
        output_md,
        max(1, args.tooltip_limit),
        local_theme_dir,
    )
    _build_markdown(output_md, icons, tooltip_refs, tooltip_previews, rarity_colors, items_dir)

    print(json.dumps({
        "output": str(output_md),
        "icons_previewed": len(icons),
        "tooltip_refs_found": len(tooltip_refs),
        "tooltip_previews_generated": len([x for x in tooltip_previews if x["preview"]]),
        "local_theme_dir": str(local_theme_dir) if local_theme_dir else None,
    }, indent=2))


if __name__ == "__main__":
    main()
