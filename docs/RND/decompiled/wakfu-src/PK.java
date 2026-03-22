/*
 * Decompiled with CFR 0.152.
 */
public class PK {
    private static final uw_0 beN = new uw_0(uw_0.bju());

    public static boolean a(PL pL, ux_0 ux_02) {
        if (!pL.apo()) {
            return false;
        }
        if (pL.aYp() == null) {
            return true;
        }
        ux_0 ux_03 = ux_02.a(pL.aYp(), pL.aYq());
        beN.cH(pL.atA());
        if (ux_03.h(beN)) {
            return true;
        }
        pL.T(false);
        return false;
    }

    public static boolean b(PL pL, ux_0 ux_02) {
        if (pL.app() && !pL.aYo()) {
            return false;
        }
        if (!pL.app() && PK.a(pL, ux_02)) {
            return false;
        }
        if (PK.e(pL, ux_02)) {
            return false;
        }
        if (PK.d(pL, ux_02)) {
            return false;
        }
        return !PK.c(pL, ux_02) || pL.aYt();
    }

    public static boolean c(PL pL, ux_0 ux_02) {
        return !PK.a(pL, ux_02) && pL.atA() != 0L;
    }

    public static boolean d(PL pL, ux_0 ux_02) {
        if (pL.aYp() == null || pL.atA() == 0L) {
            return false;
        }
        beN.cH(pL.atA());
        uw_0 uw_02 = new uw_0(ux_02.a(pL.aYp(), pL.aYq()));
        return uw_02.h(beN);
    }

    public static boolean e(PL pL, ux_0 ux_02) {
        if (pL.aYn() != 0L && pL.aYu() != 0L) {
            beN.cH(pL.aYu());
            beN.d((int)(pL.aYn() / 1000L), 0, 0, 0);
            if (ux_02.g(beN)) {
                return true;
            }
            pL.dd(0L);
        }
        return false;
    }

    public static boolean f(PL pL, ux_0 ux_02) {
        if (pL.app()) {
            return false;
        }
        if (pL.getDuration() == 0) {
            return false;
        }
        if (pL.atA() == 0L) {
            return false;
        }
        beN.cH(pL.atA());
        beN.d(pL.getDuration() / 1000, 0, 0, 0);
        return ux_02.g(beN);
    }

    public static ua_0 g(PL pL, ux_0 ux_02) {
        if (pL.aYu() == 0L) {
            return ua_0.bwa;
        }
        uw_0 uw_02 = uw_0.fn(pL.aYu());
        uw_02.d((int)(pL.aYn() / 1000L), 0, 0, 0);
        return ux_02.l(uw_02);
    }

    public static ua_0 a(PJ pJ, ux_0 ux_02) {
        if (pJ.aYp() == null) {
            return ua_0.bwa;
        }
        uw_0 uw_02 = new uw_0(ux_02.a(pJ.aYp(), pJ.aYq()));
        uw_02.a(pJ.aYq());
        return ux_02.l(uw_02);
    }

    public static ua_0 h(PL pL, ux_0 ux_02) {
        if (pL.getDuration() == 0) {
            return ua_0.bwa;
        }
        uw_0 uw_02 = uw_0.fn(pL.atA());
        uw_02.d(pL.getDuration() / 1000, 0, 0, 0);
        return ux_02.l(uw_02);
    }

    public static ua_0 i(PL pL, ux_0 ux_02) {
        if (pL.aYp() == null) {
            return ua_0.bwa;
        }
        beN.cH(pL.atA());
        uw_0 uw_02 = new uw_0(ux_02.a(pL.aYp(), pL.aYq()));
        if (!uw_02.h(beN)) {
            return ua_0.bwa;
        }
        uw_02.a(pL.aYq());
        return ux_02.l(uw_02);
    }
}

