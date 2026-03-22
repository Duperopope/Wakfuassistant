# Modele de donnees Shard/Sublimation — VALIDE
**Date** : 2026-03-21 21:04:14
**Source** : decompilation complete wakfu-client.jar (18 979 classes)

## Phase 1 — Verification CDN des IDs de test

| ID | Nom | Type | TypeId | Rarity | Trouvé |
|---:|------|------|-------:|-------:|:------:|
| 24109 | ? | ? | ? | ? | NO |
| 20720 | ? | ? | ? | ? | NO |
| 26041 | ? | ? | ? | ? | NO |
| 24079 | ? | ? | ? | ? | NO |
| 25800 | ? | ? | ? | ? | NO |
| 24133 | ? | ? | ? | ? | NO |
| 27112 | ? | ? | ? | ? | NO |
| 27113 | ? | ? | ? | ? | NO |

## Phase 2 — Serialiseur d'item complet

**uy_1.java** trouve : 9304 B, 338 lignes
*(Extraction lignes cles)*
```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uY
 */
public class uy_1
implements gs_0 {
    public long ZC = 0L;
    public int aaQ = 0;
    public short aaa = 0;
    public vk_1 aeF = null;
    public vt_2 aeG = null;
    public vp_2 aeH = null;
    public vb_1 aeI = null;
    public uz_2 aeJ = null;
    public vd_2 aeK = null;
    public vh_2 aeL = null;
    // ... (lignes omises) ...
    public boolean aF(ByteBuffer byteBuffer) {
    // ... (lignes omises) ...
        byteBuffer.putLong(this.ZC);
        byteBuffer.putInt(this.aaQ);
        byteBuffer.putShort(this.aaa);
    // ... (lignes omises) ...
            byteBuffer.put((byte)1);
            bl = this.aeF.aF(byteBuffer);
    // ... (lignes omises) ...
            byteBuffer.put((byte)0);
    // ... (lignes omises) ...
            byteBuffer.put((byte)1);
            bl = this.aeG.aF(byteBuffer);
    // ... (lignes omises) ...
            byteBuffer.put((byte)0);
    // ... (lignes omises) ...
            byteBuffer.put((byte)1);
            bl = this.aeH.aF(byteBuffer);
    // ... (lignes omises) ...
            byteBuffer.put((byte)0);
    // ... (lignes omises) ...
            byteBuffer.put((byte)1);
            bl = this.aeI.aF(byteBuffer);
    // ... (lignes omises) ...
            byteBuffer.put((byte)0);
    // ... (lignes omises) ...
            byteBuffer.put((byte)1);
            bl = this.aeJ.aF(byteBuffer);
    // ... (lignes omises) ...
            byteBuffer.put((byte)0);
    // ... (lignes omises) ...
            byteBuffer.put((byte)1);
            bl = this.aeK.aF(byteBuffer);
    // ... (lignes omises) ...
            byteBuffer.put((byte)0);
    // ... (lignes omises) ...
            byteBuffer.put((byte)1);
            bl = this.aeL.aF(byteBuffer);
    // ... (lignes omises) ...
            byteBuffer.put((byte)0);
    // ... (lignes omises) ...
            byteBuffer.put((byte)1);
            bl = this.aeM.aF(byteBuffer);
    // ... (lignes omises) ...
            byteBuffer.put((byte)0);
    // ... (lignes omises) ...
    public boolean aG(ByteBuffer byteBuffer) {
    // ... (lignes omises) ...
        this.ZC = byteBuffer.getLong();
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        boolean bl9 = bl8 = byteBuffer.get() == 1;
    // ... (lignes omises) ...
            bl7 = this.aeF.aG(byteBuffer);
    // ... (lignes omises) ...
        boolean bl10 = bl7 = byteBuffer.get() == 1;
    // ... (lignes omises) ...
            bl6 = this.aeG.aG(byteBuffer);
    // ... (lignes omises) ...
        boolean bl11 = bl6 = byteBuffer.get() == 1;
    // ... (lignes omises) ...
            bl5 = this.aeH.aG(byteBuffer);
    // ... (lignes omises) ...
        boolean bl12 = bl5 = byteBuffer.get() == 1;
    // ... (lignes omises) ...
            bl4 = this.aeI.aG(byteBuffer);
    // ... (lignes omises) ...
        boolean bl13 = bl4 = byteBuffer.get() == 1;
    // ... (lignes omises) ...
            bl3 = this.aeJ.aG(byteBuffer);
    // ... (lignes omises) ...
        boolean bl14 = bl3 = byteBuffer.get() == 1;
    // ... (lignes omises) ...
            bl2 = this.aeK.aG(byteBuffer);
    // ... (lignes omises) ...
        boolean bl15 = bl2 = byteBuffer.get() == 1;
    // ... (lignes omises) ...
            bl = this.aeL.aG(byteBuffer);
    // ... (lignes omises) ...
        boolean bl16 = bl = byteBuffer.get() == 1;
    // ... (lignes omises) ...
            boolean bl17 = this.aeM.aG(byteBuffer);
    // ... (lignes omises) ...
    public void clear() {
    // ... (lignes omises) ...
    public boolean b(ByteBuffer byteBuffer, int n) {
    // ... (lignes omises) ...
        return this.aG(byteBuffer);
    // ... (lignes omises) ...
    public int DN() {
    // ... (lignes omises) ...
            n += this.aeF.DN();
    // ... (lignes omises) ...
            n += this.aeG.DN();
    // ... (lignes omises) ...
            n += this.aeH.DN();
    // ... (lignes omises) ...
            n += this.aeI.DN();
    // ... (lignes omises) ...
            n += this.aeJ.DN();
    // ... (lignes omises) ...
            n += this.aeK.DN();
    // ... (lignes omises) ...
            n += this.aeL.DN();
    // ... (lignes omises) ...
            n += this.aeM.DN();
    // ... (lignes omises) ...
        stringBuilder.append(string).append("uniqueId=").append(this.ZC).append('\n');
        stringBuilder.append(string).append("refId=").append(this.aaQ).append('\n');
        stringBuilder.append(string).append("quantity=").append(this.aaa).append('\n');
        stringBuilder.append(string).append("pet=");
    // ... (lignes omises) ...
        stringBuilder.append(string).append("xp=");
    // ... (lignes omises) ...
        stringBuilder.append(string).append("shard=");
```

