/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class czU
implements aaq_2<cvh> {
    @Override
    public boolean a(cvh cvh2) {
        Optional<ftv_0> optional = cvh2.eDO();
        if (optional.isEmpty()) {
            byj_1.epo().a(byc_1.c(byh_1.lAz, "Impossible de construire le b\u00e2timent ici!"));
            return false;
        }
        if (!cap_1.erG().erI()) {
            return false;
        }
        cap_1.erG().b(optional.get(), cvh2.eDP());
        return false;
    }

    @Override
    public int bkq() {
        return 12312;
    }
}

