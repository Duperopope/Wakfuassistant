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
 * Renamed from fhK
 */
public final class fhk_0 {
    private static final Logger spW = Logger.getLogger(fhk_0.class);
    private static final fiH<ra_0<rf_0>> spX = eTr.b((short)30, (short)67, (short)38, (short)15);
    private static final fiH<ra_0<rd_0>> spY = eTr.a((short)100, (short)100, (short)100, (short)32);
    private static final fiH<ra_0<rd_0>> spZ = eTr.a((short)100, (short)100, (short)100, (short)0);
    private static final int sqa = 15;

    private fhk_0() {
    }

    @Nullable
    public static fhi_0 g(@NotNull lc_0 lc_02) {
        if (lc_02.ahr() == null) {
            return null;
        }
        fhi_0 fhi_02 = new fhi_0();
        lc_02.ahr().forEach(lj_02 -> fhk_0.a(fhi_02, (byte)lj_02.Lz(), fhk_0.e(lj_02)));
        fhi_02.VE(lc_02.ahy());
        fhi_02.VF(lc_02.ahA());
        fhi_02.gE((byte)lc_02.ahC());
        return fhi_02;
    }

    public static fhi_0 d(@NotNull yd_2 yd_22) {
        fhi_0 fhi_02 = new fhi_0();
        yd_22.alb.forEach(yf_12 -> fhk_0.a(fhi_02, yf_12.Tg, fhk_0.a(yf_12)));
        fhi_02.VE(yd_22.ald);
        fhi_02.VF(yd_22.ale);
        fhi_02.gE(yd_22.alf);
        yd_22.alc.forEach(ye_22 -> fhi_02.a(fgg_0.UZ(ye_22.alg), ye_22.alh));
        return fhi_02;
    }

    public static fhn_0 e(@NotNull lj_0 lj_02) {
        return new fhn_0(lj_02.air(), (byte)lj_02.ait(), lj_02.aiv());
    }

    public static fhn_0 a(@NotNull yf_1 yf_12) {
        return new fhn_0(yf_12.alj, yf_12.alk, yf_12.all);
    }

    public static void a(fhi_0 fhi_02, byte by, fhn_0 fhn_02) {
        if (fhn_02.dSU() < 0) {
            return;
        }
        fhi_02.a(by, fhn_02);
    }

    public static short cQ(@NotNull ffV ffV2) {
        Object object;
        short s = fhk_0.cR(ffV2);
        int n = fhk_0.cS(ffV2);
        if (ffV2.dXg()) {
            object = ffV2.eAZ();
            ((fhi_0)object).f(fgg_0.sir);
            ((fhi_0)object).f(fgg_0.sis);
        }
        if ((object = ffV2.dOg()) == null || !((fhc_0)object).fYy()) {
            fhi_0 fhi_02 = new fhi_0();
            fhi_02.VF(n);
            ffV2.a(fhi_02);
            return s;
        }
        boolean bl = ffV2.dXg() && ffV2.eAZ().fYJ() < 0;
        fhk_0.a(ffV2, spX);
        ffV2.eAZ().VF(n);
        return s;
    }

    static short cR(@NotNull ffV ffV2) {
        if (!ffV2.dXg()) {
            return 0;
        }
        fhi_0 fhi_02 = ffV2.eAZ();
        short s = 0;
        for (fhn_0 fhn_02 : fhi_02.dTS().values()) {
            if (!fhn_02.fYK()) continue;
            int n = fhn_02.air();
            s = (short)(s + fhk_0.j(ffV2, n));
        }
        return s;
    }

    public static int cS(@NotNull ffV ffV2) {
        if (!ffV2.dXg()) {
            return 0;
        }
        fhi_0 fhi_02 = ffV2.eAZ();
        int n = fhi_02.ahA();
        Map<fgg_0, Integer> map = fhi_02.fYP();
        if (map.isEmpty()) {
            return n;
        }
        for (Map.Entry<fgg_0, Integer> entry : map.entrySet()) {
            fgg_0 fgg_02 = entry.getKey();
            Integer n2 = entry.getValue();
            if (fgg_02 == null || n2 == null || n2 <= 0 || fgg_02 != fgg_0.sir && fgg_02 != fgg_0.sis) continue;
            n = n2;
        }
        return n;
    }

