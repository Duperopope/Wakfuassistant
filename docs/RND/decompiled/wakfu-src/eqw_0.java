/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eQw
 */
class eqw_0
implements enw_0 {
    final /* synthetic */ enq_0 rfX;
    final /* synthetic */ eqv_0 rfY;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    eqw_0(eqv_0 eqv_02, enq_0 enq_02) {
        this.rfY = eqv_02;
        this.rfX = enq_02;
    }

    @Override
    public void e(ero_0 ero_02) {
        if (ero_02.getValue() != 0) {
            this.rfY.rfU[0] = ero_02.getValue();
        }
        this.rfX.b(this);
    }

    @Override
    public void f(ero_0 ero_02) {
    }
}

