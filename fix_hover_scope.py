path = "src-web/js/tabs/hdv.js"
lines = open(path, "r", encoding="utf-8").readlines()

for i in range(len(lines)):
    if 'document.getElementById("hdv-market") || document.getElementById("market-table-body")' in lines[i]:
        lines[i] = lines[i].replace(
            'document.getElementById("hdv-market") || document.getElementById("market-table-body")',
            'document.getElementById("hdv-patrimoine") || document.getElementById("hdv-market") || document.getElementById("market-table-body")'
        )
        print(f"OK - ligne {i}: hdv-patrimoine ajoute au hover")
        break

open(path, "w", encoding="utf-8").writelines(lines)
print("SAUVEGARDE")
