/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bVg
 */
class bvg_1
implements afm_0 {
    final /* synthetic */ int lrX;
    final /* synthetic */ afx_1 lrY;
    final /* synthetic */ String lrZ;
    final /* synthetic */ afq_2[] lsa;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bvg_1(bvf_1 bvf_12, int n, afx_1 afx_12, String string, afq_2[] afq_2Array) {
        this.lrX = n;
        this.lrY = afx_12;
        this.lrZ = string;
        this.lsa = afq_2Array;
    }

    @Override
    public void h(afk_0 afk_02) {
        if (afk_02.aVD().Sn() == (long)this.lrX) {
            this.lrY.a(this.lrZ, this.lsa, new afp_2[0]);
        }
    }
}

