/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ayJ
 */
public final class ayj_2 {
    public static short aD(byte by) {
        if (by < 0) {
            return (short)(256 + by);
        }
        return by;
    }

    public static byte e(byte[] byArray, int n) {
        return byArray[n];
    }

    public static short f(byte[] byArray, int n) {
        return (short)(ayj_2.aD(byArray[n]) | ayj_2.aD(byArray[n + 1]) << 8);
    }

    public static int g(byte[] byArray, int n) {
        return ayj_2.aD(byArray[n]) | ayj_2.aD(byArray[n + 1]) << 8 | ayj_2.aD(byArray[n + 2]) << 16 | ayj_2.aD(byArray[n + 3]) << 24;
    }

    public static byte c(byte[] byArray, azc_2<Integer> azc_22) {
        int n = azc_22.aTx();
        azc_22.L(n + 1);
        return ayj_2.e(byArray, n);
    }

    public static short d(byte[] byArray, azc_2<Integer> azc_22) {
        int n = azc_22.aTx();
        azc_22.L(n + 2);
        return ayj_2.f(byArray, n);
    }

    public static int e(byte[] byArray, azc_2<Integer> azc_22) {
        int n = azc_22.aTx();
        azc_22.L(n + 4);
        return ayj_2.g(byArray, n);
    }
}

