path = "src-web/js/tabs/hdv.js"
lines = open(path, "r", encoding="utf-8").readlines()

fixes = 0

# 1) Ajouter data-item-ref-id au <tr> du patrimoine (ligne 57)
for i in range(len(lines)):
    if 'border-bottom:1px solid #222' in lines[i] and 'data-item-ref-id' not in lines[i] and i < 60:
        lines[i] = lines[i].replace(
            "html += \"<tr style='border-bottom:1px solid #222'>\";",
            "html += \"<tr data-item-ref-id='\" + (it.itemId || it.item_ref_id || 0) + \"' data-item-name='\" + ((it.name || '').replace(/'/g, '')) + \"' style='border-bottom:1px solid #222'>\";"
        )
        fixes += 1
        print(f"OK - ligne {i}: data-item-ref-id ajoute au patrimoine")
        break

# 2) Ajouter attachPriceHover() apres el.innerHTML = html du patrimoine (ligne 73)
for i in range(len(lines)):
    if 'el.innerHTML = html' in lines[i] and i < 80:
        if i + 1 < len(lines) and 'attachPriceHover' not in lines[i + 1]:
            lines.insert(i + 1, "    attachPriceHover();\n")
            fixes += 1
            print(f"OK - ligne {i+1}: attachPriceHover() ajoute apres patrimoine")
        break

open(path, "w", encoding="utf-8").writelines(lines)
print(f"SAUVEGARDE - {fixes} corrections")
