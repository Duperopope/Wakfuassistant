/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cSl
 */
class csl_1
implements ftl_1 {
    final /* synthetic */ fey_2 nFm;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    csl_1(csk_1 csk_12, fey_2 fey_22) {
        this.nFm = fey_22;
    }

    @Override
    public void epr() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("artisansBookDialog");
        if (fhs_22 == null) {
            return;
        }
        fey_2 fey_22 = (fey_2)fhs_22.uH("craftTableWindow");
        float f2 = fyw_0.gqw().gqD().bRq();
        int n = fey_22.getX();
        int n2 = (float)(n + fey_22.getWidth() + this.nFm.getWidth()) < f2 ? (int)GC.b(n + fey_22.getWidth() + 20, 0.0f, f2 - (float)this.nFm.getWidth()) : (int)GC.b(n - this.nFm.getWidth() - 20, 0.0f, f2 - (float)this.nFm.getWidth());
        this.nFm.setX(n2);
        this.nFm.setY(fey_22.getY());
        this.nFm.b(this);
    }
}

