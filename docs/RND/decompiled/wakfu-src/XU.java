/*
 * Decompiled with CFR 0.152.
 */
class XU {
    final XT bTl;
    private float bTm = 1.0f;
    private final int bTn;

    XU(XT xT, int n) {
        this.bTl = xT;
        this.bTn = n;
    }

    public int bob() {
        return this.bTn;
    }

    public float bnY() {
        return this.bTm;
    }

    public void bK(float f2) {
        this.bTm = f2;
    }

    public final void qK(int n) {
        this.bTl.qJ(n);
    }

    public final boolean boc() {
        return this.bTm > 0.0f;
    }
}

