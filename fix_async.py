path = "tools/api_v2.py"
lines = open(path, "r", encoding="utf-8").readlines()

# Trouver la ligne "async def api_market_history"
for i in range(len(lines)):
    if "def api_market_history" in lines[i]:
        # Remplacer async def par def (pas besoin d'async)
        lines[i] = lines[i].replace("async def", "def")
        print(f"OK - ligne {i}: async -> sync")
        break

open(path, "w", encoding="utf-8").writelines(lines)
print("SAUVEGARDE")
