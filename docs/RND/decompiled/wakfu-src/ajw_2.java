/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ajw
 */
class ajw_2
implements ady_0<ads_0> {
    final /* synthetic */ boolean cBd;
    final /* synthetic */ int cBe;
    final /* synthetic */ int cBf;
    final /* synthetic */ adj_0 cBg;
    final /* synthetic */ afx_1 cBh;
    final /* synthetic */ int cBi;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ajw_2(ajv_1 ajv_12, boolean bl, int n, int n2, adj_0 adj_02, afx_1 afx_12, int n3) {
        this.cBd = bl;
        this.cBe = n;
        this.cBf = n2;
        this.cBg = adj_02;
        this.cBh = afx_12;
        this.cBi = n3;
    }

    public void a(ads_0 ads_02, int n, int n2, short s) {
        if (this.cBd && n == this.cBe && n2 == this.cBf) {
            this.cBg.c(this);
            this.cBh.xK(this.cBi);
        } else if (!(this.cBd || n == this.cBe && n2 == this.cBf)) {
            this.cBg.c(this);
            this.cBh.xK(this.cBi);
        }
    }

    @Override
    public /* synthetic */ void cellPositionChanged(afW afW2, int n, int n2, short s) {
        this.a((ads_0)afW2, n, n2, s);
    }
}

