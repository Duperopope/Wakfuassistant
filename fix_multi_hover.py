path = "src-web/js/tabs/hdv.js"
content = open(path, "r", encoding="utf-8").read()

old_func = '''export function attachPriceHover() {
    const container = document.getElementById("hdv-patrimoine") || document.getElementById("hdv-market") || document.getElementById("market-table-body");
    if (!container) return;'''

new_func = '''export function attachPriceHover() {
    var containers = [
        document.getElementById("hdv-patrimoine"),
        document.getElementById("hdv-market"),
        document.getElementById("market-table-body")
    ].filter(Boolean);
    if (containers.length === 0) return;
    containers.forEach(function(container) {'''

if old_func in content:
    content = content.replace(old_func, new_func)
    # Aussi fermer le forEach a la fin de la fonction (avant le dernier })
    # Trouver la fin de attachPriceHover
    content = content.replace(
        "    container.addEventListener(\"mouseout\", (e) => {\n        const row = e.target.closest(\"tr[data-item-ref-id]\");\n        if (row) {\n            clearTimeout(hoverTimeout);\n            hidePriceTooltip();\n        }\n    });\n}",
        "    container.addEventListener(\"mouseout\", (e) => {\n        const row = e.target.closest(\"tr[data-item-ref-id]\");\n        if (row) {\n            clearTimeout(hoverTimeout);\n            hidePriceTooltip();\n        }\n    });\n    }); // fin forEach containers\n}"
    )
    print("OK - attachPriceHover multi-container")
else:
    print("WARN - pattern non trouve, tentative manuelle")
    # Juste remplacer la ligne container =
    content = content.replace(
        'const container = document.getElementById("hdv-patrimoine") || document.getElementById("hdv-market") || document.getElementById("market-table-body");',
        'const containers = [document.getElementById("hdv-patrimoine"), document.getElementById("hdv-market")].filter(Boolean);'
    )

open(path, "w", encoding="utf-8").write(content)
print("SAUVEGARDE")
