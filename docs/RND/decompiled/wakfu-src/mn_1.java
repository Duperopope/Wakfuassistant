/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from MN
 */
public abstract class mn_1 {
    protected Integer aXe;
    protected Integer aXf;
    protected Long aXg;
    protected Long aXh;
    protected Double aXi;

    int rI() {
        return this.aXe == null ? 1 : this.aXe;
    }

    abstract int Fq();

    long aVl() {
        return this.aXg == null ? 0L : this.aXg;
    }

    long aVm() {
        return this.aXh == null ? Long.MAX_VALUE : this.aXh;
    }

    double aVn() {
        return this.aXi == null ? 1.0 : this.aXi;
    }

    abstract long[] aVk();

    public mn_1 nJ(int n) {
        this.aXe = n;
        return this;
    }

    public mn_1 nK(int n) {
        this.aXf = n;
        return this;
    }

    public mn_1 cU(long l) {
        this.aXg = l;
        return this;
    }

    public mn_1 cV(long l) {
        this.aXh = l;
        return this;
    }

    public mn_1 y(double d2) {
        this.aXi = d2;
        return this;
    }
}

