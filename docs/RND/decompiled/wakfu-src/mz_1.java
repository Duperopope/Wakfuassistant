/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.math.DoubleMath
 */
import com.google.common.math.DoubleMath;
import java.math.RoundingMode;

/*
 * Renamed from Mz
 */
public final class mz_1 {
    static final short aVV = 1;
    static final long[] aVW = new long[246];
    public static final mj_1 aVX;

    private static double nE(int n) {
        int n2 = n;
        if (n2 < 1) {
            n2 = 1;
        }
        return me_1.L((short)n2);
    }

    private static double nF(int n) {
        return md_1.nF(n);
    }

    private mz_1() {
    }

    static {
        mz_1.aVW[0] = 0L;
        double d2 = 0.0;
        int n = aVW.length;
        for (int i = 1; i < n; ++i) {
            double d3 = mz_1.nE(i);
            double d4 = Math.max(1.0, mz_1.nF(i));
            double d5 = d3 * d4;
            mz_1.aVW[i] = DoubleMath.roundToLong((double)(d2 += d5), (RoundingMode)RoundingMode.FLOOR);
        }
        aVX = mk_1.a(mk_1.c(aVW).nJ(1).nK(246));
    }
}

