/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGx
 */
class cgx_2
implements cgz_1 {
    final /* synthetic */ afe mYC;
    final /* synthetic */ cAM mYD;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cgx_2(afe afe2, cAM cAM2) {
        this.mYC = afe2;
        this.mYD = cAM2;
    }

    @Override
    public void eKD() {
    }

    @Override
    public void cancel() {
        ((bsg_1)aie_0.cfn().bmH()).a(this.mYC, this.mYD.eGQ());
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), this.mYC.getKey());
    }
}

