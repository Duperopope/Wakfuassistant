/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from awU
 */
public class awu_2 {
    protected final azh_2 dnw;
    protected final int dnx;
    protected byte dny = 1;

    public awu_2(awu_2 awu_22) {
        this.dnw = new azh_2(awu_22.dnw);
        this.dnx = awu_22.dnx;
        this.dny = awu_22.dny;
    }

    public awu_2(axj_2 axj_22, int n) {
        int n2 = axj_22.getWidth() * axj_22.getHeight();
        this.dnw = new azh_2(n2);
        int n3 = axj_22.getWidth();
        int n4 = axj_22.getHeight();
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < n4; ++j) {
                this.dnw.j(j * n3 + i, axj_22.cj(i, n4 - 1 - j) >= n);
            }
        }
        this.dnx = n3;
    }

    public awu_2(byte[] byArray, int n, byte by) {
        this.dnx = GC.C((float)n / (float)by);
        this.dnw = azh_2.dI(byArray);
        this.dny = by;
    }

    public boolean ci(int n, int n2) {
        return this.dnw.vE(n2 / this.dny * this.dnx + n / this.dny);
    }
}

