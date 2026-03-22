/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cae
 */
class cae_1 {
    private static final aai_1 lFh = new aai_1();
    private static final int lFi = 1;
    private static final int lFj = 2;
    private static final int lFk = 4;
    private static final int lFl = 8;
    private static final int lFm = 16;
    private static final int lFn = 32;
    private static final int lFo = 64;
    private static final int lFp = 128;

    cae_1() {
    }

    public static short JT(int n) {
        if (!lFh.vZ(n)) {
            return fsu.gy(1, 0);
        }
        return lFh.wr(n);
    }

    public static short a(short[][] sArray, int n, int n2) {
        int n3 = 0;
        n3 |= cae_1.b(sArray, n - 1, n2 - 1) ? 0 : 1;
        n3 |= cae_1.b(sArray, n + 0, n2 - 1) ? 0 : 2;
        n3 |= cae_1.b(sArray, n + 1, n2 - 1) ? 0 : 4;
        n3 |= cae_1.b(sArray, n - 1, n2 + 0) ? 0 : 8;
        n3 |= cae_1.b(sArray, n + 1, n2 + 0) ? 0 : 16;
        n3 |= cae_1.b(sArray, n - 1, n2 + 1) ? 0 : 32;
        n3 |= cae_1.b(sArray, n + 0, n2 + 1) ? 0 : 64;
        return cae_1.JT(n3 |= cae_1.b(sArray, n + 1, n2 + 1) ? 0 : 128);
    }

    public static boolean b(short[][] sArray, int n, int n2) {
        if (n < 0 || n >= sArray.length) {
            return true;
        }
        if (n2 < 0 || n2 >= sArray[n].length) {
            return true;
        }
        return sArray[n][n2] == fsu.tdo;
    }

    private static boolean c(short[][] sArray, int n, int n2) {
        return cae_1.b(sArray, n, n2) || fsu.aad(sArray[n][n2]).bWx() == 2;
    }

    private static void b(int n, int n2, int ... nArray) {
        short s = fsu.gy(1, n);
        lFh.c(n2, s);
        for (int n3 : nArray) {
            cae_1.b(n, n2 | n3, new int[0]);
            cae_1.b(n, n2 | n3, cae_1.f(nArray, n3));
        }
    }

    private static int[] f(int[] nArray, int n) {
        int[] nArray2 = new int[nArray.length - 1];
        int n2 = 0;
        for (int i = 0; i < nArray.length; ++i) {
            if (nArray[i] == n) continue;
            nArray2[n2++] = nArray[i];
        }
        return nArray2;
    }

    static {
        int[] nArray = new int[]{1, 32, 4, 128};
        int[] nArray2 = new int[]{32, 4, 128};
        cae_1.b(1, 0, nArray);
        cae_1.b(2, 16, nArray);
        cae_1.b(3, 64, nArray);
        cae_1.b(4, 9, nArray);
        cae_1.b(5, 8, nArray2);
        cae_1.b(6, 3, nArray);
        cae_1.b(7, 2, nArray2);
        cae_1.b(8, 19, nArray);
        cae_1.b(9, 18, nArray2);
        cae_1.b(10, 10, nArray);
        cae_1.b(11, 73, nArray);
        cae_1.b(12, 72, nArray2);
        cae_1.b(13, 80, nArray);
        cae_1.b(14, 74, nArray);
        cae_1.b(15, 26, nArray);
        cae_1.b(16, 83, nArray);
        cae_1.b(17, 82, nArray2);
        cae_1.b(18, 89, nArray);
        cae_1.b(19, 88, nArray2);
        cae_1.b(20, 25, nArray);
        cae_1.b(21, 24, nArray2);
        cae_1.b(22, 67, nArray);
        cae_1.b(23, 66, nArray2);
        cae_1.b(24, 90, nArray);
        cae_1.b(25, 17, nArray2);
        cae_1.b(26, 65, nArray2);
        cae_1.b(27, 1, nArray2);
    }
}

