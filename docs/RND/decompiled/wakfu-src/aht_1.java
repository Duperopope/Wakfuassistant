/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aHt
 */
public class aht_1 {
    private final float dQm;
    private final float dQn;
    private final float dQo;
    private final float dQp;
    private final int dQq;
    private float czn;
    private float dMO;
    private long dQk = -1L;

    public aht_1(float f2, float f3, float f4, float f5, int n) {
        this.dQm = f2;
        this.dQn = f3;
        this.dQo = f4;
        this.dQp = f5;
        this.czn = f2;
        this.dMO = f3;
        this.dQq = n;
    }

    public boolean hQ(long l) {
        if (this.dQk == -1L) {
            this.dQk = l;
            return true;
        }
        int n = (int)(l - this.dQk);
        int n2 = GC.a(n, 0, this.dQq);
        this.czn = this.g(this.dQm, this.dQo, n2, this.dQq);
        this.dMO = this.g(this.dQn, this.dQp, n2, this.dQq);
        return n < this.dQq;
    }

    public void cbz() {
        this.czn = this.dQo;
        this.dMO = this.dQp;
    }

    public float cbT() {
        return this.dMO;
    }

    public float bBt() {
        return this.czn;
    }

    private float g(float f2, float f3, int n, int n2) {
        float f4 = (float)n / (float)n2;
        float f5 = (0.5f - f4) * (1.0f - 2.0f * Math.abs(0.5f - f4));
        return f2 + (f3 - f2) * (f4 -= f5);
    }
}

