/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCM
 */
class fcm_1
implements fis_1 {
    final /* synthetic */ fcj_2 uar;

    fcm_1(fcj_2 fcj_22) {
        this.uar = fcj_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.uar.uah.getAppearance().isArmed()) {
            this.uar.uab = 1;
            abb_2.bUA().b(this.uar.uaf);
            abb_2.bUA().a(this.uar.uaf, 500L, this.uar.uab, 1L);
        }
        return false;
    }
}

