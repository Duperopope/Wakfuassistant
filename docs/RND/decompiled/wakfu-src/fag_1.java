/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAG
 */
class fag_1
implements fis_1 {
    final /* synthetic */ fad_1 tPk;

    fag_1(fad_1 fad_12) {
        this.tPk = fad_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.tPk.isEnabledFull()) {
            this.tPk.getAppearance().gqT();
        }
        return false;
    }
}

