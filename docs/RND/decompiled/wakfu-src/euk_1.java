/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eUK
 */
public final class euk_1 {
    public static boolean a(exP exP2, fqE fqE2, fqD fqD2) {
        int n = fqD2.g(fqE2, (Object)exP2, null, exP2.fgg());
        int n2 = exP2.e(exx_2.rGk).aYB();
        if (n > 0) {
            if (exP2.a(exe_1.rDI)) {
                n2 = -1;
            } else if (exP2.a(exe_1.rDH)) {
                n2 -= 2;
            } else if (exP2.a(exe_1.rDG)) {
                --n2;
            }
        }
        return n <= n2;
    }

    public static boolean b(exP exP2, fqE fqE2, fqD fqD2) {
        int n = fqD2.e(fqE2, (Object)exP2, null, exP2.fgg());
        int n2 = exP2.e(exx_2.rGl).aYB();
        if (n > 0) {
            if (exP2.a(exe_1.rDz)) {
                n2 = -1;
            } else if (exP2.a(exe_1.rDy)) {
                n2 -= 2;
            } else if (exP2.a(exe_1.rDx)) {
                --n2;
            }
        }
        return n <= n2;
    }

    public static boolean c(exP exP2, fqE fqE2, fqD fqD2) {
        int n = fqD2.h(fqE2, exP2, null, exP2.fgg());
        int n2 = exP2.e(exx_2.rGj).aYB();
        if (n > 0) {
            if (exP2.a(exe_1.rDY)) {
                return false;
            }
            if (exP2.a(exe_1.rDF)) {
                n2 = -1;
            } else if (exP2.a(exe_1.rDE)) {
                n2 -= 2;
            } else if (exP2.a(exe_1.rDD)) {
                --n2;
            }
        }
        return n <= n2;
    }

    public static boolean a(exP exP2, exx_2 exx_22, fqE fqE2, fqD fqD2) {
        fqO fqO2 = fqD2.g(fqE2, exP2, null, exP2.fgg());
        int n = fqO2.r(exx_22);
        if (n == 0) {
            return true;
        }
        int n2 = exP2.e(exx_22).aYB();
        return n <= n2;
    }

    public static boolean d(exP exP2, fqE fqE2, fqD fqD2) {
        fqO fqO2 = fqD2.g(fqE2, exP2, null, exP2.fgg());
        int n = fqK.a(fqO2, exP2);
        if (n >= 0) {
            return true;
        }
        int n2 = exP2.e(exx_2.rHH).aYB();
        return Math.abs(n) <= n2;
    }

    public static boolean b(fqD fqD2) {
        return fqD2.eeY();
    }

    public static boolean a(exP exP2, fqD fqD2) {
        return !exP2.fha() || fqD2.giN();
    }

    public static boolean e(exP exP2, fqE fqE2, fqD fqD2) {
        int n;
        int n2 = fqD2.f(fqE2, (Object)exP2, null, exP2.fgg());
        return n2 <= (n = exP2.e(exx_2.rHT).aYB());
    }
}

