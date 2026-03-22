/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from MF
 */
public final class mf_1 {
    private static final short aWG = 0;
    private static final short aWH = 32000;
    public static final mj_1 aWI = mk_1.a(mk_1.c(mf_1.aVb()).nJ(0).nK(32000));

    private static long[] aVb() {
        long[] lArray = new long[32000];
        lArray[0] = 0L;
        for (int i = 1; i < lArray.length; ++i) {
            lArray[i] = lArray[i - 1] + 1L;
        }
        return lArray;
    }

    private mf_1() {
    }
}

