# Messages reels + Schema complet
**Date** : 2026-03-21 21:07:08

## Phase 1 — Recherche des messages par ID exact

### msgId 13668 — cru - equipped items (le vrai)
- **cdC.java** ligne 17 : `return 13668;`
  Taille: 272 B | Lignes: 20
```java
/*
 * Decompiled with CFR 0.152.
 */
class cdC
implements aaq_2<cru_0> {
    cdC() {
    }

    @Override
    public boolean a(cru_0 cru_02) {
        bbs_2.cg(cru_02.ezW());
        return false;
    }

    @Override
    public int bkq() {
        return 13668;
    }
}


```
- **cru_0.java** ligne 23 : `return 13668;`
  Taille: 358 B | Lignes: 26
```java
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cru
 */
public class cru_0
extends nr_0 {
    private byte[] mgi;

    @Override
    public boolean dn(byte[] byArray) {
        this.mgi = byArray;
        return false;
    }

    public byte[] ezW() {
        return this.mgi;
    }

    @Override
    public int d() {
        return 13668;
    }
}


```

### msgId 12125 — csn - full inventory (le vrai)
- **csn_0.java** ligne 25 : `return 12125;`
  Taille: 621 B | Lignes: 36
```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csn
 */
public class csn_0
extends nr_0 {
    private byte[] mhd;
    private long aDh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.mhd = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.mhd);
        return true;
    }

    @Override
    public int d() {
        return 12125;
    }

    public byte[] eAO() {
        return this.mhd;
    }

    public long KU() {
        return this.aDh;
    }
}


```

### msgId 13653 — HDV buy offers
- **chf_0.java** ligne 30 : `return 13653;`
  Taille: 656 B | Lignes: 33
```java
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chf
 */
public class chf_0
implements aaq_2<clU> {
    @Override
    public boolean a(clU clU2) {
        fiu_1.uCW.N("marketSearchesLock", true);
        if (clU2.evK().aHz()) {
            bNG.a(byh_1.lAz, clU2.evL(), new Object[0]);
            return false;
        }
        switch (clU2.evB()) {
            case sww: {
                bhz_2.dWn().e(clU2.evA());
                break;
            }
            case swx: {
                bhz_2.dWn().dWF().d(clU2.evA());
            }
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13653;
    }
}


```
- **clU.java** ligne 25 : `return 13653;`
  Taille: 680 B | Lignes: 38
```java
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

public class clU
extends cmy_0 {
    private mi_0 map;
    private fjc maq;

    @Override
    protected void fd(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.map = mi_0.cb(byArray);
        this.maq = fjc.Wt(byteBuffer.get());
    }

    @Override
    public int d() {
        return 13653;
    }

    @Generated
    public mi_0 evA() {
        return this.map;
    }

    @Generated
    public fjc evB() {
        return this.maq;
    }
}


```

### msgId 12294 — HDV sell entries
- **chh_0.java** ligne 30 : `return 12294;`
  Taille: 656 B | Lignes: 33
```java
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chh
 */
public class chh_0
implements aaq_2<clX> {
    @Override
    public boolean a(clX clX2) {
        fiu_1.uCW.N("marketSearchesLock", true);
        if (clX2.evK().aHz()) {
            bNG.a(byh_1.lAz, clX2.evL(), new Object[0]);
            return false;
        }
        switch (clX2.evB()) {
            case swu: {
                bhz_2.dWn().e(clX2.evC());
                break;
            }
            case swv: {
                bhz_2.dWn().dWF().d(clX2.evC());
            }
        }
        return false;
    }

    @Override
    public int bkq() {
        return 12294;
    }
}


```
- **clX.java** ligne 25 : `return 12294;`
  Taille: 674 B | Lignes: 38
```java
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

public class clX
extends cmy_0 {
    private mg mau;
    private fjc maq;

    @Override
    protected void fd(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.mau = mg.bV(byArray);
        this.maq = fjc.Wt(byteBuffer.get());
    }

    @Override
    public int d() {
        return 12294;
    }

    @Generated
    public mg evC() {
        return this.mau;
    }

    @Generated
    public fjc evB() {
        return this.maq;
    }
}


```

### msgId 13804 — csf - inventory update (confirme)
- **csf.java** ligne 39 : `return 13804;`
  Taille: 974 B | Lignes: 42
```java
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

public class csf
extends nr_0 {
    private final TLongObjectHashMap<fif> mgO = new TLongObjectHashMap();
    private boolean mgP;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        boolean bl = this.mgP = byteBuffer.get() == 1;
        while (byteBuffer.hasRemaining()) {
            long l = byteBuffer.getLong();
            byte by = byteBuffer.get();
            fif fif2 = fif.gH(by);
            fif2.eM(byteBuffer);
            this.mgO.put(l, (Object)fif2);
        }
        return true;
    }

    public TLongObjectHashMap<fif> eAz() {
        return this.mgO;
    }

    public boolean eAB() {
        return this.mgP;
    }

    @Override
    public int d() {
        return 13804;
    }
}


```

