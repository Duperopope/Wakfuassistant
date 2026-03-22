/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fkb
 */
public final class fkb_0 {
    public static final int sAi = 6003720;
    public static final int sAj = 6005892;
    public static final int sAk = 0x5D22D5;
    public static final int sAl = 10006703;
    private static final int sAm = 600;
    public static final int sAn = 20;

    public static long WI(int n) {
        return (int)((double)((long)(-n) * 3600000L) / 600.0);
    }

    public static long ao(long l, int n) {
        return (int)((double)l - (double)l * ((double)n / 100.0));
    }

    public static int I(int n, long l) {
        double d2 = (double)(600L * l) / 3600000.0;
        return (int)Math.round((double)n + d2);
    }
}

