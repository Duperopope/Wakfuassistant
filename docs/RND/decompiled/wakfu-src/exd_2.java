/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eXD
 */
public class exd_2
extends ewz_2 {
    private final double[] rIs = new double[exx_2.fOO() + 1];
    private final int rIt;

    public exd_2(int n) {
        this.rIt = n;
    }

    public double o(exx_2 exx_22) {
        return this.rIs[exx_22.aJr()];
    }

    public int b(exx_2 exx_22, int n) {
        int n2 = n - this.rIt;
        return this.i(exx_22) + (int)((double)n2 * this.rIs[exx_22.aJr()]);
    }

    public void a(exx_2 exx_22, int n, float f2) {
        this.rIs[exx_22.aJr()] = f2;
        this.a(exx_22, n);
    }
}

