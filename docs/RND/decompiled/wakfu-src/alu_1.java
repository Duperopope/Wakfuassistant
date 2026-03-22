/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from alu
 */
class alu_1 {
    private static final Logger cFt = Logger.getLogger(alu_1.class);

    alu_1() {
    }

    public static boolean c(arj_2 arj_22, long l) {
        if (!alu_1.a(arj_22)) {
            return false;
        }
        return arj_22.bpw().hC(l);
    }

    public static boolean a(arj_2 arj_22) {
        if (!arj_22.bpD()) {
            return false;
        }
        return aiv_2.bBr().bpD();
    }

    public static boolean gh(long l) {
        long l2 = System.currentTimeMillis();
        if (!alb_2.bBL().f(l2, l)) {
            return false;
        }
        alb_2.bBL().g(l2, l);
        return true;
    }

    public static void a(arj_2 arj_22, long l, byte by, short s, int n, boolean bl) {
        if (l == 0L) {
            cFt.debug((Object)"Id du son nul");
            return;
        }
        try {
            ZC zC = (ZC)arj_22;
            ahm_1 ahm_12 = aiv_2.bBr().a(l, (float)by / 100.0f, s, -1L, -1L, arj_22.bqo(), zC, n);
            if (bl && ahm_12 != null) {
                zC.e(l, ahm_12.ccq());
            }
        }
        catch (Exception exception) {
            cFt.debug((Object)("soundExtension or soundPath not initialized " + String.valueOf(exception)));
        }
    }

    public static void a(arj_2 arj_22, long l, float f2, float f3, short s, int n, boolean bl) {
        if (l == 0L) {
            cFt.debug((Object)"Id du son nul");
            return;
        }
        try {
            ZC zC = (ZC)arj_22;
            ahm_1 ahm_12 = aiv_2.bBr().a(l, f2 / 100.0f, f3, s, -1L, -1L, arj_22.bqo(), zC, n);
            if (bl && ahm_12 != null) {
                zC.e(l, ahm_12.ccq());
            }
        }
        catch (Exception exception) {
            cFt.debug((Object)("soundExtension or soundPath not initialized " + String.valueOf(exception)));
        }
    }

    public static void a(arj_2 arj_22, long l, float f2, float f3, short s, int n, boolean bl, int n2) {
        if (l == 0L) {
            cFt.debug((Object)"Id du son nul");
            return;
        }
        try {
            ZC zC = (ZC)arj_22;
            ahm_1 ahm_12 = aiv_2.bBr().a(l, f2 / 100.0f, f3, (int)s, -1L, -1L, arj_22.bqo(), n2, zC, n);
            if (bl && ahm_12 != null) {
                zC.e(l, ahm_12.ccq());
            }
        }
        catch (Exception exception) {
            cFt.debug((Object)("soundExtension or soundPath not initialized " + String.valueOf(exception)));
        }
    }

    public static void a(arj_2 arj_22, long l, byte by, short s, boolean bl) {
        if (l == 0L) {
            cFt.debug((Object)"Id du son nul");
            return;
        }
        try {
            ahm_1 ahm_12 = aiv_2.bBr().a(l, (float)by / 100.0f, s, -1L, -1L, arj_22.bqo());
            if (bl && ahm_12 != null) {
                ((ZC)arj_22).e(l, ahm_12.ccq());
            }
        }
        catch (Exception exception) {
            cFt.debug((Object)("soundExtension or soundPath not initialized " + String.valueOf(exception)));
        }
    }

    public static void a(arj_2 arj_22, long l, float f2, float f3, short s, boolean bl) {
        if (l == 0L) {
            cFt.debug((Object)"Id du son nul");
            return;
        }
        try {
            ahm_1 ahm_12 = aiv_2.bBr().a(l, f2 / 100.0f, f3, s, -1L, -1L, arj_22.bqo());
            if (bl && ahm_12 != null) {
                ((ZC)arj_22).e(l, ahm_12.ccq());
            }
        }
        catch (Exception exception) {
            cFt.debug((Object)("soundExtension or soundPath not initialized " + String.valueOf(exception)));
        }
    }

    public static void a(arj_2 arj_22, long l, float f2, float f3, short s, boolean bl, int n) {
        if (l == 0L) {
            cFt.debug((Object)"Id du son nul");
            return;
        }
        try {
            ahm_1 ahm_12 = aiv_2.bBr().a(l, f2 / 100.0f, f3, s, -1L, -1L, arj_22.bqo(), n);
            if (bl && ahm_12 != null) {
                ((ZC)arj_22).e(l, ahm_12.ccq());
            }
        }
        catch (Exception exception) {
            cFt.debug((Object)("soundExtension or soundPath not initialized " + String.valueOf(exception)));
        }
    }
}

