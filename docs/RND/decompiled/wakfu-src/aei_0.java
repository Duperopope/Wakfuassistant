/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aei
 */
class aei_0
implements ZJ {
    final /* synthetic */ adx_0 cmR;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aei_0(aeh_0 aeh_02, adx_0 adx_02) {
        this.cmR = adx_02;
    }

    @Override
    public void animationEnded(ZC zC) {
        ((ads_0)this.cmR).b(this);
        if (this.cmR.bwb()) {
            this.cmR.bwc();
        }
    }
}

