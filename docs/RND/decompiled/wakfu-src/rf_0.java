/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Rf
 */
public final class rf_0
extends Enum<rf_0>
implements re_0 {
    public static final /* enum */ rf_0 bjL = new rf_0(0);
    public static final /* enum */ rf_0 bjM = new rf_0(1);
    public static final /* enum */ rf_0 bjN = new rf_0(2);
    public static final /* enum */ rf_0 bjO = new rf_0(3);
    public static final /* enum */ rf_0 bjP = new rf_0(4);
    private final byte bjQ;
    private static final /* synthetic */ rf_0[] bjR;

    public static rf_0[] values() {
        return (rf_0[])bjR.clone();
    }

    public static rf_0 valueOf(String string) {
        return Enum.valueOf(rf_0.class, string);
    }

    private rf_0(int n2) {
        this.bjQ = (byte)n2;
    }

    @Override
    public byte aJr() {
        return this.bjQ;
    }

    public ra_0<rf_0> T(short s) {
        return new ra_0<rf_0>(this, s);
    }

    private static /* synthetic */ rf_0[] bds() {
        return new rf_0[]{bjL, bjM, bjN, bjO, bjP};
    }

    static {
        bjR = rf_0.bds();
    }
}

