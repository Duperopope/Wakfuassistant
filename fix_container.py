path = "src-web/js/tabs/character.js"
content = open(path, "r", encoding="utf-8").read()

old = 'var container = document.getElementById("character-view") || document.getElementById("tab-personnage");'
new = 'var container = document.getElementById("charContainer") || document.getElementById("persoFichePanel");'

if old in content:
    content = content.replace(old, new)
    print("OK - conteneur corrige: charContainer")
else:
    print("PATTERN NON TROUVE - verifie manuellement")

open(path, "w", encoding="utf-8").write(content)
print("SAUVEGARDE")
