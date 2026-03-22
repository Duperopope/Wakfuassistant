/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Kl
 */
public final class kl_1
extends Enum<kl_1> {
    public static final /* enum */ kl_1 aLn = new kl_1();
    public static final /* enum */ kl_1 aLo = new kl_1();
    public static final /* enum */ kl_1 aLp = new kl_1();
    public static final /* enum */ kl_1 aLq = new kl_1();
    private static final /* synthetic */ kl_1[] aLr;

    public static kl_1[] values() {
        return (kl_1[])aLr.clone();
    }

    public static kl_1 valueOf(String string) {
        return Enum.valueOf(kl_1.class, string);
    }

    public byte aPy() {
        return (byte)this.ordinal();
    }

    public static kl_1 m(byte by) {
        return kl_1.values()[by];
    }

    private static /* synthetic */ kl_1[] aPz() {
        return new kl_1[]{aLn, aLo, aLp, aLq};
    }

    static {
        aLr = kl_1.aPz();
    }
}

