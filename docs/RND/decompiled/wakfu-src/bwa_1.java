/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bWa
 */
class bwa_1
implements bLa {
    final /* synthetic */ int lsK;
    final /* synthetic */ int lsL;
    final /* synthetic */ afx_1 lsM;
    final /* synthetic */ String lsN;
    final /* synthetic */ afq_2[] lsO;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bwa_1(bvz_1 bvz_12, int n, int n2, afx_1 afx_12, String string, afq_2[] afq_2Array) {
        this.lsK = n;
        this.lsL = n2;
        this.lsM = afx_12;
        this.lsN = string;
        this.lsO = afq_2Array;
    }

    @Override
    public void i(bKV bKV2) {
        if (bKV2.bcC() == this.lsK && bKV2.bcD() == this.lsL) {
            this.lsM.a(this.lsN, this.lsO, new afp_2[0]);
            bLe.ecw().c(this);
        }
    }
}

