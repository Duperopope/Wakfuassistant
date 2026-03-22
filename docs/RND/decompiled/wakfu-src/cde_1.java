/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDE
 */
class cde_1
implements ftl_1 {
    final /* synthetic */ fey_2 mTR;
    final /* synthetic */ int mTS;
    final /* synthetic */ int mTT;
    final /* synthetic */ apr_0 mTU;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cde_1(fey_2 fey_22, int n, int n2, apr_0 apr_02) {
        this.mTR = fey_22;
        this.mTS = n;
        this.mTT = n2;
        this.mTU = apr_02;
    }

    @Override
    public void epr() {
        this.mTR.setPosition(this.mTS - 50, this.mTT + 10 - this.mTR.getHeight());
        this.mTR.b(this);
        this.mTU.cAe();
    }
}

