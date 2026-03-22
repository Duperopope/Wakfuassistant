# Extraction serialiseurs Shard Slots + Gems
**Date** : 2026-03-21 21:02:17
**Source** : `H:\Code\Wakfuassistant\docs\RND\decompiled\wakfu-src`

## yf_1 — ShardSlotSerializer (format binaire d'un slot)
**Fichier** : `yf_1.java` | **Taille** : 1911 B | **Lignes** : 75

```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yf
 */
public class yf_1
implements gs_0 {
    public byte Tg = 0;
    public int alj = 0;
    public byte alk = 0;
    public int all = 0;
    public static final int alm = 10;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Tg);
        byteBuffer.putInt(this.alj);
        byteBuffer.put(this.alk);
        byteBuffer.putInt(this.all);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Tg = byteBuffer.get();
        this.alj = byteBuffer.getInt();
        this.alk = byteBuffer.get();
        this.all = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.Tg = 0;
        this.alj = 0;
        this.alk = 0;
        this.all = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10064001) {
            yg_1 yg_12 = new yg_1(this);
            boolean bl = yg_12.b(byteBuffer, n);
            if (bl) {
                yg_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 10;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ex(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ex(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("position=").append(this.Tg).append('\n');
        stringBuilder.append(string).append("slottedItemId=").append(this.alj).append('\n');
        stringBuilder.append(string).append("slotColor=").append(this.alk).append('\n');
        stringBuilder.append(string).append("shardsAmount=").append(this.all).append('\n');
    }
}


```

## ye_2 — AdditionalGemSerializer (format binaire d'une gemme)
**Fichier** : `ye_2.java` | **Taille** : 1241 B | **Lignes** : 56

```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ye
 */
public class ye_2
implements gs_0 {
    public byte alg = 0;
    public int alh = 0;
    public static final int ali = 5;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.alg);
        byteBuffer.putInt(this.alh);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.alg = byteBuffer.get();
        this.alh = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.alg = 0;
        this.alh = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 5;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ew(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ew(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("propertyId=").append(this.alg).append('\n');
        stringBuilder.append(string).append("gemRefId=").append(this.alh).append('\n');
    }
}


```

## yh_2 — LegacyShardMigration (version < 10069001)
**Fichier** : `yh_2.java` | **Taille** : 3634 B | **Lignes** : 133

```java
/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yh
 */
final class yh_2 {
    private final ArrayList<yf_1> alo = new ArrayList(0);
    private final ArrayList<ye_2> alp = new ArrayList(0);
    private int ald = 0;
    private int ale = 0;
    private byte alq = 0;
    private byte alr = 0;
    private byte als = 0;
    private byte alt = 0;
    private byte alf = (byte)-1;
    final /* synthetic */ yd_2 alu;

    yh_2(yd_2 yd_22) {
        this.alu = yd_22;
    }

    public void avW() {
        this.alu.alb.clear();
        this.alu.alb.ensureCapacity(this.alo.size());
        this.alu.alb.addAll(this.alo);
        this.alu.alc.clear();
        this.alu.alc.ensureCapacity(this.alp.size());
        this.alu.alc.addAll(this.alp);
        this.alu.ald = this.ald;
        this.alu.ale = this.ale;
        this.alu.alf = this.alf;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alo.clear();
        this.alo.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yf_1 yf_12 = new yf_1();
            boolean bl = yf_12.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.alo.add(yf_12);
        }
        return true;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.alo.clear();
        this.alo.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            yf_1 yf_12 = new yf_1();
            boolean bl = yf_12.b(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.alo.add(yf_12);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.alp.clear();
        this.alp.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ye_2 ye_22 = new ye_2();
            boolean bl = ye_22.b(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.alp.add(ye_22);
        }
        return true;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.alo.clear();
        this.alo.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            yf_1 yf_12 = new yf_1();
            boolean bl = yf_12.b(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.alo.add(yf_12);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.alp.clear();
        this.alp.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ye_2 ye_22 = new ye_2();
            boolean bl = ye_22.b(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.alp.add(ye_22);
        }
        this.ald = byteBuffer.getInt();
        this.ale = byteBuffer.getInt();
        this.alq = byteBuffer.get();
        this.alr = byteBuffer.get();
        this.als = byteBuffer.get();
        this.alt = byteBuffer.get();
        this.alf = byteBuffer.get();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10055001) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10064001) {
            boolean bl = this.cV(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.cW(byteBuffer);
            return bl;
        }
        return false;
    }
}


```

## bES — ShardSlotView (vue UI d'un slot, 7 refs)
**Fichier** : `bES.java` | **Taille** : 7504 B | **Lignes** : 269

