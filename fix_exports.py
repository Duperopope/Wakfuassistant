path = "src-web/js/tabs/hdv.js"
lines = open(path, "r", encoding="utf-8").readlines()

# Trouver les fonctions et ajouter "export" devant
targets = ["function showPriceTooltip", "function positionTooltip", "function hidePriceTooltip"]
count = 0
for i, line in enumerate(lines):
    stripped = line.lstrip()
    for t in targets:
        if stripped.startswith(t) and "export" not in line:
            indent = line[:len(line) - len(line.lstrip())]
            lines[i] = indent + "export " + stripped
            print(f"OK - ligne {i}: export ajoute a {t}")
            count += 1

# Aussi s'assurer que les window.__ exports existent toujours
has_window_export = any("window.__showPriceTooltip" in l for l in lines)
if not has_window_export:
    # Ajouter apres la derniere ligne de attachPriceHover
    for i in range(len(lines)-1, -1, -1):
        if "window.__showPriceTooltip" in lines[i]:
            has_window_export = True
            break

open(path, "w", encoding="utf-8").writelines(lines)
print(f"SAUVEGARDE - {count} exports ajoutes")
