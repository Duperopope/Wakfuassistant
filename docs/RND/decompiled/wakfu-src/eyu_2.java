/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eYU
 */
public final class eyu_2
extends Enum<eyu_2> {
    public static final /* enum */ eyu_2 rLG = new eyu_2(1);
    public static final /* enum */ eyu_2 rLH = new eyu_2(2);
    public static final /* enum */ eyu_2 rLI = new eyu_2(3);
    public static final /* enum */ eyu_2 rLJ = new eyu_2(4);
    public static final /* enum */ eyu_2 rLK = new eyu_2(5);
    public static final /* enum */ eyu_2 rLL = new eyu_2(6);
    public static final /* enum */ eyu_2 rLM = new eyu_2(7);
    public static final /* enum */ eyu_2 rLN = new eyu_2(8);
    public static final /* enum */ eyu_2 rLO = new eyu_2(9);
    public static final /* enum */ eyu_2 rLP = new eyu_2(10);
    private final short rLQ;
    private static final /* synthetic */ eyu_2[] rLR;

    public static eyu_2[] values() {
        return (eyu_2[])rLR.clone();
    }

    public static eyu_2 valueOf(String string) {
        return Enum.valueOf(eyu_2.class, string);
    }

    private eyu_2(short s) {
        this.rLQ = s;
    }

    public short aIi() {
        return this.rLQ;
    }

    private static /* synthetic */ eyu_2[] fQv() {
        return new eyu_2[]{rLG, rLH, rLI, rLJ, rLK, rLL, rLM, rLN, rLO, rLP};
    }

    static {
        rLR = eyu_2.fQv();
    }
}

