/*
 * Decompiled with CFR 0.152.
 */
public class WD {
    public static int qp(int n) {
        return 64 / n;
    }

    public static int qq(int n) {
        return 32 / n;
    }

    public static int qr(int n) {
        return (1 << n) - 1;
    }

    public static int a(long[] lArray, int n, int n2) {
        int n3 = GC.mW(n2);
        int n4 = WD.qp(n3);
        long l = WD.qr(n3);
        long l2 = lArray[n / n4];
        return (int)((l2 >>= n3 * (n % n4)) & l);
    }

    public static int a(int[] nArray, int n, int n2) {
        int n3 = GC.mW(n2);
        int n4 = WD.qq(n3);
        int n5 = WD.qr(n3);
        int n6 = nArray[n / n4];
        return (n6 >>= n3 * (n % n4)) & n5;
    }

    public static int[] a(int[] nArray, int n, apl_1 apl_12) {
        return apl_12.mx(n);
    }

    public static long[] a(long[] lArray, int n, apl_1 apl_12) {
        long[] lArray2 = new long[n];
        for (int i = 0; i < n; ++i) {
            lArray2[i] = apl_12.bFQ();
        }
        return lArray2;
    }

    public static void a(int[] nArray, fs_0 fs_02) {
        for (int i = 0; i < nArray.length; ++i) {
            fs_02.mz(nArray[i]);
        }
    }

    public static void a(long[] lArray, fs_0 fs_02) {
        for (int i = 0; i < lArray.length; ++i) {
            fs_02.cq(lArray[i]);
        }
    }

    public static int[] b(int[] nArray, int n) {
        int n2 = GC.mW(n);
        int n3 = WD.qq(n2);
        int n4 = WD.qr(n2);
        int n5 = (int)Math.ceil((double)nArray.length / (double)n3);
        int[] nArray2 = new int[n5];
        for (int i = 0; i < nArray.length; ++i) {
            int n6;
            int n7 = n6 = i / n3;
            nArray2[n7] = nArray2[n7] | (nArray[i] & n4) << n2 * (i % n3);
        }
        return nArray2;
    }

    public static long[] c(int[] nArray, int n) {
        int n2 = GC.mW(n);
        int n3 = WD.qp(n2);
        long l = WD.qr(n2);
        int n4 = (int)Math.ceil((double)nArray.length / (double)n3);
        long[] lArray = new long[n4];
        for (int i = 0; i < nArray.length; ++i) {
            int n5;
            int n6 = n5 = i / n3;
            lArray[n6] = lArray[n6] | ((long)nArray[i] & l) << n2 * (i % n3);
        }
        return lArray;
    }

    public static void main(String[] stringArray) {
    }
}

