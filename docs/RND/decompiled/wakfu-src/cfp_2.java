/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFP
 */
class cfp_2
implements cgz_1 {
    final /* synthetic */ bsn_1 mXd;
    final /* synthetic */ boolean mXe;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cfp_2(bsn_1 bsn_12, boolean bl) {
        this.mXd = bsn_12;
        this.mXe = bl;
    }

    @Override
    public void eKD() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mXd, this.mXe);
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), this.mXd.getKey());
    }

    @Override
    public void cancel() {
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), this.mXd.getKey());
    }
}

