/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Dimension;

/*
 * Renamed from fGj
 */
public final class fgj_1 {
    private static final double usG = 1608.0;
    private static final double usH = 807.0;
    private static final double usI = 1009.5;
    private static final double usJ = 517.0;
    private static final acb_1[] usK = new acb_1[]{new acb_1(985.0f, 17.0f), new acb_1(1036.0f, 17.0f), new acb_1(2007.0f, 505.0f), new acb_1(2007.0f, 573.0f), new acb_1(1029.0f, 1059.0f), new acb_1(987.0f, 1059.0f), new acb_1(12.0f, 571.0f), new acb_1(12.0f, 505.0f)};

    private fgj_1() {
    }

    public static boolean a(int n, int n2, Dimension dimension, Dimension dimension2) {
        double d2 = dimension2.getWidth() / 2.0;
        double d3 = dimension2.getHeight() / 2.0;
        double d4 = ((double)n - d2) * 1608.0 / dimension.getWidth() + 1009.5;
        double d5 = (dimension2.getHeight() - (double)n2 - d3) * 807.0 / dimension.getHeight() + 517.0;
        return fgj_1.a(d4, d5, usK);
    }

    private static boolean a(double d2, double d3, acb_1 ... acb_1Array) {
        boolean bl;
        double d4 = acb_1Array[0].aPY;
        double d5 = acb_1Array[0].aPY;
        double d6 = acb_1Array[0].aPZ;
        double d7 = acb_1Array[0].aPZ;
        for (bl = true; bl < acb_1Array.length; bl += 1) {
            acb_1 acb_12 = acb_1Array[bl];
            d4 = Math.min((double)acb_12.aPY, d4);
            d5 = Math.max((double)acb_12.aPY, d5);
            d6 = Math.min((double)acb_12.aPZ, d6);
            d7 = Math.max((double)acb_12.aPZ, d7);
        }
        if (d2 < d4 || d2 > d5 || d3 < d6 || d3 > d7) {
            return false;
        }
        bl = false;
        int n = 0;
        int n2 = acb_1Array.length - 1;
        while (n < acb_1Array.length) {
            if ((double)acb_1Array[n].aPZ > d3 != (double)acb_1Array[n2].aPZ > d3 && d2 < (double)(acb_1Array[n2].aPY - acb_1Array[n].aPY) * (d3 - (double)acb_1Array[n].aPZ) / (double)(acb_1Array[n2].aPZ - acb_1Array[n].aPZ) + (double)acb_1Array[n].aPY) {
                bl = !bl;
            }
            n2 = n++;
        }
        return bl;
    }
}

