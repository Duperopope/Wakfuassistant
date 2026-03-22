/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bWc
 */
class bwc_1
implements bLb {
    final /* synthetic */ int lsP;
    final /* synthetic */ int lsQ;
    final /* synthetic */ afx_1 lsR;
    final /* synthetic */ String lsS;
    final /* synthetic */ afq_2[] lsT;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bwc_1(bwb_1 bwb_12, int n, int n2, afx_1 afx_12, String string, afq_2[] afq_2Array) {
        this.lsP = n;
        this.lsQ = n2;
        this.lsR = afx_12;
        this.lsS = string;
        this.lsT = afq_2Array;
    }

    @Override
    public void h(bKV bKV2) {
        if (bKV2.bcC() == this.lsP && bKV2.bcD() == this.lsQ) {
            this.lsR.a(this.lsS, this.lsT, new afp_2[0]);
            bLe.ecw().c(this);
        }
    }
}

