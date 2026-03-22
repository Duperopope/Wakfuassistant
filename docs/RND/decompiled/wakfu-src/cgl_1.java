/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGl
 */
class cgl_1
implements cgz_1 {
    final /* synthetic */ fiq_1 mYe;
    final /* synthetic */ bsn_1 mYf;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cgl_1(fiq_1 fiq_12, bsn_1 bsn_12) {
        this.mYe = fiq_12;
        this.mYf = bsn_12;
    }

    @Override
    public void eKD() {
        float f2 = ((flw_2)this.mYe).getValue() / 2.0f;
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mYf, f2);
    }

    @Override
    public void cancel() {
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), this.mYf.getKey());
    }
}

