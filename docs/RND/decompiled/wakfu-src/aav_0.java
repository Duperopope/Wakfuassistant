/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aaV
 */
class aav_0 {
    private int cbN;
    private int ccJ;
    private int cbO;
    private int ccK;
    boolean ccL = true;

    aav_0() {
        this.reset();
    }

    void reset() {
        this.ccK = Integer.MAX_VALUE;
        this.cbO = Integer.MAX_VALUE;
        this.ccJ = Integer.MAX_VALUE;
        this.cbN = Integer.MAX_VALUE;
        this.ccL = true;
    }

    public boolean k(int n, int n2, int n3, int n4) {
        boolean bl = this.ccL = this.cbN != n || this.ccJ != n2 || this.cbO != n3 || this.ccK != n4;
        if (this.ccL) {
            this.cbN = n;
            this.ccJ = n2;
            this.cbO = n3;
            this.ccK = n4;
        }
        return this.ccL;
    }
}