*(Extraction lignes cles — fichier 7504 B)*
```java
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
    // ... (lignes omises) ...
public class bES
implements aeh_2 {
    public static final String jRX = "shardStyle";
    public static final String jRY = "index";
    public static final String jRZ = "isSlotted";
    public static final String jSa = "shardLevelText";
    public static final String jSb = "shardBonusText";
    public static final String jSc = "shardDoubleBonusText";
    public static final String jSd = "canRemoveLevel";
    public static final String jSe = "canAddLevel";
    public static final String jSf = "addLevelTooltip";
    private static final @Unmodifiable Map<rd_0, aef_2> jSg;
    private static final String[] jSh;
    private final byte jSi;
    private final fhn_0 jSj;
    private final ffV jSk;
    private final Set<ffS> jSl;
    private int jSm;
    private rd_0 iQD;
    private int jSn;
    private fhg_0 jSo;
    private int jSp;
    private int eoY;
    private boolean jSq;
    // ... (lignes omises) ...
    public bES(byte by, fhn_0 fhn_02, @NotNull ffV ffV2) {
    // ... (lignes omises) ...
        this.jSj = fhn_02;
    // ... (lignes omises) ...
        this.jSm = fhn_02.air();
        this.iQD = fhn_02.dBe();
        this.jSn = fhn_02.dSU();
    // ... (lignes omises) ...
    public String[] bxk() {
    // ... (lignes omises) ...
    public byte deO() {
    // ... (lignes omises) ...
    public Object eu(String string) {
    // ... (lignes omises) ...
            return bES.a(this.iQD, this.jSm > 0);
    // ... (lignes omises) ...
            return this.jSm > 0;
    // ... (lignes omises) ...
            return aum_0.cWf().c("enchantment.shard.level.full", this.eoY, n);
    // ... (lignes omises) ...
            List<String> list = this.dSV();
            String string3 = string2 = list.isEmpty() ? "" : list.get(0);
    // ... (lignes omises) ...
            int n = optional.get().dSY().VB(this.eoY);
    // ... (lignes omises) ...
            int n = optional.get().dSY().VB(this.eoY);
    // ... (lignes omises) ...
    private void dSS() {
        if (this.jSm > 0) {
            this.jSo = fhh_0.spN.VC(this.jSm);
    // ... (lignes omises) ...
    private void dST() {
    // ... (lignes omises) ...
        this.eoY = this.jSo.Vz(this.jSn);
    // ... (lignes omises) ...
    public int air() {
        return this.jSm;
    // ... (lignes omises) ...
    public int dSU() {
        return this.jSn;
    // ... (lignes omises) ...
    public int tL() {
    // ... (lignes omises) ...
    List<String> dSV() {
    // ... (lignes omises) ...
        return eMi.a(optional.get(), this.jSq, (short)(this.eoY > 0 ? this.eoY : 1)).fzQ();
    // ... (lignes omises) ...
    private Optional<fhc_0> dSW() {
        return Optional.ofNullable(this.jSm <= 0 ? null : (Object)fgD.fXh().Vd(this.jSm));
    // ... (lignes omises) ...
    public fhn_0 dSX() {
    // ... (lignes omises) ...
    public fhg_0 dSY() {
    // ... (lignes omises) ...
    public static String a(@Nullable fjd fjd2, boolean bl) {
    // ... (lignes omises) ...
                return "shardEmpty";
    // ... (lignes omises) ...
                return "shardPresent";
    // ... (lignes omises) ...
                return "shardAny";
    // ... (lignes omises) ...
    public static String a(rd_0 rd_02, boolean bl) {
    // ... (lignes omises) ...
        if (rd_02 == null) {
    // ... (lignes omises) ...
        switch (rd_02) {
    // ... (lignes omises) ...
                string = "shardRed";
    // ... (lignes omises) ...
                string = "shardGreen";
    // ... (lignes omises) ...
                string = "shardBlue";
    // ... (lignes omises) ...
                string = "shardWhite";
    // ... (lignes omises) ...
    public static Collection<aef_2> a(rd_0 ... rd_0Array) {
        ArrayList<aef_2> arrayList = new ArrayList<aef_2>();
        for (rd_0 rd_02 : rd_0Array) {
            aef_2 aef_22 = jSg.get(rd_02);
    // ... (lignes omises) ...
        EnumMap<rd_0, aei_2> enumMap = new EnumMap<rd_0, aei_2>(rd_0.class);
        for (rd_0 rd_02 : rd_0.values()) {
            String string = bES.a(rd_02, false);
    // ... (lignes omises) ...
            enumMap.put(rd_02, new aei_2(jRX, string));
```

