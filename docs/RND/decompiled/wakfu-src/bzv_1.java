/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZv
 */
public final class bzv_1
extends Enum<bzv_1> {
    public static final /* enum */ bzv_1 lDd = new bzv_1(-1.0f);
    public static final /* enum */ bzv_1 lDe = new bzv_1(1.0f);
    public static final /* enum */ bzv_1 lDf = new bzv_1(-1.0f);
    public static final /* enum */ bzv_1 lDg = new bzv_1(1.0f);
    private final float lDh;
    private static final /* synthetic */ bzv_1[] lDi;

    public static bzv_1[] values() {
        return (bzv_1[])lDi.clone();
    }

    public static bzv_1 valueOf(String string) {
        return Enum.valueOf(bzv_1.class, string);
    }

    private bzv_1(float f2) {
        this.lDh = f2;
    }

    float epX() {
        return this.lDh;
    }

    private static /* synthetic */ bzv_1[] epY() {
        return new bzv_1[]{lDd, lDe, lDf, lDg};
    }

    static {
        lDi = bzv_1.epY();
    }
}

