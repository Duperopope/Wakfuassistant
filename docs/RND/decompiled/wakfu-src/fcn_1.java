/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCN
 */
class fcn_1
implements fis_1 {
    final /* synthetic */ fcj_2 uas;

    fcn_1(fcj_2 fcj_22) {
        this.uas = fcj_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.uas.uai.getAppearance().isArmed()) {
            this.uas.uab = 2;
            abb_2.bUA().b(this.uas.uaf);
            abb_2.bUA().a(this.uas.uaf, 500L, this.uas.uab, 1L);
        }
        return false;
    }
}

