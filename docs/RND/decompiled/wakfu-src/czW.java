/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class czW
implements aaq_2<cvj> {
    @Override
    public boolean a(cvj cvj2) {
        Optional<ftv_0> optional = cvj2.eDO();
        if (optional.isEmpty()) {
            cap_1.erG().mL(cvj2.ZC());
            byj_1.epo().a(byc_1.c(byh_1.lAz, "Impossible de d\u00e9placer le b\u00e2timent " + cvj2.ZC() + " ici"));
            return false;
        }
        if (!cap_1.erG().erI()) {
            return false;
        }
        cap_1.erG().c(optional.get(), cvj2.eDP());
        return false;
    }

    @Override
    public int bkq() {
        return 13888;
    }
}

