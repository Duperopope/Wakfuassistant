/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cbX
 */
public final class cbx_2
extends Enum<cbx_2> {
    public static final /* enum */ cbx_2 lLZ = new cbx_2(0);
    public static final /* enum */ cbx_2 lMa = new cbx_2(1);
    public static final /* enum */ cbx_2 lMb = new cbx_2(2);
    private final int lMc;
    private static final /* synthetic */ cbx_2[] lMd;

    public static cbx_2[] values() {
        return (cbx_2[])lMd.clone();
    }

    public static cbx_2 valueOf(String string) {
        return Enum.valueOf(cbx_2.class, string);
    }

    private cbx_2(int n2) {
        this.lMc = n2;
    }

    public int d() {
        return this.lMc;
    }

    private static /* synthetic */ cbx_2[] esL() {
        return new cbx_2[]{lLZ, lMa, lMb};
    }

    static {
        lMd = cbx_2.esL();
    }
}

