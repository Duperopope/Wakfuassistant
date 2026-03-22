/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bGC
 */
class bgc_2
extends fmh_1 {
    final /* synthetic */ bga_2 jWc;

    bgc_2(bga_2 bga_22) {
        this.jWc = bga_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        flu_1 flu_12;
        if (fiq_12 instanceof flu_1 && (flu_12 = (flu_1)fiq_12).getValue() instanceof ffV) {
            this.jWc.dTY();
        }
        return false;
    }
}

