/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from MD
 */
final class md_1 {
    private static final int aWm = 98;
    private static final double aWn = 0.8;
    private static final int aWo = 170;
    private static final int aWp = 79;
    private static final double aWq = 1.25;
    private static final int aWr = 200;
    private static final double aWs = 1.35;
    private static final int aWt = 105;
    private static final int aWu = 119;
    private static final double aWv = 1.4;

    private md_1() {
    }

    public static double nF(int n) {
        if (n < 98) {
            return StrictMath.pow(n, 0.8);
        }
        if (n < 170) {
            return StrictMath.pow(n - 79, 1.25);
        }
        if (n < 200) {
            return StrictMath.pow(n - 105, 1.35);
        }
        return StrictMath.pow(n - 119, 1.4);
    }
}

