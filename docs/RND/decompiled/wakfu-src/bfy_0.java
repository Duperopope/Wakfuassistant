/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bFy
 */
class bfy_0
extends fmi_2 {
    bfy_0(bfx_1 bfx_12) {
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (fiq_12 == null || fiq_12 instanceof flp_2 && ((flp_2)fiq_12).gEm()) {
            czi_2.eYU().b(this);
            fbj_1.getInstance().b(fzq_0.tJT, this, true);
        }
        return false;
    }
}

