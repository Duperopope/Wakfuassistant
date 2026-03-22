/*
 * Decompiled with CFR 0.152.
 */
public class ahf
implements ahd {
    private static final float[][] cvO = new float[][]{{0.0f, 2.0f}, {0.0f, -2.0f}, {2.0f, 0.0f}, {-2.0f, 0.0f}, {0.0f, -2.0f}, {0.0f, 2.0f}, {-2.0f, 0.0f}, {2.0f, 0.0f}};
    private static final float[][] cvP = new float[][]{{0.0f, 0.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {0.0f, 0.0f}};
    private static final arq_2 cvQ = new arq_2(new short[]{0, 1, 2, 7, 7, 2, 3, 6, 3, 6, 5, 4});
    private static final arq_2 cvR = new arq_2(new short[]{0, 1, 2, 3, 4, 5, 6, 7, 0});

    @Override
    public int getBottomMargin() {
        return 5;
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
        return 5;
    }

    @Override
    public float[][] bnE() {
        return cvO;
    }

    @Override
    public float[][] bnF() {
        return cvP;
    }

    @Override
    public arq_2 bnG() {
        return cvQ;
    }

    @Override
    public arq_2 bnH() {
        return cvR;
    }
}

