/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFU
 */
class cfu_2
implements cgz_1 {
    final /* synthetic */ bsn_1 mXl;
    final /* synthetic */ aKj mXm;
    final /* synthetic */ aKj mXn;
    final /* synthetic */ aKe mXo;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cfu_2(bsn_1 bsn_12, aKj aKj2, aKj aKj3, aKe aKe2) {
        this.mXl = bsn_12;
        this.mXm = aKj2;
        this.mXn = aKj3;
        this.mXo = aKe2;
    }

    @Override
    public void eKD() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mXl, this.mXm.aJr());
    }

    @Override
    public void cancel() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mXl, this.mXn.aJr());
        this.mXo.a(this.mXn, false);
    }
}

