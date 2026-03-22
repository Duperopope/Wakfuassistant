/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from abu
 */
public abstract sealed class abu_0
extends Enum<abu_0>
permits abv_0, abw_0, abx_0, aby_0 {
    public static final /* enum */ abu_0 cdw = new abv_0();
    public static final /* enum */ abu_0 cdx = new abw_0();
    public static final /* enum */ abu_0 cdy = new abx_0();
    public static final /* enum */ abu_0 cdz = new aby_0();
    private static final /* synthetic */ abu_0[] cdA;

    public static abu_0[] values() {
        return (abu_0[])cdA.clone();
    }

    public static abu_0 valueOf(String string) {
        return Enum.valueOf(abu_0.class, string);
    }

    abstract boolean bsZ();

    abstract boolean bta();

    private static /* synthetic */ abu_0[] btb() {
        return new abu_0[]{cdw, cdx, cdy, cdz};
    }

    static {
        cdA = abu_0.btb();
    }
}

