/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from axi
 */
public final class axi_2 {
    private float[] doS;
    private int cRf;

    public axi_2(int n) {
        this.doS = new float[n * n];
        this.cRf = n;
    }

    public axi_2(float[] fArray) {
        this.V(fArray);
    }

    public final void V(float[] fArray) {
        assert (Math.sqrt(fArray.length) == (double)((int)Math.sqrt(fArray.length)));
        this.cRf = (int)Math.sqrt(fArray.length);
        this.doS = fArray;
    }

    public final float[] bQE() {
        return this.doS;
    }

    public final int bQF() {
        return this.cRf;
    }
}

