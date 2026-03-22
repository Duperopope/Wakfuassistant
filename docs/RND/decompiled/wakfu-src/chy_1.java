/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHy
 */
class chy_1
implements fis_1 {
    final /* synthetic */ fea_1 mZI;
    final /* synthetic */ fey_2 mZJ;
    final /* synthetic */ int mZK;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    chy_1(fea_1 fea_12, fey_2 fey_22, int n) {
        this.mZI = fea_12;
        this.mZJ = fey_22;
        this.mZK = n;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        this.mZI.b(fiq_12.gBy(), this, false);
        int n = fhz_2.gAS().getX() - this.mZI.getX(this.mZJ) - this.mZI.getWidth() / 2;
        int n2 = fhz_2.gAS().getY() - this.mZI.getY(this.mZJ) - this.mZI.getHeight() / 2;
        this.mZJ.setPosition(n, n2);
        fbj_1.getInstance().setDragged(this.mZI, this.mZK);
        this.mZI.setDragMousePosition(fhz_2.gAS().getX(), fhz_2.gAS().getY());
        return false;
    }
}

