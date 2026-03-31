path = "tools/api_v2.py"
lines = open(path, "r", encoding="utf-8").readlines()

for i in range(len(lines)):
    if "def api_market_history" in lines[i]:
        # Trouver la ligne "import datetime" juste apres
        for j in range(i+1, min(i+5, len(lines))):
            if "import datetime" in lines[j]:
                lines[j] = "    import datetime, sqlite3, os\n"
                print(f"OK - ligne {j}: ajoute sqlite3 et os")
                break
        break

open(path, "w", encoding="utf-8").writelines(lines)
print("SAUVEGARDE")
