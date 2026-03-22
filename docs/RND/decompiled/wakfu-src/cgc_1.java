/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGc
 */
class cgc_1
implements cgz_1 {
    final /* synthetic */ bsn_1 mXL;
    final /* synthetic */ boolean mXM;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cgc_1(bsn_1 bsn_12, boolean bl) {
        this.mXL = bsn_12;
        this.mXM = bl;
    }

    @Override
    public void eKD() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mXL, this.mXM);
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), this.mXL.getKey());
    }

    @Override
    public void cancel() {
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(this.mXL);
        cfj_1.proceedHideFightOccluders(bl);
    }
}

