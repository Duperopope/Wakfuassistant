/*
 * Decompiled with CFR 0.152.
 */
final class agg {
    private float ctd;
    private float cte;
    private float ctf;
    boolean ctg;

    agg() {
    }

    public void m(float f2, float f3, float f4) {
        this.ctd = f2;
        this.cte = f3;
        this.ctf = f4;
    }

    public boolean n(float f2, float f3, float f4) {
        return this.ctd == f2 && this.cte == f3 && this.ctf == f4;
    }
}

