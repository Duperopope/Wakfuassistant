path = "src-web/main.js"
content = open(path, "r", encoding="utf-8").read()

old = 'import { attachPriceHover } from "./js/tabs/hdv.js";'
new = 'import { attachPriceHover, showPriceTooltip, hidePriceTooltip } from "./js/tabs/hdv.js";'
content = content.replace(old, new)

# Ajouter window exports apres window.__showPlayer
if "window.__showPriceTooltip" not in content:
    content = content.replace(
        "window.__showPlayer = showPlayer;",
        "window.__showPlayer = showPlayer;\n  window.__showPriceTooltip = showPriceTooltip;\n  window.__hidePriceTooltip = hidePriceTooltip;"
    )

open(path, "w", encoding="utf-8").write(content)
print("OK - main.js mis a jour")
