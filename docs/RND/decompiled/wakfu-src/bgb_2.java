/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bGB
 */
class bgb_2
extends fmg_1 {
    final /* synthetic */ bga_2 jWb;

    bgb_2(bga_2 bga_22) {
        this.jWb = bga_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        this.jWb.dUg().ifPresentOrElse(ffV2 -> {
            bgt_0 bgt_02 = this.jWb.ln(ffV2.LV());
            if (bgt_02 == null || !this.jWb.d(bgt_02, (ffV)ffV2)) {
                fhn_1.gzT().a(this.jWb.dUc(), true);
            } else {
                fhn_1.gzT().a(this.jWb.dUb(), true);
            }
        }, () -> fhn_1.gzT().a(this.jWb.dUa(), true));
        return false;
    }
}

