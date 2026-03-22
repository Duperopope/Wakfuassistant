/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXz
 */
class cxz_1
implements ftl_1 {
    final /* synthetic */ fey_2 nWu;
    final /* synthetic */ dbo_0 nWv;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cxz_1(cxx_1 cxx_12, fey_2 fey_22, dbo_0 dbo_02) {
        this.nWu = fey_22;
        this.nWv = dbo_02;
    }

    @Override
    public void epr() {
        this.nWu.setX(Math.min(this.nWv.getX(), fbj_1.getInstance().getWidth() - this.nWu.getWidth()));
        this.nWu.setY(Math.min(this.nWv.getY(), fbj_1.getInstance().getHeight() - this.nWu.getHeight()));
        this.nWu.b(this);
    }
}

