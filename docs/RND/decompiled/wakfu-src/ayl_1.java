/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ayl
 */
public class ayl_1 {
    public static ayi_1 a(ayi_1 ayi_12, ayi_1 ayi_13) {
        ayi_1 ayi_14 = new ayi_1();
        ayi_14.a(ayi_12);
        ayi_14.b(ayi_13);
        return ayi_14;
    }

    public static ayi_1 b(ayi_1 ayi_12, ayi_1 ayi_13) {
        ayi_1 ayi_14 = new ayi_1();
        ayi_14.a(ayi_12);
        ayi_14.d(ayi_13);
        return ayi_14;
    }

    public static ayi_1 c(ayi_1 ayi_12, ayi_1 ayi_13) {
        ayi_1 ayi_14 = new ayi_1();
        ayi_14.a(ayi_12);
        ayi_14.e(ayi_13);
        return ayi_14;
    }

    public static ayi_1 f(ayi_1 ayi_12) {
        ayi_1 ayi_13 = new ayi_1();
        int n = ayi_12.dso;
        int n2 = ayi_12.dsp;
        ayi_13.dso = n;
        ayi_13.dsp = n2;
        ayi_13.bjW = ayi_12.bjW;
        ayi_13.bjX = ayi_12.bjX;
        ayi_13.dsn = new boolean[n][];
        for (int i = 0; i < n; ++i) {
            ayi_13.dsn[i] = new boolean[n2];
            for (int j = 0; j < n2; ++j) {
                ayi_13.dsn[i][j] = !ayi_12.dsn[i][j];
            }
        }
        return ayi_13;
    }

    public static ayi_1 g(ayi_1 ayi_12) {
        ayi_1 ayi_13 = new ayi_1();
        int n = ayi_12.dso;
        int n2 = ayi_12.dsp;
        int n3 = n - 1;
        ayi_13.dso = n;
        ayi_13.dsp = n2;
        ayi_13.bjW = n - ayi_12.bjW - 1;
        ayi_13.bjX = ayi_12.bjX;
        ayi_13.dsn = new boolean[n][];
        for (int i = 0; i < n; ++i) {
            ayi_13.dsn[i] = (boolean[])ayi_12.dsn[n3 - i].clone();
        }
        return ayi_13;
    }

    public static ayi_1 h(ayi_1 ayi_12) {
        ayi_1 ayi_13 = new ayi_1();
        int n = ayi_12.dso;
        int n2 = ayi_12.dsp;
        int n3 = n2 - 1;
        ayi_13.dso = n;
        ayi_13.dsp = n2;
        ayi_13.bjW = ayi_12.bjW;
        ayi_13.bjX = n2 - ayi_12.bjX - 1;
        ayi_13.dsn = new boolean[n][];
        for (int i = 0; i < n; ++i) {
            ayi_13.dsn[i] = new boolean[n2];
            for (int j = 0; j < n2; ++j) {
                ayi_13.dsn[i][j] = ayi_12.dsn[i][n3 - j];
            }
        }
        return ayi_13;
    }

    public static ayi_1 i(ayi_1 ayi_12) {
        ayi_1 ayi_13 = new ayi_1();
        int n = ayi_12.dso;
        int n2 = ayi_12.dsp;
        int n3 = n - 1;
        int n4 = n2 - 1;
        ayi_13.dso = n;
        ayi_13.dsp = n2;
        ayi_13.bjW = n - ayi_12.bjW - 1;
        ayi_13.bjX = n2 - ayi_12.bjX - 1;
        ayi_13.dsn = new boolean[n][];
        for (int i = 0; i < n; ++i) {
            ayi_13.dsn[i] = new boolean[n2];
            int n5 = n3 - i;
            for (int j = 0; j < n2; ++j) {
                ayi_13.dsn[i][j] = ayi_12.dsn[n5][n4 - j];
            }
        }
        return ayi_13;
    }

    public static ayi_1 j(ayi_1 ayi_12) {
        ayi_1 ayi_13 = new ayi_1();
        int n = ayi_12.dsp;
        int n2 = ayi_12.dso;
        int n3 = n2 - 1;
        ayi_13.dso = n;
        ayi_13.dsp = n2;
        ayi_13.bjW = ayi_12.bjX;
        ayi_13.bjX = n3 - ayi_12.bjW;
        ayi_13.dsn = new boolean[n][];
        for (int i = 0; i < n; ++i) {
            ayi_13.dsn[i] = new boolean[n2];
            for (int j = 0; j < n2; ++j) {
                ayi_13.dsn[i][j] = ayi_12.dsn[n3 - j][i];
            }
        }
        return ayi_13;
    }

    public static ayi_1 k(ayi_1 ayi_12) {
        return ayl_1.i(ayi_12);
    }

    public static ayi_1 l(ayi_1 ayi_12) {
        ayi_1 ayi_13 = new ayi_1();
        int n = ayi_12.dsp;
        int n2 = ayi_12.dso;
        int n3 = n - 1;
        ayi_13.dso = n;
        ayi_13.dsp = n2;
        ayi_13.bjW = n3 - ayi_12.bjX;
        ayi_13.bjX = ayi_12.bjW;
        ayi_13.dsn = new boolean[n][];
        for (int i = 0; i < n; ++i) {
            ayi_13.dsn[i] = new boolean[n2];
            for (int j = 0; j < n2; ++j) {
                ayi_13.dsn[i][j] = ayi_12.dsn[j][n3 - i];
            }
        }
        return ayi_13;
    }
}

