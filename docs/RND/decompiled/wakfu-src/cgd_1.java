/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGd
 */
class cgd_1
implements cgz_1 {
    final /* synthetic */ bsn_1 mXN;
    final /* synthetic */ boolean mXO;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cgd_1(bsn_1 bsn_12, boolean bl) {
        this.mXN = bsn_12;
        this.mXO = bl;
    }

    @Override
    public void eKD() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mXN, this.mXO);
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), this.mXN.getKey());
    }

    @Override
    public void cancel() {
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(this.mXN);
        cfj_1.proceedFightersTransparency(bl);
    }
}

