/*
 * Decompiled with CFR 0.152.
 */
public class eLI {
    private static float c(elc_0 elc_02) {
        elt_0 elt_02 = elr_0.qGh.Rj(elc_02.rX());
        float f2 = elt_02.fzI();
        eLJ eLJ2 = new eLJ(f2);
        elc_02.b(eLJ2);
        return eLJ2.fzO();
    }

    public static boolean d(elc_0 elc_02) {
        float f2 = eLI.c(elc_02);
        return GC.aNL().nextDouble() * 100.0 < (double)f2;
    }
}

