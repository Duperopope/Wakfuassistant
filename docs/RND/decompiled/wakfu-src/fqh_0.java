/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

/*
 * Renamed from fqh
 */
public final class fqh_0 {
    public static boolean a(fqg_0 fqg_02, fpW<?> fpW2, exx_1 exx_12, wg_0 wg_02, int n) {
        return fqh_0.a(fqg_02, fpW2, exx_12, wg_02, GC.aNL(), n);
    }

    public static boolean a(fqg_0 fqg_02, fpW<?> fpW2, exx_1 exx_12, wg_0 wg_02, Random random, int n) {
        short s = exx_12.D(fpW2.d(), fpW2.ghz());
        return s > 0 && random.nextDouble() < fqh_0.a(fqg_02, fpW2, s, wg_02, n);
    }

    public static double b(fqg_0 fqg_02, fpW<?> fpW2, exx_1 exx_12, wg_0 wg_02, int n) {
        short s = exx_12.D(fpW2.d(), fpW2.ghz());
        return fqh_0.a(fqg_02, fpW2, s, wg_02, n);
    }

    private static double a(fqg_0 fqg_02, fpW<?> fpW2, int n, wg_0 wg_02, int n2) {
        double d2 = fqh_0.YS(n);
        double d3 = fqh_0.a(fpW2, wg_02);
        double d4 = fqh_0.a(fqg_02, n2);
        return GC.b(d2 * d3 * d4, 0.0, 1.0);
    }

    private static double YS(int n) {
        return (double)n / 100.0;
    }

    private static double a(fpW<?> fpW2, wg_0 wg_02) {
        fqa_0 fqa_02 = fpW2.ghB();
        return wg_02 == wg_0.bMG || fqa_02 == fqa_0.sRE || fqa_02.ghI().contains((Object)wg_02) ? 1.0 : 0.8;
    }

    private static double a(fqg_0 fqg_02, int n) {
        return 1.0 + fqg_02.ON(n);
    }
}

