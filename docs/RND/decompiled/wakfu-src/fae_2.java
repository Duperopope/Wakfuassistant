/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAE
 */
class fae_2
implements fis_1 {
    final /* synthetic */ fad_1 tPi;

    fae_2(fad_1 fad_12) {
        this.tPi = fad_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        fli_2 fli_22 = (fli_2)fiq_12;
        if (fli_22.bCC() == 10) {
            this.tPi.gsw();
            fbj_1.getInstance().setKeyEventConsumed(true);
        }
        return false;
    }
}

