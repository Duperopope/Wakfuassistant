/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGp
 */
class cgp_2
implements cgz_1 {
    final /* synthetic */ afe mYl;
    final /* synthetic */ boolean mYm;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cgp_2(afe afe2, boolean bl) {
        this.mYl = afe2;
        this.mYm = bl;
    }

    @Override
    public void eKD() {
        ((bsg_1)aie_0.cfn().bmH()).a(this.mYl, this.mYm);
    }

    @Override
    public void cancel() {
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), this.mYl.getKey());
    }
}

