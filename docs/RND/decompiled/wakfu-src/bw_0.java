/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from BW
 */
public abstract sealed class bw_0
extends Enum<bw_0>
permits bx_0, Cf, Cg, Ch, Ci, Cj, Ck, Cl, Cm, by_0, bz_0, Ca, Cb, Cc, Cd, Ce {
    public static final /* enum */ bw_0 awp = new bx_0();
    public static final /* enum */ bw_0 awq = new Cf();
    public static final /* enum */ bw_0 awr = new Cg();
    public static final /* enum */ bw_0 aws = new Ch();
    public static final /* enum */ bw_0 awt = new Ci();
    public static final /* enum */ bw_0 awu = new Cj();
    public static final /* enum */ bw_0 awv = new Ck();
    public static final /* enum */ bw_0 aww = new Cl();
    public static final /* enum */ bw_0 awx = new Cm();
    public static final /* enum */ bw_0 awy = new by_0();
    public static final /* enum */ bw_0 awz = new bz_0();
    public static final /* enum */ bw_0 awA = new Ca();
    public static final /* enum */ bw_0 awB = new Cb();
    public static final /* enum */ bw_0 awC = new Cc();
    public static final /* enum */ bw_0 awD = new Cd();
    public static final /* enum */ bw_0 awE = new Ce();
    private static final Logger awF;
    private static final /* synthetic */ bw_0[] awG;

    public static bw_0[] values() {
        return (bw_0[])awG.clone();
    }

    public static bw_0 valueOf(String string) {
        return Enum.valueOf(bw_0.class, string);
    }

    public static bw_0 mo(int n) {
        switch (n) {
            case 3: {
                return awx;
            }
            case 2: {
                return awB;
            }
            case 0: {
                return awp;
            }
            case 8: {
                return awq;
            }
            case 12: {
                return awr;
            }
            case 4: {
                return aws;
            }
            case 1: {
                return awt;
            }
            case 9: {
                return awu;
            }
            case 13: {
                return awv;
            }
            case 5: {
                return aww;
            }
            case 11: {
                return awy;
            }
            case 15: {
                return awz;
            }
            case 7: {
                return awA;
            }
            case 10: {
                return awC;
            }
            case 14: {
                return awD;
            }
            case 6: {
                return awE;
            }
        }
        awF.error((Object)("type inconnu " + n));
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

    private static /* synthetic */ bw_0[] aIc() {
        return new bw_0[]{awp, awq, awr, aws, awt, awu, awv, aww, awx, awy, awz, awA, awB, awC, awD, awE};
    }

    static {
        awG = bw_0.aIc();
        awF = Logger.getLogger(bw_0.class);
    }
}

