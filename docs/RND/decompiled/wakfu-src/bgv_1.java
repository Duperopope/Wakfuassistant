/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bGv
 */
public final class bgv_1
extends Enum<bgv_1> {
    public static final /* enum */ bgv_1 jVy = new bgv_1(ffS.sgB);
    public static final /* enum */ bgv_1 jVz = new bgv_1(ffS.sgE);
    public static final /* enum */ bgv_1 jVA = new bgv_1(ffS.sgF);
    public static final /* enum */ bgv_1 jVB = new bgv_1(ffS.sgG);
    public static final /* enum */ bgv_1 jVC = new bgv_1(ffS.sgI);
    public static final /* enum */ bgv_1 jVD = new bgv_1(ffS.sgJ);
    public static final /* enum */ bgv_1 jVE = new bgv_1(ffS.sgL);
    public static final /* enum */ bgv_1 jVF = new bgv_1(ffS.sgN);
    public static final /* enum */ bgv_1 jVG = new bgv_1(ffS.sgO);
    public static final /* enum */ bgv_1 jVH = new bgv_1(ffS.sgQ);
    public static final /* enum */ bgv_1 jVI = new bgv_1(ffS.sgR);
    public static final /* enum */ bgv_1 jVJ = new bgv_1(ffS.sgS);
    public static final /* enum */ bgv_1 jVK = new bgv_1(ffS.sgX);
    public static final /* enum */ bgv_1 jVL = new bgv_1(ffS.sgZ);
    private final ffS jVM;
    private static final /* synthetic */ bgv_1[] jVN;

    public static bgv_1[] values() {
        return (bgv_1[])jVN.clone();
    }

    public static bgv_1 valueOf(String string) {
        return Enum.valueOf(bgv_1.class, string);
    }

    private bgv_1(ffS ffS2) {
        this.jVM = ffS2;
    }

    public static bgv_1 h(ffS ffS2) {
        for (bgv_1 bgv_12 : bgv_1.values()) {
            if (bgv_12.jVM != ffS2) continue;
            return bgv_12;
        }
        return null;
    }

    public ffS dTQ() {
        return this.jVM;
    }

    private static /* synthetic */ bgv_1[] dTU() {
        return new bgv_1[]{jVy, jVz, jVA, jVB, jVC, jVD, jVE, jVF, jVG, jVH, jVI, jVJ, jVK, jVL};
    }

    static {
        jVN = bgv_1.dTU();
    }
}

