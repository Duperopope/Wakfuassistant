/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fEX
 */
class fex_1
implements fis_1 {
    final /* synthetic */ few_2 uop;

    fex_1(few_2 few_22) {
        this.uop = few_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (fiq_12.gBE() == this.uop.uog) {
            return false;
        }
        flg_2 flg_22 = (flg_2)fiq_12;
        axb_2 axb_22 = (axb_2)flg_22.getItemValue();
        this.uop.x(axb_22);
        return true;
    }
}

