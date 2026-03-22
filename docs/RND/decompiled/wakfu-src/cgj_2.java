/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGJ
 */
@fyf_0
public class cgj_2 {
    public static final String PACKAGE = "wakfu.passport";

    public static void setViewMode(fiq_1 fiq_12, String string) {
        int n = Bw.b((Object)string, 0);
        fse_1.gFu().f("passportViewMode", n);
    }

    public static void setCategory(fiq_1 fiq_12, String string) {
        int n = Bw.b((Object)string, 0);
        fse_1.gFu().f("passportCategory", n);
    }

    public static void previousSecretPage(fiq_1 fiq_12, bly_2 bly_22) {
        bly_22.dxo();
    }

    public static void nextSecretPage(fiq_1 fiq_12, bly_2 bly_22) {
        bly_22.dxp();
    }
}

