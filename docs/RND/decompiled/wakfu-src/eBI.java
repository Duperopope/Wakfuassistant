/*
 * Decompiled with CFR 0.152.
 */
final class eBI
extends Enum<eBI> {
    public static final /* enum */ eBI pxQ = new eBI();
    public static final /* enum */ eBI pxR = new eBI();
    public static final /* enum */ eBI pxS = new eBI();
    public static final /* enum */ eBI pxT = new eBI();
    private static final /* synthetic */ eBI[] pxU;

    public static eBI[] values() {
        return (eBI[])pxU.clone();
    }

    public static eBI valueOf(String string) {
        return Enum.valueOf(eBI.class, string);
    }

    private static /* synthetic */ eBI[] fnG() {
        return new eBI[]{pxQ, pxR, pxS, pxT};
    }

    static {
        pxU = eBI.fnG();
    }
}

