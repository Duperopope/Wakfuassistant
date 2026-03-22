/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAF
 */
class faf_2
implements fis_1 {
    final /* synthetic */ fad_1 tPj;

    faf_2(fad_1 fad_12) {
        this.tPj = fad_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.tPj.isEnabledFull()) {
            this.tPj.getAppearance().gqU();
        }
        return false;
    }
}

