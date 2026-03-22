/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVV
 */
class cvv_1
implements ftl_1 {
    final /* synthetic */ fey_2 nRh;
    final /* synthetic */ dbE nRi;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cvv_1(cvu_1 cvu_12, fey_2 fey_22, dbE dbE2) {
        this.nRh = fey_22;
        this.nRi = dbE2;
    }

    @Override
    public void epr() {
        this.nRh.setX(Math.min(this.nRi.getX(), fbj_1.getInstance().getWidth() - this.nRh.getWidth()));
        this.nRh.setY(Math.min(this.nRi.getY(), fbj_1.getInstance().getHeight() - this.nRh.getHeight()));
        this.nRh.b(this);
    }
}

