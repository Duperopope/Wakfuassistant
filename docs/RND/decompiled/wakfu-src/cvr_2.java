/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVR
 */
class cvr_2
implements ftl_1 {
    final /* synthetic */ fey_2 nQV;
    final /* synthetic */ int nQW;
    final /* synthetic */ int nQX;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cvr_2(cvo_2 cvo_22, fey_2 fey_22, int n, int n2) {
        this.nQV = fey_22;
        this.nQW = n;
        this.nQX = n2;
    }

    @Override
    public void epr() {
        this.nQV.setPosition(this.nQW, this.nQX + 10 - this.nQV.getHeight());
        this.nQV.b(this);
    }
}