### msgId 13003 — cso - item moved (confirme)
- **cso.java** ligne 21 : `return 13003;`
  Taille: 546 B | Lignes: 32
```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cso
extends nr_0 {
    private long duS;
    private short bol;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.duS = byteBuffer.getLong();
        this.bol = byteBuffer.getShort();
        return true;
    }

    @Override
    public int d() {
        return 13003;
    }

    public long bSZ() {
        return this.duS;
    }

    public short bfd() {
        return this.bol;
    }
}


```

## Phase 2 — Classe parente cqQ (contient la logique items equipes)


## Phase 3 — Sous-serialiseurs internes restants

### vg_2 — rawItemElements (stats de base)
**Fichier** : vg_2.java | 1250 B | 56 lignes
```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vG
 */
public class vg_2
implements gs_0 {
    public byte afS = 0;
    public byte afT = 0;
    public static final int afU = 2;
    // ... (lignes omises) ...
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.afS);
        byteBuffer.put(this.afT);
    // ... (lignes omises) ...
    public boolean aG(ByteBuffer byteBuffer) {
        this.afS = byteBuffer.get();
        this.afT = byteBuffer.get();
    // ... (lignes omises) ...
    public void clear() {
    // ... (lignes omises) ...
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    // ... (lignes omises) ...
    public int DN() {
    // ... (lignes omises) ...
    public final String toString() {
    // ... (lignes omises) ...
        return stringBuilder.toString();
    // ... (lignes omises) ...
    public final void cQ(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("damageElements=").append(this.afS).append('\n');
        stringBuilder.append(string).append("resistanceElements=").append(this.afT).append('\n');
```

### vr_2 — rawXp (experience)
**Fichier** : vr_2.java | 1239 B | 56 lignes
```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vR
 */
public class vr_2
implements gs_0 {
    public int WB = 0;
    public long YH = 0L;
    public static final int agm = 12;
    // ... (lignes omises) ...
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.WB);
        byteBuffer.putLong(this.YH);
    // ... (lignes omises) ...
    public boolean aG(ByteBuffer byteBuffer) {
        this.WB = byteBuffer.getInt();
        this.YH = byteBuffer.getLong();
    // ... (lignes omises) ...
    public void clear() {
    // ... (lignes omises) ...
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    // ... (lignes omises) ...
    public int DN() {
    // ... (lignes omises) ...
    public final String toString() {
    // ... (lignes omises) ...
        return stringBuilder.toString();
    // ... (lignes omises) ...
    public final void cW(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("definitionId=").append(this.WB).append('\n');
        stringBuilder.append(string).append("xp=").append(this.YH).append('\n');
```

### ve_1 — rawItemBind (liaison)
**Fichier** : ve_1.java | 1502 B | 65 lignes
```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vE
 */
public class ve_1
implements gs_0 {
    public byte Us = 0;
    public boolean afO = false;
    public static final int afP = 2;
    // ... (lignes omises) ...
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Us);
        byteBuffer.put(this.afO ? (byte)1 : 0);
    // ... (lignes omises) ...
    public boolean aG(ByteBuffer byteBuffer) {
        this.Us = byteBuffer.get();
        this.afO = byteBuffer.get() == 1;
    // ... (lignes omises) ...
    public void clear() {
    // ... (lignes omises) ...
    public boolean b(ByteBuffer byteBuffer, int n) {
    // ... (lignes omises) ...
        return this.aG(byteBuffer);
    // ... (lignes omises) ...
    public int DN() {
    // ... (lignes omises) ...
    public final String toString() {
    // ... (lignes omises) ...
        return stringBuilder.toString();
    // ... (lignes omises) ...
    public final void cP(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("type=").append(this.Us).append('\n');
        stringBuilder.append(string).append("applied=").append(this.afO).append('\n');
```

### tt_1 — rawCompanionInfo
**Fichier** : tt_1.java | 1027 B | 51 lignes
```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tt
 */
public class tt_1
implements gs_0 {
    public long YH = 0L;
    public static final int aaD = 8;
    // ... (lignes omises) ...
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.YH);
    // ... (lignes omises) ...
    public boolean aG(ByteBuffer byteBuffer) {
        this.YH = byteBuffer.getLong();
    // ... (lignes omises) ...
    public void clear() {
    // ... (lignes omises) ...
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    // ... (lignes omises) ...
    public int DN() {
    // ... (lignes omises) ...
    public final String toString() {
    // ... (lignes omises) ...
        return stringBuilder.toString();
    // ... (lignes omises) ...
    public final void bt(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("xp=").append(this.YH).append('\n');
```

