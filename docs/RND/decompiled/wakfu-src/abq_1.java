/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBQ
 */
class abq_1 {
    private final long dzX;
    private final double dzY;
    private final int dzZ;
    private long Ns;
    double dAa;

    abq_1(double d2, int n, long l) {
        if (l <= 0L) {
            throw new IllegalArgumentException("Elements of capacities must be positive.");
        }
        this.dzX = l;
        this.dzY = d2;
        this.dzZ = n;
    }

    double bWl() {
        return (double)this.dzX / this.dzY;
    }

    public int wp() {
        return this.dzZ;
    }

    long apJ() {
        return this.Ns;
    }

    void J(double d2) {
        this.Ns = (long)Math.floor(d2);
        this.dAa = d2 - (double)this.Ns;
    }

    public void bWm() {
        this.Ns = this.dzX;
    }

    public double bWn() {
        return this.dzY;
    }

    public void bWo() {
        ++this.Ns;
        this.dAa -= 1.0;
    }
}

