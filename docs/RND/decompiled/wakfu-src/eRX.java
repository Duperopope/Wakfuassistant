/*
 * Decompiled with CFR 0.152.
 */
public class eRX {
    protected static double a(acd_1 acd_12, int[] nArray) {
        int n = nArray[0] - acd_12.getX();
        int n2 = nArray[1] - acd_12.getY();
        double d2 = Math.atan2(n2, n);
        double d3 = Math.toDegrees(d2);
        if (d3 < 0.0) {
            return 360.0 + d3;
        }
        return d3;
    }
}

