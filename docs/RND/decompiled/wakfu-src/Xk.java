/*
 * Decompiled with CFR 0.152.
 */
public class Xk
implements ahd {
    public static final float[][] bRo = new float[][]{{0.0f, 2.0f}, {0.0f, -2.0f}, {2.0f, 0.0f}, {-2.0f, 0.0f}, {0.0f, -2.0f}, {0.0f, 2.0f}, {-2.0f, 0.0f}, {36.0f, 0.0f}, {32.0f, -4.0f}, {36.0f, -8.0f}, {25.0f, -20.0f}, {32.0f, -8.0f}, {26.0f, -4.0f}, {28.0f, 0.0f}, {2.0f, 0.0f}};
    public static final float[][] bRp = new float[][]{{0.0f, 0.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}};
    public static final arq_2 bRq = new arq_2(new short[]{0, 1, 2, 14, 14, 2, 3, 6, 3, 6, 5, 4, 13, 12, 8, 7, 12, 11, 9, 8, 11, 10, 9, 11});
    public static final arq_2 bRr = new arq_2(new short[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 0});

    @Override
    public int getBottomMargin() {
        return 9;
    }

    @Override
    public int getLeftMargin() {
        return 5;
    }

    @Override
    public int getRightMargin() {
        return 5;
    }

    @Override
    public int getTopMargin() {
        return 1;
    }

    @Override
    public float[][] bnE() {
        return bRo;
    }

    @Override
    public float[][] bnF() {
        return bRp;
    }

    @Override
    public arq_2 bnG() {
        return bRq;
    }

    @Override
    public arq_2 bnH() {
        return bRr;
    }
}

