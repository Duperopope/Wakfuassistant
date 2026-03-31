path = "src-web/js/tabs/hdv.js"
content = open(path, "r", encoding="utf-8").read()

# Remplacer les URL absolues par des URL relatives (passe par le proxy Vite)
old = "http://127.0.0.1:8042/api/"
new = "/api/"
count = content.count(old)
content = content.replace(old, new)

open(path, "w", encoding="utf-8").write(content)
print(f"OK - {count} URLs corrigees (127.0.0.1:8042 -> /api/)")
