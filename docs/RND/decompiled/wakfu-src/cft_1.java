/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFT
 */
class cft_1
implements cgz_1 {
    final /* synthetic */ bsn_1 mXk;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cft_1(bsn_1 bsn_12) {
        this.mXk = bsn_12;
    }

    @Override
    public void eKD() {
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(this.mXk);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mXk, !bl);
    }

    @Override
    public void cancel() {
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), this.mXk.getKey());
    }
}

