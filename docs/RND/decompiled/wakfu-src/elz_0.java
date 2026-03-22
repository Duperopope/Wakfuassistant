/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eLz
 */
public class elz_0
extends abl_1 {
    private static final double qGY = 30.0;

    public elz_0(short s, elt_0 elt_02) {
        super(elz_0.a(s, elt_02), (double)elt_02.fzH() / 8.0);
    }

    public static double a(short s, elt_0 elt_02) {
        double d2 = GC.b((double)(elt_02.dxy() - s), 0.0, 30.0);
        return d2 * (double)(elt_02.fzH() - 1) / 30.0;
    }
}

