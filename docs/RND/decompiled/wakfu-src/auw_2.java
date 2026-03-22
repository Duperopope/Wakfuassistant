/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from auW
 */
public final class auw_2
extends Enum<auw_2> {
    public static final /* enum */ auw_2 dfH = new auw_2(0);
    public static final /* enum */ auw_2 dfI = new auw_2(1);
    public static final /* enum */ auw_2 dfJ = new auw_2(768);
    public static final /* enum */ auw_2 dfK = new auw_2(769);
    public static final /* enum */ auw_2 dfL = new auw_2(770);
    public static final /* enum */ auw_2 dfM = new auw_2(771);
    public static final /* enum */ auw_2 dfN = new auw_2(774);
    public static final /* enum */ auw_2 dfO = new auw_2(775);
    public static final /* enum */ auw_2 dfP = new auw_2(772);
    public static final /* enum */ auw_2 dfQ = new auw_2(773);
    public static final /* enum */ auw_2 dfR = new auw_2(776);
    public final int dfS;
    private static final /* synthetic */ auw_2[] dfT;

    public static auw_2[] values() {
        return (auw_2[])dfT.clone();
    }

    public static auw_2 valueOf(String string) {
        return Enum.valueOf(auw_2.class, string);
    }

    private auw_2(int n2) {
        this.dfS = n2;
    }

    public static auw_2 uH(int n) {
        for (auw_2 auw_22 : auw_2.values()) {
            if (auw_22.dfS != n) continue;
            return auw_22;
        }
        return dfH;
    }

    private static /* synthetic */ auw_2[] bMz() {
        return new auw_2[]{dfH, dfI, dfJ, dfK, dfL, dfM, dfN, dfO, dfP, dfQ, dfR};
    }

    static {
        dfT = auw_2.bMz();
    }
}

