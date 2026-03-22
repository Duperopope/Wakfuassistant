/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFX
 */
class cfx_1
implements cgz_1 {
    final /* synthetic */ bsn_1 mXv;
    final /* synthetic */ boolean mXw;
    final /* synthetic */ boolean mXx;
    final /* synthetic */ aKe mXy;
    final /* synthetic */ aKj mXz;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cfx_1(bsn_1 bsn_12, boolean bl, boolean bl2, aKe aKe2, aKj aKj2) {
        this.mXv = bsn_12;
        this.mXw = bl;
        this.mXx = bl2;
        this.mXy = aKe2;
        this.mXz = aKj2;
    }

    @Override
    public void eKD() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mXv, this.mXw);
    }

    @Override
    public void cancel() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mXv, this.mXx);
        this.mXy.b(this.mXx, this.mXz);
    }
}

