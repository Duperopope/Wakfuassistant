/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eZT
 */
public class ezt_1 {
    private ezt_1() {
    }

    public static uw_0 a(ezv_1 ezv_12, eyr_2 eyr_22, double d2) {
        return ezt_1.a(ezv_12.fPJ(), eyr_22.fQp(), d2);
    }

    public static boolean s(ezv_1 ezv_12) {
        return !ezv_12.fPK().bjv() && ezv_12.fPK().h(ue_0.bjV().bjm());
    }

    public static boolean b(ezv_1 ezv_12, eyr_2 eyr_22, double d2) {
        if (ezt_1.s(ezv_12)) {
            return false;
        }
        uw_0 uw_02 = ezt_1.a(ezv_12.fPJ(), eyr_22.fQp(), d2);
        return uw_02.i(ue_0.bjV().bjc());
    }

    public static boolean c(ezv_1 ezv_12, eyr_2 eyr_22, double d2) {
        uw_0 uw_02 = ezt_1.a(ezv_12.fPJ(), eyr_22.fQp(), d2);
        return uw_02.h(ue_0.bjV().bjc());
    }

    public static uw_0 d(ezv_1 ezv_12, eyr_2 eyr_22, double d2) {
        return ezt_1.a(ezv_12.fPK(), eyr_22.fQr(), d2);
    }

    public static uw_0 a(ux_0 ux_02, ua_0 ua_02, double d2) {
        uw_0 uw_02 = new uw_0(ux_02);
        if (ua_02.aYI()) {
            uw_02.a(new uz_0(GC.g((double)ua_02.bjS() * d2)));
        }
        return uw_02;
    }
}

