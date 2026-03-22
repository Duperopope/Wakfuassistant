/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eSH
 */
final class esh_0 {
    private esh_0() {
    }

    public static Comparator<qu_0> a(enk_0 enk_02, int n, int n2) {
        if (enk_02.a(eNi.qWv)) {
            return new esf_0();
        }
        if (enk_02.a(eNi.qWM)) {
            return new esg_0();
        }
        if (enk_02.a(eNi.qWB)) {
            return new esc_0(n, n2);
        }
        if (enk_02.a(eNi.qWN)) {
            return new esd_0(n, n2);
        }
        aoh_1 aoh_12 = enk_02.aZS();
        if (aoh_12 == null) {
            return null;
        }
        aoi_1 aoi_12 = aoh_12.bEl();
        switch (aoi_12) {
            case cLj: 
            case cLr: 
            case cLs: {
                return new esc_0(n, n2);
            }
        }
        return null;
    }
}

