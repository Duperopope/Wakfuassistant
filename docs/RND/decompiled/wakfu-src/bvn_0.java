/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bvN
 */
public class bvn_0
implements aeM {
    public static final int jvB = 64;
    public static final int jvC = 64;
    private final float jvD;
    private final float jvE;
    private final float jvF;

    public bvn_0(float f2, float f3, float f4) {
        this.jvD = f2;
        this.jvE = f3;
        this.jvF = f4;
    }

    @Override
    public int bwN() {
        return 64;
    }

    @Override
    public int bwO() {
        return 64;
    }

    @Override
    public float a(aro_1 aro_12) {
        return this.jvD;
    }

    @Override
    public float b(aro_1 aro_12) {
        float f2 = 32.0f;
        return 32.0f * (this.jvE - 0.5f) / this.jvD;
    }

    @Override
    public float c(aro_1 aro_12) {
        float f2 = 32.0f;
        return 32.0f * (this.jvF - 0.5f) / this.jvD;
    }
}

