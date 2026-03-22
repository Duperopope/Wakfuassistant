/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdv
 */
class bdv_2
implements ZJ {
    final /* synthetic */ bdm_1 hLR;
    final /* synthetic */ bdm_1 hLS;
    final /* synthetic */ bdt_2 hLT;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bdv_2(bdt_2 bdt_22, bdm_1 bdm_12, bdm_1 bdm_13) {
        this.hLT = bdt_22;
        this.hLR = bdm_12;
        this.hLS = bdm_13;
    }

    @Override
    public void animationEnded(ZC zC) {
        this.hLT.hLu.b(this);
        if (this.hLT.hLv != null) {
            this.hLT.hLv.a(this.hLR, this.hLS, this.hLT.hLu);
            if (this.hLT.hLv.dem()) {
                this.hLT.hLv = null;
            }
        }
    }
}

