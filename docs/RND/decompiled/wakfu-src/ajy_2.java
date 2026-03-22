/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ajy
 */
class ajy_2
implements adm_0 {
    final /* synthetic */ afx_1 cBl;
    final /* synthetic */ int cBm;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ajy_2(ajx_2 ajx_22, afx_1 afx_12, int n) {
        this.cBl = afx_12;
        this.cBm = n;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        this.cBl.xK(this.cBm);
    }
}

