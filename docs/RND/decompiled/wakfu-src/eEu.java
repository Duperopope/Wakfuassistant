/*
 * Decompiled with CFR 0.152.
 */
public final class eEu
extends Enum<eEu> {
    public static final /* enum */ eEu pBK = new eEu();
    public static final /* enum */ eEu pBL = new eEu();
    private static final /* synthetic */ eEu[] pBM;

    public static eEu[] values() {
        return (eEu[])pBM.clone();
    }

    public static eEu valueOf(String string) {
        return Enum.valueOf(eEu.class, string);
    }

    private static /* synthetic */ eEu[] fnU() {
        return new eEu[]{pBK, pBL};
    }

    static {
        pBM = eEu.fnU();
    }
}

