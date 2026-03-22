/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFY
 */
class cfy_1
implements cgz_1 {
    final /* synthetic */ bsn_1 mXA;
    final /* synthetic */ boolean mXB;
    final /* synthetic */ boolean mXC;
    final /* synthetic */ aKe mXD;
    final /* synthetic */ aKj mXE;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cfy_1(bsn_1 bsn_12, boolean bl, boolean bl2, aKe aKe2, aKj aKj2) {
        this.mXA = bsn_12;
        this.mXB = bl;
        this.mXC = bl2;
        this.mXD = aKe2;
        this.mXE = aKj2;
    }

    @Override
    public void eKD() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mXA, this.mXB);
    }

    @Override
    public void cancel() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mXA, this.mXC);
        this.mXD.a(this.mXC, this.mXE);
    }
}

