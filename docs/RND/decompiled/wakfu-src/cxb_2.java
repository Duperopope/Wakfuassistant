/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXb
 */
class cxb_2
implements fis_1 {
    final /* synthetic */ faw_2 nUB;
    final /* synthetic */ cwz_1 nUC;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cxb_2(cwz_1 cwz_12, faw_2 faw_22) {
        this.nUC = cwz_12;
        this.nUB = faw_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.nUB.getX() <= 0) {
            return false;
        }
        this.nUC.bmw = true;
        while (!this.nUC.nUo.isEmpty() && this.nUC.nUp.size() < 9) {
            this.nUC.b(this.nUC.nUo.removeLast());
        }
        this.nUB.b(fzq_0.tKi, this, true);
        this.nUB.setEnablePositionEvents(false);
        this.nUB.setVisible(false);
        return true;
    }
}

