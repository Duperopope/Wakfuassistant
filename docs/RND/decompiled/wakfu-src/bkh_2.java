/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bkH
 */
class bkh_2
implements ZJ {
    final /* synthetic */ bdj_2 irF;
    final /* synthetic */ bkg_2 irG;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bkh_2(bkg_2 bkg_22, bdj_2 bdj_22) {
        this.irG = bkg_22;
        this.irF = bdj_22;
    }

    @Override
    public void animationEnded(ZC zC) {
        this.irF.b(this);
        this.irG.t(this.irF);
        this.irF.b((afV)null, 0);
        this.irG.irD = null;
    }
}

