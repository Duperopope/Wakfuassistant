/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fEa
 */
class fea_2
implements fis_1 {
    final /* synthetic */ fdy_2 uiR;

    fea_2(fdy_2 fdy_22) {
        this.uiR = fdy_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.uiR.aQL == this.uiR.sAE) {
            this.uiR.setValue(this.uiR.sAD);
        } else {
            this.uiR.setValue(this.uiR.aQL + 1);
        }
        return true;
    }
}

