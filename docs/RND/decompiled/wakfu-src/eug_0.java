/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collection;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eUG
 */
public final class eug_0 {
    private eug_0() {
    }

    public static <T extends exP> boolean a(euc_0<T> euc_02, exP exP3) {
        if (!exP3.i(ezj_0.pux)) {
            return true;
        }
        byte by = exP3.bcP();
        boolean bl = euc_02.dGs().stream().filter(exP2 -> exP2.bcP() != by).anyMatch(exP2 -> exP2.i(ezj_0.puv));
        return !bl;
    }

    public static <T extends exP> boolean a(euc_0<T> euc_02, T t, byte by) {
        if (t.aFW() == 1) {
            return true;
        }
        for (exP exP2 : euc_02.dGs()) {
            byte by2;
            if (exP2.bcP() != by || exP2.i(ezj_0.puv) || (by2 = exP2.aFW()) != 1) continue;
            return false;
        }
        return true;
    }

    public static <T extends exP> boolean a(eub_0<T> eub_02, T t, byte by) {
        if (eub_02.dGo().fLo()) {
            return true;
        }
        if (!(t instanceof Vg)) {
            return true;
        }
        Vg vg2 = (Vg)((Object)t);
        if (!vg2.a(Vf.bxK)) {
            return true;
        }
        long l = vg2.b(Vf.bxK);
        Optional<Byte> optional = eub_02.dGs().stream().filter(Vg.class::isInstance).map(Vg.class::cast).filter(vg -> vg.a(Vf.bxK)).filter(vg -> vg.b(Vf.bxK) == l).findFirst().map(vg -> ((euc_1)((Object)vg)).bcP());
        if (optional.isEmpty()) {
            return true;
        }
        Byte by2 = optional.get();
        return by2 == by;
    }

    public static <T extends exP> boolean b(eub_0<T> eub_02, T t, byte by) {
        if (eub_02.dGo().fLp()) {
            return true;
        }
        if (t == null) {
            return true;
        }
        fse_0 fse_02 = ((fsf)fsf.gkM()).mC(t.aqZ());
        if (!fse_02.eqw()) {
            return true;
        }
        fjo_0 fjo_02 = t.ffF().ems();
        if (fjo_02 == null) {
            return true;
        }
        boolean bl = t.i(ezj_0.puz);
        boolean bl2 = t.i(ezj_0.puA);
        Collection collection = eub_02.bL(by);
        for (exP exP2 : collection) {
            if (exP2 == null) continue;
            boolean bl3 = bl && exP2.i(ezj_0.puA);
            if (!(bl3 = bl3 || bl2 && exP2.i(ezj_0.puz))) continue;
            return false;
        }
        return true;
    }

    public static <T extends exP> euf_0 c(eub_0<T> eub_02, T t, byte by) {
        boolean bl;
        if (!eub_02.dGo().fLq()) {
            return euf_0.rxi;
        }
        foP foP2 = null;
        byte by2 = -1;
        for (exP exP2 : eub_02.dGs()) {
            foP2 = eug_0.bo(exP2);
            if (foP2 == null) continue;
            by2 = exP2.bcP();
            break;
        }
        if (foP2 == null) {
            return euf_0.rxi;
        }
        boolean bl2 = by == by2;
        boolean bl3 = eug_0.a(foP2, t) && foP2.gfT() != 0;
        boolean bl4 = bl = eug_0.b(foP2, t) && foP2.gfT() != 0;
        if (bl2 && bl) {
            return euf_0.rxo;
        }
        if (!bl2 && bl3) {
            return euf_0.rxp;
        }
        return euf_0.rxi;
    }

    private static <T extends exP> boolean a(foP foP2, T t) {
        fkc_0 fkc_02 = t.ffF().ems().gbD().WO(foP2.gfT());
        return fkc_02 == fkc_0.sAp;
    }

    private static <T extends exP> boolean b(foP foP2, T t) {
        fkc_0 fkc_02 = t.ffF().ems().gbD().WO(foP2.gfT());
        return fkc_02 == fkc_0.sAo;
    }

    @Nullable
    private static <T extends exP> foP bo(T t) {
        if (t.aFW() != 1) {
            return null;
        }
        return t.doW();
    }
}

