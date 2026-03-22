/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Range
 */
import com.google.common.collect.Range;

public final class fqA {
    private static final int sTO = 3000;
    private static final int sTP = 1500;
    private static final int sTQ = 50;
    private static final float sTR = 0.2f;

    private fqA() {
    }

    public static long a(int n, int n2, float f2, fpW<?> fpW2, wf_0 wf_02) {
        if (n < n2) {
            return 3000L;
        }
        long l = 3000L - (long)((n - n2) * 50);
        long l2 = Math.max(1500L, l);
        float f3 = 1.0f / (1.0f + f2);
        float f4 = wf_02 == null ? 1.0f : 1.0f + 0.2f * (float)fqA.a(fpW2, wf_02);
        return Math.round((float)l2 * f3 * f4);
    }

    public static int a(fpW<?> fpW2, wf_0 wf_02) {
        float f2 = wf_02.blF();
        Range range = Range.closed((Comparable)Float.valueOf(fpW2.cux()), (Comparable)Float.valueOf(fpW2.cuy()));
        float f3 = range.contains((Comparable)Float.valueOf(f2)) ? 0.0f : (f2 < ((Float)range.lowerEndpoint()).floatValue() ? ((Float)range.lowerEndpoint()).floatValue() - f2 : f2 - ((Float)range.upperEndpoint()).floatValue());
        return Math.round(f3);
    }
}

