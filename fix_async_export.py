path = "src-web/js/tabs/hdv.js"
lines = open(path, "r", encoding="utf-8").readlines()

for i, line in enumerate(lines):
    if "async function showPriceTooltip" in line and "export" not in line:
        indent = line[:len(line) - len(line.lstrip())]
        lines[i] = indent + "export " + line.lstrip()
        print(f"OK - ligne {i}: export ajoute a async function showPriceTooltip")
        break

open(path, "w", encoding="utf-8").writelines(lines)
print("SAUVEGARDE")
