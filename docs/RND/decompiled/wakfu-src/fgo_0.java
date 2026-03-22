/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fgo
 */
public final class fgo_0
extends Enum<fgo_0> {
    public static final /* enum */ fgo_0 sjl = new fgo_0();
    public static final /* enum */ fgo_0 sjm = new fgo_0();
    public static final /* enum */ fgo_0 sjn = new fgo_0();
    private static final /* synthetic */ fgo_0[] sjo;

    public static fgo_0[] values() {
        return (fgo_0[])sjo.clone();
    }

    public static fgo_0 valueOf(String string) {
        return Enum.valueOf(fgo_0.class, string);
    }

    private static /* synthetic */ fgo_0[] fXa() {
        return new fgo_0[]{sjl, sjm, sjn};
    }

    static {
        sjo = fgo_0.fXa();
    }
}

