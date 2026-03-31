path = "tools/api_v2.py"
lines = open(path, "r", encoding="utf-8").readlines()

# Trouver le bloc history (commence par "    @app.get" avec market/history)
start = None
end = None
for i, line in enumerate(lines):
    if "market/history" in line and "@app.get" in line:
        start = i
    if start and i > start + 2 and (line.strip() == "" or (not line.startswith("    ") and not line.startswith("\t") and line.strip() != "")):
        # Ligne non indentee ou vide apres le bloc = fin
        if line.strip() != "":
            end = i
            break
        # Ligne vide: continuer si la suivante est encore indentee
        if i + 1 < len(lines) and lines[i+1].startswith("    "):
            continue
        else:
            end = i
            break

if not start:
    print("ERREUR: bloc history non trouve")
else:
    if not end:
        end = len(lines)
    # Desindenter de 4 espaces (lignes start a end-1)
    count = 0
    for i in range(start, end):
        if lines[i].startswith("    "):
            lines[i] = lines[i][4:]
            count += 1
    open(path, "w", encoding="utf-8").writelines(lines)
    print(f"OK - {count} lignes desindentees (lignes {start}-{end-1})")
