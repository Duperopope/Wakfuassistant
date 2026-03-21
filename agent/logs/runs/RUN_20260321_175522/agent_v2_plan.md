# PLAN AGENT V2 - Interception directe des items

## Probleme
Le handler du message cru (13668) est introuvable dans les 18979 classes.
sipush 13668 = 0 hits (constante encodee autrement: ldc, ldc_w, ou table).
Chercher dans 18000 classes est impraticable.

## Solution: instrumenter coS et coR directement

### Etape 1: Intercepter coR.dn(byte[])
L'agent Byte-Buddy intercepte deja les messages. Pour coR:
- coR contient mdv = coS[] (offres HDV)
- Chaque coS a: mdw(byte type), mdx(long id), mdy(byte[] payload)
- Il faut logger coS.mdy (le blob de l'item)

### Etape 2: Intercepter cru.dn(byte[])  
- cru.mgi contient le blob complet des items equipes
- L'agent log deja le HEX de mgi
- Il faut parser mgi cote agent ou cote PowerShell

### Etape 3: Parser le blob mgi/mdy
- Le format est binaire custom Wakfu (pas protobuf)
- Header: int32 BE (version=1, count=15)
- Chaque item: [timestamp?][name_len][name_utf8][00 00][ref_id][padding][region][timestamp]
- Les sublimations/effets sont quelque part dans ces blocs

### Alternative: intercepter la couche au-dessus
- Au lieu de parser le binaire, intercepter la classe qui CREE les objets Item
- Chercher une classe avec setStateId(), setEffect(), addSublimation()
- Utiliser Byte-Buddy pour logger ces appels

## Fichiers a modifier
- agent/src/main/java/WakfuSpyAgent.java
- agent/src/main/java/MessageInterceptor.java (ou equivalent)
