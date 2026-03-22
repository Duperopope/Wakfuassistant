/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGf
 */
class cgf_2
implements cgz_1 {
    final /* synthetic */ bsn_1 mXR;
    final /* synthetic */ boolean mXS;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cgf_2(bsn_1 bsn_12, boolean bl) {
        this.mXR = bsn_12;
        this.mXS = bl;
    }

    @Override
    public void eKD() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mXR, this.mXS);
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), this.mXR.getKey());
    }

    @Override
    public void cancel() {
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(this.mXR);
    }
}

