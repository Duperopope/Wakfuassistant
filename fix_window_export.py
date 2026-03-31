path = "src-web/js/tabs/hdv.js"
content = open(path, "r", encoding="utf-8").read()

# Ajouter les exports globaux apres ensureTooltip
export_code = """
// Exposer sur window pour les autres onglets
window.__showPriceTooltip = showPriceTooltip;
window.__positionTooltip = positionTooltip;
window.__hidePriceTooltip = hidePriceTooltip;
"""

if "window.__showPriceTooltip" not in content:
    # Inserer apres la definition de hidePriceTooltip
    content = content.replace(
        "function hidePriceTooltip() {\n    currentHoverItem = null;\n    if (tooltipEl) tooltipEl.style.display = \"none\";\n}",
        "function hidePriceTooltip() {\n    currentHoverItem = null;\n    if (tooltipEl) tooltipEl.style.display = \"none\";\n}\n" + export_code
    )
    print("OK - fonctions tooltip exposees sur window")
else:
    print("SKIP - deja expose")

open(path, "w", encoding="utf-8").write(content)
print("SAUVEGARDE")
