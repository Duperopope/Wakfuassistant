/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public final class fhB {
    private static final float soZ = 2.0f;
    private static final double spa = 30.0;
    private static final int spb = 200;
    private static final float spc = 1.2f;
    private static final float spd = 1.0f;

    private fhB() {
    }

    public static Optional<Bu<Integer, Float>> fS(int n, int n2) {
        Object r = fgD.fXh().Vd(n);
        if (r == null) {
            return Optional.empty();
        }
        return fhB.a(r, n2, true);
    }

    public static Optional<Bu<Integer, Float>> cP(@NotNull ffV ffV2) {
        fhc_0 fhc_02 = ffV2.dOg();
        if (fhc_02 == null) {
            return Optional.empty();
        }
        short s = ffV2.bfd();
        return fhB.a(fhc_02, s, ffV2.fWs());
    }

    private static Optional<Bu<Integer, Float>> a(fhc_0 fhc_02, int n, boolean bl) {
        fgl fgl2 = fhc_02.fYu();
        if (fgl2 == fgl.siV) {
            return Optional.empty();
        }
        if (fhc_02.c(fgg_0.sil)) {
            return Optional.empty();
        }
        float f2 = fhc_02.fbT() ? (float)fhB.b(fhc_02, bl) : fhB.n(fhc_02);
        float f3 = (float)n * f2;
        int n2 = fgl2.AK();
        return Optional.of(new Bu<Integer, Float>(n2, Float.valueOf(f3)));
    }

    public static fhA f(ffV ffV2, exP exP2) {
        if (ffV2.dOg().fYu() == fgl.siV) {
            return fhA.soW;
        }
        if (ffV2.dOg().c(fgg_0.sil)) {
            return fhA.soW;
        }
        List<Long> list = ewo_0.oBF.o(ewr_0.oDC);
        if (list.contains(ffV2.dOg().d())) {
            return fhA.soW;
        }
        ang_2 ang_22 = ffV2.dOg().a(ffj_0.sgj);
        if (ang_22 != null && !ang_22.b(exP2, null, null, exP2.dmQ())) {
            return fhA.soW;
        }
        if (ffV2.dXg() && ffV2.eAZ().fYK()) {
            return fhA.soX;
        }
        return fhA.soV;
    }

    public static List<ffV> c(List<ffV> list, @NotNull exP exP2) {
        return list.stream().filter(ffV2 -> fhB.f(ffV2, exP2) == fhA.soV).toList();
    }

    private static double b(fhc_0 fhc_02, boolean bl) {
        double d2 = fhB.n(fhc_02);
        float f2 = bl ? 1.2f : 1.0f;
        return (double)f2 * d2;
    }

    private static float n(fhc_0 fhc_02) {
        return fhc_02.fYt() >= 0.0f ? fhc_02.fYt() : fhc_02.fYs();
    }

    public static double a(short s, fgj fgj2) {
        double d2 = fhB.eY(s);
        int n = fgj2.fWL();
        return d2 * (double)n * 2.0;
    }

    private static double eY(short s) {
        int n = GC.a((int)s, 0, 245);
        double d2 = (double)(n - 200) / 30.0;
        return StrictMath.pow(2.0, d2);
    }
}

