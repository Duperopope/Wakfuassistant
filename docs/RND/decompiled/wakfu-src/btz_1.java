/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bTz
 */
final class btz_1
extends Enum<btz_1> {
    public static final /* enum */ btz_1 lpo = new btz_1("NPTabNorthRadioButton", 144);
    public static final /* enum */ btz_1 lpp = new btz_1("NPTabNorthLeftRadioButton", 143);
    public static final /* enum */ btz_1 lpq = new btz_1("NPTabNorthMiddleRadioButton", 142);
    public static final /* enum */ btz_1 lpr = new btz_1("NPTabNorthRightRadioButton", 143);
    final String lps;
    final int lpt;
    private static final /* synthetic */ btz_1[] lpu;

    public static btz_1[] values() {
        return (btz_1[])lpu.clone();
    }

    public static btz_1 valueOf(String string) {
        return Enum.valueOf(btz_1.class, string);
    }

    private btz_1(String string2, int n2) {
        this.lps = string2;
        this.lpt = n2;
    }

    private static /* synthetic */ btz_1[] enX() {
        return new btz_1[]{lpo, lpp, lpq, lpr};
    }

    static {
        lpu = btz_1.enX();
    }
}