## fhk_0 — ShardManager (24 refs a fhn_0, gestionnaire)
**Fichier** : `fhk_0.java` | **Taille** : 13802 B | **Lignes** : 468

*(Extraction lignes cles — fichier 13802 B)*
```java
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
    // ... (lignes omises) ...
public final class fhk_0 {
    private static final Logger spW = Logger.getLogger(fhk_0.class);
    private static final fiH<ra_0<rf_0>> spX = eTr.b((short)30, (short)67, (short)38, (short)15);
    private static final fiH<ra_0<rd_0>> spY = eTr.a((short)100, (short)100, (short)100, (short)32);
    private static final fiH<ra_0<rd_0>> spZ = eTr.a((short)100, (short)100, (short)100, (short)0);
    private static final int sqa = 15;
    // ... (lignes omises) ...
    private fhk_0() {
    // ... (lignes omises) ...
    public static fhi_0 g(@NotNull lc_0 lc_02) {
    // ... (lignes omises) ...
    public static fhi_0 d(@NotNull yd_2 yd_22) {
    // ... (lignes omises) ...
        yd_22.alb.forEach(yf_12 -> fhk_0.a(fhi_02, yf_12.Tg, fhk_0.a(yf_12)));
        fhi_02.VE(yd_22.ald);
        fhi_02.VF(yd_22.ale);
        fhi_02.gE(yd_22.alf);
        yd_22.alc.forEach(ye_22 -> fhi_02.a(fgg_0.UZ(ye_22.alg), ye_22.alh));
    // ... (lignes omises) ...
    public static fhn_0 e(@NotNull lj_0 lj_02) {
        return new fhn_0(lj_02.air(), (byte)lj_02.ait(), lj_02.aiv());
    // ... (lignes omises) ...
    public static fhn_0 a(@NotNull yf_1 yf_12) {
        return new fhn_0(yf_12.alj, yf_12.alk, yf_12.all);
    // ... (lignes omises) ...
    public static void a(fhi_0 fhi_02, byte by, fhn_0 fhn_02) {
        if (fhn_02.dSU() < 0) {
    // ... (lignes omises) ...
        fhi_02.a(by, fhn_02);
    // ... (lignes omises) ...
    public static short cQ(@NotNull ffV ffV2) {
    // ... (lignes omises) ...
        for (fhn_0 fhn_02 : fhi_02.dTS().values()) {
            if (!fhn_02.fYK()) continue;
            int n = fhn_02.air();
    // ... (lignes omises) ...
    public static int cS(@NotNull ffV ffV2) {
    // ... (lignes omises) ...
        Map<fgg_0, Integer> map = fhi_02.fYP();
    // ... (lignes omises) ...
    public static boolean cT(@NotNull ffV ffV2) {
    // ... (lignes omises) ...
    private static fhi_0 cU(@NotNull ffV ffV2) {
    // ... (lignes omises) ...
        Map<Byte, fhn_0> map = fhi_02.dTS();
        ArrayList<Byte> arrayList = new ArrayList<Byte>(map.keySet());
    // ... (lignes omises) ...
        HashMap<Byte, fhn_0> hashMap = new HashMap<Byte, fhn_0>();
    // ... (lignes omises) ...
            Byte by2 = (Byte)arrayList.get(by);
            hashMap.put(by, map.get(by2));
    // ... (lignes omises) ...
    public static void cV(@NotNull ffV ffV2) {
    // ... (lignes omises) ...
    public static void a(@NotNull ffV ffV2, @NotNull fiH<ra_0<rf_0>> fiH2) {
    // ... (lignes omises) ...
        fhi_02.O(new HashMap<Byte, fhn_0>());
    // ... (lignes omises) ...
            fhi_02.dTS().put(by2, new fhn_0(fhk_0.fYU().orElse(rd_0.bjA)));
    // ... (lignes omises) ...
    public static boolean cW(@NotNull ffV ffV2) {
    // ... (lignes omises) ...
    public static void cX(@NotNull ffV ffV2) {
    // ... (lignes omises) ...
    private static boolean i(@NotNull ffV ffV2, int n) {
    // ... (lignes omises) ...
            fhi_02.a(by, new fhn_0(fhk_0.fYU().orElse(rd_0.bjA)));
    // ... (lignes omises) ...
    public static byte o(@NotNull fhc_0 fhc_02) {
    // ... (lignes omises) ...
    public static byte a(@NotNull fhc_0 fhc_02, @NotNull fiH<ra_0<rf_0>> fiH2) {
    // ... (lignes omises) ...
        rf_0 rf_02 = optional.get().bdm();
    // ... (lignes omises) ...
    private static Optional<rd_0> fYU() {
        Optional<ra_0<rd_0>> optional = spY.fZY();
    // ... (lignes omises) ...
    public static boolean cY(ffV ffV2) {
    // ... (lignes omises) ...
        fhi_03.dTS().values().forEach(fhn_02 -> fhk_0.fYU().ifPresent(fhn_02::l));
    // ... (lignes omises) ...
            fhi_03.dTS().values().forEach(fhn_02 -> fhk_0.fYU().ifPresent(fhn_02::l));
    // ... (lignes omises) ...
    public static void b(@NotNull ffV ffV2, @NotNull ffV ffV3) {
    // ... (lignes omises) ...
    public static fhq_0 c(ffV ffV2, ffV ffV3) {
    // ... (lignes omises) ...
    public static boolean a(@NotNull fhi_0 fhi_02, @NotNull fhp_0 fhp_02) {
        rd_0[] rd_0Array = fhp_02.fZe();
        if (rd_0Array.length == 0) {
    // ... (lignes omises) ...
        if (rd_0Array.length > fhi_02.dTS().size()) {
    // ... (lignes omises) ...
            for (int j = 0; j < rd_0Array.length; ++j) {
    // ... (lignes omises) ...
                fhn_0 fhn_02 = fhi_02.dTS().get((byte)n);
                rd_0 rd_02 = fhn_02.dBe();
                if (rd_02 == rd_0.bjE || rd_0Array[j] == rd_0.bjA || rd_02 == rd_0Array[j]) continue;
    // ... (lignes omises) ...
    public static boolean a(@NotNull fhi_0 fhi_02, byte by) {
    // ... (lignes omises) ...
        fhn_0 fhn_02 = fhi_03.gC(by);
        if (fhn_02 == null) {
    // ... (lignes omises) ...
        fhn_02.l(rd_0.bjA);
    // ... (lignes omises) ...
    private static short a(short s, short s2, fgj fgj2) {
    // ... (lignes omises) ...
    private static short b(short s, fgj fgj2) {
    // ... (lignes omises) ...
    public static byte[] e(fhi_0 fhi_02) {
    // ... (lignes omises) ...
            spW.fatal((Object)("Unable to serialize Shards :" + String.valueOf(fhi_02)));
    // ... (lignes omises) ...
    public static fhi_0 eQ(byte[] byArray) {
    // ... (lignes omises) ...
            spW.fatal((Object)"Unable to unserialize Shards from proto", (Throwable)invalidProtocolBufferException);
    // ... (lignes omises) ...
    public static int a(@NotNull fho_0 fho_02, @NotNull fho_0 fho_03) {
    // ... (lignes omises) ...
    public static int cZ(@NotNull ffV ffV2) {
    // ... (lignes omises) ...
        for (fhn_0 fhn_02 : ffV2.eAZ().dTS().values()) {
            n += fhk_0.a(fho_0.i(fhn_02), fho_0.sqd);
    // ... (lignes omises) ...
    public static int l(@NotNull ffV ffV2, boolean bl) {
```

