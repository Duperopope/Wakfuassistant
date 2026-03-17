# Wakfu Tooltip Studio

## Goal

Use a visual editor to pick Ankama theme assets and tune tooltip look without coding.

## Start

Run:

```bat
start_tooltip_studio.bat
```

Then open:

- http://127.0.0.1:8765

## What to do in the UI

1. Search/filter assets in the left panel.
2. Local downloaded packs are auto-loaded (wakassets, generated tooltip assets, cdn/local icon packs).
3. (Optional) Paste a raw GitHub JSON manifest URL and click Importer.
4. Use the left thumbnail gallery (hover for asset name/path tooltip).
5. If remote links are broken, click `Tout telecharger en local (cache)`.
6. Click a thumbnail to preview and apply it.
7. Add assets as separate editable elements with `Ajouter asset comme element` or double-click a thumbnail.
8. Each element can be moved/resized independently.
9. For selected element, adjust border thickness, border radius, and border color.
10. Use `Asset -> fond tooltip` for textured background and adjust alpha sliders.
11. Hold Alt and drag each block (badge, icon, title, type, `Niv.`, `230`, etc.).
12. Resize each block with edge/corner handles (8 directions).
13. Select a block and control visibility, opacity, align X/Y, fit, zoom, offset, and border style.
14. Tune colors/sizes/sliders until it matches your screenshot.
15. Click **Sauver dans data/tooltip_model.json**.

The model will be written to:

- `data/tooltip_model.json`

## Next step

Once your model is saved, tell Copilot: "applique mon tooltip_model.json dans l'overlay".
