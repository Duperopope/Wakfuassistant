/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eSm
 */
public final class esm_0
extends Enum<esm_0> {
    public static final /* enum */ esm_0 rjA = new esm_0(0);
    public static final /* enum */ esm_0 rjB = new esm_0(1);
    private final byte rjC;
    private static final /* synthetic */ esm_0[] rjD;

    public static esm_0[] values() {
        return (esm_0[])rjD.clone();
    }

    public static esm_0 valueOf(String string) {
        return Enum.valueOf(esm_0.class, string);
    }

    private esm_0(byte by) {
        this.rjC = by;
    }

    public byte aJr() {
        return this.rjC;
    }

    private static /* synthetic */ esm_0[] fHK() {
        return new esm_0[]{rjA, rjB};
    }

    static {
        rjD = esm_0.fHK();
    }
}

