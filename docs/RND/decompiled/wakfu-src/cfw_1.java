/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFW
 */
class cfw_1
implements cgz_1 {
    final /* synthetic */ bsn_1 mXs;
    final /* synthetic */ bgv_0 mXt;
    final /* synthetic */ boolean mXu;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cfw_1(bsn_1 bsn_12, bgv_0 bgv_02, boolean bl) {
        this.mXs = bsn_12;
        this.mXt = bgv_02;
        this.mXu = bl;
    }

    @Override
    public void eKD() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mXs, this.mXt.aPm());
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null && this.mXu == bgt_02.bwb()) {
            bgt_02.a(this.mXt);
        }
    }

    @Override
    public void cancel() {
    }
}

