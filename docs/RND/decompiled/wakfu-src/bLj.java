/*
 * Decompiled with CFR 0.152.
 */
public final class bLj
extends Enum<bLj> {
    public static final /* enum */ bLj ksa = new bLj(1);
    public static final /* enum */ bLj ksb = new bLj(2);
    public static final /* enum */ bLj ksc = new bLj(3);
    public static final /* enum */ bLj ksd = new bLj(4);
    public static final /* enum */ bLj kse = new bLj(5);
    public static final /* enum */ bLj ksf = new bLj(6);
    public static final /* enum */ bLj ksg = new bLj(7);
    private final short ksh;
    private static final /* synthetic */ bLj[] ksi;

    public static bLj[] values() {
        return (bLj[])ksi.clone();
    }

    public static bLj valueOf(String string) {
        return Enum.valueOf(bLj.class, string);
    }

    private bLj(short s) {
        this.ksh = s;
    }

    public static bLj cb(short s) {
        for (bLj bLj2 : bLj.values()) {
            if (bLj2.ecx() != s) continue;
            return bLj2;
        }
        return ksb;
    }

    public short ecx() {
        return this.ksh;
    }

    private static /* synthetic */ bLj[] ecy() {
        return new bLj[]{ksa, ksb, ksc, ksd, kse, ksf, ksg};
    }

    static {
        ksi = bLj.ecy();
    }
}

