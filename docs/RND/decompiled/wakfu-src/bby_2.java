/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bbY
 */
public final class bby_2
extends Enum<bby_2> {
    public static final /* enum */ bby_2 hCu = new bby_2(1, false, true);
    public static final /* enum */ bby_2 hCv = new bby_2(2, false, true);
    public static final /* enum */ bby_2 hCw = new bby_2(3, false, true);
    public static final /* enum */ bby_2 hCx = new bby_2(4, false, true);
    public static final /* enum */ bby_2 hCy = new bby_2(5, false, true);
    public static final /* enum */ bby_2 hCz = new bby_2(6, true, true);
    public static final /* enum */ bby_2 hCA = new bby_2(7, true, true);
    public static final /* enum */ bby_2 hCB = new bby_2(8, false, true);
    public static final /* enum */ bby_2 hCC = new bby_2(9, false, true);
    public static final /* enum */ bby_2 hCD = new bby_2(10, false, true);
    public static final /* enum */ bby_2 hCE = new bby_2(11, true, true);
    public static final /* enum */ bby_2 hCF = new bby_2(12, false, true);
    public static final /* enum */ bby_2 hCG = new bby_2(13, true, true);
    public static final /* enum */ bby_2 hCH = new bby_2(14, false, false);
    public static final /* enum */ bby_2 hCI = new bby_2(15, false, true);
    public static final /* enum */ bby_2 hCJ = new bby_2(16, false, true);
    public static final /* enum */ bby_2 hCK = new bby_2(17, true, true);
    public static final /* enum */ bby_2 hCL = new bby_2(18, false, false);
    public static final /* enum */ bby_2 hCM = new bby_2(19, false, false);
    private final int hCN;
    private final boolean hCO;
    private final boolean hCP;
    private static bby_2[] hCQ;
    private static final /* synthetic */ bby_2[] hCR;

    public static bby_2[] values() {
        return (bby_2[])hCR.clone();
    }

    public static bby_2 valueOf(String string) {
        return Enum.valueOf(bby_2.class, string);
    }

    private bby_2(int n2, boolean bl, boolean bl2) {
        this.hCN = n2;
        this.hCO = bl;
        this.hCP = bl2;
    }

    public static bby_2 AI(int n) {
        if (hCQ == null) {
            hCQ = bby_2.values();
        }
        for (bby_2 bby_22 : hCQ) {
            if (bby_22.hCN != n) continue;
            return bby_22;
        }
        return null;
    }

    public int d() {
        return this.hCN;
    }

    public boolean day() {
        return this.hCO;
    }

    public boolean brO() {
        return this.hCP;
    }

    private static /* synthetic */ bby_2[] daz() {
        return new bby_2[]{hCu, hCv, hCw, hCx, hCy, hCz, hCA, hCB, hCC, hCD, hCE, hCF, hCG, hCH, hCI, hCJ, hCK, hCL, hCM};
    }

    static {
        hCR = bby_2.daz();
    }
}

