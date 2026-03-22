/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public final class eJW {
    private static final Logger qAW = Logger.getLogger(eJW.class);

    private eJW() {
    }

    public static Optional<eIi> as(exP exP2) {
        if (!exP2.a(eyp_0.pmQ) || exP2.doC() == null) {
            return Optional.empty();
        }
        return eJW.a(exP2.Xi(), exP2.cmL(), exP2.doC());
    }

    public static Optional<eIi> z(eJS eJS2) {
        return eJW.a(eJS2.Xi(), eJS2.cmL(), eJS2.dme());
    }

    private static Optional<eIi> a(long l, short s, fgd_0 fgd_02) {
        short s2 = fcL.rUh.sB(l);
        boolean bl = fgd_02.a(ffV2 -> ffV2.adO() || ffV2.cmL() <= s2 || ffV2.c(fgg_0.sij));
        eIi eIi2 = eIi.dC((short)Math.min(s, s2));
        if (eIi2.cmL() <= s && (!bl || fgd_02.aJG())) {
            if (fhs.eW(eIi2.cmL()).fXL().isEmpty()) {
                return Optional.empty();
            }
            return Optional.of(eIi2);
        }
        return Optional.empty();
    }

    public static ffV d(ffS ffS2, int n) {
        return ffV.a(GC.s(ffS2.shb, n), fgD.fXh().Vd(n));
    }

    public static Optional<eJK> a(@NotNull exP exP2, @NotNull exP exP3, @NotNull ffV ffV2, byte by, boolean bl) {
        if (!ffV2.adO() && ffV2.cmL() > fcL.rUh.sB(exP2.Xi())) {
            return Optional.of(eJK.qAp);
        }
        if (ffV2.adZ() && ffV2.fUY().fXu().fXx()) {
            return Optional.of(eJK.qAq);
        }
        if (!ffV2.dOg().fbT() || !ffV2.dOg().v(ffS.gj(by))) {
            return Optional.of(eJK.qAr);
        }
        if (bl && ffV2.dOg().a(ffj_0.sge) != null && !ffV2.dOg().a(ffj_0.sge).b(exP3, exP3, ffV2, exP3.bdV())) {
            return Optional.of(eJK.qAt);
        }
        if (ffV2.bfd() > 1) {
            return Optional.of(eJK.qAv);
        }
        if (!ffq_0.cC(ffV2)) {
            return Optional.of(eJK.qAu);
        }
        if (!ffV2.adO() && exP3.cmL() < ffV2.cmL()) {
            return Optional.of(eJK.qAp);
        }
        return Optional.empty();
    }

    @NotNull
    public static Optional<eJK> a(@NotNull exP exP2, @NotNull exP exP3, @NotNull ffV ffV2, byte by) {
        if (exP2.djT() && exP2.dlK() != null && exP2.dlK().dGp() != etw_0.rqT) {
            return Optional.of(eJK.qAo);
        }
        if (exP2.a(ezj_0.ptS)) {
            return Optional.of(eJK.qAs);
        }
        Optional<eJK> optional = eJW.a(exP2, exP3, ffV2, by, true);
        if (optional.isPresent()) {
            return optional;
        }
        fgd_0 fgd_02 = exP3.doC();
        if (fgd_02 != null && fgd_02.gk(by)) {
            return Optional.of(eJK.qAw);
        }
        if (fgd_02 != null && fgd_02.dN(ffV2.LV()) != null) {
            qAW.error((Object)("[Companion] Item with unique ID " + ffV2.LV() + " is already present in companion " + String.valueOf(exP3) + " inventory (player = " + String.valueOf(exP2) + ";item=" + ffV2.fWz() + ")"));
            return Optional.of(eJK.qAx);
        }
        if (fgd_02 != null && !ffq_0.a(fgd_02, null, ffV2)) {
            return Optional.of(eJK.qAy);
        }
        return Optional.empty();
    }

    public static List<ffV> a(@NotNull exP exP2, @NotNull exP exP3, fgd_0 fgd_02) {
        ArrayList<ffV> arrayList = new ArrayList<ffV>();
        fgd_02.c((ffV2, n) -> {
            if (ffV2.apo() && eJW.a(exP2, exP3, ffV2, n.byteValue(), true).isPresent()) {
                arrayList.add((ffV)ffV2);
            }
        });
        return arrayList;
    }

    public static short A(eJS eJS2) {
        return (short)Math.min(fcL.rUh.sB(eJS2.Xi()), eJS2.cmL());
    }

    public static boolean b(eJS eJS2, ffV ffV2) {
        short s = eJW.A(eJS2);
        if (ffV2.adO() || ffV2.c(fgg_0.sij)) {
            return true;
        }
        if (ffV2.pe() && ffV2.fVV().cmL() > s) {
            return false;
        }
        return ffV2.cmL() <= s;
    }

    public static Map<Integer, ffV> B(eJS eJS2) {
        HashMap<Integer, ffV> hashMap = new HashMap<Integer, ffV>();
        eJS2.dme().c((ffV2, n) -> hashMap.put((Integer)n, (ffV)ffV2));
        return hashMap;
    }

    public static List<ffV> a(Map<Integer, ffV> map, fgd_0 fgd_02) {
        ArrayList<ffV> arrayList = new ArrayList<ffV>();
        map.forEach((n, ffV2) -> {
            ffV ffV3 = (ffV)fgd_02.ai(n.shortValue());
            if (ffV3 == null || ffV3.LV() != ffV2.LV()) {
                arrayList.add((ffV)ffV2);
            }
        });
        return arrayList;
    }
}

