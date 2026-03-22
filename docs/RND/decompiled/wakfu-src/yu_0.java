/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Yu
 */
public abstract sealed class yu_0
extends Enum<yu_0>
permits yv_0, yy_0, yz_0, YA, yb_0, yc_0, yd_0, ye_0, yf_0, yw_0, yx_0 {
    public static final /* enum */ yu_0 bTV = new yv_0();
    public static final /* enum */ yu_0 bTW = new yy_0();
    public static final /* enum */ yu_0 bTX = new yz_0();
    public static final /* enum */ yu_0 bTY = new YA();
    public static final /* enum */ yu_0 bTZ = new yb_0();
    public static final /* enum */ yu_0 bUa = new yc_0();
    public static final /* enum */ yu_0 bUb = new yd_0();
    public static final /* enum */ yu_0 bUc = new ye_0();
    public static final /* enum */ yu_0 bUd = new yf_0();
    public static final /* enum */ yu_0 bUe = new yw_0();
    public static final /* enum */ yu_0 bUf = new yx_0();
    private static final /* synthetic */ yu_0[] bUg;

    public static yu_0[] values() {
        return (yu_0[])bUg.clone();
    }

    public static yu_0 valueOf(String string) {
        return Enum.valueOf(yu_0.class, string);
    }

    public abstract Float a(Number var1, Number var2);

    private static /* synthetic */ yu_0[] bow() {
        return new yu_0[]{bTV, bTW, bTX, bTY, bTZ, bUa, bUb, bUc, bUd, bUe, bUf};
    }

    static {
        bUg = yu_0.bow();
    }
}

