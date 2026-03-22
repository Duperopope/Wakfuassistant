/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fqj
 */
public class fqj_0 {
    private static final int sSo = 75;
    private static final int sSp = 3;
    private static final int sSq = 1;

    public static boolean a(short s, short s2, short s3, int n) {
        if (n == 75) {
            return true;
        }
        return Math.abs(s2 - s3) <= s;
    }

    public static boolean gn(int n, int n2) {
        if (n2 == 75) {
            return n <= 3;
        }
        return n == 1;
    }

    public static int YU(int n) {
        if (n == 75) {
            return 3;
        }
        return 1;
    }
}

