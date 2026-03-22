/*
 * Decompiled with CFR 0.152.
 */
public final class Vf
extends Enum<Vf> {
    public static final /* enum */ Vf bxJ = new Vf();
    public static final /* enum */ Vf bxK = new Vf();
    private static final /* synthetic */ Vf[] bxL;

    public static Vf[] values() {
        return (Vf[])bxL.clone();
    }

    public static Vf valueOf(String string) {
        return Enum.valueOf(Vf.class, string);
    }

    public final byte bkm() {
        return (byte)this.ordinal();
    }

    public static Vf ah(byte by) {
        if (by < 0) {
            return bxJ;
        }
        Vf[] vfArray = Vf.values();
        if (by >= vfArray.length) {
            return bxJ;
        }
        return vfArray[by];
    }

    public static Vf fu(long l) {
        byte by = (byte)(l >>> 56);
        return Vf.ah(by);
    }

    public static Vf dn(String string) {
        if (string == null) {
            return bxJ;
        }
        return Vf.valueOf(string.toUpperCase());
    }

    private static /* synthetic */ Vf[] bkn() {
        return new Vf[]{bxJ, bxK};
    }

    static {
        bxL = Vf.bkn();
    }
}

