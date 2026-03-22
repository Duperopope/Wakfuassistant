/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fLb
 */
public class flb_1
implements ahd {
    public static final float[][] uHS = new float[][]{{0.0f, 2.0f}, {0.0f, -2.0f}, {2.0f, 0.0f}, {-2.0f, 0.0f}, {0.0f, -2.0f}, {0.0f, 2.0f}, {-2.0f, 0.0f}, {36.0f, 0.0f}, {32.0f, -4.0f}, {36.0f, -8.0f}, {25.0f, -20.0f}, {32.0f, -8.0f}, {26.0f, -4.0f}, {28.0f, 0.0f}, {2.0f, 0.0f}};
    public static final float[][] uHT = new float[][]{{0.0f, 0.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}};
    public static final arq_2 uHU = new arq_2(new short[]{0, 1, 2, 14, 14, 2, 3, 6, 3, 6, 5, 4, 13, 12, 8, 7, 12, 11, 9, 8, 11, 10, 9, 11});
    public static final arq_2 uHV = new arq_2(new short[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 0});
    private static final float[][] uHW = new float[][]{{0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {0.0f, 0.0f}};
    private float bRz = 0.0f;
    private float bRA = 0.0f;
    private boolean bRB;

    @Override
    public int getBottomMargin() {
        return 20;
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
        return uHS;
    }

    @Override
    public float[][] bnF() {
        return uHT;
    }

    public final float gDm() {
        return this.bRz;
    }

    public final void fW(float f2) {
        this.bRz = f2;
    }

    public final float gDn() {
        return this.bRA;
    }

    public final void fX(float f2) {
        this.bRA = f2;
    }

    public final void ph(boolean bl) {
        this.bRB = bl;
    }

    @Override
    public arq_2 bnG() {
        return uHU;
    }

    @Override
    public arq_2 bnH() {
        return uHV;
    }
}

