/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cWn
 */
class cwn_1
implements ftl_1 {
    final /* synthetic */ fey_2 nSy;
    final /* synthetic */ fey_2 nSz;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cwn_1(fey_2 fey_22, fey_2 fey_23) {
        this.nSy = fey_22;
        this.nSz = fey_23;
    }

    @Override
    public void epr() {
        int n;
        float f2 = fyw_0.gqw().gqD().bRq() / fyw_0.gqw().gqD().getScale();
        int n2 = this.nSy.getX() + this.nSy.getWidth() / 2;
        fey_2 fey_22 = n2 < (n = this.nSz.getX() + this.nSz.getWidth() / 2) ? this.nSy : this.nSz;
        fey_2 fey_23 = n2 < n ? this.nSz : this.nSy;
        int n3 = fey_22.getX() + fey_22.getWidth() - fey_23.getX();
        if (n3 > 0) {
            int n4 = fey_22.getX();
            int n5 = (int)f2 - (fey_23.getX() + fey_23.getWidth());
            int n6 = Math.min(n3 / 2, n4);
            fey_22.setX(fey_22.getX() - n6);
            int n7 = Math.min(n3 - n6, n5);
            fey_23.setX(fey_23.getX() + n7);
        }
        this.nSy.b(this);
    }
}

