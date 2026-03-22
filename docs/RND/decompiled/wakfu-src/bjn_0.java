/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJn
 */
public final class bjn_0 {
    private bjn_0() {
    }

    static String b(fnl_0 fnl_02) {
        fov_0 fov_03 = fnl_02.geL();
        int n = fnl_02.agK();
        if (!fnl_02.geL().gfz()) {
            foA foA2 = foC.sLW.aF(n);
            if (foA2 != null) {
                return foA2.aXE();
            }
            Optional<fov_0> optional = foy_0.sLJ.XT(n);
            return optional.map(fov_02 -> String.valueOf(fov_02.aVt())).orElseGet(() -> String.valueOf(fov_03.aVt()));
        }
        fos_0 fos_02 = fou_0.sLB.aA(n);
        if (fos_02 != null) {
            return fos_02.aXE();
        }
        int n2 = fov_03.aVt();
        fos_0 fos_03 = fou_0.sLB.az(n2);
        return fos_03.aXE();
    }

    public static String a(fov_0 fov_03, int n) {
        if (!fov_03.gfz()) {
            foA foA2 = foC.sLW.aF(n);
            if (foA2 != null) {
                return foA2.aXE();
            }
            Optional<fov_0> optional = foy_0.sLJ.XT(n);
            return optional.map(fov_02 -> String.valueOf(fov_02.aVt())).orElseGet(() -> String.valueOf(fov_03.aVt()));
        }
        fos_0 fos_02 = fou_0.sLB.aA(n);
        if (fos_02 != null) {
            return fos_02.aXE();
        }
        int n2 = fov_03.aVt();
        fos_0 fos_03 = fou_0.sLB.az(n2);
        return fos_03.aXE();
    }

    public static void a(fnl_0 fnl_02, bdf_1 bdf_12, int n, @Nullable fow_0 fow_02, bhJ bhJ2) {
        Object r;
        if (bdf_12 == null) {
            return;
        }
        if (n <= 0) {
            bdf_12.lf(bjn_0.b(fnl_02));
            bdf_12.dcE();
            bjn_0.a(bdf_12, fow_02);
            bjn_0.a((ZC)bdf_12, bhJ2);
            bdf_12.bpC();
            return;
        }
        boolean bl = foy_0.sLJ.XS(n);
        bdf_12.lf(bjn_0.b(fnl_02));
        bdf_12.dcE();
        if (bl && (r = fgD.fXh().Vd(n)) != null) {
            bdf_12.Bx(((fhc_0)r).aVt());
        }
        bjn_0.a(bdf_12, fow_02);
        bjn_0.a((ZC)bdf_12, bhJ2);
        bdf_12.bpC();
    }

    private static void a(bdf_1 bdf_12, @Nullable fow_0 fow_02) {
        if (fow_02 != null) {
            fow_02.d((TIntObjectProcedure<axb_2>)((TIntObjectProcedure)(n, axb_22) -> {
                bdf_12.a(n, axb_22.bQj());
                return true;
            }));
        }
    }

    public static void a(ZC zC, bhJ bhJ2) {
        if (bhJ2 == null || zC == null) {
            return;
        }
        bhJ2.d(zC, false);
        aJq.a(zC, bhJ2.dpI().Yc(), "blason", null);
    }

    public static int[] a(@NotNull fov_0 fov_02) {
        int[] nArray = (int[])fov_02.gfC().clone();
        if (nArray.length <= 1) {
            return nArray;
        }
        int n = fov_02.gfD();
        for (int i = 1; i < nArray.length; ++i) {
            if (nArray[i] != n) continue;
            int n2 = nArray[0];
            nArray[0] = n;
            nArray[i] = n2;
        }
        return nArray;
    }
}

