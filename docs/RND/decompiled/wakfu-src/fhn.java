/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class fhn {
    public static fhc a(long l, long l2, byte by, ffS ffS2, long l3, boolean bl) {
        Object t = fcL.rUh.sw(l2);
        fhm fhm2 = ((exP)t).dnO();
        if (fhm2 == null) {
            return fhc.snK;
        }
        fhk fhk2 = fhm2.gq(by);
        if (fhk2 == null) {
            return fhc.snL;
        }
        if (!bl && t.dlK() != null && t.dlK().dGp() != etw_0.rqT) {
            return fhc.snA;
        }
        fhe fhe2 = fhi.soc.aI(l, l2);
        if (fhe2 == null) {
            return fhc.snI;
        }
        fhc fhc2 = fhn.a(t, fhe2, fhk2, ffS2, l3, true, null);
        if (fhc2 == fhc.snm) {
            ((exP)t).f(((exP)t).dmQ());
        }
        return fhc2;
    }

    public fhc a(long l, long l2, byte by, long l3, boolean bl) {
        Object t = fcL.rUh.sw(l2);
        if (t == null) {
            return fhc.snG;
        }
        fhm fhm2 = ((exP)t).dnO();
        if (fhm2 == null) {
            return fhc.snK;
        }
        fhk fhk2 = fhm2.gq(by);
        if (fhk2 == null) {
            return fhc.snL;
        }
        ffV ffV2 = fgt.aG(l, l3);
        if (ffV2 == null) {
            return fhc.snH;
        }
        if (!bl && t.dlK() != null && t.dlK().dGp() != etw_0.rqT) {
            return fhc.snA;
        }
        if (fhi.soc.aI(l, l2) == null) {
            return fhc.snI;
        }
        if (!fhk2.bt(ffV2)) {
            return fhc.snU;
        }
        ffS ffS2 = fhk2.O(l3);
        if (ffS2 == null) {
            return fhc.snJ;
        }
        fhk2.a(Sn.e(Sj.bnN, ffV2, ffS2.aJr()));
        return fhc.snm;
    }

    public static void a(fhk fhk2, fhe fhe2) {
        if (fhe2 == null) {
            return;
        }
        Map<ffS, Long> map = fhk2.fUd();
        for (Map.Entry<ffS, Long> entry : map.entrySet()) {
            Long l = entry.getValue();
            if (fhe2.C(l)) continue;
            fhk2.O(l);
        }
    }

    public static void tB(long l) {
        Collection<fhm> collection = fhp.sop.tE(l);
        fhg fhg2 = fhi.soc.tx(l);
        for (fhm fhm2 : collection) {
            for (fhk fhk2 : fhm2.uv().values()) {
                fhn.a(fhk2, fhg2.tu(fhm2.KU()));
            }
        }
    }

    public static Bj<fhc, Boolean> a(@NotNull exP exP2, byte by, fhk fhk2, @Nullable fib fib2) {
        fhm fhm2 = exP2.dnO();
        if (fhm2 == null) {
            return Bj.c(fhc.snK);
        }
        fhk fhk3 = fhm2.gq(by);
        if (fhk3 == null) {
            return Bj.c(fhc.snL);
        }
        if (exP2.dlK() != null && exP2.dlK().dGp() != etw_0.rqT) {
            return Bj.c(fhc.snA);
        }
        fhe fhe2 = fhi.soc.aI(exP2.Xi(), exP2.Sn());
        if (fhe2 == null) {
            return Bj.c(fhc.snI);
        }
        boolean bl = true;
        fhk3.bw(fhk2.cmL());
        for (ffS ffS2 : ffS.sha) {
            Object object;
            Long l;
            Long l2 = fhk3.t(ffS2);
            if (Objects.equals(l2, l = fhk2.t(ffS2))) continue;
            if (l == null) {
                object = fgt.aG(exP2.Xi(), l2);
                if (object == null) {
                    bl = false;
                    continue;
                }
                if (fhk3.a(l2, fib2) != null) {
                    fhk3.a(Sn.e(Sj.bnN, object, ffS2.aJr()));
                    continue;
                }
                bl = false;
                continue;
            }
            object = fhn.a(exP2, fhe2, fhk3, ffS2, l, false, fib2);
            if (object == fhc.snm) continue;
            bl = false;
        }
        if (exP2.dnK().wM() == by) {
            exP2.f(exP2.dmQ());
        }
        return Bj.d(bl);
    }

    private static fhc a(@NotNull exP exP2, fhe fhe2, @NotNull fhk fhk2, ffS ffS2, long l, boolean bl, @Nullable fib fib2) {
        ffV ffV2 = fgt.aG(exP2.Xi(), l);
        fhc fhc2 = fgt.a(exP2, fhk2, ffS2, ffV2, true, false);
        if (fhc2 != fhc.snm) {
            return fhc2;
        }
        if (bl) {
            boolean bl2;
            boolean bl3 = bl2 = ffV2.dOg().a(ffj_0.sge) == null || ffV2.dOg().a(ffj_0.sge).b(exP2, exP2, ffV2, exP2.bdV());
            if (!bl2) {
                return fhc.snv;
            }
        }
        Set<ffS> set = fgt.e(exP2, fhk2, ffV2, ffS2);
        for (ffS ffS3 : set) {
            Long l2 = fhk2.t(ffS3);
            if (l2 == null || l2 <= 0L) continue;
            Optional<ffV> optional = fhe2.B(l2);
            fhk2.a(ffS3, fib2);
            fhk2.a(Sn.e(Sj.bnN, optional.orElse(null), ffS3.aJr()));
        }
        if (!fhe2.C(l) && !fhe2.b(l, fib2)) {
            return fhc.snS;
        }
        fhk2.c(ffS2, l);
        fhk2.a(Sn.a(Sj.bnN, ffV2, ffS2.aJr()));
        return fhc.snm;
    }
}

