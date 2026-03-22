/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from cRA
 */
public class cra_1 {
    private static final int nmm = 303;

    private cra_1() {
    }

    public static void eMG() {
        crb_1.nmn.a(fzo_0.tHC, fzo_0.tHD, crd_12 -> {
            cpm_1 cpm_12 = null;
            for (cpm_1 cpm_13 : crd_12.chR()) {
                bjo_2 bjo_22;
                if (cpm_13 instanceof cpz_1) {
                    cpm_13.aH(crd_12);
                    if (!cpm_13.isEnabled() || !cpm_13.bxO()) continue;
                    return Optional.of(cpm_13);
                }
                if (cpm_12 != null || !cpm_13.getClass().isAssignableFrom(cqr_2.class) || !((bjo_22 = ((cqr_2)cpm_13).eMu()) instanceof bjr_2) || bjo_22.drR().clf() != 303) continue;
                cpm_13.aH(crd_12);
                if (!cpm_13.isEnabled() || !cpm_13.bxO()) continue;
                cpm_12 = cpm_13;
            }
            return Optional.ofNullable(cpm_12);
        });
    }
}