## Phase 3 — Schema binaire recapitulatif

```
ITEM COMPLET (ffV / uy_1):
┌─────────────────────────────────────────────┐
│ [long]   uniqueId        (kYd)              │
│ [int]    referenceItemId  (shr → avr())     │
│ [short]  quantity         (bol)              │
│ [...]    pet data         (fnl_0 klf)       │
│ [...]    xp data          (fij_0 shs)       │
│ [...]    bind data        (fgr_0 shu)       │
│ [...]    companion data   (fgX sht)         │
│ [...]    merged set       (fhz shv)         │
│                                             │
│ ENCHANTMENTS BLOCK (yd_2 → fhi_0 jRV):     │
│ ┌─────────────────────────────────────────┐ │
│ │ [short] nSlots                          │ │
│ │   × nSlots:                             │ │
│ │   [byte]  position      (0,1,2)         │ │
│ │   [int]   slottedItemId (effectId CDN)  │ │
│ │   [byte]  slotColor     (R=1,B=2,G=3)  │ │
│ │   [int]   shardsAmount  (niveau)        │ │
│ │                                         │ │
│ │ [short] nGems                           │ │
│ │   × nGems:                              │ │
│ │   [byte]  propertyId    (19=epic,20=rel)│ │
│ │   [int]   gemRefId      (ID CDN gemme)  │ │
│ │                                         │ │
│ │ [int]   sublimationItemId               │ │
│ │ [int]   specialSublimationItemId        │ │
│ │ [byte]  charges (-1=infini)             │ │
│ └─────────────────────────────────────────┘ │
└─────────────────────────────────────────────┘

SLOT COLORS (rd_0):
  0 = bjA = NONE/EMPTY
  1 = bjB = RED
  2 = bjC = BLUE
  3 = bjD = GREEN
  4 = bjE = WHITE (epic slot)

ITEM PROPERTIES (fgg_0) — selected:
   8 = RELIC (unique equip)
  12 = RELIC_2 (unique equip v2)
  19 = ADDS_EPIC_GEM_SLOT
  20 = ADDS_RELIC_GEM_SLOT

EQUIPMENT SLOTS (ffS):
   0 = HEAD         3 = SHOULDERS    4 = NECK
   5 = CHEST        7 = LEFT_HAND    8 = RIGHT_HAND
  10 = BELT        12 = LEGS         13 = BACK
  15 = WEAPON_1    16 = WEAPON_2     17 = ACCESSORY
  22 = PET          24 = MOUNT
```

## Phase 4 — Historique des versions de serialisation

D'apres `yh_2` (migration legacy) :

| Version     | Format                                         |
|------------:|------------------------------------------------|
| < 1         | Non supporte                                   |
| 1 - 10054999| Slots uniquement (pas de gems)                 |
| 10055001 - 10063999 | Slots + additionalGems              |
| 10064001 - 10068999 | Slots + gems + sublim + 4 bytes legacy + charges |
| >= 10069001 | Format actuel (yd_2.aG) clean                  |

