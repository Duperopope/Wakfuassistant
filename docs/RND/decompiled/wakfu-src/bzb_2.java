/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZb
 */
class bzb_2 {
    private float lBG;
    private float lBH;
    private float lBI;
    private long lBJ;
    private long lBK;

    bzb_2(float f2) {
        this.lBG = f2;
        this.lBI = f2;
        this.lBH = f2;
        this.lBJ = 0L;
        this.lBK = 0L;
    }

    void cG(float f2) {
        this.lBG = f2;
        this.lBI = f2;
        this.lBH = f2;
        this.lBJ = 0L;
        this.lBK = 0L;
    }

    void a(float f2, long l, long l2) {
        this.lBI = f2;
        this.lBH = this.lBG;
        this.lBK = Math.max(l, 1L);
        this.lBJ = l2;
    }

    float epJ() {
        return this.lBG;
    }

    public float epK() {
        return this.lBI;
    }

    boolean mu(long l) {
        return l > this.lBJ + this.lBK;
    }

    void hD(long l) {
        long l2 = l - this.lBJ;
        if (l2 < this.lBK) {
            float f2 = (float)l2 / (float)this.lBK;
            this.lBG = GC.a(this.lBH, this.lBI, f2);
        } else {
            this.lBG = this.lBI;
        }
    }
}

