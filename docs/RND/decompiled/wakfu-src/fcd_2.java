/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCD
 */
class fcd_2 {
    Runnable tZB;
    final fbz_2 tZC;
    final int tZD;
    final fcd_2 tZE;
    final byte tZF;
    short jrp;
    byte tZG;
    final /* synthetic */ fcc_2 tZH;

    fcd_2(fcc_2 fcc_22, fbz_2 fbz_22, int n, fcd_2 fcd_22, byte by) {
        this.tZH = fcc_22;
        this.tZC = fbz_22;
        this.tZD = n;
        this.tZE = fcd_22;
        this.tZF = by;
    }

    private fcd_2(fcc_2 fcc_22, fbz_2 fbz_22, int n, byte by) {
        this(fcc_22, fbz_22, n, null, by);
    }

    private void a(short s, boolean bl, int n, float f2) {
        this.tZH.tZs = false;
        int n2 = n;
        float f3 = this.tZC.getOffset();
        if (this.tZB != null) {
            return;
        }
        this.tZB = new fce_1(this, bl, f2, s, f3, n2);
        abg_2.bUP().a(this.tZB, 25L);
    }

    public void gub() {
        float f2 = (float)this.tZF / ((float)this.tZH.tZw / 25.0f);
        int n = fcc_2.tZn.length;
        this.a(this.tZF, true, this.tZF, f2);
    }

    public void guc() {
        int n = fcc_2.tZn.length;
        float f2 = (float)n / ((float)this.tZH.tZw / 25.0f);
        this.a((short)n, true, n, f2);
    }

    void setListOffset(float f2) {
        this.tZC.setListOffset(f2);
    }

    public Byte gud() {
        return this.tZG;
    }

    public byte gue() {
        return this.tZF;
    }

    public int guf() {
        return this.tZD;
    }

    public void clean() {
        abg_2.bUP().h(this.tZB);
    }

    public fbz_2 getList() {
        return this.tZC;
    }
}

