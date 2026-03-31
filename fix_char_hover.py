path = "src-web/js/tabs/character.js"
content = open(path, "r", encoding="utf-8").read()

hover_code = '''

// === GRAPHE PRIX MOUSEOVER (personnage) ===
function attachCharacterPriceHover() {
    var container = document.getElementById("character-view") || document.getElementById("tab-personnage");
    if (!container) return;

    container.addEventListener("mouseover", function(e) {
        var card = e.target.closest(".gc[data-id]");
        if (!card) return;
        var itemId = parseInt(card.dataset.id);
        if (!itemId || itemId <= 0) return;
        var itemName = card.querySelector(".gc__name") ? card.querySelector(".gc__name").textContent.trim() : "";
        if (typeof showPriceTooltip === "function") {
            showPriceTooltip(itemId, itemName, e);
        } else if (window.__showPriceTooltip) {
            window.__showPriceTooltip(itemId, itemName, e);
        }
    });

    container.addEventListener("mousemove", function(e) {
        if (typeof positionTooltip === "function") positionTooltip(e);
        else if (window.__positionTooltip) window.__positionTooltip(e);
    });

    container.addEventListener("mouseout", function(e) {
        var card = e.target.closest(".gc[data-id]");
        if (card) {
            if (typeof hidePriceTooltip === "function") hidePriceTooltip();
            else if (window.__hidePriceTooltip) window.__hidePriceTooltip();
        }
    });
}
'''

# Ajouter a la fin du fichier
content += hover_code

# Trouver ou le rendu se termine pour appeler attachCharacterPriceHover
# Chercher "console.log" ou la fin du rendu
content = content.replace(
    'console.log("[character] Rendu',
    'attachCharacterPriceHover();\n    console.log("[character] Rendu'
)

open(path, "w", encoding="utf-8").write(content)
print("OK - hover ajoute a character.js")
