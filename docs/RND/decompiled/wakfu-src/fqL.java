/*
 * Decompiled with CFR 0.152.
 */
public final class fqL
extends Enum<fqL> {
    public static final /* enum */ fqL sVB = new fqL(0);
    public static final /* enum */ fqL sVC = new fqL(1);
    public static final /* enum */ fqL sVD = new fqL(2);
    private final byte sVE;
    private static final /* synthetic */ fqL[] sVF;

    public static fqL[] values() {
        return (fqL[])sVF.clone();
    }

    public static fqL valueOf(String string) {
        return Enum.valueOf(fqL.class, string);
    }

    private fqL(byte by) {
        this.sVE = by;
    }

    public byte aJr() {
        return this.sVE;
    }

    private static /* synthetic */ fqL[] giW() {
        return new fqL[]{sVB, sVC, sVD};
    }

    static {
        sVF = fqL.giW();
    }
}

