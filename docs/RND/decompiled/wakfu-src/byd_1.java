/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bYD
 */
final class byd_1
extends Enum<byd_1> {
    public static final /* enum */ byd_1 lAi = new byd_1("positiveToast");
    public static final /* enum */ byd_1 lAj = new byd_1("neutralToast");
    public static final /* enum */ byd_1 lAk = new byd_1("negativeToast");
    final String lAl;
    private static final /* synthetic */ byd_1[] lAm;

    public static byd_1[] values() {
        return (byd_1[])lAm.clone();
    }

    public static byd_1 valueOf(String string) {
        return Enum.valueOf(byd_1.class, string);
    }

    private byd_1(String string2) {
        this.lAl = string2;
    }

    public String getStyle() {
        return this.lAl;
    }

    private static /* synthetic */ byd_1[] epi() {
        return new byd_1[]{lAi, lAj, lAk};
    }

    static {
        lAm = byd_1.epi();
    }
}

