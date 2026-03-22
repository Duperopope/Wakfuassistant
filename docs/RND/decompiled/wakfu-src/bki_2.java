/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bkI
 */
class bki_2
implements ZJ {
    final /* synthetic */ bcs_0 irH;
    final /* synthetic */ bdj_2 irI;
    final /* synthetic */ abi_1 irJ;
    final /* synthetic */ bkg_2 irK;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bki_2(bkg_2 bkg_22, bcs_0 bcs_02, bdj_2 bdj_22, abi_1 abi_12) {
        this.irK = bkg_22;
        this.irH = bcs_02;
        this.irI = bdj_22;
        this.irJ = abi_12;
    }

    @Override
    public void animationEnded(ZC zC) {
        this.irH.setVisible(true);
        this.irI.b(this);
        this.irK.a(this.irI, this.irH);
        this.irI.dT(this.irI.bpT());
        this.irI.a(this.irJ);
        if (this.irK.irC != null) {
            this.irK.irC.animationEnded(zC);
        }
        this.irK.irC = null;
        this.irK.irE = null;
        this.irK.irA.a((eid_0)null);
    }
}

