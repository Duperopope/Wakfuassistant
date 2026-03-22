/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from VZ
 */
public class vz_0 {
    private static final int bLG = 18;
    private static final int bLH = 10;
    public static final int bLI = 18;
    public static final int bLJ = 18;
    public static final int bLK = 324;
    public static final int bLL = 64;
    public static final int bLM = 131071;
    public static final int bLN = 131071;
    public static final int bLO = 511;
    public static final int bLP = -131072;
    public static final int bLQ = -131072;
    public static final int bLR = -512;
    public static final int bLS = 7281;
    public static final int bLT = 7281;
    public static final int bLU = 511;
    public static final int bLV = -7281;
    public static final int bLW = -7281;
    public static final int bLX = -512;
    public static final int bLY = 4;

    public static int qd(int n) {
        return GC.B((float)n / 18.0f);
    }

    public static int qe(int n) {
        return GC.B((float)n / 18.0f);
    }

    public static aci_1 i(int n, int n2, int n3, int n4) {
        int n5 = vz_0.qd(n);
        int n6 = vz_0.qe(n2);
        int n7 = vz_0.qd(n + n3) + 1;
        int n8 = vz_0.qe(n2 + n4) + 1;
        return new aci_1(n5, n7, n6, n8);
    }
}

