/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ME
 */
public final class me_1 {
    private static final double aWw = 100.0;
    private static final double aWx = 1.5;
    private static final double aWy = 2.2;
    private static final double aWz = 630.0;
    private static final double aWA = 20.0;
    private static final double aWB = 4.0;
    private static final double aWC = 2.0;
    private static final double aWD = 21.0;
    private static final double aWE = 1.0;
    private static final double aWF = 8860.0;

    private me_1() {
    }

    public static long L(short s) {
        double d2 = 100.0 * (double)s + 1.5 * StrictMath.pow(s, 2.2);
        if (s < 57) {
            return Math.round(d2 + 630.0 * StrictMath.pow((double)s / 20.0, 4.0));
        }
        return Math.round(8860.0 * StrictMath.pow(2.0, (double)s / 21.0));
    }
}

