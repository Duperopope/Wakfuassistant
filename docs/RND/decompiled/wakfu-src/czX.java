/*
 * Decompiled with CFR 0.152.
 */
public class czX
implements aaq_2<cvk> {
    @Override
    public boolean a(cvk cvk2) {
        if (!cvk2.eDR()) {
            byj_1.epo().a(byc_1.c(byh_1.lAz, "Impossible de d\u00e9truire ce b\u00e2timent!"));
            return false;
        }
        if (!cap_1.erG().erI()) {
            return false;
        }
        cap_1.erG().E(cvk2.ZC(), cvk2.eDP());
        return false;
    }

    @Override
    public int bkq() {
        return 13431;
    }
}

