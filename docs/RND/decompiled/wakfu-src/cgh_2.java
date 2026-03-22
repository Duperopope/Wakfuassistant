/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGh
 */
class cgh_2
implements cgz_1 {
    final /* synthetic */ bsn_1 mXW;
    final /* synthetic */ boolean mXX;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cgh_2(bsn_1 bsn_12, boolean bl) {
        this.mXW = bsn_12;
        this.mXX = bl;
    }

    @Override
    public void eKD() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mXW, this.mXX);
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), this.mXW.getKey());
    }

    @Override
    public void cancel() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mXW, !this.mXX);
    }
}

