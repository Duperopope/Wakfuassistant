/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aqX
 */
public abstract sealed class aqx_1
extends Enum<aqx_1>
permits aqy_1, arg_1, arh_2, ari_2, arj_1, ark_1, arl_1, arm_1, arn_1, aqz_1, ara_2, arb_2, arc_2, ard_1, are_2, arf_1 {
    public static final /* enum */ aqx_1 cRK = new aqy_1();
    public static final /* enum */ aqx_1 cRL = new arg_1();
    public static final /* enum */ aqx_1 cRM = new arh_2();
    public static final /* enum */ aqx_1 cRN = new ari_2();
    public static final /* enum */ aqx_1 cRO = new arj_1();
    public static final /* enum */ aqx_1 cRP = new ark_1();
    public static final /* enum */ aqx_1 cRQ = new arl_1();
    public static final /* enum */ aqx_1 cRR = new arm_1();
    public static final /* enum */ aqx_1 cRS = new arn_1();
    public static final /* enum */ aqx_1 cRT = new aqz_1();
    public static final /* enum */ aqx_1 cRU = new ara_2();
    public static final /* enum */ aqx_1 cRV = new arb_2();
    public static final /* enum */ aqx_1 cRW = new arc_2();
    public static final /* enum */ aqx_1 cRX = new ard_1();
    public static final /* enum */ aqx_1 cRY = new are_2();
    public static final /* enum */ aqx_1 cRZ = new arf_1();
    private static final Logger cSa;
    private static final /* synthetic */ aqx_1[] cSb;

    public static aqx_1[] values() {
        return (aqx_1[])cSb.clone();
    }

    public static aqx_1 valueOf(String string) {
        return Enum.valueOf(aqx_1.class, string);
    }

    public static aqx_1 tH(int n) {
        switch (n) {
            case 3: {
                return cRS;
            }
            case 2: {
                return cRW;
            }
            case 0: {
                return cRK;
            }
            case 8: {
                return cRL;
            }
            case 12: {
                return cRM;
            }
            case 4: {
                return cRN;
            }
            case 1: {
                return cRO;
            }
            case 9: {
                return cRP;
            }
            case 13: {
                return cRQ;
            }
            case 5: {
                return cRR;
            }
            case 11: {
                return cRT;
            }
            case 15: {
                return cRU;
            }
            case 7: {
                return cRV;
            }
            case 10: {
                return cRX;
            }
            case 14: {
                return cRY;
            }
            case 6: {
                return cRZ;
            }
        }
        cSa.error((Object)("type inconnu " + n));
        return null;
    }

    public abstract void a(eb_1 var1, eg_2 var2, ef_2 var3, ef_2 var4);

    static void a(ef_2 ef_22, ef_2 ef_23) {
        ef_23.i(ef_22.aIU());
        ef_23.j(ef_22.aIV());
        ef_23.k(ef_22.aIW());
        ef_23.setAlpha(ef_22.aIX());
    }

    static void b(ef_2 ef_22, ef_2 ef_23) {
        ef_23.aw(ef_22.aIT());
        ef_23.g(ef_22.aIQ());
        ef_23.h(ef_22.aIR());
    }

    static void c(ef_2 ef_22, ef_2 ef_23) {
        ef_23.av(ef_22.aIS());
        ef_23.c(ef_22.aIM());
        ef_23.e(ef_22.aIO());
        ef_23.d(ef_22.aIN());
        ef_23.f(ef_22.aIP());
    }

    static void a(ef_2 ef_22, ef_2 ef_23, float[] fArray, int n) {
        ef_23.i(ef_22.aIU() + fArray[n]);
        ef_23.j(ef_22.aIV() + fArray[n + 1]);
        ef_23.k(ef_22.aIW() + fArray[n + 2]);
        ef_23.setAlpha(ef_22.aIX() + fArray[n + 3]);
    }

    static void b(ef_2 ef_22, ef_2 ef_23, float[] fArray, int n) {
        ef_23.i(ef_22.aIU() * fArray[n]);
        ef_23.j(ef_22.aIV() * fArray[n + 1]);
        ef_23.k(ef_22.aIW() * fArray[n + 2]);
        ef_23.setAlpha(ef_22.aIX() * fArray[n + 3]);
    }

    static void a(ef_2 ef_22, ef_2 ef_23, float[] fArray, int n, int n2) {
        ef_23.i(ef_22.aIU() * fArray[n2] + fArray[n]);
        ef_23.j(ef_22.aIV() * fArray[n2 + 1] + fArray[n + 1]);
        ef_23.k(ef_22.aIW() * fArray[n2 + 2] + fArray[n + 2]);
        ef_23.setAlpha(ef_22.aIX() * fArray[n2 + 3] + fArray[n + 3]);
    }

    static void c(ef_2 ef_22, ef_2 ef_23, float[] fArray, int n) {
        ef_23.av(false);
        float f2 = fArray[n];
        float f3 = fArray[n + 1];
        float f4 = fArray[n + 2];
        float f5 = fArray[n + 3];
        if (ef_22.aIS()) {
            ef_23.c(f2);
            ef_23.d(f3);
            ef_23.e(f4);
            ef_23.f(f5);
        } else {
            ef_23.c(f2 * ef_22.aIM() + f3 * ef_22.aIO());
            ef_23.d(f2 * ef_22.aIN() + f3 * ef_22.aIP());
            ef_23.e(f4 * ef_22.aIM() + f5 * ef_22.aIO());
            ef_23.f(f4 * ef_22.aIN() + f5 * ef_22.aIP());
        }
    }

    static void d(ef_2 ef_22, ef_2 ef_23, float[] fArray, int n) {
        ef_23.aw(false);
        float f2 = fArray[n];
        float f3 = fArray[n + 1];
        if (ef_22.aIS()) {
            ef_23.g(f2 + ef_22.aIQ());
            ef_23.h(f3 + ef_22.aIR());
        } else {
            ef_23.g(f2 * ef_22.aIM() + f3 * ef_22.aIO() + ef_22.aIQ());
            ef_23.h(f2 * ef_22.aIN() + f3 * ef_22.aIP() + ef_22.aIR());
        }
    }

    static void a(ef_2 ef_22, ef_2 ef_23, float[] fArray, int n, float[] fArray2, int n2) {
        ef_23.av(false);
        ef_23.aw(false);
        float f2 = fArray[n];
        float f3 = fArray[n + 1];
        float f4 = fArray[n + 2];
        float f5 = fArray[n + 3];
        float f6 = fArray2[n2];
        float f7 = fArray2[n2 + 1];
        float f8 = ef_22.aIQ();
        float f9 = ef_22.aIR();
        if (ef_22.aIS()) {
            ef_23.c(f2);
            ef_23.d(f3);
            ef_23.e(f4);
            ef_23.f(f5);
            ef_23.g(f6 + f8);
            ef_23.h(f7 + f9);
            return;
        }
        float f10 = ef_22.aIM();
        float f11 = ef_22.aIO();
        float f12 = ef_22.aIN();
        float f13 = ef_22.aIP();
        ef_23.c(f2 * f10 + f3 * f11);
        ef_23.d(f2 * f12 + f3 * f13);
        ef_23.e(f4 * f10 + f5 * f11);
        ef_23.f(f4 * f12 + f5 * f13);
        ef_23.g(f6 * f10 + f7 * f11 + f8);
        ef_23.h(f6 * f12 + f7 * f13 + f9);
    }

    private static /* synthetic */ aqx_1[] bHc() {
        return new aqx_1[]{cRK, cRL, cRM, cRN, cRO, cRP, cRQ, cRR, cRS, cRT, cRU, cRV, cRW, cRX, cRY, cRZ};
    }

    static {
        cSb = aqx_1.bHc();
        cSa = Logger.getLogger(aqx_1.class);
    }
}

