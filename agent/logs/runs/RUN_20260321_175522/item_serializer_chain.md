# Chaine de serialisation Item — uy_1 + messages reseau
**Date** : 2026-03-21 21:05:24

## A — Sous-serialiseurs de uy_1

### vd_2 — Shard block (devrait contenir yd_2)
**Fichier** : vd_2.java | **Taille** : 1344 B | **Lignes** : 61

```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vd
 */
public class vd_2
implements gs_0 {
    public final vg_2 aeT = new vg_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.aeT.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.aeT.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.aeT.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10036004) {
            ve_2 ve_22 = new ve_2(this);
            boolean bl = ve_22.b(byteBuffer, n);
            if (bl) {
                ve_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.aeT.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cB(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cB(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawItemElements=...\n");
        this.aeT.cQ(stringBuilder, string + "  ");
    }
}


```

### vk_1 — Pet data
**Fichier** : vk_1.java | **Taille** : 1335 B | **Lignes** : 61

```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vk
 */
public class vk_1
implements gs_0 {
    public final wg_2 afd = new wg_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.afd.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.afd.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.afd.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10048000) {
            vl_2 vl_22 = new vl_2(this);
            boolean bl = vl_22.b(byteBuffer, n);
            if (bl) {
                vl_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.afd.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cF(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cF(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawPet=...\n");
        this.afd.dv(stringBuilder, string + "  ");
    }
}


```

### vt_2 — XP data
**Fichier** : vt_2.java | **Taille** : 1086 B | **Lignes** : 52

```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vt
 */
public class vt_2
implements gs_0 {
    public final vr_2 afr = new vr_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.afr.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.afr.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.afr.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.afr.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cJ(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cJ(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawXp=...\n");
        this.afr.cW(stringBuilder, string + "  ");
    }
}


```

### vp_2 — Bind data
**Fichier** : vp_2.java | **Taille** : 1337 B | **Lignes** : 61

```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vp
 */
public class vp_2
implements gs_0 {
    public final yd_2 afm = new yd_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.afm.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.afm.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.afm.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            vq_1 vq_12 = new vq_1(this);
            boolean bl = vq_12.b(byteBuffer, n);
            if (bl) {
                vq_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.afm.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cH(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cH(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawShard=...\n");
        this.afm.ev(stringBuilder, string + "  ");
    }
}


```

### vb_1 — Sub-block 4 (inconnu)
**Fichier** : vb_1.java | **Taille** : 1345 B | **Lignes** : 61

```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vb
 */
public class vb_1
implements gs_0 {
    public final tt_1 aeQ = new tt_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.aeQ.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.aeQ.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.aeQ.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10029000) {
            vc_1 vc_12 = new vc_1(this);
            boolean bl = vc_12.b(byteBuffer, n);
            if (bl) {
                vc_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.aeQ.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cA(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cA(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawCompanionInfo=...\n");
        this.aeQ.bt(stringBuilder, string + "  ");
    }
}


```

### uz_2 — Sub-block 5 (inconnu)
**Fichier** : uz_2.java | **Taille** : 1340 B | **Lignes** : 61

```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uZ
 */
public class uz_2
implements gs_0 {
    public final ve_1 aeN = new ve_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.aeN.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.aeN.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.aeN.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10045010) {
            va_1 va_12 = new va_1(this);
            boolean bl = va_12.b(byteBuffer, n);
            if (bl) {
                va_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.aeN.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cz(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cz(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawItemBind=...\n");
        this.aeN.cP(stringBuilder, string + "  ");
    }
}


```

### vh_2 — Sub-block 7 (inconnu)
**Fichier** : vh_2.java | **Taille** : 1343 B | **Lignes** : 61

```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vh
 */
public class vh_2
implements gs_0 {
    public final we_1 aeY = new we_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.aeY.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.aeY.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.aeY.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10037001) {
            vi_2 vi_22 = new vi_2(this);
            boolean bl = vi_22.b(byteBuffer, n);
            if (bl) {
                vi_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.aeY.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cD(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cD(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawMergedItems=...\n");
        this.aeY.de(stringBuilder, string + "  ");
    }
}


```

## B — Messages reseau utilisant uy_1

### cru — Player equipped items (msgId 13668)
**Fichier** : crU.java | **Taille** : 582 B | **Lignes** : 37

```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crU
extends cqQ {
    private int hug;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.hug = byteBuffer.getInt();
        return true;
    }

    public int TP() {
        return this.hug;
    }

    @Override
    public int d() {
        return 13674;
    }

    @Override
    public int avZ() {
        return 0;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rtu;
    }
}


```

### csn — Full inventory (msgId 12125)
**Fichier** : csN.java | **Taille** : 795 B | **Lignes** : 36

```java
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public class csN
extends csP {
    @NotNull
    private rb_0 lXy;

    @Override
    protected void fj(ByteBuffer byteBuffer) {
        byte by = byteBuffer.get();
        this.lXy = rb_0.mL(by).orElseThrow(() -> new InvalidProtocolBufferException("Unknown sacrifice action ID " + by));
    }

    @Override
    public int d() {
        return 13648;
    }

    @NotNull
    @Generated
    public rb_0 eBB() {
        return this.lXy;
    }
}


```

### csf — Inventory update / chest
**Fichier** : csf.java | **Taille** : 974 B | **Lignes** : 42

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

### cso — Inventory item moved
**Fichier** : cso.java | **Taille** : 546 B | **Lignes** : 32

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

## C — Classes referençant uy_1

- **ffV.java** : 56 refs
- **auy_1.java** : 23 refs
- **cuy_1.java** : 15 refs
- **euv_1.java** : 8 refs
- **fah.java** : 8 refs
- **eJD.java** : 8 refs
- **feu_0.java** : 7 refs
- **fgD.java** : 6 refs
- **blg_0.java** : 4 refs
- **fdY.java** : 4 refs
- **fdX.java** : 4 refs
- **cqa_0.java** : 4 refs
- **ffr_0.java** : 4 refs
- **ffs_0.java** : 3 refs
- **fua_1.java** : 3 refs

## D — Relation vd_2 ↔ yd_2

**vd_2 ne reference PAS yd_2** — c'est un serialiseur independant

Contenu de vd_2 (extrait) :
```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vd
 */
public class vd_2
implements gs_0 {
    public final vg_2 aeT = new vg_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.aeT.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.aeT.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.aeT.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10036004) {
            ve_2 ve_22 = new ve_2(this);
            boolean bl = ve_22.b(byteBuffer, n);
            if (bl) {
                ve_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.aeT.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cB(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cB(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawItemElements=...\n");
        this.aeT.cQ(stringBuilder, string + "  ");
    }
}

```
