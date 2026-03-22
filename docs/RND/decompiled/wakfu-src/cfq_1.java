/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFQ
 */
class cfq_1
implements cgz_1 {
    final /* synthetic */ boolean mXf;
    final /* synthetic */ bsn_1 mXg;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cfq_1(boolean bl, bsn_1 bsn_12) {
        this.mXf = bl;
        this.mXg = bsn_12;
    }

    @Override
    public void eKD() {
    }

    @Override
    public void cancel() {
        aie_0.cfn().bmE().dt(this.mXf);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mXg, this.mXf);
    }
}

