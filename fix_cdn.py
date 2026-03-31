path = "tools/api_v2.py"
lines = open(path, "r", encoding="utf-8").readlines()

fixes = 0
for i in range(len(lines)):
    # Remplacer CDN_CACHE et CDN_ITEMS par _cdn_lookup
    if "CDN_CACHE" in lines[i] or "CDN_ITEMS" in lines[i]:
        if "market_history" in "".join(lines[max(0,i-30):i+1]) or i > 1095:
            # On est dans le bloc history
            pass

# Approche directe: remplacer les lignes 1096-1100
for i in range(len(lines)):
    if '    if CDN_CACHE and item_ref_id in CDN_CACHE:' in lines[i]:
        lines[i]   = '        info = _cdn_lookup(item_ref_id)\n'
        lines[i+1] = '        if info:\n'
        lines[i+2] = '            name = info.get("name", info.get("name_fr", ""))\n'
        # Supprimer les lignes elif CDN_ITEMS
        if i+3 < len(lines) and "CDN_ITEMS" in lines[i+3]:
            lines[i+3] = ''
        if i+4 < len(lines) and "CDN_ITEMS" in lines[i+4]:
            lines[i+4] = ''
        fixes += 1
        break

if fixes == 0:
    # Essai 2: chercher avec indentation 4 espaces
    for i in range(len(lines)):
        if 'if CDN_CACHE' in lines[i] and 'item_ref_id' in lines[i]:
            lines[i]   = '        info = _cdn_lookup(item_ref_id)\n'
            lines[i+1] = '        if info:\n'
            lines[i+2] = '            name = info.get("name", info.get("name_fr", ""))\n'
            if i+3 < len(lines) and "CDN_ITEMS" in lines[i+3]:
                lines[i+3] = ''
            if i+4 < len(lines) and "CDN_ITEMS" in lines[i+4]:
                lines[i+4] = ''
            fixes += 1
            print(f"OK - CDN fix applique a la ligne {i}")
            break

if fixes == 0:
    print("ERREUR - CDN_CACHE non trouve")
else:
    open(path, "w", encoding="utf-8").writelines(lines)
    print("FICHIER SAUVEGARDE")
