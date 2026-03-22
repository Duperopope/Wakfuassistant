/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDE
 */
class fde_2
implements fis_1 {
    final /* synthetic */ fdd_2 uht;

    fde_2(fdd_2 fdd_22) {
        this.uht = fdd_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        boolean bl = this.uht.getAppearance().grr();
        if (fiq_12.gBF()) {
            return bl;
        }
        if (this.uht.getAppearance().isChecked()) {
            fhy_2.gBq().eHT();
        } else {
            fhy_2.gBq().eHU();
        }
        fiq_12.oZ(true);
        return bl;
    }
}

