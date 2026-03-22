/*
 * Decompiled with CFR 0.152.
 */
public final class aIL
extends Enum<aIL>
implements Ye {
    public static final /* enum */ aIL dZc = new aIL(1, Yc.bTG);
    public static final /* enum */ aIL dZd = new aIL(2, Yc.bTG);
    public static final /* enum */ aIL dZe = new aIL(3, Yc.bTG);
    public static final /* enum */ aIL dZf = new aIL(4, Yc.bTG);
    public static final /* enum */ aIL dZg = new aIL(5, Yc.bTG);
    public static final /* enum */ aIL dZh = new aIL(6, Yc.bTG);
    public static final /* enum */ aIL dZi = new aIL(7, Yc.bTG);
    public static final /* enum */ aIL dZj = new aIL(8, Yc.bTG);
    public static final /* enum */ aIL dZk = new aIL(9, Yc.bTG);
    public static final /* enum */ aIL dZl = new aIL(10, Yc.bTG);
    public static final /* enum */ aIL dZm = new aIL(1000, Yc.bTG);
    public static final /* enum */ aIL dZn = new aIL(1001, Yc.bTG);
    public static final /* enum */ aIL dZo = new aIL(1002, Yc.bTG);
    public static final /* enum */ aIL dZp = new aIL(1003, Yc.bTG);
    public static final /* enum */ aIL dZq = new aIL(1004, Yc.bTG);
    public static final /* enum */ aIL dZr = new aIL(1005, Yc.bTG);
    public static final /* enum */ aIL dZs = new aIL(10001, Yc.bTF);
    public static final /* enum */ aIL dZt = new aIL(10002, Yc.bTF);
    public static final /* enum */ aIL dZu = new aIL(10003, Yc.bTF);
    public static final /* enum */ aIL dZv = new aIL(10004, Yc.bTF);
    public static final /* enum */ aIL dZw = new aIL(10005, Yc.bTF);
    public static final /* enum */ aIL dZx = new aIL(10006, Yc.bTF);
    public static final /* enum */ aIL dZy = new aIL(10007, Yc.bTF);
    public static final /* enum */ aIL dZz = new aIL(10008, Yc.bTF);
    public static final /* enum */ aIL dZA = new aIL(10009, Yc.bTF);
    public static final /* enum */ aIL dZB = new aIL(10010, Yc.bTF);
    public static final /* enum */ aIL dZC = new aIL(10011, Yc.bTF);
    public static final /* enum */ aIL dZD = new aIL(10012, Yc.bTF);
    public static final /* enum */ aIL dZE = new aIL(20001, Yc.bTH);
    public static final /* enum */ aIL dZF = new aIL(20003, Yc.bTH);
    public static final /* enum */ aIL dZG = new aIL(20004, Yc.bTH);
    public static final /* enum */ aIL dZH = new aIL(20005, Yc.bTH);
    public static final /* enum */ aIL dZI = new aIL(20007, Yc.bTH);
    public static final /* enum */ aIL dZJ = new aIL(20008, Yc.bTH);
    private final int dZK;
    private final Yc dZL;
    private static final aIM dZM;
    private static final /* synthetic */ aIL[] dZN;

    public static aIL[] values() {
        return (aIL[])dZN.clone();
    }

    public static aIL valueOf(String string) {
        return Enum.valueOf(aIL.class, string);
    }

    public static void cha() {
        aIL[] aILArray = aIL.values();
        for (int i = 0; i < aILArray.length - 1; ++i) {
            for (int j = i + 1; j < aILArray.length; ++j) {
                if (aILArray[i].aHp() != aILArray[j].aHp()) continue;
                throw new Exception(aILArray[i].name() + " et " + aILArray[j].name() + "ont le m\u00eame id");
            }
        }
    }

    private aIL(int n2, Yc yc) {
        this.dZK = n2;
        this.dZL = yc;
    }

    @Override
    public final int aHp() {
        return this.dZK;
    }

    @Override
    public final Yc bol() {
        return this.dZL;
    }

    public static String yE(int n) {
        return dZM.qP(n);
    }

    public static YY a(aIL aIL2) {
        return dZM.a(aIL2);
    }

    public static aIM chb() {
        return dZM;
    }

    private static /* synthetic */ aIL[] chc() {
        return new aIL[]{dZc, dZd, dZe, dZf, dZg, dZh, dZi, dZj, dZk, dZl, dZm, dZn, dZo, dZp, dZq, dZr, dZs, dZt, dZu, dZv, dZw, dZx, dZy, dZz, dZA, dZB, dZC, dZD, dZE, dZF, dZG, dZH, dZI, dZJ};
    }

    static {
        dZN = aIL.chc();
        dZM = new aIM();
    }
}

