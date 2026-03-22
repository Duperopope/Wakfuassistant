/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBR
 */
class fbr_2
implements fis_1 {
    final /* synthetic */ fbn_2 tWB;

    fbr_2(fbn_2 fbn_22) {
        this.tWB = fbn_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        flp_2 flp_22 = (flp_2)fiq_12;
        int n = flp_22.x(this.tWB) - this.tWB.dhZ;
        int n2 = flp_22.y(this.tWB) - this.tWB.dia;
        fth_1 fth_12 = null;
        int n3 = this.tWB.tWl.size();
        for (int i = 0; i < n3; ++i) {
            fth_1 fth_13 = this.tWB.tWl.get(i);
            if (!this.tWB.isInside(fth_13, n, n2)) continue;
            fth_12 = fth_13;
            break;
        }
        if (this.tWB.tWm == fth_12) {
            return false;
        }
        this.tWB.tWm = fth_12;
        this.tWB.tWn.setVisible(this.tWB.tWm != null);
        if (this.tWB.tWm != null) {
            this.tWB.tWo.setText(this.tWB.tWm.did());
        }
        return false;
    }
}

