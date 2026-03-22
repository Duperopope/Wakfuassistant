/*
 * Decompiled with CFR 0.152.
 */
class aWP
implements ZJ {
    final /* synthetic */ bdj_2 hvL;
    final /* synthetic */ bgy hvM;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aWP(awo_0 awo_02, bdj_2 bdj_22, bgy bgy2) {
        this.hvL = bdj_22;
        this.hvM = bgy2;
    }

    @Override
    public void animationEnded(ZC zC) {
        this.hvL.b(this);
        this.hvL.i(this.hvM.bcB());
        this.hvL.bd(this.hvM.bcP());
    }
}

