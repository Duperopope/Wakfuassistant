/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from adQ
 */
public final class adq_0 {
    public static final float ckW = sm_0.bps.bfX();
    public static final float ckX = 1760.0f;
    public static final float ckY = 400.0f;
    public static final float ckZ = 600.0f;
    public static final float cla = 700.0f;
    public static final float clb = sm_0.bpt.bfX();
    public static final float clc = 1300.0f;
    private static float bWW = 1.0f;

    private adq_0() {
    }

    public static float bqv() {
        return bWW;
    }

    public static void bS(float f2) {
        bWW = f2;
    }

    public static adr_0 b(int[] nArray, int[] nArray2) {
        int n = nArray[2];
        int n2 = nArray2[2];
        boolean bl = wa_0.i(nArray[0], nArray[1], n);
        boolean bl2 = wa_0.i(nArray2[0], nArray2[1], n2);
        boolean bl3 = wa_0.g(nArray[0], nArray[1], n);
        boolean bl4 = wa_0.g(nArray2[0], nArray2[1], n2);
        boolean bl5 = wa_0.l(nArray[0], nArray[1], n);
        boolean bl6 = wa_0.l(nArray2[0], nArray2[1], n2);
        boolean bl7 = wa_0.k(nArray[0], nArray[1], n);
        boolean bl8 = wa_0.k(nArray2[0], nArray2[1], n2);
        if (bl && bl2 && Math.abs(n - n2) == 10) {
            return adr_0.clf;
        }
        if (bl3 || bl4) {
            return adr_0.clj;
        }
        if (bl5 && bl8) {
            return adr_0.cli;
        }
        if (bl7 && bl6) {
            return adr_0.clg;
        }
        if (bl7 && bl8) {
            return adr_0.clh;
        }
        return Math.abs(n - n2) > 2 ? adr_0.cle : adr_0.cld;
    }
}

