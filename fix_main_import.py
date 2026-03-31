import sys
path = "src-web/main.js"
lines = open(path, "r", encoding="utf-8").readlines()

# 1) Ajouter l'import des fonctions tooltip depuis hdv.js (après le dernier import)
import_line = 'import { attachPriceHover, showPriceTooltip, positionTooltip, hidePriceTooltip } from "./js/tabs/hdv.js";\n'

# Trouver la dernière ligne "import" 
last_import = 0
for i, line in enumerate(lines):
    if line.strip().startswith("import "):
        last_import = i

# Vérifier si déjà importé
already = any("attachPriceHover" in l and "import" in l for l in lines)
if already:
    print("SKIP - import deja present")
else:
    lines.insert(last_import + 1, import_line)
    print(f"OK - import tooltip ajoute apres ligne {last_import}")

# 2) Ajouter l'exposition globale dans le DOMContentLoaded (après window.__showPlayer = showPlayer)
export_code = """  window.__showPriceTooltip = showPriceTooltip;
  window.__positionTooltip = positionTooltip;
  window.__hidePriceTooltip = hidePriceTooltip;
"""

already2 = any("__showPriceTooltip" in l for l in lines)
if already2:
    print("SKIP - window.__showPriceTooltip deja present")
else:
    for i, line in enumerate(lines):
        if "window.__showPlayer = showPlayer" in line:
            lines.insert(i + 1, export_code)
            print(f"OK - window exports ajoutes apres ligne {i}")
            break

open(path, "w", encoding="utf-8").writelines(lines)
print("SAUVEGARDE")