### we_1 — rawMergedItems (sets fusionnes)
**Fichier** : we_1.java | 1749 B | 72 lignes
```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from we
 */
public class we_1
implements gs_0 {
    public int aeb = 0;
    public byte[] agQ = null;
    // ... (lignes omises) ...
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.aeb);
    // ... (lignes omises) ...
            byteBuffer.putShort((short)this.agQ.length);
            byteBuffer.put(this.agQ);
    // ... (lignes omises) ...
            byteBuffer.putShort((short)0);
    // ... (lignes omises) ...
    public boolean aG(ByteBuffer byteBuffer) {
        this.aeb = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
    // ... (lignes omises) ...
            byteBuffer.get(this.agQ);
    // ... (lignes omises) ...
    public void clear() {
    // ... (lignes omises) ...
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    // ... (lignes omises) ...
    public int DN() {
    // ... (lignes omises) ...
    public final String toString() {
    // ... (lignes omises) ...
        return stringBuilder.toString();
    // ... (lignes omises) ...
    public final void de(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("version=").append(this.aeb).append('\n');
        stringBuilder.append(string).append("items=(").append(this.agQ != null ? this.agQ.length : 0).append(" bytes)\n");
```

### wg_2 — rawPet (familier)
**Fichier** : wg_2.java | 3973 B | 131 lignes
```java
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from wG
 */
public class wg_2
implements gs_0 {
    public int WB = 0;
    public String Vk = null;
    public int ahS = 0;
    public int WD = 0;
    public int WF = 0;
    public int ahT = 0;
    public long ahU = 0L;
    public long ahV = 0L;
    public int WE = 0;
    public long ahW = 0L;
    // ... (lignes omises) ...
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.WB);
    // ... (lignes omises) ...
            byte[] byArray = this.Vk.getBytes(Charsets.UTF_8);
    // ... (lignes omises) ...
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
    // ... (lignes omises) ...
            byteBuffer.putShort((short)0);
    // ... (lignes omises) ...
        byteBuffer.putInt(this.ahS);
        byteBuffer.putInt(this.WD);
        byteBuffer.putInt(this.WF);
        byteBuffer.putInt(this.ahT);
        byteBuffer.putLong(this.ahU);
        byteBuffer.putLong(this.ahV);
        byteBuffer.putInt(this.WE);
        byteBuffer.putLong(this.ahW);
    // ... (lignes omises) ...
    public boolean aG(ByteBuffer byteBuffer) {
        this.WB = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
    // ... (lignes omises) ...
        byteBuffer.get(byArray);
    // ... (lignes omises) ...
        this.ahS = byteBuffer.getInt();
        this.WD = byteBuffer.getInt();
        this.WF = byteBuffer.getInt();
        this.ahT = byteBuffer.getInt();
        this.ahU = byteBuffer.getLong();
        this.ahV = byteBuffer.getLong();
        this.WE = byteBuffer.getInt();
        this.ahW = byteBuffer.getLong();
    // ... (lignes omises) ...
    public void clear() {
    // ... (lignes omises) ...
    public boolean b(ByteBuffer byteBuffer, int n) {
    // ... (lignes omises) ...
        return this.aG(byteBuffer);
    // ... (lignes omises) ...
    public int DN() {
    // ... (lignes omises) ...
        n += this.Vk != null ? this.Vk.getBytes(Charsets.UTF_8).length : 0;
    // ... (lignes omises) ...
    public final String toString() {
    // ... (lignes omises) ...
        return stringBuilder.toString();
    // ... (lignes omises) ...
    public final void dv(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("definitionId=").append(this.WB).append('\n');
        stringBuilder.append(string).append("name=").append(this.Vk).append('\n');
        stringBuilder.append(string).append("colorItemRefId=").append(this.ahS).append('\n');
        stringBuilder.append(string).append("equippedRefItemId=").append(this.WD).append('\n');
        stringBuilder.append(string).append("health=").append(this.WF).append('\n');
        stringBuilder.append(string).append("xp=").append(this.ahT).append('\n');
        stringBuilder.append(string).append("lastMealDate=").append(this.ahU).append('\n');
        stringBuilder.append(string).append("lastHungryDate=").append(this.ahV).append('\n');
        stringBuilder.append(string).append("sleepRefItemId=").append(this.WE).append('\n');
        stringBuilder.append(string).append("sleepDate=").append(this.ahW).append('\n');
```