    public static boolean cT(@NotNull ffV ffV2) {
        fhi_0 fhi_02 = ffV2.eAZ();
        fhi_0 fhi_03 = fhk_0.cU(ffV2);
        for (int i = 0; fhi_02.d(fhi_03) && i < 15; ++i) {
            fhi_03 = fhk_0.cU(ffV2);
        }
        ffV2.a(fhi_03);
        return !fhi_02.d(fhi_03);
    }

    private static fhi_0 cU(@NotNull ffV ffV2) {
        fhi_0 fhi_02 = ffV2.eAZ().fYR();
        Map<Byte, fhn_0> map = fhi_02.dTS();
        ArrayList<Byte> arrayList = new ArrayList<Byte>(map.keySet());
        Collections.shuffle(arrayList);
        HashMap<Byte, fhn_0> hashMap = new HashMap<Byte, fhn_0>();
        for (byte by = 0; by < arrayList.size(); by = (byte)(by + 1)) {
            Byte by2 = (Byte)arrayList.get(by);
            hashMap.put(by, map.get(by2));
        }
        fhi_02.O(hashMap);
        return fhi_02;
    }

    public static void cV(@NotNull ffV ffV2) {
        fhk_0.a(ffV2, spX);
    }

    public static void a(@NotNull ffV ffV2, @NotNull fiH<ra_0<rf_0>> fiH2) {
        fhi_0 fhi_02 = ffV2.dXg() ? ffV2.eAZ() : new fhi_0();
        fhi_02.O(new HashMap<Byte, fhn_0>());
        byte by = fhk_0.a(ffV2.dOg(), fiH2);
        for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
            fhi_02.dTS().put(by2, new fhn_0(fhk_0.fYU().orElse(rd_0.bjA)));
        }
        ffV2.a(fhi_02);
    }

    public static boolean cW(@NotNull ffV ffV2) {
        if (!ffV2.dXg()) {
            return false;
        }
        fhc_0 fhc_02 = ffV2.dOg();
        byte by = fhk_0.o(fhc_02);
        return fhk_0.i(ffV2, by);
    }

    public static void cX(@NotNull ffV ffV2) {
        if (!ffV2.dXg()) {
            return;
        }
        if (ffV2.fVX() >= ffV2.dOg().cpA()) {
            return;
        }
        fhk_0.i(ffV2, ffV2.fVX() + 1);
    }

    private static boolean i(@NotNull ffV ffV2, int n) {
        fhi_0 fhi_02 = ffV2.eAZ();
        int n2 = fhi_02.fYI();
        if (n <= n2) {
            return false;
        }
        for (int i = 0; i < n - n2; ++i) {
            byte by = (byte)(i + n2);
            fhi_02.a(by, new fhn_0(fhk_0.fYU().orElse(rd_0.bjA)));
        }
        return true;
    }

    public static byte o(@NotNull fhc_0 fhc_02) {
        return fhk_0.a(fhc_02, spX);
    }

    public static byte a(@NotNull fhc_0 fhc_02, @NotNull fiH<ra_0<rf_0>> fiH2) {
        Optional<ra_0<rf_0>> optional = fiH2.fZY();
        if (optional.isEmpty()) {
            return 0;
        }
        rf_0 rf_02 = optional.get().bdm();
        byte by = rf_02.aJr();
        byte by2 = fhc_02.cpz();
        byte by3 = fhc_02.cpA();
        if (by > by3) {
            return by3;
        }
        if (by < by2) {
            return by2;
        }
        return by;
    }

    private static Optional<rd_0> fYU() {
        Optional<ra_0<rd_0>> optional = spY.fZY();
        return optional.map(ra_0::bdm);
    }

    public static boolean cY(ffV ffV2) {
        fhi_0 fhi_02 = ffV2.eAZ();
        fhi_0 fhi_03 = fhi_02.fYR();
        fhi_03.dTS().values().forEach(fhn_02 -> fhk_0.fYU().ifPresent(fhn_02::l));
        for (int i = 0; fhi_02.d(fhi_03) && i < 15; ++i) {
            fhi_03.dTS().values().forEach(fhn_02 -> fhk_0.fYU().ifPresent(fhn_02::l));
        }
        ffV2.a(fhi_03);
        return !fhi_02.d(fhi_03);
    }

    public static void b(@NotNull ffV ffV2, @NotNull ffV ffV3) {
        fhi_0 fhi_02 = ffV2.dXg() ? ffV2.eAZ() : new fhi_0();
        fhp_0 fhp_02 = ffV3.dCC();
        if (fhp_02.dCF() == fhr_0.sqz) {
            fhi_02.VE(ffV3.avr());
        } else {
            fhi_02.VF(ffV3.avr());
        }
        ffV2.a(fhi_02);
    }

    public static fhq_0 c(ffV ffV2, ffV ffV3) {
        if (ffV2 == null) {
            return fhq_0.sqm;
        }
        if (ffV3 == null) {
            return fhq_0.sql;
        }
        if (ffV2.LV() == ffV3.LV()) {
            return fhq_0.sqr;
        }
        if (ffV2.bfd() > 1) {
            return fhq_0.sqn;
        }
        fhp_0 fhp_02 = ffV3.dCC();
        if (fhp_02 == null) {
            return fhq_0.sqo;
        }
        fhr_0 fhr_02 = fhp_02.dCF();
        if (!fhr_02.aA(ffV2)) {
            return fhq_0.squ;
        }
        if (fhr_02 == fhr_0.sqz) {
            if (!ffV2.dXg()) {
                return fhq_0.sqp;
            }
            fhi_0 fhi_02 = ffV2.eAZ();
            boolean bl = fhk_0.a(fhi_02, fhp_02);
            if (fhi_02.ahy() == ffV3.avr()) {
                return fhq_0.sqs;
            }
            return bl ? (fhi_02.fYQ() ? fhq_0.sqt : fhq_0.sqk) : fhq_0.sqq;
        }
        if (!ffV2.dXg()) {
            fhc_0 fhc_02 = ffV2.dOg();
            if (fhc_02.fYy()) {
                return fhq_0.sqo;
            }
            if (!fhc_02.dGh().v(ffS.sgR) && !fhc_02.dGh().v(ffS.sgS)) {
                return fhq_0.sqo;
            }
            return fhq_0.sqk;
        }
        fhi_0 fhi_03 = ffV2.eAZ();
        if (!fhi_03.fYP().isEmpty()) {
            return fhq_0.sqv;
        }
        if (fhi_03.ahA() == ffV3.avr()) {
            return fhq_0.sqs;
        }
        return fhi_03.dXi() ? fhq_0.sqt : fhq_0.sqk;
    }

    public static boolean a(@NotNull fhi_0 fhi_02, @NotNull fhp_0 fhp_02) {
        rd_0[] rd_0Array = fhp_02.fZe();
        if (rd_0Array.length == 0) {
            return true;
        }
        if (rd_0Array.length > fhi_02.dTS().size()) {
            return false;
        }
        for (int i = 0; i < fhi_02.dTS().size(); ++i) {
            boolean bl = true;
            for (int j = 0; j < rd_0Array.length; ++j) {
                int n = i + j;
                if (!fhi_02.dTS().containsKey((byte)n)) {
                    bl = false;
                    break;
                }
                fhn_0 fhn_02 = fhi_02.dTS().get((byte)n);
                rd_0 rd_02 = fhn_02.dBe();
                if (rd_02 == rd_0.bjE || rd_0Array[j] == rd_0.bjA || rd_02 == rd_0Array[j]) continue;
                bl = false;
                break;
            }
            if (!bl) continue;
            return true;
        }
        return false;
    }

    public static boolean a(@NotNull fhi_0 fhi_02, byte by) {
        if (!fhi_02.fYQ()) {
            return false;
        }
        fhi_0 fhi_03 = fhi_02.fYR();
        fhn_0 fhn_02 = fhi_03.gC(by);
        if (fhn_02 == null) {
            return false;
        }
        Object r = fgD.fXh().Vd(fhi_02.ahy());
        if (r == null) {
            return false;
        }
        fhp_0 fhp_02 = ((fhc_0)r).dCC();
        if (fhp_02 == null) {
            return false;
        }
        fhn_02.l(rd_0.bjA);
        return !fhk_0.a(fhi_03, fhp_02);
    }

    static short j(@NotNull ffV ffV2, int n) {
        Object r = fgD.fXh().Vd(n);
        if (r == null) {
            return 0;
        }
        short s = ((fhc_0)r).cmL();
        short s2 = s > 10 ? (short)(s - 10) : s;
        short s3 = s > 10 ? (short)200 : 0;
        short s4 = ffV2.cmL();
        short s5 = s3;
        s5 = (short)(s5 + fhk_0.a(s4, s2, fgj.siB));
        s5 = (short)(s5 + fhk_0.a(s4, s2, fgj.siC));
        s5 = (short)(s5 + fhk_0.a(s4, s2, fgj.siD));
        s5 = (short)(s5 + fhk_0.a(s4, s2, fgj.siE));
        return s5;
    }

    private static short a(short s, short s2, fgj fgj2) {
        short s3 = fhk_0.b(s2, fgj2);
        if (s3 <= 0) {
            return 0;
        }
        double d2 = fhB.a(s, fgj2);
        return GC.cu((long)Math.floor(d2 * 100.0 / (double)fgj2.fWM() * (double)s3));
    }

    private static short b(short s, fgj fgj2) {
        switch (fgj2) {
            case siB: {
                return 1;
            }
            case siC: {
                if (s >= 5) {
                    return 6;
                }
                if (s == 4) {
                    return 4;
                }
                if (s == 3) {
                    return 2;
                }
                if (s == 2) {
                    return 1;
                }
                if (s == 1) {
                    return 0;
                }
                return 0;
            }
            case siD: {
                if (s >= 7) {
                    return 4;
                }
                if (s == 6) {
                    return 2;
                }
                return 0;
            }
            case siE: {
                if (s == 10) {
                    return 6;
                }
                if (s == 9) {
                    return 4;
                }
                if (s == 8) {
                    return 2;
                }
                return 0;
            }
        }
        return 0;
    }

    public static byte[] e(fhi_0 fhi_02) {
        if (fhi_02 == null) {
            return Bv.auq;
        }
        le_0 le_02 = fga_0.b(fhi_02);
        if (le_02 == null) {
            spW.fatal((Object)("Unable to serialize Shards :" + String.valueOf(fhi_02)));
            return Bv.auq;
        }
        return le_02.ahK().toByteArray();
    }

    public static fhi_0 eQ(byte[] byArray) {
        try {
            lc_0 lc_02 = lc_0.bO(byArray);
            return fga_0.f(lc_02);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            spW.fatal((Object)"Unable to unserialize Shards from proto", (Throwable)invalidProtocolBufferException);
            return null;
        }
    }

    public static int a(@NotNull fho_0 fho_02, @NotNull fho_0 fho_03) {
        int n = fho_03.aiv() - fho_02.aiv();
        if (n >= 0) {
            return n;
        }
        return (int)Math.ceil((double)n * 0.9);
    }

    public static int cZ(@NotNull ffV ffV2) {
        if (!ffV2.dXg()) {
            return 0;
        }
        int n = 0;
        for (fhn_0 fhn_02 : ffV2.eAZ().dTS().values()) {
            n += fhk_0.a(fho_0.i(fhn_02), fho_0.sqd);
        }
        return -n;
    }

    public static int l(@NotNull ffV ffV2, boolean bl) {
        if (!ffV2.dXg()) {
            return 0;
        }
        return bl ? ffV2.eAZ().ahA() : ffV2.eAZ().ahy();
    }
}

