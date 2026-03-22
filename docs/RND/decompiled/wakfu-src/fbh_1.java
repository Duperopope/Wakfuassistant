/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBh
 */
class fbh_1
implements fis_1 {
    final /* synthetic */ fbg_2 tRU;

    fbh_1(fbg_2 fbg_22) {
        this.tRU = fbg_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        flp_2 flp_22 = (flp_2)fiq_12;
        if (this.tRU.tRN) {
            if (this.tRU.uki == null) {
                return true;
            }
            if (this.tRU.uki.gE(flp_22.x(this.tRU), flp_22.y(this.tRU))) {
                return true;
            }
            fys_0 fys_02 = this.tRU.tRP.getAppearance();
            if (fys_02 == null) {
                return true;
            }
            if (!fys_02.gE(flp_22.x(this.tRU.tRP), flp_22.y(this.tRU.tRP))) {
                this.tRU.gsH();
                return true;
            }
        }
        return false;
    }
}

