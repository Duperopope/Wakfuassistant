/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bVe
 */
class bve_2
implements afl_0 {
    final /* synthetic */ int lrT;
    final /* synthetic */ afx_1 lrU;
    final /* synthetic */ String lrV;
    final /* synthetic */ afq_2[] lrW;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bve_2(bvd_1 bvd_12, int n, afx_1 afx_12, String string, afq_2[] afq_2Array) {
        this.lrT = n;
        this.lrU = afx_12;
        this.lrV = string;
        this.lrW = afq_2Array;
    }

    @Override
    public void g(afk_0 afk_02) {
        if (afk_02.aVD().Sn() == (long)this.lrT) {
            this.lrU.a(this.lrV, this.lrW, new afp_2[0]);
        }
    }
}

