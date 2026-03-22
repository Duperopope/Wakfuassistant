/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eUk
 */
public final class euk_0
extends Enum<euk_0> {
    public static final /* enum */ euk_0 rty = new euk_0(1);
    public static final /* enum */ euk_0 rtz = new euk_0(2);
    private final byte rtA;
    private static final /* synthetic */ euk_0[] rtB;

    public static euk_0[] values() {
        return (euk_0[])rtB.clone();
    }

    public static euk_0 valueOf(String string) {
        return Enum.valueOf(euk_0.class, string);
    }

    private euk_0(byte by) {
        this.rtA = by;
    }

    public byte aJr() {
        return this.rtA;
    }

    private static /* synthetic */ euk_0[] fKI() {
        return new euk_0[]{rty, rtz};
    }

    static {
        rtB = euk_0.fKI();
    }
}

