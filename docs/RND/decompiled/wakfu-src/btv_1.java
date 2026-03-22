/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bTv
 */
final class btv_1
extends Enum<btv_1> {
    public static final /* enum */ btv_1 lot = new btv_1("NPTabNorthRadioButton", 304);
    public static final /* enum */ btv_1 lou = new btv_1("NPTabNorthLeftRadioButton", 303);
    public static final /* enum */ btv_1 lov = new btv_1("NPTabNorthMiddleRadioButton", 302);
    public static final /* enum */ btv_1 low = new btv_1("NPTabNorthRightRadioButton", 303);
    final String lox;
    final int loy;
    private static final /* synthetic */ btv_1[] loz;

    public static btv_1[] values() {
        return (btv_1[])loz.clone();
    }

    public static btv_1 valueOf(String string) {
        return Enum.valueOf(btv_1.class, string);
    }

    private btv_1(String string2, int n2) {
        this.lox = string2;
        this.loy = n2;
    }

    private static /* synthetic */ btv_1[] enG() {
        return new btv_1[]{lot, lou, lov, low};
    }

    static {
        loz = btv_1.enG();
    }
}

