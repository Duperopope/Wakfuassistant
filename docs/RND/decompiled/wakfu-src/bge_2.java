/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bGE
 */
class bge_2
extends fmi_2 {
    final /* synthetic */ bga_2 jWe;

    bge_2(bga_2 bga_22) {
        this.jWe = bga_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (fiq_12 == null) {
            return false;
        }
        if (!(fiq_12 instanceof flp_2)) {
            return false;
        }
        flp_2 flp_22 = (flp_2)fiq_12;
        if (flp_22.gEn() > 1) {
            return false;
        }
        if (flp_22.gEk()) {
            this.jWe.dUg().ifPresent(ffV2 -> {
                bgt_0 bgt_02 = this.jWe.ln(ffV2.LV());
                if (bgt_02 == null) {
                    return;
                }
                if (!this.jWe.F(bgt_02)) {
                    this.jWe.dTY();
                    return;
                }
                if (!this.jWe.d(bgt_02, (ffV)ffV2)) {
                    this.jWe.a(flp_22, bgt_02, (ffV)ffV2);
                    return;
                }
                this.jWe.b(flp_22, bgt_02, (ffV)ffV2);
            });
        } else if (flp_22.gEm()) {
            this.jWe.dTY();
        }
        return false;
    }
}

