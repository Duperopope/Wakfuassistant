/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bGD
 */
class bgd_2
extends fms_2 {
    final /* synthetic */ bga_2 jWd;

    bgd_2(bga_2 bga_22) {
        this.jWd = bga_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (!(fiq_12 instanceof fli_2)) {
            return false;
        }
        fli_2 fli_22 = (fli_2)fiq_12;
        if (fli_22.bCC() != 27) {
            return false;
        }
        this.jWd.dTY();
        return true;
    }
}

