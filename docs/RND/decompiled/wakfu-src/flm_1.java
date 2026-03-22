/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fLm
 */
public class flm_1
implements ahd {
    private static final float[][] uIh = new float[][]{{1.0f, -11.0f}, {2.0f, -11.0f}, {0.0f, -11.0f}, {0.0f, -8.0f}, {2.0f, -8.0f}, {2.0f, -7.0f}, {1.0f, -7.0f}, {1.0f, -4.0f}, {4.0f, -4.0f}, {4.0f, -6.0f}, {6.0f, -6.0f}, {6.0f, -4.0f}, {4.0f, -4.0f}, {4.0f, -1.0f}, {7.0f, -1.0f}, {7.0f, -2.0f}, {8.0f, -2.0f}, {8.0f, 0.0f}, {11.0f, 0.0f}, {11.0f, -2.0f}, {11.0f, -1.0f}, {-11.0f, -1.0f}, {-11.0f, -2.0f}, {-11.0f, 0.0f}, {-8.0f, 0.0f}, {-8.0f, -2.0f}, {-7.0f, -2.0f}, {-7.0f, -1.0f}, {-4.0f, -1.0f}, {-4.0f, -4.0f}, {-6.0f, -4.0f}, {-6.0f, -6.0f}, {-4.0f, -6.0f}, {-4.0f, -4.0f}, {-1.0f, -4.0f}, {-1.0f, -7.0f}, {-2.0f, -7.0f}, {-2.0f, -8.0f}, {0.0f, -8.0f}, {0.0f, -11.0f}, {-2.0f, -11.0f}, {-1.0f, -11.0f}, {-1.0f, 11.0f}, {-2.0f, 11.0f}, {0.0f, 11.0f}, {0.0f, 8.0f}, {-2.0f, 8.0f}, {-2.0f, 7.0f}, {-1.0f, 7.0f}, {-1.0f, 4.0f}, {-4.0f, 4.0f}, {-4.0f, 6.0f}, {-6.0f, 6.0f}, {-6.0f, 4.0f}, {-4.0f, 4.0f}, {-4.0f, 1.0f}, {-7.0f, 1.0f}, {-7.0f, 2.0f}, {-8.0f, 2.0f}, {-8.0f, 0.0f}, {-11.0f, 0.0f}, {-11.0f, 2.0f}, {-11.0f, 1.0f}, {11.0f, 1.0f}, {11.0f, 2.0f}, {11.0f, 0.0f}, {8.0f, 0.0f}, {8.0f, 2.0f}, {7.0f, 2.0f}, {7.0f, 1.0f}, {4.0f, 1.0f}, {4.0f, 4.0f}, {6.0f, 4.0f}, {6.0f, 6.0f}, {4.0f, 6.0f}, {4.0f, 4.0f}, {1.0f, 4.0f}, {1.0f, 7.0f}, {2.0f, 7.0f}, {2.0f, 8.0f}, {0.0f, 8.0f}, {0.0f, 11.0f}, {2.0f, 11.0f}, {1.0f, 11.0f}};
    private static final float[][] uIi = new float[][]{{0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}};
    private static final arq_2 uIj = new arq_2(new short[]{0, 0, 0, 0});
    private static final arq_2 uIk = new arq_2(new short[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 0});
    private float bRz = 0.0f;
    private float bRA = 0.0f;
    private boolean bRB;

    @Override
    public int getBottomMargin() {
        return 12;
    }

    @Override
    public int getLeftMargin() {
        return 12;
    }

    @Override
    public int getRightMargin() {
        return 12;
    }

    @Override
    public int getTopMargin() {
        return 12;
    }

    @Override
    public float[][] bnE() {
        return uIh;
    }

    @Override
    public float[][] bnF() {
        return uIi;
    }

    @Override
    public arq_2 bnG() {
        return uIj;
    }

    @Override
    public arq_2 bnH() {
        return uIk;
    }

    public final float gDt() {
        return this.bRz;
    }

    public final void fY(float f2) {
        this.bRz = f2;
    }

    public final float gDu() {
        return this.bRA;
    }

    public final void fZ(float f2) {
        this.bRA = f2;
    }

    public final void pi(boolean bl) {
        this.bRB = bl;
    }
}

