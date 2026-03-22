/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDh
 */
class cdh_2
implements ftl_1 {
    boolean mST = false;
    final /* synthetic */ fey_2 mSU;
    final /* synthetic */ int mSV;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cdh_2(fey_2 fey_22, int n) {
        this.mSU = fey_22;
        this.mSV = n;
    }

    @Override
    public void epr() {
        if (this.mST) {
            this.mSU.setVisible(true);
            this.mSU.b(this);
        } else {
            this.mST = true;
            this.mSU.setY(this.mSV - this.mSU.getHeight());
        }
    }
}

