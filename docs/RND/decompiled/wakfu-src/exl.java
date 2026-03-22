/*
 * Decompiled with CFR 0.152.
 */
public final class exl
extends Enum<exl> {
    public static final /* enum */ exl oWB = new exl(0);
    public static final /* enum */ exl oWC = new exl(1);
    public static final /* enum */ exl oWD = new exl(2);
    public static final /* enum */ exl oWE = new exl(3);
    public static final /* enum */ exl oWF = new exl(4);
    public static final /* enum */ exl oWG = new exl(5);
    public static final /* enum */ exl oWH = new exl(6);
    public static final /* enum */ exl oWI = new exl(7);
    public static final /* enum */ exl oWJ = new exl(8);
    public static final /* enum */ exl oWK = new exl(9);
    public static final /* enum */ exl oWL = new exl(10);
    public static final /* enum */ exl oWM = new exl(11);
    public static final /* enum */ exl oWN = new exl(12);
    public static final /* enum */ exl oWO = new exl(13);
    public static final /* enum */ exl oWP = new exl(14);
    public static final /* enum */ exl oWQ = new exl(15);
    public static final /* enum */ exl oWR = new exl(16);
    public static final /* enum */ exl oWS = new exl(17);
    public static final /* enum */ exl oWT = new exl(18);
    public static final /* enum */ exl oWU = new exl(19);
    public static final /* enum */ exl oWV = new exl(20);
    private final int oWW;
    private static final /* synthetic */ exl[] oWX;

    public static exl[] values() {
        return (exl[])oWX.clone();
    }

    public static exl valueOf(String string) {
        return Enum.valueOf(exl.class, string);
    }

    public static exl Oz(int n) {
        for (exl exl2 : exl.values()) {
            if (exl2.oWW != n) continue;
            return exl2;
        }
        return null;
    }

    private exl(int n2) {
        this.oWW = n2;
    }

    public int d() {
        return this.oWW;
    }

    private static /* synthetic */ exl[] ffr() {
        return new exl[]{oWB, oWC, oWD, oWE, oWF, oWG, oWH, oWI, oWJ, oWK, oWL, oWM, oWN, oWO, oWP, oWQ, oWR, oWS, oWT, oWU, oWV};
    }

    static {
        oWX = exl.ffr();
    }
}

