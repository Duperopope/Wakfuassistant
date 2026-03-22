/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cZC
 */
public final class czc_1 {
    private static final Logger obx = Logger.getLogger(czc_1.class);
    private static final int oby = 10;
    public static final int obz = 500;

    private czc_1() {
    }

    public static fhv_1 i(String string, long l) {
        fhv_1 fhv_12 = fyw_0.gqw().th(string);
        if (fhv_12 != null) {
            czc_1.i((fes_2)fhv_12);
            return fhv_12;
        }
        return czc_1.j(string, l);
    }

    public static fhv_1 j(String string, long l) {
        fyw_0.gqw().a(new czd_2(string));
        return ccj_2.g(string, l);
    }

    public static void qW(@NotNull String string) {
        czc_1.i((fes_2)fyw_0.gqw().th(string));
    }

    public static void i(@Nullable fes_2 fes_22) {
        if (fes_22 == null) {
            obx.warn((Object)"Cannot apply fadeIn : rootWidget is null");
            return;
        }
        fse_2 fse_22 = czc_1.b(fes_22, true);
        fes_22.x(fse_2.class);
        fes_22.a(fse_22);
        fes_22.x(fsb_2.class);
        fes_22.a(czc_1.c(fes_22, true));
        fes_22.setVisible(true);
    }

    public static void qX(String string) {
        czc_1.b(string, () -> fyw_0.gqw().tl(string));
    }

    public static void qY(String string) {
        fhv_1 fhv_12 = fyw_0.gqw().th(string);
        czc_1.a((fes_2)fhv_12, () -> {});
    }

    public static void b(String string, Runnable runnable) {
        fhv_1 fhv_12 = fyw_0.gqw().th(string);
        czc_1.a((fes_2)fhv_12, runnable);
    }

    private static void a(fes_2 fes_22, Runnable runnable) {
        if (fes_22 == null) {
            runnable.run();
            return;
        }
        fse_2 fse_22 = czc_1.b(fes_22, false);
        fse_22.a((fsr_22, fsg_22) -> {
            if (fsg_22 == fsg_2.veA) {
                runnable.run();
            }
        });
        fes_22.x(fse_2.class);
        fes_22.a(fse_22);
        fes_22.x(fsb_2.class);
        fes_22.a(czc_1.c(fes_22, false));
    }

    public static fse_2 b(fes_2 fes_22, boolean bl) {
        float f2 = bl ? 0.0f : 1.0f;
        float f3 = bl ? 1.0f : 0.0f;
        return new fse_2(f2, f3, fes_22, 0, 500, 1, abn.cdr);
    }

    public static fsa_2 a(fbt_1 fbt_12, boolean bl) {
        axb_2 axb_22 = czc_1.V(fbt_12);
        awx_2 awx_22 = new awx_2(axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), 0.0f);
        awx_2 awx_23 = new awx_2(axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), 1.0f);
        awx_2 awx_24 = bl ? awx_22 : awx_23;
        awx_2 awx_25 = bl ? awx_23 : awx_22;
        return new fsa_2(awx_24, awx_25, fbt_12.getAppearance(), 0, 500, 1, false, abn.cdr);
    }

    public static fsa_2 a(fbt_1 fbt_12, axb_2 axb_22) {
        return new fsa_2(czc_1.V(fbt_12), axb_22, fbt_12.getAppearance(), 0, 500, 1, false, abn.cdr);
    }

    @NotNull
    private static axb_2 V(fbt_1 fbt_12) {
        if (fbt_12.getModulationColor() != null) {
            return fbt_12.getModulationColor();
        }
        return awx_2.dnF;
    }

    private static fsb_2 c(fes_2 fes_22, boolean bl) {
        return new fsb_2(fes_22.getX(), fes_22.getY() + (bl ? -10 : 0), fes_22.getX(), fes_22.getY() + (bl ? 0 : -10), fes_22, 0, 500, abn.cdr);
    }
}

