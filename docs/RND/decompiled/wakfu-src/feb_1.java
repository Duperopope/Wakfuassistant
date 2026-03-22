/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fEb
 */
class feb_1
implements fis_1 {
    final /* synthetic */ fdy_2 uiS;

    feb_1(fdy_2 fdy_22) {
        this.uiS = fdy_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.uiS.aQL == this.uiS.sAD) {
            this.uiS.setValue(this.uiS.sAE);
        } else {
            this.uiS.setValue(this.uiS.aQL - 1);
        }
        return true;
    }
}

