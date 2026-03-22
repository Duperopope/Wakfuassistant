/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.math.DoubleMath
 */
import com.google.common.math.DoubleMath;
import java.math.RoundingMode;

/*
 * Renamed from MH
 */
public final class mh_1 {
    public static final mj_1 aWP = mk_1.a(mk_1.c(mh_1.aVb()).nJ(0).nK(245));
    static final long aWQ = 10L;
    static final double aWR = 0.8;
    static final long aWS = 2L;

    private mh_1() {
    }

    private static long[] aVb() {
        long[] lArray = new long[246];
        for (int i = 0; i < 246; ++i) {
            double d2 = (double)(10L * (long)i) * StrictMath.pow(1.6, -StrictMath.log(i) / StrictMath.log(0.8));
            lArray[i] = DoubleMath.roundToLong((double)d2, (RoundingMode)RoundingMode.FLOOR);
        }
        return lArray;
    }

    public static mj_1 aVa() {
        return aWP;
    }
}

