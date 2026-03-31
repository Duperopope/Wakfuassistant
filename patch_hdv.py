import re

path = "src-web/js/tabs/hdv.js"
lines = open(path, "r", encoding="utf-8").readlines()

# 1) Patch <tr> marche pour ajouter data-item-ref-id
for i in range(len(lines)):
    if '<tr style=' in lines[i] and 'border-bottom' in lines[i] and 'data-item-ref-id' not in lines[i] and i > 100:
        lines[i] = lines[i].replace(
            'html += "<tr style=\'border-bottom:1px solid #222\'>";',
            'html += "<tr data-item-ref-id=\'" + (it.itemId || it.item_ref_id || 0) + "\' data-item-name=\'" + ((it.name || "").replace(/\'/g, "\\\'")) + "\' style=\'border-bottom:1px solid #222\'>";'
        )
        print(f"OK - data-item-ref-id ajoute ligne {i}")
        break
else:
    print("SKIP - tr deja patche ou non trouve")

# 2) Supprimer doublon fmtK (2e occurrence)
fmtk_indices = [i for i, l in enumerate(lines) if "function fmtK" in l]
if len(fmtk_indices) > 1:
    idx = fmtk_indices[1]
    # Supprimer du "function fmtK" jusqu'au "}" fermant
    end = idx + 1
    while end < len(lines) and lines[end].strip() != "}":
        end += 1
    for j in range(idx, end + 1):
        lines[j] = ""
    print(f"OK - doublon fmtK supprime (lignes {idx}-{end})")
else:
    print("SKIP - un seul fmtK")

# 3) Appeler attachPriceHover() apres innerHTML du marche
done = False
for i in range(100, 200):
    if "innerHTML" in lines[i] and "hdv-market" in lines[i]:
        lines.insert(i + 1, "    attachPriceHover();\n")
        done = True
        print(f"OK - attachPriceHover() insere apres ligne {i}")
        break
if not done:
    # Fallback: chercher innerHTML = html dans la zone marche
    for i in range(100, 200):
        if "innerHTML = html" in lines[i] and not done:
            lines.insert(i + 1, "    attachPriceHover();\n")
            done = True
            print(f"OK - attachPriceHover() insere apres ligne {i} (fallback)")
            break
if not done:
    print("WARN - innerHTML non trouve, voici lignes 135-170:")
    for i in range(135, min(170, len(lines))):
        print(f"  {i}: {lines[i].rstrip()}")

open(path, "w", encoding="utf-8").writelines(lines)
print("FICHIER SAUVEGARDE")
