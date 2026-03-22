/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aHs
 */
public class ahs_1 {
    private final float dQf;
    private final float dQg;
    private final float dQh;
    private final float dQi;
    private final int dQj;
    private long dQk = -1L;
    final /* synthetic */ ahq_1 dQl;

    public ahs_1(ahq_1 ahq_12, float f2, float f3, int n) {
        this.dQl = ahq_12;
        this.dQf = ahq_12.czn;
        this.dQg = ahq_12.dMO;
        this.dQh = f2;
        this.dQi = f3;
        this.dQj = n;
    }

    public boolean hQ(long l) {
        if (this.dQk == -1L) {
            this.dQk = l;
            return true;
        }
        int n = (int)(l - this.dQk);
        int n2 = GC.a(n, 0, this.dQj);
        this.dQl.czn = this.g(this.dQf, this.dQh, n2, this.dQj);
        this.dQl.dMO = this.g(this.dQg, this.dQi, n2, this.dQj);
        this.dQl.bu(this.dQl.czn, this.dQl.dMO);
        return n < this.dQj;
    }

    private float g(float f2, float f3, int n, int n2) {
        float f4 = (float)n / (float)n2;
        float f5 = (0.5f - f4) * (1.0f - 2.0f * Math.abs(0.5f - f4));
        return f2 + (f3 - f2) * (f4 -= f5);
    }
}

