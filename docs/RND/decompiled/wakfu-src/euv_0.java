/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eUV
 */
public final class euv_0
extends Enum<euv_0> {
    public static final /* enum */ euv_0 ryo = new euv_0();
    public static final /* enum */ euv_0 ryp = new euv_0();
    public static final /* enum */ euv_0 ryq = new euv_0();
    public static final /* enum */ euv_0 ryr = new euv_0();
    public static final /* enum */ euv_0 rys = new euv_0();
    public static final /* enum */ euv_0 ryt = new euv_0();
    public static final /* enum */ euv_0 ryu = new euv_0();
    public static final /* enum */ euv_0 ryv = new euv_0();
    public static final /* enum */ euv_0 ryw = new euv_0();
    public static final /* enum */ euv_0 ryx = new euv_0();
    public static final /* enum */ euv_0 ryy = new euv_0();
    public static final /* enum */ euv_0 ryz = new euv_0();
    public static final /* enum */ euv_0 ryA = new euv_0();
    public static final /* enum */ euv_0 ryB = new euv_0();
    public static final /* enum */ euv_0 ryC = new euv_0();
    public static final /* enum */ euv_0 ryD = new euv_0();
    public static final /* enum */ euv_0 ryE = new euv_0();
    public static final /* enum */ euv_0 ryF = new euv_0();
    public static final /* enum */ euv_0 ryG = new euv_0();
    public static final /* enum */ euv_0 ryH = new euv_0();
    public static final /* enum */ euv_0 ryI = new euv_0();
    public static final /* enum */ euv_0 ryJ = new euv_0();
    public static final /* enum */ euv_0 ryK = new euv_0();
    public static final /* enum */ euv_0 ryL = new euv_0();
    public static final /* enum */ euv_0 ryM = new euv_0();
    public static final /* enum */ euv_0 ryN = new euv_0();
    public static final /* enum */ euv_0 ryO = new euv_0();
    public static final /* enum */ euv_0 ryP = new euv_0();
    public static final /* enum */ euv_0 ryQ = new euv_0();
    public static final /* enum */ euv_0 ryR = new euv_0();
    public static final /* enum */ euv_0 ryS = new euv_0();
    public static final /* enum */ euv_0 ryT = new euv_0();
    public static final /* enum */ euv_0 ryU = new euv_0();
    public static final /* enum */ euv_0 ryV = new euv_0();
    public static final /* enum */ euv_0 ryW = new euv_0();
    private static final /* synthetic */ euv_0[] ryX;

    public static euv_0[] values() {
        return (euv_0[])ryX.clone();
    }

    public static euv_0 valueOf(String string) {
        return Enum.valueOf(euv_0.class, string);
    }

    public static byte d(euv_0 euv_02) {
        euv_0[] euv_0Array = euv_0.values();
        for (byte by = 0; by < euv_0Array.length; by = (byte)(by + 1)) {
            euv_0 euv_03 = euv_0Array[by];
            if (euv_02 != euv_03) continue;
            return by;
        }
        return -1;
    }

    public static euv_0 fE(byte by) {
        if (by < 0 || by >= euv_0.values().length) {
            return null;
        }
        return euv_0.values()[by];
    }

    private static /* synthetic */ euv_0[] fML() {
        return new euv_0[]{ryo, ryp, ryq, ryr, rys, ryt, ryu, ryv, ryw, ryx, ryy, ryz, ryA, ryB, ryC, ryD, ryE, ryF, ryG, ryH, ryI, ryJ, ryK, ryL, ryM, ryN, ryO, ryP, ryQ, ryR, ryS, ryT, ryU, ryV, ryW};
    }

    static {
        ryX = euv_0.fML();
    }
}

