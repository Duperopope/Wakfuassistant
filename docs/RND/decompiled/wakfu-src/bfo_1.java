/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bFO
 */
class bfo_1
extends fmi_2 {
    bfo_1(bfn_1 bfn_12) {
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (fiq_12 == null || fiq_12 instanceof flp_2 && ((flp_2)fiq_12).gEm()) {
            czi_2.eYU().b(this);
            fbj_1.getInstance().b(fzq_0.tJT, this, true);
            fhn_1.gzT().bYz();
        }
        return false;
    }
}

