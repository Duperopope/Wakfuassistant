/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ayk
 */
public class ayk_1 {
    protected static final Logger dsy = Logger.getLogger(ayk_1.class);

    public static ayi_1 vr(int n) {
        ayi_1 ayi_12 = new ayi_1(n);
        for (int i = -n; i <= n; ++i) {
            int n2 = n - Math.abs(i);
            for (int j = -n2; j <= n2; ++j) {
                ayi_12.dsn[i + n][j + n] = true;
            }
        }
        return ayi_12;
    }

    public static ayi_1 vs(int n) {
        ayi_1 ayi_12 = new ayi_1(n);
        int n2 = ayi_12.dso;
        int n3 = (int)(((float)n + 0.5f) * ((float)n + 0.5f));
        for (int i = 0; i < n2; ++i) {
            int n4 = i - n;
            n4 *= n4;
            for (int j = 0; j < n2; ++j) {
                int n5 = j - n;
                ayi_12.dsn[i][j] = n4 + n5 * n5 < n3;
            }
        }
        return ayi_12;
    }

    public static ayi_1 cr(int n, int n2) {
        ayi_1 ayi_12 = ayk_1.vr(n);
        ayi_12.e(ayk_1.vr(n2));
        return ayi_12;
    }

    public static ayi_1 J(int n, int n2, int n3) {
        if (n3 > n) {
            n3 = n;
        }
        if (n3 > n2) {
            n3 = n2;
        }
        ayi_1 ayi_12 = new ayi_1(n, n2);
        for (int i = 0; i < n3; ++i) {
            int n4;
            for (n4 = i; n4 < ayi_12.dso; ++n4) {
                ayi_12.dsn[n4][i] = true;
            }
            for (n4 = i; n4 < ayi_12.dsp; ++n4) {
                ayi_12.dsn[i][n4] = true;
            }
        }
        return ayi_12;
    }

    public static ayi_1 cs(int n, int n2) {
        int n3;
        int n4;
        ayi_1 ayi_12 = new ayi_1();
        ayi_12.dso = n;
        ayi_12.dsp = n2;
        ayi_12.dsn = new boolean[n][];
        for (n4 = 0; n4 < n; ++n4) {
            ayi_12.dsn[n4] = new boolean[n2];
        }
        n4 = n2 / 2;
        for (n3 = 0; n3 < ayi_12.dso - 1; ++n3) {
            ayi_12.dsn[n3][n4] = true;
        }
        for (n3 = 0; n3 < ayi_12.dsp; ++n3) {
            ayi_12.dsn[ayi_12.dso - 1][n3] = true;
        }
        ayi_12.bjX = n4;
        return ayi_12;
    }

    public static ayi_1 ct(int n, int n2) {
        ayi_1 ayi_12 = new ayi_1(n, n2);
        double d2 = 1.0 / ((double)n + 0.5);
        double d3 = 1.0 / ((double)n2 + 0.5);
        for (int i = 0; i < ayi_12.dso; ++i) {
            double d4 = (double)(i - n) * d2;
            d4 *= d4;
            for (int j = 0; j < ayi_12.dsp; ++j) {
                double d5 = (double)(j - n2) * d3;
                ayi_12.dsn[i][j] = d4 + d5 * d5 < 1.0;
            }
        }
        return ayi_12;
    }

    public static ayi_1 cu(int n, int n2) {
        ayi_1 ayi_12 = new ayi_1(n, n2);
        for (int i = 0; i < ayi_12.dso; ++i) {
            for (int j = 0; j < ayi_12.dsp; ++j) {
                ayi_12.dsn[i][j] = true;
            }
        }
        return ayi_12;
    }

    public static ayi_1 vt(int n) {
        ayi_1 ayi_12 = new ayi_1(n);
        for (int i = 0; i < ayi_12.dso; ++i) {
            for (int j = 0; j < ayi_12.dsp; ++j) {
                ayi_12.dsn[i][j] = true;
            }
        }
        return ayi_12;
    }

    public static ayi_1 vu(int n) {
        ayi_1 ayi_12 = new ayi_1(n);
        int n2 = ayi_12.dso - 1;
        for (int i = 0; i < ayi_12.dso; ++i) {
            ayi_12.dsn[i][i] = true;
            ayi_12.dsn[n2 - i][i] = true;
        }
        return ayi_12;
    }

    public static ayi_1 vv(int n) {
        ayi_1 ayi_12 = new ayi_1(n);
        for (int i = 0; i < ayi_12.dso; ++i) {
            ayi_12.dsn[i][n] = true;
            ayi_12.dsn[n][i] = true;
        }
        return ayi_12;
    }

    public static ayi_1 cv(int n, int n2) {
        int n3;
        ayi_1 ayi_12 = new ayi_1(n, n2);
        for (n3 = 0; n3 < ayi_12.dso; ++n3) {
            ayi_12.dsn[n3][n2] = true;
        }
        for (n3 = 0; n3 < ayi_12.dsp; ++n3) {
            ayi_12.dsn[n][n3] = true;
        }
        return ayi_12;
    }

    public static ayi_1 cw(int n, int n2) {
        ayi_1 ayi_12 = new ayi_1();
        ayi_12.dso = n;
        ayi_12.dsp = n2;
        ayi_12.dsn = new boolean[n][];
        for (int i = 0; i < n; ++i) {
            ayi_12.dsn[i] = new boolean[n2];
            for (int j = 0; j < n2; ++j) {
                ayi_12.dsn[i][j] = (i + j) % 2 == 0;
            }
        }
        return ayi_12;
    }

    public static ayi_1 gP(String string) {
        ayi_1 ayi_12 = new ayi_1();
        try {
            throw new Exception("Not yet implemented!!!!");
        }
        catch (Exception exception) {
            dsy.error((Object)exception);
            return ayi_12;
        }
    }

    public static ayi_1 b(boolean[] blArray) {
        int n = blArray.length - 1;
        return ayk_1.a(blArray, n, n);
    }

    public static ayi_1 a(boolean[] blArray, int n, int n2) {
        ayi_1 ayi_12 = new ayi_1(n, n2);
        int n3 = ayi_12.bgv();
        int n4 = ayi_12.bgu();
        for (int i = 0; i < ayi_12.dso; ++i) {
            for (int j = 0; j < ayi_12.dsp; ++j) {
                int n5 = Math.max(Math.abs(i - n3), Math.abs(j - n4));
                ayi_12.dsn[i][j] = n5 > blArray.length ? false : blArray[n5];
            }
        }
        return ayi_12;
    }
}

