path = "src-web/main.js"
content = open(path, "r", encoding="utf-8").read()

old = 'import { attachPriceHover, showPriceTooltip, positionTooltip, hidePriceTooltip } from "./js/tabs/hdv.js";'
new = 'import { attachPriceHover } from "./js/tabs/hdv.js";'

content = content.replace(old, new)

# Aussi simplifier les window exports (garder juste ce qui marche)
content = content.replace("  window.__showPriceTooltip = showPriceTooltip;\n", "")
content = content.replace("  window.__positionTooltip = positionTooltip;\n", "")
content = content.replace("  window.__hidePriceTooltip = hidePriceTooltip;\n", "")

open(path, "w", encoding="utf-8").write(content)
print("OK - import corrige")
