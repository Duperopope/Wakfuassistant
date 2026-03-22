/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aju
 */
class aju_1
implements adm_0 {
    final /* synthetic */ afx_1 cAZ;
    final /* synthetic */ String cBa;
    final /* synthetic */ afq_2[] cBb;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aju_1(ajt_1 ajt_12, afx_1 afx_12, String string, afq_2[] afq_2Array) {
        this.cAZ = afx_12;
        this.cBa = string;
        this.cBb = afq_2Array;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        this.cAZ.a(this.cBa, this.cBb, new afp_2[0]);
    }
}

