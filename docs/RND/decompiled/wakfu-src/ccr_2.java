/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cCR
 */
public final class ccr_2 {
    private static final String mSd = "logo";
    private static final int mSe = 3000;
    private static final int mSf = 1400;
    private static final int mSg = 1600;
    public static final float mSh = 0.95f;
    public static final float mSi = 1.0f;

    private ccr_2() {
    }

    public static void pi(String string) {
        fey_2 fey_22 = (fey_2)ccj_2.g(string, 532736L);
        fbt_1 fbt_12 = (fbt_1)fey_22.getElementMap().uH(mSd);
        fsh_2 fsh_22 = ccr_2.a(string, fbt_12);
        fyw_0.gqw().a(new ccs_2(string, fbt_12, fsh_22));
    }

    @NotNull
    private static fsh_2 a(String string, fbt_1 fbt_12) {
        fsh_2 fsh_22 = (fsr_22, fsg_22) -> {
            if (fsg_22 == fsg_2.veA) {
                fyw_0.gqw().tl(string);
            }
        };
        return (fsr_22, fsg_22) -> {
            if (fsg_22 == fsg_2.veA) {
                fbt_12.x(fse_2.class);
                fse_2 fse_22 = ccr_2.a(fbt_12, false, 1600);
                fse_22.a(fsh_22);
                fbt_12.a(fse_22);
            }
        };
    }

    static fse_2 a(fes_2 fes_22, boolean bl, int n) {
        float f2 = bl ? 0.0f : 1.0f;
        float f3 = bl ? 1.0f : 0.0f;
        return new fse_2(f2, f3, fes_22, 0, n, 1, abn.cdr);
    }
}

