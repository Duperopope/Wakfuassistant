/*
 * Decompiled with CFR 0.152.
 */
public class eKX {
    private static final double qET = 10.0;
    private static final double qEU = 10.0;
    public static final short qEV = 200;
    private static final float qEW = 100.0f;
    public static final int qEX = 150;
    public static final int qEY = 10;
    private static final int qEZ = 75;

    public static long fzi() {
        return 100L;
    }

    public static long a(short s, short s2, eKW eKW2, eve_2 eve_22) {
        return eKX.a(s, s2, eKW2, 100, eve_22);
    }

    public static long a(short s, short s2, eKW eKW2, int n, eve_2 eve_22) {
        if (!evg_1.osP.a(eve_22) && s >= 10) {
            return 0L;
        }
        double d2 = (double)s - ((double)s2 + 10.0);
        if (d2 > 10.0) {
            return 0L;
        }
        if (d2 < 0.0) {
            return Math.round(100.0 * (double)eKW2.cmu() * (double)n / 100.0);
        }
        double d3 = (double)s2 + 10.0 - (double)s;
        float f2 = eKW2.cmu() * (float)n / 100.0f;
        return Math.round((double)eKX.fzi() / 2.0 * (1.0 + Math.cos(d3 * Math.PI / 10.0)) * (double)f2);
    }

    public static long dV(short s) {
        return 75L * (long)s * (long)s;
    }

    public static long dW(short s) {
        return eKX.dV(s) - eKX.dV((short)(s - 1));
    }

    public static long qg(long l) {
        return eKX.dV((short)(eKX.qi(l) + 1)) - l;
    }

    public static double qh(long l) {
        return Math.sqrt((double)l / 75.0);
    }

    public static short qi(long l) {
        return (short)Math.floor(eKX.qh(l));
    }

    public static double qj(long l) {
        double d2 = eKX.qh(l);
        return d2 - Math.floor(d2);
    }

    public static azx_1<Short, Double> qk(long l) {
        double d2 = eKX.qh(l);
        short s = (short)Math.floor(d2);
        return new azx_1<Short, Double>(s, d2 - (double)s);
    }
}

