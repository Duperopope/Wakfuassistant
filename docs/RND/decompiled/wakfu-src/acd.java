/*
 * Decompiled with CFR 0.152.
 */
public class acd
implements acv_0 {
    private final float cfH = 0.3f;
    private static final acd cfI = new acd();

    public static acd btq() {
        return cfI;
    }

    private acd() {
    }

    @Override
    public void qF(int n) {
    }

    @Override
    public int bpb() {
        return 300;
    }

    @Override
    public boolean bpa() {
        return false;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        float f2 = 0.3f;
        if (fArray[0] < 0.3f) {
            fArray[0] = 0.3f;
        }
        if (fArray[1] < 0.3f) {
            fArray[1] = 0.3f;
        }
        if (fArray[2] < 0.3f) {
            fArray[2] = 0.3f;
        }
    }
}