## ffV — ShardFactory/Converter (6 refs, construit fhn_0)
**Fichier** : `ffV.java` | **Taille** : 25548 B | **Lignes** : 1064

*(Extraction lignes cles — fichier 25548 B)*
```java
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.TestOnly
 */
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

public class ffV
implements RT,
    // ... (lignes omises) ...
    private static final Logger shm = Logger.getLogger(ffV.class);
    protected static final fgb shn = new fgb();
    public static final short sho = 1;
    private static final short shp = 0;
    private static final short shq = 1;
    private long kYd;
    protected boolean Na;
    private fhc_0 jQZ;
    private int shr;
    protected short bol;
    // ... (lignes omises) ...
    private fnl_0 klf;
    // ... (lignes omises) ...
    protected fij_0 shs;
    // ... (lignes omises) ...
    private fhi_0 jRV;
    // ... (lignes omises) ...
    private fgX sht;
    // ... (lignes omises) ...
    private fgr_0 shu;
    // ... (lignes omises) ...
    private fgy_0 mhn;
    // ... (lignes omises) ...
    private fhz shv;
    // ... (lignes omises) ...
    public ffV() {
    // ... (lignes omises) ...
    public ffV(long l) {
    // ... (lignes omises) ...
    public static ffV k(fhc_0 fhc_02) {
    // ... (lignes omises) ...
    public static ffV a(long l, fhc_0 fhc_02) {
    // ... (lignes omises) ...
    public static ffV sH(String string) {
    // ... (lignes omises) ...
    public void l(fhc_0 fhc_02) {
    // ... (lignes omises) ...
    public ffV fVT() {
    // ... (lignes omises) ...
    public ffV eU(short s) {
    // ... (lignes omises) ...
    public ffV fVR() {
    // ... (lignes omises) ...
    public ffV to(long l) {
    // ... (lignes omises) ...
    public ffV tp(long l) {
    // ... (lignes omises) ...
    public ffV u(long l, short s) {
    // ... (lignes omises) ...
    public void cE(ffV ffV2) {
    // ... (lignes omises) ...
    public ffV fVU() {
    // ... (lignes omises) ...
    public void aZp() {
    // ... (lignes omises) ...
    public void aVI() {
    // ... (lignes omises) ...
    public void aVH() {
    // ... (lignes omises) ...
    public boolean adO() {
    // ... (lignes omises) ...
    public void f(fnl_0 fnl_02) {
    // ... (lignes omises) ...
    public fnl_0 ead() {
    // ... (lignes omises) ...
    public boolean pe() {
    // ... (lignes omises) ...
    public void a(fir_0 fir_02) {
    // ... (lignes omises) ...
    public fij_0 fVV() {
    // ... (lignes omises) ...
    public boolean dXg() {
    // ... (lignes omises) ...
    public boolean fVW() {
    // ... (lignes omises) ...
    public int fVX() {
    // ... (lignes omises) ...
    public boolean fVY() {
    // ... (lignes omises) ...
    public void a(fhi_0 fhi_02) {
    // ... (lignes omises) ...
    public fhi_0 eAZ() {
    // ... (lignes omises) ...
            throw new fgE("Aucune gemme d\u00e9finie sur l'item " + String.valueOf(this));
    // ... (lignes omises) ...
    public int fVZ() {
    // ... (lignes omises) ...
        Map<Byte, fhn_0> map = this.jRV.dTS();
    // ... (lignes omises) ...
        for (fhn_0 fhn_02 : map.values()) {
            if (fhn_02.dBe() != rd_0.bjE) continue;
    // ... (lignes omises) ...
    public short bfd() {
    // ... (lignes omises) ...
    public void ak(short s) {
    // ... (lignes omises) ...
    public void al(short s) {
    // ... (lignes omises) ...
    public short fWa() {
    // ... (lignes omises) ...
    public short bfe() {
    // ... (lignes omises) ...
    public int bab() {
    // ... (lignes omises) ...
    public long QF() {
    // ... (lignes omises) ...
    public short cmL() {
    // ... (lignes omises) ...
    public short aVe() {
    // ... (lignes omises) ...
    public Short fWb() {
    // ... (lignes omises) ...
    public fgj dwg() {
    // ... (lignes omises) ...
    public Iterator<enk_0> iterator() {
    // ... (lignes omises) ...
    public Iterator<enk_0> fWc() {
    // ... (lignes omises) ...
                if (entry2.getValue() == null || ((fhn_0)entry2.getValue()).dBe() != rd_0.bjA || ((fhn_0)entry2.getValue()).air() <= 0 || (entry = fgD.fXh().Vd(((fhn_0)entry2.getValue()).air())) == null) continue;
    // ... (lignes omises) ...
    private Iterator<enk_0> fWd() {
    // ... (lignes omises) ...
    private Iterator<enk_0> a(fhi_0 fhi_02, int n) {
    // ... (lignes omises) ...
    public short fvT() {
    // ... (lignes omises) ...
    public short fvU() {
    // ... (lignes omises) ...
    public short fvV() {
    // ... (lignes omises) ...
    public void UX(int n) {
    // ... (lignes omises) ...
    public int fUX() {
    // ... (lignes omises) ...
    public int aVt() {
    // ... (lignes omises) ...
    public int fWe() {
    // ... (lignes omises) ...
    public int cpf() {
    // ... (lignes omises) ...
    public int fWf() {
    // ... (lignes omises) ...
    public int cpg() {
    // ... (lignes omises) ...
    public String getName() {
    // ... (lignes omises) ...
    public String dah() {
    // ... (lignes omises) ...
    public String byf() {
    // ... (lignes omises) ...
    public String[] bxk() {
    // ... (lignes omises) ...
    public Object eu(String string) {
    // ... (lignes omises) ...
    public void bYg() {
    // ... (lignes omises) ...
    public void mW(boolean bl) {
    // ... (lignes omises) ...
    public void c(String string, Object object) {
    // ... (lignes omises) ...
    public void d(String string, Object object) {
    // ... (lignes omises) ...
    public void e(String string, Object object) {
    // ... (lignes omises) ...
    public boolean hP(String string) {
    // ... (lignes omises) ...
    public byte @Nullable [] apI() {
    // ... (lignes omises) ...
        if (this.b(uy_12) && uy_12.aF(ByteBuffer.wrap(byArray = new byte[uy_12.DN()]))) {
    // ... (lignes omises) ...
    public boolean aG(ByteBuffer byteBuffer) {
    // ... (lignes omises) ...
    public boolean b(int n, ByteBuffer byteBuffer) {
    // ... (lignes omises) ...
    public boolean b(uy_1 uy_12) {
    // ... (lignes omises) ...
    public boolean c(uy_1 uy_12) {
    // ... (lignes omises) ...
    public void fWg() {
    // ... (lignes omises) ...
    public boolean bfh() {
    // ... (lignes omises) ...
    public static fgb fWh() {
    // ... (lignes omises) ...
    public fhc_0 dOg() {
    // ... (lignes omises) ...
    public long LV() {
    // ... (lignes omises) ...
    public int avr() {
    // ... (lignes omises) ...
    public fhy_0 fWi() {
    // ... (lignes omises) ...
    public boolean beB() {
    // ... (lignes omises) ...
    public boolean fAu() {
    // ... (lignes omises) ...
    public boolean apo() {
    // ... (lignes omises) ...
    public boolean isUsable() {
    // ... (lignes omises) ...
    public boolean fWj() {
    // ... (lignes omises) ...
    public boolean fWk() {
    // ... (lignes omises) ...
    public boolean n(RT rT) {
    // ... (lignes omises) ...
    private boolean fWl() {
    // ... (lignes omises) ...
    public void a(wg_2 wg_22) {
    // ... (lignes omises) ...
    public void a(vr_2 vr_22) {
    // ... (lignes omises) ...
    public void a(yd_2 yd_22) {
    // ... (lignes omises) ...
        this.jRV.fYP().clear();
        yd_22.alc.clear();
    // ... (lignes omises) ...
    public void a(tt_1 tt_12) {
    // ... (lignes omises) ...
    public HashSet<eNd> UY(int n) {
    // ... (lignes omises) ...
    public boolean adZ() {
    // ... (lignes omises) ...
    public boolean fWm() {
    // ... (lignes omises) ...
    public int acs() {
    // ... (lignes omises) ...
    public fgr_0 fUY() {
    // ... (lignes omises) ...
    public void a(@Nullable fgr_0 fgr_02) {
    // ... (lignes omises) ...
    public void a(@Nullable fgy_0 fgy_02) {
    // ... (lignes omises) ...
    public void fWn() {
    // ... (lignes omises) ...
    public void fWo() {
    // ... (lignes omises) ...
    public boolean fWp() {
    // ... (lignes omises) ...
    public boolean fWq() {
    // ... (lignes omises) ...
    public boolean fWr() {
    // ... (lignes omises) ...
    public boolean fWs() {
        Map<Byte, fhn_0> map;
    // ... (lignes omises) ...
        Map<Byte, fhn_0> map2 = map = this.jRV != null ? this.jRV.dTS() : null;
    // ... (lignes omises) ...
    public boolean fWt() {
    // ... (lignes omises) ...
    public boolean fWu() {
    // ... (lignes omises) ...
    public boolean fWv() {
    // ... (lignes omises) ...
    public fgy_0 eAX() {
    // ... (lignes omises) ...
    public fgX fWw() {
    // ... (lignes omises) ...
    public void a(@Nullable fgX fgX2) {
    // ... (lignes omises) ...
    public boolean adW() {
    // ... (lignes omises) ...
    public String fWx() {
    // ... (lignes omises) ...
        stringBuilder.append('[').append(this.kYd).append(']');
    // ... (lignes omises) ...
            stringBuilder.append('i');
    // ... (lignes omises) ...
        stringBuilder.append(this.avr());
    // ... (lignes omises) ...
            stringBuilder.append('x').append(this.bol);
    // ... (lignes omises) ...
        return stringBuilder.toString();
    // ... (lignes omises) ...
    public void cF(ffV ffV2) {
    // ... (lignes omises) ...
    public void a(@Nullable fhz fhz2) {
    // ... (lignes omises) ...
    public fhz fWy() {
    // ... (lignes omises) ...
    public boolean c(fgg_0 fgg_02) {
    // ... (lignes omises) ...
    public String beT() {
    // ... (lignes omises) ...
        stringBuilder.append('{');
        stringBuilder.append("uid=").append(this.kYd);
        stringBuilder.append(", refId=").append(this.avr());
        stringBuilder.append(", qty=").append(this.bol);
        stringBuilder.append(", opt=");
    // ... (lignes omises) ...
            stringBuilder.append(this.jRV.beT());
    // ... (lignes omises) ...
            stringBuilder.append(this.shs.beT());
    // ... (lignes omises) ...
            stringBuilder.append(this.klf.beT());
    // ... (lignes omises) ...
            stringBuilder.append("none");
    // ... (lignes omises) ...
            stringBuilder.append("bind=").append(this.shu);
    // ... (lignes omises) ...
            stringBuilder.append("companionInfo=").append(this.sht);
    // ... (lignes omises) ...
        stringBuilder.append('}');
        return stringBuilder.toString();
    // ... (lignes omises) ...
    public String toString() {
        return "Item{m_uniqueId=" + this.kYd + ", m_referenceItem=" + String.valueOf(this.jQZ) + ", m_quantity=" + this.bol + ", m_pet=" + String.valueOf(this.klf) + ", m_xp=" + String.valueOf(this.shs) + ", m_shards=" + String.valueOf(this.jRV) + ", m_companionInfo=" + String.valueOf(this.sht) + ", m_mergedSetItems=" + String.valueOf(this.shv) + "}";
    // ... (lignes omises) ...
    public String bfj() {
    // ... (lignes omises) ...
    public String fWz() {
    // ... (lignes omises) ...
        return this.aG(ByteBuffer.wrap(BH.bg(string)));
    // ... (lignes omises) ...
    public fhp_0 dCC() {
    // ... (lignes omises) ...
    public void tn(long l) {
    // ... (lignes omises) ...
    public void m(fhc_0 fhc_02) {
    // ... (lignes omises) ...
    public ejm_0 drG() {
    // ... (lignes omises) ...
    public Object drH() {
    // ... (lignes omises) ...
    public String drI() {
    // ... (lignes omises) ...
    public boolean bqp() {
    // ... (lignes omises) ...
    public ffV getItem() {
    // ... (lignes omises) ...
    public /* synthetic */ RT bfg() {
    // ... (lignes omises) ...
    public /* synthetic */ RT bff() {
    // ... (lignes omises) ...
    public /* synthetic */ boolean b(Object object) {
    // ... (lignes omises) ...
    public /* synthetic */ boolean a(Object object) {
```

