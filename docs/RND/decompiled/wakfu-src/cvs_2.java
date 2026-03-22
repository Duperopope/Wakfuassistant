/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVS
 */
class cvs_2
implements ftl_1 {
    final /* synthetic */ fey_2 nQY;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cvs_2(cvo_2 cvo_22, fey_2 fey_22) {
        this.nQY = fey_22;
    }

    @Override
    public void epr() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("inventoryDialog");
        if (fhs_22 == null) {
            return;
        }
        fey_2 fey_22 = (fey_2)fhs_22.uH("equipInventWindow");
        float f2 = fyw_0.gqw().gqD().bRq() / fyw_0.gqw().gqD().getScale();
        int n = fey_22.getX();
        int n2 = (float)(n + fey_22.getWidth() + this.nQY.getWidth()) < f2 ? (int)GC.b(n + fey_22.getWidth() + 40, 0.0f, f2 - (float)this.nQY.getWidth()) : (int)GC.b(n - this.nQY.getWidth() - 40, 0.0f, f2 - (float)this.nQY.getWidth());
        this.nQY.setX(n2);
        this.nQY.b(this);
    }
}

