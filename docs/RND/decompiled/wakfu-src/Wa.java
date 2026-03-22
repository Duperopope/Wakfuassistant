/*
 * Decompiled with CFR 0.152.
 */
public class Wa {
    public static final int bLZ = 18;
    public static final int bMa = 18;
    private static final double bMb = 0.5;

    private Wa() {
    }

    public static int qf(int n) {
        return vz_0.qd(n);
    }

    public static int qg(int n) {
        return vz_0.qe(n);
    }

    public static int qh(int n) {
        return (int)(((double)n + 0.5) * 18.0);
    }

    public static int qi(int n) {
        return (int)(((double)n + 0.5) * 18.0);
    }

    public static boolean aH(int n, int n2) {
        boolean bl = n % 18 == 0 || n % 18 == 17 || n % 18 == -1;
        boolean bl2 = n2 % 18 == 0 || n2 % 18 == 17 || n2 % 18 == -1;
        return bl || bl2;
    }
}

