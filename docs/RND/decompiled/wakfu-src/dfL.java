/*
 * Decompiled with CFR 0.152.
 */
final class dfL
extends Enum<dfL> {
    public static final /* enum */ dfL oka = new dfL(true, false, false);
    public static final /* enum */ dfL okb = new dfL(true, true, false);
    public static final /* enum */ dfL okc = new dfL(false, true, false);
    public static final /* enum */ dfL okd = new dfL(false, false, true);
    private final boolean oke;
    private final boolean okf;
    private final boolean okg;
    private static final /* synthetic */ dfL[] okh;

    public static dfL[] values() {
        return (dfL[])okh.clone();
    }

    public static dfL valueOf(String string) {
        return Enum.valueOf(dfL.class, string);
    }

    private dfL(boolean bl, boolean bl2, boolean bl3) {
        this.oke = bl;
        this.okf = bl2;
        this.okg = bl3;
    }

    public boolean fcK() {
        return this.oke;
    }

    public boolean fcL() {
        return this.okf;
    }

    public boolean fcM() {
        return this.okg;
    }

    private static /* synthetic */ dfL[] fcN() {
        return new dfL[]{oka, okb, okc, okd};
    }

    static {
        okh = dfL.fcN();
    }
}