## bow_0 — ShardHandler (12 refs a fhn_0)
**Fichier** : `bow_0.java` | **Taille** : 7070 B | **Lignes** : 214

*(Extraction lignes cles — fichier 7070 B)*
```java
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Point;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bow
 */
public final class bow_0 {
    public static final String iPJ = "headerChargesContainer";
    private static final String iPK = "effectsPanelFloatingSlots";
    private static final String iPL = "slotPanelFloatingSlots";
    private static final String iPM = "contentContainer";
    private static final String iPN = "selectedItemSublimationContainer";
    private static final String iPO = "selectedItemSpecialSublimationContainer";
    // ... (lignes omises) ...
    private bow_0() {
    // ... (lignes omises) ...
    private static boolean dAT() {
    // ... (lignes omises) ...
    private static Optional<faw_2> mi(String string) {
        fey_2 fey_22 = (fey_2)fyw_0.gqw().th("enchantmentDialog");
    // ... (lignes omises) ...
    public static void dAU() {
    // ... (lignes omises) ...
    public static void a(@NotNull fhi_0 fhi_02, @NotNull fhi_0 fhi_03) {
    // ... (lignes omises) ...
        fhi_02.dTS().forEach((by, fhn_02) -> {
            fhn_0 fhn_03 = fhi_03.gC((byte)by);
            if (fhn_03 == null || fhn_03.dBe() != fhn_02.dBe()) {
                hashMap.put(by, fhn_02.dBe());
    // ... (lignes omises) ...
    public static void a(@NotNull fhi_0 fhi_02, @NotNull fhi_0 fhi_03, @NotNull rc_0 rc_02) {
    // ... (lignes omises) ...
            fhi_02.dTS().forEach((by, fhn_02) -> {
    // ... (lignes omises) ...
                    hashMap.put(by, fhn_02.dBe());
    // ... (lignes omises) ...
            if (!bl && fhi_02.fYI() == 4 && fhi_02.k(rd_0.bjE)) {
    // ... (lignes omises) ...
            fhi_02.dTS().forEach((by, fhn_02) -> hashMap.put(by, fhn_02.dBe()));
    // ... (lignes omises) ...
    public static void a(@NotNull fbz_2 fbz_22, @NotNull fhi_0 fhi_02) {
        HashMap<Byte, rd_0> hashMap = new HashMap<Byte, rd_0>();
        fhi_02.dTS().forEach((by, fhn_02) -> hashMap.put((Byte)by, fhn_02.dBe()));
    // ... (lignes omises) ...
    public static void b(@NotNull fhi_0 fhi_02, @NotNull fhi_0 fhi_03) {
    // ... (lignes omises) ...
        fhi_03.dTS().forEach((by, fhn_02) -> {
            fhn_0 fhn_03 = fhi_02.gC((byte)by);
            if (fhn_02.dSU() > 0 && !fhn_02.h(fhn_03) && fhn_02.dSU() >= fhn_03.dSU()) {
                hashMap.put(by, fhn_02.dBe());
    // ... (lignes omises) ...
    private static Optional<fbz_2> mj(String string) {
        fey_2 fey_22 = (fey_2)fyw_0.gqw().th("enchantmentDialog");
    // ... (lignes omises) ...
    private static void a(@NotNull fbz_2 fbz_22, @NotNull Map<Byte, rd_0> map) {
        ArrayList<fcv_1> arrayList = fbz_22.getRenderables();
        map.forEach((by, rd_02) -> bow_0.a(rd_02).ifPresent(fka_12 -> {
    // ... (lignes omises) ...
            ((fcv_1)arrayList.get(by.byteValue())).getAppearance().d((fhv_1)fka_12);
    // ... (lignes omises) ...
    private static Optional<fka_1> a(@Nullable rd_0 rd_02) {
    // ... (lignes omises) ...
        Object object = rd_02;
    // ... (lignes omises) ...
        switch (SwitchBootstraps.enumSwitch("enumSwitch", new Object[]{"RED", "GREEN", "BLUE", "WHITE"}, (rd_0)object, n)) {
    // ... (lignes omises) ...
    private static void dAV() {
    // ... (lignes omises) ...
        HashMap<Integer, List> hashMap = new HashMap<Integer, List>();
    // ... (lignes omises) ...
                hashMap.computeIfAbsent(n8, n -> new ArrayList()).add(new Point(j, i));
    // ... (lignes omises) ...
        faw_2 faw_22 = optional.get();
    // ... (lignes omises) ...
    public static void a(fhr_0 fhr_02) {
    // ... (lignes omises) ...
    private static String b(@NotNull fhr_0 fhr_02) {
```

