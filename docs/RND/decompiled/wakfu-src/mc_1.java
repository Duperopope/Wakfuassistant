/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.math.DoubleMath
 */
import com.google.common.math.DoubleMath;
import java.math.RoundingMode;

/*
 * Renamed from MC
 */
public final class mc_1 {
    private static final short aWf = 0;
    private static final short aWg = 200;
    private static final int aWh = 100;
    private static final double aWi = 1.5;
    private static final double aWj = 2.2;
    private static final long[] aWk = mc_1.aVb();
    public static final mj_1 aWl = mk_1.a(mk_1.c(aWk).nJ(0).nK(200).cV(aWk[200]));

    private static long[] aVb() {
        long[] lArray = new long[201];
        for (int i = 0; i < lArray.length; ++i) {
            double d2 = (double)(100 * i) + 1.5 * StrictMath.pow(i, 2.2);
            lArray[i] = DoubleMath.roundToLong((double)d2, (RoundingMode)RoundingMode.FLOOR);
        }
        lArray[0] = lArray[1] - 1L;
        return lArray;
    }

    private mc_1() {
    }
}

