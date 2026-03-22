/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eJk
 */
public class ejk_0 {
    public static boolean fxe() {
        return ewo_0.oBF.k(ewr_0.oFk);
    }

    public static int fxf() {
        return ewo_0.oBF.i(ewr_0.oFl);
    }

    public static boolean pJ(long l) {
        if (!ejk_0.fxe()) {
            return true;
        }
        int n = ejk_0.fxf();
        return evx_2.feo().a(l, eva_1.owq).flatMap(evv_22 -> ((eig_0)evv_22).fwJ()).map(s -> s >= n).orElse(false);
    }
}