## fhj_0 — ShardHelper (6 refs a fhn_0)
**Fichier** : `fhj_0.java` | **Taille** : 1940 B | **Lignes** : 68

```java
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from fhJ
 */
public class fhj_0 {
    public static List<ffV> fYT() {
        ArrayList<ffV> arrayList = new ArrayList<ffV>();
        Object r = fgD.fXh().Vd(24109);
        ffV ffV2 = ffV.k(r);
        ffV2.ak((short)1);
        fhi_0 fhi_02 = new fhi_0();
        fhi_02.VF(25800);
        ffV2.a(fhi_02);
        arrayList.add(ffV2);
        ffV ffV3 = ffV.k(r);
        ffV3.ak((short)1);
        fhi_0 fhi_03 = new fhi_0();
        fhi_03.a(fgg_0.sir, 24133);
        ffV3.a(fhi_03);
        arrayList.add(ffV3);
        ffV ffV4 = ffV.k(fgD.fXh().Vd(20720));
        ffV4.ak((short)1);
        fhi_0 fhi_04 = new fhi_0();
        fhi_04.a(fgg_0.sis, 25800);
        ffV4.a(fhi_04);
        arrayList.add(ffV4);
        Object r2 = fgD.fXh().Vd(26041);
        ffV ffV5 = ffV.k(r2);
        ffV5.ak((short)1);
        fhi_0 fhi_05 = new fhi_0();
        fhi_05.VF(24133);
        ffV5.a(fhi_05);
        arrayList.add(ffV5);
        Object r3 = fgD.fXh().Vd(24079);
        ffV ffV6 = ffV.k(r3);
        ffV6.ak((short)1);
        fhi_0 fhi_06 = new fhi_0();
        fhi_06.VE(27112);
        fhi_06.a((byte)0, new fhn_0(rd_0.bjD));
        fhi_06.a((byte)1, new fhn_0(rd_0.bjD));
        fhi_06.a((byte)2, new fhn_0(rd_0.bjD));
        ffV6.a(fhi_06);
        arrayList.add(ffV6);
        ffV ffV7 = ffV.k(r3);
        ffV7.ak((short)1);
        fhi_0 fhi_07 = new fhi_0();
        fhi_07.VF(24133);
        fhi_07.VE(27113);
        fhi_07.a((byte)0, new fhn_0(rd_0.bjD));
        fhi_07.a((byte)1, new fhn_0(rd_0.bjD));
        fhi_07.a((byte)2, new fhn_0(rd_0.bjD));
        ffV7.a(fhi_07);
        arrayList.add(ffV7);
        ffV ffV8 = ffV.k(r3);
        ffV8.ak((short)1);
        fhi_0 fhi_08 = new fhi_0();
        fhi_08.VF(24133);
        ffV8.a(fhi_08);
        arrayList.add(ffV8);
        return arrayList;
    }
}


```

